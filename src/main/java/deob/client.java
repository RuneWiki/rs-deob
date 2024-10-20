package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;

public final class client extends class32 implements class365, OAuthApi {

    @ObfuscatedName("client.w")
    public static class191[] field629;

    @ObfuscatedName("client.as")
    public static boolean field522 = true;

    @ObfuscatedName("client.be")
    public static int field697 = 1;

    @ObfuscatedName("client.bz")
    public static int field478 = 0;

    @ObfuscatedName("client.bf")
    public static int field479 = 0;

    @ObfuscatedName("client.bn")
    public static boolean field480 = false;

    @ObfuscatedName("client.bq")
    public static boolean field701 = false;

    @ObfuscatedName("client.bh")
    public static int field483 = -1;

    @ObfuscatedName("client.bs")
    public static int field766 = -1;

    @ObfuscatedName("client.bk")
    public static int field485 = -1;

    @ObfuscatedName("client.bb")
    public static boolean field578 = false;

    @ObfuscatedName("client.cq")
    public static int field487 = 0;

    @ObfuscatedName("client.ch")
    public static boolean field492 = true;

    @ObfuscatedName("client.dm")
    public static int field552 = 0;

    @ObfuscatedName("client.dd")
    public static long field491 = 1L;

    @ObfuscatedName("client.dr")
    public static int field606 = -1;

    @ObfuscatedName("client.dv")
    public static int field648 = -1;

    @ObfuscatedName("client.dy")
    public static long field663 = -1L;

    @ObfuscatedName("client.ds")
    public static boolean field747 = true;

    @ObfuscatedName("client.dg")
    public static int field673 = 0;

    @ObfuscatedName("client.dp")
    public static int field497 = 0;

    @ObfuscatedName("client.dx")
    public static int field594 = 0;

    @ObfuscatedName("client.dl")
    public static int field499 = 0;

    @ObfuscatedName("client.dc")
    public static int field500 = 0;

    @ObfuscatedName("client.dn")
    public static int field758 = 0;

    @ObfuscatedName("client.do")
    public static int field502 = 0;

    @ObfuscatedName("client.dq")
    public static int field503 = 0;

    @ObfuscatedName("client.dt")
    public static int field504 = 0;

    @ObfuscatedName("client.di")
    public static class95 field505 = class95.field1288;

    @ObfuscatedName("client.da")
    public static class95 field709 = class95.field1288;

    @ObfuscatedName("client.db")
    public static int field507 = 0;

    @ObfuscatedName("client.ew")
    public static int field509 = 0;

    @ObfuscatedName("client.ej")
    public static int field622 = 0;

    @ObfuscatedName("client.et")
    public static int field511 = 0;

    @ObfuscatedName("client.fr")
    public static int field512 = 0;

    @ObfuscatedName("client.fz")
    public static int field513 = 0;

    @ObfuscatedName("client.fh")
    public static int field610 = 0;

    @ObfuscatedName("client.fw")
    public static int field515 = 0;

    @ObfuscatedName("client.fb")
    public static class125 field516 = class125.field1544;

    @ObfuscatedName("client.fn")
    public static class447 field517 = class447.field4752;

    @ObfuscatedName("client.fi")
    public String field519;

    @ObfuscatedName("client.fe")
    public class15 field520;

    @ObfuscatedName("client.fu")
    public class20 field521;

    @ObfuscatedName("client.fs")
    public OtlTokenRequester field734;

    @ObfuscatedName("client.fk")
    public Future field612;

    @ObfuscatedName("client.fj")
    public boolean field524 = false;

    @ObfuscatedName("client.ft")
    public class20 field525;

    @ObfuscatedName("client.fx")
    public RefreshAccessTokenRequester field674;

    @ObfuscatedName("client.fd")
    public Future field527;

    @ObfuscatedName("client.fq")
    public static final String field528;

    @ObfuscatedName("client.gp")
    public static boolean field529;

    @ObfuscatedName("client.gc")
    public static class71 field530;

    @ObfuscatedName("client.gn")
    public class443 field532;

    @ObfuscatedName("client.go")
    public class8 field533;

    @ObfuscatedName("client.gz")
    public long field708 = -1L;

    @ObfuscatedName("client.gw")
    public static byte[] field535;

    @ObfuscatedName("client.gy")
    public static class92[] field742;

    @ObfuscatedName("client.ga")
    public static int field537;

    @ObfuscatedName("client.gq")
    public static int[] field707;

    @ObfuscatedName("client.gm")
    public static int field539;

    @ObfuscatedName("client.gg")
    public static int[] field540;

    @ObfuscatedName("client.gh")
    public static final class100 field541;

    @ObfuscatedName("client.hk")
    public static int field542;

    @ObfuscatedName("client.hs")
    public static boolean field543;

    @ObfuscatedName("client.hy")
    public static class355 field544;

    @ObfuscatedName("client.hl")
    public static HashMap field545;

    @ObfuscatedName("client.ht")
    public static int field695;

    @ObfuscatedName("client.hg")
    public static int field547;

    @ObfuscatedName("client.hn")
    public static int field548;

    @ObfuscatedName("client.hm")
    public static int field549;

    @ObfuscatedName("client.ho")
    public static int field550;

    @ObfuscatedName("client.is")
    public static boolean field560;

    @ObfuscatedName("client.ie")
    public static int[][][] field496;

    @ObfuscatedName("client.il")
    public static final int[] field583;

    @ObfuscatedName("client.im")
    public static int field556;

    @ObfuscatedName("client.ia")
    public static int field557;

    @ObfuscatedName("client.ii")
    public static int field654;

    @ObfuscatedName("client.ib")
    public static int field559;

    @ObfuscatedName("client.ip")
    public static int field554;

    @ObfuscatedName("client.it")
    public static String field581;

    @ObfuscatedName("client.id")
    public static boolean field561;

    @ObfuscatedName("client.ja")
    public static int field562;

    @ObfuscatedName("client.jh")
    public static int field563;

    @ObfuscatedName("client.jz")
    public static int field564;

    @ObfuscatedName("client.jq")
    public static int field565;

    @ObfuscatedName("client.jv")
    public static int field566;

    @ObfuscatedName("client.jd")
    public static int field567;

    @ObfuscatedName("client.jp")
    public static int field685;

    @ObfuscatedName("client.je")
    public static int field770;

    @ObfuscatedName("client.jg")
    public static int field570;

    @ObfuscatedName("client.jk")
    public static int field571;

    @ObfuscatedName("client.ji")
    public static int field572;

    @ObfuscatedName("client.jo")
    public static int field573;

    @ObfuscatedName("client.jf")
    public static int field574;

    @ObfuscatedName("client.jr")
    public static int field575;

    @ObfuscatedName("client.js")
    public static int field636;

    @ObfuscatedName("client.kp")
    public static boolean field534;

    @ObfuscatedName("client.kr")
    public static int field494;

    @ObfuscatedName("client.kd")
    public static boolean field579;

    @ObfuscatedName("client.kf")
    public static int field682;

    @ObfuscatedName("client.ki")
    public static int field666;

    @ObfuscatedName("client.kt")
    public static int field582;

    @ObfuscatedName("client.kk")
    public static int[] field694;

    @ObfuscatedName("client.kb")
    public static int[] field584;

    @ObfuscatedName("client.ke")
    public static int[] field490;

    @ObfuscatedName("client.kh")
    public static int[] field586;

    @ObfuscatedName("client.ku")
    public static int[] field587;

    @ObfuscatedName("client.kn")
    public static int[] field577;

    @ObfuscatedName("client.kw")
    public static int[] field762;

    @ObfuscatedName("client.kq")
    public static String[] field773;

    @ObfuscatedName("client.kc")
    public static int[][] field591;

    @ObfuscatedName("client.kg")
    public static int field592;

    @ObfuscatedName("client.ka")
    public static int field593;

    @ObfuscatedName("client.kx")
    public static int field646;

    @ObfuscatedName("client.ko")
    public static int field595;

    @ObfuscatedName("client.kz")
    public static int field596;

    @ObfuscatedName("client.kj")
    public static int field486;

    @ObfuscatedName("client.kl")
    public static int field598;

    @ObfuscatedName("client.km")
    public static boolean field599;

    @ObfuscatedName("client.kv")
    public static int field600;

    @ObfuscatedName("client.ks")
    public static int field601;

    @ObfuscatedName("client.lh")
    public static int field692;

    @ObfuscatedName("client.lt")
    public static int field660;

    @ObfuscatedName("client.ls")
    public static int field604;

    @ObfuscatedName("client.lv")
    public static int field605;

    @ObfuscatedName("client.lw")
    public static boolean field706;

    @ObfuscatedName("client.lq")
    public static int field741;

    @ObfuscatedName("client.ln")
    public static int field608;

    @ObfuscatedName("client.lj")
    public static boolean field597;

    @ObfuscatedName("client.ly")
    public static class85[] field643;

    @ObfuscatedName("client.lg")
    public static int field611;

    @ObfuscatedName("client.la")
    public static int field602;

    @ObfuscatedName("client.lp")
    public static long field613;

    @ObfuscatedName("client.lz")
    public static boolean field614;

    @ObfuscatedName("client.lk")
    public static int field671;

    @ObfuscatedName("client.li")
    public static int field616;

    @ObfuscatedName("client.ld")
    public static int[] field617;

    @ObfuscatedName("client.mx")
    public static final int[] field618;

    @ObfuscatedName("client.mb")
    public static String[] field546;

    @ObfuscatedName("client.ml")
    public static boolean[] field620;

    @ObfuscatedName("client.mr")
    public static int[] field621;

    @ObfuscatedName("client.mj")
    public static int field727;

    @ObfuscatedName("client.mk")
    public static class334[][][] field623;

    @ObfuscatedName("client.mn")
    public static class334 field624;

    @ObfuscatedName("client.me")
    public static class334 field625;

    @ObfuscatedName("client.mo")
    public static class334 field495;

    @ObfuscatedName("client.mt")
    public static int[] field568;

    @ObfuscatedName("client.mw")
    public static int[] field628;

    @ObfuscatedName("client.mq")
    public static int[] field514;

    @ObfuscatedName("client.ma")
    public static int field630;

    @ObfuscatedName("client.mm")
    public static boolean field631;

    @ObfuscatedName("client.md")
    public static int field632;

    @ObfuscatedName("client.mf")
    public static int[] field633;

    @ObfuscatedName("client.mg")
    public static int[] field634;

    @ObfuscatedName("client.my")
    public static int[] field635;

    @ObfuscatedName("client.mv")
    public static int[] field523;

    @ObfuscatedName("client.mi")
    public static String[] field637;

    @ObfuscatedName("client.nv")
    public static String[] field638;

    @ObfuscatedName("client.ng")
    public static boolean[] field651;

    @ObfuscatedName("client.no")
    public static boolean field640;

    @ObfuscatedName("client.nh")
    public static boolean field659;

    @ObfuscatedName("client.nj")
    public static boolean field642;

    @ObfuscatedName("client.ne")
    public static boolean field751;

    @ObfuscatedName("client.nn")
    public static int field644;

    @ObfuscatedName("client.nq")
    public static int field645;

    @ObfuscatedName("client.nl")
    public static int field639;

    @ObfuscatedName("client.np")
    public static int field647;

    @ObfuscatedName("client.nw")
    public static int field555;

    @ObfuscatedName("client.nd")
    public static boolean field650;

    @ObfuscatedName("client.nz")
    public static int field731;

    @ObfuscatedName("client.ns")
    public static int field652;

    @ObfuscatedName("client.nx")
    public static String field653;

    @ObfuscatedName("client.ni")
    public static String field510;

    @ObfuscatedName("client.ny")
    public static int field655;

    @ObfuscatedName("client.nu")
    public static class420 field656;

    @ObfuscatedName("client.or")
    public static int field657;

    @ObfuscatedName("client.oj")
    public static int field658;

    @ObfuscatedName("client.ol")
    public static int field576;

    @ObfuscatedName("client.on")
    public static int field677;

    @ObfuscatedName("client.ot")
    public static class294 field661;

    @ObfuscatedName("client.oi")
    public static int field641;

    @ObfuscatedName("client.om")
    public static int field615;

    @ObfuscatedName("client.op")
    public static int field664;

    @ObfuscatedName("client.ov")
    public static int field488;

    @ObfuscatedName("client.oc")
    public static boolean field714;

    @ObfuscatedName("client.ou")
    public static class294 field667;

    @ObfuscatedName("client.oo")
    public static class294 field484;

    @ObfuscatedName("client.oa")
    public static class294 field669;

    @ObfuscatedName("client.ob")
    public static int field670;

    @ObfuscatedName("client.ow")
    public static int field626;

    @ObfuscatedName("client.oq")
    public static class294 field672;

    @ObfuscatedName("client.oh")
    public static boolean field768;

    @ObfuscatedName("client.og")
    public static int field665;

    @ObfuscatedName("client.os")
    public static int field551;

    @ObfuscatedName("client.od")
    public static boolean field676;

    @ObfuscatedName("client.ox")
    public static int field776;

    @ObfuscatedName("client.oe")
    public static int field678;

    @ObfuscatedName("client.oy")
    public static boolean field679;

    @ObfuscatedName("client.pt")
    public static int field680;

    @ObfuscatedName("client.pg")
    public static int[] field681;

    @ObfuscatedName("client.pn")
    public static int field607;

    @ObfuscatedName("client.pa")
    public static int[] field683;

    @ObfuscatedName("client.ph")
    public static int field684;

    @ObfuscatedName("client.pr")
    public static int[] field757;

    @ObfuscatedName("client.pf")
    public static int field686;

    @ObfuscatedName("client.pz")
    public static int[] field687;

    @ObfuscatedName("client.pu")
    public static int field688;

    @ObfuscatedName("client.pj")
    public static int field689;

    @ObfuscatedName("client.pv")
    public static int field690;

    @ObfuscatedName("client.pc")
    public static int field691;

    @ObfuscatedName("client.py")
    public static int field526;

    @ObfuscatedName("client.po")
    public static int field693;

    @ObfuscatedName("client.ps")
    public static int field481;

    @ObfuscatedName("client.px")
    public static int field662;

    @ObfuscatedName("client.pp")
    public static int field696;

    @ObfuscatedName("client.qo")
    public static int field719;

    @ObfuscatedName("client.qf")
    public static class334 field698;

    @ObfuscatedName("client.qm")
    public static class334 field699;

    @ObfuscatedName("client.qi")
    public static class334 field700;

    @ObfuscatedName("client.qq")
    public static class420 field569;

    @ObfuscatedName("client.qr")
    public static int field702;

    @ObfuscatedName("client.qh")
    public static int field703;

    @ObfuscatedName("client.qn")
    public static boolean[] field704;

    @ObfuscatedName("client.qy")
    public static boolean[] field705;

    @ObfuscatedName("client.qu")
    public static boolean[] field752;

    @ObfuscatedName("client.qe")
    public static int[] field501;

    @ObfuscatedName("client.qb")
    public static int[] field508;

    @ObfuscatedName("client.qs")
    public static int[] field590;

    @ObfuscatedName("client.qv")
    public static int[] field710;

    @ObfuscatedName("client.qg")
    public static int field711;

    @ObfuscatedName("client.qj")
    public static long field712;

    @ObfuscatedName("client.qz")
    public static boolean field713;

    @ObfuscatedName("client.rd")
    public static int[] field774;

    @ObfuscatedName("client.rn")
    public static int field715;

    @ObfuscatedName("client.rt")
    public static int field716;

    @ObfuscatedName("client.ru")
    public static String field717;

    @ObfuscatedName("client.rj")
    public static long[] field718;

    @ObfuscatedName("client.rv")
    public static int field609;

    @ObfuscatedName("client.rk")
    public static int field720;

    @ObfuscatedName("client.rm")
    public static int[] field721;

    @ObfuscatedName("client.rw")
    public static int[] field722;

    @ObfuscatedName("client.rc")
    public static long field729;

    @ObfuscatedName("client.rh")
    public static class140[] field724;

    @ObfuscatedName("client.rq")
    public static class149[] field725;

    @ObfuscatedName("client.ra")
    public static int field726;

    @ObfuscatedName("client.rg")
    public static int field649;

    @ObfuscatedName("client.ry")
    public static int[] field728;

    @ObfuscatedName("client.rs")
    public static int[] field477;

    @ObfuscatedName("client.re")
    public static class456[] field730;

    @ObfuscatedName("client.rr")
    public static int field493;

    @ObfuscatedName("client.sc")
    public static int field732;

    @ObfuscatedName("client.su")
    public static int field733;

    @ObfuscatedName("client.sq")
    public static int field743;

    @ObfuscatedName("client.sh")
    public static boolean field735;

    @ObfuscatedName("client.st")
    public static int field489;

    @ObfuscatedName("client.sn")
    public static int[] field737;

    @ObfuscatedName("client.so")
    public static int[] field738;

    @ObfuscatedName("client.sd")
    public static int[] field739;

    @ObfuscatedName("client.sv")
    public static int[] field740;

    @ObfuscatedName("client.sj")
    public static class37[] field619;

    @ObfuscatedName("client.sy")
    public static boolean field760;

    @ObfuscatedName("client.tt")
    public static boolean field668;

    @ObfuscatedName("client.ti")
    public static boolean[] field744;

    @ObfuscatedName("client.tg")
    public static int[] field763;

    @ObfuscatedName("client.tz")
    public static int[] field746;

    @ObfuscatedName("client.tp")
    public static int[] field538;

    @ObfuscatedName("client.ts")
    public static int[] field748;

    @ObfuscatedName("client.tc")
    public static short field749;

    @ObfuscatedName("client.tw")
    public static short field750;

    @ObfuscatedName("client.td")
    public static short field553;

    @ObfuscatedName("client.tl")
    public static short field603;

    @ObfuscatedName("client.tb")
    public static short field753;

    @ObfuscatedName("client.tu")
    public static short field754;

    @ObfuscatedName("client.uh")
    public static short field755;

    @ObfuscatedName("client.ud")
    public static short field756;

    @ObfuscatedName("client.uv")
    public static int field558;

    @ObfuscatedName("client.um")
    public static int field736;

    @ObfuscatedName("client.uk")
    public static int field759;

    @ObfuscatedName("client.un")
    public static int field506;

    @ObfuscatedName("client.ux")
    public static int field761;

    @ObfuscatedName("client.uf")
    public static class292 field588;

    @ObfuscatedName("client.ub")
    public static int field536;

    @ObfuscatedName("client.ue")
    public static int field764;

    @ObfuscatedName("client.uc")
    public static class413 field765;

    @ObfuscatedName("client.ul")
    public static class324[] field723;

    @ObfuscatedName("client.uy")
    public static class60 field767;

    @ObfuscatedName("client.ut")
    public static class256 field498;

    @ObfuscatedName("client.ua")
    public static class256 field769;

    @ObfuscatedName("client.uo")
    public static int field589;

    @ObfuscatedName("client.ve")
    public static int field771;

    @ObfuscatedName("client.vq")
    public static ArrayList field772;

    @ObfuscatedName("client.vl")
    public static int field580;

    @ObfuscatedName("client.vv")
    public static int field627;

    @ObfuscatedName("client.vz")
    public static final class59 field775;

    @ObfuscatedName("client.vj")
    public static int[] field675;

    @ObfuscatedName("client.vf")
    public static int[] field777;

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
        byte[] var4 = var1;
        int var5 = var1.length;
        StringBuilder var6 = new StringBuilder();
        for (int var7 = 0; var7 < var5; var7 += 3) {
            int var8 = var4[var7] & 0xFF;
            var6.append(class342.field4147[var8 >>> 2]);
            if (var7 < var5 - 1) {
                int var9 = var4[var7 + 1] & 0xFF;
                var6.append(class342.field4147[(var8 & 0x3) << 4 | var9 >>> 4]);
                if (var7 < var5 - 2) {
                    int var10 = var4[var7 + 2] & 0xFF;
                    var6.append(class342.field4147[(var9 & 0xF) << 2 | var10 >>> 6]).append(class342.field4147[var10 & 0x3F]);
                } else {
                    var6.append(class342.field4147[(var9 & 0xF) << 2]).append("=");
                }
            } else {
                var6.append(class342.field4147[(var8 & 0x3) << 4]).append("==");
            }
        }
        String var11 = var6.toString();
        field528 = var11;
        field529 = false;
        field530 = new class71();
        field535 = null;
        field742 = new class92[32768];
        field537 = 0;
        field707 = new int[32768];
        field539 = 0;
        field540 = new int[250];
        field541 = new class100();
        field542 = 0;
        field543 = false;
        field544 = new class355();
        field545 = new HashMap();
        field695 = 0;
        field547 = 1;
        field548 = 0;
        field549 = 1;
        field550 = 0;
        field629 = new class191[4];
        field560 = false;
        field496 = new int[4][13][13];
        field583 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field556 = 0;
        field557 = 2301979;
        field654 = 5063219;
        field559 = 3353893;
        field554 = 7759444;
        field561 = false;
        field562 = 0;
        field563 = 128;
        field564 = 0;
        field565 = 0;
        field566 = 0;
        field567 = 0;
        field685 = 0;
        field770 = 0;
        field570 = 50;
        field571 = 0;
        field572 = 0;
        field573 = 0;
        field574 = 12;
        field575 = 6;
        field636 = 0;
        field534 = false;
        field494 = 0;
        field579 = false;
        field682 = 0;
        field666 = 0;
        field582 = 50;
        field694 = new int[field582];
        field584 = new int[field582];
        field490 = new int[field582];
        field586 = new int[field582];
        field587 = new int[field582];
        field577 = new int[field582];
        field762 = new int[field582];
        field773 = new String[field582];
        field591 = new int[104][104];
        field592 = 0;
        field593 = -1;
        field646 = -1;
        field595 = 0;
        field596 = 0;
        field486 = 0;
        field598 = 0;
        field599 = true;
        field600 = 0;
        field601 = 0;
        field692 = 0;
        field660 = 0;
        field604 = 0;
        field605 = 0;
        field706 = false;
        field741 = 0;
        field608 = 0;
        field597 = true;
        field643 = new class85[2048];
        field611 = -1;
        field602 = 0;
        field613 = -1L;
        field614 = true;
        field671 = 0;
        field616 = 0;
        field617 = new int[1000];
        field618 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field546 = new String[8];
        field620 = new boolean[8];
        field621 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field727 = -1;
        field623 = new class334[4][104][104];
        field624 = new class334();
        field625 = new class334();
        field495 = new class334();
        field568 = new int[25];
        field628 = new int[25];
        field514 = new int[25];
        field630 = 0;
        field631 = false;
        field632 = 0;
        field633 = new int[500];
        field634 = new int[500];
        field635 = new int[500];
        field523 = new int[500];
        field637 = new String[500];
        field638 = new String[500];
        field651 = new boolean[500];
        field640 = false;
        field659 = false;
        field642 = false;
        field751 = true;
        field644 = -1;
        field645 = -1;
        field639 = 0;
        field647 = 50;
        field555 = 0;
        field581 = null;
        field650 = false;
        field731 = -1;
        field652 = -1;
        field653 = null;
        field510 = null;
        field655 = -1;
        field656 = new class420(8);
        field657 = 0;
        field658 = -1;
        field576 = 0;
        field677 = 0;
        field661 = null;
        field641 = 0;
        field615 = 0;
        field664 = 0;
        field488 = -1;
        field714 = false;
        field667 = null;
        field484 = null;
        field669 = null;
        field670 = 0;
        field626 = 0;
        field672 = null;
        field768 = false;
        field665 = -1;
        field551 = -1;
        field676 = false;
        field776 = -1;
        field678 = -1;
        field679 = false;
        field680 = 1;
        field681 = new int[32];
        field607 = 0;
        field683 = new int[32];
        field684 = 0;
        field757 = new int[32];
        field686 = 0;
        field687 = new int[32];
        field688 = 0;
        field689 = 0;
        field690 = 0;
        field691 = 0;
        field526 = 0;
        field693 = 0;
        field481 = 0;
        field662 = 0;
        field696 = 0;
        field719 = 0;
        field698 = new class334();
        field699 = new class334();
        field700 = new class334();
        field569 = new class420(512);
        field702 = 0;
        field703 = -2;
        field704 = new boolean[100];
        field705 = new boolean[100];
        field752 = new boolean[100];
        field501 = new int[100];
        field508 = new int[100];
        field590 = new int[100];
        field710 = new int[100];
        field711 = 0;
        field712 = 0L;
        field713 = true;
        field774 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field715 = 0;
        field716 = 0;
        field717 = "";
        field718 = new long[100];
        field609 = 0;
        field720 = 0;
        field721 = new int[128];
        field722 = new int[128];
        field729 = -1L;
        field724 = new class140[4];
        field725 = new class149[4];
        field726 = -1;
        field649 = 0;
        field728 = new int[1000];
        field477 = new int[1000];
        field730 = new class456[1000];
        field493 = 0;
        field732 = 0;
        field733 = 0;
        field743 = -1;
        field735 = false;
        field489 = 0;
        field737 = new int[50];
        field738 = new int[50];
        field739 = new int[50];
        field740 = new int[50];
        field619 = new class37[50];
        field760 = false;
        field668 = false;
        field744 = new boolean[5];
        field763 = new int[5];
        field746 = new int[5];
        field538 = new int[5];
        field748 = new int[5];
        field749 = 256;
        field750 = 205;
        field553 = 256;
        field603 = 320;
        field753 = 1;
        field754 = 32767;
        field755 = 1;
        field756 = 32767;
        field558 = 0;
        field736 = 0;
        field759 = 0;
        field506 = 0;
        field761 = 0;
        field588 = new class292();
        field536 = -1;
        field764 = -1;
        field765 = new class411();
        field723 = new class324[8];
        field767 = new class60();
        field498 = new class256(64);
        field769 = new class256(64);
        field589 = -1;
        field771 = -1;
        field772 = new ArrayList(10);
        field580 = 0;
        field627 = 0;
        field775 = new class59();
        field675 = new int[50];
        field777 = new int[50];
    }

    @ObfuscatedName("lq.em(I)Loe;")
    public static class415 method5431() {
        return Statics.field1514;
    }

    @ObfuscatedName("client.ah(B)V")
    public final void method502() {
    }

    public final void init() {
        if (!this.method389()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class93.field1277)) {
                            field480 = true;
                        } else {
                            field480 = false;
                        }
                        break;
                    case 4:
                        if (field766 == -1) {
                            field766 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field478 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var9 = Integer.parseInt(var2);
                        class330 var10;
                        if (var9 >= 0 && var9 < class330.field4096.length) {
                            var10 = class330.field4096[var9];
                        } else {
                            var10 = null;
                        }
                        Statics.field1604 = var10;
                        break;
                    case 7:
                        int var4 = Integer.parseInt(var2);
                        class303[] var5 = class303.method4930();
                        int var6 = 0;
                        class303 var8;
                        while (true) {
                            if (var6 >= var5.length) {
                                var8 = null;
                                break;
                            }
                            class303 var7 = var5[var6];
                            if (var7.field3582 == var4) {
                                var8 = var7;
                                break;
                            }
                            var6++;
                        }
                        Statics.field1306 = var8;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class93.field1277)) {
                        }
                        break;
                    case 9:
                        Statics.field4046 = var2;
                        break;
                    case 10:
                        class304[] var3 = new class304[] { class304.field3592, class304.field3594, class304.field3597, class304.field3595, class304.field3591, class304.field3600 };
                        Statics.field3314 = (class304) class329.method2087(var3, Integer.parseInt(var2));
                        if (Statics.field3314 == class304.field3595) {
                            Statics.field1888 = class423.field4617;
                        } else {
                            Statics.field1888 = class423.field4621;
                        }
                        break;
                    case 11:
                        Statics.field1388 = var2;
                        break;
                    case 12:
                        field697 = Integer.parseInt(var2);
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    default:
                        break;
                    case 14:
                        Statics.field100 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field479 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field482 = var2;
                        break;
                    case 21:
                        field483 = Integer.parseInt(var2);
                }
            }
        }
        method1875();
        Statics.field2011 = this.getCodeBase().getHost();
        String var11 = Statics.field1306.field3586;
        byte var12 = 0;
        try {
            class158.method2599("oldschool", var11, var12, 22);
        } catch (Exception var14) {
            class467.method4655((String) null, var14);
        }
        Statics.field4220 = this;
        Statics.field113 = field766;
        if (field485 == -1) {
            field485 = 0;
        }
        Statics.field123 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field1852 = System.getenv("JX_REFRESH_TOKEN");
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field524 = true;
        }
        this.method503(765, 503, 206, 1);
    }

    @ObfuscatedName("bw.ey(B)V")
    public static final void method1875() {
        class204.field2383 = false;
        field701 = false;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field734 = arg0;
            class69.method4519(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field674 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field487 == 10;
    }

    public long getAccountHash() {
        return this.field708;
    }

    @ObfuscatedName("client.ev(I)Z")
    public boolean method1030() {
        return Statics.field123 != null && !Statics.field123.trim().isEmpty();
    }

    @ObfuscatedName("client.ee(B)Z")
    public boolean method1031() {
        return this.field734 != null;
    }

    @ObfuscatedName("client.ef(Ljava/lang/String;I)V")
    public void method1032(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field1388 + "shield/oauth/token" + (new class401(var2)).method6474());
        HashMap var4 = new HashMap();
        var4.put("Authorization", "Basic " + field528);
        var4.put("Host", (new URL(Statics.field1388)).getHost());
        var4.put("Accept", class398.field4432.method6452());
        class10 var5 = class10.field37;
        RefreshAccessTokenRequester var6 = this.field674;
        if (var6 != null) {
            this.field527 = var6.request(var5.method61(), var3, var4, "");
            return;
        }
        class11 var7 = new class11(var3, var5, this.field524);
        Iterator var8 = var4.entrySet().iterator();
        while (var8.hasNext()) {
            Entry var9 = (Entry) var8.next();
            var7.method74((String) var9.getKey(), (String) var9.getValue());
        }
        this.field525 = this.field520.method145(var7);
    }

    @ObfuscatedName("client.er(Ljava/lang/String;I)V")
    public void method1395(String arg0) throws MalformedURLException, IOException {
        URL var2 = new URL(Statics.field1388 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        HashMap var3 = new HashMap();
        var3.put("Authorization", "Bearer " + arg0);
        class10 var4 = class10.field31;
        OtlTokenRequester var5 = this.field734;
        if (var5 != null) {
            this.field612 = var5.request(var4.method61(), var2, var3, "");
            return;
        }
        class11 var6 = new class11(var2, var4, this.field524);
        Iterator var7 = var3.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            var6.method74((String) var8.getKey(), (String) var8.getValue());
        }
        this.field521 = this.field520.method145(var6);
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method400() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field159 = null;
            Statics.field99 = null;
            Statics.field4833 = (byte[][][]) null;
            class353.method4525();
        } else {
            Statics.field159 = var1;
            Statics.field99 = new int[var1.length];
            Statics.field4833 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field159.length; var3++) {
                Statics.field4833[var3] = new byte[var2[var3]][];
                class353.field4203.add(var1[var3]);
            }
            Collections.sort(class353.field4203);
        }
        Statics.field2288 = field479 == 0 ? 43594 : field697 + 40000;
        Statics.field103 = field479 == 0 ? 443 : field697 + 50000;
        Statics.field518 = Statics.field2288;
        Statics.field3344 = class293.field3352;
        Statics.field3343 = class293.field3350;
        Statics.field2794 = class293.field3351;
        Statics.field3335 = class293.field3353;
        Statics.field1622 = new class102(this.field524, 206);
        this.method388();
        this.method382();
        Statics.field1760 = this.method483();
        Statics.field2203 = new class381(255, class158.field1759, class158.field1755, 500000);
        Statics.field109 = class90.method5218();
        this.method379();
        String var5 = Statics.field1302;
        class30.field173 = this;
        if (var5 != null) {
            class30.field170 = var5;
        }
        method4223(Statics.field109.method2160());
        Statics.field1116 = new class62(Statics.field1888);
        this.field520 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.ab(I)V")
    public final void method401() {
        field552++;
        this.method1056();
        while (true) {
            class334 var1 = class312.field3974;
            class311 var2;
            synchronized (class312.field3974) {
                var2 = (class311) class312.field3971.method5533();
            }
            if (var2 == null) {
                try {
                    if (class273.field3196 == 1) {
                        int var4 = Statics.field3199.method4769();
                        if (var4 > 0 && Statics.field3199.method4818()) {
                            int var5 = var4 - Statics.field3200;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field3199.method4768(var5);
                        } else {
                            Statics.field3199.method4774();
                            Statics.field3199.method4772();
                            if (Statics.field3195 == null) {
                                class273.field3196 = 0;
                            } else {
                                class273.field3196 = 2;
                            }
                            Statics.field1000 = null;
                            Statics.field1992 = null;
                        }
                    }
                } catch (Exception var17) {
                    var17.printStackTrace();
                    Statics.field3199.method4774();
                    class273.field3196 = 0;
                    Statics.field1000 = null;
                    Statics.field1992 = null;
                    Statics.field3195 = null;
                }
                method4007();
                class24 var7 = class24.field130;
                synchronized (class24.field130) {
                    class24.field151++;
                    class24.field148 = class24.field128;
                    class24.field145 = 0;
                    class24.field147 = 0;
                    Arrays.fill(class24.field137, false);
                    Arrays.fill(class24.field142, false);
                    if (class24.field141 < 0) {
                        Arrays.fill(class24.field136, false);
                        class24.field141 = class24.field140;
                    } else {
                        while (class24.field141 != class24.field140) {
                            int var8 = class24.field139[class24.field140];
                            class24.field140 = class24.field140 + 1 & 0x7F;
                            if (var8 < 0) {
                                int var9 = ~var8;
                                if (class24.field136[var9]) {
                                    class24.field136[var9] = false;
                                    class24.field142[var9] = true;
                                    class24.field143[class24.field147] = var9;
                                    class24.field147++;
                                }
                            } else {
                                if (!class24.field136[var8] && class24.field145 < class24.field135.length - 1) {
                                    class24.field137[var8] = true;
                                    class24.field135[++class24.field145 - 1] = var8;
                                }
                                class24.field136[var8] = true;
                            }
                        }
                    }
                    if (class24.field145 > 0) {
                        class24.field151 = 0;
                    }
                    class24.field128 = class24.field144;
                }
                class33 var11 = class33.field217;
                synchronized (class33.field217) {
                    class33.field234 = class33.field219;
                    class33.field223 = class33.field236;
                    class33.field225 = class33.field221;
                    class33.field215 = class33.field222;
                    class33.field231 = class33.field227;
                    class33.field232 = class33.field228;
                    class33.field233 = class33.field220;
                    class33.field229 = class33.field230;
                    class33.field227 = 0;
                }
                if (Statics.field1760 != null) {
                    int var13 = Statics.field1760.method266();
                    field719 = var13;
                }
                if (field487 == 0) {
                    method4190();
                    class32.method4983();
                } else if (field487 == 5) {
                    class69.method176(this, Statics.field156);
                    method4190();
                    class32.method4983();
                } else if (field487 == 10 || field487 == 11) {
                    class69.method176(this, Statics.field156);
                } else if (field487 == 20) {
                    class69.method176(this, Statics.field156);
                    this.method1038();
                } else if (field487 == 50) {
                    class69.method176(this, Statics.field156);
                    this.method1038();
                } else if (field487 == 25) {
                    Statics.method5248();
                }
                if (field487 == 30) {
                    this.method1252();
                } else if (field487 == 40 || field487 == 45) {
                    this.method1038();
                }
                return;
            }
            var2.field3967.method5257(var2.field3966, (int) var2.field4462, var2.field3968, false);
        }
    }

    @ObfuscatedName("client.aj(ZI)V")
    public final void method464(boolean arg0) {
        boolean var2;
        label143: {
            try {
                if (class273.field3196 == 2) {
                    if (Statics.field1000 == null) {
                        Statics.field1000 = class278.method4948(Statics.field3195, Statics.field3198, Statics.field1715);
                        if (Statics.field1000 == null) {
                            var2 = false;
                            break label143;
                        }
                    }
                    if (Statics.field1992 == null) {
                        Statics.field1992 = new class43(Statics.field167, Statics.field3201);
                    }
                    if (Statics.field3199.method4770(Statics.field1000, Statics.field3194, Statics.field1992, 22050)) {
                        Statics.field3199.method4771();
                        Statics.field3199.method4768(Statics.field3193);
                        Statics.field3199.method4773(Statics.field1000, Statics.field62);
                        class273.field3196 = 0;
                        Statics.field1000 = null;
                        Statics.field1992 = null;
                        Statics.field3195 = null;
                        var2 = true;
                        break label143;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field3199.method4774();
                class273.field3196 = 0;
                Statics.field1000 = null;
                Statics.field1992 = null;
                Statics.field3195 = null;
            }
            var2 = false;
        }
        if (var2 && field735 && Statics.field1285 != null) {
            Statics.field1285.method670();
        }
        if ((field487 == 10 || field487 == 20 || field487 == 30) && field712 != 0L && class269.method2567() > field712) {
            method4223(method68());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field704[var5] = true;
            }
        }
        if (field487 == 0) {
            this.method397(class69.field904, class69.field899, arg0);
        } else if (field487 == 5) {
            class69.method3293(Statics.field1303, Statics.field226, Statics.field156);
        } else if (field487 == 10 || field487 == 11) {
            class69.method3293(Statics.field1303, Statics.field226, Statics.field156);
        } else if (field487 == 20) {
            class69.method3293(Statics.field1303, Statics.field226, Statics.field156);
        } else if (field487 == 50) {
            class69.method3293(Statics.field1303, Statics.field226, Statics.field156);
        } else if (field487 == 25) {
            if (field550 == 1) {
                if (field695 > field547) {
                    field547 = field695;
                }
                int var6 = (field547 * 50 - field695 * 50) / field547;
                method3549(class308.field3627 + class93.field1274 + class93.field1276 + var6 + "%" + class93.field1271, false);
            } else if (field550 == 2) {
                if (field548 > field549) {
                    field549 = field548;
                }
                int var7 = (field549 * 50 - field548 * 50) / field549 + 50;
                method3549(class308.field3627 + class93.field1274 + class93.field1276 + var7 + "%" + class93.field1271, false);
            } else {
                method3549(class308.field3627, false);
            }
        } else if (field487 == 30) {
            this.method1218();
        } else if (field487 == 40) {
            method3549(class308.field3885 + class93.field1274 + class308.field3629, false);
        } else if (field487 == 45) {
            method3549(class308.field3787, false);
        }
        if (field487 == 30 && field711 == 0 && !arg0 && !field713) {
            for (int var8 = 0; var8 < field702; var8++) {
                if (field705[var8]) {
                    Statics.field458.method366(field501[var8], field508[var8], field590[var8], field710[var8]);
                    field705[var8] = false;
                }
            }
        } else if (field487 > 0) {
            Statics.field458.method360(0, 0);
            for (int var9 = 0; var9 < field702; var9++) {
                field705[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.am(I)V")
    public final void method403() {
        if (Statics.field3944.method2324()) {
            Statics.field3944.method2321();
        }
        if (Statics.field2235 != null) {
            Statics.field2235.field1063 = false;
        }
        Statics.field2235 = null;
        field541.method2380();
        class24.method2020();
        class33.method2254();
        Statics.field1760 = null;
        if (Statics.field1285 != null) {
            Statics.field1285.method664();
        }
        if (Statics.field2839 != null) {
            Statics.field2839.method664();
        }
        if (Statics.field4025 != null) {
            Statics.field4025.method6196();
        }
        Object var1 = class312.field3970;
        synchronized (class312.field3970) {
            if (class312.field3972 != 0) {
                class312.field3972 = 1;
                try {
                    class312.field3970.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        if (Statics.field1622 != null) {
            Statics.field1622.method2407();
            Statics.field1622 = null;
        }
        class158.method4586();
        this.field520.method146();
    }

    @ObfuscatedName("cp.et(II)V")
    public static void method2093(int arg0) {
        if (field487 == arg0) {
            return;
        }
        if (field487 == 0) {
            Statics.field4220.method405();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method3299(0);
            field513 = 0;
            field610 = 0;
            field544.method5957(arg0);
            if (arg0 != 20) {
                method6189(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field462 != null) {
            Statics.field462.method6196();
            Statics.field462 = null;
        }
        if (field487 == 25) {
            field550 = 0;
            field695 = 0;
            field547 = 1;
            field548 = 0;
            field549 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field109.method2158() >= field483;
            int var3 = var2 ? 0 : 12;
            class69.method2809(Statics.field466, Statics.field3608, true, var3);
        } else if (arg0 == 20) {
            int var1 = field487 == 11 ? 4 : 0;
            class69.method2809(Statics.field466, Statics.field3608, false, var1);
        } else if (arg0 == 11) {
            class69.method2809(Statics.field466, Statics.field3608, false, 4);
        } else if (arg0 == 50) {
            class69.method2420("", "Updating date of birth...", "");
            class69.method2809(Statics.field466, Statics.field3608, false, 7);
        } else if (Statics.field918) {
            Statics.field10 = null;
            Statics.field19 = null;
            Statics.field3297 = null;
            Statics.field92 = null;
            Statics.field930 = null;
            Statics.field902 = null;
            Statics.field1675 = null;
            Statics.field4158 = null;
            Statics.field2760 = null;
            Statics.field451 = null;
            Statics.field1561 = null;
            Statics.field805 = null;
            Statics.field2668 = null;
            Statics.field1386 = null;
            Statics.field895.method2101();
            class273.field3196 = 1;
            Statics.field3195 = null;
            Statics.field3198 = -1;
            Statics.field1715 = -1;
            Statics.field3193 = 0;
            Statics.field62 = false;
            Statics.field3200 = 2;
            class316.method2568(true);
            Statics.field918 = false;
        }
        field487 = arg0;
    }

    @ObfuscatedName("client.es(B)V")
    public void method1056() {
        if (field487 == 1000) {
            return;
        }
        long var1 = class269.method2567();
        int var3 = (int) (var1 - Statics.field4030);
        Statics.field4030 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class316.field4016 += var3;
        boolean var4;
        if (class316.field4026 == 0 && class316.field4031 == 0 && class316.field4024 == 0 && class316.field4019 == 0) {
            var4 = true;
        } else if (Statics.field4025 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class316.field4016 > 30000) {
                        throw new IOException();
                    }
                    while (class316.field4031 < 200 && class316.field4019 > 0) {
                        class314 var5 = (class314) class316.field4018.method6766();
                        class443 var6 = new class443(4);
                        var6.method7031(1);
                        var6.method7033((int) var5.field4462);
                        Statics.field4025.method6210(var6.field4701, 0, 4);
                        class316.field4020.method6774(var5, var5.field4462);
                        class316.field4019--;
                        class316.field4031++;
                    }
                    while (class316.field4026 < 200 && class316.field4024 > 0) {
                        class314 var7 = (class314) class316.field4021.method5520();
                        class443 var8 = new class443(4);
                        var8.method7031(0);
                        var8.method7033((int) var7.field4462);
                        Statics.field4025.method6210(var8.field4701, 0, 4);
                        var7.method6493();
                        class316.field4022.method6774(var7, var7.field4462);
                        class316.field4024--;
                        class316.field4026++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field4025.method6192();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class316.field4016 = 0;
                        byte var11 = 0;
                        if (Statics.field4327 == null) {
                            var11 = 8;
                        } else if (class316.field4028 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class316.field4017.field4700;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field4025.method6194(class316.field4017.field4701, class316.field4017.field4700, var12);
                            if (class316.field4034 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class316.field4017.field4701[class316.field4017.field4700 + var13] ^= class316.field4034;
                                }
                            }
                            class316.field4017.field4700 += var12;
                            if (class316.field4017.field4700 < var11) {
                                break;
                            }
                            if (Statics.field4327 == null) {
                                class316.field4017.field4700 = 0;
                                int var14 = class316.field4017.method7047();
                                int var15 = class316.field4017.method7049();
                                int var16 = class316.field4017.method7047();
                                int var17 = class316.field4017.method7052();
                                long var18 = (long) ((var14 << 16) + var15);
                                class314 var20 = (class314) class316.field4020.method6765(var18);
                                Statics.field4199 = true;
                                if (var20 == null) {
                                    var20 = (class314) class316.field4022.method6765(var18);
                                    Statics.field4199 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field4327 = var20;
                                Statics.field827 = new class443(var17 + var21 + Statics.field4327.field3994);
                                Statics.field827.method7031(var16);
                                Statics.field827.method7087(var17);
                                class316.field4028 = 8;
                                class316.field4017.field4700 = 0;
                            } else if (class316.field4028 == 0) {
                                if (class316.field4017.field4701[0] == -1) {
                                    class316.field4028 = 1;
                                    class316.field4017.field4700 = 0;
                                } else {
                                    Statics.field4327 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field827.field4701.length - Statics.field4327.field3994;
                            int var23 = 512 - class316.field4028;
                            if (var23 > var22 - Statics.field827.field4700) {
                                var23 = var22 - Statics.field827.field4700;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field4025.method6194(Statics.field827.field4701, Statics.field827.field4700, var23);
                            if (class316.field4034 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field827.field4701[Statics.field827.field4700 + var24] ^= class316.field4034;
                                }
                            }
                            Statics.field827.field4700 += var23;
                            class316.field4028 += var23;
                            if (Statics.field827.field4700 == var22) {
                                if (Statics.field4327.field4462 == 16711935L) {
                                    Statics.field1863 = Statics.field827;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class313 var26 = class316.field4036[var25];
                                        if (var26 != null) {
                                            class316.method4985(var26, var25);
                                        }
                                    }
                                } else {
                                    class316.field4015.reset();
                                    class316.field4015.update(Statics.field827.field4701, 0, var22);
                                    int var27 = (int) class316.field4015.getValue();
                                    if (Statics.field4327.field3996 != var27) {
                                        try {
                                            Statics.field4025.method6196();
                                        } catch (Exception var33) {
                                        }
                                        class316.field4035++;
                                        Statics.field4025 = null;
                                        class316.field4034 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class316.field4035 = 0;
                                    class316.field4027 = 0;
                                    Statics.field4327.field3993.method5256((int) (Statics.field4327.field4462 & 0xFFFFL), Statics.field827.field4701, (Statics.field4327.field4462 & 0xFF0000L) == 16711680L, Statics.field4199);
                                }
                                Statics.field4327.method6497();
                                if (Statics.field4199) {
                                    class316.field4031--;
                                } else {
                                    class316.field4026--;
                                }
                                class316.field4028 = 0;
                                Statics.field4327 = null;
                                Statics.field827 = null;
                            } else {
                                if (class316.field4028 != 512) {
                                    break;
                                }
                                class316.field4028 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var34) {
                try {
                    Statics.field4025.method6196();
                } catch (Exception var32) {
                }
                class316.field4027++;
                Statics.field4025 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1036();
        }
    }

    @ObfuscatedName("client.fr(I)V")
    public void method1036() {
        if (class316.field4035 >= 4) {
            this.method408("js5crc");
            method2093(1000);
            return;
        }
        if (class316.field4027 >= 4) {
            if (field487 <= 5) {
                this.method408("js5io");
                method2093(1000);
                return;
            }
            field622 = 3000;
            class316.field4027 = 3;
        }
        if (--field622 + 1 > 0) {
            return;
        }
        try {
            if (field509 == 0) {
                Statics.field2163 = Statics.field203.method2948(Statics.field2011, Statics.field518);
                field509++;
            }
            if (field509 == 1) {
                if (Statics.field2163.field1796 == 2) {
                    this.method1227(-1);
                    return;
                }
                if (Statics.field2163.field1796 == 1) {
                    field509++;
                }
            }
            if (field509 == 2) {
                Statics.field585 = class377.method2710((Socket) Statics.field2163.field1803, 40000, 5000);
                class443 var1 = new class443(5);
                var1.method7031(15);
                var1.method7087(206);
                Statics.field585.method6210(var1.field4701, 0, 5);
                field509++;
                Statics.field779 = class269.method2567();
            }
            if (field509 == 3) {
                if (Statics.field585.method6192() > 0) {
                    int var2 = Statics.field585.method6190();
                    if (var2 != 0) {
                        this.method1227(var2);
                        return;
                    }
                    field509++;
                } else if (class269.method2567() - Statics.field779 > 30000L) {
                    this.method1227(-2);
                    return;
                }
            }
            if (field509 == 4) {
                class377 var3 = Statics.field585;
                boolean var4 = field487 > 20;
                if (Statics.field4025 != null) {
                    try {
                        Statics.field4025.method6196();
                    } catch (Exception var14) {
                    }
                    Statics.field4025 = null;
                }
                Statics.field4025 = var3;
                class316.method2568(var4);
                class316.field4017.field4700 = 0;
                Statics.field4327 = null;
                Statics.field827 = null;
                class316.field4028 = 0;
                while (true) {
                    class314 var6 = (class314) class316.field4020.method6766();
                    if (var6 == null) {
                        while (true) {
                            class314 var7 = (class314) class316.field4022.method6766();
                            if (var7 == null) {
                                if (class316.field4034 != 0) {
                                    try {
                                        class443 var8 = new class443(4);
                                        var8.method7031(4);
                                        var8.method7031(class316.field4034);
                                        var8.method7244(0);
                                        Statics.field4025.method6210(var8.field4701, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field4025.method6196();
                                        } catch (Exception var12) {
                                        }
                                        class316.field4027++;
                                        Statics.field4025 = null;
                                    }
                                }
                                class316.field4016 = 0;
                                Statics.field4030 = class269.method2567();
                                Statics.field2163 = null;
                                Statics.field585 = null;
                                field509 = 0;
                                field511 = 0;
                                return;
                            }
                            class316.field4021.method5519(var7);
                            class316.field4023.method6774(var7, var7.field4462);
                            class316.field4024++;
                            class316.field4026--;
                        }
                    }
                    class316.field4018.method6774(var6, var6.field4462);
                    class316.field4019++;
                    class316.field4031--;
                }
            }
        } catch (IOException var15) {
            this.method1227(-3);
        }
    }

    @ObfuscatedName("client.fz(II)V")
    public void method1227(int arg0) {
        Statics.field2163 = null;
        Statics.field585 = null;
        field509 = 0;
        if (Statics.field518 == Statics.field2288) {
            Statics.field518 = Statics.field103;
        } else {
            Statics.field518 = Statics.field2288;
        }
        field511++;
        if (field511 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field487 <= 5) {
                this.method408("js5connect_full");
                method2093(1000);
            } else {
                field622 = 3000;
            }
        } else if (field511 >= 2 && arg0 == 6) {
            this.method408("js5connect_outofdate");
            method2093(1000);
        } else if (field511 >= 4) {
            if (field487 <= 5) {
                this.method408("js5connect");
                method2093(1000);
            } else {
                field622 = 3000;
            }
        }
    }

    @ObfuscatedName("cp.fh(Llc;Ljava/lang/String;I)V")
    public static void method2094(class313 arg0, String arg1) {
        class77 var2 = new class77(arg0, arg1);
        field772.add(var2);
        field627 += var2.field1020;
    }

    @ObfuscatedName("mr.fw(S)Z")
    public static boolean method5746() {
        if (field772 == null || field580 >= field772.size()) {
            return true;
        }
        while (field580 < field772.size()) {
            class77 var0 = (class77) field772.get(field580);
            if (!var0.method1979()) {
                return false;
            }
            field580++;
        }
        return true;
    }

    @ObfuscatedName("do.fb(I)I")
    public static int method2591() {
        if (field772 == null || field580 >= field772.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field580; var1++) {
            var0 += ((class77) field772.get(var1)).field1021;
        }
        return var0 * 10000 / field627;
    }

    @ObfuscatedName("qj.fn(IB)I")
    public static int method7612(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("he.fl(I)V")
    public static void method4190() {
        if (field507 == 0) {
            Statics.field4239 = new class204(4, 104, 104, class75.field1011);
            for (int var0 = 0; var0 < 4; var0++) {
                field629[var0] = new class191(104, 104);
            }
            Statics.field1984 = new class456(512, 512);
            class69.field899 = class308.field3630;
            class69.field904 = 5;
            field507 = 20;
        } else if (field507 == 20) {
            class69.field899 = class308.field3631;
            class69.field904 = 10;
            field507 = 30;
        } else if (field507 == 30) {
            Statics.field1329 = method5516(0, false, true, true, false);
            Statics.field2883 = method5516(1, false, true, true, false);
            Statics.field1651 = method5516(2, true, false, true, false);
            Statics.field4148 = method5516(3, false, true, true, false);
            Statics.field778 = method5516(4, false, true, true, false);
            Statics.field2793 = method5516(5, true, true, true, false);
            Statics.field1516 = method5516(6, true, true, true, false);
            Statics.field57 = method5516(7, false, true, true, false);
            Statics.field3608 = method5516(8, false, true, true, false);
            Statics.field4099 = method5516(9, false, true, true, false);
            Statics.field466 = method5516(10, false, true, true, false);
            Statics.field1384 = method5516(11, false, true, true, false);
            Statics.field3168 = method5516(12, false, true, true, false);
            Statics.field3299 = method5516(13, true, false, true, false);
            Statics.field2829 = method5516(14, false, true, true, false);
            Statics.field885 = method5516(15, false, true, true, false);
            Statics.field21 = method5516(17, true, true, true, false);
            Statics.field4311 = method5516(18, false, true, true, false);
            Statics.field235 = method5516(19, false, true, true, false);
            Statics.field12 = method5516(20, false, true, true, false);
            Statics.field1589 = method5516(21, false, true, true, true);
            class69.field899 = class308.field3930;
            class69.field904 = 20;
            field507 = 40;
        } else if (field507 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1329.method5251() * 4 / 100;
            int var3 = var2 + Statics.field2883.method5251() * 4 / 100;
            int var4 = var3 + Statics.field1651.method5251() * 2 / 100;
            int var5 = var4 + Statics.field4148.method5251() * 2 / 100;
            int var6 = var5 + Statics.field778.method5251() * 6 / 100;
            int var7 = var6 + Statics.field2793.method5251() * 4 / 100;
            int var8 = var7 + Statics.field1516.method5251() * 2 / 100;
            int var9 = var8 + Statics.field57.method5251() * 55 / 100;
            int var10 = var9 + Statics.field3608.method5251() * 2 / 100;
            int var11 = var10 + Statics.field4099.method5251() * 2 / 100;
            int var12 = var11 + Statics.field466.method5251() * 2 / 100;
            int var13 = var12 + Statics.field1384.method5251() * 2 / 100;
            int var14 = var13 + Statics.field3168.method5251() * 2 / 100;
            int var15 = var14 + Statics.field3299.method5251() * 2 / 100;
            int var16 = var15 + Statics.field2829.method5251() * 2 / 100;
            int var17 = var16 + Statics.field885.method5251() * 2 / 100;
            int var18 = var17 + Statics.field235.method5251() / 100;
            int var19 = var18 + Statics.field4311.method5251() / 100;
            int var20 = var19 + Statics.field12.method5251() / 100;
            int var21 = var20 + Statics.field1589.method5251() / 100;
            int var22 = var21 + (Statics.field21.method5250() && Statics.field21.method5301() ? 1 : 0);
            if (var22 == 100) {
                method2094(Statics.field1329, "Animations");
                method2094(Statics.field2883, "Skeletons");
                method2094(Statics.field778, "Sound FX");
                method2094(Statics.field2793, "Maps");
                method2094(Statics.field1516, "Music Tracks");
                method2094(Statics.field57, "Models");
                method2094(Statics.field3608, "Sprites");
                method2094(Statics.field1384, "Music Jingles");
                method2094(Statics.field2829, "Music Samples");
                method2094(Statics.field885, "Music Patches");
                method2094(Statics.field235, "World Map");
                method2094(Statics.field4311, "World Map Geography");
                method2094(Statics.field12, "World Map Ground");
                Statics.field1222 = new class383();
                Statics.field1222.method6260(Statics.field21);
                class69.field899 = class308.field3634;
                class69.field904 = 30;
                field507 = 45;
            } else {
                if (var22 != 0) {
                    class69.field899 = class308.field3633 + var22 + "%";
                }
                class69.field904 = 30;
            }
        } else if (field507 == 45) {
            class40.method3119(22050, !field701, 2);
            class274 var23 = new class274();
            var23.method4805(9, 128);
            Statics.field1285 = class40.method6222(Statics.field203, 0, 22050);
            Statics.field1285.method660(var23);
            class313 var24 = Statics.field885;
            class313 var25 = Statics.field2829;
            class313 var26 = Statics.field778;
            Statics.field3194 = var24;
            Statics.field3201 = var25;
            Statics.field167 = var26;
            Statics.field3199 = var23;
            Statics.field2839 = class40.method6222(Statics.field203, 1, 2048);
            Statics.field120 = new class36();
            Statics.field2839.method660(Statics.field120);
            Statics.field2723 = new class53(22050, Statics.field288);
            class69.field899 = class308.field3635;
            class69.field904 = 35;
            field507 = 50;
            Statics.field3202 = new class416(Statics.field3608, Statics.field3299);
        } else if (field507 == 50) {
            int var27 = class417.method6732().length;
            field545 = Statics.field3202.method6728(class417.method6732());
            if (field545.size() < var27) {
                class69.field899 = class308.field3764 + field545.size() * 100 / var27 + "%";
                class69.field904 = 40;
            } else {
                Statics.field226 = (class349) field545.get(class417.field4581);
                Statics.field156 = (class349) field545.get(class417.field4577);
                Statics.field1303 = (class349) field545.get(class417.field4578);
                Statics.field2464 = field765.method6513();
                class69.field899 = class308.field3782;
                class69.field904 = 40;
                field507 = 60;
            }
        } else if (field507 == 60) {
            int var28 = class69.method2095(Statics.field466, Statics.field3608);
            int var29 = class69.field925.length + class69.field917.length;
            if (var28 < var29) {
                class69.field899 = class308.field3638 + var28 * 100 / var29 + "%";
                class69.field904 = 50;
            } else {
                class69.field899 = class308.field3639;
                class69.field904 = 50;
                method2093(5);
                field507 = 70;
            }
        } else if (field507 == 70) {
            if (!Statics.field1651.method5301()) {
                class69.field899 = class308.field3905 + Statics.field1651.method5262() + "%";
                class69.field904 = 60;
            } else if (Statics.field1589.method5301()) {
                class189.method2833(Statics.field1651);
                class313 var31 = Statics.field1651;
                Statics.field1991 = var31;
                class313 var32 = Statics.field1651;
                class313 var33 = Statics.field57;
                Statics.field1866 = var32;
                Statics.field1857 = var33;
                Statics.field1856 = Statics.field1866.method5313(3);
                class187.method2396(Statics.field1651, Statics.field57, field701);
                class313 var34 = Statics.field1651;
                class313 var35 = Statics.field57;
                Statics.field1917 = var34;
                Statics.field1916 = var35;
                class185.method5422(Statics.field1651);
                class188.method2511(Statics.field1651, Statics.field57, field480, Statics.field226);
                class190.method735(Statics.field1651, Statics.field1329, Statics.field2883);
                class313 var36 = Statics.field1651;
                class313 var37 = Statics.field57;
                Statics.field1974 = var36;
                Statics.field1686 = var37;
                class313 var38 = Statics.field1651;
                Statics.field2002 = var38;
                class313 var39 = Statics.field1651;
                Statics.field1825 = var39;
                Statics.field1823 = Statics.field1825.method5313(16);
                class313 var40 = Statics.field4148;
                class313 var41 = Statics.field57;
                class313 var42 = Statics.field3608;
                class313 var43 = Statics.field3299;
                Statics.field3260 = var40;
                Statics.field1564 = var41;
                Statics.field2013 = var42;
                Statics.field1794 = var43;
                Statics.field324 = new class294[Statics.field3260.method5311()][];
                Statics.field2754 = new boolean[Statics.field3260.method5311()];
                class169.method2125(Statics.field1651);
                class176.method4534(Statics.field1651);
                class172.method4587(Statics.field1651);
                class182.method4008(Statics.field1651);
                class313 var44 = Statics.field1651;
                Statics.field2010 = var44;
                class436.method2737(Statics.field1651);
                class438.method2572(Statics.field1651);
                Statics.field2802 = new class428(Statics.field3314, 54, Statics.field1604, Statics.field1651);
                Statics.field4120 = new class428(Statics.field3314, 47, Statics.field1604, Statics.field1651);
                Statics.field3944 = new class98();
                class313 var45 = Statics.field1651;
                class313 var46 = Statics.field3608;
                class313 var47 = Statics.field3299;
                Statics.field2038 = var45;
                Statics.field2018 = var46;
                Statics.field9 = var47;
                class313 var48 = Statics.field1651;
                class313 var49 = Statics.field3608;
                Statics.field1891 = var48;
                Statics.field1878 = var49;
                class171.method2566(Statics.field1651, Statics.field3608);
                class69.field899 = class308.field3931;
                class69.field904 = 60;
                field507 = 80;
            } else {
                class69.field899 = class308.field3905 + (80 + Statics.field3168.method5262() / 6) + "%";
                class69.field904 = 60;
            }
        } else if (field507 == 80) {
            int var50 = 0;
            if (Statics.field3162 == null) {
                Statics.field3162 = class457.method52(Statics.field3608, Statics.field1222.field4367, 0);
            } else {
                var50++;
            }
            if (Statics.field4155 == null) {
                Statics.field4155 = class457.method52(Statics.field3608, Statics.field1222.field4368, 0);
            } else {
                var50++;
            }
            if (Statics.field75 == null) {
                Statics.field75 = class457.method2699(Statics.field3608, Statics.field1222.field4371, 0);
            } else {
                var50++;
            }
            if (Statics.field454 == null) {
                Statics.field454 = class457.method6878(Statics.field3608, Statics.field1222.field4370, 0);
            } else {
                var50++;
            }
            if (Statics.field169 == null) {
                Statics.field169 = class457.method6878(Statics.field3608, Statics.field1222.field4375, 0);
            } else {
                var50++;
            }
            if (Statics.field1378 == null) {
                Statics.field1378 = class457.method6878(Statics.field3608, Statics.field1222.field4374, 0);
            } else {
                var50++;
            }
            if (Statics.field989 == null) {
                Statics.field989 = class457.method6878(Statics.field3608, Statics.field1222.field4373, 0);
            } else {
                var50++;
            }
            if (Statics.field1412 == null) {
                Statics.field1412 = class457.method6878(Statics.field3608, Statics.field1222.field4369, 0);
            } else {
                var50++;
            }
            if (Statics.field39 == null) {
                Statics.field39 = class457.method6878(Statics.field3608, Statics.field1222.field4372, 0);
            } else {
                var50++;
            }
            if (Statics.field1565 == null) {
                Statics.field1565 = class457.method2699(Statics.field3608, Statics.field1222.field4376, 0);
            } else {
                var50++;
            }
            if (Statics.field1253 == null) {
                Statics.field1253 = class457.method2699(Statics.field3608, Statics.field1222.field4377, 0);
            } else {
                var50++;
            }
            if (var50 < 11) {
                class69.field899 = class308.field3745 + var50 * 100 / 12 + "%";
                class69.field904 = 70;
            } else {
                Statics.field4181 = Statics.field1253;
                Statics.field4155.method7452();
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 41.0D) - 20;
                Statics.field75[0].method7430(var51 + var54, var52 + var54, var53 + var54);
                class69.field899 = class308.field3913;
                class69.field904 = 70;
                field507 = 90;
            }
        } else if (field507 == 90) {
            if (Statics.field4099.method5301()) {
                Statics.field68 = new class209(Statics.field4099, Statics.field3608, 20, Statics.field109.method2146(), field701 ? 64 : 128);
                class201.method3730(Statics.field68);
                class201.method3735(Statics.field109.method2146());
                field507 = 100;
            } else {
                class69.field899 = class308.field3914 + "0%";
                class69.field904 = 90;
            }
        } else if (field507 == 100) {
            int var55 = Statics.field68.method4022();
            if (var55 < 100) {
                class69.field899 = class308.field3914 + var55 + "%";
                class69.field904 = 90;
            } else {
                class69.field899 = class308.field3645;
                class69.field904 = 90;
                field507 = 110;
            }
        } else if (field507 == 110) {
            Statics.field2235 = new class82();
            Statics.field203.method2949(Statics.field2235, 10);
            class69.field899 = class308.field3778;
            class69.field904 = 92;
            field507 = 120;
        } else if (field507 == 120) {
            if (Statics.field466.method5331("huffman", "")) {
                class281 var56 = new class281(Statics.field466.method5319("huffman", ""));
                Statics.field3296 = var56;
                class69.field899 = class308.field3724;
                class69.field904 = 94;
                field507 = 130;
            } else {
                class69.field899 = class308.field3662 + "%";
                class69.field904 = 94;
            }
        } else if (field507 == 130) {
            if (!Statics.field4148.method5301()) {
                class69.field899 = class308.field3649 + Statics.field4148.method5262() * 4 / 5 + "%";
                class69.field904 = 96;
            } else if (!Statics.field3168.method5301()) {
                class69.field899 = class308.field3649 + (80 + Statics.field3168.method5262() / 6) + "%";
                class69.field904 = 96;
            } else if (Statics.field3299.method5301()) {
                class69.field899 = class308.field3650;
                class69.field904 = 98;
                field507 = 140;
            } else {
                class69.field899 = class308.field3649 + (96 + Statics.field3299.method5262() / 50) + "%";
                class69.field904 = 96;
            }
        } else if (field507 == 140) {
            class69.field904 = 100;
            if (Statics.field235.method5321(class244.field2868.field2865)) {
                if (Statics.field1514 == null) {
                    Statics.field1514 = new class415();
                    Statics.field1514.method6722(Statics.field235, Statics.field4311, Statics.field12, Statics.field1303, field545, Statics.field75);
                }
                class69.field899 = class308.field3682;
                field507 = 150;
            } else {
                class69.field899 = class308.field3636 + Statics.field235.method5323(class244.field2868.field2865) / 10 + "%";
            }
        } else if (field507 == 150) {
            method2093(10);
        }
    }

    @ObfuscatedName("lz.ff(IZZZZI)Llc;")
    public static class313 method5516(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class381 var5 = null;
        if (class158.field1759 != null) {
            var5 = new class381(arg0, class158.field1759, Statics.field4266[arg0], 1000000);
        }
        return new class313(var5, Statics.field2203, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.fm(I)V")
    public final void method1038() {
        class377 var1 = field541.method2388();
        class442 var2 = field541.field1345;
        try {
            if (field512 == 0) {
                if (Statics.field3614 == null && (field530.method1873() || field513 > 250)) {
                    Statics.field3614 = field530.method1872();
                    field530.method1881();
                    field530 = null;
                }
                if (Statics.field3614 != null) {
                    if (var1 != null) {
                        var1.method6196();
                        var1 = null;
                    }
                    Statics.field1510 = null;
                    field543 = false;
                    field513 = 0;
                    if (field517.method7322()) {
                        try {
                            this.method1032(Statics.field1852);
                            method3299(21);
                        } catch (Throwable var71) {
                            class467.method4655((String) null, var71);
                            method318(65);
                            return;
                        }
                    } else {
                        method3299(1);
                    }
                }
            }
            if (field512 == 21) {
                if (this.field527 == null) {
                    if (this.field525 == null) {
                        method318(65);
                        return;
                    }
                    if (!this.field525.method241()) {
                        return;
                    }
                    if (this.field525.method246()) {
                        class467.method4655(this.field525.method239(), (Throwable) null);
                        method318(65);
                        this.field525 = null;
                        return;
                    }
                    class22 var6 = this.field525.method244();
                    if (var6.method253() != 200) {
                        method318(65);
                        this.field525 = null;
                        return;
                    }
                    field513 = 0;
                    class400 var7 = new class400(var6.method257());
                    try {
                        Statics.field123 = var7.method6465().getString("access_token");
                        Statics.field1852 = var7.method6465().getString("refresh_token");
                    } catch (Exception var69) {
                        class467.method4655("Error parsing tokens", var69);
                        method318(65);
                        this.field525 = null;
                        return;
                    }
                } else if (this.field527.isDone()) {
                    if (this.field527.isCancelled()) {
                        method318(65);
                        this.field527 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse) this.field527.get();
                        if (!var4.isSuccess()) {
                            method318(65);
                            this.field527 = null;
                            return;
                        }
                        Statics.field123 = var4.getAccessToken();
                        Statics.field1852 = var4.getRefreshToken();
                        this.field527 = null;
                    } catch (Exception var70) {
                        class467.method4655((String) null, var70);
                        method318(65);
                        this.field527 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1395(Statics.field123);
                method3299(20);
            }
            if (field512 == 20) {
                if (this.field612 == null) {
                    if (this.field521 == null) {
                        method318(65);
                        return;
                    }
                    if (!this.field521.method241()) {
                        return;
                    }
                    if (this.field521.method246()) {
                        class467.method4655(this.field521.method239(), (Throwable) null);
                        method318(65);
                        this.field521 = null;
                        return;
                    }
                    class22 var11 = this.field521.method244();
                    if (var11.method253() != 200) {
                        class467.method4655("Response code: " + var11.method253() + "Response body: " + var11.method257(), (Throwable) null);
                        method318(65);
                        this.field521 = null;
                        return;
                    }
                    this.field519 = var11.method257();
                    this.field521 = null;
                } else if (this.field612.isDone()) {
                    if (this.field612.isCancelled()) {
                        method318(65);
                        this.field612 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var9 = (OtlTokenResponse) this.field612.get();
                        if (!var9.isSuccess()) {
                            method318(65);
                            this.field612 = null;
                            return;
                        }
                        this.field519 = var9.getToken();
                        this.field612 = null;
                    } catch (Exception var68) {
                        class467.method4655((String) null, var68);
                        method318(65);
                        this.field612 = null;
                        return;
                    }
                } else {
                    return;
                }
                field513 = 0;
                method3299(1);
            }
            if (field512 == 1) {
                if (Statics.field1510 == null) {
                    Statics.field1510 = Statics.field203.method2948(Statics.field2011, Statics.field518);
                }
                if (Statics.field1510.field1796 == 2) {
                    throw new IOException();
                }
                if (Statics.field1510.field1796 == 1) {
                    var1 = class377.method2710((Socket) Statics.field1510.field1803, 40000, 5000);
                    field541.method2379(var1);
                    Statics.field1510 = null;
                    method3299(2);
                }
            }
            if (field512 == 2) {
                field541.method2376();
                class264 var12 = class264.method4952();
                var12.field3031.method7031(class266.field3153.field3145);
                field541.method2378(var12);
                field541.method2385();
                var2.field4700 = 0;
                method3299(3);
            }
            if (field512 == 3) {
                if (Statics.field1285 != null) {
                    Statics.field1285.method688();
                }
                if (Statics.field2839 != null) {
                    Statics.field2839.method688();
                }
                if (var1.method6191(1)) {
                    int var13 = var1.method6190();
                    if (Statics.field1285 != null) {
                        Statics.field1285.method688();
                    }
                    if (Statics.field2839 != null) {
                        Statics.field2839.method688();
                    }
                    if (var13 != 0) {
                        method318(var13);
                        return;
                    }
                    var2.field4700 = 0;
                    method3299(4);
                }
            }
            if (field512 == 4) {
                if (var2.field4700 < 8) {
                    int var14 = var1.method6192();
                    if (var14 > 8 - var2.field4700) {
                        var14 = 8 - var2.field4700;
                    }
                    if (var14 > 0) {
                        var1.method6194(var2.field4701, var2.field4700, var14);
                        var2.field4700 += var14;
                    }
                }
                if (var2.field4700 == 8) {
                    var2.field4700 = 0;
                    Statics.field4321 = var2.method7106();
                    method3299(5);
                }
            }
            if (field512 == 5) {
                field541.field1345.field4700 = 0;
                field541.method2376();
                class442 var15 = new class442(500);
                int[] var16 = new int[] { Statics.field3614.nextInt(), Statics.field3614.nextInt(), Statics.field3614.nextInt(), Statics.field3614.nextInt() };
                var15.field4700 = 0;
                var15.method7031(1);
                var15.method7087(var16[0]);
                var15.method7087(var16[1]);
                var15.method7087(var16[2]);
                var15.method7087(var16[3]);
                var15.method7197(Statics.field4321);
                if (field487 == 40) {
                    var15.method7087(Statics.field531[0]);
                    var15.method7087(Statics.field531[1]);
                    var15.method7087(Statics.field531[2]);
                    var15.method7087(Statics.field531[3]);
                } else {
                    if (field487 == 50) {
                        var15.method7031(class125.field1548.method33());
                        var15.method7087(Statics.field1892);
                    } else {
                        var15.method7031(field516.method33());
                        switch(field516.field1549) {
                            case 0:
                                var15.method7087((Integer) Statics.field109.field1237.get(class343.method1860(class69.field909)));
                                break;
                            case 1:
                                var15.field4700 += 4;
                                break;
                            case 2:
                            case 4:
                                var15.method7033(Statics.field2847);
                                var15.field4700++;
                            case 3:
                        }
                    }
                    if (field517.method7322()) {
                        var15.method7031(class447.field4751.method33());
                        var15.method7037(this.field519);
                    } else {
                        var15.method7031(class447.field4752.method33());
                        var15.method7037(class69.field910);
                    }
                }
                var15.method7073(class68.field887, class68.field886);
                Statics.field531 = var16;
                class264 var17;
                if (class264.field3036 == 0) {
                    var17 = new class264();
                } else {
                    var17 = class264.field3029[--class264.field3036];
                }
                var17.field3033 = null;
                var17.field3034 = 0;
                var17.field3031 = new class442(5000);
                var17.field3031.field4700 = 0;
                if (field487 == 40) {
                    var17.field3031.method7031(class266.field3147.field3145);
                } else {
                    var17.field3031.method7031(class266.field3146.field3145);
                }
                var17.field3031.method7244(0);
                int var21 = var17.field3031.field4700;
                var17.field3031.method7087(206);
                var17.field3031.method7087(1);
                var17.field3031.method7031(field766);
                var17.field3031.method7031(field485);
                var17.field3031.method7053(var15.field4701, 0, var15.field4700);
                int var22 = var17.field3031.field4700;
                var17.field3031.method7037(class69.field909);
                var17.field3031.method7031((field713 ? 1 : 0) << 1 | (field701 ? 1 : 0));
                var17.field3031.method7244(Statics.field976);
                var17.field3031.method7244(Statics.field1028);
                class442 var23 = var17.field3031;
                if (field535 == null) {
                    byte[] var24 = class158.method5517();
                    var23.method7053(var24, 0, var24.length);
                } else {
                    var23.method7053(field535, 0, field535.length);
                }
                var17.field3031.method7037(Statics.field4046);
                var17.field3031.method7087(Statics.field100);
                class443 var25 = new class443(Statics.field2464.method6517());
                Statics.field2464.method6515(var25);
                var17.field3031.method7053(var25.field4701, 0, var25.field4701.length);
                var17.field3031.method7031(field766);
                var17.field3031.method7087(0);
                var17.field3031.method7074(Statics.field4099.field4007);
                var17.field3031.method7098(Statics.field2793.field4007);
                var17.field3031.method7074(Statics.field1516.field4007);
                var17.field3031.method7074(Statics.field466.field4007);
                var17.field3031.method7087(Statics.field1329.field4007);
                var17.field3031.method7074(Statics.field4311.field4007);
                var17.field3031.method7074(Statics.field2883.field4007);
                var17.field3031.method7098(Statics.field4148.field4007);
                var17.field3031.method7097(Statics.field1651.field4007);
                var17.field3031.method7098(Statics.field235.field4007);
                var17.field3031.method7098(Statics.field3608.field4007);
                var17.field3031.method7074(Statics.field57.field4007);
                var17.field3031.method7087(0);
                var17.field3031.method7074(Statics.field2829.field4007);
                var17.field3031.method7097(Statics.field1384.field4007);
                var17.field3031.method7097(Statics.field778.field4007);
                var17.field3031.method7098(Statics.field885.field4007);
                var17.field3031.method7087(Statics.field3299.field4007);
                var17.field3031.method7074(Statics.field12.field4007);
                var17.field3031.method7074(Statics.field21.field4007);
                var17.field3031.method7097(Statics.field3168.field4007);
                var17.field3031.method7071(var16, var22, var17.field3031.field4700);
                var17.field3031.method7043(var17.field3031.field4700 - var21);
                field541.method2378(var17);
                field541.method2385();
                field541.field1344 = new class459(var16);
                int[] var26 = new int[4];
                for (int var27 = 0; var27 < 4; var27++) {
                    var26[var27] = var16[var27] + 50;
                }
                var2.method7017(var26);
                method3299(6);
            }
            if (field512 == 6 && var1.method6192() > 0) {
                int var28 = var1.method6190();
                if (var28 == 61) {
                    int var29 = var1.method6192();
                    Statics.field1822 = var29 == 1 && var1.method6190() == 1;
                    method3299(5);
                }
                if (var28 == 21 && field487 == 20) {
                    method3299(12);
                } else if (var28 == 2) {
                    method3299(14);
                } else if (var28 == 15 && field487 == 40) {
                    field541.field1347 = -1;
                    method3299(19);
                } else if (var28 == 64) {
                    method3299(10);
                } else if (var28 == 23 && field610 < 1) {
                    field610++;
                    method3299(0);
                } else if (var28 == 29) {
                    method3299(17);
                } else if (var28 == 69) {
                    method3299(7);
                } else {
                    method318(var28);
                    return;
                }
            }
            if (field512 == 7 && var1.method6192() >= 2) {
                var1.method6194(var2.field4701, 0, 2);
                var2.field4700 = 0;
                Statics.field1889 = var2.method7049();
                method3299(8);
            }
            if (field512 == 8 && var1.method6192() >= Statics.field1889) {
                var2.field4700 = 0;
                var1.method6194(var2.field4701, var2.field4700, Statics.field1889);
                class7[] var30 = new class7[] { class7.field18 };
                class7 var31 = var30[var2.method7047()];
                try {
                    switch(var31.field17) {
                        case 0:
                            class1 var32 = new class1();
                            this.field533 = new class8(var2, var32);
                            method3299(9);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var67) {
                    method318(22);
                    return;
                }
            }
            if (field512 == 9 && this.field533.method44()) {
                this.field532 = this.field533.method40();
                this.field533.method39();
                this.field533 = null;
                if (this.field532 == null) {
                    method318(22);
                    return;
                }
                field541.method2376();
                class264 var35 = class264.method4952();
                var35.field3031.method7031(class266.field3148.field3145);
                var35.field3031.method7244(this.field532.field4700);
                var35.field3031.method7041(this.field532);
                field541.method2378(var35);
                field541.method2385();
                this.field532 = null;
                method3299(6);
            }
            if (field512 == 10 && var1.method6192() > 0) {
                Statics.field3307 = var1.method6190();
                method3299(11);
            }
            if (field512 == 11 && var1.method6192() >= Statics.field3307) {
                var1.method6194(var2.field4701, 0, Statics.field3307);
                var2.field4700 = 0;
                method3299(6);
            }
            if (field512 == 12 && var1.method6192() > 0) {
                field515 = (var1.method6190() + 3) * 60;
                method3299(13);
            }
            if (field512 == 13) {
                field513 = 0;
                class69.method2420(class308.field3642, class308.field3659, field515 / 60 + class308.field3660);
                if (--field515 <= 0) {
                    method3299(0);
                }
            } else {
                if (field512 == 14 && var1.method6192() >= 1) {
                    Statics.field1207 = var1.method6190();
                    method3299(15);
                }
                if (field512 == 15 && var1.method6192() >= Statics.field1207) {
                    boolean var36 = var1.method6190() == 1;
                    var1.method6194(var2.field4701, 0, 4);
                    var2.field4700 = 0;
                    boolean var37 = false;
                    if (var36) {
                        int var38 = var2.method6990() << 24;
                        int var39 = var38 | var2.method6990() << 16;
                        int var40 = var39 | var2.method6990() << 8;
                        int var41 = var40 | var2.method6990();
                        int var42 = class343.method1860(class69.field909);
                        if (Statics.field109.field1237.size() >= 10 && !Statics.field109.field1237.containsKey(var42)) {
                            Iterator var43 = Statics.field109.field1237.entrySet().iterator();
                            var43.next();
                            var43.remove();
                        }
                        Statics.field109.field1237.put(var42, var41);
                    }
                    if (field529) {
                        Statics.field109.method2152(class69.field909);
                    } else {
                        Statics.field109.method2152((String) null);
                    }
                    class90.method4214();
                    field664 = var1.method6190();
                    field714 = var1.method6190() == 1;
                    field611 = var1.method6190();
                    field611 <<= 0x8;
                    field611 += var1.method6190();
                    field602 = var1.method6190();
                    var1.method6194(var2.field4701, 0, 8);
                    var2.field4700 = 0;
                    this.field708 = var2.method7106();
                    if (Statics.field1207 >= 29) {
                        var1.method6194(var2.field4701, 0, 8);
                        var2.field4700 = 0;
                        field613 = var2.method7106();
                    }
                    var1.method6194(var2.field4701, 0, 1);
                    var2.field4700 = 0;
                    class265[] var44 = class265.method3227();
                    int var45 = var2.method6989();
                    if (var45 < 0 || var45 >= var44.length) {
                        throw new IOException(var45 + " " + var2.field4700);
                    }
                    field541.field1346 = var44[var45];
                    field541.field1347 = field541.field1346.field3037;
                    var1.method6194(var2.field4701, 0, 2);
                    var2.field4700 = 0;
                    field541.field1347 = var2.method7049();
                    try {
                        class28.method341(Statics.field4220, "zap");
                    } catch (Throwable var66) {
                    }
                    method3299(16);
                }
                if (field512 != 16) {
                    if (field512 == 17 && var1.method6192() >= 2) {
                        var2.field4700 = 0;
                        var1.method6194(var2.field4701, 0, 2);
                        var2.field4700 = 0;
                        Statics.field4664 = var2.method7049();
                        method3299(18);
                    }
                    if (field512 == 18 && var1.method6192() >= Statics.field4664) {
                        var2.field4700 = 0;
                        var1.method6194(var2.field4701, 0, Statics.field4664);
                        var2.field4700 = 0;
                        String var61 = var2.method7057();
                        String var62 = var2.method7057();
                        String var63 = var2.method7057();
                        class69.method2420(var61, var62, var63);
                        method2093(10);
                        if (field517.method7322()) {
                            class69.method4519(9);
                        }
                    }
                    if (field512 == 19) {
                        if (field541.field1347 == -1) {
                            if (var1.method6192() < 2) {
                                return;
                            }
                            var1.method6194(var2.field4701, 0, 2);
                            var2.field4700 = 0;
                            field541.field1347 = var2.method7049();
                        }
                        if (var1.method6192() >= field541.field1347) {
                            var1.method6194(var2.field4701, 0, field541.field1347);
                            var2.field4700 = 0;
                            int var64 = field541.field1347;
                            field544.method5943();
                            method709();
                            class97.method6093(var2);
                            if (var2.field4700 != var64) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field513++;
                        if (field513 > 2000) {
                            if (field610 < 1) {
                                if (Statics.field518 == Statics.field2288) {
                                    Statics.field518 = Statics.field103;
                                } else {
                                    Statics.field518 = Statics.field2288;
                                }
                                field610++;
                                method3299(0);
                            } else {
                                method318(-3);
                            }
                        }
                    }
                } else if (var1.method6192() >= field541.field1347) {
                    var2.field4700 = 0;
                    var1.method6194(var2.field4701, 0, field541.field1347);
                    field544.method5940();
                    field491 = 1L;
                    Statics.field2235.field1061 = 0;
                    Statics.field2620 = true;
                    field747 = true;
                    field729 = -1L;
                    class34.method4717();
                    field541.method2376();
                    field541.field1345.field4700 = 0;
                    field541.field1346 = null;
                    field541.field1351 = null;
                    field541.field1348 = null;
                    field541.field1353 = null;
                    field541.field1347 = 0;
                    field541.field1343 = 0;
                    field673 = 0;
                    field542 = 0;
                    field497 = 0;
                    method2684();
                    class33.method5496(0);
                    class99.field1337.clear();
                    class99.field1333.method6748();
                    class99.field1335.method5661();
                    class99.field1338 = 0;
                    field555 = 0;
                    field650 = false;
                    field489 = 0;
                    field564 = 0;
                    field770 = 0;
                    Statics.field1363 = null;
                    field733 = 0;
                    field726 = -1;
                    field493 = 0;
                    field732 = 0;
                    field505 = class95.field1288;
                    field709 = class95.field1288;
                    field537 = 0;
                    class97.method4547();
                    for (int var47 = 0; var47 < 2048; var47++) {
                        field643[var47] = null;
                    }
                    for (int var48 = 0; var48 < 32768; var48++) {
                        field742[var48] = null;
                    }
                    field727 = -1;
                    field625.method5560();
                    field495.method5560();
                    for (int var49 = 0; var49 < 4; var49++) {
                        for (int var50 = 0; var50 < 104; var50++) {
                            for (int var51 = 0; var51 < 104; var51++) {
                                field623[var49][var50][var51] = null;
                            }
                        }
                    }
                    field624 = new class334();
                    Statics.field1116.method1570();
                    for (int var52 = 0; var52 < Statics.field1823; var52++) {
                        class170 var53 = class170.method3238(var52);
                        if (var53 != null) {
                            class288.field3325[var52] = 0;
                            class288.field3326[var52] = 0;
                        }
                    }
                    Statics.field3944.method2319();
                    field488 = -1;
                    if (field655 != -1) {
                        int var54 = field655;
                        if (var54 != -1 && Statics.field2754[var54]) {
                            Statics.field3260.method5308(var54);
                            if (Statics.field324[var54] != null) {
                                boolean var55 = true;
                                for (int var56 = 0; var56 < Statics.field324[var54].length; var56++) {
                                    if (Statics.field324[var54][var56] != null) {
                                        if (Statics.field324[var54][var56].field3371 == 2) {
                                            var55 = false;
                                        } else {
                                            Statics.field324[var54][var56] = null;
                                        }
                                    }
                                }
                                if (var55) {
                                    Statics.field324[var54] = null;
                                }
                                Statics.field2754[var54] = false;
                            }
                        }
                    }
                    for (class80 var57 = (class80) field656.method6766(); var57 != null; var57 = (class80) field656.method6767()) {
                        method4939(var57, true);
                    }
                    field655 = -1;
                    field656 = new class420(8);
                    field661 = null;
                    method2684();
                    field588.method5068((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var58 = 0; var58 < 8; var58++) {
                        field546[var58] = null;
                        field620[var58] = false;
                    }
                    class78.method2690();
                    field492 = true;
                    for (int var59 = 0; var59 < 100; var59++) {
                        field704[var59] = true;
                    }
                    method4992();
                    Statics.field3294 = null;
                    Statics.field1260 = null;
                    Arrays.fill(field724, (Object) null);
                    Statics.field1710 = null;
                    Arrays.fill(field725, (Object) null);
                    for (int var60 = 0; var60 < 8; var60++) {
                        field723[var60] = new class324();
                    }
                    Statics.field1667 = null;
                    class97.method6093(var2);
                    Statics.field4071 = -1;
                    method5188(false, var2);
                    field541.field1346 = null;
                }
            }
        } catch (IOException var72) {
            if (field610 < 1) {
                if (Statics.field518 == Statics.field2288) {
                    Statics.field518 = Statics.field103;
                } else {
                    Statics.field518 = Statics.field2288;
                }
                field610++;
                method3299(0);
            } else {
                method318(-2);
            }
        }
    }

    @ObfuscatedName("ag.fo(I)V")
    public static void method709() {
        field541.method2376();
        field541.field1345.field4700 = 0;
        field541.field1346 = null;
        field541.field1351 = null;
        field541.field1348 = null;
        field541.field1353 = null;
        field541.field1347 = 0;
        field541.field1343 = 0;
        field673 = 0;
        method2684();
        field733 = 0;
        field493 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field643[var0] = null;
        }
        Statics.field1366 = null;
        for (int var1 = 0; var1 < field742.length; var1++) {
            class92 var2 = field742[var1];
            if (var2 != null) {
                var2.field1139 = -1;
                var2.field1135 = false;
            }
        }
        class78.method2690();
        method2093(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field704[var3] = true;
        }
        method4992();
    }

    @ObfuscatedName("d.fv(II)V")
    public static void method318(int arg0) {
        int var1 = class69.field890;
        if (arg0 == -3) {
            class69.method2420(class308.field3760, class308.field3911, class308.field3663);
        } else if (arg0 == -2) {
            class69.method2420(class308.field3664, class308.field3701, class308.field3666);
        } else if (arg0 == -1) {
            class69.method2420(class308.field3926, class308.field3668, class308.field3669);
        } else if (arg0 == 3) {
            class69.method4519(3);
            class69.field903 = 1;
        } else if (arg0 == 4) {
            class69.method4519(14);
            class69.field898 = 0;
        } else if (arg0 == 5) {
            class69.field903 = 2;
            class69.method2420(class308.field3673, class308.field3683, class308.field3675);
        } else if (arg0 == 68 || !(field578 || arg0 != 6)) {
            class69.method2420(class308.field3923, class308.field3801, class308.field3678);
        } else if (arg0 == 7) {
            class69.method2420(class308.field3762, class308.field3680, class308.field3882);
        } else if (arg0 == 8) {
            class69.method2420(class308.field3871, class308.field3874, class308.field3684);
        } else if (arg0 == 9) {
            class69.method2420(class308.field3685, class308.field3686, class308.field3687);
        } else if (arg0 == 10) {
            class69.method2420(class308.field3688, class308.field3674, class308.field3690);
        } else if (arg0 == 11) {
            class69.method2420(class308.field3691, class308.field3692, class308.field3693);
        } else if (arg0 == 12) {
            class69.method2420(class308.field3694, class308.field3912, class308.field3696);
        } else if (arg0 == 13) {
            class69.method2420(class308.field3616, class308.field3784, class308.field3699);
        } else if (arg0 == 14) {
            class69.method2420(class308.field3700, class308.field3841, class308.field3702);
        } else if (arg0 == 16) {
            class69.method2420(class308.field3703, class308.field3704, class308.field3705);
        } else if (arg0 == 17) {
            class69.method2420(class308.field3706, class308.field3707, class308.field3708);
        } else if (arg0 == 18) {
            class69.method4519(14);
            class69.field898 = 1;
        } else if (arg0 == 19) {
            class69.method2420(class308.field3712, class308.field3713, class308.field3714);
        } else if (arg0 == 20) {
            class69.method2420(class308.field3715, class308.field3716, class308.field3717);
        } else if (arg0 == 22) {
            class69.method2420(class308.field3771, class308.field3719, class308.field3720);
        } else if (arg0 == 23) {
            class69.method2420(class308.field3721, class308.field3722, class308.field3723);
        } else if (arg0 == 24) {
            class69.method2420(class308.field3899, class308.field3807, class308.field3726);
        } else if (arg0 == 25) {
            class69.method2420(class308.field3727, class308.field3728, class308.field3894);
        } else if (arg0 == 26) {
            class69.method2420(class308.field3730, class308.field3632, class308.field3646);
        } else if (arg0 == 27) {
            class69.method2420(class308.field3749, class308.field3734, class308.field3735);
        } else if (arg0 == 31) {
            class69.method2420(class308.field3819, class308.field3854, class308.field3834);
        } else if (arg0 == 32) {
            class69.method2420(class308.field3831, class308.field3746, class308.field3805);
        } else if (arg0 == 37) {
            class69.method2420(class308.field3748, class308.field3718, class308.field3750);
        } else if (arg0 == 38) {
            class69.method2420(class308.field3751, class308.field3752, class308.field3753);
        } else if (arg0 == 55) {
            class69.method4519(8);
        } else if (arg0 == 56) {
            class69.method2420(class308.field3758, class308.field3759, class308.field3808);
            method2093(11);
            return;
        } else if (arg0 == 57) {
            class69.method2420(class308.field3761, class308.field3876, class308.field3909);
            method2093(11);
            return;
        } else if (arg0 == 61) {
            class69.method2420("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class69.method4519(7);
        } else if (arg0 == 62) {
            method2093(10);
            class69.method4519(9);
            class69.method2420(class308.field3862, class308.field3765, class308.field3766);
            return;
        } else if (arg0 == 63) {
            method2093(10);
            class69.method4519(9);
            class69.method2420(class308.field3892, class308.field3768, class308.field3769);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method2093(10);
            class69.method4519(9);
            class69.method2420(class308.field3770, class308.field3681, class308.field3772);
            return;
        } else if (arg0 == 71) {
            method2093(10);
            class69.method4519(7);
            class69.method2420("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method2093(10);
            class69.method4519(6);
            class69.method2420(class308.field3795, class308.field3918, class308.field3919);
        } else if (arg0 == 72) {
            method2093(10);
            class69.method4519(26);
        } else {
            class69.method2420(class308.field3773, class308.field3774, class308.field3775);
        }
        method2093(10);
        int var4 = class69.field890;
        boolean var5 = var1 != var4;
        if (!var5 && field517.method7322()) {
            class69.method4519(9);
        }
    }

    @ObfuscatedName("cx.fy(B)V")
    public static final void method2012() {
        field541.method2380();
        method1869();
        Statics.field4239.method3825();
        for (int var0 = 0; var0 < 4; var0++) {
            field629[var0].method3552();
        }
        System.gc();
        class273.field3196 = 1;
        Statics.field3195 = null;
        Statics.field3198 = -1;
        Statics.field1715 = -1;
        Statics.field3193 = 0;
        Statics.field62 = false;
        Statics.field3200 = 2;
        field743 = -1;
        field735 = false;
        class63.method948();
        method2093(10);
    }

    @ObfuscatedName("na.fc(II)V")
    public static final void method6259(int arg0) {
        method2012();
        switch(arg0) {
            case 1:
                class69.method4519(24);
                class69.method2420(class308.field3864, class308.field3725, class308.field3866);
                break;
            case 2:
                class69.method4519(24);
                class69.method2420(class308.field3861, class308.field3817, class308.field3863);
        }
    }

    @ObfuscatedName("hi.fp(I)J")
    public static long method4200() {
        return field613;
    }

    @ObfuscatedName("bu.fa(I)V")
    public static final void method1869() {
        class189.field2156.method4695();
        class181.method2264();
        class173.method5181();
        class187.method2821();
        class178.method4709();
        class188.method1613();
        class190.field2169.method4695();
        class190.field2170.method4695();
        class190.field2171.method4695();
        class180.method2992();
        class183.field1997.method4695();
        class170.field1824.method4695();
        Statics.field2802.method6864();
        Statics.field4120.method6864();
        class186.field2019.method4695();
        class186.field2025.method4695();
        class186.field2021.method4695();
        class174.method2274();
        class185.method1779();
        class184.method1797();
        class171.method736();
        class436.method3006();
        class438.method1798();
        field498.method4695();
        field769.method4695();
        class292.method143();
        class294.field3361.method4695();
        class294.field3362.method4695();
        class294.field3363.method4695();
        class294.field3364.method4695();
        ((class209) Statics.field2364).method4027();
        class72.field977.method4695();
        Statics.field1329.method5360();
        Statics.field2883.method5360();
        Statics.field4148.method5360();
        Statics.field778.method5360();
        Statics.field2793.method5360();
        Statics.field1516.method5360();
        Statics.field57.method5360();
        Statics.field3608.method5360();
        Statics.field4099.method5360();
        Statics.field466.method5360();
        Statics.field1384.method5360();
        Statics.field3168.method5360();
        Statics.field1589.method5360();
    }

    @ObfuscatedName("ej.fg(B)V")
    public static final void method2709() {
        if (field542 > 0) {
            method2012();
        } else {
            field544.method5939();
            method2093(40);
            Statics.field462 = field541.method2388();
            field541.method2381();
        }
    }

    @ObfuscatedName("nt.fi(ZI)V")
    public static final void method6189(boolean arg0) {
        if (arg0) {
            field516 = class69.field896 ? class125.field1545 : class125.field1551;
        } else {
            field516 = Statics.field109.field1237.containsKey(class343.method1860(class69.field909)) ? class125.field1547 : class125.field1544;
        }
    }

    @ObfuscatedName("client.fe(I)V")
    public final void method1252() {
        if (field673 > 1) {
            field673--;
        }
        if (field542 > 0) {
            field542--;
        }
        if (field543) {
            field543 = false;
            method2709();
            return;
        }
        if (!field631) {
            method2001();
        }
        for (int var1 = 0; var1 < 100 && this.method1044(field541); var1++) {
        }
        if (field487 != 30) {
            return;
        }
        while (class34.method35()) {
            class264 var2 = class264.method3158(class262.field3002, field541.field1344);
            var2.field3031.method7031(0);
            int var3 = var2.field3031.field4700;
            class34.method5233(var2.field3031);
            var2.field3031.method7249(var2.field3031.field4700 - var3);
            field541.method2378(var2);
        }
        if (field544.field4224) {
            class264 var4 = class264.method3158(class262.field2919, field541.field1344);
            var4.field3031.method7031(0);
            int var5 = var4.field3031.field4700;
            field544.method5944(var4.field3031);
            var4.field3031.method7249(var4.field3031.field4700 - var5);
            field541.method2378(var4);
            field544.method5942();
        }
        Object var6 = Statics.field2235.field1060;
        synchronized (Statics.field2235.field1060) {
            if (!field522) {
                Statics.field2235.field1061 = 0;
            } else if (class33.field231 != 0 || Statics.field2235.field1061 >= 40) {
                class264 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field2235.field1061 && (var7 == null || var7.field3031.field4700 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field2235.field1059[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field2235.field1062[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field606 != var14 || field648 != var13) {
                        if (var7 == null) {
                            var7 = class264.method3158(class262.field2932, field541.field1344);
                            var7.field3031.method7031(0);
                            var8 = var7.field3031.field4700;
                            var7.field3031.field4700 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field663 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field606;
                            var16 = var13 - field648;
                            var17 = (int) ((Statics.field2235.field1064[var12] - field663) / 20L);
                            var10 = (int) ((Statics.field2235.field1064[var12] - field663) % 20L + (long) var10);
                        }
                        field606 = var14;
                        field648 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field3031.method7244((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field3031.method7031(var17 + 128);
                            var7.field3031.method7244((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field3031.method7031(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3031.method7087(Integer.MIN_VALUE);
                            } else {
                                var7.field3031.method7087(var14 | var13 << 16);
                            }
                        } else {
                            var7.field3031.method7244((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3031.method7087(Integer.MIN_VALUE);
                            } else {
                                var7.field3031.method7087(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field663 = Statics.field2235.field1064[var12];
                    }
                }
                if (var7 != null) {
                    var7.field3031.method7249(var7.field3031.field4700 - var8);
                    int var18 = var7.field3031.field4700;
                    var7.field3031.field4700 = var8;
                    var7.field3031.method7031(var10 / var11);
                    var7.field3031.method7031(var10 % var11);
                    var7.field3031.field4700 = var18;
                    field541.method2378(var7);
                }
                if (var9 >= Statics.field2235.field1061) {
                    Statics.field2235.field1061 = 0;
                } else {
                    Statics.field2235.field1061 -= var9;
                    System.arraycopy(Statics.field2235.field1062, var9, Statics.field2235.field1062, 0, Statics.field2235.field1061);
                    System.arraycopy(Statics.field2235.field1059, var9, Statics.field2235.field1059, 0, Statics.field2235.field1061);
                    System.arraycopy(Statics.field2235.field1064, var9, Statics.field2235.field1064, 0, Statics.field2235.field1061);
                }
            }
        }
        if (class33.field231 == 1 || !Statics.field1528 && class33.field231 == 4 || class33.field231 == 2) {
            long var20 = class33.field229 - field491 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field491 = class33.field229 * -1L;
            int var22 = class33.field233;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field1028) {
                var22 = Statics.field1028;
            }
            int var23 = class33.field232;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field976) {
                var23 = Statics.field976;
            }
            int var24 = (int) var20;
            class264 var25 = class264.method3158(class262.field2958, field541.field1344);
            var25.field3031.method7244((class33.field231 == 2 ? 1 : 0) + (var24 << 1));
            var25.field3031.method7244(var23);
            var25.field3031.method7244(var22);
            field541.method2378(var25);
        }
        if (class24.field145 > 0) {
            class264 var26 = class264.method3158(class262.field2918, field541.field1344);
            var26.field3031.method7244(0);
            int var27 = var26.field3031.field4700;
            long var28 = class269.method2567();
            for (int var30 = 0; var30 < class24.field145; var30++) {
                long var31 = var28 - field729;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field729 = var28;
                var26.field3031.method7076(class24.field135[var30]);
                var26.field3031.method7033((int) var31);
            }
            var26.field3031.method7043(var26.field3031.field4700 - var27);
            field541.method2378(var26);
        }
        if (field494 > 0) {
            field494--;
        }
        if (class24.field136[96] || class24.field136[97] || class24.field136[98] || class24.field136[99]) {
            field579 = true;
        }
        if (field579 && field494 <= 0) {
            field494 = 20;
            field579 = false;
            class264 var33 = class264.method3158(class262.field3007, field541.field1344);
            var33.field3031.method7085(field564);
            var33.field3031.method7243(field563);
            field541.method2378(var33);
        }
        if (Statics.field2620 && !field747) {
            field747 = true;
            class264 var34 = class264.method3158(class262.field3003, field541.field1344);
            var34.field3031.method7031(1);
            field541.method2378(var34);
        }
        if (!Statics.field2620 && field747) {
            field747 = false;
            class264 var35 = class264.method3158(class262.field3003, field541.field1344);
            var35.field3031.method7031(0);
            field541.method2378(var35);
        }
        if (Statics.field1514 != null) {
            Statics.field1514.method6532();
        }
        method716();
        method4572();
        method2373();
        if (field487 != 30) {
            return;
        }
        for (class86 var36 = (class86) field624.method5535(); var36 != null; var36 = (class86) field624.method5537()) {
            if (var36.field1128 > 0) {
                var36.field1128--;
            }
            if (var36.field1128 != 0) {
                if (var36.field1118 > 0) {
                    var36.field1118--;
                }
                if (var36.field1118 == 0 && var36.field1119 >= 1 && var36.field1117 >= 1 && var36.field1119 <= 102 && var36.field1117 <= 102 && (var36.field1124 < 0 || class75.method5217(var36.field1124, var36.field1126))) {
                    method4987(var36.field1129, var36.field1127, var36.field1119, var36.field1117, var36.field1124, var36.field1120, var36.field1126);
                    var36.field1118 = -1;
                    if (var36.field1124 == var36.field1121 && var36.field1121 == -1) {
                        var36.method6497();
                    } else if (var36.field1124 == var36.field1121 && var36.field1122 == var36.field1120 && var36.field1126 == var36.field1123) {
                        var36.method6497();
                    }
                }
            } else if (var36.field1121 < 0 || class75.method5217(var36.field1121, var36.field1123)) {
                method4987(var36.field1129, var36.field1127, var36.field1119, var36.field1117, var36.field1121, var36.field1122, var36.field1123);
                var36.method6497();
            }
        }
        method4196();
        field541.field1343++;
        if (field541.field1343 > 750) {
            method2709();
            return;
        }
        method7028();
        for (int var37 = 0; var37 < field537; var37++) {
            int var38 = field707[var37];
            class92 var39 = field742[var38];
            if (var39 != null) {
                method4988(var39, var39.field1263.field1919);
            }
        }
        method2415();
        field556++;
        if (field598 != 0) {
            field486 += 20;
            if (field486 >= 400) {
                field598 = 0;
            }
        }
        if (Statics.field5 != null) {
            field600++;
            if (field600 >= 15) {
                method1899(Statics.field5);
                Statics.field5 = null;
            }
        }
        class294 var40 = Statics.field4097;
        class294 var41 = Statics.field314;
        Statics.field4097 = null;
        Statics.field314 = null;
        field672 = null;
        field676 = false;
        field768 = false;
        field720 = 0;
        while (class24.method235() && field720 < 128) {
            if (field664 >= 2 && class24.field136[82] && Statics.field3197 == 66) {
                String var42 = class99.method3490();
                Statics.field4220.method380(var42);
            } else if (field770 != 1 || Statics.field1259 <= 0) {
                field722[field720] = Statics.field3197;
                field721[field720] = Statics.field1259;
                field720++;
            }
        }
        boolean var43 = field664 >= 2;
        if (var43 && class24.field136[82] && class24.field136[81] && field719 != 0) {
            int var44 = Statics.field1366.field1107 - field719;
            if (var44 < 0) {
                var44 = 0;
            } else if (var44 > 3) {
                var44 = 3;
            }
            if (Statics.field1366.field1107 != var44) {
                int var45 = Statics.field168 + Statics.field1366.field1200[0];
                int var46 = Statics.field2674 + Statics.field1366.field1201[0];
                class264 var47 = class264.method3158(class262.field2967, field541.field1344);
                var47.field3031.method7077(var44);
                var47.field3031.method7085(var46);
                var47.field3031.method7074(0);
                var47.field3031.method7085(var45);
                field541.method2378(var47);
            }
            field719 = 0;
        }
        if (field655 != -1) {
            method172(field655, 0, 0, Statics.field976, Statics.field1028, 0, 0);
        }
        field680++;
        while (true) {
            class81 var48;
            class294 var49;
            class294 var50;
            do {
                var48 = (class81) field699.method5533();
                if (var48 == null) {
                    while (true) {
                        class81 var51;
                        class294 var52;
                        class294 var53;
                        do {
                            var51 = (class81) field700.method5533();
                            if (var51 == null) {
                                while (true) {
                                    class81 var54;
                                    class294 var55;
                                    class294 var56;
                                    do {
                                        var54 = (class81) field698.method5533();
                                        if (var54 == null) {
                                            this.method1045();
                                            method2712();
                                            if (field484 != null) {
                                                this.method1423();
                                            }
                                            if (Statics.field849 != null) {
                                                method1899(Statics.field849);
                                                field741++;
                                                if (class33.field234 == 0) {
                                                    if (field706) {
                                                        if (Statics.field849 == Statics.field1781 && field692 != field605) {
                                                            class294 var57 = Statics.field849;
                                                            byte var58 = 0;
                                                            if (field677 == 1 && var57.field3373 == 206) {
                                                                var58 = 1;
                                                            }
                                                            if (var57.field3503[field605] <= 0) {
                                                                var58 = 0;
                                                            }
                                                            int var59 = method2679(var57);
                                                            boolean var60 = (var59 >> 29 & 0x1) != 0;
                                                            if (var60) {
                                                                int var61 = field692;
                                                                int var62 = field605;
                                                                var57.field3503[var62] = var57.field3503[var61];
                                                                var57.field3443[var62] = var57.field3443[var61];
                                                                var57.field3503[var61] = -1;
                                                                var57.field3443[var61] = 0;
                                                            } else if (var58 == 1) {
                                                                int var63 = field692;
                                                                int var64 = field605;
                                                                while (var63 != var64) {
                                                                    if (var63 > var64) {
                                                                        var57.method5153(var63 - 1, var63);
                                                                        var63--;
                                                                    } else if (var63 < var64) {
                                                                        var57.method5153(var63 + 1, var63);
                                                                        var63++;
                                                                    }
                                                                }
                                                            } else {
                                                                var57.method5153(field605, field692);
                                                            }
                                                            class264 var65 = class264.method3158(class262.field2973, field541.field1344);
                                                            var65.field3031.method7243(field692);
                                                            var65.field3031.method7097(Statics.field849.field3369);
                                                            var65.field3031.method7076(var58);
                                                            var65.field3031.method7243(field605);
                                                            field541.method2378(var65);
                                                        }
                                                    } else if (this.method1319()) {
                                                        this.method1194(field660, field604);
                                                    } else if (field632 > 0) {
                                                        method3581(field660, field604);
                                                    }
                                                    field600 = 10;
                                                    class33.field231 = 0;
                                                    Statics.field849 = null;
                                                } else if (field741 >= 5 && (class33.field223 > field660 + 5 || class33.field223 < field660 - 5 || class33.field225 > field604 + 5 || class33.field225 < field604 - 5)) {
                                                    field706 = true;
                                                }
                                            }
                                            if (class204.method3863()) {
                                                int var66 = class204.field2415;
                                                int var67 = class204.field2437;
                                                class264 var68 = class264.method3158(class262.field2963, field541.field1344);
                                                var68.field3031.method7031(5);
                                                var68.field3031.method7031(class24.field136[82] ? (class24.field136[81] ? 2 : 1) : 0);
                                                var68.field3031.method7244(Statics.field168 + var66);
                                                var68.field3031.method7085(Statics.field2674 + var67);
                                                field541.method2378(var68);
                                                class204.method3864();
                                                field595 = class33.field232;
                                                field596 = class33.field233;
                                                field598 = 1;
                                                field486 = 0;
                                                field493 = var66;
                                                field732 = var67;
                                            }
                                            if (Statics.field4097 != var40) {
                                                if (var40 != null) {
                                                    method1899(var40);
                                                }
                                                if (Statics.field4097 != null) {
                                                    method1899(Statics.field4097);
                                                }
                                            }
                                            if (Statics.field314 != var41 && field647 == field639) {
                                                if (var41 != null) {
                                                    method1899(var41);
                                                }
                                                if (Statics.field314 != null) {
                                                    method1899(Statics.field314);
                                                }
                                            }
                                            if (Statics.field314 == null) {
                                                if (field639 > 0) {
                                                    field639--;
                                                }
                                            } else if (field639 < field647) {
                                                field639++;
                                                if (field647 == field639) {
                                                    method1899(Statics.field314);
                                                }
                                            }
                                            if (field770 == 0) {
                                                int var69 = Statics.field1366.field1137;
                                                int var70 = Statics.field1366.field1131;
                                                if (Statics.field1039 - var69 < -500 || Statics.field1039 - var69 > 500 || Statics.field1658 - var70 < -500 || Statics.field1658 - var70 > 500) {
                                                    Statics.field1039 = var69;
                                                    Statics.field1658 = var70;
                                                }
                                                if (Statics.field1039 != var69) {
                                                    Statics.field1039 += (var69 - Statics.field1039) / 16;
                                                }
                                                if (Statics.field1658 != var70) {
                                                    Statics.field1658 += (var70 - Statics.field1658) / 16;
                                                }
                                                int var71 = Statics.field1039 >> 7;
                                                int var72 = Statics.field1658 >> 7;
                                                int var73 = method4195(Statics.field1039, Statics.field1658, Statics.field1356);
                                                int var74 = 0;
                                                if (var71 > 3 && var72 > 3 && var71 < 100 && var72 < 100) {
                                                    for (int var75 = var71 - 4; var75 <= var71 + 4; var75++) {
                                                        for (int var76 = var72 - 4; var76 <= var72 + 4; var76++) {
                                                            int var77 = Statics.field1356;
                                                            if (var77 < 3 && (class75.field996[1][var75][var76] & 0x2) == 2) {
                                                                var77++;
                                                            }
                                                            int var78 = var73 - class75.field1011[var77][var75][var76];
                                                            if (var78 > var74) {
                                                                var74 = var78;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var79 = var74 * 192;
                                                if (var79 > 98048) {
                                                    var79 = 98048;
                                                }
                                                if (var79 < 32768) {
                                                    var79 = 32768;
                                                }
                                                if (var79 > field682) {
                                                    field682 += (var79 - field682) / 24;
                                                } else if (var79 < field682) {
                                                    field682 += (var79 - field682) / 80;
                                                }
                                                Statics.field1993 = method4195(Statics.field1366.field1137, Statics.field1366.field1131, Statics.field1356) - field570;
                                            } else if (field770 == 1) {
                                                method2006();
                                                short var80 = -1;
                                                if (class24.field136[33]) {
                                                    var80 = 0;
                                                } else if (class24.field136[49]) {
                                                    var80 = 1024;
                                                }
                                                if (class24.field136[48]) {
                                                    if (var80 == 0) {
                                                        var80 = 1792;
                                                    } else if (var80 == 1024) {
                                                        var80 = 1280;
                                                    } else {
                                                        var80 = 1536;
                                                    }
                                                } else if (class24.field136[50]) {
                                                    if (var80 == 0) {
                                                        var80 = 256;
                                                    } else if (var80 == 1024) {
                                                        var80 = 768;
                                                    } else {
                                                        var80 = 512;
                                                    }
                                                }
                                                byte var81 = 0;
                                                if (class24.field136[35]) {
                                                    var81 = -1;
                                                } else if (class24.field136[51]) {
                                                    var81 = 1;
                                                }
                                                int var82 = 0;
                                                if (var80 >= 0 || var81 != 0) {
                                                    int var83 = class24.field136[81] ? field575 : field574;
                                                    var82 = var83 * 16;
                                                    field572 = var80;
                                                    field573 = var81;
                                                }
                                                if (field571 < var82) {
                                                    field571 += var82 / 8;
                                                    if (field571 > var82) {
                                                        field571 = var82;
                                                    }
                                                } else if (field571 > var82) {
                                                    field571 = field571 * 9 / 10;
                                                }
                                                if (field571 > 0) {
                                                    int var84 = field571 / 16;
                                                    if (field572 >= 0) {
                                                        int var85 = field572 - Statics.field317 & 0x7FF;
                                                        int var86 = class201.field2363[var85];
                                                        int var87 = class201.field2352[var85];
                                                        Statics.field1039 += var84 * var86 / 65536;
                                                        Statics.field1658 += var84 * var87 / 65536;
                                                    }
                                                    if (field573 != 0) {
                                                        Statics.field1993 += field573 * var84;
                                                        if (Statics.field1993 > 0) {
                                                            Statics.field1993 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field572 = -1;
                                                    field573 = -1;
                                                }
                                                if (class24.field136[13]) {
                                                    method2097();
                                                }
                                            }
                                            if (class33.field234 == 4 && Statics.field1528) {
                                                int var88 = class33.field225 - field685;
                                                field566 = var88 * 2;
                                                field685 = var88 == -1 || var88 == 1 ? class33.field225 : (field685 + class33.field225) / 2;
                                                int var89 = field567 - class33.field223;
                                                field565 = var89 * 2;
                                                field567 = var89 == -1 || var89 == 1 ? class33.field223 : (field567 + class33.field223) / 2;
                                            } else {
                                                if (class24.field136[96]) {
                                                    field565 += (-24 - field565) / 2;
                                                } else if (class24.field136[97]) {
                                                    field565 += (24 - field565) / 2;
                                                } else {
                                                    field565 /= 2;
                                                }
                                                if (class24.field136[98]) {
                                                    field566 += (12 - field566) / 2;
                                                } else if (class24.field136[99]) {
                                                    field566 += (-12 - field566) / 2;
                                                } else {
                                                    field566 /= 2;
                                                }
                                                field685 = class33.field225;
                                                field567 = class33.field223;
                                            }
                                            field564 = field565 / 2 + field564 & 0x7FF;
                                            field563 += field566 / 2;
                                            if (field563 < 128) {
                                                field563 = 128;
                                            }
                                            if (field563 > 383) {
                                                field563 = 383;
                                            }
                                            if (field668) {
                                                method3039(Statics.field847, Statics.field2744, Statics.field2623);
                                                method295(Statics.field403, Statics.field4424);
                                                if (Statics.field847 == Statics.field104 && Statics.field90 == Statics.field2744 && Statics.field2761 == Statics.field2623 && Statics.field403 == Statics.field2593 && Statics.field4424 == Statics.field317) {
                                                    field668 = false;
                                                    field760 = false;
                                                    Statics.field1810 = 0;
                                                    Statics.field4665 = 0;
                                                    Statics.field1691 = 0;
                                                    Statics.field3589 = 0;
                                                    Statics.field3232 = 0;
                                                    Statics.field1392 = 0;
                                                    Statics.field3347 = 0;
                                                    Statics.field66 = 0;
                                                    Statics.field1683 = 0;
                                                    Statics.field1044 = 0;
                                                }
                                            } else if (field760) {
                                                int var90 = Statics.field66 * 128 + 64;
                                                int var91 = Statics.field1683 * 128 + 64;
                                                int var92 = method4195(var90, var91, Statics.field1356) - Statics.field1044;
                                                method3039(var90, var92, var91);
                                                int var93 = Statics.field1810 * 128 + 64;
                                                int var94 = Statics.field4665 * 128 + 64;
                                                int var95 = method4195(var93, var94, Statics.field1356) - Statics.field1691;
                                                int var96 = var93 - Statics.field104;
                                                int var97 = var95 - Statics.field90;
                                                int var98 = var94 - Statics.field2761;
                                                int var99 = (int) Math.sqrt((double) (var96 * var96 + var98 * var98));
                                                int var100 = (int) (Math.atan2((double) var97, (double) var99) * 325.9490051269531D) & 0x7FF;
                                                int var101 = (int) (Math.atan2((double) var96, (double) var98) * -325.9490051269531D) & 0x7FF;
                                                method295(var100, var101);
                                            }
                                            for (int var102 = 0; var102 < 5; var102++) {
                                                int var10002 = field748[var102]++;
                                            }
                                            Statics.field3944.method2323();
                                            int var103 = ++class33.field224 - 1;
                                            int var105 = class24.field151;
                                            if (var103 > 15000 && var105 > 15000) {
                                                field542 = 250;
                                                class33.method5496(14500);
                                                class264 var107 = class264.method3158(class262.field2957, field541.field1344);
                                                field541.method2378(var107);
                                            }
                                            Statics.field1116.method1548();
                                            field541.field1350++;
                                            if (field541.field1350 > 50) {
                                                class264 var108 = class264.method3158(class262.field2970, field541.field1344);
                                                field541.method2378(var108);
                                            }
                                            try {
                                                field541.method2385();
                                            } catch (IOException var110) {
                                                method2709();
                                            }
                                            return;
                                        }
                                        var55 = var54.field1048;
                                        if (var55.field3491 < 0) {
                                            break;
                                        }
                                        var56 = class294.method2818(var55.field3423);
                                    } while (var56 == null || var56.field3433 == null || var55.field3491 >= var56.field3433.length || var56.field3433[var55.field3491] != var55);
                                    class64.method4199(var54);
                                }
                            }
                            var52 = var51.field1048;
                            if (var52.field3491 < 0) {
                                break;
                            }
                            var53 = class294.method2818(var52.field3423);
                        } while (var53 == null || var53.field3433 == null || var52.field3491 >= var53.field3433.length || var53.field3433[var52.field3491] != var52);
                        class64.method4199(var51);
                    }
                }
                var49 = var48.field1048;
                if (var49.field3491 < 0) {
                    break;
                }
                var50 = class294.method2818(var49.field3423);
            } while (var50 == null || var50.field3433 == null || var49.field3491 >= var50.field3433.length || var50.field3433[var49.field3491] != var49);
            class64.method4199(var48);
        }
    }

    @ObfuscatedName("gj.fu(B)V")
    public static final void method4007() {
        if (Statics.field2839 != null) {
            Statics.field2839.method661();
        }
        if (Statics.field1285 != null) {
            Statics.field1285.method661();
        }
    }

    @ObfuscatedName("hx.fs(B)V")
    public static final void method4196() {
        for (int var0 = 0; var0 < field489; var0++) {
            int var10002 = field739[var0]--;
            if (field739[var0] >= -10) {
                class37 var2 = field619[var0];
                if (var2 == null) {
                    class37 var10000 = (class37) null;
                    var2 = class37.method625(Statics.field778, field737[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field739[var0] += var2.method617();
                    field619[var0] = var2;
                }
                if (field739[var0] < 0) {
                    int var9;
                    if (field740[var0] == 0) {
                        var9 = Statics.field109.method2133();
                    } else {
                        int var3 = (field740[var0] & 0xFF) * 128;
                        int var4 = field740[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1366.field1137;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field740[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1366.field1131;
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
                        var9 = (var3 - var8) * Statics.field109.method2154() / var3;
                    }
                    if (var9 > 0) {
                        class38 var10 = var2.method616().method629(Statics.field2723);
                        class45 var11 = class45.method747(var10, 100, var9);
                        var11.method785(field738[var0] - 1);
                        Statics.field120.method592(var11);
                    }
                    field739[var0] = -100;
                }
            } else {
                field489--;
                for (int var1 = var0; var1 < field489; var1++) {
                    field737[var1] = field737[var1 + 1];
                    field619[var1] = field619[var1 + 1];
                    field738[var1] = field738[var1 + 1];
                    field739[var1] = field739[var1 + 1];
                    field740[var1] = field740[var1 + 1];
                }
                var0--;
            }
        }
        if (!field735) {
            return;
        }
        boolean var12;
        if (class273.field3196 == 0) {
            var12 = Statics.field3199.method4818();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (Statics.field109.method2150() != 0 && field743 != -1) {
                class273.method2292(Statics.field1516, field743, 0, Statics.field109.method2150(), false);
            }
            field735 = false;
        }
    }

    @ObfuscatedName("dw.fk(Lgc;IIIB)V")
    public static void method2627(class190 arg0, int arg1, int arg2, int arg3) {
        if (field489 >= 50 || Statics.field109.method2154() == 0 || arg0.field2179 == null || arg1 >= arg0.field2179.length) {
            return;
        }
        int var4 = arg0.field2179[arg1];
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field737[field489] = var7;
        field738[field489] = var8;
        field739[field489] = 0;
        field619[field489] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field740[field489] = (var10 << 16) + (var11 << 8) + var9;
        field489++;
    }

    @ObfuscatedName("lm.fj(Lgc;IIIB)V")
    public static void method5440(class190 arg0, int arg1, int arg2, int arg3) {
        if (field489 >= 50 || Statics.field109.method2154() == 0 || arg0.field2173 == null || !arg0.field2173.containsKey(arg1)) {
            return;
        }
        int var4 = (Integer) arg0.field2173.get(arg1);
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field737[field489] = var7;
        field738[field489] = var8;
        field739[field489] = 0;
        field619[field489] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field740[field489] = (var10 << 16) + (var11 << 8) + var9;
        field489++;
    }

    @ObfuscatedName("ag.ft(IIIB)V")
    public static void method711(int arg0, int arg1, int arg2) {
        if (Statics.field109.method2133() == 0 || arg1 == 0 || field489 >= 50) {
            return;
        }
        field737[field489] = arg0;
        field738[field489] = arg1;
        field739[field489] = arg2;
        field619[field489] = null;
        field740[field489] = 0;
        field489++;
    }

    @ObfuscatedName("h.fx(II)V")
    public static void method175(int arg0) {
        if (arg0 == -1 && !field735) {
            class273.method574();
        } else if (arg0 != -1 && field743 != arg0 && Statics.field109.method2150() != 0 && !field735) {
            class313 var1 = Statics.field1516;
            int var2 = Statics.field109.method2150();
            class273.field3196 = 1;
            Statics.field3195 = var1;
            Statics.field3198 = arg0;
            Statics.field1715 = 0;
            Statics.field3193 = var2;
            Statics.field62 = false;
            Statics.field3200 = 2;
        }
        field743 = arg0;
    }

    @ObfuscatedName("ag.fq(I)V")
    public static final void method716() {
        if (!Statics.field949) {
            return;
        }
        if (Statics.field3294 != null) {
            Statics.field3294.method6157();
        }
        method2997();
        Statics.field949 = false;
    }

    @ObfuscatedName("hd.gx(I)V")
    public static final void method4572() {
        if (!Statics.field4083) {
            return;
        }
        for (int var0 = 0; var0 < class97.field1309; var0++) {
            class85 var1 = field643[class97.field1310[var0]];
            var1.method2034();
        }
        Statics.field4083 = false;
    }

    @ObfuscatedName("cb.gf(I)V")
    public static final void method2373() {
        if (Statics.field1356 == field726) {
            return;
        }
        field726 = Statics.field1356;
        int var0 = Statics.field1356;
        int[] var1 = Statics.field1984.field4804;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class75.field996[var0][var6][var4] & 0x18) == 0) {
                    Statics.field4239.method3846(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class75.field996[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field4239.method3846(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1984.method7451();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class75.field996[var0][var10][var9] & 0x18) == 0) {
                    method946(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class75.field996[var0 + 1][var10][var9] & 0x8) != 0) {
                    method946(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field649 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field4239.method3853(Statics.field1356, var11, var12);
                if (var13 != 0L) {
                    int var15 = class212.method937(var13);
                    int var16 = class187.method3000(var15).field2089;
                    if (var16 >= 0 && class171.method6889(var16).field1838) {
                        field730[field649] = class171.method6889(var16).method3060(false);
                        field728[field649] = var11;
                        field477[field649] = var12;
                        field649++;
                    }
                }
            }
        }
        Statics.field458.method7424();
    }

    @ObfuscatedName("cd.gr(B)V")
    public static final void method2415() {
        int[] var0 = class97.field1310;
        for (int var1 = 0; var1 < class97.field1309; var1++) {
            class85 var2 = field643[var0[var1]];
            if (var2 != null && var2.field1154 > 0) {
                var2.field1154--;
                if (var2.field1154 == 0) {
                    var2.field1151 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field537; var3++) {
            int var4 = field707[var3];
            class92 var5 = field742[var4];
            if (var5 != null && var5.field1154 > 0) {
                var5.field1154--;
                if (var5.field1154 == 0) {
                    var5.field1151 = null;
                }
            }
        }
    }

    @ObfuscatedName("dc.gk(Ljava/lang/String;I)V")
    public static final void method2569(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field109.method2231(!Statics.field109.method2137());
            if (Statics.field109.method2137()) {
                class99.method5035(99, "", "Roofs are now all hidden");
            } else {
                class99.method5035(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field109.method2143();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field614 = !field614;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field751 = !field751;
        }
        if (field664 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1514.field4566 = !Statics.field1514.field4566;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field109.method2142(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field109.method2142(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2709();
            }
        }
        class264 var1 = class264.method3158(class262.field3014, field541.field1344);
        var1.field3031.method7031(arg0.length() + 1);
        var1.field3031.method7037(arg0);
        field541.method2378(var1);
    }

    @ObfuscatedName("fc.gs(IIIB)V")
    public static final void method3039(int arg0, int arg1, int arg2) {
        if (Statics.field104 < arg0) {
            Statics.field104 += Statics.field1392 * (arg0 - Statics.field104) / 1000 + Statics.field3347;
            if (Statics.field104 > arg0) {
                Statics.field104 = arg0;
            }
        }
        if (Statics.field104 > arg0) {
            Statics.field104 -= Statics.field1392 * (Statics.field104 - arg0) / 1000 + Statics.field3347;
            if (Statics.field104 < arg0) {
                Statics.field104 = arg0;
            }
        }
        if (Statics.field90 < arg1) {
            Statics.field90 += Statics.field1392 * (arg1 - Statics.field90) / 1000 + Statics.field3347;
            if (Statics.field90 > arg1) {
                Statics.field90 = arg1;
            }
        }
        if (Statics.field90 > arg1) {
            Statics.field90 -= Statics.field1392 * (Statics.field90 - arg1) / 1000 + Statics.field3347;
            if (Statics.field90 < arg1) {
                Statics.field90 = arg1;
            }
        }
        if (Statics.field2761 < arg2) {
            Statics.field2761 += Statics.field1392 * (arg2 - Statics.field2761) / 1000 + Statics.field3347;
            if (Statics.field2761 > arg2) {
                Statics.field2761 = arg2;
            }
        }
        if (Statics.field2761 > arg2) {
            Statics.field2761 -= Statics.field1392 * (Statics.field2761 - arg2) / 1000 + Statics.field3347;
            if (Statics.field2761 < arg2) {
                Statics.field2761 = arg2;
            }
        }
    }

    @ObfuscatedName("o.gp(IIB)V")
    public static final void method295(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field2593 < arg0) {
            Statics.field2593 += Statics.field3232 * (arg0 - Statics.field2593) / 1000 + Statics.field3589;
            if (Statics.field2593 > arg0) {
                Statics.field2593 = arg0;
            }
        }
        if (Statics.field2593 > arg0) {
            Statics.field2593 -= Statics.field3232 * (Statics.field2593 - arg0) / 1000 + Statics.field3589;
            if (Statics.field2593 < arg0) {
                Statics.field2593 = arg0;
            }
        }
        int var2 = arg1 - Statics.field317;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field317 += Statics.field3232 * var2 / 1000 + Statics.field3589;
            Statics.field317 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field317 -= Statics.field3232 * -var2 / 1000 + Statics.field3589;
            Statics.field317 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field317;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field317 = arg1;
        }
    }

    @ObfuscatedName("pq.gc(I)V")
    public static final void method7028() {
        int var0 = class97.field1309;
        int[] var1 = class97.field1310;
        for (int var2 = 0; var2 < var0; var2++) {
            class85 var3 = field643[var1[var2]];
            if (var3 != null) {
                method4988(var3, 1);
            }
        }
    }

    @ObfuscatedName("js.gv(Lcj;II)V")
    public static final void method4988(class87 arg0, int arg1) {
        if (arg0.field1185 >= field552) {
            method5413(arg0);
        } else if (arg0.field1195 >= field552) {
            if (field552 == arg0.field1195 || arg0.field1171 == -1 || arg0.field1174 != 0 || arg0.field1173 + 1 > class190.method983(arg0.field1171).field2180[arg0.field1176]) {
                int var2 = arg0.field1195 - arg0.field1185;
                int var3 = field552 - arg0.field1185;
                int var4 = arg0.field1206 * 64 + arg0.field1141 * 128;
                int var5 = arg0.field1206 * 64 + arg0.field1183 * 128;
                int var6 = arg0.field1206 * 64 + arg0.field1182 * 128;
                int var7 = arg0.field1206 * 64 + arg0.field1184 * 128;
                arg0.field1137 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field1131 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field1203 = 0;
            arg0.field1196 = arg0.field1187;
            arg0.field1132 = arg0.field1196;
        } else {
            method3120(arg0);
        }
        if (arg0.field1137 < 128 || arg0.field1131 < 128 || arg0.field1137 >= 13184 || arg0.field1131 >= 13184) {
            arg0.field1171 = -1;
            arg0.field1175 = -1;
            arg0.field1185 = 0;
            arg0.field1195 = 0;
            arg0.field1137 = arg0.field1200[0] * 128 + arg0.field1206 * 64;
            arg0.field1131 = arg0.field1201[0] * 128 + arg0.field1206 * 64;
            arg0.method2078();
        }
        if (Statics.field1366 == arg0 && (arg0.field1137 < 1536 || arg0.field1131 < 1536 || arg0.field1137 >= 11776 || arg0.field1131 >= 11776)) {
            arg0.field1171 = -1;
            arg0.field1175 = -1;
            arg0.field1185 = 0;
            arg0.field1195 = 0;
            arg0.field1137 = arg0.field1200[0] * 128 + arg0.field1206 * 64;
            arg0.field1131 = arg0.field1201[0] * 128 + arg0.field1206 * 64;
            arg0.method2078();
        }
        method1885(arg0);
        arg0.field1133 = false;
        if (arg0.field1147 != -1) {
            class190 var8 = class190.method983(arg0.field1147);
            if (var8 == null) {
                arg0.field1147 = -1;
            } else if (!var8.method3509() && var8.field2176 != null) {
                arg0.field1164++;
                if (arg0.field1169 < var8.field2176.length && arg0.field1164 > var8.field2180[arg0.field1169]) {
                    arg0.field1164 = 1;
                    arg0.field1169++;
                    method2627(var8, arg0.field1169, arg0.field1137, arg0.field1131);
                }
                if (arg0.field1169 >= var8.field2176.length) {
                    arg0.field1164 = 0;
                    arg0.field1169 = 0;
                    method2627(var8, arg0.field1169, arg0.field1137, arg0.field1131);
                }
            } else if (var8.method3509()) {
                arg0.field1169++;
                int var9 = var8.method3510();
                if (arg0.field1169 < var9) {
                    method5440(var8, arg0.field1169, arg0.field1137, arg0.field1131);
                } else {
                    arg0.field1164 = 0;
                    arg0.field1169 = 0;
                    method5440(var8, arg0.field1169, arg0.field1137, arg0.field1131);
                }
            } else {
                arg0.field1147 = -1;
            }
        }
        if (arg0.field1175 != -1 && field552 >= arg0.field1179) {
            if (arg0.field1177 < 0) {
                arg0.field1177 = 0;
            }
            int var10 = class180.method1612(arg0.field1175).field1976;
            if (var10 == -1) {
                arg0.field1175 = -1;
            } else {
                class190 var11 = class190.method983(var10);
                if (var11 != null && var11.field2176 != null) {
                    arg0.field1178++;
                    if (arg0.field1177 < var11.field2176.length && arg0.field1178 > var11.field2180[arg0.field1177]) {
                        arg0.field1178 = 1;
                        arg0.field1177++;
                        method2627(var11, arg0.field1177, arg0.field1137, arg0.field1131);
                    }
                    if (arg0.field1177 >= var11.field2176.length && (arg0.field1177 < 0 || arg0.field1177 >= var11.field2176.length)) {
                        arg0.field1175 = -1;
                    }
                } else if (var11.method3509()) {
                    arg0.field1177++;
                    int var12 = var11.method3510();
                    if (arg0.field1177 < var12) {
                        method5440(var11, arg0.field1177, arg0.field1137, arg0.field1131);
                    } else if (arg0.field1177 < 0 || arg0.field1177 >= var12) {
                        arg0.field1175 = -1;
                    }
                } else {
                    arg0.field1175 = -1;
                }
            }
        }
        if (arg0.field1171 != -1 && arg0.field1174 <= 1) {
            class190 var13 = class190.method983(arg0.field1171);
            if (var13.field2188 == 1 && arg0.field1204 > 0 && arg0.field1185 <= field552 && arg0.field1195 < field552) {
                arg0.field1174 = 1;
                return;
            }
        }
        if (arg0.field1171 != -1 && arg0.field1174 == 0) {
            class190 var14 = class190.method983(arg0.field1171);
            if (var14 == null) {
                arg0.field1171 = -1;
            } else if (!var14.method3509() && var14.field2176 != null) {
                arg0.field1173++;
                if (arg0.field1176 < var14.field2176.length && arg0.field1173 > var14.field2180[arg0.field1176]) {
                    arg0.field1173 = 1;
                    arg0.field1176++;
                    method2627(var14, arg0.field1176, arg0.field1137, arg0.field1131);
                }
                if (arg0.field1176 >= var14.field2176.length) {
                    arg0.field1176 -= var14.field2178;
                    arg0.field1191++;
                    if (arg0.field1191 >= var14.field2187) {
                        arg0.field1171 = -1;
                    } else if (arg0.field1176 >= 0 && arg0.field1176 < var14.field2176.length) {
                        method2627(var14, arg0.field1176, arg0.field1137, arg0.field1131);
                    } else {
                        arg0.field1171 = -1;
                    }
                }
                arg0.field1133 = var14.field2183;
            } else if (var14.method3509()) {
                arg0.field1176++;
                int var15 = var14.method3511().method2633();
                if (arg0.field1176 < var15) {
                    method5440(var14, arg0.field1176, arg0.field1137, arg0.field1131);
                } else {
                    arg0.field1176 -= var14.field2178;
                    arg0.field1191++;
                    if (arg0.field1191 >= var14.field2187) {
                        arg0.field1171 = -1;
                    } else if (arg0.field1176 >= 0 && arg0.field1176 < var15) {
                        method5440(var14, arg0.field1176, arg0.field1137, arg0.field1131);
                    } else {
                        arg0.field1171 = -1;
                    }
                }
            } else {
                arg0.field1171 = -1;
            }
        }
        if (arg0.field1174 > 0) {
            arg0.field1174--;
        }
    }

    @ObfuscatedName("lv.gu(Lcj;I)V")
    public static final void method5413(class87 arg0) {
        int var1 = Math.max(1, arg0.field1185 - field552);
        int var2 = arg0.field1206 * 64 + arg0.field1141 * 128;
        int var3 = arg0.field1206 * 64 + arg0.field1183 * 128;
        arg0.field1137 += (var2 - arg0.field1137) / var1;
        arg0.field1131 += (var3 - arg0.field1131) / var1;
        arg0.field1203 = 0;
        arg0.field1196 = arg0.field1187;
    }

    @ObfuscatedName("fi.gn(Lcj;I)V")
    public static final void method3120(class87 arg0) {
        arg0.field1147 = arg0.field1168;
        if (arg0.field1199 == 0) {
            arg0.field1203 = 0;
            return;
        }
        if (arg0.field1171 != -1 && arg0.field1174 == 0) {
            class190 var1 = class190.method983(arg0.field1171);
            if (arg0.field1204 > 0 && var1.field2188 == 0) {
                arg0.field1203++;
                return;
            }
            if (arg0.field1204 <= 0 && var1.field2189 == 0) {
                arg0.field1203++;
                return;
            }
        }
        int var2 = arg0.field1137;
        int var3 = arg0.field1131;
        int var4 = arg0.field1200[arg0.field1199 - 1] * 128 + arg0.field1206 * 64;
        int var5 = arg0.field1201[arg0.field1199 - 1] * 128 + arg0.field1206 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1196 = 1280;
            } else if (var3 > var5) {
                arg0.field1196 = 1792;
            } else {
                arg0.field1196 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1196 = 768;
            } else if (var3 > var5) {
                arg0.field1196 = 256;
            } else {
                arg0.field1196 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1196 = 1024;
        } else if (var3 > var5) {
            arg0.field1196 = 0;
        }
        class193 var6 = arg0.field1202[arg0.field1199 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1137 = var4;
            arg0.field1131 = var5;
            arg0.field1199--;
            if (arg0.field1204 > 0) {
                arg0.field1204--;
            }
            return;
        }
        int var7 = arg0.field1196 - arg0.field1132 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1140;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1165;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1142;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1170;
        }
        if (var8 == -1) {
            var8 = arg0.field1165;
        }
        arg0.field1147 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class92) {
            var10 = ((class92) arg0).field1263.field1957;
        }
        if (var10) {
            if (arg0.field1196 != arg0.field1132 && arg0.field1139 == -1 && arg0.field1130 != 0) {
                var9 = 2;
            }
            if (arg0.field1199 > 2) {
                var9 = 6;
            }
            if (arg0.field1199 > 3) {
                var9 = 8;
            }
            if (arg0.field1203 > 0 && arg0.field1199 > 1) {
                var9 = 8;
                arg0.field1203--;
            }
        } else {
            if (arg0.field1199 > 1) {
                var9 = 6;
            }
            if (arg0.field1199 > 2) {
                var9 = 8;
            }
            if (arg0.field1203 > 0 && arg0.field1199 > 1) {
                var9 = 8;
                arg0.field1203--;
            }
        }
        if (class193.field2212 == var6) {
            var9 <<= 0x1;
        } else if (class193.field2210 == var6) {
            var9 >>= 0x1;
        }
        if (var9 >= 8) {
            if (arg0.field1165 == arg0.field1147 && arg0.field1143 != -1) {
                arg0.field1147 = arg0.field1143;
            } else if (arg0.field1147 == arg0.field1140 && arg0.field1181 != -1) {
                arg0.field1147 = arg0.field1181;
            } else if (arg0.field1170 == arg0.field1147 && arg0.field1145 != -1) {
                arg0.field1147 = arg0.field1145;
            } else if (arg0.field1147 == arg0.field1142 && arg0.field1146 != -1) {
                arg0.field1147 = arg0.field1146;
            }
        } else if (var9 <= 1) {
            if (arg0.field1165 == arg0.field1147 && arg0.field1156 != -1) {
                arg0.field1147 = arg0.field1156;
            } else if (arg0.field1147 == arg0.field1140 && arg0.field1180 != -1) {
                arg0.field1147 = arg0.field1180;
            } else if (arg0.field1170 == arg0.field1147 && arg0.field1138 != -1) {
                arg0.field1147 = arg0.field1138;
            } else if (arg0.field1147 == arg0.field1142 && arg0.field1150 != -1) {
                arg0.field1147 = arg0.field1150;
            }
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1137 += var9;
                if (arg0.field1137 > var4) {
                    arg0.field1137 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1137 -= var9;
                if (arg0.field1137 < var4) {
                    arg0.field1137 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1131 += var9;
                if (arg0.field1131 > var5) {
                    arg0.field1131 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1131 -= var9;
                if (arg0.field1131 < var5) {
                    arg0.field1131 = var5;
                }
            }
        }
        if (arg0.field1137 == var4 && arg0.field1131 == var5) {
            arg0.field1199--;
            if (arg0.field1204 > 0) {
                arg0.field1204--;
            }
        }
    }

    @ObfuscatedName("bi.go(Lcj;B)V")
    public static final void method1885(class87 arg0) {
        if (arg0.field1130 == 0) {
            return;
        }
        if (arg0.field1139 != -1) {
            class87 var1 = null;
            if (arg0.field1139 < 32768) {
                var1 = field742[arg0.field1139];
            } else if (arg0.field1139 >= 32768) {
                var1 = field643[arg0.field1139 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1137 - var1.field1137;
                int var3 = arg0.field1131 - var1.field1131;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1196 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1135) {
                arg0.field1139 = -1;
                arg0.field1135 = false;
            }
        }
        if (arg0.field1166 != -1 && (arg0.field1199 == 0 || arg0.field1203 > 0)) {
            arg0.field1196 = arg0.field1166;
            arg0.field1166 = -1;
        }
        int var4 = arg0.field1196 - arg0.field1132 & 0x7FF;
        if (var4 == 0 && arg0.field1135) {
            arg0.field1139 = -1;
            arg0.field1135 = false;
        }
        if (var4 == 0) {
            arg0.field1197 = 0;
            return;
        }
        arg0.field1197++;
        if (var4 > 1024) {
            arg0.field1132 -= arg0.field1162 ? var4 : arg0.field1130;
            boolean var5 = true;
            if (var4 < arg0.field1130 || var4 > 2048 - arg0.field1130) {
                arg0.field1132 = arg0.field1196;
                var5 = false;
            }
            if (!arg0.field1162 && arg0.field1168 == arg0.field1147 && (arg0.field1197 > 25 || var5)) {
                if (arg0.field1149 == -1) {
                    arg0.field1147 = arg0.field1165;
                } else {
                    arg0.field1147 = arg0.field1149;
                }
            }
        } else {
            arg0.field1132 += arg0.field1162 ? var4 : arg0.field1130;
            boolean var6 = true;
            if (var4 < arg0.field1130 || var4 > 2048 - arg0.field1130) {
                arg0.field1132 = arg0.field1196;
                var6 = false;
            }
            if (!arg0.field1162 && arg0.field1168 == arg0.field1147 && (arg0.field1197 > 25 || var6)) {
                if (arg0.field1198 == -1) {
                    arg0.field1147 = arg0.field1165;
                } else {
                    arg0.field1147 = arg0.field1198;
                }
            }
        }
        arg0.field1132 &= 0x7FF;
        arg0.field1162 = false;
    }

    @ObfuscatedName("eb.gz(I)V")
    public static void method2712() {
        if (Statics.field1514 != null) {
            Statics.field1514.method6542(Statics.field1356, (Statics.field1366.field1137 >> 7) + Statics.field168, (Statics.field1366.field1131 >> 7) + Statics.field2674, false);
            Statics.field1514.method6558();
        }
    }

    @ObfuscatedName("bs.gw(Lci;III)V")
    public static void method1789(class85 arg0, int arg1, int arg2) {
        if (arg0.field1171 == arg1 && arg1 != -1) {
            int var3 = class190.method983(arg1).field2175;
            if (var3 == 1) {
                arg0.field1176 = 0;
                arg0.field1173 = 0;
                arg0.field1174 = arg2;
                arg0.field1191 = 0;
            }
            if (var3 == 2) {
                arg0.field1191 = 0;
            }
        } else if (arg1 == -1 || arg0.field1171 == -1 || class190.method983(arg1).field2184 >= class190.method983(arg0.field1171).field2184) {
            arg0.field1171 = arg1;
            arg0.field1176 = 0;
            arg0.field1173 = 0;
            arg0.field1174 = arg2;
            arg0.field1191 = 0;
            arg0.field1204 = arg0.field1199;
        }
    }

    @ObfuscatedName("i.ge(I)I")
    public static int method68() {
        return field713 ? 2 : 1;
    }

    @ObfuscatedName("hq.gd(IS)V")
    public static void method4223(int arg0) {
        field712 = 0L;
        if (arg0 >= 2) {
            field713 = true;
        } else {
            field713 = false;
        }
        if (method68() == 1) {
            Statics.field4220.method376(765, 503);
        } else {
            Statics.field4220.method376(7680, 2160);
        }
        if (field487 >= 25) {
            method4992();
        }
    }

    @ObfuscatedName("kp.gl(I)V")
    public static void method4992() {
        class264 var0 = class264.method3158(class262.field3009, field541.field1344);
        var0.field3031.method7031(method68());
        var0.field3031.method7244(Statics.field976);
        var0.field3031.method7244(Statics.field1028);
        field541.method2378(var0);
    }

    @ObfuscatedName("client.x(I)V")
    public final void method435() {
        field712 = class269.method2567() + 500L;
        this.method1253();
        if (field655 != -1) {
            this.method1048(true);
        }
    }

    @ObfuscatedName("client.gy(I)V")
    public void method1253() {
        int var1 = Statics.field976;
        int var2 = Statics.field1028;
        if (this.field193 < var1) {
            int var3 = this.field193;
        }
        if (this.field190 < var2) {
            int var4 = this.field190;
        }
        if (Statics.field109 == null) {
            return;
        }
        try {
            client var5 = Statics.field4220;
            Object[] var6 = new Object[] { method68() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.ga(I)V")
    public final void method1218() {
        if (field655 != -1) {
            int var1 = field655;
            if (class294.method4251(var1)) {
                method5296(Statics.field324[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field702; var2++) {
            if (field704[var2]) {
                field705[var2] = true;
            }
            field752[var2] = field704[var2];
            field704[var2] = false;
        }
        field703 = field552;
        field644 = -1;
        field645 = -1;
        Statics.field1781 = null;
        if (field655 != -1) {
            field702 = 0;
            method3587(field655, 0, 0, Statics.field976, Statics.field1028, 0, 0, -1);
        }
        class452.method7342();
        if (field599) {
            if (field598 == 1) {
                Statics.field1412[field486 / 100].method7460(field595 - 8, field596 - 8);
            }
            if (field598 == 2) {
                Statics.field1412[field486 / 100 + 4].method7460(field595 - 8, field596 - 8);
            }
        }
        if (field631) {
            method5234();
        } else if (field644 != -1) {
            method2865(field644, field645);
        }
        if (field711 == 3) {
            for (int var3 = 0; var3 < field702; var3++) {
                if (field752[var3]) {
                    class452.method7350(field501[var3], field508[var3], field590[var3], field710[var3], 16711935, 128);
                } else if (field705[var3]) {
                    class452.method7350(field501[var3], field508[var3], field590[var3], field710[var3], 16711680, 128);
                }
            }
        }
        class63.method4198(Statics.field1356, Statics.field1366.field1137, Statics.field1366.field1131, field556);
        field556 = 0;
    }

    @ObfuscatedName("gc.gq(Ljava/lang/String;ZS)V")
    public static final void method3549(String arg0, boolean arg1) {
        if (!field597) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field156.method5828(arg0, 250);
        int var6 = Statics.field156.method5832(arg0, 250) * 13;
        class452.method7400(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class452.method7355(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field156.method5810(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field702; var11++) {
            if (field590[var11] + field501[var11] > var7 && field501[var11] < var7 + var9 && field710[var11] + field508[var11] > var8 && field508[var11] < var8 + var10) {
                field704[var11] = true;
            }
        }
        if (arg1) {
            Statics.field458.method360(0, 0);
            return;
        }
        int var12 = var3;
        int var13 = var4;
        int var14 = var5;
        int var15 = var6;
        for (int var16 = 0; var16 < field702; var16++) {
            if (field590[var16] + field501[var16] > var12 && field501[var16] < var12 + var14 && field710[var16] + field508[var16] > var13 && field508[var16] < var13 + var15) {
                field705[var16] = true;
            }
        }
    }

    @ObfuscatedName("jn.gm(IIIII)V")
    public static final void method4722(int arg0, int arg1, int arg2, int arg3) {
        field592++;
        if (Statics.field1366.field1137 >> 7 == field493 && Statics.field1366.field1131 >> 7 == field732) {
            field493 = 0;
        }
        method2096();
        if (field727 >= 0 && field643[field727] != null) {
            method5933(field643[field727], false);
        }
        method5388(true);
        method2728();
        method5388(false);
        method1538();
        method3582();
        method3814(arg0, arg1, arg2, arg3, true);
        int var4 = field558;
        int var5 = field736;
        int var6 = field759;
        int var7 = field506;
        class452.method7402(var4, var5, var4 + var6, var5 + var7);
        class201.method3691();
        int var8 = field563;
        if (field682 / 256 > var8) {
            var8 = field682 / 256;
        }
        if (field744[4] && field746[4] + 128 > var8) {
            var8 = field746[4] + 128;
        }
        int var9 = field564 & 0x7FF;
        method296(Statics.field1039, Statics.field1993, Statics.field1658, var8, var9, method7612(var8), var7);
        int var10;
        if (field760) {
            int var11;
            if (Statics.field109.method2137()) {
                var11 = Statics.field1356;
            } else {
                int var12 = method4195(Statics.field104, Statics.field2761, Statics.field1356);
                if (var12 - Statics.field90 >= 800 || (class75.field996[Statics.field1356][Statics.field104 >> 7][Statics.field2761 >> 7] & 0x4) == 0) {
                    var11 = 3;
                } else {
                    var11 = Statics.field1356;
                }
            }
            var10 = var11;
        } else {
            var10 = method6862();
        }
        int var13 = Statics.field104;
        int var14 = Statics.field90;
        int var15 = Statics.field2761;
        int var16 = Statics.field2593;
        int var17 = Statics.field317;
        for (int var18 = 0; var18 < 5; var18++) {
            if (field744[var18]) {
                int var19 = (int) (Math.random() * (double) (field763[var18] * 2 + 1) - (double) field763[var18] + Math.sin((double) field538[var18] / 100.0D * (double) field748[var18]) * (double) field746[var18]);
                if (var18 == 0) {
                    Statics.field104 += var19;
                }
                if (var18 == 1) {
                    Statics.field90 += var19;
                }
                if (var18 == 2) {
                    Statics.field2761 += var19;
                }
                if (var18 == 3) {
                    Statics.field317 = Statics.field317 + var19 & 0x7FF;
                }
                if (var18 == 4) {
                    Statics.field2593 += var19;
                    if (Statics.field2593 < 128) {
                        Statics.field2593 = 128;
                    }
                    if (Statics.field2593 > 383) {
                        Statics.field2593 = 383;
                    }
                }
            }
        }
        int var20 = class33.field223;
        int var21 = class33.field225;
        if (class33.field231 != 0) {
            var20 = class33.field232;
            var21 = class33.field233;
        }
        if (var20 >= var4 && var20 < var4 + var6 && var21 >= var5 && var21 < var5 + var7) {
            int var22 = var20 - var4;
            int var23 = var21 - var5;
            class212.field2586 = var22;
            class212.field2587 = var23;
            class212.field2594 = true;
            class212.field2592 = 0;
            class212.field2588 = false;
        } else {
            class212.field2594 = false;
            class212.field2592 = 0;
        }
        method4007();
        class452.method7400(var4, var5, var6, var7, 0);
        method4007();
        int var24 = class201.field2338;
        class201.field2338 = field761;
        Statics.field4239.method3991(Statics.field104, Statics.field90, Statics.field2761, Statics.field2593, Statics.field317, var10);
        class201.field2338 = var24;
        method4007();
        Statics.field4239.method3826();
        field666 = 0;
        boolean var25 = false;
        int var26 = -1;
        int var27 = -1;
        int var28 = class97.field1309;
        int[] var29 = class97.field1310;
        for (int var30 = 0; var30 < field537 + var28; var30++) {
            class87 var31;
            if (var30 < var28) {
                var31 = field643[var29[var30]];
                if (field727 == var29[var30]) {
                    var25 = true;
                    var26 = var30;
                    continue;
                }
                if (Statics.field1366 == var31) {
                    var27 = var30;
                    continue;
                }
            } else {
                var31 = field742[field707[var30 - var28]];
            }
            method2887(var31, var30, var4, var5, var6, var7);
        }
        if (field614 && var27 != -1) {
            method2887(Statics.field1366, var27, var4, var5, var6, var7);
        }
        if (var25) {
            method2887(field643[field727], var26, var4, var5, var6, var7);
        }
        for (int var32 = 0; var32 < field666; var32++) {
            int var33 = field694[var32];
            int var34 = field584[var32];
            int var35 = field586[var32];
            int var36 = field490[var32];
            boolean var37 = true;
            while (var37) {
                var37 = false;
                for (int var38 = 0; var38 < var32; var38++) {
                    if (var34 + 2 > field584[var38] - field490[var38] && var34 - var36 < field584[var38] + 2 && var33 - var35 < field694[var38] + field586[var38] && var33 + var35 > field694[var38] - field586[var38] && field584[var38] - field490[var38] < var34) {
                        var34 = field584[var38] - field490[var38];
                        var37 = true;
                    }
                }
            }
            field593 = field694[var32];
            field646 = field584[var32] = var34;
            String var39 = field773[var32];
            if (field576 == 0) {
                int var40 = 16776960;
                if (field587[var32] < 6) {
                    var40 = field774[field587[var32]];
                }
                if (field587[var32] == 6) {
                    var40 = field592 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field587[var32] == 7) {
                    var40 = field592 % 20 < 10 ? 255 : 65535;
                }
                if (field587[var32] == 8) {
                    var40 = field592 % 20 < 10 ? 45056 : 8454016;
                }
                if (field587[var32] == 9) {
                    int var41 = 150 - field762[var32];
                    if (var41 < 50) {
                        var40 = var41 * 1280 + 16711680;
                    } else if (var41 < 100) {
                        var40 = 16776960 - (var41 - 50) * 327680;
                    } else if (var41 < 150) {
                        var40 = (var41 - 100) * 5 + 65280;
                    }
                }
                if (field587[var32] == 10) {
                    int var42 = 150 - field762[var32];
                    if (var42 < 50) {
                        var40 = var42 * 5 + 16711680;
                    } else if (var42 < 100) {
                        var40 = 16711935 - (var42 - 50) * 327680;
                    } else if (var42 < 150) {
                        var40 = (var42 - 100) * 327680 + 255 - (var42 - 100) * 5;
                    }
                }
                if (field587[var32] == 11) {
                    int var43 = 150 - field762[var32];
                    if (var43 < 50) {
                        var40 = 16777215 - var43 * 327685;
                    } else if (var43 < 100) {
                        var40 = (var43 - 50) * 327685 + 65280;
                    } else if (var43 < 150) {
                        var40 = 16777215 - (var43 - 100) * 327680;
                    }
                }
                if (field577[var32] == 0) {
                    Statics.field1303.method5867(var39, field593 + var4, field646 + var5, var40, 0);
                }
                if (field577[var32] == 1) {
                    Statics.field1303.method5812(var39, field593 + var4, field646 + var5, var40, 0, field592);
                }
                if (field577[var32] == 2) {
                    Statics.field1303.method5870(var39, field593 + var4, field646 + var5, var40, 0, field592);
                }
                if (field577[var32] == 3) {
                    Statics.field1303.method5813(var39, field593 + var4, field646 + var5, var40, 0, field592, 150 - field762[var32]);
                }
                if (field577[var32] == 4) {
                    int var44 = (150 - field762[var32]) * (Statics.field1303.method5800(var39) + 100) / 150;
                    class452.method7344(field593 + var4 - 50, var5, field593 + var4 + 50, var5 + var7);
                    Statics.field1303.method5806(var39, field593 + var4 + 50 - var44, field646 + var5, var40, 0);
                    class452.method7402(var4, var5, var4 + var6, var5 + var7);
                }
                if (field577[var32] == 5) {
                    int var45 = 150 - field762[var32];
                    int var46 = 0;
                    if (var45 < 25) {
                        var46 = var45 - 25;
                    } else if (var45 > 125) {
                        var46 = var45 - 125;
                    }
                    class452.method7344(var4, field646 + var5 - Statics.field1303.field4182 - 1, var4 + var6, field646 + var5 + 5);
                    Statics.field1303.method5867(var39, field593 + var4, field646 + var5 + var46, var40, 0);
                    class452.method7402(var4, var5, var4 + var6, var5 + var7);
                }
            } else {
                Statics.field1303.method5867(var39, field593 + var4, field646 + var5, 16776960, 0);
            }
        }
        if (field497 == 2) {
            method4215((field500 - Statics.field168 << 7) + field503, (field758 - Statics.field2674 << 7) + field504, field502 * 2);
            if (field593 > -1 && field552 % 20 < 10) {
                Statics.field1378[0].method7460(field593 + var4 - 12, field646 + var5 - 28);
            }
        }
        ((class209) Statics.field2364).method4028(field556);
        method2241(var4, var5, var6, var7);
        Statics.field104 = var13;
        Statics.field90 = var14;
        Statics.field2761 = var15;
        Statics.field2593 = var16;
        Statics.field317 = var17;
        if (field492 && class316.method2432(true, false) == 0) {
            field492 = false;
        }
        if (field492) {
            class452.method7400(var4, var5, var6, var7, 0);
            method3549(class308.field3627, false);
        }
    }

    @ObfuscatedName("gq.gg(IIIIZI)V")
    public static final void method3814(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field749;
        } else if (var5 >= 100) {
            var6 = field750;
        } else {
            var6 = (field750 - field749) * var5 / 100 + field749;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field755) {
            short var8 = field755;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field754) {
                var6 = field754;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class452.method7342();
                    class452.method7400(arg0, arg1, var10, arg3, -16777216);
                    class452.method7400(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field756) {
            short var11 = field756;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field753) {
                var6 = field753;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class452.method7342();
                    class452.method7400(arg0, arg1, arg2, var13, -16777216);
                    class452.method7400(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field761 = arg3 * var6 / 334;
        if (field759 != arg2 || field506 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method7612(var16);
                int var18 = class201.field2363[var16];
                int var19 = arg3 - 334;
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 100) {
                    var19 = 100;
                }
                int var20 = (field603 - field553) * var19 / 100 + field553;
                int var21 = var17 * var20 / 256;
                var14[var15] = var18 * var21 >> 16;
            }
            class204.method3917(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field558 = arg0;
        field736 = arg1;
        field759 = arg2;
        field506 = arg3;
    }

    @ObfuscatedName("cp.gj(I)V")
    public static void method2096() {
        if (field614) {
            method5933(Statics.field1366, false);
        }
    }

    @ObfuscatedName("ea.gt(I)V")
    public static void method2728() {
        int var0 = class97.field1309;
        int[] var1 = class97.field1310;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field727 != var1[var2] && field611 != var1[var2]) {
                method5933(field643[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("mm.gh(Lci;ZI)V")
    public static void method5933(class85 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2059() || arg0.field1101) {
            return;
        }
        arg0.field1104 = false;
        if ((field701 && class97.field1309 > 50 || class97.field1309 > 200) && arg1 && arg0.field1168 == arg0.field1147) {
            arg0.field1104 = true;
        }
        int var2 = arg0.field1137 >> 7;
        int var3 = arg0.field1131 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class212.method2959(0, 0, 0, false, arg0.field1112);
        if (arg0.field1099 != null && field552 >= arg0.field1086 && field552 < arg0.field1098) {
            arg0.field1104 = false;
            arg0.field1093 = method4195(arg0.field1137, arg0.field1131, Statics.field1356);
            arg0.field1186 = field552;
            Statics.field4239.method3836(Statics.field1356, arg0.field1137, arg0.field1131, arg0.field1093, 60, arg0, arg0.field1132, var4, arg0.field1100, arg0.field1095, arg0.field1102, arg0.field1115);
            return;
        }
        if ((arg0.field1137 & 0x7F) == 64 && (arg0.field1131 & 0x7F) == 64) {
            if (field592 == field591[var2][var3]) {
                return;
            }
            field591[var2][var3] = field592;
        }
        arg0.field1093 = method4195(arg0.field1137, arg0.field1131, Statics.field1356);
        arg0.field1186 = field552;
        Statics.field4239.method3919(Statics.field1356, arg0.field1137, arg0.field1131, arg0.field1093, 60, arg0, arg0.field1132, var4, arg0.field1133);
    }

    @ObfuscatedName("lh.gb(ZI)V")
    public static final void method5388(boolean arg0) {
        for (int var1 = 0; var1 < field537; var1++) {
            class92 var2 = field742[field707[var1]];
            if (var2 != null && var2.method2059() && var2.field1263.field1947 == arg0 && var2.field1263.method3174()) {
                int var3 = var2.field1137 >> 7;
                int var4 = var2.field1131 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1206 == 1 && (var2.field1137 & 0x7F) == 64 && (var2.field1131 & 0x7F) == 64) {
                        if (field592 == field591[var3][var4]) {
                            continue;
                        }
                        field591[var3][var4] = field592;
                    }
                    long var5 = class212.method2959(0, 0, 1, !var2.field1263.field1956, field707[var1]);
                    var2.field1186 = field552;
                    Statics.field4239.method3919(Statics.field1356, var2.field1137, var2.field1131, method4195(var2.field1137 + (var2.field1206 * 64 - 64), var2.field1131 + (var2.field1206 * 64 - 64), Statics.field1356), var2.field1206 * 64 - 64 + 60, var2, var2.field1132, var5, var2.field1133);
                }
            }
        }
    }

    @ObfuscatedName("bc.hk(I)V")
    public static final void method1538() {
        for (class70 var0 = (class70) field625.method5535(); var0 != null; var0 = (class70) field625.method5537()) {
            if (Statics.field1356 != var0.field933 || field552 > var0.field939) {
                var0.method6497();
            } else if (field552 >= var0.field938) {
                if (var0.field942 > 0) {
                    class92 var1 = field742[var0.field942 - 1];
                    if (var1 != null && var1.field1137 >= 0 && var1.field1137 < 13312 && var1.field1131 >= 0 && var1.field1131 < 13312) {
                        var0.method1863(var1.field1137, var1.field1131, method4195(var1.field1137, var1.field1131, var0.field933) - var0.field937, field552);
                    }
                }
                if (var0.field942 < 0) {
                    int var2 = -var0.field942 - 1;
                    class85 var3;
                    if (field611 == var2) {
                        var3 = Statics.field1366;
                    } else {
                        var3 = field643[var2];
                    }
                    if (var3 != null && var3.field1137 >= 0 && var3.field1137 < 13312 && var3.field1131 >= 0 && var3.field1131 < 13312) {
                        var0.method1863(var3.field1137, var3.field1131, method4195(var3.field1137, var3.field1131, var0.field933) - var0.field937, field552);
                    }
                }
                var0.method1861(field556);
                Statics.field4239.method3919(Statics.field1356, (int) var0.field944, (int) var0.field945, (int) var0.field946, 60, var0, var0.field952, -1L, false);
            }
        }
    }

    @ObfuscatedName("gv.hs(I)V")
    public static final void method3582() {
        for (class65 var0 = (class65) field495.method5535(); var0 != null; var0 = (class65) field495.method5537()) {
            if (Statics.field1356 != var0.field859 || var0.field861) {
                var0.method6497();
            } else if (field552 >= var0.field864) {
                var0.method1787(field556);
                if (var0.field861) {
                    var0.method6497();
                } else {
                    Statics.field4239.method3919(var0.field859, var0.field855, var0.field852, var0.field857, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("pr.hy(I)I")
    public static final int method6862() {
        if (Statics.field109.method2137()) {
            return Statics.field1356;
        }
        int var0 = 3;
        if (Statics.field2593 < 310) {
            int var1;
            int var2;
            if (field770 == 1) {
                var1 = Statics.field1039 >> 7;
                var2 = Statics.field1658 >> 7;
            } else {
                var1 = Statics.field1366.field1137 >> 7;
                var2 = Statics.field1366.field1131 >> 7;
            }
            int var3 = Statics.field104 >> 7;
            int var4 = Statics.field2761 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field1356;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1356;
            }
            if ((class75.field996[Statics.field1356][var3][var4] & 0x4) != 0) {
                var0 = Statics.field1356;
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
                    if ((class75.field996[Statics.field1356][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1356;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class75.field996[Statics.field1356][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1356;
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
                    if ((class75.field996[Statics.field1356][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1356;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class75.field996[Statics.field1356][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1356;
                        }
                    }
                }
            }
        }
        if (Statics.field1366.field1137 >= 0 && Statics.field1366.field1131 >= 0 && Statics.field1366.field1137 < 13312 && Statics.field1366.field1131 < 13312) {
            if ((class75.field996[Statics.field1356][Statics.field1366.field1137 >> 7][Statics.field1366.field1131 >> 7] & 0x4) != 0) {
                var0 = Statics.field1356;
            }
            return var0;
        } else {
            return Statics.field1356;
        }
    }

    @ObfuscatedName("lb.he(I)Z")
    public static boolean method5507() {
        return (field671 & 0x2) != 0;
    }

    @ObfuscatedName("eq.hj(I)Z")
    public static boolean method2735() {
        return (field671 & 0x8) != 0;
    }

    @ObfuscatedName("et.hu(Lcj;IIIIII)V")
    public static final void method2887(class87 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2059()) {
            return;
        }
        if (arg0 instanceof class92) {
            class178 var6 = ((class92) arg0).field1263;
            if (var6.field1953 != null) {
                var6 = var6.method3173();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1309;
        int[] var8 = class97.field1310;
        byte var9 = 0;
        if (arg1 < var7 && field552 == arg0.field1186) {
            class85 var10 = (class85) arg0;
            boolean var11;
            if (field671 == 0) {
                var11 = false;
            } else if (Statics.field1366 == var10) {
                var11 = method2735();
            } else {
                boolean var12 = (field671 & 0x4) != 0;
                boolean var13 = var12;
                if (!var12) {
                    boolean var14 = (field671 & 0x1) != 0;
                    var13 = var14 && var10.method2027();
                }
                var11 = var13 || method5507() && var10.method2030();
            }
            if (var11) {
                class85 var15 = (class85) arg0;
                if (arg1 < var7) {
                    int var16 = arg0.field1189 + 15;
                    method4215(arg0.field1137, arg0.field1131, var16);
                    class350 var17 = (class350) field545.get(class417.field4577);
                    byte var18 = 9;
                    var17.method5867(var15.field1114.method7617(), field593 + arg2, field646 + arg3 - var18, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var19 = -2;
        if (!arg0.field1163.method5581()) {
            int var20 = arg0.field1189 + 15;
            method4215(arg0.field1137, arg0.field1131, var20);
            for (class91 var21 = (class91) arg0.field1163.method5577(); var21 != null; var21 = (class91) arg0.field1163.method5579()) {
                class88 var22 = var21.method2239(field552);
                if (var22 != null) {
                    class174 var23 = var21.field1256;
                    class456 var24 = var23.method3125();
                    class456 var25 = var23.method3124();
                    int var26 = 0;
                    int var27;
                    if (var24 == null || var25 == null) {
                        var27 = var23.field1886;
                    } else {
                        if (var23.field1881 * 2 < var25.field4796) {
                            var26 = var23.field1881;
                        }
                        var27 = var25.field4796 - var26 * 2;
                    }
                    int var28 = 255;
                    boolean var29 = true;
                    int var30 = field552 - var22.field1211;
                    int var31 = var22.field1209 * var27 / var23.field1886;
                    int var34;
                    if (var22.field1212 > var30) {
                        int var32 = var23.field1882 == 0 ? 0 : var30 / var23.field1882 * var23.field1882;
                        int var33 = var22.field1210 * var27 / var23.field1886;
                        var34 = (var31 - var33) * var32 / var22.field1212 + var33;
                    } else {
                        var34 = var31;
                        int var35 = var22.field1212 + var23.field1879 - var30;
                        if (var23.field1873 >= 0) {
                            var28 = (var35 << 8) / (var23.field1879 - var23.field1873);
                        }
                    }
                    if (var22.field1209 > 0 && var34 < 1) {
                        var34 = 1;
                    }
                    if (var24 == null || var25 == null) {
                        var19 += 5;
                        if (field593 > -1) {
                            int var41 = field593 + arg2 - (var27 >> 1);
                            int var42 = field646 + arg3 - var19;
                            class452.method7400(var41, var42, var34, 5, 65280);
                            class452.method7400(var34 + var41, var42, var27 - var34, 5, 16711680);
                        }
                        var19 += 2;
                    } else {
                        int var36;
                        if (var27 == var34) {
                            var36 = var26 * 2 + var34;
                        } else {
                            var36 = var26 + var34;
                        }
                        int var37 = var24.field4795;
                        var19 += var37;
                        int var38 = field593 + arg2 - (var27 >> 1);
                        int var39 = field646 + arg3 - var19;
                        int var40 = var38 - var26;
                        if (var28 >= 0 && var28 < 255) {
                            var24.method7465(var40, var39, var28);
                            class452.method7344(var40, var39, var36 + var40, var37 + var39);
                            var25.method7465(var40, var39, var28);
                        } else {
                            var24.method7460(var40, var39);
                            class452.method7344(var40, var39, var36 + var40, var37 + var39);
                            var25.method7460(var40, var39);
                        }
                        class452.method7402(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var19 += 2;
                    }
                } else if (var21.method2240()) {
                    var21.method6497();
                }
            }
        }
        if (var19 == -2) {
            var19 += 7;
        }
        int var43 = var9 + var19;
        if (arg1 < var7) {
            class85 var44 = (class85) arg0;
            if (var44.field1101) {
                return;
            }
            if (var44.field1088 != -1 || var44.field1108 != -1) {
                int var45 = arg0.field1189 + 15;
                method4215(arg0.field1137, arg0.field1131, var45);
                if (field593 > -1) {
                    if (var44.field1088 != -1) {
                        var43 += 25;
                        Statics.field454[var44.field1088].method7460(field593 + arg2 - 12, field646 + arg3 - var43);
                    }
                    if (var44.field1108 != -1) {
                        var43 += 25;
                        Statics.field169[var44.field1108].method7460(field593 + arg2 - 12, field646 + arg3 - var43);
                    }
                }
            }
            if (arg1 >= 0 && field497 == 10 && field499 == var8[arg1]) {
                int var46 = arg0.field1189 + 15;
                method4215(arg0.field1137, arg0.field1131, var46);
                if (field593 > -1) {
                    int var47 = Statics.field1378[1].field4795 + var43;
                    Statics.field1378[1].method7460(field593 + arg2 - 12, field646 + arg3 - var47);
                }
            }
        } else {
            class178 var48 = ((class92) arg0).field1263;
            if (var48.field1953 != null) {
                var48 = var48.method3173();
            }
            if (var48.field1951 >= 0 && var48.field1951 < Statics.field169.length) {
                int var49 = arg0.field1189 + 15;
                method4215(arg0.field1137, arg0.field1131, var49);
                if (field593 > -1) {
                    Statics.field169[var48.field1951].method7460(field593 + arg2 - 12, field646 + arg3 - 30);
                }
            }
            if (field497 == 1 && field594 == field707[arg1 - var7] && field552 % 20 < 10) {
                int var50 = arg0.field1189 + 15;
                method4215(arg0.field1137, arg0.field1131, var50);
                if (field593 > -1) {
                    Statics.field1378[0].method7460(field593 + arg2 - 12, field646 + arg3 - 28);
                }
            }
        }
        if (arg0.field1151 != null && (arg1 >= var7 || !arg0.field1153 && (field715 == 4 || !arg0.field1152 && (field715 == 0 || field715 == 3 || field715 == 1 && ((class85) arg0).method2027())))) {
            int var51 = arg0.field1189;
            method4215(arg0.field1137, arg0.field1131, var51);
            if (field593 > -1 && field666 < field582) {
                field586[field666] = Statics.field1303.method5800(arg0.field1151) / 2;
                field490[field666] = Statics.field1303.field4182;
                field694[field666] = field593;
                field584[field666] = field646;
                field587[field666] = arg0.field1155;
                field577[field666] = arg0.field1160;
                field762[field666] = arg0.field1154;
                field773[field666] = arg0.field1151;
                field666++;
            }
        }
        for (int var52 = 0; var52 < 4; var52++) {
            int var53 = arg0.field1157[var52];
            int var54 = arg0.field1158[var52];
            class186 var55 = null;
            int var56 = 0;
            if (var54 >= 0) {
                if (var53 <= field552) {
                    continue;
                }
                var55 = class186.method2666(arg0.field1158[var52]);
                var56 = var55.field2027;
                if (var55 != null && var55.field2034 != null) {
                    var55 = var55.method3296();
                    if (var55 == null) {
                        arg0.field1157[var52] = -1;
                        continue;
                    }
                }
            } else if (var53 < 0) {
                continue;
            }
            int var57 = arg0.field1167[var52];
            class186 var58 = null;
            if (var57 >= 0) {
                var58 = class186.method2666(var57);
                if (var58 != null && var58.field2034 != null) {
                    var58 = var58.method3296();
                }
            }
            if (var53 - var56 <= field552) {
                if (var55 == null) {
                    arg0.field1157[var52] = -1;
                } else {
                    int var59 = arg0.field1189 / 2;
                    method4215(arg0.field1137, arg0.field1131, var59);
                    if (field593 > -1) {
                        boolean var60 = true;
                        if (var52 == 1) {
                            field646 -= 20;
                        }
                        if (var52 == 2) {
                            field593 -= 15;
                            field646 -= 10;
                        }
                        if (var52 == 3) {
                            field593 += 15;
                            field646 -= 10;
                        }
                        Object var61 = null;
                        Object var62 = null;
                        Object var63 = null;
                        Object var64 = null;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        class456 var73 = null;
                        class456 var74 = null;
                        class456 var75 = null;
                        class456 var76 = null;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        int var82 = 0;
                        int var83 = 0;
                        int var84 = 0;
                        int var85 = 0;
                        class456 var86 = var55.method3298();
                        if (var86 != null) {
                            var65 = var86.field4796;
                            int var87 = var86.field4795;
                            if (var87 > var85) {
                                var85 = var87;
                            }
                            var69 = var86.field4797;
                        }
                        class456 var88 = var55.method3318();
                        if (var88 != null) {
                            var66 = var88.field4796;
                            int var89 = var88.field4795;
                            if (var89 > var85) {
                                var85 = var89;
                            }
                            var70 = var88.field4797;
                        }
                        class456 var90 = var55.method3300();
                        if (var90 != null) {
                            var67 = var90.field4796;
                            int var91 = var90.field4795;
                            if (var91 > var85) {
                                var85 = var91;
                            }
                            var71 = var90.field4797;
                        }
                        class456 var92 = var55.method3301();
                        if (var92 != null) {
                            var68 = var92.field4796;
                            int var93 = var92.field4795;
                            if (var93 > var85) {
                                var85 = var93;
                            }
                            var72 = var92.field4797;
                        }
                        if (var58 != null) {
                            var73 = var58.method3298();
                            if (var73 != null) {
                                var77 = var73.field4796;
                                int var94 = var73.field4795;
                                if (var94 > var85) {
                                    var85 = var94;
                                }
                                var81 = var73.field4797;
                            }
                            var74 = var58.method3318();
                            if (var74 != null) {
                                var78 = var74.field4796;
                                int var95 = var74.field4795;
                                if (var95 > var85) {
                                    var85 = var95;
                                }
                                var82 = var74.field4797;
                            }
                            var75 = var58.method3300();
                            if (var75 != null) {
                                var79 = var75.field4796;
                                int var96 = var75.field4795;
                                if (var96 > var85) {
                                    var85 = var96;
                                }
                                var83 = var75.field4797;
                            }
                            var76 = var58.method3301();
                            if (var76 != null) {
                                var80 = var76.field4796;
                                int var97 = var76.field4795;
                                if (var97 > var85) {
                                    var85 = var97;
                                }
                                var84 = var76.field4797;
                            }
                        }
                        class349 var98 = var55.method3302();
                        if (var98 == null) {
                            var98 = Statics.field226;
                        }
                        class349 var99;
                        if (var58 == null) {
                            var99 = Statics.field226;
                        } else {
                            var99 = var58.method3302();
                            if (var99 == null) {
                                var99 = Statics.field226;
                            }
                        }
                        Object var100 = null;
                        String var101 = null;
                        boolean var102 = false;
                        int var103 = 0;
                        String var104 = var55.method3310(arg0.field1159[var52]);
                        int var105 = var98.method5800(var104);
                        if (var58 != null) {
                            var101 = var58.method3310(arg0.field1188[var52]);
                            var103 = var99.method5800(var101);
                        }
                        int var106 = 0;
                        int var107 = 0;
                        if (var66 > 0) {
                            if (var90 == null && var92 == null) {
                                var106 = 1;
                            } else {
                                var106 = var105 / var66 + 1;
                            }
                        }
                        if (var58 != null && var78 > 0) {
                            if (var75 == null && var76 == null) {
                                var107 = 1;
                            } else {
                                var107 = var103 / var78 + 1;
                            }
                        }
                        int var108 = 0;
                        int var109 = var108;
                        if (var65 > 0) {
                            var108 += var65;
                        }
                        var108 += 2;
                        int var110 = var108;
                        if (var67 > 0) {
                            var108 += var67;
                        }
                        int var111 = var108;
                        int var112 = var108;
                        int var114;
                        if (var66 > 0) {
                            int var113 = var66 * var106;
                            var114 = var108 + var113;
                            var112 = (var113 - var105) / 2 + var108;
                        } else {
                            var114 = var105 + var108;
                        }
                        int var115 = var114;
                        if (var68 > 0) {
                            var114 += var68;
                        }
                        int var116 = 0;
                        int var117 = 0;
                        int var118 = 0;
                        int var119 = 0;
                        int var120 = 0;
                        if (var58 != null) {
                            var114 += 2;
                            var116 = var114;
                            if (var77 > 0) {
                                var114 += var77;
                            }
                            var114 += 2;
                            var117 = var114;
                            if (var79 > 0) {
                                var114 += var79;
                            }
                            var118 = var114;
                            var120 = var114;
                            if (var78 > 0) {
                                int var121 = var78 * var107;
                                var114 += var121;
                                var120 += (var121 - var103) / 2;
                            } else {
                                var114 += var103;
                            }
                            var119 = var114;
                            if (var80 > 0) {
                                var114 += var80;
                            }
                        }
                        int var122 = arg0.field1157[var52] - field552;
                        int var123 = var55.field2032 - var55.field2032 * var122 / var55.field2027;
                        int var124 = var55.field2033 * var122 / var55.field2027 + -var55.field2033;
                        int var125 = field593 + arg2 - (var114 >> 1) + var123;
                        int var126 = field646 + arg3 - 12 + var124;
                        int var127 = var126;
                        int var128 = var85 + var126;
                        int var129 = var55.field2020 + var126 + 15;
                        int var130 = var129 - var98.field4179;
                        int var131 = var98.field4180 + var129;
                        if (var130 < var126) {
                            var127 = var130;
                        }
                        if (var131 > var128) {
                            var128 = var131;
                        }
                        int var132 = 0;
                        if (var58 != null) {
                            var132 = var58.field2020 + var126 + 15;
                            int var133 = var132 - var99.field4179;
                            int var134 = var99.field4180 + var132;
                            if (var133 < var127) {
                                ;
                            }
                            if (var134 > var128) {
                                ;
                            }
                        }
                        int var137 = 255;
                        if (var55.field2031 >= 0) {
                            var137 = (var122 << 8) / (var55.field2027 - var55.field2031);
                        }
                        if (var137 >= 0 && var137 < 255) {
                            if (var86 != null) {
                                var86.method7465(var109 + var125 - var69, var126, var137);
                            }
                            if (var90 != null) {
                                var90.method7465(var110 + var125 - var71, var126, var137);
                            }
                            if (var88 != null) {
                                for (int var138 = 0; var138 < var106; var138++) {
                                    var88.method7465(var66 * var138 + (var111 + var125 - var70), var126, var137);
                                }
                            }
                            if (var92 != null) {
                                var92.method7465(var115 + var125 - var72, var126, var137);
                            }
                            var98.method5884(var104, var112 + var125, var129, var55.field2037, 0, var137);
                            if (var58 != null) {
                                if (var73 != null) {
                                    var73.method7465(var116 + var125 - var81, var126, var137);
                                }
                                if (var75 != null) {
                                    var75.method7465(var117 + var125 - var83, var126, var137);
                                }
                                if (var74 != null) {
                                    for (int var139 = 0; var139 < var107; var139++) {
                                        var74.method7465(var78 * var139 + (var118 + var125 - var82), var126, var137);
                                    }
                                }
                                if (var76 != null) {
                                    var76.method7465(var119 + var125 - var84, var126, var137);
                                }
                                var99.method5884(var101, var120 + var125, var132, var58.field2037, 0, var137);
                            }
                        } else {
                            if (var86 != null) {
                                var86.method7460(var109 + var125 - var69, var126);
                            }
                            if (var90 != null) {
                                var90.method7460(var110 + var125 - var71, var126);
                            }
                            if (var88 != null) {
                                for (int var140 = 0; var140 < var106; var140++) {
                                    var88.method7460(var66 * var140 + (var111 + var125 - var70), var126);
                                }
                            }
                            if (var92 != null) {
                                var92.method7460(var115 + var125 - var72, var126);
                            }
                            var98.method5806(var104, var112 + var125, var129, var55.field2037 | 0xFF000000, 0);
                            if (var58 != null) {
                                if (var73 != null) {
                                    var73.method7460(var116 + var125 - var81, var126);
                                }
                                if (var75 != null) {
                                    var75.method7460(var117 + var125 - var83, var126);
                                }
                                if (var74 != null) {
                                    for (int var141 = 0; var141 < var107; var141++) {
                                        var74.method7460(var78 * var141 + (var118 + var125 - var82), var126);
                                    }
                                }
                                if (var76 != null) {
                                    var76.method7460(var119 + var125 - var84, var126);
                                }
                                var99.method5806(var101, var120 + var125, var132, var58.field2037 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("oe.hx(I)V")
    public static final void method6726() {
        field608 = 0;
        int var0 = (Statics.field1366.field1137 >> 7) + Statics.field168;
        int var1 = (Statics.field1366.field1131 >> 7) + Statics.field2674;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field608 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field608 = 1;
        }
        if (field608 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field608 = 0;
        }
    }

    @ObfuscatedName("cn.hi(IIIII)V")
    public static final void method2241(int arg0, int arg1, int arg2, int arg3) {
        method6726();
    }

    @ObfuscatedName("ha.hl(IIII)V")
    public static final void method4215(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field593 = -1;
            field646 = -1;
            return;
        }
        int var3 = method4195(arg0, arg1, Statics.field1356) - arg2;
        int var4 = arg0 - Statics.field104;
        int var5 = var3 - Statics.field90;
        int var6 = arg1 - Statics.field2761;
        int var7 = class201.field2363[Statics.field2593];
        int var8 = class201.field2352[Statics.field2593];
        int var9 = class201.field2363[Statics.field317];
        int var10 = class201.field2352[Statics.field317];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field593 = field761 * var11 / var15 + field759 / 2;
            field646 = field761 * var14 / var15 + field506 / 2;
        } else {
            field593 = -1;
            field646 = -1;
        }
    }

    @ObfuscatedName("hu.hr(IIII)I")
    public static final int method4195(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class75.field996[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class75.field1011[var5][var3][var4] + class75.field1011[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class75.field1011[var5][var3][var4 + 1] + class75.field1011[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("o.hb(IIIIIIII)V")
    public static final void method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field603 - field553) * var7 / 100 + field553;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class201.field2363[var11];
            int var17 = class201.field2352[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class201.field2363[var12];
            int var20 = class201.field2352[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        if (field760) {
            Statics.field847 = arg0 - var13;
            Statics.field2744 = arg1 - var14;
            Statics.field2623 = arg2 - var15;
            Statics.field403 = arg3;
            Statics.field4424 = arg4;
        } else {
            Statics.field104 = arg0 - var13;
            Statics.field90 = arg1 - var14;
            Statics.field2761 = arg2 - var15;
            Statics.field2593 = arg3;
            Statics.field317 = arg4;
        }
        if (field770 != 1 || field664 < 2 || field552 % 50 != 0 || !(Statics.field1039 >> 7 != Statics.field1366.field1137 >> 7 || Statics.field1658 >> 7 != Statics.field1366.field1131 >> 7)) {
            return;
        }
        int var22 = Statics.field1366.field1107;
        int var23 = (Statics.field1039 >> 7) + Statics.field168;
        int var24 = (Statics.field1658 >> 7) + Statics.field2674;
        class264 var25 = class264.method3158(class262.field2967, field541.field1344);
        var25.field3031.method7077(var22);
        var25.field3031.method7085(var24);
        var25.field3031.method7074(field636);
        var25.field3031.method7085(var23);
        field541.method2378(var25);
    }

    @ObfuscatedName("ke.hh(ZLpq;I)V")
    public static final void method5188(boolean arg0, class442 arg1) {
        field560 = arg0;
        if (!field560) {
            int var2 = arg1.method7049();
            int var3 = arg1.method7049();
            int var4 = arg1.method7049();
            Statics.field2727 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2727[var5][var6] = arg1.method7052();
                }
            }
            Statics.field476 = new int[var4];
            Statics.field296 = new int[var4];
            Statics.field828 = new int[var4];
            Statics.field1161 = new byte[var4][];
            Statics.field1678 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field476[var7] = var10;
                    Statics.field296[var7] = Statics.field2793.method5349("m" + var8 + "_" + var9);
                    Statics.field828[var7] = Statics.field2793.method5349("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method6727(var3, var2, true);
            return;
        }
        int var11 = arg1.method7049();
        boolean var12 = arg1.method7047() == 1;
        int var13 = arg1.method7049();
        int var14 = arg1.method7049();
        arg1.method6991();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method6992(1);
                    if (var18 == 1) {
                        field496[var15][var16][var17] = arg1.method6992(26);
                    } else {
                        field496[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method6993();
        Statics.field2727 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field2727[var19][var20] = arg1.method7052();
            }
        }
        Statics.field476 = new int[var14];
        Statics.field296 = new int[var14];
        Statics.field828 = new int[var14];
        Statics.field1161 = new byte[var14][];
        Statics.field1678 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field496[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field476[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field476[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field296[var21] = Statics.field2793.method5349("m" + var30 + "_" + var31);
                            Statics.field828[var21] = Statics.field2793.method5349("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method6727(var13, var11, !var12);
    }

    @ObfuscatedName("oe.ha(IIZI)V")
    public static final void method6727(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field4071 == arg0 && Statics.field467 == arg1) {
            return;
        }
        Statics.field4071 = arg0;
        Statics.field467 = arg1;
        method2093(25);
        method3549(class308.field3627, true);
        int var3 = Statics.field168;
        int var4 = Statics.field2674;
        Statics.field168 = (arg0 - 6) * 8;
        Statics.field2674 = (arg1 - 6) * 8;
        int var5 = Statics.field168 - var3;
        int var6 = Statics.field2674 - var4;
        int var7 = Statics.field168;
        int var8 = Statics.field2674;
        for (int var9 = 0; var9 < 32768; var9++) {
            class92 var10 = field742[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1200[var11] -= var5;
                    var10.field1201[var11] -= var6;
                }
                var10.field1137 -= var5 * 128;
                var10.field1131 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class85 var13 = field643[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1200[var14] -= var5;
                    var13.field1201[var14] -= var6;
                }
                var13.field1137 -= var5 * 128;
                var13.field1131 -= var6 * 128;
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
                        field623[var25][var21][var22] = field623[var25][var23][var24];
                    } else {
                        field623[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class86 var26 = (class86) field624.method5535(); var26 != null; var26 = (class86) field624.method5537()) {
            var26.field1119 -= var5;
            var26.field1117 -= var6;
            if (var26.field1119 < 0 || var26.field1117 < 0 || var26.field1119 >= 104 || var26.field1117 >= 104) {
                var26.method6497();
            }
        }
        if (field493 != 0) {
            field493 -= var5;
            field732 -= var6;
        }
        field489 = 0;
        field760 = false;
        Statics.field104 -= var5 << 7;
        Statics.field2761 -= var6 << 7;
        Statics.field1039 -= var5 << 7;
        Statics.field1658 -= var6 << 7;
        field726 = -1;
        field495.method5560();
        field625.method5560();
        for (int var27 = 0; var27 < 4; var27++) {
            field629[var27].method3552();
        }
    }

    @ObfuscatedName("bi.hq(ZI)V")
    public static final void method1886(boolean arg0) {
        method4007();
        field541.field1350++;
        if (field541.field1350 < 50 && !arg0) {
            return;
        }
        field541.field1350 = 0;
        if (field543 || field541.method2388() == null) {
            return;
        }
        class264 var1 = class264.method3158(class262.field2970, field541.field1344);
        field541.method2378(var1);
        try {
            field541.method2385();
        } catch (IOException var3) {
            field543 = true;
        }
    }

    @ObfuscatedName("be.ht(IIIIIS)V")
    public static final void method946(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field4239.method3854(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field4239.method3951(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class212.method317(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field1984.field4804;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class212.method937(var5);
            class187 var14 = class187.method3000(var13);
            if (var14.field2090 == -1) {
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
                class455 var15 = Statics.field75[var14.field2090];
                if (var15 != null) {
                    int var16 = (var14.field2046 * 4 - var15.field4789) / 2;
                    int var17 = (var14.field2057 * 4 - var15.field4790) / 2;
                    var15.method7431(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field2057) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field4239.method3852(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field4239.method3951(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class212.method937(var18);
            class187 var24 = class187.method3000(var23);
            if (var24.field2090 != -1) {
                class455 var25 = Statics.field75[var24.field2090];
                if (var25 != null) {
                    int var26 = (var24.field2046 * 4 - var25.field4789) / 2;
                    int var27 = (var24.field2057 * 4 - var25.field4790) / 2;
                    var25.method7431(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field2057) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class212.method317(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field1984.field4804;
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
        long var31 = Statics.field4239.method3853(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class212.method937(var31);
        class187 var34 = class187.method3000(var33);
        if (var34.field2090 == -1) {
            return;
        }
        class455 var35 = Statics.field75[var34.field2090];
        if (var35 != null) {
            int var36 = (var34.field2046 * 4 - var35.field4789) / 2;
            int var37 = (var34.field2057 * 4 - var35.field4790) / 2;
            var35.method7431(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field2057) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hg(Lcs;II)Z")
    public boolean method1042(class100 arg0, int arg1) {
        if (arg0.field1347 == 0) {
            Statics.field3294 = null;
        } else {
            if (Statics.field3294 == null) {
                Statics.field3294 = new class367(Statics.field1888, Statics.field4220);
            }
            Statics.field3294.method6008(arg0.field1345, arg1);
        }
        method4704();
        arg0.field1346 = null;
        return true;
    }

    @ObfuscatedName("client.hn(Lcs;I)Z")
    public boolean method1294(class100 arg0) {
        if (Statics.field3294 != null) {
            Statics.field3294.method6024(arg0.field1345);
        }
        method4704();
        arg0.field1346 = null;
        return true;
    }

    @ObfuscatedName("client.hm(Lcs;B)Z")
    public final boolean method1044(class100 arg0) {
        class377 var2 = arg0.method2388();
        class442 var3 = arg0.field1345;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1346 == null) {
                if (arg0.field1342) {
                    if (!var2.method6191(1)) {
                        return false;
                    }
                    var2.method6194(arg0.field1345.field4701, 0, 1);
                    arg0.field1343 = 0;
                    arg0.field1342 = false;
                }
                var3.field4700 = 0;
                if (var3.method6988()) {
                    if (!var2.method6191(1)) {
                        return false;
                    }
                    var2.method6194(arg0.field1345.field4701, 1, 1);
                    arg0.field1343 = 0;
                }
                arg0.field1342 = true;
                class265[] var4 = class265.method3227();
                int var5 = var3.method6989();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4700);
                }
                arg0.field1346 = var4[var5];
                arg0.field1347 = arg0.field1346.field3037;
            }
            if (arg0.field1347 == -1) {
                if (!var2.method6191(1)) {
                    return false;
                }
                arg0.method2388().method6194(var3.field4701, 0, 1);
                arg0.field1347 = var3.field4701[0] & 0xFF;
            }
            if (arg0.field1347 == -2) {
                if (!var2.method6191(2)) {
                    return false;
                }
                arg0.method2388().method6194(var3.field4701, 0, 2);
                var3.field4700 = 0;
                arg0.field1347 = var3.method7049();
            }
            if (!var2.method6191(arg0.field1347)) {
                return false;
            }
            var3.field4700 = 0;
            var2.method6194(var3.field4701, 0, arg0.field1347);
            arg0.field1343 = 0;
            field544.method5938();
            arg0.field1353 = arg0.field1348;
            arg0.field1348 = arg0.field1351;
            arg0.field1351 = arg0.field1346;
            if (class265.field3052 == arg0.field1346) {
                method4585(class263.field3024);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3124 == arg0.field1346) {
                int var6 = var3.method7080();
                int var7 = var3.method7090();
                int var8 = var3.method7090();
                int var9 = var3.method7162();
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = (var9 >> 4 & 0x7) + var10;
                int var13 = (var9 & 0x7) + var11;
                if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                    int var14 = var12 * 128 + 64;
                    int var15 = var13 * 128 + 64;
                    class65 var16 = new class65(var8, Statics.field1356, var14, var15, method4195(var14, var15, Statics.field1356) - var6, var7, field552);
                    field495.method5530(var16);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3076 == arg0.field1346) {
                int var17 = var3.method7047();
                method6259(var17);
                arg0.field1346 = null;
                return false;
            }
            if (class265.field3125 == arg0.field1346) {
                if (Statics.field4585 == null) {
                    Statics.field4585 = new class392(Statics.field4120);
                }
                class451 var18 = Statics.field4120.method6429(var3);
                Statics.field4585.field4425.method6789(var18.field4766, var18.field4767);
                field687[++field688 - 1 & 0x1F] = var18.field4766;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3086 == arg0.field1346) {
                int var19 = var3.method7052();
                int var20 = var3.method7047();
                int var21 = var3.method7049();
                class80 var22 = (class80) field656.method6765((long) var19);
                if (var22 != null) {
                    method4939(var22, var22.field1043 != var21);
                }
                method5500(var19, var21, var20);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3046 == arg0.field1346) {
                String var23 = var3.method7057();
                long var24 = var3.method7106();
                long var26 = (long) var3.method7049();
                long var28 = (long) var3.method7051();
                class310 var30 = (class310) class329.method2087(class310.method715(), var3.method7047());
                long var31 = (var26 << 32) + var28;
                boolean var33 = false;
                for (int var34 = 0; var34 < 100; var34++) {
                    if (field718[var34] == var31) {
                        var33 = true;
                        break;
                    }
                }
                if (var30.field3965 && Statics.field1116.method1551(new class464(var23, Statics.field1888))) {
                    var33 = true;
                }
                if (!var33 && field608 == 0) {
                    field718[field609] = var31;
                    field609 = (field609 + 1) % 100;
                    String var35 = class350.method5804(class343.method5232(class282.method2722(var3)));
                    if (var30.field3963 == -1) {
                        class99.method1882(9, var23, var35, class345.method4529(var24));
                    } else {
                        class99.method1882(9, class93.method1971(var30.field3963) + var23, var35, class345.method4529(var24));
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3135 == arg0.field1346) {
                int var36 = arg0.field1347 + var3.field4700;
                int var37 = var3.method7049();
                int var38 = var3.method7049();
                if (field655 != var37) {
                    field655 = var37;
                    this.method1048(false);
                    Statics.method177(field655);
                    class64.method4222(field655);
                    for (int var39 = 0; var39 < 100; var39++) {
                        field704[var39] = true;
                    }
                }
                while (var38-- > 0) {
                    int var40 = var3.method7052();
                    int var41 = var3.method7049();
                    int var42 = var3.method7047();
                    class80 var43 = (class80) field656.method6765((long) var40);
                    if (var43 != null && var43.field1043 != var41) {
                        method4939(var43, true);
                        var43 = null;
                    }
                    if (var43 == null) {
                        var43 = method5500(var40, var41, var42);
                    }
                    var43.field1041 = true;
                }
                for (class80 var44 = (class80) field656.method6766(); var44 != null; var44 = (class80) field656.method6767()) {
                    if (var44.field1041) {
                        var44.field1041 = false;
                    } else {
                        method4939(var44, true);
                    }
                }
                field569 = new class420(512);
                while (var3.field4700 < var36) {
                    int var45 = var3.method7052();
                    int var46 = var3.method7049();
                    int var47 = var3.method7049();
                    int var48 = var3.method7052();
                    for (int var49 = var46; var49 <= var47; var49++) {
                        long var50 = ((long) var45 << 32) + (long) var49;
                        field569.method6774(new class409(var48), var50);
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3045 == arg0.field1346) {
                for (int var52 = 0; var52 < field643.length; var52++) {
                    if (field643[var52] != null) {
                        field643[var52].field1171 = -1;
                    }
                }
                for (int var53 = 0; var53 < field742.length; var53++) {
                    if (field742[var53] != null) {
                        field742[var53].field1171 = -1;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3069 == arg0.field1346) {
                field760 = false;
                for (int var54 = 0; var54 < 5; var54++) {
                    field744[var54] = false;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3091 == arg0.field1346) {
                class97.method2817(var3, arg0.field1347);
                method2011();
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3051 == arg0.field1346) {
                method4585(class263.field3025);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3055 == arg0.field1346) {
                method4585(class263.field3018);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3104 == arg0.field1346) {
                field497 = var3.method7047();
                if (field497 == 1) {
                    field594 = var3.method7049();
                }
                if (field497 >= 2 && field497 <= 6) {
                    if (field497 == 2) {
                        field503 = 64;
                        field504 = 64;
                    }
                    if (field497 == 3) {
                        field503 = 0;
                        field504 = 64;
                    }
                    if (field497 == 4) {
                        field503 = 128;
                        field504 = 64;
                    }
                    if (field497 == 5) {
                        field503 = 64;
                        field504 = 0;
                    }
                    if (field497 == 6) {
                        field503 = 64;
                        field504 = 128;
                    }
                    field497 = 2;
                    field500 = var3.method7049();
                    field758 = var3.method7049();
                    field502 = var3.method7047();
                }
                if (field497 == 10) {
                    field499 = var3.method7049();
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3136 == arg0.field1346) {
                Statics.field3559 = var3.method7079();
                Statics.field54 = var3.method7080();
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3096 == arg0.field1346) {
                boolean var55 = var3.method7047() == 1;
                int var56 = var3.method7099();
                class294 var57 = class294.method2818(var56);
                if (var57.field3446 != var55) {
                    var57.field3446 = var55;
                    method1899(var57);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3130 == arg0.field1346) {
                int var58 = var3.method7052();
                class294 var59 = class294.method2818(var58);
                var59.field3436 = 3;
                var59.field3414 = Statics.field1366.field1087.method5045();
                method1899(var59);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3044 == arg0.field1346) {
                int var60 = var3.method7089();
                int var61 = var3.method7101();
                class294 var62 = class294.method2818(var61);
                if (var62 != null && var62.field3371 == 0) {
                    if (var60 > var62.field3393 - var62.field3385) {
                        var60 = var62.field3393 - var62.field3385;
                    }
                    if (var60 < 0) {
                        var60 = 0;
                    }
                    if (var62.field3391 != var60) {
                        var62.field3391 = var60;
                        method1899(var62);
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3107 == arg0.field1346) {
                Statics.field1367 = true;
                method2439(false, var3);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3080 == arg0.field1346) {
                field673 = var3.method7088() * 30;
                field696 = field680;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3078 == arg0.field1346) {
                int var63 = var3.method7052();
                if (field636 != var63) {
                    field636 = var63;
                    method3007();
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3095 == arg0.field1346) {
                int var64 = var3.method7047();
                if (var3.method7047() == 0) {
                    field723[var64] = new class324();
                    var3.field4700 += 18;
                } else {
                    var3.field4700--;
                    field723[var64] = new class324(var3, false);
                }
                field481 = field680;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3098 == arg0.field1346) {
                method2439(true, var3);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3090 == arg0.field1346) {
                Statics.field1116.method1547(var3, arg0.field1347);
                field690 = field680;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3074 == arg0.field1346) {
                field733 = var3.method7047();
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3072 == arg0.field1346) {
                int var65 = var3.method7047();
                method4578(var65);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3057 == arg0.field1346) {
                Statics.field1367 = true;
                method2439(true, var3);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3103 == arg0.field1346) {
                int var66 = var3.method7101();
                int var67 = var3.method7089();
                int var68 = var3.method7088();
                class92 var69 = field742[var68];
                if (var69 != null) {
                    var69.field1175 = var67;
                    var69.field1144 = var66 >> 16;
                    var69.field1179 = (var66 & 0xFFFF) + field552;
                    var69.field1177 = 0;
                    var69.field1178 = 0;
                    if (var69.field1179 > field552) {
                        var69.field1177 = -1;
                    }
                    if (var69.field1175 == 65535) {
                        var69.field1175 = -1;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3085 == arg0.field1346) {
                int var70 = var3.method7090();
                field655 = var70;
                this.method1048(false);
                Statics.method177(var70);
                class64.method4222(field655);
                for (int var71 = 0; var71 < 100; var71++) {
                    field704[var71] = true;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3128 == arg0.field1346) {
                for (int var72 = 0; var72 < Statics.field1823; var72++) {
                    class170 var73 = class170.method3238(var72);
                    if (var73 != null) {
                        class288.field3325[var72] = 0;
                        class288.field3326[var72] = 0;
                    }
                }
                method1781();
                field607 += 32;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3116 == arg0.field1346) {
                method2461();
                byte var74 = var3.method7048();
                class132 var75 = new class132(var3);
                class140 var76;
                if (var74 >= 0) {
                    var76 = field724[var74];
                } else {
                    var76 = Statics.field1260;
                }
                var75.method2701(var76);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3061 == arg0.field1346) {
                int var77 = var3.method7089();
                if (var77 == 65535) {
                    var77 = -1;
                }
                int var78 = var3.method7052();
                int var79 = var3.method7101();
                class294 var80 = class294.method2818(var78);
                if (var80.field3485) {
                    var80.field3505 = var77;
                    var80.field3509 = var79;
                    class188 var82 = class188.method3161(var77);
                    var80.field3421 = var82.field2109;
                    var80.field3422 = var82.field2110;
                    var80.field3512 = var82.field2111;
                    var80.field3419 = var82.field2112;
                    var80.field3420 = var82.field2113;
                    var80.field3483 = var82.field2108;
                    if (var82.field2114 == 1) {
                        var80.field3429 = 1;
                    } else {
                        var80.field3429 = 2;
                    }
                    if (var80.field3425 > 0) {
                        var80.field3483 = var80.field3483 * 32 / var80.field3425;
                    } else if (var80.field3395 > 0) {
                        var80.field3483 = var80.field3483 * 32 / var80.field3395;
                    }
                    method1899(var80);
                } else if (var77 == -1) {
                    var80.field3436 = 0;
                    arg0.field1346 = null;
                    return true;
                } else {
                    class188 var81 = class188.method3161(var77);
                    var80.field3436 = 4;
                    var80.field3414 = var77;
                    var80.field3421 = var81.field2109;
                    var80.field3422 = var81.field2110;
                    var80.field3483 = var81.field2108 * 100 / var79;
                    method1899(var80);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3068 == arg0.field1346) {
                method4585(class263.field3023);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3065 == arg0.field1346) {
                field693 = field680;
                byte var83 = var3.method7048();
                if (arg0.field1347 == 1) {
                    if (var83 >= 0) {
                        field725[var83] = null;
                    } else {
                        Statics.field1710 = null;
                    }
                    arg0.field1346 = null;
                    return true;
                }
                if (var83 >= 0) {
                    field725[var83] = new class149(var3);
                } else {
                    Statics.field1710 = new class149(var3);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3064 == arg0.field1346) {
                method4585(class263.field3020);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3133 == arg0.field1346) {
                int var84 = var3.method7090();
                byte var85 = var3.method7266();
                class288.field3325[var84] = var85;
                if (class288.field3326[var84] != var85) {
                    class288.field3326[var84] = var85;
                }
                method5227(var84);
                field681[++field607 - 1 & 0x1F] = var84;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3100 == arg0.field1346) {
                int var86 = var3.method7052();
                int var87 = var3.method7049();
                if (var86 < -70000) {
                    var87 += 32768;
                }
                class294 var88;
                if (var86 >= 0) {
                    var88 = class294.method2818(var86);
                } else {
                    var88 = null;
                }
                if (var88 != null) {
                    for (int var89 = 0; var89 < var88.field3503.length; var89++) {
                        var88.field3503[var89] = 0;
                        var88.field3443[var89] = 0;
                    }
                }
                class78.method3203(var87);
                int var90 = var3.method7049();
                for (int var91 = 0; var91 < var90; var91++) {
                    int var92 = var3.method7080();
                    if (var92 == 255) {
                        var92 = var3.method7052();
                    }
                    int var93 = var3.method7049();
                    if (var88 != null && var91 < var88.field3503.length) {
                        var88.field3503[var91] = var93;
                        var88.field3443[var91] = var92;
                    }
                    class78.method573(var87, var91, var93 - 1, var92);
                }
                if (var88 != null) {
                    method1899(var88);
                }
                method1781();
                field683[++field684 - 1 & 0x1F] = var87 & 0x7FFF;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3067 == arg0.field1346) {
                Statics.field1116.field802.method5996(var3, arg0.field1347);
                method2692();
                field690 = field680;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3106 == arg0.field1346) {
                Statics.field54 = var3.method7047();
                Statics.field3559 = var3.method7079();
                while (var3.field4700 < arg0.field1347) {
                    int var94 = var3.method7047();
                    class263 var95 = class263.method2695()[var94];
                    method4585(var95);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3083 == arg0.field1346) {
                method5188(false, arg0.field1345);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3140 == arg0.field1346) {
                method1781();
                field615 = var3.method7216();
                field696 = field680;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3120 == arg0.field1346) {
                int var96 = var3.method7099();
                int var97 = var3.method7100();
                class80 var98 = (class80) field656.method6765((long) var96);
                class80 var99 = (class80) field656.method6765((long) var97);
                if (var99 != null) {
                    method4939(var99, var98 == null || var98.field1043 != var99.field1043);
                }
                if (var98 != null) {
                    var98.method6497();
                    field656.method6774(var98, (long) var97);
                }
                class294 var100 = class294.method2818(var96);
                if (var100 != null) {
                    method1899(var100);
                }
                class294 var101 = class294.method2818(var97);
                if (var101 != null) {
                    method1899(var101);
                    method6223(Statics.field324[var101.field3369 >>> 16], var101, true);
                }
                if (field655 != -1) {
                    method51(field655, 1);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3138 == arg0.field1346) {
                class34.method2470(var3, arg0.field1347);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3101 == arg0.field1346) {
                int var102 = var3.method7052();
                int var103 = var3.method7216();
                class294 var104 = class294.method2818(var102);
                if (var104.field3417 != var103 || var103 == -1) {
                    var104.field3417 = var103;
                    var104.field3390 = 0;
                    var104.field3401 = 0;
                    method1899(var104);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3117 == arg0.field1346) {
                int var105 = var3.method7051();
                int var106 = var105 >> 16;
                int var107 = var105 >> 8 & 0xFF;
                int var108 = (var105 >> 4 & 0x7) + var106;
                int var109 = (var105 & 0x7) + var107;
                int var110 = var3.method7049();
                int var111 = var3.method7079();
                int var112 = var3.method7081() * 4;
                byte var113 = var3.method7082();
                byte var114 = var3.method7048();
                int var115 = var3.method7049();
                int var116 = var3.method7079();
                int var117 = var3.method7090();
                int var118 = var3.method7079() * 4;
                int var119 = var3.method7093();
                int var120 = var108 + var113;
                int var121 = var109 + var114;
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104 && var110 != 65535) {
                    int var122 = var108 * 128 + 64;
                    int var123 = var109 * 128 + 64;
                    int var124 = var120 * 128 + 64;
                    int var125 = var121 * 128 + 64;
                    class70 var126 = new class70(var110, Statics.field1356, var122, var123, method4195(var122, var123, Statics.field1356) - var118, field552 + var115, field552 + var117, var116, var111, var119, var112);
                    var126.method1863(var124, var125, method4195(var124, var125, Statics.field1356) - var112, field552 + var115);
                    field625.method5530(var126);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3123 == arg0.field1346) {
                Statics.field1116.method1546();
                field690 = field680;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3122 == arg0.field1346) {
                field760 = true;
                field668 = false;
                Statics.field66 = var3.method7047();
                Statics.field1683 = var3.method7047();
                Statics.field1044 = var3.method7049();
                Statics.field3347 = var3.method7047();
                Statics.field1392 = var3.method7047();
                if (Statics.field1392 >= 100) {
                    Statics.field104 = Statics.field66 * 128 + 64;
                    Statics.field2761 = Statics.field1683 * 128 + 64;
                    Statics.field90 = method4195(Statics.field104, Statics.field2761, Statics.field1356) - Statics.field1044;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3063 == arg0.field1346) {
                boolean var127 = var3.method7047() == 1;
                if (var127) {
                    Statics.field3178 = class269.method2567() - var3.method7106();
                    Statics.field1667 = new class317(var3, true);
                } else {
                    Statics.field1667 = null;
                }
                field662 = field680;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3040 == arg0.field1346) {
                int var128 = var3.method7047();
                int var129 = var3.method7047();
                int var130 = var3.method7047();
                int var131 = var3.method7047();
                field744[var128] = true;
                field763[var128] = var129;
                field746[var128] = var130;
                field538[var128] = var131;
                field748[var128] = 0;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3062 == arg0.field1346) {
                field493 = var3.method7047();
                if (field493 == 255) {
                    field493 = 0;
                }
                field732 = var3.method7047();
                if (field732 == 255) {
                    field732 = 0;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3058 == arg0.field1346) {
                int var132 = var3.method7049();
                int var133 = var3.method7088();
                int var134 = var3.method7081();
                if (var132 == 65535) {
                    var132 = -1;
                }
                class92 var135 = field742[var133];
                if (var135 != null) {
                    if (var135.field1171 == var132 && var132 != -1) {
                        int var136 = class190.method983(var132).field2175;
                        if (var136 == 1) {
                            var135.field1176 = 0;
                            var135.field1173 = 0;
                            var135.field1174 = var134;
                            var135.field1191 = 0;
                        } else if (var136 == 2) {
                            var135.field1191 = 0;
                        }
                    } else if (var132 == -1 || var135.field1171 == -1 || class190.method983(var132).field2184 >= class190.method983(var135.field1171).field2184) {
                        var135.field1171 = var132;
                        var135.field1176 = 0;
                        var135.field1173 = 0;
                        var135.field1174 = var134;
                        var135.field1191 = 0;
                        var135.field1204 = var135.field1199;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3137 == arg0.field1346) {
                String var137 = var3.method7057();
                String var138 = class350.method5804(class343.method5232(class282.method2722(var3)));
                class99.method5035(6, var137, var138);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3143 == arg0.field1346) {
                Statics.field54 = var3.method7080();
                Statics.field3559 = var3.method7081();
                for (int var139 = Statics.field54; var139 < Statics.field54 + 8; var139++) {
                    for (int var140 = Statics.field3559; var140 < Statics.field3559 + 8; var140++) {
                        if (field623[Statics.field1356][var139][var140] != null) {
                            field623[Statics.field1356][var139][var140] = null;
                            method2713(var139, var140);
                        }
                    }
                }
                for (class86 var141 = (class86) field624.method5535(); var141 != null; var141 = (class86) field624.method5537()) {
                    if (var141.field1119 >= Statics.field54 && var141.field1119 < Statics.field54 + 8 && var141.field1117 >= Statics.field3559 && var141.field1117 < Statics.field3559 + 8 && Statics.field1356 == var141.field1129) {
                        var141.field1128 = 0;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3126 == arg0.field1346) {
                method4585(class263.field3019);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3082 == arg0.field1346) {
                int var142 = var3.method7090();
                int var143 = var3.method7099();
                class288.field3325[var142] = var143;
                if (class288.field3326[var142] != var143) {
                    class288.field3326[var142] = var143;
                }
                method5227(var142);
                field681[++field607 - 1 & 0x1F] = var142;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3081 == arg0.field1346) {
                int var144 = var3.method7101();
                class294 var145 = class294.method2818(var144);
                for (int var146 = 0; var146 < var145.field3503.length; var146++) {
                    var145.field3503[var146] = -1;
                    var145.field3503[var146] = 0;
                }
                method1899(var145);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3038 == arg0.field1346) {
                int var147 = var3.method7101();
                int var148 = var3.method7088();
                if (var148 == 65535) {
                    var148 = -1;
                }
                int var149 = var3.method7100();
                int var150 = var3.method7089();
                if (var150 == 65535) {
                    var150 = -1;
                }
                for (int var151 = var150; var151 <= var148; var151++) {
                    long var152 = ((long) var149 << 32) + (long) var151;
                    class410 var154 = field569.method6765(var152);
                    if (var154 != null) {
                        var154.method6497();
                    }
                    field569.method6774(new class409(var147), var152);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3108 == arg0.field1346) {
                method2012();
                arg0.field1346 = null;
                return false;
            }
            if (class265.field3118 == arg0.field1346) {
                int var155 = var3.method7100();
                int var156 = var3.method7090();
                int var157 = var3.method7049();
                class294 var158 = class294.method2818(var155);
                var158.field3374 = (var157 << 16) + var156;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3102 == arg0.field1346) {
                int var159 = var3.method7049();
                if (var159 == 65535) {
                    var159 = -1;
                }
                method175(var159);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3060 == arg0.field1346) {
                int var160 = var3.method7089();
                if (var160 == 65535) {
                    var160 = -1;
                }
                int var161 = var3.method7162();
                Statics.method692(var160, var161);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3073 == arg0.field1346) {
                Statics.field4585 = null;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3132 == arg0.field1346) {
                method2461();
                byte var162 = var3.method7048();
                if (arg0.field1347 == 1) {
                    if (var162 >= 0) {
                        field724[var162] = null;
                    } else {
                        Statics.field1260 = null;
                    }
                    arg0.field1346 = null;
                    return true;
                }
                if (var162 >= 0) {
                    field724[var162] = new class140(var3);
                } else {
                    Statics.field1260 = new class140(var3);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3041 == arg0.field1346) {
                method4585(class263.field3021);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3056 == arg0.field1346) {
                if (field655 != -1) {
                    method51(field655, 0);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3110 == arg0.field1346) {
                method10(var3.method7057());
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3077 == arg0.field1346) {
                Statics.field4585 = new class392(Statics.field4120);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3075 == arg0.field1346) {
                int var163 = var3.method7090();
                int var164 = var3.method7089();
                int var165 = var3.method7100();
                int var166 = var3.method7089();
                class294 var167 = class294.method2818(var165);
                if (var167.field3421 != var166 || var167.field3422 != var164 || var167.field3483 != var163) {
                    var167.field3421 = var166;
                    var167.field3422 = var164;
                    var167.field3483 = var163;
                    method1899(var167);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3115 == arg0.field1346) {
                String var168 = var3.method7057();
                int var169 = var3.method7080();
                int var170 = var3.method7080();
                if (var170 >= 1 && var170 <= 8) {
                    if (var168.equalsIgnoreCase(class308.field3624)) {
                        var168 = null;
                    }
                    field546[var170 - 1] = var168;
                    field620[var170 - 1] = var169 == 0;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3043 == arg0.field1346) {
                int var171 = var3.method7052();
                int var172 = var3.method7049();
                if (var171 < -70000) {
                    var172 += 32768;
                }
                class294 var173;
                if (var171 >= 0) {
                    var173 = class294.method2818(var171);
                } else {
                    var173 = null;
                }
                while (var3.field4700 < arg0.field1347) {
                    int var174 = var3.method7062();
                    int var175 = var3.method7049();
                    int var176 = 0;
                    if (var175 != 0) {
                        var176 = var3.method7047();
                        if (var176 == 255) {
                            var176 = var3.method7052();
                        }
                    }
                    if (var173 != null && var174 >= 0 && var174 < var173.field3503.length) {
                        var173.field3503[var174] = var175;
                        var173.field3443[var174] = var176;
                    }
                    class78.method573(var172, var174, var175 - 1, var176);
                }
                if (var173 != null) {
                    method1899(var173);
                }
                method1781();
                field683[++field684 - 1 & 0x1F] = var172 & 0x7FFF;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3139 == arg0.field1346) {
                int var177 = var3.method7100();
                int var178 = var3.method7089();
                class294 var179 = class294.method2818(var177);
                if (var179.field3436 != 2 || var179.field3414 != var178) {
                    var179.field3436 = 2;
                    var179.field3414 = var178;
                    method1899(var179);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3127 == arg0.field1346) {
                int var180 = var3.method7049();
                int var181 = var3.method7099();
                class294 var182 = class294.method2818(var181);
                if (var182.field3436 != 1 || var182.field3414 != var180) {
                    var182.field3436 = 1;
                    var182.field3414 = var180;
                    method1899(var182);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3042 == arg0.field1346) {
                int var183 = var3.method7090();
                int var184 = var3.method7100();
                int var185 = var183 >> 10 & 0x1F;
                int var186 = var183 >> 5 & 0x1F;
                int var187 = var183 & 0x1F;
                int var188 = (var187 << 3) + (var185 << 19) + (var186 << 11);
                class294 var189 = class294.method2818(var184);
                if (var189.field3442 != var188) {
                    var189.field3442 = var188;
                    method1899(var189);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3084 == arg0.field1346) {
                String var190 = var3.method7057();
                long var191 = (long) var3.method7049();
                long var193 = (long) var3.method7051();
                class310 var195 = (class310) class329.method2087(class310.method715(), var3.method7047());
                long var196 = (var191 << 32) + var193;
                boolean var198 = false;
                for (int var199 = 0; var199 < 100; var199++) {
                    if (field718[var199] == var196) {
                        var198 = true;
                        break;
                    }
                }
                if (Statics.field1116.method1551(new class464(var190, Statics.field1888))) {
                    var198 = true;
                }
                if (!var198 && field608 == 0) {
                    field718[field609] = var196;
                    field609 = (field609 + 1) % 100;
                    String var200 = class350.method5804(class343.method5232(class282.method2722(var3)));
                    byte var201;
                    if (var195.field3964) {
                        var201 = 7;
                    } else {
                        var201 = 3;
                    }
                    if (var195.field3963 == -1) {
                        class99.method5035(var201, var190, var200);
                    } else {
                        class99.method5035(var201, class93.method1971(var195.field3963) + var190, var200);
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3119 == arg0.field1346) {
                method4585(class263.field3022);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3141 == arg0.field1346) {
                method4585(class263.field3016);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3047 == arg0.field1346) {
                method5188(true, arg0.field1345);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3092 == arg0.field1346) {
                method1781();
                int var202 = var3.method7081();
                int var203 = var3.method7052();
                int var204 = var3.method7079();
                field514[var202] = var203;
                field568[var202] = var204;
                field628[var202] = 1;
                for (int var205 = 0; var205 < 98; var205++) {
                    if (var203 >= class298.field3558[var205]) {
                        field628[var202] = var205 + 2;
                    }
                }
                field757[++field686 - 1 & 0x1F] = var202;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3079 == arg0.field1346) {
                int var206 = var3.method7052();
                class80 var207 = (class80) field656.method6765((long) var206);
                if (var207 != null) {
                    method4939(var207, true);
                }
                if (field661 != null) {
                    method1899(field661);
                    field661 = null;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3050 == arg0.field1346) {
                int var208 = var3.method7052();
                int var209 = var3.method7052();
                int var210 = class32.method2987();
                class264 var211 = class264.method3158(class262.field3012, field541.field1344);
                var211.field3031.method7078(field189);
                var211.field3031.method7076(var210);
                var211.field3031.method7098(var208);
                var211.field3031.method7074(var209);
                field541.method2378(var211);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3113 == arg0.field1346) {
                return this.method1042(arg0, 1);
            }
            if (class265.field3071 == arg0.field1346) {
                int var212 = var3.method7089();
                class78.method5412(var212);
                field683[++field684 - 1 & 0x1F] = var212 & 0x7FFF;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3121 == arg0.field1346) {
                byte[] var213 = new byte[arg0.field1347];
                var3.method7025(var213, 0, var213.length);
                class443 var214 = new class443(var213);
                String var215 = var214.method7057();
                class30.method4702(var215, true, false);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3094 == arg0.field1346) {
                String var216 = var3.method7057();
                Object[] var217 = new Object[var216.length() + 1];
                for (int var218 = var216.length() - 1; var218 >= 0; var218--) {
                    if (var216.charAt(var218) == 's') {
                        var217[var218 + 1] = var3.method7057();
                    } else {
                        var217[var218 + 1] = Integer.valueOf(var3.method7052());
                    }
                }
                var217[0] = Integer.valueOf(var3.method7052());
                class81 var219 = new class81();
                var219.field1056 = var217;
                class64.method4199(var219);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3070 == arg0.field1346) {
                int var220 = var3.method7062();
                boolean var221 = var3.method7047() == 1;
                String var222 = "";
                boolean var223 = false;
                if (var221) {
                    var222 = var3.method7057();
                    if (Statics.field1116.method1551(new class464(var222, Statics.field1888))) {
                        var223 = true;
                    }
                }
                String var224 = var3.method7057();
                if (!var223) {
                    class99.method5035(var220, var222, var224);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3048 == arg0.field1346) {
                field760 = true;
                field668 = false;
                Statics.field1810 = var3.method7047();
                Statics.field4665 = var3.method7047();
                Statics.field1691 = var3.method7049();
                Statics.field3589 = var3.method7047();
                Statics.field3232 = var3.method7047();
                if (Statics.field3232 >= 100) {
                    int var225 = Statics.field1810 * 128 + 64;
                    int var226 = Statics.field4665 * 128 + 64;
                    int var227 = method4195(var225, var226, Statics.field1356) - Statics.field1691;
                    int var228 = var225 - Statics.field104;
                    int var229 = var227 - Statics.field90;
                    int var230 = var226 - Statics.field2761;
                    int var231 = (int) Math.sqrt((double) (var228 * var228 + var230 * var230));
                    Statics.field2593 = (int) (Math.atan2((double) var229, (double) var231) * 325.9490051269531D) & 0x7FF;
                    Statics.field317 = (int) (Math.atan2((double) var228, (double) var230) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field2593 < 128) {
                        Statics.field2593 = 128;
                    }
                    if (Statics.field2593 > 383) {
                        Statics.field2593 = 383;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3053 == arg0.field1346) {
                int var232 = var3.method7049();
                class85 var233;
                if (field611 == var232) {
                    var233 = Statics.field1366;
                } else {
                    var233 = field643[var232];
                }
                int var234 = var3.method7099();
                int var235 = var3.method7088();
                if (var233 != null) {
                    var233.field1175 = var235;
                    var233.field1144 = var234 >> 16;
                    var233.field1179 = (var234 & 0xFFFF) + field552;
                    var233.field1177 = 0;
                    var233.field1178 = 0;
                    if (var233.field1179 > field552) {
                        var233.field1177 = -1;
                    }
                    if (var233.field1175 == 65535) {
                        var233.field1175 = -1;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3109 == arg0.field1346) {
                field716 = var3.method7047();
                field715 = var3.method7081();
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3131 == arg0.field1346) {
                for (int var236 = 0; var236 < class288.field3326.length; var236++) {
                    if (class288.field3326[var236] != class288.field3325[var236]) {
                        class288.field3326[var236] = class288.field3325[var236];
                        method5227(var236);
                        field681[++field607 - 1 & 0x1F] = var236;
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3039 == arg0.field1346) {
                method4585(class263.field3017);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3059 == arg0.field1346) {
                method2439(false, var3);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3114 == arg0.field1346) {
                byte var237 = var3.method7048();
                long var238 = (long) var3.method7049();
                long var240 = (long) var3.method7051();
                long var242 = (var238 << 32) + var240;
                boolean var244 = false;
                class149 var245 = var237 >= 0 ? field725[var237] : Statics.field1710;
                if (var245 == null) {
                    var244 = true;
                } else {
                    for (int var246 = 0; var246 < 100; var246++) {
                        if (field718[var246] == var242) {
                            var244 = true;
                            break;
                        }
                    }
                }
                if (!var244) {
                    field718[field609] = var242;
                    field609 = (field609 + 1) % 100;
                    String var247 = class282.method2722(var3);
                    int var248 = var237 >= 0 ? 43 : 46;
                    class99.method1882(var248, "", var247, var245.field1695);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3111 == arg0.field1346) {
                boolean var249 = var3.method7055();
                if (!var249) {
                    Statics.field1363 = null;
                } else if (Statics.field1363 == null) {
                    Statics.field1363 = new class326();
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3089 == arg0.field1346) {
                String var250 = var3.method7057();
                int var251 = var3.method7100();
                class294 var252 = class294.method2818(var251);
                if (!var250.equals(var252.field3508)) {
                    var252.field3508 = var250;
                    method1899(var252);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3099 == arg0.field1346) {
                return this.method1042(arg0, 2);
            }
            if (class265.field3129 == arg0.field1346) {
                class61 var253 = new class61();
                var253.field792 = var3.method7057();
                var253.field786 = var3.method7049();
                int var254 = var3.method7052();
                var253.field790 = var254;
                method2093(45);
                var2.method6196();
                Object var255 = null;
                class69.method5209(var253);
                arg0.field1346 = null;
                return false;
            }
            if (class265.field3087 == arg0.field1346) {
                return this.method1294(arg0);
            }
            if (class265.field3097 == arg0.field1346) {
                Statics.field4137 = class460.method6178(var3.method7047());
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3112 == arg0.field1346) {
                method1781();
                field641 = var3.method7047();
                field696 = field680;
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3088 == arg0.field1346) {
                int var256 = var3.method7216();
                int var257 = var3.method7091();
                int var258 = var3.method7052();
                class294 var259 = class294.method2818(var258);
                if (var259.field3389 != var257 || var259.field3516 != var256 || var259.field3507 != 0 || var259.field3375 != 0) {
                    var259.field3389 = var257;
                    var259.field3516 = var256;
                    var259.field3507 = 0;
                    var259.field3375 = 0;
                    method1899(var259);
                    this.method1049(var259);
                    if (var259.field3371 == 0) {
                        method6223(Statics.field324[var258 >> 16], var259, false);
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3066 == arg0.field1346) {
                field693 = field680;
                byte var260 = var3.method7048();
                class146 var261 = new class146(var3);
                class149 var262;
                if (var260 >= 0) {
                    var262 = field725[var260];
                } else {
                    var262 = Statics.field1710;
                }
                var261.method2826(var262);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3054 == arg0.field1346) {
                int var263 = var3.method7049();
                int var264 = var3.method7047();
                int var265 = var3.method7049();
                method711(var263, var264, var265);
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3049 == arg0.field1346) {
                byte var266 = var3.method7048();
                String var267 = var3.method7057();
                long var268 = (long) var3.method7049();
                long var270 = (long) var3.method7051();
                class310 var272 = (class310) class329.method2087(class310.method715(), var3.method7047());
                long var273 = (var268 << 32) + var270;
                boolean var275 = false;
                Object var276 = null;
                class149 var277 = var266 >= 0 ? field725[var266] : Statics.field1710;
                if (var277 == null) {
                    var275 = true;
                } else {
                    int var278 = 0;
                    while (true) {
                        if (var278 >= 100) {
                            if (var272.field3965 && Statics.field1116.method1551(new class464(var267, Statics.field1888))) {
                                var275 = true;
                            }
                            break;
                        }
                        if (field718[var278] == var273) {
                            var275 = true;
                            break;
                        }
                        var278++;
                    }
                }
                if (!var275) {
                    field718[field609] = var273;
                    field609 = (field609 + 1) % 100;
                    String var279 = class350.method5804(class282.method2722(var3));
                    int var280 = var266 >= 0 ? 41 : 44;
                    if (var272.field3963 == -1) {
                        class99.method1882(var280, var267, var279, var277.field1695);
                    } else {
                        class99.method1882(var280, class93.method1971(var272.field3963) + var267, var279, var277.field1695);
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3093 == arg0.field1346) {
                var3.field4700 += 28;
                if (var3.method7129()) {
                    method4240(var3, var3.field4700 - 28);
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3134 == arg0.field1346 && field760) {
                field668 = true;
                Statics.field3347 = var3.method7047();
                Statics.field1392 = var3.method7047();
                Statics.field3589 = var3.method7047();
                Statics.field3232 = var3.method7047();
                for (int var281 = 0; var281 < 5; var281++) {
                    field744[var281] = false;
                }
                arg0.field1346 = null;
                return true;
            }
            if (class265.field3105 == arg0.field1346) {
                int var282 = var3.method7079();
                int var283 = var282 >> 2;
                int var284 = var282 & 0x3;
                int var285 = field583[var283];
                int var286 = var3.method7090();
                int var287 = var3.method7094();
                int var288 = var287 >> 16;
                int var289 = var287 >> 8 & 0xFF;
                int var290 = (var287 >> 4 & 0x7) + var288;
                int var291 = (var287 & 0x7) + var289;
                if (var290 >= 0 && var291 >= 0 && var290 < 103 && var291 < 103) {
                    if (var285 == 0) {
                        class216 var292 = Statics.field4239.method4002(Statics.field1356, var290, var291);
                        if (var292 != null) {
                            int var293 = class212.method937(var292.field2630);
                            if (var283 == 2) {
                                var292.field2628 = new class73(var293, 2, var284 + 4, Statics.field1356, var290, var291, var286, false, var292.field2628);
                                var292.field2629 = new class73(var293, 2, var284 + 1 & 0x3, Statics.field1356, var290, var291, var286, false, var292.field2629);
                            } else {
                                var292.field2628 = new class73(var293, var283, var284, Statics.field1356, var290, var291, var286, false, var292.field2628);
                            }
                        }
                    } else if (var285 == 1) {
                        class218 var294 = Statics.field4239.method3847(Statics.field1356, var290, var291);
                        if (var294 != null) {
                            int var295 = class212.method937(var294.field2643);
                            if (var283 == 4 || var283 == 5) {
                                var294.field2641 = new class73(var295, 4, var284, Statics.field1356, var290, var291, var286, false, var294.field2641);
                            } else if (var283 == 6) {
                                var294.field2641 = new class73(var295, 4, var284 + 4, Statics.field1356, var290, var291, var286, false, var294.field2641);
                            } else if (var283 == 7) {
                                var294.field2641 = new class73(var295, 4, (var284 + 2 & 0x3) + 4, Statics.field1356, var290, var291, var286, false, var294.field2641);
                            } else if (var283 == 8) {
                                var294.field2641 = new class73(var295, 4, var284 + 4, Statics.field1356, var290, var291, var286, false, var294.field2641);
                                var294.field2642 = new class73(var295, 4, (var284 + 2 & 0x3) + 4, Statics.field1356, var290, var291, var286, false, var294.field2642);
                            }
                        }
                    } else if (var285 == 2) {
                        class219 var296 = Statics.field4239.method3848(Statics.field1356, var290, var291);
                        if (var283 == 11) {
                            var283 = 10;
                        }
                        if (var296 != null) {
                            var296.field2646 = new class73(class212.method937(var296.field2655), var283, var284, Statics.field1356, var290, var291, var286, false, var296.field2646);
                        }
                    } else if (var285 == 3) {
                        class197 var297 = Statics.field4239.method3849(Statics.field1356, var290, var291);
                        if (var297 != null) {
                            var297.field2284 = new class73(class212.method937(var297.field2286), 22, var284, Statics.field1356, var290, var291, var286, false, var297.field2284);
                        }
                    }
                }
                arg0.field1346 = null;
                return true;
            }
            class467.method4655("" + (arg0.field1346 == null ? -1 : arg0.field1346.field3142) + class93.field1268 + (arg0.field1348 == null ? -1 : arg0.field1348.field3142) + class93.field1268 + (arg0.field1353 == null ? -1 : arg0.field1353.field3142) + class93.field1268 + arg0.field1347, (Throwable) null);
            method2012();
        } catch (IOException var302) {
            method2709();
        } catch (Exception var303) {
            String var300 = "" + (arg0.field1346 == null ? -1 : arg0.field1346.field3142) + class93.field1268 + (arg0.field1348 == null ? -1 : arg0.field1348.field3142) + class93.field1268 + (arg0.field1353 == null ? -1 : arg0.field1353.field3142) + class93.field1268 + arg0.field1347 + class93.field1268 + (Statics.field168 + Statics.field1366.field1200[0]) + class93.field1268 + (Statics.field2674 + Statics.field1366.field1201[0]) + class93.field1268;
            for (int var301 = 0; var301 < arg0.field1347 && var301 < 50; var301++) {
                var300 = var300 + var3.field4701[var301] + class93.field1268;
            }
            class467.method4655(var300, var303);
            method2012();
        }
        return true;
    }

    @ObfuscatedName("is.ho(Ljw;I)V")
    public static final void method4585(class263 arg0) {
        class442 var1 = field541.field1345;
        if (class263.field3023 == arg0) {
            int var2 = var1.method7049();
            int var3 = var1.method7081();
            int var4 = (var3 >> 4 & 0x7) + Statics.field54;
            int var5 = (var3 & 0x7) + Statics.field3559;
            int var6 = var1.method7081();
            int var7 = var1.method7049();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                int var8 = var4 * 128 + 64;
                int var9 = var5 * 128 + 64;
                class65 var10 = new class65(var2, Statics.field1356, var8, var9, method4195(var8, var9, Statics.field1356) - var6, var7, field552);
                field495.method5530(var10);
            }
        } else if (class263.field3024 == arg0) {
            int var11 = var1.method7079();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field583[var12];
            int var15 = var1.method7079();
            int var16 = (var15 >> 4 & 0x7) + Statics.field54;
            int var17 = (var15 & 0x7) + Statics.field3559;
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                method316(Statics.field1356, var16, var17, var14, -1, var12, var13, 0, -1);
            }
        } else if (class263.field3022 == arg0) {
            int var18 = var1.method7047() * 4;
            int var19 = var1.method7049();
            int var20 = var1.method7049();
            int var21 = var1.method7047();
            int var22 = var1.method7127();
            int var23 = var1.method7081();
            int var24 = var1.method7079();
            int var25 = (var24 >> 4 & 0x7) + Statics.field54;
            int var26 = (var24 & 0x7) + Statics.field3559;
            int var27 = var1.method7079() * 4;
            byte var28 = var1.method7266();
            int var29 = var1.method7090();
            byte var30 = var1.method7048();
            int var31 = var25 + var30;
            int var32 = var26 + var28;
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var20 != 65535) {
                int var33 = var25 * 128 + 64;
                int var34 = var26 * 128 + 64;
                int var35 = var31 * 128 + 64;
                int var36 = var32 * 128 + 64;
                class70 var37 = new class70(var20, Statics.field1356, var33, var34, method4195(var33, var34, Statics.field1356) - var27, field552 + var29, field552 + var19, var23, var21, var22, var18);
                var37.method1863(var35, var36, method4195(var35, var36, Statics.field1356) - var18, field552 + var29);
                field625.method5530(var37);
            }
        } else {
            if (class263.field3021 == arg0) {
                int var38 = var1.method7079();
                int var39 = var38 >> 4 & 0xF;
                int var40 = var38 & 0x7;
                int var41 = var1.method7081();
                int var42 = var1.method7049();
                int var43 = var1.method7047();
                int var44 = (var43 >> 4 & 0x7) + Statics.field54;
                int var45 = (var43 & 0x7) + Statics.field3559;
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                    int var46 = var39 + 1;
                    if (Statics.field1366.field1200[0] >= var44 - var46 && Statics.field1366.field1200[0] <= var44 + var46 && Statics.field1366.field1201[0] >= var45 - var46 && Statics.field1366.field1201[0] <= var45 + var46 && Statics.field109.method2154() != 0 && var40 > 0 && field489 < 50) {
                        field737[field489] = var42;
                        field738[field489] = var40;
                        field739[field489] = var41;
                        field619[field489] = null;
                        field740[field489] = (var44 << 16) + (var45 << 8) + var39;
                        field489++;
                    }
                }
            }
            if (class263.field3018 == arg0) {
                int var47 = var1.method7047();
                int var48 = (var47 >> 4 & 0x7) + Statics.field54;
                int var49 = (var47 & 0x7) + Statics.field3559;
                int var50 = var1.method7088();
                int var51 = var1.method7088();
                int var52 = var1.method7049();
                if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                    class334 var53 = field623[Statics.field1356][var48][var49];
                    if (var53 != null) {
                        for (class96 var54 = (class96) var53.method5535(); var54 != null; var54 = (class96) var53.method5537()) {
                            if ((var51 & 0x7FFF) == var54.field1297 && var54.field1301 == var50) {
                                var54.field1301 = var52;
                                break;
                            }
                        }
                        method2713(var48, var49);
                    }
                }
            } else if (class263.field3020 == arg0) {
                int var55 = var1.method7049();
                int var56 = var1.method7081();
                int var57 = (var56 >> 4 & 0x7) + Statics.field54;
                int var58 = (var56 & 0x7) + Statics.field3559;
                int var59 = var1.method7089();
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                    class96 var60 = new class96();
                    var60.field1297 = var55;
                    var60.field1301 = var59;
                    if (field623[Statics.field1356][var57][var58] == null) {
                        field623[Statics.field1356][var57][var58] = new class334();
                    }
                    field623[Statics.field1356][var57][var58].method5530(var60);
                    method2713(var57, var58);
                }
            } else {
                if (class263.field3025 == arg0) {
                    int var61 = var1.method7079();
                    int var62 = (var61 >> 4 & 0x7) + Statics.field54;
                    int var63 = (var61 & 0x7) + Statics.field3559;
                    byte var64 = var1.method7266();
                    int var65 = var1.method7089();
                    byte var66 = var1.method7266();
                    byte var67 = var1.method7082();
                    int var68 = var1.method7081();
                    int var69 = var68 >> 2;
                    int var70 = var68 & 0x3;
                    int var71 = field583[var69];
                    int var72 = var1.method7090();
                    byte var73 = var1.method7083();
                    int var74 = var1.method7089();
                    int var75 = var1.method7049();
                    class85 var76;
                    if (field611 == var74) {
                        var76 = Statics.field1366;
                    } else {
                        var76 = field643[var74];
                    }
                    if (var76 != null) {
                        class187 var77 = class187.method3000(var65);
                        int var78;
                        int var79;
                        if (var70 == 1 || var70 == 3) {
                            var78 = var77.field2057;
                            var79 = var77.field2046;
                        } else {
                            var78 = var77.field2046;
                            var79 = var77.field2057;
                        }
                        int var80 = (var78 >> 1) + var62;
                        int var81 = (var78 + 1 >> 1) + var62;
                        int var82 = (var79 >> 1) + var63;
                        int var83 = (var79 + 1 >> 1) + var63;
                        int[][] var84 = class75.field1011[Statics.field1356];
                        int var85 = var84[var80][var82] + var84[var81][var82] + var84[var80][var83] + var84[var81][var83] >> 2;
                        int var86 = (var62 << 7) + (var78 << 6);
                        int var87 = (var63 << 7) + (var79 << 6);
                        class211 var88 = var77.method3336(var69, var70, var84, var86, var85, var87);
                        if (var88 != null) {
                            method316(Statics.field1356, var62, var63, var71, -1, 0, 0, var72 + 1, var75 + 1);
                            var76.field1086 = field552 + var72;
                            var76.field1098 = field552 + var75;
                            var76.field1099 = var88;
                            var76.field1096 = var62 * 128 + var78 * 64;
                            var76.field1109 = var63 * 128 + var79 * 64;
                            var76.field1097 = var85;
                            if (var64 > var67) {
                                byte var89 = var64;
                                var64 = var67;
                                var67 = var89;
                            }
                            if (var66 > var73) {
                                byte var90 = var66;
                                var66 = var73;
                                var73 = var90;
                            }
                            var76.field1100 = var62 + var64;
                            var76.field1102 = var62 + var67;
                            var76.field1095 = var63 + var66;
                            var76.field1115 = var63 + var73;
                        }
                    }
                }
                if (class263.field3016 == arg0) {
                    int var91 = var1.method7079();
                    int var92 = var91 >> 2;
                    int var93 = var91 & 0x3;
                    int var94 = field583[var92];
                    int var95 = var1.method7088();
                    int var96 = var1.method7047();
                    int var97 = (var96 >> 4 & 0x7) + Statics.field54;
                    int var98 = (var96 & 0x7) + Statics.field3559;
                    if (var97 >= 0 && var98 >= 0 && var97 < 103 && var98 < 103) {
                        if (var94 == 0) {
                            class216 var99 = Statics.field4239.method4002(Statics.field1356, var97, var98);
                            if (var99 != null) {
                                int var100 = class212.method937(var99.field2630);
                                if (var92 == 2) {
                                    var99.field2628 = new class73(var100, 2, var93 + 4, Statics.field1356, var97, var98, var95, false, var99.field2628);
                                    var99.field2629 = new class73(var100, 2, var93 + 1 & 0x3, Statics.field1356, var97, var98, var95, false, var99.field2629);
                                } else {
                                    var99.field2628 = new class73(var100, var92, var93, Statics.field1356, var97, var98, var95, false, var99.field2628);
                                }
                            }
                        }
                        if (var94 == 1) {
                            class218 var101 = Statics.field4239.method3847(Statics.field1356, var97, var98);
                            if (var101 != null) {
                                int var102 = class212.method937(var101.field2643);
                                if (var92 == 4 || var92 == 5) {
                                    var101.field2641 = new class73(var102, 4, var93, Statics.field1356, var97, var98, var95, false, var101.field2641);
                                } else if (var92 == 6) {
                                    var101.field2641 = new class73(var102, 4, var93 + 4, Statics.field1356, var97, var98, var95, false, var101.field2641);
                                } else if (var92 == 7) {
                                    var101.field2641 = new class73(var102, 4, (var93 + 2 & 0x3) + 4, Statics.field1356, var97, var98, var95, false, var101.field2641);
                                } else if (var92 == 8) {
                                    var101.field2641 = new class73(var102, 4, var93 + 4, Statics.field1356, var97, var98, var95, false, var101.field2641);
                                    var101.field2642 = new class73(var102, 4, (var93 + 2 & 0x3) + 4, Statics.field1356, var97, var98, var95, false, var101.field2642);
                                }
                            }
                        }
                        if (var94 == 2) {
                            class219 var103 = Statics.field4239.method3848(Statics.field1356, var97, var98);
                            if (var92 == 11) {
                                var92 = 10;
                            }
                            if (var103 != null) {
                                var103.field2646 = new class73(class212.method937(var103.field2655), var92, var93, Statics.field1356, var97, var98, var95, false, var103.field2646);
                            }
                        }
                        if (var94 == 3) {
                            class197 var104 = Statics.field4239.method3849(Statics.field1356, var97, var98);
                            if (var104 != null) {
                                var104.field2284 = new class73(class212.method937(var104.field2286), 22, var93, Statics.field1356, var97, var98, var95, false, var104.field2284);
                            }
                        }
                    }
                } else if (class263.field3019 == arg0) {
                    int var105 = var1.method7080();
                    int var106 = var105 >> 2;
                    int var107 = var105 & 0x3;
                    int var108 = field583[var106];
                    int var109 = var1.method7079();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field54;
                    int var111 = (var109 & 0x7) + Statics.field3559;
                    int var112 = var1.method7088();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        method316(Statics.field1356, var110, var111, var108, var112, var106, var107, 0, -1);
                    }
                } else if (class263.field3017 == arg0) {
                    int var113 = var1.method7049();
                    int var114 = var1.method7080();
                    int var115 = (var114 >> 4 & 0x7) + Statics.field54;
                    int var116 = (var114 & 0x7) + Statics.field3559;
                    if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                        class334 var117 = field623[Statics.field1356][var115][var116];
                        if (var117 != null) {
                            for (class96 var118 = (class96) var117.method5535(); var118 != null; var118 = (class96) var117.method5537()) {
                                if ((var113 & 0x7FFF) == var118.field1297) {
                                    var118.method6497();
                                    break;
                                }
                            }
                            if (var117.method5535() == null) {
                                field623[Statics.field1356][var115][var116] = null;
                            }
                            method2713(var115, var116);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.hf(IIIIIIIIII)V")
    public static final void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class86 var9 = null;
        for (class86 var10 = (class86) field624.method5535(); var10 != null; var10 = (class86) field624.method5537()) {
            if (var10.field1129 == arg0 && var10.field1119 == arg1 && var10.field1117 == arg2 && var10.field1127 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class86();
            var9.field1129 = arg0;
            var9.field1127 = arg3;
            var9.field1119 = arg1;
            var9.field1117 = arg2;
            method2868(var9);
            field624.method5530(var9);
        }
        var9.field1124 = arg4;
        var9.field1126 = arg5;
        var9.field1120 = arg6;
        var9.field1118 = arg7;
        var9.field1128 = arg8;
    }

    @ObfuscatedName("j.hw(I)V")
    public static final void method9() {
        for (class86 var0 = (class86) field624.method5535(); var0 != null; var0 = (class86) field624.method5537()) {
            if (var0.field1128 == -1) {
                var0.field1118 = 0;
                method2868(var0);
            } else {
                var0.method6497();
            }
        }
    }

    @ObfuscatedName("ee.hz(Lcg;I)V")
    public static final void method2868(class86 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1127 == 0) {
            var1 = Statics.field4239.method3854(arg0.field1129, arg0.field1119, arg0.field1117);
        }
        if (arg0.field1127 == 1) {
            var1 = Statics.field4239.method3851(arg0.field1129, arg0.field1119, arg0.field1117);
        }
        if (arg0.field1127 == 2) {
            var1 = Statics.field4239.method3852(arg0.field1129, arg0.field1119, arg0.field1117);
        }
        if (arg0.field1127 == 3) {
            var1 = Statics.field4239.method3853(arg0.field1129, arg0.field1119, arg0.field1117);
        }
        if (var1 != 0L) {
            int var6 = Statics.field4239.method3951(arg0.field1129, arg0.field1119, arg0.field1117, var1);
            var3 = class212.method937(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1121 = var3;
        arg0.field1123 = var4;
        arg0.field1122 = var5;
    }

    @ObfuscatedName("js.hc(IIIIIIII)V")
    public static final void method4987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field701 && Statics.field1356 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field4239.method3854(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field4239.method3851(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field4239.method3852(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field4239.method3853(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field4239.method3951(arg0, arg2, arg3, var7);
            int var13 = class212.method937(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field4239.method3841(arg0, arg2, arg3);
                class187 var16 = class187.method3000(var13);
                if (var16.field2058 != 0) {
                    field629[arg0].method3558(arg2, arg3, var14, var15, var16.field2044);
                }
            }
            if (arg1 == 1) {
                Statics.field4239.method3842(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field4239.method3843(arg0, arg2, arg3);
                class187 var17 = class187.method3000(var13);
                if (var17.field2046 + arg2 > 103 || var17.field2046 + arg3 > 103 || var17.field2057 + arg2 > 103 || var17.field2057 + arg3 > 103) {
                    return;
                }
                if (var17.field2058 != 0) {
                    field629[arg0].method3559(arg2, arg3, var17.field2046, var17.field2057, var15, var17.field2044);
                }
            }
            if (arg1 == 3) {
                Statics.field4239.method3844(arg0, arg2, arg3);
                class187 var18 = class187.method3000(var13);
                if (var18.field2058 == 1) {
                    field629[arg0].method3561(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class75.field996[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class75.method2823(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field4239, field629[arg0]);
    }

    @ObfuscatedName("ez.hv(III)V")
    public static final void method2713(int arg0, int arg1) {
        class334 var2 = field623[Statics.field1356][arg0][arg1];
        if (var2 == null) {
            Statics.field4239.method3845(Statics.field1356, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class96 var5 = null;
        for (class96 var6 = (class96) var2.method5535(); var6 != null; var6 = (class96) var2.method5537()) {
            class188 var7 = class188.method3161(var6.field1297);
            long var8 = (long) var7.field2124;
            if (var7.field2114 == 1) {
                var8 = (long) (var6.field1301 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field4239.method3845(Statics.field1356, arg0, arg1);
            return;
        }
        var2.method5531(var5);
        class96 var10 = null;
        class96 var11 = null;
        for (class96 var12 = (class96) var2.method5535(); var12 != null; var12 = (class96) var2.method5537()) {
            if (var5.field1297 != var12.field1297) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1297 != var12.field1297 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class212.method2959(arg0, arg1, 3, false, 0);
        Statics.field4239.method3832(Statics.field1356, arg0, arg1, method4195(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1356), var5, var13, var10, var11);
    }

    @ObfuscatedName("ch.hd(ZLpq;I)V")
    public static final void method2439(boolean arg0, class442 arg1) {
        field616 = 0;
        field539 = 0;
        method5467();
        while (arg1.method6994(field541.field1347) >= 27) {
            int var2 = arg1.method6992(15);
            if (var2 == 32767) {
                break;
            }
            boolean var6 = false;
            if (field742[var2] == null) {
                field742[var2] = new class92();
                var6 = true;
            }
            class92 var7 = field742[var2];
            field707[++field537 - 1] = var2;
            var7.field1172 = field552;
            int var8;
            int var10;
            int var12;
            if (Statics.field1367) {
                if (arg0) {
                    var8 = arg1.method6992(8);
                    if (var8 > 127) {
                        var8 -= 256;
                    }
                } else {
                    var8 = arg1.method6992(5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                }
                boolean var9 = arg1.method6992(1) == 1;
                if (var9) {
                    arg1.method6992(32);
                }
                var10 = arg1.method6992(1);
                int var11 = field621[arg1.method6992(3)];
                if (var6) {
                    var7.field1196 = var7.field1132 = var11;
                }
                if (arg0) {
                    var12 = arg1.method6992(8);
                    if (var12 > 127) {
                        var12 -= 256;
                    }
                } else {
                    var12 = arg1.method6992(5);
                    if (var12 > 15) {
                        var12 -= 32;
                    }
                }
                int var13 = arg1.method6992(1);
                if (var13 == 1) {
                    field540[++field539 - 1] = var2;
                }
                var7.field1263 = class178.method2492(arg1.method6992(14));
            } else {
                int var14 = field621[arg1.method6992(3)];
                if (var6) {
                    var7.field1196 = var7.field1132 = var14;
                }
                if (arg0) {
                    var8 = arg1.method6992(8);
                    if (var8 > 127) {
                        var8 -= 256;
                    }
                } else {
                    var8 = arg1.method6992(5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                }
                boolean var15 = arg1.method6992(1) == 1;
                if (var15) {
                    arg1.method6992(32);
                }
                if (arg0) {
                    var12 = arg1.method6992(8);
                    if (var12 > 127) {
                        var12 -= 256;
                    }
                } else {
                    var12 = arg1.method6992(5);
                    if (var12 > 15) {
                        var12 -= 32;
                    }
                }
                var10 = arg1.method6992(1);
                int var16 = arg1.method6992(1);
                if (var16 == 1) {
                    field540[++field539 - 1] = var2;
                }
                var7.field1263 = class178.method2492(arg1.method6992(14));
            }
            var7.field1206 = var7.field1263.field1919;
            var7.field1130 = var7.field1263.field1952;
            if (var7.field1130 == 0) {
                var7.field1132 = 0;
            }
            var7.field1165 = var7.field1263.field1927;
            var7.field1140 = var7.field1263.field1920;
            var7.field1170 = var7.field1263.field1929;
            var7.field1142 = var7.field1263.field1941;
            var7.field1168 = var7.field1263.field1924;
            var7.field1149 = var7.field1263.field1923;
            var7.field1198 = var7.field1263.field1926;
            var7.field1143 = var7.field1263.field1932;
            var7.field1181 = var7.field1263.field1945;
            var7.field1145 = var7.field1263.field1933;
            var7.field1146 = var7.field1263.field1934;
            var7.field1156 = var7.field1263.field1935;
            var7.field1180 = var7.field1263.field1936;
            var7.field1138 = var7.field1263.field1937;
            var7.field1150 = var7.field1263.field1931;
            var7.method2253(Statics.field1366.field1200[0] + var8, Statics.field1366.field1201[0] + var12, var10 == 1);
        }
        arg1.method6993();
        method738(arg1);
        for (int var3 = 0; var3 < field616; var3++) {
            int var4 = field617[var3];
            if (field552 != field742[var4].field1172) {
                field742[var4].field1263 = null;
                field742[var4] = null;
            }
        }
        if (field541.field1347 != arg1.field4700) {
            throw new RuntimeException(arg1.field4700 + class93.field1268 + field541.field1347);
        }
        for (int var5 = 0; var5 < field537; var5++) {
            if (field742[field707[var5]] == null) {
                throw new RuntimeException(var5 + class93.field1268 + field537);
            }
        }
    }

    @ObfuscatedName("ly.ij(I)V")
    public static final void method5467() {
        class442 var0 = field541.field1345;
        var0.method6991();
        int var1 = var0.method6992(8);
        if (var1 < field537) {
            for (int var2 = var1; var2 < field537; var2++) {
                field617[++field616 - 1] = field707[var2];
            }
        }
        if (var1 > field537) {
            throw new RuntimeException("");
        }
        field537 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field707[var3];
            class92 var5 = field742[var4];
            int var6 = var0.method6992(1);
            if (var6 == 0) {
                field707[++field537 - 1] = var4;
                var5.field1172 = field552;
            } else {
                int var7 = var0.method6992(2);
                if (var7 == 0) {
                    field707[++field537 - 1] = var4;
                    var5.field1172 = field552;
                    field540[++field539 - 1] = var4;
                } else if (var7 == 1) {
                    field707[++field537 - 1] = var4;
                    var5.field1172 = field552;
                    int var8 = var0.method6992(3);
                    var5.method2252(var8, class193.field2213);
                    int var9 = var0.method6992(1);
                    if (var9 == 1) {
                        field540[++field539 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field707[++field537 - 1] = var4;
                    var5.field1172 = field552;
                    if (var0.method6992(1) == 1) {
                        int var10 = var0.method6992(3);
                        var5.method2252(var10, class193.field2212);
                        int var11 = var0.method6992(3);
                        var5.method2252(var11, class193.field2212);
                    } else {
                        int var12 = var0.method6992(3);
                        var5.method2252(var12, class193.field2210);
                    }
                    int var13 = var0.method6992(1);
                    if (var13 == 1) {
                        field540[++field539 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field617[++field616 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("aq.ix(Lpq;B)V")
    public static final void method738(class442 arg0) {
        for (int var1 = 0; var1 < field539; var1++) {
            int var2 = field540[var1];
            class92 var3 = field742[var2];
            int var4 = arg0.method7047();
            if (Statics.field1367 && (var4 & 0x40) != 0) {
                int var5 = arg0.method7047();
                var4 += var5 << 8;
            }
            if ((var4 & 0x400) != 0) {
                var3.field1190 = field552 + arg0.method7089();
                var3.field1136 = field552 + arg0.method7088();
                var3.field1192 = arg0.method7048();
                var3.field1193 = arg0.method7083();
                var3.field1194 = arg0.method7266();
                var3.field1134 = (byte) arg0.method7081();
            }
            if ((var4 & 0x10) != 0) {
                int var6 = arg0.method7088();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = arg0.method7080();
                if (var3.field1171 == var6 && var6 != -1) {
                    int var8 = class190.method983(var6).field2175;
                    if (var8 == 1) {
                        var3.field1176 = 0;
                        var3.field1173 = 0;
                        var3.field1174 = var7;
                        var3.field1191 = 0;
                    }
                    if (var8 == 2) {
                        var3.field1191 = 0;
                    }
                } else if (var6 == -1 || var3.field1171 == -1 || class190.method983(var6).field2184 >= class190.method983(var3.field1171).field2184) {
                    var3.field1171 = var6;
                    var3.field1176 = 0;
                    var3.field1173 = 0;
                    var3.field1174 = var7;
                    var3.field1191 = 0;
                    var3.field1204 = var3.field1199;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1175 = arg0.method7089();
                int var9 = arg0.method7099();
                var3.field1144 = var9 >> 16;
                var3.field1179 = (var9 & 0xFFFF) + field552;
                var3.field1177 = 0;
                var3.field1178 = 0;
                if (var3.field1179 > field552) {
                    var3.field1177 = -1;
                }
                if (var3.field1175 == 65535) {
                    var3.field1175 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var10 = arg0.method7047();
                if (var10 > 0) {
                    for (int var11 = 0; var11 < var10; var11++) {
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = arg0.method7062();
                        if (var15 == 32767) {
                            var15 = arg0.method7062();
                            var13 = arg0.method7062();
                            var12 = arg0.method7062();
                            var14 = arg0.method7062();
                        } else if (var15 == 32766) {
                            var15 = -1;
                        } else {
                            var13 = arg0.method7062();
                        }
                        int var16 = arg0.method7062();
                        var3.method2080(var15, var13, var12, var14, field552, var16);
                    }
                }
                int var17 = arg0.method7047();
                if (var17 > 0) {
                    for (int var18 = 0; var18 < var17; var18++) {
                        int var19 = arg0.method7062();
                        int var20 = arg0.method7062();
                        if (var20 == 32767) {
                            var3.method2082(var19);
                        } else {
                            int var21 = arg0.method7062();
                            int var22 = arg0.method7081();
                            int var23 = var20 > 0 ? arg0.method7081() : var22;
                            var3.method2081(var19, field552, var20, var21, var22, var23);
                        }
                    }
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.method2259(arg0.method7057());
            }
            if ((var4 & 0x800) != 0) {
                var3.field1205 = arg0.method7101();
            }
            if ((var4 & 0x8) != 0) {
                var3.field1263 = class178.method2492(arg0.method7090());
                var3.field1206 = var3.field1263.field1919;
                var3.field1130 = var3.field1263.field1952;
                var3.field1165 = var3.field1263.field1927;
                var3.field1140 = var3.field1263.field1920;
                var3.field1170 = var3.field1263.field1929;
                var3.field1142 = var3.field1263.field1941;
                var3.field1168 = var3.field1263.field1924;
                var3.field1149 = var3.field1263.field1923;
                var3.field1198 = var3.field1263.field1926;
            }
            if ((var4 & 0x80) != 0) {
                var3.field1139 = arg0.method7090();
                if (var3.field1139 == 65535) {
                    var3.field1139 = -1;
                }
            }
            if (Statics.field1367 && (var4 & 0x100) != 0 || !Statics.field1367 && (var4 & 0x40) != 0) {
                var3.field1141 = arg0.method7266();
                var3.field1183 = arg0.method7083();
                var3.field1182 = arg0.method7082();
                var3.field1184 = arg0.method7082();
                var3.field1185 = arg0.method7090() + field552;
                var3.field1195 = arg0.method7089() + field552;
                var3.field1187 = arg0.method7090();
                var3.field1199 = 1;
                var3.field1204 = 0;
                var3.field1141 += var3.field1200[0];
                var3.field1183 += var3.field1201[0];
                var3.field1182 += var3.field1200[0];
                var3.field1184 += var3.field1201[0];
            }
            if ((var4 & 0x1) != 0) {
                int var24 = arg0.method7090();
                int var25 = arg0.method7089();
                if (Statics.field1367) {
                    var3.field1162 = arg0.method7080() == 1;
                }
                int var26 = var3.field1137 - (var24 - Statics.field168 - Statics.field168) * 64;
                int var27 = var3.field1131 - (var25 - Statics.field2674 - Statics.field2674) * 64;
                if (var26 != 0 || var27 != 0) {
                    var3.field1166 = (int) (Math.atan2((double) var26, (double) var27) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1151 = arg0.method7057();
                var3.field1154 = 100;
            }
        }
    }

    @ObfuscatedName("kj.is(Lci;IILgn;I)V")
    public static final void method5226(class85 arg0, int arg1, int arg2, class193 arg3) {
        int var4 = arg0.field1200[0];
        int var5 = arg0.field1201[0];
        int var6 = arg0.method2029();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method2029();
        class192 var8 = method3208(arg1, arg2);
        class191 var9 = field629[arg0.field1107];
        int[] var10 = field675;
        int[] var11 = field777;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class194.field2218[var12][var13] = 0;
                class194.field2219[var12][var13] = 99999999;
            }
        }
        boolean var29;
        if (var7 == 1) {
            int var14 = var4;
            int var15 = var5;
            byte var16 = 64;
            byte var17 = 64;
            int var18 = var4 - var16;
            int var19 = var5 - var17;
            class194.field2218[var16][var17] = 99;
            class194.field2219[var16][var17] = 0;
            byte var20 = 0;
            int var21 = 0;
            class194.field2217[var20] = var4;
            int var55 = var20 + 1;
            class194.field2222[var20] = var5;
            int[][] var22 = var9.field2191;
            boolean var27;
            while (true) {
                if (var55 == var21) {
                    Statics.field2220 = var14;
                    Statics.field4430 = var15;
                    var27 = false;
                    break;
                }
                var14 = class194.field2217[var21];
                var15 = class194.field2222[var21];
                var21 = var21 + 1 & 0xFFF;
                int var23 = var14 - var18;
                int var24 = var15 - var19;
                int var25 = var14 - var9.field2198;
                int var26 = var15 - var9.field2199;
                if (var8.method1017(1, var14, var15, var9)) {
                    Statics.field2220 = var14;
                    Statics.field4430 = var15;
                    var27 = true;
                    break;
                }
                int var28 = class194.field2219[var23][var24] + 1;
                if (var23 > 0 && class194.field2218[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0) {
                    class194.field2217[var55] = var14 - 1;
                    class194.field2222[var55] = var15;
                    var55 = var55 + 1 & 0xFFF;
                    class194.field2218[var23 - 1][var24] = 2;
                    class194.field2219[var23 - 1][var24] = var28;
                }
                if (var23 < 127 && class194.field2218[var23 + 1][var24] == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0) {
                    class194.field2217[var55] = var14 + 1;
                    class194.field2222[var55] = var15;
                    var55 = var55 + 1 & 0xFFF;
                    class194.field2218[var23 + 1][var24] = 8;
                    class194.field2219[var23 + 1][var24] = var28;
                }
                if (var24 > 0 && class194.field2218[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class194.field2217[var55] = var14;
                    class194.field2222[var55] = var15 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class194.field2218[var23][var24 - 1] = 1;
                    class194.field2219[var23][var24 - 1] = var28;
                }
                if (var24 < 127 && class194.field2218[var23][var24 + 1] == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class194.field2217[var55] = var14;
                    class194.field2222[var55] = var15 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class194.field2218[var23][var24 + 1] = 4;
                    class194.field2219[var23][var24 + 1] = var28;
                }
                if (var23 > 0 && var24 > 0 && class194.field2218[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x124010E) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class194.field2217[var55] = var14 - 1;
                    class194.field2222[var55] = var15 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class194.field2218[var23 - 1][var24 - 1] = 3;
                    class194.field2219[var23 - 1][var24 - 1] = var28;
                }
                if (var23 < 127 && var24 > 0 && class194.field2218[var23 + 1][var24 - 1] == 0 && (var22[var25 + 1][var26 - 1] & 0x1240183) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class194.field2217[var55] = var14 + 1;
                    class194.field2222[var55] = var15 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class194.field2218[var23 + 1][var24 - 1] = 9;
                    class194.field2219[var23 + 1][var24 - 1] = var28;
                }
                if (var23 > 0 && var24 < 127 && class194.field2218[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][var26 + 1] & 0x1240138) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class194.field2217[var55] = var14 - 1;
                    class194.field2222[var55] = var15 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class194.field2218[var23 - 1][var24 + 1] = 6;
                    class194.field2219[var23 - 1][var24 + 1] = var28;
                }
                if (var23 < 127 && var24 < 127 && class194.field2218[var23 + 1][var24 + 1] == 0 && (var22[var25 + 1][var26 + 1] & 0x12401E0) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class194.field2217[var55] = var14 + 1;
                    class194.field2222[var55] = var15 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class194.field2218[var23 + 1][var24 + 1] = 12;
                    class194.field2219[var23 + 1][var24 + 1] = var28;
                }
            }
            var29 = var27;
        } else if (var7 == 2) {
            var29 = class194.method4242(var4, var5, var8, var9);
        } else {
            var29 = Statics.method2693(var4, var5, var7, var8, var9);
        }
        int var48;
        label285: {
            int var30 = var4 - 64;
            int var31 = var5 - 64;
            int var32 = Statics.field2220;
            int var33 = Statics.field4430;
            if (!var29) {
                int var34 = Integer.MAX_VALUE;
                int var35 = Integer.MAX_VALUE;
                byte var36 = 10;
                int var37 = var8.field2205;
                int var38 = var8.field2204;
                int var39 = var8.field2206;
                int var40 = var8.field2207;
                for (int var41 = var37 - var36; var41 <= var36 + var37; var41++) {
                    for (int var42 = var38 - var36; var42 <= var36 + var38; var42++) {
                        int var43 = var41 - var30;
                        int var44 = var42 - var31;
                        if (var43 >= 0 && var44 >= 0 && var43 < 128 && var44 < 128 && class194.field2219[var43][var44] < 100) {
                            int var45 = 0;
                            if (var41 < var37) {
                                var45 = var37 - var41;
                            } else if (var41 > var37 + var39 - 1) {
                                var45 = var41 - (var37 + var39 - 1);
                            }
                            int var46 = 0;
                            if (var42 < var38) {
                                var46 = var38 - var42;
                            } else if (var42 > var38 + var40 - 1) {
                                var46 = var42 - (var38 + var40 - 1);
                            }
                            int var47 = var45 * var45 + var46 * var46;
                            if (var47 < var34 || var34 == var47 && class194.field2219[var43][var44] < var35) {
                                var34 = var47;
                                var35 = class194.field2219[var43][var44];
                                var32 = var41;
                                var33 = var42;
                            }
                        }
                    }
                }
                if (var34 == Integer.MAX_VALUE) {
                    var48 = -1;
                    break label285;
                }
            }
            if (var4 == var32 && var5 == var33) {
                var10[0] = var32;
                var11[0] = var33;
                var48 = 0;
            } else {
                byte var49 = 0;
                class194.field2217[var49] = var32;
                int var56 = var49 + 1;
                class194.field2222[var49] = var33;
                int var50;
                int var51 = var50 = class194.field2218[var32 - var30][var33 - var31];
                while (var4 != var32 || var5 != var33) {
                    if (var50 != var51) {
                        var50 = var51;
                        class194.field2217[var56] = var32;
                        class194.field2222[var56++] = var33;
                    }
                    if ((var51 & 0x2) != 0) {
                        var32++;
                    } else if ((var51 & 0x8) != 0) {
                        var32--;
                    }
                    if ((var51 & 0x1) != 0) {
                        var33++;
                    } else if ((var51 & 0x4) != 0) {
                        var33--;
                    }
                    var51 = class194.field2218[var32 - var30][var33 - var31];
                }
                int var52 = 0;
                while (var56-- > 0) {
                    var10[var52] = class194.field2217[var56];
                    var11[var52++] = class194.field2222[var56];
                    if (var52 >= var10.length) {
                        break;
                    }
                }
                var48 = var52;
            }
        }
        int var53 = var48;
        if (var48 >= 1) {
            for (int var54 = 0; var54 < var53 - 1; var54++) {
                arg0.method2039(field675[var54], field777[var54], arg3);
            }
        }
    }

    @ObfuscatedName("ft.iz(IIB)Lgu;")
    public static class192 method3208(int arg0, int arg1) {
        field775.field2205 = arg0;
        field775.field2204 = arg1;
        field775.field2206 = 1;
        field775.field2207 = 1;
        return field775;
    }

    @ObfuscatedName("dk.ie(B)V")
    public static void method2684() {
        field632 = 0;
        field631 = false;
    }

    @ObfuscatedName("cq.il(B)V")
    public static void method2001() {
        method2684();
        field637[0] = class308.field3743;
        field638[0] = "";
        field635[0] = 1006;
        field651[0] = false;
        field632 = 1;
    }

    @ObfuscatedName("ev.iv(III)V")
    public static final void method2865(int arg0, int arg1) {
        if (field632 < 2 && field555 == 0 && !field650 || !field751) {
            return;
        }
        int var2 = method4592();
        String var3;
        if (field555 == 1 && field632 < 2) {
            var3 = class308.field3916 + class308.field3789 + field581 + " " + class93.field1272;
        } else if (field650 && field632 < 2) {
            var3 = field653 + class308.field3789 + field510 + " " + class93.field1272;
        } else {
            String var4;
            if (var2 < 0) {
                var4 = "";
            } else if (field638[var2].length() > 0) {
                var4 = field637[var2] + class308.field3789 + field638[var2];
            } else {
                var4 = field637[var2];
            }
            var3 = var4;
        }
        if (field632 > 2) {
            var3 = var3 + class93.method2668(16777215) + " " + '/' + " " + (field632 - 2) + class308.field3783;
        }
        Statics.field1303.method5814(var3, arg0 + 4, arg1 + 15, 16777215, 0, field552 / 1000);
    }

    @ObfuscatedName("ks.ir(I)V")
    public static final void method5234() {
        int var0 = Statics.field1393;
        int var1 = Statics.field2598;
        int var2 = Statics.field4101;
        int var3 = Statics.field1094;
        int var4 = 6116423;
        class452.method7400(var0, var1, var2, var3, var4);
        class452.method7400(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class452.method7355(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1303.method5806(class308.field3828, var0 + 3, var1 + 14, var4, -1);
        int var5 = class33.field223;
        int var6 = class33.field225;
        for (int var7 = 0; var7 < field632; var7++) {
            int var8 = (field632 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class349 var10 = Statics.field1303;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field638[var7].length() > 0) {
                var11 = field637[var7] + class308.field3789 + field638[var7];
            } else {
                var11 = field637[var7];
            }
            var10.method5806(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field1393;
        int var13 = Statics.field2598;
        int var14 = Statics.field4101;
        int var15 = Statics.field1094;
        for (int var16 = 0; var16 < field702; var16++) {
            if (field590[var16] + field501[var16] > var12 && field501[var16] < var12 + var14 && field710[var16] + field508[var16] > var13 && field508[var16] < var13 + var15) {
                field705[var16] = true;
            }
        }
    }

    @ObfuscatedName("l.im(B)Z")
    public static final boolean method229() {
        return field631;
    }

    @ObfuscatedName("client.io(I)V")
    public final void method1045() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field632 - 1; var2++) {
                if (field635[var2] < 1000 && field635[var2 + 1] > 1000) {
                    String var3 = field638[var2];
                    field638[var2] = field638[var2 + 1];
                    field638[var2 + 1] = var3;
                    String var4 = field637[var2];
                    field637[var2] = field637[var2 + 1];
                    field637[var2 + 1] = var4;
                    int var5 = field635[var2];
                    field635[var2] = field635[var2 + 1];
                    field635[var2 + 1] = var5;
                    int var6 = field633[var2];
                    field633[var2] = field633[var2 + 1];
                    field633[var2 + 1] = var6;
                    int var7 = field634[var2];
                    field634[var2] = field634[var2 + 1];
                    field634[var2 + 1] = var7;
                    int var8 = field523[var2];
                    field523[var2] = field523[var2 + 1];
                    field523[var2 + 1] = var8;
                    boolean var9 = field651[var2];
                    field651[var2] = field651[var2 + 1];
                    field651[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field849 != null || field484 != null) {
            return;
        }
        int var37;
        int var39;
        int var40;
        label256: {
            int var10 = class33.field231;
            if (field631) {
                if (var10 != 1 && (Statics.field1528 || var10 != 4)) {
                    int var11 = class33.field223;
                    int var12 = class33.field225;
                    if (var11 < Statics.field1393 - 10 || var11 > Statics.field4101 + Statics.field1393 + 10 || var12 < Statics.field2598 - 10 || var12 > Statics.field2598 + Statics.field1094 + 10) {
                        field631 = false;
                        int var13 = Statics.field1393;
                        int var14 = Statics.field2598;
                        int var15 = Statics.field4101;
                        int var16 = Statics.field1094;
                        for (int var17 = 0; var17 < field702; var17++) {
                            if (field590[var17] + field501[var17] > var13 && field501[var17] < var13 + var15 && field710[var17] + field508[var17] > var14 && field508[var17] < var14 + var16) {
                                field704[var17] = true;
                            }
                        }
                    }
                }
                if (var10 == 1 || !Statics.field1528 && var10 == 4) {
                    int var18 = Statics.field1393;
                    int var19 = Statics.field2598;
                    int var20 = Statics.field4101;
                    int var21 = class33.field232;
                    int var22 = class33.field233;
                    int var23 = -1;
                    for (int var24 = 0; var24 < field632; var24++) {
                        int var25 = (field632 - 1 - var24) * 15 + var19 + 31;
                        if (var21 > var18 && var21 < var18 + var20 && var22 > var25 - 13 && var22 < var25 + 3) {
                            var23 = var24;
                        }
                    }
                    if (var23 != -1 && var23 >= 0) {
                        int var26 = field633[var23];
                        int var27 = field634[var23];
                        int var28 = field635[var23];
                        int var29 = field523[var23];
                        String var30 = field637[var23];
                        String var31 = field638[var23];
                        Statics.method6004(var26, var27, var28, var29, var30, var31, class33.field232, class33.field233);
                    }
                    field631 = false;
                    int var32 = Statics.field1393;
                    int var33 = Statics.field2598;
                    int var34 = Statics.field4101;
                    int var35 = Statics.field1094;
                    for (int var36 = 0; var36 < field702; var36++) {
                        if (field590[var36] + field501[var36] > var32 && field501[var36] < var32 + var34 && field710[var36] + field508[var36] > var33 && field508[var36] < var33 + var35) {
                            field704[var36] = true;
                        }
                    }
                }
            } else {
                var37 = method4592();
                if ((var10 == 1 || !Statics.field1528 && var10 == 4) && var37 >= 0) {
                    int var38 = field635[var37];
                    if (var38 == 39 || var38 == 40 || var38 == 41 || var38 == 42 || var38 == 43 || var38 == 33 || var38 == 34 || var38 == 35 || var38 == 36 || var38 == 37 || var38 == 38 || var38 == 1005) {
                        var39 = field633[var37];
                        var40 = field634[var37];
                        class294 var41 = class294.method2818(var40);
                        int var42 = method2679(var41);
                        boolean var43 = (var42 >> 28 & 0x1) != 0;
                        if (var43) {
                            break label256;
                        }
                        int var44 = method2679(var41);
                        boolean var45 = (var44 >> 29 & 0x1) != 0;
                        if (var45) {
                            break label256;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field1528 && var10 == 4) && this.method1319()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field1528 && var10 == 4) && field632 > 0 && var37 >= 0) {
                    int var46 = field633[var37];
                    int var47 = field634[var37];
                    int var48 = field635[var37];
                    int var49 = field523[var37];
                    String var50 = field637[var37];
                    String var51 = field638[var37];
                    Statics.method6004(var46, var47, var48, var49, var50, var51, class33.field232, class33.field233);
                }
                if (var10 == 2 && field632 > 0) {
                    this.method1194(class33.field232, class33.field233);
                }
            }
            return;
        }
        if (Statics.field849 != null && !field706 && field632 > 0 && !this.method1319()) {
            method3581(field660, field604);
        }
        field706 = false;
        field741 = 0;
        if (Statics.field849 != null) {
            method1899(Statics.field849);
        }
        Statics.field849 = class294.method2818(var40);
        field692 = var39;
        field660 = class33.field232;
        field604 = class33.field233;
        if (var37 >= 0) {
            method4216(var37);
        }
        method1899(Statics.field849);
    }

    @ObfuscatedName("client.ih(I)Z")
    public final boolean method1319() {
        int var1 = method4592();
        return (field630 == 1 && field632 > 2 || method3054(var1)) && !field651[var1];
    }

    @ObfuscatedName("client.iu(III)V")
    public final void method1194(int arg0, int arg1) {
        method2446(arg0, arg1);
        int var3 = arg0 - field558;
        int var4 = arg1 - field736;
        Statics.field4239.method3861(Statics.field1356, var3, var4, false);
        field631 = true;
    }

    @ObfuscatedName("dm.if(IIB)V")
    public static void method2446(int arg0, int arg1) {
        int var2 = Statics.field1303.method5800(class308.field3828);
        for (int var3 = 0; var3 < field632; var3++) {
            class349 var4 = Statics.field1303;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field638[var3].length() > 0) {
                var5 = field637[var3] + class308.field3789 + field638[var3];
            } else {
                var5 = field637[var3];
            }
            int var6 = var4.method5800(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field632 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field976) {
            var8 = Statics.field976 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1028) {
            var9 = Statics.field1028 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field1393 = var8;
        Statics.field2598 = var9;
        Statics.field4101 = var2;
        Statics.field1094 = field632 * 15 + 22;
    }

    @ObfuscatedName("fp.iy(II)Z")
    public static final boolean method3054(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field635[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("hw.ik(Lbk;III)V")
    public static final void method4530(class67 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            Statics.method6004(arg0.field875, arg0.field876, arg0.field877, arg0.field883, arg0.field882, arg0.field882, arg1, arg2);
        }
    }

    @ObfuscatedName("kd.in(ILjava/lang/String;I)V")
    public static void method5019(int arg0, String arg1) {
        int var2 = class97.field1309;
        int[] var3 = class97.field1310;
        boolean var4 = false;
        class464 var5 = new class464(arg1, Statics.field1888);
        for (int var6 = 0; var6 < var2; var6++) {
            class85 var7 = field643[var3[var6]];
            if (var7 != null && Statics.field1366 != var7 && var7.field1114 != null && var7.field1114.equals(var5)) {
                if (arg0 == 1) {
                    class264 var8 = class264.method3158(class262.field2971, field541.field1344);
                    var8.field3031.method7244(var3[var6]);
                    var8.field3031.method7031(0);
                    field541.method2378(var8);
                } else if (arg0 == 4) {
                    class264 var9 = class264.method3158(class262.field2992, field541.field1344);
                    var9.field3031.method7076(0);
                    var9.field3031.method7177(var3[var6]);
                    field541.method2378(var9);
                } else if (arg0 == 6) {
                    class264 var10 = class264.method3158(class262.field2966, field541.field1344);
                    var10.field3031.method7085(var3[var6]);
                    var10.field3031.method7076(0);
                    field541.method2378(var10);
                } else if (arg0 == 7) {
                    class264 var11 = class264.method3158(class262.field2948, field541.field1344);
                    var11.field3031.method7244(var3[var6]);
                    var11.field3031.method7031(0);
                    field541.method2378(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method5035(4, "", class308.field3904 + arg1);
        }
    }

    @ObfuscatedName("lq.iq(IIIIB)V")
    public static void method5423(int arg0, int arg1, int arg2, int arg3) {
        class294 var4 = class294.method981(arg0, arg1);
        if (var4 != null && var4.field3492 != null) {
            class81 var5 = new class81();
            var5.field1048 = var4;
            var5.field1056 = var4.field3492;
            class64.method4199(var5);
        }
        field652 = arg3;
        field650 = true;
        Statics.field4037 = arg0;
        field731 = arg1;
        Statics.field1261 = arg2;
        method1899(var4);
    }

    @ObfuscatedName("ix.ig(B)V")
    public static void method4577() {
        if (!field650) {
            return;
        }
        class294 var0 = class294.method981(Statics.field4037, field731);
        if (var0 != null && var0.field3489 != null) {
            class81 var1 = new class81();
            var1.field1048 = var0;
            var1.field1056 = var0.field3489;
            class64.method4199(var1);
        }
        field652 = -1;
        field650 = false;
        method1899(var0);
    }

    @ObfuscatedName("mv.ic(III)V")
    public static void method5989(int arg0, int arg1) {
        class264 var2 = class264.method3158(class262.field2996, field541.field1344);
        var2.field3031.method7085(arg1);
        var2.field3031.method7097(arg0);
        field541.method2378(var2);
    }

    @ObfuscatedName("hk.ia(IIIILjava/lang/String;I)V")
    public static void method4049(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class294 var5 = class294.method981(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3480 != null) {
            class81 var6 = new class81();
            var6.field1048 = var5;
            var6.field1053 = arg0;
            var6.field1051 = arg4;
            var6.field1056 = var5.field3480;
            class64.method4199(var6);
        }
        boolean var7 = true;
        if (var5.field3373 > 0) {
            var7 = method995(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2679(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class264 var11 = class264.method3158(class262.field2935, field541.field1344);
            var11.field3031.method7087(arg1);
            var11.field3031.method7244(arg2);
            var11.field3031.method7244(arg3);
            field541.method2378(var11);
        }
        if (arg0 == 2) {
            class264 var12 = class264.method3158(class262.field2984, field541.field1344);
            var12.field3031.method7087(arg1);
            var12.field3031.method7244(arg2);
            var12.field3031.method7244(arg3);
            field541.method2378(var12);
        }
        if (arg0 == 3) {
            class264 var13 = class264.method3158(class262.field2931, field541.field1344);
            var13.field3031.method7087(arg1);
            var13.field3031.method7244(arg2);
            var13.field3031.method7244(arg3);
            field541.method2378(var13);
        }
        if (arg0 == 4) {
            class264 var14 = class264.method3158(class262.field2916, field541.field1344);
            var14.field3031.method7087(arg1);
            var14.field3031.method7244(arg2);
            var14.field3031.method7244(arg3);
            field541.method2378(var14);
        }
        if (arg0 == 5) {
            class264 var15 = class264.method3158(class262.field2906, field541.field1344);
            var15.field3031.method7087(arg1);
            var15.field3031.method7244(arg2);
            var15.field3031.method7244(arg3);
            field541.method2378(var15);
        }
        if (arg0 == 6) {
            class264 var16 = class264.method3158(class262.field2955, field541.field1344);
            var16.field3031.method7087(arg1);
            var16.field3031.method7244(arg2);
            var16.field3031.method7244(arg3);
            field541.method2378(var16);
        }
        if (arg0 == 7) {
            class264 var17 = class264.method3158(class262.field2964, field541.field1344);
            var17.field3031.method7087(arg1);
            var17.field3031.method7244(arg2);
            var17.field3031.method7244(arg3);
            field541.method2378(var17);
        }
        if (arg0 == 8) {
            class264 var18 = class264.method3158(class262.field2997, field541.field1344);
            var18.field3031.method7087(arg1);
            var18.field3031.method7244(arg2);
            var18.field3031.method7244(arg3);
            field541.method2378(var18);
        }
        if (arg0 == 9) {
            class264 var19 = class264.method3158(class262.field2975, field541.field1344);
            var19.field3031.method7087(arg1);
            var19.field3031.method7244(arg2);
            var19.field3031.method7244(arg3);
            field541.method2378(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class264 var20 = class264.method3158(class262.field2953, field541.field1344);
        var20.field3031.method7087(arg1);
        var20.field3031.method7244(arg2);
        var20.field3031.method7244(arg3);
        field541.method2378(var20);
    }

    @ObfuscatedName("j.ii(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method11(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method4728(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("jh.ib(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method4728(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field631 || field632 >= 500) {
            return;
        }
        field637[field632] = arg0;
        field638[field632] = arg1;
        field635[field632] = arg2;
        field523[field632] = arg3;
        field633[field632] = arg4;
        field634[field632] = arg5;
        field651[field632] = arg6;
        field632++;
    }

    @ObfuscatedName("iv.ip(I)I")
    public static final int method4592() {
        return field632 - 1;
    }

    @ObfuscatedName("cc.it(IIIIB)V")
    public static final void method2018(int arg0, int arg1, int arg2, int arg3) {
        if (field555 == 0 && !field650) {
            method11(class308.field3679, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class212.method4015(); var8++) {
            long var9 = class212.field2585[var8];
            if (var6 != var9) {
                var6 = var9;
                long var13 = class212.field2585[var8];
                int var15 = (int) (var13 >>> 0 & 0x7FL);
                int var17 = var15;
                int var18 = class212.method2000(var8);
                int var19 = class212.method2293(var8);
                int var20 = class212.method2965(var8);
                if (var19 == 2 && Statics.field4239.method3951(Statics.field1356, var15, var18, var9) >= 0) {
                    class187 var21 = class187.method3000(var20);
                    if (var21.field2082 != null) {
                        var21 = var21.method3361();
                    }
                    if (var21 == null) {
                        continue;
                    }
                    if (field555 == 1) {
                        method11(class308.field3916, field581 + " " + class93.field1272 + " " + class93.method2668(65535) + var21.field2051, 1, var20, var15, var18);
                    } else if (!field650) {
                        String[] var22 = var21.field2068;
                        if (var22 != null) {
                            for (int var23 = 4; var23 >= 0; var23--) {
                                if (var22[var23] != null) {
                                    short var24 = 0;
                                    if (var23 == 0) {
                                        var24 = 3;
                                    }
                                    if (var23 == 1) {
                                        var24 = 4;
                                    }
                                    if (var23 == 2) {
                                        var24 = 5;
                                    }
                                    if (var23 == 3) {
                                        var24 = 6;
                                    }
                                    if (var23 == 4) {
                                        var24 = 1001;
                                    }
                                    method11(var22[var23], class93.method2668(65535) + var21.field2051, var24, var20, var17, var18);
                                }
                            }
                        }
                        method11(class308.field3763, class93.method2668(65535) + var21.field2051, 1002, var21.field2048, var17, var18);
                    } else if ((Statics.field1261 & 0x4) == 4) {
                        method11(field653, field510 + " " + class93.field1272 + " " + class93.method2668(65535) + var21.field2051, 2, var20, var15, var18);
                    }
                }
                if (var19 == 1) {
                    class92 var25 = field742[var20];
                    if (var25 == null) {
                        continue;
                    }
                    if (var25.field1263.field1919 == 1 && (var25.field1137 & 0x7F) == 64 && (var25.field1131 & 0x7F) == 64) {
                        for (int var26 = 0; var26 < field537; var26++) {
                            class92 var27 = field742[field707[var26]];
                            if (var27 != null && var25 != var27 && var27.field1263.field1919 == 1 && var25.field1137 == var27.field1137 && var25.field1131 == var27.field1131) {
                                method2996(var27, field707[var26], var17, var18);
                            }
                        }
                        int var28 = class97.field1309;
                        int[] var29 = class97.field1310;
                        for (int var30 = 0; var30 < var28; var30++) {
                            class85 var31 = field643[var29[var30]];
                            if (var31 != null && var25.field1137 == var31.field1137 && var25.field1131 == var31.field1131) {
                                method1897(var31, var29[var30], var17, var18);
                            }
                        }
                    }
                    method2996(var25, var20, var17, var18);
                }
                if (var19 == 0) {
                    class85 var32 = field643[var20];
                    if (var32 == null) {
                        continue;
                    }
                    if ((var32.field1137 & 0x7F) == 64 && (var32.field1131 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < field537; var33++) {
                            class92 var34 = field742[field707[var33]];
                            if (var34 != null && var34.field1263.field1919 == 1 && var32.field1137 == var34.field1137 && var32.field1131 == var34.field1131) {
                                method2996(var34, field707[var33], var17, var18);
                            }
                        }
                        int var35 = class97.field1309;
                        int[] var36 = class97.field1310;
                        for (int var37 = 0; var37 < var35; var37++) {
                            class85 var38 = field643[var36[var37]];
                            if (var38 != null && var32 != var38 && var32.field1137 == var38.field1137 && var32.field1131 == var38.field1131) {
                                method1897(var38, var36[var37], var17, var18);
                            }
                        }
                    }
                    if (field727 == var20) {
                        var4 = var9;
                    } else {
                        method1897(var32, var20, var17, var18);
                    }
                }
                if (var19 == 3) {
                    class334 var39 = field623[Statics.field1356][var17][var18];
                    if (var39 != null) {
                        for (class96 var40 = (class96) var39.method5536(); var40 != null; var40 = (class96) var39.method5547()) {
                            class188 var41 = class188.method3161(var40.field1297);
                            if (field555 == 1) {
                                method11(class308.field3916, field581 + " " + class93.field1272 + " " + class93.method2668(16748608) + var41.field2103, 16, var40.field1297, var17, var18);
                            } else if (!field650) {
                                String[] var42 = var41.field2125;
                                for (int var43 = 4; var43 >= 0; var43--) {
                                    if (var42 != null && var42[var43] != null) {
                                        byte var44 = 0;
                                        if (var43 == 0) {
                                            var44 = 18;
                                        }
                                        if (var43 == 1) {
                                            var44 = 19;
                                        }
                                        if (var43 == 2) {
                                            var44 = 20;
                                        }
                                        if (var43 == 3) {
                                            var44 = 21;
                                        }
                                        if (var43 == 4) {
                                            var44 = 22;
                                        }
                                        method11(var42[var43], class93.method2668(16748608) + var41.field2103, var44, var40.field1297, var17, var18);
                                    } else if (var43 == 2) {
                                        method11(class308.field3617, class93.method2668(16748608) + var41.field2103, 20, var40.field1297, var17, var18);
                                    }
                                }
                                method11(class308.field3763, class93.method2668(16748608) + var41.field2103, 1004, var40.field1297, var17, var18);
                            } else if ((Statics.field1261 & 0x1) == 1) {
                                method11(field653, field510 + " " + class93.field1272 + " " + class93.method2668(16748608) + var41.field2103, 17, var40.field1297, var17, var18);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var45 = (int) (var4 >>> 0 & 0x7FL);
            int var47 = (int) (var4 >>> 7 & 0x7FL);
            class85 var49 = field643[field727];
            method1897(var49, field727, var45, var47);
        }
    }

    @ObfuscatedName("fb.id(Lco;IIIB)V")
    public static final void method2996(class92 arg0, int arg1, int arg2, int arg3) {
        class178 var4 = arg0.field1263;
        if (field632 >= 400) {
            return;
        }
        if (var4.field1953 != null) {
            var4 = var4.method3173();
        }
        if (var4 == null || !var4.field1956 || var4.field1949 && field488 != arg1) {
            return;
        }
        String var5 = arg0.method2251();
        if (var4.field1921 != 0 && arg0.field1205 != 0) {
            int var6 = arg0.field1205 == -1 ? var4.field1921 : arg0.field1205;
            int var8 = Statics.field1366.field1091;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class93.method2668(16711680);
            } else if (var9 < -6) {
                var10 = class93.method2668(16723968);
            } else if (var9 < -3) {
                var10 = class93.method2668(16740352);
            } else if (var9 < 0) {
                var10 = class93.method2668(16756736);
            } else if (var9 > 9) {
                var10 = class93.method2668(65280);
            } else if (var9 > 6) {
                var10 = class93.method2668(4259584);
            } else if (var9 > 3) {
                var10 = class93.method2668(8453888);
            } else if (var9 > 0) {
                var10 = class93.method2668(12648192);
            } else {
                var10 = class93.method2668(16776960);
            }
            var5 = var5 + var10 + " " + class93.field1276 + class308.field3785 + var6 + class93.field1271;
        }
        if (var4.field1949 && field640) {
            method11(class308.field3763, class93.method2668(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field555 == 1) {
            method11(class308.field3916, field581 + " " + class93.field1272 + " " + class93.method2668(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field650) {
            int var11 = var4.field1949 && field640 ? 2000 : 0;
            String[] var12 = var4.field1943;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var12[var13] != null && !var12[var13].equalsIgnoreCase(class308.field3781)) {
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
                        method11(var12[var13], class93.method2668(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (var12[var15] != null && var12[var15].equalsIgnoreCase(class308.field3781)) {
                        short var16 = 0;
                        if (field709 != class95.field1288) {
                            if (field709 == class95.field1286 || field709 == class95.field1292 && var4.field1921 > Statics.field1366.field1091) {
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
                            method11(var12[var15], class93.method2668(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1949 || !field640) {
                method11(class308.field3763, class93.method2668(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1261 & 0x2) == 2) {
            method11(field653, field510 + " " + class93.field1272 + " " + class93.method2668(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bo.ja(Lci;IIII)V")
    public static final void method1897(class85 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1366 == arg0 || field632 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1092 == 0) {
            String var4 = arg0.field1090[0] + arg0.field1114 + arg0.field1090[1];
            int var5 = arg0.field1091;
            int var6 = Statics.field1366.field1091;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class93.method2668(16711680);
            } else if (var7 < -6) {
                var8 = class93.method2668(16723968);
            } else if (var7 < -3) {
                var8 = class93.method2668(16740352);
            } else if (var7 < 0) {
                var8 = class93.method2668(16756736);
            } else if (var7 > 9) {
                var8 = class93.method2668(65280);
            } else if (var7 > 6) {
                var8 = class93.method2668(4259584);
            } else if (var7 > 3) {
                var8 = class93.method2668(8453888);
            } else if (var7 > 0) {
                var8 = class93.method2668(12648192);
            } else {
                var8 = class93.method2668(16776960);
            }
            var9 = var4 + var8 + " " + class93.field1276 + class308.field3785 + arg0.field1091 + class93.field1271 + arg0.field1090[2];
        } else {
            var9 = arg0.field1090[0] + arg0.field1114 + arg0.field1090[1] + " " + class93.field1276 + class308.field3786 + arg0.field1092 + class93.field1271 + arg0.field1090[2];
        }
        if (field555 == 1) {
            method11(class308.field3916, field581 + " " + class93.field1272 + " " + class93.method2668(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field650) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field546[var10] != null) {
                    short var11 = 0;
                    if (field546[var10].equalsIgnoreCase(class308.field3781)) {
                        if (field505 == class95.field1288) {
                            continue;
                        }
                        if (field505 == class95.field1286 || field505 == class95.field1292 && arg0.field1091 > Statics.field1366.field1091) {
                            var11 = 2000;
                        }
                        if (Statics.field1366.field1105 == 0 || arg0.field1105 == 0) {
                            if (field505 == class95.field1295 && arg0.method2035()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field1366.field1105 == arg0.field1105) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field620[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field618[var10] + var11;
                    method11(field546[var10], class93.method2668(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1261 & 0x8) == 8) {
            method11(field653, field510 + " " + class93.field1272 + " " + class93.method2668(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field632; var14++) {
            if (field635[var14] == 23) {
                field638[var14] = class93.method2668(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("go.ju(IIIIIIIII)V")
    public static final void method3587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class294.method4251(arg0)) {
            Statics.field63 = null;
            Statics.method149(Statics.field324[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field63 != null) {
                Statics.method149(Statics.field63, -1412584499, arg1, arg2, arg3, arg4, Statics.field1390, Statics.field961, arg7);
                Statics.field63 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field704[var8] = true;
            }
        } else {
            field704[arg7] = true;
        }
    }

    @ObfuscatedName("fz.jt(IIIIIIB)V")
    public static final void method2977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class452.field4768;
        int var18 = arg1 - class452.field4771;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class201.method3699(var19, var20, var21);
        class201.method3785(var23, var24, var25, var19, var20, var21, arg4);
        class201.method3699(var19, var21, var22);
        class201.method3785(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("s.jn(Ljava/lang/String;Lkb;B)Ljava/lang/String;")
    public static String method69(String arg0, class294 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method314(arg1, var2 - 1);
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

    @ObfuscatedName("is.jx(II)Ljava/lang/String;")
    public static final String method4580(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class93.field1268 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class93.method2668(65408) + var1.substring(0, var1.length() - 8) + class308.field3790 + " " + class93.field1276 + var1 + class93.field1271 + class93.field1267;
        } else if (var1.length() > 6) {
            return " " + class93.method2668(16777215) + var1.substring(0, var1.length() - 4) + class308.field3799 + " " + class93.field1276 + var1 + class93.field1271 + class93.field1267;
        } else {
            return " " + class93.method2668(16776960) + var1 + class93.field1267;
        }
    }

    @ObfuscatedName("client.jc(ZB)V")
    public final void method1048(boolean arg0) {
        int var2 = field655;
        int var3 = Statics.field976;
        int var4 = Statics.field1028;
        if (class294.method4251(var2)) {
            method2610(Statics.field324[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.jl(Lkb;B)V")
    public void method1049(class294 arg0) {
        class294 var2 = arg0.field3423 == -1 ? null : class294.method2818(arg0.field3423);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field976;
            var4 = Statics.field1028;
        } else {
            var3 = var2.field3384;
            var4 = var2.field3385;
        }
        method947(arg0, var3, var4, false);
        method4595(arg0, var3, var4);
    }

    @ObfuscatedName("np.jh([Lkb;Lkb;ZI)V")
    public static void method6223(class294[] arg0, class294 arg1, boolean arg2) {
        int var3 = arg1.field3392 == 0 ? arg1.field3384 : arg1.field3392;
        int var4 = arg1.field3393 == 0 ? arg1.field3385 : arg1.field3393;
        method2610(arg0, arg1.field3369, var3, var4, arg2);
        if (arg1.field3433 != null) {
            method2610(arg1.field3433, arg1.field3369, var3, var4, arg2);
        }
        class80 var5 = (class80) field656.method6765((long) arg1.field3369);
        if (var5 != null) {
            int var6 = var5.field1043;
            if (class294.method4251(var6)) {
                method2610(Statics.field324[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3373 == 1337) {
        }
    }

    @ObfuscatedName("dq.jz([Lkb;IIIZB)V")
    public static void method2610(class294[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class294 var6 = arg0[var5];
            if (var6 != null && var6.field3423 == arg1) {
                method947(var6, arg2, arg3, arg4);
                method4595(var6, arg2, arg3);
                if (var6.field3511 > var6.field3392 - var6.field3384) {
                    var6.field3511 = var6.field3392 - var6.field3384;
                }
                if (var6.field3511 < 0) {
                    var6.field3511 = 0;
                }
                if (var6.field3391 > var6.field3393 - var6.field3385) {
                    var6.field3391 = var6.field3393 - var6.field3385;
                }
                if (var6.field3391 < 0) {
                    var6.field3391 = 0;
                }
                if (var6.field3371 == 0) {
                    method6223(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("be.jq(Lkb;IIZI)V")
    public static void method947(class294 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3384;
        int var5 = arg0.field3385;
        if (arg0.field3376 == 0) {
            arg0.field3384 = arg0.field3395;
        } else if (arg0.field3376 == 1) {
            arg0.field3384 = arg1 - arg0.field3395;
        } else if (arg0.field3376 == 2) {
            arg0.field3384 = arg0.field3395 * arg1 >> 14;
        }
        if (arg0.field3377 == 0) {
            arg0.field3385 = arg0.field3448;
        } else if (arg0.field3377 == 1) {
            arg0.field3385 = arg2 - arg0.field3448;
        } else if (arg0.field3377 == 2) {
            arg0.field3385 = arg0.field3448 * arg2 >> 14;
        }
        if (arg0.field3376 == 4) {
            arg0.field3384 = arg0.field3386 * arg0.field3385 / arg0.field3387;
        }
        if (arg0.field3377 == 4) {
            arg0.field3385 = arg0.field3387 * arg0.field3384 / arg0.field3386;
        }
        if (arg0.field3373 == 1337) {
            field667 = arg0;
        }
        if (arg3 && arg0.field3493 != null && (arg0.field3384 != var4 || arg0.field3385 != var5)) {
            class81 var6 = new class81();
            var6.field1048 = arg0;
            var6.field1056 = arg0.field3493;
            field698.method5530(var6);
        }
    }

    @ObfuscatedName("iv.jv(Lkb;III)V")
    public static void method4595(class294 arg0, int arg1, int arg2) {
        if (arg0.field3507 == 0) {
            arg0.field3382 = arg0.field3389;
        } else if (arg0.field3507 == 1) {
            arg0.field3382 = (arg1 - arg0.field3384) / 2 + arg0.field3389;
        } else if (arg0.field3507 == 2) {
            arg0.field3382 = arg1 - arg0.field3384 - arg0.field3389;
        } else if (arg0.field3507 == 3) {
            arg0.field3382 = arg0.field3389 * arg1 >> 14;
        } else if (arg0.field3507 == 4) {
            arg0.field3382 = (arg0.field3389 * arg1 >> 14) + (arg1 - arg0.field3384) / 2;
        } else {
            arg0.field3382 = arg1 - arg0.field3384 - (arg0.field3389 * arg1 >> 14);
        }
        if (arg0.field3375 == 0) {
            arg0.field3383 = arg0.field3516;
        } else if (arg0.field3375 == 1) {
            arg0.field3383 = (arg2 - arg0.field3385) / 2 + arg0.field3516;
        } else if (arg0.field3375 == 2) {
            arg0.field3383 = arg2 - arg0.field3385 - arg0.field3516;
        } else if (arg0.field3375 == 3) {
            arg0.field3383 = arg0.field3516 * arg2 >> 14;
        } else if (arg0.field3375 == 4) {
            arg0.field3383 = (arg0.field3516 * arg2 >> 14) + (arg2 - arg0.field3385) / 2;
        } else {
            arg0.field3383 = arg2 - arg0.field3385 - (arg0.field3516 * arg2 >> 14);
        }
    }

    @ObfuscatedName("jz.jd(Lkb;IIIIIII)V")
    public static final void method4739(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field561) {
            field562 = 32;
        } else {
            field562 = 0;
        }
        field561 = false;
        if (class33.field234 == 1 || !Statics.field1528 && class33.field234 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3391 -= 4;
                method1899(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3391 += 4;
                method1899(arg0);
            } else if (arg5 >= arg1 - field562 && arg5 < field562 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3391 = (arg4 - arg3) * var8 / var9;
                method1899(arg0);
                field561 = true;
            }
        }
        if (field719 == 0) {
            return;
        }
        int var10 = arg0.field3384;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3391 += field719 * 45;
            method1899(arg0);
        }
    }

    @ObfuscatedName("gq.jp(IIIIII)V")
    public static final void method3797(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1565[0].method7431(arg0, arg1);
        Statics.field1565[1].method7431(arg0, arg1 + arg3 - 16);
        class452.method7400(arg0, arg1 + 16, 16, arg3 - 32, field557);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class452.method7400(arg0, arg1 + 16 + var6, 16, var5, field654);
        class452.method7359(arg0, arg1 + 16 + var6, var5, field554);
        class452.method7359(arg0 + 1, arg1 + 16 + var6, var5, field554);
        class452.method7357(arg0, arg1 + 16 + var6, 16, field554);
        class452.method7357(arg0, arg1 + 17 + var6, 16, field554);
        class452.method7359(arg0 + 15, arg1 + 16 + var6, var5, field559);
        class452.method7359(arg0 + 14, arg1 + 17 + var6, var5 - 1, field559);
        class452.method7357(arg0, arg1 + 15 + var6 + var5, 16, field559);
        class452.method7357(arg0 + 1, arg1 + 14 + var6 + var5, 15, field559);
    }

    @ObfuscatedName("bv.je(Lkb;B)Z")
    public static final boolean method1611(class294 arg0) {
        if (arg0.field3498 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3498.length; var1++) {
            int var2 = method314(arg0, var1);
            int var3 = arg0.field3479[var1];
            if (arg0.field3498[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3498[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3498[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("d.jg(Lkb;IB)I")
    public static final int method314(class294 arg0, int arg1) {
        if (arg0.field3497 == null || arg1 >= arg0.field3497.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3497[arg1];
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
                    var7 = field568[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field628[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field514[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class294 var11 = class294.method2818(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class188.method3161(var12).field2139 || field480)) {
                        for (int var13 = 0; var13 < var11.field3503.length; var13++) {
                            if (var12 + 1 == var11.field3503[var13]) {
                                var7 += var11.field3443[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class288.field3326[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class298.field3558[field628[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class288.field3326[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1366.field1091;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class298.field3556[var14]) {
                            var7 += field628[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class294 var17 = class294.method2818(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class188.method3161(var18).field2139 || field480)) {
                        for (int var19 = 0; var19 < var17.field3503.length; var19++) {
                            if (var18 + 1 == var17.field3503[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field641;
                }
                if (var6 == 12) {
                    var7 = field615;
                }
                if (var6 == 13) {
                    int var20 = class288.field3326[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class288.method6395(var22);
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
                    var7 = (Statics.field1366.field1137 >> 7) + Statics.field168;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1366.field1131 >> 7) + Statics.field2674;
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

    @ObfuscatedName("ev.jy(Lkb;Lgs;IIZB)V")
    public static final void method2864(class294 arg0, class188 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field2118;
        byte var6 = -1;
        String var7 = null;
        if (var5 != null && var5[arg3] != null) {
            if (arg3 == 0) {
                var6 = 33;
            } else if (arg3 == 1) {
                var6 = 34;
            } else if (arg3 == 2) {
                var6 = 35;
            } else if (arg3 == 3) {
                var6 = 36;
            } else {
                var6 = 37;
            }
            var7 = var5[arg3];
        } else if (arg3 == 4) {
            var6 = 37;
            var7 = class308.field3618;
        }
        if (var6 != -1 && var7 != null) {
            method4728(var7, class93.method2668(16748608) + arg1.field2103, var6, arg1.field2127, arg2, arg0.field3369, arg4);
        }
    }

    @ObfuscatedName("i.jj(Lkb;III)V")
    public static final void method62(class294 arg0, int arg1, int arg2) {
        if (arg0.field3372 == 1) {
            method11(arg0.field3502, "", 24, 0, 0, arg0.field3369);
        }
        if (arg0.field3372 == 2 && !field650) {
            String var3 = method4531(arg0);
            if (var3 != null) {
                method11(var3, class93.method2668(65280) + arg0.field3501, 25, 0, -1, arg0.field3369);
            }
        }
        if (arg0.field3372 == 3) {
            method11(class308.field3788, "", 26, 0, 0, arg0.field3369);
        }
        if (arg0.field3372 == 4) {
            method11(arg0.field3502, "", 28, 0, 0, arg0.field3369);
        }
        if (arg0.field3372 == 5) {
            method11(arg0.field3502, "", 29, 0, 0, arg0.field3369);
        }
        if (arg0.field3372 == 6 && field661 == null) {
            method11(arg0.field3502, "", 30, 0, -1, arg0.field3369);
        }
        if (arg0.field3371 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3385; var5++) {
                for (int var6 = 0; var6 < arg0.field3384; var6++) {
                    int var7 = (arg0.field3381 + 32) * var6;
                    int var8 = (arg0.field3438 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3439[var4];
                        var8 += arg0.field3456[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field605 = var4;
                        Statics.field1781 = arg0;
                        if (arg0.field3503[var4] > 0) {
                            class188 var9 = class188.method3161(arg0.field3503[var4] - 1);
                            if (field555 == 1 && class295.method2625(method2679(arg0))) {
                                if (Statics.field4121 != arg0.field3369 || Statics.field1900 != var4) {
                                    method11(class308.field3916, field581 + " " + class93.field1272 + " " + class93.method2668(16748608) + var9.field2103, 31, var9.field2127, var4, arg0.field3369);
                                }
                            } else if (!field650 || !class295.method2625(method2679(arg0))) {
                                String[] var10 = var9.field2118;
                                int var11 = -1;
                                if (field659) {
                                    boolean var12 = field642 || class24.field136[81];
                                    if (var12) {
                                        var11 = var9.method3397();
                                    }
                                }
                                if (class295.method2625(method2679(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            method2864(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                if (class295.method6736(method2679(arg0))) {
                                    method11(class308.field3916, class93.method2668(16748608) + var9.field2103, 38, var9.field2127, var4, arg0.field3369);
                                }
                                if (class295.method2625(method2679(arg0))) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11 != var14) {
                                            method2864(arg0, var9, var4, var14, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method2864(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var15 = arg0.field3440;
                                if (var15 != null) {
                                    for (int var16 = 4; var16 >= 0; var16--) {
                                        if (var15[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 39;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            if (var16 == 3) {
                                                var17 = 42;
                                            }
                                            if (var16 == 4) {
                                                var17 = 43;
                                            }
                                            method11(var15[var16], class93.method2668(16748608) + var9.field2103, var17, var9.field2127, var4, arg0.field3369);
                                        }
                                    }
                                }
                                method11(class308.field3763, class93.method2668(16748608) + var9.field2103, 1005, var9.field2127, var4, arg0.field3369);
                            } else if ((Statics.field1261 & 0x10) == 16) {
                                method11(field653, field510 + " " + class93.field1272 + " " + class93.method2668(16748608) + var9.field2103, 32, var9.field2127, var4, arg0.field3369);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3485) {
            return;
        }
        if (!field650) {
            for (int var18 = 9; var18 >= 5; var18--) {
                String var19 = method152(arg0, var18);
                if (var19 != null) {
                    method11(var19, arg0.field3380, 1007, var18 + 1, arg0.field3491, arg0.field3369);
                }
            }
            String var20 = method4531(arg0);
            if (var20 != null) {
                method11(var20, arg0.field3380, 25, 0, arg0.field3491, arg0.field3369);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                String var22 = method152(arg0, var21);
                if (var22 != null) {
                    method4728(var22, arg0.field3380, 57, var21 + 1, arg0.field3491, arg0.field3369, arg0.field3521);
                }
            }
            if (class295.method6735(method2679(arg0))) {
                method11(class308.field3622, "", 30, 0, arg0.field3491, arg0.field3369);
            }
        } else if (class295.method1796(method2679(arg0)) && (Statics.field1261 & 0x20) == 32) {
            method11(field653, field510 + " " + class93.field1272 + " " + arg0.field3380, 58, 0, arg0.field3491, arg0.field3369);
        }
    }

    @ObfuscatedName("i.jm(ZB)V")
    public static void method67(boolean arg0) {
        field642 = arg0;
    }

    @ObfuscatedName("fk.jk(B)Z")
    public static boolean method3166() {
        return field642;
    }

    @ObfuscatedName("h.ji(IIIIIIIS)V")
    public static final void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class294.method4251(arg0)) {
            method357(Statics.field324[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ao.jo([Lkb;IIIIIIIB)V")
    public static final void method357(class294[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class294 var9 = arg0[var8];
            if (var9 != null && var9.field3423 == arg1 && (var9.method5088() || method2679(var9) != 0 || field669 == var9)) {
                if (var9.field3485) {
                    if (method4018(var9)) {
                        continue;
                    }
                } else if (var9.field3371 == 0 && Statics.field4097 != var9 && method4018(var9)) {
                    continue;
                }
                if (var9.field3371 == 11 && var9.method5098(Statics.field1622)) {
                    if (var9.method5150()) {
                        method1899(var9);
                        method6223(var9.field3433, var9, true);
                    }
                    if (var9.field3496 != null) {
                        class81 var10 = new class81();
                        var10.field1048 = var9;
                        var10.field1056 = var9.field3496;
                        field698.method5530(var10);
                    }
                }
                int var11 = var9.field3382 + arg6;
                int var12 = var9.field3383 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field3371 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field3371 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field3384 + var11;
                    int var20 = var9.field3385 + var12;
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    if (var20 < var12) {
                        var18 = var20;
                        var20 = var12;
                    }
                    var19++;
                    var20++;
                    var13 = var17 > arg2 ? var17 : arg2;
                    var14 = var18 > arg3 ? var18 : arg3;
                    var15 = var19 < arg4 ? var19 : arg4;
                    var16 = var20 < arg5 ? var20 : arg5;
                } else {
                    int var23 = var9.field3384 + var11;
                    int var24 = var9.field3385 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field484 == var9) {
                    field676 = true;
                    field776 = var11;
                    field678 = var12;
                }
                boolean var25 = false;
                if (var9.field3499) {
                    switch(field657) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3369 >>> 16 == field658) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field658 == var9.field3369) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3485 || var13 < var15 && var14 < var16) {
                    if (var9.field3485) {
                        if (var9.field3519) {
                            if (class33.field223 >= var13 && class33.field225 >= var14 && class33.field223 < var15 && class33.field225 < var16) {
                                for (class81 var26 = (class81) field698.method5535(); var26 != null; var26 = (class81) field698.method5537()) {
                                    if (var26.field1047) {
                                        var26.method6497();
                                        var26.field1048.field3510 = false;
                                    }
                                }
                                if (Statics.field4232 == 0) {
                                    field484 = null;
                                    field669 = null;
                                }
                                if (!field631) {
                                    method2001();
                                }
                            }
                        } else if (var9.field3520 && class33.field223 >= var13 && class33.field225 >= var14 && class33.field223 < var15 && class33.field225 < var16) {
                            for (class81 var27 = (class81) field698.method5535(); var27 != null; var27 = (class81) field698.method5537()) {
                                if (var27.field1047 && var27.field1048.field3481 == var27.field1056) {
                                    var27.method6497();
                                }
                            }
                        }
                    }
                    int var28 = class33.field223;
                    int var29 = class33.field225;
                    if (class33.field231 != 0) {
                        var28 = class33.field232;
                        var29 = class33.field233;
                    }
                    boolean var30 = var28 >= var13 && var29 >= var14 && var28 < var15 && var29 < var16;
                    if (var9.field3373 == 1337) {
                        if (!field492 && !field631 && var30) {
                            method2018(var28, var29, var13, var14);
                        }
                    } else if (var9.field3373 == 1338) {
                        Statics.method1794(var9, var11, var12);
                    } else {
                        if (var9.field3373 == 1400) {
                            Statics.field1514.method6533(class33.field223, class33.field225, var30, var11, var12, var9.field3384, var9.field3385);
                        }
                        if (!field631 && var30) {
                            if (var9.field3373 == 1400) {
                                Statics.field1514.method6584(var11, var12, var9.field3384, var9.field3385, var28, var29);
                            } else {
                                method62(var9, var28 - var11, var29 - var12);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3449.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3449[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3449[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3518 != null) {
                                            var35 = class24.field136[var9.field3449[var31][var34]];
                                        }
                                        if (method2999(var9.field3449[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3518 != null && var9.field3518[var31] > field552) {
                                                break;
                                            }
                                            byte var36 = var9.field3407[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !class24.field136[86] && !class24.field136[82] && !class24.field136[81]) && ((var36 & 0x2) == 0 || class24.field136[86]) && ((var36 & 0x1) == 0 || class24.field136[82]) && ((var36 & 0x4) == 0 || class24.field136[81])) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method4049(var31 + 1, var9.field3369, var9.field3491, var9.field3505, "");
                                    } else if (var31 == 10) {
                                        method4577();
                                        method5423(var9.field3369, var9.field3491, class295.method4589(method2679(var9)), var9.field3505);
                                        field653 = method4531(var9);
                                        if (field653 == null) {
                                            field653 = class308.field3624;
                                        }
                                        field510 = var9.field3380 + class93.method2668(16777215);
                                    }
                                    int var37 = var9.field3451[var31];
                                    if (var9.field3518 == null) {
                                        var9.field3518 = new int[var9.field3449.length];
                                    }
                                    if (var9.field3452 == null) {
                                        var9.field3452 = new int[var9.field3449.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3518[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3518[var31] == 0) {
                                        var9.field3518[var31] = field552 + var37 + var9.field3452[var31];
                                    } else {
                                        var9.field3518[var31] = field552 + var37;
                                    }
                                }
                                if (!var32 && var9.field3518 != null) {
                                    var9.field3518[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3485) {
                            boolean var38;
                            if (class33.field223 >= var13 && class33.field225 >= var14 && class33.field223 < var15 && class33.field225 < var16) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class33.field234 == 1 || !Statics.field1528 && class33.field234 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class33.field231 == 1 || !Statics.field1528 && class33.field231 == 4) && class33.field232 >= var13 && class33.field233 >= var14 && class33.field232 < var15 && class33.field233 < var16) {
                                var40 = true;
                            }
                            if (var40) {
                                method2998(var9, class33.field232 - var11, class33.field233 - var12);
                                if (var9.field3371 == 11 && var9.method5093(class33.field232, class33.field233, arg6, arg7)) {
                                    switch(var9.method5097()) {
                                        case 0:
                                            class30.method4702(var9.method5099(), true, false);
                                            break;
                                        case 1:
                                            if (class295.method4201(method2679(var9))) {
                                                int[] var41 = var9.method5100();
                                                if (var41 != null) {
                                                    class264 var42 = class264.method3158(class262.field3013, field541.field1344);
                                                    var42.field3031.method7097(var41[0]);
                                                    var42.field3031.method7087(var9.method5179());
                                                    var42.field3031.method7243(var9.field3491);
                                                    var42.field3031.method7087(var41[1]);
                                                    var42.field3031.method7097(var41[2]);
                                                    var42.field3031.method7098(var9.field3369);
                                                    field541.method2378(var42);
                                                }
                                            }
                                    }
                                }
                            }
                            if (var9.field3373 == 1400) {
                                Statics.field1514.method6657(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field484 != null && field484 != var9 && var38 && class295.method4590(method2679(var9))) {
                                field672 = var9;
                            }
                            if (field669 == var9) {
                                field768 = true;
                                field665 = var11;
                                field551 = var12;
                            }
                            if (var9.field3402) {
                                if (var38 && field719 != 0 && var9.field3481 != null) {
                                    class81 var43 = new class81();
                                    var43.field1047 = true;
                                    var43.field1048 = var9;
                                    var43.field1050 = field719;
                                    var43.field1056 = var9.field3481;
                                    field698.method5530(var43);
                                }
                                if (field484 != null || Statics.field849 != null || field631) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3370 && var40) {
                                    var9.field3370 = true;
                                    if (var9.field3462 != null) {
                                        class81 var44 = new class81();
                                        var44.field1047 = true;
                                        var44.field1048 = var9;
                                        var44.field1046 = class33.field232 - var11;
                                        var44.field1050 = class33.field233 - var12;
                                        var44.field1056 = var9.field3462;
                                        field698.method5530(var44);
                                    }
                                }
                                if (var9.field3370 && var39 && var9.field3463 != null) {
                                    class81 var45 = new class81();
                                    var45.field1047 = true;
                                    var45.field1048 = var9;
                                    var45.field1046 = class33.field223 - var11;
                                    var45.field1050 = class33.field225 - var12;
                                    var45.field1056 = var9.field3463;
                                    field698.method5530(var45);
                                }
                                if (var9.field3370 && !var39) {
                                    var9.field3370 = false;
                                    if (var9.field3464 != null) {
                                        class81 var46 = new class81();
                                        var46.field1047 = true;
                                        var46.field1048 = var9;
                                        var46.field1046 = class33.field223 - var11;
                                        var46.field1050 = class33.field225 - var12;
                                        var46.field1056 = var9.field3464;
                                        field700.method5530(var46);
                                    }
                                }
                                if (var39 && var9.field3465 != null) {
                                    class81 var47 = new class81();
                                    var47.field1047 = true;
                                    var47.field1048 = var9;
                                    var47.field1046 = class33.field223 - var11;
                                    var47.field1050 = class33.field225 - var12;
                                    var47.field1056 = var9.field3465;
                                    field698.method5530(var47);
                                }
                                if (!var9.field3510 && var38) {
                                    var9.field3510 = true;
                                    if (var9.field3466 != null) {
                                        class81 var48 = new class81();
                                        var48.field1047 = true;
                                        var48.field1048 = var9;
                                        var48.field1046 = class33.field223 - var11;
                                        var48.field1050 = class33.field225 - var12;
                                        var48.field1056 = var9.field3466;
                                        field698.method5530(var48);
                                    }
                                }
                                if (var9.field3510 && var38 && var9.field3467 != null) {
                                    class81 var49 = new class81();
                                    var49.field1047 = true;
                                    var49.field1048 = var9;
                                    var49.field1046 = class33.field223 - var11;
                                    var49.field1050 = class33.field225 - var12;
                                    var49.field1056 = var9.field3467;
                                    field698.method5530(var49);
                                }
                                if (var9.field3510 && !var38) {
                                    var9.field3510 = false;
                                    if (var9.field3468 != null) {
                                        class81 var50 = new class81();
                                        var50.field1047 = true;
                                        var50.field1048 = var9;
                                        var50.field1046 = class33.field223 - var11;
                                        var50.field1050 = class33.field225 - var12;
                                        var50.field1056 = var9.field3468;
                                        field700.method5530(var50);
                                    }
                                }
                                if (var9.field3460 != null) {
                                    class81 var51 = new class81();
                                    var51.field1048 = var9;
                                    var51.field1056 = var9.field3460;
                                    field699.method5530(var51);
                                }
                                if (var9.field3473 != null && field607 > var9.field3513) {
                                    if (var9.field3474 == null || field607 - var9.field3513 > 32) {
                                        class81 var56 = new class81();
                                        var56.field1048 = var9;
                                        var56.field1056 = var9.field3473;
                                        field698.method5530(var56);
                                    } else {
                                        label650: for (int var52 = var9.field3513; var52 < field607; var52++) {
                                            int var53 = field681[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field3474.length; var54++) {
                                                if (var9.field3474[var54] == var53) {
                                                    class81 var55 = new class81();
                                                    var55.field1048 = var9;
                                                    var55.field1056 = var9.field3473;
                                                    field698.method5530(var55);
                                                    break label650;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3513 = field607;
                                }
                                if (var9.field3475 != null && field684 > var9.field3368) {
                                    if (var9.field3476 == null || field684 - var9.field3368 > 32) {
                                        class81 var61 = new class81();
                                        var61.field1048 = var9;
                                        var61.field1056 = var9.field3475;
                                        field698.method5530(var61);
                                    } else {
                                        label626: for (int var57 = var9.field3368; var57 < field684; var57++) {
                                            int var58 = field683[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field3476.length; var59++) {
                                                if (var9.field3476[var59] == var58) {
                                                    class81 var60 = new class81();
                                                    var60.field1048 = var9;
                                                    var60.field1056 = var9.field3475;
                                                    field698.method5530(var60);
                                                    break label626;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3368 = field684;
                                }
                                if (var9.field3412 != null && field686 > var9.field3515) {
                                    if (var9.field3478 == null || field686 - var9.field3515 > 32) {
                                        class81 var66 = new class81();
                                        var66.field1048 = var9;
                                        var66.field1056 = var9.field3412;
                                        field698.method5530(var66);
                                    } else {
                                        label602: for (int var62 = var9.field3515; var62 < field686; var62++) {
                                            int var63 = field757[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field3478.length; var64++) {
                                                if (var9.field3478[var64] == var63) {
                                                    class81 var65 = new class81();
                                                    var65.field1048 = var9;
                                                    var65.field1056 = var9.field3412;
                                                    field698.method5530(var65);
                                                    break label602;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3515 = field686;
                                }
                                if (field689 > var9.field3427 && var9.field3482 != null) {
                                    class81 var67 = new class81();
                                    var67.field1048 = var9;
                                    var67.field1056 = var9.field3482;
                                    field698.method5530(var67);
                                }
                                if (field690 > var9.field3427 && var9.field3486 != null) {
                                    class81 var68 = new class81();
                                    var68.field1048 = var9;
                                    var68.field1056 = var9.field3486;
                                    field698.method5530(var68);
                                }
                                if (field691 > var9.field3427 && var9.field3378 != null) {
                                    class81 var69 = new class81();
                                    var69.field1048 = var9;
                                    var69.field1056 = var9.field3378;
                                    field698.method5530(var69);
                                }
                                if (field526 > var9.field3427 && var9.field3366 != null) {
                                    class81 var70 = new class81();
                                    var70.field1048 = var9;
                                    var70.field1056 = var9.field3366;
                                    field698.method5530(var70);
                                }
                                if (field693 > var9.field3427 && var9.field3354 != null) {
                                    class81 var71 = new class81();
                                    var71.field1048 = var9;
                                    var71.field1056 = var9.field3354;
                                    field698.method5530(var71);
                                }
                                if (field481 > var9.field3427 && var9.field3494 != null) {
                                    class81 var72 = new class81();
                                    var72.field1048 = var9;
                                    var72.field1056 = var9.field3494;
                                    field698.method5530(var72);
                                }
                                if (field662 > var9.field3427 && var9.field3495 != null) {
                                    class81 var73 = new class81();
                                    var73.field1048 = var9;
                                    var73.field1056 = var9.field3495;
                                    field698.method5530(var73);
                                }
                                if (field696 > var9.field3427 && var9.field3490 != null) {
                                    class81 var74 = new class81();
                                    var74.field1048 = var9;
                                    var74.field1056 = var9.field3490;
                                    field698.method5530(var74);
                                }
                                var9.field3427 = field680;
                                if (var9.field3453 != null) {
                                    for (int var75 = 0; var75 < field720; var75++) {
                                        class81 var76 = new class81();
                                        var76.field1048 = var9;
                                        var76.field1049 = field722[var75];
                                        var76.field1054 = field721[var75];
                                        var76.field1056 = var9.field3453;
                                        field698.method5530(var76);
                                    }
                                }
                                if (var9.field3517 != null) {
                                    int[] var77 = class24.method4993();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class81 var79 = new class81();
                                        var79.field1048 = var9;
                                        var79.field1049 = var77[var78];
                                        var79.field1056 = var9.field3517;
                                        field698.method5530(var79);
                                    }
                                }
                                if (var9.field3514 != null) {
                                    int[] var80 = Statics.method2995();
                                    for (int var81 = 0; var81 < var80.length; var81++) {
                                        class81 var82 = new class81();
                                        var82.field1048 = var9;
                                        var82.field1049 = var80[var81];
                                        var82.field1056 = var9.field3514;
                                        field698.method5530(var82);
                                    }
                                }
                            }
                        }
                        if (!var9.field3485) {
                            if (field484 != null || Statics.field849 != null || field631) {
                                continue;
                            }
                            if ((var9.field3477 >= 0 || var9.field3396 != 0) && class33.field223 >= var13 && class33.field225 >= var14 && class33.field223 < var15 && class33.field225 < var16) {
                                if (var9.field3477 >= 0) {
                                    Statics.field4097 = arg0[var9.field3477];
                                } else {
                                    Statics.field4097 = var9;
                                }
                            }
                            if (var9.field3371 == 8 && class33.field223 >= var13 && class33.field225 >= var14 && class33.field223 < var15 && class33.field225 < var16) {
                                Statics.field314 = var9;
                            }
                            if (var9.field3393 > var9.field3385) {
                                method4739(var9, var9.field3384 + var11, var12, var9.field3385, var9.field3393, class33.field223, class33.field225);
                            }
                        }
                        if (var9.field3371 == 0) {
                            method357(arg0, var9.field3369, var13, var14, var15, var16, var11 - var9.field3511, var12 - var9.field3391);
                            if (var9.field3433 != null) {
                                method357(var9.field3433, var9.field3369, var13, var14, var15, var16, var11 - var9.field3511, var12 - var9.field3391);
                            }
                            class80 var83 = (class80) field656.method6765((long) var9.field3369);
                            if (var83 != null) {
                                if (var83.field1040 == 0 && class33.field223 >= var13 && class33.field225 >= var14 && class33.field223 < var15 && class33.field225 < var16 && !field631) {
                                    for (class81 var84 = (class81) field698.method5535(); var84 != null; var84 = (class81) field698.method5537()) {
                                        if (var84.field1047) {
                                            var84.method6497();
                                            var84.field1048.field3510 = false;
                                        }
                                    }
                                    if (Statics.field4232 == 0) {
                                        field484 = null;
                                        field669 = null;
                                    }
                                    if (!field631) {
                                        method2001();
                                    }
                                }
                                method172(var83.field1043, var13, var14, var15, var16, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fn.jb(IB)Z")
    public static boolean method2999(int arg0) {
        for (int var1 = 0; var1 < field720; var1++) {
            if (field722[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("w.jf(III)V")
    public static final void method51(int arg0, int arg1) {
        if (class294.method4251(arg0)) {
            method2961(Statics.field324[arg0], arg1);
        }
    }

    @ObfuscatedName("fr.jr([Lkb;IB)V")
    public static final void method2961(class294[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class294 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3371 == 0) {
                    if (var3.field3433 != null) {
                        method2961(var3.field3433, arg1);
                    }
                    class80 var4 = (class80) field656.method6765((long) var3.field3369);
                    if (var4 != null) {
                        method51(var4.field1043, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3472 != null) {
                    class81 var5 = new class81();
                    var5.field1048 = var3;
                    var5.field1056 = var3.field3472;
                    class64.method4199(var5);
                }
                if (arg1 == 1 && var3.field3430 != null) {
                    if (var3.field3491 >= 0) {
                        class294 var6 = class294.method2818(var3.field3369);
                        if (var6 == null || var6.field3433 == null || var3.field3491 >= var6.field3433.length || var6.field3433[var3.field3491] != var3) {
                            continue;
                        }
                    }
                    class81 var7 = new class81();
                    var7.field1048 = var3;
                    var7.field1056 = var3.field3430;
                    class64.method4199(var7);
                }
            }
        }
    }

    @ObfuscatedName("fn.js(Lkb;III)V")
    public static final void method2998(class294 arg0, int arg1, int arg2) {
        if (field484 != null || field631 || arg0 == null) {
            return;
        }
        class294 var3 = method2485(arg0);
        if (var3 == null) {
            var3 = arg0.field3455;
        }
        if (var3 == null) {
            return;
        }
        field484 = arg0;
        class294 var5 = method2485(arg0);
        if (var5 == null) {
            var5 = arg0.field3455;
        }
        field669 = var5;
        field670 = arg1;
        field626 = arg2;
        Statics.field4232 = 0;
        field679 = false;
        int var7 = method4592();
        if (var7 != -1) {
            method4216(var7);
        }
        return;
    }

    @ObfuscatedName("client.kp(I)V")
    public final void method1423() {
        method1899(field484);
        Statics.field4232++;
        if (field676 && field768) {
            int var1 = class33.field223;
            int var2 = class33.field225;
            int var3 = var1 - field670;
            int var4 = var2 - field626;
            if (var3 < field665) {
                var3 = field665;
            }
            if (field484.field3384 + var3 > field665 + field669.field3384) {
                var3 = field665 + field669.field3384 - field484.field3384;
            }
            if (var4 < field551) {
                var4 = field551;
            }
            if (field484.field3385 + var4 > field551 + field669.field3385) {
                var4 = field551 + field669.field3385 - field484.field3385;
            }
            int var5 = var3 - field776;
            int var6 = var4 - field678;
            int var7 = field484.field3450;
            if (Statics.field4232 > field484.field3457 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field679 = true;
            }
            int var8 = field669.field3511 + (var3 - field665);
            int var9 = field669.field3391 + (var4 - field551);
            if (field484.field3431 != null && field679) {
                class81 var10 = new class81();
                var10.field1048 = field484;
                var10.field1046 = var8;
                var10.field1050 = var9;
                var10.field1056 = field484.field3431;
                class64.method4199(var10);
            }
            if (class33.field234 == 0) {
                if (field679) {
                    if (field484.field3470 != null) {
                        class81 var11 = new class81();
                        var11.field1048 = field484;
                        var11.field1046 = var8;
                        var11.field1050 = var9;
                        var11.field1052 = field672;
                        var11.field1056 = field484.field3470;
                        class64.method4199(var11);
                    }
                    if (field672 != null && method2485(field484) != null) {
                        class264 var12 = class264.method3158(class262.field2913, field541.field1344);
                        var12.field3031.method7098(field484.field3369);
                        var12.field3031.method7177(field484.field3491);
                        var12.field3031.method7074(field672.field3369);
                        var12.field3031.method7085(field672.field3491);
                        var12.field3031.method7243(field484.field3505);
                        var12.field3031.method7085(field672.field3505);
                        field541.method2378(var12);
                    }
                } else if (this.method1319()) {
                    this.method1194(field776 + field670, field678 + field626);
                } else if (field632 > 0) {
                    method3581(field776 + field670, field678 + field626);
                }
                field484 = null;
            }
        } else if (Statics.field4232 > 1) {
            if (!field679 && field632 > 0) {
                method3581(field776 + field670, field678 + field626);
            }
            field484 = null;
        }
    }

    @ObfuscatedName("hq.kr(II)V")
    public static void method4216(int arg0) {
        Statics.field114 = new class67();
        Statics.field114.field875 = field633[arg0];
        Statics.field114.field876 = field634[arg0];
        Statics.field114.field877 = field635[arg0];
        Statics.field114.field883 = field523[arg0];
        Statics.field114.field882 = field637[arg0];
    }

    @ObfuscatedName("gv.kd(III)V")
    public static void method3581(int arg0, int arg1) {
        method4530(Statics.field114, arg0, arg1);
        Statics.field114 = null;
    }

    @ObfuscatedName("bx.kf(Lkb;I)V")
    public static void method1899(class294 arg0) {
        if (arg0 != null && field703 == arg0.field3355) {
            field704[arg0.field3400] = true;
        }
    }

    @ObfuscatedName("bh.ki(I)V")
    public static void method1781() {
        for (class80 var0 = (class80) field656.method6766(); var0 != null; var0 = (class80) field656.method6767()) {
            int var1 = var0.field1043;
            if (class294.method4251(var1)) {
                boolean var2 = true;
                class294[] var3 = Statics.field324[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3485;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4462;
                    class294 var6 = class294.method2818(var5);
                    if (var6 != null) {
                        method1899(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("lc.kk([Lkb;II)V")
    public static final void method5296(class294[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class294 var3 = arg0[var2];
            if (var3 != null && var3.field3423 == arg1 && (!var3.field3485 || !method4018(var3))) {
                if (var3.field3371 == 0) {
                    if (!var3.field3485 && method4018(var3) && Statics.field4097 != var3) {
                        continue;
                    }
                    method5296(arg0, var3.field3369);
                    if (var3.field3433 != null) {
                        method5296(var3.field3433, var3.field3369);
                    }
                    class80 var4 = (class80) field656.method6765((long) var3.field3369);
                    if (var4 != null) {
                        int var5 = var4.field1043;
                        if (class294.method4251(var5)) {
                            method5296(Statics.field324[var5], -1);
                        }
                    }
                }
                if (var3.field3371 == 6) {
                    if (var3.field3417 != -1 || var3.field3418 != -1) {
                        boolean var6 = method1611(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3418;
                        } else {
                            var7 = var3.field3417;
                        }
                        if (var7 != -1) {
                            class190 var8 = class190.method983(var7);
                            var3.field3401 += field556;
                            while (var3.field3401 > var8.field2180[var3.field3390]) {
                                var3.field3401 -= var8.field2180[var3.field3390];
                                var3.field3390++;
                                if (var3.field3390 >= var8.field2176.length) {
                                    var3.field3390 -= var8.field2178;
                                    if (var3.field3390 < 0 || var3.field3390 >= var8.field2176.length) {
                                        var3.field3390 = 0;
                                    }
                                }
                                method1899(var3);
                            }
                        }
                    }
                    if (var3.field3374 != 0 && !var3.field3485) {
                        int var9 = var3.field3374 >> 16;
                        int var10 = var3.field3374 << 16 >> 16;
                        int var11 = field556 * var9;
                        int var12 = field556 * var10;
                        var3.field3421 = var3.field3421 + var11 & 0x7FF;
                        var3.field3422 = var3.field3422 + var12 & 0x7FF;
                        method1899(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("iy.kb(II)V")
    public static final void method4653(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        class201.method3735((double) var3);
        ((class209) Statics.field2364).method4023((double) var3);
        class188.method1867();
        Statics.field109.method2147((double) var3);
    }

    @ObfuscatedName("go.ke(B)I")
    public static final int method3588() {
        float var0 = 200.0F * ((float) Statics.field109.method2146() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("jt.kh(II)V")
    public static final void method4711(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field109.method2150()) {
            return;
        }
        if (Statics.field109.method2150() == 0 && field743 != -1) {
            class273.method2292(Statics.field1516, field743, 0, var1, false);
            field735 = false;
        } else if (var1 == 0) {
            class273.method574();
            field735 = false;
        } else {
            class273.method935(var1);
        }
        Statics.field109.method2189(var1);
    }

    @ObfuscatedName("hh.ku(II)V")
    public static final void method4213(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field109.method2188(var1);
    }

    @ObfuscatedName("iy.kn(IB)V")
    public static final void method4654(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field109.method2233(var1);
    }

    @ObfuscatedName("kj.kw(II)V")
    public static final void method5227(int arg0) {
        method1781();
        for (class63 var1 = (class63) class63.field825.method5535(); var1 != null; var1 = (class63) class63.field825.method5537()) {
            if (var1.field821 != null) {
                var1.method1609();
            }
        }
        int var2 = class170.method3238(arg0).field1827;
        if (var2 == 0) {
            return;
        }
        int var3 = class288.field3326[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class201.method3735(0.9D);
                ((class209) Statics.field2364).method4023(0.9D);
                class188.method1867();
                Statics.field109.method2147(0.9D);
            }
            if (var3 == 2) {
                class201.method3735(0.8D);
                ((class209) Statics.field2364).method4023(0.8D);
                class188.method1867();
                Statics.field109.method2147(0.8D);
            }
            if (var3 == 3) {
                class201.method3735(0.7D);
                ((class209) Statics.field2364).method4023(0.7D);
                class188.method1867();
                Statics.field109.method2147(0.7D);
            }
            if (var3 == 4) {
                class201.method3735(0.6D);
                ((class209) Statics.field2364).method4023(0.6D);
                class188.method1867();
                Statics.field109.method2147(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method4711(255);
            }
            if (var3 == 1) {
                method4711(192);
            }
            if (var3 == 2) {
                method4711(128);
            }
            if (var3 == 3) {
                method4711(64);
            }
            if (var3 == 4) {
                method4711(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method4213(127);
            }
            if (var3 == 1) {
                method4213(96);
            }
            if (var3 == 2) {
                method4213(64);
            }
            if (var3 == 3) {
                method4213(32);
            }
            if (var3 == 4) {
                method4213(0);
            }
        }
        if (var2 == 5) {
            field630 = var3;
        }
        if (var2 == 6) {
            field576 = var3;
        }
        if (var2 == 9) {
            field677 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method4654(127);
            }
            if (var3 == 1) {
                method4654(96);
            }
            if (var3 == 2) {
                method4654(64);
            }
            if (var3 == 3) {
                method4654(32);
            }
            if (var3 == 4) {
                method4654(0);
            }
        }
        if (var2 == 17) {
            field488 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field505 = (class95) class329.method2087(class95.method50(), var3);
            if (field505 == null) {
                field505 = class95.field1292;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field727 = -1;
            } else {
                field727 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field709 = (class95) class329.method2087(class95.method50(), var3);
            if (field709 == null) {
                field709 = class95.field1292;
            }
        }
    }

    @ObfuscatedName("ho.kq(Lkb;I)V")
    public static final void method4521(class294 arg0) {
        int var1 = arg0.field3373;
        if (var1 == 324) {
            if (field536 == -1) {
                field536 = arg0.field3379;
                field764 = arg0.field3405;
            }
            if (field588.field3336) {
                arg0.field3379 = field536;
            } else {
                arg0.field3379 = field764;
            }
        } else if (var1 == 325) {
            if (field536 == -1) {
                field536 = arg0.field3379;
                field764 = arg0.field3405;
            }
            if (field588.field3336) {
                arg0.field3379 = field764;
            } else {
                arg0.field3379 = field536;
            }
        } else if (var1 == 327) {
            arg0.field3421 = 150;
            arg0.field3422 = (int) (Math.sin((double) field552 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3436 = 5;
            arg0.field3414 = 0;
        } else if (var1 == 328) {
            arg0.field3421 = 150;
            arg0.field3422 = (int) (Math.sin((double) field552 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3436 = 5;
            arg0.field3414 = 1;
        }
    }

    @ObfuscatedName("gb.kc(I)V")
    public static final void method4020() {
        class264 var0 = class264.method3158(class262.field2988, field541.field1344);
        field541.method2378(var0);
        class64.field843 = true;
        for (class80 var1 = (class80) field656.method6766(); var1 != null; var1 = (class80) field656.method6767()) {
            if (var1.field1040 == 0 || var1.field1040 == 3) {
                method4939(var1, true);
            }
        }
        if (field661 != null) {
            method1899(field661);
            field661 = null;
        }
        class64.field843 = false;
    }

    @ObfuscatedName("lb.kg(IIII)Lcq;")
    public static final class80 method5500(int arg0, int arg1, int arg2) {
        class80 var3 = new class80();
        var3.field1043 = arg1;
        var3.field1040 = arg2;
        field656.method6774(var3, (long) arg0);
        Statics.method177(arg1);
        class294 var4 = class294.method2818(arg0);
        method1899(var4);
        if (field661 != null) {
            method1899(field661);
            field661 = null;
        }
        method6223(Statics.field324[arg0 >> 16], var4, false);
        class64.method4222(arg1);
        if (field655 != -1) {
            method51(field655, 1);
        }
        return var3;
    }

    @ObfuscatedName("jy.ka(Lcq;ZB)V")
    public static final void method4939(class80 arg0, boolean arg1) {
        int var2 = arg0.field1043;
        int var3 = (int) arg0.field4462;
        arg0.method6497();
        if (arg1 && var2 != -1 && Statics.field2754[var2]) {
            Statics.field3260.method5308(var2);
            if (Statics.field324[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field324[var2].length; var5++) {
                    if (Statics.field324[var2][var5] != null) {
                        if (Statics.field324[var2][var5].field3371 == 2) {
                            var4 = false;
                        } else {
                            Statics.field324[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field324[var2] = null;
                }
                Statics.field2754[var2] = false;
            }
        }
        for (class409 var6 = (class409) field569.method6766(); var6 != null; var6 = (class409) field569.method6767()) {
            if ((long) var2 == (var6.field4462 >> 48 & 0xFFFFL)) {
                var6.method6497();
            }
        }
        class294 var7 = class294.method2818(var3);
        if (var7 != null) {
            method1899(var7);
        }
        if (field655 != -1) {
            method51(field655, 1);
        }
    }

    @ObfuscatedName("br.kx(Lkb;I)Z")
    public static final boolean method995(class294 arg0) {
        int var1 = arg0.field3373;
        if (var1 == 205) {
            field542 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field588.method5038(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field588.method5043(var4, var5 == 1);
        }
        if (var1 == 324) {
            field588.method5040(false);
        }
        if (var1 == 325) {
            field588.method5040(true);
        }
        if (var1 == 326) {
            class264 var6 = class264.method3158(class262.field3011, field541.field1344);
            field588.method5041(var6.field3031);
            field541.method2378(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dw.ko(Lkb;IIII)V")
    public static final void method2626(class294 arg0, int arg1, int arg2, int arg3) {
        method4007();
        class287 var4 = arg0.method5086(false);
        if (var4 == null) {
            return;
        }
        class452.method7402(arg1, arg2, var4.field3321 + arg1, var4.field3317 + arg2);
        if (field733 == 2 || field733 == 5) {
            class452.method7363(arg1, arg2, 0, var4.field3318, var4.field3316);
        } else {
            int var5 = field564 & 0x7FF;
            int var6 = Statics.field1366.field1137 / 32 + 48;
            int var7 = 464 - Statics.field1366.field1131 / 32;
            Statics.field1984.method7476(arg1, arg2, var4.field3321, var4.field3317, var6, var7, var5, 256, var4.field3318, var4.field3316);
            for (int var8 = 0; var8 < field649; var8++) {
                int var9 = field728[var8] * 4 + 2 - Statics.field1366.field1137 / 32;
                int var10 = field477[var8] * 4 + 2 - Statics.field1366.field1131 / 32;
                method3264(arg1, arg2, var9, var10, field730[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class334 var13 = field623[Statics.field1356][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1366.field1137 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1366.field1131 / 32;
                        method3264(arg1, arg2, var14, var15, Statics.field39[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field537; var16++) {
                class92 var17 = field742[field707[var16]];
                if (var17 != null && var17.method2059()) {
                    class178 var18 = var17.field1263;
                    if (var18 != null && var18.field1953 != null) {
                        var18 = var18.method3173();
                    }
                    if (var18 != null && var18.field1944 && var18.field1956) {
                        int var19 = var17.field1137 / 32 - Statics.field1366.field1137 / 32;
                        int var20 = var17.field1131 / 32 - Statics.field1366.field1131 / 32;
                        method3264(arg1, arg2, var19, var20, Statics.field39[1], var4);
                    }
                }
            }
            int var21 = class97.field1309;
            int[] var22 = class97.field1310;
            for (int var23 = 0; var23 < var21; var23++) {
                class85 var24 = field643[var22[var23]];
                if (var24 != null && var24.method2059() && !var24.field1101 && Statics.field1366 != var24) {
                    int var25 = var24.field1137 / 32 - Statics.field1366.field1137 / 32;
                    int var26 = var24.field1131 / 32 - Statics.field1366.field1131 / 32;
                    if (var24.method2027()) {
                        method3264(arg1, arg2, var25, var26, Statics.field39[3], var4);
                    } else if (Statics.field1366.field1105 != 0 && var24.field1105 != 0 && Statics.field1366.field1105 == var24.field1105) {
                        method3264(arg1, arg2, var25, var26, Statics.field39[4], var4);
                    } else if (var24.method2030()) {
                        method3264(arg1, arg2, var25, var26, Statics.field39[5], var4);
                    } else if (var24.method2035()) {
                        method3264(arg1, arg2, var25, var26, Statics.field39[6], var4);
                    } else {
                        method3264(arg1, arg2, var25, var26, Statics.field39[2], var4);
                    }
                }
            }
            if (field497 != 0 && field552 % 20 < 10) {
                if (field497 == 1 && field594 >= 0 && field594 < field742.length) {
                    class92 var27 = field742[field594];
                    if (var27 != null) {
                        int var28 = var27.field1137 / 32 - Statics.field1366.field1137 / 32;
                        int var29 = var27.field1131 / 32 - Statics.field1366.field1131 / 32;
                        method2482(arg1, arg2, var28, var29, Statics.field989[1], var4);
                    }
                }
                if (field497 == 2) {
                    int var30 = field500 * 4 - Statics.field168 * 4 + 2 - Statics.field1366.field1137 / 32;
                    int var31 = field758 * 4 - Statics.field2674 * 4 + 2 - Statics.field1366.field1131 / 32;
                    method2482(arg1, arg2, var30, var31, Statics.field989[1], var4);
                }
                if (field497 == 10 && field499 >= 0 && field499 < field643.length) {
                    class85 var32 = field643[field499];
                    if (var32 != null) {
                        int var33 = var32.field1137 / 32 - Statics.field1366.field1137 / 32;
                        int var34 = var32.field1131 / 32 - Statics.field1366.field1131 / 32;
                        method2482(arg1, arg2, var33, var34, Statics.field989[1], var4);
                    }
                }
            }
            if (field493 != 0) {
                int var35 = field493 * 4 + 2 - Statics.field1366.field1137 / 32;
                int var36 = field732 * 4 + 2 - Statics.field1366.field1131 / 32;
                method3264(arg1, arg2, var35, var36, Statics.field989[0], var4);
            }
            if (!Statics.field1366.field1101) {
                class452.method7400(var4.field3321 / 2 + arg1 - 1, var4.field3317 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field705[arg3] = true;
    }

    @ObfuscatedName("co.kz(Lkb;IIII)V")
    public static final void method2266(class294 arg0, int arg1, int arg2, int arg3) {
        class287 var4 = arg0.method5086(false);
        if (var4 == null) {
            return;
        }
        if (field733 < 3) {
            Statics.field3162.method7476(arg1, arg2, var4.field3321, var4.field3317, 25, 25, field564, 256, var4.field3318, var4.field3316);
        } else {
            class452.method7363(arg1, arg2, 0, var4.field3318, var4.field3316);
        }
    }

    @ObfuscatedName("dy.kj(IIIILqe;Lkp;I)V")
    public static final void method2482(int arg0, int arg1, int arg2, int arg3, class456 arg4, class287 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3264(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field564 & 0x7FF;
        int var8 = class201.field2363[var7];
        int var9 = class201.field2352[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3321 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field4155.method7477(arg5.field3321 / 2 + arg0 - var17 / 2 + var15, arg5.field3317 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("gf.kl(IIIILqe;Lkp;I)V")
    public static final void method3264(int arg0, int arg1, int arg2, int arg3, class456 arg4, class287 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field564 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class201.field2363[var6];
        int var9 = class201.field2352[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method7568(arg5.field3321 / 2 + var10 - arg4.field4800 / 2, arg5.field3317 / 2 - var11 - arg4.field4798 / 2, arg0, arg1, arg5.field3321, arg5.field3317, arg5.field3318, arg5.field3316);
        } else {
            arg4.method7460(arg5.field3321 / 2 + arg0 + var10 - arg4.field4800 / 2, arg5.field3317 / 2 + arg1 - var11 - arg4.field4798 / 2);
        }
    }

    @ObfuscatedName("du.km(B)V")
    public static final void method2692() {
        Iterator var0 = class99.field1333.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method989();
        }
        if (Statics.field3294 != null) {
            Statics.field3294.method6013();
        }
    }

    @ObfuscatedName("fn.ky(B)V")
    public static final void method2997() {
        for (int var0 = 0; var0 < class97.field1309; var0++) {
            class85 var1 = field643[class97.field1310[var0]];
            var1.method2031();
        }
    }

    @ObfuscatedName("id.kv(I)V")
    public static final void method4704() {
        field691 = field680;
        Statics.field949 = true;
    }

    @ObfuscatedName("dz.ks(B)V")
    public static final void method2461() {
        field526 = field680;
        Statics.field4083 = true;
    }

    @ObfuscatedName("bj.lc(Ljava/lang/String;I)V")
    public static final void method1974(String arg0) {
        if (Statics.field3294 != null) {
            class264 var1 = class264.method3158(class262.field2924, field541.field1344);
            var1.field3031.method7031(class443.method2008(arg0));
            var1.field3031.method7037(arg0);
            field541.method2378(var1);
        }
    }

    @ObfuscatedName("ca.le(Ljava/lang/String;B)V")
    public static final void method2310(String arg0) {
        if (!arg0.equals("")) {
            class264 var1 = class264.method3158(class262.field2943, field541.field1344);
            var1.field3031.method7031(class443.method2008(arg0));
            var1.field3031.method7037(arg0);
            field541.method2378(var1);
        }
    }

    @ObfuscatedName("dz.lh(S)V")
    public static final void method2454() {
        class264 var0 = class264.method3158(class262.field2943, field541.field1344);
        var0.field3031.method7031(0);
        field541.method2378(var0);
    }

    @ObfuscatedName("bn.lt(IIB)V")
    public static final void method1016(int arg0, int arg1) {
        class149 var2 = arg0 >= 0 ? field725[arg0] : Statics.field1710;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2850()) {
            return;
        }
        class131 var3 = (class131) var2.field1692.get(arg1);
        if (var3.field1582 != -1) {
            return;
        }
        String var4 = var3.field1580.method7617();
        class264 var5 = class264.method3158(class262.field2915, field541.field1344);
        var5.field3031.method7031(3 + class443.method2008(var4));
        var5.field3031.method7031(arg0);
        var5.field3031.method7244(arg1);
        var5.field3031.method7037(var4);
        field541.method2378(var5);
    }

    @ObfuscatedName("jn.ls(III)V")
    public static final void method4724(int arg0, int arg1) {
        if (field725[arg0] == null || arg1 < 0 || arg1 >= field725[arg0].method2850()) {
            return;
        }
        class131 var2 = (class131) field725[arg0].field1692.get(arg1);
        if (var2.field1582 != -1) {
            return;
        }
        class264 var3 = class264.method3158(class262.field3001, field541.field1344);
        var3.field3031.method7031(3 + class443.method2008(var2.field1580.method7617()));
        var3.field3031.method7031(arg0);
        var3.field3031.method7244(arg1);
        var3.field3031.method7037(var2.field1580.method7617());
        field541.method2378(var3);
    }

    @ObfuscatedName("hu.lv(IIZI)V")
    public static final void method4194(int arg0, int arg1, boolean arg2) {
        if (field725[arg0] == null || arg1 < 0 || arg1 >= field725[arg0].method2850()) {
            return;
        }
        class131 var3 = (class131) field725[arg0].field1692.get(arg1);
        class264 var4 = class264.method3158(class262.field2961, field541.field1344);
        var4.field3031.method7031(4 + class443.method2008(var3.field1580.method7617()));
        var4.field3031.method7031(arg0);
        var4.field3031.method7244(arg1);
        var4.field3031.method7036(arg2);
        var4.field3031.method7037(var3.field1580.method7617());
        field541.method2378(var4);
    }

    @ObfuscatedName("dj.lw(Lkb;I)I")
    public static int method2679(class294 arg0) {
        class409 var1 = (class409) field569.method6765(((long) arg0.field3369 << 32) + (long) arg0.field3491);
        return var1 == null ? arg0.field3447 : var1.field4461;
    }

    @ObfuscatedName("dy.lq(Lkb;B)Lkb;")
    public static class294 method2485(class294 arg0) {
        int var1 = class295.method2724(method2679(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class294.method2818(arg0.field3423);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("gh.ln(Lkb;I)Z")
    public static boolean method4018(class294 arg0) {
        return arg0.field3446;
    }

    @ObfuscatedName("u.lm(Lkb;II)Ljava/lang/String;")
    public static String method152(class294 arg0, int arg1) {
        int var2 = method2679(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field3480 == null) {
            return null;
        } else if (arg0.field3454 == null || arg0.field3454.length <= arg1 || arg0.field3454[arg1] == null || arg0.field3454[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3454[arg1];
        }
    }

    @ObfuscatedName("hz.lj(Lkb;I)Ljava/lang/String;")
    public static String method4531(class294 arg0) {
        if (class295.method4589(method2679(arg0)) == 0) {
            return null;
        } else if (arg0.field3459 == null || arg0.field3459.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3459;
        }
    }

    @ObfuscatedName("lz.lu(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method5515(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field479 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field479 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field479 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field479 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field479 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field4046 != null) {
            var3 = "/p=" + Statics.field4046;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1604 + "/a=" + Statics.field100 + var3 + "/";
    }

    @ObfuscatedName("j.ly(Ljava/lang/String;I)V")
    public static void method10(String arg0) {
        Statics.field4046 = arg0;
        try {
            String var1 = Statics.field4220.getParameter(Integer.toString(18));
            String var2 = Statics.field4220.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class284.method2267(class269.method2567() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field4220;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("m.ll(Ljava/lang/String;ZB)V")
    public static void method303(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3030; var5++) {
            class188 var6 = class188.method3161(var5);
            if ((!arg1 || var6.field2143) && var6.field2135 == -1 && var6.field2103.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1208 = -1;
                    Statics.field51 = null;
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
        Statics.field51 = var3;
        Statics.field4333 = 0;
        Statics.field1208 = var4;
        String[] var9 = new String[Statics.field1208];
        for (int var10 = 0; var10 < Statics.field1208; var10++) {
            var9[var10] = class188.method3161(var3[var10]).field2103;
        }
        short[] var11 = Statics.field51;
        class440.method1614(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("hp.lg(Lqt;II)V")
    public static void method4240(class443 arg0, int arg1) {
        byte[] var2 = arg0.field4701;
        if (field535 == null) {
            field535 = new byte[24];
        }
        class351.method5918(var2, arg1, field535, 0, 24);
        if (class158.field1758 == null) {
            return;
        }
        try {
            class158.field1758.method6825(0L);
            class158.field1758.method6830(arg0.field4701, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("client.la(I)Lqa;")
    public class464 method1051() {
        return Statics.field1366 == null ? null : Statics.field1366.field1114;
    }

    @ObfuscatedName("ix.lp(II)V")
    public static void method4578(int arg0) {
        field770 = arg0;
    }

    @ObfuscatedName("cp.lb(S)V")
    public static void method2097() {
        field541.method2378(class264.method3158(class262.field2946, field541.field1344));
        field770 = 0;
    }

    @ObfuscatedName("ff.lz(I)V")
    public static void method3007() {
        if (field770 == 1) {
            field534 = true;
        }
    }

    @ObfuscatedName("cw.lf(I)V")
    public static void method2006() {
        if (!field534 || Statics.field1366 == null) {
            return;
        }
        int var0 = Statics.field1366.field1200[0];
        int var1 = Statics.field1366.field1201[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1039 = Statics.field1366.field1137;
        int var2 = method4195(Statics.field1366.field1137, Statics.field1366.field1131, Statics.field1356) - field570;
        if (var2 < Statics.field1993) {
            Statics.field1993 = var2;
        }
        Statics.field1658 = Statics.field1366.field1131;
        field534 = false;
    }

    @ObfuscatedName("cz.lr(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method2273(String arg0) {
        class310[] var1 = class310.method715();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class310 var3 = var1[var2];
            if (var3.field3963 != -1 && arg0.startsWith(class93.method1971(var3.field3963))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3963).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cw.lo(I)V")
    public static void method2011() {
        if (Statics.field1363 == null) {
            return;
        }
        field771 = field552;
        Statics.field1363.method5478();
        for (int var0 = 0; var0 < field643.length; var0++) {
            if (field643[var0] != null) {
                Statics.field1363.method5491((field643[var0].field1137 >> 7) + Statics.field168, (field643[var0].field1131 >> 7) + Statics.field2674);
            }
        }
    }

    @ObfuscatedName("gr.lx(IB)V")
    public static void method3299(int arg0) {
        if (field512 != arg0) {
            field512 = arg0;
        }
    }

    @ObfuscatedName("df.lk(IB)Lps;")
    public static class437 method2676(int arg0) {
        class437 var1 = (class437) field498.method4691((long) arg0);
        if (var1 == null) {
            var1 = new class437(Statics.field1589, class439.method4986(arg0), class439.method2091(arg0));
            field498.method4693(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("ij.li(IB)Lps;")
    public static class437 method4575(int arg0) {
        class437 var1 = (class437) field769.method4691((long) arg0);
        if (var1 == null) {
            var1 = new class437(Statics.field1589, arg0);
        }
        return var1;
    }
}

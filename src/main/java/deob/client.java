package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;

public final class client extends class36 implements class385, OAuthApi {

    @ObfuscatedName("client.w")
    public static class201[] field742;

    @ObfuscatedName("client.bx")
    public static boolean field518 = true;

    @ObfuscatedName("client.bh")
    public static int field726 = 1;

    @ObfuscatedName("client.bm")
    public static int field491 = 0;

    @ObfuscatedName("client.bl")
    public static int field769 = 0;

    @ObfuscatedName("client.bd")
    public static boolean field493 = false;

    @ObfuscatedName("client.bq")
    public static boolean field494 = false;

    @ObfuscatedName("client.ba")
    public static int field495 = -1;

    @ObfuscatedName("client.br")
    public static int field562 = -1;

    @ObfuscatedName("client.be")
    public static int field574 = -1;

    @ObfuscatedName("client.by")
    public static boolean field498 = false;

    @ObfuscatedName("client.bb")
    public static int field790 = 209;

    @ObfuscatedName("client.ci")
    public static int field624 = 0;

    @ObfuscatedName("client.df")
    public static boolean field686 = true;

    @ObfuscatedName("client.dc")
    public static int field503 = 0;

    @ObfuscatedName("client.dk")
    public static long field504 = -1L;

    @ObfuscatedName("client.de")
    public static int field505 = -1;

    @ObfuscatedName("client.dt")
    public static int field631 = -1;

    @ObfuscatedName("client.da")
    public static long field502 = -1L;

    @ObfuscatedName("client.dx")
    public static boolean field508 = true;

    @ObfuscatedName("client.dp")
    public static int field509 = 0;

    @ObfuscatedName("client.dj")
    public static int field510 = 0;

    @ObfuscatedName("client.dm")
    public static int field737 = 0;

    @ObfuscatedName("client.dg")
    public static int field512 = 0;

    @ObfuscatedName("client.dr")
    public static int field513 = 0;

    @ObfuscatedName("client.dl")
    public static int field514 = 0;

    @ObfuscatedName("client.dy")
    public static int field771 = 0;

    @ObfuscatedName("client.do")
    public static int field724 = 0;

    @ObfuscatedName("client.dw")
    public static int field542 = 0;

    @ObfuscatedName("client.dn")
    public static class99 field670 = class99.field1292;

    @ObfuscatedName("client.db")
    public static class99 field708 = class99.field1292;

    @ObfuscatedName("client.ej")
    public static int field651 = 0;

    @ObfuscatedName("client.el")
    public static int field521 = 0;

    @ObfuscatedName("client.eo")
    public static int field522 = 0;

    @ObfuscatedName("client.ft")
    public static int field524 = 0;

    @ObfuscatedName("client.fg")
    public static int field525 = 0;

    @ObfuscatedName("client.fk")
    public static int field526 = 0;

    @ObfuscatedName("client.fn")
    public static int field527 = 0;

    @ObfuscatedName("client.fh")
    public static int field575 = 0;

    @ObfuscatedName("client.fi")
    public static class132 field529 = class132.field1560;

    @ObfuscatedName("client.fo")
    public static class468 field616 = class468.field4924;

    @ObfuscatedName("client.fb")
    public String field531;

    @ObfuscatedName("client.fj")
    public class15 field532;

    @ObfuscatedName("client.gj")
    public class20 field533;

    @ObfuscatedName("client.gl")
    public OtlTokenRequester field673;

    @ObfuscatedName("client.gu")
    public Future field535;

    @ObfuscatedName("client.ga")
    public boolean field693 = false;

    @ObfuscatedName("client.gy")
    public class20 field537;

    @ObfuscatedName("client.gc")
    public RefreshAccessTokenRequester field538;

    @ObfuscatedName("client.gt")
    public Future field539;

    @ObfuscatedName("client.gb")
    public static final String field653;

    @ObfuscatedName("client.gg")
    public static boolean field749;

    @ObfuscatedName("client.gh")
    public static class75 field543;

    @ObfuscatedName("client.gr")
    public class464 field586;

    @ObfuscatedName("client.gv")
    public class8 field545;

    @ObfuscatedName("client.go")
    public long field546 = -1L;

    @ObfuscatedName("client.gi")
    public static byte[] field547;

    @ObfuscatedName("client.gd")
    public static class96[] field760;

    @ObfuscatedName("client.ho")
    public static int field549;

    @ObfuscatedName("client.hp")
    public static int[] field550;

    @ObfuscatedName("client.hm")
    public static int field551;

    @ObfuscatedName("client.hh")
    public static int[] field552;

    @ObfuscatedName("client.hd")
    public static final class107 field636;

    @ObfuscatedName("client.hj")
    public static int field554;

    @ObfuscatedName("client.hk")
    public static boolean field555;

    @ObfuscatedName("client.hg")
    public static class375 field556;

    @ObfuscatedName("client.hn")
    public static HashMap field792;

    @ObfuscatedName("client.hb")
    public static int field558;

    @ObfuscatedName("client.hx")
    public static int field489;

    @ObfuscatedName("client.hq")
    public static int field560;

    @ObfuscatedName("client.it")
    public static String field661;

    @ObfuscatedName("client.ii")
    public static int field561;

    @ObfuscatedName("client.il")
    public static int field583;

    @ObfuscatedName("client.is")
    public static boolean field564;

    @ObfuscatedName("client.ig")
    public static int[][][] field565;

    @ObfuscatedName("client.ip")
    public static final int[] field566;

    @ObfuscatedName("client.ic")
    public static int field559;

    @ObfuscatedName("client.je")
    public static int field715;

    @ObfuscatedName("client.jh")
    public static int field569;

    @ObfuscatedName("client.jx")
    public static int field570;

    @ObfuscatedName("client.jt")
    public static int field571;

    @ObfuscatedName("client.jy")
    public static boolean field572;

    @ObfuscatedName("client.jb")
    public static int field573;

    @ObfuscatedName("client.ja")
    public static int field619;

    @ObfuscatedName("client.jo")
    public static int field530;

    @ObfuscatedName("client.jd")
    public static int field576;

    @ObfuscatedName("client.jl")
    public static int field577;

    @ObfuscatedName("client.jf")
    public static int field578;

    @ObfuscatedName("client.jv")
    public static int field744;

    @ObfuscatedName("client.jz")
    public static int field580;

    @ObfuscatedName("client.js")
    public static int field581;

    @ObfuscatedName("client.km")
    public static int field582;

    @ObfuscatedName("client.kf")
    public static int field534;

    @ObfuscatedName("client.kj")
    public static int field584;

    @ObfuscatedName("client.kl")
    public static int field585;

    @ObfuscatedName("client.kg")
    public static int field625;

    @ObfuscatedName("client.ki")
    public static int field587;

    @ObfuscatedName("client.ko")
    public static boolean field501;

    @ObfuscatedName("client.kp")
    public static int field780;

    @ObfuscatedName("client.ke")
    public static boolean field590;

    @ObfuscatedName("client.kz")
    public static int field591;

    @ObfuscatedName("client.kx")
    public static int field519;

    @ObfuscatedName("client.ks")
    public static int field593;

    @ObfuscatedName("client.kk")
    public static int[] field594;

    @ObfuscatedName("client.kq")
    public static int[] field766;

    @ObfuscatedName("client.kn")
    public static int[] field579;

    @ObfuscatedName("client.kd")
    public static int[] field517;

    @ObfuscatedName("client.ky")
    public static int[] field598;

    @ObfuscatedName("client.ku")
    public static int[] field599;

    @ObfuscatedName("client.kh")
    public static int[] field507;

    @ObfuscatedName("client.kw")
    public static String[] field601;

    @ObfuscatedName("client.kc")
    public static int[][] field713;

    @ObfuscatedName("client.ka")
    public static int field603;

    @ObfuscatedName("client.kr")
    public static int field667;

    @ObfuscatedName("client.kt")
    public static int field605;

    @ObfuscatedName("client.li")
    public static int field515;

    @ObfuscatedName("client.lk")
    public static int field607;

    @ObfuscatedName("client.la")
    public static int field762;

    @ObfuscatedName("client.lh")
    public static int field609;

    @ObfuscatedName("client.lr")
    public static boolean field610;

    @ObfuscatedName("client.lq")
    public static int field698;

    @ObfuscatedName("client.lc")
    public static int field746;

    @ObfuscatedName("client.lz")
    public static int field595;

    @ObfuscatedName("client.lf")
    public static int field496;

    @ObfuscatedName("client.lu")
    public static int field615;

    @ObfuscatedName("client.lv")
    public static int field750;

    @ObfuscatedName("client.lj")
    public static boolean field617;

    @ObfuscatedName("client.lx")
    public static int field644;

    @ObfuscatedName("client.lw")
    public static int field688;

    @ObfuscatedName("client.ll")
    public static boolean field620;

    @ObfuscatedName("client.ln")
    public static class89[] field621;

    @ObfuscatedName("client.lo")
    public static int field622;

    @ObfuscatedName("client.le")
    public static int field779;

    @ObfuscatedName("client.ld")
    public static long field490;

    @ObfuscatedName("client.mi")
    public static boolean field597;

    @ObfuscatedName("client.mw")
    public static int field626;

    @ObfuscatedName("client.mo")
    public static int field627;

    @ObfuscatedName("client.mh")
    public static int[] field628;

    @ObfuscatedName("client.mp")
    public static final int[] field629;

    @ObfuscatedName("client.me")
    public static String[] field630;

    @ObfuscatedName("client.mt")
    public static boolean[] field613;

    @ObfuscatedName("client.ml")
    public static int[] field632;

    @ObfuscatedName("client.mf")
    public static int field633;

    @ObfuscatedName("client.mz")
    public static class349[][][] field723;

    @ObfuscatedName("client.mq")
    public static class349 field635;

    @ObfuscatedName("client.ma")
    public static class349 field711;

    @ObfuscatedName("client.mk")
    public static class349 field637;

    @ObfuscatedName("client.mm")
    public static int[] field638;

    @ObfuscatedName("client.mu")
    public static int[] field675;

    @ObfuscatedName("client.mg")
    public static int[] field640;

    @ObfuscatedName("client.my")
    public static boolean field720;

    @ObfuscatedName("client.mb")
    public static boolean field642;

    @ObfuscatedName("client.nu")
    public static int field553;

    @ObfuscatedName("client.ns")
    public static int[] field709;

    @ObfuscatedName("client.nt")
    public static int[] field645;

    @ObfuscatedName("client.nx")
    public static int[] field646;

    @ObfuscatedName("client.nv")
    public static int[] field647;

    @ObfuscatedName("client.nf")
    public static int[] field648;

    @ObfuscatedName("client.nn")
    public static String[] field649;

    @ObfuscatedName("client.nm")
    public static String[] field781;

    @ObfuscatedName("client.nr")
    public static boolean[] field774;

    @ObfuscatedName("client.no")
    public static boolean field652;

    @ObfuscatedName("client.nh")
    public static boolean field506;

    @ObfuscatedName("client.na")
    public static boolean field654;

    @ObfuscatedName("client.nw")
    public static boolean field655;

    @ObfuscatedName("client.nj")
    public static int field656;

    @ObfuscatedName("client.nb")
    public static int field657;

    @ObfuscatedName("client.ny")
    public static int field528;

    @ObfuscatedName("client.nc")
    public static int field787;

    @ObfuscatedName("client.np")
    public static int field660;

    @ObfuscatedName("client.ni")
    public static boolean field662;

    @ObfuscatedName("client.oc")
    public static int field663;

    @ObfuscatedName("client.on")
    public static int field664;

    @ObfuscatedName("client.of")
    public static String field511;

    @ObfuscatedName("client.ot")
    public static String field612;

    @ObfuscatedName("client.ok")
    public static int field751;

    @ObfuscatedName("client.os")
    public static class441 field668;

    @ObfuscatedName("client.or")
    public static int field669;

    @ObfuscatedName("client.oq")
    public static int field756;

    @ObfuscatedName("client.od")
    public static int field611;

    @ObfuscatedName("client.ol")
    public static int field672;

    @ObfuscatedName("client.oy")
    public static class303 field499;

    @ObfuscatedName("client.ov")
    public static int field674;

    @ObfuscatedName("client.ox")
    public static int field717;

    @ObfuscatedName("client.oo")
    public static int field608;

    @ObfuscatedName("client.op")
    public static int field677;

    @ObfuscatedName("client.ou")
    public static boolean field678;

    @ObfuscatedName("client.oi")
    public static class303 field679;

    @ObfuscatedName("client.oa")
    public static class303 field732;

    @ObfuscatedName("client.oz")
    public static class303 field681;

    @ObfuscatedName("client.oe")
    public static int field682;

    @ObfuscatedName("client.pp")
    public static int field683;

    @ObfuscatedName("client.pn")
    public static class303 field684;

    @ObfuscatedName("client.pc")
    public static boolean field685;

    @ObfuscatedName("client.pi")
    public static int field604;

    @ObfuscatedName("client.po")
    public static int field687;

    @ObfuscatedName("client.pf")
    public static boolean field641;

    @ObfuscatedName("client.pm")
    public static int field689;

    @ObfuscatedName("client.pg")
    public static int field690;

    @ObfuscatedName("client.pu")
    public static boolean field691;

    @ObfuscatedName("client.pk")
    public static int field736;

    @ObfuscatedName("client.pt")
    public static int[] field789;

    @ObfuscatedName("client.ps")
    public static int field548;

    @ObfuscatedName("client.pd")
    public static int[] field695;

    @ObfuscatedName("client.pq")
    public static int field696;

    @ObfuscatedName("client.pz")
    public static int[] field697;

    @ObfuscatedName("client.pv")
    public static int field600;

    @ObfuscatedName("client.py")
    public static int[] field699;

    @ObfuscatedName("client.pe")
    public static int field700;

    @ObfuscatedName("client.pr")
    public static int field701;

    @ObfuscatedName("client.pa")
    public static int field702;

    @ObfuscatedName("client.qn")
    public static int field703;

    @ObfuscatedName("client.qu")
    public static int field704;

    @ObfuscatedName("client.qt")
    public static int field705;

    @ObfuscatedName("client.qv")
    public static int field706;

    @ObfuscatedName("client.qx")
    public static int field707;

    @ObfuscatedName("client.qz")
    public static int field500;

    @ObfuscatedName("client.qi")
    public static int field497;

    @ObfuscatedName("client.ql")
    public static class481 field710;

    @ObfuscatedName("client.qo")
    public static class349 field623;

    @ObfuscatedName("client.qp")
    public static class349 field712;

    @ObfuscatedName("client.qq")
    public static class349 field671;

    @ObfuscatedName("client.qj")
    public static class349 field714;

    @ObfuscatedName("client.qb")
    public static class441 field643;

    @ObfuscatedName("client.qe")
    public static int field716;

    @ObfuscatedName("client.qk")
    public static int field740;

    @ObfuscatedName("client.qr")
    public static boolean[] field718;

    @ObfuscatedName("client.qg")
    public static boolean[] field719;

    @ObfuscatedName("client.qm")
    public static boolean[] field658;

    @ObfuscatedName("client.qs")
    public static int[] field721;

    @ObfuscatedName("client.qc")
    public static int[] field722;

    @ObfuscatedName("client.re")
    public static int[] field568;

    @ObfuscatedName("client.rv")
    public static int[] field516;

    @ObfuscatedName("client.rr")
    public static int field725;

    @ObfuscatedName("client.rj")
    public static long field588;

    @ObfuscatedName("client.rq")
    public static boolean field727;

    @ObfuscatedName("client.ro")
    public static int[] field728;

    @ObfuscatedName("client.rc")
    public static int field729;

    @ObfuscatedName("client.ru")
    public static int field730;

    @ObfuscatedName("client.rl")
    public static String field731;

    @ObfuscatedName("client.rg")
    public static long[] field776;

    @ObfuscatedName("client.rt")
    public static int field733;

    @ObfuscatedName("client.rp")
    public static class200 field734;

    @ObfuscatedName("client.rx")
    public static class198 field735;

    @ObfuscatedName("client.rf")
    public static int field680;

    @ObfuscatedName("client.ra")
    public static int[] field614;

    @ObfuscatedName("client.rh")
    public static int[] field738;

    @ObfuscatedName("client.rs")
    public static long field739;

    @ObfuscatedName("client.sh")
    public static class147[] field596;

    @ObfuscatedName("client.sn")
    public static class156[] field741;

    @ObfuscatedName("client.sf")
    public static int field520;

    @ObfuscatedName("client.sp")
    public static int field743;

    @ObfuscatedName("client.ss")
    public static int[] field692;

    @ObfuscatedName("client.sy")
    public static int[] field745;

    @ObfuscatedName("client.su")
    public static class477[] field676;

    @ObfuscatedName("client.sj")
    public static int field747;

    @ObfuscatedName("client.sz")
    public static int field748;

    @ObfuscatedName("client.sw")
    public static int field567;

    @ObfuscatedName("client.sk")
    public static int field606;

    @ObfuscatedName("client.sr")
    public static boolean field639;

    @ObfuscatedName("client.tv")
    public static int field752;

    @ObfuscatedName("client.tn")
    public static int[] field753;

    @ObfuscatedName("client.tz")
    public static int[] field754;

    @ObfuscatedName("client.tr")
    public static int[] field755;

    @ObfuscatedName("client.th")
    public static int[] field592;

    @ObfuscatedName("client.tp")
    public static class41[] field757;

    @ObfuscatedName("client.tt")
    public static boolean field758;

    @ObfuscatedName("client.ta")
    public static boolean field759;

    @ObfuscatedName("client.uw")
    public static boolean[] field557;

    @ObfuscatedName("client.us")
    public static int[] field761;

    @ObfuscatedName("client.ug")
    public static int[] field666;

    @ObfuscatedName("client.uo")
    public static int[] field763;

    @ObfuscatedName("client.up")
    public static int[] field764;

    @ObfuscatedName("client.uk")
    public static short field765;

    @ObfuscatedName("client.ul")
    public static short field650;

    @ObfuscatedName("client.ud")
    public static short field767;

    @ObfuscatedName("client.ui")
    public static short field659;

    @ObfuscatedName("client.uv")
    public static short field602;

    @ObfuscatedName("client.un")
    public static short field770;

    @ObfuscatedName("client.ua")
    public static short field563;

    @ObfuscatedName("client.uj")
    public static short field772;

    @ObfuscatedName("client.ur")
    public static int field773;

    @ObfuscatedName("client.ut")
    public static int field492;

    @ObfuscatedName("client.uz")
    public static int field775;

    @ObfuscatedName("client.um")
    public static int field536;

    @ObfuscatedName("client.ux")
    public static int field777;

    @ObfuscatedName("client.uc")
    public static class300 field778;

    @ObfuscatedName("client.uq")
    public static int field540;

    @ObfuscatedName("client.uh")
    public static int field544;

    @ObfuscatedName("client.uu")
    public static class433 field665;

    @ObfuscatedName("client.vb")
    public static class339[] field782;

    @ObfuscatedName("client.ve")
    public static class64 field783;

    @ObfuscatedName("client.vv")
    public static class266 field784;

    @ObfuscatedName("client.vj")
    public static class266 field785;

    @ObfuscatedName("client.vs")
    public static int field786;

    @ObfuscatedName("client.vf")
    public static int field794;

    @ObfuscatedName("client.vr")
    public static ArrayList field788;

    @ObfuscatedName("client.vh")
    public static int field768;

    @ObfuscatedName("client.vt")
    public static int field589;

    @ObfuscatedName("client.wm")
    public static final class63 field791;

    @ObfuscatedName("client.wq")
    public static int[] field694;

    @ObfuscatedName("client.wx")
    public static int[] field793;

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
            var6.append(class357.field4299[var8 >>> 2]);
            if (var7 < var5 - 1) {
                int var9 = var4[var7 + 1] & 0xFF;
                var6.append(class357.field4299[(var8 & 0x3) << 4 | var9 >>> 4]);
                if (var7 < var5 - 2) {
                    int var10 = var4[var7 + 2] & 0xFF;
                    var6.append(class357.field4299[(var9 & 0xF) << 2 | var10 >>> 6]).append(class357.field4299[var10 & 0x3F]);
                } else {
                    var6.append(class357.field4299[(var9 & 0xF) << 2]).append("=");
                }
            } else {
                var6.append(class357.field4299[(var8 & 0x3) << 4]).append("==");
            }
        }
        String var11 = var6.toString();
        field653 = var11;
        field749 = false;
        field543 = new class75();
        field547 = null;
        field760 = new class96[65536];
        field549 = 0;
        field550 = new int[65536];
        field551 = 0;
        field552 = new int[250];
        field636 = new class107();
        field554 = 0;
        field555 = false;
        field556 = new class375();
        field792 = new HashMap();
        field558 = 0;
        field489 = 1;
        field560 = 0;
        field561 = 1;
        field583 = 0;
        field742 = new class201[4];
        field564 = false;
        field565 = new int[4][13][13];
        field566 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field559 = 0;
        field715 = 2301979;
        field569 = 5063219;
        field570 = 3353893;
        field571 = 7759444;
        field572 = false;
        field573 = 0;
        field619 = 128;
        field530 = 0;
        field576 = 0;
        field577 = 0;
        field578 = 0;
        field744 = 0;
        field580 = 0;
        field581 = 50;
        field582 = 0;
        field534 = 0;
        field584 = 0;
        field585 = 12;
        field625 = 6;
        field587 = 0;
        field501 = false;
        field780 = 0;
        field590 = false;
        field591 = 0;
        field519 = 0;
        field593 = 50;
        field594 = new int[field593];
        field766 = new int[field593];
        field579 = new int[field593];
        field517 = new int[field593];
        field598 = new int[field593];
        field599 = new int[field593];
        field507 = new int[field593];
        field601 = new String[field593];
        field713 = new int[104][104];
        field603 = 0;
        field667 = -1;
        field605 = -1;
        field515 = 0;
        field607 = 0;
        field762 = 0;
        field609 = 0;
        field610 = true;
        field698 = 0;
        field746 = 0;
        field595 = 0;
        field496 = 0;
        field615 = 0;
        field750 = 0;
        field617 = false;
        field644 = 0;
        field688 = 0;
        field620 = true;
        field621 = new class89[2048];
        field622 = -1;
        field779 = 0;
        field490 = -1L;
        field597 = true;
        field626 = 0;
        field627 = 0;
        field628 = new int[1000];
        field629 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field630 = new String[8];
        field613 = new boolean[8];
        field632 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field633 = -1;
        field723 = new class349[4][104][104];
        field635 = new class349();
        field711 = new class349();
        field637 = new class349();
        field638 = new int[25];
        field675 = new int[25];
        field640 = new int[25];
        field720 = false;
        field642 = false;
        field553 = 0;
        field709 = new int[500];
        field645 = new int[500];
        field646 = new int[500];
        field647 = new int[500];
        field648 = new int[500];
        field649 = new String[500];
        field781 = new String[500];
        field774 = new boolean[500];
        field652 = false;
        field506 = false;
        field654 = false;
        field655 = true;
        field656 = -1;
        field657 = -1;
        field528 = 0;
        field787 = 50;
        field660 = 0;
        field661 = null;
        field662 = false;
        field663 = -1;
        field664 = -1;
        field511 = null;
        field612 = null;
        field751 = -1;
        field668 = new class441(8);
        field669 = 0;
        field756 = -1;
        field611 = 0;
        field672 = 0;
        field499 = null;
        field674 = 0;
        field717 = 0;
        field608 = 0;
        field677 = -1;
        field678 = false;
        field679 = null;
        field732 = null;
        field681 = null;
        field682 = 0;
        field683 = 0;
        field684 = null;
        field685 = false;
        field604 = -1;
        field687 = -1;
        field641 = false;
        field689 = -1;
        field690 = -1;
        field691 = false;
        field736 = 1;
        field789 = new int[32];
        field548 = 0;
        field695 = new int[32];
        field696 = 0;
        field697 = new int[32];
        field600 = 0;
        field699 = new int[32];
        field700 = 0;
        field701 = 0;
        field702 = 0;
        field703 = 0;
        field704 = 0;
        field705 = 0;
        field706 = 0;
        field707 = 0;
        field500 = 0;
        field497 = 0;
        field710 = new class481();
        field623 = new class349();
        field712 = new class349();
        field671 = new class349();
        field714 = new class349();
        field643 = new class441(512);
        field716 = 0;
        field740 = -2;
        field718 = new boolean[100];
        field719 = new boolean[100];
        field658 = new boolean[100];
        field721 = new int[100];
        field722 = new int[100];
        field568 = new int[100];
        field516 = new int[100];
        field725 = 0;
        field588 = 0L;
        field727 = true;
        field728 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field729 = 0;
        field730 = 0;
        field731 = "";
        field776 = new long[100];
        field733 = 0;
        field734 = new class200();
        field735 = new class198();
        field680 = 0;
        field614 = new int[128];
        field738 = new int[128];
        field739 = -1L;
        field596 = new class147[4];
        field741 = new class156[4];
        field520 = -1;
        field743 = 0;
        field692 = new int[1000];
        field745 = new int[1000];
        field676 = new class477[1000];
        field747 = 0;
        field748 = 0;
        field567 = 0;
        field606 = -1;
        field639 = false;
        field752 = 0;
        field753 = new int[50];
        field754 = new int[50];
        field755 = new int[50];
        field592 = new int[50];
        field757 = new class41[50];
        field758 = false;
        field759 = false;
        field557 = new boolean[5];
        field761 = new int[5];
        field666 = new int[5];
        field763 = new int[5];
        field764 = new int[5];
        field765 = 256;
        field650 = 205;
        field767 = 256;
        field659 = 320;
        field602 = 1;
        field770 = 32767;
        field563 = 1;
        field772 = 32767;
        field773 = 0;
        field492 = 0;
        field775 = 0;
        field536 = 0;
        field777 = 0;
        field778 = new class300();
        field540 = -1;
        field544 = -1;
        field665 = new class431();
        field782 = new class339[8];
        field783 = new class64();
        field784 = new class266(64);
        field785 = new class266(64);
        field786 = -1;
        field794 = -1;
        field788 = new ArrayList(10);
        field768 = 0;
        field589 = 0;
        field791 = new class63();
        field694 = new int[50];
        field793 = new int[50];
    }

    @ObfuscatedName("mc.fx(B)Lpd;")
    public static class435 method5958() {
        return Statics.field31;
    }

    @ObfuscatedName("client.at(I)V")
    public final void method512() {
    }

    public final void init() {
        if (!this.method606()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class97.field1280)) {
                            field493 = true;
                        } else {
                            field493 = false;
                        }
                        break;
                    case 4:
                        if (field562 == -1) {
                            field562 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field491 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field1347 = class345.method6002(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field2968 = class318.method4377(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class97.field1280)) {
                        }
                        break;
                    case 9:
                        Statics.field975 = var2;
                        break;
                    case 10:
                        Statics.field4412 = (class319) class344.method4292(class319.method2041(), Integer.parseInt(var2));
                        if (Statics.field4412 == class319.field3741) {
                            Statics.field2682 = class444.field4787;
                        } else {
                            Statics.field2682 = class444.field4789;
                        }
                        break;
                    case 11:
                        Statics.field1483 = var2;
                        break;
                    case 12:
                        field726 = Integer.parseInt(var2);
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
                        Statics.field127 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field769 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1535 = var2;
                        break;
                    case 21:
                        field495 = Integer.parseInt(var2);
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            field790 = Integer.parseInt(var2);
                        } else {
                            field790 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        method7426();
        Statics.field3121 = this.getCodeBase().getHost();
        String var4 = Statics.field2968.field3734;
        byte var5 = 0;
        try {
            Statics.field1794 = 22;
            Statics.field1803 = var5;
            try {
                Statics.field253 = System.getProperty("os.name");
            } catch (Exception var25) {
                Statics.field253 = "Unknown";
            }
            Statics.field91 = Statics.field253.toLowerCase();
            try {
                Statics.field257 = System.getProperty("user.home");
                if (Statics.field257 != null) {
                    Statics.field257 = Statics.field257 + "/";
                }
            } catch (Exception var24) {
            }
            try {
                if (Statics.field91.startsWith("win")) {
                    if (Statics.field257 == null) {
                        Statics.field257 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field257 == null) {
                    Statics.field257 = System.getenv("HOME");
                }
                if (Statics.field257 != null) {
                    Statics.field257 = Statics.field257 + "/";
                }
            } catch (Exception var23) {
            }
            if (Statics.field257 == null) {
                Statics.field257 = "~/";
            }
            Statics.field4222 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field257, "/tmp/", "" };
            Statics.field2941 = new String[] { ".jagex_cache_" + Statics.field1803, ".file_store_" + Statics.field1803 };
            label170: for (int var9 = 0; var9 < 4; var9++) {
                Statics.field3639 = class165.method47("oldschool", var4, var9);
                if (!Statics.field3639.exists()) {
                    Statics.field3639.mkdirs();
                }
                File[] var10 = Statics.field3639.listFiles();
                if (var10 == null) {
                    break;
                }
                File[] var11 = var10;
                int var12 = 0;
                while (true) {
                    if (var12 >= var11.length) {
                        break label170;
                    }
                    File var13 = var11[var12];
                    if (!class165.method459(var13, false)) {
                        break;
                    }
                    var12++;
                }
            }
            class167.method2792(Statics.field3639);
            try {
                File var14 = new File(Statics.field257, "random.dat");
                if (var14.exists()) {
                    class165.field1790 = new class447(new class446(var14, "rw", 25L), 24, 0);
                } else {
                    label150: for (int var15 = 0; var15 < Statics.field2941.length; var15++) {
                        for (int var16 = 0; var16 < Statics.field4222.length; var16++) {
                            File var17 = new File(Statics.field4222[var16] + Statics.field2941[var15] + File.separatorChar + "random.dat");
                            if (var17.exists()) {
                                class165.field1790 = new class447(new class446(var17, "rw", 25L), 24, 0);
                                break label150;
                            }
                        }
                    }
                }
                if (class165.field1790 == null) {
                    RandomAccessFile var18 = new RandomAccessFile(var14, "rw");
                    int var19 = var18.read();
                    var18.seek(0L);
                    var18.write(var19);
                    var18.seek(0L);
                    var18.close();
                    class165.field1790 = new class447(new class446(var14, "rw", 25L), 24, 0);
                }
            } catch (IOException var26) {
            }
            class165.field1795 = new class447(new class446(class167.method2770("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class165.field1801 = new class447(new class446(class167.method2770("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1802 = new class447[Statics.field1794];
            for (int var21 = 0; var21 < Statics.field1794; var21++) {
                Statics.field1802[var21] = new class447(new class446(class167.method2770("main_file_cache.idx" + var21), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var27) {
            class489.method7161((String) null, var27);
        }
        Statics.field1599 = this;
        Statics.field4871 = field562;
        if (field574 == -1) {
            field574 = 0;
        }
        Statics.field3419 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field3387 = System.getenv("JX_REFRESH_TOKEN");
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field693 = true;
        }
        this.method516(765, 503, 209, 1);
    }

    @ObfuscatedName("pz.fc(B)V")
    public static final void method7426() {
        class214.field2518 = false;
        field494 = false;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field673 = arg0;
            class73.method1112(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field538 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field624 == 10;
    }

    public long getAccountHash() {
        return this.field546;
    }

    @ObfuscatedName("client.ft(B)Z")
    public boolean method1124() {
        return Statics.field3419 != null && !Statics.field3419.trim().isEmpty() && Statics.field3387 != null && !Statics.field3387.trim().isEmpty();
    }

    @ObfuscatedName("client.fp(I)Z")
    public boolean method1288() {
        return this.field673 != null;
    }

    @ObfuscatedName("client.fg(Ljava/lang/String;I)V")
    public void method1126(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field1483 + "shield/oauth/token" + (new class421(var2)).method7149());
        HashMap var4 = new HashMap();
        var4.put("Authorization", "Basic " + field653);
        var4.put("Host", (new URL(Statics.field1483)).getHost());
        var4.put("Accept", class418.field4603.method7133());
        class10 var5 = class10.field43;
        RefreshAccessTokenRequester var6 = this.field538;
        if (var6 != null) {
            this.field539 = var6.request(var5.method65(), var3, var4, "");
            return;
        }
        class11 var7 = new class11(var3, var5, this.field693);
        Iterator var8 = var4.entrySet().iterator();
        while (var8.hasNext()) {
            Entry var9 = (Entry) var8.next();
            var7.method74((String) var9.getKey(), (String) var9.getValue());
        }
        this.field537 = this.field532.method169(var7);
    }

    @ObfuscatedName("client.fk(Ljava/lang/String;I)V")
    public void method1127(String arg0) throws MalformedURLException, IOException {
        URL var2 = new URL(Statics.field1483 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        HashMap var3 = new HashMap();
        var3.put("Authorization", "Bearer " + arg0);
        class10 var4 = class10.field40;
        OtlTokenRequester var5 = this.field673;
        if (var5 != null) {
            this.field535 = var5.request(var4.method65(), var2, var3, "");
            return;
        }
        class11 var6 = new class11(var2, var4, this.field693);
        Iterator var7 = var3.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            var6.method74((String) var8.getKey(), (String) var8.getValue());
        }
        this.field533 = this.field532.method169(var6);
    }

    @ObfuscatedName("client.af(I)V")
    public final void method526() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field2711 = null;
            Statics.field2847 = null;
            Statics.field4301 = (byte[][][]) null;
            class373.method5688();
        } else {
            Statics.field2711 = var1;
            Statics.field2847 = new int[var1.length];
            Statics.field4301 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field2711.length; var3++) {
                Statics.field4301[var3] = new byte[var2[var3]][];
                class373.field4394.add(var1[var3]);
            }
            Collections.sort(class373.field4394);
        }
        Statics.field1759 = field769 == 0 ? 43594 : field726 + 40000;
        Statics.field1566 = field769 == 0 ? 443 : field726 + 50000;
        Statics.field4838 = Statics.field1759;
        Statics.field1781 = class302.field3464;
        Statics.field194 = class302.field3466;
        Statics.field115 = class302.field3463;
        Statics.field1017 = class302.field3465;
        Statics.field318 = new class109(this.field693, 209);
        this.method632();
        this.method509();
        Statics.field50 = this.method502();
        this.method508(field735, 0);
        this.method508(field734, 1);
        Statics.field2741 = new class401(255, class165.field1795, class165.field1801, 500000);
        class446 var4 = null;
        class94 var5 = new class94();
        try {
            var4 = class165.method2975("", Statics.field4412.field3742, false);
            byte[] var6 = new byte[(int) var4.method7501()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method7497(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class94(new class464(var6));
        } catch (Exception var13) {
        }
        try {
            if (var4 != null) {
                var4.method7502();
            }
        } catch (Exception var12) {
        }
        Statics.field4526 = var5;
        this.method503();
        class33.method2242(this, Statics.field1295);
        method3081(Statics.field4526.method2302());
        Statics.field2726 = new class66(Statics.field2682);
        this.field532 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.ad(I)V")
    public final void method527() {
        field503++;
        this.method1337();
        class327.method4598();
        class284.method3170();
        method6200();
        field734.method3624();
        this.method598();
        class37.method4669();
        if (Statics.field50 != null) {
            int var1 = Statics.field50.method305();
            field497 = var1;
        }
        if (field624 == 0) {
            method435();
            class36.method6188();
        } else if (field624 == 5) {
            class73.method7427(this, Statics.field4239);
            method435();
            class36.method6188();
        } else if (field624 == 10 || field624 == 11) {
            class73.method7427(this, Statics.field4239);
        } else if (field624 == 20) {
            class73.method7427(this, Statics.field4239);
            this.method1132();
        } else if (field624 == 50) {
            class73.method7427(this, Statics.field4239);
            this.method1132();
        } else if (field624 == 25) {
            method709();
        }
        if (field624 == 30) {
            this.method1133();
        } else if (field624 == 40 || field624 == 45) {
            this.method1132();
        }
    }

    @ObfuscatedName("client.av(ZI)V")
    public final void method525(boolean arg0) {
        boolean var2;
        label143: {
            try {
                if (class284.field3294 == 2) {
                    if (Statics.field1559 == null) {
                        Statics.field1559 = class289.method5117(Statics.field124, Statics.field3295, Statics.field3296);
                        if (Statics.field1559 == null) {
                            var2 = false;
                            break label143;
                        }
                    }
                    if (Statics.field4379 == null) {
                        Statics.field4379 = new class47(Statics.field3292, Statics.field3291);
                    }
                    if (Statics.field3293.method4937(Statics.field1559, Statics.field3298, Statics.field4379, 22050)) {
                        Statics.field3293.method4941();
                        Statics.field3293.method4935(Statics.field1364);
                        Statics.field3293.method4940(Statics.field1559, Statics.field4191);
                        class284.field3294 = 0;
                        Statics.field1559 = null;
                        Statics.field4379 = null;
                        Statics.field124 = null;
                        var2 = true;
                        break label143;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field3293.method5029();
                class284.field3294 = 0;
                Statics.field1559 = null;
                Statics.field4379 = null;
                Statics.field124 = null;
            }
            var2 = false;
        }
        if (var2 && field639 && Statics.field1264 != null) {
            Statics.field1264.method784();
        }
        if ((field624 == 10 || field624 == 20 || field624 == 30) && field588 != 0L && class280.method2629() > field588) {
            method3081(method163());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field718[var5] = true;
            }
        }
        if (field624 == 0) {
            this.method536(class73.field902, class73.field903, arg0);
        } else if (field624 == 5) {
            class73.method2599(Statics.field1422, Statics.field4271, Statics.field4239);
        } else if (field624 == 10 || field624 == 11) {
            class73.method2599(Statics.field1422, Statics.field4271, Statics.field4239);
        } else if (field624 == 20) {
            class73.method2599(Statics.field1422, Statics.field4271, Statics.field4239);
        } else if (field624 == 50) {
            class73.method2599(Statics.field1422, Statics.field4271, Statics.field4239);
        } else if (field624 == 25) {
            if (field583 == 1) {
                if (field558 > field489) {
                    field489 = field558;
                }
                int var6 = (field489 * 50 - field558 * 50) / field489;
                method2870(class323.field3777 + class97.field1279 + class97.field1277 + var6 + "%" + class97.field1271, false);
            } else if (field583 == 2) {
                if (field560 > field561) {
                    field561 = field560;
                }
                int var7 = (field561 * 50 - field560 * 50) / field561 + 50;
                method2870(class323.field3777 + class97.field1279 + class97.field1277 + var7 + "%" + class97.field1271, false);
            } else {
                method2870(class323.field3777, false);
            }
        } else if (field624 == 30) {
            this.method1135();
        } else if (field624 == 40) {
            method2870(class323.field3778 + class97.field1279 + class323.field3825, false);
        } else if (field624 == 45) {
            method2870(class323.field3937, false);
        }
        if (field624 == 30 && field725 == 0 && !arg0 && !field727) {
            for (int var8 = 0; var8 < field716; var8++) {
                if (field719[var8]) {
                    Statics.field3.method477(field721[var8], field722[var8], field568[var8], field516[var8]);
                    field719[var8] = false;
                }
            }
        } else if (field624 > 0) {
            Statics.field3.method476(0, 0);
            for (int var9 = 0; var9 < field716; var9++) {
                field719[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ak(S)V")
    public final void method514() {
        if (Statics.field957.method2488()) {
            Statics.field957.method2484();
        }
        if (Statics.field483 != null) {
            Statics.field483.field1057 = false;
        }
        Statics.field483 = null;
        field636.method2542();
        class37.method1938();
        Statics.field50 = null;
        if (Statics.field1264 != null) {
            Statics.field1264.method785();
        }
        if (Statics.field1077 != null) {
            Statics.field1077.method785();
        }
        class331.method5689();
        class327.method3366();
        if (Statics.field318 != null) {
            Statics.field318.method2579();
            Statics.field318 = null;
        }
        Statics.method1762();
        this.field532.method168();
    }

    @ObfuscatedName("i.fn(II)V")
    public static void method300(int arg0) {
        if (field624 == arg0) {
            return;
        }
        if (field624 == 30) {
            field735.method3611();
        }
        if (field624 == 0) {
            Statics.field1599.method531();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method708(0);
            field526 = 0;
            field527 = 0;
            field556.method6595(arg0);
            if (arg0 != 20) {
                method848(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2529 != null) {
            Statics.field2529.method6853();
            Statics.field2529 = null;
        }
        if (field624 == 25) {
            field583 = 0;
            field558 = 0;
            field489 = 1;
            field560 = 0;
            field561 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field4526.method2373() >= field495;
            int var3 = var2 ? 0 : 12;
            class73.method6826(Statics.field2799, Statics.field1644, true, var3);
        } else if (arg0 == 20) {
            int var1 = field624 == 11 ? 4 : 0;
            class73.method6826(Statics.field2799, Statics.field1644, false, var1);
        } else if (arg0 == 11) {
            class73.method6826(Statics.field2799, Statics.field1644, false, 4);
        } else if (arg0 == 50) {
            class73.method4925("", "Updating date of birth...", "");
            class73.method6826(Statics.field2799, Statics.field1644, false, 7);
        } else {
            class73.method5711();
        }
        field624 = arg0;
    }

    @ObfuscatedName("client.fh(B)V")
    public void method1337() {
        if (field624 == 1000) {
            return;
        }
        long var1 = class280.method2629();
        int var3 = (int) (var1 - Statics.field3654);
        Statics.field3654 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class331.field4184 += var3;
        boolean var4;
        if (class331.field4166 == 0 && class331.field4169 == 0 && class331.field4177 == 0 && class331.field4167 == 0) {
            var4 = true;
        } else if (Statics.field4176 == null) {
            var4 = false;
        } else {
            try {
                label216: {
                    if (class331.field4184 > 30000) {
                        throw new IOException();
                    }
                    while (class331.field4169 < 200 && class331.field4167 > 0) {
                        class329 var5 = (class329) class331.field4183.method7478();
                        class464 var6 = new class464(4);
                        var6.method7698(1);
                        var6.method7700((int) var5.field4635);
                        Statics.field4176.method6852(var6.field4867, 0, 4);
                        class331.field4168.method7468(var5, var5.field4635);
                        class331.field4167--;
                        class331.field4169++;
                    }
                    while (class331.field4166 < 200 && class331.field4177 > 0) {
                        class329 var7 = (class329) class331.field4170.method6018();
                        class464 var8 = new class464(4);
                        var8.method7698(0);
                        var8.method7700((int) var7.field4635);
                        Statics.field4176.method6852(var8.field4867, 0, 4);
                        var7.method7169();
                        class331.field4173.method7468(var7, var7.field4635);
                        class331.field4177--;
                        class331.field4166++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field4176.method6849();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class331.field4184 = 0;
                        byte var11 = 0;
                        if (Statics.field1438 == null) {
                            var11 = 8;
                        } else if (class331.field4179 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class331.field4165.field4864;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field4176.method6861(class331.field4165.field4867, class331.field4165.field4864, var12);
                            if (class331.field4181 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class331.field4165.field4867[class331.field4165.field4864 + var13] ^= class331.field4181;
                                }
                            }
                            class331.field4165.field4864 += var12;
                            if (class331.field4165.field4864 < var11) {
                                break;
                            }
                            if (Statics.field1438 == null) {
                                class331.field4165.field4864 = 0;
                                int var14 = class331.field4165.method7735();
                                int var15 = class331.field4165.method7716();
                                int var16 = class331.field4165.method7735();
                                int var17 = class331.field4165.method7720();
                                long var18 = (long) ((var14 << 16) + var15);
                                class329 var20 = (class329) class331.field4168.method7466(var18);
                                Statics.field1426 = true;
                                if (var20 == null) {
                                    var20 = (class329) class331.field4173.method7466(var18);
                                    Statics.field1426 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1438 = var20;
                                Statics.field4611 = new class464(var17 + var21 + Statics.field1438.field4146);
                                Statics.field4611.method7698(var16);
                                Statics.field4611.method7835(var17);
                                class331.field4179 = 8;
                                class331.field4165.field4864 = 0;
                            } else if (class331.field4179 == 0) {
                                if (class331.field4165.field4867[0] == -1) {
                                    class331.field4179 = 1;
                                    class331.field4165.field4864 = 0;
                                } else {
                                    Statics.field1438 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field4611.field4867.length - Statics.field1438.field4146;
                            int var23 = 512 - class331.field4179;
                            if (var23 > var22 - Statics.field4611.field4864) {
                                var23 = var22 - Statics.field4611.field4864;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field4176.method6861(Statics.field4611.field4867, Statics.field4611.field4864, var23);
                            if (class331.field4181 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field4611.field4867[Statics.field4611.field4864 + var24] ^= class331.field4181;
                                }
                            }
                            Statics.field4611.field4864 += var23;
                            class331.field4179 += var23;
                            if (Statics.field4611.field4864 == var22) {
                                if (Statics.field1438.field4635 == 16711935L) {
                                    Statics.field1362 = Statics.field4611;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class328 var26 = class331.field4178[var25];
                                        if (var26 != null) {
                                            Statics.field1362.field4864 = var25 * 8 + 5;
                                            if (Statics.field1362.field4864 >= Statics.field1362.field4867.length) {
                                                if (!var26.field4141) {
                                                    throw new RuntimeException("");
                                                }
                                                var26.method5743();
                                            } else {
                                                int var27 = Statics.field1362.method7720();
                                                int var28 = Statics.field1362.method7720();
                                                var26.method5765(var27, var28);
                                            }
                                        }
                                    }
                                } else {
                                    class331.field4174.reset();
                                    class331.field4174.update(Statics.field4611.field4867, 0, var22);
                                    int var29 = (int) class331.field4174.getValue();
                                    if (Statics.field1438.field4143 != var29) {
                                        try {
                                            Statics.field4176.method6853();
                                        } catch (Exception var35) {
                                        }
                                        class331.field4182++;
                                        Statics.field4176 = null;
                                        class331.field4181 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label216;
                                    }
                                    class331.field4182 = 0;
                                    class331.field4164 = 0;
                                    Statics.field1438.field4144.method5737((int) (Statics.field1438.field4635 & 0xFFFFL), Statics.field4611.field4867, (Statics.field1438.field4635 & 0xFF0000L) == 16711680L, Statics.field1426);
                                }
                                Statics.field1438.method7170();
                                if (Statics.field1426) {
                                    class331.field4169--;
                                } else {
                                    class331.field4166--;
                                }
                                class331.field4179 = 0;
                                Statics.field1438 = null;
                                Statics.field4611 = null;
                            } else {
                                if (class331.field4179 != 512) {
                                    break;
                                }
                                class331.field4179 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field4176.method6853();
                } catch (Exception var34) {
                }
                class331.field4164++;
                Statics.field4176 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1283();
        }
    }

    @ObfuscatedName("client.fi(S)V")
    public void method1283() {
        if (class331.field4182 >= 4) {
            this.method532("js5crc");
            method300(1000);
            return;
        }
        if (class331.field4164 >= 4) {
            if (field624 <= 5) {
                this.method532("js5io");
                method300(1000);
                return;
            }
            field522 = 3000;
            class331.field4164 = 3;
        }
        if (--field522 + 1 > 0) {
            return;
        }
        try {
            if (field521 == 0) {
                Statics.field4218 = Statics.field199.method3056(Statics.field3121, Statics.field4838);
                field521++;
            }
            if (field521 == 1) {
                if (Statics.field4218.field1842 == 2) {
                    this.method1312(-1);
                    return;
                }
                if (Statics.field4218.field1842 == 1) {
                    field521++;
                }
            }
            if (field521 == 2) {
                Socket var1 = (Socket) Statics.field4218.field1840;
                class398 var2 = new class398(var1, 40000, 5000);
                Statics.field3409 = var2;
                class464 var3 = new class464(5);
                var3.method7698(15);
                var3.method7835(209);
                Statics.field3409.method6852(var3.field4867, 0, 5);
                field521++;
                Statics.field2531 = class280.method2629();
            }
            if (field521 == 3) {
                if (Statics.field3409.method6849() > 0) {
                    int var4 = Statics.field3409.method6850();
                    if (var4 != 0) {
                        this.method1312(var4);
                        return;
                    }
                    field521++;
                } else if (class280.method2629() - Statics.field2531 > 30000L) {
                    this.method1312(-2);
                    return;
                }
            }
            if (field521 == 4) {
                class397 var5 = Statics.field3409;
                boolean var6 = field624 > 20;
                if (Statics.field4176 != null) {
                    try {
                        Statics.field4176.method6853();
                    } catch (Exception var16) {
                    }
                    Statics.field4176 = null;
                }
                Statics.field4176 = var5;
                class331.method692(var6);
                class331.field4165.field4864 = 0;
                Statics.field1438 = null;
                Statics.field4611 = null;
                class331.field4179 = 0;
                while (true) {
                    class329 var8 = (class329) class331.field4168.method7478();
                    if (var8 == null) {
                        while (true) {
                            class329 var9 = (class329) class331.field4173.method7478();
                            if (var9 == null) {
                                if (class331.field4181 != 0) {
                                    try {
                                        class464 var10 = new class464(4);
                                        var10.method7698(4);
                                        var10.method7698(class331.field4181);
                                        var10.method7775(0);
                                        Statics.field4176.method6852(var10.field4867, 0, 4);
                                    } catch (IOException var15) {
                                        try {
                                            Statics.field4176.method6853();
                                        } catch (Exception var14) {
                                        }
                                        class331.field4164++;
                                        Statics.field4176 = null;
                                    }
                                }
                                class331.field4184 = 0;
                                Statics.field3654 = class280.method2629();
                                Statics.field4218 = null;
                                Statics.field3409 = null;
                                field521 = 0;
                                field524 = 0;
                                return;
                            }
                            class331.field4170.method6024(var9);
                            class331.field4171.method7468(var9, var9.field4635);
                            class331.field4177++;
                            class331.field4166--;
                        }
                    }
                    class331.field4183.method7468(var8, var8.field4635);
                    class331.field4167++;
                    class331.field4169--;
                }
            }
        } catch (IOException var17) {
            this.method1312(-3);
        }
    }

    @ObfuscatedName("client.fo(II)V")
    public void method1312(int arg0) {
        Statics.field4218 = null;
        Statics.field3409 = null;
        field521 = 0;
        if (Statics.field4838 == Statics.field1759) {
            Statics.field4838 = Statics.field1566;
        } else {
            Statics.field4838 = Statics.field1759;
        }
        field524++;
        if (field524 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field624 <= 5) {
                this.method532("js5connect_full");
                method300(1000);
            } else {
                field522 = 3000;
            }
        } else if (field524 >= 2 && arg0 == 6) {
            this.method532("js5connect_outofdate");
            method300(1000);
        } else if (field524 >= 4) {
            if (field624 <= 5) {
                this.method532("js5connect");
                method300(1000);
            } else {
                field522 = 3000;
            }
        }
    }

    @ObfuscatedName("iv.fa(Llx;Ljava/lang/String;B)V")
    public static void method4724(class328 arg0, String arg1) {
        class81 var2 = new class81(arg0, arg1);
        field788.add(var2);
        field589 += var2.field1014;
    }

    @ObfuscatedName("ab.fy(B)I")
    public static int method804() {
        if (field788 == null || field768 >= field788.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field768; var1++) {
            var0 += ((class81) field788.get(var1)).field1013;
        }
        return var0 * 10000 / field589;
    }

    @ObfuscatedName("ge.ff(II)I")
    public static int method3351(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("lx.fs(III)V")
    public static void method5744(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method3351(var4);
            int var6 = class211.field2437[var4];
            int var7 = arg1 - 334;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 100) {
                var7 = 100;
            }
            int var8 = (field659 - field767) * var7 / 100 + field767;
            int var9 = var5 * var8 / 256;
            var2[var3] = var6 * var9 >> 16;
        }
        class214.method3959(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ah.fw(I)V")
    public static void method435() {
        if (field651 == 0) {
            Statics.field1615 = new class214(4, 104, 104, class79.field998);
            for (int var0 = 0; var0 < 4; var0++) {
                field742[var0] = new class201(104, 104);
            }
            Statics.field3651 = new class477(512, 512);
            class73.field903 = class323.field3780;
            class73.field902 = 5;
            field651 = 20;
        } else if (field651 == 20) {
            class73.field903 = class323.field3994;
            class73.field902 = 10;
            field651 = 30;
        } else if (field651 == 30) {
            Statics.field1705 = method5140(0, false, true, true, false);
            Statics.field252 = method5140(1, false, true, true, false);
            Statics.field1743 = method5140(2, true, false, true, false);
            Statics.field4116 = method5140(3, false, true, true, false);
            Statics.field130 = method5140(4, false, true, true, false);
            Statics.field958 = method5140(5, true, true, true, false);
            Statics.field272 = method5140(6, true, true, true, false);
            Statics.field2874 = method5140(7, false, true, true, false);
            Statics.field1644 = method5140(8, false, true, true, false);
            Statics.field523 = method5140(9, false, true, true, false);
            Statics.field2799 = method5140(10, false, true, true, false);
            Statics.field33 = method5140(11, false, true, true, false);
            Statics.field2035 = method5140(12, false, true, true, false);
            Statics.field1651 = method5140(13, true, false, true, false);
            Statics.field990 = method5140(14, false, true, true, false);
            Statics.field1733 = method5140(15, false, true, true, false);
            Statics.field4450 = method5140(17, true, true, true, false);
            Statics.field4172 = method5140(18, false, true, true, false);
            Statics.field3671 = method5140(19, false, true, true, false);
            Statics.field1620 = method5140(20, false, true, true, false);
            Statics.field2931 = method5140(21, false, true, true, true);
            class73.field903 = class323.field3782;
            class73.field902 = 20;
            field651 = 40;
        } else if (field651 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1705.method5732() * 4 / 100;
            int var3 = var2 + Statics.field252.method5732() * 4 / 100;
            int var4 = var3 + Statics.field1743.method5732() * 2 / 100;
            int var5 = var4 + Statics.field4116.method5732() * 2 / 100;
            int var6 = var5 + Statics.field130.method5732() * 6 / 100;
            int var7 = var6 + Statics.field958.method5732() * 4 / 100;
            int var8 = var7 + Statics.field272.method5732() * 2 / 100;
            int var9 = var8 + Statics.field2874.method5732() * 55 / 100;
            int var10 = var9 + Statics.field1644.method5732() * 2 / 100;
            int var11 = var10 + Statics.field523.method5732() * 2 / 100;
            int var12 = var11 + Statics.field2799.method5732() * 2 / 100;
            int var13 = var12 + Statics.field33.method5732() * 2 / 100;
            int var14 = var13 + Statics.field2035.method5732() * 2 / 100;
            int var15 = var14 + Statics.field1651.method5732() * 2 / 100;
            int var16 = var15 + Statics.field990.method5732() * 2 / 100;
            int var17 = var16 + Statics.field1733.method5732() * 2 / 100;
            int var18 = var17 + Statics.field3671.method5732() / 100;
            int var19 = var18 + Statics.field4172.method5732() / 100;
            int var20 = var19 + Statics.field1620.method5732() / 100;
            int var21 = var20 + Statics.field2931.method5732() / 100;
            int var22 = var21 + (Statics.field4450.method5731() && Statics.field4450.method5787() ? 1 : 0);
            if (var22 == 100) {
                method4724(Statics.field1705, "Animations");
                method4724(Statics.field252, "Skeletons");
                method4724(Statics.field130, "Sound FX");
                method4724(Statics.field958, "Maps");
                method4724(Statics.field272, "Music Tracks");
                method4724(Statics.field2874, "Models");
                method4724(Statics.field1644, "Sprites");
                method4724(Statics.field33, "Music Jingles");
                method4724(Statics.field990, "Music Samples");
                method4724(Statics.field1733, "Music Patches");
                method4724(Statics.field3671, "World Map");
                method4724(Statics.field4172, "World Map Geography");
                method4724(Statics.field1620, "World Map Ground");
                Statics.field1858 = new class403();
                Statics.field1858.method6927(Statics.field4450);
                class73.field903 = class323.field3784;
                class73.field902 = 30;
                field651 = 45;
            } else {
                if (var22 != 0) {
                    class73.field903 = class323.field3807 + var22 + "%";
                }
                class73.field902 = 30;
            }
        } else if (field651 == 45) {
            class44.method2976(22050, !field494, 2);
            class285 var23 = new class285();
            var23.method4960(9, 128);
            Statics.field1264 = Statics.method4150(Statics.field199, 0, 22050);
            Statics.field1264.method803(var23);
            class284.method4719(Statics.field1733, Statics.field990, Statics.field130, var23);
            Statics.field1077 = Statics.method4150(Statics.field199, 1, 2048);
            Statics.field4836 = new class40();
            Statics.field1077.method803(Statics.field4836);
            Statics.field2522 = new class57(22050, Statics.field338);
            class73.field903 = class323.field3785;
            class73.field902 = 35;
            field651 = 50;
            Statics.field1087 = new class436(Statics.field1644, Statics.field1651);
        } else if (field651 == 50) {
            int var24 = class437.method7422().length;
            field792 = Statics.field1087.method7417(class437.method7422());
            if (field792.size() < var24) {
                class73.field903 = class323.field3786 + field792.size() * 100 / var24 + "%";
                class73.field902 = 40;
            } else {
                Statics.field4271 = (class365) field792.get(class437.field4762);
                Statics.field4239 = (class365) field792.get(class437.field4752);
                Statics.field1422 = (class365) field792.get(class437.field4763);
                Statics.field2289 = field665.method7177();
                class73.field903 = class323.field3886;
                class73.field902 = 40;
                field651 = 60;
            }
        } else if (field651 == 60) {
            class328 var25 = Statics.field2799;
            class328 var26 = Statics.field1644;
            int var27 = 0;
            String[] var28 = class73.field929;
            for (int var29 = 0; var29 < var28.length; var29++) {
                String var30 = var28[var29];
                if (var25.method5802(var30, "")) {
                    var27++;
                }
            }
            String[] var31 = class73.field912;
            for (int var32 = 0; var32 < var31.length; var32++) {
                String var33 = var31[var32];
                if (var26.method5802(var33, "")) {
                    var27++;
                }
            }
            int var36 = class73.field929.length + class73.field912.length;
            if (var27 < var36) {
                class73.field903 = class323.field3788 + var27 * 100 / var36 + "%";
                class73.field902 = 50;
            } else {
                class73.field903 = class323.field3945;
                class73.field902 = 50;
                method300(5);
                field651 = 70;
            }
        } else if (field651 == 70) {
            if (!Statics.field1743.method5787()) {
                class73.field903 = class323.field3790 + Statics.field1743.method5772() + "%";
                class73.field902 = 60;
            } else if (Statics.field2931.method5787()) {
                class196.method4663(Statics.field1743);
                class188.method4853(Statics.field1743);
                class328 var38 = Statics.field1743;
                class328 var39 = Statics.field2874;
                Statics.field1904 = var38;
                Statics.field1901 = var39;
                Statics.field1908 = Statics.field1904.method5793(3);
                class328 var40 = Statics.field1743;
                class328 var41 = Statics.field2874;
                boolean var42 = field494;
                Statics.field2082 = var40;
                Statics.field2083 = var41;
                class194.field2111 = var42;
                class328 var43 = Statics.field1743;
                class328 var44 = Statics.field2874;
                Statics.field1992 = var43;
                Statics.field1956 = var44;
                class328 var45 = Statics.field1743;
                Statics.field2055 = var45;
                class328 var46 = Statics.field1743;
                class328 var47 = Statics.field2874;
                boolean var48 = field493;
                class365 var49 = Statics.field4271;
                Statics.field3388 = var46;
                Statics.field2138 = var47;
                Statics.field1 = var48;
                Statics.field4678 = Statics.field3388.method5793(10);
                Statics.field1618 = var49;
                class328 var50 = Statics.field1743;
                class328 var51 = Statics.field1705;
                class328 var52 = Statics.field252;
                Statics.field2209 = var50;
                Statics.field193 = var51;
                Statics.field2213 = var52;
                class328 var53 = Statics.field1743;
                class328 var54 = Statics.field2874;
                Statics.field2019 = var53;
                Statics.field2008 = var54;
                class190.method2473(Statics.field1743);
                class328 var55 = Statics.field1743;
                Statics.field1868 = var55;
                Statics.field1867 = Statics.field1868.method5793(16);
                class328 var56 = Statics.field4116;
                class328 var57 = Statics.field2874;
                class328 var58 = Statics.field1644;
                class328 var59 = Statics.field1651;
                Statics.field1405 = var56;
                Statics.field2034 = var57;
                Statics.field3352 = var58;
                Statics.field2824 = var59;
                Statics.field3615 = new class303[Statics.field1405.method5794()][];
                Statics.field3355 = new boolean[Statics.field1405.method5794()];
                class176.method711(Statics.field1743);
                class328 var60 = Statics.field1743;
                Statics.field1945 = var60;
                Statics.method223(Statics.field1743);
                class328 var61 = Statics.field1743;
                class191.method4884(Statics.field1743);
                class328 var62 = Statics.field1743;
                Statics.field4842 = var62;
                class459.method6700(Statics.field1743);
                Statics.field311 = new class449(Statics.field4412, 54, Statics.field1347, Statics.field1743);
                Statics.field2299 = new class449(Statics.field4412, 47, Statics.field1347, Statics.field1743);
                Statics.field957 = new class105();
                class193.method2865(Statics.field1743, Statics.field1644, Statics.field1651);
                class181.method1075(Statics.field1743, Statics.field1644);
                class328 var63 = Statics.field1743;
                class328 var64 = Statics.field1644;
                Statics.field1876 = var64;
                if (var63.method5787()) {
                    Statics.field1878 = var63.method5793(35);
                    Statics.field1873 = new class178[Statics.field1878];
                    for (int var65 = 0; var65 < Statics.field1878; var65++) {
                        byte[] var66 = var63.method5859(35, var65);
                        Statics.field1873[var65] = new class178(var65);
                        if (var66 != null) {
                            Statics.field1873[var65].method3132(new class464(var66));
                            Statics.field1873[var65].method3130();
                        }
                    }
                }
                class73.field903 = class323.field3791;
                class73.field902 = 60;
                field651 = 80;
            } else {
                class73.field903 = class323.field3790 + (80 + Statics.field2035.method5772() / 6) + "%";
                class73.field902 = 60;
            }
        } else if (field651 == 80) {
            int var67 = 0;
            if (Statics.field1431 == null) {
                Statics.field1431 = class478.method6659(Statics.field1644, Statics.field1858.field4536, 0);
            } else {
                var67++;
            }
            if (Statics.field1711 == null) {
                Statics.field1711 = class478.method6659(Statics.field1644, Statics.field1858.field4537, 0);
            } else {
                var67++;
            }
            if (Statics.field1261 == null) {
                Statics.field1261 = class478.method2938(Statics.field1644, Statics.field1858.field4535, 0);
            } else {
                var67++;
            }
            if (Statics.field2520 == null) {
                Statics.field2520 = class478.method6892(Statics.field1644, Statics.field1858.field4538, 0);
            } else {
                var67++;
            }
            if (Statics.field3266 == null) {
                Statics.field3266 = class478.method6892(Statics.field1644, Statics.field1858.field4539, 0);
            } else {
                var67++;
            }
            if (Statics.field1780 == null) {
                Statics.field1780 = class478.method6892(Statics.field1644, Statics.field1858.field4540, 0);
            } else {
                var67++;
            }
            if (Statics.field2758 == null) {
                Statics.field2758 = class478.method6892(Statics.field1644, Statics.field1858.field4541, 0);
            } else {
                var67++;
            }
            if (Statics.field2262 == null) {
                Statics.field2262 = class478.method6892(Statics.field1644, Statics.field1858.field4542, 0);
            } else {
                var67++;
            }
            if (Statics.field414 == null) {
                Statics.field414 = class478.method6892(Statics.field1644, Statics.field1858.field4543, 0);
            } else {
                var67++;
            }
            if (Statics.field4746 == null) {
                Statics.field4746 = class478.method2938(Statics.field1644, Statics.field1858.field4544, 0);
            } else {
                var67++;
            }
            if (Statics.field1401 == null) {
                Statics.field1401 = class478.method2938(Statics.field1644, Statics.field1858.field4545, 0);
            } else {
                var67++;
            }
            if (var67 < 11) {
                class73.field903 = class323.field3792 + var67 * 100 / 12 + "%";
                class73.field902 = 70;
            } else {
                Statics.field4358 = Statics.field1401;
                Statics.field1711.method8125();
                int var68 = (int) (Math.random() * 21.0D) - 10;
                int var69 = (int) (Math.random() * 21.0D) - 10;
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1261[0].method8101(var68 + var71, var69 + var71, var70 + var71);
                class73.field903 = class323.field3879;
                class73.field902 = 70;
                field651 = 90;
            }
        } else if (field651 == 90) {
            if (Statics.field523.method5787()) {
                Statics.field21 = new class219(Statics.field523, Statics.field1644, 20, Statics.field4526.method2293(), field494 ? 64 : 128);
                class211.method3806(Statics.field21);
                class211.method3807(Statics.field4526.method2293());
                field651 = 100;
            } else {
                class73.field903 = class323.field3887 + "0%";
                class73.field902 = 90;
            }
        } else if (field651 == 100) {
            int var72 = Statics.field21.method4122();
            if (var72 < 100) {
                class73.field903 = class323.field3887 + var72 + "%";
                class73.field902 = 90;
            } else {
                class73.field903 = class323.field4047;
                class73.field902 = 90;
                field651 = 110;
            }
        } else if (field651 == 110) {
            Statics.field483 = new class86();
            Statics.field199.method3064(Statics.field483, 10);
            class73.field903 = class323.field3796;
            class73.field902 = 92;
            field651 = 120;
        } else if (field651 == 120) {
            if (Statics.field2799.method5802("huffman", "")) {
                class305 var73 = new class305(Statics.field2799.method5835("huffman", ""));
                Statics.field3646 = var73;
                class73.field903 = class323.field3798;
                class73.field902 = 94;
                field651 = 130;
            } else {
                class73.field903 = class323.field3894 + "%";
                class73.field902 = 94;
            }
        } else if (field651 == 130) {
            if (!Statics.field4116.method5787()) {
                class73.field903 = class323.field3896 + Statics.field4116.method5772() * 4 / 5 + "%";
                class73.field902 = 96;
            } else if (!Statics.field2035.method5787()) {
                class73.field903 = class323.field3896 + (80 + Statics.field2035.method5772() / 6) + "%";
                class73.field902 = 96;
            } else if (Statics.field1651.method5787()) {
                class73.field903 = class323.field3813;
                class73.field902 = 98;
                field651 = 140;
            } else {
                class73.field903 = class323.field3896 + (96 + Statics.field1651.method5772() / 50) + "%";
                class73.field902 = 96;
            }
        } else if (field651 == 140) {
            class73.field902 = 100;
            if (Statics.field3671.method5803(class254.field2955.field2954)) {
                if (Statics.field31 == null) {
                    Statics.field31 = new class435();
                    Statics.field31.method7378(Statics.field3671, Statics.field4172, Statics.field1620, Statics.field1422, field792, Statics.field1261);
                }
                class73.field903 = class323.field3802;
                field651 = 150;
            } else {
                class73.field903 = class323.field3801 + Statics.field3671.method5804(class254.field2955.field2954) / 10 + "%";
            }
        } else if (field651 == 150) {
            method300(10);
        }
    }

    @ObfuscatedName("kg.fu(IZZZZI)Llx;")
    public static class328 method5140(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class401 var5 = null;
        if (class165.field1795 != null) {
            var5 = new class401(arg0, class165.field1795, Statics.field1802[arg0], 1000000);
        }
        return new class328(var5, Statics.field2741, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.fv(I)V")
    public final void method1132() {
        class397 var1 = field636.method2544();
        class463 var2 = field636.field1378;
        try {
            if (field525 == 0) {
                if (Statics.field1736 == null && (field543.method2013() || field526 > 250)) {
                    Statics.field1736 = field543.method2024();
                    field543.method2012();
                    field543 = null;
                }
                if (Statics.field1736 != null) {
                    if (var1 != null) {
                        var1.method6853();
                        var1 = null;
                    }
                    Statics.field2684 = null;
                    field555 = false;
                    field526 = 0;
                    if (field616.method7986()) {
                        try {
                            this.method1126(Statics.field3387);
                            method708(21);
                        } catch (Throwable var78) {
                            class489.method7161((String) null, var78);
                            method2820(65);
                            return;
                        }
                    } else {
                        method708(1);
                    }
                }
            }
            if (field525 == 21) {
                if (this.field539 == null) {
                    if (this.field537 == null) {
                        method2820(65);
                        return;
                    }
                    if (!this.field537.method268()) {
                        return;
                    }
                    if (this.field537.method280()) {
                        class489.method7161(this.field537.method272(), (Throwable) null);
                        method2820(65);
                        this.field537 = null;
                        return;
                    }
                    class22 var6 = this.field537.method269();
                    if (var6.method290() != 200) {
                        method2820(65);
                        this.field537 = null;
                        return;
                    }
                    field526 = 0;
                    class420 var7 = new class420(var6.method291());
                    try {
                        Statics.field3419 = var7.method7140().getString("access_token");
                        Statics.field3387 = var7.method7140().getString("refresh_token");
                    } catch (Exception var76) {
                        class489.method7161("Error parsing tokens", var76);
                        method2820(65);
                        this.field537 = null;
                        return;
                    }
                } else if (this.field539.isDone()) {
                    if (this.field539.isCancelled()) {
                        method2820(65);
                        this.field539 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse) this.field539.get();
                        if (!var4.isSuccess()) {
                            method2820(65);
                            this.field539 = null;
                            return;
                        }
                        Statics.field3419 = var4.getAccessToken();
                        Statics.field3387 = var4.getRefreshToken();
                        this.field539 = null;
                    } catch (Exception var77) {
                        class489.method7161((String) null, var77);
                        method2820(65);
                        this.field539 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1127(Statics.field3419);
                method708(20);
            }
            if (field525 == 20) {
                if (this.field535 == null) {
                    if (this.field533 == null) {
                        method2820(65);
                        return;
                    }
                    if (!this.field533.method268()) {
                        return;
                    }
                    if (this.field533.method280()) {
                        class489.method7161(this.field533.method272(), (Throwable) null);
                        method2820(65);
                        this.field533 = null;
                        return;
                    }
                    class22 var11 = this.field533.method269();
                    if (var11.method290() != 200) {
                        class489.method7161("Response code: " + var11.method290() + "Response body: " + var11.method291(), (Throwable) null);
                        method2820(65);
                        this.field533 = null;
                        return;
                    }
                    this.field531 = var11.method291();
                    this.field533 = null;
                } else if (this.field535.isDone()) {
                    if (this.field535.isCancelled()) {
                        method2820(65);
                        this.field535 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var9 = (OtlTokenResponse) this.field535.get();
                        if (!var9.isSuccess()) {
                            method2820(65);
                            this.field535 = null;
                            return;
                        }
                        this.field531 = var9.getToken();
                        this.field535 = null;
                    } catch (Exception var75) {
                        class489.method7161((String) null, var75);
                        method2820(65);
                        this.field535 = null;
                        return;
                    }
                } else {
                    return;
                }
                field526 = 0;
                method708(1);
            }
            if (field525 == 1) {
                if (Statics.field2684 == null) {
                    Statics.field2684 = Statics.field199.method3056(Statics.field3121, Statics.field4838);
                }
                if (Statics.field2684.field1842 == 2) {
                    throw new IOException();
                }
                if (Statics.field2684.field1842 == 1) {
                    Socket var12 = (Socket) Statics.field2684.field1840;
                    class398 var13 = new class398(var12, 40000, 5000);
                    var1 = var13;
                    field636.method2559(var13);
                    Statics.field2684 = null;
                    method708(2);
                }
            }
            if (field525 == 2) {
                field636.method2538();
                class275 var14 = class275.method4887();
                var14.field3123.method7698(class277.field3248.field3251);
                field636.method2540(var14);
                field636.method2543();
                var2.field4864 = 0;
                method708(3);
            }
            if (field525 == 3) {
                if (Statics.field1264 != null) {
                    Statics.field1264.method790();
                }
                if (Statics.field1077 != null) {
                    Statics.field1077.method790();
                }
                if (var1.method6848(1)) {
                    int var15 = var1.method6850();
                    if (Statics.field1264 != null) {
                        Statics.field1264.method790();
                    }
                    if (Statics.field1077 != null) {
                        Statics.field1077.method790();
                    }
                    if (var15 != 0) {
                        method2820(var15);
                        return;
                    }
                    var2.field4864 = 0;
                    method708(4);
                }
            }
            if (field525 == 4) {
                if (var2.field4864 < 8) {
                    int var16 = var1.method6849();
                    if (var16 > 8 - var2.field4864) {
                        var16 = 8 - var2.field4864;
                    }
                    if (var16 > 0) {
                        var1.method6861(var2.field4867, var2.field4864, var16);
                        var2.field4864 += var16;
                    }
                }
                if (var2.field4864 == 8) {
                    var2.field4864 = 0;
                    Statics.field1808 = var2.method7721();
                    method708(5);
                }
            }
            if (field525 == 5) {
                field636.field1378.field4864 = 0;
                field636.method2538();
                class463 var17 = new class463(500);
                int[] var18 = new int[] { Statics.field1736.nextInt(), Statics.field1736.nextInt(), Statics.field1736.nextInt(), Statics.field1736.nextInt() };
                var17.field4864 = 0;
                var17.method7698(1);
                var17.method7835(var18[0]);
                var17.method7835(var18[1]);
                var17.method7835(var18[2]);
                var17.method7835(var18[3]);
                var17.method7703(Statics.field1808);
                if (field624 == 40) {
                    var17.method7835(Statics.field1446[0]);
                    var17.method7835(Statics.field1446[1]);
                    var17.method7835(Statics.field1446[2]);
                    var17.method7835(Statics.field1446[3]);
                } else {
                    if (field624 == 50) {
                        var17.method7698(class132.field1563.method24());
                        var17.method7835(Statics.field1924);
                    } else {
                        var17.method7698(field529.method24());
                        switch(field529.field1564) {
                            case 0:
                                LinkedHashMap var20 = Statics.field4526.field1255;
                                String var21 = class73.field913;
                                int var22 = var21.length();
                                int var23 = 0;
                                for (int var24 = 0; var24 < var22; var24++) {
                                    var23 = (var23 << 5) - var23 + var21.charAt(var24);
                                }
                                var17.method7835((Integer) var20.get(var23));
                                break;
                            case 1:
                            case 3:
                                var17.method7700(Statics.field4309);
                                var17.field4864++;
                            case 2:
                            default:
                                break;
                            case 4:
                                var17.field4864 += 4;
                        }
                    }
                    if (field616.method7986()) {
                        var17.method7698(class468.field4920.method24());
                        var17.method7705(this.field531);
                    } else {
                        var17.method7698(class468.field4924.method24());
                        var17.method7705(class73.field930);
                    }
                }
                var17.method7741(class72.field894, class72.field895);
                Statics.field1446 = var18;
                class275 var26 = class275.method4887();
                var26.field3123.field4864 = 0;
                if (field624 == 40) {
                    var26.field3123.method7698(class277.field3247.field3251);
                } else {
                    var26.field3123.method7698(class277.field3252.field3251);
                }
                var26.field3123.method7775(0);
                int var27 = var26.field3123.field4864;
                var26.field3123.method7835(209);
                var26.field3123.method7835(1);
                var26.field3123.method7698(field562);
                var26.field3123.method7698(field574);
                byte var28 = 0;
                var26.field3123.method7698(var28);
                var26.field3123.method7708(var17.field4867, 0, var17.field4864);
                int var29 = var26.field3123.field4864;
                var26.field3123.method7705(class73.field913);
                var26.field3123.method7698((field727 ? 1 : 0) << 1 | (field494 ? 1 : 0));
                var26.field3123.method7775(Statics.field223);
                var26.field3123.method7775(Statics.field59);
                method5126(var26.field3123);
                var26.field3123.method7705(Statics.field975);
                var26.field3123.method7835(Statics.field127);
                class464 var30 = new class464(Statics.field2289.method7190());
                Statics.field2289.method7193(var30);
                var26.field3123.method7708(var30.field4867, 0, var30.field4867.length);
                var26.field3123.method7698(field562);
                var26.field3123.method7835(0);
                var26.field3123.method7749(Statics.field1651.field4160);
                var26.field3123.method7835(Statics.field1743.field4160);
                var26.field3123.method7947(Statics.field3671.field4160);
                var26.field3123.method7835(Statics.field1644.field4160);
                var26.field3123.method7749(Statics.field958.field4160);
                var26.field3123.method7947(0);
                var26.field3123.method7765(Statics.field252.field4160);
                var26.field3123.method7947(Statics.field1733.field4160);
                var26.field3123.method7835(Statics.field2799.field4160);
                var26.field3123.method7749(Statics.field1705.field4160);
                var26.field3123.method7765(Statics.field4172.field4160);
                var26.field3123.method7749(Statics.field272.field4160);
                var26.field3123.method7947(Statics.field4116.field4160);
                var26.field3123.method7765(Statics.field33.field4160);
                var26.field3123.method7947(Statics.field2874.field4160);
                var26.field3123.method7835(Statics.field523.field4160);
                var26.field3123.method7765(Statics.field990.field4160);
                var26.field3123.method7765(Statics.field4450.field4160);
                var26.field3123.method7947(Statics.field1620.field4160);
                var26.field3123.method7835(Statics.field130.field4160);
                var26.field3123.method7765(Statics.field2035.field4160);
                var26.field3123.method7739(var18, var29, var26.field3123.field4864);
                var26.field3123.method7711(var26.field3123.field4864 - var27);
                field636.method2540(var26);
                field636.method2543();
                field636.field1373 = new class480(var18);
                int[] var31 = new int[4];
                for (int var32 = 0; var32 < 4; var32++) {
                    var31[var32] = var18[var32] + 50;
                }
                var2.method7657(var31);
                method708(6);
            }
            if (field525 == 6 && var1.method6849() > 0) {
                int var33 = var1.method6850();
                if (var33 == 61) {
                    int var34 = var1.method6849();
                    Statics.field1021 = var34 == 1 && var1.method6850() == 1;
                    method708(5);
                }
                if (var33 == 21 && field624 == 20) {
                    method708(12);
                } else if (var33 == 2) {
                    method708(14);
                } else if (var33 == 15 && field624 == 40) {
                    field636.field1377 = -1;
                    method708(19);
                } else if (var33 == 64) {
                    method708(10);
                } else if (var33 == 23 && field527 < 1) {
                    field527++;
                    method708(0);
                } else if (var33 == 29) {
                    method708(17);
                } else if (var33 == 69) {
                    method708(7);
                } else {
                    method2820(var33);
                    return;
                }
            }
            if (field525 == 7 && var1.method6849() >= 2) {
                var1.method6861(var2.field4867, 0, 2);
                var2.field4864 = 0;
                Statics.field868 = var2.method7716();
                method708(8);
            }
            if (field525 == 8 && var1.method6849() >= Statics.field868) {
                var2.field4864 = 0;
                var1.method6861(var2.field4867, var2.field4864, Statics.field868);
                class7[] var35 = new class7[] { class7.field20 };
                class7 var36 = var35[var2.method7735()];
                try {
                    class4 var37 = class5.method3406(var36);
                    this.field545 = new class8(var2, var37);
                    method708(9);
                } catch (Exception var74) {
                    method2820(22);
                    return;
                }
            }
            if (field525 == 9 && this.field545.method30()) {
                this.field586 = this.field545.method32();
                this.field545.method31();
                this.field545 = null;
                if (this.field586 == null) {
                    method2820(22);
                    return;
                }
                field636.method2538();
                class275 var39 = class275.method4887();
                var39.field3123.method7698(class277.field3249.field3251);
                var39.field3123.method7775(this.field586.field4864);
                var39.field3123.method7709(this.field586);
                field636.method2540(var39);
                field636.method2543();
                this.field586 = null;
                method708(6);
            }
            if (field525 == 10 && var1.method6849() > 0) {
                Statics.field2133 = var1.method6850();
                method708(11);
            }
            if (field525 == 11 && var1.method6849() >= Statics.field2133) {
                var1.method6861(var2.field4867, 0, Statics.field2133);
                var2.field4864 = 0;
                method708(6);
            }
            if (field525 == 12 && var1.method6849() > 0) {
                field575 = (var1.method6850() + 3) * 60;
                method708(13);
            }
            if (field525 == 13) {
                field526 = 0;
                class73.method4925(class323.field3958, class323.field3818, field575 / 60 + class323.field3810);
                if (--field575 <= 0) {
                    method708(0);
                }
            } else {
                if (field525 == 14 && var1.method6849() >= 1) {
                    Statics.field861 = var1.method6850();
                    method708(15);
                }
                if (field525 == 15 && var1.method6849() >= Statics.field861) {
                    boolean var40 = var1.method6850() == 1;
                    var1.method6861(var2.field4867, 0, 4);
                    var2.field4864 = 0;
                    boolean var41 = false;
                    if (var40) {
                        int var42 = var2.method7660() << 24;
                        int var43 = var42 | var2.method7660() << 16;
                        int var44 = var43 | var2.method7660() << 8;
                        int var45 = var44 | var2.method7660();
                        String var46 = class73.field913;
                        int var47 = var46.length();
                        int var48 = 0;
                        int var49 = 0;
                        while (true) {
                            if (var49 >= var47) {
                                if (Statics.field4526.field1255.size() >= 10 && !Statics.field4526.field1255.containsKey(var48)) {
                                    Iterator var52 = Statics.field4526.field1255.entrySet().iterator();
                                    var52.next();
                                    var52.remove();
                                }
                                Statics.field4526.field1255.put(var48, var45);
                                break;
                            }
                            var48 = (var48 << 5) - var48 + var46.charAt(var49);
                            var49++;
                        }
                    }
                    if (field749) {
                        Statics.field4526.method2286(class73.field913);
                    } else {
                        Statics.field4526.method2286((String) null);
                    }
                    class94.method2940();
                    field608 = var1.method6850();
                    field678 = var1.method6850() == 1;
                    field622 = var1.method6850();
                    field622 <<= 0x8;
                    field622 += var1.method6850();
                    field779 = var1.method6850();
                    var1.method6861(var2.field4867, 0, 8);
                    var2.field4864 = 0;
                    this.field546 = var2.method7721();
                    if (Statics.field861 >= 29) {
                        var1.method6861(var2.field4867, 0, 8);
                        var2.field4864 = 0;
                        field490 = var2.method7721();
                    }
                    var1.method6861(var2.field4867, 0, 1);
                    var2.field4864 = 0;
                    class276[] var53 = class276.method3158();
                    int var54 = var2.method7662();
                    if (var54 < 0 || var54 >= var53.length) {
                        throw new IOException(var54 + " " + var2.field4864);
                    }
                    field636.field1375 = var53[var54];
                    field636.field1377 = field636.field1375.field3158;
                    var1.method6861(var2.field4867, 0, 2);
                    var2.field4864 = 0;
                    field636.field1377 = var2.method7716();
                    try {
                        class28.method393(Statics.field1599, "zap");
                    } catch (Throwable var73) {
                    }
                    method708(16);
                }
                if (field525 != 16) {
                    if (field525 == 17 && var1.method6849() >= 2) {
                        var2.field4864 = 0;
                        var1.method6861(var2.field4867, 0, 2);
                        var2.field4864 = 0;
                        Statics.field1725 = var2.method7716();
                        method708(18);
                    }
                    if (field525 == 18 && var1.method6849() >= Statics.field1725) {
                        var2.field4864 = 0;
                        var1.method6861(var2.field4867, 0, Statics.field1725);
                        var2.field4864 = 0;
                        String var68 = var2.method7725();
                        String var69 = var2.method7725();
                        String var70 = var2.method7725();
                        class73.method4925(var68, var69, var70);
                        method300(10);
                        if (field616.method7986()) {
                            class73.method1112(9);
                        }
                    }
                    if (field525 == 19) {
                        if (field636.field1377 == -1) {
                            if (var1.method6849() < 2) {
                                return;
                            }
                            var1.method6861(var2.field4867, 0, 2);
                            var2.field4864 = 0;
                            field636.field1377 = var2.method7716();
                        }
                        if (var1.method6849() >= field636.field1377) {
                            var1.method6861(var2.field4867, 0, field636.field1377);
                            var2.field4864 = 0;
                            int var71 = field636.field1377;
                            field556.method6585();
                            method4309();
                            class103.method4743(var2);
                            if (var2.field4864 != var71) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field526++;
                        if (field526 > 2000) {
                            if (field527 < 1) {
                                if (Statics.field4838 == Statics.field1759) {
                                    Statics.field4838 = Statics.field1566;
                                } else {
                                    Statics.field4838 = Statics.field1759;
                                }
                                field527++;
                                method708(0);
                            } else {
                                method2820(-3);
                            }
                        }
                    }
                } else if (var1.method6849() >= field636.field1377) {
                    var2.field4864 = 0;
                    var1.method6861(var2.field4867, 0, field636.field1377);
                    field556.method6598();
                    field504 = -1L;
                    Statics.field483.field1058 = 0;
                    Statics.field986 = true;
                    field508 = true;
                    field739 = -1L;
                    class38.method262();
                    field636.method2538();
                    field636.field1378.field4864 = 0;
                    field636.field1375 = null;
                    field636.field1381 = null;
                    field636.field1374 = null;
                    field636.field1382 = null;
                    field636.field1377 = 0;
                    field636.field1372 = 0;
                    field509 = 0;
                    field554 = 0;
                    field510 = 0;
                    field553 = 0;
                    field642 = false;
                    class37.field235 = 0;
                    class106.field1365.clear();
                    class106.field1361.method7449();
                    class106.field1360.method6178();
                    class106.field1363 = 0;
                    field660 = 0;
                    field662 = false;
                    field752 = 0;
                    field530 = 0;
                    field580 = 0;
                    Statics.field4145 = null;
                    field567 = 0;
                    field520 = -1;
                    field747 = 0;
                    field748 = 0;
                    field670 = class99.field1292;
                    field708 = class99.field1292;
                    field549 = 0;
                    class103.field1317 = 0;
                    for (int var56 = 0; var56 < 2048; var56++) {
                        class103.field1316[var56] = null;
                        class103.field1315[var56] = class203.field2283;
                    }
                    for (int var57 = 0; var57 < 2048; var57++) {
                        field621[var57] = null;
                    }
                    for (int var58 = 0; var58 < 65536; var58++) {
                        field760[var58] = null;
                    }
                    field633 = -1;
                    field711.method6030();
                    field637.method6030();
                    for (int var59 = 0; var59 < 4; var59++) {
                        for (int var60 = 0; var60 < 104; var60++) {
                            for (int var61 = 0; var61 < 104; var61++) {
                                field723[var59][var60][var61] = null;
                            }
                        }
                    }
                    field635 = new class349();
                    Statics.field2726.method1698();
                    for (int var62 = 0; var62 < Statics.field1867; var62++) {
                        class177 var63 = class177.method4855(var62);
                        if (var63 != null) {
                            class293.field3389[var62] = 0;
                            class293.field3391[var62] = 0;
                        }
                    }
                    Statics.field957.method2482();
                    field677 = -1;
                    if (field751 != -1) {
                        class303.method4756(field751);
                    }
                    for (class84 var64 = (class84) field668.method7478(); var64 != null; var64 = (class84) field668.method7469()) {
                        method45(var64, true);
                    }
                    field751 = -1;
                    field668 = new class441(8);
                    field499 = null;
                    field553 = 0;
                    field642 = false;
                    field778.method5184((int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
                    for (int var65 = 0; var65 < 8; var65++) {
                        field630[var65] = null;
                        field613[var65] = false;
                    }
                    class82.method2839();
                    field686 = true;
                    for (int var66 = 0; var66 < 100; var66++) {
                        field718[var66] = true;
                    }
                    method58();
                    Statics.field889 = null;
                    Statics.field1452 = null;
                    Arrays.fill(field596, (Object) null);
                    Statics.field2239 = null;
                    Arrays.fill(field741, (Object) null);
                    for (int var67 = 0; var67 < 8; var67++) {
                        field782[var67] = new class339();
                    }
                    Statics.field2952 = null;
                    class103.method4743(var2);
                    Statics.field4235 = -1;
                    method28(false, var2);
                    field636.field1375 = null;
                }
            }
        } catch (IOException var79) {
            if (field527 < 1) {
                if (Statics.field4838 == Statics.field1759) {
                    Statics.field4838 = Statics.field1566;
                } else {
                    Statics.field4838 = Statics.field1759;
                }
                field527++;
                method708(0);
            } else {
                method2820(-2);
            }
        }
    }

    @ObfuscatedName("ht.fd(I)V")
    public static void method4309() {
        field636.method2538();
        field636.field1378.field4864 = 0;
        field636.field1375 = null;
        field636.field1381 = null;
        field636.field1374 = null;
        field636.field1382 = null;
        field636.field1377 = 0;
        field636.field1372 = 0;
        field509 = 0;
        field553 = 0;
        field642 = false;
        field567 = 0;
        field747 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field621[var0] = null;
        }
        Statics.field3404 = null;
        for (int var1 = 0; var1 < field760.length; var1++) {
            class96 var2 = field760[var1];
            if (var2 != null) {
                var2.field1171 = -1;
                var2.field1172 = false;
            }
        }
        class82.method2839();
        method300(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field718[var3] = true;
        }
        method58();
    }

    @ObfuscatedName("dh.fq(II)V")
    public static void method2820(int arg0) {
        int var1 = class73.field899;
        if (arg0 == -3) {
            class73.method4925(class323.field3811, class323.field3812, class323.field3950);
        } else if (arg0 == -2) {
            class73.method4925(class323.field3971, class323.field3815, class323.field3843);
        } else if (arg0 == -1) {
            class73.method4925(class323.field3959, class323.field3794, class323.field3819);
        } else if (arg0 == 3) {
            class73.method1112(3);
            class73.field926 = 1;
        } else if (arg0 == 4) {
            class73.method1112(14);
            class73.field908 = 0;
        } else if (arg0 == 5) {
            class73.field926 = 2;
            class73.method4925(class323.field3823, class323.field4069, class323.field3975);
        } else if (arg0 == 68 || !(field498 || arg0 != 6)) {
            class73.method4925(class323.field3838, class323.field3827, class323.field4056);
        } else if (arg0 == 7) {
            class73.method4925(class323.field3829, class323.field3830, class323.field3831);
        } else if (arg0 == 8) {
            class73.method4925(class323.field3832, class323.field3833, class323.field3834);
        } else if (arg0 == 9) {
            class73.method4925(class323.field3926, class323.field3966, class323.field4045);
        } else if (arg0 == 10) {
            class73.method4925(class323.field3991, class323.field3839, class323.field4043);
        } else if (arg0 == 11) {
            class73.method4925(class323.field4087, class323.field3842, class323.field3997);
        } else if (arg0 == 12) {
            class73.method4925(class323.field3844, class323.field3845, class323.field3846);
        } else if (arg0 == 13) {
            class73.method4925(class323.field3779, class323.field3877, class323.field3849);
        } else if (arg0 == 14) {
            class73.method4925(class323.field3850, class323.field3781, class323.field3852);
        } else if (arg0 == 16) {
            class73.method4925(class323.field3853, class323.field3854, class323.field3855);
        } else if (arg0 == 17) {
            class73.method4925(class323.field3948, class323.field3893, class323.field3858);
        } else if (arg0 == 18) {
            class73.method1112(14);
            class73.field908 = 1;
        } else if (arg0 == 19) {
            class73.method4925(class323.field3891, class323.field3837, class323.field3864);
        } else if (arg0 == 20) {
            class73.method4925(class323.field3865, class323.field4054, class323.field3847);
        } else if (arg0 == 22) {
            class73.method4925(class323.field4020, class323.field3869, class323.field3870);
        } else if (arg0 == 23) {
            class73.method4925(class323.field3871, class323.field3872, class323.field3873);
        } else if (arg0 == 24) {
            class73.method4925(class323.field3874, class323.field3875, class323.field3876);
        } else if (arg0 == 25) {
            class73.method4925(class323.field3898, class323.field3878, class323.field4084);
        } else if (arg0 == 26) {
            class73.method4925(class323.field3880, class323.field3881, class323.field3882);
        } else if (arg0 == 27) {
            class73.method4925(class323.field3795, class323.field3884, class323.field4016);
        } else if (arg0 == 31) {
            class73.method4925(class323.field3892, class323.field3816, class323.field4039);
        } else if (arg0 == 32) {
            class73.method1112(14);
            class73.field908 = 2;
        } else if (arg0 == 37) {
            class73.method4925(class323.field3883, class323.field3899, class323.field3900);
        } else if (arg0 == 38) {
            class73.method4925(class323.field3901, class323.field3902, class323.field4002);
        } else if (arg0 == 55) {
            class73.method1112(8);
        } else if (arg0 == 56) {
            class73.method4925(class323.field4036, class323.field3909, class323.field3851);
            method300(11);
            return;
        } else if (arg0 == 57) {
            class73.method4925(class323.field3960, class323.field4066, class323.field3913);
            method300(11);
            return;
        } else if (arg0 == 61) {
            class73.method4925("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class73.method1112(7);
        } else if (arg0 == 62) {
            method300(10);
            class73.method1112(9);
            class73.method4925(class323.field3961, class323.field3915, class323.field3916);
            return;
        } else if (arg0 == 63) {
            method300(10);
            class73.method1112(9);
            class73.method4925(class323.field3917, class323.field3918, class323.field3919);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method300(10);
            class73.method1112(9);
            class73.method4925(class323.field3920, class323.field3921, class323.field3922);
            return;
        } else if (arg0 == 71) {
            method300(10);
            class73.method1112(7);
            class73.method4925("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method300(10);
            class73.method1112(6);
            class73.method4925(class323.field3835, class323.field3903, class323.field3793);
        } else if (arg0 == 72) {
            method300(10);
            class73.method1112(26);
        } else {
            class73.method4925(class323.field3923, class323.field3924, class323.field4012);
        }
        method300(10);
        int var4 = class73.field899;
        boolean var5 = var1 != var4;
        if (!var5 && field616.method7986()) {
            class73.method1112(9);
        }
    }

    @ObfuscatedName("nd.fz(I)V")
    public static final void method6608() {
        field636.method2542();
        method2619();
        Statics.field1615.method3924();
        for (int var0 = 0; var0 < 4; var0++) {
            field742[var0].method3661();
        }
        field735.method3611();
        System.gc();
        class284.field3294 = 1;
        Statics.field124 = null;
        Statics.field3295 = -1;
        Statics.field3296 = -1;
        Statics.field1364 = 0;
        Statics.field4191 = false;
        Statics.field110 = 2;
        field606 = -1;
        field639 = false;
        Statics.method2164();
        method300(10);
    }

    @ObfuscatedName("nd.fb(II)V")
    public static final void method6609(int arg0) {
        method6608();
        switch(arg0) {
            case 1:
                class73.method97();
                break;
            case 2:
                class73.method164();
        }
    }

    @ObfuscatedName("ed.fj(B)J")
    public static long method2936() {
        return field490;
    }

    @ObfuscatedName("dt.gj(B)V")
    public static final void method2619() {
        class196.field2196.method4837();
        class188.method2939();
        class180.method3107();
        class194.method2872();
        class185.method263();
        class195.method4346();
        class197.method2607();
        class187.method2417();
        class190.field2039.method4837();
        class177.method2973();
        Statics.field311.method7549();
        Statics.field2299.method7549();
        class193.field2060.method4837();
        class193.field2061.method4837();
        class193.field2062.method4837();
        class181.field1929.method4837();
        class181.field1916.method4837();
        class192.field2054.method4837();
        class191.method5728();
        class178.method1771();
        class457.field4840.method4837();
        class459.field4848.method4837();
        field784.method4837();
        field785.method4837();
        class300.method3235();
        class303.method5115();
        ((class219) Statics.field2422).method4128();
        class76.field965.method4837();
        Statics.field1705.method5807();
        Statics.field252.method5807();
        Statics.field4116.method5807();
        Statics.field130.method5807();
        Statics.field958.method5807();
        Statics.field272.method5807();
        Statics.field2874.method5807();
        Statics.field1644.method5807();
        Statics.field523.method5807();
        Statics.field2799.method5807();
        Statics.field33.method5807();
        Statics.field2035.method5807();
        Statics.field2931.method5807();
    }

    @ObfuscatedName("ib.gl(I)V")
    public static final void method4667() {
        if (field554 > 0) {
            method6608();
        } else {
            field556.method6582();
            method300(40);
            Statics.field2529 = field636.method2544();
            field636.method2562();
        }
    }

    @ObfuscatedName("aw.gu(ZI)V")
    public static final void method848(boolean arg0) {
        if (arg0) {
            field529 = class73.field901 ? class132.field1565 : class132.field1562;
            return;
        }
        LinkedHashMap var1 = Statics.field4526.field1255;
        String var2 = class73.field913;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field529 = var1.containsKey(var4) ? class132.field1561 : class132.field1560;
    }

    @ObfuscatedName("client.ga(I)V")
    public final void method1133() {
        if (field509 > 1) {
            field509--;
        }
        if (field554 > 0) {
            field554--;
        }
        if (field555) {
            field555 = false;
            method4667();
            return;
        }
        if (!field642) {
            method5131();
        }
        for (int var1 = 0; var1 < 100 && this.method1138(field636); var1++) {
        }
        if (field624 != 30) {
            return;
        }
        while (true) {
            class39 var2 = (class39) class38.field258.method6075();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field556.field4400) {
                    class275 var6 = class275.method3314(class273.field3024, field636.field1373);
                    var6.field3123.method7698(0);
                    int var7 = var6.field3123.field4864;
                    field556.method6586(var6.field3123);
                    var6.field3123.method7745(var6.field3123.field4864 - var7);
                    field636.method2540(var6);
                    field556.method6584();
                }
                Object var8 = Statics.field483.field1066;
                synchronized (Statics.field483.field1066) {
                    if (!field518) {
                        Statics.field483.field1058 = 0;
                    } else if (class37.field234 != 0 || Statics.field483.field1058 >= 40) {
                        class275 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field483.field1058 && (var9 == null || var9.field3123.field4864 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field483.field1061[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field483.field1059[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field505 != var16 || field631 != var15) {
                                if (var9 == null) {
                                    var9 = class275.method3314(class273.field3076, field636.field1373);
                                    var9.field3123.method7698(0);
                                    var10 = var9.field3123.field4864;
                                    var9.field3123.field4864 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field502 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field505;
                                    var18 = var15 - field631;
                                    var19 = (int) ((Statics.field483.field1065[var14] - field502) / 20L);
                                    var12 = (int) ((Statics.field483.field1065[var14] - field502) % 20L + (long) var12);
                                }
                                field505 = var16;
                                field631 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3123.method7775((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3123.method7698(var19 + 128);
                                    var9.field3123.method7775((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3123.method7698(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3123.method7835(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3123.method7835(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3123.method7775((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3123.method7835(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3123.method7835(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field502 = Statics.field483.field1065[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3123.method7745(var9.field3123.field4864 - var10);
                            int var20 = var9.field3123.field4864;
                            var9.field3123.field4864 = var10;
                            var9.field3123.method7698(var12 / var13);
                            var9.field3123.method7698(var12 % var13);
                            var9.field3123.field4864 = var20;
                            field636.method2540(var9);
                        }
                        if (var11 >= Statics.field483.field1058) {
                            Statics.field483.field1058 = 0;
                        } else {
                            Statics.field483.field1058 -= var11;
                            System.arraycopy(Statics.field483.field1059, var11, Statics.field483.field1059, 0, Statics.field483.field1058);
                            System.arraycopy(Statics.field483.field1061, var11, Statics.field483.field1061, 0, Statics.field483.field1058);
                            System.arraycopy(Statics.field483.field1065, var11, Statics.field483.field1065, 0, Statics.field483.field1058);
                        }
                    }
                }
                if (class37.field234 == 1 || !Statics.field1024 && class37.field234 == 4 || class37.field234 == 2) {
                    long var22 = class37.field236 - field504;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field504 = class37.field236;
                    int var24 = class37.field250;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field59) {
                        var24 = Statics.field59;
                    }
                    int var25 = class37.field240;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field223) {
                        var25 = Statics.field223;
                    }
                    int var26 = (int) var22;
                    class275 var27 = class275.method3314(class273.field3052, field636.field1373);
                    var27.field3123.method7775((var26 << 1) + (class37.field234 == 2 ? 1 : 0));
                    var27.field3123.method7775(var25);
                    var27.field3123.method7775(var24);
                    field636.method2540(var27);
                }
                if (field734.field2248 > 0) {
                    class275 var28 = class275.method3314(class273.field3005, field636.field1373);
                    var28.field3123.method7775(0);
                    int var29 = var28.field3123.field4864;
                    long var30 = class280.method2629();
                    for (int var32 = 0; var32 < field734.field2248; var32++) {
                        long var33 = var30 - field739;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field739 = var30;
                        var28.field3123.method7761((int) var33);
                        var28.field3123.method7746(field734.field2247[var32]);
                    }
                    var28.field3123.method7711(var28.field3123.field4864 - var29);
                    field636.method2540(var28);
                }
                if (field780 > 0) {
                    field780--;
                }
                if (field734.method3626(96) || field734.method3626(97) || field734.method3626(98) || field734.method3626(99)) {
                    field590 = true;
                }
                if (field590 && field780 <= 0) {
                    field780 = 20;
                    field590 = false;
                    class275 var35 = class275.method3314(class273.field3035, field636.field1373);
                    var35.field3123.method7775(field619);
                    var35.field3123.method7753(field530);
                    field636.method2540(var35);
                }
                if (Statics.field986 && !field508) {
                    field508 = true;
                    class275 var36 = class275.method3314(class273.field3017, field636.field1373);
                    var36.field3123.method7698(1);
                    field636.method2540(var36);
                }
                if (!Statics.field986 && field508) {
                    field508 = false;
                    class275 var37 = class275.method3314(class273.field3017, field636.field1373);
                    var37.field3123.method7698(0);
                    field636.method2540(var37);
                }
                if (Statics.field31 != null) {
                    Statics.field31.method7212();
                }
                method1050();
                if (Statics.field1617) {
                    method460();
                    Statics.field1617 = false;
                }
                if (Statics.field478 != field520) {
                    field520 = Statics.field478;
                    method4847(Statics.field478);
                }
                if (field624 != 30) {
                    return;
                }
                for (class90 var38 = (class90) field635.method6040(); var38 != null; var38 = (class90) field635.method6034()) {
                    if (var38.field1133 > 0) {
                        var38.field1133--;
                    }
                    if (var38.field1133 != 0) {
                        if (var38.field1136 > 0) {
                            var38.field1136--;
                        }
                        if (var38.field1136 == 0 && var38.field1129 >= 1 && var38.field1124 >= 1 && var38.field1129 <= 102 && var38.field1124 <= 102 && (var38.field1128 < 0 || class79.method836(var38.field1128, var38.field1130))) {
                            method5704(var38.field1123, var38.field1122, var38.field1129, var38.field1124, var38.field1128, var38.field1121, var38.field1130);
                            var38.field1136 = -1;
                            if (var38.field1128 == var38.field1125 && var38.field1125 == -1) {
                                var38.method7170();
                            } else if (var38.field1128 == var38.field1125 && var38.field1126 == var38.field1121 && var38.field1130 == var38.field1127) {
                                var38.method7170();
                            }
                        }
                    } else if (var38.field1125 < 0 || class79.method836(var38.field1125, var38.field1127)) {
                        method5704(var38.field1123, var38.field1122, var38.field1129, var38.field1124, var38.field1125, var38.field1126, var38.field1127);
                        var38.method7170();
                    }
                }
                int var10002;
                for (int var39 = 0; var39 < field752; var39++) {
                    var10002 = field755[var39]--;
                    if (field755[var39] >= -10) {
                        class41 var41 = field757[var39];
                        if (var41 == null) {
                            class41 var10000 = (class41) null;
                            var41 = class41.method753(Statics.field130, field753[var39], 0);
                            if (var41 == null) {
                                continue;
                            }
                            field755[var39] += var41.method749();
                            field757[var39] = var41;
                        }
                        if (field755[var39] < 0) {
                            int var48;
                            if (field592[var39] == 0) {
                                var48 = Statics.field4526.method2328();
                            } else {
                                int var42 = (field592[var39] & 0xFF) * 128;
                                int var43 = field592[var39] >> 16 & 0xFF;
                                int var44 = var43 * 128 + 64 - Statics.field3404.field1163;
                                if (var44 < 0) {
                                    var44 = -var44;
                                }
                                int var45 = field592[var39] >> 8 & 0xFF;
                                int var46 = var45 * 128 + 64 - Statics.field3404.field1138;
                                if (var46 < 0) {
                                    var46 = -var46;
                                }
                                int var47 = var44 + var46 - 128;
                                if (var47 > var42) {
                                    field755[var39] = -100;
                                    continue;
                                }
                                if (var47 < 0) {
                                    var47 = 0;
                                }
                                var48 = (var42 - var47) * Statics.field4526.method2312() / var42;
                            }
                            if (var48 > 0) {
                                class42 var49 = var41.method748().method757(Statics.field2522);
                                class49 var50 = class49.method881(var49, 100, var48);
                                var50.method865(field754[var39] - 1);
                                Statics.field4836.method713(var50);
                            }
                            field755[var39] = -100;
                        }
                    } else {
                        field752--;
                        for (int var40 = var39; var40 < field752; var40++) {
                            field753[var40] = field753[var40 + 1];
                            field757[var40] = field757[var40 + 1];
                            field754[var40] = field754[var40 + 1];
                            field755[var40] = field755[var40 + 1];
                            field592[var40] = field592[var40 + 1];
                        }
                        var39--;
                    }
                }
                if (field639) {
                    boolean var51;
                    if (class284.field3294 == 0) {
                        var51 = Statics.field3293.method4942();
                    } else {
                        var51 = true;
                    }
                    if (!var51) {
                        if (Statics.field4526.method2292() != 0 && field606 != -1) {
                            class284.method261(Statics.field272, field606, 0, Statics.field4526.method2292(), false);
                        }
                        field639 = false;
                    }
                }
                field636.field1372++;
                if (field636.field1372 > 750) {
                    method4667();
                    return;
                }
                int var52 = class103.field1317;
                int[] var53 = class103.field1318;
                for (int var54 = 0; var54 < var52; var54++) {
                    class89 var55 = field621[var53[var54]];
                    if (var55 != null) {
                        method25(var55, 1);
                    }
                }
                for (int var56 = 0; var56 < field549; var56++) {
                    int var57 = field550[var56];
                    class96 var58 = field760[var57];
                    if (var58 != null) {
                        method25(var58, var58.field1267.field1961);
                    }
                }
                int[] var59 = class103.field1318;
                for (int var60 = 0; var60 < class103.field1317; var60++) {
                    class89 var61 = field621[var59[var60]];
                    if (var61 != null && var61.field1179 > 0) {
                        var61.field1179--;
                        if (var61.field1179 == 0) {
                            var61.field1158 = null;
                        }
                    }
                }
                for (int var62 = 0; var62 < field549; var62++) {
                    int var63 = field550[var62];
                    class96 var64 = field760[var63];
                    if (var64 != null && var64.field1179 > 0) {
                        var64.field1179--;
                        if (var64.field1179 == 0) {
                            var64.field1158 = null;
                        }
                    }
                }
                field559++;
                if (field609 != 0) {
                    field762 += 20;
                    if (field762 >= 400) {
                        field609 = 0;
                    }
                }
                if (Statics.field1576 != null) {
                    field698++;
                    if (field698 >= 15) {
                        method2867(Statics.field1576);
                        Statics.field1576 = null;
                    }
                }
                class303 var65 = Statics.field2556;
                class303 var66 = Statics.field2557;
                Statics.field2556 = null;
                Statics.field2557 = null;
                field684 = null;
                field641 = false;
                field685 = false;
                field680 = 0;
                while (field734.method3642() && field680 < 128) {
                    if (field608 >= 2 && field734.method3626(82) && field734.field2253 == 66) {
                        StringBuilder var67 = new StringBuilder();
                        Iterator var68 = class106.field1361.iterator();
                        while (var68.hasNext()) {
                            class62 var69 = (class62) var68.next();
                            if (var69.field471 != null && !var69.field471.isEmpty()) {
                                var67.append(var69.field471).append(':');
                            }
                            var67.append(var69.field474).append('\n');
                        }
                        String var70 = var67.toString();
                        Statics.field1599.method522(var70);
                    } else if (field580 != 1 || field734.field2257 <= 0) {
                        field738[field680] = field734.field2253;
                        field614[field680] = field734.field2257;
                        field680++;
                    }
                }
                if (Statics.method2654() && field734.method3626(82) && field734.method3626(81) && field497 != 0) {
                    int var72 = Statics.field3404.field1112 - field497;
                    if (var72 < 0) {
                        var72 = 0;
                    } else if (var72 > 3) {
                        var72 = 3;
                    }
                    if (Statics.field3404.field1112 != var72) {
                        Statics.method2868(Statics.field142 + Statics.field3404.field1197[0], Statics.field1754 + Statics.field3404.field1209[0], var72, false);
                    }
                    field497 = 0;
                }
                if (class37.field234 == 1) {
                    field735.method3611();
                }
                if (field751 != -1) {
                    method4723(field751, 0, 0, Statics.field223, Statics.field59, 0, 0);
                }
                field736++;
                while (true) {
                    class85 var73;
                    class303 var74;
                    class303 var75;
                    do {
                        var73 = (class85) field712.method6051();
                        if (var73 == null) {
                            while (true) {
                                class85 var76;
                                class303 var77;
                                class303 var78;
                                do {
                                    var76 = (class85) field671.method6051();
                                    if (var76 == null) {
                                        while (true) {
                                            class85 var79;
                                            class303 var80;
                                            class303 var81;
                                            do {
                                                var79 = (class85) field623.method6051();
                                                if (var79 == null) {
                                                    while (true) {
                                                        class199 var82 = (class199) field714.method6051();
                                                        if (var82 == null) {
                                                            this.method1139();
                                                            method4715();
                                                            if (field732 != null) {
                                                                this.method1144();
                                                            }
                                                            if (Statics.field2006 != null) {
                                                                method2867(Statics.field2006);
                                                                field644++;
                                                                if (class37.field246 == 0) {
                                                                    if (field617) {
                                                                        if (Statics.field2006 == Statics.field1824 && field750 != field595) {
                                                                            class303 var83 = Statics.field2006;
                                                                            byte var84 = 0;
                                                                            if (field672 == 1 && var83.field3486 == 206) {
                                                                                var84 = 1;
                                                                            }
                                                                            if (var83.field3483[field750] <= 0) {
                                                                                var84 = 0;
                                                                            }
                                                                            int var85 = method3618(var83);
                                                                            boolean var86 = (var85 >> 29 & 0x1) != 0;
                                                                            if (var86) {
                                                                                int var87 = field595;
                                                                                int var88 = field750;
                                                                                var83.field3483[var88] = var83.field3483[var87];
                                                                                var83.field3478[var88] = var83.field3478[var87];
                                                                                var83.field3483[var87] = -1;
                                                                                var83.field3478[var87] = 0;
                                                                            } else if (var84 == 1) {
                                                                                int var89 = field595;
                                                                                int var90 = field750;
                                                                                while (var89 != var90) {
                                                                                    if (var89 > var90) {
                                                                                        var83.method5503(var89 - 1, var89);
                                                                                        var89--;
                                                                                    } else if (var89 < var90) {
                                                                                        var83.method5503(var89 + 1, var89);
                                                                                        var89++;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var83.method5503(field750, field595);
                                                                            }
                                                                            class275 var91 = class275.method3314(class273.field3058, field636.field1373);
                                                                            var91.field3123.method7947(Statics.field2006.field3539);
                                                                            var91.field3123.method7746(var84);
                                                                            var91.field3123.method7755(field595);
                                                                            var91.field3123.method7775(field750);
                                                                            field636.method2540(var91);
                                                                        }
                                                                    } else if (this.method1140()) {
                                                                        this.method1607(field496, field615);
                                                                    } else if (field553 > 0) {
                                                                        int var92 = field496;
                                                                        int var93 = field615;
                                                                        class71 var94 = Statics.field1135;
                                                                        if (var94 != null) {
                                                                            method4872(var94.field886, var94.field881, var94.field880, var94.field883, var94.field884, var94.field885, var94.field890, var92, var93);
                                                                        }
                                                                        Statics.field1135 = null;
                                                                    }
                                                                    field698 = 10;
                                                                    class37.field234 = 0;
                                                                    Statics.field2006 = null;
                                                                } else if (field644 >= 5 && (class37.field241 > field496 + 5 || class37.field241 < field496 - 5 || class37.field242 > field615 + 5 || class37.field242 < field615 - 5)) {
                                                                    field617 = true;
                                                                }
                                                            }
                                                            if (class214.method3963()) {
                                                                int var95 = class214.field2467;
                                                                int var96 = class214.field2489;
                                                                class275 var97 = class275.method3314(class273.field3092, field636.field1373);
                                                                var97.field3123.method7698(5);
                                                                var97.field3123.method7755(Statics.field1754 + var96);
                                                                var97.field3123.method7858(field734.method3626(82) ? (field734.method3626(81) ? 2 : 1) : 0);
                                                                var97.field3123.method7931(Statics.field142 + var95);
                                                                field636.method2540(var97);
                                                                class214.method3964();
                                                                field515 = class37.field240;
                                                                field607 = class37.field250;
                                                                field609 = 1;
                                                                field762 = 0;
                                                                field747 = var95;
                                                                field748 = var96;
                                                            }
                                                            if (Statics.field2556 != var65) {
                                                                if (var65 != null) {
                                                                    method2867(var65);
                                                                }
                                                                if (Statics.field2556 != null) {
                                                                    method2867(Statics.field2556);
                                                                }
                                                            }
                                                            if (Statics.field2557 != var66 && field787 == field528) {
                                                                if (var66 != null) {
                                                                    method2867(var66);
                                                                }
                                                                if (Statics.field2557 != null) {
                                                                    method2867(Statics.field2557);
                                                                }
                                                            }
                                                            if (Statics.field2557 == null) {
                                                                if (field528 > 0) {
                                                                    field528--;
                                                                }
                                                            } else if (field528 < field787) {
                                                                field528++;
                                                                if (field787 == field528) {
                                                                    method2867(Statics.field2557);
                                                                }
                                                            }
                                                            if (field580 == 0) {
                                                                int var98 = Statics.field3404.field1163;
                                                                int var99 = Statics.field3404.field1138;
                                                                if (Statics.field169 - var98 < -500 || Statics.field169 - var98 > 500 || Statics.field1134 - var99 < -500 || Statics.field1134 - var99 > 500) {
                                                                    Statics.field169 = var98;
                                                                    Statics.field1134 = var99;
                                                                }
                                                                if (Statics.field169 != var98) {
                                                                    Statics.field169 += (var98 - Statics.field169) / 16;
                                                                }
                                                                if (Statics.field1134 != var99) {
                                                                    Statics.field1134 += (var99 - Statics.field1134) / 16;
                                                                }
                                                                int var100 = Statics.field169 >> 7;
                                                                int var101 = Statics.field1134 >> 7;
                                                                int var102 = method2836(Statics.field169, Statics.field1134, Statics.field478);
                                                                int var103 = 0;
                                                                if (var100 > 3 && var101 > 3 && var100 < 100 && var101 < 100) {
                                                                    for (int var104 = var100 - 4; var104 <= var100 + 4; var104++) {
                                                                        for (int var105 = var101 - 4; var105 <= var101 + 4; var105++) {
                                                                            int var106 = Statics.field478;
                                                                            if (var106 < 3 && (class79.field993[1][var104][var105] & 0x2) == 2) {
                                                                                var106++;
                                                                            }
                                                                            int var107 = var102 - class79.field998[var106][var104][var105];
                                                                            if (var107 > var103) {
                                                                                var103 = var107;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int var108 = var103 * 192;
                                                                if (var108 > 98048) {
                                                                    var108 = 98048;
                                                                }
                                                                if (var108 < 32768) {
                                                                    var108 = 32768;
                                                                }
                                                                if (var108 > field591) {
                                                                    field591 += (var108 - field591) / 24;
                                                                } else if (var108 < field591) {
                                                                    field591 += (var108 - field591) / 80;
                                                                }
                                                                Statics.field1870 = method2836(Statics.field3404.field1163, Statics.field3404.field1138, Statics.field478) - field581;
                                                            } else if (field580 == 1) {
                                                                method2787();
                                                                short var109 = -1;
                                                                if (field734.method3626(33)) {
                                                                    var109 = 0;
                                                                } else if (field734.method3626(49)) {
                                                                    var109 = 1024;
                                                                }
                                                                if (field734.method3626(48)) {
                                                                    if (var109 == 0) {
                                                                        var109 = 1792;
                                                                    } else if (var109 == 1024) {
                                                                        var109 = 1280;
                                                                    } else {
                                                                        var109 = 1536;
                                                                    }
                                                                } else if (field734.method3626(50)) {
                                                                    if (var109 == 0) {
                                                                        var109 = 256;
                                                                    } else if (var109 == 1024) {
                                                                        var109 = 768;
                                                                    } else {
                                                                        var109 = 512;
                                                                    }
                                                                }
                                                                byte var110 = 0;
                                                                if (field734.method3626(35)) {
                                                                    var110 = -1;
                                                                } else if (field734.method3626(51)) {
                                                                    var110 = 1;
                                                                }
                                                                int var111 = 0;
                                                                if (var109 >= 0 || var110 != 0) {
                                                                    int var112 = field734.method3626(81) ? field625 : field585;
                                                                    var111 = var112 * 16;
                                                                    field534 = var109;
                                                                    field584 = var110;
                                                                }
                                                                if (field582 < var111) {
                                                                    field582 += var111 / 8;
                                                                    if (field582 > var111) {
                                                                        field582 = var111;
                                                                    }
                                                                } else if (field582 > var111) {
                                                                    field582 = field582 * 9 / 10;
                                                                }
                                                                if (field582 > 0) {
                                                                    int var113 = field582 / 16;
                                                                    if (field534 >= 0) {
                                                                        int var114 = field534 - Statics.field2940 & 0x7FF;
                                                                        int var115 = class211.field2437[var114];
                                                                        int var116 = class211.field2438[var114];
                                                                        Statics.field169 += var113 * var115 / 65536;
                                                                        Statics.field1134 += var113 * var116 / 65536;
                                                                    }
                                                                    if (field584 != 0) {
                                                                        Statics.field1870 += field584 * var113;
                                                                        if (Statics.field1870 > 0) {
                                                                            Statics.field1870 = 0;
                                                                        }
                                                                    }
                                                                } else {
                                                                    field534 = -1;
                                                                    field584 = -1;
                                                                }
                                                                if (field734.method3626(13)) {
                                                                    method287();
                                                                }
                                                            }
                                                            if (class37.field246 == 4 && Statics.field1024) {
                                                                int var117 = class37.field242 - field744;
                                                                field577 = var117 * 2;
                                                                field744 = var117 == -1 || var117 == 1 ? class37.field242 : (field744 + class37.field242) / 2;
                                                                int var118 = field578 - class37.field241;
                                                                field576 = var118 * 2;
                                                                field578 = var118 == -1 || var118 == 1 ? class37.field241 : (field578 + class37.field241) / 2;
                                                            } else {
                                                                if (field734.method3626(96)) {
                                                                    field576 += (-24 - field576) / 2;
                                                                } else if (field734.method3626(97)) {
                                                                    field576 += (24 - field576) / 2;
                                                                } else {
                                                                    field576 /= 2;
                                                                }
                                                                if (field734.method3626(98)) {
                                                                    field577 += (12 - field577) / 2;
                                                                } else if (field734.method3626(99)) {
                                                                    field577 += (-12 - field577) / 2;
                                                                } else {
                                                                    field577 /= 2;
                                                                }
                                                                field744 = class37.field242;
                                                                field578 = class37.field241;
                                                            }
                                                            field530 = field576 / 2 + field530 & 0x7FF;
                                                            field619 += field577 / 2;
                                                            if (field619 < 128) {
                                                                field619 = 128;
                                                            }
                                                            if (field619 > 383) {
                                                                field619 = 383;
                                                            }
                                                            if (field759) {
                                                                method2414(Statics.field2697, Statics.field1345, Statics.field3403);
                                                                method2598(Statics.field3637, Statics.field172);
                                                                if (Statics.field2697 == Statics.field2566 && Statics.field170 == Statics.field1345 && Statics.field3704 == Statics.field3403 && Statics.field4582 == Statics.field3637 && Statics.field2940 == Statics.field172) {
                                                                    field759 = false;
                                                                    field758 = false;
                                                                    Statics.field12 = 0;
                                                                    Statics.field1432 = 0;
                                                                    Statics.field3327 = 0;
                                                                    Statics.field255 = 0;
                                                                    Statics.field1913 = 0;
                                                                    Statics.field1399 = 0;
                                                                    Statics.field4094 = 0;
                                                                    Statics.field3265 = 0;
                                                                    Statics.field63 = 0;
                                                                    Statics.field2830 = 0;
                                                                }
                                                            } else if (field758) {
                                                                int var119 = Statics.field3265 * 128 + 64;
                                                                int var120 = Statics.field63 * 128 + 64;
                                                                int var121 = method2836(var119, var120, Statics.field478) - Statics.field2830;
                                                                method2414(var119, var121, var120);
                                                                int var122 = Statics.field12 * 128 + 64;
                                                                int var123 = Statics.field1432 * 128 + 64;
                                                                int var124 = method2836(var122, var123, Statics.field478) - Statics.field3327;
                                                                int var125 = var122 - Statics.field2566;
                                                                int var126 = var124 - Statics.field170;
                                                                int var127 = var123 - Statics.field3704;
                                                                int var128 = (int) Math.sqrt((double) (var125 * var125 + var127 * var127));
                                                                int var129 = (int) (Math.atan2((double) var126, (double) var128) * 325.9490051269531D) & 0x7FF;
                                                                int var130 = (int) (Math.atan2((double) var125, (double) var127) * -325.9490051269531D) & 0x7FF;
                                                                method2598(var129, var130);
                                                            }
                                                            for (int var131 = 0; var131 < 5; var131++) {
                                                                var10002 = field764[var131]++;
                                                            }
                                                            Statics.field957.method2486();
                                                            int var132 = ++class37.field235 - 1;
                                                            int var134 = field228.method348();
                                                            if (var132 > 15000 && var134 > 15000) {
                                                                field554 = 250;
                                                                class37.field235 = 14500;
                                                                class275 var136 = class275.method3314(class273.field3085, field636.field1373);
                                                                field636.method2540(var136);
                                                            }
                                                            Statics.field2726.method1697();
                                                            field636.field1379++;
                                                            if (field636.field1379 > 50) {
                                                                class275 var137 = class275.method3314(class273.field3041, field636.field1373);
                                                                field636.method2540(var137);
                                                            }
                                                            try {
                                                                field636.method2543();
                                                            } catch (IOException var139) {
                                                                method4667();
                                                            }
                                                            return;
                                                        }
                                                        method6010(var82);
                                                    }
                                                }
                                                var80 = var79.field1053;
                                                if (var80.field3506 < 0) {
                                                    break;
                                                }
                                                var81 = class303.method4921(var80.field3618);
                                            } while (var81 == null || var81.field3624 == null || var80.field3506 >= var81.field3624.length || var81.field3624[var80.field3506] != var80);
                                            class68.method4883(var79);
                                        }
                                    }
                                    var77 = var76.field1053;
                                    if (var77.field3506 < 0) {
                                        break;
                                    }
                                    var78 = class303.method4921(var77.field3618);
                                } while (var78 == null || var78.field3624 == null || var77.field3506 >= var78.field3624.length || var78.field3624[var77.field3506] != var77);
                                class68.method4883(var76);
                            }
                        }
                        var74 = var73.field1053;
                        if (var74.field3506 < 0) {
                            break;
                        }
                        var75 = class303.method4921(var74.field3618);
                    } while (var75 == null || var75.field3624 == null || var74.field3506 >= var75.field3624.length || var75.field3624[var74.field3506] != var74);
                    class68.method4883(var73);
                }
            }
            class275 var4 = class275.method3314(class273.field3001, field636.field1373);
            var4.field3123.method7698(0);
            int var5 = var4.field3123.field4864;
            class38.method2160(var4.field3123);
            var4.field3123.method7745(var4.field3123.field4864 - var5);
            field636.method2540(var4);
        }
    }

    @ObfuscatedName("mk.gy(B)V")
    public static final void method6200() {
        if (Statics.field1077 != null) {
            Statics.field1077.method810();
        }
        if (Statics.field1264 != null) {
            Statics.field1264.method810();
        }
    }

    @ObfuscatedName("lj.gc(Lgg;IIII)V")
    public static void method5729(class197 arg0, int arg1, int arg2, int arg3) {
        if (field752 < 50 && Statics.field4526.method2312() != 0 && arg0.field2227 != null && arg1 < arg0.field2227.length) {
            method2453(arg0.field2227[arg1], arg2, arg3);
        }
    }

    @ObfuscatedName("ok.gt(Lgg;IIII)V")
    public static void method6864(class197 arg0, int arg1, int arg2, int arg3) {
        if (field752 >= 50 || Statics.field4526.method2312() == 0 || arg0.field2215 == null || !arg0.field2215.containsKey(arg1)) {
            return;
        }
        int var4 = (Integer) arg0.field2215.get(arg1);
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field753[field752] = var7;
        field754[field752] = var8;
        field755[field752] = 0;
        field757[field752] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field592[field752] = (var10 << 16) + (var11 << 8) + var9;
        field752++;
    }

    @ObfuscatedName("cv.gb(IIII)V")
    public static void method2453(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        int var3 = arg0 >> 8;
        int var4 = arg0 >> 4 & 0x7;
        int var5 = arg0 & 0xF;
        field753[field752] = var3;
        field754[field752] = var4;
        field755[field752] = 0;
        field757[field752] = null;
        int var6 = (arg1 - 64) / 128;
        int var7 = (arg2 - 64) / 128;
        field592[field752] = (var6 << 16) + (var7 << 8) + var5;
        field752++;
    }

    @ObfuscatedName("jk.gk(IIIB)V")
    public static void method4858(int arg0, int arg1, int arg2) {
        if (Statics.field4526.method2328() == 0 || arg1 == 0 || field752 >= 50) {
            return;
        }
        field753[field752] = arg0;
        field754[field752] = arg1;
        field755[field752] = arg2;
        field757[field752] = null;
        field592[field752] = 0;
        field752++;
    }

    @ObfuscatedName("as.ge(II)V")
    public static void method697(int arg0) {
        if (arg0 == -1 && !field639) {
            Statics.field3293.method5029();
            class284.field3294 = 1;
            Statics.field124 = null;
        } else if (arg0 != -1 && field606 != arg0 && Statics.field4526.method2292() != 0 && !field639) {
            class328 var1 = Statics.field272;
            int var2 = Statics.field4526.method2292();
            class284.field3294 = 1;
            Statics.field124 = var1;
            Statics.field3295 = arg0;
            Statics.field3296 = 0;
            Statics.field1364 = var2;
            Statics.field4191 = false;
            Statics.field110 = 2;
        }
        field606 = arg0;
    }

    @ObfuscatedName("gn.gx(IIB)V")
    public static void method3788(int arg0, int arg1) {
        if (Statics.field4526.method2292() != 0 && arg0 != -1) {
            class284.method261(Statics.field33, arg0, 0, Statics.field4526.method2292(), false);
            field639 = true;
        }
    }

    @ObfuscatedName("bl.gm(I)V")
    public static final void method1050() {
        if (!Statics.field1407) {
            return;
        }
        if (Statics.field889 != null) {
            Statics.field889.method6768();
        }
        method2379();
        Statics.field1407 = false;
    }

    @ObfuscatedName("em.gp(Lkn;III)V")
    public static final void method2946(class303 arg0, int arg1, int arg2) {
        if (field567 != 0 && field567 != 3 || field642 || !(class37.field234 == 1 || !Statics.field1024 && class37.field234 == 4)) {
            return;
        }
        class292 var3 = arg0.method5511(true);
        if (var3 == null) {
            return;
        }
        int var4 = class37.field240 - arg1;
        int var5 = class37.field250 - arg2;
        if (!var3.method5133(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3385 / 2;
        int var7 = var5 - var3.field3383 / 2;
        int var8 = field530 & 0x7FF;
        int var9 = class211.field2437[var8];
        int var10 = class211.field2438[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field3404.field1163 + var11 >> 7;
        int var14 = Statics.field3404.field1138 - var12 >> 7;
        class275 var15 = class275.method3314(class273.field3010, field636.field1373);
        var15.field3123.method7698(18);
        var15.field3123.method7755(Statics.field1754 + var14);
        var15.field3123.method7858(field734.method3626(82) ? (field734.method3626(81) ? 2 : 1) : 0);
        var15.field3123.method7931(Statics.field142 + var13);
        var15.field3123.method7698(var6);
        var15.field3123.method7698(var7);
        var15.field3123.method7775(field530);
        var15.field3123.method7698(57);
        var15.field3123.method7698(0);
        var15.field3123.method7698(0);
        var15.field3123.method7698(89);
        var15.field3123.method7775(Statics.field3404.field1163);
        var15.field3123.method7775(Statics.field3404.field1138);
        var15.field3123.method7698(63);
        field636.method2540(var15);
        field747 = var13;
        field748 = var14;
    }

    @ObfuscatedName("ae.gq(Ljava/lang/String;I)V")
    public static final void method565(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field4526.method2279(!Statics.field4526.method2353());
            if (Statics.field4526.method2353()) {
                Statics.method666(99, "", "Roofs are now all hidden");
            } else {
                Statics.method666(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field4526.method2335();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field597 = !field597;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field655 = !field655;
        }
        if (field608 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field31.field4740 = !Statics.field31.field4740;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field4526.method2285(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field4526.method2285(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method4667();
            }
        }
        class275 var1 = class275.method3314(class273.field3021, field636.field1373);
        var1.field3123.method7698(arg0.length() + 1);
        var1.field3123.method7705(arg0);
        field636.method2540(var1);
    }

    @ObfuscatedName("cr.gg(IIII)V")
    public static final void method2414(int arg0, int arg1, int arg2) {
        if (Statics.field2566 < arg0) {
            Statics.field2566 += Statics.field1399 * (arg0 - Statics.field2566) / 1000 + Statics.field4094;
            if (Statics.field2566 > arg0) {
                Statics.field2566 = arg0;
            }
        }
        if (Statics.field2566 > arg0) {
            Statics.field2566 -= Statics.field1399 * (Statics.field2566 - arg0) / 1000 + Statics.field4094;
            if (Statics.field2566 < arg0) {
                Statics.field2566 = arg0;
            }
        }
        if (Statics.field170 < arg1) {
            Statics.field170 += Statics.field1399 * (arg1 - Statics.field170) / 1000 + Statics.field4094;
            if (Statics.field170 > arg1) {
                Statics.field170 = arg1;
            }
        }
        if (Statics.field170 > arg1) {
            Statics.field170 -= Statics.field1399 * (Statics.field170 - arg1) / 1000 + Statics.field4094;
            if (Statics.field170 < arg1) {
                Statics.field170 = arg1;
            }
        }
        if (Statics.field3704 < arg2) {
            Statics.field3704 += Statics.field1399 * (arg2 - Statics.field3704) / 1000 + Statics.field4094;
            if (Statics.field3704 > arg2) {
                Statics.field3704 = arg2;
            }
        }
        if (Statics.field3704 > arg2) {
            Statics.field3704 -= Statics.field1399 * (Statics.field3704 - arg2) / 1000 + Statics.field4094;
            if (Statics.field3704 < arg2) {
                Statics.field3704 = arg2;
            }
        }
    }

    @ObfuscatedName("de.gh(III)V")
    public static final void method2598(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field4582 < arg0) {
            Statics.field4582 += Statics.field1913 * (arg0 - Statics.field4582) / 1000 + Statics.field255;
            if (Statics.field4582 > arg0) {
                Statics.field4582 = arg0;
            }
        }
        if (Statics.field4582 > arg0) {
            Statics.field4582 -= Statics.field1913 * (Statics.field4582 - arg0) / 1000 + Statics.field255;
            if (Statics.field4582 < arg0) {
                Statics.field4582 = arg0;
            }
        }
        int var2 = arg1 - Statics.field2940;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field2940 += Statics.field1913 * var2 / 1000 + Statics.field255;
            Statics.field2940 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field2940 -= Statics.field1913 * -var2 / 1000 + Statics.field255;
            Statics.field2940 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field2940;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field2940 = arg1;
        }
    }

    @ObfuscatedName("y.gf(Lcl;II)V")
    public static final void method25(class91 arg0, int arg1) {
        if (arg0.field1193 >= field503) {
            method6001(arg0);
        } else if (arg0.field1194 >= field503) {
            method4120(arg0);
        } else {
            arg0.field1175 = arg0.field1159;
            if (arg0.field1207 == 0) {
                arg0.field1173 = 0;
            } else {
                label379: {
                    if (arg0.field1188 != -1 && arg0.field1140 == 0) {
                        class197 var2 = class197.method3143(arg0.field1188);
                        if (arg0.field1212 > 0 && var2.field2222 == 0) {
                            arg0.field1173++;
                            break label379;
                        }
                        if (arg0.field1212 <= 0 && var2.field2212 == 0) {
                            arg0.field1173++;
                            break label379;
                        }
                    }
                    int var3 = arg0.field1163;
                    int var4 = arg0.field1138;
                    int var5 = arg0.field1197[arg0.field1207 - 1] * 128 + arg0.field1202 * 64;
                    int var6 = arg0.field1209[arg0.field1207 - 1] * 128 + arg0.field1202 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field1196 = 1280;
                        } else if (var4 > var6) {
                            arg0.field1196 = 1792;
                        } else {
                            arg0.field1196 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field1196 = 768;
                        } else if (var4 > var6) {
                            arg0.field1196 = 256;
                        } else {
                            arg0.field1196 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field1196 = 1024;
                    } else if (var4 > var6) {
                        arg0.field1196 = 0;
                    }
                    class203 var7 = arg0.field1139[arg0.field1207 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field1196 - arg0.field1162 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field1147;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field1146;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field1149;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field1148;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field1146;
                        }
                        arg0.field1175 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class96) {
                            var11 = ((class96) arg0).field1267.field1997;
                        }
                        if (var11) {
                            if (arg0.field1196 != arg0.field1162 && arg0.field1171 == -1 && arg0.field1206 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field1207 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field1207 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field1173 > 0 && arg0.field1207 > 1) {
                                var10 = 8;
                                arg0.field1173--;
                            }
                        } else {
                            if (arg0.field1207 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field1207 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field1173 > 0 && arg0.field1207 > 1) {
                                var10 = 8;
                                arg0.field1173--;
                            }
                        }
                        if (class203.field2285 == var7) {
                            var10 <<= 0x1;
                        } else if (class203.field2282 == var7) {
                            var10 >>= 0x1;
                        }
                        if (var10 >= 8) {
                            if (arg0.field1175 == arg0.field1146 && arg0.field1150 != -1) {
                                arg0.field1175 = arg0.field1150;
                            } else if (arg0.field1175 == arg0.field1147 && arg0.field1182 != -1) {
                                arg0.field1175 = arg0.field1182;
                            } else if (arg0.field1175 == arg0.field1148 && arg0.field1152 != -1) {
                                arg0.field1175 = arg0.field1152;
                            } else if (arg0.field1175 == arg0.field1149 && arg0.field1153 != -1) {
                                arg0.field1175 = arg0.field1153;
                            }
                        } else if (var10 <= 1) {
                            if (arg0.field1175 == arg0.field1146 && arg0.field1154 != -1) {
                                arg0.field1175 = arg0.field1154;
                            } else if (arg0.field1175 == arg0.field1147 && arg0.field1210 != -1) {
                                arg0.field1175 = arg0.field1210;
                            } else if (arg0.field1175 == arg0.field1148 && arg0.field1185 != -1) {
                                arg0.field1175 = arg0.field1185;
                            } else if (arg0.field1175 == arg0.field1149 && arg0.field1157 != -1) {
                                arg0.field1175 = arg0.field1157;
                            }
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field1163 += var10;
                                if (arg0.field1163 > var5) {
                                    arg0.field1163 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field1163 -= var10;
                                if (arg0.field1163 < var5) {
                                    arg0.field1163 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field1138 += var10;
                                if (arg0.field1138 > var6) {
                                    arg0.field1138 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field1138 -= var10;
                                if (arg0.field1138 < var6) {
                                    arg0.field1138 = var6;
                                }
                            }
                        }
                        if (arg0.field1163 == var5 && arg0.field1138 == var6) {
                            arg0.field1207--;
                            if (arg0.field1212 > 0) {
                                arg0.field1212--;
                            }
                        }
                    } else {
                        arg0.field1163 = var5;
                        arg0.field1138 = var6;
                        arg0.field1207--;
                        if (arg0.field1212 > 0) {
                            arg0.field1212--;
                        }
                    }
                }
            }
        }
        if (arg0.field1163 < 128 || arg0.field1138 < 128 || arg0.field1163 >= 13184 || arg0.field1138 >= 13184) {
            arg0.field1188 = -1;
            arg0.field1184 = -1;
            arg0.field1193 = 0;
            arg0.field1194 = 0;
            arg0.field1163 = arg0.field1197[0] * 128 + arg0.field1202 * 64;
            arg0.field1138 = arg0.field1209[0] * 128 + arg0.field1202 * 64;
            arg0.method2220();
        }
        if (Statics.field3404 == arg0 && (arg0.field1163 < 1536 || arg0.field1138 < 1536 || arg0.field1163 >= 11776 || arg0.field1138 >= 11776)) {
            arg0.field1188 = -1;
            arg0.field1184 = -1;
            arg0.field1193 = 0;
            arg0.field1194 = 0;
            arg0.field1163 = arg0.field1197[0] * 128 + arg0.field1202 * 64;
            arg0.field1138 = arg0.field1209[0] * 128 + arg0.field1202 * 64;
            arg0.method2220();
        }
        if (arg0.field1206 != 0) {
            if (arg0.field1171 != -1) {
                class91 var12 = null;
                int var13 = Statics.field973 ? 65536 : 32768;
                if (arg0.field1171 < var13) {
                    var12 = field760[arg0.field1171];
                } else if (arg0.field1171 >= var13) {
                    var12 = field621[arg0.field1171 - var13];
                }
                if (var12 != null) {
                    int var14 = arg0.field1163 - var12.field1163;
                    int var15 = arg0.field1138 - var12.field1138;
                    if (var14 != 0 || var15 != 0) {
                        arg0.field1196 = (int) (Math.atan2((double) var14, (double) var15) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1172) {
                    arg0.field1171 = -1;
                    arg0.field1172 = false;
                }
            }
            if (arg0.field1204 != -1 && (arg0.field1207 == 0 || arg0.field1173 > 0)) {
                arg0.field1196 = arg0.field1204;
                arg0.field1204 = -1;
            }
            int var16 = arg0.field1196 - arg0.field1162 & 0x7FF;
            if (var16 == 0 && arg0.field1172) {
                arg0.field1171 = -1;
                arg0.field1172 = false;
            }
            if (var16 == 0) {
                arg0.field1205 = 0;
            } else {
                arg0.field1205++;
                if (var16 > 1024) {
                    arg0.field1162 -= arg0.field1174 ? var16 : arg0.field1206;
                    boolean var17 = true;
                    if (var16 < arg0.field1206 || var16 > 2048 - arg0.field1206) {
                        arg0.field1162 = arg0.field1196;
                        var17 = false;
                    }
                    if (!arg0.field1174 && arg0.field1175 == arg0.field1159 && (arg0.field1205 > 25 || var17)) {
                        if (arg0.field1144 == -1) {
                            arg0.field1175 = arg0.field1146;
                        } else {
                            arg0.field1175 = arg0.field1144;
                        }
                    }
                } else {
                    arg0.field1162 += arg0.field1174 ? var16 : arg0.field1206;
                    boolean var18 = true;
                    if (var16 < arg0.field1206 || var16 > 2048 - arg0.field1206) {
                        arg0.field1162 = arg0.field1196;
                        var18 = false;
                    }
                    if (!arg0.field1174 && arg0.field1175 == arg0.field1159 && (arg0.field1205 > 25 || var18)) {
                        if (arg0.field1142 == -1) {
                            arg0.field1175 = arg0.field1146;
                        } else {
                            arg0.field1175 = arg0.field1142;
                        }
                    }
                }
                arg0.field1162 &= 0x7FF;
                arg0.field1174 = false;
            }
        }
        method1118(arg0);
    }

    @ObfuscatedName("mo.gw(Lcl;S)V")
    public static final void method6001(class91 arg0) {
        int var1 = Math.max(1, arg0.field1193 - field503);
        int var2 = arg0.field1202 * 64 + arg0.field1151 * 128;
        int var3 = arg0.field1202 * 64 + arg0.field1191 * 128;
        arg0.field1163 += (var2 - arg0.field1163) / var1;
        arg0.field1138 += (var3 - arg0.field1138) / var1;
        arg0.field1173 = 0;
        arg0.field1196 = arg0.field1195;
    }

    @ObfuscatedName("hk.gr(Lcl;I)V")
    public static final void method4120(class91 arg0) {
        boolean var1 = field503 == arg0.field1194 || arg0.field1188 == -1 || arg0.field1140 != 0;
        if (!var1) {
            class197 var2 = class197.method3143(arg0.field1188);
            if (var2 == null || var2.method3576()) {
                var1 = true;
            } else {
                var1 = arg0.field1181 + 1 > var2.field2220[arg0.field1180];
            }
        }
        if (var1) {
            int var3 = arg0.field1194 - arg0.field1193;
            int var4 = field503 - arg0.field1193;
            int var5 = arg0.field1202 * 64 + arg0.field1151 * 128;
            int var6 = arg0.field1202 * 64 + arg0.field1191 * 128;
            int var7 = arg0.field1202 * 64 + arg0.field1190 * 128;
            int var8 = arg0.field1202 * 64 + arg0.field1189 * 128;
            arg0.field1163 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1138 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1173 = 0;
        arg0.field1196 = arg0.field1195;
        arg0.field1162 = arg0.field1196;
    }

    @ObfuscatedName("bv.gv(Lcl;I)V")
    public static final void method1118(class91 arg0) {
        arg0.field1141 = false;
        if (arg0.field1175 != -1) {
            class197 var1 = class197.method3143(arg0.field1175);
            if (var1 == null) {
                arg0.field1175 = -1;
            } else if (!var1.method3576() && var1.field2218 != null) {
                arg0.field1177++;
                if (arg0.field1176 < var1.field2218.length && arg0.field1177 > var1.field2220[arg0.field1176]) {
                    arg0.field1177 = 1;
                    arg0.field1176++;
                    method5729(var1, arg0.field1176, arg0.field1163, arg0.field1138);
                }
                if (arg0.field1176 >= var1.field2218.length) {
                    if (var1.field2232 > 0) {
                        arg0.field1176 -= var1.field2232;
                        if (var1.field2228) {
                            arg0.field1161++;
                        }
                        if (arg0.field1176 < 0 || arg0.field1176 >= var1.field2218.length || var1.field2228 && arg0.field1161 >= var1.field2229) {
                            arg0.field1177 = 0;
                            arg0.field1176 = 0;
                            arg0.field1161 = 0;
                        }
                    } else {
                        arg0.field1177 = 0;
                        arg0.field1176 = 0;
                    }
                    method5729(var1, arg0.field1176, arg0.field1163, arg0.field1138);
                }
            } else if (var1.method3576()) {
                arg0.field1176++;
                int var2 = var1.method3566();
                if (arg0.field1176 < var2) {
                    method6864(var1, arg0.field1176, arg0.field1163, arg0.field1138);
                } else {
                    if (var1.field2232 > 0) {
                        arg0.field1176 -= var1.field2232;
                        if (var1.field2228) {
                            arg0.field1161++;
                        }
                        if (arg0.field1176 < 0 || arg0.field1176 >= var2 || var1.field2228 && arg0.field1161 >= var1.field2229) {
                            arg0.field1176 = 0;
                            arg0.field1177 = 0;
                            arg0.field1161 = 0;
                        }
                    } else {
                        arg0.field1177 = 0;
                        arg0.field1176 = 0;
                    }
                    method6864(var1, arg0.field1176, arg0.field1163, arg0.field1138);
                }
            } else {
                arg0.field1175 = -1;
            }
        }
        if (arg0.field1184 != -1 && field503 >= arg0.field1187) {
            if (arg0.field1192 < 0) {
                arg0.field1192 = 0;
            }
            int var3 = class187.method710(arg0.field1184).field2015;
            if (var3 == -1) {
                arg0.field1184 = -1;
            } else {
                class197 var4 = class197.method3143(var3);
                if (var4 != null && var4.field2218 != null && !var4.method3576()) {
                    arg0.field1143++;
                    if (arg0.field1192 < var4.field2218.length && arg0.field1143 > var4.field2220[arg0.field1192]) {
                        arg0.field1143 = 1;
                        arg0.field1192++;
                        method5729(var4, arg0.field1192, arg0.field1163, arg0.field1138);
                    }
                    if (arg0.field1192 >= var4.field2218.length && (arg0.field1192 < 0 || arg0.field1192 >= var4.field2218.length)) {
                        arg0.field1184 = -1;
                    }
                } else if (var4.method3576()) {
                    arg0.field1192++;
                    int var5 = var4.method3566();
                    if (arg0.field1192 < var5) {
                        method6864(var4, arg0.field1192, arg0.field1163, arg0.field1138);
                    } else if (arg0.field1192 < 0 || arg0.field1192 >= var5) {
                        arg0.field1184 = -1;
                    }
                } else {
                    arg0.field1184 = -1;
                }
            }
        }
        if (arg0.field1188 != -1 && arg0.field1140 <= 1) {
            class197 var6 = class197.method3143(arg0.field1188);
            if (var6.field2222 == 1 && arg0.field1212 > 0 && arg0.field1193 <= field503 && arg0.field1194 < field503) {
                arg0.field1140 = 1;
                return;
            }
        }
        if (arg0.field1188 != -1 && arg0.field1140 == 0) {
            class197 var7 = class197.method3143(arg0.field1188);
            if (var7 == null) {
                arg0.field1188 = -1;
            } else if (!var7.method3576() && var7.field2218 != null) {
                arg0.field1181++;
                if (arg0.field1180 < var7.field2218.length && arg0.field1181 > var7.field2220[arg0.field1180]) {
                    arg0.field1181 = 1;
                    arg0.field1180++;
                    method5729(var7, arg0.field1180, arg0.field1163, arg0.field1138);
                }
                if (arg0.field1180 >= var7.field2218.length) {
                    arg0.field1180 -= var7.field2232;
                    arg0.field1211++;
                    if (arg0.field1211 >= var7.field2229) {
                        arg0.field1188 = -1;
                    } else if (arg0.field1180 >= 0 && arg0.field1180 < var7.field2218.length) {
                        method5729(var7, arg0.field1180, arg0.field1163, arg0.field1138);
                    } else {
                        arg0.field1188 = -1;
                    }
                }
                arg0.field1141 = var7.field2225;
            } else if (var7.method3576()) {
                arg0.field1180++;
                int var8 = var7.method3566();
                if (arg0.field1180 < var8) {
                    method6864(var7, arg0.field1180, arg0.field1163, arg0.field1138);
                } else {
                    arg0.field1180 -= var7.field2232;
                    arg0.field1211++;
                    if (arg0.field1211 >= var7.field2229) {
                        arg0.field1188 = -1;
                    } else if (arg0.field1180 >= 0 && arg0.field1180 < var8) {
                        method6864(var7, arg0.field1180, arg0.field1163, arg0.field1138);
                    } else {
                        arg0.field1188 = -1;
                    }
                }
            } else {
                arg0.field1188 = -1;
            }
        }
        if (arg0.field1140 > 0) {
            arg0.field1140--;
        }
    }

    @ObfuscatedName("iz.go(S)V")
    public static void method4715() {
        if (Statics.field31 != null) {
            Statics.field31.method7234(Statics.field478, (Statics.field3404.field1163 >> 7) + Statics.field142, (Statics.field3404.field1138 >> 7) + Statics.field1754, false);
            Statics.field31.method7238();
        }
    }

    @ObfuscatedName("pz.gi(Lco;III)V")
    public static void method7425(class89 arg0, int arg1, int arg2) {
        if (arg0.field1188 == arg1 && arg1 != -1) {
            int var3 = class197.method3143(arg1).field2233;
            if (var3 == 1) {
                arg0.field1180 = 0;
                arg0.field1181 = 0;
                arg0.field1140 = arg2;
                arg0.field1211 = 0;
            }
            if (var3 == 2) {
                arg0.field1211 = 0;
            }
        } else if (arg1 == -1 || arg0.field1188 == -1 || class197.method3143(arg1).field2226 >= class197.method3143(arg0.field1188).field2226) {
            arg0.field1188 = arg1;
            arg0.field1180 = 0;
            arg0.field1181 = 0;
            arg0.field1140 = arg2;
            arg0.field1211 = 0;
            arg0.field1212 = arg0.field1207;
        }
    }

    @ObfuscatedName("b.gz(I)I")
    public static int method163() {
        return field727 ? 2 : 1;
    }

    @ObfuscatedName("fh.gs(II)V")
    public static void method3081(int arg0) {
        field588 = 0L;
        if (arg0 >= 2) {
            field727 = true;
        } else {
            field727 = false;
        }
        if (method163() == 1) {
            Statics.field1599.method571(765, 503);
        } else {
            Statics.field1599.method571(7680, 2160);
        }
        if (field624 >= 25) {
            method58();
        }
    }

    @ObfuscatedName("r.gn(I)V")
    public static void method58() {
        class275 var0 = class275.method3314(class273.field3059, field636.field1373);
        var0.field3123.method7698(method163());
        var0.field3123.method7775(Statics.field223);
        var0.field3123.method7775(Statics.field59);
        field636.method2540(var0);
    }

    @ObfuscatedName("client.m(I)V")
    public final void method658() {
        field588 = class280.method2629() + 500L;
        this.method1319();
        if (field751 != -1) {
            this.method1142(true);
        }
    }

    @ObfuscatedName("client.gd(I)V")
    public void method1319() {
        int var1 = Statics.field223;
        int var2 = Statics.field59;
        if (this.field201 < var1) {
            int var3 = this.field201;
        }
        if (this.field209 < var2) {
            int var4 = this.field209;
        }
        if (Statics.field4526 != null) {
            try {
                class28.method397(Statics.field1599, "resize", new Object[] { method163() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.ho(B)V")
    public final void method1135() {
        if (field751 != -1) {
            method6578(field751);
        }
        for (int var1 = 0; var1 < field716; var1++) {
            if (field718[var1]) {
                field719[var1] = true;
            }
            field658[var1] = field718[var1];
            field718[var1] = false;
        }
        field740 = field503;
        field656 = -1;
        field657 = -1;
        Statics.field1824 = null;
        if (field751 != -1) {
            field716 = 0;
            method440(field751, 0, 0, Statics.field223, Statics.field59, 0, 0, -1);
        }
        class473.method8077();
        if (field610) {
            if (field609 == 1) {
                Statics.field2262[field762 / 100].method8174(field515 - 8, field607 - 8);
            }
            if (field609 == 2) {
                Statics.field2262[field762 / 100 + 4].method8174(field515 - 8, field607 - 8);
            }
        }
        if (field642) {
            int var2 = Statics.field1330;
            int var3 = Statics.field1394;
            int var4 = Statics.field1857;
            int var5 = Statics.field2962;
            int var6 = 6116423;
            class473.method8022(var2, var3, var4, var5, var6);
            class473.method8022(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class473.method8026(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field1422.method6429(class323.field3932, var2 + 3, var3 + 14, var6, -1);
            int var7 = class37.field241;
            int var8 = class37.field242;
            for (int var9 = 0; var9 < field553; var9++) {
                int var10 = (field553 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field1422.method6429(method4111(var9), var2 + 3, var10, var11, 0);
            }
            method2630(Statics.field1330, Statics.field1394, Statics.field1857, Statics.field2962);
        } else if (field656 != -1) {
            method4298(field656, field657);
        }
        if (field725 == 3) {
            for (int var12 = 0; var12 < field716; var12++) {
                if (field658[var12]) {
                    class473.method8021(field721[var12], field722[var12], field568[var12], field516[var12], 16711935, 128);
                } else if (field719[var12]) {
                    class473.method8021(field721[var12], field722[var12], field568[var12], field516[var12], 16711680, 128);
                }
            }
        }
        Statics.method1104(Statics.field478, Statics.field3404.field1163, Statics.field3404.field1138, field559);
        field559 = 0;
    }

    @ObfuscatedName("ea.hp(Ljava/lang/String;ZB)V")
    public static final void method2870(String arg0, boolean arg1) {
        if (!field620) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field4239.method6417(arg0, 250);
        int var6 = Statics.field4239.method6423(arg0, 250) * 13;
        class473.method8022(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class473.method8026(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field4239.method6424(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method5865(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3.method476(0, 0);
        } else {
            method2630(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("i.hm(IIIII)V")
    public static final void method299(int arg0, int arg1, int arg2, int arg3) {
        field603++;
        if (Statics.field3404.field1163 >> 7 == field747 && Statics.field3404.field1138 >> 7 == field748) {
            field747 = 0;
        }
        method6003();
        if (field633 >= 0 && field621[field633] != null) {
            method285(field621[field633], false);
        }
        method5702(true);
        int var4 = class103.field1317;
        int[] var5 = class103.field1318;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field633 != var5[var6] && field622 != var5[var6]) {
                method285(field621[var5[var6]], true);
            }
        }
        method5702(false);
        method95();
        method3250();
        method688(arg0, arg1, arg2, arg3, true);
        int var7 = field773;
        int var8 = field492;
        int var9 = field775;
        int var10 = field536;
        class473.method8015(var7, var8, var7 + var9, var8 + var10);
        class211.method3802();
        int var11 = field619;
        if (field591 / 256 > var11) {
            var11 = field591 / 256;
        }
        if (field557[4] && field666[4] + 128 > var11) {
            var11 = field666[4] + 128;
        }
        int var12 = field530 & 0x7FF;
        method2371(Statics.field169, Statics.field1870, Statics.field1134, var11, var12, method3351(var11), var10);
        int var13;
        if (field758) {
            var13 = method4289();
        } else {
            var13 = Statics.method5778();
        }
        int var14 = Statics.field2566;
        int var15 = Statics.field170;
        int var16 = Statics.field3704;
        int var17 = Statics.field4582;
        int var18 = Statics.field2940;
        for (int var19 = 0; var19 < 5; var19++) {
            if (field557[var19]) {
                int var20 = (int) (Math.random() * (double) (field761[var19] * 2 + 1) - (double) field761[var19] + Math.sin((double) field763[var19] / 100.0D * (double) field764[var19]) * (double) field666[var19]);
                if (var19 == 0) {
                    Statics.field2566 += var20;
                }
                if (var19 == 1) {
                    Statics.field170 += var20;
                }
                if (var19 == 2) {
                    Statics.field3704 += var20;
                }
                if (var19 == 3) {
                    Statics.field2940 = Statics.field2940 + var20 & 0x7FF;
                }
                if (var19 == 4) {
                    Statics.field4582 += var20;
                    if (Statics.field4582 < 128) {
                        Statics.field4582 = 128;
                    }
                    if (Statics.field4582 > 383) {
                        Statics.field4582 = 383;
                    }
                }
            }
        }
        int var21 = class37.field241;
        int var22 = class37.field242;
        if (class37.field234 != 0) {
            var21 = class37.field240;
            var22 = class37.field250;
        }
        if (var21 >= var7 && var21 < var7 + var9 && var22 >= var8 && var22 < var8 + var10) {
            int var23 = var21 - var7;
            int var24 = var22 - var8;
            class222.field2670 = var23;
            class222.field2671 = var24;
            class222.field2681 = true;
            class222.field2674 = 0;
            class222.field2677 = false;
        } else {
            class222.field2681 = false;
            class222.field2674 = 0;
        }
        method6200();
        class473.method8022(var7, var8, var9, var10, 0);
        method6200();
        int var25 = class211.field2423;
        class211.field2423 = field777;
        Statics.field1615.method4099(Statics.field2566, Statics.field170, Statics.field3704, Statics.field4582, Statics.field2940, var13);
        class211.field2423 = var25;
        method6200();
        Statics.field1615.method3938();
        method2498(var7, var8, var9, var10);
        if (field510 == 2) {
            method3922((field513 - Statics.field142 << 7) + field724, (field514 - Statics.field1754 << 7) + field542, field771 * 2);
            if (field667 > -1 && field503 % 20 < 10) {
                Statics.field1780[0].method8174(field667 + var7 - 12, field605 + var8 - 28);
            }
        }
        ((class219) Statics.field2422).method4129(field559);
        method657();
        Statics.field2566 = var14;
        Statics.field170 = var15;
        Statics.field3704 = var16;
        Statics.field4582 = var17;
        Statics.field2940 = var18;
        if (field686) {
            byte var26 = 0;
            int var27 = class331.field4169 + class331.field4167 + var26;
            if (var27 == 0) {
                field686 = false;
            }
        }
        if (field686) {
            class473.method8022(var7, var8, var9, var10, 0);
            method2870(class323.field3777, false);
        }
    }

    @ObfuscatedName("ap.hh(IIIIZI)V")
    public static final void method688(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field765;
        } else if (var5 >= 100) {
            var6 = field650;
        } else {
            var6 = (field650 - field765) * var5 / 100 + field765;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field563) {
            short var8 = field563;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field770) {
                var6 = field770;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class473.method8077();
                    class473.method8022(arg0, arg1, var10, arg3, -16777216);
                    class473.method8022(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field772) {
            short var11 = field772;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field602) {
                var6 = field602;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class473.method8077();
                    class473.method8022(arg0, arg1, arg2, var13, -16777216);
                    class473.method8022(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field777 = arg3 * var6 / 334;
        if (field775 != arg2 || field536 != arg3) {
            method5744(arg2, arg3);
        }
        field773 = arg0;
        field492 = arg1;
        field775 = arg2;
        field536 = arg3;
    }

    @ObfuscatedName("mo.hv(B)V")
    public static void method6003() {
        if (field597) {
            method285(Statics.field3404, false);
        }
    }

    @ObfuscatedName("q.hf(Lco;ZI)V")
    public static void method285(class89 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2165() || arg0.field1111) {
            return;
        }
        arg0.field1093 = false;
        if ((field494 && class103.field1317 > 50 || class103.field1317 > 200) && arg1 && arg0.field1175 == arg0.field1159) {
            arg0.field1093 = true;
        }
        int var2 = arg0.field1163 >> 7;
        int var3 = arg0.field1138 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class222.method3289(0, 0, 0, false, arg0.field1113);
        if (arg0.field1104 != null && field503 >= arg0.field1099 && field503 < arg0.field1100) {
            arg0.field1093 = false;
            arg0.field1098 = method2836(arg0.field1163, arg0.field1138, Statics.field478);
            arg0.field1208 = field503;
            Statics.field1615.method3936(Statics.field478, arg0.field1163, arg0.field1138, arg0.field1098, 60, arg0, arg0.field1162, var4, arg0.field1105, arg0.field1106, arg0.field1107, arg0.field1097);
            return;
        }
        if ((arg0.field1163 & 0x7F) == 64 && (arg0.field1138 & 0x7F) == 64) {
            if (field603 == field713[var2][var3]) {
                return;
            }
            field713[var2][var3] = field603;
        }
        arg0.field1098 = method2836(arg0.field1163, arg0.field1138, Statics.field478);
        arg0.field1208 = field503;
        Statics.field1615.method3935(Statics.field478, arg0.field1163, arg0.field1138, arg0.field1098, 60, arg0, arg0.field1162, var4, arg0.field1141);
    }

    @ObfuscatedName("lc.hd(ZB)V")
    public static final void method5702(boolean arg0) {
        for (int var1 = 0; var1 < field549; var1++) {
            class96 var2 = field760[field550[var1]];
            if (var2 != null && var2.method2165() && var2.field1267.field1988 == arg0 && var2.field1267.method3255()) {
                int var3 = var2.field1163 >> 7;
                int var4 = var2.field1138 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1202 == 1 && (var2.field1163 & 0x7F) == 64 && (var2.field1138 & 0x7F) == 64) {
                        if (field603 == field713[var3][var4]) {
                            continue;
                        }
                        field713[var3][var4] = field603;
                    }
                    long var5 = class222.method3289(0, 0, 1, !var2.field1267.field1981, field550[var1]);
                    var2.field1208 = field503;
                    Statics.field1615.method3935(Statics.field478, var2.field1163, var2.field1138, method2836(var2.field1163 + (var2.field1202 * 64 - 64), var2.field1138 + (var2.field1202 * 64 - 64), Statics.field478), var2.field1202 * 64 - 64 + 60, var2, var2.field1162, var5, var2.field1141);
                }
            }
        }
    }

    @ObfuscatedName("s.hy(I)V")
    public static final void method95() {
        for (class74 var0 = (class74) field711.method6040(); var0 != null; var0 = (class74) field711.method6034()) {
            if (Statics.field478 != var0.field956 || field503 > var0.field939) {
                var0.method7170();
            } else if (field503 >= var0.field947) {
                if (var0.field942 > 0) {
                    class96 var1 = field760[var0.field942 - 1];
                    if (var1 != null && var1.field1163 >= 0 && var1.field1163 < 13312 && var1.field1138 >= 0 && var1.field1138 < 13312) {
                        var0.method2000(var1.field1163, var1.field1138, method2836(var1.field1163, var1.field1138, var0.field956) - var0.field940, field503);
                    }
                }
                if (var0.field942 < 0) {
                    int var2 = -var0.field942 - 1;
                    class89 var3;
                    if (field622 == var2) {
                        var3 = Statics.field3404;
                    } else {
                        var3 = field621[var2];
                    }
                    if (var3 != null && var3.field1163 >= 0 && var3.field1163 < 13312 && var3.field1138 >= 0 && var3.field1138 < 13312) {
                        var0.method2000(var3.field1163, var3.field1138, method2836(var3.field1163, var3.field1138, var0.field956) - var0.field940, field503);
                    }
                }
                var0.method2001(field559);
                Statics.field1615.method3935(Statics.field478, (int) var0.field944, (int) var0.field933, (int) var0.field946, 60, var0, var0.field938, -1L, false);
            }
        }
    }

    @ObfuscatedName("gu.hj(B)V")
    public static final void method3250() {
        for (class69 var0 = (class69) field637.method6040(); var0 != null; var0 = (class69) field637.method6034()) {
            if (Statics.field478 != var0.field859 || var0.field866) {
                var0.method7170();
            } else if (field503 >= var0.field858) {
                var0.method1925(field559);
                if (var0.field866) {
                    var0.method7170();
                } else {
                    Statics.field1615.method3935(var0.field859, var0.field860, var0.field857, var0.field870, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("hn.hg(I)I")
    public static final int method4289() {
        if (Statics.field4526.method2353()) {
            return Statics.field478;
        } else {
            int var0 = method2836(Statics.field2566, Statics.field3704, Statics.field478);
            return var0 - Statics.field170 >= 800 || (class79.field993[Statics.field478][Statics.field2566 >> 7][Statics.field3704 >> 7] & 0x4) == 0 ? 3 : Statics.field478;
        }
    }

    @ObfuscatedName("po.hc(S)Lme;")
    public static class349 method7152() {
        return field623;
    }

    @ObfuscatedName("gg.ha(I)V")
    public static void method3571() {
        for (class199 var0 = (class199) field714.method6040(); var0 != null; var0 = (class199) field714.method6034()) {
            var0.method7170();
        }
    }

    @ObfuscatedName("mh.hz(Lgf;I)V")
    public static void method6010(class199 arg0) {
        if (arg0 == null || arg0.field2241 == null) {
            return;
        }
        if (arg0.field2241.field3506 >= 0) {
            class303 var1 = class303.method4921(arg0.field2241.field3618);
            if (var1 == null || var1.field3624 == null || var1.field3624.length == 0 || arg0.field2241.field3506 >= var1.field3624.length || var1.field3624[arg0.field2241.field3506] != arg0.field2241) {
                return;
            }
        }
        if (arg0.field2241.field3484 == 11 && arg0.field2240 == 0) {
            switch(arg0.field2241.method5522()) {
                case 0:
                    class33.method2572(arg0.field2241.method5524(), true, false);
                    break;
                case 1:
                    if (class304.method4746(method3618(arg0.field2241))) {
                        int[] var2 = arg0.field2241.method5585();
                        if (var2 != null) {
                            class275 var3 = class275.method3314(class273.field3104, field636.field1373);
                            var3.field3123.method7749(var2[2]);
                            var3.field3123.method7835(arg0.field2241.field3539);
                            var3.field3123.method7749(arg0.field2241.method5523());
                            var3.field3123.method7775(arg0.field2241.field3506);
                            var3.field3123.method7765(var2[1]);
                            var3.field3123.method7765(var2[0]);
                            field636.method2540(var3);
                        }
                    }
            }
        } else if (arg0.field2241.field3484 == 12) {
            class301 var4 = arg0.field2241.method5529();
            if (var4 != null && var4.method5272()) {
                switch(arg0.field2240) {
                    case 0:
                        field735.method3605(arg0.field2241);
                        var4.method5220(true);
                        var4.method5259(arg0.field2244, arg0.field2237, field734.method3626(82), field734.method3626(81));
                        break;
                    case 1:
                        var4.method5260(arg0.field2244, arg0.field2237);
                }
            }
        }
    }

    @ObfuscatedName("lk.hw(B)Z")
    public static boolean method5690() {
        return (field626 & 0x4) != 0;
    }

    @ObfuscatedName("qi.hr(I)Z")
    public static boolean method7575() {
        return (field626 & 0x8) != 0;
    }

    @ObfuscatedName("iz.hn(Lco;I)Z")
    public static boolean method4717(class89 arg0) {
        if (field626 == 0) {
            return false;
        } else if (Statics.field3404 == arg0) {
            return method7575();
        } else {
            boolean var1 = method5690();
            if (!var1) {
                boolean var2 = (field626 & 0x1) != 0;
                var1 = var2 && arg0.method2167();
            }
            boolean var3 = var1;
            if (!var1) {
                boolean var4 = (field626 & 0x2) != 0;
                var3 = var4 && arg0.method2196();
            }
            return var3;
        }
    }

    @ObfuscatedName("el.hu(Lcl;IIIIII)V")
    public static final void method2851(class91 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2165()) {
            return;
        }
        if (arg0 instanceof class96) {
            class185 var6 = ((class96) arg0).field1267;
            if (var6.field1977 != null) {
                var6 = var6.method3242();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class103.field1317;
        int[] var8 = class103.field1318;
        byte var9 = 0;
        if (arg1 < var7 && field503 == arg0.field1208 && method4717((class89) arg0)) {
            class89 var10 = (class89) arg0;
            if (arg1 < var7) {
                method2855(arg0, arg0.field1145 + 15);
                class369 var11 = (class369) field792.get(class437.field4752);
                byte var12 = 9;
                var11.method6507(var10.field1108.method8298(), field667 + arg2, field605 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field1170.method6141()) {
            method2855(arg0, arg0.field1145 + 15);
            for (class95 var14 = (class95) arg0.field1170.method6075(); var14 != null; var14 = (class95) arg0.field1170.method6077()) {
                class92 var15 = var14.method2383(field503);
                if (var15 != null) {
                    class181 var16 = var14.field1258;
                    class477 var17 = var16.method3202();
                    class477 var18 = var16.method3208();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field1926;
                    } else {
                        if (var16.field1917 * 2 < var18.field4966) {
                            var19 = var16.field1917;
                        }
                        var20 = var18.field4966 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field503 - var15.field1220;
                    int var24 = var15.field1216 * var20 / var16.field1926;
                    int var27;
                    if (var15.field1217 > var23) {
                        int var25 = var16.field1927 == 0 ? 0 : var23 / var16.field1927 * var16.field1927;
                        int var26 = var15.field1214 * var20 / var16.field1926;
                        var27 = (var24 - var26) * var25 / var15.field1217 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1217 + var16.field1923 - var23;
                        if (var16.field1921 >= 0) {
                            var21 = (var28 << 8) / (var16.field1923 - var16.field1921);
                        }
                    }
                    if (var15.field1216 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field667 > -1) {
                            int var34 = field667 + arg2 - (var20 >> 1);
                            int var35 = field605 + arg3 - var13;
                            class473.method8022(var34, var35, var27, 5, 65280);
                            class473.method8022(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field4958;
                        var13 += var30;
                        int var31 = field667 + arg2 - (var20 >> 1);
                        int var32 = field605 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method8139(var33, var32, var21);
                            class473.method8086(var33, var32, var29 + var33, var30 + var32);
                            var18.method8139(var33, var32, var21);
                        } else {
                            var17.method8174(var33, var32);
                            class473.method8086(var33, var32, var29 + var33, var30 + var32);
                            var18.method8174(var33, var32);
                        }
                        class473.method8015(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method2378()) {
                    var14.method7170();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class89 var37 = (class89) arg0;
            if (var37.field1111) {
                return;
            }
            if (var37.field1092 != -1 || var37.field1091 != -1) {
                method2855(arg0, arg0.field1145 + 15);
                if (field667 > -1) {
                    if (var37.field1092 != -1) {
                        var36 += 25;
                        Statics.field2520[var37.field1092].method8174(field667 + arg2 - 12, field605 + arg3 - var36);
                    }
                    if (var37.field1091 != -1) {
                        var36 += 25;
                        Statics.field3266[var37.field1091].method8174(field667 + arg2 - 12, field605 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field510 == 10 && field512 == var8[arg1]) {
                method2855(arg0, arg0.field1145 + 15);
                if (field667 > -1) {
                    int var38 = Statics.field1780[1].field4958 + var36;
                    Statics.field1780[1].method8174(field667 + arg2 - 12, field605 + arg3 - var38);
                }
            }
        } else {
            class185 var39 = ((class96) arg0).field1267;
            if (var39.field1977 != null) {
                var39 = var39.method3242();
            }
            if (var39.field1991 >= 0 && var39.field1991 < Statics.field3266.length) {
                method2855(arg0, arg0.field1145 + 15);
                if (field667 > -1) {
                    Statics.field3266[var39.field1991].method8174(field667 + arg2 - 12, field605 + arg3 - 30);
                }
            }
            if (field510 == 1 && field737 == field550[arg1 - var7] && field503 % 20 < 10) {
                method2855(arg0, arg0.field1145 + 15);
                if (field667 > -1) {
                    Statics.field1780[0].method8174(field667 + arg2 - 12, field605 + arg3 - 28);
                }
            }
        }
        if (arg0.field1158 != null && (arg1 >= var7 || !arg0.field1156 && (field729 == 4 || !arg0.field1178 && (field729 == 0 || field729 == 3 || field729 == 1 && ((class89) arg0).method2167())))) {
            method2855(arg0, arg0.field1145);
            if (field667 > -1 && field519 < field593) {
                field517[field519] = Statics.field1422.method6447(arg0.field1158) / 2;
                field579[field519] = Statics.field1422.field4355;
                field594[field519] = field667;
                field766[field519] = field605;
                field598[field519] = arg0.field1137;
                field599[field519] = arg0.field1155;
                field507[field519] = arg0.field1179;
                field601[field519] = arg0.field1158;
                field519++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field1167[var40];
            int var42 = arg0.field1165[var40];
            class193 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field503) {
                    continue;
                }
                var43 = class193.method2979(arg0.field1165[var40]);
                var44 = var43.field2057;
                if (var43 != null && var43.field2078 != null) {
                    var43 = var43.method3368();
                    if (var43 == null) {
                        arg0.field1167[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field1168[var40];
            class193 var46 = null;
            if (var45 >= 0) {
                var46 = class193.method2979(var45);
                if (var46 != null && var46.field2078 != null) {
                    var46 = var46.method3368();
                }
            }
            if (var41 - var44 <= field503) {
                if (var43 == null) {
                    arg0.field1167[var40] = -1;
                } else {
                    method2855(arg0, arg0.field1145 / 2);
                    if (field667 > -1) {
                        boolean var47 = true;
                        if (var40 == 1) {
                            field605 -= 20;
                        }
                        if (var40 == 2) {
                            field667 -= 15;
                            field605 -= 10;
                        }
                        if (var40 == 3) {
                            field667 += 15;
                            field605 -= 10;
                        }
                        Object var48 = null;
                        Object var49 = null;
                        Object var50 = null;
                        Object var51 = null;
                        int var52 = 0;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        class477 var60 = null;
                        class477 var61 = null;
                        class477 var62 = null;
                        class477 var63 = null;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        class477 var73 = var43.method3393();
                        if (var73 != null) {
                            var52 = var73.field4966;
                            int var74 = var73.field4958;
                            if (var74 > var72) {
                                var72 = var74;
                            }
                            var56 = var73.field4961;
                        }
                        class477 var75 = var43.method3383();
                        if (var75 != null) {
                            var53 = var75.field4966;
                            int var76 = var75.field4958;
                            if (var76 > var72) {
                                var72 = var76;
                            }
                            var57 = var75.field4961;
                        }
                        class477 var77 = var43.method3375();
                        if (var77 != null) {
                            var54 = var77.field4966;
                            int var78 = var77.field4958;
                            if (var78 > var72) {
                                var72 = var78;
                            }
                            var58 = var77.field4961;
                        }
                        class477 var79 = var43.method3402();
                        if (var79 != null) {
                            var55 = var79.field4966;
                            int var80 = var79.field4958;
                            if (var80 > var72) {
                                var72 = var80;
                            }
                            var59 = var79.field4961;
                        }
                        if (var46 != null) {
                            var60 = var46.method3393();
                            if (var60 != null) {
                                var64 = var60.field4966;
                                int var81 = var60.field4958;
                                if (var81 > var72) {
                                    var72 = var81;
                                }
                                var68 = var60.field4961;
                            }
                            var61 = var46.method3383();
                            if (var61 != null) {
                                var65 = var61.field4966;
                                int var82 = var61.field4958;
                                if (var82 > var72) {
                                    var72 = var82;
                                }
                                var69 = var61.field4961;
                            }
                            var62 = var46.method3375();
                            if (var62 != null) {
                                var66 = var62.field4966;
                                int var83 = var62.field4958;
                                if (var83 > var72) {
                                    var72 = var83;
                                }
                                var70 = var62.field4961;
                            }
                            var63 = var46.method3402();
                            if (var63 != null) {
                                var67 = var63.field4966;
                                int var84 = var63.field4958;
                                if (var84 > var72) {
                                    var72 = var84;
                                }
                                var71 = var63.field4961;
                            }
                        }
                        class365 var85 = var43.method3377();
                        if (var85 == null) {
                            var85 = Statics.field4271;
                        }
                        class365 var86;
                        if (var46 == null) {
                            var86 = Statics.field4271;
                        } else {
                            var86 = var46.method3377();
                            if (var86 == null) {
                                var86 = Statics.field4271;
                            }
                        }
                        Object var87 = null;
                        String var88 = null;
                        boolean var89 = false;
                        int var90 = 0;
                        String var91 = var43.method3376(arg0.field1166[var40]);
                        int var92 = var85.method6447(var91);
                        if (var46 != null) {
                            var88 = var46.method3376(arg0.field1169[var40]);
                            var90 = var86.method6447(var88);
                        }
                        int var93 = 0;
                        int var94 = 0;
                        if (var53 > 0) {
                            if (var77 == null && var79 == null) {
                                var93 = 1;
                            } else {
                                var93 = var92 / var53 + 1;
                            }
                        }
                        if (var46 != null && var65 > 0) {
                            if (var62 == null && var63 == null) {
                                var94 = 1;
                            } else {
                                var94 = var90 / var65 + 1;
                            }
                        }
                        int var95 = 0;
                        int var96 = var95;
                        if (var52 > 0) {
                            var95 += var52;
                        }
                        var95 += 2;
                        int var97 = var95;
                        if (var54 > 0) {
                            var95 += var54;
                        }
                        int var98 = var95;
                        int var99 = var95;
                        int var101;
                        if (var53 > 0) {
                            int var100 = var53 * var93;
                            var101 = var95 + var100;
                            var99 = (var100 - var92) / 2 + var95;
                        } else {
                            var101 = var92 + var95;
                        }
                        int var102 = var101;
                        if (var55 > 0) {
                            var101 += var55;
                        }
                        int var103 = 0;
                        int var104 = 0;
                        int var105 = 0;
                        int var106 = 0;
                        int var107 = 0;
                        if (var46 != null) {
                            var101 += 2;
                            var103 = var101;
                            if (var64 > 0) {
                                var101 += var64;
                            }
                            var101 += 2;
                            var104 = var101;
                            if (var66 > 0) {
                                var101 += var66;
                            }
                            var105 = var101;
                            var107 = var101;
                            if (var65 > 0) {
                                int var108 = var65 * var94;
                                var101 += var108;
                                var107 += (var108 - var90) / 2;
                            } else {
                                var101 += var90;
                            }
                            var106 = var101;
                            if (var67 > 0) {
                                var101 += var67;
                            }
                        }
                        int var109 = arg0.field1167[var40] - field503;
                        int var110 = var43.field2075 - var43.field2075 * var109 / var43.field2057;
                        int var111 = var43.field2080 * var109 / var43.field2057 + -var43.field2080;
                        int var112 = field667 + arg2 - (var101 >> 1) + var110;
                        int var113 = field605 + arg3 - 12 + var111;
                        int var114 = var113;
                        int var115 = var72 + var113;
                        int var116 = var43.field2069 + var113 + 15;
                        int var117 = var116 - var85.field4356;
                        int var118 = var85.field4357 + var116;
                        if (var117 < var113) {
                            var114 = var117;
                        }
                        if (var118 > var115) {
                            var115 = var118;
                        }
                        int var119 = 0;
                        if (var46 != null) {
                            var119 = var46.field2069 + var113 + 15;
                            int var120 = var119 - var86.field4356;
                            int var121 = var86.field4357 + var119;
                            if (var120 < var114) {
                                ;
                            }
                            if (var121 > var115) {
                                ;
                            }
                        }
                        int var124 = 255;
                        if (var43.field2074 >= 0) {
                            var124 = (var109 << 8) / (var43.field2057 - var43.field2074);
                        }
                        if (var124 >= 0 && var124 < 255) {
                            if (var73 != null) {
                                var73.method8139(var96 + var112 - var56, var113, var124);
                            }
                            if (var77 != null) {
                                var77.method8139(var97 + var112 - var58, var113, var124);
                            }
                            if (var75 != null) {
                                for (int var125 = 0; var125 < var93; var125++) {
                                    var75.method8139(var53 * var125 + (var98 + var112 - var57), var113, var124);
                                }
                            }
                            if (var79 != null) {
                                var79.method8139(var102 + var112 - var59, var113, var124);
                            }
                            var85.method6421(var91, var99 + var112, var116, var43.field2066, 0, var124);
                            if (var46 != null) {
                                if (var60 != null) {
                                    var60.method8139(var103 + var112 - var68, var113, var124);
                                }
                                if (var62 != null) {
                                    var62.method8139(var104 + var112 - var70, var113, var124);
                                }
                                if (var61 != null) {
                                    for (int var126 = 0; var126 < var94; var126++) {
                                        var61.method8139(var65 * var126 + (var105 + var112 - var69), var113, var124);
                                    }
                                }
                                if (var63 != null) {
                                    var63.method8139(var106 + var112 - var71, var113, var124);
                                }
                                var86.method6421(var88, var107 + var112, var119, var46.field2066, 0, var124);
                            }
                        } else {
                            if (var73 != null) {
                                var73.method8174(var96 + var112 - var56, var113);
                            }
                            if (var77 != null) {
                                var77.method8174(var97 + var112 - var58, var113);
                            }
                            if (var75 != null) {
                                for (int var127 = 0; var127 < var93; var127++) {
                                    var75.method8174(var53 * var127 + (var98 + var112 - var57), var113);
                                }
                            }
                            if (var79 != null) {
                                var79.method8174(var102 + var112 - var59, var113);
                            }
                            var85.method6429(var91, var99 + var112, var116, var43.field2066 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var60 != null) {
                                    var60.method8174(var103 + var112 - var68, var113);
                                }
                                if (var62 != null) {
                                    var62.method8174(var104 + var112 - var70, var113);
                                }
                                if (var61 != null) {
                                    for (int var128 = 0; var128 < var94; var128++) {
                                        var61.method8174(var65 * var128 + (var105 + var112 - var69), var113);
                                    }
                                }
                                if (var63 != null) {
                                    var63.method8174(var106 + var112 - var71, var113);
                                }
                                var86.method6429(var88, var107 + var112, var119, var46.field2066 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.hl(IIIII)V")
    public static final void method2498(int arg0, int arg1, int arg2, int arg3) {
        field519 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class103.field1317;
        int[] var8 = class103.field1318;
        for (int var9 = 0; var9 < field549 + var7; var9++) {
            class91 var10;
            if (var9 < var7) {
                var10 = field621[var8[var9]];
                if (field633 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field3404 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field760[field550[var9 - var7]];
            }
            method2851(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field597 && var6 != -1) {
            method2851(Statics.field3404, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2851(field621[field633], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field519; var11++) {
            int var12 = field594[var11];
            int var13 = field766[var11];
            int var14 = field517[var11];
            int var15 = field579[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field766[var17] - field579[var17] && var13 - var15 < field766[var17] + 2 && var12 - var14 < field594[var17] + field517[var17] && var12 + var14 > field594[var17] - field517[var17] && field766[var17] - field579[var17] < var13) {
                        var13 = field766[var17] - field579[var17];
                        var16 = true;
                    }
                }
            }
            field667 = field594[var11];
            field605 = field766[var11] = var13;
            String var18 = field601[var11];
            if (field611 == 0) {
                int var19 = 16776960;
                if (field598[var11] < 6) {
                    var19 = field728[field598[var11]];
                }
                if (field598[var11] == 6) {
                    var19 = field603 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field598[var11] == 7) {
                    var19 = field603 % 20 < 10 ? 255 : 65535;
                }
                if (field598[var11] == 8) {
                    var19 = field603 % 20 < 10 ? 45056 : 8454016;
                }
                if (field598[var11] == 9) {
                    int var20 = 150 - field507[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field598[var11] == 10) {
                    int var21 = 150 - field507[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field598[var11] == 11) {
                    int var22 = 150 - field507[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field599[var11] == 0) {
                    Statics.field1422.method6507(var18, field667 + arg0, field605 + arg1, var19, 0);
                }
                if (field599[var11] == 1) {
                    Statics.field1422.method6426(var18, field667 + arg0, field605 + arg1, var19, 0, field603);
                }
                if (field599[var11] == 2) {
                    Statics.field1422.method6427(var18, field667 + arg0, field605 + arg1, var19, 0, field603);
                }
                if (field599[var11] == 3) {
                    Statics.field1422.method6428(var18, field667 + arg0, field605 + arg1, var19, 0, field603, 150 - field507[var11]);
                }
                if (field599[var11] == 4) {
                    int var23 = (150 - field507[var11]) * (Statics.field1422.method6447(var18) + 100) / 150;
                    class473.method8086(field667 + arg0 - 50, arg1, field667 + arg0 + 50, arg1 + arg3);
                    Statics.field1422.method6429(var18, field667 + arg0 + 50 - var23, field605 + arg1, var19, 0);
                    class473.method8015(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field599[var11] == 5) {
                    int var24 = 150 - field507[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class473.method8086(arg0, field605 + arg1 - Statics.field1422.field4355 - 1, arg0 + arg2, field605 + arg1 + 5);
                    Statics.field1422.method6507(var18, field667 + arg0, field605 + arg1 + var25, var19, 0);
                    class473.method8015(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1422.method6507(var18, field667 + arg0, field605 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ae.hi(I)V")
    public static final void method657() {
        field688 = 0;
        int var0 = (Statics.field3404.field1163 >> 7) + Statics.field142;
        int var1 = (Statics.field3404.field1138 >> 7) + Statics.field1754;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field688 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field688 = 1;
        }
        if (field688 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field688 = 0;
        }
    }

    @ObfuscatedName("eh.hs(Lcl;II)V")
    public static final void method2855(class91 arg0, int arg1) {
        method3922(arg0.field1163, arg0.field1138, arg1);
    }

    @ObfuscatedName("hv.ht(IIII)V")
    public static final void method3922(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field667 = -1;
            field605 = -1;
            return;
        }
        int var3 = method2836(arg0, arg1, Statics.field478) - arg2;
        int var4 = arg0 - Statics.field2566;
        int var5 = var3 - Statics.field170;
        int var6 = arg1 - Statics.field3704;
        int var7 = class211.field2437[Statics.field4582];
        int var8 = class211.field2438[Statics.field4582];
        int var9 = class211.field2437[Statics.field2940];
        int var10 = class211.field2438[Statics.field2940];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field667 = field777 * var11 / var15 + field775 / 2;
            field605 = field777 * var14 / var15 + field536 / 2;
        } else {
            field667 = -1;
            field605 = -1;
        }
    }

    @ObfuscatedName("en.he(IIII)I")
    public static final int method2836(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class79.field993[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class79.field998[var5][var3][var4] + class79.field998[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class79.field998[var5][var3][var4 + 1] + class79.field998[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ce.hb(IIIIIIII)V")
    public static final void method2371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field659 - field767) * var7 / 100 + field767;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class211.field2437[var11];
            int var17 = class211.field2438[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class211.field2437[var12];
            int var20 = class211.field2438[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        if (field758) {
            Statics.field2697 = arg0 - var13;
            Statics.field1345 = arg1 - var14;
            Statics.field3403 = arg2 - var15;
            Statics.field3637 = arg3;
            Statics.field172 = arg4;
        } else {
            Statics.field2566 = arg0 - var13;
            Statics.field170 = arg1 - var14;
            Statics.field3704 = arg2 - var15;
            Statics.field4582 = arg3;
            Statics.field2940 = arg4;
        }
        if (field580 == 1 && field608 >= 2 && field503 % 50 == 0 && (Statics.field169 >> 7 != Statics.field3404.field1163 >> 7 || Statics.field1134 >> 7 != Statics.field3404.field1138 >> 7)) {
            int var22 = Statics.field3404.field1112;
            int var23 = (Statics.field169 >> 7) + Statics.field142;
            int var24 = (Statics.field1134 >> 7) + Statics.field1754;
            Statics.method2868(var23, var24, var22, true);
        }
    }

    @ObfuscatedName("y.hx(ZLqk;I)V")
    public static final void method28(boolean arg0, class463 arg1) {
        field564 = arg0;
        if (!field564) {
            int var2 = arg1.method7796();
            int var3 = arg1.method7756();
            int var4 = arg1.method7716();
            Statics.field139 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field139[var5][var6] = arg1.method7720();
                }
            }
            Statics.field2275 = new int[var4];
            Statics.field1647 = new int[var4];
            Statics.field71 = new int[var4];
            Statics.field485 = new byte[var4][];
            Statics.field48 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field2275[var7] = var10;
                    Statics.field1647[var7] = Statics.field958.method5813("m" + var8 + "_" + var9);
                    Statics.field71[var7] = Statics.field958.method5813("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method3679(var2, var3, true);
            return;
        }
        boolean var11 = arg1.method7748() == 1;
        int var12 = arg1.method7716();
        int var13 = arg1.method7756();
        int var14 = arg1.method7716();
        arg1.method7664();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method7665(1);
                    if (var18 == 1) {
                        field565[var15][var16][var17] = arg1.method7665(26);
                    } else {
                        field565[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method7661();
        Statics.field139 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field139[var19][var20] = arg1.method7720();
            }
        }
        Statics.field2275 = new int[var14];
        Statics.field1647 = new int[var14];
        Statics.field71 = new int[var14];
        Statics.field485 = new byte[var14][];
        Statics.field48 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field565[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field2275[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field2275[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field1647[var21] = Statics.field958.method5813("m" + var30 + "_" + var31);
                            Statics.field71[var21] = Statics.field958.method5813("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method3679(var12, var13, !var11);
    }

    @ObfuscatedName("gr.hq(IIZI)V")
    public static final void method3679(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field4235 == arg0 && Statics.field3134 == arg1) {
            return;
        }
        Statics.field4235 = arg0;
        Statics.field3134 = arg1;
        method300(25);
        method2870(class323.field3777, true);
        int var3 = Statics.field142;
        int var4 = Statics.field1754;
        Statics.field142 = (arg0 - 6) * 8;
        Statics.field1754 = (arg1 - 6) * 8;
        int var5 = Statics.field142 - var3;
        int var6 = Statics.field1754 - var4;
        int var7 = Statics.field142;
        int var8 = Statics.field1754;
        for (int var9 = 0; var9 < 65536; var9++) {
            class96 var10 = field760[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1197[var11] -= var5;
                    var10.field1209[var11] -= var6;
                }
                var10.field1163 -= var5 * 128;
                var10.field1138 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class89 var13 = field621[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1197[var14] -= var5;
                    var13.field1209[var14] -= var6;
                }
                var13.field1163 -= var5 * 128;
                var13.field1138 -= var6 * 128;
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
                        field723[var25][var21][var22] = field723[var25][var23][var24];
                    } else {
                        field723[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class90 var26 = (class90) field635.method6040(); var26 != null; var26 = (class90) field635.method6034()) {
            var26.field1129 -= var5;
            var26.field1124 -= var6;
            if (var26.field1129 < 0 || var26.field1124 < 0 || var26.field1129 >= 104 || var26.field1124 >= 104) {
                var26.method7170();
            }
        }
        if (field747 != 0) {
            field747 -= var5;
            field748 -= var6;
        }
        field752 = 0;
        field758 = false;
        Statics.field2566 -= var5 << 7;
        Statics.field3704 -= var6 << 7;
        Statics.field169 -= var5 << 7;
        Statics.field1134 -= var6 << 7;
        field520 = -1;
        field637.method6030();
        field711.method6030();
        for (int var27 = 0; var27 < 4; var27++) {
            field742[var27].method3661();
        }
    }

    @ObfuscatedName("lf.it(ZI)V")
    public static final void method5710(boolean arg0) {
        method6200();
        field636.field1379++;
        if (field636.field1379 < 50 && !arg0) {
            return;
        }
        field636.field1379 = 0;
        if (field555 || field636.method2544() == null) {
            return;
        }
        class275 var1 = class275.method3314(class273.field3041, field636.field1373);
        field636.method2540(var1);
        try {
            field636.method2543();
        } catch (IOException var3) {
            field555 = true;
        }
    }

    @ObfuscatedName("aq.ii(B)V")
    public static final void method709() {
        method5710(false);
        field558 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field485.length; var1++) {
            if (Statics.field1647[var1] != -1 && Statics.field485[var1] == null) {
                Statics.field485[var1] = Statics.field958.method5859(Statics.field1647[var1], 0);
                if (Statics.field485[var1] == null) {
                    var0 = false;
                    field558++;
                }
            }
            if (Statics.field71[var1] != -1 && Statics.field48[var1] == null) {
                Statics.field48[var1] = Statics.field958.method5783(Statics.field71[var1], 0, Statics.field139[var1]);
                if (Statics.field48[var1] == null) {
                    var0 = false;
                    field558++;
                }
            }
        }
        if (!var0) {
            field583 = 1;
            return;
        }
        field560 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field485.length; var3++) {
            byte[] var4 = Statics.field48[var3];
            if (var4 != null) {
                int var5 = (Statics.field2275[var3] >> 8) * 64 - Statics.field142;
                int var6 = (Statics.field2275[var3] & 0xFF) * 64 - Statics.field1754;
                if (field564) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class79.method3696(var4, var5, var6);
            }
        }
        if (!var2) {
            field583 = 2;
            return;
        }
        if (field583 != 0) {
            method2870(class323.field3777 + class97.field1279 + class97.field1277 + 100 + "%" + class97.field1271, true);
        }
        method6200();
        Statics.field1615.method3924();
        for (int var7 = 0; var7 < 4; var7++) {
            field742[var7].method3661();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class79.field993[var8][var9][var10] = 0;
                }
            }
        }
        method6200();
        class79.method2034();
        int var11 = Statics.field485.length;
        Statics.method2164();
        method5710(true);
        if (!field564) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field2275[var12] >> 8) * 64 - Statics.field142;
                int var14 = (Statics.field2275[var12] & 0xFF) * 64 - Statics.field1754;
                byte[] var15 = Statics.field485[var12];
                if (var15 != null) {
                    method6200();
                    class79.method293(var15, var13, var14, Statics.field4235 * 8 - 48, Statics.field3134 * 8 - 48, field742);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field2275[var16] >> 8) * 64 - Statics.field142;
                int var18 = (Statics.field2275[var16] & 0xFF) * 64 - Statics.field1754;
                byte[] var19 = Statics.field485[var16];
                if (var19 == null && Statics.field3134 < 800) {
                    method6200();
                    class79.method4745(var17, var18, 64, 64);
                }
            }
            method5710(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field48[var20];
                if (var21 != null) {
                    int var22 = (Statics.field2275[var20] >> 8) * 64 - Statics.field142;
                    int var23 = (Statics.field2275[var20] & 0xFF) * 64 - Statics.field1754;
                    method6200();
                    class79.method6259(var21, var22, var23, Statics.field1615, field742);
                }
            }
        }
        if (field564) {
            for (int var24 = 0; var24 < 4; var24++) {
                method6200();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field565[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field2275.length; var34++) {
                                if (Statics.field2275[var34] == var33 && Statics.field485[var34] != null) {
                                    class79.method3407(Statics.field485[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, field742);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            Statics.method2042(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = field565[0][var35][var36];
                    if (var37 == -1) {
                        class79.method4745(var35 * 8, var36 * 8, 8, 8);
                    }
                }
            }
            method5710(true);
            for (int var38 = 0; var38 < 4; var38++) {
                method6200();
                for (int var39 = 0; var39 < 13; var39++) {
                    for (int var40 = 0; var40 < 13; var40++) {
                        int var41 = field565[var38][var39][var40];
                        if (var41 != -1) {
                            int var42 = var41 >> 24 & 0x3;
                            int var43 = var41 >> 1 & 0x3;
                            int var44 = var41 >> 14 & 0x3FF;
                            int var45 = var41 >> 3 & 0x7FF;
                            int var46 = (var44 / 8 << 8) + var45 / 8;
                            for (int var47 = 0; var47 < Statics.field2275.length; var47++) {
                                if (Statics.field2275[var47] == var46 && Statics.field48[var47] != null) {
                                    class79.method2081(Statics.field48[var47], var38, var39 * 8, var40 * 8, var42, (var44 & 0x7) * 8, (var45 & 0x7) * 8, var43, Statics.field1615, field742);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method5710(true);
        method6200();
        class79.method5659(Statics.field1615, field742);
        method5710(true);
        int var48 = class79.field1003;
        if (var48 > Statics.field478) {
            var48 = Statics.field478;
        }
        if (var48 < Statics.field478 - 1) {
            int var49 = Statics.field478 - 1;
        }
        if (field494) {
            Statics.field1615.method3925(class79.field1003);
        } else {
            Statics.field1615.method3925(0);
        }
        for (int var50 = 0; var50 < 104; var50++) {
            for (int var51 = 0; var51 < 104; var51++) {
                method3042(var50, var51);
            }
        }
        method6200();
        method2010();
        class194.field2085.method4837();
        if (Statics.field1599.method621()) {
            class275 var52 = class275.method3314(class273.field3009, field636.field1373);
            var52.field3123.method7835(1057001181);
            field636.method2540(var52);
        }
        if (!field564) {
            int var53 = (Statics.field4235 - 6) / 8;
            int var54 = (Statics.field4235 + 6) / 8;
            int var55 = (Statics.field3134 - 6) / 8;
            int var56 = (Statics.field3134 + 6) / 8;
            for (int var57 = var53 - 1; var57 <= var54 + 1; var57++) {
                for (int var58 = var55 - 1; var58 <= var56 + 1; var58++) {
                    if (var57 < var53 || var57 > var54 || var58 < var55 || var58 > var56) {
                        Statics.field958.method5800("m" + var57 + "_" + var58);
                        Statics.field958.method5800("l" + var57 + "_" + var58);
                    }
                }
            }
        }
        method300(30);
        method6200();
        class79.method1920();
        class275 var59 = class275.method3314(class273.field3094, field636.field1373);
        field636.method2540(var59);
        class36.method6188();
    }

    @ObfuscatedName("jb.il(IB)V")
    public static final void method4847(int arg0) {
        int[] var1 = Statics.field3651.field4959;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class79.field993[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1615.method4050(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class79.field993[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1615.method4050(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field3651.method8124();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class79.field993[arg0][var10][var9] & 0x18) == 0) {
                    method2856(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class79.field993[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2856(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field743 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field1615.method3953(Statics.field478, var11, var12);
                if (var13 != 0L) {
                    int var15 = class222.method2431(var13);
                    int var16 = class194.method2141(var15).field2110;
                    if (var16 >= 0 && class178.method2234(var16).field1872) {
                        field676[field743] = class178.method2234(var16).method3127(false);
                        field692[field743] = var11;
                        field745[field743] = var12;
                        field743++;
                    }
                }
            }
        }
        Statics.field3.method8094();
    }

    @ObfuscatedName("eh.ij(IIIIIB)V")
    public static final void method2856(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field1615.method3987(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field1615.method3958(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class222.method5675(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field3651.field4959;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class222.method2431(var5);
            class194 var14 = class194.method2141(var13);
            if (var14.field2104 == -1) {
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
                class476 var15 = Statics.field1261[var14.field2104];
                if (var15 != null) {
                    int var16 = (var14.field2129 * 4 - var15.field4951) / 2;
                    int var17 = (var14.field2098 * 4 - var15.field4953) / 2;
                    var15.method8102(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field2098) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field1615.method3952(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field1615.method3958(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class222.method2431(var18);
            class194 var24 = class194.method2141(var23);
            if (var24.field2104 != -1) {
                class476 var25 = Statics.field1261[var24.field2104];
                if (var25 != null) {
                    int var26 = (var24.field2129 * 4 - var25.field4951) / 2;
                    int var27 = (var24.field2098 * 4 - var25.field4953) / 2;
                    var25.method8102(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field2098) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class222.method5675(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field3651.field4959;
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
        long var31 = Statics.field1615.method3953(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class222.method2431(var31);
        class194 var34 = class194.method2141(var33);
        if (var34.field2104 == -1) {
            return;
        }
        class476 var35 = Statics.field1261[var34.field2104];
        if (var35 != null) {
            int var36 = (var34.field2129 * 4 - var35.field4951) / 2;
            int var37 = (var34.field2098 * 4 - var35.field4953) / 2;
            var35.method8102(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field2098) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.im(Ldc;IB)Z")
    public boolean method1136(class107 arg0, int arg1) {
        if (arg0.field1377 == 0) {
            Statics.field889 = null;
        } else {
            if (Statics.field889 == null) {
                Statics.field889 = new class387(Statics.field2682, Statics.field1599);
            }
            Statics.field889.method6669(arg0.field1378, arg1);
        }
        method5950();
        arg0.field1375 = null;
        return true;
    }

    @ObfuscatedName("client.ix(Ldc;S)Z")
    public boolean method1150(class107 arg0) {
        if (Statics.field889 != null) {
            Statics.field889.method6670(arg0.field1378);
        }
        method5950();
        arg0.field1375 = null;
        return true;
    }

    @ObfuscatedName("client.io(Ldc;S)Z")
    public final boolean method1138(class107 arg0) {
        class397 var2 = arg0.method2544();
        class463 var3 = arg0.field1378;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1375 == null) {
                if (arg0.field1369) {
                    if (!var2.method6848(1)) {
                        return false;
                    }
                    var2.method6861(arg0.field1378.field4867, 0, 1);
                    arg0.field1372 = 0;
                    arg0.field1369 = false;
                }
                var3.field4864 = 0;
                if (var3.method7658()) {
                    if (!var2.method6848(1)) {
                        return false;
                    }
                    var2.method6861(arg0.field1378.field4867, 1, 1);
                    arg0.field1372 = 0;
                }
                arg0.field1369 = true;
                class276[] var4 = class276.method3158();
                int var5 = var3.method7662();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4864);
                }
                arg0.field1375 = var4[var5];
                arg0.field1377 = arg0.field1375.field3158;
            }
            if (arg0.field1377 == -1) {
                if (!var2.method6848(1)) {
                    return false;
                }
                arg0.method2544().method6861(var3.field4867, 0, 1);
                arg0.field1377 = var3.field4867[0] & 0xFF;
            }
            if (arg0.field1377 == -2) {
                if (!var2.method6848(2)) {
                    return false;
                }
                arg0.method2544().method6861(var3.field4867, 0, 2);
                var3.field4864 = 0;
                arg0.field1377 = var3.method7716();
            }
            if (!var2.method6848(arg0.field1377)) {
                return false;
            }
            var3.field4864 = 0;
            var2.method6861(var3.field4867, 0, arg0.field1377);
            arg0.field1372 = 0;
            field556.method6581();
            arg0.field1382 = arg0.field1374;
            arg0.field1374 = arg0.field1381;
            arg0.field1381 = arg0.field1375;
            if (class276.field3137 == arg0.field1375) {
                method6293(class274.field3110);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3143 == arg0.field1375) {
                int var6 = var3.method7770();
                int var7 = var3.method7796();
                class303 var8 = class303.method4921(var6);
                if (var8.field3526 != 1 || var8.field3527 != var7) {
                    var8.field3526 = 1;
                    var8.field3527 = var7;
                    method2867(var8);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3171 == arg0.field1375) {
                int var9 = var3.method7748();
                int var10 = var3.method7748();
                String var11 = var3.method7725();
                if (var10 >= 1 && var10 <= 8) {
                    if (var11.equalsIgnoreCase(class323.field3774)) {
                        var11 = null;
                    }
                    field630[var10 - 1] = var11;
                    field613[var10 - 1] = var9 == 0;
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3183 == arg0.field1375) {
                Statics.field123 = var3.method7748();
                Statics.field65 = var3.method7747();
                for (int var12 = Statics.field123; var12 < Statics.field123 + 8; var12++) {
                    for (int var13 = Statics.field65; var13 < Statics.field65 + 8; var13++) {
                        if (field723[Statics.field478][var12][var13] != null) {
                            field723[Statics.field478][var12][var13] = null;
                            method3042(var12, var13);
                        }
                    }
                }
                for (class90 var14 = (class90) field635.method6040(); var14 != null; var14 = (class90) field635.method6034()) {
                    if (var14.field1129 >= Statics.field123 && var14.field1129 < Statics.field123 + 8 && var14.field1124 >= Statics.field65 && var14.field1124 < Statics.field65 + 8 && Statics.field478 == var14.field1123) {
                        var14.field1133 = 0;
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3211 == arg0.field1375) {
                String var15 = var3.method7725();
                Object[] var16 = new Object[var15.length() + 1];
                for (int var17 = var15.length() - 1; var17 >= 0; var17--) {
                    if (var15.charAt(var17) == 's') {
                        var16[var17 + 1] = var3.method7725();
                    } else {
                        var16[var17 + 1] = Integer.valueOf(var3.method7720());
                    }
                }
                var16[0] = Integer.valueOf(var3.method7720());
                class85 var18 = new class85();
                var18.field1045 = var16;
                class68.method4883(var18);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3238 == arg0.field1375) {
                method6293(class274.field3113);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3193 == arg0.field1375) {
                byte var19 = var3.method7881();
                String var20 = var3.method7725();
                long var21 = (long) var3.method7716();
                long var23 = (long) var3.method7906();
                class325 var25 = (class325) class344.method4292(class325.method5649(), var3.method7735());
                long var26 = (var21 << 32) + var23;
                boolean var28 = false;
                Object var29 = null;
                class156 var30 = var19 >= 0 ? field741[var19] : Statics.field2239;
                if (var30 == null) {
                    var28 = true;
                } else {
                    int var31 = 0;
                    while (true) {
                        if (var31 >= 100) {
                            if (var25.field4115 && Statics.field2726.method1699(new class486(var20, Statics.field2682))) {
                                var28 = true;
                            }
                            break;
                        }
                        if (field776[var31] == var26) {
                            var28 = true;
                            break;
                        }
                        var31++;
                    }
                }
                if (!var28) {
                    field776[field733] = var26;
                    field733 = (field733 + 1) % 100;
                    String var32 = class369.method6418(class306.method5174(var3));
                    int var33 = var19 >= 0 ? 41 : 44;
                    if (var25.field4113 == -1) {
                        class106.method2139(var33, var20, var32, var30.field1731);
                    } else {
                        class106.method2139(var33, class97.method4850(var25.field4113) + var20, var32, var30.field1731);
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3142 == arg0.field1375) {
                int var34 = var3.method7735();
                int var35 = var3.method7796();
                int var36 = var3.method7758();
                if (var36 == 65535) {
                    var36 = -1;
                }
                class96 var37 = field760[var35];
                if (var37 != null) {
                    if (var37.field1188 == var36 && var36 != -1) {
                        int var38 = class197.method3143(var36).field2233;
                        if (var38 == 1) {
                            var37.field1180 = 0;
                            var37.field1181 = 0;
                            var37.field1140 = var34;
                            var37.field1211 = 0;
                        } else if (var38 == 2) {
                            var37.field1211 = 0;
                        }
                    } else if (var36 == -1 || var37.field1188 == -1 || class197.method3143(var36).field2226 >= class197.method3143(var37.field1188).field2226) {
                        var37.field1188 = var36;
                        var37.field1180 = 0;
                        var37.field1181 = 0;
                        var37.field1140 = var34;
                        var37.field1211 = 0;
                        var37.field1212 = var37.field1207;
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3200 == arg0.field1375) {
                Statics.field1746 = null;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3148 == arg0.field1375) {
                int var39 = var3.method7720();
                class84 var40 = (class84) field668.method7466((long) var39);
                if (var40 != null) {
                    method45(var40, true);
                }
                if (field499 != null) {
                    method2867(field499);
                    field499 = null;
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3223 == arg0.field1375 && field758) {
                field759 = true;
                Statics.field4094 = var3.method7735();
                Statics.field1399 = var3.method7735();
                Statics.field255 = var3.method7735();
                Statics.field1913 = var3.method7735();
                for (int var41 = 0; var41 < 5; var41++) {
                    field557[var41] = false;
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3221 == arg0.field1375) {
                field509 = var3.method7796() * 30;
                field500 = field736;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3226 == arg0.field1375) {
                method6293(class274.field3108);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3191 == arg0.field1375) {
                boolean var42 = var3.method7735() == 1;
                if (var42) {
                    Statics.field1308 = class280.method2629() - var3.method7721();
                    Statics.field2952 = new class332(var3, true);
                } else {
                    Statics.field2952 = null;
                }
                field707 = field736;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3187 == arg0.field1375) {
                method28(true, arg0.field1378);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3162 == arg0.field1375) {
                method6293(class274.field3119);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3196 == arg0.field1375) {
                int var43 = var3.method7720();
                int var44 = var3.method7720();
                int var45 = class36.method4716();
                class275 var46 = class275.method3314(class273.field3071, field636.field1373);
                var46.field3123.method7835(var43);
                var46.field3123.method7749(var44);
                var46.field3123.method7858(var45);
                var46.field3123.method7746(field204);
                field636.method2540(var46);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3233 == arg0.field1375) {
                int var47 = var3.method7769();
                int var48 = var3.method7796();
                class303 var49 = class303.method4921(var47);
                if (var49 != null && var49.field3484 == 0) {
                    if (var48 > var49.field3514 - var49.field3498) {
                        var48 = var49.field3514 - var49.field3498;
                    }
                    if (var48 < 0) {
                        var48 = 0;
                    }
                    if (var49.field3504 != var48) {
                        var49.field3504 = var48;
                        method2867(var49);
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3169 == arg0.field1375) {
                method6293(class274.field3112);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3138 == arg0.field1375) {
                int var50 = var3.method7796();
                int var51 = var3.method7756();
                int var52 = var3.method7758();
                int var53 = var3.method7720();
                class303 var54 = class303.method4921(var53);
                if (var54.field3623 != var50 || var54.field3535 != var51 || var54.field3584 != var52) {
                    var54.field3623 = var50;
                    var54.field3535 = var51;
                    var54.field3584 = var52;
                    method2867(var54);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3190 == arg0.field1375) {
                for (int var55 = 0; var55 < field621.length; var55++) {
                    if (field621[var55] != null) {
                        field621[var55].field1188 = -1;
                    }
                }
                for (int var56 = 0; var56 < field760.length; var56++) {
                    if (field760[var56] != null) {
                        field760[var56].field1188 = -1;
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3201 == arg0.field1375) {
                field567 = var3.method7735();
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3136 == arg0.field1375) {
                int var57 = var3.method7756();
                int var58 = var3.method7756();
                int var59 = var3.method7770();
                class303 var60 = class303.method4921(var59);
                var60.field3534 = (var57 << 16) + var58;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3219 == arg0.field1375) {
                method6293(class274.field3114);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3229 == arg0.field1375) {
                String var61 = var3.method7725();
                String var62 = class369.method6418(class358.method3207(class306.method5174(var3)));
                Statics.method666(6, var61, var62);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3152 == arg0.field1375) {
                for (int var63 = 0; var63 < class293.field3391.length; var63++) {
                    if (class293.field3391[var63] != class293.field3389[var63]) {
                        class293.field3391[var63] = class293.field3389[var63];
                        method2972(var63);
                        field789[++field548 - 1 & 0x1F] = var63;
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3215 == arg0.field1375) {
                return this.method1136(arg0, 1);
            }
            if (class276.field3167 == arg0.field1375) {
                method2748();
                byte var64 = var3.method7881();
                class139 var65 = new class139(var3);
                class147 var66;
                if (var64 >= 0) {
                    var66 = field596[var64];
                } else {
                    var66 = Statics.field1452;
                }
                var65.method2846(var66);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3146 == arg0.field1375) {
                method6608();
                arg0.field1375 = null;
                return false;
            }
            if (class276.field3207 == arg0.field1375) {
                int var67 = var3.method7720();
                int var68 = var3.method7758();
                class293.field3389[var68] = var67;
                if (class293.field3391[var68] != var67) {
                    class293.field3391[var68] = var67;
                }
                method2972(var68);
                field789[++field548 - 1 & 0x1F] = var68;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3243 == arg0.field1375) {
                int var69 = var3.method7756();
                if (var69 == 65535) {
                    var69 = -1;
                }
                int var70 = var3.method7756();
                if (var70 == 65535) {
                    var70 = -1;
                }
                int var71 = var3.method7720();
                int var72 = var3.method7720();
                for (int var73 = var69; var73 <= var70; var73++) {
                    long var74 = ((long) var72 << 32) + (long) var73;
                    class430 var76 = field643.method7466(var74);
                    if (var76 != null) {
                        var76.method7170();
                    }
                    field643.method7468(new class429(var71), var74);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3239 == arg0.field1375) {
                method6293(class274.field3118);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3186 == arg0.field1375) {
                int var77 = var3.method7735();
                method6609(var77);
                arg0.field1375 = null;
                return false;
            }
            if (class276.field3184 == arg0.field1375) {
                method6293(class274.field3111);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3163 == arg0.field1375) {
                var3.field4864 += 28;
                if (var3.method7840()) {
                    method4664(var3, var3.field4864 - 28);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3154 == arg0.field1375) {
                int var78 = var3.method7720();
                int var79 = var3.method7716();
                if (var78 < -70000) {
                    var79 += 32768;
                }
                class303 var80;
                if (var78 >= 0) {
                    var80 = class303.method4921(var78);
                } else {
                    var80 = null;
                }
                while (var3.field4864 < arg0.field1377) {
                    int var81 = var3.method7801();
                    int var82 = var3.method7716();
                    int var83 = 0;
                    if (var82 != 0) {
                        var83 = var3.method7735();
                        if (var83 == 255) {
                            var83 = var3.method7720();
                        }
                    }
                    if (var80 != null && var81 >= 0 && var81 < var80.field3483.length) {
                        var80.field3483[var81] = var82;
                        var80.field3478[var81] = var83;
                    }
                    class82.method4110(var79, var81, var82 - 1, var83);
                }
                if (var80 != null) {
                    method2867(var80);
                }
                method3476();
                field695[++field696 - 1 & 0x1F] = var79 & 0x7FFF;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3166 == arg0.field1375) {
                field729 = var3.method7747();
                field730 = var3.method7735();
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3214 == arg0.field1375) {
                method6293(class274.field3115);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3241 == arg0.field1375) {
                method6293(class274.field3122);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3217 == arg0.field1375) {
                int var84 = var3.method7801();
                boolean var85 = var3.method7735() == 1;
                String var86 = "";
                boolean var87 = false;
                if (var85) {
                    var86 = var3.method7725();
                    if (Statics.field2726.method1699(new class486(var86, Statics.field2682))) {
                        var87 = true;
                    }
                }
                String var88 = var3.method7725();
                if (!var87) {
                    Statics.method666(var84, var86, var88);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3185 == arg0.field1375) {
                int var89 = var3.method7769();
                class303 var90 = class303.method4921(var89);
                var90.field3526 = 3;
                var90.field3527 = Statics.field3404.field1109.method5215();
                method2867(var90);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3195 == arg0.field1375) {
                String var91 = var3.method7725();
                long var92 = var3.method7721();
                long var94 = (long) var3.method7716();
                long var96 = (long) var3.method7906();
                class325 var98 = (class325) class344.method4292(class325.method5649(), var3.method7735());
                long var99 = (var94 << 32) + var96;
                boolean var101 = false;
                for (int var102 = 0; var102 < 100; var102++) {
                    if (field776[var102] == var99) {
                        var101 = true;
                        break;
                    }
                }
                if (var98.field4115 && Statics.field2726.method1699(new class486(var91, Statics.field2682))) {
                    var101 = true;
                }
                if (!var101 && field688 == 0) {
                    field776[field733] = var99;
                    field733 = (field733 + 1) % 100;
                    String var103 = class369.method6418(class358.method3207(class306.method5174(var3)));
                    if (var98.field4113 == -1) {
                        class106.method2139(9, var91, var103, class360.method4800(var92));
                    } else {
                        class106.method2139(9, class97.method4850(var98.field4113) + var91, var103, class360.method4800(var92));
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3237 == arg0.field1375) {
                Statics.field2734 = true;
                method4670(true, var3);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3132 == arg0.field1375) {
                int var104 = var3.method7735();
                method815(var104);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3161 == arg0.field1375) {
                class38.method2871(var3, arg0.field1377);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3145 == arg0.field1375) {
                Statics.field65 = var3.method7935();
                Statics.field123 = var3.method7735();
                while (var3.field4864 < arg0.field1377) {
                    int var105 = var3.method7735();
                    class274 var106 = class274.method2080()[var105];
                    method6293(var106);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3194 == arg0.field1375) {
                field758 = true;
                field759 = false;
                Statics.field3265 = var3.method7735();
                Statics.field63 = var3.method7735();
                Statics.field2830 = var3.method7716();
                Statics.field4094 = var3.method7735();
                Statics.field1399 = var3.method7735();
                if (Statics.field1399 >= 100) {
                    Statics.field2566 = Statics.field3265 * 128 + 64;
                    Statics.field3704 = Statics.field63 * 128 + 64;
                    Statics.field170 = method2836(Statics.field2566, Statics.field3704, Statics.field478) - Statics.field2830;
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3157 == arg0.field1375) {
                class103.method4744(var3, arg0.field1377);
                method6611();
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3234 == arg0.field1375) {
                Statics.field973 = true;
                class103.method4744(var3, arg0.field1377);
                method6611();
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3230 == arg0.field1375) {
                method5694(var3.method7725());
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3144 == arg0.field1375) {
                int var107 = var3.method7716();
                int var108 = var3.method7735();
                int var109 = var3.method7716();
                method4858(var107, var108, var109);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3212 == arg0.field1375) {
                int var110 = var3.method7769();
                boolean var111 = var3.method7935() == 1;
                class303 var112 = class303.method4921(var110);
                if (var112.field3502 != var111) {
                    var112.field3502 = var111;
                    method2867(var112);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3244 == arg0.field1375) {
                int var113 = var3.method7716();
                int var114 = var3.method7735();
                int var115 = var3.method7756();
                int var116 = var3.method7763();
                int var117 = var116 >> 16;
                int var118 = var116 >> 8 & 0xFF;
                int var119 = (var116 >> 4 & 0x7) + var117;
                int var120 = (var116 & 0x7) + var118;
                if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
                    int var121 = var119 * 128 + 64;
                    int var122 = var120 * 128 + 64;
                    class69 var123 = new class69(var113, Statics.field478, var121, var122, method2836(var121, var122, Statics.field478) - var114, var115, field503);
                    field637.method6031(var123);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3208 == arg0.field1375) {
                field705 = field736;
                byte var124 = var3.method7881();
                class153 var125 = new class153(var3);
                class156 var126;
                if (var124 >= 0) {
                    var126 = field741[var124];
                } else {
                    var126 = Statics.field2239;
                }
                var125.method2944(var126);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3159 == arg0.field1375) {
                Statics.field2726.field814.method6655(var3, arg0.field1377);
                method7424();
                field702 = field736;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3156 == arg0.field1375) {
                method3476();
                field717 = var3.method7798();
                field500 = field736;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3198 == arg0.field1375) {
                int var127 = var3.method7769();
                int var128 = var3.method7716();
                int var129 = var128 >> 10 & 0x1F;
                int var130 = var128 >> 5 & 0x1F;
                int var131 = var128 & 0x1F;
                int var132 = (var131 << 3) + (var129 << 19) + (var130 << 11);
                class303 var133 = class303.method4921(var127);
                if (var133.field3507 != var132) {
                    var133.field3507 = var132;
                    method2867(var133);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3164 == arg0.field1375) {
                int var134 = var3.method7796();
                if (var134 == 65535) {
                    var134 = -1;
                }
                method697(var134);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3133 == arg0.field1375) {
                int var135 = var3.method7742();
                int var136 = var3.method7756();
                if (var136 == 65535) {
                    var136 = -1;
                }
                method3788(var136, var135);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3181 == arg0.field1375) {
                int var137 = var3.method7716();
                byte var138 = var3.method7929();
                int var139 = var3.method7796();
                int var140 = var3.method7796();
                int var141 = var3.method7735() * 4;
                byte var142 = var3.method7929();
                int var143 = var3.method7735();
                int var144 = var3.method7777();
                int var145 = var3.method7748();
                int var146 = var3.method7906();
                int var147 = var146 >> 16;
                int var148 = var146 >> 8 & 0xFF;
                int var149 = (var146 >> 4 & 0x7) + var147;
                int var150 = (var146 & 0x7) + var148;
                int var151 = var3.method7747() * 4;
                int var152 = var138 + var149;
                int var153 = var142 + var150;
                if (var149 >= 0 && var150 >= 0 && var149 < 104 && var150 < 104 && var152 >= 0 && var153 >= 0 && var152 < 104 && var153 < 104 && var137 != 65535) {
                    int var154 = var149 * 128 + 64;
                    int var155 = var150 * 128 + 64;
                    int var156 = var152 * 128 + 64;
                    int var157 = var153 * 128 + 64;
                    class74 var158 = new class74(var137, Statics.field478, var154, var155, method2836(var154, var155, Statics.field478) - var141, field503 + var139, field503 + var140, var145, var143, var144, var151);
                    var158.method2000(var156, var157, method2836(var156, var157, Statics.field478) - var151, field503 + var139);
                    field711.method6031(var158);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3235 == arg0.field1375) {
                int var159 = var3.method7716();
                int var160 = var3.method7758();
                int var161 = var3.method7748();
                int var162 = var3.method7906();
                int var163 = var162 >> 16;
                int var164 = var162 >> 8 & 0xFF;
                int var165 = (var162 >> 4 & 0x7) + var163;
                int var166 = (var162 & 0x7) + var164;
                int var167 = var3.method7716();
                int var168 = var3.method7719();
                int var169 = var3.method7748() * 4;
                byte var170 = var3.method7881();
                int var171 = var3.method7935() * 4;
                byte var172 = var3.method7881();
                int var173 = var3.method7735();
                int var174 = var165 + var172;
                int var175 = var166 + var170;
                if (var165 >= 0 && var166 >= 0 && var165 < 104 && var166 < 104 && var174 >= 0 && var175 >= 0 && var174 < 104 && var175 < 104 && var167 != 65535) {
                    int var176 = var165 * 128 + 64;
                    int var177 = var166 * 128 + 64;
                    int var178 = var174 * 128 + 64;
                    int var179 = var175 * 128 + 64;
                    class74 var180 = new class74(var167, Statics.field478, var176, var177, method2836(var176, var177, Statics.field478) - var169, field503 + var160, field503 + var159, var173, var161, var168, var171);
                    var180.method2000(var178, var179, method2836(var178, var179, Statics.field478) - var171, field503 + var160);
                    field711.method6031(var180);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3172 == arg0.field1375) {
                method6293(class274.field3117);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3153 == arg0.field1375) {
                int var181 = var3.method7720();
                int var182 = var3.method7769();
                int var183 = var3.method7716();
                if (var183 == 65535) {
                    var183 = -1;
                }
                class303 var184 = class303.method4921(var182);
                if (var184.field3481) {
                    var184.field3467 = var183;
                    var184.field3621 = var181;
                    class195 var186 = class195.method5052(var183);
                    var184.field3623 = var186.field2150;
                    var184.field3535 = var186.field2151;
                    var184.field3536 = var186.field2152;
                    var184.field3532 = var186.field2153;
                    var184.field3570 = var186.field2141;
                    var184.field3584 = var186.field2157;
                    if (var186.field2155 == 1) {
                        var184.field3542 = 1;
                    } else {
                        var184.field3542 = 2;
                    }
                    if (var184.field3538 > 0) {
                        var184.field3584 = var184.field3584 * 32 / var184.field3538;
                    } else if (var184.field3508 > 0) {
                        var184.field3584 = var184.field3584 * 32 / var184.field3508;
                    }
                    method2867(var184);
                } else if (var183 == -1) {
                    var184.field3526 = 0;
                    arg0.field1375 = null;
                    return true;
                } else {
                    class195 var185 = class195.method5052(var183);
                    var184.field3526 = 4;
                    var184.field3527 = var183;
                    var184.field3623 = var185.field2150;
                    var184.field3535 = var185.field2151;
                    var184.field3584 = var185.field2157 * 100 / var181;
                    method2867(var184);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3141 == arg0.field1375) {
                int var187 = var3.method7796();
                field751 = var187;
                this.method1142(false);
                method2112(var187);
                class68.method2937(field751);
                for (int var188 = 0; var188 < 100; var188++) {
                    field718[var188] = true;
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3140 == arg0.field1375) {
                if (field751 != -1) {
                    method4291(field751, 0);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3180 == arg0.field1375) {
                Statics.field2726.method1696(var3, arg0.field1377);
                field702 = field736;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3205 == arg0.field1375) {
                if (Statics.field1746 == null) {
                    Statics.field1746 = new class412(Statics.field2299);
                }
                class472 var189 = Statics.field2299.method7105(var3);
                Statics.field1746.field4593.method7483(var189.field4933, var189.field4931);
                field699[++field700 - 1 & 0x1F] = var189.field4933;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3225 == arg0.field1375) {
                method3476();
                int var190 = var3.method7769();
                int var191 = var3.method7748();
                int var192 = var3.method7748();
                field640[var192] = var190;
                field638[var192] = var191;
                field675[var192] = 1;
                for (int var193 = 0; var193 < 98; var193++) {
                    if (var190 >= class313.field3700[var193]) {
                        field675[var192] = var193 + 2;
                    }
                }
                field697[++field600 - 1 & 0x1F] = var192;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3220 == arg0.field1375) {
                field705 = field736;
                byte var194 = var3.method7881();
                if (arg0.field1377 == 1) {
                    if (var194 >= 0) {
                        field741[var194] = null;
                    } else {
                        Statics.field2239 = null;
                    }
                    arg0.field1375 = null;
                    return true;
                }
                if (var194 >= 0) {
                    field741[var194] = new class156(var3);
                } else {
                    Statics.field2239 = new class156(var3);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3228 == arg0.field1375) {
                boolean var195 = var3.method7723();
                if (!var195) {
                    Statics.field4145 = null;
                } else if (Statics.field4145 == null) {
                    Statics.field4145 = new class341();
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3192 == arg0.field1375) {
                int var196 = var3.method7720();
                int var197 = var3.method7796();
                class303 var198 = class303.method4921(var196);
                if (var198.field3526 != 2 || var198.field3527 != var197) {
                    var198.field3526 = 2;
                    var198.field3527 = var197;
                    method2867(var198);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3149 == arg0.field1375) {
                return this.method1136(arg0, 2);
            }
            if (class276.field3232 == arg0.field1375) {
                int var199 = var3.method7720();
                int var200 = var3.method7716();
                if (var199 < -70000) {
                    var200 += 32768;
                }
                class303 var201;
                if (var199 >= 0) {
                    var201 = class303.method4921(var199);
                } else {
                    var201 = null;
                }
                if (var201 != null) {
                    for (int var202 = 0; var202 < var201.field3483.length; var202++) {
                        var201.field3483[var202] = 0;
                        var201.field3478[var202] = 0;
                    }
                }
                class82.method4703(var200);
                int var203 = var3.method7716();
                for (int var204 = 0; var204 < var203; var204++) {
                    int var205 = var3.method7756();
                    int var206 = var3.method7935();
                    if (var206 == 255) {
                        var206 = var3.method7768();
                    }
                    if (var201 != null && var204 < var201.field3483.length) {
                        var201.field3483[var204] = var205;
                        var201.field3478[var204] = var206;
                    }
                    class82.method4110(var200, var204, var205 - 1, var206);
                }
                if (var201 != null) {
                    method2867(var201);
                }
                method3476();
                field695[++field696 - 1 & 0x1F] = var200 & 0x7FFF;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3179 == arg0.field1375) {
                int var207 = var3.method7935();
                int var208 = var3.method7768();
                int var209 = var3.method7796();
                class84 var210 = (class84) field668.method7466((long) var208);
                if (var210 != null) {
                    method45(var210, var210.field1039 != var209);
                }
                method7098(var208, var209, var207);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3189 == arg0.field1375) {
                int var211 = var3.method7735();
                if (var3.method7735() == 0) {
                    field782[var211] = new class339();
                    var3.field4864 += 18;
                } else {
                    var3.field4864--;
                    field782[var211] = new class339(var3, false);
                }
                field706 = field736;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3236 == arg0.field1375) {
                Statics.field2734 = true;
                method4670(false, var3);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3210 == arg0.field1375) {
                Statics.field3462 = class482.method6258(var3.method7735());
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3203 == arg0.field1375) {
                int var212 = var3.method7735();
                int var213 = var3.method7735();
                int var214 = var3.method7735();
                int var215 = var3.method7735();
                field557[var212] = true;
                field761[var212] = var213;
                field666[var212] = var214;
                field763[var212] = var215;
                field764[var212] = 0;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3197 == arg0.field1375) {
                int var216 = var3.method7758();
                class89 var217;
                if (field622 == var216) {
                    var217 = Statics.field3404;
                } else {
                    var217 = field621[var216];
                }
                int var218 = var3.method7768();
                int var219 = var3.method7796();
                if (var217 != null) {
                    var217.field1184 = var219;
                    var217.field1160 = var218 >> 16;
                    var217.field1187 = (var218 & 0xFFFF) + field503;
                    var217.field1192 = 0;
                    var217.field1143 = 0;
                    if (var217.field1187 > field503) {
                        var217.field1192 = -1;
                    }
                    if (var217.field1184 == 65535) {
                        var217.field1184 = -1;
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3177 == arg0.field1375) {
                int var220 = var3.method7758();
                class82.method6930(var220);
                field695[++field696 - 1 & 0x1F] = var220 & 0x7FFF;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3202 == arg0.field1375) {
                byte[] var221 = new byte[arg0.field1377];
                var3.method7668(var221, 0, var221.length);
                class464 var222 = new class464(var221);
                String var223 = var222.method7725();
                class33.method2572(var223, true, false);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3216 == arg0.field1375) {
                Statics.field1746 = new class412(Statics.field2299);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3209 == arg0.field1375) {
                return this.method1150(arg0);
            }
            if (class276.field3170 == arg0.field1375) {
                String var224 = var3.method7725();
                int var225 = var3.method7770();
                class303 var226 = class303.method4921(var225);
                if (!var224.equals(var226.field3544)) {
                    var226.field3544 = var224;
                    method2867(var226);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3178 == arg0.field1375) {
                method3476();
                field674 = var3.method7735();
                field500 = field736;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3151 == arg0.field1375) {
                int var227 = var3.method7720();
                if (field587 != var227) {
                    field587 = var227;
                    method1641();
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3224 == arg0.field1375) {
                method4670(false, var3);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3176 == arg0.field1375) {
                int var228 = var3.method7770();
                int var229 = var3.method7768();
                class84 var230 = (class84) field668.method7466((long) var229);
                class84 var231 = (class84) field668.method7466((long) var228);
                if (var231 != null) {
                    method45(var231, var230 == null || var230.field1039 != var231.field1039);
                }
                if (var230 != null) {
                    var230.method7170();
                    field668.method7468(var230, (long) var228);
                }
                class303 var232 = class303.method4921(var229);
                if (var232 != null) {
                    method2867(var232);
                }
                class303 var233 = class303.method4921(var228);
                if (var233 != null) {
                    method2867(var233);
                    method201(Statics.field3615[var233.field3539 >>> 16], var233, true);
                }
                if (field751 != -1) {
                    method4291(field751, 1);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3218 == arg0.field1375) {
                byte var234 = var3.method7881();
                long var235 = (long) var3.method7716();
                long var237 = (long) var3.method7906();
                long var239 = (var235 << 32) + var237;
                boolean var241 = false;
                class156 var242 = var234 >= 0 ? field741[var234] : Statics.field2239;
                if (var242 == null) {
                    var241 = true;
                } else {
                    for (int var243 = 0; var243 < 100; var243++) {
                        if (field776[var243] == var239) {
                            var241 = true;
                            break;
                        }
                    }
                }
                if (!var241) {
                    field776[field733] = var239;
                    field733 = (field733 + 1) % 100;
                    String var244 = class306.method5174(var3);
                    int var245 = var234 >= 0 ? 43 : 46;
                    class106.method2139(var245, "", var244, var242.field1731);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3204 == arg0.field1375) {
                method4670(true, var3);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3139 == arg0.field1375) {
                int var246 = var3.method7777();
                int var247 = var3.method7768();
                class303 var248 = class303.method4921(var247);
                if (var248.field3597 != var246 || var246 == -1) {
                    var248.field3597 = var246;
                    var248.field3493 = 0;
                    var248.field3540 = 0;
                    method2867(var248);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3182 == arg0.field1375) {
                method6293(class274.field3109);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3222 == arg0.field1375) {
                method28(false, arg0.field1378);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3188 == arg0.field1375) {
                int var249 = var3.method7770();
                class303 var250 = class303.method4921(var249);
                for (int var251 = 0; var251 < var250.field3483.length; var251++) {
                    var250.field3483[var251] = -1;
                    var250.field3483[var251] = 0;
                }
                method2867(var250);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3160 == arg0.field1375) {
                String var252 = var3.method7725();
                long var253 = (long) var3.method7716();
                long var255 = (long) var3.method7906();
                class325 var257 = (class325) class344.method4292(class325.method5649(), var3.method7735());
                long var258 = (var253 << 32) + var255;
                boolean var260 = false;
                for (int var261 = 0; var261 < 100; var261++) {
                    if (field776[var261] == var258) {
                        var260 = true;
                        break;
                    }
                }
                if (Statics.field2726.method1699(new class486(var252, Statics.field2682))) {
                    var260 = true;
                }
                if (!var260 && field688 == 0) {
                    field776[field733] = var258;
                    field733 = (field733 + 1) % 100;
                    String var262 = class369.method6418(class358.method3207(class306.method5174(var3)));
                    byte var263;
                    if (var257.field4114) {
                        var263 = 7;
                    } else {
                        var263 = 3;
                    }
                    if (var257.field4113 == -1) {
                        Statics.method666(var263, var252, var262);
                    } else {
                        Statics.method666(var263, class97.method4850(var257.field4113) + var252, var262);
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3206 == arg0.field1375) {
                field510 = var3.method7735();
                if (field510 == 1) {
                    field737 = var3.method7716();
                }
                if (field510 >= 2 && field510 <= 6) {
                    if (field510 == 2) {
                        field724 = 64;
                        field542 = 64;
                    }
                    if (field510 == 3) {
                        field724 = 0;
                        field542 = 64;
                    }
                    if (field510 == 4) {
                        field724 = 128;
                        field542 = 64;
                    }
                    if (field510 == 5) {
                        field724 = 64;
                        field542 = 0;
                    }
                    if (field510 == 6) {
                        field724 = 64;
                        field542 = 128;
                    }
                    field510 = 2;
                    field513 = var3.method7716();
                    field514 = var3.method7716();
                    field771 = var3.method7735();
                }
                if (field510 == 10) {
                    field512 = var3.method7716();
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3240 == arg0.field1375) {
                int var264 = var3.method7798();
                int var265 = var3.method7770();
                int var266 = var3.method7777();
                class303 var267 = class303.method4921(var265);
                if (var267.field3491 != var266 || var267.field3492 != var264 || var267.field3487 != 0 || var267.field3488 != 0) {
                    var267.field3491 = var266;
                    var267.field3492 = var264;
                    var267.field3487 = 0;
                    var267.field3488 = 0;
                    method2867(var267);
                    this.method1143(var267);
                    if (var267.field3484 == 0) {
                        method201(Statics.field3615[var265 >> 16], var267, false);
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3213 == arg0.field1375) {
                field758 = false;
                for (int var268 = 0; var268 < 5; var268++) {
                    field557[var268] = false;
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3173 == arg0.field1375) {
                int var269 = arg0.field1377 + var3.field4864;
                int var270 = var3.method7716();
                int var271 = var3.method7716();
                if (field751 != var270) {
                    field751 = var270;
                    this.method1142(false);
                    method2112(field751);
                    class68.method2937(field751);
                    for (int var272 = 0; var272 < 100; var272++) {
                        field718[var272] = true;
                    }
                }
                while (var271-- > 0) {
                    int var273 = var3.method7720();
                    int var274 = var3.method7716();
                    int var275 = var3.method7735();
                    class84 var276 = (class84) field668.method7466((long) var273);
                    if (var276 != null && var276.field1039 != var274) {
                        method45(var276, true);
                        var276 = null;
                    }
                    if (var276 == null) {
                        var276 = method7098(var273, var274, var275);
                    }
                    var276.field1038 = true;
                }
                for (class84 var277 = (class84) field668.method7478(); var277 != null; var277 = (class84) field668.method7469()) {
                    if (var277.field1038) {
                        var277.field1038 = false;
                    } else {
                        method45(var277, true);
                    }
                }
                field643 = new class441(512);
                while (var3.field4864 < var269) {
                    int var278 = var3.method7720();
                    int var279 = var3.method7716();
                    int var280 = var3.method7716();
                    int var281 = var3.method7720();
                    for (int var282 = var279; var282 <= var280; var282++) {
                        long var283 = ((long) var278 << 32) + (long) var282;
                        field643.method7468(new class429(var281), var283);
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3227 == arg0.field1375) {
                method6293(class274.field3107);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3147 == arg0.field1375) {
                byte var285 = var3.method7752();
                int var286 = var3.method7796();
                class293.field3389[var286] = var285;
                if (class293.field3391[var286] != var285) {
                    class293.field3391[var286] = var285;
                }
                method2972(var286);
                field789[++field548 - 1 & 0x1F] = var286;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3135 == arg0.field1375) {
                Statics.field65 = var3.method7747();
                Statics.field123 = var3.method7747();
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3174 == arg0.field1375) {
                int var287 = var3.method7756();
                class96 var288 = field760[var287];
                int var289 = var3.method7756();
                int var290 = var3.method7769();
                if (var288 != null) {
                    var288.field1184 = var289;
                    var288.field1160 = var290 >> 16;
                    var288.field1187 = (var290 & 0xFFFF) + field503;
                    var288.field1192 = 0;
                    var288.field1143 = 0;
                    if (var288.field1187 > field503) {
                        var288.field1192 = -1;
                    }
                    if (var288.field1184 == 65535) {
                        var288.field1184 = -1;
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3175 == arg0.field1375) {
                method2748();
                byte var291 = var3.method7881();
                if (arg0.field1377 == 1) {
                    if (var291 >= 0) {
                        field596[var291] = null;
                    } else {
                        Statics.field1452 = null;
                    }
                    arg0.field1375 = null;
                    return true;
                }
                if (var291 >= 0) {
                    field596[var291] = new class147(var3);
                } else {
                    Statics.field1452 = new class147(var3);
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3199 == arg0.field1375) {
                for (int var292 = 0; var292 < Statics.field1867; var292++) {
                    class177 var293 = class177.method4855(var292);
                    if (var293 != null) {
                        class293.field3389[var292] = 0;
                        class293.field3391[var292] = 0;
                    }
                }
                method3476();
                field548 += 32;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3150 == arg0.field1375) {
                method6293(class274.field3120);
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3165 == arg0.field1375) {
                field758 = true;
                field759 = false;
                Statics.field12 = var3.method7735();
                Statics.field1432 = var3.method7735();
                Statics.field3327 = var3.method7716();
                Statics.field255 = var3.method7735();
                Statics.field1913 = var3.method7735();
                if (Statics.field1913 >= 100) {
                    int var294 = Statics.field12 * 128 + 64;
                    int var295 = Statics.field1432 * 128 + 64;
                    int var296 = method2836(var294, var295, Statics.field478) - Statics.field3327;
                    int var297 = var294 - Statics.field2566;
                    int var298 = var296 - Statics.field170;
                    int var299 = var295 - Statics.field3704;
                    int var300 = (int) Math.sqrt((double) (var297 * var297 + var299 * var299));
                    Statics.field4582 = (int) (Math.atan2((double) var298, (double) var300) * 325.9490051269531D) & 0x7FF;
                    Statics.field2940 = (int) (Math.atan2((double) var297, (double) var299) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field4582 < 128) {
                        Statics.field4582 = 128;
                    }
                    if (Statics.field4582 > 383) {
                        Statics.field4582 = 383;
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3231 == arg0.field1375) {
                class65 var301 = new class65();
                var301.field805 = var3.method7725();
                var301.field806 = var3.method7716();
                int var302 = var3.method7720();
                var301.field803 = var302;
                method300(45);
                var2.method6853();
                Object var303 = null;
                class73.method1316(var301);
                arg0.field1375 = null;
                return false;
            }
            if (class276.field3155 == arg0.field1375) {
                field747 = var3.method7735();
                if (field747 == 255) {
                    field747 = 0;
                }
                field748 = var3.method7735();
                if (field748 == 255) {
                    field748 = 0;
                }
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3168 == arg0.field1375) {
                Statics.field2726.method1759();
                field702 = field736;
                arg0.field1375 = null;
                return true;
            }
            if (class276.field3131 == arg0.field1375) {
                int var304 = var3.method7796();
                int var305 = var3.method7747();
                int var306 = var305 >> 2;
                int var307 = var305 & 0x3;
                int var308 = field566[var306];
                int var309 = var3.method7906();
                int var310 = var309 >> 16;
                int var311 = var309 >> 8 & 0xFF;
                int var312 = (var309 >> 4 & 0x7) + var310;
                int var313 = (var309 & 0x7) + var311;
                if (var312 >= 0 && var313 >= 0 && var312 < 103 && var313 < 103) {
                    if (var308 == 0) {
                        class226 var314 = Statics.field1615.method3946(Statics.field478, var312, var313);
                        if (var314 != null) {
                            int var315 = class222.method2431(var314.field2708);
                            if (var306 == 2) {
                                var314.field2701 = new class77(var315, 2, var307 + 4, Statics.field478, var312, var313, var304, false, var314.field2701);
                                var314.field2707 = new class77(var315, 2, var307 + 1 & 0x3, Statics.field478, var312, var313, var304, false, var314.field2707);
                            } else {
                                var314.field2701 = new class77(var315, var306, var307, Statics.field478, var312, var313, var304, false, var314.field2701);
                            }
                        }
                    } else if (var308 == 1) {
                        class228 var316 = Statics.field1615.method3947(Statics.field478, var312, var313);
                        if (var316 != null) {
                            int var317 = class222.method2431(var316.field2722);
                            if (var306 == 4 || var306 == 5) {
                                var316.field2720 = new class77(var317, 4, var307, Statics.field478, var312, var313, var304, false, var316.field2720);
                            } else if (var306 == 6) {
                                var316.field2720 = new class77(var317, 4, var307 + 4, Statics.field478, var312, var313, var304, false, var316.field2720);
                            } else if (var306 == 7) {
                                var316.field2720 = new class77(var317, 4, (var307 + 2 & 0x3) + 4, Statics.field478, var312, var313, var304, false, var316.field2720);
                            } else if (var306 == 8) {
                                var316.field2720 = new class77(var317, 4, var307 + 4, Statics.field478, var312, var313, var304, false, var316.field2720);
                                var316.field2723 = new class77(var317, 4, (var307 + 2 & 0x3) + 4, Statics.field478, var312, var313, var304, false, var316.field2723);
                            }
                        }
                    } else if (var308 == 2) {
                        class229 var318 = Statics.field1615.method4078(Statics.field478, var312, var313);
                        if (var306 == 11) {
                            var306 = 10;
                        }
                        if (var318 != null) {
                            var318.field2731 = new class77(class222.method2431(var318.field2739), var306, var307, Statics.field478, var312, var313, var304, false, var318.field2731);
                        }
                    } else if (var308 == 3) {
                        class207 var319 = Statics.field1615.method3949(Statics.field478, var312, var313);
                        if (var319 != null) {
                            var319.field2356 = new class77(class222.method2431(var319.field2357), 22, var307, Statics.field478, var312, var313, var304, false, var319.field2356);
                        }
                    }
                }
                arg0.field1375 = null;
                return true;
            }
            class489.method7161("" + (arg0.field1375 == null ? -1 : arg0.field1375.field3242) + class97.field1272 + (arg0.field1374 == null ? -1 : arg0.field1374.field3242) + class97.field1272 + (arg0.field1382 == null ? -1 : arg0.field1382.field3242) + class97.field1272 + arg0.field1377, (Throwable) null);
            method6608();
        } catch (IOException var324) {
            method4667();
        } catch (Exception var325) {
            String var322 = "" + (arg0.field1375 == null ? -1 : arg0.field1375.field3242) + class97.field1272 + (arg0.field1374 == null ? -1 : arg0.field1374.field3242) + class97.field1272 + (arg0.field1382 == null ? -1 : arg0.field1382.field3242) + class97.field1272 + arg0.field1377 + class97.field1272 + (Statics.field142 + Statics.field3404.field1197[0]) + class97.field1272 + (Statics.field1754 + Statics.field3404.field1209[0]) + class97.field1272;
            for (int var323 = 0; var323 < arg0.field1377 && var323 < 50; var323++) {
                var322 = var322 + var3.field4867[var323] + class97.field1272;
            }
            class489.method7161(var322, var325);
            method6608();
        }
        return true;
    }

    @ObfuscatedName("md.ib(Ljk;I)V")
    public static final void method6293(class274 arg0) {
        class463 var1 = field636.field1378;
        if (class274.field3113 == arg0) {
            int var2 = var1.method7796();
            int var3 = var1.method7747() * 4;
            byte var4 = var1.method7881();
            int var5 = var1.method7756();
            int var6 = var1.method7748();
            int var7 = var1.method7747();
            int var8 = var1.method7750();
            int var9 = var1.method7735();
            int var10 = (var9 >> 4 & 0x7) + Statics.field123;
            int var11 = (var9 & 0x7) + Statics.field65;
            byte var12 = var1.method7781();
            int var13 = var1.method7935() * 4;
            int var14 = var1.method7756();
            int var15 = var4 + var10;
            int var16 = var11 + var12;
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var5 != 65535) {
                int var17 = var10 * 128 + 64;
                int var18 = var11 * 128 + 64;
                int var19 = var15 * 128 + 64;
                int var20 = var16 * 128 + 64;
                class74 var21 = new class74(var5, Statics.field478, var17, var18, method2836(var17, var18, Statics.field478) - var13, field503 + var2, field503 + var14, var6, var7, var8, var3);
                var21.method2000(var19, var20, method2836(var19, var20, Statics.field478) - var3, field503 + var2);
                field711.method6031(var21);
            }
            return;
        }
        if (class274.field3110 == arg0) {
            int var22 = var1.method7756();
            int var23 = var1.method7747();
            int var24 = var1.method7747();
            int var25 = var24 >> 4 & 0xF;
            int var26 = var24 & 0x7;
            int var27 = var1.method7747();
            int var28 = (var27 >> 4 & 0x7) + Statics.field123;
            int var29 = (var27 & 0x7) + Statics.field65;
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                int var30 = var25 + 1;
                if (Statics.field3404.field1197[0] >= var28 - var30 && Statics.field3404.field1197[0] <= var28 + var30 && Statics.field3404.field1209[0] >= var29 - var30 && Statics.field3404.field1209[0] <= var29 + var30 && Statics.field4526.method2312() != 0 && var26 > 0 && field752 < 50) {
                    field753[field752] = var22;
                    field754[field752] = var26;
                    field755[field752] = var23;
                    field757[field752] = null;
                    field592[field752] = (var28 << 16) + (var29 << 8) + var25;
                    field752++;
                }
            }
        }
        if (class274.field3109 == arg0) {
            var1.method7758();
            int var31 = var1.method7796();
            int var32 = var1.method7747();
            int var33 = (var32 >> 4 & 0x7) + Statics.field123;
            int var34 = (var32 & 0x7) + Statics.field65;
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                class349 var35 = field723[Statics.field478][var33][var34];
                if (var35 != null) {
                    for (class100 var36 = (class100) var35.method6040(); var36 != null; var36 = (class100) var35.method6034()) {
                        if ((var31 & 0x7FFF) == var36.field1303) {
                            var36.method7170();
                            break;
                        }
                    }
                    if (var35.method6040() == null) {
                        field723[Statics.field478][var33][var34] = null;
                    }
                    method3042(var33, var34);
                }
            }
            return;
        }
        if (class274.field3107 == arg0) {
            int var37 = var1.method7758();
            byte var38 = var1.method7781();
            int var39 = var1.method7735();
            int var40 = var39 >> 2;
            int var41 = var39 & 0x3;
            int var42 = field566[var40];
            int var43 = var1.method7735();
            int var44 = (var43 >> 4 & 0x7) + Statics.field123;
            int var45 = (var43 & 0x7) + Statics.field65;
            byte var46 = var1.method7881();
            byte var47 = var1.method7781();
            byte var48 = var1.method7752();
            int var49 = var1.method7716();
            int var50 = var1.method7758();
            int var51 = var1.method7796();
            class89 var52;
            if (field622 == var50) {
                var52 = Statics.field3404;
            } else {
                var52 = field621[var50];
            }
            if (var52 != null) {
                class194 var53 = class194.method2141(var51);
                int var54;
                int var55;
                if (var41 == 1 || var41 == 3) {
                    var54 = var53.field2098;
                    var55 = var53.field2129;
                } else {
                    var54 = var53.field2129;
                    var55 = var53.field2098;
                }
                int var56 = (var54 >> 1) + var44;
                int var57 = (var54 + 1 >> 1) + var44;
                int var58 = (var55 >> 1) + var45;
                int var59 = (var55 + 1 >> 1) + var45;
                int[][] var60 = class79.field998[Statics.field478];
                int var61 = var60[var56][var58] + var60[var57][var58] + var60[var56][var59] + var60[var57][var59] >> 2;
                int var62 = (var44 << 7) + (var54 << 6);
                int var63 = (var45 << 7) + (var55 << 6);
                class221 var64 = var53.method3428(var40, var41, var60, var62, var61, var63);
                if (var64 != null) {
                    method5777(Statics.field478, var44, var45, var42, -1, 0, 0, 31, var37 + 1, var49 + 1);
                    var52.field1099 = field503 + var37;
                    var52.field1100 = field503 + var49;
                    var52.field1104 = var64;
                    var52.field1096 = var44 * 128 + var54 * 64;
                    var52.field1101 = var45 * 128 + var55 * 64;
                    var52.field1102 = var61;
                    if (var46 > var47) {
                        byte var65 = var46;
                        var46 = var47;
                        var47 = var65;
                    }
                    if (var38 > var48) {
                        byte var66 = var38;
                        var38 = var48;
                        var48 = var66;
                    }
                    var52.field1105 = var44 + var46;
                    var52.field1107 = var44 + var47;
                    var52.field1106 = var38 + var45;
                    var52.field1097 = var45 + var48;
                }
            }
        }
        if (class274.field3112 == arg0) {
            int var67 = var1.method7748() * 4;
            byte var68 = var1.method7881();
            int var69 = var1.method7758();
            int var70 = var1.method7756();
            int var71 = var1.method7758();
            int var72 = var1.method7748();
            int var73 = var1.method7748() * 4;
            byte var74 = var1.method7752();
            int var75 = var1.method7935();
            int var76 = (var75 >> 4 & 0x7) + Statics.field123;
            int var77 = (var75 & 0x7) + Statics.field65;
            int var78 = var1.method7760();
            int var79 = var1.method7735();
            int var80 = var74 + var76;
            int var81 = var68 + var77;
            if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104 && var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104 && var69 != 65535) {
                int var82 = var76 * 128 + 64;
                int var83 = var77 * 128 + 64;
                int var84 = var80 * 128 + 64;
                int var85 = var81 * 128 + 64;
                class74 var86 = new class74(var69, Statics.field478, var82, var83, method2836(var82, var83, Statics.field478) - var67, field503 + var71, field503 + var70, var79, var72, var78, var73);
                var86.method2000(var84, var85, method2836(var84, var85, Statics.field478) - var73, field503 + var71);
                field711.method6031(var86);
            }
        } else if (class274.field3115 == arg0) {
            int var87 = var1.method7935();
            int var88 = var1.method7716();
            int var89 = var1.method7735();
            int var90 = (var89 >> 4 & 0x7) + Statics.field123;
            int var91 = (var89 & 0x7) + Statics.field65;
            int var92 = var1.method7796();
            if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                int var93 = var90 * 128 + 64;
                int var94 = var91 * 128 + 64;
                class69 var95 = new class69(var92, Statics.field478, var93, var94, method2836(var93, var94, Statics.field478) - var87, var88, field503);
                field637.method6031(var95);
            }
        } else if (class274.field3120 == arg0) {
            int var96 = var1.method7935();
            int var97 = var96 >> 2;
            int var98 = var96 & 0x3;
            int var99 = field566[var97];
            int var100 = var1.method7716();
            int var101 = var1.method7735();
            int var102 = (var101 >> 4 & 0x7) + Statics.field123;
            int var103 = (var101 & 0x7) + Statics.field65;
            if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                method5777(Statics.field478, var102, var103, var99, var100, var97, var98, 31, 0, -1);
            }
        } else if (class274.field3111 == arg0) {
            int var104 = var1.method7716();
            int var105 = var1.method7747();
            int var106 = (var105 >> 4 & 0x7) + Statics.field123;
            int var107 = (var105 & 0x7) + Statics.field65;
            int var108 = var1.method7758();
            if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                class100 var109 = new class100();
                var109.field1303 = var108;
                var109.field1298 = var104;
                if (field723[Statics.field478][var106][var107] == null) {
                    field723[Statics.field478][var106][var107] = new class349();
                }
                field723[Statics.field478][var106][var107].method6031(var109);
                method3042(var106, var107);
            }
        } else if (class274.field3108 == arg0) {
            int var110 = var1.method7935();
            int var111 = (var110 >> 4 & 0x7) + Statics.field123;
            int var112 = (var110 & 0x7) + Statics.field65;
            int var113 = var1.method7796();
            int var114 = var1.method7747();
            int var115 = var114 >> 2;
            int var116 = var114 & 0x3;
            int var117 = field566[var115];
            if (var111 >= 0 && var112 >= 0 && var111 < 103 && var112 < 103) {
                if (var117 == 0) {
                    class226 var118 = Statics.field1615.method3946(Statics.field478, var111, var112);
                    if (var118 != null) {
                        int var119 = class222.method2431(var118.field2708);
                        if (var115 == 2) {
                            var118.field2701 = new class77(var119, 2, var116 + 4, Statics.field478, var111, var112, var113, false, var118.field2701);
                            var118.field2707 = new class77(var119, 2, var116 + 1 & 0x3, Statics.field478, var111, var112, var113, false, var118.field2707);
                        } else {
                            var118.field2701 = new class77(var119, var115, var116, Statics.field478, var111, var112, var113, false, var118.field2701);
                        }
                    }
                }
                if (var117 == 1) {
                    class228 var120 = Statics.field1615.method3947(Statics.field478, var111, var112);
                    if (var120 != null) {
                        int var121 = class222.method2431(var120.field2722);
                        if (var115 == 4 || var115 == 5) {
                            var120.field2720 = new class77(var121, 4, var116, Statics.field478, var111, var112, var113, false, var120.field2720);
                        } else if (var115 == 6) {
                            var120.field2720 = new class77(var121, 4, var116 + 4, Statics.field478, var111, var112, var113, false, var120.field2720);
                        } else if (var115 == 7) {
                            var120.field2720 = new class77(var121, 4, (var116 + 2 & 0x3) + 4, Statics.field478, var111, var112, var113, false, var120.field2720);
                        } else if (var115 == 8) {
                            var120.field2720 = new class77(var121, 4, var116 + 4, Statics.field478, var111, var112, var113, false, var120.field2720);
                            var120.field2723 = new class77(var121, 4, (var116 + 2 & 0x3) + 4, Statics.field478, var111, var112, var113, false, var120.field2723);
                        }
                    }
                }
                if (var117 == 2) {
                    class229 var122 = Statics.field1615.method4078(Statics.field478, var111, var112);
                    if (var115 == 11) {
                        var115 = 10;
                    }
                    if (var122 != null) {
                        var122.field2731 = new class77(class222.method2431(var122.field2739), var115, var116, Statics.field478, var111, var112, var113, false, var122.field2731);
                    }
                }
                if (var117 == 3) {
                    class207 var123 = Statics.field1615.method3949(Statics.field478, var111, var112);
                    if (var123 != null) {
                        var123.field2356 = new class77(class222.method2431(var123.field2357), 22, var116, Statics.field478, var111, var112, var113, false, var123.field2356);
                    }
                }
            }
        } else if (class274.field3117 == arg0) {
            int var124 = var1.method7748();
            int var125 = (var124 >> 4 & 0x7) + Statics.field123;
            int var126 = (var124 & 0x7) + Statics.field65;
            int var127 = var1.method7756();
            int var128 = var1.method7756();
            int var129 = var1.method7716();
            if (var125 >= 0 && var126 >= 0 && var125 < 104 && var126 < 104) {
                class349 var130 = field723[Statics.field478][var125][var126];
                if (var130 != null) {
                    for (class100 var131 = (class100) var130.method6040(); var131 != null; var131 = (class100) var130.method6034()) {
                        if ((var129 & 0x7FFF) == var131.field1303 && var131.field1298 == var127) {
                            var131.field1298 = var128;
                            break;
                        }
                    }
                    method3042(var125, var126);
                }
            }
        } else if (class274.field3118 == arg0) {
            int var132 = var1.method7748();
            int var133 = (var132 >> 4 & 0x7) + Statics.field123;
            int var134 = (var132 & 0x7) + Statics.field65;
            int var135 = var1.method7747();
            int var136 = var1.method7758();
            if (var133 >= 0 && var134 >= 0 && var133 < 104 && var134 < 104) {
                class349 var137 = field723[Statics.field478][var133][var134];
                if (var137 != null) {
                    for (class100 var138 = (class100) var137.method6040(); var138 != null; var138 = (class100) var137.method6034()) {
                        if ((var136 & 0x7FFF) == var138.field1303) {
                            var138.method2438(var135);
                            break;
                        }
                    }
                }
            }
        } else if (class274.field3114 == arg0) {
            int var139 = var1.method7735();
            int var140 = var139 >> 2;
            int var141 = var139 & 0x3;
            int var142 = field566[var140];
            int var143 = var1.method7735();
            int var144 = (var143 >> 4 & 0x7) + Statics.field123;
            int var145 = (var143 & 0x7) + Statics.field65;
            if (var144 >= 0 && var145 >= 0 && var144 < 104 && var145 < 104) {
                method5777(Statics.field478, var144, var145, var142, -1, var140, var141, 31, 0, -1);
            }
        } else if (class274.field3122 == arg0) {
            int var146 = var1.method7735();
            int var147 = var1.method7768();
            int var148 = var1.method7748();
            int var149 = (var148 >> 4 & 0x7) + Statics.field123;
            int var150 = (var148 & 0x7) + Statics.field65;
            int var151 = var1.method7796();
            if (var149 >= 0 && var150 >= 0 && var149 < 104 && var150 < 104) {
                class100 var152 = new class100();
                var152.field1303 = var151;
                var152.field1298 = var147;
                var152.method2438(var146);
                if (field723[Statics.field478][var149][var150] == null) {
                    field723[Statics.field478][var149][var150] = new class349();
                }
                field723[Statics.field478][var149][var150].method6031(var152);
                method3042(var149, var150);
            }
        } else if (class274.field3119 == arg0) {
            int var153 = var1.method7796();
            int var154 = var1.method7747();
            int var155 = var1.method7935();
            int var156 = (var155 >> 4 & 0x7) + Statics.field123;
            int var157 = (var155 & 0x7) + Statics.field65;
            int var158 = var1.method7747();
            int var159 = var158 >> 2;
            int var160 = var158 & 0x3;
            int var161 = field566[var159];
            if (var156 >= 0 && var157 >= 0 && var156 < 104 && var157 < 104) {
                method5777(Statics.field478, var156, var157, var161, var153, var159, var160, var154, 0, -1);
            }
        }
    }

    @ObfuscatedName("lw.ir(IIIIIIIIIIB)V")
    public static final void method5777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class90 var10 = null;
        for (class90 var11 = (class90) field635.method6040(); var11 != null; var11 = (class90) field635.method6034()) {
            if (var11.field1123 == arg0 && var11.field1129 == arg1 && var11.field1124 == arg2 && var11.field1122 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class90();
            var10.field1123 = arg0;
            var10.field1122 = arg3;
            var10.field1129 = arg1;
            var10.field1124 = arg2;
            method3222(var10);
            field635.method6031(var10);
        }
        var10.field1128 = arg4;
        var10.field1130 = arg5;
        var10.field1121 = arg6;
        var10.field1136 = arg8;
        var10.field1133 = arg9;
        var10.method2214(arg7);
    }

    @ObfuscatedName("bn.ie(I)V")
    public static final void method2010() {
        for (class90 var0 = (class90) field635.method6040(); var0 != null; var0 = (class90) field635.method6034()) {
            if (var0.field1133 == -1) {
                var0.field1136 = 0;
                method3222(var0);
            } else {
                var0.method7170();
            }
        }
    }

    @ObfuscatedName("gj.ia(Lcw;I)V")
    public static final void method3222(class90 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1122 == 0) {
            var1 = Statics.field1615.method3987(arg0.field1123, arg0.field1129, arg0.field1124);
        }
        if (arg0.field1122 == 1) {
            var1 = Statics.field1615.method3951(arg0.field1123, arg0.field1129, arg0.field1124);
        }
        if (arg0.field1122 == 2) {
            var1 = Statics.field1615.method3952(arg0.field1123, arg0.field1129, arg0.field1124);
        }
        if (arg0.field1122 == 3) {
            var1 = Statics.field1615.method3953(arg0.field1123, arg0.field1129, arg0.field1124);
        }
        if (var1 != 0L) {
            int var6 = Statics.field1615.method3958(arg0.field1123, arg0.field1129, arg0.field1124, var1);
            var3 = class222.method2431(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1125 = var3;
        arg0.field1127 = var4;
        arg0.field1126 = var5;
    }

    @ObfuscatedName("ls.is(IIIIIIII)V")
    public static final void method5704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field494 && Statics.field478 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field1615.method3987(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1615.method3951(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1615.method3952(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1615.method3953(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field1615.method3958(arg0, arg2, arg3, var7);
            int var13 = class222.method2431(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1615.method4034(arg0, arg2, arg3);
                class194 var16 = class194.method2141(var13);
                if (var16.field2099 != 0) {
                    field742[arg0].method3685(arg2, arg3, var14, var15, var16.field2100);
                }
            }
            if (arg1 == 1) {
                Statics.field1615.method3927(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1615.method3972(arg0, arg2, arg3);
                class194 var17 = class194.method2141(var13);
                if (var17.field2129 + arg2 > 103 || var17.field2129 + arg3 > 103 || var17.field2098 + arg2 > 103 || var17.field2098 + arg3 > 103) {
                    return;
                }
                if (var17.field2099 != 0) {
                    field742[arg0].method3667(arg2, arg3, var17.field2129, var17.field2098, var15, var17.field2100);
                }
            }
            if (arg1 == 3) {
                Statics.field1615.method3944(arg0, arg2, arg3);
                class194 var18 = class194.method2141(var13);
                if (var18.field2099 == 1) {
                    field742[arg0].method3669(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class79.field993[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class214 var20 = Statics.field1615;
        class201 var21 = field742[arg0];
        class194 var22 = class194.method2141(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field2098;
            var24 = var22.field2129;
        } else {
            var23 = var22.field2129;
            var24 = var22.field2098;
        }
        int var25;
        int var26;
        if (arg2 + var23 <= 104) {
            var25 = (var23 >> 1) + arg2;
            var26 = (var23 + 1 >> 1) + arg2;
        } else {
            var25 = arg2;
            var26 = arg2 + 1;
        }
        int var27;
        int var28;
        if (arg3 + var24 <= 104) {
            var27 = (var24 >> 1) + arg3;
            var28 = (var24 + 1 >> 1) + arg3;
        } else {
            var27 = arg3;
            var28 = arg3 + 1;
        }
        int[][] var29 = class79.field998[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class222.method3289(arg2, arg3, 2, var22.field2101 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field2122 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class215 var36;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var36 = var22.method3428(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class77(arg4, 22, arg5, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method3930(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field2099 == 1) {
                var21.method3665(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class215 var62;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var62 = var22.method3428(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class77(arg4, 10, arg5, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            if (var62 != null) {
                var20.method3968(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field2099 != 0) {
                var21.method3663(arg2, arg3, var23, var24, var22.field2100);
            }
        } else if (arg6 >= 12) {
            class215 var37;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var37 = var22.method3428(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class77(arg4, arg6, arg5, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method3968(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field2099 != 0) {
                var21.method3663(arg2, arg3, var23, var24, var22.field2100);
            }
        } else if (arg6 == 0) {
            class215 var38;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var38 = var22.method3428(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class77(arg4, 0, arg5, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method4030(arg0, arg2, arg3, var30, var38, (class215) null, class79.field1000[arg5], 0, var33, var35);
            if (var22.field2099 != 0) {
                var21.method3662(arg2, arg3, arg6, arg5, var22.field2100);
            }
        } else if (arg6 == 1) {
            class215 var39;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var39 = var22.method3428(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class77(arg4, 1, arg5, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method4030(arg0, arg2, arg3, var30, var39, (class215) null, class79.field1001[arg5], 0, var33, var35);
            if (var22.field2099 != 0) {
                var21.method3662(arg2, arg3, arg6, arg5, var22.field2100);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class215 var41;
            class215 var42;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var41 = var22.method3428(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method3428(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class77(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
                var42 = new class77(arg4, 2, var40, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method4030(arg0, arg2, arg3, var30, var41, var42, class79.field1000[arg5], class79.field1000[var40], var33, var35);
            if (var22.field2099 != 0) {
                var21.method3662(arg2, arg3, arg6, arg5, var22.field2100);
            }
        } else if (arg6 == 3) {
            class215 var43;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var43 = var22.method3428(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class77(arg4, 3, arg5, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method4030(arg0, arg2, arg3, var30, var43, (class215) null, class79.field1001[arg5], 0, var33, var35);
            if (var22.field2099 != 0) {
                var21.method3662(arg2, arg3, arg6, arg5, var22.field2100);
            }
        } else if (arg6 == 9) {
            class215 var44;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var44 = var22.method3428(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class77(arg4, arg6, arg5, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method3968(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field2099 != 0) {
                var21.method3663(arg2, arg3, var23, var24, var22.field2100);
            }
        } else if (arg6 == 4) {
            class215 var45;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var45 = var22.method3428(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class77(arg4, 4, arg5, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method3943(arg0, arg2, arg3, var30, var45, (class215) null, class79.field1000[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method3987(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class194.method2141(class222.method2431(var47)).field2106;
            }
            class215 var49;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var49 = var22.method3428(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class77(arg4, 4, arg5, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method3943(arg0, arg2, arg3, var30, var49, (class215) null, class79.field1000[arg5], 0, class79.field992[arg5] * var46, class79.field1004[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method3987(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class194.method2141(class222.method2431(var51)).field2106 / 2;
            }
            class215 var53;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var53 = var22.method3428(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class77(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method3943(arg0, arg2, arg3, var30, var53, (class215) null, 256, arg5, class79.field994[arg5] * var50, class79.field1005[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class215 var55;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var55 = var22.method3428(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class77(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method3943(arg0, arg2, arg3, var30, var55, (class215) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method3987(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class194.method2141(class222.method2431(var57)).field2106 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class215 var60;
            class215 var61;
            if (var22.field2105 == -1 && var22.field2123 == null) {
                var60 = var22.method3428(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method3428(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class77(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
                var61 = new class77(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field2105, var22.field2128, (class215) null);
            }
            var20.method3943(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class79.field994[arg5] * var56, class79.field1005[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("ft.ig(III)V")
    public static final void method3042(int arg0, int arg1) {
        class349 var2 = field723[Statics.field478][arg0][arg1];
        if (var2 == null) {
            Statics.field1615.method3945(Statics.field478, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class100 var5 = null;
        for (class100 var6 = (class100) var2.method6040(); var6 != null; var6 = (class100) var2.method6034()) {
            class195 var7 = class195.method5052(var6.field1303);
            long var8 = (long) var7.field2156;
            if (var7.field2155 == 1) {
                var8 = (long) (var6.field1298 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1615.method3945(Statics.field478, arg0, arg1);
            return;
        }
        var2.method6029(var5);
        class100 var10 = null;
        class100 var11 = null;
        for (class100 var12 = (class100) var2.method6040(); var12 != null; var12 = (class100) var2.method6034()) {
            if (var5.field1303 != var12.field1303) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1303 != var12.field1303 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class222.method3289(arg0, arg1, 3, false, 0);
        Statics.field1615.method3931(Statics.field478, arg0, arg1, method2836(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field478), var5, var13, var10, var11);
    }

    @ObfuscatedName("ib.iz(ZLqk;B)V")
    public static final void method4670(boolean arg0, class463 arg1) {
        field627 = 0;
        field551 = 0;
        method2843();
        while (true) {
            int var2 = Statics.field2734 ? 16 : 15;
            int var3 = 0x1 << var2;
            if (arg1.method7695(field636.field1377) < var2 + 12) {
                break;
            }
            int var4 = arg1.method7665(var2);
            if (var3 - 1 == var4) {
                break;
            }
            boolean var36 = false;
            if (field760[var4] == null) {
                field760[var4] = new class96();
                var36 = true;
            }
            class96 var37 = field760[var4];
            field550[++field549 - 1] = var4;
            var37.field1183 = field503;
            int var40;
            int var41;
            int var43;
            if (Statics.field2734) {
                int var38 = arg1.method7665(1);
                if (var38 == 1) {
                    field552[++field551 - 1] = var4;
                }
                boolean var39 = arg1.method7665(1) == 1;
                if (var39) {
                    arg1.method7665(32);
                }
                var40 = arg1.method7665(1);
                var37.field1267 = class185.method3209(arg1.method7665(14));
                if (arg0) {
                    var41 = arg1.method7665(8);
                    if (var41 > 127) {
                        var41 -= 256;
                    }
                } else {
                    var41 = arg1.method7665(5);
                    if (var41 > 15) {
                        var41 -= 32;
                    }
                }
                int var42 = field632[arg1.method7665(3)];
                if (var36) {
                    var37.field1196 = var37.field1162 = var42;
                }
                if (arg0) {
                    var43 = arg1.method7665(8);
                    if (var43 > 127) {
                        var43 -= 256;
                    }
                } else {
                    var43 = arg1.method7665(5);
                    if (var43 > 15) {
                        var43 -= 32;
                    }
                }
            } else {
                var37.field1267 = class185.method3209(arg1.method7665(14));
                if (arg0) {
                    var43 = arg1.method7665(8);
                    if (var43 > 127) {
                        var43 -= 256;
                    }
                } else {
                    var43 = arg1.method7665(5);
                    if (var43 > 15) {
                        var43 -= 32;
                    }
                }
                if (arg0) {
                    var41 = arg1.method7665(8);
                    if (var41 > 127) {
                        var41 -= 256;
                    }
                } else {
                    var41 = arg1.method7665(5);
                    if (var41 > 15) {
                        var41 -= 32;
                    }
                }
                var40 = arg1.method7665(1);
                int var44 = field632[arg1.method7665(3)];
                if (var36) {
                    var37.field1196 = var37.field1162 = var44;
                }
                int var45 = arg1.method7665(1);
                if (var45 == 1) {
                    field552[++field551 - 1] = var4;
                }
                boolean var46 = arg1.method7665(1) == 1;
                if (var46) {
                    arg1.method7665(32);
                }
            }
            var37.field1202 = var37.field1267.field1961;
            var37.field1206 = var37.field1267.field1998;
            if (var37.field1206 == 0) {
                var37.field1162 = 0;
            }
            var37.field1146 = var37.field1267.field1967;
            var37.field1147 = var37.field1267.field1968;
            var37.field1148 = var37.field1267.field1969;
            var37.field1149 = var37.field1267.field1970;
            var37.field1159 = var37.field1267.field1964;
            var37.field1144 = var37.field1267.field1965;
            var37.field1142 = var37.field1267.field1963;
            var37.field1150 = var37.field1267.field1971;
            var37.field1182 = var37.field1267.field1985;
            var37.field1152 = var37.field1267.field1973;
            var37.field1153 = var37.field1267.field1955;
            var37.field1154 = var37.field1267.field1972;
            var37.field1210 = var37.field1267.field1976;
            var37.field1185 = var37.field1267.field1996;
            var37.field1157 = var37.field1267.field1993;
            var37.method2396(Statics.field3404.field1197[0] + var41, Statics.field3404.field1209[0] + var43, var40 == 1);
        }
        arg1.method7661();
        for (int var5 = 0; var5 < field551; var5++) {
            int var6 = field552[var5];
            class96 var7 = field760[var6];
            int var8 = arg1.method7735();
            if ((var8 & 0x20) != 0) {
                int var9 = arg1.method7735();
                var8 += var9 << 8;
            }
            if ((var8 & 0x2) != 0) {
                var7.field1184 = arg1.method7756();
                int var10 = arg1.method7720();
                var7.field1160 = var10 >> 16;
                var7.field1187 = (var10 & 0xFFFF) + field503;
                var7.field1192 = 0;
                var7.field1143 = 0;
                if (var7.field1187 > field503) {
                    var7.field1192 = -1;
                }
                if (var7.field1184 == 65535) {
                    var7.field1184 = -1;
                }
            }
            if ((var8 & 0x8) != 0) {
                int var11 = arg1.method7935();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg1.method7801();
                        if (var16 == 32767) {
                            var16 = arg1.method7801();
                            var14 = arg1.method7801();
                            var13 = arg1.method7801();
                            var15 = arg1.method7801();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg1.method7801();
                        }
                        int var17 = arg1.method7801();
                        var7.method2226(var16, var14, var13, var15, field503, var17);
                    }
                }
                int var18 = arg1.method7747();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg1.method7801();
                        int var21 = arg1.method7801();
                        if (var21 == 32767) {
                            var7.method2222(var20);
                        } else {
                            int var22 = arg1.method7801();
                            int var23 = arg1.method7935();
                            int var24 = var21 > 0 ? arg1.method7747() : var23;
                            var7.method2219(var20, field503, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var8 & 0x800) != 0) {
                var7.method2389(arg1.method7725());
            }
            if ((var8 & 0x200) != 0) {
                var7.field1213 = arg1.method7768();
            }
            if ((var8 & 0x4) != 0) {
                int var25 = arg1.method7756();
                int var26 = arg1.method7758();
                var7.field1174 = arg1.method7747() == 1;
                int var27 = var7.field1163 - (var25 - Statics.field142 - Statics.field142) * 64;
                int var28 = var7.field1138 - (var26 - Statics.field1754 - Statics.field1754) * 64;
                if (var27 != 0 || var28 != 0) {
                    var7.field1204 = (int) (Math.atan2((double) var27, (double) var28) * 325.949D) & 0x7FF;
                }
            }
            if ((var8 & 0x80) != 0) {
                int var29 = arg1.method7716();
                if (var29 == 65535) {
                    var29 = -1;
                }
                int var30 = arg1.method7935();
                if (var7.field1188 == var29 && var29 != -1) {
                    int var31 = class197.method3143(var29).field2233;
                    if (var31 == 1) {
                        var7.field1180 = 0;
                        var7.field1181 = 0;
                        var7.field1140 = var30;
                        var7.field1211 = 0;
                    }
                    if (var31 == 2) {
                        var7.field1211 = 0;
                    }
                } else if (var29 == -1 || var7.field1188 == -1 || class197.method3143(var29).field2226 >= class197.method3143(var7.field1188).field2226) {
                    var7.field1188 = var29;
                    var7.field1180 = 0;
                    var7.field1181 = 0;
                    var7.field1140 = var30;
                    var7.field1211 = 0;
                    var7.field1212 = var7.field1207;
                }
            }
            if ((var8 & 0x40) != 0) {
                var7.field1158 = arg1.method7725();
                var7.field1179 = 100;
            }
            if ((var8 & 0x400) != 0) {
                var7.field1151 = arg1.method7929();
                var7.field1191 = arg1.method7781();
                var7.field1190 = arg1.method7929();
                var7.field1189 = arg1.method7881();
                var7.field1193 = arg1.method7716() + field503;
                var7.field1194 = arg1.method7716() + field503;
                var7.field1195 = arg1.method7758();
                var7.field1207 = 1;
                var7.field1212 = 0;
                var7.field1151 += var7.field1197[0];
                var7.field1191 += var7.field1209[0];
                var7.field1190 += var7.field1197[0];
                var7.field1189 += var7.field1209[0];
            }
            if ((var8 & 0x1000) != 0) {
                var7.field1198 = field503 + arg1.method7758();
                var7.field1199 = field503 + arg1.method7796();
                var7.field1200 = arg1.method7881();
                var7.field1201 = arg1.method7752();
                var7.field1186 = arg1.method7881();
                var7.field1203 = (byte) arg1.method7735();
            }
            if ((var8 & 0x1) != 0) {
                var7.field1171 = arg1.method7756();
                int var32;
                if (Statics.field2734) {
                    var7.field1171 += arg1.method7747() << 16;
                    var32 = 16777215;
                } else {
                    var32 = 65535;
                }
                if (var7.field1171 == var32) {
                    var7.field1171 = -1;
                }
            }
            if ((var8 & 0x10) != 0) {
                var7.field1267 = class185.method3209(arg1.method7756());
                var7.field1202 = var7.field1267.field1961;
                var7.field1206 = var7.field1267.field1998;
                var7.field1146 = var7.field1267.field1967;
                var7.field1147 = var7.field1267.field1968;
                var7.field1148 = var7.field1267.field1969;
                var7.field1149 = var7.field1267.field1970;
                var7.field1159 = var7.field1267.field1964;
                var7.field1144 = var7.field1267.field1965;
                var7.field1142 = var7.field1267.field1963;
            }
            if ((var8 & 0x100) != 0) {
                var7.method2390(arg1.method7747());
            }
        }
        for (int var33 = 0; var33 < field627; var33++) {
            int var34 = field628[var33];
            if (field503 != field760[var34].field1183) {
                field760[var34].field1267 = null;
                field760[var34] = null;
            }
        }
        if (field636.field1377 != arg1.field4864) {
            throw new RuntimeException(arg1.field4864 + class97.field1272 + field636.field1377);
        }
        for (int var35 = 0; var35 < field549; var35++) {
            if (field760[field550[var35]] == null) {
                throw new RuntimeException(var35 + class97.field1272 + field549);
            }
        }
    }

    @ObfuscatedName("ec.ip(I)V")
    public static final void method2843() {
        class463 var0 = field636.field1378;
        var0.method7664();
        int var1 = var0.method7665(8);
        if (var1 < field549) {
            for (int var2 = var1; var2 < field549; var2++) {
                field628[++field627 - 1] = field550[var2];
            }
        }
        if (var1 > field549) {
            throw new RuntimeException("");
        }
        field549 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field550[var3];
            class96 var5 = field760[var4];
            int var6 = var0.method7665(1);
            if (var6 == 0) {
                field550[++field549 - 1] = var4;
                var5.field1183 = field503;
            } else {
                int var7 = var0.method7665(2);
                if (var7 == 0) {
                    field550[++field549 - 1] = var4;
                    var5.field1183 = field503;
                    field552[++field551 - 1] = var4;
                } else if (var7 == 1) {
                    field550[++field549 - 1] = var4;
                    var5.field1183 = field503;
                    int var8 = var0.method7665(3);
                    var5.method2388(var8, class203.field2283);
                    int var9 = var0.method7665(1);
                    if (var9 == 1) {
                        field552[++field551 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field550[++field549 - 1] = var4;
                    var5.field1183 = field503;
                    if (var0.method7665(1) == 1) {
                        int var10 = var0.method7665(3);
                        var5.method2388(var10, class203.field2285);
                        int var11 = var0.method7665(3);
                        var5.method2388(var11, class203.field2285);
                    } else {
                        int var12 = var0.method7665(3);
                        var5.method2388(var12, class203.field2282);
                    }
                    int var13 = var0.method7665(1);
                    if (var13 == 1) {
                        field552[++field551 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field628[++field627 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("kj.iv(I)V")
    public static void method5131() {
        field553 = 0;
        field642 = false;
        field649[0] = class323.field4024;
        field781[0] = "";
        field646[0] = 1006;
        field774[0] = false;
        field553 = 1;
    }

    @ObfuscatedName("ht.iu(III)V")
    public static final void method4298(int arg0, int arg1) {
        if (field553 < 2 && field660 == 0 && !field662 || !field655) {
            return;
        }
        int var2 = method4725();
        String var3;
        if (field660 == 1 && field553 < 2) {
            var3 = class323.field3773 + class323.field3939 + field661 + " " + class97.field1276;
        } else if (field662 && field553 < 2) {
            var3 = field511 + class323.field3939 + field612 + " " + class97.field1276;
        } else {
            var3 = method4111(var2);
        }
        if (field553 > 2) {
            var3 = var3 + class97.method4293(16777215) + " " + '/' + " " + (field553 - 2) + class323.field3933;
        }
        Statics.field1422.method6415(var3, arg0 + 4, arg1 + 15, 16777215, 0, field503 / 1000);
    }

    @ObfuscatedName("ip.ic(I)Z")
    public static final boolean method4721() {
        return field642;
    }

    @ObfuscatedName("lg.iq(IIIIB)V")
    public static final void method5865(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field716; var4++) {
            if (field721[var4] + field568[var4] > arg0 && field721[var4] < arg0 + arg2 && field722[var4] + field516[var4] > arg1 && field722[var4] < arg1 + arg3) {
                field718[var4] = true;
            }
        }
    }

    @ObfuscatedName("da.ih(IIIII)V")
    public static final void method2630(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field716; var4++) {
            if (field721[var4] + field568[var4] > arg0 && field721[var4] < arg0 + arg2 && field722[var4] + field516[var4] > arg1 && field722[var4] < arg1 + arg3) {
                field719[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.in(B)V")
    public final void method1139() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field553 - 1; var2++) {
                if (field646[var2] < 1000 && field646[var2 + 1] > 1000) {
                    String var3 = field781[var2];
                    field781[var2] = field781[var2 + 1];
                    field781[var2 + 1] = var3;
                    String var4 = field649[var2];
                    field649[var2] = field649[var2 + 1];
                    field649[var2 + 1] = var4;
                    int var5 = field646[var2];
                    field646[var2] = field646[var2 + 1];
                    field646[var2 + 1] = var5;
                    int var6 = field709[var2];
                    field709[var2] = field709[var2 + 1];
                    field709[var2 + 1] = var6;
                    int var7 = field645[var2];
                    field645[var2] = field645[var2 + 1];
                    field645[var2 + 1] = var7;
                    int var8 = field647[var2];
                    field647[var2] = field647[var2 + 1];
                    field647[var2 + 1] = var8;
                    int var9 = field648[var2];
                    field648[var2] = field648[var2 + 1];
                    field648[var2 + 1] = var9;
                    boolean var10 = field774[var2];
                    field774[var2] = field774[var2 + 1];
                    field774[var2 + 1] = var10;
                    var1 = false;
                }
            }
        }
        if (Statics.field2006 != null || field732 != null) {
            return;
        }
        int var29;
        int var31;
        int var32;
        label224: {
            int var11 = class37.field234;
            if (field642) {
                if (var11 != 1 && (Statics.field1024 || var11 != 4)) {
                    int var12 = class37.field241;
                    int var13 = class37.field242;
                    if (var12 < Statics.field1330 - 10 || var12 > Statics.field1857 + Statics.field1330 + 10 || var13 < Statics.field1394 - 10 || var13 > Statics.field2962 + Statics.field1394 + 10) {
                        field642 = false;
                        method5865(Statics.field1330, Statics.field1394, Statics.field1857, Statics.field2962);
                    }
                }
                if (var11 == 1 || !Statics.field1024 && var11 == 4) {
                    int var14 = Statics.field1330;
                    int var15 = Statics.field1394;
                    int var16 = Statics.field1857;
                    int var17 = class37.field240;
                    int var18 = class37.field250;
                    int var19 = -1;
                    for (int var20 = 0; var20 < field553; var20++) {
                        int var21 = (field553 - 1 - var20) * 15 + var15 + 31;
                        if (var17 > var14 && var17 < var14 + var16 && var18 > var21 - 13 && var18 < var21 + 3) {
                            var19 = var20;
                        }
                    }
                    if (var19 != -1 && var19 >= 0) {
                        int var22 = field709[var19];
                        int var23 = field645[var19];
                        int var24 = field646[var19];
                        int var25 = field647[var19];
                        int var26 = field648[var19];
                        String var27 = field649[var19];
                        String var28 = field781[var19];
                        method4872(var22, var23, var24, var25, var26, var27, var28, class37.field240, class37.field250);
                    }
                    field642 = false;
                    method5865(Statics.field1330, Statics.field1394, Statics.field1857, Statics.field2962);
                }
            } else {
                var29 = method4725();
                if ((var11 == 1 || !Statics.field1024 && var11 == 4) && var29 >= 0) {
                    int var30 = field646[var29];
                    if (var30 == 39 || var30 == 40 || var30 == 41 || var30 == 42 || var30 == 43 || var30 == 33 || var30 == 34 || var30 == 35 || var30 == 36 || var30 == 37 || var30 == 38 || var30 == 1005) {
                        var31 = field709[var29];
                        var32 = field645[var29];
                        class303 var33 = class303.method4921(var32);
                        int var34 = method3618(var33);
                        boolean var35 = (var34 >> 28 & 0x1) != 0;
                        if (var35) {
                            break label224;
                        }
                        int var36 = method3618(var33);
                        boolean var37 = (var36 >> 29 & 0x1) != 0;
                        if (var37) {
                            break label224;
                        }
                    }
                }
                if ((var11 == 1 || !Statics.field1024 && var11 == 4) && this.method1140()) {
                    var11 = 2;
                }
                if ((var11 == 1 || !Statics.field1024 && var11 == 4) && field553 > 0 && var29 >= 0) {
                    int var41 = field709[var29];
                    int var42 = field645[var29];
                    int var43 = field646[var29];
                    int var44 = field647[var29];
                    int var45 = field648[var29];
                    String var46 = field649[var29];
                    String var47 = field781[var29];
                    method4872(var41, var42, var43, var44, var45, var46, var47, class37.field240, class37.field250);
                }
                if (var11 == 2 && field553 > 0) {
                    this.method1607(class37.field240, class37.field250);
                }
            }
            return;
        }
        if (Statics.field2006 != null && !field617 && field553 > 0 && !this.method1140()) {
            int var38 = field496;
            int var39 = field615;
            class71 var40 = Statics.field1135;
            if (var40 != null) {
                method4872(var40.field886, var40.field881, var40.field880, var40.field883, var40.field884, var40.field885, var40.field890, var38, var39);
            }
            Statics.field1135 = null;
        }
        field617 = false;
        field644 = 0;
        if (Statics.field2006 != null) {
            method2867(Statics.field2006);
        }
        Statics.field2006 = class303.method4921(var32);
        field595 = var31;
        field496 = class37.field240;
        field615 = class37.field250;
        if (var29 >= 0) {
            method88(var29);
        }
        method2867(Statics.field2006);
    }

    @ObfuscatedName("client.iw(B)Z")
    public final boolean method1140() {
        int var1 = method4725();
        return (field720 && field553 > 2 || method705(var1)) && !field774[var1];
    }

    @ObfuscatedName("client.if(III)V")
    public final void method1607(int arg0, int arg1) {
        int var3 = Statics.field1422.method6447(class323.field3932);
        for (int var4 = 0; var4 < field553; var4++) {
            int var5 = Statics.field1422.method6447(method4111(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field553 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field223) {
            var7 = Statics.field223 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field59) {
            var8 = Statics.field59 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field1330 = var7;
        Statics.field1394 = var8;
        Statics.field1857 = var3;
        Statics.field2962 = field553 * 15 + 22;
        int var9 = arg0 - field773;
        int var10 = arg1 - field492;
        Statics.field1615.method3961(Statics.field478, var9, var10, false);
        field642 = true;
    }

    @ObfuscatedName("as.ik(IB)Z")
    public static final boolean method705(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field646[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("jc.id(IIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method4872(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class303 var9 = class303.method4708(arg1, arg0);
            if (var9 != null) {
                method4891(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 1003) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            class96 var10 = field760[arg3];
            if (var10 != null) {
                class185 var11 = var10.field1267;
                if (var11.field1977 != null) {
                    var11 = var11.method3242();
                }
                if (var11 != null) {
                    class275 var12 = class275.method3314(class273.field3018, field636.field1373);
                    var12.field3123.method7755(var11.field1959);
                    field636.method2540(var12);
                }
            }
        }
        if (arg2 == 31) {
            class275 var13 = class275.method3314(class273.field3054, field636.field1373);
            var13.field3123.method7931(Statics.field8);
            var13.field3123.method7947(Statics.field2751);
            var13.field3123.method7947(arg1);
            var13.field3123.method7775(arg0);
            var13.field3123.method7753(arg4);
            var13.field3123.method7775(Statics.field872);
            field636.method2540(var13);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 1002) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            class275 var14 = class275.method3314(class273.field3084, field636.field1373);
            var14.field3123.method7775(arg3);
            field636.method2540(var14);
        }
        if (arg2 == 50) {
            class89 var15 = field621[arg3];
            if (var15 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var16 = class275.method3314(class273.field3047, field636.field1373);
                var16.field3123.method7775(arg3);
                var16.field3123.method7698(field734.method3626(82) ? 1 : 0);
                field636.method2540(var16);
            }
        }
        if (arg2 == 14) {
            class89 var17 = field621[arg3];
            if (var17 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var18 = class275.method3314(class273.field3101, field636.field1373);
                var18.field3123.method7947(Statics.field2751);
                var18.field3123.method7755(Statics.field8);
                var18.field3123.method7755(Statics.field872);
                var18.field3123.method7931(arg3);
                var18.field3123.method7698(field734.method3626(82) ? 1 : 0);
                field636.method2540(var18);
            }
        }
        if (arg2 == 46) {
            class89 var19 = field621[arg3];
            if (var19 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var20 = class275.method3314(class273.field3002, field636.field1373);
                var20.field3123.method7931(arg3);
                var20.field3123.method7698(field734.method3626(82) ? 1 : 0);
                field636.method2540(var20);
            }
        }
        if (arg2 == 15) {
            class89 var21 = field621[arg3];
            if (var21 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var22 = class275.method3314(class273.field3103, field636.field1373);
                var22.field3123.method7749(Statics.field1499);
                var22.field3123.method7753(field664);
                var22.field3123.method7698(field734.method3626(82) ? 1 : 0);
                var22.field3123.method7931(field663);
                var22.field3123.method7755(arg3);
                field636.method2540(var22);
            }
        }
        if (arg2 == 41) {
            class275 var23 = class275.method3314(class273.field3056, field636.field1373);
            var23.field3123.method7753(arg4);
            var23.field3123.method7835(arg1);
            var23.field3123.method7775(arg0);
            field636.method2540(var23);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 47) {
            class89 var24 = field621[arg3];
            if (var24 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var25 = class275.method3314(class273.field3000, field636.field1373);
                var25.field3123.method7746(field734.method3626(82) ? 1 : 0);
                var25.field3123.method7753(arg3);
                field636.method2540(var25);
            }
        }
        if (arg2 == 1004) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            class275 var26 = class275.method3314(class273.field3096, field636.field1373);
            var26.field3123.method7775(Statics.field142 + arg0);
            var26.field3123.method7931(arg3);
            var26.field3123.method7775(Statics.field1754 + arg1);
            field636.method2540(var26);
        }
        if (arg2 == 37) {
            class275 var27 = class275.method3314(class273.field3083, field636.field1373);
            var27.field3123.method7775(arg0);
            var27.field3123.method7755(arg4);
            var27.field3123.method7765(arg1);
            field636.method2540(var27);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 42) {
            class275 var28 = class275.method3314(class273.field3061, field636.field1373);
            var28.field3123.method7753(arg4);
            var28.field3123.method7947(arg1);
            var28.field3123.method7753(arg0);
            field636.method2540(var28);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 40) {
            class275 var29 = class275.method3314(class273.field3030, field636.field1373);
            var29.field3123.method7947(arg1);
            var29.field3123.method7775(arg0);
            var29.field3123.method7755(arg4);
            field636.method2540(var29);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 58) {
            class303 var30 = class303.method4708(arg1, arg0);
            if (var30 != null) {
                if (var30.field3595 != null) {
                    class85 var31 = new class85();
                    var31.field1053 = var30;
                    var31.field1049 = arg3;
                    var31.field1044 = arg6;
                    var31.field1045 = var30.field3595;
                    class68.method4883(var31);
                }
                class275 var32 = class275.method3314(class273.field3089, field636.field1373);
                var32.field3123.method7755(field664);
                var32.field3123.method7755(arg0);
                var32.field3123.method7749(Statics.field1499);
                var32.field3123.method7775(arg4);
                var32.field3123.method7765(arg1);
                var32.field3123.method7753(field663);
                field636.method2540(var32);
            }
        }
        if (arg2 == 1) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var33 = class275.method3314(class273.field3081, field636.field1373);
            var33.field3123.method7931(Statics.field8);
            var33.field3123.method7931(Statics.field872);
            var33.field3123.method7775(Statics.field1754 + arg1);
            var33.field3123.method7755(Statics.field142 + arg0);
            var33.field3123.method7749(Statics.field2751);
            var33.field3123.method7698(field734.method3626(82) ? 1 : 0);
            var33.field3123.method7931(arg3);
            field636.method2540(var33);
        }
        if (arg2 == 38) {
            method2451();
            class303 var34 = class303.method4921(arg1);
            field660 = 1;
            Statics.field8 = arg0;
            Statics.field2751 = arg1;
            Statics.field872 = arg4;
            method2867(var34);
            field661 = class97.method4293(16748608) + class195.method5052(arg4).field2144 + class97.method4293(16777215);
            if (field661 == null) {
                field661 = class323.field3774;
            }
            return;
        }
        if (arg2 == 21) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var35 = class275.method3314(class273.field3012, field636.field1373);
            var35.field3123.method7746(field734.method3626(82) ? 1 : 0);
            var35.field3123.method7753(Statics.field1754 + arg1);
            var35.field3123.method7753(Statics.field142 + arg0);
            var35.field3123.method7755(arg3);
            field636.method2540(var35);
        }
        if (arg2 == 36) {
            class275 var36 = class275.method3314(class273.field3065, field636.field1373);
            var36.field3123.method7835(arg1);
            var36.field3123.method7931(arg0);
            var36.field3123.method7753(arg4);
            field636.method2540(var36);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 28) {
            class275 var37 = class275.method3314(class273.field2997, field636.field1373);
            var37.field3123.method7835(arg1);
            field636.method2540(var37);
            class303 var38 = class303.method4921(arg1);
            if (var38 != null && var38.field3635 != null && var38.field3635[0][0] == 5) {
                int var39 = var38.field3635[0][1];
                class293.field3391[var39] = 1 - class293.field3391[var39];
                method2972(var39);
            }
        }
        if (arg2 == 44) {
            class89 var40 = field621[arg3];
            if (var40 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var41 = class275.method3314(class273.field3068, field636.field1373);
                var41.field3123.method7746(field734.method3626(82) ? 1 : 0);
                var41.field3123.method7755(arg3);
                field636.method2540(var41);
            }
        }
        if (arg2 == 39) {
            class275 var42 = class275.method3314(class273.field3044, field636.field1373);
            var42.field3123.method7765(arg1);
            var42.field3123.method7753(arg4);
            var42.field3123.method7775(arg0);
            field636.method2540(var42);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 35) {
            class275 var43 = class275.method3314(class273.field3049, field636.field1373);
            var43.field3123.method7835(arg1);
            var43.field3123.method7755(arg4);
            var43.field3123.method7775(arg0);
            field636.method2540(var43);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 19) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var44 = class275.method3314(class273.field3064, field636.field1373);
            var44.field3123.method7755(Statics.field1754 + arg1);
            var44.field3123.method7753(arg3);
            var44.field3123.method7942(field734.method3626(82) ? 1 : 0);
            var44.field3123.method7775(Statics.field142 + arg0);
            field636.method2540(var44);
        }
        if (arg2 == 22) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var45 = class275.method3314(class273.field3042, field636.field1373);
            var45.field3123.method7755(Statics.field142 + arg0);
            var45.field3123.method7746(field734.method3626(82) ? 1 : 0);
            var45.field3123.method7755(arg3);
            var45.field3123.method7755(Statics.field1754 + arg1);
            field636.method2540(var45);
        }
        if (arg2 == 11) {
            class96 var46 = field760[arg3];
            if (var46 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var47 = class275.method3314(class273.field3014, field636.field1373);
                var47.field3123.method7931(arg3);
                var47.field3123.method7858(field734.method3626(82) ? 1 : 0);
                field636.method2540(var47);
            }
        }
        if (arg2 == 7) {
            class96 var48 = field760[arg3];
            if (var48 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var49 = class275.method3314(class273.field3069, field636.field1373);
                var49.field3123.method7755(Statics.field8);
                var49.field3123.method7753(Statics.field872);
                var49.field3123.method7931(arg3);
                var49.field3123.method7858(field734.method3626(82) ? 1 : 0);
                var49.field3123.method7835(Statics.field2751);
                field636.method2540(var49);
            }
        }
        if (arg2 == 6) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var50 = class275.method3314(class273.field3011, field636.field1373);
            var50.field3123.method7755(Statics.field142 + arg0);
            var50.field3123.method7942(field734.method3626(82) ? 1 : 0);
            var50.field3123.method7931(arg3);
            var50.field3123.method7755(Statics.field1754 + arg1);
            field636.method2540(var50);
        }
        if (arg2 == 1005) {
            class303 var51 = class303.method4921(arg1);
            if (var51 == null || var51.field3478[arg0] < 100000) {
                class275 var52 = class275.method3314(class273.field3097, field636.field1373);
                var52.field3123.method7753(arg4);
                field636.method2540(var52);
            } else {
                Statics.method666(27, "", var51.field3478[arg0] + " x " + class195.method5052(arg4).field2144);
            }
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 49) {
            class89 var53 = field621[arg3];
            if (var53 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var54 = class275.method3314(class273.field3028, field636.field1373);
                var54.field3123.method7755(arg3);
                var54.field3123.method7746(field734.method3626(82) ? 1 : 0);
                field636.method2540(var54);
            }
        }
        if (arg2 == 8) {
            class96 var55 = field760[arg3];
            if (var55 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var56 = class275.method3314(class273.field3077, field636.field1373);
                var56.field3123.method7755(arg3);
                var56.field3123.method7931(field663);
                var56.field3123.method7858(field734.method3626(82) ? 1 : 0);
                var56.field3123.method7931(field664);
                var56.field3123.method7947(Statics.field1499);
                field636.method2540(var56);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field31.method7267(arg2, arg3, new class294(arg0), new class294(arg1));
        }
        if (arg2 == 1001) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var57 = class275.method3314(class273.field3022, field636.field1373);
            var57.field3123.method7755(Statics.field1754 + arg1);
            var57.field3123.method7775(Statics.field142 + arg0);
            var57.field3123.method7755(arg3);
            var57.field3123.method7858(field734.method3626(82) ? 1 : 0);
            field636.method2540(var57);
        }
        if (arg2 == 45) {
            class89 var58 = field621[arg3];
            if (var58 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var59 = class275.method3314(class273.field3048, field636.field1373);
                var59.field3123.method7931(arg3);
                var59.field3123.method7858(field734.method3626(82) ? 1 : 0);
                field636.method2540(var59);
            }
        }
        if (arg2 == 43) {
            class275 var60 = class275.method3314(class273.field3088, field636.field1373);
            var60.field3123.method7931(arg4);
            var60.field3123.method7749(arg1);
            var60.field3123.method7753(arg0);
            field636.method2540(var60);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 30 && field499 == null) {
            method7588(arg1, arg0);
            field499 = class303.method4708(arg1, arg0);
            method2867(field499);
        }
        if (arg2 == 48) {
            class89 var61 = field621[arg3];
            if (var61 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var62 = class275.method3314(class273.field3099, field636.field1373);
                var62.field3123.method7858(field734.method3626(82) ? 1 : 0);
                var62.field3123.method7775(arg3);
                field636.method2540(var62);
            }
        }
        if (arg2 == 17) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var63 = class275.method3314(class273.field3045, field636.field1373);
            var63.field3123.method7753(field663);
            var63.field3123.method7753(Statics.field1754 + arg1);
            var63.field3123.method7765(Statics.field1499);
            var63.field3123.method7942(field734.method3626(82) ? 1 : 0);
            var63.field3123.method7753(Statics.field142 + arg0);
            var63.field3123.method7753(arg3);
            var63.field3123.method7931(field664);
            field636.method2540(var63);
        }
        if (arg2 == 20) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var64 = class275.method3314(class273.field3050, field636.field1373);
            var64.field3123.method7775(Statics.field142 + arg0);
            var64.field3123.method7755(Statics.field1754 + arg1);
            var64.field3123.method7753(arg3);
            var64.field3123.method7698(field734.method3626(82) ? 1 : 0);
            field636.method2540(var64);
        }
        if (arg2 == 34) {
            class275 var65 = class275.method3314(class273.field3062, field636.field1373);
            var65.field3123.method7931(arg0);
            var65.field3123.method7775(arg4);
            var65.field3123.method7749(arg1);
            field636.method2540(var65);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 24) {
            class303 var66 = class303.method4921(arg1);
            if (var66 != null) {
                boolean var67 = true;
                if (var66.field3486 > 0) {
                    var67 = method3087(var66);
                }
                if (var67) {
                    class275 var68 = class275.method3314(class273.field2997, field636.field1373);
                    var68.field3123.method7835(arg1);
                    field636.method2540(var68);
                }
            }
        }
        if (arg2 == 29) {
            class275 var69 = class275.method3314(class273.field2997, field636.field1373);
            var69.field3123.method7835(arg1);
            field636.method2540(var69);
            class303 var70 = class303.method4921(arg1);
            if (var70 != null && var70.field3635 != null && var70.field3635[0][0] == 5) {
                int var71 = var70.field3635[0][1];
                if (class293.field3391[var71] != var70.field3614[0]) {
                    class293.field3391[var71] = var70.field3614[0];
                    method2972(var71);
                }
            }
        }
        if (arg2 == 3) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var72 = class275.method3314(class273.field3079, field636.field1373);
            var72.field3123.method7858(field734.method3626(82) ? 1 : 0);
            var72.field3123.method7931(Statics.field142 + arg0);
            var72.field3123.method7755(Statics.field1754 + arg1);
            var72.field3123.method7775(arg3);
            field636.method2540(var72);
        }
        if (arg2 == 16) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var73 = class275.method3314(class273.field3015, field636.field1373);
            var73.field3123.method7746(field734.method3626(82) ? 1 : 0);
            var73.field3123.method7931(Statics.field1754 + arg1);
            var73.field3123.method7753(Statics.field872);
            var73.field3123.method7755(arg3);
            var73.field3123.method7765(Statics.field2751);
            var73.field3123.method7753(Statics.field8);
            var73.field3123.method7775(Statics.field142 + arg0);
            field636.method2540(var73);
        }
        if (arg2 == 12) {
            class96 var74 = field760[arg3];
            if (var74 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var75 = class275.method3314(class273.field3036, field636.field1373);
                var75.field3123.method7753(arg3);
                var75.field3123.method7746(field734.method3626(82) ? 1 : 0);
                field636.method2540(var75);
            }
        }
        if (arg2 == 2) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var76 = class275.method3314(class273.field3051, field636.field1373);
            var76.field3123.method7947(Statics.field1499);
            var76.field3123.method7931(arg3);
            var76.field3123.method7753(Statics.field1754 + arg1);
            var76.field3123.method7931(field664);
            var76.field3123.method7755(field663);
            var76.field3123.method7755(Statics.field142 + arg0);
            var76.field3123.method7746(field734.method3626(82) ? 1 : 0);
            field636.method2540(var76);
        }
        if (arg2 == 33) {
            class275 var77 = class275.method3314(class273.field3025, field636.field1373);
            var77.field3123.method7775(arg4);
            var77.field3123.method7775(arg0);
            var77.field3123.method7835(arg1);
            field636.method2540(var77);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 13) {
            class96 var78 = field760[arg3];
            if (var78 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var79 = class275.method3314(class273.field3006, field636.field1373);
                var79.field3123.method7755(arg3);
                var79.field3123.method7858(field734.method3626(82) ? 1 : 0);
                field636.method2540(var79);
            }
        }
        if (arg2 == 5) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var80 = class275.method3314(class273.field3008, field636.field1373);
            var80.field3123.method7931(Statics.field1754 + arg1);
            var80.field3123.method7931(Statics.field142 + arg0);
            var80.field3123.method7698(field734.method3626(82) ? 1 : 0);
            var80.field3123.method7753(arg3);
            field636.method2540(var80);
        }
        if (arg2 == 10) {
            class96 var81 = field760[arg3];
            if (var81 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var82 = class275.method3314(class273.field3080, field636.field1373);
                var82.field3123.method7931(arg3);
                var82.field3123.method7698(field734.method3626(82) ? 1 : 0);
                field636.method2540(var82);
            }
        }
        if (arg2 == 23) {
            if (field642) {
                Statics.field1615.method3962();
            } else {
                Statics.field1615.method3961(Statics.field478, arg0, arg1, true);
            }
        }
        if (arg2 == 18) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var83 = class275.method3314(class273.field3038, field636.field1373);
            var83.field3123.method7775(arg3);
            var83.field3123.method7755(Statics.field142 + arg0);
            var83.field3123.method7942(field734.method3626(82) ? 1 : 0);
            var83.field3123.method7753(Statics.field1754 + arg1);
            field636.method2540(var83);
        }
        if (arg2 == 32) {
            class275 var84 = class275.method3314(class273.field2999, field636.field1373);
            var84.field3123.method7753(field663);
            var84.field3123.method7755(arg0);
            var84.field3123.method7749(arg1);
            var84.field3123.method7835(Statics.field1499);
            var84.field3123.method7753(arg4);
            field636.method2540(var84);
            field698 = 0;
            Statics.field1576 = class303.method4921(arg1);
            field746 = arg0;
        }
        if (arg2 == 4) {
            field515 = arg7;
            field607 = arg8;
            field609 = 2;
            field762 = 0;
            field747 = arg0;
            field748 = arg1;
            class275 var85 = class275.method3314(class273.field3090, field636.field1373);
            var85.field3123.method7858(field734.method3626(82) ? 1 : 0);
            var85.field3123.method7775(Statics.field142 + arg0);
            var85.field3123.method7931(arg3);
            var85.field3123.method7753(Statics.field1754 + arg1);
            field636.method2540(var85);
        }
        if (arg2 == 9) {
            class96 var86 = field760[arg3];
            if (var86 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var87 = class275.method3314(class273.field3027, field636.field1373);
                var87.field3123.method7858(field734.method3626(82) ? 1 : 0);
                var87.field3123.method7775(arg3);
                field636.method2540(var87);
            }
        }
        if (arg2 == 51) {
            class89 var88 = field621[arg3];
            if (var88 != null) {
                field515 = arg7;
                field607 = arg8;
                field609 = 2;
                field762 = 0;
                field747 = arg0;
                field748 = arg1;
                class275 var89 = class275.method3314(class273.field3053, field636.field1373);
                var89.field3123.method7931(arg3);
                var89.field3123.method7858(field734.method3626(82) ? 1 : 0);
                field636.method2540(var89);
            }
        }
        if (arg2 == 26) {
            method6189();
        }
        if (arg2 != 25) {
            if (field660 != 0) {
                field660 = 0;
                method2867(class303.method4921(Statics.field2751));
            }
            if (field662) {
                method2451();
            }
            if (Statics.field1576 != null && field698 == 0) {
                method2867(Statics.field1576);
            }
            return;
        }
        class303 var90 = class303.method4708(arg1, arg0);
        if (var90 == null) {
            return;
        }
        method2451();
        method4657(arg1, arg0, class304.method3082(method3618(var90)), arg4);
        field660 = 0;
        field511 = method5692(var90);
        if (field511 == null) {
            field511 = class323.field3774;
        }
        if (var90.field3481) {
            field612 = var90.field3567 + class97.method4293(16777215);
        } else {
            field612 = class97.method4293(65280) + var90.field3616 + class97.method4293(16777215);
        }
    }

    @ObfuscatedName("cr.iy(ILjava/lang/String;B)V")
    public static void method2412(int arg0, String arg1) {
        int var2 = class103.field1317;
        int[] var3 = class103.field1318;
        boolean var4 = false;
        class486 var5 = new class486(arg1, Statics.field2682);
        for (int var6 = 0; var6 < var2; var6++) {
            class89 var7 = field621[var3[var6]];
            if (var7 != null && Statics.field3404 != var7 && var7.field1108 != null && var7.field1108.equals(var5)) {
                if (arg0 == 1) {
                    class275 var8 = class275.method3314(class273.field3068, field636.field1373);
                    var8.field3123.method7746(0);
                    var8.field3123.method7755(var3[var6]);
                    field636.method2540(var8);
                } else if (arg0 == 4) {
                    class275 var9 = class275.method3314(class273.field3000, field636.field1373);
                    var9.field3123.method7746(0);
                    var9.field3123.method7753(var3[var6]);
                    field636.method2540(var9);
                } else if (arg0 == 6) {
                    class275 var10 = class275.method3314(class273.field3028, field636.field1373);
                    var10.field3123.method7755(var3[var6]);
                    var10.field3123.method7746(0);
                    field636.method2540(var10);
                } else if (arg0 == 7) {
                    class275 var11 = class275.method3314(class273.field3047, field636.field1373);
                    var11.field3123.method7775(var3[var6]);
                    var11.field3123.method7698(0);
                    field636.method2540(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            Statics.method666(4, "", class323.field3928 + arg1);
        }
    }

    @ObfuscatedName("im.jp(IIIII)V")
    public static void method4657(int arg0, int arg1, int arg2, int arg3) {
        class303 var4 = class303.method4708(arg0, arg1);
        if (var4 != null && var4.field3585 != null) {
            class85 var5 = new class85();
            var5.field1053 = var4;
            var5.field1045 = var4.field3585;
            class68.method4883(var5);
        }
        field664 = arg3;
        field662 = true;
        Statics.field1499 = arg0;
        field663 = arg1;
        Statics.field1416 = arg2;
        method2867(var4);
    }

    @ObfuscatedName("cv.ju(I)V")
    public static void method2451() {
        if (!field662) {
            return;
        }
        class303 var0 = class303.method4708(Statics.field1499, field663);
        if (var0 != null && var0.field3620 != null) {
            class85 var1 = new class85();
            var1.field1053 = var0;
            var1.field1045 = var0.field3620;
            class68.method4883(var1);
        }
        field664 = -1;
        field662 = false;
        method2867(var0);
    }

    @ObfuscatedName("qi.jg(III)V")
    public static void method7588(int arg0, int arg1) {
        class275 var2 = class275.method3314(class273.field3067, field636.field1373);
        var2.field3123.method7753(arg1);
        var2.field3123.method7835(arg0);
        field636.method2540(var2);
    }

    @ObfuscatedName("jl.je(IIIILjava/lang/String;B)V")
    public static void method4891(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class303 var5 = class303.method4708(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3571 != null) {
            class85 var6 = new class85();
            var6.field1053 = var5;
            var6.field1049 = arg0;
            var6.field1044 = arg4;
            var6.field1045 = var5.field3571;
            class68.method4883(var6);
        }
        boolean var7 = true;
        if (var5.field3486 > 0) {
            var7 = method3087(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method3618(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class275 var11 = class275.method3314(class273.field3013, field636.field1373);
            var11.field3123.method7835(arg1);
            var11.field3123.method7775(arg2);
            var11.field3123.method7775(arg3);
            field636.method2540(var11);
        }
        if (arg0 == 2) {
            class275 var12 = class275.method3314(class273.field3034, field636.field1373);
            var12.field3123.method7835(arg1);
            var12.field3123.method7775(arg2);
            var12.field3123.method7775(arg3);
            field636.method2540(var12);
        }
        if (arg0 == 3) {
            class275 var13 = class275.method3314(class273.field3043, field636.field1373);
            var13.field3123.method7835(arg1);
            var13.field3123.method7775(arg2);
            var13.field3123.method7775(arg3);
            field636.method2540(var13);
        }
        if (arg0 == 4) {
            class275 var14 = class275.method3314(class273.field3016, field636.field1373);
            var14.field3123.method7835(arg1);
            var14.field3123.method7775(arg2);
            var14.field3123.method7775(arg3);
            field636.method2540(var14);
        }
        if (arg0 == 5) {
            class275 var15 = class275.method3314(class273.field3026, field636.field1373);
            var15.field3123.method7835(arg1);
            var15.field3123.method7775(arg2);
            var15.field3123.method7775(arg3);
            field636.method2540(var15);
        }
        if (arg0 == 6) {
            class275 var16 = class275.method3314(class273.field3004, field636.field1373);
            var16.field3123.method7835(arg1);
            var16.field3123.method7775(arg2);
            var16.field3123.method7775(arg3);
            field636.method2540(var16);
        }
        if (arg0 == 7) {
            class275 var17 = class275.method3314(class273.field3074, field636.field1373);
            var17.field3123.method7835(arg1);
            var17.field3123.method7775(arg2);
            var17.field3123.method7775(arg3);
            field636.method2540(var17);
        }
        if (arg0 == 8) {
            class275 var18 = class275.method3314(class273.field3020, field636.field1373);
            var18.field3123.method7835(arg1);
            var18.field3123.method7775(arg2);
            var18.field3123.method7775(arg3);
            field636.method2540(var18);
        }
        if (arg0 == 9) {
            class275 var19 = class275.method3314(class273.field3019, field636.field1373);
            var19.field3123.method7835(arg1);
            var19.field3123.method7775(arg2);
            var19.field3123.method7775(arg3);
            field636.method2540(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class275 var20 = class275.method3314(class273.field3003, field636.field1373);
        var20.field3123.method7835(arg1);
        var20.field3123.method7775(arg2);
        var20.field3123.method7775(arg3);
        field636.method2540(var20);
    }

    @ObfuscatedName("z.jh(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method203(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2625(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("bw.jx(Ljava/lang/String;Ljava/lang/String;IIIIII)V")
    public static final void method1998(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method2625(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("da.jt(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method2625(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field642 || field553 >= 500) {
            return;
        }
        field649[field553] = arg0;
        field781[field553] = arg1;
        field646[field553] = arg2;
        field647[field553] = arg3;
        field709[field553] = arg4;
        field645[field553] = arg5;
        field648[field553] = arg6;
        field774[field553] = arg7;
        field553++;
    }

    @ObfuscatedName("iu.jy(I)I")
    public static final int method4725() {
        return field553 - 1;
    }

    @ObfuscatedName("hy.jb(II)Ljava/lang/String;")
    public static String method4111(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field781[arg0].length() > 0) {
            return field649[arg0] + class323.field3939 + field781[arg0];
        } else {
            return field649[arg0];
        }
    }

    @ObfuscatedName("ki.jj(Lcc;IIII)V")
    public static final void method5162(class96 arg0, int arg1, int arg2, int arg3) {
        class185 var4 = arg0.field1267;
        if (field553 >= 400) {
            return;
        }
        if (var4.field1977 != null) {
            var4 = var4.method3242();
        }
        if (var4 == null || !var4.field1981 || var4.field1986 && field677 != arg1) {
            return;
        }
        String var5 = arg0.method2393();
        if (var4.field1990 != 0 && arg0.field1213 != 0) {
            int var6 = arg0.field1213 == -1 ? var4.field1990 : arg0.field1213;
            int var8 = Statics.field3404.field1103;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class97.method4293(16711680);
            } else if (var9 < -6) {
                var10 = class97.method4293(16723968);
            } else if (var9 < -3) {
                var10 = class97.method4293(16740352);
            } else if (var9 < 0) {
                var10 = class97.method4293(16756736);
            } else if (var9 > 9) {
                var10 = class97.method4293(65280);
            } else if (var9 > 6) {
                var10 = class97.method4293(4259584);
            } else if (var9 > 3) {
                var10 = class97.method4293(8453888);
            } else if (var9 > 0) {
                var10 = class97.method4293(12648192);
            } else {
                var10 = class97.method4293(16776960);
            }
            var5 = var5 + var10 + " " + class97.field1277 + class323.field3935 + var6 + class97.field1271;
        }
        if (var4.field1986 && field652) {
            method203(class323.field4057, class97.method4293(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field660 == 1) {
            method203(class323.field3773, field661 + " " + class97.field1276 + " " + class97.method4293(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field662) {
            int var11 = var4.field1986 && field652 ? 2000 : 0;
            String[] var12 = var4.field1983;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (arg0.method2407(var13) && var12[var13] != null && !var12[var13].equalsIgnoreCase(class323.field3931)) {
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
                        method203(var12[var13], class97.method4293(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (arg0.method2407(var15) && var12[var15] != null && var12[var15].equalsIgnoreCase(class323.field3931)) {
                        short var16 = 0;
                        if (field708 != class99.field1292) {
                            if (field708 == class99.field1287 || field708 == class99.field1294 && var4.field1990 > Statics.field3404.field1103) {
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
                            method203(var12[var15], class97.method4293(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1986 || !field652) {
                method203(class323.field4057, class97.method4293(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1416 & 0x2) == 2) {
            method203(field511, field612 + " " + class97.field1276 + " " + class97.method4293(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dm.jm(Lco;IIIB)V")
    public static final void method2661(class89 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field3404 == arg0 || field553 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1110 == 0) {
            String var4 = arg0.field1095[0] + arg0.field1108 + arg0.field1095[1];
            int var5 = arg0.field1103;
            int var6 = Statics.field3404.field1103;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class97.method4293(16711680);
            } else if (var7 < -6) {
                var8 = class97.method4293(16723968);
            } else if (var7 < -3) {
                var8 = class97.method4293(16740352);
            } else if (var7 < 0) {
                var8 = class97.method4293(16756736);
            } else if (var7 > 9) {
                var8 = class97.method4293(65280);
            } else if (var7 > 6) {
                var8 = class97.method4293(4259584);
            } else if (var7 > 3) {
                var8 = class97.method4293(8453888);
            } else if (var7 > 0) {
                var8 = class97.method4293(12648192);
            } else {
                var8 = class97.method4293(16776960);
            }
            var9 = var4 + var8 + " " + class97.field1277 + class323.field3935 + arg0.field1103 + class97.field1271 + arg0.field1095[2];
        } else {
            var9 = arg0.field1095[0] + arg0.field1108 + arg0.field1095[1] + " " + class97.field1277 + class323.field3936 + arg0.field1110 + class97.field1271 + arg0.field1095[2];
        }
        if (field660 == 1) {
            method203(class323.field3773, field661 + " " + class97.field1276 + " " + class97.method4293(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field662) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field630[var10] != null) {
                    short var11 = 0;
                    if (field630[var10].equalsIgnoreCase(class323.field3931)) {
                        if (field670 == class99.field1292) {
                            continue;
                        }
                        if (field670 == class99.field1287 || field670 == class99.field1294 && arg0.field1103 > Statics.field3404.field1103) {
                            var11 = 2000;
                        }
                        if (Statics.field3404.field1119 == 0 || arg0.field1119 == 0) {
                            if (field670 == class99.field1290 && arg0.method2208()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field3404.field1119 == arg0.field1119) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field613[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field629[var10] + var11;
                    method203(field630[var10], class97.method4293(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1416 & 0x8) == 8) {
            method203(field511, field612 + " " + class97.field1276 + " " + class97.method4293(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field553; var14++) {
            if (field646[var14] == 23) {
                field781[var14] = class97.method4293(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ao.jn(IIIIIIIII)V")
    public static final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class303.method4633(arg0)) {
            Statics.field972 = null;
            method4886(Statics.field3615[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field972 != null) {
                method4886(Statics.field972, -1412584499, arg1, arg2, arg3, arg4, Statics.field4440, Statics.field333, arg7);
                Statics.field972 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field718[var8] = true;
            }
        } else {
            field718[arg7] = true;
        }
    }

    @ObfuscatedName("jd.jk([Lkn;IIIIIIIIB)V")
    public static final void method4886(class303[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class473.method8015(arg2, arg3, arg4, arg5);
        class211.method3802();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class303 var10 = arg0[var9];
            if (var10 != null && (var10.field3618 == arg1 || arg1 == -1412584499 && field732 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field721[field716] = var10.field3495 + arg6;
                    field722[field716] = var10.field3573 + arg7;
                    field568[field716] = var10.field3470;
                    field516[field716] = var10.field3498;
                    var11 = ++field716 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3631 = var11;
                var10.field3632 = field503;
                if (!var10.field3481 || !method27(var10)) {
                    if (var10.field3486 > 0) {
                        method4889(var10);
                    }
                    int var12 = var10.field3495 + arg6;
                    int var13 = var10.field3573 + arg7;
                    int var14 = var10.field3634;
                    if (field732 == var10) {
                        if (arg1 != -1412584499 && !var10.field3572) {
                            Statics.field972 = arg0;
                            Statics.field4440 = arg6;
                            Statics.field333 = arg7;
                            continue;
                        }
                        if (field691 && field685) {
                            int var15 = class37.field241;
                            int var16 = class37.field242;
                            int var17 = var15 - field682;
                            int var18 = var16 - field683;
                            if (var17 < field604) {
                                var17 = field604;
                            }
                            if (var10.field3470 + var17 > field604 + field681.field3470) {
                                var17 = field604 + field681.field3470 - var10.field3470;
                            }
                            if (var18 < field687) {
                                var18 = field687;
                            }
                            if (var10.field3498 + var18 > field687 + field681.field3498) {
                                var18 = field687 + field681.field3498 - var10.field3498;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3572) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3484 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3484 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3470 + var12;
                        int var26 = var10.field3498 + var13;
                        if (var25 < var12) {
                            var23 = var25;
                            var25 = var12;
                        }
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        var25++;
                        var26++;
                        var19 = var23 > arg2 ? var23 : arg2;
                        var20 = var24 > arg3 ? var24 : arg3;
                        var21 = var25 < arg4 ? var25 : arg4;
                        var22 = var26 < arg5 ? var26 : arg5;
                    } else {
                        int var29 = var10.field3470 + var12;
                        int var30 = var10.field3498 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3481 || var19 < var21 && var20 < var22) {
                        if (var10.field3486 != 0) {
                            if (var10.field3486 == 1336) {
                                if (Statics.field4526.method2287()) {
                                    var13 += 15;
                                    Statics.field4239.method6422("Fps:" + field204, var10.field3470 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field494) {
                                        var33 = 16711680;
                                    }
                                    Statics.field4239.method6422("Mem:" + var32 + "k", var10.field3470 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3486 == 1337) {
                                field656 = var12;
                                field657 = var13;
                                method299(var12, var13, var10.field3470, var10.field3498);
                                field718[var10.field3631] = true;
                                class473.method8015(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3486 == 1338) {
                                method1937(var10, var12, var13, var11);
                                class473.method8015(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3486 == 1339) {
                                method2586(var10, var12, var13, var11);
                                class473.method8015(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3486 == 1400) {
                                Statics.field31.method7300(var12, var13, var10.field3470, var10.field3498, field503);
                            }
                            if (var10.field3486 == 1401) {
                                Statics.field31.method7233(var12, var13, var10.field3470, var10.field3498);
                            }
                            if (var10.field3486 == 1402) {
                                Statics.field869.method2246(var12, field503);
                            }
                        }
                        if (var10.field3484 == 0) {
                            if (!var10.field3481 && method27(var10) && Statics.field2556 != var10) {
                                continue;
                            }
                            if (!var10.field3481) {
                                if (var10.field3504 > var10.field3514 - var10.field3498) {
                                    var10.field3504 = var10.field3514 - var10.field3498;
                                }
                                if (var10.field3504 < 0) {
                                    var10.field3504 = 0;
                                }
                            }
                            method4886(arg0, var10.field3539, var19, var20, var21, var22, var12 - var10.field3503, var13 - var10.field3504, var11);
                            if (var10.field3624 != null) {
                                method4886(var10.field3624, var10.field3539, var19, var20, var21, var22, var12 - var10.field3503, var13 - var10.field3504, var11);
                            }
                            class84 var34 = (class84) field668.method7466((long) var10.field3539);
                            if (var34 != null) {
                                method440(var34.field1039, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class473.method8015(arg2, arg3, arg4, arg5);
                            class211.method3802();
                        } else if (var10.field3484 == 11) {
                            if (method27(var10) && Statics.field2556 != var10) {
                                continue;
                            }
                            if (var10.field3624 != null) {
                                method4886(var10.field3624, var10.field3539, var19, var20, var21, var22, var12 - var10.field3503, var13 - var10.field3504, var11);
                            }
                            class473.method8015(arg2, arg3, arg4, arg5);
                            class211.method3802();
                        }
                        if (field727 || field658[var11] || field725 > 1) {
                            if (var10.field3484 == 0 && !var10.field3481 && var10.field3514 > var10.field3498) {
                                method2359(var10.field3470 + var12, var13, var10.field3504, var10.field3498, var10.field3514);
                            }
                            if (var10.field3484 != 1) {
                                if (var10.field3484 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3494; var36++) {
                                        for (int var37 = 0; var37 < var10.field3508; var37++) {
                                            int var38 = (var10.field3550 + 32) * var37 + var12;
                                            int var39 = (var10.field3551 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3552[var35];
                                                var39 += var10.field3553[var35];
                                            }
                                            if (var10.field3483[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3483[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field2006 == var10 && field595 == var35) {
                                                    class477 var43;
                                                    if (field660 == 1 && Statics.field8 == var35 && Statics.field2751 == var10.field3539) {
                                                        var43 = class195.method2054(var42, var10.field3478[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class195.method2054(var42, var10.field3478[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method2867(var10);
                                                    } else if (Statics.field2006 == var10 && field595 == var35) {
                                                        int var44 = class37.field241 - field496;
                                                        int var45 = class37.field242 - field615;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field644 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method8139(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class303 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class473.field4937 && var46.field3504 > 0) {
                                                                int var47 = field559 * (class473.field4937 - var39 - var45) / 3;
                                                                if (var47 > field559 * 10) {
                                                                    var47 = field559 * 10;
                                                                }
                                                                if (var47 > var46.field3504) {
                                                                    var47 = var46.field3504;
                                                                }
                                                                var46.field3504 -= var47;
                                                                field615 += var47;
                                                                method2867(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class473.field4940 && var46.field3504 < var46.field3514 - var46.field3498) {
                                                                int var48 = field559 * (var39 + var45 + 32 - class473.field4940) / 3;
                                                                if (var48 > field559 * 10) {
                                                                    var48 = field559 * 10;
                                                                }
                                                                if (var48 > var46.field3514 - var46.field3498 - var46.field3504) {
                                                                    var48 = var46.field3514 - var46.field3498 - var46.field3504;
                                                                }
                                                                var46.field3504 += var48;
                                                                field615 -= var48;
                                                                method2867(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field1576 == var10 && field746 == var35) {
                                                        var43.method8139(var38, var39, 128);
                                                    } else {
                                                        var43.method8174(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3548 != null && var35 < 20) {
                                                class477 var49 = var10.method5509(var35);
                                                if (var49 != null) {
                                                    var49.method8174(var38, var39);
                                                } else if (class303.field3480) {
                                                    method2867(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3484 == 3) {
                                    int var50;
                                    if (method689(var10)) {
                                        var50 = var10.field3517;
                                        if (Statics.field2556 == var10 && var10.field3589 != 0) {
                                            var50 = var10.field3589;
                                        }
                                    } else {
                                        var50 = var10.field3507;
                                        if (Statics.field2556 == var10 && var10.field3509 != 0) {
                                            var50 = var10.field3509;
                                        }
                                    }
                                    if (var10.field3511) {
                                        switch(var10.field3512.field4948) {
                                            case 1:
                                                class473.method8048(var12, var13, var10.field3470, var10.field3498, var10.field3507, var10.field3517);
                                                break;
                                            case 2:
                                                class473.method8047(var12, var13, var10.field3470, var10.field3498, var10.field3507, var10.field3517, 255 - (var10.field3634 & 0xFF), 255 - (var10.field3610 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class473.method8022(var12, var13, var10.field3470, var10.field3498, var50);
                                                } else {
                                                    class473.method8021(var12, var13, var10.field3470, var10.field3498, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class473.method8026(var12, var13, var10.field3470, var10.field3498, var50);
                                    } else {
                                        class473.method8030(var12, var13, var10.field3470, var10.field3498, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3484 == 4) {
                                    class365 var51 = var10.method5508();
                                    if (var51 != null) {
                                        String var52 = var10.field3544;
                                        int var53;
                                        if (method689(var10)) {
                                            var53 = var10.field3517;
                                            if (Statics.field2556 == var10 && var10.field3589 != 0) {
                                                var53 = var10.field3589;
                                            }
                                            if (var10.field3545.length() > 0) {
                                                var52 = var10.field3545;
                                            }
                                        } else {
                                            var53 = var10.field3507;
                                            if (Statics.field2556 == var10 && var10.field3509 != 0) {
                                                var53 = var10.field3509;
                                            }
                                        }
                                        if (var10.field3481 && var10.field3467 != -1) {
                                            class195 var54 = class195.method5052(var10.field3467);
                                            var52 = var54.field2144;
                                            if (var52 == null) {
                                                var52 = class323.field3774;
                                            }
                                            if ((var54.field2155 == 1 || var10.field3621 != 1) && var10.field3621 != -1) {
                                                var52 = class97.method4293(16748608) + var52 + class97.field1278 + " " + 'x' + method436(var10.field3621);
                                            }
                                        }
                                        if (field499 == var10) {
                                            var52 = class323.field3937;
                                            var53 = var10.field3507;
                                        }
                                        if (!var10.field3481) {
                                            var52 = Statics.method314(var52, var10);
                                        }
                                        var51.method6424(var52, var12, var13, var10.field3470, var10.field3498, var53, var10.field3510 ? 0 : -1, var10.field3547, var10.field3594, var10.field3546);
                                    } else if (class303.field3480) {
                                        method2867(var10);
                                    }
                                } else if (var10.field3484 == 5) {
                                    if (var10.field3481) {
                                        class477 var56;
                                        if (var10.field3467 == -1) {
                                            var56 = var10.method5504(false, Statics.field318);
                                        } else {
                                            var56 = class195.method2054(var10.field3467, var10.field3621, var10.field3522, var10.field3523, var10.field3542, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4963;
                                            int var58 = var56.field4964;
                                            if (var10.field3521) {
                                                class473.method8086(var12, var13, var10.field3470 + var12, var10.field3498 + var13);
                                                int var59 = (var10.field3470 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3498 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3520 != 0) {
                                                            var56.method8152(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3520, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method8174(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method8139(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class473.method8015(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3470 * 4096 / var57;
                                                if (var10.field3520 != 0) {
                                                    var56.method8152(var10.field3470 / 2 + var12, var10.field3498 / 2 + var13, var10.field3520, var63);
                                                } else if (var14 != 0) {
                                                    var56.method8141(var12, var13, var10.field3470, var10.field3498, 256 - (var14 & 0xFF));
                                                } else if (var10.field3470 == var57 && var10.field3498 == var58) {
                                                    var56.method8174(var12, var13);
                                                } else {
                                                    var56.method8135(var12, var13, var10.field3470, var10.field3498);
                                                }
                                            }
                                        } else if (class303.field3480) {
                                            method2867(var10);
                                        }
                                    } else {
                                        class477 var55 = var10.method5504(method689(var10), Statics.field318);
                                        if (var55 != null) {
                                            var55.method8174(var12, var13);
                                        } else if (class303.field3480) {
                                            method2867(var10);
                                        }
                                    }
                                } else if (var10.field3484 == 6) {
                                    boolean var64 = method689(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3531;
                                    } else {
                                        var65 = var10.field3597;
                                    }
                                    class221 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3467 != -1) {
                                        class195 var68 = class195.method5052(var10.field3467);
                                        if (var68 != null) {
                                            class195 var69 = var68.method3473(var10.field3621);
                                            var66 = var69.method3470(1);
                                            if (var66 == null) {
                                                method2867(var10);
                                            } else {
                                                var66.method4232();
                                                var67 = var66.field2521 / 2;
                                            }
                                        }
                                    } else if (var10.field3526 == 5) {
                                        if (var10.field3527 == 0) {
                                            var66 = field778.method5189((class197) null, -1, (class197) null, -1);
                                        } else {
                                            var66 = Statics.field3404.method1929();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method5510((class197) null, -1, var64, Statics.field3404.field1109);
                                        if (var66 == null && class303.field3480) {
                                            method2867(var10);
                                        }
                                    } else {
                                        class197 var70 = class197.method3143(var65);
                                        var66 = var10.method5510(var70, var10.field3493, var64, Statics.field3404.field1109);
                                        if (var66 == null && class303.field3480) {
                                            method2867(var10);
                                        }
                                    }
                                    class211.method3845(var10.field3470 / 2 + var12, var10.field3498 / 2 + var13);
                                    int var71 = var10.field3584 * class211.field2437[var10.field3623] >> 16;
                                    int var72 = var10.field3584 * class211.field2438[var10.field3623] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3481) {
                                            var66.method4232();
                                            if (var10.field3556) {
                                                var66.method4162(0, var10.field3535, var10.field3536, var10.field3623, var10.field3532, var10.field3570 + var67 + var71, var10.field3570 + var72, var10.field3584);
                                            } else {
                                                var66.method4239(0, var10.field3535, var10.field3536, var10.field3623, var10.field3532, var10.field3570 + var67 + var71, var10.field3570 + var72);
                                            }
                                        } else {
                                            var66.method4239(0, var10.field3535, 0, var10.field3623, 0, var71, var72);
                                        }
                                    }
                                    class211.method3804();
                                } else {
                                    if (var10.field3484 == 7) {
                                        class365 var73 = var10.method5508();
                                        if (var73 == null) {
                                            if (class303.field3480) {
                                                method2867(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field3494; var75++) {
                                            for (int var76 = 0; var76 < var10.field3508; var76++) {
                                                if (var10.field3483[var74] > 0) {
                                                    class195 var77 = class195.method5052(var10.field3483[var74] - 1);
                                                    String var78;
                                                    if (var77.field2155 != 1 && var10.field3478[var74] == 1) {
                                                        var78 = class97.method4293(16748608) + var77.field2144 + class97.field1278;
                                                    } else {
                                                        var78 = class97.method4293(16748608) + var77.field2144 + class97.field1278 + " " + 'x' + method436(var10.field3478[var74]);
                                                    }
                                                    int var79 = (var10.field3550 + 115) * var76 + var12;
                                                    int var80 = (var10.field3551 + 12) * var75 + var13;
                                                    if (var10.field3547 == 0) {
                                                        var73.method6429(var78, var79, var80, var10.field3507, var10.field3510 ? 0 : -1);
                                                    } else if (var10.field3547 == 1) {
                                                        var73.method6507(var78, var10.field3470 / 2 + var79, var80, var10.field3507, var10.field3510 ? 0 : -1);
                                                    } else {
                                                        var73.method6422(var78, var10.field3470 + var79 - 1, var80, var10.field3507, var10.field3510 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field3484 == 8 && Statics.field2557 == var10 && field787 == field528) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class365 var83 = Statics.field4239;
                                        String var84 = var10.field3544;
                                        String var85 = Statics.method314(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class97.field1279);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method6447(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field4355 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3470 + var12 - 5 - var81;
                                        int var90 = var10.field3498 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class473.method8022(var89, var90, var81, var82, 16777120);
                                        class473.method8026(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3544;
                                        int var92 = var83.field4355 + var90 + 2;
                                        String var93 = Statics.method314(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class97.field1279);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method6429(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field4355 + 1;
                                        }
                                    }
                                    if (var10.field3484 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field3516) {
                                            var96 = var12;
                                            var97 = var10.field3498 + var13;
                                            var98 = var10.field3470 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3470 + var12;
                                            var99 = var10.field3498 + var13;
                                        }
                                        if (var10.field3515 == 1) {
                                            class473.method8032(var96, var97, var98, var99, var10.field3507);
                                        } else {
                                            method6690(var96, var97, var98, var99, var10.field3507, var10.field3515);
                                        }
                                    } else if (var10.field3484 == 12) {
                                        class301 var100 = var10.method5529();
                                        class296 var101 = var10.method5606();
                                        if (var100 != null && var101 != null && var100.method5359()) {
                                            class365 var102 = var10.method5508();
                                            if (var102 != null) {
                                                field710.method8278(var12, var13, var10.field3470, var10.field3498, var100.method5277(), var100.method5345(), 0, 0, var100.method5274(), var100.method5351(), var100.method5273());
                                                int var103 = var10.field3510 ? var10.field3523 : -1;
                                                if (!var100.method5253() && var100.method5415().method6303()) {
                                                    field710.method8279(var101.field3401, var103, var101.field3400, var101.field3402);
                                                    field710.method8277(var100.method5269(), var102);
                                                } else {
                                                    field710.method8279(var10.field3507, var103, var101.field3400, var101.field3402);
                                                    field710.method8277(var100.method5415(), var102);
                                                }
                                                class473.method8015(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("np.jc(IIIIIII)V")
    public static final void method6690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class473.field4939;
        int var18 = arg1 - class473.field4937;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class211.method3886(var19, var20, var21);
        class211.method3873(var23, var24, var25, var19, var20, var21, arg4);
        class211.method3886(var19, var21, var22);
        class211.method3873(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("ah.ja(IB)Ljava/lang/String;")
    public static final String method436(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class97.field1272 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class97.method4293(65408) + var1.substring(0, var1.length() - 8) + class323.field3940 + " " + class97.field1277 + var1 + class97.field1271 + class97.field1278;
        } else if (var1.length() > 6) {
            return " " + class97.method4293(16777215) + var1.substring(0, var1.length() - 4) + class323.field3942 + " " + class97.field1277 + var1 + class97.field1271 + class97.field1278;
        } else {
            return " " + class97.method4293(16776960) + var1 + class97.field1278;
        }
    }

    @ObfuscatedName("client.jo(ZI)V")
    public final void method1142(boolean arg0) {
        int var2 = field751;
        int var3 = Statics.field223;
        int var4 = Statics.field59;
        if (class303.method4633(var2)) {
            method4722(Statics.field3615[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.jd(Lkn;I)V")
    public void method1143(class303 arg0) {
        class303 var2 = arg0.field3618 == -1 ? null : class303.method4921(arg0.field3618);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field223;
            var4 = Statics.field59;
        } else {
            var3 = var2.field3470;
            var4 = var2.field3498;
        }
        method4705(arg0, var3, var4, false);
        method5913(arg0, var3, var4);
    }

    @ObfuscatedName("z.jl([Lkn;Lkn;ZB)V")
    public static void method201(class303[] arg0, class303 arg1, boolean arg2) {
        int var3 = arg1.field3505 == 0 ? arg1.field3470 : arg1.field3505;
        int var4 = arg1.field3514 == 0 ? arg1.field3498 : arg1.field3514;
        method4722(arg0, arg1.field3539, var3, var4, arg2);
        if (arg1.field3624 != null) {
            method4722(arg1.field3624, arg1.field3539, var3, var4, arg2);
        }
        class84 var5 = (class84) field668.method7466((long) arg1.field3539);
        if (var5 != null) {
            int var6 = var5.field1039;
            if (class303.method4633(var6)) {
                method4722(Statics.field3615[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3486 == 1337) {
        }
    }

    @ObfuscatedName("iv.jf([Lkn;IIIZB)V")
    public static void method4722(class303[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class303 var6 = arg0[var5];
            if (var6 != null && var6.field3618 == arg1) {
                method4705(var6, arg2, arg3, arg4);
                method5913(var6, arg2, arg3);
                if (var6.field3503 > var6.field3505 - var6.field3470) {
                    var6.field3503 = var6.field3505 - var6.field3470;
                }
                if (var6.field3503 < 0) {
                    var6.field3503 = 0;
                }
                if (var6.field3504 > var6.field3514 - var6.field3498) {
                    var6.field3504 = var6.field3514 - var6.field3498;
                }
                if (var6.field3504 < 0) {
                    var6.field3504 = 0;
                }
                if (var6.field3484 == 0) {
                    method201(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ia.jv(Lkn;IIZB)V")
    public static void method4705(class303 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3470;
        int var5 = arg0.field3498;
        if (arg0.field3530 == 0) {
            arg0.field3470 = arg0.field3508;
        } else if (arg0.field3530 == 1) {
            arg0.field3470 = arg1 - arg0.field3508;
        } else if (arg0.field3530 == 2) {
            arg0.field3470 = arg0.field3508 * arg1 >> 14;
        }
        if (arg0.field3490 == 0) {
            arg0.field3498 = arg0.field3494;
        } else if (arg0.field3490 == 1) {
            arg0.field3498 = arg2 - arg0.field3494;
        } else if (arg0.field3490 == 2) {
            arg0.field3498 = arg0.field3494 * arg2 >> 14;
        }
        if (arg0.field3530 == 4) {
            arg0.field3470 = arg0.field3499 * arg0.field3498 / arg0.field3533;
        }
        if (arg0.field3490 == 4) {
            arg0.field3498 = arg0.field3533 * arg0.field3470 / arg0.field3499;
        }
        if (arg0.field3486 == 1337) {
            field679 = arg0;
        }
        if (arg0.field3484 == 12) {
            arg0.method5529().method5225(arg0.field3470, arg0.field3498);
        }
        if (arg3 && arg0.field3608 != null && (arg0.field3470 != var4 || arg0.field3498 != var5)) {
            class85 var6 = new class85();
            var6.field1053 = arg0;
            var6.field1045 = arg0.field3608;
            field623.method6031(var6);
        }
    }

    @ObfuscatedName("lo.jz(Lkn;III)V")
    public static void method5913(class303 arg0, int arg1, int arg2) {
        if (arg0.field3487 == 0) {
            arg0.field3495 = arg0.field3491;
        } else if (arg0.field3487 == 1) {
            arg0.field3495 = (arg1 - arg0.field3470) / 2 + arg0.field3491;
        } else if (arg0.field3487 == 2) {
            arg0.field3495 = arg1 - arg0.field3470 - arg0.field3491;
        } else if (arg0.field3487 == 3) {
            arg0.field3495 = arg0.field3491 * arg1 >> 14;
        } else if (arg0.field3487 == 4) {
            arg0.field3495 = (arg0.field3491 * arg1 >> 14) + (arg1 - arg0.field3470) / 2;
        } else {
            arg0.field3495 = arg1 - arg0.field3470 - (arg0.field3491 * arg1 >> 14);
        }
        if (arg0.field3488 == 0) {
            arg0.field3573 = arg0.field3492;
        } else if (arg0.field3488 == 1) {
            arg0.field3573 = (arg2 - arg0.field3498) / 2 + arg0.field3492;
        } else if (arg0.field3488 == 2) {
            arg0.field3573 = arg2 - arg0.field3498 - arg0.field3492;
        } else if (arg0.field3488 == 3) {
            arg0.field3573 = arg0.field3492 * arg2 >> 14;
        } else if (arg0.field3488 == 4) {
            arg0.field3573 = (arg0.field3492 * arg2 >> 14) + (arg2 - arg0.field3498) / 2;
        } else {
            arg0.field3573 = arg2 - arg0.field3498 - (arg0.field3492 * arg2 >> 14);
        }
    }

    @ObfuscatedName("d.js(Lkn;IIIIIII)V")
    public static final void method29(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field572) {
            field573 = 32;
        } else {
            field573 = 0;
        }
        field572 = false;
        if (class37.field246 == 1 || !Statics.field1024 && class37.field246 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3504 -= 4;
                method2867(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3504 += 4;
                method2867(arg0);
            } else if (arg5 >= arg1 - field573 && arg5 < field573 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3504 = (arg4 - arg3) * var8 / var9;
                method2867(arg0);
                field572 = true;
            }
        }
        if (field497 == 0) {
            return;
        }
        int var10 = arg0.field3470;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3504 += field497 * 45;
            method2867(arg0);
        }
    }

    @ObfuscatedName("ce.jr(IIIIII)V")
    public static final void method2359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field4746[0].method8102(arg0, arg1);
        Statics.field4746[1].method8102(arg0, arg1 + arg3 - 16);
        class473.method8022(arg0, arg1 + 16, 16, arg3 - 32, field715);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class473.method8022(arg0, arg1 + 16 + var6, 16, var5, field569);
        class473.method8029(arg0, arg1 + 16 + var6, var5, field571);
        class473.method8029(arg0 + 1, arg1 + 16 + var6, var5, field571);
        class473.method8028(arg0, arg1 + 16 + var6, 16, field571);
        class473.method8028(arg0, arg1 + 17 + var6, 16, field571);
        class473.method8029(arg0 + 15, arg1 + 16 + var6, var5, field570);
        class473.method8029(arg0 + 14, arg1 + 17 + var6, var5 - 1, field570);
        class473.method8028(arg0, arg1 + 15 + var6 + var5, 16, field570);
        class473.method8028(arg0 + 1, arg1 + 14 + var6 + var5, 15, field570);
    }

    @ObfuscatedName("ft.jq(II)Ljava/lang/String;")
    public static final String method3052(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ap.kb(Lkn;B)Z")
    public static final boolean method689(class303 arg0) {
        if (arg0.field3613 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3613.length; var1++) {
            int var2 = method4849(arg0, var1);
            int var3 = arg0.field3614[var1];
            if (arg0.field3613[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3613[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3613[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("jb.km(Lkn;II)I")
    public static final int method4849(class303 arg0, int arg1) {
        if (arg0.field3635 == null || arg1 >= arg0.field3635.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3635[arg1];
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
                    var7 = field638[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field675[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field640[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class303 var11 = class303.method4921(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class195.method5052(var12).field2175 || field493)) {
                        for (int var13 = 0; var13 < var11.field3483.length; var13++) {
                            if (var12 + 1 == var11.field3483[var13]) {
                                var7 += var11.field3478[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class293.field3391[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class313.field3700[field675[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class293.field3391[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field3404.field1103;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class313.field3698[var14]) {
                            var7 += field675[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class303 var17 = class303.method4921(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class195.method5052(var18).field2175 || field493)) {
                        for (int var19 = 0; var19 < var17.field3483.length; var19++) {
                            if (var18 + 1 == var17.field3483[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field674;
                }
                if (var6 == 12) {
                    var7 = field717;
                }
                if (var6 == 13) {
                    int var20 = class293.field3391[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class293.method1999(var22);
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
                    var7 = (Statics.field3404.field1163 >> 7) + Statics.field142;
                }
                if (var6 == 19) {
                    var7 = (Statics.field3404.field1138 >> 7) + Statics.field1754;
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

    @ObfuscatedName("ew.kf(Lkn;Lgp;IIZI)V")
    public static final void method2842(class303 arg0, class195 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field2162;
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
            var7 = class323.field3768;
        }
        if (var6 != -1 && var7 != null) {
            method2625(var7, class97.method4293(16748608) + arg1.field2144, var6, 0, arg2, arg0.field3539, arg1.field2142, arg4);
        }
    }

    @ObfuscatedName("bk.kj(Lkn;III)V")
    public static final void method1098(class303 arg0, int arg1, int arg2) {
        if (arg0.field3485 == 1) {
            method1998(arg0.field3617, "", 24, 0, 0, arg0.field3539, arg0.field3467);
        }
        if (arg0.field3485 == 2 && !field662) {
            String var3 = method5692(arg0);
            if (var3 != null) {
                method1998(var3, class97.method4293(65280) + arg0.field3616, 25, 0, -1, arg0.field3539, arg0.field3467);
            }
        }
        if (arg0.field3485 == 3) {
            method203(class323.field3938, "", 26, 0, 0, arg0.field3539);
        }
        if (arg0.field3485 == 4) {
            method203(arg0.field3617, "", 28, 0, 0, arg0.field3539);
        }
        if (arg0.field3485 == 5) {
            method203(arg0.field3617, "", 29, 0, 0, arg0.field3539);
        }
        if (arg0.field3485 == 6 && field499 == null) {
            method203(arg0.field3617, "", 30, 0, -1, arg0.field3539);
        }
        if (arg0.field3484 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3498; var5++) {
                for (int var6 = 0; var6 < arg0.field3470; var6++) {
                    int var7 = (arg0.field3550 + 32) * var6;
                    int var8 = (arg0.field3551 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3552[var4];
                        var8 += arg0.field3553[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field750 = var4;
                        Statics.field1824 = arg0;
                        if (arg0.field3483[var4] > 0) {
                            label266: {
                                class195 var9 = class195.method5052(arg0.field3483[var4] - 1);
                                if (field660 == 1) {
                                    int var10 = method3618(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field2751 != arg0.field3539 || Statics.field8 != var4) {
                                            method1998(class323.field3773, field661 + " " + class97.field1276 + " " + class97.method4293(16748608) + var9.field2144, 31, 0, var4, arg0.field3539, var9.field2142);
                                        }
                                        break label266;
                                    }
                                }
                                if (field662) {
                                    int var12 = method3618(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1416 & 0x10) == 16) {
                                            method1998(field511, field612 + " " + class97.field1276 + " " + class97.method4293(16748608) + var9.field2144, 32, 0, var4, arg0.field3539, var9.field2142);
                                        }
                                        break label266;
                                    }
                                }
                                String[] var14 = var9.field2162;
                                int var15 = -1;
                                if (field506 && method3093()) {
                                    var15 = var9.method3480();
                                }
                                int var16 = method3618(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != var18) {
                                            method2842(arg0, var9, var4, var18, false);
                                        }
                                    }
                                }
                                class304 var10000 = (class304) null;
                                if (class304.method4882(method3618(arg0))) {
                                    method1998(class323.field3773, class97.method4293(16748608) + var9.field2144, 38, 0, var4, arg0.field3539, var9.field2142);
                                }
                                int var19 = method3618(arg0);
                                boolean var20 = (var19 >> 30 & 0x1) != 0;
                                if (var20) {
                                    for (int var21 = 2; var21 >= 0; var21--) {
                                        if (var15 != var21) {
                                            method2842(arg0, var9, var4, var21, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method2842(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var22 = arg0.field3555;
                                if (var22 != null) {
                                    for (int var23 = 4; var23 >= 0; var23--) {
                                        if (var22[var23] != null) {
                                            byte var24 = 0;
                                            if (var23 == 0) {
                                                var24 = 39;
                                            }
                                            if (var23 == 1) {
                                                var24 = 40;
                                            }
                                            if (var23 == 2) {
                                                var24 = 41;
                                            }
                                            if (var23 == 3) {
                                                var24 = 42;
                                            }
                                            if (var23 == 4) {
                                                var24 = 43;
                                            }
                                            method1998(var22[var23], class97.method4293(16748608) + var9.field2144, var24, 0, var4, arg0.field3539, var9.field2142);
                                        }
                                    }
                                }
                                method1998(class323.field4057, class97.method4293(16748608) + var9.field2144, 1005, 0, var4, arg0.field3539, var9.field2142);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3481) {
            return;
        }
        if (field662) {
            int var25 = method3618(arg0);
            boolean var26 = (var25 >> 21 & 0x1) != 0;
            if (var26 && (Statics.field1416 & 0x20) == 32) {
                method1998(field511, field612 + " " + class97.field1276 + " " + arg0.field3567, 58, 0, arg0.field3506, arg0.field3539, arg0.field3467);
            }
            return;
        }
        for (int var27 = 9; var27 >= 5; var27--) {
            String var28 = method6619(arg0, var27);
            if (var28 != null) {
                method1998(var28, arg0.field3567, 1007, var27 + 1, arg0.field3506, arg0.field3539, arg0.field3467);
            }
        }
        String var29 = method5692(arg0);
        if (var29 != null) {
            method1998(var29, arg0.field3567, 25, 0, arg0.field3506, arg0.field3539, arg0.field3467);
        }
        for (int var30 = 4; var30 >= 0; var30--) {
            String var31 = method6619(arg0, var30);
            if (var31 != null) {
                method2625(var31, arg0.field3567, 57, var30 + 1, arg0.field3506, arg0.field3539, arg0.field3467, arg0.field3636);
            }
        }
        int var32 = method3618(arg0);
        boolean var33 = (var32 & 0x1) != 0;
        if (var33) {
            method203(class323.field3772, "", 30, 0, arg0.field3506, arg0.field3539);
        }
    }

    @ObfuscatedName("ro.kv(ZI)V")
    public static void method8276(boolean arg0) {
        field654 = arg0;
    }

    @ObfuscatedName("hp.kl(B)Z")
    public static boolean method3800() {
        return field654;
    }

    @ObfuscatedName("fw.kg(I)Z")
    public static boolean method3093() {
        return field654 || field734.method3626(81);
    }

    @ObfuscatedName("iv.ki(IIIIIIIB)V")
    public static final void method4723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class303.method4633(arg0)) {
            method2638(Statics.field3615[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("dx.ko([Lkn;IIIIIIII)V")
    public static final void method2638(class303[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class303 var9 = arg0[var8];
            if (var9 != null && var9.field3618 == arg1 && (var9.method5561() || method3618(var9) != 0 || field681 == var9)) {
                if (var9.field3481) {
                    if (method27(var9)) {
                        continue;
                    }
                } else if (var9.field3484 == 0 && Statics.field2556 != var9 && method27(var9)) {
                    continue;
                }
                if (var9.field3484 == 11) {
                    if (var9.method5526(Statics.field318)) {
                        if (var9.method5528()) {
                            method2867(var9);
                            method201(var9.field3624, var9, true);
                        }
                        if (var9.field3611 != null) {
                            class85 var10 = new class85();
                            var10.field1053 = var9;
                            var10.field1045 = var9.field3611;
                            field623.method6031(var10);
                        }
                    }
                } else if (var9.field3484 == 12 && var9.method5578()) {
                    method2867(var9);
                }
                int var11 = var9.field3495 + arg6;
                int var12 = var9.field3573 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field3484 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field3484 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field3470 + var11;
                    int var20 = var9.field3498 + var12;
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
                    int var23 = var9.field3470 + var11;
                    int var24 = var9.field3498 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field732 == var9) {
                    field641 = true;
                    field689 = var11;
                    field690 = var12;
                }
                boolean var25 = false;
                if (var9.field3562) {
                    switch(field669) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3539 >>> 16 == field756) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field756 == var9.field3539) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3481 || var13 < var15 && var14 < var16) {
                    if (var9.field3481) {
                        if (var9.field3561) {
                            if (class37.field241 >= var13 && class37.field242 >= var14 && class37.field241 < var15 && class37.field242 < var16) {
                                for (class85 var26 = (class85) field623.method6040(); var26 != null; var26 = (class85) field623.method6034()) {
                                    if (var26.field1051) {
                                        var26.method7170();
                                        var26.field1053.field3625 = false;
                                    }
                                }
                                method3571();
                                if (Statics.field974 == 0) {
                                    field732 = null;
                                    field681 = null;
                                }
                                if (!field642) {
                                    method5131();
                                }
                            }
                        } else if (var9.field3471 && class37.field241 >= var13 && class37.field242 >= var14 && class37.field241 < var15 && class37.field242 < var16) {
                            for (class85 var27 = (class85) field623.method6040(); var27 != null; var27 = (class85) field623.method6034()) {
                                if (var27.field1051 && var27.field1053.field3596 == var27.field1045) {
                                    var27.method7170();
                                }
                            }
                        }
                    }
                    int var28 = class37.field241;
                    int var29 = class37.field242;
                    if (class37.field234 != 0) {
                        var28 = class37.field240;
                        var29 = class37.field250;
                    }
                    boolean var30 = var28 >= var13 && var29 >= var14 && var28 < var15 && var29 < var16;
                    if (var9.field3486 == 1337) {
                        if (!field686 && !field642 && var30) {
                            Statics.method683(var28, var29, var13, var14);
                        }
                    } else if (var9.field3486 == 1338) {
                        method2946(var9, var11, var12);
                    } else {
                        if (var9.field3486 == 1400) {
                            Statics.field31.method7294(class37.field241, class37.field242, var30, var11, var12, var9.field3470, var9.field3498);
                        }
                        if (!field642 && var30) {
                            if (var9.field3486 == 1400) {
                                Statics.field31.method7265(var11, var12, var9.field3470, var9.field3498, var28, var29);
                            } else {
                                method1098(var9, var28 - var11, var29 - var12);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3563.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3563[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3563[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3565 != null) {
                                            var35 = field734.method3626(var9.field3563[var31][var34]);
                                        }
                                        if (method2942(var9.field3563[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3565 != null && var9.field3565[var31] > field503) {
                                                break;
                                            }
                                            byte var36 = var9.field3564[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field734.method3626(86) && !field734.method3626(82) && !field734.method3626(81)) && ((var36 & 0x2) == 0 || field734.method3626(86)) && ((var36 & 0x1) == 0 || field734.method3626(82)) && ((var36 & 0x4) == 0 || field734.method3626(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method4891(var31 + 1, var9.field3539, var9.field3506, var9.field3467, "");
                                    } else if (var31 == 10) {
                                        method2451();
                                        method4657(var9.field3539, var9.field3506, class304.method3082(method3618(var9)), var9.field3467);
                                        field511 = method5692(var9);
                                        if (field511 == null) {
                                            field511 = class323.field3774;
                                        }
                                        field612 = var9.field3567 + class97.method4293(16777215);
                                    }
                                    int var37 = var9.field3612[var31];
                                    if (var9.field3565 == null) {
                                        var9.field3565 = new int[var9.field3563.length];
                                    }
                                    if (var9.field3566 == null) {
                                        var9.field3566 = new int[var9.field3563.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3565[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3565[var31] == 0) {
                                        var9.field3565[var31] = field503 + var37 + var9.field3566[var31];
                                    } else {
                                        var9.field3565[var31] = field503 + var37;
                                    }
                                }
                                if (!var32 && var9.field3565 != null) {
                                    var9.field3565[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3481) {
                            boolean var38;
                            if (class37.field241 >= var13 && class37.field242 >= var14 && class37.field241 < var15 && class37.field242 < var16) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class37.field246 == 1 || !Statics.field1024 && class37.field246 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class37.field234 == 1 || !Statics.field1024 && class37.field234 == 4) && class37.field240 >= var13 && class37.field250 >= var14 && class37.field240 < var15 && class37.field250 < var16) {
                                var40 = true;
                            }
                            if (var40) {
                                method5650(var9, class37.field240 - var11, class37.field250 - var12);
                            }
                            if (var9.method5514()) {
                                if (var40) {
                                    field714.method6031(new class199(0, class37.field241 - var11, class37.field242 - var12, var9));
                                }
                                if (var39) {
                                    field714.method6031(new class199(1, class37.field241 - var11, class37.field242 - var12, var9));
                                }
                            }
                            if (var9.field3486 == 1400) {
                                Statics.field31.method7379(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field732 != null && field732 != var9 && var38 && class304.method202(method3618(var9))) {
                                field684 = var9;
                            }
                            if (field681 == var9) {
                                field685 = true;
                                field604 = var11;
                                field687 = var12;
                            }
                            if (var9.field3574) {
                                if (var38 && field497 != 0 && var9.field3596 != null) {
                                    class85 var41 = new class85();
                                    var41.field1051 = true;
                                    var41.field1053 = var9;
                                    var41.field1047 = field497;
                                    var41.field1045 = var9.field3596;
                                    field623.method6031(var41);
                                }
                                if (field732 != null || Statics.field2006 != null || field642) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3513 && var40) {
                                    var9.field3513 = true;
                                    if (var9.field3633 != null) {
                                        class85 var42 = new class85();
                                        var42.field1051 = true;
                                        var42.field1053 = var9;
                                        var42.field1052 = class37.field240 - var11;
                                        var42.field1047 = class37.field250 - var12;
                                        var42.field1045 = var9.field3633;
                                        field623.method6031(var42);
                                    }
                                }
                                if (var9.field3513 && var39 && var9.field3577 != null) {
                                    class85 var43 = new class85();
                                    var43.field1051 = true;
                                    var43.field1053 = var9;
                                    var43.field1052 = class37.field241 - var11;
                                    var43.field1047 = class37.field242 - var12;
                                    var43.field1045 = var9.field3577;
                                    field623.method6031(var43);
                                }
                                if (var9.field3513 && !var39) {
                                    var9.field3513 = false;
                                    if (var9.field3578 != null) {
                                        class85 var44 = new class85();
                                        var44.field1051 = true;
                                        var44.field1053 = var9;
                                        var44.field1052 = class37.field241 - var11;
                                        var44.field1047 = class37.field242 - var12;
                                        var44.field1045 = var9.field3578;
                                        field671.method6031(var44);
                                    }
                                }
                                if (var39 && var9.field3579 != null) {
                                    class85 var45 = new class85();
                                    var45.field1051 = true;
                                    var45.field1053 = var9;
                                    var45.field1052 = class37.field241 - var11;
                                    var45.field1047 = class37.field242 - var12;
                                    var45.field1045 = var9.field3579;
                                    field623.method6031(var45);
                                }
                                if (!var9.field3625 && var38) {
                                    var9.field3625 = true;
                                    if (var9.field3580 != null) {
                                        class85 var46 = new class85();
                                        var46.field1051 = true;
                                        var46.field1053 = var9;
                                        var46.field1052 = class37.field241 - var11;
                                        var46.field1047 = class37.field242 - var12;
                                        var46.field1045 = var9.field3580;
                                        field623.method6031(var46);
                                    }
                                }
                                if (var9.field3625 && var38 && var9.field3581 != null) {
                                    class85 var47 = new class85();
                                    var47.field1051 = true;
                                    var47.field1053 = var9;
                                    var47.field1052 = class37.field241 - var11;
                                    var47.field1047 = class37.field242 - var12;
                                    var47.field1045 = var9.field3581;
                                    field623.method6031(var47);
                                }
                                if (var9.field3625 && !var38) {
                                    var9.field3625 = false;
                                    if (var9.field3476 != null) {
                                        class85 var48 = new class85();
                                        var48.field1051 = true;
                                        var48.field1053 = var9;
                                        var48.field1052 = class37.field241 - var11;
                                        var48.field1047 = class37.field242 - var12;
                                        var48.field1045 = var9.field3476;
                                        field671.method6031(var48);
                                    }
                                }
                                if (var9.field3593 != null) {
                                    class85 var49 = new class85();
                                    var49.field1053 = var9;
                                    var49.field1045 = var9.field3593;
                                    field712.method6031(var49);
                                }
                                if (var9.field3587 != null && field548 > var9.field3628) {
                                    if (var9.field3588 == null || field548 - var9.field3628 > 32) {
                                        class85 var54 = new class85();
                                        var54.field1053 = var9;
                                        var54.field1045 = var9.field3587;
                                        field623.method6031(var54);
                                    } else {
                                        label654: for (int var50 = var9.field3628; var50 < field548; var50++) {
                                            int var51 = field789[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3588.length; var52++) {
                                                if (var9.field3588[var52] == var51) {
                                                    class85 var53 = new class85();
                                                    var53.field1053 = var9;
                                                    var53.field1045 = var9.field3587;
                                                    field623.method6031(var53);
                                                    break label654;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3628 = field548;
                                }
                                if (var9.field3607 != null && field696 > var9.field3629) {
                                    if (var9.field3590 == null || field696 - var9.field3629 > 32) {
                                        class85 var59 = new class85();
                                        var59.field1053 = var9;
                                        var59.field1045 = var9.field3607;
                                        field623.method6031(var59);
                                    } else {
                                        label630: for (int var55 = var9.field3629; var55 < field696; var55++) {
                                            int var56 = field695[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3590.length; var57++) {
                                                if (var9.field3590[var57] == var56) {
                                                    class85 var58 = new class85();
                                                    var58.field1053 = var9;
                                                    var58.field1045 = var9.field3607;
                                                    field623.method6031(var58);
                                                    break label630;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3629 = field696;
                                }
                                if (var9.field3591 != null && field600 > var9.field3619) {
                                    if (var9.field3592 == null || field600 - var9.field3619 > 32) {
                                        class85 var64 = new class85();
                                        var64.field1053 = var9;
                                        var64.field1045 = var9.field3591;
                                        field623.method6031(var64);
                                    } else {
                                        label606: for (int var60 = var9.field3619; var60 < field600; var60++) {
                                            int var61 = field697[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3592.length; var62++) {
                                                if (var9.field3592[var62] == var61) {
                                                    class85 var63 = new class85();
                                                    var63.field1053 = var9;
                                                    var63.field1045 = var9.field3591;
                                                    field623.method6031(var63);
                                                    break label606;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3619 = field600;
                                }
                                if (field701 > var9.field3627 && var9.field3524 != null) {
                                    class85 var65 = new class85();
                                    var65.field1053 = var9;
                                    var65.field1045 = var9.field3524;
                                    field623.method6031(var65);
                                }
                                if (field702 > var9.field3627 && var9.field3601 != null) {
                                    class85 var66 = new class85();
                                    var66.field1053 = var9;
                                    var66.field1045 = var9.field3601;
                                    field623.method6031(var66);
                                }
                                if (field703 > var9.field3627 && var9.field3602 != null) {
                                    class85 var67 = new class85();
                                    var67.field1053 = var9;
                                    var67.field1045 = var9.field3602;
                                    field623.method6031(var67);
                                }
                                if (field704 > var9.field3627 && var9.field3603 != null) {
                                    class85 var68 = new class85();
                                    var68.field1053 = var9;
                                    var68.field1045 = var9.field3603;
                                    field623.method6031(var68);
                                }
                                if (field705 > var9.field3627 && var9.field3474 != null) {
                                    class85 var69 = new class85();
                                    var69.field1053 = var9;
                                    var69.field1045 = var9.field3474;
                                    field623.method6031(var69);
                                }
                                if (field706 > var9.field3627 && var9.field3609 != null) {
                                    class85 var70 = new class85();
                                    var70.field1053 = var9;
                                    var70.field1045 = var9.field3609;
                                    field623.method6031(var70);
                                }
                                if (field707 > var9.field3627 && var9.field3583 != null) {
                                    class85 var71 = new class85();
                                    var71.field1053 = var9;
                                    var71.field1045 = var9.field3583;
                                    field623.method6031(var71);
                                }
                                if (field500 > var9.field3627 && var9.field3605 != null) {
                                    class85 var72 = new class85();
                                    var72.field1053 = var9;
                                    var72.field1045 = var9.field3605;
                                    field623.method6031(var72);
                                }
                                var9.field3627 = field736;
                                if (var9.field3598 != null) {
                                    for (int var73 = 0; var73 < field680; var73++) {
                                        class85 var74 = new class85();
                                        var74.field1053 = var9;
                                        var74.field1048 = field738[var73];
                                        var74.field1046 = field614[var73];
                                        var74.field1045 = var9.field3598;
                                        field623.method6031(var74);
                                    }
                                }
                                if (var9.field3599 != null) {
                                    int[] var75 = field734.method3646();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class85 var77 = new class85();
                                        var77.field1053 = var9;
                                        var77.field1048 = var75[var76];
                                        var77.field1045 = var9.field3599;
                                        field623.method6031(var77);
                                    }
                                }
                                if (var9.field3600 != null) {
                                    int[] var78 = field734.method3627();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class85 var80 = new class85();
                                        var80.field1053 = var9;
                                        var80.field1048 = var78[var79];
                                        var80.field1045 = var9.field3600;
                                        field623.method6031(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3481) {
                            if (field732 != null || Statics.field2006 != null || field642) {
                                continue;
                            }
                            if ((var9.field3558 >= 0 || var9.field3509 != 0) && class37.field241 >= var13 && class37.field242 >= var14 && class37.field241 < var15 && class37.field242 < var16) {
                                if (var9.field3558 >= 0) {
                                    Statics.field2556 = arg0[var9.field3558];
                                } else {
                                    Statics.field2556 = var9;
                                }
                            }
                            if (var9.field3484 == 8 && class37.field241 >= var13 && class37.field242 >= var14 && class37.field241 < var15 && class37.field242 < var16) {
                                Statics.field2557 = var9;
                            }
                            if (var9.field3514 > var9.field3498) {
                                method29(var9, var9.field3470 + var11, var12, var9.field3498, var9.field3514, class37.field241, class37.field242);
                            }
                        }
                        if (var9.field3484 == 0) {
                            method2638(arg0, var9.field3539, var13, var14, var15, var16, var11 - var9.field3503, var12 - var9.field3504);
                            if (var9.field3624 != null) {
                                method2638(var9.field3624, var9.field3539, var13, var14, var15, var16, var11 - var9.field3503, var12 - var9.field3504);
                            }
                            class84 var81 = (class84) field668.method7466((long) var9.field3539);
                            if (var81 != null) {
                                if (var81.field1040 == 0 && class37.field241 >= var13 && class37.field242 >= var14 && class37.field241 < var15 && class37.field242 < var16 && !field642) {
                                    for (class85 var82 = (class85) field623.method6040(); var82 != null; var82 = (class85) field623.method6034()) {
                                        if (var82.field1051) {
                                            var82.method7170();
                                            var82.field1053.field3625 = false;
                                        }
                                    }
                                    if (Statics.field974 == 0) {
                                        field732 = null;
                                        field681 = null;
                                    }
                                    if (!field642) {
                                        method5131();
                                    }
                                }
                                method4723(var81.field1039, var13, var14, var15, var16, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eg.kp(II)Z")
    public static boolean method2942(int arg0) {
        for (int var1 = 0; var1 < field680; var1++) {
            if (field738[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("hi.ke(III)V")
    public static final void method4291(int arg0, int arg1) {
        if (class303.method4633(arg0)) {
            method2337(Statics.field3615[arg0], arg1);
        }
    }

    @ObfuscatedName("ce.kz([Lkn;II)V")
    public static final void method2337(class303[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class303 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3484 == 0) {
                    if (var3.field3624 != null) {
                        method2337(var3.field3624, arg1);
                    }
                    class84 var4 = (class84) field668.method7466((long) var3.field3539);
                    if (var4 != null) {
                        method4291(var4.field1039, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3606 != null) {
                    class85 var5 = new class85();
                    var5.field1053 = var3;
                    var5.field1045 = var3.field3606;
                    class68.method4883(var5);
                }
                if (arg1 == 1 && var3.field3501 != null) {
                    if (var3.field3506 >= 0) {
                        class303 var6 = class303.method4921(var3.field3539);
                        if (var6 == null || var6.field3624 == null || var3.field3506 >= var6.field3624.length || var6.field3624[var3.field3506] != var3) {
                            continue;
                        }
                    }
                    class85 var7 = new class85();
                    var7.field1053 = var3;
                    var7.field1045 = var3.field3501;
                    class68.method4883(var7);
                }
            }
        }
    }

    @ObfuscatedName("ky.kx(Lkn;III)V")
    public static final void method5650(class303 arg0, int arg1, int arg2) {
        if (field732 != null || field642 || arg0 == null) {
            return;
        }
        class303 var3 = method4671(arg0);
        if (var3 == null) {
            var3 = arg0.field3569;
        }
        if (var3 == null) {
            return;
        }
        field732 = arg0;
        class303 var5 = arg0;
        int var6 = method3618(arg0);
        int var7 = var6 >> 17 & 0x7;
        int var8 = var7;
        class303 var9;
        if (var7 == 0) {
            var9 = null;
        } else {
            int var10 = 0;
            while (true) {
                if (var10 >= var8) {
                    var9 = var5;
                    break;
                }
                var5 = class303.method4921(var5.field3618);
                if (var5 == null) {
                    var9 = null;
                    break;
                }
                var10++;
            }
        }
        class303 var11 = var9;
        if (var9 == null) {
            var11 = arg0.field3569;
        }
        field681 = var11;
        field682 = arg1;
        field683 = arg2;
        Statics.field974 = 0;
        field691 = false;
        int var13 = method4725();
        if (var13 != -1) {
            method88(var13);
        }
        return;
    }

    @ObfuscatedName("client.ks(B)V")
    public final void method1144() {
        method2867(field732);
        Statics.field974++;
        if (field641 && field685) {
            int var1 = class37.field241;
            int var2 = class37.field242;
            int var3 = var1 - field682;
            int var4 = var2 - field683;
            if (var3 < field604) {
                var3 = field604;
            }
            if (field732.field3470 + var3 > field604 + field681.field3470) {
                var3 = field604 + field681.field3470 - field732.field3470;
            }
            if (var4 < field687) {
                var4 = field687;
            }
            if (field732.field3498 + var4 > field687 + field681.field3498) {
                var4 = field687 + field681.field3498 - field732.field3498;
            }
            int var5 = var3 - field689;
            int var6 = var4 - field690;
            int var7 = field732.field3622;
            if (Statics.field974 > field732.field3626 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field691 = true;
            }
            int var8 = field681.field3503 + (var3 - field604);
            int var9 = field681.field3504 + (var4 - field687);
            if (field732.field3500 != null && field691) {
                class85 var10 = new class85();
                var10.field1053 = field732;
                var10.field1052 = var8;
                var10.field1047 = var9;
                var10.field1045 = field732.field3500;
                class68.method4883(var10);
            }
            if (class37.field246 == 0) {
                if (field691) {
                    if (field732.field3559 != null) {
                        class85 var11 = new class85();
                        var11.field1053 = field732;
                        var11.field1052 = var8;
                        var11.field1047 = var9;
                        var11.field1050 = field684;
                        var11.field1045 = field732.field3559;
                        class68.method4883(var11);
                    }
                    if (field684 != null) {
                        class303 var12 = field732;
                        int var13 = method3618(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class303 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class303.method4921(var12.field3618);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class275 var18 = class275.method3314(class273.field3055, field636.field1373);
                            var18.field3123.method7835(field732.field3539);
                            var18.field3123.method7775(field732.field3467);
                            var18.field3123.method7775(field732.field3506);
                            var18.field3123.method7775(field684.field3506);
                            var18.field3123.method7835(field684.field3539);
                            var18.field3123.method7753(field684.field3467);
                            field636.method2540(var18);
                        }
                    }
                } else if (this.method1140()) {
                    this.method1607(field689 + field682, field690 + field683);
                } else if (field553 > 0) {
                    int var19 = field689 + field682;
                    int var20 = field690 + field683;
                    class71 var21 = Statics.field1135;
                    if (var21 != null) {
                        method4872(var21.field886, var21.field881, var21.field880, var21.field883, var21.field884, var21.field885, var21.field890, var19, var20);
                    }
                    Statics.field1135 = null;
                }
                field732 = null;
            }
        } else if (Statics.field974 > 1) {
            if (!field691 && field553 > 0) {
                int var22 = field689 + field682;
                int var23 = field690 + field683;
                class71 var24 = Statics.field1135;
                if (var24 != null) {
                    method4872(var24.field886, var24.field881, var24.field880, var24.field883, var24.field884, var24.field885, var24.field890, var22, var23);
                }
                Statics.field1135 = null;
            }
            field732 = null;
        }
    }

    @ObfuscatedName("l.kk(II)V")
    public static void method88(int arg0) {
        Statics.field1135 = new class71();
        Statics.field1135.field886 = field709[arg0];
        Statics.field1135.field881 = field645[arg0];
        Statics.field1135.field880 = field646[arg0];
        Statics.field1135.field883 = field647[arg0];
        Statics.field1135.field884 = field648[arg0];
        Statics.field1135.field885 = field649[arg0];
        Statics.field1135.field890 = field781[arg0];
    }

    @ObfuscatedName("ef.kq(Lkn;B)V")
    public static void method2867(class303 arg0) {
        if (arg0 != null && field740 == arg0.field3632) {
            field718[arg0.field3631] = true;
        }
    }

    @ObfuscatedName("gp.kn(B)V")
    public static void method3476() {
        for (class84 var0 = (class84) field668.method7478(); var0 != null; var0 = (class84) field668.method7469()) {
            int var1 = var0.field1039;
            if (class303.method4633(var1)) {
                boolean var2 = true;
                class303[] var3 = Statics.field3615[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3481;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4635;
                    class303 var6 = class303.method4921(var5);
                    if (var6 != null) {
                        method2867(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cd.kd(II)V")
    public static final void method2112(int arg0) {
        if (!class303.method4633(arg0)) {
            return;
        }
        class303[] var1 = Statics.field3615[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class303 var3 = var1[var2];
            if (var3 != null) {
                var3.field3493 = 0;
                var3.field3540 = 0;
            }
        }
    }

    @ObfuscatedName("nn.ky(IB)V")
    public static final void method6578(int arg0) {
        if (class303.method4633(arg0)) {
            method1936(Statics.field3615[arg0], -1);
        }
    }

    @ObfuscatedName("bu.ku([Lkn;II)V")
    public static final void method1936(class303[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class303 var3 = arg0[var2];
            if (var3 != null && var3.field3618 == arg1 && (!var3.field3481 || !method27(var3))) {
                if (var3.field3484 == 0) {
                    if (!var3.field3481 && method27(var3) && Statics.field2556 != var3) {
                        continue;
                    }
                    method1936(arg0, var3.field3539);
                    if (var3.field3624 != null) {
                        method1936(var3.field3624, var3.field3539);
                    }
                    class84 var4 = (class84) field668.method7466((long) var3.field3539);
                    if (var4 != null) {
                        method6578(var4.field1039);
                    }
                }
                if (var3.field3484 == 6) {
                    if (var3.field3597 != -1 || var3.field3531 != -1) {
                        boolean var5 = method689(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3531;
                        } else {
                            var6 = var3.field3597;
                        }
                        if (var6 != -1) {
                            class197 var7 = class197.method3143(var6);
                            if (var7.method3576()) {
                                var3.field3493 += field559;
                                int var8 = var7.method3566();
                                if (var3.field3493 >= var8) {
                                    var3.field3493 -= var7.field2232;
                                    if (var3.field3493 < 0 || var3.field3493 >= var8) {
                                        var3.field3493 = 0;
                                    }
                                }
                                method2867(var3);
                            } else {
                                var3.field3540 += field559;
                                while (var3.field3540 > var7.field2220[var3.field3493]) {
                                    var3.field3540 -= var7.field2220[var3.field3493];
                                    var3.field3493++;
                                    if (var3.field3493 >= var7.field2218.length) {
                                        var3.field3493 -= var7.field2232;
                                        if (var3.field3493 < 0 || var3.field3493 >= var7.field2218.length) {
                                            var3.field3493 = 0;
                                        }
                                    }
                                    method2867(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3534 != 0 && !var3.field3481) {
                        int var9 = var3.field3534 >> 16;
                        int var10 = var3.field3534 << 16 >> 16;
                        int var11 = field559 * var9;
                        int var12 = field559 * var10;
                        var3.field3623 = var3.field3623 + var11 & 0x7FF;
                        var3.field3535 = var3.field3535 + var12 & 0x7FF;
                        method2867(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ht.kh(II)V")
    public static final void method4307(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method3787((double) var3);
    }

    @ObfuscatedName("mm.kw(I)I")
    public static final int method6203() {
        float var0 = 200.0F * ((float) Statics.field4526.method2293() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("gn.kc(D)V")
    public static final void method3787(double arg0) {
        class211.method3807(arg0);
        ((class219) Statics.field2422).method4145(arg0);
        class195.method498();
        Statics.field4526.method2290(arg0);
    }

    @ObfuscatedName("q.ka(IB)V")
    public static final void method283(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field4526.method2292()) {
            return;
        }
        if (Statics.field4526.method2292() == 0 && field606 != -1) {
            class284.method261(Statics.field272, field606, 0, var1, false);
            field639 = false;
        } else if (var1 == 0) {
            Statics.field3293.method5029();
            class284.field3294 = 1;
            Statics.field124 = null;
            field639 = false;
        } else {
            class284.method4720(var1);
        }
        Statics.field4526.method2291(var1);
    }

    @ObfuscatedName("bk.kr(II)V")
    public static final void method1091(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4526.method2280(var1);
    }

    @ObfuscatedName("kw.kt(II)V")
    public static final void method5679(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4526.method2295(var1);
    }

    @ObfuscatedName("eq.li(II)V")
    public static final void method2972(int arg0) {
        method3476();
        class67.method1682();
        int var1 = class177.method4855(arg0).field1866;
        if (var1 == 0) {
            return;
        }
        int var2 = class293.field3391[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method3787(0.9D);
            }
            if (var2 == 2) {
                method3787(0.8D);
            }
            if (var2 == 3) {
                method3787(0.7D);
            }
            if (var2 == 4) {
                method3787(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method283(255);
            }
            if (var2 == 1) {
                method283(192);
            }
            if (var2 == 2) {
                method283(128);
            }
            if (var2 == 3) {
                method283(64);
            }
            if (var2 == 4) {
                method283(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method1091(127);
            }
            if (var2 == 1) {
                method1091(96);
            }
            if (var2 == 2) {
                method1091(64);
            }
            if (var2 == 3) {
                method1091(32);
            }
            if (var2 == 4) {
                method1091(0);
            }
        }
        if (var1 == 5) {
            field720 = var2 == 1;
        }
        if (var1 == 6) {
            field611 = var2;
        }
        if (var1 == 9) {
            field672 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method5679(127);
            }
            if (var2 == 1) {
                method5679(96);
            }
            if (var2 == 2) {
                method5679(64);
            }
            if (var2 == 3) {
                method5679(32);
            }
            if (var2 == 4) {
                method5679(0);
            }
        }
        if (var1 == 17) {
            field677 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field670 = (class99) class344.method4292(class99.method1695(), var2);
            if (field670 == null) {
                field670 = class99.field1294;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field633 = -1;
            } else {
                field633 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field708 = (class99) class344.method4292(class99.method1695(), var2);
            if (field708 == null) {
                field708 = class99.field1294;
            }
        }
    }

    @ObfuscatedName("jd.lk(Lkn;I)V")
    public static final void method4889(class303 arg0) {
        int var1 = arg0.field3486;
        if (var1 == 324) {
            if (field540 == -1) {
                field540 = arg0.field3582;
                field544 = arg0.field3518;
            }
            if (field778.field3424 == 1) {
                arg0.field3582 = field540;
            } else {
                arg0.field3582 = field544;
            }
        } else if (var1 == 325) {
            if (field540 == -1) {
                field540 = arg0.field3582;
                field544 = arg0.field3518;
            }
            if (field778.field3424 == 1) {
                arg0.field3582 = field544;
            } else {
                arg0.field3582 = field540;
            }
        } else if (var1 == 327) {
            arg0.field3623 = 150;
            arg0.field3535 = (int) (Math.sin((double) field503 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3526 = 5;
            arg0.field3527 = 0;
        } else if (var1 == 328) {
            arg0.field3623 = 150;
            arg0.field3535 = (int) (Math.sin((double) field503 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3526 = 5;
            arg0.field3527 = 1;
        }
    }

    @ObfuscatedName("ma.la(I)V")
    public static final void method6189() {
        class275 var0 = class275.method3314(class273.field3098, field636.field1373);
        field636.method2540(var0);
        class68.field851 = true;
        for (class84 var1 = (class84) field668.method7478(); var1 != null; var1 = (class84) field668.method7469()) {
            if (var1.field1040 == 0 || var1.field1040 == 3) {
                method45(var1, true);
            }
        }
        if (field499 != null) {
            method2867(field499);
            field499 = null;
        }
        class68.field851 = false;
    }

    @ObfuscatedName("oo.lh(IIII)Lck;")
    public static final class84 method7098(int arg0, int arg1, int arg2) {
        class84 var3 = new class84();
        var3.field1039 = arg1;
        var3.field1040 = arg2;
        field668.method7468(var3, (long) arg0);
        method2112(arg1);
        class303 var4 = class303.method4921(arg0);
        method2867(var4);
        if (field499 != null) {
            method2867(field499);
            field499 = null;
        }
        method201(Statics.field3615[arg0 >> 16], var4, false);
        class68.method2937(arg1);
        if (field751 != -1) {
            method4291(field751, 1);
        }
        return var3;
    }

    @ObfuscatedName("d.lr(Lck;ZI)V")
    public static final void method45(class84 arg0, boolean arg1) {
        int var2 = arg0.field1039;
        int var3 = (int) arg0.field4635;
        arg0.method7170();
        if (arg1) {
            class303.method4756(var2);
        }
        method2869(var2);
        class303 var4 = class303.method4921(var3);
        if (var4 != null) {
            method2867(var4);
        }
        if (field751 != -1) {
            method4291(field751, 1);
        }
    }

    @ObfuscatedName("fa.lt(Lkn;B)Z")
    public static final boolean method3087(class303 arg0) {
        int var1 = arg0.field3486;
        if (var1 == 205) {
            field554 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field778.method5186(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field778.method5198(var4, var5 == 1);
        }
        if (var1 == 324) {
            field778.method5185(0);
        }
        if (var1 == 325) {
            field778.method5185(1);
        }
        if (var1 == 326) {
            class275 var6 = class275.method3314(class273.field3023, field636.field1373);
            field778.method5202(var6.field3123);
            field636.method2540(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bu.lq(Lkn;IIII)V")
    public static final void method1937(class303 arg0, int arg1, int arg2, int arg3) {
        method6200();
        class292 var4 = arg0.method5511(false);
        if (var4 == null) {
            return;
        }
        class473.method8015(arg1, arg2, var4.field3385 + arg1, var4.field3383 + arg2);
        if (field567 == 2 || field567 == 5) {
            class473.method8075(arg1, arg2, 0, var4.field3382, var4.field3384);
        } else {
            int var5 = field530 & 0x7FF;
            int var6 = Statics.field3404.field1163 / 32 + 48;
            int var7 = 464 - Statics.field3404.field1138 / 32;
            Statics.field3651.method8150(arg1, arg2, var4.field3385, var4.field3383, var6, var7, var5, 256, var4.field3382, var4.field3384);
            for (int var8 = 0; var8 < field743; var8++) {
                int var9 = field692[var8] * 4 + 2 - Statics.field3404.field1163 / 32;
                int var10 = field745[var8] * 4 + 2 - Statics.field3404.field1138 / 32;
                method4885(arg1, arg2, var9, var10, field676[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class349 var13 = field723[Statics.field478][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field3404.field1163 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field3404.field1138 / 32;
                        method4885(arg1, arg2, var14, var15, Statics.field414[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field549; var16++) {
                class96 var17 = field760[field550[var16]];
                if (var17 != null && var17.method2165()) {
                    class185 var18 = var17.field1267;
                    if (var18 != null && var18.field1977 != null) {
                        var18 = var18.method3242();
                    }
                    if (var18 != null && var18.field1984 && var18.field1981) {
                        int var19 = var17.field1163 / 32 - Statics.field3404.field1163 / 32;
                        int var20 = var17.field1138 / 32 - Statics.field3404.field1138 / 32;
                        method4885(arg1, arg2, var19, var20, Statics.field414[1], var4);
                    }
                }
            }
            int var21 = class103.field1317;
            int[] var22 = class103.field1318;
            for (int var23 = 0; var23 < var21; var23++) {
                class89 var24 = field621[var22[var23]];
                if (var24 != null && var24.method2165() && !var24.field1111 && Statics.field3404 != var24) {
                    int var25 = var24.field1163 / 32 - Statics.field3404.field1163 / 32;
                    int var26 = var24.field1138 / 32 - Statics.field3404.field1138 / 32;
                    if (var24.method2167()) {
                        method4885(arg1, arg2, var25, var26, Statics.field414[3], var4);
                    } else if (Statics.field3404.field1119 != 0 && var24.field1119 != 0 && Statics.field3404.field1119 == var24.field1119) {
                        method4885(arg1, arg2, var25, var26, Statics.field414[4], var4);
                    } else if (var24.method2196()) {
                        method4885(arg1, arg2, var25, var26, Statics.field414[5], var4);
                    } else if (var24.method2208()) {
                        method4885(arg1, arg2, var25, var26, Statics.field414[6], var4);
                    } else {
                        method4885(arg1, arg2, var25, var26, Statics.field414[2], var4);
                    }
                }
            }
            if (field510 != 0 && field503 % 20 < 10) {
                if (field510 == 1 && field737 >= 0 && field737 < field760.length) {
                    class96 var27 = field760[field737];
                    if (var27 != null) {
                        int var28 = var27.field1163 / 32 - Statics.field3404.field1163 / 32;
                        int var29 = var27.field1138 / 32 - Statics.field3404.field1138 / 32;
                        method441(arg1, arg2, var28, var29, Statics.field2758[1], var4);
                    }
                }
                if (field510 == 2) {
                    int var30 = field513 * 4 - Statics.field142 * 4 + 2 - Statics.field3404.field1163 / 32;
                    int var31 = field514 * 4 - Statics.field1754 * 4 + 2 - Statics.field3404.field1138 / 32;
                    method441(arg1, arg2, var30, var31, Statics.field2758[1], var4);
                }
                if (field510 == 10 && field512 >= 0 && field512 < field621.length) {
                    class89 var32 = field621[field512];
                    if (var32 != null) {
                        int var33 = var32.field1163 / 32 - Statics.field3404.field1163 / 32;
                        int var34 = var32.field1138 / 32 - Statics.field3404.field1138 / 32;
                        method441(arg1, arg2, var33, var34, Statics.field2758[1], var4);
                    }
                }
            }
            if (field747 != 0) {
                int var35 = field747 * 4 + 2 - Statics.field3404.field1163 / 32;
                int var36 = field748 * 4 + 2 - Statics.field3404.field1138 / 32;
                method4885(arg1, arg2, var35, var36, Statics.field2758[0], var4);
            }
            if (!Statics.field3404.field1111) {
                class473.method8022(var4.field3385 / 2 + arg1 - 1, var4.field3383 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field719[arg3] = true;
    }

    @ObfuscatedName("du.lc(Lkn;IIII)V")
    public static final void method2586(class303 arg0, int arg1, int arg2, int arg3) {
        class292 var4 = arg0.method5511(false);
        if (var4 == null) {
            return;
        }
        if (field567 < 3) {
            Statics.field1431.method8150(arg1, arg2, var4.field3385, var4.field3383, 25, 25, field530, 256, var4.field3382, var4.field3384);
        } else {
            class473.method8075(arg1, arg2, 0, var4.field3382, var4.field3384);
        }
    }

    @ObfuscatedName("ao.ls(IIIILri;Lkl;B)V")
    public static final void method441(int arg0, int arg1, int arg2, int arg3, class477 arg4, class292 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method4885(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field530 & 0x7FF;
        int var8 = class211.field2437[var7];
        int var9 = class211.field2438[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3385 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1711.method8221(arg5.field3385 / 2 + arg0 - var17 / 2 + var15, arg5.field3383 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("jo.lm(IIIILri;Lkl;B)V")
    public static final void method4885(int arg0, int arg1, int arg2, int arg3, class477 arg4, class292 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field530 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class211.field2437[var6];
        int var9 = class211.field2438[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method8149(arg5.field3385 / 2 + var10 - arg4.field4963 / 2, arg5.field3383 / 2 - var11 - arg4.field4964 / 2, arg0, arg1, arg5.field3385, arg5.field3383, arg5.field3382, arg5.field3384);
        } else {
            arg4.method8174(arg5.field3385 / 2 + arg0 + var10 - arg4.field4963 / 2, arg5.field3383 / 2 + arg1 - var11 - arg4.field4964 / 2);
        }
    }

    @ObfuscatedName("pz.lz(I)V")
    public static final void method7424() {
        class106.method852();
        if (Statics.field889 != null) {
            Statics.field889.method6672();
        }
    }

    @ObfuscatedName("cm.lf(I)V")
    public static final void method2379() {
        for (int var0 = 0; var0 < class103.field1317; var0++) {
            class89 var1 = field621[class103.field1318[var0]];
            var1.method2173();
        }
    }

    @ObfuscatedName("af.lu(B)V")
    public static final void method460() {
        for (int var0 = 0; var0 < class103.field1317; var0++) {
            class89 var1 = field621[class103.field1318[var0]];
            var1.method2171();
        }
    }

    @ObfuscatedName("mi.lv(I)V")
    public static final void method5950() {
        field703 = field736;
        Statics.field1407 = true;
    }

    @ObfuscatedName("dn.lj(I)V")
    public static final void method2748() {
        field704 = field736;
        Statics.field1617 = true;
    }

    @ObfuscatedName("g.lx(Ljava/lang/String;S)V")
    public static final void method309(String arg0) {
        if (Statics.field889 != null) {
            class275 var1 = class275.method3314(class273.field3031, field636.field1373);
            var1.field3123.method7698(class464.method2236(arg0));
            var1.field3123.method7705(arg0);
            field636.method2540(var1);
        }
    }

    @ObfuscatedName("gh.lw(Ljava/lang/String;I)V")
    public static final void method3622(String arg0) {
        if (!arg0.equals("")) {
            class275 var1 = class275.method3314(class273.field3007, field636.field1373);
            var1.field3123.method7698(class464.method2236(arg0));
            var1.field3123.method7705(arg0);
            field636.method2540(var1);
        }
    }

    @ObfuscatedName("es.lg(I)V")
    public static final void method2824() {
        class275 var0 = class275.method3314(class273.field3007, field636.field1373);
        var0.field3123.method7698(0);
        field636.method2540(var0);
    }

    @ObfuscatedName("ox.ll(III)V")
    public static final void method7088(int arg0, int arg1) {
        class156 var2 = arg0 >= 0 ? field741[arg0] : Statics.field2239;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2963()) {
            return;
        }
        class138 var3 = (class138) var2.field1728.get(arg1);
        if (var3.field1598 != -1) {
            return;
        }
        String var4 = var3.field1596.method8298();
        class275 var5 = class275.method3314(class273.field3040, field636.field1373);
        var5.field3123.method7698(3 + class464.method2236(var4));
        var5.field3123.method7698(arg0);
        var5.field3123.method7775(arg1);
        var5.field3123.method7705(var4);
        field636.method2540(var5);
    }

    @ObfuscatedName("gh.ly(III)V")
    public static final void method3604(int arg0, int arg1) {
        if (field741[arg0] == null || arg1 < 0 || arg1 >= field741[arg0].method2963()) {
            return;
        }
        class138 var2 = (class138) field741[arg0].field1728.get(arg1);
        if (var2.field1598 != -1) {
            return;
        }
        class275 var3 = class275.method3314(class273.field3072, field636.field1373);
        var3.field3123.method7698(3 + class464.method2236(var2.field1596.method8298()));
        var3.field3123.method7698(arg0);
        var3.field3123.method7775(arg1);
        var3.field3123.method7705(var2.field1596.method8298());
        field636.method2540(var3);
    }

    @ObfuscatedName("mk.ln(IIZI)V")
    public static final void method6190(int arg0, int arg1, boolean arg2) {
        if (field741[arg0] == null || arg1 < 0 || arg1 >= field741[arg0].method2963()) {
            return;
        }
        class138 var3 = (class138) field741[arg0].field1728.get(arg1);
        class275 var4 = class275.method3314(class273.field3091, field636.field1373);
        var4.field3123.method7698(4 + class464.method2236(var3.field1596.method8298()));
        var4.field3123.method7698(arg0);
        var4.field3123.method7775(arg1);
        var4.field3123.method7704(arg2);
        var4.field3123.method7705(var3.field1596.method8298());
        field636.method2540(var4);
    }

    @ObfuscatedName("ev.lb(II)V")
    public static void method2869(int arg0) {
        for (class429 var1 = (class429) field643.method7478(); var1 != null; var1 = (class429) field643.method7469()) {
            if ((var1.field4635 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method7170();
            }
        }
    }

    @ObfuscatedName("gh.lo(Lkn;I)I")
    public static int method3618(class303 arg0) {
        class429 var1 = (class429) field643.method7466(((long) arg0.field3539 << 32) + (long) arg0.field3506);
        return var1 == null ? arg0.field3549 : var1.field4634;
    }

    @ObfuscatedName("ir.le(Lkn;B)Lkn;")
    public static class303 method4671(class303 arg0) {
        int var1 = method3618(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class303.method4921(arg0.field3618);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("y.ld(Lkn;I)Z")
    public static boolean method27(class303 arg0) {
        return arg0.field3502;
    }

    @ObfuscatedName("nj.lp(Lkn;IB)Ljava/lang/String;")
    public static String method6619(class303 arg0, int arg1) {
        int var2 = method3618(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field3571 == null) {
            return null;
        } else if (arg0.field3568 == null || arg0.field3568.length <= arg1 || arg0.field3568[arg1] == null || arg0.field3568[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3568[arg1];
        }
    }

    @ObfuscatedName("lk.mi(Lkn;I)Ljava/lang/String;")
    public static String method5692(class303 arg0) {
        if (class304.method3082(method3618(arg0)) == 0) {
            return null;
        } else if (arg0.field3537 == null || arg0.field3537.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3537;
        }
    }

    @ObfuscatedName("ej.mc(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2840(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field769 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field769 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field769 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field769 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field769 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field975 != null) {
            var3 = "/p=" + Statics.field975;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1347 + "/a=" + Statics.field127 + var3 + "/";
    }

    @ObfuscatedName("lr.mj(Ljava/lang/String;I)V")
    public static void method5694(String arg0) {
        Statics.field975 = arg0;
        try {
            String var1 = Statics.field1599.getParameter(Integer.toString(18));
            String var2 = Statics.field1599.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class308.method5165(class280.method2629() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field1599;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("kz.mx(Ljava/lang/String;ZI)V")
    public static void method5180(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field4678; var5++) {
            class195 var6 = class195.method5052(var5);
            if ((!arg1 || var6.field2188) && var6.field2179 == -1 && var6.field2144.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1836 = -1;
                    Statics.field1314 = null;
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
        Statics.field1314 = var3;
        Statics.field4479 = 0;
        Statics.field1836 = var4;
        String[] var9 = new String[Statics.field1836];
        for (int var10 = 0; var10 < Statics.field1836; var10++) {
            var9[var10] = class195.method5052(var3[var10]).field2144;
        }
        class461.method6827(var9, Statics.field1314);
    }

    @ObfuscatedName("io.mv(Lqr;IB)V")
    public static void method4664(class464 arg0, int arg1) {
        byte[] var2 = arg0.field4867;
        if (field547 == null) {
            field547 = new byte[24];
        }
        class371.method6533(var2, arg1, field547, 0, 24);
        class165.method3554(arg0, arg1);
    }

    @ObfuscatedName("kj.mw(Lqr;I)V")
    public static void method5126(class464 arg0) {
        if (field547 != null) {
            arg0.method7708(field547, 0, field547.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class165.field1790.method7518(0L);
            class165.field1790.method7516(var1);
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
        arg0.method7708(var1, 0, var1.length);
    }

    @ObfuscatedName("client.mo(I)Lrg;")
    public class486 method1145() {
        return Statics.field3404 == null ? null : Statics.field3404.field1108;
    }

    @ObfuscatedName("ab.mp(IS)V")
    public static void method815(int arg0) {
        field580 = arg0;
    }

    @ObfuscatedName("q.me(S)V")
    public static void method287() {
        field636.method2540(class275.method3314(class273.field3037, field636.field1373));
        field580 = 0;
    }

    @ObfuscatedName("client.mt(I)V")
    public static void method1641() {
        if (field580 == 1) {
            field501 = true;
        }
    }

    @ObfuscatedName("dq.ml(I)V")
    public static void method2787() {
        if (!field501 || Statics.field3404 == null) {
            return;
        }
        int var0 = Statics.field3404.field1197[0];
        int var1 = Statics.field3404.field1209[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field169 = Statics.field3404.field1163;
        int var2 = method2836(Statics.field3404.field1163, Statics.field3404.field1138, Statics.field478) - field581;
        if (var2 < Statics.field1870) {
            Statics.field1870 = var2;
        }
        Statics.field1134 = Statics.field3404.field1138;
        field501 = false;
    }

    @ObfuscatedName("gz.mf(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3708(String arg0) {
        class325[] var1 = class325.method5649();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class325 var3 = var1[var2];
            if (var3.field4113 != -1 && arg0.startsWith(class97.method4850(var3.field4113))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4113).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("nh.mz(I)V")
    public static void method6611() {
        if (Statics.field4145 == null) {
            return;
        }
        field794 = field503;
        Statics.field4145.method5964();
        for (int var0 = 0; var0 < field621.length; var0++) {
            if (field621[var0] != null) {
                Statics.field4145.method5963((field621[var0].field1163 >> 7) + Statics.field142, (field621[var0].field1138 >> 7) + Statics.field1754);
            }
        }
    }

    @ObfuscatedName("client.mq(I)V")
    public static void method1643() {
        Statics.field4526.method2299(field495);
    }

    @ObfuscatedName("aq.ma(IB)V")
    public static void method708(int arg0) {
        if (field525 != arg0) {
            field525 = arg0;
        }
    }

    @ObfuscatedName("km.mk(I)Z")
    public static boolean method5112() {
        return field732 != null;
    }

    @ObfuscatedName("p.mm(ZB)V")
    public static void method159(boolean arg0) {
        field720 = arg0;
    }

    @ObfuscatedName("he.mu(II)Lqq;")
    public static class458 method4311(int arg0) {
        class458 var1 = (class458) field784.method4839((long) arg0);
        if (var1 == null) {
            var1 = new class458(Statics.field2931, class460.method7124(arg0), class460.method5730(arg0));
            field784.method4834(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("fs.mg(IB)Lqq;")
    public static class458 method3091(int arg0) {
        class458 var1 = (class458) field785.method4839((long) arg0);
        if (var1 == null) {
            var1 = new class458(Statics.field2931, arg0);
        }
        return var1;
    }

    @ObfuscatedName("ap.my(I)Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard method671() {
        return Statics.field1599.method505();
    }
}

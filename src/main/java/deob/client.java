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
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;

public final class client extends class32 implements class366, OAuthApi {

    @ObfuscatedName("client.w")
    public static class191[] field597;

    @ObfuscatedName("client.ac")
    public static boolean field551 = true;

    @ObfuscatedName("client.bq")
    public static int field476 = 1;

    @ObfuscatedName("client.bn")
    public static int field477 = 0;

    @ObfuscatedName("client.bv")
    public static int field662 = 0;

    @ObfuscatedName("client.bt")
    public static boolean field479 = false;

    @ObfuscatedName("client.bw")
    public static boolean field480 = false;

    @ObfuscatedName("client.br")
    public static int field481 = -1;

    @ObfuscatedName("client.bx")
    public static int field482 = -1;

    @ObfuscatedName("client.ba")
    public static int field483 = -1;

    @ObfuscatedName("client.bh")
    public static boolean field552 = false;

    @ObfuscatedName("client.cb")
    public static int field505 = 0;

    @ObfuscatedName("client.ck")
    public static boolean field486 = true;

    @ObfuscatedName("client.du")
    public static int field487 = 0;

    @ObfuscatedName("client.di")
    public static long field488 = -1L;

    @ObfuscatedName("client.dy")
    public static int field554 = -1;

    @ObfuscatedName("client.dv")
    public static int field689 = -1;

    @ObfuscatedName("client.dd")
    public static long field572 = -1L;

    @ObfuscatedName("client.dz")
    public static boolean field605 = true;

    @ObfuscatedName("client.do")
    public static int field493 = 0;

    @ObfuscatedName("client.ds")
    public static int field494 = 0;

    @ObfuscatedName("client.dr")
    public static int field556 = 0;

    @ObfuscatedName("client.dx")
    public static int field590 = 0;

    @ObfuscatedName("client.dp")
    public static int field497 = 0;

    @ObfuscatedName("client.dg")
    public static int field498 = 0;

    @ObfuscatedName("client.dj")
    public static int field499 = 0;

    @ObfuscatedName("client.dn")
    public static int field500 = 0;

    @ObfuscatedName("client.dt")
    public static int field501 = 0;

    @ObfuscatedName("client.dq")
    public static class95 field502 = class95.field1286;

    @ObfuscatedName("client.dk")
    public static class95 field503 = class95.field1286;

    @ObfuscatedName("client.dl")
    public static int field504 = 0;

    @ObfuscatedName("client.ev")
    public static int field693 = 0;

    @ObfuscatedName("client.ei")
    public static int field506 = 0;

    @ObfuscatedName("client.er")
    public static int field507 = 0;

    @ObfuscatedName("client.fu")
    public static int field574 = 0;

    @ObfuscatedName("client.fk")
    public static int field550 = 0;

    @ObfuscatedName("client.fd")
    public static int field669 = 0;

    @ObfuscatedName("client.ff")
    public static int field511 = 0;

    @ObfuscatedName("client.ft")
    public static class125 field512 = class125.field1522;

    @ObfuscatedName("client.fc")
    public static class448 field513 = class448.field4757;

    @ObfuscatedName("client.fv")
    public String field514;

    @ObfuscatedName("client.fi")
    public class15 field583;

    @ObfuscatedName("client.fe")
    public class20 field663;

    @ObfuscatedName("client.fn")
    public OtlTokenRequester field517;

    @ObfuscatedName("client.fo")
    public Future field518;

    @ObfuscatedName("client.fj")
    public boolean field489 = false;

    @ObfuscatedName("client.fl")
    public class20 field520;

    @ObfuscatedName("client.fh")
    public RefreshAccessTokenRequester field492;

    @ObfuscatedName("client.fs")
    public Future field731;

    @ObfuscatedName("client.fm")
    public static final String field523;

    @ObfuscatedName("client.gj")
    public static boolean field524;

    @ObfuscatedName("client.gh")
    public static class71 field525;

    @ObfuscatedName("client.gi")
    public class444 field527;

    @ObfuscatedName("client.gs")
    public class8 field528;

    @ObfuscatedName("client.gv")
    public long field654 = -1L;

    @ObfuscatedName("client.gp")
    public static byte[] field530;

    @ObfuscatedName("client.gg")
    public static class92[] field531;

    @ObfuscatedName("client.go")
    public static int field532;

    @ObfuscatedName("client.gd")
    public static int[] field533;

    @ObfuscatedName("client.ge")
    public static int field534;

    @ObfuscatedName("client.gy")
    public static int[] field535;

    @ObfuscatedName("client.gn")
    public static final class100 field536;

    @ObfuscatedName("client.hl")
    public static int field537;

    @ObfuscatedName("client.hf")
    public static boolean field677;

    @ObfuscatedName("client.hp")
    public static class356 field539;

    @ObfuscatedName("client.hr")
    public static HashMap field744;

    @ObfuscatedName("client.hs")
    public static int field671;

    @ObfuscatedName("client.ht")
    public static int field542;

    @ObfuscatedName("client.hq")
    public static int field645;

    @ObfuscatedName("client.hw")
    public static int field732;

    @ObfuscatedName("client.hz")
    public static int field540;

    @ObfuscatedName("client.if")
    public static boolean field547;

    @ObfuscatedName("client.ii")
    public static int[][][] field516;

    @ObfuscatedName("client.iw")
    public static final int[] field549;

    @ObfuscatedName("client.ik")
    public static int field600;

    @ObfuscatedName("client.it")
    public static String field643;

    @ObfuscatedName("client.is")
    public static int field668;

    @ObfuscatedName("client.id")
    public static int field625;

    @ObfuscatedName("client.ie")
    public static int field553;

    @ObfuscatedName("client.ij")
    public static int field538;

    @ObfuscatedName("client.io")
    public static boolean field555;

    @ObfuscatedName("client.jt")
    public static int field627;

    @ObfuscatedName("client.ji")
    public static int field557;

    @ObfuscatedName("client.jx")
    public static int field558;

    @ObfuscatedName("client.jj")
    public static int field559;

    @ObfuscatedName("client.jd")
    public static int field560;

    @ObfuscatedName("client.jo")
    public static int field699;

    @ObfuscatedName("client.jv")
    public static int field652;

    @ObfuscatedName("client.je")
    public static int field563;

    @ObfuscatedName("client.jw")
    public static int field599;

    @ObfuscatedName("client.jl")
    public static int field565;

    @ObfuscatedName("client.jf")
    public static int field566;

    @ObfuscatedName("client.jp")
    public static int field567;

    @ObfuscatedName("client.jr")
    public static int field568;

    @ObfuscatedName("client.jh")
    public static int field569;

    @ObfuscatedName("client.jm")
    public static int field622;

    @ObfuscatedName("client.kf")
    public static boolean field485;

    @ObfuscatedName("client.kl")
    public static int field633;

    @ObfuscatedName("client.ka")
    public static boolean field656;

    @ObfuscatedName("client.ku")
    public static int field659;

    @ObfuscatedName("client.km")
    public static int field575;

    @ObfuscatedName("client.kh")
    public static int field576;

    @ObfuscatedName("client.kk")
    public static int[] field608;

    @ObfuscatedName("client.ke")
    public static int[] field666;

    @ObfuscatedName("client.kn")
    public static int[] field579;

    @ObfuscatedName("client.kj")
    public static int[] field580;

    @ObfuscatedName("client.ki")
    public static int[] field581;

    @ObfuscatedName("client.kz")
    public static int[] field582;

    @ObfuscatedName("client.kw")
    public static int[] field522;

    @ObfuscatedName("client.kr")
    public static String[] field584;

    @ObfuscatedName("client.kv")
    public static int[][] field720;

    @ObfuscatedName("client.kx")
    public static int field586;

    @ObfuscatedName("client.kc")
    public static int field541;

    @ObfuscatedName("client.kt")
    public static int field588;

    @ObfuscatedName("client.kp")
    public static int field589;

    @ObfuscatedName("client.kb")
    public static int field521;

    @ObfuscatedName("client.ko")
    public static int field591;

    @ObfuscatedName("client.kq")
    public static int field592;

    @ObfuscatedName("client.kg")
    public static boolean field564;

    @ObfuscatedName("client.ky")
    public static int field594;

    @ObfuscatedName("client.ks")
    public static int field595;

    @ObfuscatedName("client.la")
    public static int field596;

    @ObfuscatedName("client.ls")
    public static int field610;

    @ObfuscatedName("client.lr")
    public static int field598;

    @ObfuscatedName("client.lg")
    public static int field743;

    @ObfuscatedName("client.ll")
    public static boolean field703;

    @ObfuscatedName("client.lf")
    public static int field601;

    @ObfuscatedName("client.lz")
    public static int field602;

    @ObfuscatedName("client.lc")
    public static boolean field603;

    @ObfuscatedName("client.lo")
    public static class85[] field604;

    @ObfuscatedName("client.le")
    public static int field763;

    @ObfuscatedName("client.lb")
    public static int field593;

    @ObfuscatedName("client.ld")
    public static long field607;

    @ObfuscatedName("client.lv")
    public static boolean field546;

    @ObfuscatedName("client.lw")
    public static int field609;

    @ObfuscatedName("client.lx")
    public static int field496;

    @ObfuscatedName("client.ly")
    public static int[] field585;

    @ObfuscatedName("client.ms")
    public static final int[] field612;

    @ObfuscatedName("client.mu")
    public static String[] field613;

    @ObfuscatedName("client.me")
    public static boolean[] field614;

    @ObfuscatedName("client.mr")
    public static int[] field615;

    @ObfuscatedName("client.mh")
    public static int field700;

    @ObfuscatedName("client.mw")
    public static class335[][][] field617;

    @ObfuscatedName("client.ma")
    public static class335 field618;

    @ObfuscatedName("client.mo")
    public static class335 field619;

    @ObfuscatedName("client.mb")
    public static class335 field620;

    @ObfuscatedName("client.mj")
    public static int[] field621;

    @ObfuscatedName("client.mg")
    public static int[] field738;

    @ObfuscatedName("client.mq")
    public static int[] field623;

    @ObfuscatedName("client.ml")
    public static boolean field624;

    @ObfuscatedName("client.my")
    public static boolean field664;

    @ObfuscatedName("client.md")
    public static int field626;

    @ObfuscatedName("client.mp")
    public static int[] field475;

    @ObfuscatedName("client.mc")
    public static int[] field628;

    @ObfuscatedName("client.mk")
    public static int[] field561;

    @ObfuscatedName("client.mv")
    public static int[] field630;

    @ObfuscatedName("client.mi")
    public static int[] field631;

    @ObfuscatedName("client.nd")
    public static String[] field632;

    @ObfuscatedName("client.ne")
    public static String[] field606;

    @ObfuscatedName("client.no")
    public static boolean[] field634;

    @ObfuscatedName("client.nn")
    public static boolean field544;

    @ObfuscatedName("client.ns")
    public static boolean field629;

    @ObfuscatedName("client.np")
    public static boolean field637;

    @ObfuscatedName("client.nb")
    public static boolean field638;

    @ObfuscatedName("client.nf")
    public static int field639;

    @ObfuscatedName("client.nr")
    public static int field640;

    @ObfuscatedName("client.nc")
    public static int field641;

    @ObfuscatedName("client.na")
    public static int field687;

    @ObfuscatedName("client.nj")
    public static int field484;

    @ObfuscatedName("client.nk")
    public static boolean field635;

    @ObfuscatedName("client.nz")
    public static int field646;

    @ObfuscatedName("client.nh")
    public static int field647;

    @ObfuscatedName("client.nw")
    public static String field648;

    @ObfuscatedName("client.ni")
    public static String field490;

    @ObfuscatedName("client.ny")
    public static int field650;

    @ObfuscatedName("client.nq")
    public static class421 field651;

    @ObfuscatedName("client.ot")
    public static int field742;

    @ObfuscatedName("client.od")
    public static int field653;

    @ObfuscatedName("client.ob")
    public static int field573;

    @ObfuscatedName("client.or")
    public static int field636;

    @ObfuscatedName("client.ol")
    public static class295 field611;

    @ObfuscatedName("client.oy")
    public static int field657;

    @ObfuscatedName("client.oz")
    public static int field658;

    @ObfuscatedName("client.oj")
    public static int field757;

    @ObfuscatedName("client.oi")
    public static int field660;

    @ObfuscatedName("client.ov")
    public static boolean field661;

    @ObfuscatedName("client.of")
    public static class295 field571;

    @ObfuscatedName("client.oa")
    public static class295 field587;

    @ObfuscatedName("client.ow")
    public static class295 field515;

    @ObfuscatedName("client.oe")
    public static int field665;

    @ObfuscatedName("client.oq")
    public static int field642;

    @ObfuscatedName("client.ox")
    public static class295 field667;

    @ObfuscatedName("client.on")
    public static boolean field570;

    @ObfuscatedName("client.og")
    public static int field761;

    @ObfuscatedName("client.oo")
    public static int field670;

    @ObfuscatedName("client.ok")
    public static boolean field495;

    @ObfuscatedName("client.ou")
    public static int field672;

    @ObfuscatedName("client.os")
    public static int field673;

    @ObfuscatedName("client.pj")
    public static boolean field674;

    @ObfuscatedName("client.pd")
    public static int field675;

    @ObfuscatedName("client.pt")
    public static int[] field676;

    @ObfuscatedName("client.pn")
    public static int field649;

    @ObfuscatedName("client.pf")
    public static int[] field491;

    @ObfuscatedName("client.pe")
    public static int field679;

    @ObfuscatedName("client.pp")
    public static int[] field680;

    @ObfuscatedName("client.po")
    public static int field681;

    @ObfuscatedName("client.pq")
    public static int[] field682;

    @ObfuscatedName("client.pc")
    public static int field683;

    @ObfuscatedName("client.py")
    public static int field684;

    @ObfuscatedName("client.pk")
    public static int field711;

    @ObfuscatedName("client.pv")
    public static int field686;

    @ObfuscatedName("client.pw")
    public static int field478;

    @ObfuscatedName("client.pu")
    public static int field688;

    @ObfuscatedName("client.pz")
    public static int field685;

    @ObfuscatedName("client.pr")
    public static int field690;

    @ObfuscatedName("client.px")
    public static int field691;

    @ObfuscatedName("client.qx")
    public static int field771;

    @ObfuscatedName("client.qa")
    public static class335 field751;

    @ObfuscatedName("client.qk")
    public static class335 field694;

    @ObfuscatedName("client.qf")
    public static class335 field529;

    @ObfuscatedName("client.qc")
    public static class421 field696;

    @ObfuscatedName("client.qp")
    public static int field697;

    @ObfuscatedName("client.qm")
    public static int field698;

    @ObfuscatedName("client.qs")
    public static boolean[] field644;

    @ObfuscatedName("client.ql")
    public static boolean[] field754;

    @ObfuscatedName("client.qe")
    public static boolean[] field701;

    @ObfuscatedName("client.qn")
    public static int[] field702;

    @ObfuscatedName("client.qt")
    public static int[] field509;

    @ObfuscatedName("client.qv")
    public static int[] field704;

    @ObfuscatedName("client.qb")
    public static int[] field747;

    @ObfuscatedName("client.qi")
    public static int field706;

    @ObfuscatedName("client.qh")
    public static long field707;

    @ObfuscatedName("client.qo")
    public static boolean field545;

    @ObfuscatedName("client.rj")
    public static int[] field769;

    @ObfuscatedName("client.rv")
    public static int field710;

    @ObfuscatedName("client.ra")
    public static int field708;

    @ObfuscatedName("client.rh")
    public static String field712;

    @ObfuscatedName("client.rk")
    public static long[] field713;

    @ObfuscatedName("client.rn")
    public static int field714;

    @ObfuscatedName("client.ru")
    public static int field715;

    @ObfuscatedName("client.rw")
    public static int[] field578;

    @ObfuscatedName("client.rz")
    public static int[] field717;

    @ObfuscatedName("client.ri")
    public static long field718;

    @ObfuscatedName("client.rx")
    public static class140[] field719;

    @ObfuscatedName("client.rt")
    public static class149[] field678;

    @ObfuscatedName("client.ry")
    public static int field721;

    @ObfuscatedName("client.ro")
    public static int field722;

    @ObfuscatedName("client.rb")
    public static int[] field723;

    @ObfuscatedName("client.rc")
    public static int[] field724;

    @ObfuscatedName("client.rp")
    public static class457[] field655;

    @ObfuscatedName("client.sn")
    public static int field726;

    @ObfuscatedName("client.si")
    public static int field727;

    @ObfuscatedName("client.sk")
    public static int field728;

    @ObfuscatedName("client.sl")
    public static int field729;

    @ObfuscatedName("client.sf")
    public static boolean field730;

    @ObfuscatedName("client.ss")
    public static int field709;

    @ObfuscatedName("client.sv")
    public static int[] field508;

    @ObfuscatedName("client.su")
    public static int[] field733;

    @ObfuscatedName("client.se")
    public static int[] field734;

    @ObfuscatedName("client.sx")
    public static int[] field735;

    @ObfuscatedName("client.sy")
    public static class37[] field736;

    @ObfuscatedName("client.sd")
    public static boolean field737;

    @ObfuscatedName("client.tx")
    public static boolean field519;

    @ObfuscatedName("client.tj")
    public static boolean[] field739;

    @ObfuscatedName("client.tm")
    public static int[] field740;

    @ObfuscatedName("client.tr")
    public static int[] field741;

    @ObfuscatedName("client.tg")
    public static int[] field759;

    @ObfuscatedName("client.ts")
    public static int[] field616;

    @ObfuscatedName("client.te")
    public static short field562;

    @ObfuscatedName("client.tz")
    public static short field745;

    @ObfuscatedName("client.tw")
    public static short field746;

    @ObfuscatedName("client.th")
    public static short field770;

    @ObfuscatedName("client.tu")
    public static short field748;

    @ObfuscatedName("client.uq")
    public static short field749;

    @ObfuscatedName("client.ue")
    public static short field750;

    @ObfuscatedName("client.uz")
    public static short field725;

    @ObfuscatedName("client.us")
    public static int field752;

    @ObfuscatedName("client.uf")
    public static int field753;

    @ObfuscatedName("client.uy")
    public static int field705;

    @ObfuscatedName("client.uh")
    public static int field755;

    @ObfuscatedName("client.ut")
    public static int field756;

    @ObfuscatedName("client.ug")
    public static class293 field695;

    @ObfuscatedName("client.ub")
    public static int field758;

    @ObfuscatedName("client.uu")
    public static int field716;

    @ObfuscatedName("client.uw")
    public static class414 field760;

    @ObfuscatedName("client.uv")
    public static class325[] field577;

    @ObfuscatedName("client.ux")
    public static class60 field762;

    @ObfuscatedName("client.ur")
    public static class256 field543;

    @ObfuscatedName("client.ui")
    public static class256 field764;

    @ObfuscatedName("client.uo")
    public static int field765;

    @ObfuscatedName("client.vk")
    public static int field766;

    @ObfuscatedName("client.vt")
    public static ArrayList field767;

    @ObfuscatedName("client.vy")
    public static int field768;

    @ObfuscatedName("client.vu")
    public static int field510;

    @ObfuscatedName("client.vw")
    public static final class59 field692;

    @ObfuscatedName("client.ve")
    public static int[] field548;

    @ObfuscatedName("client.vb")
    public static int[] field772;

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
        String var5 = class343.method5379(var1, 0, var1.length);
        field523 = var5;
        field524 = false;
        field525 = new class71();
        field530 = null;
        field531 = new class92[32768];
        field532 = 0;
        field533 = new int[32768];
        field534 = 0;
        field535 = new int[250];
        field536 = new class100();
        field537 = 0;
        field677 = false;
        field539 = new class356();
        field744 = new HashMap();
        field671 = 0;
        field542 = 1;
        field645 = 0;
        field732 = 1;
        field540 = 0;
        field597 = new class191[4];
        field547 = false;
        field516 = new int[4][13][13];
        field549 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field600 = 0;
        field668 = 2301979;
        field625 = 5063219;
        field553 = 3353893;
        field538 = 7759444;
        field555 = false;
        field627 = 0;
        field557 = 128;
        field558 = 0;
        field559 = 0;
        field560 = 0;
        field699 = 0;
        field652 = 0;
        field563 = 0;
        field599 = 50;
        field565 = 0;
        field566 = 0;
        field567 = 0;
        field568 = 12;
        field569 = 6;
        field622 = 0;
        field485 = false;
        field633 = 0;
        field656 = false;
        field659 = 0;
        field575 = 0;
        field576 = 50;
        field608 = new int[field576];
        field666 = new int[field576];
        field579 = new int[field576];
        field580 = new int[field576];
        field581 = new int[field576];
        field582 = new int[field576];
        field522 = new int[field576];
        field584 = new String[field576];
        field720 = new int[104][104];
        field586 = 0;
        field541 = -1;
        field588 = -1;
        field589 = 0;
        field521 = 0;
        field591 = 0;
        field592 = 0;
        field564 = true;
        field594 = 0;
        field595 = 0;
        field596 = 0;
        field610 = 0;
        field598 = 0;
        field743 = 0;
        field703 = false;
        field601 = 0;
        field602 = 0;
        field603 = true;
        field604 = new class85[2048];
        field763 = -1;
        field593 = 0;
        field607 = -1L;
        field546 = true;
        field609 = 0;
        field496 = 0;
        field585 = new int[1000];
        field612 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field613 = new String[8];
        field614 = new boolean[8];
        field615 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field700 = -1;
        field617 = new class335[4][104][104];
        field618 = new class335();
        field619 = new class335();
        field620 = new class335();
        field621 = new int[25];
        field738 = new int[25];
        field623 = new int[25];
        field624 = false;
        field664 = false;
        field626 = 0;
        field475 = new int[500];
        field628 = new int[500];
        field561 = new int[500];
        field630 = new int[500];
        field631 = new int[500];
        field632 = new String[500];
        field606 = new String[500];
        field634 = new boolean[500];
        field544 = false;
        field629 = false;
        field637 = false;
        field638 = true;
        field639 = -1;
        field640 = -1;
        field641 = 0;
        field687 = 50;
        field484 = 0;
        field643 = null;
        field635 = false;
        field646 = -1;
        field647 = -1;
        field648 = null;
        field490 = null;
        field650 = -1;
        field651 = new class421(8);
        field742 = 0;
        field653 = -1;
        field573 = 0;
        field636 = 0;
        field611 = null;
        field657 = 0;
        field658 = 0;
        field757 = 0;
        field660 = -1;
        field661 = false;
        field571 = null;
        field587 = null;
        field515 = null;
        field665 = 0;
        field642 = 0;
        field667 = null;
        field570 = false;
        field761 = -1;
        field670 = -1;
        field495 = false;
        field672 = -1;
        field673 = -1;
        field674 = false;
        field675 = 1;
        field676 = new int[32];
        field649 = 0;
        field491 = new int[32];
        field679 = 0;
        field680 = new int[32];
        field681 = 0;
        field682 = new int[32];
        field683 = 0;
        field684 = 0;
        field711 = 0;
        field686 = 0;
        field478 = 0;
        field688 = 0;
        field685 = 0;
        field690 = 0;
        field691 = 0;
        field771 = 0;
        field751 = new class335();
        field694 = new class335();
        field529 = new class335();
        field696 = new class421(512);
        field697 = 0;
        field698 = -2;
        field644 = new boolean[100];
        field754 = new boolean[100];
        field701 = new boolean[100];
        field702 = new int[100];
        field509 = new int[100];
        field704 = new int[100];
        field747 = new int[100];
        field706 = 0;
        field707 = 0L;
        field545 = true;
        field769 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field710 = 0;
        field708 = 0;
        field712 = "";
        field713 = new long[100];
        field714 = 0;
        field715 = 0;
        field578 = new int[128];
        field717 = new int[128];
        field718 = -1L;
        field719 = new class140[4];
        field678 = new class149[4];
        field721 = -1;
        field722 = 0;
        field723 = new int[1000];
        field724 = new int[1000];
        field655 = new class457[1000];
        field726 = 0;
        field727 = 0;
        field728 = 0;
        field729 = -1;
        field730 = false;
        field709 = 0;
        field508 = new int[50];
        field733 = new int[50];
        field734 = new int[50];
        field735 = new int[50];
        field736 = new class37[50];
        field737 = false;
        field519 = false;
        field739 = new boolean[5];
        field740 = new int[5];
        field741 = new int[5];
        field759 = new int[5];
        field616 = new int[5];
        field562 = 256;
        field745 = 205;
        field746 = 256;
        field770 = 320;
        field748 = 1;
        field749 = 32767;
        field750 = 1;
        field725 = 32767;
        field752 = 0;
        field753 = 0;
        field705 = 0;
        field755 = 0;
        field756 = 0;
        field695 = new class293();
        field758 = -1;
        field716 = -1;
        field760 = new class412();
        field577 = new class325[8];
        field762 = new class60();
        field543 = new class256(64);
        field764 = new class256(64);
        field765 = -1;
        field766 = -1;
        field767 = new ArrayList(10);
        field768 = 0;
        field510 = 0;
        field692 = new class59();
        field548 = new int[50];
        field772 = new int[50];
    }

    @ObfuscatedName("bx.dk(B)Los;")
    public static class416 method1760() {
        return Statics.field3026;
    }

    @ObfuscatedName("client.as(I)V")
    public final void method442() {
    }

    public final void init() {
        if (!this.method521()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class93.field1274)) {
                            field479 = true;
                        } else {
                            field479 = false;
                        }
                        break;
                    case 4:
                        if (field482 == -1) {
                            field482 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field477 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var3 = Integer.parseInt(var2);
                        class331 var4;
                        if (var3 >= 0 && var3 < class331.field4104.length) {
                            var4 = class331.field4104[var3];
                        } else {
                            var4 = null;
                        }
                        Statics.field1773 = var4;
                        break;
                    case 7:
                        Statics.field835 = class304.method4631(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class93.field1274)) {
                        }
                        break;
                    case 9:
                        Statics.field2013 = var2;
                        break;
                    case 10:
                        Statics.field112 = (class305) class330.method525(class305.method4615(), Integer.parseInt(var2));
                        if (Statics.field112 == class305.field3595) {
                            Statics.field2008 = class424.field4609;
                        } else {
                            Statics.field2008 = class424.field4616;
                        }
                        break;
                    case 11:
                        Statics.field1372 = var2;
                        break;
                    case 12:
                        field476 = Integer.parseInt(var2);
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
                        Statics.field4766 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field662 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field3292 = var2;
                        break;
                    case 21:
                        field481 = Integer.parseInt(var2);
                        break;
                    case 25:
                        int var5 = var2.indexOf(".");
                        if (var5 == -1) {
                            Integer.parseInt(var2);
                        } else {
                            Integer.parseInt(var2.substring(0, var5));
                            Integer.parseInt(var2.substring(var5 + 1));
                        }
                }
            }
        }
        class204.field2392 = false;
        field480 = false;
        Statics.field67 = this.getCodeBase().getHost();
        String var6 = Statics.field835.field3585;
        byte var7 = 0;
        try {
            class158.method1962("oldschool", var6, var7, 22);
        } catch (Exception var9) {
            class468.method566((String) null, var9);
        }
        Statics.field3295 = this;
        Statics.field4847 = field482;
        if (field483 == -1) {
            field483 = 0;
        }
        Statics.field157 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field4151 = System.getenv("JX_REFRESH_TOKEN");
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field489 = true;
        }
        this.method502(765, 503, 207, 1);
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field517 = arg0;
            class69.method2545(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field492 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field505 == 10;
    }

    public long getAccountHash() {
        return this.field654;
    }

    @ObfuscatedName("client.df(S)Z")
    public boolean method1010() {
        return Statics.field157 != null && !Statics.field157.trim().isEmpty();
    }

    @ObfuscatedName("client.de(I)Z")
    public boolean method1011() {
        return this.field517 != null;
    }

    @ObfuscatedName("client.da(Ljava/lang/String;I)V")
    public void method1273(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field1372 + "shield/oauth/token" + (new class402(var2)).method6390());
        HashMap var4 = new HashMap();
        var4.put("Authorization", "Basic " + field523);
        var4.put("Host", (new URL(Statics.field1372)).getHost());
        var4.put("Accept", class399.field4439.method6378());
        class10 var5 = class10.field47;
        RefreshAccessTokenRequester var6 = this.field492;
        if (var6 != null) {
            this.field731 = var6.request(var5.method71(), var3, var4, "");
            return;
        }
        class11 var7 = new class11(var3, var5, this.field489);
        Iterator var8 = var4.entrySet().iterator();
        while (var8.hasNext()) {
            Entry var9 = (Entry) var8.next();
            var7.method77((String) var9.getKey(), (String) var9.getValue());
        }
        this.field520 = this.field583.method163(var7);
    }

    @ObfuscatedName("client.dl(Ljava/lang/String;I)V")
    public void method1013(String arg0) throws MalformedURLException, IOException {
        URL var2 = new URL(Statics.field1372 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        HashMap var3 = new HashMap();
        var3.put("Authorization", "Bearer " + arg0);
        class10 var4 = class10.field37;
        OtlTokenRequester var5 = this.field517;
        if (var5 != null) {
            this.field518 = var5.request(var4.method71(), var2, var3, "");
            return;
        }
        class11 var6 = new class11(var2, var4, this.field489);
        Iterator var7 = var3.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            var6.method77((String) var8.getKey(), (String) var8.getValue());
        }
        this.field663 = this.field583.method163(var6);
    }

    @ObfuscatedName("client.j(I)V")
    public final void method429() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field1363 = null;
            Statics.field4218 = null;
            Statics.field3296 = (byte[][][]) null;
            class354.method5394();
        } else {
            Statics.field1363 = var1;
            Statics.field4218 = new int[var1.length];
            Statics.field3296 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field1363.length; var3++) {
                Statics.field3296[var3] = new byte[var2[var3]][];
                class354.field4219.add(var1[var3]);
            }
            Collections.sort(class354.field4219);
        }
        Statics.field2281 = field662 == 0 ? 43594 : field476 + 40000;
        Statics.field1738 = field662 == 0 ? 443 : field476 + 50000;
        Statics.field2685 = Statics.field2281;
        Statics.field3334 = class294.field3339;
        Statics.field2276 = class294.field3340;
        Statics.field2675 = class294.field3343;
        Statics.field3332 = class294.field3342;
        Statics.field1771 = new class102(this.field489, 207);
        this.method413();
        this.method518();
        Statics.field1470 = this.method407();
        Statics.field62 = new class382(255, class158.field1728, class158.field1734, 500000);
        class426 var4 = null;
        class90 var5 = new class90();
        try {
            var4 = class158.method6804("", Statics.field112.field3590, false);
            byte[] var6 = new byte[(int) var4.method6713()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method6719(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class90(new class444(var6));
        } catch (Exception var15) {
        }
        try {
            if (var4 != null) {
                var4.method6716();
            }
        } catch (Exception var14) {
        }
        Statics.field4303 = var5;
        this.method434();
        String var13 = Statics.field2694;
        class30.field175 = this;
        if (var13 != null) {
            class30.field168 = var13;
        }
        method2737(Statics.field4303.method2113());
        Statics.field4063 = new class62(Statics.field2008);
        this.field583 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.g(I)V")
    public final void method430() {
        field487++;
        this.method1017();
        while (true) {
            class335 var1 = class313.field3975;
            class312 var2;
            synchronized (class313.field3975) {
                var2 = (class312) class313.field3972.method5457();
            }
            if (var2 == null) {
                class274.method4562();
                Statics.method1976();
                class24.method6766();
                class33 var4 = class33.field221;
                synchronized (class33.field221) {
                    class33.field212 = class33.field215;
                    class33.field220 = class33.field213;
                    class33.field228 = class33.field216;
                    class33.field222 = class33.field218;
                    class33.field227 = class33.field223;
                    class33.field219 = class33.field226;
                    class33.field230 = class33.field225;
                    class33.field217 = class33.field229;
                    class33.field223 = 0;
                }
                if (Statics.field1470 != null) {
                    int var6 = Statics.field1470.method295();
                    field771 = var6;
                }
                if (field505 == 0) {
                    method2910();
                    class32.method1969();
                } else if (field505 == 5) {
                    class69.method3045(this, Statics.field250);
                    method2910();
                    class32.method1969();
                } else if (field505 == 10 || field505 == 11) {
                    class69.method3045(this, Statics.field250);
                } else if (field505 == 20) {
                    class69.method3045(this, Statics.field250);
                    this.method1020();
                } else if (field505 == 50) {
                    class69.method3045(this, Statics.field250);
                    this.method1020();
                } else if (field505 == 25) {
                    method2785();
                }
                if (field505 == 30) {
                    this.method1377();
                } else if (field505 == 40 || field505 == 45) {
                    this.method1020();
                }
                return;
            }
            var2.field3967.method5157(var2.field3970, (int) var2.field4468, var2.field3968, false);
        }
    }

    @ObfuscatedName("client.ar(ZI)V")
    public final void method431(boolean arg0) {
        boolean var2;
        label143: {
            try {
                if (class274.field3199 == 2) {
                    if (Statics.field4839 == null) {
                        Statics.field4839 = class279.method4849(Statics.field3995, Statics.field1348, Statics.field2613);
                        if (Statics.field4839 == null) {
                            var2 = false;
                            break label143;
                        }
                    }
                    if (Statics.field956 == null) {
                        Statics.field956 = new class43(Statics.field3204, Statics.field3200);
                    }
                    if (Statics.field1003.method4678(Statics.field4839, Statics.field3202, Statics.field956, 22050)) {
                        Statics.field1003.method4781();
                        Statics.field1003.method4691(Statics.field167);
                        Statics.field1003.method4681(Statics.field4839, Statics.field3203);
                        class274.field3199 = 0;
                        Statics.field4839 = null;
                        Statics.field956 = null;
                        Statics.field3995 = null;
                        var2 = true;
                        break label143;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field1003.method4761();
                class274.field3199 = 0;
                Statics.field4839 = null;
                Statics.field956 = null;
                Statics.field3995 = null;
            }
            var2 = false;
        }
        if (var2 && field730 && Statics.field1019 != null) {
            Statics.field1019.method664();
        }
        if ((field505 == 10 || field505 == 20 || field505 == 30) && field707 != 0L && class270.method3146() > field707) {
            method2737(method356());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field644[var5] = true;
            }
        }
        if (field505 == 0) {
            this.method433(class69.field904, class69.field881, arg0);
        } else if (field505 == 5) {
            class69.method4930(Statics.field2706, Statics.field3608, Statics.field250);
        } else if (field505 == 10 || field505 == 11) {
            class69.method4930(Statics.field2706, Statics.field3608, Statics.field250);
        } else if (field505 == 20) {
            class69.method4930(Statics.field2706, Statics.field3608, Statics.field250);
        } else if (field505 == 50) {
            class69.method4930(Statics.field2706, Statics.field3608, Statics.field250);
        } else if (field505 == 25) {
            if (field540 == 1) {
                if (field671 > field542) {
                    field542 = field671;
                }
                int var6 = (field542 * 50 - field671 * 50) / field542;
                method283(class309.field3627 + class93.field1272 + class93.field1269 + var6 + "%" + class93.field1270, false);
            } else if (field540 == 2) {
                if (field645 > field732) {
                    field732 = field645;
                }
                int var7 = (field732 * 50 - field645 * 50) / field732 + 50;
                method283(class309.field3627 + class93.field1272 + class93.field1269 + var7 + "%" + class93.field1270, false);
            } else {
                method283(class309.field3627, false);
            }
        } else if (field505 == 30) {
            this.method1327();
        } else if (field505 == 40) {
            method283(class309.field3908 + class93.field1272 + class309.field3629, false);
        } else if (field505 == 45) {
            method283(class309.field3787, false);
        }
        if (field505 == 30 && field706 == 0 && !arg0 && !field545) {
            for (int var8 = 0; var8 < field697; var8++) {
                if (field754[var8]) {
                    Statics.field1490.method391(field702[var8], field509[var8], field704[var8], field747[var8]);
                    field754[var8] = false;
                }
            }
        } else if (field505 > 0) {
            Statics.field1490.method390(0, 0);
            for (int var9 = 0; var9 < field697; var9++) {
                field754[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.aq(I)V")
    public final void method432() {
        if (Statics.field4144.method2274()) {
            Statics.field4144.method2267();
        }
        if (Statics.field4048 != null) {
            Statics.field4048.field1059 = false;
        }
        Statics.field4048 = null;
        field536.method2326();
        if (class24.field141 != null) {
            class24 var1 = class24.field141;
            synchronized (class24.field141) {
                class24.field141 = null;
            }
        }
        class33.method3478();
        Statics.field1470 = null;
        if (Statics.field1019 != null) {
            Statics.field1019.method669();
        }
        if (Statics.field1056 != null) {
            Statics.field1056.method669();
        }
        class317.method8();
        Object var3 = class313.field3974;
        synchronized (class313.field3974) {
            if (class313.field3971 != 0) {
                class313.field3971 = 1;
                try {
                    class313.field3974.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field1771 != null) {
            Statics.field1771.method2355();
            Statics.field1771 = null;
        }
        try {
            class158.field1728.method6754();
            for (int var6 = 0; var6 < Statics.field4689; var6++) {
                Statics.field1428[var6].method6754();
            }
            class158.field1734.method6754();
            class158.field1732.method6754();
        } catch (Exception var10) {
        }
        this.field583.method164();
    }

    @ObfuscatedName("c.dh(II)V")
    public static void method20(int arg0) {
        if (field505 == arg0) {
            return;
        }
        if (field505 == 0) {
            Statics.field3295.method476();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method993(0);
            field550 = 0;
            field669 = 0;
            field539.method5857(arg0);
            if (arg0 != 20) {
                method3051(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3046 != null) {
            Statics.field3046.method6121();
            Statics.field3046 = null;
        }
        if (field505 == 25) {
            field540 = 0;
            field671 = 0;
            field542 = 1;
            field645 = 0;
            field732 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var1 = Statics.field4303.method2111() >= field481;
            int var2 = var1 ? 0 : 12;
            class69.method5994(Statics.field1857, Statics.field3562, true, var2);
        } else if (arg0 == 20) {
            int var3 = field505 == 11 ? 4 : 0;
            class69.method5994(Statics.field1857, Statics.field3562, false, var3);
        } else if (arg0 == 11) {
            class69.method5994(Statics.field1857, Statics.field3562, false, 4);
        } else if (arg0 == 50) {
            class69.method3352("", "Updating date of birth...", "");
            class69.method5994(Statics.field1857, Statics.field3562, false, 7);
        } else if (Statics.field877) {
            Statics.field103 = null;
            Statics.field872 = null;
            Statics.field871 = null;
            Statics.field49 = null;
            Statics.field894 = null;
            Statics.field3257 = null;
            Statics.field1761 = null;
            Statics.field169 = null;
            Statics.field1953 = null;
            Statics.field4404 = null;
            Statics.field4037 = null;
            Statics.field300 = null;
            Statics.field1993 = null;
            Statics.field4065 = null;
            Statics.field2910.method2055();
            class274.field3199 = 1;
            Statics.field3995 = null;
            Statics.field1348 = -1;
            Statics.field2613 = -1;
            Statics.field167 = 0;
            Statics.field3203 = false;
            Statics.field1748 = 2;
            if (Statics.field4034 != null) {
                try {
                    class444 var4 = new class444(4);
                    var4.method6912(2);
                    var4.method6914(0);
                    Statics.field4034.method6112(var4.field4707, 0, 4);
                } catch (IOException var8) {
                    try {
                        Statics.field4034.method6121();
                    } catch (Exception var7) {
                    }
                    class317.field4036++;
                    Statics.field4034 = null;
                }
            }
            Statics.field877 = false;
        }
        field505 = arg0;
    }

    @ObfuscatedName("client.dc(I)V")
    public void method1017() {
        if (field505 != 1000) {
            boolean var1 = class317.method960();
            if (!var1) {
                this.method1018();
            }
        }
    }

    @ObfuscatedName("client.ev(B)V")
    public void method1018() {
        if (class317.field4035 >= 4) {
            this.method516("js5crc");
            method20(1000);
            return;
        }
        if (class317.field4036 >= 4) {
            if (field505 <= 5) {
                this.method516("js5io");
                method20(1000);
                return;
            }
            field506 = 3000;
            class317.field4036 = 3;
        }
        if (--field506 + 1 > 0) {
            return;
        }
        try {
            if (field693 == 0) {
                Statics.field1823 = Statics.field188.method2876(Statics.field67, Statics.field2685);
                field693++;
            }
            if (field693 == 1) {
                if (Statics.field1823.field1779 == 2) {
                    this.method1019(-1);
                    return;
                }
                if (Statics.field1823.field1779 == 1) {
                    field693++;
                }
            }
            if (field693 == 2) {
                Statics.field1249 = class378.method2436((Socket) Statics.field1823.field1778, 40000, 5000);
                class444 var1 = new class444(5);
                var1.method6912(15);
                var1.method6915(207);
                Statics.field1249.method6112(var1.field4707, 0, 5);
                field693++;
                Statics.field2766 = class270.method3146();
            }
            if (field693 == 3) {
                if (Statics.field1249.method6109() > 0) {
                    int var2 = Statics.field1249.method6110();
                    if (var2 != 0) {
                        this.method1019(var2);
                        return;
                    }
                    field693++;
                } else if (class270.method3146() - Statics.field2766 > 30000L) {
                    this.method1019(-2);
                    return;
                }
            }
            if (field693 == 4) {
                class378 var3 = Statics.field1249;
                boolean var4 = field505 > 20;
                if (Statics.field4034 != null) {
                    try {
                        Statics.field4034.method6121();
                    } catch (Exception var19) {
                    }
                    Statics.field4034 = null;
                }
                Statics.field4034 = var3;
                if (Statics.field4034 != null) {
                    try {
                        class444 var6 = new class444(4);
                        var6.method6912(var4 ? 2 : 3);
                        var6.method6914(0);
                        Statics.field4034.method6112(var6.field4707, 0, 4);
                    } catch (IOException var18) {
                        try {
                            Statics.field4034.method6121();
                        } catch (Exception var17) {
                        }
                        class317.field4036++;
                        Statics.field4034 = null;
                    }
                }
                class317.field4028.field4708 = 0;
                Statics.field863 = null;
                Statics.field1235 = null;
                class317.field4029 = 0;
                while (true) {
                    class315 var9 = (class315) class317.field4021.method6694();
                    if (var9 == null) {
                        while (true) {
                            class315 var10 = (class315) class317.field4026.method6694();
                            if (var10 == null) {
                                if (class317.field4030 != 0) {
                                    try {
                                        class444 var11 = new class444(4);
                                        var11.method6912(4);
                                        var11.method6912(class317.field4030);
                                        var11.method6913(0);
                                        Statics.field4034.method6112(var11.field4707, 0, 4);
                                    } catch (IOException var16) {
                                        try {
                                            Statics.field4034.method6121();
                                        } catch (Exception var15) {
                                        }
                                        class317.field4036++;
                                        Statics.field4034 = null;
                                    }
                                }
                                class317.field4017 = 0;
                                Statics.field4018 = class270.method3146();
                                Statics.field1823 = null;
                                Statics.field1249 = null;
                                field693 = 0;
                                field507 = 0;
                                return;
                            }
                            class317.field4023.method5416(var10);
                            class317.field4024.method6683(var10, var10.field4468);
                            class317.field4033++;
                            class317.field4038--;
                        }
                    }
                    class317.field4019.method6683(var9, var9.field4468);
                    class317.field4025++;
                    class317.field4022--;
                }
            }
        } catch (IOException var20) {
            this.method1019(-3);
        }
    }

    @ObfuscatedName("client.ei(IB)V")
    public void method1019(int arg0) {
        Statics.field1823 = null;
        Statics.field1249 = null;
        field693 = 0;
        if (Statics.field2685 == Statics.field2281) {
            Statics.field2685 = Statics.field1738;
        } else {
            Statics.field2685 = Statics.field2281;
        }
        field507++;
        if (field507 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field505 <= 5) {
                this.method516("js5connect_full");
                method20(1000);
            } else {
                field506 = 3000;
            }
        } else if (field507 >= 2 && arg0 == 6) {
            this.method516("js5connect_outofdate");
            method20(1000);
        } else if (field507 >= 4) {
            if (field505 <= 5) {
                this.method516("js5connect");
                method20(1000);
            } else {
                field506 = 3000;
            }
        }
    }

    @ObfuscatedName("bt.ek(Lln;Ljava/lang/String;B)V")
    public static void method994(class314 arg0, String arg1) {
        class77 var2 = new class77(arg0, arg1);
        field767.add(var2);
        field510 += var2.field995;
    }

    @ObfuscatedName("eq.el(I)I")
    public static int method2744() {
        if (field767 == null || field768 >= field767.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field768; var1++) {
            var0 += ((class77) field767.get(var1)).field993;
        }
        return var0 * 10000 / field510;
    }

    @ObfuscatedName("cc.ej(II)I")
    public static int method2052(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("ff.eb(I)V")
    public static void method2910() {
        if (field504 == 0) {
            Statics.field69 = new class204(4, 104, 104, class75.field985);
            for (int var0 = 0; var0 < 4; var0++) {
                field597[var0] = new class191(104, 104);
            }
            Statics.field5 = new class457(512, 512);
            class69.field881 = class309.field3630;
            class69.field904 = 5;
            field504 = 20;
        } else if (field504 == 20) {
            class69.field881 = class309.field3788;
            class69.field904 = 10;
            field504 = 30;
        } else if (field504 == 30) {
            Statics.field1546 = method2407(0, false, true, true, false);
            Statics.field404 = method2407(1, false, true, true, false);
            Statics.field2448 = method2407(2, true, false, true, false);
            Statics.field3613 = method2407(3, false, true, true, false);
            Statics.field3183 = method2407(4, false, true, true, false);
            Statics.field1493 = method2407(5, true, true, true, false);
            Statics.field4701 = method2407(6, true, true, true, false);
            Statics.field1980 = method2407(7, false, true, true, false);
            Statics.field3562 = method2407(8, false, true, true, false);
            Statics.field2367 = method2407(9, false, true, true, false);
            Statics.field1857 = method2407(10, false, true, true, false);
            Statics.field90 = method2407(11, false, true, true, false);
            Statics.field2168 = method2407(12, false, true, true, false);
            Statics.field1048 = method2407(13, true, false, true, false);
            Statics.field1320 = method2407(14, false, true, true, false);
            Statics.field3177 = method2407(15, false, true, true, false);
            Statics.field231 = method2407(17, true, true, true, false);
            Statics.field4142 = method2407(18, false, true, true, false);
            Statics.field2334 = method2407(19, false, true, true, false);
            Statics.field4296 = method2407(20, false, true, true, false);
            Statics.field4233 = method2407(21, false, true, true, true);
            class69.field881 = class309.field3632;
            class69.field904 = 20;
            field504 = 40;
        } else if (field504 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1546.method5164() * 4 / 100;
            int var3 = var2 + Statics.field404.method5164() * 4 / 100;
            int var4 = var3 + Statics.field2448.method5164() * 2 / 100;
            int var5 = var4 + Statics.field3613.method5164() * 2 / 100;
            int var6 = var5 + Statics.field3183.method5164() * 6 / 100;
            int var7 = var6 + Statics.field1493.method5164() * 4 / 100;
            int var8 = var7 + Statics.field4701.method5164() * 2 / 100;
            int var9 = var8 + Statics.field1980.method5164() * 55 / 100;
            int var10 = var9 + Statics.field3562.method5164() * 2 / 100;
            int var11 = var10 + Statics.field2367.method5164() * 2 / 100;
            int var12 = var11 + Statics.field1857.method5164() * 2 / 100;
            int var13 = var12 + Statics.field90.method5164() * 2 / 100;
            int var14 = var13 + Statics.field2168.method5164() * 2 / 100;
            int var15 = var14 + Statics.field1048.method5164() * 2 / 100;
            int var16 = var15 + Statics.field1320.method5164() * 2 / 100;
            int var17 = var16 + Statics.field3177.method5164() * 2 / 100;
            int var18 = var17 + Statics.field2334.method5164() / 100;
            int var19 = var18 + Statics.field4142.method5164() / 100;
            int var20 = var19 + Statics.field4296.method5164() / 100;
            int var21 = var20 + Statics.field4233.method5164() / 100;
            int var22 = var21 + (Statics.field231.method5135() && Statics.field231.method5177() ? 1 : 0);
            if (var22 == 100) {
                method994(Statics.field1546, "Animations");
                method994(Statics.field404, "Skeletons");
                method994(Statics.field3183, "Sound FX");
                method994(Statics.field1493, "Maps");
                method994(Statics.field4701, "Music Tracks");
                method994(Statics.field1980, "Models");
                method994(Statics.field3562, "Sprites");
                method994(Statics.field90, "Music Jingles");
                method994(Statics.field1320, "Music Samples");
                method994(Statics.field3177, "Music Patches");
                method994(Statics.field2334, "World Map");
                method994(Statics.field4142, "World Map Geography");
                method994(Statics.field4296, "World Map Ground");
                Statics.field1984 = new class384();
                Statics.field1984.method6184(Statics.field231);
                class69.field881 = class309.field3634;
                class69.field904 = 30;
                field504 = 45;
            } else {
                if (var22 != 0) {
                    class69.field881 = class309.field3633 + var22 + "%";
                }
                class69.field904 = 30;
            }
        } else if (field504 == 45) {
            boolean var23 = !field480;
            Statics.field4153 = 22050;
            Statics.field297 = var23;
            Statics.field280 = 2;
            class275 var24 = new class275();
            var24.method4684(9, 128);
            Statics.field1019 = class40.method2920(Statics.field188, 0, 22050);
            Statics.field1019.method667(var24);
            class274.method2385(Statics.field3177, Statics.field1320, Statics.field3183, var24);
            Statics.field1056 = class40.method2920(Statics.field188, 1, 2048);
            Statics.field4123 = new class36();
            Statics.field1056.method667(Statics.field4123);
            Statics.field1047 = new class53(22050, Statics.field4153);
            class69.field881 = class309.field3635;
            class69.field904 = 35;
            field504 = 50;
            Statics.field1541 = new class417(Statics.field3562, Statics.field1048);
        } else if (field504 == 50) {
            class418[] var25 = new class418[] { class418.field4582, class418.field4580, class418.field4583, class418.field4586, class418.field4581, class418.field4589 };
            int var26 = var25.length;
            class417 var27 = Statics.field1541;
            class418[] var28 = new class418[] { class418.field4582, class418.field4580, class418.field4583, class418.field4586, class418.field4581, class418.field4589 };
            field744 = var27.method6650(var28);
            if (field744.size() < var26) {
                class69.field881 = class309.field3636 + field744.size() * 100 / var26 + "%";
                class69.field904 = 40;
            } else {
                Statics.field3608 = (class350) field744.get(class418.field4589);
                Statics.field250 = (class350) field744.get(class418.field4581);
                Statics.field2706 = (class350) field744.get(class418.field4582);
                Statics.field4431 = field760.method6421();
                class69.field881 = class309.field3846;
                class69.field904 = 40;
                field504 = 60;
            }
        } else if (field504 == 60) {
            class314 var29 = Statics.field1857;
            class314 var30 = Statics.field3562;
            int var31 = 0;
            String[] var32 = class69.field902;
            for (int var33 = 0; var33 < var32.length; var33++) {
                String var34 = var32[var33];
                if (var29.method5199(var34, "")) {
                    var31++;
                }
            }
            String[] var35 = class69.field907;
            for (int var36 = 0; var36 < var35.length; var36++) {
                String var37 = var35[var36];
                if (var30.method5199(var37, "")) {
                    var31++;
                }
            }
            int var40 = class69.field907.length + class69.field902.length;
            if (var31 < var40) {
                class69.field881 = class309.field3638 + var31 * 100 / var40 + "%";
                class69.field904 = 50;
            } else {
                class69.field881 = class309.field3639;
                class69.field904 = 50;
                method20(5);
                field504 = 70;
            }
        } else if (field504 == 70) {
            if (!Statics.field2448.method5177()) {
                class69.field881 = class309.field3699 + Statics.field2448.method5146() + "%";
                class69.field904 = 60;
            } else if (Statics.field4233.method5177()) {
                Statics.method2633(Statics.field2448);
                class181.method4630(Statics.field2448);
                class173.method2787(Statics.field2448, Statics.field1980);
                class314 var42 = Statics.field2448;
                class314 var43 = Statics.field1980;
                boolean var44 = field480;
                Statics.field2058 = var42;
                Statics.field2037 = var43;
                class187.field2079 = var44;
                Statics.method3579(Statics.field2448, Statics.field1980);
                class314 var45 = Statics.field2448;
                Statics.field2011 = var45;
                class188.method4782(Statics.field2448, Statics.field1980, field479, Statics.field3608);
                class190.method2653(Statics.field2448, Statics.field1546, Statics.field404);
                class314 var46 = Statics.field2448;
                class314 var47 = Statics.field1980;
                Statics.field1966 = var46;
                Statics.field1956 = var47;
                class183.method918(Statics.field2448);
                class170.method2659(Statics.field2448);
                class314 var48 = Statics.field3613;
                class314 var49 = Statics.field1980;
                class314 var50 = Statics.field3562;
                class314 var51 = Statics.field1048;
                Statics.field4684 = var48;
                Statics.field2220 = var49;
                Statics.field2757 = var50;
                Statics.field2616 = var51;
                Statics.field4250 = new class295[Statics.field4684.method5243()][];
                Statics.field3349 = new boolean[Statics.field4684.method5243()];
                class314 var52 = Statics.field2448;
                Statics.field1800 = var52;
                class314 var53 = Statics.field2448;
                Statics.field1879 = var53;
                Statics.method2934(Statics.field2448);
                class182.method2645(Statics.field2448);
                class314 var54 = Statics.field2448;
                Statics.field1998 = var54;
                class314 var55 = Statics.field2448;
                Statics.field4670 = var55;
                class439.method84(Statics.field2448);
                Statics.field3321 = new class429(Statics.field112, 54, Statics.field1773, Statics.field2448);
                Statics.field4384 = new class429(Statics.field112, 47, Statics.field1773, Statics.field2448);
                Statics.field4144 = new class98();
                class314 var56 = Statics.field2448;
                class314 var57 = Statics.field3562;
                class314 var58 = Statics.field1048;
                Statics.field4649 = var56;
                Statics.field2025 = var57;
                Statics.field2014 = var58;
                class314 var59 = Statics.field2448;
                class314 var60 = Statics.field3562;
                Statics.field1869 = var59;
                Statics.field1860 = var60;
                class314 var61 = Statics.field2448;
                class314 var62 = Statics.field3562;
                Statics.field165 = var62;
                if (var61.method5177()) {
                    Statics.field1812 = var61.method5184(35);
                    Statics.field1833 = new class171[Statics.field1812];
                    for (int var63 = 0; var63 < Statics.field1812; var63++) {
                        byte[] var64 = var61.method5179(35, var63);
                        Statics.field1833[var63] = new class171(var63);
                        if (var64 != null) {
                            Statics.field1833[var63].method2959(new class444(var64));
                            Statics.field1833[var63].method2960();
                        }
                    }
                }
                class69.field881 = class309.field3641;
                class69.field904 = 60;
                field504 = 80;
            } else {
                class69.field881 = class309.field3699 + (80 + Statics.field2168.method5146() / 6) + "%";
                class69.field904 = 60;
            }
        } else if (field504 == 80) {
            int var65 = 0;
            if (Statics.field87 == null) {
                Statics.field87 = class458.method4559(Statics.field3562, Statics.field1984.field4368, 0);
            } else {
                var65++;
            }
            if (Statics.field1050 == null) {
                Statics.field1050 = class458.method4559(Statics.field3562, Statics.field1984.field4367, 0);
            } else {
                var65++;
            }
            if (Statics.field1495 == null) {
                Statics.field1495 = class458.method6180(Statics.field3562, Statics.field1984.field4369, 0);
            } else {
                var65++;
            }
            if (Statics.field4344 == null) {
                Statics.field4344 = class458.method1918(Statics.field3562, Statics.field1984.field4373, 0);
            } else {
                var65++;
            }
            if (Statics.field3278 == null) {
                Statics.field3278 = class458.method1918(Statics.field3562, Statics.field1984.field4371, 0);
            } else {
                var65++;
            }
            if (Statics.field2772 == null) {
                Statics.field2772 = class458.method1918(Statics.field3562, Statics.field1984.field4370, 0);
            } else {
                var65++;
            }
            if (Statics.field25 == null) {
                Statics.field25 = class458.method1918(Statics.field3562, Statics.field1984.field4372, 0);
            } else {
                var65++;
            }
            if (Statics.field159 == null) {
                Statics.field159 = class458.method1918(Statics.field3562, Statics.field1984.field4374, 0);
            } else {
                var65++;
            }
            if (Statics.field3279 == null) {
                Statics.field3279 = class458.method1918(Statics.field3562, Statics.field1984.field4375, 0);
            } else {
                var65++;
            }
            if (Statics.field1028 == null) {
                Statics.field1028 = class458.method6180(Statics.field3562, Statics.field1984.field4376, 0);
            } else {
                var65++;
            }
            if (Statics.field1804 == null) {
                Statics.field1804 = class458.method6180(Statics.field3562, Statics.field1984.field4377, 0);
            } else {
                var65++;
            }
            if (var65 < 11) {
                class69.field881 = class309.field3642 + var65 * 100 / 12 + "%";
                class69.field904 = 70;
            } else {
                Statics.field4193 = Statics.field1804;
                Statics.field1050.method7405();
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 21.0D) - 10;
                int var69 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1495[0].method7322(var66 + var69, var67 + var69, var68 + var69);
                class69.field881 = class309.field3643;
                class69.field904 = 70;
                field504 = 90;
            }
        } else if (field504 == 90) {
            if (Statics.field2367.method5177()) {
                Statics.field3589 = new class209(Statics.field2367, Statics.field3562, 20, Statics.field4303.method2102(), field480 ? 64 : 128);
                class201.method3601(Statics.field3589);
                class201.method3596(Statics.field4303.method2102());
                field504 = 100;
            } else {
                class69.field881 = class309.field3932 + "0%";
                class69.field904 = 90;
            }
        } else if (field504 == 100) {
            int var70 = Statics.field3589.method3893();
            if (var70 < 100) {
                class69.field881 = class309.field3932 + var70 + "%";
                class69.field904 = 90;
            } else {
                class69.field881 = class309.field3645;
                class69.field904 = 90;
                field504 = 110;
            }
        } else if (field504 == 110) {
            Statics.field4048 = new class82();
            Statics.field188.method2877(Statics.field4048, 10);
            class69.field881 = class309.field3646;
            class69.field904 = 92;
            field504 = 120;
        } else if (field504 == 120) {
            if (Statics.field1857.method5199("huffman", "")) {
                class282 var71 = new class282(Statics.field1857.method5198("huffman", ""));
                Statics.method4434(var71);
                class69.field881 = class309.field3631;
                class69.field904 = 94;
                field504 = 130;
            } else {
                class69.field881 = class309.field3647 + "%";
                class69.field904 = 94;
            }
        } else if (field504 == 130) {
            if (!Statics.field3613.method5177()) {
                class69.field881 = class309.field3649 + Statics.field3613.method5146() * 4 / 5 + "%";
                class69.field904 = 96;
            } else if (!Statics.field2168.method5177()) {
                class69.field881 = class309.field3649 + (80 + Statics.field2168.method5146() / 6) + "%";
                class69.field904 = 96;
            } else if (Statics.field1048.method5177()) {
                class69.field881 = class309.field3650;
                class69.field904 = 98;
                field504 = 140;
            } else {
                class69.field881 = class309.field3649 + (96 + Statics.field1048.method5146() / 50) + "%";
                class69.field904 = 96;
            }
        } else if (field504 == 140) {
            class69.field904 = 100;
            if (Statics.field2334.method5200(class244.field2873.field2874)) {
                if (Statics.field3026 == null) {
                    Statics.field3026 = new class416();
                    Statics.field3026.method6449(Statics.field2334, Statics.field4142, Statics.field4296, Statics.field2706, field744, Statics.field1495);
                }
                class69.field881 = class309.field3835;
                field504 = 150;
            } else {
                class69.field881 = class309.field3708 + Statics.field2334.method5202(class244.field2873.field2874) / 10 + "%";
            }
        } else if (field504 == 150) {
            method20(10);
        }
    }

    @ObfuscatedName("ck.ea(IZZZZI)Lln;")
    public static class314 method2407(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class382 var5 = null;
        if (class158.field1728 != null) {
            var5 = new class382(arg0, class158.field1728, Statics.field1428[arg0], 1000000);
        }
        return new class314(var5, Statics.field62, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.ef(S)V")
    public final void method1020() {
        class378 var1 = field536.method2328();
        class443 var2 = field536.field1333;
        try {
            if (field574 == 0) {
                if (Statics.field471 == null && (field525.method1826() || field550 > 250)) {
                    Statics.field471 = field525.method1827();
                    field525.method1833();
                    field525 = null;
                }
                if (Statics.field471 != null) {
                    if (var1 != null) {
                        var1.method6121();
                        var1 = null;
                    }
                    Statics.field1457 = null;
                    field677 = false;
                    field550 = 0;
                    if (field513.method7207()) {
                        try {
                            this.method1273(Statics.field4151);
                            method993(21);
                        } catch (Throwable var87) {
                            class468.method566((String) null, var87);
                            method138(65);
                            return;
                        }
                    } else {
                        method993(1);
                    }
                }
            }
            if (field574 == 21) {
                if (this.field731 == null) {
                    if (this.field520 == null) {
                        method138(65);
                        return;
                    }
                    if (!this.field520.method264()) {
                        return;
                    }
                    if (this.field520.method263()) {
                        class468.method566(this.field520.method278(), (Throwable) null);
                        method138(65);
                        this.field520 = null;
                        return;
                    }
                    class22 var6 = this.field520.method265();
                    if (var6.method290() != 200) {
                        method138(65);
                        this.field520 = null;
                        return;
                    }
                    field550 = 0;
                    class401 var7 = new class401(var6.method287());
                    try {
                        Statics.field157 = var7.method6383().getString("access_token");
                        Statics.field4151 = var7.method6383().getString("refresh_token");
                    } catch (Exception var85) {
                        class468.method566("Error parsing tokens", var85);
                        method138(65);
                        this.field520 = null;
                        return;
                    }
                } else if (this.field731.isDone()) {
                    if (this.field731.isCancelled()) {
                        method138(65);
                        this.field731 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse) this.field731.get();
                        if (!var4.isSuccess()) {
                            method138(65);
                            this.field731 = null;
                            return;
                        }
                        Statics.field157 = var4.getAccessToken();
                        Statics.field4151 = var4.getRefreshToken();
                        this.field731 = null;
                    } catch (Exception var86) {
                        class468.method566((String) null, var86);
                        method138(65);
                        this.field731 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1013(Statics.field157);
                method993(20);
            }
            if (field574 == 20) {
                if (this.field518 == null) {
                    if (this.field663 == null) {
                        method138(65);
                        return;
                    }
                    if (!this.field663.method264()) {
                        return;
                    }
                    if (this.field663.method263()) {
                        class468.method566(this.field663.method278(), (Throwable) null);
                        method138(65);
                        this.field663 = null;
                        return;
                    }
                    class22 var11 = this.field663.method265();
                    if (var11.method290() != 200) {
                        class468.method566("Response code: " + var11.method290() + "Response body: " + var11.method287(), (Throwable) null);
                        method138(65);
                        this.field663 = null;
                        return;
                    }
                    this.field514 = var11.method287();
                    this.field663 = null;
                } else if (this.field518.isDone()) {
                    if (this.field518.isCancelled()) {
                        method138(65);
                        this.field518 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var9 = (OtlTokenResponse) this.field518.get();
                        if (!var9.isSuccess()) {
                            method138(65);
                            this.field518 = null;
                            return;
                        }
                        this.field514 = var9.getToken();
                        this.field518 = null;
                    } catch (Exception var84) {
                        class468.method566((String) null, var84);
                        method138(65);
                        this.field518 = null;
                        return;
                    }
                } else {
                    return;
                }
                field550 = 0;
                method993(1);
            }
            if (field574 == 1) {
                if (Statics.field1457 == null) {
                    Statics.field1457 = Statics.field188.method2876(Statics.field67, Statics.field2685);
                }
                if (Statics.field1457.field1779 == 2) {
                    throw new IOException();
                }
                if (Statics.field1457.field1779 == 1) {
                    var1 = class378.method2436((Socket) Statics.field1457.field1778, 40000, 5000);
                    field536.method2325(var1);
                    Statics.field1457 = null;
                    method993(2);
                }
            }
            if (field574 == 2) {
                field536.method2334();
                class265 var12;
                if (class265.field3040 == 0) {
                    var12 = new class265();
                } else {
                    var12 = class265.field3043[--class265.field3040];
                }
                var12.field3041 = null;
                var12.field3044 = 0;
                var12.field3039 = new class443(5000);
                var12.field3039.method6912(class267.field3163.field3160);
                field536.method2330(var12);
                field536.method2323();
                var2.field4708 = 0;
                method993(3);
            }
            if (field574 == 3) {
                if (Statics.field1019 != null) {
                    Statics.field1019.method663();
                }
                if (Statics.field1056 != null) {
                    Statics.field1056.method663();
                }
                if (var1.method6108(1)) {
                    int var16 = var1.method6110();
                    if (Statics.field1019 != null) {
                        Statics.field1019.method663();
                    }
                    if (Statics.field1056 != null) {
                        Statics.field1056.method663();
                    }
                    if (var16 != 0) {
                        method138(var16);
                        return;
                    }
                    var2.field4708 = 0;
                    method993(4);
                }
            }
            if (field574 == 4) {
                if (var2.field4708 < 8) {
                    int var17 = var1.method6109();
                    if (var17 > 8 - var2.field4708) {
                        var17 = 8 - var2.field4708;
                    }
                    if (var17 > 0) {
                        var1.method6122(var2.field4707, var2.field4708, var17);
                        var2.field4708 += var17;
                    }
                }
                if (var2.field4708 == 8) {
                    var2.field4708 = 0;
                    Statics.field4051 = var2.method6935();
                    method993(5);
                }
            }
            if (field574 == 5) {
                field536.field1333.field4708 = 0;
                field536.method2334();
                class443 var18 = new class443(500);
                int[] var19 = new int[] { Statics.field471.nextInt(), Statics.field471.nextInt(), Statics.field471.nextInt(), Statics.field471.nextInt() };
                var18.field4708 = 0;
                var18.method6912(1);
                var18.method6915(var19[0]);
                var18.method6915(var19[1]);
                var18.method6915(var19[2]);
                var18.method6915(var19[3]);
                var18.method7068(Statics.field4051);
                if (field505 == 40) {
                    var18.method6915(Statics.field526[0]);
                    var18.method6915(Statics.field526[1]);
                    var18.method6915(Statics.field526[2]);
                    var18.method6915(Statics.field526[3]);
                } else {
                    if (field505 == 50) {
                        var18.method6912(class125.field1524.method39());
                        var18.method6915(Statics.field4380);
                    } else {
                        var18.method6912(field512.method39());
                        switch(field512.field1525) {
                            case 0:
                            case 4:
                                var18.method6914(Statics.field101);
                                var18.field4708++;
                                break;
                            case 1:
                                var18.field4708 += 4;
                            case 2:
                            default:
                                break;
                            case 3:
                                LinkedHashMap var21 = Statics.field4303.field1231;
                                String var22 = class69.field887;
                                int var23 = var22.length();
                                int var24 = 0;
                                for (int var25 = 0; var25 < var23; var25++) {
                                    var24 = (var24 << 5) - var24 + var22.charAt(var25);
                                }
                                var18.method6915((Integer) var21.get(var24));
                        }
                    }
                    if (field513.method7207()) {
                        var18.method6912(class448.field4758.method39());
                        var18.method6950(this.field514);
                    } else {
                        var18.method6912(class448.field4757.method39());
                        var18.method6950(class69.field905);
                    }
                }
                var18.method6955(class68.field866, class68.field864);
                Statics.field526 = var19;
                class265 var27;
                if (class265.field3040 == 0) {
                    var27 = new class265();
                } else {
                    var27 = class265.field3043[--class265.field3040];
                }
                var27.field3041 = null;
                var27.field3044 = 0;
                var27.field3039 = new class443(5000);
                var27.field3039.field4708 = 0;
                if (field505 == 40) {
                    var27.field3039.method6912(class267.field3157.field3160);
                } else {
                    var27.field3039.method6912(class267.field3159.field3160);
                }
                var27.field3039.method6913(0);
                int var31 = var27.field3039.field4708;
                var27.field3039.method6915(207);
                var27.field3039.method6915(1);
                var27.field3039.method6912(field482);
                var27.field3039.method6912(field483);
                byte var32 = 0;
                var27.field3039.method6912(var32);
                var27.field3039.method6922(var18.field4707, 0, var18.field4708);
                int var33 = var27.field3039.field4708;
                var27.field3039.method6950(class69.field887);
                var27.field3039.method6912((field545 ? 1 : 0) << 1 | (field480 ? 1 : 0));
                var27.field3039.method6913(Statics.field32);
                var27.field3039.method6913(Statics.field2650);
                method5411(var27.field3039);
                var27.field3039.method6950(Statics.field2013);
                var27.field3039.method6915(Statics.field4766);
                class444 var34 = new class444(Statics.field4431.method6428());
                Statics.field4431.method6426(var34);
                var27.field3039.method6922(var34.field4707, 0, var34.field4707.length);
                var27.field3039.method6912(field482);
                var27.field3039.method6915(0);
                var27.field3039.method6980(Statics.field3177.field4014);
                var27.field3039.method6966(Statics.field3613.field4014);
                var27.field3039.method6979(Statics.field2168.field4014);
                var27.field3039.method6966(Statics.field4296.field4014);
                var27.field3039.method6980(Statics.field3562.field4014);
                var27.field3039.method6915(0);
                var27.field3039.method6966(Statics.field3183.field4014);
                var27.field3039.method6979(Statics.field1048.field4014);
                var27.field3039.method6979(Statics.field404.field4014);
                var27.field3039.method6980(Statics.field2448.field4014);
                var27.field3039.method6980(Statics.field1980.field4014);
                var27.field3039.method6979(Statics.field4701.field4014);
                var27.field3039.method6915(Statics.field4142.field4014);
                var27.field3039.method6915(Statics.field1320.field4014);
                var27.field3039.method6980(Statics.field1857.field4014);
                var27.field3039.method6966(Statics.field90.field4014);
                var27.field3039.method6980(Statics.field2367.field4014);
                var27.field3039.method6966(Statics.field1546.field4014);
                var27.field3039.method6966(Statics.field1493.field4014);
                var27.field3039.method6979(Statics.field2334.field4014);
                var27.field3039.method6979(Statics.field231.field4014);
                var27.field3039.method6962(var19, var33, var27.field3039.field4708);
                var27.field3039.method6925(var27.field3039.field4708 - var31);
                field536.method2330(var27);
                field536.method2323();
                field536.field1339 = new class460(var19);
                int[] var35 = new int[4];
                for (int var36 = 0; var36 < 4; var36++) {
                    var35[var36] = var19[var36] + 50;
                }
                var2.method6869(var35);
                method993(6);
            }
            if (field574 == 6 && var1.method6109() > 0) {
                int var37 = var1.method6110();
                if (var37 == 61) {
                    int var38 = var1.method6109();
                    Statics.field1067 = var38 == 1 && var1.method6110() == 1;
                    method993(5);
                }
                if (var37 == 21 && field505 == 20) {
                    method993(12);
                } else if (var37 == 2) {
                    method993(14);
                } else if (var37 == 15 && field505 == 40) {
                    field536.field1335 = -1;
                    method993(19);
                } else if (var37 == 64) {
                    method993(10);
                } else if (var37 == 23 && field669 < 1) {
                    field669++;
                    method993(0);
                } else if (var37 == 29) {
                    method993(17);
                } else if (var37 == 69) {
                    method993(7);
                } else {
                    method138(var37);
                    return;
                }
            }
            if (field574 == 7 && var1.method6109() >= 2) {
                var1.method6122(var2.field4707, 0, 2);
                var2.field4708 = 0;
                Statics.field232 = var2.method7120();
                method993(8);
            }
            if (field574 == 8 && var1.method6109() >= Statics.field232) {
                var2.field4708 = 0;
                var1.method6122(var2.field4707, var2.field4708, Statics.field232);
                class7 var39 = class7.method2448()[var2.method6929()];
                try {
                    class4 var40 = class5.method2588(var39);
                    this.field528 = new class8(var2, var40);
                    method993(9);
                } catch (Exception var83) {
                    method138(22);
                    return;
                }
            }
            if (field574 == 9 && this.field528.method54()) {
                this.field527 = this.field528.method46();
                this.field528.method47();
                this.field528 = null;
                if (this.field527 == null) {
                    method138(22);
                    return;
                }
                field536.method2334();
                class265 var42;
                if (class265.field3040 == 0) {
                    var42 = new class265();
                } else {
                    var42 = class265.field3043[--class265.field3040];
                }
                var42.field3041 = null;
                var42.field3044 = 0;
                var42.field3039 = new class443(5000);
                var42.field3039.method6912(class267.field3158.field3160);
                var42.field3039.method6913(this.field527.field4708);
                var42.field3039.method6924(this.field527);
                field536.method2330(var42);
                field536.method2323();
                this.field527 = null;
                method993(6);
            }
            if (field574 == 10 && var1.method6109() > 0) {
                Statics.field92 = var1.method6110();
                method993(11);
            }
            if (field574 == 11 && var1.method6109() >= Statics.field92) {
                var1.method6122(var2.field4707, 0, Statics.field92);
                var2.field4708 = 0;
                method993(6);
            }
            if (field574 == 12 && var1.method6109() > 0) {
                field511 = (var1.method6110() + 3) * 60;
                method993(13);
            }
            if (field574 == 13) {
                field550 = 0;
                class69.method3352(class309.field3658, class309.field3854, field511 / 60 + class309.field3815);
                if (--field511 <= 0) {
                    method993(0);
                }
            } else {
                if (field574 == 14 && var1.method6109() >= 1) {
                    Statics.field1729 = var1.method6110();
                    method993(15);
                }
                if (field574 == 15 && var1.method6109() >= Statics.field1729) {
                    boolean var46 = var1.method6110() == 1;
                    var1.method6122(var2.field4707, 0, 4);
                    var2.field4708 = 0;
                    boolean var47 = false;
                    if (var46) {
                        int var48 = var2.method6872() << 24;
                        int var49 = var48 | var2.method6872() << 16;
                        int var50 = var49 | var2.method6872() << 8;
                        int var51 = var50 | var2.method6872();
                        String var52 = class69.field887;
                        int var53 = var52.length();
                        int var54 = 0;
                        int var55 = 0;
                        while (true) {
                            if (var55 >= var53) {
                                if (Statics.field4303.field1231.size() >= 10 && !Statics.field4303.field1231.containsKey(var54)) {
                                    Iterator var58 = Statics.field4303.field1231.entrySet().iterator();
                                    var58.next();
                                    var58.remove();
                                }
                                Statics.field4303.field1231.put(var54, var51);
                                break;
                            }
                            var54 = (var54 << 5) - var54 + var52.charAt(var55);
                            var55++;
                        }
                    }
                    if (field524) {
                        Statics.field4303.method2150(class69.field887);
                    } else {
                        Statics.field4303.method2150((String) null);
                    }
                    class90.method1972();
                    field757 = var1.method6110();
                    field661 = var1.method6110() == 1;
                    field763 = var1.method6110();
                    field763 <<= 0x8;
                    field763 += var1.method6110();
                    field593 = var1.method6110();
                    var1.method6122(var2.field4707, 0, 8);
                    var2.field4708 = 0;
                    this.field654 = var2.method6935();
                    if (Statics.field1729 >= 29) {
                        var1.method6122(var2.field4707, 0, 8);
                        var2.field4708 = 0;
                        field607 = var2.method6935();
                    }
                    var1.method6122(var2.field4707, 0, 1);
                    var2.field4708 = 0;
                    class266[] var59 = class266.method1953();
                    int var60 = var2.method6874();
                    if (var60 < 0 || var60 >= var59.length) {
                        throw new IOException(var60 + " " + var2.field4708);
                    }
                    field536.field1332 = var59[var60];
                    field536.field1335 = field536.field1332.field3122;
                    var1.method6122(var2.field4707, 0, 2);
                    var2.field4708 = 0;
                    field536.field1335 = var2.method7120();
                    try {
                        Statics.method379(Statics.field3295, "zap");
                    } catch (Throwable var82) {
                    }
                    method993(16);
                }
                if (field574 != 16) {
                    if (field574 == 17 && var1.method6109() >= 2) {
                        var2.field4708 = 0;
                        var1.method6122(var2.field4707, 0, 2);
                        var2.field4708 = 0;
                        Statics.field1752 = var2.method7120();
                        method993(18);
                    }
                    if (field574 == 18 && var1.method6109() >= Statics.field1752) {
                        var2.field4708 = 0;
                        var1.method6122(var2.field4707, 0, Statics.field1752);
                        var2.field4708 = 0;
                        String var77 = var2.method6975();
                        String var78 = var2.method6975();
                        String var79 = var2.method6975();
                        class69.method3352(var77, var78, var79);
                        method20(10);
                        if (field513.method7207()) {
                            class69.method2545(9);
                        }
                    }
                    if (field574 == 19) {
                        if (field536.field1335 == -1) {
                            if (var1.method6109() < 2) {
                                return;
                            }
                            var1.method6122(var2.field4707, 0, 2);
                            var2.field4708 = 0;
                            field536.field1335 = var2.method7120();
                        }
                        if (var1.method6109() >= field536.field1335) {
                            var1.method6122(var2.field4707, 0, field536.field1335);
                            var2.field4708 = 0;
                            int var80 = field536.field1335;
                            field539.method5877();
                            method4068();
                            class97.method2234(var2);
                            if (var2.field4708 != var80) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field550++;
                        if (field550 > 2000) {
                            if (field669 < 1) {
                                if (Statics.field2685 == Statics.field2281) {
                                    Statics.field2685 = Statics.field1738;
                                } else {
                                    Statics.field2685 = Statics.field2281;
                                }
                                field669++;
                                method993(0);
                            } else {
                                method138(-3);
                            }
                        }
                    }
                } else if (var1.method6109() >= field536.field1335) {
                    var2.field4708 = 0;
                    var1.method6122(var2.field4707, 0, field536.field1335);
                    field539.method5858();
                    field488 = -1L;
                    Statics.field4048.field1055 = 0;
                    Statics.field4426 = true;
                    field605 = true;
                    field718 = -1L;
                    class34.field238 = new class337();
                    field536.method2334();
                    field536.field1333.field4708 = 0;
                    field536.field1332 = null;
                    field536.field1338 = null;
                    field536.field1340 = null;
                    field536.field1331 = null;
                    field536.field1335 = 0;
                    field536.field1337 = 0;
                    field493 = 0;
                    field537 = 0;
                    field494 = 0;
                    field626 = 0;
                    field664 = false;
                    class33.field214 = 0;
                    class99.field1322.clear();
                    class99.field1326.method6670();
                    class99.field1324.method5568();
                    class99.field1325 = 0;
                    field484 = 0;
                    field635 = false;
                    field709 = 0;
                    field558 = 0;
                    field563 = 0;
                    Statics.field4165 = null;
                    field728 = 0;
                    field721 = -1;
                    field726 = 0;
                    field727 = 0;
                    field502 = class95.field1286;
                    field503 = class95.field1286;
                    field532 = 0;
                    class97.method5279();
                    for (int var62 = 0; var62 < 2048; var62++) {
                        field604[var62] = null;
                    }
                    for (int var63 = 0; var63 < 32768; var63++) {
                        field531[var63] = null;
                    }
                    field700 = -1;
                    field619.method5438();
                    field620.method5438();
                    for (int var64 = 0; var64 < 4; var64++) {
                        for (int var65 = 0; var65 < 104; var65++) {
                            for (int var66 = 0; var66 < 104; var66++) {
                                field617[var64][var65][var66] = null;
                            }
                        }
                    }
                    field618 = new class335();
                    Statics.field4063.method1533();
                    for (int var67 = 0; var67 < Statics.field1810; var67++) {
                        class170 var68 = Statics.method1949(var67);
                        if (var68 != null) {
                            class289.field3314[var67] = 0;
                            class289.field3313[var67] = 0;
                        }
                    }
                    Statics.field4144.method2273();
                    field660 = -1;
                    if (field650 != -1) {
                        int var69 = field650;
                        if (var69 != -1 && Statics.field3349[var69]) {
                            Statics.field4684.method5192(var69);
                            if (Statics.field4250[var69] != null) {
                                boolean var70 = true;
                                for (int var71 = 0; var71 < Statics.field4250[var69].length; var71++) {
                                    if (Statics.field4250[var69][var71] != null) {
                                        if (Statics.field4250[var69][var71].field3360 == 2) {
                                            var70 = false;
                                        } else {
                                            Statics.field4250[var69][var71] = null;
                                        }
                                    }
                                }
                                if (var70) {
                                    Statics.field4250[var69] = null;
                                }
                                Statics.field3349[var69] = false;
                            }
                        }
                    }
                    for (class80 var72 = (class80) field651.method6694(); var72 != null; var72 = (class80) field651.method6681()) {
                        Statics.method387(var72, true);
                    }
                    field650 = -1;
                    field651 = new class421(8);
                    field611 = null;
                    field626 = 0;
                    field664 = false;
                    field695.method4935((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var73 = 0; var73 < 8; var73++) {
                        field613[var73] = null;
                        field614[var73] = false;
                    }
                    class78.field1001 = new class421(32);
                    field486 = true;
                    for (int var74 = 0; var74 < 100; var74++) {
                        field644[var74] = true;
                    }
                    class265 var75 = class265.method349(class263.field2991, field536.field1339);
                    var75.field3039.method6912(method356());
                    var75.field3039.method6913(Statics.field32);
                    var75.field3039.method6913(Statics.field2650);
                    field536.method2330(var75);
                    Statics.field105 = null;
                    Statics.field4591 = null;
                    Arrays.fill(field719, (Object) null);
                    Statics.field4039 = null;
                    Arrays.fill(field678, (Object) null);
                    for (int var76 = 0; var76 < 8; var76++) {
                        field577[var76] = new class325();
                    }
                    Statics.field1384 = null;
                    class97.method2234(var2);
                    Statics.field4197 = -1;
                    method3149(false, var2);
                    field536.field1332 = null;
                }
            }
        } catch (IOException var88) {
            if (field669 < 1) {
                if (Statics.field2685 == Statics.field2281) {
                    Statics.field2685 = Statics.field1738;
                } else {
                    Statics.field2685 = Statics.field2281;
                }
                field669++;
                method993(0);
            } else {
                method138(-2);
            }
        }
    }

    @ObfuscatedName("ha.es(B)V")
    public static void method4068() {
        field536.method2334();
        field536.field1333.field4708 = 0;
        field536.field1332 = null;
        field536.field1338 = null;
        field536.field1340 = null;
        field536.field1331 = null;
        field536.field1335 = 0;
        field536.field1337 = 0;
        field493 = 0;
        field626 = 0;
        field664 = false;
        field728 = 0;
        field726 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field604[var0] = null;
        }
        Statics.field454 = null;
        for (int var1 = 0; var1 < field531.length; var1++) {
            class92 var2 = field531[var1];
            if (var2 != null) {
                var2.field1131 = -1;
                var2.field1158 = false;
            }
        }
        class78.field1001 = new class421(32);
        method20(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field644[var3] = true;
        }
        class265 var4 = class265.method349(class263.field2991, field536.field1339);
        var4.field3039.method6912(method356());
        var4.field3039.method6913(Statics.field32);
        var4.field3039.method6913(Statics.field2650);
        field536.method2330(var4);
    }

    @ObfuscatedName("m.eh(II)V")
    public static void method138(int arg0) {
        int var1 = class69.field885;
        if (arg0 == -3) {
            class69.method3352(class309.field3661, class309.field3662, class309.field3663);
        } else if (arg0 == -2) {
            class69.method3352(class309.field3867, class309.field3665, class309.field3666);
        } else if (arg0 == -1) {
            class69.method3352(class309.field3786, class309.field3725, class309.field3669);
        } else if (arg0 == 3) {
            class69.method2545(3);
            class69.field876 = 1;
        } else if (arg0 == 4) {
            class69.method2545(14);
            class69.field883 = 0;
        } else if (arg0 == 5) {
            class69.field876 = 2;
            class69.method3352(class309.field3673, class309.field3674, class309.field3675);
        } else if (arg0 == 68 || !(field552 || arg0 != 6)) {
            class69.method3352(class309.field3676, class309.field3916, class309.field3804);
        } else if (arg0 == 7) {
            class69.method3352(class309.field3679, class309.field3827, class309.field3681);
        } else if (arg0 == 8) {
            class69.method3352(class309.field3682, class309.field3683, class309.field3684);
        } else if (arg0 == 9) {
            class69.method3352(class309.field3685, class309.field3686, class309.field3687);
        } else if (arg0 == 10) {
            class69.method3352(class309.field3910, class309.field3836, class309.field3758);
        } else if (arg0 == 11) {
            class69.method3352(class309.field3691, class309.field3858, class309.field3693);
        } else if (arg0 == 12) {
            class69.method3352(class309.field3616, class309.field3695, class309.field3696);
        } else if (arg0 == 13) {
            class69.method3352(class309.field3697, class309.field3698, class309.field3664);
        } else if (arg0 == 14) {
            class69.method3352(class309.field3667, class309.field3701, class309.field3702);
        } else if (arg0 == 16) {
            class69.method3352(class309.field3703, class309.field3704, class309.field3652);
        } else if (arg0 == 17) {
            class69.method3352(class309.field3720, class309.field3618, class309.field3759);
        } else if (arg0 == 18) {
            class69.method2545(14);
            class69.field883 = 1;
        } else if (arg0 == 19) {
            class69.method3352(class309.field3753, class309.field3713, class309.field3714);
        } else if (arg0 == 20) {
            class69.method3352(class309.field3715, class309.field3716, class309.field3717);
        } else if (arg0 == 22) {
            class69.method3352(class309.field3680, class309.field3896, class309.field3749);
        } else if (arg0 == 23) {
            class69.method3352(class309.field3721, class309.field3722, class309.field3723);
        } else if (arg0 == 24) {
            class69.method3352(class309.field3724, class309.field3852, class309.field3777);
        } else if (arg0 == 25) {
            class69.method3352(class309.field3727, class309.field3728, class309.field3729);
        } else if (arg0 == 26) {
            class69.method3352(class309.field3730, class309.field3731, class309.field3689);
        } else if (arg0 == 27) {
            class69.method3352(class309.field3644, class309.field3734, class309.field3831);
        } else if (arg0 == 31) {
            class69.method3352(class309.field3648, class309.field3829, class309.field3706);
        } else if (arg0 == 32) {
            class69.method2545(14);
            class69.field883 = 2;
        } else if (arg0 == 37) {
            class69.method3352(class309.field3700, class309.field3882, class309.field3750);
        } else if (arg0 == 38) {
            class69.method3352(class309.field3751, class309.field3926, class309.field3762);
        } else if (arg0 == 55) {
            class69.method2545(8);
        } else if (arg0 == 56) {
            class69.method3352(class309.field3707, class309.field3755, class309.field3760);
            method20(11);
            return;
        } else if (arg0 == 57) {
            class69.method3352(class309.field3677, class309.field3761, class309.field3655);
            method20(11);
            return;
        } else if (arg0 == 61) {
            class69.method3352("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class69.method2545(7);
        } else if (arg0 == 62) {
            method20(10);
            class69.method2545(9);
            class69.method3352(class309.field3764, class309.field3765, class309.field3766);
            return;
        } else if (arg0 == 63) {
            method20(10);
            class69.method2545(9);
            class69.method3352(class309.field3767, class309.field3768, class309.field3769);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method20(10);
            class69.method2545(9);
            class69.method3352(class309.field3776, class309.field3771, class309.field3772);
            return;
        } else if (arg0 == 71) {
            method20(10);
            class69.method2545(7);
            class69.method3352("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method20(10);
            class69.method2545(6);
            class69.method3352(class309.field3917, class309.field3918, class309.field3919);
        } else if (arg0 == 72) {
            method20(10);
            class69.method2545(26);
        } else {
            class69.method3352(class309.field3773, class309.field3868, class309.field3671);
        }
        method20(10);
        int var4 = class69.field885;
        boolean var5 = var1 != var4;
        if (!var5 && field513.method7207()) {
            class69.method2545(9);
        }
    }

    @ObfuscatedName("du.ep(I)V")
    public static final void method2411() {
        field536.method2326();
        method2543();
        Statics.field69.method3709();
        for (int var0 = 0; var0 < 4; var0++) {
            field597[var0].method3435();
        }
        System.gc();
        class274.field3199 = 1;
        Statics.field3995 = null;
        Statics.field1348 = -1;
        Statics.field2613 = -1;
        Statics.field167 = 0;
        Statics.field3203 = false;
        Statics.field1748 = 2;
        field729 = -1;
        field730 = false;
        class63.method1974();
        method20(10);
    }

    @ObfuscatedName("au.ex(II)V")
    public static final void method572(int arg0) {
        method2411();
        switch(arg0) {
            case 1:
                class69.method2545(24);
                class69.method3352(class309.field3782, class309.field3865, class309.field3866);
                break;
            case 2:
                class69.method160();
        }
    }

    @ObfuscatedName("client.eq(B)J")
    public static long method1040() {
        return field607;
    }

    @ObfuscatedName("dg.ew(I)V")
    public static final void method2543() {
        Statics.method2957();
        class181.field1972.method4603();
        class173.method2400();
        class187.method2502();
        class178.method2759();
        class188.method2590();
        class190.field2162.method4603();
        class190.field2166.method4603();
        class190.field2163.method4603();
        class180.field1955.method4603();
        class180.field1958.method4603();
        class183.method2371();
        class170.field1809.method4603();
        Statics.field3321.method6767();
        Statics.field4384.method6767();
        class186.method2784();
        class174.field1861.method4603();
        class174.field1862.method4603();
        class185.method1916();
        class184.field2000.method4603();
        class171.field1811.method4603();
        class437.method3891();
        class439.method5119();
        field543.method4603();
        field764.method4603();
        Statics.method2953();
        class295.field3445.method4603();
        class295.field3441.method4603();
        class295.field3352.method4603();
        class295.field3474.method4603();
        ((class209) Statics.field2348).method3902();
        class72.field955.method4603();
        Statics.field1546.method5193();
        Statics.field404.method5193();
        Statics.field3613.method5193();
        Statics.field3183.method5193();
        Statics.field1493.method5193();
        Statics.field4701.method5193();
        Statics.field1980.method5193();
        Statics.field3562.method5193();
        Statics.field2367.method5193();
        Statics.field1857.method5193();
        Statics.field90.method5193();
        Statics.field2168.method5193();
        Statics.field4233.method5193();
    }

    @ObfuscatedName("fa.eg(B)V")
    public static final void method2933() {
        if (field537 > 0) {
            method2411();
        } else {
            field539.method5867();
            method20(40);
            Statics.field3046 = field536.method2328();
            field536.method2343();
        }
    }

    @ObfuscatedName("fe.et(ZB)V")
    public static final void method3051(boolean arg0) {
        if (arg0) {
            field512 = class69.field896 ? class125.field1523 : class125.field1521;
            return;
        }
        LinkedHashMap var1 = Statics.field4303.field1231;
        String var2 = class69.field887;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field512 = var1.containsKey(var4) ? class125.field1520 : class125.field1522;
    }

    @ObfuscatedName("client.ez(I)V")
    public final void method1377() {
        if (field493 > 1) {
            field493--;
        }
        if (field537 > 0) {
            field537--;
        }
        if (field677) {
            field677 = false;
            method2933();
            return;
        }
        if (!field664) {
            method6095();
        }
        for (int var1 = 0; var1 < 100 && this.method1026(field536); var1++) {
        }
        if (field505 != 30) {
            return;
        }
        while (true) {
            class35 var2 = (class35) class34.field238.method5482();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field539.field4224) {
                    class265 var6 = class265.method349(class263.field2925, field536.field1339);
                    var6.field3039.method6912(0);
                    int var7 = var6.field3039.field4708;
                    field539.method5876(var6.field3039);
                    var6.field3039.method7054(var6.field3039.field4708 - var7);
                    field536.method2330(var6);
                    field539.method5860();
                }
                Object var8 = Statics.field4048.field1049;
                synchronized (Statics.field4048.field1049) {
                    if (!field551) {
                        Statics.field4048.field1055 = 0;
                    } else if (class33.field227 != 0 || Statics.field4048.field1055 >= 40) {
                        class265 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field4048.field1055 && (var9 == null || var9.field3039.field4708 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field4048.field1052[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field4048.field1051[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field554 != var16 || field689 != var15) {
                                if (var9 == null) {
                                    var9 = class265.method349(class263.field2961, field536.field1339);
                                    var9.field3039.method6912(0);
                                    var10 = var9.field3039.field4708;
                                    var9.field3039.field4708 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field572 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field554;
                                    var18 = var15 - field689;
                                    var19 = (int) ((Statics.field4048.field1053[var14] - field572) / 20L);
                                    var12 = (int) ((Statics.field4048.field1053[var14] - field572) % 20L + (long) var12);
                                }
                                field554 = var16;
                                field689 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3039.method6913((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3039.method6912(var19 + 128);
                                    var9.field3039.method6913((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3039.method6912(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3039.method6915(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3039.method6915(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3039.method6913((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3039.method6915(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3039.method6915(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field572 = Statics.field4048.field1053[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3039.method7054(var9.field3039.field4708 - var10);
                            int var20 = var9.field3039.field4708;
                            var9.field3039.field4708 = var10;
                            var9.field3039.method6912(var12 / var13);
                            var9.field3039.method6912(var12 % var13);
                            var9.field3039.field4708 = var20;
                            field536.method2330(var9);
                        }
                        if (var11 >= Statics.field4048.field1055) {
                            Statics.field4048.field1055 = 0;
                        } else {
                            Statics.field4048.field1055 -= var11;
                            System.arraycopy(Statics.field4048.field1051, var11, Statics.field4048.field1051, 0, Statics.field4048.field1055);
                            System.arraycopy(Statics.field4048.field1052, var11, Statics.field4048.field1052, 0, Statics.field4048.field1055);
                            System.arraycopy(Statics.field4048.field1053, var11, Statics.field4048.field1053, 0, Statics.field4048.field1055);
                        }
                    }
                }
                if (class33.field227 == 1 || !Statics.field4383 && class33.field227 == 4 || class33.field227 == 2) {
                    long var22 = class33.field217 - field488;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field488 = class33.field217;
                    int var24 = class33.field230;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field2650) {
                        var24 = Statics.field2650;
                    }
                    int var25 = class33.field219;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field32) {
                        var25 = Statics.field32;
                    }
                    int var26 = (int) var22;
                    class265 var27 = class265.method349(class263.field3011, field536.field1339);
                    var27.field3039.method6913((var26 << 1) + (class33.field227 == 2 ? 1 : 0));
                    var27.field3039.method6913(var25);
                    var27.field3039.method6913(var24);
                    field536.method2330(var27);
                }
                if (class24.field137 > 0) {
                    class265 var28 = class265.method349(class263.field2998, field536.field1339);
                    var28.field3039.method6913(0);
                    int var29 = var28.field3039.field4708;
                    long var30 = class270.method3146();
                    for (int var32 = 0; var32 < class24.field137; var32++) {
                        long var33 = var30 - field718;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field718 = var30;
                        var28.field3039.method7171(class24.field136[var32]);
                        var28.field3039.method6976((int) var33);
                    }
                    var28.field3039.method6925(var28.field3039.field4708 - var29);
                    field536.method2330(var28);
                }
                if (field633 > 0) {
                    field633--;
                }
                if (class24.field135[96] || class24.field135[97] || class24.field135[98] || class24.field135[99]) {
                    field656 = true;
                }
                if (field656 && field633 <= 0) {
                    field633 = 20;
                    field656 = false;
                    class265 var35 = class265.method349(class263.field2931, field536.field1339);
                    var35.field3039.method6913(field558);
                    var35.field3039.method6968(field557);
                    field536.method2330(var35);
                }
                if (Statics.field4426 && !field605) {
                    field605 = true;
                    class265 var36 = class265.method349(class263.field2995, field536.field1339);
                    var36.field3039.method6912(1);
                    field536.method2330(var36);
                }
                if (!Statics.field4426 && field605) {
                    field605 = false;
                    class265 var37 = class265.method349(class263.field2995, field536.field1339);
                    var37.field3039.method6912(0);
                    field536.method2330(var37);
                }
                if (Statics.field3026 != null) {
                    Statics.field3026.method6547();
                }
                method1977();
                method3065();
                if (Statics.field3173 != field721) {
                    field721 = Statics.field3173;
                    int var38 = Statics.field3173;
                    int[] var39 = Statics.field5.field4803;
                    int var40 = var39.length;
                    for (int var41 = 0; var41 < var40; var41++) {
                        var39[var41] = 0;
                    }
                    for (int var42 = 1; var42 < 103; var42++) {
                        int var43 = (103 - var42) * 2048 + 24628;
                        for (int var44 = 1; var44 < 103; var44++) {
                            if ((class75.field972[var38][var44][var42] & 0x18) == 0) {
                                Statics.field69.method3846(var39, var43, 512, var38, var44, var42);
                            }
                            if (var38 < 3 && (class75.field972[var38 + 1][var44][var42] & 0x8) != 0) {
                                Statics.field69.method3846(var39, var43, 512, var38 + 1, var44, var42);
                            }
                            var43 += 4;
                        }
                    }
                    int var45 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var46 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field5.method7343();
                    for (int var47 = 1; var47 < 103; var47++) {
                        for (int var48 = 1; var48 < 103; var48++) {
                            if ((class75.field972[var38][var48][var47] & 0x18) == 0) {
                                method2589(var38, var48, var47, var45, var46);
                            }
                            if (var38 < 3 && (class75.field972[var38 + 1][var48][var47] & 0x8) != 0) {
                                method2589(var38 + 1, var48, var47, var45, var46);
                            }
                        }
                    }
                    field722 = 0;
                    for (int var49 = 0; var49 < 104; var49++) {
                        for (int var50 = 0; var50 < 104; var50++) {
                            long var51 = Statics.field69.method3738(Statics.field3173, var49, var50);
                            if (var51 != 0L) {
                                int var53 = class212.method4145(var51);
                                int var54 = class187.method2907(var53).field2064;
                                if (var54 >= 0 && class171.method3061(var54).field1830) {
                                    field655[field722] = class171.method3061(var54).method2961(false);
                                    field723[field722] = var49;
                                    field724[field722] = var50;
                                    field722++;
                                }
                            }
                        }
                    }
                    Statics.field1490.method7315();
                }
                if (field505 != 30) {
                    return;
                }
                method4647();
                method4897();
                field536.field1337++;
                if (field536.field1337 > 750) {
                    method2933();
                    return;
                }
                method553();
                method5376();
                int[] var55 = class97.field1302;
                for (int var56 = 0; var56 < class97.field1301; var56++) {
                    class85 var57 = field604[var55[var56]];
                    if (var57 != null && var57.field1178 > 0) {
                        var57.field1178--;
                        if (var57.field1178 == 0) {
                            var57.field1143 = null;
                        }
                    }
                }
                for (int var58 = 0; var58 < field532; var58++) {
                    int var59 = field533[var58];
                    class92 var60 = field531[var59];
                    if (var60 != null && var60.field1178 > 0) {
                        var60.field1178--;
                        if (var60.field1178 == 0) {
                            var60.field1143 = null;
                        }
                    }
                }
                field600++;
                if (field592 != 0) {
                    field591 += 20;
                    if (field591 >= 400) {
                        field592 = 0;
                    }
                }
                if (Statics.field2635 != null) {
                    field594++;
                    if (field594 >= 15) {
                        method2620(Statics.field2635);
                        Statics.field2635 = null;
                    }
                }
                class295 var61 = Statics.field1406;
                class295 var62 = Statics.field1891;
                Statics.field1406 = null;
                Statics.field1891 = null;
                field667 = null;
                field495 = false;
                field570 = false;
                field715 = 0;
                while (class24.method3180() && field715 < 128) {
                    if (field757 >= 2 && class24.field135[82] && Statics.field1654 == 66) {
                        StringBuilder var63 = new StringBuilder();
                        Iterator var64 = class99.field1326.iterator();
                        while (var64.hasNext()) {
                            class58 var65 = (class58) var64.next();
                            if (var65.field460 != null && !var65.field460.isEmpty()) {
                                var63.append(var65.field460).append(':');
                            }
                            var63.append(var65.field463).append('\n');
                        }
                        String var66 = var63.toString();
                        Statics.field3295.method412(var66);
                    } else if (field563 != 1 || Statics.field2637 <= 0) {
                        field717[field715] = Statics.field1654;
                        field578[field715] = Statics.field2637;
                        field715++;
                    }
                }
                if (method2390() && class24.field135[82] && class24.field135[81] && field771 != 0) {
                    int var68 = Statics.field454.field1105 - field771;
                    if (var68 < 0) {
                        var68 = 0;
                    } else if (var68 > 3) {
                        var68 = 3;
                    }
                    if (Statics.field454.field1105 != var68) {
                        method74(Statics.field405 + Statics.field454.field1198[0], Statics.field31 + Statics.field454.field1199[0], var68, false);
                    }
                    field771 = 0;
                }
                if (field650 != -1) {
                    method1755(field650, 0, 0, Statics.field32, Statics.field2650, 0, 0);
                }
                field675++;
                while (true) {
                    class81 var69;
                    class295 var70;
                    class295 var71;
                    do {
                        var69 = (class81) field694.method5457();
                        if (var69 == null) {
                            while (true) {
                                class81 var72;
                                class295 var73;
                                class295 var74;
                                do {
                                    var72 = (class81) field529.method5457();
                                    if (var72 == null) {
                                        while (true) {
                                            class81 var75;
                                            class295 var76;
                                            class295 var77;
                                            do {
                                                var75 = (class81) field751.method5457();
                                                if (var75 == null) {
                                                    this.method1027();
                                                    method58();
                                                    if (field587 != null) {
                                                        this.method1190();
                                                    }
                                                    if (Statics.field88 != null) {
                                                        method2620(Statics.field88);
                                                        field601++;
                                                        if (class33.field212 == 0) {
                                                            if (field703) {
                                                                if (Statics.field88 == Statics.field1571 && field743 != field596) {
                                                                    class295 var78 = Statics.field88;
                                                                    byte var79 = 0;
                                                                    if (field636 == 1 && var78.field3362 == 206) {
                                                                        var79 = 1;
                                                                    }
                                                                    if (var78.field3492[field743] <= 0) {
                                                                        var79 = 0;
                                                                    }
                                                                    int var80 = method3477(var78);
                                                                    boolean var81 = (var80 >> 29 & 0x1) != 0;
                                                                    if (var81) {
                                                                        int var82 = field596;
                                                                        int var83 = field743;
                                                                        var78.field3492[var83] = var78.field3492[var82];
                                                                        var78.field3493[var83] = var78.field3493[var82];
                                                                        var78.field3492[var82] = -1;
                                                                        var78.field3493[var82] = 0;
                                                                    } else if (var79 == 1) {
                                                                        int var84 = field596;
                                                                        int var85 = field743;
                                                                        while (var84 != var85) {
                                                                            if (var84 > var85) {
                                                                                var78.method4974(var84 - 1, var84);
                                                                                var84--;
                                                                            } else if (var84 < var85) {
                                                                                var78.method4974(var84 + 1, var84);
                                                                                var84++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var78.method4974(field743, field596);
                                                                    }
                                                                    class265 var86 = class265.method349(class263.field3003, field536.field1339);
                                                                    var86.field3039.method6979(Statics.field88.field3358);
                                                                    var86.field3039.method6940(field743);
                                                                    var86.field3039.method6960(var79);
                                                                    var86.field3039.method6913(field596);
                                                                    field536.method2330(var86);
                                                                }
                                                            } else if (this.method1472()) {
                                                                this.method1029(field610, field598);
                                                            } else if (field626 > 0) {
                                                                method5837(field610, field598);
                                                            }
                                                            field594 = 10;
                                                            class33.field227 = 0;
                                                            Statics.field88 = null;
                                                        } else if (field601 >= 5 && (class33.field220 > field610 + 5 || class33.field220 < field610 - 5 || class33.field228 > field598 + 5 || class33.field228 < field598 - 5)) {
                                                            field703 = true;
                                                        }
                                                    }
                                                    if (class204.method3747()) {
                                                        int var87 = class204.field2416;
                                                        int var88 = class204.field2417;
                                                        class265 var89 = class265.method349(class263.field3025, field536.field1339);
                                                        var89.field3039.method6912(5);
                                                        var89.field3039.method6969(Statics.field31 + var88);
                                                        var89.field3039.method6960(class24.field135[82] ? (class24.field135[81] ? 2 : 1) : 0);
                                                        var89.field3039.method6940(Statics.field405 + var87);
                                                        field536.method2330(var89);
                                                        class204.method3748();
                                                        field589 = class33.field219;
                                                        field521 = class33.field230;
                                                        field592 = 1;
                                                        field591 = 0;
                                                        field726 = var87;
                                                        field727 = var88;
                                                    }
                                                    if (Statics.field1406 != var61) {
                                                        if (var61 != null) {
                                                            method2620(var61);
                                                        }
                                                        if (Statics.field1406 != null) {
                                                            method2620(Statics.field1406);
                                                        }
                                                    }
                                                    if (Statics.field1891 != var62 && field687 == field641) {
                                                        if (var62 != null) {
                                                            method2620(var62);
                                                        }
                                                        if (Statics.field1891 != null) {
                                                            method2620(Statics.field1891);
                                                        }
                                                    }
                                                    if (Statics.field1891 == null) {
                                                        if (field641 > 0) {
                                                            field641--;
                                                        }
                                                    } else if (field641 < field687) {
                                                        field641++;
                                                        if (field687 == field641) {
                                                            method2620(Statics.field1891);
                                                        }
                                                    }
                                                    method96();
                                                    if (field519) {
                                                        method4613(Statics.field324, Statics.field4449, Statics.field4040);
                                                        method4428(Statics.field1004, Statics.field3325);
                                                        if (Statics.field89 == Statics.field324 && Statics.field4449 == Statics.field2838 && Statics.field4040 == Statics.field3180 && Statics.field1069 == Statics.field1004 && Statics.field3325 == Statics.field1247) {
                                                            field519 = false;
                                                            field737 = false;
                                                            Statics.field3614 = 0;
                                                            Statics.field173 = 0;
                                                            Statics.field1806 = 0;
                                                            Statics.field114 = 0;
                                                            Statics.field97 = 0;
                                                            Statics.field2760 = 0;
                                                            Statics.field3187 = 0;
                                                            Statics.field1665 = 0;
                                                            Statics.field2199 = 0;
                                                            Statics.field2310 = 0;
                                                        }
                                                    } else if (field737) {
                                                        int var90 = Statics.field1665 * 128 + 64;
                                                        int var91 = Statics.field2199 * 128 + 64;
                                                        int var92 = method3277(var90, var91, Statics.field3173) - Statics.field2310;
                                                        method4613(var90, var92, var91);
                                                        int var93 = Statics.field3614 * 128 + 64;
                                                        int var94 = Statics.field173 * 128 + 64;
                                                        int var95 = method3277(var93, var94, Statics.field3173) - Statics.field1806;
                                                        int var96 = var93 - Statics.field89;
                                                        int var97 = var95 - Statics.field2838;
                                                        int var98 = var94 - Statics.field3180;
                                                        int var99 = (int) Math.sqrt((double) (var96 * var96 + var98 * var98));
                                                        int var100 = (int) (Math.atan2((double) var97, (double) var99) * 325.9490051269531D) & 0x7FF;
                                                        int var101 = (int) (Math.atan2((double) var96, (double) var98) * -325.9490051269531D) & 0x7FF;
                                                        method4428(var100, var101);
                                                    }
                                                    for (int var102 = 0; var102 < 5; var102++) {
                                                        int var10002 = field616[var102]++;
                                                    }
                                                    Statics.field4144.method2269();
                                                    int var103 = class33.method4674();
                                                    int var104 = class24.field143;
                                                    if (var103 > 15000 && var104 > 15000) {
                                                        field537 = 250;
                                                        class33.field214 = 14500;
                                                        class265 var106 = class265.method349(class263.field2922, field536.field1339);
                                                        field536.method2330(var106);
                                                    }
                                                    Statics.field4063.method1555();
                                                    field536.field1328++;
                                                    if (field536.field1328 > 50) {
                                                        class265 var107 = class265.method349(class263.field2967, field536.field1339);
                                                        field536.method2330(var107);
                                                    }
                                                    try {
                                                        field536.method2323();
                                                    } catch (IOException var109) {
                                                        method2933();
                                                    }
                                                    return;
                                                }
                                                var76 = var75.field1030;
                                                if (var76.field3359 < 0) {
                                                    break;
                                                }
                                                var77 = class295.method3238(var76.field3377);
                                            } while (var77 == null || var77.field3398 == null || var76.field3359 >= var77.field3398.length || var77.field3398[var76.field3359] != var76);
                                            class64.method4069(var75);
                                        }
                                    }
                                    var73 = var72.field1030;
                                    if (var73.field3359 < 0) {
                                        break;
                                    }
                                    var74 = class295.method3238(var73.field3377);
                                } while (var74 == null || var74.field3398 == null || var73.field3359 >= var74.field3398.length || var74.field3398[var73.field3359] != var73);
                                class64.method4069(var72);
                            }
                        }
                        var70 = var69.field1030;
                        if (var70.field3359 < 0) {
                            break;
                        }
                        var71 = class295.method3238(var70.field3377);
                    } while (var71 == null || var71.field3398 == null || var70.field3359 >= var71.field3398.length || var71.field3398[var70.field3359] != var70);
                    class64.method4069(var69);
                }
            }
            class265 var4 = class265.method349(class263.field2928, field536.field1339);
            var4.field3039.method6912(0);
            int var5 = var4.field3039.field4708;
            Statics.method2370(var4.field3039);
            var4.field3039.method7054(var4.field3039.field4708 - var5);
            field536.method2330(var4);
        }
    }

    @ObfuscatedName("kl.ec(I)V")
    public static final void method4897() {
        for (int var0 = 0; var0 < field709; var0++) {
            int var10002 = field734[var0]--;
            if (field734[var0] >= -10) {
                class37 var2 = field736[var0];
                if (var2 == null) {
                    class37 var10000 = (class37) null;
                    var2 = class37.method628(Statics.field3183, field508[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field734[var0] += var2.method622();
                    field736[var0] = var2;
                }
                if (field734[var0] < 0) {
                    int var9;
                    if (field735[var0] == 0) {
                        var9 = Statics.field4303.method2086();
                    } else {
                        int var3 = (field735[var0] & 0xFF) * 128;
                        int var4 = field735[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field454.field1172;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field735[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field454.field1155;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field734[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * Statics.field4303.method2108() / var3;
                    }
                    if (var9 > 0) {
                        class38 var10 = var2.method630().method635(Statics.field1047);
                        class45 var11 = class45.method741(var10, 100, var9);
                        var11.method758(field733[var0] - 1);
                        Statics.field4123.method590(var11);
                    }
                    field734[var0] = -100;
                }
            } else {
                field709--;
                for (int var1 = var0; var1 < field709; var1++) {
                    field508[var1] = field508[var1 + 1];
                    field736[var1] = field736[var1 + 1];
                    field733[var1] = field733[var1 + 1];
                    field734[var1] = field734[var1 + 1];
                    field735[var1] = field735[var1 + 1];
                }
                var0--;
            }
        }
        if (field730 && !class274.method4614()) {
            if (Statics.field4303.method2104() != 0 && field729 != -1) {
                class274.method2575(Statics.field4701, field729, 0, Statics.field4303.method2104(), false);
            }
            field730 = false;
        }
    }

    @ObfuscatedName("js.ey(Lgh;IIII)V")
    public static void method4872(class190 arg0, int arg1, int arg2, int arg3) {
        if (field709 >= 50 || Statics.field4303.method2108() == 0 || arg0.field2169 == null || arg1 >= arg0.field2169.length) {
            return;
        }
        int var4 = arg0.field2169[arg1];
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field508[field709] = var7;
        field733[field709] = var8;
        field734[field709] = 0;
        field736[field709] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field735[field709] = (var10 << 16) + (var11 << 8) + var9;
        field709++;
    }

    @ObfuscatedName("iv.ed(Lgh;IIII)V")
    public static void method4473(class190 arg0, int arg1, int arg2, int arg3) {
        if (field709 >= 50 || Statics.field4303.method2108() == 0 || arg0.field2175 == null || !arg0.field2175.containsKey(arg1)) {
            return;
        }
        int var4 = (Integer) arg0.field2175.get(arg1);
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field508[field709] = var7;
        field733[field709] = var8;
        field734[field709] = 0;
        field736[field709] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field735[field709] = (var10 << 16) + (var11 << 8) + var9;
        field709++;
    }

    @ObfuscatedName("ee.en(IIII)V")
    public static void method2763(int arg0, int arg1, int arg2) {
        if (Statics.field4303.method2086() == 0 || arg1 == 0 || field709 >= 50) {
            return;
        }
        field508[field709] = arg0;
        field733[field709] = arg1;
        field734[field709] = arg2;
        field736[field709] = null;
        field735[field709] = 0;
        field709++;
    }

    @ObfuscatedName("fz.em(II)V")
    public static void method2945(int arg0) {
        if (arg0 == -1 && !field730) {
            class274.method2997();
        } else if (arg0 != -1 && field729 != arg0 && Statics.field4303.method2104() != 0 && !field730) {
            class314 var1 = Statics.field4701;
            int var2 = Statics.field4303.method2104();
            class274.field3199 = 1;
            Statics.field3995 = var1;
            Statics.field1348 = arg0;
            Statics.field2613 = 0;
            Statics.field167 = var2;
            Statics.field3203 = false;
            Statics.field1748 = 2;
        }
        field729 = arg0;
    }

    @ObfuscatedName("fk.eo(III)V")
    public static void method2906(int arg0, int arg1) {
        if (Statics.field4303.method2104() != 0 && arg0 != -1) {
            class274.method2575(Statics.field90, arg0, 0, Statics.field4303.method2104(), false);
            field730 = true;
        }
    }

    @ObfuscatedName("ch.er(B)V")
    public static final void method1977() {
        if (!Statics.field3301) {
            return;
        }
        if (Statics.field105 != null) {
            Statics.field105.method6032();
        }
        method1572();
        Statics.field3301 = false;
    }

    @ObfuscatedName("fo.eu(I)V")
    public static final void method3065() {
        if (!Statics.field14) {
            return;
        }
        for (int var0 = 0; var0 < class97.field1301; var0++) {
            class85 var1 = field604[class97.field1302[var0]];
            var1.method2018();
        }
        Statics.field14 = false;
    }

    @ObfuscatedName("mp.fu(Lkn;III)V")
    public static final void method5880(class295 arg0, int arg1, int arg2) {
        if (field728 != 0 && field728 != 3 || field664 || !(class33.field227 == 1 || !Statics.field4383 && class33.field227 == 4)) {
            return;
        }
        class288 var3 = arg0.method4983(true);
        if (var3 == null) {
            return;
        }
        int var4 = class33.field219 - arg1;
        int var5 = class33.field230 - arg2;
        if (!var3.method4896(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3309 / 2;
        int var7 = var5 - var3.field3311 / 2;
        int var8 = field558 & 0x7FF;
        int var9 = class201.field2346[var8];
        int var10 = class201.field2363[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field454.field1172 + var11 >> 7;
        int var14 = Statics.field454.field1155 - var12 >> 7;
        class265 var15 = class265.method349(class263.field2975, field536.field1339);
        var15.field3039.method6912(18);
        var15.field3039.method6969(Statics.field31 + var14);
        var15.field3039.method6960(class24.field135[82] ? (class24.field135[81] ? 2 : 1) : 0);
        var15.field3039.method6940(Statics.field405 + var13);
        var15.field3039.method6912(var6);
        var15.field3039.method6912(var7);
        var15.field3039.method6913(field558);
        var15.field3039.method6912(57);
        var15.field3039.method6912(0);
        var15.field3039.method6912(0);
        var15.field3039.method6912(89);
        var15.field3039.method6913(Statics.field454.field1172);
        var15.field3039.method6913(Statics.field454.field1155);
        var15.field3039.method6912(63);
        field536.method2330(var15);
        field726 = var13;
        field727 = var14;
    }

    @ObfuscatedName("ae.fk(Ljava/lang/String;I)V")
    public static final void method576(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field4303.method2123(!Statics.field4303.method2091());
            if (Statics.field4303.method2091()) {
                class99.method2996(99, "", "Roofs are now all hidden");
            } else {
                class99.method2996(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field4303.method2137();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field546 = !field546;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field638 = !field638;
        }
        if (field757 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field3026.field4570 = !Statics.field3026.field4570;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field4303.method2158(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field4303.method2158(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2933();
            }
        }
        class265 var1 = class265.method349(class263.field2940, field536.field1339);
        var1.field3039.method6912(arg0.length() + 1);
        var1.field3039.method6950(arg0);
        field536.method2330(var1);
    }

    @ObfuscatedName("jt.fd(IIIB)V")
    public static final void method4613(int arg0, int arg1, int arg2) {
        if (Statics.field89 < arg0) {
            Statics.field89 += Statics.field2760 * (arg0 - Statics.field89) / 1000 + Statics.field3187;
            if (Statics.field89 > arg0) {
                Statics.field89 = arg0;
            }
        }
        if (Statics.field89 > arg0) {
            Statics.field89 -= Statics.field2760 * (Statics.field89 - arg0) / 1000 + Statics.field3187;
            if (Statics.field89 < arg0) {
                Statics.field89 = arg0;
            }
        }
        if (Statics.field2838 < arg1) {
            Statics.field2838 += Statics.field2760 * (arg1 - Statics.field2838) / 1000 + Statics.field3187;
            if (Statics.field2838 > arg1) {
                Statics.field2838 = arg1;
            }
        }
        if (Statics.field2838 > arg1) {
            Statics.field2838 -= Statics.field2760 * (Statics.field2838 - arg1) / 1000 + Statics.field3187;
            if (Statics.field2838 < arg1) {
                Statics.field2838 = arg1;
            }
        }
        if (Statics.field3180 < arg2) {
            Statics.field3180 += Statics.field2760 * (arg2 - Statics.field3180) / 1000 + Statics.field3187;
            if (Statics.field3180 > arg2) {
                Statics.field3180 = arg2;
            }
        }
        if (Statics.field3180 > arg2) {
            Statics.field3180 -= Statics.field2760 * (Statics.field3180 - arg2) / 1000 + Statics.field3187;
            if (Statics.field3180 < arg2) {
                Statics.field3180 = arg2;
            }
        }
    }

    @ObfuscatedName("hj.ff(IIS)V")
    public static final void method4428(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1069 < arg0) {
            Statics.field1069 += Statics.field97 * (arg0 - Statics.field1069) / 1000 + Statics.field114;
            if (Statics.field1069 > arg0) {
                Statics.field1069 = arg0;
            }
        }
        if (Statics.field1069 > arg0) {
            Statics.field1069 -= Statics.field97 * (Statics.field1069 - arg0) / 1000 + Statics.field114;
            if (Statics.field1069 < arg0) {
                Statics.field1069 = arg0;
            }
        }
        int var2 = arg1 - Statics.field1247;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field1247 += Statics.field97 * var2 / 1000 + Statics.field114;
            Statics.field1247 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field1247 -= Statics.field97 * -var2 / 1000 + Statics.field114;
            Statics.field1247 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field1247;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field1247 = arg1;
        }
    }

    @ObfuscatedName("d.ft(B)V")
    public static final void method96() {
        if (field563 == 0) {
            int var0 = Statics.field454.field1172;
            int var1 = Statics.field454.field1155;
            if (Statics.field2156 - var0 < -500 || Statics.field2156 - var0 > 500 || Statics.field4309 - var1 < -500 || Statics.field4309 - var1 > 500) {
                Statics.field2156 = var0;
                Statics.field4309 = var1;
            }
            if (Statics.field2156 != var0) {
                Statics.field2156 += (var0 - Statics.field2156) / 16;
            }
            if (Statics.field4309 != var1) {
                Statics.field4309 += (var1 - Statics.field4309) / 16;
            }
            int var2 = Statics.field2156 >> 7;
            int var3 = Statics.field4309 >> 7;
            int var4 = method3277(Statics.field2156, Statics.field4309, Statics.field3173);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field3173;
                        if (var8 < 3 && (class75.field972[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class75.field985[var8][var6][var7];
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
            if (var10 > field659) {
                field659 += (var10 - field659) / 24;
            } else if (var10 < field659) {
                field659 += (var10 - field659) / 80;
            }
            Statics.field1892 = method3277(Statics.field454.field1172, Statics.field454.field1155, Statics.field3173) - field599;
        } else if (field563 == 1) {
            if (field485 && Statics.field454 != null) {
                int var11 = Statics.field454.field1198[0];
                int var12 = Statics.field454.field1199[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field2156 = Statics.field454.field1172;
                    int var13 = method3277(Statics.field454.field1172, Statics.field454.field1155, Statics.field3173) - field599;
                    if (var13 < Statics.field1892) {
                        Statics.field1892 = var13;
                    }
                    Statics.field4309 = Statics.field454.field1155;
                    field485 = false;
                }
            }
            short var14 = -1;
            if (class24.field135[33]) {
                var14 = 0;
            } else if (class24.field135[49]) {
                var14 = 1024;
            }
            if (class24.field135[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class24.field135[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class24.field135[35]) {
                var15 = -1;
            } else if (class24.field135[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class24.field135[81] ? field569 : field568;
                var16 = var17 * 16;
                field566 = var14;
                field567 = var15;
            }
            if (field565 < var16) {
                field565 += var16 / 8;
                if (field565 > var16) {
                    field565 = var16;
                }
            } else if (field565 > var16) {
                field565 = field565 * 9 / 10;
            }
            if (field565 > 0) {
                int var18 = field565 / 16;
                if (field566 >= 0) {
                    int var19 = field566 - Statics.field1247 & 0x7FF;
                    int var20 = class201.field2346[var19];
                    int var21 = class201.field2363[var19];
                    Statics.field2156 += var18 * var20 / 65536;
                    Statics.field4309 += var18 * var21 / 65536;
                }
                if (field567 != 0) {
                    Statics.field1892 += field567 * var18;
                    if (Statics.field1892 > 0) {
                        Statics.field1892 = 0;
                    }
                }
            } else {
                field566 = -1;
                field567 = -1;
            }
            if (class24.field135[13]) {
                field536.method2330(class265.method349(class263.field2930, field536.field1339));
                field563 = 0;
            }
        }
        if (class33.field212 == 4 && Statics.field4383) {
            int var22 = class33.field228 - field652;
            field560 = var22 * 2;
            field652 = var22 == -1 || var22 == 1 ? class33.field228 : (field652 + class33.field228) / 2;
            int var23 = field699 - class33.field220;
            field559 = var23 * 2;
            field699 = var23 == -1 || var23 == 1 ? class33.field220 : (field699 + class33.field220) / 2;
        } else {
            if (class24.field135[96]) {
                field559 += (-24 - field559) / 2;
            } else if (class24.field135[97]) {
                field559 += (24 - field559) / 2;
            } else {
                field559 /= 2;
            }
            if (class24.field135[98]) {
                field560 += (12 - field560) / 2;
            } else if (class24.field135[99]) {
                field560 += (-12 - field560) / 2;
            } else {
                field560 /= 2;
            }
            field652 = class33.field228;
            field699 = class33.field220;
        }
        field558 = field559 / 2 + field558 & 0x7FF;
        field557 += field560 / 2;
        if (field557 < 128) {
            field557 = 128;
        }
        if (field557 > 383) {
            field557 = 383;
        }
    }

    @ObfuscatedName("ak.fc(I)V")
    public static final void method553() {
        int var0 = class97.field1301;
        int[] var1 = class97.field1302;
        for (int var2 = 0; var2 < var0; var2++) {
            class85 var3 = field604[var1[var2]];
            if (var3 != null) {
                method4147(var3, 1);
            }
        }
    }

    @ObfuscatedName("lp.fp(B)V")
    public static final void method5376() {
        for (int var0 = 0; var0 < field532; var0++) {
            int var1 = field533[var0];
            class92 var2 = field531[var1];
            if (var2 != null) {
                method4147(var2, var2.field1261.field1907);
            }
        }
    }

    @ObfuscatedName("hs.fb(Lcx;II)V")
    public static final void method4147(class87 arg0, int arg1) {
        if (arg0.field1183 >= field487) {
            method992(arg0);
        } else if (arg0.field1184 >= field487) {
            boolean var2 = field487 == arg0.field1184 || arg0.field1169 == -1 || arg0.field1127 != 0;
            if (!var2) {
                class190 var3 = class190.method5853(arg0.field1169);
                if (var3 == null || var3.method3388()) {
                    var2 = true;
                } else {
                    var2 = arg0.field1200 + 1 > var3.field2164[arg0.field1170];
                }
            }
            if (var2) {
                int var4 = arg0.field1184 - arg0.field1183;
                int var5 = field487 - arg0.field1183;
                int var6 = arg0.field1191 * 64 + arg0.field1179 * 128;
                int var7 = arg0.field1191 * 64 + arg0.field1128 * 128;
                int var8 = arg0.field1191 * 64 + arg0.field1180 * 128;
                int var9 = arg0.field1191 * 64 + arg0.field1182 * 128;
                arg0.field1172 = ((var4 - var5) * var6 + var5 * var8) / var4;
                arg0.field1155 = ((var4 - var5) * var7 + var5 * var9) / var4;
            }
            arg0.field1201 = 0;
            arg0.field1194 = arg0.field1137;
            arg0.field1161 = arg0.field1194;
        } else {
            arg0.field1156 = arg0.field1133;
            if (arg0.field1197 == 0) {
                arg0.field1201 = 0;
            } else {
                label410: {
                    if (arg0.field1169 != -1 && arg0.field1127 == 0) {
                        class190 var10 = class190.method5853(arg0.field1169);
                        if (arg0.field1202 > 0 && var10.field2180 == 0) {
                            arg0.field1201++;
                            break label410;
                        }
                        if (arg0.field1202 <= 0 && var10.field2181 == 0) {
                            arg0.field1201++;
                            break label410;
                        }
                    }
                    int var11 = arg0.field1172;
                    int var12 = arg0.field1155;
                    int var13 = arg0.field1198[arg0.field1197 - 1] * 128 + arg0.field1191 * 64;
                    int var14 = arg0.field1199[arg0.field1197 - 1] * 128 + arg0.field1191 * 64;
                    if (var11 < var13) {
                        if (var12 < var14) {
                            arg0.field1194 = 1280;
                        } else if (var12 > var14) {
                            arg0.field1194 = 1792;
                        } else {
                            arg0.field1194 = 1536;
                        }
                    } else if (var11 > var13) {
                        if (var12 < var14) {
                            arg0.field1194 = 768;
                        } else if (var12 > var14) {
                            arg0.field1194 = 256;
                        } else {
                            arg0.field1194 = 512;
                        }
                    } else if (var12 < var14) {
                        arg0.field1194 = 1024;
                    } else if (var12 > var14) {
                        arg0.field1194 = 0;
                    }
                    class193 var15 = arg0.field1145[arg0.field1197 - 1];
                    if (var13 - var11 <= 256 && var13 - var11 >= -256 && var14 - var12 <= 256 && var14 - var12 >= -256) {
                        int var16 = arg0.field1194 - arg0.field1161 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field1129;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field1136;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field1139;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field1138;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field1136;
                        }
                        arg0.field1156 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class92) {
                            var19 = ((class92) arg0).field1261.field1926;
                        }
                        if (var19) {
                            if (arg0.field1194 != arg0.field1161 && arg0.field1131 == -1 && arg0.field1181 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field1197 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field1197 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field1201 > 0 && arg0.field1197 > 1) {
                                var18 = 8;
                                arg0.field1201--;
                            }
                        } else {
                            if (arg0.field1197 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field1197 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field1201 > 0 && arg0.field1197 > 1) {
                                var18 = 8;
                                arg0.field1201--;
                            }
                        }
                        if (class193.field2208 == var15) {
                            var18 <<= 0x1;
                        } else if (class193.field2210 == var15) {
                            var18 >>= 0x1;
                        }
                        if (var18 >= 8) {
                            if (arg0.field1156 == arg0.field1136 && arg0.field1140 != -1) {
                                arg0.field1156 = arg0.field1140;
                            } else if (arg0.field1156 == arg0.field1129 && arg0.field1141 != -1) {
                                arg0.field1156 = arg0.field1141;
                            } else if (arg0.field1156 == arg0.field1138 && arg0.field1142 != -1) {
                                arg0.field1156 = arg0.field1142;
                            } else if (arg0.field1156 == arg0.field1139 && arg0.field1150 != -1) {
                                arg0.field1156 = arg0.field1150;
                            }
                        } else if (var18 <= 1) {
                            if (arg0.field1156 == arg0.field1136 && arg0.field1144 != -1) {
                                arg0.field1156 = arg0.field1144;
                            } else if (arg0.field1156 == arg0.field1129 && arg0.field1171 != -1) {
                                arg0.field1156 = arg0.field1171;
                            } else if (arg0.field1156 == arg0.field1138 && arg0.field1146 != -1) {
                                arg0.field1156 = arg0.field1146;
                            } else if (arg0.field1156 == arg0.field1139 && arg0.field1151 != -1) {
                                arg0.field1156 = arg0.field1151;
                            }
                        }
                        if (var11 != var13 || var12 != var14) {
                            if (var11 < var13) {
                                arg0.field1172 += var18;
                                if (arg0.field1172 > var13) {
                                    arg0.field1172 = var13;
                                }
                            } else if (var11 > var13) {
                                arg0.field1172 -= var18;
                                if (arg0.field1172 < var13) {
                                    arg0.field1172 = var13;
                                }
                            }
                            if (var12 < var14) {
                                arg0.field1155 += var18;
                                if (arg0.field1155 > var14) {
                                    arg0.field1155 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field1155 -= var18;
                                if (arg0.field1155 < var14) {
                                    arg0.field1155 = var14;
                                }
                            }
                        }
                        if (arg0.field1172 == var13 && arg0.field1155 == var14) {
                            arg0.field1197--;
                            if (arg0.field1202 > 0) {
                                arg0.field1202--;
                            }
                        }
                    } else {
                        arg0.field1172 = var13;
                        arg0.field1155 = var14;
                        arg0.field1197--;
                        if (arg0.field1202 > 0) {
                            arg0.field1202--;
                        }
                    }
                }
            }
        }
        if (arg0.field1172 < 128 || arg0.field1155 < 128 || arg0.field1172 >= 13184 || arg0.field1155 >= 13184) {
            arg0.field1169 = -1;
            arg0.field1174 = -1;
            arg0.field1183 = 0;
            arg0.field1184 = 0;
            arg0.field1172 = arg0.field1198[0] * 128 + arg0.field1191 * 64;
            arg0.field1155 = arg0.field1199[0] * 128 + arg0.field1191 * 64;
            arg0.method2033();
        }
        if (Statics.field454 == arg0 && (arg0.field1172 < 1536 || arg0.field1155 < 1536 || arg0.field1172 >= 11776 || arg0.field1155 >= 11776)) {
            arg0.field1169 = -1;
            arg0.field1174 = -1;
            arg0.field1183 = 0;
            arg0.field1184 = 0;
            arg0.field1172 = arg0.field1198[0] * 128 + arg0.field1191 * 64;
            arg0.field1155 = arg0.field1199[0] * 128 + arg0.field1191 * 64;
            arg0.method2033();
        }
        if (arg0.field1181 != 0) {
            if (arg0.field1131 != -1) {
                class87 var20 = null;
                if (arg0.field1131 < 32768) {
                    var20 = field531[arg0.field1131];
                } else if (arg0.field1131 >= 32768) {
                    var20 = field604[arg0.field1131 - 32768];
                }
                if (var20 != null) {
                    int var21 = arg0.field1172 - var20.field1172;
                    int var22 = arg0.field1155 - var20.field1155;
                    if (var21 != 0 || var22 != 0) {
                        arg0.field1194 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1158) {
                    arg0.field1131 = -1;
                    arg0.field1158 = false;
                }
            }
            if (arg0.field1163 != -1 && (arg0.field1197 == 0 || arg0.field1201 > 0)) {
                arg0.field1194 = arg0.field1163;
                arg0.field1163 = -1;
            }
            int var23 = arg0.field1194 - arg0.field1161 & 0x7FF;
            if (var23 == 0 && arg0.field1158) {
                arg0.field1131 = -1;
                arg0.field1158 = false;
            }
            if (var23 == 0) {
                arg0.field1195 = 0;
            } else {
                arg0.field1195++;
                if (var23 > 1024) {
                    arg0.field1161 -= arg0.field1164 ? var23 : arg0.field1181;
                    boolean var24 = true;
                    if (var23 < arg0.field1181 || var23 > 2048 - arg0.field1181) {
                        arg0.field1161 = arg0.field1194;
                        var24 = false;
                    }
                    if (!arg0.field1164 && arg0.field1156 == arg0.field1133 && (arg0.field1195 > 25 || var24)) {
                        if (arg0.field1134 == -1) {
                            arg0.field1156 = arg0.field1136;
                        } else {
                            arg0.field1156 = arg0.field1134;
                        }
                    }
                } else {
                    arg0.field1161 += arg0.field1164 ? var23 : arg0.field1181;
                    boolean var25 = true;
                    if (var23 < arg0.field1181 || var23 > 2048 - arg0.field1181) {
                        arg0.field1161 = arg0.field1194;
                        var25 = false;
                    }
                    if (!arg0.field1164 && arg0.field1156 == arg0.field1133 && (arg0.field1195 > 25 || var25)) {
                        if (arg0.field1135 == -1) {
                            arg0.field1156 = arg0.field1136;
                        } else {
                            arg0.field1156 = arg0.field1135;
                        }
                    }
                }
                arg0.field1161 &= 0x7FF;
                arg0.field1164 = false;
            }
        }
        method4130(arg0);
    }

    @ObfuscatedName("bt.fq(Lcx;I)V")
    public static final void method992(class87 arg0) {
        int var1 = Math.max(1, arg0.field1183 - field487);
        int var2 = arg0.field1191 * 64 + arg0.field1179 * 128;
        int var3 = arg0.field1191 * 64 + arg0.field1128 * 128;
        arg0.field1172 += (var2 - arg0.field1172) / var1;
        arg0.field1155 += (var3 - arg0.field1155) / var1;
        arg0.field1201 = 0;
        arg0.field1194 = arg0.field1137;
    }

    @ObfuscatedName("hs.fg(Lcx;I)V")
    public static final void method4130(class87 arg0) {
        arg0.field1130 = false;
        if (arg0.field1156 != -1) {
            class190 var1 = class190.method5853(arg0.field1156);
            if (var1 == null) {
                arg0.field1156 = -1;
            } else if (!var1.method3388() && var1.field2167 != null) {
                arg0.field1167++;
                if (arg0.field1166 < var1.field2167.length && arg0.field1167 > var1.field2164[arg0.field1166]) {
                    arg0.field1167 = 1;
                    arg0.field1166++;
                    method4872(var1, arg0.field1166, arg0.field1172, arg0.field1155);
                }
                if (arg0.field1166 >= var1.field2167.length) {
                    if (var1.field2171 > 0) {
                        arg0.field1166 -= var1.field2171;
                        if (var1.field2179) {
                            arg0.field1168++;
                        }
                        if (arg0.field1166 < 0 || arg0.field1166 >= var1.field2167.length || var1.field2179 && arg0.field1168 >= var1.field2178) {
                            arg0.field1167 = 0;
                            arg0.field1166 = 0;
                            arg0.field1168 = 0;
                        }
                    } else {
                        arg0.field1167 = 0;
                        arg0.field1166 = 0;
                    }
                    method4872(var1, arg0.field1166, arg0.field1172, arg0.field1155);
                }
            } else if (var1.method3388()) {
                arg0.field1166++;
                int var2 = var1.method3392();
                if (arg0.field1166 < var2) {
                    method4473(var1, arg0.field1166, arg0.field1172, arg0.field1155);
                } else {
                    if (var1.field2171 > 0) {
                        arg0.field1166 -= var1.field2171;
                        if (var1.field2179) {
                            arg0.field1168++;
                        }
                        if (arg0.field1166 < 0 || arg0.field1166 >= var2 || var1.field2179 && arg0.field1168 >= var1.field2178) {
                            arg0.field1166 = 0;
                            arg0.field1167 = 0;
                            arg0.field1168 = 0;
                        }
                    } else {
                        arg0.field1167 = 0;
                        arg0.field1166 = 0;
                    }
                    method4473(var1, arg0.field1166, arg0.field1172, arg0.field1155);
                }
            } else {
                arg0.field1156 = -1;
            }
        }
        if (arg0.field1174 != -1 && field487 >= arg0.field1177) {
            if (arg0.field1175 < 0) {
                arg0.field1175 = 0;
            }
            int var3 = class180.method6177(arg0.field1174).field1961;
            if (var3 == -1) {
                arg0.field1174 = -1;
            } else {
                class190 var4 = class190.method5853(var3);
                if (var4 != null && var4.field2167 != null && !var4.method3388()) {
                    arg0.field1176++;
                    if (arg0.field1175 < var4.field2167.length && arg0.field1176 > var4.field2164[arg0.field1175]) {
                        arg0.field1176 = 1;
                        arg0.field1175++;
                        method4872(var4, arg0.field1175, arg0.field1172, arg0.field1155);
                    }
                    if (arg0.field1175 >= var4.field2167.length && (arg0.field1175 < 0 || arg0.field1175 >= var4.field2167.length)) {
                        arg0.field1174 = -1;
                    }
                } else if (var4.method3388()) {
                    arg0.field1175++;
                    int var5 = var4.method3392();
                    if (arg0.field1175 < var5) {
                        method4473(var4, arg0.field1175, arg0.field1172, arg0.field1155);
                    } else if (arg0.field1175 < 0 || arg0.field1175 >= var5) {
                        arg0.field1174 = -1;
                    }
                } else {
                    arg0.field1174 = -1;
                }
            }
        }
        if (arg0.field1169 != -1 && arg0.field1127 <= 1) {
            class190 var6 = class190.method5853(arg0.field1169);
            if (var6.field2180 == 1 && arg0.field1202 > 0 && arg0.field1183 <= field487 && arg0.field1184 < field487) {
                arg0.field1127 = 1;
                return;
            }
        }
        if (arg0.field1169 != -1 && arg0.field1127 == 0) {
            class190 var7 = class190.method5853(arg0.field1169);
            if (var7 == null) {
                arg0.field1169 = -1;
            } else if (!var7.method3388() && var7.field2167 != null) {
                arg0.field1200++;
                if (arg0.field1170 < var7.field2167.length && arg0.field1200 > var7.field2164[arg0.field1170]) {
                    arg0.field1200 = 1;
                    arg0.field1170++;
                    method4872(var7, arg0.field1170, arg0.field1172, arg0.field1155);
                }
                if (arg0.field1170 >= var7.field2167.length) {
                    arg0.field1170 -= var7.field2171;
                    arg0.field1173++;
                    if (arg0.field1173 >= var7.field2178) {
                        arg0.field1169 = -1;
                    } else if (arg0.field1170 >= 0 && arg0.field1170 < var7.field2167.length) {
                        method4872(var7, arg0.field1170, arg0.field1172, arg0.field1155);
                    } else {
                        arg0.field1169 = -1;
                    }
                }
                arg0.field1130 = var7.field2174;
            } else if (var7.method3388()) {
                arg0.field1170++;
                int var8 = var7.method3392();
                if (arg0.field1170 < var8) {
                    method4473(var7, arg0.field1170, arg0.field1172, arg0.field1155);
                } else {
                    arg0.field1170 -= var7.field2171;
                    arg0.field1173++;
                    if (arg0.field1173 >= var7.field2178) {
                        arg0.field1169 = -1;
                    } else if (arg0.field1170 >= 0 && arg0.field1170 < var8) {
                        method4473(var7, arg0.field1170, arg0.field1172, arg0.field1155);
                    } else {
                        arg0.field1169 = -1;
                    }
                }
            } else {
                arg0.field1169 = -1;
            }
        }
        if (arg0.field1127 > 0) {
            arg0.field1127--;
        }
    }

    @ObfuscatedName("k.fa(B)V")
    public static void method58() {
        if (Statics.field3026 != null) {
            Statics.field3026.method6459(Statics.field3173, (Statics.field454.field1172 >> 7) + Statics.field405, (Statics.field454.field1155 >> 7) + Statics.field31, false);
            Statics.field3026.method6475();
        }
    }

    @ObfuscatedName("kg.fx(Lcq;III)V")
    public static void method5117(class85 arg0, int arg1, int arg2) {
        if (arg0.field1169 == arg1 && arg1 != -1) {
            int var3 = class190.method5853(arg1).field2182;
            if (var3 == 1) {
                arg0.field1170 = 0;
                arg0.field1200 = 0;
                arg0.field1127 = arg2;
                arg0.field1173 = 0;
            }
            if (var3 == 2) {
                arg0.field1173 = 0;
            }
        } else if (arg1 == -1 || arg0.field1169 == -1 || class190.method5853(arg1).field2158 >= class190.method5853(arg0.field1169).field2158) {
            arg0.field1169 = arg1;
            arg0.field1170 = 0;
            arg0.field1200 = 0;
            arg0.field1127 = arg2;
            arg0.field1173 = 0;
            arg0.field1202 = arg0.field1197;
        }
    }

    @ObfuscatedName("g.fz(I)I")
    public static int method356() {
        return field545 ? 2 : 1;
    }

    @ObfuscatedName("eh.fw(II)V")
    public static void method2737(int arg0) {
        field707 = 0L;
        if (arg0 >= 2) {
            field545 = true;
        } else {
            field545 = false;
        }
        if (method356() == 1) {
            Statics.field3295.method408(765, 503);
        } else {
            Statics.field3295.method408(7680, 2160);
        }
        if (field505 < 25) {
            return;
        }
        class265 var1 = class265.method349(class263.field2991, field536.field1339);
        var1.field3039.method6912(method356());
        var1.field3039.method6913(Statics.field32);
        var1.field3039.method6913(Statics.field2650);
        field536.method2330(var1);
    }

    @ObfuscatedName("client.m(B)V")
    public final void method416() {
        field707 = class270.method3146() + 500L;
        this.method1214();
        if (field650 != -1) {
            this.method1030(true);
        }
    }

    @ObfuscatedName("client.fy(I)V")
    public void method1214() {
        int var1 = Statics.field32;
        int var2 = Statics.field2650;
        if (this.field206 < var1) {
            int var3 = this.field206;
        }
        if (this.field192 < var2) {
            int var4 = this.field192;
        }
        if (Statics.field4303 == null) {
            return;
        }
        try {
            client var5 = Statics.field3295;
            Object[] var6 = new Object[] { method356() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.fr(I)V")
    public final void method1327() {
        if (field650 != -1) {
            int var1 = field650;
            if (class295.method3187(var1)) {
                method4880(Statics.field4250[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field697; var2++) {
            if (field644[var2]) {
                field754[var2] = true;
            }
            field701[var2] = field644[var2];
            field644[var2] = false;
        }
        field698 = field487;
        field639 = -1;
        field640 = -1;
        Statics.field1571 = null;
        if (field650 != -1) {
            field697 = 0;
            method961(field650, 0, 0, Statics.field32, Statics.field2650, 0, 0, -1);
        }
        class453.method7237();
        if (field564) {
            if (field592 == 1) {
                Statics.field159[field591 / 100].method7352(field589 - 8, field521 - 8);
            }
            if (field592 == 2) {
                Statics.field159[field591 / 100 + 4].method7352(field589 - 8, field521 - 8);
            }
        }
        if (field664) {
            int var3 = Statics.field1775;
            int var4 = Statics.field2;
            int var5 = Statics.field1562;
            int var6 = Statics.field2669;
            int var7 = 6116423;
            class453.method7245(var3, var4, var5, var6, var7);
            class453.method7245(var3 + 1, var4 + 1, var5 - 2, 16, 0);
            class453.method7261(var3 + 1, var4 + 18, var5 - 2, var6 - 19, 0);
            Statics.field2706.method5725(class309.field3733, var3 + 3, var4 + 14, var7, -1);
            int var8 = class33.field220;
            int var9 = class33.field228;
            for (int var10 = 0; var10 < field626; var10++) {
                int var11 = (field626 - 1 - var10) * 15 + var4 + 31;
                int var12 = 16777215;
                if (var8 > var3 && var8 < var3 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
                    var12 = 16776960;
                }
                Statics.field2706.method5725(method958(var10), var3 + 3, var11, var12, 0);
            }
            int var13 = Statics.field1775;
            int var14 = Statics.field2;
            int var15 = Statics.field1562;
            int var16 = Statics.field2669;
            for (int var17 = 0; var17 < field697; var17++) {
                if (field704[var17] + field702[var17] > var13 && field702[var17] < var13 + var15 && field747[var17] + field509[var17] > var14 && field509[var17] < var14 + var16) {
                    field754[var17] = true;
                }
            }
        } else if (field639 != -1) {
            method347(field639, field640);
        }
        if (field706 == 3) {
            for (int var18 = 0; var18 < field697; var18++) {
                if (field701[var18]) {
                    class453.method7312(field702[var18], field509[var18], field704[var18], field747[var18], 16711935, 128);
                } else if (field754[var18]) {
                    class453.method7312(field702[var18], field509[var18], field704[var18], field747[var18], 16711680, 128);
                }
            }
        }
        class63.method40(Statics.field3173, Statics.field454.field1172, Statics.field454.field1155, field600);
        field600 = 0;
    }

    @ObfuscatedName("b.fv(Ljava/lang/String;ZI)V")
    public static final void method283(String arg0, boolean arg1) {
        if (!field603) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field250.method5731(arg0, 250);
        int var6 = Statics.field250.method5735(arg0, 250) * 13;
        class453.method7245(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class453.method7261(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field250.method5774(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method17(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field1490.method390(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field697; var11++) {
            if (field704[var11] + field702[var11] > var7 && field702[var11] < var7 + var9 && field747[var11] + field509[var11] > var8 && field509[var11] < var8 + var10) {
                field754[var11] = true;
            }
        }
    }

    @ObfuscatedName("bb.fi(IIIII)V")
    public static final void method988(int arg0, int arg1, int arg2, int arg3) {
        field586++;
        method5836();
        if (field546) {
            Statics.method75(Statics.field454, false);
        }
        method5657();
        method2650(true);
        method671();
        method2650(false);
        for (class70 var4 = (class70) field619.method5442(); var4 != null; var4 = (class70) field619.method5426()) {
            if (Statics.field3173 != var4.field930 || field487 > var4.field919) {
                var4.method6409();
            } else if (field487 >= var4.field918) {
                if (var4.field938 > 0) {
                    class92 var5 = field531[var4.field938 - 1];
                    if (var5 != null && var5.field1172 >= 0 && var5.field1172 < 13312 && var5.field1155 >= 0 && var5.field1155 < 13312) {
                        var4.method1820(var5.field1172, var5.field1155, method3277(var5.field1172, var5.field1155, var4.field930) - var4.field920, field487);
                    }
                }
                if (var4.field938 < 0) {
                    int var6 = -var4.field938 - 1;
                    class85 var7;
                    if (field763 == var6) {
                        var7 = Statics.field454;
                    } else {
                        var7 = field604[var6];
                    }
                    if (var7 != null && var7.field1172 >= 0 && var7.field1172 < 13312 && var7.field1155 >= 0 && var7.field1155 < 13312) {
                        var4.method1820(var7.field1172, var7.field1155, method3277(var7.field1172, var7.field1155, var4.field930) - var4.field920, field487);
                    }
                }
                var4.method1819(field600);
                Statics.field69.method3751(Statics.field3173, (int) var4.field924, (int) var4.field925, (int) var4.field926, 60, var4, var4.field932, -1L, false);
            }
        }
        for (class65 var8 = (class65) field620.method5442(); var8 != null; var8 = (class65) field620.method5426()) {
            if (Statics.field3173 != var8.field839 || var8.field846) {
                var8.method6409();
            } else if (field487 >= var8.field838) {
                var8.method1752(field600);
                if (var8.field846) {
                    var8.method6409();
                } else {
                    Statics.field69.method3751(var8.field839, var8.field840, var8.field837, var8.field842, 60, var8, 0, -1L, false);
                }
            }
        }
        method2656(arg0, arg1, arg2, arg3, true);
        int var9 = field752;
        int var10 = field753;
        int var11 = field705;
        int var12 = field755;
        class453.method7238(var9, var10, var9 + var11, var10 + var12);
        class201.method3640();
        int var13 = field557;
        if (field659 / 256 > var13) {
            var13 = field659 / 256;
        }
        if (field739[4] && field741[4] + 128 > var13) {
            var13 = field741[4] + 128;
        }
        int var14 = field558 & 0x7FF;
        int var15 = Statics.field2156;
        int var16 = Statics.field1892;
        int var17 = Statics.field4309;
        int var18 = method2052(var13);
        int var19 = method1526(var18, var12);
        int var20 = 2048 - var13 & 0x7FF;
        int var21 = 2048 - var14 & 0x7FF;
        int var22 = 0;
        int var23 = 0;
        int var24 = var19;
        if (var20 != 0) {
            int var25 = class201.field2346[var20];
            int var26 = class201.field2363[var20];
            int var27 = var23 * var26 - var19 * var25 >> 16;
            var24 = var23 * var25 + var19 * var26 >> 16;
            var23 = var27;
        }
        if (var21 != 0) {
            int var28 = class201.field2346[var21];
            int var29 = class201.field2363[var21];
            int var30 = var22 * var29 + var24 * var28 >> 16;
            var24 = var24 * var29 - var22 * var28 >> 16;
            var22 = var30;
        }
        if (field737) {
            Statics.field324 = var15 - var22;
            Statics.field4449 = var16 - var23;
            Statics.field4040 = var17 - var24;
            Statics.field1004 = var13;
            Statics.field3325 = var14;
        } else {
            Statics.field89 = var15 - var22;
            Statics.field2838 = var16 - var23;
            Statics.field3180 = var17 - var24;
            Statics.field1069 = var13;
            Statics.field1247 = var14;
        }
        if (field563 == 1 && field757 >= 2 && field487 % 50 == 0 && (Statics.field2156 >> 7 != Statics.field454.field1172 >> 7 || Statics.field4309 >> 7 != Statics.field454.field1155 >> 7)) {
            int var31 = Statics.field454.field1105;
            int var32 = (Statics.field2156 >> 7) + Statics.field405;
            int var33 = (Statics.field4309 >> 7) + Statics.field31;
            method74(var32, var33, var31, true);
        }
        int var34;
        if (field737) {
            var34 = Statics.method2651();
        } else {
            var34 = method2544();
        }
        int var35 = Statics.field89;
        int var36 = Statics.field2838;
        int var37 = Statics.field3180;
        int var38 = Statics.field1069;
        int var39 = Statics.field1247;
        for (int var40 = 0; var40 < 5; var40++) {
            if (field739[var40]) {
                int var41 = (int) (Math.random() * (double) (field740[var40] * 2 + 1) - (double) field740[var40] + Math.sin((double) field759[var40] / 100.0D * (double) field616[var40]) * (double) field741[var40]);
                if (var40 == 0) {
                    Statics.field89 += var41;
                }
                if (var40 == 1) {
                    Statics.field2838 += var41;
                }
                if (var40 == 2) {
                    Statics.field3180 += var41;
                }
                if (var40 == 3) {
                    Statics.field1247 = Statics.field1247 + var41 & 0x7FF;
                }
                if (var40 == 4) {
                    Statics.field1069 += var41;
                    if (Statics.field1069 < 128) {
                        Statics.field1069 = 128;
                    }
                    if (Statics.field1069 > 383) {
                        Statics.field1069 = 383;
                    }
                }
            }
        }
        int var42 = class33.field220;
        int var43 = class33.field228;
        if (class33.field227 != 0) {
            var42 = class33.field219;
            var43 = class33.field230;
        }
        if (var42 >= var9 && var42 < var9 + var11 && var43 >= var10 && var43 < var10 + var12) {
            class212.method5607(var42 - var9, var43 - var10);
        } else {
            class212.field2592 = false;
            class212.field2596 = 0;
        }
        Statics.method1976();
        class453.method7245(var9, var10, var11, var12, 0);
        Statics.method1976();
        int var44 = class201.field2349;
        class201.field2349 = field756;
        Statics.field69.method3749(Statics.field89, Statics.field2838, Statics.field3180, Statics.field1069, Statics.field1247, var34);
        class201.field2349 = var44;
        Statics.method1976();
        Statics.field69.method3723();
        field575 = 0;
        boolean var45 = false;
        int var46 = -1;
        int var47 = -1;
        int var48 = class97.field1301;
        int[] var49 = class97.field1302;
        for (int var50 = 0; var50 < field532 + var48; var50++) {
            class87 var51;
            if (var50 < var48) {
                var51 = field604[var49[var50]];
                if (field700 == var49[var50]) {
                    var45 = true;
                    var46 = var50;
                    continue;
                }
                if (Statics.field454 == var51) {
                    var47 = var50;
                    continue;
                }
            } else {
                var51 = field531[field533[var50 - var48]];
            }
            method2235(var51, var50, var9, var10, var11, var12);
        }
        if (field546 && var47 != -1) {
            method2235(Statics.field454, var47, var9, var10, var11, var12);
        }
        if (var45) {
            method2235(field604[field700], var46, var9, var10, var11, var12);
        }
        for (int var52 = 0; var52 < field575; var52++) {
            int var53 = field608[var52];
            int var54 = field666[var52];
            int var55 = field580[var52];
            int var56 = field579[var52];
            boolean var57 = true;
            while (var57) {
                var57 = false;
                for (int var58 = 0; var58 < var52; var58++) {
                    if (var54 + 2 > field666[var58] - field579[var58] && var54 - var56 < field666[var58] + 2 && var53 - var55 < field608[var58] + field580[var58] && var53 + var55 > field608[var58] - field580[var58] && field666[var58] - field579[var58] < var54) {
                        var54 = field666[var58] - field579[var58];
                        var57 = true;
                    }
                }
            }
            field541 = field608[var52];
            field588 = field666[var52] = var54;
            String var59 = field584[var52];
            if (field573 == 0) {
                int var60 = 16776960;
                if (field581[var52] < 6) {
                    var60 = field769[field581[var52]];
                }
                if (field581[var52] == 6) {
                    var60 = field586 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field581[var52] == 7) {
                    var60 = field586 % 20 < 10 ? 255 : 65535;
                }
                if (field581[var52] == 8) {
                    var60 = field586 % 20 < 10 ? 45056 : 8454016;
                }
                if (field581[var52] == 9) {
                    int var61 = 150 - field522[var52];
                    if (var61 < 50) {
                        var60 = var61 * 1280 + 16711680;
                    } else if (var61 < 100) {
                        var60 = 16776960 - (var61 - 50) * 327680;
                    } else if (var61 < 150) {
                        var60 = (var61 - 100) * 5 + 65280;
                    }
                }
                if (field581[var52] == 10) {
                    int var62 = 150 - field522[var52];
                    if (var62 < 50) {
                        var60 = var62 * 5 + 16711680;
                    } else if (var62 < 100) {
                        var60 = 16711935 - (var62 - 50) * 327680;
                    } else if (var62 < 150) {
                        var60 = (var62 - 100) * 327680 + 255 - (var62 - 100) * 5;
                    }
                }
                if (field581[var52] == 11) {
                    int var63 = 150 - field522[var52];
                    if (var63 < 50) {
                        var60 = 16777215 - var63 * 327685;
                    } else if (var63 < 100) {
                        var60 = (var63 - 50) * 327685 + 65280;
                    } else if (var63 < 150) {
                        var60 = 16777215 - (var63 - 100) * 327680;
                    }
                }
                if (field582[var52] == 0) {
                    Statics.field2706.method5719(var59, field541 + var9, field588 + var10, var60, 0);
                }
                if (field582[var52] == 1) {
                    Statics.field2706.method5720(var59, field541 + var9, field588 + var10, var60, 0, field586);
                }
                if (field582[var52] == 2) {
                    Statics.field2706.method5760(var59, field541 + var9, field588 + var10, var60, 0, field586);
                }
                if (field582[var52] == 3) {
                    Statics.field2706.method5723(var59, field541 + var9, field588 + var10, var60, 0, field586, 150 - field522[var52]);
                }
                if (field582[var52] == 4) {
                    int var64 = (150 - field522[var52]) * (Statics.field2706.method5716(var59) + 100) / 150;
                    class453.method7239(field541 + var9 - 50, var10, field541 + var9 + 50, var10 + var12);
                    Statics.field2706.method5725(var59, field541 + var9 + 50 - var64, field588 + var10, var60, 0);
                    class453.method7238(var9, var10, var9 + var11, var10 + var12);
                }
                if (field582[var52] == 5) {
                    int var65 = 150 - field522[var52];
                    int var66 = 0;
                    if (var65 < 25) {
                        var66 = var65 - 25;
                    } else if (var65 > 125) {
                        var66 = var65 - 125;
                    }
                    class453.method7239(var9, field588 + var10 - Statics.field2706.field4184 - 1, var9 + var11, field588 + var10 + 5);
                    Statics.field2706.method5719(var59, field541 + var9, field588 + var10 + var66, var60, 0);
                    class453.method7238(var9, var10, var9 + var11, var10 + var12);
                }
            } else {
                Statics.field2706.method5719(var59, field541 + var9, field588 + var10, 16776960, 0);
            }
        }
        method2476(var9, var10);
        ((class209) Statics.field2348).method3900(field600);
        method5097(var9, var10, var11, var12);
        Statics.field89 = var35;
        Statics.field2838 = var36;
        Statics.field3180 = var37;
        Statics.field1069 = var38;
        Statics.field1247 = var39;
        if (field486) {
            byte var67 = 0;
            int var68 = class317.field4025 + class317.field4022 + var67;
            if (var68 == 0) {
                field486 = false;
            }
        }
        if (field486) {
            class453.method7245(var9, var10, var11, var12, 0);
            method283(class309.field3627, false);
        }
    }

    @ObfuscatedName("ej.fe(IIIIZI)V")
    public static final void method2656(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field562;
        } else if (var5 >= 100) {
            var6 = field745;
        } else {
            var6 = (field745 - field562) * var5 / 100 + field562;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field750) {
            short var8 = field750;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field749) {
                var6 = field749;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class453.method7237();
                    class453.method7245(arg0, arg1, var10, arg3, -16777216);
                    class453.method7245(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field725) {
            short var11 = field725;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field748) {
                var6 = field748;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class453.method7237();
                    class453.method7245(arg0, arg1, arg2, var13, -16777216);
                    class453.method7245(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field756 = arg3 * var6 / 334;
        if (field705 != arg2 || field755 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method2052(var16);
                int var18 = class201.field2346[var16];
                int var19 = method1526(var17, arg3);
                var14[var15] = var18 * var19 >> 16;
            }
            class204.method3854(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field752 = arg0;
        field753 = arg1;
        field705 = arg2;
        field755 = arg3;
    }

    @ObfuscatedName("my.fn(I)V")
    public static void method5836() {
        if (Statics.field454.field1172 >> 7 == field726 && Statics.field454.field1155 >> 7 == field727) {
            field726 = 0;
        }
    }

    @ObfuscatedName("mb.fo(I)V")
    public static void method5657() {
        if (field700 >= 0 && field604[field700] != null) {
            Statics.method75(field604[field700], false);
        }
    }

    @ObfuscatedName("af.fj(I)V")
    public static void method671() {
        int var0 = class97.field1301;
        int[] var1 = class97.field1302;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field700 != var1[var2] && field763 != var1[var2]) {
                Statics.method75(field604[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ek.fh(ZS)V")
    public static final void method2650(boolean arg0) {
        for (int var1 = 0; var1 < field532; var1++) {
            class92 var2 = field531[field533[var1]];
            if (var2 != null && var2.method1993() && var2.field1261.field1932 == arg0 && var2.field1261.method3073()) {
                int var3 = var2.field1172 >> 7;
                int var4 = var2.field1155 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1191 == 1 && (var2.field1172 & 0x7F) == 64 && (var2.field1155 & 0x7F) == 64) {
                        if (field586 == field720[var3][var4]) {
                            continue;
                        }
                        field720[var3][var4] = field586;
                    }
                    long var5 = Statics.method3578(0, 0, 1, !var2.field1261.field1901, field533[var1]);
                    var2.field1147 = field487;
                    Statics.field69.method3751(Statics.field3173, var2.field1172, var2.field1155, method3277(var2.field1172 + (var2.field1191 * 64 - 64), var2.field1155 + (var2.field1191 * 64 - 64), Statics.field3173), var2.field1191 * 64 - 64 + 60, var2, var2.field1161, var5, var2.field1130);
                }
            }
        }
    }

    @ObfuscatedName("dg.fs(I)I")
    public static final int method2544() {
        if (Statics.field4303.method2091()) {
            return Statics.field3173;
        }
        int var0 = 3;
        if (Statics.field1069 < 310) {
            int var1;
            int var2;
            if (field563 == 1) {
                var1 = Statics.field2156 >> 7;
                var2 = Statics.field4309 >> 7;
            } else {
                var1 = Statics.field454.field1172 >> 7;
                var2 = Statics.field454.field1155 >> 7;
            }
            int var3 = Statics.field89 >> 7;
            int var4 = Statics.field3180 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field3173;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field3173;
            }
            if ((class75.field972[Statics.field3173][var3][var4] & 0x4) != 0) {
                var0 = Statics.field3173;
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
                    if ((class75.field972[Statics.field3173][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field3173;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class75.field972[Statics.field3173][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field3173;
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
                    if ((class75.field972[Statics.field3173][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field3173;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class75.field972[Statics.field3173][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field3173;
                        }
                    }
                }
            }
        }
        if (Statics.field454.field1172 >= 0 && Statics.field454.field1155 >= 0 && Statics.field454.field1172 < 13312 && Statics.field454.field1155 < 13312) {
            if ((class75.field972[Statics.field3173][Statics.field454.field1172 >> 7][Statics.field454.field1155 >> 7] & 0x4) != 0) {
                var0 = Statics.field3173;
            }
            return var0;
        } else {
            return Statics.field3173;
        }
    }

    @ObfuscatedName("do.gz(IIB)V")
    public static final void method2476(int arg0, int arg1) {
        if (field494 == 2) {
            method6207((field497 - Statics.field405 << 7) + field500, (field498 - Statics.field31 << 7) + field501, field499 * 2);
            if (field541 > -1 && field487 % 20 < 10) {
                Statics.field2772[0].method7352(field541 + arg0 - 12, field588 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("hg.gw(I)Z")
    public static boolean method4064() {
        return (field609 & 0x4) != 0;
    }

    @ObfuscatedName("af.gm(I)Z")
    public static boolean method696() {
        return (field609 & 0x1) != 0;
    }

    @ObfuscatedName("b.gu(B)Z")
    public static boolean method281() {
        return (field609 & 0x2) != 0;
    }

    @ObfuscatedName("av.gc(I)Z")
    public static boolean method382() {
        return (field609 & 0x8) != 0;
    }

    @ObfuscatedName("gl.gb(Lcq;I)Z")
    public static boolean method3457(class85 arg0) {
        if (field609 == 0) {
            return false;
        } else if (Statics.field454 == arg0) {
            return method382();
        } else {
            return method4064() || method696() && arg0.method1981() || method281() && arg0.method1984();
        }
    }

    @ObfuscatedName("cy.gj(Lcx;IIIIIB)V")
    public static final void method2235(class87 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1993()) {
            return;
        }
        if (arg0 instanceof class92) {
            class178 var6 = ((class92) arg0).field1261;
            if (var6.field1943 != null) {
                var6 = var6.method3101();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1301;
        int[] var8 = class97.field1302;
        byte var9 = 0;
        if (arg1 < var7 && field487 == arg0.field1147 && method3457((class85) arg0)) {
            class85 var10 = (class85) arg0;
            if (arg1 < var7) {
                method730(arg0, arg0.field1187 + 15);
                class351 var11 = (class351) field744.get(class418.field4581);
                byte var12 = 9;
                var11.method5719(var10.field1110.method7491(), field541 + arg2, field588 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field1160.method5480()) {
            method730(arg0, arg0.field1187 + 15);
            for (class91 var14 = (class91) arg0.field1160.method5482(); var14 != null; var14 = (class91) arg0.field1160.method5484()) {
                class88 var15 = var14.method2180(field487);
                if (var15 != null) {
                    class174 var16 = var14.field1256;
                    class457 var17 = var16.method3036();
                    class457 var18 = var16.method3035();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field1873;
                    } else {
                        if (var16.field1859 * 2 < var18.field4799) {
                            var19 = var16.field1859;
                        }
                        var20 = var18.field4799 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field487 - var15.field1206;
                    int var24 = var15.field1205 * var20 / var16.field1873;
                    int var27;
                    if (var15.field1207 > var23) {
                        int var25 = var16.field1868 == 0 ? 0 : var23 / var16.field1868 * var16.field1868;
                        int var26 = var15.field1204 * var20 / var16.field1873;
                        var27 = (var24 - var26) * var25 / var15.field1207 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1207 + var16.field1876 - var23;
                        if (var16.field1867 >= 0) {
                            var21 = (var28 << 8) / (var16.field1876 - var16.field1867);
                        }
                    }
                    if (var15.field1205 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field541 > -1) {
                            int var34 = field541 + arg2 - (var20 >> 1);
                            int var35 = field588 + arg3 - var13;
                            class453.method7245(var34, var35, var27, 5, 65280);
                            class453.method7245(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field4797;
                        var13 += var30;
                        int var31 = field541 + arg2 - (var20 >> 1);
                        int var32 = field588 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method7358(var33, var32, var21);
                            class453.method7239(var33, var32, var29 + var33, var30 + var32);
                            var18.method7358(var33, var32, var21);
                        } else {
                            var17.method7352(var33, var32);
                            class453.method7239(var33, var32, var29 + var33, var30 + var32);
                            var18.method7352(var33, var32);
                        }
                        class453.method7238(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method2183()) {
                    var14.method6409();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class85 var37 = (class85) arg0;
            if (var37.field1104) {
                return;
            }
            if (var37.field1093 != -1 || var37.field1086 != -1) {
                method730(arg0, arg0.field1187 + 15);
                if (field541 > -1) {
                    if (var37.field1093 != -1) {
                        var36 += 25;
                        Statics.field4344[var37.field1093].method7352(field541 + arg2 - 12, field588 + arg3 - var36);
                    }
                    if (var37.field1086 != -1) {
                        var36 += 25;
                        Statics.field3278[var37.field1086].method7352(field541 + arg2 - 12, field588 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field494 == 10 && field590 == var8[arg1]) {
                method730(arg0, arg0.field1187 + 15);
                if (field541 > -1) {
                    int var38 = Statics.field2772[1].field4797 + var36;
                    Statics.field2772[1].method7352(field541 + arg2 - 12, field588 + arg3 - var38);
                }
            }
        } else {
            class178 var39 = ((class92) arg0).field1261;
            if (var39.field1943 != null) {
                var39 = var39.method3101();
            }
            if (var39.field1937 >= 0 && var39.field1937 < Statics.field3278.length) {
                method730(arg0, arg0.field1187 + 15);
                if (field541 > -1) {
                    Statics.field3278[var39.field1937].method7352(field541 + arg2 - 12, field588 + arg3 - 30);
                }
            }
            if (field494 == 1 && field556 == field533[arg1 - var7] && field487 % 20 < 10) {
                method730(arg0, arg0.field1187 + 15);
                if (field541 > -1) {
                    Statics.field2772[0].method7352(field541 + arg2 - 12, field588 + arg3 - 28);
                }
            }
        }
        if (arg0.field1143 != null && (arg1 >= var7 || !arg0.field1165 && (field710 == 4 || !arg0.field1185 && (field710 == 0 || field710 == 3 || field710 == 1 && ((class85) arg0).method1981())))) {
            method730(arg0, arg0.field1187);
            if (field541 > -1 && field575 < field576) {
                field580[field575] = Statics.field2706.method5716(arg0.field1143) / 2;
                field579[field575] = Statics.field2706.field4184;
                field608[field575] = field541;
                field666[field575] = field588;
                field581[field575] = arg0.field1152;
                field582[field575] = arg0.field1153;
                field522[field575] = arg0.field1178;
                field584[field575] = arg0.field1143;
                field575++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field1157[var40];
            int var42 = arg0.field1148[var40];
            class186 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field487) {
                    continue;
                }
                var43 = class186.method2193(arg0.field1148[var40]);
                var44 = var43.field2020;
                if (var43 != null && var43.field2031 != null) {
                    var43 = var43.method3220();
                    if (var43 == null) {
                        arg0.field1157[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field1149[var40];
            class186 var46 = null;
            if (var45 >= 0) {
                var46 = class186.method2193(var45);
                if (var46 != null && var46.field2031 != null) {
                    var46 = var46.method3220();
                }
            }
            if (var41 - var44 <= field487) {
                if (var43 == null) {
                    arg0.field1157[var40] = -1;
                } else {
                    method730(arg0, arg0.field1187 / 2);
                    if (field541 > -1) {
                        boolean var47 = true;
                        if (var40 == 1) {
                            field588 -= 20;
                        }
                        if (var40 == 2) {
                            field541 -= 15;
                            field588 -= 10;
                        }
                        if (var40 == 3) {
                            field541 += 15;
                            field588 -= 10;
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
                        class457 var60 = null;
                        class457 var61 = null;
                        class457 var62 = null;
                        class457 var63 = null;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        class457 var73 = var43.method3214();
                        if (var73 != null) {
                            var52 = var73.field4799;
                            int var74 = var73.field4797;
                            if (var74 > var72) {
                                var72 = var74;
                            }
                            var56 = var73.field4795;
                        }
                        class457 var75 = var43.method3215();
                        if (var75 != null) {
                            var53 = var75.field4799;
                            int var76 = var75.field4797;
                            if (var76 > var72) {
                                var72 = var76;
                            }
                            var57 = var75.field4795;
                        }
                        class457 var77 = var43.method3219();
                        if (var77 != null) {
                            var54 = var77.field4799;
                            int var78 = var77.field4797;
                            if (var78 > var72) {
                                var72 = var78;
                            }
                            var58 = var77.field4795;
                        }
                        class457 var79 = var43.method3226();
                        if (var79 != null) {
                            var55 = var79.field4799;
                            int var80 = var79.field4797;
                            if (var80 > var72) {
                                var72 = var80;
                            }
                            var59 = var79.field4795;
                        }
                        if (var46 != null) {
                            var60 = var46.method3214();
                            if (var60 != null) {
                                var64 = var60.field4799;
                                int var81 = var60.field4797;
                                if (var81 > var72) {
                                    var72 = var81;
                                }
                                var68 = var60.field4795;
                            }
                            var61 = var46.method3215();
                            if (var61 != null) {
                                var65 = var61.field4799;
                                int var82 = var61.field4797;
                                if (var82 > var72) {
                                    var72 = var82;
                                }
                                var69 = var61.field4795;
                            }
                            var62 = var46.method3219();
                            if (var62 != null) {
                                var66 = var62.field4799;
                                int var83 = var62.field4797;
                                if (var83 > var72) {
                                    var72 = var83;
                                }
                                var70 = var62.field4795;
                            }
                            var63 = var46.method3226();
                            if (var63 != null) {
                                var67 = var63.field4799;
                                int var84 = var63.field4797;
                                if (var84 > var72) {
                                    var72 = var84;
                                }
                                var71 = var63.field4795;
                            }
                        }
                        class350 var85 = var43.method3218();
                        if (var85 == null) {
                            var85 = Statics.field3608;
                        }
                        class350 var86;
                        if (var46 == null) {
                            var86 = Statics.field3608;
                        } else {
                            var86 = var46.method3218();
                            if (var86 == null) {
                                var86 = Statics.field3608;
                            }
                        }
                        Object var87 = null;
                        String var88 = null;
                        boolean var89 = false;
                        int var90 = 0;
                        String var91 = var43.method3213(arg0.field1162[var40]);
                        int var92 = var85.method5716(var91);
                        if (var46 != null) {
                            var88 = var46.method3213(arg0.field1159[var40]);
                            var90 = var86.method5716(var88);
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
                        int var109 = arg0.field1157[var40] - field487;
                        int var110 = var43.field2016 - var43.field2016 * var109 / var43.field2020;
                        int var111 = var43.field2026 * var109 / var43.field2020 + -var43.field2026;
                        int var112 = field541 + arg2 - (var101 >> 1) + var110;
                        int var113 = field588 + arg3 - 12 + var111;
                        int var114 = var113;
                        int var115 = var72 + var113;
                        int var116 = var43.field2032 + var113 + 15;
                        int var117 = var116 - var85.field4182;
                        int var118 = var85.field4183 + var116;
                        if (var117 < var113) {
                            var114 = var117;
                        }
                        if (var118 > var115) {
                            var115 = var118;
                        }
                        int var119 = 0;
                        if (var46 != null) {
                            var119 = var46.field2032 + var113 + 15;
                            int var120 = var119 - var86.field4182;
                            int var121 = var86.field4183 + var119;
                            if (var120 < var114) {
                                ;
                            }
                            if (var121 > var115) {
                                ;
                            }
                        }
                        int var124 = 255;
                        if (var43.field2027 >= 0) {
                            var124 = (var109 << 8) / (var43.field2020 - var43.field2027);
                        }
                        if (var124 >= 0 && var124 < 255) {
                            if (var73 != null) {
                                var73.method7358(var96 + var112 - var56, var113, var124);
                            }
                            if (var77 != null) {
                                var77.method7358(var97 + var112 - var58, var113, var124);
                            }
                            if (var75 != null) {
                                for (int var125 = 0; var125 < var93; var125++) {
                                    var75.method7358(var53 * var125 + (var98 + var112 - var57), var113, var124);
                                }
                            }
                            if (var79 != null) {
                                var79.method7358(var102 + var112 - var59, var113, var124);
                            }
                            var85.method5717(var91, var99 + var112, var116, var43.field2019, 0, var124);
                            if (var46 != null) {
                                if (var60 != null) {
                                    var60.method7358(var103 + var112 - var68, var113, var124);
                                }
                                if (var62 != null) {
                                    var62.method7358(var104 + var112 - var70, var113, var124);
                                }
                                if (var61 != null) {
                                    for (int var126 = 0; var126 < var94; var126++) {
                                        var61.method7358(var65 * var126 + (var105 + var112 - var69), var113, var124);
                                    }
                                }
                                if (var63 != null) {
                                    var63.method7358(var106 + var112 - var71, var113, var124);
                                }
                                var86.method5717(var88, var107 + var112, var119, var46.field2019, 0, var124);
                            }
                        } else {
                            if (var73 != null) {
                                var73.method7352(var96 + var112 - var56, var113);
                            }
                            if (var77 != null) {
                                var77.method7352(var97 + var112 - var58, var113);
                            }
                            if (var75 != null) {
                                for (int var127 = 0; var127 < var93; var127++) {
                                    var75.method7352(var53 * var127 + (var98 + var112 - var57), var113);
                                }
                            }
                            if (var79 != null) {
                                var79.method7352(var102 + var112 - var59, var113);
                            }
                            var85.method5725(var91, var99 + var112, var116, var43.field2019 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var60 != null) {
                                    var60.method7352(var103 + var112 - var68, var113);
                                }
                                if (var62 != null) {
                                    var62.method7352(var104 + var112 - var70, var113);
                                }
                                if (var61 != null) {
                                    for (int var128 = 0; var128 < var94; var128++) {
                                        var61.method7352(var65 * var128 + (var105 + var112 - var69), var113);
                                    }
                                }
                                if (var63 != null) {
                                    var63.method7352(var106 + var112 - var71, var113);
                                }
                                var86.method5725(var88, var107 + var112, var119, var46.field2019 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kx.gh(IIIII)V")
    public static final void method5097(int arg0, int arg1, int arg2, int arg3) {
        field602 = 0;
        int var4 = (Statics.field454.field1172 >> 7) + Statics.field405;
        int var5 = (Statics.field454.field1155 >> 7) + Statics.field31;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field602 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field602 = 1;
        }
        if (field602 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field602 = 0;
        }
    }

    @ObfuscatedName("ap.gl(Lcx;II)V")
    public static final void method730(class87 arg0, int arg1) {
        method6207(arg0.field1172, arg0.field1155, arg1);
    }

    @ObfuscatedName("nh.gr(IIII)V")
    public static final void method6207(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field541 = -1;
            field588 = -1;
            return;
        }
        int var3 = method3277(arg0, arg1, Statics.field3173) - arg2;
        int var4 = arg0 - Statics.field89;
        int var5 = var3 - Statics.field2838;
        int var6 = arg1 - Statics.field3180;
        int var7 = class201.field2346[Statics.field1069];
        int var8 = class201.field2363[Statics.field1069];
        int var9 = class201.field2346[Statics.field1247];
        int var10 = class201.field2363[Statics.field1247];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field541 = field756 * var11 / var15 + field705 / 2;
            field588 = field756 * var14 / var15 + field755 / 2;
        } else {
            field541 = -1;
            field588 = -1;
        }
    }

    @ObfuscatedName("gc.gi(IIIB)I")
    public static final int method3277(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class75.field972[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class75.field985[var5][var3][var4] + class75.field985[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class75.field985[var5][var3][var4 + 1] + class75.field985[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bd.gs(III)I")
    public static int method1526(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field770 - field746) * var2 / 100 + field746;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("fm.gv(ZLqz;I)V")
    public static final void method3149(boolean arg0, class443 arg1) {
        field547 = arg0;
        if (!field547) {
            int var2 = arg1.method7120();
            int var3 = arg1.method6933();
            int var4 = arg1.method7120();
            Statics.field2673 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2673[var5][var6] = arg1.method6934();
                }
            }
            Statics.field4432 = new int[var4];
            Statics.field3978 = new int[var4];
            Statics.field3997 = new int[var4];
            Statics.field1719 = new byte[var4][];
            Statics.field1319 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field4432[var7] = var10;
                    Statics.field3978[var7] = Statics.field1493.method5269("m" + var8 + "_" + var9);
                    Statics.field3997[var7] = Statics.field1493.method5269("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method343(var3, var2, true);
            return;
        }
        boolean var11 = arg1.method7079() == 1;
        int var12 = arg1.method7120();
        int var13 = arg1.method6970();
        int var14 = arg1.method7120();
        arg1.method6876();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method6877(1);
                    if (var18 == 1) {
                        field516[var15][var16][var17] = arg1.method6877(26);
                    } else {
                        field516[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method6894();
        Statics.field2673 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field2673[var19][var20] = arg1.method6934();
            }
        }
        Statics.field4432 = new int[var14];
        Statics.field3978 = new int[var14];
        Statics.field3997 = new int[var14];
        Statics.field1719 = new byte[var14][];
        Statics.field1319 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field516[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field4432[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field4432[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field3978[var21] = Statics.field1493.method5269("m" + var30 + "_" + var31);
                            Statics.field3997[var21] = Statics.field1493.method5269("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method343(var13, var12, !var11);
    }

    @ObfuscatedName("j.gp(IIZB)V")
    public static final void method343(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field4197 == arg0 && Statics.field106 == arg1) {
            return;
        }
        Statics.field4197 = arg0;
        Statics.field106 = arg1;
        method20(25);
        method283(class309.field3627, true);
        int var3 = Statics.field405;
        int var4 = Statics.field31;
        Statics.field405 = (arg0 - 6) * 8;
        Statics.field31 = (arg1 - 6) * 8;
        int var5 = Statics.field405 - var3;
        int var6 = Statics.field31 - var4;
        int var7 = Statics.field405;
        int var8 = Statics.field31;
        for (int var9 = 0; var9 < 32768; var9++) {
            class92 var10 = field531[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1198[var11] -= var5;
                    var10.field1199[var11] -= var6;
                }
                var10.field1172 -= var5 * 128;
                var10.field1155 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class85 var13 = field604[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1198[var14] -= var5;
                    var13.field1199[var14] -= var6;
                }
                var13.field1172 -= var5 * 128;
                var13.field1155 -= var6 * 128;
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
                        field617[var25][var21][var22] = field617[var25][var23][var24];
                    } else {
                        field617[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class86 var26 = (class86) field618.method5442(); var26 != null; var26 = (class86) field618.method5426()) {
            var26.field1116 -= var5;
            var26.field1114 -= var6;
            if (var26.field1116 < 0 || var26.field1114 < 0 || var26.field1116 >= 104 || var26.field1114 >= 104) {
                var26.method6409();
            }
        }
        if (field726 != 0) {
            field726 -= var5;
            field727 -= var6;
        }
        field709 = 0;
        field737 = false;
        Statics.field89 -= var5 << 7;
        Statics.field3180 -= var6 << 7;
        Statics.field2156 -= var5 << 7;
        Statics.field4309 -= var6 << 7;
        field721 = -1;
        field620.method5438();
        field619.method5438();
        for (int var27 = 0; var27 < 4; var27++) {
            field597[var27].method3435();
        }
    }

    @ObfuscatedName("ed.gx(I)V")
    public static final void method2785() {
        Statics.method43(false);
        field671 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1719.length; var1++) {
            if (Statics.field3978[var1] != -1 && Statics.field1719[var1] == null) {
                Statics.field1719[var1] = Statics.field1493.method5179(Statics.field3978[var1], 0);
                if (Statics.field1719[var1] == null) {
                    var0 = false;
                    field671++;
                }
            }
            if (Statics.field3997[var1] != -1 && Statics.field1319[var1] == null) {
                Statics.field1319[var1] = Statics.field1493.method5180(Statics.field3997[var1], 0, Statics.field2673[var1]);
                if (Statics.field1319[var1] == null) {
                    var0 = false;
                    field671++;
                }
            }
        }
        if (!var0) {
            field540 = 1;
            return;
        }
        field645 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1719.length; var3++) {
            byte[] var4 = Statics.field1319[var3];
            if (var4 != null) {
                int var5 = (Statics.field4432[var3] >> 8) * 64 - Statics.field405;
                int var6 = (Statics.field4432[var3] & 0xFF) * 64 - Statics.field31;
                if (field547) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class75.method2739(var4, var5, var6);
            }
        }
        if (!var2) {
            field540 = 2;
            return;
        }
        if (field540 != 0) {
            method283(class309.field3627 + class93.field1272 + class93.field1269 + 100 + "%" + class93.field1270, true);
        }
        Statics.method1976();
        Statics.field69.method3709();
        for (int var7 = 0; var7 < 4; var7++) {
            field597[var7].method3435();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class75.field972[var8][var9][var10] = 0;
                }
            }
        }
        Statics.method1976();
        class75.method279();
        int var11 = Statics.field1719.length;
        class63.method1974();
        Statics.method43(true);
        if (!field547) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field4432[var12] >> 8) * 64 - Statics.field405;
                int var14 = (Statics.field4432[var12] & 0xFF) * 64 - Statics.field31;
                byte[] var15 = Statics.field1719[var12];
                if (var15 != null) {
                    Statics.method1976();
                    class75.method1846(var15, var13, var14, Statics.field4197 * 8 - 48, Statics.field106 * 8 - 48, field597);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field4432[var16] >> 8) * 64 - Statics.field405;
                int var18 = (Statics.field4432[var16] & 0xFF) * 64 - Statics.field31;
                byte[] var19 = Statics.field1719[var16];
                if (var19 == null && Statics.field106 < 800) {
                    Statics.method1976();
                    class75.method2626(var17, var18, 64, 64);
                }
            }
            Statics.method43(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field1319[var20];
                if (var21 != null) {
                    int var22 = (Statics.field4432[var20] >> 8) * 64 - Statics.field405;
                    int var23 = (Statics.field4432[var20] & 0xFF) * 64 - Statics.field31;
                    Statics.method1976();
                    class75.method152(var21, var22, var23, Statics.field69, field597);
                }
            }
        }
        if (field547) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.method1976();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field516[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field4432.length; var34++) {
                                if (Statics.field4432[var34] == var33 && Statics.field1719[var34] != null) {
                                    class75.method3320(Statics.field1719[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, field597);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            Statics.method6175(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = field516[0][var35][var36];
                    if (var37 == -1) {
                        class75.method2626(var35 * 8, var36 * 8, 8, 8);
                    }
                }
            }
            Statics.method43(true);
            for (int var38 = 0; var38 < 4; var38++) {
                Statics.method1976();
                for (int var39 = 0; var39 < 13; var39++) {
                    for (int var40 = 0; var40 < 13; var40++) {
                        int var41 = field516[var38][var39][var40];
                        if (var41 != -1) {
                            int var42 = var41 >> 24 & 0x3;
                            int var43 = var41 >> 1 & 0x3;
                            int var44 = var41 >> 14 & 0x3FF;
                            int var45 = var41 >> 3 & 0x7FF;
                            int var46 = (var44 / 8 << 8) + var45 / 8;
                            for (int var47 = 0; var47 < Statics.field4432.length; var47++) {
                                if (Statics.field4432[var47] == var46 && Statics.field1319[var47] != null) {
                                    class75.method1905(Statics.field1319[var47], var38, var39 * 8, var40 * 8, var42, (var44 & 0x7) * 8, (var45 & 0x7) * 8, var43, Statics.field69, field597);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        Statics.method43(true);
        Statics.method1976();
        class75.method6007(Statics.field69, field597);
        Statics.method43(true);
        int var48 = class75.field981;
        if (var48 > Statics.field3173) {
            var48 = Statics.field3173;
        }
        if (var48 < Statics.field3173 - 1) {
            int var49 = Statics.field3173 - 1;
        }
        if (field480) {
            Statics.field69.method3766(class75.field981);
        } else {
            Statics.field69.method3766(0);
        }
        for (int var50 = 0; var50 < 104; var50++) {
            for (int var51 = 0; var51 < 104; var51++) {
                method5882(var50, var51);
            }
        }
        Statics.method1976();
        method1964();
        class187.field2039.method4603();
        if (Statics.field3295.method438()) {
            class265 var52 = class265.method349(class263.field3013, field536.field1339);
            var52.field3039.method6915(1057001181);
            field536.method2330(var52);
        }
        if (!field547) {
            int var53 = (Statics.field4197 - 6) / 8;
            int var54 = (Statics.field4197 + 6) / 8;
            int var55 = (Statics.field106 - 6) / 8;
            int var56 = (Statics.field106 + 6) / 8;
            for (int var57 = var53 - 1; var57 <= var54 + 1; var57++) {
                for (int var58 = var55 - 1; var58 <= var56 + 1; var58++) {
                    if (var57 < var53 || var57 > var54 || var58 < var55 || var58 > var56) {
                        Statics.field1493.method5201("m" + var57 + "_" + var58);
                        Statics.field1493.method5201("l" + var57 + "_" + var58);
                    }
                }
            }
        }
        method20(30);
        Statics.method1976();
        class75.method2750();
        class265 var59 = class265.method349(class263.field2949, field536.field1339);
        field536.method2330(var59);
        class32.method1969();
    }

    @ObfuscatedName("dt.ga(IIIIII)V")
    public static final void method2589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field69.method3836(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field69.method3739(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field5.field4803;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class212.method4145(var5);
            class187 var17 = class187.method2907(var16);
            if (var17.field2065 == -1) {
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
                class456 var18 = Statics.field1495[var17.field2065];
                if (var18 != null) {
                    int var19 = (var17.field2051 * 4 - var18.field4790) / 2;
                    int var20 = (var17.field2052 * 4 - var18.field4787) / 2;
                    var18.method7323(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field2052) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field69.method3737(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field69.method3739(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class212.method4145(var21);
            class187 var27 = class187.method2907(var26);
            if (var27.field2065 != -1) {
                class456 var28 = Statics.field1495[var27.field2065];
                if (var28 != null) {
                    int var29 = (var27.field2051 * 4 - var28.field4790) / 2;
                    int var30 = (var27.field2052 * 4 - var28.field4787) / 2;
                    var28.method7323(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field2052) * 4 + 48 + var30);
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
                int[] var35 = Statics.field5.field4803;
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
        long var37 = Statics.field69.method3738(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class212.method4145(var37);
        class187 var40 = class187.method2907(var39);
        if (var40.field2065 == -1) {
            return;
        }
        class456 var41 = Statics.field1495[var40.field2065];
        if (var41 != null) {
            int var42 = (var40.field2051 * 4 - var41.field4790) / 2;
            int var43 = (var40.field2052 * 4 - var41.field4787) / 2;
            var41.method7323(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field2052) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.gg(Lcz;II)Z")
    public boolean method1024(class100 arg0, int arg1) {
        if (arg0.field1335 == 0) {
            Statics.field105 = null;
        } else {
            if (Statics.field105 == null) {
                Statics.field105 = new class368(Statics.field2008, Statics.field3295);
            }
            Statics.field105.method5940(arg0.field1333, arg1);
        }
        field686 = field675;
        Statics.field3301 = true;
        arg0.field1332 = null;
        return true;
    }

    @ObfuscatedName("client.go(Lcz;I)Z")
    public boolean method1366(class100 arg0) {
        if (Statics.field105 != null) {
            Statics.field105.method5943(arg0.field1333);
        }
        method2046();
        arg0.field1332 = null;
        return true;
    }

    @ObfuscatedName("client.gd(Lcz;S)Z")
    public final boolean method1026(class100 arg0) {
        class378 var2 = arg0.method2328();
        class443 var3 = arg0.field1333;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1332 == null) {
                if (arg0.field1336) {
                    if (!var2.method6108(1)) {
                        return false;
                    }
                    var2.method6122(arg0.field1333.field4707, 0, 1);
                    arg0.field1337 = 0;
                    arg0.field1336 = false;
                }
                var3.field4708 = 0;
                if (var3.method6873()) {
                    if (!var2.method6108(1)) {
                        return false;
                    }
                    var2.method6122(arg0.field1333.field4707, 1, 1);
                    arg0.field1337 = 0;
                }
                arg0.field1336 = true;
                class266[] var4 = class266.method1953();
                int var5 = var3.method6874();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4708);
                }
                arg0.field1332 = var4[var5];
                arg0.field1335 = arg0.field1332.field3122;
            }
            if (arg0.field1335 == -1) {
                if (!var2.method6108(1)) {
                    return false;
                }
                arg0.method2328().method6122(var3.field4707, 0, 1);
                arg0.field1335 = var3.field4707[0] & 0xFF;
            }
            if (arg0.field1335 == -2) {
                if (!var2.method6108(2)) {
                    return false;
                }
                arg0.method2328().method6122(var3.field4707, 0, 2);
                var3.field4708 = 0;
                arg0.field1335 = var3.method7120();
            }
            if (!var2.method6108(arg0.field1335)) {
                return false;
            }
            var3.field4708 = 0;
            var2.method6122(var3.field4707, 0, arg0.field1335);
            arg0.field1337 = 0;
            field539.method5856();
            arg0.field1331 = arg0.field1340;
            arg0.field1340 = arg0.field1338;
            arg0.field1338 = arg0.field1332;
            if (class266.field3061 == arg0.field1332) {
                int var6 = var3.method6929();
                if (var3.method6929() == 0) {
                    field577[var6] = new class325();
                    var3.field4708 += 18;
                } else {
                    var3.field4708--;
                    field577[var6] = new class325(var3, false);
                }
                field685 = field675;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3105 == arg0.field1332) {
                Statics.field4063.method1531(var3, arg0.field1335);
                field711 = field675;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3104 == arg0.field1332) {
                method2630(false, var3);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3146 == arg0.field1332) {
                int var7 = var3.method6963();
                int var8 = var3.method6947();
                int var9 = var3.method6947();
                if (var8 == 65535) {
                    var8 = -1;
                }
                class92 var10 = field531[var9];
                if (var10 != null) {
                    if (var10.field1169 == var8 && var8 != -1) {
                        int var11 = class190.method5853(var8).field2182;
                        if (var11 == 1) {
                            var10.field1170 = 0;
                            var10.field1200 = 0;
                            var10.field1127 = var7;
                            var10.field1173 = 0;
                        } else if (var11 == 2) {
                            var10.field1173 = 0;
                        }
                    } else if (var8 == -1 || var10.field1169 == -1 || class190.method5853(var8).field2158 >= class190.method5853(var10.field1169).field2158) {
                        var10.field1169 = var8;
                        var10.field1170 = 0;
                        var10.field1200 = 0;
                        var10.field1127 = var7;
                        var10.field1173 = 0;
                        var10.field1202 = var10.field1197;
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3056 == arg0.field1332) {
                int var12 = var3.method6929();
                int var13 = var3.method6929();
                int var14 = var3.method6929();
                int var15 = var3.method6929();
                field739[var12] = true;
                field740[var12] = var13;
                field741[var12] = var14;
                field759[var12] = var15;
                field616[var12] = 0;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3088 == arg0.field1332) {
                int var16 = var3.method6984();
                int var17 = var3.method7140();
                class295 var18 = class295.method3238(var16);
                if (var18.field3402 != var17 || var17 == -1) {
                    var18.field3402 = var17;
                    var18.field3435 = 0;
                    var18.field3497 = 0;
                    method2620(var18);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3103 == arg0.field1332) {
                int var19 = var3.method6983();
                class295 var20 = class295.method3238(var19);
                for (int var21 = 0; var21 < var20.field3492.length; var21++) {
                    var20.field3492[var21] = -1;
                    var20.field3492[var21] = 0;
                }
                method2620(var20);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3092 == arg0.field1332) {
                String var22 = var3.method6975();
                long var23 = (long) var3.method7120();
                long var25 = (long) var3.method7095();
                class311 var27 = (class311) class330.method525(class311.method4084(), var3.method6929());
                long var28 = (var23 << 32) + var25;
                boolean var30 = false;
                for (int var31 = 0; var31 < 100; var31++) {
                    if (field713[var31] == var28) {
                        var30 = true;
                        break;
                    }
                }
                if (Statics.field4063.method1550(new class465(var22, Statics.field2008))) {
                    var30 = true;
                }
                if (!var30 && field602 == 0) {
                    field713[field714] = var28;
                    field714 = (field714 + 1) % 100;
                    String var32 = class351.method5714(class344.method4457(class283.method4423(var3)));
                    byte var33;
                    if (var27.field3965) {
                        var33 = 7;
                    } else {
                        var33 = 3;
                    }
                    if (var27.field3950 == -1) {
                        class99.method2996(var33, var22, var32);
                    } else {
                        class99.method2996(var33, class93.method713(var27.field3950) + var22, var32);
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3132 == arg0.field1332) {
                int var34 = var3.method6934();
                int var35 = var3.method7120();
                if (var34 < -70000) {
                    var35 += 32768;
                }
                class295 var36;
                if (var34 >= 0) {
                    var36 = class295.method3238(var34);
                } else {
                    var36 = null;
                }
                if (var36 != null) {
                    for (int var37 = 0; var37 < var36.field3492.length; var37++) {
                        var36.field3492[var37] = 0;
                        var36.field3493[var37] = 0;
                    }
                }
                class78.method980(var35);
                int var38 = var3.method7120();
                for (int var39 = 0; var39 < var38; var39++) {
                    int var40 = var3.method6947();
                    int var41 = var3.method6963();
                    if (var41 == 255) {
                        var41 = var3.method6934();
                    }
                    if (var36 != null && var39 < var36.field3492.length) {
                        var36.field3492[var39] = var40;
                        var36.field3493[var39] = var41;
                    }
                    class78.method2667(var35, var39, var40 - 1, var41);
                }
                if (var36 != null) {
                    method2620(var36);
                }
                method5395();
                field491[++field679 - 1 & 0x1F] = var35 & 0x7FFF;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3080 == arg0.field1332) {
                Statics.field4063.field791.method5929(var3, arg0.field1335);
                method3188();
                field711 = field675;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3139 == arg0.field1332) {
                int var42 = var3.method7120();
                int var43 = var3.method6984();
                class289.field3314[var42] = var43;
                if (class289.field3313[var42] != var43) {
                    class289.field3313[var42] = var43;
                }
                method5095(var42);
                field676[++field649 - 1 & 0x1F] = var42;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3107 == arg0.field1332) {
                int var44 = var3.method7120();
                int var45 = var3.method6929();
                int var46 = var3.method7095();
                int var47 = var46 >> 16;
                int var48 = var46 >> 8 & 0xFF;
                int var49 = (var46 >> 4 & 0x7) + var47;
                int var50 = (var46 & 0x7) + var48;
                int var51 = var3.method7120();
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    int var52 = var49 * 128 + 64;
                    int var53 = var50 * 128 + 64;
                    class65 var54 = new class65(var51, Statics.field3173, var52, var53, method3277(var52, var53, Statics.field3173) - var45, var44, field487);
                    field620.method5425(var54);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3095 == arg0.field1332) {
                method2630(true, var3);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3121 == arg0.field1332) {
                int var55 = var3.method6933();
                Statics.method386(var55);
                field491[++field679 - 1 & 0x1F] = var55 & 0x7FFF;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3127 == arg0.field1332) {
                field737 = false;
                for (int var56 = 0; var56 < 5; var56++) {
                    field739[var56] = false;
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3053 == arg0.field1332) {
                byte var57 = var3.method6930();
                String var58 = var3.method6975();
                long var59 = (long) var3.method7120();
                long var61 = (long) var3.method7095();
                class311 var63 = (class311) class330.method525(class311.method4084(), var3.method6929());
                long var64 = (var59 << 32) + var61;
                boolean var66 = false;
                Object var67 = null;
                class149 var68 = var57 >= 0 ? field678[var57] : Statics.field4039;
                if (var68 == null) {
                    var66 = true;
                } else {
                    int var69 = 0;
                    while (true) {
                        if (var69 >= 100) {
                            if (var63.field3952 && Statics.field4063.method1550(new class465(var58, Statics.field2008))) {
                                var66 = true;
                            }
                            break;
                        }
                        if (field713[var69] == var64) {
                            var66 = true;
                            break;
                        }
                        var69++;
                    }
                }
                if (!var66) {
                    field713[field714] = var64;
                    field714 = (field714 + 1) % 100;
                    String var70 = class351.method5714(class283.method4423(var3));
                    int var71 = var57 >= 0 ? 41 : 44;
                    if (var63.field3950 == -1) {
                        class99.method2914(var71, var58, var70, var68.field1668);
                    } else {
                        class99.method2914(var71, class93.method713(var63.field3950) + var58, var70, var68.field1668);
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3126 == arg0.field1332 && field737) {
                field519 = true;
                Statics.field3187 = var3.method6929();
                Statics.field2760 = var3.method6929();
                Statics.field114 = var3.method6929();
                Statics.field97 = var3.method6929();
                for (int var72 = 0; var72 < 5; var72++) {
                    field739[var72] = false;
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3072 == arg0.field1332) {
                return this.method1024(arg0, 2);
            }
            if (class266.field3106 == arg0.field1332) {
                int var73 = var3.method7006();
                int var74 = var3.method7120();
                class295 var75 = class295.method3238(var73);
                if (var75.field3424 != 2 || var75.field3403 != var74) {
                    var75.field3424 = 2;
                    var75.field3403 = var74;
                    method2620(var75);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3148 == arg0.field1332) {
                byte[] var76 = new byte[arg0.field1335];
                var3.method6875(var76, 0, var76.length);
                class444 var77 = new class444(var76);
                String var78 = var77.method6975();
                class30.method6381(var78, true, false);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3051 == arg0.field1332) {
                int var79 = var3.method6934();
                int var80 = var3.method6934();
                int var81 = class32.method350();
                class265 var82 = class265.method349(class263.field2992, field536.field1339);
                var82.field3039.method6949(var81);
                var82.field3039.method6966(var79);
                var82.field3039.method6979(var80);
                var82.field3039.method6912(field207);
                field536.method2330(var82);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3102 == arg0.field1332) {
                field737 = true;
                field519 = false;
                Statics.field3614 = var3.method6929();
                Statics.field173 = var3.method6929();
                Statics.field1806 = var3.method7120();
                Statics.field114 = var3.method6929();
                Statics.field97 = var3.method6929();
                if (Statics.field97 >= 100) {
                    int var83 = Statics.field3614 * 128 + 64;
                    int var84 = Statics.field173 * 128 + 64;
                    int var85 = method3277(var83, var84, Statics.field3173) - Statics.field1806;
                    int var86 = var83 - Statics.field89;
                    int var87 = var85 - Statics.field2838;
                    int var88 = var84 - Statics.field3180;
                    int var89 = (int) Math.sqrt((double) (var86 * var86 + var88 * var88));
                    Statics.field1069 = (int) (Math.atan2((double) var87, (double) var89) * 325.9490051269531D) & 0x7FF;
                    Statics.field1247 = (int) (Math.atan2((double) var86, (double) var88) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1069 < 128) {
                        Statics.field1069 = 128;
                    }
                    if (Statics.field1069 > 383) {
                        Statics.field1069 = 383;
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3114 == arg0.field1332) {
                for (int var90 = 0; var90 < Statics.field1810; var90++) {
                    class170 var91 = Statics.method1949(var90);
                    if (var91 != null) {
                        class289.field3314[var90] = 0;
                        class289.field3313[var90] = 0;
                    }
                }
                method5395();
                field649 += 32;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3091 == arg0.field1332) {
                int var92 = var3.method7079();
                int var93 = var3.method7079() * 4;
                int var94 = var3.method7004();
                int var95 = var3.method6970();
                int var96 = var3.method6933();
                int var97 = var3.method6929() * 4;
                byte var98 = var3.method6965();
                int var99 = var3.method7001();
                int var100 = var3.method6978();
                int var101 = var100 >> 16;
                int var102 = var100 >> 8 & 0xFF;
                int var103 = (var100 >> 4 & 0x7) + var101;
                int var104 = (var100 & 0x7) + var102;
                byte var105 = var3.method6951();
                int var106 = var3.method6970();
                int var107 = var103 + var105;
                int var108 = var98 + var104;
                if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var96 != 65535) {
                    int var109 = var103 * 128 + 64;
                    int var110 = var104 * 128 + 64;
                    int var111 = var107 * 128 + 64;
                    int var112 = var108 * 128 + 64;
                    class70 var113 = new class70(var96, Statics.field3173, var109, var110, method3277(var109, var110, Statics.field3173) - var97, field487 + var106, field487 + var95, var99, var92, var94, var93);
                    var113.method1820(var111, var112, method3277(var111, var112, Statics.field3173) - var93, field487 + var106);
                    field619.method5425(var113);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3085 == arg0.field1332) {
                class97.method1766(var3, arg0.field1335);
                method4472();
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3076 == arg0.field1332) {
                int var114 = var3.method6947();
                int var115 = var3.method6984();
                int var116 = var3.method6947();
                class295 var117 = class295.method3238(var115);
                var117.field3415 = (var116 << 16) + var114;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3135 == arg0.field1332) {
                int var118 = var3.method6934();
                int var119 = var3.method6970();
                int var120 = var119 >> 10 & 0x1F;
                int var121 = var119 >> 5 & 0x1F;
                int var122 = var119 & 0x1F;
                int var123 = (var122 << 3) + (var120 << 19) + (var121 << 11);
                class295 var124 = class295.method3238(var118);
                if (var124.field3383 != var123) {
                    var124.field3383 = var123;
                    method2620(var124);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3062 == arg0.field1332) {
                byte var125 = var3.method6930();
                long var126 = (long) var3.method7120();
                long var128 = (long) var3.method7095();
                long var130 = (var126 << 32) + var128;
                boolean var132 = false;
                class149 var133 = var125 >= 0 ? field678[var125] : Statics.field4039;
                if (var133 == null) {
                    var132 = true;
                } else {
                    for (int var134 = 0; var134 < 100; var134++) {
                        if (field713[var134] == var130) {
                            var132 = true;
                            break;
                        }
                    }
                }
                if (!var132) {
                    field713[field714] = var130;
                    field714 = (field714 + 1) % 100;
                    String var135 = class283.method4423(var3);
                    int var136 = var125 >= 0 ? 43 : 46;
                    class99.method2914(var136, "", var135, var133.field1668);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3118 == arg0.field1332) {
                return this.method1024(arg0, 1);
            }
            if (class266.field3108 == arg0.field1332) {
                field688 = field675;
                byte var137 = var3.method6930();
                class146 var138 = new class146(var3);
                class149 var139;
                if (var137 >= 0) {
                    var139 = field678[var137];
                } else {
                    var139 = Statics.field4039;
                }
                var138.method2754(var139);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3115 == arg0.field1332) {
                Statics.field2197 = var3.method6929();
                Statics.field1594 = var3.method7001();
                for (int var140 = Statics.field2197; var140 < Statics.field2197 + 8; var140++) {
                    for (int var141 = Statics.field1594; var141 < Statics.field1594 + 8; var141++) {
                        if (field617[Statics.field3173][var140][var141] != null) {
                            field617[Statics.field3173][var140][var141] = null;
                            method5882(var140, var141);
                        }
                    }
                }
                for (class86 var142 = (class86) field618.method5442(); var142 != null; var142 = (class86) field618.method5426()) {
                    if (var142.field1116 >= Statics.field2197 && var142.field1116 < Statics.field2197 + 8 && var142.field1114 >= Statics.field1594 && var142.field1114 < Statics.field1594 + 8 && Statics.field3173 == var142.field1117) {
                        var142.field1125 = 0;
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3147 == arg0.field1332) {
                method5395();
                field657 = var3.method6929();
                field691 = field675;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3081 == arg0.field1332) {
                Statics.field3319 = null;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3047 == arg0.field1332) {
                Statics.field3943 = true;
                method2630(false, var3);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3133 == arg0.field1332) {
                method4066();
                byte var143 = var3.method6930();
                if (arg0.field1335 == 1) {
                    if (var143 >= 0) {
                        field719[var143] = null;
                    } else {
                        Statics.field4591 = null;
                    }
                    arg0.field1332 = null;
                    return true;
                }
                if (var143 >= 0) {
                    field719[var143] = new class140(var3);
                } else {
                    Statics.field4591 = new class140(var3);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3137 == arg0.field1332) {
                if (field650 != -1) {
                    method4070(field650, 0);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3124 == arg0.field1332) {
                field728 = var3.method6929();
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3119 == arg0.field1332) {
                int var144 = var3.method6929();
                method2200(var144);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3065 == arg0.field1332) {
                method5093(class264.field3030);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3109 == arg0.field1332) {
                method5093(class264.field3027);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3111 == arg0.field1332) {
                int var145 = var3.method6984();
                int var146 = var3.method7120();
                class295 var147 = class295.method3238(var145);
                if (var147 != null && var147.field3360 == 0) {
                    if (var146 > var147.field3382 - var147.field3427) {
                        var146 = var147.field3382 - var147.field3427;
                    }
                    if (var146 < 0) {
                        var146 = 0;
                    }
                    if (var147.field3380 != var146) {
                        var147.field3380 = var146;
                        method2620(var147);
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3074 == arg0.field1332) {
                int var148 = var3.method6970();
                field650 = var148;
                this.method1030(false);
                Statics.method2329(var148);
                class64.method4878(field650);
                for (int var149 = 0; var149 < 100; var149++) {
                    field644[var149] = true;
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3057 == arg0.field1332) {
                method5093(class264.field3034);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3150 == arg0.field1332) {
                boolean var150 = var3.method6937();
                if (!var150) {
                    Statics.field4165 = null;
                } else if (Statics.field4165 == null) {
                    Statics.field4165 = new class327();
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3128 == arg0.field1332) {
                method5093(class264.field3029);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3087 == arg0.field1332) {
                method5093(class264.field3032);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3086 == arg0.field1332) {
                field493 = var3.method6947() * 30;
                field691 = field675;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3130 == arg0.field1332) {
                int var151 = var3.method6934();
                class80 var152 = (class80) field651.method6695((long) var151);
                if (var152 != null) {
                    Statics.method387(var152, true);
                }
                if (field611 != null) {
                    method2620(field611);
                    field611 = null;
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3123 == arg0.field1332) {
                for (int var153 = 0; var153 < field604.length; var153++) {
                    if (field604[var153] != null) {
                        field604[var153].field1169 = -1;
                    }
                }
                for (int var154 = 0; var154 < field531.length; var154++) {
                    if (field531[var154] != null) {
                        field531[var154].field1169 = -1;
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3059 == arg0.field1332) {
                method5093(class264.field3035);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3054 == arg0.field1332) {
                int var155 = arg0.field1335 + var3.field4708;
                int var156 = var3.method7120();
                int var157 = var3.method7120();
                if (field650 != var156) {
                    field650 = var156;
                    this.method1030(false);
                    Statics.method2329(field650);
                    class64.method4878(field650);
                    for (int var158 = 0; var158 < 100; var158++) {
                        field644[var158] = true;
                    }
                }
                while (var157-- > 0) {
                    int var159 = var3.method6934();
                    int var160 = var3.method7120();
                    int var161 = var3.method6929();
                    class80 var162 = (class80) field651.method6695((long) var159);
                    if (var162 != null && var162.field1026 != var160) {
                        Statics.method387(var162, true);
                        var162 = null;
                    }
                    if (var162 == null) {
                        var162 = method925(var159, var160, var161);
                    }
                    var162.field1023 = true;
                }
                for (class80 var163 = (class80) field651.method6694(); var163 != null; var163 = (class80) field651.method6681()) {
                    if (var163.field1023) {
                        var163.field1023 = false;
                    } else {
                        Statics.method387(var163, true);
                    }
                }
                field696 = new class421(512);
                while (var3.field4708 < var155) {
                    int var164 = var3.method6934();
                    int var165 = var3.method7120();
                    int var166 = var3.method7120();
                    int var167 = var3.method6934();
                    for (int var168 = var165; var168 <= var166; var168++) {
                        long var169 = ((long) var164 << 32) + (long) var168;
                        field696.method6683(new class410(var167), var169);
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3145 == arg0.field1332) {
                int var171 = var3.method7120();
                int var172 = var3.method7001();
                int var173 = var3.method6934();
                class80 var174 = (class80) field651.method6695((long) var173);
                if (var174 != null) {
                    Statics.method387(var174, var174.field1026 != var171);
                }
                method925(var173, var171, var172);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3136 == arg0.field1332) {
                if (Statics.field3319 == null) {
                    Statics.field3319 = new class393(Statics.field4384);
                }
                class452 var175 = Statics.field4384.method6349(var3);
                Statics.field3319.field4430.method6701(var175.field4770, var175.field4769);
                field682[++field683 - 1 & 0x1F] = var175.field4770;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3073 == arg0.field1332) {
                var3.field4708 += 28;
                if (var3.method6957()) {
                    method2646(var3, var3.field4708 - 28);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3138 == arg0.field1332) {
                int var176 = var3.method6934();
                int var177 = var3.method7120();
                if (var176 < -70000) {
                    var177 += 32768;
                }
                class295 var178;
                if (var176 >= 0) {
                    var178 = class295.method3238(var176);
                } else {
                    var178 = null;
                }
                while (var3.field4708 < arg0.field1335) {
                    int var179 = var3.method6944();
                    int var180 = var3.method7120();
                    int var181 = 0;
                    if (var180 != 0) {
                        var181 = var3.method6929();
                        if (var181 == 255) {
                            var181 = var3.method6934();
                        }
                    }
                    if (var178 != null && var179 >= 0 && var179 < var178.field3492.length) {
                        var178.field3492[var179] = var180;
                        var178.field3493[var179] = var181;
                    }
                    class78.method2667(var177, var179, var180 - 1, var181);
                }
                if (var178 != null) {
                    method2620(var178);
                }
                method5395();
                field491[++field679 - 1 & 0x1F] = var177 & 0x7FFF;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3120 == arg0.field1332) {
                method2411();
                arg0.field1332 = null;
                return false;
            }
            if (class266.field3071 == arg0.field1332) {
                int var182 = var3.method6944();
                boolean var183 = var3.method6929() == 1;
                String var184 = "";
                boolean var185 = false;
                if (var183) {
                    var184 = var3.method6975();
                    if (Statics.field4063.method1550(new class465(var184, Statics.field2008))) {
                        var185 = true;
                    }
                }
                String var186 = var3.method6975();
                if (!var185) {
                    class99.method2996(var182, var184, var186);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3117 == arg0.field1332) {
                field726 = var3.method6929();
                if (field726 == 255) {
                    field726 = 0;
                }
                field727 = var3.method6929();
                if (field727 == 255) {
                    field727 = 0;
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3048 == arg0.field1332) {
                for (int var187 = 0; var187 < class289.field3313.length; var187++) {
                    if (class289.field3314[var187] != class289.field3313[var187]) {
                        class289.field3313[var187] = class289.field3314[var187];
                        method5095(var187);
                        field676[++field649 - 1 & 0x1F] = var187;
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3098 == arg0.field1332) {
                int var188 = var3.method6934();
                if (field622 != var188) {
                    field622 = var188;
                    method2320();
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3141 == arg0.field1332) {
                return this.method1366(arg0);
            }
            if (class266.field3149 == arg0.field1332) {
                String var189 = var3.method6975();
                long var190 = var3.method6935();
                long var192 = (long) var3.method7120();
                long var194 = (long) var3.method7095();
                class311 var196 = (class311) class330.method525(class311.method4084(), var3.method6929());
                long var197 = (var192 << 32) + var194;
                boolean var199 = false;
                for (int var200 = 0; var200 < 100; var200++) {
                    if (field713[var200] == var197) {
                        var199 = true;
                        break;
                    }
                }
                if (var196.field3952 && Statics.field4063.method1550(new class465(var189, Statics.field2008))) {
                    var199 = true;
                }
                if (!var199 && field602 == 0) {
                    field713[field714] = var197;
                    field714 = (field714 + 1) % 100;
                    String var201 = class351.method5714(class344.method4457(class283.method4423(var3)));
                    if (var196.field3950 == -1) {
                        class99.method2914(9, var189, var201, class346.method4871(var190));
                    } else {
                        class99.method2914(9, class93.method713(var196.field3950) + var189, var201, class346.method4871(var190));
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3144 == arg0.field1332) {
                class34.method4633(var3, arg0.field1335);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3096 == arg0.field1332) {
                String var202 = var3.method6975();
                Object[] var203 = new Object[var202.length() + 1];
                for (int var204 = var202.length() - 1; var204 >= 0; var204--) {
                    if (var202.charAt(var204) == 's') {
                        var203[var204 + 1] = var3.method6975();
                    } else {
                        var203[var204 + 1] = Integer.valueOf(var3.method6934());
                    }
                }
                var203[0] = Integer.valueOf(var3.method6934());
                class81 var205 = new class81();
                var205.field1037 = var203;
                class64.method4069(var205);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3100 == arg0.field1332) {
                method5093(class264.field3037);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3131 == arg0.field1332) {
                Statics.field1106 = class461.method5094(var3.method6929());
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3101 == arg0.field1332) {
                Statics.field1594 = var3.method6929();
                Statics.field2197 = var3.method6929();
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3143 == arg0.field1332) {
                method3149(false, arg0.field1333);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3077 == arg0.field1332) {
                int var206 = var3.method6963();
                String var207 = var3.method6975();
                int var208 = var3.method7001();
                if (var206 >= 1 && var206 <= 8) {
                    if (var207.equalsIgnoreCase(class309.field3624)) {
                        var207 = null;
                    }
                    field613[var206 - 1] = var207;
                    field614[var206 - 1] = var208 == 0;
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3068 == arg0.field1332) {
                method5093(class264.field3033);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3093 == arg0.field1332) {
                method5395();
                field658 = var3.method6932();
                field691 = field675;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3151 == arg0.field1332) {
                int var209 = var3.method6983();
                int var210 = var3.method6934();
                int var211 = var3.method7120();
                if (var211 == 65535) {
                    var211 = -1;
                }
                int var212 = var3.method6970();
                if (var212 == 65535) {
                    var212 = -1;
                }
                for (int var213 = var212; var213 <= var211; var213++) {
                    long var214 = ((long) var209 << 32) + (long) var213;
                    class411 var216 = field696.method6695(var214);
                    if (var216 != null) {
                        var216.method6409();
                    }
                    field696.method6683(new class410(var210), var214);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3094 == arg0.field1332) {
                String var217 = var3.method6975();
                String var218 = class351.method5714(class344.method4457(class283.method4423(var3)));
                class99.method2996(6, var217, var218);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3063 == arg0.field1332) {
                int var219 = var3.method6933();
                class92 var220 = field531[var219];
                int var221 = var3.method7006();
                int var222 = var3.method6970();
                if (var220 != null) {
                    var220.field1174 = var222;
                    var220.field1196 = var221 >> 16;
                    var220.field1177 = (var221 & 0xFFFF) + field487;
                    var220.field1175 = 0;
                    var220.field1176 = 0;
                    if (var220.field1177 > field487) {
                        var220.field1175 = -1;
                    }
                    if (var220.field1174 == 65535) {
                        var220.field1174 = -1;
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3113 == arg0.field1332) {
                int var223 = var3.method6963();
                int var224 = var223 >> 2;
                int var225 = var223 & 0x3;
                int var226 = field549[var224];
                int var227 = var3.method6977();
                int var228 = var227 >> 16;
                int var229 = var227 >> 8 & 0xFF;
                int var230 = (var227 >> 4 & 0x7) + var228;
                int var231 = (var227 & 0x7) + var229;
                int var232 = var3.method6970();
                if (var230 >= 0 && var231 >= 0 && var230 < 103 && var231 < 103) {
                    if (var226 == 0) {
                        class216 var233 = Statics.field69.method3731(Statics.field3173, var230, var231);
                        if (var233 != null) {
                            int var234 = class212.method4145(var233.field2631);
                            if (var224 == 2) {
                                var233.field2629 = new class73(var234, 2, var225 + 4, Statics.field3173, var230, var231, var232, false, var233.field2629);
                                var233.field2630 = new class73(var234, 2, var225 + 1 & 0x3, Statics.field3173, var230, var231, var232, false, var233.field2630);
                            } else {
                                var233.field2629 = new class73(var234, var224, var225, Statics.field3173, var230, var231, var232, false, var233.field2629);
                            }
                        }
                    } else if (var226 == 1) {
                        class218 var235 = Statics.field69.method3771(Statics.field3173, var230, var231);
                        if (var235 != null) {
                            int var236 = class212.method4145(var235.field2649);
                            if (var224 == 4 || var224 == 5) {
                                var235.field2647 = new class73(var236, 4, var225, Statics.field3173, var230, var231, var232, false, var235.field2647);
                            } else if (var224 == 6) {
                                var235.field2647 = new class73(var236, 4, var225 + 4, Statics.field3173, var230, var231, var232, false, var235.field2647);
                            } else if (var224 == 7) {
                                var235.field2647 = new class73(var236, 4, (var225 + 2 & 0x3) + 4, Statics.field3173, var230, var231, var232, false, var235.field2647);
                            } else if (var224 == 8) {
                                var235.field2647 = new class73(var236, 4, var225 + 4, Statics.field3173, var230, var231, var232, false, var235.field2647);
                                var235.field2648 = new class73(var236, 4, (var225 + 2 & 0x3) + 4, Statics.field3173, var230, var231, var232, false, var235.field2648);
                            }
                        }
                    } else if (var226 == 2) {
                        class219 var237 = Statics.field69.method3845(Statics.field3173, var230, var231);
                        if (var224 == 11) {
                            var224 = 10;
                        }
                        if (var237 != null) {
                            var237.field2654 = new class73(class212.method4145(var237.field2658), var224, var225, Statics.field3173, var230, var231, var232, false, var237.field2654);
                        }
                    } else if (var226 == 3) {
                        class197 var238 = Statics.field69.method3734(Statics.field3173, var230, var231);
                        if (var238 != null) {
                            var238.field2278 = new class73(class212.method4145(var238.field2279), 22, var225, Statics.field3173, var230, var231, var232, false, var238.field2278);
                        }
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3049 == arg0.field1332) {
                boolean var239 = var3.method6929() == 1;
                if (var239) {
                    Statics.field4588 = class270.method3146() - var3.method6935();
                    Statics.field1384 = new class318(var3, true);
                } else {
                    Statics.field1384 = null;
                }
                field690 = field675;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3142 == arg0.field1332) {
                int var240 = var3.method7120();
                if (var240 == 65535) {
                    var240 = -1;
                }
                method2945(var240);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3090 == arg0.field1332) {
                int var241 = var3.method7120();
                if (var241 == 65535) {
                    var241 = -1;
                }
                int var242 = var3.method6978();
                method2906(var241, var242);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3116 == arg0.field1332) {
                String var243 = var3.method6975();
                int var244 = var3.method6934();
                class295 var245 = class295.method3238(var244);
                if (!var243.equals(var245.field3461)) {
                    var245.field3461 = var243;
                    method2620(var245);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3066 == arg0.field1332) {
                method5093(class264.field3031);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3082 == arg0.field1332) {
                method5395();
                int var246 = var3.method6929();
                int var247 = var3.method7001();
                int var248 = var3.method6934();
                field623[var247] = var248;
                field621[var247] = var246;
                field738[var247] = 1;
                for (int var249 = 0; var249 < 98; var249++) {
                    if (var248 >= class299.field3544[var249]) {
                        field738[var247] = var249 + 2;
                    }
                }
                field680[++field681 - 1 & 0x1F] = var247;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3125 == arg0.field1332) {
                field737 = true;
                field519 = false;
                Statics.field1665 = var3.method6929();
                Statics.field2199 = var3.method6929();
                Statics.field2310 = var3.method7120();
                Statics.field3187 = var3.method6929();
                Statics.field2760 = var3.method6929();
                if (Statics.field2760 >= 100) {
                    Statics.field89 = Statics.field1665 * 128 + 64;
                    Statics.field3180 = Statics.field2199 * 128 + 64;
                    Statics.field2838 = method3277(Statics.field89, Statics.field3180, Statics.field3173) - Statics.field2310;
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3069 == arg0.field1332) {
                method3149(true, arg0.field1333);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3112 == arg0.field1332) {
                Statics.field2197 = var3.method7079();
                Statics.field1594 = var3.method7079();
                while (var3.field4708 < arg0.field1335) {
                    int var250 = var3.method6929();
                    class264 var251 = class264.method1763()[var250];
                    method5093(var251);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3083 == arg0.field1332) {
                boolean var252 = var3.method7079() == 1;
                int var253 = var3.method6934();
                class295 var254 = class295.method3238(var253);
                if (var254.field3378 != var252) {
                    var254.field3378 = var252;
                    method2620(var254);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3067 == arg0.field1332) {
                int var255 = var3.method6929();
                method572(var255);
                arg0.field1332 = null;
                return false;
            }
            if (class266.field3140 == arg0.field1332) {
                method4066();
                byte var256 = var3.method6930();
                class132 var257 = new class132(var3);
                class140 var258;
                if (var256 >= 0) {
                    var258 = field719[var256];
                } else {
                    var258 = Statics.field4591;
                }
                var257.method2640(var258);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3058 == arg0.field1332) {
                field688 = field675;
                byte var259 = var3.method6930();
                if (arg0.field1335 == 1) {
                    if (var259 >= 0) {
                        field678[var259] = null;
                    } else {
                        Statics.field4039 = null;
                    }
                    arg0.field1332 = null;
                    return true;
                }
                if (var259 >= 0) {
                    field678[var259] = new class149(var3);
                } else {
                    Statics.field4039 = new class149(var3);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3060 == arg0.field1332) {
                field494 = var3.method6929();
                if (field494 == 1) {
                    field556 = var3.method7120();
                }
                if (field494 >= 2 && field494 <= 6) {
                    if (field494 == 2) {
                        field500 = 64;
                        field501 = 64;
                    }
                    if (field494 == 3) {
                        field500 = 0;
                        field501 = 64;
                    }
                    if (field494 == 4) {
                        field500 = 128;
                        field501 = 64;
                    }
                    if (field494 == 5) {
                        field500 = 64;
                        field501 = 0;
                    }
                    if (field494 == 6) {
                        field500 = 64;
                        field501 = 128;
                    }
                    field494 = 2;
                    field497 = var3.method7120();
                    field498 = var3.method7120();
                    field499 = var3.method6929();
                }
                if (field494 == 10) {
                    field590 = var3.method7120();
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3064 == arg0.field1332) {
                Statics.field3943 = true;
                method2630(true, var3);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3075 == arg0.field1332) {
                int var260 = var3.method7004();
                int var261 = var3.method6932();
                int var262 = var3.method6934();
                class295 var263 = class295.method3238(var262);
                if (var263.field3367 != var260 || var263.field3426 != var261 || var263.field3392 != 0 || var263.field3364 != 0) {
                    var263.field3367 = var260;
                    var263.field3426 = var261;
                    var263.field3392 = 0;
                    var263.field3364 = 0;
                    method2620(var263);
                    this.method1031(var263);
                    if (var263.field3360 == 0) {
                        method3148(Statics.field4250[var262 >> 16], var263, false);
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3097 == arg0.field1332) {
                Statics.field3319 = new class393(Statics.field4384);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3089 == arg0.field1332) {
                class61 var264 = new class61();
                var264.field783 = var3.method6975();
                var264.field780 = var3.method7120();
                int var265 = var3.method6934();
                var264.field781 = var265;
                method20(45);
                var2.method6121();
                Object var266 = null;
                class69.method4481(var264);
                arg0.field1332 = null;
                return false;
            }
            if (class266.field3050 == arg0.field1332) {
                method5093(class264.field3028);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3152 == arg0.field1332) {
                int var267 = var3.method7120();
                int var268 = var3.method6929();
                int var269 = var3.method7120();
                method2763(var267, var268, var269);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3078 == arg0.field1332) {
                int var270 = var3.method6934();
                int var271 = var3.method7120();
                if (var271 == 65535) {
                    var271 = -1;
                }
                int var272 = var3.method6984();
                class295 var273 = class295.method3238(var272);
                if (var273.field3389) {
                    var273.field3375 = var271;
                    var273.field3395 = var270;
                    class188 var275 = class188.method2231(var271);
                    var273.field3410 = var275.field2105;
                    var273.field3472 = var275.field2128;
                    var273.field3412 = var275.field2107;
                    var273.field3408 = var275.field2108;
                    var273.field3409 = var275.field2109;
                    var273.field3465 = var275.field2104;
                    if (var275.field2134 == 1) {
                        var273.field3418 = 1;
                    } else {
                        var273.field3418 = 2;
                    }
                    if (var273.field3414 > 0) {
                        var273.field3465 = var273.field3465 * 32 / var273.field3414;
                    } else if (var273.field3369 > 0) {
                        var273.field3465 = var273.field3465 * 32 / var273.field3369;
                    }
                    method2620(var273);
                } else if (var271 == -1) {
                    var273.field3424 = 0;
                    arg0.field1332 = null;
                    return true;
                } else {
                    class188 var274 = class188.method2231(var271);
                    var273.field3424 = 4;
                    var273.field3403 = var271;
                    var273.field3410 = var274.field2105;
                    var273.field3472 = var274.field2128;
                    var273.field3465 = var274.field2104 * 100 / var270;
                    method2620(var273);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3110 == arg0.field1332) {
                Statics.field4063.method1604();
                field711 = field675;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3129 == arg0.field1332) {
                int var276 = var3.method7006();
                int var277 = var3.method6984();
                class80 var278 = (class80) field651.method6695((long) var277);
                class80 var279 = (class80) field651.method6695((long) var276);
                if (var279 != null) {
                    Statics.method387(var279, var278 == null || var278.field1026 != var279.field1026);
                }
                if (var278 != null) {
                    var278.method6409();
                    field651.method6683(var278, (long) var276);
                }
                class295 var280 = class295.method3238(var277);
                if (var280 != null) {
                    method2620(var280);
                }
                class295 var281 = class295.method3238(var276);
                if (var281 != null) {
                    method2620(var281);
                    method3148(Statics.field4250[var281.field3358 >>> 16], var281, true);
                }
                if (field650 != -1) {
                    method4070(field650, 1);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3134 == arg0.field1332) {
                int var282 = var3.method7120();
                byte var283 = var3.method6964();
                class289.field3314[var282] = var283;
                if (class289.field3313[var282] != var283) {
                    class289.field3313[var282] = var283;
                }
                method5095(var282);
                field676[++field649 - 1 & 0x1F] = var282;
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3052 == arg0.field1332) {
                int var284 = var3.method7120();
                int var285 = var3.method7120();
                int var286 = var3.method6934();
                int var287 = var3.method7120();
                class295 var288 = class295.method3238(var286);
                if (var288.field3410 != var284 || var288.field3472 != var285 || var288.field3465 != var287) {
                    var288.field3410 = var284;
                    var288.field3472 = var285;
                    var288.field3465 = var287;
                    method2620(var288);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3070 == arg0.field1332) {
                int var289 = var3.method7120();
                int var290 = var3.method7006();
                class295 var291 = class295.method3238(var290);
                if (var291.field3424 != 1 || var291.field3403 != var289) {
                    var291.field3424 = 1;
                    var291.field3403 = var289;
                    method2620(var291);
                }
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3099 == arg0.field1332) {
                method2986(var3.method6975());
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3153 == arg0.field1332) {
                field710 = var3.method7079();
                field708 = var3.method7001();
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3055 == arg0.field1332) {
                int var292 = var3.method6984();
                class295 var293 = class295.method3238(var292);
                var293.field3424 = 3;
                var293.field3403 = Statics.field454.field1084.method4943();
                method2620(var293);
                arg0.field1332 = null;
                return true;
            }
            if (class266.field3084 == arg0.field1332) {
                int var294 = var3.method6983();
                int var295 = var3.method7120();
                int var296 = var3.method6933();
                class85 var297;
                if (field763 == var296) {
                    var297 = Statics.field454;
                } else {
                    var297 = field604[var296];
                }
                if (var297 != null) {
                    var297.field1174 = var295;
                    var297.field1196 = var294 >> 16;
                    var297.field1177 = (var294 & 0xFFFF) + field487;
                    var297.field1175 = 0;
                    var297.field1176 = 0;
                    if (var297.field1177 > field487) {
                        var297.field1175 = -1;
                    }
                    if (var297.field1174 == 65535) {
                        var297.field1174 = -1;
                    }
                }
                arg0.field1332 = null;
                return true;
            }
            class468.method566("" + (arg0.field1332 == null ? -1 : arg0.field1332.field3079) + class93.field1271 + (arg0.field1340 == null ? -1 : arg0.field1340.field3079) + class93.field1271 + (arg0.field1331 == null ? -1 : arg0.field1331.field3079) + class93.field1271 + arg0.field1335, (Throwable) null);
            method2411();
        } catch (IOException var302) {
            method2933();
        } catch (Exception var303) {
            String var300 = "" + (arg0.field1332 == null ? -1 : arg0.field1332.field3079) + class93.field1271 + (arg0.field1340 == null ? -1 : arg0.field1340.field3079) + class93.field1271 + (arg0.field1331 == null ? -1 : arg0.field1331.field3079) + class93.field1271 + arg0.field1335 + class93.field1271 + (Statics.field405 + Statics.field454.field1198[0]) + class93.field1271 + (Statics.field31 + Statics.field454.field1199[0]) + class93.field1271;
            for (int var301 = 0; var301 < arg0.field1335 && var301 < 50; var301++) {
                var300 = var300 + var3.field4707[var301] + class93.field1271;
            }
            class468.method566(var300, var303);
            method2411();
        }
        return true;
    }

    @ObfuscatedName("kw.ge(Ljq;B)V")
    public static final void method5093(class264 arg0) {
        class443 var1 = field536.field1333;
        if (class264.field3032 == arg0) {
            int var2 = var1.method7079();
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = field549[var3];
            int var6 = var1.method6947();
            int var7 = var1.method6929();
            int var8 = (var7 >> 4 & 0x7) + Statics.field2197;
            int var9 = (var7 & 0x7) + Statics.field1594;
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                method4430(Statics.field3173, var8, var9, var5, var6, var3, var4, 0, -1);
            }
            return;
        }
        if (class264.field3027 == arg0) {
            int var10 = var1.method7079();
            int var11 = (var10 >> 4 & 0x7) + Statics.field2197;
            int var12 = (var10 & 0x7) + Statics.field1594;
            int var13 = var1.method6947();
            byte var14 = var1.method6951();
            byte var15 = var1.method6930();
            byte var16 = var1.method6964();
            int var17 = var1.method6933();
            int var18 = var1.method7001();
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            int var21 = field549[var19];
            byte var22 = var1.method6930();
            int var23 = var1.method6933();
            int var24 = var1.method6970();
            class85 var25;
            if (field763 == var24) {
                var25 = Statics.field454;
            } else {
                var25 = field604[var24];
            }
            if (var25 != null) {
                class187 var26 = class187.method2907(var17);
                int var27;
                int var28;
                if (var20 == 1 || var20 == 3) {
                    var27 = var26.field2052;
                    var28 = var26.field2051;
                } else {
                    var27 = var26.field2051;
                    var28 = var26.field2052;
                }
                int var29 = (var27 >> 1) + var11;
                int var30 = (var27 + 1 >> 1) + var11;
                int var31 = (var28 >> 1) + var12;
                int var32 = (var28 + 1 >> 1) + var12;
                int[][] var33 = class75.field985[Statics.field3173];
                int var34 = var33[var29][var31] + var33[var30][var31] + var33[var29][var32] + var33[var30][var32] >> 2;
                int var35 = (var11 << 7) + (var27 << 6);
                int var36 = (var12 << 7) + (var28 << 6);
                class211 var37 = var26.method3246(var19, var20, var33, var35, var34, var36);
                if (var37 != null) {
                    method4430(Statics.field3173, var11, var12, var21, -1, 0, 0, var23 + 1, var13 + 1);
                    var25.field1092 = field487 + var23;
                    var25.field1107 = field487 + var13;
                    var25.field1097 = var37;
                    var25.field1094 = var11 * 128 + var27 * 64;
                    var25.field1098 = var12 * 128 + var28 * 64;
                    var25.field1095 = var34;
                    if (var16 > var15) {
                        byte var38 = var16;
                        var16 = var15;
                        var15 = var38;
                    }
                    if (var22 > var14) {
                        byte var39 = var22;
                        var22 = var14;
                        var14 = var39;
                    }
                    var25.field1090 = var11 + var16;
                    var25.field1100 = var11 + var15;
                    var25.field1099 = var12 + var22;
                    var25.field1101 = var12 + var14;
                }
            }
        }
        if (class264.field3033 == arg0) {
            int var40 = var1.method6963();
            int var41 = var1.method6970();
            int var42 = var1.method6963();
            int var43 = (var42 >> 4 & 0x7) + Statics.field2197;
            int var44 = (var42 & 0x7) + Statics.field1594;
            int var45 = var1.method6963();
            int var46 = var45 >> 4 & 0xF;
            int var47 = var45 & 0x7;
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                int var48 = var46 + 1;
                if (Statics.field454.field1198[0] >= var43 - var48 && Statics.field454.field1198[0] <= var43 + var48 && Statics.field454.field1199[0] >= var44 - var48 && Statics.field454.field1199[0] <= var44 + var48 && Statics.field4303.method2108() != 0 && var47 > 0 && field709 < 50) {
                    field508[field709] = var41;
                    field733[field709] = var47;
                    field734[field709] = var40;
                    field736[field709] = null;
                    field735[field709] = (var43 << 16) + (var44 << 8) + var46;
                    field709++;
                }
            }
        }
        if (class264.field3028 == arg0) {
            int var49 = var1.method6933();
            int var50 = var1.method6933();
            int var51 = var1.method7079();
            int var52 = (var51 >> 4 & 0x7) + Statics.field2197;
            int var53 = (var51 & 0x7) + Statics.field1594;
            int var54 = var1.method7079();
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                int var55 = var52 * 128 + 64;
                int var56 = var53 * 128 + 64;
                class65 var57 = new class65(var49, Statics.field3173, var55, var56, method3277(var55, var56, Statics.field3173) - var54, var50, field487);
                field620.method5425(var57);
            }
        } else if (class264.field3029 == arg0) {
            int var58 = var1.method7120();
            int var59 = var1.method7001();
            int var60 = (var59 >> 4 & 0x7) + Statics.field2197;
            int var61 = (var59 & 0x7) + Statics.field1594;
            int var62 = var1.method6933();
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                class96 var63 = new class96();
                var63.field1294 = var62;
                var63.field1292 = var58;
                if (field617[Statics.field3173][var60][var61] == null) {
                    field617[Statics.field3173][var60][var61] = new class335();
                }
                field617[Statics.field3173][var60][var61].method5425(var63);
                method5882(var60, var61);
            }
        } else if (class264.field3031 == arg0) {
            int var64 = var1.method7001();
            int var65 = (var64 >> 4 & 0x7) + Statics.field2197;
            int var66 = (var64 & 0x7) + Statics.field1594;
            int var67 = var1.method6963();
            int var68 = var67 >> 2;
            int var69 = var67 & 0x3;
            int var70 = field549[var68];
            if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                method4430(Statics.field3173, var65, var66, var70, -1, var68, var69, 0, -1);
            }
        } else if (class264.field3030 == arg0) {
            int var71 = var1.method6963();
            int var72 = var1.method7079();
            int var73 = (var72 >> 4 & 0x7) + Statics.field2197;
            int var74 = (var72 & 0x7) + Statics.field1594;
            int var75 = var1.method7079() * 4;
            byte var76 = var1.method6930();
            int var77 = var1.method6947();
            byte var78 = var1.method6951();
            int var79 = var1.method6929();
            int var80 = var1.method7001() * 4;
            int var81 = var1.method6933();
            int var82 = var1.method6947();
            int var83 = var1.method7086();
            int var84 = var73 + var78;
            int var85 = var74 + var76;
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104 && var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var81 != 65535) {
                int var86 = var73 * 128 + 64;
                int var87 = var74 * 128 + 64;
                int var88 = var84 * 128 + 64;
                int var89 = var85 * 128 + 64;
                class70 var90 = new class70(var81, Statics.field3173, var86, var87, method3277(var86, var87, Statics.field3173) - var80, field487 + var77, field487 + var82, var79, var71, var83, var75);
                var90.method1820(var88, var89, method3277(var88, var89, Statics.field3173) - var75, field487 + var77);
                field619.method5425(var90);
            }
        } else if (class264.field3034 == arg0) {
            int var91 = var1.method6929();
            int var92 = (var91 >> 4 & 0x7) + Statics.field2197;
            int var93 = (var91 & 0x7) + Statics.field1594;
            int var94 = var1.method6933();
            if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                class335 var95 = field617[Statics.field3173][var92][var93];
                if (var95 != null) {
                    for (class96 var96 = (class96) var95.method5442(); var96 != null; var96 = (class96) var95.method5426()) {
                        if ((var94 & 0x7FFF) == var96.field1294) {
                            var96.method6409();
                            break;
                        }
                    }
                    if (var95.method5442() == null) {
                        field617[Statics.field3173][var92][var93] = null;
                    }
                    method5882(var92, var93);
                }
            }
        } else if (class264.field3037 == arg0) {
            int var97 = var1.method7001();
            int var98 = (var97 >> 4 & 0x7) + Statics.field2197;
            int var99 = (var97 & 0x7) + Statics.field1594;
            int var100 = var1.method6933();
            int var101 = var1.method6970();
            int var102 = var1.method6947();
            if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                class335 var103 = field617[Statics.field3173][var98][var99];
                if (var103 != null) {
                    for (class96 var104 = (class96) var103.method5442(); var104 != null; var104 = (class96) var103.method5426()) {
                        if ((var101 & 0x7FFF) == var104.field1294 && var104.field1292 == var100) {
                            var104.field1292 = var102;
                            break;
                        }
                    }
                    method5882(var98, var99);
                }
            }
        } else if (class264.field3035 == arg0) {
            int var105 = var1.method7001();
            int var106 = var105 >> 2;
            int var107 = var105 & 0x3;
            int var108 = field549[var106];
            int var109 = var1.method6929();
            int var110 = (var109 >> 4 & 0x7) + Statics.field2197;
            int var111 = (var109 & 0x7) + Statics.field1594;
            int var112 = var1.method6933();
            if (var110 >= 0 && var111 >= 0 && var110 < 103 && var111 < 103) {
                if (var108 == 0) {
                    class216 var113 = Statics.field69.method3731(Statics.field3173, var110, var111);
                    if (var113 != null) {
                        int var114 = class212.method4145(var113.field2631);
                        if (var106 == 2) {
                            var113.field2629 = new class73(var114, 2, var107 + 4, Statics.field3173, var110, var111, var112, false, var113.field2629);
                            var113.field2630 = new class73(var114, 2, var107 + 1 & 0x3, Statics.field3173, var110, var111, var112, false, var113.field2630);
                        } else {
                            var113.field2629 = new class73(var114, var106, var107, Statics.field3173, var110, var111, var112, false, var113.field2629);
                        }
                    }
                }
                if (var108 == 1) {
                    class218 var115 = Statics.field69.method3771(Statics.field3173, var110, var111);
                    if (var115 != null) {
                        int var116 = class212.method4145(var115.field2649);
                        if (var106 == 4 || var106 == 5) {
                            var115.field2647 = new class73(var116, 4, var107, Statics.field3173, var110, var111, var112, false, var115.field2647);
                        } else if (var106 == 6) {
                            var115.field2647 = new class73(var116, 4, var107 + 4, Statics.field3173, var110, var111, var112, false, var115.field2647);
                        } else if (var106 == 7) {
                            var115.field2647 = new class73(var116, 4, (var107 + 2 & 0x3) + 4, Statics.field3173, var110, var111, var112, false, var115.field2647);
                        } else if (var106 == 8) {
                            var115.field2647 = new class73(var116, 4, var107 + 4, Statics.field3173, var110, var111, var112, false, var115.field2647);
                            var115.field2648 = new class73(var116, 4, (var107 + 2 & 0x3) + 4, Statics.field3173, var110, var111, var112, false, var115.field2648);
                        }
                    }
                }
                if (var108 == 2) {
                    class219 var117 = Statics.field69.method3845(Statics.field3173, var110, var111);
                    if (var106 == 11) {
                        var106 = 10;
                    }
                    if (var117 != null) {
                        var117.field2654 = new class73(class212.method4145(var117.field2658), var106, var107, Statics.field3173, var110, var111, var112, false, var117.field2654);
                    }
                }
                if (var108 == 3) {
                    class197 var118 = Statics.field69.method3734(Statics.field3173, var110, var111);
                    if (var118 != null) {
                        var118.field2278 = new class73(class212.method4145(var118.field2279), 22, var107, Statics.field3173, var110, var111, var112, false, var118.field2278);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hy.gy(IIIIIIIIII)V")
    public static final void method4430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class86 var9 = null;
        for (class86 var10 = (class86) field618.method5442(); var10 != null; var10 = (class86) field618.method5426()) {
            if (var10.field1117 == arg0 && var10.field1116 == arg1 && var10.field1114 == arg2 && var10.field1124 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class86();
            var9.field1117 = arg0;
            var9.field1124 = arg3;
            var9.field1116 = arg1;
            var9.field1114 = arg2;
            method6648(var9);
            field618.method5425(var9);
        }
        var9.field1121 = arg4;
        var9.field1123 = arg5;
        var9.field1122 = arg6;
        var9.field1126 = arg7;
        var9.field1125 = arg8;
    }

    @ObfuscatedName("cl.gq(B)V")
    public static final void method1964() {
        for (class86 var0 = (class86) field618.method5442(); var0 != null; var0 = (class86) field618.method5426()) {
            if (var0.field1125 == -1) {
                var0.field1126 = 0;
                method6648(var0);
            } else {
                var0.method6409();
            }
        }
    }

    @ObfuscatedName("os.gf(Lci;I)V")
    public static final void method6648(class86 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1124 == 0) {
            var1 = Statics.field69.method3836(arg0.field1117, arg0.field1116, arg0.field1114);
        }
        if (arg0.field1124 == 1) {
            var1 = Statics.field69.method3736(arg0.field1117, arg0.field1116, arg0.field1114);
        }
        if (arg0.field1124 == 2) {
            var1 = Statics.field69.method3737(arg0.field1117, arg0.field1116, arg0.field1114);
        }
        if (arg0.field1124 == 3) {
            var1 = Statics.field69.method3738(arg0.field1117, arg0.field1116, arg0.field1114);
        }
        if (var1 != 0L) {
            int var6 = Statics.field69.method3739(arg0.field1117, arg0.field1116, arg0.field1114, var1);
            var3 = class212.method4145(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1118 = var3;
        arg0.field1120 = var4;
        arg0.field1119 = var5;
    }

    @ObfuscatedName("jj.gn(B)V")
    public static final void method4647() {
        for (class86 var0 = (class86) field618.method5442(); var0 != null; var0 = (class86) field618.method5426()) {
            if (var0.field1125 > 0) {
                var0.field1125--;
            }
            if (var0.field1125 != 0) {
                if (var0.field1126 > 0) {
                    var0.field1126--;
                }
                if (var0.field1126 == 0 && var0.field1116 >= 1 && var0.field1114 >= 1 && var0.field1116 <= 102 && var0.field1114 <= 102 && (var0.field1121 < 0 || class75.method1478(var0.field1121, var0.field1123))) {
                    method3888(var0.field1117, var0.field1124, var0.field1116, var0.field1114, var0.field1121, var0.field1122, var0.field1123);
                    var0.field1126 = -1;
                    if (var0.field1121 == var0.field1118 && var0.field1118 == -1) {
                        var0.method6409();
                    } else if (var0.field1121 == var0.field1118 && var0.field1122 == var0.field1119 && var0.field1123 == var0.field1120) {
                        var0.method6409();
                    }
                }
            } else if (var0.field1118 < 0 || class75.method1478(var0.field1118, var0.field1120)) {
                method3888(var0.field1117, var0.field1124, var0.field1116, var0.field1114, var0.field1118, var0.field1119, var0.field1120);
                var0.method6409();
            }
        }
    }

    @ObfuscatedName("gn.gt(IIIIIIIB)V")
    public static final void method3888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field480 && Statics.field3173 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field69.method3836(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field69.method3736(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field69.method3737(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field69.method3738(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field69.method3739(arg0, arg2, arg3, var7);
            int var13 = class212.method4145(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field69.method3726(arg0, arg2, arg3);
                class187 var16 = class187.method2907(var13);
                if (var16.field2053 != 0) {
                    field597[arg0].method3441(arg2, arg3, var14, var15, var16.field2048);
                }
            }
            if (arg1 == 1) {
                Statics.field69.method3727(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field69.method3728(arg0, arg2, arg3);
                class187 var17 = class187.method2907(var13);
                if (var17.field2051 + arg2 > 103 || var17.field2051 + arg3 > 103 || var17.field2052 + arg2 > 103 || var17.field2052 + arg3 > 103) {
                    return;
                }
                if (var17.field2053 != 0) {
                    field597[arg0].method3442(arg2, arg3, var17.field2051, var17.field2052, var15, var17.field2048);
                }
            }
            if (arg1 == 3) {
                Statics.field69.method3729(arg0, arg2, arg3);
                class187 var18 = class187.method2907(var13);
                if (var18.field2053 == 1) {
                    field597[arg0].method3444(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class75.field972[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class75.method169(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field69, field597[arg0]);
    }

    @ObfuscatedName("mc.hl(III)V")
    public static final void method5882(int arg0, int arg1) {
        class335 var2 = field617[Statics.field3173][arg0][arg1];
        if (var2 == null) {
            Statics.field69.method3730(Statics.field3173, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class96 var5 = null;
        for (class96 var6 = (class96) var2.method5442(); var6 != null; var6 = (class96) var2.method5426()) {
            class188 var7 = class188.method2231(var6.field1294);
            long var8 = (long) var7.field2111;
            if (var7.field2134 == 1) {
                var8 = (long) (var6.field1292 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field69.method3730(Statics.field3173, arg0, arg1);
            return;
        }
        var2.method5427(var5);
        class96 var10 = null;
        class96 var11 = null;
        for (class96 var12 = (class96) var2.method5442(); var12 != null; var12 = (class96) var2.method5426()) {
            if (var5.field1294 != var12.field1294) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1294 != var12.field1294 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = Statics.method3578(arg0, arg1, 3, false, 0);
        Statics.field69.method3716(Statics.field3173, arg0, arg1, method3277(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field3173), var5, var13, var10, var11);
    }

    @ObfuscatedName("da.hf(ZLqz;I)V")
    public static final void method2630(boolean arg0, class443 arg1) {
        field496 = 0;
        field534 = 0;
        class443 var2 = field536.field1333;
        var2.method6876();
        int var3 = var2.method6877(8);
        if (var3 < field532) {
            for (int var4 = var3; var4 < field532; var4++) {
                field585[++field496 - 1] = field533[var4];
            }
        }
        if (var3 > field532) {
            throw new RuntimeException("");
        }
        field532 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field533[var5];
            class92 var7 = field531[var6];
            int var8 = var2.method6877(1);
            if (var8 == 0) {
                field533[++field532 - 1] = var6;
                var7.field1186 = field487;
            } else {
                int var9 = var2.method6877(2);
                if (var9 == 0) {
                    field533[++field532 - 1] = var6;
                    var7.field1186 = field487;
                    field535[++field534 - 1] = var6;
                } else if (var9 == 1) {
                    field533[++field532 - 1] = var6;
                    var7.field1186 = field487;
                    int var10 = var2.method6877(3);
                    var7.method2196(var10, class193.field2207);
                    int var11 = var2.method6877(1);
                    if (var11 == 1) {
                        field535[++field534 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field533[++field532 - 1] = var6;
                    var7.field1186 = field487;
                    if (var2.method6877(1) == 1) {
                        int var12 = var2.method6877(3);
                        var7.method2196(var12, class193.field2208);
                        int var13 = var2.method6877(3);
                        var7.method2196(var13, class193.field2208);
                    } else {
                        int var14 = var2.method6877(3);
                        var7.method2196(var14, class193.field2210);
                    }
                    int var15 = var2.method6877(1);
                    if (var15 == 1) {
                        field535[++field534 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field585[++field496 - 1] = var6;
                }
            }
        }
        while (arg1.method6879(field536.field1335) >= 27) {
            int var16 = arg1.method6877(15);
            if (var16 == 32767) {
                break;
            }
            boolean var47 = false;
            if (field531[var16] == null) {
                field531[var16] = new class92();
                var47 = true;
            }
            class92 var48 = field531[var16];
            field533[++field532 - 1] = var16;
            var48.field1186 = field487;
            int var49;
            int var50;
            int var51;
            if (Statics.field3943) {
                if (arg0) {
                    var49 = arg1.method6877(8);
                    if (var49 > 127) {
                        var49 -= 256;
                    }
                } else {
                    var49 = arg1.method6877(5);
                    if (var49 > 15) {
                        var49 -= 32;
                    }
                }
                if (arg0) {
                    var50 = arg1.method6877(8);
                    if (var50 > 127) {
                        var50 -= 256;
                    }
                } else {
                    var50 = arg1.method6877(5);
                    if (var50 > 15) {
                        var50 -= 32;
                    }
                }
                var51 = arg1.method6877(1);
                boolean var52 = arg1.method6877(1) == 1;
                if (var52) {
                    arg1.method6877(32);
                }
                var48.field1261 = class178.method2587(arg1.method6877(14));
                int var53 = field615[arg1.method6877(3)];
                if (var47) {
                    var48.field1194 = var48.field1161 = var53;
                }
                int var54 = arg1.method6877(1);
                if (var54 == 1) {
                    field535[++field534 - 1] = var16;
                }
            } else {
                var48.field1261 = class178.method2587(arg1.method6877(14));
                int var55 = arg1.method6877(1);
                if (var55 == 1) {
                    field535[++field534 - 1] = var16;
                }
                if (arg0) {
                    var49 = arg1.method6877(8);
                    if (var49 > 127) {
                        var49 -= 256;
                    }
                } else {
                    var49 = arg1.method6877(5);
                    if (var49 > 15) {
                        var49 -= 32;
                    }
                }
                boolean var56 = arg1.method6877(1) == 1;
                if (var56) {
                    arg1.method6877(32);
                }
                var51 = arg1.method6877(1);
                int var57 = field615[arg1.method6877(3)];
                if (var47) {
                    var48.field1194 = var48.field1161 = var57;
                }
                if (arg0) {
                    var50 = arg1.method6877(8);
                    if (var50 > 127) {
                        var50 -= 256;
                    }
                } else {
                    var50 = arg1.method6877(5);
                    if (var50 > 15) {
                        var50 -= 32;
                    }
                }
            }
            var48.field1191 = var48.field1261.field1907;
            var48.field1181 = var48.field1261.field1938;
            if (var48.field1181 == 0) {
                var48.field1161 = 0;
            }
            var48.field1136 = var48.field1261.field1913;
            var48.field1129 = var48.field1261.field1914;
            var48.field1138 = var48.field1261.field1944;
            var48.field1139 = var48.field1261.field1916;
            var48.field1133 = var48.field1261.field1910;
            var48.field1134 = var48.field1261.field1928;
            var48.field1135 = var48.field1261.field1912;
            var48.field1140 = var48.field1261.field1915;
            var48.field1141 = var48.field1261.field1920;
            var48.field1142 = var48.field1261.field1919;
            var48.field1150 = var48.field1261.field1939;
            var48.field1144 = var48.field1261.field1921;
            var48.field1171 = var48.field1261.field1934;
            var48.field1146 = var48.field1261.field1923;
            var48.field1151 = var48.field1261.field1924;
            var48.method2197(Statics.field454.field1198[0] + var50, Statics.field454.field1199[0] + var49, var51 == 1);
        }
        arg1.method6894();
        for (int var17 = 0; var17 < field534; var17++) {
            int var18 = field535[var17];
            class92 var19 = field531[var18];
            int var20 = arg1.method6929();
            if (Statics.field3943 && (var20 & 0x2) != 0) {
                int var21 = arg1.method6929();
                var20 += var21 << 8;
            }
            if ((var20 & 0x40) != 0) {
                var19.field1131 = arg1.method7120();
                if (var19.field1131 == 65535) {
                    var19.field1131 = -1;
                }
            }
            if ((var20 & 0x100) != 0) {
                var19.method2209(arg1.method6975());
            }
            if ((var20 & 0x8) != 0) {
                int var22 = arg1.method6933();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = arg1.method7001();
                if (var19.field1169 == var22 && var22 != -1) {
                    int var24 = class190.method5853(var22).field2182;
                    if (var24 == 1) {
                        var19.field1170 = 0;
                        var19.field1200 = 0;
                        var19.field1127 = var23;
                        var19.field1173 = 0;
                    }
                    if (var24 == 2) {
                        var19.field1173 = 0;
                    }
                } else if (var22 == -1 || var19.field1169 == -1 || class190.method5853(var22).field2158 >= class190.method5853(var19.field1169).field2158) {
                    var19.field1169 = var22;
                    var19.field1170 = 0;
                    var19.field1200 = 0;
                    var19.field1127 = var23;
                    var19.field1173 = 0;
                    var19.field1202 = var19.field1197;
                }
            }
            if ((var20 & 0x10) != 0) {
                var19.field1261 = class178.method2587(arg1.method6947());
                var19.field1191 = var19.field1261.field1907;
                var19.field1181 = var19.field1261.field1938;
                var19.field1136 = var19.field1261.field1913;
                var19.field1129 = var19.field1261.field1914;
                var19.field1138 = var19.field1261.field1944;
                var19.field1139 = var19.field1261.field1916;
                var19.field1133 = var19.field1261.field1910;
                var19.field1134 = var19.field1261.field1928;
                var19.field1135 = var19.field1261.field1912;
            }
            if ((var20 & 0x20) != 0) {
                var19.field1143 = arg1.method6975();
                var19.field1178 = 100;
            }
            if ((var20 & 0x4) != 0) {
                int var25 = arg1.method6970();
                int var26 = arg1.method6970();
                if (Statics.field3943) {
                    var19.field1164 = arg1.method6929() == 1;
                }
                int var27 = var19.field1172 - (var25 - Statics.field405 - Statics.field405) * 64;
                int var28 = var19.field1155 - (var26 - Statics.field31 - Statics.field31) * 64;
                if (var27 != 0 || var28 != 0) {
                    var19.field1163 = (int) (Math.atan2((double) var27, (double) var28) * 325.949D) & 0x7FF;
                }
            }
            if ((var20 & 0x80) != 0) {
                int var29 = arg1.method7079();
                if (var29 > 0) {
                    for (int var30 = 0; var30 < var29; var30++) {
                        int var31 = -1;
                        int var32 = -1;
                        int var33 = -1;
                        int var34 = arg1.method6944();
                        if (var34 == 32767) {
                            var34 = arg1.method6944();
                            var32 = arg1.method6944();
                            var31 = arg1.method6944();
                            var33 = arg1.method6944();
                        } else if (var34 == 32766) {
                            var34 = -1;
                        } else {
                            var32 = arg1.method6944();
                        }
                        int var35 = arg1.method6944();
                        var19.method2035(var34, var32, var31, var33, field487, var35);
                    }
                }
                int var36 = arg1.method6929();
                if (var36 > 0) {
                    for (int var37 = 0; var37 < var36; var37++) {
                        int var38 = arg1.method6944();
                        int var39 = arg1.method6944();
                        if (var39 == 32767) {
                            var19.method2037(var38);
                        } else {
                            int var40 = arg1.method6944();
                            int var41 = arg1.method7001();
                            int var42 = var39 > 0 ? arg1.method7079() : var41;
                            var19.method2036(var38, field487, var39, var40, var41, var42);
                        }
                    }
                }
            }
            if ((var20 & 0x1) != 0) {
                var19.field1174 = arg1.method6970();
                int var43 = arg1.method6983();
                var19.field1196 = var43 >> 16;
                var19.field1177 = (var43 & 0xFFFF) + field487;
                var19.field1175 = 0;
                var19.field1176 = 0;
                if (var19.field1177 > field487) {
                    var19.field1175 = -1;
                }
                if (var19.field1174 == 65535) {
                    var19.field1174 = -1;
                }
            }
            if ((var20 & 0x400) != 0) {
                var19.field1188 = field487 + arg1.method6970();
                var19.field1189 = field487 + arg1.method7120();
                var19.field1190 = arg1.method6964();
                var19.field1132 = arg1.method6930();
                var19.field1192 = arg1.method6930();
                var19.field1193 = (byte) arg1.method7079();
            }
            if (Statics.field3943 && (var20 & 0x200) != 0 || !Statics.field3943 && (var20 & 0x2) != 0) {
                var19.field1179 = arg1.method6965();
                var19.field1128 = arg1.method6951();
                var19.field1180 = arg1.method6965();
                var19.field1182 = arg1.method6930();
                var19.field1183 = arg1.method6947() + field487;
                var19.field1184 = arg1.method6947() + field487;
                var19.field1137 = arg1.method6947();
                var19.field1197 = 1;
                var19.field1202 = 0;
                var19.field1179 += var19.field1198[0];
                var19.field1128 += var19.field1199[0];
                var19.field1180 += var19.field1198[0];
                var19.field1182 += var19.field1199[0];
            }
            if ((var20 & 0x800) != 0) {
                var19.field1203 = arg1.method6983();
            }
        }
        for (int var44 = 0; var44 < field496; var44++) {
            int var45 = field585[var44];
            if (field487 != field531[var45].field1186) {
                field531[var45].field1261 = null;
                field531[var45] = null;
            }
        }
        if (field536.field1335 != arg1.field4708) {
            throw new RuntimeException(arg1.field4708 + class93.field1271 + field536.field1335);
        }
        for (int var46 = 0; var46 < field532; var46++) {
            if (field531[field533[var46]] == null) {
                throw new RuntimeException(var46 + class93.field1271 + field532);
            }
        }
    }

    @ObfuscatedName("u.hp(III)Lgr;")
    public static class192 method159(int arg0, int arg1) {
        field692.field2200 = arg0;
        field692.field2198 = arg1;
        field692.field2202 = 1;
        field692.field2201 = 1;
        return field692;
    }

    @ObfuscatedName("nv.hg(I)V")
    public static void method6095() {
        field626 = 0;
        field664 = false;
        field632[0] = class309.field3874;
        field606[0] = "";
        field561[0] = 1006;
        field634[0] = false;
        field626 = 1;
    }

    @ObfuscatedName("j.ho(III)V")
    public static final void method347(int arg0, int arg1) {
        if (field626 < 2 && field484 == 0 && !field635 || !field638) {
            return;
        }
        int var2 = field626 - 1;
        String var4;
        if (field484 == 1 && field626 < 2) {
            var4 = class309.field3779 + class309.field3789 + field643 + " " + class93.field1266;
        } else if (field635 && field626 < 2) {
            var4 = field648 + class309.field3789 + field490 + " " + class93.field1266;
        } else {
            var4 = method958(var2);
        }
        if (field626 > 2) {
            var4 = var4 + class93.method2932(16777215) + " " + '/' + " " + (field626 - 2) + class309.field3851;
        }
        Statics.field2706.method5706(var4, arg0 + 4, arg1 + 15, 16777215, 0, field487 / 1000);
    }

    @ObfuscatedName("fu.ha(I)Z")
    public static final boolean method2890() {
        return field664;
    }

    @ObfuscatedName("c.hx(IIIIB)V")
    public static final void method17(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field697; var4++) {
            if (field704[var4] + field702[var4] > arg0 && field702[var4] < arg0 + arg2 && field747[var4] + field509[var4] > arg1 && field509[var4] < arg1 + arg3) {
                field644[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hn(I)V")
    public final void method1027() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field626 - 1; var2++) {
                if (field561[var2] < 1000 && field561[var2 + 1] > 1000) {
                    String var3 = field606[var2];
                    field606[var2] = field606[var2 + 1];
                    field606[var2 + 1] = var3;
                    String var4 = field632[var2];
                    field632[var2] = field632[var2 + 1];
                    field632[var2 + 1] = var4;
                    int var5 = field561[var2];
                    field561[var2] = field561[var2 + 1];
                    field561[var2 + 1] = var5;
                    int var6 = field475[var2];
                    field475[var2] = field475[var2 + 1];
                    field475[var2 + 1] = var6;
                    int var7 = field628[var2];
                    field628[var2] = field628[var2 + 1];
                    field628[var2 + 1] = var7;
                    int var8 = field630[var2];
                    field630[var2] = field630[var2 + 1];
                    field630[var2 + 1] = var8;
                    int var9 = field631[var2];
                    field631[var2] = field631[var2 + 1];
                    field631[var2 + 1] = var9;
                    boolean var10 = field634[var2];
                    field634[var2] = field634[var2 + 1];
                    field634[var2 + 1] = var10;
                    var1 = false;
                }
            }
        }
        if (Statics.field88 != null || field587 != null) {
            return;
        }
        int var11 = class33.field227;
        if (field664) {
            if (var11 != 1 && (Statics.field4383 || var11 != 4)) {
                int var12 = class33.field220;
                int var13 = class33.field228;
                if (var12 < Statics.field1775 - 10 || var12 > Statics.field1775 + Statics.field1562 + 10 || var13 < Statics.field2 - 10 || var13 > Statics.field2669 + Statics.field2 + 10) {
                    field664 = false;
                    method17(Statics.field1775, Statics.field2, Statics.field1562, Statics.field2669);
                }
            }
            if (var11 == 1 || !Statics.field4383 && var11 == 4) {
                int var14 = Statics.field1775;
                int var15 = Statics.field2;
                int var16 = Statics.field1562;
                int var17 = class33.field219;
                int var18 = class33.field230;
                int var19 = -1;
                for (int var20 = 0; var20 < field626; var20++) {
                    int var21 = (field626 - 1 - var20) * 15 + var15 + 31;
                    if (var17 > var14 && var17 < var14 + var16 && var18 > var21 - 13 && var18 < var21 + 3) {
                        var19 = var20;
                    }
                }
                if (var19 != -1) {
                    method989(var19);
                }
                field664 = false;
                method17(Statics.field1775, Statics.field2, Statics.field1562, Statics.field2669);
            }
            return;
        }
        int var22 = field626 - 1;
        if ((var11 == 1 || !Statics.field4383 && var11 == 4) && var22 >= 0) {
            int var24 = field561[var22];
            if (var24 == 39 || var24 == 40 || var24 == 41 || var24 == 42 || var24 == 43 || var24 == 33 || var24 == 34 || var24 == 35 || var24 == 36 || var24 == 37 || var24 == 38 || var24 == 1005) {
                label209: {
                    int var25 = field475[var22];
                    int var26 = field628[var22];
                    class295 var27 = class295.method3238(var26);
                    if (!class296.method4882(method3477(var27))) {
                        int var28 = method3477(var27);
                        boolean var29 = (var28 >> 29 & 0x1) != 0;
                        if (!var29) {
                            break label209;
                        }
                    }
                    if (Statics.field88 != null && !field703 && field626 > 0 && !this.method1472()) {
                        method5837(field610, field598);
                    }
                    field703 = false;
                    field601 = 0;
                    if (Statics.field88 != null) {
                        method2620(Statics.field88);
                    }
                    Statics.field88 = class295.method3238(var26);
                    field596 = var25;
                    field610 = class33.field219;
                    field598 = class33.field230;
                    if (var22 >= 0) {
                        method2741(var22);
                    }
                    method2620(Statics.field88);
                    return;
                }
            }
        }
        if ((var11 == 1 || !Statics.field4383 && var11 == 4) && this.method1472()) {
            var11 = 2;
        }
        if ((var11 == 1 || !Statics.field4383 && var11 == 4) && field626 > 0) {
            method989(var22);
        }
        if (var11 == 2 && field626 > 0) {
            this.method1029(class33.field219, class33.field230);
        }
    }

    @ObfuscatedName("client.hr(B)Z")
    public final boolean method1472() {
        int var1 = field626 - 1;
        return (field624 && field626 > 2 || method260(var1)) && !field634[var1];
    }

    @ObfuscatedName("client.hk(III)V")
    public final void method1029(int arg0, int arg1) {
        method2381(arg0, arg1);
        int var3 = arg0 - field752;
        int var4 = arg1 - field753;
        Statics.field69.method3758(Statics.field3173, var3, var4, false);
        field664 = true;
    }

    @ObfuscatedName("ca.he(III)V")
    public static void method2381(int arg0, int arg1) {
        int var2 = Statics.field2706.method5716(class309.field3733);
        for (int var3 = 0; var3 < field626; var3++) {
            int var4 = Statics.field2706.method5716(method958(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field626 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field32) {
            var6 = Statics.field32 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field2650) {
            var7 = Statics.field2650 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field1775 = var6;
        Statics.field2 = var7;
        Statics.field1562 = var2;
        Statics.field2669 = field626 * 15 + 22;
    }

    @ObfuscatedName("e.hu(II)Z")
    public static final boolean method260(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field561[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bt.hv(II)V")
    public static final void method989(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field475[arg0];
        int var2 = field628[arg0];
        int var3 = field561[arg0];
        int var4 = field630[arg0];
        int var5 = field631[arg0];
        String var6 = field632[arg0];
        String var7 = field606[arg0];
        method5831(var1, var2, var3, var4, var5, var6, var7, class33.field219, class33.field230);
    }

    @ObfuscatedName("my.hm(IIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method5831(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 5) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var9 = class265.method349(class263.field2944, field536.field1339);
            var9.field3039.method7171(class24.field135[82] ? 1 : 0);
            var9.field3039.method6969(Statics.field31 + arg1);
            var9.field3039.method6940(arg3);
            var9.field3039.method6913(Statics.field405 + arg0);
            field536.method2330(var9);
        }
        if (arg2 == 1001) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var10 = class265.method349(class263.field2966, field536.field1339);
            var10.field3039.method6913(Statics.field31 + arg1);
            var10.field3039.method6913(Statics.field405 + arg0);
            var10.field3039.method6912(class24.field135[82] ? 1 : 0);
            var10.field3039.method6913(arg3);
            field536.method2330(var10);
        }
        if (arg2 == 58) {
            class295 var11 = class295.method2636(arg1, arg0);
            if (var11 != null) {
                class265 var12 = class265.method349(class263.field2972, field536.field1339);
                var12.field3039.method6940(arg0);
                var12.field3039.method6980(arg1);
                var12.field3039.method6968(field647);
                var12.field3039.method6966(Statics.field3293);
                var12.field3039.method6969(field646);
                var12.field3039.method6913(arg4);
                field536.method2330(var12);
            }
        }
        if (arg2 == 4) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var13 = class265.method349(class263.field2955, field536.field1339);
            var13.field3039.method6969(arg3);
            var13.field3039.method6969(Statics.field405 + arg0);
            var13.field3039.method6968(Statics.field31 + arg1);
            var13.field3039.method7171(class24.field135[82] ? 1 : 0);
            field536.method2330(var13);
        }
        if (arg2 == 42) {
            class265 var14 = class265.method349(class263.field3002, field536.field1339);
            var14.field3039.method6966(arg1);
            var14.field3039.method6913(arg0);
            var14.field3039.method6940(arg4);
            field536.method2330(var14);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 48) {
            class85 var15 = field604[arg3];
            if (var15 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var16 = class265.method349(class263.field2962, field536.field1339);
                var16.field3039.method6912(class24.field135[82] ? 1 : 0);
                var16.field3039.method6968(arg3);
                field536.method2330(var16);
            }
        }
        if (arg2 == 8) {
            class92 var17 = field531[arg3];
            if (var17 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var18 = class265.method349(class263.field3020, field536.field1339);
                var18.field3039.method6960(class24.field135[82] ? 1 : 0);
                var18.field3039.method6915(Statics.field3293);
                var18.field3039.method6969(field647);
                var18.field3039.method6940(field646);
                var18.field3039.method6913(arg3);
                field536.method2330(var18);
            }
        }
        if (arg2 == 41) {
            class265 var19 = class265.method349(class263.field3024, field536.field1339);
            var19.field3039.method6966(arg1);
            var19.field3039.method6968(arg4);
            var19.field3039.method6913(arg0);
            field536.method2330(var19);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 3) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var20 = class265.method349(class263.field3007, field536.field1339);
            var20.field3039.method6913(Statics.field405 + arg0);
            var20.field3039.method6968(Statics.field31 + arg1);
            var20.field3039.method6913(arg3);
            var20.field3039.method6949(class24.field135[82] ? 1 : 0);
            field536.method2330(var20);
        }
        if (arg2 == 1004) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            class265 var21 = class265.method349(class263.field2938, field536.field1339);
            var21.field3039.method6968(arg3);
            field536.method2330(var21);
        }
        if (arg2 == 36) {
            class265 var22 = class265.method349(class263.field2997, field536.field1339);
            var22.field3039.method6966(arg1);
            var22.field3039.method6968(arg4);
            var22.field3039.method6969(arg0);
            field536.method2330(var22);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 29) {
            class265 var23 = class265.method349(class263.field2981, field536.field1339);
            var23.field3039.method6915(arg1);
            field536.method2330(var23);
            class295 var24 = class295.method3238(arg1);
            if (var24 != null && var24.field3486 != null && var24.field3486[0][0] == 5) {
                int var25 = var24.field3486[0][1];
                if (class289.field3313[var25] != var24.field3488[0]) {
                    class289.field3313[var25] = var24.field3488[0];
                    method5095(var25);
                }
            }
        }
        if (arg2 == 35) {
            class265 var26 = class265.method349(class263.field2946, field536.field1339);
            var26.field3039.method6968(arg0);
            var26.field3039.method6966(arg1);
            var26.field3039.method6913(arg4);
            field536.method2330(var26);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 45) {
            class85 var27 = field604[arg3];
            if (var27 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var28 = class265.method349(class263.field2960, field536.field1339);
                var28.field3039.method6968(arg3);
                var28.field3039.method6960(class24.field135[82] ? 1 : 0);
                field536.method2330(var28);
            }
        }
        if (arg2 == 30 && field611 == null) {
            method1290(arg1, arg0);
            field611 = class295.method2636(arg1, arg0);
            method2620(field611);
        }
        if (arg2 == 12) {
            class92 var29 = field531[arg3];
            if (var29 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var30 = class265.method349(class263.field2971, field536.field1339);
                var30.field3039.method6960(class24.field135[82] ? 1 : 0);
                var30.field3039.method6968(arg3);
                field536.method2330(var30);
            }
        }
        if (arg2 == 32) {
            class265 var31 = class265.method349(class263.field2957, field536.field1339);
            var31.field3039.method6979(arg1);
            var31.field3039.method6969(arg0);
            var31.field3039.method6915(Statics.field3293);
            var31.field3039.method6940(field646);
            var31.field3039.method6940(arg4);
            field536.method2330(var31);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 21) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var32 = class265.method349(class263.field2996, field536.field1339);
            var32.field3039.method7171(class24.field135[82] ? 1 : 0);
            var32.field3039.method6940(Statics.field31 + arg1);
            var32.field3039.method6968(arg3);
            var32.field3039.method6940(Statics.field405 + arg0);
            field536.method2330(var32);
        }
        if (arg2 == 18) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var33 = class265.method349(class263.field2942, field536.field1339);
            var33.field3039.method6969(arg3);
            var33.field3039.method6913(Statics.field405 + arg0);
            var33.field3039.method6969(Statics.field31 + arg1);
            var33.field3039.method6912(class24.field135[82] ? 1 : 0);
            field536.method2330(var33);
        }
        if (arg2 == 43) {
            class265 var34 = class265.method349(class263.field2964, field536.field1339);
            var34.field3039.method6940(arg0);
            var34.field3039.method6968(arg4);
            var34.field3039.method6979(arg1);
            field536.method2330(var34);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 24) {
            class295 var35 = class295.method3238(arg1);
            if (var35 != null) {
                boolean var36 = true;
                if (var35.field3362 > 0) {
                    var36 = method258(var35);
                }
                if (var36) {
                    class265 var37 = class265.method349(class263.field2981, field536.field1339);
                    var37.field3039.method6915(arg1);
                    field536.method2330(var37);
                }
            }
        }
        if (arg2 == 37) {
            class265 var38 = class265.method349(class263.field2939, field536.field1339);
            var38.field3039.method6940(arg4);
            var38.field3039.method6980(arg1);
            var38.field3039.method6968(arg0);
            field536.method2330(var38);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 1) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var39 = class265.method349(class263.field2959, field536.field1339);
            var39.field3039.method6940(Statics.field405 + arg0);
            var39.field3039.method6968(Statics.field865);
            var39.field3039.method6968(Statics.field31 + arg1);
            var39.field3039.method7171(class24.field135[82] ? 1 : 0);
            var39.field3039.method6969(Statics.field923);
            var39.field3039.method6980(Statics.field1682);
            var39.field3039.method6968(arg3);
            field536.method2330(var39);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field3026.method6610(arg2, arg3, new class290(arg0), new class290(arg1));
        }
        if (arg2 == 2) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var40 = class265.method349(class263.field2937, field536.field1339);
            var40.field3039.method6968(field646);
            var40.field3039.method6913(Statics.field31 + arg1);
            var40.field3039.method6968(Statics.field405 + arg0);
            var40.field3039.method6913(field647);
            var40.field3039.method6980(Statics.field3293);
            var40.field3039.method6940(arg3);
            var40.field3039.method6949(class24.field135[82] ? 1 : 0);
            field536.method2330(var40);
        }
        if (arg2 == 49) {
            class85 var41 = field604[arg3];
            if (var41 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var42 = class265.method349(class263.field2953, field536.field1339);
                var42.field3039.method7171(class24.field135[82] ? 1 : 0);
                var42.field3039.method6940(arg3);
                field536.method2330(var42);
            }
        }
        if (arg2 == 17) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var43 = class265.method349(class263.field3019, field536.field1339);
            var43.field3039.method6912(class24.field135[82] ? 1 : 0);
            var43.field3039.method6979(Statics.field3293);
            var43.field3039.method6969(field646);
            var43.field3039.method6913(field647);
            var43.field3039.method6968(Statics.field31 + arg1);
            var43.field3039.method6940(Statics.field405 + arg0);
            var43.field3039.method6940(arg3);
            field536.method2330(var43);
        }
        if (arg2 == 51) {
            class85 var44 = field604[arg3];
            if (var44 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var45 = class265.method349(class263.field2954, field536.field1339);
                var45.field3039.method6913(arg3);
                var45.field3039.method7171(class24.field135[82] ? 1 : 0);
                field536.method2330(var45);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class295 var46 = class295.method2636(arg1, arg0);
            if (var46 != null) {
                method5125(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 1005) {
            class295 var47 = class295.method3238(arg1);
            if (var47 == null || var47.field3493[arg0] < 100000) {
                class265 var48 = class265.method349(class263.field2938, field536.field1339);
                var48.field3039.method6968(arg4);
                field536.method2330(var48);
            } else {
                class99.method2996(27, "", var47.field3493[arg0] + " x " + class188.method2231(arg4).field2110);
            }
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 14) {
            class85 var49 = field604[arg3];
            if (var49 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var50 = class265.method349(class263.field2977, field536.field1339);
                var50.field3039.method6968(Statics.field865);
                var50.field3039.method6969(Statics.field923);
                var50.field3039.method6912(class24.field135[82] ? 1 : 0);
                var50.field3039.method6969(arg3);
                var50.field3039.method6980(Statics.field1682);
                field536.method2330(var50);
            }
        }
        if (arg2 == 23) {
            if (field664) {
                Statics.field69.method3746();
            } else {
                Statics.field69.method3758(Statics.field3173, arg0, arg1, true);
            }
        }
        if (arg2 == 47) {
            class85 var51 = field604[arg3];
            if (var51 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var52 = class265.method349(class263.field2958, field536.field1339);
                var52.field3039.method6940(arg3);
                var52.field3039.method6960(class24.field135[82] ? 1 : 0);
                field536.method2330(var52);
            }
        }
        if (arg2 == 40) {
            class265 var53 = class265.method349(class263.field2919, field536.field1339);
            var53.field3039.method6968(arg4);
            var53.field3039.method6966(arg1);
            var53.field3039.method6940(arg0);
            field536.method2330(var53);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 11) {
            class92 var54 = field531[arg3];
            if (var54 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var55 = class265.method349(class263.field2993, field536.field1339);
                var55.field3039.method6940(arg3);
                var55.field3039.method6949(class24.field135[82] ? 1 : 0);
                field536.method2330(var55);
            }
        }
        if (arg2 == 16) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var56 = class265.method349(class263.field2980, field536.field1339);
            var56.field3039.method6940(arg3);
            var56.field3039.method6980(Statics.field1682);
            var56.field3039.method6960(class24.field135[82] ? 1 : 0);
            var56.field3039.method6913(Statics.field923);
            var56.field3039.method6913(Statics.field865);
            var56.field3039.method6969(Statics.field405 + arg0);
            var56.field3039.method6968(Statics.field31 + arg1);
            field536.method2330(var56);
        }
        if (arg2 == 44) {
            class85 var57 = field604[arg3];
            if (var57 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var58 = class265.method349(class263.field2935, field536.field1339);
                var58.field3039.method6960(class24.field135[82] ? 1 : 0);
                var58.field3039.method6940(arg3);
                field536.method2330(var58);
            }
        }
        if (arg2 == 50) {
            class85 var59 = field604[arg3];
            if (var59 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var60 = class265.method349(class263.field3001, field536.field1339);
                var60.field3039.method6912(class24.field135[82] ? 1 : 0);
                var60.field3039.method6969(arg3);
                field536.method2330(var60);
            }
        }
        if (arg2 == 26) {
            method4480();
        }
        if (arg2 == 34) {
            class265 var61 = class265.method349(class263.field2970, field536.field1339);
            var61.field3039.method6913(arg4);
            var61.field3039.method6915(arg1);
            var61.field3039.method6940(arg0);
            field536.method2330(var61);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 10) {
            class92 var62 = field531[arg3];
            if (var62 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var63 = class265.method349(class263.field2932, field536.field1339);
                var63.field3039.method6949(class24.field135[82] ? 1 : 0);
                var63.field3039.method6968(arg3);
                field536.method2330(var63);
            }
        }
        if (arg2 == 31) {
            class265 var64 = class265.method349(class263.field3017, field536.field1339);
            var64.field3039.method6968(arg0);
            var64.field3039.method6915(Statics.field1682);
            var64.field3039.method6980(arg1);
            var64.field3039.method6913(Statics.field865);
            var64.field3039.method6968(arg4);
            var64.field3039.method6913(Statics.field923);
            field536.method2330(var64);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 22) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var65 = class265.method349(class263.field3014, field536.field1339);
            var65.field3039.method6940(Statics.field31 + arg1);
            var65.field3039.method6969(Statics.field405 + arg0);
            var65.field3039.method6960(class24.field135[82] ? 1 : 0);
            var65.field3039.method6968(arg3);
            field536.method2330(var65);
        }
        if (arg2 == 20) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var66 = class265.method349(class263.field2923, field536.field1339);
            var66.field3039.method6913(arg3);
            var66.field3039.method6969(Statics.field31 + arg1);
            var66.field3039.method6968(Statics.field405 + arg0);
            var66.field3039.method6949(class24.field135[82] ? 1 : 0);
            field536.method2330(var66);
        }
        if (arg2 == 28) {
            class265 var67 = class265.method349(class263.field2981, field536.field1339);
            var67.field3039.method6915(arg1);
            field536.method2330(var67);
            class295 var68 = class295.method3238(arg1);
            if (var68 != null && var68.field3486 != null && var68.field3486[0][0] == 5) {
                int var69 = var68.field3486[0][1];
                class289.field3313[var69] = 1 - class289.field3313[var69];
                method5095(var69);
            }
        }
        if (arg2 == 7) {
            class92 var70 = field531[arg3];
            if (var70 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var71 = class265.method349(class263.field2965, field536.field1339);
                var71.field3039.method6969(arg3);
                var71.field3039.method7171(class24.field135[82] ? 1 : 0);
                var71.field3039.method6968(Statics.field865);
                var71.field3039.method6968(Statics.field923);
                var71.field3039.method6979(Statics.field1682);
                field536.method2330(var71);
            }
        }
        if (arg2 == 33) {
            class265 var72 = class265.method349(class263.field2978, field536.field1339);
            var72.field3039.method6979(arg1);
            var72.field3039.method6968(arg4);
            var72.field3039.method6968(arg0);
            field536.method2330(var72);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 39) {
            class265 var73 = class265.method349(class263.field2917, field536.field1339);
            var73.field3039.method6969(arg4);
            var73.field3039.method6979(arg1);
            var73.field3039.method6913(arg0);
            field536.method2330(var73);
            field594 = 0;
            Statics.field2635 = class295.method3238(arg1);
            field595 = arg0;
        }
        if (arg2 == 46) {
            class85 var74 = field604[arg3];
            if (var74 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var75 = class265.method349(class263.field2982, field536.field1339);
                var75.field3039.method6968(arg3);
                var75.field3039.method6960(class24.field135[82] ? 1 : 0);
                field536.method2330(var75);
            }
        }
        if (arg2 == 38) {
            method574();
            class295 var76 = class295.method3238(arg1);
            field484 = 1;
            Statics.field865 = arg0;
            Statics.field1682 = arg1;
            Statics.field923 = arg4;
            method2620(var76);
            field643 = class93.method2932(16748608) + class188.method2231(arg4).field2110 + class93.method2932(16777215);
            if (field643 == null) {
                field643 = class309.field3624;
            }
            return;
        }
        if (arg2 == 13) {
            class92 var77 = field531[arg3];
            if (var77 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var78 = class265.method349(class263.field2989, field536.field1339);
                var78.field3039.method6913(arg3);
                var78.field3039.method6949(class24.field135[82] ? 1 : 0);
                field536.method2330(var78);
            }
        }
        if (arg2 == 6) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var79 = class265.method349(class263.field2956, field536.field1339);
            var79.field3039.method6913(Statics.field405 + arg0);
            var79.field3039.method6912(class24.field135[82] ? 1 : 0);
            var79.field3039.method6969(arg3);
            var79.field3039.method6968(Statics.field31 + arg1);
            field536.method2330(var79);
        }
        if (arg2 == 9) {
            class92 var80 = field531[arg3];
            if (var80 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var81 = class265.method349(class263.field2983, field536.field1339);
                var81.field3039.method6968(arg3);
                var81.field3039.method6912(class24.field135[82] ? 1 : 0);
                field536.method2330(var81);
            }
        }
        if (arg2 == 25) {
            class295 var82 = class295.method2636(arg1, arg0);
            if (var82 != null) {
                method574();
                method1850(arg1, arg0, class296.method5413(method3477(var82)), arg4);
                field484 = 0;
                field648 = method4474(var82);
                if (field648 == null) {
                    field648 = class309.field3624;
                }
                if (var82.field3389) {
                    field490 = var82.field3447 + class93.method2932(16777215);
                } else {
                    field490 = class93.method2932(65280) + var82.field3476 + class93.method2932(16777215);
                }
            }
            return;
        }
        if (arg2 == 1003) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            class92 var83 = field531[arg3];
            if (var83 != null) {
                class178 var84 = var83.field1261;
                if (var84.field1943 != null) {
                    var84 = var84.method3101();
                }
                if (var84 != null) {
                    class265 var85 = class265.method349(class263.field3022, field536.field1339);
                    var85.field3039.method6969(var84.field1905);
                    field536.method2330(var85);
                }
            }
        }
        if (arg2 == 1002) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            class265 var86 = class265.method349(class263.field2950, field536.field1339);
            var86.field3039.method6968(arg3);
            field536.method2330(var86);
        }
        if (arg2 == 15) {
            class85 var87 = field604[arg3];
            if (var87 != null) {
                field589 = arg7;
                field521 = arg8;
                field592 = 2;
                field591 = 0;
                field726 = arg0;
                field727 = arg1;
                class265 var88 = class265.method349(class263.field2924, field536.field1339);
                var88.field3039.method6913(field646);
                var88.field3039.method6969(arg3);
                var88.field3039.method6940(field647);
                var88.field3039.method6966(Statics.field3293);
                var88.field3039.method6912(class24.field135[82] ? 1 : 0);
                field536.method2330(var88);
            }
        }
        if (arg2 == 19) {
            field589 = arg7;
            field521 = arg8;
            field592 = 2;
            field591 = 0;
            field726 = arg0;
            field727 = arg1;
            class265 var89 = class265.method349(class263.field2999, field536.field1339);
            var89.field3039.method6968(Statics.field31 + arg1);
            var89.field3039.method6969(arg3);
            var89.field3039.method6912(class24.field135[82] ? 1 : 0);
            var89.field3039.method6968(Statics.field405 + arg0);
            field536.method2330(var89);
        }
        if (field484 != 0) {
            field484 = 0;
            method2620(class295.method3238(Statics.field1682));
        }
        if (field635) {
            method574();
        }
        if (Statics.field2635 != null && field594 == 0) {
            method2620(Statics.field2635);
        }
    }

    @ObfuscatedName("ib.hh(ILjava/lang/String;B)V")
    public static void method4561(int arg0, String arg1) {
        int var2 = class97.field1301;
        int[] var3 = class97.field1302;
        boolean var4 = false;
        class465 var5 = new class465(arg1, Statics.field2008);
        for (int var6 = 0; var6 < var2; var6++) {
            class85 var7 = field604[var3[var6]];
            if (var7 != null && Statics.field454 != var7 && var7.field1110 != null && var7.field1110.equals(var5)) {
                if (arg0 == 1) {
                    class265 var8 = class265.method349(class263.field2935, field536.field1339);
                    var8.field3039.method6960(0);
                    var8.field3039.method6940(var3[var6]);
                    field536.method2330(var8);
                } else if (arg0 == 4) {
                    class265 var9 = class265.method349(class263.field2958, field536.field1339);
                    var9.field3039.method6940(var3[var6]);
                    var9.field3039.method6960(0);
                    field536.method2330(var9);
                } else if (arg0 == 6) {
                    class265 var10 = class265.method349(class263.field2953, field536.field1339);
                    var10.field3039.method7171(0);
                    var10.field3039.method6940(var3[var6]);
                    field536.method2330(var10);
                } else if (arg0 == 7) {
                    class265 var11 = class265.method349(class263.field3001, field536.field1339);
                    var11.field3039.method6912(0);
                    var11.field3039.method6969(var3[var6]);
                    field536.method2330(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method2996(4, "", class309.field3778 + arg1);
        }
    }

    @ObfuscatedName("bo.hs(IIIII)V")
    public static void method1850(int arg0, int arg1, int arg2, int arg3) {
        class295 var4 = class295.method2636(arg0, arg1);
        if (var4 != null && var4.field3460 != null) {
            class81 var5 = new class81();
            var5.field1030 = var4;
            var5.field1037 = var4.field3460;
            class64.method4069(var5);
        }
        field647 = arg3;
        field635 = true;
        Statics.field3293 = arg0;
        field646 = arg1;
        Statics.field1674 = arg2;
        method2620(var4);
    }

    @ObfuscatedName("ae.ht(I)V")
    public static void method574() {
        if (!field635) {
            return;
        }
        class295 var0 = class295.method2636(Statics.field3293, field646);
        if (var0 != null && var0.field3425 != null) {
            class81 var1 = new class81();
            var1.field1030 = var0;
            var1.field1037 = var0.field3425;
            class64.method4069(var1);
        }
        field647 = -1;
        field635 = false;
        method2620(var0);
    }

    @ObfuscatedName("client.hq(III)V")
    public static void method1290(int arg0, int arg1) {
        class265 var2 = class265.method349(class263.field2968, field536.field1339);
        var2.field3039.method6969(arg1);
        var2.field3039.method6915(arg0);
        field536.method2330(var2);
    }

    @ObfuscatedName("ks.hw(IIIILjava/lang/String;I)V")
    public static void method5125(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class295 var5 = class295.method2636(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3469 != null) {
            class81 var6 = new class81();
            var6.field1030 = var5;
            var6.field1042 = arg0;
            var6.field1039 = arg4;
            var6.field1037 = var5.field3469;
            class64.method4069(var6);
        }
        boolean var7 = true;
        if (var5.field3362 > 0) {
            var7 = method258(var5);
        }
        if (!var7 || !Statics.method2889(method3477(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class265 var8 = class265.method349(class263.field3004, field536.field1339);
            var8.field3039.method6915(arg1);
            var8.field3039.method6913(arg2);
            var8.field3039.method6913(arg3);
            field536.method2330(var8);
        }
        if (arg0 == 2) {
            class265 var9 = class265.method349(class263.field2934, field536.field1339);
            var9.field3039.method6915(arg1);
            var9.field3039.method6913(arg2);
            var9.field3039.method6913(arg3);
            field536.method2330(var9);
        }
        if (arg0 == 3) {
            class265 var10 = class265.method349(class263.field2994, field536.field1339);
            var10.field3039.method6915(arg1);
            var10.field3039.method6913(arg2);
            var10.field3039.method6913(arg3);
            field536.method2330(var10);
        }
        if (arg0 == 4) {
            class265 var11 = class265.method349(class263.field2929, field536.field1339);
            var11.field3039.method6915(arg1);
            var11.field3039.method6913(arg2);
            var11.field3039.method6913(arg3);
            field536.method2330(var11);
        }
        if (arg0 == 5) {
            class265 var12 = class265.method349(class263.field2936, field536.field1339);
            var12.field3039.method6915(arg1);
            var12.field3039.method6913(arg2);
            var12.field3039.method6913(arg3);
            field536.method2330(var12);
        }
        if (arg0 == 6) {
            class265 var13 = class265.method349(class263.field2916, field536.field1339);
            var13.field3039.method6915(arg1);
            var13.field3039.method6913(arg2);
            var13.field3039.method6913(arg3);
            field536.method2330(var13);
        }
        if (arg0 == 7) {
            class265 var14 = class265.method349(class263.field2941, field536.field1339);
            var14.field3039.method6915(arg1);
            var14.field3039.method6913(arg2);
            var14.field3039.method6913(arg3);
            field536.method2330(var14);
        }
        if (arg0 == 8) {
            class265 var15 = class265.method349(class263.field3005, field536.field1339);
            var15.field3039.method6915(arg1);
            var15.field3039.method6913(arg2);
            var15.field3039.method6913(arg3);
            field536.method2330(var15);
        }
        if (arg0 == 9) {
            class265 var16 = class265.method349(class263.field2969, field536.field1339);
            var16.field3039.method6915(arg1);
            var16.field3039.method6913(arg2);
            var16.field3039.method6913(arg3);
            field536.method2330(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class265 var17 = class265.method349(class263.field2974, field536.field1339);
        var17.field3039.method6915(arg1);
        var17.field3039.method6913(arg2);
        var17.field3039.method6913(arg3);
        field536.method2330(var17);
    }

    @ObfuscatedName("jb.hb(Ljava/lang/String;Ljava/lang/String;IIIIIB)V")
    public static final void method4616(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method3472(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("gl.hj(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method3472(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field664 || field626 >= 500) {
            return;
        }
        field632[field626] = arg0;
        field606[field626] = arg1;
        field561[field626] = arg2;
        field630[field626] = arg3;
        field475[field626] = arg4;
        field628[field626] = arg5;
        field631[field626] = arg6;
        field634[field626] = arg7;
        field626++;
    }

    @ObfuscatedName("bu.hy(II)Ljava/lang/String;")
    public static String method958(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field606[arg0].length() > 0) {
            return field632[arg0] + class309.field3789 + field606[arg0];
        } else {
            return field632[arg0];
        }
    }

    @ObfuscatedName("ix.hd(IIIIB)V")
    public static final void method4486(int arg0, int arg1, int arg2, int arg3) {
        if (field484 == 0 && !field635) {
            Statics.method1859(class309.field3742, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class212.field2596;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = class212.method2911(var4);
                    class85 var14 = field604[field700];
                    method5398(var14, field700, var11, var13);
                }
                return;
            }
            long var15 = Statics.method6182(var8);
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    long var17 = class212.field2601[var8];
                    int var19 = (int) (var17 >>> 0 & 0x7FL);
                    int var21 = var19;
                    int var22 = class212.method3890(var8);
                    long var23 = class212.field2601[var8];
                    int var25 = (int) (var23 >>> 14 & 0x3L);
                    int var28 = class212.method2591(var8);
                    if (var25 == 2 && Statics.field69.method3739(Statics.field3173, var19, var22, var15) >= 0) {
                        class187 var29 = class187.method2907(var28);
                        if (var29.field2077 != null) {
                            var29 = var29.method3247();
                        }
                        if (var29 == null) {
                            break label277;
                        }
                        if (field484 == 1) {
                            Statics.method1859(class309.field3779, field643 + " " + class93.field1266 + " " + class93.method2932(65535) + var29.field2046, 1, var28, var19, var22);
                        } else if (!field635) {
                            String[] var30 = var29.field2072;
                            if (var30 != null) {
                                for (int var31 = 4; var31 >= 0; var31--) {
                                    if (var30[var31] != null) {
                                        short var32 = 0;
                                        if (var31 == 0) {
                                            var32 = 3;
                                        }
                                        if (var31 == 1) {
                                            var32 = 4;
                                        }
                                        if (var31 == 2) {
                                            var32 = 5;
                                        }
                                        if (var31 == 3) {
                                            var32 = 6;
                                        }
                                        if (var31 == 4) {
                                            var32 = 1001;
                                        }
                                        Statics.method1859(var30[var31], class93.method2932(65535) + var29.field2046, var32, var28, var21, var22);
                                    }
                                }
                            }
                            Statics.method1859(class309.field3660, class93.method2932(65535) + var29.field2046, 1002, var29.field2043, var21, var22);
                        } else if ((Statics.field1674 & 0x4) == 4) {
                            Statics.method1859(field648, field490 + " " + class93.field1266 + " " + class93.method2932(65535) + var29.field2046, 2, var28, var19, var22);
                        }
                    }
                    if (var25 == 1) {
                        class92 var33 = field531[var28];
                        if (var33 == null) {
                            break label277;
                        }
                        if (var33.field1261.field1907 == 1 && (var33.field1172 & 0x7F) == 64 && (var33.field1155 & 0x7F) == 64) {
                            for (int var34 = 0; var34 < field532; var34++) {
                                class92 var35 = field531[field533[var34]];
                                if (var35 != null && var33 != var35 && var35.field1261.field1907 == 1 && var33.field1172 == var35.field1172 && var33.field1155 == var35.field1155) {
                                    method2451(var35, field533[var34], var21, var22);
                                }
                            }
                            int var36 = class97.field1301;
                            int[] var37 = class97.field1302;
                            for (int var38 = 0; var38 < var36; var38++) {
                                class85 var39 = field604[var37[var38]];
                                if (var39 != null && var33.field1172 == var39.field1172 && var33.field1155 == var39.field1155) {
                                    method5398(var39, var37[var38], var21, var22);
                                }
                            }
                        }
                        method2451(var33, var28, var21, var22);
                    }
                    if (var25 == 0) {
                        class85 var40 = field604[var28];
                        if (var40 == null) {
                            break label277;
                        }
                        if ((var40.field1172 & 0x7F) == 64 && (var40.field1155 & 0x7F) == 64) {
                            for (int var41 = 0; var41 < field532; var41++) {
                                class92 var42 = field531[field533[var41]];
                                if (var42 != null && var42.field1261.field1907 == 1 && var40.field1172 == var42.field1172 && var40.field1155 == var42.field1155) {
                                    method2451(var42, field533[var41], var21, var22);
                                }
                            }
                            int var43 = class97.field1301;
                            int[] var44 = class97.field1302;
                            for (int var45 = 0; var45 < var43; var45++) {
                                class85 var46 = field604[var44[var45]];
                                if (var46 != null && var40 != var46 && var40.field1172 == var46.field1172 && var40.field1155 == var46.field1155) {
                                    method5398(var46, var44[var45], var21, var22);
                                }
                            }
                        }
                        if (field700 == var28) {
                            var4 = var15;
                        } else {
                            method5398(var40, var28, var21, var22);
                        }
                    }
                    if (var25 == 3) {
                        class335 var47 = field617[Statics.field3173][var21][var22];
                        if (var47 != null) {
                            for (class96 var48 = (class96) var47.method5424(); var48 != null; var48 = (class96) var47.method5434()) {
                                class188 var49 = class188.method2231(var48.field1294);
                                if (field484 == 1) {
                                    Statics.method1859(class309.field3779, field643 + " " + class93.field1266 + " " + class93.method2932(16748608) + var49.field2110, 16, var48.field1294, var21, var22);
                                } else if (!field635) {
                                    String[] var50 = var49.field2113;
                                    for (int var51 = 4; var51 >= 0; var51--) {
                                        if (var50 != null && var50[var51] != null) {
                                            byte var52 = 0;
                                            if (var51 == 0) {
                                                var52 = 18;
                                            }
                                            if (var51 == 1) {
                                                var52 = 19;
                                            }
                                            if (var51 == 2) {
                                                var52 = 20;
                                            }
                                            if (var51 == 3) {
                                                var52 = 21;
                                            }
                                            if (var51 == 4) {
                                                var52 = 22;
                                            }
                                            Statics.method1859(var50[var51], class93.method2932(16748608) + var49.field2110, var52, var48.field1294, var21, var22);
                                        } else if (var51 == 2) {
                                            Statics.method1859(class309.field3780, class93.method2932(16748608) + var49.field2110, 20, var48.field1294, var21, var22);
                                        }
                                    }
                                    Statics.method1859(class309.field3660, class93.method2932(16748608) + var49.field2110, 1004, var48.field1294, var21, var22);
                                } else if ((Statics.field1674 & 0x1) == 1) {
                                    Statics.method1859(field648, field490 + " " + class93.field1266 + " " + class93.method2932(16748608) + var49.field2110, 17, var48.field1294, var21, var22);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("dv.hi(Lct;IIII)V")
    public static final void method2451(class92 arg0, int arg1, int arg2, int arg3) {
        class178 var4 = arg0.field1261;
        if (field626 >= 400) {
            return;
        }
        if (var4.field1943 != null) {
            var4 = var4.method3101();
        }
        if (var4 == null || !var4.field1901 || var4.field1911 && field660 != arg1) {
            return;
        }
        String var5 = arg0.method2195();
        if (var4.field1931 != 0 && arg0.field1203 != 0) {
            int var6 = arg0.field1203 == -1 ? var4.field1931 : arg0.field1203;
            int var8 = Statics.field454.field1089;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class93.method2932(16711680);
            } else if (var9 < -6) {
                var10 = class93.method2932(16723968);
            } else if (var9 < -3) {
                var10 = class93.method2932(16740352);
            } else if (var9 < 0) {
                var10 = class93.method2932(16756736);
            } else if (var9 > 9) {
                var10 = class93.method2932(65280);
            } else if (var9 > 6) {
                var10 = class93.method2932(4259584);
            } else if (var9 > 3) {
                var10 = class93.method2932(8453888);
            } else if (var9 > 0) {
                var10 = class93.method2932(12648192);
            } else {
                var10 = class93.method2932(16776960);
            }
            var5 = var5 + var10 + " " + class93.field1269 + class309.field3692 + var6 + class93.field1270;
        }
        if (var4.field1911 && field544) {
            Statics.method1859(class309.field3660, class93.method2932(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field484 == 1) {
            Statics.method1859(class309.field3779, field643 + " " + class93.field1266 + " " + class93.method2932(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field635) {
            int var11 = var4.field1911 && field544 ? 2000 : 0;
            String[] var12 = var4.field1929;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var12[var13] != null && !var12[var13].equalsIgnoreCase(class309.field3781)) {
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
                        Statics.method1859(var12[var13], class93.method2932(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (var12[var15] != null && var12[var15].equalsIgnoreCase(class309.field3781)) {
                        short var16 = 0;
                        if (field503 != class95.field1286) {
                            if (field503 == class95.field1287 || field503 == class95.field1284 && var4.field1931 > Statics.field454.field1089) {
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
                            Statics.method1859(var12[var15], class93.method2932(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1911 || !field544) {
                Statics.method1859(class309.field3660, class93.method2932(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1674 & 0x2) == 2) {
            Statics.method1859(field648, field490 + " " + class93.field1266 + " " + class93.method2932(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("lq.hc(Lcq;IIIB)V")
    public static final void method5398(class85 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field454 == arg0 || field626 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1083 == 0) {
            String var4 = arg0.field1088[0] + arg0.field1110 + arg0.field1088[1];
            int var5 = arg0.field1089;
            int var6 = Statics.field454.field1089;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class93.method2932(16711680);
            } else if (var7 < -6) {
                var8 = class93.method2932(16723968);
            } else if (var7 < -3) {
                var8 = class93.method2932(16740352);
            } else if (var7 < 0) {
                var8 = class93.method2932(16756736);
            } else if (var7 > 9) {
                var8 = class93.method2932(65280);
            } else if (var7 > 6) {
                var8 = class93.method2932(4259584);
            } else if (var7 > 3) {
                var8 = class93.method2932(8453888);
            } else if (var7 > 0) {
                var8 = class93.method2932(12648192);
            } else {
                var8 = class93.method2932(16776960);
            }
            var9 = var4 + var8 + " " + class93.field1269 + class309.field3692 + arg0.field1089 + class93.field1270 + arg0.field1088[2];
        } else {
            var9 = arg0.field1088[0] + arg0.field1110 + arg0.field1088[1] + " " + class93.field1269 + class309.field3881 + arg0.field1083 + class93.field1270 + arg0.field1088[2];
        }
        if (field484 == 1) {
            Statics.method1859(class309.field3779, field643 + " " + class93.field1266 + " " + class93.method2932(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field635) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field613[var10] != null) {
                    short var11 = 0;
                    if (field613[var10].equalsIgnoreCase(class309.field3781)) {
                        if (field502 == class95.field1286) {
                            continue;
                        }
                        if (field502 == class95.field1287 || field502 == class95.field1284 && arg0.field1089 > Statics.field454.field1089) {
                            var11 = 2000;
                        }
                        if (Statics.field454.field1103 == 0 || arg0.field1103 == 0) {
                            if (field502 == class95.field1288 && arg0.method2016()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field454.field1103 == arg0.field1103) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field614[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field612[var10] + var11;
                    Statics.method1859(field613[var10], class93.method2932(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1674 & 0x8) == 8) {
            Statics.method1859(field648, field490 + " " + class93.field1266 + " " + class93.method2932(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field626; var14++) {
            if (field561[var14] == 23) {
                field606[var14] = class93.method2932(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bb.iv(IIIIIIIII)V")
    public static final void method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class295.method3187(arg0)) {
            Statics.field841 = null;
            method2912(Statics.field4250[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field841 != null) {
                method2912(Statics.field841, -1412584499, arg1, arg2, arg3, arg4, Statics.field1250, Statics.field1375, arg7);
                Statics.field841 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field644[var8] = true;
            }
        } else {
            field644[arg7] = true;
        }
    }

    @ObfuscatedName("ff.if([Lkn;IIIIIIIIS)V")
    public static final void method2912(class295[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class453.method7238(arg2, arg3, arg4, arg5);
        class201.method3640();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class295 var10 = arg0[var9];
            if (var10 != null && (var10.field3377 == arg1 || arg1 == -1412584499 && field587 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field702[field697] = var10.field3371 + arg6;
                    field509[field697] = var10.field3446 + arg7;
                    field704[field697] = var10.field3373;
                    field747[field697] = var10.field3427;
                    var11 = ++field697 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3505 = var11;
                var10.field3506 = field487;
                if (!var10.field3389 || !method1917(var10)) {
                    if (var10.field3362 > 0) {
                        Statics.method5881(var10);
                    }
                    int var12 = var10.field3371 + arg6;
                    int var13 = var10.field3446 + arg7;
                    int var14 = var10.field3428;
                    if (field587 == var10) {
                        if (arg1 != -1412584499 && !var10.field3491) {
                            Statics.field841 = arg0;
                            Statics.field1250 = arg6;
                            Statics.field1375 = arg7;
                            continue;
                        }
                        if (field674 && field570) {
                            int var15 = class33.field220;
                            int var16 = class33.field228;
                            int var17 = var15 - field665;
                            int var18 = var16 - field642;
                            if (var17 < field761) {
                                var17 = field761;
                            }
                            if (var10.field3373 + var17 > field761 + field515.field3373) {
                                var17 = field761 + field515.field3373 - var10.field3373;
                            }
                            if (var18 < field670) {
                                var18 = field670;
                            }
                            if (var10.field3427 + var18 > field670 + field515.field3427) {
                                var18 = field670 + field515.field3427 - var10.field3427;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3491) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3360 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3360 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3373 + var12;
                        int var26 = var10.field3427 + var13;
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
                        int var29 = var10.field3373 + var12;
                        int var30 = var10.field3427 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3389 || var19 < var21 && var20 < var22) {
                        if (var10.field3362 != 0) {
                            if (var10.field3362 == 1336) {
                                if (Statics.field4303.method2098()) {
                                    var13 += 15;
                                    Statics.field250.method5718("Fps:" + field207, var10.field3373 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field480) {
                                        var33 = 16711680;
                                    }
                                    Statics.field250.method5718("Mem:" + var32 + "k", var10.field3373 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3362 == 1337) {
                                field639 = var12;
                                field640 = var13;
                                method988(var12, var13, var10.field3373, var10.field3427);
                                field644[var10.field3505] = true;
                                class453.method7238(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3362 == 1338) {
                                method2746(var10, var12, var13, var11);
                                class453.method7238(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3362 == 1339) {
                                method2617(var10, var12, var13, var11);
                                class453.method7238(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3362 == 1400) {
                                Statics.field3026.method6467(var12, var13, var10.field3373, var10.field3427, field487);
                            }
                            if (var10.field3362 == 1401) {
                                Statics.field3026.method6628(var12, var13, var10.field3373, var10.field3427);
                            }
                            if (var10.field3362 == 1402) {
                                Statics.field2910.method2056(var12, field487);
                            }
                        }
                        if (var10.field3360 == 0) {
                            if (!var10.field3389 && method1917(var10) && Statics.field1406 != var10) {
                                continue;
                            }
                            if (!var10.field3389) {
                                if (var10.field3380 > var10.field3382 - var10.field3427) {
                                    var10.field3380 = var10.field3382 - var10.field3427;
                                }
                                if (var10.field3380 < 0) {
                                    var10.field3380 = 0;
                                }
                            }
                            method2912(arg0, var10.field3358, var19, var20, var21, var22, var12 - var10.field3379, var13 - var10.field3380, var11);
                            if (var10.field3398 != null) {
                                method2912(var10.field3398, var10.field3358, var19, var20, var21, var22, var12 - var10.field3379, var13 - var10.field3380, var11);
                            }
                            class80 var34 = (class80) field651.method6695((long) var10.field3358);
                            if (var34 != null) {
                                method961(var34.field1026, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class453.method7238(arg2, arg3, arg4, arg5);
                            class201.method3640();
                        } else if (var10.field3360 == 11) {
                            if (method1917(var10) && Statics.field1406 != var10) {
                                continue;
                            }
                            if (var10.field3398 != null) {
                                method2912(var10.field3398, var10.field3358, var19, var20, var21, var22, var12 - var10.field3379, var13 - var10.field3380, var11);
                            }
                            class453.method7238(arg2, arg3, arg4, arg5);
                            class201.method3640();
                        }
                        if (field545 || field701[var11] || field706 > 1) {
                            if (var10.field3360 == 0 && !var10.field3389 && var10.field3382 > var10.field3427) {
                                Statics.method6803(var10.field3373 + var12, var13, var10.field3380, var10.field3427, var10.field3382);
                            }
                            if (var10.field3360 != 1) {
                                if (var10.field3360 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3407; var36++) {
                                        for (int var37 = 0; var37 < var10.field3369; var37++) {
                                            int var38 = (var10.field3448 + 32) * var37 + var12;
                                            int var39 = (var10.field3368 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3406[var35];
                                                var39 += var10.field3429[var35];
                                            }
                                            if (var10.field3492[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3492[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field88 == var10 && field596 == var35) {
                                                    class457 var43;
                                                    if (field484 == 1 && Statics.field865 == var35 && Statics.field1682 == var10.field3358) {
                                                        var43 = class188.method1975(var42, var10.field3493[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class188.method1975(var42, var10.field3493[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method2620(var10);
                                                    } else if (Statics.field88 == var10 && field596 == var35) {
                                                        int var44 = class33.field220 - field610;
                                                        int var45 = class33.field228 - field598;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field601 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method7358(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class295 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class453.field4774 && var46.field3380 > 0) {
                                                                int var47 = field600 * (class453.field4774 - var39 - var45) / 3;
                                                                if (var47 > field600 * 10) {
                                                                    var47 = field600 * 10;
                                                                }
                                                                if (var47 > var46.field3380) {
                                                                    var47 = var46.field3380;
                                                                }
                                                                var46.field3380 -= var47;
                                                                field598 += var47;
                                                                method2620(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class453.field4773 && var46.field3380 < var46.field3382 - var46.field3427) {
                                                                int var48 = field600 * (var39 + var45 + 32 - class453.field4773) / 3;
                                                                if (var48 > field600 * 10) {
                                                                    var48 = field600 * 10;
                                                                }
                                                                if (var48 > var46.field3382 - var46.field3427 - var46.field3380) {
                                                                    var48 = var46.field3382 - var46.field3427 - var46.field3380;
                                                                }
                                                                var46.field3380 += var48;
                                                                field598 -= var48;
                                                                method2620(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field2635 == var10 && field595 == var35) {
                                                        var43.method7358(var38, var39, 128);
                                                    } else {
                                                        var43.method7352(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3487 != null && var35 < 20) {
                                                class457 var49 = var10.method4982(var35);
                                                if (var49 != null) {
                                                    var49.method7352(var38, var39);
                                                } else if (class295.field3356) {
                                                    method2620(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3360 == 3) {
                                    int var50;
                                    if (method4349(var10)) {
                                        var50 = var10.field3384;
                                        if (Statics.field1406 == var10 && var10.field3404 != 0) {
                                            var50 = var10.field3404;
                                        }
                                    } else {
                                        var50 = var10.field3383;
                                        if (Statics.field1406 == var10 && var10.field3385 != 0) {
                                            var50 = var10.field3385;
                                        }
                                    }
                                    if (var10.field3387) {
                                        switch(var10.field3496.field4784) {
                                            case 1:
                                                class453.method7295(var12, var13, var10.field3373, var10.field3427, var10.field3383, var10.field3384);
                                                break;
                                            case 2:
                                                class453.method7313(var12, var13, var10.field3373, var10.field3427, var10.field3383, var10.field3384, 255 - (var10.field3428 & 0xFF), 255 - (var10.field3390 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class453.method7245(var12, var13, var10.field3373, var10.field3427, var50);
                                                } else {
                                                    class453.method7312(var12, var13, var10.field3373, var10.field3427, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class453.method7261(var12, var13, var10.field3373, var10.field3427, var50);
                                    } else {
                                        class453.method7246(var12, var13, var10.field3373, var10.field3427, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3360 == 4) {
                                    class350 var51 = var10.method4980();
                                    if (var51 != null) {
                                        String var52 = var10.field3461;
                                        int var53;
                                        if (method4349(var10)) {
                                            var53 = var10.field3384;
                                            if (Statics.field1406 == var10 && var10.field3404 != 0) {
                                                var53 = var10.field3404;
                                            }
                                            if (var10.field3421.length() > 0) {
                                                var52 = var10.field3421;
                                            }
                                        } else {
                                            var53 = var10.field3383;
                                            if (Statics.field1406 == var10 && var10.field3385 != 0) {
                                                var53 = var10.field3385;
                                            }
                                        }
                                        if (var10.field3389 && var10.field3375 != -1) {
                                            class188 var54 = class188.method2231(var10.field3375);
                                            var52 = var54.field2110;
                                            if (var52 == null) {
                                                var52 = class309.field3624;
                                            }
                                            if ((var54.field2134 == 1 || var10.field3395 != 1) && var10.field3395 != -1) {
                                                var52 = class93.method2932(16748608) + var52 + class93.field1273 + " " + 'x' + method1928(var10.field3395);
                                            }
                                        }
                                        if (field611 == var10) {
                                            var52 = class309.field3787;
                                            var53 = var10.field3383;
                                        }
                                        if (!var10.field3389) {
                                            var52 = Statics.method930(var52, var10);
                                        }
                                        var51.method5774(var52, var12, var13, var10.field3373, var10.field3427, var53, var10.field3484 ? 0 : -1, var10.field3423, var10.field3444, var10.field3422);
                                    } else if (class295.field3356) {
                                        method2620(var10);
                                    }
                                } else if (var10.field3360 == 5) {
                                    if (var10.field3389) {
                                        class457 var56;
                                        if (var10.field3375 == -1) {
                                            var56 = var10.method5010(false, Statics.field1771);
                                        } else {
                                            var56 = class188.method1975(var10.field3375, var10.field3395, var10.field3386, var10.field3399, var10.field3418, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4800;
                                            int var58 = var56.field4801;
                                            if (var10.field3397) {
                                                class453.method7239(var12, var13, var10.field3373 + var12, var10.field3427 + var13);
                                                int var59 = (var10.field3373 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3427 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3396 != 0) {
                                                            var56.method7371(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3396, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method7352(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method7358(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class453.method7238(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3373 * 4096 / var57;
                                                if (var10.field3396 != 0) {
                                                    var56.method7371(var10.field3373 / 2 + var12, var10.field3427 / 2 + var13, var10.field3396, var63);
                                                } else if (var14 != 0) {
                                                    var56.method7363(var12, var13, var10.field3373, var10.field3427, 256 - (var14 & 0xFF));
                                                } else if (var10.field3373 == var57 && var10.field3427 == var58) {
                                                    var56.method7352(var12, var13);
                                                } else {
                                                    var56.method7354(var12, var13, var10.field3373, var10.field3427);
                                                }
                                            }
                                        } else if (class295.field3356) {
                                            method2620(var10);
                                        }
                                    } else {
                                        class457 var55 = var10.method5010(method4349(var10), Statics.field1771);
                                        if (var55 != null) {
                                            var55.method7352(var12, var13);
                                        } else if (class295.field3356) {
                                            method2620(var10);
                                        }
                                    }
                                } else if (var10.field3360 == 6) {
                                    boolean var64 = method4349(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3417;
                                    } else {
                                        var65 = var10.field3402;
                                    }
                                    class211 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3375 != -1) {
                                        class188 var68 = class188.method2231(var10.field3375);
                                        if (var68 != null) {
                                            class188 var69 = var68.method3325(var10.field3395);
                                            var66 = var69.method3295(1);
                                            if (var66 == null) {
                                                method2620(var10);
                                            } else {
                                                var66.method3930();
                                                var67 = var66.field2449 / 2;
                                            }
                                        }
                                    } else if (var10.field3424 == 5) {
                                        if (var10.field3403 == 0) {
                                            var66 = field695.method4965((class190) null, -1, (class190) null, -1);
                                        } else {
                                            var66 = Statics.field454.method1748();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4969((class190) null, -1, var64, Statics.field454.field1084);
                                        if (var66 == null && class295.field3356) {
                                            method2620(var10);
                                        }
                                    } else {
                                        class190 var70 = class190.method5853(var65);
                                        var66 = var10.method4969(var70, var10.field3435, var64, Statics.field454.field1084);
                                        if (var66 == null && class295.field3356) {
                                            method2620(var10);
                                        }
                                    }
                                    class201.method3667(var10.field3373 / 2 + var12, var10.field3427 / 2 + var13);
                                    int var71 = var10.field3465 * class201.field2346[var10.field3410] >> 16;
                                    int var72 = var10.field3465 * class201.field2363[var10.field3410] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3389) {
                                            var66.method3930();
                                            if (var10.field3416) {
                                                var66.method3949(0, var10.field3472, var10.field3412, var10.field3410, var10.field3408, var10.field3409 + var67 + var71, var10.field3409 + var72, var10.field3465);
                                            } else {
                                                var66.method4018(0, var10.field3472, var10.field3412, var10.field3410, var10.field3408, var10.field3409 + var67 + var71, var10.field3409 + var72);
                                            }
                                        } else {
                                            var66.method4018(0, var10.field3472, 0, var10.field3410, 0, var71, var72);
                                        }
                                    }
                                    class201.method3644();
                                } else {
                                    if (var10.field3360 == 7) {
                                        class350 var73 = var10.method4980();
                                        if (var73 == null) {
                                            if (class295.field3356) {
                                                method2620(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field3407; var75++) {
                                            for (int var76 = 0; var76 < var10.field3369; var76++) {
                                                if (var10.field3492[var74] > 0) {
                                                    class188 var77 = class188.method2231(var10.field3492[var74] - 1);
                                                    String var78;
                                                    if (var77.field2134 != 1 && var10.field3493[var74] == 1) {
                                                        var78 = class93.method2932(16748608) + var77.field2110 + class93.field1273;
                                                    } else {
                                                        var78 = class93.method2932(16748608) + var77.field2110 + class93.field1273 + " " + 'x' + method1928(var10.field3493[var74]);
                                                    }
                                                    int var79 = (var10.field3448 + 115) * var76 + var12;
                                                    int var80 = (var10.field3368 + 12) * var75 + var13;
                                                    if (var10.field3423 == 0) {
                                                        var73.method5725(var78, var79, var80, var10.field3383, var10.field3484 ? 0 : -1);
                                                    } else if (var10.field3423 == 1) {
                                                        var73.method5719(var78, var10.field3373 / 2 + var79, var80, var10.field3383, var10.field3484 ? 0 : -1);
                                                    } else {
                                                        var73.method5718(var78, var10.field3373 + var79 - 1, var80, var10.field3383, var10.field3484 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field3360 == 8 && Statics.field1891 == var10 && field687 == field641) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class350 var83 = Statics.field250;
                                        String var84 = var10.field3461;
                                        String var85 = Statics.method930(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class93.field1272);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5716(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field4184 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3373 + var12 - 5 - var81;
                                        int var90 = var10.field3427 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class453.method7245(var89, var90, var81, var82, 16777120);
                                        class453.method7261(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3461;
                                        int var92 = var83.field4184 + var90 + 2;
                                        String var93 = Statics.method930(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class93.field1272);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5725(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field4184 + 1;
                                        }
                                    }
                                    if (var10.field3360 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field3451) {
                                            var96 = var12;
                                            var97 = var10.field3427 + var13;
                                            var98 = var10.field3373 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3373 + var12;
                                            var99 = var10.field3427 + var13;
                                        }
                                        if (var10.field3391 == 1) {
                                            class453.method7255(var96, var97, var98, var99, var10.field3383);
                                        } else {
                                            method1965(var96, var97, var98, var99, var10.field3383, var10.field3391);
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

    @ObfuscatedName("cl.ii(IIIIIII)V")
    public static final void method1965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class453.field4776;
        int var18 = arg1 - class453.field4774;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class201.method3660(var19, var20, var21);
        class201.method3610(var23, var24, var25, var19, var20, var21, arg4);
        class201.method3660(var19, var21, var22);
        class201.method3610(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bk.iu(II)Ljava/lang/String;")
    public static final String method1928(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class93.field1271 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class93.method2932(65408) + var1.substring(0, var1.length() - 8) + class309.field3790 + " " + class93.field1269 + var1 + class93.field1270 + class93.field1273;
        } else if (var1.length() > 6) {
            return " " + class93.method2932(16777215) + var1.substring(0, var1.length() - 4) + class309.field3792 + " " + class93.field1269 + var1 + class93.field1270 + class93.field1273;
        } else {
            return " " + class93.method2932(16776960) + var1 + class93.field1273;
        }
    }

    @ObfuscatedName("client.ig(ZI)V")
    public final void method1030(boolean arg0) {
        int var2 = field650;
        int var3 = Statics.field32;
        int var4 = Statics.field2650;
        if (class295.method3187(var2)) {
            method351(Statics.field4250[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ik(Lkn;I)V")
    public void method1031(class295 arg0) {
        class295 var2 = arg0.field3377 == -1 ? null : class295.method3238(arg0.field3377);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field32;
            var4 = Statics.field2650;
        } else {
            var3 = var2.field3373;
            var4 = var2.field3427;
        }
        method983(arg0, var3, var4, false);
        method2429(arg0, var3, var4);
    }

    @ObfuscatedName("fm.ix([Lkn;Lkn;ZB)V")
    public static void method3148(class295[] arg0, class295 arg1, boolean arg2) {
        int var3 = arg1.field3381 == 0 ? arg1.field3373 : arg1.field3381;
        int var4 = arg1.field3382 == 0 ? arg1.field3427 : arg1.field3382;
        method351(arg0, arg1.field3358, var3, var4, arg2);
        if (arg1.field3398 != null) {
            method351(arg1.field3398, arg1.field3358, var3, var4, arg2);
        }
        class80 var5 = (class80) field651.method6695((long) arg1.field3358);
        if (var5 != null) {
            int var6 = var5.field1026;
            if (class295.method3187(var6)) {
                method351(Statics.field4250[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3362 == 1337) {
        }
    }

    @ObfuscatedName("g.il([Lkn;IIIZI)V")
    public static void method351(class295[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class295 var6 = arg0[var5];
            if (var6 != null && var6.field3377 == arg1) {
                method983(var6, arg2, arg3, arg4);
                method2429(var6, arg2, arg3);
                if (var6.field3379 > var6.field3381 - var6.field3373) {
                    var6.field3379 = var6.field3381 - var6.field3373;
                }
                if (var6.field3379 < 0) {
                    var6.field3379 = 0;
                }
                if (var6.field3380 > var6.field3382 - var6.field3427) {
                    var6.field3380 = var6.field3382 - var6.field3427;
                }
                if (var6.field3380 < 0) {
                    var6.field3380 = 0;
                }
                if (var6.field3360 == 0) {
                    method3148(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bb.it(Lkn;IIZI)V")
    public static void method983(class295 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3373;
        int var5 = arg0.field3427;
        if (arg0.field3463 == 0) {
            arg0.field3373 = arg0.field3369;
        } else if (arg0.field3463 == 1) {
            arg0.field3373 = arg1 - arg0.field3369;
        } else if (arg0.field3463 == 2) {
            arg0.field3373 = arg0.field3369 * arg1 >> 14;
        }
        if (arg0.field3366 == 0) {
            arg0.field3427 = arg0.field3407;
        } else if (arg0.field3366 == 1) {
            arg0.field3427 = arg2 - arg0.field3407;
        } else if (arg0.field3366 == 2) {
            arg0.field3427 = arg0.field3407 * arg2 >> 14;
        }
        if (arg0.field3463 == 4) {
            arg0.field3373 = arg0.field3427 * arg0.field3351 / arg0.field3376;
        }
        if (arg0.field3366 == 4) {
            arg0.field3427 = arg0.field3376 * arg0.field3373 / arg0.field3351;
        }
        if (arg0.field3362 == 1337) {
            field571 = arg0;
        }
        if (arg3 && arg0.field3482 != null && (arg0.field3373 != var4 || arg0.field3427 != var5)) {
            class81 var6 = new class81();
            var6.field1030 = arg0;
            var6.field1037 = arg0.field3482;
            field751.method5425(var6);
        }
    }

    @ObfuscatedName("di.im(Lkn;III)V")
    public static void method2429(class295 arg0, int arg1, int arg2) {
        if (arg0.field3392 == 0) {
            arg0.field3371 = arg0.field3367;
        } else if (arg0.field3392 == 1) {
            arg0.field3371 = (arg1 - arg0.field3373) / 2 + arg0.field3367;
        } else if (arg0.field3392 == 2) {
            arg0.field3371 = arg1 - arg0.field3373 - arg0.field3367;
        } else if (arg0.field3392 == 3) {
            arg0.field3371 = arg0.field3367 * arg1 >> 14;
        } else if (arg0.field3392 == 4) {
            arg0.field3371 = (arg0.field3367 * arg1 >> 14) + (arg1 - arg0.field3373) / 2;
        } else {
            arg0.field3371 = arg1 - arg0.field3373 - (arg0.field3367 * arg1 >> 14);
        }
        if (arg0.field3364 == 0) {
            arg0.field3446 = arg0.field3426;
        } else if (arg0.field3364 == 1) {
            arg0.field3446 = (arg2 - arg0.field3427) / 2 + arg0.field3426;
        } else if (arg0.field3364 == 2) {
            arg0.field3446 = arg2 - arg0.field3427 - arg0.field3426;
        } else if (arg0.field3364 == 3) {
            arg0.field3446 = arg0.field3426 * arg2 >> 14;
        } else if (arg0.field3364 == 4) {
            arg0.field3446 = (arg0.field3426 * arg2 >> 14) + (arg2 - arg0.field3427) / 2;
        } else {
            arg0.field3446 = arg2 - arg0.field3427 - (arg0.field3426 * arg2 >> 14);
        }
    }

    @ObfuscatedName("hq.ib(Lkn;I)Z")
    public static final boolean method4349(class295 arg0) {
        if (arg0.field3394 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3394.length; var1++) {
            int var2 = method5292(arg0, var1);
            int var3 = arg0.field3488[var1];
            if (arg0.field3394[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3394[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3394[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("lg.iq(Lkn;II)I")
    public static final int method5292(class295 arg0, int arg1) {
        if (arg0.field3486 == null || arg1 >= arg0.field3486.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3486[arg1];
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
                    var7 = field621[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field738[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field623[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class295 var11 = class295.method3238(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class188.method2231(var12).field2101 || field479)) {
                        for (int var13 = 0; var13 < var11.field3492.length; var13++) {
                            if (var12 + 1 == var11.field3492[var13]) {
                                var7 += var11.field3493[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class289.field3313[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class299.field3544[field738[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class289.field3313[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field454.field1089;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class299.field3545[var14]) {
                            var7 += field738[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class295 var17 = class295.method3238(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class188.method2231(var18).field2101 || field479)) {
                        for (int var19 = 0; var19 < var17.field3492.length; var19++) {
                            if (var18 + 1 == var17.field3492[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field657;
                }
                if (var6 == 12) {
                    var7 = field658;
                }
                if (var6 == 13) {
                    int var20 = class289.field3313[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method2652(var22);
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
                    var7 = (Statics.field454.field1172 >> 7) + Statics.field405;
                }
                if (var6 == 19) {
                    var7 = (Statics.field454.field1155 >> 7) + Statics.field31;
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

    @ObfuscatedName("ai.ia(Lkn;Lgb;IIZB)V")
    public static final void method714(class295 arg0, class188 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field2088;
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
            var7 = class309.field3914;
        }
        if (var6 != -1 && var7 != null) {
            method3472(var7, class93.method2932(16748608) + arg1.field2110, var6, 0, arg2, arg0.field3358, arg1.field2137, arg4);
        }
    }

    @ObfuscatedName("nc.iy(Lkn;IIB)V")
    public static final void method6128(class295 arg0, int arg1, int arg2) {
        if (arg0.field3361 == 1) {
            method4616(arg0.field3347, "", 24, 0, 0, arg0.field3358, arg0.field3375);
        }
        if (arg0.field3361 == 2 && !field635) {
            String var3 = method4474(arg0);
            if (var3 != null) {
                method4616(var3, class93.method2932(65280) + arg0.field3476, 25, 0, -1, arg0.field3358, arg0.field3375);
            }
        }
        if (arg0.field3361 == 3) {
            Statics.method1859(class309.field3710, "", 26, 0, 0, arg0.field3358);
        }
        if (arg0.field3361 == 4) {
            Statics.method1859(arg0.field3347, "", 28, 0, 0, arg0.field3358);
        }
        if (arg0.field3361 == 5) {
            Statics.method1859(arg0.field3347, "", 29, 0, 0, arg0.field3358);
        }
        if (arg0.field3361 == 6 && field611 == null) {
            Statics.method1859(arg0.field3347, "", 30, 0, -1, arg0.field3358);
        }
        if (arg0.field3360 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3427; var5++) {
                for (int var6 = 0; var6 < arg0.field3373; var6++) {
                    int var7 = (arg0.field3448 + 32) * var6;
                    int var8 = (arg0.field3368 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3406[var4];
                        var8 += arg0.field3429[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field743 = var4;
                        Statics.field1571 = arg0;
                        if (arg0.field3492[var4] > 0) {
                            label255: {
                                class188 var9 = class188.method2231(arg0.field3492[var4] - 1);
                                if (field484 == 1) {
                                    int var10 = method3477(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field1682 != arg0.field3358 || Statics.field865 != var4) {
                                            method4616(class309.field3779, field643 + " " + class93.field1266 + " " + class93.method2932(16748608) + var9.field2110, 31, 0, var4, arg0.field3358, var9.field2137);
                                        }
                                        break label255;
                                    }
                                }
                                if (field635) {
                                    int var12 = method3477(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1674 & 0x10) == 16) {
                                            method4616(field648, field490 + " " + class93.field1266 + " " + class93.method2932(16748608) + var9.field2110, 32, 0, var4, arg0.field3358, var9.field2137);
                                        }
                                        break label255;
                                    }
                                }
                                String[] var14 = var9.field2088;
                                int var15 = -1;
                                if (field629 && method2743()) {
                                    var15 = var9.method3348();
                                }
                                int var16 = method3477(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != var18) {
                                            method714(arg0, var9, var4, var18, false);
                                        }
                                    }
                                }
                                class296 var10000 = (class296) null;
                                if (class296.method4894(method3477(arg0))) {
                                    method4616(class309.field3779, class93.method2932(16748608) + var9.field2110, 38, 0, var4, arg0.field3358, var9.field2137);
                                }
                                int var19 = method3477(arg0);
                                boolean var20 = (var19 >> 30 & 0x1) != 0;
                                if (var20) {
                                    for (int var21 = 2; var21 >= 0; var21--) {
                                        if (var15 != var21) {
                                            method714(arg0, var9, var4, var21, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method714(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var22 = arg0.field3431;
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
                                            method4616(var22[var23], class93.method2932(16748608) + var9.field2110, var24, 0, var4, arg0.field3358, var9.field2137);
                                        }
                                    }
                                }
                                method4616(class309.field3660, class93.method2932(16748608) + var9.field2110, 1005, 0, var4, arg0.field3358, var9.field2137);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3389) {
            return;
        }
        if (!field635) {
            for (int var25 = 9; var25 >= 5; var25--) {
                String var26 = method5326(arg0, var25);
                if (var26 != null) {
                    method4616(var26, arg0.field3447, 1007, var25 + 1, arg0.field3359, arg0.field3358, arg0.field3375);
                }
            }
            String var27 = method4474(arg0);
            if (var27 != null) {
                method4616(var27, arg0.field3447, 25, 0, arg0.field3359, arg0.field3358, arg0.field3375);
            }
            for (int var28 = 4; var28 >= 0; var28--) {
                String var29 = method5326(arg0, var28);
                if (var29 != null) {
                    method3472(var29, arg0.field3447, 57, var28 + 1, arg0.field3359, arg0.field3358, arg0.field3375, arg0.field3510);
                }
            }
            if (class296.method6213(method3477(arg0))) {
                Statics.method1859(class309.field3622, "", 30, 0, arg0.field3359, arg0.field3358);
            }
        } else if (class296.method3040(method3477(arg0)) && (Statics.field1674 & 0x20) == 32) {
            method4616(field648, field490 + " " + class93.field1266 + " " + arg0.field3447, 58, 0, arg0.field3359, arg0.field3358, arg0.field3375);
        }
    }

    @ObfuscatedName("t.in(ZI)V")
    public static void method339(boolean arg0) {
        field637 = arg0;
    }

    @ObfuscatedName("du.ic(I)Z")
    public static boolean method2420() {
        return field637;
    }

    @ObfuscatedName("eq.ip(I)Z")
    public static boolean method2743() {
        return field637 || class24.field135[81];
    }

    @ObfuscatedName("br.is(IIIIIIII)V")
    public static final void method1755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class295.method3187(arg0)) {
            method4926(Statics.field4250[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ku.iz([Lkn;IIIIIIII)V")
    public static final void method4926(class295[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class295 var9 = arg0[var8];
            if (var9 != null && var9.field3377 == arg1 && (var9.method4985() || method3477(var9) != 0 || field515 == var9)) {
                if (var9.field3389) {
                    if (method1917(var9)) {
                        continue;
                    }
                } else if (var9.field3360 == 0 && Statics.field1406 != var9 && method1917(var9)) {
                    continue;
                }
                if (var9.field3360 == 11 && var9.method5050(Statics.field1771)) {
                    if (var9.method5002()) {
                        method2620(var9);
                        method3148(var9.field3398, var9, true);
                    }
                    if (var9.field3365 != null) {
                        class81 var10 = new class81();
                        var10.field1030 = var9;
                        var10.field1037 = var9.field3365;
                        field751.method5425(var10);
                    }
                }
                int var11 = var9.field3371 + arg6;
                int var12 = var9.field3446 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field3360 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field3360 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field3373 + var11;
                    int var20 = var9.field3427 + var12;
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
                    int var23 = var9.field3373 + var11;
                    int var24 = var9.field3427 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field587 == var9) {
                    field495 = true;
                    field672 = var11;
                    field673 = var12;
                }
                boolean var25 = false;
                if (var9.field3437) {
                    switch(field742) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3358 >>> 16 == field653) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field653 == var9.field3358) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3389 || var13 < var15 && var14 < var16) {
                    if (var9.field3389) {
                        if (var9.field3508) {
                            if (class33.field220 >= var13 && class33.field228 >= var14 && class33.field220 < var15 && class33.field228 < var16) {
                                for (class81 var26 = (class81) field751.method5442(); var26 != null; var26 = (class81) field751.method5426()) {
                                    if (var26.field1041) {
                                        var26.method6409();
                                        var26.field1030.field3499 = false;
                                    }
                                }
                                if (Statics.field1946 == 0) {
                                    field587 = null;
                                    field515 = null;
                                }
                                if (!field664) {
                                    method6095();
                                }
                            }
                        } else if (var9.field3509 && class33.field220 >= var13 && class33.field228 >= var14 && class33.field220 < var15 && class33.field228 < var16) {
                            for (class81 var27 = (class81) field751.method5442(); var27 != null; var27 = (class81) field751.method5426()) {
                                if (var27.field1041 && var27.field1030.field3470 == var27.field1037) {
                                    var27.method6409();
                                }
                            }
                        }
                    }
                    int var28 = class33.field220;
                    int var29 = class33.field228;
                    if (class33.field227 != 0) {
                        var28 = class33.field219;
                        var29 = class33.field230;
                    }
                    boolean var30 = var28 >= var13 && var29 >= var14 && var28 < var15 && var29 < var16;
                    if (var9.field3362 == 1337) {
                        if (!field486 && !field664 && var30) {
                            method4486(var28, var29, var13, var14);
                        }
                    } else if (var9.field3362 == 1338) {
                        method5880(var9, var11, var12);
                    } else {
                        if (var9.field3362 == 1400) {
                            Statics.field3026.method6451(class33.field220, class33.field228, var30, var11, var12, var9.field3373, var9.field3427);
                        }
                        if (!field664 && var30) {
                            if (var9.field3362 == 1400) {
                                Statics.field3026.method6490(var11, var12, var9.field3373, var9.field3427, var28, var29);
                            } else {
                                method6128(var9, var28 - var11, var29 - var12);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3350.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3350[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3350[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3507 != null) {
                                            var35 = class24.field135[var9.field3350[var31][var34]];
                                        }
                                        if (method4635(var9.field3350[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3507 != null && var9.field3507[var31] > field487) {
                                                break;
                                            }
                                            byte var36 = var9.field3498[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !class24.field135[86] && !class24.field135[82] && !class24.field135[81]) && ((var36 & 0x2) == 0 || class24.field135[86]) && ((var36 & 0x1) == 0 || class24.field135[82]) && ((var36 & 0x4) == 0 || class24.field135[81])) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method5125(var31 + 1, var9.field3358, var9.field3359, var9.field3375, "");
                                    } else if (var31 == 10) {
                                        method574();
                                        method1850(var9.field3358, var9.field3359, class296.method5413(method3477(var9)), var9.field3375);
                                        field648 = method4474(var9);
                                        if (field648 == null) {
                                            field648 = class309.field3624;
                                        }
                                        field490 = var9.field3447 + class93.method2932(16777215);
                                    }
                                    int var37 = var9.field3440[var31];
                                    if (var9.field3507 == null) {
                                        var9.field3507 = new int[var9.field3350.length];
                                    }
                                    if (var9.field3411 == null) {
                                        var9.field3411 = new int[var9.field3350.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3507[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3507[var31] == 0) {
                                        var9.field3507[var31] = field487 + var37 + var9.field3411[var31];
                                    } else {
                                        var9.field3507[var31] = field487 + var37;
                                    }
                                }
                                if (!var32 && var9.field3507 != null) {
                                    var9.field3507[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3389) {
                            boolean var38;
                            if (class33.field220 >= var13 && class33.field228 >= var14 && class33.field220 < var15 && class33.field228 < var16) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class33.field212 == 1 || !Statics.field4383 && class33.field212 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class33.field227 == 1 || !Statics.field4383 && class33.field227 == 4) && class33.field219 >= var13 && class33.field230 >= var14 && class33.field219 < var15 && class33.field230 < var16) {
                                var40 = true;
                            }
                            if (var40) {
                                method4422(var9, class33.field219 - var11, class33.field230 - var12);
                                if (var9.field3360 == 11 && var9.method4990(class33.field219, class33.field230, arg6, arg7)) {
                                    switch(var9.method4994()) {
                                        case 0:
                                            class30.method6381(var9.method4996(), true, false);
                                            break;
                                        case 1:
                                            if (class296.method6861(method3477(var9))) {
                                                int[] var41 = var9.method5035();
                                                if (var41 != null) {
                                                    class265 var42 = class265.method349(class263.field2920, field536.field1339);
                                                    var42.field3039.method6980(var9.field3358);
                                                    var42.field3039.method6979(var41[0]);
                                                    var42.field3039.method6966(var41[1]);
                                                    var42.field3039.method6915(var9.method4995());
                                                    var42.field3039.method6968(var9.field3359);
                                                    var42.field3039.method6980(var41[2]);
                                                    field536.method2330(var42);
                                                }
                                            }
                                    }
                                }
                            }
                            if (var9.field3362 == 1400) {
                                Statics.field3026.method6612(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field587 != null && field587 != var9 && var38 && class296.method2252(method3477(var9))) {
                                field667 = var9;
                            }
                            if (field515 == var9) {
                                field570 = true;
                                field761 = var11;
                                field670 = var12;
                            }
                            if (var9.field3449) {
                                if (var38 && field771 != 0 && var9.field3470 != null) {
                                    class81 var43 = new class81();
                                    var43.field1041 = true;
                                    var43.field1030 = var9;
                                    var43.field1031 = field771;
                                    var43.field1037 = var9.field3470;
                                    field751.method5425(var43);
                                }
                                if (field587 != null || Statics.field88 != null || field664) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3500 && var40) {
                                    var9.field3500 = true;
                                    if (var9.field3353 != null) {
                                        class81 var44 = new class81();
                                        var44.field1041 = true;
                                        var44.field1030 = var9;
                                        var44.field1033 = class33.field219 - var11;
                                        var44.field1031 = class33.field230 - var12;
                                        var44.field1037 = var9.field3353;
                                        field751.method5425(var44);
                                    }
                                }
                                if (var9.field3500 && var39 && var9.field3452 != null) {
                                    class81 var45 = new class81();
                                    var45.field1041 = true;
                                    var45.field1030 = var9;
                                    var45.field1033 = class33.field220 - var11;
                                    var45.field1031 = class33.field228 - var12;
                                    var45.field1037 = var9.field3452;
                                    field751.method5425(var45);
                                }
                                if (var9.field3500 && !var39) {
                                    var9.field3500 = false;
                                    if (var9.field3453 != null) {
                                        class81 var46 = new class81();
                                        var46.field1041 = true;
                                        var46.field1030 = var9;
                                        var46.field1033 = class33.field220 - var11;
                                        var46.field1031 = class33.field228 - var12;
                                        var46.field1037 = var9.field3453;
                                        field529.method5425(var46);
                                    }
                                }
                                if (var39 && var9.field3454 != null) {
                                    class81 var47 = new class81();
                                    var47.field1041 = true;
                                    var47.field1030 = var9;
                                    var47.field1033 = class33.field220 - var11;
                                    var47.field1031 = class33.field228 - var12;
                                    var47.field1037 = var9.field3454;
                                    field751.method5425(var47);
                                }
                                if (!var9.field3499 && var38) {
                                    var9.field3499 = true;
                                    if (var9.field3455 != null) {
                                        class81 var48 = new class81();
                                        var48.field1041 = true;
                                        var48.field1030 = var9;
                                        var48.field1033 = class33.field220 - var11;
                                        var48.field1031 = class33.field228 - var12;
                                        var48.field1037 = var9.field3455;
                                        field751.method5425(var48);
                                    }
                                }
                                if (var9.field3499 && var38 && var9.field3456 != null) {
                                    class81 var49 = new class81();
                                    var49.field1041 = true;
                                    var49.field1030 = var9;
                                    var49.field1033 = class33.field220 - var11;
                                    var49.field1031 = class33.field228 - var12;
                                    var49.field1037 = var9.field3456;
                                    field751.method5425(var49);
                                }
                                if (var9.field3499 && !var38) {
                                    var9.field3499 = false;
                                    if (var9.field3457 != null) {
                                        class81 var50 = new class81();
                                        var50.field1041 = true;
                                        var50.field1030 = var9;
                                        var50.field1033 = class33.field220 - var11;
                                        var50.field1031 = class33.field228 - var12;
                                        var50.field1037 = var9.field3457;
                                        field529.method5425(var50);
                                    }
                                }
                                if (var9.field3468 != null) {
                                    class81 var51 = new class81();
                                    var51.field1030 = var9;
                                    var51.field1037 = var9.field3468;
                                    field694.method5425(var51);
                                }
                                if (var9.field3413 != null && field649 > var9.field3502) {
                                    if (var9.field3345 == null || field649 - var9.field3502 > 32) {
                                        class81 var56 = new class81();
                                        var56.field1030 = var9;
                                        var56.field1037 = var9.field3413;
                                        field751.method5425(var56);
                                    } else {
                                        label650: for (int var52 = var9.field3502; var52 < field649; var52++) {
                                            int var53 = field676[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field3345.length; var54++) {
                                                if (var9.field3345[var54] == var53) {
                                                    class81 var55 = new class81();
                                                    var55.field1030 = var9;
                                                    var55.field1037 = var9.field3413;
                                                    field751.method5425(var55);
                                                    break label650;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3502 = field649;
                                }
                                if (var9.field3464 != null && field679 > var9.field3503) {
                                    if (var9.field3388 == null || field679 - var9.field3503 > 32) {
                                        class81 var61 = new class81();
                                        var61.field1030 = var9;
                                        var61.field1037 = var9.field3464;
                                        field751.method5425(var61);
                                    } else {
                                        label626: for (int var57 = var9.field3503; var57 < field679; var57++) {
                                            int var58 = field491[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field3388.length; var59++) {
                                                if (var9.field3388[var59] == var58) {
                                                    class81 var60 = new class81();
                                                    var60.field1030 = var9;
                                                    var60.field1037 = var9.field3464;
                                                    field751.method5425(var60);
                                                    break label626;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3503 = field679;
                                }
                                if (var9.field3466 != null && field681 > var9.field3504) {
                                    if (var9.field3357 == null || field681 - var9.field3504 > 32) {
                                        class81 var66 = new class81();
                                        var66.field1030 = var9;
                                        var66.field1037 = var9.field3466;
                                        field751.method5425(var66);
                                    } else {
                                        label602: for (int var62 = var9.field3504; var62 < field681; var62++) {
                                            int var63 = field680[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field3357.length; var64++) {
                                                if (var9.field3357[var64] == var63) {
                                                    class81 var65 = new class81();
                                                    var65.field1030 = var9;
                                                    var65.field1037 = var9.field3466;
                                                    field751.method5425(var65);
                                                    break label602;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3504 = field681;
                                }
                                if (field684 > var9.field3501 && var9.field3471 != null) {
                                    class81 var67 = new class81();
                                    var67.field1030 = var9;
                                    var67.field1037 = var9.field3471;
                                    field751.method5425(var67);
                                }
                                if (field711 > var9.field3501 && var9.field3475 != null) {
                                    class81 var68 = new class81();
                                    var68.field1030 = var9;
                                    var68.field1037 = var9.field3475;
                                    field751.method5425(var68);
                                }
                                if (field686 > var9.field3501 && var9.field3430 != null) {
                                    class81 var69 = new class81();
                                    var69.field1030 = var9;
                                    var69.field1037 = var9.field3430;
                                    field751.method5425(var69);
                                }
                                if (field478 > var9.field3501 && var9.field3477 != null) {
                                    class81 var70 = new class81();
                                    var70.field1030 = var9;
                                    var70.field1037 = var9.field3477;
                                    field751.method5425(var70);
                                }
                                if (field688 > var9.field3501 && var9.field3370 != null) {
                                    class81 var71 = new class81();
                                    var71.field1030 = var9;
                                    var71.field1037 = var9.field3370;
                                    field751.method5425(var71);
                                }
                                if (field685 > var9.field3501 && var9.field3483 != null) {
                                    class81 var72 = new class81();
                                    var72.field1030 = var9;
                                    var72.field1037 = var9.field3483;
                                    field751.method5425(var72);
                                }
                                if (field690 > var9.field3501 && var9.field3442 != null) {
                                    class81 var73 = new class81();
                                    var73.field1030 = var9;
                                    var73.field1037 = var9.field3442;
                                    field751.method5425(var73);
                                }
                                if (field691 > var9.field3501 && var9.field3479 != null) {
                                    class81 var74 = new class81();
                                    var74.field1030 = var9;
                                    var74.field1037 = var9.field3479;
                                    field751.method5425(var74);
                                }
                                var9.field3501 = field675;
                                if (var9.field3436 != null) {
                                    for (int var75 = 0; var75 < field715; var75++) {
                                        class81 var76 = new class81();
                                        var76.field1030 = var9;
                                        var76.field1038 = field717[var75];
                                        var76.field1034 = field578[var75];
                                        var76.field1037 = var9.field3436;
                                        field751.method5425(var76);
                                    }
                                }
                                if (var9.field3473 != null) {
                                    int[] var77 = class24.method5592();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class81 var79 = new class81();
                                        var79.field1030 = var9;
                                        var79.field1038 = var77[var78];
                                        var79.field1037 = var9.field3473;
                                        field751.method5425(var79);
                                    }
                                }
                                if (var9.field3494 != null) {
                                    int[] var80 = class24.method3475();
                                    for (int var81 = 0; var81 < var80.length; var81++) {
                                        class81 var82 = new class81();
                                        var82.field1030 = var9;
                                        var82.field1038 = var80[var81];
                                        var82.field1037 = var9.field3494;
                                        field751.method5425(var82);
                                    }
                                }
                            }
                        }
                        if (!var9.field3389) {
                            if (field587 != null || Statics.field88 != null || field664) {
                                continue;
                            }
                            if ((var9.field3489 >= 0 || var9.field3385 != 0) && class33.field220 >= var13 && class33.field228 >= var14 && class33.field220 < var15 && class33.field228 < var16) {
                                if (var9.field3489 >= 0) {
                                    Statics.field1406 = arg0[var9.field3489];
                                } else {
                                    Statics.field1406 = var9;
                                }
                            }
                            if (var9.field3360 == 8 && class33.field220 >= var13 && class33.field228 >= var14 && class33.field220 < var15 && class33.field228 < var16) {
                                Statics.field1891 = var9;
                            }
                            if (var9.field3382 > var9.field3427) {
                                Statics.method4244(var9, var9.field3373 + var11, var12, var9.field3427, var9.field3382, class33.field220, class33.field228);
                            }
                        }
                        if (var9.field3360 == 0) {
                            method4926(arg0, var9.field3358, var13, var14, var15, var16, var11 - var9.field3379, var12 - var9.field3380);
                            if (var9.field3398 != null) {
                                method4926(var9.field3398, var9.field3358, var13, var14, var15, var16, var11 - var9.field3379, var12 - var9.field3380);
                            }
                            class80 var83 = (class80) field651.method6695((long) var9.field3358);
                            if (var83 != null) {
                                if (var83.field1024 == 0 && class33.field220 >= var13 && class33.field228 >= var14 && class33.field220 < var15 && class33.field228 < var16 && !field664) {
                                    for (class81 var84 = (class81) field751.method5442(); var84 != null; var84 = (class81) field751.method5426()) {
                                        if (var84.field1041) {
                                            var84.method6409();
                                            var84.field1030.field3499 = false;
                                        }
                                    }
                                    if (Statics.field1946 == 0) {
                                        field587 = null;
                                        field515 = null;
                                    }
                                    if (!field664) {
                                        method6095();
                                    }
                                }
                                method1755(var83.field1026, var13, var14, var15, var16, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ji.id(II)Z")
    public static boolean method4635(int arg0) {
        for (int var1 = 0; var1 < field715; var1++) {
            if (field717[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("hx.ie(IIB)V")
    public static final void method4070(int arg0, int arg1) {
        if (class295.method3187(arg0)) {
            method3884(Statics.field4250[arg0], arg1);
        }
    }

    @ObfuscatedName("gq.ij([Lkn;II)V")
    public static final void method3884(class295[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class295 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3360 == 0) {
                    if (var3.field3398 != null) {
                        method3884(var3.field3398, arg1);
                    }
                    class80 var4 = (class80) field651.method6695((long) var3.field3358);
                    if (var4 != null) {
                        method4070(var4.field1026, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3480 != null) {
                    class81 var5 = new class81();
                    var5.field1030 = var3;
                    var5.field1037 = var3.field3480;
                    class64.method4069(var5);
                }
                if (arg1 == 1 && var3.field3481 != null) {
                    if (var3.field3359 >= 0) {
                        class295 var6 = class295.method3238(var3.field3358);
                        if (var6 == null || var6.field3398 == null || var3.field3359 >= var6.field3398.length || var6.field3398[var3.field3359] != var3) {
                            continue;
                        }
                    }
                    class81 var7 = new class81();
                    var7.field1030 = var3;
                    var7.field1037 = var3.field3481;
                    class64.method4069(var7);
                }
            }
        }
    }

    @ObfuscatedName("hj.io(Lkn;IIB)V")
    public static final void method4422(class295 arg0, int arg1, int arg2) {
        if (field587 != null || field664 || arg0 == null || method4612(arg0) == null) {
            return;
        }
        field587 = arg0;
        field515 = method4612(arg0);
        field665 = arg1;
        field642 = arg2;
        Statics.field1946 = 0;
        field674 = false;
        int var3 = field626 - 1;
        if (var3 != -1) {
            method2741(var3);
        }
    }

    @ObfuscatedName("client.jt(I)V")
    public final void method1190() {
        method2620(field587);
        Statics.field1946++;
        if (field495 && field570) {
            int var1 = class33.field220;
            int var2 = class33.field228;
            int var3 = var1 - field665;
            int var4 = var2 - field642;
            if (var3 < field761) {
                var3 = field761;
            }
            if (field587.field3373 + var3 > field761 + field515.field3373) {
                var3 = field761 + field515.field3373 - field587.field3373;
            }
            if (var4 < field670) {
                var4 = field670;
            }
            if (field587.field3427 + var4 > field670 + field515.field3427) {
                var4 = field670 + field515.field3427 - field587.field3427;
            }
            int var5 = var3 - field672;
            int var6 = var4 - field673;
            int var7 = field587.field3438;
            if (Statics.field1946 > field587.field3420 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field674 = true;
            }
            int var8 = field515.field3379 + (var3 - field761);
            int var9 = field515.field3380 + (var4 - field670);
            if (field587.field3458 != null && field674) {
                class81 var10 = new class81();
                var10.field1030 = field587;
                var10.field1033 = var8;
                var10.field1031 = var9;
                var10.field1037 = field587.field3458;
                class64.method4069(var10);
            }
            if (class33.field212 == 0) {
                if (field674) {
                    if (field587.field3459 != null) {
                        class81 var11 = new class81();
                        var11.field1030 = field587;
                        var11.field1033 = var8;
                        var11.field1031 = var9;
                        var11.field1036 = field667;
                        var11.field1037 = field587.field3459;
                        class64.method4069(var11);
                    }
                    if (field667 != null) {
                        class295 var12 = field587;
                        int var13 = class296.method2662(method3477(var12));
                        class295 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class295.method3238(var12.field3377);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class265 var16 = class265.method349(class263.field3012, field536.field1339);
                            var16.field3039.method6966(field587.field3358);
                            var16.field3039.method6969(field587.field3359);
                            var16.field3039.method6979(field667.field3358);
                            var16.field3039.method6969(field587.field3375);
                            var16.field3039.method6968(field667.field3359);
                            var16.field3039.method6940(field667.field3375);
                            field536.method2330(var16);
                        }
                    }
                } else if (this.method1472()) {
                    this.method1029(field672 + field665, field673 + field642);
                } else if (field626 > 0) {
                    method5837(field672 + field665, field673 + field642);
                }
                field587 = null;
            }
        } else if (Statics.field1946 > 1) {
            if (!field674 && field626 > 0) {
                method5837(field672 + field665, field673 + field642);
            }
            field587 = null;
        }
    }

    @ObfuscatedName("eq.jc(IS)V")
    public static void method2741(int arg0) {
        Statics.field2833 = new class67();
        Statics.field2833.field862 = field475[arg0];
        Statics.field2833.field856 = field628[arg0];
        Statics.field2833.field857 = field561[arg0];
        Statics.field2833.field855 = field630[arg0];
        Statics.field2833.field860 = field631[arg0];
        Statics.field2833.field858 = field632[arg0];
        Statics.field2833.field861 = field606[arg0];
    }

    @ObfuscatedName("my.jb(III)V")
    public static void method5837(int arg0, int arg1) {
        class67 var2 = Statics.field2833;
        if (var2 != null) {
            method5831(var2.field862, var2.field856, var2.field857, var2.field855, var2.field860, var2.field858, var2.field861, arg0, arg1);
        }
        Statics.field2833 = null;
    }

    @ObfuscatedName("de.jq(Lkn;B)V")
    public static void method2620(class295 arg0) {
        if (arg0 != null && field698 == arg0.field3506) {
            field644[arg0.field3505] = true;
        }
    }

    @ObfuscatedName("lb.jg(I)V")
    public static void method5395() {
        for (class80 var0 = (class80) field651.method6694(); var0 != null; var0 = (class80) field651.method6681()) {
            int var1 = var0.field1026;
            if (class295.method3187(var1)) {
                boolean var2 = true;
                class295[] var3 = Statics.field4250[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3389;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4468;
                    class295 var6 = class295.method3238(var5);
                    if (var6 != null) {
                        method2620(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("jt.jy(Lkn;I)Lkn;")
    public static class295 method4612(class295 arg0) {
        class295 var1 = arg0;
        int var2 = class296.method2662(method3477(arg0));
        class295 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class295.method3238(var1.field3377);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class295 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field3485;
        }
        return var5;
    }

    @ObfuscatedName("js.jn([Lkn;IB)V")
    public static final void method4880(class295[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class295 var3 = arg0[var2];
            if (var3 != null && var3.field3377 == arg1 && (!var3.field3389 || !method1917(var3))) {
                if (var3.field3360 == 0) {
                    if (!var3.field3389 && method1917(var3) && Statics.field1406 != var3) {
                        continue;
                    }
                    method4880(arg0, var3.field3358);
                    if (var3.field3398 != null) {
                        method4880(var3.field3398, var3.field3358);
                    }
                    class80 var4 = (class80) field651.method6695((long) var3.field3358);
                    if (var4 != null) {
                        int var5 = var4.field1026;
                        if (class295.method3187(var5)) {
                            method4880(Statics.field4250[var5], -1);
                        }
                    }
                }
                if (var3.field3360 == 6) {
                    if (var3.field3402 != -1 || var3.field3417 != -1) {
                        boolean var6 = method4349(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3417;
                        } else {
                            var7 = var3.field3402;
                        }
                        if (var7 != -1) {
                            class190 var8 = class190.method5853(var7);
                            if (var8.method3388()) {
                                var3.field3435 += field600;
                                int var9 = var8.method3392();
                                if (var3.field3435 >= var9) {
                                    var3.field3435 -= var8.field2171;
                                    if (var3.field3435 < 0 || var3.field3435 >= var9) {
                                        var3.field3435 = 0;
                                    }
                                }
                                method2620(var3);
                            } else {
                                var3.field3497 += field600;
                                while (var3.field3497 > var8.field2164[var3.field3435]) {
                                    var3.field3497 -= var8.field2164[var3.field3435];
                                    var3.field3435++;
                                    if (var3.field3435 >= var8.field2167.length) {
                                        var3.field3435 -= var8.field2171;
                                        if (var3.field3435 < 0 || var3.field3435 >= var8.field2167.length) {
                                            var3.field3435 = 0;
                                        }
                                    }
                                    method2620(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3415 != 0 && !var3.field3389) {
                        int var10 = var3.field3415 >> 16;
                        int var11 = var3.field3415 << 16 >> 16;
                        int var12 = field600 * var10;
                        int var13 = field600 * var11;
                        var3.field3410 = var3.field3410 + var12 & 0x7FF;
                        var3.field3472 = var3.field3472 + var13 & 0x7FF;
                        method2620(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("iw.ji(IB)V")
    public static final void method4479(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method3473((double) var3);
    }

    @ObfuscatedName("hs.jx(I)I")
    public static final int method4139() {
        float var0 = 200.0F * ((float) Statics.field4303.method2102() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("gr.jj(D)V")
    public static final void method3473(double arg0) {
        class201.method3596(arg0);
        ((class209) Statics.field2348).method3915(arg0);
        class188.method4636();
        Statics.field4303.method2116(arg0);
    }

    @ObfuscatedName("d.jd(IB)V")
    public static final void method95(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field4303.method2104()) {
            return;
        }
        if (Statics.field4303.method2104() == 0 && field729 != -1) {
            class274.method2575(Statics.field4701, field729, 0, var1, false);
            field730 = false;
        } else if (var1 == 0) {
            Statics.field1003.method4761();
            class274.field3199 = 1;
            Statics.field3995 = null;
            field730 = false;
        } else if (class274.field3199 == 0) {
            Statics.field1003.method4691(var1);
        } else {
            Statics.field167 = var1;
        }
        Statics.field4303.method2106(var1);
    }

    @ObfuscatedName("ek.jv(II)V")
    public static final void method2649(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4303.method2107(var1);
    }

    @ObfuscatedName("kv.je(IB)V")
    public static final void method5095(int arg0) {
        method5395();
        class63.method2481();
        int var1 = Statics.method1949(arg0).field1807;
        if (var1 == 0) {
            return;
        }
        int var2 = class289.field3313[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method3473(0.9D);
            }
            if (var2 == 2) {
                method3473(0.8D);
            }
            if (var2 == 3) {
                method3473(0.7D);
            }
            if (var2 == 4) {
                method3473(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method95(255);
            }
            if (var2 == 1) {
                method95(192);
            }
            if (var2 == 2) {
                method95(128);
            }
            if (var2 == 3) {
                method95(64);
            }
            if (var2 == 4) {
                method95(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                Statics.method3143(127);
            }
            if (var2 == 1) {
                Statics.method3143(96);
            }
            if (var2 == 2) {
                Statics.method3143(64);
            }
            if (var2 == 3) {
                Statics.method3143(32);
            }
            if (var2 == 4) {
                Statics.method3143(0);
            }
        }
        if (var1 == 5) {
            field624 = var2 == 1;
        }
        if (var1 == 6) {
            field573 = var2;
        }
        if (var1 == 9) {
            field636 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method2649(127);
            }
            if (var2 == 1) {
                method2649(96);
            }
            if (var2 == 2) {
                method2649(64);
            }
            if (var2 == 3) {
                method2649(32);
            }
            if (var2 == 4) {
                method2649(0);
            }
        }
        if (var1 == 17) {
            field660 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class95[] var3 = new class95[] { class95.field1285, class95.field1286, class95.field1284, class95.field1288, class95.field1287 };
            field502 = (class95) class330.method525(var3, var2);
            if (field502 == null) {
                field502 = class95.field1284;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field700 = -1;
            } else {
                field700 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class95[] var4 = new class95[] { class95.field1285, class95.field1286, class95.field1284, class95.field1288, class95.field1287 };
        field503 = (class95) class330.method525(var4, var2);
        if (field503 == null) {
            field503 = class95.field1284;
        }
    }

    @ObfuscatedName("ig.jz(I)V")
    public static final void method4480() {
        class265 var0 = class265.method349(class263.field2976, field536.field1339);
        field536.method2330(var0);
        class64.field817 = true;
        for (class80 var1 = (class80) field651.method6694(); var1 != null; var1 = (class80) field651.method6681()) {
            if (var1.field1024 == 0 || var1.field1024 == 3) {
                Statics.method387(var1, true);
            }
        }
        if (field611 != null) {
            method2620(field611);
            field611 = null;
        }
        class64.field817 = false;
    }

    @ObfuscatedName("bq.jk(IIII)Lcb;")
    public static final class80 method925(int arg0, int arg1, int arg2) {
        class80 var3 = new class80();
        var3.field1026 = arg1;
        var3.field1024 = arg2;
        field651.method6683(var3, (long) arg0);
        Statics.method2329(arg1);
        class295 var4 = class295.method3238(arg0);
        method2620(var4);
        if (field611 != null) {
            method2620(field611);
            field611 = null;
        }
        method3148(Statics.field4250[arg0 >> 16], var4, false);
        class64.method4878(arg1);
        if (field650 != -1) {
            method4070(field650, 1);
        }
        return var3;
    }

    @ObfuscatedName("p.jl(Lkn;I)Z")
    public static final boolean method258(class295 arg0) {
        int var1 = arg0.field3362;
        if (var1 == 205) {
            field537 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field695.method4964(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field695.method4937(var4, var5 == 1);
        }
        if (var1 == 324) {
            field695.method4938(false);
        }
        if (var1 == 325) {
            field695.method4938(true);
        }
        if (var1 == 326) {
            class265 var6 = class265.method349(class263.field2933, field536.field1339);
            field695.method4939(var6.field3039);
            field536.method2330(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ew.jf(Lkn;IIIB)V")
    public static final void method2746(class295 arg0, int arg1, int arg2, int arg3) {
        Statics.method1976();
        class288 var4 = arg0.method4983(false);
        if (var4 == null) {
            return;
        }
        class453.method7238(arg1, arg2, var4.field3309 + arg1, var4.field3311 + arg2);
        if (field728 == 2 || field728 == 5) {
            class453.method7257(arg1, arg2, 0, var4.field3306, var4.field3308);
        } else {
            int var5 = field558 & 0x7FF;
            int var6 = Statics.field454.field1172 / 32 + 48;
            int var7 = 464 - Statics.field454.field1155 / 32;
            Statics.field5.method7395(arg1, arg2, var4.field3309, var4.field3311, var6, var7, var5, 256, var4.field3306, var4.field3308);
            for (int var8 = 0; var8 < field722; var8++) {
                int var9 = field723[var8] * 4 + 2 - Statics.field454.field1172 / 32;
                int var10 = field724[var8] * 4 + 2 - Statics.field454.field1155 / 32;
                method1927(arg1, arg2, var9, var10, field655[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class335 var13 = field617[Statics.field3173][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field454.field1172 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field454.field1155 / 32;
                        method1927(arg1, arg2, var14, var15, Statics.field3279[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field532; var16++) {
                class92 var17 = field531[field533[var16]];
                if (var17 != null && var17.method1993()) {
                    class178 var18 = var17.field1261;
                    if (var18 != null && var18.field1943 != null) {
                        var18 = var18.method3101();
                    }
                    if (var18 != null && var18.field1930 && var18.field1901) {
                        int var19 = var17.field1172 / 32 - Statics.field454.field1172 / 32;
                        int var20 = var17.field1155 / 32 - Statics.field454.field1155 / 32;
                        method1927(arg1, arg2, var19, var20, Statics.field3279[1], var4);
                    }
                }
            }
            int var21 = class97.field1301;
            int[] var22 = class97.field1302;
            for (int var23 = 0; var23 < var21; var23++) {
                class85 var24 = field604[var22[var23]];
                if (var24 != null && var24.method1993() && !var24.field1104 && Statics.field454 != var24) {
                    int var25 = var24.field1172 / 32 - Statics.field454.field1172 / 32;
                    int var26 = var24.field1155 / 32 - Statics.field454.field1155 / 32;
                    if (var24.method1981()) {
                        method1927(arg1, arg2, var25, var26, Statics.field3279[3], var4);
                    } else if (Statics.field454.field1103 != 0 && var24.field1103 != 0 && Statics.field454.field1103 == var24.field1103) {
                        method1927(arg1, arg2, var25, var26, Statics.field3279[4], var4);
                    } else if (var24.method1984()) {
                        method1927(arg1, arg2, var25, var26, Statics.field3279[5], var4);
                    } else if (var24.method2016()) {
                        method1927(arg1, arg2, var25, var26, Statics.field3279[6], var4);
                    } else {
                        method1927(arg1, arg2, var25, var26, Statics.field3279[2], var4);
                    }
                }
            }
            if (field494 != 0 && field487 % 20 < 10) {
                if (field494 == 1 && field556 >= 0 && field556 < field531.length) {
                    class92 var27 = field531[field556];
                    if (var27 != null) {
                        int var28 = var27.field1172 / 32 - Statics.field454.field1172 / 32;
                        int var29 = var27.field1155 / 32 - Statics.field454.field1155 / 32;
                        Statics.method1932(arg1, arg2, var28, var29, Statics.field25[1], var4);
                    }
                }
                if (field494 == 2) {
                    int var30 = field497 * 4 - Statics.field405 * 4 + 2 - Statics.field454.field1172 / 32;
                    int var31 = field498 * 4 - Statics.field31 * 4 + 2 - Statics.field454.field1155 / 32;
                    Statics.method1932(arg1, arg2, var30, var31, Statics.field25[1], var4);
                }
                if (field494 == 10 && field590 >= 0 && field590 < field604.length) {
                    class85 var32 = field604[field590];
                    if (var32 != null) {
                        int var33 = var32.field1172 / 32 - Statics.field454.field1172 / 32;
                        int var34 = var32.field1155 / 32 - Statics.field454.field1155 / 32;
                        Statics.method1932(arg1, arg2, var33, var34, Statics.field25[1], var4);
                    }
                }
            }
            if (field726 != 0) {
                int var35 = field726 * 4 + 2 - Statics.field454.field1172 / 32;
                int var36 = field727 * 4 + 2 - Statics.field454.field1155 / 32;
                method1927(arg1, arg2, var35, var36, Statics.field25[0], var4);
            }
            if (!Statics.field454.field1104) {
                class453.method7245(var4.field3309 / 2 + arg1 - 1, var4.field3311 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field754[arg3] = true;
    }

    @ObfuscatedName("dk.jp(Lkn;IIII)V")
    public static final void method2617(class295 arg0, int arg1, int arg2, int arg3) {
        class288 var4 = arg0.method4983(false);
        if (var4 == null) {
            return;
        }
        if (field728 < 3) {
            Statics.field87.method7395(arg1, arg2, var4.field3309, var4.field3311, 25, 25, field558, 256, var4.field3306, var4.field3308);
        } else {
            class453.method7257(arg1, arg2, 0, var4.field3306, var4.field3308);
        }
    }

    @ObfuscatedName("be.jr(IIIILqn;Lkl;B)V")
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, class457 arg4, class288 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field558 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class201.field2346[var6];
        int var9 = class201.field2363[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method7368(arg5.field3309 / 2 + var10 - arg4.field4800 / 2, arg5.field3311 / 2 - var11 - arg4.field4801 / 2, arg0, arg1, arg5.field3309, arg5.field3311, arg5.field3306, arg5.field3308);
        } else {
            arg4.method7352(arg5.field3309 / 2 + arg0 + var10 - arg4.field4800 / 2, arg5.field3311 / 2 + arg1 - var11 - arg4.field4801 / 2);
        }
    }

    @ObfuscatedName("jd.jh(B)V")
    public static final void method4656() {
        for (int var0 = 0; var0 < class97.field1301; var0++) {
            class85 var1 = field604[class97.field1302[var0]];
            var1.method1982();
        }
        class99.method5175();
        if (Statics.field105 != null) {
            Statics.field105.method5944();
        }
    }

    @ObfuscatedName("gw.jm(I)V")
    public static final void method3188() {
        Iterator var0 = class99.field1326.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method966();
        }
        if (Statics.field105 != null) {
            Statics.field105.method5945();
        }
    }

    @ObfuscatedName("bg.kf(I)V")
    public static final void method1572() {
        for (int var0 = 0; var0 < class97.field1301; var0++) {
            class85 var1 = field604[class97.field1302[var0]];
            var1.method1985();
        }
    }

    @ObfuscatedName("gw.kl(I)V")
    public static final void method3171() {
        field711 = field675;
    }

    @ObfuscatedName("cx.ka(I)V")
    public static final void method2046() {
        field686 = field675;
        Statics.field3301 = true;
    }

    @ObfuscatedName("ho.ku(I)V")
    public static final void method4066() {
        field478 = field675;
        Statics.field14 = true;
    }

    @ObfuscatedName("bo.km(Ljava/lang/String;B)V")
    public static final void method1848(String arg0) {
        if (Statics.field105 != null) {
            class265 var1 = class265.method349(class263.field3018, field536.field1339);
            var1.field3039.method6912(class444.method5118(arg0));
            var1.field3039.method6950(arg0);
            field536.method2330(var1);
        }
    }

    @ObfuscatedName("bc.kh(Ljava/lang/String;I)V")
    public static final void method1817(String arg0) {
        if (!arg0.equals("")) {
            class265 var1 = class265.method349(class263.field2990, field536.field1339);
            var1.field3039.method6912(class444.method5118(arg0));
            var1.field3039.method6950(arg0);
            field536.method2330(var1);
        }
    }

    @ObfuscatedName("dx.kk(I)V")
    public static final void method2503() {
        class265 var0 = class265.method349(class263.field2990, field536.field1339);
        var0.field3039.method6912(0);
        field536.method2330(var0);
    }

    @ObfuscatedName("bo.ke(III)V")
    public static final void method1849(int arg0, int arg1) {
        class149 var2 = arg0 >= 0 ? field678[arg0] : Statics.field4039;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2768()) {
            return;
        }
        class131 var3 = (class131) var2.field1663.get(arg1);
        if (var3.field1543 != -1) {
            return;
        }
        String var4 = var3.field1544.method7491();
        class265 var5 = class265.method349(class263.field2985, field536.field1339);
        var5.field3039.method6912(3 + class444.method5118(var4));
        var5.field3039.method6912(arg0);
        var5.field3039.method6913(arg1);
        var5.field3039.method6950(var4);
        field536.method2330(var5);
    }

    @ObfuscatedName("du.kn(III)V")
    public static final void method2419(int arg0, int arg1) {
        if (field678[arg0] == null || arg1 < 0 || arg1 >= field678[arg0].method2768()) {
            return;
        }
        class131 var2 = (class131) field678[arg0].field1663.get(arg1);
        if (var2.field1543 != -1) {
            return;
        }
        class265 var3 = class265.method349(class263.field2948, field536.field1339);
        var3.field3039.method6912(3 + class444.method5118(var2.field1544.method7491()));
        var3.field3039.method6912(arg0);
        var3.field3039.method6913(arg1);
        var3.field3039.method6950(var2.field1544.method7491());
        field536.method2330(var3);
    }

    @ObfuscatedName("dl.kj(IIZS)V")
    public static final void method2632(int arg0, int arg1, boolean arg2) {
        if (field678[arg0] == null || arg1 < 0 || arg1 >= field678[arg0].method2768()) {
            return;
        }
        class131 var3 = (class131) field678[arg0].field1663.get(arg1);
        class265 var4 = class265.method349(class263.field2988, field536.field1339);
        var4.field3039.method6912(4 + class444.method5118(var3.field1544.method7491()));
        var4.field3039.method6912(arg0);
        var4.field3039.method6913(arg1);
        var4.field3039.method6918(arg2);
        var4.field3039.method6950(var3.field1544.method7491());
        field536.method2330(var4);
    }

    @ObfuscatedName("kp.ki(II)V")
    public static void method5107(int arg0) {
        for (class410 var1 = (class410) field696.method6694(); var1 != null; var1 = (class410) field696.method6681()) {
            if ((long) arg0 == (var1.field4468 >> 48 & 0xFFFFL)) {
                var1.method6409();
            }
        }
    }

    @ObfuscatedName("gs.kz(Lkn;B)I")
    public static int method3477(class295 arg0) {
        class410 var1 = (class410) field696.method6695(((long) arg0.field3358 << 32) + (long) arg0.field3359);
        return var1 == null ? arg0.field3372 : var1.field4467;
    }

    @ObfuscatedName("bj.kw(Lkn;B)Z")
    public static boolean method1917(class295 arg0) {
        return arg0.field3378;
    }

    @ObfuscatedName("lz.kr(Lkn;II)Ljava/lang/String;")
    public static String method5326(class295 arg0, int arg1) {
        if (!Statics.method2889(method3477(arg0), arg1) && arg0.field3469 == null) {
            return null;
        } else if (arg0.field3443 == null || arg0.field3443.length <= arg1 || arg0.field3443[arg1] == null || arg0.field3443[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3443[arg1];
        }
    }

    @ObfuscatedName("if.kv(Lkn;B)Ljava/lang/String;")
    public static String method4474(class295 arg0) {
        if (class296.method5413(method3477(arg0)) == 0) {
            return null;
        } else if (arg0.field3495 == null || arg0.field3495.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3495;
        }
    }

    @ObfuscatedName("fy.kc(Ljava/lang/String;B)V")
    public static void method2986(String arg0) {
        Statics.field2013 = arg0;
        try {
            String var1 = Statics.field3295.getParameter(Integer.toString(18));
            String var2 = Statics.field3295.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class285.method2916(class270.method3146() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field3295;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("cx.kp([BII)V")
    public static void method2032(byte[] arg0, int arg1) {
        if (field530 == null) {
            field530 = new byte[24];
        }
        class352.method5805(arg0, arg1, field530, 0, 24);
    }

    @ObfuscatedName("ek.kb(Lqr;IB)V")
    public static void method2646(class444 arg0, int arg1) {
        method2032(arg0.field4707, arg1);
        if (class158.field1732 == null) {
            return;
        }
        try {
            class158.field1732.method6732(0L);
            class158.field1732.method6737(arg0.field4707, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("li.ko(Lqr;I)V")
    public static void method5411(class444 arg0) {
        if (field530 != null) {
            arg0.method6922(field530, 0, field530.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class158.field1732.method6732(0L);
            class158.field1732.method6736(var1);
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
        arg0.method6922(var1, 0, var1.length);
    }

    @ObfuscatedName("client.kq(I)Lqy;")
    public class465 method1132() {
        return Statics.field454 == null ? null : Statics.field454.field1110;
    }

    @ObfuscatedName("n.kg(IIIZS)V")
    public static void method74(int arg0, int arg1, int arg2, boolean arg3) {
        class265 var4 = class265.method349(class263.field3023, field536.field1339);
        var4.field3039.method7171(arg2);
        var4.field3039.method6980(arg3 ? field622 : 0);
        var4.field3039.method6969(arg1);
        var4.field3039.method6969(arg0);
        field536.method2330(var4);
    }

    @ObfuscatedName("cv.kd(I)Z")
    public static boolean method2390() {
        return field757 >= 2;
    }

    @ObfuscatedName("ct.ky(IB)V")
    public static void method2200(int arg0) {
        field563 = arg0;
    }

    @ObfuscatedName("cd.ks(B)V")
    public static void method2320() {
        if (field563 == 1) {
            field485 = true;
        }
    }

    @ObfuscatedName("hd.lk(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method4440(String arg0) {
        class311[] var1 = class311.method4084();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class311 var3 = var1[var2];
            if (var3.field3950 != -1 && arg0.startsWith(class93.method713(var3.field3950))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3950).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("hc.ln(I)V")
    public static void method4472() {
        if (Statics.field4165 == null) {
            return;
        }
        field766 = field487;
        Statics.field4165.method5393();
        for (int var0 = 0; var0 < field604.length; var0++) {
            if (field604[var0] != null) {
                Statics.field4165.method5380((field604[var0].field1172 >> 7) + Statics.field405, (field604[var0].field1155 >> 7) + Statics.field31);
            }
        }
    }

    @ObfuscatedName("h.la(I)V")
    public static void method11() {
        Statics.field4303.method2110(field481);
    }

    @ObfuscatedName("bt.ls(IB)V")
    public static void method993(int arg0) {
        if (field574 != arg0) {
            field574 = arg0;
        }
    }

    @ObfuscatedName("bt.lr(ZB)V")
    public static void method995(boolean arg0) {
        field624 = arg0;
    }

    @ObfuscatedName("dp.ll(II)Lpz;")
    public static class438 method2515(int arg0) {
        class438 var1 = (class438) field764.method4599((long) arg0);
        if (var1 == null) {
            var1 = new class438(Statics.field4233, arg0);
        }
        return var1;
    }
}

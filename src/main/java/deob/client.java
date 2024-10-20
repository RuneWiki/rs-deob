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
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class398, OAuthApi {

    @ObfuscatedName("client.bf")
    public static boolean field481 = true;

    @ObfuscatedName("client.bw")
    public static int field482 = 1;

    @ObfuscatedName("client.bi")
    public static int field542 = 0;

    @ObfuscatedName("client.ca")
    public static int field484 = 0;

    @ObfuscatedName("client.cj")
    public static boolean field485 = false;

    @ObfuscatedName("client.cn")
    public static boolean field486 = false;

    @ObfuscatedName("client.cy")
    public static int field487 = -1;

    @ObfuscatedName("client.ck")
    public static int field674 = -1;

    @ObfuscatedName("client.cz")
    public static int field489 = -1;

    @ObfuscatedName("client.cg")
    public static boolean field490 = false;

    @ObfuscatedName("client.ch")
    public static int field558 = 212;

    @ObfuscatedName("client.du")
    public static int field529 = 0;

    @ObfuscatedName("client.dn")
    public static boolean field493 = true;

    @ObfuscatedName("client.di")
    public static int field494 = 0;

    @ObfuscatedName("client.en")
    public static long field495 = 1L;

    @ObfuscatedName("client.ee")
    public static int field516 = -1;

    @ObfuscatedName("client.ex")
    public static int field497 = -1;

    @ObfuscatedName("client.ep")
    public static long field498 = -1L;

    @ObfuscatedName("client.eb")
    public static boolean field499 = true;

    @ObfuscatedName("client.er")
    public static int field541 = 0;

    @ObfuscatedName("client.eo")
    public static int field492 = 0;

    @ObfuscatedName("client.ev")
    public static int field718 = 0;

    @ObfuscatedName("client.ef")
    public static int field503 = 0;

    @ObfuscatedName("client.et")
    public static int field504 = 0;

    @ObfuscatedName("client.el")
    public static int field505 = 0;

    @ObfuscatedName("client.ec")
    public static int field506 = 0;

    @ObfuscatedName("client.eg")
    public static int field507 = 0;

    @ObfuscatedName("client.es")
    public static int field670 = 0;

    @ObfuscatedName("client.em")
    public static class101 field509 = class101.field1308;

    @ObfuscatedName("client.ey")
    public static class101 field510 = class101.field1308;

    @ObfuscatedName("client.fz")
    public static int field511 = 0;

    @ObfuscatedName("client.fe")
    public static int field512 = 0;

    @ObfuscatedName("client.fl")
    public static int field513 = 0;

    @ObfuscatedName("client.gk")
    public static int field769 = 0;

    @ObfuscatedName("client.go")
    public static int field701 = 0;

    @ObfuscatedName("client.gn")
    public static int field550 = 0;

    @ObfuscatedName("client.ga")
    public static int field517 = 0;

    @ObfuscatedName("client.gz")
    public static int field488 = 0;

    @ObfuscatedName("client.gu")
    public static class137 field519 = class137.field1596;

    @ObfuscatedName("client.gw")
    public static class483 field520 = class483.field4963;

    @ObfuscatedName("client.gf")
    public String field521;

    @ObfuscatedName("client.gp")
    public class15 field522;

    @ObfuscatedName("client.gj")
    public class19 field523;

    @ObfuscatedName("client.gv")
    public OtlTokenRequester field524;

    @ObfuscatedName("client.gt")
    public Future field525;

    @ObfuscatedName("client.hb")
    public boolean field607 = false;

    @ObfuscatedName("client.hc")
    public class19 field527;

    @ObfuscatedName("client.hd")
    public RefreshAccessTokenRequester field528;

    @ObfuscatedName("client.hr")
    public Future field552;

    @ObfuscatedName("client.hv")
    public static final String field500;

    @ObfuscatedName("client.hq")
    public static boolean field624;

    @ObfuscatedName("client.hp")
    public static class76 field532;

    @ObfuscatedName("client.hf")
    public class478 field635;

    @ObfuscatedName("client.hu")
    public class8 field659;

    @ObfuscatedName("client.hh")
    public long field535 = -1L;

    @ObfuscatedName("client.hz")
    public static byte[] field536;

    @ObfuscatedName("client.ic")
    public static class98[] field682;

    @ObfuscatedName("client.ip")
    public static int field538;

    @ObfuscatedName("client.is")
    public static int[] field539;

    @ObfuscatedName("client.im")
    public static int field540;

    @ObfuscatedName("client.ij")
    public static int[] field663;

    @ObfuscatedName("client.ii")
    public static final class109 field734;

    @ObfuscatedName("client.id")
    public static int field675;

    @ObfuscatedName("client.ih")
    public static boolean field544;

    @ObfuscatedName("client.ik")
    public static class385 field514;

    @ObfuscatedName("client.iw")
    public static HashMap field546;

    @ObfuscatedName("client.it")
    public static String field641;

    @ObfuscatedName("client.jc")
    public static int field628;

    @ObfuscatedName("client.jp")
    public static int field480;

    @ObfuscatedName("client.jg")
    public static int field549;

    @ObfuscatedName("client.jm")
    public static int field776;

    @ObfuscatedName("client.jo")
    public static int field502;

    @ObfuscatedName("client.je")
    public static class210[] field616;

    @ObfuscatedName("client.jq")
    public static boolean field553;

    @ObfuscatedName("client.jh")
    public static int[][][] field581;

    @ObfuscatedName("client.jy")
    public static final int[] field555;

    @ObfuscatedName("client.js")
    public static int field632;

    @ObfuscatedName("client.km")
    public static int field557;

    @ObfuscatedName("client.kn")
    public static int field556;

    @ObfuscatedName("client.kh")
    public static int field559;

    @ObfuscatedName("client.kf")
    public static int field560;

    @ObfuscatedName("client.kw")
    public static boolean field561;

    @ObfuscatedName("client.kj")
    public static int field562;

    @ObfuscatedName("client.ks")
    public static int field563;

    @ObfuscatedName("client.kq")
    public static int field564;

    @ObfuscatedName("client.kv")
    public static int field565;

    @ObfuscatedName("client.kl")
    public static int field547;

    @ObfuscatedName("client.kb")
    public static int field692;

    @ObfuscatedName("client.kz")
    public static int field568;

    @ObfuscatedName("client.kp")
    public static int field569;

    @ObfuscatedName("client.ke")
    public static int field650;

    @ObfuscatedName("client.lg")
    public static int field571;

    @ObfuscatedName("client.lr")
    public static int field741;

    @ObfuscatedName("client.lq")
    public static int field600;

    @ObfuscatedName("client.lf")
    public static int field574;

    @ObfuscatedName("client.lz")
    public static int field515;

    @ObfuscatedName("client.lm")
    public static int field576;

    @ObfuscatedName("client.lb")
    public static boolean field554;

    @ObfuscatedName("client.ld")
    public static int field578;

    @ObfuscatedName("client.lh")
    public static boolean field579;

    @ObfuscatedName("client.lp")
    public static int field501;

    @ObfuscatedName("client.lw")
    public static int field743;

    @ObfuscatedName("client.lx")
    public static int field582;

    @ObfuscatedName("client.li")
    public static int[] field662;

    @ObfuscatedName("client.lt")
    public static int[] field584;

    @ObfuscatedName("client.ll")
    public static int[] field585;

    @ObfuscatedName("client.le")
    public static int[] field645;

    @ObfuscatedName("client.lu")
    public static int[] field587;

    @ObfuscatedName("client.ls")
    public static int[] field588;

    @ObfuscatedName("client.la")
    public static int[] field589;

    @ObfuscatedName("client.lc")
    public static String[] field590;

    @ObfuscatedName("client.lo")
    public static int[][] field591;

    @ObfuscatedName("client.ly")
    public static int field592;

    @ObfuscatedName("client.my")
    public static int field593;

    @ObfuscatedName("client.ma")
    public static int field594;

    @ObfuscatedName("client.mg")
    public static int field595;

    @ObfuscatedName("client.mw")
    public static int field518;

    @ObfuscatedName("client.mh")
    public static int field597;

    @ObfuscatedName("client.mv")
    public static int field666;

    @ObfuscatedName("client.mo")
    public static boolean field599;

    @ObfuscatedName("client.mi")
    public static int field668;

    @ObfuscatedName("client.ms")
    public static boolean field601;

    @ObfuscatedName("client.mb")
    public static class90[] field758;

    @ObfuscatedName("client.mj")
    public static int field603;

    @ObfuscatedName("client.mr")
    public static int field604;

    @ObfuscatedName("client.mf")
    public static long field672;

    @ObfuscatedName("client.mc")
    public static boolean field606;

    @ObfuscatedName("client.mn")
    public static int field496;

    @ObfuscatedName("client.mk")
    public static int field608;

    @ObfuscatedName("client.mp")
    public static int[] field609;

    @ObfuscatedName("client.ns")
    public static final int[] field610;

    @ObfuscatedName("client.ne")
    public static String[] field611;

    @ObfuscatedName("client.nk")
    public static boolean[] field612;

    @ObfuscatedName("client.nz")
    public static int[] field613;

    @ObfuscatedName("client.ng")
    public static int field614;

    @ObfuscatedName("client.nr")
    public static class359[][][] field615;

    @ObfuscatedName("client.nf")
    public static class359 field548;

    @ObfuscatedName("client.na")
    public static class359 field617;

    @ObfuscatedName("client.nw")
    public static class359 field618;

    @ObfuscatedName("client.nv")
    public static int[] field619;

    @ObfuscatedName("client.nd")
    public static int[] field620;

    @ObfuscatedName("client.no")
    public static int[] field621;

    @ObfuscatedName("client.nb")
    public static boolean field622;

    @ObfuscatedName("client.nu")
    public static boolean field768;

    @ObfuscatedName("client.nl")
    public static int field759;

    @ObfuscatedName("client.nj")
    public static int[] field625;

    @ObfuscatedName("client.nc")
    public static int[] field626;

    @ObfuscatedName("client.ni")
    public static int[] field627;

    @ObfuscatedName("client.ny")
    public static int[] field684;

    @ObfuscatedName("client.nn")
    public static int[] field629;

    @ObfuscatedName("client.nh")
    public static String[] field630;

    @ObfuscatedName("client.om")
    public static String[] field709;

    @ObfuscatedName("client.oa")
    public static boolean[] field680;

    @ObfuscatedName("client.ok")
    public static boolean field633;

    @ObfuscatedName("client.ov")
    public static boolean field634;

    @ObfuscatedName("client.og")
    public static boolean field531;

    @ObfuscatedName("client.oh")
    public static int field636;

    @ObfuscatedName("client.ob")
    public static int field605;

    @ObfuscatedName("client.ow")
    public static int field537;

    @ObfuscatedName("client.oj")
    public static int field551;

    @ObfuscatedName("client.od")
    public static int field640;

    @ObfuscatedName("client.on")
    public static boolean field767;

    @ObfuscatedName("client.oc")
    public static int field643;

    @ObfuscatedName("client.ot")
    public static int field491;

    @ObfuscatedName("client.os")
    public static String field712;

    @ObfuscatedName("client.ox")
    public static String field646;

    @ObfuscatedName("client.oo")
    public static int field647;

    @ObfuscatedName("client.of")
    public static class455 field648;

    @ObfuscatedName("client.pm")
    public static int field649;

    @ObfuscatedName("client.ps")
    public static int field764;

    @ObfuscatedName("client.pe")
    public static int field651;

    @ObfuscatedName("client.pn")
    public static class313 field652;

    @ObfuscatedName("client.pq")
    public static int field653;

    @ObfuscatedName("client.pd")
    public static int field654;

    @ObfuscatedName("client.py")
    public static int field655;

    @ObfuscatedName("client.pa")
    public static int field656;

    @ObfuscatedName("client.pk")
    public static boolean field657;

    @ObfuscatedName("client.pz")
    public static class313 field773;

    @ObfuscatedName("client.po")
    public static class313 field602;

    @ObfuscatedName("client.pb")
    public static class313 field660;

    @ObfuscatedName("client.pl")
    public static int field661;

    @ObfuscatedName("client.ph")
    public static int field637;

    @ObfuscatedName("client.pc")
    public static class313 field744;

    @ObfuscatedName("client.pt")
    public static boolean field664;

    @ObfuscatedName("client.pf")
    public static int field665;

    @ObfuscatedName("client.pj")
    public static int field598;

    @ObfuscatedName("client.pr")
    public static boolean field772;

    @ObfuscatedName("client.px")
    public static int field573;

    @ObfuscatedName("client.pg")
    public static int field669;

    @ObfuscatedName("client.pv")
    public static boolean field708;

    @ObfuscatedName("client.qa")
    public static int field671;

    @ObfuscatedName("client.qt")
    public static int[] field580;

    @ObfuscatedName("client.qx")
    public static int field673;

    @ObfuscatedName("client.qo")
    public static int[] field534;

    @ObfuscatedName("client.qs")
    public static int field667;

    @ObfuscatedName("client.qv")
    public static int[] field676;

    @ObfuscatedName("client.ql")
    public static int field677;

    @ObfuscatedName("client.qf")
    public static int[] field678;

    @ObfuscatedName("client.qd")
    public static int field679;

    @ObfuscatedName("client.qq")
    public static int field631;

    @ObfuscatedName("client.qw")
    public static int field702;

    @ObfuscatedName("client.qn")
    public static int field526;

    @ObfuscatedName("client.qb")
    public static int field683;

    @ObfuscatedName("client.qg")
    public static int field483;

    @ObfuscatedName("client.qm")
    public static int field644;

    @ObfuscatedName("client.qr")
    public static int field686;

    @ObfuscatedName("client.qz")
    public static int field687;

    @ObfuscatedName("client.rx")
    public static int field688;

    @ObfuscatedName("client.ru")
    public static class496 field689;

    @ObfuscatedName("client.ra")
    public static class359 field690;

    @ObfuscatedName("client.rt")
    public static class359 field691;

    @ObfuscatedName("client.rb")
    public static class359 field530;

    @ObfuscatedName("client.rk")
    public static class359 field693;

    @ObfuscatedName("client.rc")
    public static class455 field533;

    @ObfuscatedName("client.ry")
    public static int field695;

    @ObfuscatedName("client.rv")
    public static int field696;

    @ObfuscatedName("client.rp")
    public static boolean[] field723;

    @ObfuscatedName("client.rz")
    public static boolean[] field698;

    @ObfuscatedName("client.rh")
    public static boolean[] field699;

    @ObfuscatedName("client.ri")
    public static int[] field596;

    @ObfuscatedName("client.rn")
    public static int[] field720;

    @ObfuscatedName("client.rm")
    public static int[] field586;

    @ObfuscatedName("client.rl")
    public static int[] field703;

    @ObfuscatedName("client.re")
    public static int field704;

    @ObfuscatedName("client.rq")
    public static long field697;

    @ObfuscatedName("client.rr")
    public static boolean field706;

    @ObfuscatedName("client.sd")
    public static int[] field707;

    @ObfuscatedName("client.sv")
    public static int field694;

    @ObfuscatedName("client.st")
    public static int field639;

    @ObfuscatedName("client.sh")
    public static String field638;

    @ObfuscatedName("client.si")
    public static long[] field711;

    @ObfuscatedName("client.se")
    public static int field753;

    @ObfuscatedName("client.sq")
    public static class209 field713;

    @ObfuscatedName("client.sy")
    public static class207 field714;

    @ObfuscatedName("client.ss")
    public static int field715;

    @ObfuscatedName("client.sw")
    public static int[] field642;

    @ObfuscatedName("client.so")
    public static int[] field717;

    @ObfuscatedName("client.sg")
    public static long field623;

    @ObfuscatedName("client.sj")
    public static class152[] field775;

    @ObfuscatedName("client.sm")
    public static class161[] field658;

    @ObfuscatedName("client.sp")
    public static int field721;

    @ObfuscatedName("client.sn")
    public static int field722;

    @ObfuscatedName("client.sa")
    public static int[] field710;

    @ObfuscatedName("client.sr")
    public static int[] field724;

    @ObfuscatedName("client.tk")
    public static class492[] field725;

    @ObfuscatedName("client.tl")
    public static int field726;

    @ObfuscatedName("client.tg")
    public static int field727;

    @ObfuscatedName("client.tw")
    public static int field728;

    @ObfuscatedName("client.tf")
    public static int field729;

    @ObfuscatedName("client.tt")
    public static boolean field730;

    @ObfuscatedName("client.ts")
    public static int field731;

    @ObfuscatedName("client.tx")
    public static int[] field732;

    @ObfuscatedName("client.ta")
    public static int[] field733;

    @ObfuscatedName("client.tq")
    public static int[] field685;

    @ObfuscatedName("client.to")
    public static int[] field735;

    @ObfuscatedName("client.tb")
    public static class40[] field736;

    @ObfuscatedName("client.tc")
    public static boolean field737;

    @ObfuscatedName("client.uq")
    public static boolean field738;

    @ObfuscatedName("client.uz")
    public static boolean[] field739;

    @ObfuscatedName("client.ur")
    public static int[] field740;

    @ObfuscatedName("client.um")
    public static int[] field681;

    @ObfuscatedName("client.ux")
    public static int[] field742;

    @ObfuscatedName("client.up")
    public static int[] field567;

    @ObfuscatedName("client.un")
    public static short field545;

    @ObfuscatedName("client.ud")
    public static short field745;

    @ObfuscatedName("client.ut")
    public static short field583;

    @ObfuscatedName("client.ui")
    public static short field747;

    @ObfuscatedName("client.vl")
    public static short field748;

    @ObfuscatedName("client.vh")
    public static short field749;

    @ObfuscatedName("client.vg")
    public static short field750;

    @ObfuscatedName("client.vd")
    public static short field751;

    @ObfuscatedName("client.vk")
    public static int field752;

    @ObfuscatedName("client.va")
    public static int field577;

    @ObfuscatedName("client.vq")
    public static int field754;

    @ObfuscatedName("client.vm")
    public static int field755;

    @ObfuscatedName("client.vb")
    public static int field756;

    @ObfuscatedName("client.vn")
    public static class310 field705;

    @ObfuscatedName("client.ve")
    public static int field757;

    @ObfuscatedName("client.vv")
    public static int field719;

    @ObfuscatedName("client.vp")
    public static class447 field760;

    @ObfuscatedName("client.vr")
    public static class349[] field761;

    @ObfuscatedName("client.vw")
    public static class64 field762;

    @ObfuscatedName("client.vz")
    public static class395 field763;

    @ObfuscatedName("client.vx")
    public static class276 field570;

    @ObfuscatedName("client.vt")
    public static class276 field765;

    @ObfuscatedName("client.wf")
    public static int field766;

    @ObfuscatedName("client.wq")
    public static int field575;

    @ObfuscatedName("client.wl")
    public static List field746;

    @ObfuscatedName("client.wk")
    public static ArrayList field771;

    @ObfuscatedName("client.wn")
    public static int field770;

    @ObfuscatedName("client.we")
    public static int field716;

    @ObfuscatedName("client.wa")
    public static final class63 field572;

    @ObfuscatedName("client.wi")
    public static int[] field543;

    @ObfuscatedName("client.wy")
    public static int[] field774;

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
        field500 = class367.method5955(var1);
        field624 = false;
        field532 = new class76();
        field536 = null;
        field682 = new class98[65536];
        field538 = 0;
        field539 = new int[65536];
        field540 = 0;
        field663 = new int[250];
        field734 = new class109();
        field675 = 0;
        field544 = false;
        field514 = new class385();
        field546 = new HashMap();
        field628 = 0;
        field480 = 1;
        field549 = 0;
        field776 = 1;
        field502 = 0;
        field616 = new class210[4];
        field553 = false;
        field581 = new int[4][13][13];
        field555 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field632 = 0;
        field557 = 2301979;
        field556 = 5063219;
        field559 = 3353893;
        field560 = 7759444;
        field561 = false;
        field562 = 0;
        field563 = 128;
        field564 = 0;
        field565 = 0;
        field547 = 0;
        field692 = 0;
        field568 = 0;
        field569 = 0;
        field650 = 50;
        field571 = 0;
        field741 = 0;
        field600 = 0;
        field574 = 12;
        field515 = 6;
        field576 = 0;
        field554 = false;
        field578 = 0;
        field579 = false;
        field501 = 0;
        field743 = 0;
        field582 = 50;
        field662 = new int[field582];
        field584 = new int[field582];
        field585 = new int[field582];
        field645 = new int[field582];
        field587 = new int[field582];
        field588 = new int[field582];
        field589 = new int[field582];
        field590 = new String[field582];
        field591 = new int[104][104];
        field592 = 0;
        field593 = -1;
        field594 = -1;
        field595 = 0;
        field518 = 0;
        field597 = 0;
        field666 = 0;
        field599 = true;
        field668 = 0;
        field601 = true;
        field758 = new class90[2048];
        field603 = -1;
        field604 = 0;
        field672 = -1L;
        field606 = true;
        field496 = 0;
        field608 = 0;
        field609 = new int[1000];
        field610 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field611 = new String[8];
        field612 = new boolean[8];
        field613 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field614 = -1;
        field615 = new class359[4][104][104];
        field548 = new class359();
        field617 = new class359();
        field618 = new class359();
        field619 = new int[25];
        field620 = new int[25];
        field621 = new int[25];
        field622 = false;
        field768 = false;
        field759 = 0;
        field625 = new int[500];
        field626 = new int[500];
        field627 = new int[500];
        field684 = new int[500];
        field629 = new int[500];
        field630 = new String[500];
        field709 = new String[500];
        field680 = new boolean[500];
        field633 = false;
        field634 = false;
        field531 = true;
        field636 = -1;
        field605 = -1;
        field537 = 0;
        field551 = 50;
        field640 = 0;
        field641 = null;
        field767 = false;
        field643 = -1;
        field491 = -1;
        field712 = null;
        field646 = null;
        field647 = -1;
        field648 = new class455(8);
        field649 = 0;
        field764 = -1;
        field651 = 0;
        field652 = null;
        field653 = 0;
        field654 = 0;
        field655 = 0;
        field656 = -1;
        field657 = false;
        field773 = null;
        field602 = null;
        field660 = null;
        field661 = 0;
        field637 = 0;
        field744 = null;
        field664 = false;
        field665 = -1;
        field598 = -1;
        field772 = false;
        field573 = -1;
        field669 = -1;
        field708 = false;
        field671 = 1;
        field580 = new int[32];
        field673 = 0;
        field534 = new int[32];
        field667 = 0;
        field676 = new int[32];
        field677 = 0;
        field678 = new int[32];
        field679 = 0;
        field631 = 0;
        field702 = 0;
        field526 = 0;
        field683 = 0;
        field483 = 0;
        field644 = 0;
        field686 = 0;
        field687 = 0;
        field688 = 0;
        field689 = new class496();
        field690 = new class359();
        field691 = new class359();
        field530 = new class359();
        field693 = new class359();
        field533 = new class455(512);
        field695 = 0;
        field696 = -2;
        field723 = new boolean[100];
        field698 = new boolean[100];
        field699 = new boolean[100];
        field596 = new int[100];
        field720 = new int[100];
        field586 = new int[100];
        field703 = new int[100];
        field704 = 0;
        field697 = 0L;
        field706 = true;
        field707 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field694 = 0;
        field639 = 0;
        field638 = "";
        field711 = new long[100];
        field753 = 0;
        field713 = new class209();
        field714 = new class207();
        field715 = 0;
        field642 = new int[128];
        field717 = new int[128];
        field623 = -1L;
        field775 = new class152[4];
        field658 = new class161[4];
        field721 = -1;
        field722 = 0;
        field710 = new int[1000];
        field724 = new int[1000];
        field725 = new class492[1000];
        field726 = 0;
        field727 = 0;
        field728 = 0;
        field729 = -1;
        field730 = false;
        field731 = 0;
        field732 = new int[50];
        field733 = new int[50];
        field685 = new int[50];
        field735 = new int[50];
        field736 = new class40[50];
        field737 = false;
        field738 = false;
        field739 = new boolean[5];
        field740 = new int[5];
        field681 = new int[5];
        field742 = new int[5];
        field567 = new int[5];
        field545 = 256;
        field745 = 205;
        field583 = 256;
        field747 = 320;
        field748 = 1;
        field749 = 32767;
        field750 = 1;
        field751 = 32767;
        field752 = 0;
        field577 = 0;
        field754 = 0;
        field755 = 0;
        field756 = 0;
        field705 = new class310();
        field757 = -1;
        field719 = -1;
        field760 = new class445();
        field761 = new class349[8];
        field762 = new class64();
        field763 = new class395(8, class393.field4476);
        field570 = new class276(64);
        field765 = new class276(64);
        field766 = -1;
        field575 = -1;
        field746 = new ArrayList();
        field771 = new ArrayList(10);
        field770 = 0;
        field716 = 0;
        field572 = new class63();
        field543 = new int[50];
        field774 = new int[50];
    }

    @ObfuscatedName("rf.fi(B)Lrc;")
    public static class449 method7771() {
        return Statics.field2889;
    }

    @ObfuscatedName("client.bp(B)V")
    public final void method506() {
    }

    public final void init() {
        if (!this.method486()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class99.field1288)) {
                            field485 = true;
                        } else {
                            field485 = false;
                        }
                        break;
                    case 4:
                        if (field674 == -1) {
                            field674 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field542 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var3 = Integer.parseInt(var2);
                        class355 var4;
                        if (var3 >= 0 && var3 < class355.field4289.length) {
                            var4 = class355.field4289[var3];
                        } else {
                            var4 = null;
                        }
                        Statics.field860 = var4;
                        break;
                    case 7:
                        Statics.field3766 = class328.method3083(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class99.field1288)) {
                        }
                        break;
                    case 9:
                        Statics.field4791 = var2;
                        break;
                    case 10:
                        Statics.field4871 = (class329) class354.method5197(class329.method2027(), Integer.parseInt(var2));
                        if (Statics.field4871 == class329.field3783) {
                            Statics.field2619 = class458.field4828;
                        } else {
                            Statics.field2619 = class458.field4821;
                        }
                        break;
                    case 11:
                        Statics.field2335 = var2;
                        break;
                    case 12:
                        field482 = Integer.parseInt(var2);
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
                        Statics.field2331 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field484 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2089 = var2;
                        break;
                    case 21:
                        field487 = Integer.parseInt(var2);
                        break;
                    case 25:
                        int var5 = var2.indexOf(".");
                        if (var5 == -1) {
                            field558 = Integer.parseInt(var2);
                        } else {
                            field558 = Integer.parseInt(var2.substring(0, var5));
                            Integer.parseInt(var2.substring(var5 + 1));
                        }
                }
            }
        }
        class223.field2559 = false;
        field486 = false;
        Statics.field1962 = this.getCodeBase().getHost();
        String var6 = Statics.field3766.field3774;
        byte var7 = 0;
        try {
            class171.method2183("oldschool", var6, var7, 22);
        } catch (Exception var9) {
            class504.method6263((String) null, var9);
        }
        Statics.field4480 = this;
        Statics.field4833 = field674;
        method3558();
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field607 = true;
        }
        if (field489 == -1) {
            if (this.method1149() || this.method1150()) {
                field489 = 5;
            } else {
                field489 = 0;
            }
        }
        this.method484(765, 503, 212, 1);
    }

    @ObfuscatedName("hu.fd(I)V")
    public static void method3558() {
        Statics.field3461 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field64 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field1121 = System.getenv("JX_SESSION_ID");
        Statics.field4643 = System.getenv("JX_CHARACTER_ID");
        String var0 = System.getenv("JX_DISPLAY_NAME");
        class74.field912 = class459.method2184(var0);
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field524 = arg0;
            class74.method167(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field528 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field529 == 10;
    }

    public long getAccountHash() {
        return this.field535;
    }

    @ObfuscatedName("client.fp(B)Z")
    public boolean method1149() {
        return Statics.field3461 != null && !Statics.field3461.trim().isEmpty() && Statics.field64 != null && !Statics.field64.trim().isEmpty();
    }

    @ObfuscatedName("client.fx(I)Z")
    public boolean method1150() {
        return Statics.field1121 != null && !Statics.field1121.trim().isEmpty() && Statics.field4643 != null && !Statics.field4643.trim().isEmpty();
    }

    @ObfuscatedName("client.gm(B)Z")
    public boolean method1420() {
        return this.field524 != null;
    }

    @ObfuscatedName("client.gk(Ljava/lang/String;B)V")
    public void method1152(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field2335 + "shield/oauth/token" + (new class435(var2)).method7319());
        class391 var4 = new class391();
        var4.method6759(field500);
        var4.method6758("Host", (new URL(Statics.field2335)).getHost());
        var4.method6763(class432.field4640);
        class10 var5 = class10.field38;
        RefreshAccessTokenRequester var6 = this.field528;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field607);
            this.field527 = this.field522.method159(var7);
        } else {
            this.field552 = var6.request(var5.method59(), var3, var4.method6755(), "");
        }
    }

    @ObfuscatedName("client.gb(Ljava/lang/String;I)V")
    public void method1299(String arg0) throws IOException {
        URL var2 = new URL(Statics.field2335 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class391 var3 = new class391();
        var3.method6756(arg0);
        class10 var4 = class10.field34;
        OtlTokenRequester var5 = this.field524;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field607);
            this.field523 = this.field522.method159(var6);
        } else {
            this.field525 = var5.request(var4.method59(), var2, var3.method6755(), "");
        }
    }

    @ObfuscatedName("client.go(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1154(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field2335 + "/game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field38, this.field607);
        var4.method72().method6756(arg0);
        var4.method72().method6763(class432.field4640);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method73(new class434(var5));
        this.field523 = this.field522.method159(var4);
    }

    @ObfuscatedName("client.bk(I)V")
    public final void method497() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field2341 = null;
            Statics.field318 = null;
            Statics.field1041 = (byte[][][]) null;
            class383.method5194();
        } else {
            Statics.field2341 = var1;
            Statics.field318 = new int[var1.length];
            Statics.field1041 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field2341.length; var3++) {
                Statics.field1041[var3] = new byte[var2[var3]][];
                class383.field4425.add(var1[var3]);
            }
            Collections.sort(class383.field4425);
        }
        Statics.field3309 = field484 == 0 ? 43594 : field482 + 40000;
        Statics.field3694 = field484 == 0 ? 443 : field482 + 50000;
        Statics.field1714 = Statics.field3309;
        Statics.field3458 = class312.field3506;
        Statics.field2316 = class312.field3504;
        Statics.field1530 = class312.field3508;
        Statics.field1496 = class312.field3503;
        Statics.field4254 = new class111(this.field607, 212);
        this.method477();
        this.method480();
        Statics.field28 = this.method517();
        this.method470(field714, 0);
        this.method470(field713, 1);
        Statics.field3363 = new class414(255, class171.field1818, class171.field1823, 500000);
        class460 var4 = null;
        class96 var5 = new class96();
        try {
            var4 = class171.method6049("", Statics.field4871.field3787, false);
            byte[] var6 = new byte[(int) var4.method7658()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method7660(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class96(new class478(var6));
        } catch (Exception var15) {
        }
        try {
            if (var4 != null) {
                var4.method7678();
            }
        } catch (Exception var14) {
        }
        Statics.field2929 = var5;
        this.method474();
        String var13 = Statics.field1425;
        class32.field167 = this;
        if (var13 != null) {
            class32.field162 = var13;
        }
        method2496(Statics.field2929.method2336());
        Statics.field16 = new class66(Statics.field2619);
        this.field522 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("mv.gn(I)Lic;")
    public static class209 method5740() {
        return field713;
    }

    @ObfuscatedName("client.br(B)V")
    public final void method498() {
        field494++;
        this.method1156();
        class337.method3399();
        try {
            if (class294.field3330 == 1) {
                int var1 = Statics.field3331.method5012();
                if (var1 > 0 && Statics.field3331.method5036()) {
                    int var2 = var1 - Statics.field4981;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field3331.method5009(var2);
                } else {
                    Statics.field3331.method5014();
                    Statics.field3331.method5072();
                    if (Statics.field4333 == null) {
                        class294.field3330 = 0;
                    } else {
                        class294.field3330 = 2;
                    }
                    Statics.field4543 = null;
                    Statics.field3333 = null;
                }
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            Statics.field3331.method5014();
            class294.field3330 = 0;
            Statics.field4543 = null;
            Statics.field3333 = null;
            Statics.field4333 = null;
        }
        method3345();
        field713.method3749();
        this.method478();
        class36 var4 = class36.field234;
        synchronized (class36.field234) {
            class36.field229 = class36.field220;
            class36.field228 = class36.field224;
            class36.field227 = class36.field225;
            class36.field230 = class36.field226;
            class36.field235 = class36.field231;
            class36.field236 = class36.field232;
            class36.field237 = class36.field233;
            class36.field219 = class36.field238;
            class36.field231 = 0;
        }
        if (Statics.field28 != null) {
            int var6 = Statics.field28.method292();
            field688 = var6;
        }
        if (field529 == 0) {
            method1142();
            class35.method5785();
        } else if (field529 == 5) {
            class74.method4968(this, Statics.field3693, Statics.field4608);
            method1142();
            class35.method5785();
        } else if (field529 == 10 || field529 == 11) {
            class74.method4968(this, Statics.field3693, Statics.field4608);
        } else if (field529 == 20) {
            class74.method4968(this, Statics.field3693, Statics.field4608);
            this.method1159();
        } else if (field529 == 50) {
            class74.method4968(this, Statics.field3693, Statics.field4608);
            this.method1159();
        } else if (field529 == 25) {
            method803();
        }
        if (field529 == 30) {
            this.method1160();
        } else if (field529 == 40 || field529 == 45) {
            this.method1159();
        }
    }

    @ObfuscatedName("client.ba(ZS)V")
    public final void method550(boolean arg0) {
        boolean var2 = Statics.method5188();
        if (var2 && field730 && Statics.field826 != null) {
            Statics.field826.method756();
        }
        if ((field529 == 10 || field529 == 20 || field529 == 30) && field697 != 0L && class290.method4466() > field697) {
            method2496(method48());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field723[var3] = true;
            }
        }
        if (field529 == 0) {
            this.method521(class74.field898, class74.field899, arg0);
        } else if (field529 == 5) {
            class74.method2946(Statics.field24, Statics.field3693, Statics.field4608);
        } else if (field529 == 10 || field529 == 11) {
            class74.method2946(Statics.field24, Statics.field3693, Statics.field4608);
        } else if (field529 == 20) {
            class74.method2946(Statics.field24, Statics.field3693, Statics.field4608);
        } else if (field529 == 50) {
            class74.method2946(Statics.field24, Statics.field3693, Statics.field4608);
        } else if (field529 == 25) {
            if (field502 == 1) {
                if (field628 > field480) {
                    field480 = field628;
                }
                int var4 = (field480 * 50 - field628 * 50) / field480;
                method196(class333.field3812 + class99.field1287 + class99.field1290 + var4 + "%" + class99.field1291, false);
            } else if (field502 == 2) {
                if (field549 > field776) {
                    field776 = field549;
                }
                int var5 = (field776 * 50 - field549 * 50) / field776 + 50;
                method196(class333.field3812 + class99.field1287 + class99.field1290 + var5 + "%" + class99.field1291, false);
            } else {
                method196(class333.field3812, false);
            }
        } else if (field529 == 30) {
            this.method1657();
        } else if (field529 == 40) {
            method196(class333.field4024 + class99.field1287 + class333.field3814, false);
        } else if (field529 == 45) {
            method196(class333.field3973, false);
        }
        if (field529 == 30 && field704 == 0 && !arg0 && !field706) {
            for (int var6 = 0; var6 < field695; var6++) {
                if (field698[var6]) {
                    Statics.field3785.method445(field596[var6], field720[var6], field586[var6], field703[var6]);
                    field698[var6] = false;
                }
            }
        } else if (field529 > 0) {
            Statics.field3785.method452(0, 0);
            for (int var7 = 0; var7 < field695; var7++) {
                field698[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.bz(B)V")
    public final void method613() {
        if (Statics.field2901.method2565()) {
            Statics.field2901.method2571();
        }
        if (Statics.field2350 != null) {
            Statics.field2350.field1059 = false;
        }
        Statics.field2350 = null;
        field734.method2637();
        if (class36.field234 != null) {
            class36 var1 = class36.field234;
            synchronized (class36.field234) {
                class36.field234 = null;
            }
        }
        Statics.field28 = null;
        if (Statics.field826 != null) {
            Statics.field826.method757();
        }
        if (Statics.field2734 != null) {
            Statics.field2734.method757();
        }
        if (Statics.field4209 != null) {
            Statics.field4209.method7040();
        }
        class337.method3181();
        if (Statics.field4254 != null) {
            Statics.field4254.method2658();
            Statics.field4254 = null;
        }
        class171.method4732();
        this.field522.method170();
    }

    @ObfuscatedName("at.ga(II)V")
    public static void method274(int arg0) {
        if (field529 == arg0) {
            return;
        }
        if (field529 == 30) {
            field714.method3738();
        }
        if (field529 == 0) {
            Statics.field4480.method501();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method1082(0);
            field550 = 0;
            field517 = 0;
            field514.method6732(arg0);
            if (arg0 != 20) {
                method2887(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2412 != null) {
            Statics.field2412.method7040();
            Statics.field2412 = null;
        }
        if (field529 == 25) {
            field502 = 0;
            field628 = 0;
            field480 = 1;
            field549 = 0;
            field776 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field2929.method2334() >= field487;
            int var3 = var2 ? 0 : 12;
            class74.method5230(Statics.field2582, Statics.field1639, true, var3);
        } else if (arg0 == 20) {
            int var1 = field529 == 11 ? 4 : 0;
            class74.method5230(Statics.field2582, Statics.field1639, false, var1);
        } else if (arg0 == 11) {
            class74.method5230(Statics.field2582, Statics.field1639, false, 4);
        } else if (arg0 == 50) {
            Statics.method3906("", "Updating date of birth...", "");
            class74.method5230(Statics.field2582, Statics.field1639, false, 7);
        } else {
            class74.method6074();
        }
        field529 = arg0;
    }

    @ObfuscatedName("client.gz(I)V")
    public void method1156() {
        if (field529 == 1000) {
            return;
        }
        long var1 = class290.method4466();
        int var3 = (int) (var1 - Statics.field4205);
        Statics.field4205 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class341.field4204 += var3;
        boolean var4;
        if (class341.field4211 == 0 && class341.field4203 == 0 && class341.field4212 == 0 && class341.field4225 == 0) {
            var4 = true;
        } else if (Statics.field4209 == null) {
            var4 = false;
        } else {
            try {
                label216: {
                    if (class341.field4204 > 30000) {
                        throw new IOException();
                    }
                    while (class341.field4203 < 200 && class341.field4225 > 0) {
                        class339 var5 = (class339) class341.field4206.method7614();
                        class478 var6 = new class478(4);
                        var6.method7886(1);
                        var6.method8033((int) var5.field4673);
                        Statics.field4209.method7039(var6.field4906, 0, 4);
                        class341.field4207.method7616(var5, var5.field4673);
                        class341.field4225--;
                        class341.field4203++;
                    }
                    while (class341.field4211 < 200 && class341.field4212 > 0) {
                        class339 var7 = (class339) class341.field4210.method6079();
                        class478 var8 = new class478(4);
                        var8.method7886(0);
                        var8.method8033((int) var7.field4673);
                        Statics.field4209.method7039(var8.field4906, 0, 4);
                        var7.method7331();
                        class341.field4213.method7616(var7, var7.field4673);
                        class341.field4212--;
                        class341.field4211++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field4209.method7036();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class341.field4204 = 0;
                        byte var11 = 0;
                        if (Statics.field1566 == null) {
                            var11 = 8;
                        } else if (class341.field4217 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class341.field4215.field4904;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field4209.method7038(class341.field4215.field4906, class341.field4215.field4904, var12);
                            if (class341.field4214 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class341.field4215.field4906[class341.field4215.field4904 + var13] ^= class341.field4214;
                                }
                            }
                            class341.field4215.field4904 += var12;
                            if (class341.field4215.field4904 < var11) {
                                break;
                            }
                            if (Statics.field1566 == null) {
                                class341.field4215.field4904 = 0;
                                int var14 = class341.field4215.method7909();
                                int var15 = class341.field4215.method7905();
                                int var16 = class341.field4215.method7909();
                                int var17 = class341.field4215.method7908();
                                long var18 = (long) ((var14 << 16) + var15);
                                class339 var20 = (class339) class341.field4207.method7619(var18);
                                Statics.field1892 = true;
                                if (var20 == null) {
                                    var20 = (class339) class341.field4213.method7619(var18);
                                    Statics.field1892 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1566 = var20;
                                Statics.field4216 = new class478(var17 + var21 + Statics.field1566.field4185);
                                Statics.field4216.method7886(var16);
                                Statics.field4216.method7957(var17);
                                class341.field4217 = 8;
                                class341.field4215.field4904 = 0;
                            } else if (class341.field4217 == 0) {
                                if (class341.field4215.field4906[0] == -1) {
                                    class341.field4217 = 1;
                                    class341.field4215.field4904 = 0;
                                } else {
                                    Statics.field1566 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field4216.field4906.length - Statics.field1566.field4185;
                            int var23 = 512 - class341.field4217;
                            if (var23 > var22 - Statics.field4216.field4904) {
                                var23 = var22 - Statics.field4216.field4904;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field4209.method7038(Statics.field4216.field4906, Statics.field4216.field4904, var23);
                            if (class341.field4214 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field4216.field4906[Statics.field4216.field4904 + var24] ^= class341.field4214;
                                }
                            }
                            Statics.field4216.field4904 += var23;
                            class341.field4217 += var23;
                            if (Statics.field4216.field4904 == var22) {
                                if (Statics.field1566.field4673 == 16711935L) {
                                    Statics.field1224 = Statics.field4216;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class338 var26 = class341.field4219[var25];
                                        if (var26 != null) {
                                            Statics.field1224.field4904 = var25 * 8 + 5;
                                            if (Statics.field1224.field4904 >= Statics.field1224.field4906.length) {
                                                if (!var26.field4180) {
                                                    throw new RuntimeException("");
                                                }
                                                var26.method5813();
                                            } else {
                                                int var27 = Statics.field1224.method7908();
                                                int var28 = Statics.field1224.method7908();
                                                var26.method5814(var27, var28);
                                            }
                                        }
                                    }
                                } else {
                                    class341.field4208.reset();
                                    class341.field4208.update(Statics.field4216.field4906, 0, var22);
                                    int var29 = (int) class341.field4208.getValue();
                                    if (Statics.field1566.field4183 != var29) {
                                        try {
                                            Statics.field4209.method7040();
                                        } catch (Exception var35) {
                                        }
                                        class341.field4223++;
                                        Statics.field4209 = null;
                                        class341.field4214 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label216;
                                    }
                                    class341.field4223 = 0;
                                    class341.field4224 = 0;
                                    Statics.field1566.field4182.method5828((int) (Statics.field1566.field4673 & 0xFFFFL), Statics.field4216.field4906, (Statics.field1566.field4673 & 0xFF0000L) == 16711680L, Statics.field1892);
                                }
                                Statics.field1566.method7335();
                                if (Statics.field1892) {
                                    class341.field4203--;
                                } else {
                                    class341.field4211--;
                                }
                                class341.field4217 = 0;
                                Statics.field1566 = null;
                                Statics.field4216 = null;
                            } else {
                                if (class341.field4217 != 512) {
                                    break;
                                }
                                class341.field4217 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field4209.method7040();
                } catch (Exception var34) {
                }
                class341.field4224++;
                Statics.field4209 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1222();
        }
    }

    @ObfuscatedName("client.gu(I)V")
    public void method1222() {
        if (class341.field4223 >= 4) {
            this.method493("js5crc");
            method274(1000);
            return;
        }
        if (class341.field4224 >= 4) {
            if (field529 <= 5) {
                this.method493("js5io");
                method274(1000);
                return;
            }
            field513 = 3000;
            class341.field4224 = 3;
        }
        if (--field513 + 1 > 0) {
            return;
        }
        try {
            if (field512 == 0) {
                Statics.field2266 = Statics.field198.method3169(Statics.field1962, Statics.field1714);
                field512++;
            }
            if (field512 == 1) {
                if (Statics.field2266.field1856 == 2) {
                    this.method1158(-1);
                    return;
                }
                if (Statics.field2266.field1856 == 1) {
                    field512++;
                }
            }
            if (field512 == 2) {
                Socket var1 = (Socket) Statics.field2266.field1853;
                class411 var2 = new class411(var1, 40000, 5000);
                Statics.field306 = var2;
                class478 var3 = new class478(5);
                var3.method7886(15);
                var3.method7957(212);
                Statics.field306.method7039(var3.field4906, 0, 5);
                field512++;
                Statics.field3440 = class290.method4466();
            }
            if (field512 == 3) {
                if (Statics.field306.method7036() > 0) {
                    int var4 = Statics.field306.method7037();
                    if (var4 != 0) {
                        this.method1158(var4);
                        return;
                    }
                    field512++;
                } else if (class290.method4466() - Statics.field3440 > 30000L) {
                    this.method1158(-2);
                    return;
                }
            }
            if (field512 == 4) {
                class410 var5 = Statics.field306;
                boolean var6 = field529 > 20;
                if (Statics.field4209 != null) {
                    try {
                        Statics.field4209.method7040();
                    } catch (Exception var16) {
                    }
                    Statics.field4209 = null;
                }
                Statics.field4209 = var5;
                class341.method3104(var6);
                class341.field4215.field4904 = 0;
                Statics.field1566 = null;
                Statics.field4216 = null;
                class341.field4217 = 0;
                while (true) {
                    class339 var8 = (class339) class341.field4207.method7614();
                    if (var8 == null) {
                        while (true) {
                            class339 var9 = (class339) class341.field4213.method7614();
                            if (var9 == null) {
                                if (class341.field4214 != 0) {
                                    try {
                                        class478 var10 = new class478(4);
                                        var10.method7886(4);
                                        var10.method7886(class341.field4214);
                                        var10.method7887(0);
                                        Statics.field4209.method7039(var10.field4906, 0, 4);
                                    } catch (IOException var15) {
                                        try {
                                            Statics.field4209.method7040();
                                        } catch (Exception var14) {
                                        }
                                        class341.field4224++;
                                        Statics.field4209 = null;
                                    }
                                }
                                class341.field4204 = 0;
                                Statics.field4205 = class290.method4466();
                                Statics.field2266 = null;
                                Statics.field306 = null;
                                field512 = 0;
                                field769 = 0;
                                return;
                            }
                            class341.field4210.method6076(var9);
                            class341.field4222.method7616(var9, var9.field4673);
                            class341.field4212++;
                            class341.field4211--;
                        }
                    }
                    class341.field4206.method7616(var8, var8.field4673);
                    class341.field4225++;
                    class341.field4203--;
                }
            }
        } catch (IOException var17) {
            this.method1158(-3);
        }
    }

    @ObfuscatedName("client.gw(II)V")
    public void method1158(int arg0) {
        Statics.field2266 = null;
        Statics.field306 = null;
        field512 = 0;
        if (Statics.field3309 == Statics.field1714) {
            Statics.field1714 = Statics.field3694;
        } else {
            Statics.field1714 = Statics.field3309;
        }
        field769++;
        if (field769 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field529 <= 5) {
                this.method493("js5connect_full");
                method274(1000);
            } else {
                field513 = 3000;
            }
        } else if (field769 >= 2 && arg0 == 6) {
            this.method493("js5connect_outofdate");
            method274(1000);
        } else if (field769 >= 4) {
            if (field529 <= 5) {
                this.method493("js5connect");
                method274(1000);
            } else {
                field513 = 3000;
            }
        }
    }

    @ObfuscatedName("en.gy(Lmx;Ljava/lang/String;I)V")
    public static void method2545(class338 arg0, String arg1) {
        class82 var2 = new class82(arg0, arg1);
        field771.add(var2);
        field716 += var2.field1017;
    }

    @ObfuscatedName("ay.gr(I)I")
    public static int method155() {
        if (field771 == null || field770 >= field771.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field770; var1++) {
            var0 += ((class82) field771.get(var1)).field1019;
        }
        return var0 * 10000 / field716;
    }

    @ObfuscatedName("bo.gs(III)V")
    public static void method422(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class220.field2482[var4];
            int var8 = method4207(var5, arg1);
            var2[var3] = var7 * var8 >> 16;
        }
        class223.method4036(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ck.gi(I)V")
    public static void method1142() {
        if (field511 == 0) {
            Statics.field3 = new class223(4, 104, 104, class80.field1000);
            for (int var0 = 0; var0 < 4; var0++) {
                field616[var0] = new class210(104, 104);
            }
            Statics.field1960 = new class492(512, 512);
            class74.field899 = class333.field3807;
            class74.field898 = 5;
            field511 = 20;
        } else if (field511 == 20) {
            class74.field899 = class333.field3816;
            class74.field898 = 10;
            field511 = 30;
        } else if (field511 == 30) {
            Statics.field1420 = method1964(0, false, true, true, false);
            Statics.field3308 = method1964(1, false, true, true, false);
            Statics.field2984 = method1964(2, true, false, true, false);
            Statics.field1588 = method1964(3, false, true, true, false);
            Statics.field1842 = method1964(4, false, true, true, false);
            Statics.field1266 = method1964(5, true, true, true, false);
            Statics.field3456 = method1964(6, true, true, true, false);
            Statics.field1867 = method1964(7, false, true, true, false);
            Statics.field1639 = method1964(8, false, true, true, false);
            Statics.field114 = method1964(9, false, true, true, false);
            Statics.field2582 = method1964(10, false, true, true, false);
            Statics.field240 = method1964(11, false, true, true, false);
            Statics.field1800 = method1964(12, false, true, true, false);
            Statics.field2621 = method1964(13, true, false, true, false);
            Statics.field1120 = method1964(14, false, true, true, false);
            Statics.field3391 = method1964(15, false, true, true, false);
            Statics.field1503 = method1964(17, true, true, true, false);
            Statics.field4377 = method1964(18, false, true, true, false);
            Statics.field3408 = method1964(19, false, true, true, false);
            Statics.field4897 = method1964(20, false, true, true, false);
            Statics.field3709 = method1964(21, false, true, true, true);
            class74.field899 = class333.field3817;
            class74.field898 = 20;
            field511 = 40;
        } else if (field511 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1420.method5810() * 4 / 100;
            int var3 = var2 + Statics.field3308.method5810() * 4 / 100;
            int var4 = var3 + Statics.field2984.method5810() * 2 / 100;
            int var5 = var4 + Statics.field1588.method5810() * 2 / 100;
            int var6 = var5 + Statics.field1842.method5810() * 6 / 100;
            int var7 = var6 + Statics.field1266.method5810() * 4 / 100;
            int var8 = var7 + Statics.field3456.method5810() * 2 / 100;
            int var9 = var8 + Statics.field1867.method5810() * 55 / 100;
            int var10 = var9 + Statics.field1639.method5810() * 2 / 100;
            int var11 = var10 + Statics.field114.method5810() * 2 / 100;
            int var12 = var11 + Statics.field2582.method5810() * 2 / 100;
            int var13 = var12 + Statics.field240.method5810() * 2 / 100;
            int var14 = var13 + Statics.field1800.method5810() * 2 / 100;
            int var15 = var14 + Statics.field2621.method5810() * 2 / 100;
            int var16 = var15 + Statics.field1120.method5810() * 2 / 100;
            int var17 = var16 + Statics.field3391.method5810() * 2 / 100;
            int var18 = var17 + Statics.field3408.method5810() / 100;
            int var19 = var18 + Statics.field4377.method5810() / 100;
            int var20 = var19 + Statics.field4897.method5810() / 100;
            int var21 = var20 + Statics.field3709.method5810() / 100;
            int var22 = var21 + (Statics.field1503.method5851() && Statics.field1503.method5884() ? 1 : 0);
            if (var22 == 100) {
                method2545(Statics.field1420, "Animations");
                method2545(Statics.field3308, "Skeletons");
                method2545(Statics.field1842, "Sound FX");
                method2545(Statics.field1266, "Maps");
                method2545(Statics.field3456, "Music Tracks");
                method2545(Statics.field1867, "Models");
                method2545(Statics.field1639, "Sprites");
                method2545(Statics.field240, "Music Jingles");
                method2545(Statics.field1120, "Music Samples");
                method2545(Statics.field3391, "Music Patches");
                method2545(Statics.field3408, "World Map");
                method2545(Statics.field4377, "World Map Geography");
                method2545(Statics.field4897, "World Map Ground");
                Statics.field304 = new class416();
                Statics.field304.method7101(Statics.field1503);
                class74.field899 = class333.field3819;
                class74.field898 = 30;
                field511 = 45;
            } else {
                if (var22 != 0) {
                    class74.field899 = class333.field3818 + var22 + "%";
                }
                class74.field898 = 30;
            }
        } else if (field511 == 45) {
            class43.method2507(22050, !field486, 2);
            class295 var23 = new class295();
            var23.method5015(9, 128);
            Statics.field826 = class43.method2874(Statics.field198, 0, 22050);
            Statics.field826.method755(var23);
            class294.method4969(Statics.field3391, Statics.field1120, Statics.field1842, var23);
            Statics.field2734 = class43.method2874(Statics.field198, 1, 2048);
            Statics.field3749 = new class39();
            Statics.field2734.method755(Statics.field3749);
            Statics.field1813 = new class56(22050, Statics.field293);
            class74.field899 = class333.field3820;
            class74.field898 = 35;
            field511 = 50;
            Statics.field4542 = new class450(Statics.field1639, Statics.field2621);
        } else if (field511 == 50) {
            int var24 = class451.method7567().length;
            field546 = Statics.field4542.method7563(class451.method7567());
            if (field546.size() < var24) {
                class74.field899 = class333.field3848 + field546.size() * 100 / var24 + "%";
                class74.field898 = 40;
            } else {
                Statics.field3693 = (class375) field546.get(class451.field4792);
                Statics.field4608 = (class375) field546.get(class451.field4795);
                Statics.field24 = (class375) field546.get(class451.field4793);
                Statics.field1218 = field760.method7343();
                class74.field899 = class333.field3902;
                class74.field898 = 40;
                field511 = 60;
            }
        } else if (field511 == 60) {
            int var25 = class74.method7150(Statics.field2582, Statics.field1639);
            int var26 = class74.method3209(Statics.field1639);
            if (var25 < var26) {
                class74.field899 = class333.field3823 + var25 * 100 / var26 + "%";
                class74.field898 = 50;
            } else {
                class74.field899 = class333.field4077;
                class74.field898 = 50;
                method274(5);
                field511 = 70;
            }
        } else if (field511 == 70) {
            if (!Statics.field2984.method5884()) {
                class74.field899 = class333.field3825 + Statics.field2984.method5821() + "%";
                class74.field898 = 60;
            } else if (Statics.field3709.method5884()) {
                class205.method2957(Statics.field2984);
                class196.method202(Statics.field2984);
                class338 var27 = Statics.field2984;
                class338 var28 = Statics.field1867;
                Statics.field4235 = var27;
                Statics.field1931 = var28;
                Statics.field1935 = Statics.field4235.method5934(3);
                class338 var29 = Statics.field2984;
                class338 var30 = Statics.field1867;
                boolean var31 = field486;
                Statics.field2135 = var29;
                Statics.field2126 = var30;
                class203.field2171 = var31;
                class338 var32 = Statics.field2984;
                class338 var33 = Statics.field1867;
                Statics.field1988 = var32;
                Statics.field1989 = var33;
                class201.method2937(Statics.field2984);
                class338 var34 = Statics.field2984;
                class338 var35 = Statics.field1867;
                boolean var36 = field485;
                class375 var37 = Statics.field3693;
                Statics.field3311 = var34;
                Statics.field2186 = var35;
                Statics.field1927 = var36;
                Statics.field990 = Statics.field3311.method5934(10);
                Statics.field2182 = var37;
                class338 var38 = Statics.field2984;
                class338 var39 = Statics.field1420;
                class338 var40 = Statics.field3308;
                Statics.field1271 = var38;
                Statics.field2253 = var39;
                Statics.field2250 = var40;
                class338 var41 = Statics.field2984;
                class338 var42 = Statics.field1867;
                Statics.field2045 = var41;
                Statics.field2043 = var42;
                Statics.method4736(Statics.field2984);
                class184.method4730(Statics.field2984);
                class313.method2777(Statics.field1588, Statics.field1867, Statics.field1639, Statics.field2621);
                Statics.method2708(Statics.field2984);
                class190.method3224(Statics.field2984);
                class338 var43 = Statics.field2984;
                Statics.field1924 = var43;
                class338 var44 = Statics.field2984;
                class338 var45 = Statics.field2984;
                Statics.field4345 = var45;
                class338 var46 = Statics.field2984;
                Statics.field4875 = var46;
                class338 var47 = Statics.field2984;
                Statics.field4882 = var47;
                Statics.field1939 = new class463(Statics.field4871, 54, Statics.field860, Statics.field2984);
                Statics.field1374 = new class463(Statics.field4871, 47, Statics.field860, Statics.field2984);
                Statics.field2901 = new class107();
                class338 var48 = Statics.field2984;
                class338 var49 = Statics.field1639;
                class338 var50 = Statics.field2621;
                Statics.field1322 = var48;
                Statics.field2102 = var49;
                Statics.field961 = var50;
                class338 var51 = Statics.field2984;
                class338 var52 = Statics.field1639;
                Statics.field1945 = var51;
                Statics.field1948 = var52;
                class185.method2172(Statics.field2984, Statics.field1639);
                class74.field899 = class333.field3826;
                class74.field898 = 60;
                field511 = 80;
            } else {
                class74.field899 = class333.field3825 + (80 + Statics.field1800.method5821() / 6) + "%";
                class74.field898 = 60;
            }
        } else if (field511 == 80) {
            int var53 = 0;
            if (Statics.field1674 == null) {
                Statics.field1674 = class493.method4861(Statics.field1639, Statics.field304.field4584, 0);
            } else {
                var53++;
            }
            if (Statics.field1599 == null) {
                Statics.field1599 = class493.method4861(Statics.field1639, Statics.field304.field4576, 0);
            } else {
                var53++;
            }
            if (Statics.field1249 == null) {
                Statics.field1249 = class493.method7638(Statics.field1639, Statics.field304.field4572, 0);
            } else {
                var53++;
            }
            if (Statics.field3685 == null) {
                Statics.field3685 = class493.method1952(Statics.field1639, Statics.field304.field4575, 0);
            } else {
                var53++;
            }
            if (Statics.field3293 == null) {
                Statics.field3293 = class493.method1952(Statics.field1639, Statics.field304.field4573, 0);
            } else {
                var53++;
            }
            if (Statics.field1963 == null) {
                Statics.field1963 = class493.method1952(Statics.field1639, Statics.field304.field4577, 0);
            } else {
                var53++;
            }
            if (Statics.field2958 == null) {
                Statics.field2958 = class493.method1952(Statics.field1639, Statics.field304.field4578, 0);
            } else {
                var53++;
            }
            if (Statics.field4512 == null) {
                Statics.field4512 = class493.method1952(Statics.field1639, Statics.field304.field4579, 0);
            } else {
                var53++;
            }
            if (Statics.field1747 == null) {
                Statics.field1747 = class493.method1952(Statics.field1639, Statics.field304.field4574, 0);
            } else {
                var53++;
            }
            if (Statics.field2956 == null) {
                Statics.field2956 = class493.method7638(Statics.field1639, Statics.field304.field4581, 0);
            } else {
                var53++;
            }
            if (Statics.field241 == null) {
                Statics.field241 = class493.method7638(Statics.field1639, Statics.field304.field4582, 0);
            } else {
                var53++;
            }
            if (var53 < 11) {
                class74.field899 = class333.field3827 + var53 * 100 / 12 + "%";
                class74.field898 = 70;
            } else {
                Statics.field4392 = Statics.field241;
                Statics.field1599.method8317();
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1249[0].method8296(var54 + var57, var55 + var57, var56 + var57);
                class74.field899 = class333.field3828;
                class74.field898 = 70;
                field511 = 90;
            }
        } else if (field511 == 90) {
            if (Statics.field114.method5884()) {
                Statics.field805 = new class229(Statics.field114, Statics.field1639, 20, Statics.field2929.method2324(), field486 ? 64 : 128);
                class220.method3912(Statics.field805);
                class220.method3913(Statics.field2929.method2324());
                field511 = 100;
            } else {
                class74.field899 = class333.field3829 + "0%";
                class74.field898 = 90;
            }
        } else if (field511 == 100) {
            int var58 = Statics.field805.method4210();
            if (var58 < 100) {
                class74.field899 = class333.field3829 + var58 + "%";
                class74.field898 = 90;
            } else {
                class74.field899 = class333.field4118;
                class74.field898 = 90;
                field511 = 110;
            }
        } else if (field511 == 110) {
            Statics.field2350 = new class87();
            Statics.field198.method3170(Statics.field2350, 10);
            class74.field899 = class333.field3899;
            class74.field898 = 92;
            field511 = 120;
        } else if (field511 == 120) {
            if (Statics.field2582.method5857("huffman", "")) {
                class315 var59 = new class315(Statics.field2582.method5878("huffman", ""));
                class316.method4879(var59);
                class74.field899 = class333.field3833;
                class74.field898 = 94;
                field511 = 130;
            } else {
                class74.field899 = class333.field3832 + "%";
                class74.field898 = 94;
            }
        } else if (field511 == 130) {
            if (!Statics.field1588.method5884()) {
                class74.field899 = class333.field3991 + Statics.field1588.method5821() * 4 / 5 + "%";
                class74.field898 = 96;
            } else if (!Statics.field1800.method5884()) {
                class74.field899 = class333.field3991 + (80 + Statics.field1800.method5821() / 6) + "%";
                class74.field898 = 96;
            } else if (Statics.field2621.method5884()) {
                class74.field899 = class333.field4020;
                class74.field898 = 98;
                field511 = 140;
            } else {
                class74.field899 = class333.field3991 + (96 + Statics.field2621.method5821() / 50) + "%";
                class74.field898 = 96;
            }
        } else if (field511 == 140) {
            class74.field898 = 100;
            if (Statics.field3408.method5880(class264.field3020.field3019)) {
                if (Statics.field2889 == null) {
                    Statics.field2889 = new class449();
                    Statics.field2889.method7380(Statics.field3408, Statics.field4377, Statics.field4897, Statics.field24, field546, Statics.field1249);
                }
                class74.field899 = class333.field3837;
                field511 = 150;
            } else {
                class74.field899 = class333.field3836 + Statics.field3408.method5903(class264.field3020.field3019) / 10 + "%";
            }
        } else if (field511 == 150) {
            method274(10);
        }
    }

    @ObfuscatedName("cw.gc(IZZZZI)Lmx;")
    public static class338 method1964(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class414 var5 = null;
        if (class171.field1818 != null) {
            var5 = new class414(arg0, class171.field1818, Statics.field1824[arg0], 1000000);
        }
        return new class338(var5, Statics.field3363, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.gh(B)V")
    public final void method1159() {
        class410 var1 = field734.method2639();
        class477 var2 = field734.field1383;
        try {
            if (field701 == 0) {
                if (Statics.field1567 == null && (field532.method2021() || field550 > 250)) {
                    Statics.field1567 = field532.method2024();
                    field532.method2019();
                    field532 = null;
                }
                if (Statics.field1567 != null) {
                    if (var1 != null) {
                        var1.method7040();
                        var1 = null;
                    }
                    Statics.field1423 = null;
                    field544 = false;
                    field550 = 0;
                    if (!field520.method8209()) {
                        method1082(1);
                    } else if (this.method1149()) {
                        try {
                            this.method1152(Statics.field64);
                            method1082(21);
                        } catch (Throwable var66) {
                            class504.method6263((String) null, var66);
                            method89(65);
                            return;
                        }
                    } else if (this.method1150()) {
                        try {
                            this.method1154(Statics.field1121, Statics.field4643);
                            method1082(20);
                        } catch (Exception var65) {
                            class504.method6263((String) null, var65);
                            method89(65);
                            return;
                        }
                    } else {
                        method89(65);
                        return;
                    }
                }
            }
            if (field701 == 21) {
                if (this.field552 == null) {
                    if (this.field527 == null) {
                        method89(65);
                        return;
                    }
                    if (!this.field527.method258()) {
                        return;
                    }
                    if (this.field527.method266()) {
                        class504.method6263(this.field527.method263(), (Throwable) null);
                        method89(65);
                        this.field527 = null;
                        return;
                    }
                    class21 var7 = this.field527.method259();
                    if (var7.method279() != 200) {
                        method89(65);
                        this.field527 = null;
                        return;
                    }
                    field550 = 0;
                    class434 var8 = new class434(var7.method280());
                    try {
                        Statics.field3461 = var8.method7314().getString("access_token");
                        Statics.field64 = var8.method7314().getString("refresh_token");
                    } catch (Exception var63) {
                        class504.method6263("Error parsing tokens", var63);
                        method89(65);
                        this.field527 = null;
                        return;
                    }
                } else if (this.field552.isDone()) {
                    if (this.field552.isCancelled()) {
                        method89(65);
                        this.field552 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field552.get();
                        if (!var5.isSuccess()) {
                            method89(65);
                            this.field552 = null;
                            return;
                        }
                        Statics.field3461 = var5.getAccessToken();
                        Statics.field64 = var5.getRefreshToken();
                        this.field552 = null;
                    } catch (Exception var64) {
                        class504.method6263((String) null, var64);
                        method89(65);
                        this.field552 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1299(Statics.field3461);
                method1082(20);
            }
            if (field701 == 20) {
                if (this.field525 == null) {
                    if (this.field523 == null) {
                        method89(65);
                        return;
                    }
                    if (!this.field523.method258()) {
                        return;
                    }
                    if (this.field523.method266()) {
                        class504.method6263(this.field523.method263(), (Throwable) null);
                        method89(65);
                        this.field523 = null;
                        return;
                    }
                    class21 var12 = this.field523.method259();
                    if (var12.method279() != 200) {
                        class504.method6263("Response code: " + var12.method279() + "Response body: " + var12.method280(), (Throwable) null);
                        method89(65);
                        this.field523 = null;
                        return;
                    }
                    List var13 = (List) var12.method277().get("Content-Type");
                    if (var13 != null && var13.contains(class432.field4640.method7299())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method280());
                            this.field521 = var14.getString("token");
                        } catch (JSONException var61) {
                            class504.method6263((String) null, var61);
                            method89(65);
                            this.field523 = null;
                            return;
                        }
                    } else {
                        this.field521 = var12.method280();
                    }
                    this.field523 = null;
                } else if (this.field525.isDone()) {
                    if (this.field525.isCancelled()) {
                        method89(65);
                        this.field525 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field525.get();
                        if (!var10.isSuccess()) {
                            method89(65);
                            this.field525 = null;
                            return;
                        }
                        this.field521 = var10.getToken();
                        this.field525 = null;
                    } catch (Exception var62) {
                        class504.method6263((String) null, var62);
                        method89(65);
                        this.field525 = null;
                        return;
                    }
                } else {
                    return;
                }
                field550 = 0;
                method1082(1);
            }
            if (field701 == 1) {
                if (Statics.field1423 == null) {
                    Statics.field1423 = Statics.field198.method3169(Statics.field1962, Statics.field1714);
                }
                if (Statics.field1423.field1856 == 2) {
                    throw new IOException();
                }
                if (Statics.field1423.field1856 == 1) {
                    Socket var16 = (Socket) Statics.field1423.field1853;
                    class411 var17 = new class411(var16, 40000, 5000);
                    var1 = var17;
                    field734.method2638(var17);
                    Statics.field1423 = null;
                    method1082(2);
                }
            }
            if (field701 == 2) {
                field734.method2633();
                class285 var18 = class285.method4392();
                var18.field3169.method7886(class287.field3291.field3288);
                field734.method2635(var18);
                field734.method2634();
                var2.field4904 = 0;
                method1082(3);
            }
            if (field701 == 3) {
                if (Statics.field826 != null) {
                    Statics.field826.method786();
                }
                if (Statics.field2734 != null) {
                    Statics.field2734.method786();
                }
                if (var1.method7035(1)) {
                    int var19 = var1.method7037();
                    if (Statics.field826 != null) {
                        Statics.field826.method786();
                    }
                    if (Statics.field2734 != null) {
                        Statics.field2734.method786();
                    }
                    if (var19 != 0) {
                        method89(var19);
                        return;
                    }
                    var2.field4904 = 0;
                    method1082(4);
                }
            }
            if (field701 == 4) {
                if (var2.field4904 < 8) {
                    int var20 = var1.method7036();
                    if (var20 > 8 - var2.field4904) {
                        var20 = 8 - var2.field4904;
                    }
                    if (var20 > 0) {
                        var1.method7038(var2.field4906, var2.field4904, var20);
                        var2.field4904 += var20;
                    }
                }
                if (var2.field4904 == 8) {
                    var2.field4904 = 0;
                    Statics.field4585 = var2.method7949();
                    method1082(5);
                }
            }
            if (field701 == 5) {
                field734.field1383.field4904 = 0;
                field734.method2633();
                class477 var21 = new class477(500);
                int[] var22 = new int[] { Statics.field1567.nextInt(), Statics.field1567.nextInt(), Statics.field1567.nextInt(), Statics.field1567.nextInt() };
                var21.field4904 = 0;
                var21.method7886(1);
                var21.method7957(var22[0]);
                var21.method7957(var22[1]);
                var21.method7957(var22[2]);
                var21.method7957(var22[3]);
                var21.method7891(Statics.field4585);
                if (field529 == 40) {
                    var21.method7957(Statics.field96[0]);
                    var21.method7957(Statics.field96[1]);
                    var21.method7957(Statics.field96[2]);
                    var21.method7957(Statics.field96[3]);
                } else {
                    if (field529 == 50) {
                        var21.method7886(class137.field1598.method33());
                        var21.method7957(Statics.field168);
                    } else {
                        var21.method7886(field519.method33());
                        switch(field519.field1601) {
                            case 0:
                            case 3:
                                var21.method8033(Statics.field801);
                                var21.field4904++;
                                break;
                            case 1:
                                var21.method7957(Statics.field2929.method2339(class74.field908));
                                break;
                            case 2:
                                var21.field4904 += 4;
                        }
                    }
                    if (field520.method8209()) {
                        var21.method7886(class483.field4957.method33());
                        var21.method7893(this.field521);
                    } else {
                        var21.method7886(class483.field4963.method33());
                        var21.method7893(class74.field904);
                    }
                }
                var21.method7929(class73.field884, class73.field882);
                Statics.field96 = var22;
                class285 var23 = class285.method4392();
                var23.field3169.field4904 = 0;
                if (field529 == 40) {
                    var23.field3169.method7886(class287.field3287.field3288);
                } else {
                    var23.field3169.method7886(class287.field3289.field3288);
                }
                var23.field3169.method7887(0);
                int var24 = var23.field3169.field4904;
                var23.field3169.method7957(212);
                var23.field3169.method7957(1);
                var23.field3169.method7886(field674);
                var23.field3169.method7886(field489);
                byte var25 = 0;
                var23.field3169.method7886(var25);
                var23.field3169.method7896(var21.field4906, 0, var21.field4904);
                int var26 = var23.field3169.field4904;
                var23.field3169.method7893(class74.field908);
                var23.field3169.method7886((field706 ? 1 : 0) << 1 | (field486 ? 1 : 0));
                var23.field3169.method7887(Statics.field208);
                var23.field3169.method7887(Statics.field1637);
                class477 var27 = var23.field3169;
                if (field536 == null) {
                    byte[] var28 = new byte[24];
                    try {
                        class171.field1822.method7684(0L);
                        class171.field1822.method7686(var28);
                        int var29;
                        for (var29 = 0; var29 < 24 && var28[var29] == 0; var29++) {
                        }
                        if (var29 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var67) {
                        for (int var31 = 0; var31 < 24; var31++) {
                            var28[var31] = -1;
                        }
                    }
                    var27.method7896(var28, 0, var28.length);
                } else {
                    var27.method7896(field536, 0, field536.length);
                }
                var23.field3169.method7893(Statics.field4791);
                var23.field3169.method7957(Statics.field2331);
                class478 var34 = new class478(Statics.field1218.method7360());
                Statics.field1218.method7359(var34);
                var23.field3169.method7896(var34.field4906, 0, var34.field4906.length);
                var23.field3169.method7886(field674);
                var23.field3169.method7957(0);
                var23.field3169.method7955(Statics.field114.field4192);
                var23.field3169.method8003(Statics.field4897.field4192);
                var23.field3169.method7955(Statics.field1503.field4192);
                var23.field3169.method7955(Statics.field2582.field4192);
                var23.field3169.method7955(Statics.field2621.field4192);
                var23.field3169.method7955(Statics.field3456.field4192);
                var23.field3169.method7955(Statics.field1800.field4192);
                var23.field3169.method7957(Statics.field4377.field4192);
                var23.field3169.method8003(Statics.field240.field4192);
                var23.field3169.method7955(Statics.field1266.field4192);
                var23.field3169.method8003(Statics.field1588.field4192);
                var23.field3169.method7957(Statics.field1842.field4192);
                var23.field3169.method7954(Statics.field1420.field4192);
                var23.field3169.method7954(Statics.field2984.field4192);
                var23.field3169.method8003(0);
                var23.field3169.method7954(Statics.field1120.field4192);
                var23.field3169.method8003(Statics.field3391.field4192);
                var23.field3169.method8003(Statics.field3408.field4192);
                var23.field3169.method7955(Statics.field1639.field4192);
                var23.field3169.method7955(Statics.field3308.field4192);
                var23.field3169.method7957(Statics.field1867.field4192);
                var23.field3169.method8030(var22, var26, var23.field3169.field4904);
                var23.field3169.method7899(var23.field3169.field4904 - var24);
                field734.method2635(var23);
                field734.method2634();
                field734.field1380 = new class495(var22);
                int[] var35 = new int[4];
                for (int var36 = 0; var36 < 4; var36++) {
                    var35[var36] = var22[var36] + 50;
                }
                var2.method7881(var35);
                method1082(6);
            }
            if (field701 == 6 && var1.method7036() > 0) {
                int var37 = var1.method7037();
                if (var37 == 61) {
                    int var38 = var1.method7036();
                    Statics.field1743 = var38 == 1 && var1.method7037() == 1;
                    method1082(5);
                }
                if (var37 == 21 && field529 == 20) {
                    method1082(12);
                } else if (var37 == 2) {
                    method1082(14);
                } else if (var37 == 15 && field529 == 40) {
                    field734.field1385 = -1;
                    method1082(19);
                } else if (var37 == 64) {
                    method1082(10);
                } else if (var37 == 23 && field517 < 1) {
                    field517++;
                    method1082(0);
                } else if (var37 == 29) {
                    method1082(17);
                } else if (var37 == 69) {
                    method1082(7);
                } else {
                    method89(var37);
                    return;
                }
            }
            if (field701 == 7 && var1.method7036() >= 2) {
                var1.method7038(var2.field4906, 0, 2);
                var2.field4904 = 0;
                Statics.field258 = var2.method7905();
                method1082(8);
            }
            if (field701 == 8 && var1.method7036() >= Statics.field258) {
                var2.field4904 = 0;
                var1.method7038(var2.field4906, var2.field4904, Statics.field258);
                class7[] var39 = new class7[] { class7.field18 };
                class7 var40 = var39[var2.method7909()];
                try {
                    switch(var40.field13) {
                        case 0:
                            class1 var41 = new class1();
                            this.field659 = new class8(var2, var41);
                            method1082(9);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var60) {
                    method89(22);
                    return;
                }
            }
            if (field701 == 9 && this.field659.method47()) {
                this.field635 = this.field659.method36();
                this.field659.method45();
                this.field659 = null;
                if (this.field635 == null) {
                    method89(22);
                    return;
                }
                field734.method2633();
                class285 var44 = class285.method4392();
                var44.field3169.method7886(class287.field3290.field3288);
                var44.field3169.method7887(this.field635.field4904);
                var44.field3169.method7897(this.field635);
                field734.method2635(var44);
                field734.method2634();
                this.field635 = null;
                method1082(6);
            }
            if (field701 == 10 && var1.method7036() > 0) {
                Statics.field54 = var1.method7037();
                method1082(11);
            }
            if (field701 == 11 && var1.method7036() >= Statics.field54) {
                var1.method7038(var2.field4906, 0, Statics.field54);
                var2.field4904 = 0;
                method1082(6);
            }
            if (field701 == 12 && var1.method7036() > 0) {
                field488 = (var1.method7037() + 3) * 60;
                method1082(13);
            }
            if (field701 == 13) {
                field550 = 0;
                Statics.method3906(class333.field3844, class333.field3845, field488 / 60 + class333.field3859);
                if (--field488 <= 0) {
                    method1082(0);
                }
            } else {
                if (field701 == 14 && var1.method7036() >= 1) {
                    Statics.field1376 = var1.method7037();
                    method1082(15);
                }
                if (field701 == 15 && var1.method7036() >= Statics.field1376) {
                    boolean var45 = var1.method7037() == 1;
                    var1.method7038(var2.field4906, 0, 4);
                    var2.field4904 = 0;
                    boolean var46 = false;
                    if (var45) {
                        int var47 = var2.method7869() << 24;
                        int var48 = var47 | var2.method7869() << 16;
                        int var49 = var48 | var2.method7869() << 8;
                        int var50 = var49 | var2.method7869();
                        Statics.field2929.method2374(class74.field908, var50);
                    }
                    if (field624) {
                        Statics.field2929.method2325(class74.field908);
                    } else {
                        Statics.field2929.method2325((String) null);
                    }
                    class96.method2964();
                    field655 = var1.method7037();
                    field657 = var1.method7037() == 1;
                    field603 = var1.method7037();
                    field603 <<= 0x8;
                    field603 += var1.method7037();
                    field604 = var1.method7037();
                    var1.method7038(var2.field4906, 0, 8);
                    var2.field4904 = 0;
                    this.field535 = var2.method7949();
                    if (Statics.field1376 >= 29) {
                        var1.method7038(var2.field4906, 0, 8);
                        var2.field4904 = 0;
                        field672 = var2.method7949();
                    }
                    var1.method7038(var2.field4906, 0, 1);
                    var2.field4904 = 0;
                    class286[] var51 = class286.method4791();
                    int var52 = var2.method7850();
                    if (var52 < 0 || var52 >= var51.length) {
                        throw new IOException(var52 + " " + var2.field4904);
                    }
                    field734.field1382 = var51[var52];
                    field734.field1385 = field734.field1382.field3284;
                    var1.method7038(var2.field4906, 0, 2);
                    var2.field4904 = 0;
                    field734.field1385 = var2.method7905();
                    try {
                        Statics.method368(Statics.field4480, "zap");
                    } catch (Throwable var59) {
                    }
                    method1082(16);
                }
                if (field701 != 16) {
                    if (field701 == 17 && var1.method7036() >= 2) {
                        var2.field4904 = 0;
                        var1.method7038(var2.field4906, 0, 2);
                        var2.field4904 = 0;
                        Statics.field5037 = var2.method7905();
                        method1082(18);
                    }
                    if (field701 == 18 && var1.method7036() >= Statics.field5037) {
                        var2.field4904 = 0;
                        var1.method7038(var2.field4906, 0, Statics.field5037);
                        var2.field4904 = 0;
                        String var54 = var2.method7950();
                        String var55 = var2.method7950();
                        String var56 = var2.method7950();
                        Statics.method3906(var54, var55, var56);
                        method274(10);
                        if (field520.method8209()) {
                            class74.method167(9);
                        }
                    }
                    if (field701 == 19) {
                        if (field734.field1385 == -1) {
                            if (var1.method7036() < 2) {
                                return;
                            }
                            var1.method7038(var2.field4906, 0, 2);
                            var2.field4904 = 0;
                            field734.field1385 = var2.method7905();
                        }
                        if (var1.method7036() >= field734.field1385) {
                            var1.method7038(var2.field4906, 0, field734.field1385);
                            var2.field4904 = 0;
                            int var57 = field734.field1385;
                            field514.method6724();
                            method5777();
                            class105.method5741(var2);
                            if (var2.field4904 != var57) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field550++;
                        if (field550 > 2000) {
                            if (field517 < 1) {
                                if (Statics.field3309 == Statics.field1714) {
                                    Statics.field1714 = Statics.field3694;
                                } else {
                                    Statics.field1714 = Statics.field3309;
                                }
                                field517++;
                                method1082(0);
                            } else {
                                method89(-3);
                            }
                        }
                    }
                } else if (var1.method7036() >= field734.field1385) {
                    var2.field4904 = 0;
                    var1.method7038(var2.field4906, 0, field734.field1385);
                    field514.method6734();
                    method6838();
                    class105.method5741(var2);
                    Statics.field1472 = -1;
                    method4030(false, var2);
                    field734.field1382 = null;
                }
            }
        } catch (IOException var68) {
            if (field517 < 1) {
                if (Statics.field3309 == Statics.field1714) {
                    Statics.field1714 = Statics.field3694;
                } else {
                    Statics.field1714 = Statics.field3309;
                }
                field517++;
                method1082(0);
            } else {
                method89(-2);
            }
        }
    }

    @ObfuscatedName("pn.gx(B)V")
    public static void method6838() {
        field495 = 1L;
        Statics.field2350.field1061 = 0;
        Statics.field3427 = true;
        field499 = true;
        field623 = -1L;
        class37.field243 = new class361();
        field734.method2633();
        field734.field1383.field4904 = 0;
        field734.field1382 = null;
        field734.field1389 = null;
        field734.field1390 = null;
        field734.field1391 = null;
        field734.field1385 = 0;
        field734.field1384 = 0;
        field541 = 0;
        field675 = 0;
        field492 = 0;
        method1086();
        class36.field222 = 0;
        class108.method2896();
        field640 = 0;
        field767 = false;
        field731 = 0;
        field564 = 0;
        field569 = 0;
        Statics.field4295 = null;
        field728 = 0;
        field721 = -1;
        field726 = 0;
        field727 = 0;
        field509 = class101.field1308;
        field510 = class101.field1308;
        field538 = 0;
        class105.method7099();
        for (int var0 = 0; var0 < 2048; var0++) {
            field758[var0] = null;
        }
        for (int var1 = 0; var1 < 65536; var1++) {
            field682[var1] = null;
        }
        field614 = -1;
        field617.method6118();
        field618.method6118();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field615[var2][var3][var4] = null;
                }
            }
        }
        field548 = new class359();
        Statics.field16.method1750();
        for (int var5 = 0; var5 < Statics.field1891; var5++) {
            class184 var6 = class184.method620(var5);
            if (var6 != null) {
                class303.field3426[var5] = 0;
                class303.field3428[var5] = 0;
            }
        }
        Statics.field2901.method2569();
        field656 = -1;
        if (field647 != -1) {
            class313.method4973(field647);
        }
        for (class85 var7 = (class85) field648.method7614(); var7 != null; var7 = (class85) field648.method7617()) {
            method247(var7, true);
        }
        field647 = -1;
        field648 = new class455(8);
        field652 = null;
        method1086();
        field705.method5232((int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field611[var8] = null;
            field612[var8] = false;
        }
        class83.method3736();
        field493 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field723[var9] = true;
        }
        class285 var10 = class285.method2741(class283.field3069, field734.field1380);
        var10.field3169.method7886(method48());
        var10.field3169.method7887(Statics.field208);
        var10.field3169.method7887(Statics.field1637);
        field734.method2635(var10);
        Statics.field251 = null;
        Statics.field3016 = null;
        Arrays.fill(field775, (Object) null);
        Statics.field104 = null;
        Arrays.fill(field658, (Object) null);
        for (int var11 = 0; var11 < 8; var11++) {
            field761[var11] = new class349();
        }
        Statics.field954 = null;
    }

    @ObfuscatedName("ml.gg(I)V")
    public static void method5777() {
        field734.method2633();
        field734.field1383.field4904 = 0;
        field734.field1382 = null;
        field734.field1389 = null;
        field734.field1390 = null;
        field734.field1391 = null;
        field734.field1385 = 0;
        field734.field1384 = 0;
        field541 = 0;
        method1086();
        field728 = 0;
        field726 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field758[var0] = null;
        }
        Statics.field1440 = null;
        for (int var1 = 0; var1 < field682.length; var1++) {
            class98 var2 = field682[var1];
            if (var2 != null) {
                var2.field1173 = -1;
                var2.field1174 = false;
            }
        }
        class83.method3736();
        method274(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field723[var3] = true;
        }
        class285 var4 = class285.method2741(class283.field3069, field734.field1380);
        var4.field3169.method7886(method48());
        var4.field3169.method7887(Statics.field208);
        var4.field3169.method7887(Statics.field1637);
        field734.method2635(var4);
    }

    @ObfuscatedName("ax.gd(II)V")
    public static void method89(int arg0) {
        int var1 = class74.field895;
        if (arg0 == -3) {
            Statics.method3906(class333.field3847, class333.field4069, class333.field3849);
        } else if (arg0 == -2) {
            Statics.method3906(class333.field3851, class333.field3917, class333.field4056);
        } else if (arg0 == -1) {
            Statics.method3906(class333.field3900, class333.field3908, class333.field3855);
        } else if (arg0 == 3) {
            class74.method167(3);
            class74.field888 = 1;
        } else if (arg0 == 4) {
            class74.method167(14);
            class74.field902 = 0;
        } else if (arg0 == 5) {
            class74.field888 = 2;
            Statics.method3906(class333.field3940, class333.field3854, class333.field3861);
        } else if (arg0 == 68 || !(field490 || arg0 != 6)) {
            Statics.method3906(class333.field3862, class333.field3863, class333.field3864);
        } else if (arg0 == 7) {
            Statics.method3906(class333.field4009, class333.field3866, class333.field4022);
        } else if (arg0 == 8) {
            Statics.method3906(class333.field3868, class333.field3927, class333.field3933);
        } else if (arg0 == 9) {
            Statics.method3906(class333.field3871, class333.field3872, class333.field3990);
        } else if (arg0 == 10) {
            Statics.method3906(class333.field3935, class333.field3875, class333.field4029);
        } else if (arg0 == 11) {
            Statics.method3906(class333.field3841, class333.field3878, class333.field3879);
        } else if (arg0 == 12) {
            Statics.method3906(class333.field3880, class333.field4106, class333.field3882);
        } else if (arg0 == 13) {
            Statics.method3906(class333.field4092, class333.field4124, class333.field3885);
        } else if (arg0 == 14) {
            Statics.method3906(class333.field3886, class333.field3887, class333.field3888);
        } else if (arg0 == 16) {
            Statics.method3906(class333.field3947, class333.field4018, class333.field3891);
        } else if (arg0 == 17) {
            Statics.method3906(class333.field3892, class333.field3821, class333.field3894);
        } else if (arg0 == 18) {
            class74.method167(14);
            class74.field902 = 1;
        } else if (arg0 == 19) {
            Statics.method3906(class333.field3957, class333.field3860, class333.field3949);
        } else if (arg0 == 20) {
            Statics.method3906(class333.field3901, class333.field3808, class333.field3893);
        } else if (arg0 == 22) {
            Statics.method3906(class333.field3904, class333.field4086, class333.field3874);
        } else if (arg0 == 23) {
            Statics.method3906(class333.field3907, class333.field3846, class333.field3909);
        } else if (arg0 == 24) {
            Statics.method3906(class333.field3910, class333.field3911, class333.field4045);
        } else if (arg0 == 25) {
            Statics.method3906(class333.field3913, class333.field3994, class333.field3915);
        } else if (arg0 == 26) {
            Statics.method3906(class333.field3971, class333.field4103, class333.field3905);
        } else if (arg0 == 27) {
            Statics.method3906(class333.field3932, class333.field3920, class333.field3921);
        } else if (arg0 == 31) {
            Statics.method3906(class333.field3928, class333.field3929, class333.field3890);
        } else if (arg0 == 32) {
            class74.method167(14);
            class74.field902 = 2;
        } else if (arg0 == 37) {
            Statics.method3906(class333.field3943, class333.field4112, class333.field3804);
        } else if (arg0 == 38) {
            Statics.method3906(class333.field3937, class333.field3938, class333.field3939);
        } else if (arg0 == 55) {
            class74.method167(8);
        } else if (arg0 == 56) {
            Statics.method3906(class333.field3944, class333.field3945, class333.field3946);
            method274(11);
            return;
        } else if (arg0 == 57) {
            Statics.method3906(class333.field3916, class333.field3948, class333.field3934);
            method274(11);
            return;
        } else if (arg0 == 61) {
            Statics.method3906("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class74.method167(7);
        } else if (arg0 == 62) {
            method274(10);
            class74.method167(9);
            Statics.method3906(class333.field3950, class333.field3960, class333.field3952);
            return;
        } else if (arg0 == 63) {
            method274(10);
            class74.method167(9);
            Statics.method3906(class333.field4041, class333.field3930, class333.field3955);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method274(10);
            class74.method167(9);
            Statics.method3906(class333.field3956, class333.field3975, class333.field3958);
            return;
        } else if (arg0 == 71) {
            method274(10);
            class74.method167(7);
            Statics.method3906("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method274(10);
            class74.method167(6);
            Statics.method3906(class333.field4108, class333.field4104, class333.field4105);
        } else if (arg0 == 72) {
            method274(10);
            class74.method167(26);
        } else {
            Statics.method3906(class333.field3983, class333.field3822, class333.field3961);
        }
        method274(10);
        boolean var3 = var1 != class74.method1041();
        if (!var3 && field520.method8209()) {
            class74.method167(9);
        }
    }

    @ObfuscatedName("ks.gq(I)V")
    public static final void method4937() {
        field734.method2637();
        class205.field2237.method4930();
        class196.field2062.method4930();
        class187.method413();
        class203.method5192();
        class193.field2030.method4930();
        class193.field2002.method4930();
        class204.field2210.method4930();
        class204.field2180.method4930();
        class204.field2230.method4930();
        class206.field2255.method4930();
        class206.field2251.method4930();
        class206.field2257.method4930();
        Statics.method3052();
        class198.method3082();
        class184.field1897.method4930();
        Statics.field1939.method7727();
        Statics.field1374.method7727();
        class202.field2101.method4930();
        class202.field2111.method4930();
        class202.field2103.method4930();
        class188.field1953.method4930();
        class188.field1946.method4930();
        class201.method2707();
        class199.method2700();
        class185.field1902.method4930();
        class471.field4872.method4930();
        class473.field4885.method4930();
        field570.method4930();
        field765.method4930();
        class310.field3472.method4930();
        class313.field3518.method4930();
        class313.field3519.method4930();
        class313.field3520.method4930();
        class313.field3521.method4930();
        ((class229) Statics.field2489).method4215();
        class77.field969.method4930();
        field763.method6816();
        Statics.field1420.method5873();
        Statics.field3308.method5873();
        Statics.field1588.method5873();
        Statics.field1842.method5873();
        Statics.field1266.method5873();
        Statics.field3456.method5873();
        Statics.field1867.method5873();
        Statics.field1639.method5873();
        Statics.field114.method5873();
        Statics.field2582.method5873();
        Statics.field240.method5873();
        Statics.field1800.method5873();
        Statics.field3709.method5873();
        Statics.field3.method4041();
        for (int var0 = 0; var0 < 4; var0++) {
            field616[var0].method3767();
        }
        field714.method3738();
        System.gc();
        class294.field3330 = 1;
        Statics.field4333 = null;
        Statics.field5045 = -1;
        Statics.field3334 = -1;
        Statics.field4346 = 0;
        Statics.field3327 = false;
        Statics.field4981 = 2;
        field729 = -1;
        field730 = false;
        class67.method6752();
        method274(10);
    }

    @ObfuscatedName("dh.gf(II)V")
    public static final void method2205(int arg0) {
        method4937();
        switch(arg0) {
            case 1:
                class74.method167(24);
                Statics.method3906(class333.field4093, class333.field4051, class333.field4052);
                break;
            case 2:
                class74.method167(24);
                Statics.method3906(class333.field4047, class333.field4063, class333.field4049);
        }
    }

    @ObfuscatedName("fb.gp(I)J")
    public static long method2939() {
        return field672;
    }

    @ObfuscatedName("da.gj(I)V")
    public static final void method2241() {
        if (field675 > 0) {
            method4937();
        } else {
            field514.method6722();
            method274(40);
            Statics.field2412 = field734.method2639();
            field734.method2650();
        }
    }

    @ObfuscatedName("fz.gv(ZI)V")
    public static final void method2887(boolean arg0) {
        if (arg0) {
            field519 = class74.field915 ? class137.field1595 : class137.field1597;
        } else {
            field519 = Statics.field2929.method2338(class74.field908) ? class137.field1594 : class137.field1596;
        }
    }

    @ObfuscatedName("client.gt(I)V")
    public final void method1160() {
        if (field541 > 1) {
            field541--;
        }
        if (field675 > 0) {
            field675--;
        }
        if (field544) {
            field544 = false;
            method2241();
            return;
        }
        if (!field768) {
            method6919();
        }
        for (int var1 = 0; var1 < 100 && this.method1559(field734); var1++) {
        }
        if (field529 != 30) {
            return;
        }
        while (class37.method4822()) {
            class285 var2 = class285.method2741(class283.field3108, field734.field1380);
            var2.field3169.method7886(0);
            int var3 = var2.field3169.field4904;
            class37.method2523(var2.field3169);
            var2.field3169.method7926(var2.field3169.field4904 - var3);
            field734.method2635(var2);
        }
        if (field514.field4435) {
            class285 var4 = class285.method2741(class283.field3123, field734.field1380);
            var4.field3169.method7886(0);
            int var5 = var4.field3169.field4904;
            field514.method6720(var4.field3169);
            var4.field3169.method7926(var4.field3169.field4904 - var5);
            field734.method2635(var4);
            field514.method6723();
        }
        Object var6 = Statics.field2350.field1060;
        synchronized (Statics.field2350.field1060) {
            if (!field481) {
                Statics.field2350.field1061 = 0;
            } else if (class36.field235 != 0 || Statics.field2350.field1061 >= 40) {
                class285 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field2350.field1061 && (var7 == null || var7.field3169.field4904 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field2350.field1063[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field2350.field1062[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field516 != var14 || field497 != var13) {
                        if (var7 == null) {
                            var7 = class285.method2741(class283.field3061, field734.field1380);
                            var7.field3169.method7886(0);
                            var8 = var7.field3169.field4904;
                            var7.field3169.field4904 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field498 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field516;
                            var16 = var13 - field497;
                            var17 = (int) ((Statics.field2350.field1064[var12] - field498) / 20L);
                            var10 = (int) ((Statics.field2350.field1064[var12] - field498) % 20L + (long) var10);
                        }
                        field516 = var14;
                        field497 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field3169.method7887((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field3169.method7886(var17 + 128);
                            var7.field3169.method7887((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field3169.method7886(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3169.method7957(Integer.MIN_VALUE);
                            } else {
                                var7.field3169.method7957(var14 | var13 << 16);
                            }
                        } else {
                            var7.field3169.method7887((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3169.method7957(Integer.MIN_VALUE);
                            } else {
                                var7.field3169.method7957(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field498 = Statics.field2350.field1064[var12];
                    }
                }
                if (var7 != null) {
                    var7.field3169.method7926(var7.field3169.field4904 - var8);
                    int var18 = var7.field3169.field4904;
                    var7.field3169.field4904 = var8;
                    var7.field3169.method7886(var10 / var11);
                    var7.field3169.method7886(var10 % var11);
                    var7.field3169.field4904 = var18;
                    field734.method2635(var7);
                }
                if (var9 >= Statics.field2350.field1061) {
                    Statics.field2350.field1061 = 0;
                } else {
                    Statics.field2350.field1061 -= var9;
                    System.arraycopy(Statics.field2350.field1062, var9, Statics.field2350.field1062, 0, Statics.field2350.field1061);
                    System.arraycopy(Statics.field2350.field1063, var9, Statics.field2350.field1063, 0, Statics.field2350.field1061);
                    System.arraycopy(Statics.field2350.field1064, var9, Statics.field2350.field1064, 0, Statics.field2350.field1061);
                }
            }
        }
        if (class36.field235 == 1 || !Statics.field3700 && class36.field235 == 4 || class36.field235 == 2) {
            long var20 = class36.field219 - field495 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field495 = class36.field219 * -1L;
            int var22 = class36.field237;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field1637) {
                var22 = Statics.field1637;
            }
            int var23 = class36.field236;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field208) {
                var23 = Statics.field208;
            }
            int var24 = (int) var20;
            class285 var25 = class285.method2741(class283.field3126, field734.field1380);
            var25.field3169.method7887((class36.field235 == 2 ? 1 : 0) + (var24 << 1));
            var25.field3169.method7887(var23);
            var25.field3169.method7887(var22);
            field734.method2635(var25);
        }
        if (field713.field2292 > 0) {
            class285 var26 = class285.method2741(class283.field3065, field734.field1380);
            var26.field3169.method7887(0);
            int var27 = var26.field3169.field4904;
            long var28 = class290.method4466();
            for (int var30 = 0; var30 < field713.field2292; var30++) {
                long var31 = var28 - field623;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field623 = var28;
                var26.field3169.method8066(field713.field2291[var30]);
                var26.field3169.method8085((int) var31);
            }
            var26.field3169.method7899(var26.field3169.field4904 - var27);
            field734.method2635(var26);
        }
        if (field578 > 0) {
            field578--;
        }
        if (field713.method3741(96) || field713.method3741(97) || field713.method3741(98) || field713.method3741(99)) {
            field579 = true;
        }
        if (field579 && field578 <= 0) {
            field578 = 20;
            field579 = false;
            class285 var33 = class285.method2741(class283.field3122, field734.field1380);
            var33.field3169.method7943(field564);
            var33.field3169.method7887(field563);
            field734.method2635(var33);
        }
        if (Statics.field3427 && !field499) {
            field499 = true;
            class285 var34 = class285.method2741(class283.field3082, field734.field1380);
            var34.field3169.method7886(1);
            field734.method2635(var34);
        }
        if (!Statics.field3427 && field499) {
            field499 = false;
            class285 var35 = class285.method2741(class283.field3082, field734.field1380);
            var35.field3169.method7886(0);
            field734.method2635(var35);
        }
        if (Statics.field2889 != null) {
            Statics.field2889.method7381();
        }
        method2895();
        method1047();
        if (Statics.field1812 != field721) {
            field721 = Statics.field1812;
            int var36 = Statics.field1812;
            int[] var37 = Statics.field1960.field4997;
            int var38 = var37.length;
            for (int var39 = 0; var39 < var38; var39++) {
                var37[var39] = 0;
            }
            for (int var40 = 1; var40 < 103; var40++) {
                int var41 = (103 - var40) * 2048 + 24628;
                for (int var42 = 1; var42 < 103; var42++) {
                    if ((class80.field994[var36][var42][var40] & 0x18) == 0) {
                        Statics.field3.method4067(var37, var41, 512, var36, var42, var40);
                    }
                    if (var36 < 3 && (class80.field994[var36 + 1][var42][var40] & 0x8) != 0) {
                        Statics.field3.method4067(var37, var41, 512, var36 + 1, var42, var40);
                    }
                    var41 += 4;
                }
            }
            int var43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var44 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field1960.method8316();
            for (int var45 = 1; var45 < 103; var45++) {
                for (int var46 = 1; var46 < 103; var46++) {
                    if ((class80.field994[var36][var46][var45] & 0x18) == 0) {
                        method204(var36, var46, var45, var43, var44);
                    }
                    if (var36 < 3 && (class80.field994[var36 + 1][var46][var45] & 0x8) != 0) {
                        method204(var36 + 1, var46, var45, var43, var44);
                    }
                }
            }
            field722 = 0;
            for (int var47 = 0; var47 < 104; var47++) {
                for (int var48 = 0; var48 < 104; var48++) {
                    long var49 = Statics.field3.method4062(Statics.field1812, var47, var48);
                    if (var49 != 0L) {
                        int var51 = class232.method4938(var49);
                        int var52 = Statics.method4396(var51).field2153;
                        if (var52 >= 0 && class185.method2778(var52).field1919) {
                            field725[field722] = class185.method2778(var52).method3251(false);
                            field710[field722] = var47;
                            field724[field722] = var48;
                            field722++;
                        }
                    }
                }
            }
            Statics.field3785.method8288();
        }
        if (field529 != 30) {
            return;
        }
        method270();
        method3338();
        field734.field1384++;
        if (field734.field1384 > 750) {
            method2241();
            return;
        }
        int var53 = class105.field1342;
        int[] var54 = class105.field1344;
        for (int var55 = 0; var55 < var53; var55++) {
            class90 var56 = field758[var54[var55]];
            if (var56 != null) {
                method2164(var56, 1);
            }
        }
        for (int var57 = 0; var57 < field538; var57++) {
            int var58 = field539[var57];
            class98 var59 = field682[var58];
            if (var59 != null) {
                method2164(var59, var59.field1277.field1994);
            }
        }
        method2882();
        field632++;
        if (field666 != 0) {
            field597 += 20;
            if (field597 >= 400) {
                field666 = 0;
            }
        }
        class313 var60 = Statics.field1887;
        class313 var61 = Statics.field976;
        Statics.field1887 = null;
        Statics.field976 = null;
        field744 = null;
        field772 = false;
        field664 = false;
        field715 = 0;
        while (field713.method3745() && field715 < 128) {
            if (field655 >= 2 && field713.method3741(82) && field713.field2300 == 66) {
                String var62 = class108.method2752();
                Statics.field4480.method475(var62);
            } else if (field569 != 1 || field713.field2301 <= 0) {
                field717[field715] = field713.field2300;
                field642[field715] = field713.field2301;
                field715++;
            }
        }
        if (method1961() && field713.method3741(82) && field713.method3741(81) && field688 != 0) {
            int var63 = Statics.field1440.field1102 - field688;
            if (var63 < 0) {
                var63 = 0;
            } else if (var63 > 3) {
                var63 = 3;
            }
            if (Statics.field1440.field1102 != var63) {
                method3087(Statics.field218 + Statics.field1440.field1212[0], Statics.field1865 + Statics.field1440.field1171[0], var63, false);
            }
            field688 = 0;
        }
        if (class36.field235 == 1) {
            field714.method3738();
        }
        if (field647 != -1) {
            method4755(field647, 0, 0, Statics.field208, Statics.field1637, 0, 0);
        }
        field671++;
        while (true) {
            class86 var64;
            class313 var65;
            class313 var66;
            do {
                var64 = (class86) field691.method6094();
                if (var64 == null) {
                    while (true) {
                        class86 var67;
                        class313 var68;
                        class313 var69;
                        do {
                            var67 = (class86) field530.method6094();
                            if (var67 == null) {
                                while (true) {
                                    class86 var70;
                                    class313 var71;
                                    class313 var72;
                                    do {
                                        var70 = (class86) field690.method6094();
                                        if (var70 == null) {
                                            while (true) {
                                                class208 var73 = (class208) field693.method6094();
                                                if (var73 == null) {
                                                    this.method1661();
                                                    if (Statics.field2889 != null) {
                                                        Statics.field2889.method7391(Statics.field1812, (Statics.field1440.field1200 >> 7) + Statics.field218, (Statics.field1440.field1205 >> 7) + Statics.field1865, false);
                                                        Statics.field2889.method7407();
                                                    }
                                                    if (field602 != null) {
                                                        this.method1172();
                                                    }
                                                    if (class223.method4072()) {
                                                        int var74 = class223.field2545;
                                                        int var75 = class223.field2528;
                                                        class285 var76 = class285.method2741(class283.field3134, field734.field1380);
                                                        var76.field3169.method7886(5);
                                                        var76.field3169.method7942(Statics.field1865 + var75);
                                                        var76.field3169.method7887(Statics.field218 + var74);
                                                        var76.field3169.method8157(field713.method3741(82) ? (field713.method3741(81) ? 2 : 1) : 0);
                                                        field734.method2635(var76);
                                                        class223.method4073();
                                                        field595 = class36.field236;
                                                        field518 = class36.field237;
                                                        field666 = 1;
                                                        field597 = 0;
                                                        field726 = var74;
                                                        field727 = var75;
                                                    }
                                                    if (Statics.field1887 != var60) {
                                                        if (var60 != null) {
                                                            method1946(var60);
                                                        }
                                                        if (Statics.field1887 != null) {
                                                            method1946(Statics.field1887);
                                                        }
                                                    }
                                                    if (Statics.field976 != var61 && field551 == field537) {
                                                        if (var61 != null) {
                                                            method1946(var61);
                                                        }
                                                        if (Statics.field976 != null) {
                                                            method1946(Statics.field976);
                                                        }
                                                    }
                                                    if (Statics.field976 == null) {
                                                        if (field537 > 0) {
                                                            field537--;
                                                        }
                                                    } else if (field537 < field551) {
                                                        field537++;
                                                        if (field551 == field537) {
                                                            method1946(Statics.field976);
                                                        }
                                                    }
                                                    if (field569 == 0) {
                                                        int var77 = Statics.field1440.field1200;
                                                        int var78 = Statics.field1440.field1205;
                                                        if (Statics.field474 - var77 < -500 || Statics.field474 - var77 > 500 || Statics.field247 - var78 < -500 || Statics.field247 - var78 > 500) {
                                                            Statics.field474 = var77;
                                                            Statics.field247 = var78;
                                                        }
                                                        if (Statics.field474 != var77) {
                                                            Statics.field474 += (var77 - Statics.field474) / 16;
                                                        }
                                                        if (Statics.field247 != var78) {
                                                            Statics.field247 += (var78 - Statics.field247) / 16;
                                                        }
                                                        int var79 = Statics.field474 >> 7;
                                                        int var80 = Statics.field247 >> 7;
                                                        int var81 = method5746(Statics.field474, Statics.field247, Statics.field1812);
                                                        int var82 = 0;
                                                        if (var79 > 3 && var80 > 3 && var79 < 100 && var80 < 100) {
                                                            for (int var83 = var79 - 4; var83 <= var79 + 4; var83++) {
                                                                for (int var84 = var80 - 4; var84 <= var80 + 4; var84++) {
                                                                    int var85 = Statics.field1812;
                                                                    if (var85 < 3 && (class80.field994[1][var83][var84] & 0x2) == 2) {
                                                                        var85++;
                                                                    }
                                                                    int var86 = var81 - class80.field1000[var85][var83][var84];
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
                                                        if (var87 > field501) {
                                                            field501 += (var87 - field501) / 24;
                                                        } else if (var87 < field501) {
                                                            field501 += (var87 - field501) / 80;
                                                        }
                                                        Statics.field1534 = method5746(Statics.field1440.field1200, Statics.field1440.field1205, Statics.field1812) - field650;
                                                    } else if (field569 == 1) {
                                                        if (field554 && Statics.field1440 != null) {
                                                            int var88 = Statics.field1440.field1212[0];
                                                            int var89 = Statics.field1440.field1171[0];
                                                            if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                                                                Statics.field474 = Statics.field1440.field1200;
                                                                int var90 = method5746(Statics.field1440.field1200, Statics.field1440.field1205, Statics.field1812) - field650;
                                                                if (var90 < Statics.field1534) {
                                                                    Statics.field1534 = var90;
                                                                }
                                                                Statics.field247 = Statics.field1440.field1205;
                                                                field554 = false;
                                                            }
                                                        }
                                                        short var91 = -1;
                                                        if (field713.method3741(33)) {
                                                            var91 = 0;
                                                        } else if (field713.method3741(49)) {
                                                            var91 = 1024;
                                                        }
                                                        if (field713.method3741(48)) {
                                                            if (var91 == 0) {
                                                                var91 = 1792;
                                                            } else if (var91 == 1024) {
                                                                var91 = 1280;
                                                            } else {
                                                                var91 = 1536;
                                                            }
                                                        } else if (field713.method3741(50)) {
                                                            if (var91 == 0) {
                                                                var91 = 256;
                                                            } else if (var91 == 1024) {
                                                                var91 = 768;
                                                            } else {
                                                                var91 = 512;
                                                            }
                                                        }
                                                        byte var92 = 0;
                                                        if (field713.method3741(35)) {
                                                            var92 = -1;
                                                        } else if (field713.method3741(51)) {
                                                            var92 = 1;
                                                        }
                                                        int var93 = 0;
                                                        if (var91 >= 0 || var92 != 0) {
                                                            int var94 = field713.method3741(81) ? field515 : field574;
                                                            var93 = var94 * 16;
                                                            field741 = var91;
                                                            field600 = var92;
                                                        }
                                                        if (field571 < var93) {
                                                            field571 += var93 / 8;
                                                            if (field571 > var93) {
                                                                field571 = var93;
                                                            }
                                                        } else if (field571 > var93) {
                                                            field571 = field571 * 9 / 10;
                                                        }
                                                        if (field571 > 0) {
                                                            int var95 = field571 / 16;
                                                            if (field741 >= 0) {
                                                                int var96 = field741 - Statics.field1400 & 0x7FF;
                                                                int var97 = class220.field2482[var96];
                                                                int var98 = class220.field2470[var96];
                                                                Statics.field474 += var95 * var97 / 65536;
                                                                Statics.field247 += var95 * var98 / 65536;
                                                            }
                                                            if (field600 != 0) {
                                                                Statics.field1534 += field600 * var95;
                                                                if (Statics.field1534 > 0) {
                                                                    Statics.field1534 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field741 = -1;
                                                            field600 = -1;
                                                        }
                                                        if (field713.method3741(13)) {
                                                            method3045();
                                                        }
                                                    }
                                                    if (class36.field229 == 4 && Statics.field3700) {
                                                        int var99 = class36.field227 - field568;
                                                        field547 = var99 * 2;
                                                        field568 = var99 == -1 || var99 == 1 ? class36.field227 : (field568 + class36.field227) / 2;
                                                        int var100 = field692 - class36.field228;
                                                        field565 = var100 * 2;
                                                        field692 = var100 == -1 || var100 == 1 ? class36.field228 : (field692 + class36.field228) / 2;
                                                    } else {
                                                        if (field713.method3741(96)) {
                                                            field565 += (-24 - field565) / 2;
                                                        } else if (field713.method3741(97)) {
                                                            field565 += (24 - field565) / 2;
                                                        } else {
                                                            field565 /= 2;
                                                        }
                                                        if (field713.method3741(98)) {
                                                            field547 += (12 - field547) / 2;
                                                        } else if (field713.method3741(99)) {
                                                            field547 += (-12 - field547) / 2;
                                                        } else {
                                                            field547 /= 2;
                                                        }
                                                        field568 = class36.field227;
                                                        field692 = class36.field228;
                                                    }
                                                    field564 = field565 / 2 + field564 & 0x7FF;
                                                    field563 += field547 / 2;
                                                    if (field563 < 128) {
                                                        field563 = 128;
                                                    }
                                                    if (field563 > 383) {
                                                        field563 = 383;
                                                    }
                                                    if (field738) {
                                                        method92();
                                                    } else if (field737) {
                                                        int var101 = Statics.field8 * 128 + 64;
                                                        int var102 = Statics.field2938 * 128 + 64;
                                                        int var103 = method5746(var101, var102, Statics.field1812) - Statics.field3034;
                                                        method2242(var101, var103, var102);
                                                        int var104 = Statics.field1801 * 128 + 64;
                                                        int var105 = Statics.field124 * 128 + 64;
                                                        int var106 = method5746(var104, var105, Statics.field1812) - Statics.field3362;
                                                        int var107 = var104 - Statics.field4413;
                                                        int var108 = var106 - Statics.field4280;
                                                        int var109 = var105 - Statics.field4880;
                                                        int var110 = (int) Math.sqrt((double) (var107 * var107 + var109 * var109));
                                                        int var111 = (int) (Math.atan2((double) var108, (double) var110) * 325.9490051269531D) & 0x7FF;
                                                        int var112 = (int) (Math.atan2((double) var107, (double) var109) * -325.9490051269531D) & 0x7FF;
                                                        method4936(var111, var112);
                                                    }
                                                    for (int var113 = 0; var113 < 5; var113++) {
                                                        int var10002 = field567[var113]++;
                                                    }
                                                    Statics.field2901.method2573();
                                                    int var114 = class36.method6075();
                                                    int var115 = field213.method337();
                                                    if (var114 > 15000 && var115 > 15000) {
                                                        field675 = 250;
                                                        class36.field222 = 14500;
                                                        class285 var117 = class285.method2741(class283.field3058, field734.field1380);
                                                        field734.method2635(var117);
                                                    }
                                                    Statics.field16.method1744();
                                                    method1683();
                                                    field734.field1387++;
                                                    if (field734.field1387 > 50) {
                                                        class285 var118 = class285.method2741(class283.field3093, field734.field1380);
                                                        field734.method2635(var118);
                                                    }
                                                    try {
                                                        field734.method2634();
                                                    } catch (IOException var120) {
                                                        method2241();
                                                    }
                                                    return;
                                                }
                                                method195(var73);
                                            }
                                        }
                                        var71 = var70.field1056;
                                        if (var71.field3524 < 0) {
                                            break;
                                        }
                                        var72 = class313.method4802(var71.field3531);
                                    } while (var72 == null || var72.field3662 == null || var71.field3524 >= var72.field3662.length || var72.field3662[var71.field3524] != var71);
                                    class68.method69(var70);
                                }
                            }
                            var68 = var67.field1056;
                            if (var68.field3524 < 0) {
                                break;
                            }
                            var69 = class313.method4802(var68.field3531);
                        } while (var69 == null || var69.field3662 == null || var68.field3524 >= var69.field3662.length || var69.field3662[var68.field3524] != var68);
                        class68.method69(var67);
                    }
                }
                var65 = var64.field1056;
                if (var65.field3524 < 0) {
                    break;
                }
                var66 = class313.method4802(var65.field3531);
            } while (var66 == null || var66.field3662 == null || var65.field3524 >= var66.field3662.length || var66.field3662[var65.field3524] != var65);
            class68.method69(var64);
        }
    }

    @ObfuscatedName("hg.hb(I)V")
    public static final void method3345() {
        if (Statics.field2734 != null) {
            Statics.field2734.method764();
        }
        if (Statics.field826 != null) {
            Statics.field826.method764();
        }
    }

    @ObfuscatedName("hg.hc(I)V")
    public static final void method3338() {
        for (int var0 = 0; var0 < field731; var0++) {
            int var10002 = field685[var0]--;
            if (field685[var0] >= -10) {
                class40 var2 = field736[var0];
                if (var2 == null) {
                    class40 var10000 = (class40) null;
                    var2 = class40.method725(Statics.field1842, field732[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field685[var0] += var2.method718();
                    field736[var0] = var2;
                }
                if (field685[var0] < 0) {
                    int var9;
                    if (field735[var0] == 0) {
                        var9 = Statics.field2929.method2328();
                    } else {
                        int var3 = (field735[var0] & 0xFF) * 128;
                        int var4 = field735[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1440.field1200;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field735[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1440.field1205;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field685[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * Statics.field2929.method2349() / var3;
                    }
                    if (var9 > 0) {
                        class41 var10 = var2.method719().method728(Statics.field1813);
                        class48 var11 = class48.method833(var10, 100, var9);
                        var11.method949(field733[var0] - 1);
                        Statics.field3749.method676(var11);
                    }
                    field685[var0] = -100;
                }
            } else {
                field731--;
                for (int var1 = var0; var1 < field731; var1++) {
                    field732[var1] = field732[var1 + 1];
                    field736[var1] = field736[var1 + 1];
                    field733[var1] = field733[var1 + 1];
                    field685[var1] = field685[var1 + 1];
                    field735[var1] = field735[var1 + 1];
                }
                var0--;
            }
        }
        if (!field730) {
            return;
        }
        boolean var12;
        if (class294.field3330 == 0) {
            var12 = Statics.field3331.method5036();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (Statics.field2929.method2326() != 0 && field729 != -1) {
                class294.method3085(Statics.field3456, field729, 0, Statics.field2929.method2326(), false);
            }
            field730 = false;
        }
    }

    @ObfuscatedName("ak.hd(Lhx;IIII)V")
    public static void method85(class206 arg0, int arg1, int arg2, int arg3) {
        if (field731 >= 50 || Statics.field2929.method2349() == 0 || arg0.field2265 == null || arg1 >= arg0.field2265.length) {
            return;
        }
        int var4 = arg0.field2265[arg1];
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field732[field731] = var7;
        field733[field731] = var8;
        field685[field731] = 0;
        field736[field731] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field735[field731] = (var10 << 16) + (var11 << 8) + var9;
        field731++;
    }

    @ObfuscatedName("ck.hr(Lhx;IIIB)V")
    public static void method1143(class206 arg0, int arg1, int arg2, int arg3) {
        if (field731 >= 50 || Statics.field2929.method2349() == 0 || arg0.field2274 == null || !arg0.field2274.containsKey(arg1)) {
            return;
        }
        int var4 = (Integer) arg0.field2274.get(arg1);
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field732[field731] = var7;
        field733[field731] = var8;
        field685[field731] = 0;
        field736[field731] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field735[field731] = (var10 << 16) + (var11 << 8) + var9;
        field731++;
    }

    @ObfuscatedName("mm.hv(IIII)V")
    public static void method5757(int arg0, int arg1, int arg2) {
        if (Statics.field2929.method2328() == 0 || arg1 == 0 || field731 >= 50) {
            return;
        }
        field732[field731] = arg0;
        field733[field731] = arg1;
        field685[field731] = arg2;
        field736[field731] = null;
        field735[field731] = 0;
        field731++;
    }

    @ObfuscatedName("nq.hn(II)V")
    public static void method6060(int arg0) {
        if (arg0 == -1 && !field730) {
            class294.method4792();
        } else if (arg0 != -1 && field729 != arg0 && Statics.field2929.method2326() != 0 && !field730) {
            class294.method2466(2, Statics.field3456, arg0, 0, Statics.field2929.method2326(), false);
        }
        field729 = arg0;
    }

    @ObfuscatedName("at.hs(III)V")
    public static void method272(int arg0, int arg1) {
        if (Statics.field2929.method2326() != 0 && arg0 != -1) {
            class294.method3085(Statics.field240, arg0, 0, Statics.field2929.method2326(), false);
            field730 = true;
        }
    }

    @ObfuscatedName("fe.hg(B)V")
    public static final void method2895() {
        if (!Statics.field98) {
            return;
        }
        if (Statics.field251 != null) {
            Statics.field251.method6962();
        }
        method3186();
        Statics.field98 = false;
    }

    @ObfuscatedName("co.ho(I)V")
    public static final void method1047() {
        if (Statics.field1876) {
            method3210();
            Statics.field1876 = false;
        }
    }

    @ObfuscatedName("er.hj(Lmy;III)V")
    public static final void method2687(class313 arg0, int arg1, int arg2) {
        if (field728 != 0 && field728 != 3 || field768 || !(class36.field235 == 1 || !Statics.field3700 && class36.field235 == 4)) {
            return;
        }
        class302 var3 = arg0.method5546(true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field236 - arg1;
        int var5 = class36.field237 - arg2;
        if (!var3.method5193(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3422 / 2;
        int var7 = var5 - var3.field3420 / 2;
        int var8 = field564 & 0x7FF;
        int var9 = class220.field2482[var8];
        int var10 = class220.field2470[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1440.field1200 + var11 >> 7;
        int var14 = Statics.field1440.field1205 - var12 >> 7;
        class285 var15 = class285.method2741(class283.field3094, field734.field1380);
        var15.field3169.method7886(18);
        var15.field3169.method7942(Statics.field1865 + var14);
        var15.field3169.method7887(Statics.field218 + var13);
        var15.field3169.method8157(field713.method3741(82) ? (field713.method3741(81) ? 2 : 1) : 0);
        var15.field3169.method7886(var6);
        var15.field3169.method7886(var7);
        var15.field3169.method7887(field564);
        var15.field3169.method7886(57);
        var15.field3169.method7886(0);
        var15.field3169.method7886(0);
        var15.field3169.method7886(89);
        var15.field3169.method7887(Statics.field1440.field1200);
        var15.field3169.method7887(Statics.field1440.field1205);
        var15.field3169.method7886(63);
        field734.method2635(var15);
        field726 = var13;
        field727 = var14;
    }

    @ObfuscatedName("ed.hl(B)V")
    public static final void method2882() {
        int[] var0 = class105.field1344;
        for (int var1 = 0; var1 < class105.field1342; var1++) {
            class90 var2 = field758[var0[var1]];
            if (var2 != null && var2.field1175 > 0) {
                var2.field1175--;
                if (var2.field1175 == 0) {
                    var2.field1199 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field538; var3++) {
            int var4 = field539[var3];
            class98 var5 = field682[var4];
            if (var5 != null && var5.field1175 > 0) {
                var5.field1175--;
                if (var5.field1175 == 0) {
                    var5.field1199 = null;
                }
            }
        }
    }

    @ObfuscatedName("eq.he(Ljava/lang/String;S)V")
    public static final void method2763(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2929.method2318(!Statics.field2929.method2344());
            if (Statics.field2929.method2344()) {
                class108.method5191(99, "", "Roofs are now all hidden");
            } else {
                class108.method5191(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field2929.method2319();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field606 = !field606;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field531 = !field531;
        }
        if (field655 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field2889.field4781 = !Statics.field2889.field4781;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field2929.method2409(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field2929.method2409(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2241();
            }
        }
        class285 var1 = class285.method2741(class283.field3098, field734.field1380);
        var1.field3169.method7886(arg0.length() + 1);
        var1.field3169.method7893(arg0);
        field734.method2635(var1);
    }

    @ObfuscatedName("ax.ha(I)V")
    public static final void method92() {
        method2242(Statics.field4334, Statics.field3433, Statics.field3450);
        method4936(Statics.field2964, Statics.field155);
        if (Statics.field4413 != Statics.field4334 || Statics.field4280 != Statics.field3433 || Statics.field4880 != Statics.field3450 || Statics.field3507 != Statics.field2964 || Statics.field155 != Statics.field1400) {
            return;
        }
        field738 = false;
        field737 = false;
        Statics.field1801 = 0;
        Statics.field124 = 0;
        Statics.field3362 = 0;
        Statics.field4270 = 0;
        Statics.field2506 = 0;
        Statics.field3677 = 0;
        Statics.field105 = 0;
        Statics.field8 = 0;
        Statics.field2938 = 0;
        Statics.field3034 = 0;
    }

    @ObfuscatedName("da.hk(IIII)V")
    public static final void method2242(int arg0, int arg1, int arg2) {
        if (Statics.field4413 < arg0) {
            Statics.field4413 += Statics.field3677 * (arg0 - Statics.field4413) / 1000 + Statics.field105;
            if (Statics.field4413 > arg0) {
                Statics.field4413 = arg0;
            }
        }
        if (Statics.field4413 > arg0) {
            Statics.field4413 -= Statics.field3677 * (Statics.field4413 - arg0) / 1000 + Statics.field105;
            if (Statics.field4413 < arg0) {
                Statics.field4413 = arg0;
            }
        }
        if (Statics.field4280 < arg1) {
            Statics.field4280 += Statics.field3677 * (arg1 - Statics.field4280) / 1000 + Statics.field105;
            if (Statics.field4280 > arg1) {
                Statics.field4280 = arg1;
            }
        }
        if (Statics.field4280 > arg1) {
            Statics.field4280 -= Statics.field3677 * (Statics.field4280 - arg1) / 1000 + Statics.field105;
            if (Statics.field4280 < arg1) {
                Statics.field4280 = arg1;
            }
        }
        if (Statics.field4880 < arg2) {
            Statics.field4880 += Statics.field3677 * (arg2 - Statics.field4880) / 1000 + Statics.field105;
            if (Statics.field4880 > arg2) {
                Statics.field4880 = arg2;
            }
        }
        if (Statics.field4880 > arg2) {
            Statics.field4880 -= Statics.field3677 * (Statics.field4880 - arg2) / 1000 + Statics.field105;
            if (Statics.field4880 < arg2) {
                Statics.field4880 = arg2;
            }
        }
    }

    @ObfuscatedName("ks.hw(III)V")
    public static final void method4936(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field3507 < arg0) {
            Statics.field3507 += Statics.field2506 * (arg0 - Statics.field3507) / 1000 + Statics.field4270;
            if (Statics.field3507 > arg0) {
                Statics.field3507 = arg0;
            }
        }
        if (Statics.field3507 > arg0) {
            Statics.field3507 -= Statics.field2506 * (Statics.field3507 - arg0) / 1000 + Statics.field4270;
            if (Statics.field3507 < arg0) {
                Statics.field3507 = arg0;
            }
        }
        int var2 = arg1 - Statics.field1400;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field1400 += Statics.field2506 * var2 / 1000 + Statics.field4270;
            Statics.field1400 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field1400 -= Statics.field2506 * -var2 / 1000 + Statics.field4270;
            Statics.field1400 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field1400;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field1400 = arg1;
        }
    }

    @ObfuscatedName("dx.hq(Ldq;IB)V")
    public static final void method2164(class93 arg0, int arg1) {
        if (arg0.field1197 >= field494) {
            int var2 = Math.max(1, arg0.field1197 - field494);
            int var3 = arg0.field1193 * 128 + arg0.field1143 * 64;
            int var4 = arg0.field1195 * 128 + arg0.field1143 * 64;
            arg0.field1200 += (var3 - arg0.field1200) / var2;
            arg0.field1205 += (var4 - arg0.field1205) / var2;
            arg0.field1215 = 0;
            arg0.field1208 = arg0.field1163;
        } else if (arg0.field1198 >= field494) {
            method34(arg0);
        } else {
            method267(arg0);
        }
        if (arg0.field1200 < 128 || arg0.field1205 < 128 || arg0.field1200 >= 13184 || arg0.field1205 >= 13184) {
            arg0.field1183 = -1;
            arg0.field1148 = -1;
            arg0.field1197 = 0;
            arg0.field1198 = 0;
            arg0.field1200 = arg0.field1212[0] * 128 + arg0.field1143 * 64;
            arg0.field1205 = arg0.field1171[0] * 128 + arg0.field1143 * 64;
            arg0.method2257();
        }
        if (Statics.field1440 == arg0 && (arg0.field1200 < 1536 || arg0.field1205 < 1536 || arg0.field1200 >= 11776 || arg0.field1205 >= 11776)) {
            arg0.field1183 = -1;
            arg0.field1148 = -1;
            arg0.field1197 = 0;
            arg0.field1198 = 0;
            arg0.field1200 = arg0.field1212[0] * 128 + arg0.field1143 * 64;
            arg0.field1205 = arg0.field1171[0] * 128 + arg0.field1143 * 64;
            arg0.method2257();
        }
        method1960(arg0);
        method148(arg0);
    }

    @ObfuscatedName("av.hp(Ldq;I)V")
    public static final void method34(class93 arg0) {
        boolean var1 = field494 == arg0.field1198 || arg0.field1183 == -1 || arg0.field1189 != 0;
        if (!var1) {
            class206 var2 = class206.method5217(arg0.field1183);
            if (var2 == null || var2.method3694()) {
                var1 = true;
            } else {
                var1 = arg0.field1194 + 1 > var2.field2264[arg0.field1184];
            }
        }
        if (var1) {
            int var3 = arg0.field1198 - arg0.field1197;
            int var4 = field494 - arg0.field1197;
            int var5 = arg0.field1193 * 128 + arg0.field1143 * 64;
            int var6 = arg0.field1195 * 128 + arg0.field1143 * 64;
            int var7 = arg0.field1203 * 128 + arg0.field1143 * 64;
            int var8 = arg0.field1196 * 128 + arg0.field1143 * 64;
            arg0.field1200 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1205 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1215 = 0;
        arg0.field1208 = arg0.field1163;
        arg0.field1141 = arg0.field1208;
    }

    @ObfuscatedName("ag.hy(Ldq;B)V")
    public static final void method267(class93 arg0) {
        arg0.field1179 = arg0.field1145;
        if (arg0.field1211 == 0) {
            arg0.field1215 = 0;
            return;
        }
        if (arg0.field1183 != -1 && arg0.field1189 == 0) {
            class206 var1 = class206.method5217(arg0.field1183);
            if (arg0.field1216 > 0 && var1.field2278 == 0) {
                arg0.field1215++;
                return;
            }
            if (arg0.field1216 <= 0 && var1.field2256 == 0) {
                arg0.field1215++;
                return;
            }
        }
        int var2 = arg0.field1200;
        int var3 = arg0.field1205;
        int var4 = arg0.field1212[arg0.field1211 - 1] * 128 + arg0.field1143 * 64;
        int var5 = arg0.field1171[arg0.field1211 - 1] * 128 + arg0.field1143 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1208 = 1280;
            } else if (var3 > var5) {
                arg0.field1208 = 1792;
            } else {
                arg0.field1208 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1208 = 768;
            } else if (var3 > var5) {
                arg0.field1208 = 256;
            } else {
                arg0.field1208 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1208 = 1024;
        } else if (var3 > var5) {
            arg0.field1208 = 0;
        }
        class212 var6 = arg0.field1214[arg0.field1211 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1200 = var4;
            arg0.field1205 = var5;
            arg0.field1211--;
            if (arg0.field1216 > 0) {
                arg0.field1216--;
            }
            return;
        }
        int var7 = arg0.field1208 - arg0.field1141 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1149;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1167;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1151;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1150;
        }
        if (var8 == -1) {
            var8 = arg0.field1167;
        }
        arg0.field1179 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class98) {
            var10 = ((class98) arg0).field1277.field2012;
        }
        if (var10) {
            if (arg0.field1208 != arg0.field1141 && arg0.field1173 == -1 && arg0.field1210 != 0) {
                var9 = 2;
            }
            if (arg0.field1211 > 2) {
                var9 = 6;
            }
            if (arg0.field1211 > 3) {
                var9 = 8;
            }
            if (arg0.field1215 > 0 && arg0.field1211 > 1) {
                var9 = 8;
                arg0.field1215--;
            }
        } else {
            if (arg0.field1211 > 1) {
                var9 = 6;
            }
            if (arg0.field1211 > 2) {
                var9 = 8;
            }
            if (arg0.field1215 > 0 && arg0.field1211 > 1) {
                var9 = 8;
                arg0.field1215--;
            }
        }
        if (class212.field2336 == var6) {
            var9 <<= 0x1;
        } else if (class212.field2334 == var6) {
            var9 >>= 0x1;
        }
        if (var9 >= 8) {
            if (arg0.field1179 == arg0.field1167 && arg0.field1152 != -1) {
                arg0.field1179 = arg0.field1152;
            } else if (arg0.field1179 == arg0.field1149 && arg0.field1153 != -1) {
                arg0.field1179 = arg0.field1153;
            } else if (arg0.field1179 == arg0.field1150 && arg0.field1154 != -1) {
                arg0.field1179 = arg0.field1154;
            } else if (arg0.field1179 == arg0.field1151 && arg0.field1155 != -1) {
                arg0.field1179 = arg0.field1155;
            }
        } else if (var9 <= 1) {
            if (arg0.field1179 == arg0.field1167 && arg0.field1156 != -1) {
                arg0.field1179 = arg0.field1156;
            } else if (arg0.field1179 == arg0.field1149 && arg0.field1201 != -1) {
                arg0.field1179 = arg0.field1201;
            } else if (arg0.field1179 == arg0.field1150 && arg0.field1213 != -1) {
                arg0.field1179 = arg0.field1213;
            } else if (arg0.field1179 == arg0.field1151 && arg0.field1159 != -1) {
                arg0.field1179 = arg0.field1159;
            }
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1200 += var9;
                if (arg0.field1200 > var4) {
                    arg0.field1200 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1200 -= var9;
                if (arg0.field1200 < var4) {
                    arg0.field1200 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1205 += var9;
                if (arg0.field1205 > var5) {
                    arg0.field1205 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1205 -= var9;
                if (arg0.field1205 < var5) {
                    arg0.field1205 = var5;
                }
            }
        }
        if (arg0.field1200 == var4 && arg0.field1205 == var5) {
            arg0.field1211--;
            if (arg0.field1216 > 0) {
                arg0.field1216--;
            }
        }
    }

    @ObfuscatedName("cm.hm(Ldq;I)V")
    public static final void method1960(class93 arg0) {
        if (arg0.field1173 != -1) {
            Object var1 = null;
            int var2 = 65536;
            class93 var3;
            if (arg0.field1173 < var2) {
                var3 = field682[arg0.field1173];
            } else {
                var3 = field758[arg0.field1173 - var2];
            }
            if (var3 != null) {
                int var4 = arg0.field1200 - var3.field1200;
                int var5 = arg0.field1205 - var3.field1205;
                if (var4 != 0 || var5 != 0) {
                    int var7 = (int) (Math.atan2((double) var4, (double) var5) * 325.94932345220167D) & 0x7FF;
                    arg0.field1208 = var7;
                }
            } else if (arg0.field1174) {
                arg0.field1173 = -1;
                arg0.field1174 = false;
            }
        }
        if (arg0.field1211 == 0 || arg0.field1215 > 0) {
            int var8 = -1;
            if (arg0.field1181 != -1 && arg0.field1177 != -1) {
                int var9 = arg0.field1181 * 128 - Statics.field218 * 128 + 64;
                int var10 = arg0.field1177 * 128 - Statics.field1865 * 128 + 64;
                int var11 = arg0.field1200 - var9;
                int var12 = arg0.field1205 - var10;
                if (var11 != 0 || var12 != 0) {
                    int var13 = (int) (Math.atan2((double) var11, (double) var12) * 325.94932345220167D) & 0x7FF;
                    var8 = var13;
                }
            } else if (arg0.field1165 != -1) {
                var8 = arg0.field1165;
            }
            if (var8 != -1) {
                arg0.field1208 = var8;
                if (arg0.field1158) {
                    arg0.field1141 = arg0.field1208;
                }
            }
            arg0.method2251();
        }
        int var14 = arg0.field1208 - arg0.field1141 & 0x7FF;
        if (var14 == 0) {
            if (arg0.field1174) {
                arg0.field1173 = -1;
                arg0.field1174 = false;
            }
            arg0.field1209 = 0;
            return;
        }
        boolean var15 = true;
        boolean var16 = true;
        arg0.field1209++;
        int var17 = var14 > 1024 ? -1 : 1;
        arg0.field1141 += arg0.field1210 * var17;
        boolean var18 = true;
        if (var14 < arg0.field1210 || var14 > 2048 - arg0.field1210) {
            arg0.field1141 = arg0.field1208;
            var18 = false;
        }
        if (arg0.field1210 > 0 && arg0.field1179 == arg0.field1145 && (arg0.field1209 > 25 || var18)) {
            if (var17 == -1 && arg0.field1146 != -1) {
                arg0.field1179 = arg0.field1146;
            } else if (var17 == 1 && arg0.field1147 != -1) {
                arg0.field1179 = arg0.field1147;
            } else {
                arg0.field1179 = arg0.field1167;
            }
        }
        arg0.field1141 &= 0x7FF;
    }

    @ObfuscatedName("ay.hf(Ldq;B)V")
    public static final void method148(class93 arg0) {
        arg0.field1142 = false;
        if (arg0.field1179 != -1) {
            class206 var1 = class206.method5217(arg0.field1179);
            if (var1 == null) {
                arg0.field1179 = -1;
            } else if (!var1.method3694() && var1.field2276 != null) {
                arg0.field1140++;
                if (arg0.field1180 < var1.field2276.length && arg0.field1140 > var1.field2264[arg0.field1180]) {
                    arg0.field1140 = 1;
                    arg0.field1180++;
                    method85(var1, arg0.field1180, arg0.field1200, arg0.field1205);
                }
                if (arg0.field1180 >= var1.field2276.length) {
                    if (var1.field2263 > 0) {
                        arg0.field1180 -= var1.field2263;
                        if (var1.field2273) {
                            arg0.field1182++;
                        }
                        if (arg0.field1180 < 0 || arg0.field1180 >= var1.field2276.length || var1.field2273 && arg0.field1182 >= var1.field2262) {
                            arg0.field1140 = 0;
                            arg0.field1180 = 0;
                            arg0.field1182 = 0;
                        }
                    } else {
                        arg0.field1140 = 0;
                        arg0.field1180 = 0;
                    }
                    method85(var1, arg0.field1180, arg0.field1200, arg0.field1205);
                }
            } else if (var1.method3694()) {
                arg0.field1180++;
                int var2 = var1.method3695();
                if (arg0.field1180 < var2) {
                    method1143(var1, arg0.field1180, arg0.field1200, arg0.field1205);
                } else {
                    if (var1.field2263 > 0) {
                        arg0.field1180 -= var1.field2263;
                        if (var1.field2273) {
                            arg0.field1182++;
                        }
                        if (arg0.field1180 < 0 || arg0.field1180 >= var2 || var1.field2273 && arg0.field1182 >= var1.field2262) {
                            arg0.field1180 = 0;
                            arg0.field1140 = 0;
                            arg0.field1182 = 0;
                        }
                    } else {
                        arg0.field1140 = 0;
                        arg0.field1180 = 0;
                    }
                    method1143(var1, arg0.field1180, arg0.field1200, arg0.field1205);
                }
            } else {
                arg0.field1179 = -1;
            }
        }
        if (arg0.field1148 != -1 && field494 >= arg0.field1191) {
            if (arg0.field1188 < 0) {
                arg0.field1188 = 0;
            }
            int var3 = class195.method298(arg0.field1148).field2057;
            if (var3 == -1) {
                arg0.field1148 = -1;
            } else {
                class206 var4 = class206.method5217(var3);
                if (var4 != null && var4.field2276 != null && !var4.method3694()) {
                    arg0.field1176++;
                    if (arg0.field1188 < var4.field2276.length && arg0.field1176 > var4.field2264[arg0.field1188]) {
                        arg0.field1176 = 1;
                        arg0.field1188++;
                        method85(var4, arg0.field1188, arg0.field1200, arg0.field1205);
                    }
                    if (arg0.field1188 >= var4.field2276.length && (arg0.field1188 < 0 || arg0.field1188 >= var4.field2276.length)) {
                        arg0.field1148 = -1;
                    }
                } else if (var4.method3694()) {
                    arg0.field1188++;
                    int var5 = var4.method3695();
                    if (arg0.field1188 < var5) {
                        method1143(var4, arg0.field1188, arg0.field1200, arg0.field1205);
                    } else if (arg0.field1188 < 0 || arg0.field1188 >= var5) {
                        arg0.field1148 = -1;
                    }
                } else {
                    arg0.field1148 = -1;
                }
            }
        }
        if (arg0.field1183 != -1 && arg0.field1189 <= 1) {
            class206 var6 = class206.method5217(arg0.field1183);
            if (var6.field2278 == 1 && arg0.field1216 > 0 && arg0.field1197 <= field494 && arg0.field1198 < field494) {
                arg0.field1189 = 1;
                return;
            }
        }
        if (arg0.field1183 != -1 && arg0.field1189 == 0) {
            class206 var7 = class206.method5217(arg0.field1183);
            if (var7 == null) {
                arg0.field1183 = -1;
            } else if (!var7.method3694() && var7.field2276 != null) {
                arg0.field1194++;
                if (arg0.field1184 < var7.field2276.length && arg0.field1194 > var7.field2264[arg0.field1184]) {
                    arg0.field1194 = 1;
                    arg0.field1184++;
                    method85(var7, arg0.field1184, arg0.field1200, arg0.field1205);
                }
                if (arg0.field1184 >= var7.field2276.length) {
                    arg0.field1184 -= var7.field2263;
                    arg0.field1187++;
                    if (arg0.field1187 >= var7.field2262) {
                        arg0.field1183 = -1;
                    } else if (arg0.field1184 >= 0 && arg0.field1184 < var7.field2276.length) {
                        method85(var7, arg0.field1184, arg0.field1200, arg0.field1205);
                    } else {
                        arg0.field1183 = -1;
                    }
                }
                arg0.field1142 = var7.field2269;
            } else if (var7.method3694()) {
                arg0.field1184++;
                int var8 = var7.method3695();
                if (arg0.field1184 < var8) {
                    method1143(var7, arg0.field1184, arg0.field1200, arg0.field1205);
                } else {
                    arg0.field1184 -= var7.field2263;
                    arg0.field1187++;
                    if (arg0.field1187 >= var7.field2262) {
                        arg0.field1183 = -1;
                    } else if (arg0.field1184 >= 0 && arg0.field1184 < var8) {
                        method1143(var7, arg0.field1184, arg0.field1200, arg0.field1205);
                    } else {
                        arg0.field1183 = -1;
                    }
                }
            } else {
                arg0.field1183 = -1;
            }
        }
        if (arg0.field1189 > 0) {
            arg0.field1189--;
        }
    }

    @ObfuscatedName("nq.hu(Ldh;IIB)V")
    public static void method6063(class90 arg0, int arg1, int arg2) {
        if (arg0.field1183 == arg1 && arg1 != -1) {
            int var3 = class206.method5217(arg1).field2277;
            if (var3 == 1) {
                arg0.field1184 = 0;
                arg0.field1194 = 0;
                arg0.field1189 = arg2;
                arg0.field1187 = 0;
            }
            if (var3 == 2) {
                arg0.field1187 = 0;
            }
        } else if (arg1 == -1 || arg0.field1183 == -1 || class206.method5217(arg1).field2270 >= class206.method5217(arg0.field1183).field2270) {
            arg0.field1183 = arg1;
            arg0.field1184 = 0;
            arg0.field1194 = 0;
            arg0.field1189 = arg2;
            arg0.field1187 = 0;
            arg0.field1216 = arg0.field1211;
        }
    }

    @ObfuscatedName("aq.hh(B)I")
    public static int method48() {
        return field706 ? 2 : 1;
    }

    @ObfuscatedName("dz.hz(II)V")
    public static void method2496(int arg0) {
        field697 = 0L;
        if (arg0 >= 2) {
            field706 = true;
        } else {
            field706 = false;
        }
        if (method48() == 1) {
            Statics.field4480.method471(765, 503);
        } else {
            Statics.field4480.method471(7680, 2160);
        }
        if (field529 < 25) {
            return;
        }
        class285 var1 = class285.method2741(class283.field3069, field734.field1380);
        var1.field3169.method7886(method48());
        var1.field3169.method7887(Statics.field208);
        var1.field3169.method7887(Statics.field1637);
        field734.method2635(var1);
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method482() {
        field697 = class290.method4466() + 500L;
        this.method1162();
        if (field647 != -1) {
            this.method1170(true);
        }
    }

    @ObfuscatedName("client.hx(B)V")
    public void method1162() {
        int var1 = Statics.field208;
        int var2 = Statics.field1637;
        if (this.field193 < var1) {
            int var3 = this.field193;
        }
        if (this.field194 < var2) {
            int var4 = this.field194;
        }
        if (Statics.field2929 != null) {
            try {
                class27.method371(Statics.field4480, "resize", new Object[] { method48() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.hi(I)V")
    public final void method1657() {
        if (field647 != -1) {
            int var1 = field647;
            if (class313.method5988(var1)) {
                method442(Statics.field1732[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field695; var2++) {
            if (field723[var2]) {
                field698[var2] = true;
            }
            field699[var2] = field723[var2];
            field723[var2] = false;
        }
        field696 = field494;
        field636 = -1;
        field605 = -1;
        if (field647 != -1) {
            field695 = 0;
            method1144(field647, 0, 0, Statics.field208, Statics.field1637, 0, 0, -1);
        }
        class488.method8232();
        if (field599) {
            if (field666 == 1) {
                Statics.field4512[field597 / 100].method8403(field595 - 8, field518 - 8);
            }
            if (field666 == 2) {
                Statics.field4512[field597 / 100 + 4].method8403(field595 - 8, field518 - 8);
            }
        }
        if (field768) {
            Statics.method8226();
        } else if (field636 != -1) {
            int var3 = field636;
            int var4 = field605;
            if ((field759 >= 2 || field640 != 0 || field767) && field531) {
                int var5 = field759 - 1;
                String var7;
                if (field640 == 1 && field759 < 2) {
                    var7 = class333.field3965 + class333.field3898 + field641 + " " + class99.field1292;
                } else if (field767 && field759 < 2) {
                    var7 = field712 + class333.field3898 + field646 + " " + class99.field1292;
                } else {
                    var7 = method4394(var5);
                }
                if (field759 > 2) {
                    var7 = var7 + class99.method308(16777215) + " " + '/' + " " + (field759 - 2) + class333.field3969;
                }
                Statics.field24.method6566(var7, var3 + 4, var4 + 15, 16777215, 0, field494 / 1000);
            }
        }
        if (field704 == 3) {
            for (int var8 = 0; var8 < field695; var8++) {
                if (field699[var8]) {
                    class488.method8247(field596[var8], field720[var8], field586[var8], field703[var8], 16711935, 128);
                } else if (field698[var8]) {
                    class488.method8247(field596[var8], field720[var8], field586[var8], field703[var8], 16711680, 128);
                }
            }
        }
        int var9 = Statics.field1812;
        int var10 = Statics.field1440.field1200;
        int var11 = Statics.field1440.field1205;
        int var12 = field632;
        for (class67 var13 = (class67) class67.field817.method6089(); var13 != null; var13 = (class67) class67.field817.method6098()) {
            if (var13.field814 != -1 || var13.field818 != null) {
                int var14 = 0;
                if (var10 > var13.field811) {
                    var14 += var10 - var13.field811;
                } else if (var10 < var13.field822) {
                    var14 += var13.field822 - var10;
                }
                if (var11 > var13.field812) {
                    var14 += var11 - var13.field812;
                } else if (var11 < var13.field810) {
                    var14 += var13.field810 - var11;
                }
                if (var14 - 64 > var13.field813 || Statics.field2929.method2349() == 0 || var13.field808 != var9) {
                    if (var13.field815 != null) {
                        Statics.field3749.method677(var13.field815);
                        var13.field815 = null;
                    }
                    if (var13.field816 != null) {
                        Statics.field3749.method677(var13.field816);
                        var13.field816 = null;
                    }
                } else {
                    var14 -= 64;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = (var13.field813 - var14) * Statics.field2929.method2349() / var13.field813;
                    class40 var10000;
                    if (var13.field815 != null) {
                        var13.field815.method950(var15);
                    } else if (var13.field814 >= 0) {
                        var10000 = (class40) null;
                        class40 var16 = class40.method725(Statics.field1842, var13.field814, 0);
                        if (var16 != null) {
                            class41 var17 = var16.method719().method728(Statics.field1813);
                            class48 var18 = class48.method833(var17, 100, var15);
                            var18.method949(-1);
                            Statics.field3749.method676(var18);
                            var13.field815 = var18;
                        }
                    }
                    if (var13.field816 != null) {
                        var13.field816.method950(var15);
                        if (!var13.field816.method7336()) {
                            var13.field816 = null;
                        }
                    } else if (var13.field818 != null && (var13.field819 -= var12) <= 0) {
                        int var19 = (int) (Math.random() * (double) var13.field818.length);
                        var10000 = (class40) null;
                        class40 var20 = class40.method725(Statics.field1842, var13.field818[var19], 0);
                        if (var20 != null) {
                            class41 var21 = var20.method719().method728(Statics.field1813);
                            class48 var22 = class48.method833(var21, 100, var15);
                            var22.method949(0);
                            Statics.field3749.method676(var22);
                            var13.field816 = var22;
                            var13.field819 = var13.field807 + (int) (Math.random() * (double) (var13.field809 - var13.field807));
                        }
                    }
                }
            }
        }
        field632 = 0;
    }

    @ObfuscatedName("ae.ht(Ljava/lang/String;ZB)V")
    public static final void method196(String arg0, boolean arg1) {
        if (!field601) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field4608.method6553(arg0, 250);
        int var6 = Statics.field4608.method6622(arg0, 250) * 13;
        class488.method8241(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class488.method8271(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field4608.method6575(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3166(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3785.method452(0, 0);
        } else {
            method3449(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("ci.ic(IIIII)V")
    public static final void method2018(int arg0, int arg1, int arg2, int arg3) {
        field592++;
        if (Statics.field1440.field1200 >> 7 == field726 && Statics.field1440.field1205 >> 7 == field727) {
            field726 = 0;
        }
        if (field606) {
            method4008(Statics.field1440, false);
        }
        if (field614 >= 0 && field758[field614] != null) {
            method4008(field758[field614], false);
        }
        method4819(true);
        method2157();
        method4819(false);
        method93();
        for (class69 var4 = (class69) field618.method6089(); var4 != null; var4 = (class69) field618.method6098()) {
            if (Statics.field1812 != var4.field848 || var4.field855) {
                var4.method7335();
            } else if (field494 >= var4.field856) {
                var4.method1935(field632);
                if (var4.field855) {
                    var4.method7335();
                } else {
                    Statics.field3.method4044(var4.field848, var4.field857, var4.field850, var4.field851, 60, var4, 0, -1L, false);
                }
            }
        }
        method6073(arg0, arg1, arg2, arg3, true);
        int var5 = field752;
        int var6 = field577;
        int var7 = field754;
        int var8 = field755;
        class488.method8233(var5, var6, var5 + var7, var6 + var8);
        class220.method3908();
        int var9 = field563;
        if (field501 / 256 > var9) {
            var9 = field501 / 256;
        }
        if (field739[4] && field681[4] + 128 > var9) {
            var9 = field681[4] + 128;
        }
        int var10 = field564 & 0x7FF;
        int var11 = Statics.field474;
        int var12 = Statics.field1534;
        int var13 = Statics.field247;
        int var16 = var9 * 3 + 600;
        method7086(var11, var12, var13, var9, var10, var16, var8);
        int var17;
        if (field737) {
            int var18;
            if (Statics.field2929.method2344()) {
                var18 = Statics.field1812;
            } else {
                int var19 = method5746(Statics.field4413, Statics.field4880, Statics.field1812);
                if (var19 - Statics.field4280 >= 800 || (class80.field994[Statics.field1812][Statics.field4413 >> 7][Statics.field4880 >> 7] & 0x4) == 0) {
                    var18 = 3;
                } else {
                    var18 = Statics.field1812;
                }
            }
            var17 = var18;
        } else {
            var17 = method2954();
        }
        int var20 = Statics.field4413;
        int var21 = Statics.field4280;
        int var22 = Statics.field4880;
        int var23 = Statics.field3507;
        int var24 = Statics.field1400;
        for (int var25 = 0; var25 < 5; var25++) {
            if (field739[var25]) {
                int var26 = (int) (Math.random() * (double) (field740[var25] * 2 + 1) - (double) field740[var25] + Math.sin((double) field742[var25] / 100.0D * (double) field567[var25]) * (double) field681[var25]);
                if (var25 == 0) {
                    Statics.field4413 += var26;
                }
                if (var25 == 1) {
                    Statics.field4280 += var26;
                }
                if (var25 == 2) {
                    Statics.field4880 += var26;
                }
                if (var25 == 3) {
                    Statics.field1400 = Statics.field1400 + var26 & 0x7FF;
                }
                if (var25 == 4) {
                    Statics.field3507 += var26;
                    if (Statics.field3507 < 128) {
                        Statics.field3507 = 128;
                    }
                    if (Statics.field3507 > 383) {
                        Statics.field3507 = 383;
                    }
                }
            }
        }
        int var27 = class36.field228;
        int var28 = class36.field227;
        if (class36.field235 != 0) {
            var27 = class36.field236;
            var28 = class36.field237;
        }
        if (var27 >= var5 && var27 < var5 + var7 && var28 >= var6 && var28 < var6 + var8) {
            class232.method1192(var27 - var5, var28 - var6);
        } else {
            class232.field2739 = false;
            class232.field2735 = 0;
        }
        method3345();
        class488.method8241(var5, var6, var7, var8, 0);
        method3345();
        int var29 = class220.field2478;
        class220.field2478 = field756;
        Statics.field3.method4074(Statics.field4413, Statics.field4280, Statics.field4880, Statics.field3507, Statics.field1400, var17);
        class220.field2478 = var29;
        method3345();
        Statics.field3.method4103();
        field743 = 0;
        boolean var30 = false;
        int var31 = -1;
        int var32 = -1;
        int var33 = class105.field1342;
        int[] var34 = class105.field1344;
        for (int var35 = 0; var35 < field538 + var33; var35++) {
            class93 var36;
            if (var35 < var33) {
                var36 = field758[var34[var35]];
                if (field614 == var34[var35]) {
                    var30 = true;
                    var31 = var35;
                    continue;
                }
                if (Statics.field1440 == var36) {
                    var32 = var35;
                    continue;
                }
            } else {
                var36 = field682[field539[var35 - var33]];
            }
            method2132(var36, var35, var5, var6, var7, var8);
        }
        if (field606 && var32 != -1) {
            method2132(Statics.field1440, var32, var5, var6, var7, var8);
        }
        if (var30) {
            method2132(field758[field614], var31, var5, var6, var7, var8);
        }
        for (int var37 = 0; var37 < field743; var37++) {
            int var38 = field662[var37];
            int var39 = field584[var37];
            int var40 = field645[var37];
            int var41 = field585[var37];
            boolean var42 = true;
            while (var42) {
                var42 = false;
                for (int var43 = 0; var43 < var37; var43++) {
                    if (var39 + 2 > field584[var43] - field585[var43] && var39 - var41 < field584[var43] + 2 && var38 - var40 < field662[var43] + field645[var43] && var38 + var40 > field662[var43] - field645[var43] && field584[var43] - field585[var43] < var39) {
                        var39 = field584[var43] - field585[var43];
                        var42 = true;
                    }
                }
            }
            field593 = field662[var37];
            field594 = field584[var37] = var39;
            String var44 = field590[var37];
            if (field651 == 0) {
                int var45 = 16776960;
                if (field587[var37] < 6) {
                    var45 = field707[field587[var37]];
                }
                if (field587[var37] == 6) {
                    var45 = field592 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field587[var37] == 7) {
                    var45 = field592 % 20 < 10 ? 255 : 65535;
                }
                if (field587[var37] == 8) {
                    var45 = field592 % 20 < 10 ? 45056 : 8454016;
                }
                if (field587[var37] == 9) {
                    int var46 = 150 - field589[var37];
                    if (var46 < 50) {
                        var45 = var46 * 1280 + 16711680;
                    } else if (var46 < 100) {
                        var45 = 16776960 - (var46 - 50) * 327680;
                    } else if (var46 < 150) {
                        var45 = (var46 - 100) * 5 + 65280;
                    }
                }
                if (field587[var37] == 10) {
                    int var47 = 150 - field589[var37];
                    if (var47 < 50) {
                        var45 = var47 * 5 + 16711680;
                    } else if (var47 < 100) {
                        var45 = 16711935 - (var47 - 50) * 327680;
                    } else if (var47 < 150) {
                        var45 = (var47 - 100) * 327680 + 255 - (var47 - 100) * 5;
                    }
                }
                if (field587[var37] == 11) {
                    int var48 = 150 - field589[var37];
                    if (var48 < 50) {
                        var45 = 16777215 - var48 * 327685;
                    } else if (var48 < 100) {
                        var45 = (var48 - 50) * 327685 + 65280;
                    } else if (var48 < 150) {
                        var45 = 16777215 - (var48 - 100) * 327680;
                    }
                }
                if (field588[var37] == 0) {
                    Statics.field24.method6560(var44, field593 + var5, field594 + var6, var45, 0);
                }
                if (field588[var37] == 1) {
                    Statics.field24.method6563(var44, field593 + var5, field594 + var6, var45, 0, field592);
                }
                if (field588[var37] == 2) {
                    Statics.field24.method6564(var44, field593 + var5, field594 + var6, var45, 0, field592);
                }
                if (field588[var37] == 3) {
                    Statics.field24.method6565(var44, field593 + var5, field594 + var6, var45, 0, field592, 150 - field589[var37]);
                }
                if (field588[var37] == 4) {
                    int var49 = (150 - field589[var37]) * (Statics.field24.method6551(var44) + 100) / 150;
                    class488.method8260(field593 + var5 - 50, var6, field593 + var5 + 50, var6 + var8);
                    Statics.field24.method6578(var44, field593 + var5 + 50 - var49, field594 + var6, var45, 0);
                    class488.method8233(var5, var6, var5 + var7, var6 + var8);
                }
                if (field588[var37] == 5) {
                    int var50 = 150 - field589[var37];
                    int var51 = 0;
                    if (var50 < 25) {
                        var51 = var50 - 25;
                    } else if (var50 > 125) {
                        var51 = var50 - 125;
                    }
                    class488.method8260(var5, field594 + var6 - Statics.field24.field4389 - 1, var5 + var7, field594 + var6 + 5);
                    Statics.field24.method6560(var44, field593 + var5, field594 + var6 + var51, var45, 0);
                    class488.method8233(var5, var6, var5 + var7, var6 + var8);
                }
            } else {
                Statics.field24.method6560(var44, field593 + var5, field594 + var6, 16776960, 0);
            }
        }
        method5204(var5, var6);
        ((class229) Statics.field2489).method4218(field632);
        field668 = 0;
        int var52 = (Statics.field1440.field1200 >> 7) + Statics.field218;
        int var53 = (Statics.field1440.field1205 >> 7) + Statics.field1865;
        if (var52 >= 3053 && var52 <= 3156 && var53 >= 3056 && var53 <= 3136) {
            field668 = 1;
        }
        if (var52 >= 3072 && var52 <= 3118 && var53 >= 9492 && var53 <= 9535) {
            field668 = 1;
        }
        if (field668 == 1 && var52 >= 3139 && var52 <= 3199 && var53 >= 3008 && var53 <= 3062) {
            field668 = 0;
        }
        Statics.field4413 = var20;
        Statics.field4280 = var21;
        Statics.field4880 = var22;
        Statics.field3507 = var23;
        Statics.field1400 = var24;
        if (field493) {
            byte var54 = 0;
            int var55 = class341.field4225 + class341.field4203 + var54;
            if (var55 == 0) {
                field493 = false;
            }
        }
        if (field493) {
            class488.method8241(var5, var6, var7, var8, 0);
            method196(class333.field3812, false);
        }
    }

    @ObfuscatedName("nq.iz(IIIIZI)V")
    public static final void method6073(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field545;
        } else if (var5 >= 100) {
            var6 = field745;
        } else {
            var6 = (field745 - field545) * var5 / 100 + field545;
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
                    class488.method8232();
                    class488.method8241(arg0, arg1, var10, arg3, -16777216);
                    class488.method8241(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field751) {
            short var11 = field751;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field748) {
                var6 = field748;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class488.method8232();
                    class488.method8241(arg0, arg1, arg2, var13, -16777216);
                    class488.method8241(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field756 = arg3 * var6 / 334;
        if (field754 != arg2 || field755 != arg3) {
            method422(arg2, arg3);
        }
        field752 = arg0;
        field577 = arg1;
        field754 = arg2;
        field755 = arg3;
    }

    @ObfuscatedName("de.ip(B)V")
    public static void method2157() {
        int var0 = class105.field1342;
        int[] var1 = class105.field1344;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field614 != var1[var2] && field603 != var1[var2]) {
                method4008(field758[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ik.is(Ldh;ZS)V")
    public static void method4008(class90 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2204() || arg0.field1107) {
            return;
        }
        arg0.field1093 = false;
        if ((field486 && class105.field1342 > 50 || class105.field1342 > 200) && arg1 && arg0.field1179 == arg0.field1145) {
            arg0.field1093 = true;
        }
        int var2 = arg0.field1200 >> 7;
        int var3 = arg0.field1205 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class232.method2538(0, 0, 0, false, arg0.field1108);
        if (arg0.field1099 != null && field494 >= arg0.field1094 && field494 < arg0.field1095) {
            arg0.field1093 = false;
            arg0.field1105 = method5746(arg0.field1200, arg0.field1205, Statics.field1812);
            arg0.field1144 = field494;
            Statics.field3.method4045(Statics.field1812, arg0.field1200, arg0.field1205, arg0.field1105, 60, arg0, arg0.field1141, var4, arg0.field1100, arg0.field1101, arg0.field1103, arg0.field1087);
            return;
        }
        if ((arg0.field1200 & 0x7F) == 64 && (arg0.field1205 & 0x7F) == 64) {
            if (field592 == field591[var2][var3]) {
                return;
            }
            field591[var2][var3] = field592;
        }
        arg0.field1105 = method5746(arg0.field1200, arg0.field1205, Statics.field1812);
        arg0.field1144 = field494;
        Statics.field3.method4044(Statics.field1812, arg0.field1200, arg0.field1205, arg0.field1105, 60, arg0, arg0.field1141, var4, arg0.field1142);
    }

    @ObfuscatedName("ku.im(ZI)V")
    public static final void method4819(boolean arg0) {
        for (int var1 = 0; var1 < field538; var1++) {
            class98 var2 = field682[field539[var1]];
            if (var2 != null && var2.method2204() && var2.field1277.field2021 == arg0 && var2.field1277.method3370()) {
                int var3 = var2.field1200 >> 7;
                int var4 = var2.field1205 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1143 == 1 && (var2.field1200 & 0x7F) == 64 && (var2.field1205 & 0x7F) == 64) {
                        if (field592 == field591[var3][var4]) {
                            continue;
                        }
                        field591[var3][var4] = field592;
                    }
                    long var5 = class232.method2538(0, 0, 1, !var2.field1277.field1999, field539[var1]);
                    var2.field1144 = field494;
                    Statics.field3.method4044(Statics.field1812, var2.field1200, var2.field1205, method5746(var2.field1200 + (var2.field1143 * 64 - 64), var2.field1205 + (var2.field1143 * 64 - 64), Statics.field1812), var2.field1143 * 64 - 64 + 60, var2, var2.field1141, var5, var2.field1142);
                }
            }
        }
    }

    @ObfuscatedName("ax.ij(B)V")
    public static final void method93() {
        for (class75 var0 = (class75) field617.method6089(); var0 != null; var0 = (class75) field617.method6098()) {
            if (Statics.field1812 != var0.field930 || field494 > var0.field936) {
                var0.method7335();
            } else if (field494 >= var0.field952) {
                if (var0.field939 > 0) {
                    class98 var1 = field682[var0.field939 - 1];
                    if (var1 != null && var1.field1200 >= 0 && var1.field1200 < 13312 && var1.field1205 >= 0 && var1.field1205 < 13312) {
                        var0.method2014(var1.field1200, var1.field1205, method5746(var1.field1200, var1.field1205, var0.field930) - var0.field934, field494);
                    }
                }
                if (var0.field939 < 0) {
                    int var2 = -var0.field939 - 1;
                    class90 var3;
                    if (field603 == var2) {
                        var3 = Statics.field1440;
                    } else {
                        var3 = field758[var2];
                    }
                    if (var3 != null && var3.field1200 >= 0 && var3.field1200 < 13312 && var3.field1205 >= 0 && var3.field1205 < 13312) {
                        var0.method2014(var3.field1200, var3.field1205, method5746(var3.field1200, var3.field1205, var0.field930) - var0.field934, field494);
                    }
                }
                var0.method2016(field632);
                Statics.field3.method4044(Statics.field1812, (int) var0.field955, (int) var0.field942, (int) var0.field943, 60, var0, var0.field946, -1L, false);
            }
        }
    }

    @ObfuscatedName("fo.iu(I)I")
    public static final int method2954() {
        if (Statics.field2929.method2344()) {
            return Statics.field1812;
        }
        int var0 = 3;
        if (Statics.field3507 < 310) {
            int var1;
            int var2;
            if (field569 == 1) {
                var1 = Statics.field474 >> 7;
                var2 = Statics.field247 >> 7;
            } else {
                var1 = Statics.field1440.field1200 >> 7;
                var2 = Statics.field1440.field1205 >> 7;
            }
            int var3 = Statics.field4413 >> 7;
            int var4 = Statics.field4880 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field1812;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1812;
            }
            if ((class80.field994[Statics.field1812][var3][var4] & 0x4) != 0) {
                var0 = Statics.field1812;
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
                    if ((class80.field994[Statics.field1812][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1812;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class80.field994[Statics.field1812][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1812;
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
                    if ((class80.field994[Statics.field1812][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1812;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class80.field994[Statics.field1812][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1812;
                        }
                    }
                }
            }
        }
        if (Statics.field1440.field1200 >= 0 && Statics.field1440.field1205 >= 0 && Statics.field1440.field1200 < 13312 && Statics.field1440.field1205 < 13312) {
            if ((class80.field994[Statics.field1812][Statics.field1440.field1200 >> 7][Statics.field1440.field1205 >> 7] & 0x4) != 0) {
                var0 = Statics.field1812;
            }
            return var0;
        } else {
            return Statics.field1812;
        }
    }

    @ObfuscatedName("lt.ib(III)V")
    public static final void method5204(int arg0, int arg1) {
        if (field492 == 2) {
            method6019((field504 - Statics.field218 << 7) + field507, (field505 - Statics.field1865 << 7) + field670, field506 * 2);
            if (field593 > -1 && field494 % 20 < 10) {
                Statics.field1963[0].method8403(field593 + arg0 - 12, field594 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("fk.ii(B)Lnj;")
    public static class359 method2956() {
        return field690;
    }

    @ObfuscatedName("eh.ig(I)V")
    public static void method2789() {
        for (class208 var0 = (class208) field693.method6089(); var0 != null; var0 = (class208) field693.method6098()) {
            var0.method7335();
        }
    }

    @ObfuscatedName("ae.id(Lht;I)V")
    public static void method195(class208 arg0) {
        if (arg0 == null || arg0.field2285 == null) {
            return;
        }
        if (arg0.field2285.field3524 >= 0) {
            class313 var1 = class313.method4802(arg0.field2285.field3531);
            if (var1 == null || var1.field3662 == null || var1.field3662.length == 0 || arg0.field2285.field3524 >= var1.field3662.length || var1.field3662[arg0.field2285.field3524] != arg0.field2285) {
                return;
            }
        }
        if (arg0.field2285.field3528 == 11 && arg0.field2286 == 0) {
            if (arg0.field2285.method5638(arg0.field2282, arg0.field2283, 0, 0)) {
                switch(arg0.field2285.method5559()) {
                    case 0:
                        class32.method367(arg0.field2285.method5561(), true, false);
                        break;
                    case 1:
                        if (class314.method2728(method3468(arg0.field2285))) {
                            int[] var2 = arg0.field2285.method5562();
                            if (var2 != null) {
                                class285 var3 = class285.method2741(class283.field3107, field734.field1380);
                                var3.field3169.method7954(var2[1]);
                                var3.field3169.method7957(var2[0]);
                                var3.field3169.method7957(arg0.field2285.field3526);
                                var3.field3169.method7955(var2[2]);
                                var3.field3169.method7955(arg0.field2285.method5569());
                                var3.field3169.method7887(arg0.field2285.field3524);
                                field734.method2635(var3);
                            }
                        }
                }
            }
        } else if (arg0.field2285.field3528 == 12) {
            class311 var4 = arg0.field2285.method5566();
            if (var4 != null && var4.method5381()) {
                switch(arg0.field2286) {
                    case 0:
                        field714.method3729(arg0.field2285);
                        var4.method5339(true);
                        var4.method5304(arg0.field2282, arg0.field2283, field713.method3741(82), field713.method3741(81));
                        break;
                    case 1:
                        var4.method5305(arg0.field2282, arg0.field2283);
                }
            }
        }
    }

    @ObfuscatedName("ij.ih(B)Z")
    public static boolean method3807() {
        return (field496 & 0x2) != 0;
    }

    @ObfuscatedName("pq.ik(I)Z")
    public static boolean method6854() {
        return (field496 & 0x8) != 0;
    }

    @ObfuscatedName("bb.in(Ldh;B)Z")
    public static boolean method822(class90 arg0) {
        if (field496 == 0) {
            return false;
        } else if (Statics.field1440 == arg0) {
            return method6854();
        } else {
            boolean var1 = (field496 & 0x4) != 0;
            boolean var2 = var1;
            if (!var1) {
                boolean var3 = (field496 & 0x1) != 0;
                var2 = var3 && arg0.method2190();
            }
            return var2 || method3807() && arg0.method2193();
        }
    }

    @ObfuscatedName("dp.ir(Ldq;IIIIII)V")
    public static final void method2132(class93 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2204()) {
            return;
        }
        if (arg0 instanceof class98) {
            class193 var6 = ((class98) arg0).field1277;
            if (var6.field2032 != null) {
                var6 = var6.method3355();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class105.field1342;
        int[] var8 = class105.field1344;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1199 != null && (!var9 || !arg0.field1162 && (field694 == 4 || !arg0.field1161 && (field694 == 0 || field694 == 3 || field694 == 1 && ((class90) arg0).method2190())))) {
            method2246(arg0, arg0.field1178);
            if (field593 > -1 && field743 < field582) {
                field645[field743] = Statics.field24.method6551(arg0.field1199) / 2;
                field585[field743] = Statics.field24.field4389;
                field662[field743] = field593;
                field584[field743] = field594 - var10;
                field587[field743] = arg0.field1164;
                field588[field743] = arg0.field1157;
                field589[field743] = arg0.field1175;
                field590[field743] = arg0.field1199;
                field743++;
                var10 += 12;
            }
        }
        if (!arg0.field1172.method6145()) {
            method2246(arg0, arg0.field1178 + 15);
            for (class97 var11 = (class97) arg0.field1172.method6141(); var11 != null; var11 = (class97) arg0.field1172.method6147()) {
                class94 var12 = var11.method2426(field494);
                if (var12 != null) {
                    class188 var13 = var11.field1269;
                    class492 var14 = var13.method3323();
                    class492 var15 = var13.method3316();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field1957;
                    } else {
                        if (var13.field1958 * 2 < var15.field5006) {
                            var16 = var13.field1958;
                        }
                        var17 = var15.field5006 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field494 - var12.field1219;
                    int var21 = var12.field1227 * var17 / var13.field1957;
                    int var24;
                    if (var12.field1223 > var20) {
                        int var22 = var13.field1943 == 0 ? 0 : var20 / var13.field1943 * var13.field1943;
                        int var23 = var12.field1221 * var17 / var13.field1957;
                        var24 = (var21 - var23) * var22 / var12.field1223 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field1223 + var13.field1956 - var20;
                        if (var13.field1952 >= 0) {
                            var18 = (var25 << 8) / (var13.field1956 - var13.field1952);
                        }
                    }
                    if (var12.field1227 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    if (var14 == null || var15 == null) {
                        var10 += 5;
                        if (field593 > -1) {
                            int var31 = field593 + arg2 - (var17 >> 1);
                            int var32 = field594 + arg3 - var10;
                            class488.method8241(var31, var32, var24, 5, 65280);
                            class488.method8241(var24 + var31, var32, var17 - var24, 5, 16711680);
                        }
                        var10 += 2;
                    } else {
                        int var26;
                        if (var17 == var24) {
                            var26 = var16 * 2 + var24;
                        } else {
                            var26 = var16 + var24;
                        }
                        int var27 = var14.field4996;
                        var10 += var27;
                        int var28 = field593 + arg2 - (var17 >> 1);
                        int var29 = field594 + arg3 - var10;
                        int var30 = var28 - var16;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method8331(var30, var29, var18);
                            class488.method8260(var30, var29, var26 + var30, var27 + var29);
                            var15.method8331(var30, var29, var18);
                        } else {
                            var14.method8403(var30, var29);
                            class488.method8260(var30, var29, var26 + var30, var27 + var29);
                            var15.method8403(var30, var29);
                        }
                        class488.method8233(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var11.method2427()) {
                    var11.method7335();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field494 == arg0.field1144 && method822((class90) arg0)) {
            class90 var33 = (class90) arg0;
            if (var9) {
                method2246(arg0, arg0.field1178 + 15);
                class379 var34 = (class379) field546.get(class451.field4795);
                var10 += 4;
                var34.method6560(var33.field1104.method8490(), field593 + arg2, field594 + arg3 - var10, 16777215, 0);
                var10 += 18;
            }
        }
        if (var9) {
            class90 var35 = (class90) arg0;
            if (var35.field1107) {
                return;
            }
            if (var35.field1088 != -1 || var35.field1089 != -1) {
                method2246(arg0, arg0.field1178 + 15);
                if (field593 > -1) {
                    if (var35.field1088 != -1) {
                        var10 += 25;
                        Statics.field3685[var35.field1088].method8403(field593 + arg2 - 12, field594 + arg3 - var10);
                    }
                    if (var35.field1089 != -1) {
                        var10 += 25;
                        Statics.field3293[var35.field1089].method8403(field593 + arg2 - 12, field594 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field492 == 10 && field503 == var8[arg1]) {
                method2246(arg0, arg0.field1178 + 15);
                if (field593 > -1) {
                    int var36 = Statics.field1963[1].field4996 + var10;
                    Statics.field1963[1].method8403(field593 + arg2 - 12, field594 + arg3 - var36);
                }
            }
        } else {
            class98 var37 = (class98) arg0;
            int[] var38 = var37.method2443();
            short[] var39 = var37.method2444();
            if (var39 != null && var38 != null) {
                for (int var40 = 0; var40 < var39.length; var40++) {
                    if (var39[var40] >= 0 && var38[var40] >= 0) {
                        long var41 = (long) var38[var40] << 8 | (long) var39[var40];
                        class492 var43 = (class492) field763.method6813(var41);
                        if (var43 == null) {
                            class492[] var44 = class493.method1952(Statics.field1639, var38[var40], 0);
                            if (var44 != null && var39[var40] < var44.length) {
                                var43 = var44[var39[var40]];
                                field763.method6826(var41, var43);
                            }
                        }
                        if (var43 != null) {
                            method2246(arg0, arg0.field1178 + 15);
                            if (field593 > -1) {
                                var43.method8403(field593 + arg2 - (var43.field5006 >> 1), field594 + (arg3 - var43.field4996) - 4);
                            }
                        }
                    }
                }
            }
            if (field492 == 1 && field718 == field539[arg1 - var7] && field494 % 20 < 10) {
                method2246(arg0, arg0.field1178 + 15);
                if (field593 > -1) {
                    Statics.field1963[0].method8403(field593 + arg2 - 12, field594 + arg3 - 28);
                }
            }
        }
        for (int var45 = 0; var45 < 4; var45++) {
            int var46 = arg0.field1169[var45];
            int var47 = arg0.field1139[var45];
            class202 var48 = null;
            int var49 = 0;
            if (var47 >= 0) {
                if (var46 <= field494) {
                    continue;
                }
                var48 = class202.method3347(arg0.field1139[var45]);
                var49 = var48.field2108;
                if (var48 != null && var48.field2119 != null) {
                    var48 = var48.method3504();
                    if (var48 == null) {
                        arg0.field1169[var45] = -1;
                        continue;
                    }
                }
            } else if (var46 < 0) {
                continue;
            }
            int var50 = arg0.field1170[var45];
            class202 var51 = null;
            if (var50 >= 0) {
                var51 = class202.method3347(var50);
                if (var51 != null && var51.field2119 != null) {
                    var51 = var51.method3504();
                }
            }
            if (var46 - var49 <= field494) {
                if (var48 == null) {
                    arg0.field1169[var45] = -1;
                } else {
                    method2246(arg0, arg0.field1178 / 2);
                    if (field593 > -1) {
                        boolean var52 = true;
                        if (var45 == 1) {
                            field594 -= 20;
                        }
                        if (var45 == 2) {
                            field593 -= 15;
                            field594 -= 10;
                        }
                        if (var45 == 3) {
                            field593 += 15;
                            field594 -= 10;
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
                        class492 var65 = null;
                        class492 var66 = null;
                        class492 var67 = null;
                        class492 var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        class492 var78 = var48.method3533();
                        if (var78 != null) {
                            var57 = var78.field5006;
                            int var79 = var78.field4996;
                            if (var79 > var77) {
                                var77 = var79;
                            }
                            var61 = var78.field4998;
                        }
                        class492 var80 = var48.method3513();
                        if (var80 != null) {
                            var58 = var80.field5006;
                            int var81 = var80.field4996;
                            if (var81 > var77) {
                                var77 = var81;
                            }
                            var62 = var80.field4998;
                        }
                        class492 var82 = var48.method3508();
                        if (var82 != null) {
                            var59 = var82.field5006;
                            int var83 = var82.field4996;
                            if (var83 > var77) {
                                var77 = var83;
                            }
                            var63 = var82.field4998;
                        }
                        class492 var84 = var48.method3509();
                        if (var84 != null) {
                            var60 = var84.field5006;
                            int var85 = var84.field4996;
                            if (var85 > var77) {
                                var77 = var85;
                            }
                            var64 = var84.field4998;
                        }
                        if (var51 != null) {
                            var65 = var51.method3533();
                            if (var65 != null) {
                                var69 = var65.field5006;
                                int var86 = var65.field4996;
                                if (var86 > var77) {
                                    var77 = var86;
                                }
                                var73 = var65.field4998;
                            }
                            var66 = var51.method3513();
                            if (var66 != null) {
                                var70 = var66.field5006;
                                int var87 = var66.field4996;
                                if (var87 > var77) {
                                    var77 = var87;
                                }
                                var74 = var66.field4998;
                            }
                            var67 = var51.method3508();
                            if (var67 != null) {
                                var71 = var67.field5006;
                                int var88 = var67.field4996;
                                if (var88 > var77) {
                                    var77 = var88;
                                }
                                var75 = var67.field4998;
                            }
                            var68 = var51.method3509();
                            if (var68 != null) {
                                var72 = var68.field5006;
                                int var89 = var68.field4996;
                                if (var89 > var77) {
                                    var77 = var89;
                                }
                                var76 = var68.field4998;
                            }
                        }
                        class375 var90 = var48.method3510();
                        if (var90 == null) {
                            var90 = Statics.field3693;
                        }
                        class375 var91;
                        if (var51 == null) {
                            var91 = Statics.field3693;
                        } else {
                            var91 = var51.method3510();
                            if (var91 == null) {
                                var91 = Statics.field3693;
                            }
                        }
                        Object var92 = null;
                        String var93 = null;
                        boolean var94 = false;
                        int var95 = 0;
                        String var96 = var48.method3511(arg0.field1168[var45]);
                        int var97 = var90.method6551(var96);
                        if (var51 != null) {
                            var93 = var51.method3511(arg0.field1217[var45]);
                            var95 = var91.method6551(var93);
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
                        int var114 = arg0.field1169[var45] - field494;
                        int var115 = var48.field2113 - var48.field2113 * var114 / var48.field2108;
                        int var116 = var48.field2123 * var114 / var48.field2108 + -var48.field2123;
                        int var117 = field593 + arg2 - (var106 >> 1) + var115;
                        int var118 = field594 + arg3 - 12 + var116;
                        int var119 = var118;
                        int var120 = var77 + var118;
                        int var121 = var48.field2107 + var118 + 15;
                        int var122 = var121 - var90.field4395;
                        int var123 = var90.field4391 + var121;
                        if (var122 < var118) {
                            var119 = var122;
                        }
                        if (var123 > var120) {
                            var120 = var123;
                        }
                        int var124 = 0;
                        if (var51 != null) {
                            var124 = var51.field2107 + var118 + 15;
                            int var125 = var124 - var91.field4395;
                            int var126 = var91.field4391 + var124;
                            if (var125 < var119) {
                                ;
                            }
                            if (var126 > var120) {
                                ;
                            }
                        }
                        int var129 = 255;
                        if (var48.field2115 >= 0) {
                            var129 = (var114 << 8) / (var48.field2108 - var48.field2115);
                        }
                        if (var129 >= 0 && var129 < 255) {
                            if (var78 != null) {
                                var78.method8331(var101 + var117 - var61, var118, var129);
                            }
                            if (var82 != null) {
                                var82.method8331(var102 + var117 - var63, var118, var129);
                            }
                            if (var80 != null) {
                                for (int var130 = 0; var130 < var98; var130++) {
                                    var80.method8331(var58 * var130 + (var103 + var117 - var62), var118, var129);
                                }
                            }
                            if (var84 != null) {
                                var84.method8331(var107 + var117 - var64, var118, var129);
                            }
                            var90.method6558(var96, var104 + var117, var121, var48.field2100, 0, var129);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method8331(var108 + var117 - var73, var118, var129);
                                }
                                if (var67 != null) {
                                    var67.method8331(var109 + var117 - var75, var118, var129);
                                }
                                if (var66 != null) {
                                    for (int var131 = 0; var131 < var99; var131++) {
                                        var66.method8331(var70 * var131 + (var110 + var117 - var74), var118, var129);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method8331(var111 + var117 - var76, var118, var129);
                                }
                                var91.method6558(var93, var112 + var117, var124, var51.field2100, 0, var129);
                            }
                        } else {
                            if (var78 != null) {
                                var78.method8403(var101 + var117 - var61, var118);
                            }
                            if (var82 != null) {
                                var82.method8403(var102 + var117 - var63, var118);
                            }
                            if (var80 != null) {
                                for (int var132 = 0; var132 < var98; var132++) {
                                    var80.method8403(var58 * var132 + (var103 + var117 - var62), var118);
                                }
                            }
                            if (var84 != null) {
                                var84.method8403(var107 + var117 - var64, var118);
                            }
                            var90.method6578(var96, var104 + var117, var121, var48.field2100 | 0xFF000000, 0);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method8403(var108 + var117 - var73, var118);
                                }
                                if (var67 != null) {
                                    var67.method8403(var109 + var117 - var75, var118);
                                }
                                if (var66 != null) {
                                    for (int var133 = 0; var133 < var99; var133++) {
                                        var66.method8403(var70 * var133 + (var110 + var117 - var74), var118);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method8403(var111 + var117 - var76, var118);
                                }
                                var91.method6578(var93, var112 + var117, var124, var51.field2100 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("da.ie(Ldq;IB)V")
    public static final void method2246(class93 arg0, int arg1) {
        method6019(arg0.field1200, arg0.field1205, arg1);
    }

    @ObfuscatedName("no.iq(IIIB)V")
    public static final void method6019(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field593 = -1;
            field594 = -1;
            return;
        }
        int var3 = method5746(arg0, arg1, Statics.field1812) - arg2;
        int var4 = arg0 - Statics.field4413;
        int var5 = var3 - Statics.field4280;
        int var6 = arg1 - Statics.field4880;
        int var7 = class220.field2482[Statics.field3507];
        int var8 = class220.field2470[Statics.field3507];
        int var9 = class220.field2482[Statics.field1400];
        int var10 = class220.field2470[Statics.field1400];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field593 = field756 * var11 / var15 + field754 / 2;
            field594 = field756 * var14 / var15 + field755 / 2;
        } else {
            field593 = -1;
            field594 = -1;
        }
    }

    @ObfuscatedName("ms.if(IIII)I")
    public static final int method5746(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class80.field994[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class80.field1000[var5][var3][var4] + class80.field1000[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class80.field1000[var5][var3][var4 + 1] + class80.field1000[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("io.iw(IIB)I")
    public static int method4207(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field747 - field583) * var2 / 100 + field583;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("pg.io(IIIIIIII)V")
    public static final void method7086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method4207(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class220.field2482[var8];
            int var14 = class220.field2470[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class220.field2482[var9];
            int var17 = class220.field2470[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        if (field737) {
            Statics.field4334 = arg0 - var10;
            Statics.field3433 = arg1 - var11;
            Statics.field3450 = arg2 - var12;
            Statics.field2964 = arg3;
            Statics.field155 = arg4;
        } else {
            Statics.field4413 = arg0 - var10;
            Statics.field4280 = arg1 - var11;
            Statics.field4880 = arg2 - var12;
            Statics.field3507 = arg3;
            Statics.field1400 = arg4;
        }
        if (field569 == 1 && field655 >= 2 && field494 % 50 == 0 && (Statics.field474 >> 7 != Statics.field1440.field1200 >> 7 || Statics.field247 >> 7 != Statics.field1440.field1205 >> 7)) {
            int var19 = Statics.field1440.field1102;
            int var20 = (Statics.field474 >> 7) + Statics.field218;
            int var21 = (Statics.field247 >> 7) + Statics.field1865;
            method3087(var20, var21, var19, true);
        }
    }

    @ObfuscatedName("in.ia(ZLsq;I)V")
    public static final void method4030(boolean arg0, class477 arg1) {
        field553 = arg0;
        if (!field553) {
            int var2 = arg1.method7946();
            int var3 = arg1.method8115();
            int var4 = arg1.method7905();
            Statics.field2758 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2758[var5][var6] = arg1.method7908();
                }
            }
            Statics.field59 = new int[var4];
            Statics.field4898 = new int[var4];
            Statics.field1464 = new int[var4];
            Statics.field475 = new byte[var4][];
            Statics.field4358 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field59[var7] = var10;
                    Statics.field4898[var7] = Statics.field1266.method5875("m" + var8 + "_" + var9);
                    Statics.field1464[var7] = Statics.field1266.method5875("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method5224(var2, var3, true);
            return;
        }
        int var11 = arg1.method7946();
        boolean var12 = arg1.method7934() == 1;
        int var13 = arg1.method8115();
        int var14 = arg1.method7905();
        arg1.method7847();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method7853(1);
                    if (var18 == 1) {
                        field581[var15][var16][var17] = arg1.method7853(26);
                    } else {
                        field581[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method7866();
        Statics.field2758 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field2758[var19][var20] = arg1.method7908();
            }
        }
        Statics.field59 = new int[var14];
        Statics.field4898 = new int[var14];
        Statics.field1464 = new int[var14];
        Statics.field475 = new byte[var14][];
        Statics.field4358 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field581[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field59[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field59[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field4898[var21] = Statics.field1266.method5875("m" + var30 + "_" + var31);
                            Statics.field1464[var21] = Statics.field1266.method5875("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method5224(var11, var13, !var12);
    }

    @ObfuscatedName("lt.il(IIZS)V")
    public static final void method5224(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1472 == arg0 && Statics.field4162 == arg1) {
            return;
        }
        Statics.field1472 = arg0;
        Statics.field4162 = arg1;
        method274(25);
        method196(class333.field3812, true);
        int var3 = Statics.field218;
        int var4 = Statics.field1865;
        Statics.field218 = (arg0 - 6) * 8;
        Statics.field1865 = (arg1 - 6) * 8;
        int var5 = Statics.field218 - var3;
        int var6 = Statics.field1865 - var4;
        int var7 = Statics.field218;
        int var8 = Statics.field1865;
        for (int var9 = 0; var9 < 65536; var9++) {
            class98 var10 = field682[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1212[var11] -= var5;
                    var10.field1171[var11] -= var6;
                }
                var10.field1200 -= var5 * 128;
                var10.field1205 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class90 var13 = field758[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1212[var14] -= var5;
                    var13.field1171[var14] -= var6;
                }
                var13.field1200 -= var5 * 128;
                var13.field1205 -= var6 * 128;
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
                        field615[var25][var21][var22] = field615[var25][var23][var24];
                    } else {
                        field615[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class92 var26 = (class92) field548.method6089(); var26 != null; var26 = (class92) field548.method6098()) {
            var26.field1126 -= var5;
            var26.field1138 -= var6;
            if (var26.field1126 < 0 || var26.field1138 < 0 || var26.field1126 >= 104 || var26.field1138 >= 104) {
                var26.method7335();
            }
        }
        if (field726 != 0) {
            field726 -= var5;
            field727 -= var6;
        }
        field731 = 0;
        field737 = false;
        Statics.field4413 -= var5 << 7;
        Statics.field4880 -= var6 << 7;
        Statics.field474 -= var5 << 7;
        Statics.field247 -= var6 << 7;
        field721 = -1;
        field618.method6118();
        field617.method6118();
        for (int var27 = 0; var27 < 4; var27++) {
            field616[var27].method3767();
        }
    }

    @ObfuscatedName("jc.ix(ZI)V")
    public static final void method4395(boolean arg0) {
        method3345();
        field734.field1387++;
        if (field734.field1387 < 50 && !arg0) {
            return;
        }
        field734.field1387 = 0;
        if (field544 || field734.method2639() == null) {
            return;
        }
        class285 var1 = class285.method2741(class283.field3093, field734.field1380);
        field734.method2635(var1);
        try {
            field734.method2634();
        } catch (IOException var3) {
            field544 = true;
        }
    }

    @ObfuscatedName("bp.iv(I)V")
    public static final void method803() {
        method4395(false);
        field628 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field475.length; var1++) {
            if (Statics.field4898[var1] != -1 && Statics.field475[var1] == null) {
                Statics.field475[var1] = Statics.field1266.method5860(Statics.field4898[var1], 0);
                if (Statics.field475[var1] == null) {
                    var0 = false;
                    field628++;
                }
            }
            if (Statics.field1464[var1] != -1 && Statics.field4358[var1] == null) {
                Statics.field4358[var1] = Statics.field1266.method5861(Statics.field1464[var1], 0, Statics.field2758[var1]);
                if (Statics.field4358[var1] == null) {
                    var0 = false;
                    field628++;
                }
            }
        }
        if (!var0) {
            field502 = 1;
            return;
        }
        field549 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field475.length; var3++) {
            byte[] var4 = Statics.field4358[var3];
            if (var4 != null) {
                int var5 = (Statics.field59[var3] >> 8) * 64 - Statics.field218;
                int var6 = (Statics.field59[var3] & 0xFF) * 64 - Statics.field1865;
                if (field553) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class80.method2973(var4, var5, var6);
            }
        }
        if (!var2) {
            field502 = 2;
            return;
        }
        if (field502 != 0) {
            method196(class333.field3812 + class99.field1287 + class99.field1290 + 100 + "%" + class99.field1291, true);
        }
        method3345();
        Statics.field3.method4041();
        for (int var7 = 0; var7 < 4; var7++) {
            field616[var7].method3767();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class80.field994[var8][var9][var10] = 0;
                }
            }
        }
        method3345();
        class80.method103();
        int var11 = Statics.field475.length;
        class67.method6752();
        method4395(true);
        if (!field553) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field59[var12] >> 8) * 64 - Statics.field218;
                int var14 = (Statics.field59[var12] & 0xFF) * 64 - Statics.field1865;
                byte[] var15 = Statics.field475[var12];
                if (var15 != null) {
                    method3345();
                    class80.method1052(var15, var13, var14, Statics.field1472 * 8 - 48, Statics.field4162 * 8 - 48, field616);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field59[var16] >> 8) * 64 - Statics.field218;
                int var18 = (Statics.field59[var16] & 0xFF) * 64 - Statics.field1865;
                byte[] var19 = Statics.field475[var16];
                if (var19 == null && Statics.field4162 < 800) {
                    method3345();
                    class80.method6050(var17, var18, 64, 64);
                }
            }
            method4395(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field4358[var20];
                if (var21 != null) {
                    int var22 = (Statics.field59[var20] >> 8) * 64 - Statics.field218;
                    int var23 = (Statics.field59[var20] & 0xFF) * 64 - Statics.field1865;
                    method3345();
                    class80.method4780(var21, var22, var23, Statics.field3, field616);
                }
            }
        }
        if (field553) {
            for (int var24 = 0; var24 < 4; var24++) {
                method3345();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field581[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field59.length; var34++) {
                                if (Statics.field59[var34] == var33 && Statics.field475[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class80.method4006(Statics.field475[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field616);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class80.method1958(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field581[0][var37][var38];
                    if (var39 == -1) {
                        class80.method6050(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method4395(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method3345();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field581[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field59.length; var49++) {
                                if (Statics.field59[var49] == var48 && Statics.field4358[var49] != null) {
                                    class80.method2063(Statics.field4358[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field3, field616);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method4395(true);
        method3345();
        class80.method2721(Statics.field3, field616);
        method4395(true);
        int var50 = class80.field995;
        if (var50 > Statics.field1812) {
            var50 = Statics.field1812;
        }
        if (var50 < Statics.field1812 - 1) {
            int var51 = Statics.field1812 - 1;
        }
        if (field486) {
            Statics.field3.method4034(class80.field995);
        } else {
            Statics.field3.method4034(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method2966(var52, var53);
            }
        }
        method3345();
        method2713();
        class203.field2128.method4930();
        if (Statics.field4480.method598()) {
            class285 var54 = class285.method2741(class283.field3150, field734.field1380);
            var54.field3169.method7957(1057001181);
            field734.method2635(var54);
        }
        if (!field553) {
            int var55 = (Statics.field1472 - 6) / 8;
            int var56 = (Statics.field1472 + 6) / 8;
            int var57 = (Statics.field4162 - 6) / 8;
            int var58 = (Statics.field4162 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field1266.method5881("m" + var59 + "_" + var60);
                        Statics.field1266.method5881("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method274(30);
        method3345();
        class80.method669();
        class285 var61 = class285.method2741(class283.field3059, field734.field1380);
        field734.method2635(var61);
        class35.method5785();
    }

    @ObfuscatedName("ae.iy(IIIIII)V")
    public static final void method204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3.method4059(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3.method4054(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class232.method1054(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field1960.field4997;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class232.method4938(var5);
            class203 var14 = Statics.method4396(var13);
            if (var14.field2154 == -1) {
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
                class491 var15 = Statics.field1249[var14.field2154];
                if (var15 != null) {
                    int var16 = (var14.field2174 * 4 - var15.field4992) / 2;
                    int var17 = (var14.field2141 * 4 - var15.field4987) / 2;
                    var15.method8308(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field2141) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field3.method4112(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field3.method4054(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class232.method4938(var18);
            class203 var24 = Statics.method4396(var23);
            if (var24.field2154 != -1) {
                class491 var25 = Statics.field1249[var24.field2154];
                if (var25 != null) {
                    int var26 = (var24.field2174 * 4 - var25.field4992) / 2;
                    int var27 = (var24.field2141 * 4 - var25.field4987) / 2;
                    var25.method8308(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field2141) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class232.method1054(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field1960.field4997;
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
        long var31 = Statics.field3.method4062(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class232.method4938(var31);
        class203 var34 = Statics.method4396(var33);
        if (var34.field2154 == -1) {
            return;
        }
        class491 var35 = Statics.field1249[var34.field2154];
        if (var35 != null) {
            int var36 = (var34.field2174 * 4 - var35.field4992) / 2;
            int var37 = (var34.field2141 * 4 - var35.field4987) / 2;
            var35.method8308(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field2141) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.it(Lep;II)Z")
    public boolean method1164(class109 arg0, int arg1) {
        if (arg0.field1385 == 0) {
            Statics.field251 = null;
        } else {
            if (Statics.field251 == null) {
                Statics.field251 = new class400(Statics.field2619, Statics.field4480);
            }
            Statics.field251.method6864(arg0.field1383, arg1);
        }
        method439();
        arg0.field1382 = null;
        return true;
    }

    @ObfuscatedName("client.ju(Lep;S)Z")
    public boolean method1165(class109 arg0) {
        if (Statics.field251 != null) {
            Statics.field251.method6865(arg0.field1383);
        }
        method439();
        arg0.field1382 = null;
        return true;
    }

    @ObfuscatedName("client.jc(Lep;I)Z")
    public final boolean method1559(class109 arg0) {
        class410 var2 = arg0.method2639();
        class477 var3 = arg0.field1383;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1382 == null) {
                if (arg0.field1386) {
                    if (!var2.method7035(1)) {
                        return false;
                    }
                    var2.method7038(arg0.field1383.field4906, 0, 1);
                    arg0.field1384 = 0;
                    arg0.field1386 = false;
                }
                var3.field4904 = 0;
                if (var3.method7849()) {
                    if (!var2.method7035(1)) {
                        return false;
                    }
                    var2.method7038(arg0.field1383.field4906, 1, 1);
                    arg0.field1384 = 0;
                }
                arg0.field1386 = true;
                class286[] var4 = class286.method4791();
                int var5 = var3.method7850();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4904);
                }
                arg0.field1382 = var4[var5];
                arg0.field1385 = arg0.field1382.field3284;
            }
            if (arg0.field1385 == -1) {
                if (!var2.method7035(1)) {
                    return false;
                }
                arg0.method2639().method7038(var3.field4906, 0, 1);
                arg0.field1385 = var3.field4906[0] & 0xFF;
            }
            if (arg0.field1385 == -2) {
                if (!var2.method7035(2)) {
                    return false;
                }
                arg0.method2639().method7038(var3.field4906, 0, 2);
                var3.field4904 = 0;
                arg0.field1385 = var3.method7905();
            }
            if (!var2.method7035(arg0.field1385)) {
                return false;
            }
            var3.field4904 = 0;
            var2.method7038(var3.field4906, 0, arg0.field1385);
            arg0.field1384 = 0;
            field514.method6735();
            arg0.field1391 = arg0.field1390;
            arg0.field1390 = arg0.field1389;
            arg0.field1389 = arg0.field1382;
            if (class286.field3192 == arg0.field1382) {
                method2972(class284.field3157);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3202 == arg0.field1382) {
                method5969();
                field654 = var3.method7882();
                field687 = field671;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3182 == arg0.field1382) {
                method2972(class284.field3163);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3177 == arg0.field1382) {
                int var6 = var3.method7900();
                int var7 = var3.method8115();
                class313 var8 = class313.method4802(var6);
                if (var8 != null && var8.field3528 == 0) {
                    if (var7 > var8.field3614 - var8.field3516) {
                        var7 = var8.field3614 - var8.field3516;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    if (var8.field3523 != var7) {
                        var8.field3523 = var7;
                        method1946(var8);
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3262 == arg0.field1382) {
                method2972(class284.field3161);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3259 == arg0.field1382) {
                Statics.field2288 = class497.method3230(var3.method7909());
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3251 == arg0.field1382) {
                field737 = true;
                field738 = false;
                Statics.field8 = var3.method7909();
                Statics.field2938 = var3.method7909();
                Statics.field3034 = var3.method7905();
                Statics.field105 = var3.method7909();
                Statics.field3677 = var3.method7909();
                if (Statics.field3677 >= 100) {
                    Statics.field4413 = Statics.field8 * 128 + 64;
                    Statics.field4880 = Statics.field2938 * 128 + 64;
                    Statics.field4280 = method5746(Statics.field4413, Statics.field4880, Statics.field1812) - Statics.field3034;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3276 == arg0.field1382) {
                int var9 = var3.method7905();
                field647 = var9;
                this.method1170(false);
                method1131(var9);
                class68.method4800(field647);
                for (int var10 = 0; var10 < 100; var10++) {
                    field723[var10] = true;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3223 == arg0.field1382) {
                int var11 = var3.method7909();
                method2205(var11);
                arg0.field1382 = null;
                return false;
            }
            if (class286.field3266 == arg0.field1382) {
                field492 = var3.method7909();
                if (field492 == 1) {
                    field718 = var3.method7905();
                }
                if (field492 >= 2 && field492 <= 6) {
                    if (field492 == 2) {
                        field507 = 64;
                        field670 = 64;
                    }
                    if (field492 == 3) {
                        field507 = 0;
                        field670 = 64;
                    }
                    if (field492 == 4) {
                        field507 = 128;
                        field670 = 64;
                    }
                    if (field492 == 5) {
                        field507 = 64;
                        field670 = 0;
                    }
                    if (field492 == 6) {
                        field507 = 64;
                        field670 = 128;
                    }
                    field492 = 2;
                    field504 = var3.method7905();
                    field505 = var3.method7905();
                    field506 = var3.method7909();
                }
                if (field492 == 10) {
                    field503 = var3.method7905();
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3187 == arg0.field1382) {
                int var12 = var3.method7934();
                int var13 = var3.method7944();
                int var14 = var3.method7946();
                if (var14 == 65535) {
                    var14 = -1;
                }
                class98 var15 = field682[var13];
                if (var15 != null) {
                    if (var15.field1183 == var14 && var14 != -1) {
                        int var16 = class206.method5217(var14).field2277;
                        if (var16 == 1) {
                            var15.field1184 = 0;
                            var15.field1194 = 0;
                            var15.field1189 = var12;
                            var15.field1187 = 0;
                        } else if (var16 == 2) {
                            var15.field1187 = 0;
                        }
                    } else if (var14 == -1 || var15.field1183 == -1 || class206.method5217(var14).field2270 >= class206.method5217(var15.field1183).field2270) {
                        var15.field1183 = var14;
                        var15.field1184 = 0;
                        var15.field1194 = 0;
                        var15.field1189 = var12;
                        var15.field1187 = 0;
                        var15.field1216 = var15.field1211;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3265 == arg0.field1382) {
                Statics.field16.method1743(var3, arg0.field1385);
                field702 = field671;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3253 == arg0.field1382) {
                method5969();
                int var17 = var3.method7935();
                int var18 = var3.method7935();
                int var19 = var3.method7900();
                field621[var17] = var19;
                field619[var17] = var18;
                field620[var17] = 1;
                for (int var20 = 0; var20 < 98; var20++) {
                    if (var19 >= class323.field3734[var20]) {
                        field620[var17] = var20 + 2;
                    }
                }
                field676[++field677 - 1 & 0x1F] = var17;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3178 == arg0.field1382) {
                field483 = field671;
                byte var21 = var3.method8163();
                if (arg0.field1385 == 1) {
                    if (var21 >= 0) {
                        field658[var21] = null;
                    } else {
                        Statics.field104 = null;
                    }
                    arg0.field1382 = null;
                    return true;
                }
                if (var21 >= 0) {
                    field658[var21] = new class161(var3);
                } else {
                    Statics.field104 = new class161(var3);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3246 == arg0.field1382) {
                int var22 = var3.method8115();
                int var23 = var3.method7935() * 4;
                int var24 = var3.method7898();
                byte var25 = var3.method7938();
                byte var26 = var3.method7940();
                int var27 = var3.method7907();
                int var28 = var27 >> 16;
                int var29 = var27 >> 8 & 0xFF;
                int var30 = (var27 >> 4 & 0x7) + var28;
                int var31 = (var27 & 0x7) + var29;
                int var32 = var3.method7905();
                int var33 = var3.method7934();
                int var34 = var3.method7909() * 4;
                int var35 = var3.method7952();
                int var36 = var3.method7946();
                int var37 = var25 + var30;
                int var38 = var26 + var31;
                if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104 && var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104 && var32 != 65535) {
                    int var39 = var30 * 128 + 64;
                    int var40 = var31 * 128 + 64;
                    int var41 = var37 * 128 + 64;
                    int var42 = var38 * 128 + 64;
                    class75 var43 = new class75(var32, Statics.field1812, var39, var40, method5746(var39, var40, Statics.field1812) - var23, field494 + var22, field494 + var36, var24, var33, var35, var34);
                    var43.method2014(var41, var42, method5746(var41, var42, Statics.field1812) - var34, field494 + var22);
                    field617.method6111(var43);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3258 == arg0.field1382) {
                for (int var44 = 0; var44 < class303.field3428.length; var44++) {
                    if (class303.field3428[var44] != class303.field3426[var44]) {
                        class303.field3428[var44] = class303.field3426[var44];
                        method3063(var44);
                        field580[++field673 - 1 & 0x1F] = var44;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3255 == arg0.field1382) {
                field726 = var3.method7909();
                if (field726 == 255) {
                    field726 = 0;
                }
                field727 = var3.method7909();
                if (field727 == 255) {
                    field727 = 0;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3278 == arg0.field1382) {
                return this.method1165(arg0);
            }
            if (class286.field3274 == arg0.field1382) {
                int var45 = var3.method7944();
                int var46 = var3.method8008();
                int var47 = var45 >> 10 & 0x1F;
                int var48 = var45 >> 5 & 0x1F;
                int var49 = var45 & 0x1F;
                int var50 = (var49 << 3) + (var47 << 19) + (var48 << 11);
                class313 var51 = class313.method4802(var46);
                if (var51.field3551 != var50) {
                    var51.field3551 = var50;
                    method1946(var51);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3209 == arg0.field1382 && field737) {
                field738 = true;
                Statics.field105 = var3.method7909();
                Statics.field3677 = var3.method7909();
                Statics.field4270 = var3.method7909();
                Statics.field2506 = var3.method7909();
                for (int var52 = 0; var52 < 5; var52++) {
                    field739[var52] = false;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3244 == arg0.field1382) {
                for (int var53 = 0; var53 < Statics.field1891; var53++) {
                    class184 var54 = class184.method620(var53);
                    if (var54 != null) {
                        class303.field3426[var53] = 0;
                        class303.field3428[var53] = 0;
                    }
                }
                method5969();
                field673 += 32;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3242 == arg0.field1382) {
                int var55 = var3.method7946();
                int var56 = var3.method7958();
                class303.field3426[var55] = var56;
                if (class303.field3428[var55] != var56) {
                    class303.field3428[var55] = var56;
                }
                method3063(var55);
                field580[++field673 - 1 & 0x1F] = var55;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3283 == arg0.field1382) {
                int var57 = var3.method7900();
                class313 var58 = class313.method4802(var57);
                var58.field3574 = 3;
                var58.field3571 = Statics.field1440.field1086.method5243();
                method1946(var58);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3245 == arg0.field1382) {
                byte[] var59 = new byte[arg0.field1385];
                var3.method7851(var59, 0, var59.length);
                class478 var60 = new class478(var59);
                String var61 = var60.method7950();
                class32.method367(var61, true, false);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3249 == arg0.field1382) {
                int var62 = var3.method7905();
                int var63 = var3.method7905();
                int var64 = var3.method7958();
                int var65 = var3.method7944();
                class313 var66 = class313.method4802(var64);
                if (var66.field3578 != var62 || var66.field3635 != var65 || var66.field3510 != var63) {
                    var66.field3578 = var62;
                    var66.field3635 = var65;
                    var66.field3510 = var63;
                    method1946(var66);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3219 == arg0.field1382) {
                method4940();
                byte var67 = var3.method8163();
                if (arg0.field1385 == 1) {
                    if (var67 >= 0) {
                        field775[var67] = null;
                    } else {
                        Statics.field3016 = null;
                    }
                    arg0.field1382 = null;
                    return true;
                }
                if (var67 >= 0) {
                    field775[var67] = new class152(var3);
                } else {
                    Statics.field3016 = new class152(var3);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3205 == arg0.field1382) {
                method4937();
                arg0.field1382 = null;
                return false;
            }
            if (class286.field3281 == arg0.field1382) {
                boolean var68 = var3.method7935() == 1;
                int var69 = var3.method7908();
                class313 var70 = class313.method4802(var69);
                if (var70.field3674 != var68) {
                    var70.field3674 = var68;
                    method1946(var70);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3180 == arg0.field1382) {
                method2972(class284.field3165);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3270 == arg0.field1382) {
                int var71 = var3.method8115();
                byte var72 = var3.method8163();
                class303.field3426[var71] = var72;
                if (class303.field3428[var71] != var72) {
                    class303.field3428[var71] = var72;
                }
                method3063(var71);
                field580[++field673 - 1 & 0x1F] = var71;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3229 == arg0.field1382) {
                String var73 = var3.method7950();
                int var74 = var3.method7935();
                int var75 = var3.method7909();
                if (var74 >= 1 && var74 <= 8) {
                    if (var73.equalsIgnoreCase(class333.field3824)) {
                        var73 = null;
                    }
                    field611[var74 - 1] = var73;
                    field612[var74 - 1] = var75 == 0;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3235 == arg0.field1382) {
                int var76 = var3.method7905();
                class83.method6546(var76);
                field534[++field667 - 1 & 0x1F] = var76 & 0x7FFF;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3260 == arg0.field1382) {
                String var77 = var3.method7950();
                long var78 = var3.method7949();
                long var80 = (long) var3.method7905();
                long var82 = (long) var3.method7907();
                class335 var84 = (class335) class354.method5197(class335.method3793(), var3.method7909());
                long var85 = (var80 << 32) + var82;
                boolean var87 = false;
                for (int var88 = 0; var88 < 100; var88++) {
                    if (field711[var88] == var85) {
                        var87 = true;
                        break;
                    }
                }
                if (var84.field4150 && Statics.field16.method1780(new class501(var77, Statics.field2619))) {
                    var87 = true;
                }
                if (!var87 && field668 == 0) {
                    field711[field753] = var85;
                    field753 = (field753 + 1) % 100;
                    String var89 = class379.method6555(class368.method465(class316.method4939(var3)));
                    if (var84.field4148 == -1) {
                        class108.method144(9, var77, var89, class370.method6008(var78));
                    } else {
                        class108.method144(9, class99.method50(var84.field4148) + var77, var89, class370.method6008(var78));
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3261 == arg0.field1382) {
                int var90 = var3.method8115();
                int var91 = var3.method7935();
                int var92 = var3.method7900();
                short var93 = (short) var3.method7960();
                class98 var94 = field682[var90];
                if (var94 != null) {
                    var94.method2445(var91, var92, var93);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3232 == arg0.field1382) {
                String var95 = var3.method7950();
                String var96 = class379.method6555(class368.method465(class316.method4939(var3)));
                class108.method5191(6, var95, var96);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3267 == arg0.field1382) {
                method4030(false, arg0.field1383);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3247 == arg0.field1382) {
                byte var97 = var3.method8163();
                String var98 = var3.method7950();
                long var99 = (long) var3.method7905();
                long var101 = (long) var3.method7907();
                class335 var103 = (class335) class354.method5197(class335.method3793(), var3.method7909());
                long var104 = (var99 << 32) + var101;
                boolean var106 = false;
                Object var107 = null;
                class161 var108 = var97 >= 0 ? field658[var97] : Statics.field104;
                if (var108 == null) {
                    var106 = true;
                } else {
                    int var109 = 0;
                    while (true) {
                        if (var109 >= 100) {
                            if (var103.field4150 && Statics.field16.method1780(new class501(var98, Statics.field2619))) {
                                var106 = true;
                            }
                            break;
                        }
                        if (field711[var109] == var104) {
                            var106 = true;
                            break;
                        }
                        var109++;
                    }
                }
                if (!var106) {
                    field711[field753] = var104;
                    field753 = (field753 + 1) % 100;
                    String var110 = class379.method6555(class316.method4939(var3));
                    int var111 = var97 >= 0 ? 41 : 44;
                    if (var103.field4148 == -1) {
                        class108.method144(var111, var98, var110, var108.field1760);
                    } else {
                        class108.method144(var111, class99.method50(var103.field4148) + var98, var110, var108.field1760);
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3238 == arg0.field1382) {
                method4940();
                byte var112 = var3.method8163();
                class144 var113 = new class144(var3);
                class152 var114;
                if (var112 >= 0) {
                    var114 = field775[var112];
                } else {
                    var114 = Statics.field3016;
                }
                var113.method2949(var114);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3226 == arg0.field1382) {
                int var115 = var3.method7909();
                int var116 = var3.method7909();
                int var117 = var3.method7909();
                int var118 = var3.method7909();
                field739[var115] = true;
                field740[var115] = var116;
                field681[var115] = var117;
                field742[var115] = var118;
                field567[var115] = 0;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3268 == arg0.field1382) {
                int var119 = var3.method7908();
                if (field576 != var119) {
                    field576 = var119;
                    method2593();
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3279 == arg0.field1382) {
                Statics.field1959 = null;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3183 == arg0.field1382) {
                Statics.field16.field799.method6845(var3, arg0.field1385);
                method1123();
                field702 = field671;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3201 == arg0.field1382) {
                field728 = var3.method7909();
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3239 == arg0.field1382) {
                int var120 = var3.method7908();
                class85 var121 = (class85) field648.method7619((long) var120);
                if (var121 != null) {
                    method247(var121, true);
                }
                if (field652 != null) {
                    method1946(field652);
                    field652 = null;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3243 == arg0.field1382) {
                int var122 = var3.method7909();
                if (var3.method7909() == 0) {
                    field761[var122] = new class349();
                    var3.field4904 += 18;
                } else {
                    var3.field4904--;
                    field761[var122] = new class349(var3, false);
                }
                field644 = field671;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3195 == arg0.field1382) {
                method1129(var3.method7950());
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3254 == arg0.field1382) {
                field737 = false;
                for (int var123 = 0; var123 < 5; var123++) {
                    field739[var123] = false;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3250 == arg0.field1382) {
                int var124 = var3.method7944();
                int var125 = var3.method7908();
                class313 var126 = class313.method4802(var125);
                if (var126.field3574 != 6 || var126.field3571 != var124) {
                    var126.field3574 = 6;
                    var126.field3571 = var124;
                    method1946(var126);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3272 == arg0.field1382) {
                int var127 = var3.method7908();
                int var128 = var3.method7908();
                int var129 = class35.method2561();
                class285 var130 = class285.method2741(class283.field3083, field734.field1380);
                var130.field3169.method7955(var127);
                var130.field3169.method7954(var128);
                var130.field3169.method7886(var129);
                var130.field3169.method7904(field189);
                field734.method2635(var130);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3186 == arg0.field1382) {
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3179 == arg0.field1382) {
                field541 = var3.method7946() * 30;
                field687 = field671;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3194 == arg0.field1382) {
                int var131 = var3.method7908();
                int var132 = var3.method8115();
                class313 var133 = class313.method4802(var131);
                if (var133.field3574 != 1 || var133.field3571 != var132) {
                    var133.field3574 = 1;
                    var133.field3571 = var132;
                    method1946(var133);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3191 == arg0.field1382) {
                int var134 = var3.method7905();
                int var135 = var3.method7958();
                int var136 = var3.method8115();
                class98 var137 = field682[var136];
                if (var137 != null) {
                    var137.field1148 = var134;
                    var137.field1192 = var135 >> 16;
                    var137.field1191 = (var135 & 0xFFFF) + field494;
                    var137.field1188 = 0;
                    var137.field1176 = 0;
                    if (var137.field1191 > field494) {
                        var137.field1188 = -1;
                    }
                    if (var137.field1148 == 65535) {
                        var137.field1148 = -1;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3228 == arg0.field1382) {
                int var138 = var3.method7918();
                boolean var139 = var3.method7909() == 1;
                String var140 = "";
                boolean var141 = false;
                if (var139) {
                    var140 = var3.method7950();
                    if (Statics.field16.method1780(new class501(var140, Statics.field2619))) {
                        var141 = true;
                    }
                }
                String var142 = var3.method7950();
                if (!var141) {
                    class108.method5191(var138, var140, var142);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3224 == arg0.field1382) {
                Statics.field16.method1742();
                field702 = field671;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3175 == arg0.field1382) {
                if (Statics.field1959 == null) {
                    Statics.field1959 = new class426(Statics.field1374);
                }
                class487 var143 = Statics.field1374.method7275(var3);
                Statics.field1959.field4635.method7627(var143.field4968, var143.field4967);
                field678[++field679 - 1 & 0x1F] = var143.field4968;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3230 == arg0.field1382) {
                int var144 = var3.method8008();
                int var145 = var3.method7900();
                class85 var146 = (class85) field648.method7619((long) var144);
                class85 var147 = (class85) field648.method7619((long) var145);
                if (var147 != null) {
                    method247(var147, var146 == null || var146.field1039 != var147.field1039);
                }
                if (var146 != null) {
                    var146.method7335();
                    field648.method7616(var146, (long) var145);
                }
                class313 var148 = class313.method4802(var144);
                if (var148 != null) {
                    method1946(var148);
                }
                class313 var149 = class313.method4802(var145);
                if (var149 != null) {
                    method1946(var149);
                    method4935(Statics.field1732[var149.field3526 >>> 16], var149, true);
                }
                if (field647 != -1) {
                    method3397(field647, 1);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3199 == arg0.field1382) {
                method2967(false, var3);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3200 == arg0.field1382) {
                int var150 = var3.method7909();
                method3495(var150);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3220 == arg0.field1382) {
                String var151 = var3.method7950();
                long var152 = (long) var3.method7905();
                long var154 = (long) var3.method7907();
                class335 var156 = (class335) class354.method5197(class335.method3793(), var3.method7909());
                long var157 = (var152 << 32) + var154;
                boolean var159 = false;
                for (int var160 = 0; var160 < 100; var160++) {
                    if (field711[var160] == var157) {
                        var159 = true;
                        break;
                    }
                }
                if (Statics.field16.method1780(new class501(var151, Statics.field2619))) {
                    var159 = true;
                }
                if (!var159 && field668 == 0) {
                    field711[field753] = var157;
                    field753 = (field753 + 1) % 100;
                    String var161 = class379.method6555(class368.method465(class316.method4939(var3)));
                    byte var162;
                    if (var156.field4149) {
                        var162 = 7;
                    } else {
                        var162 = 3;
                    }
                    if (var156.field4148 == -1) {
                        class108.method5191(var162, var151, var161);
                    } else {
                        class108.method5191(var162, class99.method50(var156.field4148) + var151, var161);
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3185 == arg0.field1382) {
                field694 = var3.method7935();
                field639 = var3.method7909();
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3214 == arg0.field1382) {
                if (field647 != -1) {
                    method3397(field647, 0);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3236 == arg0.field1382) {
                class105.method4787(var3, arg0.field1385);
                method7736();
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3216 == arg0.field1382) {
                int var163 = var3.method7905();
                int var164 = var3.method7909();
                int var165 = var3.method7905();
                method5757(var163, var164, var165);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3208 == arg0.field1382) {
                method2967(true, var3);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3222 == arg0.field1382) {
                int var166 = var3.method7908();
                int var167 = var3.method8008();
                int var168 = var3.method8115();
                if (var168 == 65535) {
                    var168 = -1;
                }
                int var169 = var3.method7946();
                if (var169 == 65535) {
                    var169 = -1;
                }
                for (int var170 = var168; var170 <= var169; var170++) {
                    long var171 = ((long) var166 << 32) + (long) var170;
                    class444 var173 = field533.method7619(var171);
                    if (var173 != null) {
                        var173.method7335();
                    }
                    field533.method7616(new class443(var167), var171);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3233 == arg0.field1382) {
                Statics.field1678 = var3.method7898();
                Statics.field3166 = var3.method7898();
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3227 == arg0.field1382) {
                var3.field4904 += 28;
                if (var3.method7931()) {
                    method249(var3, var3.field4904 - 28);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3211 == arg0.field1382) {
                int var174 = var3.method7908();
                int var175 = var3.method7905();
                if (var174 < -70000) {
                    var175 += 32768;
                }
                class313 var176;
                if (var174 >= 0) {
                    var176 = class313.method4802(var174);
                } else {
                    var176 = null;
                }
                while (var3.field4904 < arg0.field1385) {
                    int var177 = var3.method7918();
                    int var178 = var3.method7905();
                    int var179 = 0;
                    if (var178 != 0) {
                        var179 = var3.method7909();
                        if (var179 == 255) {
                            var179 = var3.method7908();
                        }
                    }
                    if (var176 != null && var177 >= 0 && var177 < var176.field3605.length) {
                        var176.field3605[var177] = var178;
                        var176.field3657[var177] = var179;
                    }
                    class83.method2735(var175, var177, var178 - 1, var179);
                }
                if (var176 != null) {
                    method1946(var176);
                }
                method5969();
                field534[++field667 - 1 & 0x1F] = var175 & 0x7FFF;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3213 == arg0.field1382) {
                int var180 = var3.method7900();
                class313 var181 = class313.method4802(var180);
                for (int var182 = 0; var182 < var181.field3605.length; var182++) {
                    var181.field3605[var182] = -1;
                    var181.field3605[var182] = 0;
                }
                method1946(var181);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3256 == arg0.field1382) {
                method2972(class284.field3155);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3188 == arg0.field1382) {
                byte var183 = var3.method8163();
                long var184 = (long) var3.method7905();
                long var186 = (long) var3.method7907();
                long var188 = (var184 << 32) + var186;
                boolean var190 = false;
                class161 var191 = var183 >= 0 ? field658[var183] : Statics.field104;
                if (var191 == null) {
                    var190 = true;
                } else {
                    for (int var192 = 0; var192 < 100; var192++) {
                        if (field711[var192] == var188) {
                            var190 = true;
                            break;
                        }
                    }
                }
                if (!var190) {
                    field711[field753] = var188;
                    field753 = (field753 + 1) % 100;
                    String var193 = class316.method4939(var3);
                    int var194 = var183 >= 0 ? 43 : 46;
                    class108.method144(var194, "", var193, var191.field1760);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3181 == arg0.field1382) {
                method2972(class284.field3162);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3193 == arg0.field1382) {
                return this.method1164(arg0, 1);
            }
            if (class286.field3240 == arg0.field1382) {
                int var195 = var3.method7958();
                int var196 = var3.method7960();
                class313 var197 = class313.method4802(var195);
                if (var197.field3610 != var196 || var196 == -1) {
                    var197.field3610 = var196;
                    var197.field3666 = 0;
                    var197.field3661 = 0;
                    method1946(var197);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3263 == arg0.field1382) {
                method2972(class284.field3160);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3210 == arg0.field1382) {
                class37.method3050(var3, arg0.field1385);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3280 == arg0.field1382) {
                int var198 = var3.method7900();
                int var199 = var3.method7958();
                int var200 = var3.method7905();
                if (var200 == 65535) {
                    var200 = -1;
                }
                class313 var201 = class313.method4802(var198);
                if (var201.field3525) {
                    var201.field3658 = var200;
                    var201.field3659 = var199;
                    class204 var203 = class204.method3453(var200);
                    var201.field3578 = var203.field2222;
                    var201.field3635 = var203.field2204;
                    var201.field3580 = var203.field2193;
                    var201.field3617 = var203.field2200;
                    var201.field3656 = var203.field2195;
                    var201.field3510 = var203.field2220;
                    if (var203.field2196 == 1) {
                        var201.field3586 = 1;
                    } else {
                        var201.field3586 = 2;
                    }
                    if (var201.field3533 > 0) {
                        var201.field3510 = var201.field3510 * 32 / var201.field3533;
                    } else if (var201.field3537 > 0) {
                        var201.field3510 = var201.field3510 * 32 / var201.field3537;
                    }
                    method1946(var201);
                } else if (var200 == -1) {
                    var201.field3574 = 0;
                    arg0.field1382 = null;
                    return true;
                } else {
                    class204 var202 = class204.method3453(var200);
                    var201.field3574 = 4;
                    var201.field3571 = var200;
                    var201.field3578 = var202.field2222;
                    var201.field3635 = var202.field2204;
                    var201.field3510 = var202.field2220 * 100 / var199;
                    method1946(var201);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3218 == arg0.field1382) {
                boolean var204 = var3.method7909() == 1;
                if (var204) {
                    Statics.field4255 = class290.method4466() - var3.method7949();
                    Statics.field954 = new class342(var3, true);
                } else {
                    Statics.field954 = null;
                }
                field686 = field671;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3196 == arg0.field1382) {
                int var205 = var3.method7909();
                int var206 = var3.method7944();
                int var207 = var3.method7907();
                int var208 = var207 >> 16;
                int var209 = var207 >> 8 & 0xFF;
                int var210 = (var207 >> 4 & 0x7) + var208;
                int var211 = (var207 & 0x7) + var209;
                int var212 = var3.method7944();
                if (var210 >= 0 && var211 >= 0 && var210 < 104 && var211 < 104) {
                    int var213 = var210 * 128 + 64;
                    int var214 = var211 * 128 + 64;
                    class69 var215 = new class69(var212, Statics.field1812, var213, var214, method5746(var213, var214, Statics.field1812) - var205, var206, field494);
                    field618.method6111(var215);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3241 == arg0.field1382) {
                int var216 = var3.method7946();
                int var217 = var3.method7900();
                class313 var218 = class313.method4802(var217);
                if (var218.field3574 != 2 || var218.field3571 != var216) {
                    var218.field3574 = 2;
                    var218.field3571 = var216;
                    method1946(var218);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3207 == arg0.field1382) {
                int var219 = var3.method7934();
                int var220 = var3.method7908();
                int var221 = var3.method7944();
                class85 var222 = (class85) field648.method7619((long) var220);
                if (var222 != null) {
                    method247(var222, var222.field1039 != var221);
                }
                method2042(var220, var221, var219);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3275 == arg0.field1382) {
                field483 = field671;
                byte var223 = var3.method8163();
                class158 var224 = new class158(var3);
                class161 var225;
                if (var223 >= 0) {
                    var225 = field658[var223];
                } else {
                    var225 = Statics.field104;
                }
                var224.method3057(var225);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3257 == arg0.field1382) {
                int var226 = var3.method7944();
                if (var226 == 65535) {
                    var226 = -1;
                }
                method6060(var226);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3189 == arg0.field1382) {
                int var227 = var3.method7907();
                int var228 = var3.method7944();
                if (var228 == 65535) {
                    var228 = -1;
                }
                method272(var228, var227);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3248 == arg0.field1382) {
                Statics.field3166 = var3.method7934();
                Statics.field1678 = var3.method7909();
                while (var3.field4904 < arg0.field1385) {
                    int var229 = var3.method7909();
                    class284 var230 = class284.method3765()[var229];
                    method2972(var230);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3269 == arg0.field1382) {
                String var231 = var3.method7950();
                Object[] var232 = new Object[var231.length() + 1];
                for (int var233 = var231.length() - 1; var233 >= 0; var233--) {
                    if (var231.charAt(var233) == 's') {
                        var232[var233 + 1] = var3.method7950();
                    } else {
                        var232[var233 + 1] = Integer.valueOf(var3.method7908());
                    }
                }
                var232[0] = Integer.valueOf(var3.method7908());
                class86 var234 = new class86();
                var234.field1057 = var232;
                class68.method69(var234);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3198 == arg0.field1382) {
                int var235 = var3.method8115();
                class90 var236;
                if (field603 == var235) {
                    var236 = Statics.field1440;
                } else {
                    var236 = field758[var235];
                }
                int var237 = var3.method7905();
                int var238 = var3.method8008();
                if (var236 != null) {
                    var236.field1148 = var237;
                    var236.field1192 = var238 >> 16;
                    var236.field1191 = (var238 & 0xFFFF) + field494;
                    var236.field1188 = 0;
                    var236.field1176 = 0;
                    if (var236.field1191 > field494) {
                        var236.field1188 = -1;
                    }
                    if (var236.field1148 == 65535) {
                        var236.field1148 = -1;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3190 == arg0.field1382) {
                return this.method1164(arg0, 2);
            }
            if (class286.field3197 == arg0.field1382) {
                for (int var239 = 0; var239 < field758.length; var239++) {
                    if (field758[var239] != null) {
                        field758[var239].field1183 = -1;
                    }
                }
                for (int var240 = 0; var240 < field682.length; var240++) {
                    if (field682[var240] != null) {
                        field682[var240].field1183 = -1;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3237 == arg0.field1382) {
                int var241 = var3.method7908();
                int var242 = var3.method7905();
                if (var241 < -70000) {
                    var242 += 32768;
                }
                class313 var243;
                if (var241 >= 0) {
                    var243 = class313.method4802(var241);
                } else {
                    var243 = null;
                }
                if (var243 != null) {
                    for (int var244 = 0; var244 < var243.field3605.length; var244++) {
                        var243.field3605[var244] = 0;
                        var243.field3657[var244] = 0;
                    }
                }
                class83.method2532(var242);
                int var245 = var3.method7905();
                for (int var246 = 0; var246 < var245; var246++) {
                    int var247 = var3.method7909();
                    if (var247 == 255) {
                        var247 = var3.method8008();
                    }
                    int var248 = var3.method7944();
                    if (var243 != null && var246 < var243.field3605.length) {
                        var243.field3605[var246] = var248;
                        var243.field3657[var246] = var247;
                    }
                    class83.method2735(var242, var246, var248 - 1, var247);
                }
                if (var243 != null) {
                    method1946(var243);
                }
                method5969();
                field534[++field667 - 1 & 0x1F] = var242 & 0x7FFF;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3225 == arg0.field1382) {
                method2972(class284.field3164);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3184 == arg0.field1382) {
                int var249 = var3.method7946();
                int var250 = var3.method7909();
                int var251 = var250 >> 2;
                int var252 = var250 & 0x3;
                int var253 = field555[var251];
                int var254 = var3.method7913();
                int var255 = var254 >> 16;
                int var256 = var254 >> 8 & 0xFF;
                int var257 = (var254 >> 4 & 0x7) + var255;
                int var258 = (var254 & 0x7) + var256;
                if (var257 >= 0 && var258 >= 0 && var257 < 103 && var258 < 103) {
                    if (var253 == 0) {
                        class236 var259 = Statics.field3.method4055(Statics.field1812, var257, var258);
                        if (var259 != null) {
                            int var260 = class232.method4938(var259.field2764);
                            if (var251 == 2) {
                                var259.field2769 = new class78(var260, 2, var252 + 4, Statics.field1812, var257, var258, var249, false, var259.field2769);
                                var259.field2770 = new class78(var260, 2, var252 + 1 & 0x3, Statics.field1812, var257, var258, var249, false, var259.field2770);
                            } else {
                                var259.field2769 = new class78(var260, var251, var252, Statics.field1812, var257, var258, var249, false, var259.field2769);
                            }
                        }
                    } else if (var253 == 1) {
                        class238 var261 = Statics.field3.method4056(Statics.field1812, var257, var258);
                        if (var261 != null) {
                            int var262 = class232.method4938(var261.field2784);
                            if (var251 == 4 || var251 == 5) {
                                var261.field2786 = new class78(var262, 4, var252, Statics.field1812, var257, var258, var249, false, var261.field2786);
                            } else if (var251 == 6) {
                                var261.field2786 = new class78(var262, 4, var252 + 4, Statics.field1812, var257, var258, var249, false, var261.field2786);
                            } else if (var251 == 7) {
                                var261.field2786 = new class78(var262, 4, (var252 + 2 & 0x3) + 4, Statics.field1812, var257, var258, var249, false, var261.field2786);
                            } else if (var251 == 8) {
                                var261.field2786 = new class78(var262, 4, var252 + 4, Statics.field1812, var257, var258, var249, false, var261.field2786);
                                var261.field2783 = new class78(var262, 4, (var252 + 2 & 0x3) + 4, Statics.field1812, var257, var258, var249, false, var261.field2783);
                            }
                        }
                    } else if (var253 == 2) {
                        class239 var263 = Statics.field3.method4091(Statics.field1812, var257, var258);
                        if (var251 == 11) {
                            var251 = 10;
                        }
                        if (var263 != null) {
                            var263.field2793 = new class78(class232.method4938(var263.field2801), var251, var252, Statics.field1812, var257, var258, var249, false, var263.field2793);
                        }
                    } else if (var253 == 3) {
                        class216 var264 = Statics.field3.method4058(Statics.field1812, var257, var258);
                        if (var264 != null) {
                            var264.field2416 = new class78(class232.method4938(var264.field2413), 22, var252, Statics.field1812, var257, var258, var249, false, var264.field2416);
                        }
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3176 == arg0.field1382) {
                method4030(true, arg0.field1383);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3217 == arg0.field1382) {
                boolean var265 = var3.method8022();
                if (!var265) {
                    Statics.field4295 = null;
                } else if (Statics.field4295 == null) {
                    Statics.field4295 = new class351();
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3231 == arg0.field1382) {
                method5969();
                field653 = var3.method7905();
                field687 = field671;
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3273 == arg0.field1382) {
                String var266 = var3.method7950();
                int var267 = var3.method7900();
                class313 var268 = class313.method4802(var267);
                if (!var266.equals(var268.field3588)) {
                    var268.field3588 = var266;
                    method1946(var268);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3212 == arg0.field1382) {
                int var269 = arg0.field1385 + var3.field4904;
                int var270 = var3.method7905();
                int var271 = var3.method7905();
                if (field647 != var270) {
                    field647 = var270;
                    this.method1170(false);
                    method1131(field647);
                    class68.method4800(field647);
                    for (int var272 = 0; var272 < 100; var272++) {
                        field723[var272] = true;
                    }
                }
                while (var271-- > 0) {
                    int var273 = var3.method7908();
                    int var274 = var3.method7905();
                    int var275 = var3.method7909();
                    class85 var276 = (class85) field648.method7619((long) var273);
                    if (var276 != null && var276.field1039 != var274) {
                        method247(var276, true);
                        var276 = null;
                    }
                    if (var276 == null) {
                        var276 = method2042(var273, var274, var275);
                    }
                    var276.field1043 = true;
                }
                for (class85 var277 = (class85) field648.method7614(); var277 != null; var277 = (class85) field648.method7617()) {
                    if (var277.field1043) {
                        var277.field1043 = false;
                    } else {
                        method247(var277, true);
                    }
                }
                field533 = new class455(512);
                while (var3.field4904 < var269) {
                    int var278 = var3.method7908();
                    int var279 = var3.method7905();
                    int var280 = var3.method7905();
                    int var281 = var3.method7908();
                    for (int var282 = var279; var282 <= var280; var282++) {
                        long var283 = ((long) var278 << 32) + (long) var282;
                        field533.method7616(new class443(var281), var283);
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3215 == arg0.field1382) {
                method2972(class284.field3159);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3277 == arg0.field1382) {
                int var285 = var3.method8008();
                int var286 = var3.method7948();
                int var287 = var3.method7882();
                class313 var288 = class313.method4802(var285);
                if (var288.field3535 != var286 || var288.field3536 != var287 || var288.field3550 != 0 || var288.field3559 != 0) {
                    var288.field3535 = var286;
                    var288.field3536 = var287;
                    var288.field3550 = 0;
                    var288.field3559 = 0;
                    method1946(var288);
                    this.method1171(var288);
                    if (var288.field3528 == 0) {
                        method4935(Statics.field1732[var285 >> 16], var288, false);
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3234 == arg0.field1382) {
                Statics.field1959 = new class426(Statics.field1374);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3204 == arg0.field1382) {
                method2972(class284.field3158);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3252 == arg0.field1382) {
                class65 var289 = new class65();
                var289.field788 = var3.method7950();
                var289.field785 = var3.method7905();
                int var290 = var3.method7908();
                var289.field778 = var290;
                method274(45);
                var2.method7040();
                Object var291 = null;
                class74.method3438(var289);
                arg0.field1382 = null;
                return false;
            }
            if (class286.field3264 == arg0.field1382) {
                field737 = true;
                field738 = false;
                Statics.field1801 = var3.method7909();
                Statics.field124 = var3.method7909();
                Statics.field3362 = var3.method7905();
                Statics.field4270 = var3.method7909();
                Statics.field2506 = var3.method7909();
                if (Statics.field2506 >= 100) {
                    int var292 = Statics.field1801 * 128 + 64;
                    int var293 = Statics.field124 * 128 + 64;
                    int var294 = method5746(var292, var293, Statics.field1812) - Statics.field3362;
                    int var295 = var292 - Statics.field4413;
                    int var296 = var294 - Statics.field4280;
                    int var297 = var293 - Statics.field4880;
                    int var298 = (int) Math.sqrt((double) (var295 * var295 + var297 * var297));
                    Statics.field3507 = (int) (Math.atan2((double) var296, (double) var298) * 325.9490051269531D) & 0x7FF;
                    Statics.field1400 = (int) (Math.atan2((double) var295, (double) var297) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field3507 < 128) {
                        Statics.field3507 = 128;
                    }
                    if (Statics.field3507 > 383) {
                        Statics.field3507 = 383;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3271 == arg0.field1382) {
                method2972(class284.field3156);
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3203 == arg0.field1382) {
                Statics.field3166 = var3.method7934();
                Statics.field1678 = var3.method7909();
                for (int var299 = Statics.field3166; var299 < Statics.field3166 + 8; var299++) {
                    for (int var300 = Statics.field1678; var300 < Statics.field1678 + 8; var300++) {
                        if (field615[Statics.field1812][var299][var300] != null) {
                            field615[Statics.field1812][var299][var300] = null;
                            method2966(var299, var300);
                        }
                    }
                }
                for (class92 var301 = (class92) field548.method6089(); var301 != null; var301 = (class92) field548.method6098()) {
                    if (var301.field1126 >= Statics.field3166 && var301.field1126 < Statics.field3166 + 8 && var301.field1138 >= Statics.field1678 && var301.field1138 < Statics.field1678 + 8 && Statics.field1812 == var301.field1125) {
                        var301.field1137 = 0;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class286.field3206 == arg0.field1382) {
                int var302 = var3.method7944();
                int var303 = var3.method8115();
                int var304 = var3.method7908();
                class313 var305 = class313.method4802(var304);
                var305.field3583 = (var303 << 16) + var302;
                arg0.field1382 = null;
                return true;
            }
            class504.method6263("" + (arg0.field1382 == null ? -1 : arg0.field1382.field3221) + class99.field1294 + (arg0.field1390 == null ? -1 : arg0.field1390.field3221) + class99.field1294 + (arg0.field1391 == null ? -1 : arg0.field1391.field3221) + class99.field1294 + arg0.field1385, (Throwable) null);
            method4937();
        } catch (IOException var310) {
            method2241();
        } catch (Exception var311) {
            String var308 = "" + (arg0.field1382 == null ? -1 : arg0.field1382.field3221) + class99.field1294 + (arg0.field1390 == null ? -1 : arg0.field1390.field3221) + class99.field1294 + (arg0.field1391 == null ? -1 : arg0.field1391.field3221) + class99.field1294 + arg0.field1385 + class99.field1294 + (Statics.field218 + Statics.field1440.field1212[0]) + class99.field1294 + (Statics.field1865 + Statics.field1440.field1171[0]) + class99.field1294;
            for (int var309 = 0; var309 < arg0.field1385 && var309 < 50; var309++) {
                var308 = var308 + var3.field4906[var309] + class99.field1294;
            }
            class504.method6263(var308, var311);
            method4937();
        }
        return true;
    }

    @ObfuscatedName("fh.jp(Lkz;I)V")
    public static final void method2972(class284 arg0) {
        class477 var1 = field734.field1383;
        if (class284.field3155 == arg0) {
            int var2 = var1.method7905();
            int var3 = var1.method7934();
            int var4 = (var3 >> 4 & 0x7) + Statics.field3166;
            int var5 = (var3 & 0x7) + Statics.field1678;
            int var6 = var1.method7909();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                class359 var7 = field615[Statics.field1812][var4][var5];
                if (var7 != null) {
                    for (class102 var8 = (class102) var7.method6089(); var8 != null; var8 = (class102) var7.method6098()) {
                        if ((var2 & 0x7FFF) == var8.field1311) {
                            var8.method2524(var6);
                            break;
                        }
                    }
                }
            }
            return;
        }
        if (class284.field3159 == arg0) {
            int var9 = var1.method7935();
            int var10 = var9 >> 4 & 0xF;
            int var11 = var9 & 0x7;
            int var12 = var1.method7909();
            int var13 = (var12 >> 4 & 0x7) + Statics.field3166;
            int var14 = (var12 & 0x7) + Statics.field1678;
            int var15 = var1.method7946();
            int var16 = var1.method7909();
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
                int var17 = var10 + 1;
                if (Statics.field1440.field1212[0] >= var13 - var17 && Statics.field1440.field1212[0] <= var13 + var17 && Statics.field1440.field1171[0] >= var14 - var17 && Statics.field1440.field1171[0] <= var14 + var17 && Statics.field2929.method2349() != 0 && var11 > 0 && field731 < 50) {
                    field732[field731] = var15;
                    field733[field731] = var11;
                    field685[field731] = var16;
                    field736[field731] = null;
                    field735[field731] = (var13 << 16) + (var14 << 8) + var10;
                    field731++;
                }
            }
        }
        if (class284.field3160 == arg0) {
            int var18 = var1.method7935();
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            int var21 = field555[var19];
            int var22 = var1.method7935();
            int var23 = (var22 >> 4 & 0x7) + Statics.field3166;
            int var24 = (var22 & 0x7) + Statics.field1678;
            int var25 = var1.method7905();
            if (var23 >= 0 && var24 >= 0 && var23 < 103 && var24 < 103) {
                if (var21 == 0) {
                    class236 var26 = Statics.field3.method4055(Statics.field1812, var23, var24);
                    if (var26 != null) {
                        int var27 = class232.method4938(var26.field2764);
                        if (var19 == 2) {
                            var26.field2769 = new class78(var27, 2, var20 + 4, Statics.field1812, var23, var24, var25, false, var26.field2769);
                            var26.field2770 = new class78(var27, 2, var20 + 1 & 0x3, Statics.field1812, var23, var24, var25, false, var26.field2770);
                        } else {
                            var26.field2769 = new class78(var27, var19, var20, Statics.field1812, var23, var24, var25, false, var26.field2769);
                        }
                        return;
                    }
                }
                if (var21 == 1) {
                    class238 var28 = Statics.field3.method4056(Statics.field1812, var23, var24);
                    if (var28 != null) {
                        int var29 = class232.method4938(var28.field2784);
                        if (var19 == 4 || var19 == 5) {
                            var28.field2786 = new class78(var29, 4, var20, Statics.field1812, var23, var24, var25, false, var28.field2786);
                        } else if (var19 == 6) {
                            var28.field2786 = new class78(var29, 4, var20 + 4, Statics.field1812, var23, var24, var25, false, var28.field2786);
                        } else if (var19 == 7) {
                            var28.field2786 = new class78(var29, 4, (var20 + 2 & 0x3) + 4, Statics.field1812, var23, var24, var25, false, var28.field2786);
                        } else if (var19 == 8) {
                            var28.field2786 = new class78(var29, 4, var20 + 4, Statics.field1812, var23, var24, var25, false, var28.field2786);
                            var28.field2783 = new class78(var29, 4, (var20 + 2 & 0x3) + 4, Statics.field1812, var23, var24, var25, false, var28.field2783);
                        }
                        return;
                    }
                }
                if (var21 == 2) {
                    class239 var30 = Statics.field3.method4091(Statics.field1812, var23, var24);
                    if (var19 == 11) {
                        var19 = 10;
                    }
                    if (var30 != null) {
                        var30.field2793 = new class78(class232.method4938(var30.field2801), var19, var20, Statics.field1812, var23, var24, var25, false, var30.field2793);
                        return;
                    }
                }
                if (var21 == 3) {
                    class216 var31 = Statics.field3.method4058(Statics.field1812, var23, var24);
                    if (var31 != null) {
                        var31.field2416 = new class78(class232.method4938(var31.field2413), 22, var20, Statics.field1812, var23, var24, var25, false, var31.field2416);
                        return;
                    }
                }
                method2944(Statics.field1812, var23, var24, var21, var25);
            }
        } else if (class284.field3161 == arg0) {
            int var32 = var1.method7944();
            int var33 = var1.method7908();
            int var34 = var1.method7934();
            int var35 = (var34 >> 4 & 0x7) + Statics.field3166;
            int var36 = (var34 & 0x7) + Statics.field1678;
            int var37 = var1.method7908();
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class359 var38 = field615[Statics.field1812][var35][var36];
                if (var38 != null) {
                    for (class102 var39 = (class102) var38.method6089(); var39 != null; var39 = (class102) var38.method6098()) {
                        if ((var32 & 0x7FFF) == var39.field1311 && var39.field1314 == var37) {
                            var39.field1314 = var33;
                            break;
                        }
                    }
                    method2966(var35, var36);
                }
            }
        } else if (class284.field3156 == arg0) {
            int var40 = var1.method7905();
            int var41 = var1.method8008();
            int var42 = var1.method7909();
            int var43 = (var42 >> 4 & 0x7) + Statics.field3166;
            int var44 = (var42 & 0x7) + Statics.field1678;
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                class359 var45 = field615[Statics.field1812][var43][var44];
                if (var45 != null) {
                    for (class102 var46 = (class102) var45.method6089(); var46 != null; var46 = (class102) var45.method6098()) {
                        if ((var40 & 0x7FFF) == var46.field1311 && var46.field1314 == var41) {
                            var46.method7335();
                            break;
                        }
                    }
                    if (var45.method6089() == null) {
                        field615[Statics.field1812][var43][var44] = null;
                    }
                    method2966(var43, var44);
                }
            }
        } else if (class284.field3158 == arg0) {
            int var47 = var1.method7898();
            int var48 = var1.method8115();
            int var49 = var1.method7898();
            int var50 = var49 >> 2;
            int var51 = var49 & 0x3;
            int var52 = field555[var50];
            int var53 = var1.method7909();
            int var54 = (var53 >> 4 & 0x7) + Statics.field3166;
            int var55 = (var53 & 0x7) + Statics.field1678;
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                method1051(Statics.field1812, var54, var55, var52, var48, var50, var51, var47, 0, -1);
            }
        } else if (class284.field3157 == arg0) {
            var1.method7946();
            int var56 = var1.method7934();
            int var57 = var1.method7946();
            var1.method7898();
            var1.method7905();
            int var58 = var1.method8008();
            var1.method7898();
            int var59 = var1.method7934();
            int var60 = (var59 >> 4 & 0x7) + Statics.field3166;
            int var61 = (var59 & 0x7) + Statics.field1678;
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                class102 var62 = new class102();
                var62.field1311 = var57;
                var62.field1314 = var58;
                var62.method2524(var56);
                if (field615[Statics.field1812][var60][var61] == null) {
                    field615[Statics.field1812][var60][var61] = new class359();
                }
                field615[Statics.field1812][var60][var61].method6111(var62);
                method2966(var60, var61);
            }
        } else if (class284.field3165 == arg0) {
            int var63 = var1.method7944();
            int var64 = var1.method7935();
            int var65 = (var64 >> 4 & 0x7) + Statics.field3166;
            int var66 = (var64 & 0x7) + Statics.field1678;
            int var67 = var1.method8115();
            int var68 = var1.method7909();
            if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                int var69 = var65 * 128 + 64;
                int var70 = var66 * 128 + 64;
                class69 var71 = new class69(var67, Statics.field1812, var69, var70, method5746(var69, var70, Statics.field1812) - var68, var63, field494);
                field618.method6111(var71);
            }
        } else if (class284.field3163 == arg0) {
            int var72 = var1.method7962();
            byte var73 = var1.method7888();
            int var74 = var1.method7898() * 4;
            byte var75 = var1.method8163();
            int var76 = var1.method7944();
            int var77 = var1.method7909();
            int var78 = var1.method7944();
            int var79 = var1.method7909() * 4;
            int var80 = var1.method7935();
            int var81 = var1.method7935();
            int var82 = (var81 >> 4 & 0x7) + Statics.field3166;
            int var83 = (var81 & 0x7) + Statics.field1678;
            int var84 = var1.method7946();
            int var85 = var75 + var82;
            int var86 = var73 + var83;
            if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var78 != 65535) {
                int var87 = var82 * 128 + 64;
                int var88 = var83 * 128 + 64;
                int var89 = var85 * 128 + 64;
                int var90 = var86 * 128 + 64;
                class75 var91 = new class75(var78, Statics.field1812, var87, var88, method5746(var87, var88, Statics.field1812) - var74, field494 + var84, field494 + var76, var80, var77, var72, var79);
                var91.method2014(var89, var90, method5746(var89, var90, Statics.field1812) - var79, field494 + var84);
                field617.method6111(var91);
            }
        } else if (class284.field3164 == arg0) {
            int var92 = var1.method7909();
            int var93 = var92 >> 2;
            int var94 = var92 & 0x3;
            int var95 = field555[var93];
            int var96 = var1.method7909();
            int var97 = (var96 >> 4 & 0x7) + Statics.field3166;
            int var98 = (var96 & 0x7) + Statics.field1678;
            if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                method1051(Statics.field1812, var97, var98, var95, -1, var93, var94, 31, 0, -1);
            }
        } else if (class284.field3162 == arg0) {
            byte var99 = var1.method7888();
            int var100 = var1.method7935();
            int var101 = (var100 >> 4 & 0x7) + Statics.field3166;
            int var102 = (var100 & 0x7) + Statics.field1678;
            int var103 = var1.method8115();
            byte var104 = var1.method7938();
            int var105 = var1.method7944();
            byte var106 = var1.method7940();
            int var107 = var1.method7905();
            int var108 = var1.method7935();
            int var109 = var108 >> 2;
            int var110 = var108 & 0x3;
            int var111 = field555[var109];
            int var112 = var1.method7905();
            byte var113 = var1.method7940();
            class90 var114;
            if (field603 == var103) {
                var114 = Statics.field1440;
            } else {
                var114 = field758[var103];
            }
            if (var114 != null) {
                class203 var115 = Statics.method4396(var105);
                int var116;
                int var117;
                if (var110 == 1 || var110 == 3) {
                    var116 = var115.field2141;
                    var117 = var115.field2174;
                } else {
                    var116 = var115.field2174;
                    var117 = var115.field2141;
                }
                int var118 = (var116 >> 1) + var101;
                int var119 = (var116 + 1 >> 1) + var101;
                int var120 = (var117 >> 1) + var102;
                int var121 = (var117 + 1 >> 1) + var102;
                int[][] var122 = class80.field1000[Statics.field1812];
                int var123 = var122[var118][var120] + var122[var119][var120] + var122[var118][var121] + var122[var119][var121] >> 2;
                int var124 = (var101 << 7) + (var116 << 6);
                int var125 = (var102 << 7) + (var117 << 6);
                class231 var126 = var115.method3560(var109, var110, var122, var124, var123, var125);
                if (var126 != null) {
                    method1051(Statics.field1812, var101, var102, var111, -1, 0, 0, 31, var112 + 1, var107 + 1);
                    var114.field1094 = field494 + var112;
                    var114.field1095 = field494 + var107;
                    var114.field1099 = var126;
                    var114.field1096 = var101 * 128 + var116 * 64;
                    var114.field1098 = var102 * 128 + var117 * 64;
                    var114.field1097 = var123;
                    if (var113 > var106) {
                        byte var127 = var113;
                        var113 = var106;
                        var106 = var127;
                    }
                    if (var104 > var99) {
                        byte var128 = var104;
                        var104 = var99;
                        var99 = var128;
                    }
                    var114.field1100 = var101 + var113;
                    var114.field1103 = var101 + var106;
                    var114.field1101 = var102 + var104;
                    var114.field1087 = var99 + var102;
                }
            }
        }
    }

    @ObfuscatedName("co.jg(IIIIIIIIIII)V")
    public static final void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class92 var10 = null;
        for (class92 var11 = (class92) field548.method6089(); var11 != null; var11 = (class92) field548.method6098()) {
            if (var11.field1125 == arg0 && var11.field1126 == arg1 && var11.field1138 == arg2 && var11.field1130 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class92();
            var10.field1125 = arg0;
            var10.field1130 = arg3;
            var10.field1126 = arg1;
            var10.field1138 = arg2;
            var10.field1134 = -1;
            method377(var10);
            field548.method6111(var10);
        }
        var10.field1136 = arg4;
        var10.field1133 = arg5;
        var10.field1132 = arg6;
        var10.field1127 = arg8;
        var10.field1137 = arg9;
        var10.method2235(arg7);
    }

    @ObfuscatedName("fj.jm(IIIIII)Z")
    public static final boolean method2944(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class92 var5 = null;
        for (class92 var6 = (class92) field548.method6089(); var6 != null; var6 = (class92) field548.method6098()) {
            if (var6.field1125 == arg0 && var6.field1126 == arg1 && var6.field1138 == arg2 && var6.field1130 == arg3) {
                var5 = var6;
                break;
            }
        }
        if (var5 == null) {
            return false;
        } else {
            var5.field1134 = arg4;
            return true;
        }
    }

    @ObfuscatedName("ef.jo(I)V")
    public static final void method2713() {
        for (class92 var0 = (class92) field548.method6089(); var0 != null; var0 = (class92) field548.method6098()) {
            if (var0.field1137 == -1) {
                var0.field1127 = 0;
                method377(var0);
            } else {
                var0.method7335();
            }
        }
    }

    @ObfuscatedName("bv.jr(Lda;I)V")
    public static final void method377(class92 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1130 == 0) {
            var1 = Statics.field3.method4059(arg0.field1125, arg0.field1126, arg0.field1138);
        }
        if (arg0.field1130 == 1) {
            var1 = Statics.field3.method4060(arg0.field1125, arg0.field1126, arg0.field1138);
        }
        if (arg0.field1130 == 2) {
            var1 = Statics.field3.method4112(arg0.field1125, arg0.field1126, arg0.field1138);
        }
        if (arg0.field1130 == 3) {
            var1 = Statics.field3.method4062(arg0.field1125, arg0.field1126, arg0.field1138);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3.method4054(arg0.field1125, arg0.field1126, arg0.field1138, var1);
            var3 = class232.method4938(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1128 = var3;
        arg0.field1131 = var4;
        arg0.field1129 = var5;
    }

    @ObfuscatedName("ag.jd(I)V")
    public static final void method270() {
        for (class92 var0 = (class92) field548.method6089(); var0 != null; var0 = (class92) field548.method6098()) {
            if (var0.field1137 > 0) {
                var0.field1137--;
            }
            if (var0.field1137 == 0) {
                if (var0.field1128 >= 0) {
                    int var1 = var0.field1128;
                    int var2 = var0.field1131;
                    class203 var3 = Statics.method4396(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method3548(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method2969(var0.field1125, var0.field1130, var0.field1126, var0.field1138, var0.field1128, var0.field1129, var0.field1131, var0.field1134);
                var0.method7335();
            } else {
                if (var0.field1127 > 0) {
                    var0.field1127--;
                }
                if (var0.field1127 == 0 && var0.field1126 >= 1 && var0.field1138 >= 1 && var0.field1126 <= 102 && var0.field1138 <= 102) {
                    if (var0.field1136 >= 0) {
                        int var5 = var0.field1136;
                        int var6 = var0.field1133;
                        class203 var7 = Statics.method4396(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method3548(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method2969(var0.field1125, var0.field1130, var0.field1126, var0.field1138, var0.field1136, var0.field1132, var0.field1133, var0.field1134);
                    var0.field1127 = -1;
                    if (var0.field1136 == var0.field1128 && var0.field1128 == -1) {
                        var0.method7335();
                    } else if (var0.field1136 == var0.field1128 && var0.field1132 == var0.field1129 && var0.field1133 == var0.field1131) {
                        var0.method7335();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fq.jk(IIIIIIIII)V")
    public static final void method2969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field486 && Statics.field1812 != arg0) {
            return;
        }
        long var8 = 0L;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg1 == 0) {
            var8 = Statics.field3.method4059(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var8 = Statics.field3.method4060(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var8 = Statics.field3.method4112(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var8 = Statics.field3.method4062(arg0, arg2, arg3);
        }
        if (var8 != 0L) {
            int var13 = Statics.field3.method4054(arg0, arg2, arg3, var8);
            int var14 = class232.method4938(var8);
            int var15 = var13 & 0x1F;
            int var16 = var13 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3.method4061(arg0, arg2, arg3);
                class203 var17 = Statics.method4396(var14);
                if (var17.field2124 != 0) {
                    field616[arg0].method3790(arg2, arg3, var15, var16, var17.field2143);
                }
            }
            if (arg1 == 1) {
                Statics.field3.method4051(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3.method4063(arg0, arg2, arg3);
                class203 var18 = Statics.method4396(var14);
                if (var18.field2174 + arg2 > 103 || var18.field2174 + arg3 > 103 || var18.field2141 + arg2 > 103 || var18.field2141 + arg3 > 103) {
                    return;
                }
                if (var18.field2124 != 0) {
                    field616[arg0].method3782(arg2, arg3, var18.field2174, var18.field2141, var16, var18.field2143);
                }
            }
            if (arg1 == 3) {
                Statics.field3.method4053(arg0, arg2, arg3);
                class203 var19 = Statics.method4396(var14);
                if (var19.field2124 == 1) {
                    field616[arg0].method3774(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var20 = arg0;
        if (arg0 < 3 && (class80.field994[1][arg2][arg3] & 0x2) == 2) {
            var20 = arg0 + 1;
        }
        class223 var21 = Statics.field3;
        class210 var22 = field616[arg0];
        class203 var23 = Statics.method4396(arg4);
        int var24 = arg7 >= 0 ? arg7 : var23.field2160;
        int var25;
        int var26;
        if (arg5 == 1 || arg5 == 3) {
            var25 = var23.field2141;
            var26 = var23.field2174;
        } else {
            var25 = var23.field2174;
            var26 = var23.field2141;
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
        int[][] var31 = class80.field1000[var20];
        int var32 = var31[var27][var29] + var31[var28][var29] + var31[var27][var30] + var31[var28][var30] >> 2;
        int var33 = (arg2 << 7) + (var25 << 6);
        int var34 = (arg3 << 7) + (var26 << 6);
        long var35 = class232.method2538(arg2, arg3, 2, var23.field2144 == 0, arg4);
        int var37 = (arg5 << 6) + arg6;
        if (var23.field2165 == 1) {
            var37 += 256;
        }
        if (arg6 == 22) {
            class225 var38;
            if (var24 == -1 && var23.field2129 == null) {
                var38 = var23.method3560(22, arg5, var31, var33, var32, var34);
            } else {
                var38 = new class78(arg4, 22, arg5, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4039(arg0, arg2, arg3, var32, var38, var35, var37);
            if (var23.field2124 == 1) {
                var22.method3778(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class225 var64;
            if (var24 == -1 && var23.field2129 == null) {
                var64 = var23.method3560(10, arg5, var31, var33, var32, var34);
            } else {
                var64 = new class78(arg4, 10, arg5, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            if (var64 != null) {
                var21.method4179(arg0, arg2, arg3, var32, var25, var26, var64, arg6 == 11 ? 256 : 0, var35, var37);
            }
            if (var23.field2124 != 0) {
                var22.method3769(arg2, arg3, var25, var26, var23.field2143);
            }
        } else if (arg6 >= 12) {
            class225 var39;
            if (var24 == -1 && var23.field2129 == null) {
                var39 = var23.method3560(arg6, arg5, var31, var33, var32, var34);
            } else {
                var39 = new class78(arg4, arg6, arg5, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4179(arg0, arg2, arg3, var32, 1, 1, var39, 0, var35, var37);
            if (var23.field2124 != 0) {
                var22.method3769(arg2, arg3, var25, var26, var23.field2143);
            }
        } else if (arg6 == 0) {
            class225 var40;
            if (var24 == -1 && var23.field2129 == null) {
                var40 = var23.method3560(0, arg5, var31, var33, var32, var34);
            } else {
                var40 = new class78(arg4, 0, arg5, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4177(arg0, arg2, arg3, var32, var40, (class225) null, class80.field999[arg5], 0, var35, var37);
            if (var23.field2124 != 0) {
                var22.method3768(arg2, arg3, arg6, arg5, var23.field2143);
            }
        } else if (arg6 == 1) {
            class225 var41;
            if (var24 == -1 && var23.field2129 == null) {
                var41 = var23.method3560(1, arg5, var31, var33, var32, var34);
            } else {
                var41 = new class78(arg4, 1, arg5, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4177(arg0, arg2, arg3, var32, var41, (class225) null, class80.field1007[arg5], 0, var35, var37);
            if (var23.field2124 != 0) {
                var22.method3768(arg2, arg3, arg6, arg5, var23.field2143);
            }
        } else if (arg6 == 2) {
            int var42 = arg5 + 1 & 0x3;
            class225 var43;
            class225 var44;
            if (var24 == -1 && var23.field2129 == null) {
                var43 = var23.method3560(2, arg5 + 4, var31, var33, var32, var34);
                var44 = var23.method3560(2, var42, var31, var33, var32, var34);
            } else {
                var43 = new class78(arg4, 2, arg5 + 4, var20, arg2, arg3, var24, var23.field2149, (class225) null);
                var44 = new class78(arg4, 2, var42, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4177(arg0, arg2, arg3, var32, var43, var44, class80.field999[arg5], class80.field999[var42], var35, var37);
            if (var23.field2124 != 0) {
                var22.method3768(arg2, arg3, arg6, arg5, var23.field2143);
            }
        } else if (arg6 == 3) {
            class225 var45;
            if (var24 == -1 && var23.field2129 == null) {
                var45 = var23.method3560(3, arg5, var31, var33, var32, var34);
            } else {
                var45 = new class78(arg4, 3, arg5, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4177(arg0, arg2, arg3, var32, var45, (class225) null, class80.field1007[arg5], 0, var35, var37);
            if (var23.field2124 != 0) {
                var22.method3768(arg2, arg3, arg6, arg5, var23.field2143);
            }
        } else if (arg6 == 9) {
            class225 var46;
            if (var24 == -1 && var23.field2129 == null) {
                var46 = var23.method3560(arg6, arg5, var31, var33, var32, var34);
            } else {
                var46 = new class78(arg4, arg6, arg5, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4179(arg0, arg2, arg3, var32, 1, 1, var46, 0, var35, var37);
            if (var23.field2124 != 0) {
                var22.method3769(arg2, arg3, var25, var26, var23.field2143);
            }
        } else if (arg6 == 4) {
            class225 var47;
            if (var24 == -1 && var23.field2129 == null) {
                var47 = var23.method3560(4, arg5, var31, var33, var32, var34);
            } else {
                var47 = new class78(arg4, 4, arg5, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4110(arg0, arg2, arg3, var32, var47, (class225) null, class80.field999[arg5], 0, 0, 0, var35, var37);
        } else if (arg6 == 5) {
            int var48 = 16;
            long var49 = var21.method4059(arg0, arg2, arg3);
            if (var49 != 0L) {
                var48 = Statics.method4396(class232.method4938(var49)).field2139;
            }
            class225 var51;
            if (var24 == -1 && var23.field2129 == null) {
                var51 = var23.method3560(4, arg5, var31, var33, var32, var34);
            } else {
                var51 = new class78(arg4, 4, arg5, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4110(arg0, arg2, arg3, var32, var51, (class225) null, class80.field999[arg5], 0, class80.field1001[arg5] * var48, class80.field1003[arg5] * var48, var35, var37);
        } else if (arg6 == 6) {
            int var52 = 8;
            long var53 = var21.method4059(arg0, arg2, arg3);
            if (var53 != 0L) {
                var52 = Statics.method4396(class232.method4938(var53)).field2139 / 2;
            }
            class225 var55;
            if (var24 == -1 && var23.field2129 == null) {
                var55 = var23.method3560(4, arg5 + 4, var31, var33, var32, var34);
            } else {
                var55 = new class78(arg4, 4, arg5 + 4, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4110(arg0, arg2, arg3, var32, var55, (class225) null, 256, arg5, class80.field1004[arg5] * var52, class80.field1005[arg5] * var52, var35, var37);
        } else if (arg6 == 7) {
            int var56 = arg5 + 2 & 0x3;
            class225 var57;
            if (var24 == -1 && var23.field2129 == null) {
                var57 = var23.method3560(4, var56 + 4, var31, var33, var32, var34);
            } else {
                var57 = new class78(arg4, 4, var56 + 4, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4110(arg0, arg2, arg3, var32, var57, (class225) null, 256, var56, 0, 0, var35, var37);
        } else if (arg6 == 8) {
            int var58 = 8;
            long var59 = var21.method4059(arg0, arg2, arg3);
            if (var59 != 0L) {
                var58 = Statics.method4396(class232.method4938(var59)).field2139 / 2;
            }
            int var61 = arg5 + 2 & 0x3;
            class225 var62;
            class225 var63;
            if (var24 == -1 && var23.field2129 == null) {
                var62 = var23.method3560(4, arg5 + 4, var31, var33, var32, var34);
                var63 = var23.method3560(4, var61 + 4, var31, var33, var32, var34);
            } else {
                var62 = new class78(arg4, 4, arg5 + 4, var20, arg2, arg3, var24, var23.field2149, (class225) null);
                var63 = new class78(arg4, 4, var61 + 4, var20, arg2, arg3, var24, var23.field2149, (class225) null);
            }
            var21.method4110(arg0, arg2, arg3, var32, var62, var63, 256, arg5, class80.field1004[arg5] * var58, class80.field1005[arg5] * var58, var35, var37);
        }
    }

    @ObfuscatedName("fm.jf(IIB)V")
    public static final void method2966(int arg0, int arg1) {
        class359 var2 = field615[Statics.field1812][arg0][arg1];
        if (var2 == null) {
            Statics.field3.method4133(Statics.field1812, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class102 var5 = null;
        for (class102 var6 = (class102) var2.method6089(); var6 != null; var6 = (class102) var2.method6098()) {
            class204 var7 = class204.method3453(var6.field1311);
            long var8 = (long) var7.field2197;
            if (var7.field2196 == 1) {
                var8 *= var6.field1314 < Integer.MAX_VALUE ? (long) (var6.field1314 + 1) : (long) var6.field1314;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3.method4133(Statics.field1812, arg0, arg1);
            return;
        }
        var2.method6092(var5);
        class102 var10 = null;
        class102 var11 = null;
        for (class102 var12 = (class102) var2.method6089(); var12 != null; var12 = (class102) var2.method6098()) {
            if (var5.field1311 != var12.field1311) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1311 != var12.field1311 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class232.method2538(arg0, arg1, 3, false, 0);
        Statics.field3.method4040(Statics.field1812, arg0, arg1, method5746(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1812), var5, var13, var10, var11);
    }

    @ObfuscatedName("fm.jw(ZLsq;B)V")
    public static final void method2967(boolean arg0, class477 arg1) {
        field608 = 0;
        field540 = 0;
        arg1.method7847();
        int var2 = arg1.method7853(8);
        if (var2 < field538) {
            for (int var3 = var2; var3 < field538; var3++) {
                field609[++field608 - 1] = field539[var3];
            }
        }
        if (var2 > field538) {
            throw new RuntimeException("");
        }
        field538 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = field539[var4];
            class98 var6 = field682[var5];
            int var7 = arg1.method7853(1);
            if (var7 == 0) {
                field539[++field538 - 1] = var5;
                var6.field1206 = field494;
            } else {
                int var8 = arg1.method7853(2);
                if (var8 == 0) {
                    field539[++field538 - 1] = var5;
                    var6.field1206 = field494;
                    field663[++field540 - 1] = var5;
                } else if (var8 == 1) {
                    field539[++field538 - 1] = var5;
                    var6.field1206 = field494;
                    int var9 = arg1.method7853(3);
                    var6.method2441(var9, class212.field2333);
                    int var10 = arg1.method7853(1);
                    if (var10 == 1) {
                        field663[++field540 - 1] = var5;
                    }
                } else if (var8 == 2) {
                    field539[++field538 - 1] = var5;
                    var6.field1206 = field494;
                    if (arg1.method7853(1) == 1) {
                        int var11 = arg1.method7853(3);
                        var6.method2441(var11, class212.field2336);
                        int var12 = arg1.method7853(3);
                        var6.method2441(var12, class212.field2336);
                    } else {
                        int var13 = arg1.method7853(3);
                        var6.method2441(var13, class212.field2334);
                    }
                    int var14 = arg1.method7853(1);
                    if (var14 == 1) {
                        field663[++field540 - 1] = var5;
                    }
                } else if (var8 == 3) {
                    field609[++field608 - 1] = var5;
                }
            }
        }
        method275(arg0, arg1);
        method3228(arg1);
        for (int var15 = 0; var15 < field608; var15++) {
            int var16 = field609[var15];
            if (field494 != field682[var16].field1206) {
                field682[var16].field1277 = null;
                field682[var16] = null;
            }
        }
        if (field734.field1385 != arg1.field4904) {
            throw new RuntimeException(arg1.field4904 + class99.field1294 + field734.field1385);
        }
        for (int var17 = 0; var17 < field538; var17++) {
            if (field682[field539[var17]] == null) {
                throw new RuntimeException(var17 + class99.field1294 + field538);
            }
        }
    }

    @ObfuscatedName("at.ja(ZLsq;B)V")
    public static final void method275(boolean arg0, class477 arg1) {
        while (true) {
            byte var2 = 16;
            int var3 = 0x1 << var2;
            if (arg1.method7855(field734.field1385) >= var2 + 12) {
                int var4 = arg1.method7853(var2);
                if (var3 - 1 != var4) {
                    boolean var5 = false;
                    if (field682[var4] == null) {
                        field682[var4] = new class98();
                        var5 = true;
                    }
                    class98 var6 = field682[var4];
                    field539[++field538 - 1] = var4;
                    var6.field1206 = field494;
                    int var7 = arg1.method7853(1);
                    if (var7 == 1) {
                        field663[++field540 - 1] = var4;
                    }
                    var6.field1277 = class193.method3331(arg1.method7853(14));
                    int var8;
                    if (arg0) {
                        var8 = arg1.method7853(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = arg1.method7853(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9 = arg1.method7853(1);
                    boolean var10 = arg1.method7853(1) == 1;
                    if (var10) {
                        arg1.method7853(32);
                    }
                    int var11;
                    if (arg0) {
                        var11 = arg1.method7853(8);
                        if (var11 > 127) {
                            var11 -= 256;
                        }
                    } else {
                        var11 = arg1.method7853(5);
                        if (var11 > 15) {
                            var11 -= 32;
                        }
                    }
                    int var12 = field613[arg1.method7853(3)];
                    if (var5) {
                        var6.field1208 = var6.field1141 = var12;
                    }
                    method7147(var6);
                    if (var6.field1210 == 0) {
                        var6.field1141 = 0;
                    }
                    var6.method2442(Statics.field1440.field1212[0] + var11, Statics.field1440.field1171[0] + var8, var9 == 1);
                    continue;
                }
            }
            arg1.method7866();
            return;
        }
    }

    @ObfuscatedName("gt.jt(Lsq;I)V")
    public static final void method3228(class477 arg0) {
        for (int var1 = 0; var1 < field540; var1++) {
            int var2 = field663[var1];
            class98 var3 = field682[var2];
            int var4 = arg0.method7909();
            if ((var4 & 0x8) != 0) {
                int var5 = arg0.method7909();
                var4 += var5 << 8;
            }
            if ((var4 & 0x1000) != 0) {
                int var6 = arg0.method7909();
                var4 += var6 << 16;
            }
            if ((var4 & 0x10) != 0) {
                int var7 = arg0.method8115();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = arg0.method7934();
                if (var3.field1183 == var7 && var7 != -1) {
                    int var9 = class206.method5217(var7).field2277;
                    if (var9 == 1) {
                        var3.field1184 = 0;
                        var3.field1194 = 0;
                        var3.field1189 = var8;
                        var3.field1187 = 0;
                    }
                    if (var9 == 2) {
                        var3.field1187 = 0;
                    }
                } else if (var7 == -1 || var3.field1183 == -1 || class206.method5217(var7).field2270 >= class206.method5217(var3.field1183).field2270) {
                    var3.field1183 = var7;
                    var3.field1184 = 0;
                    var3.field1194 = 0;
                    var3.field1189 = var8;
                    var3.field1187 = 0;
                    var3.field1216 = var3.field1211;
                }
            }
            if ((var4 & 0x20000) != 0) {
                int var10 = arg0.method7909();
                int[] var11 = new int[8];
                short[] var12 = new short[8];
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((var10 & 0x1 << var13) == 0) {
                        var11[var13] = -1;
                        var12[var13] = -1;
                    } else {
                        var11[var13] = arg0.method7922();
                        var12[var13] = (short) arg0.method7912();
                    }
                }
                var3.method2446(var11, var12);
            }
            if ((var4 & 0x2000) != 0) {
                var3.method2453(arg0.method7935());
            }
            if ((var4 & 0x4) != 0) {
                var3.field1173 = arg0.method7944();
                var3.field1173 += arg0.method7898() << 16;
                int var14 = 16777215;
                if (var3.field1173 == var14) {
                    var3.field1173 = -1;
                }
            }
            if ((var4 & 0x10000) != 0) {
                int var15 = arg0.method7900();
                var3.field1146 = (var15 & 0x1) == 0 ? var3.field1277.field1998 : arg0.method8115();
                var3.field1147 = (var15 & 0x2) == 0 ? var3.field1277.field1995 : arg0.method7946();
                var3.field1167 = (var15 & 0x4) == 0 ? var3.field1277.field2000 : arg0.method7944();
                var3.field1149 = (var15 & 0x8) == 0 ? var3.field1277.field2001 : arg0.method7905();
                var3.field1150 = (var15 & 0x10) == 0 ? var3.field1277.field2029 : arg0.method7946();
                var3.field1151 = (var15 & 0x20) == 0 ? var3.field1277.field2003 : arg0.method7946();
                var3.field1152 = (var15 & 0x40) == 0 ? var3.field1277.field2004 : arg0.method7944();
                var3.field1153 = (var15 & 0x80) == 0 ? var3.field1277.field2005 : arg0.method8115();
                var3.field1154 = (var15 & 0x100) == 0 ? var3.field1277.field2006 : arg0.method7944();
                var3.field1155 = (var15 & 0x200) == 0 ? var3.field1277.field2007 : arg0.method7944();
                var3.field1156 = (var15 & 0x400) == 0 ? var3.field1277.field2008 : arg0.method7944();
                var3.field1201 = (var15 & 0x800) == 0 ? var3.field1277.field2009 : arg0.method7944();
                var3.field1213 = (var15 & 0x1000) == 0 ? var3.field1277.field2010 : arg0.method7946();
                var3.field1159 = (var15 & 0x2000) == 0 ? var3.field1277.field1990 : arg0.method8115();
                var3.field1145 = (var15 & 0x4000) == 0 ? var3.field1277.field1997 : arg0.method7905();
            }
            if ((var4 & 0x20) != 0) {
                var3.field1148 = arg0.method8115();
                int var16 = arg0.method7908();
                var3.field1192 = var16 >> 16;
                var3.field1191 = (var16 & 0xFFFF) + field494;
                var3.field1188 = 0;
                var3.field1176 = 0;
                if (var3.field1191 > field494) {
                    var3.field1188 = -1;
                }
                if (var3.field1148 == 65535) {
                    var3.field1148 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var17 = arg0.method7909();
                if (var17 > 0) {
                    for (int var18 = 0; var18 < var17; var18++) {
                        int var19 = -1;
                        int var20 = -1;
                        int var21 = -1;
                        int var22 = arg0.method7918();
                        if (var22 == 32767) {
                            var22 = arg0.method7918();
                            var20 = arg0.method7918();
                            var19 = arg0.method7918();
                            var21 = arg0.method7918();
                        } else if (var22 == 32766) {
                            var22 = -1;
                        } else {
                            var20 = arg0.method7918();
                        }
                        int var23 = arg0.method7918();
                        var3.method2249(var22, var20, var19, var21, field494, var23);
                    }
                }
                int var24 = arg0.method7935();
                if (var24 > 0) {
                    for (int var25 = 0; var25 < var24; var25++) {
                        int var26 = arg0.method7918();
                        int var27 = arg0.method7918();
                        if (var27 == 32767) {
                            var3.method2252(var26);
                        } else {
                            int var28 = arg0.method7918();
                            int var29 = arg0.method7935();
                            int var30 = var27 > 0 ? arg0.method7935() : var29;
                            var3.method2262(var26, field494, var27, var28, var29, var30);
                        }
                    }
                }
            }
            if ((var4 & 0x8000) != 0) {
                var3.field1202 = field494 + arg0.method8115();
                var3.field1160 = field494 + arg0.method7905();
                var3.field1204 = arg0.method8163();
                var3.field1186 = arg0.method7888();
                var3.field1166 = arg0.method7888();
                var3.field1207 = (byte) arg0.method7909();
            }
            if ((var4 & 0x200) != 0) {
                var3.field1190 = arg0.method7908();
            }
            if ((var4 & 0x800) != 0) {
                int var31 = arg0.method7909();
                if ((var31 & 0x1) == 1) {
                    var3.method2467();
                } else {
                    int[] var32 = null;
                    if ((var31 & 0x2) == 2) {
                        int var33 = arg0.method7898();
                        var32 = new int[var33];
                        for (int var34 = 0; var34 < var33; var34++) {
                            int var35 = arg0.method7944();
                            int var36 = var35 == 65535 ? -1 : var35;
                            var32[var34] = var36;
                        }
                    }
                    short[] var37 = null;
                    if ((var31 & 0x4) == 4) {
                        int var38 = 0;
                        if (var3.field1277.field2013 != null) {
                            var38 = var3.field1277.field2013.length;
                        }
                        var37 = new short[var38];
                        for (int var39 = 0; var39 < var38; var39++) {
                            var37[var39] = (short) arg0.method7905();
                        }
                    }
                    short[] var40 = null;
                    if ((var31 & 0x8) == 8) {
                        int var41 = 0;
                        if (var3.field1277.field2015 != null) {
                            var41 = var3.field1277.field2015.length;
                        }
                        var40 = new short[var41];
                        for (int var42 = 0; var42 < var41; var42++) {
                            var40[var42] = (short) arg0.method7944();
                        }
                    }
                    long var43 = (long) (++class98.field1285 - 1);
                    var3.method2448(new class192(var43, var32, var37, var40));
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.method2497(arg0.method7950());
            }
            if ((var4 & 0x2) != 0) {
                var3.field1199 = arg0.method7950();
                var3.field1175 = 100;
            }
            if ((var4 & 0x400) != 0) {
                var3.field1193 = arg0.method7940();
                var3.field1195 = arg0.method7888();
                var3.field1203 = arg0.method8163();
                var3.field1196 = arg0.method7940();
                var3.field1197 = arg0.method7944() + field494;
                var3.field1198 = arg0.method7944() + field494;
                var3.field1163 = arg0.method7944();
                var3.field1211 = 1;
                var3.field1216 = 0;
                var3.field1193 += var3.field1212[0];
                var3.field1195 += var3.field1171[0];
                var3.field1203 += var3.field1212[0];
                var3.field1196 += var3.field1171[0];
            }
            if ((var4 & 0x40) != 0) {
                var3.field1277 = class193.method3331(arg0.method7905());
                method7147(var3);
                var3.method2463();
            }
            if ((var4 & 0x80) != 0) {
                int var45 = arg0.method7946();
                int var46 = arg0.method7946();
                var3.field1158 = arg0.method7909() == 1;
                if (field558 >= 212) {
                    var3.field1181 = var45;
                    var3.field1177 = var46;
                } else {
                    int var47 = var3.field1200 - (var45 - Statics.field218 - Statics.field218) * 64;
                    int var48 = var3.field1205 - (var46 - Statics.field1865 - Statics.field1865) * 64;
                    if (var47 != 0 || var48 != 0) {
                        var3.field1165 = class419.method3536(var47, var48);
                    }
                }
            }
            if ((var4 & 0x4000) != 0) {
                int var49 = arg0.method7934();
                if ((var49 & 0x1) == 1) {
                    var3.method2485();
                } else {
                    int[] var50 = null;
                    if ((var49 & 0x2) == 2) {
                        int var51 = arg0.method7898();
                        var50 = new int[var51];
                        for (int var52 = 0; var52 < var51; var52++) {
                            int var53 = arg0.method8115();
                            int var54 = var53 == 65535 ? -1 : var53;
                            var50[var52] = var54;
                        }
                    }
                    short[] var55 = null;
                    if ((var49 & 0x4) == 4) {
                        int var56 = 0;
                        if (var3.field1277.field2013 != null) {
                            var56 = var3.field1277.field2013.length;
                        }
                        var55 = new short[var56];
                        for (int var57 = 0; var57 < var56; var57++) {
                            var55[var57] = (short) arg0.method7946();
                        }
                    }
                    short[] var58 = null;
                    if ((var49 & 0x8) == 8) {
                        int var59 = 0;
                        if (var3.field1277.field2015 != null) {
                            var59 = var3.field1277.field2015.length;
                        }
                        var58 = new short[var59];
                        for (int var60 = 0; var60 < var59; var60++) {
                            var58[var60] = (short) arg0.method8115();
                        }
                    }
                    long var61 = (long) (++class98.field1283 - 1);
                    var3.method2450(new class192(var61, var50, var55, var58));
                }
            }
        }
    }

    @ObfuscatedName("qa.je(Ldz;I)V")
    public static void method7147(class98 arg0) {
        arg0.field1143 = arg0.field1277.field1994;
        arg0.field1210 = arg0.field1277.field2024;
        arg0.field1167 = arg0.field1277.field2000;
        arg0.field1149 = arg0.field1277.field2001;
        arg0.field1150 = arg0.field1277.field2029;
        arg0.field1151 = arg0.field1277.field2003;
        arg0.field1145 = arg0.field1277.field1997;
        arg0.field1146 = arg0.field1277.field1998;
        arg0.field1147 = arg0.field1277.field1995;
        arg0.field1152 = arg0.field1277.field2004;
        arg0.field1153 = arg0.field1277.field2005;
        arg0.field1154 = arg0.field1277.field2006;
        arg0.field1155 = arg0.field1277.field2007;
        arg0.field1156 = arg0.field1277.field2008;
        arg0.field1201 = arg0.field1277.field2009;
        arg0.field1213 = arg0.field1277.field2010;
        arg0.field1159 = arg0.field1277.field1990;
    }

    @ObfuscatedName("kw.jq(Ldh;IILis;I)V")
    public static final void method4886(class90 arg0, int arg1, int arg2, class212 arg3) {
        int var4 = arg0.field1212[0];
        int var5 = arg0.field1171[0];
        int var6 = arg0.method2197();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method2197();
        field572.field2326 = arg1;
        field572.field2332 = arg2;
        field572.field2327 = 1;
        field572.field2328 = 1;
        class63 var10 = field572;
        int var11 = class213.method201(var4, var5, var9, var10, field616[arg0.field1102], true, field543, field774);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method2203(field543[var12], field774[var12], arg3);
            }
        }
    }

    @ObfuscatedName("cc.jh(I)V")
    public static void method1086() {
        field759 = 0;
        field768 = false;
    }

    @ObfuscatedName("po.jy(B)V")
    public static void method6919() {
        method1086();
        field630[0] = class333.field4060;
        field709[0] = "";
        field627[0] = 1006;
        field680[0] = false;
        field759 = 1;
    }

    @ObfuscatedName("oc.jv(B)Z")
    public static final boolean method6703() {
        return field768;
    }

    @ObfuscatedName("gs.js(IIIII)V")
    public static final void method3166(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field695; var4++) {
            if (field596[var4] + field586[var4] > arg0 && field596[var4] < arg0 + arg2 && field720[var4] + field703[var4] > arg1 && field720[var4] < arg1 + arg3) {
                field723[var4] = true;
            }
        }
    }

    @ObfuscatedName("hq.jl(IIIIB)V")
    public static final void method3449(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field695; var4++) {
            if (field596[var4] + field586[var4] > arg0 && field596[var4] < arg0 + arg2 && field720[var4] + field703[var4] > arg1 && field720[var4] < arg1 + arg3) {
                field698[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ji(B)V")
    public final void method1661() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field759 - 1; var2++) {
                if (field627[var2] < 1000 && field627[var2 + 1] > 1000) {
                    String var3 = field709[var2];
                    field709[var2] = field709[var2 + 1];
                    field709[var2 + 1] = var3;
                    String var4 = field630[var2];
                    field630[var2] = field630[var2 + 1];
                    field630[var2 + 1] = var4;
                    int var5 = field627[var2];
                    field627[var2] = field627[var2 + 1];
                    field627[var2 + 1] = var5;
                    int var6 = field625[var2];
                    field625[var2] = field625[var2 + 1];
                    field625[var2 + 1] = var6;
                    int var7 = field626[var2];
                    field626[var2] = field626[var2 + 1];
                    field626[var2 + 1] = var7;
                    int var8 = field684[var2];
                    field684[var2] = field684[var2 + 1];
                    field684[var2 + 1] = var8;
                    int var9 = field629[var2];
                    field629[var2] = field629[var2 + 1];
                    field629[var2 + 1] = var9;
                    boolean var10 = field680[var2];
                    field680[var2] = field680[var2 + 1];
                    field680[var2 + 1] = var10;
                    var1 = false;
                }
            }
        }
        if (field602 != null) {
            return;
        }
        int var11 = class36.field235;
        if (!field768) {
            int var22 = field759 - 1;
            if ((var11 == 1 || !Statics.field3700 && var11 == 4) && this.method1168()) {
                var11 = 2;
            }
            if ((var11 == 1 || !Statics.field3700 && var11 == 4) && field759 > 0) {
                method1080(var22);
            }
            if (var11 == 2 && field759 > 0) {
                this.method1169(class36.field236, class36.field237);
            }
            return;
        }
        if (var11 != 1 && (Statics.field3700 || var11 != 4)) {
            int var12 = class36.field228;
            int var13 = class36.field227;
            if (var12 < Statics.field115 - 10 || var12 > Statics.field1392 + Statics.field115 + 10 || var13 < Statics.field928 - 10 || var13 > Statics.field928 + Statics.field159 + 10) {
                field768 = false;
                method3166(Statics.field115, Statics.field928, Statics.field1392, Statics.field159);
            }
        }
        if (var11 != 1 && Statics.field3700 || var11 != 4) {
            return;
        }
        int var14 = Statics.field115;
        int var15 = Statics.field928;
        int var16 = Statics.field1392;
        int var17 = class36.field236;
        int var18 = class36.field237;
        int var19 = -1;
        for (int var20 = 0; var20 < field759; var20++) {
            int var21 = (field759 - 1 - var20) * 15 + var15 + 31;
            if (var17 > var14 && var17 < var14 + var16 && var18 > var21 - 13 && var18 < var21 + 3) {
                var19 = var20;
            }
        }
        if (var19 != -1) {
            method1080(var19);
        }
        field768 = false;
        method3166(Statics.field115, Statics.field928, Statics.field1392, Statics.field159);
    }

    @ObfuscatedName("client.jn(I)Z")
    public final boolean method1168() {
        int var1 = field759 - 1;
        return (field622 && field759 > 2 || method4412(var1)) && !field680[var1];
    }

    @ObfuscatedName("client.jb(III)V")
    public final void method1169(int arg0, int arg1) {
        method6717(arg0, arg1);
        int var3 = arg0 - field752;
        int var4 = arg1 - field577;
        Statics.field3.method4070(Statics.field1812, var3, var4, false);
        field768 = true;
    }

    @ObfuscatedName("or.jj(III)V")
    public static void method6717(int arg0, int arg1) {
        int var2 = Statics.field24.method6551(class333.field3968);
        for (int var3 = 0; var3 < field759; var3++) {
            int var4 = Statics.field24.method6551(method4394(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field759 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field208) {
            var6 = Statics.field208 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1637) {
            var7 = Statics.field1637 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field115 = var6;
        Statics.field928 = var7;
        Statics.field1392 = var2;
        Statics.field159 = field759 * 15 + 22;
    }

    @ObfuscatedName("jo.jx(II)Z")
    public static final boolean method4412(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field627[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cd.kk(II)V")
    public static final void method1080(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field625[arg0];
        int var2 = field626[arg0];
        int var3 = field627[arg0];
        int var4 = field684[arg0];
        int var5 = field629[arg0];
        String var6 = field630[arg0];
        String var7 = field709[arg0];
        method4962(var1, var2, var3, var4, var5, var6, var7, class36.field236, class36.field237);
    }

    @ObfuscatedName("et.kx(Lcm;III)V")
    public static final void method2717(class72 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            method4962(arg0.field877, arg0.field873, arg0.field874, arg0.field875, arg0.field876, arg0.field872, arg0.field878, arg1, arg2);
        }
    }

    @ObfuscatedName("lk.ku(IIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method4962(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 49) {
            class90 var9 = field758[arg3];
            if (var9 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var10 = class285.method2741(class283.field3087, field734.field1380);
                var10.field3169.method7886(field713.method3741(82) ? 1 : 0);
                var10.field3169.method7942(arg3);
                field734.method2635(var10);
            }
        }
        if (arg2 == 19) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var11 = class285.method2741(class283.field3072, field734.field1380);
            var11.field3169.method7943(arg3);
            var11.field3169.method7942(Statics.field1865 + arg1);
            var11.field3169.method7941(Statics.field218 + arg0);
            var11.field3169.method7886(field713.method3741(82) ? 1 : 0);
            field734.method2635(var11);
        }
        if (arg2 == 23) {
            if (field768) {
                Statics.field3.method4071();
            } else {
                Statics.field3.method4070(Statics.field1812, arg0, arg1, true);
            }
        }
        if (arg2 == 7) {
            class98 var12 = field682[arg3];
            if (var12 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var13 = class285.method2741(class283.field3133, field734.field1380);
                var13.field3169.method7941(Statics.field1480);
                var13.field3169.method7943(Statics.field165);
                var13.field3169.method7904(field713.method3741(82) ? 1 : 0);
                var13.field3169.method7887(arg3);
                var13.field3169.method8003(Statics.field845);
                field734.method2635(var13);
            }
        }
        if (arg2 == 1003) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            class98 var14 = field682[arg3];
            if (var14 != null) {
                class193 var15 = var14.field1277;
                if (var15.field2032 != null) {
                    var15 = var15.method3355();
                }
                if (var15 != null) {
                    class285 var16 = class285.method2741(class283.field3097, field734.field1380);
                    var16.field3169.method7943(var15.field2026);
                    field734.method2635(var16);
                }
            }
        }
        if (arg2 == 51) {
            class90 var17 = field758[arg3];
            if (var17 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var18 = class285.method2741(class283.field3106, field734.field1380);
                var18.field3169.method7942(arg3);
                var18.field3169.method7886(field713.method3741(82) ? 1 : 0);
                field734.method2635(var18);
            }
        }
        if (arg2 == 4) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var19 = class285.method2741(class283.field3153, field734.field1380);
            var19.field3169.method7887(Statics.field1865 + arg1);
            var19.field3169.method7942(Statics.field218 + arg0);
            var19.field3169.method7941(arg3);
            var19.field3169.method8066(field713.method3741(82) ? 1 : 0);
            field734.method2635(var19);
        }
        if (arg2 == 28) {
            class285 var20 = class285.method2741(class283.field3084, field734.field1380);
            var20.field3169.method7957(arg1);
            field734.method2635(var20);
            class313 var21 = class313.method4802(arg1);
            if (var21 != null && var21.field3650 != null && var21.field3650[0][0] == 5) {
                int var22 = var21.field3650[0][1];
                class303.field3428[var22] = 1 - class303.field3428[var22];
                method3063(var22);
            }
        }
        if (arg2 == 25) {
            class313 var23 = class313.method670(arg1, arg0);
            if (var23 != null) {
                method575();
                method3183(arg1, arg0, class314.method5745(method3468(var23)), arg4);
                field640 = 0;
                field712 = method5808(var23);
                if (field712 == null) {
                    field712 = class333.field3824;
                }
                if (var23.field3525) {
                    field646 = var23.field3558 + class99.method308(16777215);
                } else {
                    field646 = class99.method308(65280) + var23.field3654 + class99.method308(16777215);
                }
            }
            return;
        }
        if (arg2 == 50) {
            class90 var24 = field758[arg3];
            if (var24 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var25 = class285.method2741(class283.field3130, field734.field1380);
                var25.field3169.method7887(arg3);
                var25.field3169.method7886(field713.method3741(82) ? 1 : 0);
                field734.method2635(var25);
            }
        }
        if (arg2 == 13) {
            class98 var26 = field682[arg3];
            if (var26 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var27 = class285.method2741(class283.field3149, field734.field1380);
                var27.field3169.method7887(arg3);
                var27.field3169.method8066(field713.method3741(82) ? 1 : 0);
                field734.method2635(var27);
            }
        }
        if (arg2 == 21) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var28 = class285.method2741(class283.field3068, field734.field1380);
            var28.field3169.method7942(Statics.field218 + arg0);
            var28.field3169.method7941(arg3);
            var28.field3169.method7943(Statics.field1865 + arg1);
            var28.field3169.method7886(field713.method3741(82) ? 1 : 0);
            field734.method2635(var28);
        }
        if (arg2 == 12) {
            class98 var29 = field682[arg3];
            if (var29 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var30 = class285.method2741(class283.field3125, field734.field1380);
                var30.field3169.method7887(arg3);
                var30.field3169.method7904(field713.method3741(82) ? 1 : 0);
                field734.method2635(var30);
            }
        }
        if (arg2 == 22) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var31 = class285.method2741(class283.field3127, field734.field1380);
            var31.field3169.method8157(field713.method3741(82) ? 1 : 0);
            var31.field3169.method7887(Statics.field1865 + arg1);
            var31.field3169.method7941(Statics.field218 + arg0);
            var31.field3169.method7942(arg3);
            field734.method2635(var31);
        }
        if (arg2 == 17) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var32 = class285.method2741(class283.field3101, field734.field1380);
            var32.field3169.method7941(Statics.field218 + arg0);
            var32.field3169.method7957(Statics.field95);
            var32.field3169.method7941(field643);
            var32.field3169.method7941(field491);
            var32.field3169.method7943(arg3);
            var32.field3169.method7887(Statics.field1865 + arg1);
            var32.field3169.method8066(field713.method3741(82) ? 1 : 0);
            field734.method2635(var32);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2889.method7435(arg2, arg3, new class304(arg0), new class304(arg1));
        }
        if (arg2 == 18) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var33 = class285.method2741(class283.field3063, field734.field1380);
            var33.field3169.method7942(Statics.field218 + arg0);
            var33.field3169.method7887(Statics.field1865 + arg1);
            var33.field3169.method8157(field713.method3741(82) ? 1 : 0);
            var33.field3169.method7942(arg3);
            field734.method2635(var33);
        }
        if (arg2 == 45) {
            class90 var34 = field758[arg3];
            if (var34 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var35 = class285.method2741(class283.field3102, field734.field1380);
                var35.field3169.method7904(field713.method3741(82) ? 1 : 0);
                var35.field3169.method7887(arg3);
                field734.method2635(var35);
            }
        }
        if (arg2 == 46) {
            class90 var36 = field758[arg3];
            if (var36 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var37 = class285.method2741(class283.field3100, field734.field1380);
                var37.field3169.method7943(arg3);
                var37.field3169.method7904(field713.method3741(82) ? 1 : 0);
                field734.method2635(var37);
            }
        }
        if (arg2 == 1001) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var38 = class285.method2741(class283.field3099, field734.field1380);
            var38.field3169.method7943(arg3);
            var38.field3169.method8157(field713.method3741(82) ? 1 : 0);
            var38.field3169.method7887(Statics.field1865 + arg1);
            var38.field3169.method7887(Statics.field218 + arg0);
            field734.method2635(var38);
        }
        if (arg2 == 10) {
            class98 var39 = field682[arg3];
            if (var39 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var40 = class285.method2741(class283.field3077, field734.field1380);
                var40.field3169.method8066(field713.method3741(82) ? 1 : 0);
                var40.field3169.method7941(arg3);
                field734.method2635(var40);
            }
        }
        if (arg2 == 11) {
            class98 var41 = field682[arg3];
            if (var41 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var42 = class285.method2741(class283.field3115, field734.field1380);
                var42.field3169.method8157(field713.method3741(82) ? 1 : 0);
                var42.field3169.method7887(arg3);
                field734.method2635(var42);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class313 var43 = class313.method670(arg1, arg0);
            if (var43 != null) {
                method5786(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 5) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var44 = class285.method2741(class283.field3119, field734.field1380);
            var44.field3169.method7943(Statics.field1865 + arg1);
            var44.field3169.method7943(arg3);
            var44.field3169.method7941(Statics.field218 + arg0);
            var44.field3169.method8066(field713.method3741(82) ? 1 : 0);
            field734.method2635(var44);
        }
        if (arg2 == 48) {
            class90 var45 = field758[arg3];
            if (var45 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var46 = class285.method2741(class283.field3129, field734.field1380);
                var46.field3169.method8157(field713.method3741(82) ? 1 : 0);
                var46.field3169.method7887(arg3);
                field734.method2635(var46);
            }
        }
        if (arg2 == 44) {
            class90 var47 = field758[arg3];
            if (var47 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var48 = class285.method2741(class283.field3070, field734.field1380);
                var48.field3169.method7887(arg3);
                var48.field3169.method8066(field713.method3741(82) ? 1 : 0);
                field734.method2635(var48);
            }
        }
        if (arg2 == 2) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var49 = class285.method2741(class283.field3064, field734.field1380);
            var49.field3169.method7904(field713.method3741(82) ? 1 : 0);
            var49.field3169.method7887(field491);
            var49.field3169.method7954(Statics.field95);
            var49.field3169.method7887(Statics.field218 + arg0);
            var49.field3169.method7887(arg3);
            var49.field3169.method7942(Statics.field1865 + arg1);
            var49.field3169.method7887(field643);
            field734.method2635(var49);
        }
        if (arg2 == 8) {
            class98 var50 = field682[arg3];
            if (var50 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var51 = class285.method2741(class283.field3060, field734.field1380);
                var51.field3169.method7941(field643);
                var51.field3169.method7942(arg3);
                var51.field3169.method7887(field491);
                var51.field3169.method8066(field713.method3741(82) ? 1 : 0);
                var51.field3169.method7954(Statics.field95);
                field734.method2635(var51);
            }
        }
        if (arg2 == 29) {
            class285 var52 = class285.method2741(class283.field3084, field734.field1380);
            var52.field3169.method7957(arg1);
            field734.method2635(var52);
            class313 var53 = class313.method4802(arg1);
            if (var53 != null && var53.field3650 != null && var53.field3650[0][0] == 5) {
                int var54 = var53.field3650[0][1];
                if (class303.field3428[var54] != var53.field3652[0]) {
                    class303.field3428[var54] = var53.field3652[0];
                    method3063(var54);
                }
            }
        }
        if (arg2 == 6) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var55 = class285.method2741(class283.field3089, field734.field1380);
            var55.field3169.method7887(arg3);
            var55.field3169.method7943(Statics.field218 + arg0);
            var55.field3169.method7942(Statics.field1865 + arg1);
            var55.field3169.method7886(field713.method3741(82) ? 1 : 0);
            field734.method2635(var55);
        }
        if (arg2 == 9) {
            class98 var56 = field682[arg3];
            if (var56 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var57 = class285.method2741(class283.field3143, field734.field1380);
                var57.field3169.method7887(arg3);
                var57.field3169.method7904(field713.method3741(82) ? 1 : 0);
                field734.method2635(var57);
            }
        }
        if (arg2 == 16) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var58 = class285.method2741(class283.field3095, field734.field1380);
            var58.field3169.method7955(Statics.field845);
            var58.field3169.method7904(field713.method3741(82) ? 1 : 0);
            var58.field3169.method7941(Statics.field218 + arg0);
            var58.field3169.method7943(Statics.field1865 + arg1);
            var58.field3169.method7942(Statics.field165);
            var58.field3169.method7943(Statics.field1480);
            var58.field3169.method7941(arg3);
            field734.method2635(var58);
        }
        if (arg2 == 1002) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            class285 var59 = class285.method2741(class283.field3141, field734.field1380);
            var59.field3169.method7941(arg3);
            field734.method2635(var59);
        }
        if (arg2 == 15) {
            class90 var60 = field758[arg3];
            if (var60 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var61 = class285.method2741(class283.field3151, field734.field1380);
                var61.field3169.method8066(field713.method3741(82) ? 1 : 0);
                var61.field3169.method7943(field643);
                var61.field3169.method7941(field491);
                var61.field3169.method7955(Statics.field95);
                var61.field3169.method7943(arg3);
                field734.method2635(var61);
            }
        }
        if (arg2 == 30 && field652 == null) {
            method2886(arg1, arg0);
            field652 = class313.method670(arg1, arg0);
            method1946(field652);
        }
        if (arg2 == 26) {
            method4414();
        }
        if (arg2 == 58) {
            class313 var62 = class313.method670(arg1, arg0);
            if (var62 != null) {
                if (var62.field3623 != null) {
                    class86 var63 = new class86();
                    var63.field1056 = var62;
                    var63.field1051 = arg3;
                    var63.field1055 = arg6;
                    var63.field1057 = var62.field3623;
                    class68.method69(var63);
                }
                class285 var64 = class285.method2741(class283.field3114, field734.field1380);
                var64.field3169.method7887(field491);
                var64.field3169.method7942(arg4);
                var64.field3169.method7943(field643);
                var64.field3169.method7887(arg0);
                var64.field3169.method8003(arg1);
                var64.field3169.method7955(Statics.field95);
                field734.method2635(var64);
            }
        }
        if (arg2 == 1004) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            class285 var65 = class285.method2741(class283.field3074, field734.field1380);
            var65.field3169.method7943(arg3);
            var65.field3169.method7887(Statics.field1865 + arg1);
            var65.field3169.method7941(Statics.field218 + arg0);
            field734.method2635(var65);
        }
        if (arg2 == 1) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var66 = class285.method2741(class283.field3080, field734.field1380);
            var66.field3169.method7887(Statics.field165);
            var66.field3169.method8066(field713.method3741(82) ? 1 : 0);
            var66.field3169.method7942(Statics.field1865 + arg1);
            var66.field3169.method7887(Statics.field218 + arg0);
            var66.field3169.method8003(Statics.field845);
            var66.field3169.method7942(Statics.field1480);
            var66.field3169.method7943(arg3);
            field734.method2635(var66);
        }
        if (arg2 == 3) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var67 = class285.method2741(class283.field3135, field734.field1380);
            var67.field3169.method8157(field713.method3741(82) ? 1 : 0);
            var67.field3169.method7943(arg3);
            var67.field3169.method7887(Statics.field218 + arg0);
            var67.field3169.method7941(Statics.field1865 + arg1);
            field734.method2635(var67);
        }
        if (arg2 == 47) {
            class90 var68 = field758[arg3];
            if (var68 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var69 = class285.method2741(class283.field3088, field734.field1380);
                var69.field3169.method7943(arg3);
                var69.field3169.method7904(field713.method3741(82) ? 1 : 0);
                field734.method2635(var69);
            }
        }
        if (arg2 == 24) {
            class313 var70 = class313.method4802(arg1);
            if (var70 != null) {
                boolean var71 = true;
                if (var70.field3627 > 0) {
                    var71 = method97(var70);
                }
                if (var71) {
                    class285 var72 = class285.method2741(class283.field3084, field734.field1380);
                    var72.field3169.method7957(arg1);
                    field734.method2635(var72);
                }
            }
        }
        if (arg2 == 20) {
            field595 = arg7;
            field518 = arg8;
            field666 = 2;
            field597 = 0;
            field726 = arg0;
            field727 = arg1;
            class285 var73 = class285.method2741(class283.field3124, field734.field1380);
            var73.field3169.method7942(Statics.field1865 + arg1);
            var73.field3169.method7904(field713.method3741(82) ? 1 : 0);
            var73.field3169.method7942(arg3);
            var73.field3169.method7942(Statics.field218 + arg0);
            field734.method2635(var73);
        }
        if (arg2 == 14) {
            class90 var74 = field758[arg3];
            if (var74 != null) {
                field595 = arg7;
                field518 = arg8;
                field666 = 2;
                field597 = 0;
                field726 = arg0;
                field727 = arg1;
                class285 var75 = class285.method2741(class283.field3131, field734.field1380);
                var75.field3169.method8066(field713.method3741(82) ? 1 : 0);
                var75.field3169.method7942(Statics.field165);
                var75.field3169.method8003(Statics.field845);
                var75.field3169.method7941(Statics.field1480);
                var75.field3169.method7943(arg3);
                field734.method2635(var75);
            }
        }
        if (field640 != 0) {
            field640 = 0;
            method1946(class313.method4802(Statics.field845));
        }
        if (field767) {
            method575();
        }
    }

    @ObfuscatedName("ry.kg(ILjava/lang/String;I)V")
    public static void method7570(int arg0, String arg1) {
        int var2 = class105.field1342;
        int[] var3 = class105.field1344;
        boolean var4 = false;
        class501 var5 = new class501(arg1, Statics.field2619);
        for (int var6 = 0; var6 < var2; var6++) {
            class90 var7 = field758[var3[var6]];
            if (var7 != null && Statics.field1440 != var7 && var7.field1104 != null && var7.field1104.equals(var5)) {
                if (arg0 == 1) {
                    class285 var8 = class285.method2741(class283.field3070, field734.field1380);
                    var8.field3169.method7887(var3[var6]);
                    var8.field3169.method8066(0);
                    field734.method2635(var8);
                } else if (arg0 == 4) {
                    class285 var9 = class285.method2741(class283.field3088, field734.field1380);
                    var9.field3169.method7943(var3[var6]);
                    var9.field3169.method7904(0);
                    field734.method2635(var9);
                } else if (arg0 == 6) {
                    class285 var10 = class285.method2741(class283.field3087, field734.field1380);
                    var10.field3169.method7886(0);
                    var10.field3169.method7942(var3[var6]);
                    field734.method2635(var10);
                } else if (arg0 == 7) {
                    class285 var11 = class285.method2741(class283.field3130, field734.field1380);
                    var11.field3169.method7887(var3[var6]);
                    var11.field3169.method7886(0);
                    field734.method2635(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class108.method5191(4, "", class333.field3964 + arg1);
        }
    }

    @ObfuscatedName("ge.kd(IIIII)V")
    public static void method3183(int arg0, int arg1, int arg2, int arg3) {
        class313 var4 = class313.method670(arg0, arg1);
        if (var4 != null && var4.field3565 != null) {
            class86 var5 = new class86();
            var5.field1056 = var4;
            var5.field1057 = var4.field3565;
            class68.method69(var5);
        }
        field491 = arg3;
        field767 = true;
        Statics.field95 = arg0;
        field643 = arg1;
        Statics.field1119 = arg2;
        method1946(var4);
    }

    @ObfuscatedName("br.km(I)V")
    public static void method575() {
        if (!field767) {
            return;
        }
        class313 var0 = class313.method670(Statics.field95, field643);
        if (var0 != null && var0.field3647 != null) {
            class86 var1 = new class86();
            var1.field1056 = var0;
            var1.field1057 = var0.field3647;
            class68.method69(var1);
        }
        field491 = -1;
        field767 = false;
        method1946(var0);
    }

    @ObfuscatedName("fz.kn(III)V")
    public static void method2886(int arg0, int arg1) {
        class285 var2 = class285.method2741(class283.field3092, field734.field1380);
        var2.field3169.method7887(arg1);
        var2.field3169.method7955(arg0);
        field734.method2635(var2);
    }

    @ObfuscatedName("mu.kh(IIIILjava/lang/String;I)V")
    public static void method5786(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class313 var5 = class313.method670(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3632 != null) {
            class86 var6 = new class86();
            var6.field1056 = var5;
            var6.field1051 = arg0;
            var6.field1055 = arg4;
            var6.field1057 = var5.field3632;
            class68.method69(var6);
        }
        boolean var7 = true;
        if (var5.field3627 > 0) {
            var7 = method97(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method3468(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class285 var11 = class285.method2741(class283.field3075, field734.field1380);
            var11.field3169.method7957(arg1);
            var11.field3169.method7887(arg2);
            var11.field3169.method7887(arg3);
            field734.method2635(var11);
        }
        if (arg0 == 2) {
            class285 var12 = class285.method2741(class283.field3139, field734.field1380);
            var12.field3169.method7957(arg1);
            var12.field3169.method7887(arg2);
            var12.field3169.method7887(arg3);
            field734.method2635(var12);
        }
        if (arg0 == 3) {
            class285 var13 = class285.method2741(class283.field3132, field734.field1380);
            var13.field3169.method7957(arg1);
            var13.field3169.method7887(arg2);
            var13.field3169.method7887(arg3);
            field734.method2635(var13);
        }
        if (arg0 == 4) {
            class285 var14 = class285.method2741(class283.field3057, field734.field1380);
            var14.field3169.method7957(arg1);
            var14.field3169.method7887(arg2);
            var14.field3169.method7887(arg3);
            field734.method2635(var14);
        }
        if (arg0 == 5) {
            class285 var15 = class285.method2741(class283.field3117, field734.field1380);
            var15.field3169.method7957(arg1);
            var15.field3169.method7887(arg2);
            var15.field3169.method7887(arg3);
            field734.method2635(var15);
        }
        if (arg0 == 6) {
            class285 var16 = class285.method2741(class283.field3112, field734.field1380);
            var16.field3169.method7957(arg1);
            var16.field3169.method7887(arg2);
            var16.field3169.method7887(arg3);
            field734.method2635(var16);
        }
        if (arg0 == 7) {
            class285 var17 = class285.method2741(class283.field3062, field734.field1380);
            var17.field3169.method7957(arg1);
            var17.field3169.method7887(arg2);
            var17.field3169.method7887(arg3);
            field734.method2635(var17);
        }
        if (arg0 == 8) {
            class285 var18 = class285.method2741(class283.field3078, field734.field1380);
            var18.field3169.method7957(arg1);
            var18.field3169.method7887(arg2);
            var18.field3169.method7887(arg3);
            field734.method2635(var18);
        }
        if (arg0 == 9) {
            class285 var19 = class285.method2741(class283.field3081, field734.field1380);
            var19.field3169.method7957(arg1);
            var19.field3169.method7887(arg2);
            var19.field3169.method7887(arg3);
            field734.method2635(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class285 var20 = class285.method2741(class283.field3079, field734.field1380);
        var20.field3169.method7957(arg1);
        var20.field3169.method7887(arg2);
        var20.field3169.method7887(arg3);
        field734.method2635(var20);
    }

    @ObfuscatedName("er.kf(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2684(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method6051(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("eh.kw(Ljava/lang/String;Ljava/lang/String;IIIIIB)V")
    public static final void method2790(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method6051(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("nu.kj(Ljava/lang/String;Ljava/lang/String;IIIIIZB)V")
    public static final void method6051(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field768 || field759 >= 500) {
            return;
        }
        field630[field759] = arg0;
        field709[field759] = arg1;
        field627[field759] = arg2;
        field684[field759] = arg3;
        field625[field759] = arg4;
        field626[field759] = arg5;
        field629[field759] = arg6;
        field680[field759] = arg7;
        field759++;
    }

    @ObfuscatedName("it.kr(II)Ljava/lang/String;")
    public static String method4394(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field709[arg0].length() > 0) {
            return field630[arg0] + class333.field3898 + field709[arg0];
        } else {
            return field630[arg0];
        }
    }

    @ObfuscatedName("ia.kc(IIIII)V")
    public static final void method4236(int arg0, int arg1, int arg2, int arg3) {
        if (field640 == 0 && !field767) {
            method2684(class333.field3970, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class232.method3432(); var8++) {
            long var9 = class232.method3105(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class232.method2893(var8);
                int var12 = class232.method3797(class232.field2736[var8]);
                int var13 = var12;
                long var14 = class232.field2736[var8];
                int var16 = (int) (var14 >>> 14 & 0x3L);
                int var19 = class232.method94(var8);
                if (var16 == 2 && Statics.field3.method4054(Statics.field1812, var11, var12, var9) >= 0) {
                    class203 var20 = Statics.method4396(var19);
                    if (var20.field2129 != null) {
                        var20 = var20.method3545();
                    }
                    if (var20 == null) {
                        continue;
                    }
                    class92 var21 = null;
                    for (class92 var22 = (class92) field548.method6089(); var22 != null; var22 = (class92) field548.method6098()) {
                        if (Statics.field1812 == var22.field1125 && var22.field1126 == var11 && var22.field1138 == var13 && var22.field1136 == var19) {
                            var21 = var22;
                            break;
                        }
                    }
                    if (field640 == 1) {
                        method2684(class333.field3965, field641 + " " + class99.field1292 + " " + class99.method308(65535) + var20.field2142, 1, var19, var11, var13);
                    } else if (!field767) {
                        String[] var23 = var20.field2166;
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if ((var21 == null || var21.method2236(var24)) && var23[var24] != null) {
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 3;
                                    }
                                    if (var24 == 1) {
                                        var25 = 4;
                                    }
                                    if (var24 == 2) {
                                        var25 = 5;
                                    }
                                    if (var24 == 3) {
                                        var25 = 6;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1001;
                                    }
                                    method2684(var23[var24], class99.method308(65535) + var20.field2142, var25, var19, var11, var13);
                                }
                            }
                        }
                        method2684(class333.field3889, class99.method308(65535) + var20.field2142, 1002, var20.field2168, var11, var13);
                    } else if ((Statics.field1119 & 0x4) == 4) {
                        method2684(field712, field646 + " " + class99.field1292 + " " + class99.method308(65535) + var20.field2142, 2, var19, var11, var13);
                    }
                }
                if (var16 == 1) {
                    class98 var26 = field682[var19];
                    if (var26 == null) {
                        continue;
                    }
                    if (var26.field1277.field1994 == 1 && (var26.field1200 & 0x7F) == 64 && (var26.field1205 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < field538; var27++) {
                            class98 var28 = field682[field539[var27]];
                            if (var28 != null && var26 != var28 && var28.field1277.field1994 == 1 && var26.field1200 == var28.field1200 && var26.field1205 == var28.field1205) {
                                method4799(var28, field539[var27], var11, var13);
                            }
                        }
                        int var29 = class105.field1342;
                        int[] var30 = class105.field1344;
                        for (int var31 = 0; var31 < var29; var31++) {
                            class90 var32 = field758[var30[var31]];
                            if (var32 != null && var26.field1200 == var32.field1200 && var26.field1205 == var32.field1205) {
                                method203(var32, var30[var31], var11, var13);
                            }
                        }
                    }
                    method4799(var26, var19, var11, var13);
                }
                if (var16 == 0) {
                    class90 var33 = field758[var19];
                    if (var33 == null) {
                        continue;
                    }
                    if ((var33.field1200 & 0x7F) == 64 && (var33.field1205 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < field538; var34++) {
                            class98 var35 = field682[field539[var34]];
                            if (var35 != null && var35.field1277.field1994 == 1 && var33.field1200 == var35.field1200 && var33.field1205 == var35.field1205) {
                                method4799(var35, field539[var34], var11, var13);
                            }
                        }
                        int var36 = class105.field1342;
                        int[] var37 = class105.field1344;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class90 var39 = field758[var37[var38]];
                            if (var39 != null && var33 != var39 && var33.field1200 == var39.field1200 && var33.field1205 == var39.field1205) {
                                method203(var39, var37[var38], var11, var13);
                            }
                        }
                    }
                    if (field614 == var19) {
                        var4 = var9;
                    } else {
                        method203(var33, var19, var11, var13);
                    }
                }
                if (var16 == 3) {
                    class359 var40 = field615[Statics.field1812][var11][var13];
                    if (var40 != null) {
                        for (class102 var41 = (class102) var40.method6097(); var41 != null; var41 = (class102) var40.method6099()) {
                            class204 var42 = class204.method3453(var41.field1311);
                            if (field640 == 1) {
                                method2684(class333.field3965, field641 + " " + class99.field1292 + " " + class99.method308(16748608) + var42.field2185, 16, var41.field1311, var11, var13);
                            } else if (!field767) {
                                String[] var43 = var42.field2202;
                                for (int var44 = 4; var44 >= 0; var44--) {
                                    if (var41.method2526(var44)) {
                                        if (var43 != null && var43[var44] != null) {
                                            byte var45 = 0;
                                            if (var44 == 0) {
                                                var45 = 18;
                                            }
                                            if (var44 == 1) {
                                                var45 = 19;
                                            }
                                            if (var44 == 2) {
                                                var45 = 20;
                                            }
                                            if (var44 == 3) {
                                                var45 = 21;
                                            }
                                            if (var44 == 4) {
                                                var45 = 22;
                                            }
                                            method2684(var43[var44], class99.method308(16748608) + var42.field2185, var45, var41.field1311, var11, var13);
                                        } else if (var44 == 2) {
                                            method2684(class333.field3802, class99.method308(16748608) + var42.field2185, 20, var41.field1311, var11, var13);
                                        }
                                    }
                                }
                                method2684(class333.field3889, class99.method308(16748608) + var42.field2185, 1004, var41.field1311, var11, var13);
                            } else if ((Statics.field1119 & 0x1) == 1) {
                                method2684(field712, field646 + " " + class99.field1292 + " " + class99.method308(16748608) + var42.field2185, 17, var41.field1311, var11, var13);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var46 = (int) (var4 >>> 0 & 0x7FL);
            int var48 = class232.method3797(var4);
            class90 var49 = field758[field614];
            method203(var49, field614, var46, var48);
        }
    }

    @ObfuscatedName("kk.ky(Ldz;IIII)V")
    public static final void method4799(class98 arg0, int arg1, int arg2, int arg3) {
        class193 var4 = arg0.field1277;
        if (field759 >= 400) {
            return;
        }
        if (var4.field2032 != null) {
            var4 = var4.method3355();
        }
        if (var4 == null || !var4.field1999 || var4.field2020 && field656 != arg1) {
            return;
        }
        String var5 = arg0.method2479();
        if (var4.field1991 != 0 && arg0.field1190 != 0) {
            int var6 = arg0.field1190 == -1 ? var4.field1991 : arg0.field1190;
            var5 = var5 + method2452(var6, Statics.field1440.field1091) + " " + class99.field1290 + class333.field3895 + var6 + class99.field1291;
        }
        if (var4.field2020 && field633) {
            method2684(class333.field3889, class99.method308(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field640 == 1) {
            method2684(class333.field3965, field641 + " " + class99.field1292 + " " + class99.method308(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field767) {
            int var7 = var4.field2020 && field633 ? 2000 : 0;
            String[] var8 = var4.field2016;
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (arg0.method2439(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase(class333.field3967)) {
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
                        method2684(var8[var9], class99.method308(16776960) + var5, var10, arg1, arg2, arg3);
                    }
                }
            }
            if (var8 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (arg0.method2439(var11) && var8[var11] != null && var8[var11].equalsIgnoreCase(class333.field3967)) {
                        short var12 = 0;
                        if (field510 != class101.field1308) {
                            if (field510 == class101.field1303 || field510 == class101.field1302 && var4.field1991 > Statics.field1440.field1091) {
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
                            method2684(var8[var11], class99.method308(16776960) + var5, var13, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field2020 || !field633) {
                method2684(class333.field3889, class99.method308(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1119 & 0x2) == 2) {
            method2684(field712, field646 + " " + class99.field1292 + " " + class99.method308(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ae.ko(Ldh;IIII)V")
    public static final void method203(class90 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1440 == arg0 || field759 >= 400) {
            return;
        }
        String var4;
        if (arg0.field1092 == 0) {
            var4 = arg0.field1090[0] + arg0.field1104 + arg0.field1090[1] + method2452(arg0.field1091, Statics.field1440.field1091) + " " + class99.field1290 + class333.field3895 + arg0.field1091 + class99.field1291 + arg0.field1090[2];
        } else {
            var4 = arg0.field1090[0] + arg0.field1104 + arg0.field1090[1] + " " + class99.field1290 + class333.field3972 + arg0.field1092 + class99.field1291 + arg0.field1090[2];
        }
        if (field640 == 1) {
            method2684(class333.field3965, field641 + " " + class99.field1292 + " " + class99.method308(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field767) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field611[var5] != null) {
                    short var6 = 0;
                    if (field611[var5].equalsIgnoreCase(class333.field3967)) {
                        if (field509 == class101.field1308) {
                            continue;
                        }
                        if (field509 == class101.field1303 || field509 == class101.field1302 && arg0.field1091 > Statics.field1440.field1091) {
                            var6 = 2000;
                        }
                        if (Statics.field1440.field1109 == 0 || arg0.field1109 == 0) {
                            if (field509 == class101.field1307 && arg0.method2198()) {
                                var6 = 2000;
                            }
                        } else if (Statics.field1440.field1109 == arg0.field1109) {
                            var6 = 2000;
                        } else {
                            var6 = 0;
                        }
                    } else if (field612[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field610[var5] + var6;
                    method2684(field611[var5], class99.method308(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1119 & 0x8) == 8) {
            method2684(field712, field646 + " " + class99.field1292 + " " + class99.method308(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field759; var9++) {
            if (field627[var9] == 23) {
                field709[var9] = class99.method308(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("dz.kt(IIB)Ljava/lang/String;")
    public static final String method2452(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class99.method308(16711680);
        } else if (var2 < -6) {
            return class99.method308(16723968);
        } else if (var2 < -3) {
            return class99.method308(16740352);
        } else if (var2 < 0) {
            return class99.method308(16756736);
        } else if (var2 > 9) {
            return class99.method308(65280);
        } else if (var2 > 6) {
            return class99.method308(4259584);
        } else if (var2 > 3) {
            return class99.method308(8453888);
        } else if (var2 > 0) {
            return class99.method308(12648192);
        } else {
            return class99.method308(16776960);
        }
    }

    @ObfuscatedName("ck.ka(IIIIIIIII)V")
    public static final void method1144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class313.method5988(arg0)) {
            Statics.field1661 = null;
            method5696(Statics.field1732[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1661 != null) {
                method5696(Statics.field1661, -1412584499, arg1, arg2, arg3, arg4, Statics.field2361, Statics.field3025, arg7);
                Statics.field1661 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field723[var8] = true;
            }
        } else {
            field723[arg7] = true;
        }
    }

    @ObfuscatedName("my.ki([Lmy;IIIIIIIII)V")
    public static final void method5696(class313[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class488.method8233(arg2, arg3, arg4, arg5);
        class220.method3908();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class313 var10 = arg0[var9];
            if (var10 != null && (var10.field3531 == arg1 || arg1 == -1412584499 && field602 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field596[field695] = var10.field3539 + arg6;
                    field720[field695] = var10.field3540 + arg7;
                    field586[field695] = var10.field3541;
                    field703[field695] = var10.field3516;
                    var11 = ++field695 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3669 = var11;
                var10.field3670 = field494;
                if (!var10.field3525 || !Statics.method4397(var10)) {
                    if (var10.field3627 > 0) {
                        method2540(var10);
                    }
                    int var12 = var10.field3539 + arg6;
                    int var13 = var10.field3540 + arg7;
                    int var14 = var10.field3628;
                    if (field602 == var10) {
                        if (arg1 != -1412584499 && !var10.field3633) {
                            Statics.field1661 = arg0;
                            Statics.field2361 = arg6;
                            Statics.field3025 = arg7;
                            continue;
                        }
                        if (field708 && field664) {
                            int var15 = class36.field228;
                            int var16 = class36.field227;
                            int var17 = var15 - field661;
                            int var18 = var16 - field637;
                            if (var17 < field665) {
                                var17 = field665;
                            }
                            if (var10.field3541 + var17 > field665 + field660.field3541) {
                                var17 = field665 + field660.field3541 - var10.field3541;
                            }
                            if (var18 < field598) {
                                var18 = field598;
                            }
                            if (var10.field3516 + var18 > field598 + field660.field3516) {
                                var18 = field598 + field660.field3516 - var10.field3516;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3633) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3528 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3541 + var12;
                        int var22 = var10.field3516 + var13;
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
                        int var29 = var10.field3541 + var12;
                        int var30 = var10.field3516 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3525 || var25 < var27 && var26 < var28) {
                        if (var10.field3627 != 0) {
                            if (var10.field3627 == 1336) {
                                if (Statics.field2929.method2312()) {
                                    var13 += 15;
                                    Statics.field4608.method6559("Fps:" + field189, var10.field3541 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field486) {
                                        var33 = 16711680;
                                    }
                                    Statics.field4608.method6559("Mem:" + var32 + "k", var10.field3541 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3627 == 1337) {
                                field636 = var12;
                                field605 = var13;
                                method2018(var12, var13, var10.field3541, var10.field3516);
                                field723[var10.field3669] = true;
                                class488.method8233(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3627 == 1338) {
                                method5737(var10, var12, var13, var11);
                                class488.method8233(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3627 == 1339) {
                                method3537(var10, var12, var13, var11);
                                class488.method8233(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3627 == 1400) {
                                Statics.field2889.method7399(var12, var13, var10.field3541, var10.field3516, field494);
                            }
                            if (var10.field3627 == 1401) {
                                Statics.field2889.method7402(var12, var13, var10.field3541, var10.field3516);
                            }
                            if (var10.field3627 == 1402) {
                                Statics.field4164.method2274(var12, field494);
                            }
                        }
                        if (var10.field3528 == 0) {
                            if (!var10.field3525 && Statics.method4397(var10) && Statics.field1887 != var10) {
                                continue;
                            }
                            if (!var10.field3525) {
                                if (var10.field3523 > var10.field3614 - var10.field3516) {
                                    var10.field3523 = var10.field3614 - var10.field3516;
                                }
                                if (var10.field3523 < 0) {
                                    var10.field3523 = 0;
                                }
                            }
                            method5696(arg0, var10.field3526, var25, var26, var27, var28, var12 - var10.field3517, var13 - var10.field3523, var11);
                            if (var10.field3662 != null) {
                                method5696(var10.field3662, var10.field3526, var25, var26, var27, var28, var12 - var10.field3517, var13 - var10.field3523, var11);
                            }
                            class85 var34 = (class85) field648.method7619((long) var10.field3526);
                            if (var34 != null) {
                                method1144(var34.field1039, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class488.method8233(arg2, arg3, arg4, arg5);
                            class220.method3908();
                        } else if (var10.field3528 == 11) {
                            if (Statics.method4397(var10) && Statics.field1887 != var10) {
                                continue;
                            }
                            if (var10.field3662 != null) {
                                method5696(var10.field3662, var10.field3526, var25, var26, var27, var28, var12 - var10.field3517, var13 - var10.field3523, var11);
                            }
                            class488.method8233(arg2, arg3, arg4, arg5);
                            class220.method3908();
                        }
                        if (field706 || field699[var11] || field704 > 1) {
                            if (var10.field3528 == 0 && !var10.field3525 && var10.field3614 > var10.field3516) {
                                method3049(var10.field3541 + var12, var13, var10.field3523, var10.field3516, var10.field3614);
                            }
                            if (var10.field3528 != 1) {
                                if (var10.field3528 == 3) {
                                    int var35;
                                    if (method3203(var10)) {
                                        var35 = var10.field3675;
                                        if (Statics.field1887 == var10 && var10.field3554 != 0) {
                                            var35 = var10.field3554;
                                        }
                                    } else {
                                        var35 = var10.field3551;
                                        if (Statics.field1887 == var10 && var10.field3522 != 0) {
                                            var35 = var10.field3522;
                                        }
                                    }
                                    if (var10.field3555) {
                                        switch(var10.field3556.field4982) {
                                            case 1:
                                                class488.method8286(var12, var13, var10.field3541, var10.field3516, var10.field3551, var10.field3675);
                                                break;
                                            case 2:
                                                class488.method8242(var12, var13, var10.field3541, var10.field3516, var10.field3551, var10.field3675, 255 - (var10.field3628 & 0xFF), 255 - (var10.field3560 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class488.method8241(var12, var13, var10.field3541, var10.field3516, var35);
                                                } else {
                                                    class488.method8247(var12, var13, var10.field3541, var10.field3516, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class488.method8271(var12, var13, var10.field3541, var10.field3516, var35);
                                    } else {
                                        class488.method8245(var12, var13, var10.field3541, var10.field3516, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3528 == 4) {
                                    class375 var36 = var10.method5544();
                                    if (var36 != null) {
                                        String var37 = var10.field3588;
                                        int var38;
                                        if (method3203(var10)) {
                                            var38 = var10.field3675;
                                            if (Statics.field1887 == var10 && var10.field3554 != 0) {
                                                var38 = var10.field3554;
                                            }
                                            if (var10.field3589.length() > 0) {
                                                var37 = var10.field3589;
                                            }
                                        } else {
                                            var38 = var10.field3551;
                                            if (Statics.field1887 == var10 && var10.field3522 != 0) {
                                                var38 = var10.field3522;
                                            }
                                        }
                                        if (var10.field3525 && var10.field3658 != -1) {
                                            class204 var39 = class204.method3453(var10.field3658);
                                            var37 = var39.field2185;
                                            if (var37 == null) {
                                                var37 = class333.field3824;
                                            }
                                            if ((var39.field2196 == 1 || var10.field3659 != 1) && var10.field3659 != -1) {
                                                var37 = class99.method308(16748608) + var37 + class99.field1293 + " " + 'x' + method5533(var10.field3659);
                                            }
                                        }
                                        if (field652 == var10) {
                                            var37 = class333.field3973;
                                            var38 = var10.field3551;
                                        }
                                        if (!var10.field3525) {
                                            var37 = method2231(var37, var10);
                                        }
                                        var36.method6575(var37, var12, var13, var10.field3541, var10.field3516, var38, var10.field3593 ? 0 : -1, var10.field3591, var10.field3592, var10.field3590);
                                    } else if (class313.field3638) {
                                        method1946(var10);
                                    }
                                } else if (var10.field3528 == 5) {
                                    if (var10.field3525) {
                                        class492 var41;
                                        if (var10.field3658 == -1) {
                                            var41 = var10.method5539(false, Statics.field4254);
                                        } else {
                                            var41 = class204.method5007(var10.field3658, var10.field3659, var10.field3566, var10.field3567, var10.field3586, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5000;
                                            int var43 = var41.field5001;
                                            if (var10.field3530) {
                                                class488.method8260(var12, var13, var10.field3541 + var12, var10.field3516 + var13);
                                                int var44 = (var10.field3541 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3516 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3564 != 0) {
                                                            var41.method8401(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3564, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method8403(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method8331(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class488.method8233(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3541 * 4096 / var42;
                                                if (var10.field3564 != 0) {
                                                    var41.method8401(var10.field3541 / 2 + var12, var10.field3516 / 2 + var13, var10.field3564, var48);
                                                } else if (var14 != 0) {
                                                    var41.method8322(var12, var13, var10.field3541, var10.field3516, 256 - (var14 & 0xFF));
                                                } else if (var10.field3541 == var42 && var10.field3516 == var43) {
                                                    var41.method8403(var12, var13);
                                                } else {
                                                    var41.method8342(var12, var13, var10.field3541, var10.field3516);
                                                }
                                            }
                                        } else if (class313.field3638) {
                                            method1946(var10);
                                        }
                                    } else {
                                        class492 var40 = var10.method5539(method3203(var10), Statics.field4254);
                                        if (var40 != null) {
                                            var40.method8403(var12, var13);
                                        } else if (class313.field3638) {
                                            method1946(var10);
                                        }
                                    }
                                } else if (var10.field3528 == 6) {
                                    boolean var49 = method3203(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3575;
                                    } else {
                                        var50 = var10.field3610;
                                    }
                                    class231 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3658 != -1) {
                                        class204 var53 = class204.method3453(var10.field3658);
                                        if (var53 != null) {
                                            class204 var54 = var53.method3626(var10.field3659);
                                            var51 = var54.method3596(1);
                                            if (var51 == null) {
                                                method1946(var10);
                                            } else {
                                                var51.method4242();
                                                var52 = var51.field2587 / 2;
                                            }
                                        }
                                    } else if (var10.field3574 != 5) {
                                        class193 var55 = null;
                                        class192 var56 = null;
                                        if (var10.field3574 == 6) {
                                            int var57 = var10.field3571;
                                            if (var57 >= 0 && var57 < field682.length) {
                                                class98 var58 = field682[var57];
                                                if (var58 != null) {
                                                    var55 = var58.field1277;
                                                    var56 = var58.method2449();
                                                }
                                            }
                                        }
                                        class206 var59 = null;
                                        int var60 = -1;
                                        if (var50 != -1) {
                                            var59 = class206.method5217(var50);
                                            var60 = var10.field3666;
                                        }
                                        var51 = var10.method5545(var59, var60, var49, Statics.field1440.field1086, var55, var56);
                                        if (var51 == null && class313.field3638) {
                                            method1946(var10);
                                        }
                                    } else if (var10.field3571 == 0) {
                                        var51 = field705.method5233((class206) null, -1, (class206) null, -1);
                                    } else {
                                        var51 = Statics.field1440.method1936();
                                    }
                                    class220.method3952(var10.field3541 / 2 + var12, var10.field3516 / 2 + var13);
                                    int var61 = var10.field3510 * class220.field2482[var10.field3578] >> 16;
                                    int var62 = var10.field3510 * class220.field2470[var10.field3578] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3525) {
                                            var51.method4242();
                                            if (var10.field3527) {
                                                var51.method4271(0, var10.field3635, var10.field3580, var10.field3578, var10.field3617, var10.field3656 + var52 + var61, var10.field3656 + var62, var10.field3510);
                                            } else {
                                                var51.method4293(0, var10.field3635, var10.field3580, var10.field3578, var10.field3617, var10.field3656 + var52 + var61, var10.field3656 + var62);
                                            }
                                        } else {
                                            var51.method4293(0, var10.field3635, 0, var10.field3578, 0, var61, var62);
                                        }
                                    }
                                    class220.method3973();
                                } else {
                                    if (var10.field3528 == 8 && Statics.field976 == var10 && field551 == field537) {
                                        int var63 = 0;
                                        int var64 = 0;
                                        class375 var65 = Statics.field4608;
                                        String var66 = var10.field3588;
                                        String var67 = method2231(var66, var10);
                                        while (var67.length() > 0) {
                                            int var68 = var67.indexOf(class99.field1287);
                                            String var69;
                                            if (var68 == -1) {
                                                var69 = var67;
                                                var67 = "";
                                            } else {
                                                var69 = var67.substring(0, var68);
                                                var67 = var67.substring(var68 + 4);
                                            }
                                            int var70 = var65.method6551(var69);
                                            if (var70 > var63) {
                                                var63 = var70;
                                            }
                                            var64 += var65.field4389 + 1;
                                        }
                                        var63 += 6;
                                        var64 += 7;
                                        int var71 = var10.field3541 + var12 - 5 - var63;
                                        int var72 = var10.field3516 + var13 + 5;
                                        if (var71 < var12 + 5) {
                                            var71 = var12 + 5;
                                        }
                                        if (var63 + var71 > arg4) {
                                            var71 = arg4 - var63;
                                        }
                                        if (var64 + var72 > arg5) {
                                            var72 = arg5 - var64;
                                        }
                                        class488.method8241(var71, var72, var63, var64, 16777120);
                                        class488.method8271(var71, var72, var63, var64, 0);
                                        String var73 = var10.field3588;
                                        int var74 = var65.field4389 + var72 + 2;
                                        String var75 = method2231(var73, var10);
                                        while (var75.length() > 0) {
                                            int var76 = var75.indexOf(class99.field1287);
                                            String var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = "";
                                            } else {
                                                var77 = var75.substring(0, var76);
                                                var75 = var75.substring(var76 + 4);
                                            }
                                            var65.method6578(var77, var71 + 3, var74, 0, -1);
                                            var74 += var65.field4389 + 1;
                                        }
                                    }
                                    if (var10.field3528 == 9) {
                                        int var78;
                                        int var79;
                                        int var80;
                                        int var81;
                                        if (var10.field3546) {
                                            var78 = var12;
                                            var79 = var10.field3516 + var13;
                                            var80 = var10.field3541 + var12;
                                            var81 = var13;
                                        } else {
                                            var78 = var12;
                                            var79 = var13;
                                            var80 = var10.field3541 + var12;
                                            var81 = var10.field3516 + var13;
                                        }
                                        if (var10.field3581 == 1) {
                                            class488.method8250(var78, var79, var80, var81, var10.field3551);
                                        } else {
                                            method4424(var78, var79, var80, var81, var10.field3551, var10.field3581);
                                        }
                                    } else if (var10.field3528 == 12) {
                                        class311 var82 = var10.method5566();
                                        class306 var83 = var10.method5567();
                                        if (var82 != null && var83 != null && var82.method5321()) {
                                            class375 var84 = var10.method5544();
                                            if (var84 != null) {
                                                field689.method8474(var12, var13, var10.field3541, var10.field3516, var82.method5322(), var82.method5406(), var82.method5319(), var82.method5477(), var82.method5318());
                                                int var85 = var10.field3593 ? var10.field3567 : -1;
                                                if (!var82.method5403() && var82.method5313().method6403()) {
                                                    field689.method8468(var83.field3441, var85, var83.field3437, var83.field3438);
                                                    field689.method8469(var82.method5314(), var84);
                                                } else {
                                                    field689.method8468(var10.field3551, var85, var83.field3437, var83.field3438);
                                                    field689.method8469(var82.method5313(), var84);
                                                }
                                                class488.method8233(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("jk.ks(IIIIIIB)V")
    public static final void method4424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class488.field4974;
        int var18 = arg1 - class488.field4972;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class220.method3975(var19, var20, var21);
        class220.method3916(var23, var24, var25, var19, var20, var21, arg4);
        class220.method3975(var19, var21, var22);
        class220.method3916(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("dh.kq(Ljava/lang/String;Lmy;I)Ljava/lang/String;")
    public static String method2231(String arg0, class313 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method6072(arg1, var2 - 1);
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

    @ObfuscatedName("ly.kv(II)Ljava/lang/String;")
    public static final String method5533(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class99.field1294 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class99.method308(65408) + var1.substring(0, var1.length() - 8) + class333.field3976 + " " + class99.field1290 + var1 + class99.field1291 + class99.field1293;
        } else if (var1.length() > 6) {
            return " " + class99.method308(16777215) + var1.substring(0, var1.length() - 4) + class333.field3978 + " " + class99.field1290 + var1 + class99.field1291 + class99.field1293;
        } else {
            return " " + class99.method308(16776960) + var1 + class99.field1293;
        }
    }

    @ObfuscatedName("client.kl(ZI)V")
    public final void method1170(boolean arg0) {
        int var2 = field647;
        int var3 = Statics.field208;
        int var4 = Statics.field1637;
        if (class313.method5988(var2)) {
            method2041(Statics.field1732[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.kb(Lmy;I)V")
    public void method1171(class313 arg0) {
        class313 var2 = arg0.field3531 == -1 ? null : class313.method4802(arg0.field3531);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field208;
            var4 = Statics.field1637;
        } else {
            var3 = var2.field3541;
            var4 = var2.field3516;
        }
        method789(arg0, var3, var4, false);
        method2117(arg0, var3, var4);
    }

    @ObfuscatedName("ks.kz([Lmy;Lmy;ZB)V")
    public static void method4935(class313[] arg0, class313 arg1, boolean arg2) {
        int var3 = arg1.field3549 == 0 ? arg1.field3541 : arg1.field3549;
        int var4 = arg1.field3614 == 0 ? arg1.field3516 : arg1.field3614;
        method2041(arg0, arg1.field3526, var3, var4, arg2);
        if (arg1.field3662 != null) {
            method2041(arg1.field3662, arg1.field3526, var3, var4, arg2);
        }
        class85 var5 = (class85) field648.method7619((long) arg1.field3526);
        if (var5 != null) {
            int var6 = var5.field1039;
            if (class313.method5988(var6)) {
                method2041(Statics.field1732[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3627 == 1337) {
        }
    }

    @ObfuscatedName("cv.kp([Lmy;IIIZI)V")
    public static void method2041(class313[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class313 var6 = arg0[var5];
            if (var6 != null && var6.field3531 == arg1) {
                method789(var6, arg2, arg3, arg4);
                method2117(var6, arg2, arg3);
                if (var6.field3517 > var6.field3549 - var6.field3541) {
                    var6.field3517 = var6.field3549 - var6.field3541;
                }
                if (var6.field3517 < 0) {
                    var6.field3517 = 0;
                }
                if (var6.field3523 > var6.field3614 - var6.field3516) {
                    var6.field3523 = var6.field3614 - var6.field3516;
                }
                if (var6.field3523 < 0) {
                    var6.field3523 = 0;
                }
                if (var6.field3528 == 0) {
                    method4935(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bd.ke(Lmy;IIZI)V")
    public static void method789(class313 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3541;
        int var5 = arg0.field3516;
        if (arg0.field3598 == 0) {
            arg0.field3541 = arg0.field3537;
        } else if (arg0.field3598 == 1) {
            arg0.field3541 = arg1 - arg0.field3537;
        } else if (arg0.field3598 == 2) {
            arg0.field3541 = arg0.field3537 * arg1 >> 14;
        }
        if (arg0.field3534 == 0) {
            arg0.field3516 = arg0.field3538;
        } else if (arg0.field3534 == 1) {
            arg0.field3516 = arg2 - arg0.field3538;
        } else if (arg0.field3534 == 2) {
            arg0.field3516 = arg0.field3538 * arg2 >> 14;
        }
        if (arg0.field3598 == 4) {
            arg0.field3541 = arg0.field3668 * arg0.field3516 / arg0.field3579;
        }
        if (arg0.field3534 == 4) {
            arg0.field3516 = arg0.field3579 * arg0.field3541 / arg0.field3668;
        }
        if (arg0.field3627 == 1337) {
            field773 = arg0;
        }
        if (arg0.field3528 == 12) {
            arg0.method5566().method5270(arg0.field3541, arg0.field3516);
        }
        if (arg3 && arg0.field3606 != null && (arg0.field3541 != var4 || arg0.field3516 != var5)) {
            class86 var6 = new class86();
            var6.field1056 = arg0;
            var6.field1057 = arg0.field3606;
            field690.method6111(var6);
        }
    }

    @ObfuscatedName("dg.ln(Lmy;IIB)V")
    public static void method2117(class313 arg0, int arg1, int arg2) {
        if (arg0.field3550 == 0) {
            arg0.field3539 = arg0.field3535;
        } else if (arg0.field3550 == 1) {
            arg0.field3539 = (arg1 - arg0.field3541) / 2 + arg0.field3535;
        } else if (arg0.field3550 == 2) {
            arg0.field3539 = arg1 - arg0.field3541 - arg0.field3535;
        } else if (arg0.field3550 == 3) {
            arg0.field3539 = arg0.field3535 * arg1 >> 14;
        } else if (arg0.field3550 == 4) {
            arg0.field3539 = (arg0.field3535 * arg1 >> 14) + (arg1 - arg0.field3541) / 2;
        } else {
            arg0.field3539 = arg1 - arg0.field3541 - (arg0.field3535 * arg1 >> 14);
        }
        if (arg0.field3559 == 0) {
            arg0.field3540 = arg0.field3536;
        } else if (arg0.field3559 == 1) {
            arg0.field3540 = (arg2 - arg0.field3516) / 2 + arg0.field3536;
        } else if (arg0.field3559 == 2) {
            arg0.field3540 = arg2 - arg0.field3516 - arg0.field3536;
        } else if (arg0.field3559 == 3) {
            arg0.field3540 = arg0.field3536 * arg2 >> 14;
        } else if (arg0.field3559 == 4) {
            arg0.field3540 = (arg0.field3536 * arg2 >> 14) + (arg2 - arg0.field3516) / 2;
        } else {
            arg0.field3540 = arg2 - arg0.field3516 - (arg0.field3536 * arg2 >> 14);
        }
    }

    @ObfuscatedName("de.lk(Lmy;IIIIIII)V")
    public static final void method2155(class313 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field561) {
            field562 = 32;
        } else {
            field562 = 0;
        }
        field561 = false;
        if (class36.field229 == 1 || !Statics.field3700 && class36.field229 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3523 -= 4;
                method1946(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3523 += 4;
                method1946(arg0);
            } else if (arg5 >= arg1 - field562 && arg5 < field562 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3523 = (arg4 - arg3) * var8 / var9;
                method1946(arg0);
                field561 = true;
            }
        }
        if (field688 == 0) {
            return;
        }
        int var10 = arg0.field3541;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3523 += field688 * 45;
            method1946(arg0);
        }
    }

    @ObfuscatedName("fp.lv(IIIIIB)V")
    public static final void method3049(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2956[0].method8308(arg0, arg1);
        Statics.field2956[1].method8308(arg0, arg1 + arg3 - 16);
        class488.method8241(arg0, arg1 + 16, 16, arg3 - 32, field557);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class488.method8241(arg0, arg1 + 16 + var6, 16, var5, field556);
        class488.method8248(arg0, arg1 + 16 + var6, var5, field560);
        class488.method8248(arg0 + 1, arg1 + 16 + var6, var5, field560);
        class488.method8264(arg0, arg1 + 16 + var6, 16, field560);
        class488.method8264(arg0, arg1 + 17 + var6, 16, field560);
        class488.method8248(arg0 + 15, arg1 + 16 + var6, var5, field559);
        class488.method8248(arg0 + 14, arg1 + 17 + var6, var5 - 1, field559);
        class488.method8264(arg0, arg1 + 15 + var6 + var5, 16, field559);
        class488.method8264(arg0 + 1, arg1 + 14 + var6 + var5, 15, field559);
    }

    @ObfuscatedName("gi.lg(Lmy;I)Z")
    public static final boolean method3203(class313 arg0) {
        if (arg0.field3651 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3651.length; var1++) {
            int var2 = method6072(arg0, var1);
            int var3 = arg0.field3652[var1];
            if (arg0.field3651[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3651[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3651[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("nq.lr(Lmy;II)I")
    public static final int method6072(class313 arg0, int arg1) {
        if (arg0.field3650 == null || arg1 >= arg0.field3650.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3650[arg1];
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
                    var7 = field619[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field620[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field621[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class313 var11 = class313.method4802(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class204.method3453(var12).field2201 || field485)) {
                        for (int var13 = 0; var13 < var11.field3605.length; var13++) {
                            if (var12 + 1 == var11.field3605[var13]) {
                                var7 += var11.field3657[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class303.field3428[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class323.field3734[field620[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class303.field3428[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1440.field1091;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class323.field3735[var14]) {
                            var7 += field620[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class313 var17 = class313.method4802(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class204.method3453(var18).field2201 || field485)) {
                        for (int var19 = 0; var19 < var17.field3605.length; var19++) {
                            if (var18 + 1 == var17.field3605[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field653;
                }
                if (var6 == 12) {
                    var7 = field654;
                }
                if (var6 == 13) {
                    int var20 = class303.field3428[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class303.method233(var22);
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
                    var7 = (Statics.field1440.field1200 >> 7) + Statics.field218;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1440.field1205 >> 7) + Statics.field1865;
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

    @ObfuscatedName("client.lq(Lmy;I)V")
    public static final void method1188(class313 arg0) {
        if (arg0.field3529 == 1) {
            method2790(arg0.field3655, "", 24, 0, 0, arg0.field3526, arg0.field3658);
        }
        if (arg0.field3529 == 2 && !field767) {
            String var1 = method5808(arg0);
            if (var1 != null) {
                method2790(var1, class99.method308(65280) + arg0.field3654, 25, 0, -1, arg0.field3526, arg0.field3658);
            }
        }
        if (arg0.field3529 == 3) {
            method2684(class333.field3974, "", 26, 0, 0, arg0.field3526);
        }
        if (arg0.field3529 == 4) {
            method2684(arg0.field3655, "", 28, 0, 0, arg0.field3526);
        }
        if (arg0.field3529 == 5) {
            method2684(arg0.field3655, "", 29, 0, 0, arg0.field3526);
        }
        if (arg0.field3529 == 6 && field652 == null) {
            method2684(arg0.field3655, "", 30, 0, -1, arg0.field3526);
        }
        if (!arg0.field3525) {
            return;
        }
        if (!field767) {
            for (int var2 = 9; var2 >= 5; var2--) {
                String var3 = method4880(arg0, var2);
                if (var3 != null) {
                    method2790(var3, arg0.field3558, 1007, var2 + 1, arg0.field3524, arg0.field3526, arg0.field3658);
                }
            }
            String var4 = method5808(arg0);
            if (var4 != null) {
                method2790(var4, arg0.field3558, 25, 0, arg0.field3524, arg0.field3526, arg0.field3658);
            }
            for (int var5 = 4; var5 >= 0; var5--) {
                String var6 = method4880(arg0, var5);
                if (var6 != null) {
                    method6051(var6, arg0.field3558, 57, var5 + 1, arg0.field3524, arg0.field3526, arg0.field3658, arg0.field3603);
                }
            }
            int var7 = method3468(arg0);
            boolean var8 = (var7 & 0x1) != 0;
            if (var8) {
                method2684(class333.field3941, "", 30, 0, arg0.field3524, arg0.field3526);
            }
        } else if (class314.method3221(method3468(arg0)) && (Statics.field1119 & 0x20) == 32) {
            method2790(field712, field646 + " " + class99.field1292 + " " + arg0.field3558, 58, 0, arg0.field3524, arg0.field3526, arg0.field3658);
        }
    }

    @ObfuscatedName("fi.lj(ZI)V")
    public static void method3046(boolean arg0) {
        field634 = arg0;
    }

    @ObfuscatedName("lt.lf(I)Z")
    public static boolean method5202() {
        return field634;
    }

    @ObfuscatedName("js.lz(IIIIIIII)V")
    public static final void method4755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class313.method5988(arg0)) {
            method3184(Statics.field1732[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("gl.lm([Lmy;IIIIIIII)V")
    public static final void method3184(class313[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class313 var9 = arg0[var8];
            if (var9 != null && var9.field3531 == arg1 && (var9.method5548() || method3468(var9) != 0 || field660 == var9)) {
                if (var9.field3525) {
                    if (Statics.method4397(var9)) {
                        continue;
                    }
                } else if (var9.field3528 == 0 && Statics.field1887 != var9 && Statics.method4397(var9)) {
                    continue;
                }
                if (var9.field3528 == 11) {
                    if (var9.method5563(Statics.field4254)) {
                        if (var9.method5639()) {
                            method1946(var9);
                            method4935(var9.field3662, var9, true);
                        }
                        if (var9.field3649 != null) {
                            class86 var10 = new class86();
                            var10.field1056 = var9;
                            var10.field1057 = var9.field3649;
                            field690.method6111(var10);
                        }
                    }
                } else if (var9.field3528 == 12 && var9.method5571()) {
                    method1946(var9);
                }
                int var11 = var9.field3539 + arg6;
                int var12 = var9.field3540 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3528 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3541 + var11;
                    int var16 = var9.field3516 + var12;
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
                    int var23 = var9.field3541 + var11;
                    int var24 = var9.field3516 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field602 == var9) {
                    field772 = true;
                    field573 = var11;
                    field669 = var12;
                }
                boolean var25 = false;
                if (var9.field3600) {
                    switch(field649) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3526 >>> 16 == field764) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field764 == var9.field3526) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3525 || var19 < var21 && var20 < var22) {
                    if (var9.field3525) {
                        if (var9.field3672) {
                            if (class36.field228 >= var19 && class36.field227 >= var20 && class36.field228 < var21 && class36.field227 < var22) {
                                for (class86 var26 = (class86) field690.method6089(); var26 != null; var26 = (class86) field690.method6098()) {
                                    if (var26.field1047) {
                                        var26.method7335();
                                        var26.field1056.field3663 = false;
                                    }
                                }
                                method2789();
                                if (Statics.field4353 == 0) {
                                    field602 = null;
                                    field660 = null;
                                }
                                if (!field768) {
                                    method6919();
                                }
                            }
                        } else if (var9.field3673 && class36.field228 >= var19 && class36.field227 >= var20 && class36.field228 < var21 && class36.field227 < var22) {
                            for (class86 var27 = (class86) field690.method6089(); var27 != null; var27 = (class86) field690.method6098()) {
                                if (var27.field1047 && var27.field1056.field3634 == var27.field1057) {
                                    var27.method7335();
                                }
                            }
                        }
                    }
                    int var28 = class36.field228;
                    int var29 = class36.field227;
                    if (class36.field235 != 0) {
                        var28 = class36.field236;
                        var29 = class36.field237;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3627 == 1337) {
                        if (!field493 && !field768 && var30) {
                            method4236(var28, var29, var19, var20);
                        }
                    } else if (var9.field3627 == 1338) {
                        method2687(var9, var11, var12);
                    } else {
                        if (var9.field3627 == 1400) {
                            Statics.field2889.method7382(class36.field228, class36.field227, var30, var11, var12, var9.field3541, var9.field3516);
                        }
                        if (!field768 && var30) {
                            if (var9.field3627 == 1400) {
                                Statics.field2889.method7433(var11, var12, var9.field3541, var9.field3516, var28, var29);
                            } else {
                                method1188(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3576.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3576[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3576[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3671 != null) {
                                            var35 = field713.method3741(var9.field3576[var31][var34]);
                                        }
                                        if (method2974(var9.field3576[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3671 != null && var9.field3671[var31] > field494) {
                                                break;
                                            }
                                            byte var36 = var9.field3602[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field713.method3741(86) && !field713.method3741(82) && !field713.method3741(81)) && ((var36 & 0x2) == 0 || field713.method3741(86)) && ((var36 & 0x1) == 0 || field713.method3741(82)) && ((var36 & 0x4) == 0 || field713.method3741(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method5786(var31 + 1, var9.field3526, var9.field3524, var9.field3658, "");
                                    } else if (var31 == 10) {
                                        method575();
                                        method3183(var9.field3526, var9.field3524, class314.method5745(method3468(var9)), var9.field3658);
                                        field712 = method5808(var9);
                                        if (field712 == null) {
                                            field712 = class333.field3824;
                                        }
                                        field646 = var9.field3558 + class99.method308(16777215);
                                    }
                                    int var37 = var9.field3584[var31];
                                    if (var9.field3671 == null) {
                                        var9.field3671 = new int[var9.field3576.length];
                                    }
                                    if (var9.field3604 == null) {
                                        var9.field3604 = new int[var9.field3576.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3671[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3671[var31] == 0) {
                                        var9.field3671[var31] = field494 + var37 + var9.field3604[var31];
                                    } else {
                                        var9.field3671[var31] = field494 + var37;
                                    }
                                }
                                if (!var32 && var9.field3671 != null) {
                                    var9.field3671[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3525) {
                            boolean var38;
                            if (class36.field228 >= var19 && class36.field227 >= var20 && class36.field228 < var21 && class36.field227 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field229 == 1 || !Statics.field3700 && class36.field229 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field235 == 1 || !Statics.field3700 && class36.field235 == 4) && class36.field236 >= var19 && class36.field237 >= var20 && class36.field236 < var21 && class36.field237 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method4776(var9, class36.field236 - var11, class36.field237 - var12);
                            }
                            if (var9.method5549()) {
                                if (var40) {
                                    field693.method6111(new class208(0, class36.field228 - var11, class36.field227 - var12, var9));
                                }
                                if (var39) {
                                    field693.method6111(new class208(1, class36.field228 - var11, class36.field227 - var12, var9));
                                }
                            }
                            if (var9.field3627 == 1400) {
                                Statics.field2889.method7383(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field602 != null && field602 != var9 && var38 && class314.method4942(method3468(var9))) {
                                field744 = var9;
                            }
                            if (field660 == var9) {
                                field664 = true;
                                field665 = var11;
                                field598 = var12;
                            }
                            if (var9.field3612) {
                                if (var38 && field688 != 0 && var9.field3634 != null) {
                                    class86 var41 = new class86();
                                    var41.field1047 = true;
                                    var41.field1056 = var9;
                                    var41.field1050 = field688;
                                    var41.field1057 = var9.field3634;
                                    field690.method6111(var41);
                                }
                                if (field602 != null || field768) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3664 && var40) {
                                    var9.field3664 = true;
                                    if (var9.field3532 != null) {
                                        class86 var42 = new class86();
                                        var42.field1047 = true;
                                        var42.field1056 = var9;
                                        var42.field1049 = class36.field236 - var11;
                                        var42.field1050 = class36.field237 - var12;
                                        var42.field1057 = var9.field3532;
                                        field690.method6111(var42);
                                    }
                                }
                                if (var9.field3664 && var39 && var9.field3552 != null) {
                                    class86 var43 = new class86();
                                    var43.field1047 = true;
                                    var43.field1056 = var9;
                                    var43.field1049 = class36.field228 - var11;
                                    var43.field1050 = class36.field227 - var12;
                                    var43.field1057 = var9.field3552;
                                    field690.method6111(var43);
                                }
                                if (var9.field3664 && !var39) {
                                    var9.field3664 = false;
                                    if (var9.field3616 != null) {
                                        class86 var44 = new class86();
                                        var44.field1047 = true;
                                        var44.field1056 = var9;
                                        var44.field1049 = class36.field228 - var11;
                                        var44.field1050 = class36.field227 - var12;
                                        var44.field1057 = var9.field3616;
                                        field530.method6111(var44);
                                    }
                                }
                                if (var39 && var9.field3601 != null) {
                                    class86 var45 = new class86();
                                    var45.field1047 = true;
                                    var45.field1056 = var9;
                                    var45.field1049 = class36.field228 - var11;
                                    var45.field1050 = class36.field227 - var12;
                                    var45.field1057 = var9.field3601;
                                    field690.method6111(var45);
                                }
                                if (!var9.field3663 && var38) {
                                    var9.field3663 = true;
                                    if (var9.field3618 != null) {
                                        class86 var46 = new class86();
                                        var46.field1047 = true;
                                        var46.field1056 = var9;
                                        var46.field1049 = class36.field228 - var11;
                                        var46.field1050 = class36.field227 - var12;
                                        var46.field1057 = var9.field3618;
                                        field690.method6111(var46);
                                    }
                                }
                                if (var9.field3663 && var38 && var9.field3619 != null) {
                                    class86 var47 = new class86();
                                    var47.field1047 = true;
                                    var47.field1056 = var9;
                                    var47.field1049 = class36.field228 - var11;
                                    var47.field1050 = class36.field227 - var12;
                                    var47.field1057 = var9.field3619;
                                    field690.method6111(var47);
                                }
                                if (var9.field3663 && !var38) {
                                    var9.field3663 = false;
                                    if (var9.field3620 != null) {
                                        class86 var48 = new class86();
                                        var48.field1047 = true;
                                        var48.field1056 = var9;
                                        var48.field1049 = class36.field228 - var11;
                                        var48.field1050 = class36.field227 - var12;
                                        var48.field1057 = var9.field3620;
                                        field530.method6111(var48);
                                    }
                                }
                                if (var9.field3577 != null) {
                                    class86 var49 = new class86();
                                    var49.field1056 = var9;
                                    var49.field1057 = var9.field3577;
                                    field691.method6111(var49);
                                }
                                if (var9.field3660 != null && field673 > var9.field3547) {
                                    if (var9.field3626 == null || field673 - var9.field3547 > 32) {
                                        class86 var54 = new class86();
                                        var54.field1056 = var9;
                                        var54.field1057 = var9.field3660;
                                        field690.method6111(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3547; var50 < field673; var50++) {
                                            int var51 = field580[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3626.length; var52++) {
                                                if (var9.field3626[var52] == var51) {
                                                    class86 var53 = new class86();
                                                    var53.field1056 = var9;
                                                    var53.field1057 = var9.field3660;
                                                    field690.method6111(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3547 = field673;
                                }
                                if (var9.field3548 != null && field667 > var9.field3667) {
                                    if (var9.field3582 == null || field667 - var9.field3667 > 32) {
                                        class86 var59 = new class86();
                                        var59.field1056 = var9;
                                        var59.field1057 = var9.field3548;
                                        field690.method6111(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3667; var55 < field667; var55++) {
                                            int var56 = field534[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3582.length; var57++) {
                                                if (var9.field3582[var57] == var56) {
                                                    class86 var58 = new class86();
                                                    var58.field1056 = var9;
                                                    var58.field1057 = var9.field3548;
                                                    field690.method6111(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3667 = field667;
                                }
                                if (var9.field3629 != null && field677 > var9.field3595) {
                                    if (var9.field3543 == null || field677 - var9.field3595 > 32) {
                                        class86 var64 = new class86();
                                        var64.field1056 = var9;
                                        var64.field1057 = var9.field3629;
                                        field690.method6111(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3595; var60 < field677; var60++) {
                                            int var61 = field676[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3543.length; var62++) {
                                                if (var9.field3543[var62] == var61) {
                                                    class86 var63 = new class86();
                                                    var63.field1056 = var9;
                                                    var63.field1057 = var9.field3629;
                                                    field690.method6111(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3595 = field677;
                                }
                                if (field631 > var9.field3624 && var9.field3553 != null) {
                                    class86 var65 = new class86();
                                    var65.field1056 = var9;
                                    var65.field1057 = var9.field3553;
                                    field690.method6111(var65);
                                }
                                if (field702 > var9.field3624 && var9.field3639 != null) {
                                    class86 var66 = new class86();
                                    var66.field1056 = var9;
                                    var66.field1057 = var9.field3639;
                                    field690.method6111(var66);
                                }
                                if (field526 > var9.field3624 && var9.field3640 != null) {
                                    class86 var67 = new class86();
                                    var67.field1056 = var9;
                                    var67.field1057 = var9.field3640;
                                    field690.method6111(var67);
                                }
                                if (field683 > var9.field3624 && var9.field3641 != null) {
                                    class86 var68 = new class86();
                                    var68.field1056 = var9;
                                    var68.field1057 = var9.field3641;
                                    field690.method6111(var68);
                                }
                                if (field483 > var9.field3624 && var9.field3642 != null) {
                                    class86 var69 = new class86();
                                    var69.field1056 = var9;
                                    var69.field1057 = var9.field3642;
                                    field690.method6111(var69);
                                }
                                if (field644 > var9.field3624 && var9.field3625 != null) {
                                    class86 var70 = new class86();
                                    var70.field1056 = var9;
                                    var70.field1057 = var9.field3625;
                                    field690.method6111(var70);
                                }
                                if (field686 > var9.field3624 && var9.field3648 != null) {
                                    class86 var71 = new class86();
                                    var71.field1056 = var9;
                                    var71.field1057 = var9.field3648;
                                    field690.method6111(var71);
                                }
                                if (field687 > var9.field3624 && var9.field3643 != null) {
                                    class86 var72 = new class86();
                                    var72.field1056 = var9;
                                    var72.field1057 = var9.field3643;
                                    field690.method6111(var72);
                                }
                                var9.field3624 = field671;
                                if (var9.field3613 != null) {
                                    for (int var73 = 0; var73 < field715; var73++) {
                                        class86 var74 = new class86();
                                        var74.field1056 = var9;
                                        var74.field1053 = field717[var73];
                                        var74.field1054 = field642[var73];
                                        var74.field1057 = var9.field3613;
                                        field690.method6111(var74);
                                    }
                                }
                                if (var9.field3637 != null) {
                                    int[] var75 = field713.method3763();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class86 var77 = new class86();
                                        var77.field1056 = var9;
                                        var77.field1053 = var75[var76];
                                        var77.field1057 = var9.field3637;
                                        field690.method6111(var77);
                                    }
                                }
                                if (var9.field3542 != null) {
                                    int[] var78 = field713.method3750();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class86 var80 = new class86();
                                        var80.field1056 = var9;
                                        var80.field1053 = var78[var79];
                                        var80.field1057 = var9.field3542;
                                        field690.method6111(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3525) {
                            if (field602 != null || field768) {
                                continue;
                            }
                            if ((var9.field3653 >= 0 || var9.field3522 != 0) && class36.field228 >= var19 && class36.field227 >= var20 && class36.field228 < var21 && class36.field227 < var22) {
                                if (var9.field3653 >= 0) {
                                    Statics.field1887 = arg0[var9.field3653];
                                } else {
                                    Statics.field1887 = var9;
                                }
                            }
                            if (var9.field3528 == 8 && class36.field228 >= var19 && class36.field227 >= var20 && class36.field228 < var21 && class36.field227 < var22) {
                                Statics.field976 = var9;
                            }
                            if (var9.field3614 > var9.field3516) {
                                method2155(var9, var9.field3541 + var11, var12, var9.field3516, var9.field3614, class36.field228, class36.field227);
                            }
                        }
                        if (var9.field3528 == 0) {
                            method3184(arg0, var9.field3526, var19, var20, var21, var22, var11 - var9.field3517, var12 - var9.field3523);
                            if (var9.field3662 != null) {
                                method3184(var9.field3662, var9.field3526, var19, var20, var21, var22, var11 - var9.field3517, var12 - var9.field3523);
                            }
                            class85 var81 = (class85) field648.method7619((long) var9.field3526);
                            if (var81 != null) {
                                if (var81.field1040 == 0 && class36.field228 >= var19 && class36.field227 >= var20 && class36.field228 < var21 && class36.field227 < var22 && !field768) {
                                    for (class86 var82 = (class86) field690.method6089(); var82 != null; var82 = (class86) field690.method6098()) {
                                        if (var82.field1047) {
                                            var82.method7335();
                                            var82.field1056.field3663 = false;
                                        }
                                    }
                                    if (Statics.field4353 == 0) {
                                        field602 = null;
                                        field660 = null;
                                    }
                                    if (!field768) {
                                        method6919();
                                    }
                                }
                                method4755(var81.field1039, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fh.lb(II)Z")
    public static boolean method2974(int arg0) {
        for (int var1 = 0; var1 < field715; var1++) {
            if (field717[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("hl.ld(IIB)V")
    public static final void method3397(int arg0, int arg1) {
        if (class313.method5988(arg0)) {
            method35(Statics.field1732[arg0], arg1);
        }
    }

    @ObfuscatedName("av.lh([Lmy;IB)V")
    public static final void method35(class313[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class313 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3528 == 0) {
                    if (var3.field3662 != null) {
                        method35(var3.field3662, arg1);
                    }
                    class85 var4 = (class85) field648.method7619((long) var3.field3526);
                    if (var4 != null) {
                        method3397(var4.field1039, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3644 != null) {
                    class86 var5 = new class86();
                    var5.field1056 = var3;
                    var5.field1057 = var3.field3644;
                    class68.method69(var5);
                }
                if (arg1 == 1 && var3.field3645 != null) {
                    if (var3.field3524 >= 0) {
                        class313 var6 = class313.method4802(var3.field3526);
                        if (var6 == null || var6.field3662 == null || var3.field3524 >= var6.field3662.length || var6.field3662[var3.field3524] != var3) {
                            continue;
                        }
                    }
                    class86 var7 = new class86();
                    var7.field1056 = var3;
                    var7.field1057 = var3.field3645;
                    class68.method69(var7);
                }
            }
        }
    }

    @ObfuscatedName("js.lp(Lmy;III)V")
    public static final void method4776(class313 arg0, int arg1, int arg2) {
        if (field602 != null || field768 || arg0 == null) {
            return;
        }
        class313 var3 = method4964(arg0);
        if (var3 == null) {
            var3 = arg0.field3607;
        }
        if (var3 == null) {
            return;
        }
        field602 = arg0;
        class313 var5 = method4964(arg0);
        if (var5 == null) {
            var5 = arg0.field3607;
        }
        field660 = var5;
        field661 = arg1;
        field637 = arg2;
        Statics.field4353 = 0;
        field708 = false;
        int var7 = field759 - 1;
        if (var7 != -1) {
            method3178(var7);
        }
        return;
    }

    @ObfuscatedName("client.lw(B)V")
    public final void method1172() {
        method1946(field602);
        Statics.field4353++;
        if (field772 && field664) {
            int var1 = class36.field228;
            int var2 = class36.field227;
            int var3 = var1 - field661;
            int var4 = var2 - field637;
            if (var3 < field665) {
                var3 = field665;
            }
            if (field602.field3541 + var3 > field665 + field660.field3541) {
                var3 = field665 + field660.field3541 - field602.field3541;
            }
            if (var4 < field598) {
                var4 = field598;
            }
            if (field602.field3516 + var4 > field598 + field660.field3516) {
                var4 = field598 + field660.field3516 - field602.field3516;
            }
            int var5 = var3 - field573;
            int var6 = var4 - field669;
            int var7 = field602.field3608;
            if (Statics.field4353 > field602.field3609 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field708 = true;
            }
            int var8 = field660.field3517 + (var3 - field665);
            int var9 = field660.field3523 + (var4 - field598);
            if (field602.field3621 != null && field708) {
                class86 var10 = new class86();
                var10.field1056 = field602;
                var10.field1049 = var8;
                var10.field1050 = var9;
                var10.field1057 = field602.field3621;
                class68.method69(var10);
            }
            if (class36.field229 == 0) {
                if (field708) {
                    if (field602.field3622 != null) {
                        class86 var11 = new class86();
                        var11.field1056 = field602;
                        var11.field1049 = var8;
                        var11.field1050 = var9;
                        var11.field1046 = field744;
                        var11.field1057 = field602.field3622;
                        class68.method69(var11);
                    }
                    if (field744 != null && method4964(field602) != null) {
                        class285 var12 = class285.method2741(class283.field3110, field734.field1380);
                        var12.field3169.method8003(field744.field3526);
                        var12.field3169.method7942(field602.field3658);
                        var12.field3169.method8003(field602.field3526);
                        var12.field3169.method7943(field744.field3524);
                        var12.field3169.method7943(field744.field3658);
                        var12.field3169.method7941(field602.field3524);
                        field734.method2635(var12);
                    }
                } else if (this.method1168()) {
                    this.method1169(field661 + field573, field669 + field637);
                } else if (field759 > 0) {
                    int var13 = field661 + field573;
                    int var14 = field669 + field637;
                    method2717(Statics.field2730, var13, var14);
                    Statics.field2730 = null;
                }
                field602 = null;
            }
        } else if (Statics.field4353 > 1) {
            if (!field708 && field759 > 0) {
                int var15 = field661 + field573;
                int var16 = field669 + field637;
                method2717(Statics.field2730, var15, var16);
                Statics.field2730 = null;
            }
            field602 = null;
        }
    }

    @ObfuscatedName("ge.lx(II)V")
    public static void method3178(int arg0) {
        Statics.field2730 = new class72();
        Statics.field2730.field877 = field625[arg0];
        Statics.field2730.field873 = field626[arg0];
        Statics.field2730.field874 = field627[arg0];
        Statics.field2730.field875 = field684[arg0];
        Statics.field2730.field876 = field629[arg0];
        Statics.field2730.field872 = field630[arg0];
        Statics.field2730.field878 = field709[arg0];
    }

    @ObfuscatedName("cx.li(Lmy;B)V")
    public static void method1946(class313 arg0) {
        if (arg0 != null && field696 == arg0.field3670) {
            field723[arg0.field3669] = true;
        }
    }

    @ObfuscatedName("nr.lt(I)V")
    public static void method5969() {
        for (class85 var0 = (class85) field648.method7614(); var0 != null; var0 = (class85) field648.method7617()) {
            int var1 = var0.field1039;
            if (class313.method5988(var1)) {
                boolean var2 = true;
                class313[] var3 = Statics.field1732[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3525;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4673;
                    class313 var6 = class313.method4802(var5);
                    if (var6 != null) {
                        method1946(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cy.ll(IB)V")
    public static final void method1131(int arg0) {
        if (!class313.method5988(arg0)) {
            return;
        }
        class313[] var1 = Statics.field1732[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class313 var3 = var1[var2];
            if (var3 != null) {
                var3.field3666 = 0;
                var3.field3661 = 0;
            }
        }
    }

    @ObfuscatedName("bh.le([Lmy;IB)V")
    public static final void method442(class313[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class313 var3 = arg0[var2];
            if (var3 != null && var3.field3531 == arg1 && (!var3.field3525 || !Statics.method4397(var3))) {
                if (var3.field3528 == 0) {
                    if (!var3.field3525 && Statics.method4397(var3) && Statics.field1887 != var3) {
                        continue;
                    }
                    method442(arg0, var3.field3526);
                    if (var3.field3662 != null) {
                        method442(var3.field3662, var3.field3526);
                    }
                    class85 var4 = (class85) field648.method7619((long) var3.field3526);
                    if (var4 != null) {
                        int var5 = var4.field1039;
                        if (class313.method5988(var5)) {
                            method442(Statics.field1732[var5], -1);
                        }
                    }
                }
                if (var3.field3528 == 6) {
                    if (var3.field3610 != -1 || var3.field3575 != -1) {
                        boolean var6 = method3203(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3575;
                        } else {
                            var7 = var3.field3610;
                        }
                        if (var7 != -1) {
                            class206 var8 = class206.method5217(var7);
                            if (var8.method3694()) {
                                var3.field3666 += field632;
                                int var9 = var8.method3695();
                                if (var3.field3666 >= var9) {
                                    var3.field3666 -= var8.field2263;
                                    if (var3.field3666 < 0 || var3.field3666 >= var9) {
                                        var3.field3666 = 0;
                                    }
                                }
                                method1946(var3);
                            } else {
                                var3.field3661 += field632;
                                while (var3.field3661 > var8.field2264[var3.field3666]) {
                                    var3.field3661 -= var8.field2264[var3.field3666];
                                    var3.field3666++;
                                    if (var3.field3666 >= var8.field2276.length) {
                                        var3.field3666 -= var8.field2263;
                                        if (var3.field3666 < 0 || var3.field3666 >= var8.field2276.length) {
                                            var3.field3666 = 0;
                                        }
                                    }
                                    method1946(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3583 != 0 && !var3.field3525) {
                        int var10 = var3.field3583 >> 16;
                        int var11 = var3.field3583 << 16 >> 16;
                        int var12 = field632 * var10;
                        int var13 = field632 * var11;
                        var3.field3578 = var3.field3578 + var12 & 0x7FF;
                        var3.field3635 = var3.field3635 + var13 & 0x7FF;
                        method1946(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("in.lu(II)V")
    public static final void method4031(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method51((double) var3);
    }

    @ObfuscatedName("nk.ls(I)I")
    public static final int method5950() {
        float var0 = 200.0F * ((float) Statics.field2929.method2324() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("aq.la(D)V")
    public static final void method51(double arg0) {
        class220.method3913(arg0);
        ((class229) Statics.field2489).method4211(arg0);
        class204.method3167();
        Statics.field2929.method2408(arg0);
    }

    @ObfuscatedName("cu.lc(II)V")
    public static final void method1953(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field2929.method2326()) {
            return;
        }
        if (Statics.field2929.method2326() == 0 && field729 != -1) {
            class294.method3085(Statics.field3456, field729, 0, var1, false);
            field730 = false;
        } else if (var1 == 0) {
            class294.method4792();
            field730 = false;
        } else if (class294.field3330 == 0) {
            Statics.field3331.method5009(var1);
        } else {
            Statics.field4346 = var1;
        }
        Statics.field2929.method2314(var1);
    }

    @ObfuscatedName("as.ly(II)V")
    public static final void method145(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field2929.method2329(var1);
    }

    @ObfuscatedName("go.my(II)V")
    public static final void method3063(int arg0) {
        method5969();
        class67.method4446();
        int var1 = class184.method620(arg0).field1894;
        if (var1 == 0) {
            return;
        }
        int var2 = class303.field3428[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method51(0.9D);
            }
            if (var2 == 2) {
                method51(0.8D);
            }
            if (var2 == 3) {
                method51(0.7D);
            }
            if (var2 == 4) {
                class220.method3913(0.6D);
                ((class229) Statics.field2489).method4211(0.6D);
                class204.method3167();
                Statics.field2929.method2408(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method1953(255);
            }
            if (var2 == 1) {
                method1953(192);
            }
            if (var2 == 2) {
                method1953(128);
            }
            if (var2 == 3) {
                method1953(64);
            }
            if (var2 == 4) {
                method1953(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                Statics.method1128(127);
            }
            if (var2 == 1) {
                Statics.method1128(96);
            }
            if (var2 == 2) {
                Statics.method1128(64);
            }
            if (var2 == 3) {
                Statics.method1128(32);
            }
            if (var2 == 4) {
                Statics.method1128(0);
            }
        }
        if (var1 == 5) {
            field622 = var2 == 1;
        }
        if (var1 == 6) {
            field651 = var2;
        }
        if (var1 == 9) {
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method145(127);
            }
            if (var2 == 1) {
                method145(96);
            }
            if (var2 == 2) {
                method145(64);
            }
            if (var2 == 3) {
                method145(32);
            }
            if (var2 == 4) {
                method145(0);
            }
        }
        if (var1 == 17) {
            field656 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class101[] var3 = new class101[] { class101.field1307, class101.field1308, class101.field1303, class101.field1302, class101.field1304 };
            field509 = (class101) class354.method5197(var3, var2);
            if (field509 == null) {
                field509 = class101.field1302;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field614 = -1;
            } else {
                field614 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class101[] var4 = new class101[] { class101.field1307, class101.field1308, class101.field1303, class101.field1302, class101.field1304 };
        field510 = (class101) class354.method5197(var4, var2);
        if (field510 == null) {
            field510 = class101.field1302;
        }
    }

    @ObfuscatedName("di.ma(Lmy;I)V")
    public static final void method2540(class313 arg0) {
        int var1 = arg0.field3627;
        if (var1 == 324) {
            if (field757 == -1) {
                field757 = arg0.field3561;
                field719 = arg0.field3562;
            }
            if (field705.field3465 == 1) {
                arg0.field3561 = field757;
            } else {
                arg0.field3561 = field719;
            }
        } else if (var1 == 325) {
            if (field757 == -1) {
                field757 = arg0.field3561;
                field719 = arg0.field3562;
            }
            if (field705.field3465 == 1) {
                arg0.field3561 = field719;
            } else {
                arg0.field3561 = field757;
            }
        } else if (var1 == 327) {
            arg0.field3578 = 150;
            arg0.field3635 = (int) (Math.sin((double) field494 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3574 = 5;
            arg0.field3571 = 0;
        } else if (var1 == 328) {
            arg0.field3578 = 150;
            arg0.field3635 = (int) (Math.sin((double) field494 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3574 = 5;
            arg0.field3571 = 1;
        }
    }

    @ObfuscatedName("jr.mg(I)V")
    public static final void method4414() {
        class285 var0 = class285.method2741(class283.field3137, field734.field1380);
        field734.method2635(var0);
        class68.field837 = true;
        for (class85 var1 = (class85) field648.method7614(); var1 != null; var1 = (class85) field648.method7617()) {
            if (var1.field1040 == 0 || var1.field1040 == 3) {
                method247(var1, true);
            }
        }
        if (field652 != null) {
            method1946(field652);
            field652 = null;
        }
        class68.field837 = false;
    }

    @ObfuscatedName("cr.mw(IIII)Lde;")
    public static final class85 method2042(int arg0, int arg1, int arg2) {
        class85 var3 = new class85();
        var3.field1039 = arg1;
        var3.field1040 = arg2;
        field648.method7616(var3, (long) arg0);
        method1131(arg1);
        class313 var4 = class313.method4802(arg0);
        method1946(var4);
        if (field652 != null) {
            method1946(field652);
            field652 = null;
        }
        method4935(Statics.field1732[arg0 >> 16], var4, false);
        class68.method4800(arg1);
        if (field647 != -1) {
            method3397(field647, 1);
        }
        return var3;
    }

    @ObfuscatedName("au.mh(Lde;ZB)V")
    public static final void method247(class85 arg0, boolean arg1) {
        int var2 = arg0.field1039;
        int var3 = (int) arg0.field4673;
        arg0.method7335();
        if (arg1) {
            class313.method4973(var2);
        }
        method3794(var2);
        class313 var4 = class313.method4802(var3);
        if (var4 != null) {
            method1946(var4);
        }
        if (field647 != -1) {
            method3397(field647, 1);
        }
    }

    @ObfuscatedName("ax.mv(Lmy;I)Z")
    public static final boolean method97(class313 arg0) {
        int var1 = arg0.field3627;
        if (var1 == 205) {
            field675 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field705.method5231(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field705.method5234(var4, var5 == 1);
        }
        if (var1 == 324) {
            field705.method5235(0);
        }
        if (var1 == 325) {
            field705.method5235(1);
        }
        if (var1 == 326) {
            class285 var6 = class285.method2741(class283.field3091, field734.field1380);
            field705.method5254(var6.field3169);
            field734.method2635(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mh.mo(Lmy;IIIB)V")
    public static final void method5737(class313 arg0, int arg1, int arg2, int arg3) {
        method3345();
        class302 var4 = arg0.method5546(false);
        if (var4 == null) {
            return;
        }
        class488.method8233(arg1, arg2, var4.field3422 + arg1, var4.field3420 + arg2);
        if (field728 == 2 || field728 == 5) {
            class488.method8252(arg1, arg2, 0, var4.field3423, var4.field3421);
        } else {
            int var5 = field564 & 0x7FF;
            int var6 = Statics.field1440.field1200 / 32 + 48;
            int var7 = 464 - Statics.field1440.field1205 / 32;
            Statics.field1960.method8381(arg1, arg2, var4.field3422, var4.field3420, var6, var7, var5, 256, var4.field3423, var4.field3421);
            for (int var8 = 0; var8 < field722; var8++) {
                int var9 = field710[var8] * 4 + 2 - Statics.field1440.field1200 / 32;
                int var10 = field724[var8] * 4 + 2 - Statics.field1440.field1205 / 32;
                method2970(arg1, arg2, var9, var10, field725[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class359 var13 = field615[Statics.field1812][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1440.field1200 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1440.field1205 / 32;
                        method2970(arg1, arg2, var14, var15, Statics.field1747[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field538; var16++) {
                class98 var17 = field682[field539[var16]];
                if (var17 != null && var17.method2204()) {
                    class193 var18 = var17.field1277;
                    if (var18 != null && var18.field2032 != null) {
                        var18 = var18.method3355();
                    }
                    if (var18 != null && var18.field2018 && var18.field1999) {
                        int var19 = var17.field1200 / 32 - Statics.field1440.field1200 / 32;
                        int var20 = var17.field1205 / 32 - Statics.field1440.field1205 / 32;
                        method2970(arg1, arg2, var19, var20, Statics.field1747[1], var4);
                    }
                }
            }
            int var21 = class105.field1342;
            int[] var22 = class105.field1344;
            for (int var23 = 0; var23 < var21; var23++) {
                class90 var24 = field758[var22[var23]];
                if (var24 != null && var24.method2204() && !var24.field1107 && Statics.field1440 != var24) {
                    int var25 = var24.field1200 / 32 - Statics.field1440.field1200 / 32;
                    int var26 = var24.field1205 / 32 - Statics.field1440.field1205 / 32;
                    if (var24.method2190()) {
                        method2970(arg1, arg2, var25, var26, Statics.field1747[3], var4);
                    } else if (Statics.field1440.field1109 != 0 && var24.field1109 != 0 && Statics.field1440.field1109 == var24.field1109) {
                        method2970(arg1, arg2, var25, var26, Statics.field1747[4], var4);
                    } else if (var24.method2193()) {
                        method2970(arg1, arg2, var25, var26, Statics.field1747[5], var4);
                    } else if (var24.method2198()) {
                        method2970(arg1, arg2, var25, var26, Statics.field1747[6], var4);
                    } else {
                        method2970(arg1, arg2, var25, var26, Statics.field1747[2], var4);
                    }
                }
            }
            if (field492 != 0 && field494 % 20 < 10) {
                if (field492 == 1 && field718 >= 0 && field718 < field682.length) {
                    class98 var27 = field682[field718];
                    if (var27 != null) {
                        int var28 = var27.field1200 / 32 - Statics.field1440.field1200 / 32;
                        int var29 = var27.field1205 / 32 - Statics.field1440.field1205 / 32;
                        method4201(arg1, arg2, var28, var29, Statics.field2958[1], var4);
                    }
                }
                if (field492 == 2) {
                    int var30 = field504 * 4 - Statics.field218 * 4 + 2 - Statics.field1440.field1200 / 32;
                    int var31 = field505 * 4 - Statics.field1865 * 4 + 2 - Statics.field1440.field1205 / 32;
                    method4201(arg1, arg2, var30, var31, Statics.field2958[1], var4);
                }
                if (field492 == 10 && field503 >= 0 && field503 < field758.length) {
                    class90 var32 = field758[field503];
                    if (var32 != null) {
                        int var33 = var32.field1200 / 32 - Statics.field1440.field1200 / 32;
                        int var34 = var32.field1205 / 32 - Statics.field1440.field1205 / 32;
                        method4201(arg1, arg2, var33, var34, Statics.field2958[1], var4);
                    }
                }
            }
            if (field726 != 0) {
                int var35 = field726 * 4 + 2 - Statics.field1440.field1200 / 32;
                int var36 = field727 * 4 + 2 - Statics.field1440.field1205 / 32;
                method2970(arg1, arg2, var35, var36, Statics.field2958[0], var4);
            }
            if (!Statics.field1440.field1107) {
                class488.method8241(var4.field3422 / 2 + arg1 - 1, var4.field3420 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field698[arg3] = true;
    }

    @ObfuscatedName("hf.mi(Lmy;IIII)V")
    public static final void method3537(class313 arg0, int arg1, int arg2, int arg3) {
        class302 var4 = arg0.method5546(false);
        if (var4 == null) {
            return;
        }
        if (field728 < 3) {
            Statics.field1674.method8381(arg1, arg2, var4.field3422, var4.field3420, 25, 25, field564, 256, var4.field3423, var4.field3421);
        } else {
            class488.method8252(arg1, arg2, 0, var4.field3423, var4.field3421);
        }
    }

    @ObfuscatedName("iw.md(IIIILsn;Llx;I)V")
    public static final void method4201(int arg0, int arg1, int arg2, int arg3, class492 arg4, class302 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2970(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field564 & 0x7FF;
        int var8 = class220.field2482[var7];
        int var9 = class220.field2470[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3422 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1599.method8343(arg5.field3422 / 2 + arg0 - var17 / 2 + var15, arg5.field3420 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("fq.ms(IIIILsn;Llx;I)V")
    public static final void method2970(int arg0, int arg1, int arg2, int arg3, class492 arg4, class302 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field564 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class220.field2482[var6];
        int var9 = class220.field2470[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method8341(arg5.field3422 / 2 + var10 - arg4.field5000 / 2, arg5.field3420 / 2 - var11 - arg4.field5001 / 2, arg0, arg1, arg5.field3422, arg5.field3420, arg5.field3423, arg5.field3421);
        } else {
            arg4.method8403(arg5.field3422 / 2 + arg0 + var10 - arg4.field5000 / 2, arg5.field3420 / 2 + arg1 - var11 - arg4.field5001 / 2);
        }
    }

    @ObfuscatedName("ct.mm(I)V")
    public static final void method1123() {
        class108.method469();
        if (Statics.field251 != null) {
            Statics.field251.method6867();
        }
    }

    @ObfuscatedName("gl.mb(I)V")
    public static final void method3186() {
        for (int var0 = 0; var0 < class105.field1342; var0++) {
            class90 var1 = field758[class105.field1344[var0]];
            var1.method2194();
        }
    }

    @ObfuscatedName("gg.mz(B)V")
    public static final void method3210() {
        for (int var0 = 0; var0 < class105.field1342; var0++) {
            class90 var1 = field758[class105.field1344[var0]];
            var1.method2199();
        }
    }

    @ObfuscatedName("bh.mj(B)V")
    public static final void method439() {
        field526 = field671;
        Statics.field98 = true;
    }

    @ObfuscatedName("kq.mr(B)V")
    public static final void method4940() {
        field683 = field671;
        Statics.field1876 = true;
    }

    @ObfuscatedName("bb.mf(Ljava/lang/String;B)V")
    public static final void method823(String arg0) {
        if (Statics.field251 != null) {
            class285 var1 = class285.method2741(class283.field3090, field734.field1380);
            var1.field3169.method7886(class478.method4789(arg0));
            var1.field3169.method7893(arg0);
            field734.method2635(var1);
        }
    }

    @ObfuscatedName("cw.ml(Ljava/lang/String;B)V")
    public static final void method1962(String arg0) {
        if (!arg0.equals("")) {
            class285 var1 = class285.method2741(class283.field3104, field734.field1380);
            var1.field3169.method7886(class478.method4789(arg0));
            var1.field3169.method7893(arg0);
            field734.method2635(var1);
        }
    }

    @ObfuscatedName("fy.mc(B)V")
    public static final void method2947() {
        class285 var0 = class285.method2741(class283.field3104, field734.field1380);
        var0.field3169.method7886(0);
        field734.method2635(var0);
    }

    @ObfuscatedName("af.mt(IIB)V")
    public static final void method285(int arg0, int arg1) {
        class161 var2 = arg0 >= 0 ? field658[arg0] : Statics.field104;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3069()) {
            return;
        }
        class143 var3 = (class143) var2.field1757.get(arg1);
        if (var3.field1624 != -1) {
            return;
        }
        String var4 = var3.field1622.method8490();
        class285 var5 = class285.method2741(class283.field3067, field734.field1380);
        var5.field3169.method7886(3 + class478.method4789(var4));
        var5.field3169.method7886(arg0);
        var5.field3169.method7887(arg1);
        var5.field3169.method7893(var4);
        field734.method2635(var5);
    }

    @ObfuscatedName("jw.me(IIZB)V")
    public static final void method4541(int arg0, int arg1, boolean arg2) {
        if (field658[arg0] == null || arg1 < 0 || arg1 >= field658[arg0].method3069()) {
            return;
        }
        class143 var3 = (class143) field658[arg0].field1757.get(arg1);
        class285 var4 = class285.method2741(class283.field3146, field734.field1380);
        var4.field3169.method7886(4 + class478.method4789(var3.field1622.method8490()));
        var4.field3169.method7886(arg0);
        var4.field3169.method7887(arg1);
        var4.field3169.method7945(arg2);
        var4.field3169.method7893(var3.field1622.method8490());
        field734.method2635(var4);
    }

    @ObfuscatedName("is.mu(II)V")
    public static void method3794(int arg0) {
        for (class443 var1 = (class443) field533.method7614(); var1 != null; var1 = (class443) field533.method7617()) {
            if ((long) arg0 == (var1.field4673 >> 48 & 0xFFFFL)) {
                var1.method7335();
            }
        }
    }

    @ObfuscatedName("hp.mn(Lmy;I)I")
    public static int method3468(class313 arg0) {
        class443 var1 = (class443) field533.method7619(((long) arg0.field3526 << 32) + (long) arg0.field3524);
        return var1 == null ? arg0.field3599 : var1.field4671;
    }

    @ObfuscatedName("lk.mk(Lmy;I)Lmy;")
    public static class313 method4964(class313 arg0) {
        int var1 = class314.method7770(method3468(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class313.method4802(arg0.field3531);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("kn.mx(Lmy;II)Ljava/lang/String;")
    public static String method4880(class313 arg0, int arg1) {
        int var2 = method3468(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field3632 == null) {
            return null;
        } else if (arg0.field3631 == null || arg0.field3631.length <= arg1 || arg0.field3631[arg1] == null || arg0.field3631[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3631[arg1];
        }
    }

    @ObfuscatedName("mx.ns(Lmy;I)Ljava/lang/String;")
    public static String method5808(class313 arg0) {
        if (class314.method5745(method3468(arg0)) == 0) {
            return null;
        } else if (arg0.field3611 == null || arg0.field3611.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3611;
        }
    }

    @ObfuscatedName("fp.ne(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method3051(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field484 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field484 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field484 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field484 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field484 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field4791 != null) {
            var3 = "/p=" + Statics.field4791;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field860 + "/a=" + Statics.field2331 + var3 + "/";
    }

    @ObfuscatedName("cy.nk(Ljava/lang/String;I)V")
    public static void method1129(String arg0) {
        Statics.field4791 = arg0;
        try {
            String var1 = Statics.field4480.getParameter(Integer.toString(18));
            String var2 = Statics.field4480.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class318.method2945(class290.method4466() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class27.method375(Statics.field4480, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("da.nz(Ljava/lang/String;ZB)V")
    public static void method2245(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field990; var5++) {
            class204 var6 = class204.method3453(var5);
            if ((!arg1 || var6.field2191) && var6.field2221 == -1 && var6.field2185.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field3745 = -1;
                    Statics.field4233 = null;
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
        Statics.field4233 = var3;
        Statics.field1833 = 0;
        Statics.field3745 = var4;
        String[] var9 = new String[Statics.field3745];
        for (int var10 = 0; var10 < Statics.field3745; var10++) {
            var9[var10] = class204.method3453(var3[var10]).field2185;
        }
        short[] var11 = Statics.field4233;
        class475.method2176(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("au.ng(Lsy;II)V")
    public static void method249(class478 arg0, int arg1) {
        byte[] var2 = arg0.field4906;
        if (field536 == null) {
            field536 = new byte[24];
        }
        class381.method6674(var2, arg1, field536, 0, 24);
        class171.method1955(arg0, arg1);
    }

    @ObfuscatedName("client.nr(B)Ltj;")
    public class501 method1173() {
        return Statics.field1440 == null ? null : Statics.field1440.field1104;
    }

    @ObfuscatedName("gu.nf(IIIZI)V")
    public static void method3087(int arg0, int arg1, int arg2, boolean arg3) {
        class285 var4 = class285.method2741(class283.field3136, field734.field1380);
        var4.field3169.method7887(arg0);
        var4.field3169.method8066(arg2);
        var4.field3169.method7955(arg3 ? field576 : 0);
        var4.field3169.method7942(arg1);
        field734.method2635(var4);
    }

    @ObfuscatedName("cw.na(B)Z")
    public static boolean method1961() {
        return field655 >= 2;
    }

    @ObfuscatedName("hm.nw(II)V")
    public static void method3495(int arg0) {
        field569 = arg0;
    }

    @ObfuscatedName("fi.nv(B)V")
    public static void method3045() {
        field734.method2635(class285.method2741(class283.field3148, field734.field1380));
        field569 = 0;
    }

    @ObfuscatedName("ee.nd(I)V")
    public static void method2593() {
        if (field569 == 1) {
            field554 = true;
        }
    }

    @ObfuscatedName("hh.no(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3662(String arg0) {
        class335[] var1 = class335.method3793();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class335 var3 = var1[var2];
            if (var3.field4148 != -1 && arg0.startsWith(class99.method50(var3.field4148))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4148).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("rw.nb(I)V")
    public static void method7736() {
        if (Statics.field4295 == null) {
            return;
        }
        field575 = field494;
        Statics.field4295.method6038();
        for (int var0 = 0; var0 < field758.length; var0++) {
            if (field758[var0] != null) {
                Statics.field4295.method6023((field758[var0].field1200 >> 7) + Statics.field218, (field758[var0].field1205 >> 7) + Statics.field1865);
            }
        }
    }

    @ObfuscatedName("cc.nu(II)V")
    public static void method1082(int arg0) {
        if (field701 != arg0) {
            field701 = arg0;
        }
    }

    @ObfuscatedName("dr.nt(B)Z")
    public static boolean method2154() {
        return field602 != null;
    }

    @ObfuscatedName("fj.np(ZB)V")
    public static void method2943(boolean arg0) {
        field622 = arg0;
    }

    @ObfuscatedName("ez.nq(II)Lst;")
    public static class472 method2831(int arg0) {
        class472 var1 = (class472) field570.method4921((long) arg0);
        if (var1 == null) {
            var1 = new class472(Statics.field3709, class474.method668(arg0), class474.method4400(arg0));
            field570.method4923(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("cu.nm(II)Lst;")
    public static class472 method1956(int arg0) {
        class472 var1 = (class472) field765.method4921((long) arg0);
        if (var1 == null) {
            var1 = new class472(Statics.field3709, arg0);
        }
        return var1;
    }

    @ObfuscatedName("ep.nx(II)V")
    public static void method2656(int arg0) {
        class206 var1 = class206.method5217(arg0);
        if (!var1.method3694()) {
            return;
        }
        int var2 = var1.field2258;
        class135 var3 = (class135) class206.field2257.method4921((long) var2);
        class135 var4;
        if (var3 == null) {
            class340 var5 = Statics.field2253;
            class340 var6 = Statics.field2250;
            boolean var7 = true;
            byte[] var8 = var5.method5866(var2 >> 16 & 0xFFFF, var2 & 0xFFFF);
            class135 var10;
            if (var8 == null) {
                boolean var9 = false;
                var10 = null;
            } else {
                int var11 = (var8[1] & 0xFF) << 8 | var8[2] & 0xFF;
                byte[] var12 = var6.method5866(var11, 0);
                if (var12 == null) {
                    var7 = false;
                }
                if (var7) {
                    if (Statics.field1414 == null) {
                        Statics.field1574 = Runtime.getRuntime().availableProcessors();
                        Statics.field1414 = new ThreadPoolExecutor(0, Statics.field1574, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1574 * 100 + 100), new class61());
                    }
                    try {
                        var10 = new class135(var5, var6, var2, false);
                    } catch (Exception var17) {
                        var10 = null;
                    }
                } else {
                    var10 = null;
                }
            }
            if (var10 != null) {
                class206.field2257.method4923(var10, (long) var2);
            }
            var4 = var10;
        } else {
            var4 = var3;
        }
        int var16;
        if (var4 == null) {
            var16 = 2;
        } else {
            var16 = var4.method2901() ? 0 : 1;
        }
        if (var16 == 2) {
            field746.add(var1.field2258);
        }
    }

    @ObfuscatedName("client.nl(I)V")
    public static void method1683() {
        for (int var0 = 0; var0 < field746.size(); var0++) {
            int var1 = (Integer) field746.get(var0);
            class135 var2 = (class135) class206.field2257.method4921((long) var1);
            class135 var3;
            if (var2 == null) {
                class340 var4 = Statics.field2253;
                class340 var5 = Statics.field2250;
                boolean var6 = true;
                byte[] var7 = var4.method5866(var1 >> 16 & 0xFFFF, var1 & 0xFFFF);
                class135 var9;
                if (var7 == null) {
                    boolean var8 = false;
                    var9 = null;
                } else {
                    int var10 = (var7[1] & 0xFF) << 8 | var7[2] & 0xFF;
                    byte[] var11 = var5.method5866(var10, 0);
                    if (var11 == null) {
                        var6 = false;
                    }
                    if (var6) {
                        if (Statics.field1414 == null) {
                            Statics.field1574 = Runtime.getRuntime().availableProcessors();
                            Statics.field1414 = new ThreadPoolExecutor(0, Statics.field1574, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1574 * 100 + 100), new class70());
                        }
                        try {
                            var9 = new class135(var4, var5, var1, false);
                        } catch (Exception var16) {
                            var9 = null;
                        }
                    } else {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    class206.field2257.method4923(var9, (long) var1);
                }
                var3 = var9;
            } else {
                var3 = var2;
            }
            int var15;
            if (var3 == null) {
                var15 = 2;
            } else {
                var15 = var3.method2901() ? 0 : 1;
            }
            if (var15 != 2) {
                field746.remove(var0);
                var0--;
            }
        }
    }
}

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
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;

public final class client extends class32 implements class366, OAuthApi {

    @ObfuscatedName("client.w")
    public static class192[] field531 = new class192[4];

    @ObfuscatedName("client.at")
    public static boolean field660 = true;

    @ObfuscatedName("client.br")
    public static int field539 = 1;

    @ObfuscatedName("client.ba")
    public static int field480 = 0;

    @ObfuscatedName("client.bi")
    public static int field597 = 0;

    @ObfuscatedName("client.bl")
    public static boolean field482 = false;

    @ObfuscatedName("client.bs")
    public static boolean field514 = false;

    @ObfuscatedName("client.bf")
    public static int field485 = -1;

    @ObfuscatedName("client.bz")
    public static int field486 = -1;

    @ObfuscatedName("client.bv")
    public static int field487 = -1;

    @ObfuscatedName("client.bt")
    public static boolean field491 = false;

    @ObfuscatedName("client.ck")
    public static int field510 = 0;

    @ObfuscatedName("client.cp")
    public static boolean field490 = true;

    @ObfuscatedName("client.dc")
    public static int field631 = 0;

    @ObfuscatedName("client.dp")
    public static long field492 = 1L;

    @ObfuscatedName("client.dy")
    public static int field493 = -1;

    @ObfuscatedName("client.dh")
    public static int field682 = -1;

    @ObfuscatedName("client.dj")
    public static long field495 = -1L;

    @ObfuscatedName("client.dx")
    public static boolean field636 = true;

    @ObfuscatedName("client.dd")
    public static int field497 = 0;

    @ObfuscatedName("client.do")
    public static int field496 = 0;

    @ObfuscatedName("client.di")
    public static int field674 = 0;

    @ObfuscatedName("client.de")
    public static int field667 = 0;

    @ObfuscatedName("client.db")
    public static int field501 = 0;

    @ObfuscatedName("client.dn")
    public static int field502 = 0;

    @ObfuscatedName("client.dz")
    public static int field564 = 0;

    @ObfuscatedName("client.dl")
    public static int field504 = 0;

    @ObfuscatedName("client.da")
    public static int field555 = 0;

    @ObfuscatedName("client.dr")
    public static class95 field506 = class95.field1287;

    @ObfuscatedName("client.ds")
    public static class95 field507 = class95.field1287;

    @ObfuscatedName("client.dw")
    public static int field741 = 0;

    @ObfuscatedName("client.em")
    public static int field509 = 0;

    @ObfuscatedName("client.eh")
    public static int field626 = 0;

    @ObfuscatedName("client.eu")
    public static int field512 = 0;

    @ObfuscatedName("client.eq")
    public static int field552 = 0;

    @ObfuscatedName("client.fs")
    public static int field627 = 0;

    @ObfuscatedName("client.fp")
    public static int field515 = 0;

    @ObfuscatedName("client.fy")
    public static int field655 = 0;

    @ObfuscatedName("client.fg")
    public static class125 field616 = class125.field1554;

    @ObfuscatedName("client.fd")
    public static class444 field518 = class444.field4735;

    @ObfuscatedName("client.fx")
    public String field519;

    @ObfuscatedName("client.fe")
    public class15 field520;

    @ObfuscatedName("client.fb")
    public class20 field521;

    @ObfuscatedName("client.fr")
    public OtlTokenRequester field479;

    @ObfuscatedName("client.fu")
    public Future field551;

    @ObfuscatedName("client.fc")
    public class20 field524;

    @ObfuscatedName("client.fj")
    public RefreshAccessTokenRequester field578;

    @ObfuscatedName("client.fm")
    public Future field582;

    @ObfuscatedName("client.fk")
    public static final String field527 = class343.method2597(class341.method1930("com_jagex_auth_desktop_osrs:public"));

    @ObfuscatedName("client.gp")
    public static boolean field528 = false;

    @ObfuscatedName("client.gk")
    public static class71 field567 = new class71();

    @ObfuscatedName("client.gi")
    public class440 field530;

    @ObfuscatedName("client.gq")
    public class8 field593;

    @ObfuscatedName("client.gh")
    public long field532 = -1L;

    @ObfuscatedName("client.gd")
    public static byte[] field533 = null;

    @ObfuscatedName("client.ga")
    public static class92[] field534 = new class92[32768];

    @ObfuscatedName("client.go")
    public static int field535 = 0;

    @ObfuscatedName("client.gu")
    public static int[] field536 = new int[32768];

    @ObfuscatedName("client.gn")
    public static int field566 = 0;

    @ObfuscatedName("client.gr")
    public static int[] field602 = new int[250];

    @ObfuscatedName("client.gm")
    public static final class100 field734 = new class100();

    @ObfuscatedName("client.gg")
    public static int field540 = 0;

    @ObfuscatedName("client.gt")
    public static boolean field541 = false;

    @ObfuscatedName("client.hy")
    public static boolean field542 = true;

    @ObfuscatedName("client.ht")
    public static boolean field494 = false;

    @ObfuscatedName("client.hu")
    public static class356 field544 = new class356();

    @ObfuscatedName("client.hc")
    public static HashMap field545 = new HashMap();

    @ObfuscatedName("client.hb")
    public static int field546 = 0;

    @ObfuscatedName("client.ho")
    public static int field547 = 1;

    @ObfuscatedName("client.hm")
    public static int field571 = 0;

    @ObfuscatedName("client.hd")
    public static int field549 = 1;

    @ObfuscatedName("client.hp")
    public static int field598 = 0;

    @ObfuscatedName("client.ig")
    public static boolean field585 = false;

    @ObfuscatedName("client.iy")
    public static int[][][] field730 = new int[4][13][13];

    @ObfuscatedName("client.ip")
    public static final int[] field554 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.in")
    public static int field728 = 0;

    @ObfuscatedName("client.it")
    public static String field649 = null;

    @ObfuscatedName("client.ij")
    public static int field556 = 2301979;

    @ObfuscatedName("client.ir")
    public static int field557 = 5063219;

    @ObfuscatedName("client.il")
    public static int field641 = 3353893;

    @ObfuscatedName("client.im")
    public static int field484 = 7759444;

    @ObfuscatedName("client.io")
    public static boolean field560 = false;

    @ObfuscatedName("client.jq")
    public static int field561 = 0;

    @ObfuscatedName("client.ju")
    public static int field562 = 128;

    @ObfuscatedName("client.jf")
    public static int field523 = 0;

    @ObfuscatedName("client.jr")
    public static int field647 = 0;

    @ObfuscatedName("client.jo")
    public static int field565 = 0;

    @ObfuscatedName("client.jp")
    public static int field650 = 0;

    @ObfuscatedName("client.jk")
    public static int field714 = 0;

    @ObfuscatedName("client.jw")
    public static int field698 = 0;

    @ObfuscatedName("client.je")
    public static int field761 = 50;

    @ObfuscatedName("client.ji")
    public static int field570 = 0;

    @ObfuscatedName("client.js")
    public static int field568 = 0;

    @ObfuscatedName("client.jx")
    public static int field572 = 0;

    @ObfuscatedName("client.jc")
    public static int field573 = 12;

    @ObfuscatedName("client.jz")
    public static int field574 = 6;

    @ObfuscatedName("client.jl")
    public static int field483 = 0;

    @ObfuscatedName("client.kf")
    public static boolean field576 = false;

    @ObfuscatedName("client.ka")
    public static int field577 = 0;

    @ObfuscatedName("client.kn")
    public static boolean field558 = false;

    @ObfuscatedName("client.kd")
    public static int field579 = 0;

    @ObfuscatedName("client.kh")
    public static int field580 = 0;

    @ObfuscatedName("client.kk")
    public static int field581 = 50;

    @ObfuscatedName("client.kp")
    public static int[] field716 = new int[field581];

    @ObfuscatedName("client.kl")
    public static int[] field583 = new int[field581];

    @ObfuscatedName("client.ki")
    public static int[] field584 = new int[field581];

    @ObfuscatedName("client.kv")
    public static int[] field623 = new int[field581];

    @ObfuscatedName("client.ks")
    public static int[] field586 = new int[field581];

    @ObfuscatedName("client.kw")
    public static int[] field704 = new int[field581];

    @ObfuscatedName("client.kj")
    public static int[] field588 = new int[field581];

    @ObfuscatedName("client.kb")
    public static String[] field589 = new String[field581];

    @ObfuscatedName("client.kc")
    public static int[][] field590 = new int[104][104];

    @ObfuscatedName("client.kr")
    public static int field591 = 0;

    @ObfuscatedName("client.kx")
    public static int field648 = -1;

    @ObfuscatedName("client.kt")
    public static int field673 = -1;

    @ObfuscatedName("client.ke")
    public static int field594 = 0;

    @ObfuscatedName("client.kz")
    public static int field595 = 0;

    @ObfuscatedName("client.ku")
    public static int field596 = 0;

    @ObfuscatedName("client.ko")
    public static int field537 = 0;

    @ObfuscatedName("client.kq")
    public static boolean field694 = true;

    @ObfuscatedName("client.kg")
    public static int field599 = 0;

    @ObfuscatedName("client.ky")
    public static int field600 = 0;

    @ObfuscatedName("client.li")
    public static int field601 = 0;

    @ObfuscatedName("client.lp")
    public static int field478 = 0;

    @ObfuscatedName("client.lc")
    public static int field517 = 0;

    @ObfuscatedName("client.lb")
    public static int field604 = 0;

    @ObfuscatedName("client.ld")
    public static boolean field605 = false;

    @ObfuscatedName("client.la")
    public static int field606 = 0;

    @ObfuscatedName("client.lw")
    public static int field607 = 0;

    @ObfuscatedName("client.lj")
    public static boolean field608 = true;

    @ObfuscatedName("client.ly")
    public static class85[] field609 = new class85[2048];

    @ObfuscatedName("client.lh")
    public static int field610 = -1;

    @ObfuscatedName("client.ls")
    public static int field611 = 0;

    @ObfuscatedName("client.lk")
    public static long field612 = -1L;

    @ObfuscatedName("client.lq")
    public static boolean field538 = true;

    @ObfuscatedName("client.ll")
    public static int field615 = 0;

    @ObfuscatedName("client.lo")
    public static int field622 = 0;

    @ObfuscatedName("client.lm")
    public static int[] field617 = new int[1000];

    @ObfuscatedName("client.ma")
    public static final int[] field618 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.mi")
    public static String[] field619 = new String[8];

    @ObfuscatedName("client.ms")
    public static boolean[] field620 = new boolean[8];

    @ObfuscatedName("client.ml")
    public static int[] field621 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.mt")
    public static int field625 = -1;

    @ObfuscatedName("client.mv")
    public static class335[][][] field725 = new class335[4][104][104];

    @ObfuscatedName("client.me")
    public static class335 field624 = new class335();

    @ObfuscatedName("client.mf")
    public static class335 field713 = new class335();

    @ObfuscatedName("client.md")
    public static class335 field529 = new class335();

    @ObfuscatedName("client.mr")
    public static int[] field508 = new int[25];

    @ObfuscatedName("client.mx")
    public static int[] field628 = new int[25];

    @ObfuscatedName("client.mo")
    public static int[] field629 = new int[25];

    @ObfuscatedName("client.mu")
    public static int field630 = 0;

    @ObfuscatedName("client.mp")
    public static boolean field498 = false;

    @ObfuscatedName("client.mq")
    public static int field632 = 0;

    @ObfuscatedName("client.my")
    public static int[] field505 = new int[500];

    @ObfuscatedName("client.mc")
    public static int[] field634 = new int[500];

    @ObfuscatedName("client.mz")
    public static int[] field635 = new int[500];

    @ObfuscatedName("client.mh")
    public static int[] field717 = new int[500];

    @ObfuscatedName("client.mw")
    public static String[] field637 = new String[500];

    @ObfuscatedName("client.nd")
    public static String[] field638 = new String[500];

    @ObfuscatedName("client.nj")
    public static boolean[] field639 = new boolean[500];

    @ObfuscatedName("client.na")
    public static boolean field640 = false;

    @ObfuscatedName("client.nn")
    public static boolean field526 = false;

    @ObfuscatedName("client.nr")
    public static boolean field642 = false;

    @ObfuscatedName("client.nm")
    public static boolean field643 = true;

    @ObfuscatedName("client.nb")
    public static int field644 = -1;

    @ObfuscatedName("client.ng")
    public static int field548 = -1;

    @ObfuscatedName("client.nq")
    public static int field646 = 0;

    @ObfuscatedName("client.nf")
    public static int field703 = 50;

    @ObfuscatedName("client.ni")
    public static int field726 = 0;

    @ObfuscatedName("client.no")
    public static boolean field500 = false;

    @ObfuscatedName("client.ny")
    public static int field651 = -1;

    @ObfuscatedName("client.nu")
    public static int field652 = -1;

    @ObfuscatedName("client.nk")
    public static String field686 = null;

    @ObfuscatedName("client.nv")
    public static String field503 = null;

    @ObfuscatedName("client.nh")
    public static int field543 = -1;

    @ObfuscatedName("client.nw")
    public static class421 field656 = new class421(8);

    @ObfuscatedName("client.od")
    public static int field488 = 0;

    @ObfuscatedName("client.ow")
    public static int field658 = -1;

    @ObfuscatedName("client.ou")
    public static int field706 = 0;

    @ObfuscatedName("client.ol")
    public static int field481 = 0;

    @ObfuscatedName("client.ob")
    public static class295 field661 = null;

    @ObfuscatedName("client.oz")
    public static int field662 = 0;

    @ObfuscatedName("client.ot")
    public static int field747 = 0;

    @ObfuscatedName("client.oh")
    public static int field664 = 0;

    @ObfuscatedName("client.ov")
    public static int field665 = -1;

    @ObfuscatedName("client.or")
    public static boolean field666 = false;

    @ObfuscatedName("client.ox")
    public static class295 field727 = null;

    @ObfuscatedName("client.og")
    public static class295 field668 = null;

    @ObfuscatedName("client.oq")
    public static class295 field669 = null;

    @ObfuscatedName("client.oj")
    public static int field670 = 0;

    @ObfuscatedName("client.oc")
    public static int field671 = 0;

    @ObfuscatedName("client.on")
    public static class295 field672 = null;

    @ObfuscatedName("client.ok")
    public static boolean field575 = false;

    @ObfuscatedName("client.os")
    public static int field748 = -1;

    @ObfuscatedName("client.of")
    public static int field675 = -1;

    @ObfuscatedName("client.om")
    public static boolean field676 = false;

    @ObfuscatedName("client.oi")
    public static int field654 = -1;

    @ObfuscatedName("client.oy")
    public static int field613 = -1;

    @ObfuscatedName("client.op")
    public static boolean field679 = false;

    @ObfuscatedName("client.pv")
    public static int field680 = 1;

    @ObfuscatedName("client.pj")
    public static int[] field681 = new int[32];

    @ObfuscatedName("client.pe")
    public static int field553 = 0;

    @ObfuscatedName("client.pu")
    public static int[] field683 = new int[32];

    @ObfuscatedName("client.pz")
    public static int field684 = 0;

    @ObfuscatedName("client.pg")
    public static int[] field685 = new int[32];

    @ObfuscatedName("client.pd")
    public static int field677 = 0;

    @ObfuscatedName("client.pb")
    public static int[] field687 = new int[32];

    @ObfuscatedName("client.pp")
    public static int field688 = 0;

    @ObfuscatedName("client.pa")
    public static int field689 = 0;

    @ObfuscatedName("client.pr")
    public static int field690 = 0;

    @ObfuscatedName("client.pm")
    public static int field691 = 0;

    @ObfuscatedName("client.ps")
    public static int field692 = 0;

    @ObfuscatedName("client.pq")
    public static int field693 = 0;

    @ObfuscatedName("client.pl")
    public static int field763 = 0;

    @ObfuscatedName("client.pf")
    public static int field513 = 0;

    @ObfuscatedName("client.pc")
    public static int field696 = 0;

    @ObfuscatedName("client.qp")
    public static int field697 = 0;

    @ObfuscatedName("client.qn")
    public static class335 field569 = new class335();

    @ObfuscatedName("client.qo")
    public static class335 field699 = new class335();

    @ObfuscatedName("client.qx")
    public static class335 field702 = new class335();

    @ObfuscatedName("client.qc")
    public static class421 field701 = new class421(512);

    @ObfuscatedName("client.qw")
    public static int field489 = 0;

    @ObfuscatedName("client.qd")
    public static int field695 = -2;

    @ObfuscatedName("client.qr")
    public static boolean[] field653 = new boolean[100];

    @ObfuscatedName("client.qk")
    public static boolean[] field705 = new boolean[100];

    @ObfuscatedName("client.qa")
    public static boolean[] field525 = new boolean[100];

    @ObfuscatedName("client.qh")
    public static int[] field707 = new int[100];

    @ObfuscatedName("client.qb")
    public static int[] field708 = new int[100];

    @ObfuscatedName("client.qj")
    public static int[] field592 = new int[100];

    @ObfuscatedName("client.qz")
    public static int[] field710 = new int[100];

    @ObfuscatedName("client.qs")
    public static int field711 = 0;

    @ObfuscatedName("client.qv")
    public static long field712 = 0L;

    @ObfuscatedName("client.qq")
    public static boolean field563 = true;

    @ObfuscatedName("client.rz")
    public static int[] field770 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ru")
    public static int field559 = 0;

    @ObfuscatedName("client.rt")
    public static int field659 = 0;

    @ObfuscatedName("client.rd")
    public static String field550 = "";

    @ObfuscatedName("client.ri")
    public static long[] field718 = new long[100];

    @ObfuscatedName("client.rj")
    public static int field719 = 0;

    @ObfuscatedName("client.rr")
    public static int field720 = 0;

    @ObfuscatedName("client.rn")
    public static int[] field721 = new int[128];

    @ObfuscatedName("client.rp")
    public static int[] field722 = new int[128];

    @ObfuscatedName("client.rm")
    public static long field723 = -1L;

    @ObfuscatedName("client.rk")
    public static class140[] field724 = new class140[4];

    @ObfuscatedName("client.rc")
    public static class149[] field765 = new class149[4];

    @ObfuscatedName("client.rw")
    public static int field516 = -1;

    @ObfuscatedName("client.ry")
    public static int field633 = 0;

    @ObfuscatedName("client.rf")
    public static int[] field737 = new int[1000];

    @ObfuscatedName("client.rl")
    public static int[] field729 = new int[1000];

    @ObfuscatedName("client.rs")
    public static class453[] field709 = new class453[1000];

    @ObfuscatedName("client.rq")
    public static int field731 = 0;

    @ObfuscatedName("client.sq")
    public static int field732 = 0;

    @ObfuscatedName("client.sv")
    public static int field733 = 0;

    @ObfuscatedName("client.sf")
    public static int field700 = -1;

    @ObfuscatedName("client.si")
    public static boolean field735 = false;

    @ObfuscatedName("client.sz")
    public static int field736 = 0;

    @ObfuscatedName("client.sn")
    public static int[] field499 = new int[50];

    @ObfuscatedName("client.sy")
    public static int[] field738 = new int[50];

    @ObfuscatedName("client.sa")
    public static int[] field739 = new int[50];

    @ObfuscatedName("client.st")
    public static int[] field740 = new int[50];

    @ObfuscatedName("client.se")
    public static class37[] field645 = new class37[50];

    @ObfuscatedName("client.so")
    public static boolean field742 = false;

    @ObfuscatedName("client.ti")
    public static boolean field743 = false;

    @ObfuscatedName("client.th")
    public static boolean[] field744 = new boolean[5];

    @ObfuscatedName("client.tg")
    public static int[] field745 = new int[5];

    @ObfuscatedName("client.tx")
    public static int[] field746 = new int[5];

    @ObfuscatedName("client.tp")
    public static int[] field715 = new int[5];

    @ObfuscatedName("client.tv")
    public static int[] field678 = new int[5];

    @ObfuscatedName("client.td")
    public static short field749 = 256;

    @ObfuscatedName("client.ty")
    public static short field750 = 205;

    @ObfuscatedName("client.tf")
    public static short field751 = 256;

    @ObfuscatedName("client.tw")
    public static short field752 = 320;

    @ObfuscatedName("client.tz")
    public static short field753 = 1;

    @ObfuscatedName("client.tt")
    public static short field754 = 32767;

    @ObfuscatedName("client.ug")
    public static short field657 = 1;

    @ObfuscatedName("client.uk")
    public static short field756 = 32767;

    @ObfuscatedName("client.un")
    public static int field757 = 0;

    @ObfuscatedName("client.up")
    public static int field758 = 0;

    @ObfuscatedName("client.uu")
    public static int field759 = 0;

    @ObfuscatedName("client.us")
    public static int field760 = 0;

    @ObfuscatedName("client.ua")
    public static int field755 = 0;

    @ObfuscatedName("client.uv")
    public static class293 field762 = new class293();

    @ObfuscatedName("client.uc")
    public static int field603 = -1;

    @ObfuscatedName("client.ur")
    public static int field764 = -1;

    @ObfuscatedName("client.uj")
    public static class414 field522 = new class412();

    @ObfuscatedName("client.ux")
    public static class325[] field766 = new class325[8];

    @ObfuscatedName("client.uy")
    public static class60 field767 = new class60();

    @ObfuscatedName("client.uz")
    public static int field768 = -1;

    @ObfuscatedName("client.uh")
    public static ArrayList field769 = new ArrayList(10);

    @ObfuscatedName("client.vp")
    public static int field587 = 0;

    @ObfuscatedName("client.vc")
    public static int field771 = 0;

    @ObfuscatedName("client.vu")
    public static final class59 field772 = new class59();

    @ObfuscatedName("client.vk")
    public static int[] field773 = new int[50];

    @ObfuscatedName("client.vl")
    public static int[] field774 = new int[50];

    @ObfuscatedName("client.au(B)V")
    public final void method436() {
    }

    public final void init() {
        if (!this.method414()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field542 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class93.field1270)) {
                            field482 = true;
                        } else {
                            field482 = false;
                        }
                        break;
                    case 4:
                        if (field486 == -1) {
                            field486 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field480 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var3 = Integer.parseInt(var2);
                        class331 var4;
                        if (var3 >= 0 && var3 < class331.field4124.length) {
                            var4 = class331.field4124[var3];
                        } else {
                            var4 = null;
                        }
                        Statics.field3066 = var4;
                        break;
                    case 7:
                        Statics.field4039 = class304.method4430(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class93.field1270)) {
                        }
                        break;
                    case 9:
                        Statics.field663 = var2;
                        break;
                    case 10:
                        class305[] var5 = new class305[] { class305.field3627, class305.field3629, class305.field3623, class305.field3626, class305.field3625, class305.field3622 };
                        Statics.field474 = (class305) class330.method4934(var5, Integer.parseInt(var2));
                        if (Statics.field474 == class305.field3622) {
                            Statics.field4426 = class424.field4609;
                        } else {
                            Statics.field4426 = class424.field4617;
                        }
                        break;
                    case 11:
                        Statics.field472 = var2;
                        break;
                    case 12:
                        field539 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field2808 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field597 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1281 = var2;
                        break;
                    case 21:
                        field485 = Integer.parseInt(var2);
                        break;
                    case 22:
                        field494 = Integer.parseInt(var2) != 0;
                }
            }
        }
        method2896();
        Statics.field4246 = this.getCodeBase().getHost();
        String var6 = Statics.field4039.field3619;
        byte var7 = 0;
        try {
            class158.method2044("oldschool", var6, var7, 21);
        } catch (Exception var9) {
            class464.method5148((String) null, var9);
        }
        Statics.field1075 = this;
        Statics.field4650 = field486;
        if (field487 == -1) {
            field487 = 0;
        }
        Statics.field407 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field2662 = System.getenv("JX_REFRESH_TOKEN");
        this.method413(765, 503, 205);
    }

    @ObfuscatedName("fp.eu(I)V")
    public static final void method2896() {
        class205.field2482 = false;
        field514 = false;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field479 = arg0;
            class69.method2643(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field578 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field510 == 10;
    }

    public long getAccountHash() {
        return this.field532;
    }

    @ObfuscatedName("client.ez(I)Z")
    public boolean method1059() {
        return Statics.field407 != null && !Statics.field407.trim().isEmpty();
    }

    @ObfuscatedName("client.eq(B)Z")
    public boolean method1427() {
        return this.field479 != null;
    }

    @ObfuscatedName("client.fs(Ljava/lang/String;B)V")
    public void method1061(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field472 + "shield/oauth/token" + (new class402(var2)).method6379());
        HashMap var4 = new HashMap();
        var4.put("Authorization", "Basic " + field527);
        var4.put("Host", (new URL(Statics.field472)).getHost());
        var4.put("Accept", class399.field4433.method6360());
        class10 var5 = class10.field33;
        RefreshAccessTokenRequester var6 = this.field578;
        if (var6 != null) {
            this.field582 = var6.request(var5.method63(), var3, var4, "");
            return;
        }
        class11 var7 = new class11(var3, var5);
        Iterator var8 = var4.entrySet().iterator();
        while (var8.hasNext()) {
            Entry var9 = (Entry) var8.next();
            var7.method71((String) var9.getKey(), (String) var9.getValue());
        }
        this.field524 = this.field520.method153(var7);
    }

    @ObfuscatedName("client.fp(Ljava/lang/String;I)V")
    public void method1141(String arg0) throws MalformedURLException, IOException {
        URL var2 = new URL(Statics.field472 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        HashMap var3 = new HashMap();
        var3.put("Authorization", "Bearer " + arg0);
        class10 var4 = class10.field41;
        OtlTokenRequester var5 = this.field479;
        if (var5 != null) {
            this.field551 = var5.request(var4.method63(), var2, var3, "");
            return;
        }
        class11 var6 = new class11(var2, var4);
        Iterator var7 = var3.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            var6.method71((String) var8.getKey(), (String) var8.getValue());
        }
        this.field521 = this.field520.method153(var6);
    }

    @ObfuscatedName("client.u(S)V")
    public final void method443() {
        class354.method1771(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field997 = field597 == 0 ? 43594 : field539 + 40000;
        Statics.field4091 = field597 == 0 ? 443 : field539 + 50000;
        Statics.field2763 = Statics.field997;
        Statics.field3353 = class294.field3376;
        Statics.field4470 = class294.field3372;
        Statics.field4157 = class294.field3377;
        Statics.field3367 = class294.field3375;
        Statics.field1385 = new class102();
        this.method407();
        this.method408();
        Statics.field1837 = this.method415();
        Statics.field1622 = new class382(255, class158.field1765, class158.field1773, 500000);
        class426 var1 = null;
        class90 var2 = new class90();
        try {
            var1 = class158.method2457("", Statics.field474.field3628, false);
            byte[] var3 = new byte[(int) var1.method6724()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method6731(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class90(new class440(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method6725();
            }
        } catch (Exception var9) {
        }
        Statics.field65 = var2;
        this.method405();
        class30.method1891(this, Statics.field207);
        method5022(Statics.field65.method2155());
        Statics.field4350 = new class62(Statics.field4426);
        this.field520 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.ag(I)V")
    public final void method428() {
        field631++;
        this.method1065();
        while (true) {
            class335 var1 = class313.field4001;
            class312 var2;
            synchronized (class313.field4001) {
                var2 = (class312) class313.field4000.method5416();
            }
            if (var2 == null) {
                try {
                    if (class274.field3237 == 1) {
                        int var4 = Statics.field3236.method4658();
                        if (var4 > 0 && Statics.field3236.method4664()) {
                            int var5 = var4 - Statics.field4088;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field3236.method4657(var5);
                        } else {
                            Statics.field3236.method4663();
                            Statics.field3236.method4732();
                            if (Statics.field1582 == null) {
                                class274.field3237 = 0;
                            } else {
                                class274.field3237 = 2;
                            }
                            Statics.field3238 = null;
                            Statics.field1736 = null;
                        }
                    }
                } catch (Exception var14) {
                    var14.printStackTrace();
                    Statics.field3236.method4663();
                    class274.field3237 = 0;
                    Statics.field3238 = null;
                    Statics.field1736 = null;
                    Statics.field1582 = null;
                }
                method1938();
                class24 var7 = class24.field126;
                synchronized (class24.field126) {
                    class24.field146++;
                    class24.field143 = class24.field145;
                    class24.field140 = 0;
                    class24.field135 = 0;
                    Arrays.fill(class24.field121, false);
                    Arrays.fill(class24.field133, false);
                    if (class24.field136 < 0) {
                        Arrays.fill(class24.field131, false);
                        class24.field136 = class24.field151;
                    } else {
                        while (class24.field151 != class24.field136) {
                            int var8 = class24.field134[class24.field151];
                            class24.field151 = class24.field151 + 1 & 0x7F;
                            if (var8 < 0) {
                                int var9 = ~var8;
                                if (class24.field131[var9]) {
                                    class24.field131[var9] = false;
                                    class24.field133[var9] = true;
                                    class24.field141[class24.field135] = var9;
                                    class24.field135++;
                                }
                            } else {
                                if (!class24.field131[var8] && class24.field140 < class24.field139.length - 1) {
                                    class24.field121[var8] = true;
                                    class24.field139[++class24.field140 - 1] = var8;
                                }
                                class24.field131[var8] = true;
                            }
                        }
                    }
                    if (class24.field140 > 0) {
                        class24.field146 = 0;
                    }
                    class24.field145 = class24.field144;
                }
                class33.method4091();
                if (Statics.field1837 != null) {
                    int var11 = Statics.field1837.method280();
                    field697 = var11;
                }
                if (field510 == 0) {
                    method2742();
                    class32.method6636();
                } else if (field510 == 5) {
                    class69.method2674(this, Statics.field1718);
                    method2742();
                    class32.method6636();
                } else if (field510 == 10 || field510 == 11) {
                    class69.method2674(this, Statics.field1718);
                } else if (field510 == 20) {
                    class69.method2674(this, Statics.field1718);
                    this.method1070();
                } else if (field510 == 50) {
                    class69.method2674(this, Statics.field1718);
                    this.method1070();
                } else if (field510 == 25) {
                    method5115();
                }
                if (field510 == 30) {
                    this.method1069();
                } else if (field510 == 40 || field510 == 45) {
                    this.method1070();
                }
                return;
            }
            var2.field3997.method5165(var2.field3993, (int) var2.field4468, var2.field3994, false);
        }
    }

    @ObfuscatedName("client.ar(ZI)V")
    public final void method464(boolean arg0) {
        boolean var2 = class274.method2292();
        if (var2 && field735 && Statics.field1004 != null) {
            Statics.field1004.method689();
        }
        if ((field510 == 10 || field510 == 20 || field510 == 30) && field712 != 0L && class270.method2485() > field712) {
            method5022(method2650());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field653[var3] = true;
            }
        }
        if (field510 == 0) {
            this.method430(class69.field886, class69.field887, arg0);
        } else if (field510 == 5) {
            class69.method764(Statics.field980, Statics.field1331, Statics.field1718);
        } else if (field510 == 10 || field510 == 11) {
            class69.method764(Statics.field980, Statics.field1331, Statics.field1718);
        } else if (field510 == 20) {
            class69.method764(Statics.field980, Statics.field1331, Statics.field1718);
        } else if (field510 == 50) {
            class69.method764(Statics.field980, Statics.field1331, Statics.field1718);
        } else if (field510 == 25) {
            if (field598 == 1) {
                if (field546 > field547) {
                    field547 = field546;
                }
                int var4 = (field547 * 50 - field546 * 50) / field547;
                method4580(class309.field3661 + class93.field1265 + class93.field1276 + var4 + "%" + class93.field1264, false);
            } else if (field598 == 2) {
                if (field571 > field549) {
                    field549 = field571;
                }
                int var5 = (field549 * 50 - field571 * 50) / field549 + 50;
                method4580(class309.field3661 + class93.field1265 + class93.field1276 + var5 + "%" + class93.field1264, false);
            } else {
                method4580(class309.field3661, false);
            }
        } else if (field510 == 30) {
            this.method1071();
        } else if (field510 == 40) {
            method4580(class309.field3885 + class93.field1265 + class309.field3663, false);
        } else if (field510 == 45) {
            method4580(class309.field3697, false);
        }
        if (field510 == 30 && field711 == 0 && !arg0 && !field563) {
            for (int var6 = 0; var6 < field489; var6++) {
                if (field705[var6]) {
                    Statics.field153.method386(field707[var6], field708[var6], field592[var6], field710[var6]);
                    field705[var6] = false;
                }
            }
        } else if (field510 > 0) {
            Statics.field153.method385(0, 0);
            for (int var7 = 0; var7 < field489; var7++) {
                field705[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.am(B)V")
    public final void method429() {
        if (Statics.field1564.method2306()) {
            Statics.field1564.method2303();
        }
        if (Statics.field1329 != null) {
            Statics.field1329.field1071 = false;
        }
        Statics.field1329 = null;
        field734.method2364();
        class24.method2946();
        if (class33.field220 != null) {
            class33 var1 = class33.field220;
            synchronized (class33.field220) {
                class33.field220 = null;
            }
        }
        Statics.field1837 = null;
        if (Statics.field1004 != null) {
            Statics.field1004.method690();
        }
        if (Statics.field4582 != null) {
            Statics.field4582.method690();
        }
        if (Statics.field4040 != null) {
            Statics.field4040.method2910();
        }
        class313.method3913();
        if (Statics.field1385 != null) {
            Statics.field1385.method2389();
            Statics.field1385 = null;
        }
        try {
            class158.field1765.method6745();
            for (int var3 = 0; var3 < Statics.field1415; var3++) {
                Statics.field1774[var3].method6745();
            }
            class158.field1773.method6745();
            class158.field1771.method6745();
        } catch (Exception var6) {
        }
        this.field520.method154();
    }

    @ObfuscatedName("ci.fy(II)V")
    public static void method2046(int arg0) {
        if (field510 == arg0) {
            return;
        }
        if (field510 == 0) {
            Statics.field1075.method431();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method340(0);
            field627 = 0;
            field515 = 0;
            field544.method5873(arg0);
            if (arg0 != 20) {
                method1635(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3338 != null) {
            Statics.field3338.method2910();
            Statics.field3338 = null;
        }
        if (field510 == 25) {
            field598 = 0;
            field546 = 0;
            field547 = 1;
            field571 = 0;
            field549 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = method2578() ? 0 : 12;
            class69.method4431(Statics.field821, Statics.field3638, true, var2);
        } else if (arg0 == 20) {
            int var1 = field510 == 11 ? 4 : 0;
            class69.method4431(Statics.field821, Statics.field3638, false, var1);
        } else if (arg0 == 11) {
            class69.method4431(Statics.field821, Statics.field3638, false, 4);
        } else if (arg0 == 50) {
            class69.method5664("", "Updating date of birth...", "");
            class69.method4431(Statics.field821, Statics.field3638, false, 7);
        } else if (Statics.field878) {
            Statics.field895 = null;
            Statics.field898 = null;
            Statics.field885 = null;
            Statics.field1420 = null;
            Statics.field1005 = null;
            Statics.field1842 = null;
            Statics.field4261 = null;
            Statics.field873 = null;
            Statics.field1361 = null;
            Statics.field214 = null;
            Statics.field2945 = null;
            Statics.field1445 = null;
            Statics.field3203 = null;
            Statics.field3998 = null;
            Statics.field2254.method2095();
            class274.method2403(2);
            class317.method1983(true);
            Statics.field878 = false;
        }
        field510 = arg0;
    }

    @ObfuscatedName("client.fg(I)V")
    public void method1065() {
        if (field510 == 1000) {
            return;
        }
        long var1 = class270.method2485();
        int var3 = (int) (var1 - Statics.field4042);
        Statics.field4042 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class317.field4056 += var3;
        boolean var4;
        if (class317.field4051 == 0 && class317.field4046 == 0 && class317.field4049 == 0 && class317.field4045 == 0) {
            var4 = true;
        } else if (Statics.field4040 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class317.field4056 > 30000) {
                        throw new IOException();
                    }
                    while (class317.field4046 < 200 && class317.field4045 > 0) {
                        class315 var5 = (class315) class317.field4043.method6698();
                        class440 var6 = new class440(4);
                        var6.method6876(1);
                        var6.method6893((int) var5.field4468);
                        Statics.field4040.method2913(var6.field4679, 0, 4);
                        class317.field4052.method6688(var5, var5.field4468);
                        class317.field4045--;
                        class317.field4046++;
                    }
                    while (class317.field4051 < 200 && class317.field4049 > 0) {
                        class315 var7 = (class315) class317.field4041.method5407();
                        class440 var8 = new class440(4);
                        var8.method6876(0);
                        var8.method6893((int) var7.field4468);
                        Statics.field4040.method2913(var8.field4679, 0, 4);
                        var7.method6393();
                        class317.field4050.method6688(var7, var7.field4468);
                        class317.field4049--;
                        class317.field4051++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field4040.method2941();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class317.field4056 = 0;
                        byte var11 = 0;
                        if (Statics.field2814 == null) {
                            var11 = 8;
                        } else if (class317.field4053 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class317.field4054.field4678;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field4040.method2915(class317.field4054.field4679, class317.field4054.field4678, var12);
                            if (class317.field4044 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class317.field4054.field4679[class317.field4054.field4678 + var13] ^= class317.field4044;
                                }
                            }
                            class317.field4054.field4678 += var12;
                            if (class317.field4054.field4678 < var11) {
                                break;
                            }
                            if (Statics.field2814 == null) {
                                class317.field4054.field4678 = 0;
                                int var14 = class317.field4054.method7071();
                                int var15 = class317.field4054.method7082();
                                int var16 = class317.field4054.method7071();
                                int var17 = class317.field4054.method6898();
                                long var18 = (long) ((var14 << 16) + var15);
                                class315 var20 = (class315) class317.field4052.method6687(var18);
                                Statics.field3219 = true;
                                if (var20 == null) {
                                    var20 = (class315) class317.field4050.method6687(var18);
                                    Statics.field3219 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2814 = var20;
                                Statics.field4250 = new class440(var17 + var21 + Statics.field2814.field4019);
                                Statics.field4250.method6876(var16);
                                Statics.field4250.method6879(var17);
                                class317.field4053 = 8;
                                class317.field4054.field4678 = 0;
                            } else if (class317.field4053 == 0) {
                                if (class317.field4054.field4679[0] == -1) {
                                    class317.field4053 = 1;
                                    class317.field4054.field4678 = 0;
                                } else {
                                    Statics.field2814 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field4250.field4679.length - Statics.field2814.field4019;
                            int var23 = 512 - class317.field4053;
                            if (var23 > var22 - Statics.field4250.field4678) {
                                var23 = var22 - Statics.field4250.field4678;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field4040.method2915(Statics.field4250.field4679, Statics.field4250.field4678, var23);
                            if (class317.field4044 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field4250.field4679[Statics.field4250.field4678 + var24] ^= class317.field4044;
                                }
                            }
                            Statics.field4250.field4678 += var23;
                            class317.field4053 += var23;
                            if (Statics.field4250.field4678 == var22) {
                                if (Statics.field2814.field4468 == 16711935L) {
                                    Statics.field3607 = Statics.field4250;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class314 var26 = class317.field4055[var25];
                                        if (var26 != null) {
                                            Statics.field3607.field4678 = var25 * 8 + 5;
                                            int var27 = Statics.field3607.method6898();
                                            int var28 = Statics.field3607.method6898();
                                            var26.method5183(var27, var28);
                                        }
                                    }
                                } else {
                                    class317.field4059.reset();
                                    class317.field4059.update(Statics.field4250.field4679, 0, var22);
                                    int var29 = (int) class317.field4059.getValue();
                                    if (Statics.field2814.field4018 != var29) {
                                        try {
                                            Statics.field4040.method2910();
                                        } catch (Exception var35) {
                                        }
                                        class317.field4057++;
                                        Statics.field4040 = null;
                                        class317.field4044 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class317.field4057 = 0;
                                    class317.field4058 = 0;
                                    Statics.field2814.field4017.method5155((int) (Statics.field2814.field4468 & 0xFFFFL), Statics.field4250.field4679, (Statics.field2814.field4468 & 0xFF0000L) == 16711680L, Statics.field3219);
                                }
                                Statics.field2814.method6399();
                                if (Statics.field3219) {
                                    class317.field4046--;
                                } else {
                                    class317.field4051--;
                                }
                                class317.field4053 = 0;
                                Statics.field2814 = null;
                                Statics.field4250 = null;
                            } else {
                                if (class317.field4053 != 512) {
                                    break;
                                }
                                class317.field4053 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field4040.method2910();
                } catch (Exception var34) {
                }
                class317.field4058++;
                Statics.field4040 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1066();
        }
    }

    @ObfuscatedName("client.fd(S)V")
    public void method1066() {
        if (class317.field4057 >= 4) {
            this.method513("js5crc");
            method2046(1000);
            return;
        }
        if (class317.field4058 >= 4) {
            if (field510 <= 5) {
                this.method513("js5io");
                method2046(1000);
                return;
            }
            field626 = 3000;
            class317.field4058 = 3;
        }
        if (--field626 + 1 > 0) {
            return;
        }
        try {
            if (field509 == 0) {
                Statics.field2943 = Statics.field198.method2869(Statics.field4246, Statics.field2763);
                field509++;
            }
            if (field509 == 1) {
                if (Statics.field2943.field1826 == 2) {
                    this.method1067(-1);
                    return;
                }
                if (Statics.field2943.field1826 == 1) {
                    field509++;
                }
            }
            if (field509 == 2) {
                if (field542) {
                    Socket var1 = (Socket) Statics.field2943.field1830;
                    class379 var2 = new class379(var1, 40000, 5000);
                    Statics.field1326 = var2;
                } else {
                    Statics.field1326 = new class162((Socket) Statics.field2943.field1830, Statics.field198, 5000);
                }
                class440 var3 = new class440(5);
                var3.method6876(15);
                var3.method6879(205);
                Statics.field1326.method2913(var3.field4679, 0, 5);
                field509++;
                Statics.field1705 = class270.method2485();
            }
            if (field509 == 3) {
                if (Statics.field1326.method2941() > 0 || !field542 && field510 <= 5) {
                    int var4 = Statics.field1326.method2912();
                    if (var4 != 0) {
                        this.method1067(var4);
                        return;
                    }
                    field509++;
                } else if (class270.method2485() - Statics.field1705 > 30000L) {
                    this.method1067(-2);
                    return;
                }
            }
            if (field509 == 4) {
                class317.method3721(Statics.field1326, field510 > 20);
                Statics.field2943 = null;
                Statics.field1326 = null;
                field509 = 0;
                field512 = 0;
            }
        } catch (IOException var6) {
            this.method1067(-3);
        }
    }

    @ObfuscatedName("client.fh(II)V")
    public void method1067(int arg0) {
        Statics.field2943 = null;
        Statics.field1326 = null;
        field509 = 0;
        if (Statics.field997 == Statics.field2763) {
            Statics.field2763 = Statics.field4091;
        } else {
            Statics.field2763 = Statics.field997;
        }
        field512++;
        if (field512 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field510 <= 5) {
                this.method513("js5connect_full");
                method2046(1000);
            } else {
                field626 = 3000;
            }
        } else if (field512 >= 2 && arg0 == 6) {
            this.method513("js5connect_outofdate");
            method2046(1000);
        } else if (field512 >= 4) {
            if (field510 <= 5) {
                this.method513("js5connect");
                method2046(1000);
            } else {
                field626 = 3000;
            }
        }
    }

    @ObfuscatedName("ct.fv(Lle;Ljava/lang/String;I)V")
    public static void method2216(class314 arg0, String arg1) {
        class77 var2 = new class77(arg0, arg1);
        field769.add(var2);
        field771 += var2.field1009;
    }

    @ObfuscatedName("dr.ff(I)Z")
    public static boolean method2600() {
        if (field769 == null || field587 >= field769.size()) {
            return true;
        }
        while (field587 < field769.size()) {
            class77 var0 = (class77) field769.get(field587);
            if (!var0.method1934()) {
                return false;
            }
            field587++;
        }
        return true;
    }

    @ObfuscatedName("er.fz(I)I")
    public static int method2677() {
        if (field769 == null || field587 >= field769.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field587; var1++) {
            var0 += ((class77) field769.get(var1)).field1015;
        }
        return var0 * 10000 / field771;
    }

    @ObfuscatedName("hm.fq(IIB)V")
    public static void method4191(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = Statics.method87(var4);
            int var6 = class202.field2402[var4];
            int var7 = arg1 - 334;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 100) {
                var7 = 100;
            }
            int var8 = (field752 - field751) * var7 / 100 + field751;
            int var9 = var5 * var8 / 256;
            var2[var3] = var6 * var9 >> 16;
        }
        class205.method3897(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ek.fo(B)V")
    public static void method2742() {
        if (field741 == 0) {
            Statics.field1926 = new class205(4, 104, 104, class75.field985);
            for (int var0 = 0; var0 < 4; var0++) {
                field531[var0] = new class192(104, 104);
            }
            Statics.field1043 = new class453(512, 512);
            class69.field887 = class309.field3664;
            class69.field886 = 5;
            field741 = 20;
        } else if (field741 == 20) {
            class69.field887 = class309.field3665;
            class69.field886 = 10;
            field741 = 30;
        } else if (field741 == 30) {
            Statics.field1798 = method4231(0, false, true, true);
            Statics.field1836 = method4231(1, false, true, true);
            Statics.field4249 = method4231(2, true, false, true);
            Statics.field2260 = method4231(3, false, true, true);
            Statics.field229 = method4231(4, false, true, true);
            Statics.field464 = method4231(5, true, true, true);
            Statics.field4325 = method4231(6, true, true, true);
            Statics.field1037 = method4231(7, false, true, true);
            Statics.field3638 = method4231(8, false, true, true);
            Statics.field1298 = method4231(9, false, true, true);
            Statics.field821 = method4231(10, false, true, true);
            Statics.field1371 = method4231(11, false, true, true);
            Statics.field1464 = method4231(12, false, true, true);
            Statics.field83 = method4231(13, true, false, true);
            Statics.field1359 = method4231(14, false, true, true);
            Statics.field511 = method4231(15, false, true, true);
            Statics.field1446 = method4231(17, true, true, true);
            Statics.field1268 = method4231(18, false, true, true);
            Statics.field1864 = method4231(19, false, true, true);
            Statics.field1016 = method4231(20, false, true, true);
            class69.field887 = class309.field3889;
            class69.field886 = 20;
            field741 = 40;
        } else if (field741 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1798.method5175() * 4 / 100;
            int var3 = var2 + Statics.field1836.method5175() * 4 / 100;
            int var4 = var3 + Statics.field4249.method5175() * 2 / 100;
            int var5 = var4 + Statics.field2260.method5175() * 2 / 100;
            int var6 = var5 + Statics.field229.method5175() * 6 / 100;
            int var7 = var6 + Statics.field464.method5175() * 4 / 100;
            int var8 = var7 + Statics.field4325.method5175() * 2 / 100;
            int var9 = var8 + Statics.field1037.method5175() * 56 / 100;
            int var10 = var9 + Statics.field3638.method5175() * 2 / 100;
            int var11 = var10 + Statics.field1298.method5175() * 2 / 100;
            int var12 = var11 + Statics.field821.method5175() * 2 / 100;
            int var13 = var12 + Statics.field1371.method5175() * 2 / 100;
            int var14 = var13 + Statics.field1464.method5175() * 2 / 100;
            int var15 = var14 + Statics.field83.method5175() * 2 / 100;
            int var16 = var15 + Statics.field1359.method5175() * 2 / 100;
            int var17 = var16 + Statics.field511.method5175() * 2 / 100;
            int var18 = var17 + Statics.field1864.method5175() / 100;
            int var19 = var18 + Statics.field1268.method5175() / 100;
            int var20 = var19 + Statics.field1016.method5175() / 100;
            int var21 = var20 + (Statics.field1446.method5150() && Statics.field1446.method5188() ? 1 : 0);
            if (var21 == 100) {
                method2216(Statics.field1798, "Animations");
                method2216(Statics.field1836, "Skeletons");
                method2216(Statics.field229, "Sound FX");
                method2216(Statics.field464, "Maps");
                method2216(Statics.field4325, "Music Tracks");
                method2216(Statics.field1037, "Models");
                method2216(Statics.field3638, "Sprites");
                method2216(Statics.field1371, "Music Jingles");
                method2216(Statics.field1359, "Music Samples");
                method2216(Statics.field511, "Music Patches");
                method2216(Statics.field1864, "World Map");
                method2216(Statics.field1268, "World Map Geography");
                method2216(Statics.field1016, "World Map Ground");
                Statics.field165 = new class384();
                Statics.field165.method6158(Statics.field1446);
                class69.field887 = class309.field3685;
                class69.field886 = 30;
                field741 = 45;
            } else {
                if (var21 != 0) {
                    class69.field887 = class309.field3667 + var21 + "%";
                }
                class69.field886 = 30;
            }
        } else if (field741 == 45) {
            class40.method4440(22050, !field514, 2);
            class275 var22 = new class275();
            var22.method4716(9, 128);
            Statics.field1004 = class40.method4623(Statics.field198, 0, 22050);
            Statics.field1004.method706(var22);
            class314 var23 = Statics.field511;
            class314 var24 = Statics.field1359;
            class314 var25 = Statics.field229;
            Statics.field3235 = var23;
            Statics.field4808 = var24;
            Statics.field3242 = var25;
            Statics.field3236 = var22;
            Statics.field4582 = class40.method4623(Statics.field198, 1, 2048);
            Statics.field1539 = new class36();
            Statics.field4582.method706(Statics.field1539);
            Statics.field4456 = new class53(22050, Statics.field301);
            class69.field887 = class309.field3669;
            class69.field886 = 35;
            field741 = 50;
            Statics.field221 = new class417(Statics.field3638, Statics.field83);
        } else if (field741 == 50) {
            int var26 = class418.method6646().length;
            field545 = Statics.field221.method6638(class418.method6646());
            if (field545.size() < var26) {
                class69.field887 = class309.field3957 + field545.size() * 100 / var26 + "%";
                class69.field886 = 40;
            } else {
                Statics.field1331 = (class350) field545.get(class418.field4592);
                Statics.field1718 = (class350) field545.get(class418.field4585);
                Statics.field980 = (class350) field545.get(class418.field4591);
                Statics.field1613 = field522.method6405();
                class69.field887 = class309.field3960;
                class69.field886 = 40;
                field741 = 60;
            }
        } else if (field741 == 60) {
            int var27 = class69.method331(Statics.field821, Statics.field3638);
            int var28 = class69.field912.length + class69.field911.length;
            if (var27 < var28) {
                class69.field887 = class309.field3672 + var27 * 100 / var28 + "%";
                class69.field886 = 50;
            } else {
                class69.field887 = class309.field3673;
                class69.field886 = 50;
                method2046(5);
                field741 = 70;
            }
        } else if (field741 == 70) {
            if (Statics.field4249.method5188()) {
                class190.method4094(Statics.field4249);
                class314 var30 = Statics.field4249;
                Statics.field2020 = var30;
                class174.method2895(Statics.field4249, Statics.field1037);
                class188.method2265(Statics.field4249, Statics.field1037, field514);
                class314 var31 = Statics.field4249;
                class314 var32 = Statics.field1037;
                Statics.field1981 = var31;
                Statics.field91 = var32;
                class186.method1567(Statics.field4249);
                class314 var33 = Statics.field4249;
                class314 var34 = Statics.field1037;
                boolean var35 = field482;
                class350 var36 = Statics.field1331;
                Statics.field2181 = var33;
                Statics.field2132 = var34;
                Statics.field1081 = var35;
                Statics.field1020 = Statics.field2181.method5200(10);
                Statics.field1695 = var36;
                class314 var37 = Statics.field4249;
                class314 var38 = Statics.field1798;
                class314 var39 = Statics.field1836;
                Statics.field2211 = var37;
                Statics.field2204 = var38;
                Statics.field2205 = var39;
                class314 var40 = Statics.field4249;
                class314 var41 = Statics.field1037;
                Statics.field2012 = var40;
                Statics.field1924 = var41;
                class314 var42 = Statics.field4249;
                Statics.field2036 = var42;
                class314 var43 = Statics.field4249;
                Statics.field1863 = var43;
                Statics.field1858 = Statics.field1863.method5200(16);
                class295.method5885(Statics.field2260, Statics.field1037, Statics.field3638, Statics.field83);
                class314 var44 = Statics.field4249;
                Statics.field1853 = var44;
                class314 var45 = Statics.field4249;
                Statics.field1930 = var45;
                class314 var46 = Statics.field4249;
                Statics.field1892 = var46;
                Statics.method172(Statics.field4249);
                class185.method5124(Statics.field4249);
                Statics.field913 = new class429(Statics.field474, 54, Statics.field3066, Statics.field4249);
                Statics.field2704 = new class429(Statics.field474, 47, Statics.field3066, Statics.field4249);
                Statics.field1564 = new class98();
                class187.method498(Statics.field4249, Statics.field3638, Statics.field83);
                class314 var47 = Statics.field4249;
                class314 var48 = Statics.field3638;
                Statics.field794 = var47;
                Statics.field1912 = var48;
                class172.method2800(Statics.field4249, Statics.field3638);
                class69.field887 = class309.field3675;
                class69.field886 = 60;
                field741 = 80;
            } else {
                class69.field887 = class309.field3674 + Statics.field4249.method5151() + "%";
                class69.field886 = 60;
            }
        } else if (field741 == 80) {
            int var49 = 0;
            if (Statics.field318 == null) {
                Statics.field318 = class454.method3230(Statics.field3638, Statics.field165.field4380, 0);
            } else {
                var49++;
            }
            if (Statics.field4168 == null) {
                Statics.field4168 = class454.method3230(Statics.field3638, Statics.field165.field4374, 0);
            } else {
                var49++;
            }
            if (Statics.field172 == null) {
                Statics.field172 = class454.method1957(Statics.field3638, Statics.field165.field4383, 0);
            } else {
                var49++;
            }
            if (Statics.field1374 == null) {
                class314 var50 = Statics.field3638;
                int var51 = Statics.field165.field4384;
                class453[] var52;
                if (class454.method6002(var50, var51, 0)) {
                    class453[] var53 = new class453[Statics.field4783];
                    int var54 = 0;
                    while (true) {
                        if (var54 >= Statics.field4783) {
                            class454.method3036();
                            var52 = var53;
                            break;
                        }
                        class453 var55 = var53[var54] = new class453();
                        var55.field4772 = Statics.field4780;
                        var55.field4776 = Statics.field4782;
                        var55.field4773 = Statics.field4781[var54];
                        var55.field4771 = Statics.field4779[var54];
                        var55.field4768 = Statics.field460[var54];
                        var55.field4770 = Statics.field4784[var54];
                        int var56 = var55.field4770 * var55.field4768;
                        byte[] var57 = Statics.field1570[var54];
                        var55.field4767 = new int[var56];
                        for (int var58 = 0; var58 < var56; var58++) {
                            var55.field4767[var58] = Statics.field405[var57[var58] & 0xFF];
                        }
                        var54++;
                    }
                } else {
                    var52 = null;
                }
                Statics.field1374 = var52;
            } else {
                var49++;
            }
            if (Statics.field979 == null) {
                class314 var60 = Statics.field3638;
                int var61 = Statics.field165.field4377;
                class453[] var62;
                if (class454.method6002(var60, var61, 0)) {
                    class453[] var63 = new class453[Statics.field4783];
                    int var64 = 0;
                    while (true) {
                        if (var64 >= Statics.field4783) {
                            class454.method3036();
                            var62 = var63;
                            break;
                        }
                        class453 var65 = var63[var64] = new class453();
                        var65.field4772 = Statics.field4780;
                        var65.field4776 = Statics.field4782;
                        var65.field4773 = Statics.field4781[var64];
                        var65.field4771 = Statics.field4779[var64];
                        var65.field4768 = Statics.field460[var64];
                        var65.field4770 = Statics.field4784[var64];
                        int var66 = var65.field4770 * var65.field4768;
                        byte[] var67 = Statics.field1570[var64];
                        var65.field4767 = new int[var66];
                        for (int var68 = 0; var68 < var66; var68++) {
                            var65.field4767[var68] = Statics.field405[var67[var68] & 0xFF];
                        }
                        var64++;
                    }
                } else {
                    var62 = null;
                }
                Statics.field979 = var62;
            } else {
                var49++;
            }
            if (Statics.field111 == null) {
                class314 var70 = Statics.field3638;
                int var71 = Statics.field165.field4378;
                class453[] var72;
                if (class454.method6002(var70, var71, 0)) {
                    class453[] var73 = new class453[Statics.field4783];
                    int var74 = 0;
                    while (true) {
                        if (var74 >= Statics.field4783) {
                            class454.method3036();
                            var72 = var73;
                            break;
                        }
                        class453 var75 = var73[var74] = new class453();
                        var75.field4772 = Statics.field4780;
                        var75.field4776 = Statics.field4782;
                        var75.field4773 = Statics.field4781[var74];
                        var75.field4771 = Statics.field4779[var74];
                        var75.field4768 = Statics.field460[var74];
                        var75.field4770 = Statics.field4784[var74];
                        int var76 = var75.field4770 * var75.field4768;
                        byte[] var77 = Statics.field1570[var74];
                        var75.field4767 = new int[var76];
                        for (int var78 = 0; var78 < var76; var78++) {
                            var75.field4767[var78] = Statics.field405[var77[var78] & 0xFF];
                        }
                        var74++;
                    }
                } else {
                    var72 = null;
                }
                Statics.field111 = var72;
            } else {
                var49++;
            }
            if (Statics.field1697 == null) {
                class314 var80 = Statics.field3638;
                int var81 = Statics.field165.field4379;
                class453[] var82;
                if (class454.method6002(var80, var81, 0)) {
                    class453[] var83 = new class453[Statics.field4783];
                    int var84 = 0;
                    while (true) {
                        if (var84 >= Statics.field4783) {
                            class454.method3036();
                            var82 = var83;
                            break;
                        }
                        class453 var85 = var83[var84] = new class453();
                        var85.field4772 = Statics.field4780;
                        var85.field4776 = Statics.field4782;
                        var85.field4773 = Statics.field4781[var84];
                        var85.field4771 = Statics.field4779[var84];
                        var85.field4768 = Statics.field460[var84];
                        var85.field4770 = Statics.field4784[var84];
                        int var86 = var85.field4770 * var85.field4768;
                        byte[] var87 = Statics.field1570[var84];
                        var85.field4767 = new int[var86];
                        for (int var88 = 0; var88 < var86; var88++) {
                            var85.field4767[var88] = Statics.field405[var87[var88] & 0xFF];
                        }
                        var84++;
                    }
                } else {
                    var82 = null;
                }
                Statics.field1697 = var82;
            } else {
                var49++;
            }
            if (Statics.field940 == null) {
                class314 var90 = Statics.field3638;
                int var91 = Statics.field165.field4375;
                class453[] var92;
                if (class454.method6002(var90, var91, 0)) {
                    class453[] var93 = new class453[Statics.field4783];
                    int var94 = 0;
                    while (true) {
                        if (var94 >= Statics.field4783) {
                            class454.method3036();
                            var92 = var93;
                            break;
                        }
                        class453 var95 = var93[var94] = new class453();
                        var95.field4772 = Statics.field4780;
                        var95.field4776 = Statics.field4782;
                        var95.field4773 = Statics.field4781[var94];
                        var95.field4771 = Statics.field4779[var94];
                        var95.field4768 = Statics.field460[var94];
                        var95.field4770 = Statics.field4784[var94];
                        int var96 = var95.field4770 * var95.field4768;
                        byte[] var97 = Statics.field1570[var94];
                        var95.field4767 = new int[var96];
                        for (int var98 = 0; var98 < var96; var98++) {
                            var95.field4767[var98] = Statics.field405[var97[var98] & 0xFF];
                        }
                        var94++;
                    }
                } else {
                    var92 = null;
                }
                Statics.field940 = var92;
            } else {
                var49++;
            }
            if (Statics.field2687 == null) {
                class314 var100 = Statics.field3638;
                int var101 = Statics.field165.field4376;
                class453[] var102;
                if (class454.method6002(var100, var101, 0)) {
                    class453[] var103 = new class453[Statics.field4783];
                    int var104 = 0;
                    while (true) {
                        if (var104 >= Statics.field4783) {
                            class454.method3036();
                            var102 = var103;
                            break;
                        }
                        class453 var105 = var103[var104] = new class453();
                        var105.field4772 = Statics.field4780;
                        var105.field4776 = Statics.field4782;
                        var105.field4773 = Statics.field4781[var104];
                        var105.field4771 = Statics.field4779[var104];
                        var105.field4768 = Statics.field460[var104];
                        var105.field4770 = Statics.field4784[var104];
                        int var106 = var105.field4770 * var105.field4768;
                        byte[] var107 = Statics.field1570[var104];
                        var105.field4767 = new int[var106];
                        for (int var108 = 0; var108 < var106; var108++) {
                            var105.field4767[var108] = Statics.field405[var107[var108] & 0xFF];
                        }
                        var104++;
                    }
                } else {
                    var102 = null;
                }
                Statics.field2687 = var102;
            } else {
                var49++;
            }
            if (Statics.field1575 == null) {
                Statics.field1575 = class454.method1957(Statics.field3638, Statics.field165.field4382, 0);
            } else {
                var49++;
            }
            if (Statics.field1061 == null) {
                Statics.field1061 = class454.method1957(Statics.field3638, Statics.field165.field4373, 0);
            } else {
                var49++;
            }
            if (var49 < 11) {
                class69.field887 = class309.field3735 + var49 * 100 / 12 + "%";
                class69.field886 = 70;
            } else {
                Statics.field4193 = Statics.field1061;
                Statics.field4168.method7400();
                int var110 = (int) (Math.random() * 21.0D) - 10;
                int var111 = (int) (Math.random() * 21.0D) - 10;
                int var112 = (int) (Math.random() * 21.0D) - 10;
                int var113 = (int) (Math.random() * 41.0D) - 20;
                Statics.field172[0].method7293(var110 + var113, var111 + var113, var112 + var113);
                class69.field887 = class309.field3835;
                class69.field886 = 70;
                field741 = 90;
            }
        } else if (field741 == 90) {
            if (Statics.field1298.method5188()) {
                Statics.field300 = new class210(Statics.field1298, Statics.field3638, 20, Statics.field65.method2106(), field514 ? 64 : 128);
                class202.method3607(Statics.field300);
                class202.method3608(Statics.field65.method2106());
                field741 = 100;
            } else {
                class69.field887 = class309.field3827 + "0%";
                class69.field886 = 90;
            }
        } else if (field741 == 100) {
            int var114 = Statics.field300.method3916();
            if (var114 < 100) {
                class69.field887 = class309.field3827 + var114 + "%";
                class69.field886 = 90;
            } else {
                class69.field887 = class309.field3800;
                class69.field886 = 90;
                field741 = 110;
            }
        } else if (field741 == 110) {
            Statics.field1329 = new class82();
            Statics.field198.method2882(Statics.field1329, 10);
            class69.field887 = class309.field3670;
            class69.field886 = 92;
            field741 = 120;
        } else if (field741 == 120) {
            if (Statics.field821.method5203("huffman", "")) {
                class282 var115 = new class282(Statics.field821.method5208("huffman", ""));
                class283.method1775(var115);
                class69.field887 = class309.field3682;
                class69.field886 = 94;
                field741 = 130;
            } else {
                class69.field887 = class309.field3762 + "%";
                class69.field886 = 94;
            }
        } else if (field741 == 130) {
            if (!Statics.field2260.method5188()) {
                class69.field887 = class309.field3683 + Statics.field2260.method5151() * 4 / 5 + "%";
                class69.field886 = 96;
            } else if (!Statics.field1464.method5188()) {
                class69.field887 = class309.field3683 + (80 + Statics.field1464.method5151() / 6) + "%";
                class69.field886 = 96;
            } else if (Statics.field83.method5188()) {
                class69.field887 = class309.field3743;
                class69.field886 = 98;
                field741 = 140;
            } else {
                class69.field887 = class309.field3683 + (96 + Statics.field83.method5151() / 50) + "%";
                class69.field886 = 96;
            }
        } else if (field741 == 140) {
            class69.field886 = 100;
            if (Statics.field1864.method5210(class245.field2911.field2916)) {
                if (Statics.field3129 == null) {
                    Statics.field3129 = new class416();
                    Statics.field3129.method6436(Statics.field1864, Statics.field1268, Statics.field1016, Statics.field980, field545, Statics.field172);
                }
                class69.field887 = class309.field3871;
                field741 = 150;
            } else {
                class69.field887 = class309.field3877 + Statics.field1864.method5223(class245.field2911.field2916) / 10 + "%";
            }
        } else if (field741 == 150) {
            method2046(10);
        }
    }

    @ObfuscatedName("hd.fn(IZZZI)Lle;")
    public static class314 method4231(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class382 var4 = null;
        if (class158.field1765 != null) {
            var4 = new class382(arg0, class158.field1765, Statics.field1774[arg0], 1000000);
        }
        return new class314(var4, Statics.field1622, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ft(B)V")
    public final void method1070() {
        class378 var1 = field734.method2366();
        class439 var2 = field734.field1345;
        try {
            if (field552 == 0) {
                if (Statics.field778 == null && (field567.method1837() || field627 > 250)) {
                    Statics.field778 = field567.method1838();
                    field567.method1836();
                    field567 = null;
                }
                if (Statics.field778 != null) {
                    if (var1 != null) {
                        var1.method2910();
                        var1 = null;
                    }
                    Statics.field2914 = null;
                    field541 = false;
                    field627 = 0;
                    if (field518.method7166()) {
                        try {
                            this.method1061(Statics.field2662);
                            method340(21);
                        } catch (Throwable var75) {
                            class464.method5148((String) null, var75);
                            method725(65);
                            return;
                        }
                    } else {
                        method340(1);
                    }
                }
            }
            if (field552 == 21) {
                if (this.field582 == null) {
                    if (this.field524 == null) {
                        method725(65);
                        return;
                    }
                    if (!this.field524.method246()) {
                        return;
                    }
                    if (this.field524.method243()) {
                        class464.method5148(this.field524.method244(), (Throwable) null);
                        method725(65);
                        this.field524 = null;
                        return;
                    }
                    class22 var6 = this.field524.method247();
                    if (var6.method264() != 200) {
                        method725(65);
                        this.field524 = null;
                        return;
                    }
                    field627 = 0;
                    class401 var7 = new class401(var6.method269());
                    try {
                        Statics.field407 = var7.method6367().getString("access_token");
                        Statics.field2662 = var7.method6367().getString("refresh_token");
                    } catch (Exception var73) {
                        class464.method5148("Error parsing tokens", var73);
                        method725(65);
                        this.field524 = null;
                        return;
                    }
                } else if (this.field582.isDone()) {
                    if (this.field582.isCancelled()) {
                        method725(65);
                        this.field582 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse) this.field582.get();
                        if (!var4.isSuccess()) {
                            method725(65);
                            this.field582 = null;
                            return;
                        }
                        Statics.field407 = var4.getAccessToken();
                        Statics.field2662 = var4.getRefreshToken();
                        this.field582 = null;
                    } catch (Exception var74) {
                        class464.method5148((String) null, var74);
                        method725(65);
                        this.field582 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1141(Statics.field407);
                method340(20);
            }
            if (field552 == 20) {
                if (this.field551 == null) {
                    if (this.field521 == null) {
                        method725(65);
                        return;
                    }
                    if (!this.field521.method246()) {
                        return;
                    }
                    if (this.field521.method243()) {
                        class464.method5148(this.field521.method244(), (Throwable) null);
                        method725(65);
                        this.field521 = null;
                        return;
                    }
                    class22 var11 = this.field521.method247();
                    if (var11.method264() != 200) {
                        class464.method5148("Response code: " + var11.method264() + "Response body: " + var11.method269(), (Throwable) null);
                        method725(65);
                        this.field521 = null;
                        return;
                    }
                    this.field519 = var11.method269();
                    this.field521 = null;
                } else if (this.field551.isDone()) {
                    if (this.field551.isCancelled()) {
                        method725(65);
                        this.field551 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var9 = (OtlTokenResponse) this.field551.get();
                        if (!var9.isSuccess()) {
                            method725(65);
                            this.field551 = null;
                            return;
                        }
                        this.field519 = var9.getToken();
                        this.field551 = null;
                    } catch (Exception var72) {
                        class464.method5148((String) null, var72);
                        method725(65);
                        this.field551 = null;
                        return;
                    }
                } else {
                    return;
                }
                field627 = 0;
                method340(1);
            }
            if (field552 == 1) {
                if (Statics.field2914 == null) {
                    Statics.field2914 = Statics.field198.method2869(Statics.field4246, Statics.field2763);
                }
                if (Statics.field2914.field1826 == 2) {
                    throw new IOException();
                }
                if (Statics.field2914.field1826 == 1) {
                    if (field542) {
                        Socket var12 = (Socket) Statics.field2914.field1830;
                        class379 var13 = new class379(var12, 40000, 5000);
                        var1 = var13;
                    } else {
                        var1 = new class162((Socket) Statics.field2914.field1830, Statics.field198, 5000);
                    }
                    field734.method2363(var1);
                    Statics.field2914 = null;
                    method340(2);
                }
            }
            if (field552 == 2) {
                field734.method2360();
                class265 var14 = class265.method2945();
                var14.field3075.method6876(class267.field3193.field3198);
                field734.method2362(var14);
                field734.method2378();
                var2.field4678 = 0;
                method340(3);
            }
            if (field552 == 3) {
                if (Statics.field1004 != null) {
                    Statics.field1004.method714();
                }
                if (Statics.field4582 != null) {
                    Statics.field4582.method714();
                }
                boolean var15 = true;
                if (field542 && !var1.method2928(1)) {
                    var15 = false;
                }
                if (var15) {
                    int var16 = var1.method2912();
                    if (Statics.field1004 != null) {
                        Statics.field1004.method714();
                    }
                    if (Statics.field4582 != null) {
                        Statics.field4582.method714();
                    }
                    if (var16 != 0) {
                        method725(var16);
                        return;
                    }
                    var2.field4678 = 0;
                    method340(4);
                }
            }
            if (field552 == 4) {
                if (var2.field4678 < 8) {
                    int var17 = var1.method2941();
                    if (var17 > 8 - var2.field4678) {
                        var17 = 8 - var2.field4678;
                    }
                    if (var17 > 0) {
                        var1.method2915(var2.field4679, var2.field4678, var17);
                        var2.field4678 += var17;
                    }
                }
                if (var2.field4678 == 8) {
                    var2.field4678 = 0;
                    Statics.field2659 = var2.method7014();
                    method340(5);
                }
            }
            if (field552 == 5) {
                field734.field1345.field4678 = 0;
                field734.method2360();
                class439 var18 = new class439(500);
                int[] var19 = new int[] { Statics.field778.nextInt(), Statics.field778.nextInt(), Statics.field778.nextInt(), Statics.field778.nextInt() };
                var18.field4678 = 0;
                var18.method6876(1);
                var18.method6879(var19[0]);
                var18.method6879(var19[1]);
                var18.method6879(var19[2]);
                var18.method6879(var19[3]);
                var18.method7015(Statics.field2659);
                if (field510 == 40) {
                    var18.method6879(Statics.field4620[0]);
                    var18.method6879(Statics.field4620[1]);
                    var18.method6879(Statics.field4620[2]);
                    var18.method6879(Statics.field4620[3]);
                } else {
                    if (field510 == 50) {
                        var18.method6876(class125.field1556.method40());
                        var18.method6879(Statics.field27);
                    } else {
                        var18.method6876(field616.method40());
                        switch(field616.field1553) {
                            case 0:
                            case 1:
                                var18.method6893(Statics.field2913);
                                var18.field4678++;
                                break;
                            case 2:
                                var18.field4678 += 4;
                                break;
                            case 3:
                                var18.method6879((Integer) Statics.field65.field1246.get(class344.method4441(class69.field900)));
                        }
                    }
                    if (field518.method7166()) {
                        var18.method6876(class444.field4731.method40());
                        var18.method6883(this.field519);
                    } else {
                        var18.method6876(class444.field4735.method40());
                        var18.method6883(class69.field899);
                    }
                }
                var18.method6916(class68.field876, class68.field872);
                Statics.field4620 = var19;
                class265 var20 = class265.method2945();
                var20.field3075.field4678 = 0;
                if (field510 == 40) {
                    var20.field3075.method6876(class267.field3195.field3198);
                } else {
                    var20.field3075.method6876(class267.field3194.field3198);
                }
                var20.field3075.method6877(0);
                int var21 = var20.field3075.field4678;
                var20.field3075.method6879(205);
                var20.field3075.method6879(1);
                var20.field3075.method6876(field486);
                var20.field3075.method6876(field487);
                var20.field3075.method6886(var18.field4679, 0, var18.field4678);
                int var22 = var20.field3075.field4678;
                var20.field3075.method6883(class69.field900);
                var20.field3075.method6876((field563 ? 1 : 0) << 1 | (field514 ? 1 : 0));
                var20.field3075.method6877(Statics.field841);
                var20.field3075.method6877(Statics.field4663);
                method7486(var20.field3075);
                if (!Statics.field663.endsWith(";A")) {
                    Statics.field663 = Statics.field663 + ";A";
                }
                var20.field3075.method6883(Statics.field663);
                var20.field3075.method6879(Statics.field2808);
                class440 var23 = new class440(Statics.field1613.method6415());
                Statics.field1613.method6417(var23);
                var20.field3075.method6886(var23.field4679, 0, var23.field4679.length);
                var20.field3075.method6876(field486);
                var20.field3075.method6879(0);
                var20.field3075.method6941(Statics.field4325.field4035);
                var20.field3075.method6879(Statics.field1016.field4035);
                var20.field3075.method6943(Statics.field3638.field4035);
                var20.field3075.method6943(0);
                var20.field3075.method6879(Statics.field4249.field4035);
                var20.field3075.method6941(Statics.field1864.field4035);
                var20.field3075.method6943(Statics.field1037.field4035);
                var20.field3075.method6943(Statics.field1359.field4035);
                var20.field3075.method6942(Statics.field1371.field4035);
                var20.field3075.method6879(Statics.field1836.field4035);
                var20.field3075.method6941(Statics.field464.field4035);
                var20.field3075.method6879(Statics.field83.field4035);
                var20.field3075.method6943(Statics.field1446.field4035);
                var20.field3075.method6943(Statics.field1268.field4035);
                var20.field3075.method6879(Statics.field821.field4035);
                var20.field3075.method6879(Statics.field2260.field4035);
                var20.field3075.method6942(Statics.field511.field4035);
                var20.field3075.method6879(Statics.field229.field4035);
                var20.field3075.method6943(Statics.field1464.field4035);
                var20.field3075.method6941(Statics.field1298.field4035);
                var20.field3075.method6941(Statics.field1798.field4035);
                var20.field3075.method6914(var19, var22, var20.field3075.field4678);
                var20.field3075.method7097(var20.field3075.field4678 - var21);
                field734.method2362(var20);
                field734.method2378();
                field734.field1344 = new class456(var19);
                int[] var24 = new int[4];
                for (int var25 = 0; var25 < 4; var25++) {
                    var24[var25] = var19[var25] + 50;
                }
                var2.method6832(var24);
                method340(6);
            }
            if (field552 == 6 && var1.method2941() > 0) {
                int var26 = var1.method2912();
                if (var26 == 61) {
                    int var27 = var1.method2941();
                    Statics.field1274 = var27 == 1 && var1.method2912() == 1;
                    method340(5);
                }
                if (var26 == 21 && field510 == 20) {
                    method340(12);
                } else if (var26 == 2) {
                    method340(14);
                } else if (var26 == 15 && field510 == 40) {
                    field734.field1348 = -1;
                    method340(19);
                } else if (var26 == 64) {
                    method340(10);
                } else if (var26 == 23 && field515 < 1) {
                    field515++;
                    method340(0);
                } else if (var26 == 29) {
                    method340(17);
                } else if (var26 == 69) {
                    method340(7);
                } else {
                    method725(var26);
                    return;
                }
            }
            if (field552 == 7 && var1.method2941() >= 2) {
                var1.method2915(var2.field4679, 0, 2);
                var2.field4678 = 0;
                Statics.field1291 = var2.method7082();
                method340(8);
            }
            if (field552 == 8 && var1.method2941() >= Statics.field1291) {
                var2.field4678 = 0;
                var1.method2915(var2.field4679, var2.field4678, Statics.field1291);
                class7[] var28 = new class7[] { class7.field17 };
                class7 var29 = var28[var2.method7071()];
                try {
                    switch(var29.field12) {
                        case 0:
                            class1 var30 = new class1();
                            this.field593 = new class8(var2, var30);
                            method340(9);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var71) {
                    method725(22);
                    return;
                }
            }
            if (field552 == 9 && this.field593.method45()) {
                this.field530 = this.field593.method47();
                this.field593.method46();
                this.field593 = null;
                if (this.field530 == null) {
                    method725(22);
                    return;
                }
                field734.method2360();
                class265 var33 = class265.method2945();
                var33.field3075.method6876(class267.field3196.field3198);
                var33.field3075.method6877(this.field530.field4678);
                var33.field3075.method6908(this.field530);
                field734.method2362(var33);
                field734.method2378();
                this.field530 = null;
                method340(6);
            }
            if (field552 == 10 && var1.method2941() > 0) {
                Statics.field3071 = var1.method2912();
                method340(11);
            }
            if (field552 == 11 && var1.method2941() >= Statics.field3071) {
                var1.method2915(var2.field4679, 0, Statics.field3071);
                var2.field4678 = 0;
                method340(6);
            }
            if (field552 == 12 && var1.method2941() > 0) {
                field655 = (var1.method2912() + 3) * 60;
                method340(13);
            }
            if (field552 == 13) {
                field627 = 0;
                class69.method5664(class309.field3746, class309.field3962, field655 / 60 + class309.field3694);
                if (--field655 <= 0) {
                    method340(0);
                }
            } else {
                if (field552 == 14 && var1.method2941() >= 1) {
                    Statics.field1330 = var1.method2912();
                    method340(15);
                }
                if (field552 == 15 && var1.method2941() >= Statics.field1330) {
                    boolean var34 = var1.method2912() == 1;
                    var1.method2915(var2.field4679, 0, 4);
                    var2.field4678 = 0;
                    boolean var35 = false;
                    if (var34) {
                        int var36 = var2.method6867() << 24;
                        int var37 = var36 | var2.method6867() << 16;
                        int var38 = var37 | var2.method6867() << 8;
                        int var39 = var38 | var2.method6867();
                        int var40 = class344.method4441(class69.field900);
                        if (Statics.field65.field1246.size() >= 10 && !Statics.field65.field1246.containsKey(var40)) {
                            Iterator var41 = Statics.field65.field1246.entrySet().iterator();
                            var41.next();
                            var41.remove();
                        }
                        Statics.field65.field1246.put(var40, var39);
                    }
                    if (field528) {
                        Statics.field65.method2178(class69.field900);
                    } else {
                        Statics.field65.method2178((String) null);
                    }
                    class90.method4613();
                    field664 = var1.method2912();
                    field666 = var1.method2912() == 1;
                    field610 = var1.method2912();
                    field610 <<= 0x8;
                    field610 += var1.method2912();
                    field611 = var1.method2912();
                    var1.method2915(var2.field4679, 0, 8);
                    var2.field4678 = 0;
                    this.field532 = var2.method7014();
                    if (Statics.field1330 >= 29) {
                        var1.method2915(var2.field4679, 0, 8);
                        var2.field4678 = 0;
                        field612 = var2.method7014();
                    }
                    var1.method2915(var2.field4679, 0, 1);
                    var2.field4678 = 0;
                    class266[] var42 = class266.method2474();
                    int var43 = var2.method6837();
                    if (var43 < 0 || var43 >= var42.length) {
                        throw new IOException(var43 + " " + var2.field4678);
                    }
                    field734.field1347 = var42[var43];
                    field734.field1348 = field734.field1347.field3190;
                    var1.method2915(var2.field4679, 0, 2);
                    var2.field4678 = 0;
                    field734.field1348 = var2.method7082();
                    try {
                        class28.method363(Statics.field1075, "zap");
                    } catch (Throwable var70) {
                    }
                    method340(16);
                }
                if (field552 != 16) {
                    if (field552 == 17 && var1.method2941() >= 2) {
                        var2.field4678 = 0;
                        var1.method2915(var2.field4679, 0, 2);
                        var2.field4678 = 0;
                        Statics.field4324 = var2.method7082();
                        method340(18);
                    }
                    if (field552 == 18 && var1.method2941() >= Statics.field4324) {
                        var2.field4678 = 0;
                        var1.method2915(var2.field4679, 0, Statics.field4324);
                        var2.field4678 = 0;
                        String var61 = var2.method7044();
                        String var62 = var2.method7044();
                        String var63 = var2.method7044();
                        class69.method5664(var61, var62, var63);
                        method2046(10);
                        if (field518.method7166()) {
                            class69.method2643(9);
                        }
                    }
                    if (field552 == 19) {
                        if (field734.field1348 == -1) {
                            if (var1.method2941() < 2) {
                                return;
                            }
                            var1.method2915(var2.field4679, 0, 2);
                            var2.field4678 = 0;
                            field734.field1348 = var2.method7082();
                        }
                        if (var1.method2941() >= field734.field1348) {
                            var1.method2915(var2.field4679, 0, field734.field1348);
                            var2.field4678 = 0;
                            int var64 = field734.field1348;
                            field544.method5876();
                            field734.method2360();
                            field734.field1345.field4678 = 0;
                            field734.field1347 = null;
                            field734.field1352 = null;
                            field734.field1341 = null;
                            field734.field1346 = null;
                            field734.field1348 = 0;
                            field734.field1350 = 0;
                            field497 = 0;
                            method2217();
                            field733 = 0;
                            field731 = 0;
                            for (int var65 = 0; var65 < 2048; var65++) {
                                field609[var65] = null;
                            }
                            Statics.field2657 = null;
                            for (int var66 = 0; var66 < field534.length; var66++) {
                                class92 var67 = field534[var66];
                                if (var67 != null) {
                                    var67.field1183 = -1;
                                    var67.field1172 = false;
                                }
                            }
                            class78.field1021 = new class421(32);
                            method2046(30);
                            for (int var68 = 0; var68 < 100; var68++) {
                                field653[var68] = true;
                            }
                            method2743();
                            class97.method2040(var2);
                            if (var2.field4678 != var64) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field627++;
                        if (field627 > 2000) {
                            if (field515 < 1) {
                                if (Statics.field997 == Statics.field2763) {
                                    Statics.field2763 = Statics.field4091;
                                } else {
                                    Statics.field2763 = Statics.field997;
                                }
                                field515++;
                                method340(0);
                            } else {
                                method725(-3);
                            }
                        }
                    }
                } else if (var1.method2941() >= field734.field1348) {
                    var2.field4678 = 0;
                    var1.method2915(var2.field4679, 0, field734.field1348);
                    field544.method5874();
                    field492 = 1L;
                    Statics.field1329.field1067 = 0;
                    Statics.field2753 = true;
                    field636 = true;
                    field723 = -1L;
                    class34.field243 = new class337();
                    field734.method2360();
                    field734.field1345.field4678 = 0;
                    field734.field1347 = null;
                    field734.field1352 = null;
                    field734.field1341 = null;
                    field734.field1346 = null;
                    field734.field1348 = 0;
                    field734.field1350 = 0;
                    field497 = 0;
                    field540 = 0;
                    field496 = 0;
                    field632 = 0;
                    field498 = false;
                    class33.field236 = 0;
                    class99.method2785();
                    field726 = 0;
                    field500 = false;
                    field736 = 0;
                    field523 = 0;
                    field698 = 0;
                    Statics.field1571 = null;
                    field733 = 0;
                    field516 = -1;
                    field731 = 0;
                    field732 = 0;
                    field506 = class95.field1287;
                    field507 = class95.field1287;
                    field535 = 0;
                    class97.field1305 = 0;
                    for (int var45 = 0; var45 < 2048; var45++) {
                        class97.field1308[var45] = null;
                        class97.field1303[var45] = class194.field2252;
                    }
                    for (int var46 = 0; var46 < 2048; var46++) {
                        field609[var46] = null;
                    }
                    for (int var47 = 0; var47 < 32768; var47++) {
                        field534[var47] = null;
                    }
                    field625 = -1;
                    field713.method5412();
                    field529.method5412();
                    for (int var48 = 0; var48 < 4; var48++) {
                        for (int var49 = 0; var49 < 104; var49++) {
                            for (int var50 = 0; var50 < 104; var50++) {
                                field725[var48][var49][var50] = null;
                            }
                        }
                    }
                    field624 = new class335();
                    Statics.field4350.method1613();
                    for (int var51 = 0; var51 < Statics.field1858; var51++) {
                        class171 var52 = class171.method274(var51);
                        if (var52 != null) {
                            class289.field3346[var51] = 0;
                            class289.field3348[var51] = 0;
                        }
                    }
                    Statics.field1564.method2304();
                    field665 = -1;
                    if (field543 != -1) {
                        int var53 = field543;
                        if (var53 != -1 && Statics.field1526[var53]) {
                            Statics.field1611.method5213(var53);
                            if (Statics.field1799[var53] != null) {
                                boolean var54 = true;
                                for (int var55 = 0; var55 < Statics.field1799[var53].length; var55++) {
                                    if (Statics.field1799[var53][var55] != null) {
                                        if (Statics.field1799[var53][var55].field3397 == 2) {
                                            var54 = false;
                                        } else {
                                            Statics.field1799[var53][var55] = null;
                                        }
                                    }
                                }
                                if (var54) {
                                    Statics.field1799[var53] = null;
                                }
                                Statics.field1526[var53] = false;
                            }
                        }
                    }
                    for (class80 var56 = (class80) field656.method6698(); var56 != null; var56 = (class80) field656.method6690()) {
                        method2943(var56, true);
                    }
                    field543 = -1;
                    field656 = new class421(8);
                    field661 = null;
                    field632 = 0;
                    field498 = false;
                    field762.method4957((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var57 = 0; var57 < 8; var57++) {
                        field619[var57] = null;
                        field620[var57] = false;
                    }
                    class78.field1021 = new class421(32);
                    field490 = true;
                    for (int var58 = 0; var58 < 100; var58++) {
                        field653[var58] = true;
                    }
                    class265 var59 = class265.method4070(class263.field3055, field734.field1344);
                    var59.field3075.method6876(method2650());
                    var59.field3075.method6877(Statics.field841);
                    var59.field3075.method6877(Statics.field4663);
                    field734.method2362(var59);
                    Statics.field303 = null;
                    Statics.field4259 = null;
                    Arrays.fill(field724, (Object) null);
                    Statics.field1403 = null;
                    Arrays.fill(field765, (Object) null);
                    for (int var60 = 0; var60 < 8; var60++) {
                        field766[var60] = new class325();
                    }
                    Statics.field1525 = null;
                    class97.method2040(var2);
                    Statics.field2829 = -1;
                    method2750(false, var2);
                    field734.field1347 = null;
                }
            }
        } catch (IOException var76) {
            if (field515 < 1) {
                if (Statics.field997 == Statics.field2763) {
                    Statics.field2763 = Statics.field4091;
                } else {
                    Statics.field2763 = Statics.field997;
                }
                field515++;
                method340(0);
            } else {
                method725(-2);
            }
        }
    }

    @ObfuscatedName("al.fi(IB)V")
    public static void method725(int arg0) {
        int var1 = class69.field890;
        if (arg0 == -3) {
            class69.method5664(class309.field3954, class309.field3696, class309.field3799);
        } else if (arg0 == -2) {
            class69.method5664(class309.field3965, class309.field3699, class309.field3700);
        } else if (arg0 == -1) {
            class69.method5664(class309.field3701, class309.field3677, class309.field3703);
        } else if (arg0 == 3) {
            class69.method2643(3);
            class69.field908 = 1;
        } else if (arg0 == 4) {
            class69.method6375(0);
        } else if (arg0 == 5) {
            class69.field908 = 2;
            class69.method5664(class309.field3679, class309.field3895, class309.field3709);
        } else if (arg0 == 68 || !(field491 || arg0 != 6)) {
            class69.method5664(class309.field3705, class309.field3711, class309.field3727);
        } else if (arg0 == 7) {
            class69.method5664(class309.field3945, class309.field3714, class309.field3836);
        } else if (arg0 == 8) {
            class69.method5664(class309.field3863, class309.field3717, class309.field3718);
        } else if (arg0 == 9) {
            class69.method5664(class309.field3662, class309.field3720, class309.field3721);
        } else if (arg0 == 10) {
            class69.method5664(class309.field3676, class309.field3948, class309.field3724);
        } else if (arg0 == 11) {
            class69.method5664(class309.field3725, class309.field3719, class309.field3680);
        } else if (arg0 == 12) {
            class69.method5664(class309.field3728, class309.field3729, class309.field3730);
        } else if (arg0 == 13) {
            class69.method5664(class309.field3731, class309.field3786, class309.field3733);
        } else if (arg0 == 14) {
            class69.method5664(class309.field3734, class309.field3906, class309.field3736);
        } else if (arg0 == 16) {
            class69.method5664(class309.field3737, class309.field3738, class309.field3739);
        } else if (arg0 == 17) {
            class69.method5664(class309.field3740, class309.field3668, class309.field3742);
        } else if (arg0 == 18) {
            class69.method6375(1);
        } else if (arg0 == 19) {
            class69.method5664(class309.field3658, class309.field3747, class309.field3931);
        } else if (arg0 == 20) {
            class69.method5664(class309.field3749, class309.field3671, class309.field3751);
        } else if (arg0 == 22) {
            class69.method5664(class309.field3752, class309.field3826, class309.field3754);
        } else if (arg0 == 23) {
            class69.method5664(class309.field3755, class309.field3756, class309.field3757);
        } else if (arg0 == 24) {
            class69.method5664(class309.field3758, class309.field3759, class309.field3811);
        } else if (arg0 == 25) {
            class69.method5664(class309.field3761, class309.field3966, class309.field3763);
        } else if (arg0 == 26) {
            class69.method5664(class309.field3764, class309.field3765, class309.field3766);
        } else if (arg0 == 27) {
            class69.method5664(class309.field3767, class309.field3698, class309.field3769);
        } else if (arg0 == 31) {
            class69.method5664(class309.field3886, class309.field3777, class309.field3778);
        } else if (arg0 == 32) {
            class69.method5664(class309.field3857, class309.field3780, class309.field3781);
        } else if (arg0 == 37) {
            class69.method5664(class309.field3693, class309.field3783, class309.field3784);
        } else if (arg0 == 38) {
            class69.method5664(class309.field3785, class309.field3833, class309.field3787);
        } else if (arg0 == 55) {
            class69.method2643(8);
        } else if (arg0 == 56) {
            class69.method5664(class309.field3792, class309.field3793, class309.field3794);
            method2046(11);
            return;
        } else if (arg0 == 57) {
            class69.method5664(class309.field3795, class309.field3776, class309.field3797);
            method2046(11);
            return;
        } else if (arg0 == 61) {
            class69.method5664("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class69.method2643(7);
        } else if (arg0 == 62) {
            method2046(10);
            class69.method2643(9);
            class69.method5664(class309.field3798, class309.field3902, class309.field3892);
            return;
        } else if (arg0 == 63) {
            method2046(10);
            class69.method2643(9);
            class69.method5664(class309.field3801, class309.field3959, class309.field3803);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method2046(10);
            class69.method2643(9);
            class69.method5664(class309.field3804, class309.field3805, class309.field3650);
            return;
        } else if (arg0 == 71) {
            method2046(10);
            class69.method2643(7);
            class69.method5664("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method2046(10);
            class69.method2643(6);
            class69.method5664(class309.field3971, class309.field3952, class309.field3953);
        } else if (arg0 == 72) {
            method2046(10);
            class69.method2643(26);
        } else {
            class69.method5664(class309.field3807, class309.field3808, class309.field3809);
        }
        method2046(10);
        int var4 = class69.field890;
        boolean var5 = var1 != var4;
        if (!var5 && field518.method7166()) {
            class69.method2643(9);
        }
    }

    @ObfuscatedName("bg.fx(I)V")
    public static final void method1932() {
        field734.method2364();
        class190.method3111();
        Statics.method3032();
        class174.method729();
        class188.field2116.method4569();
        class188.field2127.method4569();
        class188.field2084.method4569();
        class188.field2121.method4569();
        class179.field1963.method4569();
        class179.field1946.method4569();
        class189.method2243();
        class191.field2206.method4569();
        class191.field2223.method4569();
        class191.field2212.method4569();
        class181.field2008.method4569();
        class181.field2004.method4569();
        class184.field2038.method4569();
        class171.field1859.method4569();
        Statics.field913.method6787();
        Statics.field2704.method6787();
        class187.method752();
        class175.method3090();
        class186.method4525();
        class185.field2044.method4569();
        class172.field1867.method4569();
        class293.field3364.method4569();
        class295.field3387.method4569();
        class295.field3460.method4569();
        class295.field3389.method4569();
        class295.field3390.method4569();
        ((class210) Statics.field2382).method3922();
        class72.field952.method4569();
        Statics.field1798.method5204();
        Statics.field1836.method5204();
        Statics.field2260.method5204();
        Statics.field229.method5204();
        Statics.field464.method5204();
        Statics.field4325.method5204();
        Statics.field1037.method5204();
        Statics.field3638.method5204();
        Statics.field1298.method5204();
        Statics.field821.method5204();
        Statics.field1371.method5204();
        Statics.field1464.method5204();
        Statics.field1926.method3854();
        for (int var0 = 0; var0 < 4; var0++) {
            field531[var0].method3455();
        }
        System.gc();
        class274.method2403(2);
        field700 = -1;
        field735 = false;
        class63.method2331();
        method2046(10);
    }

    @ObfuscatedName("cu.fe(IB)V")
    public static final void method2332(int arg0) {
        method1932();
        switch(arg0) {
            case 1:
                class69.method2643(24);
                class69.method5664(class309.field3898, class309.field3899, class309.field3900);
                break;
            case 2:
                class69.method2643(24);
                class69.method5664(class309.field3855, class309.field3896, class309.field3897);
        }
    }

    @ObfuscatedName("cw.fb(I)J")
    public static long method2247() {
        return field612;
    }

    @ObfuscatedName("du.fr(B)V")
    public static final void method2646() {
        if (field540 > 0) {
            method1932();
        } else {
            field544.method5879();
            method2046(40);
            Statics.field3338 = field734.method2366();
            field734.method2365();
        }
    }

    @ObfuscatedName("bj.fu(ZI)V")
    public static final void method1635(boolean arg0) {
        if (arg0) {
            field616 = class69.field901 ? class125.field1558 : class125.field1552;
        } else {
            field616 = Statics.field65.field1246.containsKey(class344.method4441(class69.field900)) ? class125.field1557 : class125.field1554;
        }
    }

    @ObfuscatedName("client.fc(B)V")
    public final void method1069() {
        if (field497 > 1) {
            field497--;
        }
        if (field540 > 0) {
            field540--;
        }
        if (field541) {
            field541 = false;
            method2646();
            return;
        }
        if (!field498) {
            method260();
        }
        for (int var1 = 0; var1 < 100 && this.method1165(field734); var1++) {
        }
        if (field510 != 30) {
            return;
        }
        while (true) {
            class35 var2 = (class35) class34.field243.method5479();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field544.field4236) {
                    class265 var6 = class265.method4070(class263.field3010, field734.field1344);
                    var6.field3075.method6876(0);
                    int var7 = var6.field3075.field4678;
                    field544.method5887(var6.field3075);
                    var6.field3075.method7118(var6.field3075.field4678 - var7);
                    field734.method2362(var6);
                    field544.method5875();
                }
                Object var8 = Statics.field1329.field1069;
                synchronized (Statics.field1329.field1069) {
                    if (!field660) {
                        Statics.field1329.field1067 = 0;
                    } else if (class33.field238 != 0 || Statics.field1329.field1067 >= 40) {
                        class265 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field1329.field1067 && (var9 == null || var9.field3075.field4678 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field1329.field1070[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field1329.field1068[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field493 != var16 || field682 != var15) {
                                if (var9 == null) {
                                    var9 = class265.method4070(class263.field2953, field734.field1344);
                                    var9.field3075.method6876(0);
                                    var10 = var9.field3075.field4678;
                                    var9.field3075.field4678 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field495 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field493;
                                    var18 = var15 - field682;
                                    var19 = (int) ((Statics.field1329.field1065[var14] - field495) / 20L);
                                    var12 = (int) ((Statics.field1329.field1065[var14] - field495) % 20L + (long) var12);
                                }
                                field493 = var16;
                                field682 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3075.method6877((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3075.method6876(var19 + 128);
                                    var9.field3075.method6877((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3075.method6876(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3075.method6879(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3075.method6879(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3075.method6877((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3075.method6879(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3075.method6879(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field495 = Statics.field1329.field1065[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3075.method7118(var9.field3075.field4678 - var10);
                            int var20 = var9.field3075.field4678;
                            var9.field3075.field4678 = var10;
                            var9.field3075.method6876(var12 / var13);
                            var9.field3075.method6876(var12 % var13);
                            var9.field3075.field4678 = var20;
                            field734.method2362(var9);
                        }
                        if (var11 >= Statics.field1329.field1067) {
                            Statics.field1329.field1067 = 0;
                        } else {
                            Statics.field1329.field1067 -= var11;
                            System.arraycopy(Statics.field1329.field1068, var11, Statics.field1329.field1068, 0, Statics.field1329.field1067);
                            System.arraycopy(Statics.field1329.field1070, var11, Statics.field1329.field1070, 0, Statics.field1329.field1067);
                            System.arraycopy(Statics.field1329.field1065, var11, Statics.field1329.field1065, 0, Statics.field1329.field1067);
                        }
                    }
                }
                if (class33.field238 == 1 || !Statics.field914 && class33.field238 == 4 || class33.field238 == 2) {
                    long var22 = class33.field237 - field492 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field492 = class33.field237 * -1L;
                    int var24 = class33.field240;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field4663) {
                        var24 = Statics.field4663;
                    }
                    int var25 = class33.field235;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field841) {
                        var25 = Statics.field841;
                    }
                    int var26 = (int) var22;
                    class265 var27 = class265.method4070(class263.field3052, field734.field1344);
                    var27.field3075.method6877((class33.field238 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field3075.method6877(var25);
                    var27.field3075.method6877(var24);
                    field734.method2362(var27);
                }
                if (class24.field140 > 0) {
                    class265 var28 = class265.method4070(class263.field2950, field734.field1344);
                    var28.field3075.method6877(0);
                    int var29 = var28.field3075.field4678;
                    long var30 = class270.method2485();
                    for (int var32 = 0; var32 < class24.field140; var32++) {
                        long var33 = var30 - field723;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field723 = var30;
                        var28.field3075.method6937((int) var33);
                        var28.field3075.method6876(class24.field139[var32]);
                    }
                    var28.field3075.method7097(var28.field3075.field4678 - var29);
                    field734.method2362(var28);
                }
                if (field577 > 0) {
                    field577--;
                }
                if (class24.field131[96] || class24.field131[97] || class24.field131[98] || class24.field131[99]) {
                    field558 = true;
                }
                if (field558 && field577 <= 0) {
                    field577 = 20;
                    field558 = false;
                    class265 var35 = class265.method4070(class263.field3036, field734.field1344);
                    var35.field3075.method6877(field523);
                    var35.field3075.method6877(field562);
                    field734.method2362(var35);
                }
                if (Statics.field2753 && !field636) {
                    field636 = true;
                    class265 var36 = class265.method4070(class263.field3039, field734.field1344);
                    var36.field3075.method6876(1);
                    field734.method2362(var36);
                }
                if (!Statics.field2753 && field636) {
                    field636 = false;
                    class265 var37 = class265.method4070(class263.field3039, field734.field1344);
                    var37.field3075.method6876(0);
                    field734.method2362(var37);
                }
                if (Statics.field3129 != null) {
                    Statics.field3129.method6437();
                }
                Statics.method4456();
                method2215();
                if (Statics.field1577 != field516) {
                    field516 = Statics.field1577;
                    method6159(Statics.field1577);
                }
                if (field510 != 30) {
                    return;
                }
                method1926();
                int var10002;
                for (int var38 = 0; var38 < field736; var38++) {
                    var10002 = field739[var38]--;
                    if (field739[var38] >= -10) {
                        class37 var40 = field645[var38];
                        if (var40 == null) {
                            class37 var10000 = (class37) null;
                            var40 = class37.method643(Statics.field229, field499[var38], 0);
                            if (var40 == null) {
                                continue;
                            }
                            field739[var38] += var40.method636();
                            field645[var38] = var40;
                        }
                        if (field739[var38] < 0) {
                            int var47;
                            if (field740[var38] == 0) {
                                var47 = Statics.field65.method2125();
                            } else {
                                int var41 = (field740[var38] & 0xFF) * 128;
                                int var42 = field740[var38] >> 16 & 0xFF;
                                int var43 = var42 * 128 + 64 - Statics.field2657.field1182;
                                if (var43 < 0) {
                                    var43 = -var43;
                                }
                                int var44 = field740[var38] >> 8 & 0xFF;
                                int var45 = var44 * 128 + 64 - Statics.field2657.field1138;
                                if (var45 < 0) {
                                    var45 = -var45;
                                }
                                int var46 = var43 + var45 - 128;
                                if (var46 > var41) {
                                    field739[var38] = -100;
                                    continue;
                                }
                                if (var46 < 0) {
                                    var46 = 0;
                                }
                                var47 = (var41 - var46) * Statics.field65.method2120() / var41;
                            }
                            if (var47 > 0) {
                                class38 var48 = var40.method635().method650(Statics.field4456);
                                class45 var49 = class45.method770(var48, 100, var47);
                                var49.method773(field738[var38] - 1);
                                Statics.field1539.method628(var49);
                            }
                            field739[var38] = -100;
                        }
                    } else {
                        field736--;
                        for (int var39 = var38; var39 < field736; var39++) {
                            field499[var39] = field499[var39 + 1];
                            field645[var39] = field645[var39 + 1];
                            field738[var39] = field738[var39 + 1];
                            field739[var39] = field739[var39 + 1];
                            field740[var39] = field740[var39 + 1];
                        }
                        var38--;
                    }
                }
                if (field735 && !class274.method4911()) {
                    if (Statics.field65.method2129() != 0 && field700 != -1) {
                        class274.method2435(Statics.field4325, field700, 0, Statics.field65.method2129(), false);
                    }
                    field735 = false;
                }
                field734.field1350++;
                if (field734.field1350 > 750) {
                    method2646();
                    return;
                }
                int var50 = class97.field1305;
                int[] var51 = class97.field1306;
                for (int var52 = 0; var52 < var50; var52++) {
                    class85 var53 = field609[var51[var52]];
                    if (var53 != null) {
                        method5116(var53, 1);
                    }
                }
                for (int var54 = 0; var54 < field535; var54++) {
                    int var55 = field536[var54];
                    class92 var56 = field534[var55];
                    if (var56 != null) {
                        method5116(var56, var56.field1261.field1950);
                    }
                }
                int[] var57 = class97.field1306;
                for (int var58 = 0; var58 < class97.field1305; var58++) {
                    class85 var59 = field609[var57[var58]];
                    if (var59 != null && var59.field1209 > 0) {
                        var59.field1209--;
                        if (var59.field1209 == 0) {
                            var59.field1158 = null;
                        }
                    }
                }
                for (int var60 = 0; var60 < field535; var60++) {
                    int var61 = field536[var60];
                    class92 var62 = field534[var61];
                    if (var62 != null && var62.field1209 > 0) {
                        var62.field1209--;
                        if (var62.field1209 == 0) {
                            var62.field1158 = null;
                        }
                    }
                }
                field728++;
                if (field537 != 0) {
                    field596 += 20;
                    if (field596 >= 400) {
                        field537 = 0;
                    }
                }
                if (Statics.field1992 != null) {
                    field599++;
                    if (field599 >= 15) {
                        method5299(Statics.field1992);
                        Statics.field1992 = null;
                    }
                }
                class295 var63 = Statics.field1682;
                class295 var64 = Statics.field1423;
                Statics.field1682 = null;
                Statics.field1423 = null;
                field672 = null;
                field676 = false;
                field575 = false;
                field720 = 0;
                while (class24.method2886() && field720 < 128) {
                    if (field664 >= 2 && class24.field131[82] && Statics.field62 == 66) {
                        StringBuilder var65 = new StringBuilder();
                        Iterator var66 = class99.field1338.iterator();
                        while (var66.hasNext()) {
                            class58 var67 = (class58) var66.next();
                            if (var67.field468 != null && !var67.field468.isEmpty()) {
                                var65.append(var67.field468).append(':');
                            }
                            var65.append(var67.field469).append('\n');
                        }
                        String var68 = var65.toString();
                        Statics.field1075.method422(var68);
                    } else if (field698 != 1 || Statics.field1851 <= 0) {
                        field722[field720] = Statics.field62;
                        field721[field720] = Statics.field1851;
                        field720++;
                    }
                }
                boolean var70 = field664 >= 2;
                if (var70 && class24.field131[82] && class24.field131[81] && field697 != 0) {
                    int var71 = Statics.field2657.field1116 - field697;
                    if (var71 < 0) {
                        var71 = 0;
                    } else if (var71 > 3) {
                        var71 = 3;
                    }
                    if (Statics.field2657.field1116 != var71) {
                        method2633(Statics.field1001 + Statics.field2657.field1194[0], Statics.field477 + Statics.field2657.field1208[0], var71, false);
                    }
                    field697 = 0;
                }
                if (field543 != -1) {
                    method16(field543, 0, 0, Statics.field841, Statics.field4663, 0, 0);
                }
                field680++;
                while (true) {
                    class81 var72;
                    class295 var73;
                    class295 var74;
                    do {
                        var72 = (class81) field699.method5416();
                        if (var72 == null) {
                            while (true) {
                                class81 var75;
                                class295 var76;
                                class295 var77;
                                do {
                                    var75 = (class81) field702.method5416();
                                    if (var75 == null) {
                                        while (true) {
                                            class81 var78;
                                            class295 var79;
                                            class295 var80;
                                            do {
                                                var78 = (class81) field569.method5416();
                                                if (var78 == null) {
                                                    this.method1073();
                                                    if (Statics.field3129 != null) {
                                                        Statics.field3129.method6447(Statics.field1577, (Statics.field2657.field1182 >> 7) + Statics.field1001, (Statics.field2657.field1138 >> 7) + Statics.field477, false);
                                                        Statics.field3129.method6456();
                                                    }
                                                    if (field668 != null) {
                                                        this.method1078();
                                                    }
                                                    if (Statics.field154 != null) {
                                                        method5299(Statics.field154);
                                                        field606++;
                                                        if (class33.field226 == 0) {
                                                            if (field605) {
                                                                if (Statics.field1755 == Statics.field154 && field604 != field601) {
                                                                    class295 var81 = Statics.field154;
                                                                    byte var82 = 0;
                                                                    if (field481 == 1 && var81.field3399 == 206) {
                                                                        var82 = 1;
                                                                    }
                                                                    if (var81.field3470[field604] <= 0) {
                                                                        var82 = 0;
                                                                    }
                                                                    int var83 = method2406(var81);
                                                                    boolean var84 = (var83 >> 29 & 0x1) != 0;
                                                                    if (var84) {
                                                                        int var85 = field601;
                                                                        int var86 = field604;
                                                                        var81.field3470[var86] = var81.field3470[var85];
                                                                        var81.field3530[var86] = var81.field3530[var85];
                                                                        var81.field3470[var85] = -1;
                                                                        var81.field3530[var85] = 0;
                                                                    } else if (var82 == 1) {
                                                                        int var87 = field601;
                                                                        int var88 = field604;
                                                                        while (var87 != var88) {
                                                                            if (var87 > var88) {
                                                                                var81.method4979(var87 - 1, var87);
                                                                                var87--;
                                                                            } else if (var87 < var88) {
                                                                                var81.method4979(var87 + 1, var87);
                                                                                var87++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var81.method4979(field604, field601);
                                                                    }
                                                                    class265 var89 = class265.method4070(class263.field3043, field734.field1344);
                                                                    var89.field3075.method6877(field601);
                                                                    var89.field3075.method6877(field604);
                                                                    var89.field3075.method6876(var82);
                                                                    var89.field3075.method6879(Statics.field154.field3395);
                                                                    field734.method2362(var89);
                                                                }
                                                            } else if (this.method1156()) {
                                                                this.method1496(field478, field517);
                                                            } else if (field632 > 0) {
                                                                int var90 = field478;
                                                                int var91 = field517;
                                                                class67 var92 = Statics.field1472;
                                                                if (var92 != null) {
                                                                    method5399(var92.field870, var92.field865, var92.field866, var92.field864, var92.field868, var92.field868, var90, var91);
                                                                }
                                                                Statics.field1472 = null;
                                                            }
                                                            field599 = 10;
                                                            class33.field238 = 0;
                                                            Statics.field154 = null;
                                                        } else if (field606 >= 5 && (class33.field227 > field478 + 5 || class33.field227 < field478 - 5 || class33.field228 > field517 + 5 || class33.field228 < field517 - 5)) {
                                                            field605 = true;
                                                        }
                                                    }
                                                    if (class205.method3762()) {
                                                        int var93 = class205.field2454;
                                                        int var94 = class205.field2475;
                                                        class265 var95 = class265.method4070(class263.field2958, field734.field1344);
                                                        var95.field3075.method6876(5);
                                                        var95.field3075.method6974(class24.field131[82] ? (class24.field131[81] ? 2 : 1) : 0);
                                                        var95.field3075.method7019(Statics.field477 + var94);
                                                        var95.field3075.method6877(Statics.field1001 + var93);
                                                        field734.method2362(var95);
                                                        class205.method3763();
                                                        field594 = class33.field235;
                                                        field595 = class33.field240;
                                                        field537 = 1;
                                                        field596 = 0;
                                                        field731 = var93;
                                                        field732 = var94;
                                                    }
                                                    if (Statics.field1682 != var63) {
                                                        if (var63 != null) {
                                                            method5299(var63);
                                                        }
                                                        if (Statics.field1682 != null) {
                                                            method5299(Statics.field1682);
                                                        }
                                                    }
                                                    if (Statics.field1423 != var64 && field703 == field646) {
                                                        if (var64 != null) {
                                                            method5299(var64);
                                                        }
                                                        if (Statics.field1423 != null) {
                                                            method5299(Statics.field1423);
                                                        }
                                                    }
                                                    if (Statics.field1423 == null) {
                                                        if (field646 > 0) {
                                                            field646--;
                                                        }
                                                    } else if (field646 < field703) {
                                                        field646++;
                                                        if (field703 == field646) {
                                                            method5299(Statics.field1423);
                                                        }
                                                    }
                                                    if (field698 == 0) {
                                                        int var96 = Statics.field2657.field1182;
                                                        int var97 = Statics.field2657.field1138;
                                                        if (Statics.field1937 - var96 < -500 || Statics.field1937 - var96 > 500 || Statics.field167 - var97 < -500 || Statics.field167 - var97 > 500) {
                                                            Statics.field1937 = var96;
                                                            Statics.field167 = var97;
                                                        }
                                                        if (Statics.field1937 != var96) {
                                                            Statics.field1937 += (var96 - Statics.field1937) / 16;
                                                        }
                                                        if (Statics.field167 != var97) {
                                                            Statics.field167 += (var97 - Statics.field167) / 16;
                                                        }
                                                        int var98 = Statics.field1937 >> 7;
                                                        int var99 = Statics.field167 >> 7;
                                                        int var100 = method3712(Statics.field1937, Statics.field167, Statics.field1577);
                                                        int var101 = 0;
                                                        if (var98 > 3 && var99 > 3 && var98 < 100 && var99 < 100) {
                                                            for (int var102 = var98 - 4; var102 <= var98 + 4; var102++) {
                                                                for (int var103 = var99 - 4; var103 <= var99 + 4; var103++) {
                                                                    int var104 = Statics.field1577;
                                                                    if (var104 < 3 && (class75.field993[1][var102][var103] & 0x2) == 2) {
                                                                        var104++;
                                                                    }
                                                                    int var105 = var100 - class75.field985[var104][var102][var103];
                                                                    if (var105 > var101) {
                                                                        var101 = var105;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var106 = var101 * 192;
                                                        if (var106 > 98048) {
                                                            var106 = 98048;
                                                        }
                                                        if (var106 < 32768) {
                                                            var106 = 32768;
                                                        }
                                                        if (var106 > field579) {
                                                            field579 += (var106 - field579) / 24;
                                                        } else if (var106 < field579) {
                                                            field579 += (var106 - field579) / 80;
                                                        }
                                                        Statics.field1667 = method3712(Statics.field2657.field1182, Statics.field2657.field1138, Statics.field1577) - field761;
                                                    } else if (field698 == 1) {
                                                        if (field576 && Statics.field2657 != null) {
                                                            int var107 = Statics.field2657.field1194[0];
                                                            int var108 = Statics.field2657.field1208[0];
                                                            if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                                                                Statics.field1937 = Statics.field2657.field1182;
                                                                int var109 = method3712(Statics.field2657.field1182, Statics.field2657.field1138, Statics.field1577) - field761;
                                                                if (var109 < Statics.field1667) {
                                                                    Statics.field1667 = var109;
                                                                }
                                                                Statics.field167 = Statics.field2657.field1138;
                                                                field576 = false;
                                                            }
                                                        }
                                                        short var110 = -1;
                                                        if (class24.field131[33]) {
                                                            var110 = 0;
                                                        } else if (class24.field131[49]) {
                                                            var110 = 1024;
                                                        }
                                                        if (class24.field131[48]) {
                                                            if (var110 == 0) {
                                                                var110 = 1792;
                                                            } else if (var110 == 1024) {
                                                                var110 = 1280;
                                                            } else {
                                                                var110 = 1536;
                                                            }
                                                        } else if (class24.field131[50]) {
                                                            if (var110 == 0) {
                                                                var110 = 256;
                                                            } else if (var110 == 1024) {
                                                                var110 = 768;
                                                            } else {
                                                                var110 = 512;
                                                            }
                                                        }
                                                        byte var111 = 0;
                                                        if (class24.field131[35]) {
                                                            var111 = -1;
                                                        } else if (class24.field131[51]) {
                                                            var111 = 1;
                                                        }
                                                        int var112 = 0;
                                                        if (var110 >= 0 || var111 != 0) {
                                                            int var113 = class24.field131[81] ? field574 : field573;
                                                            var112 = var113 * 16;
                                                            field568 = var110;
                                                            field572 = var111;
                                                        }
                                                        if (field570 < var112) {
                                                            field570 += var112 / 8;
                                                            if (field570 > var112) {
                                                                field570 = var112;
                                                            }
                                                        } else if (field570 > var112) {
                                                            field570 = field570 * 9 / 10;
                                                        }
                                                        if (field570 > 0) {
                                                            int var114 = field570 / 16;
                                                            if (field568 >= 0) {
                                                                int var115 = field568 - Statics.field3630 & 0x7FF;
                                                                int var116 = class202.field2402[var115];
                                                                int var117 = class202.field2377[var115];
                                                                Statics.field1937 += var114 * var116 / 65536;
                                                                Statics.field167 += var114 * var117 / 65536;
                                                            }
                                                            if (field572 != 0) {
                                                                Statics.field1667 += field572 * var114;
                                                                if (Statics.field1667 > 0) {
                                                                    Statics.field1667 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field568 = -1;
                                                            field572 = -1;
                                                        }
                                                        if (class24.field131[13]) {
                                                            method18();
                                                        }
                                                    }
                                                    if (class33.field226 == 4 && Statics.field914) {
                                                        int var118 = class33.field228 - field714;
                                                        field565 = var118 * 2;
                                                        field714 = var118 == -1 || var118 == 1 ? class33.field228 : (field714 + class33.field228) / 2;
                                                        int var119 = field650 - class33.field227;
                                                        field647 = var119 * 2;
                                                        field650 = var119 == -1 || var119 == 1 ? class33.field227 : (field650 + class33.field227) / 2;
                                                    } else {
                                                        if (class24.field131[96]) {
                                                            field647 += (-24 - field647) / 2;
                                                        } else if (class24.field131[97]) {
                                                            field647 += (24 - field647) / 2;
                                                        } else {
                                                            field647 /= 2;
                                                        }
                                                        if (class24.field131[98]) {
                                                            field565 += (12 - field565) / 2;
                                                        } else if (class24.field131[99]) {
                                                            field565 += (-12 - field565) / 2;
                                                        } else {
                                                            field565 /= 2;
                                                        }
                                                        field714 = class33.field228;
                                                        field650 = class33.field227;
                                                    }
                                                    field523 = field647 / 2 + field523 & 0x7FF;
                                                    field562 += field565 / 2;
                                                    if (field562 < 128) {
                                                        field562 = 128;
                                                    }
                                                    if (field562 > 383) {
                                                        field562 = 383;
                                                    }
                                                    if (field743) {
                                                        method6709(Statics.field3222, Statics.field470, Statics.field1263);
                                                        method4444(Statics.field839, Statics.field4240);
                                                        if (Statics.field4164 == Statics.field3222 && Statics.field470 == Statics.field3549 && Statics.field2491 == Statics.field1263 && Statics.field839 == Statics.field215 && Statics.field4240 == Statics.field3630) {
                                                            field743 = false;
                                                            field742 = false;
                                                            Statics.field3207 = 0;
                                                            Statics.field2852 = 0;
                                                            Statics.field458 = 0;
                                                            Statics.field89 = 0;
                                                            Statics.field3084 = 0;
                                                            Statics.field2078 = 0;
                                                            Statics.field2806 = 0;
                                                            Statics.field1318 = 0;
                                                            Statics.field1293 = 0;
                                                            Statics.field2899 = 0;
                                                        }
                                                    } else if (field742) {
                                                        method12();
                                                    }
                                                    for (int var120 = 0; var120 < 5; var120++) {
                                                        var10002 = field678[var120]++;
                                                    }
                                                    Statics.field1564.method2305();
                                                    int var121 = class33.method4970();
                                                    int var122 = class24.method1639();
                                                    if (var121 > 15000 && var122 > 15000) {
                                                        field540 = 250;
                                                        class33.field236 = 14500;
                                                        class265 var123 = class265.method4070(class263.field3028, field734.field1344);
                                                        field734.method2362(var123);
                                                    }
                                                    Statics.field4350.method1623();
                                                    field734.field1351++;
                                                    if (field734.field1351 > 50) {
                                                        class265 var124 = class265.method4070(class263.field2983, field734.field1344);
                                                        field734.method2362(var124);
                                                    }
                                                    try {
                                                        field734.method2378();
                                                    } catch (IOException var126) {
                                                        method2646();
                                                    }
                                                    return;
                                                }
                                                var79 = var78.field1047;
                                                if (var79.field3396 < 0) {
                                                    break;
                                                }
                                                var80 = class295.method2248(var79.field3403);
                                            } while (var80 == null || var80.field3535 == null || var79.field3396 >= var80.field3535.length || var80.field3535[var79.field3396] != var79);
                                            class64.method2749(var78);
                                        }
                                    }
                                    var76 = var75.field1047;
                                    if (var76.field3396 < 0) {
                                        break;
                                    }
                                    var77 = class295.method2248(var76.field3403);
                                } while (var77 == null || var77.field3535 == null || var76.field3396 >= var77.field3535.length || var77.field3535[var76.field3396] != var76);
                                class64.method2749(var75);
                            }
                        }
                        var73 = var72.field1047;
                        if (var73.field3396 < 0) {
                            break;
                        }
                        var74 = class295.method2248(var73.field3403);
                    } while (var74 == null || var74.field3535 == null || var73.field3396 >= var74.field3535.length || var74.field3535[var73.field3396] != var73);
                    class64.method2749(var72);
                }
            }
            class265 var4 = class265.method4070(class263.field3048, field734.field1344);
            var4.field3075.method6876(0);
            int var5 = var4.field3075.field4678;
            class34.method2461(var4.field3075);
            var4.field3075.method7118(var4.field3075.field4678 - var5);
            field734.method2362(var4);
        }
    }

    @ObfuscatedName("bp.fj(I)V")
    public static final void method1938() {
        if (Statics.field4582 != null) {
            Statics.field4582.method687();
        }
        if (Statics.field1004 != null) {
            Statics.field1004.method687();
        }
    }

    @ObfuscatedName("x.fm(Lgq;IIII)V")
    public static void method175(class191 arg0, int arg1, int arg2, int arg3) {
        if (field736 < 50 && Statics.field65.method2120() != 0 && arg0.field2216 != null && arg1 < arg0.field2216.length) {
            method581(arg0.field2216[arg1], arg2, arg3);
        }
    }

    @ObfuscatedName("cg.fk(Lgq;IIIB)V")
    public static void method2272(class191 arg0, int arg1, int arg2, int arg3) {
        if (field736 < 50 && Statics.field65.method2120() != 0 && arg0.field2210 != null && arg0.field2210.containsKey(arg1)) {
            method581((Integer) arg0.field2210.get(arg1), arg2, arg3);
        }
    }

    @ObfuscatedName("ae.fw(IIII)V")
    public static void method581(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        int var3 = arg0 >> 8;
        int var4 = arg0 >> 4 & 0x7;
        int var5 = arg0 & 0xF;
        field499[field736] = var3;
        field738[field736] = var4;
        field739[field736] = 0;
        field645[field736] = null;
        int var6 = (arg1 - 64) / 128;
        int var7 = (arg2 - 64) / 128;
        field740[field736] = (var6 << 16) + (var7 << 8) + var5;
        field736++;
    }

    @ObfuscatedName("hw.fa(IIIB)V")
    public static void method4089(int arg0, int arg1, int arg2) {
        if (Statics.field65.method2125() == 0 || arg1 == 0 || field736 >= 50) {
            return;
        }
        field499[field736] = arg0;
        field738[field736] = arg1;
        field739[field736] = arg2;
        field645[field736] = null;
        field740[field736] = 0;
        field736++;
    }

    @ObfuscatedName("hs.gj(II)V")
    public static void method4393(int arg0) {
        if (arg0 == -1 && !field735) {
            class274.method1041();
        } else if (arg0 != -1 && field700 != arg0 && Statics.field65.method2129() != 0 && !field735) {
            class314 var1 = Statics.field4325;
            int var2 = Statics.field65.method2129();
            class274.field3237 = 1;
            Statics.field1582 = var1;
            Statics.field2050 = arg0;
            Statics.field4302 = 0;
            Statics.field1841 = var2;
            Statics.field2642 = false;
            Statics.field4088 = 2;
        }
        field700 = arg0;
    }

    @ObfuscatedName("ku.ge(III)V")
    public static void method5125(int arg0, int arg1) {
        if (Statics.field65.method2129() != 0 && arg0 != -1) {
            class274.method2435(Statics.field1371, arg0, 0, Statics.field65.method2129(), false);
            field735 = true;
        }
    }

    @ObfuscatedName("ct.gp(B)V")
    public static final void method2215() {
        if (!Statics.field998) {
            return;
        }
        for (int var0 = 0; var0 < class97.field1305; var0++) {
            class85 var1 = field609[class97.field1306[var0]];
            var1.method2003();
        }
        Statics.field998 = false;
    }

    @ObfuscatedName("du.gk(Lki;III)V")
    public static final void method2648(class295 arg0, int arg1, int arg2) {
        if (field733 != 0 && field733 != 3 || field498 || !(class33.field238 == 1 || !Statics.field914 && class33.field238 == 4)) {
            return;
        }
        class288 var3 = arg0.method5071(true);
        if (var3 == null) {
            return;
        }
        int var4 = class33.field235 - arg1;
        int var5 = class33.field240 - arg2;
        if (!var3.method4898(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3341 / 2;
        int var7 = var5 - var3.field3340 / 2;
        int var8 = field523 & 0x7FF;
        int var9 = class202.field2402[var8];
        int var10 = class202.field2377[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2657.field1182 + var11 >> 7;
        int var14 = Statics.field2657.field1138 - var12 >> 7;
        class265 var15 = class265.method4070(class263.field3024, field734.field1344);
        var15.field3075.method6876(18);
        var15.field3075.method6974(class24.field131[82] ? (class24.field131[81] ? 2 : 1) : 0);
        var15.field3075.method7019(Statics.field477 + var14);
        var15.field3075.method6877(Statics.field1001 + var13);
        var15.field3075.method6876(var6);
        var15.field3075.method6876(var7);
        var15.field3075.method6877(field523);
        var15.field3075.method6876(57);
        var15.field3075.method6876(0);
        var15.field3075.method6876(0);
        var15.field3075.method6876(89);
        var15.field3075.method6877(Statics.field2657.field1182);
        var15.field3075.method6877(Statics.field2657.field1138);
        var15.field3075.method6876(63);
        field734.method2362(var15);
        field731 = var13;
        field732 = var14;
    }

    @ObfuscatedName("ce.gy(Ljava/lang/String;B)V")
    public static final void method2400(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field65.method2100(!Statics.field65.method2103());
            if (Statics.field65.method2103()) {
                class99.method4522(99, "", "Roofs are now all hidden");
            } else {
                class99.method4522(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field65.method2109();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field538 = !field538;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field643 = !field643;
        }
        if (field664 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field3129.field4557 = !Statics.field3129.field4557;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field65.method2108(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field65.method2108(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2646();
            }
        }
        class265 var1 = class265.method4070(class263.field2989, field734.field1344);
        var1.field3075.method6876(arg0.length() + 1);
        var1.field3075.method6883(arg0);
        field734.method2362(var1);
    }

    @ObfuscatedName("pw.gl(IIII)V")
    public static final void method6709(int arg0, int arg1, int arg2) {
        if (Statics.field4164 < arg0) {
            Statics.field4164 += Statics.field2078 * (arg0 - Statics.field4164) / 1000 + Statics.field2806;
            if (Statics.field4164 > arg0) {
                Statics.field4164 = arg0;
            }
        }
        if (Statics.field4164 > arg0) {
            Statics.field4164 -= Statics.field2078 * (Statics.field4164 - arg0) / 1000 + Statics.field2806;
            if (Statics.field4164 < arg0) {
                Statics.field4164 = arg0;
            }
        }
        if (Statics.field3549 < arg1) {
            Statics.field3549 += Statics.field2078 * (arg1 - Statics.field3549) / 1000 + Statics.field2806;
            if (Statics.field3549 > arg1) {
                Statics.field3549 = arg1;
            }
        }
        if (Statics.field3549 > arg1) {
            Statics.field3549 -= Statics.field2078 * (Statics.field3549 - arg1) / 1000 + Statics.field2806;
            if (Statics.field3549 < arg1) {
                Statics.field3549 = arg1;
            }
        }
        if (Statics.field2491 < arg2) {
            Statics.field2491 += Statics.field2078 * (arg2 - Statics.field2491) / 1000 + Statics.field2806;
            if (Statics.field2491 > arg2) {
                Statics.field2491 = arg2;
            }
        }
        if (Statics.field2491 > arg2) {
            Statics.field2491 -= Statics.field2078 * (Statics.field2491 - arg2) / 1000 + Statics.field2806;
            if (Statics.field2491 < arg2) {
                Statics.field2491 = arg2;
            }
        }
    }

    @ObfuscatedName("ih.gi(III)V")
    public static final void method4444(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field215 < arg0) {
            Statics.field215 += Statics.field3084 * (arg0 - Statics.field215) / 1000 + Statics.field89;
            if (Statics.field215 > arg0) {
                Statics.field215 = arg0;
            }
        }
        if (Statics.field215 > arg0) {
            Statics.field215 -= Statics.field3084 * (Statics.field215 - arg0) / 1000 + Statics.field89;
            if (Statics.field215 < arg0) {
                Statics.field215 = arg0;
            }
        }
        int var2 = arg1 - Statics.field3630;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field3630 += Statics.field3084 * var2 / 1000 + Statics.field89;
            Statics.field3630 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field3630 -= Statics.field3084 * -var2 / 1000 + Statics.field89;
            Statics.field3630 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field3630;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field3630 = arg1;
        }
    }

    @ObfuscatedName("q.gq(I)V")
    public static final void method12() {
        int var0 = Statics.field1318 * 128 + 64;
        int var1 = Statics.field1293 * 128 + 64;
        int var2 = method3712(var0, var1, Statics.field1577) - Statics.field2899;
        method6709(var0, var2, var1);
        int var3 = Statics.field3207 * 128 + 64;
        int var4 = Statics.field2852 * 128 + 64;
        int var5 = method3712(var3, var4, Statics.field1577) - Statics.field458;
        int var6 = var3 - Statics.field4164;
        int var7 = var5 - Statics.field3549;
        int var8 = var4 - Statics.field2491;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
        method4444(var10, var11);
    }

    @ObfuscatedName("kr.gh(Lcx;II)V")
    public static final void method5116(class87 arg0, int arg1) {
        if (arg0.field1192 >= field631) {
            int var2 = Math.max(1, arg0.field1192 - field631);
            int var3 = arg0.field1188 * 128 + arg0.field1168 * 64;
            int var4 = arg0.field1190 * 128 + arg0.field1168 * 64;
            arg0.field1182 += (var3 - arg0.field1182) / var2;
            arg0.field1138 += (var4 - arg0.field1138) / var2;
            arg0.field1195 = 0;
            arg0.field1203 = arg0.field1140;
        } else if (arg0.field1193 >= field631) {
            if (field631 == arg0.field1193 || arg0.field1212 == -1 || arg0.field1181 != 0 || arg0.field1180 + 1 > class191.method2497(arg0.field1212).field2215[arg0.field1179]) {
                int var5 = arg0.field1193 - arg0.field1192;
                int var6 = field631 - arg0.field1192;
                int var7 = arg0.field1188 * 128 + arg0.field1168 * 64;
                int var8 = arg0.field1190 * 128 + arg0.field1168 * 64;
                int var9 = arg0.field1189 * 128 + arg0.field1168 * 64;
                int var10 = arg0.field1191 * 128 + arg0.field1168 * 64;
                arg0.field1182 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field1138 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1195 = 0;
            arg0.field1203 = arg0.field1140;
            arg0.field1139 = arg0.field1203;
        } else {
            method2541(arg0);
        }
        if (arg0.field1182 < 128 || arg0.field1138 < 128 || arg0.field1182 >= 13184 || arg0.field1138 >= 13184) {
            arg0.field1212 = -1;
            arg0.field1207 = -1;
            arg0.field1192 = 0;
            arg0.field1193 = 0;
            arg0.field1182 = arg0.field1194[0] * 128 + arg0.field1168 * 64;
            arg0.field1138 = arg0.field1208[0] * 128 + arg0.field1168 * 64;
            arg0.method2061();
        }
        if (Statics.field2657 == arg0 && (arg0.field1182 < 1536 || arg0.field1138 < 1536 || arg0.field1182 >= 11776 || arg0.field1138 >= 11776)) {
            arg0.field1212 = -1;
            arg0.field1207 = -1;
            arg0.field1192 = 0;
            arg0.field1193 = 0;
            arg0.field1182 = arg0.field1194[0] * 128 + arg0.field1168 * 64;
            arg0.field1138 = arg0.field1208[0] * 128 + arg0.field1168 * 64;
            arg0.method2061();
        }
        if (arg0.field1205 != 0) {
            if (arg0.field1183 != -1) {
                class87 var11 = null;
                if (arg0.field1183 < 32768) {
                    var11 = field534[arg0.field1183];
                } else if (arg0.field1183 >= 32768) {
                    var11 = field609[arg0.field1183 - 32768];
                }
                if (var11 != null) {
                    int var12 = arg0.field1182 - var11.field1182;
                    int var13 = arg0.field1138 - var11.field1138;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field1203 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1172) {
                    arg0.field1183 = -1;
                    arg0.field1172 = false;
                }
            }
            if (arg0.field1173 != -1 && (arg0.field1206 == 0 || arg0.field1195 > 0)) {
                arg0.field1203 = arg0.field1173;
                arg0.field1173 = -1;
            }
            int var14 = arg0.field1203 - arg0.field1139 & 0x7FF;
            if (var14 == 0 && arg0.field1172) {
                arg0.field1183 = -1;
                arg0.field1172 = false;
            }
            if (var14 == 0) {
                arg0.field1204 = 0;
            } else {
                arg0.field1204++;
                if (var14 > 1024) {
                    arg0.field1139 -= arg0.field1174 ? var14 : arg0.field1205;
                    boolean var15 = true;
                    if (var14 < arg0.field1205 || var14 > 2048 - arg0.field1205) {
                        arg0.field1139 = arg0.field1203;
                        var15 = false;
                    }
                    if (!arg0.field1174 && arg0.field1175 == arg0.field1145 && (arg0.field1204 > 25 || var15)) {
                        if (arg0.field1202 == -1) {
                            arg0.field1175 = arg0.field1146;
                        } else {
                            arg0.field1175 = arg0.field1202;
                        }
                    }
                } else {
                    arg0.field1139 += arg0.field1174 ? var14 : arg0.field1205;
                    boolean var16 = true;
                    if (var14 < arg0.field1205 || var14 > 2048 - arg0.field1205) {
                        arg0.field1139 = arg0.field1203;
                        var16 = false;
                    }
                    if (!arg0.field1174 && arg0.field1175 == arg0.field1145 && (arg0.field1204 > 25 || var16)) {
                        if (arg0.field1137 == -1) {
                            arg0.field1175 = arg0.field1146;
                        } else {
                            arg0.field1175 = arg0.field1137;
                        }
                    }
                }
                arg0.field1139 &= 0x7FF;
                arg0.field1174 = false;
            }
        }
        arg0.field1143 = false;
        if (arg0.field1175 != -1) {
            class191 var18 = class191.method2497(arg0.field1175);
            if (var18 == null) {
                arg0.field1175 = -1;
            } else if (!var18.method3417() && var18.field2213 != null) {
                arg0.field1177++;
                if (arg0.field1176 < var18.field2213.length && arg0.field1177 > var18.field2215[arg0.field1176]) {
                    arg0.field1177 = 1;
                    arg0.field1176++;
                    method175(var18, arg0.field1176, arg0.field1182, arg0.field1138);
                }
                if (arg0.field1176 >= var18.field2213.length) {
                    arg0.field1177 = 0;
                    arg0.field1176 = 0;
                    method175(var18, arg0.field1176, arg0.field1182, arg0.field1138);
                }
            } else if (var18.method3417()) {
                arg0.field1176++;
                int var19 = var18.method3434();
                if (arg0.field1176 < var19) {
                    method2272(var18, arg0.field1176, arg0.field1182, arg0.field1138);
                } else {
                    arg0.field1177 = 0;
                    arg0.field1176 = 0;
                    method2272(var18, arg0.field1176, arg0.field1182, arg0.field1138);
                }
            } else {
                arg0.field1175 = -1;
            }
        }
        if (arg0.field1207 != -1 && field631 >= arg0.field1186) {
            if (arg0.field1210 < 0) {
                arg0.field1210 = 0;
            }
            int var20 = class181.method2676(arg0.field1207).field2011;
            if (var20 == -1) {
                arg0.field1207 = -1;
            } else {
                class191 var21 = class191.method2497(var20);
                if (var21 != null && var21.field2213 != null) {
                    arg0.field1185++;
                    if (arg0.field1210 < var21.field2213.length && arg0.field1185 > var21.field2215[arg0.field1210]) {
                        arg0.field1185 = 1;
                        arg0.field1210++;
                        method175(var21, arg0.field1210, arg0.field1182, arg0.field1138);
                    }
                    if (arg0.field1210 >= var21.field2213.length && (arg0.field1210 < 0 || arg0.field1210 >= var21.field2213.length)) {
                        arg0.field1207 = -1;
                    }
                } else if (var21.method3417()) {
                    arg0.field1210++;
                    int var22 = var21.method3434();
                    if (arg0.field1210 < var22) {
                        method2272(var21, arg0.field1210, arg0.field1182, arg0.field1138);
                    } else if (arg0.field1210 < 0 || arg0.field1210 >= var22) {
                        arg0.field1207 = -1;
                    }
                } else {
                    arg0.field1207 = -1;
                }
            }
        }
        if (arg0.field1212 != -1 && arg0.field1181 <= 1) {
            class191 var23 = class191.method2497(arg0.field1212);
            if (var23.field2225 == 1 && arg0.field1201 > 0 && arg0.field1192 <= field631 && arg0.field1193 < field631) {
                arg0.field1181 = 1;
                return;
            }
        }
        if (arg0.field1212 != -1 && arg0.field1181 == 0) {
            class191 var24 = class191.method2497(arg0.field1212);
            if (var24 == null) {
                arg0.field1212 = -1;
            } else if (!var24.method3417() && var24.field2213 != null) {
                arg0.field1180++;
                if (arg0.field1179 < var24.field2213.length && arg0.field1180 > var24.field2215[arg0.field1179]) {
                    arg0.field1180 = 1;
                    arg0.field1179++;
                    method175(var24, arg0.field1179, arg0.field1182, arg0.field1138);
                }
                if (arg0.field1179 >= var24.field2213.length) {
                    arg0.field1179 -= var24.field2217;
                    arg0.field1187++;
                    if (arg0.field1187 >= var24.field2224) {
                        arg0.field1212 = -1;
                    } else if (arg0.field1179 >= 0 && arg0.field1179 < var24.field2213.length) {
                        method175(var24, arg0.field1179, arg0.field1182, arg0.field1138);
                    } else {
                        arg0.field1212 = -1;
                    }
                }
                arg0.field1143 = var24.field2202;
            } else if (var24.method3417()) {
                arg0.field1179++;
                int var25 = var24.method3440().method2606();
                if (arg0.field1179 < var25) {
                    method2272(var24, arg0.field1179, arg0.field1182, arg0.field1138);
                } else {
                    arg0.field1179 -= var24.field2217;
                    arg0.field1187++;
                    if (arg0.field1187 >= var24.field2224) {
                        arg0.field1212 = -1;
                    } else if (arg0.field1179 >= 0 && arg0.field1179 < var25) {
                        method2272(var24, arg0.field1179, arg0.field1182, arg0.field1138);
                    } else {
                        arg0.field1212 = -1;
                    }
                }
            } else {
                arg0.field1212 = -1;
            }
        }
        if (arg0.field1181 > 0) {
            arg0.field1181--;
        }
    }

    @ObfuscatedName("db.gw(Lcx;I)V")
    public static final void method2541(class87 arg0) {
        arg0.field1175 = arg0.field1145;
        if (arg0.field1206 == 0) {
            arg0.field1195 = 0;
            return;
        }
        if (arg0.field1212 != -1 && arg0.field1181 == 0) {
            class191 var1 = class191.method2497(arg0.field1212);
            if (arg0.field1201 > 0 && var1.field2225 == 0) {
                arg0.field1195++;
                return;
            }
            if (arg0.field1201 <= 0 && var1.field2207 == 0) {
                arg0.field1195++;
                return;
            }
        }
        int var2 = arg0.field1182;
        int var3 = arg0.field1138;
        int var4 = arg0.field1194[arg0.field1206 - 1] * 128 + arg0.field1168 * 64;
        int var5 = arg0.field1208[arg0.field1206 - 1] * 128 + arg0.field1168 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1203 = 1280;
            } else if (var3 > var5) {
                arg0.field1203 = 1792;
            } else {
                arg0.field1203 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1203 = 768;
            } else if (var3 > var5) {
                arg0.field1203 = 256;
            } else {
                arg0.field1203 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1203 = 1024;
        } else if (var3 > var5) {
            arg0.field1203 = 0;
        }
        class194 var6 = arg0.field1164[arg0.field1206 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1182 = var4;
            arg0.field1138 = var5;
            arg0.field1206--;
            if (arg0.field1201 > 0) {
                arg0.field1201--;
            }
            return;
        }
        int var7 = arg0.field1203 - arg0.field1139 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1147;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1146;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1149;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1148;
        }
        if (var8 == -1) {
            var8 = arg0.field1146;
        }
        arg0.field1175 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class92) {
            var10 = ((class92) arg0).field1261.field1964;
        }
        if (var10) {
            if (arg0.field1203 != arg0.field1139 && arg0.field1183 == -1 && arg0.field1205 != 0) {
                var9 = 2;
            }
            if (arg0.field1206 > 2) {
                var9 = 6;
            }
            if (arg0.field1206 > 3) {
                var9 = 8;
            }
            if (arg0.field1195 > 0 && arg0.field1206 > 1) {
                var9 = 8;
                arg0.field1195--;
            }
        } else {
            if (arg0.field1206 > 1) {
                var9 = 6;
            }
            if (arg0.field1206 > 2) {
                var9 = 8;
            }
            if (arg0.field1195 > 0 && arg0.field1206 > 1) {
                var9 = 8;
                arg0.field1195--;
            }
        }
        if (class194.field2249 == var6) {
            var9 <<= 0x1;
        } else if (class194.field2250 == var6) {
            var9 >>= 0x1;
        }
        if (var9 >= 8) {
            if (arg0.field1175 == arg0.field1146 && arg0.field1150 != -1) {
                arg0.field1175 = arg0.field1150;
            } else if (arg0.field1175 == arg0.field1147 && arg0.field1151 != -1) {
                arg0.field1175 = arg0.field1151;
            } else if (arg0.field1175 == arg0.field1148 && arg0.field1184 != -1) {
                arg0.field1175 = arg0.field1184;
            } else if (arg0.field1175 == arg0.field1149 && arg0.field1153 != -1) {
                arg0.field1175 = arg0.field1153;
            }
        } else if (var9 <= 1) {
            if (arg0.field1175 == arg0.field1146 && arg0.field1161 != -1) {
                arg0.field1175 = arg0.field1161;
            } else if (arg0.field1175 == arg0.field1147 && arg0.field1155 != -1) {
                arg0.field1175 = arg0.field1155;
            } else if (arg0.field1175 == arg0.field1148 && arg0.field1156 != -1) {
                arg0.field1175 = arg0.field1156;
            } else if (arg0.field1175 == arg0.field1149 && arg0.field1157 != -1) {
                arg0.field1175 = arg0.field1157;
            }
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1182 += var9;
                if (arg0.field1182 > var4) {
                    arg0.field1182 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1182 -= var9;
                if (arg0.field1182 < var4) {
                    arg0.field1182 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1138 += var9;
                if (arg0.field1138 > var5) {
                    arg0.field1138 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1138 -= var9;
                if (arg0.field1138 < var5) {
                    arg0.field1138 = var5;
                }
            }
        }
        if (arg0.field1182 == var4 && arg0.field1138 == var5) {
            arg0.field1206--;
            if (arg0.field1201 > 0) {
                arg0.field1201--;
            }
        }
    }

    @ObfuscatedName("fp.gd(Lca;III)V")
    public static void method2887(class85 arg0, int arg1, int arg2) {
        if (arg0.field1212 == arg1 && arg1 != -1) {
            int var3 = class191.method2497(arg1).field2209;
            if (var3 == 1) {
                arg0.field1179 = 0;
                arg0.field1180 = 0;
                arg0.field1181 = arg2;
                arg0.field1187 = 0;
            }
            if (var3 == 2) {
                arg0.field1187 = 0;
            }
        } else if (arg1 == -1 || arg0.field1212 == -1 || class191.method2497(arg1).field2221 >= class191.method2497(arg0.field1212).field2221) {
            arg0.field1212 = arg1;
            arg0.field1179 = 0;
            arg0.field1180 = 0;
            arg0.field1181 = arg2;
            arg0.field1187 = 0;
            arg0.field1201 = arg0.field1206;
        }
    }

    @ObfuscatedName("em.gc(B)I")
    public static int method2650() {
        return field563 ? 2 : 1;
    }

    @ObfuscatedName("ki.gz(II)V")
    public static void method5022(int arg0) {
        field712 = 0L;
        if (arg0 >= 2) {
            field563 = true;
        } else {
            field563 = false;
        }
        if (method2650() == 1) {
            Statics.field1075.method402(765, 503);
        } else {
            Statics.field1075.method402(7680, 2160);
        }
        if (field510 < 25) {
            return;
        }
        class265 var1 = class265.method4070(class263.field3055, field734.field1344);
        var1.field3075.method6876(method2650());
        var1.field3075.method6877(Statics.field841);
        var1.field3075.method6877(Statics.field4663);
        field734.method2362(var1);
    }

    @ObfuscatedName("ed.gs(I)V")
    public static void method2743() {
        class265 var0 = class265.method4070(class263.field3055, field734.field1344);
        var0.field3075.method6876(method2650());
        var0.field3075.method6877(Statics.field841);
        var0.field3075.method6877(Statics.field4663);
        field734.method2362(var0);
    }

    @ObfuscatedName("client.b(I)V")
    public final void method506() {
        field712 = class270.method2485() + 500L;
        this.method1196();
        if (field543 != -1) {
            this.method1086(true);
        }
    }

    @ObfuscatedName("client.ga(I)V")
    public void method1196() {
        int var1 = Statics.field841;
        int var2 = Statics.field4663;
        if (this.field191 < var1) {
            int var3 = this.field191;
        }
        if (this.field210 < var2) {
            int var4 = this.field210;
        }
        if (Statics.field65 == null) {
            return;
        }
        try {
            client var5 = Statics.field1075;
            Object[] var6 = new Object[] { method2650() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.go(I)V")
    public final void method1071() {
        if (field543 != -1) {
            int var1 = field543;
            if (class295.method4436(var1)) {
                method5602(Statics.field1799[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field489; var2++) {
            if (field653[var2]) {
                field705[var2] = true;
            }
            field525[var2] = field653[var2];
            field653[var2] = false;
        }
        field695 = field631;
        field644 = -1;
        field548 = -1;
        Statics.field1755 = null;
        if (field543 != -1) {
            field489 = 0;
            method3092(field543, 0, 0, Statics.field841, Statics.field4663, 0, 0, -1);
        }
        class449.method7223();
        if (field694) {
            if (field537 == 1) {
                Statics.field940[field596 / 100].method7322(field594 - 8, field595 - 8);
            }
            if (field537 == 2) {
                Statics.field940[field596 / 100 + 4].method7322(field594 - 8, field595 - 8);
            }
        }
        if (field498) {
            int var9 = Statics.field1408;
            int var10 = Statics.field4590;
            int var11 = Statics.field149;
            int var12 = Statics.field29;
            int var13 = 6116423;
            class449.method7204(var9, var10, var11, var12, var13);
            class449.method7204(var9 + 1, var10 + 1, var11 - 2, 16, 0);
            class449.method7208(var9 + 1, var10 + 18, var11 - 2, var12 - 19, 0);
            Statics.field980.method5729(class309.field3816, var9 + 3, var10 + 14, var13, -1);
            int var14 = class33.field227;
            int var15 = class33.field228;
            for (int var16 = 0; var16 < field632; var16++) {
                int var17 = (field632 - 1 - var16) * 15 + var10 + 31;
                int var18 = 16777215;
                if (var14 > var9 && var14 < var9 + var11 && var15 > var17 - 13 && var15 < var17 + 3) {
                    var18 = 16776960;
                }
                class350 var19 = Statics.field980;
                String var20;
                if (var16 < 0) {
                    var20 = "";
                } else if (field638[var16].length() > 0) {
                    var20 = field637[var16] + class309.field3656 + field638[var16];
                } else {
                    var20 = field637[var16];
                }
                var19.method5729(var20, var9 + 3, var17, var18, 0);
            }
            Statics.method1956(Statics.field1408, Statics.field4590, Statics.field149, Statics.field29);
        } else if (field644 != -1) {
            int var3 = field644;
            int var4 = field548;
            if ((field632 >= 2 || field726 != 0 || field500) && field643) {
                int var5 = field632 - 1;
                String var7;
                if (field726 == 1 && field632 < 2) {
                    var7 = class309.field3813 + class309.field3656 + field649 + " " + class93.field1269;
                } else if (field500 && field632 < 2) {
                    var7 = field686 + class309.field3656 + field503 + " " + class93.field1269;
                } else {
                    String var8;
                    if (var5 < 0) {
                        var8 = "";
                    } else if (field638[var5].length() > 0) {
                        var8 = field637[var5] + class309.field3656 + field638[var5];
                    } else {
                        var8 = field637[var5];
                    }
                    var7 = var8;
                }
                if (field632 > 2) {
                    var7 = var7 + class93.method2957(16777215) + " " + '/' + " " + (field632 - 2) + class309.field3817;
                }
                Statics.field980.method5774(var7, var3 + 4, var4 + 15, 16777215, 0, field631 / 1000);
            }
        }
        if (field711 == 3) {
            for (int var21 = 0; var21 < field489; var21++) {
                if (field525[var21]) {
                    class449.method7203(field707[var21], field708[var21], field592[var21], field710[var21], 16711935, 128);
                } else if (field705[var21]) {
                    class449.method7203(field707[var21], field708[var21], field592[var21], field710[var21], 16711680, 128);
                }
            }
        }
        int var22 = Statics.field1577;
        int var23 = Statics.field2657.field1182;
        int var24 = Statics.field2657.field1138;
        int var25 = field728;
        for (class63 var26 = (class63) class63.field815.method5431(); var26 != null; var26 = (class63) class63.field815.method5419()) {
            if (var26.field812 != -1 || var26.field816 != null) {
                int var27 = 0;
                if (var23 > var26.field817) {
                    var27 += var23 - var26.field817;
                } else if (var23 < var26.field807) {
                    var27 += var26.field807 - var23;
                }
                if (var24 > var26.field810) {
                    var27 += var24 - var26.field810;
                } else if (var24 < var26.field808) {
                    var27 += var26.field808 - var24;
                }
                if (var27 - 64 > var26.field818 || Statics.field65.method2120() == 0 || var26.field806 != var22) {
                    if (var26.field813 != null) {
                        Statics.field1539.method597(var26.field813);
                        var26.field813 = null;
                    }
                    if (var26.field805 != null) {
                        Statics.field1539.method597(var26.field805);
                        var26.field805 = null;
                    }
                } else {
                    var27 -= 64;
                    if (var27 < 0) {
                        var27 = 0;
                    }
                    int var28 = (var26.field818 - var27) * Statics.field65.method2120() / var26.field818;
                    class37 var10000;
                    if (var26.field813 != null) {
                        var26.field813.method774(var28);
                    } else if (var26.field812 >= 0) {
                        var10000 = (class37) null;
                        class37 var29 = class37.method643(Statics.field229, var26.field812, 0);
                        if (var29 != null) {
                            class38 var30 = var29.method635().method650(Statics.field4456);
                            class45 var31 = class45.method770(var30, 100, var28);
                            var31.method773(-1);
                            Statics.field1539.method628(var31);
                            var26.field813 = var31;
                        }
                    }
                    if (var26.field805 != null) {
                        var26.field805.method774(var28);
                        if (!var26.field805.method6397()) {
                            var26.field805 = null;
                        }
                    } else if (var26.field816 != null && (var26.field811 -= var25) <= 0) {
                        int var32 = (int) (Math.random() * (double) var26.field816.length);
                        var10000 = (class37) null;
                        class37 var33 = class37.method643(Statics.field229, var26.field816[var32], 0);
                        if (var33 != null) {
                            class38 var34 = var33.method635().method650(Statics.field4456);
                            class45 var35 = class45.method770(var34, 100, var28);
                            var35.method773(0);
                            Statics.field1539.method628(var35);
                            var26.field805 = var35;
                            var26.field811 = var26.field814 + (int) (Math.random() * (double) (var26.field809 - var26.field814));
                        }
                    }
                }
            }
        }
        field728 = 0;
    }

    @ObfuscatedName("io.gu(Ljava/lang/String;ZI)V")
    public static final void method4580(String arg0, boolean arg1) {
        if (!field608) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1718.method5725(arg0, 250);
        int var6 = Statics.field1718.method5813(arg0, 250) * 13;
        class449.method7204(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class449.method7208(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1718.method5732(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2662(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field153.method385(0, 0);
        } else {
            Statics.method1956(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("bp.gn(IIIII)V")
    public static final void method1933(int arg0, int arg1, int arg2, int arg3) {
        field591++;
        if (Statics.field2657.field1182 >> 7 == field731 && Statics.field2657.field1138 >> 7 == field732) {
            field731 = 0;
        }
        Statics.method3483();
        if (field625 >= 0 && field609[field625] != null) {
            method4584(field609[field625], false);
        }
        method2678(true);
        int var4 = class97.field1305;
        int[] var5 = class97.field1306;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field625 != var5[var6] && field610 != var5[var6]) {
                method4584(field609[var5[var6]], true);
            }
        }
        method2678(false);
        for (class70 var7 = (class70) field713.method5431(); var7 != null; var7 = (class70) field713.method5419()) {
            if (Statics.field1577 != var7.field916 || field631 > var7.field922) {
                var7.method6399();
            } else if (field631 >= var7.field921) {
                if (var7.field925 > 0) {
                    class92 var8 = field534[var7.field925 - 1];
                    if (var8 != null && var8.field1182 >= 0 && var8.field1182 < 13312 && var8.field1138 >= 0 && var8.field1138 < 13312) {
                        var7.method1831(var8.field1182, var8.field1138, method3712(var8.field1182, var8.field1138, var7.field916) - var7.field915, field631);
                    }
                }
                if (var7.field925 < 0) {
                    int var9 = -var7.field925 - 1;
                    class85 var10;
                    if (field610 == var9) {
                        var10 = Statics.field2657;
                    } else {
                        var10 = field609[var9];
                    }
                    if (var10 != null && var10.field1182 >= 0 && var10.field1182 < 13312 && var10.field1138 >= 0 && var10.field1138 < 13312) {
                        var7.method1831(var10.field1182, var10.field1138, method3712(var10.field1182, var10.field1138, var7.field916) - var7.field915, field631);
                    }
                }
                var7.method1832(field728);
                Statics.field1926.method3734(Statics.field1577, (int) var7.field927, (int) var7.field920, (int) var7.field929, 60, var7, var7.field935, -1L, false);
            }
        }
        for (class65 var11 = (class65) field529.method5431(); var11 != null; var11 = (class65) field529.method5419()) {
            if (Statics.field1577 != var11.field846 || var11.field850) {
                var11.method6399();
            } else if (field631 >= var11.field842) {
                var11.method1782(field728);
                if (var11.field850) {
                    var11.method6399();
                } else {
                    Statics.field1926.method3734(var11.field846, var11.field844, var11.field843, var11.field847, 60, var11, 0, -1L, false);
                }
            }
        }
        method1042(arg0, arg1, arg2, arg3, true);
        int var12 = field757;
        int var13 = field758;
        int var14 = field759;
        int var15 = field760;
        class449.method7259(var12, var13, var12 + var14, var13 + var15);
        class202.method3637();
        int var16 = field562;
        if (field579 / 256 > var16) {
            var16 = field579 / 256;
        }
        if (field744[4] && field746[4] + 128 > var16) {
            var16 = field746[4] + 128;
        }
        int var17 = field523 & 0x7FF;
        method6006(Statics.field1937, Statics.field1667, Statics.field167, var16, var17, Statics.method87(var16), var15);
        int var30;
        if (field742) {
            var30 = method2412();
        } else {
            int var18;
            if (Statics.field65.method2103()) {
                var18 = Statics.field1577;
            } else {
                label545: {
                    int var19 = 3;
                    if (Statics.field215 < 310) {
                        int var20;
                        int var21;
                        if (field698 == 1) {
                            var20 = Statics.field1937 >> 7;
                            var21 = Statics.field167 >> 7;
                        } else {
                            var20 = Statics.field2657.field1182 >> 7;
                            var21 = Statics.field2657.field1138 >> 7;
                        }
                        int var22 = Statics.field4164 >> 7;
                        int var23 = Statics.field2491 >> 7;
                        if (var22 < 0 || var23 < 0 || var22 >= 104 || var23 >= 104) {
                            var18 = Statics.field1577;
                            break label545;
                        }
                        if (var20 < 0 || var21 < 0 || var20 >= 104 || var21 >= 104) {
                            var18 = Statics.field1577;
                            break label545;
                        }
                        if ((class75.field993[Statics.field1577][var22][var23] & 0x4) != 0) {
                            var19 = Statics.field1577;
                        }
                        int var24;
                        if (var20 > var22) {
                            var24 = var20 - var22;
                        } else {
                            var24 = var22 - var20;
                        }
                        int var25;
                        if (var21 > var23) {
                            var25 = var21 - var23;
                        } else {
                            var25 = var23 - var21;
                        }
                        if (var24 > var25) {
                            int var26 = var25 * 65536 / var24;
                            int var27 = 32768;
                            while (var20 != var22) {
                                if (var22 < var20) {
                                    var22++;
                                } else if (var22 > var20) {
                                    var22--;
                                }
                                if ((class75.field993[Statics.field1577][var22][var23] & 0x4) != 0) {
                                    var19 = Statics.field1577;
                                }
                                var27 += var26;
                                if (var27 >= 65536) {
                                    var27 -= 65536;
                                    if (var23 < var21) {
                                        var23++;
                                    } else if (var23 > var21) {
                                        var23--;
                                    }
                                    if ((class75.field993[Statics.field1577][var22][var23] & 0x4) != 0) {
                                        var19 = Statics.field1577;
                                    }
                                }
                            }
                        } else if (var25 > 0) {
                            int var28 = var24 * 65536 / var25;
                            int var29 = 32768;
                            while (var21 != var23) {
                                if (var23 < var21) {
                                    var23++;
                                } else if (var23 > var21) {
                                    var23--;
                                }
                                if ((class75.field993[Statics.field1577][var22][var23] & 0x4) != 0) {
                                    var19 = Statics.field1577;
                                }
                                var29 += var28;
                                if (var29 >= 65536) {
                                    var29 -= 65536;
                                    if (var22 < var20) {
                                        var22++;
                                    } else if (var22 > var20) {
                                        var22--;
                                    }
                                    if ((class75.field993[Statics.field1577][var22][var23] & 0x4) != 0) {
                                        var19 = Statics.field1577;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field2657.field1182 >= 0 && Statics.field2657.field1138 >= 0 && Statics.field2657.field1182 < 13312 && Statics.field2657.field1138 < 13312) {
                        if ((class75.field993[Statics.field1577][Statics.field2657.field1182 >> 7][Statics.field2657.field1138 >> 7] & 0x4) != 0) {
                            var19 = Statics.field1577;
                        }
                        var18 = var19;
                    } else {
                        var18 = Statics.field1577;
                    }
                }
            }
            var30 = var18;
        }
        int var31 = Statics.field4164;
        int var32 = Statics.field3549;
        int var33 = Statics.field2491;
        int var34 = Statics.field215;
        int var35 = Statics.field3630;
        for (int var36 = 0; var36 < 5; var36++) {
            if (field744[var36]) {
                int var37 = (int) (Math.random() * (double) (field745[var36] * 2 + 1) - (double) field745[var36] + Math.sin((double) field715[var36] / 100.0D * (double) field678[var36]) * (double) field746[var36]);
                if (var36 == 0) {
                    Statics.field4164 += var37;
                }
                if (var36 == 1) {
                    Statics.field3549 += var37;
                }
                if (var36 == 2) {
                    Statics.field2491 += var37;
                }
                if (var36 == 3) {
                    Statics.field3630 = Statics.field3630 + var37 & 0x7FF;
                }
                if (var36 == 4) {
                    Statics.field215 += var37;
                    if (Statics.field215 < 128) {
                        Statics.field215 = 128;
                    }
                    if (Statics.field215 > 383) {
                        Statics.field215 = 383;
                    }
                }
            }
        }
        int var38 = class33.field227;
        int var39 = class33.field228;
        if (class33.field238 != 0) {
            var38 = class33.field235;
            var39 = class33.field240;
        }
        if (var38 >= var12 && var38 < var12 + var14 && var39 >= var13 && var39 < var13 + var15) {
            class213.method2675(var38 - var12, var39 - var13);
        } else {
            class213.field2630 = false;
            class213.field2632 = 0;
        }
        method1938();
        class449.method7204(var12, var13, var14, var15, 0);
        method1938();
        int var40 = class202.field2388;
        class202.field2388 = field755;
        Statics.field1926.method3764(Statics.field4164, Statics.field3549, Statics.field2491, Statics.field215, Statics.field3630, var30);
        class202.field2388 = var40;
        method1938();
        Statics.field1926.method3737();
        field580 = 0;
        boolean var41 = false;
        int var42 = -1;
        int var43 = -1;
        int var44 = class97.field1305;
        int[] var45 = class97.field1306;
        for (int var46 = 0; var46 < field535 + var44; var46++) {
            class87 var47;
            if (var46 < var44) {
                var47 = field609[var45[var46]];
                if (field625 == var45[var46]) {
                    var41 = true;
                    var42 = var46;
                    continue;
                }
                if (Statics.field2657 == var47) {
                    var43 = var46;
                    continue;
                }
            } else {
                var47 = field534[field536[var46 - var44]];
            }
            method1181(var47, var46, var12, var13, var14, var15);
        }
        if (field538 && var43 != -1) {
            method1181(Statics.field2657, var43, var12, var13, var14, var15);
        }
        if (var41) {
            method1181(field609[field625], var42, var12, var13, var14, var15);
        }
        for (int var48 = 0; var48 < field580; var48++) {
            int var49 = field716[var48];
            int var50 = field583[var48];
            int var51 = field623[var48];
            int var52 = field584[var48];
            boolean var53 = true;
            while (var53) {
                var53 = false;
                for (int var54 = 0; var54 < var48; var54++) {
                    if (var50 + 2 > field583[var54] - field584[var54] && var50 - var52 < field583[var54] + 2 && var49 - var51 < field716[var54] + field623[var54] && var49 + var51 > field716[var54] - field623[var54] && field583[var54] - field584[var54] < var50) {
                        var50 = field583[var54] - field584[var54];
                        var53 = true;
                    }
                }
            }
            field648 = field716[var48];
            field673 = field583[var48] = var50;
            String var55 = field589[var48];
            if (field706 == 0) {
                int var56 = 16776960;
                if (field586[var48] < 6) {
                    var56 = field770[field586[var48]];
                }
                if (field586[var48] == 6) {
                    var56 = field591 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field586[var48] == 7) {
                    var56 = field591 % 20 < 10 ? 255 : 65535;
                }
                if (field586[var48] == 8) {
                    var56 = field591 % 20 < 10 ? 45056 : 8454016;
                }
                if (field586[var48] == 9) {
                    int var57 = 150 - field588[var48];
                    if (var57 < 50) {
                        var56 = var57 * 1280 + 16711680;
                    } else if (var57 < 100) {
                        var56 = 16776960 - (var57 - 50) * 327680;
                    } else if (var57 < 150) {
                        var56 = (var57 - 100) * 5 + 65280;
                    }
                }
                if (field586[var48] == 10) {
                    int var58 = 150 - field588[var48];
                    if (var58 < 50) {
                        var56 = var58 * 5 + 16711680;
                    } else if (var58 < 100) {
                        var56 = 16711935 - (var58 - 50) * 327680;
                    } else if (var58 < 150) {
                        var56 = (var58 - 100) * 327680 + 255 - (var58 - 100) * 5;
                    }
                }
                if (field586[var48] == 11) {
                    int var59 = 150 - field588[var48];
                    if (var59 < 50) {
                        var56 = 16777215 - var59 * 327685;
                    } else if (var59 < 100) {
                        var56 = (var59 - 50) * 327685 + 65280;
                    } else if (var59 < 150) {
                        var56 = 16777215 - (var59 - 100) * 327680;
                    }
                }
                if (field704[var48] == 0) {
                    Statics.field980.method5731(var55, field648 + var12, field673 + var13, var56, 0);
                }
                if (field704[var48] == 1) {
                    Statics.field980.method5733(var55, field648 + var12, field673 + var13, var56, 0, field591);
                }
                if (field704[var48] == 2) {
                    Statics.field980.method5734(var55, field648 + var12, field673 + var13, var56, 0, field591);
                }
                if (field704[var48] == 3) {
                    Statics.field980.method5735(var55, field648 + var12, field673 + var13, var56, 0, field591, 150 - field588[var48]);
                }
                if (field704[var48] == 4) {
                    int var60 = (150 - field588[var48]) * (Statics.field980.method5723(var55) + 100) / 150;
                    class449.method7265(field648 + var12 - 50, var13, field648 + var12 + 50, var13 + var15);
                    Statics.field980.method5729(var55, field648 + var12 + 50 - var60, field673 + var13, var56, 0);
                    class449.method7259(var12, var13, var12 + var14, var13 + var15);
                }
                if (field704[var48] == 5) {
                    int var61 = 150 - field588[var48];
                    int var62 = 0;
                    if (var61 < 25) {
                        var62 = var61 - 25;
                    } else if (var61 > 125) {
                        var62 = var61 - 125;
                    }
                    class449.method7265(var12, field673 + var13 - Statics.field980.field4189 - 1, var12 + var14, field673 + var13 + 5);
                    Statics.field980.method5731(var55, field648 + var12, field673 + var13 + var62, var56, 0);
                    class449.method7259(var12, var13, var12 + var14, var13 + var15);
                }
            } else {
                Statics.field980.method5731(var55, field648 + var12, field673 + var13, 16776960, 0);
            }
        }
        if (field496 == 2) {
            method4470((field501 - Statics.field1001 << 7) + field504, (field502 - Statics.field477 << 7) + field555, field564 * 2);
            if (field648 > -1 && field631 % 20 < 10) {
                Statics.field111[0].method7322(field648 + var12 - 12, field673 + var13 - 28);
            }
        }
        ((class210) Statics.field2382).method3923(field728);
        method5897();
        Statics.field4164 = var31;
        Statics.field3549 = var32;
        Statics.field2491 = var33;
        Statics.field215 = var34;
        Statics.field3630 = var35;
        if (field490 && class317.method2062(true, false) == 0) {
            field490 = false;
        }
        if (field490) {
            class449.method7204(var12, var13, var14, var15, 0);
            method4580(class309.field3661, false);
        }
    }

    @ObfuscatedName("bs.gr(IIIIZI)V")
    public static final void method1042(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        if (var7 < field657) {
            short var8 = field657;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field754) {
                var6 = field754;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class449.method7223();
                    class449.method7204(arg0, arg1, var10, arg3, -16777216);
                    class449.method7204(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
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
                    class449.method7223();
                    class449.method7204(arg0, arg1, arg2, var13, -16777216);
                    class449.method7204(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field755 = arg3 * var6 / 334;
        if (field759 != arg2 || field760 != arg3) {
            method4191(arg2, arg3);
        }
        field757 = arg0;
        field758 = arg1;
        field759 = arg2;
        field760 = arg3;
    }

    @ObfuscatedName("ja.gf(Lca;ZB)V")
    public static void method4584(class85 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2009() || arg0.field1115) {
            return;
        }
        arg0.field1099 = false;
        if ((field514 && class97.field1305 > 50 || class97.field1305 > 200) && arg1 && arg0.field1175 == arg0.field1145) {
            arg0.field1099 = true;
        }
        int var2 = arg0.field1182 >> 7;
        int var3 = arg0.field1138 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class213.method3193(0, 0, 0, false, arg0.field1117);
        if (arg0.field1108 != null && field631 >= arg0.field1121 && field631 < arg0.field1104) {
            arg0.field1099 = false;
            arg0.field1102 = method3712(arg0.field1182, arg0.field1138, Statics.field1577);
            arg0.field1142 = field631;
            Statics.field1926.method3735(Statics.field1577, arg0.field1182, arg0.field1138, arg0.field1102, 60, arg0, arg0.field1139, var4, arg0.field1109, arg0.field1110, arg0.field1111, arg0.field1118);
            return;
        }
        if ((arg0.field1182 & 0x7F) == 64 && (arg0.field1138 & 0x7F) == 64) {
            if (field591 == field590[var2][var3]) {
                return;
            }
            field590[var2][var3] = field591;
        }
        arg0.field1102 = method3712(arg0.field1182, arg0.field1138, Statics.field1577);
        arg0.field1142 = field631;
        Statics.field1926.method3734(Statics.field1577, arg0.field1182, arg0.field1138, arg0.field1102, 60, arg0, arg0.field1139, var4, arg0.field1143);
    }

    @ObfuscatedName("eo.gm(ZI)V")
    public static final void method2678(boolean arg0) {
        for (int var1 = 0; var1 < field535; var1++) {
            class92 var2 = field534[field536[var1]];
            if (var2 != null && var2.method2009() && var2.field1261.field1977 == arg0 && var2.field1261.method3120()) {
                int var3 = var2.field1182 >> 7;
                int var4 = var2.field1138 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1168 == 1 && (var2.field1182 & 0x7F) == 64 && (var2.field1138 & 0x7F) == 64) {
                        if (field591 == field590[var3][var4]) {
                            continue;
                        }
                        field590[var3][var4] = field591;
                    }
                    long var5 = class213.method3193(0, 0, 1, !var2.field1261.field1985, field536[var1]);
                    var2.field1142 = field631;
                    Statics.field1926.method3734(Statics.field1577, var2.field1182, var2.field1138, method3712(var2.field1182 + (var2.field1168 * 64 - 64), var2.field1138 + (var2.field1168 * 64 - 64), Statics.field1577), var2.field1168 * 64 - 64 + 60, var2, var2.field1139, var5, var2.field1143);
                }
            }
        }
    }

    @ObfuscatedName("cj.gx(B)I")
    public static final int method2412() {
        if (Statics.field65.method2103()) {
            return Statics.field1577;
        } else {
            int var0 = method3712(Statics.field4164, Statics.field2491, Statics.field1577);
            return var0 - Statics.field3549 >= 800 || (class75.field993[Statics.field1577][Statics.field4164 >> 7][Statics.field2491 >> 7] & 0x4) == 0 ? 3 : Statics.field1577;
        }
    }

    @ObfuscatedName("ad.gg(B)Z")
    public static boolean method751() {
        return (field615 & 0x1) != 0;
    }

    @ObfuscatedName("dn.gt(I)Z")
    public static boolean method2543() {
        return (field615 & 0x2) != 0;
    }

    @ObfuscatedName("d.hy(I)Z")
    public static boolean method267() {
        return (field615 & 0x8) != 0;
    }

    @ObfuscatedName("client.hu(Lcx;IIIIII)V")
    public static final void method1181(class87 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2009()) {
            return;
        }
        if (arg0 instanceof class92) {
            class179 var6 = ((class92) arg0).field1261;
            if (var6.field1982 != null) {
                var6 = var6.method3119();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1305;
        int[] var8 = class97.field1306;
        byte var9 = 0;
        if (arg1 < var7 && field631 == arg0.field1142 && Statics.method2577((class85) arg0)) {
            class85 var10 = (class85) arg0;
            if (arg1 < var7) {
                method5861(arg0, arg0.field1196 + 15);
                class351 var11 = (class351) field545.get(class418.field4585);
                byte var12 = 9;
                var11.method5731(var10.field1100.method7492(), field648 + arg2, field673 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field1170.method5495()) {
            int var14 = arg0.field1196 + 15;
            method4470(arg0.field1182, arg0.field1138, var14);
            for (class91 var15 = (class91) arg0.field1170.method5479(); var15 != null; var15 = (class91) arg0.field1170.method5475()) {
                class88 var16 = var15.method2211(field631);
                if (var16 != null) {
                    class175 var17 = var15.field1255;
                    class453 var18 = var17.method3071();
                    class453 var19 = var17.method3070();
                    int var20 = 0;
                    int var21;
                    if (var18 == null || var19 == null) {
                        var21 = var17.field1920;
                    } else {
                        if (var17.field1921 * 2 < var19.field4768) {
                            var20 = var17.field1921;
                        }
                        var21 = var19.field4768 - var20 * 2;
                    }
                    int var22 = 255;
                    boolean var23 = true;
                    int var24 = field631 - var16.field1215;
                    int var25 = var16.field1216 * var21 / var17.field1920;
                    int var28;
                    if (var16.field1213 > var24) {
                        int var26 = var17.field1916 == 0 ? 0 : var24 / var17.field1916 * var17.field1916;
                        int var27 = var16.field1214 * var21 / var17.field1920;
                        var28 = (var25 - var27) * var26 / var16.field1213 + var27;
                    } else {
                        var28 = var25;
                        int var29 = var16.field1213 + var17.field1917 - var24;
                        if (var17.field1915 >= 0) {
                            var22 = (var29 << 8) / (var17.field1917 - var17.field1915);
                        }
                    }
                    if (var16.field1216 > 0 && var28 < 1) {
                        var28 = 1;
                    }
                    if (var18 == null || var19 == null) {
                        var13 += 5;
                        if (field648 > -1) {
                            int var35 = field648 + arg2 - (var21 >> 1);
                            int var36 = field673 + arg3 - var13;
                            class449.method7204(var35, var36, var28, 5, 65280);
                            class449.method7204(var28 + var35, var36, var21 - var28, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var30;
                        if (var21 == var28) {
                            var30 = var20 * 2 + var28;
                        } else {
                            var30 = var20 + var28;
                        }
                        int var31 = var18.field4770;
                        var13 += var31;
                        int var32 = field648 + arg2 - (var21 >> 1);
                        int var33 = field673 + arg3 - var13;
                        int var34 = var32 - var20;
                        if (var22 >= 0 && var22 < 255) {
                            var18.method7328(var34, var33, var22);
                            class449.method7265(var34, var33, var30 + var34, var31 + var33);
                            var19.method7328(var34, var33, var22);
                        } else {
                            var18.method7322(var34, var33);
                            class449.method7265(var34, var33, var30 + var34, var31 + var33);
                            var19.method7322(var34, var33);
                        }
                        class449.method7259(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var15.method2205()) {
                    var15.method6399();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var37 = var9 + var13;
        if (arg1 < var7) {
            class85 var38 = (class85) arg0;
            if (var38.field1115) {
                return;
            }
            if (var38.field1095 != -1 || var38.field1098 != -1) {
                method5861(arg0, arg0.field1196 + 15);
                if (field648 > -1) {
                    if (var38.field1095 != -1) {
                        var37 += 25;
                        Statics.field1374[var38.field1095].method7322(field648 + arg2 - 12, field673 + arg3 - var37);
                    }
                    if (var38.field1098 != -1) {
                        var37 += 25;
                        Statics.field979[var38.field1098].method7322(field648 + arg2 - 12, field673 + arg3 - var37);
                    }
                }
            }
            if (arg1 >= 0 && field496 == 10 && field667 == var8[arg1]) {
                method5861(arg0, arg0.field1196 + 15);
                if (field648 > -1) {
                    int var39 = Statics.field111[1].field4770 + var37;
                    Statics.field111[1].method7322(field648 + arg2 - 12, field673 + arg3 - var39);
                }
            }
        } else {
            class179 var40 = ((class92) arg0).field1261;
            if (var40.field1982 != null) {
                var40 = var40.method3119();
            }
            if (var40.field1980 >= 0 && var40.field1980 < Statics.field979.length) {
                method5861(arg0, arg0.field1196 + 15);
                if (field648 > -1) {
                    Statics.field979[var40.field1980].method7322(field648 + arg2 - 12, field673 + arg3 - 30);
                }
            }
            if (field496 == 1 && field674 == field536[arg1 - var7] && field631 % 20 < 10) {
                method5861(arg0, arg0.field1196 + 15);
                if (field648 > -1) {
                    Statics.field111[0].method7322(field648 + arg2 - 12, field673 + arg3 - 28);
                }
            }
        }
        if (arg0.field1158 != null && (arg1 >= var7 || !arg0.field1199 && (field559 == 4 || !arg0.field1159 && (field559 == 0 || field559 == 3 || field559 == 1 && ((class85) arg0).method1996())))) {
            method5861(arg0, arg0.field1196);
            if (field648 > -1 && field580 < field581) {
                field623[field580] = Statics.field980.method5723(arg0.field1158) / 2;
                field584[field580] = Statics.field980.field4189;
                field716[field580] = field648;
                field583[field580] = field673;
                field586[field580] = arg0.field1162;
                field704[field580] = arg0.field1163;
                field588[field580] = arg0.field1209;
                field589[field580] = arg0.field1158;
                field580++;
            }
        }
        for (int var41 = 0; var41 < 4; var41++) {
            int var42 = arg0.field1160[var41];
            int var43 = arg0.field1178[var41];
            class187 var44 = null;
            int var45 = 0;
            if (var43 >= 0) {
                if (var42 <= field631) {
                    continue;
                }
                var44 = class187.method2428(arg0.field1178[var41]);
                var45 = var44.field2072;
                if (var44 != null && var44.field2064 != null) {
                    var44 = var44.method3234();
                    if (var44 == null) {
                        arg0.field1160[var41] = -1;
                        continue;
                    }
                }
            } else if (var42 < 0) {
                continue;
            }
            int var46 = arg0.field1165[var41];
            class187 var47 = null;
            if (var46 >= 0) {
                var47 = class187.method2428(var46);
                if (var47 != null && var47.field2064 != null) {
                    var47 = var47.method3234();
                }
            }
            if (var42 - var45 <= field631) {
                if (var44 == null) {
                    arg0.field1160[var41] = -1;
                } else {
                    method5861(arg0, arg0.field1196 / 2);
                    if (field648 > -1) {
                        boolean var48 = true;
                        if (var41 == 1) {
                            field673 -= 20;
                        }
                        if (var41 == 2) {
                            field648 -= 15;
                            field673 -= 10;
                        }
                        if (var41 == 3) {
                            field648 += 15;
                            field673 -= 10;
                        }
                        Object var49 = null;
                        Object var50 = null;
                        Object var51 = null;
                        Object var52 = null;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        class453 var61 = null;
                        class453 var62 = null;
                        class453 var63 = null;
                        class453 var64 = null;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        class453 var74 = var44.method3236();
                        if (var74 != null) {
                            var53 = var74.field4768;
                            int var75 = var74.field4770;
                            if (var75 > var73) {
                                var73 = var75;
                            }
                            var57 = var74.field4773;
                        }
                        class453 var76 = var44.method3239();
                        if (var76 != null) {
                            var54 = var76.field4768;
                            int var77 = var76.field4770;
                            if (var77 > var73) {
                                var73 = var77;
                            }
                            var58 = var76.field4773;
                        }
                        class453 var78 = var44.method3238();
                        if (var78 != null) {
                            var55 = var78.field4768;
                            int var79 = var78.field4770;
                            if (var79 > var73) {
                                var73 = var79;
                            }
                            var59 = var78.field4773;
                        }
                        class453 var80 = var44.method3264();
                        if (var80 != null) {
                            var56 = var80.field4768;
                            int var81 = var80.field4770;
                            if (var81 > var73) {
                                var73 = var81;
                            }
                            var60 = var80.field4773;
                        }
                        if (var47 != null) {
                            var61 = var47.method3236();
                            if (var61 != null) {
                                var65 = var61.field4768;
                                int var82 = var61.field4770;
                                if (var82 > var73) {
                                    var73 = var82;
                                }
                                var69 = var61.field4773;
                            }
                            var62 = var47.method3239();
                            if (var62 != null) {
                                var66 = var62.field4768;
                                int var83 = var62.field4770;
                                if (var83 > var73) {
                                    var73 = var83;
                                }
                                var70 = var62.field4773;
                            }
                            var63 = var47.method3238();
                            if (var63 != null) {
                                var67 = var63.field4768;
                                int var84 = var63.field4770;
                                if (var84 > var73) {
                                    var73 = var84;
                                }
                                var71 = var63.field4773;
                            }
                            var64 = var47.method3264();
                            if (var64 != null) {
                                var68 = var64.field4768;
                                int var85 = var64.field4770;
                                if (var85 > var73) {
                                    var73 = var85;
                                }
                                var72 = var64.field4773;
                            }
                        }
                        class350 var86 = var44.method3240();
                        if (var86 == null) {
                            var86 = Statics.field1331;
                        }
                        class350 var87;
                        if (var47 == null) {
                            var87 = Statics.field1331;
                        } else {
                            var87 = var47.method3240();
                            if (var87 == null) {
                                var87 = Statics.field1331;
                            }
                        }
                        Object var88 = null;
                        String var89 = null;
                        boolean var90 = false;
                        int var91 = 0;
                        String var92 = var44.method3251(arg0.field1166[var41]);
                        int var93 = var86.method5723(var92);
                        if (var47 != null) {
                            var89 = var47.method3251(arg0.field1169[var41]);
                            var91 = var87.method5723(var89);
                        }
                        int var94 = 0;
                        int var95 = 0;
                        if (var54 > 0) {
                            if (var78 == null && var80 == null) {
                                var94 = 1;
                            } else {
                                var94 = var93 / var54 + 1;
                            }
                        }
                        if (var47 != null && var66 > 0) {
                            if (var63 == null && var64 == null) {
                                var95 = 1;
                            } else {
                                var95 = var91 / var66 + 1;
                            }
                        }
                        int var96 = 0;
                        int var97 = var96;
                        if (var53 > 0) {
                            var96 += var53;
                        }
                        var96 += 2;
                        int var98 = var96;
                        if (var55 > 0) {
                            var96 += var55;
                        }
                        int var99 = var96;
                        int var100 = var96;
                        int var102;
                        if (var54 > 0) {
                            int var101 = var54 * var94;
                            var102 = var96 + var101;
                            var100 = (var101 - var93) / 2 + var96;
                        } else {
                            var102 = var93 + var96;
                        }
                        int var103 = var102;
                        if (var56 > 0) {
                            var102 += var56;
                        }
                        int var104 = 0;
                        int var105 = 0;
                        int var106 = 0;
                        int var107 = 0;
                        int var108 = 0;
                        if (var47 != null) {
                            var102 += 2;
                            var104 = var102;
                            if (var65 > 0) {
                                var102 += var65;
                            }
                            var102 += 2;
                            var105 = var102;
                            if (var67 > 0) {
                                var102 += var67;
                            }
                            var106 = var102;
                            var108 = var102;
                            if (var66 > 0) {
                                int var109 = var66 * var95;
                                var102 += var109;
                                var108 += (var109 - var91) / 2;
                            } else {
                                var102 += var91;
                            }
                            var107 = var102;
                            if (var68 > 0) {
                                var102 += var68;
                            }
                        }
                        int var110 = arg0.field1160[var41] - field631;
                        int var111 = var44.field2056 - var44.field2056 * var110 / var44.field2072;
                        int var112 = var44.field2075 * var110 / var44.field2072 + -var44.field2075;
                        int var113 = field648 + arg2 - (var102 >> 1) + var111;
                        int var114 = field673 + arg3 - 12 + var112;
                        int var115 = var114;
                        int var116 = var73 + var114;
                        int var117 = var44.field2069 + var114 + 15;
                        int var118 = var117 - var86.field4191;
                        int var119 = var86.field4195 + var117;
                        if (var118 < var114) {
                            var115 = var118;
                        }
                        if (var119 > var116) {
                            var116 = var119;
                        }
                        int var120 = 0;
                        if (var47 != null) {
                            var120 = var47.field2069 + var114 + 15;
                            int var121 = var120 - var87.field4191;
                            int var122 = var87.field4195 + var120;
                            if (var121 < var115) {
                                ;
                            }
                            if (var122 > var116) {
                                ;
                            }
                        }
                        int var125 = 255;
                        if (var44.field2073 >= 0) {
                            var125 = (var110 << 8) / (var44.field2072 - var44.field2073);
                        }
                        if (var125 >= 0 && var125 < 255) {
                            if (var74 != null) {
                                var74.method7328(var97 + var113 - var57, var114, var125);
                            }
                            if (var78 != null) {
                                var78.method7328(var98 + var113 - var59, var114, var125);
                            }
                            if (var76 != null) {
                                for (int var126 = 0; var126 < var94; var126++) {
                                    var76.method7328(var54 * var126 + (var99 + var113 - var58), var114, var125);
                                }
                            }
                            if (var80 != null) {
                                var80.method7328(var103 + var113 - var60, var114, var125);
                            }
                            var86.method5730(var92, var100 + var113, var117, var44.field2061, 0, var125);
                            if (var47 != null) {
                                if (var61 != null) {
                                    var61.method7328(var104 + var113 - var69, var114, var125);
                                }
                                if (var63 != null) {
                                    var63.method7328(var105 + var113 - var71, var114, var125);
                                }
                                if (var62 != null) {
                                    for (int var127 = 0; var127 < var95; var127++) {
                                        var62.method7328(var66 * var127 + (var106 + var113 - var70), var114, var125);
                                    }
                                }
                                if (var64 != null) {
                                    var64.method7328(var107 + var113 - var72, var114, var125);
                                }
                                var87.method5730(var89, var108 + var113, var120, var47.field2061, 0, var125);
                            }
                        } else {
                            if (var74 != null) {
                                var74.method7322(var97 + var113 - var57, var114);
                            }
                            if (var78 != null) {
                                var78.method7322(var98 + var113 - var59, var114);
                            }
                            if (var76 != null) {
                                for (int var128 = 0; var128 < var94; var128++) {
                                    var76.method7322(var54 * var128 + (var99 + var113 - var58), var114);
                                }
                            }
                            if (var80 != null) {
                                var80.method7322(var103 + var113 - var60, var114);
                            }
                            var86.method5729(var92, var100 + var113, var117, var44.field2061 | 0xFF000000, 0);
                            if (var47 != null) {
                                if (var61 != null) {
                                    var61.method7322(var104 + var113 - var69, var114);
                                }
                                if (var63 != null) {
                                    var63.method7322(var105 + var113 - var71, var114);
                                }
                                if (var62 != null) {
                                    for (int var129 = 0; var129 < var95; var129++) {
                                        var62.method7322(var66 * var129 + (var106 + var113 - var70), var114);
                                    }
                                }
                                if (var64 != null) {
                                    var64.method7322(var107 + var113 - var72, var114);
                                }
                                var87.method5729(var89, var108 + var113, var120, var47.field2061 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("mc.hv(I)V")
    public static final void method5897() {
        field607 = 0;
        int var0 = (Statics.field2657.field1182 >> 7) + Statics.field1001;
        int var1 = (Statics.field2657.field1138 >> 7) + Statics.field477;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field607 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field607 = 1;
        }
        if (field607 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field607 = 0;
        }
    }

    @ObfuscatedName("mk.hi(Lcx;II)V")
    public static final void method5861(class87 arg0, int arg1) {
        method4470(arg0.field1182, arg0.field1138, arg1);
    }

    @ObfuscatedName("iw.hq(IIII)V")
    public static final void method4470(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field648 = -1;
            field673 = -1;
            return;
        }
        int var3 = method3712(arg0, arg1, Statics.field1577) - arg2;
        int var4 = arg0 - Statics.field4164;
        int var5 = var3 - Statics.field3549;
        int var6 = arg1 - Statics.field2491;
        int var7 = class202.field2402[Statics.field215];
        int var8 = class202.field2377[Statics.field215];
        int var9 = class202.field2402[Statics.field3630];
        int var10 = class202.field2377[Statics.field3630];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field648 = field755 * var11 / var15 + field759 / 2;
            field673 = field755 * var14 / var15 + field760 / 2;
        } else {
            field648 = -1;
            field673 = -1;
        }
    }

    @ObfuscatedName("gb.hr(IIII)I")
    public static final int method3712(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class75.field993[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class75.field985[var5][var3][var4] + class75.field985[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class75.field985[var5][var3][var4 + 1] + class75.field985[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("nb.hl(IIIIIIII)V")
    public static final void method6006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field752 - field751) * var7 / 100 + field751;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class202.field2402[var11];
            int var17 = class202.field2377[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class202.field2402[var12];
            int var20 = class202.field2377[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        if (field742) {
            Statics.field3222 = arg0 - var13;
            Statics.field470 = arg1 - var14;
            Statics.field1263 = arg2 - var15;
            Statics.field839 = arg3;
            Statics.field4240 = arg4;
        } else {
            Statics.field4164 = arg0 - var13;
            Statics.field3549 = arg1 - var14;
            Statics.field2491 = arg2 - var15;
            Statics.field215 = arg3;
            Statics.field3630 = arg4;
        }
        if (field698 == 1 && field664 >= 2 && field631 % 50 == 0 && (Statics.field1937 >> 7 != Statics.field2657.field1182 >> 7 || Statics.field167 >> 7 != Statics.field2657.field1138 >> 7)) {
            int var22 = Statics.field2657.field1116;
            int var23 = (Statics.field1937 >> 7) + Statics.field1001;
            int var24 = (Statics.field167 >> 7) + Statics.field477;
            method2633(var23, var24, var22, true);
        }
    }

    @ObfuscatedName("ef.hc(ZLpc;I)V")
    public static final void method2750(boolean arg0, class439 arg1) {
        field585 = arg0;
        if (!field585) {
            int var2 = arg1.method6954();
            int var3 = arg1.method7082();
            int var4 = arg1.method7082();
            Statics.field1629 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1629[var5][var6] = arg1.method6898();
                }
            }
            Statics.field2891 = new int[var4];
            Statics.field1083 = new int[var4];
            Statics.field88 = new int[var4];
            Statics.field1042 = new byte[var4][];
            Statics.field2027 = new byte[var4][];
            boolean var7 = false;
            if (field494) {
                if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                    var7 = true;
                }
                if (var3 / 8 == 48 && var2 / 8 == 148) {
                    var7 = true;
                }
            }
            int var8 = 0;
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field2891[var8] = var11;
                        Statics.field1083[var8] = Statics.field464.method5206("m" + var9 + "_" + var10);
                        Statics.field88[var8] = Statics.field464.method5206("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method5390(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method6924() == 1;
        int var13 = arg1.method6932();
        int var14 = arg1.method6932();
        int var15 = arg1.method7082();
        arg1.method6839();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method6840(1);
                    if (var19 == 1) {
                        field730[var16][var17][var18] = arg1.method6840(26);
                    } else {
                        field730[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method6841();
        Statics.field1629 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1629[var20][var21] = arg1.method6898();
            }
        }
        Statics.field2891 = new int[var15];
        Statics.field1083 = new int[var15];
        Statics.field88 = new int[var15];
        Statics.field1042 = new byte[var15][];
        Statics.field2027 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field730[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field2891[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field2891[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1083[var22] = Statics.field464.method5206("m" + var31 + "_" + var32);
                            Statics.field88[var22] = Statics.field464.method5206("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method5390(var13, var14, !var12);
    }

    @ObfuscatedName("lu.hk(IIZI)V")
    public static final void method5390(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2829 == arg0 && Statics.field4658 == arg1) {
            return;
        }
        Statics.field2829 = arg0;
        Statics.field4658 = arg1;
        method2046(25);
        method4580(class309.field3661, true);
        int var3 = Statics.field1001;
        int var4 = Statics.field477;
        Statics.field1001 = (arg0 - 6) * 8;
        Statics.field477 = (arg1 - 6) * 8;
        int var5 = Statics.field1001 - var3;
        int var6 = Statics.field477 - var4;
        int var7 = Statics.field1001;
        int var8 = Statics.field477;
        for (int var9 = 0; var9 < 32768; var9++) {
            class92 var10 = field534[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1194[var11] -= var5;
                    var10.field1208[var11] -= var6;
                }
                var10.field1182 -= var5 * 128;
                var10.field1138 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class85 var13 = field609[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1194[var14] -= var5;
                    var13.field1208[var14] -= var6;
                }
                var13.field1182 -= var5 * 128;
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
                        field725[var25][var21][var22] = field725[var25][var23][var24];
                    } else {
                        field725[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class86 var26 = (class86) field624.method5431(); var26 != null; var26 = (class86) field624.method5419()) {
            var26.field1131 -= var5;
            var26.field1128 -= var6;
            if (var26.field1131 < 0 || var26.field1128 < 0 || var26.field1131 >= 104 || var26.field1128 >= 104) {
                var26.method6399();
            }
        }
        if (field731 != 0) {
            field731 -= var5;
            field732 -= var6;
        }
        field736 = 0;
        field742 = false;
        Statics.field4164 -= var5 << 7;
        Statics.field2491 -= var6 << 7;
        Statics.field1937 -= var5 << 7;
        Statics.field167 -= var6 << 7;
        field516 = -1;
        field529.method5412();
        field713.method5412();
        for (int var27 = 0; var27 < 4; var27++) {
            field531[var27].method3455();
        }
    }

    @ObfuscatedName("ft.hf(ZB)V")
    public static final void method2979(boolean arg0) {
        method1938();
        field734.field1351++;
        if (field734.field1351 < 50 && !arg0) {
            return;
        }
        field734.field1351 = 0;
        if (field541 || field734.method2366() == null) {
            return;
        }
        class265 var1 = class265.method4070(class263.field2983, field734.field1344);
        field734.method2362(var1);
        try {
            field734.method2378();
        } catch (IOException var3) {
            field541 = true;
        }
    }

    @ObfuscatedName("kr.hx(I)V")
    public static final void method5115() {
        method2979(false);
        field546 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1042.length; var1++) {
            if (Statics.field1083[var1] != -1 && Statics.field1042[var1] == null) {
                Statics.field1042[var1] = Statics.field464.method5249(Statics.field1083[var1], 0);
                if (Statics.field1042[var1] == null) {
                    var0 = false;
                    field546++;
                }
            }
            if (Statics.field88[var1] != -1 && Statics.field2027[var1] == null) {
                Statics.field2027[var1] = Statics.field464.method5230(Statics.field88[var1], 0, Statics.field1629[var1]);
                if (Statics.field2027[var1] == null) {
                    var0 = false;
                    field546++;
                }
            }
        }
        if (!var0) {
            field598 = 1;
            return;
        }
        field571 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1042.length; var3++) {
            byte[] var4 = Statics.field2027[var3];
            if (var4 != null) {
                int var5 = (Statics.field2891[var3] >> 8) * 64 - Statics.field1001;
                int var6 = (Statics.field2891[var3] & 0xFF) * 64 - Statics.field477;
                if (field585) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class75.method2661(var4, var5, var6);
            }
        }
        if (!var2) {
            field598 = 2;
            return;
        }
        if (field598 != 0) {
            method4580(class309.field3661 + class93.field1265 + class93.field1276 + 100 + "%" + class93.field1264, true);
        }
        method1938();
        Statics.field1926.method3854();
        for (int var7 = 0; var7 < 4; var7++) {
            field531[var7].method3455();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class75.field993[var8][var9][var10] = 0;
                }
            }
        }
        method1938();
        class75.method2782();
        int var11 = Statics.field1042.length;
        class63.method2331();
        method2979(true);
        if (!field585) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field2891[var12] >> 8) * 64 - Statics.field1001;
                int var14 = (Statics.field2891[var12] & 0xFF) * 64 - Statics.field477;
                byte[] var15 = Statics.field1042[var12];
                if (var15 != null) {
                    method1938();
                    class75.method4587(var15, var13, var14, Statics.field2829 * 8 - 48, Statics.field4658 * 8 - 48, field531);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field2891[var16] >> 8) * 64 - Statics.field1001;
                int var18 = (Statics.field2891[var16] & 0xFF) * 64 - Statics.field477;
                byte[] var19 = Statics.field1042[var16];
                if (var19 == null && Statics.field4658 < 800) {
                    method1938();
                    class75.method4949(var17, var18, 64, 64);
                }
            }
            method2979(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field2027[var20];
                if (var21 != null) {
                    int var22 = (Statics.field2891[var20] >> 8) * 64 - Statics.field1001;
                    int var23 = (Statics.field2891[var20] & 0xFF) * 64 - Statics.field477;
                    method1938();
                    class75.method4065(var21, var22, var23, Statics.field1926, field531);
                }
            }
        }
        if (field585) {
            for (int var24 = 0; var24 < 4; var24++) {
                method1938();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field730[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field2891.length; var34++) {
                                if (Statics.field2891[var34] == var33 && Statics.field1042[var34] != null) {
                                    class75.method2640(Statics.field1042[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, field531);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class75.method1566(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = field730[0][var35][var36];
                    if (var37 == -1) {
                        class75.method4949(var35 * 8, var36 * 8, 8, 8);
                    }
                }
            }
            method2979(true);
            for (int var38 = 0; var38 < 4; var38++) {
                method1938();
                for (int var39 = 0; var39 < 13; var39++) {
                    for (int var40 = 0; var40 < 13; var40++) {
                        int var41 = field730[var38][var39][var40];
                        if (var41 != -1) {
                            int var42 = var41 >> 24 & 0x3;
                            int var43 = var41 >> 1 & 0x3;
                            int var44 = var41 >> 14 & 0x3FF;
                            int var45 = var41 >> 3 & 0x7FF;
                            int var46 = (var44 / 8 << 8) + var45 / 8;
                            for (int var47 = 0; var47 < Statics.field2891.length; var47++) {
                                if (Statics.field2891[var47] == var46 && Statics.field2027[var47] != null) {
                                    class75.method1928(Statics.field2027[var47], var38, var39 * 8, var40 * 8, var42, (var44 & 0x7) * 8, (var45 & 0x7) * 8, var43, Statics.field1926, field531);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2979(true);
        method1938();
        class75.method4607(Statics.field1926, field531);
        method2979(true);
        int var48 = class75.field984;
        if (var48 > Statics.field1577) {
            var48 = Statics.field1577;
        }
        if (var48 < Statics.field1577 - 1) {
            int var49 = Statics.field1577 - 1;
        }
        if (field514) {
            Statics.field1926.method3724(class75.field984);
        } else {
            Statics.field1926.method3724(0);
        }
        for (int var50 = 0; var50 < 104; var50++) {
            for (int var51 = 0; var51 < 104; var51++) {
                method3907(var50, var51);
            }
        }
        method1938();
        method593();
        class188.field2127.method4569();
        if (Statics.field1075.method435()) {
            class265 var52 = class265.method4070(class263.field2949, field734.field1344);
            var52.field3075.method6879(1057001181);
            field734.method2362(var52);
        }
        if (!field585) {
            int var53 = (Statics.field2829 - 6) / 8;
            int var54 = (Statics.field2829 + 6) / 8;
            int var55 = (Statics.field4658 - 6) / 8;
            int var56 = (Statics.field4658 + 6) / 8;
            for (int var57 = var53 - 1; var57 <= var54 + 1; var57++) {
                for (int var58 = var55 - 1; var58 <= var56 + 1; var58++) {
                    if (var57 < var53 || var57 > var54 || var58 < var55 || var58 > var56) {
                        Statics.field464.method5191("m" + var57 + "_" + var58);
                        Statics.field464.method5191("l" + var57 + "_" + var58);
                    }
                }
            }
        }
        method2046(30);
        method1938();
        class75.method727();
        class265 var59 = class265.method4070(class263.field3032, field734.field1344);
        field734.method2362(var59);
        class32.method6636();
    }

    @ObfuscatedName("nu.hz(IB)V")
    public static final void method6159(int arg0) {
        int[] var1 = Statics.field1043.field4767;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class75.field993[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1926.method3757(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class75.field993[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1926.method3757(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1043.method7320();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class75.field993[arg0][var10][var9] & 0x18) == 0) {
                    method4523(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class75.field993[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method4523(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field633 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field1926.method3723(Statics.field1577, var11, var12);
                if (var13 != 0L) {
                    int var15 = class213.method2942(var13);
                    int var16 = class188.method1989(var15).field2108;
                    if (var16 >= 0 && class172.method2598(var16).field1875) {
                        field709[field633] = class172.method2598(var16).method3009(false);
                        field737[field633] = var11;
                        field729[field633] = var12;
                        field633++;
                    }
                }
            }
        }
        Statics.field153.method7277();
    }

    @ObfuscatedName("it.hg(IIIIII)V")
    public static final void method4523(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field1926.method3752(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field1926.method3799(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class213.method4600(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field1043.field4767;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class213.method2942(var5);
            class188 var14 = class188.method1989(var13);
            if (var14.field2082 == -1) {
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
                class452 var15 = Statics.field172[var14.field2082];
                if (var15 != null) {
                    int var16 = (var14.field2095 * 4 - var15.field4759) / 2;
                    int var17 = (var14.field2096 * 4 - var15.field4762) / 2;
                    var15.method7287(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field2096) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field1926.method3800(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field1926.method3799(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class213.method2942(var18);
            class188 var24 = class188.method1989(var23);
            if (var24.field2082 != -1) {
                class452 var25 = Statics.field172[var24.field2082];
                if (var25 != null) {
                    int var26 = (var24.field2095 * 4 - var25.field4759) / 2;
                    int var27 = (var24.field2096 * 4 - var25.field4762) / 2;
                    var25.method7287(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field2096) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class213.method4600(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field1043.field4767;
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
        long var31 = Statics.field1926.method3723(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class213.method2942(var31);
        class188 var34 = class188.method1989(var33);
        if (var34.field2082 == -1) {
            return;
        }
        class452 var35 = Statics.field172[var34.field2082];
        if (var35 != null) {
            int var36 = (var34.field2095 * 4 - var35.field4759) / 2;
            int var37 = (var34.field2096 * 4 - var35.field4762) / 2;
            var35.method7287(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field2096) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hw(Lcz;I)Z")
    public final boolean method1165(class100 arg0) {
        class378 var2 = arg0.method2366();
        class439 var3 = arg0.field1345;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1347 == null) {
                if (arg0.field1349) {
                    if (!var2.method2928(1)) {
                        return false;
                    }
                    var2.method2915(arg0.field1345.field4679, 0, 1);
                    arg0.field1350 = 0;
                    arg0.field1349 = false;
                }
                var3.field4678 = 0;
                if (var3.method6873()) {
                    if (!var2.method2928(1)) {
                        return false;
                    }
                    var2.method2915(arg0.field1345.field4679, 1, 1);
                    arg0.field1350 = 0;
                }
                arg0.field1349 = true;
                class266[] var4 = class266.method2474();
                int var5 = var3.method6837();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4678);
                }
                arg0.field1347 = var4[var5];
                arg0.field1348 = arg0.field1347.field3190;
            }
            if (arg0.field1348 == -1) {
                if (!var2.method2928(1)) {
                    return false;
                }
                arg0.method2366().method2915(var3.field4679, 0, 1);
                arg0.field1348 = var3.field4679[0] & 0xFF;
            }
            if (arg0.field1348 == -2) {
                if (!var2.method2928(2)) {
                    return false;
                }
                arg0.method2366().method2915(var3.field4679, 0, 2);
                var3.field4678 = 0;
                arg0.field1348 = var3.method7082();
            }
            if (!var2.method2928(arg0.field1348)) {
                return false;
            }
            var3.field4678 = 0;
            var2.method2915(var3.field4679, 0, arg0.field1348);
            arg0.field1350 = 0;
            field544.method5878();
            arg0.field1346 = arg0.field1341;
            arg0.field1341 = arg0.field1352;
            arg0.field1352 = arg0.field1347;
            if (class266.field3142 == arg0.field1347) {
                Statics.field1379 = new class393(Statics.field2704);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3132 == arg0.field1347) {
                int var6 = var3.method6898();
                if (field483 != var6) {
                    field483 = var6;
                    method2672();
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3100 == arg0.field1347) {
                method2592();
                field662 = var3.method7071();
                field696 = field680;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3114 == arg0.field1347) {
                int var7 = var3.method7071();
                String var8 = var3.method7044();
                int var9 = var3.method6971();
                if (var9 >= 1 && var9 <= 8) {
                    if (var8.equalsIgnoreCase(class309.field3681)) {
                        var8 = null;
                    }
                    field619[var9 - 1] = var8;
                    field620[var9 - 1] = var7 == 0;
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3149 == arg0.field1347) {
                int var10 = var3.method6946();
                int var11 = var3.method6954();
                class295 var12 = class295.method2248(var10);
                if (var12.field3439 != 1 || var12.field3508 != var11) {
                    var12.field3439 = 1;
                    var12.field3508 = var11;
                    method5299(var12);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3093 == arg0.field1347) {
                Statics.field4350.method1572();
                field690 = field680;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3104 == arg0.field1347) {
                byte var13 = var3.method7034();
                String var14 = var3.method7044();
                long var15 = (long) var3.method7082();
                long var17 = (long) var3.method6897();
                class311 var19 = (class311) class330.method4934(class311.method2590(), var3.method7071());
                long var20 = (var15 << 32) + var17;
                boolean var22 = false;
                Object var23 = null;
                class149 var24 = var13 >= 0 ? field765[var13] : Statics.field1403;
                if (var24 == null) {
                    var22 = true;
                } else {
                    int var25 = 0;
                    while (true) {
                        if (var25 >= 100) {
                            if (var19.field3981 && Statics.field4350.method1585(new class461(var14, Statics.field4426))) {
                                var22 = true;
                            }
                            break;
                        }
                        if (field718[var25] == var20) {
                            var22 = true;
                            break;
                        }
                        var25++;
                    }
                }
                if (!var22) {
                    field718[field719] = var20;
                    field719 = (field719 + 1) % 100;
                    String var26 = class351.method5790(class283.method4603(var3));
                    int var27 = var13 >= 0 ? 41 : 44;
                    if (var19.field3988 == -1) {
                        class99.method2449(var27, var14, var26, var24.field1711);
                    } else {
                        class99.method2449(var27, class93.method5122(var19.field3988) + var14, var26, var24.field1711);
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3156 == arg0.field1347) {
                int var28 = var3.method7071();
                method3497(var28);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3123 == arg0.field1347) {
                Statics.field1379 = null;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3175 == arg0.field1347) {
                int var29 = var3.method6954();
                if (var29 == 65535) {
                    var29 = -1;
                }
                int var30 = var3.method7079();
                int var31 = var3.method7079();
                class295 var32 = class295.method2248(var31);
                if (var32.field3394) {
                    var32.field3531 = var29;
                    var32.field3532 = var30;
                    class189 var34 = class189.method2903(var29);
                    var32.field3447 = var34.field2161;
                    var32.field3486 = var34.field2151;
                    var32.field3449 = var34.field2152;
                    var32.field3445 = var34.field2153;
                    var32.field3448 = var34.field2154;
                    var32.field3450 = var34.field2149;
                    if (var34.field2146 == 1) {
                        var32.field3424 = 1;
                    } else {
                        var32.field3424 = 2;
                    }
                    if (var32.field3407 > 0) {
                        var32.field3450 = var32.field3450 * 32 / var32.field3407;
                    } else if (var32.field3522 > 0) {
                        var32.field3450 = var32.field3450 * 32 / var32.field3522;
                    }
                    method5299(var32);
                } else if (var29 == -1) {
                    var32.field3439 = 0;
                    arg0.field1347 = null;
                    return true;
                } else {
                    class189 var33 = class189.method2903(var29);
                    var32.field3439 = 4;
                    var32.field3508 = var29;
                    var32.field3447 = var33.field2161;
                    var32.field3486 = var33.field2151;
                    var32.field3450 = var33.field2149 * 100 / var30;
                    method5299(var32);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3092 == arg0.field1347) {
                Statics.field1691 = var3.method6924();
                Statics.field4077 = var3.method7071();
                while (var3.field4678 < arg0.field1348) {
                    int var35 = var3.method7071();
                    class264 var36 = class264.method3504()[var35];
                    method3914(var36);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3096 == arg0.field1347) {
                class34.method2049(var3, arg0.field1348);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3159 == arg0.field1347) {
                int var37 = var3.method6897();
                int var38 = var37 >> 16;
                int var39 = var37 >> 8 & 0xFF;
                int var40 = (var37 >> 4 & 0x7) + var38;
                int var41 = (var37 & 0x7) + var39;
                int var42 = var3.method7082();
                int var43 = var3.method6971();
                int var44 = var3.method7094();
                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                    int var45 = var40 * 128 + 64;
                    int var46 = var41 * 128 + 64;
                    class65 var47 = new class65(var42, Statics.field1577, var45, var46, method3712(var45, var46, Statics.field1577) - var43, var44, field631);
                    field529.method5413(var47);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3183 == arg0.field1347) {
                int var48 = var3.method6898();
                class80 var49 = (class80) field656.method6687((long) var48);
                if (var49 != null) {
                    method2943(var49, true);
                }
                if (field661 != null) {
                    method5299(field661);
                    field661 = null;
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3099 == arg0.field1347) {
                byte var50 = var3.method7034();
                int var51 = var3.method6954();
                class289.field3346[var51] = var50;
                if (class289.field3348[var51] != var50) {
                    class289.field3348[var51] = var50;
                }
                method5317(var51);
                field681[++field553 - 1 & 0x1F] = var51;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3166 == arg0.field1347) {
                int var52 = var3.method6932();
                if (var52 == 65535) {
                    var52 = -1;
                }
                method4393(var52);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3097 == arg0.field1347) {
                int var53 = var3.method7082();
                if (var53 == 65535) {
                    var53 = -1;
                }
                int var54 = var3.method6881();
                method5125(var53, var54);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3113 == arg0.field1347) {
                method2592();
                int var55 = var3.method7079();
                int var56 = var3.method6923();
                int var57 = var3.method6923();
                field629[var56] = var55;
                field508[var56] = var57;
                field628[var56] = 1;
                for (int var58 = 0; var58 < 98; var58++) {
                    if (var55 >= class299.field3581[var58]) {
                        field628[var56] = var58 + 2;
                    }
                }
                field685[++field677 - 1 & 0x1F] = var56;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3141 == arg0.field1347) {
                boolean var59 = var3.method6901();
                if (!var59) {
                    Statics.field1571 = null;
                } else if (Statics.field1571 == null) {
                    Statics.field1571 = new class327();
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3164 == arg0.field1347) {
                String var60 = var3.method7044();
                String var61 = class351.method5790(Statics.method4356(class283.method4603(var3)));
                class99.method4522(6, var60, var61);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3167 == arg0.field1347) {
                method2750(false, arg0.field1345);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3163 == arg0.field1347) {
                method3914(class264.field3059);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3148 == arg0.field1347) {
                field742 = false;
                for (int var62 = 0; var62 < 5; var62++) {
                    field744[var62] = false;
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3187 == arg0.field1347) {
                int var63 = var3.method6898();
                int var64 = var3.method6898();
                int var65 = class32.method230();
                class265 var66 = class265.method4070(class263.field3054, field734.field1344);
                var66.field3075.method6943(var63);
                var66.field3075.method6943(var64);
                var66.field3075.method6974(field182);
                var66.field3075.method6974(var65);
                field734.method2362(var66);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3170 == arg0.field1347) {
                method3914(class264.field3060);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3178 == arg0.field1347) {
                method3914(class264.field3068);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3135 == arg0.field1347) {
                boolean var67 = var3.method6971() == 1;
                int var68 = var3.method6945();
                class295 var69 = class295.method2248(var68);
                if (var69.field3415 != var67) {
                    var69.field3415 = var67;
                    method5299(var69);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3133 == arg0.field1347 && field742) {
                field743 = true;
                Statics.field2806 = var3.method7071();
                Statics.field2078 = var3.method7071();
                Statics.field89 = var3.method7071();
                Statics.field3084 = var3.method7071();
                for (int var70 = 0; var70 < 5; var70++) {
                    field744[var70] = false;
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3185 == arg0.field1347) {
                byte[] var71 = new byte[arg0.field1348];
                var3.method6838(var71, 0, var71.length);
                class440 var72 = new class440(var71);
                String var73 = var72.method7044();
                class30.method1979(var73, true, false);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3085 == arg0.field1347) {
                if (Statics.field303 != null) {
                    Statics.field303.method5955(var3);
                }
                method3501();
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3188 == arg0.field1347) {
                Statics.field4429 = true;
                method3113(false, var3);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3153 == arg0.field1347) {
                for (int var74 = 0; var74 < field609.length; var74++) {
                    if (field609[var74] != null) {
                        field609[var74].field1212 = -1;
                    }
                }
                for (int var75 = 0; var75 < field534.length; var75++) {
                    if (field534[var75] != null) {
                        field534[var75].field1212 = -1;
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3158 == arg0.field1347) {
                int var76 = var3.method6932();
                int var77 = var3.method6898();
                int var78 = var3.method7094();
                class295 var79 = class295.method2248(var77);
                var79.field3452 = (var76 << 16) + var78;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3098 == arg0.field1347) {
                int var80 = var3.method6946();
                int var81 = var3.method7094();
                class295 var82 = class295.method2248(var80);
                if (var82 != null && var82.field3397 == 0) {
                    if (var81 > var82.field3419 - var82.field3411) {
                        var81 = var82.field3419 - var82.field3411;
                    }
                    if (var81 < 0) {
                        var81 = 0;
                    }
                    if (var82.field3417 != var81) {
                        var82.field3417 = var81;
                        method5299(var82);
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3117 == arg0.field1347) {
                if (Statics.field1379 == null) {
                    Statics.field1379 = new class393(Statics.field2704);
                }
                class448 var83 = Statics.field2704.method6344(var3);
                Statics.field1379.field4428.method6702(var83.field4742, var83.field4743);
                field687[++field688 - 1 & 0x1F] = var83.field4742;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3090 == arg0.field1347) {
                String var84 = var3.method7044();
                Object[] var85 = new Object[var84.length() + 1];
                for (int var86 = var84.length() - 1; var86 >= 0; var86--) {
                    if (var84.charAt(var86) == 's') {
                        var85[var86 + 1] = var3.method7044();
                    } else {
                        var85[var86 + 1] = Integer.valueOf(var3.method6898());
                    }
                }
                var85[0] = Integer.valueOf(var3.method6898());
                class81 var87 = new class81();
                var87.field1062 = var85;
                class64.method2749(var87);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3091 == arg0.field1347) {
                method2592();
                field747 = var3.method6896();
                field696 = field680;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3176 == arg0.field1347) {
                method3914(class264.field3067);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3151 == arg0.field1347) {
                method3914(class264.field3072);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3116 == arg0.field1347) {
                field693 = field680;
                byte var88 = var3.method7034();
                if (arg0.field1348 == 1) {
                    if (var88 >= 0) {
                        field765[var88] = null;
                    } else {
                        Statics.field1403 = null;
                    }
                    arg0.field1347 = null;
                    return true;
                }
                if (var88 >= 0) {
                    field765[var88] = new class149(var3);
                } else {
                    Statics.field1403 = new class149(var3);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3127 == arg0.field1347) {
                var3.field4678 += 28;
                if (var3.method6918()) {
                    method4063(var3, var3.field4678 - 28);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3184 == arg0.field1347) {
                method3113(false, var3);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3143 == arg0.field1347) {
                int var89 = var3.method6898();
                int var90 = var3.method7082();
                class295 var91 = class295.method2248(var89);
                if (var91.field3439 != 2 || var91.field3508 != var90) {
                    var91.field3439 = 2;
                    var91.field3508 = var90;
                    method5299(var91);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3087 == arg0.field1347) {
                String var92 = var3.method7044();
                long var93 = (long) var3.method7082();
                long var95 = (long) var3.method6897();
                class311 var97 = (class311) class330.method4934(class311.method2590(), var3.method7071());
                long var98 = (var93 << 32) + var95;
                boolean var100 = false;
                for (int var101 = 0; var101 < 100; var101++) {
                    if (field718[var101] == var98) {
                        var100 = true;
                        break;
                    }
                }
                if (Statics.field4350.method1585(new class461(var92, Statics.field4426))) {
                    var100 = true;
                }
                if (!var100 && field607 == 0) {
                    field718[field719] = var98;
                    field719 = (field719 + 1) % 100;
                    String var102 = class351.method5790(Statics.method4356(class283.method4603(var3)));
                    byte var103;
                    if (var97.field3989) {
                        var103 = 7;
                    } else {
                        var103 = 3;
                    }
                    if (var97.field3988 == -1) {
                        class99.method4522(var103, var92, var102);
                    } else {
                        class99.method4522(var103, class93.method5122(var97.field3988) + var92, var102);
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3088 == arg0.field1347) {
                int var104 = var3.method6896();
                int var105 = var3.method6898();
                class295 var106 = class295.method2248(var105);
                if (var106.field3533 != var104 || var104 == -1) {
                    var106.field3533 = var104;
                    var106.field3478 = 0;
                    var106.field3446 = 0;
                    method5299(var106);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3120 == arg0.field1347) {
                field742 = true;
                field743 = false;
                Statics.field3207 = var3.method7071();
                Statics.field2852 = var3.method7071();
                Statics.field458 = var3.method7082();
                Statics.field89 = var3.method7071();
                Statics.field3084 = var3.method7071();
                if (Statics.field3084 >= 100) {
                    int var107 = Statics.field3207 * 128 + 64;
                    int var108 = Statics.field2852 * 128 + 64;
                    int var109 = method3712(var107, var108, Statics.field1577) - Statics.field458;
                    int var110 = var107 - Statics.field4164;
                    int var111 = var109 - Statics.field3549;
                    int var112 = var108 - Statics.field2491;
                    int var113 = (int) Math.sqrt((double) (var110 * var110 + var112 * var112));
                    Statics.field215 = (int) (Math.atan2((double) var111, (double) var113) * 325.9490051269531D) & 0x7FF;
                    Statics.field3630 = (int) (Math.atan2((double) var110, (double) var112) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field215 < 128) {
                        Statics.field215 = 128;
                    }
                    if (Statics.field215 > 383) {
                        Statics.field215 = 383;
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3140 == arg0.field1347) {
                class61 var114 = new class61();
                var114.field789 = var3.method7044();
                var114.field787 = var3.method7082();
                int var115 = var3.method6898();
                var114.field788 = var115;
                method2046(45);
                var2.method2910();
                Object var116 = null;
                class69.method2969(var114);
                arg0.field1347 = null;
                return false;
            }
            if (class266.field3162 == arg0.field1347) {
                int var117 = var3.method7094();
                class78.method997(var117);
                field683[++field684 - 1 & 0x1F] = var117 & 0x7FFF;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3124 == arg0.field1347) {
                int var118 = var3.method7094();
                int var119 = var3.method7082();
                class92 var120 = field534[var119];
                int var121 = var3.method6945();
                if (var120 != null) {
                    var120.field1207 = var118;
                    var120.field1152 = var121 >> 16;
                    var120.field1186 = (var121 & 0xFFFF) + field631;
                    var120.field1210 = 0;
                    var120.field1185 = 0;
                    if (var120.field1186 > field631) {
                        var120.field1210 = -1;
                    }
                    if (var120.field1207 == 65535) {
                        var120.field1207 = -1;
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3154 == arg0.field1347) {
                int var122 = var3.method7094();
                int var123 = var3.method7094();
                int var124 = var3.method6946();
                int var125 = var3.method6932();
                class295 var126 = class295.method2248(var124);
                if (var126.field3447 != var125 || var126.field3486 != var122 || var126.field3450 != var123) {
                    var126.field3447 = var125;
                    var126.field3486 = var122;
                    var126.field3450 = var123;
                    method5299(var126);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3107 == arg0.field1347) {
                Statics.field4350.method1573(var3, arg0.field1348);
                field690 = field680;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3173 == arg0.field1347) {
                int var127 = var3.method6954();
                class85 var128;
                if (field610 == var127) {
                    var128 = Statics.field2657;
                } else {
                    var128 = field609[var127];
                }
                int var129 = var3.method6898();
                int var130 = var3.method7094();
                if (var128 != null) {
                    var128.field1207 = var130;
                    var128.field1152 = var129 >> 16;
                    var128.field1186 = (var129 & 0xFFFF) + field631;
                    var128.field1210 = 0;
                    var128.field1185 = 0;
                    if (var128.field1186 > field631) {
                        var128.field1210 = -1;
                    }
                    if (var128.field1207 == 65535) {
                        var128.field1207 = -1;
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3119 == arg0.field1347) {
                int var131 = var3.method6954();
                int var132 = var3.method7079();
                class289.field3346[var131] = var132;
                if (class289.field3348[var131] != var132) {
                    class289.field3348[var131] = var132;
                }
                method5317(var131);
                field681[++field553 - 1 & 0x1F] = var131;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3147 == arg0.field1347) {
                field733 = var3.method7071();
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3155 == arg0.field1347) {
                method3914(class264.field3063);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3122 == arg0.field1347) {
                int var133 = var3.method6896();
                int var134 = var3.method6945();
                int var135 = var3.method6900();
                class295 var136 = class295.method2248(var134);
                if (var136.field3404 != var133 || var136.field3405 != var135 || var136.field3400 != 0 || var136.field3401 != 0) {
                    var136.field3404 = var133;
                    var136.field3405 = var135;
                    var136.field3400 = 0;
                    var136.field3401 = 0;
                    method5299(var136);
                    this.method1077(var136);
                    if (var136.field3397 == 0) {
                        method2443(Statics.field1799[var134 >> 16], var136, false);
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3181 == arg0.field1347) {
                method3113(true, var3);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3086 == arg0.field1347) {
                byte var137 = var3.method7034();
                int var138 = var3.method7094();
                int var139 = var3.method6939();
                int var140 = var139 >> 16;
                int var141 = var139 >> 8 & 0xFF;
                int var142 = (var139 >> 4 & 0x7) + var140;
                int var143 = (var139 & 0x7) + var141;
                int var144 = var3.method6936();
                int var145 = var3.method7071();
                byte var146 = var3.method6925();
                int var147 = var3.method6924() * 4;
                int var148 = var3.method7094();
                int var149 = var3.method6923();
                int var150 = var3.method7094();
                int var151 = var3.method7071() * 4;
                int var152 = var137 + var142;
                int var153 = var143 + var146;
                if (var142 >= 0 && var143 >= 0 && var142 < 104 && var143 < 104 && var152 >= 0 && var153 >= 0 && var152 < 104 && var153 < 104 && var138 != 65535) {
                    int var154 = var142 * 128 + 64;
                    int var155 = var143 * 128 + 64;
                    int var156 = var152 * 128 + 64;
                    int var157 = var153 * 128 + 64;
                    class70 var158 = new class70(var138, Statics.field1577, var154, var155, method3712(var154, var155, Statics.field1577) - var151, field631 + var150, field631 + var148, var149, var145, var144, var147);
                    var158.method1831(var156, var157, method3712(var156, var157, Statics.field1577) - var147, field631 + var150);
                    field713.method5413(var158);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3112 == arg0.field1347) {
                int var159 = var3.method7071();
                method2332(var159);
                arg0.field1347 = null;
                return false;
            }
            if (class266.field3180 == arg0.field1347) {
                boolean var160 = var3.method7071() == 1;
                if (var160) {
                    Statics.field1381 = class270.method2485() - var3.method7014();
                    Statics.field1525 = new class318(var3, true);
                } else {
                    Statics.field1525 = null;
                }
                field513 = field680;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3172 == arg0.field1347) {
                int var161 = var3.method7079();
                int var162 = var3.method7094();
                if (var162 == 65535) {
                    var162 = -1;
                }
                int var163 = var3.method7079();
                int var164 = var3.method6954();
                if (var164 == 65535) {
                    var164 = -1;
                }
                for (int var165 = var164; var165 <= var162; var165++) {
                    long var166 = ((long) var161 << 32) + (long) var165;
                    class411 var168 = field701.method6687(var166);
                    if (var168 != null) {
                        var168.method6399();
                    }
                    field701.method6688(new class410(var163), var166);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3131 == arg0.field1347) {
                int var169 = var3.method7082();
                int var170 = var3.method6924();
                int var171 = var3.method6932();
                if (var169 == 65535) {
                    var169 = -1;
                }
                class92 var172 = field534[var171];
                if (var172 != null) {
                    if (var172.field1212 == var169 && var169 != -1) {
                        int var173 = class191.method2497(var169).field2209;
                        if (var173 == 1) {
                            var172.field1179 = 0;
                            var172.field1180 = 0;
                            var172.field1181 = var170;
                            var172.field1187 = 0;
                        } else if (var173 == 2) {
                            var172.field1187 = 0;
                        }
                    } else if (var169 == -1 || var172.field1212 == -1 || class191.method2497(var169).field2221 >= class191.method2497(var172.field1212).field2221) {
                        var172.field1212 = var169;
                        var172.field1179 = 0;
                        var172.field1180 = 0;
                        var172.field1181 = var170;
                        var172.field1187 = 0;
                        var172.field1201 = var172.field1206;
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3145 == arg0.field1347) {
                Statics.field1691 = var3.method6971();
                Statics.field4077 = var3.method7071();
                for (int var174 = Statics.field1691; var174 < Statics.field1691 + 8; var174++) {
                    for (int var175 = Statics.field4077; var175 < Statics.field4077 + 8; var175++) {
                        if (field725[Statics.field1577][var174][var175] != null) {
                            field725[Statics.field1577][var174][var175] = null;
                            method3907(var174, var175);
                        }
                    }
                }
                for (class86 var176 = (class86) field624.method5431(); var176 != null; var176 = (class86) field624.method5419()) {
                    if (var176.field1131 >= Statics.field1691 && var176.field1131 < Statics.field1691 + 8 && var176.field1128 >= Statics.field4077 && var176.field1128 < Statics.field4077 + 8 && Statics.field1577 == var176.field1134) {
                        var176.field1136 = 0;
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3128 == arg0.field1347) {
                field497 = var3.method6932() * 30;
                field696 = field680;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3126 == arg0.field1347) {
                int var177 = arg0.field1348 + var3.field4678;
                int var178 = var3.method7082();
                int var179 = var3.method7082();
                if (field543 != var178) {
                    field543 = var178;
                    this.method1086(false);
                    Statics.method6163(field543);
                    class64.method4434(field543);
                    for (int var180 = 0; var180 < 100; var180++) {
                        field653[var180] = true;
                    }
                }
                while (var179-- > 0) {
                    int var181 = var3.method6898();
                    int var182 = var3.method7082();
                    int var183 = var3.method7071();
                    class80 var184 = (class80) field656.method6687((long) var181);
                    if (var184 != null && var184.field1044 != var182) {
                        method2943(var184, true);
                        var184 = null;
                    }
                    if (var184 == null) {
                        var184 = method4443(var181, var182, var183);
                    }
                    var184.field1035 = true;
                }
                for (class80 var185 = (class80) field656.method6698(); var185 != null; var185 = (class80) field656.method6690()) {
                    if (var185.field1035) {
                        var185.field1035 = false;
                    } else {
                        method2943(var185, true);
                    }
                }
                field701 = new class421(512);
                while (var3.field4678 < var177) {
                    int var186 = var3.method6898();
                    int var187 = var3.method7082();
                    int var188 = var3.method7082();
                    int var189 = var3.method6898();
                    for (int var190 = var187; var190 <= var188; var190++) {
                        long var191 = ((long) var186 << 32) + (long) var190;
                        field701.method6688(new class410(var189), var191);
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3168 == arg0.field1347) {
                method3914(class264.field3069);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3160 == arg0.field1347) {
                for (int var193 = 0; var193 < Statics.field1858; var193++) {
                    class171 var194 = class171.method274(var193);
                    if (var194 != null) {
                        class289.field3346[var193] = 0;
                        class289.field3348[var193] = 0;
                    }
                }
                method2592();
                field553 += 32;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3136 == arg0.field1347) {
                method3914(class264.field3065);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3103 == arg0.field1347) {
                if (field543 != -1) {
                    method4092(field543, 0);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3137 == arg0.field1347) {
                method2750(true, arg0.field1345);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3089 == arg0.field1347) {
                int var195 = var3.method7071();
                if (var3.method7071() == 0) {
                    field766[var195] = new class325();
                    var3.field4678 += 18;
                } else {
                    var3.field4678--;
                    field766[var195] = new class325(var3, false);
                }
                field763 = field680;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3111 == arg0.field1347) {
                for (int var196 = 0; var196 < class289.field3348.length; var196++) {
                    if (class289.field3348[var196] != class289.field3346[var196]) {
                        class289.field3348[var196] = class289.field3346[var196];
                        method5317(var196);
                        field681[++field553 - 1 & 0x1F] = var196;
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3179 == arg0.field1347) {
                method3914(class264.field3061);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3118 == arg0.field1347) {
                int var197 = var3.method7082();
                int var198 = var3.method7071();
                int var199 = var3.method7082();
                method4089(var197, var198, var199);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3115 == arg0.field1347) {
                int var200 = var3.method6898();
                int var201 = var3.method7082();
                if (var200 < -70000) {
                    var201 += 32768;
                }
                class295 var202;
                if (var200 >= 0) {
                    var202 = class295.method2248(var200);
                } else {
                    var202 = null;
                }
                if (var202 != null) {
                    for (int var203 = 0; var203 < var202.field3470.length; var203++) {
                        var202.field3470[var203] = 0;
                        var202.field3530[var203] = 0;
                    }
                }
                class78.method382(var201);
                int var204 = var3.method7082();
                for (int var205 = 0; var205 < var204; var205++) {
                    int var206 = var3.method7071();
                    if (var206 == 255) {
                        var206 = var3.method6946();
                    }
                    int var207 = var3.method7094();
                    if (var202 != null && var205 < var202.field3470.length) {
                        var202.field3470[var205] = var207;
                        var202.field3530[var205] = var206;
                    }
                    class78.method2966(var201, var205, var207 - 1, var206);
                }
                if (var202 != null) {
                    method5299(var202);
                }
                method2592();
                field683[++field684 - 1 & 0x1F] = var201 & 0x7FFF;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3174 == arg0.field1347) {
                method3084();
                byte var208 = var3.method7034();
                class132 var209 = new class132(var3);
                class140 var210;
                if (var208 >= 0) {
                    var210 = field724[var208];
                } else {
                    var210 = Statics.field4259;
                }
                var209.method2652(var210);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3095 == arg0.field1347) {
                Statics.field117 = class457.method2544(var3.method7071());
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3146 == arg0.field1347) {
                int var211 = var3.method6898();
                int var212 = var3.method7082();
                if (var211 < -70000) {
                    var212 += 32768;
                }
                class295 var213;
                if (var211 >= 0) {
                    var213 = class295.method2248(var211);
                } else {
                    var213 = null;
                }
                while (var3.field4678 < arg0.field1348) {
                    int var214 = var3.method7134();
                    int var215 = var3.method7082();
                    int var216 = 0;
                    if (var215 != 0) {
                        var216 = var3.method7071();
                        if (var216 == 255) {
                            var216 = var3.method6898();
                        }
                    }
                    if (var213 != null && var214 >= 0 && var214 < var213.field3470.length) {
                        var213.field3470[var214] = var215;
                        var213.field3530[var214] = var216;
                    }
                    class78.method2966(var212, var214, var215 - 1, var216);
                }
                if (var213 != null) {
                    method5299(var213);
                }
                method2592();
                field683[++field684 - 1 & 0x1F] = var212 & 0x7FFF;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3121 == arg0.field1347) {
                int var217 = var3.method7134();
                boolean var218 = var3.method7071() == 1;
                String var219 = "";
                boolean var220 = false;
                if (var218) {
                    var219 = var3.method7044();
                    if (Statics.field4350.method1585(new class461(var219, Statics.field4426))) {
                        var220 = true;
                    }
                }
                String var221 = var3.method7044();
                if (!var220) {
                    class99.method4522(var217, var219, var221);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3134 == arg0.field1347) {
                int var222 = var3.method7094();
                field543 = var222;
                this.method1086(false);
                Statics.method6163(var222);
                class64.method4434(field543);
                for (int var223 = 0; var223 < 100; var223++) {
                    field653[var223] = true;
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3125 == arg0.field1347) {
                int var224 = var3.method6932();
                int var225 = var3.method6923();
                int var226 = var225 >> 2;
                int var227 = var225 & 0x3;
                int var228 = field554[var226];
                int var229 = var3.method6922();
                int var230 = var229 >> 16;
                int var231 = var229 >> 8 & 0xFF;
                int var232 = (var229 >> 4 & 0x7) + var230;
                int var233 = (var229 & 0x7) + var231;
                if (var232 >= 0 && var233 >= 0 && var232 < 103 && var233 < 103) {
                    if (var228 == 0) {
                        class217 var234 = Statics.field1926.method3844(Statics.field1577, var232, var233);
                        if (var234 != null) {
                            int var235 = class213.method2942(var234.field2670);
                            if (var226 == 2) {
                                var234.field2668 = new class73(var235, 2, var227 + 4, Statics.field1577, var232, var233, var224, false, var234.field2668);
                                var234.field2669 = new class73(var235, 2, var227 + 1 & 0x3, Statics.field1577, var232, var233, var224, false, var234.field2669);
                            } else {
                                var234.field2668 = new class73(var235, var226, var227, Statics.field1577, var232, var233, var224, false, var234.field2668);
                            }
                        }
                    } else if (var228 == 1) {
                        class219 var236 = Statics.field1926.method3746(Statics.field1577, var232, var233);
                        if (var236 != null) {
                            int var237 = class213.method2942(var236.field2683);
                            if (var226 == 4 || var226 == 5) {
                                var236.field2681 = new class73(var237, 4, var227, Statics.field1577, var232, var233, var224, false, var236.field2681);
                            } else if (var226 == 6) {
                                var236.field2681 = new class73(var237, 4, var227 + 4, Statics.field1577, var232, var233, var224, false, var236.field2681);
                            } else if (var226 == 7) {
                                var236.field2681 = new class73(var237, 4, (var227 + 2 & 0x3) + 4, Statics.field1577, var232, var233, var224, false, var236.field2681);
                            } else if (var226 == 8) {
                                var236.field2681 = new class73(var237, 4, var227 + 4, Statics.field1577, var232, var233, var224, false, var236.field2681);
                                var236.field2674 = new class73(var237, 4, (var227 + 2 & 0x3) + 4, Statics.field1577, var232, var233, var224, false, var236.field2674);
                            }
                        }
                    } else if (var228 == 2) {
                        class220 var238 = Statics.field1926.method3747(Statics.field1577, var232, var233);
                        if (var226 == 11) {
                            var226 = 10;
                        }
                        if (var238 != null) {
                            var238.field2692 = new class73(class213.method2942(var238.field2700), var226, var227, Statics.field1577, var232, var233, var224, false, var238.field2692);
                        }
                    } else if (var228 == 3) {
                        class198 var239 = Statics.field1926.method3748(Statics.field1577, var232, var233);
                        if (var239 != null) {
                            var239.field2323 = new class73(class213.method2942(var239.field2321), 22, var227, Statics.field1577, var232, var233, var224, false, var239.field2323);
                        }
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3106 == arg0.field1347) {
                Statics.field4077 = var3.method7071();
                Statics.field1691 = var3.method6923();
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3165 == arg0.field1347) {
                class97.method14(var3, arg0.field1348);
                method2413();
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3157 == arg0.field1347) {
                int var240 = var3.method7079();
                class295 var241 = class295.method2248(var240);
                var241.field3439 = 3;
                var241.field3508 = Statics.field2657.field1113.method4945();
                method5299(var241);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3177 == arg0.field1347) {
                method1932();
                arg0.field1347 = null;
                return false;
            }
            if (class266.field3182 == arg0.field1347) {
                field693 = field680;
                byte var242 = var3.method7034();
                class146 var243 = new class146(var3);
                class149 var244;
                if (var242 >= 0) {
                    var244 = field765[var242];
                } else {
                    var244 = Statics.field1403;
                }
                var243.method2753(var244);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3144 == arg0.field1347) {
                method3914(class264.field3064);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3189 == arg0.field1347) {
                int var245 = var3.method6932();
                int var246 = var3.method6971();
                int var247 = var3.method6945();
                class80 var248 = (class80) field656.method6687((long) var247);
                if (var248 != null) {
                    method2943(var248, var248.field1044 != var245);
                }
                method4443(var247, var245, var246);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3171 == arg0.field1347) {
                int var249 = var3.method7079();
                int var250 = var3.method7079();
                class80 var251 = (class80) field656.method6687((long) var249);
                class80 var252 = (class80) field656.method6687((long) var250);
                if (var252 != null) {
                    method2943(var252, var251 == null || var251.field1044 != var252.field1044);
                }
                if (var251 != null) {
                    var251.method6399();
                    field656.method6688(var251, (long) var250);
                }
                class295 var253 = class295.method2248(var249);
                if (var253 != null) {
                    method5299(var253);
                }
                class295 var254 = class295.method2248(var250);
                if (var254 != null) {
                    method5299(var254);
                    method2443(Statics.field1799[var254.field3395 >>> 16], var254, true);
                }
                if (field543 != -1) {
                    method4092(field543, 1);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3109 == arg0.field1347) {
                String var255 = var3.method7044();
                long var256 = var3.method7014();
                long var258 = (long) var3.method7082();
                long var260 = (long) var3.method6897();
                class311 var262 = (class311) class330.method4934(class311.method2590(), var3.method7071());
                long var263 = (var258 << 32) + var260;
                boolean var265 = false;
                for (int var266 = 0; var266 < 100; var266++) {
                    if (field718[var266] == var263) {
                        var265 = true;
                        break;
                    }
                }
                if (var262.field3981 && Statics.field4350.method1585(new class461(var255, Statics.field4426))) {
                    var265 = true;
                }
                if (!var265 && field607 == 0) {
                    field718[field719] = var263;
                    field719 = (field719 + 1) % 100;
                    String var267 = class351.method5790(Statics.method4356(class283.method4603(var3)));
                    if (var262.field3988 == -1) {
                        class99.method2449(9, var255, var267, class346.method4583(var256));
                    } else {
                        class99.method2449(9, class93.method5122(var262.field3988) + var255, var267, class346.method4583(var256));
                    }
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3094 == arg0.field1347) {
                method2250(var3.method7044());
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3191 == arg0.field1347) {
                int var268 = var3.method7079();
                class295 var269 = class295.method2248(var268);
                for (int var270 = 0; var270 < var269.field3470.length; var270++) {
                    var269.field3470[var270] = -1;
                    var269.field3470[var270] = 0;
                }
                method5299(var269);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3186 == arg0.field1347) {
                byte var271 = var3.method7034();
                long var272 = (long) var3.method7082();
                long var274 = (long) var3.method6897();
                long var276 = (var272 << 32) + var274;
                boolean var278 = false;
                class149 var279 = var271 >= 0 ? field765[var271] : Statics.field1403;
                if (var279 == null) {
                    var278 = true;
                } else {
                    for (int var280 = 0; var280 < 100; var280++) {
                        if (field718[var280] == var276) {
                            var278 = true;
                            break;
                        }
                    }
                }
                if (!var278) {
                    field718[field719] = var276;
                    field719 = (field719 + 1) % 100;
                    String var281 = class283.method4603(var3);
                    int var282 = var271 >= 0 ? 43 : 46;
                    class99.method2449(var282, "", var281, var279.field1711);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3102 == arg0.field1347) {
                if (arg0.field1348 == 0) {
                    Statics.field303 = null;
                } else {
                    if (Statics.field303 == null) {
                        Statics.field303 = new class368(Statics.field4426, Statics.field1075);
                    }
                    Statics.field303.method5952(var3);
                }
                method3501();
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3105 == arg0.field1347) {
                field559 = var3.method7071();
                field659 = var3.method6924();
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3169 == arg0.field1347) {
                int var283 = var3.method7071();
                int var284 = var3.method7071();
                int var285 = var3.method7071();
                int var286 = var3.method7071();
                field744[var283] = true;
                field745[var283] = var284;
                field746[var283] = var285;
                field715[var283] = var286;
                field678[var283] = 0;
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3110 == arg0.field1347) {
                field731 = var3.method7071();
                if (field731 == 255) {
                    field731 = 0;
                }
                field732 = var3.method7071();
                if (field732 == 255) {
                    field732 = 0;
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3101 == arg0.field1347) {
                Statics.field4429 = true;
                method3113(true, var3);
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3138 == arg0.field1347) {
                int var287 = var3.method6945();
                int var288 = var3.method7094();
                int var289 = var288 >> 10 & 0x1F;
                int var290 = var288 >> 5 & 0x1F;
                int var291 = var288 & 0x1F;
                int var292 = (var291 << 3) + (var289 << 19) + (var290 << 11);
                class295 var293 = class295.method2248(var287);
                if (var293.field3469 != var292) {
                    var293.field3469 = var292;
                    method5299(var293);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3130 == arg0.field1347) {
                field742 = true;
                field743 = false;
                Statics.field1318 = var3.method7071();
                Statics.field1293 = var3.method7071();
                Statics.field2899 = var3.method7082();
                Statics.field2806 = var3.method7071();
                Statics.field2078 = var3.method7071();
                if (Statics.field2078 >= 100) {
                    Statics.field4164 = Statics.field1318 * 128 + 64;
                    Statics.field2491 = Statics.field1293 * 128 + 64;
                    Statics.field3549 = method3712(Statics.field4164, Statics.field2491, Statics.field1577) - Statics.field2899;
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3161 == arg0.field1347) {
                field496 = var3.method7071();
                if (field496 == 1) {
                    field674 = var3.method7082();
                }
                if (field496 >= 2 && field496 <= 6) {
                    if (field496 == 2) {
                        field504 = 64;
                        field555 = 64;
                    }
                    if (field496 == 3) {
                        field504 = 0;
                        field555 = 64;
                    }
                    if (field496 == 4) {
                        field504 = 128;
                        field555 = 64;
                    }
                    if (field496 == 5) {
                        field504 = 64;
                        field555 = 0;
                    }
                    if (field496 == 6) {
                        field504 = 64;
                        field555 = 128;
                    }
                    field496 = 2;
                    field501 = var3.method7082();
                    field502 = var3.method7082();
                    field564 = var3.method7071();
                }
                if (field496 == 10) {
                    field667 = var3.method7082();
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3108 == arg0.field1347) {
                String var294 = var3.method7044();
                int var295 = var3.method6898();
                class295 var296 = class295.method2248(var295);
                if (!var294.equals(var296.field3504)) {
                    var296.field3504 = var294;
                    method5299(var296);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3152 == arg0.field1347) {
                method3084();
                byte var297 = var3.method7034();
                if (arg0.field1348 == 1) {
                    if (var297 >= 0) {
                        field724[var297] = null;
                    } else {
                        Statics.field4259 = null;
                    }
                    arg0.field1347 = null;
                    return true;
                }
                if (var297 >= 0) {
                    field724[var297] = new class140(var3);
                } else {
                    Statics.field4259 = new class140(var3);
                }
                arg0.field1347 = null;
                return true;
            }
            if (class266.field3150 == arg0.field1347) {
                Statics.field4350.field800.method5930(var3, arg0.field1348);
                method2599();
                field690 = field680;
                arg0.field1347 = null;
                return true;
            }
            class464.method5148("" + (arg0.field1347 == null ? -1 : arg0.field1347.field3139) + class93.field1267 + (arg0.field1341 == null ? -1 : arg0.field1341.field3139) + class93.field1267 + (arg0.field1346 == null ? -1 : arg0.field1346.field3139) + class93.field1267 + arg0.field1348, (Throwable) null);
            method1932();
        } catch (IOException var302) {
            method2646();
        } catch (Exception var303) {
            String var300 = "" + (arg0.field1347 == null ? -1 : arg0.field1347.field3139) + class93.field1267 + (arg0.field1341 == null ? -1 : arg0.field1341.field3139) + class93.field1267 + (arg0.field1346 == null ? -1 : arg0.field1346.field3139) + class93.field1267 + arg0.field1348 + class93.field1267 + (Statics.field1001 + Statics.field2657.field1194[0]) + class93.field1267 + (Statics.field477 + Statics.field2657.field1208[0]) + class93.field1267;
            for (int var301 = 0; var301 < arg0.field1348 && var301 < 50; var301++) {
                var300 = var300 + var3.field4679[var301] + class93.field1267;
            }
            class464.method5148(var300, var303);
            method1932();
        }
        return true;
    }

    @ObfuscatedName("hy.hb(Lja;I)V")
    public static final void method3914(class264 arg0) {
        class439 var1 = field734.field1345;
        if (class264.field3065 == arg0) {
            int var2 = var1.method7082();
            int var3 = var1.method7071();
            int var4 = (var3 >> 4 & 0x7) + Statics.field1691;
            int var5 = (var3 & 0x7) + Statics.field4077;
            int var6 = var1.method6923();
            int var7 = var6 >> 4 & 0xF;
            int var8 = var6 & 0x7;
            int var9 = var1.method6971();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                int var10 = var7 + 1;
                if (Statics.field2657.field1194[0] >= var4 - var10 && Statics.field2657.field1194[0] <= var4 + var10 && Statics.field2657.field1208[0] >= var5 - var10 && Statics.field2657.field1208[0] <= var5 + var10 && Statics.field65.method2120() != 0 && var8 > 0 && field736 < 50) {
                    field499[field736] = var2;
                    field738[field736] = var8;
                    field739[field736] = var9;
                    field645[field736] = null;
                    field740[field736] = (var4 << 16) + (var5 << 8) + var7;
                    field736++;
                }
            }
        }
        if (class264.field3067 == arg0) {
            int var11 = var1.method6971();
            int var12 = (var11 >> 4 & 0x7) + Statics.field1691;
            int var13 = (var11 & 0x7) + Statics.field4077;
            int var14 = var1.method6932();
            int var15 = var1.method7094();
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class96 var16 = new class96();
                var16.field1296 = var15;
                var16.field1294 = var14;
                if (field725[Statics.field1577][var12][var13] == null) {
                    field725[Statics.field1577][var12][var13] = new class335();
                }
                field725[Statics.field1577][var12][var13].method5413(var16);
                method3907(var12, var13);
            }
        } else if (class264.field3069 == arg0) {
            int var17 = var1.method7082();
            int var18 = var1.method6971();
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            int var21 = field554[var19];
            int var22 = var1.method7071();
            int var23 = (var22 >> 4 & 0x7) + Statics.field1691;
            int var24 = (var22 & 0x7) + Statics.field4077;
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                method4084(Statics.field1577, var23, var24, var21, var17, var19, var20, 0, -1);
            }
        } else if (class264.field3059 == arg0) {
            int var25 = var1.method6923();
            int var26 = (var25 >> 4 & 0x7) + Statics.field1691;
            int var27 = (var25 & 0x7) + Statics.field4077;
            int var28 = var1.method7082();
            int var29 = var1.method6954();
            int var30 = var1.method6954();
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                class335 var31 = field725[Statics.field1577][var26][var27];
                if (var31 != null) {
                    for (class96 var32 = (class96) var31.method5431(); var32 != null; var32 = (class96) var31.method5419()) {
                        if ((var30 & 0x7FFF) == var32.field1296 && var32.field1294 == var29) {
                            var32.field1294 = var28;
                            break;
                        }
                    }
                    method3907(var26, var27);
                }
            }
        } else if (class264.field3064 == arg0) {
            int var33 = var1.method7094();
            int var34 = var1.method6923();
            int var35 = (var34 >> 4 & 0x7) + Statics.field1691;
            int var36 = (var34 & 0x7) + Statics.field4077;
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class335 var37 = field725[Statics.field1577][var35][var36];
                if (var37 != null) {
                    for (class96 var38 = (class96) var37.method5431(); var38 != null; var38 = (class96) var37.method5419()) {
                        if ((var33 & 0x7FFF) == var38.field1296) {
                            var38.method6399();
                            break;
                        }
                    }
                    if (var37.method5431() == null) {
                        field725[Statics.field1577][var35][var36] = null;
                    }
                    method3907(var35, var36);
                }
            }
        } else if (class264.field3060 == arg0) {
            int var39 = var1.method6923();
            int var40 = (var39 >> 4 & 0x7) + Statics.field1691;
            int var41 = (var39 & 0x7) + Statics.field4077;
            int var42 = var1.method6971();
            int var43 = var42 >> 2;
            int var44 = var42 & 0x3;
            int var45 = field554[var43];
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                method4084(Statics.field1577, var40, var41, var45, -1, var43, var44, 0, -1);
            }
        } else if (class264.field3072 == arg0) {
            int var46 = var1.method6924();
            int var47 = (var46 >> 4 & 0x7) + Statics.field1691;
            int var48 = (var46 & 0x7) + Statics.field4077;
            int var49 = var1.method6923();
            int var50 = var1.method7094();
            int var51 = var1.method7094();
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                int var52 = var47 * 128 + 64;
                int var53 = var48 * 128 + 64;
                class65 var54 = new class65(var51, Statics.field1577, var52, var53, method3712(var52, var53, Statics.field1577) - var49, var50, field631);
                field529.method5413(var54);
            }
        } else if (class264.field3061 == arg0) {
            int var55 = var1.method6934();
            int var56 = var1.method7094();
            byte var57 = var1.method6927();
            int var58 = var1.method6923();
            int var59 = (var58 >> 4 & 0x7) + Statics.field1691;
            int var60 = (var58 & 0x7) + Statics.field4077;
            int var61 = var1.method6954();
            int var62 = var1.method7082();
            int var63 = var1.method7071() * 4;
            int var64 = var1.method6924();
            int var65 = var1.method6923() * 4;
            int var66 = var1.method6924();
            byte var67 = var1.method6927();
            int var68 = var59 + var67;
            int var69 = var57 + var60;
            if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104 && var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var56 != 65535) {
                int var70 = var59 * 128 + 64;
                int var71 = var60 * 128 + 64;
                int var72 = var68 * 128 + 64;
                int var73 = var69 * 128 + 64;
                class70 var74 = new class70(var56, Statics.field1577, var70, var71, method3712(var70, var71, Statics.field1577) - var65, field631 + var61, field631 + var62, var66, var64, var55, var63);
                var74.method1831(var72, var73, method3712(var72, var73, Statics.field1577) - var63, field631 + var61);
                field713.method5413(var74);
            }
        } else {
            if (class264.field3063 == arg0) {
                int var75 = var1.method6932();
                int var76 = var1.method7094();
                byte var77 = var1.method6925();
                int var78 = var1.method6924();
                int var79 = (var78 >> 4 & 0x7) + Statics.field1691;
                int var80 = (var78 & 0x7) + Statics.field4077;
                int var81 = var1.method6932();
                int var82 = var1.method7082();
                byte var83 = var1.method6925();
                int var84 = var1.method7071();
                int var85 = var84 >> 2;
                int var86 = var84 & 0x3;
                int var87 = field554[var85];
                byte var88 = var1.method6925();
                byte var89 = var1.method6925();
                class85 var90;
                if (field610 == var75) {
                    var90 = Statics.field2657;
                } else {
                    var90 = field609[var75];
                }
                if (var90 != null) {
                    class188 var91 = class188.method1989(var76);
                    int var92;
                    int var93;
                    if (var86 == 1 || var86 == 3) {
                        var92 = var91.field2096;
                        var93 = var91.field2095;
                    } else {
                        var92 = var91.field2095;
                        var93 = var91.field2096;
                    }
                    int var94 = (var92 >> 1) + var79;
                    int var95 = (var92 + 1 >> 1) + var79;
                    int var96 = (var93 >> 1) + var80;
                    int var97 = (var93 + 1 >> 1) + var80;
                    int[][] var98 = class75.field985[Statics.field1577];
                    int var99 = var98[var94][var96] + var98[var95][var96] + var98[var94][var97] + var98[var95][var97] >> 2;
                    int var100 = (var79 << 7) + (var92 << 6);
                    int var101 = (var80 << 7) + (var93 << 6);
                    class212 var102 = var91.method3272(var85, var86, var98, var100, var99, var101);
                    if (var102 != null) {
                        method4084(Statics.field1577, var79, var80, var87, -1, 0, 0, var82 + 1, var81 + 1);
                        var90.field1121 = field631 + var82;
                        var90.field1104 = field631 + var81;
                        var90.field1108 = var102;
                        var90.field1105 = var79 * 128 + var92 * 64;
                        var90.field1107 = var80 * 128 + var93 * 64;
                        var90.field1106 = var99;
                        if (var83 > var89) {
                            byte var103 = var83;
                            var83 = var89;
                            var89 = var103;
                        }
                        if (var77 > var88) {
                            byte var104 = var77;
                            var77 = var88;
                            var88 = var104;
                        }
                        var90.field1109 = var79 + var83;
                        var90.field1111 = var79 + var89;
                        var90.field1110 = var77 + var80;
                        var90.field1118 = var80 + var88;
                    }
                }
            }
            if (class264.field3068 == arg0) {
                int var105 = var1.method6971();
                int var106 = var105 >> 2;
                int var107 = var105 & 0x3;
                int var108 = field554[var106];
                int var109 = var1.method6924();
                int var110 = (var109 >> 4 & 0x7) + Statics.field1691;
                int var111 = (var109 & 0x7) + Statics.field4077;
                int var112 = var1.method6932();
                if (var110 >= 0 && var111 >= 0 && var110 < 103 && var111 < 103) {
                    if (var108 == 0) {
                        class217 var113 = Statics.field1926.method3844(Statics.field1577, var110, var111);
                        if (var113 != null) {
                            int var114 = class213.method2942(var113.field2670);
                            if (var106 == 2) {
                                var113.field2668 = new class73(var114, 2, var107 + 4, Statics.field1577, var110, var111, var112, false, var113.field2668);
                                var113.field2669 = new class73(var114, 2, var107 + 1 & 0x3, Statics.field1577, var110, var111, var112, false, var113.field2669);
                            } else {
                                var113.field2668 = new class73(var114, var106, var107, Statics.field1577, var110, var111, var112, false, var113.field2668);
                            }
                        }
                    }
                    if (var108 == 1) {
                        class219 var115 = Statics.field1926.method3746(Statics.field1577, var110, var111);
                        if (var115 != null) {
                            int var116 = class213.method2942(var115.field2683);
                            if (var106 == 4 || var106 == 5) {
                                var115.field2681 = new class73(var116, 4, var107, Statics.field1577, var110, var111, var112, false, var115.field2681);
                            } else if (var106 == 6) {
                                var115.field2681 = new class73(var116, 4, var107 + 4, Statics.field1577, var110, var111, var112, false, var115.field2681);
                            } else if (var106 == 7) {
                                var115.field2681 = new class73(var116, 4, (var107 + 2 & 0x3) + 4, Statics.field1577, var110, var111, var112, false, var115.field2681);
                            } else if (var106 == 8) {
                                var115.field2681 = new class73(var116, 4, var107 + 4, Statics.field1577, var110, var111, var112, false, var115.field2681);
                                var115.field2674 = new class73(var116, 4, (var107 + 2 & 0x3) + 4, Statics.field1577, var110, var111, var112, false, var115.field2674);
                            }
                        }
                    }
                    if (var108 == 2) {
                        class220 var117 = Statics.field1926.method3747(Statics.field1577, var110, var111);
                        if (var106 == 11) {
                            var106 = 10;
                        }
                        if (var117 != null) {
                            var117.field2692 = new class73(class213.method2942(var117.field2700), var106, var107, Statics.field1577, var110, var111, var112, false, var117.field2692);
                        }
                    }
                    if (var108 == 3) {
                        class198 var118 = Statics.field1926.method3748(Statics.field1577, var110, var111);
                        if (var118 != null) {
                            var118.field2323 = new class73(class213.method2942(var118.field2321), 22, var107, Statics.field1577, var110, var111, var112, false, var118.field2323);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hg.ho(IIIIIIIIIB)V")
    public static final void method4084(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class86 var9 = null;
        for (class86 var10 = (class86) field624.method5431(); var10 != null; var10 = (class86) field624.method5419()) {
            if (var10.field1134 == arg0 && var10.field1131 == arg1 && var10.field1128 == arg2 && var10.field1126 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class86();
            var9.field1134 = arg0;
            var9.field1126 = arg3;
            var9.field1131 = arg1;
            var9.field1128 = arg2;
            method2401(var9);
            field624.method5413(var9);
        }
        var9.field1125 = arg4;
        var9.field1127 = arg5;
        var9.field1133 = arg6;
        var9.field1135 = arg7;
        var9.field1136 = arg8;
    }

    @ObfuscatedName("ap.hm(I)V")
    public static final void method593() {
        for (class86 var0 = (class86) field624.method5431(); var0 != null; var0 = (class86) field624.method5419()) {
            if (var0.field1136 == -1) {
                var0.field1135 = 0;
                method2401(var0);
            } else {
                var0.method6399();
            }
        }
    }

    @ObfuscatedName("ce.hd(Lci;B)V")
    public static final void method2401(class86 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1126 == 0) {
            var1 = Statics.field1926.method3752(arg0.field1134, arg0.field1131, arg0.field1128);
        }
        if (arg0.field1126 == 1) {
            var1 = Statics.field1926.method3750(arg0.field1134, arg0.field1131, arg0.field1128);
        }
        if (arg0.field1126 == 2) {
            var1 = Statics.field1926.method3800(arg0.field1134, arg0.field1131, arg0.field1128);
        }
        if (arg0.field1126 == 3) {
            var1 = Statics.field1926.method3723(arg0.field1134, arg0.field1131, arg0.field1128);
        }
        if (var1 != 0L) {
            int var6 = Statics.field1926.method3799(arg0.field1134, arg0.field1131, arg0.field1128, var1);
            var3 = class213.method2942(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1129 = var3;
        arg0.field1130 = var4;
        arg0.field1132 = var5;
    }

    @ObfuscatedName("bn.hp(B)V")
    public static final void method1926() {
        for (class86 var0 = (class86) field624.method5431(); var0 != null; var0 = (class86) field624.method5419()) {
            if (var0.field1136 > 0) {
                var0.field1136--;
            }
            if (var0.field1136 == 0) {
                if (var0.field1129 >= 0) {
                    int var1 = var0.field1129;
                    int var2 = var0.field1130;
                    class188 var3 = class188.method1989(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method3294(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method4380(var0.field1134, var0.field1126, var0.field1131, var0.field1128, var0.field1129, var0.field1132, var0.field1130);
                var0.method6399();
            } else {
                if (var0.field1135 > 0) {
                    var0.field1135--;
                }
                if (var0.field1135 == 0 && var0.field1131 >= 1 && var0.field1128 >= 1 && var0.field1131 <= 102 && var0.field1128 <= 102) {
                    if (var0.field1125 >= 0) {
                        int var5 = var0.field1125;
                        int var6 = var0.field1127;
                        class188 var7 = class188.method1989(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method3294(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method4380(var0.field1134, var0.field1126, var0.field1131, var0.field1128, var0.field1125, var0.field1133, var0.field1127);
                    var0.field1135 = -1;
                    if (var0.field1129 == var0.field1125 && var0.field1129 == -1) {
                        var0.method6399();
                    } else if (var0.field1129 == var0.field1125 && var0.field1133 == var0.field1132 && var0.field1130 == var0.field1127) {
                        var0.method6399();
                    }
                }
            }
        }
    }

    @ObfuscatedName("hj.hj(IIIIIIII)V")
    public static final void method4380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field514 && Statics.field1577 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field1926.method3752(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1926.method3750(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1926.method3800(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1926.method3723(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field1926.method3799(arg0, arg2, arg3, var7);
            int var13 = class213.method2942(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1926.method3751(arg0, arg2, arg3);
                class188 var16 = class188.method1989(var13);
                if (var16.field2097 != 0) {
                    field531[arg0].method3461(arg2, arg3, var14, var15, var16.field2098);
                }
            }
            if (arg1 == 1) {
                Statics.field1926.method3741(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1926.method3853(arg0, arg2, arg3);
                class188 var17 = class188.method1989(var13);
                if (var17.field2095 + arg2 > 103 || var17.field2095 + arg3 > 103 || var17.field2096 + arg2 > 103 || var17.field2096 + arg3 > 103) {
                    return;
                }
                if (var17.field2097 != 0) {
                    field531[arg0].method3462(arg2, arg3, var17.field2095, var17.field2096, var15, var17.field2098);
                }
            }
            if (arg1 == 3) {
                Statics.field1926.method3804(arg0, arg2, arg3);
                class188 var18 = class188.method1989(var13);
                if (var18.field2097 == 1) {
                    field531[arg0].method3464(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class75.field993[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class75.method6640(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field1926, field531[arg0]);
    }

    @ObfuscatedName("gt.he(IIB)V")
    public static final void method3907(int arg0, int arg1) {
        class335 var2 = field725[Statics.field1577][arg0][arg1];
        if (var2 == null) {
            Statics.field1926.method3744(Statics.field1577, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class96 var5 = null;
        for (class96 var6 = (class96) var2.method5431(); var6 != null; var6 = (class96) var2.method5419()) {
            class189 var7 = class189.method2903(var6.field1296);
            long var8 = (long) var7.field2186;
            if (var7.field2146 == 1) {
                var8 = (long) (var6.field1294 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1926.method3744(Statics.field1577, arg0, arg1);
            return;
        }
        var2.method5414(var5);
        class96 var10 = null;
        class96 var11 = null;
        for (class96 var12 = (class96) var2.method5431(); var12 != null; var12 = (class96) var2.method5419()) {
            if (var5.field1296 != var12.field1296) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1296 != var12.field1296 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class213.method3193(arg0, arg1, 3, false, 0);
        Statics.field1926.method3838(Statics.field1577, arg0, arg1, method3712(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1577), var5, var13, var10, var11);
    }

    @ObfuscatedName("fj.hh(ZLpc;B)V")
    public static final void method3113(boolean arg0, class439 arg1) {
        field622 = 0;
        field566 = 0;
        class439 var2 = field734.field1345;
        var2.method6839();
        int var3 = var2.method6840(8);
        if (var3 < field535) {
            for (int var4 = var3; var4 < field535; var4++) {
                field617[++field622 - 1] = field536[var4];
            }
        }
        if (var3 > field535) {
            throw new RuntimeException("");
        }
        field535 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field536[var5];
            class92 var7 = field534[var6];
            int var8 = var2.method6840(1);
            if (var8 == 0) {
                field536[++field535 - 1] = var6;
                var7.field1167 = field631;
            } else {
                int var9 = var2.method6840(2);
                if (var9 == 0) {
                    field536[++field535 - 1] = var6;
                    var7.field1167 = field631;
                    field602[++field566 - 1] = var6;
                } else if (var9 == 1) {
                    field536[++field535 - 1] = var6;
                    var7.field1167 = field631;
                    int var10 = var2.method6840(3);
                    var7.method2219(var10, class194.field2252);
                    int var11 = var2.method6840(1);
                    if (var11 == 1) {
                        field602[++field566 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field536[++field535 - 1] = var6;
                    var7.field1167 = field631;
                    if (var2.method6840(1) == 1) {
                        int var12 = var2.method6840(3);
                        var7.method2219(var12, class194.field2249);
                        int var13 = var2.method6840(3);
                        var7.method2219(var13, class194.field2249);
                    } else {
                        int var14 = var2.method6840(3);
                        var7.method2219(var14, class194.field2250);
                    }
                    int var15 = var2.method6840(1);
                    if (var15 == 1) {
                        field602[++field566 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field617[++field622 - 1] = var6;
                }
            }
        }
        method1990(arg0, arg1);
        method2899(arg1);
        for (int var16 = 0; var16 < field622; var16++) {
            int var17 = field617[var16];
            if (field631 != field534[var17].field1167) {
                field534[var17].field1261 = null;
                field534[var17] = null;
            }
        }
        if (field734.field1348 != arg1.field4678) {
            throw new RuntimeException(arg1.field4678 + class93.field1267 + field734.field1348);
        }
        for (int var18 = 0; var18 < field535; var18++) {
            if (field534[field536[var18]] == null) {
                throw new RuntimeException(var18 + class93.field1267 + field535);
            }
        }
    }

    @ObfuscatedName("cs.hs(ZLpc;B)V")
    public static final void method1990(boolean arg0, class439 arg1) {
        while (true) {
            if (arg1.method6842(field734.field1348) >= 27) {
                int var2 = arg1.method6840(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field534[var2] == null) {
                        field534[var2] = new class92();
                        var3 = true;
                    }
                    class92 var4 = field534[var2];
                    field536[++field535 - 1] = var2;
                    var4.field1167 = field631;
                    int var6;
                    int var8;
                    int var10;
                    if (Statics.field4429) {
                        int var5 = field621[arg1.method6840(3)];
                        if (var3) {
                            var4.field1203 = var4.field1139 = var5;
                        }
                        if (arg0) {
                            var6 = arg1.method6840(8);
                            if (var6 > 127) {
                                var6 -= 256;
                            }
                        } else {
                            var6 = arg1.method6840(5);
                            if (var6 > 15) {
                                var6 -= 32;
                            }
                        }
                        var4.field1261 = class179.method4396(arg1.method6840(14));
                        boolean var7 = arg1.method6840(1) == 1;
                        if (var7) {
                            arg1.method6840(32);
                        }
                        var8 = arg1.method6840(1);
                        int var9 = arg1.method6840(1);
                        if (var9 == 1) {
                            field602[++field566 - 1] = var2;
                        }
                        if (arg0) {
                            var10 = arg1.method6840(8);
                            if (var10 > 127) {
                                var10 -= 256;
                            }
                        } else {
                            var10 = arg1.method6840(5);
                            if (var10 > 15) {
                                var10 -= 32;
                            }
                        }
                    } else {
                        boolean var11 = arg1.method6840(1) == 1;
                        if (var11) {
                            arg1.method6840(32);
                        }
                        if (arg0) {
                            var6 = arg1.method6840(8);
                            if (var6 > 127) {
                                var6 -= 256;
                            }
                        } else {
                            var6 = arg1.method6840(5);
                            if (var6 > 15) {
                                var6 -= 32;
                            }
                        }
                        var8 = arg1.method6840(1);
                        if (arg0) {
                            var10 = arg1.method6840(8);
                            if (var10 > 127) {
                                var10 -= 256;
                            }
                        } else {
                            var10 = arg1.method6840(5);
                            if (var10 > 15) {
                                var10 -= 32;
                            }
                        }
                        var4.field1261 = class179.method4396(arg1.method6840(14));
                        int var12 = field621[arg1.method6840(3)];
                        if (var3) {
                            var4.field1203 = var4.field1139 = var12;
                        }
                        int var13 = arg1.method6840(1);
                        if (var13 == 1) {
                            field602[++field566 - 1] = var2;
                        }
                    }
                    var4.field1168 = var4.field1261.field1950;
                    var4.field1205 = var4.field1261.field1948;
                    if (var4.field1205 == 0) {
                        var4.field1139 = 0;
                    }
                    var4.field1146 = var4.field1261.field1945;
                    var4.field1147 = var4.field1261.field1949;
                    var4.field1148 = var4.field1261.field1956;
                    var4.field1149 = var4.field1261.field1955;
                    var4.field1145 = var4.field1261.field1953;
                    var4.field1202 = var4.field1261.field1954;
                    var4.field1137 = var4.field1261.field1973;
                    var4.field1150 = var4.field1261.field1960;
                    var4.field1151 = var4.field1261.field1961;
                    var4.field1184 = var4.field1261.field1962;
                    var4.field1153 = var4.field1261.field1947;
                    var4.field1161 = var4.field1261.field1986;
                    var4.field1155 = var4.field1261.field1965;
                    var4.field1156 = var4.field1261.field1957;
                    var4.field1157 = var4.field1261.field1967;
                    var4.method2220(Statics.field2657.field1194[0] + var10, Statics.field2657.field1208[0] + var6, var8 == 1);
                    continue;
                }
            }
            arg1.method6841();
            return;
        }
    }

    @ObfuscatedName("fp.ha(Lpc;I)V")
    public static final void method2899(class439 arg0) {
        for (int var1 = 0; var1 < field566; var1++) {
            int var2 = field602[var1];
            class92 var3 = field534[var2];
            int var4 = arg0.method7071();
            if (Statics.field4429 && (var4 & 0x8) != 0) {
                int var5 = arg0.method7071();
                var4 += var5 << 8;
            }
            if ((var4 & 0x10) != 0) {
                int var6 = arg0.method7082();
                int var7 = arg0.method7094();
                if (Statics.field4429) {
                    var3.field1174 = arg0.method6924() == 1;
                }
                int var8 = var3.field1182 - (var6 - Statics.field1001 - Statics.field1001) * 64;
                int var9 = var3.field1138 - (var7 - Statics.field477 - Statics.field477) * 64;
                if (var8 != 0 || var9 != 0) {
                    var3.field1173 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field1211 = arg0.method6946();
            }
            if ((var4 & 0x2) != 0) {
                var3.field1183 = arg0.method6932();
                if (var3.field1183 == 65535) {
                    var3.field1183 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var10 = arg0.method7094();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg0.method7071();
                if (var3.field1212 == var10 && var10 != -1) {
                    int var12 = class191.method2497(var10).field2209;
                    if (var12 == 1) {
                        var3.field1179 = 0;
                        var3.field1180 = 0;
                        var3.field1181 = var11;
                        var3.field1187 = 0;
                    }
                    if (var12 == 2) {
                        var3.field1187 = 0;
                    }
                } else if (var10 == -1 || var3.field1212 == -1 || class191.method2497(var10).field2221 >= class191.method2497(var3.field1212).field2221) {
                    var3.field1212 = var10;
                    var3.field1179 = 0;
                    var3.field1180 = 0;
                    var3.field1181 = var11;
                    var3.field1187 = 0;
                    var3.field1201 = var3.field1206;
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field1197 = field631 + arg0.method6954();
                var3.field1198 = field631 + arg0.method6954();
                var3.field1144 = arg0.method7034();
                var3.field1200 = arg0.method6926();
                var3.field1154 = arg0.method6926();
                var3.field1141 = (byte) arg0.method7071();
            }
            if (Statics.field4429 && (var4 & 0x100) != 0 || !Statics.field4429 && (var4 & 0x8) != 0) {
                var3.field1188 = arg0.method6926();
                var3.field1190 = arg0.method6927();
                var3.field1189 = arg0.method6926();
                var3.field1191 = arg0.method6925();
                var3.field1192 = arg0.method7094() + field631;
                var3.field1193 = arg0.method7094() + field631;
                var3.field1140 = arg0.method7082();
                var3.field1206 = 1;
                var3.field1201 = 0;
                var3.field1188 += var3.field1194[0];
                var3.field1190 += var3.field1208[0];
                var3.field1189 += var3.field1194[0];
                var3.field1191 += var3.field1208[0];
            }
            if ((var4 & 0x40) != 0) {
                var3.field1158 = arg0.method7044();
                var3.field1209 = 100;
            }
            if ((var4 & 0x1) != 0) {
                var3.field1207 = arg0.method6954();
                int var13 = arg0.method7079();
                var3.field1152 = var13 >> 16;
                var3.field1186 = (var13 & 0xFFFF) + field631;
                var3.field1210 = 0;
                var3.field1185 = 0;
                if (var3.field1186 > field631) {
                    var3.field1210 = -1;
                }
                if (var3.field1207 == 65535) {
                    var3.field1207 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var14 = arg0.method7071();
                if (var14 > 0) {
                    for (int var15 = 0; var15 < var14; var15++) {
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = -1;
                        int var19 = arg0.method7134();
                        if (var19 == 32767) {
                            var19 = arg0.method7134();
                            var17 = arg0.method7134();
                            var16 = arg0.method7134();
                            var18 = arg0.method7134();
                        } else if (var19 == 32766) {
                            var19 = -1;
                        } else {
                            var17 = arg0.method7134();
                        }
                        int var20 = arg0.method7134();
                        var3.method2054(var19, var17, var16, var18, field631, var20);
                    }
                }
                int var21 = arg0.method6924();
                if (var21 > 0) {
                    for (int var22 = 0; var22 < var21; var22++) {
                        int var23 = arg0.method7134();
                        int var24 = arg0.method7134();
                        if (var24 == 32767) {
                            var3.method2053(var23);
                        } else {
                            int var25 = arg0.method7134();
                            int var26 = arg0.method7071();
                            int var27 = var24 > 0 ? arg0.method6924() : var26;
                            var3.method2052(var23, field631, var24, var25, var26, var27);
                        }
                    }
                }
            }
            if ((var4 & 0x800) != 0) {
                var3.method2218(arg0.method7044());
            }
            if ((var4 & 0x80) != 0) {
                var3.field1261 = class179.method4396(arg0.method6932());
                var3.field1168 = var3.field1261.field1950;
                var3.field1205 = var3.field1261.field1948;
                var3.field1146 = var3.field1261.field1945;
                var3.field1147 = var3.field1261.field1949;
                var3.field1148 = var3.field1261.field1956;
                var3.field1149 = var3.field1261.field1955;
                var3.field1145 = var3.field1261.field1953;
                var3.field1202 = var3.field1261.field1954;
                var3.field1137 = var3.field1261.field1973;
            }
        }
    }

    @ObfuscatedName("ce.hn(Lca;IILgd;I)V")
    public static final void method2405(class85 arg0, int arg1, int arg2, class194 arg3) {
        int var4 = arg0.field1194[0];
        int var5 = arg0.field1208[0];
        int var6 = arg0.method2004();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method2004();
        class193 var8 = Statics.method1784(arg1, arg2);
        class192 var9 = field531[arg0.field1116];
        int[] var10 = field773;
        int[] var11 = field774;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class195.field2258[var12][var13] = 0;
                class195.field2259[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = class195.method4469(var4, var5, var8, var9);
        } else if (var7 == 2) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class195.field2258[var17][var18] = 99;
            class195.field2259[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class195.field2261[var21] = var4;
            int var78 = var21 + 1;
            class195.field2262[var21] = var5;
            int[][] var23 = var9.field2230;
            boolean var28;
            while (true) {
                if (var78 == var22) {
                    Statics.field3349 = var15;
                    Statics.field2256 = var16;
                    var28 = false;
                    break;
                }
                var15 = class195.field2261[var22];
                var16 = class195.field2262[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var9.field2237;
                int var27 = var16 - var9.field2238;
                if (var8.method1037(2, var15, var16, var9)) {
                    Statics.field3349 = var15;
                    Statics.field2256 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class195.field2259[var24][var25] + 1;
                if (var24 > 0 && class195.field2258[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x124010E) == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0) {
                    class195.field2261[var78] = var15 - 1;
                    class195.field2262[var78] = var16;
                    var78 = var78 + 1 & 0xFFF;
                    class195.field2258[var24 - 1][var25] = 2;
                    class195.field2259[var24 - 1][var25] = var29;
                }
                if (var24 < 126 && class195.field2258[var24 + 1][var25] == 0 && (var23[var26 + 2][var27] & 0x1240183) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E0) == 0) {
                    class195.field2261[var78] = var15 + 1;
                    class195.field2262[var78] = var16;
                    var78 = var78 + 1 & 0xFFF;
                    class195.field2258[var24 + 1][var25] = 8;
                    class195.field2259[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class195.field2258[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x124010E) == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0) {
                    class195.field2261[var78] = var15;
                    class195.field2262[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class195.field2258[var24][var25 - 1] = 1;
                    class195.field2259[var24][var25 - 1] = var29;
                }
                if (var25 < 126 && class195.field2258[var24][var25 + 1] == 0 && (var23[var26][var27 + 2] & 0x1240138) == 0 && (var23[var26 + 1][var27 + 2] & 0x12401E0) == 0) {
                    class195.field2261[var78] = var15;
                    class195.field2262[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class195.field2258[var24][var25 + 1] = 4;
                    class195.field2259[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class195.field2258[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27] & 0x124013E) == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26][var27 - 1] & 0x124018F) == 0) {
                    class195.field2261[var78] = var15 - 1;
                    class195.field2262[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class195.field2258[var24 - 1][var25 - 1] = 3;
                    class195.field2259[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 126 && var25 > 0 && class195.field2258[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x124018F) == 0 && (var23[var26 + 2][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 2][var27] & 0x12401E3) == 0) {
                    class195.field2261[var78] = var15 + 1;
                    class195.field2262[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class195.field2258[var24 + 1][var25 - 1] = 9;
                    class195.field2259[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 126 && class195.field2258[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x124013E) == 0 && (var23[var26 - 1][var27 + 2] & 0x1240138) == 0 && (var23[var26][var27 + 2] & 0x12401F8) == 0) {
                    class195.field2261[var78] = var15 - 1;
                    class195.field2262[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class195.field2258[var24 - 1][var25 + 1] = 6;
                    class195.field2259[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 126 && var25 < 126 && class195.field2258[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 2] & 0x12401F8) == 0 && (var23[var26 + 2][var27 + 2] & 0x12401E0) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E3) == 0) {
                    class195.field2261[var78] = var15 + 1;
                    class195.field2262[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class195.field2258[var24 + 1][var25 + 1] = 12;
                    class195.field2259[var24 + 1][var25 + 1] = var29;
                }
            }
            var14 = var28;
        } else {
            int var30 = var4;
            int var31 = var5;
            byte var32 = 64;
            byte var33 = 64;
            int var34 = var4 - var32;
            int var35 = var5 - var33;
            class195.field2258[var32][var33] = 99;
            class195.field2259[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class195.field2261[var36] = var4;
            int var79 = var36 + 1;
            class195.field2262[var36] = var5;
            int[][] var38 = var9.field2230;
            boolean var43;
            label550: while (true) {
                label548: while (true) {
                    int var39;
                    int var40;
                    int var41;
                    int var42;
                    int var44;
                    do {
                        do {
                            do {
                                label525: do {
                                    if (var79 == var37) {
                                        Statics.field3349 = var30;
                                        Statics.field2256 = var31;
                                        var43 = false;
                                        break label550;
                                    }
                                    var30 = class195.field2261[var37];
                                    var31 = class195.field2262[var37];
                                    var37 = var37 + 1 & 0xFFF;
                                    var39 = var30 - var34;
                                    var40 = var31 - var35;
                                    var41 = var30 - var9.field2237;
                                    var42 = var31 - var9.field2238;
                                    if (var8.method1037(var7, var30, var31, var9)) {
                                        Statics.field3349 = var30;
                                        Statics.field2256 = var31;
                                        var43 = true;
                                        break label550;
                                    }
                                    var44 = class195.field2259[var39][var40] + 1;
                                    if (var39 > 0 && class195.field2258[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var7 + var42 - 1] & 0x1240138) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= var7 - 1) {
                                                class195.field2261[var79] = var30 - 1;
                                                class195.field2262[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class195.field2258[var39 - 1][var40] = 2;
                                                class195.field2259[var39 - 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 + var45] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && class195.field2258[var39 + 1][var40] == 0 && (var38[var7 + var41][var42] & 0x1240183) == 0 && (var38[var7 + var41][var7 + var42 - 1] & 0x12401E0) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var7 - 1) {
                                                class195.field2261[var79] = var30 + 1;
                                                class195.field2262[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class195.field2258[var39 + 1][var40] = 8;
                                                class195.field2259[var39 + 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 + var46] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var40 > 0 && class195.field2258[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var7 + var41 - 1][var42 - 1] & 0x1240183) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var7 - 1) {
                                                class195.field2261[var79] = var30;
                                                class195.field2262[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class195.field2258[var39][var40 - 1] = 1;
                                                class195.field2259[var39][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var47][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && class195.field2258[var39][var40 + 1] == 0 && (var38[var41][var7 + var42] & 0x1240138) == 0 && (var38[var7 + var41 - 1][var7 + var42] & 0x12401E0) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var7 - 1) {
                                                class195.field2261[var79] = var30;
                                                class195.field2262[var79] = var31 + 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class195.field2258[var39][var40 + 1] = 4;
                                                class195.field2259[var39][var40 + 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var48][var7 + var42] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var39 > 0 && var40 > 0 && class195.field2258[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var7) {
                                                class195.field2261[var79] = var30 - 1;
                                                class195.field2262[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class195.field2258[var39 - 1][var40 - 1] = 3;
                                                class195.field2259[var39 - 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 - 1 + var49] & 0x124013E) != 0 || (var38[var41 - 1 + var49][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && var40 > 0 && class195.field2258[var39 + 1][var40 - 1] == 0 && (var38[var7 + var41][var42 - 1] & 0x1240183) == 0) {
                                        int var50 = 1;
                                        while (true) {
                                            if (var50 >= var7) {
                                                class195.field2261[var79] = var30 + 1;
                                                class195.field2262[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class195.field2258[var39 + 1][var40 - 1] = 9;
                                                class195.field2259[var39 + 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 - 1 + var50] & 0x12401E3) != 0 || (var38[var41 + var50][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var50++;
                                        }
                                    }
                                    if (var39 > 0 && var40 < 128 - var7 && class195.field2258[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var7 + var42] & 0x1240138) == 0) {
                                        for (int var51 = 1; var51 < var7; var51++) {
                                            if ((var38[var41 - 1][var42 + var51] & 0x124013E) != 0 || (var38[var41 - 1 + var51][var7 + var42] & 0x12401F8) != 0) {
                                                continue label525;
                                            }
                                        }
                                        class195.field2261[var79] = var30 - 1;
                                        class195.field2262[var79] = var31 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class195.field2258[var39 - 1][var40 + 1] = 6;
                                        class195.field2259[var39 - 1][var40 + 1] = var44;
                                    }
                                } while (var39 >= 128 - var7);
                            } while (var40 >= 128 - var7);
                        } while (class195.field2258[var39 + 1][var40 + 1] != 0);
                    } while ((var38[var7 + var41][var7 + var42] & 0x12401E0) != 0);
                    for (int var52 = 1; var52 < var7; var52++) {
                        if ((var38[var41 + var52][var7 + var42] & 0x12401F8) != 0 || (var38[var7 + var41][var42 + var52] & 0x12401E3) != 0) {
                            continue label548;
                        }
                    }
                    class195.field2261[var79] = var30 + 1;
                    class195.field2262[var79] = var31 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class195.field2258[var39 + 1][var40 + 1] = 12;
                    class195.field2259[var39 + 1][var40 + 1] = var44;
                }
            }
            var14 = var43;
        }
        int var71;
        label606: {
            int var53 = var4 - 64;
            int var54 = var5 - 64;
            int var55 = Statics.field3349;
            int var56 = Statics.field2256;
            if (!var14) {
                int var57 = Integer.MAX_VALUE;
                int var58 = Integer.MAX_VALUE;
                byte var59 = 10;
                int var60 = var8.field2247;
                int var61 = var8.field2244;
                int var62 = var8.field2245;
                int var63 = var8.field2246;
                for (int var64 = var60 - var59; var64 <= var59 + var60; var64++) {
                    for (int var65 = var61 - var59; var65 <= var59 + var61; var65++) {
                        int var66 = var64 - var53;
                        int var67 = var65 - var54;
                        if (var66 >= 0 && var67 >= 0 && var66 < 128 && var67 < 128 && class195.field2259[var66][var67] < 100) {
                            int var68 = 0;
                            if (var64 < var60) {
                                var68 = var60 - var64;
                            } else if (var64 > var60 + var62 - 1) {
                                var68 = var64 - (var60 + var62 - 1);
                            }
                            int var69 = 0;
                            if (var65 < var61) {
                                var69 = var61 - var65;
                            } else if (var65 > var61 + var63 - 1) {
                                var69 = var65 - (var61 + var63 - 1);
                            }
                            int var70 = var68 * var68 + var69 * var69;
                            if (var70 < var57 || var57 == var70 && class195.field2259[var66][var67] < var58) {
                                var57 = var70;
                                var58 = class195.field2259[var66][var67];
                                var55 = var64;
                                var56 = var65;
                            }
                        }
                    }
                }
                if (var57 == Integer.MAX_VALUE) {
                    var71 = -1;
                    break label606;
                }
            }
            if (var4 == var55 && var5 == var56) {
                var10[0] = var55;
                var11[0] = var56;
                var71 = 0;
            } else {
                byte var72 = 0;
                class195.field2261[var72] = var55;
                int var80 = var72 + 1;
                class195.field2262[var72] = var56;
                int var73;
                int var74 = var73 = class195.field2258[var55 - var53][var56 - var54];
                while (var4 != var55 || var5 != var56) {
                    if (var73 != var74) {
                        var73 = var74;
                        class195.field2261[var80] = var55;
                        class195.field2262[var80++] = var56;
                    }
                    if ((var74 & 0x2) != 0) {
                        var55++;
                    } else if ((var74 & 0x8) != 0) {
                        var55--;
                    }
                    if ((var74 & 0x1) != 0) {
                        var56++;
                    } else if ((var74 & 0x4) != 0) {
                        var56--;
                    }
                    var74 = class195.field2258[var55 - var53][var56 - var54];
                }
                int var75 = 0;
                while (var80-- > 0) {
                    var10[var75] = class195.field2261[var80];
                    var11[var75++] = class195.field2262[var80];
                    if (var75 >= var10.length) {
                        break;
                    }
                }
                var71 = var75;
            }
        }
        int var76 = var71;
        if (var71 >= 1) {
            for (int var77 = 0; var77 < var76 - 1; var77++) {
                arg0.method2008(field773[var77], field774[var77], arg3);
            }
        }
    }

    @ObfuscatedName("ct.ig(I)V")
    public static void method2217() {
        field632 = 0;
        field498 = false;
    }

    @ObfuscatedName("f.iy(I)V")
    public static void method260() {
        method2217();
        field637[0] = class309.field3908;
        field638[0] = "";
        field635[0] = 1006;
        field639[0] = false;
        field632 = 1;
    }

    @ObfuscatedName("gh.ix(I)Z")
    public static final boolean method3493() {
        return field498;
    }

    @ObfuscatedName("ej.ip(IIIII)V")
    public static final void method2662(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field489; var4++) {
            if (field707[var4] + field592[var4] > arg0 && field707[var4] < arg0 + arg2 && field710[var4] + field708[var4] > arg1 && field708[var4] < arg1 + arg3) {
                field653[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ik(I)V")
    public final void method1073() {
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
                    int var6 = field505[var2];
                    field505[var2] = field505[var2 + 1];
                    field505[var2 + 1] = var6;
                    int var7 = field634[var2];
                    field634[var2] = field634[var2 + 1];
                    field634[var2 + 1] = var7;
                    int var8 = field717[var2];
                    field717[var2] = field717[var2 + 1];
                    field717[var2 + 1] = var8;
                    boolean var9 = field639[var2];
                    field639[var2] = field639[var2 + 1];
                    field639[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field154 != null || field668 != null) {
            return;
        }
        int var21;
        int var24;
        int var25;
        label218: {
            int var10 = class33.field238;
            if (field498) {
                if (var10 != 1 && (Statics.field914 || var10 != 4)) {
                    int var11 = class33.field227;
                    int var12 = class33.field228;
                    if (var11 < Statics.field1408 - 10 || var11 > Statics.field149 + Statics.field1408 + 10 || var12 < Statics.field4590 - 10 || var12 > Statics.field4590 + Statics.field29 + 10) {
                        field498 = false;
                        method2662(Statics.field1408, Statics.field4590, Statics.field149, Statics.field29);
                    }
                }
                if (var10 == 1 || !Statics.field914 && var10 == 4) {
                    int var13 = Statics.field1408;
                    int var14 = Statics.field4590;
                    int var15 = Statics.field149;
                    int var16 = class33.field235;
                    int var17 = class33.field240;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field632; var19++) {
                        int var20 = (field632 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1) {
                        method3903(var18);
                    }
                    field498 = false;
                    method2662(Statics.field1408, Statics.field4590, Statics.field149, Statics.field29);
                }
            } else {
                var21 = field632 - 1;
                if ((var10 == 1 || !Statics.field914 && var10 == 4) && var21 >= 0) {
                    int var23 = field635[var21];
                    if (var23 == 39 || var23 == 40 || var23 == 41 || var23 == 42 || var23 == 43 || var23 == 33 || var23 == 34 || var23 == 35 || var23 == 36 || var23 == 37 || var23 == 38 || var23 == 1005) {
                        var24 = field505[var21];
                        var25 = field634[var21];
                        class295 var26 = class295.method2248(var25);
                        int var27 = method2406(var26);
                        boolean var28 = (var27 >> 28 & 0x1) != 0;
                        if (var28) {
                            break label218;
                        }
                        int var29 = method2406(var26);
                        boolean var30 = (var29 >> 29 & 0x1) != 0;
                        if (var30) {
                            break label218;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field914 && var10 == 4) && this.method1156()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field914 && var10 == 4) && field632 > 0) {
                    method3903(var21);
                }
                if (var10 == 2 && field632 > 0) {
                    this.method1496(class33.field235, class33.field240);
                }
            }
            return;
        }
        if (Statics.field154 != null && !field605 && field632 > 0 && !this.method1156()) {
            int var31 = field478;
            int var32 = field517;
            class67 var33 = Statics.field1472;
            if (var33 != null) {
                method5399(var33.field870, var33.field865, var33.field866, var33.field864, var33.field868, var33.field868, var31, var32);
            }
            Statics.field1472 = null;
        }
        field605 = false;
        field606 = 0;
        if (Statics.field154 != null) {
            method5299(Statics.field154);
        }
        Statics.field154 = class295.method2248(var25);
        field601 = var24;
        field478 = class33.field235;
        field517 = class33.field240;
        if (var21 >= 0) {
            method2291(var21);
        }
        method5299(Statics.field154);
    }

    @ObfuscatedName("client.ih(B)Z")
    public final boolean method1156() {
        int var1 = field632 - 1;
        return (field630 == 1 && field632 > 2 || method2404(var1)) && !field639[var1];
    }

    @ObfuscatedName("client.in(IIB)V")
    public final void method1496(int arg0, int arg1) {
        method2594(arg0, arg1);
        int var3 = arg0 - field757;
        int var4 = arg1 - field758;
        Statics.field1926.method3773(Statics.field1577, var3, var4, false);
        field498 = true;
    }

    @ObfuscatedName("da.iw(III)V")
    public static void method2594(int arg0, int arg1) {
        int var2 = Statics.field980.method5723(class309.field3816);
        for (int var3 = 0; var3 < field632; var3++) {
            class350 var4 = Statics.field980;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field638[var3].length() > 0) {
                var5 = field637[var3] + class309.field3656 + field638[var3];
            } else {
                var5 = field637[var3];
            }
            int var6 = var4.method5723(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field632 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field841) {
            var8 = Statics.field841 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field4663) {
            var9 = Statics.field4663 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field1408 = var8;
        Statics.field4590 = var9;
        Statics.field149 = var2;
        Statics.field29 = field632 * 15 + 22;
    }

    @ObfuscatedName("ce.id(II)Z")
    public static final boolean method2404(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field635[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("gx.ie(IB)V")
    public static final void method3903(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field505[arg0];
        int var2 = field634[arg0];
        int var3 = field635[arg0];
        int var4 = field717[arg0];
        String var5 = field637[arg0];
        String var6 = field638[arg0];
        method5399(var1, var2, var3, var4, var5, var6, class33.field235, class33.field240);
    }

    @ObfuscatedName("lz.iq(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method5399(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1005) {
            class295 var8 = class295.method2248(arg1);
            if (var8 == null || var8.field3530[arg0] < 100000) {
                class265 var9 = class265.method4070(class263.field2987, field734.field1344);
                var9.field3075.method6877(arg3);
                field734.method2362(var9);
            } else {
                class99.method4522(27, "", var8.field3530[arg0] + " x " + class189.method2903(arg3).field2183);
            }
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 3) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var10 = class265.method4070(class263.field2991, field734.field1344);
            var10.field3075.method6974(class24.field131[82] ? 1 : 0);
            var10.field3075.method6928(arg3);
            var10.field3075.method7019(Statics.field1001 + arg0);
            var10.field3075.method6929(Statics.field477 + arg1);
            field734.method2362(var10);
        }
        if (arg2 == 12) {
            class92 var11 = field534[arg3];
            if (var11 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var12 = class265.method4070(class263.field2978, field734.field1344);
                var12.field3075.method6974(class24.field131[82] ? 1 : 0);
                var12.field3075.method7019(arg3);
                field734.method2362(var12);
            }
        }
        if (arg2 == 31) {
            class265 var13 = class265.method4070(class263.field2993, field734.field1344);
            var13.field3075.method6941(arg1);
            var13.field3075.method6928(arg3);
            var13.field3075.method7019(Statics.field280);
            var13.field3075.method6943(Statics.field106);
            var13.field3075.method6928(arg0);
            var13.field3075.method6929(Statics.field2028);
            field734.method2362(var13);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 22) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var14 = class265.method4070(class263.field2979, field734.field1344);
            var14.field3075.method7065(class24.field131[82] ? 1 : 0);
            var14.field3075.method6928(arg3);
            var14.field3075.method6929(Statics.field477 + arg1);
            var14.field3075.method7019(Statics.field1001 + arg0);
            field734.method2362(var14);
        }
        if (arg2 == 46) {
            class85 var15 = field609[arg3];
            if (var15 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var16 = class265.method4070(class263.field3004, field734.field1344);
                var16.field3075.method6974(class24.field131[82] ? 1 : 0);
                var16.field3075.method6877(arg3);
                field734.method2362(var16);
            }
        }
        if (arg2 == 5) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var17 = class265.method4070(class263.field3042, field734.field1344);
            var17.field3075.method7019(Statics.field477 + arg1);
            var17.field3075.method7065(class24.field131[82] ? 1 : 0);
            var17.field3075.method6877(Statics.field1001 + arg0);
            var17.field3075.method6928(arg3);
            field734.method2362(var17);
        }
        if (arg2 == 37) {
            class265 var18 = class265.method4070(class263.field2980, field734.field1344);
            var18.field3075.method6928(arg0);
            var18.field3075.method6877(arg3);
            var18.field3075.method6879(arg1);
            field734.method2362(var18);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 48) {
            class85 var19 = field609[arg3];
            if (var19 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var20 = class265.method4070(class263.field2996, field734.field1344);
                var20.field3075.method6877(arg3);
                var20.field3075.method6974(class24.field131[82] ? 1 : 0);
                field734.method2362(var20);
            }
        }
        if (arg2 == 18) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var21 = class265.method4070(class263.field3014, field734.field1344);
            var21.field3075.method6928(Statics.field1001 + arg0);
            var21.field3075.method6929(arg3);
            var21.field3075.method7019(Statics.field477 + arg1);
            var21.field3075.method6876(class24.field131[82] ? 1 : 0);
            field734.method2362(var21);
        }
        if (arg2 == 29) {
            class265 var22 = class265.method4070(class263.field3015, field734.field1344);
            var22.field3075.method6879(arg1);
            field734.method2362(var22);
            class295 var23 = class295.method2248(arg1);
            if (var23 != null && var23.field3455 != null && var23.field3455[0][0] == 5) {
                int var24 = var23.field3455[0][1];
                if (class289.field3348[var24] != var23.field3497[0]) {
                    class289.field3348[var24] = var23.field3497[0];
                    method5317(var24);
                }
            }
        }
        if (arg2 == 1001) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var25 = class265.method4070(class263.field2995, field734.field1344);
            var25.field3075.method6877(Statics.field477 + arg1);
            var25.field3075.method6877(arg3);
            var25.field3075.method7019(Statics.field1001 + arg0);
            var25.field3075.method6876(class24.field131[82] ? 1 : 0);
            field734.method2362(var25);
        }
        if (arg2 == 2) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var26 = class265.method4070(class263.field3058, field734.field1344);
            var26.field3075.method6929(Statics.field1001 + arg0);
            var26.field3075.method6877(Statics.field477 + arg1);
            var26.field3075.method6929(field652);
            var26.field3075.method6929(field651);
            var26.field3075.method7019(arg3);
            var26.field3075.method7065(class24.field131[82] ? 1 : 0);
            var26.field3075.method6942(Statics.field4004);
            field734.method2362(var26);
        }
        if (arg2 == 47) {
            class85 var27 = field609[arg3];
            if (var27 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var28 = class265.method4070(class263.field2963, field734.field1344);
                var28.field3075.method6876(class24.field131[82] ? 1 : 0);
                var28.field3075.method7019(arg3);
                field734.method2362(var28);
            }
        }
        if (arg2 == 45) {
            class85 var29 = field609[arg3];
            if (var29 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var30 = class265.method4070(class263.field2976, field734.field1344);
                var30.field3075.method6928(arg3);
                var30.field3075.method6920(class24.field131[82] ? 1 : 0);
                field734.method2362(var30);
            }
        }
        if (arg2 == 33) {
            class265 var31 = class265.method4070(class263.field2972, field734.field1344);
            var31.field3075.method6877(arg0);
            var31.field3075.method6877(arg3);
            var31.field3075.method6942(arg1);
            field734.method2362(var31);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 6) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var32 = class265.method4070(class263.field3000, field734.field1344);
            var32.field3075.method6877(arg3);
            var32.field3075.method6877(Statics.field477 + arg1);
            var32.field3075.method6877(Statics.field1001 + arg0);
            var32.field3075.method6920(class24.field131[82] ? 1 : 0);
            field734.method2362(var32);
        }
        if (arg2 == 25) {
            class295 var33 = class295.method1035(arg1, arg0);
            if (var33 != null) {
                method4639();
                method2251(arg1, arg0, class296.method4455(method2406(var33)), var33.field3531);
                field726 = 0;
                field686 = method6103(var33);
                if (field686 == null) {
                    field686 = class309.field3681;
                }
                if (var33.field3394) {
                    field503 = var33.field3479 + class93.method2957(16777215);
                } else {
                    field503 = class93.method2957(65280) + var33.field3527 + class93.method2957(16777215);
                }
            }
            return;
        }
        if (arg2 == 21) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var34 = class265.method4070(class263.field2977, field734.field1344);
            var34.field3075.method6974(class24.field131[82] ? 1 : 0);
            var34.field3075.method6928(Statics.field1001 + arg0);
            var34.field3075.method6877(arg3);
            var34.field3075.method6877(Statics.field477 + arg1);
            field734.method2362(var34);
        }
        if (arg2 == 32) {
            class265 var35 = class265.method4070(class263.field3026, field734.field1344);
            var35.field3075.method6928(arg0);
            var35.field3075.method6877(field651);
            var35.field3075.method6942(arg1);
            var35.field3075.method6942(Statics.field4004);
            var35.field3075.method6928(arg3);
            field734.method2362(var35);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 51) {
            class85 var36 = field609[arg3];
            if (var36 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var37 = class265.method4070(class263.field3020, field734.field1344);
                var37.field3075.method6920(class24.field131[82] ? 1 : 0);
                var37.field3075.method7019(arg3);
                field734.method2362(var37);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field3129.method6465(arg2, arg3, new class290(arg0), new class290(arg1));
        }
        if (arg2 == 58) {
            class295 var38 = class295.method1035(arg1, arg0);
            if (var38 != null) {
                class265 var39 = class265.method4070(class263.field2964, field734.field1344);
                var39.field3075.method6943(Statics.field4004);
                var39.field3075.method6941(arg1);
                var39.field3075.method6877(var38.field3531);
                var39.field3075.method6929(field651);
                var39.field3075.method6928(arg0);
                var39.field3075.method7019(field652);
                field734.method2362(var39);
            }
        }
        if (arg2 == 20) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var40 = class265.method4070(class263.field2998, field734.field1344);
            var40.field3075.method6877(Statics.field477 + arg1);
            var40.field3075.method6974(class24.field131[82] ? 1 : 0);
            var40.field3075.method6929(Statics.field1001 + arg0);
            var40.field3075.method7019(arg3);
            field734.method2362(var40);
        }
        if (arg2 == 42) {
            class265 var41 = class265.method4070(class263.field2962, field734.field1344);
            var41.field3075.method7019(arg0);
            var41.field3075.method6941(arg1);
            var41.field3075.method6928(arg3);
            field734.method2362(var41);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 11) {
            class92 var42 = field534[arg3];
            if (var42 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var43 = class265.method4070(class263.field3037, field734.field1344);
                var43.field3075.method6920(class24.field131[82] ? 1 : 0);
                var43.field3075.method7019(arg3);
                field734.method2362(var43);
            }
        }
        if (arg2 == 1) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var44 = class265.method4070(class263.field2982, field734.field1344);
            var44.field3075.method6879(Statics.field106);
            var44.field3075.method6928(Statics.field477 + arg1);
            var44.field3075.method6929(Statics.field1001 + arg0);
            var44.field3075.method7019(Statics.field2028);
            var44.field3075.method7065(class24.field131[82] ? 1 : 0);
            var44.field3075.method7019(arg3);
            var44.field3075.method6928(Statics.field280);
            field734.method2362(var44);
        }
        if (arg2 == 1002) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            class265 var45 = class265.method4070(class263.field2951, field734.field1344);
            var45.field3075.method6877(arg3);
            field734.method2362(var45);
        }
        if (arg2 == 39) {
            class265 var46 = class265.method4070(class263.field3025, field734.field1344);
            var46.field3075.method6877(arg3);
            var46.field3075.method6929(arg0);
            var46.field3075.method6943(arg1);
            field734.method2362(var46);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 43) {
            class265 var47 = class265.method4070(class263.field2967, field734.field1344);
            var47.field3075.method7019(arg0);
            var47.field3075.method6928(arg3);
            var47.field3075.method6879(arg1);
            field734.method2362(var47);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 1004) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            class265 var48 = class265.method4070(class263.field2987, field734.field1344);
            var48.field3075.method6877(arg3);
            field734.method2362(var48);
        }
        if (arg2 == 17) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var49 = class265.method4070(class263.field3011, field734.field1344);
            var49.field3075.method6876(class24.field131[82] ? 1 : 0);
            var49.field3075.method6929(field652);
            var49.field3075.method7019(field651);
            var49.field3075.method6877(arg3);
            var49.field3075.method7019(Statics.field477 + arg1);
            var49.field3075.method6879(Statics.field4004);
            var49.field3075.method6877(Statics.field1001 + arg0);
            field734.method2362(var49);
        }
        if (arg2 == 30 && field661 == null) {
            method5114(arg1, arg0);
            field661 = class295.method1035(arg1, arg0);
            method5299(field661);
        }
        if (arg2 == 13) {
            class92 var50 = field534[arg3];
            if (var50 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var51 = class265.method4070(class263.field3047, field734.field1344);
                var51.field3075.method6928(arg3);
                var51.field3075.method6920(class24.field131[82] ? 1 : 0);
                field734.method2362(var51);
            }
        }
        if (arg2 == 10) {
            class92 var52 = field534[arg3];
            if (var52 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var53 = class265.method4070(class263.field3031, field734.field1344);
                var53.field3075.method6928(arg3);
                var53.field3075.method6920(class24.field131[82] ? 1 : 0);
                field734.method2362(var53);
            }
        }
        if (arg2 == 35) {
            class265 var54 = class265.method4070(class263.field3051, field734.field1344);
            var54.field3075.method6942(arg1);
            var54.field3075.method6929(arg0);
            var54.field3075.method6929(arg3);
            field734.method2362(var54);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 1003) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            class92 var55 = field534[arg3];
            if (var55 != null) {
                class179 var56 = var55.field1261;
                if (var56.field1982 != null) {
                    var56 = var56.method3119();
                }
                if (var56 != null) {
                    class265 var57 = class265.method4070(class263.field3017, field734.field1344);
                    var57.field3075.method6928(var56.field1974);
                    field734.method2362(var57);
                }
            }
        }
        if (arg2 == 14) {
            class85 var58 = field609[arg3];
            if (var58 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var59 = class265.method4070(class263.field3008, field734.field1344);
                var59.field3075.method6929(Statics.field280);
                var59.field3075.method7019(arg3);
                var59.field3075.method6879(Statics.field106);
                var59.field3075.method6876(class24.field131[82] ? 1 : 0);
                var59.field3075.method7019(Statics.field2028);
                field734.method2362(var59);
            }
        }
        if (arg2 == 38) {
            method4639();
            class295 var60 = class295.method2248(arg1);
            field726 = 1;
            Statics.field280 = arg0;
            Statics.field106 = arg1;
            Statics.field2028 = arg3;
            method5299(var60);
            field649 = class93.method2957(16748608) + class189.method2903(arg3).field2183 + class93.method2957(16777215);
            if (field649 == null) {
                field649 = class309.field3681;
            }
            return;
        }
        if (arg2 == 24) {
            class295 var61 = class295.method2248(arg1);
            if (var61 != null) {
                boolean var62 = true;
                if (var61.field3399 > 0) {
                    var62 = method592(var61);
                }
                if (var62) {
                    class265 var63 = class265.method4070(class263.field3015, field734.field1344);
                    var63.field3075.method6879(arg1);
                    field734.method2362(var63);
                }
            }
        }
        if (arg2 == 15) {
            class85 var64 = field609[arg3];
            if (var64 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var65 = class265.method4070(class263.field3023, field734.field1344);
                var65.field3075.method6879(Statics.field4004);
                var65.field3075.method6974(class24.field131[82] ? 1 : 0);
                var65.field3075.method6928(field652);
                var65.field3075.method6877(field651);
                var65.field3075.method7019(arg3);
                field734.method2362(var65);
            }
        }
        if (arg2 == 28) {
            class265 var66 = class265.method4070(class263.field3015, field734.field1344);
            var66.field3075.method6879(arg1);
            field734.method2362(var66);
            class295 var67 = class295.method2248(arg1);
            if (var67 != null && var67.field3455 != null && var67.field3455[0][0] == 5) {
                int var68 = var67.field3455[0][1];
                class289.field3348[var68] = 1 - class289.field3348[var68];
                method5317(var68);
            }
        }
        if (arg2 == 34) {
            class265 var69 = class265.method4070(class263.field3046, field734.field1344);
            var69.field3075.method6929(arg3);
            var69.field3075.method6879(arg1);
            var69.field3075.method7019(arg0);
            field734.method2362(var69);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 16) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var70 = class265.method4070(class263.field2997, field734.field1344);
            var70.field3075.method7019(Statics.field1001 + arg0);
            var70.field3075.method6928(Statics.field477 + arg1);
            var70.field3075.method7019(Statics.field2028);
            var70.field3075.method6941(Statics.field106);
            var70.field3075.method7065(class24.field131[82] ? 1 : 0);
            var70.field3075.method7019(Statics.field280);
            var70.field3075.method6929(arg3);
            field734.method2362(var70);
        }
        if (arg2 == 50) {
            class85 var71 = field609[arg3];
            if (var71 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var72 = class265.method4070(class263.field2981, field734.field1344);
                var72.field3075.method6974(class24.field131[82] ? 1 : 0);
                var72.field3075.method7019(arg3);
                field734.method2362(var72);
            }
        }
        if (arg2 == 4) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var73 = class265.method4070(class263.field3050, field734.field1344);
            var73.field3075.method7019(arg3);
            var73.field3075.method6974(class24.field131[82] ? 1 : 0);
            var73.field3075.method6928(Statics.field477 + arg1);
            var73.field3075.method6928(Statics.field1001 + arg0);
            field734.method2362(var73);
        }
        if (arg2 == 26) {
            method4907();
        }
        if (arg2 == 7) {
            class92 var74 = field534[arg3];
            if (var74 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var75 = class265.method4070(class263.field2986, field734.field1344);
                var75.field3075.method6974(class24.field131[82] ? 1 : 0);
                var75.field3075.method6877(Statics.field2028);
                var75.field3075.method6879(Statics.field106);
                var75.field3075.method6877(arg3);
                var75.field3075.method6877(Statics.field280);
                field734.method2362(var75);
            }
        }
        if (arg2 == 9) {
            class92 var76 = field534[arg3];
            if (var76 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var77 = class265.method4070(class263.field3005, field734.field1344);
                var77.field3075.method6929(arg3);
                var77.field3075.method6876(class24.field131[82] ? 1 : 0);
                field734.method2362(var77);
            }
        }
        if (arg2 == 41) {
            class265 var78 = class265.method4070(class263.field3019, field734.field1344);
            var78.field3075.method7019(arg0);
            var78.field3075.method6929(arg3);
            var78.field3075.method6879(arg1);
            field734.method2362(var78);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 36) {
            class265 var79 = class265.method4070(class263.field3029, field734.field1344);
            var79.field3075.method7019(arg3);
            var79.field3075.method7019(arg0);
            var79.field3075.method6879(arg1);
            field734.method2362(var79);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class295 var80 = class295.method1035(arg1, arg0);
            if (var80 != null) {
                method2871(arg3, arg1, arg0, var80.field3531, arg5);
            }
        }
        if (arg2 == 8) {
            class92 var81 = field534[arg3];
            if (var81 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var82 = class265.method4070(class263.field2985, field734.field1344);
                var82.field3075.method7019(arg3);
                var82.field3075.method6877(field652);
                var82.field3075.method6920(class24.field131[82] ? 1 : 0);
                var82.field3075.method6929(field651);
                var82.field3075.method6941(Statics.field4004);
                field734.method2362(var82);
            }
        }
        if (arg2 == 40) {
            class265 var83 = class265.method4070(class263.field3009, field734.field1344);
            var83.field3075.method6929(arg3);
            var83.field3075.method6929(arg0);
            var83.field3075.method6943(arg1);
            field734.method2362(var83);
            field599 = 0;
            Statics.field1992 = class295.method2248(arg1);
            field600 = arg0;
        }
        if (arg2 == 23) {
            if (field498) {
                Statics.field1926.method3761();
            } else {
                Statics.field1926.method3773(Statics.field1577, arg0, arg1, true);
            }
        }
        if (arg2 == 44) {
            class85 var84 = field609[arg3];
            if (var84 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var85 = class265.method4070(class263.field2966, field734.field1344);
                var85.field3075.method6877(arg3);
                var85.field3075.method7065(class24.field131[82] ? 1 : 0);
                field734.method2362(var85);
            }
        }
        if (arg2 == 19) {
            field594 = arg6;
            field595 = arg7;
            field537 = 2;
            field596 = 0;
            field731 = arg0;
            field732 = arg1;
            class265 var86 = class265.method4070(class263.field2988, field734.field1344);
            var86.field3075.method6920(class24.field131[82] ? 1 : 0);
            var86.field3075.method6928(Statics.field1001 + arg0);
            var86.field3075.method7019(Statics.field477 + arg1);
            var86.field3075.method6929(arg3);
            field734.method2362(var86);
        }
        if (arg2 == 49) {
            class85 var87 = field609[arg3];
            if (var87 != null) {
                field594 = arg6;
                field595 = arg7;
                field537 = 2;
                field596 = 0;
                field731 = arg0;
                field732 = arg1;
                class265 var88 = class265.method4070(class263.field2970, field734.field1344);
                var88.field3075.method7019(arg3);
                var88.field3075.method7065(class24.field131[82] ? 1 : 0);
                field734.method2362(var88);
            }
        }
        if (field726 != 0) {
            field726 = 0;
            method5299(class295.method2248(Statics.field106));
        }
        if (field500) {
            method4639();
        }
        if (Statics.field1992 != null && field599 == 0) {
            method5299(Statics.field1992);
        }
    }

    @ObfuscatedName("bm.ii(ILjava/lang/String;I)V")
    public static void method1859(int arg0, String arg1) {
        int var2 = class97.field1305;
        int[] var3 = class97.field1306;
        boolean var4 = false;
        class461 var5 = new class461(arg1, Statics.field4426);
        for (int var6 = 0; var6 < var2; var6++) {
            class85 var7 = field609[var3[var6]];
            if (var7 != null && Statics.field2657 != var7 && var7.field1100 != null && var7.field1100.equals(var5)) {
                if (arg0 == 1) {
                    class265 var8 = class265.method4070(class263.field2966, field734.field1344);
                    var8.field3075.method6877(var3[var6]);
                    var8.field3075.method7065(0);
                    field734.method2362(var8);
                } else if (arg0 == 4) {
                    class265 var9 = class265.method4070(class263.field2963, field734.field1344);
                    var9.field3075.method6876(0);
                    var9.field3075.method7019(var3[var6]);
                    field734.method2362(var9);
                } else if (arg0 == 6) {
                    class265 var10 = class265.method4070(class263.field2970, field734.field1344);
                    var10.field3075.method7019(var3[var6]);
                    var10.field3075.method7065(0);
                    field734.method2362(var10);
                } else if (arg0 == 7) {
                    class265 var11 = class265.method4070(class263.field2981, field734.field1344);
                    var11.field3075.method6974(0);
                    var11.field3075.method7019(var3[var6]);
                    field734.method2362(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method4522(4, "", class309.field3812 + arg1);
        }
    }

    @ObfuscatedName("cf.it(IIIII)V")
    public static void method2251(int arg0, int arg1, int arg2, int arg3) {
        class295 var4 = class295.method1035(arg0, arg1);
        if (var4 != null && var4.field3443 != null) {
            class81 var5 = new class81();
            var5.field1047 = var4;
            var5.field1062 = var4.field3443;
            class64.method2749(var5);
        }
        field652 = arg3;
        field500 = true;
        Statics.field4004 = arg0;
        field651 = arg1;
        Statics.field1430 = arg2;
        method5299(var4);
    }

    @ObfuscatedName("jp.if(I)V")
    public static void method4639() {
        if (!field500) {
            return;
        }
        class295 var0 = class295.method1035(Statics.field4004, field651);
        if (var0 != null && var0.field3500 != null) {
            class81 var1 = new class81();
            var1.field1047 = var0;
            var1.field1062 = var0.field3500;
            class64.method2749(var1);
        }
        field652 = -1;
        field500 = false;
        method5299(var0);
    }

    @ObfuscatedName("kj.iv(III)V")
    public static void method5114(int arg0, int arg1) {
        class265 var2 = class265.method4070(class263.field2968, field734.field1344);
        var2.field3075.method6942(arg0);
        var2.field3075.method6929(arg1);
        field734.method2362(var2);
    }

    @ObfuscatedName("fs.is(IIIILjava/lang/String;I)V")
    public static void method2871(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class295 var5 = class295.method1035(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3506 != null) {
            class81 var6 = new class81();
            var6.field1047 = var5;
            var6.field1058 = arg0;
            var6.field1054 = arg4;
            var6.field1062 = var5.field3506;
            class64.method2749(var6);
        }
        boolean var7 = true;
        if (var5.field3399 > 0) {
            var7 = method592(var5);
        }
        if (!var7 || !class296.method1785(method2406(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class265 var8 = class265.method4070(class263.field3007, field734.field1344);
            var8.field3075.method6879(arg1);
            var8.field3075.method6877(arg2);
            var8.field3075.method6877(arg3);
            field734.method2362(var8);
        }
        if (arg0 == 2) {
            class265 var9 = class265.method4070(class263.field3033, field734.field1344);
            var9.field3075.method6879(arg1);
            var9.field3075.method6877(arg2);
            var9.field3075.method6877(arg3);
            field734.method2362(var9);
        }
        if (arg0 == 3) {
            class265 var10 = class265.method4070(class263.field3012, field734.field1344);
            var10.field3075.method6879(arg1);
            var10.field3075.method6877(arg2);
            var10.field3075.method6877(arg3);
            field734.method2362(var10);
        }
        if (arg0 == 4) {
            class265 var11 = class265.method4070(class263.field2957, field734.field1344);
            var11.field3075.method6879(arg1);
            var11.field3075.method6877(arg2);
            var11.field3075.method6877(arg3);
            field734.method2362(var11);
        }
        if (arg0 == 5) {
            class265 var12 = class265.method4070(class263.field2961, field734.field1344);
            var12.field3075.method6879(arg1);
            var12.field3075.method6877(arg2);
            var12.field3075.method6877(arg3);
            field734.method2362(var12);
        }
        if (arg0 == 6) {
            class265 var13 = class265.method4070(class263.field2969, field734.field1344);
            var13.field3075.method6879(arg1);
            var13.field3075.method6877(arg2);
            var13.field3075.method6877(arg3);
            field734.method2362(var13);
        }
        if (arg0 == 7) {
            class265 var14 = class265.method4070(class263.field3003, field734.field1344);
            var14.field3075.method6879(arg1);
            var14.field3075.method6877(arg2);
            var14.field3075.method6877(arg3);
            field734.method2362(var14);
        }
        if (arg0 == 8) {
            class265 var15 = class265.method4070(class263.field2990, field734.field1344);
            var15.field3075.method6879(arg1);
            var15.field3075.method6877(arg2);
            var15.field3075.method6877(arg3);
            field734.method2362(var15);
        }
        if (arg0 == 9) {
            class265 var16 = class265.method4070(class263.field3016, field734.field1344);
            var16.field3075.method6879(arg1);
            var16.field3075.method6877(arg2);
            var16.field3075.method6877(arg3);
            field734.method2362(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class265 var17 = class265.method4070(class263.field3044, field734.field1344);
        var17.field3075.method6879(arg1);
        var17.field3075.method6877(arg2);
        var17.field3075.method6877(arg3);
        field734.method2362(var17);
    }

    @ObfuscatedName("bq.ia(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1834(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3093(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("fu.iu(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method3093(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field498 || field632 >= 500) {
            return;
        }
        field637[field632] = arg0;
        field638[field632] = arg1;
        field635[field632] = arg2;
        field717[field632] = arg3;
        field505[field632] = arg4;
        field634[field632] = arg5;
        field639[field632] = arg6;
        field632++;
    }

    @ObfuscatedName("it.ic(IIIII)V")
    public static final void method4520(int arg0, int arg1, int arg2, int arg3) {
        if (field726 == 0 && !field500) {
            method1834(class309.field3934, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class213.method2498(); var8++) {
            long var9 = class213.method2660(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class213.method229(class213.field2626[var8]);
                int var12 = var11;
                int var13 = class213.method2649(var8);
                int var14 = class213.method5308(var8);
                int var15 = class213.method2942(class213.field2626[var8]);
                int var16 = var15;
                if (var14 == 2 && Statics.field1926.method3799(Statics.field1577, var11, var13, var9) >= 0) {
                    class188 var17 = class188.method1989(var15);
                    if (var17.field2092 != null) {
                        var17 = var17.method3299();
                    }
                    if (var17 == null) {
                        continue;
                    }
                    if (field726 == 1) {
                        method1834(class309.field3813, field649 + " " + class93.field1269 + " " + class93.method2957(65535) + var17.field2085, 1, var15, var11, var13);
                    } else if (!field500) {
                        String[] var18 = var17.field2107;
                        if (var18 != null) {
                            for (int var19 = 4; var19 >= 0; var19--) {
                                if (var18[var19] != null) {
                                    short var20 = 0;
                                    if (var19 == 0) {
                                        var20 = 3;
                                    }
                                    if (var19 == 1) {
                                        var20 = 4;
                                    }
                                    if (var19 == 2) {
                                        var20 = 5;
                                    }
                                    if (var19 == 3) {
                                        var20 = 6;
                                    }
                                    if (var19 == 4) {
                                        var20 = 1001;
                                    }
                                    method1834(var18[var19], class93.method2957(65535) + var17.field2085, var20, var16, var12, var13);
                                }
                            }
                        }
                        method1834(class309.field3832, class93.method2957(65535) + var17.field2085, 1002, var17.field2087, var12, var13);
                    } else if ((Statics.field1430 & 0x4) == 4) {
                        method1834(field686, field503 + " " + class93.field1269 + " " + class93.method2957(65535) + var17.field2085, 2, var15, var11, var13);
                    }
                }
                if (var14 == 1) {
                    class92 var21 = field534[var16];
                    if (var21 == null) {
                        continue;
                    }
                    if (var21.field1261.field1950 == 1 && (var21.field1182 & 0x7F) == 64 && (var21.field1138 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field535; var22++) {
                            class92 var23 = field534[field536[var22]];
                            if (var23 != null && var21 != var23 && var23.field1261.field1950 == 1 && var21.field1182 == var23.field1182 && var21.field1138 == var23.field1138) {
                                method4087(var23, field536[var22], var12, var13);
                            }
                        }
                        int var24 = class97.field1305;
                        int[] var25 = class97.field1306;
                        for (int var26 = 0; var26 < var24; var26++) {
                            class85 var27 = field609[var25[var26]];
                            if (var27 != null && var21.field1182 == var27.field1182 && var21.field1138 == var27.field1138) {
                                method1040(var27, var25[var26], var12, var13);
                            }
                        }
                    }
                    method4087(var21, var16, var12, var13);
                }
                if (var14 == 0) {
                    class85 var28 = field609[var16];
                    if (var28 == null) {
                        continue;
                    }
                    if ((var28.field1182 & 0x7F) == 64 && (var28.field1138 & 0x7F) == 64) {
                        for (int var29 = 0; var29 < field535; var29++) {
                            class92 var30 = field534[field536[var29]];
                            if (var30 != null && var30.field1261.field1950 == 1 && var28.field1182 == var30.field1182 && var28.field1138 == var30.field1138) {
                                method4087(var30, field536[var29], var12, var13);
                            }
                        }
                        int var31 = class97.field1305;
                        int[] var32 = class97.field1306;
                        for (int var33 = 0; var33 < var31; var33++) {
                            class85 var34 = field609[var32[var33]];
                            if (var34 != null && var28 != var34 && var28.field1182 == var34.field1182 && var28.field1138 == var34.field1138) {
                                method1040(var34, var32[var33], var12, var13);
                            }
                        }
                    }
                    if (field625 == var16) {
                        var4 = var9;
                    } else {
                        method1040(var28, var16, var12, var13);
                    }
                }
                if (var14 == 3) {
                    class335 var35 = field725[Statics.field1577][var12][var13];
                    if (var35 != null) {
                        for (class96 var36 = (class96) var35.method5418(); var36 != null; var36 = (class96) var35.method5420()) {
                            class189 var37 = class189.method2903(var36.field1296);
                            if (field726 == 1) {
                                method1834(class309.field3813, field649 + " " + class93.field1269 + " " + class93.method2957(16748608) + var37.field2183, 16, var36.field1296, var12, var13);
                            } else if (!field500) {
                                String[] var38 = var37.field2156;
                                for (int var39 = 4; var39 >= 0; var39--) {
                                    if (var38 != null && var38[var39] != null) {
                                        byte var40 = 0;
                                        if (var39 == 0) {
                                            var40 = 18;
                                        }
                                        if (var39 == 1) {
                                            var40 = 19;
                                        }
                                        if (var39 == 2) {
                                            var40 = 20;
                                        }
                                        if (var39 == 3) {
                                            var40 = 21;
                                        }
                                        if (var39 == 4) {
                                            var40 = 22;
                                        }
                                        method1834(var38[var39], class93.method2957(16748608) + var37.field2183, var40, var36.field1296, var12, var13);
                                    } else if (var39 == 2) {
                                        method1834(class309.field3907, class93.method2957(16748608) + var37.field2183, 20, var36.field1296, var12, var13);
                                    }
                                }
                                method1834(class309.field3832, class93.method2957(16748608) + var37.field2183, 1004, var36.field1296, var12, var13);
                            } else if ((Statics.field1430 & 0x1) == 1) {
                                method1834(field686, field503 + " " + class93.field1269 + " " + class93.method2957(16748608) + var37.field2183, 17, var36.field1296, var12, var13);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var41 = class213.method229(var4);
            int var42 = Statics.method1980(var4);
            class85 var43 = field609[field625];
            method1040(var43, field625, var41, var42);
        }
    }

    @ObfuscatedName("hw.ij(Lcd;IIIB)V")
    public static final void method4087(class92 arg0, int arg1, int arg2, int arg3) {
        class179 var4 = arg0.field1261;
        if (field632 >= 400) {
            return;
        }
        if (var4.field1982 != null) {
            var4 = var4.method3119();
        }
        if (var4 == null || !var4.field1985 || var4.field1987 && field665 != arg1) {
            return;
        }
        String var5 = arg0.method2221();
        if (var4.field1970 != 0 && arg0.field1211 != 0) {
            int var6 = arg0.field1211 == -1 ? var4.field1970 : arg0.field1211;
            var5 = var5 + method5934(var6, Statics.field2657.field1114) + " " + class93.field1276 + class309.field3819 + var6 + class93.field1264;
        }
        if (var4.field1987 && field640) {
            method1834(class309.field3832, class93.method2957(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field726 == 1) {
            method1834(class309.field3813, field649 + " " + class93.field1269 + " " + class93.method2957(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field500) {
            int var7 = var4.field1987 && field640 ? 2000 : 0;
            String[] var8 = var4.field1972;
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && !var8[var9].equalsIgnoreCase(class309.field3715)) {
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
                        method1834(var8[var9], class93.method2957(16776960) + var5, var10, arg1, arg2, arg3);
                    }
                }
            }
            if (var8 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var8[var11] != null && var8[var11].equalsIgnoreCase(class309.field3715)) {
                        short var12 = 0;
                        if (field507 != class95.field1287) {
                            if (field507 == class95.field1285 || field507 == class95.field1290 && var4.field1970 > Statics.field2657.field1114) {
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
                            method1834(var8[var11], class93.method2957(16776960) + var5, var13, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1987 || !field640) {
                method1834(class309.field3832, class93.method2957(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1430 & 0x2) == 2) {
            method1834(field686, field503 + " " + class93.field1269 + " " + class93.method2957(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bl.ir(Lca;IIII)V")
    public static final void method1040(class85 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2657 == arg0 || field632 >= 400) {
            return;
        }
        String var4;
        if (arg0.field1122 == 0) {
            var4 = arg0.field1124[0] + arg0.field1100 + arg0.field1124[1] + method5934(arg0.field1114, Statics.field2657.field1114) + " " + class93.field1276 + class309.field3819 + arg0.field1114 + class93.field1264 + arg0.field1124[2];
        } else {
            var4 = arg0.field1124[0] + arg0.field1100 + arg0.field1124[1] + " " + class93.field1276 + class309.field3820 + arg0.field1122 + class93.field1264 + arg0.field1124[2];
        }
        if (field726 == 1) {
            method1834(class309.field3813, field649 + " " + class93.field1269 + " " + class93.method2957(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field500) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field619[var5] != null) {
                    short var6 = 0;
                    if (field619[var5].equalsIgnoreCase(class309.field3715)) {
                        if (field506 == class95.field1287) {
                            continue;
                        }
                        if (field506 == class95.field1285 || field506 == class95.field1290 && arg0.field1114 > Statics.field2657.field1114) {
                            var6 = 2000;
                        }
                        if (Statics.field2657.field1112 == 0 || arg0.field1112 == 0) {
                            if (field506 == class95.field1284 && arg0.method2018()) {
                                var6 = 2000;
                            }
                        } else if (Statics.field2657.field1112 == arg0.field1112) {
                            var6 = 2000;
                        } else {
                            var6 = 0;
                        }
                    } else if (field620[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field618[var5] + var6;
                    method1834(field619[var5], class93.method2957(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1430 & 0x8) == 8) {
            method1834(field686, field503 + " " + class93.field1269 + " " + class93.method2957(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field632; var9++) {
            if (field635[var9] == 23) {
                field638[var9] = class93.method2957(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("nd.il(III)Ljava/lang/String;")
    public static final String method5934(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class93.method2957(16711680);
        } else if (var2 < -6) {
            return class93.method2957(16723968);
        } else if (var2 < -3) {
            return class93.method2957(16740352);
        } else if (var2 < 0) {
            return class93.method2957(16756736);
        } else if (var2 > 9) {
            return class93.method2957(65280);
        } else if (var2 > 6) {
            return class93.method2957(4259584);
        } else if (var2 > 3) {
            return class93.method2957(8453888);
        } else if (var2 > 0) {
            return class93.method2957(12648192);
        } else {
            return class93.method2957(16776960);
        }
    }

    @ObfuscatedName("fu.im(IIIIIIIIB)V")
    public static final void method3092(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class295.method4436(arg0)) {
            Statics.field1409 = null;
            method4062(Statics.field1799[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1409 != null) {
                method4062(Statics.field1409, -1412584499, arg1, arg2, arg3, arg4, Statics.field1730, Statics.field1811, arg7);
                Statics.field1409 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field653[var8] = true;
            }
        } else {
            field653[arg7] = true;
        }
    }

    @ObfuscatedName("hi.io([Lki;IIIIIIIII)V")
    public static final void method4062(class295[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class449.method7259(arg2, arg3, arg4, arg5);
        class202.method3637();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class295 var10 = arg0[var9];
            if (var10 != null && (var10.field3403 == arg1 || arg1 == -1412584499 && field668 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field707[field489] = var10.field3517 + arg6;
                    field708[field489] = var10.field3534 + arg7;
                    field592[field489] = var10.field3410;
                    field710[field489] = var10.field3411;
                    var11 = ++field489 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3542 = var11;
                var10.field3543 = field631;
                if (!var10.field3394 || !method6822(var10)) {
                    if (var10.field3399 > 0) {
                        method5110(var10);
                    }
                    int var12 = var10.field3517 + arg6;
                    int var13 = var10.field3534 + arg7;
                    int var14 = var10.field3426;
                    if (field668 == var10) {
                        if (arg1 != -1412584499 && !var10.field3440) {
                            Statics.field1409 = arg0;
                            Statics.field1730 = arg6;
                            Statics.field1811 = arg7;
                            continue;
                        }
                        if (field679 && field575) {
                            int var15 = class33.field227;
                            int var16 = class33.field228;
                            int var17 = var15 - field670;
                            int var18 = var16 - field671;
                            if (var17 < field748) {
                                var17 = field748;
                            }
                            if (var10.field3410 + var17 > field748 + field669.field3410) {
                                var17 = field748 + field669.field3410 - var10.field3410;
                            }
                            if (var18 < field675) {
                                var18 = field675;
                            }
                            if (var10.field3411 + var18 > field675 + field669.field3411) {
                                var18 = field675 + field669.field3411 - var10.field3411;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3440) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3397 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3397 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3410 + var12;
                        int var26 = var10.field3411 + var13;
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
                        int var29 = var10.field3410 + var12;
                        int var30 = var10.field3411 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3394 || var19 < var21 && var20 < var22) {
                        if (var10.field3399 != 0) {
                            if (var10.field3399 == 1336) {
                                if (Statics.field65.method2110()) {
                                    var13 += 15;
                                    Statics.field1718.method5773("Fps:" + field182, var10.field3410 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field514) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1718.method5773("Mem:" + var32 + "k", var10.field3410 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3399 == 1337) {
                                field644 = var12;
                                field548 = var13;
                                method1933(var12, var13, var10.field3410, var10.field3411);
                                field653[var10.field3542] = true;
                                class449.method7259(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3399 == 1338) {
                                method257(var10, var12, var13, var11);
                                class449.method7259(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3399 == 1339) {
                                method237(var10, var12, var13, var11);
                                class449.method7259(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3399 == 1400) {
                                Statics.field3129.method6603(var12, var13, var10.field3410, var10.field3411, field631);
                            }
                            if (var10.field3399 == 1401) {
                                Statics.field3129.method6582(var12, var13, var10.field3410, var10.field3411);
                            }
                            if (var10.field3399 == 1402) {
                                Statics.field2254.method2069(var12, field631);
                            }
                        }
                        if (var10.field3397 == 0) {
                            if (!var10.field3394 && method6822(var10) && Statics.field1682 != var10) {
                                continue;
                            }
                            if (!var10.field3394) {
                                if (var10.field3417 > var10.field3419 - var10.field3411) {
                                    var10.field3417 = var10.field3419 - var10.field3411;
                                }
                                if (var10.field3417 < 0) {
                                    var10.field3417 = 0;
                                }
                            }
                            method4062(arg0, var10.field3395, var19, var20, var21, var22, var12 - var10.field3433, var13 - var10.field3417, var11);
                            if (var10.field3535 != null) {
                                method4062(var10.field3535, var10.field3395, var19, var20, var21, var22, var12 - var10.field3433, var13 - var10.field3417, var11);
                            }
                            class80 var34 = (class80) field656.method6687((long) var10.field3395);
                            if (var34 != null) {
                                method3092(var34.field1044, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class449.method7259(arg2, arg3, arg4, arg5);
                            class202.method3637();
                        } else if (var10.field3397 == 11) {
                            if (method6822(var10) && Statics.field1682 != var10) {
                                continue;
                            }
                            if (var10.field3535 != null) {
                                method4062(var10.field3535, var10.field3395, var19, var20, var21, var22, var12 - var10.field3433, var13 - var10.field3417, var11);
                            }
                            class449.method7259(arg2, arg3, arg4, arg5);
                            class202.method3637();
                        }
                        if (field563 || field525[var11] || field711 > 1) {
                            if (var10.field3397 == 0 && !var10.field3394 && var10.field3419 > var10.field3411) {
                                method2898(var10.field3410 + var12, var13, var10.field3417, var10.field3411, var10.field3419);
                            }
                            if (var10.field3397 != 1) {
                                if (var10.field3397 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3490; var36++) {
                                        for (int var37 = 0; var37 < var10.field3522; var37++) {
                                            int var38 = (var10.field3463 + 32) * var37 + var12;
                                            int var39 = (var10.field3464 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3465[var35];
                                                var39 += var10.field3466[var35];
                                            }
                                            if (var10.field3470[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3470[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field154 == var10 && field601 == var35) {
                                                    class453 var43;
                                                    if (field726 == 1 && Statics.field280 == var35 && Statics.field106 == var10.field3395) {
                                                        var43 = class189.method2379(var42, var10.field3530[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class189.method2379(var42, var10.field3530[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method5299(var10);
                                                    } else if (Statics.field154 == var10 && field601 == var35) {
                                                        int var44 = class33.field227 - field478;
                                                        int var45 = class33.field228 - field517;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field606 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method7328(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class295 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class449.field4749 && var46.field3417 > 0) {
                                                                int var47 = field728 * (class449.field4749 - var39 - var45) / 3;
                                                                if (var47 > field728 * 10) {
                                                                    var47 = field728 * 10;
                                                                }
                                                                if (var47 > var46.field3417) {
                                                                    var47 = var46.field3417;
                                                                }
                                                                var46.field3417 -= var47;
                                                                field517 += var47;
                                                                method5299(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class449.field4747 && var46.field3417 < var46.field3419 - var46.field3411) {
                                                                int var48 = field728 * (var39 + var45 + 32 - class449.field4747) / 3;
                                                                if (var48 > field728 * 10) {
                                                                    var48 = field728 * 10;
                                                                }
                                                                if (var48 > var46.field3419 - var46.field3411 - var46.field3417) {
                                                                    var48 = var46.field3419 - var46.field3411 - var46.field3417;
                                                                }
                                                                var46.field3417 += var48;
                                                                field517 -= var48;
                                                                method5299(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field1992 == var10 && field600 == var35) {
                                                        var43.method7328(var38, var39, 128);
                                                    } else {
                                                        var43.method7322(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3467 != null && var35 < 20) {
                                                class453 var49 = var10.method4985(var35);
                                                if (var49 != null) {
                                                    var49.method7322(var38, var39);
                                                } else if (class295.field3408) {
                                                    method5299(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3397 == 3) {
                                    int var50;
                                    if (method6380(var10)) {
                                        var50 = var10.field3484;
                                        if (Statics.field1682 == var10 && var10.field3423 != 0) {
                                            var50 = var10.field3423;
                                        }
                                    } else {
                                        var50 = var10.field3469;
                                        if (Statics.field1682 == var10 && var10.field3422 != 0) {
                                            var50 = var10.field3422;
                                        }
                                    }
                                    if (var10.field3416) {
                                        switch(var10.field3425.field4757) {
                                            case 1:
                                                class449.method7200(var12, var13, var10.field3410, var10.field3411, var10.field3469, var10.field3484);
                                                break;
                                            case 2:
                                                class449.method7206(var12, var13, var10.field3410, var10.field3411, var10.field3469, var10.field3484, 255 - (var10.field3426 & 0xFF), 255 - (var10.field3427 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class449.method7204(var12, var13, var10.field3410, var10.field3411, var50);
                                                } else {
                                                    class449.method7203(var12, var13, var10.field3410, var10.field3411, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class449.method7208(var12, var13, var10.field3410, var10.field3411, var50);
                                    } else {
                                        class449.method7209(var12, var13, var10.field3410, var10.field3411, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3397 == 4) {
                                    class350 var51 = var10.method4982();
                                    if (var51 != null) {
                                        String var52 = var10.field3504;
                                        int var53;
                                        if (method6380(var10)) {
                                            var53 = var10.field3484;
                                            if (Statics.field1682 == var10 && var10.field3423 != 0) {
                                                var53 = var10.field3423;
                                            }
                                            if (var10.field3458.length() > 0) {
                                                var52 = var10.field3458;
                                            }
                                        } else {
                                            var53 = var10.field3469;
                                            if (Statics.field1682 == var10 && var10.field3422 != 0) {
                                                var53 = var10.field3422;
                                            }
                                        }
                                        if (var10.field3394 && var10.field3531 != -1) {
                                            class189 var54 = class189.method2903(var10.field3531);
                                            var52 = var54.field2183;
                                            if (var52 == null) {
                                                var52 = class309.field3681;
                                            }
                                            if ((var54.field2146 == 1 || var10.field3532 != 1) && var10.field3532 != -1) {
                                                var52 = class93.method2957(16748608) + var52 + class93.field1271 + " " + 'x' + method6784(var10.field3532);
                                            }
                                        }
                                        if (field661 == var10) {
                                            var52 = class309.field3697;
                                            var53 = var10.field3469;
                                        }
                                        if (!var10.field3394) {
                                            var52 = method2959(var52, var10);
                                        }
                                        var51.method5732(var52, var12, var13, var10.field3410, var10.field3411, var53, var10.field3462 ? 0 : -1, var10.field3406, var10.field3505, var10.field3459);
                                    } else if (class295.field3408) {
                                        method5299(var10);
                                    }
                                } else if (var10.field3397 == 5) {
                                    if (var10.field3394) {
                                        class453 var56;
                                        if (var10.field3531 == -1) {
                                            var56 = var10.method4997(false, Statics.field1385);
                                        } else {
                                            var56 = class189.method2379(var10.field3531, var10.field3532, var10.field3513, var10.field3436, var10.field3424, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4772;
                                            int var58 = var56.field4776;
                                            if (var10.field3434) {
                                                class449.method7265(var12, var13, var10.field3410 + var12, var10.field3411 + var13);
                                                int var59 = (var10.field3410 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3411 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3451 != 0) {
                                                            var56.method7313(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3451, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method7322(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method7328(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class449.method7259(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3410 * 4096 / var57;
                                                if (var10.field3451 != 0) {
                                                    var56.method7313(var10.field3410 / 2 + var12, var10.field3411 / 2 + var13, var10.field3451, var63);
                                                } else if (var14 != 0) {
                                                    var56.method7407(var12, var13, var10.field3410, var10.field3411, 256 - (var14 & 0xFF));
                                                } else if (var10.field3410 == var57 && var10.field3411 == var58) {
                                                    var56.method7322(var12, var13);
                                                } else {
                                                    var56.method7413(var12, var13, var10.field3410, var10.field3411);
                                                }
                                            }
                                        } else if (class295.field3408) {
                                            method5299(var10);
                                        }
                                    } else {
                                        class453 var55 = var10.method4997(method6380(var10), Statics.field1385);
                                        if (var55 != null) {
                                            var55.method7322(var12, var13);
                                        } else if (class295.field3408) {
                                            method5299(var10);
                                        }
                                    }
                                } else if (var10.field3397 == 6) {
                                    boolean var64 = method6380(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3383;
                                    } else {
                                        var65 = var10.field3533;
                                    }
                                    class212 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3531 != -1) {
                                        class189 var68 = class189.method2903(var10.field3531);
                                        if (var68 != null) {
                                            class189 var69 = var68.method3352(var10.field3532);
                                            var66 = var69.method3332(1);
                                            if (var66 == null) {
                                                method5299(var10);
                                            } else {
                                                var66.method3946();
                                                var67 = var66.field2487 / 2;
                                            }
                                        }
                                    } else if (var10.field3439 == 5) {
                                        if (var10.field3508 == 0) {
                                            var66 = field762.method4943((class191) null, -1, (class191) null, -1);
                                        } else {
                                            var66 = Statics.field2657.method1774();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method5085((class191) null, -1, var64, Statics.field2657.field1113);
                                        if (var66 == null && class295.field3408) {
                                            method5299(var10);
                                        }
                                    } else {
                                        class191 var70 = class191.method2497(var65);
                                        var66 = var10.method5085(var70, var10.field3478, var64, Statics.field2657.field1113);
                                        if (var66 == null && class295.field3408) {
                                            method5299(var10);
                                        }
                                    }
                                    class202.method3636(var10.field3410 / 2 + var12, var10.field3411 / 2 + var13);
                                    int var71 = var10.field3450 * class202.field2402[var10.field3447] >> 16;
                                    int var72 = var10.field3450 * class202.field2377[var10.field3447] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3394) {
                                            var66.method3946();
                                            if (var10.field3453) {
                                                var66.method3965(0, var10.field3486, var10.field3449, var10.field3447, var10.field3445, var10.field3448 + var67 + var71, var10.field3448 + var72, var10.field3450);
                                            } else {
                                                var66.method3964(0, var10.field3486, var10.field3449, var10.field3447, var10.field3445, var10.field3448 + var67 + var71, var10.field3448 + var72);
                                            }
                                        } else {
                                            var66.method3964(0, var10.field3486, 0, var10.field3447, 0, var71, var72);
                                        }
                                    }
                                    class202.method3605();
                                } else {
                                    if (var10.field3397 == 7) {
                                        class350 var73 = var10.method4982();
                                        if (var73 == null) {
                                            if (class295.field3408) {
                                                method5299(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field3490; var75++) {
                                            for (int var76 = 0; var76 < var10.field3522; var76++) {
                                                if (var10.field3470[var74] > 0) {
                                                    class189 var77 = class189.method2903(var10.field3470[var74] - 1);
                                                    String var78;
                                                    if (var77.field2146 != 1 && var10.field3530[var74] == 1) {
                                                        var78 = class93.method2957(16748608) + var77.field2183 + class93.field1271;
                                                    } else {
                                                        var78 = class93.method2957(16748608) + var77.field2183 + class93.field1271 + " " + 'x' + method6784(var10.field3530[var74]);
                                                    }
                                                    int var79 = (var10.field3463 + 115) * var76 + var12;
                                                    int var80 = (var10.field3464 + 12) * var75 + var13;
                                                    if (var10.field3406 == 0) {
                                                        var73.method5729(var78, var79, var80, var10.field3469, var10.field3462 ? 0 : -1);
                                                    } else if (var10.field3406 == 1) {
                                                        var73.method5731(var78, var10.field3410 / 2 + var79, var80, var10.field3469, var10.field3462 ? 0 : -1);
                                                    } else {
                                                        var73.method5773(var78, var10.field3410 + var79 - 1, var80, var10.field3469, var10.field3462 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field3397 == 8 && Statics.field1423 == var10 && field703 == field646) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class350 var83 = Statics.field1718;
                                        String var84 = var10.field3504;
                                        String var85 = method2959(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class93.field1265);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5723(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field4189 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3410 + var12 - 5 - var81;
                                        int var90 = var10.field3411 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class449.method7204(var89, var90, var81, var82, 16777120);
                                        class449.method7208(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3504;
                                        int var92 = var83.field4189 + var90 + 2;
                                        String var93 = method2959(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class93.field1265);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5729(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field4189 + 1;
                                        }
                                    }
                                    if (var10.field3397 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field3429) {
                                            var96 = var12;
                                            var97 = var10.field3411 + var13;
                                            var98 = var10.field3410 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3410 + var12;
                                            var99 = var10.field3411 + var13;
                                        }
                                        if (var10.field3428 == 1) {
                                            class449.method7201(var96, var97, var98, var99, var10.field3469);
                                        } else {
                                            method6818(var96, var97, var98, var99, var10.field3469, var10.field3428);
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

    @ObfuscatedName("pm.jq(IIIIIII)V")
    public static final void method6818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class449.field4748;
        int var18 = arg1 - class449.field4749;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class202.method3673(var19, var20, var21);
        class202.method3616(var23, var24, var25, var19, var20, var21, arg4);
        class202.method3673(var19, var21, var22);
        class202.method3616(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("fo.jd(Ljava/lang/String;Lki;I)Ljava/lang/String;")
    public static String method2959(String arg0, class295 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method158(Statics.method2278(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("pg.jj(II)Ljava/lang/String;")
    public static final String method6784(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class93.field1267 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class93.method2957(65408) + var1.substring(0, var1.length() - 8) + class309.field3750 + " " + class93.field1276 + var1 + class93.field1264 + class93.field1271;
        } else if (var1.length() > 6) {
            return " " + class93.method2957(16777215) + var1.substring(0, var1.length() - 4) + class309.field3880 + " " + class93.field1276 + var1 + class93.field1264 + class93.field1271;
        } else {
            return " " + class93.method2957(16776960) + var1 + class93.field1271;
        }
    }

    @ObfuscatedName("client.ja(ZB)V")
    public final void method1086(boolean arg0) {
        int var2 = field543;
        int var3 = Statics.field841;
        int var4 = Statics.field4663;
        if (class295.method4436(var2)) {
            method5395(Statics.field1799[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.jm(Lki;B)V")
    public void method1077(class295 arg0) {
        class295 var2 = arg0.field3403 == -1 ? null : class295.method2248(arg0.field3403);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field841;
            var4 = Statics.field4663;
        } else {
            var3 = var2.field3410;
            var4 = var2.field3411;
        }
        method3391(arg0, var3, var4, false);
        method1872(arg0, var3, var4);
    }

    @ObfuscatedName("dc.jg([Lki;Lki;ZI)V")
    public static void method2443(class295[] arg0, class295 arg1, boolean arg2) {
        int var3 = arg1.field3418 == 0 ? arg1.field3410 : arg1.field3418;
        int var4 = arg1.field3419 == 0 ? arg1.field3411 : arg1.field3419;
        method5395(arg0, arg1.field3395, var3, var4, arg2);
        if (arg1.field3535 != null) {
            method5395(arg1.field3535, arg1.field3395, var3, var4, arg2);
        }
        class80 var5 = (class80) field656.method6687((long) arg1.field3395);
        if (var5 != null) {
            int var6 = var5.field1044;
            if (class295.method4436(var6)) {
                method5395(Statics.field1799[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3399 == 1337) {
        }
    }

    @ObfuscatedName("lq.jn([Lki;IIIZB)V")
    public static void method5395(class295[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class295 var6 = arg0[var5];
            if (var6 != null && var6.field3403 == arg1) {
                method3391(var6, arg2, arg3, arg4);
                method1872(var6, arg2, arg3);
                if (var6.field3433 > var6.field3418 - var6.field3410) {
                    var6.field3433 = var6.field3418 - var6.field3410;
                }
                if (var6.field3433 < 0) {
                    var6.field3433 = 0;
                }
                if (var6.field3417 > var6.field3419 - var6.field3411) {
                    var6.field3417 = var6.field3419 - var6.field3411;
                }
                if (var6.field3417 < 0) {
                    var6.field3417 = 0;
                }
                if (var6.field3397 == 0) {
                    method2443(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("gi.jb(Lki;IIZB)V")
    public static void method3391(class295 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3410;
        int var5 = arg0.field3411;
        if (arg0.field3402 == 0) {
            arg0.field3410 = arg0.field3522;
        } else if (arg0.field3402 == 1) {
            arg0.field3410 = arg1 - arg0.field3522;
        } else if (arg0.field3402 == 2) {
            arg0.field3410 = arg0.field3522 * arg1 >> 14;
        }
        if (arg0.field3421 == 0) {
            arg0.field3411 = arg0.field3490;
        } else if (arg0.field3421 == 1) {
            arg0.field3411 = arg2 - arg0.field3490;
        } else if (arg0.field3421 == 2) {
            arg0.field3411 = arg0.field3490 * arg2 >> 14;
        }
        if (arg0.field3402 == 4) {
            arg0.field3410 = arg0.field3412 * arg0.field3411 / arg0.field3495;
        }
        if (arg0.field3421 == 4) {
            arg0.field3411 = arg0.field3495 * arg0.field3410 / arg0.field3412;
        }
        if (arg0.field3399 == 1337) {
            field727 = arg0;
        }
        if (arg3 && arg0.field3519 != null && (arg0.field3410 != var4 || arg0.field3411 != var5)) {
            class81 var6 = new class81();
            var6.field1047 = arg0;
            var6.field1062 = arg0.field3519;
            field569.method5413(var6);
        }
    }

    @ObfuscatedName("by.ju(Lki;III)V")
    public static void method1872(class295 arg0, int arg1, int arg2) {
        if (arg0.field3400 == 0) {
            arg0.field3517 = arg0.field3404;
        } else if (arg0.field3400 == 1) {
            arg0.field3517 = (arg1 - arg0.field3410) / 2 + arg0.field3404;
        } else if (arg0.field3400 == 2) {
            arg0.field3517 = arg1 - arg0.field3410 - arg0.field3404;
        } else if (arg0.field3400 == 3) {
            arg0.field3517 = arg0.field3404 * arg1 >> 14;
        } else if (arg0.field3400 == 4) {
            arg0.field3517 = (arg0.field3404 * arg1 >> 14) + (arg1 - arg0.field3410) / 2;
        } else {
            arg0.field3517 = arg1 - arg0.field3410 - (arg0.field3404 * arg1 >> 14);
        }
        if (arg0.field3401 == 0) {
            arg0.field3534 = arg0.field3405;
        } else if (arg0.field3401 == 1) {
            arg0.field3534 = (arg2 - arg0.field3411) / 2 + arg0.field3405;
        } else if (arg0.field3401 == 2) {
            arg0.field3534 = arg2 - arg0.field3411 - arg0.field3405;
        } else if (arg0.field3401 == 3) {
            arg0.field3534 = arg0.field3405 * arg2 >> 14;
        } else if (arg0.field3401 == 4) {
            arg0.field3534 = (arg0.field3405 * arg2 >> 14) + (arg2 - arg0.field3411) / 2;
        } else {
            arg0.field3534 = arg2 - arg0.field3411 - (arg0.field3405 * arg2 >> 14);
        }
    }

    @ObfuscatedName("fg.jf(Lki;IIIIIIB)V")
    public static final void method2905(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field560) {
            field561 = 32;
        } else {
            field561 = 0;
        }
        field560 = false;
        if (class33.field226 == 1 || !Statics.field914 && class33.field226 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3417 -= 4;
                method5299(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3417 += 4;
                method5299(arg0);
            } else if (arg5 >= arg1 - field561 && arg5 < field561 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3417 = (arg4 - arg3) * var8 / var9;
                method5299(arg0);
                field560 = true;
            }
        }
        if (field697 == 0) {
            return;
        }
        int var10 = arg0.field3410;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3417 += field697 * 45;
            method5299(arg0);
        }
    }

    @ObfuscatedName("fp.jr(IIIIII)V")
    public static final void method2898(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1575[0].method7287(arg0, arg1);
        Statics.field1575[1].method7287(arg0, arg1 + arg3 - 16);
        class449.method7204(arg0, arg1 + 16, 16, arg3 - 32, field556);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class449.method7204(arg0, arg1 + 16 + var6, 16, var5, field557);
        class449.method7212(arg0, arg1 + 16 + var6, var5, field484);
        class449.method7212(arg0 + 1, arg1 + 16 + var6, var5, field484);
        class449.method7210(arg0, arg1 + 16 + var6, 16, field484);
        class449.method7210(arg0, arg1 + 17 + var6, 16, field484);
        class449.method7212(arg0 + 15, arg1 + 16 + var6, var5, field641);
        class449.method7212(arg0 + 14, arg1 + 17 + var6, var5 - 1, field641);
        class449.method7210(arg0, arg1 + 15 + var6 + var5, 16, field641);
        class449.method7210(arg0 + 1, arg1 + 14 + var6 + var5, 15, field641);
    }

    @ObfuscatedName("t.jo(II)Ljava/lang/String;")
    public static final String method158(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ov.jp(Lki;B)Z")
    public static final boolean method6380(class295 arg0) {
        if (arg0.field3524 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3524.length; var1++) {
            int var2 = Statics.method2278(arg0, var1);
            int var3 = arg0.field3497[var1];
            if (arg0.field3524[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3524[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3524[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fd.je(Lki;IIB)V")
    public static final void method2907(class295 arg0, int arg1, int arg2) {
        if (arg0.field3398 == 1) {
            method1834(arg0.field3413, "", 24, 0, 0, arg0.field3395);
        }
        if (arg0.field3398 == 2 && !field500) {
            String var3 = method6103(arg0);
            if (var3 != null) {
                method1834(var3, class93.method2957(65280) + arg0.field3527, 25, 0, -1, arg0.field3395);
            }
        }
        if (arg0.field3398 == 3) {
            method1834(class309.field3822, "", 26, 0, 0, arg0.field3395);
        }
        if (arg0.field3398 == 4) {
            method1834(arg0.field3413, "", 28, 0, 0, arg0.field3395);
        }
        if (arg0.field3398 == 5) {
            method1834(arg0.field3413, "", 29, 0, 0, arg0.field3395);
        }
        if (arg0.field3398 == 6 && field661 == null) {
            method1834(arg0.field3413, "", 30, 0, -1, arg0.field3395);
        }
        if (arg0.field3397 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3411; var5++) {
                for (int var6 = 0; var6 < arg0.field3410; var6++) {
                    int var7 = (arg0.field3463 + 32) * var6;
                    int var8 = (arg0.field3464 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3465[var4];
                        var8 += arg0.field3466[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field604 = var4;
                        Statics.field1755 = arg0;
                        if (arg0.field3470[var4] > 0) {
                            label281: {
                                class189 var9 = class189.method2903(arg0.field3470[var4] - 1);
                                if (field726 == 1) {
                                    int var10 = method2406(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field106 != arg0.field3395 || Statics.field280 != var4) {
                                            method1834(class309.field3813, field649 + " " + class93.field1269 + " " + class93.method2957(16748608) + var9.field2183, 31, var9.field2142, var4, arg0.field3395);
                                        }
                                        break label281;
                                    }
                                }
                                if (field500) {
                                    int var12 = method2406(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1430 & 0x10) == 16) {
                                            method1834(field686, field503 + " " + class93.field1269 + " " + class93.method2957(16748608) + var9.field2183, 32, var9.field2142, var4, arg0.field3395);
                                        }
                                        break label281;
                                    }
                                }
                                String[] var14 = var9.field2159;
                                int var15 = -1;
                                if (field526) {
                                    boolean var16 = field642 || class24.field131[81];
                                    if (var16) {
                                        var15 = var9.method3340();
                                    }
                                }
                                int var17 = method2406(arg0);
                                boolean var18 = (var17 >> 30 & 0x1) != 0;
                                if (var18) {
                                    for (int var19 = 4; var19 >= 3; var19--) {
                                        if (var15 != var19) {
                                            Statics.method5318(arg0, var9, var4, var19, false);
                                        }
                                    }
                                }
                                int var20 = method2406(arg0);
                                boolean var21 = (var20 >> 31 & 0x1) != 0;
                                if (var21) {
                                    method1834(class309.field3813, class93.method2957(16748608) + var9.field2183, 38, var9.field2142, var4, arg0.field3395);
                                }
                                int var22 = method2406(arg0);
                                boolean var23 = (var22 >> 30 & 0x1) != 0;
                                if (var23) {
                                    for (int var24 = 2; var24 >= 0; var24--) {
                                        if (var15 != var24) {
                                            Statics.method5318(arg0, var9, var4, var24, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        Statics.method5318(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var25 = arg0.field3468;
                                if (var25 != null) {
                                    for (int var26 = 4; var26 >= 0; var26--) {
                                        if (var25[var26] != null) {
                                            byte var27 = 0;
                                            if (var26 == 0) {
                                                var27 = 39;
                                            }
                                            if (var26 == 1) {
                                                var27 = 40;
                                            }
                                            if (var26 == 2) {
                                                var27 = 41;
                                            }
                                            if (var26 == 3) {
                                                var27 = 42;
                                            }
                                            if (var26 == 4) {
                                                var27 = 43;
                                            }
                                            method1834(var25[var26], class93.method2957(16748608) + var9.field2183, var27, var9.field2142, var4, arg0.field3395);
                                        }
                                    }
                                }
                                method1834(class309.field3832, class93.method2957(16748608) + var9.field2183, 1005, var9.field2142, var4, arg0.field3395);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3394) {
            return;
        }
        if (field500) {
            int var28 = method2406(arg0);
            boolean var29 = (var28 >> 21 & 0x1) != 0;
            if (var29 && (Statics.field1430 & 0x20) == 32) {
                method1834(field686, field503 + " " + class93.field1269 + " " + arg0.field3479, 58, 0, arg0.field3396, arg0.field3395);
            }
            return;
        }
        for (int var30 = 9; var30 >= 5; var30--) {
            String var31 = method3498(arg0, var30);
            if (var31 != null) {
                method1834(var31, arg0.field3479, 1007, var30 + 1, arg0.field3396, arg0.field3395);
            }
        }
        String var32 = method6103(arg0);
        if (var32 != null) {
            method1834(var32, arg0.field3479, 25, 0, arg0.field3396, arg0.field3395);
        }
        for (int var33 = 4; var33 >= 0; var33--) {
            String var34 = method3498(arg0, var33);
            if (var34 != null) {
                method3093(var34, arg0.field3479, 57, var33 + 1, arg0.field3396, arg0.field3395, arg0.field3547);
            }
        }
        int var35 = method2406(arg0);
        boolean var36 = (var35 & 0x1) != 0;
        if (var36) {
            method1834(class309.field3779, "", 30, 0, arg0.field3396, arg0.field3395);
        }
    }

    @ObfuscatedName("az.jt(ZI)V")
    public static void method588(boolean arg0) {
        field642 = arg0;
    }

    @ObfuscatedName("hf.jv(S)Z")
    public static boolean method4071() {
        return field642;
    }

    @ObfuscatedName("a.jy(IIIIIIIB)V")
    public static final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class295.method4436(arg0)) {
            method4219(Statics.field1799[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("hd.ji([Lki;IIIIIIIB)V")
    public static final void method4219(class295[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class295 var9 = arg0[var8];
            if (var9 != null && var9.field3403 == arg1 && (var9.method4989() || method2406(var9) != 0 || field669 == var9)) {
                if (var9.field3394) {
                    if (method6822(var9)) {
                        continue;
                    }
                } else if (var9.field3397 == 0 && Statics.field1682 != var9 && method6822(var9)) {
                    continue;
                }
                if (var9.field3397 == 11 && var9.method5058(Statics.field1385)) {
                    if (var9.method5039()) {
                        method5299(var9);
                        method2443(var9.field3535, var9, true);
                    }
                    if (var9.field3461 != null) {
                        class81 var10 = new class81();
                        var10.field1047 = var9;
                        var10.field1062 = var9.field3461;
                        field569.method5413(var10);
                    }
                }
                int var11 = var9.field3517 + arg6;
                int var12 = var9.field3534 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field3397 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field3397 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field3410 + var11;
                    int var20 = var9.field3411 + var12;
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
                    int var23 = var9.field3410 + var11;
                    int var24 = var9.field3411 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field668 == var9) {
                    field676 = true;
                    field654 = var11;
                    field613 = var12;
                }
                boolean var25 = false;
                if (var9.field3474) {
                    switch(field488) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3395 >>> 16 == field658) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field658 == var9.field3395) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3394 || var13 < var15 && var14 < var16) {
                    if (var9.field3394) {
                        if (var9.field3545) {
                            if (class33.field227 >= var13 && class33.field228 >= var14 && class33.field227 < var15 && class33.field228 < var16) {
                                for (class81 var26 = (class81) field569.method5431(); var26 != null; var26 = (class81) field569.method5419()) {
                                    if (var26.field1053) {
                                        var26.method6399();
                                        var26.field1047.field3536 = false;
                                    }
                                }
                                if (Statics.field316 == 0) {
                                    field668 = null;
                                    field669 = null;
                                }
                                if (!field498) {
                                    method260();
                                }
                            }
                        } else if (var9.field3546 && class33.field227 >= var13 && class33.field228 >= var14 && class33.field227 < var15 && class33.field228 < var16) {
                            for (class81 var27 = (class81) field569.method5431(); var27 != null; var27 = (class81) field569.method5419()) {
                                if (var27.field1053 && var27.field1047.field3507 == var27.field1062) {
                                    var27.method6399();
                                }
                            }
                        }
                    }
                    int var28 = class33.field227;
                    int var29 = class33.field228;
                    if (class33.field238 != 0) {
                        var28 = class33.field235;
                        var29 = class33.field240;
                    }
                    boolean var30 = var28 >= var13 && var29 >= var14 && var28 < var15 && var29 < var16;
                    if (var9.field3399 == 1337) {
                        if (!field490 && !field498 && var30) {
                            method4520(var28, var29, var13, var14);
                        }
                    } else if (var9.field3399 == 1338) {
                        method2648(var9, var11, var12);
                    } else {
                        if (var9.field3399 == 1400) {
                            Statics.field3129.method6635(class33.field227, class33.field228, var30, var11, var12, var9.field3410, var9.field3411);
                        }
                        if (!field498 && var30) {
                            if (var9.field3399 == 1400) {
                                Statics.field3129.method6489(var11, var12, var9.field3410, var9.field3411, var28, var29);
                            } else {
                                method2907(var9, var28 - var11, var29 - var12);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3475.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3475[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3475[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3528 != null) {
                                            var35 = class24.field131[var9.field3475[var31][var34]];
                                        }
                                        if (method2757(var9.field3475[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3528 != null && var9.field3528[var31] > field631) {
                                                break;
                                            }
                                            byte var36 = var9.field3420[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !class24.field131[86] && !class24.field131[82] && !class24.field131[81]) && ((var36 & 0x2) == 0 || class24.field131[86]) && ((var36 & 0x1) == 0 || class24.field131[82]) && ((var36 & 0x4) == 0 || class24.field131[81])) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method2871(var31 + 1, var9.field3395, var9.field3396, var9.field3531, "");
                                    } else if (var31 == 10) {
                                        method4639();
                                        method2251(var9.field3395, var9.field3396, class296.method4455(method2406(var9)), var9.field3531);
                                        field686 = method6103(var9);
                                        if (field686 == null) {
                                            field686 = class309.field3681;
                                        }
                                        field503 = var9.field3479 + class93.method2957(16777215);
                                    }
                                    int var37 = var9.field3477[var31];
                                    if (var9.field3528 == null) {
                                        var9.field3528 = new int[var9.field3475.length];
                                    }
                                    if (var9.field3482 == null) {
                                        var9.field3482 = new int[var9.field3475.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3528[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3528[var31] == 0) {
                                        var9.field3528[var31] = field631 + var37 + var9.field3482[var31];
                                    } else {
                                        var9.field3528[var31] = field631 + var37;
                                    }
                                }
                                if (!var32 && var9.field3528 != null) {
                                    var9.field3528[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3394) {
                            boolean var38;
                            if (class33.field227 >= var13 && class33.field228 >= var14 && class33.field227 < var15 && class33.field228 < var16) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class33.field226 == 1 || !Statics.field914 && class33.field226 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class33.field238 == 1 || !Statics.field914 && class33.field238 == 4) && class33.field235 >= var13 && class33.field240 >= var14 && class33.field235 < var15 && class33.field240 < var16) {
                                var40 = true;
                            }
                            if (var40) {
                                method88(var9, class33.field235 - var11, class33.field240 - var12);
                                if (var9.field3397 == 11 && var9.method5015(class33.field235, class33.field240, arg6, arg7)) {
                                    switch(var9.method4998()) {
                                        case 0:
                                            class30.method1979(var9.method5021(), true, false);
                                            break;
                                        case 1:
                                            if (Statics.method2784(method2406(var9))) {
                                                int[] var41 = var9.method5001();
                                                if (var41 != null) {
                                                    class265 var42 = class265.method4070(class263.field3001, field734.field1344);
                                                    var42.field3075.method6879(var41[2]);
                                                    var42.field3075.method6942(var9.field3395);
                                                    var42.field3075.method6928(var9.field3396);
                                                    var42.field3075.method6942(var41[1]);
                                                    var42.field3075.method6942(var41[0]);
                                                    var42.field3075.method6879(var9.method4999());
                                                    field734.method2362(var42);
                                                }
                                            }
                                    }
                                }
                            }
                            if (var9.field3399 == 1400) {
                                Statics.field3129.method6439(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field668 != null && field668 != var9 && var38 && class296.method4388(method2406(var9))) {
                                field672 = var9;
                            }
                            if (field669 == var9) {
                                field575 = true;
                                field748 = var11;
                                field675 = var12;
                            }
                            if (var9.field3520) {
                                if (var38 && field697 != 0 && var9.field3507 != null) {
                                    class81 var43 = new class81();
                                    var43.field1053 = true;
                                    var43.field1047 = var9;
                                    var43.field1049 = field697;
                                    var43.field1062 = var9.field3507;
                                    field569.method5413(var43);
                                }
                                if (field668 != null || Statics.field154 != null || field498) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3498 && var40) {
                                    var9.field3498 = true;
                                    if (var9.field3510 != null) {
                                        class81 var44 = new class81();
                                        var44.field1053 = true;
                                        var44.field1047 = var9;
                                        var44.field1048 = class33.field235 - var11;
                                        var44.field1049 = class33.field240 - var12;
                                        var44.field1062 = var9.field3510;
                                        field569.method5413(var44);
                                    }
                                }
                                if (var9.field3498 && var39 && var9.field3489 != null) {
                                    class81 var45 = new class81();
                                    var45.field1053 = true;
                                    var45.field1047 = var9;
                                    var45.field1048 = class33.field227 - var11;
                                    var45.field1049 = class33.field228 - var12;
                                    var45.field1062 = var9.field3489;
                                    field569.method5413(var45);
                                }
                                if (var9.field3498 && !var39) {
                                    var9.field3498 = false;
                                    if (var9.field3538 != null) {
                                        class81 var46 = new class81();
                                        var46.field1053 = true;
                                        var46.field1047 = var9;
                                        var46.field1048 = class33.field227 - var11;
                                        var46.field1049 = class33.field228 - var12;
                                        var46.field1062 = var9.field3538;
                                        field702.method5413(var46);
                                    }
                                }
                                if (var39 && var9.field3491 != null) {
                                    class81 var47 = new class81();
                                    var47.field1053 = true;
                                    var47.field1047 = var9;
                                    var47.field1048 = class33.field227 - var11;
                                    var47.field1049 = class33.field228 - var12;
                                    var47.field1062 = var9.field3491;
                                    field569.method5413(var47);
                                }
                                if (!var9.field3536 && var38) {
                                    var9.field3536 = true;
                                    if (var9.field3492 != null) {
                                        class81 var48 = new class81();
                                        var48.field1053 = true;
                                        var48.field1047 = var9;
                                        var48.field1048 = class33.field227 - var11;
                                        var48.field1049 = class33.field228 - var12;
                                        var48.field1062 = var9.field3492;
                                        field569.method5413(var48);
                                    }
                                }
                                if (var9.field3536 && var38 && var9.field3493 != null) {
                                    class81 var49 = new class81();
                                    var49.field1053 = true;
                                    var49.field1047 = var9;
                                    var49.field1048 = class33.field227 - var11;
                                    var49.field1049 = class33.field228 - var12;
                                    var49.field1062 = var9.field3493;
                                    field569.method5413(var49);
                                }
                                if (var9.field3536 && !var38) {
                                    var9.field3536 = false;
                                    if (var9.field3494 != null) {
                                        class81 var50 = new class81();
                                        var50.field1053 = true;
                                        var50.field1047 = var9;
                                        var50.field1048 = class33.field227 - var11;
                                        var50.field1049 = class33.field228 - var12;
                                        var50.field1062 = var9.field3494;
                                        field702.method5413(var50);
                                    }
                                }
                                if (var9.field3488 != null) {
                                    class81 var51 = new class81();
                                    var51.field1047 = var9;
                                    var51.field1062 = var9.field3488;
                                    field699.method5413(var51);
                                }
                                if (var9.field3499 != null && field553 > var9.field3539) {
                                    if (var9.field3381 == null || field553 - var9.field3539 > 32) {
                                        class81 var56 = new class81();
                                        var56.field1047 = var9;
                                        var56.field1062 = var9.field3499;
                                        field569.method5413(var56);
                                    } else {
                                        label650: for (int var52 = var9.field3539; var52 < field553; var52++) {
                                            int var53 = field681[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field3381.length; var54++) {
                                                if (var9.field3381[var54] == var53) {
                                                    class81 var55 = new class81();
                                                    var55.field1047 = var9;
                                                    var55.field1062 = var9.field3499;
                                                    field569.method5413(var55);
                                                    break label650;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3539 = field553;
                                }
                                if (var9.field3487 != null && field684 > var9.field3540) {
                                    if (var9.field3502 == null || field684 - var9.field3540 > 32) {
                                        class81 var61 = new class81();
                                        var61.field1047 = var9;
                                        var61.field1062 = var9.field3487;
                                        field569.method5413(var61);
                                    } else {
                                        label626: for (int var57 = var9.field3540; var57 < field684; var57++) {
                                            int var58 = field683[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field3502.length; var59++) {
                                                if (var9.field3502[var59] == var58) {
                                                    class81 var60 = new class81();
                                                    var60.field1047 = var9;
                                                    var60.field1062 = var9.field3487;
                                                    field569.method5413(var60);
                                                    break label626;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3540 = field684;
                                }
                                if (var9.field3503 != null && field677 > var9.field3541) {
                                    if (var9.field3430 == null || field677 - var9.field3541 > 32) {
                                        class81 var66 = new class81();
                                        var66.field1047 = var9;
                                        var66.field1062 = var9.field3503;
                                        field569.method5413(var66);
                                    } else {
                                        label602: for (int var62 = var9.field3541; var62 < field677; var62++) {
                                            int var63 = field685[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field3430.length; var64++) {
                                                if (var9.field3430[var64] == var63) {
                                                    class81 var65 = new class81();
                                                    var65.field1047 = var9;
                                                    var65.field1062 = var9.field3503;
                                                    field569.method5413(var65);
                                                    break label602;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3541 = field677;
                                }
                                if (field689 > var9.field3525 && var9.field3523 != null) {
                                    class81 var67 = new class81();
                                    var67.field1047 = var9;
                                    var67.field1062 = var9.field3523;
                                    field569.method5413(var67);
                                }
                                if (field690 > var9.field3525 && var9.field3512 != null) {
                                    class81 var68 = new class81();
                                    var68.field1047 = var9;
                                    var68.field1062 = var9.field3512;
                                    field569.method5413(var68);
                                }
                                if (field691 > var9.field3525 && var9.field3501 != null) {
                                    class81 var69 = new class81();
                                    var69.field1047 = var9;
                                    var69.field1062 = var9.field3501;
                                    field569.method5413(var69);
                                }
                                if (field692 > var9.field3525 && var9.field3514 != null) {
                                    class81 var70 = new class81();
                                    var70.field1047 = var9;
                                    var70.field1062 = var9.field3514;
                                    field569.method5413(var70);
                                }
                                if (field693 > var9.field3525 && var9.field3457 != null) {
                                    class81 var71 = new class81();
                                    var71.field1047 = var9;
                                    var71.field1062 = var9.field3457;
                                    field569.method5413(var71);
                                }
                                if (field763 > var9.field3525 && var9.field3476 != null) {
                                    class81 var72 = new class81();
                                    var72.field1047 = var9;
                                    var72.field1062 = var9.field3476;
                                    field569.method5413(var72);
                                }
                                if (field513 > var9.field3525 && var9.field3521 != null) {
                                    class81 var73 = new class81();
                                    var73.field1047 = var9;
                                    var73.field1062 = var9.field3521;
                                    field569.method5413(var73);
                                }
                                if (field696 > var9.field3525 && var9.field3496 != null) {
                                    class81 var74 = new class81();
                                    var74.field1047 = var9;
                                    var74.field1062 = var9.field3496;
                                    field569.method5413(var74);
                                }
                                var9.field3525 = field680;
                                if (var9.field3509 != null) {
                                    for (int var75 = 0; var75 < field720; var75++) {
                                        class81 var76 = new class81();
                                        var76.field1047 = var9;
                                        var76.field1052 = field722[var75];
                                        var76.field1051 = field721[var75];
                                        var76.field1062 = var9.field3509;
                                        field569.method5413(var76);
                                    }
                                }
                                if (var9.field3444 != null) {
                                    int[] var77 = class24.method1966();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class81 var79 = new class81();
                                        var79.field1047 = var9;
                                        var79.field1052 = var77[var78];
                                        var79.field1062 = var9.field3444;
                                        field569.method5413(var79);
                                    }
                                }
                                if (var9.field3511 != null) {
                                    int[] var80 = class24.method4598();
                                    for (int var81 = 0; var81 < var80.length; var81++) {
                                        class81 var82 = new class81();
                                        var82.field1047 = var9;
                                        var82.field1052 = var80[var81];
                                        var82.field1062 = var9.field3511;
                                        field569.method5413(var82);
                                    }
                                }
                            }
                        }
                        if (!var9.field3394) {
                            if (field668 != null || Statics.field154 != null || field498) {
                                continue;
                            }
                            if ((var9.field3526 >= 0 || var9.field3422 != 0) && class33.field227 >= var13 && class33.field228 >= var14 && class33.field227 < var15 && class33.field228 < var16) {
                                if (var9.field3526 >= 0) {
                                    Statics.field1682 = arg0[var9.field3526];
                                } else {
                                    Statics.field1682 = var9;
                                }
                            }
                            if (var9.field3397 == 8 && class33.field227 >= var13 && class33.field228 >= var14 && class33.field227 < var15 && class33.field228 < var16) {
                                Statics.field1423 = var9;
                            }
                            if (var9.field3419 > var9.field3411) {
                                method2905(var9, var9.field3410 + var11, var12, var9.field3411, var9.field3419, class33.field227, class33.field228);
                            }
                        }
                        if (var9.field3397 == 0) {
                            method4219(arg0, var9.field3395, var13, var14, var15, var16, var11 - var9.field3433, var12 - var9.field3417);
                            if (var9.field3535 != null) {
                                method4219(var9.field3535, var9.field3395, var13, var14, var15, var16, var11 - var9.field3433, var12 - var9.field3417);
                            }
                            class80 var83 = (class80) field656.method6687((long) var9.field3395);
                            if (var83 != null) {
                                if (var83.field1036 == 0 && class33.field227 >= var13 && class33.field228 >= var14 && class33.field227 < var15 && class33.field228 < var16 && !field498) {
                                    for (class81 var84 = (class81) field569.method5431(); var84 != null; var84 = (class81) field569.method5419()) {
                                        if (var84.field1053) {
                                            var84.method6399();
                                            var84.field1047.field3536 = false;
                                        }
                                    }
                                    if (Statics.field316 == 0) {
                                        field668 = null;
                                        field669 = null;
                                    }
                                    if (!field498) {
                                        method260();
                                    }
                                }
                                method16(var83.field1044, var13, var14, var15, var16, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ee.js(II)Z")
    public static boolean method2757(int arg0) {
        for (int var1 = 0; var1 < field720; var1++) {
            if (field722[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("hw.jx(III)V")
    public static final void method4092(int arg0, int arg1) {
        if (class295.method4436(arg0)) {
            method4849(Statics.field1799[arg0], arg1);
        }
    }

    @ObfuscatedName("jv.jh([Lki;II)V")
    public static final void method4849(class295[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class295 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3397 == 0) {
                    if (var3.field3535 != null) {
                        method4849(var3.field3535, arg1);
                    }
                    class80 var4 = (class80) field656.method6687((long) var3.field3395);
                    if (var4 != null) {
                        method4092(var4.field1044, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3537 != null) {
                    class81 var5 = new class81();
                    var5.field1047 = var3;
                    var5.field1062 = var3.field3537;
                    class64.method2749(var5);
                }
                if (arg1 == 1 && var3.field3518 != null) {
                    if (var3.field3396 >= 0) {
                        class295 var6 = class295.method2248(var3.field3395);
                        if (var6 == null || var6.field3535 == null || var3.field3396 >= var6.field3535.length || var6.field3535[var3.field3396] != var3) {
                            continue;
                        }
                    }
                    class81 var7 = new class81();
                    var7.field1047 = var3;
                    var7.field1062 = var3.field3518;
                    class64.method2749(var7);
                }
            }
        }
    }

    @ObfuscatedName("y.jc(Lki;IIS)V")
    public static final void method88(class295 arg0, int arg1, int arg2) {
        if (field668 != null || field498 || arg0 == null || method2758(arg0) == null) {
            return;
        }
        field668 = arg0;
        field669 = method2758(arg0);
        field670 = arg1;
        field671 = arg2;
        Statics.field316 = 0;
        field679 = false;
        int var3 = field632 - 1;
        if (var3 != -1) {
            method2291(var3);
        }
    }

    @ObfuscatedName("client.jz(I)V")
    public final void method1078() {
        method5299(field668);
        Statics.field316++;
        if (field676 && field575) {
            int var1 = class33.field227;
            int var2 = class33.field228;
            int var3 = var1 - field670;
            int var4 = var2 - field671;
            if (var3 < field748) {
                var3 = field748;
            }
            if (field668.field3410 + var3 > field748 + field669.field3410) {
                var3 = field748 + field669.field3410 - field668.field3410;
            }
            if (var4 < field675) {
                var4 = field675;
            }
            if (field668.field3411 + var4 > field675 + field669.field3411) {
                var4 = field675 + field669.field3411 - field668.field3411;
            }
            int var5 = var3 - field654;
            int var6 = var4 - field613;
            int var7 = field668.field3544;
            if (Statics.field316 > field668.field3483 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field679 = true;
            }
            int var8 = field669.field3433 + (var3 - field748);
            int var9 = field669.field3417 + (var4 - field675);
            if (field668.field3529 != null && field679) {
                class81 var10 = new class81();
                var10.field1047 = field668;
                var10.field1048 = var8;
                var10.field1049 = var9;
                var10.field1062 = field668.field3529;
                class64.method2749(var10);
            }
            if (class33.field226 == 0) {
                if (field679) {
                    if (field668.field3438 != null) {
                        class81 var11 = new class81();
                        var11.field1047 = field668;
                        var11.field1048 = var8;
                        var11.field1049 = var9;
                        var11.field1057 = field672;
                        var11.field1062 = field668.field3438;
                        class64.method2749(var11);
                    }
                    if (field672 != null) {
                        class295 var12 = field668;
                        int var13 = method2406(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class295 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class295.method2248(var12.field3403);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class265 var18 = class265.method4070(class263.field3030, field734.field1344);
                            var18.field3075.method6877(field668.field3396);
                            var18.field3075.method6941(field672.field3395);
                            var18.field3075.method6877(field672.field3396);
                            var18.field3075.method6877(field672.field3531);
                            var18.field3075.method6942(field668.field3395);
                            var18.field3075.method6877(field668.field3531);
                            field734.method2362(var18);
                        }
                    }
                } else if (this.method1156()) {
                    this.method1496(field670 + field654, field671 + field613);
                } else if (field632 > 0) {
                    int var19 = field670 + field654;
                    int var20 = field671 + field613;
                    class67 var21 = Statics.field1472;
                    if (var21 != null) {
                        method5399(var21.field870, var21.field865, var21.field866, var21.field864, var21.field868, var21.field868, var19, var20);
                    }
                    Statics.field1472 = null;
                }
                field668 = null;
            }
        } else if (Statics.field316 > 1) {
            if (!field679 && field632 > 0) {
                int var22 = field670 + field654;
                int var23 = field671 + field613;
                class67 var24 = Statics.field1472;
                if (var24 != null) {
                    method5399(var24.field870, var24.field865, var24.field866, var24.field864, var24.field868, var24.field868, var22, var23);
                }
                Statics.field1472 = null;
            }
            field668 = null;
        }
    }

    @ObfuscatedName("cl.jl(IB)V")
    public static void method2291(int arg0) {
        Statics.field1472 = new class67();
        Statics.field1472.field870 = field505[arg0];
        Statics.field1472.field865 = field634[arg0];
        Statics.field1472.field866 = field635[arg0];
        Statics.field1472.field864 = field717[arg0];
        Statics.field1472.field868 = field637[arg0];
    }

    @ObfuscatedName("ld.kf(Lki;I)V")
    public static void method5299(class295 arg0) {
        if (arg0 != null && field695 == arg0.field3543) {
            field653[arg0.field3542] = true;
        }
    }

    @ObfuscatedName("da.ka(B)V")
    public static void method2592() {
        for (class80 var0 = (class80) field656.method6698(); var0 != null; var0 = (class80) field656.method6690()) {
            int var1 = var0.field1044;
            if (class295.method4436(var1)) {
                boolean var2 = true;
                class295[] var3 = Statics.field1799[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3394;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4468;
                    class295 var6 = class295.method2248(var5);
                    if (var6 != null) {
                        method5299(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.kn(Lki;B)Lki;")
    public static class295 method2758(class295 arg0) {
        class295 var1 = arg0;
        int var2 = method2406(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class295 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class295.method2248(var1.field3403);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class295 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field3481;
        }
        return var7;
    }

    @ObfuscatedName("ml.kh([Lki;II)V")
    public static final void method5602(class295[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class295 var3 = arg0[var2];
            if (var3 != null && var3.field3403 == arg1 && (!var3.field3394 || !method6822(var3))) {
                if (var3.field3397 == 0) {
                    if (!var3.field3394 && method6822(var3) && Statics.field1682 != var3) {
                        continue;
                    }
                    method5602(arg0, var3.field3395);
                    if (var3.field3535 != null) {
                        method5602(var3.field3535, var3.field3395);
                    }
                    class80 var4 = (class80) field656.method6687((long) var3.field3395);
                    if (var4 != null) {
                        int var5 = var4.field1044;
                        if (class295.method4436(var5)) {
                            method5602(Statics.field1799[var5], -1);
                        }
                    }
                }
                if (var3.field3397 == 6) {
                    if (var3.field3533 != -1 || var3.field3383 != -1) {
                        boolean var6 = method6380(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3383;
                        } else {
                            var7 = var3.field3533;
                        }
                        if (var7 != -1) {
                            class191 var8 = class191.method2497(var7);
                            var3.field3446 += field728;
                            while (var3.field3446 > var8.field2215[var3.field3478]) {
                                var3.field3446 -= var8.field2215[var3.field3478];
                                var3.field3478++;
                                if (var3.field3478 >= var8.field2213.length) {
                                    var3.field3478 -= var8.field2217;
                                    if (var3.field3478 < 0 || var3.field3478 >= var8.field2213.length) {
                                        var3.field3478 = 0;
                                    }
                                }
                                method5299(var3);
                            }
                        }
                    }
                    if (var3.field3452 != 0 && !var3.field3394) {
                        int var9 = var3.field3452 >> 16;
                        int var10 = var3.field3452 << 16 >> 16;
                        int var11 = field728 * var9;
                        int var12 = field728 * var10;
                        var3.field3447 = var3.field3447 + var11 & 0x7FF;
                        var3.field3486 = var3.field3486 + var12 & 0x7FF;
                        method5299(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.kk(IB)V")
    public static final void method1569(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        class202.method3608((double) var3);
        ((class210) Statics.field2382).method3917((double) var3);
        class189.method3151();
        Statics.field65.method2113((double) var3);
    }

    @ObfuscatedName("kt.kp(I)I")
    public static final int method5121() {
        float var0 = 200.0F * ((float) Statics.field65.method2106() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("kk.kl(IB)V")
    public static final void method4931(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field65.method2129()) {
            return;
        }
        if (Statics.field65.method2129() == 0 && field700 != -1) {
            class274.method2435(Statics.field4325, field700, 0, var1, false);
            field735 = false;
        } else if (var1 == 0) {
            class274.method1041();
            field735 = false;
        } else if (class274.field3237 == 0) {
            Statics.field3236.method4657(var1);
        } else {
            Statics.field1841 = var1;
        }
        Statics.field65.method2115(var1);
    }

    @ObfuscatedName("bt.ki(II)V")
    public static final void method1786(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field65.method2117(var1);
    }

    @ObfuscatedName("ae.kv(II)V")
    public static final void method584(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field65.method2159(var1);
    }

    @ObfuscatedName("lg.ks(II)V")
    public static final void method5317(int arg0) {
        method2592();
        for (class63 var1 = (class63) class63.field815.method5431(); var1 != null; var1 = (class63) class63.field815.method5419()) {
            if (var1.field819 != null) {
                var1.method1633();
            }
        }
        int var2 = class171.method274(arg0).field1860;
        if (var2 == 0) {
            return;
        }
        int var3 = class289.field3348[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class202.method3608(0.9D);
                ((class210) Statics.field2382).method3917(0.9D);
                class189.method3151();
                Statics.field65.method2113(0.9D);
            }
            if (var3 == 2) {
                class202.method3608(0.8D);
                ((class210) Statics.field2382).method3917(0.8D);
                class189.method3151();
                Statics.field65.method2113(0.8D);
            }
            if (var3 == 3) {
                class202.method3608(0.7D);
                ((class210) Statics.field2382).method3917(0.7D);
                class189.method3151();
                Statics.field65.method2113(0.7D);
            }
            if (var3 == 4) {
                class202.method3608(0.6D);
                ((class210) Statics.field2382).method3917(0.6D);
                class189.method3151();
                Statics.field65.method2113(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method4931(255);
            }
            if (var3 == 1) {
                method4931(192);
            }
            if (var3 == 2) {
                method4931(128);
            }
            if (var3 == 3) {
                method4931(64);
            }
            if (var3 == 4) {
                method4931(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method1786(127);
            }
            if (var3 == 1) {
                method1786(96);
            }
            if (var3 == 2) {
                method1786(64);
            }
            if (var3 == 3) {
                method1786(32);
            }
            if (var3 == 4) {
                method1786(0);
            }
        }
        if (var2 == 5) {
            field630 = var3;
        }
        if (var2 == 6) {
            field706 = var3;
        }
        if (var2 == 9) {
            field481 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method584(127);
            }
            if (var3 == 1) {
                method584(96);
            }
            if (var3 == 2) {
                method584(64);
            }
            if (var3 == 3) {
                method584(32);
            }
            if (var3 == 4) {
                method584(0);
            }
        }
        if (var2 == 17) {
            field665 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field506 = (class95) class330.method4934(class95.method1039(), var3);
            if (field506 == null) {
                field506 = class95.field1290;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field625 = -1;
            } else {
                field625 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field507 = (class95) class330.method4934(class95.method1039(), var3);
            if (field507 == null) {
                field507 = class95.field1290;
            }
        }
    }

    @ObfuscatedName("kw.kw(Lki;I)V")
    public static final void method5110(class295 arg0) {
        int var1 = arg0.field3399;
        if (var1 == 324) {
            if (field603 == -1) {
                field603 = arg0.field3515;
                field764 = arg0.field3431;
            }
            if (field762.field3361) {
                arg0.field3515 = field603;
            } else {
                arg0.field3515 = field764;
            }
        } else if (var1 == 325) {
            if (field603 == -1) {
                field603 = arg0.field3515;
                field764 = arg0.field3431;
            }
            if (field762.field3361) {
                arg0.field3515 = field764;
            } else {
                arg0.field3515 = field603;
            }
        } else if (var1 == 327) {
            arg0.field3447 = 150;
            arg0.field3486 = (int) (Math.sin((double) field631 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3439 = 5;
            arg0.field3508 = 0;
        } else if (var1 == 328) {
            arg0.field3447 = 150;
            arg0.field3486 = (int) (Math.sin((double) field631 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3439 = 5;
            arg0.field3508 = 1;
        }
    }

    @ObfuscatedName("kn.kj(I)V")
    public static final void method4907() {
        class265 var0 = class265.method4070(class263.field3002, field734.field1344);
        field734.method2362(var0);
        class64.field834 = true;
        for (class80 var1 = (class80) field656.method6698(); var1 != null; var1 = (class80) field656.method6690()) {
            if (var1.field1036 == 0 || var1.field1036 == 3) {
                method2943(var1, true);
            }
        }
        if (field661 != null) {
            method5299(field661);
            field661 = null;
        }
        class64.field834 = false;
    }

    @ObfuscatedName("ih.kb(IIIB)Lck;")
    public static final class80 method4443(int arg0, int arg1, int arg2) {
        class80 var3 = new class80();
        var3.field1044 = arg1;
        var3.field1036 = arg2;
        field656.method6688(var3, (long) arg0);
        Statics.method6163(arg1);
        class295 var4 = class295.method2248(arg0);
        method5299(var4);
        if (field661 != null) {
            method5299(field661);
            field661 = null;
        }
        method2443(Statics.field1799[arg0 >> 16], var4, false);
        class64.method4434(arg1);
        if (field543 != -1) {
            method4092(field543, 1);
        }
        return var3;
    }

    @ObfuscatedName("fh.kc(Lck;ZB)V")
    public static final void method2943(class80 arg0, boolean arg1) {
        int var2 = arg0.field1044;
        int var3 = (int) arg0.field4468;
        arg0.method6399();
        if (arg1 && var2 != -1 && Statics.field1526[var2]) {
            Statics.field1611.method5213(var2);
            if (Statics.field1799[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field1799[var2].length; var5++) {
                    if (Statics.field1799[var2][var5] != null) {
                        if (Statics.field1799[var2][var5].field3397 == 2) {
                            var4 = false;
                        } else {
                            Statics.field1799[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field1799[var2] = null;
                }
                Statics.field1526[var2] = false;
            }
        }
        for (class410 var6 = (class410) field701.method6698(); var6 != null; var6 = (class410) field701.method6690()) {
            if ((var6.field4468 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method6399();
            }
        }
        class295 var7 = class295.method2248(var3);
        if (var7 != null) {
            method5299(var7);
        }
        if (field543 != -1) {
            method4092(field543, 1);
        }
    }

    @ObfuscatedName("ap.kr(Lki;I)Z")
    public static final boolean method592(class295 arg0) {
        int var1 = arg0.field3399;
        if (var1 == 205) {
            field540 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field762.method4964(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field762.method4935(var4, var5 == 1);
        }
        if (var1 == 324) {
            field762.method4940(false);
        }
        if (var1 == 325) {
            field762.method4940(true);
        }
        if (var1 == 326) {
            class265 var6 = class265.method4070(class263.field3013, field734.field1344);
            field762.method4941(var6.field3075);
            field734.method2362(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("h.kx(Lki;IIIB)V")
    public static final void method257(class295 arg0, int arg1, int arg2, int arg3) {
        method1938();
        class288 var4 = arg0.method5071(false);
        if (var4 == null) {
            return;
        }
        class449.method7259(arg1, arg2, var4.field3341 + arg1, var4.field3340 + arg2);
        if (field733 == 2 || field733 == 5) {
            class449.method7216(arg1, arg2, 0, var4.field3343, var4.field3342);
        } else {
            int var5 = field523 & 0x7FF;
            int var6 = Statics.field2657.field1182 / 32 + 48;
            int var7 = 464 - Statics.field2657.field1138 / 32;
            Statics.field1043.method7337(arg1, arg2, var4.field3341, var4.field3340, var6, var7, var5, 256, var4.field3343, var4.field3342);
            for (int var8 = 0; var8 < field633; var8++) {
                int var9 = field737[var8] * 4 + 2 - Statics.field2657.field1182 / 32;
                int var10 = field729[var8] * 4 + 2 - Statics.field2657.field1138 / 32;
                method726(arg1, arg2, var9, var10, field709[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class335 var13 = field725[Statics.field1577][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2657.field1182 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2657.field1138 / 32;
                        method726(arg1, arg2, var14, var15, Statics.field2687[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field535; var16++) {
                class92 var17 = field534[field536[var16]];
                if (var17 != null && var17.method2009()) {
                    class179 var18 = var17.field1261;
                    if (var18 != null && var18.field1982 != null) {
                        var18 = var18.method3119();
                    }
                    if (var18 != null && var18.field1991 && var18.field1985) {
                        int var19 = var17.field1182 / 32 - Statics.field2657.field1182 / 32;
                        int var20 = var17.field1138 / 32 - Statics.field2657.field1138 / 32;
                        method726(arg1, arg2, var19, var20, Statics.field2687[1], var4);
                    }
                }
            }
            int var21 = class97.field1305;
            int[] var22 = class97.field1306;
            for (int var23 = 0; var23 < var21; var23++) {
                class85 var24 = field609[var22[var23]];
                if (var24 != null && var24.method2009() && !var24.field1115 && Statics.field2657 != var24) {
                    int var25 = var24.field1182 / 32 - Statics.field2657.field1182 / 32;
                    int var26 = var24.field1138 / 32 - Statics.field2657.field1138 / 32;
                    if (var24.method1996()) {
                        method726(arg1, arg2, var25, var26, Statics.field2687[3], var4);
                    } else if (Statics.field2657.field1112 != 0 && var24.field1112 != 0 && Statics.field2657.field1112 == var24.field1112) {
                        method726(arg1, arg2, var25, var26, Statics.field2687[4], var4);
                    } else if (var24.method2028()) {
                        method726(arg1, arg2, var25, var26, Statics.field2687[5], var4);
                    } else if (var24.method2018()) {
                        method726(arg1, arg2, var25, var26, Statics.field2687[6], var4);
                    } else {
                        method726(arg1, arg2, var25, var26, Statics.field2687[2], var4);
                    }
                }
            }
            if (field496 != 0 && field631 % 20 < 10) {
                if (field496 == 1 && field674 >= 0 && field674 < field534.length) {
                    class92 var27 = field534[field674];
                    if (var27 != null) {
                        int var28 = var27.field1182 / 32 - Statics.field2657.field1182 / 32;
                        int var29 = var27.field1138 / 32 - Statics.field2657.field1138 / 32;
                        method3033(arg1, arg2, var28, var29, Statics.field1697[1], var4);
                    }
                }
                if (field496 == 2) {
                    int var30 = field501 * 4 - Statics.field1001 * 4 + 2 - Statics.field2657.field1182 / 32;
                    int var31 = field502 * 4 - Statics.field477 * 4 + 2 - Statics.field2657.field1138 / 32;
                    method3033(arg1, arg2, var30, var31, Statics.field1697[1], var4);
                }
                if (field496 == 10 && field667 >= 0 && field667 < field609.length) {
                    class85 var32 = field609[field667];
                    if (var32 != null) {
                        int var33 = var32.field1182 / 32 - Statics.field2657.field1182 / 32;
                        int var34 = var32.field1138 / 32 - Statics.field2657.field1138 / 32;
                        method3033(arg1, arg2, var33, var34, Statics.field1697[1], var4);
                    }
                }
            }
            if (field731 != 0) {
                int var35 = field731 * 4 + 2 - Statics.field2657.field1182 / 32;
                int var36 = field732 * 4 + 2 - Statics.field2657.field1138 / 32;
                method726(arg1, arg2, var35, var36, Statics.field1697[0], var4);
            }
            if (!Statics.field2657.field1115) {
                class449.method7204(var4.field3341 / 2 + arg1 - 1, var4.field3340 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field705[arg3] = true;
    }

    @ObfuscatedName("e.kt(Lki;IIIB)V")
    public static final void method237(class295 arg0, int arg1, int arg2, int arg3) {
        class288 var4 = arg0.method5071(false);
        if (var4 == null) {
            return;
        }
        if (field733 < 3) {
            Statics.field318.method7337(arg1, arg2, var4.field3341, var4.field3340, 25, 25, field523, 256, var4.field3343, var4.field3342);
        } else {
            class449.method7216(arg1, arg2, 0, var4.field3343, var4.field3342);
        }
    }

    @ObfuscatedName("fe.ke(IIIILqr;Lka;B)V")
    public static final void method3033(int arg0, int arg1, int arg2, int arg3, class453 arg4, class288 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method726(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field523 & 0x7FF;
        int var8 = class202.field2402[var7];
        int var9 = class202.field2377[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3341 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field4168.method7354(arg5.field3341 / 2 + arg0 - var17 / 2 + var15, arg5.field3340 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("al.kz(IIIILqr;Lka;I)V")
    public static final void method726(int arg0, int arg1, int arg2, int arg3, class453 arg4, class288 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field523 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class202.field2402[var6];
        int var9 = class202.field2377[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method7309(arg5.field3341 / 2 + var10 - arg4.field4772 / 2, arg5.field3340 / 2 - var11 - arg4.field4776 / 2, arg0, arg1, arg5.field3341, arg5.field3340, arg5.field3343, arg5.field3342);
        } else {
            arg4.method7322(arg5.field3341 / 2 + arg0 + var10 - arg4.field4772 / 2, arg5.field3340 / 2 + arg1 - var11 - arg4.field4776 / 2);
        }
    }

    @ObfuscatedName("dr.ku(B)V")
    public static final void method2599() {
        Iterator var0 = class99.field1338.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1028();
        }
        if (Statics.field303 != null) {
            Statics.field303.method5968();
        }
    }

    @ObfuscatedName("gx.ko(I)V")
    public static final void method3902() {
        field690 = field680;
    }

    @ObfuscatedName("gc.kq(B)V")
    public static final void method3501() {
        field691 = field680;
        Statics.field404 = true;
    }

    @ObfuscatedName("fu.km(I)V")
    public static final void method3084() {
        field692 = field680;
        Statics.field998 = true;
    }

    @ObfuscatedName("h.kg(Ljava/lang/String;I)V")
    public static final void method258(String arg0) {
        if (Statics.field303 != null) {
            class265 var1 = class265.method4070(class263.field2984, field734.field1344);
            var1.field3075.method6876(class440.method6331(arg0));
            var1.field3075.method6883(arg0);
            field734.method2362(var1);
        }
    }

    @ObfuscatedName("kj.ky(Ljava/lang/String;I)V")
    public static final void method5111(String arg0) {
        if (!arg0.equals("")) {
            class265 var1 = class265.method4070(class263.field2971, field734.field1344);
            var1.field3075.method6876(class440.method6331(arg0));
            var1.field3075.method6883(arg0);
            field734.method2362(var1);
        }
    }

    @ObfuscatedName("co.lf(B)V")
    public static final void method1958() {
        class265 var0 = class265.method4070(class263.field2971, field734.field1344);
        var0.field3075.method6876(0);
        field734.method2362(var0);
    }

    @ObfuscatedName("ck.le(III)V")
    public static final void method1964(int arg0, int arg1) {
        class149 var2 = arg0 >= 0 ? field765[arg0] : Statics.field1403;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2763()) {
            return;
        }
        class131 var3 = (class131) var2.field1708.get(arg1);
        if (var3.field1587 != -1) {
            return;
        }
        String var4 = var3.field1583.method7492();
        class265 var5 = class265.method4070(class263.field3041, field734.field1344);
        var5.field3075.method6876(3 + class440.method6331(var4));
        var5.field3075.method6876(arg0);
        var5.field3075.method6877(arg1);
        var5.field3075.method6883(var4);
        field734.method2362(var5);
    }

    @ObfuscatedName("ev.li(III)V")
    public static final void method2746(int arg0, int arg1) {
        if (field765[arg0] == null || arg1 < 0 || arg1 >= field765[arg0].method2763()) {
            return;
        }
        class131 var2 = (class131) field765[arg0].field1708.get(arg1);
        if (var2.field1587 != -1) {
            return;
        }
        class265 var3 = class265.method4070(class263.field2959, field734.field1344);
        var3.field3075.method6876(3 + class440.method6331(var2.field1583.method7492()));
        var3.field3075.method6876(arg0);
        var3.field3075.method6877(arg1);
        var3.field3075.method6883(var2.field1583.method7492());
        field734.method2362(var3);
    }

    @ObfuscatedName("fn.lp(IIZI)V")
    public static final void method2962(int arg0, int arg1, boolean arg2) {
        if (field765[arg0] == null || arg1 < 0 || arg1 >= field765[arg0].method2763()) {
            return;
        }
        class131 var3 = (class131) field765[arg0].field1708.get(arg1);
        class265 var4 = class265.method4070(class263.field2994, field734.field1344);
        var4.field3075.method6876(4 + class440.method6331(var3.field1583.method7492()));
        var4.field3075.method6876(arg0);
        var4.field3075.method6877(arg1);
        var4.field3075.method6882(arg2);
        var4.field3075.method6883(var3.field1583.method7492());
        field734.method2362(var4);
    }

    @ObfuscatedName("ce.lc(Lki;B)I")
    public static int method2406(class295 arg0) {
        class410 var1 = (class410) field701.method6687(((long) arg0.field3395 << 32) + (long) arg0.field3396);
        return var1 == null ? arg0.field3473 : var1.field4465;
    }

    @ObfuscatedName("ps.lb(Lki;I)Z")
    public static boolean method6822(class295 arg0) {
        return arg0.field3415;
    }

    @ObfuscatedName("gd.ld(Lki;II)Ljava/lang/String;")
    public static String method3498(class295 arg0, int arg1) {
        if (!class296.method1785(method2406(arg0), arg1) && arg0.field3506 == null) {
            return null;
        } else if (arg0.field3480 == null || arg0.field3480.length <= arg1 || arg0.field3480[arg1] == null || arg0.field3480[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3480[arg1];
        }
    }

    @ObfuscatedName("nq.la(Lki;B)Ljava/lang/String;")
    public static String method6103(class295 arg0) {
        if (class296.method4455(method2406(arg0)) == 0) {
            return null;
        } else if (arg0.field3485 == null || arg0.field3485.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3485;
        }
    }

    @ObfuscatedName("hj.lw(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method4382(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field597 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field597 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field597 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field597 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field597 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field663 != null) {
            var3 = "/p=" + Statics.field663;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3066 + "/a=" + Statics.field2808 + var3 + "/";
    }

    @ObfuscatedName("cw.lg(Ljava/lang/String;B)V")
    public static void method2250(String arg0) {
        Statics.field663 = arg0;
        try {
            String var1 = Statics.field1075.getParameter(Integer.toString(18));
            String var2 = Statics.field1075.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class270.method2485() + 94608000000L;
                class285.field3334.setTime(new Date(var6));
                int var8 = class285.field3334.get(7);
                int var9 = class285.field3334.get(5);
                int var10 = class285.field3334.get(2);
                int var11 = class285.field3334.get(1);
                int var12 = class285.field3334.get(11);
                int var13 = class285.field3334.get(12);
                int var14 = class285.field3334.get(13);
                String var15 = class285.field3335[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class285.field3336[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field1075;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("am.lj(Ljava/lang/String;ZB)V")
    public static void method369(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1020; var5++) {
            class189 var6 = class189.method2903(var5);
            if ((!arg1 || var6.field2138) && var6.field2176 == -1 && var6.field2183.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1398 = -1;
                    Statics.field2032 = null;
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
        Statics.field2032 = var3;
        Statics.field3352 = 0;
        Statics.field1398 = var4;
        String[] var9 = new String[Statics.field1398];
        for (int var10 = 0; var10 < Statics.field1398; var10++) {
            var9[var10] = class189.method2903(var3[var10]).field2183;
        }
        short[] var11 = Statics.field2032;
        Statics.method3911(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("hi.ln(Lpx;II)V")
    public static void method4063(class440 arg0, int arg1) {
        byte[] var2 = arg0.field4679;
        if (field533 == null) {
            field533 = new byte[24];
        }
        class352.method5827(var2, arg1, field533, 0, 24);
        if (class158.field1771 == null) {
            return;
        }
        try {
            class158.field1771.method6746(0L);
            class158.field1771.method6751(arg0.field4679, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("qz.ly(Lpx;B)V")
    public static void method7486(class440 arg0) {
        if (field533 != null) {
            arg0.method6886(field533, 0, field533.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class158.field1771.method6746(0L);
            class158.field1771.method6748(var1);
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
        arg0.method6886(var1, 0, var1.length);
    }

    @ObfuscatedName("client.lt(B)Lqv;")
    public class461 method1079() {
        return Statics.field2657 == null ? null : Statics.field2657.field1100;
    }

    @ObfuscatedName("dt.lh(IIIZB)V")
    public static void method2633(int arg0, int arg1, int arg2, boolean arg3) {
        class265 var4 = class265.method4070(class263.field2956, field734.field1344);
        var4.field3075.method6929(arg1);
        var4.field3075.method6928(arg0);
        var4.field3075.method6974(arg2);
        var4.field3075.method6942(arg3 ? field483 : 0);
        field734.method2362(var4);
    }

    @ObfuscatedName("gd.ls(II)V")
    public static void method3497(int arg0) {
        field698 = arg0;
    }

    @ObfuscatedName("a.lk(I)V")
    public static void method18() {
        field734.method2362(class265.method4070(class263.field3021, field734.field1344));
        field698 = 0;
    }

    @ObfuscatedName("eb.lu(I)V")
    public static void method2672() {
        if (field698 == 1) {
            field576 = true;
        }
    }

    @ObfuscatedName("ei.lq(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method2783(String arg0) {
        class311[] var1 = class311.method2590();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class311 var3 = var1[var2];
            if (var3.field3988 != -1 && arg0.startsWith(class93.method5122(var3.field3988))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3988).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cj.lz(I)V")
    public static void method2413() {
        if (Statics.field1571 == null) {
            return;
        }
        field768 = field631;
        Statics.field1571.method5369();
        for (int var0 = 0; var0 < field609.length; var0++) {
            if (field609[var0] != null) {
                Statics.field1571.method5366((field609[var0].field1182 >> 7) + Statics.field1001, (field609[var0].field1138 >> 7) + Statics.field477);
            }
        }
    }

    @ObfuscatedName("dl.lx(S)Z")
    public static boolean method2578() {
        return Statics.field65.method2124() >= field485;
    }

    @ObfuscatedName("u.lr(IB)V")
    public static void method340(int arg0) {
        if (field552 != arg0) {
            field552 = arg0;
        }
    }
}

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

public final class client extends class35 implements class447, OAuthApi, class328 {

    @ObfuscatedName("client.bv")
    public static boolean field804 = true;

    @ObfuscatedName("client.bg")
    public static int field509 = 1;

    @ObfuscatedName("client.cb")
    public static int field510 = 0;

    @ObfuscatedName("client.cr")
    public static int field511 = 0;

    @ObfuscatedName("client.cl")
    public static boolean field512 = false;

    @ObfuscatedName("client.cw")
    public static boolean field658 = false;

    @ObfuscatedName("client.cc")
    public static int field514 = -1;

    @ObfuscatedName("client.cn")
    public static int field508 = -1;

    @ObfuscatedName("client.ce")
    public static int field795 = -1;

    @ObfuscatedName("client.cp")
    public static boolean field517 = false;

    @ObfuscatedName("client.dj")
    public static int field519 = 0;

    @ObfuscatedName("client.dn")
    public static boolean field520 = false;

    @ObfuscatedName("client.dl")
    public static boolean field789 = false;

    @ObfuscatedName("client.da")
    public static boolean field522 = true;

    @ObfuscatedName("client.do")
    public static int field523 = 0;

    @ObfuscatedName("client.dx")
    public static long field675 = 1L;

    @ObfuscatedName("client.dv")
    public static int field796 = -1;

    @ObfuscatedName("client.dr")
    public static int field526 = -1;

    @ObfuscatedName("client.dw")
    public static long field527 = -1L;

    @ObfuscatedName("client.dg")
    public static boolean field528 = true;

    @ObfuscatedName("client.db")
    public static int field529 = 0;

    @ObfuscatedName("client.di")
    public static int field530 = 0;

    @ObfuscatedName("client.dq")
    public static int field531 = 0;

    @ObfuscatedName("client.dy")
    public static int field532 = 0;

    @ObfuscatedName("client.dt")
    public static int field533 = 0;

    @ObfuscatedName("client.de")
    public static int field621 = 0;

    @ObfuscatedName("client.dz")
    public static int field535 = 0;

    @ObfuscatedName("client.dh")
    public static int field536 = 0;

    @ObfuscatedName("client.ds")
    public static int field713 = 0;

    @ObfuscatedName("client.dk")
    public static class105 field538 = class105.field1360;

    @ObfuscatedName("client.du")
    public static class105 field539 = class105.field1360;

    @ObfuscatedName("client.ej")
    public static boolean field540 = false;

    @ObfuscatedName("client.ea")
    public static class94 field541 = class94.field1153;

    @ObfuscatedName("client.es")
    public static int field542 = 0;

    @ObfuscatedName("client.ee")
    public static int field543 = 0;

    @ObfuscatedName("client.fu")
    public static int field544 = 0;

    @ObfuscatedName("client.fk")
    public static int field545 = 0;

    @ObfuscatedName("client.fr")
    public static int field668 = 0;

    @ObfuscatedName("client.fh")
    public static int field547 = 0;

    @ObfuscatedName("client.fy")
    public static class141 field548 = class141.field1657;

    @ObfuscatedName("client.fw")
    public static class540 field811 = class540.field5291;

    @ObfuscatedName("client.gj")
    public String field550;

    @ObfuscatedName("client.gn")
    public class15 field619;

    @ObfuscatedName("client.gi")
    public class19 field552;

    @ObfuscatedName("client.gc")
    public OtlTokenRequester field807;

    @ObfuscatedName("client.gk")
    public Future field554;

    @ObfuscatedName("client.gf")
    public boolean field791 = false;

    @ObfuscatedName("client.gm")
    public int field518 = 0;

    @ObfuscatedName("client.gv")
    public class19 field655;

    @ObfuscatedName("client.gq")
    public RefreshAccessTokenRequester field525;

    @ObfuscatedName("client.gh")
    public Future field559;

    @ObfuscatedName("client.gy")
    public static final String field782 = class406.method2875(class404.method397("com_jagex_auth_desktop_osrs:public"));

    @ObfuscatedName("client.gd")
    public static final String field560 = class406.method2875(class404.method397("com_jagex_auth_desktop_runelite:public"));

    @ObfuscatedName("client.hv")
    public static boolean field643 = false;

    @ObfuscatedName("client.ha")
    public static class79 field564 = new class79();

    @ObfuscatedName("client.hm")
    public class535 field565;

    @ObfuscatedName("client.hx")
    public class8 field566;

    @ObfuscatedName("client.hh")
    public long field567 = -1L;

    @ObfuscatedName("client.ho")
    public static byte[] field595 = null;

    @ObfuscatedName("client.hj")
    public static class102[] field569 = new class102[65536];

    @ObfuscatedName("client.hl")
    public static int field645 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field724 = new int[65536];

    @ObfuscatedName("client.hz")
    public static int field572 = 0;

    @ObfuscatedName("client.he")
    public static int[] field743 = new int[250];

    @ObfuscatedName("client.hn")
    public static final class113 field574 = new class113();

    @ObfuscatedName("client.hk")
    public static int field575 = 0;

    @ObfuscatedName("client.ib")
    public static boolean field576 = false;

    @ObfuscatedName("client.if")
    public static class434 field577 = new class434();

    @ObfuscatedName("client.ij")
    public static HashMap field624 = new HashMap();

    @ObfuscatedName("client.id")
    public static int field579 = 0;

    @ObfuscatedName("client.it")
    public static String field677 = null;

    @ObfuscatedName("client.ig")
    public static int field580 = 1;

    @ObfuscatedName("client.iv")
    public static int field728 = 0;

    @ObfuscatedName("client.iy")
    public static int field582 = 1;

    @ObfuscatedName("client.ip")
    public static int field583 = 0;

    @ObfuscatedName("client.jj")
    public static class230[] field584 = new class230[4];

    @ObfuscatedName("client.jf")
    public static boolean field570 = false;

    @ObfuscatedName("client.jk")
    public static int[][][] field586 = new int[4][13][13];

    @ObfuscatedName("client.jb")
    public static final int[] field587 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.jr")
    public static int field588 = -1;

    @ObfuscatedName("client.jt")
    public static int field546 = 0;

    @ObfuscatedName("client.jx")
    public static int field561 = 2301979;

    @ObfuscatedName("client.ji")
    public static int field591 = 5063219;

    @ObfuscatedName("client.js")
    public static int field625 = 3353893;

    @ObfuscatedName("client.jw")
    public static int field593 = 7759444;

    @ObfuscatedName("client.ko")
    public static boolean field602 = false;

    @ObfuscatedName("client.kb")
    public static int field537 = 0;

    @ObfuscatedName("client.ki")
    public static int field568 = 128;

    @ObfuscatedName("client.ks")
    public static int field597 = 0;

    @ObfuscatedName("client.ky")
    public static int field753 = 0;

    @ObfuscatedName("client.kf")
    public static int field704 = 0;

    @ObfuscatedName("client.kr")
    public static int field600 = 0;

    @ObfuscatedName("client.kh")
    public static int field601 = 0;

    @ObfuscatedName("client.kg")
    public static int field589 = 0;

    @ObfuscatedName("client.kn")
    public static int field551 = 50;

    @ObfuscatedName("client.kp")
    public static int field710 = 0;

    @ObfuscatedName("client.kl")
    public static int field581 = 0;

    @ObfuscatedName("client.kc")
    public static int field606 = 0;

    @ObfuscatedName("client.kw")
    public static int field676 = 12;

    @ObfuscatedName("client.kz")
    public static int field608 = 6;

    @ObfuscatedName("client.lj")
    public static int field609 = 0;

    @ObfuscatedName("client.lb")
    public static boolean field610 = false;

    @ObfuscatedName("client.lv")
    public static int field611 = 0;

    @ObfuscatedName("client.lm")
    public static boolean field641 = false;

    @ObfuscatedName("client.lh")
    public static int field613 = 0;

    @ObfuscatedName("client.lz")
    public static int field614 = 0;

    @ObfuscatedName("client.lg")
    public static int field615 = 50;

    @ObfuscatedName("client.ln")
    public static int[] field616 = new int[field615];

    @ObfuscatedName("client.lq")
    public static int[] field617 = new int[field615];

    @ObfuscatedName("client.la")
    public static int[] field776 = new int[field615];

    @ObfuscatedName("client.ld")
    public static int[] field605 = new int[field615];

    @ObfuscatedName("client.lr")
    public static int[] field620 = new int[field615];

    @ObfuscatedName("client.lc")
    public static int[] field794 = new int[field615];

    @ObfuscatedName("client.ls")
    public static int[][] field780 = new int[field615][];

    @ObfuscatedName("client.li")
    public static int[] field637 = new int[field615];

    @ObfuscatedName("client.ly")
    public static String[] field752 = new String[field615];

    @ObfuscatedName("client.lx")
    public static int[][] field652 = new int[104][104];

    @ObfuscatedName("client.lt")
    public static int field626 = 0;

    @ObfuscatedName("client.ll")
    public static int field773 = -1;

    @ObfuscatedName("client.lp")
    public static int field563 = -1;

    @ObfuscatedName("client.le")
    public static int field555 = 0;

    @ObfuscatedName("client.lf")
    public static int field596 = 0;

    @ObfuscatedName("client.lu")
    public static int field631 = 0;

    @ObfuscatedName("client.lo")
    public static int field556 = 0;

    @ObfuscatedName("client.lw")
    public static boolean field633 = true;

    @ObfuscatedName("client.lk")
    public static int field751 = 0;

    @ObfuscatedName("client.mi")
    public static boolean field635 = true;

    @ObfuscatedName("client.mo")
    public static class93[] field636 = new class93[2048];

    @ObfuscatedName("client.mc")
    public static int field578 = -1;

    @ObfuscatedName("client.mp")
    public static int field784 = 0;

    @ObfuscatedName("client.mm")
    public static long field639 = -1L;

    @ObfuscatedName("client.mb")
    public static long field640 = -1L;

    @ObfuscatedName("client.mx")
    public static boolean field599 = true;

    @ObfuscatedName("client.mz")
    public static int field642 = 0;

    @ObfuscatedName("client.my")
    public static int field638 = 0;

    @ObfuscatedName("client.ms")
    public static int[] field644 = new int[1000];

    @ObfuscatedName("client.me")
    public static final int[] field649 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.mw")
    public static String[] field665 = new String[8];

    @ObfuscatedName("client.ml")
    public static boolean[] field647 = new boolean[8];

    @ObfuscatedName("client.mk")
    public static int[] field648 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.mq")
    public static int field592 = -1;

    @ObfuscatedName("client.mu")
    public static class398[][][] field650 = new class398[4][104][104];

    @ObfuscatedName("client.mt")
    public static class398 field651 = new class398();

    @ObfuscatedName("client.nn")
    public static class398 field524 = new class398();

    @ObfuscatedName("client.nc")
    public static class398 field653 = new class398();

    @ObfuscatedName("client.nm")
    public static int[] field654 = new int[25];

    @ObfuscatedName("client.na")
    public static int[] field666 = new int[25];

    @ObfuscatedName("client.no")
    public static int[] field814 = new int[25];

    @ObfuscatedName("client.nj")
    public static int[] field657 = new int[25];

    @ObfuscatedName("client.nr")
    public static boolean field810 = false;

    @ObfuscatedName("client.ny")
    public static boolean field607 = false;

    @ObfuscatedName("client.nk")
    public static int field660 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field661 = new int[500];

    @ObfuscatedName("client.ni")
    public static int[] field662 = new int[500];

    @ObfuscatedName("client.ns")
    public static int[] field663 = new int[500];

    @ObfuscatedName("client.nb")
    public static int[] field664 = new int[500];

    @ObfuscatedName("client.nv")
    public static int[] field603 = new int[500];

    @ObfuscatedName("client.nh")
    public static String[] field585 = new String[500];

    @ObfuscatedName("client.nd")
    public static String[] field667 = new String[500];

    @ObfuscatedName("client.ng")
    public static boolean[] field695 = new boolean[500];

    @ObfuscatedName("client.nx")
    public static boolean field669 = false;

    @ObfuscatedName("client.np")
    public static boolean field670 = false;

    @ObfuscatedName("client.nu")
    public static boolean field671 = true;

    @ObfuscatedName("client.ot")
    public static int field672 = -1;

    @ObfuscatedName("client.on")
    public static int field673 = -1;

    @ObfuscatedName("client.om")
    public static int field674 = 0;

    @ObfuscatedName("client.or")
    public static int field623 = 50;

    @ObfuscatedName("client.oe")
    public static int field714 = 0;

    @ObfuscatedName("client.of")
    public static boolean field678 = false;

    @ObfuscatedName("client.ov")
    public static int field679 = -1;

    @ObfuscatedName("client.op")
    public static int field689 = -1;

    @ObfuscatedName("client.oc")
    public static String field558 = null;

    @ObfuscatedName("client.ow")
    public static String field802 = null;

    @ObfuscatedName("client.ou")
    public static int field683 = -1;

    @ObfuscatedName("client.od")
    public static class509 field684 = new class509(8);

    @ObfuscatedName("client.og")
    public static int field685 = 0;

    @ObfuscatedName("client.oa")
    public static int field686 = -1;

    @ObfuscatedName("client.oz")
    public static int field687 = 0;

    @ObfuscatedName("client.ol")
    public static class350 field688 = null;

    @ObfuscatedName("client.pj")
    public static int field634 = 0;

    @ObfuscatedName("client.pk")
    public static int field690 = 0;

    @ObfuscatedName("client.pb")
    public static int field691 = 0;

    @ObfuscatedName("client.pv")
    public static int field734 = -1;

    @ObfuscatedName("client.pm")
    public static boolean field693 = false;

    @ObfuscatedName("client.pc")
    public static class350 field694 = null;

    @ObfuscatedName("client.pq")
    public static class350 field618 = null;

    @ObfuscatedName("client.ps")
    public static class350 field696 = null;

    @ObfuscatedName("client.py")
    public static int field697 = 0;

    @ObfuscatedName("client.pr")
    public static int field698 = 0;

    @ObfuscatedName("client.pp")
    public static class350 field699 = null;

    @ObfuscatedName("client.po")
    public static boolean field700 = false;

    @ObfuscatedName("client.pa")
    public static int field701 = -1;

    @ObfuscatedName("client.pe")
    public static int field702 = -1;

    @ObfuscatedName("client.pd")
    public static boolean field703 = false;

    @ObfuscatedName("client.pu")
    public static int field571 = -1;

    @ObfuscatedName("client.pw")
    public static int field705 = -1;

    @ObfuscatedName("client.ph")
    public static boolean field706 = false;

    @ObfuscatedName("client.pt")
    public static int field707 = 1;

    @ObfuscatedName("client.pf")
    public static int[] field708 = new int[32];

    @ObfuscatedName("client.qt")
    public static int field709 = 0;

    @ObfuscatedName("client.qu")
    public static int[] field573 = new int[32];

    @ObfuscatedName("client.qs")
    public static int field711 = 0;

    @ObfuscatedName("client.qe")
    public static int[] field712 = new int[32];

    @ObfuscatedName("client.qn")
    public static int field659 = 0;

    @ObfuscatedName("client.qp")
    public static int[] field632 = new int[32];

    @ObfuscatedName("client.qo")
    public static int field715 = 0;

    @ObfuscatedName("client.qw")
    public static int field716 = 0;

    @ObfuscatedName("client.qz")
    public static int field717 = 0;

    @ObfuscatedName("client.qh")
    public static int field718 = 0;

    @ObfuscatedName("client.qc")
    public static int field682 = 0;

    @ObfuscatedName("client.ql")
    public static int field720 = 0;

    @ObfuscatedName("client.qk")
    public static int field721 = 0;

    @ObfuscatedName("client.qq")
    public static int field722 = 0;

    @ObfuscatedName("client.qv")
    public static int field723 = 0;

    @ObfuscatedName("client.qa")
    public static int field553 = 0;

    @ObfuscatedName("client.qx")
    public static class553 field725 = new class553();

    @ObfuscatedName("client.qg")
    public static class398 field726 = new class398();

    @ObfuscatedName("client.qy")
    public static class398 field594 = new class398();

    @ObfuscatedName("client.qf")
    public static class398 field521 = new class398();

    @ObfuscatedName("client.qj")
    public static class398 field727 = new class398();

    @ObfuscatedName("client.rl")
    public static class509 field730 = new class509(512);

    @ObfuscatedName("client.rv")
    public static int field731 = 0;

    @ObfuscatedName("client.rp")
    public static int field732 = -2;

    @ObfuscatedName("client.rd")
    public static boolean[] field733 = new boolean[100];

    @ObfuscatedName("client.ri")
    public static boolean[] field817 = new boolean[100];

    @ObfuscatedName("client.rx")
    public static boolean[] field735 = new boolean[100];

    @ObfuscatedName("client.rh")
    public static int[] field736 = new int[100];

    @ObfuscatedName("client.rf")
    public static int[] field737 = new int[100];

    @ObfuscatedName("client.ry")
    public static int[] field738 = new int[100];

    @ObfuscatedName("client.rr")
    public static int[] field681 = new int[100];

    @ObfuscatedName("client.rg")
    public static int field740 = 0;

    @ObfuscatedName("client.ru")
    public static long field741 = 0L;

    @ObfuscatedName("client.rn")
    public static boolean field742 = true;

    @ObfuscatedName("client.ra")
    public static int[] field739 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.rc")
    public static int field744 = 0;

    @ObfuscatedName("client.rz")
    public static int field629 = 0;

    @ObfuscatedName("client.re")
    public static String field746 = "";

    @ObfuscatedName("client.se")
    public static long[] field747 = new long[100];

    @ObfuscatedName("client.sh")
    public static int field748 = 0;

    @ObfuscatedName("client.sq")
    public static class229 field749 = new class229();

    @ObfuscatedName("client.sy")
    public static class227 field750 = new class227();

    @ObfuscatedName("client.sk")
    public static int field612 = 0;

    @ObfuscatedName("client.so")
    public static int[] field513 = new int[128];

    @ObfuscatedName("client.sz")
    public static int[] field768 = new int[128];

    @ObfuscatedName("client.sj")
    public static long field754 = -1L;

    @ObfuscatedName("client.sv")
    public static class156[] field755 = new class156[4];

    @ObfuscatedName("client.sx")
    public static class165[] field756 = new class165[4];

    @ObfuscatedName("client.ss")
    public static int field757 = -1;

    @ObfuscatedName("client.sw")
    public static int field628 = 0;

    @ObfuscatedName("client.sa")
    public static int[] field759 = new int[1000];

    @ObfuscatedName("client.sn")
    public static int[] field760 = new int[1000];

    @ObfuscatedName("client.st")
    public static class549[] field761 = new class549[1000];

    @ObfuscatedName("client.sf")
    public static int field762 = 0;

    @ObfuscatedName("client.sr")
    public static int field763 = 0;

    @ObfuscatedName("client.th")
    public static int field764 = 0;

    @ObfuscatedName("client.ts")
    public static boolean field719 = false;

    @ObfuscatedName("client.tg")
    public static int field766 = 0;

    @ObfuscatedName("client.ty")
    public static int[] field767 = new int[50];

    @ObfuscatedName("client.td")
    public static int[] field557 = new int[50];

    @ObfuscatedName("client.tn")
    public static int[] field769 = new int[50];

    @ObfuscatedName("client.to")
    public static int[] field770 = new int[50];

    @ObfuscatedName("client.tv")
    public static int[] field771 = new int[50];

    @ObfuscatedName("client.tu")
    public static class40[] field772 = new class40[50];

    @ObfuscatedName("client.tx")
    public static boolean field516 = false;

    @ObfuscatedName("client.tc")
    public static boolean field604 = false;

    @ObfuscatedName("client.tt")
    public static boolean field775 = false;

    @ObfuscatedName("client.tk")
    public static boolean field515 = false;

    @ObfuscatedName("client.uv")
    public static class500 field777 = null;

    @ObfuscatedName("client.uh")
    public static class499 field778 = null;

    @ObfuscatedName("client.uw")
    public static class499 field779 = null;

    @ObfuscatedName("client.uu")
    public static boolean field627 = false;

    @ObfuscatedName("client.uq")
    public static boolean[] field781 = new boolean[5];

    @ObfuscatedName("client.ux")
    public static int[] field745 = new int[5];

    @ObfuscatedName("client.ug")
    public static int[] field783 = new int[5];

    @ObfuscatedName("client.uf")
    public static int[] field549 = new int[5];

    @ObfuscatedName("client.us")
    public static int[] field785 = new int[5];

    @ObfuscatedName("client.uc")
    public static short field786 = 256;

    @ObfuscatedName("client.ue")
    public static short field787 = 205;

    @ObfuscatedName("client.uz")
    public static short field788 = 256;

    @ObfuscatedName("client.ui")
    public static short field805 = 320;

    @ObfuscatedName("client.um")
    public static short field790 = 1;

    @ObfuscatedName("client.vj")
    public static short field729 = 32767;

    @ObfuscatedName("client.vl")
    public static short field792 = 1;

    @ObfuscatedName("client.vg")
    public static short field793 = 32767;

    @ObfuscatedName("client.vq")
    public static int field765 = 0;

    @ObfuscatedName("client.vi")
    public static int field646 = 0;

    @ObfuscatedName("client.vb")
    public static int field692 = 0;

    @ObfuscatedName("client.vv")
    public static int field797 = 0;

    @ObfuscatedName("client.vc")
    public static int field798 = 0;

    @ObfuscatedName("client.vd")
    public static class347 field799 = new class347();

    @ObfuscatedName("client.vp")
    public static int field800 = -1;

    @ObfuscatedName("client.vx")
    public static int field801 = -1;

    @ObfuscatedName("client.vk")
    public static class496 field622 = new class494();

    @ObfuscatedName("client.va")
    public static class388[] field803 = new class388[8];

    @ObfuscatedName("client.vh")
    public static class67 field758 = new class67();

    @ObfuscatedName("client.vz")
    public static class444 field598 = new class444(8, class442.field4749);

    @ObfuscatedName("client.vt")
    public static class304 field806 = new class304(64);

    @ObfuscatedName("client.vf")
    public static class304 field680 = new class304(64);

    @ObfuscatedName("client.wc")
    public static int field808 = -1;

    @ObfuscatedName("client.wm")
    public static int field809 = -1;

    @ObfuscatedName("client.wn")
    public static List field534 = new ArrayList();

    @ObfuscatedName("client.wl")
    public static final class235 field630 = new class235();

    @ObfuscatedName("client.wy")
    public static ArrayList field812 = new ArrayList(10);

    @ObfuscatedName("client.ww")
    public static int field813 = 0;

    @ObfuscatedName("client.wp")
    public static int field774 = 0;

    @ObfuscatedName("client.wk")
    public static final class66 field815 = new class66();

    @ObfuscatedName("client.wo")
    public static int[] field816 = new int[50];

    @ObfuscatedName("client.wx")
    public static int[] field656 = new int[50];

    @ObfuscatedName("cv.gc(I)Lta;")
    public static class495 method1827() {
        return Statics.field1811;
    }

    @ObfuscatedName("dw.gk(S)Ltl;")
    public static class503 method2215() {
        return Statics.field4536;
    }

    @ObfuscatedName("client.bi(I)V")
    public final void method479() {
    }

    public final void init() {
        if (!this.method529()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class103.field1347)) {
                            field512 = true;
                        } else {
                            field512 = false;
                        }
                        break;
                    case 4:
                        if (field508 == -1) {
                            field508 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field510 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var3 = Integer.parseInt(var2);
                        class394 var4;
                        if (var3 >= 0 && var3 < class394.field4518.length) {
                            var4 = class394.field4518[var3];
                        } else {
                            var4 = null;
                        }
                        Statics.field896 = var4;
                        break;
                    case 7:
                        Statics.field1326 = class365.method3965(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class103.field1347)) {
                        }
                        break;
                    case 9:
                        Statics.field2869 = var2;
                        break;
                    case 10:
                        class366[] var5 = new class366[] { class366.field3984, class366.field3987, class366.field3983, class366.field3989, class366.field3982, class366.field3990 };
                        Statics.field2090 = (class366) class393.method3484(var5, Integer.parseInt(var2));
                        if (Statics.field2090 == class366.field3990) {
                            Statics.field1527 = class513.field5111;
                        } else {
                            Statics.field1527 = class513.field5119;
                        }
                        break;
                    case 11:
                        Statics.field1055 = var2;
                        break;
                    case 12:
                        field509 = Integer.parseInt(var2);
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
                        Statics.field3046 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field511 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1539 = var2;
                        break;
                    case 21:
                        field514 = Integer.parseInt(var2);
                        break;
                    case 22:
                        Statics.field155 = var2;
                        break;
                    case 25:
                        int var6 = var2.indexOf(".");
                        if (var6 == -1) {
                            Integer.parseInt(var2);
                        } else {
                            Integer.parseInt(var2.substring(0, var6));
                            Integer.parseInt(var2.substring(var6 + 1));
                        }
                }
            }
        }
        class247.field2653 = false;
        field658 = false;
        Statics.field1815 = this.getCodeBase().getHost();
        Statics.field1024 = new class380();
        String var7 = Statics.field1326.field3976;
        byte var8 = 0;
        if ((field510 & class531.field5204.method38()) != 0) {
            Statics.field4670 = "beta";
        }
        try {
            class176.method7903("oldschool", Statics.field4670, var7, var8, 23);
        } catch (Exception var10) {
            class561.method3291((String) null, var10);
        }
        Statics.field1468 = this;
        Statics.field3119 = field508;
        method5713();
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field791 = true;
        }
        if (field795 == -1) {
            if (this.method1442() || this.method1145()) {
                field795 = 5;
            } else {
                field795 = 0;
            }
        }
        this.method468(765, 503, 221, 1);
    }

    public void finalize() throws Throwable {
        class322.field3500.remove(this);
        super.finalize();
    }

    @ObfuscatedName("nj.gm(I)V")
    public static void method5713() {
        Statics.field3200 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field1351 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field1619 = System.getenv("JX_SESSION_ID");
        Statics.field3974 = System.getenv("JX_CHARACTER_ID");
        String var0 = System.getenv("JX_DISPLAY_NAME");
        class77.field954 = class514.method5213(var0);
    }

    @ObfuscatedName("client.gv(I)Z")
    public boolean method1140() {
        return this.field518 == 1;
    }

    public void setClient(int arg0) {
        this.field518 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field807 = arg0;
            class77.method3602(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field525 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field519 == 10;
    }

    public long getAccountHash() {
        return this.field567;
    }

    @ObfuscatedName("client.gq(I)Z")
    public boolean method1442() {
        return Statics.field3200 != null && !Statics.field3200.trim().isEmpty() && Statics.field1351 != null && !Statics.field1351.trim().isEmpty();
    }

    @ObfuscatedName("client.gh(I)Z")
    public boolean method1145() {
        return Statics.field1619 != null && !Statics.field1619.trim().isEmpty() && Statics.field3974 != null && !Statics.field3974.trim().isEmpty();
    }

    @ObfuscatedName("client.gy(B)Z")
    public boolean method1146() {
        return this.field807 != null;
    }

    @ObfuscatedName("client.gd(Ljava/lang/String;I)V")
    public void method1147(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field1055 + "shield/oauth/token" + (new class484(var2)).method7824());
        class440 var4 = new class440();
        if (this.method1140()) {
            var4.method7267(field560);
        } else {
            var4.method7267(field782);
        }
        var4.method7282("Host", (new URL(Statics.field1055)).getHost());
        var4.method7271(class481.field4906);
        class10 var5 = class10.field31;
        RefreshAccessTokenRequester var6 = this.field525;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field791);
            this.field655 = this.field619.method170(var7);
        } else {
            this.field559 = var6.request(var5.method68(), var3, var4.method7264(), "");
        }
    }

    @ObfuscatedName("client.gl(Ljava/lang/String;I)V")
    public void method1148(String arg0) throws IOException {
        URL var2 = new URL(Statics.field1055 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class440 var3 = new class440();
        var3.method7286(arg0);
        class10 var4 = class10.field29;
        OtlTokenRequester var5 = this.field807;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field791);
            this.field552 = this.field619.method170(var6);
        } else {
            this.field554 = var5.request(var4.method68(), var2, var3.method7264(), "");
        }
    }

    @ObfuscatedName("client.ga(Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1149(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field155 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field31, this.field791);
        var4.method80().method7286(arg0);
        var4.method80().method7271(class481.field4906);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method83(new class483(var5));
        this.field552 = this.field619.method170(var4);
    }

    @ObfuscatedName("client.bz(I)V")
    public final void method481() {
        class432.method3415(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        int var1 = field510;
        class531 var2 = class531.field5204;
        boolean var3 = (var1 & var2.method38()) != 0;
        Statics.field461 = var3;
        Statics.field48 = field511 == 0 ? 43594 : field509 + 40000;
        Statics.field307 = field511 == 0 ? 443 : field509 + 50000;
        Statics.field4958 = Statics.field48;
        Statics.field1859 = class349.field3730;
        Statics.field1455 = class349.field3729;
        Statics.field3683 = class349.field3728;
        Statics.field7 = class349.field3727;
        Statics.field1180 = new class115(this.field791, 221);
        this.method461();
        this.method609();
        Statics.field1325 = this.method513();
        this.method462(field750, 0);
        this.method462(field749, 1);
        this.method458();
        Statics.field393 = new class463(255, class176.field1885, class176.field1880, 500000);
        Statics.field1336 = class100.method2083();
        String var5 = Statics.field3314;
        class32.field154 = this;
        if (var5 != null) {
            class32.field151 = var5;
        }
        method2214(Statics.field1336.method2448());
        Statics.field3621 = new class70(Statics.field1527);
        this.field619 = new class15("tokenRequest", 1, 1);
        if (!class322.field3500.contains(this)) {
            class322.field3500.add(this);
        }
        field630.method4079();
    }

    @ObfuscatedName("ud.ge(I)Lia;")
    public static class229 method8333() {
        return field749;
    }

    @ObfuscatedName("client.bh(I)V")
    public final void method473() {
        field523++;
        this.method1152();
        while (true) {
            class398 var1 = class375.field4360;
            class374 var2;
            synchronized (class375.field4360) {
                var2 = (class374) class375.field4363.method6616();
            }
            if (var2 == null) {
                boolean var4 = false;
                boolean var5 = false;
                if (!class322.field3499.isEmpty()) {
                    class427 var6 = (class427) class322.field3499.get(0);
                    if (var6 == null) {
                        class322.field3499.remove(0);
                    } else if (var6.method7146()) {
                        if (var6.method7159()) {
                            System.out.println("Error in midimanager.service: " + var6.method7173());
                            var4 = true;
                        } else {
                            if (var6.method7160() != null) {
                                class322.field3499.add(1, var6.method7160());
                            }
                            var5 = var6.method7162();
                        }
                        class322.field3499.remove(0);
                    } else {
                        var5 = var6.method7162();
                    }
                }
                if (var4) {
                    class322.field3499.clear();
                    Iterator var7 = class322.field3496.iterator();
                    label113: while (true) {
                        class334 var8;
                        do {
                            if (!var7.hasNext()) {
                                class322.field3496.clear();
                                break label113;
                            }
                            var8 = (class334) var7.next();
                        } while (var8 == null);
                        var8.field3614.method5447();
                        var8.field3614.method5445();
                        var8.field3614.method5440(0);
                        var8.field3614.field3535 = 0;
                        int var9 = var8.field3606;
                        int var10 = var8.field3607;
                        Iterator var11 = class322.field3500.iterator();
                        while (var11.hasNext()) {
                            class328 var12 = (class328) var11.next();
                            var12.method1157(var9, var10);
                        }
                    }
                }
                if (var5 && field719 && Statics.field1677 != null) {
                    Statics.field1677.method751();
                }
                method3130();
                field749.method3978();
                this.method526();
                class36 var15 = class36.field207;
                synchronized (class36.field207) {
                    class36.field210 = class36.field215;
                    class36.field217 = class36.field213;
                    class36.field218 = class36.field214;
                    class36.field219 = class36.field216;
                    class36.field224 = class36.field220;
                    class36.field212 = class36.field221;
                    class36.field228 = class36.field222;
                    class36.field227 = class36.field223;
                    class36.field220 = 0;
                }
                if (Statics.field1325 != null) {
                    int var17 = Statics.field1325.method275();
                    field553 = var17;
                }
                if (field519 == 0) {
                    method3453();
                    class35.method99();
                } else if (field519 == 5) {
                    class77.method6208(this, Statics.field97, Statics.field3468);
                    method3453();
                    class35.method99();
                } else if (field519 == 10 || field519 == 11) {
                    class77.method6208(this, Statics.field97, Statics.field3468);
                } else if (field519 == 20) {
                    class77.method6208(this, Statics.field97, Statics.field3468);
                    this.method1155();
                } else if (field519 == 50) {
                    class77.method6208(this, Statics.field97, Statics.field3468);
                    this.method1155();
                } else if (field519 == 25) {
                    method7351();
                }
                if (field519 == 30) {
                    this.method1482();
                } else if (field519 == 40 || field519 == 45) {
                    this.method1155();
                }
                return;
            }
            var2.field4358.method6289(var2.field4357, (int) var2.field4951, var2.field4356, false);
        }
    }

    @ObfuscatedName("client.bs(ZB)V")
    public final void method483(boolean arg0) {
        if ((field519 == 10 || field519 == 20 || field519 == 30) && field741 != 0L && class318.method3596() > field741) {
            method2214(method664());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field733[var2] = true;
            }
        }
        if (field519 == 0) {
            this.method570(class77.field934, class77.field935, arg0, Statics.field3053);
        } else if (field519 == 5) {
            class77.method6495(Statics.field98, Statics.field97, Statics.field3468);
        } else if (field519 == 10 || field519 == 11) {
            class77.method6495(Statics.field98, Statics.field97, Statics.field3468);
        } else if (field519 == 20) {
            class77.method6495(Statics.field98, Statics.field97, Statics.field3468);
        } else if (field519 == 50) {
            class77.method6495(Statics.field98, Statics.field97, Statics.field3468);
        } else if (field519 == 25) {
            if (field583 == 1) {
                if (field579 > field580) {
                    field580 = field579;
                }
                int var3 = (field580 * 50 - field579 * 50) / field580;
                method5170(class370.field4018 + class103.field1349 + class103.field1344 + var3 + "%" + class103.field1341, false);
            } else if (field583 == 2) {
                if (field728 > field582) {
                    field582 = field728;
                }
                int var4 = (field582 * 50 - field728 * 50) / field582 + 50;
                method5170(class370.field4018 + class103.field1349 + class103.field1344 + var4 + "%" + class103.field1341, false);
            } else {
                method5170(class370.field4018, false);
            }
        } else if (field519 == 30) {
            this.method1221();
        } else if (field519 == 40) {
            method5170(class370.field4019 + class103.field1349 + class370.field4087, false);
        } else if (field519 == 45) {
            method5170(class370.field4181, false);
        }
        if (field519 == 30 && field740 == 0 && !arg0 && !field742) {
            for (int var5 = 0; var5 < field731; var5++) {
                if (field817[var5]) {
                    Statics.field1496.method441(field736[var5], field737[var5], field738[var5], field681[var5]);
                    field817[var5] = false;
                }
            }
        } else if (field519 > 0) {
            Statics.field1496.method439(0, 0);
            for (int var6 = 0; var6 < field731; var6++) {
                field817[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.bj(I)V")
    public final void method484() {
        if (Statics.field1558 != null && Statics.field1558.method2593()) {
            Statics.field1558.method2598();
        }
        if (Statics.field1028 != null) {
            Statics.field1028.field1096 = false;
        }
        Statics.field1028 = null;
        field574.method2646();
        class36.method4114();
        Statics.field1325 = null;
        if (Statics.field1677 != null) {
            Statics.field1677.method752();
        }
        Statics.field1024.method6445();
        class375.method3713();
        if (Statics.field1180 != null) {
            Statics.field1180.method2689();
            Statics.field1180 = null;
        }
        class176.method6324();
        this.field619.method177();
    }

    @ObfuscatedName("qj.gs(I)V")
    public static void method7320() {
        field789 = true;
        if (Statics.field1558 != null && Statics.field1558.method2593()) {
            Statics.field1558.method2598();
        }
        method4574();
        method200();
        if (Statics.field1028 != null) {
            Statics.field1028.field1096 = false;
        }
        Statics.field1028 = null;
        field574.method2646();
        if (Statics.field3897 != null) {
            try {
                Statics.field3897.method3209();
            } catch (Exception var4) {
            }
        }
        Statics.field3897 = null;
        Statics.method5390();
        method3010();
        if (Statics.field5117 != null) {
            Statics.field5117.method4364();
        }
        for (int var1 = 0; var1 < field584.length; var1++) {
            if (field584[var1] != null) {
                field584[var1].method3998();
            }
        }
        Statics.field4536 = null;
        class322.method104(0, 0);
        class322.method2763();
        field719 = false;
        class71.method290();
        if (Statics.field1677 != null) {
            Statics.field1677.method752();
        }
        Statics.field1024.method6445();
        class375.method3713();
        if (Statics.field1180 != null) {
            Statics.field1180.method2689();
        }
        class176.method6324();
        class176.field1885 = null;
        class176.field1880 = null;
        Statics.field1483 = null;
        class178.method3501();
        Statics.field393 = null;
        field812.clear();
        field774 = 0;
        Statics.field1024 = new class380();
        Statics.field1180 = new class115(Statics.field1468.field791, 221);
        try {
            class176.method7903("oldschool", Statics.field4670, Statics.field1326.field3976, 0, 23);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
        Statics.field393 = new class463(255, class176.field1885, class176.field1880, 500000);
        Statics.field3897 = new class174();
        Statics.field1468.method587();
        method7180(class94.field1153);
        method4521(0);
    }

    @ObfuscatedName("fl.go(I)V")
    public static void method3010() {
        Statics.field2557 = null;
        Statics.field3460 = null;
        Statics.field2456 = null;
        Statics.field1119 = null;
        Statics.field3622 = null;
        Statics.field1631 = null;
        Statics.field165 = null;
        Statics.field3131 = null;
        Statics.field116 = null;
        Statics.field839 = null;
        Statics.field1835 = null;
    }

    @ObfuscatedName("jm.gz(IB)V")
    public static void method4521(int arg0) {
        if (field519 == arg0) {
            return;
        }
        if (field519 == 30) {
            field750.method3952();
        }
        if (field519 == 0) {
            Statics.field1468.method485();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method2531(class68.field489);
            field545 = 0;
            field668 = 0;
            field577.method7252(arg0);
            if (arg0 != 20) {
                method395(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1278 != null) {
            Statics.field1278.method7551();
            Statics.field1278 = null;
        }
        if (field519 == 25) {
            field583 = 0;
            field579 = 0;
            field580 = 1;
            field728 = 0;
            field582 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = Statics.method97() ? 0 : 12;
            class77.method5348(Statics.field3624, Statics.field202, true, var2);
        } else if (arg0 == 20) {
            int var1 = field519 == 11 ? 4 : 0;
            class77.method5348(Statics.field3624, Statics.field202, false, var1);
        } else if (arg0 == 11) {
            class77.method5348(Statics.field3624, Statics.field202, false, 4);
        } else if (arg0 == 50) {
            class77.method1056("", "Updating date of birth...", "");
            class77.method5348(Statics.field3624, Statics.field202, false, 7);
        } else if (arg0 != 0 && Statics.field927) {
            Statics.field937 = null;
            Statics.field926 = null;
            Statics.field942 = null;
            Statics.field4666 = null;
            Statics.field931 = null;
            Statics.field4503 = null;
            Statics.field476 = null;
            Statics.field126 = null;
            Statics.field1659 = null;
            Statics.field3553 = null;
            Statics.field8 = null;
            Statics.field1628 = null;
            Statics.field22 = null;
            Statics.field4 = null;
            Statics.field421.method2321();
            class322.method104(0, 100);
            method5699().method6419(true);
            Statics.field927 = false;
        }
        field519 = arg0;
    }

    @ObfuscatedName("client.gp(I)V")
    public void method1152() {
        if (field519 != 1000) {
            boolean var1 = Statics.field1024.method6417();
            if (!var1) {
                this.method1286();
            }
        }
    }

    @ObfuscatedName("client.gu(I)V")
    public void method1286() {
        if (Statics.field1024.field4457 >= 4) {
            this.method486("js5crc");
            method4521(1000);
            return;
        }
        if (Statics.field1024.field4458 >= 4) {
            if (field519 <= 5) {
                this.method486("js5io");
                method4521(1000);
                return;
            }
            field543 = 3000;
            Statics.field1024.field4458 = 3;
        }
        if (--field543 + 1 > 0) {
            return;
        }
        try {
            if (field542 == 0) {
                Statics.field4577 = Statics.field3897.method3205(Statics.field1815, Statics.field4958);
                field542++;
            }
            if (field542 == 1) {
                if (Statics.field4577.field1923 == 2) {
                    this.method1154(-1);
                    return;
                }
                if (Statics.field4577.field1923 == 1) {
                    field542++;
                }
            }
            if (field542 == 2) {
                Socket var1 = (Socket) Statics.field4577.field1927;
                class460 var2 = new class460(var1, 40000, 5000);
                Statics.field2868 = var2;
                class535 var3 = new class535(5);
                var3.method8445(class315.field3449.field3457);
                var3.method8448(221);
                Statics.field2868.method7555(var3.field5231, 0, 5);
                field542++;
                Statics.field1824 = class318.method3596();
            }
            if (field542 == 3) {
                if (Statics.field2868.method7550() > 0) {
                    int var4 = Statics.field2868.method7548();
                    if (var4 != 0) {
                        this.method1154(var4);
                        return;
                    }
                    field542++;
                } else if (class318.method3596() - Statics.field1824 > 30000L) {
                    this.method1154(-2);
                    return;
                }
            }
            if (field542 == 4) {
                Statics.field1024.method6420(Statics.field2868, field519 > 20);
                Statics.field4577 = null;
                Statics.field2868 = null;
                field542 = 0;
                field544 = 0;
            }
        } catch (IOException var6) {
            this.method1154(-3);
        }
    }

    @ObfuscatedName("client.hq(II)V")
    public void method1154(int arg0) {
        Statics.field4577 = null;
        Statics.field2868 = null;
        field542 = 0;
        if (Statics.field4958 == Statics.field48) {
            Statics.field4958 = Statics.field307;
        } else {
            Statics.field4958 = Statics.field48;
        }
        field544++;
        if (field544 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field519 <= 5) {
                this.method486("js5connect_full");
                method4521(1000);
            } else {
                field543 = 3000;
            }
        } else if (field544 >= 2 && arg0 == 6) {
            this.method486("js5connect_outofdate");
            method4521(1000);
        } else if (field544 >= 4) {
            if (field519 <= 5) {
                this.method486("js5connect");
                method4521(1000);
            } else {
                field543 = 3000;
            }
        }
    }

    @ObfuscatedName("eh.hb(Lov;Ljava/lang/String;S)V")
    public static void method2810(class376 arg0, String arg1) {
        class85 var2 = new class85(arg0, arg1);
        field812.add(var2);
        field774 += var2.field1053;
    }

    @ObfuscatedName("pv.hp(I)I")
    public static int method6561() {
        if (field812 == null || field813 >= field812.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field813; var1++) {
            var0 += ((class85) field812.get(var1)).field1054;
        }
        return var0 * 10000 / field774;
    }

    @ObfuscatedName("ex.ht(II)I")
    public static int method2764(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("hj.hf(I)V")
    public static void method3453() {
        if (field541 == class94.field1153) {
            Statics.field1670 = method4837(class377.field4403.field4408, false, true, true, false);
            Statics.field1509 = method4837(class377.field4392.field4408, true, true, true, false);
            Statics.field202 = method4837(class377.field4394.field4408, false, true, true, false);
            Statics.field3624 = method4837(class377.field4396.field4408, false, true, true, false);
            Statics.field505 = method4837(class377.field4399.field4408, true, false, true, false);
            Statics.field1171 = method4837(class377.field4400.field4408, false, true, true, false);
            Statics.field884 = method4837(class377.field4385.field4408, false, true, true, false);
            class77.method3528(20, class370.field4296);
            method7180(class94.field1156);
        } else if (field541 == class94.field1156) {
            byte var0 = 0;
            int var1 = var0 + Statics.field1670.method6283() * 53 / 100;
            int var2 = var1 + Statics.field1509.method6283() * 5 / 100;
            int var3 = var2 + Statics.field202.method6283() * 36 / 100;
            int var4 = var3 + Statics.field3624.method6283() / 100;
            int var5 = var4 + Statics.field505.method6283() / 100;
            int var6 = var5 + Statics.field1171.method6283() * 3 / 100;
            int var7 = var6 + Statics.field884.method6283() / 100;
            if (var7 == 100) {
                method2810(Statics.field1670, "Sound FX");
                method2810(Statics.field1509, "Music Tracks");
                method2810(Statics.field202, "Sprites");
                method2810(Statics.field1171, "Music Samples");
                method2810(Statics.field884, "Music Patches");
                class77.method3528(40, class370.field4094);
                method7180(class94.field1162);
            } else if (var7 != 0) {
                class77.method3528(30, class370.field4023 + var7 + "%");
            }
        } else if (field541 == class94.field1162) {
            boolean var8 = !field658;
            Statics.field4893 = 22050;
            Statics.field277 = var8;
            Statics.field2081 = 2;
            ArrayList var9 = new ArrayList(3);
            class174 var10 = Statics.field3897;
            short var11 = 2048;
            if (Statics.field4893 == 0) {
                throw new IllegalStateException();
            }
            if (var11 < 256) {
                var11 = 256;
            }
            class43 var13;
            try {
                class43 var12 = Statics.field1552.method284();
                var12.field269 = new int[(Statics.field277 ? 2 : 1) * 256];
                var12.field271 = var11;
                var12.method314();
                var12.field275 = (var11 & 0xFFFFFC00) + 1024;
                if (var12.field275 > 16384) {
                    var12.field275 = 16384;
                }
                var12.method297(var12.field275);
                if (Statics.field2081 > 0 && Statics.field270 == null) {
                    Statics.field270 = new class45();
                    Statics.field1672 = Executors.newScheduledThreadPool(1);
                    Statics.field1672.scheduleAtFixedRate(Statics.field270, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field270 != null) {
                    if (Statics.field270.field303[0] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field270.field303[0] = var12;
                }
                var13 = var12;
            } catch (Throwable var78) {
                var13 = new class43();
            }
            Statics.field1677 = var13;
            Statics.field1283 = new class39();
            class39 var15 = new class39();
            var15.method670(Statics.field1283);
            for (int var16 = 0; var16 < 3; var16++) {
                class323 var17 = new class323(Statics.field1677);
                var17.method5450(9, 128);
                var15.method670(var17);
                var9.add(var17);
            }
            Statics.field1677.method757(var15);
            class322.method105(Statics.field884, Statics.field1171, Statics.field1670, var9);
            Statics.field1067 = new class58(22050, Statics.field4893);
            class77.method3528(60, class370.field4025);
            method7180(class94.field1159);
        } else if (field541 == class94.field1159) {
            if (Statics.field55 == null) {
                Statics.field55 = new class504(Statics.field202, Statics.field505);
            }
            class505[] var18 = new class505[] { class505.field5084, class505.field5088, class505.field5086, class505.field5087, class505.field5083, class505.field5085 };
            int var19 = var18.length;
            class504 var20 = Statics.field55;
            class505[] var21 = new class505[] { class505.field5084, class505.field5088, class505.field5086, class505.field5087, class505.field5083, class505.field5085 };
            field624 = var20.method8151(var21);
            if (field624.size() < var19) {
                class77.method3528(80, class370.field4026 + field624.size() * 100 / var19 + "%");
            } else {
                Statics.field97 = (class414) field624.get(class505.field5086);
                Statics.field3468 = (class414) field624.get(class505.field5084);
                Statics.field98 = (class414) field624.get(class505.field5085);
                Statics.field1811 = field622.method7870();
                class77.method3528(80, class370.field4287);
                method7180(class94.field1160);
            }
        } else if (field541 == class94.field1160) {
            int var22 = class77.method250(Statics.field3624, Statics.field202);
            int var23 = class77.method5158(Statics.field202);
            if (var22 < var23) {
                class77.method3528(90, class370.field4028 + var22 * 100 / var23 + "%");
            } else {
                class77.method3528(100, class370.field4029);
                if (Statics.field461) {
                    method4521(5);
                    method7180(class94.field1155);
                } else {
                    method7180(class94.field1157);
                }
            }
        } else if (field541 == class94.field1155) {
            method4521(10);
        } else if (field541 == class94.field1157) {
            Statics.field1453 = method4837(class377.field4406.field4408, false, true, true, false);
            Statics.field76 = method4837(class377.field4387.field4408, false, true, true, false);
            Statics.field1498 = method4837(class377.field4389.field4408, true, false, true, false);
            Statics.field480 = method4837(class377.field4398.field4408, false, true, true, false);
            Statics.field910 = method4837(class377.field4391.field4408, true, true, true, false);
            Statics.field4875 = method4837(class377.field4393.field4408, false, true, true, false);
            Statics.field1378 = method4837(class377.field4395.field4408, false, true, true, false);
            Statics.field3168 = method4837(class377.field4401.field4408, false, true, true, false);
            Statics.field478 = method4837(class377.field4386.field4408, false, true, true, false);
            Statics.field2884 = method4837(class377.field4402.field4408, true, true, true, false);
            Statics.field4333 = method4837(class377.field4388.field4408, false, true, true, false);
            Statics.field309 = method4837(class377.field4404.field4408, false, true, true, false);
            Statics.field1727 = method4837(class377.field4405.field4408, false, true, true, false);
            Statics.field4744 = method4837(class377.field4397.field4408, false, true, true, false);
            int var24 = class377.field4407.field4408;
            class463 var25 = null;
            if (class176.field1885 != null) {
                var25 = new class463(var24, class176.field1885, Statics.field1483[var24], 1000000);
            }
            class376 var26 = new class376(var25, Statics.field393, Statics.field1024, var24, false, true, true, true, true);
            Statics.field284 = var26;
            class77.method3528(20, class370.field4296);
            method7180(class94.field1169);
        } else if (field541 == class94.field1169) {
            byte var27 = 0;
            int var28 = var27 + Statics.field1453.method6283() * 5 / 100;
            int var29 = var28 + Statics.field76.method6283() * 2 / 100;
            int var30 = var29 + Statics.field1498.method6283() / 100;
            int var31 = var30 + Statics.field480.method6283() / 100;
            int var32 = var31 + Statics.field910.method6283() * 10 / 100;
            int var33 = var32 + Statics.field4875.method6283() * 65 / 100;
            int var34 = var33 + Statics.field1378.method6283() / 100;
            int var35 = var34 + Statics.field3168.method6283() / 100;
            int var36 = var35 + Statics.field478.method6283() * 6 / 100;
            int var37 = var36 + Statics.field309.method6283() / 100;
            int var38 = var37 + Statics.field4333.method6283() * 2 / 100;
            int var39 = var38 + Statics.field1727.method6283() * 2 / 100;
            int var40 = var39 + Statics.field4744.method6283() / 100;
            int var41 = var40 + Statics.field284.method6283() / 100;
            int var42 = var41 + (Statics.field2884.method6282() && Statics.field2884.method6333() ? 1 : 0);
            if (var42 == 100) {
                method2810(Statics.field1453, "Animations");
                method2810(Statics.field76, "Skeletons");
                method2810(Statics.field910, "Maps");
                method2810(Statics.field4875, "Models");
                method2810(Statics.field3168, "Music Jingles");
                method2810(Statics.field309, "World Map");
                method2810(Statics.field4333, "World Map Geography");
                method2810(Statics.field1727, "World Map Ground");
                Statics.field3681 = new class465();
                Statics.field3681.method7615(Statics.field2884);
                class77.method3528(30, class370.field4094);
                method7180(class94.field1165);
            } else if (var42 != 0) {
                class77.method3528(30, class370.field4023 + var42 + "%");
            }
        } else if (field541 == class94.field1165) {
            Statics.field5117 = new class247(4, 104, 104, class83.field1030);
            for (int var43 = 0; var43 < 4; var43++) {
                field584[var43] = new class230(104, 104);
            }
            Statics.field878 = new class549(512, 512);
            class77.method3528(30, class370.field4142);
            method7180(class94.field1161);
        } else if (field541 == class94.field1161) {
            if (!Statics.field1498.method6333()) {
                class77.method3528(40, class370.field4030 + Statics.field1498.method6294() + "%");
            } else if (Statics.field4744.method6333()) {
                class224.method2788(Statics.field1498);
                class376 var44 = Statics.field1498;
                Statics.field2196 = var44;
                class376 var45 = Statics.field1498;
                class376 var46 = Statics.field4875;
                Statics.field2035 = var45;
                Statics.field2032 = var46;
                Statics.field57 = Statics.field2035.method6338(3);
                class222.method2543(Statics.field1498, Statics.field4875, field658);
                class376 var47 = Statics.field1498;
                class376 var48 = Statics.field4875;
                Statics.field1979 = var47;
                Statics.field396 = var48;
                class376 var49 = Statics.field1498;
                Statics.field5388 = var49;
                class376 var50 = Statics.field1498;
                class376 var51 = Statics.field4875;
                boolean var52 = field512;
                class414 var53 = Statics.field97;
                Statics.field2304 = var50;
                Statics.field3089 = var51;
                Statics.field1832 = var52;
                Statics.field2317 = Statics.field2304.method6338(10);
                Statics.field1888 = var53;
                class376 var54 = Statics.field1498;
                class376 var55 = Statics.field1453;
                class376 var56 = Statics.field76;
                Statics.field2378 = var54;
                Statics.field3667 = var55;
                Statics.field1471 = var56;
                class376 var57 = Statics.field1498;
                class376 var58 = Statics.field4875;
                Statics.field2185 = var57;
                Statics.field2174 = var58;
                class216.method6523(Statics.field1498);
                class195.method8149(Statics.field1498);
                Statics.field2621 = new class341(Statics.field480, Statics.field4875, Statics.field202, Statics.field505, Statics.field284);
                class376 var59 = Statics.field1498;
                Statics.field1970 = var59;
                class203.method2758(Statics.field1498);
                class198.method1120(Statics.field1498);
                class215.method3482(Statics.field1498);
                class218.method5210(Statics.field1498);
                Statics.method6565(Statics.field1498);
                class376 var60 = Statics.field1498;
                Statics.field5176 = var60;
                Statics.field100 = new class518(Statics.field2090, 54, Statics.field896, Statics.field1498);
                Statics.field1044 = new class518(Statics.field2090, 47, Statics.field896, Statics.field1498);
                Statics.field1558 = new class111();
                class376 var61 = Statics.field1498;
                class376 var62 = Statics.field202;
                class376 var63 = Statics.field505;
                Statics.field2226 = var61;
                Statics.field2220 = var62;
                Statics.field2222 = var63;
                class376 var64 = Statics.field1498;
                class376 var65 = Statics.field202;
                Statics.field2060 = var64;
                Statics.field2056 = var65;
                class376 var66 = Statics.field1498;
                class376 var67 = Statics.field202;
                Statics.field2026 = var67;
                if (var66.method6333()) {
                    Statics.field5296 = var66.method6338(35);
                    Statics.field2004 = new class197[Statics.field5296];
                    for (int var68 = 0; var68 < Statics.field5296; var68++) {
                        byte[] var69 = var66.method6328(35, var68);
                        Statics.field2004[var68] = new class197(var68);
                        if (var69 != null) {
                            Statics.field2004[var68].method3422(new class535(var69));
                            Statics.field2004[var68].method3421();
                        }
                    }
                }
                class77.method3528(50, class370.field4031);
                method7180(class94.field1154);
            } else {
                class77.method3528(40, class370.field4030 + (80 + Statics.field478.method6294() / 6) + "%");
            }
        } else if (field541 == class94.field1154) {
            int var70 = 0;
            if (Statics.field2557 == null) {
                Statics.field2557 = class550.method1978(Statics.field202, Statics.field3681.field4852, 0);
            } else {
                var70++;
            }
            if (Statics.field3460 == null) {
                Statics.field3460 = class550.method1978(Statics.field202, Statics.field3681.field4844, 0);
            } else {
                var70++;
            }
            if (Statics.field2456 == null) {
                Statics.field2456 = class550.method3944(Statics.field202, Statics.field3681.field4843, 0);
            } else {
                var70++;
            }
            if (Statics.field1119 == null) {
                Statics.field1119 = class550.method2272(Statics.field202, Statics.field3681.field4846, 0);
            } else {
                var70++;
            }
            if (Statics.field3622 == null) {
                Statics.field3622 = class550.method2272(Statics.field202, Statics.field3681.field4847, 0);
            } else {
                var70++;
            }
            if (Statics.field1631 == null) {
                Statics.field1631 = class550.method2272(Statics.field202, Statics.field3681.field4845, 0);
            } else {
                var70++;
            }
            if (Statics.field165 == null) {
                Statics.field165 = class550.method2272(Statics.field202, Statics.field3681.field4849, 0);
            } else {
                var70++;
            }
            if (Statics.field3131 == null) {
                Statics.field3131 = class550.method2272(Statics.field202, Statics.field3681.field4850, 0);
            } else {
                var70++;
            }
            if (Statics.field116 == null) {
                Statics.field116 = class550.method2272(Statics.field202, Statics.field3681.field4851, 0);
            } else {
                var70++;
            }
            if (Statics.field839 == null) {
                Statics.field839 = class550.method3944(Statics.field202, Statics.field3681.field4848, 0);
            } else {
                var70++;
            }
            if (Statics.field1835 == null) {
                Statics.field1835 = class550.method3944(Statics.field202, Statics.field3681.field4853, 0);
            } else {
                var70++;
            }
            if (var70 < 11) {
                class77.method3528(70, class370.field4235 + var70 * 100 / 12 + "%");
            } else {
                Statics.field4620 = Statics.field1835;
                Statics.field3460.method8892();
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2456[0].method8867(var71 + var74, var72 + var74, var73 + var74);
                class77.method3528(60, class370.field4033);
                method7180(class94.field1163);
            }
        } else if (field541 == class94.field1163) {
            if (Statics.field1378.method6333()) {
                Statics.field3628 = new class253(Statics.field1378, Statics.field202, 20, Statics.field1336.method2358(), field658 ? 64 : 128);
                class243.method4249(Statics.field3628);
                class243.method4202(Statics.field1336.method2358());
                method7180(class94.field1164);
            } else {
                class77.method3528(70, class370.field4040 + "0%");
            }
        } else if (field541 == class94.field1164) {
            int var75 = Statics.field3628.method4546();
            if (var75 < 100) {
                class77.method3528(80, class370.field4040 + var75 + "%");
            } else {
                class77.method3528(90, class370.field4063);
                method7180(class94.field1158);
            }
        } else if (field541 == class94.field1158) {
            Statics.field1028 = new class90();
            Statics.field3897.method3208(Statics.field1028, 10);
            class77.method3528(92, class370.field4036);
            method7180(class94.field1166);
        } else if (field541 == class94.field1166) {
            if (Statics.field3624.method6348("huffman", "")) {
                class352 var76 = new class352(Statics.field3624.method6347("huffman", ""));
                class353.method399(var76);
                class77.method3528(94, class370.field4038);
                method7180(class94.field1167);
            } else {
                class77.method3528(94, class370.field4074 + "%");
            }
        } else if (field541 == class94.field1167) {
            if (!Statics.field480.method6333()) {
                class77.method3528(96, class370.field4039 + Statics.field480.method6294() * 4 / 5 + "%");
            } else if (!Statics.field284.method6333()) {
                class77.method3528(96, class370.field4039 + Statics.field284.method6294() * 4 / 5 + "%");
            } else if (!Statics.field478.method6333()) {
                class77.method3528(96, class370.field4039 + (80 + Statics.field478.method6294() / 6) + "%");
            } else if (Statics.field505.method6333()) {
                class77.method3528(98, class370.field4260);
                if (Statics.field478.method6411("version.dat", "")) {
                    class535 var77 = new class535(Statics.field478.method6347("version.dat", ""));
                    var77.method8670();
                }
                method7180(class94.field1168);
            } else {
                class77.method3528(96, class370.field4039 + (96 + Statics.field505.method6294() / 50) + "%");
            }
        } else if (field541 == class94.field1168) {
            if (Statics.field309.method6339() <= 0 || Statics.field309.method6391(class292.field3155.field3160)) {
                if (Statics.field4536 == null) {
                    Statics.field4536 = new class503();
                    Statics.field4536.method7940(Statics.field309, Statics.field4333, Statics.field1727, Statics.field98, field624, Statics.field2456);
                }
                class77.method3528(100, class370.field4042);
                if (Statics.field461) {
                    method7180(class94.field1170);
                } else {
                    method7180(class94.field1155);
                }
                field789 = false;
            } else {
                class77.method3528(100, class370.field4041 + Statics.field309.method6351(class292.field3155.field3160) / 10 + "%");
            }
        } else if (field541 == class94.field1170) {
            Statics.field3053 = false;
            method4521(20);
            method2531(class68.field484);
        }
    }

    @ObfuscatedName("ql.hv(Ldq;B)V")
    public static void method7180(class94 arg0) {
        if (field541 != arg0) {
            field541 = arg0;
        }
    }

    @ObfuscatedName("ki.ha(IZZZZB)Lov;")
    public static class376 method4837(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class463 var5 = null;
        if (class176.field1885 != null) {
            var5 = new class463(arg0, class176.field1885, Statics.field1483[arg0], 1000000);
        }
        return new class376(var5, Statics.field393, Statics.field1024, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("client.hr(I)V")
    public final void method1155() {
        class459 var1 = field574.method2644();
        class534 var2 = field574.field1439;
        try {
            if (Statics.field895 == class68.field489) {
                if (Statics.field1758 == null && (field564.method2094() || field545 > 250)) {
                    Statics.field1758 = field564.method2087();
                    field564.method2085();
                    field564 = null;
                }
                if (Statics.field1758 != null) {
                    if (var1 != null) {
                        var1.method7551();
                        var1 = null;
                    }
                    Statics.field3470 = null;
                    field576 = false;
                    field545 = 0;
                    if (!field811.method8754()) {
                        method2531(class68.field483);
                    } else if (this.method1442()) {
                        try {
                            this.method1147(Statics.field1351);
                            method2531(class68.field504);
                        } catch (Throwable var67) {
                            class561.method3291((String) null, var67);
                            method405(65);
                            return;
                        }
                    } else if (this.method1145()) {
                        try {
                            this.method1149(Statics.field1619, Statics.field3974);
                            method2531(class68.field506);
                        } catch (Exception var66) {
                            class561.method3291((String) null, var66);
                            method405(65);
                            return;
                        }
                    } else {
                        method405(65);
                        return;
                    }
                }
            }
            if (Statics.field895 == class68.field504) {
                if (this.field559 == null) {
                    if (this.field655 == null) {
                        method405(65);
                        return;
                    }
                    if (!this.field655.method254()) {
                        return;
                    }
                    if (this.field655.method252()) {
                        class561.method3291(this.field655.method253(), (Throwable) null);
                        method405(65);
                        this.field655 = null;
                        return;
                    }
                    class21 var7 = this.field655.method255();
                    if (var7.method268() != 200) {
                        method405(65);
                        this.field655 = null;
                        return;
                    }
                    field545 = 0;
                    class483 var8 = new class483(var7.method270());
                    try {
                        Statics.field3200 = var8.method7816().getString("access_token");
                        Statics.field1351 = var8.method7816().getString("refresh_token");
                    } catch (Exception var64) {
                        class561.method3291("Error parsing tokens", var64);
                        method405(65);
                        this.field655 = null;
                        return;
                    }
                } else if (this.field559.isDone()) {
                    if (this.field559.isCancelled()) {
                        method405(65);
                        this.field559 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field559.get();
                        if (!var5.isSuccess()) {
                            method405(65);
                            this.field559 = null;
                            return;
                        }
                        Statics.field3200 = var5.getAccessToken();
                        Statics.field1351 = var5.getRefreshToken();
                        this.field559 = null;
                    } catch (Exception var65) {
                        class561.method3291((String) null, var65);
                        method405(65);
                        this.field559 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1148(Statics.field3200);
                method2531(class68.field506);
            }
            if (Statics.field895 == class68.field506) {
                if (this.field554 == null) {
                    if (this.field552 == null) {
                        method405(65);
                        return;
                    }
                    if (!this.field552.method254()) {
                        return;
                    }
                    if (this.field552.method252()) {
                        class561.method3291(this.field552.method253(), (Throwable) null);
                        method405(65);
                        this.field552 = null;
                        return;
                    }
                    class21 var12 = this.field552.method255();
                    if (var12.method268() != 200) {
                        class561.method3291("Response code: " + var12.method268() + "Response body: " + var12.method270(), (Throwable) null);
                        method405(65);
                        this.field552 = null;
                        return;
                    }
                    List var13 = (List) var12.method274().get("Content-Type");
                    if (var13 != null && var13.contains(class481.field4906.method7803())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method270());
                            this.field550 = var14.getString("token");
                        } catch (JSONException var62) {
                            class561.method3291((String) null, var62);
                            method405(65);
                            this.field552 = null;
                            return;
                        }
                    } else {
                        this.field550 = var12.method270();
                    }
                    this.field552 = null;
                } else if (this.field554.isDone()) {
                    if (this.field554.isCancelled()) {
                        method405(65);
                        this.field554 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field554.get();
                        if (!var10.isSuccess()) {
                            method405(65);
                            this.field554 = null;
                            return;
                        }
                        this.field550 = var10.getToken();
                        this.field554 = null;
                    } catch (Exception var63) {
                        class561.method3291((String) null, var63);
                        method405(65);
                        this.field554 = null;
                        return;
                    }
                } else {
                    return;
                }
                field545 = 0;
                method2531(class68.field483);
            }
            if (Statics.field895 == class68.field483) {
                if (Statics.field3470 == null) {
                    Statics.field3470 = Statics.field3897.method3205(Statics.field1815, Statics.field4958);
                }
                if (Statics.field3470.field1923 == 2) {
                    throw new IOException();
                }
                if (Statics.field3470.field1923 == 1) {
                    Socket var16 = (Socket) Statics.field3470.field1927;
                    class460 var17 = new class460(var16, 40000, 5000);
                    var1 = var17;
                    field574.method2641(var17);
                    Statics.field3470 = null;
                    method2531(class68.field507);
                }
            }
            if (Statics.field895 == class68.field507) {
                field574.method2645();
                class313 var18 = class313.method3153();
                var18.field3318.method8445(class315.field3455.field3457);
                field574.method2654(var18);
                field574.method2643();
                var2.field5233 = 0;
                method2531(class68.field485);
            }
            if (Statics.field895 == class68.field485) {
                if (Statics.field1677 != null) {
                    Statics.field1677.method756();
                }
                if (var1.method7546(1)) {
                    int var19 = var1.method7548();
                    if (Statics.field1677 != null) {
                        Statics.field1677.method756();
                    }
                    if (var19 != 0) {
                        method405(var19);
                        return;
                    }
                    var2.field5233 = 0;
                    method2531(class68.field486);
                }
            }
            if (Statics.field895 == class68.field486) {
                if (var2.field5233 < 8) {
                    int var20 = var1.method7550();
                    if (var20 > 8 - var2.field5233) {
                        var20 = 8 - var2.field5233;
                    }
                    if (var20 > 0) {
                        var1.method7549(var2.field5231, var2.field5233, var20);
                        var2.field5233 += var20;
                    }
                }
                if (var2.field5233 == 8) {
                    var2.field5233 = 0;
                    Statics.field5234 = var2.method8469();
                    method2531(class68.field482);
                }
            }
            if (Statics.field895 == class68.field482) {
                field574.field1439.field5233 = 0;
                field574.method2645();
                class534 var21 = new class534(500);
                int[] var22 = new int[] { Statics.field1758.nextInt(), Statics.field1758.nextInt(), Statics.field1758.nextInt(), Statics.field1758.nextInt() };
                var21.field5233 = 0;
                var21.method8445(1);
                var21.method8448(var22[0]);
                var21.method8448(var22[1]);
                var21.method8448(var22[2]);
                var21.method8448(var22[3]);
                var21.method8450(Statics.field5234);
                if (field519 == 40) {
                    var21.method8448(Statics.field966[0]);
                    var21.method8448(Statics.field966[1]);
                    var21.method8448(Statics.field966[2]);
                    var21.method8448(Statics.field966[3]);
                } else {
                    if (field519 == 50) {
                        var21.method8445(class141.field1661.method38());
                        var21.method8448(Statics.field3604);
                    } else {
                        var21.method8445(field548.method38());
                        switch(field548.field1663) {
                            case 0:
                            case 2:
                                var21.method8646(Statics.field3629);
                                var21.field5233++;
                                break;
                            case 1:
                                var21.field5233 += 4;
                            case 3:
                            default:
                                break;
                            case 4:
                                var21.method8448(Statics.field1336.method2372(class77.field945));
                        }
                    }
                    if (field811.method8754()) {
                        var21.method8445(class540.field5286.method38());
                        var21.method8452(this.field550);
                    } else {
                        var21.method8445(class540.field5291.method38());
                        var21.method8452(class77.field946);
                    }
                }
                var21.method8489(class76.field924, class76.field922);
                Statics.field966 = var22;
                class313 var23 = class313.method3153();
                var23.field3318.field5233 = 0;
                if (field519 == 40) {
                    var23.field3318.method8445(class315.field3452.field3457);
                } else {
                    var23.field3318.method8445(class315.field3451.field3457);
                }
                var23.field3318.method8446(0);
                int var24 = var23.field3318.field5233;
                var23.field3318.method8448(221);
                var23.field3318.method8448(1);
                var23.field3318.method8445(field508);
                var23.field3318.method8445(field795);
                byte var25 = 0;
                var23.field3318.method8445(var25);
                var23.field3318.method8455(var21.field5231, 0, var21.field5233);
                int var26 = var23.field3318.field5233;
                var23.field3318.method8452(class77.field945);
                var23.field3318.method8445((field742 ? 1 : 0) << 1 | (field658 ? 1 : 0));
                var23.field3318.method8446(Statics.field1700);
                var23.field3318.method8446(Statics.field3661);
                class534 var27 = var23.field3318;
                if (field595 == null) {
                    byte[] var28 = class176.method2226();
                    var27.method8455(var28, 0, var28.length);
                } else {
                    var27.method8455(field595, 0, field595.length);
                }
                var23.field3318.method8452(Statics.field2869);
                var23.field3318.method8448(Statics.field3046);
                var23.field3318.method8445(0);
                class535 var29 = new class535(Statics.field1811.method7886());
                Statics.field1811.method7885(var29);
                var23.field3318.method8455(var29.field5231, 0, var29.field5231.length);
                var23.field3318.method8445(field508);
                var23.field3318.method8448(0);
                if (Statics.field461) {
                    var23.field3318.method8447(Statics.field1670.field4426);
                    var23.field3318.method8604(Statics.field1509.field4426);
                    var23.field3318.method8447(Statics.field1171.field4426);
                    var23.field3318.method8512(Statics.field884.field4426);
                    var23.field3318.method8512(Statics.field202.field4426);
                    var23.field3318.method8512(Statics.field3624.field4426);
                    var23.field3318.method8447(Statics.field505.field4426);
                } else {
                    var23.field3318.method8447(Statics.field1453.field4426);
                    var23.field3318.method8512(Statics.field1670.field4426);
                    var23.field3318.method8512(Statics.field884.field4426);
                    var23.field3318.method8447(Statics.field2884.field4426);
                    var23.field3318.method8604(Statics.field505.field4426);
                    var23.field3318.method8447(0);
                    var23.field3318.method8447(Statics.field76.field4426);
                    var23.field3318.method8448(Statics.field3624.field4426);
                    var23.field3318.method8604(Statics.field1378.field4426);
                    var23.field3318.method8448(Statics.field4875.field4426);
                    var23.field3318.method8604(Statics.field202.field4426);
                    var23.field3318.method8447(Statics.field1509.field4426);
                    var23.field3318.method8512(Statics.field1727.field4426);
                    var23.field3318.method8512(Statics.field309.field4426);
                    var23.field3318.method8448(Statics.field1171.field4426);
                    var23.field3318.method8448(Statics.field478.field4426);
                    var23.field3318.method8604(Statics.field910.field4426);
                    var23.field3318.method8512(Statics.field480.field4426);
                    var23.field3318.method8512(Statics.field3168.field4426);
                    var23.field3318.method8512(Statics.field1498.field4426);
                    var23.field3318.method8512(Statics.field4333.field4426);
                }
                var23.field3318.method8564(var22, var26, var23.field3318.field5233);
                var23.field3318.method8458(var23.field3318.field5233 - var24);
                field574.method2654(var23);
                field574.method2643();
                field574.field1438 = new class552(var22);
                int[] var30 = new int[4];
                for (int var31 = 0; var31 < 4; var31++) {
                    var30[var31] = var22[var31] + 50;
                }
                var2.method8436(var30);
                method2531(class68.field488);
            }
            if (Statics.field895 == class68.field488 && var1.method7550() > 0) {
                int var32 = var1.method7548();
                if (var32 == 61) {
                    int var33 = var1.method7550();
                    Statics.field3109 = var33 == 1 && var1.method7548() == 1;
                    method2531(class68.field482);
                }
                if (var32 == 21 && field519 == 20) {
                    method2531(class68.field487);
                } else if (var32 == 2) {
                    if (Statics.field461) {
                        method2531(class68.field494);
                    } else {
                        method2531(class68.field496);
                    }
                } else if (var32 == 15 && field519 == 40) {
                    field574.field1441 = -1;
                    method2531(class68.field502);
                } else if (var32 == 64) {
                    method2531(class68.field492);
                } else if (var32 == 23 && field668 < 1) {
                    field668++;
                    method2531(class68.field489);
                } else if (var32 == 29) {
                    method2531(class68.field500);
                } else if (var32 == 69) {
                    method2531(class68.field503);
                } else {
                    method405(var32);
                    return;
                }
            }
            if (Statics.field895 == class68.field494) {
                Statics.field3053 = true;
                method7180(class94.field1157);
                method4521(0);
            }
            if (Statics.field895 == class68.field503 && var1.method7550() >= 2) {
                var1.method7549(var2.field5231, 0, 2);
                var2.field5233 = 0;
                Statics.field1521 = var2.method8670();
                method2531(class68.field490);
            }
            if (Statics.field895 == class68.field490 && var1.method7550() >= Statics.field1521) {
                var2.field5233 = 0;
                var1.method7549(var2.field5231, var2.field5233, Statics.field1521);
                class7[] var34 = new class7[] { class7.field13 };
                class7 var35 = var34[var2.method8462()];
                try {
                    class4 var36 = class5.method3240(var35);
                    this.field566 = new class8(var2, var36);
                    method2531(class68.field491);
                } catch (Exception var61) {
                    method405(22);
                    return;
                }
            }
            if (Statics.field895 == class68.field491 && this.field566.method45()) {
                this.field565 = this.field566.method57();
                this.field566.method58();
                this.field566 = null;
                if (this.field565 == null) {
                    method405(22);
                    return;
                }
                field574.method2645();
                class313 var38 = class313.method3153();
                var38.field3318.method8445(class315.field3458.field3457);
                var38.field3318.method8446(this.field565.field5233);
                var38.field3318.method8456(this.field565);
                field574.method2654(var38);
                field574.method2643();
                this.field565 = null;
                method2531(class68.field488);
            }
            if (Statics.field895 == class68.field492 && var1.method7550() > 0) {
                Statics.field2491 = var1.method7548();
                method2531(class68.field493);
            }
            if (Statics.field895 == class68.field493 && var1.method7550() >= Statics.field2491) {
                var1.method7549(var2.field5231, 0, Statics.field2491);
                var2.field5233 = 0;
                method2531(class68.field488);
            }
            if (Statics.field895 == class68.field487 && var1.method7550() > 0) {
                field547 = (var1.method7548() + 3) * 60;
                method2531(class68.field495);
            }
            if (Statics.field895 == class68.field495) {
                field545 = 0;
                class77.method1056(class370.field4137, class370.field4050, field547 / 60 + class370.field4123);
                if (--field547 <= 0) {
                    method2531(class68.field489);
                }
            } else if (Statics.field895 == class68.field484) {
                class313 var39 = class313.method3153();
                var39.field3318.method8445(class315.field3454.field3457);
                var39.field3318.method8446(class315.field3454.field3453);
                var39.field3318.method8448(Statics.field2884.field4426);
                var39.field3318.method8512(Statics.field1498.field4426);
                var39.field3318.method8448(Statics.field3168.field4426);
                var39.field3318.method8448(Statics.field1378.field4426);
                var39.field3318.method8448(Statics.field1453.field4426);
                var39.field3318.method8447(Statics.field309.field4426);
                var39.field3318.method8512(Statics.field4875.field4426);
                var39.field3318.method8512(Statics.field76.field4426);
                var39.field3318.method8512(Statics.field478.field4426);
                var39.field3318.method8604(Statics.field4333.field4426);
                var39.field3318.method8604(Statics.field480.field4426);
                var39.field3318.method8447(Statics.field1727.field4426);
                var39.field3318.method8604(Statics.field910.field4426);
                var39.field3318.method8447(0);
                field574.method2654(var39);
                field574.method2643();
                method2531(class68.field496);
            } else {
                if (Statics.field895 == class68.field496 && var1.method7550() >= 1) {
                    Statics.field1454 = var1.method7548();
                    if (Statics.field1454 != class315.field3450.field3453) {
                        method405(Statics.field1454);
                        return;
                    }
                    method2531(class68.field497);
                }
                if (Statics.field895 == class68.field497 && var1.method7550() >= Statics.field1454) {
                    boolean var40 = var1.method7548() == 1;
                    var1.method7549(var2.field5231, 0, 4);
                    var2.field5233 = 0;
                    boolean var41 = false;
                    if (var40) {
                        int var42 = var2.method8409() << 24;
                        int var43 = var42 | var2.method8409() << 16;
                        int var44 = var43 | var2.method8409() << 8;
                        int var45 = var44 | var2.method8409();
                        Statics.field1336.method2407(class77.field945, var45);
                    }
                    if (field643) {
                        Statics.field1336.method2364(class77.field945);
                    } else {
                        Statics.field1336.method2364((String) null);
                    }
                    class100.method7840();
                    field691 = var1.method7548();
                    field693 = var1.method7548() == 1;
                    field578 = var1.method7548();
                    field578 <<= 0x8;
                    field578 += var1.method7548();
                    field784 = var1.method7548();
                    var1.method7549(var2.field5231, 0, 8);
                    var2.field5233 = 0;
                    this.field567 = var2.method8469();
                    var1.method7549(var2.field5231, 0, 8);
                    var2.field5233 = 0;
                    field639 = var2.method8469();
                    var1.method7549(var2.field5231, 0, 8);
                    var2.field5233 = 0;
                    field640 = var2.method8469();
                    class181.method2555().method3285(this.field791);
                    method2531(class68.field498);
                }
                if (Statics.field895 == class68.field498 && var1.method7550() >= field574.field1441) {
                    var1.method7549(var2.field5231, 0, 1);
                    var2.field5233 = 0;
                    if (var2.method8410()) {
                        var1.method7549(var2.field5231, 1, 1);
                        var2.field5233 = 0;
                    }
                    class314[] var46 = class314.method4515();
                    int var47 = var2.method8411();
                    if (var47 < 0 || var47 >= var46.length) {
                        throw new IOException("Invalid ServerProt: " + var47 + " at " + var2.field5233);
                    }
                    field574.field1440 = var46[var47];
                    field574.field1441 = field574.field1440.field3448;
                    var1.method7549(var2.field5231, 0, 2);
                    var2.field5233 = 0;
                    field574.field1441 = var2.method8670();
                    try {
                        client var48 = Statics.field1468;
                        JSObject.getWindow(var48).call("zap", (Object[]) null);
                    } catch (Throwable var60) {
                    }
                    method2531(class68.field499);
                }
                if (Statics.field895 != class68.field499) {
                    if (Statics.field895 == class68.field500 && var1.method7550() >= 2) {
                        var2.field5233 = 0;
                        var1.method7549(var2.field5231, 0, 2);
                        var2.field5233 = 0;
                        Statics.field61 = var2.method8670();
                        method2531(class68.field501);
                    }
                    if (Statics.field895 == class68.field501 && var1.method7550() >= Statics.field61) {
                        var2.field5233 = 0;
                        var1.method7549(var2.field5231, 0, Statics.field61);
                        var2.field5233 = 0;
                        String var50 = var2.method8473();
                        String var51 = var2.method8473();
                        String var52 = var2.method8473();
                        class77.method1056(var50, var51, var52);
                        method4521(10);
                        if (field811.method8754()) {
                            class77.method3602(9);
                        }
                    }
                    if (Statics.field895 == class68.field502) {
                        if (field574.field1441 == -1) {
                            if (var1.method7550() < 2) {
                                return;
                            }
                            var1.method7549(var2.field5231, 0, 2);
                            var2.field5233 = 0;
                            field574.field1441 = var2.method8670();
                        }
                        if (var1.method7550() >= field574.field1441) {
                            var1.method7549(var2.field5231, 0, field574.field1441);
                            var2.field5233 = 0;
                            int var53 = field574.field1441;
                            field577.method7242();
                            field574.method2645();
                            field574.field1439.field5233 = 0;
                            field574.field1440 = null;
                            field574.field1445 = null;
                            field574.field1447 = null;
                            field574.field1448 = null;
                            field574.field1441 = 0;
                            field574.field1443 = 0;
                            field529 = 0;
                            field660 = 0;
                            field607 = false;
                            field764 = 0;
                            field762 = 0;
                            for (int var54 = 0; var54 < 2048; var54++) {
                                field636[var54] = null;
                            }
                            Statics.field1608 = null;
                            for (int var55 = 0; var55 < field569.length; var55++) {
                                class102 var56 = field569[var55];
                                if (var56 != null) {
                                    var56.field1235 = -1;
                                    var56.field1228 = false;
                                }
                            }
                            class86.method3094();
                            method4521(30);
                            for (int var57 = 0; var57 < 100; var57++) {
                                field733[var57] = true;
                            }
                            if (field574 != null && field574.field1438 != null) {
                                class313 var58 = class313.method7156(class311.field3279, field574.field1438);
                                var58.field3318.method8445(method664());
                                var58.field3318.method8446(Statics.field1700);
                                var58.field3318.method8446(Statics.field3661);
                                field574.method2654(var58);
                            }
                            class109.method2204(var2);
                            if (var2.field5233 != var53) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field545++;
                        if (field545 > 2000) {
                            if (field668 < 1) {
                                if (Statics.field4958 == Statics.field48) {
                                    Statics.field4958 = Statics.field307;
                                } else {
                                    Statics.field4958 = Statics.field48;
                                }
                                field668++;
                                method2531(class68.field489);
                            } else {
                                method405(-3);
                            }
                        }
                    }
                } else if (var1.method7550() >= field574.field1441) {
                    var2.field5233 = 0;
                    var1.method7549(var2.field5231, 0, field574.field1441);
                    field577.method7240();
                    method200();
                    class109.method2204(var2);
                    Statics.field86 = -1;
                    method2999(false, var2);
                    field574.field1440 = null;
                    field520 = false;
                }
            }
        } catch (IOException var68) {
            if (field668 < 1) {
                if (Statics.field4958 == Statics.field48) {
                    Statics.field4958 = Statics.field307;
                } else {
                    Statics.field4958 = Statics.field48;
                }
                field668++;
                method2531(class68.field489);
            } else {
                method405(-2);
            }
        }
    }

    @ObfuscatedName("au.hc(I)V")
    public static void method200() {
        field675 = 1L;
        if (Statics.field1028 != null) {
            Statics.field1028.field1093 = 0;
        }
        Statics.field3023 = true;
        field528 = true;
        field754 = -1L;
        class37.method3368();
        field574.method2645();
        field574.field1439.field5233 = 0;
        field574.field1440 = null;
        field574.field1445 = null;
        field574.field1447 = null;
        field574.field1448 = null;
        field574.field1441 = 0;
        field574.field1443 = 0;
        field529 = 0;
        field575 = 0;
        field530 = 0;
        field660 = 0;
        field607 = false;
        class36.method2727(0);
        class112.field1428.clear();
        class112.field1429.method8180();
        class112.field1430.method6741();
        class112.field1431 = 0;
        field714 = 0;
        field678 = false;
        field766 = 0;
        field597 = 0;
        field589 = 0;
        Statics.field1622 = null;
        field764 = 0;
        field757 = -1;
        field762 = 0;
        field763 = 0;
        field538 = class105.field1360;
        field539 = class105.field1360;
        field645 = 0;
        class109.field1398 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class109.field1396[var0] = null;
            class109.field1384[var0] = class234.field2487;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field636[var1] = null;
        }
        for (int var2 = 0; var2 < 65536; var2++) {
            field569[var2] = null;
        }
        field592 = -1;
        field524.method6610();
        field653.method6610();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field650[var3][var4][var5] = null;
                }
            }
        }
        field651 = new class398();
        Statics.field3621.method1760();
        if (Statics.field1946 > 5000) {
        }
        if (field789) {
            Arrays.fill(class338.field3633, 0);
            Arrays.fill(class338.field3634, 0);
        } else {
            for (int var6 = 0; var6 < Statics.field1946; var6++) {
                class195 var7 = class195.method2746(var6);
                if (var7 != null) {
                    class338.field3633[var6] = 0;
                    class338.field3634[var6] = 0;
                }
            }
        }
        if (Statics.field1558 != null) {
            Statics.field1558.method2613();
        }
        field734 = -1;
        if (field683 != -1) {
            Statics.field2621.method5683(field683);
        }
        for (class88 var8 = (class88) field684.method8207(); var8 != null; var8 = (class88) field684.method8203()) {
            method3625(var8, true);
        }
        field683 = -1;
        field684 = new class509(8);
        field688 = null;
        field660 = 0;
        field607 = false;
        field799.method5722((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field665[var9] = null;
            field647[var9] = false;
        }
        class86.method3094();
        field522 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field733[var10] = true;
        }
        if (field574 != null && field574.field1438 != null) {
            class313 var11 = class313.method7156(class311.field3279, field574.field1438);
            var11.field3318.method8445(method664());
            var11.field3318.method8446(Statics.field1700);
            var11.field3318.method8446(Statics.field3661);
            field574.method2654(var11);
        }
        Statics.field1674 = null;
        Statics.field5109 = null;
        Arrays.fill(field755, (Object) null);
        Statics.field87 = null;
        Arrays.fill(field756, (Object) null);
        for (int var12 = 0; var12 < 8; var12++) {
            field803[var12] = new class388();
        }
        Statics.field2485 = null;
    }

    @ObfuscatedName("bc.hm(IB)V")
    public static void method405(int arg0) {
        int var1 = class77.field959;
        if (arg0 == -3) {
            class77.method1056(class370.field4052, class370.field4053, class370.field4182);
        } else if (arg0 == -2) {
            class77.method1056(class370.field4120, class370.field4056, class370.field4057);
        } else if (arg0 == -1) {
            class77.method1056(class370.field4058, class370.field4059, class370.field4060);
        } else if (arg0 == 3) {
            class77.method3602(3);
            class77.field939 = 1;
        } else if (arg0 == 4) {
            class77.method4832(0);
        } else if (arg0 == 5) {
            class77.field939 = 2;
            class77.method1056(class370.field4064, class370.field4203, class370.field4066);
        } else if (arg0 == 68) {
            if (!field520) {
                field520 = true;
                method7320();
                return;
            }
            class77.method1056(class370.field4067, class370.field4068, class370.field4069);
        } else if (!field517 && arg0 == 6) {
            class77.method1056(class370.field4067, class370.field4068, class370.field4069);
        } else if (arg0 == 7) {
            class77.method1056(class370.field4070, class370.field4160, class370.field4072);
        } else if (arg0 == 8) {
            class77.method1056(class370.field4073, class370.field4177, class370.field4268);
        } else if (arg0 == 9) {
            class77.method1056(class370.field4076, class370.field4166, class370.field4078);
        } else if (arg0 == 10) {
            class77.method1056(class370.field4079, class370.field4080, class370.field4077);
        } else if (arg0 == 11) {
            class77.method1056(class370.field4082, class370.field4122, class370.field4084);
        } else if (arg0 == 12) {
            class77.method1056(class370.field4085, class370.field4239, class370.field4129);
        } else if (arg0 == 13) {
            class77.method1056(class370.field4088, class370.field4089, class370.field4065);
        } else if (arg0 == 14) {
            class77.method1056(class370.field4091, class370.field4092, class370.field4093);
        } else if (arg0 == 16) {
            class77.method1056(class370.field4047, class370.field4095, class370.field4096);
            class77.method3602(33);
        } else if (arg0 == 17) {
            class77.method1056(class370.field4097, class370.field4098, class370.field4099);
        } else if (arg0 == 18) {
            class77.method4832(1);
        } else if (arg0 == 19) {
            class77.method1056(class370.field4103, class370.field4044, class370.field4180);
        } else if (arg0 == 20) {
            class77.method1056(class370.field4106, class370.field4311, class370.field4108);
        } else if (arg0 == 22) {
            class77.method1056(class370.field4109, class370.field4110, class370.field4111);
        } else if (arg0 == 23) {
            class77.method1056(class370.field4112, class370.field4113, class370.field4114);
        } else if (arg0 == 24) {
            class77.method1056(class370.field4176, class370.field4194, class370.field4172);
        } else if (arg0 == 25) {
            class77.method1056(class370.field4130, class370.field4119, class370.field4217);
        } else if (arg0 == 26) {
            class77.method1056(class370.field4121, class370.field4273, class370.field4143);
        } else if (arg0 == 27) {
            class77.method1056(class370.field4012, class370.field4125, class370.field4126);
        } else if (arg0 == 31) {
            class77.method1056(class370.field4133, class370.field4154, class370.field4135);
        } else if (arg0 == 32) {
            class77.method4832(2);
        } else if (arg0 == 37) {
            class77.method1056(class370.field4139, class370.field4140, class370.field4141);
        } else if (arg0 == 38) {
            class77.method1056(class370.field4183, class370.field4081, class370.field4144);
        } else if (arg0 == 74) {
            class77.method1056(class370.field4145, class370.field4146, class370.field4251);
        } else if (arg0 == 55) {
            class77.method3602(8);
        } else if (arg0 == 56) {
            class77.method1056(class370.field4035, class370.field4153, class370.field4086);
            method4521(11);
            return;
        } else if (arg0 == 57) {
            class77.method1056(class370.field4289, class370.field4156, class370.field4157);
            method4521(11);
            return;
        } else if (arg0 == 61) {
            class77.method1056("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class77.method3602(7);
        } else if (arg0 == 62) {
            method4521(10);
            class77.method3602(9);
            class77.method1056(class370.field4158, class370.field4159, class370.field4104);
            return;
        } else if (arg0 == 63) {
            method4521(10);
            class77.method3602(9);
            class77.method1056(class370.field4161, class370.field4162, class370.field4163);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method4521(10);
            class77.method3602(9);
            class77.method1056(class370.field4164, class370.field4206, class370.field4284);
            return;
        } else if (arg0 == 71) {
            method4521(10);
            class77.method3602(7);
            class77.method1056("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method4521(10);
            class77.method3602(6);
            class77.method1056(class370.field4295, class370.field4147, class370.field4315);
        } else if (arg0 == 72) {
            method4521(10);
            class77.method3602(32);
        } else {
            class77.method1056(class370.field4167, class370.field4168, class370.field4169);
        }
        method4521(10);
        int var4 = class77.field959;
        boolean var5 = var1 != var4;
        if (!var5 && field811.method8754()) {
            class77.method3602(9);
        }
    }

    @ObfuscatedName("mh.hx(I)V")
    public static final void method5371() {
        field574.method2646();
        Statics.method5390();
        Statics.field5117.method4364();
        for (int var0 = 0; var0 < 4; var0++) {
            field584[var0].method3998();
        }
        field750.method3952();
        System.gc();
        class322.method104(0, 0);
        class322.method2763();
        field719 = false;
        class71.method290();
        method4521(10);
        class181.method2555().method3261();
        class181.method2555().method3257();
    }

    @ObfuscatedName("en.hh(II)V")
    public static final void method2571(int arg0) {
        method5371();
        switch(arg0) {
            case 1:
                class77.method3602(24);
                class77.method1056(class370.field4242, class370.field4243, class370.field4244);
                break;
            case 2:
                class77.method3602(24);
                class77.method1056(class370.field4134, class370.field4240, class370.field4241);
        }
    }

    @ObfuscatedName("ed.ho(B)J")
    public static long method2622() {
        return field639;
    }

    @ObfuscatedName("qp.hy(I)J")
    public static long method7153() {
        return field640;
    }

    @ObfuscatedName("jv.hi(B)V")
    public static final void method4574() {
        Statics.field2035 = null;
        Statics.field2032 = null;
        Statics.field57 = 0;
    }

    @ObfuscatedName("bz.hl(ZI)V")
    public static final void method395(boolean arg0) {
        if (arg0) {
            field548 = class77.field952 ? class141.field1658 : class141.field1660;
        } else {
            field548 = Statics.field1336.method2356(class77.field945) ? class141.field1662 : class141.field1657;
        }
    }

    @ObfuscatedName("client.hu(B)V")
    public final void method1482() {
        if (field529 > 1) {
            field529--;
        }
        if (field575 > 0) {
            field575--;
        }
        if (field576) {
            field576 = false;
            Statics.method3387();
            return;
        }
        if (!field607) {
            method5715();
        }
        for (int var1 = 0; var1 < 100 && this.method1161(field574); var1++) {
        }
        if (field519 != 30) {
            return;
        }
        while (true) {
            class38 var2 = (class38) class37.field232.method6649();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field577.field4697) {
                    class313 var6 = class313.method7156(class311.field3216, field574.field1438);
                    var6.field3318.method8445(0);
                    int var7 = var6.field3318.field5233;
                    field577.method7255(var6.field3318);
                    var6.field3318.method8459(var6.field3318.field5233 - var7);
                    field574.method2654(var6);
                    field577.method7241();
                }
                Object var8 = Statics.field1028.field1098;
                synchronized (Statics.field1028.field1098) {
                    if (!field804) {
                        Statics.field1028.field1093 = 0;
                    } else if (class36.field224 != 0 || Statics.field1028.field1093 >= 40) {
                        class313 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field1028.field1093 && (var9 == null || var9.field3318.field5233 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field1028.field1095[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field1028.field1094[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field796 != var16 || field526 != var15) {
                                if (var9 == null) {
                                    var9 = class313.method7156(class311.field3284, field574.field1438);
                                    var9.field3318.method8445(0);
                                    var10 = var9.field3318.field5233;
                                    var9.field3318.field5233 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field527 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field796;
                                    var18 = var15 - field526;
                                    var19 = (int) ((Statics.field1028.field1092[var14] - field527) / 20L);
                                    var12 = (int) ((Statics.field1028.field1092[var14] - field527) % 20L + (long) var12);
                                }
                                field796 = var16;
                                field526 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3318.method8446((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3318.method8445(var19 + 128);
                                    var9.field3318.method8446((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3318.method8445(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3318.method8448(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3318.method8448(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3318.method8446((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3318.method8448(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3318.method8448(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field527 = Statics.field1028.field1092[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3318.method8459(var9.field3318.field5233 - var10);
                            int var20 = var9.field3318.field5233;
                            var9.field3318.field5233 = var10;
                            var9.field3318.method8445(var12 / var13);
                            var9.field3318.method8445(var12 % var13);
                            var9.field3318.field5233 = var20;
                            field574.method2654(var9);
                        }
                        if (var11 >= Statics.field1028.field1093) {
                            Statics.field1028.field1093 = 0;
                        } else {
                            Statics.field1028.field1093 -= var11;
                            System.arraycopy(Statics.field1028.field1094, var11, Statics.field1028.field1094, 0, Statics.field1028.field1093);
                            System.arraycopy(Statics.field1028.field1095, var11, Statics.field1028.field1095, 0, Statics.field1028.field1093);
                            System.arraycopy(Statics.field1028.field1092, var11, Statics.field1028.field1092, 0, Statics.field1028.field1093);
                        }
                    }
                }
                if (class36.field224 == 1 || !Statics.field4580 && class36.field224 == 4 || class36.field224 == 2) {
                    long var22 = class36.field227 - field675 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field675 = class36.field227 * -1L;
                    int var24 = class36.field228;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field3661) {
                        var24 = Statics.field3661;
                    }
                    int var25 = class36.field212;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field1700) {
                        var25 = Statics.field1700;
                    }
                    int var26 = (int) var22;
                    class313 var27 = class313.method7156(class311.field3235, field574.field1438);
                    var27.field3318.method8446((var26 << 1) + (class36.field224 == 2 ? 1 : 0));
                    var27.field3318.method8446(var25);
                    var27.field3318.method8446(var24);
                    field574.method2654(var27);
                }
                if (field553 != 0) {
                    class313 var28 = class313.method7156(class311.field3298, field574.field1438);
                    var28.field3318.method8446(field553);
                    field574.method2654(var28);
                }
                if (field749.field2432 > 0) {
                    class313 var29 = class313.method7156(class311.field3262, field574.field1438);
                    var29.field3318.method8446(0);
                    int var30 = var29.field3318.field5233;
                    long var31 = class318.method3596();
                    for (int var33 = 0; var33 < field749.field2432; var33++) {
                        long var34 = var31 - field754;
                        if (var34 > 16777215L) {
                            var34 = 16777215L;
                        }
                        field754 = var31;
                        var29.field3318.method8646((int) var34);
                        var29.field3318.method8494(field749.field2433[var33]);
                    }
                    var29.field3318.method8458(var29.field3318.field5233 - var30);
                    field574.method2654(var29);
                }
                if (field611 > 0) {
                    field611--;
                }
                if (field749.method3974(96) || field749.method3974(97) || field749.method3974(98) || field749.method3974(99)) {
                    field641 = true;
                }
                if (field641 && field611 <= 0) {
                    field611 = 20;
                    field641 = false;
                    class313 var36 = class313.method7156(class311.field3244, field574.field1438);
                    var36.field3318.method8595(field568);
                    var36.field3318.method8595(field597);
                    field574.method2654(var36);
                }
                if (Statics.field3023 && !field528) {
                    field528 = true;
                    class313 var37 = class313.method7156(class311.field3255, field574.field1438);
                    var37.field3318.method8445(1);
                    field574.method2654(var37);
                }
                if (!Statics.field3023 && field528) {
                    field528 = false;
                    class313 var38 = class313.method7156(class311.field3255, field574.field1438);
                    var38.field3318.method8445(0);
                    field574.method2654(var38);
                }
                if (Statics.field4536 != null) {
                    Statics.field4536.method8145();
                }
                if (Statics.field1132) {
                    if (Statics.field1674 != null) {
                        Statics.field1674.method7507();
                    }
                    for (int var39 = 0; var39 < class109.field1398; var39++) {
                        class93 var40 = field636[class109.field1387[var39]];
                        var40.method2231();
                    }
                    Statics.field1132 = false;
                }
                if (Statics.field894) {
                    for (int var41 = 0; var41 < class109.field1398; var41++) {
                        class93 var42 = field636[class109.field1387[var41]];
                        var42.method2234();
                    }
                    Statics.field894 = false;
                }
                if (Statics.field1861 != field757) {
                    field757 = Statics.field1861;
                    int var43 = Statics.field1861;
                    int[] var44 = Statics.field878.field5336;
                    int var45 = var44.length;
                    for (int var46 = 0; var46 < var45; var46++) {
                        var44[var46] = 0;
                    }
                    for (int var47 = 1; var47 < 103; var47++) {
                        int var48 = (103 - var47) * 2048 + 24628;
                        for (int var49 = 1; var49 < 103; var49++) {
                            if ((class83.field1047[var43][var49][var47] & 0x18) == 0) {
                                Statics.field5117.method4500(var44, var48, 512, var43, var49, var47);
                            }
                            if (var43 < 3 && (class83.field1047[var43 + 1][var49][var47] & 0x8) != 0) {
                                Statics.field5117.method4500(var44, var48, 512, var43 + 1, var49, var47);
                            }
                            var48 += 4;
                        }
                    }
                    int var50 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var51 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field878.method8891();
                    for (int var52 = 1; var52 < 103; var52++) {
                        for (int var53 = 1; var53 < 103; var53++) {
                            if ((class83.field1047[var43][var53][var52] & 0x18) == 0) {
                                Statics.method1132(var43, var53, var52, var50, var51);
                            }
                            if (var43 < 3 && (class83.field1047[var43 + 1][var53][var52] & 0x8) != 0) {
                                Statics.method1132(var43 + 1, var53, var52, var50, var51);
                            }
                        }
                    }
                    field628 = 0;
                    for (int var54 = 0; var54 < 104; var54++) {
                        for (int var55 = 0; var55 < 104; var55++) {
                            long var56 = Statics.field5117.method4373(Statics.field1861, var54, var55);
                            if (var56 != 0L) {
                                int var58 = class257.method3531(var56);
                                int var59 = class222.method2212(var58).field2283;
                                if (var59 >= 0 && class197.method5698(var59).field2013) {
                                    field761[field628] = class197.method5698(var59).method3426(false);
                                    field759[field628] = var54;
                                    field760[field628] = var55;
                                    field628++;
                                }
                            }
                        }
                    }
                    Statics.field1496.method8858();
                }
                if (field519 != 30) {
                    return;
                }
                method3398();
                method666();
                field574.field1443++;
                if (field574.field1443 > 750) {
                    Statics.method3387();
                    return;
                }
                int var60 = class109.field1398;
                int[] var61 = class109.field1387;
                for (int var62 = 0; var62 < var60; var62++) {
                    class93 var63 = field636[var61[var62]];
                    if (var63 != null) {
                        method6567(var63, 1);
                    }
                }
                for (int var64 = 0; var64 < field645; var64++) {
                    int var65 = field724[var64];
                    class102 var66 = field569[var65];
                    if (var66 != null) {
                        method6567(var66, var66.field1333.field2144);
                    }
                }
                method5351();
                field546++;
                if (field556 != 0) {
                    field631 += 20;
                    if (field631 >= 400) {
                        field556 = 0;
                    }
                }
                class350 var67 = Statics.field2907;
                class350 var68 = Statics.field3138;
                Statics.field2907 = null;
                Statics.field3138 = null;
                field699 = null;
                field703 = false;
                field700 = false;
                field612 = 0;
                while (field749.method3986() && field612 < 128) {
                    if (field691 >= 2 && field749.method3974(82) && field749.field2441 == 66) {
                        StringBuilder var69 = new StringBuilder();
                        Iterator var70 = class112.field1429.iterator();
                        while (var70.hasNext()) {
                            class65 var71 = (class65) var70.next();
                            if (var71.field467 != null && !var71.field467.isEmpty()) {
                                var69.append(var71.field467).append(':');
                            }
                            var69.append(var71.field466).append('\n');
                        }
                        String var72 = var69.toString();
                        Statics.field1468.method459(var72);
                    } else if (field589 != 1 || field749.field2429 <= 0) {
                        field768[field612] = field749.field2441;
                        field513[field612] = field749.field2429;
                        field612++;
                    }
                }
                if (method6041() && field749.method3974(82) && field749.method3974(81) && field553 != 0) {
                    int var74 = Statics.field1608.field1143 - field553;
                    if (var74 < 0) {
                        var74 = 0;
                    } else if (var74 > 3) {
                        var74 = 3;
                    }
                    if (Statics.field1608.field1143 != var74) {
                        method3496(Statics.field481 + Statics.field1608.field1271[0], Statics.field99 + Statics.field1608.field1272[0], var74, false);
                    }
                    field553 = 0;
                }
                if (field683 != -1) {
                    method431(field683, 0, 0, Statics.field1700, Statics.field3661, 0, 0);
                }
                field707++;
                while (true) {
                    class89 var75;
                    class350 var76;
                    class350 var77;
                    do {
                        var75 = (class89) field594.method6616();
                        if (var75 == null) {
                            while (true) {
                                class89 var78;
                                class350 var79;
                                class350 var80;
                                do {
                                    var78 = (class89) field521.method6616();
                                    if (var78 == null) {
                                        while (true) {
                                            class89 var81;
                                            class350 var82;
                                            class350 var83;
                                            do {
                                                var81 = (class89) field726.method6616();
                                                if (var81 == null) {
                                                    boolean var84 = false;
                                                    while (true) {
                                                        class228 var85 = (class228) field727.method6616();
                                                        if (var85 == null) {
                                                            if (!var84 && class36.field224 == 1) {
                                                                field750.method3952();
                                                            }
                                                            this.method1645();
                                                            method796();
                                                            if (field618 != null) {
                                                                this.method1167();
                                                            }
                                                            if (class247.method4385()) {
                                                                int var86 = class247.field2676;
                                                                int var87 = class247.field2702;
                                                                class313 var88 = class313.method7156(class311.field3285, field574.field1438);
                                                                var88.field3318.method8445(5);
                                                                var88.field3318.method8446(Statics.field481 + var86);
                                                                var88.field3318.method8445(field749.method3974(82) ? (field749.method3974(81) ? 2 : 1) : 0);
                                                                var88.field3318.method8595(Statics.field99 + var87);
                                                                field574.method2654(var88);
                                                                class247.method4386();
                                                                field555 = class36.field212;
                                                                field596 = class36.field228;
                                                                field556 = 1;
                                                                field631 = 0;
                                                                field762 = var86;
                                                                field763 = var87;
                                                            }
                                                            if (Statics.field2907 != var67) {
                                                                if (var67 != null) {
                                                                    method4817(var67);
                                                                }
                                                                if (Statics.field2907 != null) {
                                                                    method4817(Statics.field2907);
                                                                }
                                                            }
                                                            if (Statics.field3138 != var68 && field674 == field623) {
                                                                if (var68 != null) {
                                                                    method4817(var68);
                                                                }
                                                                if (Statics.field3138 != null) {
                                                                    method4817(Statics.field3138);
                                                                }
                                                            }
                                                            if (Statics.field3138 == null) {
                                                                if (field674 > 0) {
                                                                    field674--;
                                                                }
                                                            } else if (field674 < field623) {
                                                                field674++;
                                                                if (field674 == field623) {
                                                                    method4817(Statics.field3138);
                                                                }
                                                            }
                                                            if (field589 == 0) {
                                                                int var89 = Statics.field1608.field1220;
                                                                int var90 = Statics.field1608.field1260;
                                                                if (Statics.field1956 - var89 < -500 || Statics.field1956 - var89 > 500 || Statics.field2640 - var90 < -500 || Statics.field2640 - var90 > 500) {
                                                                    Statics.field1956 = var89;
                                                                    Statics.field2640 = var90;
                                                                }
                                                                if (Statics.field1956 != var89) {
                                                                    Statics.field1956 += (var89 - Statics.field1956) / 16;
                                                                }
                                                                if (Statics.field2640 != var90) {
                                                                    Statics.field2640 += (var90 - Statics.field2640) / 16;
                                                                }
                                                                int var91 = Statics.field1956 >> 7;
                                                                int var92 = Statics.field2640 >> 7;
                                                                int var93 = method292(Statics.field1956, Statics.field2640, Statics.field1861);
                                                                int var94 = 0;
                                                                if (var91 > 3 && var92 > 3 && var91 < 100 && var92 < 100) {
                                                                    for (int var95 = var91 - 4; var95 <= var91 + 4; var95++) {
                                                                        for (int var96 = var92 - 4; var96 <= var92 + 4; var96++) {
                                                                            int var97 = Statics.field1861;
                                                                            if (var97 < 3 && (class83.field1047[1][var95][var96] & 0x2) == 2) {
                                                                                var97++;
                                                                            }
                                                                            int var98 = var93 - class83.field1030[var97][var95][var96];
                                                                            if (var98 > var94) {
                                                                                var94 = var98;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int var99 = var94 * 192;
                                                                if (var99 > 98048) {
                                                                    var99 = 98048;
                                                                }
                                                                if (var99 < 32768) {
                                                                    var99 = 32768;
                                                                }
                                                                if (var99 > field613) {
                                                                    field613 += (var99 - field613) / 24;
                                                                } else if (var99 < field613) {
                                                                    field613 += (var99 - field613) / 80;
                                                                }
                                                                Statics.field2199 = method292(Statics.field1608.field1220, Statics.field1608.field1260, Statics.field1861) - field551;
                                                            } else if (field589 == 1) {
                                                                method3015();
                                                                short var100 = -1;
                                                                if (field749.method3974(33)) {
                                                                    var100 = 0;
                                                                } else if (field749.method3974(49)) {
                                                                    var100 = 1024;
                                                                }
                                                                if (field749.method3974(48)) {
                                                                    if (var100 == 0) {
                                                                        var100 = 1792;
                                                                    } else if (var100 == 1024) {
                                                                        var100 = 1280;
                                                                    } else {
                                                                        var100 = 1536;
                                                                    }
                                                                } else if (field749.method3974(50)) {
                                                                    if (var100 == 0) {
                                                                        var100 = 256;
                                                                    } else if (var100 == 1024) {
                                                                        var100 = 768;
                                                                    } else {
                                                                        var100 = 512;
                                                                    }
                                                                }
                                                                byte var101 = 0;
                                                                if (field749.method3974(35)) {
                                                                    var101 = -1;
                                                                } else if (field749.method3974(51)) {
                                                                    var101 = 1;
                                                                }
                                                                int var102 = 0;
                                                                if (var100 >= 0 || var101 != 0) {
                                                                    int var103 = field749.method3974(81) ? field608 : field676;
                                                                    var102 = var103 * 16;
                                                                    field581 = var100;
                                                                    field606 = var101;
                                                                }
                                                                if (field710 < var102) {
                                                                    field710 += var102 / 8;
                                                                    if (field710 > var102) {
                                                                        field710 = var102;
                                                                    }
                                                                } else if (field710 > var102) {
                                                                    field710 = field710 * 9 / 10;
                                                                }
                                                                if (field710 > 0) {
                                                                    int var104 = field710 / 16;
                                                                    if (field581 >= 0) {
                                                                        int var105 = field581 - Statics.field80 & 0x7FF;
                                                                        int var106 = class243.field2616[var105];
                                                                        int var107 = class243.field2613[var105];
                                                                        Statics.field1956 += var104 * var106 / 65536;
                                                                        Statics.field2640 += var104 * var107 / 65536;
                                                                    }
                                                                    if (field606 != 0) {
                                                                        Statics.field2199 += field606 * var104;
                                                                        if (Statics.field2199 > 0) {
                                                                            Statics.field2199 = 0;
                                                                        }
                                                                    }
                                                                } else {
                                                                    field581 = -1;
                                                                    field606 = -1;
                                                                }
                                                                if (field749.method3974(13)) {
                                                                    method3601();
                                                                }
                                                            }
                                                            if (class36.field210 == 4 && Statics.field4580) {
                                                                int var108 = class36.field218 - field601;
                                                                field704 = var108 * 2;
                                                                field601 = var108 == -1 || var108 == 1 ? class36.field218 : (field601 + class36.field218) / 2;
                                                                int var109 = field600 - class36.field217;
                                                                field753 = var109 * 2;
                                                                field600 = var109 == -1 || var109 == 1 ? class36.field217 : (field600 + class36.field217) / 2;
                                                            } else {
                                                                if (field749.method3974(96)) {
                                                                    field753 += (-24 - field753) / 2;
                                                                } else if (field749.method3974(97)) {
                                                                    field753 += (24 - field753) / 2;
                                                                } else {
                                                                    field753 /= 2;
                                                                }
                                                                if (field749.method3974(98)) {
                                                                    field704 += (12 - field704) / 2;
                                                                } else if (field749.method3974(99)) {
                                                                    field704 += (-12 - field704) / 2;
                                                                } else {
                                                                    field704 /= 2;
                                                                }
                                                                field601 = class36.field218;
                                                                field600 = class36.field217;
                                                            }
                                                            field597 = field753 / 2 + field597 & 0x7FF;
                                                            field568 += field704 / 2;
                                                            if (field568 < 128) {
                                                                field568 = 128;
                                                            }
                                                            if (field568 > 383) {
                                                                field568 = 383;
                                                            }
                                                            if (field627) {
                                                                method5156();
                                                            } else if (field516) {
                                                                if (!field604) {
                                                                    int var110 = Statics.field3464 * 128 + 64;
                                                                    int var111 = Statics.field1715 * 128 + 64;
                                                                    int var112 = method292(var110, var111, Statics.field1861) - Statics.field1277;
                                                                    method8(var110, var112, var111);
                                                                } else if (field777 != null) {
                                                                    Statics.field2966 = field777.method7897();
                                                                    Statics.field1990 = field777.method7895();
                                                                    if (field515) {
                                                                        Statics.field230 = field777.method7894();
                                                                    } else {
                                                                        Statics.field230 = method292(Statics.field2966, Statics.field1990, Statics.field1861) - field777.method7894();
                                                                    }
                                                                    field777.method7917();
                                                                }
                                                                if (field775) {
                                                                    if (field779 != null) {
                                                                        Statics.field1500 = field779.method7907();
                                                                        Statics.field1500 = Math.min(Math.max(Statics.field1500, 128), 383);
                                                                        field779.method7917();
                                                                    }
                                                                    if (field778 != null) {
                                                                        Statics.field80 = field778.method7907() & 0x7FF;
                                                                        field778.method7917();
                                                                    }
                                                                } else {
                                                                    int var113 = Statics.field2634 * 128 + 64;
                                                                    int var114 = Statics.field1120 * 128 + 64;
                                                                    int var115 = method292(var113, var114, Statics.field1861) - Statics.field39;
                                                                    int var116 = var113 - Statics.field2966;
                                                                    int var117 = var115 - Statics.field230;
                                                                    int var118 = var114 - Statics.field1990;
                                                                    int var119 = (int) Math.sqrt((double) (var116 * var116 + var118 * var118));
                                                                    int var120 = (int) (Math.atan2((double) var117, (double) var119) * 325.9490051269531D) & 0x7FF;
                                                                    int var121 = (int) (Math.atan2((double) var116, (double) var118) * -325.9490051269531D) & 0x7FF;
                                                                    method3290(var120, var121);
                                                                }
                                                            }
                                                            for (int var122 = 0; var122 < 5; var122++) {
                                                                int var10002 = field785[var122]++;
                                                            }
                                                            Statics.field1558.method2600();
                                                            int var123 = class36.method8318();
                                                            int var124 = field199.method348();
                                                            if (var123 > 15000 && var124 > 15000) {
                                                                field575 = 250;
                                                                class36.method2727(14500);
                                                                class313 var126 = class313.method7156(class311.field3220, field574.field1438);
                                                                field574.method2654(var126);
                                                            }
                                                            Statics.field3621.method1759();
                                                            method4828();
                                                            field574.field1444++;
                                                            if (field574.field1444 > 50) {
                                                                class313 var127 = class313.method7156(class311.field3204, field574.field1438);
                                                                field574.method2654(var127);
                                                            }
                                                            try {
                                                                field574.method2643();
                                                            } catch (IOException var129) {
                                                                Statics.method3387();
                                                            }
                                                            class181.method2555().method3259();
                                                            return;
                                                        }
                                                        if (var85.field2427.field3829 == 12) {
                                                            var84 = true;
                                                        }
                                                        method3498(var85);
                                                    }
                                                }
                                                var82 = var81.field1080;
                                                if (var82.field3744 < 0) {
                                                    break;
                                                }
                                                var83 = Statics.field2621.method5681(var82.field3796);
                                            } while (var83 == null || var83.field3862 == null || var82.field3744 >= var83.field3862.length || var83.field3862[var82.field3744] != var82);
                                            class72.method5202(var81);
                                        }
                                    }
                                    var79 = var78.field1080;
                                    if (var79.field3744 < 0) {
                                        break;
                                    }
                                    var80 = Statics.field2621.method5681(var79.field3796);
                                } while (var80 == null || var80.field3862 == null || var79.field3744 >= var80.field3862.length || var80.field3862[var79.field3744] != var79);
                                class72.method5202(var78);
                            }
                        }
                        var76 = var75.field1080;
                        if (var76.field3744 < 0) {
                            break;
                        }
                        var77 = Statics.field2621.method5681(var76.field3796);
                    } while (var77 == null || var77.field3862 == null || var76.field3744 >= var77.field3862.length || var77.field3862[var76.field3744] != var76);
                    class72.method5202(var75);
                }
            }
            class313 var4 = class313.method7156(class311.field3277, field574.field1438);
            var4.field3318.method8445(0);
            int var5 = var4.field3318.field5233;
            class37.method5294(var4.field3318);
            var4.field3318.method8459(var4.field3318.field5233 - var5);
            field574.method2654(var4);
        }
    }

    @ObfuscatedName("gf.hz(I)V")
    public static final void method3130() {
        if (Statics.field1677 != null) {
            Statics.field1677.method749();
        }
    }

    @ObfuscatedName("bs.he(I)V")
    public static final void method666() {
        for (int var0 = 0; var0 < field766; var0++) {
            int var10002 = field769[var0]--;
            if (field769[var0] >= -10) {
                class40 var2 = field772[var0];
                if (var2 == null) {
                    class40 var10000 = (class40) null;
                    var2 = class40.method710(Statics.field1670, field767[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field769[var0] += var2.method712();
                    field772[var0] = var2;
                }
                if (field769[var0] < 0) {
                    int var11;
                    if (field770[var0] == 0) {
                        var11 = Statics.field1336.method2361();
                    } else {
                        int var3 = (field770[var0] & 0xFF) * 128;
                        int var4 = field770[var0] >> 16 & 0xFF;
                        int var5 = Math.abs(var4 * 128 + 64 - Statics.field1608.field1220);
                        int var6 = field770[var0] >> 8 & 0xFF;
                        int var7 = Math.abs(var6 * 128 + 64 - Statics.field1608.field1260);
                        int var8 = Math.max(var5 + var7 - 128, 0);
                        int var9 = Math.max(((field771[var0] & 0x1F) - 1) * 128, 0);
                        if (var8 >= var3) {
                            field769[var0] = -100;
                            continue;
                        }
                        float var10 = var9 < var3 ? Math.min(Math.max((float) (var3 - var8) / (float) (var3 - var9), 0.0F), 1.0F) : 1.0F;
                        var11 = (int) (var10 * (float) Statics.field1336.method2363());
                    }
                    if (var11 > 0) {
                        class41 var12 = var2.method720().method723(Statics.field1067);
                        class49 var13 = class49.method829(var12, 100, var11);
                        var13.method832(field557[var0] - 1);
                        Statics.field1283.method670(var13);
                    }
                    field769[var0] = -100;
                }
            } else {
                field766--;
                for (int var1 = var0; var1 < field766; var1++) {
                    field767[var1] = field767[var1 + 1];
                    field772[var1] = field772[var1 + 1];
                    field557[var1] = field557[var1 + 1];
                    field769[var1] = field769[var1 + 1];
                    field770[var1] = field770[var1 + 1];
                    field771[var1] = field771[var1 + 1];
                }
                var0--;
            }
        }
        if (!field719) {
            return;
        }
        boolean var14;
        if (!class322.field3499.isEmpty()) {
            var14 = true;
        } else if (class322.field3496.isEmpty() || class322.field3496.get(0) == null || ((class334) class322.field3496.get(0)).field3614 == null) {
            var14 = false;
        } else {
            var14 = ((class334) class322.field3496.get(0)).field3614.method5448();
        }
        if (var14) {
            return;
        }
        if (Statics.field1336.method2391() != 0) {
            boolean var15 = !class322.field3497.isEmpty();
            if (var15) {
                class322.method3389(Statics.field1509, Statics.field1336.method2391());
            }
        }
        field719 = false;
    }

    @ObfuscatedName("lh.hs(Lig;IIILde;I)V")
    public static void method5222(class225 arg0, int arg1, int arg2, int arg3, class97 arg4) {
        if (field766 < 50 && arg0.field2375 != null && arg1 < arg0.field2375.length && arg0.field2375[arg1] != null) {
            int var5 = arg0.field2375[arg1].field2242 & 0x1F;
            if ((var5 <= 0 || Statics.field1336.method2363() != 0) && (var5 != 0 || Statics.field1336.method2361() != 0)) {
                method5354(arg0.field2375[arg1], arg2, arg3, Statics.field1608 == arg4);
            }
        }
    }

    @ObfuscatedName("ki.hd(Lig;IIILde;I)V")
    public static void method4838(class225 arg0, int arg1, int arg2, int arg3, class97 arg4) {
        if (field766 >= 50 || arg0.field2374 == null || !arg0.field2374.containsKey(arg1)) {
            return;
        }
        class221 var5 = (class221) arg0.field2374.get(arg1);
        if (var5 != null) {
            int var6 = var5.field2242 & 0x1F;
            if ((var6 <= 0 || Statics.field1336.method2363() != 0) && (var6 != 0 || Statics.field1336.method2361() != 0)) {
                method5354(var5, arg2, arg3, Statics.field1608 == arg4);
            }
        }
    }

    @ObfuscatedName("lk.hn(Lim;IIZI)V")
    public static void method5354(class221 arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (arg0.field2242 == 0) {
            if (!arg3) {
                return;
            }
            field770[field766] = 0;
        } else {
            int var4 = (arg1 - 64) / 128;
            int var5 = (arg2 - 64) / 128;
            field770[field766] = arg0.field2242 + (var4 << 16) + (var5 << 8);
        }
        field767[field766] = arg0.field2245;
        field557[field766] = arg0.field2243;
        field769[field766] = 0;
        field772[field766] = null;
        field771[field766] = arg0.field2244;
        field766++;
    }

    @ObfuscatedName("fz.hg(IIII)V")
    public static void method3011(int arg0, int arg1, int arg2) {
        if (Statics.field1336.method2361() == 0 || arg1 == 0 || field766 >= 50) {
            return;
        }
        field767[field766] = arg0;
        field557[field766] = arg1;
        field769[field766] = arg2;
        field772[field766] = null;
        field770[field766] = 0;
        field771[field766] = 0;
        field766++;
    }

    @ObfuscatedName("an.hk(II)V")
    public static void method14(int arg0) {
        if (arg0 == -1 && !field719) {
            class322.method104(0, 0);
        } else if (arg0 != -1) {
            boolean var2;
            if (class322.field3497.isEmpty()) {
                var2 = false;
            } else {
                class334 var1 = (class334) class322.field3497.get(0);
                var2 = var1 != null && var1.field3606 == arg0;
            }
            if (!var2 && Statics.field1336.method2391() != 0) {
                ArrayList var3 = new ArrayList();
                var3.add(new class334(Statics.field1509, arg0, 0, Statics.field1336.method2391(), false));
                if (field719) {
                    class322.method2460(var3, 0, 100, 100, 0);
                } else {
                    class322.method4517(var3, 0, 100, 100, 0, false);
                }
            }
        }
    }

    @ObfuscatedName("cs.ib(Ljava/util/ArrayList;IIIIB)V")
    public static void method1800(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field719) {
            class322.method104(0, 0);
        } else if (var5 != -1) {
            boolean var7;
            if (class322.field3497.isEmpty()) {
                var7 = false;
            } else {
                class334 var6 = (class334) class322.field3497.get(0);
                var7 = var6 != null && var6.field3606 == var5;
            }
            if (!var7 && Statics.field1336.method2391() != 0) {
                ArrayList var8 = new ArrayList();
                for (int var9 = 0; var9 < arg0.size(); var9++) {
                    var8.add(new class334(Statics.field1509, (Integer) arg0.get(var9), 0, Statics.field1336.method2391(), false));
                }
                if (field719) {
                    class322.method2460(var8, arg1, arg2, arg3, arg4);
                } else {
                    class322.method4517(var8, arg1, arg2, arg3, arg4, false);
                }
            }
        }
    }

    @ObfuscatedName("ft.if(IIS)V")
    public static void method2937(int arg0, int arg1) {
        if (Statics.field1336.method2391() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class334(Statics.field3168, arg0, 0, Statics.field1336.method2391(), false));
            class322.method4517(var2, 0, 0, 0, 0, true);
            field719 = true;
        }
    }

    @ObfuscatedName("client.ii(III)V")
    public void method1157(int arg0, int arg1) {
        if (field574 != null && field574.field1438 != null && arg0 > -1 && Statics.field1336.method2391() > 0 && !field719) {
            class313 var3 = class313.method7156(class311.field3229, field574.field1438);
            var3.field3318.method8448(arg0);
            field574.method2654(var3);
        }
    }

    @ObfuscatedName("el.in(Lnt;III)V")
    public static final void method2722(class350 arg0, int arg1, int arg2) {
        if (field764 != 0 && field764 != 3 || field607 || !(class36.field224 == 1 || !Statics.field4580 && class36.field224 == 4)) {
            return;
        }
        class337 var3 = arg0.method6058(Statics.field2621, true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field212 - arg1;
        int var5 = class36.field228 - arg2;
        if (!var3.method5648(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3625 / 2;
        int var7 = var5 - var3.field3630 / 2;
        int var8 = field597 & 0x7FF;
        int var9 = class243.field2616[var8];
        int var10 = class243.field2613[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1608.field1220 + var11 >> 7;
        int var14 = Statics.field1608.field1260 - var12 >> 7;
        class313 var15 = class313.method7156(class311.field3209, field574.field1438);
        var15.field3318.method8445(18);
        var15.field3318.method8446(Statics.field481 + var13);
        var15.field3318.method8445(field749.method3974(82) ? (field749.method3974(81) ? 2 : 1) : 0);
        var15.field3318.method8595(Statics.field99 + var14);
        var15.field3318.method8445(var6);
        var15.field3318.method8445(var7);
        var15.field3318.method8446(field597);
        var15.field3318.method8445(57);
        var15.field3318.method8445(0);
        var15.field3318.method8445(0);
        var15.field3318.method8445(89);
        var15.field3318.method8446(Statics.field1608.field1220);
        var15.field3318.method8446(Statics.field1608.field1260);
        var15.field3318.method8445(63);
        field574.method2654(var15);
        field762 = var13;
        field763 = var14;
    }

    @ObfuscatedName("lf.ie(I)V")
    public static final void method5351() {
        int[] var0 = class109.field1387;
        for (int var1 = 0; var1 < class109.field1398; var1++) {
            class93 var2 = field636[var0[var1]];
            if (var2 != null && var2.field1224 > 0) {
                var2.field1224--;
                if (var2.field1224 == 0) {
                    var2.field1211 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field645; var3++) {
            int var4 = field724[var3];
            class102 var5 = field569[var4];
            if (var5 != null && var5.field1224 > 0) {
                var5.field1224--;
                if (var5.field1224 == 0) {
                    var5.field1211 = null;
                }
            }
        }
    }

    @ObfuscatedName("vd.iq(Ljava/lang/String;B)V")
    public static final void method9075(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1336.method2346(!Statics.field1336.method2347());
            if (Statics.field1336.method2347()) {
                class112.method2177(99, "", "Roofs are now all hidden");
            } else {
                class112.method2177(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class407.method3456(arg0.substring(5).trim()) == 1;
            Statics.field1468.method506(var1);
            class243.method4200(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field540 = !field540;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field1336.method2353();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field599 = !field599;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field671 = !field671;
        }
        if (field691 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field4536.field5032 = !Statics.field4536.field5032;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field1336.method2352(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field1336.method2352(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                Statics.method3387();
            }
        }
        class313 var2 = class313.method7156(class311.field3246, field574.field1438);
        var2.field3318.method8445(arg0.length() + 1);
        var2.field3318.method8452(arg0);
        field574.method2654(var2);
    }

    @ObfuscatedName("my.il(II)I")
    public static final int method5614(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("gz.ij(IB)I")
    public static final int method3250(int arg0) {
        return Math.abs(arg0 - Statics.field80) > 1024 ? (arg0 < Statics.field80 ? 1 : -1) * 2048 + arg0 : arg0;
    }

    @ObfuscatedName("kv.ih(I)V")
    public static final void method5156() {
        method8(Statics.field3574, Statics.field880, Statics.field245);
        method3290(Statics.field4775, Statics.field3668);
        if (Statics.field3574 != Statics.field2966 || Statics.field880 != Statics.field230 || Statics.field245 != Statics.field1990 || Statics.field4775 != Statics.field1500 || Statics.field80 != Statics.field3668) {
            return;
        }
        field627 = false;
        field516 = false;
        field604 = false;
        field775 = false;
        Statics.field2634 = 0;
        Statics.field1120 = 0;
        Statics.field39 = 0;
        Statics.field4746 = 0;
        Statics.field2446 = 0;
        Statics.field92 = 0;
        Statics.field2717 = 0;
        Statics.field3464 = 0;
        Statics.field1715 = 0;
        Statics.field1277 = 0;
        field777 = null;
        field779 = null;
        field778 = null;
    }

    @ObfuscatedName("ah.ik(IIII)V")
    public static final void method8(int arg0, int arg1, int arg2) {
        if (Statics.field2966 < arg0) {
            Statics.field2966 += Statics.field92 * (arg0 - Statics.field2966) / 1000 + Statics.field2717;
            if (Statics.field2966 > arg0) {
                Statics.field2966 = arg0;
            }
        }
        if (Statics.field2966 > arg0) {
            Statics.field2966 -= Statics.field92 * (Statics.field2966 - arg0) / 1000 + Statics.field2717;
            if (Statics.field2966 < arg0) {
                Statics.field2966 = arg0;
            }
        }
        if (Statics.field230 < arg1) {
            Statics.field230 += Statics.field92 * (arg1 - Statics.field230) / 1000 + Statics.field2717;
            if (Statics.field230 > arg1) {
                Statics.field230 = arg1;
            }
        }
        if (Statics.field230 > arg1) {
            Statics.field230 -= Statics.field92 * (Statics.field230 - arg1) / 1000 + Statics.field2717;
            if (Statics.field230 < arg1) {
                Statics.field230 = arg1;
            }
        }
        if (Statics.field1990 < arg2) {
            Statics.field1990 += Statics.field92 * (arg2 - Statics.field1990) / 1000 + Statics.field2717;
            if (Statics.field1990 > arg2) {
                Statics.field1990 = arg2;
            }
        }
        if (Statics.field1990 > arg2) {
            Statics.field1990 -= Statics.field92 * (Statics.field1990 - arg2) / 1000 + Statics.field2717;
            if (Statics.field1990 < arg2) {
                Statics.field1990 = arg2;
            }
        }
    }

    @ObfuscatedName("gp.ic(IIB)V")
    public static final void method3290(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1500 < arg0) {
            Statics.field1500 += Statics.field2446 * (arg0 - Statics.field1500) / 1000 + Statics.field4746;
            if (Statics.field1500 > arg0) {
                Statics.field1500 = arg0;
            }
        } else if (Statics.field1500 > arg0) {
            Statics.field1500 -= Statics.field2446 * (Statics.field1500 - arg0) / 1000 + Statics.field4746;
            if (Statics.field1500 < arg0) {
                Statics.field1500 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field80;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field80 += Statics.field2446 * var3 / 1000 + Statics.field4746;
            Statics.field80 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field80 -= Statics.field2446 * -var3 / 1000 + Statics.field4746;
            Statics.field80 &= 0x7FF;
        }
        int var4 = var2 - Statics.field80;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field80 = var2;
        }
    }

    @ObfuscatedName("pm.io(Lde;II)V")
    public static final void method6567(class97 arg0, int arg1) {
        if (arg0.field1256 >= field523) {
            method2586(arg0);
        } else if (arg0.field1257 >= field523) {
            boolean var2 = field523 == arg0.field1257 || arg0.field1201 == -1 || arg0.field1248 != 0;
            if (!var2) {
                class225 var3 = class225.method288(arg0.field1201);
                if (var3 == null || var3.method3940()) {
                    var2 = true;
                } else {
                    var2 = arg0.field1247 + 1 > var3.field2393[arg0.field1246];
                }
            }
            if (var2) {
                int var4 = arg0.field1257 - arg0.field1256;
                int var5 = field523 - arg0.field1256;
                int var6 = arg0.field1252 * 128 + arg0.field1250 * 64;
                int var7 = arg0.field1250 * 64 + arg0.field1239 * 128;
                int var8 = arg0.field1259 * 128 + arg0.field1250 * 64;
                int var9 = arg0.field1254 * 128 + arg0.field1250 * 64;
                arg0.field1220 = ((var4 - var5) * var6 + var5 * var8) / var4;
                arg0.field1260 = ((var4 - var5) * var7 + var5 * var9) / var4;
            }
            arg0.field1258 = 0;
            arg0.field1267 = arg0.field1204;
            arg0.field1202 = arg0.field1267;
        } else {
            arg0.field1241 = arg0.field1206;
            if (arg0.field1274 == 0) {
                arg0.field1258 = 0;
            } else {
                label398: {
                    if (arg0.field1201 != -1 && arg0.field1248 == 0) {
                        class225 var10 = class225.method288(arg0.field1201);
                        if (arg0.field1275 > 0 && var10.field2399 == 0) {
                            arg0.field1258++;
                            break label398;
                        }
                        if (arg0.field1275 <= 0 && var10.field2400 == 0) {
                            arg0.field1258++;
                            break label398;
                        }
                    }
                    int var11 = arg0.field1220;
                    int var12 = arg0.field1260;
                    int var13 = arg0.field1271[arg0.field1274 - 1] * 128 + arg0.field1250 * 64;
                    int var14 = arg0.field1272[arg0.field1274 - 1] * 128 + arg0.field1250 * 64;
                    if (var11 < var13) {
                        if (var12 < var14) {
                            arg0.field1267 = 1280;
                        } else if (var12 > var14) {
                            arg0.field1267 = 1792;
                        } else {
                            arg0.field1267 = 1536;
                        }
                    } else if (var11 > var13) {
                        if (var12 < var14) {
                            arg0.field1267 = 768;
                        } else if (var12 > var14) {
                            arg0.field1267 = 256;
                        } else {
                            arg0.field1267 = 512;
                        }
                    } else if (var12 < var14) {
                        arg0.field1267 = 1024;
                    } else if (var12 > var14) {
                        arg0.field1267 = 0;
                    }
                    class234 var15 = arg0.field1209[arg0.field1274 - 1];
                    if (var13 - var11 <= 256 && var13 - var11 >= -256 && var14 - var12 <= 256 && var14 - var12 >= -256) {
                        int var16 = arg0.field1267 - arg0.field1202 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field1210;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field1245;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field1212;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field1218;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field1245;
                        }
                        arg0.field1241 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class102) {
                            var19 = ((class102) arg0).field1333.field2143;
                        }
                        if (var19) {
                            if (arg0.field1267 != arg0.field1202 && arg0.field1235 == -1 && arg0.field1269 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field1274 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field1274 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field1258 > 0 && arg0.field1274 > 1) {
                                var18 = 8;
                                arg0.field1258--;
                            }
                        } else {
                            if (arg0.field1274 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field1274 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field1258 > 0 && arg0.field1274 > 1) {
                                var18 = 8;
                                arg0.field1258--;
                            }
                        }
                        if (class234.field2486 == var15) {
                            var18 <<= 0x1;
                        } else if (class234.field2484 == var15) {
                            var18 >>= 0x1;
                        }
                        if (var18 >= 8) {
                            if (arg0.field1245 == arg0.field1241 && arg0.field1213 != -1) {
                                arg0.field1241 = arg0.field1213;
                            } else if (arg0.field1241 == arg0.field1210 && arg0.field1214 != -1) {
                                arg0.field1241 = arg0.field1214;
                            } else if (arg0.field1241 == arg0.field1218 && arg0.field1215 != -1) {
                                arg0.field1241 = arg0.field1215;
                            } else if (arg0.field1241 == arg0.field1212 && arg0.field1216 != -1) {
                                arg0.field1241 = arg0.field1216;
                            }
                        } else if (var18 <= 2) {
                            if (arg0.field1245 == arg0.field1241 && arg0.field1265 != -1) {
                                arg0.field1241 = arg0.field1265;
                            } else if (arg0.field1241 == arg0.field1210 && arg0.field1270 != -1) {
                                arg0.field1241 = arg0.field1270;
                            } else if (arg0.field1241 == arg0.field1218 && arg0.field1219 != -1) {
                                arg0.field1241 = arg0.field1219;
                            } else if (arg0.field1241 == arg0.field1212 && arg0.field1227 != -1) {
                                arg0.field1241 = arg0.field1227;
                            }
                        }
                        if (var11 != var13 || var12 != var14) {
                            if (var11 < var13) {
                                arg0.field1220 += var18;
                                if (arg0.field1220 > var13) {
                                    arg0.field1220 = var13;
                                }
                            } else if (var11 > var13) {
                                arg0.field1220 -= var18;
                                if (arg0.field1220 < var13) {
                                    arg0.field1220 = var13;
                                }
                            }
                            if (var12 < var14) {
                                arg0.field1260 += var18;
                                if (arg0.field1260 > var14) {
                                    arg0.field1260 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field1260 -= var18;
                                if (arg0.field1260 < var14) {
                                    arg0.field1260 = var14;
                                }
                            }
                        }
                        if (arg0.field1220 == var13 && arg0.field1260 == var14) {
                            arg0.field1274--;
                            if (arg0.field1275 > 0) {
                                arg0.field1275--;
                            }
                        }
                    } else {
                        arg0.field1220 = var13;
                        arg0.field1260 = var14;
                        arg0.field1274--;
                        if (arg0.field1275 > 0) {
                            arg0.field1275--;
                        }
                    }
                }
            }
        }
        if (arg0.field1220 < 128 || arg0.field1260 < 128 || arg0.field1220 >= 13184 || arg0.field1260 >= 13184) {
            arg0.field1201 = -1;
            arg0.field1256 = 0;
            arg0.field1257 = 0;
            arg0.method2291();
            arg0.field1220 = arg0.field1271[0] * 128 + arg0.field1250 * 64;
            arg0.field1260 = arg0.field1272[0] * 128 + arg0.field1250 * 64;
            arg0.method2286();
        }
        if (Statics.field1608 == arg0 && (arg0.field1220 < 1536 || arg0.field1260 < 1536 || arg0.field1220 >= 11776 || arg0.field1260 >= 11776)) {
            arg0.field1201 = -1;
            arg0.field1256 = 0;
            arg0.field1257 = 0;
            arg0.method2291();
            arg0.field1220 = arg0.field1271[0] * 128 + arg0.field1250 * 64;
            arg0.field1260 = arg0.field1272[0] * 128 + arg0.field1250 * 64;
            arg0.method2286();
        }
        if (arg0.field1235 != -1) {
            Object var20 = null;
            int var21 = 65536;
            class97 var22;
            if (arg0.field1235 < var21) {
                var22 = field569[arg0.field1235];
            } else {
                var22 = field636[arg0.field1235 - var21];
            }
            if (var22 != null) {
                int var23 = arg0.field1220 - var22.field1220;
                int var24 = arg0.field1260 - var22.field1260;
                if (var23 != 0 || var24 != 0) {
                    int var26 = (int) (Math.atan2((double) var23, (double) var24) * 325.94932345220167D) & 0x7FF;
                    arg0.field1267 = var26;
                }
            } else if (arg0.field1228) {
                arg0.field1235 = -1;
                arg0.field1228 = false;
            }
        }
        if (arg0.field1274 == 0 || arg0.field1258 > 0) {
            int var27 = -1;
            if (arg0.field1238 != -1 && arg0.field1217 != -1) {
                int var28 = arg0.field1238 * 128 - Statics.field481 * 128 + 64;
                int var29 = arg0.field1217 * 128 - Statics.field99 * 128 + 64;
                int var30 = arg0.field1220 - var28;
                int var31 = arg0.field1260 - var29;
                if (var30 != 0 || var31 != 0) {
                    int var32 = (int) (Math.atan2((double) var30, (double) var31) * 325.94932345220167D) & 0x7FF;
                    var27 = var32;
                }
            } else if (arg0.field1273 != -1) {
                var27 = arg0.field1273;
            }
            if (var27 != -1) {
                arg0.field1267 = var27;
                if (arg0.field1240) {
                    arg0.field1202 = arg0.field1267;
                }
            }
            arg0.method2308();
        }
        int var33 = arg0.field1267 - arg0.field1202 & 0x7FF;
        if (var33 == 0) {
            if (arg0.field1228) {
                arg0.field1235 = -1;
                arg0.field1228 = false;
            }
            arg0.field1268 = 0;
        } else {
            boolean var34 = true;
            boolean var35 = true;
            arg0.field1268++;
            int var36 = var33 > 1024 ? -1 : 1;
            arg0.field1202 += arg0.field1269 * var36;
            boolean var37 = true;
            if (var33 < arg0.field1269 || var33 > 2048 - arg0.field1269) {
                arg0.field1202 = arg0.field1267;
                var37 = false;
            }
            if (arg0.field1269 > 0 && arg0.field1241 == arg0.field1206 && (arg0.field1268 > 25 || var37)) {
                if (var36 == -1 && arg0.field1207 != -1) {
                    arg0.field1241 = arg0.field1207;
                } else if (var36 == 1 && arg0.field1208 != -1) {
                    arg0.field1241 = arg0.field1208;
                } else {
                    arg0.field1241 = arg0.field1245;
                }
            }
            arg0.field1202 &= 0x7FF;
        }
        method7838(arg0);
    }

    @ObfuscatedName("er.im(Lde;B)V")
    public static final void method2586(class97 arg0) {
        int var1 = Math.max(1, arg0.field1256 - field523);
        int var2 = arg0.field1252 * 128 + arg0.field1250 * 64;
        int var3 = arg0.field1250 * 64 + arg0.field1239 * 128;
        arg0.field1220 += (var2 - arg0.field1220) / var1;
        arg0.field1260 += (var3 - arg0.field1260) / var1;
        arg0.field1258 = 0;
        arg0.field1267 = arg0.field1204;
    }

    @ObfuscatedName("ss.is(Lde;I)V")
    public static final void method7838(class97 arg0) {
        arg0.field1203 = false;
        if (arg0.field1241 != -1) {
            class225 var1 = class225.method288(arg0.field1241);
            if (var1 == null) {
                arg0.field1241 = -1;
            } else if (!var1.method3940() && var1.field2386 != null) {
                arg0.field1243++;
                if (arg0.field1242 < var1.field2386.length && arg0.field1243 > var1.field2393[arg0.field1242]) {
                    arg0.field1243 = 1;
                    arg0.field1242++;
                    method5222(var1, arg0.field1242, arg0.field1220, arg0.field1260, arg0);
                }
                if (arg0.field1242 >= var1.field2386.length) {
                    if (var1.field2390 > 0) {
                        arg0.field1242 -= var1.field2390;
                        if (var1.field2398) {
                            arg0.field1244++;
                        }
                        if (arg0.field1242 < 0 || arg0.field1242 >= var1.field2386.length || var1.field2398 && arg0.field1244 >= var1.field2389) {
                            arg0.field1243 = 0;
                            arg0.field1242 = 0;
                            arg0.field1244 = 0;
                        }
                    } else {
                        arg0.field1243 = 0;
                        arg0.field1242 = 0;
                    }
                    method5222(var1, arg0.field1242, arg0.field1220, arg0.field1260, arg0);
                }
            } else if (var1.method3940()) {
                arg0.field1242++;
                int var2 = var1.method3904();
                if (arg0.field1242 < var2) {
                    method4838(var1, arg0.field1242, arg0.field1220, arg0.field1260, arg0);
                } else {
                    if (var1.field2390 > 0) {
                        arg0.field1242 -= var1.field2390;
                        if (var1.field2398) {
                            arg0.field1244++;
                        }
                        if (arg0.field1242 < 0 || arg0.field1242 >= var2 || var1.field2398 && arg0.field1244 >= var1.field2389) {
                            arg0.field1242 = 0;
                            arg0.field1243 = 0;
                            arg0.field1244 = 0;
                        }
                    } else {
                        arg0.field1243 = 0;
                        arg0.field1242 = 0;
                    }
                    method4838(var1, arg0.field1242, arg0.field1220, arg0.field1260, arg0);
                }
            } else {
                arg0.field1241 = -1;
            }
        }
        class507 var3 = new class507(arg0.method2290());
        for (class557 var4 = (class557) var3.method8175(); var4 != null; var4 = (class557) var3.next()) {
            if (var4.field5381 != -1 && field523 >= var4.field5382) {
                int var5 = class213.method2771(var4.field5381).field2183;
                if (var5 == -1) {
                    var4.method7855();
                    arg0.field1221--;
                } else {
                    var4.field5379 = Math.max(var4.field5379, 0);
                    class225 var6 = class225.method288(var5);
                    if (var6.field2386 != null && !var6.method3940()) {
                        var4.field5380++;
                        if (var4.field5379 < var6.field2386.length && var4.field5380 > var6.field2393[var4.field5379]) {
                            var4.field5380 = 1;
                            var4.field5379++;
                            method5222(var6, var4.field5379, arg0.field1220, arg0.field1260, arg0);
                        }
                        if (var4.field5379 >= var6.field2386.length) {
                            var4.method7855();
                            arg0.field1221--;
                        }
                    } else if (var6.method3940()) {
                        var4.field5379++;
                        int var7 = var6.method3904();
                        if (var4.field5379 < var7) {
                            method4838(var6, var4.field5379, arg0.field1220, arg0.field1260, arg0);
                        } else {
                            var4.method7855();
                            arg0.field1221--;
                        }
                    } else {
                        var4.method7855();
                        arg0.field1221--;
                    }
                }
            }
        }
        if (arg0.field1201 != -1 && arg0.field1248 <= 1) {
            class225 var8 = class225.method288(arg0.field1201);
            if (var8.field2399 == 1 && arg0.field1275 > 0 && arg0.field1256 <= field523 && arg0.field1257 < field523) {
                arg0.field1248 = 1;
                return;
            }
        }
        if (arg0.field1201 != -1 && arg0.field1248 == 0) {
            class225 var9 = class225.method288(arg0.field1201);
            if (var9 == null) {
                arg0.field1201 = -1;
            } else if (!var9.method3940() && var9.field2386 != null) {
                arg0.field1247++;
                if (arg0.field1246 < var9.field2386.length && arg0.field1247 > var9.field2393[arg0.field1246]) {
                    arg0.field1247 = 1;
                    arg0.field1246++;
                    method5222(var9, arg0.field1246, arg0.field1220, arg0.field1260, arg0);
                }
                if (arg0.field1246 >= var9.field2386.length) {
                    arg0.field1246 -= var9.field2390;
                    arg0.field1249++;
                    if (arg0.field1249 >= var9.field2389) {
                        arg0.field1201 = -1;
                    } else if (arg0.field1246 >= 0 && arg0.field1246 < var9.field2386.length) {
                        method5222(var9, arg0.field1246, arg0.field1220, arg0.field1260, arg0);
                    } else {
                        arg0.field1201 = -1;
                    }
                }
                arg0.field1203 = var9.field2377;
            } else if (var9.method3940()) {
                arg0.field1246++;
                int var10 = var9.method3904();
                if (arg0.field1246 < var10) {
                    method4838(var9, arg0.field1246, arg0.field1220, arg0.field1260, arg0);
                } else {
                    arg0.field1246 -= var9.field2390;
                    arg0.field1249++;
                    if (arg0.field1249 >= var9.field2389) {
                        arg0.field1201 = -1;
                    } else if (arg0.field1246 >= 0 && arg0.field1246 < var10) {
                        method4838(var9, arg0.field1246, arg0.field1220, arg0.field1260, arg0);
                    } else {
                        arg0.field1201 = -1;
                    }
                }
            } else {
                arg0.field1201 = -1;
            }
        }
        if (arg0.field1248 > 0) {
            arg0.field1248--;
        }
    }

    @ObfuscatedName("bq.id(B)V")
    public static void method796() {
        if (Statics.field4536 != null) {
            Statics.field4536.method7951(Statics.field1861, (Statics.field1608.field1220 >> 7) + Statics.field481, (Statics.field1608.field1260 >> 7) + Statics.field99, false);
            Statics.field4536.method7968();
        }
    }

    @ObfuscatedName("hq.it(Ldi;III)V")
    public static void method3335(class93 arg0, int arg1, int arg2) {
        if (arg0.field1201 == arg1 && arg1 != -1) {
            int var3 = class225.method288(arg1).field2397;
            if (var3 == 1) {
                arg0.field1246 = 0;
                arg0.field1247 = 0;
                arg0.field1248 = arg2;
                arg0.field1249 = 0;
            }
            if (var3 == 2) {
                arg0.field1249 = 0;
            }
        } else if (arg1 == -1 || arg0.field1201 == -1 || class225.method288(arg1).field2394 >= class225.method288(arg0.field1201).field2394) {
            arg0.field1201 = arg1;
            arg0.field1246 = 0;
            arg0.field1247 = 0;
            arg0.field1248 = arg2;
            arg0.field1249 = 0;
            arg0.field1275 = arg0.field1274;
        }
    }

    @ObfuscatedName("bh.ig(I)I")
    public static int method664() {
        return field742 ? 2 : 1;
    }

    @ObfuscatedName("dw.iv(II)V")
    public static void method2214(int arg0) {
        field741 = 0L;
        if (arg0 >= 2) {
            field742 = true;
        } else {
            field742 = false;
        }
        if (method664() == 1) {
            Statics.field1468.method455(765, 503);
        } else {
            Statics.field1468.method455(7680, 2160);
        }
        if (field519 < 25 || field574 == null || field574.field1438 == null) {
            return;
        }
        class313 var1 = class313.method7156(class311.field3279, field574.field1438);
        var1.field3318.method8445(method664());
        var1.field3318.method8446(Statics.field1700);
        var1.field3318.method8446(Statics.field3661);
        field574.method2654(var1);
    }

    @ObfuscatedName("client.ax(B)V")
    public final void method465() {
        field741 = class318.method3596() + 500L;
        this.method1160();
        if (field683 != -1) {
            this.method1165(true);
        }
    }

    @ObfuscatedName("client.iy(I)V")
    public void method1160() {
        int var1 = Statics.field1700;
        int var2 = Statics.field3661;
        if (this.field179 < var1) {
            int var3 = this.field179;
        }
        if (this.field180 < var2) {
            int var4 = this.field180;
        }
        if (Statics.field1336 == null) {
            return;
        }
        try {
            client var5 = Statics.field1468;
            Object[] var6 = new Object[] { method664() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.ip(I)V")
    public final void method1221() {
        if (field683 != -1) {
            int var1 = field683;
            if (Statics.field2621.method5685(var1)) {
                method2985(Statics.field2621.field3646[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field731; var2++) {
            if (field733[var2]) {
                field817[var2] = true;
            }
            field735[var2] = field733[var2];
            field733[var2] = false;
        }
        field732 = field523;
        field672 = -1;
        field673 = -1;
        if (field683 != -1) {
            field731 = 0;
            method2639(field683, 0, 0, Statics.field1700, Statics.field3661, 0, 0, -1);
        }
        class545.method8775();
        if (field633) {
            if (field556 == 1) {
                Statics.field3131[field631 / 100].method8900(field555 - 8, field596 - 8);
            }
            if (field556 == 2) {
                Statics.field3131[field631 / 100 + 4].method8900(field555 - 8, field596 - 8);
            }
        }
        if (field607) {
            method6556();
        } else if (field672 != -1) {
            int var3 = field672;
            int var4 = field673;
            if ((field660 >= 2 || field714 != 0 || field678) && field671) {
                int var5 = field660 - 1;
                String var7;
                if (field714 == 1 && field660 < 2) {
                    var7 = class370.field4173 + class370.field4024 + field677 + " " + class103.field1346;
                } else if (field678 && field660 < 2) {
                    var7 = field558 + class370.field4024 + field802 + " " + class103.field1346;
                } else {
                    var7 = method3947(var5);
                }
                if (field660 > 2) {
                    var7 = var7 + class103.method1026(16777215) + " " + '/' + " " + (field660 - 2) + class370.field4231;
                }
                Statics.field98.method7029(var7, var3 + 4, var4 + 15, 16777215, 0, field523 / 1000);
            }
        }
        if (field740 == 3) {
            for (int var8 = 0; var8 < field731; var8++) {
                if (field735[var8]) {
                    class545.method8783(field736[var8], field737[var8], field738[var8], field681[var8], 16711935, 128);
                } else if (field817[var8]) {
                    class545.method8783(field736[var8], field737[var8], field738[var8], field681[var8], 16711680, 128);
                }
            }
        }
        int var9 = Statics.field1861;
        int var10 = Statics.field1608.field1220;
        int var11 = Statics.field1608.field1260;
        int var12 = field546;
        for (class71 var13 = (class71) class71.field856.method6591(); var13 != null; var13 = (class71) class71.field856.method6605()) {
            if (var13.field849 != -1 || var13.field853 != null) {
                int var14 = 0;
                if (var10 > var13.field854) {
                    var14 += var10 - var13.field854;
                } else if (var10 < var13.field843) {
                    var14 += var13.field843 - var10;
                }
                if (var11 > var13.field846) {
                    var14 += var11 - var13.field846;
                } else if (var11 < var13.field841) {
                    var14 += var13.field841 - var11;
                }
                int var15 = Math.max(var14 - 64, 0);
                if (var15 >= var13.field847 || Statics.field1336.method2363() == 0 || var13.field845 != var9) {
                    if (var13.field850 != null) {
                        Statics.field1283.method669(var13.field850);
                        var13.field850 = null;
                    }
                    if (var13.field852 != null) {
                        Statics.field1283.method669(var13.field852);
                        var13.field852 = null;
                    }
                } else {
                    float var16 = var13.field848 < var13.field847 ? Math.min(Math.max((float) (var13.field847 - var15) / (float) (var13.field847 - var13.field848), 0.0F), 1.0F) : 1.0F;
                    int var17 = (int) (var16 * (float) Statics.field1336.method2363());
                    class40 var10000;
                    if (var13.field850 != null) {
                        var13.field850.method833(var17);
                    } else if (var13.field849 >= 0) {
                        var10000 = (class40) null;
                        class40 var18 = class40.method710(Statics.field1670, var13.field849, 0);
                        if (var18 != null) {
                            class41 var19 = var18.method720().method723(Statics.field1067);
                            class49 var20 = class49.method829(var19, 100, var17);
                            var20.method832(-1);
                            Statics.field1283.method670(var20);
                            var13.field850 = var20;
                        }
                    }
                    if (var13.field852 != null) {
                        var13.field852.method833(var17);
                        if (!var13.field852.method7854()) {
                            var13.field852 = null;
                        }
                    } else if (var13.field853 != null && (var13.field844 -= var12) <= 0) {
                        int var21 = (int) (Math.random() * (double) var13.field853.length);
                        var10000 = (class40) null;
                        class40 var22 = class40.method710(Statics.field1670, var13.field853[var21], 0);
                        if (var22 != null) {
                            class41 var23 = var22.method720().method723(Statics.field1067);
                            class49 var24 = class49.method829(var23, 100, var17);
                            var24.method832(0);
                            Statics.field1283.method670(var24);
                            var13.field852 = var24;
                            var13.field844 = var13.field842 + (int) (Math.random() * (double) (var13.field855 - var13.field842));
                        }
                    }
                }
            }
        }
        field546 = 0;
    }

    @ObfuscatedName("kp.ia(Ljava/lang/String;ZI)V")
    public static final void method5170(String arg0, boolean arg1) {
        if (!field635) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3468.method7013(arg0, 250);
        int var6 = Statics.field3468.method7032(arg0, 250) * 13;
        class545.method8784(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class545.method8825(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3468.method7021(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method6483(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field1496.method439(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field731; var11++) {
            if (field738[var11] + field736[var11] > var7 && field736[var11] < var7 + var9 && field737[var11] + field681[var11] > var8 && field737[var11] < var8 + var10) {
                field817[var11] = true;
            }
        }
    }

    @ObfuscatedName("kp.ix(IIIII)V")
    public static final void method5167(int arg0, int arg1, int arg2, int arg3) {
        field626++;
        if (Statics.field1608.field1220 >> 7 == field762 && Statics.field1608.field1260 >> 7 == field763) {
            field762 = 0;
        }
        method2530();
        if (field592 >= 0 && field636[field592] != null) {
            Statics.method3131(field636[field592], false);
        }
        method5378(true);
        method3578();
        method5378(false);
        for (class78 var4 = (class78) field524.method6591(); var4 != null; var4 = (class78) field524.method6605()) {
            if (Statics.field1861 != var4.field968 || field523 > var4.field977) {
                var4.method7855();
            } else if (field523 >= var4.field976) {
                if (!var4.field982 && var4.field980 != 0) {
                    if (var4.field980 > 0) {
                        class102 var5 = field569[var4.field980 - 1];
                        if (var5 != null && var5.field1220 >= 0 && var5.field1220 < 13312 && var5.field1260 >= 0 && var5.field1260 < 13312) {
                            var4.field969 = var5.field1220;
                            var4.field970 = var5.field1260;
                            var4.method2080(var4.field973, var4.field974, var4.field975, field523);
                        }
                    } else {
                        int var6 = -var4.field980 - 1;
                        class93 var7;
                        if (field578 == var6) {
                            var7 = Statics.field1608;
                        } else {
                            var7 = field636[var6];
                        }
                        if (var7 != null && var7.field1220 >= 0 && var7.field1220 < 13312 && var7.field1260 >= 0 && var7.field1260 < 13312) {
                            var4.field969 = var7.field1220;
                            var4.field970 = var7.field1260;
                            var4.method2080(var4.field973, var4.field974, var4.field975, field523);
                        }
                    }
                }
                if (var4.field984 > 0) {
                    class102 var8 = field569[var4.field984 - 1];
                    if (var8 != null && var8.field1220 >= 0 && var8.field1220 < 13312 && var8.field1260 >= 0 && var8.field1260 < 13312) {
                        var4.method2080(var8.field1220, var8.field1260, method292(var8.field1220, var8.field1260, var4.field968) - var4.field972, field523);
                    }
                }
                if (var4.field984 < 0) {
                    int var9 = -var4.field984 - 1;
                    class93 var10;
                    if (field578 == var9) {
                        var10 = Statics.field1608;
                    } else {
                        var10 = field636[var9];
                    }
                    if (var10 != null && var10.field1220 >= 0 && var10.field1220 < 13312 && var10.field1260 >= 0 && var10.field1260 < 13312) {
                        var4.method2080(var10.field1220, var10.field1260, method292(var10.field1220, var10.field1260, var4.field968) - var4.field972, field523);
                    }
                }
                var4.method2071(field546);
                Statics.field5117.method4427(Statics.field1861, (int) var4.field978, (int) var4.field985, (int) var4.field967, 60, var4, var4.field971, -1L, false);
            }
        }
        method7154();
        method2096(arg0, arg1, arg2, arg3, true);
        int var11 = field765;
        int var12 = field646;
        int var13 = field692;
        int var14 = field797;
        class545.method8801(var11, var12, var11 + var13, var12 + var14);
        class243.method4214();
        class545.method8811();
        int var15 = field568;
        if (field613 / 256 > var15) {
            var15 = field613 / 256;
        }
        if (field781[4] && field783[4] + 128 > var15) {
            var15 = field783[4] + 128;
        }
        int var16 = field597 & 0x7FF;
        method2855(Statics.field1956, Statics.field2199, Statics.field2640, var15, var16, method2764(var15), var14);
        int var17;
        if (field516) {
            int var18;
            if (Statics.field1336.method2347()) {
                var18 = Statics.field1861;
            } else {
                int var19 = method292(Statics.field2966, Statics.field1990, Statics.field1861);
                if (var19 - Statics.field230 >= 800 || (class83.field1047[Statics.field1861][Statics.field2966 >> 7][Statics.field1990 >> 7] & 0x4) == 0) {
                    var18 = 3;
                } else {
                    var18 = Statics.field1861;
                }
            }
            var17 = var18;
        } else {
            var17 = Statics.method3802();
        }
        int var20 = Statics.field2966;
        int var21 = Statics.field230;
        int var22 = Statics.field1990;
        int var23 = Statics.field1500;
        int var24 = Statics.field80;
        for (int var25 = 0; var25 < 5; var25++) {
            if (field781[var25]) {
                int var26 = (int) (Math.random() * (double) (field745[var25] * 2 + 1) - (double) field745[var25] + Math.sin((double) field549[var25] / 100.0D * (double) field785[var25]) * (double) field783[var25]);
                if (var25 == 0) {
                    Statics.field2966 += var26;
                }
                if (var25 == 1) {
                    Statics.field230 += var26;
                }
                if (var25 == 2) {
                    Statics.field1990 += var26;
                }
                if (var25 == 3) {
                    Statics.field80 = Statics.field80 + var26 & 0x7FF;
                }
                if (var25 == 4) {
                    Statics.field1500 += var26;
                    if (Statics.field1500 < 128) {
                        Statics.field1500 = 128;
                    }
                    if (Statics.field1500 > 383) {
                        Statics.field1500 = 383;
                    }
                }
            }
        }
        int var27 = class36.field217;
        int var28 = class36.field218;
        if (class36.field224 != 0) {
            var27 = class36.field212;
            var28 = class36.field228;
        }
        if (var27 >= var11 && var27 < var11 + var13 && var28 >= var12 && var28 < var12 + var14) {
            int var29 = var27 - var11;
            int var30 = var28 - var12;
            class257.field2857 = var29;
            class257.field2858 = var30;
            class257.field2864 = true;
            class257.field2861 = 0;
            class257.field2859 = false;
        } else {
            class257.field2864 = false;
            class257.field2861 = 0;
        }
        method3130();
        class545.method8784(var11, var12, var13, var14, 0);
        method3130();
        int var31 = class243.method4258();
        class243.method4200(Statics.field1468.field173);
        class243.field2612.field2890 = field798;
        Statics.field5117.method4387(Statics.field2966, Statics.field230, Statics.field1990, Statics.field1500, Statics.field80, var17);
        class243.method4200(false);
        if (field540) {
            class545.method8797();
        }
        class243.field2612.field2890 = var31;
        method3130();
        Statics.field5117.method4361();
        method2466(var11, var12, var13, var14);
        Statics.method987(var11, var12);
        ((class253) class243.field2612.field2901).method4553(field546);
        method660(var11, var12, var13, var14);
        Statics.field2966 = var20;
        Statics.field230 = var21;
        Statics.field1990 = var22;
        Statics.field1500 = var23;
        Statics.field80 = var24;
        if (field522 && Statics.field1024.method6426(true, false) == 0) {
            field522 = false;
        }
        if (field522) {
            class545.method8784(var11, var12, var13, var14, 0);
            method5170(class370.field4018, false);
        }
    }

    @ObfuscatedName("dj.ir(IIIIZI)V")
    public static final void method2096(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field786;
        } else if (var5 >= 100) {
            var6 = field787;
        } else {
            var6 = (field787 - field786) * var5 / 100 + field786;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field792) {
            short var8 = field792;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field729) {
                var6 = field729;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class545.method8775();
                    class545.method8784(arg0, arg1, var10, arg3, -16777216);
                    class545.method8784(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field793) {
            short var11 = field793;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field790) {
                var6 = field790;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class545.method8775();
                    class545.method8784(arg0, arg1, arg2, var13, -16777216);
                    class545.method8784(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field798 = arg3 * var6 / 334;
        if (field692 != arg2 || field797 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method2764(var16);
                int var18 = class243.field2616[var16];
                int var19 = method88(var17, arg3);
                var14[var15] = var18 * var19 >> 16;
            }
            class247.method4381(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field765 = arg0;
        field646 = arg1;
        field692 = arg2;
        field797 = arg3;
    }

    @ObfuscatedName("dk.iw(B)V")
    public static void method2530() {
        if (field599) {
            Statics.method3131(Statics.field1608, false);
        }
    }

    @ObfuscatedName("hk.iz(I)V")
    public static void method3578() {
        int var0 = class109.field1398;
        int[] var1 = class109.field1387;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field592 != var1[var2] && field578 != var1[var2]) {
                Statics.method3131(field636[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("mi.jl(ZB)V")
    public static final void method5378(boolean arg0) {
        for (int var1 = 0; var1 < field645; var1++) {
            class102 var2 = field569[field724[var1]];
            if (var2 != null && var2.method2240() && var2.field1333.field2134 == arg0 && var2.field1333.method3548()) {
                int var3 = var2.field1220 >> 7;
                int var4 = var2.field1260 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1250 == 1 && (var2.field1220 & 0x7F) == 64 && (var2.field1260 & 0x7F) == 64) {
                        if (field626 == field652[var3][var4]) {
                            continue;
                        }
                        field652[var3][var4] = field626;
                    }
                    long var5 = class257.method3017(0, 0, 1, !var2.field1333.field2142, field724[var1]);
                    var2.field1229 = field523;
                    Statics.field5117.method4427(Statics.field1861, var2.field1220, var2.field1260, method292(var2.field1220 + (var2.field1250 * 64 - 64), var2.field1260 + (var2.field1250 * 64 - 64), Statics.field1861), var2.field1250 * 64 - 64 + 60, var2, var2.field1202, var5, var2.field1203);
                }
            }
        }
    }

    @ObfuscatedName("qp.jq(B)V")
    public static final void method7154() {
        for (class73 var0 = (class73) field653.method6591(); var0 != null; var0 = (class73) field653.method6605()) {
            if (Statics.field1861 != var0.field892 || var0.field883) {
                var0.method7855();
            } else if (field523 >= var0.field882) {
                var0.method1977(field546);
                if (var0.field883) {
                    var0.method7855();
                } else {
                    Statics.field5117.method4427(var0.field892, var0.field897, var0.field885, var0.field886, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("fm.jf(I)Lps;")
    public static class398 method2911() {
        return field726;
    }

    @ObfuscatedName("gx.jk(I)V")
    public static void method3095() {
        for (class228 var0 = (class228) field727.method6591(); var0 != null; var0 = (class228) field727.method6605()) {
            var0.method7855();
        }
    }

    @ObfuscatedName("hu.jb(Lip;I)V")
    public static void method3498(class228 arg0) {
        if (arg0 == null || arg0.field2427 == null) {
            return;
        }
        if (arg0.field2427.field3744 >= 0) {
            class350 var1 = Statics.field2621.method5681(arg0.field2427.field3796);
            if (var1 == null || var1.field3862 == null || var1.field3862.length == 0 || arg0.field2427.field3744 >= var1.field3862.length || var1.field3862[arg0.field2427.field3744] != arg0.field2427) {
                return;
            }
        }
        if (arg0.field2427.field3829 == 11 && arg0.field2425 == 0) {
            if (arg0.field2427.method6167(arg0.field2423, arg0.field2426, 0, 0)) {
                arg0.field2427.method6169().method3146().method3272(1, arg0.field2427.method6169().method3158());
                switch(arg0.field2427.method6072()) {
                    case 0:
                        class32.method2865(arg0.field2427.method6074(), true, false);
                        break;
                    case 1:
                        int var2 = method450(arg0.field2427);
                        boolean var3 = (var2 >> 22 & 0x1) != 0;
                        if (var3) {
                            int[] var4 = arg0.field2427.method6075();
                            if (var4 != null) {
                                class313 var5 = class313.method7156(class311.field3295, field574.field1438);
                                var5.field3318.method8447(arg0.field2427.method6073());
                                var5.field3318.method8446(arg0.field2427.field3744);
                                var5.field3318.method8448(var4[1]);
                                var5.field3318.method8604(var4[2]);
                                var5.field3318.method8447(arg0.field2427.field3769);
                                var5.field3318.method8604(var4[0]);
                                field574.method2654(var5);
                            }
                        }
                }
            }
        } else if (arg0.field2427.field3829 == 12) {
            class348 var6 = arg0.field2427.method6067();
            if (var6 != null && var6.method5816()) {
                switch(arg0.field2425) {
                    case 0:
                        field750.method3950(arg0.field2427);
                        var6.method5886(true);
                        var6.method5803(arg0.field2423, arg0.field2426, field749.method3974(82), field749.method3974(81));
                        break;
                    case 1:
                        var6.method5795(arg0.field2423, arg0.field2426);
                }
            }
        }
    }

    @ObfuscatedName("pv.jh(I)Z")
    public static boolean method6560() {
        return (field642 & 0x4) != 0;
    }

    @ObfuscatedName("an.jz(I)Z")
    public static boolean method17() {
        return (field642 & 0x1) != 0;
    }

    @ObfuscatedName("dm.jr(I)Z")
    public static boolean method2121() {
        return (field642 & 0x2) != 0;
    }

    @ObfuscatedName("dm.jt(B)Z")
    public static boolean method2170() {
        return (field642 & 0x8) != 0;
    }

    @ObfuscatedName("so.jy(Ldi;I)Z")
    public static boolean method7770(class93 arg0) {
        if (field642 == 0) {
            return false;
        } else if (Statics.field1608 == arg0) {
            return method2170();
        } else {
            return method6560() || method17() && arg0.method2227() || method2121() && arg0.method2259();
        }
    }

    @ObfuscatedName("hq.jp(Lde;IIIIIB)V")
    public static final void method3336(class97 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2240()) {
            return;
        }
        if (arg0 instanceof class102) {
            class208 var6 = ((class102) arg0).field1333;
            if (var6.field2139 != null) {
                var6 = var6.method3534();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class109.field1398;
        int[] var8 = class109.field1387;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1211 != null && (!var9 || !arg0.field1223 && (field744 == 4 || !arg0.field1253 && (field744 == 0 || field744 == 3 || field744 == 1 && ((class93) arg0).method2227())))) {
            method2623(arg0, arg0.field1222);
            if (field773 > -1 && field614 < field615) {
                field605[field614] = Statics.field98.method7062(arg0.field1211) / 2;
                field776[field614] = Statics.field98.field4617;
                field616[field614] = field773;
                field617[field614] = field563 - var10;
                field620[field614] = arg0.field1225;
                field794[field614] = arg0.field1226;
                field637[field614] = arg0.field1224;
                field780[field614] = arg0.field1263;
                field752[field614] = arg0.field1211;
                field614++;
                var10 += 12;
            }
        }
        if (!arg0.field1234.method6714()) {
            method2623(arg0, arg0.field1222 + 15);
            for (class101 var11 = (class101) arg0.field1234.method6649(); var11 != null; var11 = (class101) arg0.field1234.method6650()) {
                class98 var12 = var11.method2457(field523);
                if (var12 != null) {
                    class200 var13 = var11.field1323;
                    class549 var14 = var13.method3492();
                    class549 var15 = var13.method3489();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field2057;
                    } else {
                        if (var13.field2058 * 2 < var15.field5330) {
                            var16 = var13.field2058;
                        }
                        var17 = var15.field5330 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field523 - var12.field1281;
                    int var21 = var12.field1280 * var17 / var13.field2057;
                    int var24;
                    if (var12.field1282 > var20) {
                        int var22 = var13.field2050 == 0 ? 0 : var20 / var13.field2050 * var13.field2050;
                        int var23 = var12.field1279 * var17 / var13.field2057;
                        var24 = (var21 - var23) * var22 / var12.field1282 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field1282 + var13.field2049 - var20;
                        if (var13.field2052 >= 0) {
                            var18 = (var25 << 8) / (var13.field2049 - var13.field2052);
                        }
                    }
                    if (var12.field1280 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    if (var14 == null || var15 == null) {
                        var10 += 5;
                        if (field773 > -1) {
                            int var31 = field773 + arg2 - (var17 >> 1);
                            int var32 = field563 + arg3 - var10;
                            class545.method8784(var31, var32, var24, 5, 65280);
                            class545.method8784(var24 + var31, var32, var17 - var24, 5, 16711680);
                        }
                        var10 += 2;
                    } else {
                        int var26;
                        if (var17 == var24) {
                            var26 = var16 * 2 + var24;
                        } else {
                            var26 = var16 + var24;
                        }
                        int var27 = var14.field5331;
                        var10 += var27;
                        int var28 = field773 + arg2 - (var17 >> 1);
                        int var29 = field563 + arg3 - var10;
                        int var30 = var28 - var16;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method8906(var30, var29, var18);
                            class545.method8777(var30, var29, var26 + var30, var27 + var29);
                            var15.method8906(var30, var29, var18);
                        } else {
                            var14.method8900(var30, var29);
                            class545.method8777(var30, var29, var26 + var30, var27 + var29);
                            var15.method8900(var30, var29);
                        }
                        class545.method8801(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var11.method2458()) {
                    var11.method7855();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field523 == arg0.field1229 && method7770((class93) arg0)) {
            class93 var33 = (class93) arg0;
            if (var9) {
                method2623(arg0, arg0.field1222 + 15);
                class418 var34 = (class418) field624.get(class505.field5084);
                var10 += 4;
                var34.method7104(var33.field1142.method9077(), field773 + arg2, field563 + arg3 - var10, 16777215, 0);
                var10 += 18;
            }
        }
        if (var9) {
            class93 var35 = (class93) arg0;
            if (var35.field1122) {
                return;
            }
            if (var35.field1124 != -1 || var35.field1125 != -1) {
                method2623(arg0, arg0.field1222 + 15);
                if (field773 > -1) {
                    if (var35.field1124 != -1) {
                        var10 += 25;
                        Statics.field1119[var35.field1124].method8900(field773 + arg2 - 12, field563 + arg3 - var10);
                    }
                    if (var35.field1125 != -1) {
                        var10 += 25;
                        Statics.field3622[var35.field1125].method8900(field773 + arg2 - 12, field563 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field530 == 10 && field532 == var8[arg1]) {
                method2623(arg0, arg0.field1222 + 15);
                if (field773 > -1) {
                    int var36 = Statics.field1631[1].field5331 + var10;
                    Statics.field1631[1].method8900(field773 + arg2 - 12, field563 + arg3 - var36);
                }
            }
        } else {
            class102 var37 = (class102) arg0;
            int[] var38 = var37.method2495();
            short[] var39 = var37.method2476();
            if (var39 != null && var38 != null) {
                for (int var40 = 0; var40 < var39.length; var40++) {
                    if (var39[var40] >= 0 && var38[var40] >= 0) {
                        long var41 = (long) var38[var40] << 8 | (long) var39[var40];
                        class549 var43 = (class549) field598.method7340(var41);
                        if (var43 == null) {
                            class549[] var44 = class550.method2272(Statics.field202, var38[var40], 0);
                            if (var44 != null && var39[var40] < var44.length) {
                                var43 = var44[var39[var40]];
                                field598.method7333(var41, var43);
                            }
                        }
                        if (var43 != null) {
                            method2623(arg0, arg0.field1222 + 15);
                            if (field773 > -1) {
                                var43.method8900(field773 + arg2 - (var43.field5330 >> 1), field563 + (arg3 - var43.field5331) - 4);
                            }
                        }
                    }
                }
            }
            if (field530 == 1 && field531 == field724[arg1 - var7] && field523 % 20 < 10) {
                method2623(arg0, arg0.field1222 + 15);
                if (field773 > -1) {
                    Statics.field1631[0].method8900(field773 + arg2 - 12, field563 + arg3 - 28);
                }
            }
        }
        for (int var45 = 0; var45 < 4; var45++) {
            int var46 = arg0.field1231[var45];
            int var47 = arg0.field1251[var45];
            class220 var48 = null;
            int var49 = 0;
            if (var47 >= 0) {
                if (var46 <= field523) {
                    continue;
                }
                var48 = class220.method3401(arg0.field1251[var45]);
                var49 = var48.field2228;
                if (var48 != null && var48.field2239 != null) {
                    var48 = var48.method3732();
                    if (var48 == null) {
                        arg0.field1231[var45] = -1;
                        continue;
                    }
                }
            } else if (var46 < 0) {
                continue;
            }
            int var50 = arg0.field1232[var45];
            class220 var51 = null;
            if (var50 >= 0) {
                var51 = class220.method3401(var50);
                if (var51 != null && var51.field2239 != null) {
                    var51 = var51.method3732();
                }
            }
            if (var46 - var49 <= field523) {
                if (var48 == null) {
                    arg0.field1231[var45] = -1;
                } else {
                    method2623(arg0, arg0.field1222 / 2);
                    if (field773 > -1) {
                        boolean var52 = true;
                        if (var45 == 1) {
                            field563 -= 20;
                        }
                        if (var45 == 2) {
                            field773 -= 15;
                            field563 -= 10;
                        }
                        if (var45 == 3) {
                            field773 += 15;
                            field563 -= 10;
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
                        class549 var65 = null;
                        class549 var66 = null;
                        class549 var67 = null;
                        class549 var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        class549 var78 = var48.method3720();
                        if (var78 != null) {
                            var57 = var78.field5330;
                            int var79 = var78.field5331;
                            if (var79 > var77) {
                                var77 = var79;
                            }
                            var61 = var78.field5329;
                        }
                        class549 var80 = var48.method3721();
                        if (var80 != null) {
                            var58 = var80.field5330;
                            int var81 = var80.field5331;
                            if (var81 > var77) {
                                var77 = var81;
                            }
                            var62 = var80.field5329;
                        }
                        class549 var82 = var48.method3722();
                        if (var82 != null) {
                            var59 = var82.field5330;
                            int var83 = var82.field5331;
                            if (var83 > var77) {
                                var77 = var83;
                            }
                            var63 = var82.field5329;
                        }
                        class549 var84 = var48.method3734();
                        if (var84 != null) {
                            var60 = var84.field5330;
                            int var85 = var84.field5331;
                            if (var85 > var77) {
                                var77 = var85;
                            }
                            var64 = var84.field5329;
                        }
                        if (var51 != null) {
                            var65 = var51.method3720();
                            if (var65 != null) {
                                var69 = var65.field5330;
                                int var86 = var65.field5331;
                                if (var86 > var77) {
                                    var77 = var86;
                                }
                                var73 = var65.field5329;
                            }
                            var66 = var51.method3721();
                            if (var66 != null) {
                                var70 = var66.field5330;
                                int var87 = var66.field5331;
                                if (var87 > var77) {
                                    var77 = var87;
                                }
                                var74 = var66.field5329;
                            }
                            var67 = var51.method3722();
                            if (var67 != null) {
                                var71 = var67.field5330;
                                int var88 = var67.field5331;
                                if (var88 > var77) {
                                    var77 = var88;
                                }
                                var75 = var67.field5329;
                            }
                            var68 = var51.method3734();
                            if (var68 != null) {
                                var72 = var68.field5330;
                                int var89 = var68.field5331;
                                if (var89 > var77) {
                                    var77 = var89;
                                }
                                var76 = var68.field5329;
                            }
                        }
                        class414 var90 = var48.method3724();
                        if (var90 == null) {
                            var90 = Statics.field97;
                        }
                        class414 var91;
                        if (var51 == null) {
                            var91 = Statics.field97;
                        } else {
                            var91 = var51.method3724();
                            if (var91 == null) {
                                var91 = Statics.field97;
                            }
                        }
                        Object var92 = null;
                        String var93 = null;
                        boolean var94 = false;
                        int var95 = 0;
                        String var96 = var48.method3719(arg0.field1200[var45]);
                        int var97 = var90.method7062(var96);
                        if (var51 != null) {
                            var93 = var51.method3719(arg0.field1233[var45]);
                            var95 = var91.method7062(var93);
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
                        int var114 = arg0.field1231[var45] - field523;
                        int var115 = var48.field2233 - var48.field2233 * var114 / var48.field2228;
                        int var116 = var48.field2234 * var114 / var48.field2228 + -var48.field2234;
                        int var117 = field773 + arg2 - (var106 >> 1) + var115;
                        int var118 = field563 + arg3 - 12 + var116;
                        int var119 = var118;
                        int var120 = var77 + var118;
                        int var121 = var48.field2238 + var118 + 15;
                        int var122 = var121 - var90.field4618;
                        int var123 = var90.field4619 + var121;
                        if (var122 < var118) {
                            var119 = var122;
                        }
                        if (var123 > var120) {
                            var120 = var123;
                        }
                        int var124 = 0;
                        if (var51 != null) {
                            var124 = var51.field2238 + var118 + 15;
                            int var125 = var124 - var91.field4618;
                            int var126 = var91.field4619 + var124;
                            if (var125 < var119) {
                                ;
                            }
                            if (var126 > var120) {
                                ;
                            }
                        }
                        int var129 = 255;
                        if (var48.field2235 >= 0) {
                            var129 = (var114 << 8) / (var48.field2228 - var48.field2235);
                        }
                        if (var129 >= 0 && var129 < 255) {
                            if (var78 != null) {
                                var78.method8906(var101 + var117 - var61, var118, var129);
                            }
                            if (var82 != null) {
                                var82.method8906(var102 + var117 - var63, var118, var129);
                            }
                            if (var80 != null) {
                                for (int var130 = 0; var130 < var98; var130++) {
                                    var80.method8906(var58 * var130 + (var103 + var117 - var62), var118, var129);
                                }
                            }
                            if (var84 != null) {
                                var84.method8906(var107 + var117 - var64, var118, var129);
                            }
                            var90.method7018(var96, var104 + var117, var121, var48.field2236, 0, var129);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method8906(var108 + var117 - var73, var118, var129);
                                }
                                if (var67 != null) {
                                    var67.method8906(var109 + var117 - var75, var118, var129);
                                }
                                if (var66 != null) {
                                    for (int var131 = 0; var131 < var99; var131++) {
                                        var66.method8906(var70 * var131 + (var110 + var117 - var74), var118, var129);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method8906(var111 + var117 - var76, var118, var129);
                                }
                                var91.method7018(var93, var112 + var117, var124, var51.field2236, 0, var129);
                            }
                        } else {
                            if (var78 != null) {
                                var78.method8900(var101 + var117 - var61, var118);
                            }
                            if (var82 != null) {
                                var82.method8900(var102 + var117 - var63, var118);
                            }
                            if (var80 != null) {
                                for (int var132 = 0; var132 < var98; var132++) {
                                    var80.method8900(var58 * var132 + (var103 + var117 - var62), var118);
                                }
                            }
                            if (var84 != null) {
                                var84.method8900(var107 + var117 - var64, var118);
                            }
                            var90.method7017(var96, var104 + var117, var121, var48.field2236 | 0xFF000000, 0);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method8900(var108 + var117 - var73, var118);
                                }
                                if (var67 != null) {
                                    var67.method8900(var109 + var117 - var75, var118);
                                }
                                if (var66 != null) {
                                    for (int var133 = 0; var133 < var99; var133++) {
                                        var66.method8900(var70 * var133 + (var110 + var117 - var74), var118);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method8900(var111 + var117 - var76, var118);
                                }
                                var91.method7017(var93, var112 + var117, var124, var51.field2236 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.ju(IIIIB)V")
    public static final void method2466(int arg0, int arg1, int arg2, int arg3) {
        field614 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class109.field1398;
        int[] var8 = class109.field1387;
        for (int var9 = 0; var9 < field645 + var7; var9++) {
            class97 var10;
            if (var9 < var7) {
                var10 = field636[var8[var9]];
                if (field592 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field1608 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field569[field724[var9 - var7]];
            }
            method3336(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field599 && var6 != -1) {
            method3336(Statics.field1608, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method3336(field636[field592], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field614; var11++) {
            int var12 = field616[var11];
            int var13 = field617[var11];
            int var14 = field605[var11];
            int var15 = field776[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field617[var17] - field776[var17] && var13 - var15 < field617[var17] + 2 && var12 - var14 < field616[var17] + field605[var17] && var12 + var14 > field616[var17] - field605[var17] && field617[var17] - field776[var17] < var13) {
                        var13 = field617[var17] - field776[var17];
                        var16 = true;
                    }
                }
            }
            field773 = field616[var11];
            field563 = field617[var11] = var13;
            String var18 = field752[var11];
            if (field687 == 0) {
                int var19 = 16776960;
                if (field620[var11] < 6) {
                    var19 = field739[field620[var11]];
                }
                if (field620[var11] == 6) {
                    var19 = field626 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field620[var11] == 7) {
                    var19 = field626 % 20 < 10 ? 255 : 65535;
                }
                if (field620[var11] == 8) {
                    var19 = field626 % 20 < 10 ? 45056 : 8454016;
                }
                if (field620[var11] == 9) {
                    int var20 = 150 - field637[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field620[var11] == 10) {
                    int var21 = 150 - field637[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field620[var11] == 11) {
                    int var22 = 150 - field637[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field620[var11] == 12 && field780[var11] == null) {
                    int var23 = var18.length();
                    field780[var11] = new int[var23];
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = (int) ((float) var24 / (float) var23 * 64.0F);
                        int var26 = var25 << 10 | 0x380 | 0x40;
                        field780[var11][var24] = class487.field4929[var26];
                    }
                }
                if (field794[var11] == 0) {
                    Statics.field98.method7101(var18, field773 + arg0, field563 + arg1, var19, 0, field780[var11]);
                }
                if (field794[var11] == 1) {
                    Statics.field98.method7024(var18, field773 + arg0, field563 + arg1, var19, 0, field626, field780[var11]);
                }
                if (field794[var11] == 2) {
                    Statics.field98.method7025(var18, field773 + arg0, field563 + arg1, var19, 0, field626, field780[var11]);
                }
                if (field794[var11] == 3) {
                    Statics.field98.method7026(var18, field773 + arg0, field563 + arg1, var19, 0, field626, 150 - field637[var11], field780[var11]);
                }
                if (field794[var11] == 4) {
                    int var27 = (150 - field637[var11]) * (Statics.field98.method7062(var18) + 100) / 150;
                    class545.method8777(field773 + arg0 - 50, arg1, field773 + arg0 + 50, arg1 + arg3);
                    Statics.field98.method7027(var18, field773 + arg0 + 50 - var27, field563 + arg1, var19, 0, field780[var11]);
                    class545.method8801(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field794[var11] == 5) {
                    int var28 = 150 - field637[var11];
                    int var29 = 0;
                    if (var28 < 25) {
                        var29 = var28 - 25;
                    } else if (var28 > 125) {
                        var29 = var28 - 125;
                    }
                    class545.method8777(arg0, field563 + arg1 - Statics.field98.field4617 - 1, arg0 + arg2, field563 + arg1 + 5);
                    Statics.field98.method7101(var18, field773 + arg0, field563 + arg1 + var29, var19, 0, field780[var11]);
                    class545.method8801(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field98.method7104(var18, field773 + arg0, field563 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("bh.jd(IIIII)V")
    public static final void method660(int arg0, int arg1, int arg2, int arg3) {
        field751 = 0;
        int var4 = (Statics.field1608.field1220 >> 7) + Statics.field481;
        int var5 = (Statics.field1608.field1260 >> 7) + Statics.field99;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field751 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field751 = 1;
        }
        if (field751 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field751 = 0;
        }
    }

    @ObfuscatedName("ed.jm(Lde;IB)V")
    public static final void method2623(class97 arg0, int arg1) {
        method2864(arg0.field1220, arg0.field1260, arg1);
    }

    @ObfuscatedName("ek.ja(IIIB)V")
    public static final void method2864(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field773 = -1;
            field563 = -1;
            return;
        }
        int var3 = method292(arg0, arg1, Statics.field1861) - arg2;
        int var4 = arg0 - Statics.field2966;
        int var5 = var3 - Statics.field230;
        int var6 = arg1 - Statics.field1990;
        int var7 = class243.field2616[Statics.field1500];
        int var8 = class243.field2613[Statics.field1500];
        int var9 = class243.field2616[Statics.field80];
        int var10 = class243.field2613[Statics.field80];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field773 = field798 * var11 / var15 + field692 / 2;
            field563 = field798 * var14 / var15 + field797 / 2;
        } else {
            field773 = -1;
            field563 = -1;
        }
    }

    @ObfuscatedName("ac.jo(IIIB)I")
    public static final int method292(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class83.field1047[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class83.field1030[var5][var3][var4] + class83.field1030[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class83.field1030[var5][var3][var4 + 1] + class83.field1030[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("as.je(III)I")
    public static int method88(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field805 - field788) * var2 / 100 + field788;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("ei.jg(IIIIIIIB)V")
    public static final void method2855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method88(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class243.field2616[var8];
            int var14 = class243.field2613[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class243.field2616[var9];
            int var17 = class243.field2613[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        if (field516) {
            Statics.field3574 = arg0 - var10;
            Statics.field880 = arg1 - var11;
            Statics.field245 = arg2 - var12;
            Statics.field4775 = arg3;
            Statics.field3668 = arg4;
        } else {
            Statics.field2966 = arg0 - var10;
            Statics.field230 = arg1 - var11;
            Statics.field1990 = arg2 - var12;
            Statics.field1500 = arg3;
            Statics.field80 = arg4;
        }
        if (field589 == 1 && field691 >= 2 && field523 % 50 == 0 && (Statics.field1956 >> 7 != Statics.field1608.field1220 >> 7 || Statics.field2640 >> 7 != Statics.field1608.field1260 >> 7)) {
            int var19 = Statics.field1608.field1143;
            int var20 = (Statics.field1956 >> 7) + Statics.field481;
            int var21 = (Statics.field2640 >> 7) + Statics.field99;
            method3496(var20, var21, var19, true);
        }
    }

    @ObfuscatedName("fw.jv(ZLun;I)V")
    public static final void method2999(boolean arg0, class534 arg1) {
        field570 = arg0;
        if (!field570) {
            int var2 = arg1.method8515();
            int var3 = arg1.method8515();
            arg1.method8505();
            int var4 = arg1.method8670();
            Statics.field3570 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field3570[var5][var6] = arg1.method8682();
                }
            }
            Statics.field291 = new int[var4];
            Statics.field4508 = new int[var4];
            Statics.field2600 = new int[var4];
            Statics.field907 = new byte[var4][];
            Statics.field1529 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field291[var7] = var10;
                    Statics.field4508[var7] = Statics.field910.method6386("m" + var8 + "_" + var9);
                    Statics.field2600[var7] = Statics.field910.method6386("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method3386(var2, var3, true);
            return;
        }
        int var11 = arg1.method8670();
        int var12 = arg1.method8518();
        boolean var13 = arg1.method8659() == 1;
        int var14 = arg1.method8670();
        arg1.method8435();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8421(1);
                    if (var18 == 1) {
                        field586[var15][var16][var17] = arg1.method8421(26);
                    } else {
                        field586[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8407();
        Statics.field3570 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field3570[var19][var20] = arg1.method8682();
            }
        }
        Statics.field291 = new int[var14];
        Statics.field4508 = new int[var14];
        Statics.field2600 = new int[var14];
        Statics.field907 = new byte[var14][];
        Statics.field1529 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field586[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field291[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field291[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field4508[var21] = Statics.field910.method6386("m" + var30 + "_" + var31);
                            Statics.field2600[var21] = Statics.field910.method6386("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method3386(var11, var12, !var13);
    }

    @ObfuscatedName("hr.jn(IIZI)V")
    public static final void method3386(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field86 == arg0 && Statics.field37 == arg1) {
            return;
        }
        Statics.field86 = arg0;
        Statics.field37 = arg1;
        method4521(25);
        method5170(class370.field4018, true);
        int var3 = Statics.field481;
        int var4 = Statics.field99;
        Statics.field481 = (arg0 - 6) * 8;
        Statics.field99 = (arg1 - 6) * 8;
        int var5 = Statics.field481 - var3;
        int var6 = Statics.field99 - var4;
        int var7 = Statics.field481;
        int var8 = Statics.field99;
        for (int var9 = 0; var9 < 65536; var9++) {
            class102 var10 = field569[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1271[var11] -= var5;
                    var10.field1272[var11] -= var6;
                }
                var10.field1220 -= var5 * 128;
                var10.field1260 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class93 var13 = field636[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1271[var14] -= var5;
                    var13.field1272[var14] -= var6;
                }
                var13.field1220 -= var5 * 128;
                var13.field1260 -= var6 * 128;
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
                        field650[var25][var21][var22] = field650[var25][var23][var24];
                    } else {
                        field650[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class96 var26 = (class96) field651.method6591(); var26 != null; var26 = (class96) field651.method6605()) {
            var26.field1185 -= var5;
            var26.field1183 -= var6;
            if (var26.field1185 < 0 || var26.field1183 < 0 || var26.field1185 >= 104 || var26.field1183 >= 104) {
                var26.method7855();
            }
        }
        if (field762 != 0) {
            field762 -= var5;
            field763 -= var6;
        }
        field766 = 0;
        field516 = false;
        Statics.field2966 -= var5 << 7;
        Statics.field1990 -= var6 << 7;
        Statics.field1956 -= var5 << 7;
        Statics.field2640 -= var6 << 7;
        field757 = -1;
        field653.method6610();
        field524.method6610();
        for (int var27 = 0; var27 < 4; var27++) {
            field584[var27].method3998();
        }
    }

    @ObfuscatedName("eq.jx(ZB)V")
    public static final void method2781(boolean arg0) {
        method3130();
        field574.field1444++;
        if (field574.field1444 < 50 && !arg0) {
            return;
        }
        field574.field1444 = 0;
        if (field576 || field574.method2644() == null) {
            return;
        }
        class313 var1 = class313.method7156(class311.field3204, field574.field1438);
        field574.method2654(var1);
        try {
            field574.method2643();
        } catch (IOException var3) {
            field576 = true;
        }
    }

    @ObfuscatedName("rv.ji(I)V")
    public static final void method7351() {
        method2781(false);
        field579 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field907.length; var1++) {
            if (Statics.field4508[var1] != -1 && Statics.field907[var1] == null) {
                Statics.field907[var1] = Statics.field910.method6328(Statics.field4508[var1], 0);
                if (Statics.field907[var1] == null) {
                    var0 = false;
                    field579++;
                }
            }
            if (Statics.field2600[var1] != -1 && Statics.field1529[var1] == null) {
                Statics.field1529[var1] = Statics.field910.method6329(Statics.field2600[var1], 0, Statics.field3570[var1]);
                if (Statics.field1529[var1] == null) {
                    var0 = false;
                    field579++;
                }
            }
        }
        if (!var0) {
            field583 = 1;
            return;
        }
        field728 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field907.length; var3++) {
            byte[] var4 = Statics.field1529[var3];
            if (var4 != null) {
                int var5 = (Statics.field291[var3] >> 8) * 64 - Statics.field481;
                int var6 = (Statics.field291[var3] & 0xFF) * 64 - Statics.field99;
                if (field570) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class83.method422(var4, var5, var6);
            }
        }
        if (!var2) {
            field583 = 2;
            return;
        }
        if (field583 != 0) {
            method5170(class370.field4018 + class103.field1349 + class103.field1344 + 100 + "%" + class103.field1341, true);
        }
        method3130();
        Statics.field5117.method4364();
        for (int var7 = 0; var7 < 4; var7++) {
            field584[var7].method3998();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class83.field1047[var8][var9][var10] = 0;
                }
            }
        }
        method3130();
        class83.method1116();
        int var11 = Statics.field907.length;
        class71.method290();
        method2781(true);
        if (!field570) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field291[var12] >> 8) * 64 - Statics.field481;
                int var14 = (Statics.field291[var12] & 0xFF) * 64 - Statics.field99;
                byte[] var15 = Statics.field907[var12];
                if (var15 != null) {
                    method3130();
                    class83.method6554(var15, var13, var14, Statics.field86 * 8 - 48, Statics.field37 * 8 - 48, field584);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field291[var16] >> 8) * 64 - Statics.field481;
                int var18 = (Statics.field291[var16] & 0xFF) * 64 - Statics.field99;
                byte[] var19 = Statics.field907[var16];
                if (var19 == null && Statics.field37 < 800) {
                    method3130();
                    class83.method5652(var17, var18, 64, 64);
                }
            }
            method2781(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field1529[var20];
                if (var21 != null) {
                    int var22 = (Statics.field291[var20] >> 8) * 64 - Statics.field481;
                    int var23 = (Statics.field291[var20] & 0xFF) * 64 - Statics.field99;
                    method3130();
                    class83.method1064(var21, var22, var23, Statics.field5117, field584);
                }
            }
        }
        if (field570) {
            for (int var24 = 0; var24 < 4; var24++) {
                method3130();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field586[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field291.length; var34++) {
                                if (Statics.field291[var34] == var33 && Statics.field907[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class83.method3009(Statics.field907[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field584);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class83.method3394(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field586[0][var37][var38];
                    if (var39 == -1) {
                        class83.method5652(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method2781(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method3130();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field586[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field291.length; var49++) {
                                if (Statics.field291[var49] == var48 && Statics.field1529[var49] != null) {
                                    class83.method2162(Statics.field1529[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field5117, field584);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2781(true);
        method3130();
        Statics.method96(Statics.field5117, field584);
        method2781(true);
        int var50 = class83.field1046;
        if (var50 > Statics.field1861) {
            var50 = Statics.field1861;
        }
        if (var50 < Statics.field1861 - 1) {
            int var51 = Statics.field1861 - 1;
        }
        if (field658) {
            Statics.field5117.method4345(class83.field1046);
        } else {
            Statics.field5117.method4345(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method7800(Statics.field1861, var52, var53);
            }
        }
        method3130();
        method2793();
        class222.field2250.method5339();
        if (Statics.field1468.method489()) {
            class313 var54 = class313.method7156(class311.field3212, field574.field1438);
            var54.field3318.method8448(1057001181);
            field574.method2654(var54);
        }
        if (!field570) {
            int var55 = (Statics.field86 - 6) / 8;
            int var56 = (Statics.field86 + 6) / 8;
            int var57 = (Statics.field37 - 6) / 8;
            int var58 = (Statics.field37 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field910.method6349("m" + var59 + "_" + var60);
                        Statics.field910.method6349("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method4521(30);
        method3130();
        class83.method6043();
        class313 var61 = class313.method7156(class311.field3256, field574.field1438);
        field574.method2654(var61);
        class35.method99();
    }

    @ObfuscatedName("client.jw(Ley;II)Z")
    public boolean method1307(class113 arg0, int arg1) {
        if (arg0.field1441 == 0) {
            Statics.field1674 = null;
        } else {
            if (Statics.field1674 == null) {
                Statics.field1674 = new class449(Statics.field1527, Statics.field1468);
            }
            Statics.field1674.method7380(arg0.field1439, arg1);
        }
        field718 = field707;
        Statics.field1132 = true;
        arg0.field1440 = null;
        return true;
    }

    @ObfuscatedName("client.ko(Ley;I)Z")
    public boolean method1162(class113 arg0) {
        if (Statics.field1674 != null) {
            Statics.field1674.method7381(arg0.field1439);
        }
        field718 = field707;
        Statics.field1132 = true;
        arg0.field1440 = null;
        return true;
    }

    @ObfuscatedName("client.kb(Ley;I)Z")
    public final boolean method1161(class113 arg0) {
        class459 var2 = arg0.method2644();
        class534 var3 = arg0.field1439;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1440 == null) {
                if (arg0.field1435) {
                    if (!var2.method7546(1)) {
                        return false;
                    }
                    var2.method7549(arg0.field1439.field5231, 0, 1);
                    arg0.field1443 = 0;
                    arg0.field1435 = false;
                }
                var3.field5233 = 0;
                if (var3.method8410()) {
                    if (!var2.method7546(1)) {
                        return false;
                    }
                    var2.method7549(arg0.field1439.field5231, 1, 1);
                    arg0.field1443 = 0;
                }
                arg0.field1435 = true;
                class314[] var4 = class314.method4515();
                int var5 = var3.method8411();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5233);
                }
                arg0.field1440 = var4[var5];
                arg0.field1441 = arg0.field1440.field3448;
            }
            if (arg0.field1441 == -1) {
                if (!var2.method7546(1)) {
                    return false;
                }
                arg0.method2644().method7549(var3.field5231, 0, 1);
                arg0.field1441 = var3.field5231[0] & 0xFF;
            }
            if (arg0.field1441 == -2) {
                if (!var2.method7546(2)) {
                    return false;
                }
                arg0.method2644().method7549(var3.field5231, 0, 2);
                var3.field5233 = 0;
                arg0.field1441 = var3.method8670();
            }
            if (!var2.method7546(arg0.field1441)) {
                return false;
            }
            var3.field5233 = 0;
            var2.method7549(var3.field5231, 0, arg0.field1441);
            arg0.field1443 = 0;
            field577.method7237();
            arg0.field1448 = arg0.field1447;
            arg0.field1447 = arg0.field1445;
            arg0.field1445 = arg0.field1440;
            if (class314.field3347 == arg0.field1440) {
                int var6 = var3.method8518();
                int var7 = var3.method8514();
                class338.field3633[var6] = var7;
                if (class338.field3634[var6] != var7) {
                    class338.field3634[var6] = var7;
                }
                method103(var6);
                field708[++field709 - 1 & 0x1F] = var6;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3373 == arg0.field1440) {
                int var8 = var3.method8659();
                int var9 = var3.method8711();
                short var10 = (short) var3.method8506();
                int var11 = var3.method8670();
                class102 var12 = field569[var11];
                if (var12 != null) {
                    var12.method2482(var8, var9, var10);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3413 == arg0.field1440) {
                int var13 = var3.method8462();
                int var14 = var3.method8462();
                int var15 = var3.method8462();
                int var16 = var3.method8462();
                field781[var13] = true;
                field745[var13] = var14;
                field783[var13] = var15;
                field549[var13] = var16;
                field785[var13] = 0;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3392 == arg0.field1440) {
                int var17 = var3.method8518();
                byte var18 = var3.method8513();
                class338.field3633[var17] = var18;
                if (class338.field3634[var17] != var18) {
                    class338.field3634[var17] = var18;
                }
                method103(var17);
                field708[++field709 - 1 & 0x1F] = var17;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3429 == arg0.field1440) {
                int var19 = var3.method8670();
                int var20 = var3.method8682();
                class350 var21 = Statics.field2621.method5681(var20);
                if (var21.field3784 != 6 || var21.field3849 != var19) {
                    var21.field3784 = 6;
                    var21.field3849 = var19;
                    method4817(var21);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3366 == arg0.field1440 && field516) {
                field627 = true;
                field775 = false;
                field604 = false;
                for (int var22 = 0; var22 < 5; var22++) {
                    field781[var22] = false;
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3358 == arg0.field1440) {
                Statics.method4544(var3, arg0.field1441);
                method1134();
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3446 == arg0.field1440) {
                method2556();
                byte var23 = var3.method8463();
                if (arg0.field1441 == 1) {
                    if (var23 >= 0) {
                        field755[var23] = null;
                    } else {
                        Statics.field5109 = null;
                    }
                    arg0.field1440 = null;
                    return true;
                }
                if (var23 >= 0) {
                    field755[var23] = new class156(var3);
                } else {
                    Statics.field5109 = new class156(var3);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3377 == arg0.field1440) {
                int var24 = var3.method8515();
                int var25 = var3.method8495();
                int var26 = var25 >> 2;
                int var27 = var25 & 0x3;
                int var28 = field587[var26];
                int var29 = var3.method8655();
                int var30 = var29 >> 16;
                int var31 = var29 >> 8 & 0xFF;
                int var32 = (var29 >> 4 & 0x7) + var30;
                int var33 = (var29 & 0x7) + var31;
                if (var32 >= 0 && var33 >= 0 && var32 < 103 && var33 < 103) {
                    method3529(Statics.field1861, var32, var33, var26, var27, var28, var24);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3378 == arg0.field1440) {
                int var34 = var3.method8462();
                int var35 = var3.method8518();
                int var36 = var3.method8462();
                int var37 = var3.method8495() * 4;
                int var38 = var3.method8467();
                byte var39 = var3.method8513();
                int var40 = var3.method8462() * 4;
                int var41 = var3.method8466();
                int var42 = var41 >> 16;
                int var43 = var41 >> 8 & 0xFF;
                int var44 = (var41 >> 4 & 0x7) + var42;
                int var45 = (var41 & 0x7) + var43;
                byte var46 = var3.method8513();
                int var47 = var3.method8518();
                int var48 = var3.method8515();
                int var49 = var39 + var44;
                int var50 = var45 + var46;
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104 && var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104 && var35 != 65535) {
                    int var51 = var44 * 128 + 64;
                    int var52 = var45 * 128 + 64;
                    int var53 = var49 * 128 + 64;
                    int var54 = var50 * 128 + 64;
                    class78 var55 = new class78(var35, Statics.field1861, var51, var52, method292(var51, var52, Statics.field1861) - var37, field523 + var48, field523 + var47, var36, var34, var38, var40);
                    var55.method2080(var53, var54, method292(var53, var54, Statics.field1861) - var40, field523 + var48);
                    field524.method6581(var55);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3365 == arg0.field1440) {
                int var56 = var3.method8518();
                if (var56 == 65535) {
                    var56 = -1;
                }
                int var57 = var3.method8577();
                int var58 = var3.method8670();
                if (var58 == 65535) {
                    var58 = -1;
                }
                int var59 = var3.method8670();
                int var60 = var3.method8515();
                int var61 = var3.method8577();
                ArrayList var62 = new ArrayList();
                var62.add(var56);
                var62.add(var58);
                method1800(var62, var61, var60, var59, var57);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3431 == arg0.field1440) {
                field530 = var3.method8462();
                if (field530 == 1) {
                    field531 = var3.method8670();
                }
                if (field530 >= 2 && field530 <= 6) {
                    if (field530 == 2) {
                        field536 = 64;
                        field713 = 64;
                    }
                    if (field530 == 3) {
                        field536 = 0;
                        field713 = 64;
                    }
                    if (field530 == 4) {
                        field536 = 128;
                        field713 = 64;
                    }
                    if (field530 == 5) {
                        field536 = 64;
                        field713 = 0;
                    }
                    if (field530 == 6) {
                        field536 = 64;
                        field713 = 128;
                    }
                    field530 = 2;
                    field533 = var3.method8670();
                    field621 = var3.method8670();
                    field535 = var3.method8462();
                }
                if (field530 == 10) {
                    field532 = var3.method8670();
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3370 == arg0.field1440) {
                method6558(false, var3);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3428 == arg0.field1440) {
                int var63 = var3.method8670();
                int var64 = var3.method8518();
                int var65 = var3.method8495();
                if (var64 == 65535) {
                    var64 = -1;
                }
                class102 var66 = field569[var63];
                if (var66 != null) {
                    if (var66.field1201 == var64 && var64 != -1) {
                        int var67 = class225.method288(var64).field2397;
                        if (var67 == 1) {
                            var66.field1246 = 0;
                            var66.field1247 = 0;
                            var66.field1248 = var65;
                            var66.field1249 = 0;
                        } else if (var67 == 2) {
                            var66.field1249 = 0;
                        }
                    } else if (var64 == -1 || var66.field1201 == -1 || class225.method288(var64).field2394 >= class225.method288(var66.field1201).field2394) {
                        var66.field1201 = var64;
                        var66.field1246 = 0;
                        var66.field1247 = 0;
                        var66.field1248 = var65;
                        var66.field1249 = 0;
                        var66.field1275 = var66.field1274;
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3350 == arg0.field1440) {
                field720 = field707;
                byte var68 = var3.method8463();
                if (arg0.field1441 == 1) {
                    if (var68 >= 0) {
                        field756[var68] = null;
                    } else {
                        Statics.field87 = null;
                    }
                    arg0.field1440 = null;
                    return true;
                }
                if (var68 >= 0) {
                    field756[var68] = new class165(var3);
                } else {
                    Statics.field87 = new class165(var3);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3345 == arg0.field1440) {
                int var69 = var3.method8462();
                method4563(var69);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3400 == arg0.field1440) {
                int var70 = var3.method8711();
                class350 var71 = Statics.field2621.method5681(var70);
                var71.field3784 = 3;
                var71.field3849 = Statics.field1608.field1123.method5745();
                method4817(var71);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3376 == arg0.field1440) {
                int var72 = var3.method8495();
                int var73 = var3.method8670();
                int var74 = var3.method8515();
                class102 var75 = field569[var74];
                int var76 = var3.method8682();
                if (var75 != null) {
                    var75.method2303(var72, var73, var76 >> 16, var76 & 0xFFFF);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3368 == arg0.field1440) {
                field762 = var3.method8462();
                if (field762 == 255) {
                    field762 = 0;
                }
                field763 = var3.method8462();
                if (field763 == 255) {
                    field763 = 0;
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3394 == arg0.field1440) {
                method4074(class312.field3307);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3402 == arg0.field1440) {
                Statics.field2906 = var3.method8497();
                Statics.field3603 = var3.method8462();
                field588 = var3.method8497();
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3409 == arg0.field1440) {
                boolean var77 = var3.method8640();
                if (!var77) {
                    Statics.field1622 = null;
                } else if (Statics.field1622 == null) {
                    Statics.field1622 = new class390();
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3434 == arg0.field1440) {
                int var78 = var3.method8518();
                int var79 = var3.method8532();
                class350 var80 = Statics.field2621.method5681(var79);
                if (var80 != null && var80.field3829 == 0) {
                    if (var78 > var80.field3768 - var80.field3760) {
                        var78 = var80.field3768 - var80.field3760;
                    }
                    if (var78 < 0) {
                        var78 = 0;
                    }
                    if (var80.field3766 != var78) {
                        var80.field3766 = var78;
                        method4817(var80);
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3432 == arg0.field1440) {
                for (int var81 = 0; var81 < field636.length; var81++) {
                    if (field636[var81] != null) {
                        field636[var81].field1201 = -1;
                    }
                }
                for (int var82 = 0; var82 < field569.length; var82++) {
                    if (field569[var82] != null) {
                        field569[var82].field1201 = -1;
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3338 == arg0.field1440) {
                String var83 = var3.method8473();
                String var84 = class418.method7015(class407.method4735(class353.method5708(var3)));
                class112.method2177(6, var83, var84);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3375 == arg0.field1440) {
                field529 = var3.method8577() * 30;
                field723 = field707;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3406 == arg0.field1440) {
                int var85 = var3.method8514();
                class350 var86 = Statics.field2621.method5681(var85);
                for (int var87 = 0; var87 < var86.field3875.length; var87++) {
                    var86.field3875[var87] = -1;
                    var86.field3875[var87] = 0;
                }
                method4817(var86);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3379 == arg0.field1440) {
                int var88 = var3.method8682();
                class88 var89 = (class88) field684.method8206((long) var88);
                if (var89 != null) {
                    method3625(var89, true);
                }
                if (field688 != null) {
                    method4817(field688);
                    field688 = null;
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3385 == arg0.field1440) {
                field516 = true;
                field627 = false;
                field775 = false;
                Statics.field2634 = var3.method8462();
                Statics.field1120 = var3.method8462();
                Statics.field39 = var3.method8670();
                Statics.field4746 = var3.method8462();
                Statics.field2446 = var3.method8462();
                if (Statics.field2446 >= 100) {
                    int var90 = Statics.field2634 * 128 + 64;
                    int var91 = Statics.field1120 * 128 + 64;
                    int var92 = method292(var90, var91, Statics.field1861) - Statics.field39;
                    int var93 = var90 - Statics.field2966;
                    int var94 = var92 - Statics.field230;
                    int var95 = var91 - Statics.field1990;
                    int var96 = (int) Math.sqrt((double) (var93 * var93 + var95 * var95));
                    Statics.field1500 = (int) (Math.atan2((double) var94, (double) var96) * 325.9490051269531D) & 0x7FF;
                    Statics.field80 = (int) (Math.atan2((double) var93, (double) var95) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1500 < 128) {
                        Statics.field1500 = 128;
                    }
                    if (Statics.field1500 > 383) {
                        Statics.field1500 = 383;
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3340 == arg0.field1440) {
                field764 = var3.method8462();
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3389 == arg0.field1440) {
                int var97 = var3.method8465();
                int var98 = var3.method8682();
                int var99 = var3.method8504();
                class350 var100 = Statics.field2621.method5681(var98);
                if (var100.field3753 != var99 || var100.field3732 != var97 || var100.field3749 != 0 || var100.field3750 != 0) {
                    var100.field3753 = var99;
                    var100.field3732 = var97;
                    var100.field3749 = 0;
                    var100.field3750 = 0;
                    method4817(var100);
                    this.method1369(var100);
                    if (var100.field3829 == 0) {
                        method9048(Statics.field2621.field3646[var98 >> 16], var100, false);
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3382 == arg0.field1440) {
                int var101 = var3.method8462();
                method2571(var101);
                arg0.field1440 = null;
                return false;
            }
            if (class314.field3332 == arg0.field1440) {
                Statics.field2906 = var3.method8462();
                Statics.field3603 = var3.method8659();
                field588 = var3.method8497();
                while (var3.field5233 < arg0.field1441) {
                    int var102 = var3.method8462();
                    class312 var103 = class312.method6515()[var102];
                    method4074(var103);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3323 == arg0.field1440) {
                method6558(true, var3);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3439 == arg0.field1440) {
                int var104 = var3.method8532();
                int var105 = var3.method8497();
                int var106 = var3.method8515();
                class93 var107;
                if (field578 == var106) {
                    var107 = Statics.field1608;
                } else {
                    var107 = field636[var106];
                }
                int var108 = var3.method8577();
                if (var107 != null) {
                    var107.method2303(var105, var108, var104 >> 16, var104 & 0xFFFF);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3438 == arg0.field1440) {
                int var109 = var3.method8670();
                int var110 = var3.method8462();
                int var111 = var3.method8670();
                method3011(var109, var110, var111);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3337 == arg0.field1440) {
                method4074(class312.field3305);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3336 == arg0.field1440) {
                var3.field5233 += 28;
                if (var3.method8580()) {
                    method2981(var3, var3.field5233 - 28);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3324 == arg0.field1440) {
                field516 = true;
                field627 = false;
                field604 = true;
                Statics.field3464 = var3.method8462();
                Statics.field1715 = var3.method8462();
                int var112 = var3.method8670();
                int var113 = var3.method8670();
                field515 = var3.method8640();
                int var114 = var3.method8462();
                int var115 = Statics.field3464 * 128 + 64;
                int var116 = Statics.field1715 * 128 + 64;
                boolean var117 = false;
                boolean var118 = false;
                int var119;
                int var120;
                if (field515) {
                    var119 = Statics.field230;
                    var120 = method292(var115, var116, Statics.field1861) - var112;
                } else {
                    var119 = method292(Statics.field2966, Statics.field1990, Statics.field1861) - Statics.field230;
                    var120 = var112;
                }
                field777 = new class498(Statics.field2966, Statics.field1990, var119, var115, var116, var120, var113, var114);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3427 == arg0.field1440) {
                field744 = var3.method8462();
                field629 = var3.method8495();
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3387 == arg0.field1440) {
                int var121 = var3.method8711();
                int var122 = var3.method8518();
                class350 var123 = Statics.field2621.method5681(var121);
                if (var123.field3784 != 1 || var123.field3849 != var122) {
                    var123.field3784 = 1;
                    var123.field3849 = var122;
                    method4817(var123);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3357 == arg0.field1440) {
                field516 = true;
                field627 = false;
                field775 = true;
                Statics.field2634 = var3.method8462();
                Statics.field1120 = var3.method8462();
                Statics.field39 = var3.method8670();
                int var124 = var3.method8670();
                int var125 = var3.method8462();
                int var126 = Statics.field2634 * 128 + 64;
                int var127 = Statics.field1120 * 128 + 64;
                int var128 = method292(var126, var127, Statics.field1861) - Statics.field39;
                int var129 = var126 - Statics.field2966;
                int var130 = var128 - Statics.field230;
                int var131 = var127 - Statics.field1990;
                double var132 = Math.sqrt((double) (var129 * var129 + var131 * var131));
                int var134 = method5614((int) (Math.atan2((double) var130, var132) * 325.9490051269531D) & 0x7FF);
                int var135 = method3250((int) (Math.atan2((double) var129, (double) var131) * -325.9490051269531D) & 0x7FF);
                field779 = new class499(Statics.field1500, var134, var124, var125);
                field778 = new class499(Statics.field80, var135, var124, var125);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3416 == arg0.field1440) {
                byte var136 = var3.method8463();
                String var137 = var3.method8473();
                long var138 = (long) var3.method8670();
                long var140 = (long) var3.method8466();
                class373 var142 = (class373) class393.method3484(class373.method6211(), var3.method8462());
                long var143 = (var138 << 32) + var140;
                boolean var145 = false;
                Object var146 = null;
                class165 var147 = var136 >= 0 ? field756[var136] : Statics.field87;
                if (var147 == null) {
                    var145 = true;
                } else {
                    int var148 = 0;
                    while (true) {
                        if (var148 >= 100) {
                            if (var142.field4354 && Statics.field3621.method1781(new class558(var137, Statics.field1527))) {
                                var145 = true;
                            }
                            break;
                        }
                        if (field747[var148] == var143) {
                            var145 = true;
                            break;
                        }
                        var148++;
                    }
                }
                if (!var145) {
                    field747[field748] = var143;
                    field748 = (field748 + 1) % 100;
                    String var149 = class418.method7015(class353.method5708(var3));
                    int var150 = var136 >= 0 ? 41 : 44;
                    if (var142.field4341 == -1) {
                        class112.method3399(var150, var137, var149, var147.field1803);
                    } else {
                        class112.method3399(var150, class103.method6233(var142.field4341) + var137, var149, var147.field1803);
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3405 == arg0.field1440) {
                Statics.field4633 = class554.method9040(var3.method8462());
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3344 == arg0.field1440) {
                for (int var151 = 0; var151 < class338.field3634.length; var151++) {
                    if (class338.field3634[var151] != class338.field3633[var151]) {
                        class338.field3634[var151] = class338.field3633[var151];
                        method103(var151);
                        field708[++field709 - 1 & 0x1F] = var151;
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3443 == arg0.field1440) {
                Statics.field3621.field840.method7361(var3, arg0.field1441);
                method5352();
                field717 = field707;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3424 == arg0.field1440) {
                Statics.field3621.method1786(var3, arg0.field1441);
                field717 = field707;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3399 == arg0.field1440) {
                byte[] var152 = new byte[arg0.field1441];
                var3.method8439(var152, 0, var152.length);
                class535 var153 = new class535(var152);
                String var154 = var153.method8473();
                class32.method2865(var154, true, false);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3436 == arg0.field1440) {
                int var155 = var3.method8682();
                int var156 = var3.method8670();
                if (var155 < -70000) {
                    var156 += 32768;
                }
                class350 var157;
                if (var155 >= 0) {
                    var157 = Statics.field2621.method5681(var155);
                } else {
                    var157 = null;
                }
                if (var157 != null) {
                    for (int var158 = 0; var158 < var157.field3875.length; var158++) {
                        var157.field3875[var158] = 0;
                        var157.field3876[var158] = 0;
                    }
                }
                class86.method5152(var156);
                int var159 = var3.method8670();
                for (int var160 = 0; var160 < var159; var160++) {
                    int var161 = var3.method8495();
                    if (var161 == 255) {
                        var161 = var3.method8711();
                    }
                    int var162 = var3.method8515();
                    if (var157 != null && var160 < var157.field3875.length) {
                        var157.field3875[var160] = var162;
                        var157.field3876[var160] = var161;
                    }
                    class86.method2172(var156, var160, var162 - 1, var161);
                }
                if (var157 != null) {
                    method4817(var157);
                }
                method3137();
                field573[++field711 - 1 & 0x1F] = var156 & 0x7FFF;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3327 == arg0.field1440) {
                boolean var163 = var3.method8462() == 1;
                if (var163) {
                    Statics.field1840 = class318.method3596() - var3.method8469();
                    Statics.field2485 = new class381(var3, true);
                } else {
                    Statics.field2485 = null;
                }
                field722 = field707;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3325 == arg0.field1440) {
                method2556();
                byte var164 = var3.method8463();
                class148 var165 = new class148(var3);
                class156 var166;
                if (var164 >= 0) {
                    var166 = field755[var164];
                } else {
                    var166 = Statics.field5109;
                }
                if (var166 == null) {
                    this.method1170(var164);
                    arg0.field1440 = null;
                    return true;
                }
                if (var165.field1697 > var166.field1745) {
                    this.method1170(var164);
                    arg0.field1440 = null;
                    return true;
                }
                if (var165.field1697 < var166.field1745) {
                    arg0.field1440 = null;
                    return true;
                }
                var165.method2997(var166);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3349 == arg0.field1440) {
                int var167 = var3.method8497();
                int var168 = var3.method8670();
                int var169 = var3.method8514();
                class88 var170 = (class88) field684.method8206((long) var169);
                if (var170 != null) {
                    method3625(var170, var170.field1075 != var168);
                }
                method2702(var169, var168, var167);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3329 == arg0.field1440) {
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3342 == arg0.field1440) {
                method3137();
                int var171 = var3.method8462();
                int var172 = var3.method8514();
                int var173 = var3.method8659();
                field814[var171] = var172;
                field654[var171] = var173;
                field666[var171] = 1;
                field657[var171] = var173;
                for (int var174 = 0; var174 < 98; var174++) {
                    if (var172 >= class360.field3950[var174]) {
                        field666[var171] = var174 + 2;
                    }
                }
                field712[++field659 - 1 & 0x1F] = var171;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3391 == arg0.field1440) {
                method2999(false, arg0.field1439);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3354 == arg0.field1440) {
                int var175 = var3.method8495();
                byte var176 = var3.method8463();
                int var177 = var3.method8462() * 4;
                int var178 = var3.method8670();
                int var179 = var3.method8497() * 4;
                int var180 = var3.method8508();
                int var181 = var180 >> 16;
                int var182 = var180 >> 8 & 0xFF;
                int var183 = (var180 >> 4 & 0x7) + var181;
                int var184 = (var180 & 0x7) + var182;
                byte var185 = var3.method8513();
                int var186 = var3.method8515();
                int var187 = var3.method8670();
                int var188 = var3.method8509();
                int var189 = var3.method8515();
                int var190 = var183 + var185;
                int var191 = var176 + var184;
                if (var183 >= 0 && var184 >= 0 && var183 < 104 && var184 < 104 && var190 >= 0 && var191 >= 0 && var190 < 104 && var191 < 104 && var189 != 65535) {
                    int var192 = var183 * 128 + 64;
                    int var193 = var184 * 128 + 64;
                    int var194 = var190 * 128 + 64;
                    int var195 = var191 * 128 + 64;
                    class78 var196 = new class78(var189, Statics.field1861, var192, var193, method292(var192, var193, Statics.field1861) - var179, field523 + var178, field523 + var187, var175, var186, var188, var177);
                    var196.method2080(var194, var195, method292(var194, var195, Statics.field1861) - var177, field523 + var178);
                    field524.method6581(var196);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3435 == arg0.field1440) {
                method4074(class312.field3311);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3403 == arg0.field1440) {
                method4074(class312.field3303);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3419 == arg0.field1440) {
                int var197 = var3.method8577();
                int var198 = var3.method8515();
                int var199 = var3.method8518();
                int var200 = var3.method8577();
                int var201 = var3.method8577();
                if (var199 == 65535) {
                    var199 = -1;
                }
                ArrayList var202 = new ArrayList();
                var202.add(var199);
                method1800(var202, var197, var198, var200, var201);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3407 == arg0.field1440) {
                class69 var203 = new class69();
                var203.field828 = var3.method8473();
                var203.field818 = var3.method8670();
                int var204 = var3.method8682();
                var203.field826 = var204;
                if (var203.method1735()) {
                    var203.field832 = "beta";
                    Statics.field461 = true;
                } else {
                    Statics.field461 = false;
                }
                method4521(45);
                var2.method7551();
                Object var205 = null;
                class77.method424(var203);
                arg0.field1440 = null;
                return false;
            }
            if (class314.field3335 == arg0.field1440) {
                String var206 = var3.method8473();
                Object[] var207 = new Object[var206.length() + 1];
                for (int var208 = var206.length() - 1; var208 >= 0; var208--) {
                    if (var206.charAt(var208) == 's') {
                        var207[var208 + 1] = var3.method8473();
                    } else {
                        var207[var208 + 1] = Integer.valueOf(var3.method8682());
                    }
                }
                var207[0] = Integer.valueOf(var3.method8682());
                class89 var209 = new class89();
                var209.field1089 = var207;
                class72.method5202(var209);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3363 == arg0.field1440) {
                Statics.field1190 = new class475(Statics.field1044);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3380 == arg0.field1440) {
                int var210 = var3.method8518();
                if (var210 == 65535) {
                    var210 = -1;
                }
                int var211 = var3.method8682();
                int var212 = var3.method8532();
                class350 var213 = Statics.field2621.method5681(var211);
                if (var213.field3775) {
                    var213.field3877 = var210;
                    var213.field3776 = var212;
                    class223 var215 = class223.method87(var210).method3812(var212);
                    var213.field3763 = var215.field2318;
                    var213.field3797 = var215.field2319;
                    var213.field3798 = var215.field2320;
                    var213.field3794 = var215.field2322;
                    var213.field3765 = var215.field2302;
                    var213.field3844 = var215.field2311;
                    if (var215.field2323 == 1) {
                        var213.field3805 = 1;
                    } else {
                        var213.field3805 = 2;
                    }
                    if (var213.field3800 > 0) {
                        var213.field3844 = var213.field3844 * 32 / var213.field3800;
                    } else if (var213.field3755 > 0) {
                        var213.field3844 = var213.field3844 * 32 / var213.field3755;
                    }
                    method4817(var213);
                } else if (var210 == -1) {
                    var213.field3784 = 0;
                    arg0.field1440 = null;
                    return true;
                } else {
                    class223 var214 = class223.method87(var210).method3812(var212);
                    var213.field3784 = 4;
                    var213.field3849 = var210;
                    var213.field3763 = var214.field2318;
                    var213.field3797 = var214.field2319;
                    var213.field3844 = var214.field2311 * 100 / var212;
                    method4817(var213);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3415 == arg0.field1440) {
                for (int var216 = 0; var216 < Statics.field1946; var216++) {
                    class195 var217 = class195.method2746(var216);
                    if (var217 != null) {
                        class338.field3633[var216] = 0;
                        class338.field3634[var216] = 0;
                    }
                }
                method3137();
                field709 += 32;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3412 == arg0.field1440) {
                Statics.field1190 = null;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3404 == arg0.field1440) {
                field516 = true;
                field627 = false;
                field775 = true;
                int var218 = method3250(var3.method8465() & 0x7EB);
                int var219 = method5614(var3.method8465() & 0x7EB);
                int var220 = var3.method8670();
                int var221 = var3.method8462();
                field779 = new class499(Statics.field1500, var219, var220, var221);
                field778 = new class499(Statics.field80, var218, var220, var221);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3440 == arg0.field1440) {
                int var222 = var3.method8577();
                if (var222 == 65535) {
                    var222 = -1;
                }
                method14(var222);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3444 == arg0.field1440) {
                int var223 = var3.method8466();
                int var224 = var3.method8577();
                if (var224 == 65535) {
                    var224 = -1;
                }
                method2937(var224, var223);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3353 == arg0.field1440) {
                int var225 = var3.method8515();
                int var226 = var3.method8508();
                int var227 = var226 >> 16;
                int var228 = var226 >> 8 & 0xFF;
                int var229 = (var226 >> 4 & 0x7) + var227;
                int var230 = (var226 & 0x7) + var228;
                int var231 = var3.method8497();
                int var232 = var3.method8515();
                if (var229 >= 0 && var230 >= 0 && var229 < 104 && var230 < 104) {
                    int var233 = var229 * 128 + 64;
                    int var234 = var230 * 128 + 64;
                    class73 var235 = new class73(var225, Statics.field1861, var233, var234, method292(var233, var234, Statics.field1861) - var231, var232, field523);
                    field653.method6581(var235);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3343 == arg0.field1440) {
                byte var236 = var3.method8463();
                long var237 = (long) var3.method8670();
                long var239 = (long) var3.method8466();
                long var241 = (var237 << 32) + var239;
                boolean var243 = false;
                class165 var244 = var236 >= 0 ? field756[var236] : Statics.field87;
                if (var244 == null) {
                    var243 = true;
                } else {
                    for (int var245 = 0; var245 < 100; var245++) {
                        if (field747[var245] == var241) {
                            var243 = true;
                            break;
                        }
                    }
                }
                if (!var243) {
                    field747[field748] = var241;
                    field748 = (field748 + 1) % 100;
                    String var246 = class353.method5708(var3);
                    int var247 = var236 >= 0 ? 43 : 46;
                    class112.method3399(var247, "", var246, var244.field1803);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3346 == arg0.field1440) {
                field627 = false;
                field516 = false;
                field604 = false;
                field775 = false;
                Statics.field2634 = 0;
                Statics.field1120 = 0;
                Statics.field39 = 0;
                field515 = false;
                Statics.field4746 = 0;
                Statics.field2446 = 0;
                Statics.field92 = 0;
                Statics.field2717 = 0;
                Statics.field3464 = 0;
                Statics.field1715 = 0;
                Statics.field1277 = 0;
                field777 = null;
                field779 = null;
                field778 = null;
                for (int var248 = 0; var248 < 5; var248++) {
                    field781[var248] = false;
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3367 == arg0.field1440) {
                int var249 = arg0.field1441 + var3.field5233;
                int var250 = var3.method8670();
                if (var250 == 65535) {
                    var250 = -1;
                }
                int var251 = var3.method8670();
                if (field683 != var250) {
                    field683 = var250;
                    this.method1165(false);
                    method1121(field683);
                    class72.method334(field683);
                    for (int var252 = 0; var252 < 100; var252++) {
                        field733[var252] = true;
                    }
                }
                while (var251-- > 0) {
                    int var253 = var3.method8682();
                    int var254 = var3.method8670();
                    int var255 = var3.method8462();
                    class88 var256 = (class88) field684.method8206((long) var253);
                    if (var256 != null && var256.field1075 != var254) {
                        method3625(var256, true);
                        var256 = null;
                    }
                    if (var256 == null) {
                        var256 = method2702(var253, var254, var255);
                    }
                    var256.field1077 = true;
                }
                for (class88 var257 = (class88) field684.method8207(); var257 != null; var257 = (class88) field684.method8203()) {
                    if (var257.field1077) {
                        var257.field1077 = false;
                    } else {
                        method3625(var257, true);
                    }
                }
                field730 = new class509(512);
                while (var3.field5233 < var249) {
                    int var258 = var3.method8682();
                    int var259 = var3.method8670();
                    int var260 = var3.method8670();
                    int var261 = var3.method8682();
                    for (int var262 = var259; var262 <= var260; var262++) {
                        long var263 = ((long) var258 << 32) + (long) var262;
                        field730.method8204(new class492(var261), var263);
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3364 == arg0.field1440) {
                method3137();
                field690 = var3.method8465();
                field723 = field707;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3371 == arg0.field1440) {
                field516 = true;
                field627 = false;
                field604 = false;
                Statics.field3464 = var3.method8462();
                Statics.field1715 = var3.method8462();
                Statics.field1277 = var3.method8670();
                Statics.field2717 = var3.method8462();
                Statics.field92 = var3.method8462();
                if (Statics.field92 >= 100) {
                    Statics.field2966 = Statics.field3464 * 128 + 64;
                    Statics.field1990 = Statics.field1715 * 128 + 64;
                    Statics.field230 = method292(Statics.field2966, Statics.field1990, Statics.field1861) - Statics.field1277;
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3352 == arg0.field1440) {
                int var265 = var3.method8514();
                String var266 = var3.method8473();
                class350 var267 = Statics.field2621.method5681(var265);
                if (!var266.equals(var267.field3807)) {
                    var267.field3807 = var266;
                    method4817(var267);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3326 == arg0.field1440) {
                int var268 = var3.method8670();
                int var269 = var3.method8518();
                int var270 = var3.method8515();
                int var271 = var3.method8515();
                Statics.method3420(var269, var271, var270, var268);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3437 == arg0.field1440) {
                int var272 = var3.method8515();
                class86.method8152(var272);
                field573[++field711 - 1 & 0x1F] = var272 & 0x7FFF;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3374 == arg0.field1440) {
                int var273 = var3.method8497();
                int var274 = var3.method8711();
                class350 var275 = Statics.field2621.method5681(var274);
                class350.method5362(var275, Statics.field1608.field1123.field3687, var273);
                method4817(var275);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3425 == arg0.field1440) {
                String var276 = var3.method8473();
                int var277 = var3.method8462();
                int var278 = var3.method8495();
                if (var278 >= 1 && var278 <= 8) {
                    if (var276.equalsIgnoreCase(class370.field4272)) {
                        var276 = null;
                    }
                    field665[var278 - 1] = var276;
                    field647[var278 - 1] = var277 == 0;
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3351 == arg0.field1440) {
                field516 = true;
                field627 = false;
                field604 = true;
                Statics.field3464 = var3.method8462();
                Statics.field1715 = var3.method8462();
                int var279 = var3.method8670();
                int var280 = var3.method8462() * 128 + 64;
                int var281 = var3.method8462() * 128 + 64;
                int var282 = var3.method8670();
                field515 = var3.method8640();
                int var283 = var3.method8462();
                int var284 = Statics.field3464 * 128 + 64;
                int var285 = Statics.field1715 * 128 + 64;
                boolean var286 = false;
                boolean var287 = false;
                int var288;
                int var289;
                if (field515) {
                    var288 = Statics.field230;
                    var289 = method292(var284, var285, Statics.field1861) - var279;
                } else {
                    var288 = method292(Statics.field2966, Statics.field1990, Statics.field1861) - Statics.field230;
                    var289 = var279;
                }
                field777 = new class497(Statics.field2966, Statics.field1990, var288, var284, var285, var289, var280, var281, var282, var283);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3441 == arg0.field1440) {
                method3137();
                int var290 = var3.method8495();
                int var291 = var3.method8495();
                int var292 = var3.method8497();
                int var293 = var3.method8514();
                field814[var290] = var293;
                field654[var290] = var291;
                field666[var290] = 1;
                field657[var290] = var292;
                for (int var294 = 0; var294 < 98; var294++) {
                    if (var293 >= class360.field3950[var294]) {
                        field666[var290] = var294 + 2;
                    }
                }
                field712[++field659 - 1 & 0x1F] = var290;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3330 == arg0.field1440) {
                return this.method1162(arg0);
            }
            if (class314.field3396 == arg0.field1440) {
                int var295 = var3.method8711();
                int var296 = var3.method8711();
                class88 var297 = (class88) field684.method8206((long) var295);
                class88 var298 = (class88) field684.method8206((long) var296);
                if (var298 != null) {
                    method3625(var298, var297 == null || var297.field1075 != var298.field1075);
                }
                if (var297 != null) {
                    var297.method7855();
                    field684.method8204(var297, (long) var296);
                }
                class350 var299 = Statics.field2621.method5681(var295);
                if (var299 != null) {
                    method4817(var299);
                }
                class350 var300 = Statics.field2621.method5681(var296);
                if (var300 != null) {
                    method4817(var300);
                    method9048(Statics.field2621.field3646[var300.field3769 >>> 16], var300, true);
                }
                if (field683 != -1) {
                    method2069(field683, 1);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3331 == arg0.field1440) {
                int var301 = var3.method8670();
                if (var301 == 65535) {
                    var301 = -1;
                }
                int var302 = var3.method8515();
                if (var302 == 65535) {
                    var302 = -1;
                }
                int var303 = var3.method8532();
                int var304 = var3.method8711();
                for (int var305 = var302; var305 <= var301; var305++) {
                    long var306 = ((long) var303 << 32) + (long) var305;
                    class493 var308 = field730.method8206(var306);
                    if (var308 != null) {
                        var308.method7855();
                    }
                    field730.method8204(new class492(var304), var306);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3388 == arg0.field1440) {
                int var309 = var3.method8462();
                if (var3.method8462() == 0) {
                    field803[var309] = new class388();
                    var3.field5233 += 18;
                } else {
                    var3.field5233--;
                    field803[var309] = new class388(var3, false);
                }
                field721 = field707;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3426 == arg0.field1440) {
                method4074(class312.field3315);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3334 == arg0.field1440) {
                int var310 = var3.method8682();
                int var311 = var3.method8682();
                int var312 = class35.method2869();
                class313 var313 = class313.method7156(class311.field3214, field574.field1438);
                var313.field3318.method8494(field175);
                var313.field3318.method8494(var312);
                var313.field3318.method8448(var310);
                var313.field3318.method8604(var311);
                field574.method2654(var313);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3393 == arg0.field1440) {
                int var314 = var3.method8518();
                int var315 = var3.method8577();
                int var316 = var3.method8670();
                int var317 = var3.method8682();
                class350 var318 = Statics.field2621.method5681(var317);
                if (var318.field3763 != var314 || var318.field3797 != var316 || var318.field3844 != var315) {
                    var318.field3763 = var314;
                    var318.field3797 = var316;
                    var318.field3844 = var315;
                    method4817(var318);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3384 == arg0.field1440) {
                int var319 = var3.method8518();
                int var320 = var3.method8682();
                class350 var321 = Statics.field2621.method5681(var320);
                if (var321.field3784 != 2 || var321.field3849 != var319) {
                    var321.field3784 = 2;
                    var321.field3849 = var319;
                    method4817(var321);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3445 == arg0.field1440) {
                if (Statics.field1190 == null) {
                    Statics.field1190 = new class475(Statics.field1044);
                }
                class544 var322 = Statics.field1044.method7776(var3);
                Statics.field1190.field4901.method8214(var322.field5300, var322.field5301);
                field632[++field715 - 1 & 0x1F] = var322.field5300;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3410 == arg0.field1440) {
                String var323 = var3.method8473();
                long var324 = (long) var3.method8670();
                long var326 = (long) var3.method8466();
                class373 var328 = (class373) class393.method3484(class373.method6211(), var3.method8462());
                long var329 = (var324 << 32) + var326;
                boolean var331 = false;
                for (int var332 = 0; var332 < 100; var332++) {
                    if (field747[var332] == var329) {
                        var331 = true;
                        break;
                    }
                }
                if (Statics.field3621.method1781(new class558(var323, Statics.field1527))) {
                    var331 = true;
                }
                if (!var331 && field751 == 0) {
                    field747[field748] = var329;
                    field748 = (field748 + 1) % 100;
                    String var333 = class418.method7015(class407.method4735(class353.method5708(var3)));
                    byte var334;
                    if (var328.field4339) {
                        var334 = 7;
                    } else {
                        var334 = 3;
                    }
                    if (var328.field4341 == -1) {
                        class112.method2177(var334, var323, var333);
                    } else {
                        class112.method2177(var334, class103.method6233(var328.field4341) + var323, var333);
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3339 == arg0.field1440) {
                String var335 = var3.method8473();
                long var336 = var3.method8469();
                long var338 = (long) var3.method8670();
                long var340 = (long) var3.method8466();
                class373 var342 = (class373) class393.method3484(class373.method6211(), var3.method8462());
                long var343 = (var338 << 32) + var340;
                boolean var345 = false;
                for (int var346 = 0; var346 < 100; var346++) {
                    if (field747[var346] == var343) {
                        var345 = true;
                        break;
                    }
                }
                if (var342.field4354 && Statics.field3621.method1781(new class558(var335, Statics.field1527))) {
                    var345 = true;
                }
                if (!var345 && field751 == 0) {
                    field747[field748] = var343;
                    field748 = (field748 + 1) % 100;
                    String var347 = class418.method7015(class407.method4735(class353.method5708(var3)));
                    if (var342.field4341 == -1) {
                        class112.method3399(9, var335, var347, class409.method4809(var336));
                    } else {
                        class112.method3399(9, class103.method6233(var342.field4341) + var335, var347, class409.method4809(var336));
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3355 == arg0.field1440) {
                int var348 = var3.method8514();
                int var349 = var3.method8670();
                int var350 = var349 >> 10 & 0x1F;
                int var351 = var349 >> 5 & 0x1F;
                int var352 = var349 & 0x1F;
                int var353 = (var352 << 3) + (var350 << 19) + (var351 << 11);
                class350 var354 = Statics.field2621.method5681(var348);
                if (var354.field3886 != var353) {
                    var354.field3886 = var353;
                    method4817(var354);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3369 == arg0.field1440) {
                int var355 = var3.method8518();
                int var356 = var3.method8518();
                class322.method104(var355, var356);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3397 == arg0.field1440) {
                method4074(class312.field3308);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3420 == arg0.field1440) {
                field720 = field707;
                byte var357 = var3.method8463();
                class162 var358 = new class162(var3);
                class165 var359;
                if (var357 >= 0) {
                    var359 = field756[var357];
                } else {
                    var359 = Statics.field87;
                }
                if (var359 == null) {
                    this.method1169(var357);
                    arg0.field1440 = null;
                    return true;
                }
                if (var358.field1782 > var359.field1796) {
                    this.method1169(var357);
                    arg0.field1440 = null;
                    return true;
                }
                if (var358.field1782 < var359.field1796) {
                    arg0.field1440 = null;
                    return true;
                }
                var358.method3099(var359);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3395 == arg0.field1440) {
                if (field683 != -1) {
                    method2069(field683, 0);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3383 == arg0.field1440) {
                return this.method1307(arg0, 1);
            }
            if (class314.field3361 == arg0.field1440) {
                int var360 = var3.method8682();
                if (field609 != var360) {
                    field609 = var360;
                    method165();
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3328 == arg0.field1440) {
                class37.method2282(var3, arg0.field1441);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3333 == arg0.field1440) {
                method4074(class312.field3310);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3418 == arg0.field1440) {
                Statics.field3621.method1757();
                field717 = field707;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3398 == arg0.field1440) {
                method3137();
                field634 = var3.method8670();
                field723 = field707;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3386 == arg0.field1440) {
                method4074(class312.field3306);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3341 == arg0.field1440) {
                Statics.field3603 = var3.method8462();
                field588 = var3.method8462();
                Statics.field2906 = var3.method8495();
                for (int var361 = Statics.field2906; var361 < Statics.field2906 + 8; var361++) {
                    for (int var362 = Statics.field3603; var362 < Statics.field3603 + 8; var362++) {
                        if (field650[field588][var361][var362] != null) {
                            field650[field588][var361][var362] = null;
                            method7800(field588, var361, var362);
                        }
                    }
                }
                for (class96 var363 = (class96) field651.method6591(); var363 != null; var363 = (class96) field651.method6605()) {
                    if (var363.field1185 >= Statics.field2906 && var363.field1185 < Statics.field2906 + 8 && var363.field1183 >= Statics.field3603 && var363.field1183 < Statics.field3603 + 8 && field588 == var363.field1187) {
                        var363.field1197 = 0;
                    }
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3414 == arg0.field1440) {
                int var364 = var3.method8682();
                int var365 = var3.method8659();
                int var366 = var3.method8659();
                class350 var367 = Statics.field2621.method5681(var364);
                class350.method3530(var367, var366, var365);
                method4817(var367);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3442 == arg0.field1440) {
                int var368 = var3.method8514();
                boolean var369 = var3.method8462() == 1;
                class350 var370 = Statics.field2621.method5681(var368);
                if (var370.field3866 != var369) {
                    var370.field3866 = var369;
                    method4817(var370);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3421 == arg0.field1440) {
                int var371 = var3.method8676();
                boolean var372 = var3.method8462() == 1;
                String var373 = "";
                boolean var374 = false;
                if (var372) {
                    var373 = var3.method8473();
                    if (Statics.field3621.method1781(new class558(var373, Statics.field1527))) {
                        var374 = true;
                    }
                }
                String var375 = var3.method8473();
                if (!var374) {
                    class112.method2177(var371, var373, var375);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3390 == arg0.field1440) {
                int var376 = var3.method8711();
                int var377 = var3.method8532();
                class350 var378 = Statics.field2621.method5681(var376);
                class350.method2302(var378, var377);
                method4817(var378);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3411 == arg0.field1440) {
                method4074(class312.field3313);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3430 == arg0.field1440) {
                boolean var379 = var3.method8462() == 1;
                int var380 = var3.method8532();
                class350 var381 = Statics.field2621.method5681(var380);
                class350.method2114(var381, Statics.field1608.field1123, var379);
                method4817(var381);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3348 == arg0.field1440) {
                int var382 = var3.method8659();
                int var383 = var3.method8577();
                if (var383 == 65535) {
                    var383 = -1;
                }
                method3335(Statics.field1608, var383, var382);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3417 == arg0.field1440) {
                method7938(var3.method8473());
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3408 == arg0.field1440) {
                int var384 = var3.method8682();
                int var385 = var3.method8670();
                if (var384 < -70000) {
                    var385 += 32768;
                }
                class350 var386;
                if (var384 >= 0) {
                    var386 = Statics.field2621.method5681(var384);
                } else {
                    var386 = null;
                }
                while (var3.field5233 < arg0.field1441) {
                    int var387 = var3.method8676();
                    int var388 = var3.method8670();
                    int var389 = 0;
                    if (var388 != 0) {
                        var389 = var3.method8462();
                        if (var389 == 255) {
                            var389 = var3.method8682();
                        }
                    }
                    if (var386 != null && var387 >= 0 && var387 < var386.field3875.length) {
                        var386.field3875[var387] = var388;
                        var386.field3876[var387] = var389;
                    }
                    class86.method2172(var385, var387, var388 - 1, var389);
                }
                if (var386 != null) {
                    method4817(var386);
                }
                method3137();
                field573[++field711 - 1 & 0x1F] = var385 & 0x7FFF;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3401 == arg0.field1440) {
                int var390 = var3.method8670();
                if (var390 == 65535) {
                    var390 = -1;
                }
                field683 = var390;
                this.method1165(false);
                method1121(var390);
                class72.method334(field683);
                for (int var391 = 0; var391 < 100; var391++) {
                    field733[var391] = true;
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3362 == arg0.field1440) {
                method2999(true, arg0.field1439);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3372 == arg0.field1440) {
                method4074(class312.field3309);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3422 == arg0.field1440) {
                method5371();
                arg0.field1440 = null;
                return false;
            }
            if (class314.field3423 == arg0.field1440) {
                int var392 = var3.method8577();
                int var393 = var3.method8670();
                int var394 = var3.method8532();
                class350 var395 = Statics.field2621.method5681(var394);
                var395.field3738 = (var393 << 16) + var392;
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3356 == arg0.field1440) {
                field516 = true;
                field627 = false;
                field775 = true;
                int var396 = var3.method8465();
                int var397 = var3.method8465();
                int var398 = method5614(Statics.field1500 + var397 & 0x7EB);
                int var399 = Statics.field80 + var396;
                int var400 = var3.method8670();
                int var401 = var3.method8462();
                field779 = new class499(Statics.field1500, var398, var400, var401);
                field778 = new class499(Statics.field80, var399, var400, var401);
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3360 == arg0.field1440) {
                int var402 = var3.method8504();
                int var403 = var3.method8514();
                class350 var404 = Statics.field2621.method5681(var403);
                if (var404.field3792 != var402 || var402 == -1) {
                    var404.field3792 = var402;
                    var404.field3879 = 0;
                    var404.field3846 = 0;
                    method4817(var404);
                }
                arg0.field1440 = null;
                return true;
            }
            if (class314.field3381 == arg0.field1440) {
                return this.method1307(arg0, 2);
            }
            class561.method3291("" + (arg0.field1440 == null ? -1 : arg0.field1440.field3447) + class103.field1342 + (arg0.field1447 == null ? -1 : arg0.field1447.field3447) + class103.field1342 + (arg0.field1448 == null ? -1 : arg0.field1448.field3447) + class103.field1342 + arg0.field1441, (Throwable) null);
            method5371();
        } catch (IOException var409) {
            Statics.method3387();
        } catch (Exception var410) {
            String var407 = "" + (arg0.field1440 == null ? -1 : arg0.field1440.field3447) + class103.field1342 + (arg0.field1447 == null ? -1 : arg0.field1447.field3447) + class103.field1342 + (arg0.field1448 == null ? -1 : arg0.field1448.field3447) + class103.field1342 + arg0.field1441 + class103.field1342 + (Statics.field481 + Statics.field1608.field1271[0]) + class103.field1342 + (Statics.field99 + Statics.field1608.field1272[0]) + class103.field1342;
            for (int var408 = 0; var408 < arg0.field1441 && var408 < 50; var408++) {
                var407 = var407 + var3.field5231[var408] + class103.field1342;
            }
            class561.method3291(var407, var410);
            method5371();
        }
        return true;
    }

    @ObfuscatedName("iz.ke(Llk;I)V")
    public static final void method4074(class312 arg0) {
        class534 var1 = field574.field1439;
        if (class312.field3313 == arg0) {
            int var2 = var1.method8518();
            int var3 = var1.method8495();
            int var4 = (var3 >> 4 & 0x7) + Statics.field2906;
            int var5 = (var3 & 0x7) + Statics.field3603;
            int var6 = var1.method8497();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field587[var7];
            int var10 = var1.method8497();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                int var11 = field588 == -1 ? Statics.field1861 : field588;
                method5634(var11, var4, var5, var9, var2, var7, var8, var10, 0, -1);
            }
            return;
        }
        if (class312.field3306 == arg0) {
            byte var12 = var1.method8513();
            byte var13 = var1.method8513();
            int var14 = var1.method8518();
            int var15 = var1.method8670();
            int var16 = var1.method8659();
            int var17 = var16 >> 2;
            int var18 = var16 & 0x3;
            int var19 = field587[var17];
            byte var20 = var1.method8513();
            int var21 = var1.method8577();
            int var22 = var1.method8577();
            int var23 = var1.method8462();
            int var24 = (var23 >> 4 & 0x7) + Statics.field2906;
            int var25 = (var23 & 0x7) + Statics.field3603;
            byte var26 = var1.method8499();
            class93 var27;
            if (field578 == var14) {
                var27 = Statics.field1608;
            } else {
                var27 = field636[var14];
            }
            if (var27 != null) {
                int var28 = field588 == -1 ? Statics.field1861 : field588;
                method2868(var28, var24, var25, var17, var18, var19, var15, var21, var22, var12, var13, var20, var26, var27);
            }
        }
        if (class312.field3308 == arg0) {
            int var29 = var1.method8495();
            int var30 = (var29 >> 4 & 0x7) + Statics.field2906;
            int var31 = (var29 & 0x7) + Statics.field3603;
            int var32 = var1.method8577();
            int var33 = var1.method8670();
            int var34 = var1.method8495();
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                int var35 = var30 * 128 + 64;
                int var36 = var31 * 128 + 64;
                int var37 = field588 == -1 ? Statics.field1861 : field588;
                class73 var38 = new class73(var33, var37, var35, var36, method292(var35, var36, var37) - var34, var32, field523);
                field653.method6581(var38);
            }
        } else if (class312.field3311 == arg0) {
            int var39 = var1.method8659() * 4;
            byte var40 = var1.method8499();
            int var41 = var1.method8577();
            int var42 = var1.method8577();
            int var43 = var1.method8495() * 4;
            int var44 = var1.method8509();
            int var45 = var1.method8510();
            int var46 = var1.method8497();
            int var47 = (var46 >> 4 & 0x7) + Statics.field2906;
            int var48 = (var46 & 0x7) + Statics.field3603;
            byte var49 = var1.method8498();
            int var50 = var1.method8462();
            int var51 = var1.method8518();
            int var52 = var1.method8577();
            int var53 = var47 + var49;
            int var54 = var40 + var48;
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var51 != 65535) {
                int var55 = field588 == -1 ? Statics.field1861 : field588;
                method3090(var55, var47, var48, var53, var54, var44, var51, var43, var39, var52, var42, var50, var41, var45);
            }
        } else if (class312.field3310 == arg0) {
            int var56 = var1.method8462();
            int var57 = var1.method8515();
            int var58 = var1.method8495();
            int var59 = (var58 >> 4 & 0x7) + Statics.field2906;
            int var60 = (var58 & 0x7) + Statics.field3603;
            if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                int var61 = field588 == -1 ? Statics.field1861 : field588;
                method41(var61, var59, var60, var57, var56);
            }
        } else if (class312.field3307 == arg0) {
            int var62 = var1.method8518();
            int var63 = var1.method8462();
            int var64 = var63 >> 2;
            int var65 = var63 & 0x3;
            int var66 = field587[var64];
            int var67 = var1.method8497();
            int var68 = (var67 >> 4 & 0x7) + Statics.field2906;
            int var69 = (var67 & 0x7) + Statics.field3603;
            if (var68 >= 0 && var69 >= 0 && var68 < 103 && var69 < 103) {
                int var70 = field588 == -1 ? Statics.field1861 : field588;
                class96 var71 = method1113(var70, var68, var69, var66);
                if (var71 != null) {
                    class222 var72 = class222.method2212(var71.field1199);
                    if (var72.field2298) {
                        var71.field1193 = var62;
                        return;
                    }
                }
                boolean var73 = method3529(var70, var68, var69, var64, var65, var66, var62);
                if (var73) {
                    return;
                }
                if (var71 != null) {
                    var71.field1193 = var62;
                }
            }
        } else if (class312.field3312 == arg0) {
            int var74 = var1.method8577();
            int var75 = var1.method8497();
            int var76 = (var75 >> 4 & 0x7) + Statics.field2906;
            int var77 = (var75 & 0x7) + Statics.field3603;
            int var78 = var1.method8497();
            int var79 = var1.method8495() & 0x1F;
            int var80 = var1.method8495();
            int var81 = var1.method8495();
            if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                int var82 = var79 + 1;
                if (Statics.field1608.field1271[0] >= var76 - var82 && Statics.field1608.field1271[0] <= var76 + var82 && Statics.field1608.field1272[0] >= var77 - var82 && Statics.field1608.field1272[0] <= var77 + var82 && Statics.field1336.method2363() != 0 && var78 > 0 && field766 < 50) {
                    field767[field766] = var74;
                    field772[field766] = null;
                    field770[field766] = (var76 << 16) + (var77 << 8) + var79;
                    field557[field766] = var78;
                    field769[field766] = var80;
                    field771[field766] = var81;
                    field766++;
                }
            }
        } else if (class312.field3315 == arg0) {
            int var83 = var1.method8514();
            int var84 = var1.method8515();
            int var85 = var1.method8577();
            int var86 = var1.method8518();
            int var87 = var1.method8462();
            int var88 = var1.method8495();
            boolean var89 = var1.method8462() == 1;
            int var90 = var1.method8495();
            int var91 = (var90 >> 4 & 0x7) + Statics.field2906;
            int var92 = (var90 & 0x7) + Statics.field3603;
            if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                int var93 = field588 == -1 ? Statics.field1861 : field588;
                method7908(var93, var91, var92, var85, var83, var88, var84, var86, var87, var89);
            }
        } else if (class312.field3309 == arg0) {
            int var94 = var1.method8497();
            int var95 = (var94 >> 4 & 0x7) + Statics.field2906;
            int var96 = (var94 & 0x7) + Statics.field3603;
            int var97 = var1.method8497();
            int var98 = var97 >> 2;
            int var99 = var97 & 0x3;
            int var100 = field587[var98];
            if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                int var101 = field588 == -1 ? Statics.field1861 : field588;
                method5634(var101, var95, var96, var100, -1, var98, var99, 31, 0, -1);
            }
        } else if (class312.field3305 == arg0) {
            int var102 = var1.method8659();
            int var103 = (var102 >> 4 & 0x7) + Statics.field2906;
            int var104 = (var102 & 0x7) + Statics.field3603;
            int var105 = var1.method8514();
            int var106 = var1.method8518();
            int var107 = var1.method8532();
            if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                int var108 = field588 == -1 ? Statics.field1861 : field588;
                method166(var108, var103, var104, var106, var107, var105);
            }
        } else if (class312.field3303 == arg0) {
            int var109 = var1.method8514();
            int var110 = var1.method8497();
            int var111 = (var110 >> 4 & 0x7) + Statics.field2906;
            int var112 = (var110 & 0x7) + Statics.field3603;
            int var113 = var1.method8577();
            if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                int var114 = field588 == -1 ? Statics.field1861 : field588;
                method5628(var114, var111, var112, var113, var109);
            }
        }
    }

    @ObfuscatedName("ab.ku(IIIIII)V")
    public static void method41(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class398 var5 = field650[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class106 var6 = (class106) var5.method6591(); var6 != null; var6 = (class106) var5.method6605()) {
            if ((arg3 & 0x7FFF) == var6.field1367) {
                var6.method2557(arg4);
                break;
            }
        }
    }

    @ObfuscatedName("ax.kd(IIIIIII)V")
    public static void method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class398 var6 = field650[arg0][arg1][arg2];
        if (var6 == null) {
            return;
        }
        for (class106 var7 = (class106) var6.method6591(); var7 != null; var7 = (class106) var6.method6605()) {
            if ((arg3 & 0x7FFF) == var7.field1367 && var7.field1372 == arg4) {
                var7.field1372 = arg5;
                break;
            }
        }
        method7800(arg0, arg1, arg2);
    }

    @ObfuscatedName("ek.km(IIIIIIIIIIIIILdi;I)V")
    public static void method2868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class93 arg13) {
        class222 var14 = class222.method2212(arg6);
        int var15;
        int var16;
        if (arg4 == 1 || arg4 == 3) {
            var15 = var14.field2263;
            var16 = var14.field2262;
        } else {
            var15 = var14.field2262;
            var16 = var14.field2263;
        }
        int var17 = (var15 >> 1) + arg1;
        int var18 = (var15 + 1 >> 1) + arg1;
        int var19 = (var16 >> 1) + arg2;
        int var20 = (var16 + 1 >> 1) + arg2;
        int[][] var21 = class83.field1030[arg0];
        int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
        int var23 = (arg1 << 7) + (var15 << 6);
        int var24 = (arg2 << 7) + (var16 << 6);
        class256 var25 = var14.method3752(arg3, arg4, var21, var23, var22, var24);
        if (var25 == null) {
            return;
        }
        method5634(arg0, arg1, arg2, arg5, -1, 0, 0, 31, arg7 + 1, arg8 + 1);
        arg13.field1130 = field523 + arg7;
        arg13.field1140 = field523 + arg8;
        arg13.field1134 = var25;
        arg13.field1141 = arg1 * 128 + var15 * 64;
        arg13.field1138 = arg2 * 128 + var16 * 64;
        arg13.field1133 = var22;
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
        arg13.field1136 = arg1 + arg9;
        arg13.field1135 = arg1 + arg11;
        arg13.field1137 = arg2 + arg10;
        arg13.field1139 = arg2 + arg12;
    }

    @ObfuscatedName("gg.kk(IIIIIIIIIIIIIII)V")
    public static void method3090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = arg1 * 128 + 64;
        int var15 = arg2 * 128 + 64;
        int var16 = arg3 * 128 + 64;
        int var17 = arg4 * 128 + 64;
        class78 var18 = new class78(arg6, arg0, var14, var15, method292(var14, var15, arg0) - arg7, field523 + arg9, field523 + arg10, arg11, arg12, arg13, arg5, arg8);
        var18.method2080(var16, var17, method292(var16, var17, arg0) - arg8, field523 + arg9);
        field524.method6581(var18);
    }

    @ObfuscatedName("me.ka(IIIIII)V")
    public static void method5628(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class398 var5 = field650[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class106 var6 = (class106) var5.method6591(); var6 != null; var6 = (class106) var5.method6605()) {
            if ((arg3 & 0x7FFF) == var6.field1367 && var6.field1372 == arg4) {
                var6.method7855();
                break;
            }
        }
        if (var5.method6591() == null) {
            field650[arg0][arg1][arg2] = null;
        }
        method7800(arg0, arg1, arg2);
    }

    @ObfuscatedName("tq.kj(IIIIIIIIIZS)V")
    public static void method7908(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        class106 var10 = new class106();
        var10.field1367 = arg3;
        var10.field1372 = arg4;
        var10.method2557(arg5);
        if (field650[arg0][arg1][arg2] == null) {
            field650[arg0][arg1][arg2] = new class398();
        }
        field650[arg0][arg1][arg2].method6581(var10);
        method7800(arg0, arg1, arg2);
    }

    @ObfuscatedName("hn.ki(IIIIIIIB)Z")
    public static boolean method3529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class372.field4329.field4332 == arg5) {
            class264 var7 = Statics.field5117.method4366(arg0, arg1, arg2);
            if (var7 != null) {
                int var8 = class257.method3531(var7.field2915);
                if (class359.field3926.field3947 == arg3) {
                    var7.field2908 = new class81(var8, 2, arg4 + 4, arg0, arg1, arg2, arg6, false, var7.field2908);
                    var7.field2914 = new class81(var8, 2, arg4 + 1 & 0x3, arg0, arg1, arg2, arg6, false, var7.field2914);
                } else {
                    var7.field2908 = new class81(var8, arg3, arg4, arg0, arg1, arg2, arg6, false, var7.field2908);
                }
                return true;
            }
        } else if (class372.field4328.field4332 == arg5) {
            class266 var9 = Statics.field5117.method4455(arg0, arg1, arg2);
            if (var9 != null) {
                int var10 = class257.method3531(var9.field2929);
                if (class359.field3937.field3947 == arg3 || class359.field3936.field3947 == arg3) {
                    var9.field2927 = new class81(var10, 4, arg4, arg0, arg1, arg2, arg6, false, var9.field2927);
                } else if (class359.field3931.field3947 == arg3) {
                    var9.field2927 = new class81(var10, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var9.field2927);
                } else if (class359.field3946.field3947 == arg3) {
                    var9.field2927 = new class81(var10, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var9.field2927);
                } else if (class359.field3933.field3947 == arg3) {
                    var9.field2927 = new class81(var10, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var9.field2927);
                    var9.field2931 = new class81(var10, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var9.field2931);
                }
                return true;
            }
        } else if (class372.field4330.field4332 == arg5) {
            class267 var11 = Statics.field5117.method4445(arg0, arg1, arg2);
            if (class359.field3930.field3947 == arg3) {
                arg3 = class359.field3944.field3947;
            }
            if (var11 != null) {
                var11.field2933 = new class81(class257.method3531(var11.field2945), arg3, arg4, arg0, arg1, arg2, arg6, false, var11.field2933);
                return true;
            }
        } else if (class372.field4331.field4332 == arg5) {
            class239 var12 = Statics.field5117.method4369(arg0, arg1, arg2);
            if (var12 != null) {
                var12.field2555 = new class81(class257.method3531(var12.field2551), 22, arg4, arg0, arg1, arg2, arg6, false, var12.field2555);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("mw.ks(IIIIIIIIIIB)V")
    public static void method5634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class96 var10 = null;
        for (class96 var11 = (class96) field651.method6591(); var11 != null; var11 = (class96) field651.method6605()) {
            if (var11.field1187 == arg0 && var11.field1185 == arg1 && var11.field1183 == arg2 && var11.field1186 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class96();
            var10.field1187 = arg0;
            var10.field1186 = arg3;
            var10.field1185 = arg1;
            var10.field1183 = arg2;
            var10.field1193 = -1;
            method5204(var10);
            field651.method6581(var10);
        }
        var10.field1199 = arg4;
        var10.field1192 = arg5;
        var10.field1191 = arg6;
        var10.field1196 = arg8;
        var10.field1197 = arg9;
        var10.method2280(arg7);
    }

    @ObfuscatedName("cn.ky(IIIIS)Ldt;")
    public static final class96 method1113(int arg0, int arg1, int arg2, int arg3) {
        for (class96 var4 = (class96) field651.method6591(); var4 != null; var4 = (class96) field651.method6605()) {
            if (var4.field1187 == arg0 && var4.field1185 == arg1 && var4.field1183 == arg2 && var4.field1186 == arg3) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("eq.kf(B)V")
    public static final void method2793() {
        for (class96 var0 = (class96) field651.method6591(); var0 != null; var0 = (class96) field651.method6605()) {
            if (var0.field1197 == -1) {
                var0.field1196 = 0;
                method5204(var0);
            } else {
                var0.method7855();
            }
        }
    }

    @ObfuscatedName("kc.kr(Ldt;I)V")
    public static final void method5204(class96 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1186 == 0) {
            var1 = Statics.field5117.method4370(arg0.field1187, arg0.field1185, arg0.field1183);
        }
        if (arg0.field1186 == 1) {
            var1 = Statics.field5117.method4371(arg0.field1187, arg0.field1185, arg0.field1183);
        }
        if (arg0.field1186 == 2) {
            var1 = Statics.field5117.method4410(arg0.field1187, arg0.field1185, arg0.field1183);
        }
        if (arg0.field1186 == 3) {
            var1 = Statics.field5117.method4373(arg0.field1187, arg0.field1185, arg0.field1183);
        }
        if (var1 != 0L) {
            int var6 = Statics.field5117.method4453(arg0.field1187, arg0.field1185, arg0.field1183, var1);
            var3 = class257.method3531(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1184 = var3;
        arg0.field1189 = var4;
        arg0.field1188 = var5;
    }

    @ObfuscatedName("hx.kh(B)V")
    public static final void method3398() {
        for (class96 var0 = (class96) field651.method6591(); var0 != null; var0 = (class96) field651.method6605()) {
            if (var0.field1197 > 0) {
                var0.field1197--;
            }
            if (var0.field1197 == 0) {
                if (var0.field1184 >= 0) {
                    int var1 = var0.field1184;
                    int var2 = var0.field1189;
                    class222 var3 = class222.method2212(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method3770(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method1828(var0.field1187, var0.field1186, var0.field1185, var0.field1183, var0.field1184, var0.field1188, var0.field1189, var0.field1193);
                var0.method7855();
            } else {
                if (var0.field1196 > 0) {
                    var0.field1196--;
                }
                if (var0.field1196 == 0 && var0.field1185 >= 1 && var0.field1183 >= 1 && var0.field1185 <= 102 && var0.field1183 <= 102) {
                    if (var0.field1199 >= 0) {
                        int var5 = var0.field1199;
                        int var6 = var0.field1192;
                        class222 var7 = class222.method2212(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method3770(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method1828(var0.field1187, var0.field1186, var0.field1185, var0.field1183, var0.field1199, var0.field1191, var0.field1192, var0.field1193);
                    var0.field1196 = -1;
                    if (var0.field1199 == var0.field1184 && var0.field1184 == -1) {
                        var0.method7855();
                    } else if (var0.field1199 == var0.field1184 && var0.field1191 == var0.field1188 && var0.field1192 == var0.field1189) {
                        var0.method7855();
                    }
                }
            }
        }
    }

    @ObfuscatedName("cv.kg(IIIIIIIII)V")
    public static final void method1828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field658 && Statics.field1861 != arg0) {
            return;
        }
        long var8 = 0L;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg1 == 0) {
            var8 = Statics.field5117.method4370(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var8 = Statics.field5117.method4371(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var8 = Statics.field5117.method4410(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var8 = Statics.field5117.method4373(arg0, arg2, arg3);
        }
        if (var8 != 0L) {
            int var13 = Statics.field5117.method4453(arg0, arg2, arg3, var8);
            int var14 = class257.method3531(var8);
            int var15 = var13 & 0x1F;
            int var16 = var13 >> 6 & 0x3;
            class222 var17 = class222.method2212(var14);
            if (var17 != null && var17.method3760()) {
                int var20 = var17.field2262;
                int var21 = var17.field2263;
                if (var16 == 1 || var16 == 3) {
                    var20 = var17.field2263;
                    var21 = var17.field2262;
                }
                int var22 = (arg2 + var20) * 128;
                int var23 = (arg3 + var21) * 128;
                int var24 = arg2 * 128;
                int var25 = arg3 * 128;
                int var26 = var17.field2253;
                int var27 = var17.field2285 * 128;
                int var28 = var17.field2297 * 128;
                if (var17.field2290 != null) {
                    class222 var29 = var17.method3755();
                    if (var29 != null) {
                        var26 = var29.field2253;
                        var27 = var29.field2285 * 128;
                        var28 = var29.field2297 * 128;
                    }
                }
                class71 var10000 = (class71) null;
                for (class71 var30 = (class71) class71.field856.method6591(); var30 != null; var30 = (class71) class71.field856.method6605()) {
                    if (var30.field845 == arg0 && var30.field843 == var24 && var30.field841 == var25 && var30.field854 == var22 && var30.field846 == var23 && var30.field849 == var26 && var30.field847 == var27 && var30.field848 == var28) {
                        if (var30.field850 != null) {
                            Statics.field1283.method669(var30.field850);
                            var30.field850 = null;
                        }
                        if (var30.field852 != null) {
                            Statics.field1283.method669(var30.field852);
                            var30.field852 = null;
                        }
                        var30.method7855();
                        break;
                    }
                    var10000 = (class71) null;
                }
            }
            if (arg1 == 0) {
                Statics.field5117.method4508(arg0, arg2, arg3);
                if (var17.field2265 != 0) {
                    field584[arg0].method4004(arg2, arg3, var15, var16, var17.field2275);
                }
            }
            if (arg1 == 1) {
                Statics.field5117.method4362(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field5117.method4379(arg0, arg2, arg3);
                if (var17.field2262 + arg2 > 103 || var17.field2262 + arg3 > 103 || var17.field2263 + arg2 > 103 || var17.field2263 + arg3 > 103) {
                    return;
                }
                if (var17.field2265 != 0) {
                    field584[arg0].method3997(arg2, arg3, var17.field2262, var17.field2263, var16, var17.field2275);
                }
            }
            if (arg1 == 3) {
                Statics.field5117.method4457(arg0, arg2, arg3);
                if (var17.field2265 == 1) {
                    field584[arg0].method4007(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var31 = arg0;
        if (arg0 < 3 && (class83.field1047[1][arg2][arg3] & 0x2) == 2) {
            var31 = arg0 + 1;
        }
        class83.method5376(arg0, var31, arg2, arg3, arg4, arg5, arg6, arg7, Statics.field5117, field584[arg0]);
        class222 var32 = class222.method2212(arg4);
        if (var32 != null && var32.method3760()) {
            class71.method6436(var31, arg2, arg3, var32, arg5);
        }
    }

    @ObfuscatedName("sm.kn(IIII)V")
    public static void method7800(int arg0, int arg1, int arg2) {
        class398 var3 = field650[arg0][arg1][arg2];
        if (var3 == null) {
            Statics.field5117.method4483(arg0, arg1, arg2);
            return;
        }
        long var4 = -99999999L;
        class106 var6 = null;
        for (class106 var7 = (class106) var3.method6591(); var7 != null; var7 = (class106) var3.method6605()) {
            class223 var8 = class223.method87(var7.field1367);
            long var9 = (long) var8.field2324;
            if (var8.field2323 == 1) {
                var9 *= var7.field1372 < Integer.MAX_VALUE ? (long) (var7.field1372 + 1) : (long) var7.field1372;
            }
            if (var9 > var4) {
                var4 = var9;
                var6 = var7;
            }
        }
        if (var6 == null) {
            Statics.field5117.method4483(arg0, arg1, arg2);
            return;
        }
        var3.method6583(var6);
        class106 var11 = null;
        class106 var12 = null;
        for (class106 var13 = (class106) var3.method6591(); var13 != null; var13 = (class106) var3.method6605()) {
            if (var6.field1367 != var13.field1367) {
                if (var11 == null) {
                    var11 = var13;
                }
                if (var11.field1367 != var13.field1367 && var12 == null) {
                    var12 = var13;
                }
            }
        }
        long var14 = class257.method3017(arg1, arg2, 3, false, 0);
        Statics.field5117.method4351(arg0, arg1, arg2, method292(arg1 * 128 + 64, arg2 * 128 + 64, arg0), var6, var14, var11, var12);
    }

    @ObfuscatedName("pv.kv(ZLun;S)V")
    public static final void method6558(boolean arg0, class534 arg1) {
        field638 = 0;
        field572 = 0;
        Statics.method811(arg1);
        Statics.method18(arg0, arg1);
        method2537(arg1);
        for (int var2 = 0; var2 < field638; var2++) {
            int var3 = field644[var2];
            if (field523 != field569[var3].field1230) {
                field569[var3].field1333 = null;
                field569[var3] = null;
            }
        }
        if (field574.field1441 != arg1.field5233) {
            throw new RuntimeException(arg1.field5233 + class103.field1342 + field574.field1441);
        }
        for (int var4 = 0; var4 < field645; var4++) {
            if (field569[field724[var4]] == null) {
                throw new RuntimeException(var4 + class103.field1342 + field645);
            }
        }
    }

    @ObfuscatedName("du.kp(Lun;I)V")
    public static final void method2537(class534 arg0) {
        for (int var1 = 0; var1 < field572; var1++) {
            int var2 = field743[var1];
            class102 var3 = field569[var2];
            int var4 = arg0.method8462();
            if ((var4 & 0x2) != 0) {
                int var5 = arg0.method8462();
                var4 += var5 << 8;
            }
            if ((var4 & 0x100) != 0) {
                int var6 = arg0.method8462();
                var4 += var6 << 16;
            }
            if ((var4 & 0x40) != 0) {
                arg0.method8518();
                arg0.method8532();
            }
            if ((var4 & 0x10000) != 0) {
                int var7 = arg0.method8495();
                for (int var8 = 0; var8 < var7; var8++) {
                    int var9 = arg0.method8659();
                    int var10 = arg0.method8515();
                    int var11 = arg0.method8682();
                    var3.method2303(var9, var10, var11 >> 16, var11 & 0xFFFF);
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1211 = arg0.method8473();
                var3.field1224 = 100;
            }
            if ((var4 & 0x4000) != 0) {
                var3.method2470(arg0.method8497());
            }
            if ((var4 & 0x2000) != 0) {
                var3.field1252 = arg0.method8499();
                var3.field1239 = arg0.method8513();
                var3.field1259 = arg0.method8498();
                var3.field1254 = arg0.method8498();
                var3.field1256 = arg0.method8670() + field523;
                var3.field1257 = arg0.method8515() + field523;
                var3.field1204 = arg0.method8577();
                var3.field1274 = 1;
                var3.field1275 = 0;
                var3.field1252 += var3.field1271[0];
                var3.field1239 += var3.field1272[0];
                var3.field1259 += var3.field1271[0];
                var3.field1254 += var3.field1272[0];
            }
            if ((var4 & 0x20) != 0) {
                int var12 = arg0.method8515();
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = arg0.method8462();
                if (var3.field1201 == var12 && var12 != -1) {
                    int var14 = class225.method288(var12).field2397;
                    if (var14 == 1) {
                        var3.field1246 = 0;
                        var3.field1247 = 0;
                        var3.field1248 = var13;
                        var3.field1249 = 0;
                    }
                    if (var14 == 2) {
                        var3.field1249 = 0;
                    }
                } else if (var12 == -1 || var3.field1201 == -1 || class225.method288(var12).field2394 >= class225.method288(var3.field1201).field2394) {
                    var3.field1201 = var12;
                    var3.field1246 = 0;
                    var3.field1247 = 0;
                    var3.field1248 = var13;
                    var3.field1249 = 0;
                    var3.field1275 = var3.field1274;
                }
            }
            if ((var4 & 0x1000) != 0) {
                var3.field1261 = field523 + arg0.method8670();
                var3.field1237 = field523 + arg0.method8515();
                var3.field1262 = arg0.method8498();
                var3.field1264 = arg0.method8463();
                var3.field1236 = arg0.method8513();
                var3.field1266 = (byte) arg0.method8495();
            }
            if ((var4 & 0x20000) != 0) {
                int var15 = arg0.method8497();
                int[] var16 = new int[8];
                short[] var17 = new short[8];
                for (int var18 = 0; var18 < 8; var18++) {
                    if ((var15 & 0x1 << var18) == 0) {
                        var16[var18] = -1;
                        var17[var18] = -1;
                    } else {
                        var16[var18] = arg0.method8633();
                        var17[var18] = (short) arg0.method8479();
                    }
                }
                var3.method2478(var16, var17);
            }
            if ((var4 & 0x8000) != 0) {
                var3.method2509(arg0.method8473());
            }
            if ((var4 & 0x400) != 0) {
                int var19 = arg0.method8659();
                if ((var19 & 0x1) == 1) {
                    var3.method2508();
                } else {
                    int[] var20 = null;
                    if ((var19 & 0x2) == 2) {
                        int var21 = arg0.method8659();
                        var20 = new int[var21];
                        for (int var22 = 0; var22 < var21; var22++) {
                            int var23 = arg0.method8518();
                            int var24 = var23 == 65535 ? -1 : var23;
                            var20[var22] = var24;
                        }
                    }
                    short[] var25 = null;
                    if ((var19 & 0x4) == 4) {
                        int var26 = 0;
                        if (var3.field1333.field2127 != null) {
                            var26 = var3.field1333.field2127.length;
                        }
                        var25 = new short[var26];
                        for (int var27 = 0; var27 < var26; var27++) {
                            var25[var27] = (short) arg0.method8518();
                        }
                    }
                    short[] var28 = null;
                    if ((var19 & 0x8) == 8) {
                        int var29 = 0;
                        if (var3.field1333.field2129 != null) {
                            var29 = var3.field1333.field2129.length;
                        }
                        var28 = new short[var29];
                        for (int var30 = 0; var30 < var29; var30++) {
                            var28[var30] = (short) arg0.method8518();
                        }
                    }
                    boolean var31 = false;
                    if ((var19 & 0x10) != 0) {
                        var31 = arg0.method8495() == 1;
                    }
                    long var32 = (long) (++class102.field1338 - 1);
                    var3.method2480(new class207(var32, var20, var25, var28, var31));
                }
            }
            if ((var4 & 0x200) != 0) {
                int var34 = arg0.method8659();
                if ((var34 & 0x1) == 1) {
                    var3.method2484();
                } else {
                    int[] var35 = null;
                    if ((var34 & 0x2) == 2) {
                        int var36 = arg0.method8462();
                        var35 = new int[var36];
                        for (int var37 = 0; var37 < var36; var37++) {
                            int var38 = arg0.method8518();
                            int var39 = var38 == 65535 ? -1 : var38;
                            var35[var37] = var39;
                        }
                    }
                    short[] var40 = null;
                    if ((var34 & 0x4) == 4) {
                        int var41 = 0;
                        if (var3.field1333.field2127 != null) {
                            var41 = var3.field1333.field2127.length;
                        }
                        var40 = new short[var41];
                        for (int var42 = 0; var42 < var41; var42++) {
                            var40[var42] = (short) arg0.method8670();
                        }
                    }
                    short[] var43 = null;
                    if ((var34 & 0x8) == 8) {
                        int var44 = 0;
                        if (var3.field1333.field2129 != null) {
                            var44 = var3.field1333.field2129.length;
                        }
                        var43 = new short[var44];
                        for (int var45 = 0; var45 < var44; var45++) {
                            var43[var45] = (short) arg0.method8577();
                        }
                    }
                    boolean var46 = false;
                    if ((var34 & 0x10) != 0) {
                        var46 = arg0.method8462() == 1;
                    }
                    long var47 = (long) (++class102.field1339 - 1);
                    var3.method2474(new class207(var47, var35, var40, var43, var46));
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1333 = class208.method2790(arg0.method8577());
                method818(var3);
                var3.method2477();
            }
            if ((var4 & 0x800) != 0) {
                var3.field1276 = arg0.method8532();
            }
            if ((var4 & 0x4) != 0) {
                int var49 = arg0.method8462();
                if (var49 > 0) {
                    for (int var50 = 0; var50 < var49; var50++) {
                        int var51 = -1;
                        int var52 = -1;
                        int var53 = -1;
                        int var54 = arg0.method8676();
                        if (var54 == 32767) {
                            var54 = arg0.method8676();
                            var52 = arg0.method8676();
                            var51 = arg0.method8676();
                            var53 = arg0.method8676();
                        } else if (var54 == 32766) {
                            var54 = -1;
                        } else {
                            var52 = arg0.method8676();
                        }
                        int var55 = arg0.method8676();
                        var3.method2287(var54, var52, var51, var53, field523, var55);
                    }
                }
                int var56 = arg0.method8462();
                if (var56 > 0) {
                    for (int var57 = 0; var57 < var56; var57++) {
                        int var58 = arg0.method8676();
                        int var59 = arg0.method8676();
                        if (var59 == 32767) {
                            var3.method2288(var58);
                        } else {
                            int var60 = arg0.method8676();
                            int var61 = arg0.method8462();
                            int var62 = var59 > 0 ? arg0.method8495() : var61;
                            var3.method2296(var58, field523, var59, var60, var61, var62);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                int var63 = arg0.method8515();
                int var64 = arg0.method8515();
                var3.field1240 = arg0.method8462() == 1;
                var3.field1238 = var63;
                var3.field1217 = var64;
            }
            if ((var4 & 0x80) != 0) {
                var3.field1235 = arg0.method8515();
                var3.field1235 += arg0.method8462() << 16;
                int var65 = 16777215;
                if (var3.field1235 == var65) {
                    var3.field1235 = -1;
                }
            }
            if ((var4 & 0x40000) != 0) {
                int var66 = arg0.method8532();
                var3.field1207 = (var66 & 0x1) == 0 ? var3.field1333.field2146 : arg0.method8670();
                var3.field1208 = (var66 & 0x2) == 0 ? var3.field1333.field2113 : arg0.method8577();
                var3.field1245 = (var66 & 0x4) == 0 ? var3.field1333.field2137 : arg0.method8670();
                var3.field1210 = (var66 & 0x8) == 0 ? var3.field1333.field2115 : arg0.method8670();
                var3.field1218 = (var66 & 0x10) == 0 ? var3.field1333.field2128 : arg0.method8577();
                var3.field1212 = (var66 & 0x20) == 0 ? var3.field1333.field2145 : arg0.method8515();
                var3.field1213 = (var66 & 0x40) == 0 ? var3.field1333.field2118 : arg0.method8518();
                var3.field1214 = (var66 & 0x80) == 0 ? var3.field1333.field2106 : arg0.method8518();
                var3.field1215 = (var66 & 0x100) == 0 ? var3.field1333.field2120 : arg0.method8518();
                var3.field1216 = (var66 & 0x200) == 0 ? var3.field1333.field2112 : arg0.method8515();
                var3.field1265 = (var66 & 0x400) == 0 ? var3.field1333.field2122 : arg0.method8518();
                var3.field1270 = (var66 & 0x800) == 0 ? var3.field1333.field2123 : arg0.method8515();
                var3.field1219 = (var66 & 0x1000) == 0 ? var3.field1333.field2124 : arg0.method8577();
                var3.field1227 = (var66 & 0x2000) == 0 ? var3.field1333.field2125 : arg0.method8515();
                var3.field1206 = (var66 & 0x4000) == 0 ? var3.field1333.field2116 : arg0.method8670();
            }
        }
    }

    @ObfuscatedName("bq.kl(Ldk;I)V")
    public static void method818(class102 arg0) {
        arg0.field1250 = arg0.field1333.field2144;
        arg0.field1269 = arg0.field1333.field2138;
        arg0.field1245 = arg0.field1333.field2137;
        arg0.field1210 = arg0.field1333.field2115;
        arg0.field1218 = arg0.field1333.field2128;
        arg0.field1212 = arg0.field1333.field2145;
        arg0.field1206 = arg0.field1333.field2116;
        arg0.field1207 = arg0.field1333.field2146;
        arg0.field1208 = arg0.field1333.field2113;
        arg0.field1213 = arg0.field1333.field2118;
        arg0.field1214 = arg0.field1333.field2106;
        arg0.field1215 = arg0.field1333.field2120;
        arg0.field1216 = arg0.field1333.field2112;
        arg0.field1265 = arg0.field1333.field2122;
        arg0.field1270 = arg0.field1333.field2123;
        arg0.field1219 = arg0.field1333.field2124;
        arg0.field1227 = arg0.field1333.field2125;
    }

    @ObfuscatedName("ah.kc(Ldi;IILiu;I)V")
    public static final void method12(class93 arg0, int arg1, int arg2, class234 arg3) {
        int var4 = arg0.field1271[0];
        int var5 = arg0.field1272[0];
        int var6 = arg0.method2236();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = field630.method4084(var4, var5, arg0.method2236(), method1067(arg1, arg2), field584[arg0.field1143], true, field816, field656);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method2239(field816[var8], field656[var8], arg3);
            }
        }
    }

    @ObfuscatedName("ct.kx(III)Liw;")
    public static class232 method1067(int arg0, int arg1) {
        field815.field2474 = arg0;
        field815.field2472 = arg1;
        field815.field2471 = 1;
        field815.field2473 = 1;
        return field815;
    }

    @ObfuscatedName("nr.kw(B)V")
    public static void method5715() {
        field660 = 0;
        field607 = false;
        field585[0] = class370.field4252;
        field667[0] = "";
        field663[0] = 1006;
        field695[0] = false;
        field660 = 1;
    }

    @ObfuscatedName("pv.kz(I)V")
    public static final void method6556() {
        int var0 = Statics.field73;
        int var1 = Statics.field1304;
        int var2 = Statics.field2059;
        int var3 = Statics.field1;
        int var4 = 6116423;
        class545.method8784(var0, var1, var2, var3, var4);
        class545.method8784(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class545.method8825(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field98.method7017(class370.field4229, var0 + 3, var1 + 14, var4, -1);
        int var5 = class36.field217;
        int var6 = class36.field218;
        for (int var7 = 0; var7 < field660; var7++) {
            int var8 = (field660 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field98.method7017(method3947(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field73;
        int var11 = Statics.field1304;
        int var12 = Statics.field2059;
        int var13 = Statics.field1;
        for (int var14 = 0; var14 < field731; var14++) {
            if (field738[var14] + field736[var14] > var10 && field736[var14] < var10 + var12 && field737[var14] + field681[var14] > var11 && field737[var14] < var11 + var13) {
                field817[var14] = true;
            }
        }
    }

    @ObfuscatedName("lh.lj(I)Z")
    public static final boolean method5233() {
        return field607;
    }

    @ObfuscatedName("oy.lb(IIIII)V")
    public static final void method6483(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field731; var4++) {
            if (field738[var4] + field736[var4] > arg0 && field736[var4] < arg0 + arg2 && field737[var4] + field681[var4] > arg1 && field737[var4] < arg1 + arg3) {
                field733[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.lv(I)V")
    public final void method1645() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field660 - 1; var2++) {
                if (field663[var2] < 1000 && field663[var2 + 1] > 1000) {
                    String var3 = field667[var2];
                    field667[var2] = field667[var2 + 1];
                    field667[var2 + 1] = var3;
                    String var4 = field585[var2];
                    field585[var2] = field585[var2 + 1];
                    field585[var2 + 1] = var4;
                    int var5 = field663[var2];
                    field663[var2] = field663[var2 + 1];
                    field663[var2 + 1] = var5;
                    int var6 = field661[var2];
                    field661[var2] = field661[var2 + 1];
                    field661[var2 + 1] = var6;
                    int var7 = field662[var2];
                    field662[var2] = field662[var2 + 1];
                    field662[var2 + 1] = var7;
                    int var8 = field664[var2];
                    field664[var2] = field664[var2 + 1];
                    field664[var2 + 1] = var8;
                    int var9 = field603[var2];
                    field603[var2] = field603[var2 + 1];
                    field603[var2 + 1] = var9;
                    boolean var10 = field695[var2];
                    field695[var2] = field695[var2 + 1];
                    field695[var2 + 1] = var10;
                    var1 = false;
                }
            }
        }
        if (field618 != null) {
            return;
        }
        int var11 = class36.field224;
        if (!field607) {
            int var22 = field660 - 1;
            if ((var11 == 1 || !Statics.field4580 && var11 == 4) && this.method1567()) {
                var11 = 2;
            }
            if ((var11 == 1 || !Statics.field4580 && var11 == 4) && field660 > 0) {
                method3521(var22);
            }
            if (var11 == 2 && field660 > 0) {
                this.method1164(class36.field212, class36.field228);
            }
            return;
        }
        if (var11 != 1 && (Statics.field4580 || var11 != 4)) {
            int var12 = class36.field217;
            int var13 = class36.field218;
            if (var12 < Statics.field73 - 10 || var12 > Statics.field73 + Statics.field2059 + 10 || var13 < Statics.field1304 - 10 || var13 > Statics.field1304 + Statics.field1 + 10) {
                field607 = false;
                method6483(Statics.field73, Statics.field1304, Statics.field2059, Statics.field1);
            }
        }
        if (var11 != 1 && Statics.field4580 || var11 != 4) {
            return;
        }
        int var14 = Statics.field73;
        int var15 = Statics.field1304;
        int var16 = Statics.field2059;
        int var17 = class36.field212;
        int var18 = class36.field228;
        int var19 = -1;
        for (int var20 = 0; var20 < field660; var20++) {
            int var21 = (field660 - 1 - var20) * 15 + var15 + 31;
            if (var17 > var14 && var17 < var14 + var16 && var18 > var21 - 13 && var18 < var21 + 3) {
                var19 = var20;
            }
        }
        if (var19 != -1) {
            method3521(var19);
        }
        field607 = false;
        method6483(Statics.field73, Statics.field1304, Statics.field2059, Statics.field1);
    }

    @ObfuscatedName("client.lm(I)Z")
    public final boolean method1567() {
        int var1 = field660 - 1;
        boolean var3 = field810 && field660 > 2;
        if (!var3) {
            boolean var4;
            if (var1 < 0) {
                var4 = false;
            } else {
                int var5 = field663[var1];
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
        return var3 && !field695[var1];
    }

    @ObfuscatedName("client.lh(III)V")
    public final void method1164(int arg0, int arg1) {
        int var3 = Statics.field98.method7062(class370.field4229);
        for (int var4 = 0; var4 < field660; var4++) {
            int var5 = Statics.field98.method7062(method3947(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field660 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field1700) {
            var7 = Statics.field1700 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field3661) {
            var8 = Statics.field3661 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field73 = var7;
        Statics.field1304 = var8;
        Statics.field2059 = var3;
        Statics.field1 = field660 * 15 + 22;
        int var9 = arg0 - field765;
        int var10 = arg1 - field646;
        Statics.field5117.method4358(Statics.field1861, var9, var10, false);
        field607 = true;
    }

    @ObfuscatedName("hs.lz(II)V")
    public static final void method3521(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field661[arg0];
        int var2 = field662[arg0];
        int var3 = field663[arg0];
        int var4 = field664[arg0];
        int var5 = field603[arg0];
        String var6 = field585[arg0];
        String var7 = field667[arg0];
        method4005(var1, var2, var3, var4, var5, var6, var7, class36.field212, class36.field228);
    }

    @ObfuscatedName("ix.lg(IIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method4005(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 46) {
            class93 var9 = field636[arg3];
            if (var9 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var10 = class313.method7156(class311.field3247, field574.field1438);
                var10.field3318.method8446(arg3);
                var10.field3318.method8493(field749.method3974(82) ? 1 : 0);
                field574.method2654(var10);
            }
        }
        if (arg2 == 51) {
            class93 var11 = field636[arg3];
            if (var11 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var12 = class313.method7156(class311.field3203, field574.field1438);
                var12.field3318.method8445(field749.method3974(82) ? 1 : 0);
                var12.field3318.method8595(arg3);
                field574.method2654(var12);
            }
        }
        if (arg2 == 3) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var13 = class313.method7156(class311.field3278, field574.field1438);
            var13.field3318.method8445(field749.method3974(82) ? 1 : 0);
            var13.field3318.method8446(Statics.field481 + arg0);
            var13.field3318.method8446(arg3);
            var13.field3318.method8443(Statics.field99 + arg1);
            field574.method2654(var13);
        }
        if (arg2 == 9) {
            class102 var14 = field569[arg3];
            if (var14 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var15 = class313.method7156(class311.field3293, field574.field1438);
                var15.field3318.method8501(arg3);
                var15.field3318.method8494(field749.method3974(82) ? 1 : 0);
                field574.method2654(var15);
            }
        }
        if (arg2 == 4) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var16 = class313.method7156(class311.field3236, field574.field1438);
            var16.field3318.method8494(field749.method3974(82) ? 1 : 0);
            var16.field3318.method8446(Statics.field99 + arg1);
            var16.field3318.method8501(arg3);
            var16.field3318.method8501(Statics.field481 + arg0);
            field574.method2654(var16);
        }
        if (arg2 == 22) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var17 = class313.method7156(class311.field3296, field574.field1438);
            var17.field3318.method8595(Statics.field481 + arg0);
            var17.field3318.method8595(arg3);
            var17.field3318.method8595(Statics.field99 + arg1);
            var17.field3318.method8492(field749.method3974(82) ? 1 : 0);
            field574.method2654(var17);
        }
        if (arg2 == 10) {
            class102 var18 = field569[arg3];
            if (var18 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var19 = class313.method7156(class311.field3238, field574.field1438);
                var19.field3318.method8445(field749.method3974(82) ? 1 : 0);
                var19.field3318.method8501(arg3);
                field574.method2654(var19);
            }
        }
        if (arg2 == 16) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var20 = class313.method7156(class311.field3226, field574.field1438);
            var20.field3318.method8494(field749.method3974(82) ? 1 : 0);
            var20.field3318.method8443(arg3);
            var20.field3318.method8595(Statics.field2777);
            var20.field3318.method8501(Statics.field481 + arg0);
            var20.field3318.method8447(Statics.field3998);
            var20.field3318.method8595(Statics.field5008);
            var20.field3318.method8443(Statics.field99 + arg1);
            field574.method2654(var20);
        }
        if (arg2 == 45) {
            class93 var21 = field636[arg3];
            if (var21 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var22 = class313.method7156(class311.field3270, field574.field1438);
                var22.field3318.method8494(field749.method3974(82) ? 1 : 0);
                var22.field3318.method8501(arg3);
                field574.method2654(var22);
            }
        }
        if (arg2 == 26) {
            method1135();
        }
        if (arg2 == 21) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var23 = class313.method7156(class311.field3281, field574.field1438);
            var23.field3318.method8445(field749.method3974(82) ? 1 : 0);
            var23.field3318.method8446(Statics.field99 + arg1);
            var23.field3318.method8595(Statics.field481 + arg0);
            var23.field3318.method8595(arg3);
            field574.method2654(var23);
        }
        if (arg2 == 23) {
            if (field607) {
                Statics.field5117.method4421();
            } else {
                Statics.field5117.method4358(Statics.field1861, arg0, arg1, true);
            }
        }
        if (arg2 == 2) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var24 = class313.method7156(class311.field3273, field574.field1438);
            var24.field3318.method8595(field689);
            var24.field3318.method8443(Statics.field481 + arg0);
            var24.field3318.method8443(Statics.field99 + arg1);
            var24.field3318.method8448(Statics.field1021);
            var24.field3318.method8501(arg3);
            var24.field3318.method8492(field749.method3974(82) ? 1 : 0);
            var24.field3318.method8443(field679);
            field574.method2654(var24);
        }
        if (arg2 == 7) {
            class102 var25 = field569[arg3];
            if (var25 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var26 = class313.method7156(class311.field3290, field574.field1438);
                var26.field3318.method8446(Statics.field5008);
                var26.field3318.method8448(Statics.field3998);
                var26.field3318.method8595(arg3);
                var26.field3318.method8446(Statics.field2777);
                var26.field3318.method8493(field749.method3974(82) ? 1 : 0);
                field574.method2654(var26);
            }
        }
        if (arg2 == 29) {
            class313 var27 = class313.method7156(class311.field3252, field574.field1438);
            var27.field3318.method8448(arg1);
            field574.method2654(var27);
            class350 var28 = Statics.field2621.method5681(arg1);
            if (var28 != null && var28.field3869 != null && var28.field3869[0][0] == 5) {
                int var29 = var28.field3869[0][1];
                if (class338.field3634[var29] != var28.field3871[0]) {
                    class338.field3634[var29] = var28.field3871[0];
                    method103(var29);
                }
            }
        }
        if (arg2 == 47) {
            class93 var30 = field636[arg3];
            if (var30 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var31 = class313.method7156(class311.field3288, field574.field1438);
                var31.field3318.method8501(arg3);
                var31.field3318.method8493(field749.method3974(82) ? 1 : 0);
                field574.method2654(var31);
            }
        }
        if (arg2 == 1001) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var32 = class313.method7156(class311.field3245, field574.field1438);
            var32.field3318.method8445(field749.method3974(82) ? 1 : 0);
            var32.field3318.method8446(Statics.field99 + arg1);
            var32.field3318.method8595(Statics.field481 + arg0);
            var32.field3318.method8443(arg3);
            field574.method2654(var32);
        }
        if (arg2 == 1) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var33 = class313.method7156(class311.field3254, field574.field1438);
            var33.field3318.method8501(Statics.field99 + arg1);
            var33.field3318.method8443(Statics.field5008);
            var33.field3318.method8494(field749.method3974(82) ? 1 : 0);
            var33.field3318.method8501(arg3);
            var33.field3318.method8501(Statics.field481 + arg0);
            var33.field3318.method8443(Statics.field2777);
            var33.field3318.method8447(Statics.field3998);
            field574.method2654(var33);
        }
        if (arg2 == 28) {
            class313 var34 = class313.method7156(class311.field3252, field574.field1438);
            var34.field3318.method8448(arg1);
            field574.method2654(var34);
            class350 var35 = Statics.field2621.method5681(arg1);
            if (var35 != null && var35.field3869 != null && var35.field3869[0][0] == 5) {
                int var36 = var35.field3869[0][1];
                class338.field3634[var36] = 1 - class338.field3634[var36];
                method103(var36);
            }
        }
        if (arg2 == 1004) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            class313 var37 = class313.method7156(class311.field3242, field574.field1438);
            var37.field3318.method8443(Statics.field481 + arg0);
            var37.field3318.method8443(Statics.field99 + arg1);
            var37.field3318.method8443(arg3);
            field574.method2654(var37);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class350 var38 = Statics.field2621.method5686(arg1, arg0);
            if (var38 != null) {
                method6336(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 14) {
            class93 var39 = field636[arg3];
            if (var39 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var40 = class313.method7156(class311.field3297, field574.field1438);
                var40.field3318.method8493(field749.method3974(82) ? 1 : 0);
                var40.field3318.method8595(Statics.field5008);
                var40.field3318.method8446(arg3);
                var40.field3318.method8448(Statics.field3998);
                var40.field3318.method8446(Statics.field2777);
                field574.method2654(var40);
            }
        }
        if (arg2 == 58) {
            class350 var41 = Statics.field2621.method5686(arg1, arg0);
            if (var41 != null) {
                if (var41.field3852 != null) {
                    class89 var42 = new class89();
                    var42.field1080 = var41;
                    var42.field1087 = arg3;
                    var42.field1078 = arg6;
                    var42.field1089 = var41.field3852;
                    class72.method5202(var42);
                }
                class313 var43 = class313.method7156(class311.field3237, field574.field1438);
                var43.field3318.method8604(arg1);
                var43.field3318.method8443(field689);
                var43.field3318.method8443(arg0);
                var43.field3318.method8604(Statics.field1021);
                var43.field3318.method8595(field679);
                var43.field3318.method8501(arg4);
                field574.method2654(var43);
            }
        }
        if (arg2 == 25) {
            class350 var44 = Statics.field2621.method5686(arg1, arg0);
            if (var44 != null) {
                method5234();
                method1976(arg1, arg0, class351.method5704(method450(var44)), arg4);
                field714 = 0;
                field558 = method3096(var44);
                if (field558 == null) {
                    field558 = class370.field4272;
                }
                if (var44.field3775) {
                    field802 = var44.field3824 + class103.method1026(16777215);
                } else {
                    field802 = class103.method1026(65280) + var44.field3823 + class103.method1026(16777215);
                }
            }
            return;
        }
        if (arg2 == 50) {
            class93 var45 = field636[arg3];
            if (var45 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var46 = class313.method7156(class311.field3227, field574.field1438);
                var46.field3318.method8493(field749.method3974(82) ? 1 : 0);
                var46.field3318.method8595(arg3);
                field574.method2654(var46);
            }
        }
        if (arg2 == 18) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var47 = class313.method7156(class311.field3210, field574.field1438);
            var47.field3318.method8445(field749.method3974(82) ? 1 : 0);
            var47.field3318.method8595(Statics.field481 + arg0);
            var47.field3318.method8595(arg3);
            var47.field3318.method8443(Statics.field99 + arg1);
            field574.method2654(var47);
        }
        if (arg2 == 6) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var48 = class313.method7156(class311.field3222, field574.field1438);
            var48.field3318.method8595(arg3);
            var48.field3318.method8446(Statics.field481 + arg0);
            var48.field3318.method8492(field749.method3974(82) ? 1 : 0);
            var48.field3318.method8446(Statics.field99 + arg1);
            field574.method2654(var48);
        }
        if (arg2 == 30 && field688 == null) {
            method1136(arg1, arg0);
            field688 = Statics.field2621.method5686(arg1, arg0);
            method4817(field688);
        }
        if (arg2 == 15) {
            class93 var49 = field636[arg3];
            if (var49 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var50 = class313.method7156(class311.field3239, field574.field1438);
                var50.field3318.method8448(Statics.field1021);
                var50.field3318.method8445(field749.method3974(82) ? 1 : 0);
                var50.field3318.method8446(field689);
                var50.field3318.method8446(field679);
                var50.field3318.method8595(arg3);
                field574.method2654(var50);
            }
        }
        if (arg2 == 13) {
            class102 var51 = field569[arg3];
            if (var51 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var52 = class313.method7156(class311.field3269, field574.field1438);
                var52.field3318.method8595(arg3);
                var52.field3318.method8492(field749.method3974(82) ? 1 : 0);
                field574.method2654(var52);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field4536.method8119(arg2, arg3, new class339(arg0), new class339(arg1));
        }
        if (arg2 == 48) {
            class93 var53 = field636[arg3];
            if (var53 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var54 = class313.method7156(class311.field3280, field574.field1438);
                var54.field3318.method8501(arg3);
                var54.field3318.method8493(field749.method3974(82) ? 1 : 0);
                field574.method2654(var54);
            }
        }
        if (arg2 == 8) {
            class102 var55 = field569[arg3];
            if (var55 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var56 = class313.method7156(class311.field3292, field574.field1438);
                var56.field3318.method8595(field679);
                var56.field3318.method8604(Statics.field1021);
                var56.field3318.method8595(field689);
                var56.field3318.method8445(field749.method3974(82) ? 1 : 0);
                var56.field3318.method8446(arg3);
                field574.method2654(var56);
            }
        }
        if (arg2 == 1002) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            class313 var57 = class313.method7156(class311.field3271, field574.field1438);
            var57.field3318.method8501(arg3);
            field574.method2654(var57);
        }
        if (arg2 == 19) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var58 = class313.method7156(class311.field3274, field574.field1438);
            var58.field3318.method8443(Statics.field99 + arg1);
            var58.field3318.method8595(arg3);
            var58.field3318.method8493(field749.method3974(82) ? 1 : 0);
            var58.field3318.method8443(Statics.field481 + arg0);
            field574.method2654(var58);
        }
        if (arg2 == 5) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var59 = class313.method7156(class311.field3257, field574.field1438);
            var59.field3318.method8446(Statics.field481 + arg0);
            var59.field3318.method8446(Statics.field99 + arg1);
            var59.field3318.method8443(arg3);
            var59.field3318.method8445(field749.method3974(82) ? 1 : 0);
            field574.method2654(var59);
        }
        if (arg2 == 44) {
            class93 var60 = field636[arg3];
            if (var60 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var61 = class313.method7156(class311.field3205, field574.field1438);
                var61.field3318.method8595(arg3);
                var61.field3318.method8445(field749.method3974(82) ? 1 : 0);
                field574.method2654(var61);
            }
        }
        if (arg2 == 11) {
            class102 var62 = field569[arg3];
            if (var62 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var63 = class313.method7156(class311.field3215, field574.field1438);
                var63.field3318.method8443(arg3);
                var63.field3318.method8445(field749.method3974(82) ? 1 : 0);
                field574.method2654(var63);
            }
        }
        if (arg2 == 24) {
            class350 var64 = Statics.field2621.method5681(arg1);
            if (var64 != null) {
                boolean var65 = true;
                if (var64.field3748 > 0) {
                    var65 = method2671(var64);
                }
                if (var65) {
                    class313 var66 = class313.method7156(class311.field3252, field574.field1438);
                    var66.field3318.method8448(arg1);
                    field574.method2654(var66);
                }
            }
        }
        if (arg2 == 12) {
            class102 var67 = field569[arg3];
            if (var67 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var68 = class313.method7156(class311.field3231, field574.field1438);
                var68.field3318.method8493(field749.method3974(82) ? 1 : 0);
                var68.field3318.method8595(arg3);
                field574.method2654(var68);
            }
        }
        if (arg2 == 49) {
            class93 var69 = field636[arg3];
            if (var69 != null) {
                field555 = arg7;
                field596 = arg8;
                field556 = 2;
                field631 = 0;
                field762 = arg0;
                field763 = arg1;
                class313 var70 = class313.method7156(class311.field3299, field574.field1438);
                var70.field3318.method8595(arg3);
                var70.field3318.method8493(field749.method3974(82) ? 1 : 0);
                field574.method2654(var70);
            }
        }
        if (arg2 == 20) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var71 = class313.method7156(class311.field3265, field574.field1438);
            var71.field3318.method8501(Statics.field481 + arg0);
            var71.field3318.method8595(arg3);
            var71.field3318.method8443(Statics.field99 + arg1);
            var71.field3318.method8493(field749.method3974(82) ? 1 : 0);
            field574.method2654(var71);
        }
        if (arg2 == 17) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            field762 = arg0;
            field763 = arg1;
            class313 var72 = class313.method7156(class311.field3230, field574.field1438);
            var72.field3318.method8448(Statics.field1021);
            var72.field3318.method8595(arg3);
            var72.field3318.method8446(Statics.field481 + arg0);
            var72.field3318.method8446(field679);
            var72.field3318.method8443(Statics.field99 + arg1);
            var72.field3318.method8443(field689);
            var72.field3318.method8445(field749.method3974(82) ? 1 : 0);
            field574.method2654(var72);
        }
        if (arg2 == 1003) {
            field555 = arg7;
            field596 = arg8;
            field556 = 2;
            field631 = 0;
            class102 var73 = field569[arg3];
            if (var73 != null) {
                class208 var74 = var73.field1333;
                if (var74.field2139 != null) {
                    var74 = var74.method3534();
                }
                if (var74 != null) {
                    class313 var75 = class313.method7156(class311.field3248, field574.field1438);
                    var75.field3318.method8501(var74.field2111);
                    field574.method2654(var75);
                }
            }
        }
        if (field714 != 0) {
            field714 = 0;
            method4817(Statics.field2621.method5681(Statics.field3998));
        }
        if (field678) {
            method5234();
        }
    }

    @ObfuscatedName("rq.ln(ILjava/lang/String;B)V")
    public static void method7552(int arg0, String arg1) {
        int var2 = class109.field1398;
        int[] var3 = class109.field1387;
        boolean var4 = false;
        class558 var5 = new class558(arg1, Statics.field1527);
        for (int var6 = 0; var6 < var2; var6++) {
            class93 var7 = field636[var3[var6]];
            if (var7 != null && Statics.field1608 != var7 && var7.field1142 != null && var7.field1142.equals(var5)) {
                if (arg0 == 1) {
                    class313 var8 = class313.method7156(class311.field3205, field574.field1438);
                    var8.field3318.method8595(var3[var6]);
                    var8.field3318.method8445(0);
                    field574.method2654(var8);
                } else if (arg0 == 4) {
                    class313 var9 = class313.method7156(class311.field3288, field574.field1438);
                    var9.field3318.method8501(var3[var6]);
                    var9.field3318.method8493(0);
                    field574.method2654(var9);
                } else if (arg0 == 6) {
                    class313 var10 = class313.method7156(class311.field3299, field574.field1438);
                    var10.field3318.method8595(var3[var6]);
                    var10.field3318.method8493(0);
                    field574.method2654(var10);
                } else if (arg0 == 7) {
                    class313 var11 = class313.method7156(class311.field3227, field574.field1438);
                    var11.field3318.method8493(0);
                    var11.field3318.method8595(var3[var6]);
                    field574.method2654(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class112.method2177(4, "", class370.field4216 + arg1);
        }
    }

    @ObfuscatedName("co.lq(IIIII)V")
    public static void method1976(int arg0, int arg1, int arg2, int arg3) {
        class350 var4 = Statics.field2621.method5686(arg0, arg1);
        if (var4 != null && var4.field3842 != null) {
            class89 var5 = new class89();
            var5.field1080 = var4;
            var5.field1089 = var4.field3842;
            class72.method5202(var5);
        }
        field689 = arg3;
        field678 = true;
        Statics.field1021 = arg0;
        field679 = arg1;
        Statics.field3906 = arg2;
        method4817(var4);
    }

    @ObfuscatedName("lz.la(B)V")
    public static void method5234() {
        if (!field678) {
            return;
        }
        class350 var0 = Statics.field2621.method5686(Statics.field1021, field679);
        if (var0 != null && var0.field3795 != null) {
            class89 var1 = new class89();
            var1.field1080 = var0;
            var1.field1089 = var0.field3795;
            class72.method5202(var1);
        }
        field689 = -1;
        field678 = false;
        method4817(var0);
    }

    @ObfuscatedName("cu.ld(IIB)V")
    public static void method1136(int arg0, int arg1) {
        class313 var2 = class313.method7156(class311.field3243, field574.field1438);
        var2.field3318.method8448(arg0);
        var2.field3318.method8443(arg1);
        field574.method2654(var2);
    }

    @ObfuscatedName("oc.lr(IIIILjava/lang/String;I)V")
    public static void method6336(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class350 var5 = Statics.field2621.method5686(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3851 != null) {
            class89 var6 = new class89();
            var6.field1080 = var5;
            var6.field1087 = arg0;
            var6.field1078 = arg4;
            var6.field1089 = var5.field3851;
            class72.method5202(var6);
        }
        boolean var7 = true;
        if (var5.field3748 > 0) {
            var7 = method2671(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method450(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class313 var11 = class313.method7156(class311.field3219, field574.field1438);
            var11.field3318.method8448(arg1);
            var11.field3318.method8446(arg2);
            var11.field3318.method8446(arg3);
            field574.method2654(var11);
        }
        if (arg0 == 2) {
            class313 var12 = class313.method7156(class311.field3294, field574.field1438);
            var12.field3318.method8448(arg1);
            var12.field3318.method8446(arg2);
            var12.field3318.method8446(arg3);
            field574.method2654(var12);
        }
        if (arg0 == 3) {
            class313 var13 = class313.method7156(class311.field3259, field574.field1438);
            var13.field3318.method8448(arg1);
            var13.field3318.method8446(arg2);
            var13.field3318.method8446(arg3);
            field574.method2654(var13);
        }
        if (arg0 == 4) {
            class313 var14 = class313.method7156(class311.field3250, field574.field1438);
            var14.field3318.method8448(arg1);
            var14.field3318.method8446(arg2);
            var14.field3318.method8446(arg3);
            field574.method2654(var14);
        }
        if (arg0 == 5) {
            class313 var15 = class313.method7156(class311.field3258, field574.field1438);
            var15.field3318.method8448(arg1);
            var15.field3318.method8446(arg2);
            var15.field3318.method8446(arg3);
            field574.method2654(var15);
        }
        if (arg0 == 6) {
            class313 var16 = class313.method7156(class311.field3224, field574.field1438);
            var16.field3318.method8448(arg1);
            var16.field3318.method8446(arg2);
            var16.field3318.method8446(arg3);
            field574.method2654(var16);
        }
        if (arg0 == 7) {
            class313 var17 = class313.method7156(class311.field3223, field574.field1438);
            var17.field3318.method8448(arg1);
            var17.field3318.method8446(arg2);
            var17.field3318.method8446(arg3);
            field574.method2654(var17);
        }
        if (arg0 == 8) {
            class313 var18 = class313.method7156(class311.field3218, field574.field1438);
            var18.field3318.method8448(arg1);
            var18.field3318.method8446(arg2);
            var18.field3318.method8446(arg3);
            field574.method2654(var18);
        }
        if (arg0 == 9) {
            class313 var19 = class313.method7156(class311.field3291, field574.field1438);
            var19.field3318.method8448(arg1);
            var19.field3318.method8446(arg2);
            var19.field3318.method8446(arg3);
            field574.method2654(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class313 var20 = class313.method7156(class311.field3263, field574.field1438);
        var20.field3318.method8448(arg1);
        var20.field3318.method8446(arg2);
        var20.field3318.method8446(arg3);
        field574.method2654(var20);
    }

    @ObfuscatedName("co.lc(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1975(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method1984(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("fe.ls(Ljava/lang/String;Ljava/lang/String;IIIIII)V")
    public static final void method2926(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method1984(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("cz.li(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method1984(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field607 || field660 >= 500) {
            return;
        }
        field585[field660] = arg0;
        field667[field660] = arg1;
        field663[field660] = arg2;
        field664[field660] = arg3;
        field661[field660] = arg4;
        field662[field660] = arg5;
        field603[field660] = arg6;
        field695[field660] = arg7;
        field660++;
    }

    @ObfuscatedName("iv.ly(IB)Ljava/lang/String;")
    public static String method3947(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field667[arg0].length() > 0) {
            return field585[arg0] + class370.field4024 + field667[arg0];
        } else {
            return field585[arg0];
        }
    }

    @ObfuscatedName("ct.lt(Ldk;IIII)V")
    public static final void method1071(class102 arg0, int arg1, int arg2, int arg3) {
        class208 var4 = arg0.field1333;
        if (field660 >= 400) {
            return;
        }
        if (var4.field2139 != null) {
            var4 = var4.method3534();
        }
        if (var4 == null || !var4.field2142 || var4.field2135 && field734 != arg1) {
            return;
        }
        String var5 = arg0.method2472();
        if (var4.field2132 != 0 && arg0.field1276 != 0) {
            int var6 = arg0.field1276 == -1 ? var4.field2132 : arg0.field1276;
            int var8 = Statics.field1608.field1127;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class103.method1026(16711680);
            } else if (var9 < -6) {
                var10 = class103.method1026(16723968);
            } else if (var9 < -3) {
                var10 = class103.method1026(16740352);
            } else if (var9 < 0) {
                var10 = class103.method1026(16756736);
            } else if (var9 > 9) {
                var10 = class103.method1026(65280);
            } else if (var9 > 6) {
                var10 = class103.method1026(4259584);
            } else if (var9 > 3) {
                var10 = class103.method1026(8453888);
            } else if (var9 > 0) {
                var10 = class103.method1026(12648192);
            } else {
                var10 = class103.method1026(16776960);
            }
            var5 = var5 + var10 + " " + class103.field1344 + class370.field4034 + var6 + class103.field1341;
        }
        if (var4.field2107 && field669) {
            method1975(class370.field4174, class103.method1026(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field714 == 1) {
            method1975(class370.field4173, field677 + " " + class103.field1346 + " " + class103.method1026(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field678) {
            int var11 = var4.field2107 && field669 ? 2000 : 0;
            String[] var12 = var4.field2121;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (arg0.method2471(var13) && var12[var13] != null && !var12[var13].equalsIgnoreCase(class370.field4259)) {
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
                        method1975(var12[var13], class103.method1026(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (arg0.method2471(var15) && var12[var15] != null && var12[var15].equalsIgnoreCase(class370.field4259)) {
                        short var16 = 0;
                        if (field539 != class105.field1360) {
                            if (field539 == class105.field1358 || field539 == class105.field1362 && var4.field2132 > Statics.field1608.field1127) {
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
                            method1975(var12[var15], class103.method1026(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field2107 || !field669) {
                method1975(class370.field4174, class103.method1026(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field3906 & 0x2) == 2) {
            method1975(field558, field802 + " " + class103.field1346 + " " + class103.method1026(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ih.ll(Ldi;IIIB)V")
    public static final void method3671(class93 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1608 == arg0 || field660 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1128 == 0) {
            String var4 = arg0.field1126[0] + arg0.field1142 + arg0.field1126[1];
            int var5 = arg0.field1127;
            int var6 = Statics.field1608.field1127;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class103.method1026(16711680);
            } else if (var7 < -6) {
                var8 = class103.method1026(16723968);
            } else if (var7 < -3) {
                var8 = class103.method1026(16740352);
            } else if (var7 < 0) {
                var8 = class103.method1026(16756736);
            } else if (var7 > 9) {
                var8 = class103.method1026(65280);
            } else if (var7 > 6) {
                var8 = class103.method1026(4259584);
            } else if (var7 > 3) {
                var8 = class103.method1026(8453888);
            } else if (var7 > 0) {
                var8 = class103.method1026(12648192);
            } else {
                var8 = class103.method1026(16776960);
            }
            var9 = var4 + var8 + " " + class103.field1344 + class370.field4034 + arg0.field1127 + class103.field1341 + arg0.field1126[2];
        } else {
            var9 = arg0.field1126[0] + arg0.field1142 + arg0.field1126[1] + " " + class103.field1344 + class370.field4218 + arg0.field1128 + class103.field1341 + arg0.field1126[2];
        }
        if (field714 == 1) {
            method1975(class370.field4173, field677 + " " + class103.field1346 + " " + class103.method1026(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field678) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field665[var10] != null) {
                    short var11 = 0;
                    if (field665[var10].equalsIgnoreCase(class370.field4259)) {
                        if (field538 == class105.field1360) {
                            continue;
                        }
                        if (field538 == class105.field1358 || field538 == class105.field1362 && arg0.field1127 > Statics.field1608.field1127) {
                            var11 = 2000;
                        }
                        if (Statics.field1608.field1151 == 0 || arg0.field1151 == 0) {
                            if (field538 == class105.field1361 && arg0.method2271()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field1608.field1151 == arg0.field1151) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field647[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field649[var10] + var11;
                    method1975(field665[var10], class103.method1026(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field3906 & 0x8) == 8) {
            method1975(field558, field802 + " " + class103.field1346 + " " + class103.method1026(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field660; var14++) {
            if (field663[var14] == 23) {
                field667[var14] = class103.method1026(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("et.lp(IIIIIIIII)V")
    public static final void method2639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.field2621.method5685(arg0)) {
            Statics.field3600 = null;
            method272(Statics.field2621.field3646[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3600 != null) {
                method272(Statics.field3600, -1412584499, arg1, arg2, arg3, arg4, Statics.field3041, Statics.field2045, arg7);
                Statics.field3600 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field733[var8] = true;
            }
        } else {
            field733[arg7] = true;
        }
    }

    @ObfuscatedName("aa.le([Lnt;IIIIIIIIB)V")
    public static final void method272(class350[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class545.method8801(arg2, arg3, arg4, arg5);
        class243.method4214();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class350 var10 = arg0[var9];
            if (var10 != null && (var10.field3796 == arg1 || arg1 == -1412584499 && field618 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field736[field731] = var10.field3757 + arg6;
                    field737[field731] = var10.field3758 + arg7;
                    field738[field731] = var10.field3759;
                    field681[field731] = var10.field3760;
                    var11 = ++field731 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3888 = var11;
                var10.field3820 = field523;
                if (!var10.field3775 || !method7223(var10)) {
                    if (var10.field3748 > 0) {
                        method4188(var10);
                    }
                    int var12 = var10.field3757 + arg6;
                    int var13 = var10.field3758 + arg7;
                    int var14 = var10.field3815;
                    if (field618 == var10) {
                        if (arg1 != -1412584499 && !var10.field3747) {
                            Statics.field3600 = arg0;
                            Statics.field3041 = arg6;
                            Statics.field2045 = arg7;
                            continue;
                        }
                        if (field706 && field700) {
                            int var15 = class36.field217;
                            int var16 = class36.field218;
                            int var17 = var15 - field697;
                            int var18 = var16 - field698;
                            if (var17 < field701) {
                                var17 = field701;
                            }
                            if (var10.field3759 + var17 > field701 + field696.field3759) {
                                var17 = field701 + field696.field3759 - var10.field3759;
                            }
                            if (var18 < field702) {
                                var18 = field702;
                            }
                            if (var10.field3760 + var18 > field702 + field696.field3760) {
                                var18 = field702 + field696.field3760 - var10.field3760;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3747) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3829 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3759 + var12;
                        int var22 = var10.field3760 + var13;
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
                        int var29 = var10.field3759 + var12;
                        int var30 = var10.field3760 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3775 || var25 < var27 && var26 < var28) {
                        if (var10.field3748 != 0) {
                            if (var10.field3748 == 1336) {
                                if (Statics.field1336.method2354()) {
                                    var13 += 15;
                                    Statics.field3468.method7035("Fps:" + field175, var10.field3759 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field658) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3468.method7035("Mem:" + var32 + "k", var10.field3759 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3748 == 1337) {
                                field672 = var12;
                                field673 = var13;
                                method5167(var12, var13, var10.field3759, var10.field3760);
                                field733[var10.field3888] = true;
                                class545.method8801(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3748 == 1338) {
                                method3242(var10, var12, var13, var11);
                                class545.method8801(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3748 == 1339) {
                                method4734(var10, var12, var13, var11);
                                class545.method8801(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3748 == 1400) {
                                Statics.field4536.method7959(var12, var13, var10.field3759, var10.field3760, field523, Statics.field1336.method2358());
                            }
                            if (var10.field3748 == 1401) {
                                Statics.field4536.method7963(var12, var13, var10.field3759, var10.field3760);
                            }
                            if (var10.field3748 == 1402) {
                                Statics.field421.method2323(var12, field523);
                            }
                        }
                        if (var10.field3829 == 0) {
                            if (!var10.field3775 && method7223(var10) && Statics.field2907 != var10) {
                                continue;
                            }
                            if (!var10.field3775) {
                                if (var10.field3766 > var10.field3768 - var10.field3760) {
                                    var10.field3766 = var10.field3768 - var10.field3760;
                                }
                                if (var10.field3766 < 0) {
                                    var10.field3766 = 0;
                                }
                            }
                            method272(arg0, var10.field3769, var25, var26, var27, var28, var12 - var10.field3742, var13 - var10.field3766, var11);
                            if (var10.field3862 != null) {
                                method272(var10.field3862, var10.field3769, var25, var26, var27, var28, var12 - var10.field3742, var13 - var10.field3766, var11);
                            }
                            class88 var34 = (class88) field684.method8206((long) var10.field3769);
                            if (var34 != null) {
                                method2639(var34.field1075, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class545.method8801(arg2, arg3, arg4, arg5);
                            class243.method4214();
                        } else if (var10.field3829 == 11) {
                            if (method7223(var10) && Statics.field2907 != var10) {
                                continue;
                            }
                            if (var10.field3862 != null) {
                                method272(var10.field3862, var10.field3769, var25, var26, var27, var28, var12 - var10.field3742, var13 - var10.field3766, var11);
                            }
                            class545.method8801(arg2, arg3, arg4, arg5);
                            class243.method4214();
                        }
                        if (field742 || field735[var11] || field740 > 1) {
                            if (var10.field3829 == 0 && !var10.field3775 && var10.field3768 > var10.field3760) {
                                method74(var10.field3759 + var12, var13, var10.field3766, var10.field3760, var10.field3768);
                            }
                            if (var10.field3829 != 1) {
                                if (var10.field3829 == 3) {
                                    int var35;
                                    if (Statics.method795(var10)) {
                                        var35 = var10.field3770;
                                        if (Statics.field2907 == var10 && var10.field3772 != 0) {
                                            var35 = var10.field3772;
                                        }
                                    } else {
                                        var35 = var10.field3886;
                                        if (Statics.field2907 == var10 && var10.field3828 != 0) {
                                            var35 = var10.field3828;
                                        }
                                    }
                                    if (var10.field3773) {
                                        switch(var10.field3774.field5319) {
                                            case 1:
                                                class545.method8785(var12, var13, var10.field3759, var10.field3760, var10.field3886, var10.field3770);
                                                break;
                                            case 2:
                                                class545.method8786(var12, var13, var10.field3759, var10.field3760, var10.field3886, var10.field3770, 255 - (var10.field3815 & 0xFF), 255 - (var10.field3873 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class545.method8784(var12, var13, var10.field3759, var10.field3760, var35);
                                                } else {
                                                    class545.method8783(var12, var13, var10.field3759, var10.field3760, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class545.method8825(var12, var13, var10.field3759, var10.field3760, var35);
                                    } else {
                                        class545.method8789(var12, var13, var10.field3759, var10.field3760, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3829 == 4) {
                                    class414 var36 = var10.method6056(Statics.field2621);
                                    if (var36 != null) {
                                        String var37 = var10.field3807;
                                        int var38;
                                        if (Statics.method795(var10)) {
                                            var38 = var10.field3770;
                                            if (Statics.field2907 == var10 && var10.field3772 != 0) {
                                                var38 = var10.field3772;
                                            }
                                            if (var10.field3808.length() > 0) {
                                                var37 = var10.field3808;
                                            }
                                        } else {
                                            var38 = var10.field3886;
                                            if (Statics.field2907 == var10 && var10.field3828 != 0) {
                                                var38 = var10.field3828;
                                            }
                                        }
                                        if (var10.field3775 && var10.field3877 != -1) {
                                            class223 var39 = class223.method87(var10.field3877);
                                            var37 = var39.field2341;
                                            if (var37 == null) {
                                                var37 = class370.field4272;
                                            }
                                            if ((var39.field2323 == 1 || var10.field3776 != 1) && var10.field3776 != -1) {
                                                var37 = class103.method1026(16748608) + var37 + class103.field1348 + " " + 'x' + method3093(var10.field3776);
                                            }
                                        }
                                        if (field688 == var10) {
                                            var37 = class370.field4181;
                                            var38 = var10.field3886;
                                        }
                                        if (!var10.field3775) {
                                            var37 = method2983(var37, var10);
                                        }
                                        var36.method7022(var37, var12, var13, var10.field3759, var10.field3760, var38, var10.field3812 ? 0 : -1, class487.method7843(var10.field3815), var10.field3810, var10.field3880, var10.field3809);
                                    } else if (class350.field3741) {
                                        method4817(var10);
                                    }
                                } else if (var10.field3829 == 5) {
                                    if (var10.field3775) {
                                        class549 var41;
                                        if (var10.field3877 == -1) {
                                            var41 = var10.method6051(Statics.field2621, false, Statics.field1180);
                                        } else {
                                            var41 = class223.method3442(var10.field3877, var10.field3776, var10.field3893, var10.field3874, var10.field3805, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5332;
                                            int var43 = var41.field5335;
                                            if (var10.field3783) {
                                                class545.method8777(var12, var13, var10.field3759 + var12, var10.field3760 + var13);
                                                int var44 = (var10.field3759 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3760 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3782 != 0) {
                                                            var41.method8963(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3782, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method8900(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method8906(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class545.method8801(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3759 * 4096 / var42;
                                                if (var10.field3782 != 0) {
                                                    var41.method8963(var10.field3759 / 2 + var12, var10.field3760 / 2 + var13, var10.field3782, var48);
                                                } else if (var14 != 0) {
                                                    var41.method8908(var12, var13, var10.field3759, var10.field3760, 256 - (var14 & 0xFF));
                                                } else if (var10.field3759 == var42 && var10.field3760 == var43) {
                                                    var41.method8900(var12, var13);
                                                } else {
                                                    var41.method8902(var12, var13, var10.field3759, var10.field3760);
                                                }
                                            }
                                        } else if (class350.field3741) {
                                            method4817(var10);
                                        }
                                    } else {
                                        class549 var40 = var10.method6051(Statics.field2621, Statics.method795(var10), Statics.field1180);
                                        if (var40 != null) {
                                            var40.method8900(var12, var13);
                                        } else if (class350.field3741) {
                                            method4817(var10);
                                        }
                                    }
                                } else if (var10.field3829 == 6) {
                                    boolean var49 = Statics.method795(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3793;
                                    } else {
                                        var50 = var10.field3792;
                                    }
                                    class256 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3877 != -1) {
                                        class223 var53 = class223.method87(var10.field3877);
                                        if (var53 != null) {
                                            class223 var54 = var53.method3812(var10.field3776);
                                            var51 = var54.method3811(1);
                                            if (var51 == null) {
                                                method4817(var10);
                                            } else {
                                                var51.method4590();
                                                var52 = var51.field2716 / 2;
                                            }
                                        }
                                    } else if (var10.field3784 == 5) {
                                        if (var10.field3849 == 0) {
                                            var51 = field799.method5729((class225) null, -1, (class225) null, -1);
                                        } else {
                                            var51 = Statics.field1608.method1979();
                                        }
                                    } else if (var10.field3784 == 7) {
                                        var51 = var10.field3802.method5729((class225) null, -1, class225.method288(Statics.field1608.field1206), Statics.field1608.field1242);
                                    } else {
                                        class207 var55 = null;
                                        if (var10.field3784 == 6) {
                                            int var56 = var10.field3849;
                                            if (var56 >= 0 && var56 < field569.length) {
                                                class102 var57 = field569[var56];
                                                if (var57 != null && var57.field1333 != null) {
                                                    int var58 = var57.field1333.method3542();
                                                    if (var58 != -1) {
                                                        var10.field3849 = var58;
                                                    }
                                                    var55 = var57.method2481();
                                                }
                                            }
                                        } else if (var10.field3784 == 2) {
                                            int var59 = var10.field3849;
                                            int var60 = class208.method2790(var59).method3542();
                                            if (var60 != -1) {
                                                var10.field3849 = var60;
                                            }
                                        }
                                        class225 var61 = null;
                                        int var62 = -1;
                                        if (var50 != -1) {
                                            var61 = class225.method288(var50);
                                            var62 = var10.field3879;
                                        }
                                        var51 = var10.method6057(Statics.field2621, var61, var62, var49, Statics.field1608.field1123, var55);
                                        if (var51 == null && class350.field3741) {
                                            method4817(var10);
                                        }
                                    }
                                    class243.method4217(var10.field3759 / 2 + var12, var10.field3760 / 2 + var13);
                                    int var63 = var10.field3844 * class243.field2616[var10.field3763] >> 16;
                                    int var64 = var10.field3844 * class243.field2613[var10.field3763] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3775) {
                                            var51.method4590();
                                            if (var10.field3803) {
                                                var51.method4608(0, var10.field3797, var10.field3798, var10.field3763, var10.field3794, var10.field3765 + var52 + var63, var10.field3765 + var64, var10.field3844);
                                            } else {
                                                var51.method4664(0, var10.field3797, var10.field3798, var10.field3763, var10.field3794, var10.field3765 + var52 + var63, var10.field3765 + var64);
                                            }
                                        } else {
                                            var51.method4664(0, var10.field3797, 0, var10.field3763, 0, var63, var64);
                                        }
                                    }
                                    class243.method4216();
                                } else {
                                    if (var10.field3829 == 8 && Statics.field3138 == var10 && field674 == field623) {
                                        int var65 = 0;
                                        int var66 = 0;
                                        class414 var67 = Statics.field3468;
                                        String var68 = var10.field3807;
                                        String var69 = method2983(var68, var10);
                                        while (var69.length() > 0) {
                                            int var70 = var69.indexOf(class103.field1349);
                                            String var71;
                                            if (var70 == -1) {
                                                var71 = var69;
                                                var69 = "";
                                            } else {
                                                var71 = var69.substring(0, var70);
                                                var69 = var69.substring(var70 + 4);
                                            }
                                            int var72 = var67.method7062(var71);
                                            if (var72 > var65) {
                                                var65 = var72;
                                            }
                                            var66 += var67.field4617 + 1;
                                        }
                                        var65 += 6;
                                        var66 += 7;
                                        int var73 = var10.field3759 + var12 - 5 - var65;
                                        int var74 = var10.field3760 + var13 + 5;
                                        if (var73 < var12 + 5) {
                                            var73 = var12 + 5;
                                        }
                                        if (var65 + var73 > arg4) {
                                            var73 = arg4 - var65;
                                        }
                                        if (var66 + var74 > arg5) {
                                            var74 = arg5 - var66;
                                        }
                                        class545.method8784(var73, var74, var65, var66, 16777120);
                                        class545.method8825(var73, var74, var65, var66, 0);
                                        String var75 = var10.field3807;
                                        int var76 = var67.field4617 + var74 + 2;
                                        String var77 = method2983(var75, var10);
                                        while (var77.length() > 0) {
                                            int var78 = var77.indexOf(class103.field1349);
                                            String var79;
                                            if (var78 == -1) {
                                                var79 = var77;
                                                var77 = "";
                                            } else {
                                                var79 = var77.substring(0, var78);
                                                var77 = var77.substring(var78 + 4);
                                            }
                                            var67.method7017(var79, var73 + 3, var76, 0, -1);
                                            var76 += var67.field4617 + 1;
                                        }
                                    }
                                    if (var10.field3829 == 9) {
                                        int var80;
                                        int var81;
                                        int var82;
                                        int var83;
                                        if (var10.field3863) {
                                            var80 = var12;
                                            var81 = var10.field3760 + var13;
                                            var82 = var10.field3759 + var12;
                                            var83 = var13;
                                        } else {
                                            var80 = var12;
                                            var81 = var13;
                                            var82 = var10.field3759 + var12;
                                            var83 = var10.field3760 + var13;
                                        }
                                        if (var10.field3777 == 1) {
                                            class545.method8793(var80, var81, var82, var83, var10.field3886);
                                        } else {
                                            method5160(var80, var81, var82, var83, var10.field3886, var10.field3777);
                                        }
                                    } else if (var10.field3829 == 12) {
                                        class348 var84 = var10.method6067();
                                        class342 var85 = var10.method6099();
                                        if (var84 != null && var85 != null && var84.method5913()) {
                                            class414 var86 = var10.method6056(Statics.field2621);
                                            if (var86 != null) {
                                                field725.method9056(var12, var13, var10.field3759, var10.field3760, var84.method5873(), var84.method5822(), var84.method5910(), var84.method5959(), var84.method6016());
                                                int var87 = var10.field3812 ? var10.field3874 : -1;
                                                if (!var84.method5859() && var84.method5812().method6924()) {
                                                    field725.method9057(var85.field3658, var87, var85.field3656, var85.field3657);
                                                    field725.method9058(var84.method5813(), var86);
                                                } else {
                                                    field725.method9057(var10.field3886, var87, var85.field3656, var85.field3657);
                                                    field725.method9058(var84.method5812(), var86);
                                                }
                                                class545.method8801(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("kq.lf(IIIIIII)V")
    public static final void method5160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class545.field5309;
        int var18 = arg1 - class545.field5307;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class243.method4218(var19, var20, var21);
        class243.method4220(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class243.method4218(var19, var21, var22);
        class243.method4220(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("fj.lu(Ljava/lang/String;Lnt;I)Ljava/lang/String;")
    public static String method2983(String arg0, class350 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2996(arg1, var2 - 1);
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

    @ObfuscatedName("gr.lo(IB)Ljava/lang/String;")
    public static final String method3093(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class103.field1342 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class103.method1026(65408) + var1.substring(0, var1.length() - 8) + class370.field4184 + " " + class103.field1344 + var1 + class103.field1341 + class103.field1348;
        } else if (var1.length() > 6) {
            return " " + class103.method1026(16777215) + var1.substring(0, var1.length() - 4) + class370.field4186 + " " + class103.field1344 + var1 + class103.field1341 + class103.field1348;
        } else {
            return " " + class103.method1026(16776960) + var1 + class103.field1348;
        }
    }

    @ObfuscatedName("client.lw(ZI)V")
    public final void method1165(boolean arg0) {
        method2276(field683, Statics.field1700, Statics.field3661, arg0);
    }

    @ObfuscatedName("client.lk(Lnt;B)V")
    public void method1369(class350 arg0) {
        class350 var2 = arg0.field3796 == -1 ? null : Statics.field2621.method5681(arg0.field3796);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1700;
            var4 = Statics.field3661;
        } else {
            var3 = var2.field3759;
            var4 = var2.field3760;
        }
        method2277(arg0, var3, var4, false);
        method4825(arg0, var3, var4);
    }

    @ObfuscatedName("vb.mh([Lnt;Lnt;ZI)V")
    public static void method9048(class350[] arg0, class350 arg1, boolean arg2) {
        int var3 = arg1.field3817 == 0 ? arg1.field3759 : arg1.field3817;
        int var4 = arg1.field3768 == 0 ? arg1.field3760 : arg1.field3768;
        method8337(arg0, arg1.field3769, var3, var4, arg2);
        if (arg1.field3862 != null) {
            method8337(arg1.field3862, arg1.field3769, var3, var4, arg2);
        }
        class88 var5 = (class88) field684.method8206((long) arg1.field3769);
        if (var5 != null) {
            method2276(var5.field1075, var3, var4, arg2);
        }
        if (arg1.field3748 == 1337) {
        }
    }

    @ObfuscatedName("dq.mi(IIIZI)V")
    public static final void method2276(int arg0, int arg1, int arg2, boolean arg3) {
        if (Statics.field2621.method5685(arg0)) {
            method8337(Statics.field2621.field3646[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ud.mf([Lnt;IIIZB)V")
    public static void method8337(class350[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class350 var6 = arg0[var5];
            if (var6 != null && var6.field3796 == arg1) {
                method2277(var6, arg2, arg3, arg4);
                method4825(var6, arg2, arg3);
                if (var6.field3742 > var6.field3817 - var6.field3759) {
                    var6.field3742 = var6.field3817 - var6.field3759;
                }
                if (var6.field3742 < 0) {
                    var6.field3742 = 0;
                }
                if (var6.field3766 > var6.field3768 - var6.field3760) {
                    var6.field3766 = var6.field3768 - var6.field3760;
                }
                if (var6.field3766 < 0) {
                    var6.field3766 = 0;
                }
                if (var6.field3829 == 0) {
                    method9048(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("dy.mo(Lnt;IIZI)V")
    public static void method2277(class350 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3759;
        int var5 = arg0.field3760;
        if (arg0.field3751 == 0) {
            arg0.field3759 = arg0.field3755;
        } else if (arg0.field3751 == 1) {
            arg0.field3759 = arg1 - arg0.field3755;
        } else if (arg0.field3751 == 2) {
            arg0.field3759 = arg0.field3755 * arg1 >> 14;
        }
        if (arg0.field3752 == 0) {
            arg0.field3760 = arg0.field3756;
        } else if (arg0.field3752 == 1) {
            arg0.field3760 = arg2 - arg0.field3756;
        } else if (arg0.field3752 == 2) {
            arg0.field3760 = arg0.field3756 * arg2 >> 14;
        }
        if (arg0.field3751 == 4) {
            arg0.field3759 = arg0.field3761 * arg0.field3760 / arg0.field3832;
        }
        if (arg0.field3752 == 4) {
            arg0.field3760 = arg0.field3832 * arg0.field3759 / arg0.field3761;
        }
        if (arg0.field3748 == 1337) {
            field694 = arg0;
        }
        if (arg0.field3829 == 12) {
            arg0.method6067().method5769(arg0.field3759, arg0.field3760);
        }
        if (arg3 && arg0.field3789 != null && (arg0.field3759 != var4 || arg0.field3760 != var5)) {
            class89 var6 = new class89();
            var6.field1080 = arg0;
            var6.field1089 = arg0.field3789;
            field726.method6581(var6);
        }
    }

    @ObfuscatedName("ka.ma(Lnt;III)V")
    public static void method4825(class350 arg0, int arg1, int arg2) {
        if (arg0.field3749 == 0) {
            arg0.field3757 = arg0.field3753;
        } else if (arg0.field3749 == 1) {
            arg0.field3757 = (arg1 - arg0.field3759) / 2 + arg0.field3753;
        } else if (arg0.field3749 == 2) {
            arg0.field3757 = arg1 - arg0.field3759 - arg0.field3753;
        } else if (arg0.field3749 == 3) {
            arg0.field3757 = arg0.field3753 * arg1 >> 14;
        } else if (arg0.field3749 == 4) {
            arg0.field3757 = (arg0.field3753 * arg1 >> 14) + (arg1 - arg0.field3759) / 2;
        } else {
            arg0.field3757 = arg1 - arg0.field3759 - (arg0.field3753 * arg1 >> 14);
        }
        if (arg0.field3750 == 0) {
            arg0.field3758 = arg0.field3732;
        } else if (arg0.field3750 == 1) {
            arg0.field3758 = (arg2 - arg0.field3760) / 2 + arg0.field3732;
        } else if (arg0.field3750 == 2) {
            arg0.field3758 = arg2 - arg0.field3760 - arg0.field3732;
        } else if (arg0.field3750 == 3) {
            arg0.field3758 = arg0.field3732 * arg2 >> 14;
        } else if (arg0.field3750 == 4) {
            arg0.field3758 = (arg0.field3732 * arg2 >> 14) + (arg2 - arg0.field3760) / 2;
        } else {
            arg0.field3758 = arg2 - arg0.field3760 - (arg0.field3732 * arg2 >> 14);
        }
    }

    @ObfuscatedName("ff.mc(Lnt;IIIIIII)V")
    public static final void method2873(class350 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field602) {
            field537 = 32;
        } else {
            field537 = 0;
        }
        field602 = false;
        if (class36.field210 == 1 || !Statics.field4580 && class36.field210 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3766 -= 4;
                method4817(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3766 += 4;
                method4817(arg0);
            } else if (arg5 >= arg1 - field537 && arg5 < field537 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3766 = (arg4 - arg3) * var8 / var9;
                method4817(arg0);
                field602 = true;
            }
        }
        if (field553 == 0) {
            return;
        }
        int var10 = arg0.field3759;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3766 += field553 * 45;
            method4817(arg0);
        }
    }

    @ObfuscatedName("al.mp(IIIIIB)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field839[0].method8868(arg0, arg1);
        Statics.field839[1].method8868(arg0, arg1 + arg3 - 16);
        class545.method8784(arg0, arg1 + 16, 16, arg3 - 32, field561);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class545.method8784(arg0, arg1 + 16 + var6, 16, var5, field591);
        class545.method8817(arg0, arg1 + 16 + var6, var5, field593);
        class545.method8817(arg0 + 1, arg1 + 16 + var6, var5, field593);
        class545.method8773(arg0, arg1 + 16 + var6, 16, field593);
        class545.method8773(arg0, arg1 + 17 + var6, 16, field593);
        class545.method8817(arg0 + 15, arg1 + 16 + var6, var5, field625);
        class545.method8817(arg0 + 14, arg1 + 17 + var6, var5 - 1, field625);
        class545.method8773(arg0, arg1 + 15 + var6 + var5, 16, field625);
        class545.method8773(arg0 + 1, arg1 + 14 + var6 + var5, 15, field625);
    }

    @ObfuscatedName("fh.mb(Lnt;II)I")
    public static final int method2996(class350 arg0, int arg1) {
        if (arg0.field3869 == null || arg1 >= arg0.field3869.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3869[arg1];
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
                    var7 = field654[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field666[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field814[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class350 var11 = Statics.field2621.method5681(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class223.method87(var12).field2337 || field512)) {
                        for (int var13 = 0; var13 < var11.field3875.length; var13++) {
                            if (var12 + 1 == var11.field3875[var13]) {
                                var7 += var11.field3876[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class338.field3634[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class360.field3950[field666[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class338.field3634[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1608.field1127;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class360.field3952[var14]) {
                            var7 += field666[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class350 var17 = Statics.field2621.method5681(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class223.method87(var18).field2337 || field512)) {
                        for (int var19 = 0; var19 < var17.field3875.length; var19++) {
                            if (var18 + 1 == var17.field3875[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field634;
                }
                if (var6 == 12) {
                    var7 = field690;
                }
                if (var6 == 13) {
                    int var20 = class338.field3634[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class338.method3618(var22);
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
                    var7 = (Statics.field1608.field1220 >> 7) + Statics.field481;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1608.field1260 >> 7) + Statics.field99;
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

    @ObfuscatedName("bn.mj(Lnt;I)V")
    public static final void method436(class350 arg0) {
        if (arg0.field3840 == 1) {
            method2926(arg0.field3878, "", 24, 0, 0, arg0.field3769, arg0.field3877);
        }
        if (arg0.field3840 == 2 && !field678) {
            String var1 = method3096(arg0);
            if (var1 != null) {
                method2926(var1, class103.method1026(65280) + arg0.field3823, 25, 0, -1, arg0.field3769, arg0.field3877);
            }
        }
        if (arg0.field3840 == 3) {
            method1975(class370.field4015, "", 26, 0, 0, arg0.field3769);
        }
        if (arg0.field3840 == 4) {
            method1975(arg0.field3878, "", 28, 0, 0, arg0.field3769);
        }
        if (arg0.field3840 == 5) {
            method1975(arg0.field3878, "", 29, 0, 0, arg0.field3769);
        }
        if (arg0.field3840 == 6 && field688 == null) {
            method1975(arg0.field3878, "", 30, 0, -1, arg0.field3769);
        }
        if (!arg0.field3775) {
            return;
        }
        if (!field678) {
            for (int var2 = 9; var2 >= 5; var2--) {
                String var3 = method794(arg0, var2);
                if (var3 != null) {
                    method2926(var3, arg0.field3824, 1007, var2 + 1, arg0.field3744, arg0.field3769, arg0.field3877);
                }
            }
            String var4 = method3096(arg0);
            if (var4 != null) {
                method2926(var4, arg0.field3824, 25, 0, arg0.field3744, arg0.field3769, arg0.field3877);
            }
            for (int var5 = 4; var5 >= 0; var5--) {
                int var6 = method450(arg0);
                boolean var7 = (var6 >> var5 + 1 & 0x1) != 0;
                String var8;
                if (!var7 && arg0.field3851 == null) {
                    var8 = null;
                } else if (arg0.field3825 == null || arg0.field3825.length <= var5 || arg0.field3825[var5] == null || arg0.field3825[var5].trim().length() == 0) {
                    var8 = null;
                } else {
                    var8 = arg0.field3825[var5];
                }
                if (var8 != null) {
                    method1984(var8, arg0.field3824, 57, var5 + 1, arg0.field3744, arg0.field3769, arg0.field3877, arg0.field3818);
                }
            }
            int var10 = method450(arg0);
            boolean var11 = (var10 & 0x1) != 0;
            if (var11) {
                method1975(class370.field4013, "", 30, 0, arg0.field3744, arg0.field3769);
            }
        } else if (class351.method2863(method450(arg0)) && (Statics.field3906 & 0x20) == 32) {
            method2926(field558, field802 + " " + class103.field1346 + " " + arg0.field3824, 58, 0, arg0.field3744, arg0.field3769, arg0.field3877);
        }
    }

    @ObfuscatedName("or.mx(ZI)V")
    public static void method6264(boolean arg0) {
        field670 = arg0;
    }

    @ObfuscatedName("dx.md(B)Z")
    public static boolean method2202() {
        return field670;
    }

    @ObfuscatedName("bn.mg(IIIIIIIB)V")
    public static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.field2621.method5685(arg0)) {
            method3372(Statics.field2621.field3646[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ha.mv([Lnt;IIIIIIIB)V")
    public static final void method3372(class350[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class350 var9 = arg0[var8];
            if (var9 != null && var9.field3796 == arg1 && (var9.method6060() || method450(var9) != 0 || field696 == var9)) {
                if (var9.field3775) {
                    if (method7223(var9)) {
                        continue;
                    }
                } else if (var9.field3829 == 0 && Statics.field2907 != var9 && method7223(var9)) {
                    continue;
                }
                if (var9.field3829 == 11) {
                    if (var9.method6077(Statics.field2621, Statics.field1180)) {
                        if (var9.method6097()) {
                            method4817(var9);
                            method9048(var9.field3862, var9, true);
                            var9.method6169().method3146().method3272(3, var9.method6169().method3158());
                        }
                        if (var9.field3868 != null) {
                            class89 var10 = new class89();
                            var10.field1080 = var9;
                            var10.field1089 = var9.field3868;
                            field726.method6581(var10);
                        }
                    }
                } else if (var9.field3829 == 12 && var9.method6085(Statics.field2621)) {
                    method4817(var9);
                }
                int var11 = var9.field3757 + arg6;
                int var12 = var9.field3758 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3829 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3759 + var11;
                    int var16 = var9.field3760 + var12;
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
                    int var23 = var9.field3759 + var11;
                    int var24 = var9.field3760 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field618 == var9) {
                    field703 = true;
                    field571 = var11;
                    field705 = var12;
                }
                boolean var25 = false;
                if (var9.field3819) {
                    switch(field685) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3769 >>> 16 == field686) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field686 == var9.field3769) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3775 || var19 < var21 && var20 < var22) {
                    if (var9.field3775) {
                        if (var9.field3891) {
                            if (class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22) {
                                for (class89 var26 = (class89) field726.method6591(); var26 != null; var26 = (class89) field726.method6605()) {
                                    if (var26.field1079) {
                                        var26.method7855();
                                        var26.field1080.field3882 = false;
                                    }
                                }
                                method3095();
                                if (Statics.field1903 == 0) {
                                    field618 = null;
                                    field696 = null;
                                }
                                if (!field607) {
                                    method5715();
                                }
                            }
                        } else if (var9.field3892 && class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22) {
                            for (class89 var27 = (class89) field726.method6591(); var27 != null; var27 = (class89) field726.method6605()) {
                                if (var27.field1079 && var27.field1080.field3853 == var27.field1089) {
                                    var27.method7855();
                                }
                            }
                        }
                    }
                    int var28 = class36.field217;
                    int var29 = class36.field218;
                    if (class36.field224 != 0) {
                        var28 = class36.field212;
                        var29 = class36.field228;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3748 == 1337) {
                        if (!field522 && !field607 && var30) {
                            Statics.method6244(var28, var29, var19, var20);
                        }
                    } else if (var9.field3748 == 1338) {
                        method2722(var9, var11, var12);
                    } else {
                        if (var9.field3748 == 1400) {
                            Statics.field4536.method7944(class36.field217, class36.field218, var30, var11, var12, var9.field3759, var9.field3760);
                        }
                        if (!field607 && var30) {
                            if (var9.field3748 == 1400) {
                                Statics.field4536.method7995(var11, var12, var9.field3759, var9.field3760, var28, var29);
                            } else {
                                method436(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3837.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3837[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3837[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3767 != null) {
                                            var35 = field749.method3974(var9.field3837[var31][var34]);
                                        }
                                        if (method2076(var9.field3837[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3767 != null && var9.field3767[var31] > field523) {
                                                break;
                                            }
                                            byte var36 = var9.field3821[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field749.method3974(86) && !field749.method3974(82) && !field749.method3974(81)) && ((var36 & 0x2) == 0 || field749.method3974(86)) && ((var36 & 0x1) == 0 || field749.method3974(82)) && ((var36 & 0x4) == 0 || field749.method3974(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method6336(var31 + 1, var9.field3769, var9.field3744, var9.field3877, "");
                                    } else if (var31 == 10) {
                                        method5234();
                                        method1976(var9.field3769, var9.field3744, class351.method5704(method450(var9)), var9.field3877);
                                        field558 = method3096(var9);
                                        if (field558 == null) {
                                            field558 = class370.field4272;
                                        }
                                        field802 = var9.field3824 + class103.method1026(16777215);
                                    }
                                    int var37 = var9.field3822[var31];
                                    if (var9.field3767 == null) {
                                        var9.field3767 = new int[var9.field3837.length];
                                    }
                                    if (var9.field3739 == null) {
                                        var9.field3739 = new int[var9.field3837.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3767[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3767[var31] == 0) {
                                        var9.field3767[var31] = field523 + var37 + var9.field3739[var31];
                                    } else {
                                        var9.field3767[var31] = field523 + var37;
                                    }
                                }
                                if (!var32 && var9.field3767 != null) {
                                    var9.field3767[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3775) {
                            boolean var38;
                            if (class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field210 == 1 || !Statics.field4580 && class36.field210 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field224 == 1 || !Statics.field4580 && class36.field224 == 4) && class36.field212 >= var19 && class36.field228 >= var20 && class36.field212 < var21 && class36.field228 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method435(var9, class36.field212 - var11, class36.field228 - var12);
                            }
                            if (var9.method6061()) {
                                if (var40) {
                                    field727.method6581(new class228(0, class36.field217 - var11, class36.field218 - var12, var9));
                                }
                                if (var39) {
                                    field727.method6581(new class228(1, class36.field217 - var11, class36.field218 - var12, var9));
                                }
                            }
                            if (var9.field3748 == 1400) {
                                Statics.field4536.method8075(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field618 != null && field618 != var9 && var38 && class351.method5217(method450(var9))) {
                                field699 = var9;
                            }
                            if (field696 == var9) {
                                field700 = true;
                                field701 = var11;
                                field702 = var12;
                            }
                            if (var9.field3831) {
                                if (var38 && field553 != 0 && var9.field3853 != null) {
                                    class89 var41 = new class89();
                                    var41.field1079 = true;
                                    var41.field1080 = var9;
                                    var41.field1082 = field553;
                                    var41.field1089 = var9.field3853;
                                    field726.method6581(var41);
                                }
                                if (field618 != null || field607) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3883 && var40) {
                                    var9.field3883 = true;
                                    if (var9.field3833 != null) {
                                        class89 var42 = new class89();
                                        var42.field1079 = true;
                                        var42.field1080 = var9;
                                        var42.field1081 = class36.field212 - var11;
                                        var42.field1082 = class36.field228 - var12;
                                        var42.field1089 = var9.field3833;
                                        field726.method6581(var42);
                                    }
                                }
                                if (var9.field3883 && var39 && var9.field3834 != null) {
                                    class89 var43 = new class89();
                                    var43.field1079 = true;
                                    var43.field1080 = var9;
                                    var43.field1081 = class36.field217 - var11;
                                    var43.field1082 = class36.field218 - var12;
                                    var43.field1089 = var9.field3834;
                                    field726.method6581(var43);
                                }
                                if (var9.field3883 && !var39) {
                                    var9.field3883 = false;
                                    if (var9.field3835 != null) {
                                        class89 var44 = new class89();
                                        var44.field1079 = true;
                                        var44.field1080 = var9;
                                        var44.field1081 = class36.field217 - var11;
                                        var44.field1082 = class36.field218 - var12;
                                        var44.field1089 = var9.field3835;
                                        field521.method6581(var44);
                                    }
                                }
                                if (var39 && var9.field3864 != null) {
                                    class89 var45 = new class89();
                                    var45.field1079 = true;
                                    var45.field1080 = var9;
                                    var45.field1081 = class36.field217 - var11;
                                    var45.field1082 = class36.field218 - var12;
                                    var45.field1089 = var9.field3864;
                                    field726.method6581(var45);
                                }
                                if (!var9.field3882 && var38) {
                                    var9.field3882 = true;
                                    if (var9.field3740 != null) {
                                        class89 var46 = new class89();
                                        var46.field1079 = true;
                                        var46.field1080 = var9;
                                        var46.field1081 = class36.field217 - var11;
                                        var46.field1082 = class36.field218 - var12;
                                        var46.field1089 = var9.field3740;
                                        field726.method6581(var46);
                                    }
                                }
                                if (var9.field3882 && var38 && var9.field3838 != null) {
                                    class89 var47 = new class89();
                                    var47.field1079 = true;
                                    var47.field1080 = var9;
                                    var47.field1081 = class36.field217 - var11;
                                    var47.field1082 = class36.field218 - var12;
                                    var47.field1089 = var9.field3838;
                                    field726.method6581(var47);
                                }
                                if (var9.field3882 && !var38) {
                                    var9.field3882 = false;
                                    if (var9.field3839 != null) {
                                        class89 var48 = new class89();
                                        var48.field1079 = true;
                                        var48.field1080 = var9;
                                        var48.field1081 = class36.field217 - var11;
                                        var48.field1082 = class36.field218 - var12;
                                        var48.field1089 = var9.field3839;
                                        field521.method6581(var48);
                                    }
                                }
                                if (var9.field3850 != null) {
                                    class89 var49 = new class89();
                                    var49.field1080 = var9;
                                    var49.field1089 = var9.field3850;
                                    field594.method6581(var49);
                                }
                                if (var9.field3801 != null && field709 > var9.field3885) {
                                    if (var9.field3845 == null || field709 - var9.field3885 > 32) {
                                        class89 var54 = new class89();
                                        var54.field1080 = var9;
                                        var54.field1089 = var9.field3801;
                                        field726.method6581(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3885; var50 < field709; var50++) {
                                            int var51 = field708[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3845.length; var52++) {
                                                if (var9.field3845[var52] == var51) {
                                                    class89 var53 = new class89();
                                                    var53.field1080 = var9;
                                                    var53.field1089 = var9.field3801;
                                                    field726.method6581(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3885 = field709;
                                }
                                if (var9.field3785 != null && field711 > var9.field3848) {
                                    if (var9.field3847 == null || field711 - var9.field3848 > 32) {
                                        class89 var59 = new class89();
                                        var59.field1080 = var9;
                                        var59.field1089 = var9.field3785;
                                        field726.method6581(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3848; var55 < field711; var55++) {
                                            int var56 = field573[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3847.length; var57++) {
                                                if (var9.field3847[var57] == var56) {
                                                    class89 var58 = new class89();
                                                    var58.field1080 = var9;
                                                    var58.field1089 = var9.field3785;
                                                    field726.method6581(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3848 = field711;
                                }
                                if (var9.field3827 != null && field659 > var9.field3887) {
                                    if (var9.field3743 == null || field659 - var9.field3887 > 32) {
                                        class89 var64 = new class89();
                                        var64.field1080 = var9;
                                        var64.field1089 = var9.field3827;
                                        field726.method6581(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3887; var60 < field659; var60++) {
                                            int var61 = field712[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3743.length; var62++) {
                                                if (var9.field3743[var62] == var61) {
                                                    class89 var63 = new class89();
                                                    var63.field1080 = var9;
                                                    var63.field1089 = var9.field3827;
                                                    field726.method6581(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3887 = field659;
                                }
                                if (field716 > var9.field3884 && var9.field3854 != null) {
                                    class89 var65 = new class89();
                                    var65.field1080 = var9;
                                    var65.field1089 = var9.field3854;
                                    field726.method6581(var65);
                                }
                                if (field717 > var9.field3884 && var9.field3791 != null) {
                                    class89 var66 = new class89();
                                    var66.field1080 = var9;
                                    var66.field1089 = var9.field3791;
                                    field726.method6581(var66);
                                }
                                if (field718 > var9.field3884 && var9.field3894 != null) {
                                    class89 var67 = new class89();
                                    var67.field1080 = var9;
                                    var67.field1089 = var9.field3894;
                                    field726.method6581(var67);
                                }
                                if (field682 > var9.field3884 && var9.field3860 != null) {
                                    class89 var68 = new class89();
                                    var68.field1080 = var9;
                                    var68.field1089 = var9.field3860;
                                    field726.method6581(var68);
                                }
                                if (field720 > var9.field3884 && var9.field3861 != null) {
                                    class89 var69 = new class89();
                                    var69.field1080 = var9;
                                    var69.field1089 = var9.field3861;
                                    field726.method6581(var69);
                                }
                                if (field721 > var9.field3884 && var9.field3870 != null) {
                                    class89 var70 = new class89();
                                    var70.field1080 = var9;
                                    var70.field1089 = var9.field3870;
                                    field726.method6581(var70);
                                }
                                if (field722 > var9.field3884 && var9.field3867 != null) {
                                    class89 var71 = new class89();
                                    var71.field1080 = var9;
                                    var71.field1089 = var9.field3867;
                                    field726.method6581(var71);
                                }
                                if (field723 > var9.field3884 && var9.field3778 != null) {
                                    class89 var72 = new class89();
                                    var72.field1080 = var9;
                                    var72.field1089 = var9.field3778;
                                    field726.method6581(var72);
                                }
                                var9.field3884 = field707;
                                if (var9.field3855 != null) {
                                    for (int var73 = 0; var73 < field612; var73++) {
                                        class89 var74 = new class89();
                                        var74.field1080 = var9;
                                        var74.field1085 = field768[var73];
                                        var74.field1086 = field513[var73];
                                        var74.field1089 = var9.field3855;
                                        field726.method6581(var74);
                                    }
                                }
                                if (var9.field3856 != null) {
                                    int[] var75 = field749.method3976();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class89 var77 = new class89();
                                        var77.field1080 = var9;
                                        var77.field1085 = var75[var76];
                                        var77.field1089 = var9.field3856;
                                        field726.method6581(var77);
                                    }
                                }
                                if (var9.field3857 != null) {
                                    int[] var78 = field749.method3977();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class89 var80 = new class89();
                                        var80.field1080 = var9;
                                        var80.field1085 = var78[var79];
                                        var80.field1089 = var9.field3857;
                                        field726.method6581(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3775) {
                            if (field618 != null || field607) {
                                continue;
                            }
                            if ((var9.field3872 >= 0 || var9.field3828 != 0) && class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22) {
                                if (var9.field3872 >= 0) {
                                    Statics.field2907 = arg0[var9.field3872];
                                } else {
                                    Statics.field2907 = var9;
                                }
                            }
                            if (var9.field3829 == 8 && class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22) {
                                Statics.field3138 = var9;
                            }
                            if (var9.field3768 > var9.field3760) {
                                method2873(var9, var9.field3759 + var11, var12, var9.field3760, var9.field3768, class36.field217, class36.field218);
                            }
                        }
                        if (var9.field3829 == 0) {
                            method3372(arg0, var9.field3769, var19, var20, var21, var22, var11 - var9.field3742, var12 - var9.field3766);
                            if (var9.field3862 != null) {
                                method3372(var9.field3862, var9.field3769, var19, var20, var21, var22, var11 - var9.field3742, var12 - var9.field3766);
                            }
                            class88 var81 = (class88) field684.method8206((long) var9.field3769);
                            if (var81 != null) {
                                if (var81.field1074 == 0 && class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22 && !field607) {
                                    for (class89 var82 = (class89) field726.method6591(); var82 != null; var82 = (class89) field726.method6605()) {
                                        if (var82.field1079) {
                                            var82.method7855();
                                            var82.field1080.field3882 = false;
                                        }
                                    }
                                    if (Statics.field1903 == 0) {
                                        field618 = null;
                                        field696 = null;
                                    }
                                    if (!field607) {
                                        method5715();
                                    }
                                }
                                method431(var81.field1075, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ca.mn(II)Z")
    public static boolean method2076(int arg0) {
        for (int var1 = 0; var1 < field612; var1++) {
            if (field768[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cq.mz(III)V")
    public static final void method2069(int arg0, int arg1) {
        if (Statics.field2621.method5685(arg0)) {
            method5208(Statics.field2621.field3646[arg0], arg1);
        }
    }

    @ObfuscatedName("lj.my([Lnt;II)V")
    public static final void method5208(class350[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class350 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3829 == 0) {
                    if (var3.field3862 != null) {
                        method5208(var3.field3862, arg1);
                    }
                    class88 var4 = (class88) field684.method8206((long) var3.field3769);
                    if (var4 != null) {
                        method2069(var4.field1075, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3764 != null) {
                    class89 var5 = new class89();
                    var5.field1080 = var3;
                    var5.field1089 = var3.field3764;
                    class72.method5202(var5);
                }
                if (arg1 == 1 && var3.field3746 != null) {
                    if (var3.field3744 >= 0) {
                        class350 var6 = Statics.field2621.method5681(var3.field3769);
                        if (var6 == null || var6.field3862 == null || var3.field3744 >= var6.field3862.length || var6.field3862[var3.field3744] != var3) {
                            continue;
                        }
                    }
                    class89 var7 = new class89();
                    var7.field1080 = var3;
                    var7.field1089 = var3.field3746;
                    class72.method5202(var7);
                }
            }
        }
    }

    @ObfuscatedName("bn.ms(Lnt;III)V")
    public static final void method435(class350 arg0, int arg1, int arg2) {
        if (field618 != null || field607 || arg0 == null) {
            return;
        }
        class350 var3 = arg0;
        int var4 = class351.method3533(method450(arg0));
        class350 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = Statics.field2621.method5681(var3.field3796);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class350 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field3826;
        }
        if (var7 == null) {
            return;
        }
        field618 = arg0;
        class350 var9 = arg0;
        int var10 = class351.method3533(method450(arg0));
        class350 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = Statics.field2621.method5681(var9.field3796);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class350 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field3826;
        }
        field696 = var13;
        field697 = arg1;
        field698 = arg2;
        Statics.field1903 = 0;
        field706 = false;
        int var15 = field660 - 1;
        if (var15 != -1) {
            method3876(var15);
        }
        return;
    }

    @ObfuscatedName("client.mr(I)V")
    public final void method1167() {
        method4817(field618);
        Statics.field1903++;
        if (field703 && field700) {
            int var1 = class36.field217;
            int var2 = class36.field218;
            int var3 = var1 - field697;
            int var4 = var2 - field698;
            if (var3 < field701) {
                var3 = field701;
            }
            if (field618.field3759 + var3 > field701 + field696.field3759) {
                var3 = field701 + field696.field3759 - field618.field3759;
            }
            if (var4 < field702) {
                var4 = field702;
            }
            if (field618.field3760 + var4 > field702 + field696.field3760) {
                var4 = field702 + field696.field3760 - field618.field3760;
            }
            int var5 = var3 - field571;
            int var6 = var4 - field705;
            int var7 = field618.field3843;
            if (Statics.field1903 > field618.field3889 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field706 = true;
            }
            int var8 = field696.field3742 + (var3 - field701);
            int var9 = field696.field3766 + (var4 - field702);
            if (field618.field3788 != null && field706) {
                class89 var10 = new class89();
                var10.field1080 = field618;
                var10.field1081 = var8;
                var10.field1082 = var9;
                var10.field1089 = field618.field3788;
                class72.method5202(var10);
            }
            if (class36.field210 == 0) {
                if (field706) {
                    if (field618.field3841 != null) {
                        class89 var11 = new class89();
                        var11.field1080 = field618;
                        var11.field1081 = var8;
                        var11.field1082 = var9;
                        var11.field1084 = field699;
                        var11.field1089 = field618.field3841;
                        class72.method5202(var11);
                    }
                    if (field699 != null) {
                        class350 var12 = field618;
                        int var13 = class351.method3533(method450(var12));
                        class350 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = Statics.field2621.method5681(var12.field3796);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class313 var16 = class313.method7156(class311.field3272, field574.field1438);
                            var16.field3318.method8446(field618.field3744);
                            var16.field3318.method8501(field699.field3744);
                            var16.field3318.method8604(field618.field3769);
                            var16.field3318.method8604(field699.field3769);
                            var16.field3318.method8595(field618.field3877);
                            var16.field3318.method8443(field699.field3877);
                            field574.method2654(var16);
                        }
                    }
                } else if (this.method1567()) {
                    this.method1164(field697 + field571, field705 + field698);
                } else if (field660 > 0) {
                    method5718(field697 + field571, field705 + field698);
                }
                field618 = null;
            }
        } else if (Statics.field1903 > 1) {
            if (!field706 && field660 > 0) {
                int var17 = field697 + field571;
                int var18 = field705 + field698;
                class75 var19 = Statics.field473;
                if (var19 != null) {
                    method4005(var19.field918, var19.field915, var19.field913, var19.field916, var19.field917, var19.field914, var19.field919, var17, var18);
                }
                Statics.field473 = null;
            }
            field618 = null;
        }
    }

    @ObfuscatedName("id.me(II)V")
    public static void method3876(int arg0) {
        Statics.field473 = new class75();
        Statics.field473.field918 = field661[arg0];
        Statics.field473.field915 = field662[arg0];
        Statics.field473.field913 = field663[arg0];
        Statics.field473.field916 = field664[arg0];
        Statics.field473.field917 = field603[arg0];
        Statics.field473.field914 = field585[arg0];
        Statics.field473.field919 = field667[arg0];
    }

    @ObfuscatedName("nr.mw(IIB)V")
    public static void method5718(int arg0, int arg1) {
        class75 var2 = Statics.field473;
        if (var2 != null) {
            method4005(var2.field918, var2.field915, var2.field913, var2.field916, var2.field917, var2.field914, var2.field919, arg0, arg1);
        }
        Statics.field473 = null;
    }

    @ObfuscatedName("ka.ml(Lnt;B)V")
    public static void method4817(class350 arg0) {
        if (arg0 != null && field732 == arg0.field3820) {
            field733[arg0.field3888] = true;
        }
    }

    @ObfuscatedName("gq.mk(I)V")
    public static void method3137() {
        for (class88 var0 = (class88) field684.method8207(); var0 != null; var0 = (class88) field684.method8203()) {
            int var1 = var0.field1075;
            if (Statics.field2621.method5685(var1)) {
                boolean var2 = true;
                class350[] var3 = Statics.field2621.field3646[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3775;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4951;
                    class350 var6 = Statics.field2621.method5681(var5);
                    if (var6 != null) {
                        method4817(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.mq(II)V")
    public static final void method1121(int arg0) {
        if (!Statics.field2621.method5685(arg0)) {
            return;
        }
        class350[] var1 = Statics.field2621.field3646[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class350 var3 = var1[var2];
            if (var3 != null) {
                var3.field3879 = 0;
                var3.field3846 = 0;
            }
        }
    }

    @ObfuscatedName("fq.mu([Lnt;IS)V")
    public static final void method2985(class350[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class350 var3 = arg0[var2];
            if (var3 != null && var3.field3796 == arg1 && (!var3.field3775 || !method7223(var3))) {
                if (var3.field3829 == 0) {
                    if (!var3.field3775 && method7223(var3) && Statics.field2907 != var3) {
                        continue;
                    }
                    method2985(arg0, var3.field3769);
                    if (var3.field3862 != null) {
                        method2985(var3.field3862, var3.field3769);
                    }
                    class88 var4 = (class88) field684.method8206((long) var3.field3769);
                    if (var4 != null) {
                        int var5 = var4.field1075;
                        if (Statics.field2621.method5685(var5)) {
                            method2985(Statics.field2621.field3646[var5], -1);
                        }
                    }
                }
                if (var3.field3829 == 6) {
                    if (var3.field3792 != -1 || var3.field3793 != -1) {
                        boolean var6 = Statics.method795(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3793;
                        } else {
                            var7 = var3.field3792;
                        }
                        if (var7 != -1) {
                            class225 var8 = class225.method288(var7);
                            if (var8.method3940()) {
                                var3.field3879 += field546;
                                int var9 = var8.method3904();
                                if (var3.field3879 >= var9) {
                                    var3.field3879 -= var8.field2390;
                                    if (var3.field3879 < 0 || var3.field3879 >= var9) {
                                        var3.field3879 = 0;
                                    }
                                }
                                method4817(var3);
                            } else {
                                var3.field3846 += field546;
                                while (var3.field3846 > var8.field2393[var3.field3879]) {
                                    var3.field3846 -= var8.field2393[var3.field3879];
                                    var3.field3879++;
                                    if (var3.field3879 >= var8.field2386.length) {
                                        var3.field3879 -= var8.field2390;
                                        if (var3.field3879 < 0 || var3.field3879 >= var8.field2386.length) {
                                            var3.field3879 = 0;
                                        }
                                    }
                                    method4817(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3738 != 0 && !var3.field3775) {
                        int var10 = var3.field3738 >> 16;
                        int var11 = var3.field3738 << 16 >> 16;
                        int var12 = field546 * var10;
                        int var13 = field546 * var11;
                        var3.field3763 = var3.field3763 + var12 & 0x7FF;
                        var3.field3797 = var3.field3797 + var13 & 0x7FF;
                        method4817(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ht.mt(II)V")
    public static final void method3364(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method665((double) var3);
    }

    @ObfuscatedName("gh.nn(B)I")
    public static final int method3173() {
        float var0 = 200.0F * ((float) Statics.field1336.method2358() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("bs.nc(D)V")
    public static final void method665(double arg0) {
        class243.method4202(arg0);
        ((class253) class243.field2612.field2901).method4534(arg0);
        if (Statics.field4536 != null) {
            Statics.field4536.method7960();
        }
        class223.field2313.method5339();
        Statics.field1336.method2357(arg0);
    }

    @ObfuscatedName("hr.nm(II)V")
    public static final void method3384(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field1336.method2391()) {
            return;
        }
        label50: {
            if (Statics.field1336.method2391() == 0) {
                boolean var2 = !class322.field3497.isEmpty();
                if (var2) {
                    class322.method3389(Statics.field1509, var1);
                    field719 = false;
                    break label50;
                }
            }
            if (var1 == 0) {
                class322.method104(0, 0);
                field719 = false;
            } else if (!class322.field3496.isEmpty()) {
                Iterator var3 = class322.field3496.iterator();
                while (var3.hasNext()) {
                    class334 var4 = (class334) var3.next();
                    if (var4 != null) {
                        var4.field3608 = var1;
                    }
                }
                class334 var5 = (class334) class322.field3496.get(0);
                if (var5 != null && var5.field3614 != null && var5.field3614.method5448() && !var5.field3605) {
                    var5.field3614.method5440(var1);
                    var5.field3609 = (float) var1;
                }
            }
        }
        Statics.field1336.method2359(var1);
    }

    @ObfuscatedName("ud.na(II)V")
    public static final void method8335(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1336.method2395(var1);
    }

    @ObfuscatedName("cv.no(IB)V")
    public static final void method1829(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1336.method2429(var1);
    }

    @ObfuscatedName("ag.nj(II)V")
    public static final void method103(int arg0) {
        method3137();
        for (class71 var1 = (class71) class71.field856.method6591(); var1 != null; var1 = (class71) class71.field856.method6605()) {
            if (var1.field851 != null) {
                var1.method1818();
            }
        }
        int var2 = class195.method2746(arg0).field1994;
        if (var2 == 0) {
            return;
        }
        int var3 = class338.field3634[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                method665(0.9D);
            }
            if (var3 == 2) {
                method665(0.8D);
            }
            if (var3 == 3) {
                method665(0.7D);
            }
            if (var3 == 4) {
                method665(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method3384(255);
            }
            if (var3 == 1) {
                method3384(192);
            }
            if (var3 == 2) {
                method3384(128);
            }
            if (var3 == 3) {
                method3384(64);
            }
            if (var3 == 4) {
                method3384(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method8335(127);
            }
            if (var3 == 1) {
                method8335(96);
            }
            if (var3 == 2) {
                method8335(64);
            }
            if (var3 == 3) {
                method8335(32);
            }
            if (var3 == 4) {
                method8335(0);
            }
        }
        if (var2 == 5) {
            field810 = var3 == 1;
        }
        if (var2 == 6) {
            field687 = var3;
        }
        if (var2 == 9) {
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method1829(127);
            }
            if (var3 == 1) {
                method1829(96);
            }
            if (var3 == 2) {
                method1829(64);
            }
            if (var3 == 3) {
                method1829(32);
            }
            if (var3 == 4) {
                method1829(0);
            }
        }
        if (var2 == 17) {
            field734 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class105[] var4 = new class105[] { class105.field1360, class105.field1359, class105.field1361, class105.field1362, class105.field1358 };
            field538 = (class105) class393.method3484(var4, var3);
            if (field538 == null) {
                field538 = class105.field1362;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field592 = -1;
            } else {
                field592 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class105[] var5 = new class105[] { class105.field1360, class105.field1359, class105.field1361, class105.field1362, class105.field1358 };
        field539 = (class105) class393.method3484(var5, var3);
        if (field539 == null) {
            field539 = class105.field1362;
        }
    }

    @ObfuscatedName("jf.nr(Lnt;I)V")
    public static final void method4188(class350 arg0) {
        int var1 = arg0.field3748;
        if (var1 == 324) {
            if (field800 == -1) {
                field800 = arg0.field3779;
                field801 = arg0.field3780;
            }
            if (field799.field3687 == 1) {
                arg0.field3779 = field800;
            } else {
                arg0.field3779 = field801;
            }
        } else if (var1 == 325) {
            if (field800 == -1) {
                field800 = arg0.field3779;
                field801 = arg0.field3780;
            }
            if (field799.field3687 == 1) {
                arg0.field3779 = field801;
            } else {
                arg0.field3779 = field800;
            }
        } else if (var1 == 327) {
            arg0.field3763 = 150;
            arg0.field3797 = (int) (Math.sin((double) field523 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3784 = 5;
            arg0.field3849 = 0;
        } else if (var1 == 328) {
            arg0.field3763 = 150;
            arg0.field3797 = (int) (Math.sin((double) field523 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3784 = 5;
            arg0.field3849 = 1;
        }
    }

    @ObfuscatedName("cu.ny(B)V")
    public static final void method1135() {
        class313 var0 = class313.method7156(class311.field3253, field574.field1438);
        field574.method2654(var0);
        class72.field874 = true;
        for (class88 var1 = (class88) field684.method8207(); var1 != null; var1 = (class88) field684.method8203()) {
            if (var1.field1074 == 0 || var1.field1074 == 3) {
                method3625(var1, true);
            }
        }
        if (field688 != null) {
            method4817(field688);
            field688 = null;
        }
        class72.field874 = false;
    }

    @ObfuscatedName("ea.nq(IIIB)Ldv;")
    public static final class88 method2702(int arg0, int arg1, int arg2) {
        class88 var3 = new class88();
        var3.field1075 = arg1;
        var3.field1074 = arg2;
        field684.method8204(var3, (long) arg0);
        method1121(arg1);
        class350 var4 = Statics.field2621.method5681(arg0);
        method4817(var4);
        if (field688 != null) {
            method4817(field688);
            field688 = null;
        }
        method9048(Statics.field2621.field3646[arg0 >> 16], var4, false);
        class72.method334(arg1);
        if (field683 != -1) {
            method2069(field683, 1);
        }
        return var3;
    }

    @ObfuscatedName("iq.nf(Ldv;ZI)V")
    public static final void method3625(class88 arg0, boolean arg1) {
        int var2 = arg0.field1075;
        int var3 = (int) arg0.field4951;
        arg0.method7855();
        if (arg1) {
            Statics.field2621.method5683(var2);
        }
        for (class492 var4 = (class492) field730.method8207(); var4 != null; var4 = (class492) field730.method8203()) {
            if ((var4.field4951 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method7855();
            }
        }
        class350 var5 = Statics.field2621.method5681(var3);
        if (var5 != null) {
            method4817(var5);
        }
        if (field683 != -1) {
            method2069(field683, 1);
        }
    }

    @ObfuscatedName("ey.nz(Lnt;I)Z")
    public static final boolean method2671(class350 arg0) {
        int var1 = arg0.field3748;
        if (var1 == 205) {
            field575 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field799.method5724(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field799.method5725(var4, var5 == 1);
        }
        if (var1 == 324) {
            field799.method5726(0);
        }
        if (var1 == 325) {
            field799.method5726(1);
        }
        if (var1 == 326) {
            class313 var6 = class313.method7156(class311.field3300, field574.field1438);
            field799.method5749(var6.field3318);
            field574.method2654(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gs.nt(Lnt;IIII)V")
    public static final void method3242(class350 arg0, int arg1, int arg2, int arg3) {
        method3130();
        class337 var4 = arg0.method6058(Statics.field2621, false);
        if (var4 == null) {
            return;
        }
        class545.method8801(arg1, arg2, var4.field3625 + arg1, var4.field3630 + arg2);
        if (field764 == 2 || field764 == 5) {
            class545.method8795(arg1, arg2, 0, var4.field3627, var4.field3626);
        } else {
            int var5 = field597 & 0x7FF;
            int var6 = Statics.field1608.field1220 / 32 + 48;
            int var7 = 464 - Statics.field1608.field1260 / 32;
            Statics.field878.method8895(arg1, arg2, var4.field3625, var4.field3630, var6, var7, var5, 256, var4.field3627, var4.field3626);
            for (int var8 = 0; var8 < field628; var8++) {
                int var9 = field759[var8] * 4 + 2 - Statics.field1608.field1220 / 32;
                int var10 = field760[var8] * 4 + 2 - Statics.field1608.field1260 / 32;
                method5157(arg1, arg2, var9, var10, field761[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class398 var13 = field650[Statics.field1861][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1608.field1220 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1608.field1260 / 32;
                        method5157(arg1, arg2, var14, var15, Statics.field116[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field645; var16++) {
                class102 var17 = field569[field724[var16]];
                if (var17 != null && var17.method2240()) {
                    class208 var18 = var17.field1333;
                    if (var18 != null && var18.field2139 != null) {
                        var18 = var18.method3534();
                    }
                    if (var18 != null && var18.field2131 && var18.field2142) {
                        int var19 = var17.field1220 / 32 - Statics.field1608.field1220 / 32;
                        int var20 = var17.field1260 / 32 - Statics.field1608.field1260 / 32;
                        method5157(arg1, arg2, var19, var20, Statics.field116[1], var4);
                    }
                }
            }
            int var21 = class109.field1398;
            int[] var22 = class109.field1387;
            for (int var23 = 0; var23 < var21; var23++) {
                class93 var24 = field636[var22[var23]];
                if (var24 != null && var24.method2240() && !var24.field1122 && Statics.field1608 != var24) {
                    int var25 = var24.field1220 / 32 - Statics.field1608.field1220 / 32;
                    int var26 = var24.field1260 / 32 - Statics.field1608.field1260 / 32;
                    if (var24.method2227()) {
                        method5157(arg1, arg2, var25, var26, Statics.field116[3], var4);
                    } else if (Statics.field1608.field1151 != 0 && var24.field1151 != 0 && Statics.field1608.field1151 == var24.field1151) {
                        method5157(arg1, arg2, var25, var26, Statics.field116[4], var4);
                    } else if (var24.method2259()) {
                        method5157(arg1, arg2, var25, var26, Statics.field116[5], var4);
                    } else if (var24.method2271()) {
                        method5157(arg1, arg2, var25, var26, Statics.field116[6], var4);
                    } else {
                        method5157(arg1, arg2, var25, var26, Statics.field116[2], var4);
                    }
                }
            }
            if (field530 != 0 && field523 % 20 < 10) {
                if (field530 == 1 && field531 >= 0 && field531 < field569.length) {
                    class102 var27 = field569[field531];
                    if (var27 != null) {
                        int var28 = var27.field1220 / 32 - Statics.field1608.field1220 / 32;
                        int var29 = var27.field1260 / 32 - Statics.field1608.field1260 / 32;
                        method1556(arg1, arg2, var28, var29, Statics.field165[1], var4);
                    }
                }
                if (field530 == 2) {
                    int var30 = field533 * 4 - Statics.field481 * 4 + 2 - Statics.field1608.field1220 / 32;
                    int var31 = field621 * 4 - Statics.field99 * 4 + 2 - Statics.field1608.field1260 / 32;
                    method1556(arg1, arg2, var30, var31, Statics.field165[1], var4);
                }
                if (field530 == 10 && field532 >= 0 && field532 < field636.length) {
                    class93 var32 = field636[field532];
                    if (var32 != null) {
                        int var33 = var32.field1220 / 32 - Statics.field1608.field1220 / 32;
                        int var34 = var32.field1260 / 32 - Statics.field1608.field1260 / 32;
                        method1556(arg1, arg2, var33, var34, Statics.field165[1], var4);
                    }
                }
            }
            if (field762 != 0) {
                int var35 = field762 * 4 + 2 - Statics.field1608.field1220 / 32;
                int var36 = field763 * 4 + 2 - Statics.field1608.field1260 / 32;
                method5157(arg1, arg2, var35, var36, Statics.field165[0], var4);
            }
            if (!Statics.field1608.field1122) {
                class545.method8784(var4.field3625 / 2 + arg1 - 1, var4.field3630 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field817[arg3] = true;
    }

    @ObfuscatedName("jx.ne(Lnt;IIIB)V")
    public static final void method4734(class350 arg0, int arg1, int arg2, int arg3) {
        class337 var4 = arg0.method6058(Statics.field2621, false);
        if (var4 == null) {
            return;
        }
        if (field764 < 3) {
            Statics.field2557.method8895(arg1, arg2, var4.field3625, var4.field3630, 25, 25, field597, 256, var4.field3627, var4.field3626);
        } else {
            class545.method8795(arg1, arg2, 0, var4.field3627, var4.field3626);
        }
    }

    @ObfuscatedName("client.nk(IIIILvg;Lmu;I)V")
    public static final void method1556(int arg0, int arg1, int arg2, int arg3, class549 arg4, class337 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method5157(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field597 & 0x7FF;
        int var8 = class243.field2616[var7];
        int var9 = class243.field2613[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3625 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field3460.method8918(arg5.field3625 / 2 + arg0 - var17 / 2 + var15, arg5.field3630 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("kv.nl(IIIILvg;Lmu;I)V")
    public static final void method5157(int arg0, int arg1, int arg2, int arg3, class549 arg4, class337 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field597 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class243.field2616[var6];
        int var9 = class243.field2613[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method9005(arg5.field3625 / 2 + var10 - arg4.field5332 / 2, arg5.field3630 / 2 - var11 - arg4.field5335 / 2, arg0, arg1, arg5.field3625, arg5.field3630, arg5.field3627, arg5.field3626);
        } else {
            arg4.method8900(arg5.field3625 / 2 + arg0 + var10 - arg4.field5332 / 2, arg5.field3630 / 2 + arg1 - var11 - arg4.field5335 / 2);
        }
    }

    @ObfuscatedName("lw.ni(I)V")
    public static final void method5352() {
        class112.method5120();
        if (Statics.field1674 != null) {
            Statics.field1674.method7383();
        }
    }

    @ObfuscatedName("ew.ns(I)V")
    public static final void method2556() {
        field682 = field707;
        Statics.field894 = true;
    }

    @ObfuscatedName("kk.nb(Ljava/lang/String;I)V")
    public static final void method4811(String arg0) {
        if (Statics.field1674 != null) {
            class313 var1 = class313.method7156(class311.field3261, field574.field1438);
            var1.field3318.method8445(class535.method3943(arg0));
            var1.field3318.method8452(arg0);
            field574.method2654(var1);
        }
    }

    @ObfuscatedName("rs.nv(Ljava/lang/String;B)V")
    public static final void method7572(String arg0) {
        if (!arg0.equals("")) {
            class313 var1 = class313.method7156(class311.field3266, field574.field1438);
            var1.field3318.method8445(class535.method3943(arg0));
            var1.field3318.method8452(arg0);
            field574.method2654(var1);
        }
    }

    @ObfuscatedName("in.nh(I)V")
    public static final void method3604() {
        class313 var0 = class313.method7156(class311.field3266, field574.field1438);
        var0.field3318.method8445(0);
        field574.method2654(var0);
    }

    @ObfuscatedName("fc.nd(IIB)V")
    public static final void method2930(int arg0, int arg1) {
        class165 var2 = arg0 >= 0 ? field756[arg0] : Statics.field87;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3122()) {
            return;
        }
        class147 var3 = (class147) var2.field1798.get(arg1);
        if (var3.field1683 != -1) {
            return;
        }
        String var4 = var3.field1685.method9077();
        class313 var5 = class313.method7156(class311.field3251, field574.field1438);
        var5.field3318.method8445(3 + class535.method3943(var4));
        var5.field3318.method8445(arg0);
        var5.field3318.method8446(arg1);
        var5.field3318.method8452(var4);
        field574.method2654(var5);
    }

    @ObfuscatedName("qw.ng(IIB)V")
    public static final void method7155(int arg0, int arg1) {
        if (field756[arg0] == null || arg1 < 0 || arg1 >= field756[arg0].method3122()) {
            return;
        }
        class147 var2 = (class147) field756[arg0].field1798.get(arg1);
        if (var2.field1683 != -1) {
            return;
        }
        class313 var3 = class313.method7156(class311.field3207, field574.field1438);
        var3.field3318.method8445(3 + class535.method3943(var2.field1685.method9077()));
        var3.field3318.method8445(arg0);
        var3.field3318.method8446(arg1);
        var3.field3318.method8452(var2.field1685.method9077());
        field574.method2654(var3);
    }

    @ObfuscatedName("client.nx(IIZI)V")
    public static final void method1476(int arg0, int arg1, boolean arg2) {
        if (field756[arg0] == null || arg1 < 0 || arg1 >= field756[arg0].method3122()) {
            return;
        }
        class147 var3 = (class147) field756[arg0].field1798.get(arg1);
        class313 var4 = class313.method7156(class311.field3289, field574.field1438);
        var4.field3318.method8445(4 + class535.method3943(var3.field1685.method9077()));
        var4.field3318.method8445(arg0);
        var4.field3318.method8446(arg1);
        var4.field3318.method8451(arg2);
        var4.field3318.method8452(var3.field1685.method9077());
        field574.method2654(var4);
    }

    @ObfuscatedName("bo.nw(Lnt;B)I")
    public static int method450(class350 arg0) {
        class492 var1 = (class492) field730.method8206(((long) arg0.field3769 << 32) + (long) arg0.field3744);
        return var1 == null ? arg0.field3762 : var1.field4949;
    }

    @ObfuscatedName("qv.np(Lnt;I)Z")
    public static boolean method7223(class350 arg0) {
        return arg0.field3866;
    }

    @ObfuscatedName("bt.nu(Lnt;IB)Ljava/lang/String;")
    public static String method794(class350 arg0, int arg1) {
        int var2 = method450(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field3851 == null) {
            return null;
        } else if (arg0.field3825 == null || arg0.field3825.length <= arg1 || arg0.field3825[arg1] == null || arg0.field3825[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3825[arg1];
        }
    }

    @ObfuscatedName("gb.ot(Lnt;I)Ljava/lang/String;")
    public static String method3096(class350 arg0) {
        if (class351.method5704(method450(arg0)) == 0) {
            return null;
        } else if (arg0.field3830 == null || arg0.field3830.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3830;
        }
    }

    @ObfuscatedName("ka.on(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method4827(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field511 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field511 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field511 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field511 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field511 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2869 != null) {
            var3 = "/p=" + Statics.field2869;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field896 + "/a=" + Statics.field3046 + var3 + "/";
    }

    @ObfuscatedName("tp.ob(Ljava/lang/String;B)V")
    public static void method7938(String arg0) {
        Statics.field2869 = arg0;
        try {
            String var1 = Statics.field1468.getParameter(Integer.toString(18));
            String var2 = Statics.field1468.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class355.method4039(class318.method3596() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class27.method354(Statics.field1468, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("oq.oh(Ljava/lang/String;ZS)V")
    public static void method6271(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2317; var5++) {
            class223 var6 = class223.method87(var5);
            if ((!arg1 || var6.field2356) && var6.field2336 == -1 && var6.field2341.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field233 = -1;
                    Statics.field418 = null;
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
        Statics.field418 = var3;
        Statics.field3612 = 0;
        Statics.field233 = var4;
        String[] var9 = new String[Statics.field233];
        for (int var10 = 0; var10 < Statics.field233; var10++) {
            var9[var10] = class223.method87(var3[var10]).field2341;
        }
        class530.method7649(var9, Statics.field418);
    }

    @ObfuscatedName("fu.os(Lur;IB)V")
    public static void method2981(class535 arg0, int arg1) {
        byte[] var2 = arg0.field5231;
        if (field595 == null) {
            field595 = new byte[24];
        }
        class430.method7182(var2, arg1, field595, 0, 24);
        class176.method4514(arg0, arg1);
    }

    @ObfuscatedName("client.om(I)Lvx;")
    public class558 method1168() {
        return Statics.field1608 == null ? null : Statics.field1608.field1142;
    }

    @ObfuscatedName("hl.or(IIIZI)V")
    public static void method3496(int arg0, int arg1, int arg2, boolean arg3) {
        class313 var4 = class313.method7156(class311.field3264, field574.field1438);
        var4.field3318.method8604(arg3 ? field609 : 0);
        var4.field3318.method8595(arg0);
        var4.field3318.method8492(arg2);
        var4.field3318.method8595(arg1);
        field574.method2654(var4);
    }

    @ObfuscatedName("nf.oe(I)Z")
    public static boolean method6041() {
        return field691 >= 2;
    }

    @ObfuscatedName("je.ok(II)V")
    public static void method4563(int arg0) {
        field589 = arg0;
    }

    @ObfuscatedName("ii.of(I)V")
    public static void method3601() {
        field574.method2654(class313.method7156(class311.field3283, field574.field1438));
        field589 = 0;
    }

    @ObfuscatedName("ai.oq(I)V")
    public static void method165() {
        if (field589 == 1) {
            field610 = true;
        }
    }

    @ObfuscatedName("fs.ov(I)V")
    public static void method3015() {
        if (!field610 || Statics.field1608 == null) {
            return;
        }
        int var0 = Statics.field1608.field1271[0];
        int var1 = Statics.field1608.field1272[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1956 = Statics.field1608.field1220;
        int var2 = method292(Statics.field1608.field1220, Statics.field1608.field1260, Statics.field1861) - field551;
        if (var2 < Statics.field2199) {
            Statics.field2199 = var2;
        }
        Statics.field2640 = Statics.field1608.field1260;
        field610 = false;
    }

    @ObfuscatedName("nj.op(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method5709(String arg0) {
        class373[] var1 = class373.method6211();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class373 var3 = var1[var2];
            if (var3.field4341 != -1 && arg0.startsWith(class103.method6233(var3.field4341))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4341).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cp.ox(I)V")
    public static void method1134() {
        if (Statics.field1622 == null) {
            return;
        }
        field809 = field523;
        Statics.field1622.method6529();
        for (int var0 = 0; var0 < field636.length; var0++) {
            if (field636[var0] != null) {
                Statics.field1622.method6531((field636[var0].field1220 >> 7) + Statics.field481, (field636[var0].field1260 >> 7) + Statics.field99);
            }
        }
    }

    @ObfuscatedName("du.ow(Lcu;I)V")
    public static void method2531(class68 arg0) {
        if (Statics.field895 != arg0) {
            Statics.field895 = arg0;
        }
    }

    @ObfuscatedName("kl.ou(ZI)V")
    public static void method5201(boolean arg0) {
        field810 = arg0;
    }

    @ObfuscatedName("pv.od(II)Luh;")
    public static class527 method6559(int arg0) {
        class527 var1 = (class527) field806.method5336((long) arg0);
        if (var1 == null) {
            var1 = new class527(Statics.field4744, class529.method3714(arg0), class529.method3106(arg0));
            field806.method5346(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("bo.oi(II)V")
    public static void method449(int arg0) {
        class225 var1 = class225.method288(arg0);
        if (var1.method3940() && class225.method3395(var1.field2382) == 2) {
            field534.add(var1.field2382);
        }
    }

    @ObfuscatedName("kj.oo(B)V")
    public static void method4828() {
        for (int var0 = 0; var0 < field534.size(); var0++) {
            if (class225.method3395((Integer) field534.get(var0)) != 2) {
                field534.remove(var0);
                var0--;
            }
        }
    }

    @ObfuscatedName("na.oy(I)Low;")
    public static class380 method5699() {
        return Statics.field1024;
    }

    @ObfuscatedName("client.og(IB)V")
    public void method1169(int arg0) {
        class313 var2 = class313.method7156(class311.field3206, field574.field1438);
        var2.field3318.method8445(arg0);
        field574.method2654(var2);
    }

    @ObfuscatedName("client.oa(II)V")
    public void method1170(int arg0) {
        class313 var2 = class313.method7156(class311.field3275, field574.field1438);
        var2.field3318.method8445(arg0);
        field574.method2654(var2);
    }
}

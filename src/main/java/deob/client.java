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
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class402, OAuthApi {

    @ObfuscatedName("client.bh")
    public static boolean field604 = true;

    @ObfuscatedName("client.bw")
    public static int field579 = 1;

    @ObfuscatedName("client.ce")
    public static int field489 = 0;

    @ObfuscatedName("client.cs")
    public static int field490 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field492 = false;

    @ObfuscatedName("client.cu")
    public static boolean field493 = false;

    @ObfuscatedName("client.cl")
    public static int field494 = -1;

    @ObfuscatedName("client.cg")
    public static int field495 = -1;

    @ObfuscatedName("client.cr")
    public static int field496 = -1;

    @ObfuscatedName("client.cy")
    public static boolean field562 = false;

    @ObfuscatedName("client.cx")
    public static int field498 = 213;

    @ObfuscatedName("client.dw")
    public static int field499 = 0;

    @ObfuscatedName("client.da")
    public static boolean field500 = true;

    @ObfuscatedName("client.ep")
    public static int field602 = 0;

    @ObfuscatedName("client.eo")
    public static long field502 = -1L;

    @ObfuscatedName("client.et")
    public static int field503 = -1;

    @ObfuscatedName("client.ef")
    public static int field504 = -1;

    @ObfuscatedName("client.ez")
    public static long field605 = -1L;

    @ObfuscatedName("client.ej")
    public static boolean field506 = true;

    @ObfuscatedName("client.ea")
    public static int field545 = 0;

    @ObfuscatedName("client.eu")
    public static int field508 = 0;

    @ObfuscatedName("client.es")
    public static int field509 = 0;

    @ObfuscatedName("client.eb")
    public static int field510 = 0;

    @ObfuscatedName("client.el")
    public static int field654 = 0;

    @ObfuscatedName("client.en")
    public static int field512 = 0;

    @ObfuscatedName("client.er")
    public static int field547 = 0;

    @ObfuscatedName("client.eg")
    public static int field766 = 0;

    @ObfuscatedName("client.ed")
    public static int field705 = 0;

    @ObfuscatedName("client.em")
    public static class99 field501 = class99.field1309;

    @ObfuscatedName("client.ew")
    public static class99 field517 = class99.field1309;

    @ObfuscatedName("client.ex")
    public static boolean field518 = false;

    @ObfuscatedName("client.fi")
    public static int field519 = 0;

    @ObfuscatedName("client.fp")
    public static int field520 = 0;

    @ObfuscatedName("client.fo")
    public static int field521 = 0;

    @ObfuscatedName("client.gj")
    public static int field522 = 0;

    @ObfuscatedName("client.ge")
    public static int field765 = 0;

    @ObfuscatedName("client.ga")
    public static int field524 = 0;

    @ObfuscatedName("client.gt")
    public static int field525 = 0;

    @ObfuscatedName("client.gu")
    public static int field526 = 0;

    @ObfuscatedName("client.gh")
    public static class136 field527 = class136.field1622;

    @ObfuscatedName("client.gy")
    public static class494 field528 = class494.field5049;

    @ObfuscatedName("client.gx")
    public String field529;

    @ObfuscatedName("client.gl")
    public class15 field662;

    @ObfuscatedName("client.gz")
    public class19 field523;

    @ObfuscatedName("client.hw")
    public OtlTokenRequester field532;

    @ObfuscatedName("client.hi")
    public Future field533;

    @ObfuscatedName("client.hj")
    public boolean field534 = false;

    @ObfuscatedName("client.hm")
    public class19 field543;

    @ObfuscatedName("client.hu")
    public RefreshAccessTokenRequester field552;

    @ObfuscatedName("client.hx")
    public Future field537;

    @ObfuscatedName("client.hd")
    public static final String field538 = class371.method4953(class369.method5488("com_jagex_auth_desktop_osrs:public"));

    @ObfuscatedName("client.hb")
    public static boolean field540 = false;

    @ObfuscatedName("client.hq")
    public static class74 field541 = new class74();

    @ObfuscatedName("client.ha")
    public class489 field542;

    @ObfuscatedName("client.hp")
    public class8 field554;

    @ObfuscatedName("client.he")
    public long field544 = -1L;

    @ObfuscatedName("client.hf")
    public static byte[] field536 = null;

    @ObfuscatedName("client.iu")
    public static class96[] field546 = new class96[65536];

    @ObfuscatedName("client.iw")
    public static int field737 = 0;

    @ObfuscatedName("client.iy")
    public static int[] field548 = new int[65536];

    @ObfuscatedName("client.ig")
    public static int field549 = 0;

    @ObfuscatedName("client.ih")
    public static int[] field550 = new int[250];

    @ObfuscatedName("client.in")
    public static final class107 field753 = new class107();

    @ObfuscatedName("client.ii")
    public static int field761 = 0;

    @ObfuscatedName("client.ik")
    public static boolean field553 = false;

    @ObfuscatedName("client.ie")
    public static class389 field516 = new class389();

    @ObfuscatedName("client.im")
    public static HashMap field718 = new HashMap();

    @ObfuscatedName("client.it")
    public static String field497 = null;

    @ObfuscatedName("client.jx")
    public static int field560 = 0;

    @ObfuscatedName("client.jo")
    public static int field726 = 1;

    @ObfuscatedName("client.jk")
    public static int field558 = 0;

    @ObfuscatedName("client.jq")
    public static int field559 = 1;

    @ObfuscatedName("client.je")
    public static int field622 = 0;

    @ObfuscatedName("client.jr")
    public static class209[] field561 = new class209[4];

    @ObfuscatedName("client.jv")
    public static boolean field689 = false;

    @ObfuscatedName("client.jh")
    public static int[][][] field563 = new int[4][13][13];

    @ObfuscatedName("client.jy")
    public static final int[] field564 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ja")
    public static int field565 = 0;

    @ObfuscatedName("client.kq")
    public static int field576 = 2301979;

    @ObfuscatedName("client.kw")
    public static int field584 = 5063219;

    @ObfuscatedName("client.kk")
    public static int field568 = 3353893;

    @ObfuscatedName("client.kj")
    public static int field569 = 7759444;

    @ObfuscatedName("client.ki")
    public static boolean field570 = false;

    @ObfuscatedName("client.ko")
    public static int field571 = 0;

    @ObfuscatedName("client.kp")
    public static int field595 = 128;

    @ObfuscatedName("client.kf")
    public static int field758 = 0;

    @ObfuscatedName("client.ks")
    public static int field704 = 0;

    @ObfuscatedName("client.kn")
    public static int field575 = 0;

    @ObfuscatedName("client.kz")
    public static int field580 = 0;

    @ObfuscatedName("client.km")
    public static int field681 = 0;

    @ObfuscatedName("client.lv")
    public static int field505 = 0;

    @ObfuscatedName("client.lm")
    public static int field771 = 50;

    @ObfuscatedName("client.li")
    public static int field778 = 0;

    @ObfuscatedName("client.lu")
    public static int field729 = 0;

    @ObfuscatedName("client.lk")
    public static int field531 = 0;

    @ObfuscatedName("client.la")
    public static int field583 = 12;

    @ObfuscatedName("client.lp")
    public static int field711 = 6;

    @ObfuscatedName("client.ly")
    public static int field577 = 0;

    @ObfuscatedName("client.ln")
    public static boolean field586 = false;

    @ObfuscatedName("client.lt")
    public static int field619 = 0;

    @ObfuscatedName("client.lz")
    public static boolean field757 = false;

    @ObfuscatedName("client.lc")
    public static int field589 = 0;

    @ObfuscatedName("client.ld")
    public static int field590 = 0;

    @ObfuscatedName("client.lq")
    public static int field591 = 50;

    @ObfuscatedName("client.lj")
    public static int[] field592 = new int[field591];

    @ObfuscatedName("client.ll")
    public static int[] field593 = new int[field591];

    @ObfuscatedName("client.le")
    public static int[] field594 = new int[field591];

    @ObfuscatedName("client.lb")
    public static int[] field608 = new int[field591];

    @ObfuscatedName("client.lx")
    public static int[] field587 = new int[field591];

    @ObfuscatedName("client.lo")
    public static int[] field597 = new int[field591];

    @ObfuscatedName("client.lw")
    public static int[] field567 = new int[field591];

    @ObfuscatedName("client.lr")
    public static String[] field599 = new String[field591];

    @ObfuscatedName("client.mt")
    public static int[][] field535 = new int[104][104];

    @ObfuscatedName("client.mw")
    public static int field601 = 0;

    @ObfuscatedName("client.mz")
    public static int field708 = -1;

    @ObfuscatedName("client.mu")
    public static int field572 = -1;

    @ObfuscatedName("client.mq")
    public static int field515 = 0;

    @ObfuscatedName("client.mm")
    public static int field676 = 0;

    @ObfuscatedName("client.me")
    public static int field606 = 0;

    @ObfuscatedName("client.mv")
    public static int field607 = 0;

    @ObfuscatedName("client.mx")
    public static boolean field696 = true;

    @ObfuscatedName("client.ma")
    public static int field609 = 0;

    @ObfuscatedName("client.mj")
    public static boolean field610 = true;

    @ObfuscatedName("client.mc")
    public static class88[] field611 = new class88[2048];

    @ObfuscatedName("client.mg")
    public static int field664 = -1;

    @ObfuscatedName("client.mo")
    public static int field613 = 0;

    @ObfuscatedName("client.mn")
    public static long field614 = -1L;

    @ObfuscatedName("client.md")
    public static boolean field615 = true;

    @ObfuscatedName("client.mk")
    public static int field612 = 0;

    @ObfuscatedName("client.mb")
    public static int field617 = 0;

    @ObfuscatedName("client.nz")
    public static int[] field618 = new int[1000];

    @ObfuscatedName("client.ns")
    public static final int[] field598 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.nd")
    public static String[] field736 = new String[8];

    @ObfuscatedName("client.no")
    public static boolean[] field588 = new boolean[8];

    @ObfuscatedName("client.nm")
    public static int[] field694 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.nl")
    public static int field623 = -1;

    @ObfuscatedName("client.nr")
    public static class363[][][] field624 = new class363[4][104][104];

    @ObfuscatedName("client.nn")
    public static class363 field574 = new class363();

    @ObfuscatedName("client.na")
    public static class363 field551 = new class363();

    @ObfuscatedName("client.np")
    public static class363 field627 = new class363();

    @ObfuscatedName("client.ng")
    public static int[] field743 = new int[25];

    @ObfuscatedName("client.ny")
    public static int[] field629 = new int[25];

    @ObfuscatedName("client.nu")
    public static int[] field630 = new int[25];

    @ObfuscatedName("client.nb")
    public static boolean field631 = false;

    @ObfuscatedName("client.nt")
    public static boolean field669 = false;

    @ObfuscatedName("client.ne")
    public static int field633 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field634 = new int[500];

    @ObfuscatedName("client.ni")
    public static int[] field635 = new int[500];

    @ObfuscatedName("client.nh")
    public static int[] field636 = new int[500];

    @ObfuscatedName("client.nq")
    public static int[] field637 = new int[500];

    @ObfuscatedName("client.oi")
    public static int[] field638 = new int[500];

    @ObfuscatedName("client.og")
    public static String[] field639 = new String[500];

    @ObfuscatedName("client.ok")
    public static String[] field581 = new String[500];

    @ObfuscatedName("client.ox")
    public static boolean[] field641 = new boolean[500];

    @ObfuscatedName("client.ov")
    public static boolean field642 = false;

    @ObfuscatedName("client.ol")
    public static boolean field643 = false;

    @ObfuscatedName("client.oz")
    public static boolean field644 = true;

    @ObfuscatedName("client.of")
    public static int field645 = -1;

    @ObfuscatedName("client.oy")
    public static int field646 = -1;

    @ObfuscatedName("client.oe")
    public static int field647 = 0;

    @ObfuscatedName("client.on")
    public static int field648 = 50;

    @ObfuscatedName("client.oq")
    public static int field649 = 0;

    @ObfuscatedName("client.om")
    public static boolean field651 = false;

    @ObfuscatedName("client.oa")
    public static int field658 = -1;

    @ObfuscatedName("client.op")
    public static int field600 = -1;

    @ObfuscatedName("client.oj")
    public static String field663 = null;

    @ObfuscatedName("client.ob")
    public static String field655 = null;

    @ObfuscatedName("client.or")
    public static int field656 = -1;

    @ObfuscatedName("client.oc")
    public static class465 field657 = new class465(8);

    @ObfuscatedName("client.pc")
    public static int field596 = 0;

    @ObfuscatedName("client.pp")
    public static int field659 = -1;

    @ObfuscatedName("client.py")
    public static int field626 = 0;

    @ObfuscatedName("client.pg")
    public static class317 field661 = null;

    @ObfuscatedName("client.pk")
    public static int field625 = 0;

    @ObfuscatedName("client.pj")
    public static int field683 = 0;

    @ObfuscatedName("client.pu")
    public static int field682 = 0;

    @ObfuscatedName("client.pt")
    public static int field665 = -1;

    @ObfuscatedName("client.po")
    public static boolean field666 = false;

    @ObfuscatedName("client.ps")
    public static class317 field667 = null;

    @ObfuscatedName("client.pr")
    public static class317 field511 = null;

    @ObfuscatedName("client.pf")
    public static class317 field539 = null;

    @ObfuscatedName("client.pd")
    public static int field670 = 0;

    @ObfuscatedName("client.pw")
    public static int field671 = 0;

    @ObfuscatedName("client.pz")
    public static class317 field672 = null;

    @ObfuscatedName("client.pq")
    public static boolean field673 = false;

    @ObfuscatedName("client.pi")
    public static int field628 = -1;

    @ObfuscatedName("client.pb")
    public static int field675 = -1;

    @ObfuscatedName("client.px")
    public static boolean field756 = false;

    @ObfuscatedName("client.ph")
    public static int field677 = -1;

    @ObfuscatedName("client.pv")
    public static int field678 = -1;

    @ObfuscatedName("client.pn")
    public static boolean field724 = false;

    @ObfuscatedName("client.qu")
    public static int field680 = 1;

    @ObfuscatedName("client.qr")
    public static int[] field740 = new int[32];

    @ObfuscatedName("client.qx")
    public static int field514 = 0;

    @ObfuscatedName("client.qj")
    public static int[] field720 = new int[32];

    @ObfuscatedName("client.qc")
    public static int field684 = 0;

    @ObfuscatedName("client.qs")
    public static int[] field685 = new int[32];

    @ObfuscatedName("client.qf")
    public static int field686 = 0;

    @ObfuscatedName("client.qt")
    public static int[] field687 = new int[32];

    @ObfuscatedName("client.qn")
    public static int field688 = 0;

    @ObfuscatedName("client.qb")
    public static int field752 = 0;

    @ObfuscatedName("client.qg")
    public static int field690 = 0;

    @ObfuscatedName("client.qd")
    public static int field691 = 0;

    @ObfuscatedName("client.qy")
    public static int field692 = 0;

    @ObfuscatedName("client.qz")
    public static int field693 = 0;

    @ObfuscatedName("client.qq")
    public static int field763 = 0;

    @ObfuscatedName("client.qv")
    public static int field769 = 0;

    @ObfuscatedName("client.qa")
    public static int field566 = 0;

    @ObfuscatedName("client.rd")
    public static int field697 = 0;

    @ObfuscatedName("client.rl")
    public static class507 field698 = new class507();

    @ObfuscatedName("client.rq")
    public static class363 field699 = new class363();

    @ObfuscatedName("client.rt")
    public static class363 field700 = new class363();

    @ObfuscatedName("client.rp")
    public static class363 field701 = new class363();

    @ObfuscatedName("client.re")
    public static class363 field702 = new class363();

    @ObfuscatedName("client.rv")
    public static class465 field703 = new class465(512);

    @ObfuscatedName("client.rr")
    public static int field781 = 0;

    @ObfuscatedName("client.rs")
    public static int field660 = -2;

    @ObfuscatedName("client.rf")
    public static boolean[] field706 = new boolean[100];

    @ObfuscatedName("client.rm")
    public static boolean[] field707 = new boolean[100];

    @ObfuscatedName("client.rw")
    public static boolean[] field652 = new boolean[100];

    @ObfuscatedName("client.rh")
    public static int[] field709 = new int[100];

    @ObfuscatedName("client.rb")
    public static int[] field710 = new int[100];

    @ObfuscatedName("client.ra")
    public static int[] field640 = new int[100];

    @ObfuscatedName("client.ri")
    public static int[] field712 = new int[100];

    @ObfuscatedName("client.rg")
    public static int field713 = 0;

    @ObfuscatedName("client.rj")
    public static long field714 = 0L;

    @ObfuscatedName("client.ro")
    public static boolean field715 = true;

    @ObfuscatedName("client.sy")
    public static int[] field716 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.sj")
    public static int field717 = 0;

    @ObfuscatedName("client.su")
    public static int field578 = 0;

    @ObfuscatedName("client.ss")
    public static String field719 = "";

    @ObfuscatedName("client.st")
    public static long[] field786 = new long[100];

    @ObfuscatedName("client.sf")
    public static int field721 = 0;

    @ObfuscatedName("client.sh")
    public static class208 field722 = new class208();

    @ObfuscatedName("client.si")
    public static class206 field723 = new class206();

    @ObfuscatedName("client.sm")
    public static int field488 = 0;

    @ObfuscatedName("client.sk")
    public static int[] field725 = new int[128];

    @ObfuscatedName("client.sz")
    public static int[] field557 = new int[128];

    @ObfuscatedName("client.sc")
    public static long field727 = -1L;

    @ObfuscatedName("client.sg")
    public static class151[] field750 = new class151[4];

    @ObfuscatedName("client.so")
    public static class160[] field679 = new class160[4];

    @ObfuscatedName("client.sp")
    public static int field730 = -1;

    @ObfuscatedName("client.sr")
    public static int field731 = 0;

    @ObfuscatedName("client.tw")
    public static int[] field620 = new int[1000];

    @ObfuscatedName("client.ty")
    public static int[] field733 = new int[1000];

    @ObfuscatedName("client.ts")
    public static class503[] field734 = new class503[1000];

    @ObfuscatedName("client.te")
    public static int field735 = 0;

    @ObfuscatedName("client.th")
    public static int field487 = 0;

    @ObfuscatedName("client.tp")
    public static int field653 = 0;

    @ObfuscatedName("client.tz")
    public static int field650 = -1;

    @ObfuscatedName("client.tf")
    public static boolean field739 = false;

    @ObfuscatedName("client.tl")
    public static int field507 = 0;

    @ObfuscatedName("client.tu")
    public static int[] field741 = new int[50];

    @ObfuscatedName("client.tr")
    public static int[] field603 = new int[50];

    @ObfuscatedName("client.tg")
    public static int[] field556 = new int[50];

    @ObfuscatedName("client.tb")
    public static int[] field744 = new int[50];

    @ObfuscatedName("client.ti")
    public static class40[] field745 = new class40[50];

    @ObfuscatedName("client.uj")
    public static boolean field746 = false;

    @ObfuscatedName("client.ub")
    public static boolean field674 = false;

    @ObfuscatedName("client.uc")
    public static boolean field748 = false;

    @ObfuscatedName("client.ud")
    public static boolean field749 = false;

    @ObfuscatedName("client.ui")
    public static class456 field668 = null;

    @ObfuscatedName("client.ua")
    public static class455 field751 = null;

    @ObfuscatedName("client.uz")
    public static class455 field738 = null;

    @ObfuscatedName("client.uk")
    public static boolean field732 = false;

    @ObfuscatedName("client.ue")
    public static boolean[] field754 = new boolean[5];

    @ObfuscatedName("client.vq")
    public static int[] field755 = new int[5];

    @ObfuscatedName("client.vw")
    public static int[] field777 = new int[5];

    @ObfuscatedName("client.vf")
    public static int[] field632 = new int[5];

    @ObfuscatedName("client.vg")
    public static int[] field585 = new int[5];

    @ObfuscatedName("client.vv")
    public static short field759 = 256;

    @ObfuscatedName("client.va")
    public static short field760 = 205;

    @ObfuscatedName("client.vl")
    public static short field775 = 256;

    @ObfuscatedName("client.ve")
    public static short field762 = 320;

    @ObfuscatedName("client.vm")
    public static short field573 = 1;

    @ObfuscatedName("client.vn")
    public static short field764 = 32767;

    @ObfuscatedName("client.vo")
    public static short field621 = 1;

    @ObfuscatedName("client.vk")
    public static short field695 = 32767;

    @ObfuscatedName("client.vd")
    public static int field555 = 0;

    @ObfuscatedName("client.vx")
    public static int field768 = 0;

    @ObfuscatedName("client.vp")
    public static int field767 = 0;

    @ObfuscatedName("client.vy")
    public static int field770 = 0;

    @ObfuscatedName("client.vi")
    public static int field582 = 0;

    @ObfuscatedName("client.vh")
    public static class314 field772 = new class314();

    @ObfuscatedName("client.vr")
    public static int field773 = -1;

    @ObfuscatedName("client.vu")
    public static int field774 = -1;

    @ObfuscatedName("client.vc")
    public static class452 field616 = new class450();

    @ObfuscatedName("client.vs")
    public static class353[] field776 = new class353[8];

    @ObfuscatedName("client.wg")
    public static class63 field513 = new class63();

    @ObfuscatedName("client.wx")
    public static class399 field742 = new class399(8, class397.field4533);

    @ObfuscatedName("client.wq")
    public static class280 field779 = new class280(64);

    @ObfuscatedName("client.ww")
    public static class280 field780 = new class280(64);

    @ObfuscatedName("client.wi")
    public static int field747 = -1;

    @ObfuscatedName("client.wn")
    public static int field782 = -1;

    @ObfuscatedName("client.wz")
    public static List field783 = new ArrayList();

    @ObfuscatedName("client.we")
    public static ArrayList field784 = new ArrayList(10);

    @ObfuscatedName("client.wy")
    public static int field785 = 0;

    @ObfuscatedName("client.ws")
    public static int field530 = 0;

    @ObfuscatedName("client.xr")
    public static final class62 field787 = new class62();

    @ObfuscatedName("client.xm")
    public static int[] field788 = new int[50];

    @ObfuscatedName("client.xn")
    public static int[] field789 = new int[50];

    @ObfuscatedName("dz.gb(I)Lrb;")
    public static class459 method2239() {
        return Statics.field1542;
    }

    @ObfuscatedName("client.ba(I)V")
    public final void method545() {
    }

    public final void init() {
        if (!this.method525()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class97.field1285)) {
                            field492 = true;
                        } else {
                            field492 = false;
                        }
                        break;
                    case 4:
                        if (field495 == -1) {
                            field495 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field489 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field1736 = class359.method6287(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field2612 = class332.method3068(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class97.field1285)) {
                        }
                        break;
                    case 9:
                        Statics.field1404 = var2;
                        break;
                    case 10:
                        Statics.field491 = (class333) Statics.method3600(class333.method3289(), Integer.parseInt(var2));
                        if (Statics.field491 == class333.field3807) {
                            Statics.field889 = class469.field4909;
                        } else {
                            Statics.field889 = class469.field4915;
                        }
                        break;
                    case 11:
                        Statics.field2775 = var2;
                        break;
                    case 12:
                        field579 = Integer.parseInt(var2);
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
                        Statics.field4601 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field490 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field4295 = var2;
                        break;
                    case 21:
                        field494 = Integer.parseInt(var2);
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            field498 = Integer.parseInt(var2);
                        } else {
                            field498 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        class223.field2551 = false;
        field493 = false;
        Statics.field1420 = this.getCodeBase().getHost();
        String var4 = Statics.field2612.field3803;
        byte var5 = 0;
        try {
            Statics.field1833 = 22;
            Statics.field1838 = var5;
            try {
                Statics.field4339 = System.getProperty("os.name");
            } catch (Exception var25) {
                Statics.field4339 = "Unknown";
            }
            Statics.field2982 = Statics.field4339.toLowerCase();
            try {
                Statics.field2000 = System.getProperty("user.home");
                if (Statics.field2000 != null) {
                    Statics.field2000 = Statics.field2000 + "/";
                }
            } catch (Exception var24) {
            }
            try {
                if (Statics.field2982.startsWith("win")) {
                    if (Statics.field2000 == null) {
                        Statics.field2000 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2000 == null) {
                    Statics.field2000 = System.getenv("HOME");
                }
                if (Statics.field2000 != null) {
                    Statics.field2000 = Statics.field2000 + "/";
                }
            } catch (Exception var23) {
            }
            if (Statics.field2000 == null) {
                Statics.field2000 = "~/";
            }
            Statics.field1577 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2000, "/tmp/", "" };
            Statics.field1292 = new String[] { ".jagex_cache_" + Statics.field1838, ".file_store_" + Statics.field1838 };
            label153: for (int var9 = 0; var9 < 4; var9++) {
                Statics.field3832 = class170.method3136("oldschool", var4, var9);
                if (!Statics.field3832.exists()) {
                    Statics.field3832.mkdirs();
                }
                File[] var10 = Statics.field3832.listFiles();
                if (var10 == null) {
                    break;
                }
                File[] var11 = var10;
                int var12 = 0;
                while (true) {
                    if (var12 >= var11.length) {
                        break label153;
                    }
                    File var13 = var11[var12];
                    boolean var16;
                    try {
                        RandomAccessFile var14 = new RandomAccessFile(var13, "rw");
                        int var15 = var14.read();
                        var14.seek(0L);
                        var14.write(var15);
                        var14.seek(0L);
                        var14.close();
                        var16 = true;
                    } catch (Exception var22) {
                        var16 = false;
                    }
                    if (!var16) {
                        break;
                    }
                    var12++;
                }
            }
            File var18 = Statics.field3832;
            Statics.field5152 = var18;
            if (!Statics.field5152.exists()) {
                throw new RuntimeException("");
            }
            class172.field1842 = true;
            class170.method2116();
            class170.field1836 = new class472(new class471(class172.method3031("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class170.field1841 = new class472(new class471(class172.method3031("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field4375 = new class472[Statics.field1833];
            for (int var19 = 0; var19 < Statics.field1833; var19++) {
                Statics.field4375[var19] = new class472(new class471(class172.method3031("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var26) {
            class516.method6950((String) null, var26);
        }
        Statics.field466 = this;
        Statics.field5157 = field495;
        Statics.field4348 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field1319 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field3476 = System.getenv("JX_SESSION_ID");
        Statics.field1472 = System.getenv("JX_CHARACTER_ID");
        String var21 = System.getenv("JX_DISPLAY_NAME");
        class72.field912 = class470.method462(var21);
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field534 = true;
        }
        if (field496 == -1) {
            if (this.method1344() || this.method1163()) {
                field496 = 5;
            } else {
                field496 = 0;
            }
        }
        this.method605(765, 503, 213, 1);
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field532 = arg0;
            class72.method2964(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field552 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field499 == 10;
    }

    public long getAccountHash() {
        return this.field544;
    }

    @ObfuscatedName("client.gn(I)Z")
    public boolean method1344() {
        return Statics.field4348 != null && !Statics.field4348.trim().isEmpty() && Statics.field1319 != null && !Statics.field1319.trim().isEmpty();
    }

    @ObfuscatedName("client.gv(B)Z")
    public boolean method1163() {
        return Statics.field3476 != null && !Statics.field3476.trim().isEmpty() && Statics.field1472 != null && !Statics.field1472.trim().isEmpty();
    }

    @ObfuscatedName("client.gx(B)Z")
    public boolean method1164() {
        return this.field532 != null;
    }

    @ObfuscatedName("client.gl(Ljava/lang/String;I)V")
    public void method1165(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field2775 + "shield/oauth/token" + (new class439(var2)).method7619());
        class395 var4 = new class395();
        var4.method6995(field538);
        var4.method6977("Host", (new URL(Statics.field2775)).getHost());
        var4.method6984(class436.field4704);
        class10 var5 = class10.field46;
        RefreshAccessTokenRequester var6 = this.field552;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field534);
            this.field543 = this.field662.method172(var7);
        } else {
            this.field537 = var6.request(var5.method67(), var3, var4.method6976(), "");
        }
    }

    @ObfuscatedName("client.gz(Ljava/lang/String;I)V")
    public void method1544(String arg0) throws IOException {
        URL var2 = new URL(Statics.field2775 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class395 var3 = new class395();
        var3.method6981(arg0);
        class10 var4 = class10.field40;
        OtlTokenRequester var5 = this.field532;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field534);
            this.field523 = this.field662.method172(var6);
        } else {
            this.field533 = var5.request(var4.method67(), var2, var3.method6976(), "");
        }
    }

    @ObfuscatedName("client.hw(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1167(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field2775 + "/game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field46, this.field534);
        var4.method77().method6981(arg0);
        var4.method77().method6984(class436.field4704);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method90(new class438(var5));
        this.field523 = this.field662.method172(var4);
    }

    @ObfuscatedName("client.bm(B)V")
    public final void method542() {
        class387.method3017(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field4569 = field490 == 0 ? 43594 : field579 + 40000;
        Statics.field1566 = field490 == 0 ? 443 : field579 + 50000;
        Statics.field1024 = Statics.field4569;
        Statics.field3518 = class316.field3551;
        Statics.field3508 = class316.field3550;
        Statics.field2957 = class316.field3552;
        Statics.field4708 = class316.field3553;
        Statics.field78 = new class109(this.field534, 213);
        this.method514();
        this.method642();
        Statics.field1489 = this.method510();
        this.method516(field723, 0);
        this.method516(field722, 1);
        Statics.field3036 = new class418(255, class170.field1836, class170.field1841, 500000);
        Statics.field112 = class94.method3874();
        this.method636();
        String var2 = Statics.field270;
        class32.field175 = this;
        if (var2 != null) {
            class32.field176 = var2;
        }
        method1062(Statics.field112.method2349());
        Statics.field804 = new class65(Statics.field889);
        this.field662 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.bd(I)V")
    public final void method530() {
        field602++;
        this.method1168();
        while (true) {
            class363 var1 = class341.field4196;
            class340 var2;
            synchronized (class341.field4196) {
                var2 = (class340) class341.field4195.method6327();
            }
            if (var2 == null) {
                try {
                    if (class298.field3389 == 1) {
                        int var4 = Statics.field4942.method5299();
                        if (var4 > 0 && Statics.field4942.method5219()) {
                            int var5 = var4 - Statics.field1789;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field4942.method5212(var5);
                        } else {
                            Statics.field4942.method5218();
                            Statics.field4942.method5216();
                            if (Statics.field3388 == null) {
                                class298.field3389 = 0;
                            } else {
                                class298.field3389 = 2;
                            }
                            Statics.field2382 = null;
                            Statics.field3390 = null;
                        }
                    }
                } catch (Exception var12) {
                    var12.printStackTrace();
                    Statics.field4942.method5218();
                    class298.field3389 = 0;
                    Statics.field2382 = null;
                    Statics.field3390 = null;
                    Statics.field3388 = null;
                }
                method5961();
                field722.method3880();
                this.method533();
                class36 var7 = class36.field235;
                synchronized (class36.field235) {
                    class36.field232 = class36.field237;
                    class36.field242 = class36.field238;
                    class36.field243 = class36.field245;
                    class36.field246 = class36.field241;
                    class36.field252 = class36.field244;
                    class36.field250 = class36.field236;
                    class36.field251 = class36.field247;
                    class36.field249 = class36.field248;
                    class36.field244 = 0;
                }
                if (Statics.field1489 != null) {
                    int var9 = Statics.field1489.method300();
                    field697 = var9;
                }
                if (field499 == 0) {
                    method311();
                    Statics.method2498();
                } else if (field499 == 5) {
                    class72.method3442(this, Statics.field4327, Statics.field2832);
                    method311();
                    Statics.method2498();
                } else if (field499 == 10 || field499 == 11) {
                    class72.method3442(this, Statics.field4327, Statics.field2832);
                } else if (field499 == 20) {
                    class72.method3442(this, Statics.field4327, Statics.field2832);
                    this.method1171();
                } else if (field499 == 50) {
                    class72.method3442(this, Statics.field4327, Statics.field2832);
                    this.method1171();
                } else if (field499 == 25) {
                    method411();
                }
                if (field499 == 30) {
                    this.method1172();
                } else if (field499 == 40 || field499 == 45) {
                    this.method1171();
                }
                return;
            }
            var2.field4193.method6023(var2.field4192, (int) var2.field4745, var2.field4191, false);
        }
    }

    @ObfuscatedName("client.bt(ZS)V")
    public final void method537(boolean arg0) {
        boolean var2;
        label143: {
            try {
                if (class298.field3389 == 2) {
                    if (Statics.field2382 == null) {
                        Statics.field2382 = class303.method5391(Statics.field3388, Statics.field4411, Statics.field1913);
                        if (Statics.field2382 == null) {
                            var2 = false;
                            break label143;
                        }
                    }
                    if (Statics.field3390 == null) {
                        Statics.field3390 = new class46(Statics.field3387, Statics.field3386);
                    }
                    if (Statics.field4942.method5214(Statics.field2382, Statics.field3385, Statics.field3390, 22050)) {
                        Statics.field4942.method5293();
                        Statics.field4942.method5212(Statics.field1324);
                        Statics.field4942.method5217(Statics.field2382, Statics.field1459);
                        class298.field3389 = 0;
                        Statics.field2382 = null;
                        Statics.field3390 = null;
                        Statics.field3388 = null;
                        var2 = true;
                        break label143;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field4942.method5218();
                class298.field3389 = 0;
                Statics.field2382 = null;
                Statics.field3390 = null;
                Statics.field3388 = null;
            }
            var2 = false;
        }
        if (var2 && field739 && Statics.field163 != null) {
            Statics.field163.method824();
        }
        if ((field499 == 10 || field499 == 20 || field499 == 30) && field714 != 0L && class294.method2504() > field714) {
            method1062(method6195());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field706[var5] = true;
            }
        }
        if (field499 == 0) {
            this.method539(class72.field897, class72.field902, arg0);
        } else if (field499 == 5) {
            class72.method38(Statics.field1635, Statics.field4327, Statics.field2832);
        } else if (field499 == 10 || field499 == 11) {
            class72.method38(Statics.field1635, Statics.field4327, Statics.field2832);
        } else if (field499 == 20) {
            class72.method38(Statics.field1635, Statics.field4327, Statics.field2832);
        } else if (field499 == 50) {
            class72.method38(Statics.field1635, Statics.field4327, Statics.field2832);
        } else if (field499 == 25) {
            if (field622 == 1) {
                if (field560 > field726) {
                    field726 = field560;
                }
                int var6 = (field726 * 50 - field560 * 50) / field726;
                method4988(class337.field3961 + class97.field1290 + class97.field1287 + var6 + "%" + class97.field1288, false);
            } else if (field622 == 2) {
                if (field558 > field559) {
                    field559 = field558;
                }
                int var7 = (field559 * 50 - field558 * 50) / field559 + 50;
                method4988(class337.field3961 + class97.field1290 + class97.field1287 + var7 + "%" + class97.field1288, false);
            } else {
                method4988(class337.field3961, false);
            }
        } else if (field499 == 30) {
            this.method1174();
        } else if (field499 == 40) {
            method4988(class337.field4141 + class97.field1290 + class337.field3885, false);
        } else if (field499 == 45) {
            method4988(class337.field4008, false);
        }
        if (field499 == 30 && field713 == 0 && !arg0 && !field715) {
            for (int var8 = 0; var8 < field781; var8++) {
                if (field707[var8]) {
                    Statics.field2381.method482(field709[var8], field710[var8], field640[var8], field712[var8]);
                    field707[var8] = false;
                }
            }
        } else if (field499 > 0) {
            Statics.field2381.method476(0, 0);
            for (int var9 = 0; var9 < field781; var9++) {
                field707[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.bj(I)V")
    public final void method534() {
        if (Statics.field4387.method2610()) {
            Statics.field4387.method2583();
        }
        if (Statics.field1449 != null) {
            Statics.field1449.field1062 = false;
        }
        Statics.field1449 = null;
        field753.method2652();
        class36.method1929();
        Statics.field1489 = null;
        if (Statics.field163 != null) {
            Statics.field163.method808();
        }
        if (Statics.field1997 != null) {
            Statics.field1997.method808();
        }
        class345.method5193();
        class341.method3055();
        if (Statics.field78 != null) {
            Statics.field78.method2676();
            Statics.field78 = null;
        }
        try {
            class170.field1836.method8026();
            for (int var1 = 0; var1 < Statics.field1833; var1++) {
                Statics.field4375[var1].method8026();
            }
            class170.field1841.method8026();
            class170.field1835.method8026();
        } catch (Exception var3) {
        }
        this.field662.method174();
    }

    @ObfuscatedName("fd.hi(II)V")
    public static void method3032(int arg0) {
        if (field499 == arg0) {
            return;
        }
        if (field499 == 30) {
            field723.method3863();
        }
        if (field499 == 0) {
            Statics.field466.method637();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method5135(0);
            field524 = 0;
            field525 = 0;
            field516.method6953(arg0);
            if (arg0 != 20) {
                method173(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3825 != null) {
            Statics.field3825.method7287();
            Statics.field3825 = null;
        }
        if (field499 == 25) {
            field622 = 0;
            field560 = 0;
            field726 = 1;
            field558 = 0;
            field559 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = method3014() ? 0 : 12;
            class72.method359(Statics.field4217, Statics.field4788, true, var2);
        } else if (arg0 == 20) {
            int var1 = field499 == 11 ? 4 : 0;
            class72.method359(Statics.field4217, Statics.field4788, false, var1);
        } else if (arg0 == 11) {
            class72.method359(Statics.field4217, Statics.field4788, false, 4);
        } else if (arg0 == 50) {
            class72.method3873("", "Updating date of birth...", "");
            class72.method359(Statics.field4217, Statics.field4788, false, 7);
        } else {
            class72.method2237();
        }
        field499 = arg0;
    }

    @ObfuscatedName("client.hj(B)V")
    public void method1168() {
        if (field499 != 1000) {
            boolean var1 = class345.method4060();
            if (!var1) {
                this.method1169();
            }
        }
    }

    @ObfuscatedName("client.hm(I)V")
    public void method1169() {
        if (class345.field4262 >= 4) {
            this.method541("js5crc");
            method3032(1000);
            return;
        }
        if (class345.field4261 >= 4) {
            if (field499 <= 5) {
                this.method541("js5io");
                method3032(1000);
                return;
            }
            field521 = 3000;
            class345.field4261 = 3;
        }
        if (--field521 + 1 > 0) {
            return;
        }
        try {
            if (field520 == 0) {
                Statics.field2974 = Statics.field201.method3273(Statics.field1420, Statics.field1024);
                field520++;
            }
            if (field520 == 1) {
                if (Statics.field2974.field1884 == 2) {
                    this.method1170(-1);
                    return;
                }
                if (Statics.field2974.field1884 == 1) {
                    field520++;
                }
            }
            if (field520 == 2) {
                Statics.field1957 = class414.method3421((Socket) Statics.field2974.field1888, 40000, 5000);
                class489 var1 = new class489(5);
                var1.method8285(15);
                var1.method8234(213);
                Statics.field1957.method7286(var1.field4991, 0, 5);
                field520++;
                Statics.field1581 = class294.method2504();
            }
            if (field520 == 3) {
                if (Statics.field1957.method7283() > 0) {
                    int var2 = Statics.field1957.method7291();
                    if (var2 != 0) {
                        this.method1170(var2);
                        return;
                    }
                    field520++;
                } else if (class294.method2504() - Statics.field1581 > 30000L) {
                    this.method1170(-2);
                    return;
                }
            }
            if (field520 == 4) {
                class414 var3 = Statics.field1957;
                boolean var4 = field499 > 20;
                if (Statics.field4241 != null) {
                    try {
                        Statics.field4241.method7287();
                    } catch (Exception var14) {
                    }
                    Statics.field4241 = null;
                }
                Statics.field4241 = var3;
                class345.method3314(var4);
                class345.field4252.field4989 = 0;
                Statics.field973 = null;
                Statics.field4253 = null;
                class345.field4254 = 0;
                while (true) {
                    class343 var6 = (class343) class345.field4244.method7972();
                    if (var6 == null) {
                        while (true) {
                            class343 var7 = (class343) class345.field4249.method7972();
                            if (var7 == null) {
                                if (class345.field4256 != 0) {
                                    try {
                                        class489 var8 = new class489(4);
                                        var8.method8285(4);
                                        var8.method8285(class345.field4256);
                                        var8.method8232(0);
                                        Statics.field4241.method7286(var8.field4991, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field4241.method7287();
                                        } catch (Exception var12) {
                                        }
                                        class345.field4261++;
                                        Statics.field4241 = null;
                                    }
                                }
                                class345.field4251 = 0;
                                Statics.field4260 = class294.method2504();
                                Statics.field2974 = null;
                                Statics.field1957 = null;
                                field520 = 0;
                                field522 = 0;
                                return;
                            }
                            class345.field4246.method6320(var7);
                            class345.field4247.method7967(var7, var7.field4745);
                            class345.field4257++;
                            class345.field4250--;
                        }
                    }
                    class345.field4242.method7967(var6, var6.field4745);
                    class345.field4243++;
                    class345.field4245--;
                }
            }
        } catch (IOException var15) {
            this.method1170(-3);
        }
    }

    @ObfuscatedName("client.hu(IB)V")
    public void method1170(int arg0) {
        Statics.field2974 = null;
        Statics.field1957 = null;
        field520 = 0;
        if (Statics.field4569 == Statics.field1024) {
            Statics.field1024 = Statics.field1566;
        } else {
            Statics.field1024 = Statics.field4569;
        }
        field522++;
        if (field522 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field499 <= 5) {
                this.method541("js5connect_full");
                method3032(1000);
            } else {
                field521 = 3000;
            }
        } else if (field522 >= 2 && arg0 == 6) {
            this.method541("js5connect_outofdate");
            method3032(1000);
        } else if (field522 >= 4) {
            if (field499 <= 5) {
                this.method541("js5connect");
                method3032(1000);
            } else {
                field521 = 3000;
            }
        }
    }

    @ObfuscatedName("es.hx(Lnd;Ljava/lang/String;I)V")
    public static void method2772(class342 arg0, String arg1) {
        class80 var2 = new class80(arg0, arg1);
        field784.add(var2);
        field530 += var2.field1018;
    }

    @ObfuscatedName("bd.hd(I)I")
    public static int method703() {
        if (field784 == null || field785 >= field784.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field785; var1++) {
            var0 += ((class80) field784.get(var1)).field1019;
        }
        return var0 * 10000 / field530;
    }

    @ObfuscatedName("jm.hv(IB)I")
    public static int method4635(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("az.hs(I)V")
    public static void method311() {
        if (field519 == 0) {
            Statics.field180 = new class223(4, 104, 104, class78.field1002);
            for (int var0 = 0; var0 < 4; var0++) {
                field561[var0] = new class209(104, 104);
            }
            Statics.field1396 = new class503(512, 512);
            class72.field902 = class337.field4105;
            class72.field897 = 5;
            field519 = 20;
        } else if (field519 == 20) {
            class72.field902 = class337.field3851;
            class72.field897 = 10;
            field519 = 30;
        } else if (field519 == 30) {
            Statics.field118 = method4646(0, false, true, true, false);
            Statics.field3804 = method4646(1, false, true, true, false);
            Statics.field1064 = method4646(2, true, false, true, false);
            Statics.field1069 = method4646(3, false, true, true, false);
            Statics.field4688 = method4646(4, false, true, true, false);
            Statics.field4271 = method4646(5, true, true, true, false);
            Statics.field4548 = method4646(6, true, true, true, false);
            Statics.field2098 = method4646(7, false, true, true, false);
            Statics.field4788 = method4646(8, false, true, true, false);
            Statics.field2869 = method4646(9, false, true, true, false);
            Statics.field4217 = method4646(10, false, true, true, false);
            Statics.field2102 = method4646(11, false, true, true, false);
            Statics.field1541 = method4646(12, false, true, true, false);
            Statics.field1568 = method4646(13, true, false, true, false);
            Statics.field2684 = method4646(14, false, true, true, false);
            Statics.field1532 = method4646(15, false, true, true, false);
            Statics.field1828 = method4646(17, true, true, true, false);
            Statics.field4300 = method4646(18, false, true, true, false);
            Statics.field159 = method4646(19, false, true, true, false);
            Statics.field2336 = method4646(20, false, true, true, false);
            Statics.field317 = method4646(21, false, true, true, true);
            class72.field902 = class337.field3848;
            class72.field897 = 20;
            field519 = 40;
        } else if (field519 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field118.method6017() * 4 / 100;
            int var3 = var2 + Statics.field3804.method6017() * 4 / 100;
            int var4 = var3 + Statics.field1064.method6017() * 2 / 100;
            int var5 = var4 + Statics.field1069.method6017() * 2 / 100;
            int var6 = var5 + Statics.field4688.method6017() * 6 / 100;
            int var7 = var6 + Statics.field4271.method6017() * 4 / 100;
            int var8 = var7 + Statics.field4548.method6017() * 2 / 100;
            int var9 = var8 + Statics.field2098.method6017() * 55 / 100;
            int var10 = var9 + Statics.field4788.method6017() * 2 / 100;
            int var11 = var10 + Statics.field2869.method6017() * 2 / 100;
            int var12 = var11 + Statics.field4217.method6017() * 2 / 100;
            int var13 = var12 + Statics.field2102.method6017() * 2 / 100;
            int var14 = var13 + Statics.field1541.method6017() * 2 / 100;
            int var15 = var14 + Statics.field1568.method6017() * 2 / 100;
            int var16 = var15 + Statics.field2684.method6017() * 2 / 100;
            int var17 = var16 + Statics.field1532.method6017() * 2 / 100;
            int var18 = var17 + Statics.field159.method6017() / 100;
            int var19 = var18 + Statics.field4300.method6017() / 100;
            int var20 = var19 + Statics.field2336.method6017() / 100;
            int var21 = var20 + Statics.field317.method6017() / 100;
            int var22 = var21 + (Statics.field1828.method6016() && Statics.field1828.method6136() ? 1 : 0);
            if (var22 == 100) {
                method2772(Statics.field118, "Animations");
                method2772(Statics.field3804, "Skeletons");
                method2772(Statics.field4688, "Sound FX");
                method2772(Statics.field4271, "Maps");
                method2772(Statics.field4548, "Music Tracks");
                method2772(Statics.field2098, "Models");
                method2772(Statics.field4788, "Sprites");
                method2772(Statics.field2102, "Music Jingles");
                method2772(Statics.field2684, "Music Samples");
                method2772(Statics.field1532, "Music Patches");
                method2772(Statics.field159, "World Map");
                method2772(Statics.field4300, "World Map Geography");
                method2772(Statics.field2336, "World Map Ground");
                Statics.field1373 = new class420();
                Statics.field1373.method7365(Statics.field1828);
                class72.field902 = class337.field4032;
                class72.field897 = 30;
                field519 = 45;
            } else {
                if (var22 != 0) {
                    class72.field902 = class337.field3853 + var22 + "%";
                }
                class72.field897 = 30;
            }
        } else if (field519 == 45) {
            boolean var23 = !field493;
            Statics.field307 = 22050;
            Statics.field314 = var23;
            Statics.field1411 = 2;
            class299 var24 = new class299();
            var24.method5220(9, 128);
            Statics.field163 = class43.method3075(Statics.field201, 0, 22050);
            Statics.field163.method805(var24);
            class298.method3582(Statics.field1532, Statics.field2684, Statics.field4688, var24);
            Statics.field1997 = class43.method3075(Statics.field201, 1, 2048);
            Statics.field1574 = new class39();
            Statics.field1997.method805(Statics.field1574);
            Statics.field2981 = new class56(22050, Statics.field307);
            class72.field902 = class337.field3854;
            class72.field897 = 35;
            field519 = 50;
            Statics.field4313 = new class460(Statics.field4788, Statics.field1568);
        } else if (field519 == 50) {
            int var25 = class461.method7919().length;
            field718 = Statics.field4313.method7912(class461.method7919());
            if (field718.size() < var25) {
                class72.field902 = class337.field3949 + field718.size() * 100 / var25 + "%";
                class72.field897 = 40;
            } else {
                Statics.field4327 = (class379) field718.get(class461.field4880);
                Statics.field2832 = (class379) field718.get(class461.field4886);
                Statics.field1635 = (class379) field718.get(class461.field4878);
                Statics.field1437 = field616.method7654();
                class72.field902 = class337.field3857;
                class72.field897 = 40;
                field519 = 60;
            }
        } else if (field519 == 60) {
            class342 var26 = Statics.field4217;
            class342 var27 = Statics.field4788;
            int var28 = 0;
            String[] var29 = class72.field925;
            for (int var30 = 0; var30 < var29.length; var30++) {
                String var31 = var29[var30];
                if (var26.method6140(var31, "")) {
                    var28++;
                }
            }
            String[] var32 = class72.field926;
            for (int var33 = 0; var33 < var32.length; var33++) {
                String var34 = var32[var33];
                if (var27.method6140(var34, "")) {
                    var28++;
                }
            }
            String[] var35 = class72.field927;
            for (int var36 = 0; var36 < var35.length; var36++) {
                String var37 = var35[var36];
                if (var27.method6086(var37) != -1 && var27.method6140(var37, "")) {
                    var28++;
                }
            }
            int var40 = class72.method1158(Statics.field4788);
            if (var28 < var40) {
                class72.field902 = class337.field3879 + var28 * 100 / var40 + "%";
                class72.field897 = 50;
            } else {
                class72.field902 = class337.field3859;
                class72.field897 = 50;
                method3032(5);
                field519 = 70;
            }
        } else if (field519 == 70) {
            if (!Statics.field1064.method6136()) {
                class72.field902 = class337.field3860 + Statics.field1064.method6048() + "%";
                class72.field897 = 60;
            } else if (Statics.field317.method6136()) {
                class203.method3428(Statics.field1064);
                class195.method1732(Statics.field1064);
                class185.method1674(Statics.field1064, Statics.field2098);
                class201.method1891(Statics.field1064, Statics.field2098, field493);
                class191.method1944(Statics.field1064, Statics.field2098);
                class199.method2167(Statics.field1064);
                class342 var41 = Statics.field1064;
                class342 var42 = Statics.field2098;
                boolean var43 = field492;
                class379 var44 = Statics.field4327;
                Statics.field4311 = var41;
                Statics.field2212 = var42;
                Statics.field1844 = var43;
                Statics.field1063 = Statics.field4311.method6081(10);
                Statics.field1505 = var44;
                class204.method3140(Statics.field1064, Statics.field118, Statics.field3804);
                class194.method2810(Statics.field1064, Statics.field2098);
                class197.method1947(Statics.field1064);
                class342 var45 = Statics.field1064;
                Statics.field1910 = var45;
                Statics.field1909 = Statics.field1910.method6081(16);
                class317.method18(Statics.field1069, Statics.field2098, Statics.field4788, Statics.field1568);
                class181.method2497(Statics.field1064);
                class188.method5320(Statics.field1064);
                class342 var46 = Statics.field1064;
                Statics.field3366 = var46;
                class342 var47 = Statics.field1064;
                class198.method3555(Statics.field1064);
                class482.method717(Statics.field1064);
                Statics.method5967(Statics.field1064);
                Statics.field1781 = new class474(Statics.field491, 54, Statics.field1736, Statics.field1064);
                Statics.field882 = new class474(Statics.field491, 47, Statics.field1736, Statics.field1064);
                Statics.field4387 = new class105();
                class342 var48 = Statics.field1064;
                class342 var49 = Statics.field4788;
                class342 var50 = Statics.field1568;
                Statics.field2138 = var48;
                Statics.field2132 = var49;
                Statics.field2133 = var50;
                class342 var51 = Statics.field1064;
                class342 var52 = Statics.field4788;
                Statics.field1964 = var51;
                Statics.field1961 = var52;
                class183.method502(Statics.field1064, Statics.field4788);
                class72.field902 = class337.field3903;
                class72.field897 = 60;
                field519 = 80;
            } else {
                class72.field902 = class337.field3860 + (80 + Statics.field1541.method6048() / 6) + "%";
                class72.field897 = 60;
            }
        } else if (field519 == 80) {
            int var53 = 0;
            if (Statics.field994 == null) {
                Statics.field994 = class504.method8178(Statics.field4788, Statics.field1373.field4647, 0);
            } else {
                var53++;
            }
            if (Statics.field1233 == null) {
                Statics.field1233 = class504.method8178(Statics.field4788, Statics.field1373.field4637, 0);
            } else {
                var53++;
            }
            if (Statics.field3826 == null) {
                Statics.field3826 = class504.method1934(Statics.field4788, Statics.field1373.field4639, 0);
            } else {
                var53++;
            }
            if (Statics.field256 == null) {
                Statics.field256 = class504.method2775(Statics.field4788, Statics.field1373.field4640, 0);
            } else {
                var53++;
            }
            if (Statics.field4669 == null) {
                Statics.field4669 = class504.method2775(Statics.field4788, Statics.field1373.field4645, 0);
            } else {
                var53++;
            }
            if (Statics.field1959 == null) {
                Statics.field1959 = class504.method2775(Statics.field4788, Statics.field1373.field4642, 0);
            } else {
                var53++;
            }
            if (Statics.field1348 == null) {
                Statics.field1348 = class504.method2775(Statics.field4788, Statics.field1373.field4643, 0);
            } else {
                var53++;
            }
            if (Statics.field1861 == null) {
                Statics.field1861 = class504.method2775(Statics.field4788, Statics.field1373.field4641, 0);
            } else {
                var53++;
            }
            if (Statics.field4946 == null) {
                Statics.field4946 = class504.method2775(Statics.field4788, Statics.field1373.field4644, 0);
            } else {
                var53++;
            }
            if (Statics.field1265 == null) {
                Statics.field1265 = class504.method1934(Statics.field4788, Statics.field1373.field4646, 0);
            } else {
                var53++;
            }
            if (Statics.field174 == null) {
                Statics.field174 = class504.method1934(Statics.field4788, Statics.field1373.field4638, 0);
            } else {
                var53++;
            }
            if (var53 < 11) {
                class72.field902 = class337.field3862 + var53 * 100 / 12 + "%";
                class72.field897 = 70;
            } else {
                Statics.field4442 = Statics.field174;
                Statics.field1233.method8682();
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3826[0].method8655(var54 + var57, var55 + var57, var56 + var57);
                class72.field902 = class337.field3863;
                class72.field897 = 70;
                field519 = 90;
            }
        } else if (field519 == 90) {
            if (Statics.field2869.method6136()) {
                Statics.field30 = new class229(Statics.field2869, Statics.field4788, 20, Statics.field112.method2337(), field493 ? 64 : 128);
                class229 var58 = Statics.field30;
                class219.field2515.field2795 = var58;
                class219.method278(Statics.field112.method2337());
                field519 = 100;
            } else {
                class72.field902 = class337.field3864 + "0%";
                class72.field897 = 90;
            }
        } else if (field519 == 100) {
            int var59 = Statics.field30.method4356();
            if (var59 < 100) {
                class72.field902 = class337.field3864 + var59 + "%";
                class72.field897 = 90;
            } else {
                class72.field902 = class337.field3865;
                class72.field897 = 90;
                field519 = 110;
            }
        } else if (field519 == 110) {
            Statics.field1449 = new class85();
            Statics.field201.method3274(Statics.field1449, 10);
            class72.field902 = class337.field3988;
            class72.field897 = 92;
            field519 = 120;
        } else if (field519 == 120) {
            if (Statics.field4217.method6140("huffman", "")) {
                class319 var60 = new class319(Statics.field4217.method6089("huffman", ""));
                Statics.method3141(var60);
                class72.field902 = class337.field3868;
                class72.field897 = 94;
                field519 = 130;
            } else {
                class72.field902 = class337.field4128 + "%";
                class72.field897 = 94;
            }
        } else if (field519 == 130) {
            if (!Statics.field1069.method6136()) {
                class72.field902 = class337.field3999 + Statics.field1069.method6048() * 4 / 5 + "%";
                class72.field897 = 96;
            } else if (!Statics.field1541.method6136()) {
                class72.field902 = class337.field3999 + (80 + Statics.field1541.method6048() / 6) + "%";
                class72.field897 = 96;
            } else if (Statics.field1568.method6136()) {
                class72.field902 = class337.field3861;
                class72.field897 = 98;
                if (Statics.field1541.method6088("version.dat", "")) {
                    class489 var61 = new class489(Statics.field1541.method6089("version.dat", ""));
                    var61.method8250();
                }
                field519 = 140;
            } else {
                class72.field902 = class337.field3999 + (96 + Statics.field1568.method6048() / 50) + "%";
                class72.field897 = 96;
            }
        } else if (field519 == 140) {
            class72.field897 = 100;
            if (Statics.field159.method6082() <= 0 || Statics.field159.method6091(class268.field3055.field3058)) {
                if (Statics.field1542 == null) {
                    Statics.field1542 = new class459();
                    Statics.field1542.method7718(Statics.field159, Statics.field4300, Statics.field2336, Statics.field1635, field718, Statics.field3826);
                }
                class72.field902 = class337.field3838;
                field519 = 150;
            } else {
                class72.field902 = class337.field4003 + Statics.field159.method6068(class268.field3055.field3058) / 10 + "%";
            }
        } else if (field519 == 150) {
            method3032(10);
        }
    }

    @ObfuscatedName("jd.hn(IZZZZI)Lnd;")
    public static class342 method4646(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class418 var5 = null;
        if (class170.field1836 != null) {
            var5 = new class418(arg0, class170.field1836, Statics.field4375[arg0], 1000000);
        }
        return new class342(var5, Statics.field3036, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.hl(I)V")
    public final void method1171() {
        class414 var1 = field753.method2655();
        class488 var2 = field753.field1386;
        try {
            if (field765 == 0) {
                if (Statics.field1870 == null && (field541.method2019() || field524 > 250)) {
                    Statics.field1870 = field541.method2020();
                    field541.method2018();
                    field541 = null;
                }
                if (Statics.field1870 != null) {
                    if (var1 != null) {
                        var1.method7287();
                        var1 = null;
                    }
                    Statics.field5 = null;
                    field553 = false;
                    field524 = 0;
                    if (!field528.method8537()) {
                        method5135(1);
                    } else if (this.method1344()) {
                        try {
                            this.method1165(Statics.field1319);
                            method5135(21);
                        } catch (Throwable var70) {
                            class516.method6950((String) null, var70);
                            method5761(65);
                            return;
                        }
                    } else if (this.method1163()) {
                        try {
                            this.method1167(Statics.field3476, Statics.field1472);
                            method5135(20);
                        } catch (Exception var69) {
                            class516.method6950((String) null, var69);
                            method5761(65);
                            return;
                        }
                    } else {
                        method5761(65);
                        return;
                    }
                }
            }
            if (field765 == 21) {
                if (this.field537 == null) {
                    if (this.field543 == null) {
                        method5761(65);
                        return;
                    }
                    if (!this.field543.method262()) {
                        return;
                    }
                    if (this.field543.method259()) {
                        class516.method6950(this.field543.method261(), (Throwable) null);
                        method5761(65);
                        this.field543 = null;
                        return;
                    }
                    class21 var7 = this.field543.method263();
                    if (var7.method289() != 200) {
                        method5761(65);
                        this.field543 = null;
                        return;
                    }
                    field524 = 0;
                    class438 var8 = new class438(var7.method291());
                    try {
                        Statics.field4348 = var8.method7608().getString("access_token");
                        Statics.field1319 = var8.method7608().getString("refresh_token");
                    } catch (Exception var67) {
                        class516.method6950("Error parsing tokens", var67);
                        method5761(65);
                        this.field543 = null;
                        return;
                    }
                } else if (this.field537.isDone()) {
                    if (this.field537.isCancelled()) {
                        method5761(65);
                        this.field537 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field537.get();
                        if (!var5.isSuccess()) {
                            method5761(65);
                            this.field537 = null;
                            return;
                        }
                        Statics.field4348 = var5.getAccessToken();
                        Statics.field1319 = var5.getRefreshToken();
                        this.field537 = null;
                    } catch (Exception var68) {
                        class516.method6950((String) null, var68);
                        method5761(65);
                        this.field537 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1544(Statics.field4348);
                method5135(20);
            }
            if (field765 == 20) {
                if (this.field533 == null) {
                    if (this.field523 == null) {
                        method5761(65);
                        return;
                    }
                    if (!this.field523.method262()) {
                        return;
                    }
                    if (this.field523.method259()) {
                        class516.method6950(this.field523.method261(), (Throwable) null);
                        method5761(65);
                        this.field523 = null;
                        return;
                    }
                    class21 var12 = this.field523.method263();
                    if (var12.method289() != 200) {
                        class516.method6950("Response code: " + var12.method289() + "Response body: " + var12.method291(), (Throwable) null);
                        method5761(65);
                        this.field523 = null;
                        return;
                    }
                    List var13 = (List) var12.method290().get("Content-Type");
                    if (var13 != null && var13.contains(class436.field4704.method7596())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method291());
                            this.field529 = var14.getString("token");
                        } catch (JSONException var65) {
                            class516.method6950((String) null, var65);
                            method5761(65);
                            this.field523 = null;
                            return;
                        }
                    } else {
                        this.field529 = var12.method291();
                    }
                    this.field523 = null;
                } else if (this.field533.isDone()) {
                    if (this.field533.isCancelled()) {
                        method5761(65);
                        this.field533 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field533.get();
                        if (!var10.isSuccess()) {
                            method5761(65);
                            this.field533 = null;
                            return;
                        }
                        this.field529 = var10.getToken();
                        this.field533 = null;
                    } catch (Exception var66) {
                        class516.method6950((String) null, var66);
                        method5761(65);
                        this.field533 = null;
                        return;
                    }
                } else {
                    return;
                }
                field524 = 0;
                method5135(1);
            }
            if (field765 == 1) {
                if (Statics.field5 == null) {
                    Statics.field5 = Statics.field201.method3273(Statics.field1420, Statics.field1024);
                }
                if (Statics.field5.field1884 == 2) {
                    throw new IOException();
                }
                if (Statics.field5.field1884 == 1) {
                    var1 = class414.method3421((Socket) Statics.field5.field1888, 40000, 5000);
                    field753.method2651(var1);
                    Statics.field5 = null;
                    method5135(2);
                }
            }
            if (field765 == 2) {
                field753.method2657();
                class289 var16 = class289.method8094();
                var16.field3212.method8285(class291.field3345.field3347);
                field753.method2650(var16);
                field753.method2666();
                var2.field4989 = 0;
                method5135(3);
            }
            if (field765 == 3) {
                if (Statics.field163 != null) {
                    Statics.field163.method807();
                }
                if (Statics.field1997 != null) {
                    Statics.field1997.method807();
                }
                if (var1.method7305(1)) {
                    int var17 = var1.method7291();
                    if (Statics.field163 != null) {
                        Statics.field163.method807();
                    }
                    if (Statics.field1997 != null) {
                        Statics.field1997.method807();
                    }
                    if (var17 != 0) {
                        method5761(var17);
                        return;
                    }
                    var2.field4989 = 0;
                    method5135(4);
                }
            }
            if (field765 == 4) {
                if (var2.field4989 < 8) {
                    int var18 = var1.method7283();
                    if (var18 > 8 - var2.field4989) {
                        var18 = 8 - var2.field4989;
                    }
                    if (var18 > 0) {
                        var1.method7289(var2.field4991, var2.field4989, var18);
                        var2.field4989 += var18;
                    }
                }
                if (var2.field4989 == 8) {
                    var2.field4989 = 0;
                    Statics.field4288 = var2.method8271();
                    method5135(5);
                }
            }
            if (field765 == 5) {
                field753.field1386.field4989 = 0;
                field753.method2657();
                class488 var19 = new class488(500);
                int[] var20 = new int[] { Statics.field1870.nextInt(), Statics.field1870.nextInt(), Statics.field1870.nextInt(), Statics.field1870.nextInt() };
                var19.field4989 = 0;
                var19.method8285(1);
                var19.method8234(var20[0]);
                var19.method8234(var20[1]);
                var19.method8234(var20[2]);
                var19.method8234(var20[3]);
                var19.method8230(Statics.field4288);
                if (field499 == 40) {
                    var19.method8234(Statics.field3723[0]);
                    var19.method8234(Statics.field3723[1]);
                    var19.method8234(Statics.field3723[2]);
                    var19.method8234(Statics.field3723[3]);
                } else {
                    if (field499 == 50) {
                        var19.method8285(class136.field1620.method39());
                        var19.method8234(Statics.field4479);
                    } else {
                        var19.method8285(field527.method39());
                        switch(field527.field1621) {
                            case 0:
                                var19.field4989 += 4;
                                break;
                            case 1:
                            case 3:
                                var19.method8292(Statics.field2331);
                                var19.field4989++;
                                break;
                            case 2:
                                var19.method8234(Statics.field112.method2352(class72.field930));
                        }
                    }
                    if (field528.method8537()) {
                        var19.method8285(class494.field5045.method39());
                        var19.method8238(this.field529);
                    } else {
                        var19.method8285(class494.field5049.method39());
                        var19.method8238(class72.field909);
                    }
                }
                var19.method8275(class71.field886, class71.field888);
                Statics.field3723 = var20;
                class289 var21 = class289.method8094();
                var21.field3212.field4989 = 0;
                if (field499 == 40) {
                    var21.field3212.method8285(class291.field3342.field3347);
                } else {
                    var21.field3212.method8285(class291.field3343.field3347);
                }
                var21.field3212.method8232(0);
                int var22 = var21.field3212.field4989;
                var21.field3212.method8234(213);
                var21.field3212.method8234(1);
                var21.field3212.method8285(field495);
                var21.field3212.method8285(field496);
                byte var23 = 0;
                var21.field3212.method8285(var23);
                var21.field3212.method8476(var19.field4991, 0, var19.field4989);
                int var24 = var21.field3212.field4989;
                var21.field3212.method8238(class72.field930);
                var21.field3212.method8285((field715 ? 1 : 0) << 1 | (field493 ? 1 : 0));
                var21.field3212.method8232(Statics.field211);
                var21.field3212.method8232(Statics.field3026);
                method6891(var21.field3212);
                var21.field3212.method8238(Statics.field1404);
                var21.field3212.method8234(Statics.field4601);
                class489 var25 = new class489(Statics.field1437.method7665());
                Statics.field1437.method7670(var25);
                var21.field3212.method8476(var25.field4991, 0, var25.field4991.length);
                var21.field3212.method8285(field495);
                var21.field3212.method8234(0);
                var21.field3212.method8301(Statics.field118.field4226);
                var21.field3212.method8301(Statics.field4300.field4226);
                var21.field3212.method8235(Statics.field4271.field4226);
                var21.field3212.method8299(Statics.field4788.field4226);
                var21.field3212.method8235(Statics.field1532.field4226);
                var21.field3212.method8299(Statics.field4217.field4226);
                var21.field3212.method8234(Statics.field4548.field4226);
                var21.field3212.method8299(Statics.field1064.field4226);
                var21.field3212.method8299(Statics.field1069.field4226);
                var21.field3212.method8235(Statics.field159.field4226);
                var21.field3212.method8299(Statics.field2684.field4226);
                var21.field3212.method8301(Statics.field1568.field4226);
                var21.field3212.method8301(Statics.field2869.field4226);
                var21.field3212.method8299(Statics.field2098.field4226);
                var21.field3212.method8235(Statics.field1828.field4226);
                var21.field3212.method8299(Statics.field2102.field4226);
                var21.field3212.method8299(Statics.field3804.field4226);
                var21.field3212.method8301(Statics.field2336.field4226);
                var21.field3212.method8301(0);
                var21.field3212.method8235(Statics.field4688.field4226);
                var21.field3212.method8301(Statics.field1541.field4226);
                var21.field3212.method8321(var20, var24, var21.field3212.field4989);
                var21.field3212.method8244(var21.field3212.field4989 - var22);
                field753.method2650(var21);
                field753.method2666();
                field753.field1385 = new class506(var20);
                int[] var26 = new int[4];
                for (int var27 = 0; var27 < 4; var27++) {
                    var26[var27] = var20[var27] + 50;
                }
                var2.method8196(var26);
                method5135(6);
            }
            if (field765 == 6 && var1.method7283() > 0) {
                int var28 = var1.method7291();
                if (var28 == 61) {
                    int var29 = var1.method7283();
                    Statics.field2984 = var29 == 1 && var1.method7291() == 1;
                    method5135(5);
                }
                if (var28 == 21 && field499 == 20) {
                    method5135(12);
                } else if (var28 == 2) {
                    method5135(14);
                } else if (var28 == 15 && field499 == 40) {
                    field753.field1388 = -1;
                    method5135(19);
                } else if (var28 == 64) {
                    method5135(10);
                } else if (var28 == 23 && field525 < 1) {
                    field525++;
                    method5135(0);
                } else if (var28 == 29) {
                    method5135(17);
                } else if (var28 == 69) {
                    method5135(7);
                } else {
                    method5761(var28);
                    return;
                }
            }
            if (field765 == 7 && var1.method7283() >= 2) {
                var1.method7289(var2.field4991, 0, 2);
                var2.field4989 = 0;
                Statics.field72 = var2.method8250();
                method5135(8);
            }
            if (field765 == 8 && var1.method7283() >= Statics.field72) {
                var2.field4989 = 0;
                var1.method7289(var2.field4991, var2.field4989, Statics.field72);
                class7[] var30 = new class7[] { class7.field18 };
                class7 var31 = var30[var2.method8248()];
                try {
                    class4 var32 = class5.method2735(var31);
                    this.field554 = new class8(var2, var32);
                    method5135(9);
                } catch (Exception var64) {
                    method5761(22);
                    return;
                }
            }
            if (field765 == 9 && this.field554.method55()) {
                this.field542 = this.field554.method47();
                this.field554.method46();
                this.field554 = null;
                if (this.field542 == null) {
                    method5761(22);
                    return;
                }
                field753.method2657();
                class289 var34 = class289.method8094();
                var34.field3212.method8285(class291.field3339.field3347);
                var34.field3212.method8232(this.field542.field4989);
                var34.field3212.method8242(this.field542);
                field753.method2650(var34);
                field753.method2666();
                this.field542 = null;
                method5135(6);
            }
            if (field765 == 10 && var1.method7283() > 0) {
                Statics.field119 = var1.method7291();
                method5135(11);
            }
            if (field765 == 11 && var1.method7283() >= Statics.field119) {
                var1.method7289(var2.field4991, 0, Statics.field119);
                var2.field4989 = 0;
                method5135(6);
            }
            if (field765 == 12 && var1.method7283() > 0) {
                field526 = (var1.method7291() + 3) * 60;
                method5135(13);
            }
            if (field765 == 13) {
                field524 = 0;
                class72.method3873(class337.field4025, class337.field4058, field526 / 60 + class337.field3881);
                if (--field526 <= 0) {
                    method5135(0);
                }
            } else {
                if (field765 == 14 && var1.method7283() >= 1) {
                    Statics.field28 = var1.method7291();
                    method5135(15);
                }
                if (field765 == 15 && var1.method7283() >= Statics.field28) {
                    boolean var35 = var1.method7291() == 1;
                    var1.method7289(var2.field4991, 0, 4);
                    var2.field4989 = 0;
                    boolean var36 = false;
                    if (var35) {
                        int var37 = var2.method8192() << 24;
                        int var38 = var37 | var2.method8192() << 16;
                        int var39 = var38 | var2.method8192() << 8;
                        int var40 = var39 | var2.method8192();
                        Statics.field112.method2366(class72.field930, var40);
                    }
                    if (field540) {
                        Statics.field112.method2344(class72.field930);
                    } else {
                        Statics.field112.method2344((String) null);
                    }
                    class94.method2544();
                    field682 = var1.method7291();
                    field666 = var1.method7291() == 1;
                    field664 = var1.method7291();
                    field664 <<= 0x8;
                    field664 += var1.method7291();
                    field613 = var1.method7291();
                    var1.method7289(var2.field4991, 0, 8);
                    var2.field4989 = 0;
                    this.field544 = var2.method8271();
                    if (Statics.field28 >= 29) {
                        var1.method7289(var2.field4991, 0, 8);
                        var2.field4989 = 0;
                        field614 = var2.method8271();
                    }
                    var1.method7289(var2.field4991, 0, 1);
                    var2.field4989 = 0;
                    class290[] var41 = class290.method5148();
                    int var42 = var2.method8194();
                    if (var42 < 0 || var42 >= var41.length) {
                        throw new IOException(var42 + " " + var2.field4989);
                    }
                    field753.field1382 = var41[var42];
                    field753.field1388 = field753.field1382.field3338;
                    var1.method7289(var2.field4991, 0, 2);
                    var2.field4989 = 0;
                    field753.field1388 = var2.method8250();
                    try {
                        class27.method386(Statics.field466, "zap");
                    } catch (Throwable var63) {
                    }
                    method5135(16);
                }
                if (field765 != 16) {
                    if (field765 == 17 && var1.method7283() >= 2) {
                        var2.field4989 = 0;
                        var1.method7289(var2.field4991, 0, 2);
                        var2.field4989 = 0;
                        Statics.field13 = var2.method8250();
                        method5135(18);
                    }
                    if (field765 == 18 && var1.method7283() >= Statics.field13) {
                        var2.field4989 = 0;
                        var1.method7289(var2.field4991, 0, Statics.field13);
                        var2.field4989 = 0;
                        String var58 = var2.method8259();
                        String var59 = var2.method8259();
                        String var60 = var2.method8259();
                        class72.method3873(var58, var59, var60);
                        method3032(10);
                        if (field528.method8537()) {
                            class72.method2964(9);
                        }
                    }
                    if (field765 == 19) {
                        if (field753.field1388 == -1) {
                            if (var1.method7283() < 2) {
                                return;
                            }
                            var1.method7289(var2.field4991, 0, 2);
                            var2.field4989 = 0;
                            field753.field1388 = var2.method8250();
                        }
                        if (var1.method7283() >= field753.field1388) {
                            var1.method7289(var2.field4991, 0, field753.field1388);
                            var2.field4989 = 0;
                            int var61 = field753.field1388;
                            field516.method6956();
                            method2845();
                            class103.method7412(var2);
                            if (var2.field4989 != var61) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field524++;
                        if (field524 > 2000) {
                            if (field525 < 1) {
                                if (Statics.field4569 == Statics.field1024) {
                                    Statics.field1024 = Statics.field1566;
                                } else {
                                    Statics.field1024 = Statics.field4569;
                                }
                                field525++;
                                method5135(0);
                            } else {
                                method5761(-3);
                            }
                        }
                    }
                } else if (var1.method7283() >= field753.field1388) {
                    var2.field4989 = 0;
                    var1.method7289(var2.field4991, 0, field753.field1388);
                    field516.method6954();
                    field502 = -1L;
                    Statics.field1449.field1056 = 0;
                    Statics.field3732 = true;
                    field506 = true;
                    field727 = -1L;
                    class37.field255 = new class365();
                    field753.method2657();
                    field753.field1386.field4989 = 0;
                    field753.field1382 = null;
                    field753.field1392 = null;
                    field753.field1393 = null;
                    field753.field1387 = null;
                    field753.field1388 = 0;
                    field753.field1390 = 0;
                    field545 = 0;
                    field761 = 0;
                    field508 = 0;
                    field633 = 0;
                    field669 = false;
                    class36.field239 = 0;
                    class106.method3183();
                    field649 = 0;
                    field651 = false;
                    field507 = 0;
                    field758 = 0;
                    field505 = 0;
                    Statics.field1586 = null;
                    field653 = 0;
                    field730 = -1;
                    field735 = 0;
                    field487 = 0;
                    field501 = class99.field1309;
                    field517 = class99.field1309;
                    field737 = 0;
                    class103.field1335 = 0;
                    for (int var44 = 0; var44 < 2048; var44++) {
                        class103.field1334[var44] = null;
                        class103.field1333[var44] = class211.field2390;
                    }
                    for (int var45 = 0; var45 < 2048; var45++) {
                        field611[var45] = null;
                    }
                    for (int var46 = 0; var46 < 65536; var46++) {
                        field546[var46] = null;
                    }
                    field623 = -1;
                    field551.method6323();
                    field627.method6323();
                    for (int var47 = 0; var47 < 4; var47++) {
                        for (int var48 = 0; var48 < 104; var48++) {
                            for (int var49 = 0; var49 < 104; var49++) {
                                field624[var47][var48][var49] = null;
                            }
                        }
                    }
                    field574 = new class363();
                    Statics.field804.method1759();
                    for (int var50 = 0; var50 < Statics.field1909; var50++) {
                        class182 var51 = class182.method7368(var50);
                        if (var51 != null) {
                            class307.field3481[var50] = 0;
                            class307.field3482[var50] = 0;
                        }
                    }
                    Statics.field4387.method2581();
                    field665 = -1;
                    if (field656 != -1) {
                        int var52 = field656;
                        if (var52 != -1 && Statics.field3037[var52]) {
                            Statics.field1430.method6084(var52);
                            if (Statics.field2057[var52] != null) {
                                for (int var53 = 0; var53 < Statics.field2057[var52].length; var53++) {
                                    if (Statics.field2057[var52][var53] != null) {
                                        Statics.field2057[var52][var53] = null;
                                    }
                                }
                                Statics.field2057[var52] = null;
                                Statics.field3037[var52] = false;
                            }
                        }
                    }
                    for (class83 var54 = (class83) field657.method7972(); var54 != null; var54 = (class83) field657.method7969()) {
                        method6286(var54, true);
                    }
                    field656 = -1;
                    field657 = new class465(8);
                    field661 = null;
                    field633 = 0;
                    field669 = false;
                    field772.method5443((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
                    for (int var55 = 0; var55 < 8; var55++) {
                        field736[var55] = null;
                        field588[var55] = false;
                    }
                    class81.field1022 = new class465(32);
                    field500 = true;
                    for (int var56 = 0; var56 < 100; var56++) {
                        field706[var56] = true;
                    }
                    method12();
                    Statics.field1426 = null;
                    Statics.field2269 = null;
                    Arrays.fill(field750, (Object) null);
                    Statics.field253 = null;
                    Arrays.fill(field679, (Object) null);
                    for (int var57 = 0; var57 < 8; var57++) {
                        field776[var57] = new class353();
                    }
                    Statics.field4389 = null;
                    class103.method7412(var2);
                    Statics.field165 = -1;
                    method2951(false, var2);
                    field753.field1382 = null;
                }
            }
        } catch (IOException var71) {
            if (field525 < 1) {
                if (Statics.field4569 == Statics.field1024) {
                    Statics.field1024 = Statics.field1566;
                } else {
                    Statics.field1024 = Statics.field4569;
                }
                field525++;
                method5135(0);
            } else {
                method5761(-2);
            }
        }
    }

    @ObfuscatedName("em.hh(B)V")
    public static void method2845() {
        field753.method2657();
        field753.field1386.field4989 = 0;
        field753.field1382 = null;
        field753.field1392 = null;
        field753.field1393 = null;
        field753.field1387 = null;
        field753.field1388 = 0;
        field753.field1390 = 0;
        field545 = 0;
        field633 = 0;
        field669 = false;
        field653 = 0;
        field735 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field611[var0] = null;
        }
        Statics.field3454 = null;
        for (int var1 = 0; var1 < field546.length; var1++) {
            class96 var2 = field546[var1];
            if (var2 != null) {
                var2.field1160 = -1;
                var2.field1172 = false;
            }
        }
        class81.field1022 = new class465(32);
        method3032(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field706[var3] = true;
        }
        method12();
    }

    @ObfuscatedName("mu.hr(II)V")
    public static void method5761(int arg0) {
        int var1 = class72.method5975();
        if (arg0 == -3) {
            class72.method3873(class337.field3882, class337.field3883, class337.field3884);
        } else if (arg0 == -2) {
            class72.method3873(class337.field4042, class337.field3886, class337.field3887);
        } else if (arg0 == -1) {
            class72.method3873(class337.field3888, class337.field4024, class337.field4140);
        } else if (arg0 == 3) {
            class72.method2964(3);
            class72.field917 = 1;
        } else if (arg0 == 4) {
            class72.method180(0);
        } else if (arg0 == 5) {
            class72.field917 = 2;
            class72.method3873(class337.field4043, class337.field4017, class337.field3896);
        } else if (arg0 == 68 || !(field562 || arg0 != 6)) {
            class72.method3873(class337.field3897, class337.field3898, class337.field4117);
        } else if (arg0 == 7) {
            class72.method3873(class337.field3900, class337.field3901, class337.field3980);
        } else if (arg0 == 8) {
            class72.method3873(class337.field4037, class337.field3904, class337.field3905);
        } else if (arg0 == 9) {
            class72.method3873(class337.field3906, class337.field3907, class337.field4113);
        } else if (arg0 == 10) {
            class72.method3873(class337.field3856, class337.field3840, class337.field3911);
        } else if (arg0 == 11) {
            class72.method3873(class337.field3912, class337.field3913, class337.field3918);
        } else if (arg0 == 12) {
            class72.method3873(class337.field3874, class337.field3916, class337.field3917);
        } else if (arg0 == 13) {
            class72.method3873(class337.field4137, class337.field4059, class337.field3920);
        } else if (arg0 == 14) {
            class72.method3873(class337.field3921, class337.field3839, class337.field3923);
        } else if (arg0 == 16) {
            class72.method3873(class337.field3924, class337.field3996, class337.field3855);
            class72.method2964(33);
        } else if (arg0 == 17) {
            class72.method3873(class337.field3927, class337.field3928, class337.field3902);
        } else if (arg0 == 18) {
            class72.method180(1);
        } else if (arg0 == 19) {
            class72.method3873(class337.field3933, class337.field3934, class337.field3922);
        } else if (arg0 == 20) {
            class72.method3873(class337.field3936, class337.field3937, class337.field3938);
        } else if (arg0 == 22) {
            class72.method3873(class337.field3939, class337.field3870, class337.field3941);
        } else if (arg0 == 23) {
            class72.method3873(class337.field3942, class337.field3926, class337.field3944);
        } else if (arg0 == 24) {
            class72.method3873(class337.field3967, class337.field4047, class337.field3947);
        } else if (arg0 == 25) {
            class72.method3873(class337.field3948, class337.field4071, class337.field3950);
        } else if (arg0 == 26) {
            class72.method3873(class337.field3951, class337.field3952, class337.field3976);
        } else if (arg0 == 27) {
            class72.method3873(class337.field3954, class337.field3955, class337.field3956);
        } else if (arg0 == 31) {
            class72.method3873(class337.field4103, class337.field3964, class337.field3965);
        } else if (arg0 == 32) {
            class72.method180(2);
        } else if (arg0 == 37) {
            class72.method3873(class337.field3969, class337.field3970, class337.field4052);
        } else if (arg0 == 38) {
            class72.method3873(class337.field3972, class337.field4014, class337.field3925);
        } else if (arg0 == 55) {
            class72.method2964(8);
        } else if (arg0 == 56) {
            class72.method3873(class337.field3979, class337.field3858, class337.field3981);
            method3032(11);
            return;
        } else if (arg0 == 57) {
            class72.method3873(class337.field3919, class337.field3983, class337.field3929);
            method3032(11);
            return;
        } else if (arg0 == 61) {
            class72.method3873("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class72.method2964(7);
        } else if (arg0 == 62) {
            method3032(10);
            class72.method2964(9);
            class72.method3873(class337.field3985, class337.field3986, class337.field3987);
            return;
        } else if (arg0 == 63) {
            method3032(10);
            class72.method2964(9);
            class72.method3873(class337.field3836, class337.field3989, class337.field4116);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method3032(10);
            class72.method2964(9);
            class72.method3873(class337.field3991, class337.field3876, class337.field3993);
            return;
        } else if (arg0 == 71) {
            method3032(10);
            class72.method2964(7);
            class72.method3873("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method3032(10);
            class72.method2964(6);
            class72.method3873(class337.field4121, class337.field4139, class337.field4138);
        } else if (arg0 == 72) {
            method3032(10);
            class72.method2964(32);
        } else {
            class72.method3873(class337.field3994, class337.field3899, class337.field3990);
        }
        method3032(10);
        boolean var2 = var1 != class72.method5975();
        if (!var2 && field528.method8537()) {
            class72.method2964(9);
        }
    }

    @ObfuscatedName("bx.hc(I)V")
    public static final void method472() {
        field753.method2652();
        class203.field2271.method5125();
        class195.method5172();
        class185.method16();
        class201.method181();
        class191.method3308();
        class202.method6751();
        class204.field2287.method5125();
        class204.field2302.method5125();
        class204.field2295.method5125();
        class194.field2082.method5125();
        class194.field2076.method5125();
        class197.field2105.method5125();
        class182.field1911.method5125();
        Statics.field1781.method8062();
        Statics.field882.method8062();
        class200.method7594();
        class186.method6227();
        class199.method2146();
        class198.method3195();
        class183.method5991();
        class482.method6892();
        class484.field4968.method5125();
        field779.method5125();
        field780.method5125();
        class314.method6181();
        class317.method281();
        ((class229) class219.field2515.field2795).method4378();
        class75.field972.method5125();
        field742.method7069();
        Statics.field118.method6087();
        Statics.field3804.method6087();
        Statics.field1069.method6087();
        Statics.field4688.method6087();
        Statics.field4271.method6087();
        Statics.field4548.method6087();
        Statics.field2098.method6087();
        Statics.field4788.method6087();
        Statics.field2869.method6087();
        Statics.field4217.method6087();
        Statics.field2102.method6087();
        Statics.field1541.method6087();
        Statics.field317.method6087();
        Statics.field180.method4268();
        for (int var0 = 0; var0 < 4; var0++) {
            field561[var0].method3927();
        }
        field723.method3863();
        System.gc();
        class298.field3389 = 1;
        Statics.field3388 = null;
        Statics.field4411 = -1;
        Statics.field1913 = -1;
        Statics.field1324 = 0;
        Statics.field1459 = false;
        Statics.field1789 = 2;
        field650 = -1;
        field739 = false;
        class66.method3608();
        method3032(10);
    }

    @ObfuscatedName("lk.hg(II)V")
    public static final void method5170(int arg0) {
        method472();
        switch(arg0) {
            case 1:
                class72.method4162();
                break;
            case 2:
                class72.method2719();
        }
    }

    @ObfuscatedName("cw.ho(I)J")
    public static long method2011() {
        return field614;
    }

    @ObfuscatedName("ng.ht(I)V")
    public static final void method6209() {
        if (field761 > 0) {
            method472();
        } else {
            field516.method6963();
            method3032(40);
            Statics.field3825 = field753.method2655();
            field753.method2653();
        }
    }

    @ObfuscatedName("ag.hb(ZI)V")
    public static final void method173(boolean arg0) {
        if (arg0) {
            field527 = class72.field915 ? class136.field1616 : class136.field1618;
        } else {
            field527 = Statics.field112.method2334(class72.field930) ? class136.field1619 : class136.field1622;
        }
    }

    @ObfuscatedName("client.hq(B)V")
    public final void method1172() {
        if (field545 > 1) {
            field545--;
        }
        if (field761 > 0) {
            field761--;
        }
        if (field553) {
            field553 = false;
            method6209();
            return;
        }
        if (!field669) {
            method3149();
        }
        for (int var1 = 0; var1 < 100 && this.method1264(field753); var1++) {
        }
        if (field499 != 30) {
            return;
        }
        while (true) {
            class38 var2 = (class38) class37.field255.method6413();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field516.field4484) {
                    class289 var6 = class289.method5974(class287.field3187, field753.field1385);
                    var6.field3212.method8285(0);
                    int var7 = var6.field3212.field4989;
                    field516.method6957(var6.field3212);
                    var6.field3212.method8245(var6.field3212.field4989 - var7);
                    field753.method2650(var6);
                    field516.method6955();
                }
                Object var8 = Statics.field1449.field1055;
                synchronized (Statics.field1449.field1055) {
                    if (!field604) {
                        Statics.field1449.field1056 = 0;
                    } else if (class36.field252 != 0 || Statics.field1449.field1056 >= 40) {
                        class289 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field1449.field1056 && (var9 == null || var9.field3212.field4989 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field1449.field1054[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field1449.field1057[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field503 != var16 || field504 != var15) {
                                if (var9 == null) {
                                    var9 = class289.method5974(class287.field3194, field753.field1385);
                                    var9.field3212.method8285(0);
                                    var10 = var9.field3212.field4989;
                                    var9.field3212.field4989 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field605 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field503;
                                    var18 = var15 - field504;
                                    var19 = (int) ((Statics.field1449.field1059[var14] - field605) / 20L);
                                    var12 = (int) ((Statics.field1449.field1059[var14] - field605) % 20L + (long) var12);
                                }
                                field503 = var16;
                                field504 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3212.method8232((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3212.method8285(var19 + 128);
                                    var9.field3212.method8232((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3212.method8285(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3212.method8234(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3212.method8234(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3212.method8232((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3212.method8234(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3212.method8234(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field605 = Statics.field1449.field1059[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3212.method8245(var9.field3212.field4989 - var10);
                            int var20 = var9.field3212.field4989;
                            var9.field3212.field4989 = var10;
                            var9.field3212.method8285(var12 / var13);
                            var9.field3212.method8285(var12 % var13);
                            var9.field3212.field4989 = var20;
                            field753.method2650(var9);
                        }
                        if (var11 >= Statics.field1449.field1056) {
                            Statics.field1449.field1056 = 0;
                        } else {
                            Statics.field1449.field1056 -= var11;
                            System.arraycopy(Statics.field1449.field1057, var11, Statics.field1449.field1057, 0, Statics.field1449.field1056);
                            System.arraycopy(Statics.field1449.field1054, var11, Statics.field1449.field1054, 0, Statics.field1449.field1056);
                            System.arraycopy(Statics.field1449.field1059, var11, Statics.field1449.field1059, 0, Statics.field1449.field1056);
                        }
                    }
                }
                if (class36.field252 == 1 || !Statics.field4941 && class36.field252 == 4 || class36.field252 == 2) {
                    long var22 = class36.field249 - field502;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field502 = class36.field249;
                    int var24 = class36.field251;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field3026) {
                        var24 = Statics.field3026;
                    }
                    int var25 = class36.field250;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field211) {
                        var25 = Statics.field211;
                    }
                    int var26 = (int) var22;
                    class289 var27 = class289.method5974(class287.field3112, field753.field1385);
                    var27.field3212.method8232((class36.field252 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field3212.method8232(var25);
                    var27.field3212.method8232(var24);
                    field753.method2650(var27);
                }
                if (field722.field2364 > 0) {
                    class289 var28 = class289.method5974(class287.field3104, field753.field1385);
                    var28.field3212.method8232(0);
                    int var29 = var28.field3212.field4989;
                    long var30 = class294.method2504();
                    for (int var32 = 0; var32 < field722.field2364; var32++) {
                        long var33 = var30 - field727;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field727 = var30;
                        var28.field3212.method8295((int) var33);
                        var28.field3212.method8285(field722.field2350[var32]);
                    }
                    var28.field3212.method8244(var28.field3212.field4989 - var29);
                    field753.method2650(var28);
                }
                if (field619 > 0) {
                    field619--;
                }
                if (field722.method3888(96) || field722.method3888(97) || field722.method3888(98) || field722.method3888(99)) {
                    field757 = true;
                }
                if (field757 && field619 <= 0) {
                    field619 = 20;
                    field757 = false;
                    class289 var35 = class289.method5974(class287.field3176, field753.field1385);
                    var35.field3212.method8232(field758);
                    var35.field3212.method8232(field595);
                    field753.method2650(var35);
                }
                if (Statics.field3732 && !field506) {
                    field506 = true;
                    class289 var36 = class289.method5974(class287.field3155, field753.field1385);
                    var36.field3212.method8285(1);
                    field753.method2650(var36);
                }
                if (!Statics.field3732 && field506) {
                    field506 = false;
                    class289 var37 = class289.method5974(class287.field3155, field753.field1385);
                    var37.field3212.method8285(0);
                    field753.method2650(var37);
                }
                if (Statics.field1542 != null) {
                    Statics.field1542.method7719();
                }
                method5432();
                method3352();
                method2748();
                if (field499 != 30) {
                    return;
                }
                for (class90 var38 = (class90) field574.method6329(); var38 != null; var38 = (class90) field574.method6338()) {
                    if (var38.field1132 > 0) {
                        var38.field1132--;
                    }
                    if (var38.field1132 != 0) {
                        if (var38.field1126 > 0) {
                            var38.field1126--;
                        }
                        if (var38.field1126 == 0 && var38.field1121 >= 1 && var38.field1122 >= 1 && var38.field1121 <= 102 && var38.field1122 <= 102 && (var38.field1128 < 0 || class78.method3556(var38.field1128, var38.field1125))) {
                            method2142(var38.field1131, var38.field1120, var38.field1121, var38.field1122, var38.field1128, var38.field1127, var38.field1125, var38.field1136);
                            var38.field1126 = -1;
                            if (var38.field1128 == var38.field1123 && var38.field1123 == -1) {
                                var38.method7651();
                            } else if (var38.field1128 == var38.field1123 && var38.field1129 == var38.field1127 && var38.field1125 == var38.field1124) {
                                var38.method7651();
                            }
                        }
                    } else if (var38.field1123 < 0 || class78.method3556(var38.field1123, var38.field1124)) {
                        method2142(var38.field1131, var38.field1120, var38.field1121, var38.field1122, var38.field1123, var38.field1129, var38.field1124, var38.field1136);
                        var38.method7651();
                    }
                }
                int var10002;
                for (int var39 = 0; var39 < field507; var39++) {
                    var10002 = field556[var39]--;
                    if (field556[var39] >= -10) {
                        class40 var41 = field745[var39];
                        if (var41 == null) {
                            class40 var10000 = (class40) null;
                            var41 = class40.method766(Statics.field4688, field741[var39], 0);
                            if (var41 == null) {
                                continue;
                            }
                            field556[var39] += var41.method768();
                            field745[var39] = var41;
                        }
                        if (field556[var39] < 0) {
                            int var48;
                            if (field744[var39] == 0) {
                                var48 = Statics.field112.method2341();
                            } else {
                                int var42 = (field744[var39] & 0xFF) * 128;
                                int var43 = field744[var39] >> 16 & 0xFF;
                                int var44 = var43 * 128 + 64 - Statics.field3454.field1171;
                                if (var44 < 0) {
                                    var44 = -var44;
                                }
                                int var45 = field744[var39] >> 8 & 0xFF;
                                int var46 = var45 * 128 + 64 - Statics.field3454.field1138;
                                if (var46 < 0) {
                                    var46 = -var46;
                                }
                                int var47 = var44 + var46 - 128;
                                if (var47 > var42) {
                                    field556[var39] = -100;
                                    continue;
                                }
                                if (var47 < 0) {
                                    var47 = 0;
                                }
                                var48 = (var42 - var47) * Statics.field112.method2343() / var42;
                            }
                            if (var48 > 0) {
                                class41 var49 = var41.method767().method780(Statics.field2981);
                                class48 var50 = class48.method876(var49, 100, var48);
                                var50.method879(field603[var39] - 1);
                                Statics.field1574.method739(var50);
                            }
                            field556[var39] = -100;
                        }
                    } else {
                        field507--;
                        for (int var40 = var39; var40 < field507; var40++) {
                            field741[var40] = field741[var40 + 1];
                            field745[var40] = field745[var40 + 1];
                            field603[var40] = field603[var40 + 1];
                            field556[var40] = field556[var40 + 1];
                            field744[var40] = field744[var40 + 1];
                        }
                        var39--;
                    }
                }
                if (field739 && !Statics.method15()) {
                    if (Statics.field112.method2339() != 0 && field650 != -1) {
                        class298.method1130(Statics.field4548, field650, 0, Statics.field112.method2339(), false);
                    }
                    field739 = false;
                }
                field753.field1390++;
                if (field753.field1390 > 750) {
                    method6209();
                    return;
                }
                method3902();
                method3434();
                int[] var51 = class103.field1341;
                for (int var52 = 0; var52 < class103.field1335; var52++) {
                    class88 var53 = field611[var51[var52]];
                    if (var53 != null && var53.field1161 > 0) {
                        var53.field1161--;
                        if (var53.field1161 == 0) {
                            var53.field1149 = null;
                        }
                    }
                }
                for (int var54 = 0; var54 < field737; var54++) {
                    int var55 = field548[var54];
                    class96 var56 = field546[var55];
                    if (var56 != null && var56.field1161 > 0) {
                        var56.field1161--;
                        if (var56.field1161 == 0) {
                            var56.field1149 = null;
                        }
                    }
                }
                field565++;
                if (field607 != 0) {
                    field606 += 20;
                    if (field606 >= 400) {
                        field607 = 0;
                    }
                }
                class317 var57 = Statics.field3394;
                class317 var58 = Statics.field1575;
                Statics.field3394 = null;
                Statics.field1575 = null;
                field672 = null;
                field756 = false;
                field673 = false;
                field488 = 0;
                while (field722.method3883() && field488 < 128) {
                    if (field682 >= 2 && field722.method3888(82) && field722.field2363 == 66) {
                        StringBuilder var59 = new StringBuilder();
                        Iterator var60 = class106.field1375.iterator();
                        while (var60.hasNext()) {
                            class61 var61 = (class61) var60.next();
                            if (var61.field473 != null && !var61.field473.isEmpty()) {
                                var59.append(var61.field473).append(':');
                            }
                            var59.append(var61.field479).append('\n');
                        }
                        String var62 = var59.toString();
                        Statics.field466.method548(var62);
                    } else if (field505 != 1 || field722.field2362 <= 0) {
                        field557[field488] = field722.field2363;
                        field725[field488] = field722.field2362;
                        field488++;
                    }
                }
                boolean var64 = field682 >= 2;
                if (var64 && field722.method3888(82) && field722.method3888(81) && field697 != 0) {
                    int var65 = Statics.field3454.field1106 - field697;
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 3) {
                        var65 = 3;
                    }
                    if (Statics.field3454.field1106 != var65) {
                        int var66 = Statics.field2850 + Statics.field3454.field1174[0];
                        int var67 = Statics.field2841 + Statics.field3454.field1176[0];
                        class289 var68 = class289.method5974(class287.field3180, field753.field1385);
                        var68.field3212.method8235(0);
                        var68.field3212.method8288(var66);
                        var68.field3212.method8278(var65);
                        var68.field3212.method8449(var67);
                        field753.method2650(var68);
                    }
                    field697 = 0;
                }
                if (class36.field252 == 1) {
                    field723.method3863();
                }
                if (field656 != -1) {
                    method718(field656, 0, 0, Statics.field211, Statics.field3026, 0, 0);
                }
                field680++;
                while (true) {
                    class84 var69;
                    class317 var70;
                    class317 var71;
                    do {
                        var69 = (class84) field700.method6327();
                        if (var69 == null) {
                            while (true) {
                                class84 var72;
                                class317 var73;
                                class317 var74;
                                do {
                                    var72 = (class84) field701.method6327();
                                    if (var72 == null) {
                                        while (true) {
                                            class84 var75;
                                            class317 var76;
                                            class317 var77;
                                            do {
                                                var75 = (class84) field699.method6327();
                                                if (var75 == null) {
                                                    while (true) {
                                                        class207 var78 = (class207) field702.method6327();
                                                        if (var78 == null) {
                                                            this.method1295();
                                                            method715();
                                                            if (field511 != null) {
                                                                this.method1183();
                                                            }
                                                            if (class223.method4211()) {
                                                                int var79 = class223.field2579;
                                                                int var80 = class223.field2580;
                                                                class289 var81 = class289.method5974(class287.field3158, field753.field1385);
                                                                var81.field3212.method8285(5);
                                                                var81.field3212.method8449(Statics.field2841 + var80);
                                                                var81.field3212.method8324(Statics.field2850 + var79);
                                                                var81.field3212.method8395(field722.method3888(82) ? (field722.method3888(81) ? 2 : 1) : 0);
                                                                field753.method2650(var81);
                                                                class223.method4210();
                                                                field515 = class36.field250;
                                                                field676 = class36.field251;
                                                                field607 = 1;
                                                                field606 = 0;
                                                                field735 = var79;
                                                                field487 = var80;
                                                            }
                                                            if (Statics.field3394 != var57) {
                                                                if (var57 != null) {
                                                                    method3056(var57);
                                                                }
                                                                if (Statics.field3394 != null) {
                                                                    method3056(Statics.field3394);
                                                                }
                                                            }
                                                            if (Statics.field1575 != var58 && field648 == field647) {
                                                                if (var58 != null) {
                                                                    method3056(var58);
                                                                }
                                                                if (Statics.field1575 != null) {
                                                                    method3056(Statics.field1575);
                                                                }
                                                            }
                                                            if (Statics.field1575 == null) {
                                                                if (field647 > 0) {
                                                                    field647--;
                                                                }
                                                            } else if (field647 < field648) {
                                                                field647++;
                                                                if (field648 == field647) {
                                                                    method3056(Statics.field1575);
                                                                }
                                                            }
                                                            if (field505 == 0) {
                                                                int var82 = Statics.field3454.field1171;
                                                                int var83 = Statics.field3454.field1138;
                                                                if (Statics.field194 - var82 < -500 || Statics.field194 - var82 > 500 || Statics.field1675 - var83 < -500 || Statics.field1675 - var83 > 500) {
                                                                    Statics.field194 = var82;
                                                                    Statics.field1675 = var83;
                                                                }
                                                                if (Statics.field194 != var82) {
                                                                    Statics.field194 += (var82 - Statics.field194) / 16;
                                                                }
                                                                if (Statics.field1675 != var83) {
                                                                    Statics.field1675 += (var83 - Statics.field1675) / 16;
                                                                }
                                                                int var84 = Statics.field194 >> 7;
                                                                int var85 = Statics.field1675 >> 7;
                                                                int var86 = method3072(Statics.field194, Statics.field1675, Statics.field231);
                                                                int var87 = 0;
                                                                if (var84 > 3 && var85 > 3 && var84 < 100 && var85 < 100) {
                                                                    for (int var88 = var84 - 4; var88 <= var84 + 4; var88++) {
                                                                        for (int var89 = var85 - 4; var89 <= var85 + 4; var89++) {
                                                                            int var90 = Statics.field231;
                                                                            if (var90 < 3 && (class78.field1006[1][var88][var89] & 0x2) == 2) {
                                                                                var90++;
                                                                            }
                                                                            int var91 = var86 - class78.field1002[var90][var88][var89];
                                                                            if (var91 > var87) {
                                                                                var87 = var91;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int var92 = var87 * 192;
                                                                if (var92 > 98048) {
                                                                    var92 = 98048;
                                                                }
                                                                if (var92 < 32768) {
                                                                    var92 = 32768;
                                                                }
                                                                if (var92 > field589) {
                                                                    field589 += (var92 - field589) / 24;
                                                                } else if (var92 < field589) {
                                                                    field589 += (var92 - field589) / 80;
                                                                }
                                                                Statics.field1297 = method3072(Statics.field3454.field1171, Statics.field3454.field1138, Statics.field231) - field771;
                                                            } else if (field505 == 1) {
                                                                method5962();
                                                                short var93 = -1;
                                                                if (field722.method3888(33)) {
                                                                    var93 = 0;
                                                                } else if (field722.method3888(49)) {
                                                                    var93 = 1024;
                                                                }
                                                                if (field722.method3888(48)) {
                                                                    if (var93 == 0) {
                                                                        var93 = 1792;
                                                                    } else if (var93 == 1024) {
                                                                        var93 = 1280;
                                                                    } else {
                                                                        var93 = 1536;
                                                                    }
                                                                } else if (field722.method3888(50)) {
                                                                    if (var93 == 0) {
                                                                        var93 = 256;
                                                                    } else if (var93 == 1024) {
                                                                        var93 = 768;
                                                                    } else {
                                                                        var93 = 512;
                                                                    }
                                                                }
                                                                byte var94 = 0;
                                                                if (field722.method3888(35)) {
                                                                    var94 = -1;
                                                                } else if (field722.method3888(51)) {
                                                                    var94 = 1;
                                                                }
                                                                int var95 = 0;
                                                                if (var93 >= 0 || var94 != 0) {
                                                                    int var96 = field722.method3888(81) ? field711 : field583;
                                                                    var95 = var96 * 16;
                                                                    field729 = var93;
                                                                    field531 = var94;
                                                                }
                                                                if (field778 < var95) {
                                                                    field778 += var95 / 8;
                                                                    if (field778 > var95) {
                                                                        field778 = var95;
                                                                    }
                                                                } else if (field778 > var95) {
                                                                    field778 = field778 * 9 / 10;
                                                                }
                                                                if (field778 > 0) {
                                                                    int var97 = field778 / 16;
                                                                    if (field729 >= 0) {
                                                                        int var98 = field729 - Statics.field1531 & 0x7FF;
                                                                        int var99 = class219.field2512[var98];
                                                                        int var100 = class219.field2516[var98];
                                                                        Statics.field194 += var97 * var99 / 65536;
                                                                        Statics.field1675 += var97 * var100 / 65536;
                                                                    }
                                                                    if (field531 != 0) {
                                                                        Statics.field1297 += field531 * var97;
                                                                        if (Statics.field1297 > 0) {
                                                                            Statics.field1297 = 0;
                                                                        }
                                                                    }
                                                                } else {
                                                                    field729 = -1;
                                                                    field531 = -1;
                                                                }
                                                                if (field722.method3888(13)) {
                                                                    method325();
                                                                }
                                                            }
                                                            if (class36.field232 == 4 && Statics.field4941) {
                                                                int var101 = class36.field243 - field681;
                                                                field575 = var101 * 2;
                                                                field681 = var101 == -1 || var101 == 1 ? class36.field243 : (field681 + class36.field243) / 2;
                                                                int var102 = field580 - class36.field242;
                                                                field704 = var102 * 2;
                                                                field580 = var102 == -1 || var102 == 1 ? class36.field242 : (field580 + class36.field242) / 2;
                                                            } else {
                                                                if (field722.method3888(96)) {
                                                                    field704 += (-24 - field704) / 2;
                                                                } else if (field722.method3888(97)) {
                                                                    field704 += (24 - field704) / 2;
                                                                } else {
                                                                    field704 /= 2;
                                                                }
                                                                if (field722.method3888(98)) {
                                                                    field575 += (12 - field575) / 2;
                                                                } else if (field722.method3888(99)) {
                                                                    field575 += (-12 - field575) / 2;
                                                                } else {
                                                                    field575 /= 2;
                                                                }
                                                                field681 = class36.field243;
                                                                field580 = class36.field242;
                                                            }
                                                            field758 = field704 / 2 + field758 & 0x7FF;
                                                            field595 += field575 / 2;
                                                            if (field595 < 128) {
                                                                field595 = 128;
                                                            }
                                                            if (field595 > 383) {
                                                                field595 = 383;
                                                            }
                                                            if (field732) {
                                                                method13();
                                                            } else if (field746) {
                                                                if (!field674) {
                                                                    int var103 = Statics.field1903 * 128 + 64;
                                                                    int var104 = Statics.field1500 * 128 + 64;
                                                                    int var105 = method3072(var103, var104, Statics.field231) - Statics.field91;
                                                                    method3005(var103, var105, var104);
                                                                } else if (field668 != null) {
                                                                    Statics.field257 = field668.method7678();
                                                                    Statics.field3391 = field668.method7683();
                                                                    if (field749) {
                                                                        Statics.field1867 = field668.method7676();
                                                                    } else {
                                                                        Statics.field1867 = method3072(Statics.field257, Statics.field3391, Statics.field231) - field668.method7676();
                                                                    }
                                                                    field668.method7689();
                                                                }
                                                                if (field748) {
                                                                    if (field738 != null) {
                                                                        Statics.field2975 = field738.method7684();
                                                                        Statics.field2975 = Math.min(Math.max(Statics.field2975, 128), 383);
                                                                        field738.method7689();
                                                                    }
                                                                    if (field751 != null) {
                                                                        Statics.field1531 = field751.method7684() & 0x7FF;
                                                                        field751.method7689();
                                                                    }
                                                                } else {
                                                                    int var106 = Statics.field4885 * 128 + 64;
                                                                    int var107 = Statics.field1872 * 128 + 64;
                                                                    int var108 = method3072(var106, var107, Statics.field231) - Statics.field470;
                                                                    int var109 = var106 - Statics.field257;
                                                                    int var110 = var108 - Statics.field1867;
                                                                    int var111 = var107 - Statics.field3391;
                                                                    int var112 = (int) Math.sqrt((double) (var109 * var109 + var111 * var111));
                                                                    int var113 = (int) (Math.atan2((double) var110, (double) var112) * 325.9490051269531D) & 0x7FF;
                                                                    int var114 = (int) (Math.atan2((double) var109, (double) var111) * -325.9490051269531D) & 0x7FF;
                                                                    method1930(var113, var114);
                                                                }
                                                            }
                                                            for (int var115 = 0; var115 < 5; var115++) {
                                                                var10002 = field585[var115]++;
                                                            }
                                                            Statics.field4387.method2608();
                                                            int var116 = class36.method2027();
                                                            int var117 = field217.method347();
                                                            if (var116 > 15000 && var117 > 15000) {
                                                                field761 = 250;
                                                                class36.field239 = 14500;
                                                                class289 var119 = class289.method5974(class287.field3182, field753.field1385);
                                                                field753.method2650(var119);
                                                            }
                                                            Statics.field804.method1785();
                                                            for (int var120 = 0; var120 < field783.size(); var120++) {
                                                                if (class204.method297((Integer) field783.get(var120)) != 2) {
                                                                    field783.remove(var120);
                                                                    var120--;
                                                                }
                                                            }
                                                            field753.field1391++;
                                                            if (field753.field1391 > 50) {
                                                                class289 var121 = class289.method5974(class287.field3189, field753.field1385);
                                                                field753.method2650(var121);
                                                            }
                                                            try {
                                                                field753.method2666();
                                                            } catch (IOException var123) {
                                                                method6209();
                                                            }
                                                            return;
                                                        }
                                                        method7106(var78);
                                                    }
                                                }
                                                var76 = var75.field1048;
                                                if (var76.field3571 < 0) {
                                                    break;
                                                }
                                                var77 = class317.method3201(var76.field3589);
                                            } while (var77 == null || var77.field3707 == null || var76.field3571 >= var77.field3707.length || var77.field3707[var76.field3571] != var76);
                                            class67.method2285(var75);
                                        }
                                    }
                                    var73 = var72.field1048;
                                    if (var73.field3571 < 0) {
                                        break;
                                    }
                                    var74 = class317.method3201(var73.field3589);
                                } while (var74 == null || var74.field3707 == null || var73.field3571 >= var74.field3707.length || var74.field3707[var73.field3571] != var73);
                                class67.method2285(var72);
                            }
                        }
                        var70 = var69.field1048;
                        if (var70.field3571 < 0) {
                            break;
                        }
                        var71 = class317.method3201(var70.field3589);
                    } while (var71 == null || var71.field3707 == null || var70.field3571 >= var71.field3707.length || var71.field3707[var70.field3571] != var70);
                    class67.method2285(var69);
                }
            }
            class289 var4 = class289.method5974(class287.field3184, field753.field1385);
            var4.field3212.method8285(0);
            int var5 = var4.field3212.field4989;
            class37.method7595(var4.field3212);
            var4.field3212.method8245(var4.field3212.field4989 - var5);
            field753.method2650(var4);
        }
    }

    @ObfuscatedName("mj.hz(I)V")
    public static final void method5961() {
        if (Statics.field1997 != null) {
            Statics.field1997.method813();
        }
        if (Statics.field163 != null) {
            Statics.field163.method813();
        }
    }

    @ObfuscatedName("lm.hk(Lha;IIII)V")
    public static void method5144(class204 arg0, int arg1, int arg2, int arg3) {
        if (field507 < 50 && Statics.field112.method2343() != 0 && arg0.field2303 != null && arg1 < arg0.field2303.length) {
            method3181(arg0.field2303[arg1], arg2, arg3);
        }
    }

    @ObfuscatedName("ap.ha(Lha;IIII)V")
    public static void method379(class204 arg0, int arg1, int arg2, int arg3) {
        if (field507 < 50 && Statics.field112.method2343() != 0 && arg0.field2312 != null && arg0.field2312.containsKey(arg1)) {
            method3181((Integer) arg0.field2312.get(arg1), arg2, arg3);
        }
    }

    @ObfuscatedName("ge.hp(IIII)V")
    public static void method3181(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        int var3 = arg0 >> 8;
        int var4 = arg0 >> 4 & 0x7;
        int var5 = arg0 & 0xF;
        field741[field507] = var3;
        field603[field507] = var4;
        field556[field507] = 0;
        field745[field507] = null;
        int var6 = (arg1 - 64) / 128;
        int var7 = (arg2 - 64) / 128;
        field744[field507] = (var6 << 16) + (var7 << 8) + var5;
        field507++;
    }

    @ObfuscatedName("fh.he(IIIB)V")
    public static void method2974(int arg0, int arg1, int arg2) {
        if (Statics.field112.method2341() == 0 || arg1 == 0 || field507 >= 50) {
            return;
        }
        field741[field507] = arg0;
        field603[field507] = arg1;
        field556[field507] = arg2;
        field745[field507] = null;
        field744[field507] = 0;
        field507++;
    }

    @ObfuscatedName("an.hf(II)V")
    public static void method11(int arg0) {
        if (arg0 == -1 && !field739) {
            class298.method3547();
        } else if (arg0 != -1 && field650 != arg0 && Statics.field112.method2339() != 0 && !field739) {
            class298.method2277(2, Statics.field4548, arg0, 0, Statics.field112.method2339(), false);
        }
        field650 = arg0;
    }

    @ObfuscatedName("if.hy(III)V")
    public static void method3930(int arg0, int arg1) {
        if (Statics.field112.method2339() != 0 && arg0 != -1) {
            class298.method1130(Statics.field2102, arg0, 0, Statics.field112.method2339(), false);
            field739 = true;
        }
    }

    @ObfuscatedName("lb.if(I)V")
    public static final void method5432() {
        if (!Statics.field865) {
            return;
        }
        if (Statics.field1426 != null) {
            Statics.field1426.method7205();
        }
        for (int var0 = 0; var0 < class103.field1335; var0++) {
            class88 var1 = field611[class103.field1341[var0]];
            var1.method2179();
        }
        Statics.field865 = false;
    }

    @ObfuscatedName("hw.ia(B)V")
    public static final void method3352() {
        if (!Statics.field1025) {
            return;
        }
        for (int var0 = 0; var0 < class103.field1335; var0++) {
            class88 var1 = field611[class103.field1341[var0]];
            var1.method2182();
        }
        Statics.field1025 = false;
    }

    @ObfuscatedName("ea.iu(B)V")
    public static final void method2748() {
        if (Statics.field231 == field730) {
            return;
        }
        field730 = Statics.field231;
        int var0 = Statics.field231;
        int[] var1 = Statics.field1396.field5089;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class78.field1006[var0][var6][var4] & 0x18) == 0) {
                    Statics.field180.method4283(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class78.field1006[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field180.method4283(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1396.method8681();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class78.field1006[var0][var10][var9] & 0x18) == 0) {
                    method3078(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class78.field1006[var0 + 1][var10][var9] & 0x8) != 0) {
                    method3078(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field731 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field180.method4199(Statics.field231, var11, var12);
                if (var13 != 0L) {
                    int var15 = class233.method2144(var13);
                    int var16 = Statics.method3057(var15).field2182;
                    if (var16 >= 0 && class183.method6285(var16).field1926) {
                        field734[field731] = class183.method6285(var16).method3350(false);
                        field620[field731] = var11;
                        field733[field731] = var12;
                        field731++;
                    }
                }
            }
        }
        Statics.field2381.method8640();
    }

    @ObfuscatedName("lq.iw(Lmq;IIB)V")
    public static final void method5397(class317 arg0, int arg1, int arg2) {
        if (field653 != 0 && field653 != 3 || field669 || !(class36.field252 == 1 || !Statics.field4941 && class36.field252 == 4)) {
            return;
        }
        class306 var3 = arg0.method5777(true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field250 - arg1;
        int var5 = class36.field251 - arg2;
        if (!var3.method5399(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3477 / 2;
        int var7 = var5 - var3.field3472 / 2;
        int var8 = field758 & 0x7FF;
        int var9 = class219.field2512[var8];
        int var10 = class219.field2516[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field3454.field1171 + var11 >> 7;
        int var14 = Statics.field3454.field1138 - var12 >> 7;
        class289 var15 = class289.method5974(class287.field3106, field753.field1385);
        var15.field3212.method8285(18);
        var15.field3212.method8449(Statics.field2841 + var14);
        var15.field3212.method8324(Statics.field2850 + var13);
        var15.field3212.method8395(field722.method3888(82) ? (field722.method3888(81) ? 2 : 1) : 0);
        var15.field3212.method8285(var6);
        var15.field3212.method8285(var7);
        var15.field3212.method8232(field758);
        var15.field3212.method8285(57);
        var15.field3212.method8285(0);
        var15.field3212.method8285(0);
        var15.field3212.method8285(89);
        var15.field3212.method8232(Statics.field3454.field1171);
        var15.field3212.method8232(Statics.field3454.field1138);
        var15.field3212.method8285(63);
        field753.method2650(var15);
        field735 = var13;
        field487 = var14;
    }

    @ObfuscatedName("qj.ig(II)I")
    public static final int method7525(int arg0) {
        return Math.abs(arg0 - Statics.field1531) > 1024 ? (arg0 < Statics.field1531 ? 1 : -1) * 2048 + arg0 : arg0;
    }

    @ObfuscatedName("an.ih(B)V")
    public static final void method13() {
        method3005(Statics.field3007, Statics.field1345, Statics.field1958);
        method1930(Statics.field1042, Statics.field1083);
        if (Statics.field3007 != Statics.field257 || Statics.field1867 != Statics.field1345 || Statics.field3391 != Statics.field1958 || Statics.field2975 != Statics.field1042 || Statics.field1531 != Statics.field1083) {
            return;
        }
        field732 = false;
        field746 = false;
        field674 = false;
        field748 = false;
        Statics.field4885 = 0;
        Statics.field1872 = 0;
        Statics.field470 = 0;
        Statics.field4214 = 0;
        Statics.field1938 = 0;
        Statics.field1638 = 0;
        Statics.field138 = 0;
        Statics.field1903 = 0;
        Statics.field1500 = 0;
        Statics.field91 = 0;
        field668 = null;
        field738 = null;
        field751 = null;
    }

    @ObfuscatedName("fh.il(IIII)V")
    public static final void method3005(int arg0, int arg1, int arg2) {
        if (Statics.field257 < arg0) {
            Statics.field257 += Statics.field1638 * (arg0 - Statics.field257) / 1000 + Statics.field138;
            if (Statics.field257 > arg0) {
                Statics.field257 = arg0;
            }
        }
        if (Statics.field257 > arg0) {
            Statics.field257 -= Statics.field1638 * (Statics.field257 - arg0) / 1000 + Statics.field138;
            if (Statics.field257 < arg0) {
                Statics.field257 = arg0;
            }
        }
        if (Statics.field1867 < arg1) {
            Statics.field1867 += Statics.field1638 * (arg1 - Statics.field1867) / 1000 + Statics.field138;
            if (Statics.field1867 > arg1) {
                Statics.field1867 = arg1;
            }
        }
        if (Statics.field1867 > arg1) {
            Statics.field1867 -= Statics.field1638 * (Statics.field1867 - arg1) / 1000 + Statics.field138;
            if (Statics.field1867 < arg1) {
                Statics.field1867 = arg1;
            }
        }
        if (Statics.field3391 < arg2) {
            Statics.field3391 += Statics.field1638 * (arg2 - Statics.field3391) / 1000 + Statics.field138;
            if (Statics.field3391 > arg2) {
                Statics.field3391 = arg2;
            }
        }
        if (Statics.field3391 > arg2) {
            Statics.field3391 -= Statics.field1638 * (Statics.field3391 - arg2) / 1000 + Statics.field138;
            if (Statics.field3391 < arg2) {
                Statics.field3391 = arg2;
            }
        }
    }

    @ObfuscatedName("cx.is(IIB)V")
    public static final void method1930(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field2975 < arg0) {
            Statics.field2975 += Statics.field1938 * (arg0 - Statics.field2975) / 1000 + Statics.field4214;
            if (Statics.field2975 > arg0) {
                Statics.field2975 = arg0;
            }
        } else if (Statics.field2975 > arg0) {
            Statics.field2975 -= Statics.field1938 * (Statics.field2975 - arg0) / 1000 + Statics.field4214;
            if (Statics.field2975 < arg0) {
                Statics.field2975 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field1531;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field1531 += Statics.field1938 * var3 / 1000 + Statics.field4214;
            Statics.field1531 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field1531 -= Statics.field1938 * -var3 / 1000 + Statics.field4214;
            Statics.field1531 &= 0x7FF;
        }
        int var4 = var2 - Statics.field1531;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field1531 = var2;
        }
    }

    @ObfuscatedName("hy.in(I)V")
    public static final void method3902() {
        int var0 = class103.field1335;
        int[] var1 = class103.field1341;
        for (int var2 = 0; var2 < var0; var2++) {
            class88 var3 = field611[var1[var2]];
            if (var3 != null) {
                method719(var3, 1);
            }
        }
    }

    @ObfuscatedName("hx.ic(I)V")
    public static final void method3434() {
        for (int var0 = 0; var0 < field737; var0++) {
            int var1 = field548[var0];
            class96 var2 = field546[var1];
            if (var2 != null) {
                method719(var2, var2.field1277.field2042);
            }
        }
    }

    @ObfuscatedName("bj.ii(Lde;IB)V")
    public static final void method719(class91 arg0, int arg1) {
        if (arg0.field1192 >= field602) {
            int var2 = Math.max(1, arg0.field1192 - field602);
            int var3 = arg0.field1188 * 128 + arg0.field1141 * 64;
            int var4 = arg0.field1190 * 128 + arg0.field1141 * 64;
            arg0.field1171 += (var3 - arg0.field1171) / var2;
            arg0.field1138 += (var4 - arg0.field1138) / var2;
            arg0.field1210 = 0;
            arg0.field1168 = arg0.field1194;
        } else if (arg0.field1193 >= field602) {
            boolean var5 = field602 == arg0.field1193 || arg0.field1202 == -1 || arg0.field1184 != 0;
            if (!var5) {
                class204 var6 = class204.method2139(arg0.field1202);
                if (var6 == null || var6.method3816()) {
                    var5 = true;
                } else {
                    var5 = arg0.field1183 + 1 > var6.field2304[arg0.field1182];
                }
            }
            if (var5) {
                int var7 = arg0.field1193 - arg0.field1192;
                int var8 = field602 - arg0.field1192;
                int var9 = arg0.field1188 * 128 + arg0.field1141 * 64;
                int var10 = arg0.field1190 * 128 + arg0.field1141 * 64;
                int var11 = arg0.field1189 * 128 + arg0.field1141 * 64;
                int var12 = arg0.field1208 * 128 + arg0.field1141 * 64;
                arg0.field1171 = ((var7 - var8) * var9 + var8 * var11) / var7;
                arg0.field1138 = ((var7 - var8) * var10 + var8 * var12) / var7;
            }
            arg0.field1210 = 0;
            arg0.field1168 = arg0.field1194;
            arg0.field1144 = arg0.field1168;
        } else {
            arg0.field1187 = arg0.field1139;
            if (arg0.field1206 == 0) {
                arg0.field1210 = 0;
            } else {
                label398: {
                    if (arg0.field1202 != -1 && arg0.field1184 == 0) {
                        class204 var13 = class204.method2139(arg0.field1202);
                        if (arg0.field1211 > 0 && var13.field2313 == 0) {
                            arg0.field1210++;
                            break label398;
                        }
                        if (arg0.field1211 <= 0 && var13.field2314 == 0) {
                            arg0.field1210++;
                            break label398;
                        }
                    }
                    int var14 = arg0.field1171;
                    int var15 = arg0.field1138;
                    int var16 = arg0.field1174[arg0.field1206 - 1] * 128 + arg0.field1141 * 64;
                    int var17 = arg0.field1176[arg0.field1206 - 1] * 128 + arg0.field1141 * 64;
                    if (var14 < var16) {
                        if (var15 < var17) {
                            arg0.field1168 = 1280;
                        } else if (var15 > var17) {
                            arg0.field1168 = 1792;
                        } else {
                            arg0.field1168 = 1536;
                        }
                    } else if (var14 > var16) {
                        if (var15 < var17) {
                            arg0.field1168 = 768;
                        } else if (var15 > var17) {
                            arg0.field1168 = 256;
                        } else {
                            arg0.field1168 = 512;
                        }
                    } else if (var15 < var17) {
                        arg0.field1168 = 1024;
                    } else if (var15 > var17) {
                        arg0.field1168 = 0;
                    }
                    class211 var18 = arg0.field1199[arg0.field1206 - 1];
                    if (var16 - var14 <= 256 && var16 - var14 >= -256 && var17 - var15 <= 256 && var17 - var15 >= -256) {
                        int var19 = arg0.field1168 - arg0.field1144 & 0x7FF;
                        if (var19 > 1024) {
                            var19 -= 2048;
                        }
                        int var20 = arg0.field1147;
                        if (var19 >= -256 && var19 <= 256) {
                            var20 = arg0.field1146;
                        } else if (var19 >= 256 && var19 < 768) {
                            var20 = arg0.field1155;
                        } else if (var19 >= -768 && var19 <= -256) {
                            var20 = arg0.field1148;
                        }
                        if (var20 == -1) {
                            var20 = arg0.field1146;
                        }
                        arg0.field1187 = var20;
                        int var21 = 4;
                        boolean var22 = true;
                        if (arg0 instanceof class96) {
                            var22 = ((class96) arg0).field1277.field2014;
                        }
                        if (var22) {
                            if (arg0.field1168 != arg0.field1144 && arg0.field1160 == -1 && arg0.field1191 != 0) {
                                var21 = 2;
                            }
                            if (arg0.field1206 > 2) {
                                var21 = 6;
                            }
                            if (arg0.field1206 > 3) {
                                var21 = 8;
                            }
                            if (arg0.field1210 > 0 && arg0.field1206 > 1) {
                                var21 = 8;
                                arg0.field1210--;
                            }
                        } else {
                            if (arg0.field1206 > 1) {
                                var21 = 6;
                            }
                            if (arg0.field1206 > 2) {
                                var21 = 8;
                            }
                            if (arg0.field1210 > 0 && arg0.field1206 > 1) {
                                var21 = 8;
                                arg0.field1210--;
                            }
                        }
                        if (class211.field2388 == var18) {
                            var21 <<= 0x1;
                        } else if (class211.field2389 == var18) {
                            var21 >>= 0x1;
                        }
                        if (var21 >= 8) {
                            if (arg0.field1187 == arg0.field1146 && arg0.field1150 != -1) {
                                arg0.field1187 = arg0.field1150;
                            } else if (arg0.field1187 == arg0.field1147 && arg0.field1151 != -1) {
                                arg0.field1187 = arg0.field1151;
                            } else if (arg0.field1187 == arg0.field1148 && arg0.field1152 != -1) {
                                arg0.field1187 = arg0.field1152;
                            } else if (arg0.field1187 == arg0.field1155 && arg0.field1153 != -1) {
                                arg0.field1187 = arg0.field1153;
                            }
                        } else if (var21 <= 1) {
                            if (arg0.field1187 == arg0.field1146 && arg0.field1154 != -1) {
                                arg0.field1187 = arg0.field1154;
                            } else if (arg0.field1187 == arg0.field1147 && arg0.field1197 != -1) {
                                arg0.field1187 = arg0.field1197;
                            } else if (arg0.field1187 == arg0.field1148 && arg0.field1156 != -1) {
                                arg0.field1187 = arg0.field1156;
                            } else if (arg0.field1187 == arg0.field1155 && arg0.field1158 != -1) {
                                arg0.field1187 = arg0.field1158;
                            }
                        }
                        if (var14 != var16 || var15 != var17) {
                            if (var14 < var16) {
                                arg0.field1171 += var21;
                                if (arg0.field1171 > var16) {
                                    arg0.field1171 = var16;
                                }
                            } else if (var14 > var16) {
                                arg0.field1171 -= var21;
                                if (arg0.field1171 < var16) {
                                    arg0.field1171 = var16;
                                }
                            }
                            if (var15 < var17) {
                                arg0.field1138 += var21;
                                if (arg0.field1138 > var17) {
                                    arg0.field1138 = var17;
                                }
                            } else if (var15 > var17) {
                                arg0.field1138 -= var21;
                                if (arg0.field1138 < var17) {
                                    arg0.field1138 = var17;
                                }
                            }
                        }
                        if (arg0.field1171 == var16 && arg0.field1138 == var17) {
                            arg0.field1206--;
                            if (arg0.field1211 > 0) {
                                arg0.field1211--;
                            }
                        }
                    } else {
                        arg0.field1171 = var16;
                        arg0.field1138 = var17;
                        arg0.field1206--;
                        if (arg0.field1211 > 0) {
                            arg0.field1211--;
                        }
                    }
                }
            }
        }
        if (arg0.field1171 < 128 || arg0.field1138 < 128 || arg0.field1171 >= 13184 || arg0.field1138 >= 13184) {
            arg0.field1202 = -1;
            arg0.field1192 = 0;
            arg0.field1193 = 0;
            arg0.method2257();
            arg0.field1171 = arg0.field1174[0] * 128 + arg0.field1141 * 64;
            arg0.field1138 = arg0.field1176[0] * 128 + arg0.field1141 * 64;
            arg0.method2266();
        }
        if (Statics.field3454 == arg0 && (arg0.field1171 < 1536 || arg0.field1138 < 1536 || arg0.field1171 >= 11776 || arg0.field1138 >= 11776)) {
            arg0.field1202 = -1;
            arg0.field1192 = 0;
            arg0.field1193 = 0;
            arg0.method2257();
            arg0.field1171 = arg0.field1174[0] * 128 + arg0.field1141 * 64;
            arg0.field1138 = arg0.field1176[0] * 128 + arg0.field1141 * 64;
            arg0.method2266();
        }
        if (arg0.field1160 != -1) {
            Object var23 = null;
            int var24 = 65536;
            class91 var25;
            if (arg0.field1160 < var24) {
                var25 = field546[arg0.field1160];
            } else {
                var25 = field611[arg0.field1160 - var24];
            }
            if (var25 != null) {
                int var26 = arg0.field1171 - var25.field1171;
                int var27 = arg0.field1138 - var25.field1138;
                if (var26 != 0 || var27 != 0) {
                    int var29 = (int) (Math.atan2((double) var26, (double) var27) * 325.94932345220167D) & 0x7FF;
                    arg0.field1168 = var29;
                }
            } else if (arg0.field1172) {
                arg0.field1160 = -1;
                arg0.field1172 = false;
            }
        }
        if (arg0.field1206 == 0 || arg0.field1210 > 0) {
            int var30 = -1;
            if (arg0.field1198 != -1 && arg0.field1175 != -1) {
                int var31 = arg0.field1198 * 128 - Statics.field2850 * 128 + 64;
                int var32 = arg0.field1175 * 128 - Statics.field2841 * 128 + 64;
                int var33 = arg0.field1171 - var31;
                int var34 = arg0.field1138 - var32;
                if (var33 != 0 || var34 != 0) {
                    int var35 = (int) (Math.atan2((double) var33, (double) var34) * 325.94932345220167D) & 0x7FF;
                    var30 = var35;
                }
            } else if (arg0.field1173 != -1) {
                var30 = arg0.field1173;
            }
            if (var30 != -1) {
                arg0.field1168 = var30;
                if (arg0.field1143) {
                    arg0.field1144 = arg0.field1168;
                }
            }
            arg0.method2251();
        }
        int var36 = arg0.field1168 - arg0.field1144 & 0x7FF;
        if (var36 == 0) {
            if (arg0.field1172) {
                arg0.field1160 = -1;
                arg0.field1172 = false;
            }
            arg0.field1204 = 0;
        } else {
            boolean var37 = true;
            boolean var38 = true;
            arg0.field1204++;
            int var39 = var36 > 1024 ? -1 : 1;
            arg0.field1144 += arg0.field1191 * var39;
            boolean var40 = true;
            if (var36 < arg0.field1191 || var36 > 2048 - arg0.field1191) {
                arg0.field1144 = arg0.field1168;
                var40 = false;
            }
            if (arg0.field1191 > 0 && arg0.field1187 == arg0.field1139 && (arg0.field1204 > 25 || var40)) {
                if (var39 == -1 && arg0.field1137 != -1) {
                    arg0.field1187 = arg0.field1137;
                } else if (var39 == 1 && arg0.field1167 != -1) {
                    arg0.field1187 = arg0.field1167;
                } else {
                    arg0.field1187 = arg0.field1146;
                }
            }
            arg0.field1144 &= 0x7FF;
        }
        method6065(arg0);
    }

    @ObfuscatedName("no.ik(Lde;B)V")
    public static final void method6065(class91 arg0) {
        arg0.field1140 = false;
        if (arg0.field1187 != -1) {
            class204 var1 = class204.method2139(arg0.field1187);
            if (var1 == null) {
                arg0.field1187 = -1;
            } else if (!var1.method3816() && var1.field2300 != null) {
                arg0.field1179++;
                if (arg0.field1178 < var1.field2300.length && arg0.field1179 > var1.field2304[arg0.field1178]) {
                    arg0.field1179 = 1;
                    arg0.field1178++;
                    method5144(var1, arg0.field1178, arg0.field1171, arg0.field1138);
                }
                if (arg0.field1178 >= var1.field2300.length) {
                    if (var1.field2301 > 0) {
                        arg0.field1178 -= var1.field2301;
                        if (var1.field2308) {
                            arg0.field1180++;
                        }
                        if (arg0.field1178 < 0 || arg0.field1178 >= var1.field2300.length || var1.field2308 && arg0.field1180 >= var1.field2288) {
                            arg0.field1179 = 0;
                            arg0.field1178 = 0;
                            arg0.field1180 = 0;
                        }
                    } else {
                        arg0.field1179 = 0;
                        arg0.field1178 = 0;
                    }
                    method5144(var1, arg0.field1178, arg0.field1171, arg0.field1138);
                }
            } else if (var1.method3816()) {
                arg0.field1178++;
                int var2 = var1.method3817();
                if (arg0.field1178 < var2) {
                    method379(var1, arg0.field1178, arg0.field1171, arg0.field1138);
                } else {
                    if (var1.field2301 > 0) {
                        arg0.field1178 -= var1.field2301;
                        if (var1.field2308) {
                            arg0.field1180++;
                        }
                        if (arg0.field1178 < 0 || arg0.field1178 >= var2 || var1.field2308 && arg0.field1180 >= var1.field2288) {
                            arg0.field1178 = 0;
                            arg0.field1179 = 0;
                            arg0.field1180 = 0;
                        }
                    } else {
                        arg0.field1179 = 0;
                        arg0.field1178 = 0;
                    }
                    method379(var1, arg0.field1178, arg0.field1171, arg0.field1138);
                }
            } else {
                arg0.field1187 = -1;
            }
        }
        class463 var3 = new class463(arg0.method2256());
        for (class512 var4 = (class512) var3.method7934(); var4 != null; var4 = (class512) var3.next()) {
            if (var4.field5144 != -1 && field602 >= var4.field5145) {
                int var5 = class194.method2130(var4.field5144).field2079;
                if (var5 == -1) {
                    var4.method7651();
                    arg0.field1203--;
                } else {
                    var4.field5143 = Math.max(var4.field5143, 0);
                    class204 var6 = class204.method2139(var5);
                    if (var6.field2300 != null && !var6.method3816()) {
                        var4.field5142++;
                        if (var4.field5143 < var6.field2300.length && var4.field5142 > var6.field2304[var4.field5143]) {
                            var4.field5142 = 1;
                            var4.field5143++;
                            method5144(var6, var4.field5143, arg0.field1171, arg0.field1138);
                        }
                        if (var4.field5143 >= var6.field2300.length) {
                            var4.method7651();
                            arg0.field1203--;
                        }
                    } else if (var6.method3816()) {
                        var4.field5143++;
                        int var7 = var6.method3817();
                        if (var4.field5143 < var7) {
                            method379(var6, var4.field5143, arg0.field1171, arg0.field1138);
                        } else {
                            var4.method7651();
                            arg0.field1203--;
                        }
                    } else {
                        var4.method7651();
                        arg0.field1203--;
                    }
                }
            }
        }
        if (arg0.field1202 != -1 && arg0.field1184 <= 1) {
            class204 var8 = class204.method2139(arg0.field1202);
            if (var8.field2313 == 1 && arg0.field1211 > 0 && arg0.field1192 <= field602 && arg0.field1193 < field602) {
                arg0.field1184 = 1;
                return;
            }
        }
        if (arg0.field1202 != -1 && arg0.field1184 == 0) {
            class204 var9 = class204.method2139(arg0.field1202);
            if (var9 == null) {
                arg0.field1202 = -1;
            } else if (!var9.method3816() && var9.field2300 != null) {
                arg0.field1183++;
                if (arg0.field1182 < var9.field2300.length && arg0.field1183 > var9.field2304[arg0.field1182]) {
                    arg0.field1183 = 1;
                    arg0.field1182++;
                    method5144(var9, arg0.field1182, arg0.field1171, arg0.field1138);
                }
                if (arg0.field1182 >= var9.field2300.length) {
                    arg0.field1182 -= var9.field2301;
                    arg0.field1185++;
                    if (arg0.field1185 >= var9.field2288) {
                        arg0.field1202 = -1;
                    } else if (arg0.field1182 >= 0 && arg0.field1182 < var9.field2300.length) {
                        method5144(var9, arg0.field1182, arg0.field1171, arg0.field1138);
                    } else {
                        arg0.field1202 = -1;
                    }
                }
                arg0.field1140 = var9.field2307;
            } else if (var9.method3816()) {
                arg0.field1182++;
                int var10 = var9.method3817();
                if (arg0.field1182 < var10) {
                    method379(var9, arg0.field1182, arg0.field1171, arg0.field1138);
                } else {
                    arg0.field1182 -= var9.field2301;
                    arg0.field1185++;
                    if (arg0.field1185 >= var9.field2288) {
                        arg0.field1202 = -1;
                    } else if (arg0.field1182 >= 0 && arg0.field1182 < var10) {
                        method379(var9, arg0.field1182, arg0.field1171, arg0.field1138);
                    } else {
                        arg0.field1202 = -1;
                    }
                }
            } else {
                arg0.field1202 = -1;
            }
        }
        if (arg0.field1184 > 0) {
            arg0.field1184--;
        }
    }

    @ObfuscatedName("bt.ie(B)V")
    public static void method715() {
        if (Statics.field1542 != null) {
            Statics.field1542.method7876(Statics.field231, (Statics.field3454.field1171 >> 7) + Statics.field2850, (Statics.field3454.field1138 >> 7) + Statics.field2841, false);
            Statics.field1542.method7816();
        }
    }

    @ObfuscatedName("ig.iq(Ldv;III)V")
    public static void method4045(class88 arg0, int arg1, int arg2) {
        if (arg0.field1202 == arg1 && arg1 != -1) {
            int var3 = class204.method2139(arg1).field2315;
            if (var3 == 1) {
                arg0.field1182 = 0;
                arg0.field1183 = 0;
                arg0.field1184 = arg2;
                arg0.field1185 = 0;
            }
            if (var3 == 2) {
                arg0.field1185 = 0;
            }
        } else if (arg1 == -1 || arg0.field1202 == -1 || class204.method2139(arg1).field2294 >= class204.method2139(arg0.field1202).field2294) {
            arg0.field1202 = arg1;
            arg0.field1182 = 0;
            arg0.field1183 = 0;
            arg0.field1184 = arg2;
            arg0.field1185 = 0;
            arg0.field1211 = arg0.field1206;
        }
    }

    @ObfuscatedName("na.iv(I)I")
    public static int method6195() {
        return field715 ? 2 : 1;
    }

    @ObfuscatedName("cc.ir(IB)V")
    public static void method1062(int arg0) {
        field714 = 0L;
        if (arg0 >= 2) {
            field715 = true;
        } else {
            field715 = false;
        }
        if (method6195() == 1) {
            Statics.field466.method515(765, 503);
        } else {
            Statics.field466.method515(7680, 2160);
        }
        if (field499 >= 25) {
            method12();
        }
    }

    @ObfuscatedName("an.io(I)V")
    public static void method12() {
        class289 var0 = class289.method5974(class287.field3115, field753.field1385);
        var0.field3212.method8285(method6195());
        var0.field3212.method8232(Statics.field211);
        var0.field3212.method8232(Statics.field3026);
        field753.method2650(var0);
    }

    @ObfuscatedName("client.am(B)V")
    public final void method519() {
        field714 = class294.method2504() + 500L;
        this.method1173();
        if (field656 != -1) {
            this.method1181(true);
        }
    }

    @ObfuscatedName("client.ip(I)V")
    public void method1173() {
        int var1 = Statics.field211;
        int var2 = Statics.field3026;
        if (this.field207 < var1) {
            int var3 = this.field207;
        }
        if (this.field209 < var2) {
            int var4 = this.field209;
        }
        if (Statics.field112 != null) {
            try {
                class27.method387(Statics.field466, "resize", new Object[] { method6195() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.im(I)V")
    public final void method1174() {
        if (field656 != -1) {
            int var1 = field656;
            if (class317.method855(var1)) {
                method2530(Statics.field2057[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field781; var2++) {
            if (field706[var2]) {
                field707[var2] = true;
            }
            field652[var2] = field706[var2];
            field706[var2] = false;
        }
        field660 = field602;
        field645 = -1;
        field646 = -1;
        if (field656 != -1) {
            field781 = 0;
            method158(field656, 0, 0, Statics.field211, Statics.field3026, 0, 0, -1);
        }
        class499.method8571();
        if (field696) {
            if (field607 == 1) {
                Statics.field1861[field606 / 100].method8690(field515 - 8, field676 - 8);
            }
            if (field607 == 2) {
                Statics.field1861[field606 / 100 + 4].method8690(field515 - 8, field676 - 8);
            }
        }
        if (field669) {
            int var3 = Statics.field2065;
            int var4 = Statics.field1020;
            int var5 = Statics.field4753;
            int var6 = Statics.field1693;
            int var7 = 6116423;
            class499.method8603(var3, var4, var5, var6, var7);
            class499.method8603(var3 + 1, var4 + 1, var5 - 2, 16, 0);
            class499.method8632(var3 + 1, var4 + 18, var5 - 2, var6 - 19, 0);
            Statics.field1635.method6837(class337.field4114, var3 + 3, var4 + 14, var7, -1);
            int var8 = class36.field242;
            int var9 = class36.field243;
            for (int var10 = 0; var10 < field633; var10++) {
                int var11 = (field633 - 1 - var10) * 15 + var4 + 31;
                int var12 = 16777215;
                if (var8 > var3 && var8 < var3 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
                    var12 = 16776960;
                }
                Statics.field1635.method6837(method7141(var10), var3 + 3, var11, var12, 0);
            }
            method7107(Statics.field2065, Statics.field1020, Statics.field4753, Statics.field1693);
        } else if (field645 != -1) {
            method2165(field645, field646);
        }
        if (field713 == 3) {
            for (int var13 = 0; var13 < field781; var13++) {
                if (field652[var13]) {
                    class499.method8579(field709[var13], field710[var13], field640[var13], field712[var13], 16711935, 128);
                } else if (field707[var13]) {
                    class499.method8579(field709[var13], field710[var13], field640[var13], field712[var13], 16711680, 128);
                }
            }
        }
        Statics.method5963(Statics.field231, Statics.field3454.field1171, Statics.field3454.field1138, field565);
        field565 = 0;
    }

    @ObfuscatedName("jl.ij(Ljava/lang/String;ZI)V")
    public static final void method4988(String arg0, boolean arg1) {
        if (!field610) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2832.method6848(arg0, 250);
        int var6 = Statics.field2832.method6808(arg0, 250) * 13;
        class499.method8603(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class499.method8632(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2832.method6771(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field781; var11++) {
            if (field709[var11] + field640[var11] > var7 && field709[var11] < var7 + var9 && field712[var11] + field710[var11] > var8 && field710[var11] < var8 + var10) {
                field706[var11] = true;
            }
        }
        if (arg1) {
            Statics.field2381.method476(0, 0);
        } else {
            method7107(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("am.id(IIIII)V")
    public static final void method274(int arg0, int arg1, int arg2, int arg3) {
        field601++;
        if (Statics.field3454.field1171 >> 7 == field735 && Statics.field3454.field1138 >> 7 == field487) {
            field735 = 0;
        }
        method2537();
        if (field623 >= 0 && field611[field623] != null) {
            method704(field611[field623], false);
        }
        method3938(true);
        int var4 = class103.field1335;
        int[] var5 = class103.field1341;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field623 != var5[var6] && field664 != var5[var6]) {
                method704(field611[var5[var6]], true);
            }
        }
        method3938(false);
        method3047();
        method7367();
        method711(arg0, arg1, arg2, arg3, true);
        int var7 = field555;
        int var8 = field768;
        int var9 = field767;
        int var10 = field770;
        class499.method8572(var7, var8, var7 + var9, var8 + var10);
        class219.method264();
        class499.method8633();
        int var11 = field595;
        if (field589 / 256 > var11) {
            var11 = field589 / 256;
        }
        if (field754[4] && field777[4] + 128 > var11) {
            var11 = field777[4] + 128;
        }
        int var12 = field758 & 0x7FF;
        int var13 = Statics.field194;
        int var14 = Statics.field1297;
        int var15 = Statics.field1675;
        int var16 = method4635(var11);
        int var17 = var10 - 334;
        if (var17 < 0) {
            var17 = 0;
        } else if (var17 > 100) {
            var17 = 100;
        }
        int var18 = (field762 - field775) * var17 / 100 + field775;
        int var19 = var16 * var18 / 256;
        int var21 = 2048 - var11 & 0x7FF;
        int var22 = 2048 - var12 & 0x7FF;
        int var23 = 0;
        int var24 = 0;
        int var25 = var19;
        if (var21 != 0) {
            int var26 = class219.field2512[var21];
            int var27 = class219.field2516[var21];
            int var28 = var24 * var27 - var19 * var26 >> 16;
            var25 = var24 * var26 + var19 * var27 >> 16;
            var24 = var28;
        }
        if (var22 != 0) {
            int var29 = class219.field2512[var22];
            int var30 = class219.field2516[var22];
            int var31 = var23 * var30 + var25 * var29 >> 16;
            var25 = var25 * var30 - var23 * var29 >> 16;
            var23 = var31;
        }
        if (field746) {
            Statics.field3007 = var13 - var23;
            Statics.field1345 = var14 - var24;
            Statics.field1958 = var15 - var25;
            Statics.field1042 = var11;
            Statics.field1083 = var12;
        } else {
            Statics.field257 = var13 - var23;
            Statics.field1867 = var14 - var24;
            Statics.field3391 = var15 - var25;
            Statics.field2975 = var11;
            Statics.field1531 = var12;
        }
        if (field505 == 1 && field682 >= 2 && field602 % 50 == 0 && (Statics.field194 >> 7 != Statics.field3454.field1171 >> 7 || Statics.field1675 >> 7 != Statics.field3454.field1138 >> 7)) {
            int var32 = Statics.field3454.field1106;
            int var33 = (Statics.field194 >> 7) + Statics.field2850;
            int var34 = (Statics.field1675 >> 7) + Statics.field2841;
            class289 var35 = class289.method5974(class287.field3180, field753.field1385);
            var35.field3212.method8235(field577);
            var35.field3212.method8288(var33);
            var35.field3212.method8278(var32);
            var35.field3212.method8449(var34);
            field753.method2650(var35);
        }
        int var36;
        if (field746) {
            int var37;
            if (Statics.field112.method2391()) {
                var37 = Statics.field231;
            } else {
                int var38 = method3072(Statics.field257, Statics.field3391, Statics.field231);
                if (var38 - Statics.field1867 >= 800 || (class78.field1006[Statics.field231][Statics.field257 >> 7][Statics.field3391 >> 7] & 0x4) == 0) {
                    var37 = 3;
                } else {
                    var37 = Statics.field231;
                }
            }
            var36 = var37;
        } else {
            var36 = method2784();
        }
        int var39 = Statics.field257;
        int var40 = Statics.field1867;
        int var41 = Statics.field3391;
        int var42 = Statics.field2975;
        int var43 = Statics.field1531;
        for (int var44 = 0; var44 < 5; var44++) {
            if (field754[var44]) {
                int var45 = (int) (Math.random() * (double) (field755[var44] * 2 + 1) - (double) field755[var44] + Math.sin((double) field632[var44] / 100.0D * (double) field585[var44]) * (double) field777[var44]);
                if (var44 == 0) {
                    Statics.field257 += var45;
                }
                if (var44 == 1) {
                    Statics.field1867 += var45;
                }
                if (var44 == 2) {
                    Statics.field3391 += var45;
                }
                if (var44 == 3) {
                    Statics.field1531 = Statics.field1531 + var45 & 0x7FF;
                }
                if (var44 == 4) {
                    Statics.field2975 += var45;
                    if (Statics.field2975 < 128) {
                        Statics.field2975 = 128;
                    }
                    if (Statics.field2975 > 383) {
                        Statics.field2975 = 383;
                    }
                }
            }
        }
        int var46 = class36.field242;
        int var47 = class36.field243;
        if (class36.field252 != 0) {
            var46 = class36.field250;
            var47 = class36.field251;
        }
        if (var46 >= var7 && var46 < var7 + var9 && var47 >= var8 && var47 < var8 + var10) {
            int var48 = var46 - var7;
            int var49 = var47 - var8;
            class233.field2771 = var48;
            class233.field2766 = var49;
            class233.field2767 = true;
            class233.field2765 = 0;
            class233.field2764 = false;
        } else {
            class233.method3067();
        }
        method5961();
        class499.method8603(var7, var8, var9, var10, 0);
        method5961();
        int var50 = class219.method2756();
        class219.method5552(Statics.field466.field216);
        class219.field2515.field2791 = field582;
        Statics.field180.method4187(Statics.field257, Statics.field1867, Statics.field3391, Statics.field2975, Statics.field1531, var36);
        class219.method5552(false);
        if (field518) {
            class499.method8590();
        }
        class219.field2515.field2791 = var50;
        method5961();
        Statics.field180.method4184();
        field590 = 0;
        boolean var51 = false;
        int var52 = -1;
        int var53 = -1;
        int var54 = class103.field1335;
        int[] var55 = class103.field1341;
        for (int var56 = 0; var56 < field737 + var54; var56++) {
            class91 var57;
            if (var56 < var54) {
                var57 = field611[var55[var56]];
                if (field623 == var55[var56]) {
                    var51 = true;
                    var52 = var56;
                    continue;
                }
                if (Statics.field3454 == var57) {
                    var53 = var56;
                    continue;
                }
            } else {
                var57 = field546[field548[var56 - var54]];
            }
            method498(var57, var56, var7, var8, var9, var10);
        }
        if (field615 && var53 != -1) {
            method498(Statics.field3454, var53, var7, var8, var9, var10);
        }
        if (var51) {
            method498(field611[field623], var52, var7, var8, var9, var10);
        }
        for (int var58 = 0; var58 < field590; var58++) {
            int var59 = field592[var58];
            int var60 = field593[var58];
            int var61 = field608[var58];
            int var62 = field594[var58];
            boolean var63 = true;
            while (var63) {
                var63 = false;
                for (int var64 = 0; var64 < var58; var64++) {
                    if (var60 + 2 > field593[var64] - field594[var64] && var60 - var62 < field593[var64] + 2 && var59 - var61 < field608[var64] + field592[var64] && var59 + var61 > field592[var64] - field608[var64] && field593[var64] - field594[var64] < var60) {
                        var60 = field593[var64] - field594[var64];
                        var63 = true;
                    }
                }
            }
            field708 = field592[var58];
            field572 = field593[var58] = var60;
            String var65 = field599[var58];
            if (field626 == 0) {
                int var66 = 16776960;
                if (field587[var58] < 6) {
                    var66 = field716[field587[var58]];
                }
                if (field587[var58] == 6) {
                    var66 = field601 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field587[var58] == 7) {
                    var66 = field601 % 20 < 10 ? 255 : 65535;
                }
                if (field587[var58] == 8) {
                    var66 = field601 % 20 < 10 ? 45056 : 8454016;
                }
                if (field587[var58] == 9) {
                    int var67 = 150 - field567[var58];
                    if (var67 < 50) {
                        var66 = var67 * 1280 + 16711680;
                    } else if (var67 < 100) {
                        var66 = 16776960 - (var67 - 50) * 327680;
                    } else if (var67 < 150) {
                        var66 = (var67 - 100) * 5 + 65280;
                    }
                }
                if (field587[var58] == 10) {
                    int var68 = 150 - field567[var58];
                    if (var68 < 50) {
                        var66 = var68 * 5 + 16711680;
                    } else if (var68 < 100) {
                        var66 = 16711935 - (var68 - 50) * 327680;
                    } else if (var68 < 150) {
                        var66 = (var68 - 100) * 327680 + 255 - (var68 - 100) * 5;
                    }
                }
                if (field587[var58] == 11) {
                    int var69 = 150 - field567[var58];
                    if (var69 < 50) {
                        var66 = 16777215 - var69 * 327685;
                    } else if (var69 < 100) {
                        var66 = (var69 - 50) * 327685 + 65280;
                    } else if (var69 < 150) {
                        var66 = 16777215 - (var69 - 100) * 327680;
                    }
                }
                if (field597[var58] == 0) {
                    Statics.field1635.method6770(var65, field708 + var7, field572 + var8, var66, 0);
                }
                if (field597[var58] == 1) {
                    Statics.field1635.method6774(var65, field708 + var7, field572 + var8, var66, 0, field601);
                }
                if (field597[var58] == 2) {
                    Statics.field1635.method6775(var65, field708 + var7, field572 + var8, var66, 0, field601);
                }
                if (field597[var58] == 3) {
                    Statics.field1635.method6776(var65, field708 + var7, field572 + var8, var66, 0, field601, 150 - field567[var58]);
                }
                if (field597[var58] == 4) {
                    int var70 = (150 - field567[var58]) * (Statics.field1635.method6761(var65) + 100) / 150;
                    class499.method8573(field708 + var7 - 50, var8, field708 + var7 + 50, var8 + var10);
                    Statics.field1635.method6837(var65, field708 + var7 + 50 - var70, field572 + var8, var66, 0);
                    class499.method8572(var7, var8, var7 + var9, var8 + var10);
                }
                if (field597[var58] == 5) {
                    int var71 = 150 - field567[var58];
                    int var72 = 0;
                    if (var71 < 25) {
                        var72 = var71 - 25;
                    } else if (var71 > 125) {
                        var72 = var71 - 125;
                    }
                    class499.method8573(var7, field572 + var8 - Statics.field1635.field4439 - 1, var7 + var9, field572 + var8 + 5);
                    Statics.field1635.method6770(var65, field708 + var7, field572 + var8 + var72, var66, 0);
                    class499.method8572(var7, var8, var7 + var9, var8 + var10);
                }
            } else {
                Statics.field1635.method6770(var65, field708 + var7, field572 + var8, 16776960, 0);
            }
        }
        method5932(var7, var8);
        ((class229) class219.field2515.field2795).method4363(field565);
        method7142();
        Statics.field257 = var39;
        Statics.field1867 = var40;
        Statics.field3391 = var41;
        Statics.field2975 = var42;
        Statics.field1531 = var43;
        if (field500 && class345.method3449(true, false) == 0) {
            field500 = false;
        }
        if (field500) {
            class499.method8603(var7, var8, var9, var10, 0);
            method4988(class337.field3961, false);
        }
    }

    @ObfuscatedName("bt.it(IIIIZI)V")
    public static final void method711(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field759;
        } else if (var5 >= 100) {
            var6 = field760;
        } else {
            var6 = (field760 - field759) * var5 / 100 + field759;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field621) {
            short var8 = field621;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field764) {
                var6 = field764;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class499.method8571();
                    class499.method8603(arg0, arg1, var10, arg3, -16777216);
                    class499.method8603(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field695) {
            short var11 = field695;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field573) {
                var6 = field573;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class499.method8571();
                    class499.method8603(arg0, arg1, arg2, var13, -16777216);
                    class499.method8603(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field582 = arg3 * var6 / 334;
        if (field767 != arg2 || field770 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method4635(var16);
                int var18 = class219.field2512[var16];
                int var19 = arg3 - 334;
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 100) {
                    var19 = 100;
                }
                int var20 = (field762 - field775) * var19 / 100 + field775;
                int var21 = var17 * var20 / 256;
                var14[var15] = var18 * var21 >> 16;
            }
            class223.method4205(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field555 = arg0;
        field768 = arg1;
        field767 = arg2;
        field770 = arg3;
    }

    @ObfuscatedName("dx.ix(B)V")
    public static void method2537() {
        if (field615) {
            method704(Statics.field3454, false);
        }
    }

    @ObfuscatedName("bd.ib(Ldv;ZI)V")
    public static void method704(class88 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2188() || arg0.field1105) {
            return;
        }
        arg0.field1096 = false;
        if ((field493 && class103.field1335 > 50 || class103.field1335 > 200) && arg1 && arg0.field1187 == arg0.field1139) {
            arg0.field1096 = true;
        }
        int var2 = arg0.field1171 >> 7;
        int var3 = arg0.field1138 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class233.method4346(0, 0, 0, false, arg0.field1107);
        if (arg0.field1098 != null && field602 >= arg0.field1093 && field602 < arg0.field1094) {
            arg0.field1096 = false;
            arg0.field1092 = method3072(arg0.field1171, arg0.field1138, Statics.field231);
            arg0.field1159 = field602;
            Statics.field180.method4170(Statics.field231, arg0.field1171, arg0.field1138, arg0.field1092, 60, arg0, arg0.field1144, var4, arg0.field1100, arg0.field1087, arg0.field1091, arg0.field1101);
            return;
        }
        if ((arg0.field1171 & 0x7F) == 64 && (arg0.field1138 & 0x7F) == 64) {
            if (field601 == field535[var2][var3]) {
                return;
            }
            field535[var2][var3] = field601;
        }
        arg0.field1092 = method3072(arg0.field1171, arg0.field1138, Statics.field231);
        arg0.field1159 = field602;
        Statics.field180.method4181(Statics.field231, arg0.field1171, arg0.field1138, arg0.field1092, 60, arg0, arg0.field1144, var4, arg0.field1140);
    }

    @ObfuscatedName("ia.jc(ZS)V")
    public static final void method3938(boolean arg0) {
        for (int var1 = 0; var1 < field737; var1++) {
            class96 var2 = field546[field548[var1]];
            if (var2 != null && var2.method2188() && var2.field1277.field2028 == arg0 && var2.field1277.method3459()) {
                int var3 = var2.field1171 >> 7;
                int var4 = var2.field1138 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1141 == 1 && (var2.field1171 & 0x7F) == 64 && (var2.field1138 & 0x7F) == 64) {
                        if (field601 == field535[var3][var4]) {
                            continue;
                        }
                        field535[var3][var4] = field601;
                    }
                    long var5 = class233.method4346(0, 0, 1, !var2.field1277.field2048, field548[var1]);
                    var2.field1159 = field602;
                    Statics.field180.method4181(Statics.field231, var2.field1171, var2.field1138, method3072(var2.field1171 + (var2.field1141 * 64 - 64), var2.field1138 + (var2.field1141 * 64 - 64), Statics.field231), var2.field1141 * 64 - 64 + 60, var2, var2.field1144, var5, var2.field1140);
                }
            }
        }
    }

    @ObfuscatedName("fa.ji(I)V")
    public static final void method3047() {
        for (class73 var0 = (class73) field551.method6329(); var0 != null; var0 = (class73) field551.method6338()) {
            if (Statics.field231 != var0.field931 || field602 > var0.field938) {
                var0.method7651();
            } else if (field602 >= var0.field937) {
                if (var0.field941 > 0) {
                    class96 var1 = field546[var0.field941 - 1];
                    if (var1 != null && var1.field1171 >= 0 && var1.field1171 < 13312 && var1.field1138 >= 0 && var1.field1138 < 13312) {
                        var0.method2010(var1.field1171, var1.field1138, method3072(var1.field1171, var1.field1138, var0.field931) - var0.field936, field602);
                    }
                }
                if (var0.field941 < 0) {
                    int var2 = -var0.field941 - 1;
                    class88 var3;
                    if (field664 == var2) {
                        var3 = Statics.field3454;
                    } else {
                        var3 = field611[var2];
                    }
                    if (var3 != null && var3.field1171 >= 0 && var3.field1171 < 13312 && var3.field1138 >= 0 && var3.field1138 < 13312) {
                        var0.method2010(var3.field1171, var3.field1138, method3072(var3.field1171, var3.field1138, var0.field931) - var0.field936, field602);
                    }
                }
                var0.method2009(field565);
                Statics.field180.method4181(Statics.field231, (int) var0.field943, (int) var0.field944, (int) var0.field945, 60, var0, var0.field951, -1L, false);
            }
        }
    }

    @ObfuscatedName("qw.jg(B)V")
    public static final void method7367() {
        for (class68 var0 = (class68) field627.method6329(); var0 != null; var0 = (class68) field627.method6338()) {
            if (Statics.field231 != var0.field857 || var0.field858) {
                var0.method7651();
            } else if (field602 >= var0.field856) {
                var0.method1924(field565);
                if (var0.field858) {
                    var0.method7651();
                } else {
                    Statics.field180.method4181(var0.field857, var0.field862, var0.field859, var0.field860, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("eb.jx(B)I")
    public static final int method2784() {
        if (Statics.field112.method2391()) {
            return Statics.field231;
        }
        int var0 = 3;
        if (Statics.field2975 < 310) {
            int var1;
            int var2;
            if (field505 == 1) {
                var1 = Statics.field194 >> 7;
                var2 = Statics.field1675 >> 7;
            } else {
                var1 = Statics.field3454.field1171 >> 7;
                var2 = Statics.field3454.field1138 >> 7;
            }
            int var3 = Statics.field257 >> 7;
            int var4 = Statics.field3391 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field231;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field231;
            }
            if ((class78.field1006[Statics.field231][var3][var4] & 0x4) != 0) {
                var0 = Statics.field231;
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
                    if ((class78.field1006[Statics.field231][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field231;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class78.field1006[Statics.field231][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field231;
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
                    if ((class78.field1006[Statics.field231][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field231;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class78.field1006[Statics.field231][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field231;
                        }
                    }
                }
            }
        }
        if (Statics.field3454.field1171 >= 0 && Statics.field3454.field1138 >= 0 && Statics.field3454.field1171 < 13312 && Statics.field3454.field1138 < 13312) {
            if ((class78.field1006[Statics.field231][Statics.field3454.field1171 >> 7][Statics.field3454.field1138 >> 7] & 0x4) != 0) {
                var0 = Statics.field231;
            }
            return var0;
        } else {
            return Statics.field231;
        }
    }

    @ObfuscatedName("mm.jo(III)V")
    public static final void method5932(int arg0, int arg1) {
        if (field508 == 2) {
            method6568((field654 - Statics.field2850 << 7) + field766, (field512 - Statics.field2841 << 7) + field705, field547 * 2);
            if (field708 > -1 && field602 % 20 < 10) {
                Statics.field1959[0].method8690(field708 + arg0 - 12, field572 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("np.jk(B)Lnh;")
    public static class363 method6208() {
        return field699;
    }

    @ObfuscatedName("jh.jq(S)V")
    public static void method4934() {
        for (class207 var0 = (class207) field702.method6329(); var0 != null; var0 = (class207) field702.method6338()) {
            var0.method7651();
        }
    }

    @ObfuscatedName("po.je(Lhf;I)V")
    public static void method7106(class207 arg0) {
        if (arg0 == null || arg0.field2346 == null) {
            return;
        }
        if (arg0.field2346.field3571 >= 0) {
            class317 var1 = class317.method3201(arg0.field2346.field3589);
            if (var1 == null || var1.field3707 == null || var1.field3707.length == 0 || arg0.field2346.field3571 >= var1.field3707.length || var1.field3707[arg0.field2346.field3571] != arg0.field2346) {
                return;
            }
        }
        if (arg0.field2346.field3598 == 11 && arg0.field2345 == 0) {
            if (arg0.field2346.method5786(arg0.field2349, arg0.field2344, 0, 0)) {
                switch(arg0.field2346.method5790()) {
                    case 0:
                        class32.method7266(arg0.field2346.method5908(), true, false);
                        break;
                    case 1:
                        if (class318.method3710(method345(arg0.field2346))) {
                            int[] var2 = arg0.field2346.method5793();
                            if (var2 != null) {
                                class289 var3 = class289.method5974(class287.field3138, field753.field1385);
                                var3.field3212.method8235(var2[0]);
                                var3.field3212.method8299(arg0.field2346.field3570);
                                var3.field3212.method8234(var2[1]);
                                var3.field3212.method8301(arg0.field2346.method5791());
                                var3.field3212.method8235(var2[2]);
                                var3.field3212.method8324(arg0.field2346.field3571);
                                field753.method2650(var3);
                            }
                        }
                }
            }
        } else if (arg0.field2346.field3598 == 12) {
            class315 var4 = arg0.field2346.method5797();
            if (var4 != null && var4.method5544()) {
                switch(arg0.field2345) {
                    case 0:
                        field723.method3861(arg0.field2346);
                        var4.method5492(true);
                        var4.method5531(arg0.field2349, arg0.field2344, field722.method3888(82), field722.method3888(81));
                        break;
                    case 1:
                        var4.method5520(arg0.field2349, arg0.field2344);
                }
            }
        }
    }

    @ObfuscatedName("ai.jj(Ldv;I)Z")
    public static boolean method165(class88 arg0) {
        if (field612 == 0) {
            return false;
        } else if (Statics.field3454 == arg0) {
            return (field612 & 0x8) != 0;
        } else {
            boolean var1 = (field612 & 0x4) != 0;
            boolean var2 = var1;
            if (!var1) {
                boolean var3 = (field612 & 0x1) != 0;
                var2 = var3 && arg0.method2175();
            }
            boolean var4 = var2;
            if (!var2) {
                boolean var5 = (field612 & 0x2) != 0;
                var4 = var5 && arg0.method2213();
            }
            return var4;
        }
    }

    @ObfuscatedName("bz.jm(Lde;IIIIII)V")
    public static final void method498(class91 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2188()) {
            return;
        }
        if (arg0 instanceof class96) {
            class191 var6 = ((class96) arg0).field1277;
            if (var6.field2045 != null) {
                var6 = var6.method3458();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class103.field1335;
        int[] var8 = class103.field1341;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1149 != null && (!var9 || !arg0.field1145 && (field717 == 4 || !arg0.field1177 && (field717 == 0 || field717 == 3 || field717 == 1 && ((class88) arg0).method2175())))) {
            int var11 = arg0.field1196;
            method6568(arg0.field1171, arg0.field1138, var11);
            if (field708 > -1 && field590 < field591) {
                field608[field590] = Statics.field1635.method6761(arg0.field1149) / 2;
                field594[field590] = Statics.field1635.field4439;
                field592[field590] = field708;
                field593[field590] = field572 - var10;
                field587[field590] = arg0.field1162;
                field597[field590] = arg0.field1207;
                field567[field590] = arg0.field1161;
                field599[field590] = arg0.field1149;
                field590++;
                var10 += 12;
            }
        }
        if (!arg0.field1170.method6370()) {
            method2824(arg0, arg0.field1196 + 15);
            for (class95 var12 = (class95) arg0.field1170.method6413(); var12 != null; var12 = (class95) arg0.field1170.method6380()) {
                class92 var13 = var12.method2424(field602);
                if (var13 != null) {
                    class186 var14 = var12.field1266;
                    class503 var15 = var14.method3403();
                    class503 var16 = var14.method3404();
                    int var17 = 0;
                    int var18;
                    if (var15 == null || var16 == null) {
                        var18 = var14.field1966;
                    } else {
                        if (var14.field1973 * 2 < var16.field5088) {
                            var17 = var14.field1973;
                        }
                        var18 = var16.field5088 - var17 * 2;
                    }
                    int var19 = 255;
                    boolean var20 = true;
                    int var21 = field602 - var13.field1218;
                    int var22 = var13.field1216 * var18 / var14.field1966;
                    int var25;
                    if (var13.field1219 > var21) {
                        int var23 = var14.field1972 == 0 ? 0 : var21 / var14.field1972 * var14.field1972;
                        int var24 = var13.field1217 * var18 / var14.field1966;
                        var25 = (var22 - var24) * var23 / var13.field1219 + var24;
                    } else {
                        var25 = var22;
                        int var26 = var13.field1219 + var14.field1969 - var21;
                        if (var14.field1967 >= 0) {
                            var19 = (var26 << 8) / (var14.field1969 - var14.field1967);
                        }
                    }
                    if (var13.field1216 > 0 && var25 < 1) {
                        var25 = 1;
                    }
                    if (var15 == null || var16 == null) {
                        var10 += 5;
                        if (field708 > -1) {
                            int var32 = field708 + arg2 - (var18 >> 1);
                            int var33 = field572 + arg3 - var10;
                            class499.method8603(var32, var33, var25, 5, 65280);
                            class499.method8603(var25 + var32, var33, var18 - var25, 5, 16711680);
                        }
                        var10 += 2;
                    } else {
                        int var27;
                        if (var18 == var25) {
                            var27 = var17 * 2 + var25;
                        } else {
                            var27 = var17 + var25;
                        }
                        int var28 = var15.field5093;
                        var10 += var28;
                        int var29 = field708 + arg2 - (var18 >> 1);
                        int var30 = field572 + arg3 - var10;
                        int var31 = var29 - var17;
                        if (var19 >= 0 && var19 < 255) {
                            var15.method8696(var31, var30, var19);
                            class499.method8573(var31, var30, var27 + var31, var28 + var30);
                            var16.method8696(var31, var30, var19);
                        } else {
                            var15.method8690(var31, var30);
                            class499.method8573(var31, var30, var27 + var31, var28 + var30);
                            var16.method8690(var31, var30);
                        }
                        class499.method8572(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var12.method2427()) {
                    var12.method7651();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field602 == arg0.field1159 && method165((class88) arg0)) {
            class88 var34 = (class88) arg0;
            if (var9) {
                int var35 = arg0.field1196 + 15;
                method6568(arg0.field1171, arg0.field1138, var35);
                class383 var36 = (class383) field718.get(class461.field4886);
                var10 += 4;
                var36.method6770(var34.field1089.method8841(), field708 + arg2, field572 + arg3 - var10, 16777215, 0);
                var10 += 18;
            }
        }
        if (var9) {
            class88 var37 = (class88) arg0;
            if (var37.field1105) {
                return;
            }
            if (var37.field1090 != -1 || var37.field1108 != -1) {
                int var38 = arg0.field1196 + 15;
                method6568(arg0.field1171, arg0.field1138, var38);
                if (field708 > -1) {
                    if (var37.field1090 != -1) {
                        var10 += 25;
                        Statics.field256[var37.field1090].method8690(field708 + arg2 - 12, field572 + arg3 - var10);
                    }
                    if (var37.field1108 != -1) {
                        var10 += 25;
                        Statics.field4669[var37.field1108].method8690(field708 + arg2 - 12, field572 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field508 == 10 && field510 == var8[arg1]) {
                int var39 = arg0.field1196 + 15;
                method6568(arg0.field1171, arg0.field1138, var39);
                if (field708 > -1) {
                    int var40 = Statics.field1959[1].field5093 + var10;
                    Statics.field1959[1].method8690(field708 + arg2 - 12, field572 + arg3 - var40);
                }
            }
        } else {
            class96 var41 = (class96) arg0;
            int[] var42 = var41.method2442();
            short[] var43 = var41.method2452();
            if (var43 != null && var42 != null) {
                for (int var44 = 0; var44 < var43.length; var44++) {
                    if (var43[var44] >= 0 && var42[var44] >= 0) {
                        long var45 = (long) var42[var44] << 8 | (long) var43[var44];
                        class503 var47 = (class503) field742.method7068(var45);
                        if (var47 == null) {
                            class503[] var48 = class504.method2775(Statics.field4788, var42[var44], 0);
                            if (var48 != null && var43[var44] < var48.length) {
                                var47 = var48[var43[var44]];
                                field742.method7049(var45, var47);
                            }
                        }
                        if (var47 != null) {
                            method2824(arg0, arg0.field1196 + 15);
                            if (field708 > -1) {
                                var47.method8690(field708 + arg2 - (var47.field5088 >> 1), field572 + (arg3 - var47.field5093) - 4);
                            }
                        }
                    }
                }
            }
            if (field508 == 1 && field509 == field548[arg1 - var7] && field602 % 20 < 10) {
                int var49 = arg0.field1196 + 15;
                method6568(arg0.field1171, arg0.field1138, var49);
                if (field708 > -1) {
                    Statics.field1959[0].method8690(field708 + arg2 - 12, field572 + arg3 - 28);
                }
            }
        }
        for (int var50 = 0; var50 < 4; var50++) {
            int var51 = arg0.field1205[var50];
            int var52 = arg0.field1165[var50];
            class200 var53 = null;
            int var54 = 0;
            if (var52 >= 0) {
                if (var51 <= field602) {
                    continue;
                }
                var53 = class200.method2898(arg0.field1165[var50]);
                var54 = var53.field2143;
                if (var53 != null && var53.field2153 != null) {
                    var53 = var53.method3635();
                    if (var53 == null) {
                        arg0.field1205[var50] = -1;
                        continue;
                    }
                }
            } else if (var51 < 0) {
                continue;
            }
            int var55 = arg0.field1163[var50];
            class200 var56 = null;
            if (var55 >= 0) {
                var56 = class200.method2898(var55);
                if (var56 != null && var56.field2153 != null) {
                    var56 = var56.method3635();
                }
            }
            if (var51 - var54 <= field602) {
                if (var53 == null) {
                    arg0.field1205[var50] = -1;
                } else {
                    method2824(arg0, arg0.field1196 / 2);
                    if (field708 > -1) {
                        boolean var57 = true;
                        if (var50 == 1) {
                            field572 -= 20;
                        }
                        if (var50 == 2) {
                            field708 -= 15;
                            field572 -= 10;
                        }
                        if (var50 == 3) {
                            field708 += 15;
                            field572 -= 10;
                        }
                        Object var58 = null;
                        Object var59 = null;
                        Object var60 = null;
                        Object var61 = null;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        class503 var70 = null;
                        class503 var71 = null;
                        class503 var72 = null;
                        class503 var73 = null;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        int var82 = 0;
                        class503 var83 = var53.method3630();
                        if (var83 != null) {
                            var62 = var83.field5088;
                            int var84 = var83.field5093;
                            if (var84 > var82) {
                                var82 = var84;
                            }
                            var66 = var83.field5090;
                        }
                        class503 var85 = var53.method3631();
                        if (var85 != null) {
                            var63 = var85.field5088;
                            int var86 = var85.field5093;
                            if (var86 > var82) {
                                var82 = var86;
                            }
                            var67 = var85.field5090;
                        }
                        class503 var87 = var53.method3625();
                        if (var87 != null) {
                            var64 = var87.field5088;
                            int var88 = var87.field5093;
                            if (var88 > var82) {
                                var82 = var88;
                            }
                            var68 = var87.field5090;
                        }
                        class503 var89 = var53.method3633();
                        if (var89 != null) {
                            var65 = var89.field5088;
                            int var90 = var89.field5093;
                            if (var90 > var82) {
                                var82 = var90;
                            }
                            var69 = var89.field5090;
                        }
                        if (var56 != null) {
                            var70 = var56.method3630();
                            if (var70 != null) {
                                var74 = var70.field5088;
                                int var91 = var70.field5093;
                                if (var91 > var82) {
                                    var82 = var91;
                                }
                                var78 = var70.field5090;
                            }
                            var71 = var56.method3631();
                            if (var71 != null) {
                                var75 = var71.field5088;
                                int var92 = var71.field5093;
                                if (var92 > var82) {
                                    var82 = var92;
                                }
                                var79 = var71.field5090;
                            }
                            var72 = var56.method3625();
                            if (var72 != null) {
                                var76 = var72.field5088;
                                int var93 = var72.field5093;
                                if (var93 > var82) {
                                    var82 = var93;
                                }
                                var80 = var72.field5090;
                            }
                            var73 = var56.method3633();
                            if (var73 != null) {
                                var77 = var73.field5088;
                                int var94 = var73.field5093;
                                if (var94 > var82) {
                                    var82 = var94;
                                }
                                var81 = var73.field5090;
                            }
                        }
                        class379 var95 = var53.method3645();
                        if (var95 == null) {
                            var95 = Statics.field4327;
                        }
                        class379 var96;
                        if (var56 == null) {
                            var96 = Statics.field4327;
                        } else {
                            var96 = var56.method3645();
                            if (var96 == null) {
                                var96 = Statics.field4327;
                            }
                        }
                        Object var97 = null;
                        String var98 = null;
                        boolean var99 = false;
                        int var100 = 0;
                        String var101 = var53.method3629(arg0.field1166[var50]);
                        int var102 = var95.method6761(var101);
                        if (var56 != null) {
                            var98 = var56.method3629(arg0.field1142[var50]);
                            var100 = var96.method6761(var98);
                        }
                        int var103 = 0;
                        int var104 = 0;
                        if (var63 > 0) {
                            if (var87 == null && var89 == null) {
                                var103 = 1;
                            } else {
                                var103 = var102 / var63 + 1;
                            }
                        }
                        if (var56 != null && var75 > 0) {
                            if (var72 == null && var73 == null) {
                                var104 = 1;
                            } else {
                                var104 = var100 / var75 + 1;
                            }
                        }
                        int var105 = 0;
                        int var106 = var105;
                        if (var62 > 0) {
                            var105 += var62;
                        }
                        var105 += 2;
                        int var107 = var105;
                        if (var64 > 0) {
                            var105 += var64;
                        }
                        int var108 = var105;
                        int var109 = var105;
                        int var111;
                        if (var63 > 0) {
                            int var110 = var63 * var103;
                            var111 = var105 + var110;
                            var109 = (var110 - var102) / 2 + var105;
                        } else {
                            var111 = var102 + var105;
                        }
                        int var112 = var111;
                        if (var65 > 0) {
                            var111 += var65;
                        }
                        int var113 = 0;
                        int var114 = 0;
                        int var115 = 0;
                        int var116 = 0;
                        int var117 = 0;
                        if (var56 != null) {
                            var111 += 2;
                            var113 = var111;
                            if (var74 > 0) {
                                var111 += var74;
                            }
                            var111 += 2;
                            var114 = var111;
                            if (var76 > 0) {
                                var111 += var76;
                            }
                            var115 = var111;
                            var117 = var111;
                            if (var75 > 0) {
                                int var118 = var75 * var104;
                                var111 += var118;
                                var117 += (var118 - var100) / 2;
                            } else {
                                var111 += var100;
                            }
                            var116 = var111;
                            if (var77 > 0) {
                                var111 += var77;
                            }
                        }
                        int var119 = arg0.field1205[var50] - field602;
                        int var120 = var53.field2131 - var53.field2131 * var119 / var53.field2143;
                        int var121 = var53.field2148 * var119 / var53.field2143 + -var53.field2148;
                        int var122 = field708 + arg2 - (var111 >> 1) + var120;
                        int var123 = field572 + arg3 - 12 + var121;
                        int var124 = var123;
                        int var125 = var82 + var123;
                        int var126 = var53.field2152 + var123 + 15;
                        int var127 = var126 - var95.field4440;
                        int var128 = var95.field4441 + var126;
                        if (var127 < var123) {
                            var124 = var127;
                        }
                        if (var128 > var125) {
                            var125 = var128;
                        }
                        int var129 = 0;
                        if (var56 != null) {
                            var129 = var56.field2152 + var123 + 15;
                            int var130 = var129 - var96.field4440;
                            int var131 = var96.field4441 + var129;
                            if (var130 < var124) {
                                ;
                            }
                            if (var131 > var125) {
                                ;
                            }
                        }
                        int var134 = 255;
                        if (var53.field2155 >= 0) {
                            var134 = (var119 << 8) / (var53.field2143 - var53.field2155);
                        }
                        if (var134 >= 0 && var134 < 255) {
                            if (var83 != null) {
                                var83.method8696(var106 + var122 - var66, var123, var134);
                            }
                            if (var87 != null) {
                                var87.method8696(var107 + var122 - var68, var123, var134);
                            }
                            if (var85 != null) {
                                for (int var135 = 0; var135 < var103; var135++) {
                                    var85.method8696(var63 * var135 + (var108 + var122 - var67), var123, var134);
                                }
                            }
                            if (var89 != null) {
                                var89.method8696(var112 + var122 - var69, var123, var134);
                            }
                            var95.method6757(var101, var109 + var122, var126, var53.field2141, 0, var134);
                            if (var56 != null) {
                                if (var70 != null) {
                                    var70.method8696(var113 + var122 - var78, var123, var134);
                                }
                                if (var72 != null) {
                                    var72.method8696(var114 + var122 - var80, var123, var134);
                                }
                                if (var71 != null) {
                                    for (int var136 = 0; var136 < var104; var136++) {
                                        var71.method8696(var75 * var136 + (var115 + var122 - var79), var123, var134);
                                    }
                                }
                                if (var73 != null) {
                                    var73.method8696(var116 + var122 - var81, var123, var134);
                                }
                                var96.method6757(var98, var117 + var122, var129, var56.field2141, 0, var134);
                            }
                        } else {
                            if (var83 != null) {
                                var83.method8690(var106 + var122 - var66, var123);
                            }
                            if (var87 != null) {
                                var87.method8690(var107 + var122 - var68, var123);
                            }
                            if (var85 != null) {
                                for (int var137 = 0; var137 < var103; var137++) {
                                    var85.method8690(var63 * var137 + (var108 + var122 - var67), var123);
                                }
                            }
                            if (var89 != null) {
                                var89.method8690(var112 + var122 - var69, var123);
                            }
                            var95.method6837(var101, var109 + var122, var126, var53.field2141 | 0xFF000000, 0);
                            if (var56 != null) {
                                if (var70 != null) {
                                    var70.method8690(var113 + var122 - var78, var123);
                                }
                                if (var72 != null) {
                                    var72.method8690(var114 + var122 - var80, var123);
                                }
                                if (var71 != null) {
                                    for (int var138 = 0; var138 < var104; var138++) {
                                        var71.method8690(var75 * var138 + (var115 + var122 - var79), var123);
                                    }
                                }
                                if (var73 != null) {
                                    var73.method8690(var116 + var122 - var81, var123);
                                }
                                var96.method6837(var98, var117 + var122, var129, var56.field2141 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("pr.jn(I)V")
    public static final void method7142() {
        field609 = 0;
        int var0 = (Statics.field3454.field1171 >> 7) + Statics.field2850;
        int var1 = (Statics.field3454.field1138 >> 7) + Statics.field2841;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field609 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field609 = 1;
        }
        if (field609 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field609 = 0;
        }
    }

    @ObfuscatedName("eg.jd(Lde;II)V")
    public static final void method2824(class91 arg0, int arg1) {
        method6568(arg0.field1171, arg0.field1138, arg1);
    }

    @ObfuscatedName("ot.jf(IIII)V")
    public static final void method6568(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field708 = -1;
            field572 = -1;
            return;
        }
        int var3 = method3072(arg0, arg1, Statics.field231) - arg2;
        int var4 = arg0 - Statics.field257;
        int var5 = var3 - Statics.field1867;
        int var6 = arg1 - Statics.field3391;
        int var7 = class219.field2512[Statics.field2975];
        int var8 = class219.field2516[Statics.field2975];
        int var9 = class219.field2512[Statics.field1531];
        int var10 = class219.field2516[Statics.field1531];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field708 = field582 * var11 / var15 + field767 / 2;
            field572 = field582 * var14 / var15 + field770 / 2;
        } else {
            field708 = -1;
            field572 = -1;
        }
    }

    @ObfuscatedName("fq.jw(IIIB)I")
    public static final int method3072(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class78.field1006[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class78.field1002[var5][var3][var4] + class78.field1002[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class78.field1002[var5][var3][var4 + 1] + class78.field1002[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ec.js(ZLsq;B)V")
    public static final void method2951(boolean arg0, class488 arg1) {
        field689 = arg0;
        if (!field689) {
            int var2 = arg1.method8327();
            int var3 = arg1.method8327();
            int var4 = arg1.method8250();
            Statics.field2848 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2848[var5][var6] = arg1.method8254();
                }
            }
            Statics.field3064 = new int[var4];
            Statics.field4877 = new int[var4];
            Statics.field4199 = new int[var4];
            Statics.field11 = new byte[var4][];
            Statics.field834 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field3064[var7] = var10;
                    Statics.field4877[var7] = Statics.field4271.method6086("m" + var8 + "_" + var9);
                    Statics.field4199[var7] = Statics.field4271.method6086("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method1064(var3, var2, true);
            return;
        }
        int var11 = arg1.method8327();
        boolean var12 = arg1.method8248() == 1;
        int var13 = arg1.method8291();
        int var14 = arg1.method8250();
        arg1.method8226();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8197(1);
                    if (var18 == 1) {
                        field563[var15][var16][var17] = arg1.method8197(26);
                    } else {
                        field563[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8198();
        Statics.field2848 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field2848[var19][var20] = arg1.method8254();
            }
        }
        Statics.field3064 = new int[var14];
        Statics.field4877 = new int[var14];
        Statics.field4199 = new int[var14];
        Statics.field11 = new byte[var14][];
        Statics.field834 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field563[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field3064[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field3064[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field4877[var21] = Statics.field4271.method6086("m" + var30 + "_" + var31);
                            Statics.field4199[var21] = Statics.field4271.method6086("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method1064(var11, var13, !var12);
    }

    @ObfuscatedName("cc.jr(IIZB)V")
    public static final void method1064(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field165 == arg0 && Statics.field4672 == arg1) {
            return;
        }
        Statics.field165 = arg0;
        Statics.field4672 = arg1;
        method3032(25);
        method4988(class337.field3961, true);
        int var3 = Statics.field2850;
        int var4 = Statics.field2841;
        Statics.field2850 = (arg0 - 6) * 8;
        Statics.field2841 = (arg1 - 6) * 8;
        int var5 = Statics.field2850 - var3;
        int var6 = Statics.field2841 - var4;
        int var7 = Statics.field2850;
        int var8 = Statics.field2841;
        for (int var9 = 0; var9 < 65536; var9++) {
            class96 var10 = field546[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1174[var11] -= var5;
                    var10.field1176[var11] -= var6;
                }
                var10.field1171 -= var5 * 128;
                var10.field1138 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class88 var13 = field611[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1174[var14] -= var5;
                    var13.field1176[var14] -= var6;
                }
                var13.field1171 -= var5 * 128;
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
                        field624[var25][var21][var22] = field624[var25][var23][var24];
                    } else {
                        field624[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class90 var26 = (class90) field574.method6329(); var26 != null; var26 = (class90) field574.method6338()) {
            var26.field1121 -= var5;
            var26.field1122 -= var6;
            if (var26.field1121 < 0 || var26.field1122 < 0 || var26.field1121 >= 104 || var26.field1122 >= 104) {
                var26.method7651();
            }
        }
        if (field735 != 0) {
            field735 -= var5;
            field487 -= var6;
        }
        field507 = 0;
        field746 = false;
        Statics.field257 -= var5 << 7;
        Statics.field3391 -= var6 << 7;
        Statics.field194 -= var5 << 7;
        Statics.field1675 -= var6 << 7;
        field730 = -1;
        field627.method6323();
        field551.method6323();
        for (int var27 = 0; var27 < 4; var27++) {
            field561[var27].method3927();
        }
    }

    @ObfuscatedName("nx.jv(ZI)V")
    public static final void method6294(boolean arg0) {
        method5961();
        field753.field1391++;
        if (field753.field1391 < 50 && !arg0) {
            return;
        }
        field753.field1391 = 0;
        if (field553 || field753.method2655() == null) {
            return;
        }
        class289 var1 = class289.method5974(class287.field3189, field753.field1385);
        field753.method2650(var1);
        try {
            field753.method2666();
        } catch (IOException var3) {
            field553 = true;
        }
    }

    @ObfuscatedName("bb.jh(B)V")
    public static final void method411() {
        method6294(false);
        field560 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field11.length; var1++) {
            if (Statics.field4877[var1] != -1 && Statics.field11[var1] == null) {
                Statics.field11[var1] = Statics.field4271.method6090(Statics.field4877[var1], 0);
                if (Statics.field11[var1] == null) {
                    var0 = false;
                    field560++;
                }
            }
            if (Statics.field4199[var1] != -1 && Statics.field834[var1] == null) {
                Statics.field834[var1] = Statics.field4271.method6072(Statics.field4199[var1], 0, Statics.field2848[var1]);
                if (Statics.field834[var1] == null) {
                    var0 = false;
                    field560++;
                }
            }
        }
        if (!var0) {
            field622 = 1;
            return;
        }
        field558 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field11.length; var3++) {
            byte[] var4 = Statics.field834[var3];
            if (var4 != null) {
                int var5 = (Statics.field3064[var3] >> 8) * 64 - Statics.field2850;
                int var6 = (Statics.field3064[var3] & 0xFF) * 64 - Statics.field2841;
                if (field689) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class78.method3375(var4, var5, var6);
            }
        }
        if (!var2) {
            field622 = 2;
            return;
        }
        if (field622 != 0) {
            method4988(class337.field3961 + class97.field1290 + class97.field1287 + 100 + "%" + class97.field1288, true);
        }
        method5961();
        Statics.field180.method4268();
        for (int var7 = 0; var7 < 4; var7++) {
            field561[var7].method3927();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class78.field1006[var8][var9][var10] = 0;
                }
            }
        }
        method5961();
        class78.method3027();
        int var11 = Statics.field11.length;
        class66.method3608();
        method6294(true);
        if (!field689) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field3064[var12] >> 8) * 64 - Statics.field2850;
                int var14 = (Statics.field3064[var12] & 0xFF) * 64 - Statics.field2841;
                byte[] var15 = Statics.field11[var12];
                if (var15 != null) {
                    method5961();
                    class78.method4618(var15, var13, var14, Statics.field165 * 8 - 48, Statics.field4672 * 8 - 48, field561);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field3064[var16] >> 8) * 64 - Statics.field2850;
                int var18 = (Statics.field3064[var16] & 0xFF) * 64 - Statics.field2841;
                byte[] var19 = Statics.field11[var16];
                if (var19 == null && Statics.field4672 < 800) {
                    method5961();
                    class78.method2896(var17, var18, 64, 64);
                }
            }
            method6294(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field834[var20];
                if (var21 != null) {
                    int var22 = (Statics.field3064[var20] >> 8) * 64 - Statics.field2850;
                    int var23 = (Statics.field3064[var20] & 0xFF) * 64 - Statics.field2841;
                    method5961();
                    class78.method3071(var21, var22, var23, Statics.field180, field561);
                }
            }
        }
        if (field689) {
            for (int var24 = 0; var24 < 4; var24++) {
                method5961();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field563[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field3064.length; var34++) {
                                if (Statics.field3064[var34] == var33 && Statics.field11[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class78.method287(Statics.field11[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field561);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class78.method4380(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field563[0][var37][var38];
                    if (var39 == -1) {
                        class78.method2896(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method6294(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method5961();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field563[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field3064.length; var49++) {
                                if (Statics.field3064[var49] == var48 && Statics.field834[var49] != null) {
                                    class78.method2060(Statics.field834[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field180, field561);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method6294(true);
        method5961();
        class78.method91(Statics.field180, field561);
        method6294(true);
        int var50 = class78.field999;
        if (var50 > Statics.field231) {
            var50 = Statics.field231;
        }
        if (var50 < Statics.field231 - 1) {
            int var51 = Statics.field231 - 1;
        }
        if (field493) {
            Statics.field180.method4239(class78.field999);
        } else {
            Statics.field180.method4239(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method2842(var52, var53);
            }
        }
        method5961();
        method372();
        class201.field2160.method5125();
        if (Statics.field466.method661()) {
            class289 var54 = class289.method5974(class287.field3135, field753.field1385);
            var54.field3212.method8234(1057001181);
            field753.method2650(var54);
        }
        if (!field689) {
            int var55 = (Statics.field165 - 6) / 8;
            int var56 = (Statics.field165 + 6) / 8;
            int var57 = (Statics.field4672 - 6) / 8;
            int var58 = (Statics.field4672 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field4271.method6092("m" + var59 + "_" + var60);
                        Statics.field4271.method6092("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method3032(30);
        method5961();
        class78.method4344();
        class289 var61 = class289.method5974(class287.field3173, field753.field1385);
        field753.method2650(var61);
        Statics.method2498();
    }

    @ObfuscatedName("ff.jy(IIIIII)V")
    public static final void method3078(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field180.method4196(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field180.method4334(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class233.method3307(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field1396.field5089;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class233.method2144(var5);
            class201 var14 = Statics.method3057(var13);
            if (var14.field2197 == -1) {
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
                class502 var15 = Statics.field3826[var14.field2197];
                if (var15 != null) {
                    int var16 = (var14.field2172 * 4 - var15.field5081) / 2;
                    int var17 = (var14.field2173 * 4 - var15.field5082) / 2;
                    var15.method8656(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field2173) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field180.method4198(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field180.method4334(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class233.method2144(var18);
            class201 var24 = Statics.method3057(var23);
            if (var24.field2197 != -1) {
                class502 var25 = Statics.field3826[var24.field2197];
                if (var25 != null) {
                    int var26 = (var24.field2172 * 4 - var25.field5081) / 2;
                    int var27 = (var24.field2173 * 4 - var25.field5082) / 2;
                    var25.method8656(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field2173) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class233.method3307(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field1396.field5089;
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
        long var31 = Statics.field180.method4199(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class233.method2144(var31);
        class201 var34 = Statics.method3057(var33);
        if (var34.field2197 == -1) {
            return;
        }
        class502 var35 = Statics.field3826[var34.field2197];
        if (var35 != null) {
            int var36 = (var34.field2172 * 4 - var35.field5081) / 2;
            int var37 = (var34.field2173 * 4 - var35.field5082) / 2;
            var35.method8656(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field2173) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.jp(Leq;II)Z")
    public boolean method1175(class107 arg0, int arg1) {
        if (arg0.field1388 == 0) {
            Statics.field1426 = null;
        } else {
            if (Statics.field1426 == null) {
                Statics.field1426 = new class404(Statics.field889, Statics.field466);
            }
            Statics.field1426.method7111(arg0.field1386, arg1);
        }
        field691 = field680;
        Statics.field865 = true;
        arg0.field1382 = null;
        return true;
    }

    @ObfuscatedName("client.jt(Leq;B)Z")
    public boolean method1176(class107 arg0) {
        if (Statics.field1426 != null) {
            Statics.field1426.method7115(arg0.field1386);
        }
        field691 = field680;
        Statics.field865 = true;
        arg0.field1382 = null;
        return true;
    }

    @ObfuscatedName("client.ja(Leq;I)Z")
    public final boolean method1264(class107 arg0) {
        class414 var2 = arg0.method2655();
        class488 var3 = arg0.field1386;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1382 == null) {
                if (arg0.field1389) {
                    if (!var2.method7305(1)) {
                        return false;
                    }
                    var2.method7289(arg0.field1386.field4991, 0, 1);
                    arg0.field1390 = 0;
                    arg0.field1389 = false;
                }
                var3.field4989 = 0;
                if (var3.method8213()) {
                    if (!var2.method7305(1)) {
                        return false;
                    }
                    var2.method7289(arg0.field1386.field4991, 1, 1);
                    arg0.field1390 = 0;
                }
                arg0.field1389 = true;
                class290[] var4 = class290.method5148();
                int var5 = var3.method8194();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4989);
                }
                arg0.field1382 = var4[var5];
                arg0.field1388 = arg0.field1382.field3338;
            }
            if (arg0.field1388 == -1) {
                if (!var2.method7305(1)) {
                    return false;
                }
                arg0.method2655().method7289(var3.field4991, 0, 1);
                arg0.field1388 = var3.field4991[0] & 0xFF;
            }
            if (arg0.field1388 == -2) {
                if (!var2.method7305(2)) {
                    return false;
                }
                arg0.method2655().method7289(var3.field4991, 0, 2);
                var3.field4989 = 0;
                arg0.field1388 = var3.method8250();
            }
            if (!var2.method7305(arg0.field1388)) {
                return false;
            }
            var3.field4989 = 0;
            var2.method7289(var3.field4991, 0, arg0.field1388);
            arg0.field1390 = 0;
            field516.method6952();
            arg0.field1387 = arg0.field1393;
            arg0.field1393 = arg0.field1392;
            arg0.field1392 = arg0.field1382;
            if (class290.field3247 == arg0.field1382) {
                int var6 = var3.method8254();
                int var7 = var3.method8254();
                int var8 = class35.method6162();
                class289 var9 = class289.method5974(class287.field3166, field753.field1385);
                var9.field3212.method8278(field204);
                var9.field3212.method8306(var8);
                var9.field3212.method8301(var6);
                var9.field3212.method8301(var7);
                field753.method2650(var9);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3238 == arg0.field1382) {
                byte var10 = var3.method8249();
                long var11 = (long) var3.method8250();
                long var13 = (long) var3.method8252();
                long var15 = (var11 << 32) + var13;
                boolean var17 = false;
                class160 var18 = var10 >= 0 ? field679[var10] : Statics.field253;
                if (var18 == null) {
                    var17 = true;
                } else {
                    for (int var19 = 0; var19 < 100; var19++) {
                        if (field786[var19] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17) {
                    field786[field721] = var15;
                    field721 = (field721 + 1) % 100;
                    String var20 = class320.method4550(var3);
                    int var21 = var10 >= 0 ? 43 : 46;
                    class106.method3024(var21, "", var20, var18.field1773);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3219 == arg0.field1382) {
                int var22 = var3.method8303();
                int var23 = var3.method8304();
                int var24 = var3.method8291();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = var3.method8290();
                if (var25 == 65535) {
                    var25 = -1;
                }
                for (int var26 = var25; var26 <= var24; var26++) {
                    long var27 = ((long) var22 << 32) + (long) var26;
                    class449 var29 = field703.method7966(var27);
                    if (var29 != null) {
                        var29.method7651();
                    }
                    field703.method7967(new class448(var23), var27);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3288 == arg0.field1382) {
                int var30 = var3.method8293();
                int var31 = var3.method8302();
                int var32 = var3.method8411();
                class317 var33 = class317.method3201(var31);
                if (var33.field3579 != var30 || var33.field3580 != var32 || var33.field3609 != 0 || var33.field3576 != 0) {
                    var33.field3579 = var30;
                    var33.field3580 = var32;
                    var33.field3609 = 0;
                    var33.field3576 = 0;
                    method3056(var33);
                    this.method1281(var33);
                    if (var33.field3598 == 0) {
                        method4620(Statics.field2057[var31 >> 16], var33, false);
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3309 == arg0.field1382) {
                int var34 = var3.method8281();
                int var35 = var3.method8282();
                int var36 = var3.method8254();
                class317 var37 = class317.method3201(var36);
                class317.method2050(var37, var34, var35);
                method3056(var37);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3287 == arg0.field1382) {
                int var38 = var3.method8248();
                method5170(var38);
                arg0.field1382 = null;
                return false;
            }
            if (class290.field3285 == arg0.field1382) {
                int var39 = var3.method8291();
                int var40 = var3.method8250();
                int var41 = var3.method8303();
                class317 var42 = class317.method3201(var41);
                var42.field3627 = (var39 << 16) + var40;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3311 == arg0.field1382) {
                int var43 = var3.method8250();
                class96 var44 = field546[var43];
                int var45 = var3.method8250();
                int var46 = var3.method8254();
                if (var44 != null) {
                    var44.method2255(0, var45, var46 >> 16, var46 & 0xFFFF);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3273 == arg0.field1382) {
                method3441(class288.field3209);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3330 == arg0.field1382) {
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3319 == arg0.field1382) {
                int var47 = var3.method8302();
                int var48 = var3.method8290();
                short var49 = (short) var3.method8411();
                int var50 = var3.method8282();
                class96 var51 = field546[var48];
                if (var51 != null) {
                    var51.method2444(var50, var47, var49);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3223 == arg0.field1382) {
                int var52 = var3.method8250();
                class88 var53;
                if (field664 == var52) {
                    var53 = Statics.field3454;
                } else {
                    var53 = field611[var52];
                }
                int var54 = var3.method8250();
                int var55 = var3.method8254();
                if (var53 != null) {
                    var53.method2255(0, var54, var55 >> 16, var55 & 0xFFFF);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3262 == arg0.field1382) {
                int var56 = var3.method8417();
                boolean var57 = var3.method8248() == 1;
                String var58 = "";
                boolean var59 = false;
                if (var57) {
                    var58 = var3.method8259();
                    if (Statics.field804.method1741(new class513(var58, Statics.field889))) {
                        var59 = true;
                    }
                }
                String var60 = var3.method8259();
                if (!var59) {
                    class106.method2767(var56, var58, var60);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3332 == arg0.field1382) {
                int var61 = var3.method8304();
                int var62 = var3.method8304();
                class317 var63 = class317.method3201(var61);
                class317.method5131(var63, var62);
                method3056(var63);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3240 == arg0.field1382) {
                int var64 = var3.method8254();
                boolean var65 = var3.method8231() == 1;
                class317 var66 = class317.method3201(var64);
                if (var66.field3590 != var65) {
                    var66.field3590 = var65;
                    method3056(var66);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3280 == arg0.field1382) {
                return this.method1176(arg0);
            }
            if (class290.field3304 == arg0.field1382) {
                method3441(class288.field3203);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3258 == arg0.field1382) {
                int var67 = var3.method8302();
                int var68 = var3.method8250();
                class317 var69 = class317.method3201(var67);
                if (var69.field3657 != 1 || var69.field3683 != var68) {
                    var69.field3657 = 1;
                    var69.field3683 = var68;
                    method3056(var69);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3329 == arg0.field1382) {
                field746 = true;
                field732 = false;
                field674 = true;
                Statics.field1903 = var3.method8248();
                Statics.field1500 = var3.method8248();
                int var70 = var3.method8250();
                int var71 = var3.method8250();
                field749 = var3.method8296();
                int var72 = var3.method8248();
                int var73 = Statics.field1903 * 128 + 64;
                int var74 = Statics.field1500 * 128 + 64;
                boolean var75 = false;
                boolean var76 = false;
                int var77;
                int var78;
                if (field749) {
                    var77 = Statics.field1867;
                    var78 = method3072(var73, var74, Statics.field231) - var70;
                } else {
                    var77 = method3072(Statics.field257, Statics.field3391, Statics.field231) - Statics.field1867;
                    var78 = var70;
                }
                field668 = new class454(Statics.field257, Statics.field3391, var77, var73, var74, var78, var71, var72);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3283 == arg0.field1382) {
                return this.method1175(arg0, 2);
            }
            if (class290.field3337 == arg0.field1382) {
                Statics.field4883 = var3.method8282();
                Statics.field44 = var3.method8248();
                while (var3.field4989 < arg0.field1388) {
                    int var79 = var3.method8248();
                    class288 var80 = class288.method2576()[var79];
                    method3441(var80);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3220 == arg0.field1382) {
                int var81 = var3.method8302();
                class317 var82 = class317.method3201(var81);
                var82.field3657 = 3;
                var82.field3683 = Statics.field3454.field1097.method5452();
                method3056(var82);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3323 == arg0.field1382) {
                int var83 = var3.method8250();
                if (var83 == 65535) {
                    var83 = -1;
                }
                field656 = var83;
                this.method1181(false);
                method5143(var83);
                class67.method156(field656);
                for (int var84 = 0; var84 < 100; var84++) {
                    field706[var84] = true;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3308 == arg0.field1382) {
                Statics.field804.method1790(var3, arg0.field1388);
                field690 = field680;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3265 == arg0.field1382) {
                field653 = var3.method8248();
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3227 == arg0.field1382) {
                method3441(class288.field3207);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3334 == arg0.field1382) {
                Statics.field1340 = null;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3257 == arg0.field1382) {
                method3441(class288.field3206);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3231 == arg0.field1382) {
                String var85 = var3.method8259();
                Object[] var86 = new Object[var85.length() + 1];
                for (int var87 = var85.length() - 1; var87 >= 0; var87--) {
                    if (var85.charAt(var87) == 's') {
                        var86[var87 + 1] = var3.method8259();
                    } else {
                        var86[var87 + 1] = Integer.valueOf(var3.method8254());
                    }
                }
                var86[0] = Integer.valueOf(var3.method8254());
                class84 var88 = new class84();
                var88.field1052 = var86;
                class67.method2285(var88);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3305 == arg0.field1382) {
                class103.method6168(var3, arg0.field1388);
                method2166();
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3267 == arg0.field1382) {
                byte var89 = var3.method8249();
                String var90 = var3.method8259();
                long var91 = (long) var3.method8250();
                long var93 = (long) var3.method8252();
                class339 var95 = (class339) Statics.method3600(class339.method5985(), var3.method8248());
                long var96 = (var91 << 32) + var93;
                boolean var98 = false;
                Object var99 = null;
                class160 var100 = var89 >= 0 ? field679[var89] : Statics.field253;
                if (var100 == null) {
                    var98 = true;
                } else {
                    int var101 = 0;
                    while (true) {
                        if (var101 >= 100) {
                            if (var95.field4170 && Statics.field804.method1741(new class513(var90, Statics.field889))) {
                                var98 = true;
                            }
                            break;
                        }
                        if (field786[var101] == var96) {
                            var98 = true;
                            break;
                        }
                        var101++;
                    }
                }
                if (!var98) {
                    field786[field721] = var96;
                    field721 = (field721 + 1) % 100;
                    String var102 = class383.method6854(class320.method4550(var3));
                    int var103 = var89 >= 0 ? 41 : 44;
                    if (var95.field4185 == -1) {
                        class106.method3024(var103, var90, var102, var100.field1773);
                    } else {
                        class106.method3024(var103, class97.method6000(var95.field4185) + var90, var102, var100.field1773);
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3230 == arg0.field1382) {
                var3.field4989 += 28;
                if (var3.method8277()) {
                    method2720(var3, var3.field4989 - 28);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3261 == arg0.field1382) {
                method2951(false, arg0.field1386);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3222 == arg0.field1382) {
                int var104 = var3.method8248();
                if (var3.method8248() == 0) {
                    field776[var104] = new class353();
                    var3.field4989 += 18;
                } else {
                    var3.field4989--;
                    field776[var104] = new class353(var3, false);
                }
                field763 = field680;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3276 == arg0.field1382) {
                int var105 = var3.method8294();
                int var106 = var3.method8304();
                class317 var107 = class317.method3201(var106);
                if (var107.field3618 != var105 || var105 == -1) {
                    var107.field3618 = var105;
                    var107.field3705 = 0;
                    var107.field3706 = 0;
                    method3056(var107);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3331 == arg0.field1382) {
                boolean var108 = var3.method8248() == 1;
                int var109 = var3.method8254();
                class317 var110 = class317.method3201(var109);
                class317.method2117(var110, Statics.field3454.field1097, var108);
                method3056(var110);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3272 == arg0.field1382) {
                int var111 = var3.method8327();
                int var112 = var3.method8304();
                int var113 = var111 >> 10 & 0x1F;
                int var114 = var111 >> 5 & 0x1F;
                int var115 = var111 & 0x1F;
                int var116 = (var115 << 3) + (var113 << 19) + (var114 << 11);
                class317 var117 = class317.method3201(var112);
                if (var117.field3595 != var116) {
                    var117.field3595 = var116;
                    method3056(var117);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3248 == arg0.field1382) {
                int var118 = var3.method8250();
                int var119 = var3.method8282() * 4;
                int var120 = var3.method8231();
                byte var121 = var3.method8284();
                int var122 = var3.method8231() * 4;
                int var123 = var3.method8250();
                int var124 = var3.method8291();
                int var125 = var3.method8298();
                int var126 = var3.method8248();
                int var127 = var3.method8297();
                int var128 = var127 >> 16;
                int var129 = var127 >> 8 & 0xFF;
                int var130 = (var127 >> 4 & 0x7) + var128;
                int var131 = (var127 & 0x7) + var129;
                byte var132 = var3.method8249();
                int var133 = var121 + var130;
                int var134 = var131 + var132;
                if (var130 >= 0 && var131 >= 0 && var130 < 104 && var131 < 104 && var133 >= 0 && var134 >= 0 && var133 < 104 && var134 < 104 && var123 != 65535) {
                    int var135 = var130 * 128 + 64;
                    int var136 = var131 * 128 + 64;
                    int var137 = var133 * 128 + 64;
                    int var138 = var134 * 128 + 64;
                    class73 var139 = new class73(var123, Statics.field231, var135, var136, method3072(var135, var136, Statics.field231) - var122, field602 + var118, field602 + var124, var126, var120, var125, var119);
                    var139.method2010(var137, var138, method3072(var137, var138, Statics.field231) - var119, field602 + var118);
                    field551.method6324(var139);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3295 == arg0.field1382) {
                method3441(class288.field3200);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3326 == arg0.field1382) {
                Statics.field804.method1736();
                field690 = field680;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3325 == arg0.field1382) {
                int var140 = arg0.field1388 + var3.field4989;
                int var141 = var3.method8250();
                if (var141 == 65535) {
                    var141 = -1;
                }
                int var142 = var3.method8250();
                if (field656 != var141) {
                    field656 = var141;
                    this.method1181(false);
                    method5143(field656);
                    class67.method156(field656);
                    for (int var143 = 0; var143 < 100; var143++) {
                        field706[var143] = true;
                    }
                }
                while (var142-- > 0) {
                    int var144 = var3.method8254();
                    int var145 = var3.method8250();
                    int var146 = var3.method8248();
                    class83 var147 = (class83) field657.method7966((long) var144);
                    if (var147 != null && var147.field1037 != var145) {
                        method6286(var147, true);
                        var147 = null;
                    }
                    if (var147 == null) {
                        var147 = method2526(var144, var145, var146);
                    }
                    var147.field1039 = true;
                }
                for (class83 var148 = (class83) field657.method7972(); var148 != null; var148 = (class83) field657.method7969()) {
                    if (var148.field1039) {
                        var148.field1039 = false;
                    } else {
                        method6286(var148, true);
                    }
                }
                field703 = new class465(512);
                while (var3.field4989 < var140) {
                    int var149 = var3.method8254();
                    int var150 = var3.method8250();
                    int var151 = var3.method8250();
                    int var152 = var3.method8254();
                    for (int var153 = var150; var153 <= var151; var153++) {
                        long var154 = ((long) var149 << 32) + (long) var153;
                        field703.method7967(new class448(var152), var154);
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3289 == arg0.field1382) {
                int var156 = var3.method8248();
                int var157 = var3.method8248();
                int var158 = var3.method8248();
                int var159 = var3.method8248();
                field754[var156] = true;
                field755[var156] = var157;
                field777[var156] = var158;
                field632[var156] = var159;
                field585[var156] = 0;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3307 == arg0.field1382) {
                int var160 = var3.method8290();
                int var161 = var3.method8281();
                int var162 = var3.method8290();
                if (var162 == 65535) {
                    var162 = -1;
                }
                class96 var163 = field546[var160];
                if (var163 != null) {
                    if (var163.field1202 == var162 && var162 != -1) {
                        int var164 = class204.method2139(var162).field2315;
                        if (var164 == 1) {
                            var163.field1182 = 0;
                            var163.field1183 = 0;
                            var163.field1184 = var161;
                            var163.field1185 = 0;
                        } else if (var164 == 2) {
                            var163.field1185 = 0;
                        }
                    } else if (var162 == -1 || var163.field1202 == -1 || class204.method2139(var162).field2294 >= class204.method2139(var163.field1202).field2294) {
                        var163.field1202 = var162;
                        var163.field1182 = 0;
                        var163.field1183 = 0;
                        var163.field1184 = var161;
                        var163.field1185 = 0;
                        var163.field1211 = var163.field1206;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3291 == arg0.field1382) {
                class37.method2783(var3, arg0.field1388);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3271 == arg0.field1382) {
                for (int var165 = 0; var165 < field611.length; var165++) {
                    if (field611[var165] != null) {
                        field611[var165].field1202 = -1;
                    }
                }
                for (int var166 = 0; var166 < field546.length; var166++) {
                    if (field546[var166] != null) {
                        field546[var166].field1202 = -1;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3244 == arg0.field1382) {
                Statics.field4883 = var3.method8231();
                Statics.field44 = var3.method8282();
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3239 == arg0.field1382) {
                method3441(class288.field3204);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3269 == arg0.field1382) {
                boolean var167 = var3.method8296();
                if (!var167) {
                    Statics.field1586 = null;
                } else if (Statics.field1586 == null) {
                    Statics.field1586 = new class355();
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3320 == arg0.field1382) {
                field693 = field680;
                byte var168 = var3.method8249();
                class157 var169 = new class157(var3);
                class160 var170;
                if (var168 >= 0) {
                    var170 = field679[var168];
                } else {
                    var170 = Statics.field253;
                }
                var169.method3145(var170);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3235 == arg0.field1382) {
                int var171 = var3.method8254();
                int var172 = var3.method8290();
                class307.field3481[var172] = var171;
                if (class307.field3482[var172] != var171) {
                    class307.field3482[var172] = var171;
                }
                method50(var172);
                field740[++field514 - 1 & 0x1F] = var172;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3317 == arg0.field1382) {
                int var173 = var3.method8254();
                int var174 = var3.method8231();
                class317 var175 = class317.method3201(var173);
                class317.method3182(var175, Statics.field3454.field1097.field3522, var174);
                method3056(var175);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3322 == arg0.field1382) {
                field732 = false;
                field746 = false;
                field674 = false;
                field748 = false;
                Statics.field4885 = 0;
                Statics.field1872 = 0;
                Statics.field470 = 0;
                field749 = false;
                Statics.field4214 = 0;
                Statics.field1938 = 0;
                Statics.field1638 = 0;
                Statics.field138 = 0;
                Statics.field1903 = 0;
                Statics.field1500 = 0;
                Statics.field91 = 0;
                field668 = null;
                field738 = null;
                field751 = null;
                for (int var176 = 0; var176 < 5; var176++) {
                    field754[var176] = false;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3268 == arg0.field1382) {
                int var177 = var3.method8327();
                if (var177 == 65535) {
                    var177 = -1;
                }
                method11(var177);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3298 == arg0.field1382) {
                int var178 = var3.method8252();
                int var179 = var3.method8327();
                if (var179 == 65535) {
                    var179 = -1;
                }
                method3930(var179, var178);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3315 == arg0.field1382) {
                int var180 = var3.method8304();
                int var181 = var3.method8302();
                int var182 = var3.method8291();
                if (var182 == 65535) {
                    var182 = -1;
                }
                class317 var183 = class317.method3201(var180);
                if (var183.field3651) {
                    var183.field3703 = var182;
                    var183.field3637 = var181;
                    class202 var185 = class202.method2286(var182);
                    var183.field3622 = var185.field2225;
                    var183.field3566 = var185.field2226;
                    var183.field3711 = var185.field2260;
                    var183.field3620 = var185.field2228;
                    var183.field3709 = var185.field2229;
                    var183.field3619 = var185.field2224;
                    if (var185.field2236 == 1) {
                        var183.field3631 = 1;
                    } else {
                        var183.field3631 = 2;
                    }
                    if (var183.field3626 > 0) {
                        var183.field3619 = var183.field3619 * 32 / var183.field3626;
                    } else if (var183.field3581 > 0) {
                        var183.field3619 = var183.field3619 * 32 / var183.field3581;
                    }
                    method3056(var183);
                } else if (var182 == -1) {
                    var183.field3657 = 0;
                    arg0.field1382 = null;
                    return true;
                } else {
                    class202 var184 = class202.method2286(var182);
                    var183.field3657 = 4;
                    var183.field3683 = var182;
                    var183.field3622 = var184.field2225;
                    var183.field3566 = var184.field2226;
                    var183.field3619 = var184.field2224 * 100 / var181;
                    method3056(var183);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3270 == arg0.field1382) {
                field746 = true;
                field732 = false;
                field674 = true;
                Statics.field1903 = var3.method8248();
                Statics.field1500 = var3.method8248();
                int var186 = var3.method8250();
                int var187 = var3.method8248() * 128 + 64;
                int var188 = var3.method8248() * 128 + 64;
                int var189 = var3.method8250();
                field749 = var3.method8296();
                int var190 = var3.method8248();
                int var191 = Statics.field1903 * 128 + 64;
                int var192 = Statics.field1500 * 128 + 64;
                boolean var193 = false;
                boolean var194 = false;
                int var195;
                int var196;
                if (field749) {
                    var195 = Statics.field1867;
                    var196 = method3072(var191, var192, Statics.field231) - var186;
                } else {
                    var195 = method3072(Statics.field257, Statics.field3391, Statics.field231) - Statics.field1867;
                    var196 = var186;
                }
                field668 = new class453(Statics.field257, Statics.field3391, var195, var191, var192, var196, var187, var188, var189, var190);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3301 == arg0.field1382) {
                if (field656 != -1) {
                    method2952(field656, 0);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3293 == arg0.field1382 && field746) {
                field732 = true;
                field748 = false;
                field674 = false;
                for (int var197 = 0; var197 < 5; var197++) {
                    field754[var197] = false;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3243 == arg0.field1382) {
                field735 = var3.method8248();
                if (field735 == 255) {
                    field735 = 0;
                }
                field487 = var3.method8248();
                if (field487 == 255) {
                    field487 = 0;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3294 == arg0.field1382) {
                field746 = true;
                field732 = false;
                field748 = true;
                int var198 = var3.method8445();
                int var199 = var3.method8445();
                int var200 = Statics.method283(Statics.field2975 + var199 & 0x7EB);
                int var201 = Statics.field1531 + var198;
                int var202 = var3.method8250();
                int var203 = var3.method8248();
                field738 = new class455(Statics.field2975, var200, var202, var203);
                field751 = new class455(Statics.field1531, var201, var202, var203);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3229 == arg0.field1382) {
                Statics.field1340 = new class430(Statics.field882);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3278 == arg0.field1382) {
                byte[] var204 = new byte[arg0.field1388];
                var3.method8195(var204, 0, var204.length);
                class489 var205 = new class489(var204);
                String var206 = var205.method8259();
                class32.method7266(var206, true, false);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3253 == arg0.field1382) {
                field746 = true;
                field732 = false;
                field674 = false;
                Statics.field1903 = var3.method8248();
                Statics.field1500 = var3.method8248();
                Statics.field91 = var3.method8250();
                Statics.field138 = var3.method8248();
                Statics.field1638 = var3.method8248();
                if (Statics.field1638 >= 100) {
                    Statics.field257 = Statics.field1903 * 128 + 64;
                    Statics.field3391 = Statics.field1500 * 128 + 64;
                    Statics.field1867 = method3072(Statics.field257, Statics.field3391, Statics.field231) - Statics.field91;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3286 == arg0.field1382) {
                method716();
                byte var207 = var3.method8249();
                class143 var208 = new class143(var3);
                class151 var209;
                if (var207 >= 0) {
                    var209 = field750[var207];
                } else {
                    var209 = Statics.field2269;
                }
                var208.method3037(var209);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3241 == arg0.field1382) {
                int var210 = var3.method8250();
                int var211 = var3.method8248();
                int var212 = var3.method8250();
                method2974(var210, var211, var212);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3259 == arg0.field1382) {
                int var213 = var3.method8254();
                if (field577 != var213) {
                    field577 = var213;
                    method3305();
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3234 == arg0.field1382) {
                method5136();
                field625 = var3.method8250();
                field566 = field680;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3274 == arg0.field1382) {
                int var214 = var3.method8304();
                int var215 = var3.method8291();
                class317 var216 = class317.method3201(var214);
                if (var216 != null && var216.field3598 == 0) {
                    if (var215 > var216.field3594 - var216.field3586) {
                        var215 = var216.field3594 - var216.field3586;
                    }
                    if (var215 < 0) {
                        var215 = 0;
                    }
                    if (var216.field3592 != var215) {
                        var216.field3592 = var215;
                        method3056(var216);
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3275 == arg0.field1382) {
                String var217 = var3.method8259();
                int var218 = var3.method8304();
                class317 var219 = class317.method3201(var218);
                if (!var217.equals(var219.field3716)) {
                    var219.field3716 = var217;
                    method3056(var219);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3312 == arg0.field1382) {
                method716();
                byte var220 = var3.method8249();
                if (arg0.field1388 == 1) {
                    if (var220 >= 0) {
                        field750[var220] = null;
                    } else {
                        Statics.field2269 = null;
                    }
                    arg0.field1382 = null;
                    return true;
                }
                if (var220 >= 0) {
                    field750[var220] = new class151(var3);
                } else {
                    Statics.field2269 = new class151(var3);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3335 == arg0.field1382) {
                int var221 = var3.method8248();
                int var222 = var3.method8250();
                class96 var223 = field546[var222];
                int var224 = var3.method8250();
                int var225 = var3.method8254();
                if (var223 != null) {
                    var223.method2255(var221, var224, var225 >> 16, var225 & 0xFFFF);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3264 == arg0.field1382) {
                for (int var226 = 0; var226 < class307.field3482.length; var226++) {
                    if (class307.field3482[var226] != class307.field3481[var226]) {
                        class307.field3482[var226] = class307.field3481[var226];
                        method50(var226);
                        field740[++field514 - 1 & 0x1F] = var226;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3296 == arg0.field1382) {
                int var227 = var3.method8254();
                int var228 = var3.method8250();
                if (var227 < -70000) {
                    var228 += 32768;
                }
                class317 var229;
                if (var227 >= 0) {
                    var229 = class317.method3201(var227);
                } else {
                    var229 = null;
                }
                while (var3.field4989 < arg0.field1388) {
                    int var230 = var3.method8417();
                    int var231 = var3.method8250();
                    int var232 = 0;
                    if (var231 != 0) {
                        var232 = var3.method8248();
                        if (var232 == 255) {
                            var232 = var3.method8254();
                        }
                    }
                    if (var229 != null && var230 >= 0 && var230 < var229.field3613.length) {
                        var229.field3613[var230] = var231;
                        var229.field3702[var230] = var232;
                    }
                    class81.method6567(var228, var230, var231 - 1, var232);
                }
                if (var229 != null) {
                    method3056(var229);
                }
                method5136();
                field720[++field684 - 1 & 0x1F] = var228 & 0x7FFF;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3221 == arg0.field1382) {
                method472();
                arg0.field1382 = null;
                return false;
            }
            if (class290.field3281 == arg0.field1382) {
                return this.method1175(arg0, 1);
            }
            if (class290.field3328 == arg0.field1382) {
                field746 = true;
                field732 = false;
                field748 = true;
                int var233 = method7525(var3.method8445() & 0x7EB);
                int var234 = Statics.method283(var3.method8445() & 0x7EB);
                int var235 = var3.method8250();
                int var236 = var3.method8248();
                field738 = new class455(Statics.field2975, var234, var235, var236);
                field751 = new class455(Statics.field1531, var233, var235, var236);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3333 == arg0.field1382) {
                method5136();
                field683 = var3.method8445();
                field566 = field680;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3256 == arg0.field1382) {
                method3441(class288.field3205);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3314 == arg0.field1382) {
                Statics.field4883 = var3.method8248();
                Statics.field44 = var3.method8281();
                for (int var237 = Statics.field44; var237 < Statics.field44 + 8; var237++) {
                    for (int var238 = Statics.field4883; var238 < Statics.field4883 + 8; var238++) {
                        if (field624[Statics.field231][var237][var238] != null) {
                            field624[Statics.field231][var237][var238] = null;
                            method2842(var237, var238);
                        }
                    }
                }
                for (class90 var239 = (class90) field574.method6329(); var239 != null; var239 = (class90) field574.method6338()) {
                    if (var239.field1121 >= Statics.field44 && var239.field1121 < Statics.field44 + 8 && var239.field1122 >= Statics.field4883 && var239.field1122 < Statics.field4883 + 8 && Statics.field231 == var239.field1131) {
                        var239.field1132 = 0;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3318 == arg0.field1382) {
                int var240 = var3.method8304();
                int var241 = var3.method8304();
                class83 var242 = (class83) field657.method7966((long) var240);
                class83 var243 = (class83) field657.method7966((long) var241);
                if (var243 != null) {
                    method6286(var243, var242 == null || var242.field1037 != var243.field1037);
                }
                if (var242 != null) {
                    var242.method7651();
                    field657.method7967(var242, (long) var241);
                }
                class317 var244 = class317.method3201(var240);
                if (var244 != null) {
                    method3056(var244);
                }
                class317 var245 = class317.method3201(var241);
                if (var245 != null) {
                    method3056(var245);
                    method4620(Statics.field2057[var245.field3570 >>> 16], var245, true);
                }
                if (field656 != -1) {
                    method2952(field656, 1);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3316 == arg0.field1382) {
                class64 var246 = new class64();
                var246.field799 = var3.method8259();
                var246.field802 = var3.method8250();
                int var247 = var3.method8254();
                var246.field797 = var247;
                method3032(45);
                var2.method7287();
                Object var248 = null;
                class72.method3786(var246);
                arg0.field1382 = null;
                return false;
            }
            if (class290.field3279 == arg0.field1382) {
                Statics.method3070(true, var3);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3224 == arg0.field1382) {
                method3441(class288.field3197);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3299 == arg0.field1382) {
                int var249 = var3.method8254();
                class317 var250 = class317.method3201(var249);
                for (int var251 = 0; var251 < var250.field3613.length; var251++) {
                    var250.field3613[var251] = -1;
                    var250.field3613[var251] = 0;
                }
                method3056(var250);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3321 == arg0.field1382) {
                field746 = true;
                field732 = false;
                field748 = false;
                Statics.field4885 = var3.method8248();
                Statics.field1872 = var3.method8248();
                Statics.field470 = var3.method8250();
                Statics.field4214 = var3.method8248();
                Statics.field1938 = var3.method8248();
                if (Statics.field1938 >= 100) {
                    int var252 = Statics.field4885 * 128 + 64;
                    int var253 = Statics.field1872 * 128 + 64;
                    int var254 = method3072(var252, var253, Statics.field231) - Statics.field470;
                    int var255 = var252 - Statics.field257;
                    int var256 = var254 - Statics.field1867;
                    int var257 = var253 - Statics.field3391;
                    int var258 = (int) Math.sqrt((double) (var255 * var255 + var257 * var257));
                    Statics.field2975 = (int) (Math.atan2((double) var256, (double) var258) * 325.9490051269531D) & 0x7FF;
                    Statics.field1531 = (int) (Math.atan2((double) var255, (double) var257) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field2975 < 128) {
                        Statics.field2975 = 128;
                    }
                    if (Statics.field2975 > 383) {
                        Statics.field2975 = 383;
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3225 == arg0.field1382) {
                Statics.method1095(var3.method8259());
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3336 == arg0.field1382) {
                int var259 = var3.method8248();
                int var260 = var3.method8250();
                class88 var261;
                if (field664 == var260) {
                    var261 = Statics.field3454;
                } else {
                    var261 = field611[var260];
                }
                int var262 = var3.method8250();
                int var263 = var3.method8254();
                if (var261 != null) {
                    var261.method2255(var259, var262, var263 >> 16, var263 & 0xFFFF);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3254 == arg0.field1382) {
                method3441(class288.field3201);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3232 == arg0.field1382) {
                method5136();
                int var264 = var3.method8231();
                int var265 = var3.method8231();
                int var266 = var3.method8302();
                field630[var264] = var266;
                field743[var264] = var265;
                field629[var264] = 1;
                for (int var267 = 0; var267 < 98; var267++) {
                    if (var266 >= class327.field3773[var267]) {
                        field629[var264] = var267 + 2;
                    }
                }
                field685[++field686 - 1 & 0x1F] = var264;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3260 == arg0.field1382) {
                method2951(true, arg0.field1386);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3263 == arg0.field1382) {
                int var268 = var3.method8291();
                int var269 = var3.method8290();
                int var270 = var3.method8303();
                int var271 = var3.method8250();
                class317 var272 = class317.method3201(var270);
                if (var272.field3622 != var269 || var272.field3566 != var268 || var272.field3619 != var271) {
                    var272.field3622 = var269;
                    var272.field3566 = var268;
                    var272.field3619 = var271;
                    method3056(var272);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3284 == arg0.field1382) {
                int var273 = var3.method8248();
                int var274 = var273 >> 2;
                int var275 = var273 & 0x3;
                int var276 = field564[var274];
                int var277 = var3.method8276();
                int var278 = var277 >> 16;
                int var279 = var277 >> 8 & 0xFF;
                int var280 = (var277 >> 4 & 0x7) + var278;
                int var281 = (var277 & 0x7) + var279;
                int var282 = var3.method8327();
                if (var280 >= 0 && var281 >= 0 && var280 < 103 && var281 < 103) {
                    if (var276 == 0) {
                        class240 var283 = Statics.field180.method4192(Statics.field231, var280, var281);
                        if (var283 != null) {
                            int var284 = class233.method2144(var283.field2816);
                            if (var274 == 2) {
                                var283.field2813 = new class76(var284, 2, var275 + 4, Statics.field231, var280, var281, var282, false, var283.field2813);
                                var283.field2817 = new class76(var284, 2, var275 + 1 & 0x3, Statics.field231, var280, var281, var282, false, var283.field2817);
                            } else {
                                var283.field2813 = new class76(var284, var274, var275, Statics.field231, var280, var281, var282, false, var283.field2813);
                            }
                        }
                    } else if (var276 == 1) {
                        class242 var285 = Statics.field180.method4193(Statics.field231, var280, var281);
                        if (var285 != null) {
                            int var286 = class233.method2144(var285.field2822);
                            if (var274 == 4 || var274 == 5) {
                                var285.field2828 = new class76(var286, 4, var275, Statics.field231, var280, var281, var282, false, var285.field2828);
                            } else if (var274 == 6) {
                                var285.field2828 = new class76(var286, 4, var275 + 4, Statics.field231, var280, var281, var282, false, var285.field2828);
                            } else if (var274 == 7) {
                                var285.field2828 = new class76(var286, 4, (var275 + 2 & 0x3) + 4, Statics.field231, var280, var281, var282, false, var285.field2828);
                            } else if (var274 == 8) {
                                var285.field2828 = new class76(var286, 4, var275 + 4, Statics.field231, var280, var281, var282, false, var285.field2828);
                                var285.field2826 = new class76(var286, 4, (var275 + 2 & 0x3) + 4, Statics.field231, var280, var281, var282, false, var285.field2826);
                            }
                        }
                    } else if (var276 == 2) {
                        class243 var287 = Statics.field180.method4248(Statics.field231, var280, var281);
                        if (var274 == 11) {
                            var274 = 10;
                        }
                        if (var287 != null) {
                            var287.field2838 = new class76(class233.method2144(var287.field2846), var274, var275, Statics.field231, var280, var281, var282, false, var287.field2838);
                        }
                    } else if (var276 == 3) {
                        class215 var288 = Statics.field180.method4195(Statics.field231, var280, var281);
                        if (var288 != null) {
                            var288.field2460 = new class76(class233.method2144(var288.field2461), 22, var275, Statics.field231, var280, var281, var282, false, var288.field2460);
                        }
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3252 == arg0.field1382) {
                method3441(class288.field3202);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3282 == arg0.field1382) {
                int var289 = var3.method8248();
                method4638(var289);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3277 == arg0.field1382) {
                boolean var290 = var3.method8248() == 1;
                if (var290) {
                    Statics.field3741 = class294.method2504() - var3.method8271();
                    Statics.field4389 = new class346(var3, true);
                } else {
                    Statics.field4389 = null;
                }
                field769 = field680;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3327 == arg0.field1382) {
                field746 = true;
                field732 = false;
                field748 = true;
                Statics.field4885 = var3.method8248();
                Statics.field1872 = var3.method8248();
                Statics.field470 = var3.method8250();
                int var291 = var3.method8250();
                int var292 = var3.method8248();
                int var293 = Statics.field4885 * 128 + 64;
                int var294 = Statics.field1872 * 128 + 64;
                int var295 = method3072(var293, var294, Statics.field231) - Statics.field470;
                int var296 = var293 - Statics.field257;
                int var297 = var295 - Statics.field1867;
                int var298 = var294 - Statics.field3391;
                double var299 = Math.sqrt((double) (var296 * var296 + var298 * var298));
                int var301 = Statics.method283((int) (Math.atan2((double) var297, var299) * 325.9490051269531D) & 0x7FF);
                int var302 = method7525((int) (Math.atan2((double) var296, (double) var298) * -325.9490051269531D) & 0x7FF);
                field738 = new class455(Statics.field2975, var301, var291, var292);
                field751 = new class455(Statics.field1531, var302, var291, var292);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3226 == arg0.field1382) {
                Statics.field2100 = class508.method7082(var3.method8248());
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3292 == arg0.field1382) {
                Statics.field804.field812.method7086(var3, arg0.field1388);
                method2005();
                field690 = field680;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3255 == arg0.field1382) {
                Statics.method3070(false, var3);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3245 == arg0.field1382) {
                if (Statics.field1340 == null) {
                    Statics.field1340 = new class430(Statics.field882);
                }
                class498 var303 = Statics.field882.method7564(var3);
                Statics.field1340.field4698.method7984(var303.field5059, var303.field5058);
                field687[++field688 - 1 & 0x1F] = var303.field5059;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3303 == arg0.field1382) {
                byte var304 = var3.method8424();
                int var305 = var3.method8250();
                class307.field3481[var305] = var304;
                if (class307.field3482[var305] != var304) {
                    class307.field3482[var305] = var304;
                }
                method50(var305);
                field740[++field514 - 1 & 0x1F] = var305;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3233 == arg0.field1382) {
                int var306 = var3.method8290();
                class81.method7180(var306);
                field720[++field684 - 1 & 0x1F] = var306 & 0x7FFF;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3251 == arg0.field1382) {
                int var307 = var3.method8291();
                int var308 = var3.method8302();
                class317 var309 = class317.method3201(var308);
                if (var309.field3657 != 6 || var309.field3683 != var307) {
                    var309.field3657 = 6;
                    var309.field3683 = var307;
                    method3056(var309);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3246 == arg0.field1382) {
                String var310 = var3.method8259();
                long var311 = (long) var3.method8250();
                long var313 = (long) var3.method8252();
                class339 var315 = (class339) Statics.method3600(class339.method5985(), var3.method8248());
                long var316 = (var311 << 32) + var313;
                boolean var318 = false;
                for (int var319 = 0; var319 < 100; var319++) {
                    if (field786[var319] == var316) {
                        var318 = true;
                        break;
                    }
                }
                if (Statics.field804.method1741(new class513(var310, Statics.field889))) {
                    var318 = true;
                }
                if (!var318 && field609 == 0) {
                    field786[field721] = var316;
                    field721 = (field721 + 1) % 100;
                    String var320 = class383.method6854(class372.method2812(class320.method4550(var3)));
                    byte var321;
                    if (var315.field4186) {
                        var321 = 7;
                    } else {
                        var321 = 3;
                    }
                    if (var315.field4185 == -1) {
                        class106.method2767(var321, var310, var320);
                    } else {
                        class106.method2767(var321, class97.method6000(var315.field4185) + var310, var320);
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3266 == arg0.field1382) {
                int var322 = var3.method8291();
                int var323 = var3.method8303();
                class317 var324 = class317.method3201(var323);
                if (var324.field3657 != 2 || var324.field3683 != var322) {
                    var324.field3657 = 2;
                    var324.field3683 = var322;
                    method3056(var324);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3297 == arg0.field1382) {
                field693 = field680;
                byte var325 = var3.method8249();
                if (arg0.field1388 == 1) {
                    if (var325 >= 0) {
                        field679[var325] = null;
                    } else {
                        Statics.field253 = null;
                    }
                    arg0.field1382 = null;
                    return true;
                }
                if (var325 >= 0) {
                    field679[var325] = new class160(var3);
                } else {
                    Statics.field253 = new class160(var3);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3310 == arg0.field1382) {
                for (int var326 = 0; var326 < Statics.field1909; var326++) {
                    class182 var327 = class182.method7368(var326);
                    if (var327 != null) {
                        class307.field3481[var326] = 0;
                        class307.field3482[var326] = 0;
                    }
                }
                method5136();
                field514 += 32;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3306 == arg0.field1382) {
                int var328 = var3.method8254();
                class83 var329 = (class83) field657.method7966((long) var328);
                if (var329 != null) {
                    method6286(var329, true);
                }
                if (field661 != null) {
                    method3056(field661);
                    field661 = null;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3228 == arg0.field1382) {
                int var330 = var3.method8231();
                String var331 = var3.method8259();
                int var332 = var3.method8231();
                if (var330 >= 1 && var330 <= 8) {
                    if (var331.equalsIgnoreCase(class337.field3889)) {
                        var331 = null;
                    }
                    field736[var330 - 1] = var331;
                    field588[var330 - 1] = var332 == 0;
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3218 == arg0.field1382) {
                String var333 = var3.method8259();
                String var334 = class383.method6854(class372.method2812(class320.method4550(var3)));
                class106.method2767(6, var333, var334);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3236 == arg0.field1382) {
                String var335 = var3.method8259();
                long var336 = var3.method8271();
                long var338 = (long) var3.method8250();
                long var340 = (long) var3.method8252();
                class339 var342 = (class339) Statics.method3600(class339.method5985(), var3.method8248());
                long var343 = (var338 << 32) + var340;
                boolean var345 = false;
                for (int var346 = 0; var346 < 100; var346++) {
                    if (field786[var346] == var343) {
                        var345 = true;
                        break;
                    }
                }
                if (var342.field4170 && Statics.field804.method1741(new class513(var335, Statics.field889))) {
                    var345 = true;
                }
                if (!var345 && field609 == 0) {
                    field786[field721] = var343;
                    field721 = (field721 + 1) % 100;
                    String var347 = class383.method6854(class372.method2812(class320.method4550(var3)));
                    if (var342.field4185 == -1) {
                        class106.method3024(9, var335, var347, class374.method3533(var336));
                    } else {
                        class106.method3024(9, class97.method6000(var342.field4185) + var335, var347, class374.method3533(var336));
                    }
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3324 == arg0.field1382) {
                int var348 = var3.method8248();
                int var349 = var3.method8291();
                int var350 = var3.method8276();
                int var351 = var350 >> 16;
                int var352 = var350 >> 8 & 0xFF;
                int var353 = (var350 >> 4 & 0x7) + var351;
                int var354 = (var350 & 0x7) + var352;
                int var355 = var3.method8250();
                if (var353 >= 0 && var354 >= 0 && var353 < 104 && var354 < 104) {
                    int var356 = var353 * 128 + 64;
                    int var357 = var354 * 128 + 64;
                    class68 var358 = new class68(var355, Statics.field231, var356, var357, method3072(var356, var357, Statics.field231) - var348, var349, field602);
                    field627.method6324(var358);
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3302 == arg0.field1382) {
                field717 = var3.method8231();
                field578 = var3.method8248();
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3290 == arg0.field1382) {
                field545 = var3.method8327() * 30;
                field566 = field680;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3237 == arg0.field1382) {
                field508 = var3.method8248();
                if (field508 == 1) {
                    field509 = var3.method8250();
                }
                if (field508 >= 2 && field508 <= 6) {
                    if (field508 == 2) {
                        field766 = 64;
                        field705 = 64;
                    }
                    if (field508 == 3) {
                        field766 = 0;
                        field705 = 64;
                    }
                    if (field508 == 4) {
                        field766 = 128;
                        field705 = 64;
                    }
                    if (field508 == 5) {
                        field766 = 64;
                        field705 = 0;
                    }
                    if (field508 == 6) {
                        field766 = 64;
                        field705 = 128;
                    }
                    field508 = 2;
                    field654 = var3.method8250();
                    field512 = var3.method8250();
                    field547 = var3.method8248();
                }
                if (field508 == 10) {
                    field510 = var3.method8250();
                }
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3249 == arg0.field1382) {
                int var359 = var3.method8282();
                int var360 = var3.method8327();
                int var361 = var3.method8303();
                class83 var362 = (class83) field657.method7966((long) var361);
                if (var362 != null) {
                    method6286(var362, var362.field1037 != var360);
                }
                method2526(var361, var360, var359);
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3250 == arg0.field1382) {
                int var363 = var3.method8254();
                int var364 = var3.method8250();
                if (var363 < -70000) {
                    var364 += 32768;
                }
                class317 var365;
                if (var363 >= 0) {
                    var365 = class317.method3201(var363);
                } else {
                    var365 = null;
                }
                if (var365 != null) {
                    for (int var366 = 0; var366 < var365.field3613.length; var366++) {
                        var365.field3613[var366] = 0;
                        var365.field3702[var366] = 0;
                    }
                }
                class81.method4768(var364);
                int var367 = var3.method8250();
                for (int var368 = 0; var368 < var367; var368++) {
                    int var369 = var3.method8327();
                    int var370 = var3.method8231();
                    if (var370 == 255) {
                        var370 = var3.method8303();
                    }
                    if (var365 != null && var368 < var365.field3613.length) {
                        var365.field3613[var368] = var369;
                        var365.field3702[var368] = var370;
                    }
                    class81.method6567(var364, var368, var369 - 1, var370);
                }
                if (var365 != null) {
                    method3056(var365);
                }
                method5136();
                field720[++field684 - 1 & 0x1F] = var364 & 0x7FFF;
                arg0.field1382 = null;
                return true;
            }
            if (class290.field3313 == arg0.field1382) {
                method3441(class288.field3198);
                arg0.field1382 = null;
                return true;
            }
            class516.method6950("" + (arg0.field1382 == null ? -1 : arg0.field1382.field3300) + class97.field1295 + (arg0.field1393 == null ? -1 : arg0.field1393.field3300) + class97.field1295 + (arg0.field1387 == null ? -1 : arg0.field1387.field3300) + class97.field1295 + arg0.field1388, (Throwable) null);
            method472();
        } catch (IOException var375) {
            method6209();
        } catch (Exception var376) {
            String var373 = "" + (arg0.field1382 == null ? -1 : arg0.field1382.field3300) + class97.field1295 + (arg0.field1393 == null ? -1 : arg0.field1393.field3300) + class97.field1295 + (arg0.field1387 == null ? -1 : arg0.field1387.field3300) + class97.field1295 + arg0.field1388 + class97.field1295 + (Statics.field2850 + Statics.field3454.field1174[0]) + class97.field1295 + (Statics.field2841 + Statics.field3454.field1176[0]) + class97.field1295;
            for (int var374 = 0; var374 < arg0.field1388 && var374 < 50; var374++) {
                var373 = var373 + var3.field4991[var374] + class97.field1295;
            }
            class516.method6950(var373, var376);
            method472();
        }
        return true;
    }

    @ObfuscatedName("hx.jb(Llm;I)V")
    public static final void method3441(class288 arg0) {
        class488 var1 = field753.field1386;
        if (class288.field3201 == arg0) {
            int var2 = var1.method8248();
            int var3 = var1.method8248();
            int var4 = (var3 >> 4 & 0x7) + Statics.field44;
            int var5 = (var3 & 0x7) + Statics.field4883;
            int var6 = var1.method8231() * 4;
            int var7 = var1.method8290();
            int var8 = var1.method8231();
            int var9 = var1.method8250();
            byte var10 = var1.method8424();
            int var11 = var1.method8282() * 4;
            int var12 = var1.method8250();
            int var13 = var1.method8309();
            byte var14 = var1.method8284();
            int var15 = var4 + var14;
            int var16 = var5 + var10;
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var7 != 65535) {
                int var17 = var4 * 128 + 64;
                int var18 = var5 * 128 + 64;
                int var19 = var15 * 128 + 64;
                int var20 = var16 * 128 + 64;
                class73 var21 = new class73(var7, Statics.field231, var17, var18, method3072(var17, var18, Statics.field231) - var11, field602 + var9, field602 + var12, var2, var8, var13, var6);
                var21.method2010(var19, var20, method3072(var19, var20, Statics.field231) - var6, field602 + var9);
                field551.method6324(var21);
            }
            return;
        }
        if (class288.field3198 == arg0) {
            int var22 = var1.method8250();
            byte var23 = var1.method8284();
            byte var24 = var1.method8378();
            int var25 = var1.method8281();
            int var26 = (var25 >> 4 & 0x7) + Statics.field44;
            int var27 = (var25 & 0x7) + Statics.field4883;
            byte var28 = var1.method8249();
            int var29 = var1.method8250();
            byte var30 = var1.method8378();
            int var31 = var1.method8248();
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = field564[var32];
            int var35 = var1.method8290();
            int var36 = var1.method8291();
            class88 var37;
            if (field664 == var22) {
                var37 = Statics.field3454;
            } else {
                var37 = field611[var22];
            }
            if (var37 != null) {
                class201 var38 = Statics.method3057(var36);
                int var39;
                int var40;
                if (var33 == 1 || var33 == 3) {
                    var39 = var38.field2173;
                    var40 = var38.field2172;
                } else {
                    var39 = var38.field2172;
                    var40 = var38.field2173;
                }
                int var41 = (var39 >> 1) + var26;
                int var42 = (var39 + 1 >> 1) + var26;
                int var43 = (var40 >> 1) + var27;
                int var44 = (var40 + 1 >> 1) + var27;
                int[][] var45 = class78.field1002[Statics.field231];
                int var46 = var45[var41][var43] + var45[var42][var43] + var45[var41][var44] + var45[var42][var44] >> 2;
                int var47 = (var26 << 7) + (var39 << 6);
                int var48 = (var27 << 7) + (var40 << 6);
                class232 var49 = var38.method3670(var32, var33, var45, var47, var46, var48);
                if (var49 != null) {
                    method501(Statics.field231, var26, var27, var34, -1, 0, 0, 31, var29 + 1, var35 + 1);
                    var37.field1093 = field602 + var29;
                    var37.field1094 = field602 + var35;
                    var37.field1098 = var49;
                    var37.field1095 = var26 * 128 + var39 * 64;
                    var37.field1099 = var27 * 128 + var40 * 64;
                    var37.field1086 = var46;
                    if (var28 > var30) {
                        byte var50 = var28;
                        var28 = var30;
                        var30 = var50;
                    }
                    if (var23 > var24) {
                        byte var51 = var23;
                        var23 = var24;
                        var24 = var51;
                    }
                    var37.field1100 = var26 + var28;
                    var37.field1091 = var26 + var30;
                    var37.field1087 = var23 + var27;
                    var37.field1101 = var24 + var27;
                }
            }
        }
        if (class288.field3197 == arg0) {
            int var52 = var1.method8231();
            int var53 = (var52 >> 4 & 0x7) + Statics.field44;
            int var54 = (var52 & 0x7) + Statics.field4883;
            int var55 = var1.method8254();
            int var56 = var1.method8291();
            int var57 = var1.method8254();
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                class363 var58 = field624[Statics.field231][var53][var54];
                if (var58 != null) {
                    for (class100 var59 = (class100) var58.method6329(); var59 != null; var59 = (class100) var58.method6338()) {
                        if ((var56 & 0x7FFF) == var59.field1317 && var59.field1313 == var57) {
                            var59.field1313 = var55;
                            break;
                        }
                    }
                    method2842(var53, var54);
                }
            }
        } else if (class288.field3206 == arg0) {
            var1.method8281();
            int var60 = var1.method8302();
            int var61 = var1.method8281();
            int var62 = var1.method8248();
            int var63 = (var62 >> 4 & 0x7) + Statics.field44;
            int var64 = (var62 & 0x7) + Statics.field4883;
            int var65 = var1.method8290();
            var1.method8327();
            var1.method8290();
            var1.method8282();
            if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                class100 var66 = new class100();
                var66.field1317 = var65;
                var66.field1313 = var60;
                var66.method2529(var61);
                if (field624[Statics.field231][var63][var64] == null) {
                    field624[Statics.field231][var63][var64] = new class363();
                }
                field624[Statics.field231][var63][var64].method6324(var66);
                method2842(var63, var64);
            }
        } else if (class288.field3203 == arg0) {
            int var67 = var1.method8248();
            int var68 = var1.method8231();
            int var69 = (var68 >> 4 & 0x7) + Statics.field44;
            int var70 = (var68 & 0x7) + Statics.field4883;
            int var71 = var1.method8282();
            int var72 = var71 >> 2;
            int var73 = var71 & 0x3;
            int var74 = field564[var72];
            int var75 = var1.method8327();
            if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                method501(Statics.field231, var69, var70, var74, var75, var72, var73, var67, 0, -1);
            }
        } else if (class288.field3205 == arg0) {
            int var76 = var1.method8282();
            int var77 = (var76 >> 4 & 0x7) + Statics.field44;
            int var78 = (var76 & 0x7) + Statics.field4883;
            int var79 = var1.method8327();
            int var80 = var1.method8303();
            if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                class363 var81 = field624[Statics.field231][var77][var78];
                if (var81 != null) {
                    for (class100 var82 = (class100) var81.method6329(); var82 != null; var82 = (class100) var81.method6338()) {
                        if ((var79 & 0x7FFF) == var82.field1317 && var82.field1313 == var80) {
                            var82.method7651();
                            break;
                        }
                    }
                    if (var81.method6329() == null) {
                        field624[Statics.field231][var77][var78] = null;
                    }
                    method2842(var77, var78);
                }
            }
        } else {
            if (class288.field3209 == arg0) {
                int var83 = var1.method8291();
                int var84 = var1.method8282();
                int var85 = var84 >> 4 & 0xF;
                int var86 = var84 & 0x7;
                int var87 = var1.method8281();
                int var88 = (var87 >> 4 & 0x7) + Statics.field44;
                int var89 = (var87 & 0x7) + Statics.field4883;
                int var90 = var1.method8231();
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                    int var91 = var85 + 1;
                    if (Statics.field3454.field1174[0] >= var88 - var91 && Statics.field3454.field1174[0] <= var88 + var91 && Statics.field3454.field1176[0] >= var89 - var91 && Statics.field3454.field1176[0] <= var89 + var91 && Statics.field112.method2343() != 0 && var86 > 0 && field507 < 50) {
                        field741[field507] = var83;
                        field603[field507] = var86;
                        field556[field507] = var90;
                        field745[field507] = null;
                        field744[field507] = (var88 << 16) + (var89 << 8) + var85;
                        field507++;
                    }
                }
            }
            if (class288.field3204 == arg0) {
                int var92 = var1.method8291();
                int var93 = var1.method8282();
                int var94 = (var93 >> 4 & 0x7) + Statics.field44;
                int var95 = (var93 & 0x7) + Statics.field4883;
                int var96 = var1.method8281();
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    class363 var97 = field624[Statics.field231][var94][var95];
                    if (var97 != null) {
                        for (class100 var98 = (class100) var97.method6329(); var98 != null; var98 = (class100) var97.method6338()) {
                            if ((var92 & 0x7FFF) == var98.field1317) {
                                var98.method2529(var96);
                                break;
                            }
                        }
                    }
                }
            } else if (class288.field3200 == arg0) {
                int var99 = var1.method8248();
                int var100 = (var99 >> 4 & 0x7) + Statics.field44;
                int var101 = (var99 & 0x7) + Statics.field4883;
                int var102 = var1.method8327();
                int var103 = var1.method8282();
                int var104 = var103 >> 2;
                int var105 = var103 & 0x3;
                int var106 = field564[var104];
                if (var100 >= 0 && var101 >= 0 && var100 < 103 && var101 < 103) {
                    if (var106 == 0) {
                        class240 var107 = Statics.field180.method4192(Statics.field231, var100, var101);
                        if (var107 != null) {
                            int var108 = class233.method2144(var107.field2816);
                            if (var104 == 2) {
                                var107.field2813 = new class76(var108, 2, var105 + 4, Statics.field231, var100, var101, var102, false, var107.field2813);
                                var107.field2817 = new class76(var108, 2, var105 + 1 & 0x3, Statics.field231, var100, var101, var102, false, var107.field2817);
                            } else {
                                var107.field2813 = new class76(var108, var104, var105, Statics.field231, var100, var101, var102, false, var107.field2813);
                            }
                            return;
                        }
                    }
                    if (var106 == 1) {
                        class242 var109 = Statics.field180.method4193(Statics.field231, var100, var101);
                        if (var109 != null) {
                            int var110 = class233.method2144(var109.field2822);
                            if (var104 == 4 || var104 == 5) {
                                var109.field2828 = new class76(var110, 4, var105, Statics.field231, var100, var101, var102, false, var109.field2828);
                            } else if (var104 == 6) {
                                var109.field2828 = new class76(var110, 4, var105 + 4, Statics.field231, var100, var101, var102, false, var109.field2828);
                            } else if (var104 == 7) {
                                var109.field2828 = new class76(var110, 4, (var105 + 2 & 0x3) + 4, Statics.field231, var100, var101, var102, false, var109.field2828);
                            } else if (var104 == 8) {
                                var109.field2828 = new class76(var110, 4, var105 + 4, Statics.field231, var100, var101, var102, false, var109.field2828);
                                var109.field2826 = new class76(var110, 4, (var105 + 2 & 0x3) + 4, Statics.field231, var100, var101, var102, false, var109.field2826);
                            }
                            return;
                        }
                    }
                    if (var106 == 2) {
                        class243 var111 = Statics.field180.method4248(Statics.field231, var100, var101);
                        if (var104 == 11) {
                            var104 = 10;
                        }
                        if (var111 != null) {
                            var111.field2838 = new class76(class233.method2144(var111.field2846), var104, var105, Statics.field231, var100, var101, var102, false, var111.field2838);
                            return;
                        }
                    }
                    if (var106 == 3) {
                        class215 var112 = Statics.field180.method4195(Statics.field231, var100, var101);
                        if (var112 != null) {
                            var112.field2460 = new class76(class233.method2144(var112.field2461), 22, var105, Statics.field231, var100, var101, var102, false, var112.field2460);
                            return;
                        }
                    }
                    method3426(Statics.field231, var100, var101, var106, var102);
                }
            } else if (class288.field3207 == arg0) {
                int var113 = var1.method8281();
                int var114 = (var113 >> 4 & 0x7) + Statics.field44;
                int var115 = (var113 & 0x7) + Statics.field4883;
                int var116 = var1.method8248();
                int var117 = var116 >> 2;
                int var118 = var116 & 0x3;
                int var119 = field564[var117];
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    method501(Statics.field231, var114, var115, var119, -1, var117, var118, 31, 0, -1);
                }
            } else if (class288.field3202 == arg0) {
                int var120 = var1.method8282();
                int var121 = var1.method8250();
                int var122 = var1.method8231();
                int var123 = (var122 >> 4 & 0x7) + Statics.field44;
                int var124 = (var122 & 0x7) + Statics.field4883;
                int var125 = var1.method8327();
                if (var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104) {
                    int var126 = var123 * 128 + 64;
                    int var127 = var124 * 128 + 64;
                    class68 var128 = new class68(var125, Statics.field231, var126, var127, method3072(var126, var127, Statics.field231) - var120, var121, field602);
                    field627.method6324(var128);
                }
            }
        }
    }

    @ObfuscatedName("bz.jz(IIIIIIIIIII)V")
    public static final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class90 var10 = null;
        for (class90 var11 = (class90) field574.method6329(); var11 != null; var11 = (class90) field574.method6338()) {
            if (var11.field1131 == arg0 && var11.field1121 == arg1 && var11.field1122 == arg2 && var11.field1120 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class90();
            var10.field1131 = arg0;
            var10.field1120 = arg3;
            var10.field1121 = arg1;
            var10.field1122 = arg2;
            var10.field1136 = -1;
            method2619(var10);
            field574.method6324(var10);
        }
        var10.field1128 = arg4;
        var10.field1125 = arg5;
        var10.field1127 = arg6;
        var10.field1126 = arg8;
        var10.field1132 = arg9;
        var10.method2242(arg7);
    }

    @ObfuscatedName("hu.ju(IIIIIB)Z")
    public static final boolean method3426(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class90 var5 = null;
        for (class90 var6 = (class90) field574.method6329(); var6 != null; var6 = (class90) field574.method6338()) {
            if (var6.field1131 == arg0 && var6.field1121 == arg1 && var6.field1122 == arg2 && var6.field1120 == arg3) {
                var5 = var6;
                break;
            }
        }
        if (var5 == null) {
            return false;
        } else {
            var5.field1136 = arg4;
            return true;
        }
    }

    @ObfuscatedName("ap.jl(B)V")
    public static final void method372() {
        for (class90 var0 = (class90) field574.method6329(); var0 != null; var0 = (class90) field574.method6338()) {
            if (var0.field1132 == -1) {
                var0.field1126 = 0;
                method2619(var0);
            } else {
                var0.method7651();
            }
        }
    }

    @ObfuscatedName("eo.kc(Ldg;I)V")
    public static final void method2619(class90 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1120 == 0) {
            var1 = Statics.field180.method4196(arg0.field1131, arg0.field1121, arg0.field1122);
        }
        if (arg0.field1120 == 1) {
            var1 = Statics.field180.method4197(arg0.field1131, arg0.field1121, arg0.field1122);
        }
        if (arg0.field1120 == 2) {
            var1 = Statics.field180.method4198(arg0.field1131, arg0.field1121, arg0.field1122);
        }
        if (arg0.field1120 == 3) {
            var1 = Statics.field180.method4199(arg0.field1131, arg0.field1121, arg0.field1122);
        }
        if (var1 != 0L) {
            int var6 = Statics.field180.method4334(arg0.field1131, arg0.field1121, arg0.field1122, var1);
            var3 = class233.method2144(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1123 = var3;
        arg0.field1124 = var4;
        arg0.field1129 = var5;
    }

    @ObfuscatedName("do.ku(IIIIIIIII)V")
    public static final void method2142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field493 && Statics.field231 != arg0) {
            return;
        }
        long var8 = 0L;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg1 == 0) {
            var8 = Statics.field180.method4196(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var8 = Statics.field180.method4197(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var8 = Statics.field180.method4198(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var8 = Statics.field180.method4199(arg0, arg2, arg3);
        }
        if (var8 != 0L) {
            int var13 = Statics.field180.method4334(arg0, arg2, arg3, var8);
            int var14 = class233.method2144(var8);
            int var15 = var13 & 0x1F;
            int var16 = var13 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field180.method4270(arg0, arg2, arg3);
                class201 var17 = Statics.method3057(var14);
                if (var17.field2178 != 0) {
                    field561[arg0].method3910(arg2, arg3, var15, var16, var17.field2175);
                }
            }
            if (arg1 == 1) {
                Statics.field180.method4269(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field180.method4189(arg0, arg2, arg3);
                class201 var18 = Statics.method3057(var14);
                if (var18.field2172 + arg2 > 103 || var18.field2172 + arg3 > 103 || var18.field2173 + arg2 > 103 || var18.field2173 + arg3 > 103) {
                    return;
                }
                if (var18.field2178 != 0) {
                    field561[arg0].method3929(arg2, arg3, var18.field2172, var18.field2173, var16, var18.field2175);
                }
            }
            if (arg1 == 3) {
                Statics.field180.method4186(arg0, arg2, arg3);
                class201 var19 = Statics.method3057(var14);
                if (var19.field2178 == 1) {
                    field561[arg0].method3912(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var20 = arg0;
        if (arg0 < 3 && (class78.field1006[1][arg2][arg3] & 0x2) == 2) {
            var20 = arg0 + 1;
        }
        class78.method3202(arg0, var20, arg2, arg3, arg4, arg5, arg6, arg7, Statics.field180, field561[arg0]);
    }

    @ObfuscatedName("em.kd(III)V")
    public static final void method2842(int arg0, int arg1) {
        class363 var2 = field624[Statics.field231][arg0][arg1];
        if (var2 == null) {
            Statics.field180.method4265(Statics.field231, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class100 var5 = null;
        for (class100 var6 = (class100) var2.method6329(); var6 != null; var6 = (class100) var2.method6338()) {
            class202 var7 = class202.method2286(var6.field1317);
            long var8 = (long) var7.field2211;
            if (var7.field2236 == 1) {
                var8 *= var6.field1313 < Integer.MAX_VALUE ? (long) (var6.field1313 + 1) : (long) var6.field1313;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field180.method4265(Statics.field231, arg0, arg1);
            return;
        }
        var2.method6325(var5);
        class100 var10 = null;
        class100 var11 = null;
        for (class100 var12 = (class100) var2.method6329(); var12 != null; var12 = (class100) var2.method6338()) {
            if (var5.field1317 != var12.field1317) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1317 != var12.field1317 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class233.method4346(arg0, arg1, 3, false, 0);
        Statics.field180.method4274(Statics.field231, arg0, arg1, method3072(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field231), var5, var13, var10, var11);
    }

    @ObfuscatedName("bk.kt(Lsq;I)V")
    public static final void method460(class488 arg0) {
        arg0.method8226();
        int var1 = arg0.method8197(8);
        if (var1 < field737) {
            for (int var2 = var1; var2 < field737; var2++) {
                field618[++field617 - 1] = field548[var2];
            }
        }
        if (var1 > field737) {
            throw new RuntimeException("");
        }
        field737 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field548[var3];
            class96 var5 = field546[var4];
            int var6 = arg0.method8197(1);
            if (var6 == 0) {
                field548[++field737 - 1] = var4;
                var5.field1195 = field602;
            } else {
                int var7 = arg0.method8197(2);
                if (var7 == 0) {
                    field548[++field737 - 1] = var4;
                    var5.field1195 = field602;
                    field550[++field549 - 1] = var4;
                } else if (var7 == 1) {
                    field548[++field737 - 1] = var4;
                    var5.field1195 = field602;
                    int var8 = arg0.method8197(3);
                    var5.method2439(var8, class211.field2390);
                    int var9 = arg0.method8197(1);
                    if (var9 == 1) {
                        field550[++field549 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field548[++field737 - 1] = var4;
                    var5.field1195 = field602;
                    if (arg0.method8197(1) == 1) {
                        int var10 = arg0.method8197(3);
                        var5.method2439(var10, class211.field2388);
                        int var11 = arg0.method8197(3);
                        var5.method2439(var11, class211.field2388);
                    } else {
                        int var12 = arg0.method8197(3);
                        var5.method2439(var12, class211.field2389);
                    }
                    int var13 = arg0.method8197(1);
                    if (var13 == 1) {
                        field550[++field549 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field618[++field617 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("iy.ka(ZLsq;I)V")
    public static final void method3954(boolean arg0, class488 arg1) {
        while (true) {
            byte var2 = 16;
            int var3 = 0x1 << var2;
            if (arg1.method8225(field753.field1388) >= var2 + 12) {
                int var4 = arg1.method8197(var2);
                if (var3 - 1 != var4) {
                    boolean var5 = false;
                    if (field546[var4] == null) {
                        field546[var4] = new class96();
                        var5 = true;
                    }
                    class96 var6 = field546[var4];
                    field548[++field737 - 1] = var4;
                    var6.field1195 = field602;
                    int var7;
                    if (arg0) {
                        var7 = arg1.method8197(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method8197(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    boolean var8 = arg1.method8197(1) == 1;
                    if (var8) {
                        arg1.method8197(32);
                    }
                    int var9 = arg1.method8197(1);
                    if (var9 == 1) {
                        field550[++field549 - 1] = var4;
                    }
                    int var10 = arg1.method8197(1);
                    var6.field1277 = class191.method6098(arg1.method8197(14));
                    int var11;
                    if (arg0) {
                        var11 = arg1.method8197(8);
                        if (var11 > 127) {
                            var11 -= 256;
                        }
                    } else {
                        var11 = arg1.method8197(5);
                        if (var11 > 15) {
                            var11 -= 32;
                        }
                    }
                    int var12 = field694[arg1.method8197(3)];
                    if (var5) {
                        var6.field1168 = var6.field1144 = var12;
                    }
                    method3048(var6);
                    if (var6.field1191 == 0) {
                        var6.field1144 = 0;
                    }
                    var6.method2440(Statics.field3454.field1174[0] + var11, Statics.field3454.field1176[0] + var7, var10 == 1);
                    continue;
                }
            }
            arg1.method8198();
            return;
        }
    }

    @ObfuscatedName("fa.kg(Ldf;B)V")
    public static void method3048(class96 arg0) {
        arg0.field1141 = arg0.field1277.field2042;
        arg0.field1191 = arg0.field1277.field2016;
        arg0.field1146 = arg0.field1277.field2020;
        arg0.field1147 = arg0.field1277.field2021;
        arg0.field1148 = arg0.field1277.field2022;
        arg0.field1155 = arg0.field1277.field2023;
        arg0.field1139 = arg0.field1277.field2050;
        arg0.field1137 = arg0.field1277.field2018;
        arg0.field1167 = arg0.field1277.field2019;
        arg0.field1150 = arg0.field1277.field2049;
        arg0.field1151 = arg0.field1277.field2009;
        arg0.field1152 = arg0.field1277.field2026;
        arg0.field1153 = arg0.field1277.field2038;
        arg0.field1154 = arg0.field1277.field2024;
        arg0.field1197 = arg0.field1277.field2029;
        arg0.field1156 = arg0.field1277.field2030;
        arg0.field1158 = arg0.field1277.field2031;
    }

    @ObfuscatedName("cc.kq(Ldv;IILiu;I)V")
    public static final void method1053(class88 arg0, int arg1, int arg2, class211 arg3) {
        int var4 = arg0.field1174[0];
        int var5 = arg0.field1176[0];
        int var6 = arg0.method2200();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method2200();
        field787.field2387 = arg1;
        field787.field2385 = arg2;
        field787.field2383 = 1;
        field787.field2384 = 1;
        class62 var10 = field787;
        int var11 = class212.method3053(var4, var5, var9, var10, field561[arg0.field1106], true, field788, field789);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method2187(field788[var12], field789[var12], arg3);
            }
        }
    }

    @ObfuscatedName("gr.kw(I)V")
    public static void method3149() {
        field633 = 0;
        field669 = false;
        field639[0] = class337.field4095;
        field581[0] = "";
        field636[0] = 1006;
        field641[0] = false;
        field633 = 1;
    }

    @ObfuscatedName("dk.kk(IIB)V")
    public static final void method2165(int arg0, int arg1) {
        if (field633 < 2 && field649 == 0 && !field651 || !field644) {
            return;
        }
        int var2 = method2041();
        String var3;
        if (field649 == 1 && field633 < 2) {
            var3 = class337.field4000 + class337.field4010 + field497 + " " + class97.field1284;
        } else if (field651 && field633 < 2) {
            var3 = field663 + class337.field4010 + field655 + " " + class97.field1284;
        } else {
            var3 = method7141(var2);
        }
        if (field633 > 2) {
            var3 = var3 + class97.method6893(16777215) + " " + '/' + " " + (field633 - 2) + class337.field4004;
        }
        Statics.field1635.method6804(var3, arg0 + 4, arg1 + 15, 16777215, 0, field602 / 1000);
    }

    @ObfuscatedName("oj.kj(I)Z")
    public static final boolean method6945() {
        return field669;
    }

    @ObfuscatedName("ps.ki(IIIII)V")
    public static final void method7107(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field781; var4++) {
            if (field709[var4] + field640[var4] > arg0 && field709[var4] < arg0 + arg2 && field712[var4] + field710[var4] > arg1 && field710[var4] < arg1 + arg3) {
                field707[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ko(B)V")
    public final void method1295() {
        method7527();
        if (field511 != null) {
            return;
        }
        int var1 = class36.field252;
        if (!field669) {
            int var29 = method2041();
            if ((var1 == 1 || !Statics.field4941 && var1 == 4) && this.method1179()) {
                var1 = 2;
            }
            if ((var1 == 1 || !Statics.field4941 && var1 == 4) && field633 > 0 && var29 >= 0) {
                int var30 = field634[var29];
                int var31 = field635[var29];
                int var32 = field636[var29];
                int var33 = field637[var29];
                int var34 = field638[var29];
                String var35 = field639[var29];
                String var36 = field581[var29];
                method242(var30, var31, var32, var33, var34, var35, var36, class36.field250, class36.field251);
            }
            if (var1 == 2 && field633 > 0) {
                this.method1449(class36.field250, class36.field251);
            }
            return;
        }
        if (var1 != 1 && (Statics.field4941 || var1 != 4)) {
            int var2 = class36.field242;
            int var3 = class36.field243;
            if (var2 < Statics.field2065 - 10 || var2 > Statics.field4753 + Statics.field2065 + 10 || var3 < Statics.field1020 - 10 || var3 > Statics.field1693 + Statics.field1020 + 10) {
                field669 = false;
                int var4 = Statics.field2065;
                int var5 = Statics.field1020;
                int var6 = Statics.field4753;
                int var7 = Statics.field1693;
                for (int var8 = 0; var8 < field781; var8++) {
                    if (field709[var8] + field640[var8] > var4 && field709[var8] < var4 + var6 && field712[var8] + field710[var8] > var5 && field710[var8] < var5 + var7) {
                        field706[var8] = true;
                    }
                }
            }
        }
        if (var1 != 1 && Statics.field4941 || var1 != 4) {
            return;
        }
        int var9 = Statics.field2065;
        int var10 = Statics.field1020;
        int var11 = Statics.field4753;
        int var12 = class36.field250;
        int var13 = class36.field251;
        int var14 = -1;
        for (int var15 = 0; var15 < field633; var15++) {
            int var16 = (field633 - 1 - var15) * 15 + var10 + 31;
            if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var13 < var16 + 3) {
                var14 = var15;
            }
        }
        if (var14 != -1 && var14 >= 0) {
            int var17 = field634[var14];
            int var18 = field635[var14];
            int var19 = field636[var14];
            int var20 = field637[var14];
            int var21 = field638[var14];
            String var22 = field639[var14];
            String var23 = field581[var14];
            method242(var17, var18, var19, var20, var21, var22, var23, class36.field250, class36.field251);
        }
        field669 = false;
        int var24 = Statics.field2065;
        int var25 = Statics.field1020;
        int var26 = Statics.field4753;
        int var27 = Statics.field1693;
        for (int var28 = 0; var28 < field781; var28++) {
            if (field709[var28] + field640[var28] > var24 && field709[var28] < var24 + var26 && field712[var28] + field710[var28] > var25 && field710[var28] < var25 + var27) {
                field706[var28] = true;
            }
        }
    }

    @ObfuscatedName("client.kr(I)Z")
    public final boolean method1179() {
        int var1 = method2041();
        boolean var2 = field631 && field633 > 2;
        if (!var2) {
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field636[var1];
                if (var4 >= 2000) {
                    var4 -= 2000;
                }
                if (var4 == 1007) {
                    var3 = true;
                } else {
                    var3 = false;
                }
            }
            var2 = var3;
        }
        return var2 && !field641[var1];
    }

    @ObfuscatedName("client.kl(III)V")
    public final void method1449(int arg0, int arg1) {
        method7578(arg0, arg1);
        int var3 = arg0 - field555;
        int var4 = arg1 - field768;
        Statics.field180.method4207(Statics.field231, var3, var4, false);
        field669 = true;
    }

    @ObfuscatedName("qb.kx(IIB)V")
    public static void method7578(int arg0, int arg1) {
        int var2 = Statics.field1635.method6761(class337.field4114);
        for (int var3 = 0; var3 < field633; var3++) {
            int var4 = Statics.field1635.method6761(method7141(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field633 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field211) {
            var6 = Statics.field211 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field3026) {
            var7 = Statics.field3026 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field2065 = var6;
        Statics.field1020 = var7;
        Statics.field4753 = var2;
        Statics.field1693 = field633 * 15 + 22;
    }

    @ObfuscatedName("fd.kv(Lcb;IIB)V")
    public static final void method3030(class70 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            method242(arg0.field877, arg0.field880, arg0.field878, arg0.field879, arg0.field876, arg0.field881, arg0.field883, arg1, arg2);
        }
    }

    @ObfuscatedName("ar.ke(IIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 11) {
            class96 var9 = field546[arg3];
            if (var9 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var10 = class289.method5974(class287.field3179, field753.field1385);
                var10.field3212.method8324(arg3);
                var10.field3212.method8278(field722.method3888(82) ? 1 : 0);
                field753.method2650(var10);
            }
        }
        if (arg2 == 6) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var11 = class289.method5974(class287.field3101, field753.field1385);
            var11.field3212.method8288(arg3);
            var11.field3212.method8278(field722.method3888(82) ? 1 : 0);
            var11.field3212.method8288(Statics.field2841 + arg1);
            var11.field3212.method8324(Statics.field2850 + arg0);
            field753.method2650(var11);
        }
        if (arg2 == 13) {
            class96 var12 = field546[arg3];
            if (var12 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var13 = class289.method5974(class287.field3188, field753.field1385);
                var13.field3212.method8285(field722.method3888(82) ? 1 : 0);
                var13.field3212.method8288(arg3);
                field753.method2650(var13);
            }
        }
        if (arg2 == 5) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var14 = class289.method5974(class287.field3144, field753.field1385);
            var14.field3212.method8449(Statics.field2850 + arg0);
            var14.field3212.method8324(arg3);
            var14.field3212.method8449(Statics.field2841 + arg1);
            var14.field3212.method8306(field722.method3888(82) ? 1 : 0);
            field753.method2650(var14);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1542.method7773(arg2, arg3, new class308(arg0), new class308(arg1));
        }
        if (arg2 == 19) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var15 = class289.method5974(class287.field3133, field753.field1385);
            var15.field3212.method8288(Statics.field2841 + arg1);
            var15.field3212.method8449(arg3);
            var15.field3212.method8285(field722.method3888(82) ? 1 : 0);
            var15.field3212.method8449(Statics.field2850 + arg0);
            field753.method2650(var15);
        }
        if (arg2 == 1001) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var16 = class289.method5974(class287.field3171, field753.field1385);
            var16.field3212.method8306(field722.method3888(82) ? 1 : 0);
            var16.field3212.method8449(arg3);
            var16.field3212.method8288(Statics.field2850 + arg0);
            var16.field3212.method8449(Statics.field2841 + arg1);
            field753.method2650(var16);
        }
        if (arg2 == 23) {
            if (field669) {
                Statics.field180.method4188();
            } else {
                Statics.field180.method4207(Statics.field231, arg0, arg1, true);
            }
        }
        if (arg2 == 28) {
            class289 var17 = class289.method5974(class287.field3132, field753.field1385);
            var17.field3212.method8234(arg1);
            field753.method2650(var17);
            class317 var18 = class317.method3201(arg1);
            if (var18 != null && var18.field3695 != null && var18.field3695[0][0] == 5) {
                int var19 = var18.field3695[0][1];
                class307.field3482[var19] = 1 - class307.field3482[var19];
                method50(var19);
            }
        }
        if (arg2 == 47) {
            class88 var20 = field611[arg3];
            if (var20 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var21 = class289.method5974(class287.field3161, field753.field1385);
                var21.field3212.method8306(field722.method3888(82) ? 1 : 0);
                var21.field3212.method8324(arg3);
                field753.method2650(var21);
            }
        }
        if (arg2 == 7) {
            class96 var22 = field546[arg3];
            if (var22 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var23 = class289.method5974(class287.field3192, field753.field1385);
                var23.field3212.method8395(field722.method3888(82) ? 1 : 0);
                var23.field3212.method8234(Statics.field3365);
                var23.field3212.method8288(arg3);
                var23.field3212.method8449(Statics.field1678);
                var23.field3212.method8232(Statics.field2985);
                field753.method2650(var23);
            }
        }
        if (arg2 == 50) {
            class88 var24 = field611[arg3];
            if (var24 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var25 = class289.method5974(class287.field3117, field753.field1385);
                var25.field3212.method8449(arg3);
                var25.field3212.method8278(field722.method3888(82) ? 1 : 0);
                field753.method2650(var25);
            }
        }
        if (arg2 == 10) {
            class96 var26 = field546[arg3];
            if (var26 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var27 = class289.method5974(class287.field3165, field753.field1385);
                var27.field3212.method8288(arg3);
                var27.field3212.method8278(field722.method3888(82) ? 1 : 0);
                field753.method2650(var27);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class317 var28 = class317.method854(arg1, arg0);
            if (var28 != null) {
                method1129(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 14) {
            class88 var29 = field611[arg3];
            if (var29 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var30 = class289.method5974(class287.field3130, field753.field1385);
                var30.field3212.method8232(arg3);
                var30.field3212.method8278(field722.method3888(82) ? 1 : 0);
                var30.field3212.method8288(Statics.field2985);
                var30.field3212.method8234(Statics.field3365);
                var30.field3212.method8232(Statics.field1678);
                field753.method2650(var30);
            }
        }
        if (arg2 == 48) {
            class88 var31 = field611[arg3];
            if (var31 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var32 = class289.method5974(class287.field3121, field753.field1385);
                var32.field3212.method8306(field722.method3888(82) ? 1 : 0);
                var32.field3212.method8232(arg3);
                field753.method2650(var32);
            }
        }
        if (arg2 == 9) {
            class96 var33 = field546[arg3];
            if (var33 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var34 = class289.method5974(class287.field3190, field753.field1385);
                var34.field3212.method8285(field722.method3888(82) ? 1 : 0);
                var34.field3212.method8449(arg3);
                field753.method2650(var34);
            }
        }
        if (arg2 == 51) {
            class88 var35 = field611[arg3];
            if (var35 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var36 = class289.method5974(class287.field3107, field753.field1385);
                var36.field3212.method8288(arg3);
                var36.field3212.method8306(field722.method3888(82) ? 1 : 0);
                field753.method2650(var36);
            }
        }
        if (arg2 == 3) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var37 = class289.method5974(class287.field3109, field753.field1385);
            var37.field3212.method8324(Statics.field2850 + arg0);
            var37.field3212.method8278(field722.method3888(82) ? 1 : 0);
            var37.field3212.method8449(Statics.field2841 + arg1);
            var37.field3212.method8288(arg3);
            field753.method2650(var37);
        }
        if (arg2 == 25) {
            class317 var38 = class317.method854(arg1, arg0);
            if (var38 != null) {
                method3244();
                method279(arg1, arg0, class318.method3554(method345(var38)), arg4);
                field649 = 0;
                field663 = method5394(var38);
                if (field663 == null) {
                    field663 = class337.field3889;
                }
                if (var38.field3651) {
                    field655 = var38.field3650 + class97.method6893(16777215);
                } else {
                    field655 = class97.method6893(65280) + var38.field3699 + class97.method6893(16777215);
                }
            }
            return;
        }
        if (arg2 == 24) {
            class317 var39 = class317.method3201(arg1);
            if (var39 != null) {
                boolean var40 = true;
                if (var39.field3686 > 0) {
                    var40 = method1128(var39);
                }
                if (var40) {
                    class289 var41 = class289.method5974(class287.field3132, field753.field1385);
                    var41.field3212.method8234(arg1);
                    field753.method2650(var41);
                }
            }
        }
        if (arg2 == 1003) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            class96 var42 = field546[arg3];
            if (var42 != null) {
                class191 var43 = var42.field1277;
                if (var43.field2045 != null) {
                    var43 = var43.method3458();
                }
                if (var43 != null) {
                    class289 var44 = class289.method5974(class287.field3159, field753.field1385);
                    var44.field3212.method8324(var43.field2012);
                    field753.method2650(var44);
                }
            }
        }
        if (arg2 == 20) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var45 = class289.method5974(class287.field3127, field753.field1385);
            var45.field3212.method8288(Statics.field2850 + arg0);
            var45.field3212.method8285(field722.method3888(82) ? 1 : 0);
            var45.field3212.method8449(arg3);
            var45.field3212.method8288(Statics.field2841 + arg1);
            field753.method2650(var45);
        }
        if (arg2 == 49) {
            class88 var46 = field611[arg3];
            if (var46 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var47 = class289.method5974(class287.field3156, field753.field1385);
                var47.field3212.method8288(arg3);
                var47.field3212.method8306(field722.method3888(82) ? 1 : 0);
                field753.method2650(var47);
            }
        }
        if (arg2 == 8) {
            class96 var48 = field546[arg3];
            if (var48 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var49 = class289.method5974(class287.field3151, field753.field1385);
                var49.field3212.method8288(field600);
                var49.field3212.method8235(Statics.field2805);
                var49.field3212.method8324(arg3);
                var49.field3212.method8288(field658);
                var49.field3212.method8278(field722.method3888(82) ? 1 : 0);
                field753.method2650(var49);
            }
        }
        if (arg2 == 2) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var50 = class289.method5974(class287.field3123, field753.field1385);
            var50.field3212.method8278(field722.method3888(82) ? 1 : 0);
            var50.field3212.method8324(arg3);
            var50.field3212.method8324(field600);
            var50.field3212.method8324(Statics.field2850 + arg0);
            var50.field3212.method8449(field658);
            var50.field3212.method8235(Statics.field2805);
            var50.field3212.method8449(Statics.field2841 + arg1);
            field753.method2650(var50);
        }
        if (arg2 == 1002) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            class289 var51 = class289.method5974(class287.field3108, field753.field1385);
            var51.field3212.method8449(arg3);
            field753.method2650(var51);
        }
        if (arg2 == 45) {
            class88 var52 = field611[arg3];
            if (var52 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var53 = class289.method5974(class287.field3134, field753.field1385);
                var53.field3212.method8278(field722.method3888(82) ? 1 : 0);
                var53.field3212.method8324(arg3);
                field753.method2650(var53);
            }
        }
        if (arg2 == 16) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var54 = class289.method5974(class287.field3114, field753.field1385);
            var54.field3212.method8232(Statics.field2985);
            var54.field3212.method8449(Statics.field2850 + arg0);
            var54.field3212.method8449(arg3);
            var54.field3212.method8449(Statics.field2841 + arg1);
            var54.field3212.method8232(Statics.field1678);
            var54.field3212.method8285(field722.method3888(82) ? 1 : 0);
            var54.field3212.method8235(Statics.field3365);
            field753.method2650(var54);
        }
        if (arg2 == 46) {
            class88 var55 = field611[arg3];
            if (var55 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var56 = class289.method5974(class287.field3131, field753.field1385);
                var56.field3212.method8324(arg3);
                var56.field3212.method8395(field722.method3888(82) ? 1 : 0);
                field753.method2650(var56);
            }
        }
        if (arg2 == 4) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var57 = class289.method5974(class287.field3148, field753.field1385);
            var57.field3212.method8449(Statics.field2850 + arg0);
            var57.field3212.method8324(Statics.field2841 + arg1);
            var57.field3212.method8449(arg3);
            var57.field3212.method8395(field722.method3888(82) ? 1 : 0);
            field753.method2650(var57);
        }
        if (arg2 == 44) {
            class88 var58 = field611[arg3];
            if (var58 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var59 = class289.method5974(class287.field3128, field753.field1385);
                var59.field3212.method8395(field722.method3888(82) ? 1 : 0);
                var59.field3212.method8232(arg3);
                field753.method2650(var59);
            }
        }
        if (arg2 == 18) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var60 = class289.method5974(class287.field3183, field753.field1385);
            var60.field3212.method8449(arg3);
            var60.field3212.method8232(Statics.field2841 + arg1);
            var60.field3212.method8278(field722.method3888(82) ? 1 : 0);
            var60.field3212.method8324(Statics.field2850 + arg0);
            field753.method2650(var60);
        }
        if (arg2 == 58) {
            class317 var61 = class317.method854(arg1, arg0);
            if (var61 != null) {
                if (var61.field3678 != null) {
                    class84 var62 = new class84();
                    var62.field1048 = var61;
                    var62.field1045 = arg3;
                    var62.field1049 = arg6;
                    var62.field1052 = var61.field3678;
                    class67.method2285(var62);
                }
                class289 var63 = class289.method5974(class287.field3119, field753.field1385);
                var63.field3212.method8324(arg0);
                var63.field3212.method8232(arg4);
                var63.field3212.method8301(Statics.field2805);
                var63.field3212.method8449(field658);
                var63.field3212.method8235(arg1);
                var63.field3212.method8288(field600);
                field753.method2650(var63);
            }
        }
        if (arg2 == 30 && field661 == null) {
            method2140(arg1, arg0);
            field661 = class317.method854(arg1, arg0);
            method3056(field661);
        }
        if (arg2 == 26) {
            method3076();
        }
        if (arg2 == 15) {
            class88 var64 = field611[arg3];
            if (var64 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var65 = class289.method5974(class287.field3146, field753.field1385);
                var65.field3212.method8449(field658);
                var65.field3212.method8288(field600);
                var65.field3212.method8324(arg3);
                var65.field3212.method8278(field722.method3888(82) ? 1 : 0);
                var65.field3212.method8234(Statics.field2805);
                field753.method2650(var65);
            }
        }
        if (arg2 == 12) {
            class96 var66 = field546[arg3];
            if (var66 != null) {
                field515 = arg7;
                field676 = arg8;
                field607 = 2;
                field606 = 0;
                field735 = arg0;
                field487 = arg1;
                class289 var67 = class289.method5974(class287.field3163, field753.field1385);
                var67.field3212.method8288(arg3);
                var67.field3212.method8395(field722.method3888(82) ? 1 : 0);
                field753.method2650(var67);
            }
        }
        if (arg2 == 1) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var68 = class289.method5974(class287.field3142, field753.field1385);
            var68.field3212.method8288(arg3);
            var68.field3212.method8235(Statics.field3365);
            var68.field3212.method8232(Statics.field2985);
            var68.field3212.method8288(Statics.field2850 + arg0);
            var68.field3212.method8278(field722.method3888(82) ? 1 : 0);
            var68.field3212.method8288(Statics.field1678);
            var68.field3212.method8449(Statics.field2841 + arg1);
            field753.method2650(var68);
        }
        if (arg2 == 17) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var69 = class289.method5974(class287.field3124, field753.field1385);
            var69.field3212.method8278(field722.method3888(82) ? 1 : 0);
            var69.field3212.method8235(Statics.field2805);
            var69.field3212.method8449(field658);
            var69.field3212.method8232(arg3);
            var69.field3212.method8324(Statics.field2850 + arg0);
            var69.field3212.method8288(Statics.field2841 + arg1);
            var69.field3212.method8288(field600);
            field753.method2650(var69);
        }
        if (arg2 == 21) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var70 = class289.method5974(class287.field3122, field753.field1385);
            var70.field3212.method8288(Statics.field2850 + arg0);
            var70.field3212.method8278(field722.method3888(82) ? 1 : 0);
            var70.field3212.method8449(Statics.field2841 + arg1);
            var70.field3212.method8324(arg3);
            field753.method2650(var70);
        }
        if (arg2 == 29) {
            class289 var71 = class289.method5974(class287.field3132, field753.field1385);
            var71.field3212.method8234(arg1);
            field753.method2650(var71);
            class317 var72 = class317.method3201(arg1);
            if (var72 != null && var72.field3695 != null && var72.field3695[0][0] == 5) {
                int var73 = var72.field3695[0][1];
                if (class307.field3482[var73] != var72.field3697[0]) {
                    class307.field3482[var73] = var72.field3697[0];
                    method50(var73);
                }
            }
        }
        if (arg2 == 22) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            field735 = arg0;
            field487 = arg1;
            class289 var74 = class289.method5974(class287.field3118, field753.field1385);
            var74.field3212.method8324(Statics.field2841 + arg1);
            var74.field3212.method8306(field722.method3888(82) ? 1 : 0);
            var74.field3212.method8232(Statics.field2850 + arg0);
            var74.field3212.method8324(arg3);
            field753.method2650(var74);
        }
        if (arg2 == 1004) {
            field515 = arg7;
            field676 = arg8;
            field607 = 2;
            field606 = 0;
            class289 var75 = class289.method5974(class287.field3177, field753.field1385);
            var75.field3212.method8232(Statics.field2841 + arg1);
            var75.field3212.method8324(arg3);
            var75.field3212.method8324(Statics.field2850 + arg0);
            field753.method2650(var75);
        }
        if (field649 != 0) {
            field649 = 0;
            method3056(class317.method3201(Statics.field3365));
        }
        if (field651) {
            method3244();
        }
    }

    @ObfuscatedName("eu.ky(ILjava/lang/String;I)V")
    public static void method2761(int arg0, String arg1) {
        int var2 = class103.field1335;
        int[] var3 = class103.field1341;
        boolean var4 = false;
        class513 var5 = new class513(arg1, Statics.field889);
        for (int var6 = 0; var6 < var2; var6++) {
            class88 var7 = field611[var3[var6]];
            if (var7 != null && Statics.field3454 != var7 && var7.field1089 != null && var7.field1089.equals(var5)) {
                if (arg0 == 1) {
                    class289 var8 = class289.method5974(class287.field3128, field753.field1385);
                    var8.field3212.method8395(0);
                    var8.field3212.method8232(var3[var6]);
                    field753.method2650(var8);
                } else if (arg0 == 4) {
                    class289 var9 = class289.method5974(class287.field3161, field753.field1385);
                    var9.field3212.method8306(0);
                    var9.field3212.method8324(var3[var6]);
                    field753.method2650(var9);
                } else if (arg0 == 6) {
                    class289 var10 = class289.method5974(class287.field3156, field753.field1385);
                    var10.field3212.method8288(var3[var6]);
                    var10.field3212.method8306(0);
                    field753.method2650(var10);
                } else if (arg0 == 7) {
                    class289 var11 = class289.method5974(class287.field3117, field753.field1385);
                    var11.field3212.method8449(var3[var6]);
                    var11.field3212.method8278(0);
                    field753.method2650(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class106.method2767(4, "", class337.field4045 + arg1);
        }
    }

    @ObfuscatedName("am.kh(IIIII)V")
    public static void method279(int arg0, int arg1, int arg2, int arg3) {
        class317 var4 = class317.method854(arg0, arg1);
        if (var4 != null && var4.field3625 != null) {
            class84 var5 = new class84();
            var5.field1048 = var4;
            var5.field1052 = var4.field3625;
            class67.method2285(var5);
        }
        field600 = arg3;
        field651 = true;
        Statics.field2805 = arg0;
        field658 = arg1;
        Statics.field958 = arg2;
        method3056(var4);
    }

    @ObfuscatedName("gy.kp(B)V")
    public static void method3244() {
        if (!field651) {
            return;
        }
        class317 var0 = class317.method854(Statics.field2805, field658);
        if (var0 != null && var0.field3669 != null) {
            class84 var1 = new class84();
            var1.field1048 = var0;
            var1.field1052 = var0.field3669;
            class67.method2285(var1);
        }
        field600 = -1;
        field651 = false;
        method3056(var0);
    }

    @ObfuscatedName("do.kf(IIS)V")
    public static void method2140(int arg0, int arg1) {
        class289 var2 = class289.method5974(class287.field3174, field753.field1385);
        var2.field3212.method8301(arg0);
        var2.field3212.method8324(arg1);
        field753.method2650(var2);
    }

    @ObfuscatedName("cq.ks(IIIILjava/lang/String;I)V")
    public static void method1129(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class317 var5 = class317.method854(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3677 != null) {
            class84 var6 = new class84();
            var6.field1048 = var5;
            var6.field1045 = arg0;
            var6.field1049 = arg4;
            var6.field1052 = var5.field3677;
            class67.method2285(var6);
        }
        boolean var7 = true;
        if (var5.field3686 > 0) {
            var7 = method1128(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method345(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class289 var11 = class289.method5974(class287.field3191, field753.field1385);
            var11.field3212.method8234(arg1);
            var11.field3212.method8232(arg2);
            var11.field3212.method8232(arg3);
            field753.method2650(var11);
        }
        if (arg0 == 2) {
            class289 var12 = class289.method5974(class287.field3169, field753.field1385);
            var12.field3212.method8234(arg1);
            var12.field3212.method8232(arg2);
            var12.field3212.method8232(arg3);
            field753.method2650(var12);
        }
        if (arg0 == 3) {
            class289 var13 = class289.method5974(class287.field3175, field753.field1385);
            var13.field3212.method8234(arg1);
            var13.field3212.method8232(arg2);
            var13.field3212.method8232(arg3);
            field753.method2650(var13);
        }
        if (arg0 == 4) {
            class289 var14 = class289.method5974(class287.field3105, field753.field1385);
            var14.field3212.method8234(arg1);
            var14.field3212.method8232(arg2);
            var14.field3212.method8232(arg3);
            field753.method2650(var14);
        }
        if (arg0 == 5) {
            class289 var15 = class289.method5974(class287.field3147, field753.field1385);
            var15.field3212.method8234(arg1);
            var15.field3212.method8232(arg2);
            var15.field3212.method8232(arg3);
            field753.method2650(var15);
        }
        if (arg0 == 6) {
            class289 var16 = class289.method5974(class287.field3170, field753.field1385);
            var16.field3212.method8234(arg1);
            var16.field3212.method8232(arg2);
            var16.field3212.method8232(arg3);
            field753.method2650(var16);
        }
        if (arg0 == 7) {
            class289 var17 = class289.method5974(class287.field3193, field753.field1385);
            var17.field3212.method8234(arg1);
            var17.field3212.method8232(arg2);
            var17.field3212.method8232(arg3);
            field753.method2650(var17);
        }
        if (arg0 == 8) {
            class289 var18 = class289.method5974(class287.field3162, field753.field1385);
            var18.field3212.method8234(arg1);
            var18.field3212.method8232(arg2);
            var18.field3212.method8232(arg3);
            field753.method2650(var18);
        }
        if (arg0 == 9) {
            class289 var19 = class289.method5974(class287.field3125, field753.field1385);
            var19.field3212.method8234(arg1);
            var19.field3212.method8232(arg2);
            var19.field3212.method8232(arg3);
            field753.method2650(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class289 var20 = class289.method5974(class287.field3168, field753.field1385);
        var20.field3212.method8234(arg1);
        var20.field3212.method8232(arg2);
        var20.field3212.method8232(arg3);
        field753.method2650(var20);
    }

    @ObfuscatedName("qj.kn(B)V")
    public static final void method7527() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field633 - 1; var1++) {
                if (field636[var1] < 1000 && field636[var1 + 1] > 1000) {
                    String var2 = field581[var1];
                    field581[var1] = field581[var1 + 1];
                    field581[var1 + 1] = var2;
                    String var3 = field639[var1];
                    field639[var1] = field639[var1 + 1];
                    field639[var1 + 1] = var3;
                    int var4 = field636[var1];
                    field636[var1] = field636[var1 + 1];
                    field636[var1 + 1] = var4;
                    int var5 = field634[var1];
                    field634[var1] = field634[var1 + 1];
                    field634[var1 + 1] = var5;
                    int var6 = field635[var1];
                    field635[var1] = field635[var1 + 1];
                    field635[var1 + 1] = var6;
                    int var7 = field637[var1];
                    field637[var1] = field637[var1 + 1];
                    field637[var1 + 1] = var7;
                    int var8 = field638[var1];
                    field638[var1] = field638[var1 + 1];
                    field638[var1 + 1] = var8;
                    boolean var9 = field641[var1];
                    field641[var1] = field641[var1 + 1];
                    field641[var1 + 1] = var9;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("cb.kz(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1946(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method4551(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("fd.km(Ljava/lang/String;Ljava/lang/String;IIIIIS)V")
    public static final void method3029(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method4551(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("jc.lv(Ljava/lang/String;Ljava/lang/String;IIIIIZB)V")
    public static final void method4551(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field669 || field633 >= 500) {
            return;
        }
        field639[field633] = arg0;
        field581[field633] = arg1;
        field636[field633] = arg2;
        field637[field633] = arg3;
        field634[field633] = arg4;
        field635[field633] = arg5;
        field638[field633] = arg6;
        field641[field633] = arg7;
        field633++;
    }

    @ObfuscatedName("ct.lm(S)I")
    public static final int method2041() {
        return field633 - 1;
    }

    @ObfuscatedName("pr.lg(IS)Ljava/lang/String;")
    public static String method7141(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field581[arg0].length() > 0) {
            return field639[arg0] + class337.field4010 + field581[arg0];
        } else {
            return field639[arg0];
        }
    }

    @ObfuscatedName("ck.ls(IIIII)V")
    public static final void method1094(int arg0, int arg1, int arg2, int arg3) {
        if (field649 == 0 && !field651) {
            method1946(class337.field4021, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class233.method382(); var8++) {
            long var9 = class233.method458(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class233.method4347(var8);
                int var12 = class233.method1096(var8);
                int var13 = class233.method4379(class233.field2773[var8]);
                int var15 = class233.method2144(class233.field2773[var8]);
                int var16 = var15;
                if (var13 == 2 && Statics.field180.method4334(Statics.field231, var11, var12, var9) >= 0) {
                    class201 var17 = Statics.method3057(var15);
                    if (var17.field2198 != null) {
                        var17 = var17.method3669();
                    }
                    if (var17 == null) {
                        continue;
                    }
                    class90 var18 = null;
                    for (class90 var19 = (class90) field574.method6329(); var19 != null; var19 = (class90) field574.method6338()) {
                        if (Statics.field231 == var19.field1131 && var19.field1121 == var11 && var19.field1122 == var12 && var19.field1128 == var16) {
                            var18 = var19;
                            break;
                        }
                    }
                    if (field649 == 1) {
                        method1946(class337.field4000, field497 + " " + class97.field1284 + " " + class97.method6893(65535) + var17.field2184, 1, var16, var11, var12);
                    } else if (!field651) {
                        String[] var20 = var17.field2174;
                        if (var20 != null) {
                            for (int var21 = 4; var21 >= 0; var21--) {
                                if ((var18 == null || var18.method2243(var21)) && var20[var21] != null) {
                                    short var22 = 0;
                                    if (var21 == 0) {
                                        var22 = 3;
                                    }
                                    if (var21 == 1) {
                                        var22 = 4;
                                    }
                                    if (var21 == 2) {
                                        var22 = 5;
                                    }
                                    if (var21 == 3) {
                                        var22 = 6;
                                    }
                                    if (var21 == 4) {
                                        var22 = 1001;
                                    }
                                    method1946(var20[var21], class97.method6893(65535) + var17.field2184, var22, var16, var11, var12);
                                }
                            }
                        }
                        method1946(class337.field4001, class97.method6893(65535) + var17.field2184, 1002, var17.field2186, var11, var12);
                    } else if ((Statics.field958 & 0x4) == 4) {
                        method1946(field663, field655 + " " + class97.field1284 + " " + class97.method6893(65535) + var17.field2184, 2, var16, var11, var12);
                    }
                }
                if (var13 == 1) {
                    class96 var23 = field546[var16];
                    if (var23 == null) {
                        continue;
                    }
                    if (var23.field1277.field2042 == 1 && (var23.field1171 & 0x7F) == 64 && (var23.field1138 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field737; var24++) {
                            class96 var25 = field546[field548[var24]];
                            if (var25 != null && var23 != var25 && var25.field1277.field2042 == 1 && var23.field1171 == var25.field1171 && var23.field1138 == var25.field1138) {
                                method3324(var25, field548[var24], var11, var12);
                            }
                        }
                        int var26 = class103.field1335;
                        int[] var27 = class103.field1341;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class88 var29 = field611[var27[var28]];
                            if (var29 != null && var23.field1171 == var29.field1171 && var23.field1138 == var29.field1138) {
                                method2042(var29, var27[var28], var11, var12);
                            }
                        }
                    }
                    method3324(var23, var16, var11, var12);
                }
                if (var13 == 0) {
                    class88 var30 = field611[var16];
                    if (var30 == null) {
                        continue;
                    }
                    if ((var30.field1171 & 0x7F) == 64 && (var30.field1138 & 0x7F) == 64) {
                        for (int var31 = 0; var31 < field737; var31++) {
                            class96 var32 = field546[field548[var31]];
                            if (var32 != null && var32.field1277.field2042 == 1 && var30.field1171 == var32.field1171 && var30.field1138 == var32.field1138) {
                                method3324(var32, field548[var31], var11, var12);
                            }
                        }
                        int var33 = class103.field1335;
                        int[] var34 = class103.field1341;
                        for (int var35 = 0; var35 < var33; var35++) {
                            class88 var36 = field611[var34[var35]];
                            if (var36 != null && var30 != var36 && var30.field1171 == var36.field1171 && var30.field1138 == var36.field1138) {
                                method2042(var36, var34[var35], var11, var12);
                            }
                        }
                    }
                    if (field623 == var16) {
                        var4 = var9;
                    } else {
                        method2042(var30, var16, var11, var12);
                    }
                }
                if (var13 == 3) {
                    class363 var37 = field624[Statics.field231][var11][var12];
                    if (var37 != null) {
                        for (class100 var38 = (class100) var37.method6346(); var38 != null; var38 = (class100) var37.method6340()) {
                            class202 var39 = class202.method2286(var38.field1317);
                            if (field649 == 1) {
                                method1946(class337.field4000, field497 + " " + class97.field1284 + " " + class97.method6893(16748608) + var39.field2261, 16, var38.field1317, var11, var12);
                            } else if (!field651) {
                                String[] var40 = var39.field2220;
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var38.method2532(var41)) {
                                        if (var40 != null && var40[var41] != null) {
                                            byte var42 = 0;
                                            if (var41 == 0) {
                                                var42 = 18;
                                            }
                                            if (var41 == 1) {
                                                var42 = 19;
                                            }
                                            if (var41 == 2) {
                                                var42 = 20;
                                            }
                                            if (var41 == 3) {
                                                var42 = 21;
                                            }
                                            if (var41 == 4) {
                                                var42 = 22;
                                            }
                                            method1946(var40[var41], class97.method6893(16748608) + var39.field2261, var42, var38.field1317, var11, var12);
                                        } else if (var41 == 2) {
                                            method1946(class337.field3837, class97.method6893(16748608) + var39.field2261, 20, var38.field1317, var11, var12);
                                        }
                                    }
                                }
                                method1946(class337.field4001, class97.method6893(16748608) + var39.field2261, 1004, var38.field1317, var11, var12);
                            } else if ((Statics.field958 & 0x1) == 1) {
                                method1946(field663, field655 + " " + class97.field1284 + " " + class97.method6893(16748608) + var39.field2261, 17, var38.field1317, var11, var12);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var43 = (int) (var4 >>> 0 & 0x7FL);
            int var45 = class233.method3510(var4);
            class88 var46 = field611[field623];
            method2042(var46, field623, var43, var45);
        }
    }

    @ObfuscatedName("gl.lf(Ldf;IIIS)V")
    public static final void method3324(class96 arg0, int arg1, int arg2, int arg3) {
        class191 var4 = arg0.field1277;
        if (field633 >= 400) {
            return;
        }
        if (var4.field2045 != null) {
            var4 = var4.method3458();
        }
        if (var4 == null || !var4.field2048 || var4.field2025 && field665 != arg1) {
            return;
        }
        String var5 = arg0.method2470();
        if (var4.field2046 != 0 && arg0.field1212 != 0) {
            int var6 = arg0.field1212 == -1 ? var4.field2046 : arg0.field1212;
            var5 = var5 + method2137(var6, Statics.field3454.field1102) + " " + class97.field1287 + class337.field4006 + var6 + class97.field1288;
        }
        if (var4.field2025 && field642) {
            method1946(class337.field4001, class97.method6893(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field649 == 1) {
            method1946(class337.field4000, field497 + " " + class97.field1284 + " " + class97.method6893(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field651) {
            int var7 = var4.field2025 && field642 ? 2000 : 0;
            String[] var8 = var4.field2036;
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (arg0.method2467(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase(class337.field4002)) {
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
                        method1946(var8[var9], class97.method6893(16776960) + var5, var10, arg1, arg2, arg3);
                    }
                }
            }
            if (var8 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (arg0.method2467(var11) && var8[var11] != null && var8[var11].equalsIgnoreCase(class337.field4002)) {
                        short var12 = 0;
                        if (field517 != class99.field1309) {
                            if (field517 == class99.field1306 || field517 == class99.field1307 && var4.field2046 > Statics.field3454.field1102) {
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
                            method1946(var8[var11], class97.method6893(16776960) + var5, var13, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field2025 || !field642) {
                method1946(class337.field4001, class97.method6893(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field958 & 0x2) == 2) {
            method1946(field663, field655 + " " + class97.field1284 + " " + class97.method6893(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ct.li(Ldv;IIII)V")
    public static final void method2042(class88 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field3454 == arg0 || field633 >= 400) {
            return;
        }
        String var4;
        if (arg0.field1085 == 0) {
            var4 = arg0.field1103[0] + arg0.field1089 + arg0.field1103[1] + method2137(arg0.field1102, Statics.field3454.field1102) + " " + class97.field1287 + class337.field4006 + arg0.field1102 + class97.field1288 + arg0.field1103[2];
        } else {
            var4 = arg0.field1103[0] + arg0.field1089 + arg0.field1103[1] + " " + class97.field1287 + class337.field4007 + arg0.field1085 + class97.field1288 + arg0.field1103[2];
        }
        if (field649 == 1) {
            method1946(class337.field4000, field497 + " " + class97.field1284 + " " + class97.method6893(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field651) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field736[var5] != null) {
                    short var6 = 0;
                    if (field736[var5].equalsIgnoreCase(class337.field4002)) {
                        if (field501 == class99.field1309) {
                            continue;
                        }
                        if (field501 == class99.field1306 || field501 == class99.field1307 && arg0.field1102 > Statics.field3454.field1102) {
                            var6 = 2000;
                        }
                        if (Statics.field3454.field1104 == 0 || arg0.field1104 == 0) {
                            if (field501 == class99.field1308 && arg0.method2183()) {
                                var6 = 2000;
                            }
                        } else if (Statics.field3454.field1104 == arg0.field1104) {
                            var6 = 2000;
                        } else {
                            var6 = 0;
                        }
                    } else if (field588[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field598[var5] + var6;
                    method1946(field736[var5], class97.method6893(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field958 & 0x8) == 8) {
            method1946(field663, field655 + " " + class97.field1284 + " " + class97.method6893(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field633; var9++) {
            if (field636[var9] == 23) {
                field581[var9] = class97.method6893(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("dc.lu(IIB)Ljava/lang/String;")
    public static final String method2137(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class97.method6893(16711680);
        } else if (var2 < -6) {
            return class97.method6893(16723968);
        } else if (var2 < -3) {
            return class97.method6893(16740352);
        } else if (var2 < 0) {
            return class97.method6893(16756736);
        } else if (var2 > 9) {
            return class97.method6893(65280);
        } else if (var2 > 6) {
            return class97.method6893(4259584);
        } else if (var2 > 3) {
            return class97.method6893(8453888);
        } else if (var2 > 0) {
            return class97.method6893(12648192);
        } else {
            return class97.method6893(16776960);
        }
    }

    @ObfuscatedName("ai.lk(IIIIIIIIB)V")
    public static final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class317.method855(arg0)) {
            Statics.field2878 = null;
            method95(Statics.field2057[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2878 != null) {
                method95(Statics.field2878, -1412584499, arg1, arg2, arg3, arg4, Statics.field2685, Statics.field1329, arg7);
                Statics.field2878 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field706[var8] = true;
            }
        } else {
            field706[arg7] = true;
        }
    }

    @ObfuscatedName("ao.lh([Lmq;IIIIIIIII)V")
    public static final void method95(class317[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class499.method8572(arg2, arg3, arg4, arg5);
        class219.method264();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class317 var10 = arg0[var9];
            if (var10 != null && (var10.field3589 == arg1 || arg1 == -1412584499 && field511 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field709[field781] = var10.field3661 + arg6;
                    field710[field781] = var10.field3715 + arg7;
                    field640[field781] = var10.field3572;
                    field712[field781] = var10.field3586;
                    var11 = ++field781 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3714 = var11;
                var10.field3698 = field602;
                if (!var10.field3651 || !method6973(var10)) {
                    if (var10.field3686 > 0) {
                        method705(var10);
                    }
                    int var12 = var10.field3661 + arg6;
                    int var13 = var10.field3715 + arg7;
                    int var14 = var10.field3601;
                    if (field511 == var10) {
                        if (arg1 != -1412584499 && !var10.field3577) {
                            Statics.field2878 = arg0;
                            Statics.field2685 = arg6;
                            Statics.field1329 = arg7;
                            continue;
                        }
                        if (field724 && field673) {
                            int var15 = class36.field242;
                            int var16 = class36.field243;
                            int var17 = var15 - field670;
                            int var18 = var16 - field671;
                            if (var17 < field628) {
                                var17 = field628;
                            }
                            if (var10.field3572 + var17 > field628 + field539.field3572) {
                                var17 = field628 + field539.field3572 - var10.field3572;
                            }
                            if (var18 < field675) {
                                var18 = field675;
                            }
                            if (var10.field3586 + var18 > field675 + field539.field3586) {
                                var18 = field675 + field539.field3586 - var10.field3586;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3577) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3598 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3572 + var12;
                        int var22 = var10.field3586 + var13;
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
                        int var29 = var10.field3572 + var12;
                        int var30 = var10.field3586 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3651 || var25 < var27 && var26 < var28) {
                        if (var10.field3686 != 0) {
                            if (var10.field3686 == 1336) {
                                if (Statics.field112.method2333()) {
                                    var13 += 15;
                                    Statics.field2832.method6769("Fps:" + field204, var10.field3572 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field493) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2832.method6769("Mem:" + var32 + "k", var10.field3572 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3686 == 1337) {
                                field645 = var12;
                                field646 = var13;
                                method274(var12, var13, var10.field3572, var10.field3586);
                                field706[var10.field3714] = true;
                                class499.method8572(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3686 == 1338) {
                                method3142(var10, var12, var13, var11);
                                class499.method8572(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3686 == 1339) {
                                method2044(var10, var12, var13, var11);
                                class499.method8572(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3686 == 1400) {
                                Statics.field1542.method7826(var12, var13, var10.field3572, var10.field3586, field602);
                            }
                            if (var10.field3686 == 1401) {
                                Statics.field1542.method7843(var12, var13, var10.field3572, var10.field3586);
                            }
                            if (var10.field3686 == 1402) {
                                Statics.field1471.method2290(var12, field602);
                            }
                        }
                        if (var10.field3598 == 0) {
                            if (!var10.field3651 && method6973(var10) && Statics.field3394 != var10) {
                                continue;
                            }
                            if (!var10.field3651) {
                                if (var10.field3592 > var10.field3594 - var10.field3586) {
                                    var10.field3592 = var10.field3594 - var10.field3586;
                                }
                                if (var10.field3592 < 0) {
                                    var10.field3592 = 0;
                                }
                            }
                            method95(arg0, var10.field3570, var25, var26, var27, var28, var12 - var10.field3591, var13 - var10.field3592, var11);
                            if (var10.field3707 != null) {
                                method95(var10.field3707, var10.field3570, var25, var26, var27, var28, var12 - var10.field3591, var13 - var10.field3592, var11);
                            }
                            class83 var34 = (class83) field657.method7966((long) var10.field3570);
                            if (var34 != null) {
                                method158(var34.field1037, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class499.method8572(arg2, arg3, arg4, arg5);
                            class219.method264();
                        } else if (var10.field3598 == 11) {
                            if (method6973(var10) && Statics.field3394 != var10) {
                                continue;
                            }
                            if (var10.field3707 != null) {
                                method95(var10.field3707, var10.field3570, var25, var26, var27, var28, var12 - var10.field3591, var13 - var10.field3592, var11);
                            }
                            class499.method8572(arg2, arg3, arg4, arg5);
                            class219.method264();
                        }
                        if (field715 || field652[var11] || field713 > 1) {
                            if (var10.field3598 == 0 && !var10.field3651 && var10.field3594 > var10.field3586) {
                                method2571(var10.field3572 + var12, var13, var10.field3592, var10.field3586, var10.field3594);
                            }
                            if (var10.field3598 != 1) {
                                if (var10.field3598 == 3) {
                                    int var35;
                                    if (method7673(var10)) {
                                        var35 = var10.field3596;
                                        if (Statics.field3394 == var10 && var10.field3656 != 0) {
                                            var35 = var10.field3656;
                                        }
                                    } else {
                                        var35 = var10.field3595;
                                        if (Statics.field3394 == var10 && var10.field3597 != 0) {
                                            var35 = var10.field3597;
                                        }
                                    }
                                    if (var10.field3599) {
                                        switch(var10.field3600.field5073) {
                                            case 1:
                                                class499.method8581(var12, var13, var10.field3572, var10.field3586, var10.field3595, var10.field3596);
                                                break;
                                            case 2:
                                                class499.method8580(var12, var13, var10.field3572, var10.field3586, var10.field3595, var10.field3596, 255 - (var10.field3601 & 0xFF), 255 - (var10.field3602 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class499.method8603(var12, var13, var10.field3572, var10.field3586, var35);
                                                } else {
                                                    class499.method8579(var12, var13, var10.field3572, var10.field3586, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class499.method8632(var12, var13, var10.field3572, var10.field3586, var35);
                                    } else {
                                        class499.method8600(var12, var13, var10.field3572, var10.field3586, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3598 == 4) {
                                    class379 var36 = var10.method5840();
                                    if (var36 != null) {
                                        String var37 = var10.field3716;
                                        int var38;
                                        if (method7673(var10)) {
                                            var38 = var10.field3596;
                                            if (Statics.field3394 == var10 && var10.field3656 != 0) {
                                                var38 = var10.field3656;
                                            }
                                            if (var10.field3634.length() > 0) {
                                                var37 = var10.field3634;
                                            }
                                        } else {
                                            var38 = var10.field3595;
                                            if (Statics.field3394 == var10 && var10.field3597 != 0) {
                                                var38 = var10.field3597;
                                            }
                                        }
                                        if (var10.field3651 && var10.field3703 != -1) {
                                            class202 var39 = class202.method2286(var10.field3703);
                                            var37 = var39.field2261;
                                            if (var37 == null) {
                                                var37 = class337.field3889;
                                            }
                                            if ((var39.field2236 == 1 || var10.field3637 != 1) && var10.field3637 != -1) {
                                                var37 = class97.method6893(16748608) + var37 + class97.field1291 + " " + 'x' + method5999(var10.field3637);
                                            }
                                        }
                                        if (field661 == var10) {
                                            var37 = class337.field4008;
                                            var38 = var10.field3595;
                                        }
                                        if (!var10.field3651) {
                                            var37 = method2831(var37, var10);
                                        }
                                        var36.method6772(var37, var12, var13, var10.field3572, var10.field3586, var38, var10.field3574 ? 0 : -1, class442.method1065(var10.field3601), var10.field3636, var10.field3684, var10.field3635);
                                    } else if (class317.field3568) {
                                        method3056(var10);
                                    }
                                } else if (var10.field3598 == 5) {
                                    if (var10.field3651) {
                                        class503 var41;
                                        if (var10.field3703 == -1) {
                                            var41 = var10.method5770(false, Statics.field78);
                                        } else {
                                            var41 = class202.method4936(var10.field3703, var10.field3637, var10.field3610, var10.field3717, var10.field3631, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5092;
                                            int var43 = var41.field5087;
                                            if (var10.field3659) {
                                                class499.method8573(var12, var13, var10.field3572 + var12, var10.field3586 + var13);
                                                int var44 = (var10.field3572 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3586 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3608 != 0) {
                                                            var41.method8776(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3608, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method8690(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method8696(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class499.method8572(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3572 * 4096 / var42;
                                                if (var10.field3608 != 0) {
                                                    var41.method8776(var10.field3572 / 2 + var12, var10.field3586 / 2 + var13, var10.field3608, var48);
                                                } else if (var14 != 0) {
                                                    var41.method8730(var12, var13, var10.field3572, var10.field3586, 256 - (var14 & 0xFF));
                                                } else if (var10.field3572 == var42 && var10.field3586 == var43) {
                                                    var41.method8690(var12, var13);
                                                } else {
                                                    var41.method8692(var12, var13, var10.field3572, var10.field3586);
                                                }
                                            }
                                        } else if (class317.field3568) {
                                            method3056(var10);
                                        }
                                    } else {
                                        class503 var40 = var10.method5770(method7673(var10), Statics.field78);
                                        if (var40 != null) {
                                            var40.method8690(var12, var13);
                                        } else if (class317.field3568) {
                                            method3056(var10);
                                        }
                                    }
                                } else if (var10.field3598 == 6) {
                                    boolean var49 = method7673(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3629;
                                    } else {
                                        var50 = var10.field3618;
                                    }
                                    class232 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3703 != -1) {
                                        class202 var53 = class202.method2286(var10.field3703);
                                        if (var53 != null) {
                                            class202 var54 = var53.method3720(var10.field3637);
                                            var51 = var54.method3737(1);
                                            if (var51 == null) {
                                                method3056(var10);
                                            } else {
                                                var51.method4451();
                                                var52 = var51.field2619 / 2;
                                            }
                                        }
                                    } else if (var10.field3657 == 5) {
                                        if (var10.field3683 == 0) {
                                            var51 = field772.method5450((class204) null, -1, (class204) null, -1);
                                        } else {
                                            var51 = Statics.field3454.method1921();
                                        }
                                    } else if (var10.field3657 == 7) {
                                        var51 = var10.field3585.method5450((class204) null, -1, class204.method2139(Statics.field3454.field1139), Statics.field3454.field1178);
                                    } else {
                                        class191 var55 = null;
                                        class190 var56 = null;
                                        if (var10.field3657 == 6) {
                                            int var57 = var10.field3683;
                                            if (var57 >= 0 && var57 < field546.length) {
                                                class96 var58 = field546[var57];
                                                if (var58 != null) {
                                                    var55 = var58.field1277;
                                                    var56 = var58.method2448();
                                                }
                                            }
                                        }
                                        class204 var59 = null;
                                        int var60 = -1;
                                        if (var50 != -1) {
                                            var59 = class204.method2139(var50);
                                            var60 = var10.field3705;
                                        }
                                        var51 = var10.method5766(var59, var60, var49, Statics.field3454.field1097, var55, var56);
                                        if (var51 == null && class317.field3568) {
                                            method3056(var10);
                                        }
                                    }
                                    Statics.method4757(var10.field3572 / 2 + var12, var10.field3586 / 2 + var13);
                                    int var61 = var10.field3619 * class219.field2512[var10.field3622] >> 16;
                                    int var62 = var10.field3619 * class219.field2516[var10.field3622] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3651) {
                                            var51.method4451();
                                            if (var10.field3575) {
                                                var51.method4418(0, var10.field3566, var10.field3711, var10.field3622, var10.field3620, var10.field3709 + var52 + var61, var10.field3709 + var62, var10.field3619);
                                            } else {
                                                var51.method4502(0, var10.field3566, var10.field3711, var10.field3622, var10.field3620, var10.field3709 + var52 + var61, var10.field3709 + var62);
                                            }
                                        } else {
                                            var51.method4502(0, var10.field3566, 0, var10.field3622, 0, var61, var62);
                                        }
                                    }
                                    class219.method2115();
                                } else {
                                    if (var10.field3598 == 8 && Statics.field1575 == var10 && field648 == field647) {
                                        int var63 = 0;
                                        int var64 = 0;
                                        class379 var65 = Statics.field2832;
                                        String var66 = var10.field3716;
                                        String var67 = method2831(var66, var10);
                                        while (var67.length() > 0) {
                                            int var68 = var67.indexOf(class97.field1290);
                                            String var69;
                                            if (var68 == -1) {
                                                var69 = var67;
                                                var67 = "";
                                            } else {
                                                var69 = var67.substring(0, var68);
                                                var67 = var67.substring(var68 + 4);
                                            }
                                            int var70 = var65.method6761(var69);
                                            if (var70 > var63) {
                                                var63 = var70;
                                            }
                                            var64 += var65.field4439 + 1;
                                        }
                                        var63 += 6;
                                        var64 += 7;
                                        int var71 = var10.field3572 + var12 - 5 - var63;
                                        int var72 = var10.field3586 + var13 + 5;
                                        if (var71 < var12 + 5) {
                                            var71 = var12 + 5;
                                        }
                                        if (var63 + var71 > arg4) {
                                            var71 = arg4 - var63;
                                        }
                                        if (var64 + var72 > arg5) {
                                            var72 = arg5 - var64;
                                        }
                                        class499.method8603(var71, var72, var63, var64, 16777120);
                                        class499.method8632(var71, var72, var63, var64, 0);
                                        String var73 = var10.field3716;
                                        int var74 = var65.field4439 + var72 + 2;
                                        String var75 = method2831(var73, var10);
                                        while (var75.length() > 0) {
                                            int var76 = var75.indexOf(class97.field1290);
                                            String var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = "";
                                            } else {
                                                var77 = var75.substring(0, var76);
                                                var75 = var75.substring(var76 + 4);
                                            }
                                            var65.method6837(var77, var71 + 3, var74, 0, -1);
                                            var74 += var65.field4439 + 1;
                                        }
                                    }
                                    if (var10.field3598 == 9) {
                                        int var78;
                                        int var79;
                                        int var80;
                                        int var81;
                                        if (var10.field3604) {
                                            var78 = var12;
                                            var79 = var10.field3586 + var13;
                                            var80 = var10.field3572 + var12;
                                            var81 = var13;
                                        } else {
                                            var78 = var12;
                                            var79 = var13;
                                            var80 = var10.field3572 + var12;
                                            var81 = var10.field3586 + var13;
                                        }
                                        if (var10.field3603 == 1) {
                                            class499.method8601(var78, var79, var80, var81, var10.field3595);
                                        } else {
                                            method709(var78, var79, var80, var81, var10.field3595, var10.field3603);
                                        }
                                    } else if (var10.field3598 == 12) {
                                        class315 var82 = var10.method5797();
                                        class310 var83 = var10.method5799();
                                        if (var82 != null && var83 != null && var82.method5548()) {
                                            class379 var84 = var10.method5840();
                                            if (var84 != null) {
                                                field698.method8818(var12, var13, var10.field3572, var10.field3586, var82.method5605(), var82.method5704(), var82.method5546(), var82.method5547(), var82.method5545());
                                                int var85 = var10.field3574 ? var10.field3717 : -1;
                                                if (!var82.method5543() && var82.method5540().method6620()) {
                                                    field698.method8823(var83.field3492, var85, var83.field3494, var83.field3490);
                                                    field698.method8820(var82.method5541(), var84);
                                                } else {
                                                    field698.method8823(var10.field3595, var85, var83.field3494, var83.field3490);
                                                    field698.method8820(var82.method5540(), var84);
                                                }
                                                class499.method8572(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("bt.la(IIIIIIB)V")
    public static final void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class499.field5064;
        int var18 = arg1 - class499.field5065;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class219.method3343(var19, var20, var21);
        class219.method3058(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class219.method3343(var19, var21, var22);
        class219.method3058(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("em.lp(Ljava/lang/String;Lmq;S)Ljava/lang/String;")
    public static String method2831(String arg0, class317 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2124(arg1, var2 - 1);
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

    @ObfuscatedName("nw.ly(IS)Ljava/lang/String;")
    public static final String method5999(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class97.field1295 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class97.method6893(65408) + var1.substring(0, var1.length() - 8) + class337.field4011 + " " + class97.field1287 + var1 + class97.field1288 + class97.field1291;
        } else if (var1.length() > 6) {
            return " " + class97.method6893(16777215) + var1.substring(0, var1.length() - 4) + class337.field4013 + " " + class97.field1287 + var1 + class97.field1288 + class97.field1291;
        } else {
            return " " + class97.method6893(16776960) + var1 + class97.field1291;
        }
    }

    @ObfuscatedName("client.ln(ZI)V")
    public final void method1181(boolean arg0) {
        method3831(field656, Statics.field211, Statics.field3026, arg0);
    }

    @ObfuscatedName("client.lt(Lmq;I)V")
    public void method1281(class317 arg0) {
        class317 var2 = arg0.field3589 == -1 ? null : class317.method3201(arg0.field3589);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field211;
            var4 = Statics.field3026;
        } else {
            var3 = var2.field3572;
            var4 = var2.field3586;
        }
        method3151(arg0, var3, var4, false);
        method3513(arg0, var3, var4);
    }

    @ObfuscatedName("je.lz([Lmq;Lmq;ZB)V")
    public static void method4620(class317[] arg0, class317 arg1, boolean arg2) {
        int var3 = arg1.field3593 == 0 ? arg1.field3572 : arg1.field3593;
        int var4 = arg1.field3594 == 0 ? arg1.field3586 : arg1.field3594;
        method3019(arg0, arg1.field3570, var3, var4, arg2);
        if (arg1.field3707 != null) {
            method3019(arg1.field3707, arg1.field3570, var3, var4, arg2);
        }
        class83 var5 = (class83) field657.method7966((long) arg1.field3570);
        if (var5 != null) {
            method3831(var5.field1037, var3, var4, arg2);
        }
        if (arg1.field3686 == 1337) {
        }
    }

    @ObfuscatedName("ha.lc(IIIZI)V")
    public static final void method3831(int arg0, int arg1, int arg2, boolean arg3) {
        if (class317.method855(arg0)) {
            method3019(Statics.field2057[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fp.ld([Lmq;IIIZI)V")
    public static void method3019(class317[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class317 var6 = arg0[var5];
            if (var6 != null && var6.field3589 == arg1) {
                method3151(var6, arg2, arg3, arg4);
                method3513(var6, arg2, arg3);
                if (var6.field3591 > var6.field3593 - var6.field3572) {
                    var6.field3591 = var6.field3593 - var6.field3572;
                }
                if (var6.field3591 < 0) {
                    var6.field3591 = 0;
                }
                if (var6.field3592 > var6.field3594 - var6.field3586) {
                    var6.field3592 = var6.field3594 - var6.field3586;
                }
                if (var6.field3592 < 0) {
                    var6.field3592 = 0;
                }
                if (var6.field3598 == 0) {
                    method4620(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("gs.lq(Lmq;IIZI)V")
    public static void method3151(class317 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3572;
        int var5 = arg0.field3586;
        if (arg0.field3708 == 0) {
            arg0.field3572 = arg0.field3581;
        } else if (arg0.field3708 == 1) {
            arg0.field3572 = arg1 - arg0.field3581;
        } else if (arg0.field3708 == 2) {
            arg0.field3572 = arg0.field3581 * arg1 >> 14;
        }
        if (arg0.field3578 == 0) {
            arg0.field3586 = arg0.field3658;
        } else if (arg0.field3578 == 1) {
            arg0.field3586 = arg2 - arg0.field3658;
        } else if (arg0.field3578 == 2) {
            arg0.field3586 = arg0.field3658 * arg2 >> 14;
        }
        if (arg0.field3708 == 4) {
            arg0.field3572 = arg0.field3587 * arg0.field3586 / arg0.field3588;
        }
        if (arg0.field3578 == 4) {
            arg0.field3586 = arg0.field3588 * arg0.field3572 / arg0.field3587;
        }
        if (arg0.field3686 == 1337) {
            field667 = arg0;
        }
        if (arg0.field3598 == 12) {
            arg0.method5797().method5497(arg0.field3572, arg0.field3586);
        }
        if (arg3 && arg0.field3691 != null && (arg0.field3572 != var4 || arg0.field3586 != var5)) {
            class84 var6 = new class84();
            var6.field1048 = arg0;
            var6.field1052 = arg0.field3691;
            field699.method6324(var6);
        }
    }

    @ObfuscatedName("hl.lj(Lmq;IIB)V")
    public static void method3513(class317 arg0, int arg1, int arg2) {
        if (arg0.field3609 == 0) {
            arg0.field3661 = arg0.field3579;
        } else if (arg0.field3609 == 1) {
            arg0.field3661 = (arg1 - arg0.field3572) / 2 + arg0.field3579;
        } else if (arg0.field3609 == 2) {
            arg0.field3661 = arg1 - arg0.field3572 - arg0.field3579;
        } else if (arg0.field3609 == 3) {
            arg0.field3661 = arg0.field3579 * arg1 >> 14;
        } else if (arg0.field3609 == 4) {
            arg0.field3661 = (arg0.field3579 * arg1 >> 14) + (arg1 - arg0.field3572) / 2;
        } else {
            arg0.field3661 = arg1 - arg0.field3572 - (arg0.field3579 * arg1 >> 14);
        }
        if (arg0.field3576 == 0) {
            arg0.field3715 = arg0.field3580;
        } else if (arg0.field3576 == 1) {
            arg0.field3715 = (arg2 - arg0.field3586) / 2 + arg0.field3580;
        } else if (arg0.field3576 == 2) {
            arg0.field3715 = arg2 - arg0.field3586 - arg0.field3580;
        } else if (arg0.field3576 == 3) {
            arg0.field3715 = arg0.field3580 * arg2 >> 14;
        } else if (arg0.field3576 == 4) {
            arg0.field3715 = (arg0.field3580 * arg2 >> 14) + (arg2 - arg0.field3586) / 2;
        } else {
            arg0.field3715 = arg2 - arg0.field3586 - (arg0.field3580 * arg2 >> 14);
        }
    }

    @ObfuscatedName("gy.ll(Lmq;IIIIIIB)V")
    public static final void method3269(class317 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field570) {
            field571 = 32;
        } else {
            field571 = 0;
        }
        field570 = false;
        if (class36.field232 == 1 || !Statics.field4941 && class36.field232 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3592 -= 4;
                method3056(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3592 += 4;
                method3056(arg0);
            } else if (arg5 >= arg1 - field571 && arg5 < field571 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3592 = (arg4 - arg3) * var8 / var9;
                method3056(arg0);
                field570 = true;
            }
        }
        if (field697 == 0) {
            return;
        }
        int var10 = arg0.field3572;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3592 += field697 * 45;
            method3056(arg0);
        }
    }

    @ObfuscatedName("da.le(IIIIIB)V")
    public static final void method2571(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1265[0].method8656(arg0, arg1);
        Statics.field1265[1].method8656(arg0, arg1 + arg3 - 16);
        class499.method8603(arg0, arg1 + 16, 16, arg3 - 32, field576);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class499.method8603(arg0, arg1 + 16 + var6, 16, var5, field584);
        class499.method8625(arg0, arg1 + 16 + var6, var5, field569);
        class499.method8625(arg0 + 1, arg1 + 16 + var6, var5, field569);
        class499.method8586(arg0, arg1 + 16 + var6, 16, field569);
        class499.method8586(arg0, arg1 + 17 + var6, 16, field569);
        class499.method8625(arg0 + 15, arg1 + 16 + var6, var5, field568);
        class499.method8625(arg0 + 14, arg1 + 17 + var6, var5 - 1, field568);
        class499.method8586(arg0, arg1 + 15 + var6 + var5, 16, field568);
        class499.method8586(arg0 + 1, arg1 + 14 + var6 + var5, 15, field568);
    }

    @ObfuscatedName("rr.lb(Lmq;I)Z")
    public static final boolean method7673(class317 arg0) {
        if (arg0.field3696 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3696.length; var1++) {
            int var2 = method2124(arg0, var1);
            int var3 = arg0.field3697[var1];
            if (arg0.field3696[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3696[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3696[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dw.lx(Lmq;II)I")
    public static final int method2124(class317 arg0, int arg1) {
        if (arg0.field3695 == null || arg1 >= arg0.field3695.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3695[arg1];
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
                    var7 = field743[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field629[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field630[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class317 var11 = class317.method3201(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class202.method2286(var12).field2231 || field492)) {
                        for (int var13 = 0; var13 < var11.field3613.length; var13++) {
                            if (var12 + 1 == var11.field3613[var13]) {
                                var7 += var11.field3702[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class307.field3482[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class327.field3773[field629[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class307.field3482[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field3454.field1102;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class327.field3774[var14]) {
                            var7 += field629[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class317 var17 = class317.method3201(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class202.method2286(var18).field2231 || field492)) {
                        for (int var19 = 0; var19 < var17.field3613.length; var19++) {
                            if (var18 + 1 == var17.field3613[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field625;
                }
                if (var6 == 12) {
                    var7 = field683;
                }
                if (var6 == 13) {
                    int var20 = class307.field3482[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class307.method4941(var22);
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
                    var7 = (Statics.field3454.field1171 >> 7) + Statics.field2850;
                }
                if (var6 == 19) {
                    var7 = (Statics.field3454.field1138 >> 7) + Statics.field2841;
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

    @ObfuscatedName("my.lo(Lmq;I)V")
    public static final void method5988(class317 arg0) {
        if (arg0.field3573 == 1) {
            String var1 = arg0.field3700;
            int var2 = arg0.field3570;
            int var3 = arg0.field3703;
            method4551(var1, "", 24, 0, 0, var2, var3, false);
        }
        if (arg0.field3573 == 2 && !field651) {
            String var4 = method5394(arg0);
            if (var4 != null) {
                method3029(var4, class97.method6893(65280) + arg0.field3699, 25, 0, -1, arg0.field3570, arg0.field3703);
            }
        }
        if (arg0.field3573 == 3) {
            method1946(class337.field4145, "", 26, 0, 0, arg0.field3570);
        }
        if (arg0.field3573 == 4) {
            method1946(arg0.field3700, "", 28, 0, 0, arg0.field3570);
        }
        if (arg0.field3573 == 5) {
            method1946(arg0.field3700, "", 29, 0, 0, arg0.field3570);
        }
        if (arg0.field3573 == 6 && field661 == null) {
            method1946(arg0.field3700, "", 30, 0, -1, arg0.field3570);
        }
        if (!arg0.field3651) {
            return;
        }
        if (!field651) {
            for (int var5 = 9; var5 >= 5; var5--) {
                int var6 = method345(arg0);
                boolean var7 = (var6 >> var5 + 1 & 0x1) != 0;
                String var8;
                if (!var7 && arg0.field3677 == null) {
                    var8 = null;
                } else if (arg0.field3648 == null || arg0.field3648.length <= var5 || arg0.field3648[var5] == null || arg0.field3648[var5].trim().length() == 0) {
                    var8 = null;
                } else {
                    var8 = arg0.field3648[var5];
                }
                if (var8 != null) {
                    method3029(var8, arg0.field3650, 1007, var5 + 1, arg0.field3571, arg0.field3570, arg0.field3703);
                }
            }
            String var10 = method5394(arg0);
            if (var10 != null) {
                method3029(var10, arg0.field3650, 25, 0, arg0.field3571, arg0.field3570, arg0.field3703);
            }
            for (int var11 = 4; var11 >= 0; var11--) {
                int var12 = method345(arg0);
                boolean var13 = (var12 >> var11 + 1 & 0x1) != 0;
                String var14;
                if (!var13 && arg0.field3677 == null) {
                    var14 = null;
                } else if (arg0.field3648 == null || arg0.field3648.length <= var11 || arg0.field3648[var11] == null || arg0.field3648[var11].trim().length() == 0) {
                    var14 = null;
                } else {
                    var14 = arg0.field3648[var11];
                }
                if (var14 != null) {
                    method4551(var14, arg0.field3650, 57, var11 + 1, arg0.field3571, arg0.field3570, arg0.field3703, arg0.field3719);
                }
            }
            int var16 = method345(arg0);
            boolean var17 = (var16 & 0x1) != 0;
            if (var17) {
                method1946(class337.field3842, "", 30, 0, arg0.field3571, arg0.field3570);
            }
        } else if (class318.method2152(method345(arg0)) && (Statics.field958 & 0x20) == 32) {
            method3029(field663, field655 + " " + class97.field1284 + " " + arg0.field3650, 58, 0, arg0.field3571, arg0.field3570, arg0.field3703);
        }
    }

    @ObfuscatedName("ev.lw(ZB)V")
    public static void method2828(boolean arg0) {
        field643 = arg0;
    }

    @ObfuscatedName("ai.lr(I)Z")
    public static boolean method170() {
        return field643;
    }

    @ObfuscatedName("bj.mt(IIIIIIII)V")
    public static final void method718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class317.method855(arg0)) {
            method4546(Statics.field2057[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ix.mw([Lmq;IIIIIIII)V")
    public static final void method4546(class317[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class317 var9 = arg0[var8];
            if (var9 != null && var9.field3589 == arg1 && (var9.method5779() || method345(var9) != 0 || field539 == var9)) {
                if (var9.field3651) {
                    if (method6973(var9)) {
                        continue;
                    }
                } else if (var9.field3598 == 0 && Statics.field3394 != var9 && method6973(var9)) {
                    continue;
                }
                if (var9.field3598 == 11) {
                    if (var9.method5820(Statics.field78)) {
                        if (var9.method5787()) {
                            method3056(var9);
                            method4620(var9.field3707, var9, true);
                        }
                        if (var9.field3654 != null) {
                            class84 var10 = new class84();
                            var10.field1048 = var9;
                            var10.field1052 = var9.field3654;
                            field699.method6324(var10);
                        }
                    }
                } else if (var9.field3598 == 12 && var9.method5845()) {
                    method3056(var9);
                }
                int var11 = var9.field3661 + arg6;
                int var12 = var9.field3715 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3598 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3572 + var11;
                    int var16 = var9.field3586 + var12;
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
                    int var23 = var9.field3572 + var11;
                    int var24 = var9.field3586 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field511 == var9) {
                    field756 = true;
                    field677 = var11;
                    field678 = var12;
                }
                boolean var25 = false;
                if (var9.field3582) {
                    switch(field596) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3570 >>> 16 == field659) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field659 == var9.field3570) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3651 || var19 < var21 && var20 < var22) {
                    if (var9.field3651) {
                        if (var9.field3611) {
                            if (class36.field242 >= var19 && class36.field243 >= var20 && class36.field242 < var21 && class36.field243 < var22) {
                                for (class84 var26 = (class84) field699.method6329(); var26 != null; var26 = (class84) field699.method6338()) {
                                    if (var26.field1040) {
                                        var26.method7651();
                                        var26.field1048.field3672 = false;
                                    }
                                }
                                method4934();
                                if (Statics.field1289 == 0) {
                                    field511 = null;
                                    field539 = null;
                                }
                                if (!field669) {
                                    method3149();
                                }
                            }
                        } else if (var9.field3718 && class36.field242 >= var19 && class36.field243 >= var20 && class36.field242 < var21 && class36.field243 < var22) {
                            for (class84 var27 = (class84) field699.method6329(); var27 != null; var27 = (class84) field699.method6338()) {
                                if (var27.field1040 && var27.field1048.field3679 == var27.field1052) {
                                    var27.method7651();
                                }
                            }
                        }
                    }
                    int var28 = class36.field242;
                    int var29 = class36.field243;
                    if (class36.field252 != 0) {
                        var28 = class36.field250;
                        var29 = class36.field251;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3686 == 1337) {
                        if (!field500 && !field669 && var30) {
                            method1094(var28, var29, var19, var20);
                        }
                    } else if (var9.field3686 == 1338) {
                        method5397(var9, var11, var12);
                    } else {
                        if (var9.field3686 == 1400) {
                            Statics.field1542.method7720(class36.field242, class36.field243, var30, var11, var12, var9.field3572, var9.field3586);
                        }
                        if (!field669 && var30) {
                            if (var9.field3686 == 1400) {
                                Statics.field1542.method7771(var11, var12, var9.field3572, var9.field3586, var28, var29);
                            } else {
                                method5988(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3646.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3646[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3646[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3644 != null) {
                                            var35 = field722.method3888(var9.field3646[var31][var34]);
                                        }
                                        if (method2143(var9.field3646[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3644 != null && var9.field3644[var31] > field602) {
                                                break;
                                            }
                                            byte var36 = var9.field3647[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field722.method3888(86) && !field722.method3888(82) && !field722.method3888(81)) && ((var36 & 0x2) == 0 || field722.method3888(86)) && ((var36 & 0x1) == 0 || field722.method3888(82)) && ((var36 & 0x4) == 0 || field722.method3888(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method1129(var31 + 1, var9.field3570, var9.field3571, var9.field3703, "");
                                    } else if (var31 == 10) {
                                        method3244();
                                        method279(var9.field3570, var9.field3571, class318.method3554(method345(var9)), var9.field3703);
                                        field663 = method5394(var9);
                                        if (field663 == null) {
                                            field663 = class337.field3889;
                                        }
                                        field655 = var9.field3650 + class97.method6893(16777215);
                                    }
                                    int var37 = var9.field3628[var31];
                                    if (var9.field3644 == null) {
                                        var9.field3644 = new int[var9.field3646.length];
                                    }
                                    if (var9.field3671 == null) {
                                        var9.field3671 = new int[var9.field3646.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3644[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3644[var31] == 0) {
                                        var9.field3644[var31] = field602 + var37 + var9.field3671[var31];
                                    } else {
                                        var9.field3644[var31] = field602 + var37;
                                    }
                                }
                                if (!var32 && var9.field3644 != null) {
                                    var9.field3644[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3651) {
                            boolean var38;
                            if (class36.field242 >= var19 && class36.field243 >= var20 && class36.field242 < var21 && class36.field243 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field232 == 1 || !Statics.field4941 && class36.field232 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field252 == 1 || !Statics.field4941 && class36.field252 == 4) && class36.field250 >= var19 && class36.field251 >= var20 && class36.field250 < var21 && class36.field251 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method6507(var9, class36.field250 - var11, class36.field251 - var12);
                            }
                            if (var9.method5788()) {
                                if (var40) {
                                    field702.method6324(new class207(0, class36.field242 - var11, class36.field243 - var12, var9));
                                }
                                if (var39) {
                                    field702.method6324(new class207(1, class36.field242 - var11, class36.field243 - var12, var9));
                                }
                            }
                            if (var9.field3686 == 1400) {
                                Statics.field1542.method7721(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field511 != null && field511 != var9 && var38 && class318.method5393(method345(var9))) {
                                field672 = var9;
                            }
                            if (field539 == var9) {
                                field673 = true;
                                field628 = var11;
                                field675 = var12;
                            }
                            if (var9.field3624) {
                                if (var38 && field697 != 0 && var9.field3679 != null) {
                                    class84 var41 = new class84();
                                    var41.field1040 = true;
                                    var41.field1048 = var9;
                                    var41.field1044 = field697;
                                    var41.field1052 = var9.field3679;
                                    field699.method6324(var41);
                                }
                                if (field511 != null || field669) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3663 && var40) {
                                    var9.field3663 = true;
                                    if (var9.field3694 != null) {
                                        class84 var42 = new class84();
                                        var42.field1040 = true;
                                        var42.field1048 = var9;
                                        var42.field1043 = class36.field250 - var11;
                                        var42.field1044 = class36.field251 - var12;
                                        var42.field1052 = var9.field3694;
                                        field699.method6324(var42);
                                    }
                                }
                                if (var9.field3663 && var39 && var9.field3660 != null) {
                                    class84 var43 = new class84();
                                    var43.field1040 = true;
                                    var43.field1048 = var9;
                                    var43.field1043 = class36.field242 - var11;
                                    var43.field1044 = class36.field243 - var12;
                                    var43.field1052 = var9.field3660;
                                    field699.method6324(var43);
                                }
                                if (var9.field3663 && !var39) {
                                    var9.field3663 = false;
                                    if (var9.field3633 != null) {
                                        class84 var44 = new class84();
                                        var44.field1040 = true;
                                        var44.field1048 = var9;
                                        var44.field1043 = class36.field242 - var11;
                                        var44.field1044 = class36.field243 - var12;
                                        var44.field1052 = var9.field3633;
                                        field701.method6324(var44);
                                    }
                                }
                                if (var39 && var9.field3662 != null) {
                                    class84 var45 = new class84();
                                    var45.field1040 = true;
                                    var45.field1048 = var9;
                                    var45.field1043 = class36.field242 - var11;
                                    var45.field1044 = class36.field243 - var12;
                                    var45.field1052 = var9.field3662;
                                    field699.method6324(var45);
                                }
                                if (!var9.field3672 && var38) {
                                    var9.field3672 = true;
                                    if (var9.field3687 != null) {
                                        class84 var46 = new class84();
                                        var46.field1040 = true;
                                        var46.field1048 = var9;
                                        var46.field1043 = class36.field242 - var11;
                                        var46.field1044 = class36.field243 - var12;
                                        var46.field1052 = var9.field3687;
                                        field699.method6324(var46);
                                    }
                                }
                                if (var9.field3672 && var38 && var9.field3664 != null) {
                                    class84 var47 = new class84();
                                    var47.field1040 = true;
                                    var47.field1048 = var9;
                                    var47.field1043 = class36.field242 - var11;
                                    var47.field1044 = class36.field243 - var12;
                                    var47.field1052 = var9.field3664;
                                    field699.method6324(var47);
                                }
                                if (var9.field3672 && !var38) {
                                    var9.field3672 = false;
                                    if (var9.field3665 != null) {
                                        class84 var48 = new class84();
                                        var48.field1040 = true;
                                        var48.field1048 = var9;
                                        var48.field1043 = class36.field242 - var11;
                                        var48.field1044 = class36.field243 - var12;
                                        var48.field1052 = var9.field3665;
                                        field701.method6324(var48);
                                    }
                                }
                                if (var9.field3676 != null) {
                                    class84 var49 = new class84();
                                    var49.field1048 = var9;
                                    var49.field1052 = var9.field3676;
                                    field700.method6324(var49);
                                }
                                if (var9.field3670 != null && field514 > var9.field3561) {
                                    if (var9.field3584 == null || field514 - var9.field3561 > 32) {
                                        class84 var54 = new class84();
                                        var54.field1048 = var9;
                                        var54.field1052 = var9.field3670;
                                        field699.method6324(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3561; var50 < field514; var50++) {
                                            int var51 = field740[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3584.length; var52++) {
                                                if (var9.field3584[var52] == var51) {
                                                    class84 var53 = new class84();
                                                    var53.field1048 = var9;
                                                    var53.field1052 = var9.field3670;
                                                    field699.method6324(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3561 = field514;
                                }
                                if (var9.field3615 != null && field684 > var9.field3712) {
                                    if (var9.field3673 == null || field684 - var9.field3712 > 32) {
                                        class84 var59 = new class84();
                                        var59.field1048 = var9;
                                        var59.field1052 = var9.field3615;
                                        field699.method6324(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3712; var55 < field684; var55++) {
                                            int var56 = field720[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3673.length; var57++) {
                                                if (var9.field3673[var57] == var56) {
                                                    class84 var58 = new class84();
                                                    var58.field1048 = var9;
                                                    var58.field1052 = var9.field3615;
                                                    field699.method6324(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3712 = field684;
                                }
                                if (var9.field3674 != null && field686 > var9.field3701) {
                                    if (var9.field3675 == null || field686 - var9.field3701 > 32) {
                                        class84 var64 = new class84();
                                        var64.field1048 = var9;
                                        var64.field1052 = var9.field3674;
                                        field699.method6324(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3701; var60 < field686; var60++) {
                                            int var61 = field685[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3675.length; var62++) {
                                                if (var9.field3675[var62] == var61) {
                                                    class84 var63 = new class84();
                                                    var63.field1048 = var9;
                                                    var63.field1052 = var9.field3674;
                                                    field699.method6324(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3701 = field686;
                                }
                                if (field752 > var9.field3710 && var9.field3680 != null) {
                                    class84 var65 = new class84();
                                    var65.field1048 = var9;
                                    var65.field1052 = var9.field3680;
                                    field699.method6324(var65);
                                }
                                if (field690 > var9.field3710 && var9.field3692 != null) {
                                    class84 var66 = new class84();
                                    var66.field1048 = var9;
                                    var66.field1052 = var9.field3692;
                                    field699.method6324(var66);
                                }
                                if (field691 > var9.field3710 && var9.field3623 != null) {
                                    class84 var67 = new class84();
                                    var67.field1048 = var9;
                                    var67.field1052 = var9.field3623;
                                    field699.method6324(var67);
                                }
                                if (field692 > var9.field3710 && var9.field3638 != null) {
                                    class84 var68 = new class84();
                                    var68.field1048 = var9;
                                    var68.field1052 = var9.field3638;
                                    field699.method6324(var68);
                                }
                                if (field693 > var9.field3710 && var9.field3567 != null) {
                                    class84 var69 = new class84();
                                    var69.field1048 = var9;
                                    var69.field1052 = var9.field3567;
                                    field699.method6324(var69);
                                }
                                if (field763 > var9.field3710 && var9.field3645 != null) {
                                    class84 var70 = new class84();
                                    var70.field1048 = var9;
                                    var70.field1052 = var9.field3645;
                                    field699.method6324(var70);
                                }
                                if (field769 > var9.field3710 && var9.field3693 != null) {
                                    class84 var71 = new class84();
                                    var71.field1048 = var9;
                                    var71.field1052 = var9.field3693;
                                    field699.method6324(var71);
                                }
                                if (field566 > var9.field3710 && var9.field3688 != null) {
                                    class84 var72 = new class84();
                                    var72.field1048 = var9;
                                    var72.field1052 = var9.field3688;
                                    field699.method6324(var72);
                                }
                                var9.field3710 = field680;
                                if (var9.field3681 != null) {
                                    for (int var73 = 0; var73 < field488; var73++) {
                                        class84 var74 = new class84();
                                        var74.field1048 = var9;
                                        var74.field1047 = field557[var73];
                                        var74.field1041 = field725[var73];
                                        var74.field1052 = var9.field3681;
                                        field699.method6324(var74);
                                    }
                                }
                                if (var9.field3682 != null) {
                                    int[] var75 = field722.method3884();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class84 var77 = new class84();
                                        var77.field1048 = var9;
                                        var77.field1047 = var75[var76];
                                        var77.field1052 = var9.field3682;
                                        field699.method6324(var77);
                                    }
                                }
                                if (var9.field3583 != null) {
                                    int[] var78 = field722.method3881();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class84 var80 = new class84();
                                        var80.field1048 = var9;
                                        var80.field1047 = var78[var79];
                                        var80.field1052 = var9.field3583;
                                        field699.method6324(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3651) {
                            if (field511 != null || field669) {
                                continue;
                            }
                            if ((var9.field3614 >= 0 || var9.field3597 != 0) && class36.field242 >= var19 && class36.field243 >= var20 && class36.field242 < var21 && class36.field243 < var22) {
                                if (var9.field3614 >= 0) {
                                    Statics.field3394 = arg0[var9.field3614];
                                } else {
                                    Statics.field3394 = var9;
                                }
                            }
                            if (var9.field3598 == 8 && class36.field242 >= var19 && class36.field243 >= var20 && class36.field242 < var21 && class36.field243 < var22) {
                                Statics.field1575 = var9;
                            }
                            if (var9.field3594 > var9.field3586) {
                                method3269(var9, var9.field3572 + var11, var12, var9.field3586, var9.field3594, class36.field242, class36.field243);
                            }
                        }
                        if (var9.field3598 == 0) {
                            method4546(arg0, var9.field3570, var19, var20, var21, var22, var11 - var9.field3591, var12 - var9.field3592);
                            if (var9.field3707 != null) {
                                method4546(var9.field3707, var9.field3570, var19, var20, var21, var22, var11 - var9.field3591, var12 - var9.field3592);
                            }
                            class83 var81 = (class83) field657.method7966((long) var9.field3570);
                            if (var81 != null) {
                                if (var81.field1038 == 0 && class36.field242 >= var19 && class36.field243 >= var20 && class36.field242 < var21 && class36.field243 < var22 && !field669) {
                                    for (class84 var82 = (class84) field699.method6329(); var82 != null; var82 = (class84) field699.method6338()) {
                                        if (var82.field1040) {
                                            var82.method7651();
                                            var82.field1048.field3672 = false;
                                        }
                                    }
                                    if (Statics.field1289 == 0) {
                                        field511 = null;
                                        field539 = null;
                                    }
                                    if (!field669) {
                                        method3149();
                                    }
                                }
                                method718(var81.field1037, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("do.mz(II)Z")
    public static boolean method2143(int arg0) {
        for (int var1 = 0; var1 < field488; var1++) {
            if (field557[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ec.mu(IIB)V")
    public static final void method2952(int arg0, int arg1) {
        if (class317.method855(arg0)) {
            method3052(Statics.field2057[arg0], arg1);
        }
    }

    @ObfuscatedName("fy.mq([Lmq;IB)V")
    public static final void method3052(class317[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class317 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3598 == 0) {
                    if (var3.field3707 != null) {
                        method3052(var3.field3707, arg1);
                    }
                    class83 var4 = (class83) field657.method7966((long) var3.field3570);
                    if (var4 != null) {
                        method2952(var4.field1037, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3689 != null) {
                    class84 var5 = new class84();
                    var5.field1048 = var3;
                    var5.field1052 = var3.field3689;
                    class67.method2285(var5);
                }
                if (arg1 == 1 && var3.field3690 != null) {
                    if (var3.field3571 >= 0) {
                        class317 var6 = class317.method3201(var3.field3570);
                        if (var6 == null || var6.field3707 == null || var3.field3571 >= var6.field3707.length || var6.field3707[var3.field3571] != var3) {
                            continue;
                        }
                    }
                    class84 var7 = new class84();
                    var7.field1048 = var3;
                    var7.field1052 = var3.field3690;
                    class67.method2285(var7);
                }
            }
        }
    }

    @ObfuscatedName("ol.mm(Lmq;III)V")
    public static final void method6507(class317 arg0, int arg1, int arg2) {
        if (field511 != null || field669 || arg0 == null) {
            return;
        }
        class317 var3 = arg0;
        int var4 = class318.method3622(method345(arg0));
        class317 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class317.method3201(var3.field3589);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class317 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field3652;
        }
        if (var7 == null) {
            return;
        }
        field511 = arg0;
        class317 var9 = arg0;
        int var10 = class318.method3622(method345(arg0));
        class317 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class317.method3201(var9.field3589);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class317 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field3652;
        }
        field539 = var13;
        field670 = arg1;
        field671 = arg2;
        Statics.field1289 = 0;
        field724 = false;
        int var15 = method2041();
        if (var15 != -1) {
            method5137(var15);
        }
        return;
    }

    @ObfuscatedName("client.me(B)V")
    public final void method1183() {
        method3056(field511);
        Statics.field1289++;
        if (field756 && field673) {
            int var1 = class36.field242;
            int var2 = class36.field243;
            int var3 = var1 - field670;
            int var4 = var2 - field671;
            if (var3 < field628) {
                var3 = field628;
            }
            if (field511.field3572 + var3 > field628 + field539.field3572) {
                var3 = field628 + field539.field3572 - field511.field3572;
            }
            if (var4 < field675) {
                var4 = field675;
            }
            if (field511.field3586 + var4 > field675 + field539.field3586) {
                var4 = field675 + field539.field3586 - field511.field3586;
            }
            int var5 = var3 - field677;
            int var6 = var4 - field678;
            int var7 = field511.field3653;
            if (Statics.field1289 > field511.field3639 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field724 = true;
            }
            int var8 = field539.field3591 + (var3 - field628);
            int var9 = field539.field3592 + (var4 - field675);
            if (field511.field3666 != null && field724) {
                class84 var10 = new class84();
                var10.field1048 = field511;
                var10.field1043 = var8;
                var10.field1044 = var9;
                var10.field1052 = field511.field3666;
                class67.method2285(var10);
            }
            if (class36.field232 == 0) {
                if (field724) {
                    if (field511.field3667 != null) {
                        class84 var11 = new class84();
                        var11.field1048 = field511;
                        var11.field1043 = var8;
                        var11.field1044 = var9;
                        var11.field1046 = field672;
                        var11.field1052 = field511.field3667;
                        class67.method2285(var11);
                    }
                    if (field672 != null) {
                        class317 var12 = field511;
                        int var13 = class318.method3622(method345(var12));
                        class317 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class317.method3201(var12.field3589);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class289 var16 = class289.method5974(class287.field3150, field753.field1385);
                            var16.field3212.method8288(field672.field3703);
                            var16.field3212.method8299(field672.field3570);
                            var16.field3212.method8288(field672.field3571);
                            var16.field3212.method8288(field511.field3571);
                            var16.field3212.method8301(field511.field3570);
                            var16.field3212.method8232(field511.field3703);
                            field753.method2650(var16);
                        }
                    }
                } else if (this.method1179()) {
                    this.method1449(field677 + field670, field678 + field671);
                } else if (field633 > 0) {
                    method3859(field677 + field670, field678 + field671);
                }
                field511 = null;
            }
        } else if (Statics.field1289 > 1) {
            if (!field724 && field633 > 0) {
                method3859(field677 + field670, field678 + field671);
            }
            field511 = null;
        }
    }

    @ObfuscatedName("lm.mv(IB)V")
    public static void method5137(int arg0) {
        Statics.field4318 = new class70();
        Statics.field4318.field877 = field634[arg0];
        Statics.field4318.field880 = field635[arg0];
        Statics.field4318.field878 = field636[arg0];
        Statics.field4318.field879 = field637[arg0];
        Statics.field4318.field876 = field638[arg0];
        Statics.field4318.field881 = field639[arg0];
        Statics.field4318.field883 = field581[arg0];
    }

    @ObfuscatedName("hp.mx(III)V")
    public static void method3859(int arg0, int arg1) {
        method3030(Statics.field4318, arg0, arg1);
        Statics.field4318 = null;
    }

    @ObfuscatedName("fw.ma(Lmq;I)V")
    public static void method3056(class317 arg0) {
        if (arg0 != null && field660 == arg0.field3698) {
            field706[arg0.field3714] = true;
        }
    }

    @ObfuscatedName("lv.mp(B)V")
    public static void method5136() {
        for (class83 var0 = (class83) field657.method7972(); var0 != null; var0 = (class83) field657.method7969()) {
            int var1 = var0.field1037;
            if (class317.method855(var1)) {
                boolean var2 = true;
                class317[] var3 = Statics.field2057[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3651;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4745;
                    class317 var6 = class317.method3201(var5);
                    if (var6 != null) {
                        method3056(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("lm.mj(II)V")
    public static final void method5143(int arg0) {
        if (!class317.method855(arg0)) {
            return;
        }
        class317[] var1 = Statics.field2057[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class317 var3 = var1[var2];
            if (var3 != null) {
                var3.field3705 = 0;
                var3.field3706 = 0;
            }
        }
    }

    @ObfuscatedName("dx.ms([Lmq;IB)V")
    public static final void method2530(class317[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class317 var3 = arg0[var2];
            if (var3 != null && var3.field3589 == arg1 && (!var3.field3651 || !method6973(var3))) {
                if (var3.field3598 == 0) {
                    if (!var3.field3651 && method6973(var3) && Statics.field3394 != var3) {
                        continue;
                    }
                    method2530(arg0, var3.field3570);
                    if (var3.field3707 != null) {
                        method2530(var3.field3707, var3.field3570);
                    }
                    class83 var4 = (class83) field657.method7966((long) var3.field3570);
                    if (var4 != null) {
                        int var5 = var4.field1037;
                        if (class317.method855(var5)) {
                            method2530(Statics.field2057[var5], -1);
                        }
                    }
                }
                if (var3.field3598 == 6) {
                    if (var3.field3618 != -1 || var3.field3629 != -1) {
                        boolean var6 = method7673(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3629;
                        } else {
                            var7 = var3.field3618;
                        }
                        if (var7 != -1) {
                            class204 var8 = class204.method2139(var7);
                            if (var8.method3816()) {
                                var3.field3705 += field565;
                                int var9 = var8.method3817();
                                if (var3.field3705 >= var9) {
                                    var3.field3705 -= var8.field2301;
                                    if (var3.field3705 < 0 || var3.field3705 >= var9) {
                                        var3.field3705 = 0;
                                    }
                                }
                                method3056(var3);
                            } else {
                                var3.field3706 += field565;
                                while (var3.field3706 > var8.field2304[var3.field3705]) {
                                    var3.field3706 -= var8.field2304[var3.field3705];
                                    var3.field3705++;
                                    if (var3.field3705 >= var8.field2300.length) {
                                        var3.field3705 -= var8.field2301;
                                        if (var3.field3705 < 0 || var3.field3705 >= var8.field2300.length) {
                                            var3.field3705 = 0;
                                        }
                                    }
                                    method3056(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3627 != 0 && !var3.field3651) {
                        int var10 = var3.field3627 >> 16;
                        int var11 = var3.field3627 << 16 >> 16;
                        int var12 = field565 * var10;
                        int var13 = field565 * var11;
                        var3.field3622 = var3.field3622 + var12 & 0x7FF;
                        var3.field3566 = var3.field3566 + var13 & 0x7FF;
                        method3056(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cm.mc(II)V")
    public static final void method1134(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method1093((double) var3);
    }

    @ObfuscatedName("da.mh(I)I")
    public static final int method2570() {
        float var0 = 200.0F * ((float) Statics.field112.method2337() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("ck.mg(D)V")
    public static final void method1093(double arg0) {
        class219.method278(arg0);
        ((class229) class219.field2515.field2795).method4360(arg0);
        class202.method2959();
        Statics.field112.method2336(arg0);
    }

    @ObfuscatedName("dt.mo(IB)V")
    public static final void method2172(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field112.method2339()) {
            return;
        }
        if (Statics.field112.method2339() == 0 && field650 != -1) {
            class298.method1130(Statics.field4548, field650, 0, var1, false);
            field739 = false;
        } else if (var1 == 0) {
            class298.method3547();
            field739 = false;
        } else {
            class298.method4161(var1);
        }
        Statics.field112.method2338(var1);
    }

    @ObfuscatedName("fe.mn(II)V")
    public static final void method2965(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field112.method2340(var1);
    }

    @ObfuscatedName("fp.mi(IB)V")
    public static final void method3018(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field112.method2342(var1);
    }

    @ObfuscatedName("al.md(II)V")
    public static final void method50(int arg0) {
        method5136();
        class66.method276();
        int var1 = class182.method7368(arg0).field1912;
        if (var1 == 0) {
            return;
        }
        int var2 = class307.field3482[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method1093(0.9D);
            }
            if (var2 == 2) {
                method1093(0.8D);
            }
            if (var2 == 3) {
                method1093(0.7D);
            }
            if (var2 == 4) {
                method1093(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method2172(255);
            }
            if (var2 == 1) {
                method2172(192);
            }
            if (var2 == 2) {
                method2172(128);
            }
            if (var2 == 3) {
                method2172(64);
            }
            if (var2 == 4) {
                method2172(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method2965(127);
            }
            if (var2 == 1) {
                method2965(96);
            }
            if (var2 == 2) {
                method2965(64);
            }
            if (var2 == 3) {
                method2965(32);
            }
            if (var2 == 4) {
                method2965(0);
            }
        }
        if (var1 == 5) {
            field631 = var2 == 1;
        }
        if (var1 == 6) {
            field626 = var2;
        }
        if (var1 == 9) {
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method3018(127);
            }
            if (var2 == 1) {
                method3018(96);
            }
            if (var2 == 2) {
                method3018(64);
            }
            if (var2 == 3) {
                method3018(32);
            }
            if (var2 == 4) {
                method3018(0);
            }
        }
        if (var1 == 17) {
            field665 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field501 = (class99) Statics.method3600(class99.method2737(), var2);
            if (field501 == null) {
                field501 = class99.field1307;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field623 = -1;
            } else {
                field623 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field517 = (class99) Statics.method3600(class99.method2737(), var2);
            if (field517 == null) {
                field517 = class99.field1307;
            }
        }
    }

    @ObfuscatedName("bd.mr(Lmq;I)V")
    public static final void method705(class317 arg0) {
        int var1 = arg0.field3686;
        if (var1 == 324) {
            if (field773 == -1) {
                field773 = arg0.field3605;
                field774 = arg0.field3606;
            }
            if (field772.field3522 == 1) {
                arg0.field3605 = field773;
            } else {
                arg0.field3605 = field774;
            }
        } else if (var1 == 325) {
            if (field773 == -1) {
                field773 = arg0.field3605;
                field774 = arg0.field3606;
            }
            if (field772.field3522 == 1) {
                arg0.field3605 = field774;
            } else {
                arg0.field3605 = field773;
            }
        } else if (var1 == 327) {
            arg0.field3622 = 150;
            arg0.field3566 = (int) (Math.sin((double) field602 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3657 = 5;
            arg0.field3683 = 0;
        } else if (var1 == 328) {
            arg0.field3622 = 150;
            arg0.field3566 = (int) (Math.sin((double) field602 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3657 = 5;
            arg0.field3683 = 1;
        }
    }

    @ObfuscatedName("fc.ml(I)V")
    public static final void method3076() {
        class289 var0 = class289.method5974(class287.field3167, field753.field1385);
        field753.method2650(var0);
        class67.field854 = true;
        for (class83 var1 = (class83) field657.method7972(); var1 != null; var1 = (class83) field657.method7969()) {
            if (var1.field1038 == 0 || var1.field1038 == 3) {
                method6286(var1, true);
            }
        }
        if (field661 != null) {
            method3056(field661);
            field661 = null;
        }
        class67.field854 = false;
    }

    @ObfuscatedName("dj.mf(IIII)Ldi;")
    public static final class83 method2526(int arg0, int arg1, int arg2) {
        class83 var3 = new class83();
        var3.field1037 = arg1;
        var3.field1038 = arg2;
        field657.method7967(var3, (long) arg0);
        method5143(arg1);
        class317 var4 = class317.method3201(arg0);
        method3056(var4);
        if (field661 != null) {
            method3056(field661);
            field661 = null;
        }
        method4620(Statics.field2057[arg0 >> 16], var4, false);
        class67.method156(arg1);
        if (field656 != -1) {
            method2952(field656, 1);
        }
        return var3;
    }

    @ObfuscatedName("nv.my(Ldi;ZI)V")
    public static final void method6286(class83 arg0, boolean arg1) {
        int var2 = arg0.field1037;
        int var3 = (int) arg0.field4745;
        arg0.method7651();
        if (arg1 && var2 != -1 && Statics.field3037[var2]) {
            Statics.field1430.method6084(var2);
            if (Statics.field2057[var2] != null) {
                for (int var4 = 0; var4 < Statics.field2057[var2].length; var4++) {
                    if (Statics.field2057[var2][var4] != null) {
                        Statics.field2057[var2][var4] = null;
                    }
                }
                Statics.field2057[var2] = null;
                Statics.field3037[var2] = false;
            }
        }
        for (class448 var5 = (class448) field703.method7972(); var5 != null; var5 = (class448) field703.method7969()) {
            if ((var5.field4745 >> 48 & 0xFFFFL) == (long) var2) {
                var5.method7651();
            }
        }
        class317 var6 = class317.method3201(var3);
        if (var6 != null) {
            method3056(var6);
        }
        if (field656 != -1) {
            method2952(field656, 1);
        }
    }

    @ObfuscatedName("cq.mk(Lmq;B)Z")
    public static final boolean method1128(class317 arg0) {
        int var1 = arg0.field3686;
        if (var1 == 205) {
            field761 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field772.method5440(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field772.method5462(var4, var5 == 1);
        }
        if (var1 == 324) {
            field772.method5447(0);
        }
        if (var1 == 325) {
            field772.method5447(1);
        }
        if (var1 == 326) {
            class289 var6 = class289.method5974(class287.field3103, field753.field1385);
            field772.method5448(var6.field3212);
            field753.method2650(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fu.mb(Lmq;IIII)V")
    public static final void method3142(class317 arg0, int arg1, int arg2, int arg3) {
        method5961();
        class306 var4 = arg0.method5777(false);
        if (var4 == null) {
            return;
        }
        class499.method8572(arg1, arg2, var4.field3477 + arg1, var4.field3472 + arg2);
        if (field653 == 2 || field653 == 5) {
            class499.method8608(arg1, arg2, 0, var4.field3475, var4.field3474);
        } else {
            int var5 = field758 & 0x7FF;
            int var6 = Statics.field3454.field1171 / 32 + 48;
            int var7 = 464 - Statics.field3454.field1138 / 32;
            Statics.field1396.method8677(arg1, arg2, var4.field3477, var4.field3472, var6, var7, var5, 256, var4.field3475, var4.field3474);
            for (int var8 = 0; var8 < field731; var8++) {
                int var9 = field620[var8] * 4 + 2 - Statics.field3454.field1171 / 32;
                int var10 = field733[var8] * 4 + 2 - Statics.field3454.field1138 / 32;
                method7549(arg1, arg2, var9, var10, field734[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class363 var13 = field624[Statics.field231][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field3454.field1171 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field3454.field1138 / 32;
                        method7549(arg1, arg2, var14, var15, Statics.field4946[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field737; var16++) {
                class96 var17 = field546[field548[var16]];
                if (var17 != null && var17.method2188()) {
                    class191 var18 = var17.field1277;
                    if (var18 != null && var18.field2045 != null) {
                        var18 = var18.method3458();
                    }
                    if (var18 != null && var18.field2037 && var18.field2048) {
                        int var19 = var17.field1171 / 32 - Statics.field3454.field1171 / 32;
                        int var20 = var17.field1138 / 32 - Statics.field3454.field1138 / 32;
                        method7549(arg1, arg2, var19, var20, Statics.field4946[1], var4);
                    }
                }
            }
            int var21 = class103.field1335;
            int[] var22 = class103.field1341;
            for (int var23 = 0; var23 < var21; var23++) {
                class88 var24 = field611[var22[var23]];
                if (var24 != null && var24.method2188() && !var24.field1105 && Statics.field3454 != var24) {
                    int var25 = var24.field1171 / 32 - Statics.field3454.field1171 / 32;
                    int var26 = var24.field1138 / 32 - Statics.field3454.field1138 / 32;
                    if (var24.method2175()) {
                        method7549(arg1, arg2, var25, var26, Statics.field4946[3], var4);
                    } else if (Statics.field3454.field1104 != 0 && var24.field1104 != 0 && Statics.field3454.field1104 == var24.field1104) {
                        method7549(arg1, arg2, var25, var26, Statics.field4946[4], var4);
                    } else if (var24.method2213()) {
                        method7549(arg1, arg2, var25, var26, Statics.field4946[5], var4);
                    } else if (var24.method2183()) {
                        method7549(arg1, arg2, var25, var26, Statics.field4946[6], var4);
                    } else {
                        method7549(arg1, arg2, var25, var26, Statics.field4946[2], var4);
                    }
                }
            }
            if (field508 != 0 && field602 % 20 < 10) {
                if (field508 == 1 && field509 >= 0 && field509 < field546.length) {
                    class96 var27 = field546[field509];
                    if (var27 != null) {
                        int var28 = var27.field1171 / 32 - Statics.field3454.field1171 / 32;
                        int var29 = var27.field1138 / 32 - Statics.field3454.field1138 / 32;
                        method8186(arg1, arg2, var28, var29, Statics.field1348[1], var4);
                    }
                }
                if (field508 == 2) {
                    int var30 = field654 * 4 - Statics.field2850 * 4 + 2 - Statics.field3454.field1171 / 32;
                    int var31 = field512 * 4 - Statics.field2841 * 4 + 2 - Statics.field3454.field1138 / 32;
                    method8186(arg1, arg2, var30, var31, Statics.field1348[1], var4);
                }
                if (field508 == 10 && field510 >= 0 && field510 < field611.length) {
                    class88 var32 = field611[field510];
                    if (var32 != null) {
                        int var33 = var32.field1171 / 32 - Statics.field3454.field1171 / 32;
                        int var34 = var32.field1138 / 32 - Statics.field3454.field1138 / 32;
                        method8186(arg1, arg2, var33, var34, Statics.field1348[1], var4);
                    }
                }
            }
            if (field735 != 0) {
                int var35 = field735 * 4 + 2 - Statics.field3454.field1171 / 32;
                int var36 = field487 * 4 + 2 - Statics.field3454.field1138 / 32;
                method7549(arg1, arg2, var35, var36, Statics.field1348[0], var4);
            }
            if (!Statics.field3454.field1105) {
                class499.method8603(var4.field3477 / 2 + arg1 - 1, var4.field3472 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field707[arg3] = true;
    }

    @ObfuscatedName("ct.nz(Lmq;IIII)V")
    public static final void method2044(class317 arg0, int arg1, int arg2, int arg3) {
        class306 var4 = arg0.method5777(false);
        if (var4 == null) {
            return;
        }
        if (field653 < 3) {
            Statics.field994.method8677(arg1, arg2, var4.field3477, var4.field3472, 25, 25, field758, 256, var4.field3475, var4.field3474);
        } else {
            class499.method8608(arg1, arg2, 0, var4.field3475, var4.field3474);
        }
    }

    @ObfuscatedName("sb.nw(IIIILtq;Lll;I)V")
    public static final void method8186(int arg0, int arg1, int arg2, int arg3, class503 arg4, class306 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method7549(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field758 & 0x7FF;
        int var8 = class219.field2512[var7];
        int var9 = class219.field2516[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3477 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1233.method8706(arg5.field3477 / 2 + arg0 - var17 / 2 + var15, arg5.field3472 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("qc.ns(IIIILtq;Lll;I)V")
    public static final void method7549(int arg0, int arg1, int arg2, int arg3, class503 arg4, class306 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field758 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class219.field2512[var6];
        int var9 = class219.field2516[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method8687(arg5.field3477 / 2 + var10 - arg4.field5092 / 2, arg5.field3472 / 2 - var11 - arg4.field5087 / 2, arg0, arg1, arg5.field3477, arg5.field3472, arg5.field3475, arg5.field3474);
        } else {
            arg4.method8690(arg5.field3477 / 2 + arg0 + var10 - arg4.field5092 / 2, arg5.field3472 / 2 + arg1 - var11 - arg4.field5087 / 2);
        }
    }

    @ObfuscatedName("cz.nd(I)V")
    public static final void method2005() {
        class106.method2906();
        if (Statics.field1426 != null) {
            Statics.field1426.method7114();
        }
    }

    @ObfuscatedName("bt.no(I)V")
    public static final void method716() {
        field692 = field680;
        Statics.field1025 = true;
    }

    @ObfuscatedName("sh.nm(Ljava/lang/String;B)V")
    public static final void method8109(String arg0) {
        if (Statics.field1426 != null) {
            class289 var1 = class289.method5974(class287.field3185, field753.field1385);
            var1.field3212.method8285(class489.method2043(arg0));
            var1.field3212.method8238(arg0);
            field753.method2650(var1);
        }
    }

    @ObfuscatedName("oq.nl(Ljava/lang/String;I)V")
    public static final void method6752(String arg0) {
        if (!arg0.equals("")) {
            class289 var1 = class289.method5974(class287.field3143, field753.field1385);
            var1.field3212.method8285(class489.method2043(arg0));
            var1.field3212.method8238(arg0);
            field753.method2650(var1);
        }
    }

    @ObfuscatedName("jm.nr(I)V")
    public static final void method4636() {
        class289 var0 = class289.method5974(class287.field3143, field753.field1385);
        var0.field3212.method8285(0);
        field753.method2650(var0);
    }

    @ObfuscatedName("fg.nn(III)V")
    public static final void method3137(int arg0, int arg1) {
        class160 var2 = arg0 >= 0 ? field679[arg0] : Statics.field253;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3155()) {
            return;
        }
        class142 var3 = (class142) var2.field1770.get(arg1);
        if (var3.field1650 != -1) {
            return;
        }
        String var4 = var3.field1652.method8841();
        class289 var5 = class289.method5974(class287.field3186, field753.field1385);
        var5.field3212.method8285(3 + class489.method2043(var4));
        var5.field3212.method8285(arg0);
        var5.field3212.method8232(arg1);
        var5.field3212.method8238(var4);
        field753.method2650(var5);
    }

    @ObfuscatedName("kj.na(IIB)V")
    public static final void method5051(int arg0, int arg1) {
        if (field679[arg0] == null || arg1 < 0 || arg1 >= field679[arg0].method3155()) {
            return;
        }
        class142 var2 = (class142) field679[arg0].field1770.get(arg1);
        if (var2.field1650 != -1) {
            return;
        }
        class289 var3 = class289.method5974(class287.field3149, field753.field1385);
        var3.field3212.method8285(3 + class489.method2043(var2.field1652.method8841()));
        var3.field3212.method8285(arg0);
        var3.field3212.method8232(arg1);
        var3.field3212.method8238(var2.field1652.method8841());
        field753.method2650(var3);
    }

    @ObfuscatedName("gv.np(IIZI)V")
    public static final void method3317(int arg0, int arg1, boolean arg2) {
        if (field679[arg0] == null || arg1 < 0 || arg1 >= field679[arg0].method3155()) {
            return;
        }
        class142 var3 = (class142) field679[arg0].field1770.get(arg1);
        class289 var4 = class289.method5974(class287.field3178, field753.field1385);
        var4.field3212.method8285(4 + class489.method2043(var3.field1652.method8841()));
        var4.field3212.method8285(arg0);
        var4.field3212.method8232(arg1);
        var4.field3212.method8237(arg2);
        var4.field3212.method8238(var3.field1652.method8841());
        field753.method2650(var4);
    }

    @ObfuscatedName("ap.ng(Lmq;I)I")
    public static int method345(class317 arg0) {
        class448 var1 = (class448) field703.method7966(((long) arg0.field3570 << 32) + (long) arg0.field3571);
        return var1 == null ? arg0.field3704 : var1.field4744;
    }

    @ObfuscatedName("pm.ny(Lmq;B)Z")
    public static boolean method6973(class317 arg0) {
        return arg0.field3590;
    }

    @ObfuscatedName("lq.nu(Lmq;I)Ljava/lang/String;")
    public static String method5394(class317 arg0) {
        if (class318.method3554(method345(arg0)) == 0) {
            return null;
        } else if (arg0.field3713 == null || arg0.field3713.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3713;
        }
    }

    @ObfuscatedName("gl.nb(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method3335(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field490 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field490 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field490 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field490 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field490 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1404 != null) {
            var3 = "/p=" + Statics.field1404;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1736 + "/a=" + Statics.field4601 + var3 + "/";
    }

    @ObfuscatedName("cv.nf(Ljava/lang/String;ZS)V")
    public static void method1941(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1063; var5++) {
            class202 var6 = class202.method2286(var5);
            if ((!arg1 || var6.field2263) && var6.field2254 == -1 && var6.field2261.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field3040 = -1;
                    Statics.field4549 = null;
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
        Statics.field4549 = var3;
        Statics.field4876 = 0;
        Statics.field3040 = var4;
        String[] var9 = new String[Statics.field3040];
        for (int var10 = 0; var10 < Statics.field3040; var10++) {
            var9[var10] = class202.method2286(var3[var10]).field2261;
        }
        class486.method6248(var9, Statics.field4549);
    }

    @ObfuscatedName("ej.nc(Lsg;IB)V")
    public static void method2720(class489 arg0, int arg1) {
        byte[] var2 = arg0.field4991;
        if (field536 == null) {
            field536 = new byte[24];
        }
        class385.method6906(var2, arg1, field536, 0, 24);
        class170.method3321(arg0, arg1);
    }

    @ObfuscatedName("oa.nj(Lsg;B)V")
    public static void method6891(class489 arg0) {
        if (field536 != null) {
            arg0.method8476(field536, 0, field536.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class170.field1835.method8027(0L);
            class170.field1835.method8031(var1);
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
        arg0.method8476(var1, 0, var1.length);
    }

    @ObfuscatedName("client.nv(I)Ltm;")
    public class513 method1184() {
        return Statics.field3454 == null ? null : Statics.field3454.field1089;
    }

    @ObfuscatedName("jn.nx(II)V")
    public static void method4638(int arg0) {
        field505 = arg0;
    }

    @ObfuscatedName("ad.ne(B)V")
    public static void method325() {
        field753.method2650(class289.method5974(class287.field3102, field753.field1385));
        field505 = 0;
    }

    @ObfuscatedName("gq.nk(B)V")
    public static void method3305() {
        if (field505 == 1) {
            field586 = true;
        }
    }

    @ObfuscatedName("ms.ni(I)V")
    public static void method5962() {
        if (!field586 || Statics.field3454 == null) {
            return;
        }
        int var0 = Statics.field3454.field1174[0];
        int var1 = Statics.field3454.field1176[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field194 = Statics.field3454.field1171;
        int var2 = method3072(Statics.field3454.field1171, Statics.field3454.field1138, Statics.field231) - field771;
        if (var2 < Statics.field1297) {
            Statics.field1297 = var2;
        }
        Statics.field1675 = Statics.field3454.field1138;
        field586 = false;
    }

    @ObfuscatedName("ne.nh(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method6310(String arg0) {
        class339[] var1 = class339.method5985();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class339 var3 = var1[var2];
            if (var3.field4185 != -1 && arg0.startsWith(class97.method6000(var3.field4185))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4185).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dk.nq(I)V")
    public static void method2166() {
        if (Statics.field1586 == null) {
            return;
        }
        field782 = field602;
        Statics.field1586.method6273();
        for (int var0 = 0; var0 < field611.length; var0++) {
            if (field611[var0] != null) {
                Statics.field1586.method6268((field611[var0].field1171 >> 7) + Statics.field2850, (field611[var0].field1138 >> 7) + Statics.field2841);
            }
        }
    }

    @ObfuscatedName("fl.oi(B)Z")
    public static boolean method3014() {
        return Statics.field112.method2347() >= field494;
    }

    @ObfuscatedName("kz.og(II)V")
    public static void method5135(int arg0) {
        if (field765 != arg0) {
            field765 = arg0;
        }
    }

    @ObfuscatedName("gl.ok(B)Z")
    public static boolean method3336() {
        return field511 != null;
    }

    @ObfuscatedName("hf.ov(II)Lsk;")
    public static class483 method3875(int arg0) {
        class483 var1 = (class483) field779.method5119((long) arg0);
        if (var1 == null) {
            var1 = new class483(Statics.field317, class485.method6561(arg0), class485.method7347(arg0));
            field779.method5121(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("ay.od(II)Lsk;")
    public static class483 method92(int arg0) {
        class483 var1 = (class483) field780.method5119((long) arg0);
        if (var1 == null) {
            var1 = new class483(Statics.field317, arg0);
        }
        return var1;
    }

    @ObfuscatedName("fy.ol(I)Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard method3050() {
        return Statics.field466.method513();
    }

    @ObfuscatedName("az.oz(II)V")
    public static void method316(int arg0) {
        class204 var1 = class204.method2139(arg0);
        if (var1.method3816() && class204.method297(var1.field2296) == 2) {
            field783.add(var1.field2296);
        }
    }
}

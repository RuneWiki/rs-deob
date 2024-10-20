package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;

public final class client extends class32 implements class365, OAuthApi {

    @ObfuscatedName("client.w")
    public static class192[] field568 = new class192[4];

    @ObfuscatedName("client.aa")
    public static boolean field491 = true;

    @ObfuscatedName("client.bj")
    public static int field723 = 1;

    @ObfuscatedName("client.bm")
    public static int field668 = 0;

    @ObfuscatedName("client.bo")
    public static int field494 = 0;

    @ObfuscatedName("client.bh")
    public static boolean field495 = false;

    @ObfuscatedName("client.bf")
    public static boolean field503 = false;

    @ObfuscatedName("client.bn")
    public static int field618 = -1;

    @ObfuscatedName("client.bq")
    public static int field498 = -1;

    @ObfuscatedName("client.ba")
    public static int field499 = -1;

    @ObfuscatedName("client.bk")
    public static boolean field500 = false;

    @ObfuscatedName("client.cc")
    public static int field501 = 0;

    @ObfuscatedName("client.cw")
    public static boolean field506 = true;

    @ObfuscatedName("client.cx")
    public static int field507 = 0;

    @ObfuscatedName("client.dr")
    public static long field508 = 1L;

    @ObfuscatedName("client.dd")
    public static int field509 = -1;

    @ObfuscatedName("client.dg")
    public static int field510 = -1;

    @ObfuscatedName("client.de")
    public static long field511 = -1L;

    @ObfuscatedName("client.dp")
    public static boolean field512 = true;

    @ObfuscatedName("client.dx")
    public static int field513 = 0;

    @ObfuscatedName("client.ds")
    public static int field514 = 0;

    @ObfuscatedName("client.dc")
    public static int field515 = 0;

    @ObfuscatedName("client.dm")
    public static int field738 = 0;

    @ObfuscatedName("client.dv")
    public static int field517 = 0;

    @ObfuscatedName("client.da")
    public static int field518 = 0;

    @ObfuscatedName("client.di")
    public static int field519 = 0;

    @ObfuscatedName("client.dt")
    public static int field520 = 0;

    @ObfuscatedName("client.df")
    public static int field521 = 0;

    @ObfuscatedName("client.du")
    public static class95 field588 = class95.field1260;

    @ObfuscatedName("client.dz")
    public static class95 field650 = class95.field1260;

    @ObfuscatedName("client.db")
    public static int field524 = 0;

    @ObfuscatedName("client.dy")
    public static int field683 = 0;

    @ObfuscatedName("client.ec")
    public static int field526 = 0;

    @ObfuscatedName("client.ez")
    public static int field527 = 0;

    @ObfuscatedName("client.eh")
    public static int field674 = 0;

    @ObfuscatedName("client.ev")
    public static int field529 = 0;

    @ObfuscatedName("client.ff")
    public static int field662 = 0;

    @ObfuscatedName("client.fp")
    public static int field531 = 0;

    @ObfuscatedName("client.fo")
    public static class125 field532 = class125.field1496;

    @ObfuscatedName("client.fm")
    public static class442 field533 = class442.field4679;

    @ObfuscatedName("client.fl")
    public String field565;

    @ObfuscatedName("client.fb")
    public class15 field623;

    @ObfuscatedName("client.fe")
    public class20 field691;

    @ObfuscatedName("client.fc")
    public OtlTokenRequester field537;

    @ObfuscatedName("client.fq")
    public Future field600;

    @ObfuscatedName("client.ft")
    public static boolean field539 = false;

    @ObfuscatedName("client.fg")
    public static class71 field522 = new class71();

    @ObfuscatedName("client.gb")
    public class438 field497;

    @ObfuscatedName("client.gi")
    public class8 field542;

    @ObfuscatedName("client.gn")
    public long field543 = -1L;

    @ObfuscatedName("client.gs")
    public static byte[] field574 = null;

    @ObfuscatedName("client.gw")
    public static class92[] field560 = new class92[32768];

    @ObfuscatedName("client.gv")
    public static int field546 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field570 = new int[32768];

    @ObfuscatedName("client.gm")
    public static int field548 = 0;

    @ObfuscatedName("client.go")
    public static int[] field549 = new int[250];

    @ObfuscatedName("client.gp")
    public static final class100 field685 = new class100();

    @ObfuscatedName("client.ga")
    public static int field551 = 0;

    @ObfuscatedName("client.gu")
    public static boolean field552 = false;

    @ObfuscatedName("client.gd")
    public static boolean field553 = true;

    @ObfuscatedName("client.gq")
    public static boolean field554 = false;

    @ObfuscatedName("client.gg")
    public static class355 field555 = new class355();

    @ObfuscatedName("client.hz")
    public static HashMap field556 = new HashMap();

    @ObfuscatedName("client.ht")
    public static int field748 = 0;

    @ObfuscatedName("client.hd")
    public static int field609 = 1;

    @ObfuscatedName("client.hq")
    public static int field559 = 0;

    @ObfuscatedName("client.hw")
    public static int field759 = 1;

    @ObfuscatedName("client.hs")
    public static int field561 = 0;

    @ObfuscatedName("client.hf")
    public static boolean field563 = false;

    @ObfuscatedName("client.hu")
    public static int[][][] field564 = new int[4][13][13];

    @ObfuscatedName("client.hb")
    public static final int[] field749 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.hv")
    public static int field557 = 0;

    @ObfuscatedName("client.it")
    public static String field634 = null;

    @ObfuscatedName("client.io")
    public static int field567 = 2301979;

    @ObfuscatedName("client.iy")
    public static int field671 = 5063219;

    @ObfuscatedName("client.ib")
    public static int field695 = 3353893;

    @ObfuscatedName("client.ir")
    public static int field741 = 7759444;

    @ObfuscatedName("client.iu")
    public static boolean field571 = false;

    @ObfuscatedName("client.is")
    public static int field572 = 0;

    @ObfuscatedName("client.jm")
    public static int field641 = 128;

    @ObfuscatedName("client.jl")
    public static int field730 = 0;

    @ObfuscatedName("client.jp")
    public static int field576 = 0;

    @ObfuscatedName("client.jd")
    public static int field577 = 0;

    @ObfuscatedName("client.jq")
    public static int field578 = 0;

    @ObfuscatedName("client.jv")
    public static int field579 = 0;

    @ObfuscatedName("client.jo")
    public static int field580 = 0;

    @ObfuscatedName("client.jr")
    public static int field581 = 50;

    @ObfuscatedName("client.jy")
    public static int field582 = 0;

    @ObfuscatedName("client.jj")
    public static int field591 = 0;

    @ObfuscatedName("client.ji")
    public static int field490 = 0;

    @ObfuscatedName("client.jb")
    public static int field585 = 12;

    @ObfuscatedName("client.jt")
    public static int field722 = 6;

    @ObfuscatedName("client.ju")
    public static int field587 = 0;

    @ObfuscatedName("client.jn")
    public static boolean field760 = false;

    @ObfuscatedName("client.jh")
    public static int field589 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field590 = false;

    @ObfuscatedName("client.jg")
    public static int field719 = 0;

    @ObfuscatedName("client.je")
    public static int field592 = 0;

    @ObfuscatedName("client.ja")
    public static int field593 = 50;

    @ObfuscatedName("client.js")
    public static int[] field594 = new int[field593];

    @ObfuscatedName("client.kn")
    public static int[] field595 = new int[field593];

    @ObfuscatedName("client.ki")
    public static int[] field596 = new int[field593];

    @ObfuscatedName("client.kg")
    public static int[] field597 = new int[field593];

    @ObfuscatedName("client.ks")
    public static int[] field598 = new int[field593];

    @ObfuscatedName("client.kj")
    public static int[] field599 = new int[field593];

    @ObfuscatedName("client.kf")
    public static int[] field772 = new int[field593];

    @ObfuscatedName("client.kp")
    public static String[] field528 = new String[field593];

    @ObfuscatedName("client.kk")
    public static int[][] field535 = new int[104][104];

    @ObfuscatedName("client.ky")
    public static int field615 = 0;

    @ObfuscatedName("client.kc")
    public static int field604 = -1;

    @ObfuscatedName("client.kw")
    public static int field605 = -1;

    @ObfuscatedName("client.ko")
    public static int field606 = 0;

    @ObfuscatedName("client.kq")
    public static int field607 = 0;

    @ObfuscatedName("client.kb")
    public static int field608 = 0;

    @ObfuscatedName("client.ku")
    public static int field538 = 0;

    @ObfuscatedName("client.kx")
    public static boolean field735 = true;

    @ObfuscatedName("client.kl")
    public static int field611 = 0;

    @ObfuscatedName("client.kt")
    public static int field612 = 0;

    @ObfuscatedName("client.kh")
    public static int field613 = 0;

    @ObfuscatedName("client.kv")
    public static int field614 = 0;

    @ObfuscatedName("client.kr")
    public static int field782 = 0;

    @ObfuscatedName("client.ka")
    public static int field616 = 0;

    @ObfuscatedName("client.kz")
    public static boolean field768 = false;

    @ObfuscatedName("client.lg")
    public static int field781 = 0;

    @ObfuscatedName("client.lx")
    public static int field619 = 0;

    @ObfuscatedName("client.ln")
    public static boolean field620 = true;

    @ObfuscatedName("client.lu")
    public static class85[] field621 = new class85[2048];

    @ObfuscatedName("client.li")
    public static int field622 = -1;

    @ObfuscatedName("client.lq")
    public static int field545 = 0;

    @ObfuscatedName("client.ll")
    public static long field624 = -1L;

    @ObfuscatedName("client.lc")
    public static boolean field502 = true;

    @ObfuscatedName("client.ls")
    public static int field626 = 0;

    @ObfuscatedName("client.lm")
    public static int field627 = 0;

    @ObfuscatedName("client.lo")
    public static int[] field628 = new int[1000];

    @ObfuscatedName("client.lj")
    public static final int[] field740 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.la")
    public static String[] field630 = new String[8];

    @ObfuscatedName("client.ld")
    public static boolean[] field631 = new boolean[8];

    @ObfuscatedName("client.lt")
    public static int[] field584 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.lk")
    public static int field660 = -1;

    @ObfuscatedName("client.lr")
    public static class335[][][] field750 = new class335[4][104][104];

    @ObfuscatedName("client.ms")
    public static class335 field665 = new class335();

    @ObfuscatedName("client.mr")
    public static class335 field636 = new class335();

    @ObfuscatedName("client.mk")
    public static class335 field744 = new class335();

    @ObfuscatedName("client.mq")
    public static int[] field680 = new int[25];

    @ObfuscatedName("client.mn")
    public static int[] field639 = new int[25];

    @ObfuscatedName("client.md")
    public static int[] field777 = new int[25];

    @ObfuscatedName("client.me")
    public static int field661 = 0;

    @ObfuscatedName("client.ma")
    public static boolean field642 = false;

    @ObfuscatedName("client.mp")
    public static int field643 = 0;

    @ObfuscatedName("client.my")
    public static int[] field644 = new int[500];

    @ObfuscatedName("client.mj")
    public static int[] field645 = new int[500];

    @ObfuscatedName("client.mu")
    public static int[] field686 = new int[500];

    @ObfuscatedName("client.mf")
    public static int[] field647 = new int[500];

    @ObfuscatedName("client.mi")
    public static String[] field648 = new String[500];

    @ObfuscatedName("client.mm")
    public static String[] field649 = new String[500];

    @ObfuscatedName("client.mc")
    public static boolean[] field724 = new boolean[500];

    @ObfuscatedName("client.mx")
    public static boolean field651 = false;

    @ObfuscatedName("client.mg")
    public static boolean field638 = false;

    @ObfuscatedName("client.mv")
    public static boolean field558 = false;

    @ObfuscatedName("client.mw")
    public static boolean field654 = true;

    @ObfuscatedName("client.np")
    public static int field672 = -1;

    @ObfuscatedName("client.nr")
    public static int field656 = -1;

    @ObfuscatedName("client.ne")
    public static int field657 = 0;

    @ObfuscatedName("client.nn")
    public static int field658 = 50;

    @ObfuscatedName("client.nz")
    public static int field659 = 0;

    @ObfuscatedName("client.ng")
    public static boolean field655 = false;

    @ObfuscatedName("client.ni")
    public static int field753 = -1;

    @ObfuscatedName("client.ny")
    public static int field663 = -1;

    @ObfuscatedName("client.nx")
    public static String field775 = null;

    @ObfuscatedName("client.nd")
    public static String field653 = null;

    @ObfuscatedName("client.nw")
    public static int field523 = -1;

    @ObfuscatedName("client.nu")
    public static class419 field534 = new class419(8);

    @ObfuscatedName("client.nq")
    public static int field669 = 0;

    @ObfuscatedName("client.nt")
    public static int field629 = -1;

    @ObfuscatedName("client.nb")
    public static int field603 = 0;

    @ObfuscatedName("client.nj")
    public static int field525 = 0;

    @ObfuscatedName("client.ob")
    public static class295 field684 = null;

    @ObfuscatedName("client.oa")
    public static int field566 = 0;

    @ObfuscatedName("client.om")
    public static int field640 = 0;

    @ObfuscatedName("client.oh")
    public static int field676 = 0;

    @ObfuscatedName("client.ox")
    public static int field677 = -1;

    @ObfuscatedName("client.oe")
    public static boolean field678 = false;

    @ObfuscatedName("client.oi")
    public static class295 field679 = null;

    @ObfuscatedName("client.oy")
    public static class295 field721 = null;

    @ObfuscatedName("client.ok")
    public static class295 field681 = null;

    @ObfuscatedName("client.op")
    public static int field682 = 0;

    @ObfuscatedName("client.on")
    public static int field664 = 0;

    @ObfuscatedName("client.oc")
    public static class295 field666 = null;

    @ObfuscatedName("client.ot")
    public static boolean field697 = false;

    @ObfuscatedName("client.oz")
    public static int field774 = -1;

    @ObfuscatedName("client.ou")
    public static int field687 = -1;

    @ObfuscatedName("client.ol")
    public static boolean field688 = false;

    @ObfuscatedName("client.os")
    public static int field689 = -1;

    @ObfuscatedName("client.og")
    public static int field758 = -1;

    @ObfuscatedName("client.oq")
    public static boolean field492 = false;

    @ObfuscatedName("client.ov")
    public static int field692 = 1;

    @ObfuscatedName("client.pu")
    public static int[] field693 = new int[32];

    @ObfuscatedName("client.pt")
    public static int field694 = 0;

    @ObfuscatedName("client.po")
    public static int[] field493 = new int[32];

    @ObfuscatedName("client.pd")
    public static int field696 = 0;

    @ObfuscatedName("client.pp")
    public static int[] field569 = new int[32];

    @ObfuscatedName("client.pe")
    public static int field698 = 0;

    @ObfuscatedName("client.pg")
    public static int[] field699 = new int[32];

    @ObfuscatedName("client.ph")
    public static int field700 = 0;

    @ObfuscatedName("client.pb")
    public static int field701 = 0;

    @ObfuscatedName("client.pn")
    public static int field702 = 0;

    @ObfuscatedName("client.pj")
    public static int field703 = 0;

    @ObfuscatedName("client.pw")
    public static int field704 = 0;

    @ObfuscatedName("client.pa")
    public static int field756 = 0;

    @ObfuscatedName("client.py")
    public static int field706 = 0;

    @ObfuscatedName("client.pc")
    public static int field707 = 0;

    @ObfuscatedName("client.pk")
    public static int field708 = 0;

    @ObfuscatedName("client.pi")
    public static int field544 = 0;

    @ObfuscatedName("client.pr")
    public static class335 field710 = new class335();

    @ObfuscatedName("client.pm")
    public static class335 field711 = new class335();

    @ObfuscatedName("client.pv")
    public static class335 field712 = new class335();

    @ObfuscatedName("client.pq")
    public static class419 field713 = new class419(512);

    @ObfuscatedName("client.qr")
    public static int field714 = 0;

    @ObfuscatedName("client.qf")
    public static int field541 = -2;

    @ObfuscatedName("client.qd")
    public static boolean[] field716 = new boolean[100];

    @ObfuscatedName("client.ql")
    public static boolean[] field717 = new boolean[100];

    @ObfuscatedName("client.qu")
    public static boolean[] field718 = new boolean[100];

    @ObfuscatedName("client.qe")
    public static int[] field646 = new int[100];

    @ObfuscatedName("client.qq")
    public static int[] field720 = new int[100];

    @ObfuscatedName("client.qi")
    public static int[] field673 = new int[100];

    @ObfuscatedName("client.qy")
    public static int[] field617 = new int[100];

    @ObfuscatedName("client.qx")
    public static int field583 = 0;

    @ObfuscatedName("client.qv")
    public static long field602 = 0L;

    @ObfuscatedName("client.qa")
    public static boolean field725 = true;

    @ObfuscatedName("client.qo")
    public static int[] field726 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.qn")
    public static int field727 = 0;

    @ObfuscatedName("client.qz")
    public static int field728 = 0;

    @ObfuscatedName("client.qs")
    public static String field729 = "";

    @ObfuscatedName("client.qt")
    public static long[] field625 = new long[100];

    @ObfuscatedName("client.rq")
    public static int field731 = 0;

    @ObfuscatedName("client.ra")
    public static int field732 = 0;

    @ObfuscatedName("client.re")
    public static int[] field733 = new int[128];

    @ObfuscatedName("client.rn")
    public static int[] field734 = new int[128];

    @ObfuscatedName("client.rj")
    public static long field586 = -1L;

    @ObfuscatedName("client.rw")
    public static class140[] field736 = new class140[3];

    @ObfuscatedName("client.ru")
    public static class149[] field737 = new class149[3];

    @ObfuscatedName("client.rt")
    public static int field715 = -1;

    @ObfuscatedName("client.rx")
    public static int field705 = 0;

    @ObfuscatedName("client.rd")
    public static int[] field779 = new int[1000];

    @ObfuscatedName("client.ri")
    public static int[] field536 = new int[1000];

    @ObfuscatedName("client.rc")
    public static class451[] field742 = new class451[1000];

    @ObfuscatedName("client.rk")
    public static int field540 = 0;

    @ObfuscatedName("client.rf")
    public static int field764 = 0;

    @ObfuscatedName("client.so")
    public static int field745 = 0;

    @ObfuscatedName("client.sb")
    public static int field746 = -1;

    @ObfuscatedName("client.ss")
    public static boolean field747 = false;

    @ObfuscatedName("client.sw")
    public static int field652 = 0;

    @ObfuscatedName("client.sq")
    public static int[] field575 = new int[50];

    @ObfuscatedName("client.sc")
    public static int[] field690 = new int[50];

    @ObfuscatedName("client.sm")
    public static int[] field751 = new int[50];

    @ObfuscatedName("client.sy")
    public static int[] field752 = new int[50];

    @ObfuscatedName("client.sp")
    public static class35[] field530 = new class35[50];

    @ObfuscatedName("client.sa")
    public static boolean field754 = false;

    @ObfuscatedName("client.tu")
    public static boolean field755 = false;

    @ObfuscatedName("client.tx")
    public static boolean[] field547 = new boolean[5];

    @ObfuscatedName("client.th")
    public static int[] field757 = new int[5];

    @ObfuscatedName("client.tl")
    public static int[] field637 = new int[5];

    @ObfuscatedName("client.tb")
    public static int[] field675 = new int[5];

    @ObfuscatedName("client.tm")
    public static int[] field601 = new int[5];

    @ObfuscatedName("client.tk")
    public static short field761 = 256;

    @ObfuscatedName("client.te")
    public static short field762 = 205;

    @ObfuscatedName("client.ts")
    public static short field763 = 256;

    @ObfuscatedName("client.tr")
    public static short field610 = 320;

    @ObfuscatedName("client.tw")
    public static short field765 = 1;

    @ObfuscatedName("client.tg")
    public static short field766 = 32767;

    @ObfuscatedName("client.tt")
    public static short field767 = 1;

    @ObfuscatedName("client.tq")
    public static short field667 = 32767;

    @ObfuscatedName("client.tz")
    public static int field769 = 0;

    @ObfuscatedName("client.to")
    public static int field770 = 0;

    @ObfuscatedName("client.td")
    public static int field771 = 0;

    @ObfuscatedName("client.ty")
    public static int field635 = 0;

    @ObfuscatedName("client.tc")
    public static int field773 = 0;

    @ObfuscatedName("client.uz")
    public static class293 field739 = new class293();

    @ObfuscatedName("client.ue")
    public static int field562 = -1;

    @ObfuscatedName("client.uj")
    public static int field776 = -1;

    @ObfuscatedName("client.um")
    public static class412 field516 = new class410();

    @ObfuscatedName("client.ug")
    public static class325[] field778 = new class325[8];

    @ObfuscatedName("client.uw")
    public static class60 field632 = new class60();

    @ObfuscatedName("client.us")
    public static int field780 = -1;

    @ObfuscatedName("client.uf")
    public static ArrayList field709 = new ArrayList(10);

    @ObfuscatedName("client.uo")
    public static int field633 = 0;

    @ObfuscatedName("client.ul")
    public static int field783 = 0;

    @ObfuscatedName("client.vi")
    public static final class59 field784 = new class59();

    @ObfuscatedName("client.vy")
    public static int[] field785 = new int[50];

    @ObfuscatedName("client.vj")
    public static int[] field786 = new int[50];

    @ObfuscatedName("y.en(I)Lov;")
    public static class414 method297() {
        return Statics.field463;
    }

    @ObfuscatedName("client.av(I)V")
    public final void method450() {
    }

    public final void init() {
        if (!this.method469()) {
            return;
        }
        for (int var1 = 0; var1 <= 27; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field553 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class93.field1239)) {
                            field495 = true;
                        } else {
                            field495 = false;
                        }
                        break;
                    case 4:
                        if (field498 == -1) {
                            field498 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field668 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field3523 = class331.method5496(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field3546 = class304.method327(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class93.field1239)) {
                        }
                        break;
                    case 9:
                        Statics.field869 = var2;
                        break;
                    case 10:
                        Statics.field1306 = (class305) class330.method4919(class305.method1053(), Integer.parseInt(var2));
                        if (Statics.field1306 == class305.field3567) {
                            Statics.field1480 = class422.field4550;
                        } else {
                            Statics.field1480 = class422.field4556;
                        }
                        break;
                    case 11:
                        Statics.field1373 = var2;
                        break;
                    case 12:
                        field723 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field484 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field494 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1837 = var2;
                        break;
                    case 21:
                        field618 = Integer.parseInt(var2);
                        break;
                    case 22:
                        field554 = Integer.parseInt(var2) != 0;
                }
            }
        }
        class234.field2656 = false;
        field503 = false;
        Statics.field86 = this.getCodeBase().getHost();
        String var3 = Statics.field3546.field3558;
        byte var4 = 0;
        try {
            class158.method3451("oldschool", var3, var4, 21);
        } catch (Exception var6) {
            class462.method5173((String) null, var6);
        }
        Statics.field1515 = this;
        Statics.field2258 = field498;
        if (field499 == -1) {
            field499 = 0;
        }
        Statics.field4210 = System.getenv("JX_ACCESS_TOKEN");
        System.getenv("JX_REFRESH_TOKEN");
        this.method445(765, 503, 204);
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field537 = arg0;
            class69.method6209(10);
        }
    }

    public boolean isOnLoginScreen() {
        return field501 == 10;
    }

    public long getAccountHash() {
        return this.field543;
    }

    @ObfuscatedName("client.ey(I)Z")
    public boolean method1449() {
        return Statics.field4210 != null && !Statics.field4210.trim().isEmpty();
    }

    @ObfuscatedName("client.eh(B)Z")
    public boolean method1393() {
        return this.field537 != null;
    }

    @ObfuscatedName("client.ev(Ljava/lang/String;B)V")
    public void method1285(String arg0) throws MalformedURLException, IOException {
        URL var2 = new URL(Statics.field1373 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        OtlTokenRequester var3 = this.field537;
        if (var3 == null) {
            class11 var4 = new class11(var2, class10.field38);
            var4.method72("Authorization", "Bearer " + arg0);
            this.field691 = this.field623.method161(var4);
        } else {
            this.field600 = var3.request(var2);
        }
    }

    @ObfuscatedName("client.e(I)V")
    public final void method421() {
        class353.method1969(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field951 = field494 == 0 ? 43594 : field723 + 40000;
        Statics.field1358 = field494 == 0 ? 443 : field723 + 50000;
        Statics.field4046 = Statics.field951;
        Statics.field3305 = class294.field3309;
        Statics.field1630 = class294.field3310;
        Statics.field2301 = class294.field3311;
        Statics.field2357 = class294.field3313;
        Statics.field1932 = new class102();
        this.method422();
        this.method423();
        Statics.field874 = this.method514();
        Statics.field1967 = new class381(255, class158.field1726, class158.field1727, 500000);
        Statics.field1541 = class90.method3929();
        this.method431();
        class30.method4606(this, Statics.field2190);
        method2703(Statics.field1541.method2147());
        Statics.field399 = new class62(Statics.field1480);
        this.field623 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.z(I)V")
    public final void method442() {
        field507++;
        this.method1270();
        while (true) {
            class335 var1 = class313.field3941;
            class312 var2;
            synchronized (class313.field3941) {
                var2 = (class312) class313.field3940.method5525();
            }
            if (var2 == null) {
                try {
                    if (class274.field3169 == 1) {
                        int var4 = Statics.field3172.method4752();
                        if (var4 > 0 && Statics.field3172.method4735()) {
                            int var5 = var4 - Statics.field3177;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field3172.method4809(var5);
                        } else {
                            Statics.field3172.method4817();
                            Statics.field3172.method4754();
                            if (Statics.field3174 == null) {
                                class274.field3169 = 0;
                            } else {
                                class274.field3169 = 2;
                            }
                            Statics.field3942 = null;
                            Statics.field1686 = null;
                        }
                    }
                } catch (Exception var14) {
                    var14.printStackTrace();
                    Statics.field3172.method4817();
                    class274.field3169 = 0;
                    Statics.field3942 = null;
                    Statics.field1686 = null;
                    Statics.field3174 = null;
                }
                method2576();
                class24 var7 = class24.field126;
                synchronized (class24.field126) {
                    class24.field145++;
                    class24.field142 = class24.field139;
                    class24.field119 = 0;
                    class24.field133 = 0;
                    Arrays.fill(class24.field141, false);
                    Arrays.fill(class24.field132, false);
                    if (class24.field129 < 0) {
                        Arrays.fill(class24.field130, false);
                        class24.field129 = class24.field134;
                    } else {
                        while (class24.field134 != class24.field129) {
                            int var8 = class24.field146[class24.field134];
                            class24.field134 = class24.field134 + 1 & 0x7F;
                            if (var8 < 0) {
                                int var9 = ~var8;
                                if (class24.field130[var9]) {
                                    class24.field130[var9] = false;
                                    class24.field132[var9] = true;
                                    class24.field140[class24.field133] = var9;
                                    class24.field133++;
                                }
                            } else {
                                if (!class24.field130[var8] && class24.field119 < class24.field144.length - 1) {
                                    class24.field141[var8] = true;
                                    class24.field144[++class24.field119 - 1] = var8;
                                }
                                class24.field130[var8] = true;
                            }
                        }
                    }
                    if (class24.field119 > 0) {
                        class24.field145 = 0;
                    }
                    class24.field139 = class24.field143;
                }
                class33.method3142();
                if (Statics.field874 != null) {
                    int var11 = Statics.field874.method302();
                    field544 = var11;
                }
                if (field501 == 0) {
                    method5258();
                    class32.method2497();
                } else if (field501 == 5) {
                    class69.method5998(this, Statics.field68);
                    method5258();
                    class32.method2497();
                } else if (field501 == 10 || field501 == 11) {
                    class69.method5998(this, Statics.field68);
                } else if (field501 == 20) {
                    class69.method5998(this, Statics.field68);
                    this.method1341();
                } else if (field501 == 50) {
                    class69.method5998(this, Statics.field68);
                    this.method1341();
                } else if (field501 == 25) {
                    method1631();
                }
                if (field501 == 30) {
                    this.method1085();
                } else if (field501 == 40 || field501 == 45) {
                    this.method1341();
                }
                return;
            }
            var2.field3932.method5255(var2.field3934, (int) var2.field4410, var2.field3937, false);
        }
    }

    @ObfuscatedName("client.h(ZS)V")
    public final void method473(boolean arg0) {
        boolean var2;
        label143: {
            try {
                if (class274.field3169 == 2) {
                    if (Statics.field3942 == null) {
                        Statics.field3942 = class279.method4930(Statics.field3174, Statics.field4568, Statics.field3175);
                        if (Statics.field3942 == null) {
                            var2 = false;
                            break label143;
                        }
                    }
                    if (Statics.field1686 == null) {
                        Statics.field1686 = new class41(Statics.field3170, Statics.field3176);
                    }
                    if (Statics.field3172.method4730(Statics.field3942, Statics.field3173, Statics.field1686, 22050)) {
                        Statics.field3172.method4731();
                        Statics.field3172.method4809(Statics.field3171);
                        Statics.field3172.method4733(Statics.field3942, Statics.field87);
                        class274.field3169 = 0;
                        Statics.field3942 = null;
                        Statics.field1686 = null;
                        Statics.field3174 = null;
                        var2 = true;
                        break label143;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field3172.method4817();
                class274.field3169 = 0;
                Statics.field3942 = null;
                Statics.field1686 = null;
                Statics.field3174 = null;
            }
            var2 = false;
        }
        if (var2 && field747 && Statics.field147 != null) {
            Statics.field147.method686();
        }
        if ((field501 == 10 || field501 == 20 || field501 == 30) && field602 != 0L && class270.method2724() > field602) {
            method2703(method1550());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field716[var5] = true;
            }
        }
        if (field501 == 0) {
            this.method485(class69.field892, class69.field911, arg0);
        } else if (field501 == 5) {
            class69.method2689(Statics.field2183, Statics.field1371, Statics.field68);
        } else if (field501 == 10 || field501 == 11) {
            class69.method2689(Statics.field2183, Statics.field1371, Statics.field68);
        } else if (field501 == 20) {
            class69.method2689(Statics.field2183, Statics.field1371, Statics.field68);
        } else if (field501 == 50) {
            class69.method2689(Statics.field2183, Statics.field1371, Statics.field68);
        } else if (field501 == 25) {
            if (field561 == 1) {
                if (field748 > field609) {
                    field609 = field748;
                }
                int var6 = (field609 * 50 - field748 * 50) / field609;
                method4903(class309.field3602 + class93.field1238 + class93.field1243 + var6 + "%" + class93.field1241, false);
            } else if (field561 == 2) {
                if (field559 > field759) {
                    field759 = field559;
                }
                int var7 = (field759 * 50 - field559 * 50) / field759 + 50;
                method4903(class309.field3602 + class93.field1238 + class93.field1243 + var7 + "%" + class93.field1241, false);
            } else {
                method4903(class309.field3602, false);
            }
        } else if (field501 == 30) {
            this.method1088();
        } else if (field501 == 40) {
            method4903(class309.field3603 + class93.field1238 + class309.field3604, false);
        } else if (field501 == 45) {
            method4903(class309.field3902, false);
        }
        if (field501 == 30 && field583 == 0 && !arg0 && !field725) {
            for (int var8 = 0; var8 < field714; var8++) {
                if (field717[var8]) {
                    Statics.field4530.method411(field646[var8], field720[var8], field673[var8], field617[var8]);
                    field717[var8] = false;
                }
            }
        } else if (field501 > 0) {
            Statics.field4530.method402(0, 0);
            for (int var9 = 0; var9 < field714; var9++) {
                field717[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method444() {
        if (Statics.field1739.method2310()) {
            Statics.field1739.method2314();
        }
        if (Statics.field1459 != null) {
            Statics.field1459.field1052 = false;
        }
        Statics.field1459 = null;
        field685.method2378();
        class24.method3887();
        class33.method2580();
        Statics.field874 = null;
        if (Statics.field147 != null) {
            Statics.field147.method687();
        }
        if (Statics.field2811 != null) {
            Statics.field2811.method687();
        }
        if (Statics.field4001 != null) {
            Statics.field4001.method2972();
        }
        Object var1 = class313.field3945;
        synchronized (class313.field3945) {
            if (class313.field3946 != 0) {
                class313.field3946 = 1;
                try {
                    class313.field3945.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        if (Statics.field1932 != null) {
            Statics.field1932.method2403();
            Statics.field1932 = null;
        }
        class158.method6079();
        this.field623.method162();
    }

    @ObfuscatedName("as.ff(IB)V")
    public static void method975(int arg0) {
        if (field501 == arg0) {
            return;
        }
        if (field501 == 0) {
            Statics.field1515.method515();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method5513(0);
            field529 = 0;
            field662 = 0;
            field555.method5969(arg0);
            if (arg0 != 20) {
                method5210(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field4074 != null) {
            Statics.field4074.method2972();
            Statics.field4074 = null;
        }
        if (field501 == 25) {
            field561 = 0;
            field748 = 0;
            field609 = 1;
            field559 = 0;
            field759 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = method6228() ? 0 : 12;
            class69.method2816(Statics.field1728, Statics.field1639, true, var2);
        } else if (arg0 == 20) {
            int var1 = field501 == 11 ? 4 : 0;
            class69.method2816(Statics.field1728, Statics.field1639, false, var1);
        } else if (arg0 == 11) {
            class69.method2816(Statics.field1728, Statics.field1639, false, 4);
        } else if (arg0 == 50) {
            class69.method13("", "Updating date of birth...", "");
            class69.method2816(Statics.field1728, Statics.field1639, false, 7);
        } else {
            class69.method3936();
        }
        field501 = arg0;
    }

    @ObfuscatedName("client.fp(I)V")
    public void method1270() {
        if (field501 == 1000) {
            return;
        }
        long var1 = class270.method2724();
        int var3 = (int) (var1 - Statics.field3983);
        Statics.field3983 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class317.field4000 += var3;
        boolean var4;
        if (class317.field3994 == 0 && class317.field3984 == 0 && class317.field3992 == 0 && class317.field3987 == 0) {
            var4 = true;
        } else if (Statics.field4001 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class317.field4000 > 30000) {
                        throw new IOException();
                    }
                    while (class317.field3984 < 200 && class317.field3987 > 0) {
                        class315 var5 = (class315) class317.field3998.method6774();
                        class438 var6 = new class438(4);
                        var6.method6954(1);
                        var6.method6956((int) var5.field4410);
                        Statics.field4001.method2992(var6.field4618, 0, 4);
                        class317.field3988.method6773(var5, var5.field4410);
                        class317.field3987--;
                        class317.field3984++;
                    }
                    while (class317.field3994 < 200 && class317.field3992 > 0) {
                        class315 var7 = (class315) class317.field3990.method5520();
                        class438 var8 = new class438(4);
                        var8.method6954(0);
                        var8.method6956((int) var7.field4410);
                        Statics.field4001.method2992(var8.field4618, 0, 4);
                        var7.method6500();
                        class317.field3993.method6773(var7, var7.field4410);
                        class317.field3992--;
                        class317.field3994++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field4001.method2974();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class317.field4000 = 0;
                        byte var11 = 0;
                        if (Statics.field3157 == null) {
                            var11 = 8;
                        } else if (class317.field3996 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class317.field4003.field4621;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field4001.method2988(class317.field4003.field4618, class317.field4003.field4621, var12);
                            if (class317.field3999 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class317.field4003.field4618[class317.field4003.field4621 + var13] ^= class317.field3999;
                                }
                            }
                            class317.field4003.field4621 += var12;
                            if (class317.field4003.field4621 < var11) {
                                break;
                            }
                            if (Statics.field3157 == null) {
                                class317.field4003.field4621 = 0;
                                int var14 = class317.field4003.method6971();
                                int var15 = class317.field4003.method7148();
                                int var16 = class317.field4003.method6971();
                                int var17 = class317.field4003.method6976();
                                long var18 = (long) ((var14 << 16) + var15);
                                class315 var20 = (class315) class317.field3988.method6772(var18);
                                Statics.field3290 = true;
                                if (var20 == null) {
                                    var20 = (class315) class317.field3993.method6772(var18);
                                    Statics.field3290 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3157 = var20;
                                Statics.field2198 = new class438(var17 + var21 + Statics.field3157.field3962);
                                Statics.field2198.method6954(var16);
                                Statics.field2198.method6957(var17);
                                class317.field3996 = 8;
                                class317.field4003.field4621 = 0;
                            } else if (class317.field3996 == 0) {
                                if (class317.field4003.field4618[0] == -1) {
                                    class317.field3996 = 1;
                                    class317.field4003.field4621 = 0;
                                } else {
                                    Statics.field3157 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2198.field4618.length - Statics.field3157.field3962;
                            int var23 = 512 - class317.field3996;
                            if (var23 > var22 - Statics.field2198.field4621) {
                                var23 = var22 - Statics.field2198.field4621;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field4001.method2988(Statics.field2198.field4618, Statics.field2198.field4621, var23);
                            if (class317.field3999 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2198.field4618[Statics.field2198.field4621 + var24] ^= class317.field3999;
                                }
                            }
                            Statics.field2198.field4621 += var23;
                            class317.field3996 += var23;
                            if (Statics.field2198.field4621 == var22) {
                                if (Statics.field3157.field4410 == 16711935L) {
                                    Statics.field3258 = Statics.field2198;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class314 var26 = class317.field3995[var25];
                                        if (var26 != null) {
                                            Statics.field3258.field4621 = var25 * 8 + 5;
                                            int var27 = Statics.field3258.method6976();
                                            int var28 = Statics.field3258.method6976();
                                            var26.method5279(var27, var28);
                                        }
                                    }
                                } else {
                                    class317.field3997.reset();
                                    class317.field3997.update(Statics.field2198.field4618, 0, var22);
                                    int var29 = (int) class317.field3997.getValue();
                                    if (Statics.field3157.field3963 != var29) {
                                        try {
                                            Statics.field4001.method2972();
                                        } catch (Exception var35) {
                                        }
                                        class317.field3989++;
                                        Statics.field4001 = null;
                                        class317.field3999 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class317.field3989 = 0;
                                    class317.field3985 = 0;
                                    Statics.field3157.field3964.method5274((int) (Statics.field3157.field4410 & 0xFFFFL), Statics.field2198.field4618, (Statics.field3157.field4410 & 0xFF0000L) == 16711680L, Statics.field3290);
                                }
                                Statics.field3157.method6503();
                                if (Statics.field3290) {
                                    class317.field3984--;
                                } else {
                                    class317.field3994--;
                                }
                                class317.field3996 = 0;
                                Statics.field3157 = null;
                                Statics.field2198 = null;
                            } else {
                                if (class317.field3996 != 512) {
                                    break;
                                }
                                class317.field3996 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field4001.method2972();
                } catch (Exception var34) {
                }
                class317.field3985++;
                Statics.field4001 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1349();
        }
    }

    @ObfuscatedName("client.fo(I)V")
    public void method1349() {
        if (class317.field3989 >= 4) {
            this.method430("js5crc");
            method975(1000);
            return;
        }
        if (class317.field3985 >= 4) {
            if (field501 <= 5) {
                this.method430("js5io");
                method975(1000);
                return;
            }
            field526 = 3000;
            class317.field3985 = 3;
        }
        if (--field526 + 1 > 0) {
            return;
        }
        try {
            if (field683 == 0) {
                Statics.field1937 = Statics.field185.method2946(Statics.field86, Statics.field4046);
                field683++;
            }
            if (field683 == 1) {
                if (Statics.field1937.field1779 == 2) {
                    this.method1083(-1);
                    return;
                }
                if (Statics.field1937.field1779 == 1) {
                    field683++;
                }
            }
            if (field683 == 2) {
                if (field553) {
                    Socket var1 = (Socket) Statics.field1937.field1774;
                    class378 var2 = new class378(var1, 40000, 5000);
                    Statics.field402 = var2;
                } else {
                    Statics.field402 = new class162((Socket) Statics.field1937.field1774, Statics.field185, 5000);
                }
                class438 var3 = new class438(5);
                var3.method6954(15);
                var3.method6957(204);
                Statics.field402.method2992(var3.field4618, 0, 5);
                field683++;
                Statics.field150 = class270.method2724();
            }
            if (field683 == 3) {
                if (Statics.field402.method2974() > 0 || !field553 && field501 <= 5) {
                    int var4 = Statics.field402.method2971();
                    if (var4 != 0) {
                        this.method1083(var4);
                        return;
                    }
                    field683++;
                } else if (class270.method2724() - Statics.field150 > 30000L) {
                    this.method1083(-2);
                    return;
                }
            }
            if (field683 == 4) {
                class377 var5 = Statics.field402;
                boolean var6 = field501 > 20;
                if (Statics.field4001 != null) {
                    try {
                        Statics.field4001.method2972();
                    } catch (Exception var21) {
                    }
                    Statics.field4001 = null;
                }
                Statics.field4001 = var5;
                if (Statics.field4001 != null) {
                    try {
                        class438 var8 = new class438(4);
                        var8.method6954(var6 ? 2 : 3);
                        var8.method6956(0);
                        Statics.field4001.method2992(var8.field4618, 0, 4);
                    } catch (IOException var20) {
                        try {
                            Statics.field4001.method2972();
                        } catch (Exception var19) {
                        }
                        class317.field3985++;
                        Statics.field4001 = null;
                    }
                }
                class317.field4003.field4621 = 0;
                Statics.field3157 = null;
                Statics.field2198 = null;
                class317.field3996 = 0;
                while (true) {
                    class315 var11 = (class315) class317.field3988.method6774();
                    if (var11 == null) {
                        while (true) {
                            class315 var12 = (class315) class317.field3993.method6774();
                            if (var12 == null) {
                                if (class317.field3999 != 0) {
                                    try {
                                        class438 var13 = new class438(4);
                                        var13.method6954(4);
                                        var13.method6954(class317.field3999);
                                        var13.method6955(0);
                                        Statics.field4001.method2992(var13.field4618, 0, 4);
                                    } catch (IOException var18) {
                                        try {
                                            Statics.field4001.method2972();
                                        } catch (Exception var17) {
                                        }
                                        class317.field3985++;
                                        Statics.field4001 = null;
                                    }
                                }
                                class317.field4000 = 0;
                                Statics.field3983 = class270.method2724();
                                Statics.field1937 = null;
                                Statics.field402 = null;
                                field683 = 0;
                                field527 = 0;
                                return;
                            }
                            class317.field3990.method5518(var12);
                            class317.field3991.method6773(var12, var12.field4410);
                            class317.field3992++;
                            class317.field3994--;
                        }
                    }
                    class317.field3998.method6773(var11, var11.field4410);
                    class317.field3987++;
                    class317.field3984--;
                }
            }
        } catch (IOException var22) {
            this.method1083(-3);
        }
    }

    @ObfuscatedName("client.fm(IB)V")
    public void method1083(int arg0) {
        Statics.field1937 = null;
        Statics.field402 = null;
        field683 = 0;
        if (Statics.field951 == Statics.field4046) {
            Statics.field4046 = Statics.field1358;
        } else {
            Statics.field4046 = Statics.field951;
        }
        field527++;
        if (field527 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field501 <= 5) {
                this.method430("js5connect_full");
                method975(1000);
            } else {
                field526 = 3000;
            }
        } else if (field527 >= 2 && arg0 == 6) {
            this.method430("js5connect_outofdate");
            method975(1000);
        } else if (field527 >= 4) {
            if (field501 <= 5) {
                this.method430("js5connect");
                method975(1000);
            } else {
                field526 = 3000;
            }
        }
    }

    @ObfuscatedName("c.fu(Llx;Ljava/lang/String;I)V")
    public static void method9(class314 arg0, String arg1) {
        class77 var2 = new class77(arg0, arg1);
        field709.add(var2);
        field783 += var2.field1006;
    }

    @ObfuscatedName("ct.fd(I)Z")
    public static boolean method2064() {
        if (field709 == null || field633 >= field709.size()) {
            return true;
        }
        while (field633 < field709.size()) {
            class77 var0 = (class77) field709.get(field633);
            if (!var0.method1963()) {
                return false;
            }
            field633++;
        }
        return true;
    }

    @ObfuscatedName("fy.fi(B)I")
    public static int method3016() {
        if (field709 == null || field633 >= field709.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field633; var1++) {
            var0 += ((class77) field709.get(var1)).field1008;
        }
        return var0 * 10000 / field783;
    }

    @ObfuscatedName("lx.fa(I)V")
    public static void method5258() {
        if (field524 == 0) {
            Statics.field1005 = new class234(4, 104, 104, class75.field988);
            for (int var0 = 0; var0 < 4; var0++) {
                field568[var0] = new class192(104, 104);
            }
            Statics.field1188 = new class451(512, 512);
            class69.field911 = class309.field3749;
            class69.field892 = 5;
            field524 = 20;
        } else if (field524 == 20) {
            class69.field911 = class309.field3606;
            class69.field892 = 10;
            field524 = 30;
        } else if (field524 == 30) {
            Statics.field148 = method3943(0, false, true, true);
            Statics.field1346 = method3943(1, false, true, true);
            Statics.field48 = method3943(2, true, false, true);
            Statics.field4280 = method3943(3, false, true, true);
            Statics.field1965 = method3943(4, false, true, true);
            Statics.field1288 = method3943(5, true, true, true);
            Statics.field80 = method3943(6, true, true, true);
            Statics.field1212 = method3943(7, false, true, true);
            Statics.field1639 = method3943(8, false, true, true);
            Statics.field3504 = method3943(9, false, true, true);
            Statics.field1728 = method3943(10, false, true, true);
            Statics.field477 = method3943(11, false, true, true);
            Statics.field1687 = method3943(12, false, true, true);
            Statics.field1783 = method3943(13, true, false, true);
            Statics.field3293 = method3943(14, false, true, true);
            Statics.field168 = method3943(15, false, true, true);
            Statics.field444 = method3943(17, true, true, true);
            Statics.field2359 = method3943(18, false, true, true);
            Statics.field826 = method3943(19, false, true, true);
            Statics.field481 = method3943(20, false, true, true);
            class69.field911 = class309.field3661;
            class69.field892 = 20;
            field524 = 40;
        } else if (field524 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field148.method5251() * 4 / 100;
            int var3 = var2 + Statics.field1346.method5251() * 4 / 100;
            int var4 = var3 + Statics.field48.method5251() * 2 / 100;
            int var5 = var4 + Statics.field4280.method5251() * 2 / 100;
            int var6 = var5 + Statics.field1965.method5251() * 6 / 100;
            int var7 = var6 + Statics.field1288.method5251() * 4 / 100;
            int var8 = var7 + Statics.field80.method5251() * 2 / 100;
            int var9 = var8 + Statics.field1212.method5251() * 56 / 100;
            int var10 = var9 + Statics.field1639.method5251() * 2 / 100;
            int var11 = var10 + Statics.field3504.method5251() * 2 / 100;
            int var12 = var11 + Statics.field1728.method5251() * 2 / 100;
            int var13 = var12 + Statics.field477.method5251() * 2 / 100;
            int var14 = var13 + Statics.field1687.method5251() * 2 / 100;
            int var15 = var14 + Statics.field1783.method5251() * 2 / 100;
            int var16 = var15 + Statics.field3293.method5251() * 2 / 100;
            int var17 = var16 + Statics.field168.method5251() * 2 / 100;
            int var18 = var17 + Statics.field826.method5251() / 100;
            int var19 = var18 + Statics.field2359.method5251() / 100;
            int var20 = var19 + Statics.field481.method5251() / 100;
            int var21 = var20 + (Statics.field444.method5250() && Statics.field444.method5374() ? 1 : 0);
            if (var21 == 100) {
                method9(Statics.field148, "Animations");
                method9(Statics.field1346, "Skeletons");
                method9(Statics.field1965, "Sound FX");
                method9(Statics.field1288, "Maps");
                method9(Statics.field80, "Music Tracks");
                method9(Statics.field1212, "Models");
                method9(Statics.field1639, "Sprites");
                method9(Statics.field477, "Music Jingles");
                method9(Statics.field3293, "Music Samples");
                method9(Statics.field168, "Music Patches");
                method9(Statics.field826, "World Map");
                method9(Statics.field2359, "World Map Geography");
                method9(Statics.field481, "World Map Ground");
                Statics.field4059 = new class383();
                Statics.field4059.method6277(Statics.field444);
                class69.field911 = class309.field3609;
                class69.field892 = 30;
                field524 = 45;
            } else {
                if (var21 != 0) {
                    class69.field911 = class309.field3608 + var21 + "%";
                }
                class69.field892 = 30;
            }
        } else if (field524 == 45) {
            class38.method1990(22050, !field503, 2);
            class275 var22 = new class275();
            var22.method4736(9, 128);
            Statics.field147 = class38.method4973(Statics.field185, 0, 22050);
            Statics.field147.method683(var22);
            class274.method3927(Statics.field168, Statics.field3293, Statics.field1965, var22);
            Statics.field2811 = class38.method4973(Statics.field185, 1, 2048);
            Statics.field1985 = new class34();
            Statics.field2811.method683(Statics.field1985);
            Statics.field2355 = new class51(22050, Statics.field269);
            class69.field911 = class309.field3610;
            class69.field892 = 35;
            field524 = 50;
            Statics.field2349 = new class415(Statics.field1639, Statics.field1783);
        } else if (field524 == 50) {
            class416[] var23 = new class416[] { class416.field4527, class416.field4523, class416.field4521, class416.field4529, class416.field4522, class416.field4524 };
            int var24 = var23.length;
            class415 var25 = Statics.field2349;
            class416[] var26 = new class416[] { class416.field4527, class416.field4523, class416.field4521, class416.field4529, class416.field4522, class416.field4524 };
            field556 = var25.method6739(var26);
            if (field556.size() < var24) {
                class69.field911 = class309.field3834 + field556.size() * 100 / var24 + "%";
                class69.field892 = 40;
            } else {
                Statics.field1371 = (class344) field556.get(class416.field4527);
                Statics.field68 = (class344) field556.get(class416.field4529);
                Statics.field2183 = (class344) field556.get(class416.field4522);
                Statics.field3015 = field516.method6511();
                class69.field911 = class309.field3621;
                class69.field892 = 40;
                field524 = 60;
            }
        } else if (field524 == 60) {
            class314 var27 = Statics.field1728;
            class314 var28 = Statics.field1639;
            int var29 = 0;
            String[] var30 = class69.field918;
            for (int var31 = 0; var31 < var30.length; var31++) {
                String var32 = var30[var31];
                if (var27.method5346(var32, "")) {
                    var29++;
                }
            }
            String[] var33 = class69.field919;
            for (int var34 = 0; var34 < var33.length; var34++) {
                String var35 = var33[var34];
                if (var28.method5346(var35, "")) {
                    var29++;
                }
            }
            int var38 = class69.field919.length + class69.field918.length;
            if (var29 < var38) {
                class69.field911 = class309.field3613 + var29 * 100 / var38 + "%";
                class69.field892 = 50;
            } else {
                class69.field911 = class309.field3614;
                class69.field892 = 50;
                method975(5);
                field524 = 70;
            }
        } else if (field524 == 70) {
            if (Statics.field48.method5374()) {
                class314 var40 = Statics.field48;
                Statics.field2134 = var40;
                class314 var41 = Statics.field48;
                Statics.field1959 = var41;
                class314 var42 = Statics.field48;
                class314 var43 = Statics.field1212;
                Statics.field1853 = var42;
                Statics.field1649 = var43;
                Statics.field1852 = Statics.field1853.method5305(3);
                class314 var44 = Statics.field48;
                class314 var45 = Statics.field1212;
                boolean var46 = field503;
                Statics.field2199 = var44;
                Statics.field2045 = var45;
                class188.field2038 = var46;
                class179.method3121(Statics.field48, Statics.field1212);
                class314 var47 = Statics.field48;
                Statics.field1986 = var47;
                class189.method3006(Statics.field48, Statics.field1212, field495, Statics.field1371);
                class191.method2674(Statics.field48, Statics.field148, Statics.field1346);
                class314 var48 = Statics.field48;
                class314 var49 = Statics.field1212;
                Statics.field1943 = var48;
                Statics.field1945 = var49;
                class314 var50 = Statics.field48;
                Statics.field58 = var50;
                class314 var51 = Statics.field48;
                Statics.field1805 = var51;
                Statics.field1808 = Statics.field1805.method5305(16);
                class295.method4438(Statics.field4280, Statics.field1212, Statics.field1639, Statics.field1783);
                class170.method4028(Statics.field48);
                class177.method352(Statics.field48);
                class314 var52 = Statics.field48;
                Statics.field4331 = var52;
                class183.method6308(Statics.field48);
                class314 var53 = Statics.field48;
                Statics.field1977 = var53;
                Statics.field461 = new class427(Statics.field1306, 54, Statics.field3523, Statics.field48);
                Statics.field3272 = new class427(Statics.field1306, 47, Statics.field3523, Statics.field48);
                Statics.field1739 = new class98();
                class187.method2468(Statics.field48, Statics.field1639, Statics.field1783);
                class175.method2470(Statics.field48, Statics.field1639);
                class172.method2864(Statics.field48, Statics.field1639);
                class69.field911 = class309.field3616;
                class69.field892 = 60;
                field524 = 80;
            } else {
                class69.field911 = class309.field3615 + Statics.field48.method5260() + "%";
                class69.field892 = 60;
            }
        } else if (field524 == 80) {
            int var54 = 0;
            if (Statics.field73 == null) {
                Statics.field73 = class452.method35(Statics.field1639, Statics.field4059.field4317, 0);
            } else {
                var54++;
            }
            if (Statics.field160 == null) {
                Statics.field160 = class452.method35(Statics.field1639, Statics.field4059.field4315, 0);
            } else {
                var54++;
            }
            if (Statics.field4326 == null) {
                class314 var55 = Statics.field1639;
                int var56 = Statics.field4059.field4325;
                byte[] var57 = var55.method5296(var56, 0);
                boolean var58;
                if (var57 == null) {
                    var58 = false;
                } else {
                    class452.method3692(var57);
                    var58 = true;
                }
                class450[] var59;
                if (var58) {
                    class450[] var60 = new class450[Statics.field4722];
                    for (int var61 = 0; var61 < Statics.field4722; var61++) {
                        class450 var62 = var60[var61] = new class450();
                        var62.field4707 = Statics.field4726;
                        var62.field4701 = Statics.field4723;
                        var62.field4705 = Statics.field4724[var61];
                        var62.field4706 = Statics.field3158[var61];
                        var62.field4703 = Statics.field4725[var61];
                        var62.field4704 = Statics.field4727[var61];
                        var62.field4702 = Statics.field3965;
                        var62.field4708 = Statics.field4251[var61];
                    }
                    class452.method5248();
                    var59 = var60;
                } else {
                    var59 = null;
                }
                Statics.field4326 = var59;
            } else {
                var54++;
            }
            if (Statics.field1675 == null) {
                Statics.field1675 = class452.method6880(Statics.field1639, Statics.field4059.field4314, 0);
            } else {
                var54++;
            }
            if (Statics.field2854 == null) {
                Statics.field2854 = class452.method6880(Statics.field1639, Statics.field4059.field4323, 0);
            } else {
                var54++;
            }
            if (Statics.field1802 == null) {
                Statics.field1802 = class452.method6880(Statics.field1639, Statics.field4059.field4319, 0);
            } else {
                var54++;
            }
            if (Statics.field2212 == null) {
                Statics.field2212 = class452.method6880(Statics.field1639, Statics.field4059.field4320, 0);
            } else {
                var54++;
            }
            if (Statics.field53 == null) {
                Statics.field53 = class452.method6880(Statics.field1639, Statics.field4059.field4321, 0);
            } else {
                var54++;
            }
            if (Statics.field443 == null) {
                Statics.field443 = class452.method6880(Statics.field1639, Statics.field4059.field4322, 0);
            } else {
                var54++;
            }
            if (Statics.field178 == null) {
                class314 var64 = Statics.field1639;
                int var65 = Statics.field4059.field4316;
                byte[] var66 = var64.method5296(var65, 0);
                boolean var67;
                if (var66 == null) {
                    var67 = false;
                } else {
                    class452.method3692(var66);
                    var67 = true;
                }
                class450[] var68;
                if (var67) {
                    class450[] var69 = new class450[Statics.field4722];
                    for (int var70 = 0; var70 < Statics.field4722; var70++) {
                        class450 var71 = var69[var70] = new class450();
                        var71.field4707 = Statics.field4726;
                        var71.field4701 = Statics.field4723;
                        var71.field4705 = Statics.field4724[var70];
                        var71.field4706 = Statics.field3158[var70];
                        var71.field4703 = Statics.field4725[var70];
                        var71.field4704 = Statics.field4727[var70];
                        var71.field4702 = Statics.field3965;
                        var71.field4708 = Statics.field4251[var70];
                    }
                    class452.method5248();
                    var68 = var69;
                } else {
                    var68 = null;
                }
                Statics.field178 = var68;
            } else {
                var54++;
            }
            if (Statics.field297 == null) {
                class314 var73 = Statics.field1639;
                int var74 = Statics.field4059.field4324;
                byte[] var75 = var73.method5296(var74, 0);
                boolean var76;
                if (var75 == null) {
                    var76 = false;
                } else {
                    class452.method3692(var75);
                    var76 = true;
                }
                class450[] var77;
                if (var76) {
                    class450[] var78 = new class450[Statics.field4722];
                    for (int var79 = 0; var79 < Statics.field4722; var79++) {
                        class450 var80 = var78[var79] = new class450();
                        var80.field4707 = Statics.field4726;
                        var80.field4701 = Statics.field4723;
                        var80.field4705 = Statics.field4724[var79];
                        var80.field4706 = Statics.field3158[var79];
                        var80.field4703 = Statics.field4725[var79];
                        var80.field4704 = Statics.field4727[var79];
                        var80.field4702 = Statics.field3965;
                        var80.field4708 = Statics.field4251[var79];
                    }
                    class452.method5248();
                    var77 = var78;
                } else {
                    var77 = null;
                }
                Statics.field297 = var77;
            } else {
                var54++;
            }
            if (var54 < 11) {
                class69.field911 = class309.field3617 + var54 * 100 / 12 + "%";
                class69.field892 = 70;
            } else {
                Statics.field4119 = Statics.field297;
                Statics.field160.method7370();
                int var82 = (int) (Math.random() * 21.0D) - 10;
                int var83 = (int) (Math.random() * 21.0D) - 10;
                int var84 = (int) (Math.random() * 21.0D) - 10;
                int var85 = (int) (Math.random() * 41.0D) - 20;
                Statics.field4326[0].method7340(var82 + var85, var83 + var85, var84 + var85);
                class69.field911 = class309.field3837;
                class69.field892 = 70;
                field524 = 90;
            }
        } else if (field524 == 90) {
            if (Statics.field3504.method5374()) {
                Statics.field1583 = new class239(Statics.field3504, Statics.field1639, 20, Statics.field1541.method2136(), field503 ? 64 : 128);
                class231.method4200(Statics.field1583);
                class231.method4131(Statics.field1541.method2136());
                field524 = 100;
            } else {
                class69.field911 = class309.field3619 + "0%";
                class69.field892 = 90;
            }
        } else if (field524 == 100) {
            int var86 = Statics.field1583.method4454();
            if (var86 < 100) {
                class69.field911 = class309.field3619 + var86 + "%";
                class69.field892 = 90;
            } else {
                class69.field911 = class309.field3831;
                class69.field892 = 90;
                field524 = 110;
            }
        } else if (field524 == 110) {
            Statics.field1459 = new class82();
            Statics.field185.method2941(Statics.field1459, 10);
            class69.field911 = class309.field3659;
            class69.field892 = 92;
            field524 = 120;
        } else if (field524 == 120) {
            if (Statics.field1728.method5346("huffman", "")) {
                class282 var87 = new class282(Statics.field1728.method5314("huffman", ""));
                Statics.field3263 = var87;
                class69.field911 = class309.field3716;
                class69.field892 = 94;
                field524 = 130;
            } else {
                class69.field911 = class309.field3622 + "%";
                class69.field892 = 94;
            }
        } else if (field524 == 130) {
            if (!Statics.field4280.method5374()) {
                class69.field911 = class309.field3624 + Statics.field4280.method5260() * 4 / 5 + "%";
                class69.field892 = 96;
            } else if (!Statics.field1687.method5374()) {
                class69.field911 = class309.field3624 + (80 + Statics.field1687.method5260() / 6) + "%";
                class69.field892 = 96;
            } else if (Statics.field1783.method5374()) {
                class69.field911 = class309.field3870;
                class69.field892 = 98;
                field524 = 140;
            } else {
                class69.field911 = class309.field3624 + (96 + Statics.field1783.method5260() / 50) + "%";
                class69.field892 = 96;
            }
        } else if (field524 == 140) {
            class69.field892 = 100;
            if (Statics.field826.method5316(class220.field2414.field2416)) {
                if (Statics.field463 == null) {
                    Statics.field463 = new class414();
                    Statics.field463.method6542(Statics.field826, Statics.field2359, Statics.field481, Statics.field2183, field556, Statics.field4326);
                }
                class69.field911 = class309.field3787;
                field524 = 150;
            } else {
                class69.field911 = class309.field3626 + Statics.field826.method5318(class220.field2414.field2416) / 10 + "%";
            }
        } else if (field524 == 150) {
            method975(10);
        }
    }

    @ObfuscatedName("hm.fn(IZZZB)Llx;")
    public static class314 method3943(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class381 var4 = null;
        if (class158.field1726 != null) {
            var4 = new class381(arg0, class158.field1726, Statics.field1398[arg0], 1000000);
        }
        return new class314(var4, Statics.field1967, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fx(I)V")
    public final void method1341() {
        class377 var1 = field685.method2380();
        class437 var2 = field685.field1319;
        try {
            if (field674 == 0) {
                if (Statics.field4140 == null && (field522.method1891() || field529 > 250)) {
                    Statics.field4140 = field522.method1892();
                    field522.method1889();
                    field522 = null;
                }
                if (Statics.field4140 != null) {
                    if (var1 != null) {
                        var1.method2972();
                        var1 = null;
                    }
                    Statics.field979 = null;
                    field552 = false;
                    field529 = 0;
                    if (field533.method7224()) {
                        try {
                            this.method1285(Statics.field4210);
                            method5513(20);
                        } catch (Throwable var76) {
                            class462.method5173((String) null, var76);
                            method1020(65);
                            return;
                        }
                    } else {
                        method5513(1);
                    }
                }
            }
            if (field674 == 20) {
                if (this.field600 == null) {
                    if (this.field691 == null) {
                        method1020(65);
                        return;
                    }
                    if (!this.field691.method263()) {
                        return;
                    }
                    if (this.field691.method278()) {
                        class462.method5173(this.field691.method266(), (Throwable) null);
                        method1020(65);
                        this.field691 = null;
                        return;
                    }
                    class22 var6 = this.field691.method269();
                    if (var6.method294() != 200) {
                        class462.method5173("Response code: " + var6.method294() + "Response body: " + var6.method292(), (Throwable) null);
                        method1020(65);
                        this.field691 = null;
                        return;
                    }
                    this.field565 = var6.method292();
                    this.field691 = null;
                } else if (this.field600.isDone()) {
                    if (this.field600.isCancelled()) {
                        method1020(65);
                        this.field600 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var4 = (OtlTokenResponse) this.field600.get();
                        if (!var4.isSuccess()) {
                            method1020(65);
                            this.field600 = null;
                            return;
                        }
                        this.field565 = var4.getToken();
                        this.field600 = null;
                    } catch (Exception var75) {
                        class462.method5173((String) null, var75);
                        method1020(65);
                        this.field600 = null;
                        return;
                    }
                } else {
                    return;
                }
                field529 = 0;
                method5513(1);
            }
            if (field674 == 1) {
                if (Statics.field979 == null) {
                    Statics.field979 = Statics.field185.method2946(Statics.field86, Statics.field4046);
                }
                if (Statics.field979.field1779 == 2) {
                    throw new IOException();
                }
                if (Statics.field979.field1779 == 1) {
                    if (field553) {
                        Socket var7 = (Socket) Statics.field979.field1774;
                        class378 var8 = new class378(var7, 40000, 5000);
                        var1 = var8;
                    } else {
                        var1 = new class162((Socket) Statics.field979.field1774, Statics.field185, 5000);
                    }
                    field685.method2396(var1);
                    Statics.field979 = null;
                    method5513(2);
                }
            }
            if (field674 == 2) {
                field685.method2392();
                class265 var9;
                if (class265.field3018 == 0) {
                    var9 = new class265();
                } else {
                    var9 = class265.field3021[--class265.field3018];
                }
                var9.field3022 = null;
                var9.field3017 = 0;
                var9.field3019 = new class437(5000);
                var9.field3019.method6954(class267.field3138.field3136);
                field685.method2395(var9);
                field685.method2375();
                var2.field4621 = 0;
                method5513(3);
            }
            if (field674 == 3) {
                if (Statics.field147 != null) {
                    Statics.field147.method685();
                }
                if (Statics.field2811 != null) {
                    Statics.field2811.method685();
                }
                boolean var13 = true;
                if (field553 && !var1.method2987(1)) {
                    var13 = false;
                }
                if (var13) {
                    int var14 = var1.method2971();
                    if (Statics.field147 != null) {
                        Statics.field147.method685();
                    }
                    if (Statics.field2811 != null) {
                        Statics.field2811.method685();
                    }
                    if (var14 != 0) {
                        method1020(var14);
                        return;
                    }
                    var2.field4621 = 0;
                    method5513(4);
                }
            }
            if (field674 == 4) {
                if (var2.field4621 < 8) {
                    int var15 = var1.method2974();
                    if (var15 > 8 - var2.field4621) {
                        var15 = 8 - var2.field4621;
                    }
                    if (var15 > 0) {
                        var1.method2988(var2.field4618, var2.field4621, var15);
                        var2.field4621 += var15;
                    }
                }
                if (var2.field4621 == 8) {
                    var2.field4621 = 0;
                    Statics.field3130 = var2.method7003();
                    method5513(5);
                }
            }
            if (field674 == 5) {
                field685.field1319.field4621 = 0;
                field685.method2392();
                class437 var16 = new class437(500);
                int[] var17 = new int[] { Statics.field4140.nextInt(), Statics.field4140.nextInt(), Statics.field4140.nextInt(), Statics.field4140.nextInt() };
                var16.field4621 = 0;
                var16.method6954(1);
                var16.method6957(var17[0]);
                var16.method6957(var17[1]);
                var16.method6957(var17[2]);
                var16.method6957(var17[3]);
                var16.method6959(Statics.field3130);
                if (field501 == 40) {
                    var16.method6957(Statics.field2818[0]);
                    var16.method6957(Statics.field2818[1]);
                    var16.method6957(Statics.field2818[2]);
                    var16.method6957(Statics.field2818[3]);
                } else {
                    if (field501 == 50) {
                        var16.method6954(class125.field1498.method38());
                        var16.method6957(Statics.field2322);
                    } else {
                        var16.method6954(field532.method38());
                        switch(field532.field1494) {
                            case 1:
                                var16.field4621 += 4;
                                break;
                            case 2:
                            case 3:
                                var16.method6956(Statics.field2387);
                                var16.field4621++;
                                break;
                            case 4:
                                LinkedHashMap var19 = Statics.field1541.field1220;
                                String var20 = class69.field914;
                                int var21 = var20.length();
                                int var22 = 0;
                                for (int var23 = 0; var23 < var21; var23++) {
                                    var22 = (var22 << 5) - var22 + var20.charAt(var23);
                                }
                                var16.method6957((Integer) var19.get(var22));
                        }
                    }
                    if (field533.method7224()) {
                        var16.method6954(class442.field4672.method38());
                        var16.method7142(this.field565);
                    } else {
                        var16.method6954(class442.field4679.method38());
                        var16.method7142(class69.field895);
                    }
                }
                var16.method6995(class68.field883, class68.field881);
                Statics.field2818 = var17;
                class265 var25;
                if (class265.field3018 == 0) {
                    var25 = new class265();
                } else {
                    var25 = class265.field3021[--class265.field3018];
                }
                var25.field3022 = null;
                var25.field3017 = 0;
                var25.field3019 = new class437(5000);
                var25.field3019.field4621 = 0;
                if (field501 == 40) {
                    var25.field3019.method6954(class267.field3134.field3136);
                } else {
                    var25.field3019.method6954(class267.field3133.field3136);
                }
                var25.field3019.method6955(0);
                int var29 = var25.field3019.field4621;
                var25.field3019.method6957(204);
                var25.field3019.method6957(1);
                var25.field3019.method6954(field498);
                var25.field3019.method6954(field499);
                var25.field3019.method6964(var16.field4618, 0, var16.field4621);
                int var30 = var25.field3019.field4621;
                var25.field3019.method7142(class69.field914);
                var25.field3019.method6954((field725 ? 1 : 0) << 1 | (field503 ? 1 : 0));
                var25.field3019.method6955(Statics.field1798);
                var25.field3019.method6955(Statics.field4019);
                class437 var31 = var25.field3019;
                if (field574 == null) {
                    byte[] var32 = new byte[24];
                    try {
                        class158.field1725.method6829(0L);
                        class158.field1725.method6831(var32);
                        int var33;
                        for (var33 = 0; var33 < 24 && var32[var33] == 0; var33++) {
                        }
                        if (var33 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var77) {
                        for (int var35 = 0; var35 < 24; var35++) {
                            var32[var35] = -1;
                        }
                    }
                    var31.method6964(var32, 0, var32.length);
                } else {
                    var31.method6964(field574, 0, field574.length);
                }
                if (!Statics.field869.endsWith(";A")) {
                    Statics.field869 = Statics.field869 + ";A";
                }
                var25.field3019.method7142(Statics.field869);
                var25.field3019.method6957(Statics.field484);
                class438 var38 = new class438(Statics.field3015.method6518());
                Statics.field3015.method6517(var38);
                var25.field3019.method6964(var38.field4618, 0, var38.field4618.length);
                var25.field3019.method6954(field498);
                var25.field3019.method6957(0);
                var25.field3019.method6957(Statics.field477.field3979);
                var25.field3019.method7018(Statics.field481.field3979);
                var25.field3019.method7164(Statics.field3293.field3979);
                var25.field3019.method6957(Statics.field1639.field3979);
                var25.field3019.method7164(Statics.field48.field3979);
                var25.field3019.method7164(Statics.field826.field3979);
                var25.field3019.method7018(0);
                var25.field3019.method7020(Statics.field1965.field3979);
                var25.field3019.method6957(Statics.field3504.field3979);
                var25.field3019.method7164(Statics.field1728.field3979);
                var25.field3019.method6957(Statics.field1783.field3979);
                var25.field3019.method7018(Statics.field2359.field3979);
                var25.field3019.method7018(Statics.field168.field3979);
                var25.field3019.method7020(Statics.field1212.field3979);
                var25.field3019.method7020(Statics.field80.field3979);
                var25.field3019.method6957(Statics.field1288.field3979);
                var25.field3019.method7018(Statics.field4280.field3979);
                var25.field3019.method7020(Statics.field1346.field3979);
                var25.field3019.method7018(Statics.field444.field3979);
                var25.field3019.method7164(Statics.field148.field3979);
                var25.field3019.method6957(Statics.field1687.field3979);
                var25.field3019.method6993(var17, var30, var25.field3019.field4621);
                var25.field3019.method6994(var25.field3019.field4621 - var29);
                field685.method2395(var25);
                field685.method2375();
                field685.field1328 = new class454(var17);
                int[] var39 = new int[4];
                for (int var40 = 0; var40 < 4; var40++) {
                    var39[var40] = var17[var40] + 50;
                }
                var2.method6918(var39);
                method5513(6);
            }
            if (field674 == 6 && var1.method2974() > 0) {
                int var41 = var1.method2971();
                if (var41 == 61) {
                    int var42 = var1.method2974();
                    Statics.field505 = var42 == 1 && var1.method2971() == 1;
                    method5513(5);
                }
                if (var41 == 21 && field501 == 20) {
                    method5513(12);
                } else if (var41 == 2) {
                    method5513(14);
                } else if (var41 == 15 && field501 == 40) {
                    field685.field1321 = -1;
                    method5513(19);
                } else if (var41 == 64) {
                    method5513(10);
                } else if (var41 == 23 && field662 < 1) {
                    field662++;
                    method5513(0);
                } else if (var41 == 29) {
                    method5513(17);
                } else if (var41 == 69) {
                    method5513(7);
                } else {
                    method1020(var41);
                    return;
                }
            }
            if (field674 == 7 && var1.method2974() >= 2) {
                var1.method2988(var2.field4618, 0, 2);
                var2.field4621 = 0;
                Statics.field2817 = var2.method7148();
                method5513(8);
            }
            if (field674 == 8 && var1.method2974() >= Statics.field2817) {
                var2.field4621 = 0;
                var1.method2988(var2.field4618, var2.field4621, Statics.field2817);
                class7[] var43 = new class7[] { class7.field15 };
                class7 var44 = var43[var2.method6971()];
                try {
                    switch(var44.field13) {
                        case 0:
                            class1 var45 = new class1();
                            this.field542 = new class8(var2, var45);
                            method5513(9);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var74) {
                    method1020(22);
                    return;
                }
            }
            if (field674 == 9 && this.field542.method41()) {
                this.field497 = this.field542.method43();
                this.field542.method45();
                this.field542 = null;
                if (this.field497 == null) {
                    method1020(22);
                    return;
                }
                field685.method2392();
                class265 var48;
                if (class265.field3018 == 0) {
                    var48 = new class265();
                } else {
                    var48 = class265.field3021[--class265.field3018];
                }
                var48.field3022 = null;
                var48.field3017 = 0;
                var48.field3019 = new class437(5000);
                var48.field3019.method6954(class267.field3135.field3136);
                var48.field3019.method6955(this.field497.field4621);
                var48.field3019.method6965(this.field497);
                field685.method2395(var48);
                field685.method2375();
                this.field497 = null;
                method5513(6);
            }
            if (field674 == 10 && var1.method2974() > 0) {
                Statics.field55 = var1.method2971();
                method5513(11);
            }
            if (field674 == 11 && var1.method2974() >= Statics.field55) {
                var1.method2988(var2.field4618, 0, Statics.field55);
                var2.field4621 = 0;
                method5513(6);
            }
            if (field674 == 12 && var1.method2974() > 0) {
                field531 = (var1.method2971() + 3) * 60;
                method5513(13);
            }
            if (field674 == 13) {
                field529 = 0;
                class69.method13(class309.field3623, class309.field3634, field531 / 60 + class309.field3688);
                if (--field531 <= 0) {
                    method5513(0);
                }
            } else {
                if (field674 == 14 && var1.method2974() >= 1) {
                    Statics.field4373 = var1.method2971();
                    method5513(15);
                }
                if (field674 == 15 && var1.method2974() >= Statics.field4373) {
                    boolean var52 = var1.method2971() == 1;
                    var1.method2988(var2.field4618, 0, 4);
                    var2.field4621 = 0;
                    boolean var53 = false;
                    if (var52) {
                        int var54 = var2.method6926() << 24;
                        int var55 = var54 | var2.method6926() << 16;
                        int var56 = var55 | var2.method6926() << 8;
                        int var57 = var56 | var2.method6926();
                        String var58 = class69.field914;
                        int var59 = var58.length();
                        int var60 = 0;
                        int var61 = 0;
                        while (true) {
                            if (var61 >= var59) {
                                if (Statics.field1541.field1220.size() >= 10 && !Statics.field1541.field1220.containsKey(var60)) {
                                    Iterator var64 = Statics.field1541.field1220.entrySet().iterator();
                                    var64.next();
                                    var64.remove();
                                }
                                Statics.field1541.field1220.put(var60, var57);
                                break;
                            }
                            var60 = (var60 << 5) - var60 + var58.charAt(var61);
                            var61++;
                        }
                    }
                    if (field539) {
                        Statics.field1541.method2182(class69.field914);
                    } else {
                        Statics.field1541.method2182((String) null);
                    }
                    class90.method562();
                    field676 = var1.method2971();
                    field678 = var1.method2971() == 1;
                    field622 = var1.method2971();
                    field622 <<= 0x8;
                    field622 += var1.method2971();
                    field545 = var1.method2971();
                    var1.method2988(var2.field4618, 0, 8);
                    var2.field4621 = 0;
                    this.field543 = var2.method7003();
                    if (Statics.field4373 >= 29) {
                        var1.method2988(var2.field4618, 0, 8);
                        var2.field4621 = 0;
                        field624 = var2.method7003();
                    }
                    var1.method2988(var2.field4618, 0, 1);
                    var2.field4621 = 0;
                    class266[] var65 = class266.method2011();
                    int var66 = var2.method6920();
                    if (var66 < 0 || var66 >= var65.length) {
                        throw new IOException(var66 + " " + var2.field4621);
                    }
                    field685.field1320 = var65[var66];
                    field685.field1321 = field685.field1320.field3066;
                    var1.method2988(var2.field4618, 0, 2);
                    var2.field4621 = 0;
                    field685.field1321 = var2.method7148();
                    try {
                        class28.method378(Statics.field1515, "zap");
                    } catch (Throwable var73) {
                    }
                    method5513(16);
                }
                if (field674 != 16) {
                    if (field674 == 17 && var1.method2974() >= 2) {
                        var2.field4621 = 0;
                        var1.method2988(var2.field4618, 0, 2);
                        var2.field4621 = 0;
                        Statics.field2827 = var2.method7148();
                        method5513(18);
                    }
                    if (field674 == 18 && var1.method2974() >= Statics.field2827) {
                        var2.field4621 = 0;
                        var1.method2988(var2.field4618, 0, Statics.field2827);
                        var2.field4621 = 0;
                        String var68 = var2.method6981();
                        String var69 = var2.method6981();
                        String var70 = var2.method6981();
                        class69.method13(var68, var69, var70);
                        method975(10);
                    }
                    if (field674 == 19) {
                        if (field685.field1321 == -1) {
                            if (var1.method2974() < 2) {
                                return;
                            }
                            var1.method2988(var2.field4618, 0, 2);
                            var2.field4621 = 0;
                            field685.field1321 = var2.method7148();
                        }
                        if (var1.method2974() >= field685.field1321) {
                            var1.method2988(var2.field4618, 0, field685.field1321);
                            var2.field4621 = 0;
                            int var71 = field685.field1321;
                            field555.method5972();
                            method1017();
                            class97.method6740(var2);
                            if (var2.field4621 != var71) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field529++;
                        if (field529 > 2000) {
                            if (field662 < 1) {
                                if (Statics.field951 == Statics.field4046) {
                                    Statics.field4046 = Statics.field1358;
                                } else {
                                    Statics.field4046 = Statics.field951;
                                }
                                field662++;
                                method5513(0);
                            } else {
                                method1020(-3);
                            }
                        }
                    }
                } else if (var1.method2974() >= field685.field1321) {
                    var2.field4621 = 0;
                    var1.method2988(var2.field4618, 0, field685.field1321);
                    field555.method5970();
                    Statics.method4443();
                    class97.method6740(var2);
                    Statics.field1043 = -1;
                    method5220(false, var2);
                    field685.field1320 = null;
                }
            }
        } catch (IOException var78) {
            if (field662 < 1) {
                if (Statics.field951 == Statics.field4046) {
                    Statics.field4046 = Statics.field1358;
                } else {
                    Statics.field4046 = Statics.field951;
                }
                field662++;
                method5513(0);
            } else {
                method1020(-2);
            }
        }
    }

    @ObfuscatedName("bo.fr(I)V")
    public static void method1017() {
        field685.method2392();
        field685.field1319.field4621 = 0;
        field685.field1320 = null;
        field685.field1325 = null;
        field685.field1326 = null;
        field685.field1314 = null;
        field685.field1321 = 0;
        field685.field1323 = 0;
        field513 = 0;
        field643 = 0;
        field642 = false;
        field745 = 0;
        field540 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field621[var0] = null;
        }
        Statics.field4004 = null;
        for (int var1 = 0; var1 < field560.length; var1++) {
            class92 var2 = field560[var1];
            if (var2 != null) {
                var2.field1142 = -1;
                var2.field1125 = false;
            }
        }
        class78.method2500();
        method975(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field716[var3] = true;
        }
        class265 var4 = class265.method3935(class263.field3001, field685.field1328);
        var4.field3019.method6954(method1550());
        var4.field3019.method6955(Statics.field1798);
        var4.field3019.method6955(Statics.field4019);
        field685.method2395(var4);
    }

    @ObfuscatedName("bl.fj(II)V")
    public static void method1020(int arg0) {
        if (arg0 == -3) {
            class69.method13(class309.field3814, class309.field3783, class309.field3638);
        } else if (arg0 == -2) {
            class69.method13(class309.field3639, class309.field3640, class309.field3641);
        } else if (arg0 == -1) {
            class69.method13(class309.field3642, class309.field3643, class309.field3648);
        } else if (arg0 == 3) {
            class69.method6209(3);
            class69.field896 = 1;
        } else if (arg0 == 4) {
            class69.method4684(0);
        } else if (arg0 == 5) {
            class69.field896 = 2;
            class69.method13(class309.field3879, class309.field3863, class309.field3650);
        } else if (arg0 == 68 || !field500 && arg0 == 6) {
            class69.method13(class309.field3762, class309.field3652, class309.field3653);
        } else if (arg0 == 7) {
            class69.method13(class309.field3654, class309.field3655, class309.field3656);
        } else if (arg0 == 8) {
            class69.method13(class309.field3618, class309.field3658, class309.field3867);
        } else if (arg0 == 9) {
            class69.method13(class309.field3739, class309.field3873, class309.field3644);
        } else if (arg0 == 10) {
            class69.method13(class309.field3663, class309.field3664, class309.field3872);
        } else if (arg0 == 11) {
            class69.method13(class309.field3611, class309.field3667, class309.field3668);
        } else if (arg0 == 12) {
            class69.method13(class309.field3897, class309.field3670, class309.field3671);
        } else if (arg0 == 13) {
            class69.method13(class309.field3672, class309.field3674, class309.field3712);
        } else if (arg0 == 14) {
            class69.method13(class309.field3675, class309.field3781, class309.field3838);
        } else if (arg0 == 16) {
            class69.method13(class309.field3678, class309.field3679, class309.field3813);
        } else if (arg0 == 17) {
            class69.method13(class309.field3681, class309.field3635, class309.field3683);
        } else if (arg0 == 18) {
            class69.method4684(1);
        } else if (arg0 == 19) {
            class69.method13(class309.field3687, class309.field3677, class309.field3689);
        } else if (arg0 == 20) {
            class69.method13(class309.field3690, class309.field3680, class309.field3791);
        } else if (arg0 == 22) {
            class69.method13(class309.field3799, class309.field3770, class309.field3695);
        } else if (arg0 == 23) {
            class69.method13(class309.field3696, class309.field3697, class309.field3698);
        } else if (arg0 == 24) {
            class69.method13(class309.field3730, class309.field3855, class309.field3701);
        } else if (arg0 == 25) {
            class69.method13(class309.field3885, class309.field3703, class309.field3704);
        } else if (arg0 == 26) {
            class69.method13(class309.field3705, class309.field3706, class309.field3707);
        } else if (arg0 == 27) {
            class69.method13(class309.field3708, class309.field3709, class309.field3710);
        } else if (arg0 == 31) {
            class69.method13(class309.field3800, class309.field3720, class309.field3719);
        } else if (arg0 == 32) {
            class69.method13(class309.field3600, class309.field3864, class309.field3815);
        } else if (arg0 == 37) {
            class69.method13(class309.field3723, class309.field3751, class309.field3725);
        } else if (arg0 == 38) {
            class69.method13(class309.field3726, class309.field3727, class309.field3728);
        } else if (arg0 == 55) {
            class69.method6209(8);
        } else if (arg0 == 56) {
            class69.method13(class309.field3700, class309.field3734, class309.field3627);
            method975(11);
            return;
        } else if (arg0 == 57) {
            class69.method13(class309.field3736, class309.field3717, class309.field3630);
            method975(11);
            return;
        } else if (arg0 == 61) {
            class69.method13("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class69.method6209(7);
        } else if (arg0 == 62) {
            method975(10);
            class69.method6209(9);
            class69.method13(class309.field3673, class309.field3740, class309.field3741);
            return;
        } else if (arg0 == 63) {
            method975(10);
            class69.method6209(9);
            class69.method13(class309.field3742, class309.field3743, class309.field3744);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method975(10);
            class69.method6209(9);
            class69.method13(class309.field3745, class309.field3746, class309.field3747);
            return;
        } else if (arg0 == 71) {
            method975(10);
            class69.method6209(7);
            class69.method13("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else {
            class69.method13(class309.field3748, class309.field3789, class309.field3750);
        }
        method975(10);
        if (field533.method7224()) {
            class69.method6209(9);
        }
    }

    @ObfuscatedName("hy.fl(I)V")
    public static final void method4029() {
        field685.method2378();
        class190.field2133.method4647();
        class182.method2006();
        class174.method3540();
        class188.method3135();
        class179.field1895.method4647();
        class179.field1896.method4647();
        class189.field2114.method4647();
        class189.field2072.method4647();
        class189.field2074.method4647();
        class191.field2141.method4647();
        class191.field2142.method4647();
        class191.field2143.method4647();
        class181.field1940.method4647();
        class181.field1941.method4647();
        class184.field1972.method4647();
        class171.field1804.method4647();
        Statics.field461.method6862();
        Statics.field3272.method6862();
        class187.field1995.method4647();
        class187.field1994.method4647();
        class187.field2007.method4647();
        class175.field1860.method4647();
        class175.field1862.method4647();
        class186.field1991.method4647();
        class185.field1982.method4647();
        class172.field1815.method4647();
        class293.field3304.method4647();
        class295.field3328.method4647();
        class295.field3329.method4647();
        class295.field3330.method4647();
        class295.field3331.method4647();
        ((class239) Statics.field2573).method4460();
        class72.field967.method4647();
        Statics.field148.method5297();
        Statics.field1346.method5297();
        Statics.field4280.method5297();
        Statics.field1965.method5297();
        Statics.field1288.method5297();
        Statics.field80.method5297();
        Statics.field1212.method5297();
        Statics.field1639.method5297();
        Statics.field3504.method5297();
        Statics.field1728.method5297();
        Statics.field477.method5297();
        Statics.field1687.method5297();
        Statics.field1005.method4254();
        for (int var0 = 0; var0 < 4; var0++) {
            field568[var0].method3519();
        }
        System.gc();
        Statics.method2080(2);
        field746 = -1;
        field747 = false;
        class63.method2155();
        method975(10);
    }

    @ObfuscatedName("u.fb(II)V")
    public static final void method186(int arg0) {
        method4029();
        switch(arg0) {
            case 1:
                class69.method6209(24);
                class69.method13(class309.field3839, class309.field3840, class309.field3841);
                break;
            case 2:
                class69.method6209(24);
                class69.method13(class309.field3836, class309.field3821, class309.field3722);
        }
    }

    @ObfuscatedName("jt.fe(B)J")
    public static long method4916() {
        return field624;
    }

    @ObfuscatedName("ec.fc(B)V")
    public static final void method2695() {
        if (field551 > 0) {
            method4029();
        } else {
            field555.method5968();
            method975(40);
            Statics.field4074 = field685.method2380();
            field685.method2379();
        }
    }

    @ObfuscatedName("km.fq(ZB)V")
    public static final void method5210(boolean arg0) {
        if (arg0) {
            field532 = class69.field908 ? class125.field1499 : class125.field1497;
            return;
        }
        LinkedHashMap var1 = Statics.field1541.field1220;
        String var2 = class69.field914;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field532 = var1.containsKey(var4) ? class125.field1502 : class125.field1496;
    }

    @ObfuscatedName("client.fv(B)V")
    public final void method1085() {
        if (field513 > 1) {
            field513--;
        }
        if (field551 > 0) {
            field551--;
        }
        if (field552) {
            field552 = false;
            method2695();
            return;
        }
        if (!field642) {
            method5961();
        }
        for (int var1 = 0; var1 < 100 && this.method1089(field685); var1++) {
        }
        if (field501 != 30) {
            return;
        }
        while (class55.method3945()) {
            class265 var2 = class265.method3935(class263.field2964, field685.field1328);
            var2.field3019.method6954(0);
            int var3 = var2.field3019.field4621;
            class55.method2860(var2.field3019);
            var2.field3019.method7071(var2.field3019.field4621 - var3);
            field685.method2395(var2);
        }
        if (field555.field4180) {
            class265 var4 = class265.method3935(class263.field2936, field685.field1328);
            var4.field3019.method6954(0);
            int var5 = var4.field3019.field4621;
            field555.method5973(var4.field3019);
            var4.field3019.method7071(var4.field3019.field4621 - var5);
            field685.method2395(var4);
            field555.method5986();
        }
        Object var6 = Statics.field1459.field1047;
        synchronized (Statics.field1459.field1047) {
            if (!field491) {
                Statics.field1459.field1048 = 0;
            } else if (class33.field220 != 0 || Statics.field1459.field1048 >= 40) {
                class265 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field1459.field1048 && (var7 == null || var7.field3019.field4621 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field1459.field1050[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field1459.field1046[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field509 != var14 || field510 != var13) {
                        if (var7 == null) {
                            var7 = class265.method3935(class263.field2966, field685.field1328);
                            var7.field3019.method6954(0);
                            var8 = var7.field3019.field4621;
                            var7.field3019.field4621 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field511 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field509;
                            var16 = var13 - field510;
                            var17 = (int) ((Statics.field1459.field1049[var12] - field511) / 20L);
                            var10 = (int) ((Statics.field1459.field1049[var12] - field511) % 20L + (long) var10);
                        }
                        field509 = var14;
                        field510 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field3019.method6955((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field3019.method6954(var17 + 128);
                            var7.field3019.method6955((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field3019.method6954(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3019.method6957(Integer.MIN_VALUE);
                            } else {
                                var7.field3019.method6957(var14 | var13 << 16);
                            }
                        } else {
                            var7.field3019.method6955((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3019.method6957(Integer.MIN_VALUE);
                            } else {
                                var7.field3019.method6957(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field511 = Statics.field1459.field1049[var12];
                    }
                }
                if (var7 != null) {
                    var7.field3019.method7071(var7.field3019.field4621 - var8);
                    int var18 = var7.field3019.field4621;
                    var7.field3019.field4621 = var8;
                    var7.field3019.method6954(var10 / var11);
                    var7.field3019.method6954(var10 % var11);
                    var7.field3019.field4621 = var18;
                    field685.method2395(var7);
                }
                if (var9 >= Statics.field1459.field1048) {
                    Statics.field1459.field1048 = 0;
                } else {
                    Statics.field1459.field1048 -= var9;
                    System.arraycopy(Statics.field1459.field1046, var9, Statics.field1459.field1046, 0, Statics.field1459.field1048);
                    System.arraycopy(Statics.field1459.field1050, var9, Statics.field1459.field1050, 0, Statics.field1459.field1048);
                    System.arraycopy(Statics.field1459.field1049, var9, Statics.field1459.field1049, 0, Statics.field1459.field1048);
                }
            }
        }
        if (class33.field220 == 1 || !Statics.field3560 && class33.field220 == 4 || class33.field220 == 2) {
            long var20 = class33.field223 - field508 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field508 = class33.field223 * -1L;
            int var22 = class33.field234;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field4019) {
                var22 = Statics.field4019;
            }
            int var23 = class33.field237;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field1798) {
                var23 = Statics.field1798;
            }
            int var24 = (int) var20;
            class265 var25 = class265.method3935(class263.field2977, field685.field1328);
            var25.field3019.method6955((var24 << 1) + (class33.field220 == 2 ? 1 : 0));
            var25.field3019.method6955(var23);
            var25.field3019.method6955(var22);
            field685.method2395(var25);
        }
        if (class24.field119 > 0) {
            class265 var26 = class265.method3935(class263.field2900, field685.field1328);
            var26.field3019.method6955(0);
            int var27 = var26.field3019.field4621;
            long var28 = class270.method2724();
            for (int var30 = 0; var30 < class24.field119; var30++) {
                long var31 = var28 - field586;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field586 = var28;
                var26.field3019.method6954(class24.field144[var30]);
                var26.field3019.method6977((int) var31);
            }
            var26.field3019.method6994(var26.field3019.field4621 - var27);
            field685.method2395(var26);
        }
        if (field589 > 0) {
            field589--;
        }
        if (class24.field130[96] || class24.field130[97] || class24.field130[98] || class24.field130[99]) {
            field590 = true;
        }
        if (field590 && field589 <= 0) {
            field589 = 20;
            field590 = false;
            class265 var33 = class265.method3935(class263.field2991, field685.field1328);
            var33.field3019.method7008(field730);
            var33.field3019.method6955(field641);
            field685.method2395(var33);
        }
        if (Statics.field1300 && !field512) {
            field512 = true;
            class265 var34 = class265.method3935(class263.field2979, field685.field1328);
            var34.field3019.method6954(1);
            field685.method2395(var34);
        }
        if (!Statics.field1300 && field512) {
            field512 = false;
            class265 var35 = class265.method3935(class263.field2979, field685.field1328);
            var35.field3019.method6954(0);
            field685.method2395(var35);
        }
        if (Statics.field463 != null) {
            Statics.field463.method6543();
        }
        if (Statics.field847) {
            if (Statics.field3004 != null) {
                Statics.field3004.method6161();
            }
            method5516();
            Statics.field847 = false;
        }
        method282();
        if (Statics.field99 != field715) {
            field715 = Statics.field99;
            int var36 = Statics.field99;
            int[] var37 = Statics.field1188.field4717;
            int var38 = var37.length;
            for (int var39 = 0; var39 < var38; var39++) {
                var37[var39] = 0;
            }
            for (int var40 = 1; var40 < 103; var40++) {
                int var41 = (103 - var40) * 2048 + 24628;
                for (int var42 = 1; var42 < 103; var42++) {
                    if ((class75.field985[var36][var42][var40] & 0x18) == 0) {
                        Statics.field1005.method4287(var37, var41, 512, var36, var42, var40);
                    }
                    if (var36 < 3 && (class75.field985[var36 + 1][var42][var40] & 0x8) != 0) {
                        Statics.field1005.method4287(var37, var41, 512, var36 + 1, var42, var40);
                    }
                    var41 += 4;
                }
            }
            int var43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var44 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field1188.method7360();
            for (int var45 = 1; var45 < 103; var45++) {
                for (int var46 = 1; var46 < 103; var46++) {
                    if ((class75.field985[var36][var46][var45] & 0x18) == 0) {
                        method5463(var36, var46, var45, var43, var44);
                    }
                    if (var36 < 3 && (class75.field985[var36 + 1][var46][var45] & 0x8) != 0) {
                        method5463(var36 + 1, var46, var45, var43, var44);
                    }
                }
            }
            field705 = 0;
            for (int var47 = 0; var47 < 104; var47++) {
                for (int var48 = 0; var48 < 104; var48++) {
                    long var49 = Statics.field1005.method4282(Statics.field99, var47, var48);
                    if (var49 != 0L) {
                        int var51 = class242.method2963(var49);
                        int var52 = class188.method2828(var51).field2043;
                        if (var52 >= 0 && class172.method2469(var52).field1824) {
                            field742[field705] = class172.method2469(var52).method3051(false);
                            field779[field705] = var47;
                            field536[field705] = var48;
                            field705++;
                        }
                    }
                }
            }
            Statics.field4530.method7328();
        }
        if (field501 != 30) {
            return;
        }
        method1823();
        method2723();
        field685.field1323++;
        if (field685.field1323 > 750) {
            method2695();
            return;
        }
        method2252();
        for (int var53 = 0; var53 < field546; var53++) {
            int var54 = field570[var53];
            class92 var55 = field560[var54];
            if (var55 != null) {
                method2857(var55, var55.field1235.field1905);
            }
        }
        int[] var56 = class97.field1275;
        for (int var57 = 0; var57 < class97.field1276; var57++) {
            class85 var58 = field621[var56[var57]];
            if (var58 != null && var58.field1138 > 0) {
                var58.field1138--;
                if (var58.field1138 == 0) {
                    var58.field1129 = null;
                }
            }
        }
        for (int var59 = 0; var59 < field546; var59++) {
            int var60 = field570[var59];
            class92 var61 = field560[var60];
            if (var61 != null && var61.field1138 > 0) {
                var61.field1138--;
                if (var61.field1138 == 0) {
                    var61.field1129 = null;
                }
            }
        }
        field557++;
        if (field538 != 0) {
            field608 += 20;
            if (field608 >= 400) {
                field538 = 0;
            }
        }
        if (Statics.field4012 != null) {
            field611++;
            if (field611 >= 15) {
                method5855(Statics.field4012);
                Statics.field4012 = null;
            }
        }
        class295 var62 = Statics.field156;
        class295 var63 = Statics.field487;
        Statics.field156 = null;
        Statics.field487 = null;
        field666 = null;
        field688 = false;
        field697 = false;
        field732 = 0;
        while (Statics.method1957() && field732 < 128) {
            if (field676 >= 2 && class24.field130[82] && Statics.field219 == 66) {
                String var64 = class99.method4468();
                Statics.field1515.method447(var64);
            } else if (field580 != 1 || Statics.field2122 <= 0) {
                field734[field732] = Statics.field219;
                field733[field732] = Statics.field2122;
                field732++;
            }
        }
        if (method2529() && class24.field130[82] && class24.field130[81] && field544 != 0) {
            int var65 = Statics.field4004.field1092 - field544;
            if (var65 < 0) {
                var65 = 0;
            } else if (var65 > 3) {
                var65 = 3;
            }
            if (Statics.field4004.field1092 != var65) {
                method3282(Statics.field489 + Statics.field4004.field1178[0], Statics.field1843 + Statics.field4004.field1179[0], var65, false);
            }
            field544 = 0;
        }
        if (field523 != -1) {
            method5507(field523, 0, 0, Statics.field1798, Statics.field4019, 0, 0);
        }
        field692++;
        while (true) {
            class81 var66;
            class295 var67;
            class295 var68;
            do {
                var66 = (class81) field711.method5525();
                if (var66 == null) {
                    while (true) {
                        class81 var69;
                        class295 var70;
                        class295 var71;
                        do {
                            var69 = (class81) field712.method5525();
                            if (var69 == null) {
                                while (true) {
                                    class81 var72;
                                    class295 var73;
                                    class295 var74;
                                    do {
                                        var72 = (class81) field710.method5525();
                                        if (var72 == null) {
                                            this.method1090();
                                            if (Statics.field463 != null) {
                                                Statics.field463.method6655(Statics.field99, (Statics.field4004.field1132 >> 7) + Statics.field489, (Statics.field4004.field1116 >> 7) + Statics.field1843, false);
                                                Statics.field463.method6569();
                                            }
                                            if (field721 != null) {
                                                this.method1095();
                                            }
                                            if (Statics.field1623 != null) {
                                                method5855(Statics.field1623);
                                                field781++;
                                                if (class33.field228 == 0) {
                                                    if (field768) {
                                                        if (Statics.field4026 == Statics.field1623 && field616 != field613) {
                                                            class295 var75 = Statics.field1623;
                                                            byte var76 = 0;
                                                            if (field525 == 1 && var75.field3340 == 206) {
                                                                var76 = 1;
                                                            }
                                                            if (var75.field3470[field616] <= 0) {
                                                                var76 = 0;
                                                            }
                                                            if (class296.method1016(Statics.method5486(var75))) {
                                                                int var77 = field613;
                                                                int var78 = field616;
                                                                var75.field3470[var78] = var75.field3470[var77];
                                                                var75.field3471[var78] = var75.field3471[var77];
                                                                var75.field3470[var77] = -1;
                                                                var75.field3471[var77] = 0;
                                                            } else if (var76 == 1) {
                                                                int var79 = field613;
                                                                int var80 = field616;
                                                                while (var79 != var80) {
                                                                    if (var79 > var80) {
                                                                        var75.method5056(var79 - 1, var79);
                                                                        var79--;
                                                                    } else if (var79 < var80) {
                                                                        var75.method5056(var79 + 1, var79);
                                                                        var79++;
                                                                    }
                                                                }
                                                            } else {
                                                                var75.method5056(field616, field613);
                                                            }
                                                            class265 var81 = class265.method3935(class263.field2997, field685.field1328);
                                                            var81.field3019.method7009(field616);
                                                            var81.field3019.method7007(field613);
                                                            var81.field3019.method7018(Statics.field1623.field3449);
                                                            var81.field3019.method7101(var76);
                                                            field685.method2395(var81);
                                                        }
                                                    } else if (this.method1091()) {
                                                        this.method1494(field614, field782);
                                                    } else if (field643 > 0) {
                                                        Statics.method2429(field614, field782);
                                                    }
                                                    field611 = 10;
                                                    class33.field220 = 0;
                                                    Statics.field1623 = null;
                                                } else if (field781 >= 5 && (class33.field229 > field614 + 5 || class33.field229 < field614 - 5 || class33.field230 > field782 + 5 || class33.field230 < field782 - 5)) {
                                                    field768 = true;
                                                }
                                            }
                                            if (class234.method4379()) {
                                                int var82 = class234.field2640;
                                                int var83 = class234.field2594;
                                                class265 var84 = class265.method3935(class263.field2912, field685.field1328);
                                                var84.field3019.method6954(5);
                                                var84.field3019.method7007(Statics.field489 + var82);
                                                var84.field3019.method6955(Statics.field1843 + var83);
                                                var84.field3019.method7000(class24.field130[82] ? (class24.field130[81] ? 2 : 1) : 0);
                                                field685.method2395(var84);
                                                class234.method4293();
                                                field606 = class33.field237;
                                                field607 = class33.field234;
                                                field538 = 1;
                                                field608 = 0;
                                                field540 = var82;
                                                field764 = var83;
                                            }
                                            if (Statics.field156 != var62) {
                                                if (var62 != null) {
                                                    method5855(var62);
                                                }
                                                if (Statics.field156 != null) {
                                                    method5855(Statics.field156);
                                                }
                                            }
                                            if (Statics.field487 != var63 && field658 == field657) {
                                                if (var63 != null) {
                                                    method5855(var63);
                                                }
                                                if (Statics.field487 != null) {
                                                    method5855(Statics.field487);
                                                }
                                            }
                                            if (Statics.field487 == null) {
                                                if (field657 > 0) {
                                                    field657--;
                                                }
                                            } else if (field657 < field658) {
                                                field657++;
                                                if (field658 == field657) {
                                                    method5855(Statics.field487);
                                                }
                                            }
                                            method2720();
                                            if (field755) {
                                                method3208();
                                            } else if (field754) {
                                                method1065();
                                            }
                                            for (int var85 = 0; var85 < 5; var85++) {
                                                int var10002 = field601[var85]++;
                                            }
                                            Statics.field1739.method2316();
                                            int var86 = class33.method1593();
                                            int var87 = class24.field145;
                                            if (var86 > 15000 && var87 > 15000) {
                                                field551 = 250;
                                                class33.method4664(14500);
                                                class265 var89 = class265.method3935(class263.field2980, field685.field1328);
                                                field685.method2395(var89);
                                            }
                                            Statics.field399.method1600();
                                            field685.field1324++;
                                            if (field685.field1324 > 50) {
                                                class265 var90 = class265.method3935(class263.field2951, field685.field1328);
                                                field685.method2395(var90);
                                            }
                                            try {
                                                field685.method2375();
                                            } catch (IOException var92) {
                                                method2695();
                                            }
                                            return;
                                        }
                                        var73 = var72.field1045;
                                        if (var73.field3461 < 0) {
                                            break;
                                        }
                                        var74 = class295.method2688(var73.field3426);
                                    } while (var74 == null || var74.field3454 == null || var73.field3461 >= var74.field3454.length || var74.field3454[var73.field3461] != var73);
                                    class64.method2809(var72);
                                }
                            }
                            var70 = var69.field1045;
                            if (var70.field3461 < 0) {
                                break;
                            }
                            var71 = class295.method2688(var70.field3426);
                        } while (var71 == null || var71.field3454 == null || var70.field3461 >= var71.field3454.length || var71.field3454[var70.field3461] != var70);
                        class64.method2809(var69);
                    }
                }
                var67 = var66.field1045;
                if (var67.field3461 < 0) {
                    break;
                }
                var68 = class295.method2688(var67.field3426);
            } while (var68 == null || var68.field3454 == null || var67.field3461 >= var68.field3454.length || var68.field3454[var67.field3461] != var67);
            class64.method2809(var66);
        }
    }

    @ObfuscatedName("di.fz(I)V")
    public static final void method2576() {
        if (Statics.field2811 != null) {
            Statics.field2811.method684();
        }
        if (Statics.field147 != null) {
            Statics.field147.method684();
        }
    }

    @ObfuscatedName("ep.fs(I)V")
    public static final void method2723() {
        for (int var0 = 0; var0 < field652; var0++) {
            int var10002 = field751[var0]--;
            if (field751[var0] >= -10) {
                class35 var2 = field530[var0];
                if (var2 == null) {
                    class35 var10000 = (class35) null;
                    var2 = class35.method652(Statics.field1965, field575[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field751[var0] += var2.method647();
                    field530[var0] = var2;
                }
                if (field751[var0] < 0) {
                    int var9;
                    if (field752[var0] == 0) {
                        var9 = Statics.field1541.method2139();
                    } else {
                        int var3 = (field752[var0] & 0xFF) * 128;
                        int var4 = field752[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field4004.field1132;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field752[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field4004.field1116;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field751[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * Statics.field1541.method2166() / var3;
                    }
                    if (var9 > 0) {
                        class36 var10 = var2.method649().method658(Statics.field2355);
                        class43 var11 = class43.method855(var10, 100, var9);
                        var11.method848(field690[var0] - 1);
                        Statics.field1985.method623(var11);
                    }
                    field751[var0] = -100;
                }
            } else {
                field652--;
                for (int var1 = var0; var1 < field652; var1++) {
                    field575[var1] = field575[var1 + 1];
                    field530[var1] = field530[var1 + 1];
                    field690[var1] = field690[var1 + 1];
                    field751[var1] = field751[var1 + 1];
                    field752[var1] = field752[var1 + 1];
                }
                var0--;
            }
        }
        if (field747 && !class274.method5230()) {
            if (Statics.field1541.method2217() != 0 && field746 != -1) {
                class274.method261(Statics.field80, field746, 0, Statics.field1541.method2217(), false);
            }
            field747 = false;
        }
    }

    @ObfuscatedName("lo.fw(Lgw;IIII)V")
    public static void method5505(class191 arg0, int arg1, int arg2, int arg3) {
        if (field652 >= 50 || Statics.field1541.method2166() == 0 || arg0.field2151 == null || arg1 >= arg0.field2151.length) {
            return;
        }
        int var4 = arg0.field2151[arg1];
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field575[field652] = var7;
        field690[field652] = var8;
        field751[field652] = 0;
        field530[field652] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field752[field652] = (var10 << 16) + (var11 << 8) + var9;
        field652++;
    }

    @ObfuscatedName("e.ft(Lgw;IIIB)V")
    public static void method331(class191 arg0, int arg1, int arg2, int arg3) {
        if (field652 >= 50 || Statics.field1541.method2166() == 0 || arg0.field2145 == null || !arg0.field2145.containsKey(arg1)) {
            return;
        }
        int var4 = (Integer) arg0.field2145.get(arg1);
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field575[field652] = var7;
        field690[field652] = var8;
        field751[field652] = 0;
        field530[field652] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field752[field652] = (var10 << 16) + (var11 << 8) + var9;
        field652++;
    }

    @ObfuscatedName("cb.fg(IIIB)V")
    public static void method2078(int arg0, int arg1, int arg2) {
        if (Statics.field1541.method2139() == 0 || arg1 == 0 || field652 >= 50) {
            return;
        }
        field575[field652] = arg0;
        field690[field652] = arg1;
        field751[field652] = arg2;
        field530[field652] = null;
        field752[field652] = 0;
        field652++;
    }

    @ObfuscatedName("ac.fh(II)V")
    public static void method751(int arg0) {
        if (arg0 == -1 && !field747) {
            Statics.field3172.method4817();
            class274.field3169 = 1;
            Statics.field3174 = null;
        } else if (arg0 != -1 && field746 != arg0 && Statics.field1541.method2217() != 0 && !field747) {
            class274.method3196(2, Statics.field80, arg0, 0, Statics.field1541.method2217(), false);
        }
        field746 = arg0;
    }

    @ObfuscatedName("cg.fk(III)V")
    public static void method2302(int arg0, int arg1) {
        if (Statics.field1541.method2217() != 0 && arg0 != -1) {
            class274.method261(Statics.field477, arg0, 0, Statics.field1541.method2217(), false);
            field747 = true;
        }
    }

    @ObfuscatedName("x.gb(B)V")
    public static final void method282() {
        if (!Statics.field310) {
            return;
        }
        for (int var0 = 0; var0 < class97.field1276; var0++) {
            class85 var1 = field621[class97.field1275[var0]];
            var1.method2023();
        }
        Statics.field310 = false;
    }

    @ObfuscatedName("d.gi(Lky;III)V")
    public static final void method167(class295 arg0, int arg1, int arg2) {
        if (field745 != 0 && field745 != 3 || field642 || !(class33.field220 == 1 || !Statics.field3560 && class33.field220 == 4)) {
            return;
        }
        class288 var3 = arg0.method5065(true);
        if (var3 == null) {
            return;
        }
        int var4 = class33.field237 - arg1;
        int var5 = class33.field234 - arg2;
        if (!var3.method4968(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3280 / 2;
        int var7 = var5 - var3.field3277 / 2;
        int var8 = field730 & 0x7FF;
        int var9 = class231.field2576[var8];
        int var10 = class231.field2551[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field4004.field1132 + var11 >> 7;
        int var14 = Statics.field4004.field1116 - var12 >> 7;
        class265 var15 = class265.method3935(class263.field2911, field685.field1328);
        var15.field3019.method6954(18);
        var15.field3019.method7007(Statics.field489 + var13);
        var15.field3019.method6955(Statics.field1843 + var14);
        var15.field3019.method7000(class24.field130[82] ? (class24.field130[81] ? 2 : 1) : 0);
        var15.field3019.method6954(var6);
        var15.field3019.method6954(var7);
        var15.field3019.method6955(field730);
        var15.field3019.method6954(57);
        var15.field3019.method6954(0);
        var15.field3019.method6954(0);
        var15.field3019.method6954(89);
        var15.field3019.method6955(Statics.field4004.field1132);
        var15.field3019.method6955(Statics.field4004.field1116);
        var15.field3019.method6954(63);
        field685.method2395(var15);
        field540 = var13;
        field764 = var14;
    }

    @ObfuscatedName("pp.gn(Ljava/lang/String;B)V")
    public static final void method6791(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1541.method2142(!Statics.field1541.method2159());
            if (Statics.field1541.method2159()) {
                class99.method2077(99, "", "Roofs are now all hidden");
            } else {
                class99.method2077(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field1541.method2198();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field502 = !field502;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field654 = !field654;
        }
        if (field676 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field463.field4456 = !Statics.field463.field4456;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field1541.method2130(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field1541.method2130(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2695();
            }
        }
        class265 var1 = class265.method3935(class263.field2988, field685.field1328);
        var1.field3019.method6954(arg0.length() + 1);
        var1.field3019.method7142(arg0);
        field685.method2395(var1);
    }

    @ObfuscatedName("fh.gh(I)V")
    public static final void method3208() {
        method158(Statics.field1254, Statics.field295, Statics.field1838);
        method3896(Statics.field2066, Statics.field117);
        if (Statics.field2213 != Statics.field1254 || Statics.field295 != Statics.field1016 || Statics.field1838 != Statics.field1694 || Statics.field2066 != Statics.field1647 || Statics.field117 != Statics.field111) {
            return;
        }
        field755 = false;
        field754 = false;
        Statics.field1692 = 0;
        Statics.field882 = 0;
        Statics.field155 = 0;
        Statics.field3961 = 0;
        Statics.field4338 = 0;
        Statics.field4310 = 0;
        Statics.field956 = 0;
        Statics.field3275 = 0;
        Statics.field448 = 0;
        Statics.field4663 = 0;
    }

    @ObfuscatedName("k.gs(IIII)V")
    public static final void method158(int arg0, int arg1, int arg2) {
        if (Statics.field2213 < arg0) {
            Statics.field2213 += Statics.field4310 * (arg0 - Statics.field2213) / 1000 + Statics.field956;
            if (Statics.field2213 > arg0) {
                Statics.field2213 = arg0;
            }
        }
        if (Statics.field2213 > arg0) {
            Statics.field2213 -= Statics.field4310 * (Statics.field2213 - arg0) / 1000 + Statics.field956;
            if (Statics.field2213 < arg0) {
                Statics.field2213 = arg0;
            }
        }
        if (Statics.field1016 < arg1) {
            Statics.field1016 += Statics.field4310 * (arg1 - Statics.field1016) / 1000 + Statics.field956;
            if (Statics.field1016 > arg1) {
                Statics.field1016 = arg1;
            }
        }
        if (Statics.field1016 > arg1) {
            Statics.field1016 -= Statics.field4310 * (Statics.field1016 - arg1) / 1000 + Statics.field956;
            if (Statics.field1016 < arg1) {
                Statics.field1016 = arg1;
            }
        }
        if (Statics.field1694 < arg2) {
            Statics.field1694 += Statics.field4310 * (arg2 - Statics.field1694) / 1000 + Statics.field956;
            if (Statics.field1694 > arg2) {
                Statics.field1694 = arg2;
            }
        }
        if (Statics.field1694 > arg2) {
            Statics.field1694 -= Statics.field4310 * (Statics.field1694 - arg2) / 1000 + Statics.field956;
            if (Statics.field1694 < arg2) {
                Statics.field1694 = arg2;
            }
        }
    }

    @ObfuscatedName("he.gj(III)V")
    public static final void method3896(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1647 < arg0) {
            Statics.field1647 += Statics.field4338 * (arg0 - Statics.field1647) / 1000 + Statics.field3961;
            if (Statics.field1647 > arg0) {
                Statics.field1647 = arg0;
            }
        }
        if (Statics.field1647 > arg0) {
            Statics.field1647 -= Statics.field4338 * (Statics.field1647 - arg0) / 1000 + Statics.field3961;
            if (Statics.field1647 < arg0) {
                Statics.field1647 = arg0;
            }
        }
        int var2 = arg1 - Statics.field111;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field111 += Statics.field4338 * var2 / 1000 + Statics.field3961;
            Statics.field111 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field111 -= Statics.field4338 * -var2 / 1000 + Statics.field3961;
            Statics.field111 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field111;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field111 = arg1;
        }
    }

    @ObfuscatedName("bf.gf(I)V")
    public static final void method1065() {
        int var0 = Statics.field3275 * 128 + 64;
        int var1 = Statics.field448 * 128 + 64;
        int var2 = method3938(var0, var1, Statics.field99) - Statics.field4663;
        method158(var0, var2, var1);
        int var3 = Statics.field1692 * 128 + 64;
        int var4 = Statics.field882 * 128 + 64;
        int var5 = method3938(var3, var4, Statics.field99) - Statics.field155;
        int var6 = var3 - Statics.field2213;
        int var7 = var5 - Statics.field1016;
        int var8 = var4 - Statics.field1694;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
        method3896(var10, var11);
    }

    @ObfuscatedName("ei.gc(I)V")
    public static final void method2720() {
        if (field580 == 0) {
            int var0 = Statics.field4004.field1132;
            int var1 = Statics.field4004.field1116;
            if (Statics.field50 - var0 < -500 || Statics.field50 - var0 > 500 || Statics.field3003 - var1 < -500 || Statics.field3003 - var1 > 500) {
                Statics.field50 = var0;
                Statics.field3003 = var1;
            }
            if (Statics.field50 != var0) {
                Statics.field50 += (var0 - Statics.field50) / 16;
            }
            if (Statics.field3003 != var1) {
                Statics.field3003 += (var1 - Statics.field3003) / 16;
            }
            int var2 = Statics.field50 >> 7;
            int var3 = Statics.field3003 >> 7;
            int var4 = method3938(Statics.field50, Statics.field3003, Statics.field99);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field99;
                        if (var8 < 3 && (class75.field985[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class75.field988[var8][var6][var7];
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
            if (var10 > field719) {
                field719 += (var10 - field719) / 24;
            } else if (var10 < field719) {
                field719 += (var10 - field719) / 80;
            }
            Statics.field398 = method3938(Statics.field4004.field1132, Statics.field4004.field1116, Statics.field99) - field581;
        } else if (field580 == 1) {
            method2438();
            short var11 = -1;
            if (class24.field130[33]) {
                var11 = 0;
            } else if (class24.field130[49]) {
                var11 = 1024;
            }
            if (class24.field130[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class24.field130[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class24.field130[35]) {
                var12 = -1;
            } else if (class24.field130[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class24.field130[81] ? field722 : field585;
                var13 = var14 * 16;
                field591 = var11;
                field490 = var12;
            }
            if (field582 < var13) {
                field582 += var13 / 8;
                if (field582 > var13) {
                    field582 = var13;
                }
            } else if (field582 > var13) {
                field582 = field582 * 9 / 10;
            }
            if (field582 > 0) {
                int var15 = field582 / 16;
                if (field591 >= 0) {
                    int var16 = field591 - Statics.field111 & 0x7FF;
                    int var17 = class231.field2576[var16];
                    int var18 = class231.field2551[var16];
                    Statics.field50 += var15 * var17 / 65536;
                    Statics.field3003 += var15 * var18 / 65536;
                }
                if (field490 != 0) {
                    Statics.field398 += field490 * var15;
                    if (Statics.field398 > 0) {
                        Statics.field398 = 0;
                    }
                }
            } else {
                field591 = -1;
                field490 = -1;
            }
            if (class24.field130[13]) {
                method2717();
            }
        }
        if (class33.field228 == 4 && Statics.field3560) {
            int var19 = class33.field230 - field579;
            field577 = var19 * 2;
            field579 = var19 == -1 || var19 == 1 ? class33.field230 : (field579 + class33.field230) / 2;
            int var20 = field578 - class33.field229;
            field576 = var20 * 2;
            field578 = var20 == -1 || var20 == 1 ? class33.field229 : (field578 + class33.field229) / 2;
        } else {
            if (class24.field130[96]) {
                field576 += (-24 - field576) / 2;
            } else if (class24.field130[97]) {
                field576 += (24 - field576) / 2;
            } else {
                field576 /= 2;
            }
            if (class24.field130[98]) {
                field577 += (12 - field577) / 2;
            } else if (class24.field130[99]) {
                field577 += (-12 - field577) / 2;
            } else {
                field577 /= 2;
            }
            field579 = class33.field230;
            field578 = class33.field229;
        }
        field730 = field576 / 2 + field730 & 0x7FF;
        field641 += field577 / 2;
        if (field641 < 128) {
            field641 = 128;
        }
        if (field641 > 383) {
            field641 = 383;
        }
    }

    @ObfuscatedName("cr.gw(I)V")
    public static final void method2252() {
        int var0 = class97.field1276;
        int[] var1 = class97.field1275;
        for (int var2 = 0; var2 < var0; var2++) {
            class85 var3 = field621[var1[var2]];
            if (var3 != null) {
                method2857(var3, 1);
            }
        }
    }

    @ObfuscatedName("eu.gv(Lcb;IB)V")
    public static final void method2857(class87 arg0, int arg1) {
        if (arg0.field1144 >= field507) {
            method2456(arg0);
        } else if (arg0.field1164 >= field507) {
            if (field507 == arg0.field1164 || arg0.field1149 == -1 || arg0.field1152 != 0 || arg0.field1137 + 1 > class191.method3011(arg0.field1149).field2150[arg0.field1150]) {
                int var2 = arg0.field1164 - arg0.field1144;
                int var3 = field507 - arg0.field1144;
                int var4 = arg0.field1151 * 64 + arg0.field1130 * 128;
                int var5 = arg0.field1161 * 128 + arg0.field1151 * 64;
                int var6 = arg0.field1151 * 64 + arg0.field1133 * 128;
                int var7 = arg0.field1162 * 128 + arg0.field1151 * 64;
                arg0.field1132 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field1116 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field1180 = 0;
            arg0.field1174 = arg0.field1136;
            arg0.field1159 = arg0.field1174;
        } else {
            arg0.field1146 = arg0.field1121;
            if (arg0.field1177 == 0) {
                arg0.field1180 = 0;
            } else {
                label228: {
                    if (arg0.field1149 != -1 && arg0.field1152 == 0) {
                        class191 var8 = class191.method3011(arg0.field1149);
                        if (arg0.field1171 > 0 && var8.field2160 == 0) {
                            arg0.field1180++;
                            break label228;
                        }
                        if (arg0.field1171 <= 0 && var8.field2159 == 0) {
                            arg0.field1180++;
                            break label228;
                        }
                    }
                    int var9 = arg0.field1132;
                    int var10 = arg0.field1116;
                    int var11 = arg0.field1178[arg0.field1177 - 1] * 128 + arg0.field1151 * 64;
                    int var12 = arg0.field1179[arg0.field1177 - 1] * 128 + arg0.field1151 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field1174 = 1280;
                        } else if (var10 > var12) {
                            arg0.field1174 = 1792;
                        } else {
                            arg0.field1174 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field1174 = 768;
                        } else if (var10 > var12) {
                            arg0.field1174 = 256;
                        } else {
                            arg0.field1174 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field1174 = 1024;
                    } else if (var10 > var12) {
                        arg0.field1174 = 0;
                    }
                    class194 var13 = arg0.field1124[arg0.field1177 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field1174 - arg0.field1159 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field1147;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field1134;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field1127;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field1126;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field1134;
                        }
                        arg0.field1146 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class92) {
                            var17 = ((class92) arg0).field1235.field1927;
                        }
                        if (var17) {
                            if (arg0.field1174 != arg0.field1159 && arg0.field1142 == -1 && arg0.field1176 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field1177 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field1177 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field1180 > 0 && arg0.field1177 > 1) {
                                var16 = 8;
                                arg0.field1180--;
                            }
                        } else {
                            if (arg0.field1177 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field1177 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field1180 > 0 && arg0.field1177 > 1) {
                                var16 = 8;
                                arg0.field1180--;
                            }
                        }
                        if (class194.field2188 == var13) {
                            var16 <<= 0x1;
                        } else if (class194.field2185 == var13) {
                            var16 >>= 0x1;
                        }
                        if (var16 >= 8 && arg0.field1146 == arg0.field1134 && arg0.field1128 != -1) {
                            arg0.field1146 = arg0.field1128;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field1132 += var16;
                                if (arg0.field1132 > var11) {
                                    arg0.field1132 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field1132 -= var16;
                                if (arg0.field1132 < var11) {
                                    arg0.field1132 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field1116 += var16;
                                if (arg0.field1116 > var12) {
                                    arg0.field1116 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field1116 -= var16;
                                if (arg0.field1116 < var12) {
                                    arg0.field1116 = var12;
                                }
                            }
                        }
                        if (arg0.field1132 == var11 && arg0.field1116 == var12) {
                            arg0.field1177--;
                            if (arg0.field1171 > 0) {
                                arg0.field1171--;
                            }
                        }
                    } else {
                        arg0.field1132 = var11;
                        arg0.field1116 = var12;
                        arg0.field1177--;
                        if (arg0.field1171 > 0) {
                            arg0.field1171--;
                        }
                    }
                }
            }
        }
        if (arg0.field1132 < 128 || arg0.field1116 < 128 || arg0.field1132 >= 13184 || arg0.field1116 >= 13184) {
            arg0.field1149 = -1;
            arg0.field1165 = -1;
            arg0.field1144 = 0;
            arg0.field1164 = 0;
            arg0.field1132 = arg0.field1178[0] * 128 + arg0.field1151 * 64;
            arg0.field1116 = arg0.field1179[0] * 128 + arg0.field1151 * 64;
            arg0.method2076();
        }
        if (Statics.field4004 == arg0 && (arg0.field1132 < 1536 || arg0.field1116 < 1536 || arg0.field1132 >= 11776 || arg0.field1116 >= 11776)) {
            arg0.field1149 = -1;
            arg0.field1165 = -1;
            arg0.field1144 = 0;
            arg0.field1164 = 0;
            arg0.field1132 = arg0.field1178[0] * 128 + arg0.field1151 * 64;
            arg0.field1116 = arg0.field1179[0] * 128 + arg0.field1151 * 64;
            arg0.method2076();
        }
        method4252(arg0);
        method5429(arg0);
    }

    @ObfuscatedName("dr.gt(Lcb;I)V")
    public static final void method2456(class87 arg0) {
        int var1 = Math.max(1, arg0.field1144 - field507);
        int var2 = arg0.field1151 * 64 + arg0.field1130 * 128;
        int var3 = arg0.field1161 * 128 + arg0.field1151 * 64;
        arg0.field1132 += (var2 - arg0.field1132) / var1;
        arg0.field1116 += (var3 - arg0.field1116) / var1;
        arg0.field1180 = 0;
        arg0.field1174 = arg0.field1136;
    }

    @ObfuscatedName("ha.gm(Lcb;I)V")
    public static final void method4252(class87 arg0) {
        if (arg0.field1176 == 0) {
            return;
        }
        if (arg0.field1142 != -1) {
            class87 var1 = null;
            if (arg0.field1142 < 32768) {
                var1 = field560[arg0.field1142];
            } else if (arg0.field1142 >= 32768) {
                var1 = field621[arg0.field1142 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1132 - var1.field1132;
                int var3 = arg0.field1116 - var1.field1116;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1174 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1125) {
                arg0.field1142 = -1;
                arg0.field1125 = false;
            }
        }
        if (arg0.field1122 != -1 && (arg0.field1177 == 0 || arg0.field1180 > 0)) {
            arg0.field1174 = arg0.field1122;
            arg0.field1122 = -1;
        }
        int var4 = arg0.field1174 - arg0.field1159 & 0x7FF;
        if (var4 == 0 && arg0.field1125) {
            arg0.field1142 = -1;
            arg0.field1125 = false;
        }
        if (var4 == 0) {
            arg0.field1175 = 0;
            return;
        }
        arg0.field1175++;
        if (var4 > 1024) {
            arg0.field1159 -= arg0.field1145 ? var4 : arg0.field1176;
            boolean var5 = true;
            if (var4 < arg0.field1176 || var4 > 2048 - arg0.field1176) {
                arg0.field1159 = arg0.field1174;
                var5 = false;
            }
            if (!arg0.field1145 && arg0.field1146 == arg0.field1121 && (arg0.field1175 > 25 || var5)) {
                if (arg0.field1141 == -1) {
                    arg0.field1146 = arg0.field1134;
                } else {
                    arg0.field1146 = arg0.field1141;
                }
            }
        } else {
            arg0.field1159 += arg0.field1145 ? var4 : arg0.field1176;
            boolean var6 = true;
            if (var4 < arg0.field1176 || var4 > 2048 - arg0.field1176) {
                arg0.field1159 = arg0.field1174;
                var6 = false;
            }
            if (!arg0.field1145 && arg0.field1146 == arg0.field1121 && (arg0.field1175 > 25 || var6)) {
                if (arg0.field1119 == -1) {
                    arg0.field1146 = arg0.field1134;
                } else {
                    arg0.field1146 = arg0.field1119;
                }
            }
        }
        arg0.field1159 &= 0x7FF;
        arg0.field1145 = false;
    }

    @ObfuscatedName("lp.go(Lcb;I)V")
    public static final void method5429(class87 arg0) {
        arg0.field1163 = false;
        if (arg0.field1146 != -1) {
            class191 var1 = class191.method3011(arg0.field1146);
            if (var1 == null) {
                arg0.field1146 = -1;
            } else if (!var1.method3462() && var1.field2148 != null) {
                arg0.field1148++;
                if (arg0.field1173 < var1.field2148.length && arg0.field1148 > var1.field2150[arg0.field1173]) {
                    arg0.field1148 = 1;
                    arg0.field1173++;
                    method5505(var1, arg0.field1173, arg0.field1132, arg0.field1116);
                }
                if (arg0.field1173 >= var1.field2148.length) {
                    arg0.field1148 = 0;
                    arg0.field1173 = 0;
                    method5505(var1, arg0.field1173, arg0.field1132, arg0.field1116);
                }
            } else if (var1.method3462()) {
                arg0.field1173++;
                int var2 = var1.method3507();
                if (arg0.field1173 < var2) {
                    method331(var1, arg0.field1173, arg0.field1132, arg0.field1116);
                } else {
                    arg0.field1148 = 0;
                    arg0.field1173 = 0;
                    method331(var1, arg0.field1173, arg0.field1132, arg0.field1116);
                }
            } else {
                arg0.field1146 = -1;
            }
        }
        if (arg0.field1165 != -1 && field507 >= arg0.field1135) {
            if (arg0.field1157 < 0) {
                arg0.field1157 = 0;
            }
            int var3 = class181.method2196(arg0.field1165).field1944;
            if (var3 == -1) {
                arg0.field1165 = -1;
            } else {
                class191 var4 = class191.method3011(var3);
                if (var4 != null && var4.field2148 != null) {
                    arg0.field1156++;
                    if (arg0.field1157 < var4.field2148.length && arg0.field1156 > var4.field2150[arg0.field1157]) {
                        arg0.field1156 = 1;
                        arg0.field1157++;
                        method5505(var4, arg0.field1157, arg0.field1132, arg0.field1116);
                    }
                    if (arg0.field1157 >= var4.field2148.length && (arg0.field1157 < 0 || arg0.field1157 >= var4.field2148.length)) {
                        arg0.field1165 = -1;
                    }
                } else if (var4.method3462()) {
                    arg0.field1157++;
                    int var5 = var4.method3507();
                    if (arg0.field1157 < var5) {
                        method331(var4, arg0.field1157, arg0.field1132, arg0.field1116);
                    } else if (arg0.field1157 < 0 || arg0.field1157 >= var5) {
                        arg0.field1165 = -1;
                    }
                } else {
                    arg0.field1165 = -1;
                }
            }
        }
        if (arg0.field1149 != -1 && arg0.field1152 <= 1) {
            class191 var6 = class191.method3011(arg0.field1149);
            if (var6.field2160 == 1 && arg0.field1171 > 0 && arg0.field1144 <= field507 && arg0.field1164 < field507) {
                arg0.field1152 = 1;
                return;
            }
        }
        if (arg0.field1149 != -1 && arg0.field1152 == 0) {
            class191 var7 = class191.method3011(arg0.field1149);
            if (var7 == null) {
                arg0.field1149 = -1;
            } else if (!var7.method3462() && var7.field2148 != null) {
                arg0.field1137++;
                if (arg0.field1150 < var7.field2148.length && arg0.field1137 > var7.field2150[arg0.field1150]) {
                    arg0.field1137 = 1;
                    arg0.field1150++;
                    method5505(var7, arg0.field1150, arg0.field1132, arg0.field1116);
                }
                if (arg0.field1150 >= var7.field2148.length) {
                    arg0.field1150 -= var7.field2154;
                    arg0.field1153++;
                    if (arg0.field1153 >= var7.field2139) {
                        arg0.field1149 = -1;
                    } else if (arg0.field1150 >= 0 && arg0.field1150 < var7.field2148.length) {
                        method5505(var7, arg0.field1150, arg0.field1132, arg0.field1116);
                    } else {
                        arg0.field1149 = -1;
                    }
                }
                arg0.field1163 = var7.field2155;
            } else if (var7.method3462()) {
                arg0.field1150++;
                int var8 = var7.method3464().method2631();
                if (arg0.field1150 < var8) {
                    method331(var7, arg0.field1150, arg0.field1132, arg0.field1116);
                } else {
                    arg0.field1150 -= var7.field2154;
                    arg0.field1153++;
                    if (arg0.field1153 >= var7.field2139) {
                        arg0.field1149 = -1;
                    } else if (arg0.field1150 >= 0 && arg0.field1150 < var8) {
                        method331(var7, arg0.field1150, arg0.field1132, arg0.field1116);
                    } else {
                        arg0.field1149 = -1;
                    }
                }
            } else {
                arg0.field1149 = -1;
            }
        }
        if (arg0.field1152 > 0) {
            arg0.field1152--;
        }
    }

    @ObfuscatedName("bf.ge(Lcz;III)V")
    public static void method1073(class85 arg0, int arg1, int arg2) {
        if (arg0.field1149 == arg1 && arg1 != -1) {
            int var3 = class191.method3011(arg1).field2162;
            if (var3 == 1) {
                arg0.field1150 = 0;
                arg0.field1137 = 0;
                arg0.field1152 = arg2;
                arg0.field1153 = 0;
            }
            if (var3 == 2) {
                arg0.field1153 = 0;
            }
        } else if (arg1 == -1 || arg0.field1149 == -1 || class191.method3011(arg1).field2156 >= class191.method3011(arg0.field1149).field2156) {
            arg0.field1149 = arg1;
            arg0.field1150 = 0;
            arg0.field1137 = 0;
            arg0.field1152 = arg2;
            arg0.field1153 = 0;
            arg0.field1171 = arg0.field1177;
        }
    }

    @ObfuscatedName("client.gx(B)I")
    public static int method1550() {
        return field725 ? 2 : 1;
    }

    @ObfuscatedName("es.gp(II)V")
    public static void method2703(int arg0) {
        field602 = 0L;
        if (arg0 >= 2) {
            field725 = true;
        } else {
            field725 = false;
        }
        if (method1550() == 1) {
            Statics.field1515.method418(765, 503);
        } else {
            Statics.field1515.method418(7680, 2160);
        }
        if (field501 >= 25) {
            method15();
        }
    }

    @ObfuscatedName("b.gy(B)V")
    public static void method15() {
        class265 var0 = class265.method3935(class263.field3001, field685.field1328);
        var0.field3019.method6954(method1550());
        var0.field3019.method6955(Statics.field1798);
        var0.field3019.method6955(Statics.field4019);
        field685.method2395(var0);
    }

    @ObfuscatedName("client.p(I)V")
    public final void method425() {
        field602 = class270.method2724() + 500L;
        this.method1087();
        if (field523 != -1) {
            this.method1093(true);
        }
    }

    @ObfuscatedName("client.ga(I)V")
    public void method1087() {
        int var1 = Statics.field1798;
        int var2 = Statics.field4019;
        if (this.field196 < var1) {
            int var3 = this.field196;
        }
        if (this.field197 < var2) {
            int var4 = this.field197;
        }
        if (Statics.field1541 == null) {
            return;
        }
        try {
            client var5 = Statics.field1515;
            Object[] var6 = new Object[] { method1550() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gu(S)V")
    public final void method1088() {
        if (field523 != -1) {
            method2558(field523);
        }
        for (int var1 = 0; var1 < field714; var1++) {
            if (field716[var1]) {
                field717[var1] = true;
            }
            field718[var1] = field716[var1];
            field716[var1] = false;
        }
        field541 = field507;
        field672 = -1;
        field656 = -1;
        Statics.field4026 = null;
        if (field523 != -1) {
            field714 = 0;
            method2704(field523, 0, 0, Statics.field1798, Statics.field4019, 0, 0, -1);
        }
        class447.method7310();
        if (field735) {
            if (field538 == 1) {
                Statics.field53[field608 / 100].method7474(field606 - 8, field607 - 8);
            }
            if (field538 == 2) {
                Statics.field53[field608 / 100 + 4].method7474(field606 - 8, field607 - 8);
            }
        }
        if (field642) {
            method4981();
        } else if (field672 != -1) {
            method2420(field672, field656);
        }
        if (field583 == 3) {
            for (int var2 = 0; var2 < field714; var2++) {
                if (field718[var2]) {
                    class447.method7257(field646[var2], field720[var2], field673[var2], field617[var2], 16711935, 128);
                } else if (field717[var2]) {
                    class447.method7257(field646[var2], field720[var2], field673[var2], field617[var2], 16711680, 128);
                }
            }
        }
        int var3 = Statics.field99;
        int var4 = Statics.field4004.field1132;
        int var5 = Statics.field4004.field1116;
        int var6 = field557;
        for (class63 var7 = (class63) class63.field814.method5540(); var7 != null; var7 = (class63) class63.field814.method5534()) {
            if (var7.field810 != -1 || var7.field821 != null) {
                int var8 = 0;
                if (var4 > var7.field817) {
                    var8 += var4 - var7.field817;
                } else if (var4 < var7.field812) {
                    var8 += var7.field812 - var4;
                }
                if (var5 > var7.field820) {
                    var8 += var5 - var7.field820;
                } else if (var5 < var7.field813) {
                    var8 += var7.field813 - var5;
                }
                if (var8 - 64 > var7.field815 || Statics.field1541.method2166() == 0 || var7.field816 != var3) {
                    if (var7.field818 != null) {
                        Statics.field1985.method637(var7.field818);
                        var7.field818 = null;
                    }
                    if (var7.field823 != null) {
                        Statics.field1985.method637(var7.field823);
                        var7.field823 = null;
                    }
                } else {
                    var8 -= 64;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = (var7.field815 - var8) * Statics.field1541.method2166() / var7.field815;
                    class35 var10000;
                    if (var7.field818 != null) {
                        var7.field818.method889(var9);
                    } else if (var7.field810 >= 0) {
                        var10000 = (class35) null;
                        class35 var10 = class35.method652(Statics.field1965, var7.field810, 0);
                        if (var10 != null) {
                            class36 var11 = var10.method649().method658(Statics.field2355);
                            class43 var12 = class43.method855(var11, 100, var9);
                            var12.method848(-1);
                            Statics.field1985.method623(var12);
                            var7.field818 = var12;
                        }
                    }
                    if (var7.field823 != null) {
                        var7.field823.method889(var9);
                        if (!var7.field823.method6504()) {
                            var7.field823 = null;
                        }
                    } else if (var7.field821 != null && (var7.field822 -= var6) <= 0) {
                        int var13 = (int) (Math.random() * (double) var7.field821.length);
                        var10000 = (class35) null;
                        class35 var14 = class35.method652(Statics.field1965, var7.field821[var13], 0);
                        if (var14 != null) {
                            class36 var15 = var14.method649().method658(Statics.field2355);
                            class43 var16 = class43.method855(var15, 100, var9);
                            var16.method848(0);
                            Statics.field1985.method623(var16);
                            var7.field823 = var16;
                            var7.field822 = var7.field819 + (int) (Math.random() * (double) (var7.field811 - var7.field819));
                        }
                    }
                }
            }
        }
        field557 = 0;
    }

    @ObfuscatedName("jb.gd(Ljava/lang/String;ZI)V")
    public static final void method4903(String arg0, boolean arg1) {
        if (!field620) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field68.method5743(arg0, 250);
        int var6 = Statics.field68.method5744(arg0, 250) * 13;
        class447.method7249(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class447.method7262(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field68.method5751(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2226(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field4530.method402(0, 0);
        } else {
            method2000(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("gw.gq(IIIII)V")
    public static final void method3487(int arg0, int arg1, int arg2, int arg3) {
        field615++;
        if (Statics.field4004.field1132 >> 7 == field540 && Statics.field4004.field1116 >> 7 == field764) {
            field540 = 0;
        }
        Statics.method4680();
        if (field660 >= 0 && field621[field660] != null) {
            method1968(field621[field660], false);
        }
        method4909(true);
        method2346();
        method4909(false);
        for (class70 var4 = (class70) field636.method5540(); var4 != null; var4 = (class70) field636.method5534()) {
            if (Statics.field99 != var4.field922 || field507 > var4.field923) {
                var4.method6503();
            } else if (field507 >= var4.field927) {
                if (var4.field931 > 0) {
                    class92 var5 = field560[var4.field931 - 1];
                    if (var5 != null && var5.field1132 >= 0 && var5.field1132 < 13312 && var5.field1116 >= 0 && var5.field1116 < 13312) {
                        var4.method1878(var5.field1132, var5.field1116, method3938(var5.field1132, var5.field1116, var4.field922) - var4.field938, field507);
                    }
                }
                if (var4.field931 < 0) {
                    int var6 = -var4.field931 - 1;
                    class85 var7;
                    if (field622 == var6) {
                        var7 = Statics.field4004;
                    } else {
                        var7 = field621[var6];
                    }
                    if (var7 != null && var7.field1132 >= 0 && var7.field1132 < 13312 && var7.field1116 >= 0 && var7.field1116 < 13312) {
                        var4.method1878(var7.field1132, var7.field1116, method3938(var7.field1132, var7.field1116, var4.field922) - var4.field938, field507);
                    }
                }
                var4.method1879(field557);
                Statics.field1005.method4265(Statics.field99, (int) var4.field933, (int) var4.field934, (int) var4.field948, 60, var4, var4.field941, -1L, false);
            }
        }
        method2691();
        method211(arg0, arg1, arg2, arg3, true);
        int var8 = field769;
        int var9 = field770;
        int var10 = field771;
        int var11 = field635;
        class447.method7250(var8, var9, var8 + var10, var9 + var11);
        class231.method4165();
        int var12 = field641;
        if (field719 / 256 > var12) {
            var12 = field719 / 256;
        }
        if (field547[4] && field637[4] + 128 > var12) {
            var12 = field637[4] + 128;
        }
        int var13 = field730 & 0x7FF;
        int var14 = Statics.field50;
        int var15 = Statics.field398;
        int var16 = Statics.field3003;
        int var17 = var12 * 3 + 600;
        int var19 = method159(var17, var11);
        int var20 = 2048 - var12 & 0x7FF;
        int var21 = 2048 - var13 & 0x7FF;
        int var22 = 0;
        int var23 = 0;
        int var24 = var19;
        if (var20 != 0) {
            int var25 = class231.field2576[var20];
            int var26 = class231.field2551[var20];
            int var27 = var23 * var26 - var19 * var25 >> 16;
            var24 = var23 * var25 + var19 * var26 >> 16;
            var23 = var27;
        }
        if (var21 != 0) {
            int var28 = class231.field2576[var21];
            int var29 = class231.field2551[var21];
            int var30 = var22 * var29 + var24 * var28 >> 16;
            var24 = var24 * var29 - var22 * var28 >> 16;
            var22 = var30;
        }
        if (field754) {
            Statics.field1254 = var14 - var22;
            Statics.field295 = var15 - var23;
            Statics.field1838 = var16 - var24;
            Statics.field2066 = var12;
            Statics.field117 = var13;
        } else {
            Statics.field2213 = var14 - var22;
            Statics.field1016 = var15 - var23;
            Statics.field1694 = var16 - var24;
            Statics.field1647 = var12;
            Statics.field111 = var13;
        }
        if (field580 == 1 && field676 >= 2 && field507 % 50 == 0 && (Statics.field50 >> 7 != Statics.field4004.field1132 >> 7 || Statics.field3003 >> 7 != Statics.field4004.field1116 >> 7)) {
            int var31 = Statics.field4004.field1092;
            int var32 = (Statics.field50 >> 7) + Statics.field489;
            int var33 = (Statics.field3003 >> 7) + Statics.field1843;
            method3282(var32, var33, var31, true);
        }
        int var46;
        if (field754) {
            int var47;
            if (Statics.field1541.method2159()) {
                var47 = Statics.field99;
            } else {
                int var48 = method3938(Statics.field2213, Statics.field1694, Statics.field99);
                if (var48 - Statics.field1016 >= 800 || (class75.field985[Statics.field99][Statics.field2213 >> 7][Statics.field1694 >> 7] & 0x4) == 0) {
                    var47 = 3;
                } else {
                    var47 = Statics.field99;
                }
            }
            var46 = var47;
        } else {
            int var34;
            if (Statics.field1541.method2159()) {
                var34 = Statics.field99;
            } else {
                label338: {
                    int var35 = 3;
                    if (Statics.field1647 < 310) {
                        label335: {
                            int var36;
                            int var37;
                            if (field580 == 1) {
                                var36 = Statics.field50 >> 7;
                                var37 = Statics.field3003 >> 7;
                            } else {
                                var36 = Statics.field4004.field1132 >> 7;
                                var37 = Statics.field4004.field1116 >> 7;
                            }
                            int var38 = Statics.field2213 >> 7;
                            int var39 = Statics.field1694 >> 7;
                            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                                if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                                    if ((class75.field985[Statics.field99][var38][var39] & 0x4) != 0) {
                                        var35 = Statics.field99;
                                    }
                                    int var40;
                                    if (var36 > var38) {
                                        var40 = var36 - var38;
                                    } else {
                                        var40 = var38 - var36;
                                    }
                                    int var41;
                                    if (var37 > var39) {
                                        var41 = var37 - var39;
                                    } else {
                                        var41 = var39 - var37;
                                    }
                                    if (var40 > var41) {
                                        int var42 = var41 * 65536 / var40;
                                        int var43 = 32768;
                                        while (true) {
                                            if (var36 == var38) {
                                                break label335;
                                            }
                                            if (var38 < var36) {
                                                var38++;
                                            } else if (var38 > var36) {
                                                var38--;
                                            }
                                            if ((class75.field985[Statics.field99][var38][var39] & 0x4) != 0) {
                                                var35 = Statics.field99;
                                            }
                                            var43 += var42;
                                            if (var43 >= 65536) {
                                                var43 -= 65536;
                                                if (var39 < var37) {
                                                    var39++;
                                                } else if (var39 > var37) {
                                                    var39--;
                                                }
                                                if ((class75.field985[Statics.field99][var38][var39] & 0x4) != 0) {
                                                    var35 = Statics.field99;
                                                }
                                            }
                                        }
                                    } else {
                                        if (var41 > 0) {
                                            int var44 = var40 * 65536 / var41;
                                            int var45 = 32768;
                                            while (var37 != var39) {
                                                if (var39 < var37) {
                                                    var39++;
                                                } else if (var39 > var37) {
                                                    var39--;
                                                }
                                                if ((class75.field985[Statics.field99][var38][var39] & 0x4) != 0) {
                                                    var35 = Statics.field99;
                                                }
                                                var45 += var44;
                                                if (var45 >= 65536) {
                                                    var45 -= 65536;
                                                    if (var38 < var36) {
                                                        var38++;
                                                    } else if (var38 > var36) {
                                                        var38--;
                                                    }
                                                    if ((class75.field985[Statics.field99][var38][var39] & 0x4) != 0) {
                                                        var35 = Statics.field99;
                                                    }
                                                }
                                            }
                                        }
                                        break label335;
                                    }
                                }
                                var34 = Statics.field99;
                                break label338;
                            }
                            var34 = Statics.field99;
                            break label338;
                        }
                    }
                    if (Statics.field4004.field1132 >= 0 && Statics.field4004.field1116 >= 0 && Statics.field4004.field1132 < 13312 && Statics.field4004.field1116 < 13312) {
                        if ((class75.field985[Statics.field99][Statics.field4004.field1132 >> 7][Statics.field4004.field1116 >> 7] & 0x4) != 0) {
                            var35 = Statics.field99;
                        }
                        var34 = var35;
                    } else {
                        var34 = Statics.field99;
                    }
                }
            }
            var46 = var34;
        }
        int var49 = Statics.field2213;
        int var50 = Statics.field1016;
        int var51 = Statics.field1694;
        int var52 = Statics.field1647;
        int var53 = Statics.field111;
        for (int var54 = 0; var54 < 5; var54++) {
            if (field547[var54]) {
                int var55 = (int) (Math.random() * (double) (field757[var54] * 2 + 1) - (double) field757[var54] + Math.sin((double) field675[var54] / 100.0D * (double) field601[var54]) * (double) field637[var54]);
                if (var54 == 0) {
                    Statics.field2213 += var55;
                }
                if (var54 == 1) {
                    Statics.field1016 += var55;
                }
                if (var54 == 2) {
                    Statics.field1694 += var55;
                }
                if (var54 == 3) {
                    Statics.field111 = Statics.field111 + var55 & 0x7FF;
                }
                if (var54 == 4) {
                    Statics.field1647 += var55;
                    if (Statics.field1647 < 128) {
                        Statics.field1647 = 128;
                    }
                    if (Statics.field1647 > 383) {
                        Statics.field1647 = 383;
                    }
                }
            }
        }
        int var56 = class33.field229;
        int var57 = class33.field230;
        if (class33.field220 != 0) {
            var56 = class33.field237;
            var57 = class33.field234;
        }
        if (var56 >= var8 && var56 < var8 + var10 && var57 >= var9 && var57 < var9 + var11) {
            int var58 = var56 - var8;
            int var59 = var57 - var9;
            class242.field2800 = var58;
            class242.field2801 = var59;
            class242.field2799 = true;
            class242.field2807 = 0;
            class242.field2802 = false;
        } else {
            class242.method2010();
        }
        method2576();
        class447.method7249(var8, var9, var10, var11, 0);
        method2576();
        int var60 = class231.field2562;
        class231.field2562 = field773;
        Statics.field1005.method4294(Statics.field2213, Statics.field1016, Statics.field1694, Statics.field1647, Statics.field111, var46);
        class231.field2562 = var60;
        method2576();
        Statics.field1005.method4268();
        method2004(var8, var9, var10, var11);
        method153(var8, var9);
        ((class239) Statics.field2573).method4459(field557);
        method4661();
        Statics.field2213 = var49;
        Statics.field1016 = var50;
        Statics.field1694 = var51;
        Statics.field1647 = var52;
        Statics.field111 = var53;
        if (field506) {
            byte var61 = 0;
            int var62 = class317.field3987 + class317.field3984 + var61;
            if (var62 == 0) {
                field506 = false;
            }
        }
        if (field506) {
            class447.method7249(var8, var9, var10, var11, 0);
            method4903(class309.field3602, false);
        }
    }

    @ObfuscatedName("t.gg(IIIIZI)V")
    public static final void method211(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field761;
        } else if (var5 >= 100) {
            var6 = field762;
        } else {
            var6 = (field762 - field761) * var5 / 100 + field761;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field767) {
            short var8 = field767;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field766) {
                var6 = field766;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class447.method7310();
                    class447.method7249(arg0, arg1, var10, arg3, -16777216);
                    class447.method7249(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field667) {
            short var11 = field667;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field765) {
                var6 = field765;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class447.method7310();
                    class447.method7249(arg0, arg1, arg2, var13, -16777216);
                    class447.method7249(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field773 = arg3 * var6 / 334;
        if (field771 != arg2 || field635 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var19 = class231.field2576[var16];
                int var20 = method159(var17, arg3);
                var14[var15] = var19 * var20 >> 16;
            }
            class234.method4414(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field769 = arg0;
        field770 = arg1;
        field771 = arg2;
        field635 = arg3;
    }

    @ObfuscatedName("cj.gz(I)V")
    public static void method2346() {
        int var0 = class97.field1276;
        int[] var1 = class97.field1275;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field660 != var1[var2] && field622 != var1[var2]) {
                method1968(field621[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("bz.gr(Lcz;ZI)V")
    public static void method1968(class85 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2022() || arg0.field1085) {
            return;
        }
        arg0.field1074 = false;
        if ((field503 && class97.field1276 > 50 || class97.field1276 > 200) && arg1 && arg0.field1146 == arg0.field1121) {
            arg0.field1074 = true;
        }
        int var2 = arg0.field1132 >> 7;
        int var3 = arg0.field1116 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class242.method4607(0, 0, 0, false, arg0.field1093);
        if (arg0.field1084 != null && field507 >= arg0.field1079 && field507 < arg0.field1080) {
            arg0.field1074 = false;
            arg0.field1075 = method3938(arg0.field1132, arg0.field1116, Statics.field99);
            arg0.field1120 = field507;
            Statics.field1005.method4266(Statics.field99, arg0.field1132, arg0.field1116, arg0.field1075, 60, arg0, arg0.field1159, var4, arg0.field1088, arg0.field1086, arg0.field1087, arg0.field1072);
            return;
        }
        if ((arg0.field1132 & 0x7F) == 64 && (arg0.field1116 & 0x7F) == 64) {
            if (field615 == field535[var2][var3]) {
                return;
            }
            field535[var2][var3] = field615;
        }
        arg0.field1075 = method3938(arg0.field1132, arg0.field1116, Statics.field99);
        arg0.field1120 = field507;
        Statics.field1005.method4265(Statics.field99, arg0.field1132, arg0.field1116, arg0.field1075, 60, arg0, arg0.field1159, var4, arg0.field1163);
    }

    @ObfuscatedName("jb.gk(ZI)V")
    public static final void method4909(boolean arg0) {
        for (int var1 = 0; var1 < field546; var1++) {
            class92 var2 = field560[field570[var1]];
            if (var2 != null && var2.method2022() && var2.field1235.field1918 == arg0 && var2.field1235.method3192()) {
                int var3 = var2.field1132 >> 7;
                int var4 = var2.field1116 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1151 == 1 && (var2.field1132 & 0x7F) == 64 && (var2.field1116 & 0x7F) == 64) {
                        if (field615 == field535[var3][var4]) {
                            continue;
                        }
                        field535[var3][var4] = field615;
                    }
                    long var5 = class242.method4607(0, 0, 1, !var2.field1235.field1908, field570[var1]);
                    var2.field1120 = field507;
                    Statics.field1005.method4265(Statics.field99, var2.field1132, var2.field1116, method3938(var2.field1132 + (var2.field1151 * 64 - 64), var2.field1116 + (var2.field1151 * 64 - 64), Statics.field99), var2.field1151 * 64 - 64 + 60, var2, var2.field1159, var5, var2.field1163);
                }
            }
        }
    }

    @ObfuscatedName("dq.he(I)V")
    public static final void method2691() {
        for (class65 var0 = (class65) field744.method5540(); var0 != null; var0 = (class65) field744.method5534()) {
            if (Statics.field99 != var0.field850 || var0.field852) {
                var0.method6503();
            } else if (field507 >= var0.field851) {
                var0.method1811(field557);
                if (var0.field852) {
                    var0.method6503();
                } else {
                    Statics.field1005.method4265(var0.field850, var0.field855, var0.field854, var0.field859, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("w.hz(III)V")
    public static final void method153(int arg0, int arg1) {
        if (field514 == 2) {
            method3242((field517 - Statics.field489 << 7) + field520, (field518 - Statics.field1843 << 7) + field521, field519 * 2);
            if (field604 > -1 && field507 % 20 < 10) {
                Statics.field1802[0].method7474(field604 + arg0 - 12, field605 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ft.hj(B)Z")
    public static boolean method3197() {
        return (field626 & 0x4) != 0;
    }

    @ObfuscatedName("cj.hl(B)Z")
    public static boolean method2324() {
        return (field626 & 0x1) != 0;
    }

    @ObfuscatedName("s.hn(I)Z")
    public static boolean method34() {
        return (field626 & 0x8) != 0;
    }

    @ObfuscatedName("jd.ho(Lcz;I)Z")
    public static boolean method4676(class85 arg0) {
        if (field626 == 0) {
            return false;
        } else if (Statics.field4004 == arg0) {
            return method34();
        } else {
            boolean var1 = method3197() || method2324() && arg0.method2037();
            if (!var1) {
                boolean var2 = (field626 & 0x2) != 0;
                var1 = var2 && arg0.method2027();
            }
            return var1;
        }
    }

    @ObfuscatedName("bl.hr(Lcb;IIIIII)V")
    public static final void method1021(class87 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2022()) {
            return;
        }
        if (arg0 instanceof class92) {
            class179 var6 = ((class92) arg0).field1235;
            if (var6.field1921 != null) {
                var6 = var6.method3169();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1276;
        int[] var8 = class97.field1275;
        byte var9 = 0;
        if (arg1 < var7 && field507 == arg0.field1120 && method4676((class85) arg0)) {
            class85 var10 = (class85) arg0;
            if (arg1 < var7) {
                method2266(arg0, arg0.field1167 + 15);
                class345 var11 = (class345) field556.get(class416.field4529);
                byte var12 = 9;
                var11.method5750(var10.field1073.method7528(), field604 + arg2, field605 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field1154.method5578()) {
            method2266(arg0, arg0.field1167 + 15);
            for (class91 var14 = (class91) arg0.field1154.method5574(); var14 != null; var14 = (class91) arg0.field1154.method5619()) {
                class88 var15 = var14.method2241(field507);
                if (var15 != null) {
                    class175 var16 = var14.field1231;
                    class451 var17 = var16.method3133();
                    class451 var18 = var16.method3126();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field1871;
                    } else {
                        if (var16.field1872 * 2 < var18.field4719) {
                            var19 = var16.field1872;
                        }
                        var20 = var18.field4719 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field507 - var15.field1191;
                    int var24 = var15.field1187 * var20 / var16.field1871;
                    int var27;
                    if (var15.field1189 > var23) {
                        int var25 = var16.field1867 == 0 ? 0 : var23 / var16.field1867 * var16.field1867;
                        int var26 = var15.field1186 * var20 / var16.field1871;
                        var27 = (var24 - var26) * var25 / var15.field1189 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1189 + var16.field1868 - var23;
                        if (var16.field1866 >= 0) {
                            var21 = (var28 << 8) / (var16.field1868 - var16.field1866);
                        }
                    }
                    if (var15.field1187 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field604 > -1) {
                            int var34 = field604 + arg2 - (var20 >> 1);
                            int var35 = field605 + arg3 - var13;
                            class447.method7249(var34, var35, var27, 5, 65280);
                            class447.method7249(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field4710;
                        var13 += var30;
                        int var31 = field604 + arg2 - (var20 >> 1);
                        int var32 = field605 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method7366(var33, var32, var21);
                            class447.method7251(var33, var32, var29 + var33, var30 + var32);
                            var18.method7366(var33, var32, var21);
                        } else {
                            var17.method7474(var33, var32);
                            class447.method7251(var33, var32, var29 + var33, var30 + var32);
                            var18.method7474(var33, var32);
                        }
                        class447.method7250(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method2236()) {
                    var14.method6503();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class85 var37 = (class85) arg0;
            if (var37.field1085) {
                return;
            }
            if (var37.field1070 != -1 || var37.field1097 != -1) {
                method2266(arg0, arg0.field1167 + 15);
                if (field604 > -1) {
                    if (var37.field1070 != -1) {
                        var36 += 25;
                        Statics.field1675[var37.field1070].method7474(field604 + arg2 - 12, field605 + arg3 - var36);
                    }
                    if (var37.field1097 != -1) {
                        var36 += 25;
                        Statics.field2854[var37.field1097].method7474(field604 + arg2 - 12, field605 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field514 == 10 && field738 == var8[arg1]) {
                method2266(arg0, arg0.field1167 + 15);
                if (field604 > -1) {
                    int var38 = Statics.field1802[1].field4710 + var36;
                    Statics.field1802[1].method7474(field604 + arg2 - 12, field605 + arg3 - var38);
                }
            }
        } else {
            class179 var39 = ((class92) arg0).field1235;
            if (var39.field1921 != null) {
                var39 = var39.method3169();
            }
            if (var39.field1914 >= 0 && var39.field1914 < Statics.field2854.length) {
                method2266(arg0, arg0.field1167 + 15);
                if (field604 > -1) {
                    Statics.field2854[var39.field1914].method7474(field604 + arg2 - 12, field605 + arg3 - 30);
                }
            }
            if (field514 == 1 && field515 == field570[arg1 - var7] && field507 % 20 < 10) {
                method2266(arg0, arg0.field1167 + 15);
                if (field604 > -1) {
                    Statics.field1802[0].method7474(field604 + arg2 - 12, field605 + arg3 - 28);
                }
            }
        }
        if (arg0.field1129 != null && (arg1 >= var7 || !arg0.field1131 && (field727 == 4 || !arg0.field1160 && (field727 == 0 || field727 == 3 || field727 == 1 && ((class85) arg0).method2037())))) {
            method2266(arg0, arg0.field1167);
            if (field604 > -1 && field592 < field593) {
                field597[field592] = Statics.field2183.method5741(arg0.field1129) / 2;
                field596[field592] = Statics.field2183.field4117;
                field594[field592] = field604;
                field595[field592] = field605;
                field598[field592] = arg0.field1143;
                field599[field592] = arg0.field1182;
                field772[field592] = arg0.field1138;
                field528[field592] = arg0.field1129;
                field592++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field1155[var40];
            int var42 = arg0.field1181[var40];
            class187 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field507) {
                    continue;
                }
                var43 = class187.method2480(arg0.field1181[var40]);
                var44 = var43.field1999;
                if (var43 != null && var43.field2010 != null) {
                    var43 = var43.method3286();
                    if (var43 == null) {
                        arg0.field1155[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field1139[var40];
            class187 var46 = null;
            if (var45 >= 0) {
                var46 = class187.method2480(var45);
                if (var46 != null && var46.field2010 != null) {
                    var46 = var46.method3286();
                }
            }
            if (var41 - var44 <= field507) {
                if (var43 == null) {
                    arg0.field1155[var40] = -1;
                } else {
                    method2266(arg0, arg0.field1167 / 2);
                    if (field604 > -1) {
                        if (var40 == 1) {
                            field605 -= 20;
                        }
                        if (var40 == 2) {
                            field604 -= 15;
                            field605 -= 10;
                        }
                        if (var40 == 3) {
                            field604 += 15;
                            field605 -= 10;
                        }
                        Object var47 = null;
                        Object var48 = null;
                        Object var49 = null;
                        Object var50 = null;
                        int var51 = 0;
                        int var52 = 0;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        class451 var59 = null;
                        class451 var60 = null;
                        class451 var61 = null;
                        class451 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class451 var72 = var43.method3288();
                        if (var72 != null) {
                            var51 = var72.field4719;
                            int var73 = var72.field4710;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field4712;
                        }
                        class451 var74 = var43.method3303();
                        if (var74 != null) {
                            var52 = var74.field4719;
                            int var75 = var74.field4710;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field4712;
                        }
                        class451 var76 = var43.method3289();
                        if (var76 != null) {
                            var53 = var76.field4719;
                            int var77 = var76.field4710;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field4712;
                        }
                        class451 var78 = var43.method3290();
                        if (var78 != null) {
                            var54 = var78.field4719;
                            int var79 = var78.field4710;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field4712;
                        }
                        if (var46 != null) {
                            var59 = var46.method3288();
                            if (var59 != null) {
                                var63 = var59.field4719;
                                int var80 = var59.field4710;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field4712;
                            }
                            var60 = var46.method3303();
                            if (var60 != null) {
                                var64 = var60.field4719;
                                int var81 = var60.field4710;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field4712;
                            }
                            var61 = var46.method3289();
                            if (var61 != null) {
                                var65 = var61.field4719;
                                int var82 = var61.field4710;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field4712;
                            }
                            var62 = var46.method3290();
                            if (var62 != null) {
                                var66 = var62.field4719;
                                int var83 = var62.field4710;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field4712;
                            }
                        }
                        class344 var84 = var43.method3316();
                        if (var84 == null) {
                            var84 = Statics.field1371;
                        }
                        class344 var85;
                        if (var46 == null) {
                            var85 = Statics.field1371;
                        } else {
                            var85 = var46.method3316();
                            if (var85 == null) {
                                var85 = Statics.field1371;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method3305(arg0.field1118[var40]);
                        int var91 = var84.method5741(var90);
                        if (var46 != null) {
                            var87 = var46.method3305(arg0.field1140[var40]);
                            var89 = var85.method5741(var87);
                        }
                        int var92 = 0;
                        int var93 = 0;
                        if (var52 > 0) {
                            if (var76 == null && var78 == null) {
                                var92 = 1;
                            } else {
                                var92 = var91 / var52 + 1;
                            }
                        }
                        if (var46 != null && var64 > 0) {
                            if (var61 == null && var62 == null) {
                                var93 = 1;
                            } else {
                                var93 = var89 / var64 + 1;
                            }
                        }
                        int var94 = 0;
                        int var95 = var94;
                        if (var51 > 0) {
                            var94 += var51;
                        }
                        var94 += 2;
                        int var96 = var94;
                        if (var53 > 0) {
                            var94 += var53;
                        }
                        int var97 = var94;
                        int var98 = var94;
                        int var100;
                        if (var52 > 0) {
                            int var99 = var52 * var92;
                            var100 = var94 + var99;
                            var98 = (var99 - var91) / 2 + var94;
                        } else {
                            var100 = var91 + var94;
                        }
                        int var101 = var100;
                        if (var54 > 0) {
                            var100 += var54;
                        }
                        int var102 = 0;
                        int var103 = 0;
                        int var104 = 0;
                        int var105 = 0;
                        int var106 = 0;
                        if (var46 != null) {
                            var100 += 2;
                            var102 = var100;
                            if (var63 > 0) {
                                var100 += var63;
                            }
                            var100 += 2;
                            var103 = var100;
                            if (var65 > 0) {
                                var100 += var65;
                            }
                            var104 = var100;
                            var106 = var100;
                            if (var64 > 0) {
                                int var107 = var64 * var93;
                                var100 += var107;
                                var106 += (var107 - var89) / 2;
                            } else {
                                var100 += var89;
                            }
                            var105 = var100;
                            if (var66 > 0) {
                                var100 += var66;
                            }
                        }
                        int var108 = arg0.field1155[var40] - field507;
                        int var109 = var43.field2004 - var43.field2004 * var108 / var43.field1999;
                        int var110 = var43.field2005 * var108 / var43.field1999 + -var43.field2005;
                        int var111 = field604 + arg2 - (var100 >> 1) + var109;
                        int var112 = field605 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field2012 + var112 + 15;
                        int var116 = var115 - var84.field4118;
                        int var117 = var84.field4126 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field2012 + var112 + 15;
                            int var119 = var118 - var85.field4118;
                            int var120 = var85.field4126 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field2006 >= 0) {
                            var123 = (var108 << 8) / (var43.field1999 - var43.field2006);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method7366(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method7366(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method7366(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method7366(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5748(var90, var98 + var111, var115, var43.field1998, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method7366(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method7366(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method7366(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method7366(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5748(var87, var106 + var111, var118, var46.field1998, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method7474(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method7474(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method7474(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method7474(var101 + var111 - var58, var112);
                            }
                            var84.method5782(var90, var98 + var111, var115, var43.field1998 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method7474(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method7474(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method7474(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method7474(var105 + var111 - var70, var112);
                                }
                                var85.method5782(var87, var106 + var111, var118, var46.field1998 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.hm(IIIII)V")
    public static final void method2004(int arg0, int arg1, int arg2, int arg3) {
        field592 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class97.field1276;
        int[] var8 = class97.field1275;
        for (int var9 = 0; var9 < field546 + var7; var9++) {
            class87 var10;
            if (var9 < var7) {
                var10 = field621[var8[var9]];
                if (field660 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field4004 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field560[field570[var9 - var7]];
            }
            method1021(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field502 && var6 != -1) {
            method1021(Statics.field4004, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1021(field621[field660], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field592; var11++) {
            int var12 = field594[var11];
            int var13 = field595[var11];
            int var14 = field597[var11];
            int var15 = field596[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field595[var17] - field596[var17] && var13 - var15 < field595[var17] + 2 && var12 - var14 < field597[var17] + field594[var17] && var12 + var14 > field594[var17] - field597[var17] && field595[var17] - field596[var17] < var13) {
                        var13 = field595[var17] - field596[var17];
                        var16 = true;
                    }
                }
            }
            field604 = field594[var11];
            field605 = field595[var11] = var13;
            String var18 = field528[var11];
            if (field603 == 0) {
                int var19 = 16776960;
                if (field598[var11] < 6) {
                    var19 = field726[field598[var11]];
                }
                if (field598[var11] == 6) {
                    var19 = field615 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field598[var11] == 7) {
                    var19 = field615 % 20 < 10 ? 255 : 65535;
                }
                if (field598[var11] == 8) {
                    var19 = field615 % 20 < 10 ? 45056 : 8454016;
                }
                if (field598[var11] == 9) {
                    int var20 = 150 - field772[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field598[var11] == 10) {
                    int var21 = 150 - field772[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field598[var11] == 11) {
                    int var22 = 150 - field772[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field599[var11] == 0) {
                    Statics.field2183.method5750(var18, field604 + arg0, field605 + arg1, var19, 0);
                }
                if (field599[var11] == 1) {
                    Statics.field2183.method5754(var18, field604 + arg0, field605 + arg1, var19, 0, field615);
                }
                if (field599[var11] == 2) {
                    Statics.field2183.method5802(var18, field604 + arg0, field605 + arg1, var19, 0, field615);
                }
                if (field599[var11] == 3) {
                    Statics.field2183.method5752(var18, field604 + arg0, field605 + arg1, var19, 0, field615, 150 - field772[var11]);
                }
                if (field599[var11] == 4) {
                    int var23 = (150 - field772[var11]) * (Statics.field2183.method5741(var18) + 100) / 150;
                    class447.method7251(field604 + arg0 - 50, arg1, field604 + arg0 + 50, arg1 + arg3);
                    Statics.field2183.method5782(var18, field604 + arg0 + 50 - var23, field605 + arg1, var19, 0);
                    class447.method7250(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field599[var11] == 5) {
                    int var24 = 150 - field772[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class447.method7251(arg0, field605 + arg1 - Statics.field2183.field4117 - 1, arg0 + arg2, field605 + arg1 + 5);
                    Statics.field2183.method5750(var18, field604 + arg0, field605 + arg1 + var25, var19, 0);
                    class447.method7250(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2183.method5750(var18, field604 + arg0, field605 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("jc.ht(I)V")
    public static final void method4661() {
        field619 = 0;
        int var0 = (Statics.field4004.field1132 >> 7) + Statics.field489;
        int var1 = (Statics.field4004.field1116 >> 7) + Statics.field1843;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field619 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field619 = 1;
        }
        if (field619 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field619 = 0;
        }
    }

    @ObfuscatedName("cq.hd(Lcb;II)V")
    public static final void method2266(class87 arg0, int arg1) {
        method3242(arg0.field1132, arg0.field1116, arg1);
    }

    @ObfuscatedName("gi.hq(IIII)V")
    public static final void method3242(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field604 = -1;
            field605 = -1;
            return;
        }
        int var3 = method3938(arg0, arg1, Statics.field99) - arg2;
        int var4 = arg0 - Statics.field2213;
        int var5 = var3 - Statics.field1016;
        int var6 = arg1 - Statics.field1694;
        int var7 = class231.field2576[Statics.field1647];
        int var8 = class231.field2551[Statics.field1647];
        int var9 = class231.field2576[Statics.field111];
        int var10 = class231.field2551[Statics.field111];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field604 = field773 * var11 / var15 + field771 / 2;
            field605 = field773 * var14 / var15 + field635 / 2;
        } else {
            field604 = -1;
            field605 = -1;
        }
    }

    @ObfuscatedName("ho.hw(IIII)I")
    public static final int method3938(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class75.field985[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class75.field988[var5][var3][var4] + class75.field988[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class75.field988[var5][var3][var4 + 1] + class75.field988[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("k.hs(IIB)I")
    public static int method159(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field610 - field763) * var2 / 100 + field763;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("kt.hi(ZLpz;B)V")
    public static final void method5220(boolean arg0, class437 arg1) {
        field563 = arg0;
        if (!field563) {
            int var2 = arg1.method7011();
            int var3 = arg1.method7011();
            int var4 = arg1.method7148();
            Statics.field2331 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2331[var5][var6] = arg1.method6976();
                }
            }
            Statics.field116 = new int[var4];
            Statics.field1811 = new int[var4];
            Statics.field1554 = new int[var4];
            Statics.field1294 = new byte[var4][];
            Statics.field978 = new byte[var4][];
            boolean var7 = false;
            if (field554) {
                if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
                    var7 = true;
                }
                if (var2 / 8 == 48 && var3 / 8 == 148) {
                    var7 = true;
                }
            }
            int var8 = 0;
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                for (int var10 = (var3 - 6) / 8; var10 <= (var3 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field116[var8] = var11;
                        Statics.field1811[var8] = Statics.field1288.method5293("m" + var9 + "_" + var10);
                        Statics.field1554[var8] = Statics.field1288.method5293("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method4113(var2, var3, true);
            return;
        }
        int var12 = arg1.method7012();
        int var13 = arg1.method7010();
        boolean var14 = arg1.method6971() == 1;
        int var15 = arg1.method7148();
        arg1.method6922();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method6923(1);
                    if (var19 == 1) {
                        field564[var16][var17][var18] = arg1.method6923(26);
                    } else {
                        field564[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method6914();
        Statics.field2331 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2331[var20][var21] = arg1.method6976();
            }
        }
        Statics.field116 = new int[var15];
        Statics.field1811 = new int[var15];
        Statics.field1554 = new int[var15];
        Statics.field1294 = new byte[var15][];
        Statics.field978 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field564[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field116[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field116[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1811[var22] = Statics.field1288.method5293("m" + var31 + "_" + var32);
                            Statics.field1554[var22] = Statics.field1288.method5293("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method4113(var13, var12, !var14);
    }

    @ObfuscatedName("hp.hx(IIZI)V")
    public static final void method4113(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1043 == arg0 && Statics.field1856 == arg1) {
            return;
        }
        Statics.field1043 = arg0;
        Statics.field1856 = arg1;
        method975(25);
        method4903(class309.field3602, true);
        int var3 = Statics.field489;
        int var4 = Statics.field1843;
        Statics.field489 = (arg0 - 6) * 8;
        Statics.field1843 = (arg1 - 6) * 8;
        int var5 = Statics.field489 - var3;
        int var6 = Statics.field1843 - var4;
        int var7 = Statics.field489;
        int var8 = Statics.field1843;
        for (int var9 = 0; var9 < 32768; var9++) {
            class92 var10 = field560[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1178[var11] -= var5;
                    var10.field1179[var11] -= var6;
                }
                var10.field1132 -= var5 * 128;
                var10.field1116 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class85 var13 = field621[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1178[var14] -= var5;
                    var13.field1179[var14] -= var6;
                }
                var13.field1132 -= var5 * 128;
                var13.field1116 -= var6 * 128;
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
                        field750[var25][var21][var22] = field750[var25][var23][var24];
                    } else {
                        field750[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class86 var26 = (class86) field665.method5540(); var26 != null; var26 = (class86) field665.method5534()) {
            var26.field1102 -= var5;
            var26.field1103 -= var6;
            if (var26.field1102 < 0 || var26.field1103 < 0 || var26.field1102 >= 104 || var26.field1103 >= 104) {
                var26.method6503();
            }
        }
        if (field540 != 0) {
            field540 -= var5;
            field764 -= var6;
        }
        field652 = 0;
        field754 = false;
        Statics.field2213 -= var5 << 7;
        Statics.field1694 -= var6 << 7;
        Statics.field50 -= var5 << 7;
        Statics.field3003 -= var6 << 7;
        field715 = -1;
        field744.method5526();
        field636.method5526();
        for (int var27 = 0; var27 < 4; var27++) {
            field568[var27].method3519();
        }
    }

    @ObfuscatedName("nj.hh(ZB)V")
    public static final void method6433(boolean arg0) {
        method2576();
        field685.field1324++;
        if (field685.field1324 < 50 && !arg0) {
            return;
        }
        field685.field1324 = 0;
        if (field552 || field685.method2380() == null) {
            return;
        }
        class265 var1 = class265.method3935(class263.field2951, field685.field1328);
        field685.method2395(var1);
        try {
            field685.method2375();
        } catch (IOException var3) {
            field552 = true;
        }
    }

    @ObfuscatedName("bw.hy(I)V")
    public static final void method1631() {
        method6433(false);
        field748 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1294.length; var1++) {
            if (Statics.field1811[var1] != -1 && Statics.field1294[var1] == null) {
                Statics.field1294[var1] = Statics.field1288.method5296(Statics.field1811[var1], 0);
                if (Statics.field1294[var1] == null) {
                    var0 = false;
                    field748++;
                }
            }
            if (Statics.field1554[var1] != -1 && Statics.field978[var1] == null) {
                Statics.field978[var1] = Statics.field1288.method5353(Statics.field1554[var1], 0, Statics.field2331[var1]);
                if (Statics.field978[var1] == null) {
                    var0 = false;
                    field748++;
                }
            }
        }
        if (!var0) {
            field561 = 1;
            return;
        }
        field559 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1294.length; var3++) {
            byte[] var4 = Statics.field978[var3];
            if (var4 != null) {
                int var5 = (Statics.field116[var3] >> 8) * 64 - Statics.field489;
                int var6 = (Statics.field116[var3] & 0xFF) * 64 - Statics.field1843;
                if (field563) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= Statics.method3434(var4, var5, var6);
            }
        }
        if (!var2) {
            field561 = 2;
            return;
        }
        if (field561 != 0) {
            method4903(class309.field3602 + class93.field1238 + class93.field1243 + 100 + "%" + class93.field1241, true);
        }
        method2576();
        Statics.field1005.method4254();
        for (int var7 = 0; var7 < 4; var7++) {
            field568[var7].method3519();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class75.field985[var8][var9][var10] = 0;
                }
            }
        }
        method2576();
        class75.method5419();
        int var11 = Statics.field1294.length;
        class63.method2155();
        method6433(true);
        if (!field563) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field116[var12] >> 8) * 64 - Statics.field489;
                int var14 = (Statics.field116[var12] & 0xFF) * 64 - Statics.field1843;
                byte[] var15 = Statics.field1294[var12];
                if (var15 != null) {
                    method2576();
                    class75.method10(var15, var13, var14, Statics.field1043 * 8 - 48, Statics.field1856 * 8 - 48, field568);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field116[var16] >> 8) * 64 - Statics.field489;
                int var18 = (Statics.field116[var16] & 0xFF) * 64 - Statics.field1843;
                byte[] var19 = Statics.field1294[var16];
                if (var19 == null && Statics.field1856 < 800) {
                    method2576();
                    class75.method6896(var17, var18, 64, 64);
                }
            }
            method6433(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field978[var20];
                if (var21 != null) {
                    int var22 = (Statics.field116[var20] >> 8) * 64 - Statics.field489;
                    int var23 = (Statics.field116[var20] & 0xFF) * 64 - Statics.field1843;
                    method2576();
                    class75.method5131(var21, var22, var23, Statics.field1005, field568);
                }
            }
        }
        if (field563) {
            for (int var24 = 0; var24 < 4; var24++) {
                method2576();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field564[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field116.length; var34++) {
                                if (Statics.field116[var34] == var33 && Statics.field1294[var34] != null) {
                                    class75.method5222(Statics.field1294[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, field568);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class75.method332(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = field564[0][var35][var36];
                    if (var37 == -1) {
                        class75.method6896(var35 * 8, var36 * 8, 8, 8);
                    }
                }
            }
            method6433(true);
            for (int var38 = 0; var38 < 4; var38++) {
                method2576();
                for (int var39 = 0; var39 < 13; var39++) {
                    for (int var40 = 0; var40 < 13; var40++) {
                        int var41 = field564[var38][var39][var40];
                        if (var41 != -1) {
                            int var42 = var41 >> 24 & 0x3;
                            int var43 = var41 >> 1 & 0x3;
                            int var44 = var41 >> 14 & 0x3FF;
                            int var45 = var41 >> 3 & 0x7FF;
                            int var46 = (var44 / 8 << 8) + var45 / 8;
                            for (int var47 = 0; var47 < Statics.field116.length; var47++) {
                                if (Statics.field116[var47] == var46 && Statics.field978[var47] != null) {
                                    class75.method1923(Statics.field978[var47], var38, var39 * 8, var40 * 8, var42, (var44 & 0x7) * 8, (var45 & 0x7) * 8, var43, Statics.field1005, field568);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method6433(true);
        method2576();
        class75.method6278(Statics.field1005, field568);
        method6433(true);
        int var48 = class75.field986;
        if (var48 > Statics.field99) {
            var48 = Statics.field99;
        }
        if (var48 < Statics.field99 - 1) {
            int var49 = Statics.field99 - 1;
        }
        if (field503) {
            Statics.field1005.method4253(class75.field986);
        } else {
            Statics.field1005.method4253(0);
        }
        for (int var50 = 0; var50 < 104; var50++) {
            for (int var51 = 0; var51 < 104; var51++) {
                method2484(var50, var51);
            }
        }
        method2576();
        method385();
        class188.field2018.method4647();
        if (Statics.field1515.method519()) {
            class265 var52 = class265.method3935(class263.field2894, field685.field1328);
            var52.field3019.method6957(1057001181);
            field685.method2395(var52);
        }
        if (!field563) {
            int var53 = (Statics.field1043 - 6) / 8;
            int var54 = (Statics.field1043 + 6) / 8;
            int var55 = (Statics.field1856 - 6) / 8;
            int var56 = (Statics.field1856 + 6) / 8;
            for (int var57 = var53 - 1; var57 <= var54 + 1; var57++) {
                for (int var58 = var55 - 1; var58 <= var56 + 1; var58++) {
                    if (var57 < var53 || var57 > var54 || var58 < var55 || var58 > var56) {
                        Statics.field1288.method5327("m" + var57 + "_" + var58);
                        Statics.field1288.method5327("l" + var57 + "_" + var58);
                    }
                }
            }
        }
        method975(30);
        method2576();
        class75.method2250();
        class265 var59 = class265.method3935(class263.field2974, field685.field1328);
        field685.method2395(var59);
        class32.method2497();
    }

    @ObfuscatedName("le.hc(IIIIII)V")
    public static final void method5463(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field1005.method4279(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field1005.method4412(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field1188.field4717;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class242.method2963(var5);
            class188 var17 = class188.method2828(var16);
            if (var17.field2044 == -1) {
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
                class450 var18 = Statics.field4326[var17.field2044];
                if (var18 != null) {
                    int var19 = (var17.field2031 * 4 - var18.field4703) / 2;
                    int var20 = (var17.field2057 * 4 - var18.field4704) / 2;
                    var18.method7333(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field2057) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field1005.method4281(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field1005.method4412(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class242.method2963(var21);
            class188 var27 = class188.method2828(var26);
            if (var27.field2044 != -1) {
                class450 var28 = Statics.field4326[var27.field2044];
                if (var28 != null) {
                    int var29 = (var27.field2031 * 4 - var28.field4703) / 2;
                    int var30 = (var27.field2057 * 4 - var28.field4704) / 2;
                    var28.method7333(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field2057) * 4 + 48 + var30);
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
                int[] var35 = Statics.field1188.field4717;
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
        long var37 = Statics.field1005.method4282(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class242.method2963(var37);
        class188 var40 = class188.method2828(var39);
        if (var40.field2044 == -1) {
            return;
        }
        class450 var41 = Statics.field4326[var40.field2044];
        if (var41 != null) {
            int var42 = (var40.field2031 * 4 - var41.field4703) / 2;
            int var43 = (var40.field2057 * 4 - var41.field4704) / 2;
            var41.method7333(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field2057) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.hp(Lcl;B)Z")
    public final boolean method1089(class100 arg0) {
        class377 var2 = arg0.method2380();
        class437 var3 = arg0.field1319;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1320 == null) {
                if (arg0.field1318) {
                    if (!var2.method2987(1)) {
                        return false;
                    }
                    var2.method2988(arg0.field1319.field4618, 0, 1);
                    arg0.field1323 = 0;
                    arg0.field1318 = false;
                }
                var3.field4621 = 0;
                if (var3.method6919()) {
                    if (!var2.method2987(1)) {
                        return false;
                    }
                    var2.method2988(arg0.field1319.field4618, 1, 1);
                    arg0.field1323 = 0;
                }
                arg0.field1318 = true;
                class266[] var4 = class266.method2011();
                int var5 = var3.method6920();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4621);
                }
                arg0.field1320 = var4[var5];
                arg0.field1321 = arg0.field1320.field3066;
            }
            if (arg0.field1321 == -1) {
                if (!var2.method2987(1)) {
                    return false;
                }
                arg0.method2380().method2988(var3.field4618, 0, 1);
                arg0.field1321 = var3.field4618[0] & 0xFF;
            }
            if (arg0.field1321 == -2) {
                if (!var2.method2987(2)) {
                    return false;
                }
                arg0.method2380().method2988(var3.field4618, 0, 2);
                var3.field4621 = 0;
                arg0.field1321 = var3.method7148();
            }
            if (!var2.method2987(arg0.field1321)) {
                return false;
            }
            var3.field4621 = 0;
            var2.method2988(var3.field4618, 0, arg0.field1321);
            arg0.field1323 = 0;
            field555.method5980();
            arg0.field1314 = arg0.field1326;
            arg0.field1326 = arg0.field1325;
            arg0.field1325 = arg0.field1320;
            if (class266.field3109 == arg0.field1320) {
                method6094(class264.field3008);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3114 == arg0.field1320) {
                Statics.field4603 = true;
                method3954(false, var3);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3074 == arg0.field1320) {
                for (int var6 = 0; var6 < Statics.field1808; var6++) {
                    class171 var7 = class171.method2716(var6);
                    if (var7 != null) {
                        class289.field3282[var6] = 0;
                        class289.field3284[var6] = 0;
                    }
                }
                method2815();
                field694 += 32;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3121 == arg0.field1320) {
                Statics.field399.method1642();
                field702 = field692;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3041 == arg0.field1320) {
                int var8 = var3.method6976();
                class80 var9 = (class80) field534.method6772((long) var8);
                if (var9 != null) {
                    method1907(var9, true);
                }
                if (field684 != null) {
                    method5855(field684);
                    field684 = null;
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3072 == arg0.field1320) {
                int var10 = var3.method7011();
                int var11 = var3.method7012();
                int var12 = var3.method7124();
                class295 var13 = class295.method2688(var12);
                var13.field3393 = (var10 << 16) + var11;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3091 == arg0.field1320) {
                method6094(class264.field3012);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3056 == arg0.field1320) {
                Statics.field182 = var3.method7172();
                Statics.field3308 = var3.method7039();
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3025 == arg0.field1320) {
                int var14 = var3.method7134();
                int var15 = var3.method6974();
                int var16 = var3.method7013();
                class295 var17 = class295.method2688(var14);
                if (var17.field3345 != var15 || var17.field3346 != var16 || var17.field3414 != 0 || var17.field3342 != 0) {
                    var17.field3345 = var15;
                    var17.field3346 = var16;
                    var17.field3414 = 0;
                    var17.field3342 = 0;
                    method5855(var17);
                    this.method1386(var17);
                    if (var17.field3338 == 0) {
                        method4963(Statics.field3326[var14 >> 16], var17, false);
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3105 == arg0.field1320) {
                field754 = true;
                field755 = false;
                Statics.field3275 = var3.method6971();
                Statics.field448 = var3.method6971();
                Statics.field4663 = var3.method7148();
                Statics.field956 = var3.method6971();
                Statics.field4310 = var3.method6971();
                if (Statics.field4310 >= 100) {
                    Statics.field2213 = Statics.field3275 * 128 + 64;
                    Statics.field1694 = Statics.field448 * 128 + 64;
                    Statics.field1016 = method3938(Statics.field2213, Statics.field1694, Statics.field99) - Statics.field4663;
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3067 == arg0.field1320) {
                method6094(class264.field3010);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3031 == arg0.field1320) {
                String var18 = var3.method6981();
                String var19 = class345.method5745(class348.method579(class283.method3539(var3)));
                class99.method2077(6, var18, var19);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3115 == arg0.field1320) {
                Statics.field182 = var3.method7172();
                Statics.field3308 = var3.method6971();
                for (int var20 = Statics.field3308; var20 < Statics.field3308 + 8; var20++) {
                    for (int var21 = Statics.field182; var21 < Statics.field182 + 8; var21++) {
                        if (field750[Statics.field99][var20][var21] != null) {
                            field750[Statics.field99][var20][var21] = null;
                            method2484(var20, var21);
                        }
                    }
                }
                for (class86 var22 = (class86) field665.method5540(); var22 != null; var22 = (class86) field665.method5534()) {
                    if (var22.field1102 >= Statics.field3308 && var22.field1102 < Statics.field3308 + 8 && var22.field1103 >= Statics.field182 && var22.field1103 < Statics.field182 + 8 && Statics.field99 == var22.field1114) {
                        var22.field1111 = 0;
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3124 == arg0.field1320) {
                int var23 = var3.method7049();
                int var24 = var23 >> 16;
                int var25 = var23 >> 8 & 0xFF;
                int var26 = (var23 >> 4 & 0x7) + var24;
                int var27 = (var23 & 0x7) + var25;
                int var28 = var3.method6971();
                int var29 = var3.method7148();
                int var30 = var3.method7012();
                if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                    int var31 = var26 * 128 + 64;
                    int var32 = var27 * 128 + 64;
                    class65 var33 = new class65(var30, Statics.field99, var31, var32, method3938(var31, var32, Statics.field99) - var28, var29, field507);
                    field744.method5530(var33);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3053 == arg0.field1320) {
                int var34 = var3.method6976();
                int var35 = var3.method7014();
                class295 var36 = class295.method2688(var34);
                if (var36.field3394 != var35 || var35 == -1) {
                    var36.field3394 = var35;
                    var36.field3474 = 0;
                    var36.field3487 = 0;
                    method5855(var36);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3123 == arg0.field1320) {
                int var37 = var3.method7049();
                int var38 = var37 >> 16;
                int var39 = var37 >> 8 & 0xFF;
                int var40 = (var37 >> 4 & 0x7) + var38;
                int var41 = (var37 & 0x7) + var39;
                int var42 = var3.method7172();
                int var43 = var42 >> 2;
                int var44 = var42 & 0x3;
                int var45 = field749[var43];
                int var46 = var3.method7148();
                if (var40 >= 0 && var41 >= 0 && var40 < 103 && var41 < 103) {
                    if (var45 == 0) {
                        class246 var47 = Statics.field1005.method4276(Statics.field99, var40, var41);
                        if (var47 != null) {
                            int var48 = class242.method2963(var47.field2837);
                            if (var43 == 2) {
                                var47.field2832 = new class73(var48, 2, var44 + 4, Statics.field99, var40, var41, var46, false, var47.field2832);
                                var47.field2836 = new class73(var48, 2, var44 + 1 & 0x3, Statics.field99, var40, var41, var46, false, var47.field2836);
                            } else {
                                var47.field2832 = new class73(var48, var43, var44, Statics.field99, var40, var41, var46, false, var47.field2832);
                            }
                        }
                    } else if (var45 == 1) {
                        class248 var49 = Statics.field1005.method4382(Statics.field99, var40, var41);
                        if (var49 != null) {
                            int var50 = class242.method2963(var49.field2852);
                            if (var43 == 4 || var43 == 5) {
                                var49.field2850 = new class73(var50, 4, var44, Statics.field99, var40, var41, var46, false, var49.field2850);
                            } else if (var43 == 6) {
                                var49.field2850 = new class73(var50, 4, var44 + 4, Statics.field99, var40, var41, var46, false, var49.field2850);
                            } else if (var43 == 7) {
                                var49.field2850 = new class73(var50, 4, (var44 + 2 & 0x3) + 4, Statics.field99, var40, var41, var46, false, var49.field2850);
                            } else if (var43 == 8) {
                                var49.field2850 = new class73(var50, 4, var44 + 4, Statics.field99, var40, var41, var46, false, var49.field2850);
                                var49.field2843 = new class73(var50, 4, (var44 + 2 & 0x3) + 4, Statics.field99, var40, var41, var46, false, var49.field2843);
                            }
                        }
                    } else if (var45 == 2) {
                        class249 var51 = Statics.field1005.method4314(Statics.field99, var40, var41);
                        if (var43 == 11) {
                            var43 = 10;
                        }
                        if (var51 != null) {
                            var51.field2860 = new class73(class242.method2963(var51.field2861), var43, var44, Statics.field99, var40, var41, var46, false, var51.field2860);
                        }
                    } else if (var45 == 3) {
                        class227 var52 = Statics.field1005.method4278(Statics.field99, var40, var41);
                        if (var52 != null) {
                            var52.field2494 = new class73(class242.method2963(var52.field2495), 22, var44, Statics.field99, var40, var41, var46, false, var52.field2494);
                        }
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3120 == arg0.field1320) {
                field727 = var3.method7039();
                field728 = var3.method7172();
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3102 == arg0.field1320) {
                int var53 = var3.method6971();
                method4125(var53);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3052 == arg0.field1320) {
                for (int var54 = 0; var54 < class289.field3284.length; var54++) {
                    if (class289.field3284[var54] != class289.field3282[var54]) {
                        class289.field3284[var54] = class289.field3282[var54];
                        method3941(var54);
                        field693[++field694 - 1 & 0x1F] = var54;
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3049 == arg0.field1320) {
                int var55 = var3.method7012();
                if (var55 == 65535) {
                    var55 = -1;
                }
                method751(var55);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3046 == arg0.field1320) {
                int var56 = var3.method7090();
                int var57 = var3.method7012();
                if (var57 == 65535) {
                    var57 = -1;
                }
                method2302(var57, var56);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3095 == arg0.field1320) {
                Statics.field1886 = null;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3032 == arg0.field1320) {
                int var58 = var3.method7124();
                int var59 = var3.method7148();
                class289.field3282[var59] = var58;
                if (class289.field3284[var59] != var58) {
                    class289.field3284[var59] = var58;
                }
                method3941(var59);
                field693[++field694 - 1 & 0x1F] = var59;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3081 == arg0.field1320) {
                Statics.field1886 = new class392(Statics.field3272);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3037 == arg0.field1320) {
                method6094(class264.field3013);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3075 == arg0.field1320) {
                int var60 = var3.method6976();
                int var61 = var3.method7148();
                if (var60 < -70000) {
                    var61 += 32768;
                }
                class295 var62;
                if (var60 >= 0) {
                    var62 = class295.method2688(var60);
                } else {
                    var62 = null;
                }
                if (var62 != null) {
                    for (int var63 = 0; var63 < var62.field3470.length; var63++) {
                        var62.field3470[var63] = 0;
                        var62.field3471[var63] = 0;
                    }
                }
                class78.method3953(var61);
                int var64 = var3.method7148();
                for (int var65 = 0; var65 < var64; var65++) {
                    int var66 = var3.method7148();
                    int var67 = var3.method7172();
                    if (var67 == 255) {
                        var67 = var3.method6976();
                    }
                    if (var62 != null && var65 < var62.field3470.length) {
                        var62.field3470[var65] = var66;
                        var62.field3471[var65] = var67;
                    }
                    class78.method1921(var61, var65, var66 - 1, var67);
                }
                if (var62 != null) {
                    method5855(var62);
                }
                method2815();
                field493[++field696 - 1 & 0x1F] = var61 & 0x7FFF;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3059 == arg0.field1320) {
                String var68 = var3.method6981();
                Object[] var69 = new Object[var68.length() + 1];
                for (int var70 = var68.length() - 1; var70 >= 0; var70--) {
                    if (var68.charAt(var70) == 's') {
                        var69[var70 + 1] = var3.method6981();
                    } else {
                        var69[var70 + 1] = Integer.valueOf(var3.method6976());
                    }
                }
                var69[0] = Integer.valueOf(var3.method6976());
                class81 var71 = new class81();
                var71.field1035 = var69;
                class64.method2809(var71);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3111 == arg0.field1320) {
                int var72 = var3.method7134();
                int var73 = var3.method7011();
                class295 var74 = class295.method2688(var72);
                if (var74 != null && var74.field3338 == 0) {
                    if (var73 > var74.field3360 - var74.field3352) {
                        var73 = var74.field3360 - var74.field3352;
                    }
                    if (var73 < 0) {
                        var73 = 0;
                    }
                    if (var74.field3358 != var73) {
                        var74.field3358 = var73;
                        method5855(var74);
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3092 == arg0.field1320) {
                if (field523 != -1) {
                    method2005(field523, 0);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3062 == arg0.field1320) {
                Statics.field4603 = true;
                method3954(true, var3);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3086 == arg0.field1320) {
                field754 = false;
                for (int var75 = 0; var75 < 5; var75++) {
                    field547[var75] = false;
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3063 == arg0.field1320) {
                int var76 = var3.method6986();
                boolean var77 = var3.method6971() == 1;
                String var78 = "";
                boolean var79 = false;
                if (var77) {
                    var78 = var3.method6981();
                    if (Statics.field399.method1603(new class459(var78, Statics.field1480))) {
                        var79 = true;
                    }
                }
                String var80 = var3.method6981();
                if (!var79) {
                    class99.method2077(var76, var78, var80);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3113 == arg0.field1320) {
                method2629(var3.method6981());
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3108 == arg0.field1320) {
                if (arg0.field1321 == 0) {
                    Statics.field3004 = null;
                } else {
                    if (Statics.field3004 == null) {
                        Statics.field3004 = new class368(Statics.field1480, Statics.field1515);
                    }
                    Statics.field3004.method6055(var3);
                }
                method1958();
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3033 == arg0.field1320) {
                method6094(class264.field3014);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3038 == arg0.field1320) {
                int var81 = var3.method7002();
                String var82 = var3.method6981();
                class295 var83 = class295.method2688(var81);
                if (!var82.equals(var83.field3422)) {
                    var83.field3422 = var82;
                    method5855(var83);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3129 == arg0.field1320) {
                field514 = var3.method6971();
                if (field514 == 1) {
                    field515 = var3.method7148();
                }
                if (field514 >= 2 && field514 <= 6) {
                    if (field514 == 2) {
                        field520 = 64;
                        field521 = 64;
                    }
                    if (field514 == 3) {
                        field520 = 0;
                        field521 = 64;
                    }
                    if (field514 == 4) {
                        field520 = 128;
                        field521 = 64;
                    }
                    if (field514 == 5) {
                        field520 = 64;
                        field521 = 0;
                    }
                    if (field514 == 6) {
                        field520 = 64;
                        field521 = 128;
                    }
                    field514 = 2;
                    field517 = var3.method7148();
                    field518 = var3.method7148();
                    field519 = var3.method6971();
                }
                if (field514 == 10) {
                    field738 = var3.method7148();
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3064 == arg0.field1320) {
                method6094(class264.field3005);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3058 == arg0.field1320) {
                class61 var84 = new class61();
                var84.field795 = var3.method6981();
                var84.field796 = var3.method7148();
                int var85 = var3.method6976();
                var84.field792 = var85;
                method975(45);
                var2.method2972();
                Object var86 = null;
                class69.method6525(var84);
                arg0.field1320 = null;
                return false;
            }
            if (class266.field3082 == arg0.field1320) {
                field745 = var3.method6971();
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3078 == arg0.field1320) {
                int var87 = var3.method6971();
                int var88 = var3.method6971();
                int var89 = var3.method6971();
                int var90 = var3.method6971();
                field547[var87] = true;
                field757[var87] = var88;
                field637[var87] = var89;
                field675[var87] = var90;
                field601[var87] = 0;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3076 == arg0.field1320) {
                method2815();
                field640 = var3.method6974();
                field708 = field692;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3044 == arg0.field1320) {
                field756 = field692;
                byte var91 = var3.method7093();
                class146 var92 = new class146(var3);
                class149 var93;
                if (var91 >= 0) {
                    var93 = field737[var91];
                } else {
                    var93 = Statics.field114;
                }
                var92.method2822(var93);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3122 == arg0.field1320) {
                int var94 = var3.method7070();
                int var95 = var3.method7012();
                int var96 = var3.method7011();
                if (var96 == 65535) {
                    var96 = -1;
                }
                class92 var97 = field560[var95];
                if (var97 != null) {
                    if (var97.field1149 == var96 && var96 != -1) {
                        int var98 = class191.method3011(var96).field2162;
                        if (var98 == 1) {
                            var97.field1150 = 0;
                            var97.field1137 = 0;
                            var97.field1152 = var94;
                            var97.field1153 = 0;
                        } else if (var98 == 2) {
                            var97.field1153 = 0;
                        }
                    } else if (var96 == -1 || var97.field1149 == -1 || class191.method3011(var96).field2156 >= class191.method3011(var97.field1149).field2156) {
                        var97.field1149 = var96;
                        var97.field1150 = 0;
                        var97.field1137 = 0;
                        var97.field1152 = var94;
                        var97.field1153 = 0;
                        var97.field1171 = var97.field1177;
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3043 == arg0.field1320) {
                method6865();
                byte var99 = var3.method7093();
                class132 var100 = new class132(var3);
                class140 var101;
                if (var99 >= 0) {
                    var101 = field736[var99];
                } else {
                    var101 = Statics.field1693;
                }
                var100.method2700(var101);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3084 == arg0.field1320) {
                int var102 = var3.method6971();
                String var103 = var3.method6981();
                int var104 = var3.method7172();
                if (var102 >= 1 && var102 <= 8) {
                    if (var103.equalsIgnoreCase(class309.field3599)) {
                        var103 = null;
                    }
                    field630[var102 - 1] = var103;
                    field631[var102 - 1] = var104 == 0;
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3097 == arg0.field1320) {
                method6094(class264.field3006);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3068 == arg0.field1320) {
                byte var105 = var3.method7093();
                long var106 = (long) var3.method7148();
                long var108 = (long) var3.method6975();
                long var110 = (var106 << 32) + var108;
                boolean var112 = false;
                class149 var113 = var105 >= 0 ? field737[var105] : Statics.field114;
                if (var113 == null) {
                    var112 = true;
                } else {
                    for (int var114 = 0; var114 < 100; var114++) {
                        if (field625[var114] == var110) {
                            var112 = true;
                            break;
                        }
                    }
                }
                if (!var112) {
                    field625[field731] = var110;
                    field731 = (field731 + 1) % 100;
                    String var115 = class283.method3539(var3);
                    int var116 = var105 >= 0 ? 43 : 46;
                    class99.method5207(var116, "", var115, var113.field1658);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3069 == arg0.field1320) {
                int var117 = arg0.field1321 + var3.field4621;
                int var118 = var3.method7148();
                int var119 = var3.method7148();
                if (field523 != var118) {
                    field523 = var118;
                    this.method1093(false);
                    method389(field523);
                    class64.method2827(field523);
                    for (int var120 = 0; var120 < 100; var120++) {
                        field716[var120] = true;
                    }
                }
                while (var119-- > 0) {
                    int var121 = var3.method6976();
                    int var122 = var3.method7148();
                    int var123 = var3.method6971();
                    class80 var124 = (class80) field534.method6772((long) var121);
                    if (var124 != null && var124.field1030 != var122) {
                        method1907(var124, true);
                        var124 = null;
                    }
                    if (var124 == null) {
                        var124 = method14(var121, var122, var123);
                    }
                    var124.field1029 = true;
                }
                for (class80 var125 = (class80) field534.method6774(); var125 != null; var125 = (class80) field534.method6775()) {
                    if (var125.field1029) {
                        var125.field1029 = false;
                    } else {
                        method1907(var125, true);
                    }
                }
                field713 = new class419(512);
                while (var3.field4621 < var117) {
                    int var126 = var3.method6976();
                    int var127 = var3.method7148();
                    int var128 = var3.method7148();
                    int var129 = var3.method6976();
                    for (int var130 = var127; var130 <= var128; var130++) {
                        long var131 = ((long) var126 << 32) + (long) var130;
                        field713.method6773(new class408(var129), var131);
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3026 == arg0.field1320) {
                Statics.field218 = class455.method3017(var3.method6971());
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3027 == arg0.field1320) {
                method3954(true, var3);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3098 == arg0.field1320) {
                int var133 = var3.method7002();
                int var134 = var3.method7124();
                class80 var135 = (class80) field534.method6772((long) var133);
                class80 var136 = (class80) field534.method6772((long) var134);
                if (var136 != null) {
                    method1907(var136, var135 == null || var135.field1030 != var136.field1030);
                }
                if (var135 != null) {
                    var135.method6503();
                    field534.method6773(var135, (long) var134);
                }
                class295 var137 = class295.method2688(var133);
                if (var137 != null) {
                    method5855(var137);
                }
                class295 var138 = class295.method2688(var134);
                if (var138 != null) {
                    method5855(var138);
                    method4963(Statics.field3326[var138.field3449 >>> 16], var138, true);
                }
                if (field523 != -1) {
                    method2005(field523, 1);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3094 == arg0.field1320) {
                method6094(class264.field3016);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3117 == arg0.field1320) {
                int var139 = var3.method6976();
                if (field587 != var139) {
                    field587 = var139;
                    method1673();
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3083 == arg0.field1320) {
                class55.method3928(var3, arg0.field1321);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3028 == arg0.field1320) {
                boolean var140 = var3.method6979();
                if (!var140) {
                    Statics.field1842 = null;
                } else if (Statics.field1842 == null) {
                    Statics.field1842 = new class327();
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3055 == arg0.field1320) {
                int var141 = var3.method7010();
                if (var141 == 65535) {
                    var141 = -1;
                }
                int var142 = var3.method7134();
                int var143 = var3.method7124();
                class295 var144 = class295.method2688(var143);
                if (var144.field3451) {
                    var144.field3335 = var141;
                    var144.field3473 = var142;
                    class189 var146 = Statics.method268(var141);
                    var144.field3388 = var146.field2082;
                    var144.field3384 = var146.field2083;
                    var144.field3327 = var146.field2084;
                    var144.field3437 = var146.field2098;
                    var144.field3482 = var146.field2086;
                    var144.field3391 = var146.field2081;
                    if (var146.field2087 == 1) {
                        var144.field3402 = 1;
                    } else {
                        var144.field3402 = 2;
                    }
                    if (var144.field3468 > 0) {
                        var144.field3391 = var144.field3391 * 32 / var144.field3468;
                    } else if (var144.field3347 > 0) {
                        var144.field3391 = var144.field3391 * 32 / var144.field3347;
                    }
                    method5855(var144);
                } else if (var141 == -1) {
                    var144.field3397 = 0;
                    arg0.field1320 = null;
                    return true;
                } else {
                    class189 var145 = Statics.method268(var141);
                    var144.field3397 = 4;
                    var144.field3381 = var141;
                    var144.field3388 = var145.field2082;
                    var144.field3384 = var145.field2083;
                    var144.field3391 = var145.field2081 * 100 / var142;
                    method5855(var144);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3103 == arg0.field1320) {
                int var147 = var3.method6976();
                int var148 = var3.method6976();
                int var149 = class32.method4124();
                class265 var150 = class265.method3935(class263.field2984, field685.field1328);
                var150.field3019.method7020(var147);
                var150.field3019.method7018(var148);
                var150.field3019.method7000(field193);
                var150.field3019.method7000(var149);
                field685.method2395(var150);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3087 == arg0.field1320) {
                int var151 = var3.method7134();
                class295 var152 = class295.method2688(var151);
                for (int var153 = 0; var153 < var152.field3470.length; var153++) {
                    var152.field3470[var153] = -1;
                    var152.field3470[var153] = 0;
                }
                method5855(var152);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3045 == arg0.field1320) {
                int var154 = var3.method6976();
                int var155 = var3.method7148();
                if (var154 < -70000) {
                    var155 += 32768;
                }
                class295 var156;
                if (var154 >= 0) {
                    var156 = class295.method2688(var154);
                } else {
                    var156 = null;
                }
                while (var3.field4621 < arg0.field1321) {
                    int var157 = var3.method6986();
                    int var158 = var3.method7148();
                    int var159 = 0;
                    if (var158 != 0) {
                        var159 = var3.method6971();
                        if (var159 == 255) {
                            var159 = var3.method6976();
                        }
                    }
                    if (var156 != null && var157 >= 0 && var157 < var156.field3470.length) {
                        var156.field3470[var157] = var158;
                        var156.field3471[var157] = var159;
                    }
                    class78.method1921(var155, var157, var158 - 1, var159);
                }
                if (var156 != null) {
                    method5855(var156);
                }
                method2815();
                field493[++field696 - 1 & 0x1F] = var155 & 0x7FFF;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3096 == arg0.field1320) {
                int var160 = var3.method7134();
                class295 var161 = class295.method2688(var160);
                var161.field3397 = 3;
                var161.field3381 = Statics.field4004.field1089.method5029();
                method5855(var161);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3093 == arg0.field1320) {
                String var162 = var3.method6981();
                long var163 = (long) var3.method7148();
                long var165 = (long) var3.method6975();
                class311 var167 = (class311) class330.method4919(class311.method3855(), var3.method6971());
                long var168 = (var163 << 32) + var165;
                boolean var170 = false;
                for (int var171 = 0; var171 < 100; var171++) {
                    if (field625[var171] == var168) {
                        var170 = true;
                        break;
                    }
                }
                if (Statics.field399.method1603(new class459(var162, Statics.field1480))) {
                    var170 = true;
                }
                if (!var170 && field619 == 0) {
                    field625[field731] = var168;
                    field731 = (field731 + 1) % 100;
                    String var172 = class345.method5745(class348.method579(class283.method3539(var3)));
                    byte var173;
                    if (var167.field3929) {
                        var173 = 7;
                    } else {
                        var173 = 3;
                    }
                    if (var167.field3918 == -1) {
                        class99.method2077(var173, var162, var172);
                    } else {
                        class99.method2077(var173, class93.method1902(var167.field3918) + var162, var172);
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3118 == arg0.field1320) {
                int var174 = var3.method7012();
                int var175 = var3.method7124();
                class295 var176 = class295.method2688(var175);
                if (var176.field3397 != 2 || var176.field3381 != var174) {
                    var176.field3397 = 2;
                    var176.field3381 = var174;
                    method5855(var176);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3071 == arg0.field1320) {
                int var177 = var3.method7124();
                int var178 = var3.method7010();
                if (var178 == 65535) {
                    var178 = -1;
                }
                int var179 = var3.method7012();
                if (var179 == 65535) {
                    var179 = -1;
                }
                int var180 = var3.method6976();
                for (int var181 = var178; var181 <= var179; var181++) {
                    long var182 = ((long) var180 << 32) + (long) var181;
                    class409 var184 = field713.method6772(var182);
                    if (var184 != null) {
                        var184.method6503();
                    }
                    field713.method6773(new class408(var177), var182);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3042 == arg0.field1320) {
                Statics.field182 = var3.method7172();
                Statics.field3308 = var3.method7039();
                while (var3.field4621 < arg0.field1321) {
                    int var185 = var3.method6971();
                    class264 var186 = class264.method2540()[var185];
                    method6094(var186);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3110 == arg0.field1320) {
                method6865();
                byte var187 = var3.method7093();
                if (arg0.field1321 == 1) {
                    if (var187 >= 0) {
                        field736[var187] = null;
                    } else {
                        Statics.field1693 = null;
                    }
                    arg0.field1320 = null;
                    return true;
                }
                if (var187 >= 0) {
                    field736[var187] = new class140(var3);
                } else {
                    Statics.field1693 = new class140(var3);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3090 == arg0.field1320) {
                if (Statics.field3004 != null) {
                    Statics.field3004.method6059(var3);
                }
                method1958();
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3047 == arg0.field1320) {
                method6094(class264.field3009);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3070 == arg0.field1320) {
                Statics.field399.method1599(var3, arg0.field1321);
                field702 = field692;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3099 == arg0.field1320) {
                int var188 = var3.method7134();
                int var189 = var3.method7148();
                class295 var190 = class295.method2688(var188);
                if (var190.field3397 != 1 || var190.field3381 != var189) {
                    var190.field3397 = 1;
                    var190.field3381 = var189;
                    method5855(var190);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3035 == arg0.field1320) {
                int var191 = var3.method7011();
                field523 = var191;
                this.method1093(false);
                method389(var191);
                class64.method2827(field523);
                for (int var192 = 0; var192 < 100; var192++) {
                    field716[var192] = true;
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3061 == arg0.field1320) {
                class97.method1886(var3, arg0.field1321);
                method2562();
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3112 == arg0.field1320) {
                String var193 = var3.method6981();
                long var194 = var3.method7003();
                long var196 = (long) var3.method7148();
                long var198 = (long) var3.method6975();
                class311 var200 = (class311) class330.method4919(class311.method3855(), var3.method6971());
                long var201 = (var196 << 32) + var198;
                boolean var203 = false;
                for (int var204 = 0; var204 < 100; var204++) {
                    if (field625[var204] == var201) {
                        var203 = true;
                        break;
                    }
                }
                if (var200.field3930 && Statics.field399.method1603(new class459(var193, Statics.field1480))) {
                    var203 = true;
                }
                if (!var203 && field619 == 0) {
                    field625[field731] = var201;
                    field731 = (field731 + 1) % 100;
                    String var205 = class345.method5745(class348.method579(class283.method3539(var3)));
                    if (var200.field3918 == -1) {
                        class99.method5207(9, var193, var205, class350.method2012(var194));
                    } else {
                        class99.method5207(9, class93.method1902(var200.field3918) + var193, var205, class350.method2012(var194));
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3048 == arg0.field1320) {
                int var206 = var3.method7012();
                int var207 = var3.method7011();
                int var208 = var3.method7011();
                int var209 = var3.method7134();
                class295 var210 = class295.method2688(var209);
                if (var210.field3388 != var208 || var210.field3384 != var207 || var210.field3391 != var206) {
                    var210.field3388 = var208;
                    var210.field3384 = var207;
                    var210.field3391 = var206;
                    method5855(var210);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3051 == arg0.field1320) {
                method2815();
                field566 = var3.method6971();
                field708 = field692;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3106 == arg0.field1320) {
                for (int var211 = 0; var211 < field621.length; var211++) {
                    if (field621[var211] != null) {
                        field621[var211].field1149 = -1;
                    }
                }
                for (int var212 = 0; var212 < field560.length; var212++) {
                    if (field560[var212] != null) {
                        field560[var212].field1149 = -1;
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3039 == arg0.field1320) {
                field513 = var3.method7148() * 30;
                field708 = field692;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3024 == arg0.field1320) {
                Statics.field399.field807.method6032(var3, arg0.field1321);
                method3095();
                field702 = field692;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3079 == arg0.field1320) {
                field754 = true;
                field755 = false;
                Statics.field1692 = var3.method6971();
                Statics.field882 = var3.method6971();
                Statics.field155 = var3.method7148();
                Statics.field3961 = var3.method6971();
                Statics.field4338 = var3.method6971();
                if (Statics.field4338 >= 100) {
                    int var213 = Statics.field1692 * 128 + 64;
                    int var214 = Statics.field882 * 128 + 64;
                    int var215 = method3938(var213, var214, Statics.field99) - Statics.field155;
                    int var216 = var213 - Statics.field2213;
                    int var217 = var215 - Statics.field1016;
                    int var218 = var214 - Statics.field1694;
                    int var219 = (int) Math.sqrt((double) (var216 * var216 + var218 * var218));
                    Statics.field1647 = (int) (Math.atan2((double) var217, (double) var219) * 325.9490051269531D) & 0x7FF;
                    Statics.field111 = (int) (Math.atan2((double) var216, (double) var218) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1647 < 128) {
                        Statics.field1647 = 128;
                    }
                    if (Statics.field1647 > 383) {
                        Statics.field1647 = 383;
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3029 == arg0.field1320) {
                int var220 = var3.method6971();
                method186(var220);
                arg0.field1320 = null;
                return false;
            }
            if (class266.field3036 == arg0.field1320) {
                boolean var221 = var3.method6971() == 1;
                if (var221) {
                    Statics.field2389 = class270.method2724() - var3.method7003();
                    Statics.field1069 = new class318(var3, true);
                } else {
                    Statics.field1069 = null;
                }
                field707 = field692;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3034 == arg0.field1320) {
                method5220(false, arg0.field1319);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3101 == arg0.field1320) {
                int var222 = var3.method7148();
                int var223 = var3.method6971();
                int var224 = var3.method7148();
                method2078(var222, var223, var224);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3089 == arg0.field1320) {
                int var225 = var3.method7010();
                int var226 = var3.method6976();
                int var227 = var225 >> 10 & 0x1F;
                int var228 = var225 >> 5 & 0x1F;
                int var229 = var225 & 0x1F;
                int var230 = (var229 << 3) + (var227 << 19) + (var228 << 11);
                class295 var231 = class295.method2688(var226);
                if (var231.field3361 != var230) {
                    var231.field3361 = var230;
                    method5855(var231);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3077 == arg0.field1320) {
                int var232 = var3.method6971();
                if (var3.method6971() == 0) {
                    field778[var232] = new class325();
                    var3.field4621 += 18;
                } else {
                    var3.field4621--;
                    field778[var232] = new class325(var3, false);
                }
                field706 = field692;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3080 == arg0.field1320) {
                int var233 = var3.method7148();
                class78.method1989(var233);
                field493[++field696 - 1 & 0x1F] = var233 & 0x7FFF;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3107 == arg0.field1320) {
                int var234 = var3.method7124();
                boolean var235 = var3.method6971() == 1;
                class295 var236 = class295.method2688(var234);
                if (var236.field3356 != var235) {
                    var236.field3356 = var235;
                    method5855(var236);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3065 == arg0.field1320) {
                method6094(class264.field3007);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3088 == arg0.field1320) {
                method5220(true, arg0.field1319);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3054 == arg0.field1320) {
                byte[] var237 = new byte[arg0.field1321];
                var3.method6921(var237, 0, var237.length);
                class438 var238 = new class438(var237);
                String var239 = var238.method6981();
                class30.method6446(var239, true, false);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3126 == arg0.field1320) {
                int var240 = var3.method7148();
                int var241 = var3.method7002();
                int var242 = var3.method7148();
                class85 var243;
                if (field622 == var242) {
                    var243 = Statics.field4004;
                } else {
                    var243 = field621[var242];
                }
                if (var243 != null) {
                    var243.field1165 = var240;
                    var243.field1158 = var241 >> 16;
                    var243.field1135 = (var241 & 0xFFFF) + field507;
                    var243.field1157 = 0;
                    var243.field1156 = 0;
                    if (var243.field1135 > field507) {
                        var243.field1157 = -1;
                    }
                    if (var243.field1165 == 65535) {
                        var243.field1165 = -1;
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3040 == arg0.field1320) {
                byte var244 = var3.method7093();
                String var245 = var3.method6981();
                long var246 = (long) var3.method7148();
                long var248 = (long) var3.method6975();
                class311 var250 = (class311) class330.method4919(class311.method3855(), var3.method6971());
                long var251 = (var246 << 32) + var248;
                boolean var253 = false;
                Object var254 = null;
                class149 var255 = var244 >= 0 ? field737[var244] : Statics.field114;
                if (var255 == null) {
                    var253 = true;
                } else {
                    int var256 = 0;
                    while (true) {
                        if (var256 >= 100) {
                            if (var250.field3930 && Statics.field399.method1603(new class459(var245, Statics.field1480))) {
                                var253 = true;
                            }
                            break;
                        }
                        if (field625[var256] == var251) {
                            var253 = true;
                            break;
                        }
                        var256++;
                    }
                }
                if (!var253) {
                    field625[field731] = var251;
                    field731 = (field731 + 1) % 100;
                    String var257 = class345.method5745(class283.method3539(var3));
                    int var258 = var244 >= 0 ? 41 : 44;
                    if (var250.field3918 == -1) {
                        class99.method5207(var258, var245, var257, var255.field1658);
                    } else {
                        class99.method5207(var258, class93.method1902(var250.field3918) + var245, var257, var255.field1658);
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3057 == arg0.field1320) {
                method4029();
                arg0.field1320 = null;
                return false;
            }
            if (class266.field3030 == arg0.field1320) {
                field756 = field692;
                byte var259 = var3.method7093();
                if (arg0.field1321 == 1) {
                    if (var259 >= 0) {
                        field737[var259] = null;
                    } else {
                        Statics.field114 = null;
                    }
                    arg0.field1320 = null;
                    return true;
                }
                if (var259 >= 0) {
                    field737[var259] = new class149(var3);
                } else {
                    Statics.field114 = new class149(var3);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3050 == arg0.field1320) {
                if (Statics.field1886 == null) {
                    Statics.field1886 = new class392(Statics.field3272);
                }
                class446 var260 = Statics.field3272.method6451(var3);
                Statics.field1886.field4374.method6785(var260.field4684, var260.field4682);
                field699[++field700 - 1 & 0x1F] = var260.field4684;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3073 == arg0.field1320) {
                int var261 = var3.method7148();
                byte var262 = var3.method7004();
                class289.field3282[var261] = var262;
                if (class289.field3284[var261] != var262) {
                    class289.field3284[var261] = var262;
                }
                method3941(var261);
                field693[++field694 - 1 & 0x1F] = var261;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3125 == arg0.field1320) {
                int var263 = var3.method7124();
                int var264 = var3.method7011();
                int var265 = var3.method7010();
                class92 var266 = field560[var265];
                if (var266 != null) {
                    var266.field1165 = var264;
                    var266.field1158 = var263 >> 16;
                    var266.field1135 = (var263 & 0xFFFF) + field507;
                    var266.field1157 = 0;
                    var266.field1156 = 0;
                    if (var266.field1135 > field507) {
                        var266.field1157 = -1;
                    }
                    if (var266.field1165 == 65535) {
                        var266.field1165 = -1;
                    }
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3085 == arg0.field1320) {
                var3.field4621 += 28;
                if (var3.method6997()) {
                    method6275(var3, var3.field4621 - 28);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3100 == arg0.field1320) {
                method3954(false, var3);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3127 == arg0.field1320) {
                int var267 = var3.method6971();
                int var268 = var3.method7012();
                int var269 = var3.method7090();
                int var270 = var269 >> 16;
                int var271 = var269 >> 8 & 0xFF;
                int var272 = (var269 >> 4 & 0x7) + var270;
                int var273 = (var269 & 0x7) + var271;
                byte var274 = var3.method7093();
                int var275 = var3.method7012();
                int var276 = var3.method7172() * 4;
                byte var277 = var3.method7004();
                int var278 = var3.method7010();
                int var279 = var3.method6971();
                int var280 = var3.method7039() * 4;
                int var281 = var3.method7013();
                int var282 = var272 + var274;
                int var283 = var273 + var277;
                if (var272 >= 0 && var273 >= 0 && var272 < 104 && var273 < 104 && var282 >= 0 && var283 >= 0 && var282 < 104 && var283 < 104 && var275 != 65535) {
                    int var284 = var272 * 128 + 64;
                    int var285 = var273 * 128 + 64;
                    int var286 = var282 * 128 + 64;
                    int var287 = var283 * 128 + 64;
                    class70 var288 = new class70(var275, Statics.field99, var284, var285, method3938(var284, var285, Statics.field99) - var276, field507 + var278, field507 + var268, var279, var267, var281, var280);
                    var288.method1878(var286, var287, method3938(var286, var287, Statics.field99) - var280, field507 + var278);
                    field636.method5530(var288);
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3119 == arg0.field1320) {
                method2815();
                int var289 = var3.method7039();
                int var290 = var3.method7070();
                int var291 = var3.method7134();
                field777[var290] = var291;
                field680[var290] = var289;
                field639[var290] = 1;
                for (int var292 = 0; var292 < 98; var292++) {
                    if (var291 >= class299.field3526[var292]) {
                        field639[var290] = var292 + 2;
                    }
                }
                field569[++field698 - 1 & 0x1F] = var290;
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3060 == arg0.field1320 && field754) {
                field755 = true;
                Statics.field956 = var3.method6971();
                Statics.field4310 = var3.method6971();
                Statics.field3961 = var3.method6971();
                Statics.field4338 = var3.method6971();
                for (int var293 = 0; var293 < 5; var293++) {
                    field547[var293] = false;
                }
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3104 == arg0.field1320) {
                int var294 = var3.method6971();
                int var295 = var3.method6976();
                int var296 = var3.method7012();
                class80 var297 = (class80) field534.method6772((long) var295);
                if (var297 != null) {
                    method1907(var297, var297.field1030 != var296);
                }
                method14(var295, var296, var294);
                arg0.field1320 = null;
                return true;
            }
            if (class266.field3116 == arg0.field1320) {
                field540 = var3.method6971();
                if (field540 == 255) {
                    field540 = 0;
                }
                field764 = var3.method6971();
                if (field764 == 255) {
                    field764 = 0;
                }
                arg0.field1320 = null;
                return true;
            }
            class462.method5173("" + (arg0.field1320 == null ? -1 : arg0.field1320.field3128) + class93.field1237 + (arg0.field1326 == null ? -1 : arg0.field1326.field3128) + class93.field1237 + (arg0.field1314 == null ? -1 : arg0.field1314.field3128) + class93.field1237 + arg0.field1321, (Throwable) null);
            method4029();
        } catch (IOException var302) {
            method2695();
        } catch (Exception var303) {
            String var300 = "" + (arg0.field1320 == null ? -1 : arg0.field1320.field3128) + class93.field1237 + (arg0.field1326 == null ? -1 : arg0.field1326.field3128) + class93.field1237 + (arg0.field1314 == null ? -1 : arg0.field1314.field3128) + class93.field1237 + arg0.field1321 + class93.field1237 + (Statics.field489 + Statics.field4004.field1178[0]) + class93.field1237 + (Statics.field1843 + Statics.field4004.field1179[0]) + class93.field1237;
            for (int var301 = 0; var301 < arg0.field1321 && var301 < 50; var301++) {
                var300 = var300 + var3.field4618[var301] + class93.field1237;
            }
            class462.method5173(var300, var303);
            method4029();
        }
        return true;
    }

    @ObfuscatedName("ne.hg(Ljp;I)V")
    public static final void method6094(class264 arg0) {
        class437 var1 = field685.field1319;
        if (class264.field3013 == arg0) {
            int var2 = var1.method7039();
            int var3 = (var2 >> 4 & 0x7) + Statics.field3308;
            int var4 = (var2 & 0x7) + Statics.field182;
            int var5 = var1.method6971();
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = field749[var6];
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                method5430(Statics.field99, var3, var4, var8, -1, var6, var7, 0, -1);
            }
            return;
        }
        if (class264.field3007 == arg0) {
            int var9 = var1.method7039();
            int var10 = var1.method7172();
            int var11 = (var10 >> 4 & 0x7) + Statics.field3308;
            int var12 = (var10 & 0x7) + Statics.field182;
            int var13 = var1.method7039();
            int var14 = var13 >> 4 & 0xF;
            int var15 = var13 & 0x7;
            int var16 = var1.method7010();
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                int var17 = var14 + 1;
                if (Statics.field4004.field1178[0] >= var11 - var17 && Statics.field4004.field1178[0] <= var11 + var17 && Statics.field4004.field1179[0] >= var12 - var17 && Statics.field4004.field1179[0] <= var12 + var17 && Statics.field1541.method2166() != 0 && var15 > 0 && field652 < 50) {
                    field575[field652] = var16;
                    field690[field652] = var15;
                    field751[field652] = var9;
                    field530[field652] = null;
                    field752[field652] = (var11 << 16) + (var12 << 8) + var14;
                    field652++;
                }
            }
        }
        if (class264.field3010 == arg0) {
            int var18 = var1.method7172();
            int var19 = (var18 >> 4 & 0x7) + Statics.field3308;
            int var20 = (var18 & 0x7) + Statics.field182;
            int var21 = var1.method7011();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class335 var22 = field750[Statics.field99][var19][var20];
                if (var22 != null) {
                    for (class96 var23 = (class96) var22.method5540(); var23 != null; var23 = (class96) var22.method5534()) {
                        if ((var21 & 0x7FFF) == var23.field1272) {
                            var23.method6503();
                            break;
                        }
                    }
                    if (var22.method5540() == null) {
                        field750[Statics.field99][var19][var20] = null;
                    }
                    method2484(var19, var20);
                }
            }
            return;
        }
        if (class264.field3005 == arg0) {
            byte var24 = var1.method7093();
            int var25 = var1.method7148();
            byte var26 = var1.method7004();
            byte var27 = var1.method7093();
            int var28 = var1.method7012();
            byte var29 = var1.method7004();
            int var30 = var1.method7011();
            int var31 = var1.method7070();
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = field749[var32];
            int var35 = var1.method7070();
            int var36 = (var35 >> 4 & 0x7) + Statics.field3308;
            int var37 = (var35 & 0x7) + Statics.field182;
            int var38 = var1.method7011();
            class85 var39;
            if (field622 == var25) {
                var39 = Statics.field4004;
            } else {
                var39 = field621[var25];
            }
            if (var39 != null) {
                class188 var40 = class188.method2828(var30);
                int var41;
                int var42;
                if (var33 == 1 || var33 == 3) {
                    var41 = var40.field2057;
                    var42 = var40.field2031;
                } else {
                    var41 = var40.field2031;
                    var42 = var40.field2057;
                }
                int var43 = (var41 >> 1) + var36;
                int var44 = (var41 + 1 >> 1) + var36;
                int var45 = (var42 >> 1) + var37;
                int var46 = (var42 + 1 >> 1) + var37;
                int[][] var47 = class75.field988[Statics.field99];
                int var48 = var47[var43][var45] + var47[var44][var45] + var47[var43][var46] + var47[var44][var46] >> 2;
                int var49 = (var36 << 7) + (var41 << 6);
                int var50 = (var37 << 7) + (var42 << 6);
                class241 var51 = var40.method3330(var32, var33, var47, var49, var48, var50);
                if (var51 != null) {
                    method5430(Statics.field99, var36, var37, var34, -1, 0, 0, var38 + 1, var28 + 1);
                    var39.field1079 = field507 + var38;
                    var39.field1080 = field507 + var28;
                    var39.field1084 = var51;
                    var39.field1081 = var36 * 128 + var41 * 64;
                    var39.field1083 = var37 * 128 + var42 * 64;
                    var39.field1082 = var48;
                    if (var26 > var29) {
                        byte var52 = var26;
                        var26 = var29;
                        var29 = var52;
                    }
                    if (var27 > var24) {
                        byte var53 = var27;
                        var27 = var24;
                        var24 = var53;
                    }
                    var39.field1088 = var26 + var36;
                    var39.field1087 = var29 + var36;
                    var39.field1086 = var27 + var37;
                    var39.field1072 = var24 + var37;
                }
            }
        }
        if (class264.field3008 == arg0) {
            int var54 = var1.method7148();
            int var55 = var1.method6971();
            int var56 = (var55 >> 4 & 0x7) + Statics.field3308;
            int var57 = (var55 & 0x7) + Statics.field182;
            int var58 = var1.method7010();
            int var59 = var1.method7010();
            if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                class335 var60 = field750[Statics.field99][var56][var57];
                if (var60 != null) {
                    for (class96 var61 = (class96) var60.method5540(); var61 != null; var61 = (class96) var60.method5534()) {
                        if ((var54 & 0x7FFF) == var61.field1272 && var61.field1268 == var58) {
                            var61.field1268 = var59;
                            break;
                        }
                    }
                    method2484(var56, var57);
                }
            }
        } else if (class264.field3016 == arg0) {
            int var62 = var1.method7070();
            int var63 = var1.method7148();
            int var64 = var1.method7012();
            int var65 = var1.method7172();
            int var66 = (var65 >> 4 & 0x7) + Statics.field3308;
            int var67 = (var65 & 0x7) + Statics.field182;
            if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                int var68 = var66 * 128 + 64;
                int var69 = var67 * 128 + 64;
                class65 var70 = new class65(var63, Statics.field99, var68, var69, method3938(var68, var69, Statics.field99) - var62, var64, field507);
                field744.method5530(var70);
            }
        } else if (class264.field3014 == arg0) {
            int var71 = var1.method7039();
            int var72 = (var71 >> 4 & 0x7) + Statics.field3308;
            int var73 = (var71 & 0x7) + Statics.field182;
            int var74 = var1.method7039();
            int var75 = var74 >> 2;
            int var76 = var74 & 0x3;
            int var77 = field749[var75];
            int var78 = var1.method7011();
            if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                method5430(Statics.field99, var72, var73, var77, var78, var75, var76, 0, -1);
            }
        } else if (class264.field3012 == arg0) {
            int var79 = var1.method7172() * 4;
            int var80 = var1.method7011();
            int var81 = var1.method7014();
            int var82 = var1.method7070();
            int var83 = (var82 >> 4 & 0x7) + Statics.field3308;
            int var84 = (var82 & 0x7) + Statics.field182;
            int var85 = var1.method7011();
            byte var86 = var1.method7005();
            int var87 = var1.method7039();
            byte var88 = var1.method7182();
            int var89 = var1.method6971() * 4;
            int var90 = var1.method7070();
            int var91 = var1.method7011();
            int var92 = var83 + var86;
            int var93 = var84 + var88;
            if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && var91 != 65535) {
                int var94 = var83 * 128 + 64;
                int var95 = var84 * 128 + 64;
                int var96 = var92 * 128 + 64;
                int var97 = var93 * 128 + 64;
                class70 var98 = new class70(var91, Statics.field99, var94, var95, method3938(var94, var95, Statics.field99) - var79, field507 + var80, field507 + var85, var87, var90, var81, var89);
                var98.method1878(var96, var97, method3938(var96, var97, Statics.field99) - var89, field507 + var80);
                field636.method5530(var98);
            }
        } else if (class264.field3006 == arg0) {
            int var99 = var1.method7011();
            int var100 = var1.method7070();
            int var101 = var100 >> 2;
            int var102 = var100 & 0x3;
            int var103 = field749[var101];
            int var104 = var1.method7172();
            int var105 = (var104 >> 4 & 0x7) + Statics.field3308;
            int var106 = (var104 & 0x7) + Statics.field182;
            if (var105 >= 0 && var106 >= 0 && var105 < 103 && var106 < 103) {
                if (var103 == 0) {
                    class246 var107 = Statics.field1005.method4276(Statics.field99, var105, var106);
                    if (var107 != null) {
                        int var108 = class242.method2963(var107.field2837);
                        if (var101 == 2) {
                            var107.field2832 = new class73(var108, 2, var102 + 4, Statics.field99, var105, var106, var99, false, var107.field2832);
                            var107.field2836 = new class73(var108, 2, var102 + 1 & 0x3, Statics.field99, var105, var106, var99, false, var107.field2836);
                        } else {
                            var107.field2832 = new class73(var108, var101, var102, Statics.field99, var105, var106, var99, false, var107.field2832);
                        }
                    }
                }
                if (var103 == 1) {
                    class248 var109 = Statics.field1005.method4382(Statics.field99, var105, var106);
                    if (var109 != null) {
                        int var110 = class242.method2963(var109.field2852);
                        if (var101 == 4 || var101 == 5) {
                            var109.field2850 = new class73(var110, 4, var102, Statics.field99, var105, var106, var99, false, var109.field2850);
                        } else if (var101 == 6) {
                            var109.field2850 = new class73(var110, 4, var102 + 4, Statics.field99, var105, var106, var99, false, var109.field2850);
                        } else if (var101 == 7) {
                            var109.field2850 = new class73(var110, 4, (var102 + 2 & 0x3) + 4, Statics.field99, var105, var106, var99, false, var109.field2850);
                        } else if (var101 == 8) {
                            var109.field2850 = new class73(var110, 4, var102 + 4, Statics.field99, var105, var106, var99, false, var109.field2850);
                            var109.field2843 = new class73(var110, 4, (var102 + 2 & 0x3) + 4, Statics.field99, var105, var106, var99, false, var109.field2843);
                        }
                    }
                }
                if (var103 == 2) {
                    class249 var111 = Statics.field1005.method4314(Statics.field99, var105, var106);
                    if (var101 == 11) {
                        var101 = 10;
                    }
                    if (var111 != null) {
                        var111.field2860 = new class73(class242.method2963(var111.field2861), var101, var102, Statics.field99, var105, var106, var99, false, var111.field2860);
                    }
                }
                if (var103 == 3) {
                    class227 var112 = Statics.field1005.method4278(Statics.field99, var105, var106);
                    if (var112 != null) {
                        var112.field2494 = new class73(class242.method2963(var112.field2495), 22, var102, Statics.field99, var105, var106, var99, false, var112.field2494);
                    }
                }
            }
        } else if (class264.field3009 == arg0) {
            int var113 = var1.method7011();
            int var114 = var1.method6971();
            int var115 = (var114 >> 4 & 0x7) + Statics.field3308;
            int var116 = (var114 & 0x7) + Statics.field182;
            int var117 = var1.method7011();
            if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                class96 var118 = new class96();
                var118.field1272 = var113;
                var118.field1268 = var117;
                if (field750[Statics.field99][var115][var116] == null) {
                    field750[Statics.field99][var115][var116] = new class335();
                }
                field750[Statics.field99][var115][var116].method5530(var118);
                method2484(var115, var116);
            }
        }
    }

    @ObfuscatedName("lp.hf(IIIIIIIIII)V")
    public static final void method5430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class86 var9 = null;
        for (class86 var10 = (class86) field665.method5540(); var10 != null; var10 = (class86) field665.method5534()) {
            if (var10.field1114 == arg0 && var10.field1102 == arg1 && var10.field1103 == arg2 && var10.field1109 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class86();
            var9.field1114 = arg0;
            var9.field1109 = arg3;
            var9.field1102 = arg1;
            var9.field1103 = arg2;
            method3004(var9);
            field665.method5530(var9);
        }
        var9.field1104 = arg4;
        var9.field1108 = arg5;
        var9.field1107 = arg6;
        var9.field1110 = arg7;
        var9.field1111 = arg8;
    }

    @ObfuscatedName("aw.hu(I)V")
    public static final void method385() {
        for (class86 var0 = (class86) field665.method5540(); var0 != null; var0 = (class86) field665.method5534()) {
            if (var0.field1111 == -1) {
                var0.field1110 = 0;
                method3004(var0);
            } else {
                var0.method6503();
            }
        }
    }

    @ObfuscatedName("fa.hb(Lct;I)V")
    public static final void method3004(class86 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1109 == 0) {
            var1 = Statics.field1005.method4279(arg0.field1114, arg0.field1102, arg0.field1103);
        }
        if (arg0.field1109 == 1) {
            var1 = Statics.field1005.method4280(arg0.field1114, arg0.field1102, arg0.field1103);
        }
        if (arg0.field1109 == 2) {
            var1 = Statics.field1005.method4281(arg0.field1114, arg0.field1102, arg0.field1103);
        }
        if (arg0.field1109 == 3) {
            var1 = Statics.field1005.method4282(arg0.field1114, arg0.field1102, arg0.field1103);
        }
        if (var1 != 0L) {
            int var6 = Statics.field1005.method4412(arg0.field1114, arg0.field1102, arg0.field1103, var1);
            var3 = class242.method2963(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1101 = var3;
        arg0.field1106 = var4;
        arg0.field1105 = var5;
    }

    @ObfuscatedName("ba.hk(I)V")
    public static final void method1823() {
        for (class86 var0 = (class86) field665.method5540(); var0 != null; var0 = (class86) field665.method5534()) {
            if (var0.field1111 > 0) {
                var0.field1111--;
            }
            if (var0.field1111 == 0) {
                if (var0.field1101 >= 0) {
                    int var1 = var0.field1101;
                    int var2 = var0.field1106;
                    class188 var3 = class188.method2828(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method3327(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method2849(var0.field1114, var0.field1109, var0.field1102, var0.field1103, var0.field1101, var0.field1105, var0.field1106);
                var0.method6503();
            } else {
                if (var0.field1110 > 0) {
                    var0.field1110--;
                }
                if (var0.field1110 == 0 && var0.field1102 >= 1 && var0.field1103 >= 1 && var0.field1102 <= 102 && var0.field1103 <= 102) {
                    if (var0.field1104 >= 0) {
                        int var5 = var0.field1104;
                        int var6 = var0.field1108;
                        class188 var7 = class188.method2828(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method3327(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method2849(var0.field1114, var0.field1109, var0.field1102, var0.field1103, var0.field1104, var0.field1107, var0.field1108);
                    var0.field1110 = -1;
                    if (var0.field1104 == var0.field1101 && var0.field1101 == -1) {
                        var0.method6503();
                    } else if (var0.field1104 == var0.field1101 && var0.field1107 == var0.field1105 && var0.field1108 == var0.field1106) {
                        var0.method6503();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ea.ha(IIIIIIII)V")
    public static final void method2849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field503 && Statics.field99 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field1005.method4279(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1005.method4280(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1005.method4281(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1005.method4282(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field1005.method4412(arg0, arg2, arg3, var7);
            int var13 = class242.method2963(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1005.method4383(arg0, arg2, arg3);
                class188 var16 = class188.method2828(var13);
                if (var16.field2016 != 0) {
                    field568[arg0].method3516(arg2, arg3, var14, var15, var16.field2028);
                }
            }
            if (arg1 == 1) {
                Statics.field1005.method4272(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1005.method4396(arg0, arg2, arg3);
                class188 var17 = class188.method2828(var13);
                if (var17.field2031 + arg2 > 103 || var17.field2031 + arg3 > 103 || var17.field2057 + arg2 > 103 || var17.field2057 + arg3 > 103) {
                    return;
                }
                if (var17.field2016 != 0) {
                    field568[arg0].method3517(arg2, arg3, var17.field2031, var17.field2057, var15, var17.field2028);
                }
            }
            if (arg1 == 3) {
                Statics.field1005.method4274(arg0, arg2, arg3);
                class188 var18 = class188.method2828(var13);
                if (var18.field2016 == 1) {
                    field568[arg0].method3510(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class75.field985[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class234 var20 = Statics.field1005;
        class192 var21 = field568[arg0];
        class188 var22 = class188.method2828(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field2057;
            var24 = var22.field2031;
        } else {
            var23 = var22.field2031;
            var24 = var22.field2057;
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
        int[][] var29 = class75.field988[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class242.method4607(arg2, arg3, 2, var22.field2034 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field2055 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class235 var36;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var36 = var22.method3330(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class73(arg4, 22, arg5, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4260(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field2016 == 1) {
                var21.method3514(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class235 var62;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var62 = var22.method3330(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class73(arg4, 10, arg5, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            if (var62 != null) {
                var20.method4404(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field2016 != 0) {
                var21.method3512(arg2, arg3, var23, var24, var22.field2028);
            }
        } else if (arg6 >= 12) {
            class235 var37;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var37 = var22.method3330(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class73(arg4, arg6, arg5, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4404(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field2016 != 0) {
                var21.method3512(arg2, arg3, var23, var24, var22.field2028);
            }
        } else if (arg6 == 0) {
            class235 var38;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var38 = var22.method3330(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class73(arg4, 0, arg5, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4262(arg0, arg2, arg3, var30, var38, (class235) null, class75.field991[arg5], 0, var33, var35);
            if (var22.field2016 != 0) {
                var21.method3535(arg2, arg3, arg6, arg5, var22.field2028);
            }
        } else if (arg6 == 1) {
            class235 var39;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var39 = var22.method3330(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class73(arg4, 1, arg5, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4262(arg0, arg2, arg3, var30, var39, (class235) null, class75.field990[arg5], 0, var33, var35);
            if (var22.field2016 != 0) {
                var21.method3535(arg2, arg3, arg6, arg5, var22.field2028);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class235 var41;
            class235 var42;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var41 = var22.method3330(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method3330(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class73(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
                var42 = new class73(arg4, 2, var40, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4262(arg0, arg2, arg3, var30, var41, var42, class75.field991[arg5], class75.field991[var40], var33, var35);
            if (var22.field2016 != 0) {
                var21.method3535(arg2, arg3, arg6, arg5, var22.field2028);
            }
        } else if (arg6 == 3) {
            class235 var43;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var43 = var22.method3330(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class73(arg4, 3, arg5, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4262(arg0, arg2, arg3, var30, var43, (class235) null, class75.field990[arg5], 0, var33, var35);
            if (var22.field2016 != 0) {
                var21.method3535(arg2, arg3, arg6, arg5, var22.field2028);
            }
        } else if (arg6 == 9) {
            class235 var44;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var44 = var22.method3330(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class73(arg4, arg6, arg5, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4404(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field2016 != 0) {
                var21.method3512(arg2, arg3, var23, var24, var22.field2028);
            }
        } else if (arg6 == 4) {
            class235 var45;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var45 = var22.method3330(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class73(arg4, 4, arg5, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4392(arg0, arg2, arg3, var30, var45, (class235) null, class75.field991[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method4279(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class188.method2828(class242.method2963(var47)).field2039;
            }
            class235 var49;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var49 = var22.method3330(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class73(arg4, 4, arg5, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4392(arg0, arg2, arg3, var30, var49, (class235) null, class75.field991[arg5], 0, class75.field993[arg5] * var46, class75.field994[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method4279(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class188.method2828(class242.method2963(var51)).field2039 / 2;
            }
            class235 var53;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var53 = var22.method3330(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class73(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4392(arg0, arg2, arg3, var30, var53, (class235) null, 256, arg5, class75.field998[arg5] * var50, class75.field996[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class235 var55;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var55 = var22.method3330(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class73(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4392(arg0, arg2, arg3, var30, var55, (class235) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method4279(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class188.method2828(class242.method2963(var57)).field2039 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class235 var60;
            class235 var61;
            if (var22.field2061 == -1 && var22.field2062 == null) {
                var60 = var22.method3330(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method3330(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class73(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
                var61 = new class73(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field2061, var22.field2064, (class235) null);
            }
            var20.method4392(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class75.field998[arg5] * var56, class75.field996[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("dg.hv(III)V")
    public static final void method2484(int arg0, int arg1) {
        class335 var2 = field750[Statics.field99][arg0][arg1];
        if (var2 == null) {
            Statics.field1005.method4424(Statics.field99, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class96 var5 = null;
        for (class96 var6 = (class96) var2.method5540(); var6 != null; var6 = (class96) var2.method5534()) {
            class189 var7 = Statics.method268(var6.field1272);
            long var8 = (long) var7.field2073;
            if (var7.field2087 == 1) {
                var8 = (long) (var6.field1268 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1005.method4424(Statics.field99, arg0, arg1);
            return;
        }
        var2.method5528(var5);
        class96 var10 = null;
        class96 var11 = null;
        for (class96 var12 = (class96) var2.method5540(); var12 != null; var12 = (class96) var2.method5534()) {
            if (var5.field1272 != var12.field1272) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1272 != var12.field1272 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class242.method4607(arg0, arg1, 3, false, 0);
        Statics.field1005.method4261(Statics.field99, arg0, arg1, method3938(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field99), var5, var13, var10, var11);
    }

    @ObfuscatedName("hd.ix(ZLpz;B)V")
    public static final void method3954(boolean arg0, class437 arg1) {
        field627 = 0;
        field548 = 0;
        class437 var2 = field685.field1319;
        var2.method6922();
        int var3 = var2.method6923(8);
        if (var3 < field546) {
            for (int var4 = var3; var4 < field546; var4++) {
                field628[++field627 - 1] = field570[var4];
            }
        }
        if (var3 > field546) {
            throw new RuntimeException("");
        }
        field546 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field570[var5];
            class92 var7 = field560[var6];
            int var8 = var2.method6923(1);
            if (var8 == 0) {
                field570[++field546 - 1] = var6;
                var7.field1166 = field507;
            } else {
                int var9 = var2.method6923(2);
                if (var9 == 0) {
                    field570[++field546 - 1] = var6;
                    var7.field1166 = field507;
                    field549[++field548 - 1] = var6;
                } else if (var9 == 1) {
                    field570[++field546 - 1] = var6;
                    var7.field1166 = field507;
                    int var10 = var2.method6923(3);
                    var7.method2243(var10, class194.field2186);
                    int var11 = var2.method6923(1);
                    if (var11 == 1) {
                        field549[++field548 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field570[++field546 - 1] = var6;
                    var7.field1166 = field507;
                    if (var2.method6923(1) == 1) {
                        int var12 = var2.method6923(3);
                        var7.method2243(var12, class194.field2188);
                        int var13 = var2.method6923(3);
                        var7.method2243(var13, class194.field2188);
                    } else {
                        int var14 = var2.method6923(3);
                        var7.method2243(var14, class194.field2185);
                    }
                    int var15 = var2.method6923(1);
                    if (var15 == 1) {
                        field549[++field548 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field628[++field627 - 1] = var6;
                }
            }
        }
        while (arg1.method6925(field685.field1321) >= 27) {
            int var16 = arg1.method6923(15);
            if (var16 == 32767) {
                break;
            }
            boolean var20 = false;
            if (field560[var16] == null) {
                field560[var16] = new class92();
                var20 = true;
            }
            class92 var21 = field560[var16];
            field570[++field546 - 1] = var16;
            var21.field1166 = field507;
            int var22;
            int var23;
            int var25;
            if (Statics.field4603) {
                if (arg0) {
                    var22 = arg1.method6923(8);
                    if (var22 > 127) {
                        var22 -= 256;
                    }
                } else {
                    var22 = arg1.method6923(5);
                    if (var22 > 15) {
                        var22 -= 32;
                    }
                }
                var23 = arg1.method6923(1);
                int var24 = field584[arg1.method6923(3)];
                if (var20) {
                    var21.field1174 = var21.field1159 = var24;
                }
                var21.field1235 = class179.method344(arg1.method6923(14));
                if (arg0) {
                    var25 = arg1.method6923(8);
                    if (var25 > 127) {
                        var25 -= 256;
                    }
                } else {
                    var25 = arg1.method6923(5);
                    if (var25 > 15) {
                        var25 -= 32;
                    }
                }
                boolean var26 = arg1.method6923(1) == 1;
                if (var26) {
                    arg1.method6923(32);
                }
                int var27 = arg1.method6923(1);
                if (var27 == 1) {
                    field549[++field548 - 1] = var16;
                }
            } else {
                var23 = arg1.method6923(1);
                int var28 = arg1.method6923(1);
                if (var28 == 1) {
                    field549[++field548 - 1] = var16;
                }
                if (arg0) {
                    var25 = arg1.method6923(8);
                    if (var25 > 127) {
                        var25 -= 256;
                    }
                } else {
                    var25 = arg1.method6923(5);
                    if (var25 > 15) {
                        var25 -= 32;
                    }
                }
                boolean var29 = arg1.method6923(1) == 1;
                if (var29) {
                    arg1.method6923(32);
                }
                if (arg0) {
                    var22 = arg1.method6923(8);
                    if (var22 > 127) {
                        var22 -= 256;
                    }
                } else {
                    var22 = arg1.method6923(5);
                    if (var22 > 15) {
                        var22 -= 32;
                    }
                }
                var21.field1235 = class179.method344(arg1.method6923(14));
                int var30 = field584[arg1.method6923(3)];
                if (var20) {
                    var21.field1174 = var21.field1159 = var30;
                }
            }
            var21.field1151 = var21.field1235.field1905;
            var21.field1176 = var21.field1235.field1922;
            if (var21.field1176 == 0) {
                var21.field1159 = 0;
            }
            var21.field1134 = var21.field1235.field1906;
            var21.field1147 = var21.field1235.field1910;
            var21.field1126 = var21.field1235.field1907;
            var21.field1127 = var21.field1235.field1897;
            var21.field1121 = var21.field1235.field1902;
            var21.field1141 = var21.field1235.field1903;
            var21.field1119 = var21.field1235.field1904;
            var21.method2244(Statics.field4004.field1178[0] + var22, Statics.field4004.field1179[0] + var25, var23 == 1);
        }
        arg1.method6914();
        method588(arg1);
        for (int var17 = 0; var17 < field627; var17++) {
            int var18 = field628[var17];
            if (field507 != field560[var18].field1166) {
                field560[var18].field1235 = null;
                field560[var18] = null;
            }
        }
        if (field685.field1321 != arg1.field4621) {
            throw new RuntimeException(arg1.field4621 + class93.field1237 + field685.field1321);
        }
        for (int var19 = 0; var19 < field546; var19++) {
            if (field560[field570[var19]] == null) {
                throw new RuntimeException(var19 + class93.field1237 + field546);
            }
        }
    }

    @ObfuscatedName("aj.ia(Lpz;B)V")
    public static final void method588(class437 arg0) {
        for (int var1 = 0; var1 < field548; var1++) {
            int var2 = field549[var1];
            class92 var3 = field560[var2];
            int var4 = arg0.method6971();
            if (Statics.field4603 && (var4 & 0x40) != 0) {
                int var5 = arg0.method6971();
                var4 += var5 << 8;
            }
            if ((var4 & 0x1) != 0) {
                int var6 = arg0.method7148();
                int var7 = arg0.method7012();
                if (Statics.field4603) {
                    var3.field1145 = arg0.method7172() == 1;
                }
                int var8 = var3.field1132 - (var6 - Statics.field489 - Statics.field489) * 64;
                int var9 = var3.field1116 - (var7 - Statics.field1843 - Statics.field1843) * 64;
                if (var8 != 0 || var9 != 0) {
                    var3.field1122 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field1183 = arg0.method6976();
            }
            if ((var4 & 0x10) != 0) {
                var3.field1165 = arg0.method7148();
                int var10 = arg0.method6976();
                var3.field1158 = var10 >> 16;
                var3.field1135 = (var10 & 0xFFFF) + field507;
                var3.field1157 = 0;
                var3.field1156 = 0;
                if (var3.field1135 > field507) {
                    var3.field1157 = -1;
                }
                if (var3.field1165 == 65535) {
                    var3.field1165 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var11 = arg0.method6971();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg0.method6986();
                        if (var16 == 32767) {
                            var16 = arg0.method6986();
                            var14 = arg0.method6986();
                            var13 = arg0.method6986();
                            var15 = arg0.method6986();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg0.method6986();
                        }
                        int var17 = arg0.method6986();
                        var3.method2068(var16, var14, var13, var15, field507, var17);
                    }
                }
                int var18 = arg0.method7070();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg0.method6986();
                        int var21 = arg0.method6986();
                        if (var21 == 32767) {
                            var3.method2066(var20);
                        } else {
                            int var22 = arg0.method6986();
                            int var23 = arg0.method6971();
                            int var24 = var21 > 0 ? arg0.method7172() : var23;
                            var3.method2069(var20, field507, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if (Statics.field4603 && (var4 & 0x100) != 0 || !Statics.field4603 && (var4 & 0x40) != 0) {
                var3.field1130 = arg0.method7182();
                var3.field1161 = arg0.method7004();
                var3.field1133 = arg0.method7093();
                var3.field1162 = arg0.method7093();
                var3.field1144 = arg0.method7012() + field507;
                var3.field1164 = arg0.method7148() + field507;
                var3.field1136 = arg0.method7012();
                var3.field1177 = 1;
                var3.field1171 = 0;
                var3.field1130 += var3.field1178[0];
                var3.field1161 += var3.field1179[0];
                var3.field1133 += var3.field1178[0];
                var3.field1162 += var3.field1179[0];
            }
            if ((var4 & 0x200) != 0) {
                var3.field1168 = field507 + arg0.method7010();
                var3.field1169 = field507 + arg0.method7011();
                var3.field1170 = arg0.method7093();
                var3.field1115 = arg0.method7004();
                var3.field1172 = arg0.method7004();
                var3.field1123 = (byte) arg0.method7039();
            }
            if ((var4 & 0x2) != 0) {
                var3.field1129 = arg0.method6981();
                var3.field1138 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field1142 = arg0.method7011();
                if (var3.field1142 == 65535) {
                    var3.field1142 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1235 = class179.method344(arg0.method7012());
                var3.field1151 = var3.field1235.field1905;
                var3.field1176 = var3.field1235.field1922;
                var3.field1134 = var3.field1235.field1906;
                var3.field1147 = var3.field1235.field1910;
                var3.field1126 = var3.field1235.field1907;
                var3.field1127 = var3.field1235.field1897;
                var3.field1121 = var3.field1235.field1902;
                var3.field1141 = var3.field1235.field1903;
                var3.field1119 = var3.field1235.field1904;
            }
            if ((var4 & 0x8) != 0) {
                int var25 = arg0.method7010();
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var26 = arg0.method7172();
                if (var3.field1149 == var25 && var25 != -1) {
                    int var27 = class191.method3011(var25).field2162;
                    if (var27 == 1) {
                        var3.field1150 = 0;
                        var3.field1137 = 0;
                        var3.field1152 = var26;
                        var3.field1153 = 0;
                    }
                    if (var27 == 2) {
                        var3.field1153 = 0;
                    }
                } else if (var25 == -1 || var3.field1149 == -1 || class191.method3011(var25).field2156 >= class191.method3011(var3.field1149).field2156) {
                    var3.field1149 = var25;
                    var3.field1150 = 0;
                    var3.field1137 = 0;
                    var3.field1152 = var26;
                    var3.field1153 = 0;
                    var3.field1171 = var3.field1177;
                }
            }
        }
    }

    @ObfuscatedName("mq.im(Lcz;IILgm;I)V")
    public static final void method5693(class85 arg0, int arg1, int arg2, class194 arg3) {
        int var4 = arg0.field1178[0];
        int var5 = arg0.field1179[0];
        int var6 = arg0.method2033();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method2033();
        class193 var8 = method2501(arg1, arg2);
        class192 var9 = field568[arg0.field1092];
        int[] var10 = field785;
        int[] var11 = field786;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class195.field2196[var12][var13] = 0;
                class195.field2193[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = class195.method399(var4, var5, var8, var9);
        } else if (var7 == 2) {
            var14 = class195.method4965(var4, var5, var8, var9);
        } else {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class195.field2196[var17][var18] = 99;
            class195.field2193[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class195.field2195[var21] = var4;
            int var63 = var21 + 1;
            class195.field2194[var21] = var5;
            int[][] var23 = var9.field2168;
            boolean var28;
            label421: while (true) {
                label419: while (true) {
                    int var24;
                    int var25;
                    int var26;
                    int var27;
                    int var29;
                    do {
                        do {
                            do {
                                label396: do {
                                    if (var63 == var22) {
                                        Statics.field1190 = var15;
                                        Statics.field1989 = var16;
                                        var28 = false;
                                        break label421;
                                    }
                                    var15 = class195.field2195[var22];
                                    var16 = class195.field2194[var22];
                                    var22 = var22 + 1 & 0xFFF;
                                    var24 = var15 - var19;
                                    var25 = var16 - var20;
                                    var26 = var15 - var9.field2173;
                                    var27 = var16 - var9.field2174;
                                    if (var8.method1055(var7, var15, var16, var9)) {
                                        Statics.field1190 = var15;
                                        Statics.field1989 = var16;
                                        var28 = true;
                                        break label421;
                                    }
                                    var29 = class195.field2193[var24][var25] + 1;
                                    if (var24 > 0 && class195.field2196[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x124010E) == 0 && (var23[var26 - 1][var7 + var27 - 1] & 0x1240138) == 0) {
                                        int var30 = 1;
                                        while (true) {
                                            if (var30 >= var7 - 1) {
                                                class195.field2195[var63] = var15 - 1;
                                                class195.field2194[var63] = var16;
                                                var63 = var63 + 1 & 0xFFF;
                                                class195.field2196[var24 - 1][var25] = 2;
                                                class195.field2193[var24 - 1][var25] = var29;
                                                break;
                                            }
                                            if ((var23[var26 - 1][var27 + var30] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var30++;
                                        }
                                    }
                                    if (var24 < 128 - var7 && class195.field2196[var24 + 1][var25] == 0 && (var23[var7 + var26][var27] & 0x1240183) == 0 && (var23[var7 + var26][var7 + var27 - 1] & 0x12401E0) == 0) {
                                        int var31 = 1;
                                        while (true) {
                                            if (var31 >= var7 - 1) {
                                                class195.field2195[var63] = var15 + 1;
                                                class195.field2194[var63] = var16;
                                                var63 = var63 + 1 & 0xFFF;
                                                class195.field2196[var24 + 1][var25] = 8;
                                                class195.field2193[var24 + 1][var25] = var29;
                                                break;
                                            }
                                            if ((var23[var7 + var26][var27 + var31] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var31++;
                                        }
                                    }
                                    if (var25 > 0 && class195.field2196[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x124010E) == 0 && (var23[var7 + var26 - 1][var27 - 1] & 0x1240183) == 0) {
                                        int var32 = 1;
                                        while (true) {
                                            if (var32 >= var7 - 1) {
                                                class195.field2195[var63] = var15;
                                                class195.field2194[var63] = var16 - 1;
                                                var63 = var63 + 1 & 0xFFF;
                                                class195.field2196[var24][var25 - 1] = 1;
                                                class195.field2193[var24][var25 - 1] = var29;
                                                break;
                                            }
                                            if ((var23[var26 + var32][var27 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var32++;
                                        }
                                    }
                                    if (var25 < 128 - var7 && class195.field2196[var24][var25 + 1] == 0 && (var23[var26][var7 + var27] & 0x1240138) == 0 && (var23[var7 + var26 - 1][var7 + var27] & 0x12401E0) == 0) {
                                        int var33 = 1;
                                        while (true) {
                                            if (var33 >= var7 - 1) {
                                                class195.field2195[var63] = var15;
                                                class195.field2194[var63] = var16 + 1;
                                                var63 = var63 + 1 & 0xFFF;
                                                class195.field2196[var24][var25 + 1] = 4;
                                                class195.field2193[var24][var25 + 1] = var29;
                                                break;
                                            }
                                            if ((var23[var26 + var33][var7 + var27] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var33++;
                                        }
                                    }
                                    if (var24 > 0 && var25 > 0 && class195.field2196[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0) {
                                        int var34 = 1;
                                        while (true) {
                                            if (var34 >= var7) {
                                                class195.field2195[var63] = var15 - 1;
                                                class195.field2194[var63] = var16 - 1;
                                                var63 = var63 + 1 & 0xFFF;
                                                class195.field2196[var24 - 1][var25 - 1] = 3;
                                                class195.field2193[var24 - 1][var25 - 1] = var29;
                                                break;
                                            }
                                            if ((var23[var26 - 1][var27 - 1 + var34] & 0x124013E) != 0 || (var23[var26 - 1 + var34][var27 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var34++;
                                        }
                                    }
                                    if (var24 < 128 - var7 && var25 > 0 && class195.field2196[var24 + 1][var25 - 1] == 0 && (var23[var7 + var26][var27 - 1] & 0x1240183) == 0) {
                                        int var35 = 1;
                                        while (true) {
                                            if (var35 >= var7) {
                                                class195.field2195[var63] = var15 + 1;
                                                class195.field2194[var63] = var16 - 1;
                                                var63 = var63 + 1 & 0xFFF;
                                                class195.field2196[var24 + 1][var25 - 1] = 9;
                                                class195.field2193[var24 + 1][var25 - 1] = var29;
                                                break;
                                            }
                                            if ((var23[var7 + var26][var27 - 1 + var35] & 0x12401E3) != 0 || (var23[var26 + var35][var27 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var35++;
                                        }
                                    }
                                    if (var24 > 0 && var25 < 128 - var7 && class195.field2196[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var7 + var27] & 0x1240138) == 0) {
                                        for (int var36 = 1; var36 < var7; var36++) {
                                            if ((var23[var26 - 1][var27 + var36] & 0x124013E) != 0 || (var23[var26 - 1 + var36][var7 + var27] & 0x12401F8) != 0) {
                                                continue label396;
                                            }
                                        }
                                        class195.field2195[var63] = var15 - 1;
                                        class195.field2194[var63] = var16 + 1;
                                        var63 = var63 + 1 & 0xFFF;
                                        class195.field2196[var24 - 1][var25 + 1] = 6;
                                        class195.field2193[var24 - 1][var25 + 1] = var29;
                                    }
                                } while (var24 >= 128 - var7);
                            } while (var25 >= 128 - var7);
                        } while (class195.field2196[var24 + 1][var25 + 1] != 0);
                    } while ((var23[var7 + var26][var7 + var27] & 0x12401E0) != 0);
                    for (int var37 = 1; var37 < var7; var37++) {
                        if ((var23[var26 + var37][var7 + var27] & 0x12401F8) != 0 || (var23[var7 + var26][var27 + var37] & 0x12401E3) != 0) {
                            continue label419;
                        }
                    }
                    class195.field2195[var63] = var15 + 1;
                    class195.field2194[var63] = var16 + 1;
                    var63 = var63 + 1 & 0xFFF;
                    class195.field2196[var24 + 1][var25 + 1] = 12;
                    class195.field2193[var24 + 1][var25 + 1] = var29;
                }
            }
            var14 = var28;
        }
        int var56;
        label467: {
            int var38 = var4 - 64;
            int var39 = var5 - 64;
            int var40 = Statics.field1190;
            int var41 = Statics.field1989;
            if (!var14) {
                int var42 = Integer.MAX_VALUE;
                int var43 = Integer.MAX_VALUE;
                byte var44 = 10;
                int var45 = var8.field2179;
                int var46 = var8.field2180;
                int var47 = var8.field2181;
                int var48 = var8.field2182;
                for (int var49 = var45 - var44; var49 <= var44 + var45; var49++) {
                    for (int var50 = var46 - var44; var50 <= var44 + var46; var50++) {
                        int var51 = var49 - var38;
                        int var52 = var50 - var39;
                        if (var51 >= 0 && var52 >= 0 && var51 < 128 && var52 < 128 && class195.field2193[var51][var52] < 100) {
                            int var53 = 0;
                            if (var49 < var45) {
                                var53 = var45 - var49;
                            } else if (var49 > var45 + var47 - 1) {
                                var53 = var49 - (var45 + var47 - 1);
                            }
                            int var54 = 0;
                            if (var50 < var46) {
                                var54 = var46 - var50;
                            } else if (var50 > var46 + var48 - 1) {
                                var54 = var50 - (var46 + var48 - 1);
                            }
                            int var55 = var53 * var53 + var54 * var54;
                            if (var55 < var42 || var42 == var55 && class195.field2193[var51][var52] < var43) {
                                var42 = var55;
                                var43 = class195.field2193[var51][var52];
                                var40 = var49;
                                var41 = var50;
                            }
                        }
                    }
                }
                if (var42 == Integer.MAX_VALUE) {
                    var56 = -1;
                    break label467;
                }
            }
            if (var4 == var40 && var5 == var41) {
                var10[0] = var40;
                var11[0] = var41;
                var56 = 0;
            } else {
                byte var57 = 0;
                class195.field2195[var57] = var40;
                int var64 = var57 + 1;
                class195.field2194[var57] = var41;
                int var58;
                int var59 = var58 = class195.field2196[var40 - var38][var41 - var39];
                while (var4 != var40 || var5 != var41) {
                    if (var58 != var59) {
                        var58 = var59;
                        class195.field2195[var64] = var40;
                        class195.field2194[var64++] = var41;
                    }
                    if ((var59 & 0x2) != 0) {
                        var40++;
                    } else if ((var59 & 0x8) != 0) {
                        var40--;
                    }
                    if ((var59 & 0x1) != 0) {
                        var41++;
                    } else if ((var59 & 0x4) != 0) {
                        var41--;
                    }
                    var59 = class195.field2196[var40 - var38][var41 - var39];
                }
                int var60 = 0;
                while (var64-- > 0) {
                    var10[var60] = class195.field2195[var64];
                    var11[var60++] = class195.field2194[var64];
                    if (var60 >= var10.length) {
                        break;
                    }
                }
                var56 = var60;
            }
        }
        int var61 = var56;
        if (var56 >= 1) {
            for (int var62 = 0; var62 < var61 - 1; var62++) {
                arg0.method2028(field785[var62], field786[var62], arg3);
            }
        }
    }

    @ObfuscatedName("dp.ip(III)Lgt;")
    public static class193 method2501(int arg0, int arg1) {
        field784.field2179 = arg0;
        field784.field2180 = arg1;
        field784.field2181 = 1;
        field784.field2182 = 1;
        return field784;
    }

    @ObfuscatedName("my.it(I)V")
    public static void method5961() {
        field643 = 0;
        field642 = false;
        field648[0] = class309.field3849;
        field649[0] = "";
        field686[0] = 1006;
        field724[0] = false;
        field643 = 1;
    }

    @ObfuscatedName("ck.ik(III)V")
    public static final void method2420(int arg0, int arg1) {
        if (field643 < 2 && field659 == 0 && !field655 || !field654) {
            return;
        }
        int var2 = method5217();
        String var3;
        if (field659 == 1 && field643 < 2) {
            var3 = class309.field3754 + class309.field3764 + field634 + " " + class93.field1242;
        } else if (field655 && field643 < 2) {
            var3 = field775 + class309.field3764 + field653 + " " + class93.field1242;
        } else {
            var3 = method6126(var2);
        }
        if (field643 > 2) {
            var3 = var3 + class93.method2498(16777215) + " " + '/' + " " + (field643 - 2) + class309.field3767;
        }
        Statics.field2183.method5755(var3, arg0 + 4, arg1 + 15, 16777215, 0, field507 / 1000);
    }

    @ObfuscatedName("ks.iq(B)V")
    public static final void method4981() {
        int var0 = Statics.field1578;
        int var1 = Statics.field3;
        int var2 = Statics.field2123;
        int var3 = Statics.field4170;
        int var4 = 6116423;
        class447.method7249(var0, var1, var2, var3, var4);
        class447.method7249(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class447.method7262(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2183.method5782(class309.field3757, var0 + 3, var1 + 14, var4, -1);
        int var5 = class33.field229;
        int var6 = class33.field230;
        for (int var7 = 0; var7 < field643; var7++) {
            int var8 = (field643 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field2183.method5782(method6126(var7), var0 + 3, var8, var9, 0);
        }
        method2000(Statics.field1578, Statics.field3, Statics.field2123, Statics.field4170);
    }

    @ObfuscatedName("y.in(I)Z")
    public static final boolean method298() {
        return field642;
    }

    @ObfuscatedName("ci.il(IIIII)V")
    public static final void method2226(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field714; var4++) {
            if (field673[var4] + field646[var4] > arg0 && field646[var4] < arg0 + arg2 && field720[var4] + field617[var4] > arg1 && field720[var4] < arg1 + arg3) {
                field716[var4] = true;
            }
        }
    }

    @ObfuscatedName("ch.iv(IIIIS)V")
    public static final void method2000(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field714; var4++) {
            if (field673[var4] + field646[var4] > arg0 && field646[var4] < arg0 + arg2 && field720[var4] + field617[var4] > arg1 && field720[var4] < arg1 + arg3) {
                field717[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ic(B)V")
    public final void method1090() {
        method5401();
        if (Statics.field1623 != null || field721 != null) {
            return;
        }
        int var1 = class33.field220;
        if (field642) {
            if (var1 != 1 && (Statics.field3560 || var1 != 4)) {
                int var2 = class33.field229;
                int var3 = class33.field230;
                if (var2 < Statics.field1578 - 10 || var2 > Statics.field2123 + Statics.field1578 + 10 || var3 < Statics.field3 - 10 || var3 > Statics.field4170 + Statics.field3 + 10) {
                    field642 = false;
                    method2226(Statics.field1578, Statics.field3, Statics.field2123, Statics.field4170);
                }
            }
            if (var1 == 1 || !Statics.field3560 && var1 == 4) {
                int var4 = Statics.field1578;
                int var5 = Statics.field3;
                int var6 = Statics.field2123;
                int var7 = class33.field237;
                int var8 = class33.field234;
                int var9 = -1;
                for (int var10 = 0; var10 < field643; var10++) {
                    int var11 = (field643 - 1 - var10) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1 && var9 >= 0) {
                    int var12 = field644[var9];
                    int var13 = field645[var9];
                    int var14 = field686[var9];
                    int var15 = field647[var9];
                    String var16 = field648[var9];
                    String var17 = field649[var9];
                    method70(var12, var13, var14, var15, var16, var17, class33.field237, class33.field234);
                }
                field642 = false;
                method2226(Statics.field1578, Statics.field3, Statics.field2123, Statics.field4170);
            }
            return;
        }
        int var18 = method5217();
        if ((var1 == 1 || !Statics.field3560 && var1 == 4) && var18 >= 0) {
            int var19 = field686[var18];
            if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                int var20 = field644[var18];
                int var21 = field645[var18];
                class295 var22 = class295.method2688(var21);
                if (class296.method1614(Statics.method5486(var22)) || class296.method1016(Statics.method5486(var22))) {
                    if (Statics.field1623 != null && !field768 && field643 > 0 && !this.method1091()) {
                        Statics.method2429(field614, field782);
                    }
                    field768 = false;
                    field781 = 0;
                    if (Statics.field1623 != null) {
                        method5855(Statics.field1623);
                    }
                    Statics.field1623 = class295.method2688(var21);
                    field613 = var20;
                    field614 = class33.field237;
                    field782 = class33.field234;
                    if (var18 >= 0) {
                        Statics.field829 = new class67();
                        Statics.field829.field878 = field644[var18];
                        Statics.field829.field873 = field645[var18];
                        Statics.field829.field879 = field686[var18];
                        Statics.field829.field875 = field647[var18];
                        Statics.field829.field876 = field648[var18];
                    }
                    method5855(Statics.field1623);
                    return;
                }
            }
        }
        if ((var1 == 1 || !Statics.field3560 && var1 == 4) && this.method1091()) {
            var1 = 2;
        }
        if ((var1 == 1 || !Statics.field3560 && var1 == 4) && field643 > 0 && var18 >= 0) {
            int var23 = field644[var18];
            int var24 = field645[var18];
            int var25 = field686[var18];
            int var26 = field647[var18];
            String var27 = field648[var18];
            String var28 = field649[var18];
            method70(var23, var24, var25, var26, var27, var28, class33.field237, class33.field234);
        }
        if (var1 == 2 && field643 > 0) {
            this.method1494(class33.field237, class33.field234);
        }
    }

    @ObfuscatedName("client.ij(B)Z")
    public final boolean method1091() {
        int var1 = method5217();
        return (field661 == 1 && field643 > 2 || method755(var1)) && !field724[var1];
    }

    @ObfuscatedName("client.iw(IIB)V")
    public final void method1494(int arg0, int arg1) {
        int var3 = Statics.field2183.method5741(class309.field3757);
        for (int var4 = 0; var4 < field643; var4++) {
            int var5 = Statics.field2183.method5741(method6126(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field643 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field1798) {
            var7 = Statics.field1798 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field4019) {
            var8 = Statics.field4019 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field1578 = var7;
        Statics.field3 = var8;
        Statics.field2123 = var3;
        Statics.field4170 = field643 * 15 + 22;
        int var9 = arg0 - field769;
        int var10 = arg1 - field770;
        Statics.field1005.method4431(Statics.field99, var9, var10, false);
        field642 = true;
    }

    @ObfuscatedName("ac.io(II)Z")
    public static final boolean method755(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field686[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("o.iy(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method70(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 16) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var8 = class265.method3935(class263.field2956, field685.field1328);
            var8.field3019.method7000(class24.field130[82] ? 1 : 0);
            var8.field3019.method7008(Statics.field4604);
            var8.field3019.method7008(arg3);
            var8.field3019.method7008(Statics.field489 + arg0);
            var8.field3019.method7009(Statics.field1843 + arg1);
            var8.field3019.method7164(Statics.field1715);
            var8.field3019.method6955(Statics.field1291);
            field685.method2395(var8);
        }
        if (arg2 == 23) {
            if (field642) {
                Statics.field1005.method4291();
            } else {
                Statics.field1005.method4431(Statics.field99, arg0, arg1, true);
            }
        }
        if (arg2 == 25) {
            class295 var9 = class295.method3387(arg1, arg0);
            if (var9 != null) {
                Statics.method1660();
                method4447(arg1, arg0, class296.method3944(Statics.method5486(var9)), var9.field3335);
                field659 = 0;
                field775 = Statics.method2863(var9);
                if (field775 == null) {
                    field775 = class309.field3599;
                }
                if (var9.field3451) {
                    field653 = var9.field3420 + class93.method2498(16777215);
                } else {
                    field653 = class93.method2498(65280) + var9.field3323 + class93.method2498(16777215);
                }
            }
            return;
        }
        if (arg2 == 6) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var10 = class265.method3935(class263.field2896, field685.field1328);
            var10.field3019.method6998(class24.field130[82] ? 1 : 0);
            var10.field3019.method7009(Statics.field489 + arg0);
            var10.field3019.method7008(arg3);
            var10.field3019.method7008(Statics.field1843 + arg1);
            field685.method2395(var10);
        }
        if (arg2 == 37) {
            class265 var11 = class265.method3935(class263.field2999, field685.field1328);
            var11.field3019.method7164(arg1);
            var11.field3019.method6955(arg3);
            var11.field3019.method7009(arg0);
            field685.method2395(var11);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 5) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var12 = class265.method3935(class263.field2928, field685.field1328);
            var12.field3019.method7101(class24.field130[82] ? 1 : 0);
            var12.field3019.method7008(Statics.field489 + arg0);
            var12.field3019.method6955(Statics.field1843 + arg1);
            var12.field3019.method7008(arg3);
            field685.method2395(var12);
        }
        if (arg2 == 17) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var13 = class265.method3935(class263.field2905, field685.field1328);
            var13.field3019.method6955(field663);
            var13.field3019.method6954(class24.field130[82] ? 1 : 0);
            var13.field3019.method7007(arg3);
            var13.field3019.method6957(Statics.field4182);
            var13.field3019.method6955(Statics.field1843 + arg1);
            var13.field3019.method6955(field753);
            var13.field3019.method7008(Statics.field489 + arg0);
            field685.method2395(var13);
        }
        if (arg2 == 1003) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            class92 var14 = field560[arg3];
            if (var14 != null) {
                class179 var15 = var14.field1235;
                if (var15.field1921 != null) {
                    var15 = var15.method3169();
                }
                if (var15 != null) {
                    class265 var16 = class265.method3935(class263.field2937, field685.field1328);
                    var16.field3019.method7007(var15.field1909);
                    field685.method2395(var16);
                }
            }
        }
        if (arg2 == 20) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var17 = class265.method3935(class263.field2952, field685.field1328);
            var17.field3019.method7007(Statics.field489 + arg0);
            var17.field3019.method6955(arg3);
            var17.field3019.method6998(class24.field130[82] ? 1 : 0);
            var17.field3019.method7008(Statics.field1843 + arg1);
            field685.method2395(var17);
        }
        if (arg2 == 45) {
            class85 var18 = field621[arg3];
            if (var18 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var19 = class265.method3935(class263.field2958, field685.field1328);
                var19.field3019.method7007(arg3);
                var19.field3019.method7101(class24.field130[82] ? 1 : 0);
                field685.method2395(var19);
            }
        }
        if (arg2 == 10) {
            class92 var20 = field560[arg3];
            if (var20 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var21 = class265.method3935(class263.field2926, field685.field1328);
                var21.field3019.method6955(arg3);
                var21.field3019.method6954(class24.field130[82] ? 1 : 0);
                field685.method2395(var21);
            }
        }
        if (arg2 == 24) {
            class295 var22 = class295.method2688(arg1);
            if (var22 != null) {
                boolean var23 = true;
                if (var22.field3340 > 0) {
                    var23 = Statics.method5514(var22);
                }
                if (var23) {
                    class265 var24 = class265.method3935(class263.field2898, field685.field1328);
                    var24.field3019.method6957(arg1);
                    field685.method2395(var24);
                }
            }
        }
        if (arg2 == 38) {
            Statics.method1660();
            class295 var25 = class295.method2688(arg1);
            field659 = 1;
            Statics.field4604 = arg0;
            Statics.field1715 = arg1;
            Statics.field1291 = arg3;
            method5855(var25);
            field634 = class93.method2498(16748608) + Statics.method268(arg3).field2076 + class93.method2498(16777215);
            if (field634 == null) {
                field634 = class309.field3599;
            }
            return;
        }
        if (arg2 == 12) {
            class92 var26 = field560[arg3];
            if (var26 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var27 = class265.method3935(class263.field2941, field685.field1328);
                var27.field3019.method7101(class24.field130[82] ? 1 : 0);
                var27.field3019.method7007(arg3);
                field685.method2395(var27);
            }
        }
        if (arg2 == 1005) {
            class295 var28 = class295.method2688(arg1);
            if (var28 == null || var28.field3471[arg0] < 100000) {
                class265 var29 = class265.method3935(class263.field2989, field685.field1328);
                var29.field3019.method7008(arg3);
                field685.method2395(var29);
            } else {
                class99.method2077(27, "", var28.field3471[arg0] + " x " + Statics.method268(arg3).field2076);
            }
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 26) {
            method289();
        }
        if (arg2 == 39) {
            class265 var30 = class265.method3935(class263.field2923, field685.field1328);
            var30.field3019.method6957(arg1);
            var30.field3019.method7008(arg0);
            var30.field3019.method7007(arg3);
            field685.method2395(var30);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 7) {
            class92 var31 = field560[arg3];
            if (var31 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var32 = class265.method3935(class263.field2996, field685.field1328);
                var32.field3019.method7007(arg3);
                var32.field3019.method7164(Statics.field1715);
                var32.field3019.method7009(Statics.field1291);
                var32.field3019.method7000(class24.field130[82] ? 1 : 0);
                var32.field3019.method7008(Statics.field4604);
                field685.method2395(var32);
            }
        }
        if (arg2 == 2) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var33 = class265.method3935(class263.field2978, field685.field1328);
            var33.field3019.method7008(field663);
            var33.field3019.method6954(class24.field130[82] ? 1 : 0);
            var33.field3019.method7009(Statics.field1843 + arg1);
            var33.field3019.method7008(field753);
            var33.field3019.method7008(Statics.field489 + arg0);
            var33.field3019.method7020(Statics.field4182);
            var33.field3019.method7007(arg3);
            field685.method2395(var33);
        }
        if (arg2 == 11) {
            class92 var34 = field560[arg3];
            if (var34 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var35 = class265.method3935(class263.field2903, field685.field1328);
                var35.field3019.method7007(arg3);
                var35.field3019.method6998(class24.field130[82] ? 1 : 0);
                field685.method2395(var35);
            }
        }
        if (arg2 == 46) {
            class85 var36 = field621[arg3];
            if (var36 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var37 = class265.method3935(class263.field2965, field685.field1328);
                var37.field3019.method6998(class24.field130[82] ? 1 : 0);
                var37.field3019.method7008(arg3);
                field685.method2395(var37);
            }
        }
        if (arg2 == 1002) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            class265 var38 = class265.method3935(class263.field2950, field685.field1328);
            var38.field3019.method7009(arg3);
            field685.method2395(var38);
        }
        if (arg2 == 36) {
            class265 var39 = class265.method3935(class263.field2955, field685.field1328);
            var39.field3019.method7007(arg3);
            var39.field3019.method7018(arg1);
            var39.field3019.method7009(arg0);
            field685.method2395(var39);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 1) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var40 = class265.method3935(class263.field2995, field685.field1328);
            var40.field3019.method7007(Statics.field4604);
            var40.field3019.method7007(Statics.field1291);
            var40.field3019.method6998(class24.field130[82] ? 1 : 0);
            var40.field3019.method6955(Statics.field489 + arg0);
            var40.field3019.method6955(arg3);
            var40.field3019.method7020(Statics.field1715);
            var40.field3019.method7008(Statics.field1843 + arg1);
            field685.method2395(var40);
        }
        if (arg2 == 40) {
            class265 var41 = class265.method3935(class263.field2959, field685.field1328);
            var41.field3019.method7164(arg1);
            var41.field3019.method6955(arg0);
            var41.field3019.method7008(arg3);
            field685.method2395(var41);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 32) {
            class265 var42 = class265.method3935(class263.field2960, field685.field1328);
            var42.field3019.method7008(arg3);
            var42.field3019.method7164(Statics.field4182);
            var42.field3019.method7008(arg0);
            var42.field3019.method6955(field753);
            var42.field3019.method6957(arg1);
            field685.method2395(var42);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 8) {
            class92 var43 = field560[arg3];
            if (var43 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var44 = class265.method3935(class263.field2931, field685.field1328);
                var44.field3019.method7101(class24.field130[82] ? 1 : 0);
                var44.field3019.method6955(field753);
                var44.field3019.method7007(arg3);
                var44.field3019.method7018(Statics.field4182);
                var44.field3019.method7008(field663);
                field685.method2395(var44);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class295 var45 = class295.method3387(arg1, arg0);
            if (var45 != null) {
                method3562(arg3, arg1, arg0, var45.field3335, arg5);
            }
        }
        if (arg2 == 4) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var46 = class265.method3935(class263.field2902, field685.field1328);
            var46.field3019.method7000(class24.field130[82] ? 1 : 0);
            var46.field3019.method6955(Statics.field1843 + arg1);
            var46.field3019.method7009(arg3);
            var46.field3019.method7007(Statics.field489 + arg0);
            field685.method2395(var46);
        }
        if (arg2 == 28) {
            class265 var47 = class265.method3935(class263.field2898, field685.field1328);
            var47.field3019.method6957(arg1);
            field685.method2395(var47);
            class295 var48 = class295.method2688(arg1);
            if (var48 != null && var48.field3332 != null && var48.field3332[0][0] == 5) {
                int var49 = var48.field3332[0][1];
                class289.field3284[var49] = 1 - class289.field3284[var49];
                method3941(var49);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field463.method6581(arg2, arg3, new class290(arg0), new class290(arg1));
        }
        if (arg2 == 1004) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            class265 var50 = class265.method3935(class263.field2989, field685.field1328);
            var50.field3019.method7008(arg3);
            field685.method2395(var50);
        }
        if (arg2 == 22) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var51 = class265.method3935(class263.field2921, field685.field1328);
            var51.field3019.method6998(class24.field130[82] ? 1 : 0);
            var51.field3019.method7009(Statics.field489 + arg0);
            var51.field3019.method7007(Statics.field1843 + arg1);
            var51.field3019.method6955(arg3);
            field685.method2395(var51);
        }
        if (arg2 == 1001) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var52 = class265.method3935(class263.field2994, field685.field1328);
            var52.field3019.method7007(arg3);
            var52.field3019.method7008(Statics.field489 + arg0);
            var52.field3019.method7101(class24.field130[82] ? 1 : 0);
            var52.field3019.method6955(Statics.field1843 + arg1);
            field685.method2395(var52);
        }
        if (arg2 == 33) {
            class265 var53 = class265.method3935(class263.field2986, field685.field1328);
            var53.field3019.method6955(arg3);
            var53.field3019.method6955(arg0);
            var53.field3019.method7018(arg1);
            field685.method2395(var53);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 49) {
            class85 var54 = field621[arg3];
            if (var54 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var55 = class265.method3935(class263.field2932, field685.field1328);
                var55.field3019.method7009(arg3);
                var55.field3019.method6954(class24.field130[82] ? 1 : 0);
                field685.method2395(var55);
            }
        }
        if (arg2 == 44) {
            class85 var56 = field621[arg3];
            if (var56 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var57 = class265.method3935(class263.field2914, field685.field1328);
                var57.field3019.method7007(arg3);
                var57.field3019.method6998(class24.field130[82] ? 1 : 0);
                field685.method2395(var57);
            }
        }
        if (arg2 == 51) {
            class85 var58 = field621[arg3];
            if (var58 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var59 = class265.method3935(class263.field2975, field685.field1328);
                var59.field3019.method7009(arg3);
                var59.field3019.method7101(class24.field130[82] ? 1 : 0);
                field685.method2395(var59);
            }
        }
        if (arg2 == 31) {
            class265 var60 = class265.method3935(class263.field2972, field685.field1328);
            var60.field3019.method7164(Statics.field1715);
            var60.field3019.method7007(Statics.field4604);
            var60.field3019.method7018(arg1);
            var60.field3019.method6955(arg3);
            var60.field3019.method6955(arg0);
            var60.field3019.method7007(Statics.field1291);
            field685.method2395(var60);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 9) {
            class92 var61 = field560[arg3];
            if (var61 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var62 = class265.method3935(class263.field2982, field685.field1328);
                var62.field3019.method7101(class24.field130[82] ? 1 : 0);
                var62.field3019.method7007(arg3);
                field685.method2395(var62);
            }
        }
        if (arg2 == 18) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var63 = class265.method3935(class263.field2934, field685.field1328);
            var63.field3019.method7000(class24.field130[82] ? 1 : 0);
            var63.field3019.method7009(arg3);
            var63.field3019.method6955(Statics.field1843 + arg1);
            var63.field3019.method7007(Statics.field489 + arg0);
            field685.method2395(var63);
        }
        if (arg2 == 50) {
            class85 var64 = field621[arg3];
            if (var64 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var65 = class265.method3935(class263.field2924, field685.field1328);
                var65.field3019.method6955(arg3);
                var65.field3019.method6998(class24.field130[82] ? 1 : 0);
                field685.method2395(var65);
            }
        }
        if (arg2 == 19) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var66 = class265.method3935(class263.field2916, field685.field1328);
            var66.field3019.method6955(Statics.field1843 + arg1);
            var66.field3019.method7101(class24.field130[82] ? 1 : 0);
            var66.field3019.method6955(arg3);
            var66.field3019.method7007(Statics.field489 + arg0);
            field685.method2395(var66);
        }
        if (arg2 == 30 && field684 == null) {
            method4686(arg1, arg0);
            field684 = class295.method3387(arg1, arg0);
            method5855(field684);
        }
        if (arg2 == 58) {
            class295 var67 = class295.method3387(arg1, arg0);
            if (var67 != null) {
                class265 var68 = class265.method3935(class263.field2895, field685.field1328);
                var68.field3019.method6955(field663);
                var68.field3019.method7164(Statics.field4182);
                var68.field3019.method7008(var67.field3335);
                var68.field3019.method7009(field753);
                var68.field3019.method6957(arg1);
                var68.field3019.method7008(arg0);
                field685.method2395(var68);
            }
        }
        if (arg2 == 48) {
            class85 var69 = field621[arg3];
            if (var69 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var70 = class265.method3935(class263.field2973, field685.field1328);
                var70.field3019.method6955(arg3);
                var70.field3019.method6998(class24.field130[82] ? 1 : 0);
                field685.method2395(var70);
            }
        }
        if (arg2 == 41) {
            class265 var71 = class265.method3935(class263.field2922, field685.field1328);
            var71.field3019.method7008(arg3);
            var71.field3019.method7018(arg1);
            var71.field3019.method7009(arg0);
            field685.method2395(var71);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 14) {
            class85 var72 = field621[arg3];
            if (var72 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var73 = class265.method3935(class263.field2957, field685.field1328);
                var73.field3019.method7009(Statics.field1291);
                var73.field3019.method6955(arg3);
                var73.field3019.method6954(class24.field130[82] ? 1 : 0);
                var73.field3019.method7008(Statics.field4604);
                var73.field3019.method7164(Statics.field1715);
                field685.method2395(var73);
            }
        }
        if (arg2 == 35) {
            class265 var74 = class265.method3935(class263.field2998, field685.field1328);
            var74.field3019.method6955(arg3);
            var74.field3019.method6955(arg0);
            var74.field3019.method7018(arg1);
            field685.method2395(var74);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 43) {
            class265 var75 = class265.method3935(class263.field2939, field685.field1328);
            var75.field3019.method7009(arg0);
            var75.field3019.method7009(arg3);
            var75.field3019.method6957(arg1);
            field685.method2395(var75);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 42) {
            class265 var76 = class265.method3935(class263.field2897, field685.field1328);
            var76.field3019.method7009(arg0);
            var76.field3019.method6957(arg1);
            var76.field3019.method7007(arg3);
            field685.method2395(var76);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (arg2 == 13) {
            class92 var77 = field560[arg3];
            if (var77 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var78 = class265.method3935(class263.field2925, field685.field1328);
                var78.field3019.method7007(arg3);
                var78.field3019.method7101(class24.field130[82] ? 1 : 0);
                field685.method2395(var78);
            }
        }
        if (arg2 == 47) {
            class85 var79 = field621[arg3];
            if (var79 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var80 = class265.method3935(class263.field2940, field685.field1328);
                var80.field3019.method7101(class24.field130[82] ? 1 : 0);
                var80.field3019.method6955(arg3);
                field685.method2395(var80);
            }
        }
        if (arg2 == 21) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var81 = class265.method3935(class263.field2943, field685.field1328);
            var81.field3019.method7101(class24.field130[82] ? 1 : 0);
            var81.field3019.method6955(Statics.field489 + arg0);
            var81.field3019.method7009(Statics.field1843 + arg1);
            var81.field3019.method7009(arg3);
            field685.method2395(var81);
        }
        if (arg2 == 15) {
            class85 var82 = field621[arg3];
            if (var82 != null) {
                field606 = arg6;
                field607 = arg7;
                field538 = 2;
                field608 = 0;
                field540 = arg0;
                field764 = arg1;
                class265 var83 = class265.method3935(class263.field3000, field685.field1328);
                var83.field3019.method7007(field753);
                var83.field3019.method7008(arg3);
                var83.field3019.method7101(class24.field130[82] ? 1 : 0);
                var83.field3019.method6957(Statics.field4182);
                var83.field3019.method6955(field663);
                field685.method2395(var83);
            }
        }
        if (arg2 == 29) {
            class265 var84 = class265.method3935(class263.field2898, field685.field1328);
            var84.field3019.method6957(arg1);
            field685.method2395(var84);
            class295 var85 = class295.method2688(arg1);
            if (var85 != null && var85.field3332 != null && var85.field3332[0][0] == 5) {
                int var86 = var85.field3332[0][1];
                if (class289.field3284[var86] != var85.field3466[0]) {
                    class289.field3284[var86] = var85.field3466[0];
                    method3941(var86);
                }
            }
        }
        if (arg2 == 3) {
            field606 = arg6;
            field607 = arg7;
            field538 = 2;
            field608 = 0;
            field540 = arg0;
            field764 = arg1;
            class265 var87 = class265.method3935(class263.field2915, field685.field1328);
            var87.field3019.method7008(Statics.field1843 + arg1);
            var87.field3019.method7007(Statics.field489 + arg0);
            var87.field3019.method6955(arg3);
            var87.field3019.method7101(class24.field130[82] ? 1 : 0);
            field685.method2395(var87);
        }
        if (arg2 == 34) {
            class265 var88 = class265.method3935(class263.field2970, field685.field1328);
            var88.field3019.method7018(arg1);
            var88.field3019.method6955(arg0);
            var88.field3019.method6955(arg3);
            field685.method2395(var88);
            field611 = 0;
            Statics.field4012 = class295.method2688(arg1);
            field612 = arg0;
        }
        if (field659 != 0) {
            field659 = 0;
            method5855(class295.method2688(Statics.field1715));
        }
        if (field655) {
            Statics.method1660();
        }
        if (Statics.field4012 != null && field611 == 0) {
            method5855(Statics.field4012);
        }
    }

    @ObfuscatedName("ji.ib(ILjava/lang/String;B)V")
    public static void method4839(int arg0, String arg1) {
        int var2 = class97.field1276;
        int[] var3 = class97.field1275;
        boolean var4 = false;
        class459 var5 = new class459(arg1, Statics.field1480);
        for (int var6 = 0; var6 < var2; var6++) {
            class85 var7 = field621[var3[var6]];
            if (var7 != null && Statics.field4004 != var7 && var7.field1073 != null && var7.field1073.equals(var5)) {
                if (arg0 == 1) {
                    class265 var8 = class265.method3935(class263.field2914, field685.field1328);
                    var8.field3019.method7007(var3[var6]);
                    var8.field3019.method6998(0);
                    field685.method2395(var8);
                } else if (arg0 == 4) {
                    class265 var9 = class265.method3935(class263.field2940, field685.field1328);
                    var9.field3019.method7101(0);
                    var9.field3019.method6955(var3[var6]);
                    field685.method2395(var9);
                } else if (arg0 == 6) {
                    class265 var10 = class265.method3935(class263.field2932, field685.field1328);
                    var10.field3019.method7009(var3[var6]);
                    var10.field3019.method6954(0);
                    field685.method2395(var10);
                } else if (arg0 == 7) {
                    class265 var11 = class265.method3935(class263.field2924, field685.field1328);
                    var11.field3019.method6955(var3[var6]);
                    var11.field3019.method6998(0);
                    field685.method2395(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method2077(4, "", class309.field3753 + arg1);
        }
    }

    @ObfuscatedName("ix.ir(IIIII)V")
    public static void method4447(int arg0, int arg1, int arg2, int arg3) {
        class295 var4 = class295.method3387(arg0, arg1);
        if (var4 != null && var4.field3438 != null) {
            class81 var5 = new class81();
            var5.field1045 = var4;
            var5.field1035 = var4.field3438;
            class64.method2809(var5);
        }
        field663 = arg3;
        field655 = true;
        Statics.field4182 = arg0;
        field753 = arg1;
        Statics.field89 = arg2;
        method5855(var4);
    }

    @ObfuscatedName("jr.is(III)V")
    public static void method4686(int arg0, int arg1) {
        class265 var2 = class265.method3935(class263.field2953, field685.field1328);
        var2.field3019.method7164(arg0);
        var2.field3019.method7007(arg1);
        field685.method2395(var2);
    }

    @ObfuscatedName("gp.ii(IIIILjava/lang/String;B)V")
    public static void method3562(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class295 var5 = class295.method3387(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3447 != null) {
            class81 var6 = new class81();
            var6.field1045 = var5;
            var6.field1037 = arg0;
            var6.field1034 = arg4;
            var6.field1035 = var5.field3447;
            class64.method2809(var6);
        }
        boolean var7 = true;
        if (var5.field3340 > 0) {
            var7 = Statics.method5514(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = Statics.method5486(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class265 var11 = class265.method3935(class263.field2909, field685.field1328);
            var11.field3019.method6957(arg1);
            var11.field3019.method6955(arg2);
            var11.field3019.method6955(arg3);
            field685.method2395(var11);
        }
        if (arg0 == 2) {
            class265 var12 = class265.method3935(class263.field2946, field685.field1328);
            var12.field3019.method6957(arg1);
            var12.field3019.method6955(arg2);
            var12.field3019.method6955(arg3);
            field685.method2395(var12);
        }
        if (arg0 == 3) {
            class265 var13 = class265.method3935(class263.field2942, field685.field1328);
            var13.field3019.method6957(arg1);
            var13.field3019.method6955(arg2);
            var13.field3019.method6955(arg3);
            field685.method2395(var13);
        }
        if (arg0 == 4) {
            class265 var14 = class265.method3935(class263.field2967, field685.field1328);
            var14.field3019.method6957(arg1);
            var14.field3019.method6955(arg2);
            var14.field3019.method6955(arg3);
            field685.method2395(var14);
        }
        if (arg0 == 5) {
            class265 var15 = class265.method3935(class263.field2907, field685.field1328);
            var15.field3019.method6957(arg1);
            var15.field3019.method6955(arg2);
            var15.field3019.method6955(arg3);
            field685.method2395(var15);
        }
        if (arg0 == 6) {
            class265 var16 = class265.method3935(class263.field2945, field685.field1328);
            var16.field3019.method6957(arg1);
            var16.field3019.method6955(arg2);
            var16.field3019.method6955(arg3);
            field685.method2395(var16);
        }
        if (arg0 == 7) {
            class265 var17 = class265.method3935(class263.field2983, field685.field1328);
            var17.field3019.method6957(arg1);
            var17.field3019.method6955(arg2);
            var17.field3019.method6955(arg3);
            field685.method2395(var17);
        }
        if (arg0 == 8) {
            class265 var18 = class265.method3935(class263.field2961, field685.field1328);
            var18.field3019.method6957(arg1);
            var18.field3019.method6955(arg2);
            var18.field3019.method6955(arg3);
            field685.method2395(var18);
        }
        if (arg0 == 9) {
            class265 var19 = class265.method3935(class263.field2944, field685.field1328);
            var19.field3019.method6957(arg1);
            var19.field3019.method6955(arg2);
            var19.field3019.method6955(arg3);
            field685.method2395(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class265 var20 = class265.method3935(class263.field2918, field685.field1328);
        var20.field3019.method6957(arg1);
        var20.field3019.method6955(arg2);
        var20.field3019.method6955(arg3);
        field685.method2395(var20);
    }

    @ObfuscatedName("lw.ie(I)V")
    public static final void method5401() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field643 - 1; var1++) {
                if (field686[var1] < 1000 && field686[var1 + 1] > 1000) {
                    String var2 = field649[var1];
                    field649[var1] = field649[var1 + 1];
                    field649[var1 + 1] = var2;
                    String var3 = field648[var1];
                    field648[var1] = field648[var1 + 1];
                    field648[var1 + 1] = var3;
                    int var4 = field686[var1];
                    field686[var1] = field686[var1 + 1];
                    field686[var1 + 1] = var4;
                    int var5 = field644[var1];
                    field644[var1] = field644[var1 + 1];
                    field644[var1 + 1] = var5;
                    int var6 = field645[var1];
                    field645[var1] = field645[var1 + 1];
                    field645[var1 + 1] = var6;
                    int var7 = field647[var1];
                    field647[var1] = field647[var1 + 1];
                    field647[var1 + 1] = var7;
                    boolean var8 = field724[var1];
                    field724[var1] = field724[var1 + 1];
                    field724[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("y.if(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method299(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method386(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("aw.ig(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method386(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field642 || field643 >= 500) {
            return;
        }
        field648[field643] = arg0;
        field649[field643] = arg1;
        field686[field643] = arg2;
        field647[field643] = arg3;
        field644[field643] = arg4;
        field645[field643] = arg5;
        field724[field643] = arg6;
        field643++;
    }

    @ObfuscatedName("kl.id(I)I")
    public static final int method5217() {
        return field643 - 1;
    }

    @ObfuscatedName("nz.iz(II)Ljava/lang/String;")
    public static String method6126(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field649[arg0].length() > 0) {
            return field648[arg0] + class309.field3764 + field649[arg0];
        } else {
            return field648[arg0];
        }
    }

    @ObfuscatedName("ne.ih(IIIIB)V")
    public static final void method6102(int arg0, int arg1, int arg2, int arg3) {
        if (field659 == 0 && !field655) {
            method299(class309.field3620, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class242.method3281(); var8++) {
            long var9 = class242.field2808[var8];
            if (var6 != var9) {
                var6 = var9;
                int var13 = class242.method1589(var8);
                long var14 = class242.field2808[var8];
                int var16 = (int) (var14 >>> 7 & 0x7FL);
                int var18 = var16;
                int var19 = class242.method4114(class242.field2808[var8]);
                int var21 = class242.method4452(var8);
                if (var19 == 2 && Statics.field1005.method4412(Statics.field99, var13, var16, var9) >= 0) {
                    class188 var22 = class188.method2828(var21);
                    if (var22.field2062 != null) {
                        var22 = var22.method3333();
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (field659 == 1) {
                        method299(class309.field3754, field634 + " " + class93.field1242 + " " + class93.method2498(65535) + var22.field2025, 1, var21, var13, var16);
                    } else if (!field655) {
                        String[] var23 = var22.field2042;
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
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
                                    method299(var23[var24], class93.method2498(65535) + var22.field2025, var25, var21, var13, var18);
                                }
                            }
                        }
                        method299(class309.field3755, class93.method2498(65535) + var22.field2025, 1002, var22.field2022, var13, var18);
                    } else if ((Statics.field89 & 0x4) == 4) {
                        method299(field775, field653 + " " + class93.field1242 + " " + class93.method2498(65535) + var22.field2025, 2, var21, var13, var16);
                    }
                }
                if (var19 == 1) {
                    class92 var26 = field560[var21];
                    if (var26 == null) {
                        continue;
                    }
                    if (var26.field1235.field1905 == 1 && (var26.field1132 & 0x7F) == 64 && (var26.field1116 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < field546; var27++) {
                            class92 var28 = field560[field570[var27]];
                            if (var28 != null && var26 != var28 && var28.field1235.field1905 == 1 && var26.field1132 == var28.field1132 && var26.field1116 == var28.field1116) {
                                method151(var28, field570[var27], var13, var18);
                            }
                        }
                        int var29 = class97.field1276;
                        int[] var30 = class97.field1275;
                        for (int var31 = 0; var31 < var29; var31++) {
                            class85 var32 = field621[var30[var31]];
                            if (var32 != null && var26.field1132 == var32.field1132 && var26.field1116 == var32.field1116) {
                                Statics.method287(var32, var30[var31], var13, var18);
                            }
                        }
                    }
                    method151(var26, var21, var13, var18);
                }
                if (var19 == 0) {
                    class85 var33 = field621[var21];
                    if (var33 == null) {
                        continue;
                    }
                    if ((var33.field1132 & 0x7F) == 64 && (var33.field1116 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < field546; var34++) {
                            class92 var35 = field560[field570[var34]];
                            if (var35 != null && var35.field1235.field1905 == 1 && var33.field1132 == var35.field1132 && var33.field1116 == var35.field1116) {
                                method151(var35, field570[var34], var13, var18);
                            }
                        }
                        int var36 = class97.field1276;
                        int[] var37 = class97.field1275;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class85 var39 = field621[var37[var38]];
                            if (var39 != null && var33 != var39 && var33.field1132 == var39.field1132 && var33.field1116 == var39.field1116) {
                                Statics.method287(var39, var37[var38], var13, var18);
                            }
                        }
                    }
                    if (field660 == var21) {
                        var4 = var9;
                    } else {
                        Statics.method287(var33, var21, var13, var18);
                    }
                }
                if (var19 == 3) {
                    class335 var40 = field750[Statics.field99][var13][var18];
                    if (var40 != null) {
                        for (class96 var41 = (class96) var40.method5548(); var41 != null; var41 = (class96) var40.method5536()) {
                            class189 var42 = Statics.method268(var41.field1272);
                            if (field659 == 1) {
                                method299(class309.field3754, field634 + " " + class93.field1242 + " " + class93.method2498(16748608) + var42.field2076, 16, var41.field1272, var13, var18);
                            } else if (!field655) {
                                String[] var43 = var42.field2111;
                                for (int var44 = 4; var44 >= 0; var44--) {
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
                                        method299(var43[var44], class93.method2498(16748608) + var42.field2076, var45, var41.field1272, var13, var18);
                                    } else if (var44 == 2) {
                                        method299(class309.field3721, class93.method2498(16748608) + var42.field2076, 20, var41.field1272, var13, var18);
                                    }
                                }
                                method299(class309.field3755, class93.method2498(16748608) + var42.field2076, 1004, var41.field1272, var13, var18);
                            } else if ((Statics.field89 & 0x1) == 1) {
                                method299(field775, field653 + " " + class93.field1242 + " " + class93.method2498(16748608) + var42.field2076, 17, var41.field1272, var13, var18);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var46 = (int) (var4 >>> 0 & 0x7FL);
            int var48 = (int) (var4 >>> 7 & 0x7FL);
            class85 var50 = field621[field660];
            Statics.method287(var50, field660, var46, var48);
        }
    }

    @ObfuscatedName("w.jc(Lcy;IIII)V")
    public static final void method151(class92 arg0, int arg1, int arg2, int arg3) {
        class179 var4 = arg0.field1235;
        if (field643 >= 400) {
            return;
        }
        if (var4.field1921 != null) {
            var4 = var4.method3169();
        }
        if (var4 == null || !var4.field1908 || var4.field1928 && field677 != arg1) {
            return;
        }
        String var5 = var4.field1893;
        if (var4.field1915 != 0 && arg0.field1183 != 0) {
            int var6 = arg0.field1183 == -1 ? var4.field1915 : arg0.field1183;
            int var8 = Statics.field4004.field1076;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class93.method2498(16711680);
            } else if (var9 < -6) {
                var10 = class93.method2498(16723968);
            } else if (var9 < -3) {
                var10 = class93.method2498(16740352);
            } else if (var9 < 0) {
                var10 = class93.method2498(16756736);
            } else if (var9 > 9) {
                var10 = class93.method2498(65280);
            } else if (var9 > 6) {
                var10 = class93.method2498(4259584);
            } else if (var9 > 3) {
                var10 = class93.method2498(8453888);
            } else if (var9 > 0) {
                var10 = class93.method2498(12648192);
            } else {
                var10 = class93.method2498(16776960);
            }
            var5 = var5 + var10 + " " + class93.field1243 + class309.field3649 + var6 + class93.field1241;
        }
        if (var4.field1928 && field651) {
            method299(class309.field3755, class93.method2498(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field659 == 1) {
            method299(class309.field3754, field634 + " " + class93.field1242 + " " + class93.method2498(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field655) {
            int var11 = var4.field1928 && field651 ? 2000 : 0;
            String[] var12 = var4.field1913;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var12[var13] != null && !var12[var13].equalsIgnoreCase(class309.field3756)) {
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
                        method299(var12[var13], class93.method2498(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (var12[var15] != null && var12[var15].equalsIgnoreCase(class309.field3756)) {
                        short var16 = 0;
                        if (field650 != class95.field1260) {
                            if (field650 == class95.field1257 || field650 == class95.field1266 && var4.field1915 > Statics.field4004.field1076) {
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
                            method299(var12[var15], class93.method2498(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1928 || !field651) {
                method299(class309.field3755, class93.method2498(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field89 & 0x2) == 2) {
            method299(field775, field653 + " " + class93.field1242 + " " + class93.method2498(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("es.jl(IIIIIIIII)V")
    public static final void method2704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class295.method2938(arg0)) {
            Statics.field3586 = null;
            method4688(Statics.field3326[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3586 != null) {
                method4688(Statics.field3586, -1412584499, arg1, arg2, arg3, arg4, Statics.field1253, Statics.field1014, arg7);
                Statics.field3586 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field716[var8] = true;
            }
        } else {
            field716[arg7] = true;
        }
    }

    @ObfuscatedName("jr.jp([Lky;IIIIIIIIB)V")
    public static final void method4688(class295[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class447.method7250(arg2, arg3, arg4, arg5);
        class231.method4165();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class295 var10 = arg0[var9];
            if (var10 != null && (var10.field3426 == arg1 || arg1 == -1412584499 && field721 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field646[field714] = var10.field3365 + arg6;
                    field720[field714] = var10.field3322 + arg7;
                    field673[field714] = var10.field3351;
                    field617[field714] = var10.field3352;
                    var11 = ++field714 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3483 = var11;
                var10.field3484 = field507;
                if (!var10.field3451 || !method11(var10)) {
                    if (var10.field3340 > 0) {
                        method4234(var10);
                    }
                    int var12 = var10.field3365 + arg6;
                    int var13 = var10.field3322 + arg7;
                    int var14 = var10.field3457;
                    if (field721 == var10) {
                        if (arg1 != -1412584499 && !var10.field3425) {
                            Statics.field3586 = arg0;
                            Statics.field1253 = arg6;
                            Statics.field1014 = arg7;
                            continue;
                        }
                        if (field492 && field697) {
                            int var15 = class33.field229;
                            int var16 = class33.field230;
                            int var17 = var15 - field682;
                            int var18 = var16 - field664;
                            if (var17 < field774) {
                                var17 = field774;
                            }
                            if (var10.field3351 + var17 > field774 + field681.field3351) {
                                var17 = field774 + field681.field3351 - var10.field3351;
                            }
                            if (var18 < field687) {
                                var18 = field687;
                            }
                            if (var10.field3352 + var18 > field687 + field681.field3352) {
                                var18 = field687 + field681.field3352 - var10.field3352;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3425) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3338 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3338 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3351 + var12;
                        int var26 = var10.field3352 + var13;
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
                        int var29 = var10.field3351 + var12;
                        int var30 = var10.field3352 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3451 || var19 < var21 && var20 < var22) {
                        if (var10.field3340 != 0) {
                            if (var10.field3340 == 1336) {
                                if (Statics.field1541.method2132()) {
                                    var13 += 15;
                                    Statics.field68.method5749("Fps:" + field193, var10.field3351 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field503) {
                                        var33 = 16711680;
                                    }
                                    Statics.field68.method5749("Mem:" + var32 + "k", var10.field3351 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3340 == 1337) {
                                field672 = var12;
                                field656 = var13;
                                method3487(var12, var13, var10.field3351, var10.field3352);
                                field716[var10.field3483] = true;
                                class447.method7250(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3340 == 1338) {
                                method5243(var10, var12, var13, var11);
                                class447.method7250(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3340 == 1339) {
                                method2373(var10, var12, var13, var11);
                                class447.method7250(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3340 == 1400) {
                                Statics.field463.method6561(var12, var13, var10.field3351, var10.field3352, field507);
                            }
                            if (var10.field3340 == 1401) {
                                Statics.field463.method6705(var12, var13, var10.field3351, var10.field3352);
                            }
                            if (var10.field3340 == 1402) {
                                Statics.field4102.method2105(var12, field507);
                            }
                        }
                        if (var10.field3338 == 0) {
                            if (!var10.field3451 && method11(var10) && Statics.field156 != var10) {
                                continue;
                            }
                            if (!var10.field3451) {
                                if (var10.field3358 > var10.field3360 - var10.field3352) {
                                    var10.field3358 = var10.field3360 - var10.field3352;
                                }
                                if (var10.field3358 < 0) {
                                    var10.field3358 = 0;
                                }
                            }
                            method4688(arg0, var10.field3449, var19, var20, var21, var22, var12 - var10.field3357, var13 - var10.field3358, var11);
                            if (var10.field3454 != null) {
                                method4688(var10.field3454, var10.field3449, var19, var20, var21, var22, var12 - var10.field3357, var13 - var10.field3358, var11);
                            }
                            class80 var34 = (class80) field534.method6772((long) var10.field3449);
                            if (var34 != null) {
                                method2704(var34.field1030, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class447.method7250(arg2, arg3, arg4, arg5);
                            class231.method4165();
                        } else if (var10.field3338 == 11) {
                            if (method11(var10) && Statics.field156 != var10) {
                                continue;
                            }
                            if (var10.field3454 != null) {
                                method4688(var10.field3454, var10.field3449, var19, var20, var21, var22, var12 - var10.field3357, var13 - var10.field3358, var11);
                            }
                            class447.method7250(arg2, arg3, arg4, arg5);
                            class231.method4165();
                        }
                        if (field725 || field718[var11] || field583 > 1) {
                            if (var10.field3338 == 0 && !var10.field3451 && var10.field3360 > var10.field3352) {
                                method734(var10.field3351 + var12, var13, var10.field3358, var10.field3352, var10.field3360);
                            }
                            if (var10.field3338 != 1) {
                                if (var10.field3338 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3348; var36++) {
                                        for (int var37 = 0; var37 < var10.field3347; var37++) {
                                            int var38 = (var10.field3404 + 32) * var37 + var12;
                                            int var39 = (var10.field3405 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3368[var35];
                                                var39 += var10.field3407[var35];
                                            }
                                            if (var10.field3470[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3470[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field1623 == var10 && field613 == var35) {
                                                    class451 var43;
                                                    if (field659 == 1 && Statics.field4604 == var35 && Statics.field1715 == var10.field3449) {
                                                        var43 = class189.method2718(var42, var10.field3471[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class189.method2718(var42, var10.field3471[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method5855(var10);
                                                    } else if (Statics.field1623 == var10 && field613 == var35) {
                                                        int var44 = class33.field229 - field614;
                                                        int var45 = class33.field230 - field782;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field781 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method7366(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class295 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class447.field4688 && var46.field3358 > 0) {
                                                                int var47 = field557 * (class447.field4688 - var39 - var45) / 3;
                                                                if (var47 > field557 * 10) {
                                                                    var47 = field557 * 10;
                                                                }
                                                                if (var47 > var46.field3358) {
                                                                    var47 = var46.field3358;
                                                                }
                                                                var46.field3358 -= var47;
                                                                field782 += var47;
                                                                method5855(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class447.field4685 && var46.field3358 < var46.field3360 - var46.field3352) {
                                                                int var48 = field557 * (var39 + var45 + 32 - class447.field4685) / 3;
                                                                if (var48 > field557 * 10) {
                                                                    var48 = field557 * 10;
                                                                }
                                                                if (var48 > var46.field3360 - var46.field3352 - var46.field3358) {
                                                                    var48 = var46.field3360 - var46.field3352 - var46.field3358;
                                                                }
                                                                var46.field3358 += var48;
                                                                field782 -= var48;
                                                                method5855(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field4012 == var10 && field612 == var35) {
                                                        var43.method7366(var38, var39, 128);
                                                    } else {
                                                        var43.method7474(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3408 != null && var35 < 20) {
                                                class451 var49 = var10.method5063(var35);
                                                if (var49 != null) {
                                                    var49.method7474(var38, var39);
                                                } else if (class295.field3412) {
                                                    method5855(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3338 == 3) {
                                    int var50;
                                    if (method5205(var10)) {
                                        var50 = var10.field3395;
                                        if (Statics.field156 == var10 && var10.field3364 != 0) {
                                            var50 = var10.field3364;
                                        }
                                    } else {
                                        var50 = var10.field3361;
                                        if (Statics.field156 == var10 && var10.field3363 != 0) {
                                            var50 = var10.field3363;
                                        }
                                    }
                                    if (var10.field3440) {
                                        switch(var10.field3378.field4700) {
                                            case 1:
                                                class447.method7259(var12, var13, var10.field3351, var10.field3352, var10.field3361, var10.field3395);
                                                break;
                                            case 2:
                                                class447.method7260(var12, var13, var10.field3351, var10.field3352, var10.field3361, var10.field3395, 255 - (var10.field3457 & 0xFF), 255 - (var10.field3435 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class447.method7249(var12, var13, var10.field3351, var10.field3352, var50);
                                                } else {
                                                    class447.method7257(var12, var13, var10.field3351, var10.field3352, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class447.method7262(var12, var13, var10.field3351, var10.field3352, var50);
                                    } else {
                                        class447.method7280(var12, var13, var10.field3351, var10.field3352, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3338 == 4) {
                                    class344 var51 = var10.method5134();
                                    if (var51 != null) {
                                        String var52 = var10.field3422;
                                        int var53;
                                        if (method5205(var10)) {
                                            var53 = var10.field3395;
                                            if (Statics.field156 == var10 && var10.field3364 != 0) {
                                                var53 = var10.field3364;
                                            }
                                            if (var10.field3392.length() > 0) {
                                                var52 = var10.field3392;
                                            }
                                        } else {
                                            var53 = var10.field3361;
                                            if (Statics.field156 == var10 && var10.field3363 != 0) {
                                                var53 = var10.field3363;
                                            }
                                        }
                                        if (var10.field3451 && var10.field3335 != -1) {
                                            class189 var54 = Statics.method268(var10.field3335);
                                            var52 = var54.field2076;
                                            if (var52 == null) {
                                                var52 = class309.field3599;
                                            }
                                            if ((var54.field2087 == 1 || var10.field3473 != 1) && var10.field3473 != -1) {
                                                var52 = class93.method2498(16748608) + var52 + class93.field1244 + " " + 'x' + method3258(var10.field3473);
                                            }
                                        }
                                        if (field684 == var10) {
                                            var52 = class309.field3902;
                                            var53 = var10.field3361;
                                        }
                                        if (!var10.field3451) {
                                            var52 = method6895(var52, var10);
                                        }
                                        var51.method5751(var52, var12, var13, var10.field3351, var10.field3352, var53, var10.field3403 ? 0 : -1, var10.field3401, var10.field3472, var10.field3400);
                                    } else if (class295.field3412) {
                                        method5855(var10);
                                    }
                                } else if (var10.field3338 == 5) {
                                    if (var10.field3451) {
                                        class451 var56;
                                        if (var10.field3335 == -1) {
                                            var56 = var10.method5057(false, Statics.field1932);
                                        } else {
                                            var56 = class189.method2718(var10.field3335, var10.field3473, var10.field3376, var10.field3377, var10.field3402, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4714;
                                            int var58 = var56.field4715;
                                            if (var10.field3375) {
                                                class447.method7251(var12, var13, var10.field3351 + var12, var10.field3352 + var13);
                                                int var59 = (var10.field3351 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3352 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3374 != 0) {
                                                            var56.method7388(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3374, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method7474(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method7366(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class447.method7250(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3351 * 4096 / var57;
                                                if (var10.field3374 != 0) {
                                                    var56.method7388(var10.field3351 / 2 + var12, var10.field3352 / 2 + var13, var10.field3374, var63);
                                                } else if (var14 != 0) {
                                                    var56.method7381(var12, var13, var10.field3351, var10.field3352, 256 - (var14 & 0xFF));
                                                } else if (var10.field3351 == var57 && var10.field3352 == var58) {
                                                    var56.method7474(var12, var13);
                                                } else {
                                                    var56.method7403(var12, var13, var10.field3351, var10.field3352);
                                                }
                                            }
                                        } else if (class295.field3412) {
                                            method5855(var10);
                                        }
                                    } else {
                                        class451 var55 = var10.method5057(method5205(var10), Statics.field1932);
                                        if (var55 != null) {
                                            var55.method7474(var12, var13);
                                        } else if (class295.field3412) {
                                            method5855(var10);
                                        }
                                    }
                                } else if (var10.field3338 == 6) {
                                    boolean var64 = method5205(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3385;
                                    } else {
                                        var65 = var10.field3394;
                                    }
                                    class241 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3335 != -1) {
                                        class189 var68 = Statics.method268(var10.field3335);
                                        if (var68 != null) {
                                            class189 var69 = var68.method3377(var10.field3473);
                                            var66 = var69.method3397(1);
                                            if (var66 == null) {
                                                method5855(var10);
                                            } else {
                                                var66.method4539();
                                                var67 = var66.field2659 / 2;
                                            }
                                        }
                                    } else if (var10.field3397 == 5) {
                                        if (var10.field3381 == 0) {
                                            var66 = field739.method5026((class191) null, -1, (class191) null, -1);
                                        } else {
                                            var66 = Statics.field4004.method1809();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method5089((class191) null, -1, var64, Statics.field4004.field1089);
                                        if (var66 == null && class295.field3412) {
                                            method5855(var10);
                                        }
                                    } else {
                                        class191 var70 = class191.method3011(var65);
                                        var66 = var10.method5089(var70, var10.field3474, var64, Statics.field4004.field1089);
                                        if (var66 == null && class295.field3412) {
                                            method5855(var10);
                                        }
                                    }
                                    class231.method4153(var10.field3351 / 2 + var12, var10.field3352 / 2 + var13);
                                    int var71 = var10.field3391 * class231.field2576[var10.field3388] >> 16;
                                    int var72 = var10.field3391 * class231.field2551[var10.field3388] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3451) {
                                            var66.method4539();
                                            if (var10.field3386) {
                                                var66.method4563(0, var10.field3384, var10.field3327, var10.field3388, var10.field3437, var10.field3482 + var67 + var71, var10.field3482 + var72, var10.field3391);
                                            } else {
                                                var66.method4518(0, var10.field3384, var10.field3327, var10.field3388, var10.field3437, var10.field3482 + var67 + var71, var10.field3482 + var72);
                                            }
                                        } else {
                                            var66.method4518(0, var10.field3384, 0, var10.field3388, 0, var71, var72);
                                        }
                                    }
                                    class231.method4128();
                                } else {
                                    if (var10.field3338 == 7) {
                                        class344 var73 = var10.method5134();
                                        if (var73 == null) {
                                            if (class295.field3412) {
                                                method5855(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field3348; var75++) {
                                            for (int var76 = 0; var76 < var10.field3347; var76++) {
                                                if (var10.field3470[var74] > 0) {
                                                    class189 var77 = Statics.method268(var10.field3470[var74] - 1);
                                                    String var78;
                                                    if (var77.field2087 != 1 && var10.field3471[var74] == 1) {
                                                        var78 = class93.method2498(16748608) + var77.field2076 + class93.field1244;
                                                    } else {
                                                        var78 = class93.method2498(16748608) + var77.field2076 + class93.field1244 + " " + 'x' + method3258(var10.field3471[var74]);
                                                    }
                                                    int var79 = (var10.field3404 + 115) * var76 + var12;
                                                    int var80 = (var10.field3405 + 12) * var75 + var13;
                                                    if (var10.field3401 == 0) {
                                                        var73.method5782(var78, var79, var80, var10.field3361, var10.field3403 ? 0 : -1);
                                                    } else if (var10.field3401 == 1) {
                                                        var73.method5750(var78, var10.field3351 / 2 + var79, var80, var10.field3361, var10.field3403 ? 0 : -1);
                                                    } else {
                                                        var73.method5749(var78, var10.field3351 + var79 - 1, var80, var10.field3361, var10.field3403 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field3338 == 8 && Statics.field487 == var10 && field658 == field657) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class344 var83 = Statics.field68;
                                        String var84 = var10.field3422;
                                        String var85 = method6895(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class93.field1238);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5741(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field4117 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3351 + var12 - 5 - var81;
                                        int var90 = var10.field3352 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class447.method7249(var89, var90, var81, var82, 16777120);
                                        class447.method7262(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3422;
                                        int var92 = var83.field4117 + var90 + 2;
                                        String var93 = method6895(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class93.field1238);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5782(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field4117 + 1;
                                        }
                                    }
                                    if (var10.field3338 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field3370) {
                                            var96 = var12;
                                            var97 = var10.field3352 + var13;
                                            var98 = var10.field3351 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3351 + var12;
                                            var99 = var10.field3352 + var13;
                                        }
                                        if (var10.field3436 == 1) {
                                            class447.method7268(var96, var97, var98, var99, var10.field3361);
                                        } else {
                                            method69(var96, var97, var98, var99, var10.field3361, var10.field3436);
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

    @ObfuscatedName("o.jd(IIIIIIB)V")
    public static final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class447.field4690;
        int var18 = arg1 - class447.field4688;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class231.method4195(var19, var20, var21);
        class231.method4139(var23, var24, var25, var19, var20, var21, arg4);
        class231.method4195(var19, var21, var22);
        class231.method4139(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("pk.jq(Ljava/lang/String;Lky;I)Ljava/lang/String;")
    public static String method6895(String arg0, class295 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method6246(arg1, var2 - 1);
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

    @ObfuscatedName("gn.jv(IB)Ljava/lang/String;")
    public static final String method3258(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class93.field1237 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class93.method2498(65408) + var1.substring(0, var1.length() - 8) + class309.field3765 + " " + class93.field1243 + var1 + class93.field1241 + class93.field1244;
        } else if (var1.length() > 6) {
            return " " + class93.method2498(16777215) + var1.substring(0, var1.length() - 4) + class309.field3868 + " " + class93.field1243 + var1 + class93.field1241 + class93.field1244;
        } else {
            return " " + class93.method2498(16776960) + var1 + class93.field1244;
        }
    }

    @ObfuscatedName("client.jo(ZI)V")
    public final void method1093(boolean arg0) {
        int var2 = field523;
        int var3 = Statics.field1798;
        int var4 = Statics.field4019;
        if (class295.method2938(var2)) {
            method4605(Statics.field3326[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.jr(Lky;I)V")
    public void method1386(class295 arg0) {
        class295 var2 = arg0.field3426 == -1 ? null : class295.method2688(arg0.field3426);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1798;
            var4 = Statics.field4019;
        } else {
            var3 = var2.field3351;
            var4 = var2.field3352;
        }
        Statics.method1056(arg0, var3, var4, false);
        method2086(arg0, var3, var4);
    }

    @ObfuscatedName("je.jz([Lky;Lky;ZI)V")
    public static void method4963(class295[] arg0, class295 arg1, boolean arg2) {
        int var3 = arg1.field3367 == 0 ? arg1.field3351 : arg1.field3367;
        int var4 = arg1.field3360 == 0 ? arg1.field3352 : arg1.field3360;
        method4605(arg0, arg1.field3449, var3, var4, arg2);
        if (arg1.field3454 != null) {
            method4605(arg1.field3454, arg1.field3449, var3, var4, arg2);
        }
        class80 var5 = (class80) field534.method6772((long) arg1.field3449);
        if (var5 != null) {
            int var6 = var5.field1030;
            if (class295.method2938(var6)) {
                method4605(Statics.field3326[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3340 == 1337) {
        }
    }

    @ObfuscatedName("ic.jf([Lky;IIIZI)V")
    public static void method4605(class295[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class295 var6 = arg0[var5];
            if (var6 != null && var6.field3426 == arg1) {
                Statics.method1056(var6, arg2, arg3, arg4);
                method2086(var6, arg2, arg3);
                if (var6.field3357 > var6.field3367 - var6.field3351) {
                    var6.field3357 = var6.field3367 - var6.field3351;
                }
                if (var6.field3357 < 0) {
                    var6.field3357 = 0;
                }
                if (var6.field3358 > var6.field3360 - var6.field3352) {
                    var6.field3358 = var6.field3360 - var6.field3352;
                }
                if (var6.field3358 < 0) {
                    var6.field3358 = 0;
                }
                if (var6.field3338 == 0) {
                    method4963(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cp.jy(Lky;III)V")
    public static void method2086(class295 arg0, int arg1, int arg2) {
        if (arg0.field3414 == 0) {
            arg0.field3365 = arg0.field3345;
        } else if (arg0.field3414 == 1) {
            arg0.field3365 = (arg1 - arg0.field3351) / 2 + arg0.field3345;
        } else if (arg0.field3414 == 2) {
            arg0.field3365 = arg1 - arg0.field3351 - arg0.field3345;
        } else if (arg0.field3414 == 3) {
            arg0.field3365 = arg0.field3345 * arg1 >> 14;
        } else if (arg0.field3414 == 4) {
            arg0.field3365 = (arg0.field3345 * arg1 >> 14) + (arg1 - arg0.field3351) / 2;
        } else {
            arg0.field3365 = arg1 - arg0.field3351 - (arg0.field3345 * arg1 >> 14);
        }
        if (arg0.field3342 == 0) {
            arg0.field3322 = arg0.field3346;
        } else if (arg0.field3342 == 1) {
            arg0.field3322 = (arg2 - arg0.field3352) / 2 + arg0.field3346;
        } else if (arg0.field3342 == 2) {
            arg0.field3322 = arg2 - arg0.field3352 - arg0.field3346;
        } else if (arg0.field3342 == 3) {
            arg0.field3322 = arg0.field3346 * arg2 >> 14;
        } else if (arg0.field3342 == 4) {
            arg0.field3322 = (arg0.field3346 * arg2 >> 14) + (arg2 - arg0.field3352) / 2;
        } else {
            arg0.field3322 = arg2 - arg0.field3352 - (arg0.field3346 * arg2 >> 14);
        }
    }

    @ObfuscatedName("dy.jj(Lky;IIIIIIB)V")
    public static final void method2693(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field571) {
            field572 = 32;
        } else {
            field572 = 0;
        }
        field571 = false;
        if (class33.field228 == 1 || !Statics.field3560 && class33.field228 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3358 -= 4;
                method5855(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3358 += 4;
                method5855(arg0);
            } else if (arg5 >= arg1 - field572 && arg5 < field572 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3358 = (arg4 - arg3) * var8 / var9;
                method5855(arg0);
                field571 = true;
            }
        }
        if (field544 == 0) {
            return;
        }
        int var10 = arg0.field3351;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3358 += field544 * 45;
            method5855(arg0);
        }
    }

    @ObfuscatedName("ah.ji(IIIIII)V")
    public static final void method734(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field178[0].method7333(arg0, arg1);
        Statics.field178[1].method7333(arg0, arg1 + arg3 - 16);
        class447.method7249(arg0, arg1 + 16, 16, arg3 - 32, field567);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class447.method7249(arg0, arg1 + 16 + var6, 16, var5, field671);
        class447.method7274(arg0, arg1 + 16 + var6, var5, field741);
        class447.method7274(arg0 + 1, arg1 + 16 + var6, var5, field741);
        class447.method7264(arg0, arg1 + 16 + var6, 16, field741);
        class447.method7264(arg0, arg1 + 17 + var6, 16, field741);
        class447.method7274(arg0 + 15, arg1 + 16 + var6, var5, field695);
        class447.method7274(arg0 + 14, arg1 + 17 + var6, var5 - 1, field695);
        class447.method7264(arg0, arg1 + 15 + var6 + var5, 16, field695);
        class447.method7264(arg0 + 1, arg1 + 14 + var6 + var5, 15, field695);
    }

    @ObfuscatedName("kq.jk(Lky;I)Z")
    public static final boolean method5205(class295 arg0) {
        if (arg0.field3465 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3465.length; var1++) {
            int var2 = method6246(arg0, var1);
            int var3 = arg0.field3466[var1];
            if (arg0.field3465[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3465[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3465[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("nx.jb(Lky;II)I")
    public static final int method6246(class295 arg0, int arg1) {
        if (arg0.field3332 == null || arg1 >= arg0.field3332.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3332[arg1];
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
                    var7 = field639[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field777[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class295 var11 = class295.method2688(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!Statics.method268(var12).field2080 || field495)) {
                        for (int var13 = 0; var13 < var11.field3470.length; var13++) {
                            if (var12 + 1 == var11.field3470[var13]) {
                                var7 += var11.field3471[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class289.field3284[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class299.field3526[field639[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class289.field3284[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field4004.field1076;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class299.field3525[var14]) {
                            var7 += field639[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class295 var17 = class295.method2688(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!Statics.method268(var18).field2080 || field495)) {
                        for (int var19 = 0; var19 < var17.field3470.length; var19++) {
                            if (var18 + 1 == var17.field3470[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field566;
                }
                if (var6 == 12) {
                    var7 = field640;
                }
                if (var6 == 13) {
                    int var20 = class289.field3284[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class289.method1960(var22);
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
                    var7 = (Statics.field4004.field1132 >> 7) + Statics.field489;
                }
                if (var6 == 19) {
                    var7 = (Statics.field4004.field1116 >> 7) + Statics.field1843;
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

    @ObfuscatedName("eo.ju(Lky;IIS)V")
    public static final void method2726(class295 arg0, int arg1, int arg2) {
        if (arg0.field3396 == 1) {
            method299(arg0.field3341, "", 24, 0, 0, arg0.field3449);
        }
        if (arg0.field3396 == 2 && !field655) {
            String var3 = Statics.method2863(arg0);
            if (var3 != null) {
                method299(var3, class93.method2498(65280) + arg0.field3323, 25, 0, -1, arg0.field3449);
            }
        }
        if (arg0.field3396 == 3) {
            method299(class309.field3657, "", 26, 0, 0, arg0.field3449);
        }
        if (arg0.field3396 == 4) {
            method299(arg0.field3341, "", 28, 0, 0, arg0.field3449);
        }
        if (arg0.field3396 == 5) {
            method299(arg0.field3341, "", 29, 0, 0, arg0.field3449);
        }
        if (arg0.field3396 == 6 && field684 == null) {
            method299(arg0.field3341, "", 30, 0, -1, arg0.field3449);
        }
        if (arg0.field3338 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3352; var5++) {
                for (int var6 = 0; var6 < arg0.field3351; var6++) {
                    int var7 = (arg0.field3404 + 32) * var6;
                    int var8 = (arg0.field3405 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3368[var4];
                        var8 += arg0.field3407[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field616 = var4;
                        Statics.field4026 = arg0;
                        if (arg0.field3470[var4] > 0) {
                            class189 var9 = Statics.method268(arg0.field3470[var4] - 1);
                            if (field659 == 1 && class296.method2858(Statics.method5486(arg0))) {
                                if (Statics.field1715 != arg0.field3449 || Statics.field4604 != var4) {
                                    method299(class309.field3754, field634 + " " + class93.field1242 + " " + class93.method2498(16748608) + var9.field2076, 31, var9.field2103, var4, arg0.field3449);
                                }
                            } else if (!field655 || !class296.method2858(Statics.method5486(arg0))) {
                                String[] var10 = var9.field2091;
                                int var11 = -1;
                                if (field638 && method3020()) {
                                    var11 = var9.method3384();
                                }
                                if (class296.method2858(Statics.method5486(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            Statics.method1822(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                if (class296.method2507(Statics.method5486(arg0))) {
                                    method299(class309.field3754, class93.method2498(16748608) + var9.field2076, 38, var9.field2103, var4, arg0.field3449);
                                }
                                if (class296.method2858(Statics.method5486(arg0))) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var11 != var13) {
                                            Statics.method1822(arg0, var9, var4, var13, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        Statics.method1822(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var14 = arg0.field3409;
                                if (var14 != null) {
                                    for (int var15 = 4; var15 >= 0; var15--) {
                                        if (var14[var15] != null) {
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 39;
                                            }
                                            if (var15 == 1) {
                                                var16 = 40;
                                            }
                                            if (var15 == 2) {
                                                var16 = 41;
                                            }
                                            if (var15 == 3) {
                                                var16 = 42;
                                            }
                                            if (var15 == 4) {
                                                var16 = 43;
                                            }
                                            method299(var14[var15], class93.method2498(16748608) + var9.field2076, var16, var9.field2103, var4, arg0.field3449);
                                        }
                                    }
                                }
                                method299(class309.field3755, class93.method2498(16748608) + var9.field2076, 1005, var9.field2103, var4, arg0.field3449);
                            } else if ((Statics.field89 & 0x10) == 16) {
                                method299(field775, field653 + " " + class93.field1242 + " " + class93.method2498(16748608) + var9.field2076, 32, var9.field2103, var4, arg0.field3449);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3451) {
            return;
        }
        if (!field655) {
            for (int var17 = 9; var17 >= 5; var17--) {
                String var18 = method5989(arg0, var17);
                if (var18 != null) {
                    method299(var18, arg0.field3420, 1007, var17 + 1, arg0.field3461, arg0.field3449);
                }
            }
            String var19 = Statics.method2863(arg0);
            if (var19 != null) {
                method299(var19, arg0.field3420, 25, 0, arg0.field3461, arg0.field3449);
            }
            for (int var20 = 4; var20 >= 0; var20--) {
                String var21 = method5989(arg0, var20);
                if (var21 != null) {
                    method386(var21, arg0.field3420, 57, var20 + 1, arg0.field3461, arg0.field3449, arg0.field3477);
                }
            }
            int var22 = Statics.method5486(arg0);
            boolean var23 = (var22 & 0x1) != 0;
            if (var23) {
                method299(class309.field3597, "", 30, 0, arg0.field3461, arg0.field3449);
            }
        } else if (class296.method2381(Statics.method5486(arg0)) && (Statics.field89 & 0x20) == 32) {
            method299(field775, field653 + " " + class93.field1242 + " " + arg0.field3420, 58, 0, arg0.field3461, arg0.field3449);
        }
    }

    @ObfuscatedName("by.jn(ZI)V")
    public static void method1884(boolean arg0) {
        field558 = arg0;
    }

    @ObfuscatedName("nn.jh(I)Z")
    public static boolean method6112() {
        return field558;
    }

    @ObfuscatedName("fj.jx(B)Z")
    public static boolean method3020() {
        return field558 || class24.field130[81];
    }

    @ObfuscatedName("lo.jg(IIIIIIII)V")
    public static final void method5507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class295.method2938(arg0)) {
            method3047(Statics.field3326[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("fb.je([Lky;IIIIIIII)V")
    public static final void method3047(class295[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class295 var9 = arg0[var8];
            if (var9 != null && var9.field3426 == arg1 && (var9.method5067() || Statics.method5486(var9) != 0 || field681 == var9)) {
                if (var9.field3451) {
                    if (method11(var9)) {
                        continue;
                    }
                } else if (var9.field3338 == 0 && Statics.field156 != var9 && method11(var9)) {
                    continue;
                }
                if (var9.field3338 == 11 && var9.method5079(Statics.field1932)) {
                    method5855(var9);
                    method4963(var9.field3454, var9, true);
                    if (var9.field3463 != null) {
                        class81 var10 = new class81();
                        var10.field1045 = var9;
                        var10.field1035 = var9.field3463;
                        field710.method5530(var10);
                    }
                }
                int var11 = var9.field3365 + arg6;
                int var12 = var9.field3322 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field3338 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field3338 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field3351 + var11;
                    int var20 = var9.field3352 + var12;
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
                    int var23 = var9.field3351 + var11;
                    int var24 = var9.field3352 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field721 == var9) {
                    field688 = true;
                    field689 = var11;
                    field758 = var12;
                }
                boolean var25 = false;
                if (var9.field3415) {
                    switch(field669) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3449 >>> 16 == field629) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field629 == var9.field3449) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3451 || var13 < var15 && var14 < var16) {
                    if (var9.field3451) {
                        if (var9.field3406) {
                            if (class33.field229 >= var13 && class33.field230 >= var14 && class33.field229 < var15 && class33.field230 < var16) {
                                for (class81 var26 = (class81) field710.method5540(); var26 != null; var26 = (class81) field710.method5534()) {
                                    if (var26.field1033) {
                                        var26.method6503();
                                        var26.field1045.field3399 = false;
                                    }
                                }
                                if (Statics.field1500 == 0) {
                                    field721 = null;
                                    field681 = null;
                                }
                                if (!field642) {
                                    method5961();
                                }
                            }
                        } else if (var9.field3350 && class33.field229 >= var13 && class33.field230 >= var14 && class33.field229 < var15 && class33.field230 < var16) {
                            for (class81 var27 = (class81) field710.method5540(); var27 != null; var27 = (class81) field710.method5534()) {
                                if (var27.field1033 && var27.field1045.field3362 == var27.field1035) {
                                    var27.method6503();
                                }
                            }
                        }
                    }
                    int var28 = class33.field229;
                    int var29 = class33.field230;
                    if (class33.field220 != 0) {
                        var28 = class33.field237;
                        var29 = class33.field234;
                    }
                    boolean var30 = var28 >= var13 && var29 >= var14 && var28 < var15 && var29 < var16;
                    if (var9.field3340 == 1337) {
                        if (!field506 && !field642 && var30) {
                            method6102(var28, var29, var13, var14);
                        }
                    } else if (var9.field3340 == 1338) {
                        method167(var9, var11, var12);
                    } else {
                        if (var9.field3340 == 1400) {
                            Statics.field463.method6544(class33.field229, class33.field230, var30, var11, var12, var9.field3351, var9.field3352);
                        }
                        if (!field642 && var30) {
                            if (var9.field3340 == 1400) {
                                Statics.field463.method6715(var11, var12, var9.field3351, var9.field3352, var28, var29);
                            } else {
                                method2726(var9, var28 - var11, var29 - var12);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3416.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3416[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3416[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3485 != null) {
                                            var35 = class24.field130[var9.field3416[var31][var34]];
                                        }
                                        if (method1970(var9.field3416[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3485 != null && var9.field3485[var31] > field507) {
                                                break;
                                            }
                                            byte var36 = var9.field3486[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !class24.field130[86] && !class24.field130[82] && !class24.field130[81]) && ((var36 & 0x2) == 0 || class24.field130[86]) && ((var36 & 0x1) == 0 || class24.field130[82]) && ((var36 & 0x4) == 0 || class24.field130[81])) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method3562(var31 + 1, var9.field3449, var9.field3461, var9.field3335, "");
                                    } else if (var31 == 10) {
                                        Statics.method1660();
                                        method4447(var9.field3449, var9.field3461, class296.method3944(Statics.method5486(var9)), var9.field3335);
                                        field775 = Statics.method2863(var9);
                                        if (field775 == null) {
                                            field775 = class309.field3599;
                                        }
                                        field653 = var9.field3420 + class93.method2498(16777215);
                                    }
                                    int var37 = var9.field3418[var31];
                                    if (var9.field3485 == null) {
                                        var9.field3485 = new int[var9.field3416.length];
                                    }
                                    if (var9.field3419 == null) {
                                        var9.field3419 = new int[var9.field3416.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3485[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3485[var31] == 0) {
                                        var9.field3485[var31] = field507 + var37 + var9.field3419[var31];
                                    } else {
                                        var9.field3485[var31] = field507 + var37;
                                    }
                                }
                                if (!var32 && var9.field3485 != null) {
                                    var9.field3485[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3451) {
                            boolean var38;
                            if (class33.field229 >= var13 && class33.field230 >= var14 && class33.field229 < var15 && class33.field230 < var16) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class33.field228 == 1 || !Statics.field3560 && class33.field228 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class33.field220 == 1 || !Statics.field3560 && class33.field220 == 4) && class33.field237 >= var13 && class33.field234 >= var14 && class33.field237 < var15 && class33.field234 < var16) {
                                var40 = true;
                            }
                            if (var40) {
                                method3260(var9, class33.field237 - var11, class33.field234 - var12);
                                if (var9.field3338 == 11 && var9.method5171(class33.field237, class33.field234)) {
                                    switch(var9.method5075()) {
                                        case 0:
                                            class30.method6446(var9.method5077(), true, false);
                                            break;
                                        case 1:
                                            if (class296.method3259(Statics.method5486(var9))) {
                                                int[] var41 = var9.method5078();
                                                if (var41 != null) {
                                                    class265 var42 = class265.method3935(class263.field2976, field685.field1328);
                                                    var42.field3019.method7164(var41[0]);
                                                    var42.field3019.method7007(var9.field3461);
                                                    var42.field3019.method7018(var41[1]);
                                                    var42.field3019.method7020(var9.method5097());
                                                    var42.field3019.method7018(var41[2]);
                                                    var42.field3019.method6957(var9.field3449);
                                                    field685.method2395(var42);
                                                }
                                            }
                                    }
                                }
                            }
                            if (var9.field3340 == 1400) {
                                Statics.field463.method6545(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field721 != null && field721 != var9 && var38 && class296.method4966(Statics.method5486(var9))) {
                                field666 = var9;
                            }
                            if (field681 == var9) {
                                field697 = true;
                                field774 = var11;
                                field687 = var12;
                            }
                            if (var9.field3427) {
                                if (var38 && field544 != 0 && var9.field3362 != null) {
                                    class81 var43 = new class81();
                                    var43.field1033 = true;
                                    var43.field1045 = var9;
                                    var43.field1036 = field544;
                                    var43.field1035 = var9.field3362;
                                    field710.method5530(var43);
                                }
                                if (field721 != null || Statics.field1623 != null || field642) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3373 && var40) {
                                    var9.field3373 = true;
                                    if (var9.field3429 != null) {
                                        class81 var44 = new class81();
                                        var44.field1033 = true;
                                        var44.field1045 = var9;
                                        var44.field1038 = class33.field237 - var11;
                                        var44.field1036 = class33.field234 - var12;
                                        var44.field1035 = var9.field3429;
                                        field710.method5530(var44);
                                    }
                                }
                                if (var9.field3373 && var39 && var9.field3430 != null) {
                                    class81 var45 = new class81();
                                    var45.field1033 = true;
                                    var45.field1045 = var9;
                                    var45.field1038 = class33.field229 - var11;
                                    var45.field1036 = class33.field230 - var12;
                                    var45.field1035 = var9.field3430;
                                    field710.method5530(var45);
                                }
                                if (var9.field3373 && !var39) {
                                    var9.field3373 = false;
                                    if (var9.field3431 != null) {
                                        class81 var46 = new class81();
                                        var46.field1033 = true;
                                        var46.field1045 = var9;
                                        var46.field1038 = class33.field229 - var11;
                                        var46.field1036 = class33.field230 - var12;
                                        var46.field1035 = var9.field3431;
                                        field712.method5530(var46);
                                    }
                                }
                                if (var39 && var9.field3387 != null) {
                                    class81 var47 = new class81();
                                    var47.field1033 = true;
                                    var47.field1045 = var9;
                                    var47.field1038 = class33.field229 - var11;
                                    var47.field1036 = class33.field230 - var12;
                                    var47.field1035 = var9.field3387;
                                    field710.method5530(var47);
                                }
                                if (!var9.field3399 && var38) {
                                    var9.field3399 = true;
                                    if (var9.field3398 != null) {
                                        class81 var48 = new class81();
                                        var48.field1033 = true;
                                        var48.field1045 = var9;
                                        var48.field1038 = class33.field229 - var11;
                                        var48.field1036 = class33.field230 - var12;
                                        var48.field1035 = var9.field3398;
                                        field710.method5530(var48);
                                    }
                                }
                                if (var9.field3399 && var38 && var9.field3476 != null) {
                                    class81 var49 = new class81();
                                    var49.field1033 = true;
                                    var49.field1045 = var9;
                                    var49.field1038 = class33.field229 - var11;
                                    var49.field1036 = class33.field230 - var12;
                                    var49.field1035 = var9.field3476;
                                    field710.method5530(var49);
                                }
                                if (var9.field3399 && !var38) {
                                    var9.field3399 = false;
                                    if (var9.field3380 != null) {
                                        class81 var50 = new class81();
                                        var50.field1033 = true;
                                        var50.field1045 = var9;
                                        var50.field1038 = class33.field229 - var11;
                                        var50.field1036 = class33.field230 - var12;
                                        var50.field1035 = var9.field3380;
                                        field712.method5530(var50);
                                    }
                                }
                                if (var9.field3446 != null) {
                                    class81 var51 = new class81();
                                    var51.field1045 = var9;
                                    var51.field1035 = var9.field3446;
                                    field711.method5530(var51);
                                }
                                if (var9.field3428 != null && field694 > var9.field3480) {
                                    if (var9.field3441 == null || field694 - var9.field3480 > 32) {
                                        class81 var56 = new class81();
                                        var56.field1045 = var9;
                                        var56.field1035 = var9.field3428;
                                        field710.method5530(var56);
                                    } else {
                                        label646: for (int var52 = var9.field3480; var52 < field694; var52++) {
                                            int var53 = field693[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field3441.length; var54++) {
                                                if (var9.field3441[var54] == var53) {
                                                    class81 var55 = new class81();
                                                    var55.field1045 = var9;
                                                    var55.field1035 = var9.field3428;
                                                    field710.method5530(var55);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3480 = field694;
                                }
                                if (var9.field3442 != null && field696 > var9.field3481) {
                                    if (var9.field3443 == null || field696 - var9.field3481 > 32) {
                                        class81 var61 = new class81();
                                        var61.field1045 = var9;
                                        var61.field1035 = var9.field3442;
                                        field710.method5530(var61);
                                    } else {
                                        label622: for (int var57 = var9.field3481; var57 < field696; var57++) {
                                            int var58 = field493[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field3443.length; var59++) {
                                                if (var9.field3443[var59] == var58) {
                                                    class81 var60 = new class81();
                                                    var60.field1045 = var9;
                                                    var60.field1035 = var9.field3442;
                                                    field710.method5530(var60);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3481 = field696;
                                }
                                if (var9.field3444 != null && field698 > var9.field3434) {
                                    if (var9.field3445 == null || field698 - var9.field3434 > 32) {
                                        class81 var66 = new class81();
                                        var66.field1045 = var9;
                                        var66.field1035 = var9.field3444;
                                        field710.method5530(var66);
                                    } else {
                                        label598: for (int var62 = var9.field3434; var62 < field698; var62++) {
                                            int var63 = field569[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field3445.length; var64++) {
                                                if (var9.field3445[var64] == var63) {
                                                    class81 var65 = new class81();
                                                    var65.field1045 = var9;
                                                    var65.field1035 = var9.field3444;
                                                    field710.method5530(var65);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3434 = field698;
                                }
                                if (field701 > var9.field3479 && var9.field3349 != null) {
                                    class81 var67 = new class81();
                                    var67.field1045 = var9;
                                    var67.field1035 = var9.field3349;
                                    field710.method5530(var67);
                                }
                                if (field702 > var9.field3479 && var9.field3453 != null) {
                                    class81 var68 = new class81();
                                    var68.field1045 = var9;
                                    var68.field1035 = var9.field3453;
                                    field710.method5530(var68);
                                }
                                if (field703 > var9.field3479 && var9.field3469 != null) {
                                    class81 var69 = new class81();
                                    var69.field1045 = var9;
                                    var69.field1035 = var9.field3469;
                                    field710.method5530(var69);
                                }
                                if (field704 > var9.field3479 && var9.field3455 != null) {
                                    class81 var70 = new class81();
                                    var70.field1045 = var9;
                                    var70.field1035 = var9.field3455;
                                    field710.method5530(var70);
                                }
                                if (field756 > var9.field3479 && var9.field3456 != null) {
                                    class81 var71 = new class81();
                                    var71.field1045 = var9;
                                    var71.field1035 = var9.field3456;
                                    field710.method5530(var71);
                                }
                                if (field706 > var9.field3479 && var9.field3336 != null) {
                                    class81 var72 = new class81();
                                    var72.field1045 = var9;
                                    var72.field1035 = var9.field3336;
                                    field710.method5530(var72);
                                }
                                if (field707 > var9.field3479 && var9.field3433 != null) {
                                    class81 var73 = new class81();
                                    var73.field1045 = var9;
                                    var73.field1035 = var9.field3433;
                                    field710.method5530(var73);
                                }
                                if (field708 > var9.field3479 && var9.field3475 != null) {
                                    class81 var74 = new class81();
                                    var74.field1045 = var9;
                                    var74.field1035 = var9.field3475;
                                    field710.method5530(var74);
                                }
                                var9.field3479 = field692;
                                if (var9.field3450 != null) {
                                    for (int var75 = 0; var75 < field732; var75++) {
                                        class81 var76 = new class81();
                                        var76.field1045 = var9;
                                        var76.field1039 = field734[var75];
                                        var76.field1040 = field733[var75];
                                        var76.field1035 = var9.field3450;
                                        field710.method5530(var76);
                                    }
                                }
                                if (var9.field3417 != null) {
                                    int[] var77 = class24.method6742();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class81 var79 = new class81();
                                        var79.field1045 = var9;
                                        var79.field1039 = var77[var78];
                                        var79.field1035 = var9.field3417;
                                        field710.method5530(var79);
                                    }
                                }
                                if (var9.field3452 != null) {
                                    int[] var80 = class24.method2620();
                                    for (int var81 = 0; var81 < var80.length; var81++) {
                                        class81 var82 = new class81();
                                        var82.field1045 = var9;
                                        var82.field1039 = var80[var81];
                                        var82.field1035 = var9.field3452;
                                        field710.method5530(var82);
                                    }
                                }
                            }
                        }
                        if (!var9.field3451) {
                            if (field721 != null || Statics.field1623 != null || field642) {
                                continue;
                            }
                            if ((var9.field3467 >= 0 || var9.field3363 != 0) && class33.field229 >= var13 && class33.field230 >= var14 && class33.field229 < var15 && class33.field230 < var16) {
                                if (var9.field3467 >= 0) {
                                    Statics.field156 = arg0[var9.field3467];
                                } else {
                                    Statics.field156 = var9;
                                }
                            }
                            if (var9.field3338 == 8 && class33.field229 >= var13 && class33.field230 >= var14 && class33.field229 < var15 && class33.field230 < var16) {
                                Statics.field487 = var9;
                            }
                            if (var9.field3360 > var9.field3352) {
                                method2693(var9, var9.field3351 + var11, var12, var9.field3352, var9.field3360, class33.field229, class33.field230);
                            }
                        }
                        if (var9.field3338 == 0) {
                            method3047(arg0, var9.field3449, var13, var14, var15, var16, var11 - var9.field3357, var12 - var9.field3358);
                            if (var9.field3454 != null) {
                                method3047(var9.field3454, var9.field3449, var13, var14, var15, var16, var11 - var9.field3357, var12 - var9.field3358);
                            }
                            class80 var83 = (class80) field534.method6772((long) var9.field3449);
                            if (var83 != null) {
                                if (var83.field1031 == 0 && class33.field229 >= var13 && class33.field230 >= var14 && class33.field229 < var15 && class33.field230 < var16 && !field642) {
                                    for (class81 var84 = (class81) field710.method5540(); var84 != null; var84 = (class81) field710.method5534()) {
                                        if (var84.field1033) {
                                            var84.method6503();
                                            var84.field1045.field3399 = false;
                                        }
                                    }
                                    if (Statics.field1500 == 0) {
                                        field721 = null;
                                        field681 = null;
                                    }
                                    if (!field642) {
                                        method5961();
                                    }
                                }
                                method5507(var83.field1030, var13, var14, var15, var16, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.ja(II)Z")
    public static boolean method1970(int arg0) {
        for (int var1 = 0; var1 < field732; var1++) {
            if (field734[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cf.js(III)V")
    public static final void method2005(int arg0, int arg1) {
        if (class295.method2938(arg0)) {
            method2913(Statics.field3326[arg0], arg1);
        }
    }

    @ObfuscatedName("ev.kn([Lky;II)V")
    public static final void method2913(class295[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class295 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3338 == 0) {
                    if (var3.field3454 != null) {
                        method2913(var3.field3454, arg1);
                    }
                    class80 var4 = (class80) field534.method6772((long) var3.field3449);
                    if (var4 != null) {
                        method2005(var4.field1030, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3458 != null) {
                    class81 var5 = new class81();
                    var5.field1045 = var3;
                    var5.field1035 = var3.field3458;
                    class64.method2809(var5);
                }
                if (arg1 == 1 && var3.field3432 != null) {
                    if (var3.field3461 >= 0) {
                        class295 var6 = class295.method2688(var3.field3449);
                        if (var6 == null || var6.field3454 == null || var3.field3461 >= var6.field3454.length || var6.field3454[var3.field3461] != var3) {
                            continue;
                        }
                    }
                    class81 var7 = new class81();
                    var7.field1045 = var3;
                    var7.field1035 = var3.field3432;
                    class64.method2809(var7);
                }
            }
        }
    }

    @ObfuscatedName("gn.ki(Lky;IIS)V")
    public static final void method3260(class295 arg0, int arg1, int arg2) {
        if (field721 != null || field642 || arg0 == null || method6080(arg0) == null) {
            return;
        }
        field721 = arg0;
        field681 = method6080(arg0);
        field682 = arg1;
        field664 = arg2;
        Statics.field1500 = 0;
        field492 = false;
        int var3 = method5217();
        if (var3 == -1) {
            return;
        }
        Statics.field829 = new class67();
        Statics.field829.field878 = field644[var3];
        Statics.field829.field873 = field645[var3];
        Statics.field829.field879 = field686[var3];
        Statics.field829.field875 = field647[var3];
        Statics.field829.field876 = field648[var3];
    }

    @ObfuscatedName("client.kg(B)V")
    public final void method1095() {
        method5855(field721);
        Statics.field1500++;
        if (field688 && field697) {
            int var1 = class33.field229;
            int var2 = class33.field230;
            int var3 = var1 - field682;
            int var4 = var2 - field664;
            if (var3 < field774) {
                var3 = field774;
            }
            if (field721.field3351 + var3 > field774 + field681.field3351) {
                var3 = field774 + field681.field3351 - field721.field3351;
            }
            if (var4 < field687) {
                var4 = field687;
            }
            if (field721.field3352 + var4 > field687 + field681.field3352) {
                var4 = field687 + field681.field3352 - field721.field3352;
            }
            int var5 = var3 - field689;
            int var6 = var4 - field758;
            int var7 = field721.field3423;
            if (Statics.field1500 > field721.field3424 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field492 = true;
            }
            int var8 = field681.field3357 + (var3 - field774);
            int var9 = field681.field3358 + (var4 - field687);
            if (field721.field3462 != null && field492) {
                class81 var10 = new class81();
                var10.field1045 = field721;
                var10.field1038 = var8;
                var10.field1036 = var9;
                var10.field1035 = field721.field3462;
                class64.method2809(var10);
            }
            if (class33.field228 == 0) {
                if (field492) {
                    if (field721.field3459 != null) {
                        class81 var11 = new class81();
                        var11.field1045 = field721;
                        var11.field1038 = var8;
                        var11.field1036 = var9;
                        var11.field1042 = field666;
                        var11.field1035 = field721.field3459;
                        class64.method2809(var11);
                    }
                    if (field666 != null) {
                        class295 var12 = field721;
                        int var13 = class296.method2303(Statics.method5486(var12));
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
                                var12 = class295.method2688(var12.field3426);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class265 var16 = class265.method3935(class263.field2920, field685.field1328);
                            var16.field3019.method7020(field721.field3449);
                            var16.field3019.method6955(field721.field3461);
                            var16.field3019.method7008(field721.field3335);
                            var16.field3019.method6955(field666.field3461);
                            var16.field3019.method7009(field666.field3335);
                            var16.field3019.method7020(field666.field3449);
                            field685.method2395(var16);
                        }
                    }
                } else if (this.method1091()) {
                    this.method1494(field689 + field682, field758 + field664);
                } else if (field643 > 0) {
                    Statics.method2429(field689 + field682, field758 + field664);
                }
                field721 = null;
            }
        } else if (Statics.field1500 > 1) {
            if (!field492 && field643 > 0) {
                Statics.method2429(field689 + field682, field758 + field664);
            }
            field721 = null;
        }
    }

    @ObfuscatedName("mz.kj(Lky;I)V")
    public static void method5855(class295 arg0) {
        if (arg0 != null && field541 == arg0.field3484) {
            field716[arg0.field3483] = true;
        }
    }

    @ObfuscatedName("eb.kf(I)V")
    public static void method2815() {
        for (class80 var0 = (class80) field534.method6774(); var0 != null; var0 = (class80) field534.method6775()) {
            int var1 = var0.field1030;
            if (class295.method2938(var1)) {
                boolean var2 = true;
                class295[] var3 = Statics.field3326[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3451;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4410;
                    class295 var6 = class295.method2688(var5);
                    if (var6 != null) {
                        method5855(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("nk.kp(Lky;I)Lky;")
    public static class295 method6080(class295 arg0) {
        class295 var1 = arg0;
        int var2 = class296.method2303(Statics.method5486(arg0));
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
                var1 = class295.method2688(var1.field3426);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class295 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field3383;
        }
        return var5;
    }

    @ObfuscatedName("am.kk(IB)V")
    public static final void method389(int arg0) {
        if (!class295.method2938(arg0)) {
            return;
        }
        class295[] var1 = Statics.field3326[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class295 var3 = var1[var2];
            if (var3 != null) {
                var3.field3474 = 0;
                var3.field3487 = 0;
            }
        }
    }

    @ObfuscatedName("da.ky(II)V")
    public static final void method2558(int arg0) {
        if (class295.method2938(arg0)) {
            method2622(Statics.field3326[arg0], -1);
        }
    }

    @ObfuscatedName("dk.kc([Lky;II)V")
    public static final void method2622(class295[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class295 var3 = arg0[var2];
            if (var3 != null && var3.field3426 == arg1 && (!var3.field3451 || !method11(var3))) {
                if (var3.field3338 == 0) {
                    if (!var3.field3451 && method11(var3) && Statics.field156 != var3) {
                        continue;
                    }
                    method2622(arg0, var3.field3449);
                    if (var3.field3454 != null) {
                        method2622(var3.field3454, var3.field3449);
                    }
                    class80 var4 = (class80) field534.method6772((long) var3.field3449);
                    if (var4 != null) {
                        method2558(var4.field1030);
                    }
                }
                if (var3.field3338 == 6) {
                    if (var3.field3394 != -1 || var3.field3385 != -1) {
                        boolean var5 = method5205(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3385;
                        } else {
                            var6 = var3.field3394;
                        }
                        if (var6 != -1) {
                            class191 var7 = class191.method3011(var6);
                            var3.field3487 += field557;
                            while (var3.field3487 > var7.field2150[var3.field3474]) {
                                var3.field3487 -= var7.field2150[var3.field3474];
                                var3.field3474++;
                                if (var3.field3474 >= var7.field2148.length) {
                                    var3.field3474 -= var7.field2154;
                                    if (var3.field3474 < 0 || var3.field3474 >= var7.field2148.length) {
                                        var3.field3474 = 0;
                                    }
                                }
                                method5855(var3);
                            }
                        }
                    }
                    if (var3.field3393 != 0 && !var3.field3451) {
                        int var8 = var3.field3393 >> 16;
                        int var9 = var3.field3393 << 16 >> 16;
                        int var10 = field557 * var8;
                        int var11 = field557 * var9;
                        var3.field3388 = var3.field3388 + var10 & 0x7FF;
                        var3.field3384 = var3.field3384 + var11 & 0x7FF;
                        method5855(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dm.kw(II)V")
    public static final void method2528(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method3122((double) var3);
    }

    @ObfuscatedName("gi.ko(I)I")
    public static final int method3241() {
        float var0 = 200.0F * ((float) Statics.field1541.method2136() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("fq.kq(D)V")
    public static final void method3122(double arg0) {
        class231.method4131(arg0);
        ((class239) Statics.field2573).method4480(arg0);
        class189.field2074.method4647();
        Statics.field1541.method2135(arg0);
    }

    @ObfuscatedName("c.kb(IB)V")
    public static final void method12(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field1541.method2217()) {
            return;
        }
        if (Statics.field1541.method2217() == 0 && field746 != -1) {
            class274.method261(Statics.field80, field746, 0, var1, false);
            field747 = false;
        } else if (var1 == 0) {
            Statics.field3172.method4817();
            class274.field3169 = 1;
            Statics.field3174 = null;
            field747 = false;
        } else if (class274.field3169 == 0) {
            Statics.field3172.method4809(var1);
        } else {
            Statics.field3171 = var1;
        }
        Statics.field1541.method2137(var1);
    }

    @ObfuscatedName("db.ku(II)V")
    public static final void method2683(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1541.method2157(var1);
    }

    @ObfuscatedName("dh.kx(II)V")
    public static final void method2684(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1541.method2140(var1);
    }

    @ObfuscatedName("ho.km(II)V")
    public static final void method3941(int arg0) {
        method2815();
        for (class63 var1 = (class63) class63.field814.method5540(); var1 != null; var1 = (class63) class63.field814.method5534()) {
            if (var1.field824 != null) {
                var1.method1664();
            }
        }
        int var2 = class171.method2716(arg0).field1807;
        if (var2 == 0) {
            return;
        }
        int var3 = class289.field3284[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                method3122(0.9D);
            }
            if (var3 == 2) {
                method3122(0.8D);
            }
            if (var3 == 3) {
                method3122(0.7D);
            }
            if (var3 == 4) {
                method3122(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method12(255);
            }
            if (var3 == 1) {
                method12(192);
            }
            if (var3 == 2) {
                method12(128);
            }
            if (var3 == 3) {
                method12(64);
            }
            if (var3 == 4) {
                method12(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method2683(127);
            }
            if (var3 == 1) {
                method2683(96);
            }
            if (var3 == 2) {
                method2683(64);
            }
            if (var3 == 3) {
                method2683(32);
            }
            if (var3 == 4) {
                method2683(0);
            }
        }
        if (var2 == 5) {
            field661 = var3;
        }
        if (var2 == 6) {
            field603 = var3;
        }
        if (var2 == 9) {
            field525 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method2684(127);
            }
            if (var3 == 1) {
                method2684(96);
            }
            if (var3 == 2) {
                method2684(64);
            }
            if (var3 == 3) {
                method2684(32);
            }
            if (var3 == 4) {
                method2684(0);
            }
        }
        if (var2 == 17) {
            field677 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field588 = (class95) class330.method4919(class95.method1659(), var3);
            if (field588 == null) {
                field588 = class95.field1266;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field660 = -1;
            } else {
                field660 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field650 = (class95) class330.method4919(class95.method1659(), var3);
            if (field650 == null) {
                field650 = class95.field1266;
            }
        }
    }

    @ObfuscatedName("hk.kl(Lky;I)V")
    public static final void method4234(class295 arg0) {
        int var1 = arg0.field3340;
        if (var1 == 324) {
            if (field562 == -1) {
                field562 = arg0.field3371;
                field776 = arg0.field3372;
            }
            if (field739.field3299) {
                arg0.field3371 = field562;
            } else {
                arg0.field3371 = field776;
            }
        } else if (var1 == 325) {
            if (field562 == -1) {
                field562 = arg0.field3371;
                field776 = arg0.field3372;
            }
            if (field739.field3299) {
                arg0.field3371 = field776;
            } else {
                arg0.field3371 = field562;
            }
        } else if (var1 == 327) {
            arg0.field3388 = 150;
            arg0.field3384 = (int) (Math.sin((double) field507 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3397 = 5;
            arg0.field3381 = 0;
        } else if (var1 == 328) {
            arg0.field3388 = 150;
            arg0.field3384 = (int) (Math.sin((double) field507 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3397 = 5;
            arg0.field3381 = 1;
        }
    }

    @ObfuscatedName("a.kt(B)V")
    public static final void method289() {
        class265 var0 = class265.method3935(class263.field2906, field685.field1328);
        field685.method2395(var0);
        class64.field843 = true;
        for (class80 var1 = (class80) field534.method6774(); var1 != null; var1 = (class80) field534.method6775()) {
            if (var1.field1031 == 0 || var1.field1031 == 3) {
                method1907(var1, true);
            }
        }
        if (field684 != null) {
            method5855(field684);
            field684 = null;
        }
        class64.field843 = false;
    }

    @ObfuscatedName("b.ke(IIII)Lcc;")
    public static final class80 method14(int arg0, int arg1, int arg2) {
        class80 var3 = new class80();
        var3.field1030 = arg1;
        var3.field1031 = arg2;
        field534.method6773(var3, (long) arg0);
        method389(arg1);
        class295 var4 = class295.method2688(arg0);
        method5855(var4);
        if (field684 != null) {
            method5855(field684);
            field684 = null;
        }
        method4963(Statics.field3326[arg0 >> 16], var4, false);
        class64.method2827(arg1);
        if (field523 != -1) {
            method2005(field523, 1);
        }
        return var3;
    }

    @ObfuscatedName("bd.kd(Lcc;ZS)V")
    public static final void method1907(class80 arg0, boolean arg1) {
        int var2 = arg0.field1030;
        int var3 = (int) arg0.field4410;
        arg0.method6503();
        if (arg1 && var2 != -1 && Statics.field2330[var2]) {
            Statics.field3448.method5308(var2);
            if (Statics.field3326[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field3326[var2].length; var5++) {
                    if (Statics.field3326[var2][var5] != null) {
                        if (Statics.field3326[var2][var5].field3338 == 2) {
                            var4 = false;
                        } else {
                            Statics.field3326[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field3326[var2] = null;
                }
                Statics.field2330[var2] = false;
            }
        }
        method398(var2);
        class295 var6 = class295.method2688(var3);
        if (var6 != null) {
            method5855(var6);
        }
        if (field523 != -1) {
            method2005(field523, 1);
        }
    }

    @ObfuscatedName("lg.kv(Lky;IIIB)V")
    public static final void method5243(class295 arg0, int arg1, int arg2, int arg3) {
        method2576();
        class288 var4 = arg0.method5065(false);
        if (var4 == null) {
            return;
        }
        class447.method7250(arg1, arg2, var4.field3280 + arg1, var4.field3277 + arg2);
        if (field745 == 2 || field745 == 5) {
            class447.method7270(arg1, arg2, 0, var4.field3278, var4.field3279);
        } else {
            int var5 = field730 & 0x7FF;
            int var6 = Statics.field4004.field1132 / 32 + 48;
            int var7 = 464 - Statics.field4004.field1116 / 32;
            Statics.field1188.method7386(arg1, arg2, var4.field3280, var4.field3277, var6, var7, var5, 256, var4.field3278, var4.field3279);
            for (int var8 = 0; var8 < field705; var8++) {
                int var9 = field779[var8] * 4 + 2 - Statics.field4004.field1132 / 32;
                int var10 = field536[var8] * 4 + 2 - Statics.field4004.field1116 / 32;
                method1019(arg1, arg2, var9, var10, field742[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class335 var13 = field750[Statics.field99][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field4004.field1132 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field4004.field1116 / 32;
                        method1019(arg1, arg2, var14, var15, Statics.field443[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field546; var16++) {
                class92 var17 = field560[field570[var16]];
                if (var17 != null && var17.method2022()) {
                    class179 var18 = var17.field1235;
                    if (var18 != null && var18.field1921 != null) {
                        var18 = var18.method3169();
                    }
                    if (var18 != null && var18.field1930 && var18.field1908) {
                        int var19 = var17.field1132 / 32 - Statics.field4004.field1132 / 32;
                        int var20 = var17.field1116 / 32 - Statics.field4004.field1116 / 32;
                        method1019(arg1, arg2, var19, var20, Statics.field443[1], var4);
                    }
                }
            }
            int var21 = class97.field1276;
            int[] var22 = class97.field1275;
            for (int var23 = 0; var23 < var21; var23++) {
                class85 var24 = field621[var22[var23]];
                if (var24 != null && var24.method2022() && !var24.field1085 && Statics.field4004 != var24) {
                    int var25 = var24.field1132 / 32 - Statics.field4004.field1132 / 32;
                    int var26 = var24.field1116 / 32 - Statics.field4004.field1116 / 32;
                    if (var24.method2037()) {
                        method1019(arg1, arg2, var25, var26, Statics.field443[3], var4);
                    } else if (Statics.field4004.field1090 != 0 && var24.field1090 != 0 && Statics.field4004.field1090 == var24.field1090) {
                        method1019(arg1, arg2, var25, var26, Statics.field443[4], var4);
                    } else if (var24.method2027()) {
                        method1019(arg1, arg2, var25, var26, Statics.field443[5], var4);
                    } else if (var24.method2024()) {
                        method1019(arg1, arg2, var25, var26, Statics.field443[6], var4);
                    } else {
                        method1019(arg1, arg2, var25, var26, Statics.field443[2], var4);
                    }
                }
            }
            if (field514 != 0 && field507 % 20 < 10) {
                if (field514 == 1 && field515 >= 0 && field515 < field560.length) {
                    class92 var27 = field560[field515];
                    if (var27 != null) {
                        int var28 = var27.field1132 / 32 - Statics.field4004.field1132 / 32;
                        int var29 = var27.field1116 / 32 - Statics.field4004.field1116 / 32;
                        method1018(arg1, arg2, var28, var29, Statics.field2212[1], var4);
                    }
                }
                if (field514 == 2) {
                    int var30 = field517 * 4 - Statics.field489 * 4 + 2 - Statics.field4004.field1132 / 32;
                    int var31 = field518 * 4 - Statics.field1843 * 4 + 2 - Statics.field4004.field1116 / 32;
                    method1018(arg1, arg2, var30, var31, Statics.field2212[1], var4);
                }
                if (field514 == 10 && field738 >= 0 && field738 < field621.length) {
                    class85 var32 = field621[field738];
                    if (var32 != null) {
                        int var33 = var32.field1132 / 32 - Statics.field4004.field1132 / 32;
                        int var34 = var32.field1116 / 32 - Statics.field4004.field1116 / 32;
                        method1018(arg1, arg2, var33, var34, Statics.field2212[1], var4);
                    }
                }
            }
            if (field540 != 0) {
                int var35 = field540 * 4 + 2 - Statics.field4004.field1132 / 32;
                int var36 = field764 * 4 + 2 - Statics.field4004.field1116 / 32;
                method1019(arg1, arg2, var35, var36, Statics.field2212[0], var4);
            }
            if (!Statics.field4004.field1085) {
                class447.method7249(var4.field3280 / 2 + arg1 - 1, var4.field3277 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field717[arg3] = true;
    }

    @ObfuscatedName("cl.kr(Lky;IIII)V")
    public static final void method2373(class295 arg0, int arg1, int arg2, int arg3) {
        class288 var4 = arg0.method5065(false);
        if (var4 == null) {
            return;
        }
        if (field745 < 3) {
            Statics.field73.method7386(arg1, arg2, var4.field3280, var4.field3277, 25, 25, field730, 256, var4.field3278, var4.field3279);
        } else {
            class447.method7270(arg1, arg2, 0, var4.field3278, var4.field3279);
        }
    }

    @ObfuscatedName("bo.ka(IIIILqi;Lki;I)V")
    public static final void method1018(int arg0, int arg1, int arg2, int arg3, class451 arg4, class288 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1019(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field730 & 0x7FF;
        int var8 = class231.field2576[var7];
        int var9 = class231.field2551[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3280 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field160.method7387(arg5.field3280 / 2 + arg0 - var17 / 2 + var15, arg5.field3277 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("bo.kz(IIIILqi;Lki;I)V")
    public static final void method1019(int arg0, int arg1, int arg2, int arg3, class451 arg4, class288 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field730 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class231.field2576[var6];
        int var9 = class231.field2551[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method7385(arg5.field3280 / 2 + var10 - arg4.field4714 / 2, arg5.field3277 / 2 - var11 - arg4.field4715 / 2, arg0, arg1, arg5.field3280, arg5.field3277, arg5.field3278, arg5.field3279);
        } else {
            arg4.method7474(arg5.field3280 / 2 + arg0 + var10 - arg4.field4714 / 2, arg5.field3277 / 2 + arg1 - var11 - arg4.field4715 / 2);
        }
    }

    @ObfuscatedName("kc.lg(I)V")
    public static final void method5182() {
        for (int var0 = 0; var0 < class97.field1276; var0++) {
            class85 var1 = field621[class97.field1275[var0]];
            var1.method2016();
        }
        class99.method3337();
        if (Statics.field3004 != null) {
            Statics.field3004.method6057();
        }
    }

    @ObfuscatedName("fq.lx(I)V")
    public static final void method3095() {
        Iterator var0 = class99.field1305.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1051();
        }
        if (Statics.field3004 != null) {
            Statics.field3004.method6061();
        }
    }

    @ObfuscatedName("lv.ly(I)V")
    public static final void method5516() {
        for (int var0 = 0; var0 < class97.field1276; var0++) {
            class85 var1 = field621[class97.field1275[var0]];
            var1.method2020();
        }
    }

    @ObfuscatedName("bu.ln(I)V")
    public static final void method1958() {
        field703 = field692;
        Statics.field847 = true;
    }

    @ObfuscatedName("pj.lz(B)V")
    public static final void method6865() {
        field704 = field692;
        Statics.field310 = true;
    }

    @ObfuscatedName("ji.lu(Ljava/lang/String;I)V")
    public static final void method4780(String arg0) {
        if (Statics.field3004 != null) {
            class265 var1 = class265.method3935(class263.field2910, field685.field1328);
            var1.field3019.method6954(class438.method6861(arg0));
            var1.field3019.method7142(arg0);
            field685.method2395(var1);
        }
    }

    @ObfuscatedName("fe.lw(Ljava/lang/String;B)V")
    public static final void method3073(String arg0) {
        if (!arg0.equals("")) {
            class265 var1 = class265.method3935(class263.field2987, field685.field1328);
            var1.field3019.method6954(class438.method6861(arg0));
            var1.field3019.method7142(arg0);
            field685.method2395(var1);
        }
    }

    @ObfuscatedName("hn.li(I)V")
    public static final void method3937() {
        class265 var0 = class265.method3935(class263.field2987, field685.field1328);
        var0.field3019.method6954(0);
        field685.method2395(var0);
    }

    @ObfuscatedName("ci.lq(IIB)V")
    public static final void method2224(int arg0, int arg1) {
        class149 var2 = arg0 >= 0 ? field737[arg0] : Statics.field114;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2837()) {
            return;
        }
        class131 var3 = (class131) var2.field1653.get(arg1);
        if (var3.field1534 != -1) {
            return;
        }
        String var4 = var3.field1528.method7528();
        class265 var5 = class265.method3935(class263.field2901, field685.field1328);
        var5.field3019.method6954(3 + class438.method6861(var4));
        var5.field3019.method6954(arg0);
        var5.field3019.method6955(arg1);
        var5.field3019.method7142(var4);
        field685.method2395(var5);
    }

    @ObfuscatedName("g.ll(IIS)V")
    public static final void method259(int arg0, int arg1) {
        if (field737[arg0] == null || arg1 < 0 || arg1 >= field737[arg0].method2837()) {
            return;
        }
        class131 var2 = (class131) field737[arg0].field1653.get(arg1);
        if (var2.field1534 != -1) {
            return;
        }
        class265 var3 = class265.method3935(class263.field2954, field685.field1328);
        var3.field3019.method6954(3 + class438.method6861(var2.field1528.method7528()));
        var3.field3019.method6954(arg0);
        var3.field3019.method6955(arg1);
        var3.field3019.method7142(var2.field1528.method7528());
        field685.method2395(var3);
    }

    @ObfuscatedName("ea.lp(IIZB)V")
    public static final void method2855(int arg0, int arg1, boolean arg2) {
        if (field737[arg0] == null || arg1 < 0 || arg1 >= field737[arg0].method2837()) {
            return;
        }
        class131 var3 = (class131) field737[arg0].field1653.get(arg1);
        class265 var4 = class265.method3935(class263.field2968, field685.field1328);
        var4.field3019.method6954(4 + class438.method6861(var3.field1528.method7528()));
        var4.field3019.method6954(arg0);
        var4.field3019.method6955(arg1);
        var4.field3019.method7186(arg2);
        var4.field3019.method7142(var3.field1528.method7528());
        field685.method2395(var4);
    }

    @ObfuscatedName("am.lc(II)V")
    public static void method398(int arg0) {
        for (class408 var1 = (class408) field713.method6774(); var1 != null; var1 = (class408) field713.method6775()) {
            if ((long) arg0 == (var1.field4410 >> 48 & 0xFFFFL)) {
                var1.method6503();
            }
        }
    }

    @ObfuscatedName("c.le(Lky;B)Z")
    public static boolean method11(class295 arg0) {
        return arg0.field3356;
    }

    @ObfuscatedName("mc.lf(Lky;II)Ljava/lang/String;")
    public static String method5989(class295 arg0, int arg1) {
        int var2 = Statics.method5486(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field3447 == null) {
            return null;
        } else if (arg0.field3421 == null || arg0.field3421.length <= arg1 || arg0.field3421[arg1] == null || arg0.field3421[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3421[arg1];
        }
    }

    @ObfuscatedName("bz.ls(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1971(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field494 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field494 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field494 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field494 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field494 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field869 != null) {
            var3 = "/p=" + Statics.field869;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3523 + "/a=" + Statics.field484 + var3 + "/";
    }

    @ObfuscatedName("dk.lm(Ljava/lang/String;I)V")
    public static void method2629(String arg0) {
        Statics.field869 = arg0;
        try {
            String var1 = Statics.field1515.getParameter(Integer.toString(18));
            String var2 = Statics.field1515.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class270.method2724() + 94608000000L;
                class285.field3267.setTime(new Date(var6));
                int var8 = class285.field3267.get(7);
                int var9 = class285.field3267.get(5);
                int var10 = class285.field3267.get(2);
                int var11 = class285.field3267.get(1);
                int var12 = class285.field3267.get(11);
                int var13 = class285.field3267.get(12);
                int var14 = class285.field3267.get(13);
                String var15 = class285.field3266[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class285.field3268[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field1515;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("w.lo(Ljava/lang/String;ZB)V")
    public static void method130(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3314; var5++) {
            class189 var6 = Statics.method268(var5);
            if ((!arg1 || var6.field2116) && var6.field2108 == -1 && var6.field2076.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field966 = -1;
                    Statics.field1113 = null;
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
        Statics.field1113 = var3;
        Statics.field217 = 0;
        Statics.field966 = var4;
        String[] var9 = new String[Statics.field966];
        for (int var10 = 0; var10 < Statics.field966; var10++) {
            var9[var10] = Statics.method268(var3[var10]).field2076;
        }
        short[] var11 = Statics.field1113;
        class435.method2613(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("ds.lv([BII)V")
    public static void method2524(byte[] arg0, int arg1) {
        if (field574 == null) {
            field574 = new byte[24];
        }
        class351.method5917(arg0, arg1, field574, 0, 24);
    }

    @ObfuscatedName("nu.lj(Lpi;II)V")
    public static void method6275(class438 arg0, int arg1) {
        method2524(arg0.field4618, arg1);
        if (class158.field1725 == null) {
            return;
        }
        try {
            class158.field1725.method6829(0L);
            class158.field1725.method6842(arg0.field4618, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("client.la(I)Lqb;")
    public class459 method1096() {
        return Statics.field4004 == null ? null : Statics.field4004.field1073;
    }

    @ObfuscatedName("gh.ld(IIIZI)V")
    public static void method3282(int arg0, int arg1, int arg2, boolean arg3) {
        class265 var4 = class265.method3935(class263.field2930, field685.field1328);
        var4.field3019.method6955(arg0);
        var4.field3019.method7008(arg1);
        var4.field3019.method7000(arg2);
        var4.field3019.method7018(arg3 ? field587 : 0);
        field685.method2395(var4);
    }

    @ObfuscatedName("dm.lt(I)Z")
    public static boolean method2529() {
        return field676 >= 2;
    }

    @ObfuscatedName("hu.lk(II)V")
    public static void method4125(int arg0) {
        field580 = arg0;
    }

    @ObfuscatedName("em.lr(B)V")
    public static void method2717() {
        field685.method2395(class265.method3935(class263.field2990, field685.field1328));
        field580 = 0;
    }

    @ObfuscatedName("bx.ms(I)V")
    public static void method1673() {
        if (field580 == 1) {
            field760 = true;
        }
    }

    @ObfuscatedName("cw.mr(S)V")
    public static void method2438() {
        if (!field760 || Statics.field4004 == null) {
            return;
        }
        int var0 = Statics.field4004.field1178[0];
        int var1 = Statics.field4004.field1179[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field50 = Statics.field4004.field1132;
        int var2 = method3938(Statics.field4004.field1132, Statics.field4004.field1116, Statics.field99) - field581;
        if (var2 < Statics.field398) {
            Statics.field398 = var2;
        }
        Statics.field3003 = Statics.field4004.field1116;
        field760 = false;
    }

    @ObfuscatedName("fu.mk(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method2970(String arg0) {
        class311[] var1 = class311.method3855();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class311 var3 = var1[var2];
            if (var3.field3918 != -1 && arg0.startsWith(class93.method1902(var3.field3918))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3918).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("da.mq(I)V")
    public static void method2562() {
        if (Statics.field1842 == null) {
            return;
        }
        field780 = field507;
        Statics.field1842.method5480();
        for (int var0 = 0; var0 < field621.length; var0++) {
            if (field621[var0] != null) {
                Statics.field1842.method5467((field621[var0].field1132 >> 7) + Statics.field489, (field621[var0].field1116 >> 7) + Statics.field1843);
            }
        }
    }

    @ObfuscatedName("nx.mn(I)Z")
    public static boolean method6228() {
        return Statics.field1541.method2145() >= field618;
    }

    @ObfuscatedName("lv.md(IB)V")
    public static void method5513(int arg0) {
        if (field674 != arg0) {
            field674 = arg0;
        }
    }
}

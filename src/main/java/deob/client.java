package deob;

import com.jagex.oldscape.pub.OAuthTokens;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class32 implements class331, OAuthTokens {

    @ObfuscatedName("client.w")
    public static class173[] field695 = new class173[4];

    @ObfuscatedName("client.ax")
    public static boolean field660 = true;

    @ObfuscatedName("client.bd")
    public static int field654 = 1;

    @ObfuscatedName("client.bt")
    public static int field482 = 0;

    @ObfuscatedName("client.bp")
    public static int field483 = 0;

    @ObfuscatedName("client.br")
    public static boolean field682 = false;

    @ObfuscatedName("client.bw")
    public static boolean field572 = false;

    @ObfuscatedName("client.bu")
    public static int field486 = -1;

    @ObfuscatedName("client.bn")
    public static int field524 = -1;

    @ObfuscatedName("client.bk")
    public static int field488 = -1;

    @ObfuscatedName("client.bm")
    public static boolean field489 = false;

    @ObfuscatedName("client.cw")
    public static int field490 = 0;

    @ObfuscatedName("client.cj")
    public static boolean field492 = true;

    @ObfuscatedName("client.ct")
    public static int field744 = 0;

    @ObfuscatedName("client.cz")
    public static long field494 = 1L;

    @ObfuscatedName("client.dd")
    public static int field495 = -1;

    @ObfuscatedName("client.dk")
    public static int field676 = -1;

    @ObfuscatedName("client.ds")
    public static long field497 = -1L;

    @ObfuscatedName("client.df")
    public static boolean field498 = true;

    @ObfuscatedName("client.db")
    public static boolean field499 = false;

    @ObfuscatedName("client.dn")
    public static int field500 = 0;

    @ObfuscatedName("client.dh")
    public static int field501 = 0;

    @ObfuscatedName("client.do")
    public static int field711 = 0;

    @ObfuscatedName("client.dp")
    public static int field686 = 0;

    @ObfuscatedName("client.dx")
    public static int field504 = 0;

    @ObfuscatedName("client.dl")
    public static int field505 = 0;

    @ObfuscatedName("client.du")
    public static int field738 = 0;

    @ObfuscatedName("client.dj")
    public static int field507 = 0;

    @ObfuscatedName("client.dy")
    public static int field508 = 0;

    @ObfuscatedName("client.dc")
    public static class94 field509 = class94.field1236;

    @ObfuscatedName("client.dm")
    public static class94 field510 = class94.field1236;

    @ObfuscatedName("client.de")
    public static int field558 = 0;

    @ObfuscatedName("client.dt")
    public static int field512 = 0;

    @ObfuscatedName("client.da")
    public static int field513 = 0;

    @ObfuscatedName("client.ed")
    public static int field514 = 0;

    @ObfuscatedName("client.es")
    public static int field636 = 0;

    @ObfuscatedName("client.en")
    public static int field547 = 0;

    @ObfuscatedName("client.ef")
    public static int field517 = 0;

    @ObfuscatedName("client.er")
    public static int field518 = 0;

    @ObfuscatedName("client.ek")
    public static class113 field519 = class113.field1358;

    @ObfuscatedName("client.eg")
    public static class404 field520 = class404.field4333;

    @ObfuscatedName("client.fn")
    public String field522;

    @ObfuscatedName("client.fz")
    public class15 field523;

    @ObfuscatedName("client.fe")
    public class20 field557;

    @ObfuscatedName("client.fk")
    public static boolean field525 = false;

    @ObfuscatedName("client.fw")
    public static class71 field526 = new class71();

    @ObfuscatedName("client.fj")
    public class400 field527;

    @ObfuscatedName("client.fb")
    public class8 field528;

    @ObfuscatedName("client.fh")
    public static byte[] field613 = null;

    @ObfuscatedName("client.gd")
    public static class91[] field530 = new class91[32768];

    @ObfuscatedName("client.gg")
    public static int field531 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field532 = new int[32768];

    @ObfuscatedName("client.gs")
    public static int field561 = 0;

    @ObfuscatedName("client.gn")
    public static int[] field534 = new int[250];

    @ObfuscatedName("client.gy")
    public static final class99 field535 = new class99();

    @ObfuscatedName("client.gc")
    public static int field536 = 0;

    @ObfuscatedName("client.ga")
    public static boolean field537 = false;

    @ObfuscatedName("client.gz")
    public static boolean field538 = true;

    @ObfuscatedName("client.gq")
    public static boolean field539 = false;

    @ObfuscatedName("client.gk")
    public static class325 field540 = new class325();

    @ObfuscatedName("client.gh")
    public static HashMap field551 = new HashMap();

    @ObfuscatedName("client.ht")
    public static int field640 = 0;

    @ObfuscatedName("client.hs")
    public static int field657 = 1;

    @ObfuscatedName("client.hb")
    public static int field642 = 0;

    @ObfuscatedName("client.hm")
    public static int field545 = 1;

    @ObfuscatedName("client.hz")
    public static int field546 = 0;

    @ObfuscatedName("client.hk")
    public static boolean field481 = false;

    @ObfuscatedName("client.hc")
    public static int[][][] field549 = new int[4][13][13];

    @ObfuscatedName("client.hw")
    public static final int[] field550 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.hl")
    public static int field765 = 0;

    @ObfuscatedName("client.ij")
    public static int field552 = 2301979;

    @ObfuscatedName("client.ig")
    public static int field553 = 5063219;

    @ObfuscatedName("client.ip")
    public static int field604 = 3353893;

    @ObfuscatedName("client.il")
    public static int field601 = 7759444;

    @ObfuscatedName("client.it")
    public static String field722 = null;

    @ObfuscatedName("client.ie")
    public static boolean field556 = false;

    @ObfuscatedName("client.ih")
    public static int field619 = 0;

    @ObfuscatedName("client.id")
    public static int field487 = 128;

    @ObfuscatedName("client.iq")
    public static int field559 = 0;

    @ObfuscatedName("client.ii")
    public static int field560 = 0;

    @ObfuscatedName("client.ia")
    public static int field699 = 0;

    @ObfuscatedName("client.iy")
    public static int field562 = 0;

    @ObfuscatedName("client.ik")
    public static int field563 = 0;

    @ObfuscatedName("client.iu")
    public static int field748 = 0;

    @ObfuscatedName("client.js")
    public static int field541 = 50;

    @ObfuscatedName("client.jj")
    public static int field566 = 0;

    @ObfuscatedName("client.jp")
    public static int field567 = 0;

    @ObfuscatedName("client.ja")
    public static int field568 = 0;

    @ObfuscatedName("client.jv")
    public static int field570 = 12;

    @ObfuscatedName("client.jb")
    public static int field599 = 6;

    @ObfuscatedName("client.jg")
    public static int field571 = 0;

    @ObfuscatedName("client.jl")
    public static boolean field742 = false;

    @ObfuscatedName("client.jr")
    public static int field573 = 0;

    @ObfuscatedName("client.jt")
    public static boolean field574 = false;

    @ObfuscatedName("client.jn")
    public static int field484 = 0;

    @ObfuscatedName("client.je")
    public static int field576 = 0;

    @ObfuscatedName("client.jy")
    public static int field595 = 50;

    @ObfuscatedName("client.jw")
    public static int[] field578 = new int[field595];

    @ObfuscatedName("client.ju")
    public static int[] field579 = new int[field595];

    @ObfuscatedName("client.ji")
    public static int[] field690 = new int[field595];

    @ObfuscatedName("client.jk")
    public static int[] field581 = new int[field595];

    @ObfuscatedName("client.jo")
    public static int[] field582 = new int[field595];

    @ObfuscatedName("client.jf")
    public static int[] field583 = new int[field595];

    @ObfuscatedName("client.jz")
    public static int[] field516 = new int[field595];

    @ObfuscatedName("client.jx")
    public static String[] field671 = new String[field595];

    @ObfuscatedName("client.jq")
    public static int[][] field564 = new int[104][104];

    @ObfuscatedName("client.ke")
    public static int field542 = 0;

    @ObfuscatedName("client.kx")
    public static int field588 = -1;

    @ObfuscatedName("client.kl")
    public static int field589 = -1;

    @ObfuscatedName("client.kk")
    public static int field590 = 0;

    @ObfuscatedName("client.ks")
    public static int field723 = 0;

    @ObfuscatedName("client.km")
    public static int field592 = 0;

    @ObfuscatedName("client.kw")
    public static int field593 = 0;

    @ObfuscatedName("client.ku")
    public static boolean field511 = true;

    @ObfuscatedName("client.kf")
    public static int field728 = 0;

    @ObfuscatedName("client.kv")
    public static int field594 = 0;

    @ObfuscatedName("client.kd")
    public static int field725 = 0;

    @ObfuscatedName("client.kp")
    public static int field598 = 0;

    @ObfuscatedName("client.kr")
    public static int field759 = 0;

    @ObfuscatedName("client.kj")
    public static int field600 = 0;

    @ObfuscatedName("client.kt")
    public static boolean field669 = false;

    @ObfuscatedName("client.ka")
    public static int field685 = 0;

    @ObfuscatedName("client.ki")
    public static int field603 = 0;

    @ObfuscatedName("client.kg")
    public static boolean field480 = true;

    @ObfuscatedName("client.kc")
    public static class83[] field605 = new class83[2048];

    @ObfuscatedName("client.kh")
    public static int field606 = -1;

    @ObfuscatedName("client.lk")
    public static int field609 = 0;

    @ObfuscatedName("client.lu")
    public static boolean field608 = true;

    @ObfuscatedName("client.lm")
    public static int field533 = 0;

    @ObfuscatedName("client.lr")
    public static int field496 = 0;

    @ObfuscatedName("client.ly")
    public static int[] field611 = new int[1000];

    @ObfuscatedName("client.li")
    public static final int[] field612 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.lh")
    public static String[] field607 = new String[8];

    @ObfuscatedName("client.lf")
    public static boolean[] field614 = new boolean[8];

    @ObfuscatedName("client.ln")
    public static int[] field615 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.lo")
    public static int field565 = -1;

    @ObfuscatedName("client.lv")
    public static class309[][][] field569 = new class309[4][104][104];

    @ObfuscatedName("client.lw")
    public static class309 field618 = new class309();

    @ObfuscatedName("client.lt")
    public static class309 field554 = new class309();

    @ObfuscatedName("client.lg")
    public static class309 field620 = new class309();

    @ObfuscatedName("client.ls")
    public static int[] field621 = new int[25];

    @ObfuscatedName("client.la")
    public static int[] field506 = new int[25];

    @ObfuscatedName("client.lx")
    public static int[] field623 = new int[25];

    @ObfuscatedName("client.lq")
    public static int field632 = 0;

    @ObfuscatedName("client.le")
    public static boolean field625 = false;

    @ObfuscatedName("client.mv")
    public static int field626 = 0;

    @ObfuscatedName("client.mr")
    public static int[] field627 = new int[500];

    @ObfuscatedName("client.mw")
    public static int[] field493 = new int[500];

    @ObfuscatedName("client.mj")
    public static int[] field629 = new int[500];

    @ObfuscatedName("client.ms")
    public static int[] field630 = new int[500];

    @ObfuscatedName("client.mh")
    public static String[] field575 = new String[500];

    @ObfuscatedName("client.mp")
    public static String[] field652 = new String[500];

    @ObfuscatedName("client.mt")
    public static boolean[] field633 = new boolean[500];

    @ObfuscatedName("client.mo")
    public static boolean field634 = false;

    @ObfuscatedName("client.mb")
    public static boolean field635 = false;

    @ObfuscatedName("client.me")
    public static boolean field754 = false;

    @ObfuscatedName("client.mf")
    public static boolean field637 = true;

    @ObfuscatedName("client.mi")
    public static int field638 = -1;

    @ObfuscatedName("client.mk")
    public static int field639 = -1;

    @ObfuscatedName("client.mg")
    public static int field584 = 0;

    @ObfuscatedName("client.mu")
    public static int field641 = 50;

    @ObfuscatedName("client.mz")
    public static int field602 = 0;

    @ObfuscatedName("client.nw")
    public static boolean field644 = false;

    @ObfuscatedName("client.ne")
    public static int field645 = -1;

    @ObfuscatedName("client.nx")
    public static int field646 = -1;

    @ObfuscatedName("client.nq")
    public static String field647 = null;

    @ObfuscatedName("client.nh")
    public static String field628 = null;

    @ObfuscatedName("client.nj")
    public static int field649 = -1;

    @ObfuscatedName("client.nv")
    public static class379 field650 = new class379(8);

    @ObfuscatedName("client.nz")
    public static int field651 = 0;

    @ObfuscatedName("client.nk")
    public static int field544 = -1;

    @ObfuscatedName("client.ns")
    public static int field555 = 0;

    @ObfuscatedName("client.nb")
    public static int field610 = 0;

    @ObfuscatedName("client.nf")
    public static class262 field655 = null;

    @ObfuscatedName("client.na")
    public static int field656 = 0;

    @ObfuscatedName("client.nn")
    public static int field587 = 0;

    @ObfuscatedName("client.nm")
    public static int field658 = 0;

    @ObfuscatedName("client.ng")
    public static int field585 = -1;

    @ObfuscatedName("client.ni")
    public static boolean field580 = false;

    @ObfuscatedName("client.nt")
    public static class262 field668 = null;

    @ObfuscatedName("client.ny")
    public static class262 field662 = null;

    @ObfuscatedName("client.nl")
    public static class262 field663 = null;

    @ObfuscatedName("client.oj")
    public static int field664 = 0;

    @ObfuscatedName("client.oa")
    public static int field693 = 0;

    @ObfuscatedName("client.oo")
    public static class262 field666 = null;

    @ObfuscatedName("client.on")
    public static boolean field667 = false;

    @ObfuscatedName("client.os")
    public static int field624 = -1;

    @ObfuscatedName("client.ol")
    public static int field659 = -1;

    @ObfuscatedName("client.ou")
    public static boolean field670 = false;

    @ObfuscatedName("client.op")
    public static int field740 = -1;

    @ObfuscatedName("client.oq")
    public static int field672 = -1;

    @ObfuscatedName("client.ot")
    public static boolean field622 = false;

    @ObfuscatedName("client.ov")
    public static int field674 = 1;

    @ObfuscatedName("client.og")
    public static int[] field675 = new int[32];

    @ObfuscatedName("client.oy")
    public static int field577 = 0;

    @ObfuscatedName("client.or")
    public static int[] field677 = new int[32];

    @ObfuscatedName("client.oh")
    public static int field678 = 0;

    @ObfuscatedName("client.oi")
    public static int[] field679 = new int[32];

    @ObfuscatedName("client.oc")
    public static int field680 = 0;

    @ObfuscatedName("client.ob")
    public static int[] field681 = new int[32];

    @ObfuscatedName("client.ok")
    public static int field716 = 0;

    @ObfuscatedName("client.oe")
    public static int field683 = 0;

    @ObfuscatedName("client.px")
    public static int field684 = 0;

    @ObfuscatedName("client.pk")
    public static int field631 = 0;

    @ObfuscatedName("client.pn")
    public static int field665 = 0;

    @ObfuscatedName("client.pe")
    public static int field673 = 0;

    @ObfuscatedName("client.pp")
    public static int field704 = 0;

    @ObfuscatedName("client.po")
    public static int field689 = 0;

    @ObfuscatedName("client.pt")
    public static int field696 = 0;

    @ObfuscatedName("client.py")
    public static int field691 = 0;

    @ObfuscatedName("client.pz")
    public static class309 field692 = new class309();

    @ObfuscatedName("client.pq")
    public static class309 field746 = new class309();

    @ObfuscatedName("client.pj")
    public static class309 field694 = new class309();

    @ObfuscatedName("client.pa")
    public static class379 field755 = new class379(512);

    @ObfuscatedName("client.pg")
    public static int field700 = 0;

    @ObfuscatedName("client.pc")
    public static int field697 = -2;

    @ObfuscatedName("client.pi")
    public static boolean[] field698 = new boolean[100];

    @ObfuscatedName("client.pm")
    public static boolean[] field767 = new boolean[100];

    @ObfuscatedName("client.pu")
    public static boolean[] field688 = new boolean[100];

    @ObfuscatedName("client.pr")
    public static int[] field701 = new int[100];

    @ObfuscatedName("client.pw")
    public static int[] field702 = new int[100];

    @ObfuscatedName("client.pf")
    public static int[] field703 = new int[100];

    @ObfuscatedName("client.qs")
    public static int[] field721 = new int[100];

    @ObfuscatedName("client.qi")
    public static int field705 = 0;

    @ObfuscatedName("client.qe")
    public static long field706 = 0L;

    @ObfuscatedName("client.qc")
    public static boolean field707 = true;

    @ObfuscatedName("client.qa")
    public static int[] field708 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.qm")
    public static int field709 = 0;

    @ObfuscatedName("client.qz")
    public static int field710 = 0;

    @ObfuscatedName("client.qx")
    public static String field648 = "";

    @ObfuscatedName("client.qn")
    public static long[] field616 = new long[100];

    @ObfuscatedName("client.qo")
    public static int field713 = 0;

    @ObfuscatedName("client.ql")
    public static int field714 = 0;

    @ObfuscatedName("client.qk")
    public static int[] field715 = new int[128];

    @ObfuscatedName("client.qq")
    public static int[] field596 = new int[128];

    @ObfuscatedName("client.qd")
    public static long field717 = -1L;

    @ObfuscatedName("client.rf")
    public static class128[] field718 = new class128[1];

    @ObfuscatedName("client.ra")
    public static class137[] field719 = new class137[1];

    @ObfuscatedName("client.re")
    public static int field720 = -1;

    @ObfuscatedName("client.rk")
    public static int field653 = 0;

    @ObfuscatedName("client.rb")
    public static int[] field502 = new int[1000];

    @ObfuscatedName("client.rx")
    public static int[] field617 = new int[1000];

    @ObfuscatedName("client.rz")
    public static class413[] field548 = new class413[1000];

    @ObfuscatedName("client.ri")
    public static int field586 = 0;

    @ObfuscatedName("client.rp")
    public static int field726 = 0;

    @ObfuscatedName("client.rw")
    public static int field727 = 0;

    @ObfuscatedName("client.ry")
    public static int field503 = -1;

    @ObfuscatedName("client.rv")
    public static boolean field729 = false;

    @ObfuscatedName("client.rr")
    public static int field730 = 0;

    @ObfuscatedName("client.sm")
    public static int[] field731 = new int[50];

    @ObfuscatedName("client.sk")
    public static int[] field732 = new int[50];

    @ObfuscatedName("client.si")
    public static int[] field733 = new int[50];

    @ObfuscatedName("client.se")
    public static int[] field734 = new int[50];

    @ObfuscatedName("client.ss")
    public static class35[] field735 = new class35[50];

    @ObfuscatedName("client.st")
    public static boolean field736 = false;

    @ObfuscatedName("client.sw")
    public static boolean[] field737 = new boolean[5];

    @ObfuscatedName("client.su")
    public static int[] field485 = new int[5];

    @ObfuscatedName("client.sn")
    public static int[] field739 = new int[5];

    @ObfuscatedName("client.sp")
    public static int[] field687 = new int[5];

    @ObfuscatedName("client.sj")
    public static int[] field741 = new int[5];

    @ObfuscatedName("client.sr")
    public static short field724 = 256;

    @ObfuscatedName("client.sd")
    public static short field743 = 205;

    @ObfuscatedName("client.sl")
    public static short field543 = 256;

    @ObfuscatedName("client.tx")
    public static short field745 = 320;

    @ObfuscatedName("client.tg")
    public static short field643 = 1;

    @ObfuscatedName("client.to")
    public static short field747 = 32767;

    @ObfuscatedName("client.tm")
    public static short field712 = 1;

    @ObfuscatedName("client.tu")
    public static short field749 = 32767;

    @ObfuscatedName("client.ts")
    public static int field750 = 0;

    @ObfuscatedName("client.tv")
    public static int field751 = 0;

    @ObfuscatedName("client.tn")
    public static int field752 = 0;

    @ObfuscatedName("client.tw")
    public static int field753 = 0;

    @ObfuscatedName("client.ty")
    public static int field597 = 0;

    @ObfuscatedName("client.tk")
    public static class260 field529 = new class260();

    @ObfuscatedName("client.tr")
    public static int field756 = -1;

    @ObfuscatedName("client.tl")
    public static int field757 = -1;

    @ObfuscatedName("client.ti")
    public static class372 field758 = new class370();

    @ObfuscatedName("client.tb")
    public static class299[] field591 = new class299[8];

    @ObfuscatedName("client.ta")
    public static class60 field760 = new class60();

    @ObfuscatedName("client.uv")
    public static int field761 = -1;

    @ObfuscatedName("client.uu")
    public static ArrayList field762 = new ArrayList(10);

    @ObfuscatedName("client.un")
    public static int field763 = 0;

    @ObfuscatedName("client.uw")
    public static int field764 = 0;

    @ObfuscatedName("client.uc")
    public static final class59 field766 = new class59();

    @ObfuscatedName("client.uo")
    public static int[] field515 = new int[50];

    @ObfuscatedName("client.uq")
    public static int[] field768 = new int[50];

    @ObfuscatedName("ey.ew(B)Lno;")
    public static class374 method2566() {
        return Statics.field858;
    }

    @ObfuscatedName("client.au(I)V")
    public final void method465() {
    }

    public final void init() {
        if (!this.method446()) {
            return;
        }
        for (int var1 = 0; var1 <= 22; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field538 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class92.field1219)) {
                            field682 = true;
                        } else {
                            field682 = false;
                        }
                        break;
                    case 4:
                        if (field524 == -1) {
                            field524 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field482 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var3 = Integer.parseInt(var2);
                        class305 var4;
                        if (var3 >= 0 && var3 < class305.field3798.length) {
                            var4 = class305.field3798[var3];
                        } else {
                            var4 = null;
                        }
                        Statics.field3879 = var4;
                        break;
                    case 7:
                        Statics.field2032 = class278.method2381(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class92.field1219)) {
                        }
                        break;
                    case 9:
                        Statics.field2105 = var2;
                        break;
                    case 10:
                        Statics.field84 = (class279) class304.method4518(class279.method5747(), Integer.parseInt(var2));
                        if (Statics.field84 == class279.field3306) {
                            Statics.field310 = class382.field4206;
                        } else {
                            Statics.field310 = class382.field4200;
                        }
                        break;
                    case 11:
                        Statics.field85 = var2;
                        break;
                    case 12:
                        field654 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field146 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field483 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field3916 = var2;
                        break;
                    case 21:
                        field486 = Integer.parseInt(var2);
                        break;
                    case 22:
                        field539 = Integer.parseInt(var2) != 0;
                }
            }
        }
        class213.field2427 = false;
        field572 = false;
        Statics.field3319 = this.getCodeBase().getHost();
        String var5 = Statics.field2032.field3297;
        byte var6 = 0;
        try {
            Statics.field1550 = 21;
            Statics.field4265 = var6;
            try {
                Statics.field301 = System.getProperty("os.name");
            } catch (Exception var67) {
                Statics.field301 = "Unknown";
            }
            Statics.field1523 = Statics.field301.toLowerCase();
            try {
                Statics.field1001 = System.getProperty("user.home");
                if (Statics.field1001 != null) {
                    Statics.field1001 = Statics.field1001 + "/";
                }
            } catch (Exception var66) {
            }
            try {
                if (Statics.field1523.startsWith("win")) {
                    if (Statics.field1001 == null) {
                        Statics.field1001 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1001 == null) {
                    Statics.field1001 = System.getenv("HOME");
                }
                if (Statics.field1001 != null) {
                    Statics.field1001 = Statics.field1001 + "/";
                }
            } catch (Exception var65) {
            }
            if (Statics.field1001 == null) {
                Statics.field1001 = "~/";
            }
            Statics.field1261 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1001, "/tmp/", "" };
            Statics.field964 = new String[] { ".jagex_cache_" + Statics.field4265, ".file_store_" + Statics.field4265 };
            int var10 = 0;
            label306: while (var10 < 4) {
                String var11 = var10 == 0 ? "" : "" + var10;
                Statics.field3749 = new File(Statics.field1001, "jagex_cl_oldschool_" + var5 + var11 + ".dat");
                String var12 = null;
                String var13 = null;
                boolean var14 = false;
                if (Statics.field3749.exists()) {
                    try {
                        class384 var15 = new class384(Statics.field3749, "rw", 10000L);
                        class400 var16 = new class400((int) var15.method6058());
                        while (var16.field4272 < var16.field4271.length) {
                            int var17 = var15.method6059(var16.field4271, var16.field4272, var16.field4271.length - var16.field4272);
                            if (var17 == -1) {
                                throw new IOException();
                            }
                            var16.field4272 += var17;
                        }
                        var16.field4272 = 0;
                        int var18 = var16.method6217();
                        if (var18 < 1 || var18 > 3) {
                            throw new IOException("" + var18);
                        }
                        int var19 = 0;
                        if (var18 > 1) {
                            var19 = var16.method6217();
                        }
                        if (var18 <= 2) {
                            var12 = var16.method6390();
                            if (var19 == 1) {
                                var13 = var16.method6390();
                            }
                        } else {
                            var12 = var16.method6334();
                            if (var19 == 1) {
                                var13 = var16.method6334();
                            }
                        }
                        var15.method6070();
                    } catch (IOException var69) {
                        var69.printStackTrace();
                    }
                    if (var12 != null) {
                        File var21 = new File(var12);
                        if (!var21.exists()) {
                            var12 = null;
                        }
                    }
                    if (var12 != null) {
                        File var22 = new File(var12, "test.dat");
                        boolean var25;
                        try {
                            RandomAccessFile var23 = new RandomAccessFile(var22, "rw");
                            int var24 = var23.read();
                            var23.seek(0L);
                            var23.write(var24);
                            var23.seek(0L);
                            var23.close();
                            var22.delete();
                            var25 = true;
                        } catch (Exception var64) {
                            var25 = false;
                        }
                        if (!var25) {
                            var12 = null;
                        }
                    }
                }
                if (var12 == null && var10 == 0) {
                    label281: for (int var27 = 0; var27 < Statics.field964.length; var27++) {
                        for (int var28 = 0; var28 < Statics.field1261.length; var28++) {
                            File var29 = new File(Statics.field1261[var28] + Statics.field964[var27] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var29.exists()) {
                                File var30 = new File(var29, "test.dat");
                                boolean var33;
                                try {
                                    RandomAccessFile var31 = new RandomAccessFile(var30, "rw");
                                    int var32 = var31.read();
                                    var31.seek(0L);
                                    var31.write(var32);
                                    var31.seek(0L);
                                    var31.close();
                                    var30.delete();
                                    var33 = true;
                                } catch (Exception var63) {
                                    var33 = false;
                                }
                                if (var33) {
                                    var12 = var29.toString();
                                    var14 = true;
                                    break label281;
                                }
                            }
                        }
                    }
                }
                if (var12 == null) {
                    var12 = Statics.field1001 + File.separatorChar + "jagexcache" + var11 + File.separatorChar + "oldschool" + File.separatorChar + var5 + File.separatorChar;
                    var14 = true;
                }
                if (var13 != null) {
                    File var35 = new File(var13);
                    File var36 = new File(var12);
                    try {
                        File[] var37 = var35.listFiles();
                        File[] var38 = var37;
                        for (int var39 = 0; var39 < var38.length; var39++) {
                            File var40 = var38[var39];
                            File var41 = new File(var36, var40.getName());
                            boolean var42 = var40.renameTo(var41);
                            if (!var42) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var68) {
                        var68.printStackTrace();
                    }
                    var14 = true;
                }
                if (var14) {
                    File var44 = new File(var12);
                    Object var45 = null;
                    try {
                        class384 var46 = new class384(Statics.field3749, "rw", 10000L);
                        class400 var47 = new class400(500);
                        var47.method6200(3);
                        var47.method6200(var45 == null ? 0 : 1);
                        var47.method6209(var44.getPath());
                        if (var45 != null) {
                            var47.method6209(((File) var45).getPath());
                        }
                        var46.method6055(var47.field4271, 0, var47.field4272);
                        var46.method6070();
                    } catch (IOException var62) {
                        var62.printStackTrace();
                    }
                }
                File var49 = new File(var12);
                Statics.field1549 = var49;
                if (!Statics.field1549.exists()) {
                    Statics.field1549.mkdirs();
                }
                File[] var50 = Statics.field1549.listFiles();
                if (var50 != null) {
                    File[] var51 = var50;
                    for (int var52 = 0; var52 < var51.length; var52++) {
                        File var53 = var51[var52];
                        boolean var56;
                        try {
                            RandomAccessFile var54 = new RandomAccessFile(var53, "rw");
                            int var55 = var54.read();
                            var54.seek(0L);
                            var54.write(var55);
                            var54.seek(0L);
                            var54.close();
                            var56 = true;
                        } catch (Exception var61) {
                            var56 = false;
                        }
                        if (!var56) {
                            var10++;
                            continue label306;
                        }
                    }
                }
                break;
            }
            File var58 = Statics.field1549;
            Statics.field1561 = var58;
            if (!Statics.field1561.exists()) {
                throw new RuntimeException("");
            }
            class146.field1566 = true;
            class144.method5482();
            class144.field1551 = new class385(new class384(class146.method2111("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class144.field1554 = new class385(new class384(class146.method2111("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1555 = new class385[Statics.field1550];
            for (int var59 = 0; var59 < Statics.field1550; var59++) {
                Statics.field1555[var59] = new class385(new class384(class146.method2111("main_file_cache.idx" + var59), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var70) {
            class424.method21((String) null, var70);
        }
        Statics.field3681 = this;
        Statics.field4417 = field524;
        if (field488 == -1) {
            field488 = 0;
        }
        Statics.field521 = System.getenv("JX_ACCESS_TOKEN");
        System.getenv("JX_REFRESH_TOKEN");
        this.method470(765, 503, 199);
    }

    @ObfuscatedName("client.ey(I)Z")
    public boolean method1066() {
        return Statics.field521 != null && !Statics.field521.trim().isEmpty();
    }

    @ObfuscatedName("client.ea(Ljava/lang/String;I)V")
    public void method1378(String arg0) throws MalformedURLException, IOException {
        class11 var2 = new class11(new URL(Statics.field85 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"), class10.field35);
        var2.method99("Authorization", "Bearer " + arg0);
        this.field557 = this.field523.method181(var2);
    }

    @ObfuscatedName("client.w(B)V")
    public final void method551() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field3873 = null;
            Statics.field1240 = null;
            Statics.field3867 = (byte[][][]) null;
        } else {
            Statics.field3873 = var1;
            Statics.field1240 = new int[var1.length];
            Statics.field3867 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field3873.length; var3++) {
                Statics.field3867[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field3296 = field483 == 0 ? 43594 : field654 + 40000;
        Statics.field2198 = field483 == 0 ? 443 : field654 + 50000;
        Statics.field1187 = Statics.field3296;
        Statics.field3949 = class261.field3031;
        Statics.field55 = class261.field3025;
        Statics.field168 = class261.field3027;
        Statics.field1331 = class261.field3028;
        Statics.field3193 = new class100();
        this.method439();
        this.method509();
        Statics.field1512 = this.method547();
        Statics.field472 = new class347(255, class144.field1551, class144.field1554, 500000);
        Statics.field1779 = class89.method1763();
        this.method489();
        String var5 = Statics.field289;
        class30.field176 = this;
        if (var5 != null) {
            class30.field173 = var5;
        }
        if (field483 != 0) {
            field499 = true;
        }
        method1011(Statics.field1779.field1191);
        Statics.field100 = new class62(Statics.field310);
        this.field523 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.i(I)V")
    public final void method456() {
        field744++;
        this.method1069();
        while (true) {
            class309 var1 = class287.field3675;
            class286 var2;
            synchronized (class287.field3675) {
                var2 = (class286) class287.field3682.method4957();
            }
            if (var2 == null) {
                class248.method3464();
                method16();
                class24 var4 = class24.field120;
                synchronized (class24.field120) {
                    class24.field139++;
                    class24.field136 = class24.field138;
                    class24.field115 = 0;
                    class24.field133 = 0;
                    Arrays.fill(class24.field125, false);
                    Arrays.fill(class24.field126, false);
                    if (class24.field129 < 0) {
                        Arrays.fill(class24.field123, false);
                        class24.field129 = class24.field144;
                    } else {
                        while (class24.field144 != class24.field129) {
                            int var5 = class24.field127[class24.field144];
                            class24.field144 = class24.field144 + 1 & 0x7F;
                            if (var5 < 0) {
                                int var6 = ~var5;
                                if (class24.field123[var6]) {
                                    class24.field123[var6] = false;
                                    class24.field126[var6] = true;
                                    class24.field140[class24.field133] = var6;
                                    class24.field133++;
                                }
                            } else {
                                if (!class24.field123[var5] && class24.field115 < class24.field132.length - 1) {
                                    class24.field125[var5] = true;
                                    class24.field132[++class24.field115 - 1] = var5;
                                }
                                class24.field123[var5] = true;
                            }
                        }
                    }
                    if (class24.field115 > 0) {
                        class24.field139 = 0;
                    }
                    class24.field138 = class24.field137;
                }
                class33 var8 = class33.field222;
                synchronized (class33.field222) {
                    class33.field239 = class33.field226;
                    class33.field221 = class33.field225;
                    class33.field230 = class33.field237;
                    class33.field231 = class33.field227;
                    class33.field236 = class33.field232;
                    class33.field241 = class33.field233;
                    class33.field238 = class33.field234;
                    class33.field228 = class33.field220;
                    class33.field232 = 0;
                }
                if (Statics.field1512 != null) {
                    int var10 = Statics.field1512.method325();
                    field691 = var10;
                }
                if (field490 == 0) {
                    method5986();
                    Statics.field1419.method2502();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field194[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field195[var12] = 0L;
                    }
                    Statics.field186 = 0;
                } else if (field490 == 5) {
                    class69.method361(this, Statics.field1480);
                    method5986();
                    Statics.field1419.method2502();
                    for (int var13 = 0; var13 < 32; var13++) {
                        field194[var13] = 0L;
                    }
                    for (int var14 = 0; var14 < 32; var14++) {
                        field195[var14] = 0L;
                    }
                    Statics.field186 = 0;
                } else if (field490 == 10 || field490 == 11) {
                    class69.method361(this, Statics.field1480);
                } else if (field490 == 20) {
                    class69.method361(this, Statics.field1480);
                    this.method1473();
                } else if (field490 == 25) {
                    method2104(false);
                    field640 = 0;
                    boolean var15 = true;
                    for (int var16 = 0; var16 < Statics.field1993.length; var16++) {
                        if (Statics.field3195[var16] != -1 && Statics.field1993[var16] == null) {
                            Statics.field1993[var16] = Statics.field1871.method4710(Statics.field3195[var16], 0);
                            if (Statics.field1993[var16] == null) {
                                var15 = false;
                                field640++;
                            }
                        }
                        if (Statics.field1346[var16] != -1 && Statics.field86[var16] == null) {
                            Statics.field86[var16] = Statics.field1871.method4711(Statics.field1346[var16], 0, Statics.field2881[var16]);
                            if (Statics.field86[var16] == null) {
                                var15 = false;
                                field640++;
                            }
                        }
                    }
                    if (var15) {
                        field642 = 0;
                        boolean var17 = true;
                        for (int var18 = 0; var18 < Statics.field1993.length; var18++) {
                            byte[] var19 = Statics.field86[var18];
                            if (var19 != null) {
                                int var20 = (Statics.field1186[var18] >> 8) * 64 - Statics.field1942;
                                int var21 = (Statics.field1186[var18] & 0xFF) * 64 - Statics.field3866;
                                if (field481) {
                                    var20 = 10;
                                    var21 = 10;
                                }
                                var17 &= class75.method17(var19, var20, var21);
                            }
                        }
                        if (var17) {
                            if (field546 != 0) {
                                method3451(class283.field3342 + class92.field1215 + class92.field1224 + 100 + "%" + class92.field1218, true);
                            }
                            method16();
                            Statics.field1964.method3787();
                            for (int var22 = 0; var22 < 4; var22++) {
                                field695[var22].method3106();
                            }
                            for (int var23 = 0; var23 < 4; var23++) {
                                for (int var24 = 0; var24 < 104; var24++) {
                                    for (int var25 = 0; var25 < 104; var25++) {
                                        class75.field977[var23][var24][var25] = 0;
                                    }
                                }
                            }
                            method16();
                            class75.field982 = 99;
                            Statics.field14 = new byte[4][104][104];
                            Statics.field975 = new byte[4][104][104];
                            Statics.field979 = new byte[4][104][104];
                            Statics.field978 = new byte[4][104][104];
                            Statics.field1368 = new int[4][105][105];
                            Statics.field1770 = new byte[4][105][105];
                            Statics.field170 = new int[105][105];
                            Statics.field3216 = new int[104];
                            Statics.field2160 = new int[104];
                            Statics.field987 = new int[104];
                            Statics.field980 = new int[104];
                            Statics.field4411 = new int[104];
                            int var26 = Statics.field1993.length;
                            for (class63 var27 = (class63) class63.field797.method4962(); var27 != null; var27 = (class63) class63.field797.method4985()) {
                                if (var27.field811 != null) {
                                    Statics.field2965.method608(var27.field811);
                                    var27.field811 = null;
                                }
                                if (var27.field810 != null) {
                                    Statics.field2965.method608(var27.field810);
                                    var27.field810 = null;
                                }
                            }
                            class63.field797.method4958();
                            method2104(true);
                            if (!field481) {
                                int var28 = 0;
                                label1177: while (true) {
                                    if (var28 >= var26) {
                                        for (int var42 = 0; var42 < var26; var42++) {
                                            int var43 = (Statics.field1186[var42] >> 8) * 64 - Statics.field1942;
                                            int var44 = (Statics.field1186[var42] & 0xFF) * 64 - Statics.field3866;
                                            byte[] var45 = Statics.field1993[var42];
                                            if (var45 == null && Statics.field27 < 800) {
                                                method16();
                                                class75.method4636(var43, var44, 64, 64);
                                            }
                                        }
                                        method2104(true);
                                        int var46 = 0;
                                        while (true) {
                                            if (var46 >= var26) {
                                                break label1177;
                                            }
                                            byte[] var47 = Statics.field86[var46];
                                            if (var47 != null) {
                                                int var48 = (Statics.field1186[var46] >> 8) * 64 - Statics.field1942;
                                                int var49 = (Statics.field1186[var46] & 0xFF) * 64 - Statics.field3866;
                                                method16();
                                                Statics.method175(var47, var48, var49, Statics.field1964, field695);
                                            }
                                            var46++;
                                        }
                                    }
                                    int var29 = (Statics.field1186[var28] >> 8) * 64 - Statics.field1942;
                                    int var30 = (Statics.field1186[var28] & 0xFF) * 64 - Statics.field3866;
                                    byte[] var31 = Statics.field1993[var28];
                                    if (var31 != null) {
                                        method16();
                                        int var32 = Statics.field3892 * 8 - 48;
                                        int var33 = Statics.field27 * 8 - 48;
                                        class173[] var34 = field695;
                                        int var35 = 0;
                                        label1174: while (true) {
                                            if (var35 >= 4) {
                                                class400 var38 = new class400(var31);
                                                int var39 = 0;
                                                while (true) {
                                                    if (var39 >= 4) {
                                                        break label1174;
                                                    }
                                                    for (int var40 = 0; var40 < 64; var40++) {
                                                        for (int var41 = 0; var41 < 64; var41++) {
                                                            class75.method2841(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                                                        }
                                                    }
                                                    var39++;
                                                }
                                            }
                                            for (int var36 = 0; var36 < 64; var36++) {
                                                for (int var37 = 0; var37 < 64; var37++) {
                                                    if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                                        var34[var35].field1969[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                    var28++;
                                }
                            }
                            if (field481) {
                                int var50 = 0;
                                label1123: while (true) {
                                    if (var50 >= 4) {
                                        for (int var68 = 0; var68 < 13; var68++) {
                                            for (int var69 = 0; var69 < 13; var69++) {
                                                int var70 = field549[0][var68][var69];
                                                if (var70 == -1) {
                                                    class75.method4636(var68 * 8, var69 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2104(true);
                                        int var71 = 0;
                                        while (true) {
                                            if (var71 >= 4) {
                                                break label1123;
                                            }
                                            method16();
                                            for (int var72 = 0; var72 < 13; var72++) {
                                                label1046: for (int var73 = 0; var73 < 13; var73++) {
                                                    int var74 = field549[var71][var72][var73];
                                                    if (var74 != -1) {
                                                        int var75 = var74 >> 24 & 0x3;
                                                        int var76 = var74 >> 1 & 0x3;
                                                        int var77 = var74 >> 14 & 0x3FF;
                                                        int var78 = var74 >> 3 & 0x7FF;
                                                        int var79 = (var77 / 8 << 8) + var78 / 8;
                                                        for (int var80 = 0; var80 < Statics.field1186.length; var80++) {
                                                            if (Statics.field1186[var80] == var79 && Statics.field86[var80] != null) {
                                                                byte[] var81 = Statics.field86[var80];
                                                                int var82 = var72 * 8;
                                                                int var83 = var73 * 8;
                                                                int var84 = (var77 & 0x7) * 8;
                                                                int var85 = (var78 & 0x7) * 8;
                                                                class213 var86 = Statics.field1964;
                                                                class173[] var87 = field695;
                                                                class400 var88 = new class400(var81);
                                                                int var89 = -1;
                                                                while (true) {
                                                                    int var90 = var88.method6411();
                                                                    if (var90 == 0) {
                                                                        continue label1046;
                                                                    }
                                                                    var89 += var90;
                                                                    int var91 = 0;
                                                                    while (true) {
                                                                        int var92 = var88.method6231();
                                                                        if (var92 == 0) {
                                                                            break;
                                                                        }
                                                                        var91 += var92 - 1;
                                                                        int var93 = var91 & 0x3F;
                                                                        int var94 = var91 >> 6 & 0x3F;
                                                                        int var95 = var91 >> 12;
                                                                        int var96 = var88.method6217();
                                                                        int var97 = var96 >> 2;
                                                                        int var98 = var96 & 0x3;
                                                                        if (var75 == var95 && var94 >= var84 && var94 < var84 + 8 && var93 >= var85 && var93 < var85 + 8) {
                                                                            class169 var99 = class169.method2878(var89);
                                                                            int var101 = var94 & 0x7;
                                                                            int var102 = var93 & 0x7;
                                                                            int var104 = var99.field1835;
                                                                            int var105 = var99.field1836;
                                                                            if ((var98 & 0x1) == 1) {
                                                                                int var106 = var104;
                                                                                var104 = var105;
                                                                                var105 = var106;
                                                                            }
                                                                            int var107 = var76 & 0x3;
                                                                            int var108;
                                                                            if (var107 == 0) {
                                                                                var108 = var101;
                                                                            } else if (var107 == 1) {
                                                                                var108 = var102;
                                                                            } else if (var107 == 2) {
                                                                                var108 = 7 - var101 - (var104 - 1);
                                                                            } else {
                                                                                var108 = 7 - var102 - (var105 - 1);
                                                                            }
                                                                            int var109 = var82 + var108;
                                                                            int var111 = var94 & 0x7;
                                                                            int var112 = var93 & 0x7;
                                                                            int var114 = var99.field1835;
                                                                            int var115 = var99.field1836;
                                                                            if ((var98 & 0x1) == 1) {
                                                                                int var116 = var114;
                                                                                var114 = var115;
                                                                                var115 = var116;
                                                                            }
                                                                            int var117 = var76 & 0x3;
                                                                            int var118;
                                                                            if (var117 == 0) {
                                                                                var118 = var112;
                                                                            } else if (var117 == 1) {
                                                                                var118 = 7 - var111 - (var114 - 1);
                                                                            } else if (var117 == 2) {
                                                                                var118 = 7 - var112 - (var115 - 1);
                                                                            } else {
                                                                                var118 = var111;
                                                                            }
                                                                            int var119 = var83 + var118;
                                                                            if (var109 > 0 && var119 > 0 && var109 < 103 && var119 < 103) {
                                                                                int var120 = var71;
                                                                                if ((class75.field977[1][var109][var119] & 0x2) == 2) {
                                                                                    var120 = var71 - 1;
                                                                                }
                                                                                class173 var121 = null;
                                                                                if (var120 >= 0) {
                                                                                    var121 = var87[var120];
                                                                                }
                                                                                class75.method2501(var71, var109, var119, var89, var76 + var98 & 0x3, var97, var86, var121);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var71++;
                                        }
                                    }
                                    method16();
                                    for (int var51 = 0; var51 < 13; var51++) {
                                        for (int var52 = 0; var52 < 13; var52++) {
                                            boolean var53 = false;
                                            int var54 = field549[var50][var51][var52];
                                            if (var54 != -1) {
                                                int var55 = var54 >> 24 & 0x3;
                                                int var56 = var54 >> 1 & 0x3;
                                                int var57 = var54 >> 14 & 0x3FF;
                                                int var58 = var54 >> 3 & 0x7FF;
                                                int var59 = (var57 / 8 << 8) + var58 / 8;
                                                for (int var60 = 0; var60 < Statics.field1186.length; var60++) {
                                                    if (Statics.field1186[var60] == var59 && Statics.field1993[var60] != null) {
                                                        Statics.method2469(Statics.field1993[var60], var50, var51 * 8, var52 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, field695);
                                                        var53 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var53) {
                                                int var61 = var50;
                                                int var62 = var51 * 8;
                                                int var63 = var52 * 8;
                                                for (int var64 = 0; var64 < 8; var64++) {
                                                    for (int var65 = 0; var65 < 8; var65++) {
                                                        class75.field976[var61][var62 + var64][var63 + var65] = 0;
                                                    }
                                                }
                                                if (var62 > 0) {
                                                    for (int var66 = 1; var66 < 8; var66++) {
                                                        class75.field976[var61][var62][var63 + var66] = class75.field976[var61][var62 - 1][var63 + var66];
                                                    }
                                                }
                                                if (var63 > 0) {
                                                    for (int var67 = 1; var67 < 8; var67++) {
                                                        class75.field976[var61][var62 + var67][var63] = class75.field976[var61][var62 + var67][var63 - 1];
                                                    }
                                                }
                                                if (var62 > 0 && class75.field976[var61][var62 - 1][var63] != 0) {
                                                    class75.field976[var61][var62][var63] = class75.field976[var61][var62 - 1][var63];
                                                } else if (var63 > 0 && class75.field976[var61][var62][var63 - 1] != 0) {
                                                    class75.field976[var61][var62][var63] = class75.field976[var61][var62][var63 - 1];
                                                } else if (var62 > 0 && var63 > 0 && class75.field976[var61][var62 - 1][var63 - 1] != 0) {
                                                    class75.field976[var61][var62][var63] = class75.field976[var61][var62 - 1][var63 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var50++;
                                }
                            }
                            method2104(true);
                            method16();
                            class213 var122 = Statics.field1964;
                            class173[] var123 = field695;
                            for (int var124 = 0; var124 < 4; var124++) {
                                for (int var125 = 0; var125 < 104; var125++) {
                                    for (int var126 = 0; var126 < 104; var126++) {
                                        if ((class75.field977[var124][var125][var126] & 0x1) == 1) {
                                            int var127 = var124;
                                            if ((class75.field977[1][var125][var126] & 0x2) == 2) {
                                                var127 = var124 - 1;
                                            }
                                            if (var127 >= 0) {
                                                var123[var127].method3080(var125, var126);
                                            }
                                        }
                                    }
                                }
                            }
                            class75.field988 += (int) (Math.random() * 5.0D) - 2;
                            if (class75.field988 < -8) {
                                class75.field988 = -8;
                            }
                            if (class75.field988 > 8) {
                                class75.field988 = 8;
                            }
                            class75.field989 += (int) (Math.random() * 5.0D) - 2;
                            if (class75.field989 < -16) {
                                class75.field989 = -16;
                            }
                            if (class75.field989 > 16) {
                                class75.field989 = 16;
                            }
                            for (int var128 = 0; var128 < 4; var128++) {
                                byte[][] var129 = Statics.field1770[var128];
                                int var130 = (int) Math.sqrt(5100.0D);
                                int var131 = var130 * 768 >> 8;
                                for (int var132 = 1; var132 < 103; var132++) {
                                    for (int var133 = 1; var133 < 103; var133++) {
                                        int var134 = class75.field976[var128][var133 + 1][var132] - class75.field976[var128][var133 - 1][var132];
                                        int var135 = class75.field976[var128][var133][var132 + 1] - class75.field976[var128][var133][var132 - 1];
                                        int var136 = (int) Math.sqrt((double) (var135 * var135 + var134 * var134 + 65536));
                                        int var137 = (var134 << 8) / var136;
                                        int var138 = 65536 / var136;
                                        int var139 = (var135 << 8) / var136;
                                        int var140 = (var139 * -50 + var137 * -50 + var138 * -10) / var131 + 96;
                                        int var141 = (var129[var133][var132] >> 1) + (var129[var133][var132 + 1] >> 3) + (var129[var133][var132 - 1] >> 2) + (var129[var133 - 1][var132] >> 2) + (var129[var133 + 1][var132] >> 3);
                                        Statics.field170[var133][var132] = var140 - var141;
                                    }
                                }
                                for (int var142 = 0; var142 < 104; var142++) {
                                    Statics.field3216[var142] = 0;
                                    Statics.field2160[var142] = 0;
                                    Statics.field987[var142] = 0;
                                    Statics.field980[var142] = 0;
                                    Statics.field4411[var142] = 0;
                                }
                                for (int var143 = -5; var143 < 109; var143++) {
                                    for (int var144 = 0; var144 < 104; var144++) {
                                        int var145 = var143 + 5;
                                        int var10002;
                                        if (var145 >= 0 && var145 < 104) {
                                            int var146 = Statics.field14[var128][var145][var144] & 0xFF;
                                            if (var146 > 0) {
                                                class164 var147 = class164.method2526(var146 - 1);
                                                Statics.field3216[var144] += var147.field1772;
                                                Statics.field2160[var144] += var147.field1773;
                                                Statics.field987[var144] += var147.field1774;
                                                Statics.field980[var144] += var147.field1775;
                                                var10002 = Statics.field4411[var144]++;
                                            }
                                        }
                                        int var148 = var143 - 5;
                                        if (var148 >= 0 && var148 < 104) {
                                            int var149 = Statics.field14[var128][var148][var144] & 0xFF;
                                            if (var149 > 0) {
                                                class164 var150 = class164.method2526(var149 - 1);
                                                Statics.field3216[var144] -= var150.field1772;
                                                Statics.field2160[var144] -= var150.field1773;
                                                Statics.field987[var144] -= var150.field1774;
                                                Statics.field980[var144] -= var150.field1775;
                                                var10002 = Statics.field4411[var144]--;
                                            }
                                        }
                                    }
                                    if (var143 >= 1 && var143 < 103) {
                                        int var151 = 0;
                                        int var152 = 0;
                                        int var153 = 0;
                                        int var154 = 0;
                                        int var155 = 0;
                                        for (int var156 = -5; var156 < 109; var156++) {
                                            int var157 = var156 + 5;
                                            if (var157 >= 0 && var157 < 104) {
                                                var151 += Statics.field3216[var157];
                                                var152 += Statics.field2160[var157];
                                                var153 += Statics.field987[var157];
                                                var154 += Statics.field980[var157];
                                                var155 += Statics.field4411[var157];
                                            }
                                            int var158 = var156 - 5;
                                            if (var158 >= 0 && var158 < 104) {
                                                var151 -= Statics.field3216[var158];
                                                var152 -= Statics.field2160[var158];
                                                var153 -= Statics.field987[var158];
                                                var154 -= Statics.field980[var158];
                                                var155 -= Statics.field4411[var158];
                                            }
                                            if (var156 >= 1 && var156 < 103 && (!field572 || (class75.field977[0][var143][var156] & 0x2) != 0 || (class75.field977[var128][var143][var156] & 0x10) == 0)) {
                                                if (var128 < class75.field982) {
                                                    class75.field982 = var128;
                                                }
                                                int var159 = Statics.field14[var128][var143][var156] & 0xFF;
                                                int var160 = Statics.field975[var128][var143][var156] & 0xFF;
                                                if (var159 > 0 || var160 > 0) {
                                                    int var161 = class75.field976[var128][var143][var156];
                                                    int var162 = class75.field976[var128][var143 + 1][var156];
                                                    int var163 = class75.field976[var128][var143 + 1][var156 + 1];
                                                    int var164 = class75.field976[var128][var143][var156 + 1];
                                                    int var165 = Statics.field170[var143][var156];
                                                    int var166 = Statics.field170[var143 + 1][var156];
                                                    int var167 = Statics.field170[var143 + 1][var156 + 1];
                                                    int var168 = Statics.field170[var143][var156 + 1];
                                                    int var169 = -1;
                                                    int var170 = -1;
                                                    if (var159 > 0) {
                                                        int var171 = var151 * 256 / var154;
                                                        int var172 = var152 / var155;
                                                        int var173 = var153 / var155;
                                                        var169 = class75.method5768(var171, var172, var173);
                                                        int var174 = class75.field988 + var171 & 0xFF;
                                                        int var175 = class75.field989 + var173;
                                                        if (var175 < 0) {
                                                            var175 = 0;
                                                        } else if (var175 > 255) {
                                                            var175 = 255;
                                                        }
                                                        var170 = class75.method5768(var174, var172, var175);
                                                    }
                                                    if (var128 > 0) {
                                                        boolean var176 = true;
                                                        if (var159 == 0 && Statics.field979[var128][var143][var156] != 0) {
                                                            var176 = false;
                                                        }
                                                        if (var160 > 0) {
                                                            int var177 = var160 - 1;
                                                            class171 var178 = (class171) class171.field1940.method4167((long) var177);
                                                            class171 var179;
                                                            if (var178 == null) {
                                                                byte[] var180 = Statics.field1939.method4710(4, var177);
                                                                class171 var181 = new class171();
                                                                if (var180 != null) {
                                                                    var181.method3019(new class400(var180), var177);
                                                                }
                                                                var181.method3018();
                                                                class171.field1940.method4169(var181, (long) var177);
                                                                var179 = var181;
                                                            } else {
                                                                var179 = var178;
                                                            }
                                                            if (!var179.field1934) {
                                                                var176 = false;
                                                            }
                                                        }
                                                        if (var176 && var161 == var162 && var161 == var163 && var161 == var164) {
                                                            Statics.field1368[var128][var143][var156] |= 0x924;
                                                        }
                                                    }
                                                    int var182 = 0;
                                                    if (var170 != -1) {
                                                        var182 = class211.field2351[class75.method3545(var170, 96)];
                                                    }
                                                    if (var160 == 0) {
                                                        var122.method3888(var128, var143, var156, 0, 0, -1, var161, var162, var163, var164, class75.method3545(var169, var165), class75.method3545(var169, var166), class75.method3545(var169, var167), class75.method3545(var169, var168), 0, 0, 0, 0, var182, 0);
                                                    } else {
                                                        int var183 = Statics.field979[var128][var143][var156] + 1;
                                                        byte var184 = Statics.field978[var128][var143][var156];
                                                        int var185 = var160 - 1;
                                                        class171 var186 = (class171) class171.field1940.method4167((long) var185);
                                                        class171 var187;
                                                        if (var186 == null) {
                                                            byte[] var188 = Statics.field1939.method4710(4, var185);
                                                            class171 var189 = new class171();
                                                            if (var188 != null) {
                                                                var189.method3019(new class400(var188), var185);
                                                            }
                                                            var189.method3018();
                                                            class171.field1940.method4169(var189, (long) var185);
                                                            var187 = var189;
                                                        } else {
                                                            var187 = var186;
                                                        }
                                                        int var191 = var187.field1933;
                                                        int var192;
                                                        int var193;
                                                        if (var191 >= 0) {
                                                            var192 = Statics.field2331.method3991(var191);
                                                            var193 = -1;
                                                        } else if (var187.field1943 == 16711935) {
                                                            var193 = -2;
                                                            var191 = -1;
                                                            var192 = -2;
                                                        } else {
                                                            var193 = class75.method5768(var187.field1936, var187.field1931, var187.field1938);
                                                            int var194 = class75.field988 + var187.field1936 & 0xFF;
                                                            int var195 = class75.field989 + var187.field1938;
                                                            if (var195 < 0) {
                                                                var195 = 0;
                                                            } else if (var195 > 255) {
                                                                var195 = 255;
                                                            }
                                                            var192 = class75.method5768(var194, var187.field1931, var195);
                                                        }
                                                        int var196 = 0;
                                                        if (var192 != -2) {
                                                            var196 = class211.field2351[class75.method4936(var192, 96)];
                                                        }
                                                        if (var187.field1935 != -1) {
                                                            int var197 = class75.field988 + var187.field1932 & 0xFF;
                                                            int var198 = class75.field989 + var187.field1941;
                                                            if (var198 < 0) {
                                                                var198 = 0;
                                                            } else if (var198 > 255) {
                                                                var198 = 255;
                                                            }
                                                            int var199 = class75.method5768(var197, var187.field1937, var198);
                                                            var196 = class211.field2351[class75.method4936(var199, 96)];
                                                        }
                                                        var122.method3888(var128, var143, var156, var183, var184, var191, var161, var162, var163, var164, class75.method3545(var169, var165), class75.method3545(var169, var166), class75.method3545(var169, var167), class75.method3545(var169, var168), class75.method4936(var193, var165), class75.method4936(var193, var166), class75.method4936(var193, var167), class75.method4936(var193, var168), var182, var196);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var200 = 1; var200 < 103; var200++) {
                                    for (int var201 = 1; var201 < 103; var201++) {
                                        var122.method3912(var128, var201, var200, class75.method1906(var128, var201, var200));
                                    }
                                }
                                Statics.field14[var128] = (byte[][]) null;
                                Statics.field975[var128] = (byte[][]) null;
                                Statics.field979[var128] = (byte[][]) null;
                                Statics.field978[var128] = (byte[][]) null;
                                Statics.field1770[var128] = (byte[][]) null;
                            }
                            var122.method3944(-50, -10, -50);
                            for (int var202 = 0; var202 < 104; var202++) {
                                for (int var203 = 0; var203 < 104; var203++) {
                                    if ((class75.field977[1][var202][var203] & 0x2) == 2) {
                                        var122.method3863(var202, var203);
                                    }
                                }
                            }
                            int var204 = 1;
                            int var205 = 2;
                            int var206 = 4;
                            for (int var207 = 0; var207 < 4; var207++) {
                                if (var207 > 0) {
                                    var204 <<= 0x3;
                                    var205 <<= 0x3;
                                    var206 <<= 0x3;
                                }
                                for (int var208 = 0; var208 <= var207; var208++) {
                                    for (int var209 = 0; var209 <= 104; var209++) {
                                        for (int var210 = 0; var210 <= 104; var210++) {
                                            if ((Statics.field1368[var208][var210][var209] & var204) != 0) {
                                                int var211 = var209;
                                                int var212 = var209;
                                                int var213 = var208;
                                                int var214 = var208;
                                                while (var211 > 0 && (Statics.field1368[var208][var210][var211 - 1] & var204) != 0) {
                                                    var211--;
                                                }
                                                while (var212 < 104 && (Statics.field1368[var208][var210][var212 + 1] & var204) != 0) {
                                                    var212++;
                                                }
                                                label772: while (var213 > 0) {
                                                    for (int var215 = var211; var215 <= var212; var215++) {
                                                        if ((Statics.field1368[var213 - 1][var210][var215] & var204) == 0) {
                                                            break label772;
                                                        }
                                                    }
                                                    var213--;
                                                }
                                                label761: while (var214 < var207) {
                                                    for (int var216 = var211; var216 <= var212; var216++) {
                                                        if ((Statics.field1368[var214 + 1][var210][var216] & var204) == 0) {
                                                            break label761;
                                                        }
                                                    }
                                                    var214++;
                                                }
                                                int var217 = (var214 + 1 - var213) * (var212 - var211 + 1);
                                                if (var217 >= 8) {
                                                    short var218 = 240;
                                                    int var219 = class75.field976[var214][var210][var211] - var218;
                                                    int var220 = class75.field976[var213][var210][var211];
                                                    class213.method3790(var207, 1, var210 * 128, var210 * 128, var211 * 128, var212 * 128 + 128, var219, var220);
                                                    for (int var221 = var213; var221 <= var214; var221++) {
                                                        for (int var222 = var211; var222 <= var212; var222++) {
                                                            Statics.field1368[var221][var210][var222] &= ~var204;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1368[var208][var210][var209] & var205) != 0) {
                                                int var223 = var210;
                                                int var224 = var210;
                                                int var225 = var208;
                                                int var226 = var208;
                                                while (var223 > 0 && (Statics.field1368[var208][var223 - 1][var209] & var205) != 0) {
                                                    var223--;
                                                }
                                                while (var224 < 104 && (Statics.field1368[var208][var224 + 1][var209] & var205) != 0) {
                                                    var224++;
                                                }
                                                label825: while (var225 > 0) {
                                                    for (int var227 = var223; var227 <= var224; var227++) {
                                                        if ((Statics.field1368[var225 - 1][var227][var209] & var205) == 0) {
                                                            break label825;
                                                        }
                                                    }
                                                    var225--;
                                                }
                                                label814: while (var226 < var207) {
                                                    for (int var228 = var223; var228 <= var224; var228++) {
                                                        if ((Statics.field1368[var226 + 1][var228][var209] & var205) == 0) {
                                                            break label814;
                                                        }
                                                    }
                                                    var226++;
                                                }
                                                int var229 = (var226 + 1 - var225) * (var224 - var223 + 1);
                                                if (var229 >= 8) {
                                                    short var230 = 240;
                                                    int var231 = class75.field976[var226][var223][var209] - var230;
                                                    int var232 = class75.field976[var225][var223][var209];
                                                    class213.method3790(var207, 2, var223 * 128, var224 * 128 + 128, var209 * 128, var209 * 128, var231, var232);
                                                    for (int var233 = var225; var233 <= var226; var233++) {
                                                        for (int var234 = var223; var234 <= var224; var234++) {
                                                            Statics.field1368[var233][var234][var209] &= ~var205;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1368[var208][var210][var209] & var206) != 0) {
                                                int var235 = var210;
                                                int var236 = var210;
                                                int var237 = var209;
                                                int var238 = var209;
                                                while (var237 > 0 && (Statics.field1368[var208][var210][var237 - 1] & var206) != 0) {
                                                    var237--;
                                                }
                                                while (var238 < 104 && (Statics.field1368[var208][var210][var238 + 1] & var206) != 0) {
                                                    var238++;
                                                }
                                                label878: while (var235 > 0) {
                                                    for (int var239 = var237; var239 <= var238; var239++) {
                                                        if ((Statics.field1368[var208][var235 - 1][var239] & var206) == 0) {
                                                            break label878;
                                                        }
                                                    }
                                                    var235--;
                                                }
                                                label867: while (var236 < 104) {
                                                    for (int var240 = var237; var240 <= var238; var240++) {
                                                        if ((Statics.field1368[var208][var236 + 1][var240] & var206) == 0) {
                                                            break label867;
                                                        }
                                                    }
                                                    var236++;
                                                }
                                                if ((var236 - var235 + 1) * (var238 - var237 + 1) >= 4) {
                                                    int var241 = class75.field976[var208][var235][var237];
                                                    class213.method3790(var207, 4, var235 * 128, var236 * 128 + 128, var237 * 128, var238 * 128 + 128, var241, var241);
                                                    for (int var242 = var235; var242 <= var236; var242++) {
                                                        for (int var243 = var237; var243 <= var238; var243++) {
                                                            Statics.field1368[var208][var242][var243] &= ~var206;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method2104(true);
                            int var244 = class75.field982;
                            if (var244 > Statics.field4237) {
                                var244 = Statics.field4237;
                            }
                            if (var244 < Statics.field4237 - 1) {
                                int var245 = Statics.field4237 - 1;
                            }
                            if (field572) {
                                Statics.field1964.method3797(class75.field982);
                            } else {
                                Statics.field1964.method3797(0);
                            }
                            for (int var246 = 0; var246 < 104; var246++) {
                                for (int var247 = 0; var247 < 104; var247++) {
                                    method752(var246, var247);
                                }
                            }
                            method16();
                            method2349();
                            class169.field1823.method4168();
                            if (Statics.field3681.method464()) {
                                class242 var248 = Statics.method1576(class240.field2689, field535.field1282);
                                var248.field2767.method6203(1057001181);
                                field535.method2211(var248);
                            }
                            if (!field481) {
                                int var249 = (Statics.field3892 - 6) / 8;
                                int var250 = (Statics.field3892 + 6) / 8;
                                int var251 = (Statics.field27 - 6) / 8;
                                int var252 = (Statics.field27 + 6) / 8;
                                for (int var253 = var249 - 1; var253 <= var250 + 1; var253++) {
                                    for (int var254 = var251 - 1; var254 <= var252 + 1; var254++) {
                                        if (var253 < var249 || var253 > var250 || var254 < var251 || var254 > var252) {
                                            Statics.field1871.method4731("m" + var253 + "_" + var254);
                                            Statics.field1871.method4731("l" + var253 + "_" + var254);
                                        }
                                    }
                                }
                            }
                            method2034(30);
                            method16();
                            Statics.field14 = (byte[][][]) null;
                            Statics.field975 = (byte[][][]) null;
                            Statics.field979 = (byte[][][]) null;
                            Statics.field978 = (byte[][][]) null;
                            Statics.field1368 = (int[][][]) null;
                            Statics.field1770 = (byte[][][]) null;
                            Statics.field170 = (int[][]) null;
                            Statics.field3216 = null;
                            Statics.field2160 = null;
                            Statics.field987 = null;
                            Statics.field980 = null;
                            Statics.field4411 = null;
                            class242 var255 = Statics.method1576(class240.field2720, field535.field1282);
                            field535.method2211(var255);
                            Statics.field1419.method2502();
                            for (int var256 = 0; var256 < 32; var256++) {
                                field194[var256] = 0L;
                            }
                            for (int var257 = 0; var257 < 32; var257++) {
                                field195[var257] = 0L;
                            }
                            Statics.field186 = 0;
                        } else {
                            field546 = 2;
                        }
                    } else {
                        field546 = 1;
                    }
                }
                if (field490 == 30) {
                    this.method1073();
                } else if (field490 == 40 || field490 == 45) {
                    this.method1473();
                }
                return;
            }
            var2.field3673.method4670(var2.field3672, (int) var2.field4056, var2.field3671, false);
        }
    }

    @ObfuscatedName("client.aq(ZI)V")
    public final void method457(boolean arg0) {
        boolean var2 = class248.method3349();
        if (var2 && field729 && Statics.field1337 != null) {
            Statics.field1337.method709();
        }
        if ((field490 == 10 || field490 == 20 || field490 == 30) && field706 != 0L && class397.method3986() > field706) {
            method1011(method151());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field698[var3] = true;
            }
        }
        if (field490 == 0) {
            this.method459(class69.field880, class69.field881, arg0);
        } else if (field490 == 5) {
            class69.method1048(Statics.field53, Statics.field1184, Statics.field1480);
        } else if (field490 == 10 || field490 == 11) {
            class69.method1048(Statics.field53, Statics.field1184, Statics.field1480);
        } else if (field490 == 20) {
            class69.method1048(Statics.field53, Statics.field1184, Statics.field1480);
        } else if (field490 == 25) {
            if (field546 == 1) {
                if (field640 > field657) {
                    field657 = field640;
                }
                int var4 = (field657 * 50 - field640 * 50) / field657;
                method3451(class283.field3342 + class92.field1215 + class92.field1224 + var4 + "%" + class92.field1218, false);
            } else if (field546 == 2) {
                if (field642 > field545) {
                    field545 = field642;
                }
                int var5 = (field545 * 50 - field642 * 50) / field545 + 50;
                method3451(class283.field3342 + class92.field1215 + class92.field1224 + var5 + "%" + class92.field1218, false);
            } else {
                method3451(class283.field3342, false);
            }
        } else if (field490 == 30) {
            this.method1416();
        } else if (field490 == 40) {
            method3451(class283.field3343 + class92.field1215 + class283.field3606, false);
        } else if (field490 == 45) {
            method3451(class283.field3502, false);
        }
        if (field490 == 30 && field705 == 0 && !arg0 && !field707) {
            for (int var6 = 0; var6 < field700; var6++) {
                if (field767[var6]) {
                    Statics.field58.method422(field701[var6], field702[var6], field703[var6], field721[var6]);
                    field767[var6] = false;
                }
            }
        } else if (field490 > 0) {
            Statics.field58.method421(0, 0);
            for (int var7 = 0; var7 < field700; var7++) {
                field767[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.ad(B)V")
    public final void method434() {
        if (Statics.field3763.method2159()) {
            Statics.field3763.method2151();
        }
        if (Statics.field2091 != null) {
            Statics.field2091.field1040 = false;
        }
        Statics.field2091 = null;
        field535.method2221();
        class24.method2873();
        class33.method2355();
        Statics.field1512 = null;
        if (Statics.field1337 != null) {
            Statics.field1337.method705();
        }
        if (Statics.field3928 != null) {
            Statics.field3928.method705();
        }
        class291.method4129();
        Object var1 = class287.field3678;
        synchronized (class287.field3678) {
            if (class287.field3677 != 0) {
                class287.field3677 = 1;
                try {
                    class287.field3678.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field3193 != null) {
            Statics.field3193.method2235();
            Statics.field3193 = null;
        }
        try {
            class144.field1551.method6075();
            for (int var4 = 0; var4 < Statics.field1550; var4++) {
                Statics.field1555[var4].method6075();
            }
            class144.field1554.method6075();
            class144.field1552.method6075();
        } catch (Exception var7) {
        }
        this.field523.method186();
    }

    @ObfuscatedName("cc.ed(IB)V")
    public static void method2034(int arg0) {
        if (field490 == arg0) {
            return;
        }
        if (field490 == 0) {
            Statics.field3681.method460();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            method2471(0);
            field547 = 0;
            field517 = 0;
            field540.method5354(arg0);
            if (arg0 != 20) {
                method2178(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3739 != null) {
            Statics.field3739.method2541();
            Statics.field3739 = null;
        }
        if (field490 == 25) {
            field546 = 0;
            field640 = 0;
            field657 = 1;
            field642 = 0;
            field545 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var1 = method3557() ? 0 : 12;
            class69.method3460(Statics.field1042, Statics.field787, true, var1);
        } else if (arg0 == 20) {
            int var2 = field490 == 11 ? 4 : 0;
            class69.method3460(Statics.field1042, Statics.field787, true, var2);
        } else if (arg0 == 11) {
            class69.method3460(Statics.field1042, Statics.field787, false, 4);
        } else if (Statics.field871) {
            Statics.field879 = null;
            Statics.field900 = null;
            Statics.field873 = null;
            Statics.field3860 = null;
            Statics.field896 = null;
            Statics.field4255 = null;
            Statics.field1231 = null;
            Statics.field2587 = null;
            Statics.field769 = null;
            Statics.field152 = null;
            Statics.field2189 = null;
            Statics.field781 = null;
            Statics.field28 = null;
            Statics.field3282 = null;
            Statics.field877.method2040();
            class248.method213(2);
            if (Statics.field3725 != null) {
                try {
                    class400 var3 = new class400(4);
                    var3.method6200(2);
                    var3.method6202(0);
                    Statics.field3725.method2567(var3.field4271, 0, 4);
                } catch (IOException var7) {
                    try {
                        Statics.field3725.method2541();
                    } catch (Exception var6) {
                    }
                    class291.field3735++;
                    Statics.field3725 = null;
                }
            }
            Statics.field871 = false;
        }
        field490 = arg0;
    }

    @ObfuscatedName("client.ee(I)V")
    public void method1069() {
        if (field490 != 1000) {
            boolean var1 = class291.method2010();
            if (!var1) {
                this.method1070();
            }
        }
    }

    @ObfuscatedName("client.es(I)V")
    public void method1070() {
        if (class291.field3719 >= 4) {
            this.method461("js5crc");
            method2034(1000);
            return;
        }
        if (class291.field3735 >= 4) {
            if (field490 <= 5) {
                this.method461("js5io");
                method2034(1000);
                return;
            }
            field513 = 3000;
            class291.field3735 = 3;
        }
        if (--field513 + 1 > 0) {
            return;
        }
        try {
            if (field512 == 0) {
                Statics.field1205 = Statics.field190.method2521(Statics.field3319, Statics.field1187);
                field512++;
            }
            if (field512 == 1) {
                if (Statics.field1205.field1591 == 2) {
                    this.method1071(-1);
                    return;
                }
                if (Statics.field1205.field1591 == 1) {
                    field512++;
                }
            }
            if (field512 == 2) {
                if (field538) {
                    Statics.field3 = class343.method2254((Socket) Statics.field1205.field1595, 40000, 5000);
                } else {
                    Statics.field3 = new class147((Socket) Statics.field1205.field1595, Statics.field190, 5000);
                }
                class400 var1 = new class400(5);
                var1.method6200(15);
                var1.method6203(199);
                Statics.field3.method2567(var1.field4271, 0, 5);
                field512++;
                Statics.field1559 = class397.method3986();
            }
            if (field512 == 3) {
                if (Statics.field3.method2543() > 0 || !field538 && field490 <= 5) {
                    int var2 = Statics.field3.method2540();
                    if (var2 != 0) {
                        this.method1071(var2);
                        return;
                    }
                    field512++;
                } else if (class397.method3986() - Statics.field1559 > 30000L) {
                    this.method1071(-2);
                    return;
                }
            }
            if (field512 == 4) {
                class343 var3 = Statics.field3;
                boolean var4 = field490 > 20;
                if (Statics.field3725 != null) {
                    try {
                        Statics.field3725.method2541();
                    } catch (Exception var19) {
                    }
                    Statics.field3725 = null;
                }
                Statics.field3725 = var3;
                if (Statics.field3725 != null) {
                    try {
                        class400 var6 = new class400(4);
                        var6.method6200(var4 ? 2 : 3);
                        var6.method6202(0);
                        Statics.field3725.method2567(var6.field4271, 0, 4);
                    } catch (IOException var18) {
                        try {
                            Statics.field3725.method2541();
                        } catch (Exception var17) {
                        }
                        class291.field3735++;
                        Statics.field3725 = null;
                    }
                }
                class291.field3731.field4272 = 0;
                Statics.field3009 = null;
                Statics.field1527 = null;
                class291.field3737 = 0;
                while (true) {
                    class289 var9 = (class289) class291.field3723.method6017();
                    if (var9 == null) {
                        while (true) {
                            class289 var10 = (class289) class291.field3728.method6017();
                            if (var10 == null) {
                                if (class291.field3736 != 0) {
                                    try {
                                        class400 var11 = new class400(4);
                                        var11.method6200(4);
                                        var11.method6200(class291.field3736);
                                        var11.method6311(0);
                                        Statics.field3725.method2567(var11.field4271, 0, 4);
                                    } catch (IOException var16) {
                                        try {
                                            Statics.field3725.method2541();
                                        } catch (Exception var15) {
                                        }
                                        class291.field3735++;
                                        Statics.field3725 = null;
                                    }
                                }
                                class291.field3720 = 0;
                                Statics.field150 = class397.method3986();
                                Statics.field1205 = null;
                                Statics.field3 = null;
                                field512 = 0;
                                field514 = 0;
                                return;
                            }
                            class291.field3738.method4948(var10);
                            class291.field3726.method6015(var10, var10.field4056);
                            class291.field3727++;
                            class291.field3729--;
                        }
                    }
                    class291.field3721.method6015(var9, var9.field4056);
                    class291.field3722++;
                    class291.field3730--;
                }
            }
        } catch (IOException var20) {
            this.method1071(-3);
        }
    }

    @ObfuscatedName("client.en(II)V")
    public void method1071(int arg0) {
        Statics.field1205 = null;
        Statics.field3 = null;
        field512 = 0;
        if (Statics.field3296 == Statics.field1187) {
            Statics.field1187 = Statics.field2198;
        } else {
            Statics.field1187 = Statics.field3296;
        }
        field514++;
        if (field514 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field490 <= 5) {
                this.method461("js5connect_full");
                method2034(1000);
            } else {
                field513 = 3000;
            }
        } else if (field514 >= 2 && arg0 == 6) {
            this.method461("js5connect_outofdate");
            method2034(1000);
        } else if (field514 >= 4) {
            if (field490 <= 5) {
                this.method461("js5connect");
                method2034(1000);
            } else {
                field513 = 3000;
            }
        }
    }

    @ObfuscatedName("t.ef(Lkx;Ljava/lang/String;I)V")
    public static void method318(class288 arg0, String arg1) {
        class77 var2 = new class77(arg0, arg1);
        field762.add(var2);
        field764 += var2.field997;
    }

    @ObfuscatedName("ce.er(I)I")
    public static int method2284() {
        if (field762 == null || field763 >= field762.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field763; var1++) {
            var0 += ((class77) field762.get(var1)).field995;
        }
        return var0 * 10000 / field764;
    }

    @ObfuscatedName("nn.ek(II)I")
    public static int method6073(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("nd.eg(I)V")
    public static void method5986() {
        if (field558 == 0) {
            Statics.field1964 = new class213(4, 104, 104, class75.field976);
            for (int var0 = 0; var0 < 4; var0++) {
                field695[var0] = new class173(104, 104);
            }
            Statics.field1370 = new class413(512, 512);
            class69.field881 = class283.field3560;
            class69.field880 = 5;
            field558 = 20;
        } else if (field558 == 20) {
            class69.field881 = class283.field3346;
            class69.field880 = 10;
            field558 = 30;
        } else if (field558 == 30) {
            Statics.field2154 = method19(0, false, true, true);
            Statics.field859 = method19(1, false, true, true);
            Statics.field1382 = method19(2, true, false, true);
            Statics.field3026 = method19(3, false, true, true);
            Statics.field445 = method19(4, false, true, true);
            Statics.field1871 = method19(5, true, true, true);
            Statics.field3292 = method19(6, true, true, true);
            Statics.field1511 = method19(7, false, true, true);
            Statics.field787 = method19(8, false, true, true);
            Statics.field1646 = method19(9, false, true, true);
            Statics.field1042 = method19(10, false, true, true);
            Statics.field3862 = method19(11, false, true, true);
            Statics.field991 = method19(12, false, true, true);
            Statics.field4248 = method19(13, true, false, true);
            Statics.field469 = method19(14, false, true, true);
            Statics.field2110 = method19(15, false, true, true);
            Statics.field1408 = method19(17, true, true, true);
            Statics.field1407 = method19(18, false, true, true);
            Statics.field833 = method19(19, false, true, true);
            Statics.field169 = method19(20, false, true, true);
            class69.field881 = class283.field3347;
            class69.field880 = 20;
            field558 = 40;
        } else if (field558 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field2154.method4669() * 4 / 100;
            int var3 = var2 + Statics.field859.method4669() * 4 / 100;
            int var4 = var3 + Statics.field1382.method4669() * 2 / 100;
            int var5 = var4 + Statics.field3026.method4669() * 2 / 100;
            int var6 = var5 + Statics.field445.method4669() * 6 / 100;
            int var7 = var6 + Statics.field1871.method4669() * 4 / 100;
            int var8 = var7 + Statics.field3292.method4669() * 2 / 100;
            int var9 = var8 + Statics.field1511.method4669() * 56 / 100;
            int var10 = var9 + Statics.field787.method4669() * 2 / 100;
            int var11 = var10 + Statics.field1646.method4669() * 2 / 100;
            int var12 = var11 + Statics.field1042.method4669() * 2 / 100;
            int var13 = var12 + Statics.field3862.method4669() * 2 / 100;
            int var14 = var13 + Statics.field991.method4669() * 2 / 100;
            int var15 = var14 + Statics.field4248.method4669() * 2 / 100;
            int var16 = var15 + Statics.field469.method4669() * 2 / 100;
            int var17 = var16 + Statics.field2110.method4669() * 2 / 100;
            int var18 = var17 + Statics.field833.method4669() / 100;
            int var19 = var18 + Statics.field1407.method4669() / 100;
            int var20 = var19 + Statics.field169.method4669() / 100;
            int var21 = var20 + (Statics.field1408.method4664() && Statics.field1408.method4733() ? 1 : 0);
            if (var21 == 100) {
                method318(Statics.field2154, "Animations");
                method318(Statics.field859, "Skeletons");
                method318(Statics.field445, "Sound FX");
                method318(Statics.field1871, "Maps");
                method318(Statics.field3292, "Music Tracks");
                method318(Statics.field1511, "Models");
                method318(Statics.field787, "Sprites");
                method318(Statics.field3862, "Music Jingles");
                method318(Statics.field469, "Music Samples");
                method318(Statics.field2110, "Music Patches");
                method318(Statics.field833, "World Map");
                method318(Statics.field1407, "World Map Geography");
                method318(Statics.field169, "World Map Ground");
                Statics.field2062 = new class349();
                Statics.field2062.method5629(Statics.field1408);
                class69.field881 = class283.field3470;
                class69.field880 = 30;
                field558 = 45;
            } else {
                if (var21 != 0) {
                    class69.field881 = class283.field3348 + var21 + "%";
                }
                class69.field880 = 30;
            }
        } else if (field558 == 45) {
            boolean var22 = !field572;
            Statics.field3288 = 22050;
            Statics.field274 = var22;
            Statics.field269 = 2;
            class249 var23 = new class249();
            var23.method4250(9, 128);
            Statics.field1337 = class38.method2354(Statics.field190, 0, 22050);
            Statics.field1337.method723(var23);
            class288 var24 = Statics.field2110;
            class288 var25 = Statics.field469;
            class288 var26 = Statics.field445;
            Statics.field2902 = var24;
            Statics.field2904 = var25;
            Statics.field2899 = var26;
            Statics.field1510 = var23;
            Statics.field3928 = class38.method2354(Statics.field190, 1, 2048);
            Statics.field2965 = new class34();
            Statics.field3928.method723(Statics.field2965);
            Statics.field3799 = new class51(22050, Statics.field3288);
            class69.field881 = class283.field3350;
            class69.field880 = 35;
            field558 = 50;
            Statics.field1308 = new class375(Statics.field787, Statics.field4248);
        } else if (field558 == 50) {
            class376[] var27 = new class376[] { class376.field4175, class376.field4181, class376.field4176, class376.field4173, class376.field4172, class376.field4174 };
            int var28 = var27.length;
            class375 var29 = Statics.field1308;
            class376[] var30 = new class376[] { class376.field4175, class376.field4181, class376.field4176, class376.field4173, class376.field4172, class376.field4174 };
            field551 = var29.method5982(var30);
            if (field551.size() < var28) {
                class69.field881 = class283.field3351 + field551.size() * 100 / var28 + "%";
                class69.field880 = 40;
            } else {
                Statics.field1184 = (class315) field551.get(class376.field4172);
                Statics.field1480 = (class315) field551.get(class376.field4176);
                Statics.field53 = (class315) field551.get(class376.field4173);
                Statics.field1788 = field758.method5745();
                class69.field881 = class283.field3352;
                class69.field880 = 40;
                field558 = 60;
            }
        } else if (field558 == 60) {
            int var31 = class69.method403(Statics.field1042, Statics.field787);
            int var32 = class69.field893.length + class69.field870.length;
            if (var31 < var32) {
                class69.field881 = class283.field3353 + var31 * 100 / var32 + "%";
                class69.field880 = 50;
            } else {
                class69.field881 = class283.field3354;
                class69.field880 = 50;
                method2034(5);
                field558 = 70;
            }
        } else if (field558 == 70) {
            if (Statics.field1382.method4733()) {
                class288 var34 = Statics.field1382;
                Statics.field1939 = var34;
                class164.method2593(Statics.field1382);
                class156.method2014(Statics.field1382, Statics.field1511);
                class288 var35 = Statics.field1382;
                class288 var36 = Statics.field1511;
                boolean var37 = field572;
                Statics.field1820 = var35;
                Statics.field1821 = var36;
                class169.field1849 = var37;
                class288 var38 = Statics.field1382;
                class288 var39 = Statics.field1511;
                Statics.field1716 = var38;
                Statics.field1706 = var39;
                class167.method2341(Statics.field1382);
                class170.method2319(Statics.field1382, Statics.field1511, field682, Statics.field1184);
                class172.method205(Statics.field1382, Statics.field2154, Statics.field859);
                class163.method3502(Statics.field1382, Statics.field1511);
                class165.method2457(Statics.field1382);
                class288 var40 = Statics.field1382;
                Statics.field1618 = var40;
                Statics.field1615 = Statics.field1618.method4720(16);
                class288 var41 = Statics.field3026;
                class288 var42 = Statics.field1511;
                class288 var43 = Statics.field787;
                class288 var44 = Statics.field4248;
                Statics.field3039 = var41;
                Statics.field474 = var42;
                Statics.field2087 = var43;
                Statics.field3029 = var44;
                Statics.field1535 = new class262[Statics.field3039.method4721()][];
                Statics.field3038 = new boolean[Statics.field3039.method4721()];
                class288 var45 = Statics.field1382;
                Statics.field1612 = var45;
                class159.method1952(Statics.field1382);
                class288 var46 = Statics.field1382;
                Statics.field1651 = var46;
                class288 var47 = Statics.field1382;
                Statics.field1556 = var47;
                Statics.field2012 = new class387(Statics.field84, 54, Statics.field3879, Statics.field1382);
                Statics.field1441 = new class387(Statics.field84, 47, Statics.field3879, Statics.field1382);
                Statics.field3763 = new class97();
                class168.method2500(Statics.field1382, Statics.field787, Statics.field4248);
                class157.method4127(Statics.field1382, Statics.field787);
                class154.method1921(Statics.field1382, Statics.field787);
                class69.field881 = class283.field3356;
                class69.field880 = 60;
                field558 = 80;
            } else {
                class69.field881 = class283.field3355 + Statics.field1382.method4675() + "%";
                class69.field880 = 60;
            }
        } else if (field558 == 80) {
            int var48 = 0;
            if (Statics.field229 == null) {
                Statics.field229 = class414.method4473(Statics.field787, Statics.field2062.field4006, 0);
            } else {
                var48++;
            }
            if (Statics.field79 == null) {
                Statics.field79 = class414.method4473(Statics.field787, Statics.field2062.field4002, 0);
            } else {
                var48++;
            }
            if (Statics.field201 == null) {
                class288 var49 = Statics.field787;
                int var50 = Statics.field2062.field4003;
                byte[] var51 = var49.method4710(var50, 0);
                boolean var52;
                if (var51 == null) {
                    var52 = false;
                } else {
                    class414.method406(var51);
                    var52 = true;
                }
                class412[] var53;
                if (var52) {
                    class412[] var54 = new class412[Statics.field4382];
                    for (int var55 = 0; var55 < Statics.field4382; var55++) {
                        class412 var56 = var54[var55] = new class412();
                        var56.field4365 = Statics.field4379;
                        var56.field4363 = Statics.field4381;
                        var56.field4362 = Statics.field4380[var55];
                        var56.field4366 = Statics.field4383[var55];
                        var56.field4361 = Statics.field1613[var55];
                        var56.field4364 = Statics.field4384[var55];
                        var56.field4360 = Statics.field1006;
                        var56.field4359 = Statics.field3657[var55];
                    }
                    Statics.field4380 = null;
                    Statics.field4383 = null;
                    Statics.field1613 = null;
                    Statics.field4384 = null;
                    Statics.field1006 = null;
                    Statics.field3657 = (byte[][]) null;
                    var53 = var54;
                } else {
                    var53 = null;
                }
                Statics.field201 = var53;
            } else {
                var48++;
            }
            if (Statics.field2960 == null) {
                class288 var58 = Statics.field787;
                int var59 = Statics.field2062.field4001;
                class413[] var60;
                if (Statics.method4123(var58, var59, 0)) {
                    var60 = class414.method3118();
                } else {
                    var60 = null;
                }
                Statics.field2960 = var60;
            } else {
                var48++;
            }
            if (Statics.field834 == null) {
                class288 var61 = Statics.field787;
                int var62 = Statics.field2062.field4005;
                class413[] var63;
                if (Statics.method4123(var61, var62, 0)) {
                    var63 = class414.method3118();
                } else {
                    var63 = null;
                }
                Statics.field834 = var63;
            } else {
                var48++;
            }
            if (Statics.field26 == null) {
                class288 var64 = Statics.field787;
                int var65 = Statics.field2062.field4004;
                class413[] var66;
                if (Statics.method4123(var64, var65, 0)) {
                    var66 = class414.method3118();
                } else {
                    var66 = null;
                }
                Statics.field26 = var66;
            } else {
                var48++;
            }
            if (Statics.field67 == null) {
                class288 var67 = Statics.field787;
                int var68 = Statics.field2062.field4007;
                class413[] var69;
                if (Statics.method4123(var67, var68, 0)) {
                    var69 = class414.method3118();
                } else {
                    var69 = null;
                }
                Statics.field67 = var69;
            } else {
                var48++;
            }
            if (Statics.field63 == null) {
                class288 var70 = Statics.field787;
                int var71 = Statics.field2062.field4008;
                class413[] var72;
                if (Statics.method4123(var70, var71, 0)) {
                    var72 = class414.method3118();
                } else {
                    var72 = null;
                }
                Statics.field63 = var72;
            } else {
                var48++;
            }
            if (Statics.field956 == null) {
                class288 var73 = Statics.field787;
                int var74 = Statics.field2062.field4009;
                class413[] var75;
                if (Statics.method4123(var73, var74, 0)) {
                    var75 = class414.method3118();
                } else {
                    var75 = null;
                }
                Statics.field956 = var75;
            } else {
                var48++;
            }
            if (Statics.field994 == null) {
                class288 var76 = Statics.field787;
                int var77 = Statics.field2062.field4010;
                byte[] var78 = var76.method4710(var77, 0);
                boolean var79;
                if (var78 == null) {
                    var79 = false;
                } else {
                    class414.method406(var78);
                    var79 = true;
                }
                class412[] var80;
                if (var79) {
                    class412[] var81 = new class412[Statics.field4382];
                    for (int var82 = 0; var82 < Statics.field4382; var82++) {
                        class412 var83 = var81[var82] = new class412();
                        var83.field4365 = Statics.field4379;
                        var83.field4363 = Statics.field4381;
                        var83.field4362 = Statics.field4380[var82];
                        var83.field4366 = Statics.field4383[var82];
                        var83.field4361 = Statics.field1613[var82];
                        var83.field4364 = Statics.field4384[var82];
                        var83.field4360 = Statics.field1006;
                        var83.field4359 = Statics.field3657[var82];
                    }
                    Statics.field4380 = null;
                    Statics.field4383 = null;
                    Statics.field1613 = null;
                    Statics.field4384 = null;
                    Statics.field1006 = null;
                    Statics.field3657 = (byte[][]) null;
                    var80 = var81;
                } else {
                    var80 = null;
                }
                Statics.field994 = var80;
            } else {
                var48++;
            }
            if (Statics.field2021 == null) {
                class288 var85 = Statics.field787;
                int var86 = Statics.field2062.field4011;
                byte[] var87 = var85.method4710(var86, 0);
                boolean var88;
                if (var87 == null) {
                    var88 = false;
                } else {
                    class414.method406(var87);
                    var88 = true;
                }
                class412[] var89;
                if (var88) {
                    class412[] var90 = new class412[Statics.field4382];
                    for (int var91 = 0; var91 < Statics.field4382; var91++) {
                        class412 var92 = var90[var91] = new class412();
                        var92.field4365 = Statics.field4379;
                        var92.field4363 = Statics.field4381;
                        var92.field4362 = Statics.field4380[var91];
                        var92.field4366 = Statics.field4383[var91];
                        var92.field4361 = Statics.field1613[var91];
                        var92.field4364 = Statics.field4384[var91];
                        var92.field4360 = Statics.field1006;
                        var92.field4359 = Statics.field3657[var91];
                    }
                    Statics.field4380 = null;
                    Statics.field4383 = null;
                    Statics.field1613 = null;
                    Statics.field4384 = null;
                    Statics.field1006 = null;
                    Statics.field3657 = (byte[][]) null;
                    var89 = var90;
                } else {
                    var89 = null;
                }
                Statics.field2021 = var89;
            } else {
                var48++;
            }
            if (var48 < 11) {
                class69.field881 = class283.field3472 + var48 * 100 / 12 + "%";
                class69.field880 = 70;
            } else {
                Statics.field3851 = Statics.field2021;
                Statics.field79.method6619();
                int var94 = (int) (Math.random() * 21.0D) - 10;
                int var95 = (int) (Math.random() * 21.0D) - 10;
                int var96 = (int) (Math.random() * 21.0D) - 10;
                int var97 = (int) (Math.random() * 41.0D) - 20;
                Statics.field201[0].method6592(var94 + var97, var95 + var97, var96 + var97);
                class69.field881 = class283.field3358;
                class69.field880 = 70;
                field558 = 90;
            }
        } else if (field558 == 90) {
            if (Statics.field1646.method4733()) {
                Statics.field2959 = new class218(Statics.field1646, Statics.field787, 20, Statics.field1779.field1194, field572 ? 64 : 128);
                class211.method3704(Statics.field2959);
                class211.method3761(Statics.field1779.field1194);
                field558 = 100;
            } else {
                class69.field881 = class283.field3511 + "0%";
                class69.field880 = 90;
            }
        } else if (field558 == 100) {
            int var98 = Statics.field2959.method3988();
            if (var98 < 100) {
                class69.field881 = class283.field3511 + var98 + "%";
                class69.field880 = 90;
            } else {
                class69.field881 = class283.field3360;
                class69.field880 = 90;
                field558 = 110;
            }
        } else if (field558 == 110) {
            Statics.field2091 = new class82();
            Statics.field190.method2514(Statics.field2091, 10);
            class69.field881 = class283.field3361;
            class69.field880 = 92;
            field558 = 120;
        } else if (field558 == 120) {
            if (Statics.field1042.method4732("huffman", "")) {
                class264 var99 = new class264(Statics.field1042.method4728("huffman", ""));
                class265.method4590(var99);
                class69.field881 = class283.field3363;
                class69.field880 = 94;
                field558 = 130;
            } else {
                class69.field881 = class283.field3467 + "%";
                class69.field880 = 94;
            }
        } else if (field558 == 130) {
            if (!Statics.field3026.method4733()) {
                class69.field881 = class283.field3364 + Statics.field3026.method4675() * 4 / 5 + "%";
                class69.field880 = 96;
            } else if (!Statics.field991.method4733()) {
                class69.field881 = class283.field3364 + (80 + Statics.field991.method4675() / 6) + "%";
                class69.field880 = 96;
            } else if (Statics.field4248.method4733()) {
                class69.field881 = class283.field3365;
                class69.field880 = 98;
                field558 = 140;
            } else {
                class69.field881 = class283.field3364 + (96 + Statics.field4248.method4675() / 50) + "%";
                class69.field880 = 96;
            }
        } else if (field558 == 140) {
            class69.field880 = 100;
            if (Statics.field833.method4715(class200.field2200.field2205)) {
                if (Statics.field858 == null) {
                    Statics.field858 = new class374();
                    Statics.field858.method5786(Statics.field833, Statics.field1407, Statics.field169, Statics.field53, field551, Statics.field201);
                }
                class69.field881 = class283.field3367;
                field558 = 150;
            } else {
                class69.field881 = class283.field3439 + Statics.field833.method4736(class200.field2200.field2205) / 10 + "%";
            }
        } else if (field558 == 150) {
            method2034(10);
        }
    }

    @ObfuscatedName("o.ft(IZZZB)Lkx;")
    public static class288 method19(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class347 var4 = null;
        if (class144.field1551 != null) {
            var4 = new class347(arg0, class144.field1551, Statics.field1555[arg0], 1000000);
        }
        return new class288(var4, Statics.field472, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fo(I)V")
    public final void method1473() {
        class343 var1 = field535.method2215();
        class399 var2 = field535.field1284;
        try {
            if (field636 == 0) {
                if (Statics.field1333 == null && (field526.method1828() || field547 > 250)) {
                    Statics.field1333 = field526.method1829();
                    field526.method1832();
                    field526 = null;
                }
                if (Statics.field1333 != null) {
                    if (var1 != null) {
                        var1.method2541();
                        var1 = null;
                    }
                    Statics.field857 = null;
                    field537 = false;
                    field547 = 0;
                    if (field520.method6485()) {
                        try {
                            this.method1378(Statics.field521);
                            method2471(20);
                        } catch (Throwable var41) {
                            class424.method21((String) null, var41);
                            method1041(65);
                            return;
                        }
                    } else {
                        method2471(1);
                    }
                }
            }
            if (field636 == 20) {
                if (!this.field557.method301()) {
                    return;
                }
                if (this.field557.method287()) {
                    class424.method21(this.field557.method286(), (Throwable) null);
                    method1041(65);
                    return;
                }
                class22 var4 = this.field557.method289();
                if (var4.method312() != 200) {
                    class424.method21("Response code: " + var4.method312() + "Response body: " + var4.method311(), (Throwable) null);
                    method1041(65);
                    return;
                }
                field547 = 0;
                this.field522 = var4.method311();
                method2471(1);
            }
            if (field636 == 1) {
                if (Statics.field857 == null) {
                    Statics.field857 = Statics.field190.method2521(Statics.field3319, Statics.field1187);
                }
                if (Statics.field857.field1591 == 2) {
                    throw new IOException();
                }
                if (Statics.field857.field1591 == 1) {
                    if (field538) {
                        var1 = class343.method2254((Socket) Statics.field857.field1595, 40000, 5000);
                    } else {
                        var1 = new class147((Socket) Statics.field857.field1595, Statics.field190, 5000);
                    }
                    field535.method2208(var1);
                    Statics.field857 = null;
                    method2471(2);
                }
            }
            if (field636 == 2) {
                field535.method2209();
                class242 var5 = class242.method3560();
                var5.field2767.method6200(class244.field2874.field2870);
                field535.method2211(var5);
                field535.method2210();
                var2.field4272 = 0;
                method2471(3);
            }
            if (field636 == 3) {
                if (Statics.field1337 != null) {
                    Statics.field1337.method703();
                }
                if (Statics.field3928 != null) {
                    Statics.field3928.method703();
                }
                boolean var6 = true;
                if (field538 && !var1.method2544(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method2540();
                    if (Statics.field1337 != null) {
                        Statics.field1337.method703();
                    }
                    if (Statics.field3928 != null) {
                        Statics.field3928.method703();
                    }
                    if (var7 != 0) {
                        method1041(var7);
                        return;
                    }
                    var2.field4272 = 0;
                    method2471(4);
                }
            }
            if (field636 == 4) {
                if (var2.field4272 < 8) {
                    int var8 = var1.method2543();
                    if (var8 > 8 - var2.field4272) {
                        var8 = 8 - var2.field4272;
                    }
                    if (var8 > 0) {
                        var1.method2545(var2.field4271, var2.field4272, var8);
                        var2.field4272 += var8;
                    }
                }
                if (var2.field4272 == 8) {
                    var2.field4272 = 0;
                    Statics.field1682 = var2.method6223();
                    method2471(5);
                }
            }
            if (field636 == 5) {
                field535.field1284.field4272 = 0;
                field535.method2209();
                class399 var9 = new class399(500);
                int[] var10 = new int[] { Statics.field1333.nextInt(), Statics.field1333.nextInt(), Statics.field1333.nextInt(), Statics.field1333.nextInt() };
                var9.field4272 = 0;
                var9.method6200(1);
                var9.method6203(var10[0]);
                var9.method6203(var10[1]);
                var9.method6203(var10[2]);
                var9.method6203(var10[3]);
                var9.method6205(Statics.field1682);
                if (field490 == 40) {
                    var9.method6203(Statics.field1547[0]);
                    var9.method6203(Statics.field1547[1]);
                    var9.method6203(Statics.field1547[2]);
                    var9.method6203(Statics.field1547[3]);
                } else {
                    var9.method6200(field519.method42());
                    switch(field519.field1361) {
                        case 0:
                            var9.field4272 += 4;
                            break;
                        case 1:
                        case 3:
                            var9.method6202(Statics.field3275);
                            var9.field4272++;
                            break;
                        case 2:
                            var9.method6203((Integer) Statics.field1779.field1188.get(class319.method4640(class69.field890)));
                    }
                    if (field520.method6485()) {
                        var9.method6200(class404.field4324.method42());
                        var9.method6242(this.field522);
                    } else {
                        var9.method6200(class404.field4333.method42());
                        var9.method6242(class69.field891);
                    }
                }
                var9.method6373(class68.field868, class68.field869);
                Statics.field1547 = var10;
                class242 var11 = class242.method3560();
                var11.field2767.field4272 = 0;
                if (field490 == 40) {
                    var11.field2767.method6200(class244.field2872.field2870);
                } else {
                    var11.field2767.method6200(class244.field2869.field2870);
                }
                var11.field2767.method6311(0);
                int var12 = var11.field2767.field4272;
                var11.field2767.method6203(199);
                var11.field2767.method6203(1);
                var11.field2767.method6200(field524);
                var11.field2767.method6200(field488);
                var11.field2767.method6210(var9.field4271, 0, var9.field4272);
                int var13 = var11.field2767.field4272;
                var11.field2767.method6242(class69.field890);
                var11.field2767.method6200((field707 ? 1 : 0) << 1 | (field572 ? 1 : 0));
                var11.field2767.method6311(Statics.field1611);
                var11.field2767.method6311(Statics.field200);
                method2084(var11.field2767);
                var11.field2767.method6242(Statics.field2105);
                var11.field2767.method6203(Statics.field146);
                class400 var14 = new class400(Statics.field1788.method5764());
                Statics.field1788.method5761(var14);
                var11.field2767.method6210(var14.field4271, 0, var14.field4271.length);
                var11.field2767.method6200(field524);
                var11.field2767.method6203(0);
                var11.field2767.method6264(Statics.field1042.field3715);
                var11.field2767.method6262(Statics.field2154.field3715);
                var11.field2767.method6262(Statics.field3026.field3715);
                var11.field2767.method6264(Statics.field445.field3715);
                var11.field2767.method6262(0);
                var11.field2767.method6203(Statics.field787.field3715);
                var11.field2767.method6203(Statics.field469.field3715);
                var11.field2767.method6203(Statics.field2110.field3715);
                var11.field2767.method6263(Statics.field3292.field3715);
                var11.field2767.method6262(Statics.field1382.field3715);
                var11.field2767.method6264(Statics.field1871.field3715);
                var11.field2767.method6263(Statics.field169.field3715);
                var11.field2767.method6263(Statics.field4248.field3715);
                var11.field2767.method6263(Statics.field859.field3715);
                var11.field2767.method6262(Statics.field3862.field3715);
                var11.field2767.method6263(Statics.field1408.field3715);
                var11.field2767.method6264(Statics.field1511.field3715);
                var11.field2767.method6262(Statics.field1407.field3715);
                var11.field2767.method6262(Statics.field1646.field3715);
                var11.field2767.method6262(Statics.field833.field3715);
                var11.field2767.method6203(Statics.field991.field3715);
                var11.field2767.method6271(var10, var13, var11.field2767.field4272);
                var11.field2767.method6213(var11.field2767.field4272 - var12);
                field535.method2211(var11);
                field535.method2210();
                field535.field1282 = new class416(var10);
                int[] var15 = new int[4];
                for (int var16 = 0; var16 < 4; var16++) {
                    var15[var16] = var10[var16] + 50;
                }
                var2.method6161(var15);
                method2471(6);
            }
            if (field636 == 6 && var1.method2543() > 0) {
                int var17 = var1.method2540();
                if (var17 == 21 && field490 == 20) {
                    method2471(12);
                } else if (var17 == 2) {
                    method2471(14);
                } else if (var17 == 15 && field490 == 40) {
                    field535.field1279 = -1;
                    method2471(19);
                } else if (var17 == 64) {
                    method2471(10);
                } else if (var17 == 23 && field517 < 1) {
                    field517++;
                    method2471(0);
                } else if (var17 == 29) {
                    method2471(17);
                } else if (var17 == 69) {
                    method2471(7);
                } else {
                    method1041(var17);
                    return;
                }
            }
            if (field636 == 7 && var1.method2543() >= 2) {
                var1.method2545(var2.field4271, 0, 2);
                var2.field4272 = 0;
                Statics.field1478 = var2.method6219();
                method2471(8);
            }
            if (field636 == 8 && var1.method2543() >= Statics.field1478) {
                var2.field4272 = 0;
                var1.method2545(var2.field4271, var2.field4272, Statics.field1478);
                class7 var18 = class7.method3696()[var2.method6217()];
                try {
                    switch(var18.field13) {
                        case 0:
                            class1 var19 = new class1();
                            this.field528 = new class8(var2, var19);
                            method2471(9);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var40) {
                    method1041(22);
                    return;
                }
            }
            if (field636 == 9 && this.field528.method52()) {
                this.field527 = this.field528.method60();
                this.field528.method53();
                this.field528 = null;
                if (this.field527 == null) {
                    method1041(22);
                    return;
                }
                field535.method2209();
                class242 var22 = class242.method3560();
                var22.field2767.method6200(class244.field2871.field2870);
                var22.field2767.method6311(this.field527.field4272);
                var22.field2767.method6211(this.field527);
                field535.method2211(var22);
                field535.method2210();
                this.field527 = null;
                method2471(6);
            }
            if (field636 == 10 && var1.method2543() > 0) {
                Statics.field2013 = var1.method2540();
                method2471(11);
            }
            if (field636 == 11 && var1.method2543() >= Statics.field2013) {
                var1.method2545(var2.field4271, 0, Statics.field2013);
                var2.field4272 = 0;
                method2471(6);
            }
            if (field636 == 12 && var1.method2543() > 0) {
                field518 = (var1.method2540() + 3) * 60;
                method2471(13);
            }
            if (field636 == 13) {
                field547 = 0;
                class69.method5760(class283.field3373, class283.field3374, field518 / 60 + class283.field3375);
                if (--field518 <= 0) {
                    method2471(0);
                }
            } else {
                if (field636 == 14 && var1.method2543() >= 1) {
                    Statics.field3815 = var1.method2540();
                    method2471(15);
                }
                if (field636 == 15 && var1.method2543() >= Statics.field3815) {
                    boolean var23 = var1.method2540() == 1;
                    var1.method2545(var2.field4271, 0, 4);
                    var2.field4272 = 0;
                    boolean var24 = false;
                    if (var23) {
                        int var25 = var2.method6186() << 24;
                        int var26 = var25 | var2.method6186() << 16;
                        int var27 = var26 | var2.method6186() << 8;
                        int var28 = var27 | var2.method6186();
                        int var29 = class319.method4640(class69.field890);
                        if (Statics.field1779.field1188.size() >= 10 && !Statics.field1779.field1188.containsKey(var29)) {
                            Iterator var30 = Statics.field1779.field1188.entrySet().iterator();
                            var30.next();
                            var30.remove();
                        }
                        Statics.field1779.field1188.put(var29, var28);
                    }
                    if (field525) {
                        Statics.field1779.field1192 = class69.field890;
                    } else {
                        Statics.field1779.field1192 = null;
                    }
                    class89.method362();
                    field658 = var1.method2540();
                    field580 = var1.method2540() == 1;
                    field606 = var1.method2540();
                    field606 <<= 0x8;
                    field606 += var1.method2540();
                    field609 = var1.method2540();
                    var1.method2545(var2.field4271, 0, 1);
                    var2.field4272 = 0;
                    class243[] var31 = class243.method3156();
                    int var32 = var2.method6180();
                    if (var32 < 0 || var32 >= var31.length) {
                        throw new IOException(var32 + " " + var2.field4272);
                    }
                    field535.field1278 = var31[var32];
                    field535.field1279 = field535.field1278.field2866;
                    var1.method2545(var2.field4271, 0, 2);
                    var2.field4272 = 0;
                    field535.field1279 = var2.method6219();
                    try {
                        Statics.method393(Statics.field3681, "zap");
                    } catch (Throwable var39) {
                    }
                    method2471(16);
                }
                if (field636 != 16) {
                    if (field636 == 17 && var1.method2543() >= 2) {
                        var2.field4272 = 0;
                        var1.method2545(var2.field4271, 0, 2);
                        var2.field4272 = 0;
                        Statics.field812 = var2.method6219();
                        method2471(18);
                    }
                    if (field636 == 18 && var1.method2543() >= Statics.field812) {
                        var2.field4272 = 0;
                        var1.method2545(var2.field4271, 0, Statics.field812);
                        var2.field4272 = 0;
                        String var34 = var2.method6226();
                        String var35 = var2.method6226();
                        String var36 = var2.method6226();
                        class69.method5760(var34, var35, var36);
                        method2034(10);
                    }
                    if (field636 == 19) {
                        if (field535.field1279 == -1) {
                            if (var1.method2543() < 2) {
                                return;
                            }
                            var1.method2545(var2.field4271, 0, 2);
                            var2.field4272 = 0;
                            field535.field1279 = var2.method6219();
                        }
                        if (var1.method2543() >= field535.field1279) {
                            var1.method2545(var2.field4271, 0, field535.field1279);
                            var2.field4272 = 0;
                            int var37 = field535.field1279;
                            field540.method5353();
                            method1852();
                            class96.method5290(var2);
                            if (var2.field4272 != var37) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field547++;
                        if (field547 > 2000) {
                            if (field517 < 1) {
                                if (Statics.field3296 == Statics.field1187) {
                                    Statics.field1187 = Statics.field2198;
                                } else {
                                    Statics.field1187 = Statics.field3296;
                                }
                                field517++;
                                method2471(0);
                            } else {
                                method1041(-3);
                            }
                        }
                    }
                } else if (var1.method2543() >= field535.field1279) {
                    var2.field4272 = 0;
                    var1.method2545(var2.field4271, 0, field535.field1279);
                    field540.method5351();
                    method602();
                    class96.method5290(var2);
                    Statics.field3892 = -1;
                    method4632(false, var2);
                    field535.field1278 = null;
                }
            }
        } catch (IOException var42) {
            if (field517 < 1) {
                if (Statics.field3296 == Statics.field1187) {
                    Statics.field1187 = Statics.field2198;
                } else {
                    Statics.field1187 = Statics.field3296;
                }
                field517++;
                method2471(0);
            } else {
                method1041(-2);
            }
        }
    }

    @ObfuscatedName("as.fg(I)V")
    public static void method602() {
        field494 = 1L;
        Statics.field2091.field1047 = 0;
        Statics.field3695 = true;
        field498 = true;
        field717 = -1L;
        class55.method2711();
        field535.method2209();
        field535.field1284.field4272 = 0;
        field535.field1278 = null;
        field535.field1289 = null;
        field535.field1290 = null;
        field535.field1291 = null;
        field535.field1279 = 0;
        field535.field1280 = 0;
        field500 = 0;
        field536 = 0;
        field501 = 0;
        field626 = 0;
        field625 = false;
        class33.method1777(0);
        class98.method1925();
        field602 = 0;
        field644 = false;
        field730 = 0;
        field559 = 0;
        field748 = 0;
        Statics.field83 = null;
        field727 = 0;
        field720 = -1;
        field586 = 0;
        field726 = 0;
        field509 = class94.field1236;
        field510 = class94.field1236;
        field531 = 0;
        class96.field1257 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class96.field1247[var0] = null;
            class96.field1246[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field605[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field530[var2] = null;
        }
        field565 = -1;
        field554.method4958();
        field620.method4958();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field569[var3][var4][var5] = null;
                }
            }
        }
        field618 = new class309();
        Statics.field100.method1569();
        for (int var6 = 0; var6 < Statics.field1615; var6++) {
            class153 var7 = class153.method2283(var6);
            if (var7 != null) {
                class257.field3000[var6] = 0;
                class257.field3001[var6] = 0;
            }
        }
        Statics.field3763.method2154();
        field585 = -1;
        if (field649 != -1) {
            class262.method2368(field649);
        }
        for (class80 var8 = (class80) field650.method6017(); var8 != null; var8 = (class80) field650.method6019()) {
            method3514(var8, true);
        }
        field649 = -1;
        field650 = new class379(8);
        field655 = null;
        field626 = 0;
        field625 = false;
        field529.method4478((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field607[var9] = null;
            field614[var9] = false;
        }
        class78.method3109();
        field492 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field698[var10] = true;
        }
        method4651();
        Statics.field1010 = null;
        Statics.field1233 = null;
        Arrays.fill(field718, (Object) null);
        Statics.field2133 = null;
        Arrays.fill(field719, (Object) null);
        for (int var11 = 0; var11 < 8; var11++) {
            field591[var11] = new class299();
        }
        Statics.field1393 = null;
    }

    @ObfuscatedName("bo.fs(I)V")
    public static void method1852() {
        field535.method2209();
        field535.field1284.field4272 = 0;
        field535.field1278 = null;
        field535.field1289 = null;
        field535.field1290 = null;
        field535.field1291 = null;
        field535.field1279 = 0;
        field535.field1280 = 0;
        field500 = 0;
        field626 = 0;
        field625 = false;
        field727 = 0;
        field586 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field605[var0] = null;
        }
        Statics.field1485 = null;
        for (int var1 = 0; var1 < field530.length; var1++) {
            class91 var2 = field530[var1];
            if (var2 != null) {
                var2.field1120 = -1;
                var2.field1144 = false;
            }
        }
        class78.method3109();
        method2034(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field698[var3] = true;
        }
        method4651();
    }

    @ObfuscatedName("bc.fq(II)V")
    public static void method1041(int arg0) {
        if (arg0 == -3) {
            class69.method5760(class283.field3376, class283.field3419, class283.field3378);
        } else if (arg0 == -2) {
            class69.method5760(class283.field3379, class283.field3380, class283.field3381);
        } else if (arg0 == -1) {
            class69.method5760(class283.field3382, class283.field3383, class283.field3384);
        } else if (arg0 == 3) {
            class69.method1040(3);
            class69.field884 = 1;
        } else if (arg0 == 4) {
            class69.method1040(14);
            class69.field875 = 0;
        } else if (arg0 == 5) {
            class69.field884 = 2;
            class69.method5760(class283.field3546, class283.field3389, class283.field3390);
        } else if (arg0 == 68 || !(field489 || arg0 != 6)) {
            class69.method5760(class283.field3391, class283.field3370, class283.field3489);
        } else if (arg0 == 7) {
            class69.method5760(class283.field3394, class283.field3395, class283.field3396);
        } else if (arg0 == 8) {
            class69.method5760(class283.field3398, class283.field3437, class283.field3399);
        } else if (arg0 == 9) {
            class69.method5760(class283.field3436, class283.field3483, class283.field3402);
        } else if (arg0 == 10) {
            class69.method5760(class283.field3553, class283.field3345, class283.field3405);
        } else if (arg0 == 11) {
            class69.method5760(class283.field3406, class283.field3397, class283.field3619);
        } else if (arg0 == 12) {
            class69.method5760(class283.field3409, class283.field3410, class283.field3411);
        } else if (arg0 == 13) {
            class69.method5760(class283.field3412, class283.field3441, class283.field3521);
        } else if (arg0 == 14) {
            class69.method5760(class283.field3415, class283.field3416, class283.field3500);
        } else if (arg0 == 16) {
            class69.method5760(class283.field3513, class283.field3377, class283.field3420);
        } else if (arg0 == 17) {
            class69.method5760(class283.field3421, class283.field3485, class283.field3423);
        } else if (arg0 == 18) {
            class69.method1040(14);
            class69.field875 = 1;
        } else if (arg0 == 19) {
            class69.method5760(class283.field3427, class283.field3428, class283.field3518);
        } else if (arg0 == 20) {
            class69.method5760(class283.field3501, class283.field3407, class283.field3331);
        } else if (arg0 == 22) {
            class69.method5760(class283.field3433, class283.field3434, class283.field3435);
        } else if (arg0 == 23) {
            class69.method5760(class283.field3588, class283.field3400, class283.field3438);
        } else if (arg0 == 24) {
            class69.method5760(class283.field3618, class283.field3446, class283.field3621);
        } else if (arg0 == 25) {
            class69.method5760(class283.field3442, class283.field3558, class283.field3636);
        } else if (arg0 == 26) {
            class69.method5760(class283.field3445, class283.field3371, class283.field3447);
        } else if (arg0 == 27) {
            class69.method5760(class283.field3359, class283.field3449, class283.field3528);
        } else if (arg0 == 31) {
            class69.method5760(class283.field3648, class283.field3458, class283.field3465);
        } else if (arg0 == 32) {
            class69.method5760(class283.field3589, class283.field3461, class283.field3462);
        } else if (arg0 == 37) {
            class69.method5760(class283.field3463, class283.field3464, class283.field3413);
        } else if (arg0 == 38) {
            class69.method5760(class283.field3466, class283.field3515, class283.field3468);
        } else if (arg0 == 55) {
            class69.method1040(8);
        } else if (arg0 == 56) {
            class69.method5760(class283.field3473, class283.field3474, class283.field3422);
            method2034(11);
            return;
        } else if (arg0 == 57) {
            class69.method5760(class283.field3476, class283.field3582, class283.field3480);
            method2034(11);
            return;
        } else if (arg0 == 61) {
            class69.method1040(7);
        } else if (arg0 == 62) {
            method2034(10);
            class69.method1040(9);
            class69.method5760(class283.field3644, class283.field3479, class283.field3481);
            return;
        } else if (arg0 == 63) {
            method2034(10);
            class69.method1040(9);
            class69.method5760(class283.field3459, class283.field3414, class283.field3484);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method2034(10);
            class69.method1040(9);
            class69.method5760(class283.field3514, class283.field3486, class283.field3487);
            return;
        } else {
            class69.method5760(class283.field3457, class283.field3332, class283.field3490);
        }
        method2034(10);
    }

    @ObfuscatedName("d.fc(I)V")
    public static final void method215() {
        field535.method2221();
        method2352();
        Statics.field1964.method3787();
        for (int var0 = 0; var0 < 4; var0++) {
            field695[var0].method3106();
        }
        System.gc();
        class248.method213(2);
        field503 = -1;
        field729 = false;
        for (class63 var1 = (class63) class63.field797.method4962(); var1 != null; var1 = (class63) class63.field797.method4985()) {
            if (var1.field811 != null) {
                Statics.field2965.method608(var1.field811);
                var1.field811 = null;
            }
            if (var1.field810 != null) {
                Statics.field2965.method608(var1.field810);
                var1.field810 = null;
            }
        }
        class63.field797.method4958();
        method2034(10);
    }

    @ObfuscatedName("dl.fv(I)V")
    public static final void method2352() {
        class171.method4187();
        class164.method1060();
        class156.field1653.method4168();
        class169.field1830.method4168();
        class169.field1823.method4168();
        class169.field1831.method4168();
        class169.field1825.method4168();
        class161.method2706();
        class170.method1237();
        class172.method305();
        class163.field1756.method4168();
        class163.field1760.method4168();
        class165.method4190();
        class153.field1616.method4168();
        Statics.field2012.method6103();
        Statics.field1441.method6103();
        class168.field1817.method4168();
        class168.field1800.method4168();
        class168.field1806.method4168();
        class157.field1668.method4168();
        class157.field1672.method4168();
        class167.field1793.method4168();
        class166.field1787.method4168();
        class154.method309();
        class260.method3543();
        class262.field3041.method4168();
        class262.field3112.method4168();
        class262.field3048.method4168();
        class262.field3043.method4168();
        ((class218) Statics.field2331).method3994();
        class72.field946.method4168();
        Statics.field2154.method4723();
        Statics.field859.method4723();
        Statics.field3026.method4723();
        Statics.field445.method4723();
        Statics.field1871.method4723();
        Statics.field3292.method4723();
        Statics.field1511.method4723();
        Statics.field787.method4723();
        Statics.field1646.method4723();
        Statics.field1042.method4723();
        Statics.field3862.method4723();
        Statics.field991.method4723();
    }

    @ObfuscatedName("if.fl(I)V")
    public static final void method4213() {
        if (field536 > 0) {
            method215();
        } else {
            field540.method5349();
            method2034(40);
            Statics.field3739 = field535.method2215();
            field535.method2220();
        }
    }

    @ObfuscatedName("cg.fn(ZI)V")
    public static final void method2178(boolean arg0) {
        if (arg0) {
            field519 = class69.field894 ? class113.field1357 : class113.field1360;
        } else {
            field519 = Statics.field1779.field1188.containsKey(class319.method4640(class69.field890)) ? class113.field1356 : class113.field1358;
        }
    }

    @ObfuscatedName("client.fz(I)V")
    public final void method1073() {
        if (field500 > 1) {
            field500--;
        }
        if (field536 > 0) {
            field536--;
        }
        if (field537) {
            field537 = false;
            method4213();
            return;
        }
        if (!field625) {
            Statics.method371();
        }
        for (int var1 = 0; var1 < 100 && this.method1138(field535); var1++) {
        }
        if (field490 != 30) {
            return;
        }
        while (true) {
            class56 var2 = (class56) class55.field436.method5007();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field540.field3890) {
                    class242 var6 = Statics.method1576(class240.field2670, field535.field1282);
                    var6.field2767.method6200(0);
                    int var7 = var6.field2767.field4272;
                    field540.method5360(var6.field2767);
                    var6.field2767.method6214(var6.field2767.field4272 - var7);
                    field535.method2211(var6);
                    field540.method5352();
                }
                Object var8 = Statics.field2091.field1046;
                synchronized (Statics.field2091.field1046) {
                    if (!field660) {
                        Statics.field2091.field1047 = 0;
                    } else if (class33.field236 != 0 || Statics.field2091.field1047 >= 40) {
                        class242 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field2091.field1047 && (var9 == null || var9.field2767.field4272 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field2091.field1043[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field2091.field1039[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field495 != var16 || field676 != var15) {
                                if (var9 == null) {
                                    var9 = Statics.method1576(class240.field2727, field535.field1282);
                                    var9.field2767.method6200(0);
                                    var10 = var9.field2767.field4272;
                                    var9.field2767.field4272 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field497 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field495;
                                    var18 = var15 - field676;
                                    var19 = (int) ((Statics.field2091.field1044[var14] - field497) / 20L);
                                    var12 = (int) ((Statics.field2091.field1044[var14] - field497) % 20L + (long) var12);
                                }
                                field495 = var16;
                                field676 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2767.method6311((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2767.method6200(var19 + 128);
                                    var9.field2767.method6311((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2767.method6200(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2767.method6203(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2767.method6203(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2767.method6311((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2767.method6203(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2767.method6203(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field497 = Statics.field2091.field1044[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2767.method6214(var9.field2767.field4272 - var10);
                            int var20 = var9.field2767.field4272;
                            var9.field2767.field4272 = var10;
                            var9.field2767.method6200(var12 / var13);
                            var9.field2767.method6200(var12 % var13);
                            var9.field2767.field4272 = var20;
                            field535.method2211(var9);
                        }
                        if (var11 >= Statics.field2091.field1047) {
                            Statics.field2091.field1047 = 0;
                        } else {
                            Statics.field2091.field1047 -= var11;
                            System.arraycopy(Statics.field2091.field1039, var11, Statics.field2091.field1039, 0, Statics.field2091.field1047);
                            System.arraycopy(Statics.field2091.field1043, var11, Statics.field2091.field1043, 0, Statics.field2091.field1047);
                            System.arraycopy(Statics.field2091.field1044, var11, Statics.field2091.field1044, 0, Statics.field2091.field1047);
                        }
                    }
                }
                if (class33.field236 == 1 || !Statics.field949 && class33.field236 == 4 || class33.field236 == 2) {
                    long var22 = class33.field228 - field494 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field494 = class33.field228 * -1L;
                    int var24 = class33.field238;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field200) {
                        var24 = Statics.field200;
                    }
                    int var25 = class33.field241;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field1611) {
                        var25 = Statics.field1611;
                    }
                    int var26 = (int) var22;
                    class242 var27 = Statics.method1576(class240.field2743, field535.field1282);
                    var27.field2767.method6311((class33.field236 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2767.method6311(var25);
                    var27.field2767.method6311(var24);
                    field535.method2211(var27);
                }
                if (class24.field115 > 0) {
                    class242 var28 = Statics.method1576(class240.field2731, field535.field1282);
                    var28.field2767.method6311(0);
                    int var29 = var28.field2767.field4272;
                    long var30 = class397.method3986();
                    for (int var32 = 0; var32 < class24.field115; var32++) {
                        long var33 = var30 - field717;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field717 = var30;
                        var28.field2767.method6260((int) var33);
                        var28.field2767.method6200(class24.field132[var32]);
                    }
                    var28.field2767.method6213(var28.field2767.field4272 - var29);
                    field535.method2211(var28);
                }
                if (field573 > 0) {
                    field573--;
                }
                if (class24.field123[96] || class24.field123[97] || class24.field123[98] || class24.field123[99]) {
                    field574 = true;
                }
                if (field574 && field573 <= 0) {
                    field573 = 20;
                    field574 = false;
                    class242 var35 = Statics.method1576(class240.field2648, field535.field1282);
                    var35.field2767.method6253(field487);
                    var35.field2767.method6353(field559);
                    field535.method2211(var35);
                }
                if (Statics.field3695 && !field498) {
                    field498 = true;
                    class242 var36 = Statics.method1576(class240.field2702, field535.field1282);
                    var36.field2767.method6200(1);
                    field535.method2211(var36);
                }
                if (!Statics.field3695 && field498) {
                    field498 = false;
                    class242 var37 = Statics.method1576(class240.field2702, field535.field1282);
                    var37.field2767.method6200(0);
                    field535.method2211(var37);
                }
                if (Statics.field858 != null) {
                    Statics.field858.method5787();
                }
                if (Statics.field4074) {
                    if (Statics.field1010 != null) {
                        Statics.field1010.method5496();
                    }
                    method110();
                    Statics.field4074 = false;
                }
                method965();
                if (Statics.field4237 != field720) {
                    field720 = Statics.field4237;
                    int var38 = Statics.field4237;
                    int[] var39 = Statics.field1370.field4369;
                    int var40 = var39.length;
                    for (int var41 = 0; var41 < var40; var41++) {
                        var39[var41] = 0;
                    }
                    for (int var42 = 1; var42 < 103; var42++) {
                        int var43 = (103 - var42) * 2048 + 24628;
                        for (int var44 = 1; var44 < 103; var44++) {
                            if ((class75.field977[var38][var44][var42] & 0x18) == 0) {
                                Statics.field1964.method3820(var39, var43, 512, var38, var44, var42);
                            }
                            if (var38 < 3 && (class75.field977[var38 + 1][var44][var42] & 0x8) != 0) {
                                Statics.field1964.method3820(var39, var43, 512, var38 + 1, var44, var42);
                            }
                            var43 += 4;
                        }
                    }
                    int var45 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var46 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field1370.method6634();
                    for (int var47 = 1; var47 < 103; var47++) {
                        for (int var48 = 1; var48 < 103; var48++) {
                            if ((class75.field977[var38][var48][var47] & 0x18) == 0) {
                                method5371(var38, var48, var47, var45, var46);
                            }
                            if (var38 < 3 && (class75.field977[var38 + 1][var48][var47] & 0x8) != 0) {
                                method5371(var38 + 1, var48, var47, var45, var46);
                            }
                        }
                    }
                    field653 = 0;
                    for (int var49 = 0; var49 < 104; var49++) {
                        for (int var50 = 0; var50 < 104; var50++) {
                            long var51 = Statics.field1964.method3815(Statics.field4237, var49, var50);
                            if (var51 != 0L) {
                                int var53 = class221.method2676(var51);
                                int var54 = class169.method2878(var53).field1852;
                                if (var54 >= 0 && class154.method1007(var54).field1630) {
                                    field548[field653] = class154.method1007(var54).method2602(false);
                                    field502[field653] = var49;
                                    field617[field653] = var50;
                                    field653++;
                                }
                            }
                        }
                    }
                    Statics.field58.method6584();
                }
                if (field490 != 30) {
                    return;
                }
                method43();
                int var10002;
                for (int var55 = 0; var55 < field730; var55++) {
                    var10002 = field733[var55]--;
                    if (field733[var55] >= -10) {
                        class35 var57 = field735[var55];
                        if (var57 == null) {
                            class35 var10000 = (class35) null;
                            var57 = class35.method663(Statics.field445, field731[var55], 0);
                            if (var57 == null) {
                                continue;
                            }
                            field733[var55] += var57.method655();
                            field735[var55] = var57;
                        }
                        if (field733[var55] < 0) {
                            int var64;
                            if (field734[var55] == 0) {
                                var64 = Statics.field1779.field1196;
                            } else {
                                int var58 = (field734[var55] & 0xFF) * 128;
                                int var59 = field734[var55] >> 16 & 0xFF;
                                int var60 = var59 * 128 + 64 - Statics.field1485.field1119;
                                if (var60 < 0) {
                                    var60 = -var60;
                                }
                                int var61 = field734[var55] >> 8 & 0xFF;
                                int var62 = var61 * 128 + 64 - Statics.field1485.field1096;
                                if (var62 < 0) {
                                    var62 = -var62;
                                }
                                int var63 = var60 + var62 - 128;
                                if (var63 > var58) {
                                    field733[var55] = -100;
                                    continue;
                                }
                                if (var63 < 0) {
                                    var63 = 0;
                                }
                                var64 = Statics.field1779.field1199 * (var58 - var63) / var58;
                            }
                            if (var64 > 0) {
                                class36 var65 = var57.method653().method669(Statics.field3799);
                                class43 var66 = class43.method772(var65, 100, var64);
                                var66.method775(field732[var55] - 1);
                                Statics.field2965.method607(var66);
                            }
                            field733[var55] = -100;
                        }
                    } else {
                        field730--;
                        for (int var56 = var55; var56 < field730; var56++) {
                            field731[var56] = field731[var56 + 1];
                            field735[var56] = field735[var56 + 1];
                            field732[var56] = field732[var56 + 1];
                            field733[var56] = field733[var56 + 1];
                            field734[var56] = field734[var56 + 1];
                        }
                        var55--;
                    }
                }
                if (field729 && !class248.method1629()) {
                    if (Statics.field1779.field1195 != 0 && field503 != -1) {
                        class248.method978(Statics.field3292, field503, 0, Statics.field1779.field1195, false);
                    }
                    field729 = false;
                }
                field535.field1280++;
                if (field535.field1280 > 750) {
                    method4213();
                    return;
                }
                method5723();
                for (int var67 = 0; var67 < field531; var67++) {
                    int var68 = field532[var67];
                    class91 var69 = field530[var68];
                    if (var69 != null) {
                        method4126(var69, var69.field1214.field1711);
                    }
                }
                method2969();
                field765++;
                if (field593 != 0) {
                    field592 += 20;
                    if (field592 >= 400) {
                        field593 = 0;
                    }
                }
                if (Statics.field3935 != null) {
                    field728++;
                    if (field728 >= 15) {
                        method2027(Statics.field3935);
                        Statics.field3935 = null;
                    }
                }
                class262 var70 = Statics.field3786;
                class262 var71 = Statics.field4228;
                Statics.field3786 = null;
                Statics.field4228 = null;
                field666 = null;
                field670 = false;
                field667 = false;
                field714 = 0;
                while (class24.method2655() && field714 < 128) {
                    if (field658 >= 2 && class24.field123[82] && Statics.field2995 == 66) {
                        String var72 = class98.method107();
                        Statics.field3681.method438(var72);
                    } else if (field748 != 1 || Statics.field1011 <= 0) {
                        field596[field714] = Statics.field2995;
                        field715[field714] = Statics.field1011;
                        field714++;
                    }
                }
                if (method1987() && class24.field123[82] && class24.field123[81] && field691 != 0) {
                    int var73 = Statics.field1485.field1067 - field691;
                    if (var73 < 0) {
                        var73 = 0;
                    } else if (var73 > 3) {
                        var73 = 3;
                    }
                    if (Statics.field1485.field1067 != var73) {
                        int var74 = Statics.field1942 + Statics.field1485.field1126[0];
                        int var75 = Statics.field3866 + Statics.field1485.field1150[0];
                        class242 var76 = Statics.method1576(class240.field2708, field535.field1282);
                        var76.field2767.method6311(var75);
                        var76.field2767.method6263(0);
                        var76.field2767.method6243(var73);
                        var76.field2767.method6253(var74);
                        field535.method2211(var76);
                    }
                    field691 = 0;
                }
                if (field649 != -1) {
                    method277(field649, 0, 0, Statics.field1611, Statics.field200, 0, 0);
                }
                field674++;
                while (true) {
                    class81 var77;
                    class262 var78;
                    class262 var79;
                    do {
                        var77 = (class81) field746.method4957();
                        if (var77 == null) {
                            while (true) {
                                class81 var80;
                                class262 var81;
                                class262 var82;
                                do {
                                    var80 = (class81) field694.method4957();
                                    if (var80 == null) {
                                        while (true) {
                                            class81 var83;
                                            class262 var84;
                                            class262 var85;
                                            do {
                                                var83 = (class81) field692.method4957();
                                                if (var83 == null) {
                                                    this.method1078();
                                                    if (Statics.field858 != null) {
                                                        Statics.field858.method5797(Statics.field4237, (Statics.field1485.field1119 >> 7) + Statics.field1942, (Statics.field1485.field1096 >> 7) + Statics.field3866, false);
                                                        Statics.field858.method5813();
                                                    }
                                                    if (field662 != null) {
                                                        this.method1082();
                                                    }
                                                    if (Statics.field390 != null) {
                                                        method2027(Statics.field390);
                                                        field685++;
                                                        if (class33.field239 == 0) {
                                                            if (field669) {
                                                                if (Statics.field390 == Statics.field3293 && field725 != field600) {
                                                                    class262 var86 = Statics.field390;
                                                                    byte var87 = 0;
                                                                    if (field610 == 1 && var86.field3050 == 206) {
                                                                        var87 = 1;
                                                                    }
                                                                    if (var86.field3174[field600] <= 0) {
                                                                        var87 = 0;
                                                                    }
                                                                    int var88 = method967(var86);
                                                                    boolean var89 = (var88 >> 29 & 0x1) != 0;
                                                                    if (var89) {
                                                                        int var90 = field725;
                                                                        int var91 = field600;
                                                                        var86.field3174[var91] = var86.field3174[var90];
                                                                        var86.field3047[var91] = var86.field3047[var90];
                                                                        var86.field3174[var90] = -1;
                                                                        var86.field3047[var90] = 0;
                                                                    } else if (var87 == 1) {
                                                                        int var92 = field725;
                                                                        int var93 = field600;
                                                                        while (var92 != var93) {
                                                                            if (var92 > var93) {
                                                                                var86.method4538(var92 - 1, var92);
                                                                                var92--;
                                                                            } else if (var92 < var93) {
                                                                                var86.method4538(var92 + 1, var92);
                                                                                var92++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var86.method4538(field600, field725);
                                                                    }
                                                                    class242 var94 = Statics.method1576(class240.field2679, field535.field1282);
                                                                    var94.field2767.method6264(Statics.field390.field3046);
                                                                    var94.field2767.method6353(field725);
                                                                    var94.field2767.method6221(var87);
                                                                    var94.field2767.method6253(field600);
                                                                    field535.method2211(var94);
                                                                }
                                                            } else if (this.method1257()) {
                                                                this.method1079(field598, field759);
                                                            } else if (field626 > 0) {
                                                                int var95 = field598;
                                                                int var96 = field759;
                                                                class67 var97 = Statics.field3670;
                                                                method5377(var97.field860, var97.field865, var97.field861, var97.field866, var97.field863, var97.field863, var95, var96);
                                                                Statics.field3670 = null;
                                                            }
                                                            field728 = 10;
                                                            class33.field236 = 0;
                                                            Statics.field390 = null;
                                                        } else if (field685 >= 5 && (class33.field221 > field598 + 5 || class33.field221 < field598 - 5 || class33.field230 > field759 + 5 || class33.field230 < field759 - 5)) {
                                                            field669 = true;
                                                        }
                                                    }
                                                    if (class213.method3825()) {
                                                        int var98 = class213.field2397;
                                                        int var99 = class213.field2364;
                                                        class242 var100 = Statics.method1576(class240.field2723, field535.field1282);
                                                        var100.field2767.method6200(5);
                                                        var100.field2767.method6243(class24.field123[82] ? (class24.field123[81] ? 2 : 1) : 0);
                                                        var100.field2767.method6353(Statics.field1942 + var98);
                                                        var100.field2767.method6254(Statics.field3866 + var99);
                                                        field535.method2211(var100);
                                                        class213.method3847();
                                                        field590 = class33.field241;
                                                        field723 = class33.field238;
                                                        field593 = 1;
                                                        field592 = 0;
                                                        field586 = var98;
                                                        field726 = var99;
                                                    }
                                                    if (Statics.field3786 != var70) {
                                                        if (var70 != null) {
                                                            method2027(var70);
                                                        }
                                                        if (Statics.field3786 != null) {
                                                            method2027(Statics.field3786);
                                                        }
                                                    }
                                                    if (Statics.field4228 != var71 && field641 == field584) {
                                                        if (var71 != null) {
                                                            method2027(var71);
                                                        }
                                                        if (Statics.field4228 != null) {
                                                            method2027(Statics.field4228);
                                                        }
                                                    }
                                                    if (Statics.field4228 == null) {
                                                        if (field584 > 0) {
                                                            field584--;
                                                        }
                                                    } else if (field584 < field641) {
                                                        field584++;
                                                        if (field641 == field584) {
                                                            method2027(Statics.field4228);
                                                        }
                                                    }
                                                    method4635();
                                                    if (field736) {
                                                        method226();
                                                    }
                                                    for (int var101 = 0; var101 < 5; var101++) {
                                                        var10002 = field741[var101]++;
                                                    }
                                                    Statics.field3763.method2158();
                                                    int var102 = class33.method755();
                                                    int var103 = class24.field139;
                                                    if (var102 > 15000 && var103 > 15000) {
                                                        field536 = 250;
                                                        class33.method1777(14500);
                                                        class242 var105 = Statics.method1576(class240.field2697, field535.field1282);
                                                        field535.method2211(var105);
                                                    }
                                                    Statics.field100.method1568();
                                                    field535.field1288++;
                                                    if (field535.field1288 > 50) {
                                                        class242 var106 = Statics.method1576(class240.field2705, field535.field1282);
                                                        field535.method2211(var106);
                                                    }
                                                    try {
                                                        field535.method2210();
                                                    } catch (IOException var108) {
                                                        method4213();
                                                    }
                                                    return;
                                                }
                                                var84 = var83.field1028;
                                                if (var84.field3077 < 0) {
                                                    break;
                                                }
                                                var85 = class262.method2073(var84.field3065);
                                            } while (var85 == null || var85.field3180 == null || var84.field3077 >= var85.field3180.length || var85.field3180[var84.field3077] != var84);
                                            Statics.method2499(var83);
                                        }
                                    }
                                    var81 = var80.field1028;
                                    if (var81.field3077 < 0) {
                                        break;
                                    }
                                    var82 = class262.method2073(var81.field3065);
                                } while (var82 == null || var82.field3180 == null || var81.field3077 >= var82.field3180.length || var82.field3180[var81.field3077] != var81);
                                Statics.method2499(var80);
                            }
                        }
                        var78 = var77.field1028;
                        if (var78.field3077 < 0) {
                            break;
                        }
                        var79 = class262.method2073(var78.field3065);
                    } while (var79 == null || var79.field3180 == null || var78.field3077 >= var79.field3180.length || var79.field3180[var78.field3077] != var78);
                    Statics.method2499(var77);
                }
            }
            class242 var4 = Statics.method1576(class240.field2738, field535.field1282);
            var4.field2767.method6200(0);
            int var5 = var4.field2767.field4272;
            class55.method2497(var4.field2767);
            var4.field2767.method6214(var4.field2767.field4272 - var5);
            field535.method2211(var4);
        }
    }

    @ObfuscatedName("c.fe(I)V")
    public static final void method16() {
        if (Statics.field3928 != null) {
            Statics.field3928.method702();
        }
        if (Statics.field1337 != null) {
            Statics.field1337.method702();
        }
    }

    @ObfuscatedName("cc.ff(Lfa;IIII)V")
    public static void method2037(class172 arg0, int arg1, int arg2, int arg3) {
        if (field730 >= 50 || Statics.field1779.field1199 == 0 || arg0.field1950 == null || arg1 >= arg0.field1950.length) {
            return;
        }
        int var4 = arg0.field1950[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field731[field730] = var5;
        field732[field730] = var6;
        field733[field730] = 0;
        field735[field730] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field734[field730] = (var8 << 16) + (var9 << 8) + var7;
        field730++;
    }

    @ObfuscatedName("ab.fy(IIII)V")
    public static void method737(int arg0, int arg1, int arg2) {
        if (Statics.field1779.field1196 == 0 || arg1 == 0 || field730 >= 50) {
            return;
        }
        field731[field730] = arg0;
        field732[field730] = arg1;
        field733[field730] = arg2;
        field735[field730] = null;
        field734[field730] = 0;
        field730++;
    }

    @ObfuscatedName("bj.fx(IB)V")
    public static void method1581(int arg0) {
        if (arg0 == -1 && !field729) {
            class248.method366();
        } else if (arg0 != -1 && field503 != arg0 && Statics.field1779.field1195 != 0 && !field729) {
            class288 var1 = Statics.field3292;
            int var2 = Statics.field1779.field1195;
            class248.field2901 = 1;
            Statics.field2900 = var1;
            Statics.field2903 = arg0;
            Statics.field478 = 0;
            Statics.field2183 = var2;
            Statics.field105 = false;
            Statics.field1486 = 2;
        }
        field503 = arg0;
    }

    @ObfuscatedName("gv.fa(III)V")
    public static void method3519(int arg0, int arg1) {
        if (Statics.field1779.field1195 != 0 && arg0 != -1) {
            class248.method978(Statics.field3862, arg0, 0, Statics.field1779.field1195, false);
            field729 = true;
        }
    }

    @ObfuscatedName("af.fk(B)V")
    public static final void method965() {
        if (!Statics.field1276) {
            return;
        }
        for (int var0 = 0; var0 < class96.field1257; var0++) {
            class83 var1 = field605[class96.field1249[var0]];
            var1.method2005();
        }
        Statics.field1276 = false;
    }

    @ObfuscatedName("db.fw(Ljd;III)V")
    public static final void method2333(class262 arg0, int arg1, int arg2) {
        if (field727 != 0 && field727 != 3 || field625 || !(class33.field236 == 1 || !Statics.field949 && class33.field236 == 4)) {
            return;
        }
        class256 var3 = arg0.method4529(true);
        if (var3 == null) {
            return;
        }
        int var4 = class33.field241 - arg1;
        int var5 = class33.field238 - arg2;
        if (!var3.method4437(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2997 / 2;
        int var7 = var5 - var3.field2998 / 2;
        int var8 = field559 & 0x7FF;
        int var9 = class211.field2346[var8];
        int var10 = class211.field2357[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1485.field1119 + var11 >> 7;
        int var14 = Statics.field1485.field1096 - var12 >> 7;
        class242 var15 = Statics.method1576(class240.field2688, field535.field1282);
        var15.field2767.method6200(18);
        var15.field2767.method6243(class24.field123[82] ? (class24.field123[81] ? 2 : 1) : 0);
        var15.field2767.method6353(Statics.field1942 + var13);
        var15.field2767.method6254(Statics.field3866 + var14);
        var15.field2767.method6200(var6);
        var15.field2767.method6200(var7);
        var15.field2767.method6311(field559);
        var15.field2767.method6200(57);
        var15.field2767.method6200(0);
        var15.field2767.method6200(0);
        var15.field2767.method6200(89);
        var15.field2767.method6311(Statics.field1485.field1119);
        var15.field2767.method6311(Statics.field1485.field1096);
        var15.field2767.method6200(63);
        field535.method2211(var15);
        field586 = var13;
        field726 = var14;
    }

    @ObfuscatedName("fy.fp(I)V")
    public static final void method2969() {
        int[] var0 = class96.field1249;
        for (int var1 = 0; var1 < class96.field1257; var1++) {
            class83 var2 = field605[var0[var1]];
            if (var2 != null && var2.field1110 > 0) {
                var2.field1110--;
                if (var2.field1110 == 0) {
                    var2.field1107 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field531; var3++) {
            int var4 = field532[var3];
            class91 var5 = field530[var4];
            if (var5 != null && var5.field1110 > 0) {
                var5.field1110--;
                if (var5.field1110 == 0) {
                    var5.field1107 = null;
                }
            }
        }
    }

    @ObfuscatedName("gk.fd(Ljava/lang/String;I)V")
    public static final void method3513(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1779.field1189 = !Statics.field1779.field1189;
            class89.method362();
            if (Statics.field1779.field1189) {
                class98.method1908(99, "", "Roofs are now all hidden");
            } else {
                class98.method1908(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field499 = !field499;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field608 = !field608;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field637 = !field637;
        }
        if (field658 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field858.field4114 = !Statics.field858.field4114;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field499 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field499 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method4213();
            }
        }
        class242 var1 = Statics.method1576(class240.field2662, field535.field1282);
        var1.field2767.method6200(arg0.length() + 1);
        var1.field2767.method6242(arg0);
        field535.method2211(var1);
    }

    @ObfuscatedName("q.fj(I)V")
    public static final void method226() {
        int var0 = Statics.field1373 * 128 + 64;
        int var1 = Statics.field448 * 128 + 64;
        int var2 = method1770(var0, var1, Statics.field4237) - Statics.field124;
        if (Statics.field2033 < var0) {
            Statics.field2033 += Statics.field1362 * (var0 - Statics.field2033) / 1000 + Statics.field2002;
            if (Statics.field2033 > var0) {
                Statics.field2033 = var0;
            }
        }
        if (Statics.field2033 > var0) {
            Statics.field2033 -= Statics.field1362 * (Statics.field2033 - var0) / 1000 + Statics.field2002;
            if (Statics.field2033 < var0) {
                Statics.field2033 = var0;
            }
        }
        if (Statics.field1754 < var2) {
            Statics.field1754 += Statics.field1362 * (var2 - Statics.field1754) / 1000 + Statics.field2002;
            if (Statics.field1754 > var2) {
                Statics.field1754 = var2;
            }
        }
        if (Statics.field1754 > var2) {
            Statics.field1754 -= Statics.field1362 * (Statics.field1754 - var2) / 1000 + Statics.field2002;
            if (Statics.field1754 < var2) {
                Statics.field1754 = var2;
            }
        }
        if (Statics.field155 < var1) {
            Statics.field155 += Statics.field1362 * (var1 - Statics.field155) / 1000 + Statics.field2002;
            if (Statics.field155 > var1) {
                Statics.field155 = var1;
            }
        }
        if (Statics.field155 > var1) {
            Statics.field155 -= Statics.field1362 * (Statics.field155 - var1) / 1000 + Statics.field2002;
            if (Statics.field155 < var1) {
                Statics.field155 = var1;
            }
        }
        int var3 = Statics.field1377 * 128 + 64;
        int var4 = Statics.field2625 * 128 + 64;
        int var5 = method1770(var3, var4, Statics.field4237) - Statics.field171;
        int var6 = var3 - Statics.field2033;
        int var7 = var5 - Statics.field1754;
        int var8 = var4 - Statics.field155;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field473 < var10) {
            Statics.field473 += Statics.field924 * (var10 - Statics.field473) / 1000 + Statics.field3919;
            if (Statics.field473 > var10) {
                Statics.field473 = var10;
            }
        }
        if (Statics.field473 > var10) {
            Statics.field473 -= Statics.field924 * (Statics.field473 - var10) / 1000 + Statics.field3919;
            if (Statics.field473 < var10) {
                Statics.field473 = var10;
            }
        }
        int var12 = var11 - Statics.field4169;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field4169 += Statics.field924 * var12 / 1000 + Statics.field3919;
            Statics.field4169 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field4169 -= Statics.field924 * -var12 / 1000 + Statics.field3919;
            Statics.field4169 &= 0x7FF;
        }
        int var13 = var11 - Statics.field4169;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field4169 = var11;
        }
    }

    @ObfuscatedName("je.fb(I)V")
    public static final void method4635() {
        if (field748 == 0) {
            int var0 = Statics.field1485.field1119;
            int var1 = Statics.field1485.field1096;
            if (Statics.field2179 - var0 < -500 || Statics.field2179 - var0 > 500 || Statics.field2153 - var1 < -500 || Statics.field2153 - var1 > 500) {
                Statics.field2179 = var0;
                Statics.field2153 = var1;
            }
            if (Statics.field2179 != var0) {
                Statics.field2179 += (var0 - Statics.field2179) / 16;
            }
            if (Statics.field2153 != var1) {
                Statics.field2153 += (var1 - Statics.field2153) / 16;
            }
            int var2 = Statics.field2179 >> 7;
            int var3 = Statics.field2153 >> 7;
            int var4 = method1770(Statics.field2179, Statics.field2153, Statics.field4237);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field4237;
                        if (var8 < 3 && (class75.field977[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class75.field976[var8][var6][var7];
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
            if (var10 > field484) {
                field484 += (var10 - field484) / 24;
            } else if (var10 < field484) {
                field484 += (var10 - field484) / 80;
            }
            Statics.field1474 = method1770(Statics.field1485.field1119, Statics.field1485.field1096, Statics.field4237) - field541;
        } else if (field748 == 1) {
            if (field742 && Statics.field1485 != null) {
                int var11 = Statics.field1485.field1126[0];
                int var12 = Statics.field1485.field1150[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field2179 = Statics.field1485.field1119;
                    int var13 = method1770(Statics.field1485.field1119, Statics.field1485.field1096, Statics.field4237) - field541;
                    if (var13 < Statics.field1474) {
                        Statics.field1474 = var13;
                    }
                    Statics.field2153 = Statics.field1485.field1096;
                    field742 = false;
                }
            }
            short var14 = -1;
            if (class24.field123[33]) {
                var14 = 0;
            } else if (class24.field123[49]) {
                var14 = 1024;
            }
            if (class24.field123[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class24.field123[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class24.field123[35]) {
                var15 = -1;
            } else if (class24.field123[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class24.field123[81] ? field599 : field570;
                var16 = var17 * 16;
                field567 = var14;
                field568 = var15;
            }
            if (field566 < var16) {
                field566 += var16 / 8;
                if (field566 > var16) {
                    field566 = var16;
                }
            } else if (field566 > var16) {
                field566 = field566 * 9 / 10;
            }
            if (field566 > 0) {
                int var18 = field566 / 16;
                if (field567 >= 0) {
                    int var19 = field567 - Statics.field4169 & 0x7FF;
                    int var20 = class211.field2346[var19];
                    int var21 = class211.field2357[var19];
                    Statics.field2179 += var18 * var20 / 65536;
                    Statics.field2153 += var18 * var21 / 65536;
                }
                if (field568 != 0) {
                    Statics.field1474 += field568 * var18;
                    if (Statics.field1474 > 0) {
                        Statics.field1474 = 0;
                    }
                }
            } else {
                field567 = -1;
                field568 = -1;
            }
            if (class24.field123[13]) {
                method4852();
            }
        }
        if (class33.field239 == 4 && Statics.field949) {
            int var22 = class33.field230 - field563;
            field699 = var22 * 2;
            field563 = var22 == -1 || var22 == 1 ? class33.field230 : (field563 + class33.field230) / 2;
            int var23 = field562 - class33.field221;
            field560 = var23 * 2;
            field562 = var23 == -1 || var23 == 1 ? class33.field221 : (field562 + class33.field221) / 2;
        } else {
            if (class24.field123[96]) {
                field560 += (-24 - field560) / 2;
            } else if (class24.field123[97]) {
                field560 += (24 - field560) / 2;
            } else {
                field560 /= 2;
            }
            if (class24.field123[98]) {
                field699 += (12 - field699) / 2;
            } else if (class24.field123[99]) {
                field699 += (-12 - field699) / 2;
            } else {
                field699 /= 2;
            }
            field563 = class33.field230;
            field562 = class33.field221;
        }
        field559 = field560 / 2 + field559 & 0x7FF;
        field487 += field699 / 2;
        if (field487 < 128) {
            field487 = 128;
        }
        if (field487 > 383) {
            field487 = 383;
        }
    }

    @ObfuscatedName("mu.fh(B)V")
    public static final void method5723() {
        int var0 = class96.field1257;
        int[] var1 = class96.field1249;
        for (int var2 = 0; var2 < var0; var2++) {
            class83 var3 = field605[var1[var2]];
            if (var3 != null) {
                method4126(var3, 1);
            }
        }
    }

    @ObfuscatedName("hw.fi(Lcf;IB)V")
    public static final void method4126(class85 arg0, int arg1) {
        if (arg0.field1140 >= field744) {
            method4130(arg0);
        } else if (arg0.field1141 >= field744) {
            method20(arg0);
        } else {
            method2684(arg0);
        }
        if (arg0.field1119 < 128 || arg0.field1096 < 128 || arg0.field1119 >= 13184 || arg0.field1096 >= 13184) {
            arg0.field1130 = -1;
            arg0.field1131 = -1;
            arg0.field1140 = 0;
            arg0.field1141 = 0;
            arg0.field1119 = arg0.field1126[0] * 128 + arg0.field1138 * 64;
            arg0.field1096 = arg0.field1150[0] * 128 + arg0.field1138 * 64;
            arg0.method2016();
        }
        if (Statics.field1485 == arg0 && (arg0.field1119 < 1536 || arg0.field1096 < 1536 || arg0.field1119 >= 11776 || arg0.field1096 >= 11776)) {
            arg0.field1130 = -1;
            arg0.field1131 = -1;
            arg0.field1140 = 0;
            arg0.field1141 = 0;
            arg0.field1119 = arg0.field1126[0] * 128 + arg0.field1138 * 64;
            arg0.field1096 = arg0.field1150[0] * 128 + arg0.field1138 * 64;
            arg0.method2016();
        }
        if (arg0.field1147 != 0) {
            if (arg0.field1120 != -1) {
                class85 var2 = null;
                if (arg0.field1120 < 32768) {
                    var2 = field530[arg0.field1120];
                } else if (arg0.field1120 >= 32768) {
                    var2 = field605[arg0.field1120 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg0.field1119 - var2.field1119;
                    int var4 = arg0.field1096 - var2.field1096;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field1145 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1144) {
                    arg0.field1120 = -1;
                    arg0.field1144 = false;
                }
            }
            if (arg0.field1097 != -1 && (arg0.field1148 == 0 || arg0.field1152 > 0)) {
                arg0.field1145 = arg0.field1097;
                arg0.field1097 = -1;
            }
            int var5 = arg0.field1145 - arg0.field1095 & 0x7FF;
            if (var5 == 0 && arg0.field1144) {
                arg0.field1120 = -1;
                arg0.field1144 = false;
            }
            if (var5 == 0) {
                arg0.field1146 = 0;
            } else {
                arg0.field1146++;
                if (var5 > 1024) {
                    arg0.field1095 -= arg0.field1147;
                    boolean var6 = true;
                    if (var5 < arg0.field1147 || var5 > 2048 - arg0.field1147) {
                        arg0.field1095 = arg0.field1145;
                        var6 = false;
                    }
                    if (arg0.field1143 == arg0.field1099 && (arg0.field1146 > 25 || var6)) {
                        if (arg0.field1123 == -1) {
                            arg0.field1143 = arg0.field1121;
                        } else {
                            arg0.field1143 = arg0.field1123;
                        }
                    }
                } else {
                    arg0.field1095 += arg0.field1147;
                    boolean var7 = true;
                    if (var5 < arg0.field1147 || var5 > 2048 - arg0.field1147) {
                        arg0.field1095 = arg0.field1145;
                        var7 = false;
                    }
                    if (arg0.field1143 == arg0.field1099 && (arg0.field1146 > 25 || var7)) {
                        if (arg0.field1101 == -1) {
                            arg0.field1143 = arg0.field1121;
                        } else {
                            arg0.field1143 = arg0.field1101;
                        }
                    }
                }
                arg0.field1095 &= 0x7FF;
            }
        }
        method2007(arg0);
    }

    @ObfuscatedName("hj.fr(Lcf;I)V")
    public static final void method4130(class85 arg0) {
        int var1 = Math.max(1, arg0.field1140 - field744);
        int var2 = arg0.field1138 * 64 + arg0.field1136 * 128;
        int var3 = arg0.field1142 * 128 + arg0.field1138 * 64;
        arg0.field1119 += (var2 - arg0.field1119) / var1;
        arg0.field1096 += (var3 - arg0.field1096) / var1;
        arg0.field1152 = 0;
        arg0.field1145 = arg0.field1102;
    }

    @ObfuscatedName("o.fm(Lcf;I)V")
    public static final void method20(class85 arg0) {
        if (field744 == arg0.field1141 || arg0.field1130 == -1 || arg0.field1129 != 0 || arg0.field1128 + 1 > class172.method269(arg0.field1130).field1951[arg0.field1127]) {
            int var1 = arg0.field1141 - arg0.field1140;
            int var2 = field744 - arg0.field1140;
            int var3 = arg0.field1138 * 64 + arg0.field1136 * 128;
            int var4 = arg0.field1142 * 128 + arg0.field1138 * 64;
            int var5 = arg0.field1138 * 64 + arg0.field1122 * 128;
            int var6 = arg0.field1138 * 64 + arg0.field1111 * 128;
            arg0.field1119 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1096 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1152 = 0;
        arg0.field1145 = arg0.field1102;
        arg0.field1095 = arg0.field1145;
    }

    @ObfuscatedName("fo.gd(Lcf;I)V")
    public static final void method2684(class85 arg0) {
        arg0.field1143 = arg0.field1099;
        if (arg0.field1148 == 0) {
            arg0.field1152 = 0;
            return;
        }
        if (arg0.field1130 != -1 && arg0.field1129 == 0) {
            class172 var1 = class172.method269(arg0.field1130);
            if (arg0.field1153 > 0 && var1.field1960 == 0) {
                arg0.field1152++;
                return;
            }
            if (arg0.field1153 <= 0 && var1.field1961 == 0) {
                arg0.field1152++;
                return;
            }
        }
        int var2 = arg0.field1119;
        int var3 = arg0.field1096;
        int var4 = arg0.field1126[arg0.field1148 - 1] * 128 + arg0.field1138 * 64;
        int var5 = arg0.field1150[arg0.field1148 - 1] * 128 + arg0.field1138 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1145 = 1280;
            } else if (var3 > var5) {
                arg0.field1145 = 1792;
            } else {
                arg0.field1145 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1145 = 768;
            } else if (var3 > var5) {
                arg0.field1145 = 256;
            } else {
                arg0.field1145 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1145 = 1024;
        } else if (var3 > var5) {
            arg0.field1145 = 0;
        }
        byte var6 = arg0.field1151[arg0.field1148 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1119 = var4;
            arg0.field1096 = var5;
            arg0.field1148--;
            if (arg0.field1153 > 0) {
                arg0.field1153--;
            }
            return;
        }
        int var7 = arg0.field1145 - arg0.field1095 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1103;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1121;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1105;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1104;
        }
        if (var8 == -1) {
            var8 = arg0.field1121;
        }
        arg0.field1143 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class91) {
            var10 = ((class91) arg0).field1214.field1739;
        }
        if (var10) {
            if (arg0.field1145 != arg0.field1095 && arg0.field1120 == -1 && arg0.field1147 != 0) {
                var9 = 2;
            }
            if (arg0.field1148 > 2) {
                var9 = 6;
            }
            if (arg0.field1148 > 3) {
                var9 = 8;
            }
            if (arg0.field1152 > 0 && arg0.field1148 > 1) {
                var9 = 8;
                arg0.field1152--;
            }
        } else {
            if (arg0.field1148 > 1) {
                var9 = 6;
            }
            if (arg0.field1148 > 2) {
                var9 = 8;
            }
            if (arg0.field1152 > 0 && arg0.field1148 > 1) {
                var9 = 8;
                arg0.field1152--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1143 == arg0.field1121 && arg0.field1106 != -1) {
            arg0.field1143 = arg0.field1106;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1119 += var9;
                if (arg0.field1119 > var4) {
                    arg0.field1119 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1119 -= var9;
                if (arg0.field1119 < var4) {
                    arg0.field1119 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1096 += var9;
                if (arg0.field1096 > var5) {
                    arg0.field1096 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1096 -= var9;
                if (arg0.field1096 < var5) {
                    arg0.field1096 = var5;
                }
            }
        }
        if (arg0.field1119 == var4 && arg0.field1096 == var5) {
            arg0.field1148--;
            if (arg0.field1153 > 0) {
                arg0.field1153--;
            }
        }
    }

    @ObfuscatedName("co.gg(Lcf;I)V")
    public static final void method2007(class85 arg0) {
        arg0.field1094 = false;
        if (arg0.field1143 != -1) {
            class172 var1 = class172.method269(arg0.field1143);
            if (var1 == null || var1.field1952 == null) {
                arg0.field1143 = -1;
            } else {
                arg0.field1149++;
                if (arg0.field1124 < var1.field1952.length && arg0.field1149 > var1.field1951[arg0.field1124]) {
                    arg0.field1149 = 1;
                    arg0.field1124++;
                    method2037(var1, arg0.field1124, arg0.field1119, arg0.field1096);
                }
                if (arg0.field1124 >= var1.field1952.length) {
                    arg0.field1149 = 0;
                    arg0.field1124 = 0;
                    method2037(var1, arg0.field1124, arg0.field1119, arg0.field1096);
                }
            }
        }
        if (arg0.field1131 != -1 && field744 >= arg0.field1134) {
            if (arg0.field1132 < 0) {
                arg0.field1132 = 0;
            }
            int var2 = class163.method2520(arg0.field1131).field1751;
            if (var2 == -1) {
                arg0.field1131 = -1;
            } else {
                class172 var3 = class172.method269(var2);
                if (var3 == null || var3.field1952 == null) {
                    arg0.field1131 = -1;
                } else {
                    arg0.field1125++;
                    if (arg0.field1132 < var3.field1952.length && arg0.field1125 > var3.field1951[arg0.field1132]) {
                        arg0.field1125 = 1;
                        arg0.field1132++;
                        method2037(var3, arg0.field1132, arg0.field1119, arg0.field1096);
                    }
                    if (arg0.field1132 >= var3.field1952.length && (arg0.field1132 < 0 || arg0.field1132 >= var3.field1952.length)) {
                        arg0.field1131 = -1;
                    }
                }
            }
        }
        if (arg0.field1130 != -1 && arg0.field1129 <= 1) {
            class172 var4 = class172.method269(arg0.field1130);
            if (var4.field1960 == 1 && arg0.field1153 > 0 && arg0.field1140 <= field744 && arg0.field1141 < field744) {
                arg0.field1129 = 1;
                return;
            }
        }
        if (arg0.field1130 != -1 && arg0.field1129 == 0) {
            class172 var5 = class172.method269(arg0.field1130);
            if (var5 == null || var5.field1952 == null) {
                arg0.field1130 = -1;
            } else {
                arg0.field1128++;
                if (arg0.field1127 < var5.field1952.length && arg0.field1128 > var5.field1951[arg0.field1127]) {
                    arg0.field1128 = 1;
                    arg0.field1127++;
                    method2037(var5, arg0.field1127, arg0.field1119, arg0.field1096);
                }
                if (arg0.field1127 >= var5.field1952.length) {
                    arg0.field1127 -= var5.field1958;
                    arg0.field1100++;
                    if (arg0.field1100 >= var5.field1959) {
                        arg0.field1130 = -1;
                    } else if (arg0.field1127 >= 0 && arg0.field1127 < var5.field1952.length) {
                        method2037(var5, arg0.field1127, arg0.field1119, arg0.field1096);
                    } else {
                        arg0.field1130 = -1;
                    }
                }
                arg0.field1094 = var5.field1955;
            }
        }
        if (arg0.field1129 > 0) {
            arg0.field1129--;
        }
    }

    @ObfuscatedName("cs.gt(Lco;III)V")
    public static void method2232(class83 arg0, int arg1, int arg2) {
        if (arg0.field1130 == arg1 && arg1 != -1) {
            int var3 = class172.method269(arg1).field1962;
            if (var3 == 1) {
                arg0.field1127 = 0;
                arg0.field1128 = 0;
                arg0.field1129 = arg2;
                arg0.field1100 = 0;
            }
            if (var3 == 2) {
                arg0.field1100 = 0;
            }
        } else if (arg1 == -1 || arg0.field1130 == -1 || class172.method269(arg1).field1956 >= class172.method269(arg0.field1130).field1956) {
            arg0.field1130 = arg1;
            arg0.field1127 = 0;
            arg0.field1128 = 0;
            arg0.field1129 = arg2;
            arg0.field1100 = 0;
            arg0.field1153 = arg0.field1148;
        }
    }

    @ObfuscatedName("v.gs(I)I")
    public static int method151() {
        return field707 ? 2 : 1;
    }

    @ObfuscatedName("bp.gn(II)V")
    public static void method1011(int arg0) {
        field706 = 0L;
        if (arg0 >= 2) {
            field707 = true;
        } else {
            field707 = false;
        }
        if (method151() == 1) {
            Statics.field3681.method566(765, 503);
        } else {
            Statics.field3681.method566(7680, 2160);
        }
        if (field490 >= 25) {
            method4651();
        }
    }

    @ObfuscatedName("jk.gj(B)V")
    public static void method4651() {
        class242 var0 = Statics.method1576(class240.field2665, field535.field1282);
        var0.field2767.method6200(method151());
        var0.field2767.method6311(Statics.field1611);
        var0.field2767.method6311(Statics.field200);
        field535.method2211(var0);
    }

    @ObfuscatedName("client.f(I)V")
    public final void method530() {
        field706 = class397.method3986() + 500L;
        this.method1181();
        if (field649 != -1) {
            this.method1080(true);
        }
    }

    @ObfuscatedName("client.gu(B)V")
    public void method1181() {
        int var1 = Statics.field1611;
        int var2 = Statics.field200;
        if (this.field219 < var1) {
            int var3 = this.field219;
        }
        if (this.field197 < var2) {
            int var4 = this.field197;
        }
        if (Statics.field1779 == null) {
            return;
        }
        try {
            client var5 = Statics.field3681;
            Object[] var6 = new Object[] { method151() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gy(I)V")
    public final void method1416() {
        if (field649 != -1) {
            int var1 = field649;
            if (class262.method5238(var1)) {
                method2346(Statics.field1535[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field700; var2++) {
            if (field698[var2]) {
                field767[var2] = true;
            }
            field688[var2] = field698[var2];
            field698[var2] = false;
        }
        field697 = field744;
        field638 = -1;
        field639 = -1;
        Statics.field3293 = null;
        if (field649 != -1) {
            field700 = 0;
            method402(field649, 0, 0, Statics.field1611, Statics.field200, 0, 0, -1);
        }
        class409.method6518();
        if (field511) {
            if (field593 == 1) {
                Statics.field63[field592 / 100].method6615(field590 - 8, field723 - 8);
            }
            if (field593 == 2) {
                Statics.field63[field592 / 100 + 4].method6615(field590 - 8, field723 - 8);
            }
        }
        if (field625) {
            method6139();
        } else if (field638 != -1) {
            int var3 = field638;
            int var4 = field639;
            if ((field626 >= 2 || field602 != 0 || field644) && field637) {
                int var5 = method405();
                String var6;
                if (field602 == 1 && field626 < 2) {
                    var6 = class283.field3494 + class283.field3504 + field722 + " " + class92.field1216;
                } else if (field644 && field626 < 2) {
                    var6 = field647 + class283.field3504 + field628 + " " + class92.field1216;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field652[var5].length() > 0) {
                        var7 = field575[var5] + class283.field3504 + field652[var5];
                    } else {
                        var7 = field575[var5];
                    }
                    var6 = var7;
                }
                if (field626 > 2) {
                    var6 = var6 + class92.method1001(16777215) + " " + '/' + " " + (field626 - 2) + class283.field3498;
                }
                Statics.field53.method5142(var6, var3 + 4, var4 + 15, 16777215, 0, field744 / 1000);
            }
        }
        if (field705 == 3) {
            for (int var8 = 0; var8 < field700; var8++) {
                if (field688[var8]) {
                    class409.method6563(field701[var8], field702[var8], field703[var8], field721[var8], 16711935, 128);
                } else if (field767[var8]) {
                    class409.method6563(field701[var8], field702[var8], field703[var8], field721[var8], 16711680, 128);
                }
            }
        }
        int var9 = Statics.field4237;
        int var10 = Statics.field1485.field1119;
        int var11 = Statics.field1485.field1096;
        int var12 = field765;
        for (class63 var13 = (class63) class63.field797.method4962(); var13 != null; var13 = (class63) class63.field797.method4985()) {
            if (var13.field804 != -1 || var13.field803 != null) {
                int var14 = 0;
                if (var10 > var13.field807) {
                    var14 += var10 - var13.field807;
                } else if (var10 < var13.field799) {
                    var14 += var13.field799 - var10;
                }
                if (var11 > var13.field802) {
                    var14 += var11 - var13.field802;
                } else if (var11 < var13.field800) {
                    var14 += var13.field800 - var11;
                }
                if (var14 - 64 > var13.field805 || Statics.field1779.field1199 == 0 || var13.field798 != var9) {
                    if (var13.field811 != null) {
                        Statics.field2965.method608(var13.field811);
                        var13.field811 = null;
                    }
                    if (var13.field810 != null) {
                        Statics.field2965.method608(var13.field810);
                        var13.field810 = null;
                    }
                } else {
                    var14 -= 64;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = Statics.field1779.field1199 * (var13.field805 - var14) / var13.field805;
                    class35 var10000;
                    if (var13.field811 != null) {
                        var13.field811.method776(var15);
                    } else if (var13.field804 >= 0) {
                        var10000 = (class35) null;
                        class35 var16 = class35.method663(Statics.field445, var13.field804, 0);
                        if (var16 != null) {
                            class36 var17 = var16.method653().method669(Statics.field3799);
                            class43 var18 = class43.method772(var17, 100, var15);
                            var18.method775(-1);
                            Statics.field2965.method607(var18);
                            var13.field811 = var18;
                        }
                    }
                    if (var13.field810 != null) {
                        var13.field810.method776(var15);
                        if (!var13.field810.method5733()) {
                            var13.field810 = null;
                        }
                    } else if (var13.field803 != null && (var13.field809 -= var12) <= 0) {
                        int var19 = (int) (Math.random() * (double) var13.field803.length);
                        var10000 = (class35) null;
                        class35 var20 = class35.method663(Statics.field445, var13.field803[var19], 0);
                        if (var20 != null) {
                            class36 var21 = var20.method653().method669(Statics.field3799);
                            class43 var22 = class43.method772(var21, 100, var15);
                            var22.method775(0);
                            Statics.field2965.method607(var22);
                            var13.field810 = var22;
                            var13.field809 = var13.field806 + (int) (Math.random() * (double) (var13.field801 - var13.field806));
                        }
                    }
                }
            }
        }
        field765 = 0;
    }

    @ObfuscatedName("gg.gf(Ljava/lang/String;ZI)V")
    public static final void method3451(String arg0, boolean arg1) {
        if (!field480) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1480.method5130(arg0, 250);
        int var6 = Statics.field1480.method5131(arg0, 250) * 13;
        class409.method6556(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class409.method6531(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1480.method5138(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field700; var11++) {
            if (field703[var11] + field701[var11] > var7 && field701[var11] < var7 + var9 && field721[var11] + field702[var11] > var8 && field702[var11] < var8 + var10) {
                field698[var11] = true;
            }
        }
        if (arg1) {
            Statics.field58.method421(0, 0);
            return;
        }
        int var12 = var3;
        int var13 = var4;
        int var14 = var5;
        int var15 = var6;
        for (int var16 = 0; var16 < field700; var16++) {
            if (field703[var16] + field701[var16] > var12 && field701[var16] < var12 + var14 && field721[var16] + field702[var16] > var13 && field702[var16] < var13 + var15) {
                field767[var16] = true;
            }
        }
    }

    @ObfuscatedName("cz.gc(IIIIB)V")
    public static final void method2272(int arg0, int arg1, int arg2, int arg3) {
        field542++;
        if (Statics.field1485.field1119 >> 7 == field586 && Statics.field1485.field1096 >> 7 == field726) {
            field586 = 0;
        }
        method3141();
        method1061();
        method5453(true);
        method1851();
        method5453(false);
        for (class70 var4 = (class70) field554.method4962(); var4 != null; var4 = (class70) field554.method4985()) {
            if (Statics.field4237 != var4.field927 || field744 > var4.field932) {
                var4.method5732();
            } else if (field744 >= var4.field912) {
                if (var4.field916 > 0) {
                    class91 var5 = field530[var4.field916 - 1];
                    if (var5 != null && var5.field1119 >= 0 && var5.field1119 < 13312 && var5.field1096 >= 0 && var5.field1096 < 13312) {
                        var4.method1818(var5.field1119, var5.field1096, method1770(var5.field1119, var5.field1096, var4.field927) - var4.field911, field744);
                    }
                }
                if (var4.field916 < 0) {
                    int var6 = -var4.field916 - 1;
                    class83 var7;
                    if (field606 == var6) {
                        var7 = Statics.field1485;
                    } else {
                        var7 = field605[var6];
                    }
                    if (var7 != null && var7.field1119 >= 0 && var7.field1119 < 13312 && var7.field1096 >= 0 && var7.field1096 < 13312) {
                        var4.method1818(var7.field1119, var7.field1096, method1770(var7.field1119, var7.field1096, var4.field927) - var4.field911, field744);
                    }
                }
                var4.method1819(field765);
                Statics.field1964.method3798(Statics.field4237, (int) var4.field906, (int) var4.field919, (int) var4.field925, 60, var4, var4.field926, -1L, false);
            }
        }
        for (class65 var8 = (class65) field620.method4962(); var8 != null; var8 = (class65) field620.method4985()) {
            if (Statics.field4237 != var8.field836 || var8.field843) {
                var8.method5732();
            } else if (field744 >= var8.field841) {
                var8.method1765(field765);
                if (var8.field843) {
                    var8.method5732();
                } else {
                    Statics.field1964.method3798(var8.field836, var8.field837, var8.field842, var8.field839, 60, var8, 0, -1L, false);
                }
            }
        }
        method84(arg0, arg1, arg2, arg3, true);
        int var9 = field750;
        int var10 = field751;
        int var11 = field752;
        int var12 = field753;
        class409.method6519(var9, var10, var9 + var11, var10 + var12);
        class211.method3700();
        if (!field736) {
            int var13 = field487;
            if (field484 / 256 > var13) {
                var13 = field484 / 256;
            }
            if (field737[4] && field739[4] + 128 > var13) {
                var13 = field739[4] + 128;
            }
            int var14 = field559 & 0x7FF;
            method15(Statics.field2179, Statics.field1474, Statics.field2153, var13, var14, method6073(var13), var12);
        }
        int var27;
        if (field736) {
            int var28;
            if (Statics.field1779.field1189) {
                var28 = Statics.field4237;
            } else {
                int var29 = method1770(Statics.field2033, Statics.field155, Statics.field4237);
                if (var29 - Statics.field1754 >= 800 || (class75.field977[Statics.field4237][Statics.field2033 >> 7][Statics.field155 >> 7] & 0x4) == 0) {
                    var28 = 3;
                } else {
                    var28 = Statics.field4237;
                }
            }
            var27 = var28;
        } else {
            int var15;
            if (Statics.field1779.field1189) {
                var15 = Statics.field4237;
            } else {
                label524: {
                    int var16 = 3;
                    if (Statics.field473 < 310) {
                        label515: {
                            int var17;
                            int var18;
                            if (field748 == 1) {
                                var17 = Statics.field2179 >> 7;
                                var18 = Statics.field2153 >> 7;
                            } else {
                                var17 = Statics.field1485.field1119 >> 7;
                                var18 = Statics.field1485.field1096 >> 7;
                            }
                            int var19 = Statics.field2033 >> 7;
                            int var20 = Statics.field155 >> 7;
                            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                                if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                                    if ((class75.field977[Statics.field4237][var19][var20] & 0x4) != 0) {
                                        var16 = Statics.field4237;
                                    }
                                    int var21;
                                    if (var17 > var19) {
                                        var21 = var17 - var19;
                                    } else {
                                        var21 = var19 - var17;
                                    }
                                    int var22;
                                    if (var18 > var20) {
                                        var22 = var18 - var20;
                                    } else {
                                        var22 = var20 - var18;
                                    }
                                    if (var21 > var22) {
                                        int var23 = var22 * 65536 / var21;
                                        int var24 = 32768;
                                        while (true) {
                                            if (var17 == var19) {
                                                break label515;
                                            }
                                            if (var19 < var17) {
                                                var19++;
                                            } else if (var19 > var17) {
                                                var19--;
                                            }
                                            if ((class75.field977[Statics.field4237][var19][var20] & 0x4) != 0) {
                                                var16 = Statics.field4237;
                                            }
                                            var24 += var23;
                                            if (var24 >= 65536) {
                                                var24 -= 65536;
                                                if (var20 < var18) {
                                                    var20++;
                                                } else if (var20 > var18) {
                                                    var20--;
                                                }
                                                if ((class75.field977[Statics.field4237][var19][var20] & 0x4) != 0) {
                                                    var16 = Statics.field4237;
                                                }
                                            }
                                        }
                                    } else {
                                        if (var22 > 0) {
                                            int var25 = var21 * 65536 / var22;
                                            int var26 = 32768;
                                            while (var18 != var20) {
                                                if (var20 < var18) {
                                                    var20++;
                                                } else if (var20 > var18) {
                                                    var20--;
                                                }
                                                if ((class75.field977[Statics.field4237][var19][var20] & 0x4) != 0) {
                                                    var16 = Statics.field4237;
                                                }
                                                var26 += var25;
                                                if (var26 >= 65536) {
                                                    var26 -= 65536;
                                                    if (var19 < var17) {
                                                        var19++;
                                                    } else if (var19 > var17) {
                                                        var19--;
                                                    }
                                                    if ((class75.field977[Statics.field4237][var19][var20] & 0x4) != 0) {
                                                        var16 = Statics.field4237;
                                                    }
                                                }
                                            }
                                        }
                                        break label515;
                                    }
                                }
                                var15 = Statics.field4237;
                                break label524;
                            }
                            var15 = Statics.field4237;
                            break label524;
                        }
                    }
                    if (Statics.field1485.field1119 >= 0 && Statics.field1485.field1096 >= 0 && Statics.field1485.field1119 < 13312 && Statics.field1485.field1096 < 13312) {
                        if ((class75.field977[Statics.field4237][Statics.field1485.field1119 >> 7][Statics.field1485.field1096 >> 7] & 0x4) != 0) {
                            var16 = Statics.field4237;
                        }
                        var15 = var16;
                    } else {
                        var15 = Statics.field4237;
                    }
                }
            }
            var27 = var15;
        }
        int var30 = Statics.field2033;
        int var31 = Statics.field1754;
        int var32 = Statics.field155;
        int var33 = Statics.field473;
        int var34 = Statics.field4169;
        for (int var35 = 0; var35 < 5; var35++) {
            if (field737[var35]) {
                int var36 = (int) (Math.random() * (double) (field485[var35] * 2 + 1) - (double) field485[var35] + Math.sin((double) field687[var35] / 100.0D * (double) field741[var35]) * (double) field739[var35]);
                if (var35 == 0) {
                    Statics.field2033 += var36;
                }
                if (var35 == 1) {
                    Statics.field1754 += var36;
                }
                if (var35 == 2) {
                    Statics.field155 += var36;
                }
                if (var35 == 3) {
                    Statics.field4169 = Statics.field4169 + var36 & 0x7FF;
                }
                if (var35 == 4) {
                    Statics.field473 += var36;
                    if (Statics.field473 < 128) {
                        Statics.field473 = 128;
                    }
                    if (Statics.field473 > 383) {
                        Statics.field473 = 383;
                    }
                }
            }
        }
        int var37 = class33.field221;
        int var38 = class33.field230;
        if (class33.field236 != 0) {
            var37 = class33.field241;
            var38 = class33.field238;
        }
        if (var37 >= var9 && var37 < var9 + var11 && var38 >= var10 && var38 < var10 + var12) {
            int var39 = var37 - var9;
            int var40 = var38 - var10;
            class221.field2565 = var39;
            class221.field2566 = var40;
            class221.field2573 = true;
            class221.field2570 = 0;
            class221.field2567 = false;
        } else {
            class221.method2461();
        }
        method16();
        class409.method6556(var9, var10, var11, var12, 0);
        method16();
        int var41 = class211.field2342;
        class211.field2342 = field597;
        Statics.field1964.method3827(Statics.field2033, Statics.field1754, Statics.field155, Statics.field473, Statics.field4169, var27);
        class211.field2342 = var41;
        method16();
        Statics.field1964.method3801();
        field576 = 0;
        boolean var42 = false;
        int var43 = -1;
        int var44 = -1;
        int var45 = class96.field1257;
        int[] var46 = class96.field1249;
        for (int var47 = 0; var47 < field531 + var45; var47++) {
            class85 var48;
            if (var47 < var45) {
                var48 = field605[var46[var47]];
                if (field565 == var46[var47]) {
                    var42 = true;
                    var43 = var47;
                    continue;
                }
                if (Statics.field1485 == var48) {
                    var44 = var47;
                    continue;
                }
            } else {
                var48 = field530[field532[var47 - var45]];
            }
            method268(var48, var47, var9, var10, var11, var12);
        }
        if (field608 && var44 != -1) {
            method268(Statics.field1485, var44, var9, var10, var11, var12);
        }
        if (var42) {
            method268(field605[field565], var43, var9, var10, var11, var12);
        }
        for (int var49 = 0; var49 < field576; var49++) {
            int var50 = field578[var49];
            int var51 = field579[var49];
            int var52 = field581[var49];
            int var53 = field690[var49];
            boolean var54 = true;
            while (var54) {
                var54 = false;
                for (int var55 = 0; var55 < var49; var55++) {
                    if (var51 + 2 > field579[var55] - field690[var55] && var51 - var53 < field579[var55] + 2 && var50 - var52 < field581[var55] + field578[var55] && var50 + var52 > field578[var55] - field581[var55] && field579[var55] - field690[var55] < var51) {
                        var51 = field579[var55] - field690[var55];
                        var54 = true;
                    }
                }
            }
            field588 = field578[var49];
            field589 = field579[var49] = var51;
            String var56 = field671[var49];
            if (field555 == 0) {
                int var57 = 16776960;
                if (field582[var49] < 6) {
                    var57 = field708[field582[var49]];
                }
                if (field582[var49] == 6) {
                    var57 = field542 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field582[var49] == 7) {
                    var57 = field542 % 20 < 10 ? 255 : 65535;
                }
                if (field582[var49] == 8) {
                    var57 = field542 % 20 < 10 ? 45056 : 8454016;
                }
                if (field582[var49] == 9) {
                    int var58 = 150 - field516[var49];
                    if (var58 < 50) {
                        var57 = var58 * 1280 + 16711680;
                    } else if (var58 < 100) {
                        var57 = 16776960 - (var58 - 50) * 327680;
                    } else if (var58 < 150) {
                        var57 = (var58 - 100) * 5 + 65280;
                    }
                }
                if (field582[var49] == 10) {
                    int var59 = 150 - field516[var49];
                    if (var59 < 50) {
                        var57 = var59 * 5 + 16711680;
                    } else if (var59 < 100) {
                        var57 = 16711935 - (var59 - 50) * 327680;
                    } else if (var59 < 150) {
                        var57 = (var59 - 100) * 327680 + 255 - (var59 - 100) * 5;
                    }
                }
                if (field582[var49] == 11) {
                    int var60 = 150 - field516[var49];
                    if (var60 < 50) {
                        var57 = 16777215 - var60 * 327685;
                    } else if (var60 < 100) {
                        var57 = (var60 - 50) * 327685 + 65280;
                    } else if (var60 < 150) {
                        var57 = 16777215 - (var60 - 100) * 327680;
                    }
                }
                if (field583[var49] == 0) {
                    Statics.field53.method5137(var56, field588 + var9, field589 + var10, var57, 0);
                }
                if (field583[var49] == 1) {
                    Statics.field53.method5139(var56, field588 + var9, field589 + var10, var57, 0, field542);
                }
                if (field583[var49] == 2) {
                    Statics.field53.method5140(var56, field588 + var9, field589 + var10, var57, 0, field542);
                }
                if (field583[var49] == 3) {
                    Statics.field53.method5141(var56, field588 + var9, field589 + var10, var57, 0, field542, 150 - field516[var49]);
                }
                if (field583[var49] == 4) {
                    int var61 = (150 - field516[var49]) * (Statics.field53.method5128(var56) + 100) / 150;
                    class409.method6520(field588 + var9 - 50, var10, field588 + var9 + 50, var10 + var12);
                    Statics.field53.method5174(var56, field588 + var9 + 50 - var61, field589 + var10, var57, 0);
                    class409.method6519(var9, var10, var9 + var11, var10 + var12);
                }
                if (field583[var49] == 5) {
                    int var62 = 150 - field516[var49];
                    int var63 = 0;
                    if (var62 < 25) {
                        var63 = var62 - 25;
                    } else if (var62 > 125) {
                        var63 = var62 - 125;
                    }
                    class409.method6520(var9, field589 + var10 - Statics.field53.field3837 - 1, var9 + var11, field589 + var10 + 5);
                    Statics.field53.method5137(var56, field588 + var9, field589 + var10 + var63, var57, 0);
                    class409.method6519(var9, var10, var9 + var11, var10 + var12);
                }
            } else {
                Statics.field53.method5137(var56, field588 + var9, field589 + var10, 16776960, 0);
            }
        }
        if (field501 == 2) {
            method1791((field504 - Statics.field1942 << 7) + field507, (field505 - Statics.field3866 << 7) + field508, field738 * 2);
            if (field588 > -1 && field744 % 20 < 10) {
                Statics.field26[0].method6615(field588 + var9 - 12, field589 + var10 - 28);
            }
        }
        ((class218) Statics.field2331).method4005(field765);
        method4641(var9, var10, var11, var12);
        Statics.field2033 = var30;
        Statics.field1754 = var31;
        Statics.field155 = var32;
        Statics.field473 = var33;
        Statics.field4169 = var34;
        if (field492 && class291.method4652(true, false) == 0) {
            field492 = false;
        }
        if (field492) {
            class409.method6556(var9, var10, var11, var12, 0);
            method3451(class283.field3342, false);
        }
    }

    @ObfuscatedName("e.ga(IIIIZI)V")
    public static final void method84(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field724;
        } else if (var5 >= 100) {
            var6 = field743;
        } else {
            var6 = (field743 - field724) * var5 / 100 + field724;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field712) {
            short var8 = field712;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field747) {
                var6 = field747;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class409.method6518();
                    class409.method6556(arg0, arg1, var10, arg3, -16777216);
                    class409.method6556(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field749) {
            short var11 = field749;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field643) {
                var6 = field643;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class409.method6518();
                    class409.method6556(arg0, arg1, arg2, var13, -16777216);
                    class409.method6556(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field597 = arg3 * var6 / 334;
        if (field752 != arg2 || field753 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method6073(var16);
                int var18 = class211.field2346[var16];
                int var19 = method5473(var17, arg3);
                var14[var15] = var18 * var19 >> 16;
            }
            class213.method3821(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field750 = arg0;
        field751 = arg1;
        field752 = arg2;
        field753 = arg3;
    }

    @ObfuscatedName("fb.gz(I)V")
    public static void method3141() {
        if (field608) {
            method2353(Statics.field1485, false);
        }
    }

    @ObfuscatedName("bw.gq(I)V")
    public static void method1061() {
        if (field565 >= 0 && field605[field565] != null) {
            method2353(field605[field565], false);
        }
    }

    @ObfuscatedName("bo.gk(I)V")
    public static void method1851() {
        int var0 = class96.field1257;
        int[] var1 = class96.field1249;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field565 != var1[var2] && field606 != var1[var2]) {
                method2353(field605[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("dl.gv(Lco;ZI)V")
    public static void method2353(class83 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1993() || arg0.field1069) {
            return;
        }
        arg0.field1051 = false;
        if ((field572 && class96.field1257 > 50 || class96.field1257 > 200) && arg1 && arg0.field1143 == arg0.field1099) {
            arg0.field1051 = true;
        }
        int var2 = arg0.field1119 >> 7;
        int var3 = arg0.field1096 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class221.method2438(0, 0, 0, false, arg0.field1071);
        if (arg0.field1062 != null && field744 >= arg0.field1057 && field744 < arg0.field1058) {
            arg0.field1051 = false;
            arg0.field1056 = method1770(arg0.field1119, arg0.field1096, Statics.field4237);
            arg0.field1112 = field744;
            Statics.field1964.method3799(Statics.field4237, arg0.field1119, arg0.field1096, arg0.field1056, 60, arg0, arg0.field1095, var4, arg0.field1063, arg0.field1054, arg0.field1065, arg0.field1066);
            return;
        }
        if ((arg0.field1119 & 0x7F) == 64 && (arg0.field1096 & 0x7F) == 64) {
            if (field542 == field564[var2][var3]) {
                return;
            }
            field564[var2][var3] = field542;
        }
        arg0.field1056 = method1770(arg0.field1119, arg0.field1096, Statics.field4237);
        arg0.field1112 = field744;
        Statics.field1964.method3798(Statics.field4237, arg0.field1119, arg0.field1096, arg0.field1056, 60, arg0, arg0.field1095, var4, arg0.field1094);
    }

    @ObfuscatedName("lq.gr(ZB)V")
    public static final void method5453(boolean arg0) {
        for (int var1 = 0; var1 < field531; var1++) {
            class91 var2 = field530[field532[var1]];
            if (var2 != null && var2.method1993() && var2.field1214.field1705 == arg0 && var2.field1214.method2718()) {
                int var3 = var2.field1119 >> 7;
                int var4 = var2.field1096 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1138 == 1 && (var2.field1119 & 0x7F) == 64 && (var2.field1096 & 0x7F) == 64) {
                        if (field542 == field564[var3][var4]) {
                            continue;
                        }
                        field564[var3][var4] = field542;
                    }
                    long var5 = class221.method2438(0, 0, 1, !var2.field1214.field1738, field532[var1]);
                    var2.field1112 = field744;
                    Statics.field1964.method3798(Statics.field4237, var2.field1119, var2.field1096, method1770(var2.field1119 + (var2.field1138 * 64 - 64), var2.field1096 + (var2.field1138 * 64 - 64), Statics.field4237), var2.field1138 * 64 - 64 + 60, var2, var2.field1095, var5, var2.field1094);
                }
            }
        }
    }

    @ObfuscatedName("be.gm(B)Z")
    public static boolean method1636() {
        return (field533 & 0x4) != 0;
    }

    @ObfuscatedName("c.gi(I)Z")
    public static boolean method10() {
        return (field533 & 0x8) != 0;
    }

    @ObfuscatedName("ml.ge(Lco;B)Z")
    public static boolean method5556(class83 arg0) {
        if (field533 == 0) {
            return false;
        } else if (Statics.field1485 == arg0) {
            return method10();
        } else {
            boolean var1 = method1636();
            if (!var1) {
                boolean var2 = (field533 & 0x1) != 0;
                var1 = var2 && arg0.method1957();
            }
            boolean var3 = var1;
            if (!var1) {
                boolean var4 = (field533 & 0x2) != 0;
                var3 = var4 && arg0.method1996();
            }
            return var3;
        }
    }

    @ObfuscatedName("q.gh(Lcf;IIIIII)V")
    public static final void method268(class85 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1993()) {
            return;
        }
        if (arg0 instanceof class91) {
            class161 var6 = ((class91) arg0).field1214;
            if (var6.field1735 != null) {
                var6 = var6.method2712();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class96.field1257;
        int[] var8 = class96.field1249;
        byte var9 = 0;
        if (arg1 < var7 && field744 == arg0.field1112 && method5556((class83) arg0)) {
            class83 var10 = (class83) arg0;
            if (arg1 < var7) {
                method2709(arg0, arg0.field1113 + 15);
                class316 var11 = (class316) field551.get(class376.field4176);
                byte var12 = 9;
                var11.method5137(var10.field1070.method6800(), field588 + arg2, field589 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field1098.method5051()) {
            method2709(arg0, arg0.field1113 + 15);
            for (class90 var14 = (class90) arg0.field1098.method5007(); var14 != null; var14 = (class90) arg0.field1098.method5009()) {
                class86 var15 = var14.method2100(field744);
                if (var15 != null) {
                    class157 var16 = var14.field1203;
                    class413 var17 = var16.method2666();
                    class413 var18 = var16.method2661();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field1680;
                    } else {
                        if (var16.field1669 * 2 < var18.field4375) {
                            var19 = var16.field1669;
                        }
                        var20 = var18.field4375 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field744 - var15.field1159;
                    int var24 = var15.field1154 * var20 / var16.field1680;
                    int var27;
                    if (var15.field1157 > var23) {
                        int var25 = var16.field1676 == 0 ? 0 : var23 / var16.field1676 * var16.field1676;
                        int var26 = var15.field1158 * var20 / var16.field1680;
                        var27 = (var24 - var26) * var25 / var15.field1157 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1157 + var16.field1673 - var23;
                        if (var16.field1675 >= 0) {
                            var21 = (var28 << 8) / (var16.field1673 - var16.field1675);
                        }
                    }
                    if (var15.field1154 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field588 > -1) {
                            int var34 = field588 + arg2 - (var20 >> 1);
                            int var35 = field589 + arg3 - var13;
                            class409.method6556(var34, var35, var27, 5, 65280);
                            class409.method6556(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field4378;
                        var13 += var30;
                        int var31 = field588 + arg2 - (var20 >> 1);
                        int var32 = field589 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method6633(var33, var32, var21);
                            class409.method6520(var33, var32, var29 + var33, var30 + var32);
                            var18.method6633(var33, var32, var21);
                        } else {
                            var17.method6615(var33, var32);
                            class409.method6520(var33, var32, var29 + var33, var30 + var32);
                            var18.method6615(var33, var32);
                        }
                        class409.method6519(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method2093()) {
                    var14.method5732();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class83 var37 = (class83) arg0;
            if (var37.field1069) {
                return;
            }
            if (var37.field1050 != -1 || var37.field1052 != -1) {
                method2709(arg0, arg0.field1113 + 15);
                if (field588 > -1) {
                    if (var37.field1050 != -1) {
                        var36 += 25;
                        Statics.field2960[var37.field1050].method6615(field588 + arg2 - 12, field589 + arg3 - var36);
                    }
                    if (var37.field1052 != -1) {
                        var36 += 25;
                        Statics.field834[var37.field1052].method6615(field588 + arg2 - 12, field589 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field501 == 10 && field686 == var8[arg1]) {
                method2709(arg0, arg0.field1113 + 15);
                if (field588 > -1) {
                    int var38 = Statics.field26[1].field4378 + var36;
                    Statics.field26[1].method6615(field588 + arg2 - 12, field589 + arg3 - var38);
                }
            }
        } else {
            class161 var39 = ((class91) arg0).field1214;
            if (var39.field1735 != null) {
                var39 = var39.method2712();
            }
            if (var39.field1733 >= 0 && var39.field1733 < Statics.field834.length) {
                method2709(arg0, arg0.field1113 + 15);
                if (field588 > -1) {
                    Statics.field834[var39.field1733].method6615(field588 + arg2 - 12, field589 + arg3 - 30);
                }
            }
            if (field501 == 1 && field711 == field532[arg1 - var7] && field744 % 20 < 10) {
                method2709(arg0, arg0.field1113 + 15);
                if (field588 > -1) {
                    Statics.field26[0].method6615(field588 + arg2 - 12, field589 + arg3 - 28);
                }
            }
        }
        if (arg0.field1107 != null && (arg1 >= var7 || !arg0.field1109 && (field709 == 4 || !arg0.field1108 && (field709 == 0 || field709 == 3 || field709 == 1 && ((class83) arg0).method1957())))) {
            method2709(arg0, arg0.field1113);
            if (field588 > -1 && field576 < field595) {
                field581[field576] = Statics.field53.method5128(arg0.field1107) / 2;
                field690[field576] = Statics.field53.field3837;
                field578[field576] = field588;
                field579[field576] = field589;
                field582[field576] = arg0.field1137;
                field583[field576] = arg0.field1133;
                field516[field576] = arg0.field1110;
                field671[field576] = arg0.field1107;
                field576++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field1116[var40];
            int var42 = arg0.field1114[var40];
            class168 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field744) {
                    continue;
                }
                var43 = class168.method2013(arg0.field1114[var40]);
                var44 = var43.field1805;
                if (var43 != null && var43.field1803 != null) {
                    var43 = var43.method2860();
                    if (var43 == null) {
                        arg0.field1116[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field1117[var40];
            class168 var46 = null;
            if (var45 >= 0) {
                var46 = class168.method2013(var45);
                if (var46 != null && var46.field1803 != null) {
                    var46 = var46.method2860();
                }
            }
            if (var41 - var44 <= field744) {
                if (var43 == null) {
                    arg0.field1116[var40] = -1;
                } else {
                    method2709(arg0, arg0.field1113 / 2);
                    if (field588 > -1) {
                        if (var40 == 1) {
                            field589 -= 20;
                        }
                        if (var40 == 2) {
                            field588 -= 15;
                            field589 -= 10;
                        }
                        if (var40 == 3) {
                            field588 += 15;
                            field589 -= 10;
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
                        class413 var59 = null;
                        class413 var60 = null;
                        class413 var61 = null;
                        class413 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class413 var72 = var43.method2849();
                        if (var72 != null) {
                            var51 = var72.field4375;
                            int var73 = var72.field4378;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field4370;
                        }
                        class413 var74 = var43.method2879();
                        if (var74 != null) {
                            var52 = var74.field4375;
                            int var75 = var74.field4378;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field4370;
                        }
                        class413 var76 = var43.method2880();
                        if (var76 != null) {
                            var53 = var76.field4375;
                            int var77 = var76.field4378;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field4370;
                        }
                        class413 var78 = var43.method2865();
                        if (var78 != null) {
                            var54 = var78.field4375;
                            int var79 = var78.field4378;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field4370;
                        }
                        if (var46 != null) {
                            var59 = var46.method2849();
                            if (var59 != null) {
                                var63 = var59.field4375;
                                int var80 = var59.field4378;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field4370;
                            }
                            var60 = var46.method2879();
                            if (var60 != null) {
                                var64 = var60.field4375;
                                int var81 = var60.field4378;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field4370;
                            }
                            var61 = var46.method2880();
                            if (var61 != null) {
                                var65 = var61.field4375;
                                int var82 = var61.field4378;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field4370;
                            }
                            var62 = var46.method2865();
                            if (var62 != null) {
                                var66 = var62.field4375;
                                int var83 = var62.field4378;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field4370;
                            }
                        }
                        class315 var84 = var43.method2876();
                        if (var84 == null) {
                            var84 = Statics.field1184;
                        }
                        class315 var85;
                        if (var46 == null) {
                            var85 = Statics.field1184;
                        } else {
                            var85 = var46.method2876();
                            if (var85 == null) {
                                var85 = Statics.field1184;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method2848(arg0.field1115[var40]);
                        int var91 = var84.method5128(var90);
                        if (var46 != null) {
                            var87 = var46.method2848(arg0.field1118[var40]);
                            var89 = var85.method5128(var87);
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
                        int var108 = arg0.field1116[var40] - field744;
                        int var109 = var43.field1810 - var43.field1810 * var108 / var43.field1805;
                        int var110 = var43.field1811 * var108 / var43.field1805 + -var43.field1811;
                        int var111 = field588 + arg2 - (var100 >> 1) + var109;
                        int var112 = field589 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field1818 + var112 + 15;
                        int var116 = var115 - var84.field3847;
                        int var117 = var84.field3839 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field1818 + var112 + 15;
                            int var119 = var118 - var85.field3847;
                            int var120 = var85.field3839 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field1812 >= 0) {
                            var123 = (var108 << 8) / (var43.field1805 - var43.field1812);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method6633(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method6633(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method6633(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method6633(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5135(var90, var98 + var111, var115, var43.field1804, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method6633(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method6633(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method6633(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method6633(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5135(var87, var106 + var111, var118, var46.field1804, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method6615(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method6615(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method6615(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method6615(var101 + var111 - var58, var112);
                            }
                            var84.method5174(var90, var98 + var111, var115, var43.field1804 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method6615(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method6615(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method6615(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method6615(var105 + var111 - var70, var112);
                                }
                                var85.method5174(var87, var106 + var111, var118, var46.field1804 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("di.gb(I)V")
    public static final void method2454() {
        field603 = 0;
        int var0 = (Statics.field1485.field1119 >> 7) + Statics.field1942;
        int var1 = (Statics.field1485.field1096 >> 7) + Statics.field3866;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field603 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field603 = 1;
        }
        if (field603 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field603 = 0;
        }
    }

    @ObfuscatedName("jw.gp(IIIII)V")
    public static final void method4641(int arg0, int arg1, int arg2, int arg3) {
        method2454();
    }

    @ObfuscatedName("fs.gw(Lcf;II)V")
    public static final void method2709(class85 arg0, int arg1) {
        method1791(arg0.field1119, arg0.field1096, arg1);
    }

    @ObfuscatedName("bb.gl(IIII)V")
    public static final void method1791(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field588 = -1;
            field589 = -1;
            return;
        }
        int var3 = method1770(arg0, arg1, Statics.field4237) - arg2;
        int var4 = arg0 - Statics.field2033;
        int var5 = var3 - Statics.field1754;
        int var6 = arg1 - Statics.field155;
        int var7 = class211.field2346[Statics.field473];
        int var8 = class211.field2357[Statics.field473];
        int var9 = class211.field2346[Statics.field4169];
        int var10 = class211.field2357[Statics.field4169];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field588 = field597 * var11 / var15 + field752 / 2;
            field589 = field597 * var14 / var15 + field753 / 2;
        } else {
            field588 = -1;
            field589 = -1;
        }
    }

    @ObfuscatedName("bu.gx(IIIB)I")
    public static final int method1770(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class75.field977[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class75.field976[var5][var3][var4] + class75.field976[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class75.field976[var5][var3][var4 + 1] + class75.field976[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("le.go(IIB)I")
    public static int method5473(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field745 - field543) * var2 / 100 + field543;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("c.ht(IIIIIIIB)V")
    public static final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method5473(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class211.field2346[var8];
            int var14 = class211.field2357[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class211.field2346[var9];
            int var17 = class211.field2357[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        Statics.field2033 = arg0 - var10;
        Statics.field1754 = arg1 - var11;
        Statics.field155 = arg2 - var12;
        Statics.field473 = arg3;
        Statics.field4169 = arg4;
        if (field748 != 1 || field658 < 2 || field744 % 50 != 0 || !(Statics.field2179 >> 7 != Statics.field1485.field1119 >> 7 || Statics.field2153 >> 7 != Statics.field1485.field1096 >> 7)) {
            return;
        }
        int var19 = Statics.field1485.field1067;
        int var20 = (Statics.field2179 >> 7) + Statics.field1942;
        int var21 = (Statics.field2153 >> 7) + Statics.field3866;
        class242 var22 = Statics.method1576(class240.field2708, field535.field1282);
        var22.field2767.method6311(var21);
        var22.field2767.method6263(field571);
        var22.field2767.method6243(var19);
        var22.field2767.method6253(var20);
        field535.method2211(var22);
    }

    @ObfuscatedName("jn.hs(ZLoq;I)V")
    public static final void method4632(boolean arg0, class399 arg1) {
        field481 = arg0;
        if (!field481) {
            int var2 = arg1.method6219();
            int var3 = arg1.method6219();
            int var4 = arg1.method6219();
            Statics.field2881 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2881[var5][var6] = arg1.method6222();
                }
            }
            Statics.field1186 = new int[var4];
            Statics.field3195 = new int[var4];
            Statics.field1346 = new int[var4];
            Statics.field1993 = new byte[var4][];
            Statics.field86 = new byte[var4][];
            boolean var7 = false;
            if (field539) {
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
                        Statics.field1186[var8] = var11;
                        Statics.field3195[var8] = Statics.field1871.method4725("m" + var9 + "_" + var10);
                        Statics.field1346[var8] = Statics.field1871.method4725("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method2525(var3, var2, true);
            return;
        }
        int var12 = arg1.method6257();
        boolean var13 = arg1.method6217() == 1;
        int var14 = arg1.method6219();
        int var15 = arg1.method6219();
        arg1.method6168();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method6184(1);
                    if (var19 == 1) {
                        field549[var16][var17][var18] = arg1.method6184(26);
                    } else {
                        field549[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method6170();
        Statics.field2881 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2881[var20][var21] = arg1.method6222();
            }
        }
        Statics.field1186 = new int[var15];
        Statics.field3195 = new int[var15];
        Statics.field1346 = new int[var15];
        Statics.field1993 = new byte[var15][];
        Statics.field86 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field549[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1186[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1186[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field3195[var22] = Statics.field1871.method4725("m" + var31 + "_" + var32);
                            Statics.field1346[var22] = Statics.field1871.method4725("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method2525(var14, var12, !var13);
    }

    @ObfuscatedName("ei.hb(IIZB)V")
    public static final void method2525(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field3892 == arg0 && Statics.field27 == arg1) {
            return;
        }
        Statics.field3892 = arg0;
        Statics.field27 = arg1;
        method2034(25);
        method3451(class283.field3342, true);
        int var3 = Statics.field1942;
        int var4 = Statics.field3866;
        Statics.field1942 = (arg0 - 6) * 8;
        Statics.field3866 = (arg1 - 6) * 8;
        int var5 = Statics.field1942 - var3;
        int var6 = Statics.field3866 - var4;
        int var7 = Statics.field1942;
        int var8 = Statics.field3866;
        for (int var9 = 0; var9 < 32768; var9++) {
            class91 var10 = field530[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1126[var11] -= var5;
                    var10.field1150[var11] -= var6;
                }
                var10.field1119 -= var5 * 128;
                var10.field1096 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class83 var13 = field605[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1126[var14] -= var5;
                    var13.field1150[var14] -= var6;
                }
                var13.field1119 -= var5 * 128;
                var13.field1096 -= var6 * 128;
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
                        field569[var25][var21][var22] = field569[var25][var23][var24];
                    } else {
                        field569[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class84 var26 = (class84) field618.method4962(); var26 != null; var26 = (class84) field618.method4985()) {
            var26.field1080 -= var5;
            var26.field1091 -= var6;
            if (var26.field1080 < 0 || var26.field1091 < 0 || var26.field1080 >= 104 || var26.field1091 >= 104) {
                var26.method5732();
            }
        }
        if (field586 != 0) {
            field586 -= var5;
            field726 -= var6;
        }
        field730 = 0;
        field736 = false;
        Statics.field2033 -= var5 << 7;
        Statics.field155 -= var6 << 7;
        Statics.field2179 -= var5 << 7;
        Statics.field2153 -= var6 << 7;
        field720 = -1;
        field620.method4958();
        field554.method4958();
        for (int var27 = 0; var27 < 4; var27++) {
            field695[var27].method3106();
        }
    }

    @ObfuscatedName("cr.hm(ZI)V")
    public static final void method2104(boolean arg0) {
        method16();
        field535.field1288++;
        if (field535.field1288 < 50 && !arg0) {
            return;
        }
        field535.field1288 = 0;
        if (field537 || field535.method2215() == null) {
            return;
        }
        class242 var1 = Statics.method1576(class240.field2705, field535.field1282);
        field535.method2211(var1);
        try {
            field535.method2210();
        } catch (IOException var3) {
            field537 = true;
        }
    }

    @ObfuscatedName("lo.hz(IIIIII)V")
    public static final void method5371(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field1964.method3812(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field1964.method3871(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class221.method3110(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field1370.field4369;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class221.method2676(var5);
            class169 var14 = class169.method2878(var13);
            if (var14.field1869 == -1) {
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
                class412 var15 = Statics.field201[var14.field1869];
                if (var15 != null) {
                    int var16 = (var14.field1835 * 4 - var15.field4361) / 2;
                    int var17 = (var14.field1836 * 4 - var15.field4364) / 2;
                    var15.method6601(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field1836) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field1964.method3814(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field1964.method3871(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class221.method2676(var18);
            class169 var24 = class169.method2878(var23);
            if (var24.field1869 != -1) {
                class412 var25 = Statics.field201[var24.field1869];
                if (var25 != null) {
                    int var26 = (var24.field1835 * 4 - var25.field4361) / 2;
                    int var27 = (var24.field1836 * 4 - var25.field4364) / 2;
                    var25.method6601(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field1836) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class221.method3110(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field1370.field4369;
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
        long var31 = Statics.field1964.method3815(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class221.method2676(var31);
        class169 var34 = class169.method2878(var33);
        if (var34.field1869 == -1) {
            return;
        }
        class412 var35 = Statics.field201[var34.field1869];
        if (var35 != null) {
            int var36 = (var34.field1835 * 4 - var35.field4361) / 2;
            int var37 = (var34.field1836 * 4 - var35.field4364) / 2;
            var35.method6601(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field1836) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hr(Lcs;I)Z")
    public final boolean method1138(class99 arg0) {
        class343 var2 = arg0.method2215();
        class399 var3 = arg0.field1284;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1278 == null) {
                if (arg0.field1286) {
                    if (!var2.method2544(1)) {
                        return false;
                    }
                    var2.method2545(arg0.field1284.field4271, 0, 1);
                    arg0.field1280 = 0;
                    arg0.field1286 = false;
                }
                var3.field4272 = 0;
                if (var3.method6165()) {
                    if (!var2.method2544(1)) {
                        return false;
                    }
                    var2.method2545(arg0.field1284.field4271, 1, 1);
                    arg0.field1280 = 0;
                }
                arg0.field1286 = true;
                class243[] var4 = class243.method3156();
                int var5 = var3.method6180();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4272);
                }
                arg0.field1278 = var4[var5];
                arg0.field1279 = arg0.field1278.field2866;
            }
            if (arg0.field1279 == -1) {
                if (!var2.method2544(1)) {
                    return false;
                }
                arg0.method2215().method2545(var3.field4271, 0, 1);
                arg0.field1279 = var3.field4271[0] & 0xFF;
            }
            if (arg0.field1279 == -2) {
                if (!var2.method2544(2)) {
                    return false;
                }
                arg0.method2215().method2545(var3.field4271, 0, 2);
                var3.field4272 = 0;
                arg0.field1279 = var3.method6219();
            }
            if (!var2.method2544(arg0.field1279)) {
                return false;
            }
            var3.field4272 = 0;
            var2.method2545(var3.field4271, 0, arg0.field1279);
            arg0.field1280 = 0;
            field540.method5348();
            arg0.field1291 = arg0.field1290;
            arg0.field1290 = arg0.field1289;
            arg0.field1289 = arg0.field1278;
            if (class243.field2796 == arg0.field1278) {
                method1779();
                field587 = var3.method6220();
                field696 = field674;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2811 == arg0.field1278) {
                method2470(true, var3);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2792 == arg0.field1278) {
                method1013(class241.field2752);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2803 == arg0.field1278) {
                field586 = var3.method6217();
                if (field586 == 255) {
                    field586 = 0;
                }
                field726 = var3.method6217();
                if (field726 == 255) {
                    field726 = 0;
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2789 == arg0.field1278) {
                field710 = var3.method6246();
                field709 = var3.method6409();
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2781 == arg0.field1278) {
                int var6 = var3.method6355();
                int var7 = var3.method6228();
                int var8 = var3.method6255();
                if (var8 == 65535) {
                    var8 = -1;
                }
                class262 var9 = class262.method2073(var6);
                if (var9.field3045) {
                    var9.field3176 = var8;
                    var9.field3177 = var7;
                    class170 var11 = class170.method1776(var8);
                    var9.field3097 = var11.field1889;
                    var9.field3074 = var11.field1873;
                    var9.field3099 = var11.field1891;
                    var9.field3095 = var11.field1908;
                    var9.field3044 = var11.field1893;
                    var9.field3100 = var11.field1916;
                    if (var11.field1926 == 1) {
                        var9.field3105 = 1;
                    } else {
                        var9.field3105 = 2;
                    }
                    if (var9.field3090 > 0) {
                        var9.field3100 = var9.field3100 * 32 / var9.field3090;
                    } else if (var9.field3057 > 0) {
                        var9.field3100 = var9.field3100 * 32 / var9.field3057;
                    }
                    method2027(var9);
                } else if (var8 == -1) {
                    var9.field3064 = 0;
                    arg0.field1278 = null;
                    return true;
                } else {
                    class170 var10 = class170.method1776(var8);
                    var9.field3064 = 4;
                    var9.field3032 = var8;
                    var9.field3097 = var10.field1889;
                    var9.field3074 = var10.field1873;
                    var9.field3100 = var10.field1916 * 100 / var7;
                    method2027(var9);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2832 == arg0.field1278) {
                int var12 = var3.method6219();
                field649 = var12;
                this.method1080(false);
                method282(var12);
                class64.method2282(field649);
                for (int var13 = 0; var13 < 100; var13++) {
                    field698[var13] = true;
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2836 == arg0.field1278) {
                int var14 = var3.method6231();
                boolean var15 = var3.method6217() == 1;
                String var16 = "";
                boolean var17 = false;
                if (var15) {
                    var16 = var3.method6226();
                    if (Statics.field100.method1571(new class421(var16, Statics.field310))) {
                        var17 = true;
                    }
                }
                String var18 = var3.method6226();
                if (!var17) {
                    class98.method1908(var14, var16, var18);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2857 == arg0.field1278) {
                byte var19 = var3.method6218();
                String var20 = var3.method6226();
                long var21 = (long) var3.method6219();
                long var23 = (long) var3.method6327();
                class285 var25 = (class285) class304.method4518(class285.method2842(), var3.method6217());
                long var26 = (var21 << 32) + var23;
                boolean var28 = false;
                Object var29 = null;
                class137 var30 = var19 >= 0 ? field719[var19] : Statics.field2133;
                if (var30 == null) {
                    var28 = true;
                } else {
                    int var31 = 0;
                    while (true) {
                        if (var31 >= 100) {
                            if (var25.field3665 && Statics.field100.method1571(new class421(var20, Statics.field310))) {
                                var28 = true;
                            }
                            break;
                        }
                        if (field616[var31] == var26) {
                            var28 = true;
                            break;
                        }
                        var31++;
                    }
                }
                if (!var28) {
                    field616[field713] = var26;
                    field713 = (field713 + 1) % 100;
                    String var32 = class316.method5207(class265.method3683(var3));
                    int var33 = var19 >= 0 ? 41 : 44;
                    if (var25.field3666 == -1) {
                        class98.method1628(var33, var20, var32, var30.field1518);
                    } else {
                        class98.method1628(var33, class92.method1049(var25.field3666) + var20, var32, var30.field1518);
                    }
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2838 == arg0.field1278) {
                Statics.field1560 = var3.method6251();
                Statics.field2217 = var3.method6251();
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2791 == arg0.field1278) {
                String var34 = var3.method6226();
                long var35 = (long) var3.method6219();
                long var37 = (long) var3.method6327();
                class285 var39 = (class285) class304.method4518(class285.method2842(), var3.method6217());
                long var40 = (var35 << 32) + var37;
                boolean var42 = false;
                for (int var43 = 0; var43 < 100; var43++) {
                    if (field616[var43] == var40) {
                        var42 = true;
                        break;
                    }
                }
                if (Statics.field100.method1571(new class421(var34, Statics.field310))) {
                    var42 = true;
                }
                if (!var42 && field603 == 0) {
                    field616[field713] = var40;
                    field713 = (field713 + 1) % 100;
                    String var44 = class316.method5207(class319.method2351(class265.method3683(var3)));
                    byte var45;
                    if (var39.field3667) {
                        var45 = 7;
                    } else {
                        var45 = 3;
                    }
                    if (var39.field3666 == -1) {
                        class98.method1908(var45, var34, var44);
                    } else {
                        class98.method1908(var45, class92.method1049(var39.field3666) + var34, var44);
                    }
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2807 == arg0.field1278) {
                method1013(class241.field2750);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2834 == arg0.field1278) {
                for (int var46 = 0; var46 < field605.length; var46++) {
                    if (field605[var46] != null) {
                        field605[var46].field1130 = -1;
                    }
                }
                for (int var47 = 0; var47 < field530.length; var47++) {
                    if (field530[var47] != null) {
                        field530[var47].field1130 = -1;
                    }
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2841 == arg0.field1278) {
                String var48 = var3.method6226();
                long var49 = var3.method6223();
                long var51 = (long) var3.method6219();
                long var53 = (long) var3.method6327();
                class285 var55 = (class285) class304.method4518(class285.method2842(), var3.method6217());
                long var56 = (var51 << 32) + var53;
                boolean var58 = false;
                for (int var59 = 0; var59 < 100; var59++) {
                    if (field616[var59] == var56) {
                        var58 = true;
                        break;
                    }
                }
                if (var55.field3665 && Statics.field100.method1571(new class421(var48, Statics.field310))) {
                    var58 = true;
                }
                if (!var58 && field603 == 0) {
                    field616[field713] = var56;
                    field713 = (field713 + 1) % 100;
                    String var60 = class316.method5207(class319.method2351(class265.method3683(var3)));
                    if (var55.field3666 == -1) {
                        class98.method1628(9, var48, var60, class321.method2270(var49));
                    } else {
                        class98.method1628(9, class92.method1049(var55.field3666) + var48, var60, class321.method2270(var49));
                    }
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2810 == arg0.field1278) {
                if (Statics.field1389 == null) {
                    Statics.field1389 = new class353(Statics.field1441);
                }
                class408 var61 = Statics.field1441.method5694(var3);
                Statics.field1389.field4024.method6036(var61.field4340, var61.field4341);
                field681[++field716 - 1 & 0x1F] = var61.field4340;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2862 == arg0.field1278) {
                String var62 = var3.method6226();
                Object[] var63 = new Object[var62.length() + 1];
                for (int var64 = var62.length() - 1; var64 >= 0; var64--) {
                    if (var62.charAt(var64) == 's') {
                        var63[var64 + 1] = var3.method6226();
                    } else {
                        var63[var64 + 1] = Integer.valueOf(var3.method6222());
                    }
                }
                var63[0] = Integer.valueOf(var3.method6222());
                class81 var65 = new class81();
                var65.field1031 = var63;
                Statics.method2499(var65);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2822 == arg0.field1278) {
                class55.method3983(var3, arg0.field1279);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2850 == arg0.field1278) {
                method1013(class241.field2761);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2823 == arg0.field1278) {
                int var66 = var3.method6342();
                int var67 = var3.method6222();
                int var68 = var3.method6251();
                class80 var69 = (class80) field650.method6016((long) var67);
                if (var69 != null) {
                    method3514(var69, var69.field1023 != var66);
                }
                method4121(var67, var66, var68);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2833 == arg0.field1278) {
                int var70 = var3.method6220();
                int var71 = var3.method6355();
                class262 var72 = class262.method2073(var71);
                if (var72.field3121 != var70 || var70 == -1) {
                    var72.field3121 = var70;
                    var72.field3034 = 0;
                    var72.field3179 = 0;
                    method2027(var72);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2797 == arg0.field1278) {
                method2021(var3.method6226());
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2840 == arg0.field1278) {
                var3.field4272 += 28;
                if (var3.method6332()) {
                    method4582(var3, var3.field4272 - 28);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2809 == arg0.field1278) {
                int var73 = var3.method6222();
                int var74 = var3.method6257();
                int var75 = var3.method6219();
                class262 var76 = class262.method2073(var73);
                var76.field3102 = (var74 << 16) + var75;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2800 == arg0.field1278) {
                class61 var77 = new class61();
                var77.field772 = var3.method6226();
                var77.field778 = var3.method6219();
                int var78 = var3.method6222();
                var77.field773 = var78;
                method2034(45);
                var2.method2541();
                Object var79 = null;
                class69.method1014(var77);
                arg0.field1278 = null;
                return false;
            }
            if (class243.field2865 == arg0.field1278) {
                int var80 = var3.method6228();
                class262 var81 = class262.method2073(var80);
                for (int var82 = 0; var82 < var81.field3174.length; var82++) {
                    var81.field3174[var82] = -1;
                    var81.field3174[var82] = 0;
                }
                method2027(var81);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2799 == arg0.field1278) {
                method1779();
                field656 = var3.method6217();
                field696 = field674;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2804 == arg0.field1278) {
                int var83 = var3.method6220();
                int var84 = var3.method6259();
                int var85 = var3.method6222();
                class262 var86 = class262.method2073(var85);
                if (var86.field3055 != var83 || var86.field3056 != var84 || var86.field3051 != 0 || var86.field3059 != 0) {
                    var86.field3055 = var83;
                    var86.field3056 = var84;
                    var86.field3051 = 0;
                    var86.field3059 = 0;
                    method2027(var86);
                    this.method1081(var86);
                    if (var86.field3159 == 0) {
                        method2745(Statics.field1535[var85 >> 16], var86, false);
                    }
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2782 == arg0.field1278) {
                field736 = false;
                for (int var87 = 0; var87 < 5; var87++) {
                    field737[var87] = false;
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2852 == arg0.field1278) {
                int var88 = var3.method6217();
                int var89 = var3.method6217();
                int var90 = var3.method6217();
                int var91 = var3.method6217();
                field737[var88] = true;
                field485[var88] = var89;
                field739[var88] = var90;
                field687[var88] = var91;
                field741[var88] = 0;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2859 == arg0.field1278) {
                Statics.field1389 = new class353(Statics.field1441);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2785 == arg0.field1278) {
                method1779();
                int var92 = var3.method6409();
                int var93 = var3.method6228();
                int var94 = var3.method6409();
                field623[var94] = var93;
                field621[var94] = var92;
                field506[var94] = 1;
                for (int var95 = 0; var95 < 98; var95++) {
                    if (var93 >= class272.field3254[var95]) {
                        field506[var94] = var95 + 2;
                    }
                }
                field679[++field680 - 1 & 0x1F] = var94;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2805 == arg0.field1278) {
                method2177();
                byte var96 = var3.method6218();
                if (arg0.field1279 == 1) {
                    if (var96 >= 0) {
                        field718[var96] = null;
                    } else {
                        Statics.field1233 = null;
                    }
                    arg0.field1278 = null;
                    return true;
                }
                if (var96 >= 0) {
                    field718[var96] = new class128(var3);
                } else {
                    Statics.field1233 = new class128(var3);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2844 == arg0.field1278) {
                int var97 = var3.method6355();
                int var98 = var3.method6342();
                class262 var99 = class262.method2073(var97);
                if (var99.field3064 != 1 || var99.field3032 != var98) {
                    var99.field3064 = 1;
                    var99.field3032 = var98;
                    method2027(var99);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2829 == arg0.field1278) {
                field673 = field674;
                byte var100 = var3.method6218();
                if (arg0.field1279 == 1) {
                    if (var100 >= 0) {
                        field719[var100] = null;
                    } else {
                        Statics.field2133 = null;
                    }
                    arg0.field1278 = null;
                    return true;
                }
                if (var100 >= 0) {
                    field719[var100] = new class137(var3);
                } else {
                    Statics.field2133 = new class137(var3);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2853 == arg0.field1278) {
                int var101 = var3.method6342();
                if (var101 == 65535) {
                    var101 = -1;
                }
                method1581(var101);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2818 == arg0.field1278) {
                int var102 = var3.method6261();
                int var103 = var3.method6257();
                if (var103 == 65535) {
                    var103 = -1;
                }
                method3519(var103, var102);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2786 == arg0.field1278) {
                int var104 = var3.method6355();
                int var105 = var3.method6342();
                int var106 = var105 >> 10 & 0x1F;
                int var107 = var105 >> 5 & 0x1F;
                int var108 = var105 & 0x1F;
                int var109 = (var108 << 3) + (var106 << 19) + (var107 << 11);
                class262 var110 = class262.method2073(var104);
                if (var110.field3071 != var109) {
                    var110.field3071 = var109;
                    method2027(var110);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2847 == arg0.field1278) {
                int var111 = var3.method6319();
                class262 var112 = class262.method2073(var111);
                var112.field3064 = 3;
                var112.field3032 = Statics.field1485.field1064.method4485();
                method2027(var112);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2815 == arg0.field1278) {
                int var113 = var3.method6222();
                int var114 = var3.method6222();
                class80 var115 = (class80) field650.method6016((long) var114);
                class80 var116 = (class80) field650.method6016((long) var113);
                if (var116 != null) {
                    method3514(var116, var115 == null || var115.field1023 != var116.field1023);
                }
                if (var115 != null) {
                    var115.method5732();
                    field650.method6015(var115, (long) var113);
                }
                class262 var117 = class262.method2073(var114);
                if (var117 != null) {
                    method2027(var117);
                }
                class262 var118 = class262.method2073(var113);
                if (var118 != null) {
                    method2027(var118);
                    method2745(Statics.field1535[var118.field3046 >>> 16], var118, true);
                }
                if (field649 != -1) {
                    method171(field649, 1);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2788 == arg0.field1278) {
                Statics.field1560 = var3.method6217();
                Statics.field2217 = var3.method6409();
                while (var3.field4272 < arg0.field1279) {
                    int var119 = var3.method6217();
                    class241 var120 = class241.method2656()[var119];
                    method1013(var120);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2802 == arg0.field1278) {
                method4632(false, arg0.field1284);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2858 == arg0.field1278) {
                method1013(class241.field2756);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2780 == arg0.field1278) {
                Statics.field2217 = var3.method6246();
                Statics.field1560 = var3.method6409();
                for (int var121 = Statics.field1560; var121 < Statics.field1560 + 8; var121++) {
                    for (int var122 = Statics.field2217; var122 < Statics.field2217 + 8; var122++) {
                        if (field569[Statics.field4237][var121][var122] != null) {
                            field569[Statics.field4237][var121][var122] = null;
                            method752(var121, var122);
                        }
                    }
                }
                for (class84 var123 = (class84) field618.method4962(); var123 != null; var123 = (class84) field618.method4985()) {
                    if (var123.field1080 >= Statics.field1560 && var123.field1080 < Statics.field1560 + 8 && var123.field1091 >= Statics.field2217 && var123.field1091 < Statics.field2217 + 8 && Statics.field4237 == var123.field1079) {
                        var123.field1081 = 0;
                    }
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2795 == arg0.field1278) {
                field501 = var3.method6217();
                if (field501 == 1) {
                    field711 = var3.method6219();
                }
                if (field501 >= 2 && field501 <= 6) {
                    if (field501 == 2) {
                        field507 = 64;
                        field508 = 64;
                    }
                    if (field501 == 3) {
                        field507 = 0;
                        field508 = 64;
                    }
                    if (field501 == 4) {
                        field507 = 128;
                        field508 = 64;
                    }
                    if (field501 == 5) {
                        field507 = 64;
                        field508 = 0;
                    }
                    if (field501 == 6) {
                        field507 = 64;
                        field508 = 128;
                    }
                    field501 = 2;
                    field504 = var3.method6219();
                    field505 = var3.method6219();
                    field738 = var3.method6217();
                }
                if (field501 == 10) {
                    field686 = var3.method6219();
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2828 == arg0.field1278) {
                byte[] var124 = new byte[arg0.field1279];
                var3.method6169(var124, 0, var124.length);
                class400 var125 = new class400(var124);
                String var126 = var125.method6226();
                class30.method1762(var126, true, false);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2863 == arg0.field1278) {
                Statics.field1389 = null;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2820 == arg0.field1278) {
                field736 = true;
                Statics.field1377 = var3.method6217();
                Statics.field2625 = var3.method6217();
                Statics.field171 = var3.method6219();
                Statics.field3919 = var3.method6217();
                Statics.field924 = var3.method6217();
                if (Statics.field924 >= 100) {
                    int var127 = Statics.field1377 * 128 + 64;
                    int var128 = Statics.field2625 * 128 + 64;
                    int var129 = method1770(var127, var128, Statics.field4237) - Statics.field171;
                    int var130 = var127 - Statics.field2033;
                    int var131 = var129 - Statics.field1754;
                    int var132 = var128 - Statics.field155;
                    int var133 = (int) Math.sqrt((double) (var130 * var130 + var132 * var132));
                    Statics.field473 = (int) (Math.atan2((double) var131, (double) var133) * 325.949D) & 0x7FF;
                    Statics.field4169 = (int) (Math.atan2((double) var130, (double) var132) * -325.949D) & 0x7FF;
                    if (Statics.field473 < 128) {
                        Statics.field473 = 128;
                    }
                    if (Statics.field473 > 383) {
                        Statics.field473 = 383;
                    }
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2787 == arg0.field1278) {
                Statics.field100.method1578(var3, arg0.field1279);
                field684 = field674;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2783 == arg0.field1278) {
                int var134 = var3.method6222();
                int var135 = var3.method6219();
                if (var134 < -70000) {
                    var135 += 32768;
                }
                class262 var136;
                if (var134 >= 0) {
                    var136 = class262.method2073(var134);
                } else {
                    var136 = null;
                }
                if (var136 != null) {
                    for (int var137 = 0; var137 < var136.field3174.length; var137++) {
                        var136.field3174[var137] = 0;
                        var136.field3047[var137] = 0;
                    }
                }
                class78.method2261(var135);
                int var138 = var3.method6219();
                for (int var139 = 0; var139 < var138; var139++) {
                    int var140 = var3.method6251();
                    if (var140 == 255) {
                        var140 = var3.method6319();
                    }
                    int var141 = var3.method6342();
                    if (var136 != null && var139 < var136.field3174.length) {
                        var136.field3174[var139] = var141;
                        var136.field3047[var139] = var140;
                    }
                    class78.method1850(var135, var139, var141 - 1, var140);
                }
                if (var136 != null) {
                    method2027(var136);
                }
                method1779();
                field677[++field678 - 1 & 0x1F] = var135 & 0x7FFF;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2816 == arg0.field1278) {
                field736 = true;
                Statics.field1373 = var3.method6217();
                Statics.field448 = var3.method6217();
                Statics.field124 = var3.method6219();
                Statics.field2002 = var3.method6217();
                Statics.field1362 = var3.method6217();
                if (Statics.field1362 >= 100) {
                    Statics.field2033 = Statics.field1373 * 128 + 64;
                    Statics.field155 = Statics.field448 * 128 + 64;
                    Statics.field1754 = method1770(Statics.field2033, Statics.field155, Statics.field4237) - Statics.field124;
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2835 == arg0.field1278) {
                field673 = field674;
                byte var142 = var3.method6218();
                class134 var143 = new class134(var3);
                class137 var144;
                if (var142 >= 0) {
                    var144 = field719[var142];
                } else {
                    var144 = Statics.field2133;
                }
                var143.method2462(var144);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2772 == arg0.field1278) {
                String var145 = var3.method6226();
                int var146 = var3.method6217();
                int var147 = var3.method6217();
                if (var147 >= 1 && var147 <= 8) {
                    if (var145.equalsIgnoreCase(class283.field3339)) {
                        var145 = null;
                    }
                    field607[var147 - 1] = var145;
                    field614[var147 - 1] = var146 == 0;
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2845 == arg0.field1278) {
                int var148 = var3.method6222();
                if (field571 != var148) {
                    field571 = var148;
                    method1817();
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2848 == arg0.field1278) {
                int var149 = var3.method6222();
                class80 var150 = (class80) field650.method6016((long) var149);
                if (var150 != null) {
                    method3514(var150, true);
                }
                if (field655 != null) {
                    method2027(field655);
                    field655 = null;
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2824 == arg0.field1278) {
                int var151 = var3.method6217();
                if (var3.method6217() == 0) {
                    field591[var151] = new class299();
                    var3.field4272 += 18;
                } else {
                    var3.field4272--;
                    field591[var151] = new class299(var3, false);
                }
                field704 = field674;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2860 == arg0.field1278) {
                for (int var152 = 0; var152 < Statics.field1615; var152++) {
                    class153 var153 = class153.method2283(var152);
                    if (var153 != null) {
                        class257.field3000[var152] = 0;
                        class257.field3001[var152] = 0;
                    }
                }
                method1779();
                field577 += 32;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2846 == arg0.field1278) {
                field727 = var3.method6217();
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2778 == arg0.field1278) {
                boolean var154 = var3.method6251() == 1;
                int var155 = var3.method6222();
                class262 var156 = class262.method2073(var155);
                if (var156.field3066 != var154) {
                    var156.field3066 = var154;
                    method2027(var156);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2817 == arg0.field1278) {
                if (arg0.field1279 == 0) {
                    Statics.field1010 = null;
                } else {
                    if (Statics.field1010 == null) {
                        Statics.field1010 = new class333(Statics.field310, Statics.field3681);
                    }
                    Statics.field1010.method5399(var3);
                }
                method2356();
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2854 == arg0.field1278) {
                int var157 = var3.method6217();
                method1005(var157);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2775 == arg0.field1278) {
                int var158 = var3.method6222();
                int var159 = var3.method6222();
                int var160 = class32.method4517();
                class242 var161 = Statics.method1576(class240.field2717, field535.field1282);
                var161.field2767.method6243(field193);
                var161.field2767.method6243(var160);
                var161.field2767.method6262(var158);
                var161.field2767.method6263(var159);
                field535.method2211(var161);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2790 == arg0.field1278) {
                field500 = var3.method6257() * 30;
                field696 = field674;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2808 == arg0.field1278) {
                byte var162 = var3.method6218();
                long var163 = (long) var3.method6219();
                long var165 = (long) var3.method6327();
                long var167 = (var163 << 32) + var165;
                boolean var169 = false;
                class137 var170 = var162 >= 0 ? field719[var162] : Statics.field2133;
                if (var170 == null) {
                    var169 = true;
                } else {
                    for (int var171 = 0; var171 < 100; var171++) {
                        if (field616[var171] == var167) {
                            var169 = true;
                            break;
                        }
                    }
                }
                if (!var169) {
                    field616[field713] = var167;
                    field713 = (field713 + 1) % 100;
                    String var172 = class265.method3683(var3);
                    int var173 = var162 >= 0 ? 43 : 46;
                    class98.method1628(var173, "", var172, var170.field1518);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2837 == arg0.field1278) {
                method1013(class241.field2751);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2830 == arg0.field1278) {
                method2177();
                byte var174 = var3.method6218();
                class120 var175 = new class120(var3);
                class128 var176;
                if (var174 >= 0) {
                    var176 = field718[var174];
                } else {
                    var176 = Statics.field1233;
                }
                var175.method2364(var176);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2784 == arg0.field1278) {
                for (int var177 = 0; var177 < class257.field3001.length; var177++) {
                    if (class257.field3001[var177] != class257.field3000[var177]) {
                        class257.field3001[var177] = class257.field3000[var177];
                        method2583(var177);
                        field675[++field577 - 1 & 0x1F] = var177;
                    }
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2831 == arg0.field1278) {
                method215();
                arg0.field1278 = null;
                return false;
            }
            if (class243.field2851 == arg0.field1278) {
                int var178 = var3.method6219();
                int var179 = var3.method6217();
                int var180 = var3.method6219();
                method737(var178, var179, var180);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2825 == arg0.field1278) {
                method1013(class241.field2758);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2812 == arg0.field1278) {
                if (field649 != -1) {
                    method171(field649, 0);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2839 == arg0.field1278) {
                int var181 = var3.method6222();
                int var182 = var3.method6219();
                if (var181 < -70000) {
                    var182 += 32768;
                }
                class262 var183;
                if (var181 >= 0) {
                    var183 = class262.method2073(var181);
                } else {
                    var183 = null;
                }
                while (var3.field4272 < arg0.field1279) {
                    int var184 = var3.method6231();
                    int var185 = var3.method6219();
                    int var186 = 0;
                    if (var185 != 0) {
                        var186 = var3.method6217();
                        if (var186 == 255) {
                            var186 = var3.method6222();
                        }
                    }
                    if (var183 != null && var184 >= 0 && var184 < var183.field3174.length) {
                        var183.field3174[var184] = var185;
                        var183.field3047[var184] = var186;
                    }
                    class78.method1850(var182, var184, var185 - 1, var186);
                }
                if (var183 != null) {
                    method2027(var183);
                }
                method1779();
                field677[++field678 - 1 & 0x1F] = var182 & 0x7FFF;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2821 == arg0.field1278) {
                method1013(class241.field2759);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2856 == arg0.field1278) {
                method1013(class241.field2753);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2793 == arg0.field1278) {
                String var187 = var3.method6226();
                int var188 = var3.method6222();
                class262 var189 = class262.method2073(var188);
                if (!var187.equals(var189.field3145)) {
                    var189.field3145 = var187;
                    method2027(var189);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2798 == arg0.field1278) {
                Statics.field100.field791.method5384(var3, arg0.field1279);
                method3546();
                field684 = field674;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2855 == arg0.field1278) {
                int var190 = var3.method6222();
                int var191 = var3.method6257();
                class262 var192 = class262.method2073(var190);
                if (var192.field3064 != 2 || var192.field3032 != var191) {
                    var192.field3064 = 2;
                    var192.field3032 = var191;
                    method2027(var192);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2776 == arg0.field1278) {
                class96.method2563(var3, arg0.field1279);
                method1513();
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2849 == arg0.field1278) {
                method4632(true, arg0.field1284);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2773 == arg0.field1278) {
                method1013(class241.field2757);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2842 == arg0.field1278) {
                int var193 = var3.method6228();
                int var194 = var3.method6342();
                class262 var195 = class262.method2073(var193);
                if (var195 != null && var195.field3159 == 0) {
                    if (var194 > var195.field3096 - var195.field3062) {
                        var194 = var195.field3096 - var195.field3062;
                    }
                    if (var194 < 0) {
                        var194 = 0;
                    }
                    if (var195.field3068 != var194) {
                        var195.field3068 = var194;
                        method2027(var195);
                    }
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2806 == arg0.field1278) {
                int var196 = var3.method6255();
                int var197 = var3.method6342();
                int var198 = var3.method6319();
                int var199 = var3.method6255();
                class262 var200 = class262.method2073(var198);
                if (var200.field3097 != var196 || var200.field3074 != var197 || var200.field3100 != var199) {
                    var200.field3097 = var196;
                    var200.field3074 = var197;
                    var200.field3100 = var199;
                    method2027(var200);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2813 == arg0.field1278) {
                method2470(false, var3);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2827 == arg0.field1278) {
                if (Statics.field1010 != null) {
                    Statics.field1010.method5394(var3);
                }
                method2356();
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2819 == arg0.field1278) {
                int var201 = var3.method6257();
                class78.method2530(var201);
                field677[++field678 - 1 & 0x1F] = var201 & 0x7FFF;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2770 == arg0.field1278) {
                Statics.field100.method1566();
                field684 = field674;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2861 == arg0.field1278) {
                int var202 = var3.method6222();
                int var203 = var3.method6319();
                int var204 = var3.method6255();
                if (var204 == 65535) {
                    var204 = -1;
                }
                int var205 = var3.method6257();
                if (var205 == 65535) {
                    var205 = -1;
                }
                for (int var206 = var205; var206 <= var204; var206++) {
                    long var207 = ((long) var202 << 32) + (long) var206;
                    class369 var209 = field755.method6016(var207);
                    if (var209 != null) {
                        var209.method5732();
                    }
                    field755.method6015(new class368(var203), var207);
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2794 == arg0.field1278) {
                int var210 = var3.method6217();
                Statics.method4241(var210);
                arg0.field1278 = null;
                return false;
            }
            if (class243.field2779 == arg0.field1278) {
                boolean var211 = var3.method6217() == 1;
                if (var211) {
                    Statics.field862 = class397.method3986() - var3.method6223();
                    Statics.field1393 = new class292(var3, true);
                } else {
                    Statics.field1393 = null;
                }
                field689 = field674;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2826 == arg0.field1278) {
                String var212 = var3.method6226();
                String var213 = class316.method5207(class319.method2351(class265.method3683(var3)));
                class98.method1908(6, var212, var213);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2864 == arg0.field1278) {
                int var214 = arg0.field1279 + var3.field4272;
                int var215 = var3.method6219();
                int var216 = var3.method6219();
                if (field649 != var215) {
                    field649 = var215;
                    this.method1080(false);
                    method282(field649);
                    class64.method2282(field649);
                    for (int var217 = 0; var217 < 100; var217++) {
                        field698[var217] = true;
                    }
                }
                while (var216-- > 0) {
                    int var218 = var3.method6222();
                    int var219 = var3.method6219();
                    int var220 = var3.method6217();
                    class80 var221 = (class80) field650.method6016((long) var218);
                    if (var221 != null && var221.field1023 != var219) {
                        method3514(var221, true);
                        var221 = null;
                    }
                    if (var221 == null) {
                        var221 = method4121(var218, var219, var220);
                    }
                    var221.field1021 = true;
                }
                for (class80 var222 = (class80) field650.method6017(); var222 != null; var222 = (class80) field650.method6019()) {
                    if (var222.field1021) {
                        var222.field1021 = false;
                    } else {
                        method3514(var222, true);
                    }
                }
                field755 = new class379(512);
                while (var3.field4272 < var214) {
                    int var223 = var3.method6222();
                    int var224 = var3.method6219();
                    int var225 = var3.method6219();
                    int var226 = var3.method6222();
                    for (int var227 = var224; var227 <= var225; var227++) {
                        long var228 = ((long) var223 << 32) + (long) var227;
                        field755.method6015(new class368(var226), var228);
                    }
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2771 == arg0.field1278) {
                Statics.field90 = class417.method2783(var3.method6217());
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2843 == arg0.field1278) {
                boolean var230 = var3.method6197();
                if (!var230) {
                    Statics.field83 = null;
                } else if (Statics.field83 == null) {
                    Statics.field83 = new class301();
                }
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2774 == arg0.field1278) {
                method1013(class241.field2754);
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2814 == arg0.field1278) {
                int var231 = var3.method6219();
                byte var232 = var3.method6250();
                class257.field3000[var231] = var232;
                if (class257.field3001[var231] != var232) {
                    class257.field3001[var231] = var232;
                }
                method2583(var231);
                field675[++field577 - 1 & 0x1F] = var231;
                arg0.field1278 = null;
                return true;
            }
            if (class243.field2801 == arg0.field1278) {
                int var233 = var3.method6257();
                int var234 = var3.method6319();
                class257.field3000[var233] = var234;
                if (class257.field3001[var233] != var234) {
                    class257.field3001[var233] = var234;
                }
                method2583(var233);
                field675[++field577 - 1 & 0x1F] = var233;
                arg0.field1278 = null;
                return true;
            }
            class424.method21("" + (arg0.field1278 == null ? -1 : arg0.field1278.field2777) + class92.field1221 + (arg0.field1290 == null ? -1 : arg0.field1290.field2777) + class92.field1221 + (arg0.field1291 == null ? -1 : arg0.field1291.field2777) + class92.field1221 + arg0.field1279, (Throwable) null);
            method215();
        } catch (IOException var239) {
            method4213();
        } catch (Exception var240) {
            String var237 = "" + (arg0.field1278 == null ? -1 : arg0.field1278.field2777) + class92.field1221 + (arg0.field1290 == null ? -1 : arg0.field1290.field2777) + class92.field1221 + (arg0.field1291 == null ? -1 : arg0.field1291.field2777) + class92.field1221 + arg0.field1279 + class92.field1221 + (Statics.field1942 + Statics.field1485.field1126[0]) + class92.field1221 + (Statics.field3866 + Statics.field1485.field1150[0]) + class92.field1221;
            for (int var238 = 0; var238 < arg0.field1279 && var238 < 50; var238++) {
                var237 = var237 + var3.field4271[var238] + class92.field1221;
            }
            class424.method21(var237, var240);
            method215();
        }
        return true;
    }

    @ObfuscatedName("bl.hi(Lip;I)V")
    public static final void method1013(class241 arg0) {
        class399 var1 = field535.field1284;
        if (class241.field2750 == arg0) {
            int var2 = var1.method6409();
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = field550[var3];
            int var6 = var1.method6217();
            int var7 = (var6 >> 4 & 0x7) + Statics.field1560;
            int var8 = (var6 & 0x7) + Statics.field2217;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                method2817(Statics.field4237, var7, var8, var5, -1, var3, var4, 0, -1);
            }
        } else if (class241.field2759 == arg0) {
            byte var9 = var1.method6218();
            int var10 = var1.method6258();
            int var11 = var1.method6246();
            int var12 = var1.method6217();
            int var13 = (var12 >> 4 & 0x7) + Statics.field1560;
            int var14 = (var12 & 0x7) + Statics.field2217;
            int var15 = var1.method6246() * 4;
            int var16 = var1.method6409();
            int var17 = var1.method6342();
            int var18 = var1.method6342();
            byte var19 = var1.method6301();
            int var20 = var1.method6246() * 4;
            int var21 = var1.method6342();
            int var22 = var9 + var13;
            int var23 = var14 + var19;
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && var18 != 65535) {
                int var24 = var13 * 128 + 64;
                int var25 = var14 * 128 + 64;
                int var26 = var22 * 128 + 64;
                int var27 = var23 * 128 + 64;
                class70 var28 = new class70(var18, Statics.field4237, var24, var25, method1770(var24, var25, Statics.field4237) - var20, field744 + var21, field744 + var17, var11, var16, var10, var15);
                var28.method1818(var26, var27, method1770(var26, var27, Statics.field4237) - var15, field744 + var21);
                field554.method4986(var28);
            }
        } else {
            if (class241.field2756 == arg0) {
                int var29 = var1.method6219();
                int var30 = var1.method6217();
                int var31 = var30 >> 4 & 0xF;
                int var32 = var30 & 0x7;
                int var33 = var1.method6409();
                int var34 = (var33 >> 4 & 0x7) + Statics.field1560;
                int var35 = (var33 & 0x7) + Statics.field2217;
                int var36 = var1.method6409();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                    int var37 = var31 + 1;
                    if (Statics.field1485.field1126[0] >= var34 - var37 && Statics.field1485.field1126[0] <= var34 + var37 && Statics.field1485.field1150[0] >= var35 - var37 && Statics.field1485.field1150[0] <= var35 + var37 && Statics.field1779.field1199 != 0 && var32 > 0 && field730 < 50) {
                        field731[field730] = var29;
                        field732[field730] = var32;
                        field733[field730] = var36;
                        field735[field730] = null;
                        field734[field730] = (var34 << 16) + (var35 << 8) + var31;
                        field730++;
                    }
                }
            }
            if (class241.field2753 == arg0) {
                int var38 = var1.method6219();
                int var39 = var1.method6219();
                int var40 = var1.method6246();
                int var41 = (var40 >> 4 & 0x7) + Statics.field1560;
                int var42 = (var40 & 0x7) + Statics.field2217;
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                    class95 var43 = new class95();
                    var43.field1243 = var39;
                    var43.field1241 = var38;
                    if (field569[Statics.field4237][var41][var42] == null) {
                        field569[Statics.field4237][var41][var42] = new class309();
                    }
                    field569[Statics.field4237][var41][var42].method4986(var43);
                    method752(var41, var42);
                }
            } else if (class241.field2752 == arg0) {
                int var44 = var1.method6342();
                int var45 = var1.method6217();
                int var46 = (var45 >> 4 & 0x7) + Statics.field1560;
                int var47 = (var45 & 0x7) + Statics.field2217;
                if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                    class309 var48 = field569[Statics.field4237][var46][var47];
                    if (var48 != null) {
                        for (class95 var49 = (class95) var48.method4962(); var49 != null; var49 = (class95) var48.method4985()) {
                            if ((var44 & 0x7FFF) == var49.field1243) {
                                var49.method5732();
                                break;
                            }
                        }
                        if (var48.method4962() == null) {
                            field569[Statics.field4237][var46][var47] = null;
                        }
                        method752(var46, var47);
                    }
                }
            } else if (class241.field2751 == arg0) {
                int var50 = var1.method6219();
                int var51 = var1.method6409();
                int var52 = (var51 >> 4 & 0x7) + Statics.field1560;
                int var53 = (var51 & 0x7) + Statics.field2217;
                int var54 = var1.method6217();
                int var55 = var54 >> 2;
                int var56 = var54 & 0x3;
                int var57 = field550[var55];
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    method2817(Statics.field4237, var52, var53, var57, var50, var55, var56, 0, -1);
                }
            } else if (class241.field2757 == arg0) {
                int var58 = var1.method6409();
                int var59 = (var58 >> 4 & 0x7) + Statics.field1560;
                int var60 = (var58 & 0x7) + Statics.field2217;
                int var61 = var1.method6255();
                int var62 = var1.method6246();
                int var63 = var62 >> 2;
                int var64 = var62 & 0x3;
                int var65 = field550[var63];
                if (var59 >= 0 && var60 >= 0 && var59 < 103 && var60 < 103) {
                    if (var65 == 0) {
                        class225 var66 = Statics.field1964.method3809(Statics.field4237, var59, var60);
                        if (var66 != null) {
                            int var67 = class221.method2676(var66.field2596);
                            if (var63 == 2) {
                                var66.field2594 = new class73(var67, 2, var64 + 4, Statics.field4237, var59, var60, var61, false, var66.field2594);
                                var66.field2595 = new class73(var67, 2, var64 + 1 & 0x3, Statics.field4237, var59, var60, var61, false, var66.field2595);
                            } else {
                                var66.field2594 = new class73(var67, var63, var64, Statics.field4237, var59, var60, var61, false, var66.field2594);
                            }
                        }
                    }
                    if (var65 == 1) {
                        class227 var68 = Statics.field1964.method3810(Statics.field4237, var59, var60);
                        if (var68 != null) {
                            int var69 = class221.method2676(var68.field2608);
                            if (var63 == 4 || var63 == 5) {
                                var68.field2606 = new class73(var69, 4, var64, Statics.field4237, var59, var60, var61, false, var68.field2606);
                            } else if (var63 == 6) {
                                var68.field2606 = new class73(var69, 4, var64 + 4, Statics.field4237, var59, var60, var61, false, var68.field2606);
                            } else if (var63 == 7) {
                                var68.field2606 = new class73(var69, 4, (var64 + 2 & 0x3) + 4, Statics.field4237, var59, var60, var61, false, var68.field2606);
                            } else if (var63 == 8) {
                                var68.field2606 = new class73(var69, 4, var64 + 4, Statics.field4237, var59, var60, var61, false, var68.field2606);
                                var68.field2607 = new class73(var69, 4, (var64 + 2 & 0x3) + 4, Statics.field4237, var59, var60, var61, false, var68.field2607);
                            }
                        }
                    }
                    if (var65 == 2) {
                        class228 var70 = Statics.field1964.method3834(Statics.field4237, var59, var60);
                        if (var63 == 11) {
                            var63 = 10;
                        }
                        if (var70 != null) {
                            var70.field2614 = new class73(class221.method2676(var70.field2615), var63, var64, Statics.field4237, var59, var60, var61, false, var70.field2614);
                        }
                    }
                    if (var65 == 3) {
                        class207 var71 = Statics.field1964.method3811(Statics.field4237, var59, var60);
                        if (var71 != null) {
                            var71.field2275 = new class73(class221.method2676(var71.field2277), 22, var64, Statics.field4237, var59, var60, var61, false, var71.field2275);
                        }
                    }
                }
            } else if (class241.field2761 == arg0) {
                int var72 = var1.method6219();
                int var73 = var1.method6342();
                int var74 = var1.method6246();
                int var75 = (var74 >> 4 & 0x7) + Statics.field1560;
                int var76 = (var74 & 0x7) + Statics.field2217;
                int var77 = var1.method6217();
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                    int var78 = var75 * 128 + 64;
                    int var79 = var76 * 128 + 64;
                    class65 var80 = new class65(var73, Statics.field4237, var78, var79, method1770(var78, var79, Statics.field4237) - var77, var72, field744);
                    field620.method4986(var80);
                }
            } else {
                if (class241.field2754 == arg0) {
                    byte var81 = var1.method6303();
                    int var82 = var1.method6217();
                    int var83 = (var82 >> 4 & 0x7) + Statics.field1560;
                    int var84 = (var82 & 0x7) + Statics.field2217;
                    int var85 = var1.method6342();
                    byte var86 = var1.method6218();
                    int var87 = var1.method6219();
                    byte var88 = var1.method6250();
                    int var89 = var1.method6409();
                    int var90 = var89 >> 2;
                    int var91 = var89 & 0x3;
                    int var92 = field550[var90];
                    byte var93 = var1.method6218();
                    int var94 = var1.method6257();
                    int var95 = var1.method6219();
                    class83 var96;
                    if (field606 == var94) {
                        var96 = Statics.field1485;
                    } else {
                        var96 = field605[var94];
                    }
                    if (var96 != null) {
                        class169 var97 = class169.method2878(var87);
                        int var98;
                        int var99;
                        if (var91 == 1 || var91 == 3) {
                            var98 = var97.field1836;
                            var99 = var97.field1835;
                        } else {
                            var98 = var97.field1835;
                            var99 = var97.field1836;
                        }
                        int var100 = (var98 >> 1) + var83;
                        int var101 = (var98 + 1 >> 1) + var83;
                        int var102 = (var99 >> 1) + var84;
                        int var103 = (var99 + 1 >> 1) + var84;
                        int[][] var104 = class75.field976[Statics.field4237];
                        int var105 = var104[var100][var102] + var104[var101][var102] + var104[var100][var103] + var104[var101][var103] >> 2;
                        int var106 = (var83 << 7) + (var98 << 6);
                        int var107 = (var84 << 7) + (var99 << 6);
                        class220 var108 = var97.method2889(var90, var91, var104, var106, var105, var107);
                        if (var108 != null) {
                            method2817(Statics.field4237, var83, var84, var92, -1, 0, 0, var85 + 1, var95 + 1);
                            var96.field1057 = field744 + var85;
                            var96.field1058 = field744 + var95;
                            var96.field1062 = var108;
                            var96.field1059 = var83 * 128 + var98 * 64;
                            var96.field1061 = var84 * 128 + var99 * 64;
                            var96.field1077 = var105;
                            if (var86 > var81) {
                                byte var109 = var86;
                                var86 = var81;
                                var81 = var109;
                            }
                            if (var93 > var88) {
                                byte var110 = var93;
                                var93 = var88;
                                var88 = var110;
                            }
                            var96.field1063 = var83 + var86;
                            var96.field1065 = var81 + var83;
                            var96.field1054 = var84 + var93;
                            var96.field1066 = var84 + var88;
                        }
                    }
                }
                if (class241.field2758 == arg0) {
                    int var111 = var1.method6342();
                    int var112 = var1.method6342();
                    int var113 = var1.method6342();
                    int var114 = var1.method6251();
                    int var115 = (var114 >> 4 & 0x7) + Statics.field1560;
                    int var116 = (var114 & 0x7) + Statics.field2217;
                    if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                        class309 var117 = field569[Statics.field4237][var115][var116];
                        if (var117 != null) {
                            for (class95 var118 = (class95) var117.method4962(); var118 != null; var118 = (class95) var117.method4985()) {
                                if ((var113 & 0x7FFF) == var118.field1243 && var118.field1241 == var112) {
                                    var118.field1241 = var111;
                                    break;
                                }
                            }
                            method752(var115, var116);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fn.hd(IIIIIIIIIB)V")
    public static final void method2817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class84 var9 = null;
        for (class84 var10 = (class84) field618.method4962(); var10 != null; var10 = (class84) field618.method4985()) {
            if (var10.field1079 == arg0 && var10.field1080 == arg1 && var10.field1091 == arg2 && var10.field1083 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class84();
            var9.field1079 = arg0;
            var9.field1083 = arg3;
            var9.field1080 = arg1;
            var9.field1091 = arg2;
            method1940(var9);
            field618.method4986(var9);
        }
        var9.field1085 = arg4;
        var9.field1088 = arg5;
        var9.field1086 = arg6;
        var9.field1087 = arg7;
        var9.field1081 = arg8;
    }

    @ObfuscatedName("dx.hq(I)V")
    public static final void method2349() {
        for (class84 var0 = (class84) field618.method4962(); var0 != null; var0 = (class84) field618.method4985()) {
            if (var0.field1081 == -1) {
                var0.field1087 = 0;
                method1940(var0);
            } else {
                var0.method5732();
            }
        }
    }

    @ObfuscatedName("ci.hp(Lcb;I)V")
    public static final void method1940(class84 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1083 == 0) {
            var1 = Statics.field1964.method3812(arg0.field1079, arg0.field1080, arg0.field1091);
        }
        if (arg0.field1083 == 1) {
            var1 = Statics.field1964.method3813(arg0.field1079, arg0.field1080, arg0.field1091);
        }
        if (arg0.field1083 == 2) {
            var1 = Statics.field1964.method3814(arg0.field1079, arg0.field1080, arg0.field1091);
        }
        if (arg0.field1083 == 3) {
            var1 = Statics.field1964.method3815(arg0.field1079, arg0.field1080, arg0.field1091);
        }
        if (var1 != 0L) {
            int var6 = Statics.field1964.method3871(arg0.field1079, arg0.field1080, arg0.field1091, var1);
            var3 = class221.method2676(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1082 = var3;
        arg0.field1084 = var4;
        arg0.field1089 = var5;
    }

    @ObfuscatedName("z.he(S)V")
    public static final void method43() {
        for (class84 var0 = (class84) field618.method4962(); var0 != null; var0 = (class84) field618.method4985()) {
            if (var0.field1081 > 0) {
                var0.field1081--;
            }
            if (var0.field1081 != 0) {
                if (var0.field1087 > 0) {
                    var0.field1087--;
                }
                if (var0.field1087 == 0 && var0.field1080 >= 1 && var0.field1091 >= 1 && var0.field1080 <= 102 && var0.field1091 <= 102 && (var0.field1085 < 0 || class75.method2107(var0.field1085, var0.field1088))) {
                    method2361(var0.field1079, var0.field1083, var0.field1080, var0.field1091, var0.field1085, var0.field1086, var0.field1088);
                    var0.field1087 = -1;
                    if (var0.field1085 == var0.field1082 && var0.field1082 == -1) {
                        var0.method5732();
                    } else if (var0.field1085 == var0.field1082 && var0.field1089 == var0.field1086 && var0.field1088 == var0.field1084) {
                        var0.method5732();
                    }
                }
            } else if (var0.field1082 < 0 || class75.method2107(var0.field1082, var0.field1084)) {
                method2361(var0.field1079, var0.field1083, var0.field1080, var0.field1091, var0.field1082, var0.field1089, var0.field1084);
                var0.method5732();
            }
        }
    }

    @ObfuscatedName("dc.hg(IIIIIIII)V")
    public static final void method2361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field572 && Statics.field4237 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field1964.method3812(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1964.method3813(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1964.method3814(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1964.method3815(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field1964.method3871(arg0, arg2, arg3, var7);
            int var13 = class221.method2676(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1964.method3804(arg0, arg2, arg3);
                class169 var16 = class169.method2878(var13);
                if (var16.field1837 != 0) {
                    field695[arg0].method3083(arg2, arg3, var14, var15, var16.field1838);
                }
            }
            if (arg1 == 1) {
                Statics.field1964.method3805(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1964.method3889(arg0, arg2, arg3);
                class169 var17 = class169.method2878(var13);
                if (var17.field1835 + arg2 > 103 || var17.field1835 + arg3 > 103 || var17.field1836 + arg2 > 103 || var17.field1836 + arg3 > 103) {
                    return;
                }
                if (var17.field1837 != 0) {
                    field695[arg0].method3096(arg2, arg3, var17.field1835, var17.field1836, var15, var17.field1838);
                }
            }
            if (arg1 == 3) {
                Statics.field1964.method3939(arg0, arg2, arg3);
                class169 var18 = class169.method2878(var13);
                if (var18.field1837 == 1) {
                    field695[arg0].method3079(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class75.field977[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class75.method274(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field1964, field695[arg0]);
    }

    @ObfuscatedName("am.hk(IIB)V")
    public static final void method752(int arg0, int arg1) {
        class309 var2 = field569[Statics.field4237][arg0][arg1];
        if (var2 == null) {
            Statics.field1964.method3808(Statics.field4237, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method4962(); var6 != null; var6 = (class95) var2.method4985()) {
            class170 var7 = class170.method1776(var6.field1243);
            long var8 = (long) var7.field1895;
            if (var7.field1926 == 1) {
                var8 = (long) (var6.field1241 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1964.method3808(Statics.field4237, arg0, arg1);
            return;
        }
        var2.method4968(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method4962(); var12 != null; var12 = (class95) var2.method4985()) {
            if (var5.field1243 != var12.field1243) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1243 != var12.field1243 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class221.method2438(arg0, arg1, 3, false, 0);
        Statics.field1964.method3794(Statics.field4237, arg0, arg1, method1770(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field4237), var5, var13, var10, var11);
    }

    @ObfuscatedName("ev.hc(ZLoq;I)V")
    public static final void method2470(boolean arg0, class399 arg1) {
        field496 = 0;
        field561 = 0;
        method4131();
        method4594(arg0, arg1);
        method2133(arg1);
        for (int var2 = 0; var2 < field496; var2++) {
            int var3 = field611[var2];
            if (field744 != field530[var3].field1139) {
                field530[var3].field1214 = null;
                field530[var3] = null;
            }
        }
        if (field535.field1279 != arg1.field4272) {
            throw new RuntimeException(arg1.field4272 + class92.field1221 + field535.field1279);
        }
        for (int var4 = 0; var4 < field531; var4++) {
            if (field530[field532[var4]] == null) {
                throw new RuntimeException(var4 + class92.field1221 + field531);
            }
        }
    }

    @ObfuscatedName("hj.hw(I)V")
    public static final void method4131() {
        class399 var0 = field535.field1284;
        var0.method6168();
        int var1 = var0.method6184(8);
        if (var1 < field531) {
            for (int var2 = var1; var2 < field531; var2++) {
                field611[++field496 - 1] = field532[var2];
            }
        }
        if (var1 > field531) {
            throw new RuntimeException("");
        }
        field531 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field532[var3];
            class91 var5 = field530[var4];
            int var6 = var0.method6184(1);
            if (var6 == 0) {
                field532[++field531 - 1] = var4;
                var5.field1139 = field744;
            } else {
                int var7 = var0.method6184(2);
                if (var7 == 0) {
                    field532[++field531 - 1] = var4;
                    var5.field1139 = field744;
                    field534[++field561 - 1] = var4;
                } else if (var7 == 1) {
                    field532[++field531 - 1] = var4;
                    var5.field1139 = field744;
                    int var8 = var0.method6184(3);
                    var5.method2101(var8, (byte) 1);
                    int var9 = var0.method6184(1);
                    if (var9 == 1) {
                        field534[++field561 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field532[++field531 - 1] = var4;
                    var5.field1139 = field744;
                    int var10 = var0.method6184(3);
                    var5.method2101(var10, (byte) 2);
                    int var11 = var0.method6184(3);
                    var5.method2101(var11, (byte) 2);
                    int var12 = var0.method6184(1);
                    if (var12 == 1) {
                        field534[++field561 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field611[++field496 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("jc.hy(ZLoq;I)V")
    public static final void method4594(boolean arg0, class399 arg1) {
        while (true) {
            if (arg1.method6171(field535.field1279) >= 27) {
                int var2 = arg1.method6184(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field530[var2] == null) {
                        field530[var2] = new class91();
                        var3 = true;
                    }
                    class91 var4 = field530[var2];
                    field532[++field531 - 1] = var2;
                    var4.field1139 = field744;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method6184(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method6184(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field615[arg1.method6184(3)];
                    if (var3) {
                        var4.field1145 = var4.field1095 = var6;
                    }
                    int var7 = arg1.method6184(1);
                    int var8 = arg1.method6184(1);
                    if (var8 == 1) {
                        field534[++field561 - 1] = var2;
                    }
                    int var9;
                    if (arg0) {
                        var9 = arg1.method6184(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method6184(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field1214 = class161.method1950(arg1.method6184(14));
                    boolean var10 = arg1.method6184(1) == 1;
                    if (var10) {
                        arg1.method6184(32);
                    }
                    var4.field1138 = var4.field1214.field1711;
                    var4.field1147 = var4.field1214.field1715;
                    if (var4.field1147 == 0) {
                        var4.field1095 = 0;
                    }
                    var4.field1121 = var4.field1214.field1717;
                    var4.field1103 = var4.field1214.field1718;
                    var4.field1104 = var4.field1214.field1728;
                    var4.field1105 = var4.field1214.field1720;
                    var4.field1099 = var4.field1214.field1714;
                    var4.field1123 = var4.field1214.field1712;
                    var4.field1101 = var4.field1214.field1730;
                    var4.method2106(Statics.field1485.field1126[0] + var5, Statics.field1485.field1150[0] + var9, var7 == 1);
                    continue;
                }
            }
            arg1.method6170();
            return;
        }
    }

    @ObfuscatedName("cm.hn(Loq;B)V")
    public static final void method2133(class399 arg0) {
        for (int var1 = 0; var1 < field561; var1++) {
            int var2 = field534[var1];
            class91 var3 = field530[var2];
            int var4 = arg0.method6217();
            if ((var4 & 0x40) != 0) {
                var3.field1214 = class161.method1950(arg0.method6255());
                var3.field1138 = var3.field1214.field1711;
                var3.field1147 = var3.field1214.field1715;
                var3.field1121 = var3.field1214.field1717;
                var3.field1103 = var3.field1214.field1718;
                var3.field1104 = var3.field1214.field1728;
                var3.field1105 = var3.field1214.field1720;
                var3.field1099 = var3.field1214.field1714;
                var3.field1123 = var3.field1214.field1712;
                var3.field1101 = var3.field1214.field1730;
            }
            if ((var4 & 0x80) != 0) {
                int var5 = arg0.method6255();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = arg0.method6217();
                if (var3.field1130 == var5 && var5 != -1) {
                    int var7 = class172.method269(var5).field1962;
                    if (var7 == 1) {
                        var3.field1127 = 0;
                        var3.field1128 = 0;
                        var3.field1129 = var6;
                        var3.field1100 = 0;
                    }
                    if (var7 == 2) {
                        var3.field1100 = 0;
                    }
                } else if (var5 == -1 || var3.field1130 == -1 || class172.method269(var5).field1956 >= class172.method269(var3.field1130).field1956) {
                    var3.field1130 = var5;
                    var3.field1127 = 0;
                    var3.field1128 = 0;
                    var3.field1129 = var6;
                    var3.field1100 = 0;
                    var3.field1153 = var3.field1148;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var8 = arg0.method6342();
                int var9 = arg0.method6342();
                int var10 = var3.field1119 - (var8 - Statics.field1942 - Statics.field1942) * 64;
                int var11 = var3.field1096 - (var9 - Statics.field3866 - Statics.field3866) * 64;
                if (var10 != 0 || var11 != 0) {
                    var3.field1097 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1131 = arg0.method6219();
                int var12 = arg0.method6222();
                var3.field1135 = var12 >> 16;
                var3.field1134 = (var12 & 0xFFFF) + field744;
                var3.field1132 = 0;
                var3.field1125 = 0;
                if (var3.field1134 > field744) {
                    var3.field1132 = -1;
                }
                if (var3.field1131 == 65535) {
                    var3.field1131 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1107 = arg0.method6226();
                var3.field1110 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field1136 = arg0.method6218();
                var3.field1142 = arg0.method6250();
                var3.field1122 = arg0.method6303();
                var3.field1111 = arg0.method6303();
                var3.field1140 = arg0.method6342() + field744;
                var3.field1141 = arg0.method6257() + field744;
                var3.field1102 = arg0.method6255();
                var3.field1148 = 1;
                var3.field1153 = 0;
                var3.field1136 += var3.field1126[0];
                var3.field1142 += var3.field1150[0];
                var3.field1122 += var3.field1126[0];
                var3.field1111 += var3.field1150[0];
            }
            if ((var4 & 0x8) != 0) {
                var3.field1120 = arg0.method6219();
                if (var3.field1120 == 65535) {
                    var3.field1120 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var13 = arg0.method6409();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = arg0.method6231();
                        if (var18 == 32767) {
                            var18 = arg0.method6231();
                            var16 = arg0.method6231();
                            var15 = arg0.method6231();
                            var17 = arg0.method6231();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = arg0.method6231();
                        }
                        int var19 = arg0.method6231();
                        var3.method2017(var18, var16, var15, var17, field744, var19);
                    }
                }
                int var20 = arg0.method6246();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = arg0.method6231();
                        int var23 = arg0.method6231();
                        if (var23 == 32767) {
                            var3.method2019(var22);
                        } else {
                            int var24 = arg0.method6231();
                            int var25 = arg0.method6251();
                            int var26 = var23 > 0 ? arg0.method6246() : var25;
                            var3.method2018(var22, field744, var23, var24, var25, var26);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("os.hh(I)V")
    public static final void method6139() {
        int var0 = Statics.field2063;
        int var1 = Statics.field468;
        int var2 = Statics.field1649;
        int var3 = Statics.field2007;
        int var4 = 6116423;
        class409.method6556(var0, var1, var2, var3, var4);
        class409.method6556(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class409.method6531(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field53.method5174(class283.field3497, var0 + 3, var1 + 14, var4, -1);
        int var5 = class33.field221;
        int var6 = class33.field230;
        for (int var7 = 0; var7 < field626; var7++) {
            int var8 = (field626 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class315 var10 = Statics.field53;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field652[var7].length() > 0) {
                var11 = field575[var7] + class283.field3504 + field652[var7];
            } else {
                var11 = field575[var7];
            }
            var10.method5174(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field2063;
        int var13 = Statics.field468;
        int var14 = Statics.field1649;
        int var15 = Statics.field2007;
        for (int var16 = 0; var16 < field700; var16++) {
            if (field703[var16] + field701[var16] > var12 && field701[var16] < var12 + var14 && field721[var16] + field702[var16] > var13 && field702[var16] < var13 + var15) {
                field767[var16] = true;
            }
        }
    }

    @ObfuscatedName("ik.hj(B)Z")
    public static final boolean method4475() {
        return field625;
    }

    @ObfuscatedName("client.hf(B)V")
    public final void method1078() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field626 - 1; var2++) {
                if (field629[var2] < 1000 && field629[var2 + 1] > 1000) {
                    String var3 = field652[var2];
                    field652[var2] = field652[var2 + 1];
                    field652[var2 + 1] = var3;
                    String var4 = field575[var2];
                    field575[var2] = field575[var2 + 1];
                    field575[var2 + 1] = var4;
                    int var5 = field629[var2];
                    field629[var2] = field629[var2 + 1];
                    field629[var2 + 1] = var5;
                    int var6 = field627[var2];
                    field627[var2] = field627[var2 + 1];
                    field627[var2 + 1] = var6;
                    int var7 = field493[var2];
                    field493[var2] = field493[var2 + 1];
                    field493[var2 + 1] = var7;
                    int var8 = field630[var2];
                    field630[var2] = field630[var2 + 1];
                    field630[var2 + 1] = var8;
                    boolean var9 = field633[var2];
                    field633[var2] = field633[var2 + 1];
                    field633[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field390 != null || field662 != null) {
            return;
        }
        int var37;
        int var39;
        int var40;
        label249: {
            int var10 = class33.field236;
            if (field625) {
                if (var10 != 1 && (Statics.field949 || var10 != 4)) {
                    int var11 = class33.field221;
                    int var12 = class33.field230;
                    if (var11 < Statics.field2063 - 10 || var11 > Statics.field2063 + Statics.field1649 + 10 || var12 < Statics.field468 - 10 || var12 > Statics.field468 + Statics.field2007 + 10) {
                        field625 = false;
                        int var13 = Statics.field2063;
                        int var14 = Statics.field468;
                        int var15 = Statics.field1649;
                        int var16 = Statics.field2007;
                        for (int var17 = 0; var17 < field700; var17++) {
                            if (field703[var17] + field701[var17] > var13 && field701[var17] < var13 + var15 && field721[var17] + field702[var17] > var14 && field702[var17] < var14 + var16) {
                                field698[var17] = true;
                            }
                        }
                    }
                }
                if (var10 == 1 || !Statics.field949 && var10 == 4) {
                    int var18 = Statics.field2063;
                    int var19 = Statics.field468;
                    int var20 = Statics.field1649;
                    int var21 = class33.field241;
                    int var22 = class33.field238;
                    int var23 = -1;
                    for (int var24 = 0; var24 < field626; var24++) {
                        int var25 = (field626 - 1 - var24) * 15 + var19 + 31;
                        if (var21 > var18 && var21 < var18 + var20 && var22 > var25 - 13 && var22 < var25 + 3) {
                            var23 = var24;
                        }
                    }
                    if (var23 != -1 && var23 >= 0) {
                        int var26 = field627[var23];
                        int var27 = field493[var23];
                        int var28 = field629[var23];
                        int var29 = field630[var23];
                        String var30 = field575[var23];
                        String var31 = field652[var23];
                        method5377(var26, var27, var28, var29, var30, var31, class33.field241, class33.field238);
                    }
                    field625 = false;
                    int var32 = Statics.field2063;
                    int var33 = Statics.field468;
                    int var34 = Statics.field1649;
                    int var35 = Statics.field2007;
                    for (int var36 = 0; var36 < field700; var36++) {
                        if (field703[var36] + field701[var36] > var32 && field701[var36] < var32 + var34 && field721[var36] + field702[var36] > var33 && field702[var36] < var33 + var35) {
                            field698[var36] = true;
                        }
                    }
                }
            } else {
                var37 = method405();
                if ((var10 == 1 || !Statics.field949 && var10 == 4) && var37 >= 0) {
                    int var38 = field629[var37];
                    if (var38 == 39 || var38 == 40 || var38 == 41 || var38 == 42 || var38 == 43 || var38 == 33 || var38 == 34 || var38 == 35 || var38 == 36 || var38 == 37 || var38 == 38 || var38 == 1005) {
                        var39 = field627[var37];
                        var40 = field493[var37];
                        class262 var41 = class262.method2073(var40);
                        if (class263.method3511(method967(var41))) {
                            break label249;
                        }
                        int var42 = method967(var41);
                        boolean var43 = (var42 >> 29 & 0x1) != 0;
                        if (var43) {
                            break label249;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field949 && var10 == 4) && this.method1257()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field949 && var10 == 4) && field626 > 0 && var37 >= 0) {
                    int var47 = field627[var37];
                    int var48 = field493[var37];
                    int var49 = field629[var37];
                    int var50 = field630[var37];
                    String var51 = field575[var37];
                    String var52 = field652[var37];
                    method5377(var47, var48, var49, var50, var51, var52, class33.field241, class33.field238);
                }
                if (var10 == 2 && field626 > 0) {
                    this.method1079(class33.field241, class33.field238);
                }
            }
            return;
        }
        if (Statics.field390 != null && !field669 && field626 > 0 && !this.method1257()) {
            int var44 = field598;
            int var45 = field759;
            class67 var46 = Statics.field3670;
            method5377(var46.field860, var46.field865, var46.field861, var46.field866, var46.field863, var46.field863, var44, var45);
            Statics.field3670 = null;
        }
        field669 = false;
        field685 = 0;
        if (Statics.field390 != null) {
            method2027(Statics.field390);
        }
        Statics.field390 = class262.method2073(var40);
        field725 = var39;
        field598 = class33.field241;
        field759 = class33.field238;
        if (var37 >= 0) {
            Statics.field3670 = new class67();
            Statics.field3670.field860 = field627[var37];
            Statics.field3670.field865 = field493[var37];
            Statics.field3670.field861 = field629[var37];
            Statics.field3670.field866 = field630[var37];
            Statics.field3670.field863 = field575[var37];
        }
        method2027(Statics.field390);
    }

    @ObfuscatedName("client.ho(I)Z")
    public final boolean method1257() {
        int var1 = method405();
        return (field632 == 1 && field626 > 2 || method1059(var1)) && !field633[var1];
    }

    @ObfuscatedName("client.hu(III)V")
    public final void method1079(int arg0, int arg1) {
        method2103(arg0, arg1);
        Statics.field1964.method3852(Statics.field4237, arg0, arg1, false);
        field625 = true;
    }

    @ObfuscatedName("cr.ha(IIB)V")
    public static void method2103(int arg0, int arg1) {
        int var2 = Statics.field53.method5128(class283.field3497);
        for (int var3 = 0; var3 < field626; var3++) {
            class315 var4 = Statics.field53;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field652[var3].length() > 0) {
                var5 = field575[var3] + class283.field3504 + field652[var3];
            } else {
                var5 = field575[var3];
            }
            int var6 = var4.method5128(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field626 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1611) {
            var8 = Statics.field1611 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field200) {
            var9 = Statics.field200 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field2063 = var8;
        Statics.field468 = var9;
        Statics.field1649 = var2;
        Statics.field2007 = field626 * 15 + 22;
    }

    @ObfuscatedName("bw.hx(IB)Z")
    public static final boolean method1059(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field629[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("lw.hv(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method5377(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 39) {
            class242 var8 = Statics.method1576(class240.field2683, field535.field1282);
            var8.field2767.method6203(arg1);
            var8.field2767.method6254(arg0);
            var8.field2767.method6311(arg3);
            field535.method2211(var8);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 41) {
            class242 var9 = Statics.method1576(class240.field2735, field535.field1282);
            var9.field2767.method6311(arg3);
            var9.field2767.method6311(arg0);
            var9.field2767.method6263(arg1);
            field535.method2211(var9);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 7) {
            class91 var10 = field530[arg3];
            if (var10 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var11 = Statics.method1576(class240.field2681, field535.field1282);
                var11.field2767.method6311(arg3);
                var11.field2767.method6243(class24.field123[82] ? 1 : 0);
                var11.field2767.method6254(Statics.field1230);
                var11.field2767.method6263(Statics.field990);
                var11.field2767.method6254(Statics.field4064);
                field535.method2211(var11);
            }
        }
        if (arg2 == 16) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var12 = Statics.method1576(class240.field2641, field535.field1282);
            var12.field2767.method6353(Statics.field3866 + arg1);
            var12.field2767.method6263(Statics.field990);
            var12.field2767.method6254(Statics.field1942 + arg0);
            var12.field2767.method6254(Statics.field4064);
            var12.field2767.method6353(arg3);
            var12.field2767.method6311(Statics.field1230);
            var12.field2767.method6221(class24.field123[82] ? 1 : 0);
            field535.method2211(var12);
        }
        if (arg2 == 48) {
            class83 var13 = field605[arg3];
            if (var13 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var14 = Statics.method1576(class240.field2649, field535.field1282);
                var14.field2767.method6311(arg3);
                var14.field2767.method6200(class24.field123[82] ? 1 : 0);
                field535.method2211(var14);
            }
        }
        if (arg2 == 36) {
            class242 var15 = Statics.method1576(class240.field2682, field535.field1282);
            var15.field2767.method6311(arg0);
            var15.field2767.method6254(arg3);
            var15.field2767.method6263(arg1);
            field535.method2211(var15);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 46) {
            class83 var16 = field605[arg3];
            if (var16 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var17 = Statics.method1576(class240.field2652, field535.field1282);
                var17.field2767.method6243(class24.field123[82] ? 1 : 0);
                var17.field2767.method6253(arg3);
                field535.method2211(var17);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field858.method5963(arg2, arg3, new class258(arg0), new class258(arg1));
        }
        if (arg2 == 49) {
            class83 var18 = field605[arg3];
            if (var18 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var19 = Statics.method1576(class240.field2658, field535.field1282);
                var19.field2767.method6311(arg3);
                var19.field2767.method6243(class24.field123[82] ? 1 : 0);
                field535.method2211(var19);
            }
        }
        if (arg2 == 6) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var20 = Statics.method1576(class240.field2711, field535.field1282);
            var20.field2767.method6254(Statics.field1942 + arg0);
            var20.field2767.method6243(class24.field123[82] ? 1 : 0);
            var20.field2767.method6353(arg3);
            var20.field2767.method6253(Statics.field3866 + arg1);
            field535.method2211(var20);
        }
        if (arg2 == 4) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var21 = Statics.method1576(class240.field2654, field535.field1282);
            var21.field2767.method6353(arg3);
            var21.field2767.method6253(Statics.field3866 + arg1);
            var21.field2767.method6353(Statics.field1942 + arg0);
            var21.field2767.method6243(class24.field123[82] ? 1 : 0);
            field535.method2211(var21);
        }
        if (arg2 == 38) {
            method1008();
            class262 var22 = class262.method2073(arg1);
            field602 = 1;
            Statics.field4064 = arg0;
            Statics.field990 = arg1;
            Statics.field1230 = arg3;
            method2027(var22);
            field722 = class92.method1001(16748608) + class170.method1776(arg3).field1883 + class92.method1001(16777215);
            if (field722 == null) {
                field722 = class283.field3339;
            }
            return;
        }
        if (arg2 == 24) {
            class262 var23 = class262.method2073(arg1);
            boolean var24 = true;
            if (var23.field3050 > 0) {
                var24 = method2363(var23);
            }
            if (var24) {
                class242 var25 = Statics.method1576(class240.field2663, field535.field1282);
                var25.field2767.method6203(arg1);
                field535.method2211(var25);
            }
        }
        if (arg2 == 40) {
            class242 var26 = Statics.method1576(class240.field2664, field535.field1282);
            var26.field2767.method6353(arg3);
            var26.field2767.method6203(arg1);
            var26.field2767.method6254(arg0);
            field535.method2211(var26);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 43) {
            class242 var27 = Statics.method1576(class240.field2675, field535.field1282);
            var27.field2767.method6253(arg3);
            var27.field2767.method6262(arg1);
            var27.field2767.method6253(arg0);
            field535.method2211(var27);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 47) {
            class83 var28 = field605[arg3];
            if (var28 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var29 = Statics.method1576(class240.field2716, field535.field1282);
                var29.field2767.method6253(arg3);
                var29.field2767.method6221(class24.field123[82] ? 1 : 0);
                field535.method2211(var29);
            }
        }
        if (arg2 == 32) {
            class242 var30 = Statics.method1576(class240.field2746, field535.field1282);
            var30.field2767.method6264(Statics.field2221);
            var30.field2767.method6311(field645);
            var30.field2767.method6203(arg1);
            var30.field2767.method6254(arg3);
            var30.field2767.method6353(arg0);
            field535.method2211(var30);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 22) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var31 = Statics.method1576(class240.field2741, field535.field1282);
            var31.field2767.method6353(arg3);
            var31.field2767.method6253(Statics.field1942 + arg0);
            var31.field2767.method6245(class24.field123[82] ? 1 : 0);
            var31.field2767.method6353(Statics.field3866 + arg1);
            field535.method2211(var31);
        }
        if (arg2 == 19) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var32 = Statics.method1576(class240.field2730, field535.field1282);
            var32.field2767.method6253(Statics.field1942 + arg0);
            var32.field2767.method6353(arg3);
            var32.field2767.method6254(Statics.field3866 + arg1);
            var32.field2767.method6221(class24.field123[82] ? 1 : 0);
            field535.method2211(var32);
        }
        if (arg2 == 1005) {
            class262 var33 = class262.method2073(arg1);
            if (var33 == null || var33.field3047[arg0] < 100000) {
                class242 var34 = Statics.method1576(class240.field2713, field535.field1282);
                var34.field2767.method6253(arg3);
                field535.method2211(var34);
            } else {
                class98.method1908(27, "", var33.field3047[arg0] + " x " + class170.method1776(arg3).field1883);
            }
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 1001) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var35 = Statics.method1576(class240.field2650, field535.field1282);
            var35.field2767.method6353(Statics.field1942 + arg0);
            var35.field2767.method6253(Statics.field3866 + arg1);
            var35.field2767.method6311(arg3);
            var35.field2767.method6200(class24.field123[82] ? 1 : 0);
            field535.method2211(var35);
        }
        if (arg2 == 37) {
            class242 var36 = Statics.method1576(class240.field2643, field535.field1282);
            var36.field2767.method6311(arg3);
            var36.field2767.method6263(arg1);
            var36.field2767.method6254(arg0);
            field535.method2211(var36);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 10) {
            class91 var37 = field530[arg3];
            if (var37 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var38 = Statics.method1576(class240.field2729, field535.field1282);
                var38.field2767.method6311(arg3);
                var38.field2767.method6245(class24.field123[82] ? 1 : 0);
                field535.method2211(var38);
            }
        }
        if (arg2 == 45) {
            class83 var39 = field605[arg3];
            if (var39 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var40 = Statics.method1576(class240.field2742, field535.field1282);
                var40.field2767.method6200(class24.field123[82] ? 1 : 0);
                var40.field2767.method6353(arg3);
                field535.method2211(var40);
            }
        }
        if (arg2 == 25) {
            class262 var41 = class262.method2816(arg1, arg0);
            if (var41 != null) {
                method1008();
                method4625(arg1, arg0, class263.method2494(method967(var41)), var41.field3176);
                field602 = 0;
                field647 = method2539(var41);
                if (field647 == null) {
                    field647 = class283.field3339;
                }
                if (var41.field3045) {
                    field628 = var41.field3116 + class92.method1001(16777215);
                } else {
                    field628 = class92.method1001(65280) + var41.field3172 + class92.method1001(16777215);
                }
            }
            return;
        }
        if (arg2 == 51) {
            class83 var42 = field605[arg3];
            if (var42 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var43 = Statics.method1576(class240.field2714, field535.field1282);
                var43.field2767.method6245(class24.field123[82] ? 1 : 0);
                var43.field2767.method6353(arg3);
                field535.method2211(var43);
            }
        }
        if (arg2 == 33) {
            class242 var44 = Statics.method1576(class240.field2709, field535.field1282);
            var44.field2767.method6264(arg1);
            var44.field2767.method6311(arg3);
            var44.field2767.method6254(arg0);
            field535.method2211(var44);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 26) {
            method5415();
        }
        if (arg2 == 2) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var45 = Statics.method1576(class240.field2673, field535.field1282);
            var45.field2767.method6254(arg3);
            var45.field2767.method6311(Statics.field3866 + arg1);
            var45.field2767.method6353(Statics.field1942 + arg0);
            var45.field2767.method6353(field645);
            var45.field2767.method6200(class24.field123[82] ? 1 : 0);
            var45.field2767.method6353(field646);
            var45.field2767.method6203(Statics.field2221);
            field535.method2211(var45);
        }
        if (arg2 == 1002) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            class242 var46 = Statics.method1576(class240.field2747, field535.field1282);
            var46.field2767.method6253(arg3);
            field535.method2211(var46);
        }
        if (arg2 == 17) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var47 = Statics.method1576(class240.field2644, field535.field1282);
            var47.field2767.method6254(field645);
            var47.field2767.method6203(Statics.field2221);
            var47.field2767.method6353(arg3);
            var47.field2767.method6311(Statics.field3866 + arg1);
            var47.field2767.method6353(Statics.field1942 + arg0);
            var47.field2767.method6245(class24.field123[82] ? 1 : 0);
            var47.field2767.method6353(field646);
            field535.method2211(var47);
        }
        if (arg2 == 1) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var48 = Statics.method1576(class240.field2684, field535.field1282);
            var48.field2767.method6203(Statics.field990);
            var48.field2767.method6311(Statics.field4064);
            var48.field2767.method6254(Statics.field1942 + arg0);
            var48.field2767.method6311(Statics.field3866 + arg1);
            var48.field2767.method6311(arg3);
            var48.field2767.method6245(class24.field123[82] ? 1 : 0);
            var48.field2767.method6311(Statics.field1230);
            field535.method2211(var48);
        }
        if (arg2 == 11) {
            class91 var49 = field530[arg3];
            if (var49 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var50 = Statics.method1576(class240.field2661, field535.field1282);
                var50.field2767.method6353(arg3);
                var50.field2767.method6200(class24.field123[82] ? 1 : 0);
                field535.method2211(var50);
            }
        }
        if (arg2 == 30 && field655 == null) {
            method363(arg1, arg0);
            field655 = class262.method2816(arg1, arg0);
            method2027(field655);
        }
        if (arg2 == 3) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var51 = Statics.method1576(class240.field2710, field535.field1282);
            var51.field2767.method6221(class24.field123[82] ? 1 : 0);
            var51.field2767.method6253(Statics.field1942 + arg0);
            var51.field2767.method6353(Statics.field3866 + arg1);
            var51.field2767.method6311(arg3);
            field535.method2211(var51);
        }
        if (arg2 == 9) {
            class91 var52 = field530[arg3];
            if (var52 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var53 = Statics.method1576(class240.field2707, field535.field1282);
                var53.field2767.method6200(class24.field123[82] ? 1 : 0);
                var53.field2767.method6353(arg3);
                field535.method2211(var53);
            }
        }
        if (arg2 == 29) {
            class242 var54 = Statics.method1576(class240.field2663, field535.field1282);
            var54.field2767.method6203(arg1);
            field535.method2211(var54);
            class262 var55 = class262.method2073(arg1);
            if (var55.field3168 != null && var55.field3168[0][0] == 5) {
                int var56 = var55.field3168[0][1];
                if (class257.field3001[var56] != var55.field3170[0]) {
                    class257.field3001[var56] = var55.field3170[0];
                    method2583(var56);
                }
            }
        }
        if (arg2 == 50) {
            class83 var57 = field605[arg3];
            if (var57 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var58 = Statics.method1576(class240.field2677, field535.field1282);
                var58.field2767.method6353(arg3);
                var58.field2767.method6221(class24.field123[82] ? 1 : 0);
                field535.method2211(var58);
            }
        }
        if (arg2 == 20) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var59 = Statics.method1576(class240.field2660, field535.field1282);
            var59.field2767.method6243(class24.field123[82] ? 1 : 0);
            var59.field2767.method6253(Statics.field3866 + arg1);
            var59.field2767.method6253(arg3);
            var59.field2767.method6311(Statics.field1942 + arg0);
            field535.method2211(var59);
        }
        if (arg2 == 13) {
            class91 var60 = field530[arg3];
            if (var60 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var61 = Statics.method1576(class240.field2659, field535.field1282);
                var61.field2767.method6200(class24.field123[82] ? 1 : 0);
                var61.field2767.method6253(arg3);
                field535.method2211(var61);
            }
        }
        if (arg2 == 35) {
            class242 var62 = Statics.method1576(class240.field2719, field535.field1282);
            var62.field2767.method6254(arg0);
            var62.field2767.method6264(arg1);
            var62.field2767.method6311(arg3);
            field535.method2211(var62);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 1004) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            class242 var63 = Statics.method1576(class240.field2713, field535.field1282);
            var63.field2767.method6253(arg3);
            field535.method2211(var63);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class262 var64 = class262.method2816(arg1, arg0);
            if (var64 != null) {
                method603(arg3, arg1, arg0, var64.field3176, arg5);
            }
        }
        if (arg2 == 18) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var65 = Statics.method1576(class240.field2725, field535.field1282);
            var65.field2767.method6245(class24.field123[82] ? 1 : 0);
            var65.field2767.method6253(Statics.field3866 + arg1);
            var65.field2767.method6254(Statics.field1942 + arg0);
            var65.field2767.method6253(arg3);
            field535.method2211(var65);
        }
        if (arg2 == 34) {
            class242 var66 = Statics.method1576(class240.field2695, field535.field1282);
            var66.field2767.method6253(arg0);
            var66.field2767.method6311(arg3);
            var66.field2767.method6203(arg1);
            field535.method2211(var66);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 44) {
            class83 var67 = field605[arg3];
            if (var67 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var68 = Statics.method1576(class240.field2671, field535.field1282);
                var68.field2767.method6243(class24.field123[82] ? 1 : 0);
                var68.field2767.method6253(arg3);
                field535.method2211(var68);
            }
        }
        if (arg2 == 23) {
            if (field625) {
                Statics.field1964.method3824();
            } else {
                Statics.field1964.method3852(Statics.field4237, arg0, arg1, true);
            }
        }
        if (arg2 == 8) {
            class91 var69 = field530[arg3];
            if (var69 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var70 = Statics.method1576(class240.field2744, field535.field1282);
                var70.field2767.method6264(Statics.field2221);
                var70.field2767.method6253(arg3);
                var70.field2767.method6253(field646);
                var70.field2767.method6311(field645);
                var70.field2767.method6245(class24.field123[82] ? 1 : 0);
                field535.method2211(var70);
            }
        }
        if (arg2 == 1003) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            class91 var71 = field530[arg3];
            if (var71 != null) {
                class161 var72 = var71.field1214;
                if (var72.field1735 != null) {
                    var72 = var72.method2712();
                }
                if (var72 != null) {
                    class242 var73 = Statics.method1576(class240.field2722, field535.field1282);
                    var73.field2767.method6254(var72.field1709);
                    field535.method2211(var73);
                }
            }
        }
        if (arg2 == 5) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var74 = Statics.method1576(class240.field2733, field535.field1282);
            var74.field2767.method6243(class24.field123[82] ? 1 : 0);
            var74.field2767.method6254(arg3);
            var74.field2767.method6254(Statics.field3866 + arg1);
            var74.field2767.method6353(Statics.field1942 + arg0);
            field535.method2211(var74);
        }
        if (arg2 == 31) {
            class242 var75 = Statics.method1576(class240.field2653, field535.field1282);
            var75.field2767.method6353(arg0);
            var75.field2767.method6262(arg1);
            var75.field2767.method6353(Statics.field1230);
            var75.field2767.method6203(Statics.field990);
            var75.field2767.method6253(Statics.field4064);
            var75.field2767.method6254(arg3);
            field535.method2211(var75);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 14) {
            class83 var76 = field605[arg3];
            if (var76 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var77 = Statics.method1576(class240.field2694, field535.field1282);
                var77.field2767.method6353(arg3);
                var77.field2767.method6311(Statics.field4064);
                var77.field2767.method6253(Statics.field1230);
                var77.field2767.method6264(Statics.field990);
                var77.field2767.method6221(class24.field123[82] ? 1 : 0);
                field535.method2211(var77);
            }
        }
        if (arg2 == 28) {
            class242 var78 = Statics.method1576(class240.field2663, field535.field1282);
            var78.field2767.method6203(arg1);
            field535.method2211(var78);
            class262 var79 = class262.method2073(arg1);
            if (var79.field3168 != null && var79.field3168[0][0] == 5) {
                int var80 = var79.field3168[0][1];
                class257.field3001[var80] = 1 - class257.field3001[var80];
                method2583(var80);
            }
        }
        if (arg2 == 58) {
            class262 var81 = class262.method2816(arg1, arg0);
            if (var81 != null) {
                class242 var82 = Statics.method1576(class240.field2656, field535.field1282);
                var82.field2767.method6353(var81.field3176);
                var82.field2767.method6203(Statics.field2221);
                var82.field2767.method6353(field645);
                var82.field2767.method6262(arg1);
                var82.field2767.method6311(arg0);
                var82.field2767.method6353(field646);
                field535.method2211(var82);
            }
        }
        if (arg2 == 42) {
            class242 var83 = Statics.method1576(class240.field2706, field535.field1282);
            var83.field2767.method6253(arg0);
            var83.field2767.method6311(arg3);
            var83.field2767.method6264(arg1);
            field535.method2211(var83);
            field728 = 0;
            Statics.field3935 = class262.method2073(arg1);
            field594 = arg0;
        }
        if (arg2 == 21) {
            field590 = arg6;
            field723 = arg7;
            field593 = 2;
            field592 = 0;
            field586 = arg0;
            field726 = arg1;
            class242 var84 = Statics.method1576(class240.field2703, field535.field1282);
            var84.field2767.method6245(class24.field123[82] ? 1 : 0);
            var84.field2767.method6353(Statics.field1942 + arg0);
            var84.field2767.method6253(arg3);
            var84.field2767.method6253(Statics.field3866 + arg1);
            field535.method2211(var84);
        }
        if (arg2 == 15) {
            class83 var85 = field605[arg3];
            if (var85 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var86 = Statics.method1576(class240.field2686, field535.field1282);
                var86.field2767.method6311(field646);
                var86.field2767.method6200(class24.field123[82] ? 1 : 0);
                var86.field2767.method6203(Statics.field2221);
                var86.field2767.method6254(field645);
                var86.field2767.method6311(arg3);
                field535.method2211(var86);
            }
        }
        if (arg2 == 12) {
            class91 var87 = field530[arg3];
            if (var87 != null) {
                field590 = arg6;
                field723 = arg7;
                field593 = 2;
                field592 = 0;
                field586 = arg0;
                field726 = arg1;
                class242 var88 = Statics.method1576(class240.field2647, field535.field1282);
                var88.field2767.method6221(class24.field123[82] ? 1 : 0);
                var88.field2767.method6311(arg3);
                field535.method2211(var88);
            }
        }
        if (field602 != 0) {
            field602 = 0;
            method2027(class262.method2073(Statics.field990));
        }
        if (field644) {
            method1008();
        }
        if (Statics.field3935 != null && field728 == 0) {
            method2027(Statics.field3935);
        }
    }

    @ObfuscatedName("lv.io(ILjava/lang/String;I)V")
    public static void method5372(int arg0, String arg1) {
        int var2 = class96.field1257;
        int[] var3 = class96.field1249;
        boolean var4 = false;
        class421 var5 = new class421(arg1, Statics.field310);
        for (int var6 = 0; var6 < var2; var6++) {
            class83 var7 = field605[var3[var6]];
            if (var7 != null && Statics.field1485 != var7 && var7.field1070 != null && var7.field1070.equals(var5)) {
                if (arg0 == 1) {
                    class242 var8 = Statics.method1576(class240.field2671, field535.field1282);
                    var8.field2767.method6243(0);
                    var8.field2767.method6253(var3[var6]);
                    field535.method2211(var8);
                } else if (arg0 == 4) {
                    class242 var9 = Statics.method1576(class240.field2716, field535.field1282);
                    var9.field2767.method6253(var3[var6]);
                    var9.field2767.method6221(0);
                    field535.method2211(var9);
                } else if (arg0 == 6) {
                    class242 var10 = Statics.method1576(class240.field2658, field535.field1282);
                    var10.field2767.method6311(var3[var6]);
                    var10.field2767.method6243(0);
                    field535.method2211(var10);
                } else if (arg0 == 7) {
                    class242 var11 = Statics.method1576(class240.field2677, field535.field1282);
                    var11.field2767.method6353(var3[var6]);
                    var11.field2767.method6221(0);
                    field535.method2211(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class98.method1908(4, "", class283.field3493 + arg1);
        }
    }

    @ObfuscatedName("jm.im(IIIII)V")
    public static void method4625(int arg0, int arg1, int arg2, int arg3) {
        class262 var4 = class262.method2816(arg0, arg1);
        if (var4 != null && var4.field3143 != null) {
            class81 var5 = new class81();
            var5.field1028 = var4;
            var5.field1031 = var4.field3143;
            Statics.method2499(var5);
        }
        field646 = arg3;
        field644 = true;
        Statics.field2221 = arg0;
        field645 = arg1;
        Statics.field450 = arg2;
        method2027(var4);
    }

    @ObfuscatedName("bp.ir(I)V")
    public static void method1008() {
        if (!field644) {
            return;
        }
        class262 var0 = class262.method2816(Statics.field2221, field645);
        if (var0 != null && var0.field3140 != null) {
            class81 var1 = new class81();
            var1.field1028 = var0;
            var1.field1031 = var0.field3140;
            Statics.method2499(var1);
        }
        field646 = -1;
        field644 = false;
        method2027(var0);
    }

    @ObfuscatedName("w.ij(III)V")
    public static void method363(int arg0, int arg1) {
        class242 var2 = Statics.method1576(class240.field2691, field535.field1282);
        var2.field2767.method6353(arg1);
        var2.field2767.method6264(arg0);
        field535.method2211(var2);
    }

    @ObfuscatedName("as.ig(IIIILjava/lang/String;B)V")
    public static void method603(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class262 var5 = class262.method2816(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3152 != null) {
            class81 var6 = new class81();
            var6.field1028 = var5;
            var6.field1037 = arg0;
            var6.field1026 = arg4;
            var6.field1031 = var5.field3152;
            Statics.method2499(var6);
        }
        boolean var7 = true;
        if (var5.field3050 > 0) {
            var7 = method2363(var5);
        }
        if (!var7 || !class263.method977(method967(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class242 var8 = Statics.method1576(class240.field2680, field535.field1282);
            var8.field2767.method6203(arg1);
            var8.field2767.method6311(arg2);
            var8.field2767.method6311(arg3);
            field535.method2211(var8);
        }
        if (arg0 == 2) {
            class242 var9 = Statics.method1576(class240.field2736, field535.field1282);
            var9.field2767.method6203(arg1);
            var9.field2767.method6311(arg2);
            var9.field2767.method6311(arg3);
            field535.method2211(var9);
        }
        if (arg0 == 3) {
            class242 var10 = Statics.method1576(class240.field2737, field535.field1282);
            var10.field2767.method6203(arg1);
            var10.field2767.method6311(arg2);
            var10.field2767.method6311(arg3);
            field535.method2211(var10);
        }
        if (arg0 == 4) {
            class242 var11 = Statics.method1576(class240.field2651, field535.field1282);
            var11.field2767.method6203(arg1);
            var11.field2767.method6311(arg2);
            var11.field2767.method6311(arg3);
            field535.method2211(var11);
        }
        if (arg0 == 5) {
            class242 var12 = Statics.method1576(class240.field2739, field535.field1282);
            var12.field2767.method6203(arg1);
            var12.field2767.method6311(arg2);
            var12.field2767.method6311(arg3);
            field535.method2211(var12);
        }
        if (arg0 == 6) {
            class242 var13 = Statics.method1576(class240.field2669, field535.field1282);
            var13.field2767.method6203(arg1);
            var13.field2767.method6311(arg2);
            var13.field2767.method6311(arg3);
            field535.method2211(var13);
        }
        if (arg0 == 7) {
            class242 var14 = Statics.method1576(class240.field2692, field535.field1282);
            var14.field2767.method6203(arg1);
            var14.field2767.method6311(arg2);
            var14.field2767.method6311(arg3);
            field535.method2211(var14);
        }
        if (arg0 == 8) {
            class242 var15 = Statics.method1576(class240.field2734, field535.field1282);
            var15.field2767.method6203(arg1);
            var15.field2767.method6311(arg2);
            var15.field2767.method6311(arg3);
            field535.method2211(var15);
        }
        if (arg0 == 9) {
            class242 var16 = Statics.method1576(class240.field2645, field535.field1282);
            var16.field2767.method6203(arg1);
            var16.field2767.method6311(arg2);
            var16.field2767.method6311(arg3);
            field535.method2211(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class242 var17 = Statics.method1576(class240.field2672, field535.field1282);
        var17.field2767.method6203(arg1);
        var17.field2767.method6311(arg2);
        var17.field2767.method6311(arg3);
        field535.method2211(var17);
    }

    @ObfuscatedName("hy.ix(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method4128(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method4810(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("km.ip(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method4810(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field625 || field626 >= 500) {
            return;
        }
        field575[field626] = arg0;
        field652[field626] = arg1;
        field629[field626] = arg2;
        field630[field626] = arg3;
        field627[field626] = arg4;
        field493[field626] = arg5;
        field633[field626] = arg6;
        field626++;
    }

    @ObfuscatedName("al.il(I)I")
    public static final int method405() {
        return field626 - 1;
    }

    @ObfuscatedName("cb.it(I)V")
    public static void method2012() {
        for (int var0 = 0; var0 < field626; var0++) {
            int var1 = field629[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field626 - 1) {
                    for (int var3 = var0; var3 < field626 - 1; var3++) {
                        field575[var3] = field575[var3 + 1];
                        field652[var3] = field652[var3 + 1];
                        field629[var3] = field629[var3 + 1];
                        field630[var3] = field630[var3 + 1];
                        field627[var3] = field627[var3 + 1];
                        field493[var3] = field493[var3 + 1];
                        field633[var3] = field633[var3 + 1];
                    }
                }
                var0--;
                field626--;
            }
        }
        method2103(Statics.field1649 / 2 + Statics.field2063, Statics.field468);
    }

    @ObfuscatedName("al.ie(IIIII)V")
    public static final void method401(int arg0, int arg1, int arg2, int arg3) {
        if (field602 == 0 && !field644) {
            method4128(class283.field3499, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class221.field2570;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = class221.method4634(var4);
                    class83 var14 = field605[field565];
                    method1915(var14, field565, var11, var13);
                }
                return;
            }
            long var15 = class221.method2379(var8);
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    int var17 = class221.method2072(var8);
                    int var18 = class221.method3465(var8);
                    long var19 = class221.field2574[var8];
                    int var21 = (int) (var19 >>> 14 & 0x3L);
                    int var24 = class221.method3697(var8);
                    if (var21 == 2 && Statics.field1964.method3871(Statics.field4237, var17, var18, var15) >= 0) {
                        class169 var25 = class169.method2878(var24);
                        if (var25.field1861 != null) {
                            var25 = var25.method2895();
                        }
                        if (var25 == null) {
                            break label277;
                        }
                        if (field602 == 1) {
                            method4128(class283.field3494, field722 + " " + class92.field1216 + " " + class92.method1001(65535) + var25.field1845, 1, var24, var17, var18);
                        } else if (!field644) {
                            String[] var26 = var25.field1847;
                            if (var26 != null) {
                                for (int var27 = 4; var27 >= 0; var27--) {
                                    if (var26[var27] != null) {
                                        short var28 = 0;
                                        if (var27 == 0) {
                                            var28 = 3;
                                        }
                                        if (var27 == 1) {
                                            var28 = 4;
                                        }
                                        if (var27 == 2) {
                                            var28 = 5;
                                        }
                                        if (var27 == 3) {
                                            var28 = 6;
                                        }
                                        if (var27 == 4) {
                                            var28 = 1001;
                                        }
                                        method4128(var26[var27], class92.method1001(65535) + var25.field1845, var28, var24, var17, var18);
                                    }
                                }
                            }
                            method4128(class283.field3495, class92.method1001(65535) + var25.field1845, 1002, var25.field1827, var17, var18);
                        } else if ((Statics.field450 & 0x4) == 4) {
                            method4128(field647, field628 + " " + class92.field1216 + " " + class92.method1001(65535) + var25.field1845, 2, var24, var17, var18);
                        }
                    }
                    if (var21 == 1) {
                        class91 var29 = field530[var24];
                        if (var29 == null) {
                            break label277;
                        }
                        if (var29.field1214.field1711 == 1 && (var29.field1119 & 0x7F) == 64 && (var29.field1096 & 0x7F) == 64) {
                            for (int var30 = 0; var30 < field531; var30++) {
                                class91 var31 = field530[field532[var30]];
                                if (var31 != null && var29 != var31 && var31.field1214.field1711 == 1 && var29.field1119 == var31.field1119 && var29.field1096 == var31.field1096) {
                                    method1910(var31.field1214, field532[var30], var17, var18);
                                }
                            }
                            int var32 = class96.field1257;
                            int[] var33 = class96.field1249;
                            for (int var34 = 0; var34 < var32; var34++) {
                                class83 var35 = field605[var33[var34]];
                                if (var35 != null && var29.field1119 == var35.field1119 && var29.field1096 == var35.field1096) {
                                    method1915(var35, var33[var34], var17, var18);
                                }
                            }
                        }
                        method1910(var29.field1214, var24, var17, var18);
                    }
                    if (var21 == 0) {
                        class83 var36 = field605[var24];
                        if (var36 == null) {
                            break label277;
                        }
                        if ((var36.field1119 & 0x7F) == 64 && (var36.field1096 & 0x7F) == 64) {
                            for (int var37 = 0; var37 < field531; var37++) {
                                class91 var38 = field530[field532[var37]];
                                if (var38 != null && var38.field1214.field1711 == 1 && var36.field1119 == var38.field1119 && var36.field1096 == var38.field1096) {
                                    method1910(var38.field1214, field532[var37], var17, var18);
                                }
                            }
                            int var39 = class96.field1257;
                            int[] var40 = class96.field1249;
                            for (int var41 = 0; var41 < var39; var41++) {
                                class83 var42 = field605[var40[var41]];
                                if (var42 != null && var36 != var42 && var36.field1119 == var42.field1119 && var36.field1096 == var42.field1096) {
                                    method1915(var42, var40[var41], var17, var18);
                                }
                            }
                        }
                        if (field565 == var24) {
                            var4 = var15;
                        } else {
                            method1915(var36, var24, var17, var18);
                        }
                    }
                    if (var21 == 3) {
                        class309 var43 = field569[Statics.field4237][var17][var18];
                        if (var43 != null) {
                            for (class95 var44 = (class95) var43.method4965(); var44 != null; var44 = (class95) var43.method4959()) {
                                class170 var45 = class170.method1776(var44.field1243);
                                if (field602 == 1) {
                                    method4128(class283.field3494, field722 + " " + class92.field1216 + " " + class92.method1001(16748608) + var45.field1883, 16, var44.field1243, var17, var18);
                                } else if (!field644) {
                                    String[] var46 = var45.field1927;
                                    for (int var47 = 4; var47 >= 0; var47--) {
                                        if (var46 != null && var46[var47] != null) {
                                            byte var48 = 0;
                                            if (var47 == 0) {
                                                var48 = 18;
                                            }
                                            if (var47 == 1) {
                                                var48 = 19;
                                            }
                                            if (var47 == 2) {
                                                var48 = 20;
                                            }
                                            if (var47 == 3) {
                                                var48 = 21;
                                            }
                                            if (var47 == 4) {
                                                var48 = 22;
                                            }
                                            method4128(var46[var47], class92.method1001(16748608) + var45.field1883, var48, var44.field1243, var17, var18);
                                        } else if (var47 == 2) {
                                            method4128(class283.field3344, class92.method1001(16748608) + var45.field1883, 20, var44.field1243, var17, var18);
                                        }
                                    }
                                    method4128(class283.field3495, class92.method1001(16748608) + var45.field1883, 1004, var44.field1243, var17, var18);
                                } else if ((Statics.field450 & 0x1) == 1) {
                                    method4128(field647, field628 + " " + class92.field1216 + " " + class92.method1001(16748608) + var45.field1883, 17, var44.field1243, var17, var18);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("by.ih(Lfq;IIII)V")
    public static final void method1910(class161 arg0, int arg1, int arg2, int arg3) {
        if (field626 >= 400) {
            return;
        }
        if (arg0.field1735 != null) {
            arg0 = arg0.method2712();
        }
        if (arg0 == null || !arg0.field1738 || arg0.field1722 && field585 != arg1) {
            return;
        }
        String var4 = arg0.field1710;
        if (arg0.field1732 != 0) {
            int var6 = arg0.field1732;
            int var7 = Statics.field1485.field1049;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class92.method1001(16711680);
            } else if (var8 < -6) {
                var9 = class92.method1001(16723968);
            } else if (var8 < -3) {
                var9 = class92.method1001(16740352);
            } else if (var8 < 0) {
                var9 = class92.method1001(16756736);
            } else if (var8 > 9) {
                var9 = class92.method1001(65280);
            } else if (var8 > 6) {
                var9 = class92.method1001(4259584);
            } else if (var8 > 3) {
                var9 = class92.method1001(8453888);
            } else if (var8 > 0) {
                var9 = class92.method1001(12648192);
            } else {
                var9 = class92.method1001(16776960);
            }
            var4 = var4 + var9 + " " + class92.field1224 + class283.field3531 + arg0.field1732 + class92.field1218;
        }
        if (arg0.field1722 && field634) {
            method4128(class283.field3495, class92.method1001(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field602 == 1) {
            method4128(class283.field3494, field722 + " " + class92.field1216 + " " + class92.method1001(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field644) {
            int var10 = arg0.field1722 && field634 ? 2000 : 0;
            String[] var11 = arg0.field1725;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class283.field3496)) {
                        int var13 = 0;
                        if (var12 == 0) {
                            var13 = var10 + 9;
                        }
                        if (var12 == 1) {
                            var13 = var10 + 10;
                        }
                        if (var12 == 2) {
                            var13 = var10 + 11;
                        }
                        if (var12 == 3) {
                            var13 = var10 + 12;
                        }
                        if (var12 == 4) {
                            var13 = var10 + 13;
                        }
                        method4128(var11[var12], class92.method1001(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class283.field3496)) {
                        short var15 = 0;
                        if (field510 != class94.field1236) {
                            if (field510 == class94.field1234 || field510 == class94.field1235 && arg0.field1732 > Statics.field1485.field1049) {
                                var15 = 2000;
                            }
                            int var16 = 0;
                            if (var14 == 0) {
                                var16 = var15 + 9;
                            }
                            if (var14 == 1) {
                                var16 = var15 + 10;
                            }
                            if (var14 == 2) {
                                var16 = var15 + 11;
                            }
                            if (var14 == 3) {
                                var16 = var15 + 12;
                            }
                            if (var14 == 4) {
                                var16 = var15 + 13;
                            }
                            method4128(var11[var14], class92.method1001(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field1722 || !field634) {
                method4128(class283.field3495, class92.method1001(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field450 & 0x2) == 2) {
            method4128(field647, field628 + " " + class92.field1216 + " " + class92.method1001(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("by.if(Lco;IIII)V")
    public static final void method1915(class83 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1485 == arg0 || field626 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1055 == 0) {
            String var4 = arg0.field1060[0] + arg0.field1070 + arg0.field1060[1];
            int var5 = arg0.field1049;
            int var6 = Statics.field1485.field1049;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class92.method1001(16711680);
            } else if (var7 < -6) {
                var8 = class92.method1001(16723968);
            } else if (var7 < -3) {
                var8 = class92.method1001(16740352);
            } else if (var7 < 0) {
                var8 = class92.method1001(16756736);
            } else if (var7 > 9) {
                var8 = class92.method1001(65280);
            } else if (var7 > 6) {
                var8 = class92.method1001(4259584);
            } else if (var7 > 3) {
                var8 = class92.method1001(8453888);
            } else if (var7 > 0) {
                var8 = class92.method1001(12648192);
            } else {
                var8 = class92.method1001(16776960);
            }
            var9 = var4 + var8 + " " + class92.field1224 + class283.field3531 + arg0.field1049 + class92.field1218 + arg0.field1060[2];
        } else {
            var9 = arg0.field1060[0] + arg0.field1070 + arg0.field1060[1] + " " + class92.field1224 + class283.field3432 + arg0.field1055 + class92.field1218 + arg0.field1060[2];
        }
        if (field602 == 1) {
            method4128(class283.field3494, field722 + " " + class92.field1216 + " " + class92.method1001(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field644) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field607[var10] != null) {
                    short var11 = 0;
                    if (field607[var10].equalsIgnoreCase(class283.field3496)) {
                        if (field509 == class94.field1236) {
                            continue;
                        }
                        if (field509 == class94.field1234 || field509 == class94.field1235 && arg0.field1049 > Statics.field1485.field1049) {
                            var11 = 2000;
                        }
                        if (Statics.field1485.field1073 == 0 || arg0.field1073 == 0) {
                            if (field509 == class94.field1237 && arg0.method1958()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field1485.field1073 == arg0.field1073) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field614[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field612[var10] + var11;
                    method4128(field607[var10], class92.method1001(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field450 & 0x8) == 8) {
            method4128(field647, field628 + " " + class92.field1216 + " " + class92.method1001(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field626; var14++) {
            if (field629[var14] == 23) {
                field652[var14] = class92.method1001(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("al.ib(IIIIIIIIB)V")
    public static final void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class262.method5238(arg0)) {
            Statics.field281 = null;
            method6151(Statics.field1535[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field281 != null) {
                method6151(Statics.field281, -1412584499, arg1, arg2, arg3, arg4, Statics.field2465, Statics.field178, arg7);
                Statics.field281 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field698[var8] = true;
            }
        } else {
            field698[arg7] = true;
        }
    }

    @ObfuscatedName("ou.is([Ljd;IIIIIIIII)V")
    public static final void method6151(class262[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class409.method6519(arg2, arg3, arg4, arg5);
        class211.method3700();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class262 var10 = arg0[var9];
            if (var10 != null && (var10.field3065 == arg1 || arg1 == -1412584499 && field662 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field701[field700] = var10.field3167 + arg6;
                    field702[field700] = var10.field3080 + arg7;
                    field703[field700] = var10.field3098;
                    field721[field700] = var10.field3062;
                    var11 = ++field700 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3093 = var11;
                var10.field3188 = field744;
                if (!var10.field3045 || !method738(var10)) {
                    if (var10.field3050 > 0) {
                        method1009(var10);
                    }
                    int var12 = var10.field3167 + arg6;
                    int var13 = var10.field3080 + arg7;
                    int var14 = var10.field3155;
                    if (field662 == var10) {
                        if (arg1 != -1412584499 && !var10.field3130) {
                            Statics.field281 = arg0;
                            Statics.field2465 = arg6;
                            Statics.field178 = arg7;
                            continue;
                        }
                        if (field622 && field667) {
                            int var15 = class33.field221;
                            int var16 = class33.field230;
                            int var17 = var15 - field664;
                            int var18 = var16 - field693;
                            if (var17 < field624) {
                                var17 = field624;
                            }
                            if (var10.field3098 + var17 > field624 + field663.field3098) {
                                var17 = field624 + field663.field3098 - var10.field3098;
                            }
                            if (var18 < field659) {
                                var18 = field659;
                            }
                            if (var10.field3062 + var18 > field659 + field663.field3062) {
                                var18 = field659 + field663.field3062 - var10.field3062;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3130) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3159 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3159 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3098 + var12;
                        int var26 = var10.field3062 + var13;
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
                        int var29 = var10.field3098 + var12;
                        int var30 = var10.field3062 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3045 || var19 < var21 && var20 < var22) {
                        if (var10.field3050 != 0) {
                            if (var10.field3050 == 1336) {
                                if (field499) {
                                    var13 += 15;
                                    Statics.field1480.method5136("Fps:" + field193, var10.field3098 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field572) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1480.method5136("Mem:" + var32 + "k", var10.field3098 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3050 == 1337) {
                                field638 = var12;
                                field639 = var13;
                                method2272(var12, var13, var10.field3098, var10.field3062);
                                field698[var10.field3093] = true;
                                class409.method6519(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3050 == 1338) {
                                method3976(var10, var12, var13, var11);
                                class409.method6519(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3050 == 1339) {
                                method6128(var10, var12, var13, var11);
                                class409.method6519(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3050 == 1400) {
                                Statics.field858.method5889(var12, var13, var10.field3098, var10.field3062, field744);
                            }
                            if (var10.field3050 == 1401) {
                                Statics.field858.method5817(var12, var13, var10.field3098, var10.field3062);
                            }
                            if (var10.field3050 == 1402) {
                                Statics.field877.method2041(var12, field744);
                            }
                        }
                        if (var10.field3159 == 0) {
                            if (!var10.field3045 && method738(var10) && Statics.field3786 != var10) {
                                continue;
                            }
                            if (!var10.field3045) {
                                if (var10.field3068 > var10.field3096 - var10.field3062) {
                                    var10.field3068 = var10.field3096 - var10.field3062;
                                }
                                if (var10.field3068 < 0) {
                                    var10.field3068 = 0;
                                }
                            }
                            method6151(arg0, var10.field3046, var19, var20, var21, var22, var12 - var10.field3067, var13 - var10.field3068, var11);
                            if (var10.field3180 != null) {
                                method6151(var10.field3180, var10.field3046, var19, var20, var21, var22, var12 - var10.field3067, var13 - var10.field3068, var11);
                            }
                            class80 var34 = (class80) field650.method6016((long) var10.field3046);
                            if (var34 != null) {
                                method402(var34.field1023, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class409.method6519(arg2, arg3, arg4, arg5);
                            class211.method3700();
                        }
                        if (field707 || field688[var11] || field705 > 1) {
                            if (var10.field3159 == 0 && !var10.field3045 && var10.field3096 > var10.field3062) {
                                method3462(var10.field3098 + var12, var13, var10.field3068, var10.field3062, var10.field3096);
                            }
                            if (var10.field3159 != 1) {
                                if (var10.field3159 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3125; var36++) {
                                        for (int var37 = 0; var37 < var10.field3057; var37++) {
                                            int var38 = (var10.field3113 + 32) * var37 + var12;
                                            int var39 = (var10.field3142 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3187[var35];
                                                var39 += var10.field3186[var35];
                                            }
                                            if (var10.field3174[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3174[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field390 == var10 && field725 == var35) {
                                                    class413 var43;
                                                    if (field602 == 1 && Statics.field4064 == var35 && Statics.field990 == var10.field3046) {
                                                        var43 = Statics.method2654(var42, var10.field3047[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = Statics.method2654(var42, var10.field3047[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method2027(var10);
                                                    } else if (Statics.field390 == var10 && field725 == var35) {
                                                        int var44 = class33.field221 - field598;
                                                        int var45 = class33.field230 - field759;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field685 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method6633(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class262 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class409.field4344 && var46.field3068 > 0) {
                                                                int var47 = field765 * (class409.field4344 - var39 - var45) / 3;
                                                                if (var47 > field765 * 10) {
                                                                    var47 = field765 * 10;
                                                                }
                                                                if (var47 > var46.field3068) {
                                                                    var47 = var46.field3068;
                                                                }
                                                                var46.field3068 -= var47;
                                                                field759 += var47;
                                                                method2027(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class409.field4347 && var46.field3068 < var46.field3096 - var46.field3062) {
                                                                int var48 = field765 * (var39 + var45 + 32 - class409.field4347) / 3;
                                                                if (var48 > field765 * 10) {
                                                                    var48 = field765 * 10;
                                                                }
                                                                if (var48 > var46.field3096 - var46.field3062 - var46.field3068) {
                                                                    var48 = var46.field3096 - var46.field3062 - var46.field3068;
                                                                }
                                                                var46.field3068 += var48;
                                                                field759 -= var48;
                                                                method2027(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field3935 == var10 && field594 == var35) {
                                                        var43.method6633(var38, var39, 128);
                                                    } else {
                                                        var43.method6615(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3114 != null && var35 < 20) {
                                                class413 var49 = var10.method4524(var35);
                                                if (var49 != null) {
                                                    var49.method6615(var38, var39);
                                                } else if (class262.field3154) {
                                                    method2027(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3159 == 3) {
                                    int var50;
                                    if (method6447(var10)) {
                                        var50 = var10.field3072;
                                        if (Statics.field3786 == var10 && var10.field3190 != 0) {
                                            var50 = var10.field3190;
                                        }
                                    } else {
                                        var50 = var10.field3071;
                                        if (Statics.field3786 == var10 && var10.field3073 != 0) {
                                            var50 = var10.field3073;
                                        }
                                    }
                                    if (var10.field3075) {
                                        switch(var10.field3076.field4354) {
                                            case 1:
                                                class409.method6530(var12, var13, var10.field3098, var10.field3062, var10.field3071, var10.field3072);
                                                break;
                                            case 2:
                                                class409.method6529(var12, var13, var10.field3098, var10.field3062, var10.field3071, var10.field3072, 255 - (var10.field3155 & 0xFF), 255 - (var10.field3054 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class409.method6556(var12, var13, var10.field3098, var10.field3062, var50);
                                                } else {
                                                    class409.method6563(var12, var13, var10.field3098, var10.field3062, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class409.method6531(var12, var13, var10.field3098, var10.field3062, var50);
                                    } else {
                                        class409.method6532(var12, var13, var10.field3098, var10.field3062, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3159 == 4) {
                                    class315 var51 = var10.method4526();
                                    if (var51 != null) {
                                        String var52 = var10.field3145;
                                        int var53;
                                        if (method6447(var10)) {
                                            var53 = var10.field3072;
                                            if (Statics.field3786 == var10 && var10.field3190 != 0) {
                                                var53 = var10.field3190;
                                            }
                                            if (var10.field3108.length() > 0) {
                                                var52 = var10.field3108;
                                            }
                                        } else {
                                            var53 = var10.field3071;
                                            if (Statics.field3786 == var10 && var10.field3073 != 0) {
                                                var53 = var10.field3073;
                                            }
                                        }
                                        if (var10.field3045 && var10.field3176 != -1) {
                                            class170 var54 = class170.method1776(var10.field3176);
                                            var52 = var54.field1883;
                                            if (var52 == null) {
                                                var52 = class283.field3339;
                                            }
                                            if ((var54.field1926 == 1 || var10.field3177 != 1) && var10.field3177 != -1) {
                                                var52 = class92.method1001(16748608) + var52 + class92.field1222 + " " + 'x' + method14(var10.field3177);
                                            }
                                        }
                                        if (field655 == var10) {
                                            var52 = class283.field3502;
                                            var53 = var10.field3071;
                                        }
                                        if (!var10.field3045) {
                                            var52 = method3463(var52, var10);
                                        }
                                        var51.method5138(var52, var12, var13, var10.field3098, var10.field3062, var53, var10.field3036 ? 0 : -1, var10.field3128, var10.field3111, var10.field3084);
                                    } else if (class262.field3154) {
                                        method2027(var10);
                                    }
                                } else if (var10.field3159 == 5) {
                                    if (var10.field3045) {
                                        class413 var56;
                                        if (var10.field3176 == -1) {
                                            var56 = var10.method4525(false);
                                        } else {
                                            var56 = Statics.method2654(var10.field3176, var10.field3177, var10.field3164, var10.field3086, var10.field3105, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4372;
                                            int var58 = var56.field4373;
                                            if (var10.field3035) {
                                                class409.method6520(var12, var13, var10.field3098 + var12, var10.field3062 + var13);
                                                int var59 = (var10.field3098 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3062 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3083 != 0) {
                                                            var56.method6646(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3083, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method6615(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method6633(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class409.method6519(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3098 * 4096 / var57;
                                                if (var10.field3083 != 0) {
                                                    var56.method6646(var10.field3098 / 2 + var12, var10.field3062 / 2 + var13, var10.field3083, var63);
                                                } else if (var14 != 0) {
                                                    var56.method6635(var12, var13, var10.field3098, var10.field3062, 256 - (var14 & 0xFF));
                                                } else if (var10.field3098 == var57 && var10.field3062 == var58) {
                                                    var56.method6615(var12, var13);
                                                } else {
                                                    var56.method6697(var12, var13, var10.field3098, var10.field3062);
                                                }
                                            }
                                        } else if (class262.field3154) {
                                            method2027(var10);
                                        }
                                    } else {
                                        class413 var55 = var10.method4525(method6447(var10));
                                        if (var55 != null) {
                                            var55.method6615(var12, var13);
                                        } else if (class262.field3154) {
                                            method2027(var10);
                                        }
                                    }
                                } else if (var10.field3159 == 6) {
                                    boolean var64 = method6447(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3094;
                                    } else {
                                        var65 = var10.field3121;
                                    }
                                    class220 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3176 != -1) {
                                        class170 var68 = class170.method1776(var10.field3176);
                                        if (var68 != null) {
                                            class170 var69 = var68.method2942(var10.field3177);
                                            var66 = var69.method2941(1);
                                            if (var66 == null) {
                                                method2027(var10);
                                            } else {
                                                var66.method4018();
                                                var67 = var66.field2429 / 2;
                                            }
                                        }
                                    } else if (var10.field3064 == 5) {
                                        if (var10.field3032 == 0) {
                                            var66 = field529.method4483((class172) null, -1, (class172) null, -1);
                                        } else {
                                            var66 = Statics.field1485.method1766();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4543((class172) null, -1, var64, Statics.field1485.field1064);
                                        if (var66 == null && class262.field3154) {
                                            method2027(var10);
                                        }
                                    } else {
                                        class172 var70 = class172.method269(var65);
                                        var66 = var10.method4543(var70, var10.field3034, var64, Statics.field1485.field1064);
                                        if (var66 == null && class262.field3154) {
                                            method2027(var10);
                                        }
                                    }
                                    class211.method3703(var10.field3098 / 2 + var12, var10.field3062 / 2 + var13);
                                    int var71 = var10.field3100 * class211.field2346[var10.field3097] >> 16;
                                    int var72 = var10.field3100 * class211.field2357[var10.field3097] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3045) {
                                            var66.method4018();
                                            if (var10.field3103) {
                                                var66.method4031(0, var10.field3074, var10.field3099, var10.field3097, var10.field3095, var10.field3044 + var67 + var71, var10.field3044 + var72, var10.field3100);
                                            } else {
                                                var66.method4077(0, var10.field3074, var10.field3099, var10.field3097, var10.field3095, var10.field3044 + var67 + var71, var10.field3044 + var72);
                                            }
                                        } else {
                                            var66.method4077(0, var10.field3074, 0, var10.field3097, 0, var71, var72);
                                        }
                                    }
                                    class211.method3774();
                                } else {
                                    if (var10.field3159 == 7) {
                                        class315 var73 = var10.method4526();
                                        if (var73 == null) {
                                            if (class262.field3154) {
                                                method2027(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field3125; var75++) {
                                            for (int var76 = 0; var76 < var10.field3057; var76++) {
                                                if (var10.field3174[var74] > 0) {
                                                    class170 var77 = class170.method1776(var10.field3174[var74] - 1);
                                                    String var78;
                                                    if (var77.field1926 != 1 && var10.field3047[var74] == 1) {
                                                        var78 = class92.method1001(16748608) + var77.field1883 + class92.field1222;
                                                    } else {
                                                        var78 = class92.method1001(16748608) + var77.field1883 + class92.field1222 + " " + 'x' + method14(var10.field3047[var74]);
                                                    }
                                                    int var79 = (var10.field3113 + 115) * var76 + var12;
                                                    int var80 = (var10.field3142 + 12) * var75 + var13;
                                                    if (var10.field3128 == 0) {
                                                        var73.method5174(var78, var79, var80, var10.field3071, var10.field3036 ? 0 : -1);
                                                    } else if (var10.field3128 == 1) {
                                                        var73.method5137(var78, var10.field3098 / 2 + var79, var80, var10.field3071, var10.field3036 ? 0 : -1);
                                                    } else {
                                                        var73.method5136(var78, var10.field3098 + var79 - 1, var80, var10.field3071, var10.field3036 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field3159 == 8 && Statics.field4228 == var10 && field641 == field584) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class315 var83 = Statics.field1480;
                                        String var84 = var10.field3145;
                                        String var85 = method3463(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class92.field1215);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5128(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3837 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3098 + var12 - 5 - var81;
                                        int var90 = var10.field3062 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class409.method6556(var89, var90, var81, var82, 16777120);
                                        class409.method6531(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3145;
                                        int var92 = var83.field3837 + var90 + 2;
                                        String var93 = method3463(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class92.field1215);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5174(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3837 + 1;
                                        }
                                    }
                                    if (var10.field3159 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field3118) {
                                            var96 = var12;
                                            var97 = var10.field3062 + var13;
                                            var98 = var10.field3098 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3098 + var12;
                                            var99 = var10.field3062 + var13;
                                        }
                                        if (var10.field3079 == 1) {
                                            class409.method6526(var96, var97, var98, var99, var10.field3071);
                                        } else {
                                            method332(var96, var97, var98, var99, var10.field3071, var10.field3079);
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

    @ObfuscatedName("p.iw(IIIIIII)V")
    public static final void method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class409.field4348;
        int var18 = arg1 - class409.field4344;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class211.method3741(var19, var20, var21);
        class211.method3715(var23, var24, var25, var19, var20, var21, arg4);
        class211.method3741(var19, var21, var22);
        class211.method3715(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("gn.in(Ljava/lang/String;Ljd;B)Ljava/lang/String;")
    public static String method3463(String arg0, class262 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method85(arg1, var2 - 1);
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

    @ObfuscatedName("c.iz(II)Ljava/lang/String;")
    public static final String method14(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class92.field1221 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class92.method1001(65408) + var1.substring(0, var1.length() - 8) + class283.field3505 + " " + class92.field1224 + var1 + class92.field1218 + class92.field1222;
        } else if (var1.length() > 6) {
            return " " + class92.method1001(16777215) + var1.substring(0, var1.length() - 4) + class283.field3507 + " " + class92.field1224 + var1 + class92.field1218 + class92.field1222;
        } else {
            return " " + class92.method1001(16776960) + var1 + class92.field1222;
        }
    }

    @ObfuscatedName("client.iv(ZB)V")
    public final void method1080(boolean arg0) {
        int var2 = field649;
        int var3 = Statics.field1611;
        int var4 = Statics.field200;
        if (class262.method5238(var2)) {
            method4461(Statics.field1535[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ic(Ljd;I)V")
    public void method1081(class262 arg0) {
        class262 var2 = arg0.field3065 == -1 ? null : class262.method2073(arg0.field3065);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1611;
            var4 = Statics.field200;
        } else {
            var3 = var2.field3098;
            var4 = var2.field3062;
        }
        method2248(arg0, var3, var4, false);
        method2456(arg0, var3, var4);
    }

    @ObfuscatedName("fc.id([Ljd;Ljd;ZB)V")
    public static void method2745(class262[] arg0, class262 arg1, boolean arg2) {
        int var3 = arg1.field3069 == 0 ? arg1.field3098 : arg1.field3069;
        int var4 = arg1.field3096 == 0 ? arg1.field3062 : arg1.field3096;
        method4461(arg0, arg1.field3046, var3, var4, arg2);
        if (arg1.field3180 != null) {
            method4461(arg1.field3180, arg1.field3046, var3, var4, arg2);
        }
        class80 var5 = (class80) field650.method6016((long) arg1.field3046);
        if (var5 != null) {
            int var6 = var5.field1023;
            if (class262.method5238(var6)) {
                method4461(Statics.field1535[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3050 == 1337) {
        }
    }

    @ObfuscatedName("iy.iq([Ljd;IIIZB)V")
    public static void method4461(class262[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class262 var6 = arg0[var5];
            if (var6 != null && var6.field3065 == arg1) {
                method2248(var6, arg2, arg3, arg4);
                method2456(var6, arg2, arg3);
                if (var6.field3067 > var6.field3069 - var6.field3098) {
                    var6.field3067 = var6.field3069 - var6.field3098;
                }
                if (var6.field3067 < 0) {
                    var6.field3067 = 0;
                }
                if (var6.field3068 > var6.field3096 - var6.field3062) {
                    var6.field3068 = var6.field3096 - var6.field3062;
                }
                if (var6.field3068 < 0) {
                    var6.field3068 = 0;
                }
                if (var6.field3159 == 0) {
                    method2745(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cj.ii(Ljd;IIZI)V")
    public static void method2248(class262 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3098;
        int var5 = arg0.field3062;
        if (arg0.field3053 == 0) {
            arg0.field3098 = arg0.field3057;
        } else if (arg0.field3053 == 1) {
            arg0.field3098 = arg1 - arg0.field3057;
        } else if (arg0.field3053 == 2) {
            arg0.field3098 = arg0.field3057 * arg1 >> 14;
        }
        if (arg0.field3115 == 0) {
            arg0.field3062 = arg0.field3125;
        } else if (arg0.field3115 == 1) {
            arg0.field3062 = arg2 - arg0.field3125;
        } else if (arg0.field3115 == 2) {
            arg0.field3062 = arg0.field3125 * arg2 >> 14;
        }
        if (arg0.field3053 == 4) {
            arg0.field3098 = arg0.field3063 * arg0.field3062 / arg0.field3117;
        }
        if (arg0.field3115 == 4) {
            arg0.field3062 = arg0.field3117 * arg0.field3098 / arg0.field3063;
        }
        if (arg0.field3050 == 1337) {
            field668 = arg0;
        }
        if (arg3 && arg0.field3165 != null && (arg0.field3098 != var4 || arg0.field3062 != var5)) {
            class81 var6 = new class81();
            var6.field1028 = arg0;
            var6.field1031 = arg0.field3165;
            field692.method4986(var6);
        }
    }

    @ObfuscatedName("dw.ia(Ljd;III)V")
    public static void method2456(class262 arg0, int arg1, int arg2) {
        if (arg0.field3051 == 0) {
            arg0.field3167 = arg0.field3055;
        } else if (arg0.field3051 == 1) {
            arg0.field3167 = (arg1 - arg0.field3098) / 2 + arg0.field3055;
        } else if (arg0.field3051 == 2) {
            arg0.field3167 = arg1 - arg0.field3098 - arg0.field3055;
        } else if (arg0.field3051 == 3) {
            arg0.field3167 = arg0.field3055 * arg1 >> 14;
        } else if (arg0.field3051 == 4) {
            arg0.field3167 = (arg0.field3055 * arg1 >> 14) + (arg1 - arg0.field3098) / 2;
        } else {
            arg0.field3167 = arg1 - arg0.field3098 - (arg0.field3055 * arg1 >> 14);
        }
        if (arg0.field3059 == 0) {
            arg0.field3080 = arg0.field3056;
        } else if (arg0.field3059 == 1) {
            arg0.field3080 = (arg2 - arg0.field3062) / 2 + arg0.field3056;
        } else if (arg0.field3059 == 2) {
            arg0.field3080 = arg2 - arg0.field3062 - arg0.field3056;
        } else if (arg0.field3059 == 3) {
            arg0.field3080 = arg0.field3056 * arg2 >> 14;
        } else if (arg0.field3059 == 4) {
            arg0.field3080 = (arg0.field3056 * arg2 >> 14) + (arg2 - arg0.field3062) / 2;
        } else {
            arg0.field3080 = arg2 - arg0.field3062 - (arg0.field3056 * arg2 >> 14);
        }
    }

    @ObfuscatedName("es.iy(Ljd;IIIIIIB)V")
    public static final void method2571(class262 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field556) {
            field619 = 32;
        } else {
            field619 = 0;
        }
        field556 = false;
        if (class33.field239 == 1 || !Statics.field949 && class33.field239 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3068 -= 4;
                method2027(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3068 += 4;
                method2027(arg0);
            } else if (arg5 >= arg1 - field619 && arg5 < field619 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3068 = (arg4 - arg3) * var8 / var9;
                method2027(arg0);
                field556 = true;
            }
        }
        if (field691 == 0) {
            return;
        }
        int var10 = arg0.field3098;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3068 += field691 * 45;
            method2027(arg0);
        }
    }

    @ObfuscatedName("gs.ik(IIIIIB)V")
    public static final void method3462(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field994[0].method6601(arg0, arg1);
        Statics.field994[1].method6601(arg0, arg1 + arg3 - 16);
        class409.method6556(arg0, arg1 + 16, 16, arg3 - 32, field552);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class409.method6556(arg0, arg1 + 16 + var6, 16, var5, field553);
        class409.method6535(arg0, arg1 + 16 + var6, var5, field601);
        class409.method6535(arg0 + 1, arg1 + 16 + var6, var5, field601);
        class409.method6578(arg0, arg1 + 16 + var6, 16, field601);
        class409.method6578(arg0, arg1 + 17 + var6, 16, field601);
        class409.method6535(arg0 + 15, arg1 + 16 + var6, var5, field604);
        class409.method6535(arg0 + 14, arg1 + 17 + var6, var5 - 1, field604);
        class409.method6578(arg0, arg1 + 15 + var6 + var5, 16, field604);
        class409.method6578(arg0 + 1, arg1 + 14 + var6 + var5, 15, field604);
    }

    @ObfuscatedName("ow.iu(Ljd;I)Z")
    public static final boolean method6447(class262 arg0) {
        if (arg0.field3169 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3169.length; var1++) {
            int var2 = method85(arg0, var1);
            int var3 = arg0.field3170[var1];
            if (arg0.field3169[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3169[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3169[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("e.js(Ljd;IB)I")
    public static final int method85(class262 arg0, int arg1) {
        if (arg0.field3168 == null || arg1 >= arg0.field3168.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3168[arg1];
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
                    var7 = field506[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field623[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class262 var11 = class262.method2073(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class170.method1776(var12).field1896 || field682)) {
                        for (int var13 = 0; var13 < var11.field3174.length; var13++) {
                            if (var12 + 1 == var11.field3174[var13]) {
                                var7 += var11.field3047[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class257.field3001[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class272.field3254[field506[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class257.field3001[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1485.field1049;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class272.field3258[var14]) {
                            var7 += field506[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class262 var17 = class262.method2073(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class170.method1776(var18).field1896 || field682)) {
                        for (int var19 = 0; var19 < var17.field3174.length; var19++) {
                            if (var18 + 1 == var17.field3174[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field656;
                }
                if (var6 == 12) {
                    var7 = field587;
                }
                if (var6 == 13) {
                    int var20 = class257.field3001[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class257.method4239(var22);
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
                    var7 = (Statics.field1485.field1119 >> 7) + Statics.field1942;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1485.field1096 >> 7) + Statics.field3866;
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

    @ObfuscatedName("mv.jd(Ljd;Lfy;IIZI)V")
    public static final void method5576(class262 arg0, class170 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field1890;
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
            var7 = class283.field3333;
        }
        if (var6 != -1 && var7 != null) {
            method4810(var7, class92.method1001(16748608) + arg1.field1883, var6, arg1.field1881, arg2, arg0.field3046, arg4);
        }
    }

    @ObfuscatedName("q.jc(ZI)V")
    public static void method217(boolean arg0) {
        field754 = arg0;
    }

    @ObfuscatedName("eq.jj(B)Z")
    public static boolean method2496() {
        return field754;
    }

    @ObfuscatedName("j.jp(IIIIIIII)V")
    public static final void method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class262.method5238(arg0)) {
            method5428(Statics.field1535[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("lx.ja([Ljd;IIIIIIII)V")
    public static final void method5428(class262[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class262 var9 = arg0[var8];
            if (var9 != null && var9.field3065 == arg1 && (!var9.field3045 || var9.field3159 == 0 || var9.field3132 || method967(var9) != 0 || field663 == var9 || var9.field3050 == 1338)) {
                if (var9.field3045) {
                    if (method738(var9)) {
                        continue;
                    }
                } else if (var9.field3159 == 0 && Statics.field3786 != var9 && method738(var9)) {
                    continue;
                }
                int var10 = var9.field3167 + arg6;
                int var11 = var9.field3080 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3159 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field3159 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field3098 + var10;
                    int var19 = var9.field3062 + var11;
                    if (var18 < var10) {
                        var16 = var18;
                        var18 = var10;
                    }
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    var18++;
                    var19++;
                    var12 = var16 > arg2 ? var16 : arg2;
                    var13 = var17 > arg3 ? var17 : arg3;
                    var14 = var18 < arg4 ? var18 : arg4;
                    var15 = var19 < arg5 ? var19 : arg5;
                } else {
                    int var22 = var9.field3098 + var10;
                    int var23 = var9.field3062 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field662 == var9) {
                    field670 = true;
                    field740 = var10;
                    field672 = var11;
                }
                boolean var24 = false;
                if (var9.field3120) {
                    switch(field651) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3046 >>> 16 == field544) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field544 == var9.field3046) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field3045 || var12 < var14 && var13 < var15) {
                    if (var9.field3045) {
                        if (var9.field3178) {
                            if (class33.field221 >= var12 && class33.field230 >= var13 && class33.field221 < var14 && class33.field230 < var15) {
                                for (class81 var25 = (class81) field692.method4962(); var25 != null; var25 = (class81) field692.method4985()) {
                                    if (var25.field1027) {
                                        var25.method5732();
                                        var25.field1028.field3181 = false;
                                    }
                                }
                                if (Statics.field1440 == 0) {
                                    field662 = null;
                                    field663 = null;
                                }
                                if (!field625) {
                                    Statics.method371();
                                }
                            }
                        } else if (var9.field3191 && class33.field221 >= var12 && class33.field230 >= var13 && class33.field221 < var14 && class33.field230 < var15) {
                            for (class81 var26 = (class81) field692.method4962(); var26 != null; var26 = (class81) field692.method4985()) {
                                if (var26.field1027 && var26.field1028.field3052 == var26.field1031) {
                                    var26.method5732();
                                }
                            }
                        }
                    }
                    int var27 = class33.field221;
                    int var28 = class33.field230;
                    if (class33.field236 != 0) {
                        var27 = class33.field241;
                        var28 = class33.field238;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field3050 == 1337) {
                        if (!field492 && !field625 && var29) {
                            method401(var27, var28, var12, var13);
                        }
                    } else if (var9.field3050 == 1338) {
                        method2333(var9, var10, var11);
                    } else {
                        if (var9.field3050 == 1400) {
                            Statics.field858.method5788(class33.field221, class33.field230, var29, var10, var11, var9.field3098, var9.field3062);
                        }
                        if (!field625 && var29) {
                            if (var9.field3050 == 1400) {
                                Statics.field858.method5840(var10, var11, var9.field3098, var9.field3062, var27, var28);
                            } else {
                                Statics.method2568(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field3101.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field3101[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field3101[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field3189 != null) {
                                            var34 = class24.field123[var9.field3101[var30][var33]];
                                        }
                                        if (method2949(var9.field3101[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field3189 != null && var9.field3189[var30] > field744) {
                                                break;
                                            }
                                            byte var35 = var9.field3122[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class24.field123[86] && !class24.field123[82] && !class24.field123[81]) && ((var35 & 0x2) == 0 || class24.field123[86]) && ((var35 & 0x1) == 0 || class24.field123[82]) && ((var35 & 0x4) == 0 || class24.field123[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method603(var30 + 1, var9.field3046, var9.field3077, var9.field3176, "");
                                    } else if (var30 == 10) {
                                        method1008();
                                        method4625(var9.field3046, var9.field3077, class263.method2494(method967(var9)), var9.field3176);
                                        field647 = method2539(var9);
                                        if (field647 == null) {
                                            field647 = class283.field3339;
                                        }
                                        field628 = var9.field3116 + class92.method1001(16777215);
                                    }
                                    int var36 = var9.field3136[var30];
                                    if (var9.field3189 == null) {
                                        var9.field3189 = new int[var9.field3101.length];
                                    }
                                    if (var9.field3124 == null) {
                                        var9.field3124 = new int[var9.field3101.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field3189[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field3189[var30] == 0) {
                                        var9.field3189[var30] = field744 + var36 + var9.field3124[var30];
                                    } else {
                                        var9.field3189[var30] = field744 + var36;
                                    }
                                }
                                if (!var31 && var9.field3189 != null) {
                                    var9.field3189[var30] = 0;
                                }
                            }
                        }
                        if (var9.field3045) {
                            boolean var37;
                            if (class33.field221 >= var12 && class33.field230 >= var13 && class33.field221 < var14 && class33.field230 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class33.field239 == 1 || !Statics.field949 && class33.field239 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class33.field236 == 1 || !Statics.field949 && class33.field236 == 4) && class33.field241 >= var12 && class33.field238 >= var13 && class33.field241 < var14 && class33.field238 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method370(var9, class33.field241 - var10, class33.field238 - var11);
                            }
                            if (var9.field3050 == 1400) {
                                Statics.field858.method5801(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field662 != null && field662 != var9 && var37 && class263.method397(method967(var9))) {
                                field666 = var9;
                            }
                            if (field663 == var9) {
                                field667 = true;
                                field624 = var10;
                                field659 = var11;
                            }
                            if (var9.field3132) {
                                if (var37 && field691 != 0 && var9.field3052 != null) {
                                    class81 var40 = new class81();
                                    var40.field1027 = true;
                                    var40.field1028 = var9;
                                    var40.field1030 = field691;
                                    var40.field1031 = var9.field3052;
                                    field692.method4986(var40);
                                }
                                if (field662 != null || Statics.field390 != null || field625) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field3182 && var39) {
                                    var9.field3182 = true;
                                    if (var9.field3134 != null) {
                                        class81 var41 = new class81();
                                        var41.field1027 = true;
                                        var41.field1028 = var9;
                                        var41.field1035 = class33.field241 - var10;
                                        var41.field1030 = class33.field238 - var11;
                                        var41.field1031 = var9.field3134;
                                        field692.method4986(var41);
                                    }
                                }
                                if (var9.field3182 && var38 && var9.field3135 != null) {
                                    class81 var42 = new class81();
                                    var42.field1027 = true;
                                    var42.field1028 = var9;
                                    var42.field1035 = class33.field221 - var10;
                                    var42.field1030 = class33.field230 - var11;
                                    var42.field1031 = var9.field3135;
                                    field692.method4986(var42);
                                }
                                if (var9.field3182 && !var38) {
                                    var9.field3182 = false;
                                    if (var9.field3139 != null) {
                                        class81 var43 = new class81();
                                        var43.field1027 = true;
                                        var43.field1028 = var9;
                                        var43.field1035 = class33.field221 - var10;
                                        var43.field1030 = class33.field230 - var11;
                                        var43.field1031 = var9.field3139;
                                        field694.method4986(var43);
                                    }
                                }
                                if (var38 && var9.field3137 != null) {
                                    class81 var44 = new class81();
                                    var44.field1027 = true;
                                    var44.field1028 = var9;
                                    var44.field1035 = class33.field221 - var10;
                                    var44.field1030 = class33.field230 - var11;
                                    var44.field1031 = var9.field3137;
                                    field692.method4986(var44);
                                }
                                if (!var9.field3181 && var37) {
                                    var9.field3181 = true;
                                    if (var9.field3138 != null) {
                                        class81 var45 = new class81();
                                        var45.field1027 = true;
                                        var45.field1028 = var9;
                                        var45.field1035 = class33.field221 - var10;
                                        var45.field1030 = class33.field230 - var11;
                                        var45.field1031 = var9.field3138;
                                        field692.method4986(var45);
                                    }
                                }
                                if (var9.field3181 && var37 && var9.field3153 != null) {
                                    class81 var46 = new class81();
                                    var46.field1027 = true;
                                    var46.field1028 = var9;
                                    var46.field1035 = class33.field221 - var10;
                                    var46.field1030 = class33.field230 - var11;
                                    var46.field1031 = var9.field3153;
                                    field692.method4986(var46);
                                }
                                if (var9.field3181 && !var37) {
                                    var9.field3181 = false;
                                    if (var9.field3085 != null) {
                                        class81 var47 = new class81();
                                        var47.field1027 = true;
                                        var47.field1028 = var9;
                                        var47.field1035 = class33.field221 - var10;
                                        var47.field1030 = class33.field230 - var11;
                                        var47.field1031 = var9.field3085;
                                        field694.method4986(var47);
                                    }
                                }
                                if (var9.field3151 != null) {
                                    class81 var48 = new class81();
                                    var48.field1028 = var9;
                                    var48.field1031 = var9.field3151;
                                    field746.method4986(var48);
                                }
                                if (var9.field3042 != null && field577 > var9.field3184) {
                                    if (var9.field3146 == null || field577 - var9.field3184 > 32) {
                                        class81 var53 = new class81();
                                        var53.field1028 = var9;
                                        var53.field1031 = var9.field3042;
                                        field692.method4986(var53);
                                    } else {
                                        label634: for (int var49 = var9.field3184; var49 < field577; var49++) {
                                            int var50 = field675[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field3146.length; var51++) {
                                                if (var9.field3146[var51] == var50) {
                                                    class81 var52 = new class81();
                                                    var52.field1028 = var9;
                                                    var52.field1031 = var9.field3042;
                                                    field692.method4986(var52);
                                                    break label634;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3184 = field577;
                                }
                                if (var9.field3147 != null && field678 > var9.field3185) {
                                    if (var9.field3148 == null || field678 - var9.field3185 > 32) {
                                        class81 var58 = new class81();
                                        var58.field1028 = var9;
                                        var58.field1031 = var9.field3147;
                                        field692.method4986(var58);
                                    } else {
                                        label610: for (int var54 = var9.field3185; var54 < field678; var54++) {
                                            int var55 = field677[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field3148.length; var56++) {
                                                if (var9.field3148[var56] == var55) {
                                                    class81 var57 = new class81();
                                                    var57.field1028 = var9;
                                                    var57.field1031 = var9.field3147;
                                                    field692.method4986(var57);
                                                    break label610;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3185 = field678;
                                }
                                if (var9.field3149 != null && field680 > var9.field3123) {
                                    if (var9.field3150 == null || field680 - var9.field3123 > 32) {
                                        class81 var63 = new class81();
                                        var63.field1028 = var9;
                                        var63.field1031 = var9.field3149;
                                        field692.method4986(var63);
                                    } else {
                                        label586: for (int var59 = var9.field3123; var59 < field680; var59++) {
                                            int var60 = field679[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field3150.length; var61++) {
                                                if (var9.field3150[var61] == var60) {
                                                    class81 var62 = new class81();
                                                    var62.field1028 = var9;
                                                    var62.field1031 = var9.field3149;
                                                    field692.method4986(var62);
                                                    break label586;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3123 = field680;
                                }
                                if (field683 > var9.field3183 && var9.field3109 != null) {
                                    class81 var64 = new class81();
                                    var64.field1028 = var9;
                                    var64.field1031 = var9.field3109;
                                    field692.method4986(var64);
                                }
                                if (field684 > var9.field3183 && var9.field3158 != null) {
                                    class81 var65 = new class81();
                                    var65.field1028 = var9;
                                    var65.field1031 = var9.field3158;
                                    field692.method4986(var65);
                                }
                                if (field631 > var9.field3183 && var9.field3078 != null) {
                                    class81 var66 = new class81();
                                    var66.field1028 = var9;
                                    var66.field1031 = var9.field3078;
                                    field692.method4986(var66);
                                }
                                if (field665 > var9.field3183 && var9.field3160 != null) {
                                    class81 var67 = new class81();
                                    var67.field1028 = var9;
                                    var67.field1031 = var9.field3160;
                                    field692.method4986(var67);
                                }
                                if (field673 > var9.field3183 && var9.field3161 != null) {
                                    class81 var68 = new class81();
                                    var68.field1028 = var9;
                                    var68.field1031 = var9.field3161;
                                    field692.method4986(var68);
                                }
                                if (field704 > var9.field3183 && var9.field3166 != null) {
                                    class81 var69 = new class81();
                                    var69.field1028 = var9;
                                    var69.field1031 = var9.field3166;
                                    field692.method4986(var69);
                                }
                                if (field689 > var9.field3183 && var9.field3175 != null) {
                                    class81 var70 = new class81();
                                    var70.field1028 = var9;
                                    var70.field1031 = var9.field3175;
                                    field692.method4986(var70);
                                }
                                if (field696 > var9.field3183 && var9.field3162 != null) {
                                    class81 var71 = new class81();
                                    var71.field1028 = var9;
                                    var71.field1031 = var9.field3162;
                                    field692.method4986(var71);
                                }
                                var9.field3183 = field674;
                                if (var9.field3141 != null) {
                                    for (int var72 = 0; var72 < field714; var72++) {
                                        class81 var73 = new class81();
                                        var73.field1028 = var9;
                                        var73.field1033 = field596[var72];
                                        var73.field1034 = field715[var72];
                                        var73.field1031 = var9.field3141;
                                        field692.method4986(var73);
                                    }
                                }
                                if (var9.field3156 != null) {
                                    int[] var74 = class24.method4866();
                                    for (int var75 = 0; var75 < var74.length; var75++) {
                                        class81 var76 = new class81();
                                        var76.field1028 = var9;
                                        var76.field1033 = var74[var75];
                                        var76.field1031 = var9.field3156;
                                        field692.method4986(var76);
                                    }
                                }
                                if (var9.field3070 != null) {
                                    int[] var77 = Statics.method5673();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class81 var79 = new class81();
                                        var79.field1028 = var9;
                                        var79.field1033 = var77[var78];
                                        var79.field1031 = var9.field3070;
                                        field692.method4986(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field3045) {
                            if (field662 != null || Statics.field390 != null || field625) {
                                continue;
                            }
                            if ((var9.field3171 >= 0 || var9.field3073 != 0) && class33.field221 >= var12 && class33.field230 >= var13 && class33.field221 < var14 && class33.field230 < var15) {
                                if (var9.field3171 >= 0) {
                                    Statics.field3786 = arg0[var9.field3171];
                                } else {
                                    Statics.field3786 = var9;
                                }
                            }
                            if (var9.field3159 == 8 && class33.field221 >= var12 && class33.field230 >= var13 && class33.field221 < var14 && class33.field230 < var15) {
                                Statics.field4228 = var9;
                            }
                            if (var9.field3096 > var9.field3062) {
                                method2571(var9, var9.field3098 + var10, var11, var9.field3062, var9.field3096, class33.field221, class33.field230);
                            }
                        }
                        if (var9.field3159 == 0) {
                            method5428(arg0, var9.field3046, var12, var13, var14, var15, var10 - var9.field3067, var11 - var9.field3068);
                            if (var9.field3180 != null) {
                                method5428(var9.field3180, var9.field3046, var12, var13, var14, var15, var10 - var9.field3067, var11 - var9.field3068);
                            }
                            class80 var80 = (class80) field650.method6016((long) var9.field3046);
                            if (var80 != null) {
                                if (var80.field1022 == 0 && class33.field221 >= var12 && class33.field230 >= var13 && class33.field221 < var14 && class33.field230 < var15 && !field625) {
                                    for (class81 var81 = (class81) field692.method4962(); var81 != null; var81 = (class81) field692.method4985()) {
                                        if (var81.field1027) {
                                            var81.method5732();
                                            var81.field1028.field3181 = false;
                                        }
                                    }
                                    if (Statics.field1440 == 0) {
                                        field662 = null;
                                        field663 = null;
                                    }
                                    if (!field625) {
                                        Statics.method371();
                                    }
                                }
                                method277(var80.field1023, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fy.jm(IB)Z")
    public static boolean method2949(int arg0) {
        for (int var1 = 0; var1 < field714; var1++) {
            if (field596[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("f.jv(IIB)V")
    public static final void method171(int arg0, int arg1) {
        if (class262.method5238(arg0)) {
            method3785(Statics.field1535[arg0], arg1);
        }
    }

    @ObfuscatedName("hm.jb([Ljd;II)V")
    public static final void method3785(class262[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class262 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3159 == 0) {
                    if (var3.field3180 != null) {
                        method3785(var3.field3180, arg1);
                    }
                    class80 var4 = (class80) field650.method6016((long) var3.field3046);
                    if (var4 != null) {
                        method171(var4.field1023, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3157 != null) {
                    class81 var5 = new class81();
                    var5.field1028 = var3;
                    var5.field1031 = var3.field3157;
                    Statics.method2499(var5);
                }
                if (arg1 == 1 && var3.field3089 != null) {
                    if (var3.field3077 >= 0) {
                        class262 var6 = class262.method2073(var3.field3046);
                        if (var6 == null || var6.field3180 == null || var3.field3077 >= var6.field3180.length || var6.field3180[var3.field3077] != var3) {
                            continue;
                        }
                    }
                    class81 var7 = new class81();
                    var7.field1028 = var3;
                    var7.field1031 = var3.field3089;
                    Statics.method2499(var7);
                }
            }
        }
    }

    @ObfuscatedName("i.jg(Ljd;III)V")
    public static final void method370(class262 arg0, int arg1, int arg2) {
        if (field662 != null || field625 || arg0 == null) {
            return;
        }
        class262 var3 = method1026(arg0);
        if (var3 == null) {
            var3 = arg0.field3127;
        }
        if (var3 == null) {
            return;
        }
        field662 = arg0;
        class262 var5 = method1026(arg0);
        if (var5 == null) {
            var5 = arg0.field3127;
        }
        field663 = var5;
        field664 = arg1;
        field693 = arg2;
        Statics.field1440 = 0;
        field622 = false;
        int var7 = method405();
        if (var7 != -1) {
            Statics.field3670 = new class67();
            Statics.field3670.field860 = field627[var7];
            Statics.field3670.field865 = field493[var7];
            Statics.field3670.field861 = field629[var7];
            Statics.field3670.field866 = field630[var7];
            Statics.field3670.field863 = field575[var7];
        }
        return;
    }

    @ObfuscatedName("client.jl(B)V")
    public final void method1082() {
        method2027(field662);
        Statics.field1440++;
        if (field670 && field667) {
            int var1 = class33.field221;
            int var2 = class33.field230;
            int var3 = var1 - field664;
            int var4 = var2 - field693;
            if (var3 < field624) {
                var3 = field624;
            }
            if (field662.field3098 + var3 > field624 + field663.field3098) {
                var3 = field624 + field663.field3098 - field662.field3098;
            }
            if (var4 < field659) {
                var4 = field659;
            }
            if (field662.field3062 + var4 > field659 + field663.field3062) {
                var4 = field659 + field663.field3062 - field662.field3062;
            }
            int var5 = var3 - field740;
            int var6 = var4 - field672;
            int var7 = field662.field3110;
            if (Statics.field1440 > field662.field3129 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field622 = true;
            }
            int var8 = field663.field3067 + (var3 - field624);
            int var9 = field663.field3068 + (var4 - field659);
            if (field662.field3144 != null && field622) {
                class81 var10 = new class81();
                var10.field1028 = field662;
                var10.field1035 = var8;
                var10.field1030 = var9;
                var10.field1031 = field662.field3144;
                Statics.method2499(var10);
            }
            if (class33.field239 == 0) {
                if (field622) {
                    if (field662.field3107 != null) {
                        class81 var11 = new class81();
                        var11.field1028 = field662;
                        var11.field1035 = var8;
                        var11.field1030 = var9;
                        var11.field1032 = field666;
                        var11.field1031 = field662.field3107;
                        Statics.method2499(var11);
                    }
                    if (field666 != null && method1026(field662) != null) {
                        class242 var12 = Statics.method1576(class240.field2699, field535.field1282);
                        var12.field2767.method6263(field662.field3046);
                        var12.field2767.method6353(field666.field3077);
                        var12.field2767.method6254(field662.field3077);
                        var12.field2767.method6254(field666.field3176);
                        var12.field2767.method6254(field662.field3176);
                        var12.field2767.method6262(field666.field3046);
                        field535.method2211(var12);
                    }
                } else if (this.method1257()) {
                    this.method1079(field740 + field664, field693 + field672);
                } else if (field626 > 0) {
                    int var13 = field740 + field664;
                    int var14 = field693 + field672;
                    class67 var15 = Statics.field3670;
                    method5377(var15.field860, var15.field865, var15.field861, var15.field866, var15.field863, var15.field863, var13, var14);
                    Statics.field3670 = null;
                }
                field662 = null;
            }
        } else if (Statics.field1440 > 1) {
            field662 = null;
        }
    }

    @ObfuscatedName("cf.jr(Ljd;I)V")
    public static void method2027(class262 arg0) {
        if (field697 == arg0.field3188) {
            field698[arg0.field3093] = true;
        }
    }

    @ObfuscatedName("bm.jt(I)V")
    public static void method1779() {
        for (class80 var0 = (class80) field650.method6017(); var0 != null; var0 = (class80) field650.method6019()) {
            int var1 = var0.field1023;
            if (class262.method5238(var1)) {
                boolean var2 = true;
                class262[] var3 = Statics.field1535[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3045;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4056;
                    class262 var6 = class262.method2073(var5);
                    if (var6 != null) {
                        method2027(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.jn(II)V")
    public static final void method282(int arg0) {
        if (!class262.method5238(arg0)) {
            return;
        }
        class262[] var1 = Statics.field1535[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class262 var3 = var1[var2];
            if (var3 != null) {
                var3.field3034 = 0;
                var3.field3179 = 0;
            }
        }
    }

    @ObfuscatedName("dx.je([Ljd;IB)V")
    public static final void method2346(class262[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class262 var3 = arg0[var2];
            if (var3 != null && var3.field3065 == arg1 && (!var3.field3045 || !method738(var3))) {
                if (var3.field3159 == 0) {
                    if (!var3.field3045 && method738(var3) && Statics.field3786 != var3) {
                        continue;
                    }
                    method2346(arg0, var3.field3046);
                    if (var3.field3180 != null) {
                        method2346(var3.field3180, var3.field3046);
                    }
                    class80 var4 = (class80) field650.method6016((long) var3.field3046);
                    if (var4 != null) {
                        int var5 = var4.field1023;
                        if (class262.method5238(var5)) {
                            method2346(Statics.field1535[var5], -1);
                        }
                    }
                }
                if (var3.field3159 == 6) {
                    if (var3.field3121 != -1 || var3.field3094 != -1) {
                        boolean var6 = method6447(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3094;
                        } else {
                            var7 = var3.field3121;
                        }
                        if (var7 != -1) {
                            class172 var8 = class172.method269(var7);
                            var3.field3179 += field765;
                            while (var3.field3179 > var8.field1951[var3.field3034]) {
                                var3.field3179 -= var8.field1951[var3.field3034];
                                var3.field3034++;
                                if (var3.field3034 >= var8.field1952.length) {
                                    var3.field3034 -= var8.field1958;
                                    if (var3.field3034 < 0 || var3.field3034 >= var8.field1952.length) {
                                        var3.field3034 = 0;
                                    }
                                }
                                method2027(var3);
                            }
                        }
                    }
                    if (var3.field3102 != 0 && !var3.field3045) {
                        int var9 = var3.field3102 >> 16;
                        int var10 = var3.field3102 << 16 >> 16;
                        int var11 = field765 * var9;
                        int var12 = field765 * var10;
                        var3.field3097 = var3.field3097 + var11 & 0x7FF;
                        var3.field3074 = var3.field3074 + var12 & 0x7FF;
                        method2027(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ia.jy(D)V")
    public static final void method4441(double arg0) {
        class211.method3761(arg0);
        ((class218) Statics.field2331).method3995(arg0);
        class170.field1880.method4168();
        Statics.field1779.field1194 = arg0;
        class89.method362();
    }

    @ObfuscatedName("fh.jw(II)V")
    public static final void method3160(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field1779.field1195 == var1) {
            return;
        }
        if (Statics.field1779.field1195 == 0 && field503 != -1) {
            class248.method978(Statics.field3292, field503, 0, var1, false);
            field729 = false;
        } else if (var1 == 0) {
            class248.method366();
            field729 = false;
        } else if (class248.field2901 == 0) {
            Statics.field1510.method4243(var1);
        } else {
            Statics.field2183 = var1;
        }
        Statics.field1779.field1195 = var1;
        class89.method362();
    }

    @ObfuscatedName("q.ju(II)V")
    public static final void method267(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1779.field1196 = var1;
        class89.method362();
    }

    @ObfuscatedName("jg.ji(IB)V")
    public static final void method4630(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1779.field1199 = var1;
        class89.method362();
    }

    @ObfuscatedName("en.jk(II)V")
    public static final void method2583(int arg0) {
        method1779();
        class63.method604();
        int var1 = class153.method2283(arg0).field1617;
        if (var1 == 0) {
            return;
        }
        int var2 = class257.field3001[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method4441(0.9D);
            }
            if (var2 == 2) {
                method4441(0.8D);
            }
            if (var2 == 3) {
                method4441(0.7D);
            }
            if (var2 == 4) {
                method4441(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method3160(255);
            }
            if (var2 == 1) {
                method3160(192);
            }
            if (var2 == 2) {
                method3160(128);
            }
            if (var2 == 3) {
                method3160(64);
            }
            if (var2 == 4) {
                method3160(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method267(127);
            }
            if (var2 == 1) {
                method267(96);
            }
            if (var2 == 2) {
                method267(64);
            }
            if (var2 == 3) {
                method267(32);
            }
            if (var2 == 4) {
                method267(0);
            }
        }
        if (var1 == 5) {
            field632 = var2;
        }
        if (var1 == 6) {
            field555 = var2;
        }
        if (var1 == 9) {
            field610 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method4630(127);
            }
            if (var2 == 1) {
                method4630(96);
            }
            if (var2 == 2) {
                method4630(64);
            }
            if (var2 == 3) {
                method4630(32);
            }
            if (var2 == 4) {
                method4630(0);
            }
        }
        if (var1 == 17) {
            field585 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field509 = (class94) class304.method4518(class94.method764(), var2);
            if (field509 == null) {
                field509 = class94.field1235;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field565 = -1;
            } else {
                field565 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field510 = (class94) class304.method4518(class94.method764(), var2);
            if (field510 == null) {
                field510 = class94.field1235;
            }
        }
    }

    @ObfuscatedName("bp.jo(Ljd;I)V")
    public static final void method1009(class262 arg0) {
        int var1 = arg0.field3050;
        if (var1 == 324) {
            if (field756 == -1) {
                field756 = arg0.field3081;
                field757 = arg0.field3082;
            }
            if (field529.field3015) {
                arg0.field3081 = field756;
            } else {
                arg0.field3081 = field757;
            }
        } else if (var1 == 325) {
            if (field756 == -1) {
                field756 = arg0.field3081;
                field757 = arg0.field3082;
            }
            if (field529.field3015) {
                arg0.field3081 = field757;
            } else {
                arg0.field3081 = field756;
            }
        } else if (var1 == 327) {
            arg0.field3097 = 150;
            arg0.field3074 = (int) (Math.sin((double) field744 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3064 = 5;
            arg0.field3032 = 0;
        } else if (var1 == 328) {
            arg0.field3097 = 150;
            arg0.field3074 = (int) (Math.sin((double) field744 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3064 = 5;
            arg0.field3032 = 1;
        }
    }

    @ObfuscatedName("ls.jf(S)V")
    public static final void method5415() {
        class242 var0 = Statics.method1576(class240.field2700, field535.field1282);
        field535.method2211(var0);
        for (class80 var1 = (class80) field650.method6017(); var1 != null; var1 = (class80) field650.method6019()) {
            if (var1.field1022 == 0 || var1.field1022 == 3) {
                method3514(var1, true);
            }
        }
        if (field655 != null) {
            method2027(field655);
            field655 = null;
        }
    }

    @ObfuscatedName("hc.jz(IIIS)Lci;")
    public static final class80 method4121(int arg0, int arg1, int arg2) {
        class80 var3 = new class80();
        var3.field1023 = arg1;
        var3.field1022 = arg2;
        field650.method6015(var3, (long) arg0);
        method282(arg1);
        class262 var4 = class262.method2073(arg0);
        method2027(var4);
        if (field655 != null) {
            method2027(field655);
            field655 = null;
        }
        method2012();
        method2745(Statics.field1535[arg0 >> 16], var4, false);
        class64.method2282(arg1);
        if (field649 != -1) {
            method171(field649, 1);
        }
        return var3;
    }

    @ObfuscatedName("gk.jx(Lci;ZI)V")
    public static final void method3514(class80 arg0, boolean arg1) {
        int var2 = arg0.field1023;
        int var3 = (int) arg0.field4056;
        arg0.method5732();
        if (arg1) {
            class262.method2368(var2);
        }
        for (class368 var4 = (class368) field755.method6017(); var4 != null; var4 = (class368) field755.method6019()) {
            if ((var4.field4056 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method5732();
            }
        }
        class262 var5 = class262.method2073(var3);
        if (var5 != null) {
            method2027(var5);
        }
        method2012();
        if (field649 != -1) {
            method171(field649, 1);
        }
    }

    @ObfuscatedName("dc.jq(Ljd;I)Z")
    public static final boolean method2363(class262 arg0) {
        int var1 = arg0.field3050;
        if (var1 == 205) {
            field536 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field529.method4489(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field529.method4484(var4, var5 == 1);
        }
        if (var1 == 324) {
            field529.method4509(false);
        }
        if (var1 == 325) {
            field529.method4509(true);
        }
        if (var1 == 326) {
            class242 var6 = Statics.method1576(class240.field2678, field535.field1282);
            field529.method4481(var6.field2767);
            field535.method2211(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hr.ke(Ljd;IIII)V")
    public static final void method3976(class262 arg0, int arg1, int arg2, int arg3) {
        method16();
        class256 var4 = arg0.method4529(false);
        if (var4 == null) {
            return;
        }
        class409.method6519(arg1, arg2, var4.field2997 + arg1, var4.field2998 + arg2);
        if (field727 == 2 || field727 == 5) {
            class409.method6539(arg1, arg2, 0, var4.field2996, var4.field2993);
        } else {
            int var5 = field559 & 0x7FF;
            int var6 = Statics.field1485.field1119 / 32 + 48;
            int var7 = 464 - Statics.field1485.field1096 / 32;
            Statics.field1370.method6704(arg1, arg2, var4.field2997, var4.field2998, var6, var7, var5, 256, var4.field2996, var4.field2993);
            for (int var8 = 0; var8 < field653; var8++) {
                int var9 = field502[var8] * 4 + 2 - Statics.field1485.field1119 / 32;
                int var10 = field617[var8] * 4 + 2 - Statics.field1485.field1096 / 32;
                method5985(arg1, arg2, var9, var10, field548[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class309 var13 = field569[Statics.field4237][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1485.field1119 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1485.field1096 / 32;
                        method5985(arg1, arg2, var14, var15, Statics.field956[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field531; var16++) {
                class91 var17 = field530[field532[var16]];
                if (var17 != null && var17.method1993()) {
                    class161 var18 = var17.field1214;
                    if (var18 != null && var18.field1735 != null) {
                        var18 = var18.method2712();
                    }
                    if (var18 != null && var18.field1726 && var18.field1738) {
                        int var19 = var17.field1119 / 32 - Statics.field1485.field1119 / 32;
                        int var20 = var17.field1096 / 32 - Statics.field1485.field1096 / 32;
                        method5985(arg1, arg2, var19, var20, Statics.field956[1], var4);
                    }
                }
            }
            int var21 = class96.field1257;
            int[] var22 = class96.field1249;
            for (int var23 = 0; var23 < var21; var23++) {
                class83 var24 = field605[var22[var23]];
                if (var24 != null && var24.method1993() && !var24.field1069 && Statics.field1485 != var24) {
                    int var25 = var24.field1119 / 32 - Statics.field1485.field1119 / 32;
                    int var26 = var24.field1096 / 32 - Statics.field1485.field1096 / 32;
                    if (var24.method1957()) {
                        method5985(arg1, arg2, var25, var26, Statics.field956[3], var4);
                    } else if (Statics.field1485.field1073 != 0 && var24.field1073 != 0 && Statics.field1485.field1073 == var24.field1073) {
                        method5985(arg1, arg2, var25, var26, Statics.field956[4], var4);
                    } else if (var24.method1996()) {
                        method5985(arg1, arg2, var25, var26, Statics.field956[5], var4);
                    } else if (var24.method1958()) {
                        method5985(arg1, arg2, var25, var26, Statics.field956[6], var4);
                    } else {
                        method5985(arg1, arg2, var25, var26, Statics.field956[2], var4);
                    }
                }
            }
            if (field501 != 0 && field744 % 20 < 10) {
                if (field501 == 1 && field711 >= 0 && field711 < field530.length) {
                    class91 var27 = field530[field711];
                    if (var27 != null) {
                        int var28 = var27.field1119 / 32 - Statics.field1485.field1119 / 32;
                        int var29 = var27.field1096 / 32 - Statics.field1485.field1096 / 32;
                        method1938(arg1, arg2, var28, var29, Statics.field67[1], var4);
                    }
                }
                if (field501 == 2) {
                    int var30 = field504 * 4 - Statics.field1942 * 4 + 2 - Statics.field1485.field1119 / 32;
                    int var31 = field505 * 4 - Statics.field3866 * 4 + 2 - Statics.field1485.field1096 / 32;
                    method1938(arg1, arg2, var30, var31, Statics.field67[1], var4);
                }
                if (field501 == 10 && field686 >= 0 && field686 < field605.length) {
                    class83 var32 = field605[field686];
                    if (var32 != null) {
                        int var33 = var32.field1119 / 32 - Statics.field1485.field1119 / 32;
                        int var34 = var32.field1096 / 32 - Statics.field1485.field1096 / 32;
                        method1938(arg1, arg2, var33, var34, Statics.field67[1], var4);
                    }
                }
            }
            if (field586 != 0) {
                int var35 = field586 * 4 + 2 - Statics.field1485.field1119 / 32;
                int var36 = field726 * 4 + 2 - Statics.field1485.field1096 / 32;
                method5985(arg1, arg2, var35, var36, Statics.field67[0], var4);
            }
            if (!Statics.field1485.field1069) {
                class409.method6556(var4.field2997 / 2 + arg1 - 1, var4.field2998 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field767[arg3] = true;
    }

    @ObfuscatedName("oa.kx(Ljd;IIIB)V")
    public static final void method6128(class262 arg0, int arg1, int arg2, int arg3) {
        class256 var4 = arg0.method4529(false);
        if (var4 == null) {
            return;
        }
        if (field727 < 3) {
            Statics.field229.method6704(arg1, arg2, var4.field2997, var4.field2998, 25, 25, field559, 256, var4.field2996, var4.field2993);
        } else {
            class409.method6539(arg1, arg2, 0, var4.field2996, var4.field2993);
        }
    }

    @ObfuscatedName("cw.kl(IIIILoc;Lii;I)V")
    public static final void method1938(int arg0, int arg1, int arg2, int arg3, class413 arg4, class256 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method5985(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field559 & 0x7FF;
        int var8 = class211.field2346[var7];
        int var9 = class211.field2357[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2997 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field79.method6645(arg5.field2997 / 2 + arg0 - var17 / 2 + var15, arg5.field2998 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("nd.kk(IIIILoc;Lii;B)V")
    public static final void method5985(int arg0, int arg1, int arg2, int arg3, class413 arg4, class256 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field559 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class211.field2346[var6];
        int var9 = class211.field2357[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method6665(arg5.field2997 / 2 + var10 - arg4.field4372 / 2, arg5.field2998 / 2 - var11 - arg4.field4373 / 2, arg0, arg1, arg5.field2997, arg5.field2998, arg5.field2996, arg5.field2993);
        } else {
            arg4.method6615(arg5.field2997 / 2 + arg0 + var10 - arg4.field4372 / 2, arg5.field2998 / 2 + arg1 - var11 - arg4.field4373 / 2);
        }
    }

    @ObfuscatedName("gi.ks(B)V")
    public static final void method3546() {
        class98.method1901();
        if (Statics.field1010 != null) {
            Statics.field1010.method5396();
        }
    }

    @ObfuscatedName("y.km(I)V")
    public static final void method110() {
        for (int var0 = 0; var0 < class96.field1257; var0++) {
            class83 var1 = field605[class96.field1249[var0]];
            var1.method1961();
        }
    }

    @ObfuscatedName("af.kw(I)V")
    public static final void method979() {
        field684 = field674;
    }

    @ObfuscatedName("dj.ku(I)V")
    public static final void method2356() {
        field631 = field674;
        Statics.field4074 = true;
    }

    @ObfuscatedName("cg.ky(I)V")
    public static final void method2177() {
        field665 = field674;
        Statics.field1276 = true;
    }

    @ObfuscatedName("fd.kf(Ljava/lang/String;I)V")
    public static final void method3127(String arg0) {
        if (Statics.field1010 != null) {
            class242 var1 = Statics.method1576(class240.field2715, field535.field1282);
            var1.field2767.method6200(class400.method5614(arg0));
            var1.field2767.method6242(arg0);
            field535.method2211(var1);
        }
    }

    @ObfuscatedName("iw.kv(Ljava/lang/String;I)V")
    public static final void method4348(String arg0) {
        if (!arg0.equals("")) {
            class242 var1 = Statics.method1576(class240.field2728, field535.field1282);
            var1.field2767.method6200(class400.method5614(arg0));
            var1.field2767.method6242(arg0);
            field535.method2211(var1);
        }
    }

    @ObfuscatedName("cp.ko(I)V")
    public static final void method2144() {
        class242 var0 = Statics.method1576(class240.field2728, field535.field1282);
        var0.field2767.method6200(0);
        field535.method2211(var0);
    }

    @ObfuscatedName("mu.kq(III)V")
    public static final void method5722(int arg0, int arg1) {
        class137 var2 = arg0 >= 0 ? field719[arg0] : Statics.field2133;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2476()) {
            return;
        }
        class119 var3 = (class119) var2.field1515.get(arg1);
        if (var3.field1394 != -1) {
            return;
        }
        String var4 = var3.field1396.method6800();
        class99 var5 = field535;
        class242 var6 = Statics.method1576(class240.field2724, var5.field1282);
        var6.field2767.method6200(3 + class400.method5614(var4));
        var6.field2767.method6200(arg0);
        var6.field2767.method6311(arg1);
        var6.field2767.method6242(var4);
        var5.method2211(var6);
    }

    @ObfuscatedName("am.kd(IIB)V")
    public static final void method753(int arg0, int arg1) {
        if (field719[arg0] == null || arg1 < 0 || arg1 >= field719[arg0].method2476()) {
            return;
        }
        class119 var2 = (class119) field719[arg0].field1515.get(arg1);
        if (var2.field1394 != -1) {
            return;
        }
        class99 var3 = field535;
        class242 var4 = Statics.method1576(class240.field2690, var3.field1282);
        var4.field2767.method6200(3 + class400.method5614(var2.field1396.method6800()));
        var4.field2767.method6200(arg0);
        var4.field2767.method6311(arg1);
        var4.field2767.method6242(var2.field1396.method6800());
        var3.method2211(var4);
    }

    @ObfuscatedName("cm.kp(IIZI)V")
    public static final void method2131(int arg0, int arg1, boolean arg2) {
        if (field719[arg0] == null || arg1 < 0 || arg1 >= field719[arg0].method2476()) {
            return;
        }
        class119 var3 = (class119) field719[arg0].field1515.get(arg1);
        class99 var4 = field535;
        class242 var5 = Statics.method1576(class240.field2667, var4.field1282);
        var5.field2767.method6200(4 + class400.method5614(var3.field1396.method6800()));
        var5.field2767.method6200(arg0);
        var5.field2767.method6311(arg1);
        var5.field2767.method6206(arg2);
        var5.field2767.method6242(var3.field1396.method6800());
        var4.method2211(var5);
    }

    @ObfuscatedName("af.kr(Ljd;B)I")
    public static int method967(class262 arg0) {
        class368 var1 = (class368) field755.method6016(((long) arg0.field3046 << 32) + (long) arg0.field3077);
        return var1 == null ? arg0.field3106 : var1.field4054;
    }

    @ObfuscatedName("bc.kj(Ljd;I)Ljd;")
    public static class262 method1026(class262 arg0) {
        int var1 = class263.method187(method967(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class262.method2073(arg0.field3065);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ab.kt(Ljd;B)Z")
    public static boolean method738(class262 arg0) {
        return arg0.field3066;
    }

    @ObfuscatedName("al.ka(Ljd;IB)Ljava/lang/String;")
    public static String method400(class262 arg0, int arg1) {
        if (!class263.method977(method967(arg0), arg1) && arg0.field3152 == null) {
            return null;
        } else if (arg0.field3126 == null || arg0.field3126.length <= arg1 || arg0.field3126[arg1] == null || arg0.field3126[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3126[arg1];
        }
    }

    @ObfuscatedName("el.ki(Ljd;I)Ljava/lang/String;")
    public static String method2539(class262 arg0) {
        if (class263.method2494(method967(arg0)) == 0) {
            return null;
        } else if (arg0.field3131 == null || arg0.field3131.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3131;
        }
    }

    @ObfuscatedName("gd.kb(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method3433(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field483 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field483 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field483 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field483 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field483 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2105 != null) {
            var3 = "/p=" + Statics.field2105;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3879 + "/a=" + Statics.field146 + var3 + "/";
    }

    @ObfuscatedName("cf.kg(Ljava/lang/String;I)V")
    public static void method2021(String arg0) {
        Statics.field2105 = arg0;
        try {
            String var1 = Statics.field3681.getParameter(Integer.toString(18));
            String var2 = Statics.field3681.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class267.method167(class397.method3986() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class28.method392(Statics.field3681, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("dk.kn(Ljava/lang/String;ZI)V")
    public static void method2304(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1919; var5++) {
            class170 var6 = class170.method1776(var5);
            if ((!arg1 || var6.field1909) && var6.field1915 == -1 && var6.field1883.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1155 = -1;
                    Statics.field23 = null;
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
        Statics.field23 = var3;
        Statics.field128 = 0;
        Statics.field1155 = var4;
        String[] var9 = new String[Statics.field1155];
        for (int var10 = 0; var10 < Statics.field1155; var10++) {
            var9[var10] = class170.method1776(var3[var10]).field1883;
        }
        short[] var11 = Statics.field23;
        class395.method1943(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("jh.kc(Lot;II)V")
    public static void method4582(class400 arg0, int arg1) {
        byte[] var2 = arg0.field4271;
        if (field613 == null) {
            field613 = new byte[24];
        }
        class322.method5304(var2, arg1, field613, 0, 24);
        if (class144.field1552 == null) {
            return;
        }
        try {
            class144.field1552.method6076(0L);
            class144.field1552.method6081(arg0.field4271, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("cx.kz(Lot;I)V")
    public static void method2084(class400 arg0) {
        if (field613 != null) {
            arg0.method6210(field613, 0, field613.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class144.field1552.method6076(0L);
            class144.field1552.method6094(var1);
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
        arg0.method6210(var1, 0, var1.length);
    }

    @ObfuscatedName("client.kh(I)Lpp;")
    public class421 method1083() {
        return Statics.field1485 == null ? null : Statics.field1485.field1070;
    }

    @ObfuscatedName("co.lk(I)Z")
    public static boolean method1987() {
        return field658 >= 2;
    }

    @ObfuscatedName("bf.lz(II)V")
    public static void method1005(int arg0) {
        field748 = arg0;
    }

    @ObfuscatedName("kf.lu(B)V")
    public static void method4852() {
        field535.method2211(Statics.method1576(class240.field2685, field535.field1282));
        field748 = 0;
    }

    @ObfuscatedName("bb.ll(I)V")
    public static void method1817() {
        if (field748 == 1) {
            field742 = true;
        }
    }

    @ObfuscatedName("fr.lj(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method3267(String arg0) {
        class285[] var1 = class285.method2842();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class285 var3 = var1[var2];
            if (var3.field3666 != -1 && arg0.startsWith(class92.method1049(var3.field3666))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3666).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("client.lb(I)V")
    public static void method1513() {
        if (Statics.field83 == null) {
            return;
        }
        field761 = field744;
        Statics.field83.method4911();
        for (int var0 = 0; var0 < field605.length; var0++) {
            if (field605[var0] != null) {
                Statics.field83.method4910((field605[var0].field1119 >> 7) + Statics.field1942, (field605[var0].field1096 >> 7) + Statics.field3866);
            }
        }
    }

    @ObfuscatedName("gh.lp(I)Z")
    public static boolean method3557() {
        return Statics.field1779.field1193 >= field486;
    }

    @ObfuscatedName("dz.lm(I)V")
    public static void method2377() {
        Statics.field1779.field1193 = field486;
        class89.method362();
    }

    @ObfuscatedName("ex.lr(IS)V")
    public static void method2471(int arg0) {
        if (field636 != arg0) {
            field636 = arg0;
        }
    }
}

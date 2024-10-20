package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

public final class client extends class74 {

    @ObfuscatedName("client.k")
    public static boolean field672 = true;

    @ObfuscatedName("client.q")
    public static int field603 = 1;

    @ObfuscatedName("client.j")
    public static int field501 = 0;

    @ObfuscatedName("client.m")
    public static int field503 = 0;

    @ObfuscatedName("client.w")
    public static class131[] field557 = new class131[4];

    @ObfuscatedName("client.u")
    public static boolean field504 = false;

    @ObfuscatedName("client.p")
    public static boolean field505 = false;

    @ObfuscatedName("client.t")
    public static int field506 = 0;

    @ObfuscatedName("client.o")
    public static int field507 = 0;

    @ObfuscatedName("client.c")
    public static boolean field508 = true;

    @ObfuscatedName("client.b")
    public static int field569 = 0;

    @ObfuscatedName("client.f")
    public static long field510 = -1L;

    @ObfuscatedName("client.r")
    public static int field761 = -1;

    @ObfuscatedName("client.l")
    public static int field512 = -1;

    @ObfuscatedName("client.n")
    public static int field652 = -1;

    @ObfuscatedName("client.h")
    public static boolean field514 = true;

    @ObfuscatedName("client.v")
    public static boolean field515 = false;

    @ObfuscatedName("client.ax")
    public static int field691 = 0;

    @ObfuscatedName("client.ao")
    public static int field656 = 0;

    @ObfuscatedName("client.al")
    public static int field754 = 0;

    @ObfuscatedName("client.ap")
    public static int field744 = 0;

    @ObfuscatedName("client.ak")
    public static int field689 = 0;

    @ObfuscatedName("client.aw")
    public static int field619 = 0;

    @ObfuscatedName("client.av")
    public static int field522 = 0;

    @ObfuscatedName("client.ah")
    public static int field523 = 0;

    @ObfuscatedName("client.ae")
    public static int field524 = 0;

    @ObfuscatedName("client.am")
    public static class128 field733 = new class128(new byte[5000]);

    @ObfuscatedName("client.aa")
    public static int field526 = 0;

    @ObfuscatedName("client.ar")
    public static int field527 = 0;

    @ObfuscatedName("client.at")
    public static int field528 = 0;

    @ObfuscatedName("client.bt")
    public static int field636 = 0;

    @ObfuscatedName("client.by")
    public static int field531 = 0;

    @ObfuscatedName("client.bs")
    public static int field702 = 0;

    @ObfuscatedName("client.bx")
    public static int field533 = 0;

    @ObfuscatedName("client.br")
    public static int field746 = 0;

    @ObfuscatedName("client.bc")
    public static class26[] field536 = new class26[32768];

    @ObfuscatedName("client.ba")
    public static int field537 = 0;

    @ObfuscatedName("client.bi")
    public static int[] field538 = new int[32768];

    @ObfuscatedName("client.cd")
    public static class117 field543 = new class117(5000);

    @ObfuscatedName("client.cl")
    public static class117 field540 = new class117(5000);

    @ObfuscatedName("client.cf")
    public static class117 field541 = new class117(5000);

    @ObfuscatedName("client.cp")
    public static int field723 = 0;

    @ObfuscatedName("client.ch")
    public static int field665 = 0;

    @ObfuscatedName("client.cn")
    public static int field544 = 0;

    @ObfuscatedName("client.cw")
    public static int field545 = 0;

    @ObfuscatedName("client.cr")
    public static int field714 = 0;

    @ObfuscatedName("client.cx")
    public static int field547 = 0;

    @ObfuscatedName("client.ce")
    public static int field548 = 0;

    @ObfuscatedName("client.cv")
    public static int field549 = 0;

    @ObfuscatedName("client.cz")
    public static boolean field525 = false;

    @ObfuscatedName("client.ca")
    public static int field499 = 0;

    @ObfuscatedName("client.cb")
    public static int field552 = 0;

    @ObfuscatedName("client.cc")
    public static int field611 = 1;

    @ObfuscatedName("client.dt")
    public static int field554 = 0;

    @ObfuscatedName("client.di")
    public static int field555 = 1;

    @ObfuscatedName("client.dm")
    public static int field556 = 0;

    @ObfuscatedName("client.dw")
    public static boolean field558 = false;

    @ObfuscatedName("client.dv")
    public static int[][][] field559 = new int[4][13][13];

    @ObfuscatedName("client.dr")
    public static final int[] field560 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.da")
    public static int field561 = 0;

    @ObfuscatedName("client.df")
    public static int field562 = 2;

    @ObfuscatedName("client.dd")
    public static int field626 = 0;

    @ObfuscatedName("client.dy")
    public static int field686 = 2;

    @ObfuscatedName("client.du")
    public static int field695 = 0;

    @ObfuscatedName("client.dg")
    public static int field609 = 1;

    @ObfuscatedName("client.dn")
    public static int field567 = 0;

    @ObfuscatedName("client.db")
    public static int field568 = 0;

    @ObfuscatedName("client.dl")
    public static int field655 = 2;

    @ObfuscatedName("client.ds")
    public static int field570 = 0;

    @ObfuscatedName("client.dh")
    public static int field571 = 1;

    @ObfuscatedName("client.ez")
    public static int field572 = 0;

    @ObfuscatedName("client.ef")
    public static int field534 = 0;

    @ObfuscatedName("client.eu")
    public static int field518 = 2301979;

    @ObfuscatedName("client.eg")
    public static int field573 = 5063219;

    @ObfuscatedName("client.ed")
    public static int field707 = 3353893;

    @ObfuscatedName("client.ex")
    public static int field587 = 7759444;

    @ObfuscatedName("client.ea")
    public static boolean field579 = false;

    @ObfuscatedName("client.ec")
    public static int field580 = 0;

    @ObfuscatedName("client.fp")
    public static int field581 = 128;

    @ObfuscatedName("client.fg")
    public static int field582 = 0;

    @ObfuscatedName("client.fy")
    public static int field583 = 0;

    @ObfuscatedName("client.fq")
    public static int field615 = 0;

    @ObfuscatedName("client.ff")
    public static int field637 = 0;

    @ObfuscatedName("client.fi")
    public static int field586 = 0;

    @ObfuscatedName("client.fb")
    public static int field650 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field588 = false;

    @ObfuscatedName("client.fs")
    public static int field589 = 0;

    @ObfuscatedName("client.fk")
    public static int field590 = 0;

    @ObfuscatedName("client.fw")
    public static int field594 = 50;

    @ObfuscatedName("client.fm")
    public static int[] field592 = new int[field594];

    @ObfuscatedName("client.fn")
    public static int[] field593 = new int[field594];

    @ObfuscatedName("client.fu")
    public static int[] field532 = new int[field594];

    @ObfuscatedName("client.fo")
    public static int[] field595 = new int[field594];

    @ObfuscatedName("client.fj")
    public static int[] field596 = new int[field594];

    @ObfuscatedName("client.fx")
    public static int[] field597 = new int[field594];

    @ObfuscatedName("client.fz")
    public static int[] field598 = new int[field594];

    @ObfuscatedName("client.fr")
    public static String[] field599 = new String[field594];

    @ObfuscatedName("client.gm")
    public static int[][] field600 = new int[104][104];

    @ObfuscatedName("client.gu")
    public static int field601 = 0;

    @ObfuscatedName("client.gs")
    public static int field602 = -1;

    @ObfuscatedName("client.gh")
    public static int field577 = -1;

    @ObfuscatedName("client.gw")
    public static int field604 = 0;

    @ObfuscatedName("client.ge")
    public static int field605 = 0;

    @ObfuscatedName("client.gp")
    public static int field647 = 0;

    @ObfuscatedName("client.gi")
    public static int field607 = 0;

    @ObfuscatedName("client.gf")
    public static int field668 = 0;

    @ObfuscatedName("client.gb")
    public static int field732 = 0;

    @ObfuscatedName("client.gr")
    public static int field610 = 0;

    @ObfuscatedName("client.gl")
    public static int field551 = 0;

    @ObfuscatedName("client.gv")
    public static int field612 = 0;

    @ObfuscatedName("client.gz")
    public static int field613 = 0;

    @ObfuscatedName("client.gj")
    public static boolean field519 = false;

    @ObfuscatedName("client.gg")
    public static int field667 = 0;

    @ObfuscatedName("client.go")
    public static int field616 = 0;

    @ObfuscatedName("client.ga")
    public static class3[] field678 = new class3[2048];

    @ObfuscatedName("client.gc")
    public static int field585 = 0;

    @ObfuscatedName("client.gk")
    public static int[] field734 = new int[2048];

    @ObfuscatedName("client.gd")
    public static int field550 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field621 = new int[2048];

    @ObfuscatedName("client.hu")
    public static class128[] field696 = new class128[2048];

    @ObfuscatedName("client.hi")
    public static int field623 = -1;

    @ObfuscatedName("client.hn")
    public static int field624 = 0;

    @ObfuscatedName("client.hb")
    public static int field625 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field697 = new int[1000];

    @ObfuscatedName("client.hr")
    public static final int[] field627 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hl")
    public static String[] field628 = new String[8];

    @ObfuscatedName("client.hm")
    public static boolean[] field629 = new boolean[8];

    @ObfuscatedName("client.hj")
    public static int[] field630 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hp")
    public static class179[][][] field553 = new class179[4][104][104];

    @ObfuscatedName("client.hq")
    public static class179 field563 = new class179();

    @ObfuscatedName("client.hs")
    public static class179 field633 = new class179();

    @ObfuscatedName("client.hk")
    public static class179 field634 = new class179();

    @ObfuscatedName("client.hh")
    public static int[] field635 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field703 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field712 = new int[25];

    @ObfuscatedName("client.hf")
    public static int field638 = 0;

    @ObfuscatedName("client.he")
    public static boolean field639 = false;

    @ObfuscatedName("client.iy")
    public static int field631 = 0;

    @ObfuscatedName("client.io")
    public static int[] field641 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field642 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field643 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field679 = new int[500];

    @ObfuscatedName("client.in")
    public static String[] field645 = new String[500];

    @ObfuscatedName("client.ig")
    public static String[] field646 = new String[500];

    @ObfuscatedName("client.ik")
    public static int field743 = -1;

    @ObfuscatedName("client.iw")
    public static int field648 = -1;

    @ObfuscatedName("client.is")
    public static int field649 = 0;

    @ObfuscatedName("client.ia")
    public static int field529 = 50;

    @ObfuscatedName("client.im")
    public static int field651 = 0;

    @ObfuscatedName("client.iz")
    public static String field584 = null;

    @ObfuscatedName("client.ir")
    public static boolean field653 = false;

    @ObfuscatedName("client.it")
    public static int field654 = -1;

    @ObfuscatedName("client.ij")
    public static String field521 = null;

    @ObfuscatedName("client.ip")
    public static String field516 = null;

    @ObfuscatedName("client.jg")
    public static int field566 = -1;

    @ObfuscatedName("client.ji")
    public static class177 field658 = new class177(8);

    @ObfuscatedName("client.jl")
    public static int field659 = 0;

    @ObfuscatedName("client.jt")
    public static int field657 = 0;

    @ObfuscatedName("client.jx")
    public static class161 field661 = null;

    @ObfuscatedName("client.jk")
    public static int field662 = 0;

    @ObfuscatedName("client.jp")
    public static int field663 = 0;

    @ObfuscatedName("client.jv")
    public static int field718 = 0;

    @ObfuscatedName("client.jr")
    public static boolean field671 = false;

    @ObfuscatedName("client.js")
    public static boolean field666 = false;

    @ObfuscatedName("client.jw")
    public static boolean field687 = false;

    @ObfuscatedName("client.jj")
    public static class161 field535 = null;

    @ObfuscatedName("client.jz")
    public static class161 field669 = null;

    @ObfuscatedName("client.jq")
    public static int field670 = 0;

    @ObfuscatedName("client.ju")
    public static int field713 = 0;

    @ObfuscatedName("client.jo")
    public static class161 field741 = null;

    @ObfuscatedName("client.jy")
    public static boolean field673 = false;

    @ObfuscatedName("client.ja")
    public static int field674 = -1;

    @ObfuscatedName("client.jh")
    public static int field675 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field676 = false;

    @ObfuscatedName("client.jd")
    public static int field677 = -1;

    @ObfuscatedName("client.je")
    public static int field591 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field684 = false;

    @ObfuscatedName("client.kf")
    public static int field680 = 1;

    @ObfuscatedName("client.kg")
    public static int[] field738 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field682 = 0;

    @ObfuscatedName("client.kh")
    public static int[] field683 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field614 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field685 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field681 = 0;

    @ObfuscatedName("client.ky")
    public static int field608 = 0;

    @ObfuscatedName("client.kn")
    public static int field688 = 0;

    @ObfuscatedName("client.km")
    public static int field660 = 0;

    @ObfuscatedName("client.kq")
    public static int field690 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field564 = new int[2000];

    @ObfuscatedName("client.kl")
    public static String[] field692 = new String[1000];

    @ObfuscatedName("client.kc")
    public static int field539 = 0;

    @ObfuscatedName("client.ka")
    public static class179 field694 = new class179();

    @ObfuscatedName("client.kk")
    public static class179 field520 = new class179();

    @ObfuscatedName("client.ko")
    public static class179 field517 = new class179();

    @ObfuscatedName("client.kw")
    public static class177 field575 = new class177(512);

    @ObfuscatedName("client.kt")
    public static int field698 = 0;

    @ObfuscatedName("client.kj")
    public static int field699 = -2;

    @ObfuscatedName("client.kv")
    public static boolean[] field700 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field701 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static boolean[] field632 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static int[] field760 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field704 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field705 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field706 = new int[100];

    @ObfuscatedName("client.lh")
    public static int field726 = 0;

    @ObfuscatedName("client.lu")
    public static int[] field708 = new int[100];

    @ObfuscatedName("client.lo")
    public static String[] field709 = new String[100];

    @ObfuscatedName("client.lj")
    public static String[] field710 = new String[100];

    @ObfuscatedName("client.lf")
    public static String[] field664 = new String[100];

    @ObfuscatedName("client.lb")
    public static int field620 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field565 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lp")
    public static int field644 = 0;

    @ObfuscatedName("client.lz")
    public static int field578 = 0;

    @ObfuscatedName("client.lw")
    public static long[] field716 = new long[100];

    @ObfuscatedName("client.lr")
    public static int field717 = 0;

    @ObfuscatedName("client.ll")
    public static int field742 = 0;

    @ObfuscatedName("client.la")
    public static int[] field719 = new int[128];

    @ObfuscatedName("client.ly")
    public static int[] field720 = new int[128];

    @ObfuscatedName("client.ln")
    public static long field721 = -1L;

    @ObfuscatedName("client.ld")
    public static String field722 = null;

    @ObfuscatedName("client.mp")
    public static String field729 = null;

    @ObfuscatedName("client.mk")
    public static int field724 = -1;

    @ObfuscatedName("client.ma")
    public static int field725 = 0;

    @ObfuscatedName("client.me")
    public static int[] field618 = new int[1000];

    @ObfuscatedName("client.md")
    public static int[] field727 = new int[1000];

    @ObfuscatedName("client.mc")
    public static class87[] field728 = new class87[1000];

    @ObfuscatedName("client.mh")
    public static int field711 = 0;

    @ObfuscatedName("client.mz")
    public static int field730 = 0;

    @ObfuscatedName("client.mf")
    public static int field731 = 0;

    @ObfuscatedName("client.mq")
    public static int field546 = 255;

    @ObfuscatedName("client.mr")
    public static int field755 = -1;

    @ObfuscatedName("client.my")
    public static boolean field640 = false;

    @ObfuscatedName("client.ms")
    public static int field735 = 127;

    @ObfuscatedName("client.mv")
    public static int field736 = 127;

    @ObfuscatedName("client.nr")
    public static int field737 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field748 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field739 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field740 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field542 = new int[50];

    @ObfuscatedName("client.np")
    public static class58[] field759 = new class58[50];

    @ObfuscatedName("client.nj")
    public static boolean field576 = false;

    @ObfuscatedName("client.nf")
    public static boolean[] field498 = new boolean[5];

    @ObfuscatedName("client.nw")
    public static int[] field511 = new int[5];

    @ObfuscatedName("client.ng")
    public static int[] field745 = new int[5];

    @ObfuscatedName("client.no")
    public static int[] field747 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field622 = new int[5];

    @ObfuscatedName("client.om")
    public static int field749 = 0;

    @ObfuscatedName("client.oh")
    public static int field750 = 0;

    @ObfuscatedName("client.og")
    public static class24[] field751 = new class24[400];

    @ObfuscatedName("client.ot")
    public static class175 field752 = new class175();

    @ObfuscatedName("client.op")
    public static int field753 = 0;

    @ObfuscatedName("client.of")
    public static class11[] field530 = new class11[400];

    @ObfuscatedName("client.or")
    public static class166 field693 = new class166();

    @ObfuscatedName("client.oa")
    public static int field756 = -1;

    @ObfuscatedName("client.ob")
    public static int field757 = -1;

    @ObfuscatedName("client.q(I)V")
    public final void method287() {
    }

    public final void init() {
        if (!this.method1473()) {
            return;
        }
        class169[] var1 = new class169[] { class169.field2800, class169.field2806, class169.field2797, class169.field2804, class169.field2799, class169.field2798, class169.field2796, class169.field2803, class169.field2805, class169.field2802 };
        class169[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class169 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2801);
            if (var5 != null) {
                int var6;
                class134[] var8;
                int var9;
                switch(Integer.parseInt(var4.field2801)) {
                    case 1:
                        field501 = Integer.parseInt(var5);
                        continue;
                    case 2:
                        Statics.field87 = (class136) Statics.method1334(class136.method2737(), Integer.parseInt(var5));
                        if (Statics.field87 == class136.field2104) {
                            Statics.field2446 = class188.field2890;
                        } else {
                            Statics.field2446 = class188.field2888;
                        }
                        continue;
                    case 3:
                        field603 = Integer.parseInt(var5);
                        continue;
                    case 4:
                        Statics.field762 = var5;
                        continue;
                    case 5:
                        field506 = Integer.parseInt(var5);
                    case 6:
                    default:
                        continue;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                            field504 = true;
                        } else {
                            field504 = false;
                        }
                        continue;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                        }
                        continue;
                    case 9:
                        field503 = Integer.parseInt(var5);
                        continue;
                    case 10:
                        var6 = Integer.parseInt(var5);
                        class134[] var7 = new class134[] { class134.field2087, class134.field2080, class134.field2082, class134.field2081 };
                        var8 = var7;
                        var9 = 0;
                }
                class134 var11;
                while (true) {
                    if (var9 >= var8.length) {
                        var11 = null;
                        break;
                    }
                    class134 var10 = var8[var9];
                    if (var10.field2085 == var6) {
                        var11 = var10;
                        break;
                    }
                    var9++;
                }
                Statics.field502 = var11;
            }
        }
        method1725();
        Statics.field1658 = this.getCodeBase().getHost();
        String var12 = Statics.field502.field2083;
        byte var13 = 0;
        try {
            Statics.field1430 = 16;
            Statics.field325 = var13;
            try {
                Statics.field1455 = System.getProperty("os.name");
            } catch (Exception var52) {
                Statics.field1455 = "Unknown";
            }
            Statics.field290 = Statics.field1455.toLowerCase();
            try {
                Statics.field791 = System.getProperty("user.home");
                if (Statics.field791 != null) {
                    Statics.field791 = Statics.field791 + "/";
                }
            } catch (Exception var51) {
            }
            try {
                if (Statics.field290.startsWith("win")) {
                    if (Statics.field791 == null) {
                        Statics.field791 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field791 == null) {
                    Statics.field791 = System.getenv("HOME");
                }
                if (Statics.field791 != null) {
                    Statics.field791 = Statics.field791 + "/";
                }
            } catch (Exception var50) {
            }
            if (Statics.field791 == null) {
                Statics.field791 = "~/";
            }
            Statics.field266 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field791, "/tmp/", "" };
            Statics.field1923 = new String[] { ".jagex_cache_" + Statics.field325, ".file_store_" + Statics.field325 };
            int var17 = 0;
            label242: while (var17 < 4) {
                String var18 = var17 == 0 ? "" : "" + var17;
                Statics.field262 = new File(Statics.field791, "jagex_cl_oldschool_" + var12 + var18 + ".dat");
                String var19 = null;
                String var20 = null;
                boolean var21 = false;
                if (Statics.field262.exists()) {
                    try {
                        class30 var22 = new class30(Statics.field262, "rw", 10000L);
                        class128 var23 = new class128((int) var22.method601());
                        while (var23.field2045 < var23.field2043.length) {
                            int var24 = var22.method612(var23.field2043, var23.field2045, var23.field2043.length - var23.field2045);
                            if (var24 == -1) {
                                throw new IOException();
                            }
                            var23.field2045 += var24;
                        }
                        var23.field2045 = 0;
                        int var25 = var23.method2548();
                        if (var25 < 1 || var25 > 3) {
                            throw new IOException("" + var25);
                        }
                        int var26 = 0;
                        if (var25 > 1) {
                            var26 = var23.method2548();
                        }
                        if (var25 <= 2) {
                            var19 = var23.method2463();
                            if (var26 == 1) {
                                var20 = var23.method2463();
                            }
                        } else {
                            var19 = var23.method2464();
                            if (var26 == 1) {
                                var20 = var23.method2464();
                            }
                        }
                        var22.method598();
                    } catch (IOException var54) {
                        var54.printStackTrace();
                    }
                    if (var19 != null) {
                        File var28 = new File(var19);
                        if (!var28.exists()) {
                            var19 = null;
                        }
                    }
                    if (var19 != null) {
                        File var29 = new File(var19, "test.dat");
                        if (!class83.method2325(var29, true)) {
                            var19 = null;
                        }
                    }
                }
                if (var19 == null && var17 == 0) {
                    label217: for (int var30 = 0; var30 < Statics.field1923.length; var30++) {
                        for (int var31 = 0; var31 < Statics.field266.length; var31++) {
                            File var32 = new File(Statics.field266[var31] + Statics.field1923[var30] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var32.exists() && class83.method2325(new File(var32, "test.dat"), true)) {
                                var19 = var32.toString();
                                var21 = true;
                                break label217;
                            }
                        }
                    }
                }
                if (var19 == null) {
                    var19 = Statics.field791 + File.separatorChar + "jagexcache" + var18 + File.separatorChar + "oldschool" + File.separatorChar + var12 + File.separatorChar;
                    var21 = true;
                }
                if (var20 != null) {
                    File var33 = new File(var20);
                    File var34 = new File(var19);
                    try {
                        File[] var35 = var33.listFiles();
                        File[] var36 = var35;
                        for (int var37 = 0; var37 < var36.length; var37++) {
                            File var38 = var36[var37];
                            File var39 = new File(var34, var38.getName());
                            boolean var40 = var38.renameTo(var39);
                            if (!var40) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var53) {
                        var53.printStackTrace();
                    }
                    var21 = true;
                }
                if (var21) {
                    class83.method125(new File(var19), (File) null);
                }
                File var42 = new File(var19);
                Statics.field1428 = var42;
                if (!Statics.field1428.exists()) {
                    Statics.field1428.mkdirs();
                }
                File[] var43 = Statics.field1428.listFiles();
                if (var43 == null) {
                    break;
                }
                File[] var44 = var43;
                int var45 = 0;
                while (true) {
                    if (var45 >= var44.length) {
                        break label242;
                    }
                    File var46 = var44[var45];
                    if (!class83.method2325(var46, false)) {
                        var17++;
                        break;
                    }
                    var45++;
                }
            }
            File var47 = Statics.field1428;
            Statics.field1325 = var47;
            if (!Statics.field1325.exists()) {
                throw new RuntimeException("");
            }
            class73.field1321 = true;
            class83.method2127();
            class83.field1432 = new class31(new class30(class73.method701("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class83.field1433 = new class31(new class30(class73.method701("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field125 = new class31[Statics.field1430];
            for (int var48 = 0; var48 < Statics.field1430; var48++) {
                Statics.field125[var48] = new class31(new class30(class73.method701("main_file_cache.idx" + var48), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var55) {
            class81.method1452((String) null, var55);
        }
        Statics.field1926 = this;
        this.method1515(765, 503, 44);
    }

    @ObfuscatedName("cn.z(I)V")
    public static final void method1725() {
        class96.field1568 = false;
        field505 = false;
    }

    @ObfuscatedName("client.m(B)V")
    public final void method426() {
        Statics.field2445 = field503 == 0 ? 43594 : field603 + 40000;
        Statics.field2792 = field503 == 0 ? 443 : field603 + 50000;
        Statics.field513 = Statics.field2445;
        Statics.field2775 = class164.field2761;
        Statics.field2771 = class164.field2760;
        Statics.field2764 = class164.field2757;
        Statics.field1384 = class164.field2755;
        if (Statics.field1349.toLowerCase().indexOf("microsoft") == -1) {
            class76.field1381[44] = 71;
            class76.field1381[45] = 26;
            class76.field1381[46] = 72;
            class76.field1381[47] = 73;
            class76.field1381[59] = 57;
            class76.field1381[61] = 27;
            class76.field1381[91] = 42;
            class76.field1381[92] = 74;
            class76.field1381[93] = 43;
            class76.field1381[192] = 28;
            class76.field1381[222] = 58;
            class76.field1381[520] = 59;
        } else {
            class76.field1381[186] = 57;
            class76.field1381[187] = 27;
            class76.field1381[188] = 71;
            class76.field1381[189] = 26;
            class76.field1381[190] = 72;
            class76.field1381[191] = 73;
            class76.field1381[192] = 58;
            class76.field1381[219] = 42;
            class76.field1381[220] = 74;
            class76.field1381[221] = 43;
            class76.field1381[222] = 59;
            class76.field1381[223] = 28;
        }
        class76.method284(Statics.field1817);
        Canvas var1 = Statics.field1817;
        var1.addMouseListener(class78.field1403);
        var1.addMouseMotionListener(class78.field1403);
        var1.addFocusListener(class78.field1403);
        class79 var2;
        try {
            var2 = new class79();
        } catch (Throwable var13) {
            var2 = null;
        }
        Statics.field1659 = var2;
        if (Statics.field1659 != null) {
            Statics.field1659.method1407(Statics.field1817);
        }
        Statics.field59 = new class72(255, class83.field1432, class83.field1433, 500000);
        class30 var4 = null;
        class12 var5 = new class12();
        try {
            var4 = class83.method1635("", Statics.field87.field2102, false);
            byte[] var6 = new byte[(int) var4.method601()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method612(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class12(new class128(var6));
        } catch (Exception var14) {
        }
        try {
            if (var4 != null) {
                var4.method598();
            }
        } catch (Exception var12) {
        }
        Statics.field197 = var5;
        Statics.field1319 = this.getToolkit().getSystemClipboard();
        if (field503 != 0) {
            field515 = true;
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method317() {
        field569++;
        this.method460();
        class160.method159();
        try {
            if (class141.field2377 == 1) {
                int var1 = Statics.field2373.method2775();
                if (var1 > 0 && Statics.field2373.method2781()) {
                    int var2 = var1 - Statics.field1318;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2373.method2826(var2);
                } else {
                    Statics.field2373.method2797();
                    Statics.field2373.method2778();
                    if (Statics.field2378 == null) {
                        class141.field2377 = 0;
                    } else {
                        class141.field2377 = 2;
                    }
                    Statics.field265 = null;
                    Statics.field1225 = null;
                }
            }
        } catch (Exception var120) {
            var120.printStackTrace();
            Statics.field2373.method2797();
            class141.field2377 = 0;
            Statics.field265 = null;
            Statics.field1225 = null;
            Statics.field2378 = null;
        }
        method2231();
        class76 var4 = class76.field1379;
        synchronized (class76.field1379) {
            class76.field1364++;
            class76.field1377 = class76.field1376;
            class76.field1380 = 0;
            if (class76.field1360 >= 0) {
                while (class76.field1371 != class76.field1360) {
                    int var6 = class76.field1370[class76.field1371];
                    class76.field1371 = class76.field1371 + 1 & 0x7F;
                    if (var6 < 0) {
                        class76.field1369[~var6] = false;
                    } else {
                        if (!class76.field1369[var6] && class76.field1380 < class76.field1375.length - 1) {
                            class76.field1375[++class76.field1380 - 1] = var6;
                        }
                        class76.field1369[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class76.field1369[var5] = false;
                }
                class76.field1360 = class76.field1371;
            }
            class76.field1376 = class76.field1378;
        }
        class78 var8 = class78.field1403;
        synchronized (class78.field1403) {
            class78.field1396 = class78.field1391;
            class78.field1397 = class78.field1394;
            class78.field1398 = class78.field1407 * -787770575;
            class78.field1393 = class78.field1399;
            class78.field1404 = class78.field1400;
            class78.field1405 = class78.field1401;
            class78.field1406 = class78.field1402;
            class78.field1399 = 0;
        }
        if (Statics.field1659 != null) {
            int var10 = Statics.field1659.method1413();
            field539 = var10;
        }
        if (field507 == 0) {
            method203();
            class74.method53();
        } else if (field507 == 5) {
            class22.method155(this);
            method203();
            class74.method53();
        } else if (field507 == 10) {
            class22.method155(this);
        } else if (field507 == 20) {
            class22.method155(this);
            method937();
        } else if (field507 == 25) {
            method837();
        }
        if (field507 == 30) {
            if (field691 > 1) {
                field691--;
            }
            if (field714 > 0) {
                field714--;
            }
            if (field525) {
                field525 = false;
                method237();
            } else {
                if (!field639) {
                    field645[0] = class137.field2329;
                    field646[0] = "";
                    field643[0] = 1006;
                    field631 = 1;
                }
                for (int var11 = 0; var11 < 100 && method201(); var11++) {
                }
                if (field507 == 30) {
                    class184.method2725(field543, 39);
                    Object var12 = Statics.field1224.field252;
                    synchronized (Statics.field1224.field252) {
                        if (!field672) {
                            Statics.field1224.field256 = 0;
                        } else if (class78.field1393 != 0 || Statics.field1224.field256 >= 40) {
                            field543.method2333(185);
                            field543.method2634(0);
                            int var13 = field543.field2045;
                            int var14 = 0;
                            for (int var15 = 0; var15 < Statics.field1224.field256 && field543.field2045 - var13 < 240; var15++) {
                                var14++;
                                int var16 = Statics.field1224.field255[var15];
                                if (var16 < 0) {
                                    var16 = 0;
                                } else if (var16 > 502) {
                                    var16 = 502;
                                }
                                int var17 = Statics.field1224.field251[var15];
                                if (var17 < 0) {
                                    var17 = 0;
                                } else if (var17 > 764) {
                                    var17 = 764;
                                }
                                int var18 = var16 * 765 + var17;
                                if (Statics.field1224.field255[var15] == -1 && Statics.field1224.field251[var15] == -1) {
                                    var17 = -1;
                                    var16 = -1;
                                    var18 = 524287;
                                }
                                if (field761 != var17 || field512 != var16) {
                                    int var19 = var17 - field761;
                                    field761 = var17;
                                    int var20 = var16 - field512;
                                    field512 = var16;
                                    if (field652 < 8 && var19 >= -32 && var19 <= 31 && var20 >= -32 && var20 <= 31) {
                                        var19 += 32;
                                        var20 += 32;
                                        field543.method2603((field652 << 12) + (var19 << 6) + var20);
                                        field652 = 0;
                                    } else if (field652 < 8) {
                                        field543.method2486((field652 << 19) + 8388608 + var18);
                                        field652 = 0;
                                    } else {
                                        field543.method2454((field652 << 19) + -1073741824 + var18);
                                        field652 = 0;
                                    }
                                } else if (field652 < 2047) {
                                    field652++;
                                }
                            }
                            field543.method2451(field543.field2045 - var13);
                            if (var14 >= Statics.field1224.field256) {
                                Statics.field1224.field256 = 0;
                            } else {
                                Statics.field1224.field256 -= var14;
                                for (int var21 = 0; var21 < Statics.field1224.field256; var21++) {
                                    Statics.field1224.field251[var21] = Statics.field1224.field251[var14 + var21];
                                    Statics.field1224.field255[var21] = Statics.field1224.field255[var14 + var21];
                                }
                            }
                        }
                    }
                    if (class78.field1393 == 1 || !Statics.field2078 && class78.field1393 == 4 || class78.field1393 == 2) {
                        long var23 = (class78.field1406 - field510) / 50L;
                        if (var23 > 4095L) {
                            var23 = 4095L;
                        }
                        field510 = class78.field1406;
                        int var25 = class78.field1405;
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 > 502) {
                            var25 = 502;
                        }
                        int var26 = class78.field1404;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 764) {
                            var26 = 764;
                        }
                        int var27 = var25 * 765 + var26;
                        byte var28 = 0;
                        if (class78.field1393 == 2) {
                            var28 = 1;
                        }
                        int var29 = (int) var23;
                        field543.method2333(134);
                        field543.method2454((var28 << 19) + (var29 << 20) + var27);
                    }
                    if (class76.field1380 > 0) {
                        field543.method2333(189);
                        field543.method2603(0);
                        int var30 = field543.field2045;
                        long var31 = class122.method37();
                        for (int var33 = 0; var33 < class76.field1380; var33++) {
                            long var34 = var31 - field721;
                            if (var34 > 16777215L) {
                                var34 = 16777215L;
                            }
                            field721 = var31;
                            field543.method2634(class76.field1375[var33]);
                            field543.method2486((int) var34);
                        }
                        field543.method2545(field543.field2045 - var30);
                    }
                    if (field650 > 0) {
                        field650--;
                    }
                    if (class76.field1369[96] || class76.field1369[97] || class76.field1369[98] || class76.field1369[99]) {
                        field588 = true;
                    }
                    if (field588 && field650 <= 0) {
                        field650 = 20;
                        field588 = false;
                        field543.method2333(242);
                        field543.method2603(field581);
                        field543.method2483(field582);
                    }
                    if (Statics.field8 && !field514) {
                        field514 = true;
                        field543.method2333(34);
                        field543.method2634(1);
                    }
                    if (!Statics.field8 && field514) {
                        field514 = false;
                        field543.method2333(34);
                        field543.method2634(0);
                    }
                    method142();
                    if (field507 == 30) {
                        for (class23 var36 = (class23) field563.method3331(); var36 != null; var36 = (class23) field563.method3333()) {
                            if (var36.field381 > 0) {
                                var36.field381--;
                            }
                            if (var36.field381 != 0) {
                                if (var36.field372 > 0) {
                                    var36.field372--;
                                }
                                if (var36.field372 == 0 && var36.field371 >= 1 && var36.field373 >= 1 && var36.field371 <= 102 && var36.field373 <= 102 && (var36.field377 < 0 || class9.method256(var36.field377, var36.field380))) {
                                    method38(var36.field379, var36.field384, var36.field371, var36.field373, var36.field377, var36.field378, var36.field380);
                                    var36.field372 = -1;
                                    if (var36.field377 == var36.field374 && var36.field374 == -1) {
                                        var36.method3366();
                                    } else if (var36.field377 == var36.field374 && var36.field378 == var36.field375 && var36.field380 == var36.field376) {
                                        var36.method3366();
                                    }
                                }
                            } else if (var36.field374 < 0 || class9.method256(var36.field374, var36.field376)) {
                                method38(var36.field379, var36.field384, var36.field371, var36.field373, var36.field374, var36.field375, var36.field376);
                                var36.method3366();
                            }
                        }
                        method26();
                        field544++;
                        if (field544 > 750) {
                            method237();
                        } else {
                            method173();
                            Statics.method202();
                            for (int var37 = -1; var37 < field585; var37++) {
                                int var38;
                                if (var37 == -1) {
                                    var38 = 2047;
                                } else {
                                    var38 = field734[var37];
                                }
                                class3 var39 = field678[var38];
                                if (var39 != null && var39.field452 > 0) {
                                    var39.field452--;
                                    if (var39.field452 == 0) {
                                        var39.field451 = null;
                                    }
                                }
                            }
                            for (int var40 = 0; var40 < field537; var40++) {
                                int var41 = field538[var40];
                                class26 var42 = field536[var41];
                                if (var42 != null && var42.field452 > 0) {
                                    var42.field452--;
                                    if (var42.field452 == 0) {
                                        var42.field451 = null;
                                    }
                                }
                            }
                            field534++;
                            if (field607 != 0) {
                                field647 += 20;
                                if (field647 >= 400) {
                                    field607 = 0;
                                }
                            }
                            if (Statics.field1506 != null) {
                                field668++;
                                if (field668 >= 15) {
                                    method2218(Statics.field1506);
                                    Statics.field1506 = null;
                                }
                            }
                            class161 var43 = Statics.field796;
                            class161 var44 = Statics.field917;
                            Statics.field796 = null;
                            Statics.field917 = null;
                            field741 = null;
                            field676 = false;
                            field673 = false;
                            field742 = 0;
                            while (true) {
                                while (class76.method1483() && field742 < 128) {
                                    if (field718 >= 2 && class76.field1369[82] && Statics.field91 == 66) {
                                        String var45 = "";
                                        for (int var46 = 0; var46 < field620 && var46 < 100; var46++) {
                                            var45 = var45 + field709[var46] + ':' + field664[var46] + '\n';
                                        }
                                        Statics.field1319.setContents(new StringSelection(var45), (ClipboardOwner) null);
                                    } else {
                                        field720[field742] = Statics.field91;
                                        field719[field742] = Statics.field1050;
                                        field742++;
                                    }
                                }
                                Statics.method170(field566, 0, 0, 765, 503, 0, 0);
                                field680++;
                                while (true) {
                                    class1 var47;
                                    class161 var48;
                                    class161 var49;
                                    do {
                                        var47 = (class1) field520.method3329();
                                        if (var47 == null) {
                                            while (true) {
                                                class1 var50;
                                                class161 var51;
                                                class161 var52;
                                                do {
                                                    var50 = (class1) field517.method3329();
                                                    if (var50 == null) {
                                                        while (true) {
                                                            class1 var53;
                                                            class161 var54;
                                                            class161 var55;
                                                            do {
                                                                var53 = (class1) field694.method3329();
                                                                if (var53 == null) {
                                                                    method34();
                                                                    if (Statics.field1290 == null && field535 == null) {
                                                                        int var56 = class78.field1393;
                                                                        if (field639) {
                                                                            if (var56 != 1 && (Statics.field2078 || var56 != 4)) {
                                                                                int var57 = class78.field1397;
                                                                                int var58 = class78.field1398 * -58530351;
                                                                                if (var57 < Statics.field1988 - 10 || var57 > Statics.field509 + Statics.field1988 + 10 || var58 < Statics.field1308 - 10 || var58 > Statics.field272 + Statics.field1308 + 10) {
                                                                                    field639 = false;
                                                                                    method2437(Statics.field1988, Statics.field1308, Statics.field509, Statics.field272);
                                                                                }
                                                                            }
                                                                            if (var56 == 1 || !Statics.field2078 && var56 == 4) {
                                                                                int var59 = Statics.field1988;
                                                                                int var60 = Statics.field1308;
                                                                                int var61 = Statics.field509;
                                                                                int var62 = class78.field1404;
                                                                                int var63 = class78.field1405;
                                                                                int var64 = -1;
                                                                                for (int var65 = 0; var65 < field631; var65++) {
                                                                                    int var66 = (field631 - 1 - var65) * 15 + var60 + 31;
                                                                                    if (var62 > var59 && var62 < var59 + var61 && var63 > var66 - 13 && var63 < var66 + 3) {
                                                                                        var64 = var65;
                                                                                    }
                                                                                }
                                                                                if (var64 != -1 && var64 >= 0) {
                                                                                    int var67 = field641[var64];
                                                                                    int var68 = field642[var64];
                                                                                    int var69 = field643[var64];
                                                                                    int var70 = field679[var64];
                                                                                    String var71 = field645[var64];
                                                                                    String var72 = field646[var64];
                                                                                    method2316(var67, var68, var69, var70, var71, var72, class78.field1404, class78.field1405);
                                                                                }
                                                                                field639 = false;
                                                                                method2437(Statics.field1988, Statics.field1308, Statics.field509, Statics.field272);
                                                                            }
                                                                        } else {
                                                                            label1174: {
                                                                                int var74;
                                                                                int var75;
                                                                                label1218: {
                                                                                    if ((var56 == 1 || !Statics.field2078 && var56 == 4) && field631 > 0) {
                                                                                        int var73 = field643[field631 - 1];
                                                                                        if (var73 == 39 || var73 == 40 || var73 == 41 || var73 == 42 || var73 == 43 || var73 == 33 || var73 == 34 || var73 == 35 || var73 == 36 || var73 == 37 || var73 == 38 || var73 == 1005) {
                                                                                            var74 = field641[field631 - 1];
                                                                                            var75 = field642[field631 - 1];
                                                                                            class161 var76 = class161.method2772(var75);
                                                                                            int var77 = Statics.method129(var76);
                                                                                            boolean var78 = (var77 >> 28 & 0x1) != 0;
                                                                                            if (var78) {
                                                                                                break label1218;
                                                                                            }
                                                                                            class165 var10000 = (class165) null;
                                                                                            if (class165.method2957(Statics.method129(var76))) {
                                                                                                break label1218;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if ((var56 == 1 || !Statics.field2078 && var56 == 4) && (field638 == 1 && field631 > 2 || method772(field631 - 1))) {
                                                                                        var56 = 2;
                                                                                    }
                                                                                    if ((var56 == 1 || !Statics.field2078 && var56 == 4) && field631 > 0) {
                                                                                        int var79 = field631 - 1;
                                                                                        if (var79 >= 0) {
                                                                                            int var80 = field641[var79];
                                                                                            int var81 = field642[var79];
                                                                                            int var82 = field643[var79];
                                                                                            int var83 = field679[var79];
                                                                                            String var84 = field645[var79];
                                                                                            String var85 = field646[var79];
                                                                                            method2316(var80, var81, var82, var83, var84, var85, class78.field1404, class78.field1405);
                                                                                        }
                                                                                    }
                                                                                    if (var56 == 2 && field631 > 0) {
                                                                                        method2043(class78.field1404, class78.field1405);
                                                                                    }
                                                                                    break label1174;
                                                                                }
                                                                                if (Statics.field1290 != null && !field519 && field638 != 1 && !method772(field631 - 1) && field631 > 0) {
                                                                                    method228(field551, field612);
                                                                                }
                                                                                field519 = false;
                                                                                field667 = 0;
                                                                                if (Statics.field1290 != null) {
                                                                                    method2218(Statics.field1290);
                                                                                }
                                                                                Statics.field1290 = class161.method2772(var75);
                                                                                field610 = var74;
                                                                                field551 = class78.field1404;
                                                                                field612 = class78.field1405;
                                                                                if (field631 > 0) {
                                                                                    method236(field631 - 1);
                                                                                }
                                                                                method2218(Statics.field1290);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (field535 != null) {
                                                                        method2219();
                                                                    }
                                                                    if (Statics.field1290 != null) {
                                                                        method2218(Statics.field1290);
                                                                        field667++;
                                                                        if (class78.field1396 == 0) {
                                                                            if (field519) {
                                                                                if (Statics.field2000 == Statics.field1290 && field613 != field610) {
                                                                                    class161 var86 = Statics.field1290;
                                                                                    byte var87 = 0;
                                                                                    if (field657 == 1 && var86.field2630 == 206) {
                                                                                        var87 = 1;
                                                                                    }
                                                                                    if (var86.field2742[field613] <= 0) {
                                                                                        var87 = 0;
                                                                                    }
                                                                                    if (class165.method2957(Statics.method129(var86))) {
                                                                                        int var88 = field610;
                                                                                        int var89 = field613;
                                                                                        var86.field2742[var89] = var86.field2742[var88];
                                                                                        var86.field2729[var89] = var86.field2729[var88];
                                                                                        var86.field2742[var88] = -1;
                                                                                        var86.field2729[var88] = 0;
                                                                                    } else if (var87 == 1) {
                                                                                        int var90 = field610;
                                                                                        int var91 = field613;
                                                                                        while (var90 != var91) {
                                                                                            if (var90 > var91) {
                                                                                                var86.method3142(var90 - 1, var90);
                                                                                                var90--;
                                                                                            } else if (var90 < var91) {
                                                                                                var86.method3142(var90 + 1, var90);
                                                                                                var90++;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var86.method3142(field613, field610);
                                                                                    }
                                                                                    field543.method2333(148);
                                                                                    field543.method2475(var87);
                                                                                    field543.method2543(Statics.field1290.field2626);
                                                                                    field543.method2483(field613);
                                                                                    field543.method2484(field610);
                                                                                }
                                                                            } else if ((field638 == 1 || method772(field631 - 1)) && field631 > 2) {
                                                                                method2043(field551, field612);
                                                                            } else if (field631 > 0) {
                                                                                method228(field551, field612);
                                                                            }
                                                                            field668 = 10;
                                                                            class78.field1393 = 0;
                                                                            Statics.field1290 = null;
                                                                        } else if (field667 >= 5 && (class78.field1397 > field551 + 5 || class78.field1397 < field551 - 5 || class78.field1398 * -58530351 > field612 + 5 || class78.field1398 * -58530351 < field612 - 5)) {
                                                                            field519 = true;
                                                                        }
                                                                    }
                                                                    if (class96.field1561 != -1) {
                                                                        int var92 = class96.field1561;
                                                                        int var93 = class96.field1585;
                                                                        field543.method2333(50);
                                                                        field543.method2634(5);
                                                                        field543.method2484(Statics.field949 + var92);
                                                                        field543.method2475(class76.field1369[82] ? (class76.field1369[81] ? 2 : 1) : 0);
                                                                        field543.method2484(Statics.field2063 + var93);
                                                                        class96.field1561 = -1;
                                                                        field604 = class78.field1404;
                                                                        field605 = class78.field1405;
                                                                        field607 = 1;
                                                                        field647 = 0;
                                                                        field711 = var92;
                                                                        field730 = var93;
                                                                    }
                                                                    if (Statics.field796 != var43) {
                                                                        if (var43 != null) {
                                                                            method2218(var43);
                                                                        }
                                                                        if (Statics.field796 != null) {
                                                                            method2218(Statics.field796);
                                                                        }
                                                                    }
                                                                    if (Statics.field917 != var44 && field649 == field529) {
                                                                        if (var44 != null) {
                                                                            method2218(var44);
                                                                        }
                                                                        if (Statics.field917 != null) {
                                                                            method2218(Statics.field917);
                                                                        }
                                                                    }
                                                                    if (Statics.field917 == null) {
                                                                        if (field649 > 0) {
                                                                            field649--;
                                                                        }
                                                                    } else if (field649 < field529) {
                                                                        field649++;
                                                                        if (field649 == field529) {
                                                                            method2218(Statics.field917);
                                                                        }
                                                                    }
                                                                    int var94 = field561 + Statics.field1383.field443;
                                                                    int var95 = field626 + Statics.field1383.field439;
                                                                    if (Statics.field2010 - var94 < -500 || Statics.field2010 - var94 > 500 || Statics.field1373 - var95 < -500 || Statics.field1373 - var95 > 500) {
                                                                        Statics.field2010 = var94;
                                                                        Statics.field1373 = var95;
                                                                    }
                                                                    if (Statics.field2010 != var94) {
                                                                        Statics.field2010 += (var94 - Statics.field2010) / 16;
                                                                    }
                                                                    if (Statics.field1373 != var95) {
                                                                        Statics.field1373 += (var95 - Statics.field1373) / 16;
                                                                    }
                                                                    if (class78.field1396 == 4 && Statics.field2078) {
                                                                        int var96 = class78.field1398 * -58530351 - field586 * -58530351;
                                                                        field615 = var96 * 2;
                                                                        field586 = (var96 == -1 || var96 == 1 ? class78.field1398 * -58530351 : (field586 * -58530351 + class78.field1398 * -58530351) / 2) * -787770575;
                                                                        int var97 = field637 - class78.field1397;
                                                                        field583 = var97 * 2;
                                                                        field637 = var97 == -1 || var97 == 1 ? class78.field1397 : (field637 + class78.field1397) / 2;
                                                                    } else {
                                                                        if (class76.field1369[96]) {
                                                                            field583 += (-24 - field583) / 2;
                                                                        } else if (class76.field1369[97]) {
                                                                            field583 += (24 - field583) / 2;
                                                                        } else {
                                                                            field583 /= 2;
                                                                        }
                                                                        if (class76.field1369[98]) {
                                                                            field615 += (12 - field615) / 2;
                                                                        } else if (class76.field1369[99]) {
                                                                            field615 += (-12 - field615) / 2;
                                                                        } else {
                                                                            field615 /= 2;
                                                                        }
                                                                        field586 = class78.field1398;
                                                                        field637 = class78.field1397;
                                                                    }
                                                                    field582 = field583 / 2 + field582 & 0x7FF;
                                                                    field581 += field615 / 2;
                                                                    if (field581 < 128) {
                                                                        field581 = 128;
                                                                    }
                                                                    if (field581 > 383) {
                                                                        field581 = 383;
                                                                    }
                                                                    int var98 = Statics.field2010 >> 7;
                                                                    int var99 = Statics.field1373 >> 7;
                                                                    int var100 = method1541(Statics.field2010, Statics.field1373, Statics.field2001);
                                                                    int var101 = 0;
                                                                    if (var98 > 3 && var99 > 3 && var98 < 100 && var99 < 100) {
                                                                        for (int var102 = var98 - 4; var102 <= var98 + 4; var102++) {
                                                                            for (int var103 = var99 - 4; var103 <= var99 + 4; var103++) {
                                                                                int var104 = Statics.field2001;
                                                                                if (var104 < 3 && (class9.field133[1][var102][var103] & 0x2) == 2) {
                                                                                    var104++;
                                                                                }
                                                                                int var105 = var100 - class9.field153[var104][var102][var103];
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
                                                                    if (var106 > field589) {
                                                                        field589 += (var106 - field589) / 24;
                                                                    } else if (var106 < field589) {
                                                                        field589 += (var106 - field589) / 80;
                                                                    }
                                                                    if (field576) {
                                                                        method171();
                                                                    }
                                                                    for (int var107 = 0; var107 < 5; var107++) {
                                                                        int var10002 = field622[var107]++;
                                                                    }
                                                                    int var108 = ++class78.field1392 - 1;
                                                                    int var110 = class76.field1364;
                                                                    if (var108 > 15000 && var110 > 15000) {
                                                                        field714 = 250;
                                                                        class78.field1392 = 14500;
                                                                        field543.method2333(138);
                                                                    }
                                                                    field567++;
                                                                    if (field567 > 500) {
                                                                        field567 = 0;
                                                                        int var112 = (int) (Math.random() * 8.0D);
                                                                        if ((var112 & 0x1) == 1) {
                                                                            field561 += field562;
                                                                        }
                                                                        if ((var112 & 0x2) == 2) {
                                                                            field626 += field686;
                                                                        }
                                                                        if ((var112 & 0x4) == 4) {
                                                                            field695 += field609;
                                                                        }
                                                                    }
                                                                    if (field561 < -50) {
                                                                        field562 = 2;
                                                                    }
                                                                    if (field561 > 50) {
                                                                        field562 = -2;
                                                                    }
                                                                    if (field626 < -55) {
                                                                        field686 = 2;
                                                                    }
                                                                    if (field626 > 55) {
                                                                        field686 = -2;
                                                                    }
                                                                    if (field695 < -40) {
                                                                        field609 = 1;
                                                                    }
                                                                    if (field695 > 40) {
                                                                        field609 = -1;
                                                                    }
                                                                    field572++;
                                                                    if (field572 > 500) {
                                                                        field572 = 0;
                                                                        int var113 = (int) (Math.random() * 8.0D);
                                                                        if ((var113 & 0x1) == 1) {
                                                                            field568 += field655;
                                                                        }
                                                                        if ((var113 & 0x2) == 2) {
                                                                            field570 += field571;
                                                                        }
                                                                    }
                                                                    if (field568 < -60) {
                                                                        field655 = 2;
                                                                    }
                                                                    if (field568 > 60) {
                                                                        field655 = -2;
                                                                    }
                                                                    if (field570 < -20) {
                                                                        field571 = 1;
                                                                    }
                                                                    if (field570 > 10) {
                                                                        field571 = -1;
                                                                    }
                                                                    for (class29 var114 = (class29) field752.method3296(); var114 != null; var114 = (class29) field752.method3295()) {
                                                                        if ((long) var114.field769 < class122.method37() / 1000L - 5L) {
                                                                            if (var114.field764 > 0) {
                                                                                method1883(5, "", var114.field765 + class137.field2108);
                                                                            }
                                                                            if (var114.field764 == 0) {
                                                                                method1883(5, "", var114.field765 + class137.field2244);
                                                                            }
                                                                            var114.method3363();
                                                                        }
                                                                    }
                                                                    field545++;
                                                                    if (field545 > 50) {
                                                                        field543.method2333(253);
                                                                    }
                                                                    try {
                                                                        if (Statics.field2086 != null && field543.field2045 > 0) {
                                                                            Statics.field2086.method1437(field543.field2043, 0, field543.field2045);
                                                                            field543.field2045 = 0;
                                                                            field545 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var116) {
                                                                        method237();
                                                                    }
                                                                    return;
                                                                }
                                                                var54 = var53.field1;
                                                                if (var54.field2696 < 0) {
                                                                    break;
                                                                }
                                                                var55 = class161.method2772(var54.field2637);
                                                            } while (var55 == null || var55.field2734 == null || var54.field2696 >= var55.field2734.length || var55.field2734[var54.field2696] != var54);
                                                            class27.method865(var53);
                                                        }
                                                    }
                                                    var51 = var50.field1;
                                                    if (var51.field2696 < 0) {
                                                        break;
                                                    }
                                                    var52 = class161.method2772(var51.field2637);
                                                } while (var52 == null || var52.field2734 == null || var51.field2696 >= var52.field2734.length || var52.field2734[var51.field2696] != var51);
                                                class27.method865(var50);
                                            }
                                        }
                                        var48 = var47.field1;
                                        if (var48.field2696 < 0) {
                                            break;
                                        }
                                        var49 = class161.method2772(var48.field2637);
                                    } while (var49 == null || var49.field2734 == null || var48.field2696 >= var49.field2734.length || var49.field2734[var48.field2696] != var48);
                                    class27.method865(var47);
                                }
                            }
                        }
                    }
                }
            }
        } else if (field507 == 40 || field507 == 45) {
            method937();
        }
    }

    @ObfuscatedName("client.a(I)V")
    public final void method291() {
        boolean var1;
        label153: {
            try {
                if (class141.field2377 == 2) {
                    if (Statics.field265 == null) {
                        Statics.field265 = class142.method2748(Statics.field2378, Statics.field2374, Statics.field1934);
                        if (Statics.field265 == null) {
                            var1 = false;
                            break label153;
                        }
                    }
                    if (Statics.field1225 == null) {
                        Statics.field1225 = new class59(Statics.field2382, Statics.field2375);
                    }
                    if (Statics.field2373.method2776(Statics.field265, Statics.field2381, Statics.field1225, 22050)) {
                        Statics.field2373.method2777();
                        Statics.field2373.method2826(Statics.field2380);
                        Statics.field2373.method2779(Statics.field265, Statics.field80);
                        class141.field2377 = 0;
                        Statics.field265 = null;
                        Statics.field1225 = null;
                        Statics.field2378 = null;
                        var1 = true;
                        break label153;
                    }
                }
            } catch (Exception var27) {
                var27.printStackTrace();
                Statics.field2373.method2797();
                class141.field2377 = 0;
                Statics.field265 = null;
                Statics.field1225 = null;
                Statics.field2378 = null;
            }
            var1 = false;
        }
        if (var1 && field640 && Statics.field1797 != null) {
            Statics.field1797.method1233();
        }
        if (field1340) {
            class76.method1428(Statics.field1817);
            Canvas var4 = Statics.field1817;
            var4.removeMouseListener(class78.field1403);
            var4.removeMouseMotionListener(class78.field1403);
            var4.removeFocusListener(class78.field1403);
            class78.field1391 = 0;
            if (Statics.field1659 != null) {
                Statics.field1659.method1408(Statics.field1817);
            }
            this.method1472();
            class76.method284(Statics.field1817);
            Canvas var5 = Statics.field1817;
            var5.addMouseListener(class78.field1403);
            var5.addMouseMotionListener(class78.field1403);
            var5.addFocusListener(class78.field1403);
            if (Statics.field1659 != null) {
                Statics.field1659.method1407(Statics.field1817);
            }
        }
        if (field507 == 0) {
            int var6 = class22.field349;
            String var7 = class22.field332;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field1817.getGraphics();
                if (Statics.field259 == null) {
                    Statics.field259 = new Font("Helvetica", 1, 13);
                    Statics.field62 = Statics.field1817.getFontMetrics(Statics.field259);
                }
                if (field1343) {
                    field1343 = false;
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field2510, Statics.field368);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field2369 == null) {
                        Statics.field2369 = Statics.field1817.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field2369.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field259);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field62.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field2369, Statics.field2510 / 2 - 152, Statics.field368 / 2 - 18, (ImageObserver) null);
                } catch (Exception var23) {
                    int var12 = Statics.field2510 / 2 - 152;
                    int var13 = Statics.field368 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field259);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field62.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var24) {
                Statics.field1817.repaint();
            }
        } else if (field507 == 5) {
            class22.method1446(Statics.field1787, Statics.field310);
        } else if (field507 == 10) {
            class22.method1446(Statics.field1787, Statics.field310);
        } else if (field507 == 20) {
            class22.method1446(Statics.field1787, Statics.field310);
        } else if (field507 == 25) {
            if (field556 == 1) {
                if (field552 > field611) {
                    field611 = field552;
                }
                int var15 = (field611 * 50 - field552 * 50) / field611;
                method2128(class137.field2114 + class2.field21 + class2.field27 + var15 + "%" + class2.field25, false);
            } else if (field556 == 2) {
                if (field554 > field555) {
                    field555 = field554;
                }
                int var16 = (field555 * 50 - field554 * 50) / field555 + 50;
                method2128(class137.field2114 + class2.field21 + class2.field27 + var16 + "%" + class2.field25, false);
            } else {
                method2128(class137.field2114, false);
            }
        } else if (field507 == 30) {
            method2714();
        } else if (field507 == 40) {
            method2128(class137.field2115 + class2.field21 + class137.field2303, false);
        } else if (field507 == 45) {
            method2128(class137.field2331, false);
        }
        if (field507 == 30 && field726 == 0 && !field1343) {
            try {
                Graphics var17 = Statics.field1817.getGraphics();
                for (int var18 = 0; var18 < field698; var18++) {
                    if (field701[var18]) {
                        Statics.field313.method1647(var17, field760[var18], field704[var18], field705[var18], field706[var18]);
                        field701[var18] = false;
                    }
                }
            } catch (Exception var26) {
                Statics.field1817.repaint();
            }
        } else if (field507 > 0) {
            try {
                Graphics var20 = Statics.field1817.getGraphics();
                Statics.field313.method1648(var20, 0, 0);
                field1343 = false;
                for (int var21 = 0; var21 < field698; var21++) {
                    field701[var21] = false;
                }
            } catch (Exception var25) {
                Statics.field1817.repaint();
            }
        }
    }

    @ObfuscatedName("client.d(I)V")
    public final void method292() {
        if (Statics.field1224 != null) {
            Statics.field1224.field254 = false;
        }
        Statics.field1224 = null;
        if (Statics.field2086 != null) {
            Statics.field2086.method1434();
            Statics.field2086 = null;
        }
        if (class76.field1379 != null) {
            class76 var1 = class76.field1379;
            synchronized (class76.field1379) {
                class76.field1379 = null;
            }
        }
        if (class78.field1403 != null) {
            class78 var3 = class78.field1403;
            synchronized (class78.field1403) {
                class78.field1403 = null;
            }
        }
        Statics.field1659 = null;
        if (Statics.field1797 != null) {
            Statics.field1797.method1196();
        }
        if (Statics.field959 != null) {
            Statics.field959.method1196();
        }
        if (Statics.field2577 != null) {
            Statics.field2577.method1434();
        }
        Object var5 = class160.field2610;
        synchronized (class160.field2610) {
            if (class160.field2607 != 0) {
                class160.field2607 = 1;
                try {
                    class160.field2610.wait();
                } catch (InterruptedException var10) {
                }
            }
        }
        try {
            class83.field1432.method615();
            for (int var8 = 0; var8 < Statics.field1430; var8++) {
                Statics.field125[var8].method615();
            }
            class83.field1433.method615();
            class83.field1431.method615();
        } catch (Exception var13) {
        }
    }

    @ObfuscatedName("eu.u(IB)V")
    public static void method2989(int arg0) {
        if (field507 == arg0) {
            return;
        }
        if (field507 == 0) {
            Statics.field2369 = null;
            Statics.field259 = null;
            Statics.field62 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field531 = 0;
            field702 = 0;
            field533 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field401 != null) {
            Statics.field401.method1434();
            Statics.field401 = null;
        }
        if (field507 == 25) {
            field556 = 0;
            field552 = 0;
            field611 = 1;
            field554 = 0;
            field555 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field1817;
            class157 var2 = Statics.field235;
            class157 var3 = Statics.field395;
            if (!Statics.field365) {
                class90.method1826();
                byte[] var4 = var2.method3064("title.jpg", "");
                Statics.field65 = new class87(var4, var1);
                Statics.field333 = Statics.field65.method1727();
                Statics.field360 = class85.method52(var3, "logo", "");
                Statics.field330 = class85.method52(var3, "titlebox", "");
                Statics.field367 = class85.method52(var3, "titlebutton", "");
                Statics.field343 = class85.method253(var3, "runes", "");
                Statics.field335 = class85.method253(var3, "title_mute", "");
                Statics.field358 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field358[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field358[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field358[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field358[var8 + 192] = 16777215;
                }
                Statics.field341 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field341[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field341[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field341[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field341[var12 + 192] = 16777215;
                }
                Statics.field370 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field370[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field370[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field370[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field370[var16 + 192] = 16777215;
                }
                Statics.field1674 = new int[256];
                Statics.field253 = new int[32768];
                Statics.field193 = new int[32768];
                class22.method36((class88) null);
                Statics.field976 = new int[32768];
                Statics.field344 = new int[32768];
                class22.field351 = 0;
                class22.field355 = "";
                class22.field357 = "";
                class22.field359 = false;
                if (Statics.field197.field196) {
                    class141.method2315(2);
                } else {
                    class157 var17 = Statics.field97;
                    int var18 = var17.method3035("scape main");
                    int var19 = var17.method3036(var18, "");
                    class141.method3256(2, var17, var18, var19, 255, false);
                }
                class156.method3257(false);
                Statics.field365 = true;
                Statics.field65.method1736(0, 0);
                Statics.field333.method1736(382, 0);
                Statics.field360.method1811(382 - Statics.field360.field1473 / 2, 18);
            }
        } else if (Statics.field365) {
            Statics.field330 = null;
            Statics.field367 = null;
            Statics.field343 = null;
            Statics.field65 = null;
            Statics.field333 = null;
            Statics.field360 = null;
            Statics.field335 = null;
            Statics.field334 = null;
            Statics.field2857 = null;
            Statics.field2379 = null;
            Statics.field123 = null;
            Statics.field992 = null;
            Statics.field358 = null;
            Statics.field341 = null;
            Statics.field370 = null;
            Statics.field1674 = null;
            Statics.field253 = null;
            Statics.field193 = null;
            Statics.field976 = null;
            Statics.field344 = null;
            class141.method2315(2);
            class156.method3257(true);
            Statics.field365 = false;
        }
        field507 = arg0;
    }

    @ObfuscatedName("client.p(I)V")
    public void method460() {
        if (field507 == 1000) {
            return;
        }
        long var1 = class122.method37();
        int var3 = (int) (var1 - Statics.field2580);
        Statics.field2580 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class156.field2565 += var3;
        boolean var4;
        if (class156.field2575 == 0 && class156.field2570 == 0 && class156.field2573 == 0 && class156.field2579 == 0) {
            var4 = true;
        } else if (Statics.field2577 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class156.field2565 > 30000) {
                        throw new IOException();
                    }
                    while (class156.field2570 < 20 && class156.field2579 > 0) {
                        class158 var5 = (class158) class156.field2567.method3313();
                        class128 var6 = new class128(4);
                        var6.method2634(1);
                        var6.method2486((int) var5.field2839);
                        Statics.field2577.method1437(var6.field2043, 0, 4);
                        class156.field2569.method3311(var5, var5.field2839);
                        class156.field2579--;
                        class156.field2570++;
                    }
                    while (class156.field2575 < 20 && class156.field2573 > 0) {
                        class158 var7 = (class158) class156.field2571.method3293();
                        class128 var8 = new class128(4);
                        var8.method2634(0);
                        var8.method2486((int) var7.field2839);
                        Statics.field2577.method1437(var8.field2043, 0, 4);
                        var7.method3306();
                        class156.field2574.method3311(var7, var7.field2839);
                        class156.field2573--;
                        class156.field2575++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2577.method1435();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class156.field2565 = 0;
                        byte var11 = 0;
                        if (Statics.field281 == null) {
                            var11 = 8;
                        } else if (class156.field2578 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class156.field2576.field2045;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2577.method1453(class156.field2576.field2043, class156.field2576.field2045, var12);
                            if (class156.field2582 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class156.field2576.field2043[class156.field2576.field2045 + var13] ^= class156.field2582;
                                }
                            }
                            class156.field2576.field2045 += var12;
                            if (class156.field2576.field2045 < var11) {
                                break;
                            }
                            if (Statics.field281 == null) {
                                class156.field2576.field2045 = 0;
                                int var14 = class156.field2576.method2548();
                                int var15 = class156.field2576.method2456();
                                int var16 = class156.field2576.method2548();
                                int var17 = class156.field2576.method2592();
                                long var18 = (long) ((var14 << 16) + var15);
                                class158 var20 = (class158) class156.field2569.method3314(var18);
                                Statics.field1508 = true;
                                if (var20 == null) {
                                    var20 = (class158) class156.field2574.method3314(var18);
                                    Statics.field1508 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field281 = var20;
                                Statics.field2572 = new class128(var17 + var21 + Statics.field281.field2600);
                                Statics.field2572.method2634(var16);
                                Statics.field2572.method2454(var17);
                                class156.field2578 = 8;
                                class156.field2576.field2045 = 0;
                            } else if (class156.field2578 == 0) {
                                if (class156.field2576.field2043[0] == -1) {
                                    class156.field2578 = 1;
                                    class156.field2576.field2045 = 0;
                                } else {
                                    Statics.field281 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2572.field2043.length - Statics.field281.field2600;
                            int var23 = 512 - class156.field2578;
                            if (var23 > var22 - Statics.field2572.field2045) {
                                var23 = var22 - Statics.field2572.field2045;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2577.method1453(Statics.field2572.field2043, Statics.field2572.field2045, var23);
                            if (class156.field2582 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2572.field2043[Statics.field2572.field2045 + var24] ^= class156.field2582;
                                }
                            }
                            Statics.field2572.field2045 += var23;
                            class156.field2578 += var23;
                            if (Statics.field2572.field2045 == var22) {
                                if (Statics.field281.field2839 == 16711935L) {
                                    Statics.field979 = Statics.field2572;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class157 var26 = class156.field2581[var25];
                                        if (var26 != null) {
                                            Statics.field979.field2045 = var25 * 8 + 5;
                                            int var27 = Statics.field979.method2592();
                                            int var28 = Statics.field979.method2592();
                                            var26.method3100(var27, var28);
                                        }
                                    }
                                } else {
                                    class156.field2586.reset();
                                    class156.field2586.update(Statics.field2572.field2043, 0, var22);
                                    int var29 = (int) class156.field2586.getValue();
                                    if (Statics.field281.field2601 != var29) {
                                        try {
                                            Statics.field2577.method1434();
                                        } catch (Exception var35) {
                                        }
                                        class156.field2583++;
                                        Statics.field2577 = null;
                                        class156.field2582 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class156.field2583 = 0;
                                    class156.field2584 = 0;
                                    Statics.field281.field2598.method3101((int) (Statics.field281.field2839 & 0xFFFFL), Statics.field2572.field2043, (Statics.field281.field2839 & 0xFF0000L) == 16711680L, Statics.field1508);
                                }
                                Statics.field281.method3366();
                                if (Statics.field1508) {
                                    class156.field2570--;
                                } else {
                                    class156.field2575--;
                                }
                                class156.field2578 = 0;
                                Statics.field281 = null;
                                Statics.field2572 = null;
                            } else {
                                if (class156.field2578 != 512) {
                                    break;
                                }
                                class156.field2578 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2577.method1434();
                } catch (Exception var34) {
                }
                class156.field2584++;
                Statics.field2577 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method294();
        }
    }

    @ObfuscatedName("client.t(I)V")
    public void method294() {
        if (class156.field2583 >= 4) {
            this.method1482("js5crc");
            field507 = 1000;
            return;
        }
        if (class156.field2584 >= 4) {
            if (field507 <= 5) {
                this.method1482("js5io");
                field507 = 1000;
                return;
            }
            field528 = 3000;
            class156.field2584 = 3;
        }
        if (--field528 + 1 > 0) {
            return;
        }
        try {
            if (field527 == 0) {
                Statics.field214 = Statics.field200.method1555(Statics.field1658, Statics.field513);
                field527++;
            }
            if (field527 == 1) {
                if (Statics.field214.field1413 == 2) {
                    this.method295(-1);
                    return;
                }
                if (Statics.field214.field1413 == 1) {
                    field527++;
                }
            }
            if (field527 == 2) {
                Statics.field2012 = new class71((Socket) Statics.field214.field1417, Statics.field200);
                class128 var1 = new class128(5);
                var1.method2634(15);
                var1.method2454(44);
                Statics.field2012.method1437(var1.field2043, 0, 5);
                field527++;
                Statics.field2002 = class122.method37();
            }
            if (field527 == 3) {
                if (field507 <= 5 || Statics.field2012.method1435() > 0) {
                    int var2 = Statics.field2012.method1436();
                    if (var2 != 0) {
                        this.method295(var2);
                        return;
                    }
                    field527++;
                } else if (class122.method37() - Statics.field2002 > 30000L) {
                    this.method295(-2);
                    return;
                }
            }
            if (field527 == 4) {
                class71 var3 = Statics.field2012;
                boolean var4 = field507 > 20;
                if (Statics.field2577 != null) {
                    try {
                        Statics.field2577.method1434();
                    } catch (Exception var14) {
                    }
                    Statics.field2577 = null;
                }
                Statics.field2577 = var3;
                class156.method3257(var4);
                class156.field2576.field2045 = 0;
                Statics.field281 = null;
                Statics.field2572 = null;
                class156.field2578 = 0;
                while (true) {
                    class158 var6 = (class158) class156.field2569.method3313();
                    if (var6 == null) {
                        while (true) {
                            class158 var7 = (class158) class156.field2574.method3313();
                            if (var7 == null) {
                                if (class156.field2582 != 0) {
                                    try {
                                        class128 var8 = new class128(4);
                                        var8.method2634(4);
                                        var8.method2634(class156.field2582);
                                        var8.method2603(0);
                                        Statics.field2577.method1437(var8.field2043, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2577.method1434();
                                        } catch (Exception var12) {
                                        }
                                        class156.field2584++;
                                        Statics.field2577 = null;
                                    }
                                }
                                class156.field2565 = 0;
                                Statics.field2580 = class122.method37();
                                Statics.field214 = null;
                                Statics.field2012 = null;
                                field527 = 0;
                                field636 = 0;
                                return;
                            }
                            class156.field2571.method3276(var7);
                            class156.field2568.method3311(var7, var7.field2839);
                            class156.field2573++;
                            class156.field2575--;
                        }
                    }
                    class156.field2567.method3311(var6, var6.field2839);
                    class156.field2579++;
                    class156.field2570--;
                }
            }
        } catch (IOException var15) {
            this.method295(-3);
        }
    }

    @ObfuscatedName("client.g(IB)V")
    public void method295(int arg0) {
        Statics.field214 = null;
        Statics.field2012 = null;
        field527 = 0;
        if (Statics.field513 == Statics.field2445) {
            Statics.field513 = Statics.field2792;
        } else {
            Statics.field513 = Statics.field2445;
        }
        field636++;
        if (field636 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field507 <= 5) {
                this.method1482("js5connect_full");
                field507 = 1000;
            } else {
                field528 = 3000;
            }
        } else if (field636 >= 2 && arg0 == 6) {
            this.method1482("js5connect_outofdate");
            field507 = 1000;
        } else if (field636 >= 4) {
            if (field507 <= 5) {
                this.method1482("js5connect");
                field507 = 1000;
            } else {
                field528 = 3000;
            }
        }
    }

    @ObfuscatedName("y.o(I)V")
    public static void method203() {
        if (field526 == 0) {
            Statics.field29 = new class96(4, 104, 104, class9.field153);
            for (int var0 = 0; var0 < 4; var0++) {
                field557[var0] = new class131(104, 104);
            }
            Statics.field2808 = new class87(512, 512);
            class22.field332 = class137.field2117;
            class22.field349 = 5;
            field526 = 20;
        } else if (field526 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class105.field1755[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class96.method2009(var1, 500, 800, 512, 334);
            class22.field332 = class137.field2277;
            class22.field349 = 10;
            field526 = 30;
        } else if (field526 == 30) {
            Statics.field1345 = method2438(0, false, true, true);
            Statics.field500 = method2438(1, false, true, true);
            Statics.field1822 = method2438(2, true, false, true);
            Statics.field1650 = method2438(3, false, true, true);
            Statics.field404 = method2438(4, false, true, true);
            Statics.field1648 = method2438(5, true, true, true);
            Statics.field97 = method2438(6, true, true, false);
            Statics.field105 = method2438(7, false, true, true);
            Statics.field395 = method2438(8, false, true, true);
            Statics.field606 = method2438(9, false, true, true);
            Statics.field235 = method2438(10, false, true, true);
            Statics.field2756 = method2438(11, false, true, true);
            Statics.field1615 = method2438(12, false, true, true);
            Statics.field212 = method2438(13, true, false, true);
            Statics.field1278 = method2438(14, false, true, false);
            Statics.field1621 = method2438(15, false, true, true);
            class22.field332 = class137.field2119;
            class22.field349 = 20;
            field526 = 40;
        } else if (field526 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1345.method3125() * 4 / 100;
            int var8 = var7 + Statics.field500.method3125() * 4 / 100;
            int var9 = var8 + Statics.field1822.method3125() * 2 / 100;
            int var10 = var9 + Statics.field1650.method3125() * 2 / 100;
            int var11 = var10 + Statics.field404.method3125() * 6 / 100;
            int var12 = var11 + Statics.field1648.method3125() * 4 / 100;
            int var13 = var12 + Statics.field97.method3125() * 2 / 100;
            int var14 = var13 + Statics.field105.method3125() * 60 / 100;
            int var15 = var14 + Statics.field395.method3125() * 2 / 100;
            int var16 = var15 + Statics.field606.method3125() * 2 / 100;
            int var17 = var16 + Statics.field235.method3125() * 2 / 100;
            int var18 = var17 + Statics.field2756.method3125() * 2 / 100;
            int var19 = var18 + Statics.field1615.method3125() * 2 / 100;
            int var20 = var19 + Statics.field212.method3125() * 2 / 100;
            int var21 = var20 + Statics.field1278.method3125() * 2 / 100;
            int var22 = var21 + Statics.field1621.method3125() * 2 / 100;
            if (var22 == 100) {
                class22.field332 = class137.field2121;
                class22.field349 = 30;
                field526 = 45;
            } else {
                if (var22 != 0) {
                    class22.field332 = class137.field2120 + var22 + "%";
                }
                class22.field349 = 30;
            }
        } else if (field526 == 45) {
            class53.method3127(22050, !field505, 2);
            class144 var23 = new class144();
            var23.method2782(9, 128);
            Statics.field1797 = class53.method175(Statics.field200, Statics.field1817, 0, 22050);
            Statics.field1797.method1205(var23);
            class157 var24 = Statics.field1621;
            class157 var25 = Statics.field1278;
            class157 var26 = Statics.field404;
            Statics.field2381 = var24;
            Statics.field2375 = var25;
            Statics.field2382 = var26;
            Statics.field2373 = var23;
            Statics.field959 = class53.method175(Statics.field200, Statics.field1817, 1, 2048);
            Statics.field1048 = new class47();
            Statics.field959.method1205(Statics.field1048);
            Statics.field907 = new class63(22050, Statics.field1126);
            class22.field332 = class137.field2122;
            class22.field349 = 35;
            field526 = 50;
        } else if (field526 == 50) {
            int var27 = 0;
            if (Statics.field310 == null) {
                class157 var28 = Statics.field395;
                class157 var29 = Statics.field212;
                int var30 = var28.method3035("p11_full");
                int var31 = var28.method3036(var30, "");
                class185 var32;
                if (Statics.method926(var28, var30, var31)) {
                    var32 = class85.method2436(var29.method3069(var30, var31));
                } else {
                    var32 = null;
                }
                Statics.field310 = var32;
            } else {
                var27++;
            }
            if (Statics.field804 == null) {
                class157 var34 = Statics.field395;
                class157 var35 = Statics.field212;
                int var36 = var34.method3035("p12_full");
                int var37 = var34.method3036(var36, "");
                class185 var38;
                if (Statics.method926(var34, var36, var37)) {
                    var38 = class85.method2436(var35.method3069(var36, var37));
                } else {
                    var38 = null;
                }
                Statics.field804 = var38;
            } else {
                var27++;
            }
            if (Statics.field1787 == null) {
                class157 var40 = Statics.field395;
                class157 var41 = Statics.field212;
                int var42 = var40.method3035("b12_full");
                int var43 = var40.method3036(var42, "");
                class185 var44;
                if (Statics.method926(var40, var42, var43)) {
                    var44 = class85.method2436(var41.method3069(var42, var43));
                } else {
                    var44 = null;
                }
                Statics.field1787 = var44;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class22.field332 = class137.field2180 + var27 * 100 / 3 + "%";
                class22.field349 = 40;
            } else {
                Statics.field277 = new class154(true);
                class22.field332 = class137.field2124;
                class22.field349 = 40;
                field526 = 60;
            }
        } else if (field526 == 60) {
            class157 var46 = Statics.field235;
            class157 var47 = Statics.field395;
            int var48 = 0;
            if (var46.method3017("title.jpg", "")) {
                var48++;
            }
            if (var47.method3017("logo", "")) {
                var48++;
            }
            if (var47.method3017("titlebox", "")) {
                var48++;
            }
            if (var47.method3017("titlebutton", "")) {
                var48++;
            }
            if (var47.method3017("runes", "")) {
                var48++;
            }
            if (var47.method3017("title_mute", "")) {
                var48++;
            }
            var47.method3017("sl_back", "");
            var47.method3017("sl_flags", "");
            var47.method3017("sl_arrows", "");
            var47.method3017("sl_stars", "");
            var47.method3017("sl_button", "");
            byte var51 = 6;
            if (var48 < var51) {
                class22.field332 = class137.field2229 + var48 * 100 / var51 + "%";
                class22.field349 = 50;
            } else {
                class22.field332 = class137.field2290;
                class22.field349 = 50;
                method2989(5);
                field526 = 70;
            }
        } else if (field526 == 70) {
            if (Statics.field1822.method3083()) {
                class38.method2129(Statics.field1822);
                class157 var53 = Statics.field1822;
                Statics.field885 = var53;
                class37.method1680(Statics.field1822, Statics.field105);
                class33.method2045(Statics.field1822, Statics.field105, field505);
                class32.method641(Statics.field1822, Statics.field105);
                class41.method2983(Statics.field1822, Statics.field105, field504, Statics.field310);
                class35.method2238(Statics.field1822, Statics.field1345, Statics.field500);
                class157 var54 = Statics.field1822;
                class157 var55 = Statics.field105;
                Statics.field938 = var54;
                Statics.field921 = var55;
                class157 var56 = Statics.field1822;
                Statics.field981 = var56;
                class43.method1646(Statics.field1822);
                class157 var57 = Statics.field1650;
                class157 var58 = Statics.field105;
                class157 var59 = Statics.field395;
                class157 var60 = Statics.field212;
                Statics.field2636 = var57;
                Statics.field2741 = var58;
                Statics.field2620 = var59;
                Statics.field1784 = var60;
                Statics.field2616 = new class161[Statics.field2636.method3031()][];
                Statics.field2617 = new boolean[Statics.field2636.method3031()];
                class42.method251(Statics.field1822);
                class40.method2986(Statics.field1822);
                class22.field332 = class137.field2128;
                class22.field349 = 60;
                field526 = 80;
            } else {
                class22.field332 = class137.field2127 + Statics.field1822.method3104() + "%";
                class22.field349 = 60;
            }
        } else if (field526 == 80) {
            int var61 = 0;
            if (Statics.field1312 == null) {
                Statics.field1312 = class85.method2719(Statics.field395, "compass", "");
            } else {
                var61++;
            }
            if (Statics.field1831 == null) {
                Statics.field1831 = class85.method2719(Statics.field395, "mapedge", "");
            } else {
                var61++;
            }
            if (Statics.field496 == null) {
                Statics.field496 = class85.method253(Statics.field395, "mapscene", "");
            } else {
                var61++;
            }
            if (Statics.field1803 == null) {
                Statics.field1803 = class85.method1422(Statics.field395, "mapfunction", "");
            } else {
                var61++;
            }
            if (Statics.field574 == null) {
                Statics.field574 = class85.method1422(Statics.field395, "hitmarks", "");
            } else {
                var61++;
            }
            if (Statics.field715 == null) {
                Statics.field715 = class85.method1422(Statics.field395, "headicons_pk", "");
            } else {
                var61++;
            }
            if (Statics.field2448 == null) {
                Statics.field2448 = class85.method1422(Statics.field395, "headicons_prayer", "");
            } else {
                var61++;
            }
            if (Statics.field201 == null) {
                Statics.field201 = class85.method1422(Statics.field395, "headicons_hint", "");
            } else {
                var61++;
            }
            if (Statics.field211 == null) {
                Statics.field211 = class85.method1422(Statics.field395, "mapmarker", "");
            } else {
                var61++;
            }
            if (Statics.field2017 == null) {
                Statics.field2017 = class85.method1422(Statics.field395, "cross", "");
            } else {
                var61++;
            }
            if (Statics.field766 == null) {
                Statics.field766 = class85.method1422(Statics.field395, "mapdots", "");
            } else {
                var61++;
            }
            if (Statics.field2041 == null) {
                Statics.field2041 = class85.method253(Statics.field395, "scrollbar", "");
            } else {
                var61++;
            }
            if (Statics.field230 == null) {
                Statics.field230 = class85.method253(Statics.field395, "mod_icons", "");
            } else {
                var61++;
            }
            if (Statics.field1813 == null) {
                Statics.field1813 = class85.method52(Statics.field395, "mapback", "");
            } else {
                var61++;
            }
            if (var61 < 14) {
                class22.field332 = class137.field2177 + var61 * 100 / 14 + "%";
                class22.field349 = 70;
            } else {
                Statics.field2868 = Statics.field230;
                Statics.field1831.method1730();
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 41.0D) - 20;
                for (int var66 = 0; var66 < Statics.field1803.length; var66++) {
                    Statics.field1803[var66].method1806(var62 + var65, var63 + var65, var64 + var65);
                }
                Statics.field496[0].method1815(var62 + var65, var63 + var65, var64 + var65);
                Statics.field278 = new int[33];
                Statics.field298 = new int[33];
                Statics.field1997 = new int[151];
                Statics.field2062 = new int[151];
                for (int var67 = 0; var67 < 33; var67++) {
                    int var68 = 999;
                    int var69 = 0;
                    for (int var70 = 0; var70 < 34; var70++) {
                        if (Statics.field1813.field1474[Statics.field1813.field1473 * var67 + var70] == 0) {
                            if (var68 == 999) {
                                var68 = var70;
                            }
                        } else if (var68 != 999) {
                            var69 = var70;
                            break;
                        }
                    }
                    Statics.field278[var67] = var68;
                    Statics.field298[var67] = var69 - var68;
                }
                for (int var71 = 5; var71 < 156; var71++) {
                    int var72 = 999;
                    int var73 = 0;
                    for (int var74 = 25; var74 < 172; var74++) {
                        if (Statics.field1813.field1474[Statics.field1813.field1473 * var71 + var74] == 0 && (var74 > 34 || var71 > 34)) {
                            if (var72 == 999) {
                                var72 = var74;
                            }
                        } else if (var72 != 999) {
                            var73 = var74;
                            break;
                        }
                    }
                    Statics.field1997[var71 - 5] = var72 - 25;
                    Statics.field2062[var71 - 5] = var73 - var72;
                }
                class22.field332 = class137.field2130;
                class22.field349 = 70;
                field526 = 90;
            }
        } else if (field526 == 90) {
            if (Statics.field606.method3083()) {
                class111 var75 = new class111(Statics.field606, Statics.field395, 20, 0.8D, field505 ? 64 : 128);
                class105.method2189(var75);
                class105.method2137(0.8D);
                class22.field332 = class137.field2132;
                class22.field349 = 90;
                field526 = 110;
            } else {
                class22.field332 = class137.field2131 + Statics.field606.method3104() + "%";
                class22.field349 = 90;
            }
        } else if (field526 == 110) {
            Statics.field1224 = new class16();
            Statics.field200.method1546(Statics.field1224, 10);
            class22.field332 = class137.field2133;
            class22.field349 = 94;
            field526 = 120;
        } else if (field526 == 120) {
            if (Statics.field235.method3017("huffman", "")) {
                class121 var76 = new class121(Statics.field235.method3064("huffman", ""));
                Statics.field2858 = var76;
                class22.field332 = class137.field2297;
                class22.field349 = 96;
                field526 = 130;
            } else {
                class22.field332 = class137.field2134 + "%";
                class22.field349 = 96;
            }
        } else if (field526 == 130) {
            if (!Statics.field1650.method3083()) {
                class22.field332 = class137.field2136 + Statics.field1650.method3104() * 4 / 5 + "%";
                class22.field349 = 100;
            } else if (!Statics.field1615.method3083()) {
                class22.field332 = class137.field2136 + (80 + Statics.field1615.method3104() / 6) + "%";
                class22.field349 = 100;
            } else if (Statics.field212.method3083()) {
                class22.field332 = class137.field2137;
                class22.field349 = 100;
                field526 = 140;
            } else {
                class22.field332 = class137.field2136 + (96 + Statics.field212.method3104() / 20) + "%";
                class22.field349 = 100;
            }
        } else if (field526 == 140) {
            method2989(10);
        }
    }

    @ObfuscatedName("db.x(IZZZB)Lfh;")
    public static class157 method2438(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class72 var4 = null;
        if (class83.field1432 != null) {
            var4 = new class72(arg0, class83.field1432, Statics.field125[arg0], 1000000);
        }
        return new class157(var4, Statics.field59, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("az.c(I)V")
    public static final void method937() {
        try {
            if (field531 == 0) {
                if (Statics.field2086 != null) {
                    Statics.field2086.method1434();
                    Statics.field2086 = null;
                }
                Statics.field405 = null;
                field525 = false;
                field702 = 0;
                field531 = 1;
            }
            if (field531 == 1) {
                if (Statics.field405 == null) {
                    Statics.field405 = Statics.field200.method1555(Statics.field1658, Statics.field513);
                }
                if (Statics.field405.field1413 == 2) {
                    throw new IOException();
                }
                if (Statics.field405.field1413 == 1) {
                    Statics.field2086 = new class71((Socket) Statics.field405.field1417, Statics.field200);
                    Statics.field405 = null;
                    field531 = 2;
                }
            }
            if (field531 == 2) {
                field543.field2045 = 0;
                field543.method2634(14);
                Statics.field2086.method1437(field543.field2043, 0, 1);
                field541.field2045 = 0;
                field531 = 3;
            }
            if (field531 == 3) {
                if (Statics.field1797 != null) {
                    Statics.field1797.method1198();
                }
                if (Statics.field959 != null) {
                    Statics.field959.method1198();
                }
                int var0 = Statics.field2086.method1436();
                if (Statics.field1797 != null) {
                    Statics.field1797.method1198();
                }
                if (Statics.field959 != null) {
                    Statics.field959.method1198();
                }
                if (var0 != 0) {
                    Statics.method933(var0);
                    return;
                }
                field541.field2045 = 0;
                field531 = 5;
            }
            if (field531 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field543.field2045 = 0;
                field543.method2634(10);
                field543.method2454(var1[0]);
                field543.method2454(var1[1]);
                field543.method2454(var1[2]);
                field543.method2454(var1[3]);
                field543.method2444(0L);
                field543.method2445(class22.field357);
                field543.method2472(class6.field93, class6.field85);
                field540.field2045 = 0;
                if (field507 == 40) {
                    field540.method2634(18);
                } else {
                    field540.method2634(16);
                }
                field540.method2603(0);
                int var2 = field540.field2045;
                field540.method2454(44);
                field540.method2448(field543.field2043, 0, field543.field2045);
                int var3 = field540.field2045;
                field540.method2445(class22.field355);
                field540.method2634(field505 ? 1 : 0);
                class117 var4 = field540;
                byte[] var5 = new byte[24];
                try {
                    class83.field1431.method642(0L);
                    class83.field1431.method618(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var17) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2448(var5, 0, 24);
                class128 var9 = new class128(Statics.field277.method3006());
                Statics.field277.method3005(var9);
                field540.method2448(var9.field2043, 0, var9.field2043.length);
                field540.method2454(Statics.field1345.field2559);
                field540.method2454(Statics.field500.field2559);
                field540.method2454(Statics.field1822.field2559);
                field540.method2454(Statics.field1650.field2559);
                field540.method2454(Statics.field404.field2559);
                field540.method2454(Statics.field1648.field2559);
                field540.method2454(Statics.field97.field2559);
                field540.method2454(Statics.field105.field2559);
                field540.method2454(Statics.field395.field2559);
                field540.method2454(Statics.field606.field2559);
                field540.method2454(Statics.field235.field2559);
                field540.method2454(Statics.field2756.field2559);
                field540.method2454(Statics.field1615.field2559);
                field540.method2454(Statics.field212.field2559);
                field540.method2454(Statics.field1278.field2559);
                field540.method2454(Statics.field1621.field2559);
                field540.method2575(var1, var3, field540.field2045);
                field540.method2545(field540.field2045 - var2);
                Statics.field2086.method1437(field540.field2043, 0, field540.field2045);
                field543.method2329(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field541.method2329(var1);
                field531 = 6;
            }
            if (field531 == 6 && Statics.field2086.method1435() > 0) {
                int var11 = Statics.field2086.method1436();
                if (var11 == 21 && field507 == 20) {
                    field531 = 7;
                } else if (var11 == 2) {
                    field531 = 9;
                } else if (var11 == 15 && field507 == 40) {
                    method258();
                    return;
                } else if (var11 == 23 && field533 < 1) {
                    field533++;
                    field531 = 0;
                } else {
                    Statics.method933(var11);
                    return;
                }
            }
            if (field531 == 7 && Statics.field2086.method1435() > 0) {
                field746 = (Statics.field2086.method1436() + 3) * 60;
                field531 = 8;
            }
            if (field531 == 8) {
                field702 = 0;
                class22.method730(class137.field2159, class137.field2139, field746 / 60 + class137.field2201);
                if (--field746 <= 0) {
                    field531 = 0;
                }
            } else {
                if (field531 == 9 && Statics.field2086.method1435() >= 8) {
                    field718 = Statics.field2086.method1436();
                    field671 = Statics.field2086.method1436() == 1;
                    field623 = Statics.field2086.method1436();
                    field623 <<= 0x8;
                    field623 += Statics.field2086.method1436();
                    field624 = Statics.field2086.method1436();
                    Statics.field2086.method1453(field541.field2043, 0, 1);
                    field541.field2045 = 0;
                    field665 = field541.method2330();
                    Statics.field2086.method1453(field541.field2043, 0, 2);
                    field541.field2045 = 0;
                    field723 = field541.method2456();
                    if (field624 == 1) {
                        try {
                            class68.method1418(Statics.field1926, "zap");
                        } catch (Throwable var16) {
                        }
                    } else {
                        try {
                            class68.method1418(Statics.field1926, "unzap");
                        } catch (Throwable var15) {
                        }
                    }
                    field531 = 10;
                }
                if (field531 != 10) {
                    field702++;
                    if (field702 > 2000) {
                        if (field533 < 1) {
                            if (Statics.field513 == Statics.field2445) {
                                Statics.field513 = Statics.field2792;
                            } else {
                                Statics.field513 = Statics.field2445;
                            }
                            field533++;
                            field531 = 0;
                        } else {
                            Statics.method933(-3);
                        }
                    }
                } else if (Statics.field2086.method1435() >= field723) {
                    field541.field2045 = 0;
                    Statics.field2086.method1453(field541.field2043, 0, field723);
                    method681();
                    Statics.field910 = -1;
                    method1360(false);
                    field665 = -1;
                }
            }
        } catch (IOException var18) {
            if (field533 < 1) {
                if (Statics.field513 == Statics.field2445) {
                    Statics.field513 = Statics.field2792;
                } else {
                    Statics.field513 = Statics.field2445;
                }
                field533++;
                field531 = 0;
            } else {
                Statics.method933(-2);
            }
        }
    }

    @ObfuscatedName("aw.b(I)V")
    public static void method681() {
        field510 = -1L;
        field652 = -1;
        Statics.field1224.field256 = 0;
        Statics.field8 = true;
        field514 = true;
        field721 = -1L;
        class184.field2855 = new class179();
        field543.field2045 = 0;
        field541.field2045 = 0;
        field665 = -1;
        field547 = -1;
        field548 = -1;
        field549 = -1;
        field544 = 0;
        field691 = 0;
        field714 = 0;
        field656 = 0;
        field631 = 0;
        field639 = false;
        class78.method733(0);
        for (int var0 = 0; var0 < 100; var0++) {
            field664[var0] = null;
        }
        field620 = 0;
        field651 = 0;
        field653 = false;
        field737 = 0;
        field561 = (int) (Math.random() * 100.0D) - 50;
        field626 = (int) (Math.random() * 110.0D) - 55;
        field695 = (int) (Math.random() * 80.0D) - 40;
        field568 = (int) (Math.random() * 120.0D) - 60;
        field570 = (int) (Math.random() * 30.0D) - 20;
        field582 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field731 = 0;
        field724 = -1;
        field711 = 0;
        field730 = 0;
        field585 = 0;
        field537 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field678[var1] = null;
            field696[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field536[var2] = null;
        }
        Statics.field1383 = field678[2047] = new class3();
        field633.method3325();
        field634.method3325();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field553[var3][var4][var5] = null;
                }
            }
        }
        field563 = new class179();
        field750 = 0;
        field749 = 0;
        field753 = 0;
        for (int var6 = 0; var6 < Statics.field1060; var6++) {
            class43 var7 = Statics.method2394(var6);
            if (var7 != null && var7.field1055 == 0) {
                class162.field2745[var6] = 0;
                class162.field2748[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field564.length; var8++) {
            field564[var8] = -1;
        }
        if (field566 != -1) {
            class161.method2430(field566);
        }
        for (class4 var9 = (class4) field658.method3313(); var9 != null; var9 = (class4) field658.method3323()) {
            method131(var9, true);
        }
        field566 = -1;
        field658 = new class177(8);
        field661 = null;
        field639 = false;
        field631 = 0;
        field693.method3237((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            field628[var10] = null;
            field629[var10] = false;
        }
        class19.field292 = new class177(32);
        field508 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            field700[var11] = true;
        }
        field722 = null;
        Statics.field247 = 0;
        Statics.field792 = null;
    }

    @ObfuscatedName("v.f(I)V")
    public static void method258() {
        field543.field2045 = 0;
        field541.field2045 = 0;
        field665 = -1;
        field547 = -1;
        field548 = -1;
        field549 = -1;
        field723 = 0;
        field544 = 0;
        field691 = 0;
        field631 = 0;
        field639 = false;
        field731 = 0;
        field711 = 0;
        for (int var0 = 0; var0 < field678.length; var0++) {
            if (field678[var0] != null) {
                field678[var0].field461 = -1;
            }
        }
        for (int var1 = 0; var1 < field536.length; var1++) {
            if (field536[var1] != null) {
                field536[var1].field461 = -1;
            }
        }
        class19.method174();
        method2989(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field700[var2] = true;
        }
    }

    @ObfuscatedName("ep.y(I)V")
    public static final void method2893() {
        if (Statics.field2086 != null) {
            Statics.field2086.method1434();
            Statics.field2086 = null;
        }
        method857();
        Statics.field29.method1919();
        for (int var0 = 0; var0 < 4; var0++) {
            field557[var0].method2685();
        }
        System.gc();
        class141.method2315(2);
        field755 = -1;
        field640 = false;
        for (class7 var1 = (class7) class7.field115.method3331(); var1 != null; var1 = (class7) class7.field115.method3333()) {
            if (var1.field102 != null) {
                Statics.field1048.method1149(var1.field102);
                var1.field102 = null;
            }
            if (var1.field107 != null) {
                Statics.field1048.method1149(var1.field107);
                var1.field107 = null;
            }
        }
        class7.field115.method3325();
        method2989(10);
    }

    @ObfuscatedName("ai.r(I)V")
    public static final void method857() {
        class38.field970.method3265();
        class34.field884.method3265();
        class37.method27();
        class33.field860.method3265();
        class33.field843.method3265();
        class33.field839.method3265();
        class33.field882.method3265();
        class32.method3();
        class41.method130();
        class35.method1577();
        class36.field920.method3265();
        class36.field922.method3265();
        class39.field974.method3265();
        class43.method255();
        class166.field2774.method3265();
        class161.method247();
        ((class111) Statics.field1775).method2230();
        class5.field76.method3265();
        Statics.field1345.method3033();
        Statics.field500.method3033();
        Statics.field1650.method3033();
        Statics.field404.method3033();
        Statics.field1648.method3033();
        Statics.field97.method3033();
        Statics.field105.method3033();
        Statics.field395.method3033();
        Statics.field606.method3033();
        Statics.field235.method3033();
        Statics.field2756.method3033();
        Statics.field1615.method3033();
    }

    @ObfuscatedName("l.l(B)V")
    public static final void method237() {
        if (field714 > 0) {
            method2893();
        } else {
            method2989(40);
            Statics.field401 = Statics.field2086;
            Statics.field2086 = null;
        }
    }

    @ObfuscatedName("dc.n(I)V")
    public static final void method2231() {
        if (Statics.field959 != null) {
            Statics.field959.method1197();
        }
        if (Statics.field1797 != null) {
            Statics.field1797.method1197();
        }
    }

    @ObfuscatedName("k.h(I)V")
    public static final void method26() {
        for (int var0 = 0; var0 < field737; var0++) {
            int var10002 = field740[var0]--;
            if (field740[var0] >= -10) {
                class58 var2 = field759[var0];
                if (var2 == null) {
                    class58 var10000 = (class58) null;
                    var2 = class58.method1307(Statics.field404, field748[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field740[var0] += var2.method1304();
                    field759[var0] = var2;
                }
                if (field740[var0] < 0) {
                    int var9;
                    if (field542[var0] == 0) {
                        var9 = field735;
                    } else {
                        int var3 = (field542[var0] & 0xFF) * 128;
                        int var4 = field542[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1383.field443;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field542[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1383.field439;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field740[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field736 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class64 var10 = var2.method1303().method1375(Statics.field907);
                        class46 var11 = class46.method1000(var10, 100, var9);
                        var11.method996(field739[var0] - 1);
                        Statics.field1048.method1148(var11);
                    }
                    field740[var0] = -100;
                }
            } else {
                field737--;
                for (int var1 = var0; var1 < field737; var1++) {
                    field748[var1] = field748[var1 + 1];
                    field759[var1] = field759[var1 + 1];
                    field739[var1] = field739[var1 + 1];
                    field740[var1] = field740[var1 + 1];
                    field542[var1] = field542[var1 + 1];
                }
                var0--;
            }
        }
        if (field640 && !class141.method624()) {
            if (field546 != 0 && field755 != -1) {
                class141.method267(Statics.field97, field755, 0, field546, false);
            }
            field640 = false;
        }
    }

    @ObfuscatedName("ep.v(Lae;IIII)V")
    public static void method2892(class35 arg0, int arg1, int arg2, int arg3) {
        if (field737 >= 50 || field736 == 0 || arg0.field903 == null || arg1 >= arg0.field903.length) {
            return;
        }
        int var4 = arg0.field903[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field748[field737] = var5;
        field739[field737] = var6;
        field740[field737] = 0;
        field759[field737] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field542[field737] = (var8 << 16) + (var9 << 8) + var7;
        field737++;
    }

    @ObfuscatedName("dd.ax(IIII)V")
    public static void method2399(int arg0, int arg1, int arg2) {
        if (field735 == 0 || arg1 == 0 || field737 >= 50) {
            return;
        }
        field748[field737] = arg0;
        field739[field737] = arg1;
        field740[field737] = arg2;
        field759[field737] = null;
        field542[field737] = 0;
        field737++;
    }

    @ObfuscatedName("ft.ao(III)V")
    public static void method3258(int arg0, int arg1) {
        if (field546 != 0 && arg0 != -1) {
            class141.method267(Statics.field2756, arg0, 0, field546, false);
            field640 = true;
        }
    }

    @ObfuscatedName("p.al(I)V")
    public static final void method142() {
        if (field505 && Statics.field2001 != field499) {
            method195(Statics.field910, Statics.field2497, Statics.field2001, Statics.field1383.field490[0], Statics.field1383.field491[0]);
        } else if (Statics.field2001 != field724) {
            field724 = Statics.field2001;
            method231(Statics.field2001);
        }
    }

    @ObfuscatedName("z.ap(Ljava/lang/String;I)V")
    public static final void method35(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field197.field195 = !Statics.field197.field195;
            class12.method1540();
            if (Statics.field197.field195) {
                method1883(99, "", "Roofs are now all hidden");
            } else {
                method1883(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field718 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field515 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field515 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method237();
            }
            if (arg0.equalsIgnoreCase("errortest") && field503 == 2) {
                throw new RuntimeException();
            }
        }
        field543.method2333(77);
        field543.method2634(arg0.length() + 1);
        field543.method2445(arg0);
    }

    @ObfuscatedName("x.ak(I)V")
    public static final void method171() {
        int var0 = Statics.field895 * 128 + 64;
        int var1 = Statics.field1753 * 128 + 64;
        int var2 = method1541(var0, var1, Statics.field2001) - Statics.field414;
        if (Statics.field1042 < var0) {
            Statics.field1042 += Statics.field1795 * (var0 - Statics.field1042) / 1000 + Statics.field1057;
            if (Statics.field1042 > var0) {
                Statics.field1042 = var0;
            }
        }
        if (Statics.field1042 > var0) {
            Statics.field1042 -= Statics.field1795 * (Statics.field1042 - var0) / 1000 + Statics.field1057;
            if (Statics.field1042 < var0) {
                Statics.field1042 = var0;
            }
        }
        if (Statics.field1510 < var2) {
            Statics.field1510 += Statics.field1795 * (var2 - Statics.field1510) / 1000 + Statics.field1057;
            if (Statics.field1510 > var2) {
                Statics.field1510 = var2;
            }
        }
        if (Statics.field1510 > var2) {
            Statics.field1510 -= Statics.field1795 * (Statics.field1510 - var2) / 1000 + Statics.field1057;
            if (Statics.field1510 < var2) {
                Statics.field1510 = var2;
            }
        }
        if (Statics.field1816 < var1) {
            Statics.field1816 += Statics.field1795 * (var1 - Statics.field1816) / 1000 + Statics.field1057;
            if (Statics.field1816 > var1) {
                Statics.field1816 = var1;
            }
        }
        if (Statics.field1816 > var1) {
            Statics.field1816 -= Statics.field1795 * (Statics.field1816 - var1) / 1000 + Statics.field1057;
            if (Statics.field1816 < var1) {
                Statics.field1816 = var1;
            }
        }
        int var3 = Statics.field154 * 128 + 64;
        int var4 = Statics.field122 * 128 + 64;
        int var5 = method1541(var3, var4, Statics.field2001) - Statics.field275;
        int var6 = var3 - Statics.field1042;
        int var7 = var5 - Statics.field1510;
        int var8 = var4 - Statics.field1816;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field89 < var10) {
            Statics.field89 += Statics.field417 * (var10 - Statics.field89) / 1000 + Statics.field955;
            if (Statics.field89 > var10) {
                Statics.field89 = var10;
            }
        }
        if (Statics.field89 > var10) {
            Statics.field89 -= Statics.field417 * (Statics.field89 - var10) / 1000 + Statics.field955;
            if (Statics.field89 < var10) {
                Statics.field89 = var10;
            }
        }
        int var12 = var11 - Statics.field1546;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1546 += Statics.field417 * var12 / 1000 + Statics.field955;
            Statics.field1546 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1546 -= Statics.field417 * -var12 / 1000 + Statics.field955;
            Statics.field1546 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1546;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1546 = var11;
        }
    }

    @ObfuscatedName("c.aw(I)V")
    public static final void method173() {
        for (int var0 = -1; var0 < field585; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field734[var0];
            }
            class3 var2 = field678[var1];
            if (var2 != null) {
                method2199(var2, 1);
            }
        }
    }

    @ObfuscatedName("di.ah(Lao;II)V")
    public static final void method2199(class28 arg0, int arg1) {
        if (arg0.field470 > field569) {
            int var2 = arg0.field470 - field569;
            int var3 = arg0.field477 * 128 + arg0.field442 * 64;
            int var4 = arg0.field481 * 128 + arg0.field442 * 64;
            arg0.field443 += (var3 - arg0.field443) / var2;
            arg0.field439 += (var4 - arg0.field439) / var2;
            arg0.field493 = 0;
            if (arg0.field467 == 0) {
                arg0.field486 = 1024;
            }
            if (arg0.field467 == 1) {
                arg0.field486 = 1536;
            }
            if (arg0.field467 == 2) {
                arg0.field486 = 0;
            }
            if (arg0.field467 == 3) {
                arg0.field486 = 512;
            }
        } else if (arg0.field482 >= field569) {
            if (field569 == arg0.field482 || arg0.field450 == -1 || arg0.field464 != 0 || arg0.field469 + 1 > class35.method28(arg0.field450).field902[arg0.field479]) {
                int var5 = arg0.field482 - arg0.field470;
                int var6 = field569 - arg0.field470;
                int var7 = arg0.field477 * 128 + arg0.field442 * 64;
                int var8 = arg0.field481 * 128 + arg0.field442 * 64;
                int var9 = arg0.field478 * 128 + arg0.field442 * 64;
                int var10 = arg0.field476 * 128 + arg0.field442 * 64;
                arg0.field443 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field439 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field493 = 0;
            if (arg0.field467 == 0) {
                arg0.field486 = 1024;
            }
            if (arg0.field467 == 1) {
                arg0.field486 = 1536;
            }
            if (arg0.field467 == 2) {
                arg0.field486 = 0;
            }
            if (arg0.field467 == 3) {
                arg0.field486 = 512;
            }
            arg0.field440 = arg0.field486;
        } else {
            method51(arg0);
        }
        if (arg0.field443 < 128 || arg0.field439 < 128 || arg0.field443 >= 13184 || arg0.field439 >= 13184) {
            arg0.field450 = -1;
            arg0.field472 = -1;
            arg0.field470 = 0;
            arg0.field482 = 0;
            arg0.field443 = arg0.field490[0] * 128 + arg0.field442 * 64;
            arg0.field439 = arg0.field491[0] * 128 + arg0.field442 * 64;
            arg0.method270();
        }
        if (Statics.field1383 == arg0 && (arg0.field443 < 1536 || arg0.field439 < 1536 || arg0.field443 >= 11776 || arg0.field439 >= 11776)) {
            arg0.field450 = -1;
            arg0.field472 = -1;
            arg0.field470 = 0;
            arg0.field482 = 0;
            arg0.field443 = arg0.field490[0] * 128 + arg0.field442 * 64;
            arg0.field439 = arg0.field491[0] * 128 + arg0.field442 * 64;
            arg0.method270();
        }
        method49(arg0);
        Statics.method594(arg0);
    }

    @ObfuscatedName("w.ae(Lao;I)V")
    public static final void method51(class28 arg0) {
        arg0.field468 = arg0.field475;
        if (arg0.field489 == 0) {
            arg0.field493 = 0;
            return;
        }
        if (arg0.field450 != -1 && arg0.field464 == 0) {
            class35 var1 = class35.method28(arg0.field450);
            if (arg0.field494 > 0 && var1.field911 == 0) {
                arg0.field493++;
                return;
            }
            if (arg0.field494 <= 0 && var1.field912 == 0) {
                arg0.field493++;
                return;
            }
        }
        int var2 = arg0.field443;
        int var3 = arg0.field439;
        int var4 = arg0.field490[arg0.field489 - 1] * 128 + arg0.field442 * 64;
        int var5 = arg0.field491[arg0.field489 - 1] * 128 + arg0.field442 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field443 = var4;
            arg0.field439 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field486 = 1280;
            } else if (var3 > var5) {
                arg0.field486 = 1792;
            } else {
                arg0.field486 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field486 = 768;
            } else if (var3 > var5) {
                arg0.field486 = 256;
            } else {
                arg0.field486 = 512;
            }
        } else if (var3 < var5) {
            arg0.field486 = 1024;
        } else if (var3 > var5) {
            arg0.field486 = 0;
        }
        int var6 = arg0.field486 - arg0.field440 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field447;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field446;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field449;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field484;
        }
        if (var7 == -1) {
            var7 = arg0.field446;
        }
        arg0.field468 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class26) {
            var9 = ((class26) arg0).field413.field793;
        }
        if (var9) {
            if (arg0.field486 != arg0.field440 && arg0.field461 == -1 && arg0.field488 != 0) {
                var8 = 2;
            }
            if (arg0.field489 > 2) {
                var8 = 6;
            }
            if (arg0.field489 > 3) {
                var8 = 8;
            }
            if (arg0.field493 > 0 && arg0.field489 > 1) {
                var8 = 8;
                arg0.field493--;
            }
        } else {
            if (arg0.field489 > 1) {
                var8 = 6;
            }
            if (arg0.field489 > 2) {
                var8 = 8;
            }
            if (arg0.field493 > 0 && arg0.field489 > 1) {
                var8 = 8;
                arg0.field493--;
            }
        }
        if (arg0.field492[arg0.field489 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field468 == arg0.field446 && arg0.field483 != -1) {
            arg0.field468 = arg0.field483;
        }
        if (var2 < var4) {
            arg0.field443 += var8;
            if (arg0.field443 > var4) {
                arg0.field443 = var4;
            }
        } else if (var2 > var4) {
            arg0.field443 -= var8;
            if (arg0.field443 < var4) {
                arg0.field443 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field439 += var8;
            if (arg0.field439 > var5) {
                arg0.field439 = var5;
            }
        } else if (var3 > var5) {
            arg0.field439 -= var8;
            if (arg0.field439 < var5) {
                arg0.field439 = var5;
            }
        }
        if (arg0.field443 == var4 && arg0.field439 == var5) {
            arg0.field489--;
            if (arg0.field494 > 0) {
                arg0.field494--;
            }
        }
    }

    @ObfuscatedName("w.am(Lao;B)V")
    public static final void method49(class28 arg0) {
        if (arg0.field488 == 0) {
            return;
        }
        if (arg0.field461 != -1 && arg0.field461 < 32768) {
            class26 var1 = field536[arg0.field461];
            if (var1 != null) {
                int var2 = arg0.field443 - var1.field443;
                int var3 = arg0.field439 - var1.field439;
                if (var2 != 0 || var3 != 0) {
                    arg0.field486 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field461 >= 32768) {
            int var4 = arg0.field461 - 32768;
            if (field623 == var4) {
                var4 = 2047;
            }
            class3 var5 = field678[var4];
            if (var5 != null) {
                int var6 = arg0.field443 - var5.field443;
                int var7 = arg0.field439 - var5.field439;
                if (var6 != 0 || var7 != 0) {
                    arg0.field486 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field462 != 0 || arg0.field463 != 0) && (arg0.field489 == 0 || arg0.field493 > 0)) {
            int var8 = arg0.field443 - (arg0.field462 * 64 - Statics.field949 * 64 - Statics.field949 * 64);
            int var9 = arg0.field439 - (arg0.field463 * 64 - Statics.field2063 * 64 - Statics.field2063 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field486 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field462 = 0;
            arg0.field463 = 0;
        }
        int var10 = arg0.field486 - arg0.field440 & 0x7FF;
        if (var10 == 0) {
            arg0.field487 = 0;
            return;
        }
        arg0.field487++;
        if (var10 > 1024) {
            arg0.field440 -= arg0.field488;
            boolean var11 = true;
            if (var10 < arg0.field488 || var10 > 2048 - arg0.field488) {
                arg0.field440 = arg0.field486;
                var11 = false;
            }
            if (arg0.field475 == arg0.field468 && (arg0.field487 > 25 || var11)) {
                if (arg0.field444 == -1) {
                    arg0.field468 = arg0.field446;
                } else {
                    arg0.field468 = arg0.field444;
                }
            }
        } else {
            arg0.field440 += arg0.field488;
            boolean var12 = true;
            if (var10 < arg0.field488 || var10 > 2048 - arg0.field488) {
                arg0.field440 = arg0.field486;
                var12 = false;
            }
            if (arg0.field475 == arg0.field468 && (arg0.field487 > 25 || var12)) {
                if (arg0.field445 == -1) {
                    arg0.field468 = arg0.field446;
                } else {
                    arg0.field468 = arg0.field445;
                }
            }
        }
        arg0.field440 &= 0x7FF;
    }

    @ObfuscatedName("aq.ai(Lk;IIB)V")
    public static void method835(class3 arg0, int arg1, int arg2) {
        if (arg0.field450 == arg1 && arg1 != -1) {
            int var3 = class35.method28(arg1).field913;
            if (var3 == 1) {
                arg0.field479 = 0;
                arg0.field469 = 0;
                arg0.field464 = arg2;
                arg0.field471 = 0;
            }
            if (var3 == 2) {
                arg0.field471 = 0;
            }
        } else if (arg1 == -1 || arg0.field450 == -1 || class35.method28(arg1).field897 >= class35.method28(arg0.field450).field897) {
            arg0.field450 = arg1;
            arg0.field479 = 0;
            arg0.field469 = 0;
            arg0.field464 = arg2;
            arg0.field471 = 0;
            arg0.field494 = arg0.field489;
        }
    }

    @ObfuscatedName("ej.an(B)V")
    public static final void method2714() {
        if (field566 != -1) {
            method928(field566);
        }
        for (int var0 = 0; var0 < field698; var0++) {
            if (field700[var0]) {
                field701[var0] = true;
            }
            field632[var0] = field700[var0];
            field700[var0] = false;
        }
        field699 = field569;
        field743 = -1;
        field648 = -1;
        Statics.field2000 = null;
        if (field566 != -1) {
            field698 = 0;
            method2(field566, 0, 0, 765, 503, 0, 0, -1);
        }
        class90.method1835();
        if (field639) {
            method128();
        } else if (field743 != -1) {
            int var1 = field743;
            int var2 = field648;
            if (field631 >= 2 || field651 != 0 || field653) {
                String var3;
                if (field651 == 1 && field631 < 2) {
                    var3 = class137.field2246 + class137.field2256 + field584 + " " + class2.field26;
                } else if (field653 && field631 < 2) {
                    var3 = field521 + class137.field2256 + field516 + " " + class2.field26;
                } else {
                    int var4 = field631 - 1;
                    String var5;
                    if (field646[var4].length() > 0) {
                        var5 = field645[var4] + class137.field2256 + field646[var4];
                    } else {
                        var5 = field645[var4];
                    }
                    var3 = var5;
                }
                if (field631 > 2) {
                    var3 = var3 + class2.method13(16777215) + " " + '/' + " " + (field631 - 2) + class137.field2173;
                }
                Statics.field1787.method3410(var3, var1 + 4, var2 + 15, 16777215, 0, field569 / 1000);
            }
        }
        if (field726 == 3) {
            for (int var6 = 0; var6 < field698; var6++) {
                if (field632[var6]) {
                    class90.method1827(field760[var6], field704[var6], field705[var6], field706[var6], 16711935, 128);
                } else if (field701[var6]) {
                    class90.method1827(field760[var6], field704[var6], field705[var6], field706[var6], 16711680, 128);
                }
            }
        }
        int var7 = Statics.field2001;
        int var8 = Statics.field1383.field443;
        int var9 = Statics.field1383.field439;
        int var10 = field534;
        for (class7 var11 = (class7) class7.field115.method3331(); var11 != null; var11 = (class7) class7.field115.method3333()) {
            if (var11.field101 != -1 || var11.field94 != null) {
                int var12 = 0;
                if (var8 > var11.field104) {
                    var12 += var8 - var11.field104;
                } else if (var8 < var11.field96) {
                    var12 += var11.field96 - var8;
                }
                if (var9 > var11.field99) {
                    var12 += var9 - var11.field99;
                } else if (var9 < var11.field114) {
                    var12 += var11.field114 - var9;
                }
                if (var12 - 64 > var11.field110 || field736 == 0 || var11.field95 != var7) {
                    if (var11.field102 != null) {
                        Statics.field1048.method1149(var11.field102);
                        var11.field102 = null;
                    }
                    if (var11.field107 != null) {
                        Statics.field1048.method1149(var11.field107);
                        var11.field107 = null;
                    }
                } else {
                    var12 -= 64;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = field736 * (var11.field110 - var12) / var11.field110;
                    class58 var10000;
                    if (var11.field102 != null) {
                        var11.field102.method997(var13);
                    } else if (var11.field101 >= 0) {
                        var10000 = (class58) null;
                        class58 var14 = class58.method1307(Statics.field404, var11.field101, 0);
                        if (var14 != null) {
                            class64 var15 = var14.method1303().method1375(Statics.field907);
                            class46 var16 = class46.method1000(var15, 100, var13);
                            var16.method996(-1);
                            Statics.field1048.method1148(var16);
                            var11.field102 = var16;
                        }
                    }
                    if (var11.field107 != null) {
                        var11.field107.method997(var13);
                        if (!var11.field107.method3365()) {
                            var11.field107 = null;
                        }
                    } else if (var11.field94 != null && (var11.field100 -= var10) <= 0) {
                        int var17 = (int) (Math.random() * (double) var11.field94.length);
                        var10000 = (class58) null;
                        class58 var18 = class58.method1307(Statics.field404, var11.field94[var17], 0);
                        if (var18 != null) {
                            class64 var19 = var18.method1303().method1375(Statics.field907);
                            class46 var20 = class46.method1000(var19, 100, var13);
                            var20.method996(0);
                            Statics.field1048.method1148(var20);
                            var11.field107 = var20;
                            var11.field100 = var11.field103 + (int) (Math.random() * (double) (var11.field113 - var11.field103));
                        }
                    }
                }
            }
        }
        field534 = 0;
    }

    @ObfuscatedName("cc.aa(Ljava/lang/String;ZI)V")
    public static final void method2128(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field804.method3400(arg0, 250);
        int var6 = Statics.field804.method3401(arg0, 250) * 13;
        class90.method1828(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class90.method1830(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field804.method3463(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2437(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method4(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1817.getGraphics();
            Statics.field313.method1648(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1817.repaint();
        }
    }

    @ObfuscatedName("bz.ad(IIIIB)V")
    public static final void method1433(int arg0, int arg1, int arg2, int arg3) {
        class90.method1822(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class105.method2133();
        field601++;
        method927(true);
        method599(true);
        method927(false);
        method599(false);
        method123();
        method144();
        if (!field576) {
            int var4 = field581;
            if (field589 / 256 > var4) {
                var4 = field589 / 256;
            }
            if (field498[4] && field745[4] + 128 > var4) {
                var4 = field745[4] + 128;
            }
            int var5 = field695 + field582 & 0x7FF;
            method160(Statics.field2010, method1541(Statics.field1383.field443, Statics.field1383.field439, Statics.field2001) - 50, Statics.field1373, var4, var5, var4 * 3 + 600);
        }
        int var18;
        if (field576) {
            int var19;
            if (Statics.field197.field195) {
                var19 = Statics.field2001;
            } else {
                int var20 = method1541(Statics.field1042, Statics.field1816, Statics.field2001);
                if (var20 - Statics.field1510 >= 800 || (class9.field133[Statics.field2001][Statics.field1042 >> 7][Statics.field1816 >> 7] & 0x4) == 0) {
                    var19 = 3;
                } else {
                    var19 = Statics.field2001;
                }
            }
            var18 = var19;
        } else {
            int var6;
            if (Statics.field197.field195) {
                var6 = Statics.field2001;
            } else {
                int var7 = 3;
                if (Statics.field89 < 310) {
                    int var8 = Statics.field1042 >> 7;
                    int var9 = Statics.field1816 >> 7;
                    int var10 = Statics.field1383.field443 >> 7;
                    int var11 = Statics.field1383.field439 >> 7;
                    if ((class9.field133[Statics.field2001][var8][var9] & 0x4) != 0) {
                        var7 = Statics.field2001;
                    }
                    int var12;
                    if (var10 > var8) {
                        var12 = var10 - var8;
                    } else {
                        var12 = var8 - var10;
                    }
                    int var13;
                    if (var11 > var9) {
                        var13 = var11 - var9;
                    } else {
                        var13 = var9 - var11;
                    }
                    if (var12 > var13) {
                        int var14 = var13 * 65536 / var12;
                        int var15 = 32768;
                        while (var8 != var10) {
                            if (var8 < var10) {
                                var8++;
                            } else if (var8 > var10) {
                                var8--;
                            }
                            if ((class9.field133[Statics.field2001][var8][var9] & 0x4) != 0) {
                                var7 = Statics.field2001;
                            }
                            var15 += var14;
                            if (var15 >= 65536) {
                                var15 -= 65536;
                                if (var9 < var11) {
                                    var9++;
                                } else if (var9 > var11) {
                                    var9--;
                                }
                                if ((class9.field133[Statics.field2001][var8][var9] & 0x4) != 0) {
                                    var7 = Statics.field2001;
                                }
                            }
                        }
                    } else {
                        int var16 = var12 * 65536 / var13;
                        int var17 = 32768;
                        while (var9 != var11) {
                            if (var9 < var11) {
                                var9++;
                            } else if (var9 > var11) {
                                var9--;
                            }
                            if ((class9.field133[Statics.field2001][var8][var9] & 0x4) != 0) {
                                var7 = Statics.field2001;
                            }
                            var17 += var16;
                            if (var17 >= 65536) {
                                var17 -= 65536;
                                if (var8 < var10) {
                                    var8++;
                                } else if (var8 > var10) {
                                    var8--;
                                }
                                if ((class9.field133[Statics.field2001][var8][var9] & 0x4) != 0) {
                                    var7 = Statics.field2001;
                                }
                            }
                        }
                    }
                }
                if ((class9.field133[Statics.field2001][Statics.field1383.field443 >> 7][Statics.field1383.field439 >> 7] & 0x4) != 0) {
                    var7 = Statics.field2001;
                }
                var6 = var7;
            }
            var18 = var6;
        }
        int var21 = Statics.field1042;
        int var22 = Statics.field1510;
        int var23 = Statics.field1816;
        int var24 = Statics.field89;
        int var25 = Statics.field1546;
        for (int var26 = 0; var26 < 5; var26++) {
            if (field498[var26]) {
                int var27 = (int) (Math.random() * (double) (field511[var26] * 2 + 1) - (double) field511[var26] + Math.sin((double) field747[var26] / 100.0D * (double) field622[var26]) * (double) field745[var26]);
                if (var26 == 0) {
                    Statics.field1042 += var27;
                }
                if (var26 == 1) {
                    Statics.field1510 += var27;
                }
                if (var26 == 2) {
                    Statics.field1816 += var27;
                }
                if (var26 == 3) {
                    Statics.field1546 = Statics.field1546 + var27 & 0x7FF;
                }
                if (var26 == 4) {
                    Statics.field89 += var27;
                    if (Statics.field89 < 128) {
                        Statics.field89 = 128;
                    }
                    if (Statics.field89 > 383) {
                        Statics.field89 = 383;
                    }
                }
            }
        }
        int var28 = class78.field1397;
        int var29 = class78.field1398 * -58530351;
        if (class78.field1393 != 0) {
            var28 = class78.field1404;
            var29 = class78.field1405;
        }
        if (var28 >= arg0 && var28 < arg0 + arg2 && var29 >= arg1 && var29 < arg1 + arg3) {
            class113.field1910 = true;
            class113.field1913 = 0;
            class113.field1907 = var28 - arg0;
            class113.field1879 = var29 - arg1;
        } else {
            class113.field1910 = false;
            class113.field1913 = 0;
        }
        method2231();
        class90.method1828(arg0, arg1, arg2, arg3, 0);
        method2231();
        Statics.field29.method1928(Statics.field1042, Statics.field1510, Statics.field1816, Statics.field89, Statics.field1546, var18);
        method2231();
        Statics.field29.method1904();
        method1572(arg0, arg1, arg2, arg3);
        method613(arg0, arg1);
        ((class111) Statics.field1775).method2229(field534);
        if (field607 == 1) {
            Statics.field2017[field647 / 100].method1738(field604 - 8, field605 - 8);
        }
        if (field607 == 2) {
            Statics.field2017[field647 / 100 + 4].method1738(field604 - 8, field605 - 8);
        }
        method132();
        if (field515) {
            int var30 = arg0 + 512 - 5;
            int var31 = arg1 + 20;
            Statics.field804.method3404("Fps:" + field1335, var30, var31, 16776960, -1);
            int var35 = var31 + 15;
            Runtime var32 = Runtime.getRuntime();
            int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
            int var34 = 16776960;
            if (var33 > 32768 && field505) {
                var34 = 16711680;
            }
            if (var33 > 65536 && !field505) {
                var34 = 16711680;
            }
            Statics.field804.method3404("Mem:" + var33 + "k", var30, var35, var34, -1);
            var31 = var35 + 15;
        }
        Statics.field1042 = var21;
        Statics.field1510 = var22;
        Statics.field1816 = var23;
        Statics.field89 = var24;
        Statics.field1546 = var25;
        if (field508 && class156.method2710(true, false) == 0) {
            field508 = false;
        }
        if (field508) {
            class90.method1828(arg0, arg1, arg2, arg3, 0);
            method2128(class137.field2114, false);
        }
    }

    @ObfuscatedName("ad.az(ZI)V")
    public static final void method927(boolean arg0) {
        if (Statics.field1383.field443 >> 7 == field711 && Statics.field1383.field439 >> 7 == field730) {
            field711 = 0;
        }
        int var1 = field585;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1383;
                var4 = 33538048;
            } else {
                var3 = field678[field734[var2]];
                var4 = field734[var2] << 14;
            }
            if (var3 != null && var3.method17()) {
                var3.field49 = false;
                if ((field505 && field585 > 50 || field585 > 200) && !arg0 && var3.field475 == var3.field468) {
                    var3.field49 = true;
                }
                int var5 = var3.field443 >> 7;
                int var6 = var3.field439 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field48 == null || field569 < var3.field43 || field569 >= var3.field44) {
                        if ((var3.field443 & 0x7F) == 64 && (var3.field439 & 0x7F) == 64) {
                            if (field601 == field600[var5][var6]) {
                                continue;
                            }
                            field600[var5][var6] = field601;
                        }
                        var3.field53 = method1541(var3.field443, var3.field439, Statics.field2001);
                        Statics.field29.method1901(Statics.field2001, var3.field443, var3.field439, var3.field53, 60, var3, var3.field440, var4, var3.field441);
                    } else {
                        var3.field49 = false;
                        var3.field53 = method1541(var3.field443, var3.field439, Statics.field2001);
                        Statics.field29.method1902(Statics.field2001, var3.field443, var3.field439, var3.field53, 60, var3, var3.field440, var4, var3.field54, var3.field50, var3.field51, var3.field39);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.ar(ZI)V")
    public static final void method599(boolean arg0) {
        for (int var1 = 0; var1 < field537; var1++) {
            class26 var2 = field536[field538[var1]];
            int var3 = (field538[var1] << 14) + 536870912;
            if (var2 != null && var2.method17() && var2.field413.field818 == arg0 && var2.field413.method651()) {
                int var4 = var2.field443 >> 7;
                int var5 = var2.field439 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field442 == 1 && (var2.field443 & 0x7F) == 64 && (var2.field439 & 0x7F) == 64) {
                        if (field601 == field600[var4][var5]) {
                            continue;
                        }
                        field600[var4][var5] = field601;
                    }
                    if (!var2.field413.field826) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field29.method1901(Statics.field2001, var2.field443, var2.field439, method1541(var2.field443 + (var2.field442 * 64 - 64), var2.field439 + (var2.field442 * 64 - 64), Statics.field2001), var2.field442 * 64 - 64 + 60, var2, var2.field440, var3, var2.field441);
                }
            }
        }
    }

    @ObfuscatedName("d.at(B)V")
    public static final void method123() {
        for (class10 var0 = (class10) field633.method3331(); var0 != null; var0 = (class10) field633.method3333()) {
            if (Statics.field2001 != var0.field158 || field569 > var0.field183) {
                var0.method3366();
            } else if (field569 >= var0.field163) {
                if (var0.field167 > 0) {
                    class26 var1 = field536[var0.field167 - 1];
                    if (var1 != null && var1.field443 >= 0 && var1.field443 < 13312 && var1.field439 >= 0 && var1.field439 < 13312) {
                        var0.method120(var1.field443, var1.field439, method1541(var1.field443, var1.field439, var0.field158) - var0.field179, field569);
                    }
                }
                if (var0.field167 < 0) {
                    int var2 = -var0.field167 - 1;
                    class3 var3;
                    if (field623 == var2) {
                        var3 = Statics.field1383;
                    } else {
                        var3 = field678[var2];
                    }
                    if (var3 != null && var3.field443 >= 0 && var3.field443 < 13312 && var3.field439 >= 0 && var3.field439 < 13312) {
                        var0.method120(var3.field443, var3.field439, method1541(var3.field443, var3.field439, var0.field158) - var0.field179, field569);
                    }
                }
                var0.method121(field534);
                Statics.field29.method1901(Statics.field2001, (int) var0.field177, (int) var0.field170, (int) var0.field171, 60, var0, var0.field182, -1, false);
            }
        }
    }

    @ObfuscatedName("p.af(B)V")
    public static final void method144() {
        for (class20 var0 = (class20) field634.method3331(); var0 != null; var0 = (class20) field634.method3333()) {
            if (Statics.field2001 != var0.field299 || var0.field306) {
                var0.method3366();
            } else if (field569 >= var0.field314) {
                var0.method193(field534);
                if (var0.field306) {
                    var0.method3366();
                } else {
                    Statics.field29.method1901(var0.field299, var0.field309, var0.field301, var0.field302, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ap.ay(III)V")
    public static final void method613(int arg0, int arg1) {
        if (field656 == 2) {
            method246((field689 - Statics.field949 << 7) + field523, (field619 - Statics.field2063 << 7) + field524, field522 * 2);
            if (field602 > -1 && field569 % 20 < 10) {
                Statics.field201[0].method1738(field602 + arg0 - 12, field577 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bf.as(IIIIB)V")
    public static final void method1572(int arg0, int arg1, int arg2, int arg3) {
        field590 = 0;
        for (int var4 = -1; var4 < field585 + field537; var4++) {
            class28 var5;
            if (var4 == -1) {
                var5 = Statics.field1383;
            } else if (var4 < field585) {
                var5 = field678[field734[var4]];
            } else {
                var5 = field536[field538[var4 - field585]];
            }
            if (var5 != null && var5.method17()) {
                if (var5 instanceof class26) {
                    class32 var6 = ((class26) var5).field413;
                    if (var6.field823 != null) {
                        var6 = var6.method659();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field585) {
                    class32 var9 = ((class26) var5).field413;
                    if (var9.field823 != null) {
                        var9 = var9.method659();
                    }
                    if (var9.field821 >= 0 && var9.field821 < Statics.field2448.length) {
                        method169(var5, var5.field485 + 15);
                        if (field602 > -1) {
                            Statics.field2448[var9.field821].method1738(field602 + arg0 - 12, field577 + arg1 - 30);
                        }
                    }
                    if (field656 == 1 && field754 == field538[var4 - field585] && field569 % 20 < 10) {
                        method169(var5, var5.field485 + 15);
                        if (field602 > -1) {
                            Statics.field201[0].method1738(field602 + arg0 - 12, field577 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field45 != -1 || var8.field36 != -1) {
                        method169(var5, var5.field485 + 15);
                        if (field602 > -1) {
                            if (var8.field45 != -1) {
                                Statics.field715[var8.field45].method1738(field602 + arg0 - 12, field577 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field36 != -1) {
                                Statics.field2448[var8.field36].method1738(field602 + arg0 - 12, field577 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field656 == 10 && field744 == field734[var4]) {
                        method169(var5, var5.field485 + 15);
                        if (field602 > -1) {
                            Statics.field201[1].method1738(field602 + arg0 - 12, field577 + arg1 - var7);
                        }
                    }
                }
                if (var5.field451 != null && (var4 >= field585 || field644 == 0 || field644 == 3 || field644 == 1 && method2745(((class3) var5).field52, false))) {
                    method169(var5, var5.field485);
                    if (field602 > -1 && field590 < field594) {
                        field595[field590] = Statics.field1787.method3398(var5.field451) / 2;
                        field532[field590] = Statics.field1787.field2876;
                        field592[field590] = field602;
                        field593[field590] = field577;
                        field596[field590] = var5.field480;
                        field597[field590] = var5.field454;
                        field598[field590] = var5.field452;
                        field599[field590] = var5.field451;
                        field590++;
                    }
                }
                if (var5.field458 > field569) {
                    method169(var5, var5.field485 + 15);
                    if (field602 > -1) {
                        int var10 = var5.field459 * 30 / var5.field460;
                        if (var10 > 30) {
                            var10 = 30;
                        } else if (var10 == 0 && var5.field459 > 0) {
                            var10 = 1;
                        }
                        class90.method1828(field602 + arg0 - 15, field577 + arg1 - 3, var10, 5, 65280);
                        class90.method1828(field602 + arg0 - 15 + var10, field577 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field457[var11] > field569) {
                        method169(var5, var5.field485 / 2);
                        if (field602 > -1) {
                            if (var11 == 1) {
                                field577 -= 20;
                            }
                            if (var11 == 2) {
                                field602 -= 15;
                                field577 -= 10;
                            }
                            if (var11 == 3) {
                                field602 += 15;
                                field577 -= 10;
                            }
                            Statics.field574[var5.field465[var11]].method1738(field602 + arg0 - 12, field577 + arg1 - 12);
                            Statics.field310.method3405(Integer.toString(var5.field455[var11]), field602 + arg0 - 1, field577 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field590; var12++) {
            int var13 = field592[var12];
            int var14 = field593[var12];
            int var15 = field595[var12];
            int var16 = field532[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field593[var18] - field532[var18] && var14 - var16 < field593[var18] + 2 && var13 - var15 < field595[var18] + field592[var18] && var13 + var15 > field592[var18] - field595[var18] && field593[var18] - field532[var18] < var14) {
                        var14 = field593[var18] - field532[var18];
                        var17 = true;
                    }
                }
            }
            field602 = field592[var12];
            field577 = field593[var12] = var14;
            String var19 = field599[var12];
            if (field659 == 0) {
                int var20 = 16776960;
                if (field596[var12] < 6) {
                    var20 = field565[field596[var12]];
                }
                if (field596[var12] == 6) {
                    var20 = field601 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field596[var12] == 7) {
                    var20 = field601 % 20 < 10 ? 255 : 65535;
                }
                if (field596[var12] == 8) {
                    var20 = field601 % 20 < 10 ? 45056 : 8454016;
                }
                if (field596[var12] == 9) {
                    int var21 = 150 - field598[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field596[var12] == 10) {
                    int var22 = 150 - field598[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field596[var12] == 11) {
                    int var23 = 150 - field598[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field597[var12] == 0) {
                    Statics.field1787.method3405(var19, field602 + arg0, field577 + arg1, var20, 0);
                }
                if (field597[var12] == 1) {
                    Statics.field1787.method3415(var19, field602 + arg0, field577 + arg1, var20, 0, field601);
                }
                if (field597[var12] == 2) {
                    Statics.field1787.method3408(var19, field602 + arg0, field577 + arg1, var20, 0, field601);
                }
                if (field597[var12] == 3) {
                    Statics.field1787.method3478(var19, field602 + arg0, field577 + arg1, var20, 0, field601, 150 - field598[var12]);
                }
                if (field597[var12] == 4) {
                    int var24 = (150 - field598[var12]) * (Statics.field1787.method3398(var19) + 100) / 150;
                    class90.method1839(field602 + arg0 - 50, arg1, field602 + arg0 + 50, arg1 + arg3);
                    Statics.field1787.method3429(var19, field602 + arg0 + 50 - var24, field577 + arg1, var20, 0);
                    class90.method1822(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field597[var12] == 5) {
                    int var25 = 150 - field598[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class90.method1839(arg0, field577 + arg1 - Statics.field1787.field2876 - 1, arg0 + arg2, field577 + arg1 + 5);
                    Statics.field1787.method3405(var19, field602 + arg0, field577 + arg1 + var26, var20, 0);
                    class90.method1822(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1787.method3405(var19, field602 + arg0, field577 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("u.ag(I)V")
    public static final void method132() {
        field616 = 0;
        int var0 = (Statics.field1383.field443 >> 7) + Statics.field949;
        int var1 = (Statics.field1383.field439 >> 7) + Statics.field2063;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field616 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field616 = 1;
        }
        if (field616 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field616 = 0;
        }
    }

    @ObfuscatedName("x.ac(Lao;IB)V")
    public static final void method169(class28 arg0, int arg1) {
        method246(arg0.field443, arg0.field439, arg1);
    }

    @ObfuscatedName("n.aj(IIII)V")
    public static final void method246(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field602 = -1;
            field577 = -1;
            return;
        }
        int var3 = method1541(arg0, arg1, Statics.field2001) - arg2;
        int var4 = arg0 - Statics.field1042;
        int var5 = var3 - Statics.field1510;
        int var6 = arg1 - Statics.field1816;
        int var7 = class105.field1755[Statics.field89];
        int var8 = class105.field1765[Statics.field89];
        int var9 = class105.field1755[Statics.field1546];
        int var10 = class105.field1765[Statics.field1546];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field602 = (var11 << 9) / var15 + 256;
            field577 = (var14 << 9) / var15 + 167;
        } else {
            field602 = -1;
            field577 = -1;
        }
    }

    @ObfuscatedName("bc.ab(IIIB)I")
    public static final int method1541(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field133[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field153[var5][var3][var4] + class9.field153[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field153[var5][var3][var4 + 1] + class9.field153[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("g.au(IIIIIIB)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class105.field1755[var6];
            int var12 = class105.field1765[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class105.field1755[var7];
            int var15 = class105.field1765[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1042 = arg0 - var8;
        Statics.field1510 = arg1 - var9;
        Statics.field1816 = arg2 - var10;
        Statics.field89 = arg3;
        Statics.field1546 = arg4;
    }

    @ObfuscatedName("by.bg(ZI)V")
    public static final void method1360(boolean arg0) {
        field558 = arg0;
        if (!field558) {
            int var1 = field541.method2517();
            int var2 = field541.method2456();
            int var3 = (field723 - field541.field2045) / 16;
            Statics.field63 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field63[var4][var5] = field541.method2497();
                }
            }
            int var6 = field541.method2492();
            int var7 = field541.method2456();
            int var8 = field541.method2548();
            Statics.field392 = new int[var3];
            Statics.field198 = new int[var3];
            Statics.field497 = new int[var3];
            Statics.field1338 = new byte[var3][];
            Statics.field165 = new byte[var3][];
            boolean var9 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var7 / 8 == 48) {
                var9 = true;
            }
            if (var1 / 8 == 48 && var7 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var1 - 6) / 8; var11 <= (var1 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field392[var10] = var13;
                        Statics.field198[var10] = Statics.field1648.method3035("m" + var11 + "_" + var12);
                        Statics.field497[var10] = Statics.field1648.method3035("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method195(var1, var7, var8, var6, var2);
            return;
        }
        field541.method2332();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field541.method2337(1);
                    if (var17 == 1) {
                        field559[var14][var15][var16] = field541.method2337(26);
                    } else {
                        field559[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field541.method2334();
        int var18 = (field723 - field541.field2045) / 16;
        Statics.field63 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field63[var19][var20] = field541.method2531();
            }
        }
        int var21 = field541.method2517();
        int var22 = field541.method2517();
        int var23 = field541.method2492();
        int var24 = field541.method2480();
        int var25 = field541.method2456();
        Statics.field392 = new int[var18];
        Statics.field198 = new int[var18];
        Statics.field497 = new int[var18];
        Statics.field1338 = new byte[var18][];
        Statics.field165 = new byte[var18][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field559[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field392[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field392[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field198[var26] = Statics.field1648.method3035("m" + var35 + "_" + var36);
                            Statics.field497[var26] = Statics.field1648.method3035("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method195(var21, var22, var24, var23, var25);
    }

    @ObfuscatedName("s.bw(IIIIIB)V")
    public static final void method195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field910 == arg0 && Statics.field2497 == arg1 && field499 == arg2 || !field505) {
            return;
        }
        Statics.field910 = arg0;
        Statics.field2497 = arg1;
        field499 = arg2;
        if (!field505) {
            field499 = 0;
        }
        method2989(25);
        method2128(class137.field2114, true);
        int var5 = Statics.field949;
        int var6 = Statics.field2063;
        Statics.field949 = (arg0 - 6) * 8;
        Statics.field2063 = (arg1 - 6) * 8;
        int var7 = Statics.field949 - var5;
        int var8 = Statics.field2063 - var6;
        int var9 = Statics.field949;
        int var10 = Statics.field2063;
        for (int var11 = 0; var11 < 32768; var11++) {
            class26 var12 = field536[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field490[var13] -= var7;
                    var12.field491[var13] -= var8;
                }
                var12.field443 -= var7 * 128;
                var12.field439 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field678[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field490[var16] -= var7;
                    var15.field491[var16] -= var8;
                }
                var15.field443 -= var7 * 128;
                var15.field439 -= var8 * 128;
            }
        }
        Statics.field2001 = arg2;
        Statics.field1383.method269(arg3, arg4, false);
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var7 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        byte var20 = 0;
        byte var21 = 104;
        byte var22 = 1;
        if (var8 < 0) {
            var20 = 103;
            var21 = -1;
            var22 = -1;
        }
        for (int var23 = var17; var23 != var18; var23 += var19) {
            for (int var24 = var20; var24 != var21; var24 += var22) {
                int var25 = var7 + var23;
                int var26 = var8 + var24;
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                        field553[var27][var23][var24] = field553[var27][var25][var26];
                    } else {
                        field553[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class23 var28 = (class23) field563.method3331(); var28 != null; var28 = (class23) field563.method3333()) {
            var28.field371 -= var7;
            var28.field373 -= var8;
            if (var28.field371 < 0 || var28.field373 < 0 || var28.field371 >= 104 || var28.field373 >= 104) {
                var28.method3366();
            }
        }
        if (field711 != 0) {
            field711 -= var7;
            field730 -= var8;
        }
        field737 = 0;
        field576 = false;
        field724 = -1;
        field634.method3325();
        field633.method3325();
    }

    @ObfuscatedName("bp.bm(ZB)V")
    public static final void method1286(boolean arg0) {
        method2231();
        field545++;
        if (field545 < 50 && !arg0) {
            return;
        }
        field545 = 0;
        if (field525 || Statics.field2086 == null) {
            return;
        }
        field543.method2333(253);
        try {
            Statics.field2086.method1437(field543.field2043, 0, field543.field2045);
            field543.field2045 = 0;
        } catch (IOException var2) {
            field525 = true;
        }
    }

    @ObfuscatedName("aq.bp(I)V")
    public static final void method837() {
        method1286(false);
        field552 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1338.length; var1++) {
            if (Statics.field198[var1] != -1 && Statics.field1338[var1] == null) {
                Statics.field1338[var1] = Statics.field1648.method3069(Statics.field198[var1], 0);
                if (Statics.field1338[var1] == null) {
                    var0 = false;
                    field552++;
                }
            }
            if (Statics.field497[var1] != -1 && Statics.field165[var1] == null) {
                Statics.field165[var1] = Statics.field1648.method3074(Statics.field497[var1], 0, Statics.field63[var1]);
                if (Statics.field165[var1] == null) {
                    var0 = false;
                    field552++;
                }
            }
        }
        if (!var0) {
            field556 = 1;
            return;
        }
        field554 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1338.length; var3++) {
            byte[] var4 = Statics.field165[var3];
            if (var4 != null) {
                int var5 = (Statics.field392[var3] >> 8) * 64 - Statics.field949;
                int var6 = (Statics.field392[var3] & 0xFF) * 64 - Statics.field2063;
                if (field558) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= Statics.method147(var4, var5, var6);
            }
        }
        if (!var2) {
            field556 = 2;
            return;
        }
        if (field556 != 0) {
            method2128(class137.field2114 + class2.field21 + class2.field27 + 100 + "%" + class2.field25, true);
        }
        method2231();
        method857();
        method2231();
        Statics.field29.method1919();
        method2231();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field557[var7].method2685();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class9.field133[var8][var9][var10] = 0;
                }
            }
        }
        method2231();
        class9.field138 = 99;
        Statics.field150 = new byte[4][104][104];
        Statics.field136 = new byte[4][104][104];
        Statics.field2020 = new byte[4][104][104];
        Statics.field146 = new byte[4][104][104];
        Statics.field143 = new int[4][105][105];
        Statics.field137 = new byte[4][105][105];
        Statics.field139 = new int[105][105];
        Statics.field140 = new int[104];
        Statics.field2429 = new int[104];
        Statics.field2018 = new int[104];
        Statics.field141 = new int[104];
        Statics.field142 = new int[104];
        int var11 = Statics.field1338.length;
        for (class7 var12 = (class7) class7.field115.method3331(); var12 != null; var12 = (class7) class7.field115.method3333()) {
            if (var12.field102 != null) {
                Statics.field1048.method1149(var12.field102);
                var12.field102 = null;
            }
            if (var12.field107 != null) {
                Statics.field1048.method1149(var12.field107);
                var12.field107 = null;
            }
        }
        class7.field115.method3325();
        method1286(true);
        if (!field558) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field392[var13] >> 8) * 64 - Statics.field949;
                int var15 = (Statics.field392[var13] & 0xFF) * 64 - Statics.field2063;
                byte[] var16 = Statics.field1338[var13];
                if (var16 != null) {
                    method2231();
                    class9.method2679(var16, var14, var15, Statics.field910 * 8 - 48, Statics.field2497 * 8 - 48, field557);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field392[var17] >> 8) * 64 - Statics.field949;
                int var19 = (Statics.field392[var17] & 0xFF) * 64 - Statics.field2063;
                byte[] var20 = Statics.field1338[var17];
                if (var20 == null && Statics.field2497 < 800) {
                    method2231();
                    class9.method113(var18, var19, 64, 64);
                }
            }
            method1286(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field165[var21];
                if (var22 != null) {
                    int var23 = (Statics.field392[var21] >> 8) * 64 - Statics.field949;
                    int var24 = (Statics.field392[var21] & 0xFF) * 64 - Statics.field2063;
                    method2231();
                    class9.method158(var22, var23, var24, Statics.field29, field557);
                }
            }
        }
        if (field558) {
            for (int var25 = 0; var25 < 4; var25++) {
                method2231();
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        boolean var28 = false;
                        int var29 = field559[var25][var26][var27];
                        if (var29 != -1) {
                            int var30 = var29 >> 24 & 0x3;
                            int var31 = var29 >> 1 & 0x3;
                            int var32 = var29 >> 14 & 0x3FF;
                            int var33 = var29 >> 3 & 0x7FF;
                            int var34 = (var32 / 8 << 8) + var33 / 8;
                            for (int var35 = 0; var35 < Statics.field392.length; var35++) {
                                if (Statics.field392[var35] == var34 && Statics.field1338[var35] != null) {
                                    class9.method172(Statics.field1338[var35], var25, var26 * 8, var27 * 8, var30, (var32 & 0x7) * 8, (var33 & 0x7) * 8, var31, field557);
                                    var28 = true;
                                    break;
                                }
                            }
                        }
                        if (!var28) {
                            class9.method2984(var25, var26 * 8, var27 * 8);
                        }
                    }
                }
            }
            for (int var36 = 0; var36 < 13; var36++) {
                for (int var37 = 0; var37 < 13; var37++) {
                    int var38 = field559[0][var36][var37];
                    if (var38 == -1) {
                        class9.method113(var36 * 8, var37 * 8, 8, 8);
                    }
                }
            }
            method1286(true);
            for (int var39 = 0; var39 < 4; var39++) {
                method2231();
                for (int var40 = 0; var40 < 13; var40++) {
                    label269: for (int var41 = 0; var41 < 13; var41++) {
                        int var42 = field559[var39][var40][var41];
                        if (var42 != -1) {
                            int var43 = var42 >> 24 & 0x3;
                            int var44 = var42 >> 1 & 0x3;
                            int var45 = var42 >> 14 & 0x3FF;
                            int var46 = var42 >> 3 & 0x7FF;
                            int var47 = (var45 / 8 << 8) + var46 / 8;
                            for (int var48 = 0; var48 < Statics.field392.length; var48++) {
                                if (Statics.field392[var48] == var47 && Statics.field165[var48] != null) {
                                    byte[] var49 = Statics.field165[var48];
                                    int var50 = var40 * 8;
                                    int var51 = var41 * 8;
                                    int var52 = (var45 & 0x7) * 8;
                                    int var53 = (var46 & 0x7) * 8;
                                    class96 var54 = Statics.field29;
                                    class131[] var55 = field557;
                                    class128 var56 = new class128(var49);
                                    int var57 = -1;
                                    while (true) {
                                        int var58 = var56.method2536();
                                        if (var58 == 0) {
                                            continue label269;
                                        }
                                        var57 += var58;
                                        int var59 = 0;
                                        while (true) {
                                            int var60 = var56.method2536();
                                            if (var60 == 0) {
                                                break;
                                            }
                                            var59 += var60 - 1;
                                            int var61 = var59 & 0x3F;
                                            int var62 = var59 >> 6 & 0x3F;
                                            int var63 = var59 >> 12;
                                            int var64 = var56.method2548();
                                            int var65 = var64 >> 2;
                                            int var66 = var64 & 0x3;
                                            if (var43 == var63 && var62 >= var52 && var62 < var52 + 8 && var61 >= var53 && var61 < var53 + 8) {
                                                class33 var67 = class33.method266(var57);
                                                int var68 = var50 + class163.method235(var62 & 0x7, var61 & 0x7, var44, var67.field848, var67.field865, var66);
                                                int var69 = var51 + class163.method3191(var62 & 0x7, var61 & 0x7, var44, var67.field848, var67.field865, var66);
                                                if (var68 > 0 && var69 > 0 && var68 < 103 && var69 < 103) {
                                                    int var70 = var39;
                                                    if ((class9.field133[1][var68][var69] & 0x2) == 2) {
                                                        var70 = var39 - 1;
                                                    }
                                                    class131 var71 = null;
                                                    if (var70 >= 0) {
                                                        var71 = var55[var70];
                                                    }
                                                    class9.method1887(var39, var68, var69, var57, var44 + var66 & 0x3, var65, var54, var71);
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
        method1286(true);
        method857();
        method2231();
        class9.method2048(Statics.field29, field557);
        method1286(true);
        int var72 = class9.field138;
        if (var72 > Statics.field2001) {
            var72 = Statics.field2001;
        }
        if (var72 < Statics.field2001 - 1) {
            int var73 = Statics.field2001 - 1;
        }
        if (field505) {
            Statics.field29.method1891(class9.field138);
        } else {
            Statics.field29.method1891(0);
        }
        for (int var74 = 0; var74 < 104; var74++) {
            for (int var75 = 0; var75 < 104; var75++) {
                method2317(var74, var75);
            }
        }
        method2231();
        method2326();
        class33.field843.method3265();
        if (Statics.field1289 != null) {
            field543.method2333(237);
            field543.method2454(1057001181);
        }
        if (!field558) {
            int var76 = (Statics.field910 - 6) / 8;
            int var77 = (Statics.field910 + 6) / 8;
            int var78 = (Statics.field2497 - 6) / 8;
            int var79 = (Statics.field2497 + 6) / 8;
            for (int var80 = var76 - 1; var80 <= var77 + 1; var80++) {
                for (int var81 = var78 - 1; var81 <= var79 + 1; var81++) {
                    if (var80 < var76 || var80 > var77 || var81 < var78 || var81 > var79) {
                        Statics.field1648.method3039("m" + var80 + "_" + var81);
                        Statics.field1648.method3039("l" + var80 + "_" + var81);
                    }
                }
            }
        }
        method2989(30);
        method2231();
        class9.method50();
        field543.method2333(117);
        class74.method53();
    }

    @ObfuscatedName("r.bl(II)V")
    public static final void method231(int arg0) {
        int[] var1 = Statics.field2808.field1462;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field133[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field29.method1924(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field133[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field29.method1924(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2808.method1728();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field133[arg0][var10][var9] & 0x18) == 0) {
                    method1429(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field133[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1429(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field725 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field29.method2036(Statics.field2001, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class33.method266(var14).field871;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field557[Statics.field2001].field2061;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x1240108) == 0) {
                                    var16--;
                                }
                                if (var20 == 1 && var16 < 103 && var16 < var11 + 3 && (var18[var16 + 1][var17] & 0x1240180) == 0) {
                                    var16++;
                                }
                                if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x1240102) == 0) {
                                    var17--;
                                }
                                if (var20 == 3 && var17 < 103 && var17 < var12 + 3 && (var18[var16][var17 + 1] & 0x1240120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        field728[field725] = Statics.field1803[var15];
                        field618[field725] = var16;
                        field727[field725] = var17;
                        field725++;
                    }
                }
            }
        }
        Statics.field313.method1718();
    }

    @ObfuscatedName("bh.bv(IIIIII)V")
    public static final void method1429(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field29.method1910(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field29.method2008(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2808.field1462;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class33 var13 = class33.method266(var12);
            if (var13.field878 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 1) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var7 == 3) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
            } else {
                class88 var14 = Statics.field496[var13.field878];
                if (var14 != null) {
                    int var15 = (var13.field848 * 4 - var14.field1473) / 2;
                    int var16 = (var13.field865 * 4 - var14.field1471) / 2;
                    var14.method1811(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field865) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field29.method1979(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field29.method2008(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class33 var22 = class33.method266(var21);
            if (var22.field878 != -1) {
                class88 var23 = Statics.field496[var22.field878];
                if (var23 != null) {
                    int var24 = (var22.field848 * 4 - var23.field1473) / 2;
                    int var25 = (var22.field865 * 4 - var23.field1471) / 2;
                    var23.method1811(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field865) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2808.field1462;
                int var28 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var19 == 0 || var19 == 2) {
                    var27[var28 + 1536] = var26;
                    var27[var28 + 1024 + 1] = var26;
                    var27[var28 + 512 + 2] = var26;
                    var27[var28 + 3] = var26;
                } else {
                    var27[var28] = var26;
                    var27[var28 + 512 + 1] = var26;
                    var27[var28 + 1024 + 2] = var26;
                    var27[var28 + 1536 + 3] = var26;
                }
            }
        }
        int var29 = Statics.field29.method2036(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class33 var31 = class33.method266(var30);
        if (var31.field878 == -1) {
            return;
        }
        class88 var32 = Statics.field496[var31.field878];
        if (var32 != null) {
            int var33 = (var31.field848 * 4 - var32.field1473) / 2;
            int var34 = (var31.field865 * 4 - var32.field1471) / 2;
            var32.method1811(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field865) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("y.bk(I)Z")
    public static final boolean method201() {
        if (Statics.field2086 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2086.method1435();
            if (var0 == 0) {
                return false;
            }
            if (field665 == -1) {
                Statics.field2086.method1453(field541.field2043, 0, 1);
                field541.field2045 = 0;
                field665 = field541.method2330();
                field723 = class167.field2791[field665];
                var0--;
            }
            if (field723 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2086.method1453(field541.field2043, 0, 1);
                field723 = field541.field2043[0] & 0xFF;
                var0--;
            }
            if (field723 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2086.method1453(field541.field2043, 0, 2);
                field541.field2045 = 0;
                field723 = field541.method2456();
                var0 -= 2;
            }
            if (var0 < field723) {
                return false;
            }
            field541.field2045 = 0;
            Statics.field2086.method1453(field541.field2043, 0, field723);
            field544 = 0;
            field549 = field548;
            field548 = field547;
            field547 = field665;
            if (field665 == 185) {
                method2893();
                field665 = -1;
                return false;
            }
            if (field665 == 17) {
                Statics.field1043 = field541.method2480();
                Statics.field261 = field541.method2556();
                field665 = -1;
                return true;
            }
            if (field665 == 251) {
                field541.field2045 += 28;
                if (field541.method2474()) {
                    class117 var1 = field541;
                    int var2 = field541.field2045 - 28;
                    if (class83.field1431 != null) {
                        try {
                            class83.field1431.method642(0L);
                            class83.field1431.method614(var1.field2043, var2, 24);
                        } catch (Exception var280) {
                        }
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 208) {
                String var4 = field541.method2559();
                int var5 = field541.method2456();
                byte var6 = field541.method2455();
                boolean var7 = false;
                if (var6 == -128) {
                    var7 = true;
                }
                if (var7) {
                    if (Statics.field247 == 0) {
                        field665 = -1;
                        return true;
                    }
                    boolean var8 = false;
                    int var9;
                    for (var9 = 0; var9 < Statics.field247 && (!Statics.field792[var9].field129.equals(var4) || Statics.field792[var9].field130 != var5); var9++) {
                    }
                    if (var9 < Statics.field247) {
                        while (var9 < Statics.field247 - 1) {
                            Statics.field792[var9] = Statics.field792[var9 + 1];
                            var9++;
                        }
                        Statics.field247--;
                        Statics.field792[Statics.field247] = null;
                    }
                } else {
                    field541.method2559();
                    class8 var10 = new class8();
                    var10.field129 = var4;
                    var10.field117 = class151.method1290(var10.field129, Statics.field2446);
                    var10.field130 = var5;
                    var10.field116 = var6;
                    int var11;
                    for (var11 = Statics.field247 - 1; var11 >= 0; var11--) {
                        int var12 = Statics.field792[var11].field117.compareTo(var10.field129);
                        if (var12 == 0) {
                            Statics.field792[var11].field130 = var5;
                            Statics.field792[var11].field116 = var6;
                            if (var4.equals(Statics.field1383.field52)) {
                                Statics.field30 = var6;
                            }
                            field660 = field680;
                            field665 = -1;
                            return true;
                        }
                        if (var12 < 0) {
                            break;
                        }
                    }
                    if (Statics.field247 >= Statics.field792.length) {
                        field665 = -1;
                        return true;
                    }
                    for (int var13 = Statics.field247 - 1; var13 > var11; var13--) {
                        Statics.field792[var13 + 1] = Statics.field792[var13];
                    }
                    if (Statics.field247 == 0) {
                        Statics.field792 = new class8[100];
                    }
                    Statics.field792[var11 + 1] = var10;
                    Statics.field247++;
                    if (var4.equals(Statics.field1383.field52)) {
                        Statics.field30 = var6;
                    }
                }
                field660 = field680;
                field665 = -1;
                return true;
            }
            if (field665 == 159) {
                int var14 = field541.method2456();
                int var15 = field541.method2492();
                int var16 = field541.method2592();
                int var17 = field541.method2488();
                class161 var18 = class161.method2772(var16);
                if (var18.field2666 != var14 || var18.field2673 != var15 || var18.field2669 != var17) {
                    var18.field2666 = var14;
                    var18.field2673 = var15;
                    var18.field2669 = var17;
                    method2218(var18);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 154) {
                int var19 = field541.method2531();
                class161 var20 = class161.method2772(var19);
                var20.field2658 = 3;
                var20.field2652 = Statics.field1383.field37.method3228();
                method2218(var20);
                field665 = -1;
                return true;
            }
            if (field665 == 206) {
                method2958();
                field665 = -1;
                return true;
            }
            if (field665 == 56) {
                int var21 = field541.method2517();
                int var22 = field541.method2496();
                class162.field2745[var21] = var22;
                if (class162.field2748[var21] != var22) {
                    class162.field2748[var21] = var22;
                    method3012(var21);
                }
                field738[++field682 - 1 & 0x1F] = var21;
                field665 = -1;
                return true;
            }
            if (field665 == 92) {
                int var23 = field541.method2497();
                class161 var24 = class161.method2772(var23);
                for (int var25 = 0; var25 < var24.field2742.length; var25++) {
                    var24.field2742[var25] = -1;
                    var24.field2742[var25] = 0;
                }
                method2218(var24);
                field665 = -1;
                return true;
            }
            if (field665 == 152) {
                int var26 = field541.method2592();
                class4 var27 = (class4) field658.method3314((long) var26);
                if (var27 != null) {
                    method131(var27, true);
                }
                if (field661 != null) {
                    method2218(field661);
                    field661 = null;
                }
                field665 = -1;
                return true;
            }
            if (field665 == 90) {
                for (int var28 = 0; var28 < Statics.field1060; var28++) {
                    class43 var29 = Statics.method2394(var28);
                    if (var29 != null && var29.field1055 == 0) {
                        class162.field2745[var28] = 0;
                        class162.field2748[var28] = 0;
                    }
                }
                method115();
                field682 += 32;
                field665 = -1;
                return true;
            }
            if (field665 == 227) {
                int var30 = field541.method2548();
                int var31 = field541.method2548();
                int var32 = field541.method2548();
                int var33 = field541.method2548();
                field498[var30] = true;
                field511[var30] = var31;
                field745[var30] = var32;
                field747[var30] = var33;
                field622[var30] = 0;
                field665 = -1;
                return true;
            }
            if (field665 == 13) {
                String var34 = field541.method2559();
                long var35 = (long) field541.method2456();
                long var37 = (long) field541.method2558();
                int var39 = field541.method2548();
                long var40 = (var35 << 32) + var37;
                boolean var42 = false;
                for (int var43 = 0; var43 < 100; var43++) {
                    if (field716[var43] == var40) {
                        var42 = true;
                        break;
                    }
                }
                if (method2724(var34)) {
                    var42 = true;
                }
                if (!var42 && field616 == 0) {
                    field716[field717] = var40;
                    field717 = (field717 + 1) % 100;
                    class117 var44 = field541;
                    String var48;
                    try {
                        int var45 = var44.method2536();
                        if (var45 > 32767) {
                            var45 = 32767;
                        }
                        byte[] var46 = new byte[var45];
                        var44.field2045 += Statics.field2858.method2393(var44.field2043, var44.field2045, var46, 0, var45);
                        String var47 = class152.method11(var46, 0, var45);
                        var48 = var47;
                    } catch (Exception var279) {
                        var48 = "Cabbage";
                    }
                    String var51 = class187.method3402(class150.method617(var48));
                    if (var39 == 2 || var39 == 3) {
                        method1883(7, class2.method1544(1) + var34, var51);
                    } else if (var39 == 1) {
                        method1883(7, class2.method1544(0) + var34, var51);
                    } else {
                        method1883(3, var34, var51);
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 43) {
                int var52 = field541.method2488();
                int var53 = field541.method2480();
                int var54 = field541.method2592();
                class4 var55 = (class4) field658.method3314((long) var54);
                if (var55 != null) {
                    method131(var55, var55.field57 != var52);
                }
                method729(var54, var52, var53);
                field665 = -1;
                return true;
            }
            if (field665 == 27 || field665 == 6 || field665 == 133 || field665 == 0 || field665 == 226 || field665 == 164 || field665 == 153 || field665 == 78 || field665 == 248 || field665 == 94) {
                method135();
                field665 = -1;
                return true;
            }
            if (field665 == 229) {
                if (field566 != -1) {
                    method151(field566, 0);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 233) {
                field731 = field541.method2548();
                field665 = -1;
                return true;
            }
            if (field665 == 231) {
                int var56 = field541.method2531();
                int var57 = field541.method2592();
                int var58 = field541.method2492();
                if (var58 == 65535) {
                    var58 = -1;
                }
                class161 var59 = class161.method2772(var57);
                if (var59.field2625) {
                    var59.field2659 = var58;
                    var59.field2731 = var56;
                    class41 var61 = class41.method2718(var58);
                    var59.field2666 = var61.field1025;
                    var59.field2673 = var61.field1010;
                    var59.field2668 = var61.field1011;
                    var59.field2664 = var61.field1012;
                    var59.field2709 = var61.field1013;
                    var59.field2669 = var61.field1008;
                    if (var59.field2635 > 0) {
                        var59.field2669 = var59.field2669 * 32 / var59.field2635;
                    }
                    method2218(var59);
                } else if (var58 == -1) {
                    var59.field2658 = 0;
                    field665 = -1;
                    return true;
                } else {
                    class41 var60 = class41.method2718(var58);
                    var59.field2658 = 4;
                    var59.field2652 = var58;
                    var59.field2666 = var60.field1025;
                    var59.field2673 = var60.field1010;
                    var59.field2669 = var60.field1008 * 100 / var56;
                    method2218(var59);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 145) {
                class13 var62 = new class13();
                var62.field207 = field541.method2559();
                var62.field206 = field541.method2456();
                int var63 = field541.method2592();
                var62.field205 = var63;
                method2989(45);
                Statics.field2086.method1434();
                Statics.field2086 = null;
                class22.method179(var62);
                field665 = -1;
                return false;
            }
            if (field665 == 107) {
                class184.method233(field541, field723);
                field665 = -1;
                return true;
            }
            if (field665 == 48) {
                int var64 = field541.method2517();
                if (var64 == 65535) {
                    var64 = -1;
                }
                if (var64 == -1 && !field640) {
                    Statics.field2373.method2797();
                    class141.field2377 = 1;
                    Statics.field2378 = null;
                } else if (var64 != -1 && field755 != var64 && field546 != 0 && !field640) {
                    class141.method3256(2, Statics.field97, var64, 0, field546, false);
                }
                field755 = var64;
                field665 = -1;
                return true;
            }
            if (field665 == 241) {
                int var65 = field541.method2456();
                if (var65 == 65535) {
                    var65 = -1;
                }
                int var66 = field541.method2494();
                method3258(var65, var66);
                field665 = -1;
                return true;
            }
            if (field665 == 83) {
                method115();
                field663 = field541.method2457();
                field690 = field680;
                field665 = -1;
                return true;
            }
            if (field665 == 50) {
                int var67 = field541.method2592();
                int var68 = field541.method2456();
                if (var67 < -70000) {
                    var68 += 32768;
                }
                class161 var69;
                if (var67 >= 0) {
                    var69 = class161.method2772(var67);
                } else {
                    var69 = null;
                }
                while (field541.field2045 < field723) {
                    int var70 = field541.method2536();
                    int var71 = field541.method2456();
                    int var72 = 0;
                    if (var71 != 0) {
                        var72 = field541.method2548();
                        if (var72 == 255) {
                            var72 = field541.method2592();
                        }
                    }
                    if (var69 != null && var70 >= 0 && var70 < var69.field2742.length) {
                        var69.field2742[var70] = var71;
                        var69.field2729[var70] = var72;
                    }
                    class19.method243(var68, var70, var71 - 1, var72);
                }
                if (var69 != null) {
                    method2218(var69);
                }
                method115();
                field683[++field614 - 1 & 0x1F] = var68 & 0x7FFF;
                field665 = -1;
                return true;
            }
            if (field665 == 221) {
                field576 = true;
                Statics.field895 = field541.method2548();
                Statics.field1753 = field541.method2548();
                Statics.field414 = field541.method2456();
                Statics.field1057 = field541.method2548();
                Statics.field1795 = field541.method2548();
                if (Statics.field1795 >= 100) {
                    Statics.field1042 = Statics.field895 * 128 + 64;
                    Statics.field1816 = Statics.field1753 * 128 + 64;
                    Statics.field1510 = method1541(Statics.field1042, Statics.field1816, Statics.field2001) - Statics.field414;
                }
                field665 = -1;
                return true;
            }
            if (field665 == 172) {
                Statics.field261 = field541.method2556();
                Statics.field1043 = field541.method2548();
                for (int var73 = Statics.field1043; var73 < Statics.field1043 + 8; var73++) {
                    for (int var74 = Statics.field261; var74 < Statics.field261 + 8; var74++) {
                        if (field553[Statics.field2001][var73][var74] != null) {
                            field553[Statics.field2001][var73][var74] = null;
                            method2317(var73, var74);
                        }
                    }
                }
                for (class23 var75 = (class23) field563.method3331(); var75 != null; var75 = (class23) field563.method3333()) {
                    if (var75.field371 >= Statics.field1043 && var75.field371 < Statics.field1043 + 8 && var75.field373 >= Statics.field261 && var75.field373 < Statics.field261 + 8 && Statics.field2001 == var75.field379) {
                        var75.field381 = 0;
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 147) {
                while (field541.field2045 < field723) {
                    int var76 = field541.method2548();
                    boolean var77 = (var76 & 0x1) == 1;
                    String var78 = field541.method2559();
                    String var79 = field541.method2559();
                    field541.method2559();
                    for (int var80 = 0; var80 < field753; var80++) {
                        class11 var81 = field530[var80];
                        if (var77) {
                            if (var79.equals(var81.field185)) {
                                var81.field185 = var78;
                                var81.field186 = var79;
                                var78 = null;
                                break;
                            }
                        } else if (var78.equals(var81.field185)) {
                            var81.field185 = var78;
                            var81.field186 = var79;
                            var78 = null;
                            break;
                        }
                    }
                    if (var78 != null && field753 < 400) {
                        class11 var82 = new class11();
                        field530[field753] = var82;
                        var82.field185 = var78;
                        var82.field186 = var79;
                        field753++;
                    }
                }
                field688 = field680;
                field665 = -1;
                return true;
            }
            if (field665 == 203) {
                int var83 = field541.method2488();
                int var84 = field541.method2592();
                class161 var85 = class161.method2772(var84);
                if (var85 != null && var85.field2628 == 0) {
                    if (var83 > var85.field2654 - var85.field2624) {
                        var83 = var85.field2654 - var85.field2624;
                    }
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var85.field2640 != var83) {
                        var85.field2640 = var83;
                        method2218(var85);
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 188) {
                int var86 = field541.method2531();
                boolean var87 = field541.method2556() == 1;
                class161 var88 = class161.method2772(var86);
                if (var88.field2638 != var87) {
                    var88.field2638 = var87;
                    method2218(var88);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 232) {
                field660 = field680;
                if (field723 == 0) {
                    field722 = null;
                    field729 = null;
                    Statics.field247 = 0;
                    Statics.field792 = null;
                    field665 = -1;
                    return true;
                }
                field729 = field541.method2559();
                long var89 = field541.method2460();
                long var91 = var89;
                String var93;
                if (var89 <= 0L || var89 >= 6582952005840035281L) {
                    var93 = null;
                } else if (var89 % 37L == 0L) {
                    var93 = null;
                } else {
                    int var94 = 0;
                    for (long var95 = var89; var95 != 0L; var95 /= 37L) {
                        var94++;
                    }
                    StringBuilder var97 = new StringBuilder(var94);
                    while (var91 != 0L) {
                        long var98 = var91;
                        var91 /= 37L;
                        var97.append(class149.field2491[(int) (var98 - var91 * 37L)]);
                    }
                    var93 = var97.reverse().toString();
                }
                field722 = var93;
                Statics.field1850 = field541.method2455();
                int var100 = field541.method2548();
                if (var100 == 255) {
                    field665 = -1;
                    return true;
                }
                Statics.field247 = var100;
                class8[] var101 = new class8[100];
                for (int var102 = 0; var102 < Statics.field247; var102++) {
                    var101[var102] = new class8();
                    var101[var102].field129 = field541.method2559();
                    var101[var102].field117 = class151.method1290(var101[var102].field129, Statics.field2446);
                    var101[var102].field130 = field541.method2456();
                    var101[var102].field116 = field541.method2455();
                    field541.method2559();
                    if (var101[var102].field129.equals(Statics.field1383.field52)) {
                        Statics.field30 = var101[var102].field116;
                    }
                }
                boolean var103 = false;
                int var104 = Statics.field247;
                while (var104 > 0) {
                    boolean var105 = true;
                    var104--;
                    for (int var106 = 0; var106 < var104; var106++) {
                        if (var101[var106].field117.compareTo(var101[var106 + 1].field117) > 0) {
                            class8 var107 = var101[var106];
                            var101[var106] = var101[var106 + 1];
                            var101[var106 + 1] = var107;
                            var105 = false;
                        }
                    }
                    if (var105) {
                        break;
                    }
                }
                Statics.field792 = var101;
                field665 = -1;
                return true;
            }
            if (field665 == 7) {
                int var108 = field541.method2496();
                Statics.field88 = Statics.field200.method1547(var108);
                field665 = -1;
                return true;
            }
            if (field665 == 62) {
                String var109 = field541.method2559();
                int var110 = field541.method2548();
                int var111 = field541.method2548();
                if (var110 >= 1 && var110 <= 8) {
                    if (var109.equalsIgnoreCase("null")) {
                        var109 = null;
                    }
                    field628[var110 - 1] = var109;
                    field629[var110 - 1] = var111 == 0;
                }
                field665 = -1;
                return true;
            }
            if (field665 == 115) {
                int var112 = field541.method2592();
                int var113 = field541.method2492();
                if (var113 == 65535) {
                    var113 = -1;
                }
                int var114 = field541.method2517();
                if (var114 == 65535) {
                    var114 = -1;
                }
                int var115 = field541.method2592();
                for (int var116 = var114; var116 <= var113; var116++) {
                    long var117 = ((long) var115 << 32) + (long) var116;
                    class181 var119 = field575.method3314(var117);
                    if (var119 != null) {
                        var119.method3366();
                    }
                    field575.method3311(new class173(var112), var117);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 216) {
                int var120 = field541.method2456();
                field566 = var120;
                method592(var120);
                class27.method1229(field566);
                for (int var121 = 0; var121 < 100; var121++) {
                    field700[var121] = true;
                }
                field665 = -1;
                return true;
            }
            if (field665 == 171) {
                method115();
                field662 = field541.method2548();
                field690 = field680;
                field665 = -1;
                return true;
            }
            if (field665 == 109) {
                int var122 = field723 + field541.field2045;
                int var123 = field541.method2456();
                int var124 = field541.method2456();
                if (field566 != var123) {
                    field566 = var123;
                    method592(field566);
                    class27.method1229(field566);
                    for (int var125 = 0; var125 < 100; var125++) {
                        field700[var125] = true;
                    }
                }
                while (var124-- > 0) {
                    int var126 = field541.method2592();
                    int var127 = field541.method2456();
                    int var128 = field541.method2548();
                    class4 var129 = (class4) field658.method3314((long) var126);
                    if (var129 != null && var129.field57 != var127) {
                        method131(var129, true);
                        var129 = null;
                    }
                    if (var129 == null) {
                        var129 = method729(var126, var127, var128);
                    }
                    var129.field67 = true;
                }
                for (class4 var130 = (class4) field658.method3313(); var130 != null; var130 = (class4) field658.method3323()) {
                    if (var130.field67) {
                        var130.field67 = false;
                    } else {
                        method131(var130, true);
                    }
                }
                field575 = new class177(512);
                while (field541.field2045 < var122) {
                    int var131 = field541.method2592();
                    int var132 = field541.method2456();
                    int var133 = field541.method2456();
                    int var134 = field541.method2592();
                    for (int var135 = var132; var135 <= var133; var135++) {
                        long var136 = ((long) var131 << 32) + (long) var135;
                        field575.method3311(new class173(var134), var136);
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 51) {
                int var138 = field541.method2456();
                int var139 = field541.method2592();
                class161 var140 = class161.method2772(var139);
                if (var140.field2658 != 1 || var140.field2652 != var138) {
                    var140.field2658 = 1;
                    var140.field2652 = var138;
                    method2218(var140);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 9) {
                Statics.field1043 = field541.method2548();
                Statics.field261 = field541.method2480();
                while (field541.field2045 < field723) {
                    field665 = field541.method2548();
                    method135();
                }
                field665 = -1;
                return true;
            }
            if (field665 == 169) {
                while (field541.field2045 < field723) {
                    boolean var141 = field541.method2548() == 1;
                    String var142 = field541.method2559();
                    String var143 = field541.method2559();
                    int var144 = field541.method2456();
                    int var145 = field541.method2548();
                    int var146 = field541.method2548();
                    boolean var147 = (var146 & 0x2) != 0;
                    boolean var148 = (var146 & 0x1) != 0;
                    if (var144 > 0) {
                        field541.method2559();
                        field541.method2548();
                        field541.method2592();
                    }
                    field541.method2559();
                    for (int var149 = 0; var149 < field749; var149++) {
                        class24 var150 = field751[var149];
                        if (var141) {
                            if (var143.equals(var150.field385)) {
                                var150.field385 = var142;
                                var150.field386 = var143;
                                var142 = null;
                                break;
                            }
                        } else if (var142.equals(var150.field385)) {
                            if (var150.field387 != var144) {
                                boolean var151 = true;
                                for (class29 var152 = (class29) field752.method3296(); var152 != null; var152 = (class29) field752.method3295()) {
                                    if (var152.field765.equals(var142)) {
                                        if (var144 != 0 && var152.field764 == 0) {
                                            var152.method3363();
                                            var151 = false;
                                        } else if (var144 == 0 && var152.field764 != 0) {
                                            var152.method3363();
                                            var151 = false;
                                        }
                                    }
                                }
                                if (var151) {
                                    field752.method3297(new class29(var142, var144));
                                }
                                var150.field387 = var144;
                            }
                            var150.field386 = var143;
                            var150.field388 = var145;
                            var150.field391 = var147;
                            var150.field390 = var148;
                            var142 = null;
                            break;
                        }
                    }
                    if (var142 != null && field749 < 400) {
                        class24 var153 = new class24();
                        field751[field749] = var153;
                        var153.field385 = var142;
                        var153.field386 = var143;
                        var153.field387 = var144;
                        var153.field388 = var145;
                        var153.field391 = var147;
                        var153.field390 = var148;
                        field749++;
                    }
                }
                field750 = 2;
                field688 = field680;
                boolean var154 = false;
                int var155 = field749;
                while (var155 > 0) {
                    boolean var156 = true;
                    var155--;
                    for (int var157 = 0; var157 < var155; var157++) {
                        boolean var158 = false;
                        class24 var159 = field751[var157];
                        class24 var160 = field751[var157 + 1];
                        if (field603 != var159.field387 && field603 == var160.field387) {
                            var158 = true;
                        }
                        if (!var158 && var159.field387 == 0 && var160.field387 != 0) {
                            var158 = true;
                        }
                        if (!var158 && !var159.field391 && var160.field391) {
                            var158 = true;
                        }
                        if (!var158 && !var159.field390 && var160.field390) {
                            var158 = true;
                        }
                        if (var158) {
                            class24 var161 = field751[var157];
                            field751[var157] = field751[var157 + 1];
                            field751[var157 + 1] = var161;
                            var156 = false;
                        }
                    }
                    if (var156) {
                        break;
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 194) {
                int var162 = field541.method2456();
                int var163 = field541.method2531();
                class161 var164 = class161.method2772(var163);
                if (var164.field2658 != 2 || var164.field2652 != var162) {
                    var164.field2658 = 2;
                    var164.field2652 = var162;
                    method2218(var164);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 88) {
                int var165 = field541.method2592();
                int var166 = field541.method2456();
                if (var165 < -70000) {
                    var166 += 32768;
                }
                class161 var167;
                if (var165 >= 0) {
                    var167 = class161.method2772(var165);
                } else {
                    var167 = null;
                }
                if (var167 != null) {
                    for (int var168 = 0; var168 < var167.field2742.length; var168++) {
                        var167.field2742[var168] = 0;
                        var167.field2729[var168] = 0;
                    }
                }
                class19.method2130(var166);
                int var169 = field541.method2456();
                for (int var170 = 0; var170 < var169; var170++) {
                    int var171 = field541.method2480();
                    if (var171 == 255) {
                        var171 = field541.method2592();
                    }
                    int var172 = field541.method2456();
                    if (var167 != null && var170 < var167.field2742.length) {
                        var167.field2742[var170] = var172;
                        var167.field2729[var170] = var171;
                    }
                    class19.method243(var166, var170, var172 - 1, var171);
                }
                if (var167 != null) {
                    method2218(var167);
                }
                method115();
                field683[++field614 - 1 & 0x1F] = var166 & 0x7FFF;
                field665 = -1;
                return true;
            }
            if (field665 == 210) {
                for (int var173 = 0; var173 < field678.length; var173++) {
                    if (field678[var173] != null) {
                        field678[var173].field450 = -1;
                    }
                }
                for (int var174 = 0; var174 < field536.length; var174++) {
                    if (field536[var174] != null) {
                        field536[var174].field450 = -1;
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 143) {
                int var175 = field541.method2456();
                int var176 = field541.method2548();
                int var177 = field541.method2456();
                method2399(var175, var176, var177);
                field665 = -1;
                return true;
            }
            if (field665 == 75) {
                field711 = field541.method2548();
                if (field711 == 255) {
                    field711 = 0;
                }
                field730 = field541.method2548();
                if (field730 == 255) {
                    field730 = 0;
                }
                field665 = -1;
                return true;
            }
            if (field665 == 58) {
                int var178 = field541.method2536();
                boolean var179 = field541.method2548() == 1;
                String var180 = "";
                boolean var181 = false;
                if (var179) {
                    var180 = field541.method2559();
                    if (method2724(var180)) {
                        var181 = true;
                    }
                }
                String var182 = field541.method2559();
                if (!var181) {
                    method1883(var178, var180, var182);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 124) {
                int var183 = field541.method2489();
                int var184 = field541.method2496();
                class161 var185 = class161.method2772(var184);
                if (var185.field2662 != var183 || var183 == -1) {
                    var185.field2662 = var183;
                    var185.field2732 = 0;
                    var185.field2733 = 0;
                    method2218(var185);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 102) {
                field750 = 1;
                field688 = field680;
                field665 = -1;
                return true;
            }
            if (field665 == 176) {
                int var186 = field541.method2456();
                class19.method163(var186);
                field683[++field614 - 1 & 0x1F] = var186 & 0x7FFF;
                field665 = -1;
                return true;
            }
            if (field665 == 117) {
                field576 = false;
                for (int var187 = 0; var187 < 5; var187++) {
                    field498[var187] = false;
                }
                field665 = -1;
                return true;
            }
            if (field665 == 162) {
                int var188 = field541.method2488();
                byte var189 = field541.method2481();
                class162.field2745[var188] = var189;
                if (class162.field2748[var188] != var189) {
                    class162.field2748[var188] = var189;
                    method3012(var188);
                }
                field738[++field682 - 1 & 0x1F] = var188;
                field665 = -1;
                return true;
            }
            if (field665 == 79) {
                field656 = field541.method2548();
                if (field656 == 1) {
                    field754 = field541.method2456();
                }
                if (field656 >= 2 && field656 <= 6) {
                    if (field656 == 2) {
                        field523 = 64;
                        field524 = 64;
                    }
                    if (field656 == 3) {
                        field523 = 0;
                        field524 = 64;
                    }
                    if (field656 == 4) {
                        field523 = 128;
                        field524 = 64;
                    }
                    if (field656 == 5) {
                        field523 = 64;
                        field524 = 0;
                    }
                    if (field656 == 6) {
                        field523 = 64;
                        field524 = 128;
                    }
                    field656 = 2;
                    field689 = field541.method2456();
                    field619 = field541.method2456();
                    field522 = field541.method2548();
                }
                if (field656 == 10) {
                    field744 = field541.method2456();
                }
                field665 = -1;
                return true;
            }
            if (field665 == 244) {
                String var190 = field541.method2559();
                class117 var191 = field541;
                String var195;
                try {
                    int var192 = var191.method2536();
                    if (var192 > 32767) {
                        var192 = 32767;
                    }
                    byte[] var193 = new byte[var192];
                    var191.field2045 += Statics.field2858.method2393(var191.field2043, var191.field2045, var193, 0, var192);
                    String var194 = class152.method11(var193, 0, var192);
                    var195 = var194;
                } catch (Exception var278) {
                    var195 = "Cabbage";
                }
                String var198 = class187.method3402(class150.method617(var195));
                method1883(6, var190, var198);
                field665 = -1;
                return true;
            }
            if (field665 == 196) {
                method1360(true);
                field665 = -1;
                return true;
            }
            if (field665 == 183) {
                String var199 = field541.method2559();
                int var200 = field541.method2592();
                class161 var201 = class161.method2772(var200);
                if (!var199.equals(var201.field2705)) {
                    var201.field2705 = var199;
                    method2218(var201);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 77) {
                String var202 = field541.method2559();
                Object[] var203 = new Object[var202.length() + 1];
                for (int var204 = var202.length() - 1; var204 >= 0; var204--) {
                    if (var202.charAt(var204) == 's') {
                        var203[var204 + 1] = field541.method2559();
                    } else {
                        var203[var204 + 1] = Integer.valueOf(field541.method2592());
                    }
                }
                var203[0] = Integer.valueOf(field541.method2592());
                class1 var205 = new class1();
                var205.field12 = var203;
                class27.method865(var205);
                field665 = -1;
                return true;
            }
            if (field665 == 155) {
                for (int var206 = 0; var206 < class162.field2748.length; var206++) {
                    if (class162.field2748[var206] != class162.field2745[var206]) {
                        class162.field2748[var206] = class162.field2745[var206];
                        method3012(var206);
                        field738[++field682 - 1 & 0x1F] = var206;
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 55) {
                method1360(false);
                field665 = -1;
                return true;
            }
            if (field665 == 150) {
                field691 = field541.method2456() * 30;
                field690 = field680;
                field665 = -1;
                return true;
            }
            if (field665 == 98) {
                field644 = field541.method2548();
                field578 = field541.method2548();
                field665 = -1;
                return true;
            }
            if (field665 == 82) {
                method115();
                int var207 = field541.method2556();
                int var208 = field541.method2496();
                int var209 = field541.method2479();
                field712[var207] = var208;
                field635[var207] = var209;
                field703[var207] = 1;
                for (int var210 = 0; var210 < 98; var210++) {
                    if (var208 >= class132.field2068[var210]) {
                        field703[var207] = var210 + 2;
                    }
                }
                field685[++field681 - 1 & 0x1F] = var207;
                field665 = -1;
                return true;
            }
            if (field665 == 166) {
                Statics.field438 = class140.method2323(field541.method2548());
                field665 = -1;
                return true;
            }
            if (field665 == 163) {
                int var211 = field541.method2491();
                int var212 = field541.method2501();
                int var213 = field541.method2531();
                class161 var214 = class161.method2772(var213);
                int var215 = var214.field2695 + var212;
                int var216 = var214.field2634 + var211;
                if (var214.field2631 != var215 || var214.field2632 != var216) {
                    var214.field2631 = var215;
                    var214.field2632 = var216;
                    method2218(var214);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 42) {
                field625 = 0;
                field550 = 0;
                method2321();
                int var217 = field541.method2337(8);
                if (var217 < field585) {
                    for (int var218 = var217; var218 < field585; var218++) {
                        field697[++field625 - 1] = field734[var218];
                    }
                }
                if (var217 > field585) {
                    throw new RuntimeException("");
                }
                field585 = 0;
                for (int var219 = 0; var219 < var217; var219++) {
                    int var220 = field734[var219];
                    class3 var221 = field678[var220];
                    int var222 = field541.method2337(1);
                    if (var222 == 0) {
                        field734[++field585 - 1] = var220;
                        var221.field495 = field569;
                    } else {
                        int var223 = field541.method2337(2);
                        if (var223 == 0) {
                            field734[++field585 - 1] = var220;
                            var221.field495 = field569;
                            field621[++field550 - 1] = var220;
                        } else if (var223 == 1) {
                            field734[++field585 - 1] = var220;
                            var221.field495 = field569;
                            int var224 = field541.method2337(3);
                            var221.method285(var224, false);
                            int var225 = field541.method2337(1);
                            if (var225 == 1) {
                                field621[++field550 - 1] = var220;
                            }
                        } else if (var223 == 2) {
                            field734[++field585 - 1] = var220;
                            var221.field495 = field569;
                            int var226 = field541.method2337(3);
                            var221.method285(var226, true);
                            int var227 = field541.method2337(3);
                            var221.method285(var227, true);
                            int var228 = field541.method2337(1);
                            if (var228 == 1) {
                                field621[++field550 - 1] = var220;
                            }
                        } else if (var223 == 3) {
                            field697[++field625 - 1] = var220;
                        }
                    }
                }
                method1337();
                method30();
                for (int var229 = 0; var229 < field625; var229++) {
                    int var230 = field697[var229];
                    if (field569 != field678[var230].field495) {
                        field678[var230] = null;
                    }
                }
                if (field723 != field541.field2045) {
                    throw new RuntimeException(field541.field2045 + class2.field22 + field723);
                }
                for (int var231 = 0; var231 < field585; var231++) {
                    if (field678[field734[var231]] == null) {
                        throw new RuntimeException(var231 + class2.field22 + field585);
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 220) {
                int var232 = field541.method2497();
                int var233 = field541.method2456();
                int var234 = var233 >> 10 & 0x1F;
                int var235 = var233 >> 5 & 0x1F;
                int var236 = var233 & 0x1F;
                int var237 = (var236 << 3) + (var234 << 19) + (var235 << 11);
                class161 var238 = class161.method2772(var232);
                if (var238.field2643 != var237) {
                    var238.field2643 = var237;
                    method2218(var238);
                }
                field665 = -1;
                return true;
            }
            if (field665 == 127) {
                String var239 = field541.method2559();
                long var240 = field541.method2460();
                long var242 = (long) field541.method2456();
                long var244 = (long) field541.method2558();
                int var246 = field541.method2548();
                long var247 = (var242 << 32) + var244;
                boolean var249 = false;
                for (int var250 = 0; var250 < 100; var250++) {
                    if (field716[var250] == var247) {
                        var249 = true;
                        break;
                    }
                }
                if (var246 <= 1 && method2724(var239)) {
                    var249 = true;
                }
                if (!var249 && field616 == 0) {
                    field716[field717] = var247;
                    field717 = (field717 + 1) % 100;
                    class117 var251 = field541;
                    String var255;
                    try {
                        int var252 = var251.method2536();
                        if (var252 > 32767) {
                            var252 = 32767;
                        }
                        byte[] var253 = new byte[var252];
                        var251.field2045 += Statics.field2858.method2393(var251.field2043, var251.field2045, var253, 0, var252);
                        String var254 = class152.method11(var253, 0, var252);
                        var255 = var254;
                    } catch (Exception var277) {
                        var255 = "Cabbage";
                    }
                    String var258 = class187.method3402(class150.method617(var255));
                    if (var246 == 2 || var246 == 3) {
                        method2894(9, class2.method1544(1) + var239, var258, class149.method2842(var240));
                    } else if (var246 == 1) {
                        method2894(9, class2.method1544(0) + var239, var258, class149.method2842(var240));
                    } else {
                        method2894(9, var239, var258, class149.method2842(var240));
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 156) {
                int var259 = field541.method2517();
                int var260 = field541.method2592();
                int var261 = field541.method2456();
                class161 var262 = class161.method2772(var260);
                var262.field2667 = (var261 << 16) + var259;
                field665 = -1;
                return true;
            }
            if (field665 == 141) {
                field576 = true;
                Statics.field154 = field541.method2548();
                Statics.field122 = field541.method2548();
                Statics.field275 = field541.method2456();
                Statics.field955 = field541.method2548();
                Statics.field417 = field541.method2548();
                if (Statics.field417 >= 100) {
                    int var263 = Statics.field154 * 128 + 64;
                    int var264 = Statics.field122 * 128 + 64;
                    int var265 = method1541(var263, var264, Statics.field2001) - Statics.field275;
                    int var266 = var263 - Statics.field1042;
                    int var267 = var265 - Statics.field1510;
                    int var268 = var264 - Statics.field1816;
                    int var269 = (int) Math.sqrt((double) (var266 * var266 + var268 * var268));
                    Statics.field89 = (int) (Math.atan2((double) var267, (double) var269) * 325.949D) & 0x7FF;
                    Statics.field1546 = (int) (Math.atan2((double) var266, (double) var268) * -325.949D) & 0x7FF;
                    if (Statics.field89 < 128) {
                        Statics.field89 = 128;
                    }
                    if (Statics.field89 > 383) {
                        Statics.field89 = 383;
                    }
                }
                field665 = -1;
                return true;
            }
            if (field665 == 202) {
                int var270 = field541.method2556();
                int var271 = field541.method2556();
                int var272 = field541.method2548();
                Statics.field2001 = var270 >> 1;
                Statics.field1383.method269(var272, var271, (var270 & 0x1) == 1);
                field665 = -1;
                return true;
            }
            class81.method1452("" + field665 + class2.field22 + field548 + class2.field22 + field549 + class2.field22 + field723, (Throwable) null);
            method2893();
        } catch (IOException var281) {
            method237();
        } catch (Exception var282) {
            String var275 = "" + field665 + class2.field22 + field548 + class2.field22 + field549 + class2.field22 + field723 + class2.field22 + (Statics.field949 + Statics.field1383.field490[0]) + class2.field22 + (Statics.field2063 + Statics.field1383.field491[0]) + class2.field22;
            for (int var276 = 0; var276 < field723 && var276 < 50; var276++) {
                var275 = var275 + field541.field2043[var276] + class2.field22;
            }
            class81.method1452(var275, var282);
            method2893();
        }
        return true;
    }

    @ObfuscatedName("p.bd(S)V")
    public static final void method135() {
        if (field665 == 133) {
            byte var0 = field541.method2481();
            byte var1 = field541.method2533();
            int var2 = field541.method2517();
            int var3 = field541.method2479();
            int var4 = (var3 >> 4 & 0x7) + Statics.field1043;
            int var5 = (var3 & 0x7) + Statics.field261;
            int var6 = field541.method2488();
            int var7 = field541.method2456();
            int var8 = field541.method2488();
            int var9 = field541.method2556();
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = field560[var10];
            byte var13 = field541.method2481();
            byte var14 = field541.method2481();
            class3 var15;
            if (field623 == var7) {
                var15 = Statics.field1383;
            } else {
                var15 = field678[var7];
            }
            if (var15 != null) {
                class33 var16 = class33.method266(var6);
                int var17;
                int var18;
                if (var11 == 1 || var11 == 3) {
                    var17 = var16.field865;
                    var18 = var16.field848;
                } else {
                    var17 = var16.field848;
                    var18 = var16.field865;
                }
                int var19 = (var17 >> 1) + var4;
                int var20 = (var17 + 1 >> 1) + var4;
                int var21 = (var18 >> 1) + var5;
                int var22 = (var18 + 1 >> 1) + var5;
                int[][] var23 = class9.field153[Statics.field2001];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var4 << 7) + (var17 << 6);
                int var26 = (var5 << 7) + (var18 << 6);
                class113 var27 = var16.method689(var10, var11, var23, var25, var24, var26);
                if (var27 != null) {
                    method127(Statics.field2001, var4, var5, var12, -1, 0, 0, var8 + 1, var2 + 1);
                    var15.field43 = field569 + var8;
                    var15.field44 = field569 + var2;
                    var15.field48 = var27;
                    var15.field38 = var4 * 128 + var17 * 64;
                    var15.field42 = var5 * 128 + var18 * 64;
                    var15.field46 = var24;
                    if (var13 > var1) {
                        byte var28 = var13;
                        var13 = var1;
                        var1 = var28;
                    }
                    if (var14 > var0) {
                        byte var29 = var14;
                        var14 = var0;
                        var0 = var29;
                    }
                    var15.field54 = var4 + var13;
                    var15.field51 = var1 + var4;
                    var15.field50 = var5 + var14;
                    var15.field39 = var0 + var5;
                }
            }
        }
        if (field665 == 226) {
            int var30 = field541.method2548();
            int var31 = (var30 >> 4 & 0x7) + Statics.field1043;
            int var32 = (var30 & 0x7) + Statics.field261;
            int var33 = var31 + field541.method2455();
            int var34 = var32 + field541.method2455();
            int var35 = field541.method2457();
            int var36 = field541.method2456();
            int var37 = field541.method2548() * 4;
            int var38 = field541.method2548() * 4;
            int var39 = field541.method2456();
            int var40 = field541.method2456();
            int var41 = field541.method2548();
            int var42 = field541.method2548();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                int var46 = var34 * 128 + 64;
                class10 var47 = new class10(var36, Statics.field2001, var43, var44, method1541(var43, var44, Statics.field2001) - var37, field569 + var39, field569 + var40, var41, var42, var35, var38);
                var47.method120(var45, var46, method1541(var45, var46, Statics.field2001) - var38, field569 + var39);
                field633.method3328(var47);
            }
            return;
        }
        if (field665 == 27) {
            int var48 = field541.method2548();
            int var49 = (var48 >> 4 & 0x7) + Statics.field1043;
            int var50 = (var48 & 0x7) + Statics.field261;
            int var51 = field541.method2456();
            int var52 = field541.method2548();
            int var53 = var52 >> 4 & 0xF;
            int var54 = var52 & 0x7;
            int var55 = field541.method2548();
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                int var56 = var53 + 1;
                if (Statics.field1383.field490[0] >= var49 - var56 && Statics.field1383.field490[0] <= var49 + var56 && Statics.field1383.field491[0] >= var50 - var56 && Statics.field1383.field491[0] <= var50 + var56 && field736 != 0 && var54 > 0 && field737 < 50) {
                    field748[field737] = var51;
                    field739[field737] = var54;
                    field740[field737] = var55;
                    field759[field737] = null;
                    field542[field737] = (var49 << 16) + (var50 << 8) + var53;
                    field737++;
                }
            }
        }
        if (field665 == 248) {
            int var57 = field541.method2548();
            int var58 = var57 >> 2;
            int var59 = var57 & 0x3;
            int var60 = field560[var58];
            int var61 = field541.method2548();
            int var62 = (var61 >> 4 & 0x7) + Statics.field1043;
            int var63 = (var61 & 0x7) + Statics.field261;
            if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                method127(Statics.field2001, var62, var63, var60, -1, var58, var59, 0, -1);
            }
        } else if (field665 == 153) {
            int var64 = field541.method2479();
            int var65 = (var64 >> 4 & 0x7) + Statics.field1043;
            int var66 = (var64 & 0x7) + Statics.field261;
            int var67 = field541.method2456();
            int var68 = field541.method2456();
            if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                class17 var69 = new class17();
                var69.field267 = var67;
                var69.field263 = var68;
                if (field553[Statics.field2001][var65][var66] == null) {
                    field553[Statics.field2001][var65][var66] = new class179();
                }
                field553[Statics.field2001][var65][var66].method3328(var69);
                method2317(var65, var66);
            }
        } else if (field665 == 78) {
            int var70 = field541.method2492();
            int var71 = field541.method2480();
            int var72 = var71 >> 2;
            int var73 = var71 & 0x3;
            int var74 = field560[var72];
            int var75 = field541.method2480();
            int var76 = (var75 >> 4 & 0x7) + Statics.field1043;
            int var77 = (var75 & 0x7) + Statics.field261;
            if (var76 >= 0 && var77 >= 0 && var76 < 103 && var77 < 103) {
                if (var74 == 0) {
                    class97 var78 = Statics.field29.method1912(Statics.field2001, var76, var77);
                    if (var78 != null) {
                        int var79 = var78.field1618 >> 14 & 0x7FFF;
                        if (var72 == 2) {
                            var78.field1613 = new class14(var79, 2, var73 + 4, Statics.field2001, var76, var77, var70, false, var78.field1613);
                            var78.field1617 = new class14(var79, 2, var73 + 1 & 0x3, Statics.field2001, var76, var77, var70, false, var78.field1617);
                        } else {
                            var78.field1613 = new class14(var79, var72, var73, Statics.field2001, var76, var77, var70, false, var78.field1613);
                        }
                    }
                }
                if (var74 == 1) {
                    class109 var80 = Statics.field29.method1913(Statics.field2001, var76, var77);
                    if (var80 != null) {
                        int var81 = var80.field1808 >> 14 & 0x7FFF;
                        if (var72 == 4 || var72 == 5) {
                            var80.field1811 = new class14(var81, 4, var73, Statics.field2001, var76, var77, var70, false, var80.field1811);
                        } else if (var72 == 6) {
                            var80.field1811 = new class14(var81, 4, var73 + 4, Statics.field2001, var76, var77, var70, false, var80.field1811);
                        } else if (var72 == 7) {
                            var80.field1811 = new class14(var81, 4, (var73 + 2 & 0x3) + 4, Statics.field2001, var76, var77, var70, false, var80.field1811);
                        } else if (var72 == 8) {
                            var80.field1811 = new class14(var81, 4, var73 + 4, Statics.field2001, var76, var77, var70, false, var80.field1811);
                            var80.field1807 = new class14(var81, 4, (var73 + 2 & 0x3) + 4, Statics.field2001, var76, var77, var70, false, var80.field1807);
                        }
                    }
                }
                if (var74 == 2) {
                    class99 var82 = Statics.field29.method1914(Statics.field2001, var76, var77);
                    if (var72 == 11) {
                        var72 = 10;
                    }
                    if (var82 != null) {
                        var82.field1636 = new class14(var82.field1646 >> 14 & 0x7FFF, var72, var73, Statics.field2001, var76, var77, var70, false, var82.field1636);
                    }
                }
                if (var74 == 3) {
                    class108 var83 = Statics.field29.method1915(Statics.field2001, var76, var77);
                    if (var83 != null) {
                        var83.field1790 = new class14(var83.field1791 >> 14 & 0x7FFF, 22, var73, Statics.field2001, var76, var77, var70, false, var83.field1790);
                    }
                }
            }
        } else if (field665 == 6) {
            int var84 = field541.method2548();
            int var85 = (var84 >> 4 & 0x7) + Statics.field1043;
            int var86 = (var84 & 0x7) + Statics.field261;
            int var87 = field541.method2456();
            int var88 = field541.method2456();
            int var89 = field541.method2456();
            if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                class179 var90 = field553[Statics.field2001][var85][var86];
                if (var90 != null) {
                    for (class17 var91 = (class17) var90.method3331(); var91 != null; var91 = (class17) var90.method3333()) {
                        if ((var87 & 0x7FFF) == var91.field267 && var91.field263 == var88) {
                            var91.field263 = var89;
                            break;
                        }
                    }
                    method2317(var85, var86);
                }
            }
        } else if (field665 == 0) {
            int var92 = field541.method2548();
            int var93 = (var92 >> 4 & 0x7) + Statics.field1043;
            int var94 = (var92 & 0x7) + Statics.field261;
            int var95 = field541.method2456();
            int var96 = field541.method2548();
            int var97 = field541.method2456();
            if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                int var98 = var93 * 128 + 64;
                int var99 = var94 * 128 + 64;
                class20 var100 = new class20(var95, Statics.field2001, var98, var99, method1541(var98, var99, Statics.field2001) - var96, var97, field569);
                field634.method3328(var100);
            }
        } else if (field665 == 94) {
            int var101 = field541.method2548();
            int var102 = (var101 >> 4 & 0x7) + Statics.field1043;
            int var103 = (var101 & 0x7) + Statics.field261;
            int var104 = field541.method2480();
            int var105 = var104 >> 2;
            int var106 = var104 & 0x3;
            int var107 = field560[var105];
            int var108 = field541.method2488();
            if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                method127(Statics.field2001, var102, var103, var107, var108, var105, var106, 0, -1);
            }
        } else if (field665 == 164) {
            int var109 = field541.method2492();
            int var110 = field541.method2548();
            int var111 = (var110 >> 4 & 0x7) + Statics.field1043;
            int var112 = (var110 & 0x7) + Statics.field261;
            if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                class179 var113 = field553[Statics.field2001][var111][var112];
                if (var113 != null) {
                    for (class17 var114 = (class17) var113.method3331(); var114 != null; var114 = (class17) var113.method3333()) {
                        if ((var109 & 0x7FFF) == var114.field267) {
                            var114.method3366();
                            break;
                        }
                    }
                    if (var113.method3331() == null) {
                        field553[Statics.field2001][var111][var112] = null;
                    }
                    method2317(var111, var112);
                }
            }
        }
    }

    @ObfuscatedName("u.bj(IIIIIIIIII)V")
    public static final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class23 var9 = null;
        for (class23 var10 = (class23) field563.method3331(); var10 != null; var10 = (class23) field563.method3333()) {
            if (var10.field379 == arg0 && var10.field371 == arg1 && var10.field373 == arg2 && var10.field384 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class23();
            var9.field379 = arg0;
            var9.field384 = arg3;
            var9.field371 = arg1;
            var9.field373 = arg2;
            method168(var9);
            field563.method3328(var9);
        }
        var9.field377 = arg4;
        var9.field380 = arg5;
        var9.field378 = arg6;
        var9.field372 = arg7;
        var9.field381 = arg8;
    }

    @ObfuscatedName("dv.bt(I)V")
    public static final void method2326() {
        for (class23 var0 = (class23) field563.method3331(); var0 != null; var0 = (class23) field563.method3333()) {
            if (var0.field381 == -1) {
                var0.field372 = 0;
                method168(var0);
            } else {
                var0.method3366();
            }
        }
    }

    @ObfuscatedName("x.by(Ll;I)V")
    public static final void method168(class23 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field384 == 0) {
            var1 = Statics.field29.method1910(arg0.field379, arg0.field371, arg0.field373);
        }
        if (arg0.field384 == 1) {
            var1 = Statics.field29.method1959(arg0.field379, arg0.field371, arg0.field373);
        }
        if (arg0.field384 == 2) {
            var1 = Statics.field29.method1979(arg0.field379, arg0.field371, arg0.field373);
        }
        if (arg0.field384 == 3) {
            var1 = Statics.field29.method2036(arg0.field379, arg0.field371, arg0.field373);
        }
        if (var1 != 0) {
            int var5 = Statics.field29.method2008(arg0.field379, arg0.field371, arg0.field373, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field374 = var2;
        arg0.field376 = var3;
        arg0.field375 = var4;
    }

    @ObfuscatedName("z.bs(IIIIIIIB)V")
    public static final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field505 && Statics.field2001 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field29.method1910(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field29.method1959(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field29.method1979(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field29.method2036(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field29.method2008(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field29.method1907(arg0, arg2, arg3);
                class33 var15 = class33.method266(var12);
                if (var15.field850 != 0) {
                    field557[arg0].method2706(arg2, arg3, var13, var14, var15.field851);
                }
            }
            if (arg1 == 1) {
                Statics.field29.method1908(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field29.method1909(arg0, arg2, arg3);
                class33 var16 = class33.method266(var12);
                if (var16.field848 + arg2 > 103 || var16.field848 + arg3 > 103 || var16.field865 + arg2 > 103 || var16.field865 + arg3 > 103) {
                    return;
                }
                if (var16.field850 != 0) {
                    field557[arg0].method2694(arg2, arg3, var16.field848, var16.field865, var14, var16.field851);
                }
            }
            if (arg1 == 3) {
                Statics.field29.method1965(arg0, arg2, arg3);
                class33 var17 = class33.method266(var12);
                if (var17.field850 == 1) {
                    field557[arg0].method2686(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field133[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class9.method767(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field29, field557[arg0]);
    }

    @ObfuscatedName("dj.bx(III)V")
    public static final void method2317(int arg0, int arg1) {
        class179 var2 = field553[Statics.field2001][arg0][arg1];
        if (var2 == null) {
            Statics.field29.method1911(Statics.field2001, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3331(); var6 != null; var6 = (class17) var2.method3333()) {
            class41 var7 = class41.method2718(var6.field267);
            long var8 = (long) var7.field1015;
            if (var7.field1014 == 1) {
                var8 = (long) (var6.field263 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field29.method1911(Statics.field2001, arg0, arg1);
            return;
        }
        var2.method3352(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3331(); var12 != null; var12 = (class17) var2.method3333()) {
            if (var5.field267 != var12.field267) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field267 != var12.field267 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field29.method2001(Statics.field2001, arg0, arg1, method1541(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2001), var5, var13, var10, var11);
    }

    @ObfuscatedName("dw.br(B)V")
    public static final void method2321() {
        field541.method2332();
        int var0 = field541.method2337(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field541.method2337(2);
        if (var1 == 0) {
            field621[++field550 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field541.method2337(3);
            Statics.field1383.method285(var2, false);
            int var3 = field541.method2337(1);
            if (var3 == 1) {
                field621[++field550 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field541.method2337(3);
            Statics.field1383.method285(var4, true);
            int var5 = field541.method2337(3);
            Statics.field1383.method285(var5, true);
            int var6 = field541.method2337(1);
            if (var6 == 1) {
                field621[++field550 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field541.method2337(7);
            Statics.field2001 = field541.method2337(2);
            int var8 = field541.method2337(1);
            if (var8 == 1) {
                field621[++field550 - 1] = 2047;
            }
            int var9 = field541.method2337(7);
            int var10 = field541.method2337(1);
            Statics.field1383.method269(var7, var9, var10 == 1);
        }
    }

    @ObfuscatedName("bk.bq(I)V")
    public static final void method1337() {
        while (true) {
            if (field541.method2335(field723) >= 11) {
                int var0 = field541.method2337(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field678[var0] == null) {
                        field678[var0] = new class3();
                        if (field696[var0] != null) {
                            field678[var0].method15(field696[var0]);
                        }
                        var1 = true;
                    }
                    field734[++field585 - 1] = var0;
                    class3 var2 = field678[var0];
                    var2.field495 = field569;
                    int var3 = field541.method2337(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field630[field541.method2337(3)];
                    if (var1) {
                        var2.field486 = var2.field440 = var4;
                    }
                    int var5 = field541.method2337(1);
                    int var6 = field541.method2337(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field541.method2337(1);
                    if (var7 == 1) {
                        field621[++field550 - 1] = var0;
                    }
                    var2.method269(Statics.field1383.field490[0] + var3, Statics.field1383.field491[0] + var6, var5 == 1);
                    continue;
                }
            }
            field541.method2334();
            return;
        }
    }

    @ObfuscatedName("j.be(I)V")
    public static final void method30() {
        for (int var0 = 0; var0 < field550; var0++) {
            int var1 = field621[var0];
            class3 var2 = field678[var1];
            int var3 = field541.method2548();
            if ((var3 & 0x40) != 0) {
                var3 += field541.method2548() << 8;
            }
            method2770(var1, var2, var3);
        }
    }

    @ObfuscatedName("ey.bn(ILk;II)V")
    public static final void method2770(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x100) != 0) {
            arg1.field477 = field541.method2480();
            arg1.field481 = field541.method2480();
            arg1.field478 = field541.method2480();
            arg1.field476 = field541.method2480();
            arg1.field470 = field541.method2517() + field569;
            arg1.field482 = field541.method2517() + field569;
            arg1.field467 = field541.method2556();
            arg1.field489 = 1;
            arg1.field494 = 0;
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field451 = field541.method2559();
            if (arg1.field451.charAt(0) == '~') {
                arg1.field451 = arg1.field451.substring(1);
                method1883(2, arg1.field52, arg1.field451);
            } else if (Statics.field1383 == arg1) {
                method1883(2, arg1.field52, arg1.field451);
            }
            arg1.field480 = 0;
            arg1.field454 = 0;
            arg1.field452 = 150;
        }
        if ((arg2 & 0x20) != 0) {
            int var3 = field541.method2480();
            int var4 = field541.method2556();
            arg1.method271(var3, var4, field569);
            arg1.field458 = field569 + 300;
            arg1.field459 = field541.method2480();
            arg1.field460 = field541.method2480();
        }
        if ((arg2 & 0x10) != 0) {
            int var5 = field541.method2548();
            byte[] var6 = new byte[var5];
            class128 var7 = new class128(var6);
            field541.method2499(var6, 0, var5);
            field696[arg0] = var7;
            arg1.method15(var7);
        }
        if ((arg2 & 0x2) != 0) {
            int var8 = field541.method2488();
            int var9 = field541.method2548();
            int var10 = field541.method2548();
            int var11 = field541.field2045;
            if (arg1.field52 != null && arg1.field37 != null) {
                boolean var12 = false;
                if (var9 <= 1 && method2724(arg1.field52)) {
                    var12 = true;
                }
                if (!var12 && field616 == 0) {
                    field733.field2045 = 0;
                    field541.method2540(field733.field2043, 0, var10);
                    field733.field2045 = 0;
                    class128 var13 = field733;
                    String var17;
                    try {
                        int var14 = var13.method2536();
                        if (var14 > 32767) {
                            var14 = 32767;
                        }
                        byte[] var15 = new byte[var14];
                        var13.field2045 += Statics.field2858.method2393(var13.field2043, var13.field2045, var15, 0, var14);
                        String var16 = class152.method11(var15, 0, var14);
                        var17 = var16;
                    } catch (Exception var26) {
                        var17 = "Cabbage";
                    }
                    String var20 = class187.method3402(class150.method617(var17));
                    arg1.field451 = var20.trim();
                    arg1.field480 = var8 >> 8;
                    arg1.field454 = var8 & 0xFF;
                    arg1.field452 = 150;
                    if (var9 == 2 || var9 == 3) {
                        method1883(1, class2.method1544(1) + arg1.field52, var20);
                    } else if (var9 == 1) {
                        method1883(1, class2.method1544(0) + arg1.field52, var20);
                    } else {
                        method1883(2, arg1.field52, var20);
                    }
                }
            }
            field541.field2045 = var10 + var11;
        }
        if ((arg2 & 0x400) != 0) {
            int var21 = field541.method2479();
            int var22 = field541.method2548();
            arg1.method271(var21, var22, field569);
            arg1.field458 = field569 + 300;
            arg1.field459 = field541.method2479();
            arg1.field460 = field541.method2556();
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field472 = field541.method2488();
            int var23 = field541.method2496();
            arg1.field456 = var23 >> 16;
            arg1.field448 = (var23 & 0xFFFF) + field569;
            arg1.field473 = 0;
            arg1.field474 = 0;
            if (arg1.field448 > field569) {
                arg1.field473 = -1;
            }
            if (arg1.field472 == 65535) {
                arg1.field472 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field461 = field541.method2517();
            if (arg1.field461 == 65535) {
                arg1.field461 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            int var24 = field541.method2517();
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = field541.method2548();
            method835(arg1, var24, var25);
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field462 = field541.method2488();
            arg1.field463 = field541.method2456();
        }
    }

    @ObfuscatedName("ew.bh(I)V")
    public static final void method2958() {
        field625 = 0;
        field550 = 0;
        method2951();
        while (field541.method2335(field723) >= 27) {
            int var0 = field541.method2337(15);
            if (var0 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field536[var0] == null) {
                field536[var0] = new class26();
                var16 = true;
            }
            class26 var17 = field536[var0];
            field538[++field537 - 1] = var0;
            var17.field495 = field569;
            int var18 = field541.method2337(5);
            if (var18 > 15) {
                var18 -= 32;
            }
            int var19 = field541.method2337(5);
            if (var19 > 15) {
                var19 -= 32;
            }
            int var20 = field630[field541.method2337(3)];
            if (var16) {
                var17.field486 = var17.field440 = var20;
            }
            int var21 = field541.method2337(1);
            var17.field413 = class32.method48(field541.method2337(14));
            int var22 = field541.method2337(1);
            if (var22 == 1) {
                field621[++field550 - 1] = var0;
            }
            var17.field442 = var17.field413.field799;
            var17.field488 = var17.field413.field822;
            if (var17.field488 == 0) {
                var17.field440 = 0;
            }
            var17.field446 = var17.field413.field805;
            var17.field447 = var17.field413.field806;
            var17.field484 = var17.field413.field807;
            var17.field449 = var17.field413.field808;
            var17.field475 = var17.field413.field830;
            var17.field444 = var17.field413.field803;
            var17.field445 = var17.field413.field809;
            var17.method269(Statics.field1383.field490[0] + var19, Statics.field1383.field491[0] + var18, var21 == 1);
        }
        field541.method2334();
        for (int var1 = 0; var1 < field550; var1++) {
            int var2 = field621[var1];
            class26 var3 = field536[var2];
            int var4 = field541.method2548();
            if ((var4 & 0x20) != 0) {
                int var5 = field541.method2548();
                int var6 = field541.method2480();
                var3.method271(var5, var6, field569);
                var3.field458 = field569 + 300;
                var3.field459 = field541.method2480();
                var3.field460 = field541.method2548();
            }
            if ((var4 & 0x8) != 0) {
                var3.field461 = field541.method2492();
                if (var3.field461 == 65535) {
                    var3.field461 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field413 = class32.method48(field541.method2456());
                var3.field442 = var3.field413.field799;
                var3.field488 = var3.field413.field822;
                var3.field446 = var3.field413.field805;
                var3.field447 = var3.field413.field806;
                var3.field484 = var3.field413.field807;
                var3.field449 = var3.field413.field808;
                var3.field475 = var3.field413.field830;
                var3.field444 = var3.field413.field803;
                var3.field445 = var3.field413.field809;
            }
            if ((var4 & 0x80) != 0) {
                var3.field472 = field541.method2456();
                int var7 = field541.method2592();
                var3.field456 = var7 >> 16;
                var3.field448 = (var7 & 0xFFFF) + field569;
                var3.field473 = 0;
                var3.field474 = 0;
                if (var3.field448 > field569) {
                    var3.field473 = -1;
                }
                if (var3.field472 == 65535) {
                    var3.field472 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field451 = field541.method2559();
                var3.field452 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var8 = field541.method2556();
                int var9 = field541.method2548();
                var3.method271(var8, var9, field569);
                var3.field458 = field569 + 300;
                var3.field459 = field541.method2556();
                var3.field460 = field541.method2556();
            }
            if ((var4 & 0x4) != 0) {
                int var10 = field541.method2488();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = field541.method2480();
                if (var3.field450 == var10 && var10 != -1) {
                    int var12 = class35.method28(var10).field913;
                    if (var12 == 1) {
                        var3.field479 = 0;
                        var3.field469 = 0;
                        var3.field464 = var11;
                        var3.field471 = 0;
                    }
                    if (var12 == 2) {
                        var3.field471 = 0;
                    }
                } else if (var10 == -1 || var3.field450 == -1 || class35.method28(var10).field897 >= class35.method28(var3.field450).field897) {
                    var3.field450 = var10;
                    var3.field479 = 0;
                    var3.field469 = 0;
                    var3.field464 = var11;
                    var3.field471 = 0;
                    var3.field494 = var3.field489;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field462 = field541.method2456();
                var3.field463 = field541.method2492();
            }
        }
        for (int var13 = 0; var13 < field625; var13++) {
            int var14 = field697[var13];
            if (field569 != field536[var14].field495) {
                field536[var14].field413 = null;
                field536[var14] = null;
            }
        }
        if (field723 != field541.field2045) {
            throw new RuntimeException(field541.field2045 + class2.field22 + field723);
        }
        for (int var15 = 0; var15 < field537; var15++) {
            if (field536[field538[var15]] == null) {
                throw new RuntimeException(var15 + class2.field22 + field537);
            }
        }
    }

    @ObfuscatedName("ei.bz(I)V")
    public static final void method2951() {
        field541.method2332();
        int var0 = field541.method2337(8);
        if (var0 < field537) {
            for (int var1 = var0; var1 < field537; var1++) {
                field697[++field625 - 1] = field538[var1];
            }
        }
        if (var0 > field537) {
            throw new RuntimeException("");
        }
        field537 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field538[var2];
            class26 var4 = field536[var3];
            int var5 = field541.method2337(1);
            if (var5 == 0) {
                field538[++field537 - 1] = var3;
                var4.field495 = field569;
            } else {
                int var6 = field541.method2337(2);
                if (var6 == 0) {
                    field538[++field537 - 1] = var3;
                    var4.field495 = field569;
                    field621[++field550 - 1] = var3;
                } else if (var6 == 1) {
                    field538[++field537 - 1] = var3;
                    var4.field495 = field569;
                    int var7 = field541.method2337(3);
                    var4.method285(var7, false);
                    int var8 = field541.method2337(1);
                    if (var8 == 1) {
                        field621[++field550 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field538[++field537 - 1] = var3;
                    var4.field495 = field569;
                    int var9 = field541.method2337(3);
                    var4.method285(var9, true);
                    int var10 = field541.method2337(3);
                    var4.method285(var10, true);
                    int var11 = field541.method2337(1);
                    if (var11 == 1) {
                        field621[++field550 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field697[++field625 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("u.bu(I)V")
    public static final void method128() {
        int var0 = Statics.field1988;
        int var1 = Statics.field1308;
        int var2 = Statics.field509;
        int var3 = Statics.field272;
        int var4 = 6116423;
        class90.method1828(var0, var1, var2, var3, var4);
        class90.method1828(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class90.method1830(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1787.method3429(class137.field2249, var0 + 3, var1 + 14, var4, -1);
        int var5 = class78.field1397;
        int var6 = class78.field1398 * -58530351;
        for (int var7 = 0; var7 < field631; var7++) {
            int var8 = (field631 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class185 var10 = Statics.field1787;
            String var11;
            if (field646[var7].length() > 0) {
                var11 = field645[var7] + class137.field2256 + field646[var7];
            } else {
                var11 = field645[var7];
            }
            var10.method3429(var11, var0 + 3, var8, var9, 0);
        }
        method4(Statics.field1988, Statics.field1308, Statics.field509, Statics.field272);
    }

    @ObfuscatedName("db.bb(IIIII)V")
    public static final void method2437(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field698; var4++) {
            if (field760[var4] + field705[var4] > arg0 && field760[var4] < arg0 + arg2 && field706[var4] + field704[var4] > arg1 && field704[var4] < arg1 + arg3) {
                field700[var4] = true;
            }
        }
    }

    @ObfuscatedName("e.bc(IIIIB)V")
    public static final void method4(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field698; var4++) {
            if (field760[var4] + field705[var4] > arg0 && field760[var4] < arg0 + arg2 && field706[var4] + field704[var4] > arg1 && field704[var4] < arg1 + arg3) {
                field701[var4] = true;
            }
        }
    }

    @ObfuscatedName("ct.bf(III)V")
    public static final void method2043(int arg0, int arg1) {
        int var2 = Statics.field1787.method3398(class137.field2249);
        for (int var3 = 0; var3 < field631; var3++) {
            class185 var4 = Statics.field1787;
            String var5;
            if (field646[var3].length() > 0) {
                var5 = field645[var3] + class137.field2256 + field646[var3];
            } else {
                var5 = field645[var3];
            }
            int var6 = var4.method3398(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field631 * 15 + 21;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > 765) {
            var8 = 765 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > 503) {
            var9 = 503 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field639 = true;
        Statics.field1988 = var8;
        Statics.field1308 = var9;
        Statics.field509 = var2;
        Statics.field272 = field631 * 15 + 22;
    }

    @ObfuscatedName("ae.ba(II)Z")
    public static final boolean method772(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field643[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dj.bi(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2316(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 45) {
            class3 var8 = field678[arg3];
            if (var8 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(32);
                field543.method2484(arg3);
                field543.method2475(class76.field1369[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var9 = field678[arg3];
            if (var9 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(112);
                field543.method2634(class76.field1369[82] ? 1 : 0);
                field543.method2484(arg3);
            }
        }
        if (arg2 == 30 && field661 == null) {
            method2396(arg1, arg0);
            field661 = Statics.method2956(arg1, arg0);
            method2218(field661);
        }
        if (arg2 == 35) {
            field543.method2333(213);
            field543.method2484(arg0);
            field543.method2483(arg3);
            field543.method2454(arg1);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 9) {
            class26 var10 = field536[arg3];
            if (var10 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(152);
                field543.method2484(arg3);
                field543.method2634(class76.field1369[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field543.method2333(198);
            field543.method2454(arg1);
            class161 var11 = class161.method2772(arg1);
            if (var11.field2722 != null && var11.field2722[0][0] == 5) {
                int var12 = var11.field2722[0][1];
                if (class162.field2748[var12] != var11.field2680[0]) {
                    class162.field2748[var12] = var11.field2680[0];
                    method3012(var12);
                }
            }
        }
        if (arg2 == 28) {
            field543.method2333(198);
            field543.method2454(arg1);
            class161 var13 = class161.method2772(arg1);
            if (var13.field2722 != null && var13.field2722[0][0] == 5) {
                int var14 = var13.field2722[0][1];
                class162.field2748[var14] = 1 - class162.field2748[var14];
                method3012(var14);
            }
        }
        if (arg2 == 8) {
            class26 var15 = field536[arg3];
            if (var15 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(214);
                field543.method2475(class76.field1369[82] ? 1 : 0);
                field543.method2483(arg3);
                field543.method2495(Statics.field1990);
                field543.method2484(field654);
            }
        }
        if (arg2 == 18) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(130);
            field543.method2484(Statics.field2063 + arg1);
            field543.method2484(arg3);
            field543.method2483(Statics.field949 + arg0);
            field543.method2634(class76.field1369[82] ? 1 : 0);
        }
        if (arg2 == 14) {
            class3 var16 = field678[arg3];
            if (var16 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(80);
                field543.method2484(arg3);
                field543.method2484(Statics.field420);
                field543.method2483(Statics.field2611);
                field543.method2495(Statics.field1201);
                field543.method2475(class76.field1369[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            class26 var17 = field536[arg3];
            if (var17 != null) {
                class32 var18 = var17.field413;
                if (var18.field823 != null) {
                    var18 = var18.method659();
                }
                if (var18 != null) {
                    field543.method2333(37);
                    field543.method2483(var18.field797);
                }
            }
        }
        if (arg2 == 34) {
            field543.method2333(40);
            field543.method2542(arg1);
            field543.method2483(arg0);
            field543.method2449(arg3);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 3) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(113);
            field543.method2449(Statics.field949 + arg0);
            field543.method2477(class76.field1369[82] ? 1 : 0);
            field543.method2483(Statics.field2063 + arg1);
            field543.method2449(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 20) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(127);
            field543.method2483(Statics.field949 + arg0);
            field543.method2634(class76.field1369[82] ? 1 : 0);
            field543.method2484(Statics.field2063 + arg1);
            field543.method2484(arg3);
        }
        if (arg2 == 16) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(2);
            field543.method2543(Statics.field1201);
            field543.method2483(Statics.field2611);
            field543.method2475(class76.field1369[82] ? 1 : 0);
            field543.method2449(Statics.field949 + arg0);
            field543.method2603(Statics.field2063 + arg1);
            field543.method2603(Statics.field420);
            field543.method2484(arg3);
        }
        if (arg2 == 57 || arg2 == 1007) {
            Statics.method1595(arg3, arg1, arg0, arg5);
        }
        if (arg2 == 15) {
            class3 var19 = field678[arg3];
            if (var19 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(236);
                field543.method2449(arg3);
                field543.method2603(field654);
                field543.method2477(class76.field1369[82] ? 1 : 0);
                field543.method2454(Statics.field1990);
            }
        }
        if (arg2 == 58) {
            field543.method2333(33);
            field543.method2495(Statics.field1990);
            field543.method2483(field654);
            field543.method2484(arg0);
            field543.method2542(arg1);
        }
        if (arg2 == 1) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(240);
            field543.method2603(Statics.field2611);
            field543.method2634(class76.field1369[82] ? 1 : 0);
            field543.method2483(arg3 >> 14 & 0x7FFF);
            field543.method2483(Statics.field949 + arg0);
            field543.method2495(Statics.field1201);
            field543.method2449(Statics.field420);
            field543.method2484(Statics.field2063 + arg1);
        }
        if (arg2 == 38) {
            method234();
            class161 var20 = class161.method2772(arg1);
            field651 = 1;
            Statics.field420 = arg0;
            Statics.field1201 = arg1;
            Statics.field2611 = arg3;
            method2218(var20);
            field584 = class2.method13(16748608) + class41.method2718(arg3).field1020 + class2.method13(16777215);
            if (field584 == null) {
                field584 = "null";
            }
            return;
        }
        if (arg2 == 13) {
            class26 var21 = field536[arg3];
            if (var21 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(192);
                field543.method2483(arg3);
                field543.method2476(class76.field1369[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var22 = field678[arg3];
            if (var22 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(208);
                field543.method2483(arg3);
                field543.method2475(class76.field1369[82] ? 1 : 0);
            }
        }
        if (arg2 == 12) {
            class26 var23 = field536[arg3];
            if (var23 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(181);
                field543.method2483(arg3);
                field543.method2475(class76.field1369[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field543.method2333(5);
            field543.method2542(arg1);
            field543.method2483(arg0);
            field543.method2484(arg3);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 43) {
            field543.method2333(218);
            field543.method2484(arg3);
            field543.method2495(arg1);
            field543.method2449(arg0);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 1001) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(69);
            field543.method2475(class76.field1369[82] ? 1 : 0);
            field543.method2603(Statics.field949 + arg0);
            field543.method2603(arg3 >> 14 & 0x7FFF);
            field543.method2483(Statics.field2063 + arg1);
        }
        if (arg2 == 33) {
            field543.method2333(219);
            field543.method2454(arg1);
            field543.method2603(arg3);
            field543.method2483(arg0);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 25) {
            class161 var24 = Statics.method2956(arg1, arg0);
            if (var24 != null) {
                method234();
                int var25 = class165.method1470(Statics.method129(var24));
                class161 var26 = Statics.method2956(arg1, arg0);
                if (var26 != null && var26.field2704 != null) {
                    class1 var27 = new class1();
                    var27.field1 = var26;
                    var27.field12 = var26.field2704;
                    class27.method865(var27);
                }
                field653 = true;
                Statics.field1990 = arg1;
                field654 = arg0;
                Statics.field32 = var25;
                method2218(var26);
                field651 = 0;
                String var28;
                if (class165.method1470(Statics.method129(var24)) == 0) {
                    var28 = null;
                } else if (var24.field2692 == null || var24.field2692.trim().length() == 0) {
                    var28 = null;
                } else {
                    var28 = var24.field2692;
                }
                field521 = var28;
                if (field521 == null) {
                    field521 = "Null";
                }
                if (var24.field2625) {
                    field516 = var24.field2645 + class2.method13(16777215);
                } else {
                    field516 = class2.method13(65280) + var24.field2726 + class2.method13(16777215);
                }
            }
            return;
        }
        if (arg2 == 46) {
            class3 var29 = field678[arg3];
            if (var29 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(150);
                field543.method2476(class76.field1369[82] ? 1 : 0);
                field543.method2603(arg3);
            }
        }
        if (arg2 == 10) {
            class26 var30 = field536[arg3];
            if (var30 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(217);
                field543.method2449(arg3);
                field543.method2476(class76.field1369[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            field543.method2333(114);
            for (class4 var31 = (class4) field658.method3313(); var31 != null; var31 = (class4) field658.method3323()) {
                if (var31.field58 == 0 || var31.field58 == 3) {
                    method131(var31, true);
                }
            }
            if (field661 != null) {
                method2218(field661);
                field661 = null;
            }
        }
        if (arg2 == 42) {
            field543.method2333(52);
            field543.method2483(arg0);
            field543.method2449(arg3);
            field543.method2542(arg1);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 44) {
            class3 var32 = field678[arg3];
            if (var32 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(173);
                field543.method2476(class76.field1369[82] ? 1 : 0);
                field543.method2484(arg3);
            }
        }
        if (arg2 == 37) {
            field543.method2333(119);
            field543.method2603(arg0);
            field543.method2449(arg3);
            field543.method2495(arg1);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 39) {
            field543.method2333(99);
            field543.method2543(arg1);
            field543.method2449(arg0);
            field543.method2603(arg3);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 50) {
            class3 var33 = field678[arg3];
            if (var33 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(43);
                field543.method2476(class76.field1369[82] ? 1 : 0);
                field543.method2483(arg3);
            }
        }
        if (arg2 == 6) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(85);
            field543.method2484(Statics.field949 + arg0);
            field543.method2603(Statics.field2063 + arg1);
            field543.method2483(arg3 >> 14 & 0x7FFF);
            field543.method2475(class76.field1369[82] ? 1 : 0);
        }
        if (arg2 == 11) {
            class26 var34 = field536[arg3];
            if (var34 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(8);
                field543.method2634(class76.field1369[82] ? 1 : 0);
                field543.method2483(arg3);
            }
        }
        if (arg2 == 24) {
            class161 var35 = class161.method2772(arg1);
            boolean var36 = true;
            if (var35.field2630 > 0) {
                var36 = method238(var35);
            }
            if (var36) {
                field543.method2333(198);
                field543.method2454(arg1);
            }
        }
        if (arg2 == 49) {
            class3 var37 = field678[arg3];
            if (var37 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(251);
                field543.method2449(arg3);
                field543.method2477(class76.field1369[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class161 var38 = class161.method2772(arg1);
            if (var38 == null || var38.field2729[arg0] < 100000) {
                field543.method2333(103);
                field543.method2483(arg3);
            } else {
                method1883(27, "", var38.field2729[arg0] + " x " + class41.method2718(arg3).field1020);
            }
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 40) {
            field543.method2333(97);
            field543.method2483(arg0);
            field543.method2542(arg1);
            field543.method2449(arg3);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 7) {
            class26 var39 = field536[arg3];
            if (var39 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(72);
                field543.method2603(Statics.field420);
                field543.method2475(class76.field1369[82] ? 1 : 0);
                field543.method2449(arg3);
                field543.method2483(Statics.field2611);
                field543.method2543(Statics.field1201);
            }
        }
        if (arg2 == 2) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(84);
            field543.method2495(Statics.field1990);
            field543.method2603(Statics.field949 + arg0);
            field543.method2477(class76.field1369[82] ? 1 : 0);
            field543.method2449(Statics.field2063 + arg1);
            field543.method2449(arg3 >> 14 & 0x7FFF);
            field543.method2449(field654);
        }
        if (arg2 == 47) {
            class3 var40 = field678[arg3];
            if (var40 != null) {
                field604 = arg6;
                field605 = arg7;
                field607 = 2;
                field647 = 0;
                field711 = arg0;
                field730 = arg1;
                field543.method2333(209);
                field543.method2484(arg3);
                field543.method2476(class76.field1369[82] ? 1 : 0);
            }
        }
        if (arg2 == 4) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(252);
            field543.method2603(arg3 >> 14 & 0x7FFF);
            field543.method2483(Statics.field949 + arg0);
            field543.method2634(class76.field1369[82] ? 1 : 0);
            field543.method2603(Statics.field2063 + arg1);
        }
        if (arg2 == 23) {
            Statics.field29.method1995(Statics.field2001, arg0, arg1);
        }
        if (arg2 == 22) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(245);
            field543.method2484(Statics.field949 + arg0);
            field543.method2603(Statics.field2063 + arg1);
            field543.method2484(arg3);
            field543.method2477(class76.field1369[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field543.method2333(126);
            field543.method2484(arg3);
            field543.method2454(arg1);
            field543.method2484(arg0);
            field543.method2449(field654);
            field543.method2543(Statics.field1990);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 1004) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field543.method2333(103);
            field543.method2483(arg3);
        }
        if (arg2 == 5) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(86);
            field543.method2603(Statics.field2063 + arg1);
            field543.method2475(class76.field1369[82] ? 1 : 0);
            field543.method2449(Statics.field949 + arg0);
            field543.method2483(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 17) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(176);
            field543.method2454(Statics.field1990);
            field543.method2634(class76.field1369[82] ? 1 : 0);
            field543.method2449(field654);
            field543.method2484(Statics.field2063 + arg1);
            field543.method2484(Statics.field949 + arg0);
            field543.method2484(arg3);
        }
        if (arg2 == 19) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(102);
            field543.method2634(class76.field1369[82] ? 1 : 0);
            field543.method2603(Statics.field949 + arg0);
            field543.method2449(arg3);
            field543.method2484(Statics.field2063 + arg1);
        }
        if (arg2 == 21) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field711 = arg0;
            field730 = arg1;
            field543.method2333(158);
            field543.method2603(arg3);
            field543.method2476(class76.field1369[82] ? 1 : 0);
            field543.method2484(Statics.field949 + arg0);
            field543.method2603(Statics.field2063 + arg1);
        }
        if (arg2 == 36) {
            field543.method2333(235);
            field543.method2483(arg0);
            field543.method2603(arg3);
            field543.method2454(arg1);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (arg2 == 1002) {
            field604 = arg6;
            field605 = arg7;
            field607 = 2;
            field647 = 0;
            field543.method2333(75);
            field543.method2603(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 31) {
            field543.method2333(226);
            field543.method2542(Statics.field1201);
            field543.method2495(arg1);
            field543.method2603(arg3);
            field543.method2603(arg0);
            field543.method2449(Statics.field420);
            field543.method2484(Statics.field2611);
            field668 = 0;
            Statics.field1506 = class161.method2772(arg1);
            field732 = arg0;
        }
        if (field651 != 0) {
            field651 = 0;
            method2218(class161.method2772(Statics.field1201));
        }
        if (field653) {
            method234();
        }
        if (Statics.field1506 != null && field668 == 0) {
            method2218(Statics.field1506);
        }
    }

    @ObfuscatedName("l.bo(I)V")
    public static void method234() {
        if (!field653) {
            return;
        }
        class161 var0 = Statics.method2956(Statics.field1990, field654);
        if (var0 != null && var0.field2703 != null) {
            class1 var1 = new class1();
            var1.field1 = var0;
            var1.field12 = var0.field2703;
            class27.method865(var1);
        }
        field653 = false;
        method2218(var0);
    }

    @ObfuscatedName("dd.cg(III)V")
    public static void method2396(int arg0, int arg1) {
        field543.method2333(93);
        field543.method2483(arg1);
        field543.method2543(arg0);
    }

    @ObfuscatedName("z.cd(B)V")
    public static final void method34() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field631 - 1; var1++) {
                if (field643[var1] < 1000 && field643[var1 + 1] > 1000) {
                    String var2 = field646[var1];
                    field646[var1] = field646[var1 + 1];
                    field646[var1 + 1] = var2;
                    String var3 = field645[var1];
                    field645[var1] = field645[var1 + 1];
                    field645[var1 + 1] = var3;
                    int var4 = field643[var1];
                    field643[var1] = field643[var1 + 1];
                    field643[var1 + 1] = var4;
                    int var5 = field641[var1];
                    field641[var1] = field641[var1 + 1];
                    field641[var1 + 1] = var5;
                    int var6 = field642[var1];
                    field642[var1] = field642[var1 + 1];
                    field642[var1 + 1] = var6;
                    int var7 = field679[var1];
                    field679[var1] = field679[var1 + 1];
                    field679[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("cy.cl(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2046(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field639 || field631 >= 500) {
            return;
        }
        field645[field631] = arg0;
        field646[field631] = arg1;
        field643[field631] = arg2;
        field679[field631] = arg3;
        field641[field631] = arg4;
        field642[field631] = arg5;
        field631++;
    }

    @ObfuscatedName("dk.cf(I)V")
    public static void method2217() {
        for (int var0 = 0; var0 < field631; var0++) {
            int var1 = field643[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field631 - 1) {
                    for (int var3 = var0; var3 < field631 - 1; var3++) {
                        field645[var3] = field645[var3 + 1];
                        field646[var3] = field646[var3 + 1];
                        field643[var3] = field643[var3 + 1];
                        field679[var3] = field679[var3 + 1];
                        field641[var3] = field641[var3 + 1];
                        field642[var3] = field642[var3 + 1];
                    }
                }
                field631--;
            }
        }
    }

    @ObfuscatedName("d.cp(IIIIB)V")
    public static final void method124(int arg0, int arg1, int arg2, int arg3) {
        if (field651 == 0 && !field653) {
            method2046(class137.field2251, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class113.field1913; var5++) {
            int var6 = class113.field1914[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field29.method2008(Statics.field2001, var7, var8, var6) >= 0) {
                    class33 var11 = class33.method266(var10);
                    if (var11.field874 != null) {
                        var11 = var11.method692();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field651 == 1) {
                        method2046(class137.field2246, field584 + " " + class2.field26 + " " + class2.method13(65535) + var11.field832, 1, var6, var7, var8);
                    } else if (!field653) {
                        String[] var12 = var11.field841;
                        if (field687) {
                            var12 = method1371(var12);
                        }
                        if (var12 != null) {
                            for (int var13 = 4; var13 >= 0; var13--) {
                                if (var12[var13] != null) {
                                    short var14 = 0;
                                    if (var13 == 0) {
                                        var14 = 3;
                                    }
                                    if (var13 == 1) {
                                        var14 = 4;
                                    }
                                    if (var13 == 2) {
                                        var14 = 5;
                                    }
                                    if (var13 == 3) {
                                        var14 = 6;
                                    }
                                    if (var13 == 4) {
                                        var14 = 1001;
                                    }
                                    method2046(var12[var13], class2.method13(65535) + var11.field832, var14, var6, var7, var8);
                                }
                            }
                        }
                        method2046(class137.field2217, class2.method13(65535) + var11.field832, 1002, var11.field840 << 14, var7, var8);
                    } else if ((Statics.field32 & 0x4) == 4) {
                        method2046(field521, field516 + " " + class2.field26 + " " + class2.method13(65535) + var11.field832, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class26 var15 = field536[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field413.field799 == 1 && (var15.field443 & 0x7F) == 64 && (var15.field439 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field537; var16++) {
                            class26 var17 = field536[field538[var16]];
                            if (var17 != null && var15 != var17 && var17.field413.field799 == 1 && var15.field443 == var17.field443 && var15.field439 == var17.field439) {
                                method245(var17.field413, field538[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field585; var18++) {
                            class3 var19 = field678[field734[var18]];
                            if (var19 != null && var15.field443 == var19.field443 && var15.field439 == var19.field439) {
                                method199(var19, field734[var18], var7, var8);
                            }
                        }
                    }
                    method245(var15.field413, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field678[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field443 & 0x7F) == 64 && (var20.field439 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field537; var21++) {
                            class26 var22 = field536[field538[var21]];
                            if (var22 != null && var22.field413.field799 == 1 && var20.field443 == var22.field443 && var20.field439 == var22.field439) {
                                method245(var22.field413, field538[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field585; var23++) {
                            class3 var24 = field678[field734[var23]];
                            if (var24 != null && var20 != var24 && var20.field443 == var24.field443 && var20.field439 == var24.field439) {
                                method199(var24, field734[var23], var7, var8);
                            }
                        }
                    }
                    method199(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class179 var25 = field553[Statics.field2001][var7][var8];
                    if (var25 != null) {
                        for (class17 var26 = (class17) var25.method3332(); var26 != null; var26 = (class17) var25.method3356()) {
                            class41 var27 = class41.method2718(var26.field267);
                            if (field651 == 1) {
                                method2046(class137.field2246, field584 + " " + class2.field26 + " " + class2.method13(16748608) + var27.field1020, 16, var26.field267, var7, var8);
                            } else if (!field653) {
                                String[] var28 = var27.field996;
                                if (field687) {
                                    var28 = method1371(var28);
                                }
                                for (int var29 = 4; var29 >= 0; var29--) {
                                    if (var28 != null && var28[var29] != null) {
                                        byte var30 = 0;
                                        if (var29 == 0) {
                                            var30 = 18;
                                        }
                                        if (var29 == 1) {
                                            var30 = 19;
                                        }
                                        if (var29 == 2) {
                                            var30 = 20;
                                        }
                                        if (var29 == 3) {
                                            var30 = 21;
                                        }
                                        if (var29 == 4) {
                                            var30 = 22;
                                        }
                                        method2046(var28[var29], class2.method13(16748608) + var27.field1020, var30, var26.field267, var7, var8);
                                    } else if (var29 == 2) {
                                        method2046(class137.field2129, class2.method13(16748608) + var27.field1020, 20, var26.field267, var7, var8);
                                    }
                                }
                                method2046(class137.field2217, class2.method13(16748608) + var27.field1020, 1004, var26.field267, var7, var8);
                            } else if ((Statics.field32 & 0x1) == 1) {
                                method2046(field521, field516 + " " + class2.field26 + " " + class2.method13(16748608) + var27.field1020, 17, var26.field267, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.ch(Law;IIII)V")
    public static final void method245(class32 arg0, int arg1, int arg2, int arg3) {
        if (field631 >= 400) {
            return;
        }
        if (arg0.field823 != null) {
            arg0 = arg0.method659();
        }
        if (arg0 == null || !arg0.field826) {
            return;
        }
        String var4 = arg0.field798;
        if (arg0.field815 != 0) {
            int var6 = arg0.field815;
            int var7 = Statics.field1383.field40;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method13(16711680);
            } else if (var8 < -6) {
                var9 = class2.method13(16723968);
            } else if (var8 < -3) {
                var9 = class2.method13(16740352);
            } else if (var8 < 0) {
                var9 = class2.method13(16756736);
            } else if (var8 > 9) {
                var9 = class2.method13(65280);
            } else if (var8 > 6) {
                var9 = class2.method13(4259584);
            } else if (var8 > 3) {
                var9 = class2.method13(8453888);
            } else if (var8 > 0) {
                var9 = class2.method13(12648192);
            } else {
                var9 = class2.method13(16776960);
            }
            var4 = var4 + var9 + " " + class2.field27 + class137.field2252 + arg0.field815 + class2.field25;
        }
        if (field651 == 1) {
            method2046(class137.field2246, field584 + " " + class2.field26 + " " + class2.method13(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field653) {
            String[] var10 = arg0.field813;
            if (field687) {
                var10 = method1371(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class137.field2248)) {
                        byte var12 = 0;
                        if (var11 == 0) {
                            var12 = 9;
                        }
                        if (var11 == 1) {
                            var12 = 10;
                        }
                        if (var11 == 2) {
                            var12 = 11;
                        }
                        if (var11 == 3) {
                            var12 = 12;
                        }
                        if (var11 == 4) {
                            var12 = 13;
                        }
                        method2046(var10[var11], class2.method13(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class137.field2248)) {
                        short var14 = 0;
                        if (arg0.field815 > Statics.field1383.field40) {
                            var14 = 2000;
                        }
                        int var15 = 0;
                        if (var13 == 0) {
                            var15 = var14 + 9;
                        }
                        if (var13 == 1) {
                            var15 = var14 + 10;
                        }
                        if (var13 == 2) {
                            var15 = var14 + 11;
                        }
                        if (var13 == 3) {
                            var15 = var14 + 12;
                        }
                        if (var13 == 4) {
                            var15 = var14 + 13;
                        }
                        method2046(var10[var13], class2.method13(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method2046(class137.field2217, class2.method13(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field32 & 0x2) == 2) {
            method2046(field521, field516 + " " + class2.field26 + " " + class2.method13(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("y.cn(Lk;IIII)V")
    public static final void method199(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1383 == arg0 || field631 >= 400) {
            return;
        }
        String var9;
        if (arg0.field41 == 0) {
            String var4 = arg0.field52;
            int var5 = arg0.field40;
            int var6 = Statics.field1383.field40;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method13(16711680);
            } else if (var7 < -6) {
                var8 = class2.method13(16723968);
            } else if (var7 < -3) {
                var8 = class2.method13(16740352);
            } else if (var7 < 0) {
                var8 = class2.method13(16756736);
            } else if (var7 > 9) {
                var8 = class2.method13(65280);
            } else if (var7 > 6) {
                var8 = class2.method13(4259584);
            } else if (var7 > 3) {
                var8 = class2.method13(8453888);
            } else if (var7 > 0) {
                var8 = class2.method13(12648192);
            } else {
                var8 = class2.method13(16776960);
            }
            var9 = var4 + var8 + " " + class2.field27 + class137.field2252 + arg0.field40 + class2.field25;
        } else {
            var9 = arg0.field52 + " " + class2.field27 + class137.field2253 + arg0.field41 + class2.field25;
        }
        if (field651 == 1) {
            method2046(class137.field2246, field584 + " " + class2.field26 + " " + class2.method13(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field653) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field628[var10] != null) {
                    short var11 = 0;
                    if (field628[var10].equalsIgnoreCase(class137.field2248)) {
                        if (arg0.field40 > Statics.field1383.field40) {
                            var11 = 2000;
                        }
                        if (Statics.field1383.field47 != 0 && arg0.field47 != 0) {
                            if (Statics.field1383.field47 == arg0.field47) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field629[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field627[var10] + var11;
                    method2046(field628[var10], class2.method13(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field32 & 0x8) == 8) {
            method2046(field521, field516 + " " + class2.field26 + " " + class2.method13(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field631; var14++) {
            if (field643[var14] == 23) {
                field646[var14] = class2.method13(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("e.cw(IIIIIIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class161.method1456(arg0)) {
            Statics.field775 = null;
            Statics.method40(Statics.field2616[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field775 != null) {
                Statics.method40(Statics.field775, -1412584499, arg1, arg2, arg3, arg4, Statics.field1389, Statics.field127, arg7);
                Statics.field775 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field700[var8] = true;
            }
        } else {
            field700[arg7] = true;
        }
    }

    @ObfuscatedName("r.cx(Ljava/lang/String;Lfl;B)Ljava/lang/String;")
    public static String method230(String arg0, class161 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + Statics.method242(method2322(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field88 != null) {
                    int var6 = Statics.field88.field1415;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field88.field1417 != null) {
                        var5 = (String) Statics.field88.field1417;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("v.ce(II)Ljava/lang/String;")
    public static final String method257(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field22 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method13(65408) + var1.substring(0, var1.length() - 8) + class137.field2257 + " " + class2.field27 + var1 + class2.field25 + class2.field35;
        } else if (var1.length() > 6) {
            return " " + class2.method13(16777215) + var1.substring(0, var1.length() - 4) + class137.field2224 + " " + class2.field27 + var1 + class2.field25 + class2.field35;
        } else {
            return " " + class2.method13(16776960) + var1 + class2.field35;
        }
    }

    @ObfuscatedName("e.cv(Lfl;IIIIIII)V")
    public static final void method1(class161 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field579) {
            field580 = 32;
        } else {
            field580 = 0;
        }
        field579 = false;
        if (class78.field1396 == 1 || !Statics.field2078 && class78.field1396 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2640 -= 4;
                method2218(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2640 += 4;
                method2218(arg0);
            } else if (arg5 >= arg1 - field580 && arg5 < field580 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2640 = (arg4 - arg3) * var8 / var9;
                method2218(arg0);
                field579 = true;
            }
        }
        if (field539 == 0) {
            return;
        }
        int var10 = arg0.field2635;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2640 += field539 * 45;
            method2218(arg0);
        }
    }

    @ObfuscatedName("a.cs(Lfl;B)Z")
    public static final boolean method62(class161 arg0) {
        if (arg0.field2723 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2723.length; var1++) {
            int var2 = method2322(arg0, var1);
            int var3 = arg0.field2680[var1];
            if (arg0.field2723[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2723[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2723[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dv.ck(Lfl;IB)I")
    public static final int method2322(class161 arg0, int arg1) {
        if (arg0.field2722 == null || arg1 >= arg0.field2722.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2722[arg1];
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
                    var7 = field635[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field703[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field712[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class161 var11 = class161.method2772(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class41.method2718(var12).field1016 || field504)) {
                        for (int var13 = 0; var13 < var11.field2742.length; var13++) {
                            if (var12 + 1 == var11.field2742[var13]) {
                                var7 += var11.field2729[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class162.field2748[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class132.field2068[field703[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class162.field2748[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1383.field40;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class132.field2065[var14]) {
                            var7 += field703[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class161 var17 = class161.method2772(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class41.method2718(var18).field1016 || field504)) {
                        for (int var19 = 0; var19 < var17.field2742.length; var19++) {
                            if (var18 + 1 == var17.field2742[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field662;
                }
                if (var6 == 12) {
                    var7 = field663;
                }
                if (var6 == 13) {
                    int var20 = class162.field2748[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class162.method3010(var22);
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
                    var7 = (Statics.field1383.field443 >> 7) + Statics.field949;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1383.field439 >> 7) + Statics.field2063;
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

    @ObfuscatedName("eq.ci([Lfl;IIIIIIII)V")
    public static final void method2721(class161[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class161 var9 = arg0[var8];
            if (var9 != null && (!var9.field2625 || var9.field2628 == 0 || var9.field2644 || Statics.method129(var9) != 0 || field669 == var9) && var9.field2637 == arg1 && (!var9.field2625 || !Statics.method866(var9))) {
                int var10 = var9.field2631 + arg6;
                int var11 = var9.field2632 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2628 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2628 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2635 + var10;
                    int var19 = var9.field2624 + var11;
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
                    int var22 = var9.field2635 + var10;
                    int var23 = var9.field2624 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field535 == var9) {
                    field676 = true;
                    field677 = var10;
                    field591 = var11;
                }
                if (!var9.field2625 || var12 < var14 && var13 < var15) {
                    int var24 = class78.field1397;
                    int var25 = class78.field1398 * -58530351;
                    if (class78.field1393 != 0) {
                        var24 = class78.field1404;
                        var25 = class78.field1405;
                    }
                    if (var9.field2630 == 1337) {
                        method2218(var9);
                        if (!field508 && !field639 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method124(var24, var25, var12, var13);
                        }
                    } else if (var9.field2630 != 1338) {
                        if (!field639 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var37 = var24 - var10;
                            int var38 = var25 - var11;
                            if (var9.field2629 == 1) {
                                method2046(var9.field2642, "", 24, 0, 0, var9.field2626);
                            }
                            if (var9.field2629 == 2 && !field653) {
                                String var39;
                                if (class165.method1470(Statics.method129(var9)) == 0) {
                                    var39 = null;
                                } else if (var9.field2692 == null || var9.field2692.trim().length() == 0) {
                                    var39 = null;
                                } else {
                                    var39 = var9.field2692;
                                }
                                if (var39 != null) {
                                    method2046(var39, class2.method13(65280) + var9.field2726, 25, 0, -1, var9.field2626);
                                }
                            }
                            if (var9.field2629 == 3) {
                                method2046(class137.field2255, "", 26, 0, 0, var9.field2626);
                            }
                            if (var9.field2629 == 4) {
                                method2046(var9.field2642, "", 28, 0, 0, var9.field2626);
                            }
                            if (var9.field2629 == 5) {
                                method2046(var9.field2642, "", 29, 0, 0, var9.field2626);
                            }
                            if (var9.field2629 == 6 && field661 == null) {
                                method2046(var9.field2642, "", 30, 0, -1, var9.field2626);
                            }
                            if (var9.field2628 == 2) {
                                int var41 = 0;
                                for (int var42 = 0; var42 < var9.field2624; var42++) {
                                    for (int var43 = 0; var43 < var9.field2635; var43++) {
                                        int var44 = (var9.field2679 + 32) * var43;
                                        int var45 = (var9.field2724 + 32) * var42;
                                        if (var41 < 20) {
                                            var44 += var9.field2627[var41];
                                            var45 += var9.field2682[var41];
                                        }
                                        if (var37 >= var44 && var38 >= var45 && var37 < var44 + 32 && var38 < var45 + 32) {
                                            field613 = var41;
                                            Statics.field2000 = var9;
                                            if (var9.field2742[var41] > 0) {
                                                class41 var46 = class41.method2718(var9.field2742[var41] - 1);
                                                if (field651 == 1 && class165.method2367(Statics.method129(var9))) {
                                                    if (Statics.field1201 != var9.field2626 || Statics.field420 != var41) {
                                                        method2046(class137.field2246, field584 + " " + class2.field26 + " " + class2.method13(16748608) + var46.field1020, 31, var46.field1024, var41, var9.field2626);
                                                    }
                                                } else if (!field653 || !class165.method2367(Statics.method129(var9))) {
                                                    String[] var47 = var46.field1003;
                                                    if (field687) {
                                                        var47 = method1371(var47);
                                                    }
                                                    if (class165.method2367(Statics.method129(var9))) {
                                                        for (int var48 = 4; var48 >= 3; var48--) {
                                                            if (var47 != null && var47[var48] != null) {
                                                                byte var49;
                                                                if (var48 == 3) {
                                                                    var49 = 36;
                                                                } else {
                                                                    var49 = 37;
                                                                }
                                                                method2046(var47[var48], class2.method13(16748608) + var46.field1020, var49, var46.field1024, var41, var9.field2626);
                                                            } else if (var48 == 4) {
                                                                method2046(class137.field2109, class2.method13(16748608) + var46.field1020, 37, var46.field1024, var41, var9.field2626);
                                                            }
                                                        }
                                                    }
                                                    int var50 = Statics.method129(var9);
                                                    boolean var51 = (var50 >> 31 & 0x1) != 0;
                                                    if (var51) {
                                                        method2046(class137.field2246, class2.method13(16748608) + var46.field1020, 38, var46.field1024, var41, var9.field2626);
                                                    }
                                                    class165 var10000 = (class165) null;
                                                    if (class165.method2367(Statics.method129(var9)) && var47 != null) {
                                                        for (int var52 = 2; var52 >= 0; var52--) {
                                                            if (var47[var52] != null) {
                                                                byte var53 = 0;
                                                                if (var52 == 0) {
                                                                    var53 = 33;
                                                                }
                                                                if (var52 == 1) {
                                                                    var53 = 34;
                                                                }
                                                                if (var52 == 2) {
                                                                    var53 = 35;
                                                                }
                                                                method2046(var47[var52], class2.method13(16748608) + var46.field1020, var53, var46.field1024, var41, var9.field2626);
                                                            }
                                                        }
                                                    }
                                                    String[] var54 = var9.field2684;
                                                    if (field687) {
                                                        var54 = method1371(var54);
                                                    }
                                                    if (var54 != null) {
                                                        for (int var55 = 4; var55 >= 0; var55--) {
                                                            if (var54[var55] != null) {
                                                                byte var56 = 0;
                                                                if (var55 == 0) {
                                                                    var56 = 39;
                                                                }
                                                                if (var55 == 1) {
                                                                    var56 = 40;
                                                                }
                                                                if (var55 == 2) {
                                                                    var56 = 41;
                                                                }
                                                                if (var55 == 3) {
                                                                    var56 = 42;
                                                                }
                                                                if (var55 == 4) {
                                                                    var56 = 43;
                                                                }
                                                                method2046(var54[var55], class2.method13(16748608) + var46.field1020, var56, var46.field1024, var41, var9.field2626);
                                                            }
                                                        }
                                                    }
                                                    method2046(class137.field2217, class2.method13(16748608) + var46.field1020, 1005, var46.field1024, var41, var9.field2626);
                                                } else if ((Statics.field32 & 0x10) == 16) {
                                                    method2046(field521, field516 + " " + class2.field26 + " " + class2.method13(16748608) + var46.field1020, 32, var46.field1024, var41, var9.field2626);
                                                }
                                            }
                                        }
                                        var41++;
                                    }
                                }
                            }
                            if (var9.field2625) {
                                if (!field653) {
                                    for (int var57 = 9; var57 >= 5; var57--) {
                                        String var58;
                                        if (!class165.method1886(Statics.method129(var9), var57) && var9.field2713 == null) {
                                            var58 = null;
                                        } else if (var9.field2651 == null || var9.field2651.length <= var57 || var9.field2651[var57] == null || var9.field2651[var57].trim().length() == 0) {
                                            var58 = null;
                                        } else {
                                            var58 = var9.field2651[var57];
                                        }
                                        if (var58 != null) {
                                            method2046(var58, var9.field2645, 1007, var57 + 1, var9.field2696, var9.field2626);
                                        }
                                    }
                                    String var60;
                                    if (class165.method1470(Statics.method129(var9)) == 0) {
                                        var60 = null;
                                    } else if (var9.field2692 == null || var9.field2692.trim().length() == 0) {
                                        var60 = null;
                                    } else {
                                        var60 = var9.field2692;
                                    }
                                    if (var60 != null) {
                                        method2046(var60, var9.field2645, 25, 0, var9.field2696, var9.field2626);
                                    }
                                    for (int var62 = 4; var62 >= 0; var62--) {
                                        String var63;
                                        if (!class165.method1886(Statics.method129(var9), var62) && var9.field2713 == null) {
                                            var63 = null;
                                        } else if (var9.field2651 == null || var9.field2651.length <= var62 || var9.field2651[var62] == null || var9.field2651[var62].trim().length() == 0) {
                                            var63 = null;
                                        } else {
                                            var63 = var9.field2651[var62];
                                        }
                                        if (var63 != null) {
                                            method2046(var63, var9.field2645, 57, var62 + 1, var9.field2696, var9.field2626);
                                        }
                                    }
                                    if (class165.method1423(Statics.method129(var9))) {
                                        method2046(class137.field2318, "", 30, 0, var9.field2696, var9.field2626);
                                    }
                                } else if (class165.method3139(Statics.method129(var9)) && (Statics.field32 & 0x20) == 32) {
                                    method2046(field521, field516 + " " + class2.field26 + " " + var9.field2645, 58, 0, var9.field2696, var9.field2626);
                                }
                            }
                        }
                        if (var9.field2628 == 0) {
                            if (!var9.field2625 && Statics.method866(var9) && Statics.field796 != var9) {
                                continue;
                            }
                            method2721(arg0, var9.field2626, var12, var13, var14, var15, var10 - var9.field2639, var11 - var9.field2640);
                            if (var9.field2734 != null) {
                                method2721(var9.field2734, var9.field2626, var12, var13, var14, var15, var10 - var9.field2639, var11 - var9.field2640);
                            }
                            class4 var65 = (class4) field658.method3314((long) var9.field2626);
                            if (var65 != null) {
                                if (var65.field58 == 0 && class78.field1397 >= var12 && class78.field1398 * -58530351 >= var13 && class78.field1397 < var14 && class78.field1398 * -58530351 < var15 && !field639 && !field666) {
                                    field645[0] = class137.field2329;
                                    field646[0] = "";
                                    field643[0] = 1006;
                                    field631 = 1;
                                }
                                int var66 = var65.field57;
                                if (class161.method1456(var66)) {
                                    method2721(Statics.field2616[var66], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2625) {
                            if (var9.field2743 && class78.field1397 >= var12 && class78.field1398 * -58530351 >= var13 && class78.field1397 < var14 && class78.field1398 * -58530351 < var15) {
                                for (class1 var67 = (class1) field694.method3331(); var67 != null; var67 = (class1) field694.method3333()) {
                                    if (var67.field2) {
                                        var67.method3366();
                                        var67.field1.field2633 = false;
                                    }
                                }
                                if (Statics.field321 == 0) {
                                    field535 = null;
                                    field669 = null;
                                }
                                if (!field639) {
                                    field645[0] = class137.field2329;
                                    field646[0] = "";
                                    field643[0] = 1006;
                                    field631 = 1;
                                }
                            }
                            boolean var68;
                            if (class78.field1397 >= var12 && class78.field1398 * -58530351 >= var13 && class78.field1397 < var14 && class78.field1398 * -58530351 < var15) {
                                var68 = true;
                            } else {
                                var68 = false;
                            }
                            boolean var69 = false;
                            if ((class78.field1396 == 1 || !Statics.field2078 && class78.field1396 == 4) && var68) {
                                var69 = true;
                            }
                            boolean var70 = false;
                            if ((class78.field1393 == 1 || !Statics.field2078 && class78.field1393 == 4) && class78.field1404 >= var12 && class78.field1405 >= var13 && class78.field1404 < var14 && class78.field1405 < var15) {
                                var70 = true;
                            }
                            if (var70) {
                                method2727(var9, class78.field1404 - var10, class78.field1405 - var11);
                            }
                            if (field535 != null && field535 != var9 && var68 && class165.method162(Statics.method129(var9))) {
                                field741 = var9;
                            }
                            if (field669 == var9) {
                                field673 = true;
                                field674 = var10;
                                field675 = var11;
                            }
                            if (var9.field2644) {
                                if (var68 && field539 != 0 && var9.field2714 != null) {
                                    class1 var71 = new class1();
                                    var71.field2 = true;
                                    var71.field1 = var9;
                                    var71.field5 = field539;
                                    var71.field12 = var9.field2714;
                                    field694.method3328(var71);
                                }
                                if (field535 != null || Statics.field1290 != null || field639) {
                                    var70 = false;
                                    var69 = false;
                                    var68 = false;
                                }
                                if (!var9.field2736 && var70) {
                                    var9.field2736 = true;
                                    if (var9.field2653 != null) {
                                        class1 var72 = new class1();
                                        var72.field2 = true;
                                        var72.field1 = var9;
                                        var72.field14 = class78.field1404 - var10;
                                        var72.field5 = class78.field1405 - var11;
                                        var72.field12 = var9.field2653;
                                        field694.method3328(var72);
                                    }
                                }
                                if (var9.field2736 && var69 && var9.field2699 != null) {
                                    class1 var73 = new class1();
                                    var73.field2 = true;
                                    var73.field1 = var9;
                                    var73.field14 = class78.field1397 - var10;
                                    var73.field5 = class78.field1398 * -58530351 - var11;
                                    var73.field12 = var9.field2699;
                                    field694.method3328(var73);
                                }
                                if (var9.field2736 && !var69) {
                                    var9.field2736 = false;
                                    if (var9.field2697 != null) {
                                        class1 var74 = new class1();
                                        var74.field2 = true;
                                        var74.field1 = var9;
                                        var74.field14 = class78.field1397 - var10;
                                        var74.field5 = class78.field1398 * -58530351 - var11;
                                        var74.field12 = var9.field2697;
                                        field517.method3328(var74);
                                    }
                                }
                                if (var69 && var9.field2698 != null) {
                                    class1 var75 = new class1();
                                    var75.field2 = true;
                                    var75.field1 = var9;
                                    var75.field14 = class78.field1397 - var10;
                                    var75.field5 = class78.field1398 * -58530351 - var11;
                                    var75.field12 = var9.field2698;
                                    field694.method3328(var75);
                                }
                                if (!var9.field2633 && var68) {
                                    var9.field2633 = true;
                                    if (var9.field2721 != null) {
                                        class1 var76 = new class1();
                                        var76.field2 = true;
                                        var76.field1 = var9;
                                        var76.field14 = class78.field1397 - var10;
                                        var76.field5 = class78.field1398 * -58530351 - var11;
                                        var76.field12 = var9.field2721;
                                        field694.method3328(var76);
                                    }
                                }
                                if (var9.field2633 && var68 && var9.field2700 != null) {
                                    class1 var77 = new class1();
                                    var77.field2 = true;
                                    var77.field1 = var9;
                                    var77.field14 = class78.field1397 - var10;
                                    var77.field5 = class78.field1398 * -58530351 - var11;
                                    var77.field12 = var9.field2700;
                                    field694.method3328(var77);
                                }
                                if (var9.field2633 && !var68) {
                                    var9.field2633 = false;
                                    if (var9.field2701 != null) {
                                        class1 var78 = new class1();
                                        var78.field2 = true;
                                        var78.field1 = var9;
                                        var78.field14 = class78.field1397 - var10;
                                        var78.field5 = class78.field1398 * -58530351 - var11;
                                        var78.field12 = var9.field2701;
                                        field517.method3328(var78);
                                    }
                                }
                                if (var9.field2735 != null) {
                                    class1 var79 = new class1();
                                    var79.field1 = var9;
                                    var79.field12 = var9.field2735;
                                    field520.method3328(var79);
                                }
                                if (var9.field2706 != null && field682 > var9.field2738) {
                                    if (var9.field2707 == null || field682 - var9.field2738 > 32) {
                                        class1 var84 = new class1();
                                        var84.field1 = var9;
                                        var84.field12 = var9.field2706;
                                        field694.method3328(var84);
                                    } else {
                                        label694: for (int var80 = var9.field2738; var80 < field682; var80++) {
                                            int var81 = field738[var80 & 0x1F];
                                            for (int var82 = 0; var82 < var9.field2707.length; var82++) {
                                                if (var9.field2707[var82] == var81) {
                                                    class1 var83 = new class1();
                                                    var83.field1 = var9;
                                                    var83.field12 = var9.field2706;
                                                    field694.method3328(var83);
                                                    break label694;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2738 = field682;
                                }
                                if (var9.field2687 != null && field614 > var9.field2739) {
                                    if (var9.field2686 == null || field614 - var9.field2739 > 32) {
                                        class1 var89 = new class1();
                                        var89.field1 = var9;
                                        var89.field12 = var9.field2687;
                                        field694.method3328(var89);
                                    } else {
                                        label670: for (int var85 = var9.field2739; var85 < field614; var85++) {
                                            int var86 = field683[var85 & 0x1F];
                                            for (int var87 = 0; var87 < var9.field2686.length; var87++) {
                                                if (var9.field2686[var87] == var86) {
                                                    class1 var88 = new class1();
                                                    var88.field1 = var9;
                                                    var88.field12 = var9.field2687;
                                                    field694.method3328(var88);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2739 = field614;
                                }
                                if (var9.field2693 != null && field681 > var9.field2740) {
                                    if (var9.field2671 == null || field681 - var9.field2740 > 32) {
                                        class1 var94 = new class1();
                                        var94.field1 = var9;
                                        var94.field12 = var9.field2693;
                                        field694.method3328(var94);
                                    } else {
                                        label646: for (int var90 = var9.field2740; var90 < field681; var90++) {
                                            int var91 = field685[var90 & 0x1F];
                                            for (int var92 = 0; var92 < var9.field2671.length; var92++) {
                                                if (var9.field2671[var92] == var91) {
                                                    class1 var93 = new class1();
                                                    var93.field1 = var9;
                                                    var93.field12 = var9.field2693;
                                                    field694.method3328(var93);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2740 = field681;
                                }
                                if (field608 > var9.field2737 && var9.field2715 != null) {
                                    class1 var95 = new class1();
                                    var95.field1 = var9;
                                    var95.field12 = var9.field2715;
                                    field694.method3328(var95);
                                }
                                if (field688 > var9.field2737 && var9.field2717 != null) {
                                    class1 var96 = new class1();
                                    var96.field1 = var9;
                                    var96.field12 = var9.field2717;
                                    field694.method3328(var96);
                                }
                                if (field660 > var9.field2737 && var9.field2718 != null) {
                                    class1 var97 = new class1();
                                    var97.field1 = var9;
                                    var97.field12 = var9.field2718;
                                    field694.method3328(var97);
                                }
                                if (field690 > var9.field2737 && var9.field2719 != null) {
                                    class1 var98 = new class1();
                                    var98.field1 = var9;
                                    var98.field12 = var9.field2719;
                                    field694.method3328(var98);
                                }
                                var9.field2737 = field680;
                                if (var9.field2716 != null) {
                                    for (int var99 = 0; var99 < field742; var99++) {
                                        class1 var100 = new class1();
                                        var100.field1 = var9;
                                        var100.field19 = field720[var99];
                                        var100.field3 = field719[var99];
                                        var100.field12 = var9.field2716;
                                        field694.method3328(var100);
                                    }
                                }
                            }
                        }
                        if (!var9.field2625 && field535 == null && Statics.field1290 == null && !field639) {
                            if ((var9.field2725 >= 0 || var9.field2720 != 0) && class78.field1397 >= var12 && class78.field1398 * -58530351 >= var13 && class78.field1397 < var14 && class78.field1398 * -58530351 < var15) {
                                if (var9.field2725 >= 0) {
                                    Statics.field796 = arg0[var9.field2725];
                                } else {
                                    Statics.field796 = var9;
                                }
                            }
                            if (var9.field2628 == 8 && class78.field1397 >= var12 && class78.field1398 * -58530351 >= var13 && class78.field1397 < var14 && class78.field1398 * -58530351 < var15) {
                                Statics.field917 = var9;
                            }
                            if (var9.field2654 > var9.field2624) {
                                method1(var9, var9.field2635 + var10, var11, var9.field2624, var9.field2654, class78.field1397, class78.field1398 * -58530351);
                            }
                        }
                    } else if ((field731 == 0 || field731 == 3) && (class78.field1393 == 1 || !Statics.field2078 && class78.field1393 == 4)) {
                        int var26 = class78.field1404 - 25 - var10;
                        int var27 = class78.field1405 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field582 + field568 & 0x7FF;
                            int var29 = class105.field1755[var28];
                            int var30 = class105.field1765[var28];
                            int var31 = (field570 + 256) * var29 >> 8;
                            int var32 = (field570 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field1383.field443 + var33 >> 7;
                            int var36 = Statics.field1383.field439 - var34 >> 7;
                            field543.method2333(194);
                            field543.method2634(18);
                            field543.method2484(Statics.field949 + var35);
                            field543.method2475(class76.field1369[82] ? (class76.field1369[81] ? 2 : 1) : 0);
                            field543.method2484(Statics.field2063 + var36);
                            field543.method2634(var26);
                            field543.method2634(var27);
                            field543.method2603(field582);
                            field543.method2634(57);
                            field543.method2634(field568);
                            field543.method2634(field570);
                            field543.method2634(89);
                            field543.method2603(Statics.field1383.field443);
                            field543.method2603(Statics.field1383.field439);
                            field543.method2634(63);
                            field711 = var35;
                            field730 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.ct(III)V")
    public static final void method151(int arg0, int arg1) {
        if (class161.method1456(arg0)) {
            method252(Statics.field2616[arg0], arg1);
        }
    }

    @ObfuscatedName("h.cj([Lfl;II)V")
    public static final void method252(class161[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class161 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2628 == 0) {
                    if (var3.field2734 != null) {
                        method252(var3.field2734, arg1);
                    }
                    class4 var4 = (class4) field658.method3314((long) var3.field2626);
                    if (var4 != null) {
                        method151(var4.field57, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2689 != null) {
                    class1 var5 = new class1();
                    var5.field1 = var3;
                    var5.field12 = var3.field2689;
                    class27.method865(var5);
                }
                if (arg1 == 1 && var3.field2665 != null) {
                    if (var3.field2696 >= 0) {
                        class161 var6 = class161.method2772(var3.field2626);
                        if (var6 == null || var6.field2734 == null || var3.field2696 >= var6.field2734.length || var6.field2734[var3.field2696] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field1 = var3;
                    var7.field12 = var3.field2665;
                    class27.method865(var7);
                }
            }
        }
    }

    @ObfuscatedName("eq.cy(Lfl;III)V")
    public static final void method2727(class161 arg0, int arg1, int arg2) {
        if (field535 != null || field639 || arg0 == null) {
            return;
        }
        class161 var3 = method2711(arg0);
        if (var3 == null) {
            var3 = arg0.field2688;
        }
        if (var3 == null) {
            return;
        }
        field535 = arg0;
        class161 var5 = method2711(arg0);
        if (var5 == null) {
            var5 = arg0.field2688;
        }
        field669 = var5;
        field670 = arg1;
        field713 = arg2;
        Statics.field321 = 0;
        field684 = false;
        if (field631 > 0) {
            method236(field631 - 1);
        }
        return;
    }

    @ObfuscatedName("dk.ca(I)V")
    public static final void method2219() {
        method2218(field535);
        Statics.field321++;
        if (field676 && field673) {
            int var0 = class78.field1397;
            int var1 = class78.field1398 * -58530351;
            int var2 = var0 - field670;
            int var3 = var1 - field713;
            if (var2 < field674) {
                var2 = field674;
            }
            if (field535.field2635 + var2 > field674 + field669.field2635) {
                var2 = field674 + field669.field2635 - field535.field2635;
            }
            if (var3 < field675) {
                var3 = field675;
            }
            if (field535.field2624 + var3 > field675 + field669.field2624) {
                var3 = field675 + field669.field2624 - field535.field2624;
            }
            int var4 = var2 - field677;
            int var5 = var3 - field591;
            int var6 = field535.field2727;
            if (Statics.field321 > field535.field2690 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field684 = true;
            }
            int var7 = field669.field2639 + (var2 - field674);
            int var8 = field669.field2640 + (var3 - field675);
            if (field535.field2702 != null && field684) {
                class1 var9 = new class1();
                var9.field1 = field535;
                var9.field14 = var7;
                var9.field5 = var8;
                var9.field12 = field535.field2702;
                class27.method865(var9);
            }
            if (class78.field1396 == 0) {
                if (field684) {
                    if (field535.field2691 != null) {
                        class1 var10 = new class1();
                        var10.field1 = field535;
                        var10.field14 = var7;
                        var10.field5 = var8;
                        var10.field7 = field741;
                        var10.field12 = field535.field2691;
                        class27.method865(var10);
                    }
                    if (field741 != null && method2711(field535) != null) {
                        field543.method2333(154);
                        field543.method2542(field741.field2626);
                        field543.method2449(field535.field2696);
                        field543.method2454(field535.field2626);
                        field543.method2449(field741.field2696);
                    }
                } else if ((field638 == 1 || method772(field631 - 1)) && field631 > 2) {
                    method2043(field677 + field670, field713 + field591);
                } else if (field631 > 0) {
                    method228(field677 + field670, field713 + field591);
                }
                field535 = null;
            }
        } else if (Statics.field321 > 1) {
            field535 = null;
        }
    }

    @ObfuscatedName("l.cu(IB)V")
    public static void method236(int arg0) {
        Statics.field308 = new class21();
        Statics.field308.field323 = field641[arg0];
        Statics.field308.field316 = field642[arg0];
        Statics.field308.field322 = field643[arg0];
        Statics.field308.field318 = field679[arg0];
        Statics.field308.field315 = field645[arg0];
    }

    @ObfuscatedName("r.cq(III)V")
    public static void method228(int arg0, int arg1) {
        class21 var2 = Statics.field308;
        method2316(var2.field323, var2.field316, var2.field322, var2.field318, var2.field315, var2.field315, arg0, arg1);
        Statics.field308 = null;
    }

    @ObfuscatedName("dk.cb(Lfl;B)V")
    public static void method2218(class161 arg0) {
        if (field699 == arg0.field2618) {
            field700[arg0.field2730] = true;
        }
    }

    @ObfuscatedName("a.cc(B)V")
    public static void method115() {
        for (class4 var0 = (class4) field658.method3313(); var0 != null; var0 = (class4) field658.method3323()) {
            int var1 = var0.field57;
            if (class161.method1456(var1)) {
                boolean var2 = true;
                class161[] var3 = Statics.field2616[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2625;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2839;
                    class161 var6 = class161.method2772(var5);
                    if (var6 != null) {
                        method2218(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.dt([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method1371(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("al.di(IB)V")
    public static final void method592(int arg0) {
        if (!class161.method1456(arg0)) {
            return;
        }
        class161[] var1 = Statics.field2616[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class161 var3 = var1[var2];
            if (var3 != null) {
                var3.field2732 = 0;
                var3.field2733 = 0;
            }
        }
    }

    @ObfuscatedName("ad.dm(II)V")
    public static final void method928(int arg0) {
        if (class161.method1456(arg0)) {
            method711(Statics.field2616[arg0], -1);
        }
    }

    @ObfuscatedName("av.dk([Lfl;II)V")
    public static final void method711(class161[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class161 var3 = arg0[var2];
            if (var3 != null && var3.field2637 == arg1 && (!var3.field2625 || !Statics.method866(var3))) {
                if (var3.field2628 == 0) {
                    if (!var3.field2625 && Statics.method866(var3) && Statics.field796 != var3) {
                        continue;
                    }
                    method711(arg0, var3.field2626);
                    if (var3.field2734 != null) {
                        method711(var3.field2734, var3.field2626);
                    }
                    class4 var4 = (class4) field658.method3314((long) var3.field2626);
                    if (var4 != null) {
                        method928(var4.field57);
                    }
                }
                if (var3.field2628 == 6) {
                    if (var3.field2662 != -1 || var3.field2663 != -1) {
                        boolean var5 = method62(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2663;
                        } else {
                            var6 = var3.field2662;
                        }
                        if (var6 != -1) {
                            class35 var7 = class35.method28(var6);
                            var3.field2733 += field534;
                            while (var3.field2733 > var7.field902[var3.field2732]) {
                                var3.field2733 -= var7.field902[var3.field2732];
                                var3.field2732++;
                                if (var3.field2732 >= var7.field900.length) {
                                    var3.field2732 -= var7.field914;
                                    if (var3.field2732 < 0 || var3.field2732 >= var7.field900.length) {
                                        var3.field2732 = 0;
                                    }
                                }
                                method2218(var3);
                            }
                        }
                    }
                    if (var3.field2667 != 0 && !var3.field2625) {
                        int var8 = var3.field2667 >> 16;
                        int var9 = var3.field2667 << 16 >> 16;
                        int var10 = field534 * var8;
                        int var11 = field534 * var9;
                        var3.field2666 = var3.field2666 + var10 & 0x7FF;
                        var3.field2673 = var3.field2673 + var11 & 0x7FF;
                        method2218(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.de(II)V")
    public static final void method3012(int arg0) {
        method115();
        for (class7 var1 = (class7) class7.field115.method3331(); var1 != null; var1 = (class7) class7.field115.method3333()) {
            if (var1.field108 != null) {
                var1.method45();
            }
        }
        int var2 = Statics.method2394(arg0).field1055;
        if (var2 == 0) {
            return;
        }
        int var3 = class162.field2748[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class105.method2137(0.9D);
                ((class111) Statics.field1775).method2227(0.9D);
            }
            if (var3 == 2) {
                class105.method2137(0.8D);
                ((class111) Statics.field1775).method2227(0.8D);
            }
            if (var3 == 3) {
                class105.method2137(0.7D);
                ((class111) Statics.field1775).method2227(0.7D);
            }
            if (var3 == 4) {
                class105.method2137(0.6D);
                ((class111) Statics.field1775).method2227(0.6D);
            }
            class41.method47();
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (field546 != var4) {
                if (field546 == 0 && field755 != -1) {
                    class141.method267(Statics.field97, field755, 0, var4, false);
                    field640 = false;
                } else if (var4 == 0) {
                    Statics.field2373.method2797();
                    class141.field2377 = 1;
                    Statics.field2378 = null;
                    field640 = false;
                } else if (class141.field2377 == 0) {
                    Statics.field2373.method2826(var4);
                } else {
                    Statics.field2380 = var4;
                }
                field546 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field735 = 127;
            }
            if (var3 == 1) {
                field735 = 96;
            }
            if (var3 == 2) {
                field735 = 64;
            }
            if (var3 == 3) {
                field735 = 32;
            }
            if (var3 == 4) {
                field735 = 0;
            }
        }
        if (var2 == 5) {
            field638 = var3;
        }
        if (var2 == 6) {
            field659 = var3;
        }
        if (var2 == 9) {
            field657 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field736 = 127;
        }
        if (var3 == 1) {
            field736 = 96;
        }
        if (var3 == 2) {
            field736 = 64;
        }
        if (var3 == 3) {
            field736 = 32;
        }
        if (var3 == 4) {
            field736 = 0;
        }
    }

    @ObfuscatedName("bh.dp(Lfl;I)V")
    public static final void method1430(class161 arg0) {
        int var1 = arg0.field2630;
        if (var1 == 324) {
            if (field756 == -1) {
                field756 = arg0.field2650;
                field757 = arg0.field2728;
            }
            if (field693.field2766) {
                arg0.field2650 = field756;
            } else {
                arg0.field2650 = field757;
            }
        } else if (var1 == 325) {
            if (field756 == -1) {
                field756 = arg0.field2650;
                field757 = arg0.field2728;
            }
            if (field693.field2766) {
                arg0.field2650 = field757;
            } else {
                arg0.field2650 = field756;
            }
        } else if (var1 == 327) {
            arg0.field2666 = 150;
            arg0.field2673 = (int) (Math.sin((double) field569 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2658 = 5;
            arg0.field2652 = 0;
        } else if (var1 == 328) {
            arg0.field2666 = 150;
            arg0.field2673 = (int) (Math.sin((double) field569 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2658 = 5;
            arg0.field2652 = 1;
        }
    }

    @ObfuscatedName("av.dc(IIII)Lq;")
    public static final class4 method729(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field57 = arg1;
        var3.field58 = arg2;
        field658.method3311(var3, (long) arg0);
        method592(arg1);
        class27.method1229(arg1);
        class161 var4 = class161.method2772(arg0);
        if (var4 != null) {
            method2218(var4);
        }
        if (field661 != null) {
            method2218(field661);
            field661 = null;
        }
        method2217();
        if (field566 != -1) {
            method151(field566, 1);
        }
        return var3;
    }

    @ObfuscatedName("u.dz(Lq;ZI)V")
    public static final void method131(class4 arg0, boolean arg1) {
        int var2 = arg0.field57;
        int var3 = (int) arg0.field2839;
        arg0.method3366();
        if (arg1) {
            class161.method2430(var2);
        }
        for (class173 var4 = (class173) field575.method3313(); var4 != null; var4 = (class173) field575.method3323()) {
            if ((long) var2 == (var4.field2839 >> 48 & 0xFFFFL)) {
                var4.method3366();
            }
        }
        class161 var5 = class161.method2772(var3);
        if (var5 != null) {
            method2218(var5);
        }
        method2217();
        if (field566 != -1) {
            method151(field566, 1);
        }
    }

    @ObfuscatedName("l.do(Lfl;I)Z")
    public static final boolean method238(class161 arg0) {
        int var1 = arg0.field2630;
        if (var1 == 205) {
            field714 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field693.method3222(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field693.method3244(var4, var5 == 1);
        }
        if (var1 == 324) {
            field693.method3251(false);
        }
        if (var1 == 325) {
            field693.method3251(true);
        }
        if (var1 == 326) {
            field543.method2333(122);
            field693.method3224(field543);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("r.dj(IIIB)V")
    public static final void method222(int arg0, int arg1, int arg2) {
        method2231();
        class90.method1822(arg0, arg1, Statics.field1813.field1473 + arg0, Statics.field1813.field1471 + arg1);
        if (field731 == 2 || field731 == 5) {
            class90.method1837(arg0 + 25, arg1 + 5, 0, Statics.field1997, Statics.field2062);
        } else {
            int var3 = field582 + field568 & 0x7FF;
            int var4 = Statics.field1383.field443 / 32 + 48;
            int var5 = 464 - Statics.field1383.field439 / 32;
            Statics.field2808.method1747(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field570 + 256, Statics.field1997, Statics.field2062);
            for (int var6 = 0; var6 < field725; var6++) {
                int var7 = field618[var6] * 4 + 2 - Statics.field1383.field443 / 32;
                int var8 = field727[var6] * 4 + 2 - Statics.field1383.field439 / 32;
                method164(arg0, arg1, var7, var8, field728[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class179 var11 = field553[Statics.field2001][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1383.field443 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1383.field439 / 32;
                        method164(arg0, arg1, var12, var13, Statics.field766[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field537; var14++) {
                class26 var15 = field536[field538[var14]];
                if (var15 != null && var15.method17()) {
                    class32 var16 = var15.field413;
                    if (var16 != null && var16.field823 != null) {
                        var16 = var16.method659();
                    }
                    if (var16 != null && var16.field814 && var16.field826) {
                        int var17 = var15.field443 / 32 - Statics.field1383.field443 / 32;
                        int var18 = var15.field439 / 32 - Statics.field1383.field439 / 32;
                        method164(arg0, arg1, var17, var18, Statics.field766[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field585; var19++) {
                class3 var20 = field678[field734[var19]];
                if (var20 != null && var20.method17()) {
                    int var21 = var20.field443 / 32 - Statics.field1383.field443 / 32;
                    int var22 = var20.field439 / 32 - Statics.field1383.field439 / 32;
                    boolean var23 = false;
                    if (method2745(var20.field52, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field247; var25++) {
                        if (var20.field52.equals(Statics.field792[var25].field129)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1383.field47 != 0 && var20.field47 != 0 && Statics.field1383.field47 == var20.field47) {
                        var26 = true;
                    }
                    if (var23) {
                        method164(arg0, arg1, var21, var22, Statics.field766[3]);
                    } else if (var26) {
                        method164(arg0, arg1, var21, var22, Statics.field766[4]);
                    } else if (var24) {
                        method164(arg0, arg1, var21, var22, Statics.field766[5]);
                    } else {
                        method164(arg0, arg1, var21, var22, Statics.field766[2]);
                    }
                }
            }
            if (field656 != 0 && field569 % 20 < 10) {
                if (field656 == 1 && field754 >= 0 && field754 < field536.length) {
                    class26 var27 = field536[field754];
                    if (var27 != null) {
                        int var28 = var27.field443 / 32 - Statics.field1383.field443 / 32;
                        int var29 = var27.field439 / 32 - Statics.field1383.field439 / 32;
                        method1665(arg0, arg1, var28, var29, Statics.field211[1]);
                    }
                }
                if (field656 == 2) {
                    int var30 = field689 * 4 - Statics.field949 * 4 + 2 - Statics.field1383.field443 / 32;
                    int var31 = field619 * 4 - Statics.field2063 * 4 + 2 - Statics.field1383.field439 / 32;
                    method1665(arg0, arg1, var30, var31, Statics.field211[1]);
                }
                if (field656 == 10 && field744 >= 0 && field744 < field678.length) {
                    class3 var32 = field678[field744];
                    if (var32 != null) {
                        int var33 = var32.field443 / 32 - Statics.field1383.field443 / 32;
                        int var34 = var32.field439 / 32 - Statics.field1383.field439 / 32;
                        method1665(arg0, arg1, var33, var34, Statics.field211[1]);
                    }
                }
            }
            if (field711 != 0) {
                int var35 = field711 * 4 + 2 - Statics.field1383.field443 / 32;
                int var36 = field730 * 4 + 2 - Statics.field1383.field439 / 32;
                method164(arg0, arg1, var35, var36, Statics.field211[0]);
            }
            class90.method1828(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field731 < 3) {
            Statics.field1312.method1747(arg0, arg1, 33, 33, 25, 25, field582, 256, Statics.field278, Statics.field298);
        } else {
            class90.method1837(arg0, arg1, 0, Statics.field278, Statics.field298);
        }
        if (field632[arg2]) {
            Statics.field1813.method1811(arg0, arg1);
        }
        field701[arg2] = true;
    }

    @ObfuscatedName("cp.dw(IIIILcw;I)V")
    public static final void method1665(int arg0, int arg1, int arg2, int arg3, class87 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method164(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field582 + field568 & 0x7FF;
        int var7 = class105.field1755[var6];
        int var8 = class105.field1765[var6];
        int var9 = var7 * 256 / (field570 + 256);
        int var10 = var8 * 256 / (field570 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1831.method1743(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("x.dv(IIIILcw;B)V")
    public static final void method164(int arg0, int arg1, int arg2, int arg3, class87 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field582 + field568 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class105.field1755[var5];
        int var8 = class105.field1765[var5];
        int var9 = var7 * 256 / (field570 + 256);
        int var10 = var8 * 256 / (field570 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1751(Statics.field1813, arg0 + 94 + var11 - arg4.field1464 / 2 + 4, arg1 + 83 - var12 - arg4.field1461 / 2 - 4);
        } else {
            arg4.method1738(arg0 + 94 + var11 - arg4.field1464 / 2 + 4, arg1 + 83 - var12 - arg4.field1461 / 2 - 4);
        }
    }

    @ObfuscatedName("cz.dr(ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method1883(int arg0, String arg1, String arg2) {
        method2894(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("en.dx(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2894(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field708[var4] = field708[var4 - 1];
            field709[var4] = field709[var4 - 1];
            field664[var4] = field664[var4 - 1];
            field710[var4] = field710[var4 - 1];
        }
        field708[0] = arg0;
        field709[0] = arg1;
        field664[0] = arg2;
        field710[0] = arg3;
        field620++;
        field608 = field680;
    }

    @ObfuscatedName("el.dq(Ljava/lang/String;ZS)Z")
    public static boolean method2745(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class151.method1290(arg0, Statics.field2446);
        for (int var3 = 0; var3 < field749; var3++) {
            if (var2.equalsIgnoreCase(class151.method1290(field751[var3].field385, Statics.field2446)) && (!arg1 || field751[var3].field387 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class151.method1290(Statics.field1383.field52, Statics.field2446))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("eq.da(Ljava/lang/String;I)Z")
    public static boolean method2724(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class151.method1290(arg0, Statics.field2446);
        for (int var2 = 0; var2 < field753; var2++) {
            class11 var3 = field530[var2];
            if (var1.equalsIgnoreCase(class151.method1290(var3.field185, Statics.field2446))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class151.method1290(var3.field186, Statics.field2446))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ef.df(Ljava/lang/String;ZI)V")
    public static final void method2709(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field753 < 100 || field624 == 1) || field753 >= 400) {
            method1883(31, "", class137.field2207);
            return;
        }
        String var2 = class151.method1290(arg0, Statics.field2446);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field753; var3++) {
            class11 var4 = field530[var3];
            String var5 = class151.method1290(var4.field185, Statics.field2446);
            if (var5 != null && var5.equals(var2)) {
                method1883(31, "", arg0 + class137.field2265);
                return;
            }
            if (var4.field186 != null) {
                String var6 = class151.method1290(var4.field186, Statics.field2446);
                if (var6 != null && var6.equals(var2)) {
                    method1883(31, "", arg0 + class137.field2265);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field749; var7++) {
            class24 var8 = field751[var7];
            String var9 = class151.method1290(var8.field385, Statics.field2446);
            if (var9 != null && var9.equals(var2)) {
                method1883(31, "", class137.field2140 + arg0 + class137.field2315);
                return;
            }
            if (var8.field386 != null) {
                String var10 = class151.method1290(var8.field386, Statics.field2446);
                if (var10 != null && var10.equals(var2)) {
                    method1883(31, "", class137.field2140 + arg0 + class137.field2315);
                    return;
                }
            }
        }
        if (class151.method1290(Statics.field1383.field52, Statics.field2446).equals(var2)) {
            method1883(31, "", class137.field2261);
        } else {
            field543.method2333(116);
            field543.method2634(class128.method254(arg0));
            field543.method2445(arg0);
        }
    }

    @ObfuscatedName("de.dy(Ljava/lang/String;IB)V")
    public static final void method2220(String arg0, int arg1) {
        field543.method2333(89);
        field543.method2634(class128.method254(arg0) + 1);
        field543.method2445(arg0);
        field543.method2477(arg1);
    }

    @ObfuscatedName("k.du(Ljava/lang/String;I)V")
    public static final void method18(String arg0) {
        if (!arg0.equals("")) {
            field543.method2333(118);
            field543.method2634(class128.method254(arg0));
            field543.method2445(arg0);
        }
    }

    @ObfuscatedName("et.dn(Lfl;I)Lfl;")
    public static class161 method2711(class161 arg0) {
        int var1 = class165.method1678(Statics.method129(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class161.method2772(arg0.field2637);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }
}

package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.c")
    public static boolean field493 = true;

    @ObfuscatedName("client.d")
    public static int field494 = 1;

    @ObfuscatedName("client.i")
    public static int field495 = 0;

    @ObfuscatedName("client.z")
    public static boolean field582 = false;

    @ObfuscatedName("client.j")
    public static boolean field584 = false;

    @ObfuscatedName("client.h")
    public static int field702 = 0;

    @ObfuscatedName("client.q")
    public static int field515 = 1;

    @ObfuscatedName("client.w")
    public static class164[] field681 = new class164[4];

    @ObfuscatedName("client.o")
    public static int field699 = 0;

    @ObfuscatedName("client.f")
    public static boolean field638 = true;

    @ObfuscatedName("client.r")
    public static int field652 = 0;

    @ObfuscatedName("client.s")
    public static long field505 = 1L;

    @ObfuscatedName("client.m")
    public static int field506 = -1;

    @ObfuscatedName("client.a")
    public static int field546 = -1;

    @ObfuscatedName("client.n")
    public static int field508 = -1;

    @ObfuscatedName("client.v")
    public static boolean field721 = true;

    @ObfuscatedName("client.e")
    public static boolean field510 = false;

    @ObfuscatedName("client.ar")
    public static int field511 = 0;

    @ObfuscatedName("client.ak")
    public static int field497 = 0;

    @ObfuscatedName("client.ap")
    public static int field647 = 0;

    @ObfuscatedName("client.aa")
    public static int field514 = 0;

    @ObfuscatedName("client.av")
    public static int field709 = 0;

    @ObfuscatedName("client.aq")
    public static int field516 = 0;

    @ObfuscatedName("client.an")
    public static int field517 = 0;

    @ObfuscatedName("client.al")
    public static int field518 = 0;

    @ObfuscatedName("client.ax")
    public static int field519 = 0;

    @ObfuscatedName("client.as")
    public static class127 field565 = new class127(new byte[5000]);

    @ObfuscatedName("client.ac")
    public static int field522 = 0;

    @ObfuscatedName("client.ao")
    public static int field523 = 0;

    @ObfuscatedName("client.au")
    public static int field524 = 0;

    @ObfuscatedName("client.bm")
    public static int field525 = 0;

    @ObfuscatedName("client.bw")
    public static int field526 = 0;

    @ObfuscatedName("client.bc")
    public static int field527 = 0;

    @ObfuscatedName("client.bo")
    public static int field528 = 0;

    @ObfuscatedName("client.bq")
    public static int field529 = 0;

    @ObfuscatedName("client.bg")
    public static class25[] field530 = new class25[32768];

    @ObfuscatedName("client.bu")
    public static int field695 = 0;

    @ObfuscatedName("client.bx")
    public static int[] field532 = new int[32768];

    @ObfuscatedName("client.cm")
    public static class116 field534 = new class116(5000);

    @ObfuscatedName("client.cw")
    public static class116 field535 = new class116(5000);

    @ObfuscatedName("client.cs")
    public static class116 field536 = new class116(5000);

    @ObfuscatedName("client.cv")
    public static int field537 = 0;

    @ObfuscatedName("client.cu")
    public static int field538 = 0;

    @ObfuscatedName("client.cn")
    public static int field563 = 0;

    @ObfuscatedName("client.ce")
    public static int field540 = 0;

    @ObfuscatedName("client.ci")
    public static int field541 = 0;

    @ObfuscatedName("client.cj")
    public static int field542 = 0;

    @ObfuscatedName("client.ct")
    public static int field543 = 0;

    @ObfuscatedName("client.ck")
    public static int field544 = 0;

    @ObfuscatedName("client.cy")
    public static boolean field618 = false;

    @ObfuscatedName("client.cl")
    public static int field502 = 0;

    @ObfuscatedName("client.cb")
    public static int field749 = 0;

    @ObfuscatedName("client.cd")
    public static int field548 = 1;

    @ObfuscatedName("client.co")
    public static int field654 = 0;

    @ObfuscatedName("client.dg")
    public static int field697 = 1;

    @ObfuscatedName("client.dc")
    public static int field551 = 0;

    @ObfuscatedName("client.dm")
    public static boolean field554 = false;

    @ObfuscatedName("client.dq")
    public static int[][][] field555 = new int[4][13][13];

    @ObfuscatedName("client.dr")
    public static final int[] field556 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ds")
    public static int field557 = 0;

    @ObfuscatedName("client.dz")
    public static int[][] field558 = new int[104][104];

    @ObfuscatedName("client.du")
    public static int[][] field559 = new int[104][104];

    @ObfuscatedName("client.dn")
    public static int[] field575 = new int[4000];

    @ObfuscatedName("client.dv")
    public static int[] field561 = new int[4000];

    @ObfuscatedName("client.di")
    public static int field562 = 0;

    @ObfuscatedName("client.dx")
    public static int field599 = 2;

    @ObfuscatedName("client.dy")
    public static int field595 = 0;

    @ObfuscatedName("client.do")
    public static int field564 = 2;

    @ObfuscatedName("client.dd")
    public static int field566 = 0;

    @ObfuscatedName("client.de")
    public static int field753 = 1;

    @ObfuscatedName("client.dh")
    public static int field568 = 0;

    @ObfuscatedName("client.eb")
    public static int field596 = 0;

    @ObfuscatedName("client.el")
    public static int field570 = 2;

    @ObfuscatedName("client.ea")
    public static int field655 = 0;

    @ObfuscatedName("client.ef")
    public static int field572 = 1;

    @ObfuscatedName("client.ej")
    public static int field573 = 0;

    @ObfuscatedName("client.eg")
    public static int field574 = 0;

    @ObfuscatedName("client.eh")
    public static int field496 = 2301979;

    @ObfuscatedName("client.es")
    public static int field576 = 5063219;

    @ObfuscatedName("client.fx")
    public static int field718 = 3353893;

    @ObfuscatedName("client.fs")
    public static int field578 = 7759444;

    @ObfuscatedName("client.fw")
    public static boolean field579 = false;

    @ObfuscatedName("client.fe")
    public static int field580 = 0;

    @ObfuscatedName("client.fd")
    public static int field734 = 128;

    @ObfuscatedName("client.fn")
    public static int field583 = 0;

    @ObfuscatedName("client.ff")
    public static int field694 = 0;

    @ObfuscatedName("client.fh")
    public static int field585 = 0;

    @ObfuscatedName("client.fk")
    public static int field639 = 0;

    @ObfuscatedName("client.fm")
    public static boolean field587 = false;

    @ObfuscatedName("client.fj")
    public static int field552 = 0;

    @ObfuscatedName("client.fy")
    public static int field550 = 0;

    @ObfuscatedName("client.fl")
    public static int field683 = 50;

    @ObfuscatedName("client.fp")
    public static int[] field591 = new int[field683];

    @ObfuscatedName("client.fr")
    public static int[] field592 = new int[field683];

    @ObfuscatedName("client.fu")
    public static int[] field593 = new int[field683];

    @ObfuscatedName("client.fv")
    public static int[] field594 = new int[field683];

    @ObfuscatedName("client.fq")
    public static int[] field567 = new int[field683];

    @ObfuscatedName("client.fa")
    public static int[] field740 = new int[field683];

    @ObfuscatedName("client.gc")
    public static int[] field597 = new int[field683];

    @ObfuscatedName("client.gu")
    public static String[] field727 = new String[field683];

    @ObfuscatedName("client.gp")
    public static int[][] field615 = new int[104][104];

    @ObfuscatedName("client.ga")
    public static int field600 = 0;

    @ObfuscatedName("client.gw")
    public static int field601 = -1;

    @ObfuscatedName("client.gz")
    public static int field602 = -1;

    @ObfuscatedName("client.go")
    public static int field603 = 0;

    @ObfuscatedName("client.gy")
    public static int field604 = 0;

    @ObfuscatedName("client.gk")
    public static int field684 = 0;

    @ObfuscatedName("client.gt")
    public static int field665 = 0;

    @ObfuscatedName("client.gb")
    public static int field607 = 0;

    @ObfuscatedName("client.gv")
    public static int field608 = 0;

    @ObfuscatedName("client.gh")
    public static int field609 = 0;

    @ObfuscatedName("client.gs")
    public static int field512 = 0;

    @ObfuscatedName("client.gg")
    public static int field611 = 0;

    @ObfuscatedName("client.gi")
    public static int field612 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field613 = false;

    @ObfuscatedName("client.ge")
    public static int field614 = 0;

    @ObfuscatedName("client.gd")
    public static int field696 = 0;

    @ObfuscatedName("client.gf")
    public static class3[] field616 = new class3[2048];

    @ObfuscatedName("client.gj")
    public static int field642 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field491 = new int[2048];

    @ObfuscatedName("client.hx")
    public static int field619 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field651 = new int[2048];

    @ObfuscatedName("client.ht")
    public static class127[] field716 = new class127[2048];

    @ObfuscatedName("client.hp")
    public static int field732 = -1;

    @ObfuscatedName("client.ho")
    public static int field623 = 0;

    @ObfuscatedName("client.hn")
    public static int field624 = 0;

    @ObfuscatedName("client.hf")
    public static int[] field625 = new int[1000];

    @ObfuscatedName("client.hr")
    public static final int[] field626 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hg")
    public static String[] field627 = new String[8];

    @ObfuscatedName("client.hb")
    public static boolean[] field628 = new boolean[8];

    @ObfuscatedName("client.hi")
    public static int[] field629 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hm")
    public static class177[][][] field630 = new class177[4][104][104];

    @ObfuscatedName("client.ha")
    public static class177 field631 = new class177();

    @ObfuscatedName("client.hs")
    public static class177 field632 = new class177();

    @ObfuscatedName("client.he")
    public static class177 field633 = new class177();

    @ObfuscatedName("client.hu")
    public static int[] field634 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field635 = new int[25];

    @ObfuscatedName("client.hd")
    public static int[] field636 = new int[25];

    @ObfuscatedName("client.hq")
    public static int field637 = 0;

    @ObfuscatedName("client.hh")
    public static boolean field622 = false;

    @ObfuscatedName("client.il")
    public static int field520 = 0;

    @ObfuscatedName("client.im")
    public static int[] field640 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field507 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field577 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field643 = new int[500];

    @ObfuscatedName("client.iq")
    public static String[] field644 = new String[500];

    @ObfuscatedName("client.is")
    public static String[] field645 = new String[500];

    @ObfuscatedName("client.ir")
    public static int field646 = -1;

    @ObfuscatedName("client.ip")
    public static int field503 = -1;

    @ObfuscatedName("client.iy")
    public static int field605 = 0;

    @ObfuscatedName("client.ig")
    public static int field649 = 50;

    @ObfuscatedName("client.iv")
    public static int field673 = 0;

    @ObfuscatedName("client.it")
    public static String field549 = null;

    @ObfuscatedName("client.id")
    public static boolean field621 = false;

    @ObfuscatedName("client.in")
    public static int field545 = -1;

    @ObfuscatedName("client.ix")
    public static String field581 = null;

    @ObfuscatedName("client.jh")
    public static String field730 = null;

    @ObfuscatedName("client.je")
    public static int field656 = -1;

    @ObfuscatedName("client.ji")
    public static class175 field719 = new class175(8);

    @ObfuscatedName("client.jv")
    public static int field658 = 0;

    @ObfuscatedName("client.js")
    public static int field659 = 0;

    @ObfuscatedName("client.jl")
    public static class158 field660 = null;

    @ObfuscatedName("client.jw")
    public static int field661 = 0;

    @ObfuscatedName("client.jf")
    public static int field662 = 0;

    @ObfuscatedName("client.jr")
    public static int field663 = 0;

    @ObfuscatedName("client.jt")
    public static boolean field664 = false;

    @ObfuscatedName("client.jz")
    public static boolean field754 = false;

    @ObfuscatedName("client.jj")
    public static boolean field666 = false;

    @ObfuscatedName("client.jx")
    public static class158 field667 = null;

    @ObfuscatedName("client.jc")
    public static class158 field668 = null;

    @ObfuscatedName("client.jn")
    public static int field669 = 0;

    @ObfuscatedName("client.ja")
    public static int field670 = 0;

    @ObfuscatedName("client.jm")
    public static class158 field569 = null;

    @ObfuscatedName("client.jy")
    public static boolean field560 = false;

    @ObfuscatedName("client.jp")
    public static int field610 = -1;

    @ObfuscatedName("client.jq")
    public static int field674 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field675 = false;

    @ObfuscatedName("client.ju")
    public static int field676 = -1;

    @ObfuscatedName("client.jo")
    public static int field677 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field678 = false;

    @ObfuscatedName("client.kn")
    public static int field679 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field680 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field617 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field531 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field653 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field589 = new int[32];

    @ObfuscatedName("client.ka")
    public static int field553 = 0;

    @ObfuscatedName("client.kd")
    public static int field686 = 0;

    @ObfuscatedName("client.kt")
    public static int field687 = 0;

    @ObfuscatedName("client.km")
    public static int field748 = 0;

    @ObfuscatedName("client.kv")
    public static int field689 = 0;

    @ObfuscatedName("client.kj")
    public static int[] field690 = new int[2000];

    @ObfuscatedName("client.ke")
    public static String[] field691 = new String[1000];

    @ObfuscatedName("client.kb")
    public static int field692 = 0;

    @ObfuscatedName("client.ku")
    public static class177 field693 = new class177();

    @ObfuscatedName("client.kf")
    public static class177 field539 = new class177();

    @ObfuscatedName("client.kx")
    public static class177 field704 = new class177();

    @ObfuscatedName("client.kg")
    public static class175 field571 = new class175(512);

    @ObfuscatedName("client.kz")
    public static int field743 = 0;

    @ObfuscatedName("client.kr")
    public static int field698 = -2;

    @ObfuscatedName("client.lh")
    public static boolean[] field685 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field650 = new boolean[100];

    @ObfuscatedName("client.lx")
    public static boolean[] field701 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static int[] field606 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field703 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field547 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field705 = new int[100];

    @ObfuscatedName("client.lj")
    public static int field706 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field707 = new int[100];

    @ObfuscatedName("client.lu")
    public static String[] field590 = new String[100];

    @ObfuscatedName("client.ld")
    public static String[] field521 = new String[100];

    @ObfuscatedName("client.la")
    public static String[] field710 = new String[100];

    @ObfuscatedName("client.lw")
    public static int field671 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field712 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lq")
    public static int field713 = 0;

    @ObfuscatedName("client.ly")
    public static int field714 = 0;

    @ObfuscatedName("client.ls")
    public static long[] field682 = new long[100];

    @ObfuscatedName("client.lb")
    public static int field504 = 0;

    @ObfuscatedName("client.lv")
    public static int field717 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field513 = new int[128];

    @ObfuscatedName("client.lp")
    public static int[] field648 = new int[128];

    @ObfuscatedName("client.lc")
    public static long field720 = -1L;

    @ObfuscatedName("client.mi")
    public static String field499 = null;

    @ObfuscatedName("client.me")
    public static String field588 = null;

    @ObfuscatedName("client.mk")
    public static int field723 = -1;

    @ObfuscatedName("client.md")
    public static int field724 = 0;

    @ObfuscatedName("client.my")
    public static int[] field725 = new int[1000];

    @ObfuscatedName("client.mp")
    public static int[] field726 = new int[1000];

    @ObfuscatedName("client.mv")
    public static class86[] field711 = new class86[1000];

    @ObfuscatedName("client.mc")
    public static int field728 = 0;

    @ObfuscatedName("client.mo")
    public static int field729 = 0;

    @ObfuscatedName("client.mm")
    public static int field700 = 0;

    @ObfuscatedName("client.ml")
    public static int field731 = 255;

    @ObfuscatedName("client.mb")
    public static int field688 = -1;

    @ObfuscatedName("client.mx")
    public static boolean field733 = false;

    @ObfuscatedName("client.mg")
    public static int field498 = 127;

    @ObfuscatedName("client.mz")
    public static int field735 = 127;

    @ObfuscatedName("client.nh")
    public static int field736 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field737 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field738 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field739 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field722 = new int[50];

    @ObfuscatedName("client.nt")
    public static class57[] field741 = new class57[50];

    @ObfuscatedName("client.nx")
    public static boolean field742 = false;

    @ObfuscatedName("client.nq")
    public static boolean[] field641 = new boolean[5];

    @ObfuscatedName("client.ns")
    public static int[] field744 = new int[5];

    @ObfuscatedName("client.nn")
    public static int[] field745 = new int[5];

    @ObfuscatedName("client.ou")
    public static int[] field746 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field747 = new int[5];

    @ObfuscatedName("client.oh")
    public static int field500 = 0;

    @ObfuscatedName("client.ox")
    public static int field620 = 0;

    @ObfuscatedName("client.op")
    public static class23[] field750 = new class23[200];

    @ObfuscatedName("client.ob")
    public static class173 field751 = new class173();

    @ObfuscatedName("client.oa")
    public static int field752 = 0;

    @ObfuscatedName("client.ol")
    public static class11[] field657 = new class11[100];

    @ObfuscatedName("client.on")
    public static class163 field598 = new class163();

    @ObfuscatedName("client.om")
    public static int field755 = -1;

    @ObfuscatedName("client.ov")
    public static int field756 = -1;

    @ObfuscatedName("client.c(I)V")
    public final void method393() {
    }

    public final void init() {
        if (!this.method1454()) {
            return;
        }
        class167[] var1 = new class167[] { class167.field2784, class167.field2785, class167.field2786, class167.field2787, class167.field2783, class167.field2788, class167.field2780, class167.field2781, class167.field2789 };
        class167[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class167 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2782);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2782)) {
                    case 1:
                        Statics.field1559 = class132.method768(Integer.parseInt(var5));
                    case 2:
                    default:
                        break;
                    case 3:
                        Statics.field287 = (class133) class113.method1374(class133.method2138(), Integer.parseInt(var5));
                        if (Statics.field287 == class133.field2088) {
                            Statics.field533 = class186.field2865;
                        } else {
                            Statics.field533 = class186.field2864;
                        }
                        break;
                    case 4:
                        if (var5.equalsIgnoreCase(class2.field35)) {
                            field582 = true;
                        } else {
                            field582 = false;
                        }
                        break;
                    case 5:
                        field702 = Integer.parseInt(var5);
                        break;
                    case 6:
                        Statics.field501 = var5;
                        break;
                    case 7:
                        field495 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field494 = Integer.parseInt(var5);
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class2.field35)) {
                            field515 = 1;
                        } else {
                            field515 = 0;
                        }
                }
            }
        }
        class95.field1618 = false;
        field584 = false;
        Statics.field371 = this.getCodeBase().getHost();
        String var6 = Statics.field1559.field2082;
        byte var7 = 0;
        try {
            class82.method627("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class80.method3170((String) null, var9);
        }
        Statics.field492 = this;
        this.method1453(765, 503, 14);
    }

    @ObfuscatedName("client.b(I)V")
    public final void method370() {
        Statics.field886 = field495 == 0 ? 43594 : field494 + 40000;
        Statics.field2479 = field495 == 0 ? 443 : field494 + 50000;
        Statics.field282 = Statics.field886;
        Statics.field2734 = class161.field2719;
        Statics.field2735 = class161.field2721;
        Statics.field2736 = class161.field2720;
        Statics.field2575 = class161.field2724;
        if (Statics.field1374.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1404[44] = 71;
            class75.field1404[45] = 26;
            class75.field1404[46] = 72;
            class75.field1404[47] = 73;
            class75.field1404[59] = 57;
            class75.field1404[61] = 27;
            class75.field1404[91] = 42;
            class75.field1404[92] = 74;
            class75.field1404[93] = 43;
            class75.field1404[192] = 28;
            class75.field1404[222] = 58;
            class75.field1404[520] = 59;
        } else {
            class75.field1404[186] = 57;
            class75.field1404[187] = 27;
            class75.field1404[188] = 71;
            class75.field1404[189] = 26;
            class75.field1404[190] = 72;
            class75.field1404[191] = 73;
            class75.field1404[192] = 58;
            class75.field1404[219] = 42;
            class75.field1404[220] = 74;
            class75.field1404[221] = 43;
            class75.field1404[222] = 59;
            class75.field1404[223] = 28;
        }
        class75.method765(Statics.field775);
        class77.method226(Statics.field775);
        class78 var1;
        try {
            var1 = new class78();
        } catch (Throwable var3) {
            var1 = null;
        }
        Statics.field323 = var1;
        if (Statics.field323 != null) {
            Statics.field323.method1370(Statics.field775);
        }
        Statics.field1004 = new class71(255, class82.field1470, class82.field1471, 500000);
        Statics.field1002 = Statics.method389();
        if (field495 != 0) {
            field510 = true;
        }
    }

    @ObfuscatedName("client.i(B)V")
    public final void method269() {
        field652++;
        this.method272();
        while (true) {
            class177 var1 = class157.field2578;
            class156 var2;
            synchronized (class157.field2578) {
                var2 = (class156) class157.field2577.method3320();
            }
            if (var2 == null) {
                Statics.method142();
                method1433();
                class75 var4 = class75.field1387;
                synchronized (class75.field1387) {
                    class75.field1403++;
                    class75.field1400 = class75.field1402;
                    class75.field1380 = 0;
                    if (class75.field1395 >= 0) {
                        while (class75.field1395 != class75.field1381) {
                            int var6 = class75.field1378[class75.field1381];
                            class75.field1381 = class75.field1381 + 1 & 0x7F;
                            if (var6 < 0) {
                                class75.field1386[~var6] = false;
                            } else {
                                if (!class75.field1386[var6] && class75.field1380 < class75.field1382.length - 1) {
                                    class75.field1382[++class75.field1380 - 1] = var6;
                                }
                                class75.field1386[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class75.field1386[var5] = false;
                        }
                        class75.field1395 = class75.field1381;
                    }
                    class75.field1402 = class75.field1401;
                }
                class77 var8 = class77.field1416;
                synchronized (class77.field1416) {
                    class77.field1420 = class77.field1417;
                    class77.field1419 = class77.field1418;
                    class77.field1422 = class77.field1415;
                    class77.field1439 = class77.field1423;
                    class77.field1428 = class77.field1424;
                    class77.field1429 = class77.field1434;
                    class77.field1430 = class77.field1426;
                    class77.field1423 = 0;
                }
                if (Statics.field323 != null) {
                    int var10 = Statics.field323.method1369();
                    field692 = var10;
                }
                if (field699 == 0) {
                    method1579();
                    Statics.field385.method1366();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field1347[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field1355[var12] = 0L;
                    }
                    Statics.field824 = 0;
                } else if (field699 == 5) {
                    class21.method929(this);
                    method1579();
                    Statics.field385.method1366();
                    for (int var13 = 0; var13 < 32; var13++) {
                        field1347[var13] = 0L;
                    }
                    for (int var14 = 0; var14 < 32; var14++) {
                        field1355[var14] = 0L;
                    }
                    Statics.field824 = 0;
                } else if (field699 == 10) {
                    class21.method929(this);
                } else if (field699 == 20) {
                    class21.method929(this);
                    method153();
                } else if (field699 == 25) {
                    method702();
                }
                if (field699 == 30) {
                    if (field511 > 1) {
                        field511--;
                    }
                    if (field541 > 0) {
                        field541--;
                    }
                    if (field618) {
                        field618 = false;
                        if (field541 > 0) {
                            method127();
                        } else {
                            method2341(40);
                            Statics.field2052 = Statics.field1440;
                            Statics.field1440 = null;
                        }
                    } else {
                        for (int var15 = 0; var15 < 100; var15++) {
                            boolean var16;
                            if (Statics.field1440 == null) {
                                var16 = false;
                            } else {
                                label3054: {
                                    try {
                                        int var17 = Statics.field1440.method1395();
                                        if (var17 == 0) {
                                            var16 = false;
                                            break label3054;
                                        }
                                        if (field538 == -1) {
                                            Statics.field1440.method1396(field536.field2061, 0, 1);
                                            field536.field2059 = 0;
                                            field538 = field536.method2330();
                                            field537 = class165.field2777[field538];
                                            var17--;
                                        }
                                        if (field537 == -1) {
                                            if (var17 <= 0) {
                                                var16 = false;
                                                break label3054;
                                            }
                                            Statics.field1440.method1396(field536.field2061, 0, 1);
                                            field537 = field536.field2061[0] & 0xFF;
                                            var17--;
                                        }
                                        if (field537 == -2) {
                                            if (var17 <= 1) {
                                                var16 = false;
                                                break label3054;
                                            }
                                            Statics.field1440.method1396(field536.field2061, 0, 2);
                                            field536.field2059 = 0;
                                            field537 = field536.method2440();
                                            var17 -= 2;
                                        }
                                        if (var17 < field537) {
                                            var16 = false;
                                            break label3054;
                                        }
                                        field536.field2059 = 0;
                                        Statics.field1440.method1396(field536.field2061, 0, field537);
                                        field563 = 0;
                                        field544 = field543;
                                        field543 = field542;
                                        field542 = field538;
                                        if (field538 == 63) {
                                            int var18 = field536.method2438();
                                            int var19 = field536.method2621();
                                            int var20 = field536.method2621();
                                            Statics.field402 = var18 >> 1;
                                            Statics.field1431.method249(var19, var20, (var18 & 0x1) == 1);
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 90) {
                                            field713 = field536.method2438();
                                            field714 = field536.method2438();
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 124) {
                                            method141();
                                            field662 = field536.method2441();
                                            field689 = field679;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 137) {
                                            method2();
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 2) {
                                            field728 = 0;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 29) {
                                            field700 = field536.method2438();
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 217) {
                                            int var21 = field536.method2479();
                                            boolean var22 = field536.method2462() == 1;
                                            class158 var23 = class158.method44(var21);
                                            if (var23.field2604 != var22) {
                                                var23.field2604 = var22;
                                                method2840(var23);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 199) {
                                            field742 = false;
                                            for (int var24 = 0; var24 < 5; var24++) {
                                                field641[var24] = false;
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 76) {
                                            field536.field2059 += 28;
                                            if (field536.method2458()) {
                                                class116 var25 = field536;
                                                int var26 = field536.field2059 - 28;
                                                if (class82.field1476 != null) {
                                                    try {
                                                        class82.field1476.method591(0L);
                                                        class82.field1476.method596(var25.field2061, var26, 24);
                                                    } catch (Exception var401) {
                                                    }
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 190) {
                                            for (int var28 = 0; var28 < field616.length; var28++) {
                                                if (field616[var28] != null) {
                                                    field616[var28].field459 = -1;
                                                }
                                            }
                                            for (int var29 = 0; var29 < field530.length; var29++) {
                                                if (field530[var29] != null) {
                                                    field530[var29].field459 = -1;
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 225) {
                                            int var30 = field536.method2448();
                                            int var31 = field536.method2440();
                                            if (var30 < -70000) {
                                                var31 += 32768;
                                            }
                                            class158 var32;
                                            if (var30 >= 0) {
                                                var32 = class158.method44(var30);
                                            } else {
                                                var32 = null;
                                            }
                                            if (var32 != null) {
                                                for (int var33 = 0; var33 < var32.field2585.length; var33++) {
                                                    var32.field2585[var33] = 0;
                                                    var32.field2689[var33] = 0;
                                                }
                                            }
                                            class19 var34 = (class19) class19.field302.method3301((long) var31);
                                            if (var34 != null) {
                                                for (int var35 = 0; var35 < var34.field297.length; var35++) {
                                                    var34.field297[var35] = -1;
                                                    var34.field294[var35] = 0;
                                                }
                                            }
                                            int var36 = field536.method2440();
                                            for (int var37 = 0; var37 < var36; var37++) {
                                                int var38 = field536.method2463();
                                                if (var38 == 255) {
                                                    var38 = field536.method2448();
                                                }
                                                int var39 = field536.method2494();
                                                if (var32 != null && var37 < var32.field2585.length) {
                                                    var32.field2585[var37] = var39;
                                                    var32.field2689[var37] = var38;
                                                }
                                                class19.method34(var31, var37, var39 - 1, var38);
                                            }
                                            if (var32 != null) {
                                                method2840(var32);
                                            }
                                            method141();
                                            field531[++field653 - 1 & 0x1F] = var31 & 0x7FFF;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 251) {
                                            int var40 = field536.method2621();
                                            String var41 = field536.method2627();
                                            int var42 = field536.method2621();
                                            if (var40 >= 1 && var40 <= 8) {
                                                if (var41.equalsIgnoreCase("null")) {
                                                    var41 = null;
                                                }
                                                field627[var40 - 1] = var41;
                                                field628[var40 - 1] = var42 == 0;
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 4) {
                                            method230(false);
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 158) {
                                            field748 = field679;
                                            if (field537 == 0) {
                                                field499 = null;
                                                field588 = null;
                                                Statics.field1075 = 0;
                                                Statics.field2066 = null;
                                                field538 = -1;
                                                var16 = true;
                                                break label3054;
                                            }
                                            field588 = field536.method2627();
                                            long var43 = field536.method2561();
                                            field499 = class146.method2040(var43);
                                            Statics.field1995 = field536.method2629();
                                            int var45 = field536.method2438();
                                            if (var45 == 255) {
                                                field538 = -1;
                                                var16 = true;
                                                break label3054;
                                            }
                                            Statics.field1075 = var45;
                                            class8[] var46 = new class8[100];
                                            for (int var47 = 0; var47 < Statics.field1075; var47++) {
                                                var46[var47] = new class8();
                                                var46[var47].field126 = field536.method2627();
                                                var46[var47].field125 = class148.method1252(var46[var47].field126, Statics.field533);
                                                var46[var47].field127 = field536.method2440();
                                                var46[var47].field133 = field536.method2629();
                                                field536.method2627();
                                                if (var46[var47].field126.equals(Statics.field1431.field51)) {
                                                    Statics.field193 = var46[var47].field133;
                                                }
                                            }
                                            boolean var48 = false;
                                            int var49 = Statics.field1075;
                                            while (var49 > 0) {
                                                boolean var50 = true;
                                                var49--;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    if (var46[var51].field125.compareTo(var46[var51 + 1].field125) > 0) {
                                                        class8 var52 = var46[var51];
                                                        var46[var51] = var46[var51 + 1];
                                                        var46[var51 + 1] = var52;
                                                        var50 = false;
                                                    }
                                                }
                                                if (var50) {
                                                    break;
                                                }
                                            }
                                            Statics.field2066 = var46;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 6) {
                                            int var53 = field536.method2469();
                                            int var54 = field536.method2478();
                                            class158 var55 = class158.method44(var54);
                                            if (var55.field2624 != 1 || var55.field2596 != var53) {
                                                var55.field2624 = 1;
                                                var55.field2596 = var53;
                                                method2840(var55);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 149) {
                                            method141();
                                            field661 = field536.method2438();
                                            field689 = field679;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 23) {
                                            int var56 = field536.method2448();
                                            int var57 = field536.method2440();
                                            int var58 = field536.method2440();
                                            class158 var59 = class158.method44(var56);
                                            var59.field2636 = (var58 << 16) + var57;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 192) {
                                            int var60 = field536.method2439();
                                            class158 var61 = class158.method44(var60);
                                            for (int var62 = 0; var62 < var61.field2585.length; var62++) {
                                                var61.field2585[var62] = -1;
                                                var61.field2585[var62] = 0;
                                            }
                                            method2840(var61);
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 75) {
                                            int var63 = field537 + field536.field2059;
                                            int var64 = field536.method2440();
                                            int var65 = field536.method2440();
                                            if (field656 != var64) {
                                                field656 = var64;
                                                int var66 = field656;
                                                if (class158.method2694(var66)) {
                                                    class158[] var67 = Statics.field2708[var66];
                                                    for (int var68 = 0; var68 < var67.length; var68++) {
                                                        class158 var69 = var67[var68];
                                                        if (var69 != null) {
                                                            var69.field2698 = 0;
                                                            var69.field2699 = 0;
                                                        }
                                                    }
                                                }
                                                class26.method159(field656);
                                                for (int var70 = 0; var70 < 100; var70++) {
                                                    field685[var70] = true;
                                                }
                                            }
                                            while (var65-- > 0) {
                                                int var71 = field536.method2448();
                                                int var72 = field536.method2440();
                                                int var73 = field536.method2438();
                                                class4 var74 = (class4) field719.method3301((long) var71);
                                                if (var74 != null && var74.field68 != var72) {
                                                    method52(var74, true);
                                                    var74 = null;
                                                }
                                                if (var74 == null) {
                                                    class4 var75 = new class4();
                                                    var75.field68 = var72;
                                                    var75.field64 = var73;
                                                    field719.method3302(var75, (long) var71);
                                                    if (class158.method2694(var72)) {
                                                        class158[] var76 = Statics.field2708[var72];
                                                        for (int var77 = 0; var77 < var76.length; var77++) {
                                                            class158 var78 = var76[var77];
                                                            if (var78 != null) {
                                                                var78.field2698 = 0;
                                                                var78.field2699 = 0;
                                                            }
                                                        }
                                                    }
                                                    class26.method159(var72);
                                                    class158 var79 = class158.method44(var71);
                                                    if (var79 != null) {
                                                        method2840(var79);
                                                    }
                                                    if (field660 != null) {
                                                        method2840(field660);
                                                        field660 = null;
                                                    }
                                                    field622 = false;
                                                    field520 = 0;
                                                    method234(Statics.field842, Statics.field1785, Statics.field12, Statics.field288);
                                                    if (field656 != -1) {
                                                        method605(field656, 1);
                                                    }
                                                    var74 = var75;
                                                }
                                                var74.field65 = true;
                                            }
                                            for (class4 var81 = (class4) field719.method3310(); var81 != null; var81 = (class4) field719.method3305()) {
                                                if (var81.field65) {
                                                    var81.field65 = false;
                                                } else {
                                                    method52(var81, true);
                                                }
                                            }
                                            field571 = new class175(512);
                                            while (field536.field2059 < var63) {
                                                int var82 = field536.method2448();
                                                int var83 = field536.method2440();
                                                int var84 = field536.method2440();
                                                int var85 = field536.method2448();
                                                for (int var86 = var83; var86 <= var84; var86++) {
                                                    long var87 = ((long) var82 << 32) + (long) var86;
                                                    field571.method3302(new class171(var85), var87);
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 139) {
                                            Statics.method809();
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 242) {
                                            int var89 = field536.method2448();
                                            int var90 = field536.method2469();
                                            if (var90 == 65535) {
                                                var90 = -1;
                                            }
                                            int var91 = field536.method2439();
                                            class158 var92 = class158.method44(var91);
                                            if (var92.field2660) {
                                                var92.field2696 = var90;
                                                var92.field2697 = var89;
                                                class40 var94 = class40.method119(var90);
                                                var92.field2632 = var94.field1019;
                                                var92.field2633 = var94.field1020;
                                                var92.field2634 = var94.field1021;
                                                var92.field2652 = var94.field1022;
                                                var92.field2695 = var94.field1035;
                                                var92.field2655 = var94.field1040;
                                                if (var92.field2601 > 0) {
                                                    var92.field2655 = var92.field2655 * 32 / var92.field2601;
                                                }
                                                method2840(var92);
                                            } else {
                                                if (var90 == -1) {
                                                    var92.field2624 = 0;
                                                    field538 = -1;
                                                    var16 = true;
                                                    break label3054;
                                                }
                                                class40 var93 = class40.method119(var90);
                                                var92.field2624 = 4;
                                                var92.field2596 = var90;
                                                var92.field2632 = var93.field1019;
                                                var92.field2633 = var93.field1020;
                                                var92.field2655 = var93.field1040 * 100 / var89;
                                                method2840(var92);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 159) {
                                            int var95 = field536.method2462();
                                            int var96 = field536.method2478();
                                            int var97 = field536.method2469();
                                            class4 var98 = (class4) field719.method3301((long) var96);
                                            if (var98 != null) {
                                                method52(var98, var98.field68 != var97);
                                            }
                                            class4 var99 = new class4();
                                            var99.field68 = var97;
                                            var99.field64 = var95;
                                            field719.method3302(var99, (long) var96);
                                            method136(var97);
                                            class26.method159(var97);
                                            class158 var100 = class158.method44(var96);
                                            if (var100 != null) {
                                                method2840(var100);
                                            }
                                            if (field660 != null) {
                                                method2840(field660);
                                                field660 = null;
                                            }
                                            field622 = false;
                                            field520 = 0;
                                            method234(Statics.field842, Statics.field1785, Statics.field12, Statics.field288);
                                            if (field656 != -1) {
                                                method605(field656, 1);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 167) {
                                            int var101 = field536.method2478();
                                            Statics.field1 = Statics.field1405.method1507(var101);
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 245) {
                                            while (field536.field2059 < field537) {
                                                boolean var102 = field536.method2438() == 1;
                                                String var103 = field536.method2627();
                                                String var104 = field536.method2627();
                                                int var105 = field536.method2440();
                                                int var106 = field536.method2438();
                                                int var107 = field536.method2438();
                                                boolean var108 = (var107 & 0x2) != 0;
                                                boolean var109 = (var107 & 0x1) != 0;
                                                if (var105 > 0) {
                                                    field536.method2627();
                                                    field536.method2438();
                                                    field536.method2448();
                                                }
                                                field536.method2627();
                                                for (int var110 = 0; var110 < field500; var110++) {
                                                    class23 var111 = field750[var110];
                                                    if (var102) {
                                                        if (var104.equals(var111.field381)) {
                                                            var111.field381 = var103;
                                                            var111.field379 = var104;
                                                            var103 = null;
                                                            break;
                                                        }
                                                    } else if (var103.equals(var111.field381)) {
                                                        if (var111.field380 != var105) {
                                                            boolean var112 = true;
                                                            for (class28 var113 = (class28) field751.method3290(); var113 != null; var113 = (class28) field751.method3291()) {
                                                                if (var113.field760.equals(var103)) {
                                                                    if (var105 != 0 && var113.field759 == 0) {
                                                                        var113.method3356();
                                                                        var112 = false;
                                                                    } else if (var105 == 0 && var113.field759 != 0) {
                                                                        var113.method3356();
                                                                        var112 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var112) {
                                                                field751.method3295(new class28(var103, var105));
                                                            }
                                                            var111.field380 = var105;
                                                        }
                                                        var111.field379 = var104;
                                                        var111.field391 = var106;
                                                        var111.field382 = var108;
                                                        var111.field383 = var109;
                                                        var103 = null;
                                                        break;
                                                    }
                                                }
                                                if (var103 != null && field500 < 200) {
                                                    class23 var114 = new class23();
                                                    field750[field500] = var114;
                                                    var114.field381 = var103;
                                                    var114.field379 = var104;
                                                    var114.field380 = var105;
                                                    var114.field391 = var106;
                                                    var114.field382 = var108;
                                                    var114.field383 = var109;
                                                    field500++;
                                                }
                                            }
                                            field620 = 2;
                                            field687 = field679;
                                            boolean var115 = false;
                                            int var116 = field500;
                                            while (var116 > 0) {
                                                boolean var117 = true;
                                                var116--;
                                                for (int var118 = 0; var118 < var116; var118++) {
                                                    boolean var119 = false;
                                                    class23 var120 = field750[var118];
                                                    class23 var121 = field750[var118 + 1];
                                                    if (field494 != var120.field380 && field494 == var121.field380) {
                                                        var119 = true;
                                                    }
                                                    if (!var119 && var120.field380 == 0 && var121.field380 != 0) {
                                                        var119 = true;
                                                    }
                                                    if (!var119 && !var120.field382 && var121.field382) {
                                                        var119 = true;
                                                    }
                                                    if (!var119 && !var120.field383 && var121.field383) {
                                                        var119 = true;
                                                    }
                                                    if (var119) {
                                                        class23 var122 = field750[var118];
                                                        field750[var118] = field750[var118 + 1];
                                                        field750[var118 + 1] = var122;
                                                        var117 = false;
                                                    }
                                                }
                                                if (var117) {
                                                    break;
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 232) {
                                            int var123 = field536.method2494();
                                            field656 = var123;
                                            method136(var123);
                                            class26.method159(field656);
                                            for (int var124 = 0; var124 < 100; var124++) {
                                                field685[var124] = true;
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 119) {
                                            class182.method1255(field536, field537);
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 56) {
                                            int var125 = field536.method2439();
                                            int var126 = field536.method2494();
                                            class158 var127 = class158.method44(var125);
                                            if (var127 != null && var127.field2612 == 0) {
                                                if (var126 > var127.field2588 - var127.field2650) {
                                                    var126 = var127.field2588 - var127.field2650;
                                                }
                                                if (var126 < 0) {
                                                    var126 = 0;
                                                }
                                                if (var127.field2587 != var126) {
                                                    var127.field2587 = var126;
                                                    method2840(var127);
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 218) {
                                            while (field536.field2059 < field537) {
                                                int var128 = field536.method2438();
                                                boolean var129 = (var128 & 0x1) == 1;
                                                String var130 = field536.method2627();
                                                String var131 = field536.method2627();
                                                field536.method2627();
                                                for (int var132 = 0; var132 < field752; var132++) {
                                                    class11 var133 = field657[var132];
                                                    if (var129) {
                                                        if (var131.equals(var133.field196)) {
                                                            var133.field196 = var130;
                                                            var133.field198 = var131;
                                                            var130 = null;
                                                            break;
                                                        }
                                                    } else if (var130.equals(var133.field196)) {
                                                        var133.field196 = var130;
                                                        var133.field198 = var131;
                                                        var130 = null;
                                                        break;
                                                    }
                                                }
                                                if (var130 != null && field752 < 100) {
                                                    class11 var134 = new class11();
                                                    field657[field752] = var134;
                                                    var134.field196 = var130;
                                                    var134.field198 = var131;
                                                    field752++;
                                                }
                                            }
                                            field687 = field679;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 144) {
                                            String var135 = field536.method2627();
                                            String var136 = class185.method3392(class147.method121(class184.method1(field536)));
                                            method1680(6, var135, var136);
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 221) {
                                            int var137 = field536.method2441();
                                            int var138 = field536.method2478();
                                            class158 var139 = class158.method44(var138);
                                            if (var139.field2628 != var137 || var137 == -1) {
                                                var139.field2628 = var137;
                                                var139.field2698 = 0;
                                                var139.field2699 = 0;
                                                method2840(var139);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 205) {
                                            int var140 = field536.method2469();
                                            byte var141 = field536.method2464();
                                            class159.field2711[var140] = var141;
                                            if (class159.field2713[var140] != var141) {
                                                class159.field2713[var140] = var141;
                                                method133(var140);
                                            }
                                            field680[++field617 - 1 & 0x1F] = var140;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 62) {
                                            int var142 = field536.method2440();
                                            if (var142 == 65535) {
                                                var142 = -1;
                                            }
                                            if (var142 == -1 && !field733) {
                                                class138.method2686();
                                            } else if (var142 != -1 && field688 != var142 && field731 != 0 && !field733) {
                                                class154 var143 = Statics.field758;
                                                int var144 = field731;
                                                class138.field2360 = 1;
                                                Statics.field1469 = var143;
                                                Statics.field2362 = var142;
                                                Statics.field2361 = 0;
                                                Statics.field286 = var144;
                                                Statics.field427 = false;
                                                Statics.field2359 = 2;
                                            }
                                            field688 = var142;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 45) {
                                            int var145 = field536.method2440();
                                            if (var145 == 65535) {
                                                var145 = -1;
                                            }
                                            int var146 = field536.method2442();
                                            if (field731 != 0 && var145 != -1) {
                                                class138.method2688(Statics.field1376, var145, 0, field731, false);
                                                field733 = true;
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 17) {
                                            Statics.field1217 = field536.method2462();
                                            Statics.field414 = field536.method2463();
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 220) {
                                            String var147 = field536.method2627();
                                            Object[] var148 = new Object[var147.length() + 1];
                                            for (int var149 = var147.length() - 1; var149 >= 0; var149--) {
                                                if (var147.charAt(var149) == 's') {
                                                    var148[var149 + 1] = field536.method2627();
                                                } else {
                                                    var148[var149 + 1] = Integer.valueOf(field536.method2448());
                                                }
                                            }
                                            var148[0] = Integer.valueOf(field536.method2448());
                                            class1 var150 = new class1();
                                            var150.field18 = var148;
                                            class26.method227(var150);
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 184) {
                                            int var151 = field536.method2494();
                                            class19 var152 = (class19) class19.field302.method3301((long) var151);
                                            if (var152 != null) {
                                                var152.method3361();
                                            }
                                            field531[++field653 - 1 & 0x1F] = var151 & 0x7FFF;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 185) {
                                            int var153 = field536.method2448();
                                            int var154 = field536.method2440();
                                            if (var153 < -70000) {
                                                var154 += 32768;
                                            }
                                            class158 var155;
                                            if (var153 >= 0) {
                                                var155 = class158.method44(var153);
                                            } else {
                                                var155 = null;
                                            }
                                            while (field536.field2059 < field537) {
                                                int var156 = field536.method2423();
                                                int var157 = field536.method2440();
                                                int var158 = 0;
                                                if (var157 != 0) {
                                                    var158 = field536.method2438();
                                                    if (var158 == 255) {
                                                        var158 = field536.method2448();
                                                    }
                                                }
                                                if (var155 != null && var156 >= 0 && var156 < var155.field2585.length) {
                                                    var155.field2585[var156] = var157;
                                                    var155.field2689[var156] = var158;
                                                }
                                                class19.method34(var154, var156, var157 - 1, var158);
                                            }
                                            if (var155 != null) {
                                                method2840(var155);
                                            }
                                            method141();
                                            field531[++field653 - 1 & 0x1F] = var154 & 0x7FFF;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 132) {
                                            String var159 = field536.method2627();
                                            long var160 = field536.method2561();
                                            long var162 = (long) field536.method2440();
                                            long var164 = (long) field536.method2442();
                                            int var166 = field536.method2438();
                                            long var167 = (var162 << 32) + var164;
                                            boolean var169 = false;
                                            for (int var170 = 0; var170 < 100; var170++) {
                                                if (field682[var170] == var167) {
                                                    var169 = true;
                                                    break;
                                                }
                                            }
                                            if (var166 <= 1 && method110(var159)) {
                                                var169 = true;
                                            }
                                            if (!var169 && field696 == 0) {
                                                field682[field504] = var167;
                                                field504 = (field504 + 1) % 100;
                                                String var171 = class185.method3392(class147.method121(class184.method1(field536)));
                                                if (var166 == 2 || var166 == 3) {
                                                    method2048(9, class2.method1566(1) + var159, var171, Statics.method2577(var160));
                                                } else if (var166 == 1) {
                                                    method2048(9, class2.method1566(0) + var159, var171, Statics.method2577(var160));
                                                } else {
                                                    method2048(9, var159, var171, Statics.method2577(var160));
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 206) {
                                            method141();
                                            int var172 = field536.method2478();
                                            int var173 = field536.method2438();
                                            int var174 = field536.method2621();
                                            field636[var174] = var172;
                                            field634[var174] = var173;
                                            field635[var174] = 1;
                                            for (int var175 = 0; var175 < 98; var175++) {
                                                if (var172 >= class130.field2063[var175]) {
                                                    field635[var174] = var175 + 2;
                                                }
                                            }
                                            field589[++field553 - 1 & 0x1F] = var174;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 154) {
                                            int var176 = field536.method2478();
                                            class158 var177 = class158.method44(var176);
                                            var177.field2624 = 3;
                                            var177.field2596 = Statics.field1431.field37.method3193();
                                            method2840(var177);
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 146) {
                                            field742 = true;
                                            Statics.field764 = field536.method2438();
                                            Statics.field67 = field536.method2438();
                                            Statics.field211 = field536.method2440();
                                            Statics.field194 = field536.method2438();
                                            Statics.field86 = field536.method2438();
                                            if (Statics.field86 >= 100) {
                                                int var178 = Statics.field764 * 128 + 64;
                                                int var179 = Statics.field67 * 128 + 64;
                                                int var180 = method33(var178, var179, Statics.field402) - Statics.field211;
                                                int var181 = var178 - Statics.field2723;
                                                int var182 = var180 - Statics.field708;
                                                int var183 = var179 - Statics.field1330;
                                                int var184 = (int) Math.sqrt((double) (var181 * var181 + var183 * var183));
                                                Statics.field1700 = (int) (Math.atan2((double) var182, (double) var184) * 325.949D) & 0x7FF;
                                                Statics.field276 = (int) (Math.atan2((double) var181, (double) var183) * -325.949D) & 0x7FF;
                                                if (Statics.field1700 < 128) {
                                                    Statics.field1700 = 128;
                                                }
                                                if (Statics.field1700 > 383) {
                                                    Statics.field1700 = 383;
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 233) {
                                            int var185 = field536.method2439();
                                            int var186 = field536.method2521();
                                            class159.field2711[var186] = var185;
                                            if (class159.field2713[var186] != var185) {
                                                class159.field2713[var186] = var185;
                                                method133(var186);
                                            }
                                            field680[++field617 - 1 & 0x1F] = var186;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 94) {
                                            if (field656 != -1) {
                                                int var187 = field656;
                                                if (class158.method2694(var187)) {
                                                    method1249(Statics.field2708[var187], 0);
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 54) {
                                            method230(true);
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 222) {
                                            for (int var188 = 0; var188 < class159.field2713.length; var188++) {
                                                if (class159.field2713[var188] != class159.field2711[var188]) {
                                                    class159.field2713[var188] = class159.field2711[var188];
                                                    method133(var188);
                                                    field680[++field617 - 1 & 0x1F] = var188;
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 21) {
                                            int var189 = field536.method2479();
                                            int var190 = field536.method2472();
                                            int var191 = field536.method2473();
                                            class158 var192 = class158.method44(var189);
                                            int var193 = var192.field2599 + var190;
                                            int var194 = var192.field2600 + var191;
                                            if (var192.field2597 != var193 || var192.field2598 != var194) {
                                                var192.field2597 = var193;
                                                var192.field2598 = var194;
                                                method2840(var192);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 40) {
                                            String var195 = field536.method2627();
                                            if (var195.endsWith(":tradereq:")) {
                                                String var196 = var195.substring(0, var195.indexOf(":"));
                                                boolean var197 = false;
                                                if (method110(var196)) {
                                                    var197 = true;
                                                }
                                                if (!var197 && field696 == 0) {
                                                    method1680(4, var196, class134.field2234);
                                                }
                                            } else if (var195.endsWith(":duelreq:")) {
                                                String var198 = var195.substring(0, var195.indexOf(":"));
                                                boolean var199 = false;
                                                if (method110(var198)) {
                                                    var199 = true;
                                                }
                                                if (!var199 && field696 == 0) {
                                                    method1680(8, var198, class134.field2235);
                                                }
                                            } else if (var195.endsWith(":chalreq:")) {
                                                String var200 = var195.substring(0, var195.indexOf(":"));
                                                boolean var201 = false;
                                                if (method110(var200)) {
                                                    var201 = true;
                                                }
                                                if (!var201 && field696 == 0) {
                                                    String var202 = var195.substring(var195.indexOf(":") + 1, var195.length() - 9);
                                                    method1680(8, var200, var202);
                                                }
                                            } else if (var195.endsWith(":assistreq:")) {
                                                String var203 = var195.substring(0, var195.indexOf(":"));
                                                boolean var204 = false;
                                                if (method110(var203)) {
                                                    var204 = true;
                                                }
                                                if (!var204 && field696 == 0) {
                                                    method1680(10, var203, "");
                                                }
                                            } else if (var195.endsWith(":clan:")) {
                                                String var205 = var195.substring(0, var195.indexOf(":clan:"));
                                                method1680(11, "", var205);
                                            } else if (var195.endsWith(":trade:")) {
                                                String var206 = var195.substring(0, var195.indexOf(":trade:"));
                                                if (field696 == 0) {
                                                    method1680(12, "", var206);
                                                }
                                            } else if (var195.endsWith(":assist:")) {
                                                String var207 = var195.substring(0, var195.indexOf(":assist:"));
                                                if (field696 == 0) {
                                                    method1680(13, "", var207);
                                                }
                                            } else {
                                                method1680(0, "", var195);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 50) {
                                            field497 = field536.method2438();
                                            if (field497 == 1) {
                                                field647 = field536.method2440();
                                            }
                                            if (field497 >= 2 && field497 <= 6) {
                                                if (field497 == 2) {
                                                    field518 = 64;
                                                    field519 = 64;
                                                }
                                                if (field497 == 3) {
                                                    field518 = 0;
                                                    field519 = 64;
                                                }
                                                if (field497 == 4) {
                                                    field518 = 128;
                                                    field519 = 64;
                                                }
                                                if (field497 == 5) {
                                                    field518 = 64;
                                                    field519 = 0;
                                                }
                                                if (field497 == 6) {
                                                    field518 = 64;
                                                    field519 = 128;
                                                }
                                                field497 = 2;
                                                field709 = field536.method2440();
                                                field516 = field536.method2440();
                                                field517 = field536.method2438();
                                            }
                                            if (field497 == 10) {
                                                field514 = field536.method2440();
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 253) {
                                            Statics.field250 = class137.method842(field536.method2438());
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 77) {
                                            int var208 = field536.method2448();
                                            int var209 = field536.method2440();
                                            int var210 = var209 >> 10 & 0x1F;
                                            int var211 = var209 >> 5 & 0x1F;
                                            int var212 = var209 & 0x1F;
                                            int var213 = (var212 << 3) + (var210 << 19) + (var211 << 11);
                                            class158 var214 = class158.method44(var208);
                                            if (var214.field2609 != var213) {
                                                var214.field2609 = var213;
                                                method2840(var214);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 125) {
                                            Statics.field1217 = field536.method2463();
                                            Statics.field414 = field536.method2621();
                                            while (field536.field2059 < field537) {
                                                field538 = field536.method2438();
                                                method223();
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 120) {
                                            String var215 = field536.method2627();
                                            int var216 = field536.method2440();
                                            byte var217 = field536.method2629();
                                            boolean var218 = false;
                                            if (var217 == -128) {
                                                var218 = true;
                                            }
                                            if (var218) {
                                                if (Statics.field1075 == 0) {
                                                    field538 = -1;
                                                    var16 = true;
                                                    break label3054;
                                                }
                                                boolean var219 = false;
                                                int var220;
                                                for (var220 = 0; var220 < Statics.field1075 && (!Statics.field2066[var220].field126.equals(var215) || Statics.field2066[var220].field127 != var216); var220++) {
                                                }
                                                if (var220 < Statics.field1075) {
                                                    while (var220 < Statics.field1075 - 1) {
                                                        Statics.field2066[var220] = Statics.field2066[var220 + 1];
                                                        var220++;
                                                    }
                                                    Statics.field1075--;
                                                    Statics.field2066[Statics.field1075] = null;
                                                }
                                            } else {
                                                field536.method2627();
                                                class8 var221 = new class8();
                                                var221.field126 = var215;
                                                var221.field125 = class148.method1252(var221.field126, Statics.field533);
                                                var221.field127 = var216;
                                                var221.field133 = var217;
                                                int var222;
                                                for (var222 = Statics.field1075 - 1; var222 >= 0; var222--) {
                                                    int var223 = Statics.field2066[var222].field125.compareTo(var221.field126);
                                                    if (var223 == 0) {
                                                        Statics.field2066[var222].field127 = var216;
                                                        Statics.field2066[var222].field133 = var217;
                                                        if (var215.equals(Statics.field1431.field51)) {
                                                            Statics.field193 = var217;
                                                        }
                                                        field748 = field679;
                                                        field538 = -1;
                                                        var16 = true;
                                                        break label3054;
                                                    }
                                                    if (var223 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field1075 >= Statics.field2066.length) {
                                                    field538 = -1;
                                                    var16 = true;
                                                    break label3054;
                                                }
                                                for (int var224 = Statics.field1075 - 1; var224 > var222; var224--) {
                                                    Statics.field2066[var224 + 1] = Statics.field2066[var224];
                                                }
                                                if (Statics.field1075 == 0) {
                                                    Statics.field2066 = new class8[100];
                                                }
                                                Statics.field2066[var222 + 1] = var221;
                                                Statics.field1075++;
                                                if (var215.equals(Statics.field1431.field51)) {
                                                    Statics.field193 = var217;
                                                }
                                            }
                                            field748 = field679;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 92) {
                                            int var225 = field536.method2440();
                                            int var226 = field536.method2438();
                                            int var227 = field536.method2440();
                                            method144(var225, var226, var227);
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 57) {
                                            int var228 = field536.method2448();
                                            int var229 = field536.method2494();
                                            class158 var230 = class158.method44(var228);
                                            if (var230.field2624 != 2 || var230.field2596 != var229) {
                                                var230.field2624 = 2;
                                                var230.field2596 = var229;
                                                method2840(var230);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 141) {
                                            Statics.field1217 = field536.method2438();
                                            Statics.field414 = field536.method2621();
                                            for (int var231 = Statics.field414; var231 < Statics.field414 + 8; var231++) {
                                                for (int var232 = Statics.field1217; var232 < Statics.field1217 + 8; var232++) {
                                                    if (field630[Statics.field402][var231][var232] != null) {
                                                        field630[Statics.field402][var231][var232] = null;
                                                        method2690(var231, var232);
                                                    }
                                                }
                                            }
                                            for (class22 var233 = (class22) field631.method3345(); var233 != null; var233 = (class22) field631.method3324()) {
                                                if (var233.field357 >= Statics.field414 && var233.field357 < Statics.field414 + 8 && var233.field360 >= Statics.field1217 && var233.field360 < Statics.field1217 + 8 && Statics.field402 == var233.field369) {
                                                    var233.field368 = 0;
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 200) {
                                            int var234 = field536.method2438();
                                            int var235 = field536.method2438();
                                            int var236 = field536.method2438();
                                            int var237 = field536.method2438();
                                            field641[var234] = true;
                                            field744[var234] = var235;
                                            field745[var234] = var236;
                                            field746[var234] = var237;
                                            field747[var234] = 0;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 166) {
                                            int var238 = field536.method2521();
                                            if (var238 == 65535) {
                                                var238 = -1;
                                            }
                                            int var239 = field536.method2494();
                                            if (var239 == 65535) {
                                                var239 = -1;
                                            }
                                            int var240 = field536.method2448();
                                            int var241 = field536.method2478();
                                            for (int var242 = var239; var242 <= var238; var242++) {
                                                long var243 = ((long) var241 << 32) + (long) var242;
                                                class179 var245 = field571.method3301(var243);
                                                if (var245 != null) {
                                                    var245.method3361();
                                                }
                                                field571.method3302(new class171(var240), var243);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 85) {
                                            field742 = true;
                                            Statics.field354 = field536.method2438();
                                            Statics.field390 = field536.method2438();
                                            Statics.field403 = field536.method2440();
                                            Statics.field1485 = field536.method2438();
                                            Statics.field269 = field536.method2438();
                                            if (Statics.field269 >= 100) {
                                                Statics.field2723 = Statics.field354 * 128 + 64;
                                                Statics.field1330 = Statics.field390 * 128 + 64;
                                                Statics.field708 = method33(Statics.field2723, Statics.field1330, Statics.field402) - Statics.field403;
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 140) {
                                            field620 = 1;
                                            field687 = field679;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 87 || field538 == 55 || field538 == 71 || field538 == 98 || field538 == 79 || field538 == 194 || field538 == 238 || field538 == 147 || field538 == 219 || field538 == 82 || field538 == 31) {
                                            method223();
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 189) {
                                            String var246 = field536.method2627();
                                            int var247 = field536.method2478();
                                            class158 var248 = class158.method44(var247);
                                            if (!var246.equals(var248.field2639)) {
                                                var248.field2639 = var246;
                                                method2840(var248);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 122) {
                                            int var249 = field536.method2448();
                                            class4 var250 = (class4) field719.method3301((long) var249);
                                            if (var250 != null) {
                                                method52(var250, true);
                                            }
                                            if (field660 != null) {
                                                method2840(field660);
                                                field660 = null;
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 197) {
                                            int var251 = field536.method2469();
                                            int var252 = field536.method2479();
                                            int var253 = field536.method2521();
                                            int var254 = field536.method2469();
                                            class158 var255 = class158.method44(var252);
                                            if (var255.field2632 != var253 || var255.field2633 != var251 || var255.field2655 != var254) {
                                                var255.field2632 = var253;
                                                var255.field2633 = var251;
                                                var255.field2655 = var254;
                                                method2840(var255);
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 65) {
                                            String var256 = field536.method2627();
                                            long var257 = (long) field536.method2440();
                                            long var259 = (long) field536.method2442();
                                            int var261 = field536.method2438();
                                            long var262 = (var257 << 32) + var259;
                                            boolean var264 = false;
                                            for (int var265 = 0; var265 < 100; var265++) {
                                                if (field682[var265] == var262) {
                                                    var264 = true;
                                                    break;
                                                }
                                            }
                                            if (method110(var256)) {
                                                var264 = true;
                                            }
                                            if (!var264 && field696 == 0) {
                                                field682[field504] = var262;
                                                field504 = (field504 + 1) % 100;
                                                String var266 = class185.method3392(class147.method121(class184.method1(field536)));
                                                if (var261 == 2 || var261 == 3) {
                                                    method1680(7, class2.method1566(1) + var256, var266);
                                                } else if (var261 == 1) {
                                                    method1680(7, class2.method1566(0) + var256, var266);
                                                } else {
                                                    method1680(3, var256, var266);
                                                }
                                            }
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 117) {
                                            method127();
                                            field538 = -1;
                                            var16 = false;
                                            break label3054;
                                        }
                                        if (field538 == 241) {
                                            for (int var267 = 0; var267 < Statics.field1061; var267++) {
                                                class42 var268 = (class42) class42.field1064.method3260((long) var267);
                                                class42 var269;
                                                if (var268 == null) {
                                                    byte[] var270 = Statics.field1062.method2987(16, var267);
                                                    class42 var271 = new class42();
                                                    if (var270 != null) {
                                                        var271.method930(new class127(var270));
                                                    }
                                                    class42.field1064.method3261(var271, (long) var267);
                                                    var269 = var271;
                                                } else {
                                                    var269 = var268;
                                                }
                                                if (var269 != null && var269.field1063 == 0) {
                                                    class159.field2711[var267] = 0;
                                                    class159.field2713[var267] = 0;
                                                }
                                            }
                                            method141();
                                            field617 += 32;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        if (field538 == 106) {
                                            field511 = field536.method2494() * 30;
                                            field689 = field679;
                                            field538 = -1;
                                            var16 = true;
                                            break label3054;
                                        }
                                        class80.method3170("" + field538 + class2.field23 + field543 + class2.field23 + field544 + class2.field23 + field537, (Throwable) null);
                                        method127();
                                    } catch (IOException var406) {
                                        if (field541 > 0) {
                                            method127();
                                        } else {
                                            method2341(40);
                                            Statics.field2052 = Statics.field1440;
                                            Statics.field1440 = null;
                                        }
                                    } catch (Exception var407) {
                                        String var275 = "" + field538 + class2.field23 + field543 + class2.field23 + field544 + class2.field23 + field537 + class2.field23 + (Statics.field272 + Statics.field1431.field482[0]) + class2.field23 + (Statics.field977 + Statics.field1431.field472[0]) + class2.field23;
                                        for (int var276 = 0; var276 < field537 && var276 < 50; var276++) {
                                            var275 = var275 + field536.field2061[var276] + class2.field23;
                                        }
                                        class80.method3170(var275, var407);
                                        method127();
                                    }
                                    var16 = true;
                                }
                            }
                            if (!var16) {
                                break;
                            }
                        }
                        if (field699 == 30) {
                            class182.method3078(field534, 98);
                            Object var277 = Statics.field1246.field261;
                            synchronized (Statics.field1246.field261) {
                                if (!field493) {
                                    Statics.field1246.field265 = 0;
                                } else if (class77.field1439 != 0 || Statics.field1246.field265 >= 40) {
                                    field534.method2317(216);
                                    field534.method2424(0);
                                    int var278 = field534.field2059;
                                    int var279 = 0;
                                    for (int var280 = 0; var280 < Statics.field1246.field265 && field534.field2059 - var278 < 240; var280++) {
                                        var279++;
                                        int var281 = Statics.field1246.field258[var280];
                                        if (var281 < 0) {
                                            var281 = 0;
                                        } else if (var281 > 502) {
                                            var281 = 502;
                                        }
                                        int var282 = Statics.field1246.field260[var280];
                                        if (var282 < 0) {
                                            var282 = 0;
                                        } else if (var282 > 764) {
                                            var282 = 764;
                                        }
                                        int var283 = var281 * 765 + var282;
                                        if (Statics.field1246.field258[var280] == -1 && Statics.field1246.field260[var280] == -1) {
                                            var282 = -1;
                                            var281 = -1;
                                            var283 = 524287;
                                        }
                                        if (field506 != var282 || field546 != var281) {
                                            int var284 = var282 - field506;
                                            field506 = var282;
                                            int var285 = var281 - field546;
                                            field546 = var281;
                                            if (field508 < 8 && var284 >= -32 && var284 <= 31 && var285 >= -32 && var285 <= 31) {
                                                var284 += 32;
                                                var285 += 32;
                                                field534.method2641((field508 << 12) + (var284 << 6) + var285);
                                                field508 = 0;
                                            } else if (field508 < 8) {
                                                field534.method2431((field508 << 19) + 8388608 + var283);
                                                field508 = 0;
                                            } else {
                                                field534.method2633((field508 << 19) + -1073741824 + var283);
                                                field508 = 0;
                                            }
                                        } else if (field508 < 2047) {
                                            field508++;
                                        }
                                    }
                                    field534.method2435(field534.field2059 - var278);
                                    if (var279 >= Statics.field1246.field265) {
                                        Statics.field1246.field265 = 0;
                                    } else {
                                        Statics.field1246.field265 -= var279;
                                        for (int var286 = 0; var286 < Statics.field1246.field265; var286++) {
                                            Statics.field1246.field260[var286] = Statics.field1246.field260[var279 + var286];
                                            Statics.field1246.field258[var286] = Statics.field1246.field258[var279 + var286];
                                        }
                                    }
                                }
                            }
                            if (class77.field1439 != 0) {
                                long var288 = (class77.field1430 - field505 * -1L) / 50L;
                                if (var288 > 4095L) {
                                    var288 = 4095L;
                                }
                                field505 = class77.field1430 * -1L;
                                int var290 = class77.field1429;
                                if (var290 < 0) {
                                    var290 = 0;
                                } else if (var290 > 502) {
                                    var290 = 502;
                                }
                                int var291 = class77.field1428;
                                if (var291 < 0) {
                                    var291 = 0;
                                } else if (var291 > 764) {
                                    var291 = 764;
                                }
                                int var292 = var290 * 765 + var291;
                                byte var293 = 0;
                                if (class77.field1439 == 2) {
                                    var293 = 1;
                                }
                                int var294 = (int) var288;
                                field534.method2317(88);
                                field534.method2633((var293 << 19) + (var294 << 20) + var292);
                            }
                            if (class75.field1380 > 0) {
                                field534.method2317(3);
                                field534.method2641(0);
                                int var295 = field534.field2059;
                                long var296 = class121.method2693();
                                for (int var298 = 0; var298 < class75.field1380; var298++) {
                                    long var299 = var296 - field720;
                                    if (var299 > 16777215L) {
                                        var299 = 16777215L;
                                    }
                                    field720 = var296;
                                    field534.method2531((int) var299);
                                    field534.method2424(class75.field1382[var298]);
                                }
                                field534.method2551(field534.field2059 - var295);
                            }
                            if (field639 > 0) {
                                field639--;
                            }
                            if (class75.field1386[96] || class75.field1386[97] || class75.field1386[98] || class75.field1386[99]) {
                                field587 = true;
                            }
                            if (field587 && field639 <= 0) {
                                field639 = 20;
                                field587 = false;
                                field534.method2317(247);
                                field534.method2466(field583);
                                field534.method2467(field734);
                            }
                            if (Statics.field102 && !field721) {
                                field721 = true;
                                field534.method2317(252);
                                field534.method2424(1);
                            }
                            if (!Statics.field102 && field721) {
                                field721 = false;
                                field534.method2317(252);
                                field534.method2424(0);
                            }
                            if (field584 && Statics.field402 != field502) {
                                method240(Statics.field2365, Statics.field299, Statics.field402, Statics.field1431.field482[0], Statics.field1431.field472[0]);
                            } else if (Statics.field402 != field723) {
                                field723 = Statics.field402;
                                int var301 = Statics.field402;
                                int[] var302 = Statics.field293.field1504;
                                int var303 = var302.length;
                                for (int var304 = 0; var304 < var303; var304++) {
                                    var302[var304] = 0;
                                }
                                int var305 = 1;
                                while (true) {
                                    if (var305 >= 103) {
                                        int var308 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var309 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field293.method1686();
                                        for (int var310 = 1; var310 < 103; var310++) {
                                            for (int var311 = 1; var311 < 103; var311++) {
                                                if ((class9.field135[var301][var311][var310] & 0x18) == 0) {
                                                    method237(var301, var311, var310, var308, var309);
                                                }
                                                if (var301 < 3 && (class9.field135[var301 + 1][var311][var310] & 0x8) != 0) {
                                                    method237(var301 + 1, var311, var310, var308, var309);
                                                }
                                            }
                                        }
                                        field724 = 0;
                                        for (int var312 = 0; var312 < 104; var312++) {
                                            for (int var313 = 0; var313 < 104; var313++) {
                                                int var314 = Statics.field672.method1919(Statics.field402, var312, var313);
                                                if (var314 != 0) {
                                                    int var315 = var314 >> 14 & 0x7FFF;
                                                    int var316 = class32.method1876(var315).field844;
                                                    if (var316 >= 0) {
                                                        int var317 = var312;
                                                        int var318 = var313;
                                                        if (var316 != 22 && var316 != 29 && var316 != 34 && var316 != 36 && var316 != 46 && var316 != 47 && var316 != 48) {
                                                            int[][] var319 = field681[Statics.field402].field2753;
                                                            for (int var320 = 0; var320 < 10; var320++) {
                                                                int var321 = (int) (Math.random() * 4.0D);
                                                                if (var321 == 0 && var317 > 0 && var317 > var312 - 3 && (var319[var317 - 1][var318] & 0x12C0108) == 0) {
                                                                    var317--;
                                                                }
                                                                if (var321 == 1 && var317 < 103 && var317 < var312 + 3 && (var319[var317 + 1][var318] & 0x12C0180) == 0) {
                                                                    var317++;
                                                                }
                                                                if (var321 == 2 && var318 > 0 && var318 > var313 - 3 && (var319[var317][var318 - 1] & 0x12C0102) == 0) {
                                                                    var318--;
                                                                }
                                                                if (var321 == 3 && var318 < 103 && var318 < var313 + 3 && (var319[var317][var318 + 1] & 0x12C0120) == 0) {
                                                                    var318++;
                                                                }
                                                            }
                                                        }
                                                        field711[field724] = Statics.field797[var316];
                                                        field725[field724] = var317;
                                                        field726[field724] = var318;
                                                        field724++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field83.method1678();
                                        break;
                                    }
                                    int var306 = (103 - var305) * 2048 + 24628;
                                    for (int var307 = 1; var307 < 103; var307++) {
                                        if ((class9.field135[var301][var307][var305] & 0x18) == 0) {
                                            Statics.field672.method2029(var302, var306, 512, var301, var307, var305);
                                        }
                                        if (var301 < 3 && (class9.field135[var301 + 1][var307][var305] & 0x8) != 0) {
                                            Statics.field672.method2029(var302, var306, 512, var301 + 1, var307, var305);
                                        }
                                        var306 += 4;
                                    }
                                    var305++;
                                }
                            }
                            if (field699 == 30) {
                                for (class22 var322 = (class22) field631.method3345(); var322 != null; var322 = (class22) field631.method3324()) {
                                    if (var322.field368 > 0) {
                                        var322.field368--;
                                    }
                                    if (var322.field368 != 0) {
                                        if (var322.field359 > 0) {
                                            var322.field359--;
                                        }
                                        if (var322.field359 == 0 && var322.field357 >= 1 && var322.field360 >= 1 && var322.field357 <= 102 && var322.field360 <= 102 && (var322.field364 < 0 || class9.method1641(var322.field364, var322.field366))) {
                                            method28(var322.field369, var322.field363, var322.field357, var322.field360, var322.field364, var322.field365, var322.field366);
                                            var322.field359 = -1;
                                            if (var322.field364 == var322.field361 && var322.field361 == -1) {
                                                var322.method3361();
                                            } else if (var322.field364 == var322.field361 && var322.field365 == var322.field362 && var322.field373 == var322.field366) {
                                                var322.method3361();
                                            }
                                        }
                                    } else if (var322.field361 < 0 || class9.method1641(var322.field361, var322.field373)) {
                                        method28(var322.field369, var322.field363, var322.field357, var322.field360, var322.field361, var322.field362, var322.field373);
                                        var322.method3361();
                                    }
                                }
                                int var10002;
                                for (int var323 = 0; var323 < field736; var323++) {
                                    var10002 = field739[var323]--;
                                    if (field739[var323] >= -10) {
                                        class57 var325 = field741[var323];
                                        if (var325 == null) {
                                            class57 var409 = (class57) null;
                                            var325 = class57.method1276(Statics.field2058, field737[var323], 0);
                                            if (var325 == null) {
                                                continue;
                                            }
                                            field739[var323] += var325.method1270();
                                            field741[var323] = var325;
                                        }
                                        if (field739[var323] < 0) {
                                            int var332;
                                            if (field722[var323] == 0) {
                                                var332 = field498;
                                            } else {
                                                int var326 = (field722[var323] & 0xFF) * 128;
                                                int var327 = field722[var323] >> 16 & 0xFF;
                                                int var328 = var327 * 128 + 64 - Statics.field1431.field431;
                                                if (var328 < 0) {
                                                    var328 = -var328;
                                                }
                                                int var329 = field722[var323] >> 8 & 0xFF;
                                                int var330 = var329 * 128 + 64 - Statics.field1431.field440;
                                                if (var330 < 0) {
                                                    var330 = -var330;
                                                }
                                                int var331 = var328 + var330 - 128;
                                                if (var331 > var326) {
                                                    field739[var323] = -100;
                                                    continue;
                                                }
                                                if (var331 < 0) {
                                                    var331 = 0;
                                                }
                                                var332 = field735 * (var326 - var331) / var326;
                                            }
                                            if (var332 > 0) {
                                                class63 var333 = var325.method1267().method1338(Statics.field58);
                                                class45 var334 = class45.method978(var333, 100, var332);
                                                var334.method981(field738[var323] - 1);
                                                Statics.field97.method1123(var334);
                                            }
                                            field739[var323] = -100;
                                        }
                                    } else {
                                        field736--;
                                        for (int var324 = var323; var324 < field736; var324++) {
                                            field737[var324] = field737[var324 + 1];
                                            field741[var324] = field741[var324 + 1];
                                            field738[var324] = field738[var324 + 1];
                                            field739[var324] = field739[var324 + 1];
                                            field722[var324] = field722[var324 + 1];
                                        }
                                        var323--;
                                    }
                                }
                                if (field733) {
                                    boolean var335;
                                    if (class138.field2360 == 0) {
                                        var335 = Statics.field2358.method2735();
                                    } else {
                                        var335 = true;
                                    }
                                    if (!var335) {
                                        if (field731 != 0 && field688 != -1) {
                                            class138.method2688(Statics.field758, field688, 0, field731, false);
                                        }
                                        field733 = false;
                                    }
                                }
                                field563++;
                                if (field563 <= 750) {
                                    method2722();
                                    Statics.method1639();
                                    for (int var336 = -1; var336 < field642; var336++) {
                                        int var337;
                                        if (var336 == -1) {
                                            var337 = 2047;
                                        } else {
                                            var337 = field491[var336];
                                        }
                                        class3 var338 = field616[var337];
                                        if (var338 != null && var338.field444 > 0) {
                                            var338.field444--;
                                            if (var338.field444 == 0) {
                                                var338.field458 = null;
                                            }
                                        }
                                    }
                                    for (int var339 = 0; var339 < field695; var339++) {
                                        int var340 = field532[var339];
                                        class25 var341 = field530[var340];
                                        if (var341 != null && var341.field444 > 0) {
                                            var341.field444--;
                                            if (var341.field444 == 0) {
                                                var341.field458 = null;
                                            }
                                        }
                                    }
                                    field574++;
                                    if (field665 != 0) {
                                        field684 += 20;
                                        if (field684 >= 400) {
                                            field665 = 0;
                                        }
                                    }
                                    if (Statics.field937 != null) {
                                        field607++;
                                        if (field607 >= 15) {
                                            method2840(Statics.field937);
                                            Statics.field937 = null;
                                        }
                                    }
                                    if (Statics.field763 != null) {
                                        method2840(Statics.field763);
                                        field614++;
                                        if (class77.field1419 > field512 + 5 || class77.field1419 < field512 - 5 || class77.field1422 > field611 + 5 || class77.field1422 < field611 - 5) {
                                            field613 = true;
                                        }
                                        if (class77.field1420 == 0) {
                                            if (field613 && field614 >= 5) {
                                                if (Statics.field763 == Statics.field409 && field612 != field609) {
                                                    class158 var342 = Statics.field763;
                                                    byte var343 = 0;
                                                    if (field659 == 1 && var342.field2701 == 206) {
                                                        var343 = 1;
                                                    }
                                                    if (var342.field2585[field612] <= 0) {
                                                        var343 = 0;
                                                    }
                                                    if (class162.method1583(method5(var342))) {
                                                        int var344 = field609;
                                                        int var345 = field612;
                                                        var342.field2585[var345] = var342.field2585[var344];
                                                        var342.field2689[var345] = var342.field2689[var344];
                                                        var342.field2585[var344] = -1;
                                                        var342.field2689[var344] = 0;
                                                    } else if (var343 == 1) {
                                                        int var346 = field609;
                                                        int var347 = field612;
                                                        while (var346 != var347) {
                                                            if (var346 > var347) {
                                                                var342.method3116(var346 - 1, var346);
                                                                var346--;
                                                            } else if (var346 < var347) {
                                                                var342.method3116(var346 + 1, var346);
                                                                var346++;
                                                            }
                                                        }
                                                    } else {
                                                        var342.method3116(field612, field609);
                                                    }
                                                    field534.method2317(93);
                                                    field534.method2466(field612);
                                                    field534.method2476(Statics.field763.field2592);
                                                    field534.method2466(field609);
                                                    field534.method2424(var343);
                                                }
                                            } else if ((field637 == 1 || method3158(field520 - 1)) && field520 > 2) {
                                                method3104();
                                            } else if (field520 > 0) {
                                                method1584(field520 - 1);
                                            }
                                            field607 = 10;
                                            class77.field1439 = 0;
                                            Statics.field763 = null;
                                        }
                                    }
                                    class158 var348 = Statics.field202;
                                    class158 var349 = Statics.field30;
                                    Statics.field202 = null;
                                    Statics.field30 = null;
                                    field569 = null;
                                    field675 = false;
                                    field560 = false;
                                    field717 = 0;
                                    while (true) {
                                        class75 var350 = class75.field1387;
                                        boolean var351;
                                        synchronized (class75.field1387) {
                                            if (class75.field1402 == class75.field1400) {
                                                var351 = false;
                                            } else {
                                                Statics.field1344 = class75.field1397[class75.field1400];
                                                Statics.field954 = class75.field1396[class75.field1400];
                                                class75.field1400 = class75.field1400 + 1 & 0x7F;
                                                var351 = true;
                                            }
                                        }
                                        if (!var351 || field717 >= 128) {
                                            method238(field656, 0, 0, 765, 503, 0, 0);
                                            field679++;
                                            while (true) {
                                                class1 var353;
                                                class158 var354;
                                                class158 var355;
                                                do {
                                                    var353 = (class1) field539.method3320();
                                                    if (var353 == null) {
                                                        while (true) {
                                                            class1 var356;
                                                            class158 var357;
                                                            class158 var358;
                                                            do {
                                                                var356 = (class1) field704.method3320();
                                                                if (var356 == null) {
                                                                    while (true) {
                                                                        class1 var359;
                                                                        class158 var360;
                                                                        class158 var361;
                                                                        do {
                                                                            var359 = (class1) field693.method3320();
                                                                            if (var359 == null) {
                                                                                if (field667 != null) {
                                                                                    method1427();
                                                                                }
                                                                                if (class95.field1594 != -1) {
                                                                                    int var362 = class95.field1594;
                                                                                    int var363 = class95.field1626;
                                                                                    boolean var364 = method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var362, var363, true, 0, 0, 0, 0, 0, 0);
                                                                                    class95.field1594 = -1;
                                                                                    if (var364) {
                                                                                        field603 = class77.field1428;
                                                                                        field604 = class77.field1429;
                                                                                        field665 = 1;
                                                                                        field684 = 0;
                                                                                    }
                                                                                }
                                                                                if (Statics.field763 == null && field667 == null) {
                                                                                    int var365 = class77.field1439;
                                                                                    if (field622) {
                                                                                        if (var365 != 1) {
                                                                                            int var366 = class77.field1419;
                                                                                            int var367 = class77.field1422;
                                                                                            if (var366 < Statics.field842 - 10 || var366 > Statics.field842 + Statics.field12 + 10 || var367 < Statics.field1785 - 10 || var367 > Statics.field288 + Statics.field1785 + 10) {
                                                                                                field622 = false;
                                                                                                method234(Statics.field842, Statics.field1785, Statics.field12, Statics.field288);
                                                                                            }
                                                                                        }
                                                                                        if (var365 == 1) {
                                                                                            int var368 = Statics.field842;
                                                                                            int var369 = Statics.field1785;
                                                                                            int var370 = Statics.field12;
                                                                                            int var371 = class77.field1428;
                                                                                            int var372 = class77.field1429;
                                                                                            int var373 = -1;
                                                                                            for (int var374 = 0; var374 < field520; var374++) {
                                                                                                int var375 = (field520 - 1 - var374) * 15 + var369 + 31;
                                                                                                if (var371 > var368 && var371 < var368 + var370 && var372 > var375 - 13 && var372 < var375 + 3) {
                                                                                                    var373 = var374;
                                                                                                }
                                                                                            }
                                                                                            if (var373 != -1) {
                                                                                                method1584(var373);
                                                                                            }
                                                                                            field622 = false;
                                                                                            method234(Statics.field842, Statics.field1785, Statics.field12, Statics.field288);
                                                                                        }
                                                                                    } else {
                                                                                        label3174: {
                                                                                            if (var365 == 1 && field520 > 0) {
                                                                                                int var376 = field577[field520 - 1];
                                                                                                if (var376 == 39 || var376 == 40 || var376 == 41 || var376 == 42 || var376 == 43 || var376 == 33 || var376 == 34 || var376 == 35 || var376 == 36 || var376 == 37 || var376 == 38 || var376 == 1005) {
                                                                                                    int var377 = field640[field520 - 1];
                                                                                                    int var378 = field507[field520 - 1];
                                                                                                    class158 var379 = class158.method44(var378);
                                                                                                    if (class162.method15(method5(var379)) || class162.method1583(method5(var379))) {
                                                                                                        field613 = false;
                                                                                                        field614 = 0;
                                                                                                        if (Statics.field763 != null) {
                                                                                                            method2840(Statics.field763);
                                                                                                        }
                                                                                                        Statics.field763 = class158.method44(var378);
                                                                                                        field609 = var377;
                                                                                                        field512 = class77.field1428;
                                                                                                        field611 = class77.field1429;
                                                                                                        method2840(Statics.field763);
                                                                                                        break label3174;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (var365 == 1 && (field637 == 1 && field520 > 2 || method3158(field520 - 1))) {
                                                                                                var365 = 2;
                                                                                            }
                                                                                            if (var365 == 1 && field520 > 0) {
                                                                                                method1584(field520 - 1);
                                                                                            }
                                                                                            if (var365 == 2 && field520 > 0) {
                                                                                                method3104();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (Statics.field202 != var348) {
                                                                                    if (var348 != null) {
                                                                                        method2840(var348);
                                                                                    }
                                                                                    if (Statics.field202 != null) {
                                                                                        method2840(Statics.field202);
                                                                                    }
                                                                                }
                                                                                if (Statics.field30 != var349 && field649 == field605) {
                                                                                    if (var349 != null) {
                                                                                        method2840(var349);
                                                                                    }
                                                                                    if (Statics.field30 != null) {
                                                                                        method2840(Statics.field30);
                                                                                    }
                                                                                }
                                                                                if (Statics.field30 == null) {
                                                                                    if (field605 > 0) {
                                                                                        field605--;
                                                                                    }
                                                                                } else if (field605 < field649) {
                                                                                    field605++;
                                                                                    if (field649 == field605) {
                                                                                        method2840(Statics.field30);
                                                                                    }
                                                                                }
                                                                                int var380 = field562 + Statics.field1431.field431;
                                                                                int var381 = field595 + Statics.field1431.field440;
                                                                                if (Statics.field2716 - var380 < -500 || Statics.field2716 - var380 > 500 || Statics.field370 - var381 < -500 || Statics.field370 - var381 > 500) {
                                                                                    Statics.field2716 = var380;
                                                                                    Statics.field370 = var381;
                                                                                }
                                                                                if (Statics.field2716 != var380) {
                                                                                    Statics.field2716 += (var380 - Statics.field2716) / 16;
                                                                                }
                                                                                if (Statics.field370 != var381) {
                                                                                    Statics.field370 += (var381 - Statics.field370) / 16;
                                                                                }
                                                                                if (class75.field1386[96]) {
                                                                                    field694 += (-24 - field694) / 2;
                                                                                } else if (class75.field1386[97]) {
                                                                                    field694 += (24 - field694) / 2;
                                                                                } else {
                                                                                    field694 /= 2;
                                                                                }
                                                                                if (class75.field1386[98]) {
                                                                                    field585 += (12 - field585) / 2;
                                                                                } else if (class75.field1386[99]) {
                                                                                    field585 += (-12 - field585) / 2;
                                                                                } else {
                                                                                    field585 /= 2;
                                                                                }
                                                                                field583 = field694 / 2 + field583 & 0x7FF;
                                                                                field734 += field585 / 2;
                                                                                if (field734 < 128) {
                                                                                    field734 = 128;
                                                                                }
                                                                                if (field734 > 383) {
                                                                                    field734 = 383;
                                                                                }
                                                                                int var382 = Statics.field2716 >> 7;
                                                                                int var383 = Statics.field370 >> 7;
                                                                                int var384 = method33(Statics.field2716, Statics.field370, Statics.field402);
                                                                                int var385 = 0;
                                                                                if (var382 > 3 && var383 > 3 && var382 < 100 && var383 < 100) {
                                                                                    for (int var386 = var382 - 4; var386 <= var382 + 4; var386++) {
                                                                                        for (int var387 = var383 - 4; var387 <= var383 + 4; var387++) {
                                                                                            int var388 = Statics.field402;
                                                                                            if (var388 < 3 && (class9.field135[1][var386][var387] & 0x2) == 2) {
                                                                                                var388++;
                                                                                            }
                                                                                            int var389 = var384 - class9.field138[var388][var386][var387];
                                                                                            if (var389 > var385) {
                                                                                                var385 = var389;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                int var390 = var385 * 192;
                                                                                if (var390 > 98048) {
                                                                                    var390 = 98048;
                                                                                }
                                                                                if (var390 < 32768) {
                                                                                    var390 = 32768;
                                                                                }
                                                                                if (var390 > field552) {
                                                                                    field552 += (var390 - field552) / 24;
                                                                                } else if (var390 < field552) {
                                                                                    field552 += (var390 - field552) / 80;
                                                                                }
                                                                                if (field742) {
                                                                                    method161();
                                                                                }
                                                                                for (int var391 = 0; var391 < 5; var391++) {
                                                                                    var10002 = field747[var391]++;
                                                                                }
                                                                                int var392 = ++class77.field1437 - 1;
                                                                                int var394 = class75.field1403;
                                                                                if (var392 > 15000 && var394 > 15000) {
                                                                                    field541 = 250;
                                                                                    class77.field1437 = 14500;
                                                                                    field534.method2317(197);
                                                                                }
                                                                                field568++;
                                                                                if (field568 > 500) {
                                                                                    field568 = 0;
                                                                                    int var396 = (int) (Math.random() * 8.0D);
                                                                                    if ((var396 & 0x1) == 1) {
                                                                                        field562 += field599;
                                                                                    }
                                                                                    if ((var396 & 0x2) == 2) {
                                                                                        field595 += field564;
                                                                                    }
                                                                                    if ((var396 & 0x4) == 4) {
                                                                                        field566 += field753;
                                                                                    }
                                                                                }
                                                                                if (field562 < -50) {
                                                                                    field599 = 2;
                                                                                }
                                                                                if (field562 > 50) {
                                                                                    field599 = -2;
                                                                                }
                                                                                if (field595 < -55) {
                                                                                    field564 = 2;
                                                                                }
                                                                                if (field595 > 55) {
                                                                                    field564 = -2;
                                                                                }
                                                                                if (field566 < -40) {
                                                                                    field753 = 1;
                                                                                }
                                                                                if (field566 > 40) {
                                                                                    field753 = -1;
                                                                                }
                                                                                field573++;
                                                                                if (field573 > 500) {
                                                                                    field573 = 0;
                                                                                    int var397 = (int) (Math.random() * 8.0D);
                                                                                    if ((var397 & 0x1) == 1) {
                                                                                        field596 += field570;
                                                                                    }
                                                                                    if ((var397 & 0x2) == 2) {
                                                                                        field655 += field572;
                                                                                    }
                                                                                }
                                                                                if (field596 < -60) {
                                                                                    field570 = 2;
                                                                                }
                                                                                if (field596 > 60) {
                                                                                    field570 = -2;
                                                                                }
                                                                                if (field655 < -20) {
                                                                                    field572 = 1;
                                                                                }
                                                                                if (field655 > 10) {
                                                                                    field572 = -1;
                                                                                }
                                                                                for (class28 var398 = (class28) field751.method3290(); var398 != null; var398 = (class28) field751.method3291()) {
                                                                                    if ((long) var398.field765 < class121.method2693() / 1000L - 5L) {
                                                                                        if (var398.field759 > 0) {
                                                                                            method1680(5, "", var398.field760 + class134.field2236);
                                                                                        }
                                                                                        if (var398.field759 == 0) {
                                                                                            method1680(5, "", var398.field760 + class134.field2237);
                                                                                        }
                                                                                        var398.method3356();
                                                                                    }
                                                                                }
                                                                                field540++;
                                                                                if (field540 > 50) {
                                                                                    field534.method2317(150);
                                                                                }
                                                                                try {
                                                                                    if (Statics.field1440 != null && field534.field2059 > 0) {
                                                                                        Statics.field1440.method1397(field534.field2061, 0, field534.field2059);
                                                                                        field534.field2059 = 0;
                                                                                        field540 = 0;
                                                                                        return;
                                                                                    }
                                                                                } catch (IOException var404) {
                                                                                    if (field541 > 0) {
                                                                                        method127();
                                                                                    } else {
                                                                                        method2341(40);
                                                                                        Statics.field2052 = Statics.field1440;
                                                                                        Statics.field1440 = null;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            var360 = var359.field2;
                                                                            if (var360.field2593 < 0) {
                                                                                break;
                                                                            }
                                                                            var361 = class158.method44(var360.field2603);
                                                                        } while (var361 == null || var361.field2700 == null || var360.field2593 >= var361.field2700.length || var361.field2700[var360.field2593] != var360);
                                                                        class26.method227(var359);
                                                                    }
                                                                }
                                                                var357 = var356.field2;
                                                                if (var357.field2593 < 0) {
                                                                    break;
                                                                }
                                                                var358 = class158.method44(var357.field2603);
                                                            } while (var358 == null || var358.field2700 == null || var357.field2593 >= var358.field2700.length || var358.field2700[var357.field2593] != var357);
                                                            class26.method227(var356);
                                                        }
                                                    }
                                                    var354 = var353.field2;
                                                    if (var354.field2593 < 0) {
                                                        break;
                                                    }
                                                    var355 = class158.method44(var354.field2603);
                                                } while (var355 == null || var355.field2700 == null || var354.field2593 >= var355.field2700.length || var355.field2700[var354.field2593] != var354);
                                                class26.method227(var353);
                                            }
                                        }
                                        field648[field717] = Statics.field1344;
                                        field513[field717] = Statics.field954;
                                        field717++;
                                    }
                                } else if (field541 > 0) {
                                    method127();
                                } else {
                                    method2341(40);
                                    Statics.field2052 = Statics.field1440;
                                    Statics.field1440 = null;
                                }
                            }
                        }
                    }
                } else if (field699 == 40) {
                    method153();
                }
                return;
            }
            var2.field2572.method3082(var2.field2573, (int) var2.field2821, var2.field2571, false);
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method392() {
        boolean var1;
        label123: {
            try {
                if (class138.field2360 == 2) {
                    if (Statics.field1788 == null) {
                        Statics.field1788 = class139.method2716(Statics.field1469, Statics.field2362, Statics.field2361);
                        if (Statics.field1788 == null) {
                            var1 = false;
                            break label123;
                        }
                    }
                    if (Statics.field1320 == null) {
                        Statics.field1320 = new class58(Statics.field2357, Statics.field2355);
                    }
                    if (Statics.field2358.method2754(Statics.field1788, Statics.field2363, Statics.field1320, 22050)) {
                        Statics.field2358.method2731();
                        Statics.field2358.method2765(Statics.field286);
                        Statics.field2358.method2780(Statics.field1788, Statics.field427);
                        class138.field2360 = 0;
                        Statics.field1788 = null;
                        Statics.field1320 = null;
                        Statics.field1469 = null;
                        var1 = true;
                        break label123;
                    }
                }
            } catch (Exception var16) {
                var16.printStackTrace();
                Statics.field2358.method2734();
                class138.field2360 = 0;
                Statics.field1788 = null;
                Statics.field1320 = null;
                Statics.field1469 = null;
            }
            var1 = false;
        }
        if (var1 && field733 && Statics.field120 != null) {
            Statics.field120.method1175();
        }
        if (field1348) {
            Canvas var4 = Statics.field775;
            var4.removeKeyListener(class75.field1387);
            var4.removeFocusListener(class75.field1387);
            class75.field1395 = -1;
            Canvas var5 = Statics.field775;
            var5.removeMouseListener(class77.field1416);
            var5.removeMouseMotionListener(class77.field1416);
            var5.removeFocusListener(class77.field1416);
            class77.field1417 = 0;
            if (Statics.field323 != null) {
                Statics.field323.method1372(Statics.field775);
            }
            this.method1435();
            class75.method765(Statics.field775);
            class77.method226(Statics.field775);
            if (Statics.field323 != null) {
                Statics.field323.method1370(Statics.field775);
            }
        }
        if (field699 == 0) {
            class73.method158(class21.field337, class21.field324, (Color) null);
        } else if (field699 == 5) {
            class21.method1328(Statics.field787, Statics.field2035);
        } else if (field699 == 10) {
            class21.method1328(Statics.field787, Statics.field2035);
        } else if (field699 == 20) {
            class21.method1328(Statics.field787, Statics.field2035);
        } else if (field699 == 25) {
            if (field551 == 1) {
                if (field749 > field548) {
                    field548 = field749;
                }
                int var6 = (field548 * 50 - field749 * 50) / field548;
                method2313(class134.field2105 + class2.field28 + class2.field25 + var6 + "%" + class2.field26, false);
            } else if (field551 == 2) {
                if (field654 > field697) {
                    field697 = field654;
                }
                int var7 = (field697 * 50 - field654 * 50) / field697 + 50;
                method2313(class134.field2105 + class2.field28 + class2.field25 + var7 + "%" + class2.field26, false);
            } else {
                method2313(class134.field2105, false);
            }
        } else if (field699 == 30) {
            method118();
        } else if (field699 == 40) {
            method2313(class134.field2106 + class2.field28 + class134.field2119, false);
        }
        if (field699 == 30 && field706 == 0 && !field1356) {
            try {
                Graphics var8 = Statics.field775.getGraphics();
                for (int var9 = 0; var9 < field743; var9++) {
                    if (field650[var9]) {
                        Statics.field83.method1609(var8, field606[var9], field703[var9], field547[var9], field705[var9]);
                        field650[var9] = false;
                    }
                }
            } catch (Exception var15) {
                Statics.field775.repaint();
            }
        } else if (field699 > 0) {
            try {
                Graphics var11 = Statics.field775.getGraphics();
                Statics.field83.method1611(var11, 0, 0);
                field1356 = false;
                for (int var12 = 0; var12 < field743; var12++) {
                    field650[var12] = false;
                }
            } catch (Exception var14) {
                Statics.field775.repaint();
            }
        }
    }

    @ObfuscatedName("client.y(B)V")
    public final void method282() {
        if (Statics.field1246 != null) {
            Statics.field1246.field259 = false;
        }
        Statics.field1246 = null;
        if (Statics.field1440 != null) {
            Statics.field1440.method1394();
            Statics.field1440 = null;
        }
        if (class75.field1387 != null) {
            class75 var1 = class75.field1387;
            synchronized (class75.field1387) {
                class75.field1387 = null;
            }
        }
        class77.method229();
        Statics.field323 = null;
        if (Statics.field120 != null) {
            Statics.field120.method1181();
        }
        if (Statics.field219 != null) {
            Statics.field219.method1181();
        }
        if (Statics.field2539 != null) {
            Statics.field2539.method1394();
        }
        Object var3 = class157.field2579;
        synchronized (class157.field2579) {
            if (class157.field2580 != 0) {
                class157.field2580 = 1;
                try {
                    class157.field2579.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class82.field1470.method610();
            for (int var6 = 0; var6 < Statics.field1238; var6++) {
                Statics.field1472[var6].method610();
            }
            class82.field1471.method610();
            class82.field1476.method610();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("dj.u(IB)V")
    public static void method2341(int arg0) {
        if (field699 == arg0) {
            return;
        }
        if (field699 == 0) {
            class73.method1608();
        }
        if (arg0 == 20 || arg0 == 40) {
            field526 = 0;
            field527 = 0;
            field528 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2052 != null) {
            Statics.field2052.method1394();
            Statics.field2052 = null;
        }
        if (field699 == 25) {
            field551 = 0;
            field749 = 0;
            field548 = 1;
            field654 = 0;
            field697 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method50(Statics.field775, Statics.field2025, Statics.field1377);
        } else {
            class21.method4();
        }
        field699 = arg0;
    }

    @ObfuscatedName("client.z(I)V")
    public void method272() {
        if (field699 != 1000) {
            boolean var1 = class153.method2700();
            if (!var1) {
                this.method318();
            }
        }
    }

    @ObfuscatedName("client.j(I)V")
    public void method318() {
        if (class153.field2549 >= 4) {
            this.method1444("js5crc");
            field699 = 1000;
            return;
        }
        if (class153.field2550 >= 4) {
            if (field699 <= 5) {
                this.method1444("js5io");
                field699 = 1000;
                return;
            }
            field524 = 3000;
            class153.field2550 = 3;
        }
        if (--field524 + 1 > 0) {
            return;
        }
        try {
            if (field523 == 0) {
                Statics.field769 = Statics.field1405.method1503(Statics.field371, Statics.field282);
                field523++;
            }
            if (field523 == 1) {
                if (Statics.field769.field1446 == 2) {
                    this.method274(-1);
                    return;
                }
                if (Statics.field769.field1446 == 1) {
                    field523++;
                }
            }
            if (field523 == 2) {
                Statics.field295 = new class70((Socket) Statics.field769.field1442, Statics.field1405);
                class127 var1 = new class127(5);
                var1.method2424(15);
                var1.method2633(14);
                Statics.field295.method1397(var1.field2061, 0, 5);
                field523++;
                Statics.field2018 = class121.method2693();
            }
            if (field523 == 3) {
                if (field699 <= 5 || Statics.field295.method1395() > 0) {
                    int var2 = Statics.field295.method1398();
                    if (var2 != 0) {
                        this.method274(var2);
                        return;
                    }
                    field523++;
                } else if (class121.method2693() - Statics.field2018 > 30000L) {
                    this.method274(-2);
                    return;
                }
            }
            if (field523 == 4) {
                class70 var3 = Statics.field295;
                boolean var4 = field699 > 20;
                if (Statics.field2539 != null) {
                    try {
                        Statics.field2539.method1394();
                    } catch (Exception var14) {
                    }
                    Statics.field2539 = null;
                }
                Statics.field2539 = var3;
                class153.method769(var4);
                class153.field2543.field2059 = 0;
                Statics.field1486 = null;
                Statics.field1552 = null;
                class153.field2545 = 0;
                while (true) {
                    class155 var6 = (class155) class153.field2535.method3310();
                    if (var6 == null) {
                        while (true) {
                            class155 var7 = (class155) class153.field2540.method3310();
                            if (var7 == null) {
                                if (class153.field2548 != 0) {
                                    try {
                                        class127 var8 = new class127(4);
                                        var8.method2424(4);
                                        var8.method2424(class153.field2548);
                                        var8.method2641(0);
                                        Statics.field2539.method1397(var8.field2061, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2539.method1394();
                                        } catch (Exception var12) {
                                        }
                                        class153.field2550++;
                                        Statics.field2539 = null;
                                    }
                                }
                                class153.field2531 = 0;
                                Statics.field2530 = class121.method2693();
                                Statics.field769 = null;
                                Statics.field295 = null;
                                field523 = 0;
                                field525 = 0;
                                return;
                            }
                            class153.field2544.method3283(var7);
                            class153.field2542.method3302(var7, var7.field2821);
                            class153.field2538++;
                            class153.field2541--;
                        }
                    }
                    class153.field2533.method3302(var6, var6.field2821);
                    class153.field2534++;
                    class153.field2536--;
                }
            }
        } catch (IOException var15) {
            this.method274(-3);
        }
    }

    @ObfuscatedName("client.h(II)V")
    public void method274(int arg0) {
        Statics.field769 = null;
        Statics.field295 = null;
        field523 = 0;
        if (Statics.field886 == Statics.field282) {
            Statics.field282 = Statics.field2479;
        } else {
            Statics.field282 = Statics.field886;
        }
        field525++;
        if (field525 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field699 <= 5) {
                this.method1444("js5connect_full");
                field699 = 1000;
            } else {
                field524 = 3000;
            }
        } else if (field525 >= 2 && arg0 == 6) {
            this.method1444("js5connect_outofdate");
            field699 = 1000;
        } else if (field525 >= 4) {
            if (field699 <= 5) {
                this.method1444("js5connect");
                field699 = 1000;
            } else {
                field524 = 3000;
            }
        }
    }

    @ObfuscatedName("bd.x(I)V")
    public static void method1579() {
        if (field522 == 0) {
            Statics.field672 = new class95(4, 104, 104, class9.field138);
            for (int var0 = 0; var0 < 4; var0++) {
                field681[var0] = new class164(104, 104);
            }
            Statics.field293 = new class86(512, 512);
            class21.field324 = class134.field2108;
            class21.field337 = 5;
            field522 = 20;
        } else if (field522 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1814[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1915(var1, 500, 800, 512, 334);
            class21.field324 = class134.field2109;
            class21.field337 = 10;
            field522 = 30;
        } else if (field522 == 30) {
            Statics.field428 = method1383(0, false, true, true);
            Statics.field188 = method1383(1, false, true, true);
            Statics.field1375 = method1383(2, true, false, true);
            Statics.field1069 = method1383(3, false, true, true);
            Statics.field2058 = method1383(4, false, true, true);
            Statics.field936 = method1383(5, true, true, true);
            Statics.field758 = method1383(6, true, true, false);
            Statics.field1474 = method1383(7, false, true, true);
            Statics.field1377 = method1383(8, false, true, true);
            Statics.field95 = method1383(9, false, true, true);
            Statics.field2025 = method1383(10, false, true, true);
            Statics.field1376 = method1383(11, false, true, true);
            Statics.field191 = method1383(12, false, true, true);
            Statics.field2078 = method1383(13, true, false, true);
            Statics.field1856 = method1383(14, false, true, false);
            Statics.field2012 = method1383(15, false, true, true);
            class21.field324 = class134.field2146;
            class21.field337 = 20;
            field522 = 40;
        } else if (field522 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field428.method3080() * 4 / 100;
            int var8 = var7 + Statics.field188.method3080() * 4 / 100;
            int var9 = var8 + Statics.field1375.method3080() * 2 / 100;
            int var10 = var9 + Statics.field1069.method3080() * 2 / 100;
            int var11 = var10 + Statics.field2058.method3080() * 6 / 100;
            int var12 = var11 + Statics.field936.method3080() * 4 / 100;
            int var13 = var12 + Statics.field758.method3080() * 2 / 100;
            int var14 = var13 + Statics.field1474.method3080() * 60 / 100;
            int var15 = var14 + Statics.field1377.method3080() * 2 / 100;
            int var16 = var15 + Statics.field95.method3080() * 2 / 100;
            int var17 = var16 + Statics.field2025.method3080() * 2 / 100;
            int var18 = var17 + Statics.field1376.method3080() * 2 / 100;
            int var19 = var18 + Statics.field191.method3080() * 2 / 100;
            int var20 = var19 + Statics.field2078.method3080() * 2 / 100;
            int var21 = var20 + Statics.field1856.method3080() * 2 / 100;
            int var22 = var21 + Statics.field2012.method3080() * 2 / 100;
            if (var22 == 100) {
                class21.field324 = class134.field2112;
                class21.field337 = 30;
                field522 = 45;
            } else {
                if (var22 != 0) {
                    class21.field324 = class134.field2141 + var22 + "%";
                }
                class21.field337 = 30;
            }
        } else if (field522 == 45) {
            class52.method175(22050, !field584, 2);
            class141 var23 = new class141();
            var23.method2736(9, 128);
            Statics.field120 = Statics.method585(Statics.field1405, Statics.field775, 0, 22050);
            Statics.field120.method1173(var23);
            class154 var24 = Statics.field2012;
            class154 var25 = Statics.field1856;
            class154 var26 = Statics.field2058;
            Statics.field2363 = var24;
            Statics.field2355 = var25;
            Statics.field2357 = var26;
            Statics.field2358 = var23;
            Statics.field219 = Statics.method585(Statics.field1405, Statics.field775, 1, 2048);
            Statics.field97 = new class46();
            Statics.field219.method1173(Statics.field97);
            Statics.field58 = new class62(22050, Statics.field2051);
            class21.field324 = class134.field2113;
            class21.field337 = 35;
            field522 = 50;
        } else if (field522 == 50) {
            int var27 = 0;
            if (Statics.field2035 == null) {
                class154 var28 = Statics.field1377;
                class154 var29 = Statics.field2078;
                int var30 = var28.method3023("p11_full");
                int var31 = var28.method3003(var30, "");
                class183 var32 = class84.method764(var28, var29, var30, var31);
                Statics.field2035 = var32;
            } else {
                var27++;
            }
            if (Statics.field130 == null) {
                class154 var33 = Statics.field1377;
                class154 var34 = Statics.field2078;
                int var35 = var33.method3023("p12_full");
                int var36 = var33.method3003(var35, "");
                class183 var37 = class84.method764(var33, var34, var35, var36);
                Statics.field130 = var37;
            } else {
                var27++;
            }
            if (Statics.field787 == null) {
                Statics.field787 = class84.method111(Statics.field1377, Statics.field2078, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class21.field324 = class134.field2114 + var27 * 100 / 3 + "%";
                class21.field337 = 40;
            } else {
                Statics.field1068 = new class151(true);
                class21.field324 = class134.field2115;
                class21.field337 = 40;
                field522 = 60;
            }
        } else if (field522 == 60) {
            int var38 = class21.method1640(Statics.field2025, Statics.field1377);
            int var39 = class21.method16();
            if (var38 < var39) {
                class21.field324 = class134.field2116 + var38 * 100 / var39 + "%";
                class21.field337 = 50;
            } else {
                class21.field324 = class134.field2305;
                class21.field337 = 50;
                method2341(5);
                field522 = 70;
            }
        } else if (field522 == 70) {
            if (Statics.field1375.method2991()) {
                class37.method39(Statics.field1375);
                class154 var40 = Statics.field1375;
                Statics.field891 = var40;
                class36.method1871(Statics.field1375, Statics.field1474);
                class154 var41 = Statics.field1375;
                class154 var42 = Statics.field1474;
                boolean var43 = field584;
                Statics.field833 = var41;
                Statics.field861 = var42;
                class32.field857 = var43;
                class31.method2215(Statics.field1375, Statics.field1474);
                class154 var44 = Statics.field1375;
                class154 var45 = Statics.field1474;
                boolean var46 = field582;
                class183 var47 = Statics.field2035;
                Statics.field1946 = var44;
                Statics.field1012 = var45;
                Statics.field1007 = var46;
                Statics.field1946.method3048(10);
                Statics.field762 = var47;
                class34.method2956(Statics.field1375, Statics.field428, Statics.field188);
                class35.method115(Statics.field1375, Statics.field1474);
                class154 var48 = Statics.field1375;
                Statics.field983 = var48;
                class154 var49 = Statics.field1375;
                Statics.field1062 = var49;
                Statics.field1061 = Statics.field1062.method3048(16);
                class158.method3065(Statics.field1069, Statics.field1474, Statics.field1377, Statics.field2078);
                class154 var50 = Statics.field1375;
                Statics.field1059 = var50;
                class39.method3369(Statics.field1375);
                class21.field324 = class134.field2098;
                class21.field337 = 60;
                field522 = 80;
            } else {
                class21.field324 = class134.field2159 + Statics.field1375.method3085() + "%";
                class21.field337 = 60;
            }
        } else if (field522 == 80) {
            int var51 = 0;
            if (Statics.field129 == null) {
                class154 var52 = Statics.field1377;
                int var53 = var52.method3023("compass");
                int var54 = var52.method3003(var53, "");
                class86 var55;
                if (class84.method224(var52, var53, var54)) {
                    var55 = class84.method1428();
                } else {
                    var55 = null;
                }
                Statics.field129 = var55;
            } else {
                var51++;
            }
            if (Statics.field1411 == null) {
                class154 var57 = Statics.field1377;
                int var58 = var57.method3023("mapedge");
                int var59 = var57.method3003(var58, "");
                class86 var60;
                if (class84.method224(var57, var58, var59)) {
                    var60 = class84.method1428();
                } else {
                    var60 = null;
                }
                Statics.field1411 = var60;
            } else {
                var51++;
            }
            if (Statics.field358 == null) {
                Statics.field358 = class84.method628(Statics.field1377, "mapscene", "");
            } else {
                var51++;
            }
            if (Statics.field797 == null) {
                Statics.field797 = class84.method40(Statics.field1377, "mapfunction", "");
            } else {
                var51++;
            }
            if (Statics.field1341 == null) {
                Statics.field1341 = class84.method40(Statics.field1377, "hitmarks", "");
            } else {
                var51++;
            }
            if (Statics.field1362 == null) {
                Statics.field1362 = class84.method40(Statics.field1377, "headicons_pk", "");
            } else {
                var51++;
            }
            if (Statics.field11 == null) {
                Statics.field11 = class84.method40(Statics.field1377, "headicons_prayer", "");
            } else {
                var51++;
            }
            if (Statics.field1311 == null) {
                Statics.field1311 = class84.method40(Statics.field1377, "headicons_hint", "");
            } else {
                var51++;
            }
            if (Statics.field1298 == null) {
                Statics.field1298 = class84.method40(Statics.field1377, "mapmarker", "");
            } else {
                var51++;
            }
            if (Statics.field1410 == null) {
                Statics.field1410 = class84.method40(Statics.field1377, "cross", "");
            } else {
                var51++;
            }
            if (Statics.field207 == null) {
                Statics.field207 = class84.method40(Statics.field1377, "mapdots", "");
            } else {
                var51++;
            }
            if (Statics.field285 == null) {
                Statics.field285 = class84.method628(Statics.field1377, "scrollbar", "");
            } else {
                var51++;
            }
            if (Statics.field101 == null) {
                Statics.field101 = class84.method628(Statics.field1377, "mod_icons", "");
            } else {
                var51++;
            }
            if (Statics.field317 == null) {
                Statics.field317 = class84.method2640(Statics.field1377, "mapback", "");
            } else {
                var51++;
            }
            if (var51 < 14) {
                class21.field324 = class134.field2120 + var51 * 100 / 14 + "%";
                class21.field337 = 70;
            } else {
                Statics.field2842 = Statics.field101;
                Statics.field1411.method1688();
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 41.0D) - 20;
                for (int var66 = 0; var66 < Statics.field797.length; var66++) {
                    Statics.field797[var66].method1687(var62 + var65, var63 + var65, var64 + var65);
                }
                Statics.field358[0].method1779(var62 + var65, var63 + var65, var64 + var65);
                Statics.field1481 = new int[33];
                Statics.field1711 = new int[33];
                Statics.field1823 = new int[151];
                Statics.field2465 = new int[151];
                for (int var67 = 0; var67 < 33; var67++) {
                    int var68 = 999;
                    int var69 = 0;
                    for (int var70 = 0; var70 < 34; var70++) {
                        if (Statics.field317.field1521[Statics.field317.field1517 * var67 + var70] == 0) {
                            if (var68 == 999) {
                                var68 = var70;
                            }
                        } else if (var68 != 999) {
                            var69 = var70;
                            break;
                        }
                    }
                    Statics.field1481[var67] = var68;
                    Statics.field1711[var67] = var69 - var68;
                }
                for (int var71 = 5; var71 < 156; var71++) {
                    int var72 = 999;
                    int var73 = 0;
                    for (int var74 = 25; var74 < 172; var74++) {
                        if (Statics.field317.field1521[Statics.field317.field1517 * var71 + var74] == 0 && (var74 > 34 || var71 > 34)) {
                            if (var72 == 999) {
                                var72 = var74;
                            }
                        } else if (var72 != 999) {
                            var73 = var74;
                            break;
                        }
                    }
                    Statics.field1823[var71 - 5] = var72 - 25;
                    Statics.field2465[var71 - 5] = var73 - var72;
                }
                class21.field324 = class134.field2121;
                class21.field337 = 70;
                field522 = 90;
            }
        } else if (field522 == 90) {
            if (Statics.field95.method2991()) {
                class110 var75 = new class110(Statics.field95, Statics.field1377, 20, 0.8D, field584 ? 64 : 128);
                class104.method2171(var75);
                class104.method2178(0.8D);
                class21.field324 = class134.field2176;
                class21.field337 = 90;
                field522 = 110;
            } else {
                class21.field324 = class134.field2122 + Statics.field95.method3085() + "%";
                class21.field337 = 90;
            }
        } else if (field522 == 110) {
            Statics.field1246 = new class16();
            Statics.field1405.method1515(Statics.field1246, 10);
            class21.field324 = class134.field2124;
            class21.field337 = 94;
            field522 = 120;
        } else if (field522 == 120) {
            if (Statics.field2025.method3045("huffman", "")) {
                class120 var76 = new class120(Statics.field2025.method3052("huffman", ""));
                Statics.field2466 = var76;
                class21.field324 = class134.field2261;
                class21.field337 = 96;
                field522 = 130;
            } else {
                class21.field324 = class134.field2278 + "%";
                class21.field337 = 96;
            }
        } else if (field522 == 130) {
            if (!Statics.field1069.method2991()) {
                class21.field324 = class134.field2127 + Statics.field1069.method3085() * 4 / 5 + "%";
                class21.field337 = 100;
            } else if (!Statics.field191.method2991()) {
                class21.field324 = class134.field2127 + (80 + Statics.field191.method3085() / 6) + "%";
                class21.field337 = 100;
            } else if (Statics.field2078.method2991()) {
                class21.field324 = class134.field2128;
                class21.field337 = 100;
                field522 = 140;
            } else {
                class21.field324 = class134.field2127 + (96 + Statics.field2078.method3085() / 20) + "%";
                class21.field337 = 100;
            }
        } else if (field522 == 140) {
            method2341(10);
        }
    }

    @ObfuscatedName("bh.q(IZZZB)Ley;")
    public static class154 method1383(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1470 != null) {
            var4 = new class71(arg0, class82.field1470, Statics.field1472[arg0], 1000000);
        }
        return new class154(var4, Statics.field1004, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("k.w(B)V")
    public static final void method153() {
        try {
            if (field526 == 0) {
                if (Statics.field1440 != null) {
                    Statics.field1440.method1394();
                    Statics.field1440 = null;
                }
                Statics.field509 = null;
                field618 = false;
                field527 = 0;
                field526 = 1;
            }
            if (field526 == 1) {
                if (Statics.field509 == null) {
                    Statics.field509 = Statics.field1405.method1503(Statics.field371, Statics.field282);
                }
                if (Statics.field509.field1446 == 2) {
                    throw new IOException();
                }
                if (Statics.field509.field1446 == 1) {
                    Statics.field1440 = new class70((Socket) Statics.field509.field1442, Statics.field1405);
                    Statics.field509 = null;
                    field526 = 2;
                }
            }
            if (field526 == 2) {
                field534.field2059 = 0;
                field534.method2424(14);
                Statics.field1440.method1397(field534.field2061, 0, 1);
                field536.field2059 = 0;
                field526 = 3;
            }
            if (field526 == 3) {
                if (Statics.field120 != null) {
                    Statics.field120.method1174();
                }
                if (Statics.field219 != null) {
                    Statics.field219.method1174();
                }
                int var0 = Statics.field1440.method1398();
                if (Statics.field120 != null) {
                    Statics.field120.method1174();
                }
                if (Statics.field219 != null) {
                    Statics.field219.method1174();
                }
                if (var0 != 0) {
                    method2362(var0);
                    return;
                }
                field536.field2059 = 0;
                field526 = 5;
            }
            if (field526 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field534.field2059 = 0;
                field534.method2424(10);
                field534.method2633(var1[0]);
                field534.method2633(var1[1]);
                field534.method2633(var1[2]);
                field534.method2633(var1[3]);
                field534.method2428(0L);
                field534.method2429(class21.field344);
                field534.method2456(class6.field96, class6.field94);
                field535.field2059 = 0;
                if (field699 == 40) {
                    field535.method2424(18);
                } else {
                    field535.method2424(16);
                }
                field535.method2641(0);
                int var2 = field535.field2059;
                field535.method2633(14);
                field535.method2432(field534.field2061, 0, field534.field2059);
                int var3 = field535.field2059;
                field535.method2429(class21.field353);
                field535.method2424(field584 ? 1 : 0);
                class116 var4 = field535;
                byte[] var5 = new byte[24];
                try {
                    class82.field1476.method591(0L);
                    class82.field1476.method593(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var20) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2432(var5, 0, 24);
                class127 var9 = new class127(Statics.field1068.method2971());
                Statics.field1068.method2970(var9);
                field535.method2432(var9.field2061, 0, var9.field2061.length);
                field535.method2633(Statics.field428.field2526);
                field535.method2633(Statics.field188.field2526);
                field535.method2633(Statics.field1375.field2526);
                field535.method2633(Statics.field1069.field2526);
                field535.method2633(Statics.field2058.field2526);
                field535.method2633(Statics.field936.field2526);
                field535.method2633(Statics.field758.field2526);
                field535.method2633(Statics.field1474.field2526);
                field535.method2633(Statics.field1377.field2526);
                field535.method2633(Statics.field95.field2526);
                field535.method2633(Statics.field2025.field2526);
                field535.method2633(Statics.field1376.field2526);
                field535.method2633(Statics.field191.field2526);
                field535.method2633(Statics.field2078.field2526);
                field535.method2633(Statics.field1856.field2526);
                field535.method2633(Statics.field2012.field2526);
                field535.method2454(var1, var3, field535.field2059);
                field535.method2551(field535.field2059 - var2);
                Statics.field1440.method1397(field535.field2061, 0, field535.field2059);
                field534.method2316(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field536.method2316(var1);
                field526 = 6;
            }
            if (field526 == 6 && Statics.field1440.method1395() > 0) {
                int var11 = Statics.field1440.method1398();
                if (var11 == 21 && field699 == 20) {
                    field526 = 7;
                } else if (var11 == 2) {
                    field526 = 9;
                } else if (var11 == 15 && field699 == 40) {
                    field534.field2059 = 0;
                    field536.field2059 = 0;
                    field538 = -1;
                    field542 = -1;
                    field543 = -1;
                    field544 = -1;
                    field537 = 0;
                    field563 = 0;
                    field511 = 0;
                    field520 = 0;
                    field622 = false;
                    field700 = 0;
                    field728 = 0;
                    for (int var12 = 0; var12 < field616.length; var12++) {
                        if (field616[var12] != null) {
                            field616[var12].field453 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field530.length; var13++) {
                        if (field530[var13] != null) {
                            field530[var13].field453 = -1;
                        }
                    }
                    class19.method1530();
                    method2341(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field685[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field528 < 1) {
                    field528++;
                    field526 = 0;
                } else {
                    method2362(var11);
                    return;
                }
            }
            if (field526 == 7 && Statics.field1440.method1395() > 0) {
                field529 = (Statics.field1440.method1398() + 3) * 60;
                field526 = 8;
            }
            if (field526 == 8) {
                field527 = 0;
                Statics.method3157(class134.field2258, class134.field2130, field529 / 60 + class134.field2131);
                if (--field529 <= 0) {
                    field526 = 0;
                }
            } else {
                if (field526 == 9 && Statics.field1440.method1395() >= 8) {
                    field663 = Statics.field1440.method1398();
                    field664 = Statics.field1440.method1398() == 1;
                    field732 = Statics.field1440.method1398();
                    field732 <<= 0x8;
                    field732 += Statics.field1440.method1398();
                    field623 = Statics.field1440.method1398();
                    Statics.field1440.method1396(field536.field2061, 0, 1);
                    field536.field2059 = 0;
                    field538 = field536.method2330();
                    Statics.field1440.method1396(field536.field2061, 0, 2);
                    field536.field2059 = 0;
                    field537 = field536.method2440();
                    if (field623 == 1) {
                        try {
                            class67.method1386(Statics.field492, "zap");
                        } catch (Throwable var19) {
                        }
                    } else {
                        try {
                            class67.method1386(Statics.field492, "unzap");
                        } catch (Throwable var18) {
                        }
                    }
                    field526 = 10;
                }
                if (field526 != 10) {
                    field527++;
                    if (field527 > 2000) {
                        if (field528 < 1) {
                            if (Statics.field886 == Statics.field282) {
                                Statics.field282 = Statics.field2479;
                            } else {
                                Statics.field282 = Statics.field886;
                            }
                            field528++;
                            field526 = 0;
                        } else {
                            method2362(-3);
                        }
                    }
                } else if (Statics.field1440.method1395() >= field537) {
                    field536.field2059 = 0;
                    Statics.field1440.method1396(field536.field2061, 0, field537);
                    method2696();
                    Statics.field2365 = -1;
                    method230(false);
                    field538 = -1;
                }
            }
        } catch (IOException var21) {
            if (field528 < 1) {
                if (Statics.field886 == Statics.field282) {
                    Statics.field282 = Statics.field2479;
                } else {
                    Statics.field282 = Statics.field886;
                }
                field528++;
                field526 = 0;
            } else {
                method2362(-2);
            }
        }
    }

    @ObfuscatedName("ef.k(I)V")
    public static void method2696() {
        field505 = 1L;
        field508 = -1;
        Statics.field1246.field265 = 0;
        Statics.field102 = true;
        field721 = true;
        field720 = -1L;
        class182.field2833 = new class177();
        field534.field2059 = 0;
        field536.field2059 = 0;
        field538 = -1;
        field542 = -1;
        field543 = -1;
        field544 = -1;
        field563 = 0;
        field511 = 0;
        field541 = 0;
        field497 = 0;
        field520 = 0;
        field622 = false;
        class77.field1437 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field710[var0] = null;
        }
        field671 = 0;
        field673 = 0;
        field621 = false;
        field736 = 0;
        field562 = (int) (Math.random() * 100.0D) - 50;
        field595 = (int) (Math.random() * 110.0D) - 55;
        field566 = (int) (Math.random() * 80.0D) - 40;
        field596 = (int) (Math.random() * 120.0D) - 60;
        field655 = (int) (Math.random() * 30.0D) - 20;
        field583 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field700 = 0;
        field723 = -1;
        field728 = 0;
        field729 = 0;
        field642 = 0;
        field695 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field616[var1] = null;
            field716[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field530[var2] = null;
        }
        Statics.field1431 = field616[2047] = new class3();
        field632.method3316();
        field633.method3316();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field630[var3][var4][var5] = null;
                }
            }
        }
        field631 = new class177();
        field620 = 0;
        field500 = 0;
        for (int var6 = 0; var6 < Statics.field1061; var6++) {
            class42 var7 = (class42) class42.field1064.method3260((long) var6);
            class42 var8;
            if (var7 == null) {
                byte[] var9 = Statics.field1062.method2987(16, var6);
                class42 var10 = new class42();
                if (var9 != null) {
                    var10.method930(new class127(var9));
                }
                class42.field1064.method3261(var10, (long) var6);
                var8 = var10;
            } else {
                var8 = var7;
            }
            if (var8 != null && var8.field1063 == 0) {
                class159.field2711[var6] = 0;
                class159.field2713[var6] = 0;
            }
        }
        for (int var12 = 0; var12 < field690.length; var12++) {
            field690[var12] = -1;
        }
        if (field656 != -1) {
            int var13 = field656;
            if (var13 != -1 && Statics.field2583[var13]) {
                Statics.field2584.method2999(var13);
                if (Statics.field2708[var13] != null) {
                    boolean var14 = true;
                    for (int var15 = 0; var15 < Statics.field2708[var13].length; var15++) {
                        if (Statics.field2708[var13][var15] != null) {
                            if (Statics.field2708[var13][var15].field2612 == 2) {
                                var14 = false;
                            } else {
                                Statics.field2708[var13][var15] = null;
                            }
                        }
                    }
                    if (var14) {
                        Statics.field2708[var13] = null;
                    }
                    Statics.field2583[var13] = false;
                }
            }
        }
        for (class4 var16 = (class4) field719.method3310(); var16 != null; var16 = (class4) field719.method3305()) {
            method52(var16, true);
        }
        field656 = -1;
        field719 = new class175(8);
        field660 = null;
        field622 = false;
        field520 = 0;
        field598.method3185((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var17 = 0; var17 < 8; var17++) {
            field627[var17] = null;
            field628[var17] = false;
        }
        class19.method1530();
        field638 = true;
        for (int var18 = 0; var18 < 100; var18++) {
            field685[var18] = true;
        }
        field499 = null;
        Statics.field1075 = 0;
        Statics.field2066 = null;
    }

    @ObfuscatedName("ds.o(II)V")
    public static void method2362(int arg0) {
        if (arg0 == -3) {
            Statics.method3157(class134.field2291, class134.field2279, class134.field2134);
        } else if (arg0 == -2) {
            Statics.method3157(class134.field2306, class134.field2250, class134.field2137);
        } else if (arg0 == -1) {
            Statics.method3157(class134.field2138, class134.field2139, class134.field2140);
        } else if (arg0 == 3) {
            Statics.method3157(class134.field2118, class134.field2142, class134.field2143);
        } else if (arg0 == 4) {
            Statics.method3157(class134.field2144, class134.field2145, class134.field2280);
        } else if (arg0 == 5) {
            Statics.method3157(class134.field2147, class134.field2148, class134.field2149);
        } else if (arg0 == 6) {
            Statics.method3157(class134.field2242, class134.field2286, class134.field2152);
        } else if (arg0 == 7) {
            Statics.method3157(class134.field2153, class134.field2154, class134.field2308);
        } else if (arg0 == 8) {
            Statics.method3157(class134.field2156, class134.field2157, class134.field2158);
        } else if (arg0 == 9) {
            Statics.method3157(class134.field2254, class134.field2160, class134.field2161);
        } else if (arg0 == 10) {
            Statics.method3157(class134.field2151, class134.field2163, class134.field2164);
        } else if (arg0 == 11) {
            Statics.method3157(class134.field2165, class134.field2166, class134.field2167);
        } else if (arg0 == 12) {
            Statics.method3157(class134.field2168, class134.field2169, class134.field2230);
        } else if (arg0 == 13) {
            Statics.method3157(class134.field2171, class134.field2172, class134.field2300);
        } else if (arg0 == 14) {
            Statics.method3157(class134.field2174, class134.field2175, class134.field2103);
        } else if (arg0 == 16) {
            Statics.method3157(class134.field2177, class134.field2178, class134.field2179);
        } else if (arg0 == 17) {
            Statics.method3157(class134.field2180, class134.field2181, class134.field2182);
        } else if (arg0 == 18) {
            Statics.method3157(class134.field2216, class134.field2184, class134.field2185);
        } else if (arg0 == 19) {
            Statics.method3157(class134.field2186, class134.field2187, class134.field2188);
        } else if (arg0 == 20) {
            Statics.method3157(class134.field2189, class134.field2190, class134.field2191);
        } else if (arg0 == 22) {
            Statics.method3157(class134.field2192, class134.field2193, class134.field2194);
        } else if (arg0 == 23) {
            Statics.method3157(class134.field2195, class134.field2226, class134.field2197);
        } else if (arg0 == 24) {
            Statics.method3157(class134.field2110, class134.field2101, class134.field2200);
        } else if (arg0 == 25) {
            Statics.method3157(class134.field2201, class134.field2129, class134.field2203);
        } else if (arg0 == 26) {
            Statics.method3157(class134.field2204, class134.field2205, class134.field2255);
        } else if (arg0 == 27) {
            Statics.method3157(class134.field2207, class134.field2247, class134.field2238);
        } else if (arg0 == 31) {
            Statics.method3157(class134.field2232, class134.field2217, class134.field2183);
        } else if (arg0 == 32) {
            Statics.method3157(class134.field2210, class134.field2220, class134.field2221);
        } else if (arg0 == 37) {
            Statics.method3157(class134.field2218, class134.field2223, class134.field2224);
        } else if (arg0 == 38) {
            Statics.method3157(class134.field2225, class134.field2276, class134.field2202);
        } else if (arg0 == 55) {
            Statics.method3157(class134.field2228, class134.field2267, class134.field2132);
        } else {
            Statics.method3157(class134.field2231, class134.field2209, class134.field2233);
        }
        method2341(10);
    }

    @ObfuscatedName("j.f(I)V")
    public static final void method127() {
        if (Statics.field1440 != null) {
            Statics.field1440.method1394();
            Statics.field1440 = null;
        }
        method2041();
        Statics.field672.method1880();
        for (int var0 = 0; var0 < 4; var0++) {
            field681[var0].method3224();
        }
        System.gc();
        class138.field2360 = 1;
        Statics.field1469 = null;
        Statics.field2362 = -1;
        Statics.field2361 = -1;
        Statics.field286 = 0;
        Statics.field427 = false;
        Statics.field2359 = 2;
        field688 = -1;
        field733 = false;
        class7.method1529();
        method2341(10);
    }

    @ObfuscatedName("cr.r(I)V")
    public static final void method2041() {
        class37.field958.method3264();
        class33.method1873();
        class36.field940.method3264();
        class32.field835.method3264();
        class32.field836.method3264();
        class32.field837.method3264();
        class32.field838.method3264();
        class31.method160();
        class40.method858();
        class34.method1422();
        class35.field921.method3264();
        class35.field929.method3264();
        class38.method47();
        class42.field1064.method3264();
        class163.field2739.method3264();
        class158.method2981();
        ((class110) Statics.field1811).method2219();
        class5.field88.method3264();
        Statics.field428.method3064();
        Statics.field188.method3064();
        Statics.field1069.method3064();
        Statics.field2058.method3064();
        Statics.field936.method3064();
        Statics.field758.method3064();
        Statics.field1474.method3064();
        Statics.field1377.method3064();
        Statics.field95.method3064();
        Statics.field2025.method3064();
        Statics.field1376.method3064();
        Statics.field191.method3064();
    }

    @ObfuscatedName("bv.s(B)V")
    public static final void method1433() {
        if (Statics.field219 != null) {
            Statics.field219.method1199();
        }
        if (Statics.field120 != null) {
            Statics.field120.method1199();
        }
    }

    @ObfuscatedName("cx.g(Lal;IIIS)V")
    public static void method2047(class34 arg0, int arg1, int arg2, int arg3) {
        if (field736 >= 50 || field735 == 0 || arg0.field906 == null || arg1 >= arg0.field906.length) {
            return;
        }
        int var4 = arg0.field906[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field737[field736] = var5;
        field738[field736] = var6;
        field739[field736] = 0;
        field741[field736] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field722[field736] = (var8 << 16) + (var9 << 8) + var7;
        field736++;
    }

    @ObfuscatedName("q.m(IIII)V")
    public static void method144(int arg0, int arg1, int arg2) {
        if (field498 == 0 || arg1 == 0 || field736 >= 50) {
            return;
        }
        field737[field736] = arg0;
        field738[field736] = arg1;
        field739[field736] = arg2;
        field741[field736] = null;
        field722[field736] = 0;
        field736++;
    }

    @ObfuscatedName("el.a(IIB)V")
    public static final void method2685(int arg0, int arg1) {
        if (field700 != 0 && field700 != 3 || class77.field1439 != 1) {
            return;
        }
        int var2 = class77.field1428 - 25 - arg0;
        int var3 = class77.field1429 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field596 + field583 & 0x7FF;
        int var5 = class104.field1814[var4];
        int var6 = class104.field1815[var4];
        int var7 = (field655 + 256) * var5 >> 8;
        int var8 = (field655 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field1431.field431 + var9 >> 7;
        int var12 = Statics.field1431.field440 - var10 >> 7;
        boolean var13 = method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field534.method2424(var2);
        field534.method2424(var3);
        field534.method2641(field583);
        field534.method2424(57);
        field534.method2424(field596);
        field534.method2424(field655);
        field534.method2424(89);
        field534.method2641(Statics.field1431.field431);
        field534.method2641(Statics.field1431.field440);
        field534.method2424(field557);
        field534.method2424(63);
    }

    @ObfuscatedName("f.n(S)V")
    public static final void method161() {
        int var0 = Statics.field354 * 128 + 64;
        int var1 = Statics.field390 * 128 + 64;
        int var2 = method33(var0, var1, Statics.field402) - Statics.field403;
        if (Statics.field2723 < var0) {
            Statics.field2723 += Statics.field269 * (var0 - Statics.field2723) / 1000 + Statics.field1485;
            if (Statics.field2723 > var0) {
                Statics.field2723 = var0;
            }
        }
        if (Statics.field2723 > var0) {
            Statics.field2723 -= Statics.field269 * (Statics.field2723 - var0) / 1000 + Statics.field1485;
            if (Statics.field2723 < var0) {
                Statics.field2723 = var0;
            }
        }
        if (Statics.field708 < var2) {
            Statics.field708 += Statics.field269 * (var2 - Statics.field708) / 1000 + Statics.field1485;
            if (Statics.field708 > var2) {
                Statics.field708 = var2;
            }
        }
        if (Statics.field708 > var2) {
            Statics.field708 -= Statics.field269 * (Statics.field708 - var2) / 1000 + Statics.field1485;
            if (Statics.field708 < var2) {
                Statics.field708 = var2;
            }
        }
        if (Statics.field1330 < var1) {
            Statics.field1330 += Statics.field269 * (var1 - Statics.field1330) / 1000 + Statics.field1485;
            if (Statics.field1330 > var1) {
                Statics.field1330 = var1;
            }
        }
        if (Statics.field1330 > var1) {
            Statics.field1330 -= Statics.field269 * (Statics.field1330 - var1) / 1000 + Statics.field1485;
            if (Statics.field1330 < var1) {
                Statics.field1330 = var1;
            }
        }
        int var3 = Statics.field764 * 128 + 64;
        int var4 = Statics.field67 * 128 + 64;
        int var5 = method33(var3, var4, Statics.field402) - Statics.field211;
        int var6 = var3 - Statics.field2723;
        int var7 = var5 - Statics.field708;
        int var8 = var4 - Statics.field1330;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1700 < var10) {
            Statics.field1700 += Statics.field86 * (var10 - Statics.field1700) / 1000 + Statics.field194;
            if (Statics.field1700 > var10) {
                Statics.field1700 = var10;
            }
        }
        if (Statics.field1700 > var10) {
            Statics.field1700 -= Statics.field86 * (Statics.field1700 - var10) / 1000 + Statics.field194;
            if (Statics.field1700 < var10) {
                Statics.field1700 = var10;
            }
        }
        int var12 = var11 - Statics.field276;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field276 += Statics.field86 * var12 / 1000 + Statics.field194;
            Statics.field276 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field276 -= Statics.field86 * -var12 / 1000 + Statics.field194;
            Statics.field276 &= 0x7FF;
        }
        int var13 = var11 - Statics.field276;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field276 = var11;
        }
    }

    @ObfuscatedName("eq.v(I)V")
    public static final void method2722() {
        for (int var0 = -1; var0 < field642; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field491[var0];
            }
            class3 var2 = field616[var1];
            if (var2 != null) {
                method123(var2, 1);
            }
        }
    }

    @ObfuscatedName("j.ar(Lar;II)V")
    public static final void method123(class27 arg0, int arg1) {
        if (arg0.field473 > field652) {
            method2346(arg0);
        } else if (arg0.field474 >= field652) {
            if (field652 == arg0.field474 || arg0.field459 == -1 || arg0.field462 != 0 || arg0.field490 + 1 > Statics.method31(arg0.field459).field900[arg0.field452]) {
                int var2 = arg0.field474 - arg0.field473;
                int var3 = field652 - arg0.field473;
                int var4 = arg0.field460 * 64 + arg0.field457 * 128;
                int var5 = arg0.field471 * 128 + arg0.field460 * 64;
                int var6 = arg0.field470 * 128 + arg0.field460 * 64;
                int var7 = arg0.field460 * 64 + arg0.field438 * 128;
                arg0.field431 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field440 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field485 = 0;
            if (arg0.field487 == 0) {
                arg0.field478 = 1024;
            }
            if (arg0.field487 == 1) {
                arg0.field478 = 1536;
            }
            if (arg0.field487 == 2) {
                arg0.field478 = 0;
            }
            if (arg0.field487 == 3) {
                arg0.field478 = 512;
            }
            arg0.field432 = arg0.field478;
        } else {
            method705(arg0);
        }
        if (arg0.field431 < 128 || arg0.field440 < 128 || arg0.field431 >= 13184 || arg0.field440 >= 13184) {
            arg0.field459 = -1;
            arg0.field435 = -1;
            arg0.field473 = 0;
            arg0.field474 = 0;
            arg0.field431 = arg0.field482[0] * 128 + arg0.field460 * 64;
            arg0.field440 = arg0.field472[0] * 128 + arg0.field460 * 64;
            arg0.method255();
        }
        if (Statics.field1431 == arg0 && (arg0.field431 < 1536 || arg0.field440 < 1536 || arg0.field431 >= 11776 || arg0.field440 >= 11776)) {
            arg0.field459 = -1;
            arg0.field435 = -1;
            arg0.field473 = 0;
            arg0.field474 = 0;
            arg0.field431 = arg0.field482[0] * 128 + arg0.field460 * 64;
            arg0.field440 = arg0.field472[0] * 128 + arg0.field460 * 64;
            arg0.method255();
        }
        if (arg0.field480 != 0) {
            if (arg0.field453 != -1 && arg0.field453 < 32768) {
                class25 var8 = field530[arg0.field453];
                if (var8 != null) {
                    int var9 = arg0.field431 - var8.field431;
                    int var10 = arg0.field440 - var8.field440;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field478 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field453 >= 32768) {
                int var11 = arg0.field453 - 32768;
                if (field732 == var11) {
                    var11 = 2047;
                }
                class3 var12 = field616[var11];
                if (var12 != null) {
                    int var13 = arg0.field431 - var12.field431;
                    int var14 = arg0.field440 - var12.field440;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field478 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field454 != 0 || arg0.field455 != 0) && (arg0.field481 == 0 || arg0.field485 > 0)) {
                int var15 = arg0.field431 - (arg0.field454 * 64 - Statics.field272 * 64 - Statics.field272 * 64);
                int var16 = arg0.field440 - (arg0.field455 * 64 - Statics.field977 * 64 - Statics.field977 * 64);
                if (var15 != 0 || var16 != 0) {
                    arg0.field478 = (int) (Math.atan2((double) var15, (double) var16) * 325.949D) & 0x7FF;
                }
                arg0.field454 = 0;
                arg0.field455 = 0;
            }
            int var17 = arg0.field478 - arg0.field432 & 0x7FF;
            if (var17 == 0) {
                arg0.field479 = 0;
            } else {
                arg0.field479++;
                if (var17 > 1024) {
                    arg0.field432 -= arg0.field480;
                    boolean var18 = true;
                    if (var17 < arg0.field480 || var17 > 2048 - arg0.field480) {
                        arg0.field432 = arg0.field478;
                        var18 = false;
                    }
                    if (arg0.field443 == arg0.field434 && (arg0.field479 > 25 || var18)) {
                        if (arg0.field436 == -1) {
                            arg0.field434 = arg0.field484;
                        } else {
                            arg0.field434 = arg0.field436;
                        }
                    }
                } else {
                    arg0.field432 += arg0.field480;
                    boolean var19 = true;
                    if (var17 < arg0.field480 || var17 > 2048 - arg0.field480) {
                        arg0.field432 = arg0.field478;
                        var19 = false;
                    }
                    if (arg0.field443 == arg0.field434 && (arg0.field479 > 25 || var19)) {
                        if (arg0.field437 == -1) {
                            arg0.field434 = arg0.field484;
                        } else {
                            arg0.field434 = arg0.field437;
                        }
                    }
                }
                arg0.field432 &= 0x7FF;
            }
        }
        method2889(arg0);
    }

    @ObfuscatedName("dj.ak(Lar;B)V")
    public static final void method2346(class27 arg0) {
        int var1 = arg0.field473 - field652;
        int var2 = arg0.field460 * 64 + arg0.field457 * 128;
        int var3 = arg0.field471 * 128 + arg0.field460 * 64;
        arg0.field431 += (var2 - arg0.field431) / var1;
        arg0.field440 += (var3 - arg0.field440) / var1;
        arg0.field485 = 0;
        if (arg0.field487 == 0) {
            arg0.field478 = 1024;
        }
        if (arg0.field487 == 1) {
            arg0.field478 = 1536;
        }
        if (arg0.field487 == 2) {
            arg0.field478 = 0;
        }
        if (arg0.field487 == 3) {
            arg0.field478 = 512;
        }
    }

    @ObfuscatedName("aq.ap(Lar;B)V")
    public static final void method705(class27 arg0) {
        arg0.field434 = arg0.field443;
        if (arg0.field481 == 0) {
            arg0.field485 = 0;
            return;
        }
        if (arg0.field459 != -1 && arg0.field462 == 0) {
            class34 var1 = Statics.method31(arg0.field459);
            if (arg0.field483 > 0 && var1.field914 == 0) {
                arg0.field485++;
                return;
            }
            if (arg0.field483 <= 0 && var1.field904 == 0) {
                arg0.field485++;
                return;
            }
        }
        int var2 = arg0.field431;
        int var3 = arg0.field440;
        int var4 = arg0.field482[arg0.field481 - 1] * 128 + arg0.field460 * 64;
        int var5 = arg0.field472[arg0.field481 - 1] * 128 + arg0.field460 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field431 = var4;
            arg0.field440 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field478 = 1280;
            } else if (var3 > var5) {
                arg0.field478 = 1792;
            } else {
                arg0.field478 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field478 = 768;
            } else if (var3 > var5) {
                arg0.field478 = 256;
            } else {
                arg0.field478 = 512;
            }
        } else if (var3 < var5) {
            arg0.field478 = 1024;
        } else if (var3 > var5) {
            arg0.field478 = 0;
        }
        int var6 = arg0.field478 - arg0.field432 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field439;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field484;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field441;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field461;
        }
        if (var7 == -1) {
            var7 = arg0.field484;
        }
        arg0.field434 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field410.field828;
        }
        if (var9) {
            if (arg0.field478 != arg0.field432 && arg0.field453 == -1 && arg0.field480 != 0) {
                var8 = 2;
            }
            if (arg0.field481 > 2) {
                var8 = 6;
            }
            if (arg0.field481 > 3) {
                var8 = 8;
            }
            if (arg0.field485 > 0 && arg0.field481 > 1) {
                var8 = 8;
                arg0.field485--;
            }
        } else {
            if (arg0.field481 > 1) {
                var8 = 6;
            }
            if (arg0.field481 > 2) {
                var8 = 8;
            }
            if (arg0.field485 > 0 && arg0.field481 > 1) {
                var8 = 8;
                arg0.field485--;
            }
        }
        if (arg0.field469[arg0.field481 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field484 == arg0.field434 && arg0.field442 != -1) {
            arg0.field434 = arg0.field442;
        }
        if (var2 < var4) {
            arg0.field431 += var8;
            if (arg0.field431 > var4) {
                arg0.field431 = var4;
            }
        } else if (var2 > var4) {
            arg0.field431 -= var8;
            if (arg0.field431 < var4) {
                arg0.field431 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field440 += var8;
            if (arg0.field440 > var5) {
                arg0.field440 = var5;
            }
        } else if (var3 > var5) {
            arg0.field440 -= var8;
            if (arg0.field440 < var5) {
                arg0.field440 = var5;
            }
        }
        if (arg0.field431 == var4 && arg0.field440 == var5) {
            arg0.field481--;
            if (arg0.field483 > 0) {
                arg0.field483--;
            }
        }
    }

    @ObfuscatedName("ep.aa(Lar;B)V")
    public static final void method2889(class27 arg0) {
        arg0.field433 = false;
        if (arg0.field434 != -1) {
            class34 var1 = Statics.method31(arg0.field434);
            if (var1 == null || var1.field903 == null) {
                arg0.field434 = -1;
            } else {
                arg0.field463++;
                if (arg0.field464 < var1.field903.length && arg0.field463 > var1.field900[arg0.field464]) {
                    arg0.field463 = 1;
                    arg0.field464++;
                    method2047(var1, arg0.field464, arg0.field431, arg0.field440);
                }
                if (arg0.field464 >= var1.field903.length) {
                    arg0.field463 = 0;
                    arg0.field464 = 0;
                    method2047(var1, arg0.field464, arg0.field431, arg0.field440);
                }
            }
        }
        if (arg0.field435 != -1 && field652 >= arg0.field467) {
            if (arg0.field486 < 0) {
                arg0.field486 = 0;
            }
            int var2 = class35.method711(arg0.field435).field925;
            if (var2 == -1) {
                arg0.field435 = -1;
            } else {
                class34 var3 = Statics.method31(var2);
                if (var3 == null || var3.field903 == null) {
                    arg0.field435 = -1;
                } else {
                    arg0.field466++;
                    if (arg0.field486 < var3.field903.length && arg0.field466 > var3.field900[arg0.field486]) {
                        arg0.field466 = 1;
                        arg0.field486++;
                        method2047(var3, arg0.field486, arg0.field431, arg0.field440);
                    }
                    if (arg0.field486 >= var3.field903.length && (arg0.field486 < 0 || arg0.field486 >= var3.field903.length)) {
                        arg0.field435 = -1;
                    }
                }
            }
        }
        if (arg0.field459 != -1 && arg0.field462 <= 1) {
            class34 var4 = Statics.method31(arg0.field459);
            if (var4.field914 == 1 && arg0.field483 > 0 && arg0.field473 <= field652 && arg0.field474 < field652) {
                arg0.field462 = 1;
                return;
            }
        }
        if (arg0.field459 != -1 && arg0.field462 == 0) {
            class34 var5 = Statics.method31(arg0.field459);
            if (var5 == null || var5.field903 == null) {
                arg0.field459 = -1;
            } else {
                arg0.field490++;
                if (arg0.field452 < var5.field903.length && arg0.field490 > var5.field900[arg0.field452]) {
                    arg0.field490 = 1;
                    arg0.field452++;
                    method2047(var5, arg0.field452, arg0.field431, arg0.field440);
                }
                if (arg0.field452 >= var5.field903.length) {
                    arg0.field452 -= var5.field907;
                    arg0.field456++;
                    if (arg0.field456 >= var5.field913) {
                        arg0.field459 = -1;
                    } else if (arg0.field452 >= 0 && arg0.field452 < var5.field903.length) {
                        method2047(var5, arg0.field452, arg0.field431, arg0.field440);
                    } else {
                        arg0.field459 = -1;
                    }
                }
                arg0.field433 = var5.field910;
            }
        }
        if (arg0.field462 > 0) {
            arg0.field462--;
        }
    }

    @ObfuscatedName("bz.av(Lc;III)V")
    public static void method1418(class3 arg0, int arg1, int arg2) {
        if (arg0.field459 == arg1 && arg1 != -1) {
            int var3 = Statics.method31(arg1).field916;
            if (var3 == 1) {
                arg0.field452 = 0;
                arg0.field490 = 0;
                arg0.field462 = arg2;
                arg0.field456 = 0;
            }
            if (var3 == 2) {
                arg0.field456 = 0;
            }
        } else if (arg1 == -1 || arg0.field459 == -1 || Statics.method31(arg1).field918 >= Statics.method31(arg0.field459).field918) {
            arg0.field459 = arg1;
            arg0.field452 = 0;
            arg0.field490 = 0;
            arg0.field462 = arg2;
            arg0.field456 = 0;
            arg0.field483 = arg0.field481;
        }
    }

    @ObfuscatedName("z.aq(S)V")
    public static final void method118() {
        if (!field622) {
            field644[0] = class134.field2312;
            field645[0] = "";
            field577[0] = 1006;
            field520 = 1;
        }
        if (field656 != -1) {
            method264(field656);
        }
        for (int var0 = 0; var0 < field743; var0++) {
            if (field685[var0]) {
                field650[var0] = true;
            }
            field701[var0] = field685[var0];
            field685[var0] = false;
        }
        field698 = field652;
        field646 = -1;
        field503 = -1;
        Statics.field409 = null;
        if (field656 != -1) {
            field743 = 0;
            method2312(field656, 0, 0, 765, 503, 0, 0, -1);
        }
        class89.method1838();
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field520 - 1; var2++) {
                if (field577[var2] < 1000 && field577[var2 + 1] > 1000) {
                    String var3 = field645[var2];
                    field645[var2] = field645[var2 + 1];
                    field645[var2 + 1] = var3;
                    String var4 = field644[var2];
                    field644[var2] = field644[var2 + 1];
                    field644[var2 + 1] = var4;
                    int var5 = field577[var2];
                    field577[var2] = field577[var2 + 1];
                    field577[var2 + 1] = var5;
                    int var6 = field640[var2];
                    field640[var2] = field640[var2 + 1];
                    field640[var2 + 1] = var6;
                    int var7 = field507[var2];
                    field507[var2] = field507[var2 + 1];
                    field507[var2 + 1] = var7;
                    int var8 = field643[var2];
                    field643[var2] = field643[var2 + 1];
                    field643[var2 + 1] = var8;
                    var1 = false;
                }
            }
        }
        if (field622) {
            int var12 = Statics.field842;
            int var13 = Statics.field1785;
            int var14 = Statics.field12;
            int var15 = Statics.field288;
            int var16 = 6116423;
            class89.method1800(var12, var13, var14, var15, var16);
            class89.method1800(var12 + 1, var13 + 1, var14 - 2, 16, 0);
            class89.method1802(var12 + 1, var13 + 18, var14 - 2, var15 - 19, 0);
            Statics.field787.method3442(class134.field2241, var12 + 3, var13 + 14, var16, -1);
            int var17 = class77.field1419;
            int var18 = class77.field1422;
            for (int var19 = 0; var19 < field520; var19++) {
                int var20 = (field520 - 1 - var19) * 15 + var13 + 31;
                int var21 = 16777215;
                if (var17 > var12 && var17 < var12 + var14 && var18 > var20 - 13 && var18 < var20 + 3) {
                    var21 = 16776960;
                }
                Statics.field787.method3442(Statics.method163(var19), var12 + 3, var20, var21, 0);
            }
            method1638(Statics.field842, Statics.field1785, Statics.field12, Statics.field288);
        } else if (field646 != -1) {
            int var9 = field646;
            int var10 = field503;
            if (field520 >= 2 || field673 != 0 || field621) {
                String var11;
                if (field673 == 1 && field520 < 2) {
                    var11 = class134.field2239 + class134.field2249 + field549 + " " + class2.field27;
                } else if (field621 && field520 < 2) {
                    var11 = field581 + class134.field2249 + field730 + " " + class2.field27;
                } else {
                    var11 = Statics.method163(field520 - 1);
                }
                if (field520 > 2) {
                    var11 = var11 + class2.method2042(16777215) + " " + '/' + " " + (field520 - 2) + class134.field2243;
                }
                Statics.field787.method3401(var11, var9 + 4, var10 + 15, 16777215, 0, field652 / 1000);
            }
        }
        if (field706 == 3) {
            for (int var22 = 0; var22 < field743; var22++) {
                if (field701[var22]) {
                    class89.method1840(field606[var22], field703[var22], field547[var22], field705[var22], 16711935, 128);
                } else if (field650[var22]) {
                    class89.method1840(field606[var22], field703[var22], field547[var22], field705[var22], 16711680, 128);
                }
            }
        }
        class7.method2833(Statics.field402, Statics.field1431.field431, Statics.field1431.field440, field574);
        field574 = 0;
    }

    @ObfuscatedName("dq.an(Ljava/lang/String;ZI)V")
    public static final void method2313(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field130.method3391(arg0, 250);
        int var6 = Statics.field130.method3414(arg0, 250) * 13;
        class89.method1800(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1802(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field130.method3454(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method234(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1638(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field775.getGraphics();
            Statics.field83.method1611(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field775.repaint();
        }
    }

    @ObfuscatedName("k.al(IIIIB)V")
    public static final void method151(int arg0, int arg1, int arg2, int arg3) {
        class89.method1794(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2142();
        field600++;
        method861(true);
        method2695(true);
        method861(false);
        method2695(false);
        for (class10 var4 = (class10) field632.method3345(); var4 != null; var4 = (class10) field632.method3324()) {
            if (Statics.field402 != var4.field185 || field652 > var4.field169) {
                var4.method3361();
            } else if (field652 >= var4.field175) {
                if (var4.field189 > 0) {
                    class25 var5 = field530[var4.field189 - 1];
                    if (var5 != null && var5.field431 >= 0 && var5.field431 < 13312 && var5.field440 >= 0 && var5.field440 < 13312) {
                        var4.method120(var5.field431, var5.field440, method33(var5.field431, var5.field440, var4.field185) - var4.field172, field652);
                    }
                }
                if (var4.field189 < 0) {
                    int var6 = -var4.field189 - 1;
                    class3 var7;
                    if (field732 == var6) {
                        var7 = Statics.field1431;
                    } else {
                        var7 = field616[var6];
                    }
                    if (var7 != null && var7.field431 >= 0 && var7.field431 < 13312 && var7.field440 >= 0 && var7.field440 < 13312) {
                        var4.method120(var7.field431, var7.field440, method33(var7.field431, var7.field440, var4.field185) - var4.field172, field652);
                    }
                }
                var4.method113(field574);
                Statics.field672.method1891(Statics.field402, (int) var4.field174, (int) var4.field168, (int) var4.field176, 60, var4, var4.field182, -1, false);
            }
        }
        method8();
        if (!field742) {
            int var8 = field734;
            if (field552 / 256 > var8) {
                var8 = field552 / 256;
            }
            if (field641[4] && field745[4] + 128 > var8) {
                var8 = field745[4] + 128;
            }
            int var9 = field583 + field566 & 0x7FF;
            int var10 = Statics.field2716;
            int var11 = method33(Statics.field1431.field431, Statics.field1431.field440, Statics.field402) - 50;
            int var12 = Statics.field370;
            int var13 = var8 * 3 + 600;
            int var14 = 2048 - var8 & 0x7FF;
            int var15 = 2048 - var9 & 0x7FF;
            int var16 = 0;
            int var17 = 0;
            int var18 = var13;
            if (var14 != 0) {
                int var19 = class104.field1814[var14];
                int var20 = class104.field1815[var14];
                int var21 = var17 * var20 - var13 * var19 >> 16;
                var18 = var17 * var19 + var13 * var20 >> 16;
                var17 = var21;
            }
            if (var15 != 0) {
                int var22 = class104.field1814[var15];
                int var23 = class104.field1815[var15];
                int var24 = var16 * var23 + var18 * var22 >> 16;
                var18 = var18 * var23 - var16 * var22 >> 16;
                var16 = var24;
            }
            Statics.field2723 = var10 - var16;
            Statics.field708 = var11 - var17;
            Statics.field1330 = var12 - var18;
            Statics.field1700 = var8;
            Statics.field276 = var9;
        }
        int var37;
        if (field742) {
            var37 = method839();
        } else {
            int var25;
            if (Statics.field1002.field208) {
                var25 = Statics.field402;
            } else {
                int var26 = 3;
                if (Statics.field1700 < 310) {
                    int var27 = Statics.field2723 >> 7;
                    int var28 = Statics.field1330 >> 7;
                    int var29 = Statics.field1431.field431 >> 7;
                    int var30 = Statics.field1431.field440 >> 7;
                    if ((class9.field135[Statics.field402][var27][var28] & 0x4) != 0) {
                        var26 = Statics.field402;
                    }
                    int var31;
                    if (var29 > var27) {
                        var31 = var29 - var27;
                    } else {
                        var31 = var27 - var29;
                    }
                    int var32;
                    if (var30 > var28) {
                        var32 = var30 - var28;
                    } else {
                        var32 = var28 - var30;
                    }
                    if (var31 > var32) {
                        int var33 = var32 * 65536 / var31;
                        int var34 = 32768;
                        while (var27 != var29) {
                            if (var27 < var29) {
                                var27++;
                            } else if (var27 > var29) {
                                var27--;
                            }
                            if ((class9.field135[Statics.field402][var27][var28] & 0x4) != 0) {
                                var26 = Statics.field402;
                            }
                            var34 += var33;
                            if (var34 >= 65536) {
                                var34 -= 65536;
                                if (var28 < var30) {
                                    var28++;
                                } else if (var28 > var30) {
                                    var28--;
                                }
                                if ((class9.field135[Statics.field402][var27][var28] & 0x4) != 0) {
                                    var26 = Statics.field402;
                                }
                            }
                        }
                    } else {
                        int var35 = var31 * 65536 / var32;
                        int var36 = 32768;
                        while (var28 != var30) {
                            if (var28 < var30) {
                                var28++;
                            } else if (var28 > var30) {
                                var28--;
                            }
                            if ((class9.field135[Statics.field402][var27][var28] & 0x4) != 0) {
                                var26 = Statics.field402;
                            }
                            var36 += var35;
                            if (var36 >= 65536) {
                                var36 -= 65536;
                                if (var27 < var29) {
                                    var27++;
                                } else if (var27 > var29) {
                                    var27--;
                                }
                                if ((class9.field135[Statics.field402][var27][var28] & 0x4) != 0) {
                                    var26 = Statics.field402;
                                }
                            }
                        }
                    }
                }
                if ((class9.field135[Statics.field402][Statics.field1431.field431 >> 7][Statics.field1431.field440 >> 7] & 0x4) != 0) {
                    var26 = Statics.field402;
                }
                var25 = var26;
            }
            var37 = var25;
        }
        int var38 = Statics.field2723;
        int var39 = Statics.field708;
        int var40 = Statics.field1330;
        int var41 = Statics.field1700;
        int var42 = Statics.field276;
        for (int var43 = 0; var43 < 5; var43++) {
            if (field641[var43]) {
                int var44 = (int) (Math.random() * (double) (field744[var43] * 2 + 1) - (double) field744[var43] + Math.sin((double) field746[var43] / 100.0D * (double) field747[var43]) * (double) field745[var43]);
                if (var43 == 0) {
                    Statics.field2723 += var44;
                }
                if (var43 == 1) {
                    Statics.field708 += var44;
                }
                if (var43 == 2) {
                    Statics.field1330 += var44;
                }
                if (var43 == 3) {
                    Statics.field276 = Statics.field276 + var44 & 0x7FF;
                }
                if (var43 == 4) {
                    Statics.field1700 += var44;
                    if (Statics.field1700 < 128) {
                        Statics.field1700 = 128;
                    }
                    if (Statics.field1700 > 383) {
                        Statics.field1700 = 383;
                    }
                }
            }
        }
        int var45 = class77.field1419;
        int var46 = class77.field1422;
        if (var45 >= arg0 && var45 < arg0 + arg2 && var46 >= arg1 && var46 < arg1 + arg3) {
            class112.field1933 = true;
            class112.field1936 = 0;
            class112.field1934 = class77.field1419 - arg0;
            class112.field1910 = class77.field1422 - arg1;
        } else {
            class112.field1933 = false;
            class112.field1936 = 0;
        }
        method1433();
        class89.method1800(arg0, arg1, arg2, arg3, 0);
        method1433();
        Statics.field672.method1882(Statics.field2723, Statics.field708, Statics.field1330, Statics.field1700, Statics.field276, var37);
        method1433();
        Statics.field672.method1894();
        method1531(arg0, arg1, arg2, arg3);
        method3370(arg0, arg1);
        ((class110) Statics.field1811).method2220(field574);
        method67(arg0, arg1, arg2, arg3);
        Statics.field2723 = var38;
        Statics.field708 = var39;
        Statics.field1330 = var40;
        Statics.field1700 = var41;
        Statics.field276 = var42;
        if (field638) {
            byte var47 = 0;
            int var48 = class153.field2536 + class153.field2534 + var47;
            if (var48 == 0) {
                field638 = false;
            }
        }
        if (field638) {
            class89.method1800(arg0, arg1, arg2, arg3, 0);
            method2313(class134.field2105, false);
        }
        if (!field638 && !field622 && var45 >= arg0 && var45 < arg0 + arg2 && var46 >= arg1 && var46 < arg1 + arg3) {
            method30(var45, var46, arg0, arg1);
        }
    }

    @ObfuscatedName("ac.ax(ZB)V")
    public static final void method861(boolean arg0) {
        if (Statics.field1431.field431 >> 7 == field728 && Statics.field1431.field440 >> 7 == field729) {
            field728 = 0;
        }
        int var1 = field642;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1431;
                var4 = 33538048;
            } else {
                var3 = field616[field491[var2]];
                var4 = field491[var2] << 14;
            }
            if (var3 != null && var3.method21()) {
                var3.field41 = false;
                if ((field584 && field642 > 50 || field642 > 200) && !arg0 && var3.field443 == var3.field434) {
                    var3.field41 = true;
                }
                int var5 = var3.field431 >> 7;
                int var6 = var3.field440 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field48 == null || field652 < var3.field44 || field652 >= var3.field57) {
                        if ((var3.field431 & 0x7F) == 64 && (var3.field440 & 0x7F) == 64) {
                            if (field600 == field615[var5][var6]) {
                                continue;
                            }
                            field615[var5][var6] = field600;
                        }
                        var3.field42 = method33(var3.field431, var3.field440, Statics.field402);
                        Statics.field672.method1891(Statics.field402, var3.field431, var3.field440, var3.field42, 60, var3, var3.field432, var4, var3.field433);
                    } else {
                        var3.field41 = false;
                        var3.field42 = method33(var3.field431, var3.field440, Statics.field402);
                        Statics.field672.method1991(Statics.field402, var3.field431, var3.field440, var3.field42, 60, var3, var3.field432, var4, var3.field49, var3.field50, var3.field53, var3.field56);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ef.as(ZI)V")
    public static final void method2695(boolean arg0) {
        for (int var1 = 0; var1 < field695; var1++) {
            class25 var2 = field530[field532[var1]];
            int var3 = (field532[var1] << 14) + 536870912;
            if (var2 != null && var2.method21() && var2.field410.field827 == arg0 && var2.field410.method635()) {
                int var4 = var2.field431 >> 7;
                int var5 = var2.field440 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field460 == 1 && (var2.field431 & 0x7F) == 64 && (var2.field440 & 0x7F) == 64) {
                        if (field600 == field615[var4][var5]) {
                            continue;
                        }
                        field615[var4][var5] = field600;
                    }
                    if (!var2.field410.field831) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field672.method1891(Statics.field402, var2.field431, var2.field440, method33(var2.field431 + (var2.field460 * 64 - 64), var2.field440 + (var2.field460 * 64 - 64), Statics.field402), var2.field460 * 64 - 64 + 60, var2, var2.field432, var3, var2.field433);
                }
            }
        }
    }

    @ObfuscatedName("t.ah(I)V")
    public static final void method8() {
        for (class20 var0 = (class20) field633.method3345(); var0 != null; var0 = (class20) field633.method3324()) {
            if (Statics.field402 != var0.field306 || var0.field313) {
                var0.method3361();
            } else if (field652 >= var0.field305) {
                var0.method181(field574);
                if (var0.field313) {
                    var0.method3361();
                } else {
                    Statics.field672.method1891(var0.field306, var0.field304, var0.field318, var0.field309, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ae.ae(B)I")
    public static final int method839() {
        if (Statics.field1002.field208) {
            return Statics.field402;
        } else {
            int var0 = method33(Statics.field2723, Statics.field1330, Statics.field402);
            return var0 - Statics.field708 >= 800 || (class9.field135[Statics.field402][Statics.field2723 >> 7][Statics.field1330 >> 7] & 0x4) == 0 ? 3 : Statics.field402;
        }
    }

    @ObfuscatedName("fv.ac(III)V")
    public static final void method3370(int arg0, int arg1) {
        if (field497 == 2) {
            method3066((field709 - Statics.field272 << 7) + field518, (field516 - Statics.field977 << 7) + field519, field517 * 2);
            if (field601 > -1 && field652 % 20 < 10) {
                Statics.field1311[0].method1696(field601 + arg0 - 12, field602 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bg.af(IIIII)V")
    public static final void method1531(int arg0, int arg1, int arg2, int arg3) {
        field550 = 0;
        for (int var4 = -1; var4 < field695 + field642; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field1431;
            } else if (var4 < field642) {
                var5 = field616[field491[var4]];
            } else {
                var5 = field530[field532[var4 - field642]];
            }
            if (var5 != null && var5.method21()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field410;
                    if (var6.field822 != null) {
                        var6 = var6.method634();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field642) {
                    class31 var9 = ((class25) var5).field410;
                    if (var9.field822 != null) {
                        var9 = var9.method634();
                    }
                    if (var9.field817 >= 0 && var9.field817 < Statics.field11.length) {
                        method6(var5, var5.field477 + 15);
                        if (field601 > -1) {
                            Statics.field11[var9.field817].method1696(field601 + arg0 - 12, field602 + arg1 - 30);
                        }
                    }
                    if (field497 == 1 && field647 == field532[var4 - field642] && field652 % 20 < 10) {
                        method6(var5, var5.field477 + 15);
                        if (field601 > -1) {
                            Statics.field1311[0].method1696(field601 + arg0 - 12, field602 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field38 != -1 || var8.field36 != -1) {
                        method6(var5, var5.field477 + 15);
                        if (field601 > -1) {
                            if (var8.field38 != -1) {
                                Statics.field1362[var8.field38].method1696(field601 + arg0 - 12, field602 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field36 != -1) {
                                Statics.field11[var8.field36].method1696(field601 + arg0 - 12, field602 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field497 == 10 && field514 == field491[var4]) {
                        method6(var5, var5.field477 + 15);
                        if (field601 > -1) {
                            Statics.field1311[1].method1696(field601 + arg0 - 12, field602 + arg1 - var7);
                        }
                    }
                }
                if (var5.field458 != null) {
                    label326: {
                        if (var4 < field642 && field713 != 0 && field713 != 3) {
                            if (field713 != 1) {
                                break label326;
                            }
                            String var10 = ((class3) var5).field51;
                            boolean var11;
                            if (var10 == null) {
                                var11 = false;
                            } else {
                                String var12 = class148.method1252(var10, Statics.field533);
                                int var13 = 0;
                                while (true) {
                                    if (var13 >= field500) {
                                        if (var10.equalsIgnoreCase(class148.method1252(Statics.field1431.field51, Statics.field533))) {
                                            var11 = true;
                                        } else {
                                            var11 = false;
                                        }
                                        break;
                                    }
                                    if (var12.equalsIgnoreCase(class148.method1252(field750[var13].field381, Statics.field533))) {
                                        var11 = true;
                                        break;
                                    }
                                    var13++;
                                }
                            }
                            if (!var11) {
                                break label326;
                            }
                        }
                        method6(var5, var5.field477);
                        if (field601 > -1 && field550 < field683) {
                            field594[field550] = Statics.field787.method3389(var5.field458) / 2;
                            field593[field550] = Statics.field787.field2841;
                            field591[field550] = field601;
                            field592[field550] = field602;
                            field567[field550] = var5.field445;
                            field740[field550] = var5.field446;
                            field597[field550] = var5.field444;
                            field727[field550] = var5.field458;
                            field550++;
                        }
                    }
                }
                if (var5.field450 > field652) {
                    method6(var5, var5.field477 + 15);
                    if (field601 > -1) {
                        int var14 = var5.field451 * 30 / var5.field465;
                        if (var14 > 30) {
                            var14 = 30;
                        }
                        class89.method1800(field601 + arg0 - 15, field602 + arg1 - 3, var14, 5, 65280);
                        class89.method1800(field601 + arg0 - 15 + var14, field602 + arg1 - 3, 30 - var14, 5, 16711680);
                    }
                }
                for (int var15 = 0; var15 < 4; var15++) {
                    if (var5.field449[var15] > field652) {
                        method6(var5, var5.field477 / 2);
                        if (field601 > -1) {
                            if (var15 == 1) {
                                field602 -= 20;
                            }
                            if (var15 == 2) {
                                field601 -= 15;
                                field602 -= 10;
                            }
                            if (var15 == 3) {
                                field601 += 15;
                                field602 -= 10;
                            }
                            Statics.field1341[var5.field448[var15]].method1696(field601 + arg0 - 12, field602 + arg1 - 12);
                            Statics.field2035.method3438(Integer.toString(var5.field447[var15]), field601 + arg0 - 1, field602 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var16 = 0; var16 < field550; var16++) {
            int var17 = field591[var16];
            int var18 = field592[var16];
            int var19 = field594[var16];
            int var20 = field593[var16];
            boolean var21 = true;
            while (var21) {
                var21 = false;
                for (int var22 = 0; var22 < var16; var22++) {
                    if (var18 + 2 > field592[var22] - field593[var22] && var18 - var20 < field592[var22] + 2 && var17 - var19 < field594[var22] + field591[var22] && var17 + var19 > field591[var22] - field594[var22] && field592[var22] - field593[var22] < var18) {
                        var18 = field592[var22] - field593[var22];
                        var21 = true;
                    }
                }
            }
            field601 = field591[var16];
            field602 = field592[var16] = var18;
            String var23 = field727[var16];
            if (field658 == 0) {
                int var24 = 16776960;
                if (field567[var16] < 6) {
                    var24 = field712[field567[var16]];
                }
                if (field567[var16] == 6) {
                    var24 = field600 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field567[var16] == 7) {
                    var24 = field600 % 20 < 10 ? 255 : 65535;
                }
                if (field567[var16] == 8) {
                    var24 = field600 % 20 < 10 ? 45056 : 8454016;
                }
                if (field567[var16] == 9) {
                    int var25 = 150 - field597[var16];
                    if (var25 < 50) {
                        var24 = var25 * 1280 + 16711680;
                    } else if (var25 < 100) {
                        var24 = 16776960 - (var25 - 50) * 327680;
                    } else if (var25 < 150) {
                        var24 = (var25 - 100) * 5 + 65280;
                    }
                }
                if (field567[var16] == 10) {
                    int var26 = 150 - field597[var16];
                    if (var26 < 50) {
                        var24 = var26 * 5 + 16711680;
                    } else if (var26 < 100) {
                        var24 = 16711935 - (var26 - 50) * 327680;
                    } else if (var26 < 150) {
                        var24 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
                    }
                }
                if (field567[var16] == 11) {
                    int var27 = 150 - field597[var16];
                    if (var27 < 50) {
                        var24 = 16777215 - var27 * 327685;
                    } else if (var27 < 100) {
                        var24 = (var27 - 50) * 327685 + 65280;
                    } else if (var27 < 150) {
                        var24 = 16777215 - (var27 - 100) * 327680;
                    }
                }
                if (field740[var16] == 0) {
                    Statics.field787.method3438(var23, field601 + arg0, field602 + arg1, var24, 0);
                }
                if (field740[var16] == 1) {
                    Statics.field787.method3398(var23, field601 + arg0, field602 + arg1, var24, 0, field600);
                }
                if (field740[var16] == 2) {
                    Statics.field787.method3399(var23, field601 + arg0, field602 + arg1, var24, 0, field600);
                }
                if (field740[var16] == 3) {
                    Statics.field787.method3393(var23, field601 + arg0, field602 + arg1, var24, 0, field600, 150 - field597[var16]);
                }
                if (field740[var16] == 4) {
                    int var28 = (150 - field597[var16]) * (Statics.field787.method3389(var23) + 100) / 150;
                    class89.method1795(field601 + arg0 - 50, arg1, field601 + arg0 + 50, arg1 + arg3);
                    Statics.field787.method3442(var23, field601 + arg0 + 50 - var28, field602 + arg1, var24, 0);
                    class89.method1794(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field740[var16] == 5) {
                    int var29 = 150 - field597[var16];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    class89.method1795(arg0, field602 + arg1 - Statics.field787.field2841 - 1, arg0 + arg2, field602 + arg1 + 5);
                    Statics.field787.method3438(var23, field601 + arg0, field602 + arg1 + var30, var24, 0);
                    class89.method1794(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field787.method3438(var23, field601 + arg0, field602 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("o.aj(I)V")
    public static final void method157() {
        field696 = 0;
        int var0 = (Statics.field1431.field431 >> 7) + Statics.field272;
        int var1 = (Statics.field1431.field440 >> 7) + Statics.field977;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field696 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field696 = 1;
        }
        if (field696 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field696 = 0;
        }
    }

    @ObfuscatedName("y.ao(IIIII)V")
    public static final void method67(int arg0, int arg1, int arg2, int arg3) {
        if (field665 == 1) {
            Statics.field1410[field684 / 100].method1696(field603 - 8, field604 - 8);
        }
        if (field665 == 2) {
            Statics.field1410[field684 / 100 + 4].method1696(field603 - 8, field604 - 8);
        }
        method157();
        if (!field510) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field130.method3413("Fps:" + field1353, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field584) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field584) {
            var8 = 16711680;
        }
        Statics.field130.method3413("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("t.au(Lar;II)V")
    public static final void method6(class27 arg0, int arg1) {
        method3066(arg0.field431, arg0.field440, arg1);
    }

    @ObfuscatedName("ev.at(IIII)V")
    public static final void method3066(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field601 = -1;
            field602 = -1;
            return;
        }
        int var3 = method33(arg0, arg1, Statics.field402) - arg2;
        int var4 = arg0 - Statics.field2723;
        int var5 = var3 - Statics.field708;
        int var6 = arg1 - Statics.field1330;
        int var7 = class104.field1814[Statics.field1700];
        int var8 = class104.field1815[Statics.field1700];
        int var9 = class104.field1814[Statics.field276];
        int var10 = class104.field1815[Statics.field276];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field601 = (var11 << 9) / var15 + 256;
            field602 = (var14 << 9) / var15 + 167;
        } else {
            field601 = -1;
            field602 = -1;
        }
    }

    @ObfuscatedName("c.az(IIII)I")
    public static final int method33(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field135[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field138[var5][var3][var4] + class9.field138[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field138[var5][var3][var4 + 1] + class9.field138[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("m.ag(ZI)V")
    public static final void method230(boolean arg0) {
        field554 = arg0;
        if (!field554) {
            int var1 = field536.method2440();
            int var2 = field536.method2469();
            int var3 = field536.method2469();
            int var4 = field536.method2463();
            int var5 = field536.method2469();
            int var6 = (field537 - field536.field2059) / 16;
            Statics.field316 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field316[var7][var8] = field536.method2478();
                }
            }
            Statics.field1831 = new int[var6];
            Statics.field429 = new int[var6];
            Statics.field124 = new int[var6];
            Statics.field1242 = new byte[var6][];
            Statics.field2356 = new byte[var6][];
            boolean var9 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var3 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1831[var10] = var13;
                        Statics.field429[var10] = Statics.field936.method3023("m" + var11 + "_" + var12);
                        Statics.field124[var10] = Statics.field936.method3023("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method240(var3, var1, var4, var2, var5);
            return;
        }
        int var14 = field536.method2438();
        field536.method2324();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field536.method2320(1);
                    if (var18 == 1) {
                        field555[var15][var16][var17] = field536.method2320(26);
                    } else {
                        field555[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field536.method2321();
        int var19 = (field537 - field536.field2059) / 16;
        Statics.field316 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field316[var20][var21] = field536.method2479();
            }
        }
        int var22 = field536.method2440();
        int var23 = field536.method2494();
        int var24 = field536.method2440();
        int var25 = field536.method2440();
        Statics.field1831 = new int[var19];
        Statics.field429 = new int[var19];
        Statics.field124 = new int[var19];
        Statics.field1242 = new byte[var19][];
        Statics.field2356 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field555[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1831[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1831[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field429[var26] = Statics.field936.method3023("m" + var35 + "_" + var36);
                            Statics.field124[var26] = Statics.field936.method3023("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method240(var25, var24, var14, var23, var22);
    }

    @ObfuscatedName("v.am(IIIIII)V")
    public static final void method240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2365 == arg0 && Statics.field299 == arg1 && field502 == arg2 || !field584) {
            return;
        }
        Statics.field2365 = arg0;
        Statics.field299 = arg1;
        field502 = arg2;
        if (!field584) {
            field502 = 0;
        }
        method2341(25);
        method2313(class134.field2105, true);
        int var5 = Statics.field272;
        int var6 = Statics.field977;
        Statics.field272 = (arg0 - 6) * 8;
        Statics.field977 = (arg1 - 6) * 8;
        int var7 = Statics.field272 - var5;
        int var8 = Statics.field977 - var6;
        int var9 = Statics.field272;
        int var10 = Statics.field977;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field530[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field482[var13] -= var7;
                    var12.field472[var13] -= var8;
                }
                var12.field431 -= var7 * 128;
                var12.field440 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field616[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field482[var16] -= var7;
                    var15.field472[var16] -= var8;
                }
                var15.field431 -= var7 * 128;
                var15.field440 -= var8 * 128;
            }
        }
        Statics.field402 = arg2;
        Statics.field1431.method249(arg3, arg4, false);
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
                        field630[var27][var23][var24] = field630[var27][var25][var26];
                    } else {
                        field630[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field631.method3345(); var28 != null; var28 = (class22) field631.method3324()) {
            var28.field357 -= var7;
            var28.field360 -= var8;
            if (var28.field357 < 0 || var28.field360 < 0 || var28.field357 >= 104 || var28.field360 >= 104) {
                var28.method3361();
            }
        }
        if (field728 != 0) {
            field728 -= var7;
            field729 -= var8;
        }
        field736 = 0;
        field742 = false;
        field723 = -1;
        field633.method3316();
        field632.method3316();
    }

    @ObfuscatedName("ao.ai(ZI)V")
    public static final void method931(boolean arg0) {
        method1433();
        field540++;
        if (field540 < 50 && !arg0) {
            return;
        }
        field540 = 0;
        if (field618 || Statics.field1440 == null) {
            return;
        }
        field534.method2317(150);
        try {
            Statics.field1440.method1397(field534.field2061, 0, field534.field2059);
            field534.field2059 = 0;
        } catch (IOException var2) {
            field618 = true;
        }
    }

    @ObfuscatedName("aq.ab(I)V")
    public static final void method702() {
        method931(false);
        field749 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1242.length; var1++) {
            if (Statics.field429[var1] != -1 && Statics.field1242[var1] == null) {
                Statics.field1242[var1] = Statics.field936.method2987(Statics.field429[var1], 0);
                if (Statics.field1242[var1] == null) {
                    var0 = false;
                    field749++;
                }
            }
            if (Statics.field124[var1] != -1 && Statics.field2356[var1] == null) {
                Statics.field2356[var1] = Statics.field936.method2988(Statics.field124[var1], 0, Statics.field316[var1]);
                if (Statics.field2356[var1] == null) {
                    var0 = false;
                    field749++;
                }
            }
        }
        if (!var0) {
            field551 = 1;
            return;
        }
        field654 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1242.length; var3++) {
            byte[] var4 = Statics.field2356[var3];
            if (var4 != null) {
                int var5 = (Statics.field1831[var3] >> 8) * 64 - Statics.field272;
                int var6 = (Statics.field1831[var3] & 0xFF) * 64 - Statics.field977;
                if (field554) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class9.method701(var4, var5, var6);
            }
        }
        if (!var2) {
            field551 = 2;
            return;
        }
        if (field551 != 0) {
            method2313(class134.field2105 + class2.field28 + class2.field25 + 100 + "%" + class2.field26, true);
        }
        method1433();
        method2041();
        method1433();
        Statics.field672.method1880();
        method1433();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field681[var7].method3224();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class9.field135[var8][var9][var10] = 0;
                }
            }
        }
        method1433();
        class9.method138();
        int var11 = Statics.field1242.length;
        class7.method1529();
        method931(true);
        if (!field554) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field1831[var12] >> 8) * 64 - Statics.field272;
                int var14 = (Statics.field1831[var12] & 0xFF) * 64 - Statics.field977;
                byte[] var15 = Statics.field1242[var12];
                if (var15 != null) {
                    method1433();
                    int var16 = Statics.field2365 * 8 - 48;
                    int var17 = Statics.field299 * 8 - 48;
                    class164[] var18 = field681;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field2753[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class127 var22 = new class127(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class9.method2927(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field1831[var26] >> 8) * 64 - Statics.field272;
                int var28 = (Statics.field1831[var26] & 0xFF) * 64 - Statics.field977;
                byte[] var29 = Statics.field1242[var26];
                if (var29 == null && Statics.field299 < 800) {
                    method1433();
                    class9.method563(var27, var28, 64, 64);
                }
            }
            method931(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field2356[var30];
                if (var31 != null) {
                    int var32 = (Statics.field1831[var30] >> 8) * 64 - Statics.field272;
                    int var33 = (Statics.field1831[var30] & 0xFF) * 64 - Statics.field977;
                    method1433();
                    class95 var34 = Statics.field672;
                    class164[] var35 = field681;
                    class127 var36 = new class127(var31);
                    int var37 = -1;
                    while (true) {
                        int var38 = var36.method2423();
                        if (var38 == 0) {
                            break;
                        }
                        var37 += var38;
                        int var39 = 0;
                        while (true) {
                            int var40 = var36.method2423();
                            if (var40 == 0) {
                                break;
                            }
                            var39 += var40 - 1;
                            int var41 = var39 & 0x3F;
                            int var42 = var39 >> 6 & 0x3F;
                            int var43 = var39 >> 12;
                            int var44 = var36.method2438();
                            int var45 = var44 >> 2;
                            int var46 = var44 & 0x3;
                            int var47 = var32 + var42;
                            int var48 = var33 + var41;
                            if (var47 > 0 && var48 > 0 && var47 < 103 && var48 < 103) {
                                int var49 = var43;
                                if ((class9.field135[1][var47][var48] & 0x2) == 2) {
                                    var49 = var43 - 1;
                                }
                                class164 var50 = null;
                                if (var49 >= 0) {
                                    var50 = var35[var49];
                                }
                                class9.method671(var43, var47, var48, var37, var46, var45, var34, var50);
                            }
                        }
                    }
                }
            }
        }
        if (field554) {
            for (int var51 = 0; var51 < 4; var51++) {
                method1433();
                for (int var52 = 0; var52 < 13; var52++) {
                    for (int var53 = 0; var53 < 13; var53++) {
                        boolean var54 = false;
                        int var55 = field555[var51][var52][var53];
                        if (var55 != -1) {
                            int var56 = var55 >> 24 & 0x3;
                            int var57 = var55 >> 1 & 0x3;
                            int var58 = var55 >> 14 & 0x3FF;
                            int var59 = var55 >> 3 & 0x7FF;
                            int var60 = (var58 / 8 << 8) + var59 / 8;
                            for (int var61 = 0; var61 < Statics.field1831.length; var61++) {
                                if (Statics.field1831[var61] == var60 && Statics.field1242[var61] != null) {
                                    class9.method2230(Statics.field1242[var61], var51, var52 * 8, var53 * 8, var56, (var58 & 0x7) * 8, (var59 & 0x7) * 8, var57, field681);
                                    var54 = true;
                                    break;
                                }
                            }
                        }
                        if (!var54) {
                            int var62 = var51;
                            int var63 = var52 * 8;
                            int var64 = var53 * 8;
                            for (int var65 = 0; var65 < 8; var65++) {
                                for (int var66 = 0; var66 < 8; var66++) {
                                    class9.field138[var62][var63 + var65][var64 + var66] = 0;
                                }
                            }
                            if (var63 > 0) {
                                for (int var67 = 1; var67 < 8; var67++) {
                                    class9.field138[var62][var63][var64 + var67] = class9.field138[var62][var63 - 1][var64 + var67];
                                }
                            }
                            if (var64 > 0) {
                                for (int var68 = 1; var68 < 8; var68++) {
                                    class9.field138[var62][var63 + var68][var64] = class9.field138[var62][var63 + var68][var64 - 1];
                                }
                            }
                            if (var63 > 0 && class9.field138[var62][var63 - 1][var64] != 0) {
                                class9.field138[var62][var63][var64] = class9.field138[var62][var63 - 1][var64];
                            } else if (var64 > 0 && class9.field138[var62][var63][var64 - 1] != 0) {
                                class9.field138[var62][var63][var64] = class9.field138[var62][var63][var64 - 1];
                            } else if (var63 > 0 && var64 > 0 && class9.field138[var62][var63 - 1][var64 - 1] != 0) {
                                class9.field138[var62][var63][var64] = class9.field138[var62][var63 - 1][var64 - 1];
                            }
                        }
                    }
                }
            }
            for (int var69 = 0; var69 < 13; var69++) {
                for (int var70 = 0; var70 < 13; var70++) {
                    int var71 = field555[0][var69][var70];
                    if (var71 == -1) {
                        class9.method563(var69 * 8, var70 * 8, 8, 8);
                    }
                }
            }
            method931(true);
            for (int var72 = 0; var72 < 4; var72++) {
                method1433();
                for (int var73 = 0; var73 < 13; var73++) {
                    label361: for (int var74 = 0; var74 < 13; var74++) {
                        int var75 = field555[var72][var73][var74];
                        if (var75 != -1) {
                            int var76 = var75 >> 24 & 0x3;
                            int var77 = var75 >> 1 & 0x3;
                            int var78 = var75 >> 14 & 0x3FF;
                            int var79 = var75 >> 3 & 0x7FF;
                            int var80 = (var78 / 8 << 8) + var79 / 8;
                            for (int var81 = 0; var81 < Statics.field1831.length; var81++) {
                                if (Statics.field1831[var81] == var80 && Statics.field2356[var81] != null) {
                                    byte[] var82 = Statics.field2356[var81];
                                    int var83 = var73 * 8;
                                    int var84 = var74 * 8;
                                    int var85 = (var78 & 0x7) * 8;
                                    int var86 = (var79 & 0x7) * 8;
                                    class95 var87 = Statics.field672;
                                    class164[] var88 = field681;
                                    class127 var89 = new class127(var82);
                                    int var90 = -1;
                                    while (true) {
                                        int var91 = var89.method2423();
                                        if (var91 == 0) {
                                            continue label361;
                                        }
                                        var90 += var91;
                                        int var92 = 0;
                                        while (true) {
                                            int var93 = var89.method2423();
                                            if (var93 == 0) {
                                                break;
                                            }
                                            var92 += var93 - 1;
                                            int var94 = var92 & 0x3F;
                                            int var95 = var92 >> 6 & 0x3F;
                                            int var96 = var92 >> 12;
                                            int var97 = var89.method2438();
                                            int var98 = var97 >> 2;
                                            int var99 = var97 & 0x3;
                                            if (var76 == var96 && var95 >= var85 && var95 < var85 + 8 && var94 >= var86 && var94 < var86 + 8) {
                                                class32 var100 = class32.method1876(var90);
                                                int var102 = var95 & 0x7;
                                                int var103 = var94 & 0x7;
                                                int var105 = var100.field847;
                                                int var106 = var100.field849;
                                                if ((var99 & 0x1) == 1) {
                                                    int var107 = var105;
                                                    var105 = var106;
                                                    var106 = var107;
                                                }
                                                int var108 = var77 & 0x3;
                                                int var109;
                                                if (var108 == 0) {
                                                    var109 = var102;
                                                } else if (var108 == 1) {
                                                    var109 = var103;
                                                } else if (var108 == 2) {
                                                    var109 = 7 - var102 - (var105 - 1);
                                                } else {
                                                    var109 = 7 - var103 - (var106 - 1);
                                                }
                                                int var110 = var83 + var109;
                                                int var111 = var84 + class160.method211(var95 & 0x7, var94 & 0x7, var77, var100.field847, var100.field849, var99);
                                                if (var110 > 0 && var111 > 0 && var110 < 103 && var111 < 103) {
                                                    int var112 = var72;
                                                    if ((class9.field135[1][var110][var111] & 0x2) == 2) {
                                                        var112 = var72 - 1;
                                                    }
                                                    class164 var113 = null;
                                                    if (var112 >= 0) {
                                                        var113 = var88[var112];
                                                    }
                                                    class9.method671(var72, var110, var111, var90, var77 + var99 & 0x3, var98, var87, var113);
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
        method931(true);
        method2041();
        method1433();
        class9.method135(Statics.field672, field681);
        method931(true);
        int var114 = class9.field159;
        if (var114 > Statics.field402) {
            var114 = Statics.field402;
        }
        if (var114 < Statics.field402 - 1) {
            int var115 = Statics.field402 - 1;
        }
        if (field584) {
            Statics.field672.method1879(class9.field159);
        } else {
            Statics.field672.method1879(0);
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                method2690(var116, var117);
            }
        }
        method1433();
        method143();
        class32.field836.method3264();
        if (Statics.field321 != null) {
            field534.method2317(4);
            field534.method2633(1057001181);
        }
        if (!field554) {
            int var118 = (Statics.field2365 - 6) / 8;
            int var119 = (Statics.field2365 + 6) / 8;
            int var120 = (Statics.field299 - 6) / 8;
            int var121 = (Statics.field299 + 6) / 8;
            for (int var122 = var118 - 1; var122 <= var119 + 1; var122++) {
                for (int var123 = var120 - 1; var123 <= var121 + 1; var123++) {
                    if (var122 < var118 || var122 > var119 || var123 < var120 || var123 > var121) {
                        Statics.field936.method3006("m" + var122 + "_" + var123);
                        Statics.field936.method3006("l" + var122 + "_" + var123);
                    }
                }
            }
        }
        method2341(30);
        method1433();
        Statics.field139 = (byte[][][]) null;
        Statics.field142 = (byte[][][]) null;
        Statics.field155 = (byte[][][]) null;
        Statics.field147 = (byte[][][]) null;
        Statics.field217 = (int[][][]) null;
        Statics.field141 = (byte[][][]) null;
        Statics.field2054 = (int[][]) null;
        Statics.field136 = null;
        Statics.field143 = null;
        Statics.field144 = null;
        Statics.field148 = null;
        Statics.field157 = null;
        field534.method2317(171);
        Statics.field385.method1366();
        for (int var124 = 0; var124 < 32; var124++) {
            field1347[var124] = 0L;
        }
        for (int var125 = 0; var125 < 32; var125++) {
            field1355[var125] = 0L;
        }
        Statics.field824 = 0;
    }

    @ObfuscatedName("n.ay(IIIIII)V")
    public static final void method237(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field672.method1995(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field672.method1910(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field293.field1504;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method1876(var12);
            if (var13.field862 == -1) {
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
                class87 var14 = Statics.field358[var13.field862];
                if (var14 != null) {
                    int var15 = (var13.field847 * 4 - var14.field1517) / 2;
                    int var16 = (var13.field849 * 4 - var14.field1518) / 2;
                    var14.method1780(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field849) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field672.method1918(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field672.method1910(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method1876(var21);
            if (var22.field862 != -1) {
                class87 var23 = Statics.field358[var22.field862];
                if (var23 != null) {
                    int var24 = (var22.field847 * 4 - var23.field1517) / 2;
                    int var25 = (var22.field849 * 4 - var23.field1518) / 2;
                    var23.method1780(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field849) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field293.field1504;
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
        int var29 = Statics.field672.method1919(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method1876(var30);
        if (var31.field862 == -1) {
            return;
        }
        class87 var32 = Statics.field358[var31.field862];
        if (var32 != null) {
            int var33 = (var31.field847 * 4 - var32.field1517) / 2;
            int var34 = (var31.field849 * 4 - var32.field1518) / 2;
            var32.method1780(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field849) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("as.aw(IIIB)Z")
    public static final boolean method810(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field672.method1910(Statics.field402, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method1876(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field847;
                var9 = var7.field849;
            } else {
                var8 = var7.field849;
                var9 = var7.field847;
            }
            int var10 = var7.field870;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method109(Statics.field1431.field482[0], Statics.field1431.field472[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method109(Statics.field1431.field482[0], Statics.field1431.field472[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field603 = class77.field1428;
        field604 = class77.field1429;
        field665 = 2;
        field684 = 0;
        return true;
    }

    @ObfuscatedName("u.ad(IIIIZIIIIIII)Z")
    public static final boolean method109(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field558[var11][var12] = 0;
                field559[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field558[arg0][arg1] = 99;
        field559[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field575[var15] = arg0;
        int var36 = var15 + 1;
        field561[var15] = arg1;
        boolean var17 = false;
        int var18 = field575.length;
        int[][] var19 = field681[Statics.field402].field2753;
        while (var36 != var16) {
            var13 = field575[var16];
            var14 = field561[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field681[Statics.field402].method3223(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field681[Statics.field402].method3232(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field681[Statics.field402].method3225(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field559[var13][var14] + 1;
            if (var13 > 0 && field558[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field575[var36] = var13 - 1;
                field561[var36] = var14;
                var36 = (var36 + 1) % var18;
                field558[var13 - 1][var14] = 2;
                field559[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field558[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field575[var36] = var13 + 1;
                field561[var36] = var14;
                var36 = (var36 + 1) % var18;
                field558[var13 + 1][var14] = 8;
                field559[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field558[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field575[var36] = var13;
                field561[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field558[var13][var14 - 1] = 1;
                field559[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field558[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field575[var36] = var13;
                field561[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field558[var13][var14 + 1] = 4;
                field559[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field558[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field575[var36] = var13 - 1;
                field561[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field558[var13 - 1][var14 - 1] = 3;
                field559[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field558[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field575[var36] = var13 + 1;
                field561[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field558[var13 + 1][var14 - 1] = 9;
                field559[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field558[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field575[var36] = var13 - 1;
                field561[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field558[var13 - 1][var14 + 1] = 6;
                field559[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field558[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field575[var36] = var13 + 1;
                field561[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field558[var13 + 1][var14 + 1] = 12;
                field559[var13 + 1][var14 + 1] = var20;
            }
        }
        field557 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field559[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg2) {
                            var26 = arg2 - var24;
                        } else if (var24 > arg2 + arg7 - 1) {
                            var26 = var24 - (arg2 + arg7 - 1);
                        }
                        int var27 = 0;
                        if (var25 < arg3) {
                            var27 = arg3 - var25;
                        } else if (var25 > arg3 + arg8 - 1) {
                            var27 = var25 - (arg3 + arg8 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && field559[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field559[var24][var25];
                            var13 = var24;
                            var14 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg0 == var13 && arg1 == var14) {
                return false;
            }
            field557 = 1;
        }
        byte var29 = 0;
        field575[var29] = var13;
        int var37 = var29 + 1;
        field561[var29] = var14;
        int var30;
        int var31 = var30 = field558[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field575[var37] = var13;
                field561[var37++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = field558[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field575[var37];
            int var34 = field561[var37];
            if (arg10 == 0) {
                field534.method2317(11);
                field534.method2424(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field534.method2317(8);
                field534.method2424(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field534.method2317(174);
                field534.method2424(var32 + var32 + 3);
            }
            field534.method2467(Statics.field272 + var33);
            field728 = field575[0];
            field729 = field561[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field534.method2459(field575[var37] - var33);
                field534.method2474(field561[var37] - var34);
            }
            field534.method2641(Statics.field977 + var34);
            field534.method2474(class75.field1386[82] ? 1 : 0);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("g.bs(I)V")
    public static final void method223() {
        if (field538 == 55) {
            int var0 = field536.method2438();
            int var1 = (var0 >> 4 & 0x7) + Statics.field414;
            int var2 = (var0 & 0x7) + Statics.field1217;
            int var3 = field536.method2440();
            int var4 = field536.method2440();
            int var5 = field536.method2440();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class177 var6 = field630[Statics.field402][var1][var2];
                if (var6 != null) {
                    for (class17 var7 = (class17) var6.method3345(); var7 != null; var7 = (class17) var6.method3324()) {
                        if ((var3 & 0x7FFF) == var7.field270 && var7.field271 == var4) {
                            var7.field271 = var5;
                            break;
                        }
                    }
                    method2690(var1, var2);
                }
            }
            return;
        }
        if (field538 == 87) {
            int var8 = field536.method2438();
            int var9 = (var8 >> 4 & 0x7) + Statics.field414;
            int var10 = (var8 & 0x7) + Statics.field1217;
            int var11 = field536.method2440();
            int var12 = field536.method2438();
            int var13 = var12 >> 4 & 0xF;
            int var14 = var12 & 0x7;
            int var15 = field536.method2438();
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                int var16 = var13 + 1;
                if (Statics.field1431.field482[0] >= var9 - var16 && Statics.field1431.field482[0] <= var9 + var16 && Statics.field1431.field472[0] >= var10 - var16 && Statics.field1431.field472[0] <= var10 + var16 && field735 != 0 && var14 > 0 && field736 < 50) {
                    field737[field736] = var11;
                    field738[field736] = var14;
                    field739[field736] = var15;
                    field741[field736] = null;
                    field722[field736] = (var9 << 16) + (var10 << 8) + var13;
                    field736++;
                }
            }
        }
        if (field538 == 238) {
            int var17 = field536.method2462();
            int var18 = (var17 >> 4 & 0x7) + Statics.field414;
            int var19 = (var17 & 0x7) + Statics.field1217;
            int var20 = field536.method2494();
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                class177 var21 = field630[Statics.field402][var18][var19];
                if (var21 != null) {
                    for (class17 var22 = (class17) var21.method3345(); var22 != null; var22 = (class17) var21.method3324()) {
                        if ((var20 & 0x7FFF) == var22.field270) {
                            var22.method3361();
                            break;
                        }
                    }
                    if (var21.method3345() == null) {
                        field630[Statics.field402][var18][var19] = null;
                    }
                    method2690(var18, var19);
                }
            }
        } else if (field538 == 194) {
            int var23 = field536.method2438();
            int var24 = (var23 >> 4 & 0x7) + Statics.field414;
            int var25 = (var23 & 0x7) + Statics.field1217;
            int var26 = var24 + field536.method2629();
            int var27 = var25 + field536.method2629();
            int var28 = field536.method2441();
            int var29 = field536.method2440();
            int var30 = field536.method2438() * 4;
            int var31 = field536.method2438() * 4;
            int var32 = field536.method2440();
            int var33 = field536.method2440();
            int var34 = field536.method2438();
            int var35 = field536.method2438();
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var29 != 65535) {
                int var36 = var24 * 128 + 64;
                int var37 = var25 * 128 + 64;
                int var38 = var26 * 128 + 64;
                int var39 = var27 * 128 + 64;
                class10 var40 = new class10(var29, Statics.field402, var36, var37, method33(var36, var37, Statics.field402) - var30, field652 + var32, field652 + var33, var34, var35, var28, var31);
                var40.method120(var38, var39, method33(var38, var39, Statics.field402) - var31, field652 + var32);
                field632.method3317(var40);
            }
        } else if (field538 == 31) {
            int var41 = field536.method2438();
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = field556[var42];
            int var45 = field536.method2494();
            int var46 = field536.method2621();
            int var47 = (var46 >> 4 & 0x7) + Statics.field414;
            int var48 = (var46 & 0x7) + Statics.field1217;
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                method808(Statics.field402, var47, var48, var44, var45, var42, var43, 0, -1);
            }
        } else if (field538 == 147) {
            int var49 = field536.method2462();
            int var50 = (var49 >> 4 & 0x7) + Statics.field414;
            int var51 = (var49 & 0x7) + Statics.field1217;
            int var52 = field536.method2494();
            int var53 = field536.method2494();
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                class17 var54 = new class17();
                var54.field270 = var52;
                var54.field271 = var53;
                if (field630[Statics.field402][var50][var51] == null) {
                    field630[Statics.field402][var50][var51] = new class177();
                }
                field630[Statics.field402][var50][var51].method3317(var54);
                method2690(var50, var51);
            }
        } else if (field538 == 79) {
            int var55 = field536.method2438();
            int var56 = (var55 >> 4 & 0x7) + Statics.field414;
            int var57 = (var55 & 0x7) + Statics.field1217;
            int var58 = field536.method2440();
            int var59 = field536.method2438();
            int var60 = field536.method2440();
            if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                int var61 = var56 * 128 + 64;
                int var62 = var57 * 128 + 64;
                class20 var63 = new class20(var58, Statics.field402, var61, var62, method33(var61, var62, Statics.field402) - var59, var60, field652);
                field633.method3317(var63);
            }
        } else if (field538 == 98) {
            int var64 = field536.method2494();
            int var65 = field536.method2521();
            int var66 = field536.method2440();
            int var67 = field536.method2438();
            int var68 = (var67 >> 4 & 0x7) + Statics.field414;
            int var69 = (var67 & 0x7) + Statics.field1217;
            if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && field732 != var64) {
                class17 var70 = new class17();
                var70.field270 = var65;
                var70.field271 = var66;
                if (field630[Statics.field402][var68][var69] == null) {
                    field630[Statics.field402][var68][var69] = new class177();
                }
                field630[Statics.field402][var68][var69].method3317(var70);
                method2690(var68, var69);
            }
        } else {
            if (field538 == 71) {
                int var71 = field536.method2469();
                int var72 = field536.method2463();
                int var73 = (var72 >> 4 & 0x7) + Statics.field414;
                int var74 = (var72 & 0x7) + Statics.field1217;
                int var75 = field536.method2438();
                int var76 = var75 >> 2;
                int var77 = var75 & 0x3;
                int var78 = field556[var76];
                byte var79 = field536.method2464();
                byte var80 = field536.method2557();
                int var81 = field536.method2469();
                byte var82 = field536.method2464();
                int var83 = field536.method2494();
                int var84 = field536.method2440();
                byte var85 = field536.method2629();
                class3 var86;
                if (field732 == var71) {
                    var86 = Statics.field1431;
                } else {
                    var86 = field616[var71];
                }
                if (var86 != null) {
                    class32 var87 = class32.method1876(var83);
                    int var88;
                    int var89;
                    if (var77 == 1 || var77 == 3) {
                        var88 = var87.field849;
                        var89 = var87.field847;
                    } else {
                        var88 = var87.field847;
                        var89 = var87.field849;
                    }
                    int var90 = (var88 >> 1) + var73;
                    int var91 = (var88 + 1 >> 1) + var73;
                    int var92 = (var89 >> 1) + var74;
                    int var93 = (var89 + 1 >> 1) + var74;
                    int[][] var94 = class9.field138[Statics.field402];
                    int var95 = var94[var90][var92] + var94[var91][var92] + var94[var90][var93] + var94[var91][var93] >> 2;
                    int var96 = (var73 << 7) + (var88 << 6);
                    int var97 = (var74 << 7) + (var89 << 6);
                    class112 var98 = var87.method664(var76, var77, var94, var96, var95, var97);
                    if (var98 != null) {
                        method808(Statics.field402, var73, var74, var78, -1, 0, 0, var84 + 1, var81 + 1);
                        var86.field44 = field652 + var84;
                        var86.field57 = field652 + var81;
                        var86.field48 = var98;
                        var86.field52 = var73 * 128 + var88 * 64;
                        var86.field47 = var74 * 128 + var89 * 64;
                        var86.field46 = var95;
                        if (var85 > var80) {
                            byte var99 = var85;
                            var85 = var80;
                            var80 = var99;
                        }
                        if (var82 > var79) {
                            byte var100 = var82;
                            var82 = var79;
                            var79 = var100;
                        }
                        var86.field49 = var73 + var85;
                        var86.field53 = var73 + var80;
                        var86.field50 = var74 + var82;
                        var86.field56 = var74 + var79;
                    }
                }
            }
            if (field538 == 219) {
                int var101 = field536.method2463();
                int var102 = (var101 >> 4 & 0x7) + Statics.field414;
                int var103 = (var101 & 0x7) + Statics.field1217;
                int var104 = field536.method2463();
                int var105 = var104 >> 2;
                int var106 = var104 & 0x3;
                int var107 = field556[var105];
                int var108 = field536.method2521();
                if (var102 >= 0 && var103 >= 0 && var102 < 103 && var103 < 103) {
                    if (var107 == 0) {
                        class96 var109 = Statics.field672.method1902(Statics.field402, var102, var103);
                        if (var109 != null) {
                            int var110 = var109.field1659 >> 14 & 0x7FFF;
                            if (var105 == 2) {
                                var109.field1657 = new class14(var110, 2, var106 + 4, Statics.field402, var102, var103, var108, false, var109.field1657);
                                var109.field1658 = new class14(var110, 2, var106 + 1 & 0x3, Statics.field402, var102, var103, var108, false, var109.field1658);
                            } else {
                                var109.field1657 = new class14(var110, var105, var106, Statics.field402, var102, var103, var108, false, var109.field1657);
                            }
                        }
                    }
                    if (var107 == 1) {
                        class108 var111 = Statics.field672.method1903(Statics.field402, var102, var103);
                        if (var111 != null) {
                            int var112 = var111.field1838 >> 14 & 0x7FFF;
                            if (var105 == 4 || var105 == 5) {
                                var111.field1836 = new class14(var112, 4, var106, Statics.field402, var102, var103, var108, false, var111.field1836);
                            } else if (var105 == 6) {
                                var111.field1836 = new class14(var112, 4, var106 + 4, Statics.field402, var102, var103, var108, false, var111.field1836);
                            } else if (var105 == 7) {
                                var111.field1836 = new class14(var112, 4, (var106 + 2 & 0x3) + 4, Statics.field402, var102, var103, var108, false, var111.field1836);
                            } else if (var105 == 8) {
                                var111.field1836 = new class14(var112, 4, var106 + 4, Statics.field402, var102, var103, var108, false, var111.field1836);
                                var111.field1837 = new class14(var112, 4, (var106 + 2 & 0x3) + 4, Statics.field402, var102, var103, var108, false, var111.field1837);
                            }
                        }
                    }
                    if (var107 == 2) {
                        class98 var113 = Statics.field672.method1904(Statics.field402, var102, var103);
                        if (var105 == 11) {
                            var105 = 10;
                        }
                        if (var113 != null) {
                            var113.field1685 = new class14(var113.field1686 >> 14 & 0x7FFF, var105, var106, Statics.field402, var102, var103, var108, false, var113.field1685);
                        }
                    }
                    if (var107 == 3) {
                        class107 var114 = Statics.field672.method1905(Statics.field402, var102, var103);
                        if (var114 != null) {
                            var114.field1820 = new class14(var114.field1828 >> 14 & 0x7FFF, 22, var106, Statics.field402, var102, var103, var108, false, var114.field1820);
                        }
                    }
                }
            } else if (field538 == 82) {
                int var115 = field536.method2463();
                int var116 = var115 >> 2;
                int var117 = var115 & 0x3;
                int var118 = field556[var116];
                int var119 = field536.method2463();
                int var120 = (var119 >> 4 & 0x7) + Statics.field414;
                int var121 = (var119 & 0x7) + Statics.field1217;
                if (var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104) {
                    method808(Statics.field402, var120, var121, var118, -1, var116, var117, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("as.bt(IIIIIIIIIB)V")
    public static final void method808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field631.method3345(); var10 != null; var10 = (class22) field631.method3324()) {
            if (var10.field369 == arg0 && var10.field357 == arg1 && var10.field360 == arg2 && var10.field363 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field369 = arg0;
            var9.field363 = arg3;
            var9.field357 = arg1;
            var9.field360 = arg2;
            method774(var9);
            field631.method3317(var9);
        }
        var9.field364 = arg4;
        var9.field366 = arg5;
        var9.field365 = arg6;
        var9.field359 = arg7;
        var9.field368 = arg8;
    }

    @ObfuscatedName("q.bn(I)V")
    public static final void method143() {
        for (class22 var0 = (class22) field631.method3345(); var0 != null; var0 = (class22) field631.method3324()) {
            if (var0.field368 == -1) {
                var0.field359 = 0;
                method774(var0);
            } else {
                var0.method3361();
            }
        }
    }

    @ObfuscatedName("ax.bk(Lm;I)V")
    public static final void method774(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field363 == 0) {
            var1 = Statics.field672.method1995(arg0.field369, arg0.field357, arg0.field360);
        }
        if (arg0.field363 == 1) {
            var1 = Statics.field672.method1914(arg0.field369, arg0.field357, arg0.field360);
        }
        if (arg0.field363 == 2) {
            var1 = Statics.field672.method1918(arg0.field369, arg0.field357, arg0.field360);
        }
        if (arg0.field363 == 3) {
            var1 = Statics.field672.method1919(arg0.field369, arg0.field357, arg0.field360);
        }
        if (var1 != 0) {
            int var5 = Statics.field672.method1910(arg0.field369, arg0.field357, arg0.field360, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field361 = var2;
        arg0.field373 = var3;
        arg0.field362 = var4;
    }

    @ObfuscatedName("c.bl(IIIIIIIB)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field584 && Statics.field402 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field672.method1995(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field672.method1914(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field672.method1918(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field672.method1919(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field672.method1910(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field672.method2005(arg0, arg2, arg3);
                class32 var15 = class32.method1876(var12);
                if (var15.field850 != 0) {
                    field681[arg0].method3219(arg2, arg3, var13, var14, var15.field851);
                }
            }
            if (arg1 == 1) {
                Statics.field672.method1921(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field672.method2034(arg0, arg2, arg3);
                class32 var16 = class32.method1876(var12);
                if (var16.field847 + arg2 > 103 || var16.field847 + arg3 > 103 || var16.field849 + arg2 > 103 || var16.field849 + arg3 > 103) {
                    return;
                }
                if (var16.field850 != 0) {
                    field681[arg0].method3220(arg2, arg3, var16.field847, var16.field849, var14, var16.field851);
                }
            }
            if (arg1 == 3) {
                Statics.field672.method1900(arg0, arg2, arg3);
                class32 var17 = class32.method1876(var12);
                if (var17.field850 == 1) {
                    field681[arg0].method3222(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field135[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class95 var19 = Statics.field672;
        class164 var20 = field681[arg0];
        class32 var21 = class32.method1876(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field849;
            var23 = var21.field847;
        } else {
            var22 = var21.field847;
            var23 = var21.field849;
        }
        int var24;
        int var25;
        if (arg2 + var22 <= 104) {
            var24 = (var22 >> 1) + arg2;
            var25 = (var22 + 1 >> 1) + arg2;
        } else {
            var24 = arg2;
            var25 = arg2 + 1;
        }
        int var26;
        int var27;
        if (arg3 + var23 <= 104) {
            var26 = (var23 >> 1) + arg3;
            var27 = (var23 + 1 >> 1) + arg3;
        } else {
            var26 = arg3;
            var27 = arg3 + 1;
        }
        int[][] var28 = class9.field138[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field852 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field874 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class94 var34;
            if (var21.field856 == -1 && var21.field875 == null) {
                var34 = var21.method664(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class14(arg4, 22, arg5, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method1886(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field850 == 1) {
                var20.method3217(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var57;
            if (var21.field856 == -1 && var21.field875 == null) {
                var57 = var21.method664(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class14(arg4, 10, arg5, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            if (var57 != null) {
                var19.method1890(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field850 != 0) {
                var20.method3215(arg2, arg3, var22, var23, var21.field851);
            }
        } else if (arg6 >= 12) {
            class94 var35;
            if (var21.field856 == -1 && var21.field875 == null) {
                var35 = var21.method664(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method1890(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3215(arg2, arg3, var22, var23, var21.field851);
            }
        } else if (arg6 == 0) {
            class94 var36;
            if (var21.field856 == -1 && var21.field875 == null) {
                var36 = var21.method664(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class14(arg4, 0, arg5, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method1934(arg0, arg2, arg3, var29, var36, (class94) null, class9.field140[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3214(arg2, arg3, arg6, arg5, var21.field851);
            }
        } else if (arg6 == 1) {
            class94 var37;
            if (var21.field856 == -1 && var21.field875 == null) {
                var37 = var21.method664(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class14(arg4, 1, arg5, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method1934(arg0, arg2, arg3, var29, var37, (class94) null, class9.field149[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3214(arg2, arg3, arg6, arg5, var21.field851);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class94 var39;
            class94 var40;
            if (var21.field856 == -1 && var21.field875 == null) {
                var39 = var21.method664(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method664(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class14(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field856, true, (class94) null);
                var40 = new class14(arg4, 2, var38, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method1934(arg0, arg2, arg3, var29, var39, var40, class9.field140[arg5], class9.field140[var38], var32, var33);
            if (var21.field850 != 0) {
                var20.method3214(arg2, arg3, arg6, arg5, var21.field851);
            }
        } else if (arg6 == 3) {
            class94 var41;
            if (var21.field856 == -1 && var21.field875 == null) {
                var41 = var21.method664(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class14(arg4, 3, arg5, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method1934(arg0, arg2, arg3, var29, var41, (class94) null, class9.field149[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3214(arg2, arg3, arg6, arg5, var21.field851);
            }
        } else if (arg6 == 9) {
            class94 var42;
            if (var21.field856 == -1 && var21.field875 == null) {
                var42 = var21.method664(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method1890(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3215(arg2, arg3, var22, var23, var21.field851);
            }
        } else if (arg6 == 4) {
            class94 var43;
            if (var21.field856 == -1 && var21.field875 == null) {
                var43 = var21.method664(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method2001(arg0, arg2, arg3, var29, var43, (class94) null, class9.field140[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1995(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class32.method1876(var45 >> 14 & 0x7FFF).field843;
            }
            class94 var46;
            if (var21.field856 == -1 && var21.field875 == null) {
                var46 = var21.method664(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method2001(arg0, arg2, arg3, var29, var46, (class94) null, class9.field140[arg5], 0, class9.field150[arg5] * var44, class9.field145[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1995(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class32.method1876(var48 >> 14 & 0x7FFF).field843 / 2;
            }
            class94 var49;
            if (var21.field856 == -1 && var21.field875 == null) {
                var49 = var21.method664(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method2001(arg0, arg2, arg3, var29, var49, (class94) null, 256, arg5, class9.field152[arg5] * var47, class9.field153[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class94 var51;
            if (var21.field856 == -1 && var21.field875 == null) {
                var51 = var21.method664(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class14(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method2001(arg0, arg2, arg3, var29, var51, (class94) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1995(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class32.method1876(var53 >> 14 & 0x7FFF).field843 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class94 var55;
            class94 var56;
            if (var21.field856 == -1 && var21.field875 == null) {
                var55 = var21.method664(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method664(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field856, true, (class94) null);
                var56 = new class14(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field856, true, (class94) null);
            }
            var19.method2001(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field152[arg5] * var52, class9.field153[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ea.bi(III)V")
    public static final void method2690(int arg0, int arg1) {
        class177 var2 = field630[Statics.field402][arg0][arg1];
        if (var2 == null) {
            Statics.field672.method1901(Statics.field402, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3345(); var5 != null; var5 = (class17) var2.method3324()) {
            class40 var6 = class40.method119(var5.field270);
            int var7 = var6.field1025;
            if (var6.field1024 == 1) {
                var7 = (var5.field271 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field672.method1901(Statics.field402, arg0, arg1);
            return;
        }
        var2.method3318(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3345(); var10 != null; var10 = (class17) var2.method3324()) {
            if (var4.field270 != var10.field270) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field270 != var10.field270 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field672.method1887(Statics.field402, arg0, arg1, method33(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field402), var4, var11, var8, var9);
    }

    @ObfuscatedName("t.br(I)V")
    public static final void method2() {
        field624 = 0;
        field619 = 0;
        method180();
        int var0 = field536.method2320(8);
        if (var0 < field642) {
            for (int var1 = var0; var1 < field642; var1++) {
                field625[++field624 - 1] = field491[var1];
            }
        }
        if (var0 > field642) {
            throw new RuntimeException("");
        }
        field642 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field491[var2];
            class3 var4 = field616[var3];
            int var5 = field536.method2320(1);
            if (var5 == 0) {
                field491[++field642 - 1] = var3;
                var4.field476 = field652;
            } else {
                int var6 = field536.method2320(2);
                if (var6 == 0) {
                    field491[++field642 - 1] = var3;
                    var4.field476 = field652;
                    field651[++field619 - 1] = var3;
                } else if (var6 == 1) {
                    field491[++field642 - 1] = var3;
                    var4.field476 = field652;
                    int var7 = field536.method2320(3);
                    var4.method262(var7, false);
                    int var8 = field536.method2320(1);
                    if (var8 == 1) {
                        field651[++field619 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field491[++field642 - 1] = var3;
                    var4.field476 = field652;
                    int var9 = field536.method2320(3);
                    var4.method262(var9, true);
                    int var10 = field536.method2320(3);
                    var4.method262(var10, true);
                    int var11 = field536.method2320(1);
                    if (var11 == 1) {
                        field651[++field619 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field625[++field624 - 1] = var3;
                }
            }
        }
        method9();
        method3();
        for (int var12 = 0; var12 < field624; var12++) {
            int var13 = field625[var12];
            if (field652 != field616[var13].field476) {
                field616[var13] = null;
            }
        }
        if (field537 != field536.field2059) {
            throw new RuntimeException(field536.field2059 + class2.field23 + field537);
        }
        for (int var14 = 0; var14 < field642; var14++) {
            if (field616[field491[var14]] == null) {
                throw new RuntimeException(var14 + class2.field23 + field642);
            }
        }
    }

    @ObfuscatedName("s.bb(I)V")
    public static final void method180() {
        field536.method2324();
        int var0 = field536.method2320(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field536.method2320(2);
        if (var1 == 0) {
            field651[++field619 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field536.method2320(3);
            Statics.field1431.method262(var2, false);
            int var3 = field536.method2320(1);
            if (var3 == 1) {
                field651[++field619 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field536.method2320(3);
            Statics.field1431.method262(var4, true);
            int var5 = field536.method2320(3);
            Statics.field1431.method262(var5, true);
            int var6 = field536.method2320(1);
            if (var6 == 1) {
                field651[++field619 - 1] = 2047;
            }
        } else if (var1 == 3) {
            Statics.field402 = field536.method2320(2);
            int var7 = field536.method2320(7);
            int var8 = field536.method2320(1);
            if (var8 == 1) {
                field651[++field619 - 1] = 2047;
            }
            int var9 = field536.method2320(1);
            int var10 = field536.method2320(7);
            Statics.field1431.method249(var10, var7, var9 == 1);
        }
    }

    @ObfuscatedName("t.bm(I)V")
    public static final void method9() {
        while (true) {
            if (field536.method2319(field537) >= 11) {
                int var0 = field536.method2320(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field616[var0] == null) {
                        field616[var0] = new class3();
                        if (field716[var0] != null) {
                            field616[var0].method17(field716[var0]);
                        }
                        var1 = true;
                    }
                    field491[++field642 - 1] = var0;
                    class3 var2 = field616[var0];
                    var2.field476 = field652;
                    int var3 = field536.method2320(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field536.method2320(1);
                    int var5 = field629[field536.method2320(3)];
                    if (var1) {
                        var2.field478 = var2.field432 = var5;
                    }
                    int var6 = field536.method2320(1);
                    if (var6 == 1) {
                        field651[++field619 - 1] = var0;
                    }
                    int var7 = field536.method2320(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method249(Statics.field1431.field482[0] + var7, Statics.field1431.field472[0] + var3, var4 == 1);
                    continue;
                }
            }
            field536.method2321();
            return;
        }
    }

    @ObfuscatedName("t.bw(I)V")
    public static final void method3() {
        for (int var0 = 0; var0 < field619; var0++) {
            int var1 = field651[var0];
            class3 var2 = field616[var1];
            int var3 = field536.method2438();
            if ((var3 & 0x4) != 0) {
                var3 += field536.method2438() << 8;
            }
            method2191(var1, var2, var3);
        }
    }

    @ObfuscatedName("dg.bc(ILc;IB)V")
    public static final void method2191(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x200) != 0) {
            arg1.field435 = field536.method2440();
            int var3 = field536.method2448();
            arg1.field468 = var3 >> 16;
            arg1.field467 = (var3 & 0xFFFF) + field652;
            arg1.field486 = 0;
            arg1.field466 = 0;
            if (arg1.field467 > field652) {
                arg1.field486 = -1;
            }
            if (arg1.field435 == 65535) {
                arg1.field435 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field454 = field536.method2521();
            arg1.field455 = field536.method2440();
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field453 = field536.method2440();
            if (arg1.field453 == 65535) {
                arg1.field453 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field458 = field536.method2627();
            if (arg1.field458.charAt(0) == '~') {
                arg1.field458 = arg1.field458.substring(1);
                method1680(2, arg1.field51, arg1.field458);
            } else if (Statics.field1431 == arg1) {
                method1680(2, arg1.field51, arg1.field458);
            }
            arg1.field445 = 0;
            arg1.field446 = 0;
            arg1.field444 = 150;
        }
        if ((arg2 & 0x1) != 0) {
            int var4 = field536.method2521();
            int var5 = field536.method2462();
            int var6 = field536.method2462();
            int var7 = field536.field2059;
            if (arg1.field51 != null && arg1.field37 != null) {
                boolean var8 = false;
                if (var5 <= 1 && method110(arg1.field51)) {
                    var8 = true;
                }
                if (!var8 && field696 == 0) {
                    field565.field2059 = 0;
                    field536.method2449(field565.field2061, 0, var6);
                    field565.field2059 = 0;
                    String var9 = class185.method3392(class147.method121(class184.method1(field565)));
                    arg1.field458 = var9.trim();
                    arg1.field445 = var4 >> 8;
                    arg1.field446 = var4 & 0xFF;
                    arg1.field444 = 150;
                    if (var5 == 2 || var5 == 3) {
                        method1680(1, class2.method1566(1) + arg1.field51, var9);
                    } else if (var5 == 1) {
                        method1680(1, class2.method1566(0) + arg1.field51, var9);
                    } else {
                        method1680(2, arg1.field51, var9);
                    }
                }
            }
            field536.field2059 = var6 + var7;
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field457 = field536.method2463();
            arg1.field471 = field536.method2462();
            arg1.field470 = field536.method2462();
            arg1.field438 = field536.method2438();
            arg1.field473 = field536.method2440() + field652;
            arg1.field474 = field536.method2440() + field652;
            arg1.field487 = field536.method2462();
            arg1.field481 = 1;
            arg1.field483 = 0;
        }
        if ((arg2 & 0x10) != 0) {
            int var10 = field536.method2438();
            int var11 = field536.method2462();
            arg1.method256(var10, var11, field652);
            arg1.field450 = field652 + 300;
            arg1.field451 = field536.method2463();
            arg1.field465 = field536.method2438();
        }
        if ((arg2 & 0x20) != 0) {
            int var12 = field536.method2494();
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = field536.method2463();
            method1418(arg1, var12, var13);
        }
        if ((arg2 & 0x400) != 0) {
            int var14 = field536.method2463();
            int var15 = field536.method2438();
            arg1.method256(var14, var15, field652);
            arg1.field450 = field652 + 300;
            arg1.field451 = field536.method2463();
            arg1.field465 = field536.method2463();
        }
        if ((arg2 & 0x40) == 0) {
            return;
        }
        int var16 = field536.method2621();
        byte[] var17 = new byte[var16];
        class127 var18 = new class127(var17);
        field536.method2562(var17, 0, var16);
        field716[arg0] = var18;
        arg1.method17(var18);
    }

    @ObfuscatedName("ae.bq(I)V")
    public static final void method840() {
        for (int var0 = 0; var0 < field619; var0++) {
            int var1 = field651[var0];
            class25 var2 = field530[var1];
            int var3 = field536.method2438();
            if ((var3 & 0x1) != 0) {
                var2.field435 = field536.method2521();
                int var4 = field536.method2479();
                var2.field468 = var4 >> 16;
                var2.field467 = (var4 & 0xFFFF) + field652;
                var2.field486 = 0;
                var2.field466 = 0;
                if (var2.field467 > field652) {
                    var2.field486 = -1;
                }
                if (var2.field435 == 65535) {
                    var2.field435 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field454 = field536.method2440();
                var2.field455 = field536.method2521();
            }
            if ((var3 & 0x20) != 0) {
                int var5 = field536.method2463();
                int var6 = field536.method2438();
                var2.method256(var5, var6, field652);
                var2.field450 = field652 + 300;
                var2.field451 = field536.method2462();
                var2.field465 = field536.method2463();
            }
            if ((var3 & 0x4) != 0) {
                int var7 = field536.method2438();
                int var8 = field536.method2463();
                var2.method256(var7, var8, field652);
                var2.field450 = field652 + 300;
                var2.field451 = field536.method2621();
                var2.field465 = field536.method2462();
            }
            if ((var3 & 0x10) != 0) {
                var2.field458 = field536.method2627();
                var2.field444 = 100;
            }
            if ((var3 & 0x8) != 0) {
                var2.field410 = class31.method922(field536.method2521());
                var2.field460 = var2.field410.field798;
                var2.field480 = var2.field410.field805;
                var2.field484 = var2.field410.field804;
                var2.field439 = var2.field410.field792;
                var2.field461 = var2.field410.field806;
                var2.field441 = var2.field410.field807;
                var2.field443 = var2.field410.field801;
                var2.field436 = var2.field410.field802;
                var2.field437 = var2.field410.field803;
            }
            if ((var3 & 0x2) != 0) {
                var2.field453 = field536.method2469();
                if (var2.field453 == 65535) {
                    var2.field453 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var9 = field536.method2494();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field536.method2438();
                if (var2.field459 == var9 && var9 != -1) {
                    int var11 = Statics.method31(var9).field916;
                    if (var11 == 1) {
                        var2.field452 = 0;
                        var2.field490 = 0;
                        var2.field462 = var10;
                        var2.field456 = 0;
                    }
                    if (var11 == 2) {
                        var2.field456 = 0;
                    }
                } else if (var9 == -1 || var2.field459 == -1 || Statics.method31(var9).field918 >= Statics.method31(var2.field459).field918) {
                    var2.field459 = var9;
                    var2.field452 = 0;
                    var2.field490 = 0;
                    var2.field462 = var10;
                    var2.field456 = 0;
                    var2.field483 = var2.field481;
                }
            }
        }
    }

    @ObfuscatedName("a.bh(IIIII)V")
    public static final void method234(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field743; var4++) {
            if (field606[var4] + field547[var4] > arg0 && field606[var4] < arg0 + arg2 && field705[var4] + field703[var4] > arg1 && field703[var4] < arg1 + arg3) {
                field685[var4] = true;
            }
        }
    }

    @ObfuscatedName("cv.bp(IIIIB)V")
    public static final void method1638(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field743; var4++) {
            if (field606[var4] + field547[var4] > arg0 && field606[var4] < arg0 + arg2 && field705[var4] + field703[var4] > arg1 && field703[var4] < arg1 + arg3) {
                field650[var4] = true;
            }
        }
    }

    @ObfuscatedName("ey.bf(S)V")
    public static final void method3104() {
        int var0 = Statics.field787.method3389(class134.field2241);
        for (int var1 = 0; var1 < field520; var1++) {
            int var2 = Statics.field787.method3389(Statics.method163(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field520 * 15 + 21;
        int var4 = class77.field1428 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1429;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field622 = true;
        Statics.field842 = var4;
        Statics.field1785 = var5;
        Statics.field12 = var0;
        Statics.field288 = field520 * 15 + 22;
    }

    @ObfuscatedName("fw.bj(II)Z")
    public static final boolean method3158(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field577[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bd.by(II)V")
    public static final void method1584(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field640[arg0];
        int var2 = field507[arg0];
        int var3 = field577[arg0];
        int var4 = field643[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 8) {
            class25 var5 = field530[var4];
            if (var5 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var5.field482[0], var5.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(26);
                field534.method2633(Statics.field1072);
                field534.method2641(var4);
                field534.method2641(field545);
            }
        }
        if (var3 == 3) {
            method810(var1, var2, var4);
            field534.method2317(12);
            field534.method2466(Statics.field977 + var2);
            field534.method2641(Statics.field272 + var1);
            field534.method2468(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 36) {
            field534.method2317(165);
            field534.method2641(var1);
            field534.method2633(var2);
            field534.method2641(var4);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 18) {
            boolean var6 = method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var6) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field603 = class77.field1428;
            field604 = class77.field1429;
            field665 = 2;
            field684 = 0;
            field534.method2317(253);
            field534.method2467(Statics.field977 + var2);
            field534.method2467(var4);
            field534.method2466(Statics.field272 + var1);
        }
        if (var3 == 1004) {
            field603 = class77.field1428;
            field604 = class77.field1429;
            field665 = 2;
            field684 = 0;
            field534.method2317(64);
            field534.method2467(var4);
        }
        if (var3 == 1005) {
            class158 var8 = class158.method44(var2);
            if (var8 == null || var8.field2689[var1] < 100000) {
                field534.method2317(64);
                field534.method2467(var4);
            } else {
                method1680(0, "", var8.field2689[var1] + " x " + class40.method119(var4).field1036);
            }
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 9) {
            class25 var9 = field530[var4];
            if (var9 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var9.field482[0], var9.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(38);
                field534.method2468(var4);
            }
        }
        if (var3 == 14) {
            class3 var10 = field616[var4];
            if (var10 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var10.field482[0], var10.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(246);
                field534.method2468(Statics.field1138);
                field534.method2477(Statics.field92);
                field534.method2641(var4);
                field534.method2468(Statics.field1324);
            }
        }
        if (var3 == 7) {
            class25 var11 = field530[var4];
            if (var11 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var11.field482[0], var11.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(173);
                field534.method2467(Statics.field1138);
                field534.method2467(var4);
                field534.method2475(Statics.field92);
                field534.method2466(Statics.field1324);
            }
        }
        if (var3 == 50) {
            class3 var12 = field616[var4];
            if (var12 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var12.field482[0], var12.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(60);
                field534.method2466(var4);
            }
        }
        if (var3 == 41) {
            field534.method2317(182);
            field534.method2641(var4);
            field534.method2633(var2);
            field534.method2466(var1);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 48) {
            class3 var13 = field616[var4];
            if (var13 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var13.field482[0], var13.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(85);
                field534.method2466(var4);
            }
        }
        if (var3 == 17) {
            boolean var14 = method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var14) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field603 = class77.field1428;
            field604 = class77.field1429;
            field665 = 2;
            field684 = 0;
            field534.method2317(124);
            field534.method2468(Statics.field977 + var2);
            field534.method2466(field545);
            field534.method2466(Statics.field272 + var1);
            field534.method2475(Statics.field1072);
            field534.method2641(var4);
        }
        if (var3 == 1002) {
            field603 = class77.field1428;
            field604 = class77.field1429;
            field665 = 2;
            field684 = 0;
            field534.method2317(135);
            field534.method2641(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 15) {
            class3 var16 = field616[var4];
            if (var16 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var16.field482[0], var16.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(219);
                field534.method2477(Statics.field1072);
                field534.method2641(var4);
                field534.method2468(field545);
            }
        }
        if (var3 == 51) {
            class3 var17 = field616[var4];
            if (var17 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var17.field482[0], var17.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(69);
                field534.method2466(var4);
            }
        }
        if (var3 == 43) {
            field534.method2317(73);
            field534.method2466(var1);
            field534.method2466(var4);
            field534.method2633(var2);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 16) {
            boolean var18 = method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var18) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field603 = class77.field1428;
            field604 = class77.field1429;
            field665 = 2;
            field684 = 0;
            field534.method2317(195);
            field534.method2476(Statics.field92);
            field534.method2468(Statics.field1138);
            field534.method2468(Statics.field977 + var2);
            field534.method2466(var4);
            field534.method2468(Statics.field272 + var1);
            field534.method2641(Statics.field1324);
        }
        if (var3 == 42) {
            field534.method2317(235);
            field534.method2477(var2);
            field534.method2468(var1);
            field534.method2641(var4);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 57 || var3 == 1007) {
            method1367(var4, var2, var1, field645[arg0]);
        }
        if (var3 == 2 && method810(var1, var2, var4)) {
            field534.method2317(9);
            field534.method2468(var4 >> 14 & 0x7FFF);
            field534.method2467(Statics.field977 + var2);
            field534.method2467(Statics.field272 + var1);
            field534.method2466(field545);
            field534.method2475(Statics.field1072);
        }
        if (var3 == 1003) {
            field603 = class77.field1428;
            field604 = class77.field1429;
            field665 = 2;
            field684 = 0;
            class25 var20 = field530[var4];
            if (var20 != null) {
                class31 var21 = var20.field410;
                if (var21.field822 != null) {
                    var21 = var21.method634();
                }
                if (var21 != null) {
                    field534.method2317(198);
                    field534.method2641(var21.field796);
                }
            }
        }
        if (var3 == 34) {
            field534.method2317(63);
            field534.method2468(var1);
            field534.method2466(var4);
            field534.method2475(var2);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 11) {
            class25 var22 = field530[var4];
            if (var22 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var22.field482[0], var22.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(43);
                field534.method2641(var4);
            }
        }
        if (var3 == 58) {
            field534.method2317(144);
            field534.method2468(field545);
            field534.method2633(var2);
            field534.method2466(var1);
            field534.method2476(Statics.field1072);
        }
        if (var3 == 5) {
            method810(var1, var2, var4);
            field534.method2317(130);
            field534.method2468(Statics.field977 + var2);
            field534.method2641(var4 >> 14 & 0x7FFF);
            field534.method2466(Statics.field272 + var1);
        }
        if (var3 == 13) {
            class25 var23 = field530[var4];
            if (var23 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var23.field482[0], var23.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(120);
                field534.method2467(var4);
            }
        }
        if (var3 == 19) {
            boolean var24 = method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var24) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field603 = class77.field1428;
            field604 = class77.field1429;
            field665 = 2;
            field684 = 0;
            field534.method2317(99);
            field534.method2641(var4);
            field534.method2467(Statics.field272 + var1);
            field534.method2467(Statics.field977 + var2);
        }
        if (var3 == 21) {
            boolean var26 = method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var26) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field603 = class77.field1428;
            field604 = class77.field1429;
            field665 = 2;
            field684 = 0;
            field534.method2317(177);
            field534.method2641(Statics.field272 + var1);
            field534.method2468(var4);
            field534.method2641(Statics.field977 + var2);
        }
        if (var3 == 38) {
            if (field621) {
                class158 var28 = class158.method140(Statics.field1072, field545);
                if (var28 != null && var28.field2616 != null) {
                    class1 var29 = new class1();
                    var29.field2 = var28;
                    var29.field18 = var28.field2616;
                    class26.method227(var29);
                }
                field621 = false;
                method2840(var28);
            }
            class158 var30 = class158.method44(var2);
            field673 = 1;
            Statics.field1138 = var1;
            Statics.field92 = var2;
            Statics.field1324 = var4;
            method2840(var30);
            field549 = class2.method2042(16748608) + class40.method119(var4).field1036 + class2.method2042(16777215);
            if (field549 == null) {
                field549 = "null";
            }
            return;
        }
        if (var3 == 35) {
            field534.method2317(166);
            field534.method2633(var2);
            field534.method2641(var4);
            field534.method2641(var1);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 12) {
            class25 var31 = field530[var4];
            if (var31 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var31.field482[0], var31.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(58);
                field534.method2466(var4);
            }
        }
        if (var3 == 23) {
            Statics.field672.method1979(Statics.field402, var1, var2);
        }
        if (var3 == 1 && method810(var1, var2, var4)) {
            field534.method2317(39);
            field534.method2468(Statics.field272 + var1);
            field534.method2468(Statics.field977 + var2);
            field534.method2633(Statics.field92);
            field534.method2466(Statics.field1324);
            field534.method2468(Statics.field1138);
            field534.method2468(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 39) {
            field534.method2317(209);
            field534.method2641(var4);
            field534.method2468(var1);
            field534.method2477(var2);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 30 && field660 == null) {
            method562(var2, var1);
            field660 = class158.method140(var2, var1);
            method2840(field660);
        }
        if (var3 == 4) {
            method810(var1, var2, var4);
            field534.method2317(133);
            field534.method2467(var4 >> 14 & 0x7FFF);
            field534.method2641(Statics.field272 + var1);
            field534.method2641(Statics.field977 + var2);
        }
        if (var3 == 32) {
            field534.method2317(234);
            field534.method2467(field545);
            field534.method2477(Statics.field1072);
            field534.method2633(var2);
            field534.method2641(var4);
            field534.method2466(var1);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 44) {
            class3 var32 = field616[var4];
            if (var32 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var32.field482[0], var32.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(231);
                field534.method2466(var4);
            }
        }
        if (var3 == 40) {
            field534.method2317(41);
            field534.method2468(var1);
            field534.method2466(var4);
            field534.method2477(var2);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 20) {
            boolean var33 = method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var33) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field603 = class77.field1428;
            field604 = class77.field1429;
            field665 = 2;
            field684 = 0;
            field534.method2317(128);
            field534.method2466(Statics.field977 + var2);
            field534.method2641(Statics.field272 + var1);
            field534.method2466(var4);
        }
        if (var3 == 28) {
            field534.method2317(109);
            field534.method2633(var2);
            class158 var35 = class158.method44(var2);
            if (var35.field2688 != null && var35.field2688[0][0] == 5) {
                int var36 = var35.field2688[0][1];
                class159.field2713[var36] = 1 - class159.field2713[var36];
                method133(var36);
            }
        }
        if (var3 == 25) {
            class158 var37 = class158.method140(var2, var1);
            if (var37 != null) {
                if (field621) {
                    class158 var38 = class158.method140(Statics.field1072, field545);
                    if (var38 != null && var38.field2616 != null) {
                        class1 var39 = new class1();
                        var39.field2 = var38;
                        var39.field18 = var38.field2616;
                        class26.method227(var39);
                    }
                    field621 = false;
                    method2840(var38);
                }
                int var40 = class162.method1532(method5(var37));
                class158 var41 = class158.method140(var2, var1);
                if (var41 != null && var41.field2670 != null) {
                    class1 var42 = new class1();
                    var42.field2 = var41;
                    var42.field18 = var41.field2670;
                    class26.method227(var42);
                }
                field621 = true;
                Statics.field1072 = var2;
                field545 = var1;
                Statics.field1303 = var40;
                method2840(var41);
                field673 = 0;
                field581 = method164(var37);
                if (field581 == null) {
                    field581 = "Null";
                }
                if (var37.field2660) {
                    field730 = var37.field2630 + class2.method2042(16777215);
                } else {
                    field730 = class2.method2042(65280) + var37.field2692 + class2.method2042(16777215);
                }
            }
            return;
        }
        if (var3 == 22) {
            boolean var43 = method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var43) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field603 = class77.field1428;
            field604 = class77.field1429;
            field665 = 2;
            field684 = 0;
            field534.method2317(220);
            field534.method2466(Statics.field272 + var1);
            field534.method2641(var4);
            field534.method2641(Statics.field977 + var2);
        }
        if (var3 == 46) {
            class3 var45 = field616[var4];
            if (var45 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var45.field482[0], var45.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(191);
                field534.method2466(var4);
            }
        }
        if (var3 == 49) {
            class3 var46 = field616[var4];
            if (var46 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var46.field482[0], var46.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(1);
                field534.method2641(var4);
            }
        }
        if (var3 == 47) {
            class3 var47 = field616[var4];
            if (var47 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var47.field482[0], var47.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(61);
                field534.method2641(var4);
            }
        }
        if (var3 == 29) {
            field534.method2317(109);
            field534.method2633(var2);
            class158 var48 = class158.method44(var2);
            if (var48.field2688 != null && var48.field2688[0][0] == 5) {
                int var49 = var48.field2688[0][1];
                if (class159.field2713[var49] != var48.field2608[0]) {
                    class159.field2713[var49] = var48.field2608[0];
                    method133(var49);
                }
            }
        }
        if (var3 == 24) {
            class158 var50 = class158.method44(var2);
            boolean var51 = true;
            if (var50.field2701 > 0) {
                var51 = method45(var50);
            }
            if (var51) {
                field534.method2317(109);
                field534.method2633(var2);
            }
        }
        if (var3 == 26) {
            field534.method2317(213);
            for (class4 var52 = (class4) field719.method3310(); var52 != null; var52 = (class4) field719.method3305()) {
                if (var52.field64 == 0 || var52.field64 == 3) {
                    method52(var52, true);
                }
            }
            if (field660 != null) {
                method2840(field660);
                field660 = null;
            }
        }
        if (var3 == 37) {
            field534.method2317(6);
            field534.method2467(var1);
            field534.method2468(var4);
            field534.method2477(var2);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 1001) {
            method810(var1, var2, var4);
            field534.method2317(138);
            field534.method2467(Statics.field272 + var1);
            field534.method2467(Statics.field977 + var2);
            field534.method2466(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 33) {
            field534.method2317(119);
            field534.method2467(var1);
            field534.method2466(var4);
            field534.method2477(var2);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (var3 == 6) {
            method810(var1, var2, var4);
            field534.method2317(236);
            field534.method2467(Statics.field977 + var2);
            field534.method2467(Statics.field272 + var1);
            field534.method2468(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 45) {
            class3 var53 = field616[var4];
            if (var53 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var53.field482[0], var53.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(250);
                field534.method2641(var4);
            }
        }
        if (var3 == 10) {
            class25 var54 = field530[var4];
            if (var54 != null) {
                method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var54.field482[0], var54.field472[0], false, 0, 0, 1, 1, 0, 2);
                field603 = class77.field1428;
                field604 = class77.field1429;
                field665 = 2;
                field684 = 0;
                field534.method2317(24);
                field534.method2641(var4);
            }
        }
        if (var3 == 31) {
            field534.method2317(215);
            field534.method2467(Statics.field1138);
            field534.method2476(var2);
            field534.method2475(Statics.field92);
            field534.method2641(Statics.field1324);
            field534.method2641(var1);
            field534.method2466(var4);
            field607 = 0;
            Statics.field937 = class158.method44(var2);
            field608 = var1;
        }
        if (field673 != 0) {
            field673 = 0;
            method2840(class158.method44(Statics.field92));
        }
        if (field621 && field621) {
            class158 var55 = class158.method140(Statics.field1072, field545);
            if (var55 != null && var55.field2616 != null) {
                class1 var56 = new class1();
                var56.field2 = var55;
                var56.field18 = var55.field2616;
                class26.method227(var56);
            }
            field621 = false;
            method2840(var55);
        }
        if (Statics.field937 != null && field607 == 0) {
            method2840(Statics.field937);
        }
    }

    @ObfuscatedName("ak.bz(III)V")
    public static void method562(int arg0, int arg1) {
        field534.method2317(82);
        field534.method2633(arg0);
        field534.method2467(arg1);
    }

    @ObfuscatedName("bq.bv(IIILjava/lang/String;B)V")
    public static void method1367(int arg0, int arg1, int arg2, String arg3) {
        class158 var4 = class158.method140(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2679 != null) {
            class1 var5 = new class1();
            var5.field2 = var4;
            var5.field21 = arg0;
            var5.field9 = arg3;
            var5.field18 = var4.field2679;
            class26.method227(var5);
        }
        boolean var6 = true;
        if (var4.field2701 > 0) {
            var6 = method45(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = method5(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field534.method2317(86);
            field534.method2633(arg1);
            field534.method2641(arg2);
        }
        if (arg0 == 2) {
            field534.method2317(223);
            field534.method2633(arg1);
            field534.method2641(arg2);
        }
        if (arg0 == 3) {
            field534.method2317(237);
            field534.method2633(arg1);
            field534.method2641(arg2);
        }
        if (arg0 == 4) {
            field534.method2317(164);
            field534.method2633(arg1);
            field534.method2641(arg2);
        }
        if (arg0 == 5) {
            field534.method2317(132);
            field534.method2633(arg1);
            field534.method2641(arg2);
        }
        if (arg0 == 6) {
            field534.method2317(200);
            field534.method2633(arg1);
            field534.method2641(arg2);
        }
        if (arg0 == 7) {
            field534.method2317(221);
            field534.method2633(arg1);
            field534.method2641(arg2);
        }
        if (arg0 == 8) {
            field534.method2317(113);
            field534.method2633(arg1);
            field534.method2641(arg2);
        }
        if (arg0 == 9) {
            field534.method2317(104);
            field534.method2633(arg1);
            field534.method2641(arg2);
        }
        if (arg0 == 10) {
            field534.method2317(239);
            field534.method2633(arg1);
            field534.method2641(arg2);
        }
    }

    @ObfuscatedName("cn.ba(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1683(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field622 || field520 >= 500) {
            return;
        }
        field644[field520] = arg0;
        field645[field520] = arg1;
        field577[field520] = arg2;
        field643[field520] = arg3;
        field640[field520] = arg4;
        field507[field520] = arg5;
        field520++;
    }

    @ObfuscatedName("c.bu(IIIII)V")
    public static final void method30(int arg0, int arg1, int arg2, int arg3) {
        if (field673 == 0 && !field621) {
            method1683(class134.field2125, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class112.field1936; var5++) {
            int var6 = class112.field1882[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field672.method1910(Statics.field402, var7, var8, var6) >= 0) {
                    class32 var11 = class32.method1876(var10);
                    if (var11.field875 != null) {
                        var11 = var11.method667();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field673 == 1) {
                        method1683(class134.field2239, field549 + " " + class2.field27 + " " + class2.method2042(65535) + var11.field859, 1, var6, var7, var8);
                    } else if (!field621) {
                        String[] var12 = var11.field848;
                        if (field666) {
                            var12 = method242(var12);
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
                                    method1683(var12[var13], class2.method2042(65535) + var11.field859, var14, var6, var7, var8);
                                }
                            }
                        }
                        method1683(class134.field2240, class2.method2042(65535) + var11.field859, 1002, var11.field840 << 14, var7, var8);
                    } else if ((Statics.field1303 & 0x4) == 4) {
                        method1683(field581, field730 + " " + class2.field27 + " " + class2.method2042(65535) + var11.field859, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class25 var15 = field530[var10];
                    if (var15.field410.field798 == 1 && (var15.field431 & 0x7F) == 64 && (var15.field440 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field695; var16++) {
                            class25 var17 = field530[field532[var16]];
                            if (var17 != null && var15 != var17 && var17.field410.field798 == 1 && var15.field431 == var17.field431 && var15.field440 == var17.field440) {
                                method24(var17.field410, field532[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field642; var18++) {
                            class3 var19 = field616[field491[var18]];
                            if (var19 != null && var15.field431 == var19.field431 && var15.field440 == var19.field440) {
                                method862(var19, field491[var18], var7, var8);
                            }
                        }
                    }
                    method24(var15.field410, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field616[var10];
                    if ((var20.field431 & 0x7F) == 64 && (var20.field440 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field695; var21++) {
                            class25 var22 = field530[field532[var21]];
                            if (var22 != null && var22.field410.field798 == 1 && var20.field431 == var22.field431 && var20.field440 == var22.field440) {
                                method24(var22.field410, field532[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field642; var23++) {
                            class3 var24 = field616[field491[var23]];
                            if (var24 != null && var20 != var24 && var20.field431 == var24.field431 && var20.field440 == var24.field440) {
                                method862(var24, field491[var23], var7, var8);
                            }
                        }
                    }
                    method862(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field630[Statics.field402][var7][var8];
                    if (var25 != null) {
                        for (class17 var26 = (class17) var25.method3323(); var26 != null; var26 = (class17) var25.method3325()) {
                            class40 var27 = class40.method119(var26.field270);
                            if (field673 == 1) {
                                method1683(class134.field2239, field549 + " " + class2.field27 + " " + class2.method2042(16748608) + var27.field1036, 16, var26.field270, var7, var8);
                            } else if (!field621) {
                                String[] var28 = var27.field1027;
                                if (field666) {
                                    var28 = method242(var28);
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
                                        method1683(var28[var29], class2.method2042(16748608) + var27.field1036, var30, var26.field270, var7, var8);
                                    } else if (var29 == 2) {
                                        method1683(class134.field2173, class2.method2042(16748608) + var27.field1036, 20, var26.field270, var7, var8);
                                    }
                                }
                                method1683(class134.field2240, class2.method2042(16748608) + var27.field1036, 1004, var26.field270, var7, var8);
                            } else if ((Statics.field1303 & 0x1) == 1) {
                                method1683(field581, field730 + " " + class2.field27 + " " + class2.method2042(16748608) + var27.field1036, 17, var26.field270, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.bx(Lav;IIII)V")
    public static final void method24(class31 arg0, int arg1, int arg2, int arg3) {
        if (field520 >= 400) {
            return;
        }
        if (arg0.field822 != null) {
            arg0 = arg0.method634();
        }
        if (arg0 == null || !arg0.field831) {
            return;
        }
        String var4 = arg0.field810;
        if (arg0.field829 != 0) {
            int var6 = arg0.field829;
            int var7 = Statics.field1431.field40;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2042(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2042(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2042(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2042(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2042(65280);
            } else if (var8 > 6) {
                var9 = class2.method2042(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2042(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2042(12648192);
            } else {
                var9 = class2.method2042(16776960);
            }
            var4 = var4 + var9 + " " + class2.field25 + class134.field2170 + arg0.field829 + class2.field26;
        }
        if (field673 == 1) {
            method1683(class134.field2239, field549 + " " + class2.field27 + " " + class2.method2042(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field621) {
            String[] var10 = arg0.field812;
            if (field666) {
                var10 = method242(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class134.field2284)) {
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
                        method1683(var10[var11], class2.method2042(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class134.field2284)) {
                        short var14 = 0;
                        if (arg0.field829 > Statics.field1431.field40) {
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
                        method1683(var10[var13], class2.method2042(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method1683(class134.field2240, class2.method2042(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1303 & 0x2) == 2) {
            method1683(field581, field730 + " " + class2.field27 + " " + class2.method2042(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ac.bd(Lc;IIII)V")
    public static final void method862(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1431 == arg0 || field520 >= 400) {
            return;
        }
        String var9;
        if (arg0.field45 == 0) {
            String var4 = arg0.field51;
            int var5 = arg0.field40;
            int var6 = Statics.field1431.field40;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2042(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2042(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2042(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2042(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2042(65280);
            } else if (var7 > 6) {
                var8 = class2.method2042(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2042(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2042(12648192);
            } else {
                var8 = class2.method2042(16776960);
            }
            var9 = var4 + var8 + " " + class2.field25 + class134.field2170 + arg0.field40 + class2.field26;
        } else {
            var9 = arg0.field51 + " " + class2.field25 + class134.field2246 + arg0.field45 + class2.field26;
        }
        if (field673 == 1) {
            method1683(class134.field2239, field549 + " " + class2.field27 + " " + class2.method2042(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field621) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field627[var10] != null) {
                    short var11 = 0;
                    if (field627[var10].equalsIgnoreCase(class134.field2284)) {
                        if (arg0.field40 > Statics.field1431.field40) {
                            var11 = 2000;
                        }
                        if (Statics.field1431.field54 != 0 && arg0.field54 != 0) {
                            if (Statics.field1431.field54 == arg0.field54) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field628[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field626[var10] + var11;
                    method1683(field627[var10], class2.method2042(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1303 & 0x8) == 8) {
            method1683(field581, field730 + " " + class2.field27 + " " + class2.method2042(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field520; var14++) {
            if (field577[var14] == 23) {
                field645[var14] = class2.method2042(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("dq.be(IIIIIIIII)V")
    public static final void method2312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class158.method2694(arg0)) {
            Statics.field1484 = null;
            method1368(Statics.field2708[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1484 != null) {
                method1368(Statics.field1484, -1412584499, arg1, arg2, arg3, arg4, Statics.field315, Statics.field39, arg7);
                Statics.field1484 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field685[var8] = true;
            }
        } else {
            field685[arg7] = true;
        }
    }

    @ObfuscatedName("bq.cz([Lfs;IIIIIIIII)V")
    public static final void method1368(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1794(arg2, arg3, arg4, arg5);
        class104.method2142();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2603 == arg1 || arg1 == -1412584499 && field667 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field606[field743] = var10.field2597 + arg6;
                    field703[field743] = var10.field2598 + arg7;
                    field547[field743] = var10.field2601;
                    field705[field743] = var10.field2650;
                    var11 = ++field743 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2707 = var11;
                var10.field2678 = field652;
                if (!var10.field2660 || !method2415(var10)) {
                    if (var10.field2701 > 0) {
                        method2045(var10);
                    }
                    int var12 = var10.field2597 + arg6;
                    int var13 = var10.field2598 + arg7;
                    int var14 = var10.field2614;
                    if (field667 == var10) {
                        if (arg1 != -1412584499 && !var10.field2704) {
                            Statics.field1484 = arg0;
                            Statics.field315 = arg6;
                            Statics.field39 = arg7;
                            continue;
                        }
                        if (field678 && field560) {
                            int var15 = class77.field1419;
                            int var16 = class77.field1422;
                            int var17 = var15 - field669;
                            int var18 = var16 - field670;
                            if (var17 < field610) {
                                var17 = field610;
                            }
                            if (var10.field2601 + var17 > field610 + field668.field2601) {
                                var17 = field610 + field668.field2601 - var10.field2601;
                            }
                            if (var18 < field674) {
                                var18 = field674;
                            }
                            if (var10.field2650 + var18 > field674 + field668.field2650) {
                                var18 = field674 + field668.field2650 - var10.field2650;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2704) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2612 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2612 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2601 + var12;
                        int var26 = var10.field2650 + var13;
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
                        int var29 = var10.field2601 + var12;
                        int var30 = var10.field2650 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2660 || var19 < var21 && var20 < var22) {
                        if (var10.field2701 != 0) {
                            if (var10.field2701 == 1337) {
                                field646 = var12;
                                field503 = var13;
                                method151(var12, var13, var10.field2601, var10.field2650);
                                class89.method1794(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2701 == 1338) {
                                method239(var12, var13, var11);
                                class89.method1794(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var31 = class77.field1419;
                        int var32 = class77.field1422;
                        if (!field622 && var31 >= var19 && var32 >= var20 && var31 < var21 && var32 < var22) {
                            method3154(var10, var31 - var12, var32 - var13);
                        }
                        if (var10.field2612 == 0) {
                            if (!var10.field2660 && method2415(var10) && Statics.field202 != var10) {
                                continue;
                            }
                            if (!var10.field2660) {
                                if (var10.field2587 > var10.field2588 - var10.field2650) {
                                    var10.field2587 = var10.field2588 - var10.field2650;
                                }
                                if (var10.field2587 < 0) {
                                    var10.field2587 = 0;
                                }
                            }
                            method1368(arg0, var10.field2592, var19, var20, var21, var22, var12 - var10.field2605, var13 - var10.field2587, var11);
                            if (var10.field2700 != null) {
                                method1368(var10.field2700, var10.field2592, var19, var20, var21, var22, var12 - var10.field2605, var13 - var10.field2587, var11);
                            }
                            class4 var33 = (class4) field719.method3301((long) var10.field2592);
                            if (var33 != null) {
                                if (var33.field64 == 0 && class77.field1419 >= var19 && class77.field1422 >= var20 && class77.field1419 < var21 && class77.field1422 < var22 && !field622 && !field754) {
                                    field644[0] = class134.field2312;
                                    field645[0] = "";
                                    field577[0] = 1006;
                                    field520 = 1;
                                }
                                method2312(var33.field68, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class89.method1794(arg2, arg3, arg4, arg5);
                            class104.method2142();
                        }
                        if (field701[var11] || field706 > 1) {
                            if (var10.field2612 == 0 && !var10.field2660 && var10.field2588 > var10.field2650) {
                                method1875(var10.field2601 + var12, var13, var10.field2587, var10.field2650, var10.field2588);
                            }
                            if (var10.field2612 != 1) {
                                if (var10.field2612 == 2) {
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < var10.field2650; var35++) {
                                        for (int var36 = 0; var36 < var10.field2601; var36++) {
                                            int var37 = (var10.field2645 + 32) * var36 + var12;
                                            int var38 = (var10.field2646 + 32) * var35 + var13;
                                            if (var34 < 20) {
                                                var37 += var10.field2693[var34];
                                                var38 += var10.field2648[var34];
                                            }
                                            if (var10.field2585[var34] > 0) {
                                                boolean var39 = false;
                                                boolean var40 = false;
                                                int var41 = var10.field2585[var34] - 1;
                                                if (var37 + 32 > arg2 && var37 < arg4 && var38 + 32 > arg3 && var38 < arg5 || Statics.field763 == var10 && field609 == var34) {
                                                    class86 var42;
                                                    if (field673 == 1 && Statics.field1138 == var34 && Statics.field92 == var10.field2592) {
                                                        var42 = class40.method32(var41, var10.field2689[var34], 2, 0, false);
                                                    } else {
                                                        var42 = class40.method32(var41, var10.field2689[var34], 1, 3153952, false);
                                                    }
                                                    if (var42 == null) {
                                                        method2840(var10);
                                                    } else if (Statics.field763 == var10 && field609 == var34) {
                                                        int var43 = class77.field1419 - field512;
                                                        int var44 = class77.field1422 - field611;
                                                        if (var43 < 5 && var43 > -5) {
                                                            var43 = 0;
                                                        }
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (field614 < 5) {
                                                            var43 = 0;
                                                            var44 = 0;
                                                        }
                                                        var42.method1702(var37 + var43, var38 + var44, 128);
                                                        if (arg1 != -1) {
                                                            class158 var45 = arg0[arg1 & 0xFFFF];
                                                            if (var38 + var44 < class89.field1527 && var45.field2587 > 0) {
                                                                int var46 = field574 * (class89.field1527 - var38 - var44) / 3;
                                                                if (var46 > field574 * 10) {
                                                                    var46 = field574 * 10;
                                                                }
                                                                if (var46 > var45.field2587) {
                                                                    var46 = var45.field2587;
                                                                }
                                                                var45.field2587 -= var46;
                                                                field611 += var46;
                                                                method2840(var45);
                                                            }
                                                            if (var38 + var44 + 32 > class89.field1528 && var45.field2587 < var45.field2588 - var45.field2650) {
                                                                int var47 = field574 * (var38 + var44 + 32 - class89.field1528) / 3;
                                                                if (var47 > field574 * 10) {
                                                                    var47 = field574 * 10;
                                                                }
                                                                if (var47 > var45.field2588 - var45.field2650 - var45.field2587) {
                                                                    var47 = var45.field2588 - var45.field2650 - var45.field2587;
                                                                }
                                                                var45.field2587 += var47;
                                                                field611 -= var47;
                                                                method2840(var45);
                                                            }
                                                        }
                                                    } else if (Statics.field937 == var10 && field608 == var34) {
                                                        var42.method1702(var37, var38, 128);
                                                    } else {
                                                        var42.method1696(var37, var38);
                                                    }
                                                }
                                            } else if (var10.field2649 != null && var34 < 20) {
                                                class86 var48 = var10.method3119(var34);
                                                if (var48 != null) {
                                                    var48.method1696(var37, var38);
                                                } else if (class158.field2590) {
                                                    method2840(var10);
                                                }
                                            }
                                            var34++;
                                        }
                                    }
                                } else if (var10.field2612 == 3) {
                                    int var49;
                                    if (method1568(var10)) {
                                        var49 = var10.field2694;
                                        if (Statics.field202 == var10 && var10.field2702 != 0) {
                                            var49 = var10.field2702;
                                        }
                                    } else {
                                        var49 = var10.field2609;
                                        if (Statics.field202 == var10 && var10.field2611 != 0) {
                                            var49 = var10.field2611;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2663) {
                                            class89.method1800(var12, var13, var10.field2601, var10.field2650, var49);
                                        } else {
                                            class89.method1802(var12, var13, var10.field2601, var10.field2650, var49);
                                        }
                                    } else if (var10.field2663) {
                                        class89.method1840(var12, var13, var10.field2601, var10.field2650, var49, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1803(var12, var13, var10.field2601, var10.field2650, var49, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2612 == 4) {
                                    class183 var50 = var10.method3118();
                                    if (var50 != null) {
                                        String var51 = var10.field2639;
                                        int var52;
                                        if (method1568(var10)) {
                                            var52 = var10.field2694;
                                            if (Statics.field202 == var10 && var10.field2702 != 0) {
                                                var52 = var10.field2702;
                                            }
                                            if (var10.field2640.length() > 0) {
                                                var51 = var10.field2640;
                                            }
                                        } else {
                                            var52 = var10.field2609;
                                            if (Statics.field202 == var10 && var10.field2611 != 0) {
                                                var52 = var10.field2611;
                                            }
                                        }
                                        if (var10.field2660 && var10.field2696 != -1) {
                                            class40 var53 = class40.method119(var10.field2696);
                                            var51 = var53.field1036;
                                            if (var51 == null) {
                                                var51 = "null";
                                            }
                                            if ((var53.field1024 == 1 || var10.field2697 != 1) && var10.field2697 != -1) {
                                                var51 = class2.method2042(16748608) + var51 + class2.field29 + " " + 'x' + method122(var10.field2697);
                                            }
                                        }
                                        if (field660 == var10) {
                                            class134 var10000 = (class134) null;
                                            var51 = class134.field2099;
                                            var52 = var10.field2609;
                                        }
                                        if (!var10.field2660) {
                                            var51 = method2314(var51, var10);
                                        }
                                        var50.method3454(var51, var12, var13, var10.field2601, var10.field2650, var52, var10.field2644 ? 0 : -1, var10.field2642, var10.field2661, var10.field2647);
                                    } else if (class158.field2590) {
                                        method2840(var10);
                                    }
                                } else if (var10.field2612 == 5) {
                                    if (var10.field2660) {
                                        class86 var55;
                                        if (var10.field2696 == -1) {
                                            var55 = var10.method3117(false);
                                        } else {
                                            var55 = class40.method32(var10.field2696, var10.field2697, var10.field2620, var10.field2602, false);
                                        }
                                        if (var55 != null) {
                                            int var56 = var55.field1508;
                                            int var57 = var55.field1509;
                                            if (var10.field2619) {
                                                class89.method1795(var12, var13, var10.field2601 + var12, var10.field2650 + var13);
                                                int var58 = (var10.field2601 + (var56 - 1)) / var56;
                                                int var59 = (var10.field2650 + (var57 - 1)) / var57;
                                                for (int var60 = 0; var60 < var58; var60++) {
                                                    for (int var61 = 0; var61 < var59; var61++) {
                                                        if (var10.field2618 != 0) {
                                                            var55.method1708(var56 / 2 + var56 * var60 + var12, var57 / 2 + var57 * var61 + var13, var10.field2618, 4096);
                                                        } else if (var14 == 0) {
                                                            var55.method1696(var56 * var60 + var12, var57 * var61 + var13);
                                                        } else {
                                                            var55.method1702(var56 * var60 + var12, var57 * var61 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1794(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var62 = var10.field2601 * 4096 / var56;
                                                if (var10.field2618 != 0) {
                                                    var55.method1708(var10.field2601 / 2 + var12, var10.field2650 / 2 + var13, var10.field2618, var62);
                                                } else if (var14 != 0) {
                                                    var55.method1704(var12, var13, var10.field2601, var10.field2650, 256 - (var14 & 0xFF));
                                                } else if (var10.field2601 == var56 && var10.field2650 == var57) {
                                                    var55.method1696(var12, var13);
                                                } else {
                                                    var55.method1751(var12, var13, var10.field2601, var10.field2650);
                                                }
                                            }
                                        } else if (class158.field2590) {
                                            method2840(var10);
                                        }
                                    } else {
                                        class86 var54 = var10.method3117(method1568(var10));
                                        if (var54 != null) {
                                            var54.method1696(var12, var13);
                                        } else if (class158.field2590) {
                                            method2840(var10);
                                        }
                                    }
                                } else if (var10.field2612 == 6) {
                                    boolean var63 = method1568(var10);
                                    int var64;
                                    if (var63) {
                                        var64 = var10.field2629;
                                    } else {
                                        var64 = var10.field2628;
                                    }
                                    class112 var65 = null;
                                    int var66 = 0;
                                    if (var10.field2696 != -1) {
                                        class40 var67 = class40.method119(var10.field2696);
                                        if (var67 != null) {
                                            class40 var68 = var67.method871(var10.field2697);
                                            var65 = var68.method886(1);
                                            if (var65 == null) {
                                                method2840(var10);
                                            } else {
                                                var65.method2238();
                                                var66 = var65.field1588 / 2;
                                            }
                                        }
                                    } else if (var10.field2624 == 5) {
                                        if (var10.field2596 == 0) {
                                            var65 = field598.method3191((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var65 = Statics.field1431.method18();
                                        }
                                    } else if (var64 == -1) {
                                        var65 = var10.method3120((class34) null, -1, var63, Statics.field1431.field37);
                                        if (var65 == null && class158.field2590) {
                                            method2840(var10);
                                        }
                                    } else {
                                        class34 var69 = Statics.method31(var64);
                                        var65 = var10.method3120(var69, var10.field2698, var63, Statics.field1431.field37);
                                        if (var65 == null && class158.field2590) {
                                            method2840(var10);
                                        }
                                    }
                                    class104.method2141(var10.field2601 / 2 + var12, var10.field2650 / 2 + var13);
                                    int var70 = var10.field2655 * class104.field1814[var10.field2632] >> 16;
                                    int var71 = var10.field2655 * class104.field1815[var10.field2632] >> 16;
                                    if (var65 != null) {
                                        if (var10.field2660) {
                                            var65.method2238();
                                            if (var10.field2683) {
                                                var65.method2251(0, var10.field2633, var10.field2634, var10.field2632, var10.field2652, var10.field2695 + var66 + var70, var10.field2695 + var71, var10.field2655);
                                            } else {
                                                var65.method2250(0, var10.field2633, var10.field2634, var10.field2632, var10.field2652, var10.field2695 + var66 + var70, var10.field2695 + var71);
                                            }
                                        } else {
                                            var65.method2250(0, var10.field2633, 0, var10.field2632, 0, var70, var71);
                                        }
                                    }
                                    class104.method2148();
                                } else {
                                    if (var10.field2612 == 7) {
                                        class183 var72 = var10.method3118();
                                        if (var72 == null) {
                                            if (class158.field2590) {
                                                method2840(var10);
                                            }
                                            continue;
                                        }
                                        int var73 = 0;
                                        for (int var74 = 0; var74 < var10.field2650; var74++) {
                                            for (int var75 = 0; var75 < var10.field2601; var75++) {
                                                if (var10.field2585[var73] > 0) {
                                                    class40 var76 = class40.method119(var10.field2585[var73] - 1);
                                                    String var77;
                                                    if (var76.field1024 != 1 && var10.field2689[var73] == 1) {
                                                        var77 = class2.method2042(16748608) + var76.field1036 + class2.field29;
                                                    } else {
                                                        var77 = class2.method2042(16748608) + var76.field1036 + class2.field29 + " " + 'x' + method122(var10.field2689[var73]);
                                                    }
                                                    int var78 = (var10.field2645 + 115) * var75 + var12;
                                                    int var79 = (var10.field2646 + 12) * var74 + var13;
                                                    if (var10.field2642 == 0) {
                                                        var72.method3442(var77, var78, var79, var10.field2609, var10.field2644 ? 0 : -1);
                                                    } else if (var10.field2642 == 1) {
                                                        var72.method3438(var77, var10.field2601 / 2 + var78, var79, var10.field2609, var10.field2644 ? 0 : -1);
                                                    } else {
                                                        var72.method3413(var77, var10.field2601 + var78 - 1, var79, var10.field2609, var10.field2644 ? 0 : -1);
                                                    }
                                                }
                                                var73++;
                                            }
                                        }
                                    }
                                    if (var10.field2612 == 8 && Statics.field30 == var10 && field649 == field605) {
                                        int var80 = 0;
                                        int var81 = 0;
                                        class183 var82 = Statics.field130;
                                        String var83 = var10.field2639;
                                        String var84 = method2314(var83, var10);
                                        while (var84.length() > 0) {
                                            int var85 = var84.indexOf(class2.field28);
                                            String var86;
                                            if (var85 == -1) {
                                                var86 = var84;
                                                var84 = "";
                                            } else {
                                                var86 = var84.substring(0, var85);
                                                var84 = var84.substring(var85 + 4);
                                            }
                                            int var87 = var82.method3389(var86);
                                            if (var87 > var80) {
                                                var80 = var87;
                                            }
                                            var81 += var82.field2841 + 1;
                                        }
                                        var80 += 6;
                                        var81 += 7;
                                        int var88 = var10.field2601 + var12 - 5 - var80;
                                        int var89 = var10.field2650 + var13 + 5;
                                        if (var88 < var12 + 5) {
                                            var88 = var12 + 5;
                                        }
                                        if (var80 + var88 > arg4) {
                                            var88 = arg4 - var80;
                                        }
                                        if (var81 + var89 > arg5) {
                                            var89 = arg5 - var81;
                                        }
                                        class89.method1800(var88, var89, var80, var81, 16777120);
                                        class89.method1802(var88, var89, var80, var81, 0);
                                        String var90 = var10.field2639;
                                        int var91 = var82.field2841 + var89 + 2;
                                        String var92 = method2314(var90, var10);
                                        while (var92.length() > 0) {
                                            int var93 = var92.indexOf(class2.field28);
                                            String var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = "";
                                            } else {
                                                var94 = var92.substring(0, var93);
                                                var92 = var92.substring(var93 + 4);
                                            }
                                            var82.method3442(var94, var88 + 3, var91, 0, -1);
                                            var91 += var82.field2841 + 1;
                                        }
                                    }
                                    if (var10.field2612 == 9) {
                                        if (var10.field2615 == 1) {
                                            class89.method1821(var12, var13, var10.field2601 + var12, var10.field2650 + var13, var10.field2609);
                                        } else {
                                            int var95 = var10.field2601 >= 0 ? var10.field2601 : -var10.field2601;
                                            int var96 = var10.field2650 >= 0 ? var10.field2650 : -var10.field2650;
                                            int var97 = var95;
                                            if (var95 < var96) {
                                                var97 = var96;
                                            }
                                            if (var97 != 0) {
                                                int var98 = (var10.field2601 << 16) / var97;
                                                int var99 = (var10.field2650 << 16) / var97;
                                                if (var99 <= var98) {
                                                    var98 = -var98;
                                                } else {
                                                    var99 = -var99;
                                                }
                                                int var100 = var10.field2615 * var99 >> 17;
                                                int var101 = var10.field2615 * var99 + 1 >> 17;
                                                int var102 = var10.field2615 * var98 >> 17;
                                                int var103 = var10.field2615 * var98 + 1 >> 17;
                                                int var104 = var12 + var100;
                                                int var105 = var12 - var101;
                                                int var106 = var10.field2601 + var12 - var101;
                                                int var107 = var10.field2601 + var12 + var100;
                                                int var108 = var13 + var102;
                                                int var109 = var13 - var103;
                                                int var110 = var10.field2650 + var13 - var103;
                                                int var111 = var10.field2650 + var13 + var102;
                                                class104.method2149(var104, var105, var106);
                                                class104.method2152(var108, var109, var110, var104, var105, var106, var10.field2609);
                                                class104.method2149(var104, var106, var107);
                                                class104.method2152(var108, var110, var111, var104, var106, var107, var10.field2609);
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

    @ObfuscatedName("dq.cm(Ljava/lang/String;Lfs;I)Ljava/lang/String;")
    public static String method2314(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method231(method2209(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1 != null) {
                    int var6 = Statics.field1.field1448;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field1.field1442 != null) {
                        var5 = (String) Statics.field1.field1442;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.cw(II)Ljava/lang/String;")
    public static final String method122(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field23 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2042(65408) + var1.substring(0, var1.length() - 8) + class134.field2260 + " " + class2.field25 + var1 + class2.field26 + class2.field29;
        } else if (var1.length() > 6) {
            return " " + class2.method2042(16777215) + var1.substring(0, var1.length() - 4) + class134.field2252 + " " + class2.field25 + var1 + class2.field26 + class2.field29;
        } else {
            return " " + class2.method2042(16776960) + var1 + class2.field29;
        }
    }

    @ObfuscatedName("cq.cs(IIIIII)V")
    public static final void method1875(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field285[0].method1780(arg0, arg1);
        Statics.field285[1].method1780(arg0, arg1 + arg3 - 16);
        class89.method1800(arg0, arg1 + 16, 16, arg3 - 32, field496);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1800(arg0, arg1 + 16 + var6, 16, var5, field576);
        class89.method1806(arg0, arg1 + 16 + var6, var5, field578);
        class89.method1806(arg0 + 1, arg1 + 16 + var6, var5, field578);
        class89.method1804(arg0, arg1 + 16 + var6, 16, field578);
        class89.method1804(arg0, arg1 + 17 + var6, 16, field578);
        class89.method1806(arg0 + 15, arg1 + 16 + var6, var5, field718);
        class89.method1806(arg0 + 14, arg1 + 17 + var6, var5 - 1, field718);
        class89.method1804(arg0, arg1 + 15 + var6 + var5, 16, field718);
        class89.method1804(arg0 + 1, arg1 + 14 + var6 + var5, 15, field718);
    }

    @ObfuscatedName("a.cv(IB)Ljava/lang/String;")
    public static final String method231(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("bd.cu(Lfs;I)Z")
    public static final boolean method1568(class158 arg0) {
        if (arg0.field2703 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2703.length; var1++) {
            int var2 = method2209(arg0, var1);
            int var3 = arg0.field2608[var1];
            if (arg0.field2703[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2703[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2703[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dt.cn(Lfs;IB)I")
    public static final int method2209(class158 arg0, int arg1) {
        if (arg0.field2688 == null || arg1 >= arg0.field2688.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2688[arg1];
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
                    var7 = field634[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field635[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field636[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class158 var11 = class158.method44(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method119(var12).field1009 || field582)) {
                        for (int var13 = 0; var13 < var11.field2585.length; var13++) {
                            if (var12 + 1 == var11.field2585[var13]) {
                                var7 += var11.field2689[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2713[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2063[field635[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2713[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1431.field40;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2065[var14]) {
                            var7 += field635[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method44(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method119(var18).field1009 || field582)) {
                        for (int var19 = 0; var19 < var17.field2585.length; var19++) {
                            if (var18 + 1 == var17.field2585[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field661;
                }
                if (var6 == 12) {
                    var7 = field662;
                }
                if (var6 == 13) {
                    int var20 = class159.field2713[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method2232(var22);
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
                    var7 = (Statics.field1431.field431 >> 7) + Statics.field272;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1431.field440 >> 7) + Statics.field977;
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

    @ObfuscatedName("fw.ce(Lfs;IIB)V")
    public static final void method3154(class158 arg0, int arg1, int arg2) {
        if (arg0.field2586 == 1) {
            method1683(arg0.field2671, "", 24, 0, 0, arg0.field2592);
        }
        if (arg0.field2586 == 2 && !field621) {
            String var3 = method164(arg0);
            if (var3 != null) {
                method1683(var3, class2.method2042(65280) + arg0.field2692, 25, 0, -1, arg0.field2592);
            }
        }
        if (arg0.field2586 == 3) {
            method1683(class134.field2248, "", 26, 0, 0, arg0.field2592);
        }
        if (arg0.field2586 == 4) {
            method1683(arg0.field2671, "", 28, 0, 0, arg0.field2592);
        }
        if (arg0.field2586 == 5) {
            method1683(arg0.field2671, "", 29, 0, 0, arg0.field2592);
        }
        if (arg0.field2586 == 6 && field660 == null) {
            method1683(arg0.field2671, "", 30, 0, -1, arg0.field2592);
        }
        if (arg0.field2612 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2650; var5++) {
                for (int var6 = 0; var6 < arg0.field2601; var6++) {
                    int var7 = (arg0.field2645 + 32) * var6;
                    int var8 = (arg0.field2646 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2693[var4];
                        var8 += arg0.field2648[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field612 = var4;
                        Statics.field409 = arg0;
                        if (arg0.field2585[var4] > 0) {
                            label287: {
                                class40 var9 = class40.method119(arg0.field2585[var4] - 1);
                                if (field673 == 1) {
                                    int var10 = method5(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field92 != arg0.field2592 || Statics.field1138 != var4) {
                                            method1683(class134.field2239, field549 + " " + class2.field27 + " " + class2.method2042(16748608) + var9.field1036, 31, var9.field1011, var4, arg0.field2592);
                                        }
                                        break label287;
                                    }
                                }
                                if (field621) {
                                    int var12 = method5(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1303 & 0x10) == 16) {
                                            method1683(field581, field730 + " " + class2.field27 + " " + class2.method2042(16748608) + var9.field1036, 32, var9.field1011, var4, arg0.field2592);
                                        }
                                        break label287;
                                    }
                                }
                                String[] var14 = var9.field1028;
                                if (field666) {
                                    var14 = method242(var14);
                                }
                                int var15 = method5(arg0);
                                boolean var16 = (var15 >> 30 & 0x1) != 0;
                                if (var16) {
                                    for (int var17 = 4; var17 >= 3; var17--) {
                                        if (var14 != null && var14[var17] != null) {
                                            byte var18;
                                            if (var17 == 3) {
                                                var18 = 36;
                                            } else {
                                                var18 = 37;
                                            }
                                            method1683(var14[var17], class2.method2042(16748608) + var9.field1036, var18, var9.field1011, var4, arg0.field2592);
                                        } else if (var17 == 4) {
                                            method1683(class134.field2325, class2.method2042(16748608) + var9.field1036, 37, var9.field1011, var4, arg0.field2592);
                                        }
                                    }
                                }
                                int var19 = method5(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method1683(class134.field2239, class2.method2042(16748608) + var9.field1036, 38, var9.field1011, var4, arg0.field2592);
                                }
                                int var21 = method5(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22 && var14 != null) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        if (var14[var23] != null) {
                                            byte var24 = 0;
                                            if (var23 == 0) {
                                                var24 = 33;
                                            }
                                            if (var23 == 1) {
                                                var24 = 34;
                                            }
                                            if (var23 == 2) {
                                                var24 = 35;
                                            }
                                            method1683(var14[var23], class2.method2042(16748608) + var9.field1036, var24, var9.field1011, var4, arg0.field2592);
                                        }
                                    }
                                }
                                String[] var25 = arg0.field2643;
                                if (field666) {
                                    var25 = method242(var25);
                                }
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
                                            method1683(var25[var26], class2.method2042(16748608) + var9.field1036, var27, var9.field1011, var4, arg0.field2592);
                                        }
                                    }
                                }
                                method1683(class134.field2240, class2.method2042(16748608) + var9.field1036, 1005, var9.field1011, var4, arg0.field2592);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2660) {
            return;
        }
        if (!field621) {
            for (int var28 = 9; var28 >= 5; var28--) {
                String var29 = method914(arg0, var28);
                if (var29 != null) {
                    method1683(var29, arg0.field2630, 1007, var28 + 1, arg0.field2593, arg0.field2592);
                }
            }
            String var30 = method164(arg0);
            if (var30 != null) {
                method1683(var30, arg0.field2630, 25, 0, arg0.field2593, arg0.field2592);
            }
            for (int var31 = 4; var31 >= 0; var31--) {
                String var32 = method914(arg0, var31);
                if (var32 != null) {
                    method1683(var32, arg0.field2630, 57, var31 + 1, arg0.field2593, arg0.field2592);
                }
            }
            int var33 = method5(arg0);
            boolean var34 = (var33 & 0x1) != 0;
            if (var34) {
                method1683(class134.field2104, "", 30, 0, arg0.field2593, arg0.field2592);
            }
        } else if (class162.method3105(method5(arg0)) && (Statics.field1303 & 0x20) == 32) {
            method1683(field581, field730 + " " + class2.field27 + " " + arg0.field2630, 58, 0, arg0.field2593, arg0.field2592);
        }
    }

    @ObfuscatedName("n.ci(IIIIIIII)V")
    public static final void method238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class158.method2694(arg0)) {
            method179(Statics.field2708[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("s.cj([Lfs;IIIIIIIB)V")
    public static final void method179(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2660 || var9.field2612 == 0 || var9.field2659 || method5(var9) != 0 || field668 == var9) && var9.field2603 == arg1 && (!var9.field2660 || !method2415(var9))) {
                int var10 = var9.field2597 + arg6;
                int var11 = var9.field2598 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2612 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2612 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2601 + var10;
                    int var19 = var9.field2650 + var11;
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
                    int var22 = var9.field2601 + var10;
                    int var23 = var9.field2650 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field667 == var9) {
                    field675 = true;
                    field676 = var10;
                    field677 = var11;
                }
                if (!var9.field2660 || var12 < var14 && var13 < var15) {
                    if (var9.field2701 == 1337) {
                        method2840(var9);
                    } else if (var9.field2701 == 1338) {
                        method2685(var10, var11);
                    } else {
                        if (var9.field2612 == 0) {
                            if (!var9.field2660 && method2415(var9) && Statics.field202 != var9) {
                                continue;
                            }
                            method179(arg0, var9.field2592, var12, var13, var14, var15, var10 - var9.field2605, var11 - var9.field2587);
                            if (var9.field2700 != null) {
                                method179(var9.field2700, var9.field2592, var12, var13, var14, var15, var10 - var9.field2605, var11 - var9.field2587);
                            }
                            class4 var24 = (class4) field719.method3301((long) var9.field2592);
                            if (var24 != null) {
                                method238(var24.field68, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2660) {
                            boolean var25;
                            if (class77.field1419 >= var12 && class77.field1422 >= var13 && class77.field1419 < var14 && class77.field1422 < var15) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            boolean var26 = false;
                            if (class77.field1420 == 1 && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            if (class77.field1439 == 1 && class77.field1428 >= var12 && class77.field1429 >= var13 && class77.field1428 < var14 && class77.field1429 < var15) {
                                var27 = true;
                            }
                            if (var27) {
                                int var28 = class77.field1428 - var10;
                                int var29 = class77.field1429 - var11;
                                if (field667 == null && !field622 && var9 != null) {
                                    class158 var30 = method2210(var9);
                                    if (var30 == null) {
                                        var30 = var9.field2654;
                                    }
                                    if (var30 != null) {
                                        field667 = var9;
                                        class158 var32 = method2210(var9);
                                        if (var32 == null) {
                                            var32 = var9.field2654;
                                        }
                                        field668 = var32;
                                        field669 = var28;
                                        field670 = var29;
                                        Statics.field2352 = 0;
                                        field678 = false;
                                    }
                                }
                            }
                            if (field667 != null && field667 != var9 && var25) {
                                int var34 = method5(var9);
                                boolean var35 = (var34 >> 20 & 0x1) != 0;
                                if (var35) {
                                    field569 = var9;
                                }
                            }
                            if (field668 == var9) {
                                field560 = true;
                                field610 = var10;
                                field674 = var11;
                            }
                            if (var9.field2659) {
                                if (var25 && field692 != 0 && var9.field2680 != null) {
                                    class1 var36 = new class1();
                                    var36.field2 = var9;
                                    var36.field4 = field692;
                                    var36.field18 = var9.field2680;
                                    field693.method3317(var36);
                                }
                                if (field667 != null || Statics.field763 != null || field622) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (!var9.field2625 && var27) {
                                    var9.field2625 = true;
                                    if (var9.field2709 != null) {
                                        class1 var37 = new class1();
                                        var37.field2 = var9;
                                        var37.field8 = class77.field1428 - var10;
                                        var37.field4 = class77.field1429 - var11;
                                        var37.field18 = var9.field2709;
                                        field693.method3317(var37);
                                    }
                                }
                                if (var9.field2625 && var26 && var9.field2662 != null) {
                                    class1 var38 = new class1();
                                    var38.field2 = var9;
                                    var38.field8 = class77.field1419 - var10;
                                    var38.field4 = class77.field1422 - var11;
                                    var38.field18 = var9.field2662;
                                    field693.method3317(var38);
                                }
                                if (var9.field2625 && !var26) {
                                    var9.field2625 = false;
                                    if (var9.field2607 != null) {
                                        class1 var39 = new class1();
                                        var39.field2 = var9;
                                        var39.field8 = class77.field1419 - var10;
                                        var39.field4 = class77.field1422 - var11;
                                        var39.field18 = var9.field2607;
                                        field704.method3317(var39);
                                    }
                                }
                                if (var26 && var9.field2664 != null) {
                                    class1 var40 = new class1();
                                    var40.field2 = var9;
                                    var40.field8 = class77.field1419 - var10;
                                    var40.field4 = class77.field1422 - var11;
                                    var40.field18 = var9.field2664;
                                    field693.method3317(var40);
                                }
                                if (!var9.field2595 && var25) {
                                    var9.field2595 = true;
                                    if (var9.field2665 != null) {
                                        class1 var41 = new class1();
                                        var41.field2 = var9;
                                        var41.field8 = class77.field1419 - var10;
                                        var41.field4 = class77.field1422 - var11;
                                        var41.field18 = var9.field2665;
                                        field693.method3317(var41);
                                    }
                                }
                                if (var9.field2595 && var25 && var9.field2666 != null) {
                                    class1 var42 = new class1();
                                    var42.field2 = var9;
                                    var42.field8 = class77.field1419 - var10;
                                    var42.field4 = class77.field1422 - var11;
                                    var42.field18 = var9.field2666;
                                    field693.method3317(var42);
                                }
                                if (var9.field2595 && !var25) {
                                    var9.field2595 = false;
                                    if (var9.field2667 != null) {
                                        class1 var43 = new class1();
                                        var43.field2 = var9;
                                        var43.field8 = class77.field1419 - var10;
                                        var43.field4 = class77.field1422 - var11;
                                        var43.field18 = var9.field2667;
                                        field704.method3317(var43);
                                    }
                                }
                                if (var9.field2674 != null) {
                                    class1 var44 = new class1();
                                    var44.field2 = var9;
                                    var44.field18 = var9.field2674;
                                    field539.method3317(var44);
                                }
                                if (var9.field2672 != null && field617 > var9.field2621) {
                                    if (var9.field2673 == null || field617 - var9.field2621 > 32) {
                                        class1 var49 = new class1();
                                        var49.field2 = var9;
                                        var49.field18 = var9.field2672;
                                        field693.method3317(var49);
                                    } else {
                                        label453: for (int var45 = var9.field2621; var45 < field617; var45++) {
                                            int var46 = field680[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var9.field2673.length; var47++) {
                                                if (var9.field2673[var47] == var46) {
                                                    class1 var48 = new class1();
                                                    var48.field2 = var9;
                                                    var48.field18 = var9.field2672;
                                                    field693.method3317(var48);
                                                    break label453;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2621 = field617;
                                }
                                if (var9.field2610 != null && field653 > var9.field2635) {
                                    if (var9.field2594 == null || field653 - var9.field2635 > 32) {
                                        class1 var54 = new class1();
                                        var54.field2 = var9;
                                        var54.field18 = var9.field2610;
                                        field693.method3317(var54);
                                    } else {
                                        label433: for (int var50 = var9.field2635; var50 < field653; var50++) {
                                            int var51 = field531[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2594.length; var52++) {
                                                if (var9.field2594[var52] == var51) {
                                                    class1 var53 = new class1();
                                                    var53.field2 = var9;
                                                    var53.field18 = var9.field2610;
                                                    field693.method3317(var53);
                                                    break label433;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2635 = field653;
                                }
                                if (var9.field2676 != null && field553 > var9.field2706) {
                                    if (var9.field2677 == null || field553 - var9.field2706 > 32) {
                                        class1 var59 = new class1();
                                        var59.field2 = var9;
                                        var59.field18 = var9.field2676;
                                        field693.method3317(var59);
                                    } else {
                                        label413: for (int var55 = var9.field2706; var55 < field553; var55++) {
                                            int var56 = field589[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field2677.length; var57++) {
                                                if (var9.field2677[var57] == var56) {
                                                    class1 var58 = new class1();
                                                    var58.field2 = var9;
                                                    var58.field18 = var9.field2676;
                                                    field693.method3317(var58);
                                                    break label413;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2706 = field553;
                                }
                                if (field686 > var9.field2657 && var9.field2681 != null) {
                                    class1 var60 = new class1();
                                    var60.field2 = var9;
                                    var60.field18 = var9.field2681;
                                    field693.method3317(var60);
                                }
                                if (field687 > var9.field2657 && var9.field2606 != null) {
                                    class1 var61 = new class1();
                                    var61.field2 = var9;
                                    var61.field18 = var9.field2606;
                                    field693.method3317(var61);
                                }
                                if (field748 > var9.field2657 && var9.field2684 != null) {
                                    class1 var62 = new class1();
                                    var62.field2 = var9;
                                    var62.field18 = var9.field2684;
                                    field693.method3317(var62);
                                }
                                if (field689 > var9.field2657 && var9.field2705 != null) {
                                    class1 var63 = new class1();
                                    var63.field2 = var9;
                                    var63.field18 = var9.field2705;
                                    field693.method3317(var63);
                                }
                                var9.field2657 = field679;
                                if (var9.field2682 != null) {
                                    for (int var64 = 0; var64 < field717; var64++) {
                                        class1 var65 = new class1();
                                        var65.field2 = var9;
                                        var65.field7 = field648[var64];
                                        var65.field6 = field513[var64];
                                        var65.field18 = var9.field2682;
                                        field693.method3317(var65);
                                    }
                                }
                            }
                        }
                        if (!var9.field2660) {
                            if (field667 != null || Statics.field763 != null || field622) {
                                return;
                            }
                            if ((var9.field2637 >= 0 || var9.field2611 != 0) && class77.field1419 >= var12 && class77.field1422 >= var13 && class77.field1419 < var14 && class77.field1422 < var15) {
                                if (var9.field2637 >= 0) {
                                    Statics.field202 = arg0[var9.field2637];
                                } else {
                                    Statics.field202 = var9;
                                }
                            }
                            if (var9.field2612 == 8 && class77.field1419 >= var12 && class77.field1422 >= var13 && class77.field1419 < var14 && class77.field1422 < var15) {
                                Statics.field30 = var9;
                            }
                            if (var9.field2588 > var9.field2650) {
                                int var66 = var9.field2601 + var10;
                                int var67 = var9.field2650;
                                int var68 = var9.field2588;
                                int var69 = class77.field1419;
                                int var70 = class77.field1422;
                                if (field579) {
                                    field580 = 32;
                                } else {
                                    field580 = 0;
                                }
                                field579 = false;
                                if (class77.field1420 != 0) {
                                    if (var69 >= var66 && var69 < var66 + 16 && var70 >= var11 && var70 < var11 + 16) {
                                        var9.field2587 -= 4;
                                        method2840(var9);
                                    } else if (var69 >= var66 && var69 < var66 + 16 && var70 >= var11 + var67 - 16 && var70 < var11 + var67) {
                                        var9.field2587 += 4;
                                        method2840(var9);
                                    } else if (var69 >= var66 - field580 && var69 < field580 + var66 + 16 && var70 >= var11 + 16 && var70 < var11 + var67 - 16) {
                                        int var71 = (var67 - 32) * var67 / var68;
                                        if (var71 < 8) {
                                            var71 = 8;
                                        }
                                        int var72 = var70 - var11 - 16 - var71 / 2;
                                        int var73 = var67 - 32 - var71;
                                        var9.field2587 = (var68 - var67) * var72 / var73;
                                        method2840(var9);
                                        field579 = true;
                                    }
                                }
                                if (field692 != 0) {
                                    int var74 = var9.field2601;
                                    if (var69 >= var66 - var74 && var70 >= var11 && var69 < var66 + 16 && var70 <= var11 + var67) {
                                        var9.field2587 += field692 * 45;
                                        method2840(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.ct(III)V")
    public static final void method605(int arg0, int arg1) {
        if (class158.method2694(arg0)) {
            method1249(Statics.field2708[arg0], arg1);
        }
    }

    @ObfuscatedName("bn.ck([Lfs;II)V")
    public static final void method1249(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2612 == 0) {
                    if (var3.field2700 != null) {
                        method1249(var3.field2700, arg1);
                    }
                    class4 var4 = (class4) field719.method3301((long) var3.field2592);
                    if (var4 != null) {
                        int var5 = var4.field68;
                        if (class158.method2694(var5)) {
                            method1249(Statics.field2708[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2686 != null) {
                    class1 var6 = new class1();
                    var6.field2 = var3;
                    var6.field18 = var3.field2686;
                    class26.method227(var6);
                }
                if (arg1 == 1 && var3.field2687 != null) {
                    if (var3.field2593 >= 0) {
                        class158 var7 = class158.method44(var3.field2592);
                        if (var7 == null || var7.field2700 == null || var3.field2593 >= var7.field2700.length || var7.field2700[var3.field2593] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field2 = var3;
                    var8.field18 = var3.field2687;
                    class26.method227(var8);
                }
            }
        }
    }

    @ObfuscatedName("bz.cy(I)V")
    public static final void method1427() {
        method2840(field667);
        Statics.field2352++;
        if (field675 && field560) {
            int var0 = class77.field1419;
            int var1 = class77.field1422;
            int var2 = var0 - field669;
            int var3 = var1 - field670;
            if (var2 < field610) {
                var2 = field610;
            }
            if (field667.field2601 + var2 > field610 + field668.field2601) {
                var2 = field610 + field668.field2601 - field667.field2601;
            }
            if (var3 < field674) {
                var3 = field674;
            }
            if (field667.field2650 + var3 > field674 + field668.field2650) {
                var3 = field674 + field668.field2650 - field667.field2650;
            }
            int var4 = var2 - field676;
            int var5 = var3 - field677;
            int var6 = field667.field2591;
            if (Statics.field2352 > field667.field2656 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field678 = true;
            }
            int var7 = field668.field2605 + (var2 - field610);
            int var8 = field668.field2587 + (var3 - field674);
            if (field667.field2668 != null && field678) {
                class1 var9 = new class1();
                var9.field2 = field667;
                var9.field8 = var7;
                var9.field4 = var8;
                var9.field18 = field667.field2668;
                class26.method227(var9);
            }
            if (class77.field1420 == 0) {
                if (field678) {
                    if (field667.field2669 != null) {
                        class1 var10 = new class1();
                        var10.field2 = field667;
                        var10.field8 = var7;
                        var10.field4 = var8;
                        var10.field16 = field569;
                        var10.field18 = field667.field2669;
                        class26.method227(var10);
                    }
                    if (field569 != null && method2210(field667) != null) {
                        field534.method2317(203);
                        field534.method2466(field667.field2593);
                        field534.method2633(field569.field2592);
                        field534.method2641(field569.field2593);
                        field534.method2475(field667.field2592);
                    }
                } else if ((field637 == 1 || method3158(field520 - 1)) && field520 > 2) {
                    method3104();
                } else if (field520 > 0) {
                    method1584(field520 - 1);
                }
                field667 = null;
            }
        } else if (Statics.field2352 > 1) {
            field667 = null;
        }
    }

    @ObfuscatedName("ez.cq(Lfs;I)V")
    public static void method2840(class158 arg0) {
        if (field698 == arg0.field2678) {
            field685[arg0.field2707] = true;
        }
    }

    @ObfuscatedName("q.cp(I)V")
    public static void method141() {
        for (class4 var0 = (class4) field719.method3310(); var0 != null; var0 = (class4) field719.method3305()) {
            int var1 = var0.field68;
            if (class158.method2694(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2708[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2660;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2821;
                    class158 var6 = class158.method44(var5);
                    if (var6 != null) {
                        method2840(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.ca([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method242(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("h.cf(II)V")
    public static final void method136(int arg0) {
        if (!class158.method2694(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2708[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3 != null) {
                var3.field2698 = 0;
                var3.field2699 = 0;
            }
        }
    }

    @ObfuscatedName("ar.cr(II)V")
    public static final void method264(int arg0) {
        if (class158.method2694(arg0)) {
            method2345(Statics.field2708[arg0], -1);
        }
    }

    @ObfuscatedName("dj.ch([Lfs;II)V")
    public static final void method2345(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2603 == arg1 && (!var3.field2660 || !method2415(var3))) {
                if (var3.field2612 == 0) {
                    if (!var3.field2660 && method2415(var3) && Statics.field202 != var3) {
                        continue;
                    }
                    method2345(arg0, var3.field2592);
                    if (var3.field2700 != null) {
                        method2345(var3.field2700, var3.field2592);
                    }
                    class4 var4 = (class4) field719.method3301((long) var3.field2592);
                    if (var4 != null) {
                        method264(var4.field68);
                    }
                }
                if (var3.field2612 == 6) {
                    if (var3.field2628 != -1 || var3.field2629 != -1) {
                        boolean var5 = method1568(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2629;
                        } else {
                            var6 = var3.field2628;
                        }
                        if (var6 != -1) {
                            class34 var7 = Statics.method31(var6);
                            var3.field2699 += field574;
                            while (var3.field2699 > var7.field900[var3.field2698]) {
                                var3.field2699 -= var7.field900[var3.field2698];
                                var3.field2698++;
                                if (var3.field2698 >= var7.field903.length) {
                                    var3.field2698 -= var7.field907;
                                    if (var3.field2698 < 0 || var3.field2698 >= var7.field903.length) {
                                        var3.field2698 = 0;
                                    }
                                }
                                method2840(var3);
                            }
                        }
                    }
                    if (var3.field2636 != 0 && !var3.field2660) {
                        int var8 = var3.field2636 >> 16;
                        int var9 = var3.field2636 << 16 >> 16;
                        int var10 = field574 * var8;
                        int var11 = field574 * var9;
                        var3.field2632 = var3.field2632 + var10 & 0x7FF;
                        var3.field2633 = var3.field2633 + var11 & 0x7FF;
                        method2840(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.cg(IB)V")
    public static final void method133(int arg0) {
        method141();
        for (class7 var1 = (class7) class7.field117.method3345(); var1 != null; var1 = (class7) class7.field117.method3324()) {
            if (var1.field115 != null) {
                var1.method63();
            }
        }
        class42 var2 = (class42) class42.field1064.method3260((long) arg0);
        class42 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1062.method2987(16, arg0);
            class42 var5 = new class42();
            if (var4 != null) {
                var5.method930(new class127(var4));
            }
            class42.field1064.method3261(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var6 = var3.field1063;
        if (var6 == 0) {
            return;
        }
        int var7 = class159.field2713[arg0];
        if (var6 == 1) {
            if (var7 == 1) {
                class104.method2178(0.9D);
                ((class110) Statics.field1811).method2217(0.9D);
            }
            if (var7 == 2) {
                class104.method2178(0.8D);
                ((class110) Statics.field1811).method2217(0.8D);
            }
            if (var7 == 3) {
                class104.method2178(0.7D);
                ((class110) Statics.field1811).method2217(0.7D);
            }
            if (var7 == 4) {
                class104.method2178(0.6D);
                ((class110) Statics.field1811).method2217(0.6D);
            }
            class40.method375();
        }
        if (var6 == 3) {
            short var8 = 0;
            if (var7 == 0) {
                var8 = 255;
            }
            if (var7 == 1) {
                var8 = 192;
            }
            if (var7 == 2) {
                var8 = 128;
            }
            if (var7 == 3) {
                var8 = 64;
            }
            if (var7 == 4) {
                var8 = 0;
            }
            if (field731 != var8) {
                if (field731 == 0 && field688 != -1) {
                    class138.method2688(Statics.field758, field688, 0, var8, false);
                    field733 = false;
                } else if (var8 == 0) {
                    class138.method2686();
                    field733 = false;
                } else {
                    class138.method2306(var8);
                }
                field731 = var8;
            }
        }
        if (var6 == 4) {
            if (var7 == 0) {
                field498 = 127;
            }
            if (var7 == 1) {
                field498 = 96;
            }
            if (var7 == 2) {
                field498 = 64;
            }
            if (var7 == 3) {
                field498 = 32;
            }
            if (var7 == 4) {
                field498 = 0;
            }
        }
        if (var6 == 5) {
            field637 = var7;
        }
        if (var6 == 6) {
            field658 = var7;
        }
        if (var6 == 9) {
            field659 = var7;
        }
        if (var6 != 10) {
            return;
        }
        if (var7 == 0) {
            field735 = 127;
        }
        if (var7 == 1) {
            field735 = 96;
        }
        if (var7 == 2) {
            field735 = 64;
        }
        if (var7 == 3) {
            field735 = 32;
        }
        if (var7 == 4) {
            field735 = 0;
        }
    }

    @ObfuscatedName("cl.cl(Lfs;I)V")
    public static final void method2045(class158 arg0) {
        int var1 = arg0.field2701;
        if (var1 == 324) {
            if (field755 == -1) {
                field755 = arg0.field2690;
                field756 = arg0.field2617;
            }
            if (field598.field2730) {
                arg0.field2690 = field755;
            } else {
                arg0.field2690 = field756;
            }
        } else if (var1 == 325) {
            if (field755 == -1) {
                field755 = arg0.field2690;
                field756 = arg0.field2617;
            }
            if (field598.field2730) {
                arg0.field2690 = field756;
            } else {
                arg0.field2690 = field755;
            }
        } else if (var1 == 327) {
            arg0.field2632 = 150;
            arg0.field2633 = (int) (Math.sin((double) field652 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2624 = 5;
            arg0.field2596 = 0;
        } else if (var1 == 328) {
            arg0.field2632 = 150;
            arg0.field2633 = (int) (Math.sin((double) field652 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2624 = 5;
            arg0.field2596 = 1;
        }
    }

    @ObfuscatedName("i.cx(Ld;ZB)V")
    public static final void method52(class4 arg0, boolean arg1) {
        int var2 = arg0.field68;
        int var3 = (int) arg0.field2821;
        arg0.method3361();
        if (arg1 && var2 != -1 && Statics.field2583[var2]) {
            Statics.field2584.method2999(var2);
            if (Statics.field2708[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2708[var2].length; var5++) {
                    if (Statics.field2708[var2][var5] != null) {
                        if (Statics.field2708[var2][var5].field2612 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2708[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2708[var2] = null;
                }
                Statics.field2583[var2] = false;
            }
        }
        for (class171 var6 = (class171) field571.method3310(); var6 != null; var6 = (class171) field571.method3305()) {
            if ((long) var2 == (var6.field2821 >> 48 & 0xFFFFL)) {
                var6.method3361();
            }
        }
        class158 var7 = class158.method44(var3);
        if (var7 != null) {
            method2840(var7);
        }
        field622 = false;
        field520 = 0;
        method234(Statics.field842, Statics.field1785, Statics.field12, Statics.field288);
        if (field656 != -1) {
            method605(field656, 1);
        }
    }

    @ObfuscatedName("d.cc(Lfs;I)Z")
    public static final boolean method45(class158 arg0) {
        int var1 = arg0.field2701;
        if (var1 == 205) {
            field541 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field598.method3195(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field598.method3201(var4, var5 == 1);
        }
        if (var1 == 324) {
            field598.method3186(false);
        }
        if (var1 == 325) {
            field598.method3186(true);
        }
        if (var1 == 326) {
            field534.method2317(153);
            field598.method3184(field534);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("n.cb(IIII)V")
    public static final void method239(int arg0, int arg1, int arg2) {
        method1433();
        class89.method1794(arg0, arg1, Statics.field317.field1517 + arg0, Statics.field317.field1518 + arg1);
        if (field700 == 2 || field700 == 5) {
            class89.method1809(arg0 + 25, arg1 + 5, 0, Statics.field1823, Statics.field2465);
        } else {
            int var3 = field596 + field583 & 0x7FF;
            int var4 = Statics.field1431.field431 / 32 + 48;
            int var5 = 464 - Statics.field1431.field440 / 32;
            Statics.field293.method1706(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field655 + 256, Statics.field1823, Statics.field2465);
            for (int var6 = 0; var6 < field724; var6++) {
                int var7 = field725[var6] * 4 + 2 - Statics.field1431.field431 / 32;
                int var8 = field726[var6] * 4 + 2 - Statics.field1431.field440 / 32;
                method112(arg0, arg1, var7, var8, field711[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field630[Statics.field402][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1431.field431 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1431.field440 / 32;
                        method112(arg0, arg1, var12, var13, Statics.field207[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field695; var14++) {
                class25 var15 = field530[field532[var14]];
                if (var15 != null && var15.method21()) {
                    class31 var16 = var15.field410;
                    if (var16 != null && var16.field822 != null) {
                        var16 = var16.method634();
                    }
                    if (var16 != null && var16.field813 && var16.field831) {
                        int var17 = var15.field431 / 32 - Statics.field1431.field431 / 32;
                        int var18 = var15.field440 / 32 - Statics.field1431.field440 / 32;
                        method112(arg0, arg1, var17, var18, Statics.field207[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field642; var19++) {
                class3 var20 = field616[field491[var19]];
                if (var20 != null && var20.method21()) {
                    int var21 = var20.field431 / 32 - Statics.field1431.field431 / 32;
                    int var22 = var20.field440 / 32 - Statics.field1431.field440 / 32;
                    boolean var23 = false;
                    String var24 = var20.field51;
                    boolean var25;
                    if (var24 == null) {
                        var25 = false;
                    } else {
                        String var26 = class148.method1252(var24, Statics.field533);
                        int var27 = 0;
                        while (true) {
                            if (var27 >= field500) {
                                if (var24.equalsIgnoreCase(class148.method1252(Statics.field1431.field51, Statics.field533))) {
                                    var25 = true;
                                } else {
                                    var25 = false;
                                }
                                break;
                            }
                            if (var26.equalsIgnoreCase(class148.method1252(field750[var27].field381, Statics.field533))) {
                                var25 = true;
                                break;
                            }
                            var27++;
                        }
                    }
                    if (var25) {
                        var23 = true;
                    }
                    boolean var28 = false;
                    if (Statics.field1431.field54 != 0 && var20.field54 != 0 && Statics.field1431.field54 == var20.field54) {
                        var28 = true;
                    }
                    if (var23) {
                        method112(arg0, arg1, var21, var22, Statics.field207[3]);
                    } else if (var28) {
                        method112(arg0, arg1, var21, var22, Statics.field207[4]);
                    } else {
                        method112(arg0, arg1, var21, var22, Statics.field207[2]);
                    }
                }
            }
            if (field497 != 0 && field652 % 20 < 10) {
                if (field497 == 1 && field647 >= 0 && field647 < field530.length) {
                    class25 var29 = field530[field647];
                    if (var29 != null) {
                        int var30 = var29.field431 / 32 - Statics.field1431.field431 / 32;
                        int var31 = var29.field440 / 32 - Statics.field1431.field440 / 32;
                        method2419(arg0, arg1, var30, var31, Statics.field1298[1]);
                    }
                }
                if (field497 == 2) {
                    int var32 = field709 * 4 - Statics.field272 * 4 + 2 - Statics.field1431.field431 / 32;
                    int var33 = field516 * 4 - Statics.field977 * 4 + 2 - Statics.field1431.field440 / 32;
                    method2419(arg0, arg1, var32, var33, Statics.field1298[1]);
                }
                if (field497 == 10 && field514 >= 0 && field514 < field616.length) {
                    class3 var34 = field616[field514];
                    if (var34 != null) {
                        int var35 = var34.field431 / 32 - Statics.field1431.field431 / 32;
                        int var36 = var34.field440 / 32 - Statics.field1431.field440 / 32;
                        method2419(arg0, arg1, var35, var36, Statics.field1298[1]);
                    }
                }
            }
            if (field728 != 0) {
                int var37 = field728 * 4 + 2 - Statics.field1431.field431 / 32;
                int var38 = field729 * 4 + 2 - Statics.field1431.field440 / 32;
                method112(arg0, arg1, var37, var38, Statics.field1298[0]);
            }
            class89.method1800(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field700 < 3) {
            Statics.field129.method1706(arg0, arg1, 33, 33, 25, 25, field583, 256, Statics.field1481, Statics.field1711);
        } else {
            class89.method1809(arg0, arg1, 0, Statics.field1481, Statics.field1711);
        }
        if (field701[arg2]) {
            Statics.field317.method1780(arg0, arg1);
        }
        field650[arg2] = true;
    }

    @ObfuscatedName("di.cd(IIIILce;I)V")
    public static final void method2419(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method112(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field596 + field583 & 0x7FF;
        int var7 = class104.field1814[var6];
        int var8 = class104.field1815[var6];
        int var9 = var7 * 256 / (field655 + 256);
        int var10 = var8 * 256 / (field655 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1411.method1707(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("z.co(IIIILce;I)V")
    public static final void method112(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field596 + field583 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1814[var5];
        int var8 = class104.field1815[var5];
        int var9 = var7 * 256 / (field655 + 256);
        int var10 = var8 * 256 / (field655 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1723(Statics.field317, arg0 + 94 + var11 - arg4.field1508 / 2 + 4, arg1 + 83 - var12 - arg4.field1509 / 2 - 4);
        } else {
            arg4.method1696(arg0 + 94 + var11 - arg4.field1508 / 2 + 4, arg1 + 83 - var12 - arg4.field1509 / 2 - 4);
        }
    }

    @ObfuscatedName("cn.dg(ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method1680(int arg0, String arg1, String arg2) {
        method2048(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cx.dc(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2048(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field707[var4] = field707[var4 - 1];
            field590[var4] = field590[var4 - 1];
            field710[var4] = field710[var4 - 1];
            field521[var4] = field521[var4 - 1];
        }
        field707[0] = arg0;
        field590[0] = arg1;
        field710[0] = arg2;
        field521[0] = arg3;
        field671++;
        field686 = field679;
    }

    @ObfuscatedName("u.dt(Ljava/lang/String;I)Z")
    public static boolean method110(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method1252(arg0, Statics.field533);
        for (int var2 = 0; var2 < field752; var2++) {
            class11 var3 = field657[var2];
            if (var1.equalsIgnoreCase(class148.method1252(var3.field196, Statics.field533))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method1252(var3.field198, Statics.field533))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ba.df(Ljava/lang/String;I)V")
    public static final void method1499(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field500 < 200 || field623 == 1) || field500 >= 200) {
            method1680(0, "", class134.field2227);
            return;
        }
        String var1 = class148.method1252(arg0, Statics.field533);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field500; var2++) {
            class23 var3 = field750[var2];
            String var4 = class148.method1252(var3.field381, Statics.field533);
            if (var4 != null && var4.equals(var1)) {
                method1680(0, "", arg0 + class134.field2256);
                return;
            }
            if (var3.field379 != null) {
                String var5 = class148.method1252(var3.field379, Statics.field533);
                if (var5 != null && var5.equals(var1)) {
                    method1680(0, "", arg0 + class134.field2256);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field752; var6++) {
            class11 var7 = field657[var6];
            String var8 = class148.method1252(var7.field196, Statics.field533);
            if (var8 != null && var8.equals(var1)) {
                method1680(0, "", class134.field2296 + arg0 + class134.field2262);
                return;
            }
            if (var7.field198 != null) {
                String var9 = class148.method1252(var7.field198, Statics.field533);
                if (var9 != null && var9.equals(var1)) {
                    method1680(0, "", class134.field2296 + arg0 + class134.field2262);
                    return;
                }
            }
        }
        if (class148.method1252(Statics.field1431.field51, Statics.field533).equals(var1)) {
            method1680(0, "", class134.field2259);
        } else {
            field534.method2317(53);
            field534.method2424(class127.method173(arg0));
            field534.method2429(arg0);
        }
    }

    @ObfuscatedName("al.dw(Ljava/lang/String;B)V")
    public static final void method738(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class148.method1252(arg0, Statics.field533);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field500; var2++) {
            class23 var3 = field750[var2];
            String var4 = var3.field381;
            String var5 = class148.method1252(var4, Statics.field533);
            if (class136.method42(arg0, var1, var4, var5)) {
                field500--;
                for (int var6 = var2; var6 < field500; var6++) {
                    field750[var6] = field750[var6 + 1];
                }
                field687 = field679;
                field534.method2317(162);
                field534.method2424(class127.method173(arg0));
                field534.method2429(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("q.db(Ljava/lang/String;B)V")
    public static final void method147(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class148.method1252(arg0, Statics.field533);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field752; var2++) {
            class11 var3 = field657[var2];
            String var4 = var3.field196;
            String var5 = class148.method1252(var4, Statics.field533);
            if (class136.method42(arg0, var1, var4, var5)) {
                field752--;
                for (int var6 = var2; var6 < field752; var6++) {
                    field657[var6] = field657[var6 + 1];
                }
                field687 = field679;
                field534.method2317(37);
                field534.method2424(class127.method173(arg0));
                field534.method2429(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("fw.da(Ljava/lang/String;II)V")
    public static final void method3152(String arg0, int arg1) {
        field534.method2317(66);
        field534.method2424(class127.method173(arg0) + 1);
        field534.method2429(arg0);
        field534.method2424(arg1);
    }

    @ObfuscatedName("t.dk(Lfs;I)I")
    public static int method5(class158 arg0) {
        class171 var1 = (class171) field571.method3301(((long) arg0.field2592 << 32) + (long) arg0.field2593);
        return var1 == null ? arg0.field2651 : var1.field2803;
    }

    @ObfuscatedName("df.dl(Lfs;B)Lfs;")
    public static class158 method2210(class158 arg0) {
        int var1 = class162.method2044(method5(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class158.method44(arg0.field2603);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("di.dm(Lfs;I)Z")
    public static boolean method2415(class158 arg0) {
        if (field754) {
            if (method5(arg0) != 0) {
                return false;
            }
            if (arg0.field2612 == 0) {
                return false;
            }
        }
        return arg0.field2604;
    }

    @ObfuscatedName("af.dq(Lfs;IB)Ljava/lang/String;")
    public static String method914(class158 arg0, int arg1) {
        int var2 = method5(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2679 == null) {
            return null;
        } else if (arg0.field2653 == null || arg0.field2653.length <= arg1 || arg0.field2653[arg1] == null || arg0.field2653[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2653[arg1];
        }
    }

    @ObfuscatedName("r.dr(Lfs;I)Ljava/lang/String;")
    public static String method164(class158 arg0) {
        if (class162.method1532(method5(arg0)) == 0) {
            return null;
        } else if (arg0.field2658 == null || arg0.field2658.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2658;
        }
    }
}

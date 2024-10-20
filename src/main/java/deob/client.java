package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class73 {

    @ObfuscatedName("client.m")
    public static boolean field622 = true;

    @ObfuscatedName("client.j")
    public static int field591 = 1;

    @ObfuscatedName("client.l")
    public static int field482 = 0;

    @ObfuscatedName("client.w")
    public static class164[] field544 = new class164[4];

    @ObfuscatedName("client.z")
    public static boolean field524 = false;

    @ObfuscatedName("client.f")
    public static boolean field486 = false;

    @ObfuscatedName("client.a")
    public static int field487 = 0;

    @ObfuscatedName("client.e")
    public static int field489 = 0;

    @ObfuscatedName("client.k")
    public static boolean field723 = true;

    @ObfuscatedName("client.h")
    public static int field491 = 0;

    @ObfuscatedName("client.b")
    public static long field492 = 1L;

    @ObfuscatedName("client.q")
    public static int field494 = -1;

    @ObfuscatedName("client.r")
    public static int field597 = -1;

    @ObfuscatedName("client.u")
    public static int field634 = -1;

    @ObfuscatedName("client.p")
    public static boolean field563 = true;

    @ObfuscatedName("client.t")
    public static boolean field498 = false;

    @ObfuscatedName("client.s")
    public static int field715 = 0;

    @ObfuscatedName("client.ah")
    public static int field500 = 0;

    @ObfuscatedName("client.ar")
    public static int field501 = 0;

    @ObfuscatedName("client.ac")
    public static int field565 = 0;

    @ObfuscatedName("client.as")
    public static int field503 = 0;

    @ObfuscatedName("client.ag")
    public static int field504 = 0;

    @ObfuscatedName("client.ak")
    public static int field505 = 0;

    @ObfuscatedName("client.am")
    public static int field499 = 0;

    @ObfuscatedName("client.ap")
    public static int field507 = 0;

    @ObfuscatedName("client.au")
    public static class127 field490 = new class127(new byte[5000]);

    @ObfuscatedName("client.aw")
    public static int field488 = 0;

    @ObfuscatedName("client.ab")
    public static int field511 = 0;

    @ObfuscatedName("client.ay")
    public static int field708 = 0;

    @ObfuscatedName("client.bb")
    public static int field686 = 0;

    @ObfuscatedName("client.bk")
    public static int field517 = 0;

    @ObfuscatedName("client.bm")
    public static int field518 = 0;

    @ObfuscatedName("client.bd")
    public static int field519 = 0;

    @ObfuscatedName("client.bx")
    public static int field651 = 0;

    @ObfuscatedName("client.bz")
    public static class25[] field638 = new class25[32768];

    @ObfuscatedName("client.by")
    public static int field743 = 0;

    @ObfuscatedName("client.bo")
    public static int[] field617 = new int[32768];

    @ObfuscatedName("client.ca")
    public static class116 field540 = new class116(5000);

    @ObfuscatedName("client.cq")
    public static class116 field527 = new class116(5000);

    @ObfuscatedName("client.cu")
    public static class116 field528 = new class116(5000);

    @ObfuscatedName("client.cs")
    public static int field529 = 0;

    @ObfuscatedName("client.cf")
    public static int field514 = 0;

    @ObfuscatedName("client.cx")
    public static int field531 = 0;

    @ObfuscatedName("client.cl")
    public static int field532 = 0;

    @ObfuscatedName("client.co")
    public static int field533 = 0;

    @ObfuscatedName("client.cj")
    public static int field534 = 0;

    @ObfuscatedName("client.cz")
    public static int field535 = 0;

    @ObfuscatedName("client.cd")
    public static int field536 = 0;

    @ObfuscatedName("client.cp")
    public static boolean field665 = false;

    @ObfuscatedName("client.cb")
    public static int field538 = 0;

    @ObfuscatedName("client.cw")
    public static int field539 = 0;

    @ObfuscatedName("client.ce")
    public static int field553 = 1;

    @ObfuscatedName("client.cc")
    public static int field541 = 0;

    @ObfuscatedName("client.cv")
    public static int field542 = 1;

    @ObfuscatedName("client.dc")
    public static int field543 = 0;

    @ObfuscatedName("client.dr")
    public static boolean field545 = false;

    @ObfuscatedName("client.dz")
    public static int[][][] field546 = new int[4][13][13];

    @ObfuscatedName("client.dh")
    public static final int[] field526 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dx")
    public static int field548 = 0;

    @ObfuscatedName("client.do")
    public static int[][] field549 = new int[104][104];

    @ObfuscatedName("client.dm")
    public static int[][] field550 = new int[104][104];

    @ObfuscatedName("client.ds")
    public static int[] field551 = new int[4000];

    @ObfuscatedName("client.dv")
    public static int[] field704 = new int[4000];

    @ObfuscatedName("client.dn")
    public static int field684 = 0;

    @ObfuscatedName("client.dw")
    public static int field554 = 2;

    @ObfuscatedName("client.du")
    public static int field555 = 0;

    @ObfuscatedName("client.df")
    public static int field556 = 2;

    @ObfuscatedName("client.da")
    public static int field604 = 0;

    @ObfuscatedName("client.dq")
    public static int field599 = 1;

    @ObfuscatedName("client.di")
    public static int field559 = 0;

    @ObfuscatedName("client.dp")
    public static int field560 = 0;

    @ObfuscatedName("client.ee")
    public static int field552 = 2;

    @ObfuscatedName("client.eb")
    public static int field562 = 0;

    @ObfuscatedName("client.en")
    public static int field682 = 1;

    @ObfuscatedName("client.ey")
    public static int field564 = 0;

    @ObfuscatedName("client.ej")
    public static int field510 = 0;

    @ObfuscatedName("client.eh")
    public static int field566 = 2301979;

    @ObfuscatedName("client.ef")
    public static int field740 = 5063219;

    @ObfuscatedName("client.eo")
    public static int field568 = 3353893;

    @ObfuscatedName("client.fl")
    public static int field569 = 7759444;

    @ObfuscatedName("client.fk")
    public static boolean field570 = false;

    @ObfuscatedName("client.fy")
    public static int field571 = 0;

    @ObfuscatedName("client.ff")
    public static int field572 = 128;

    @ObfuscatedName("client.fd")
    public static int field497 = 0;

    @ObfuscatedName("client.fr")
    public static int field574 = 0;

    @ObfuscatedName("client.fq")
    public static int field567 = 0;

    @ObfuscatedName("client.fc")
    public static int field479 = 0;

    @ObfuscatedName("client.fg")
    public static boolean field516 = false;

    @ObfuscatedName("client.fi")
    public static int field578 = 0;

    @ObfuscatedName("client.fe")
    public static int field579 = 0;

    @ObfuscatedName("client.fn")
    public static int field666 = 50;

    @ObfuscatedName("client.fj")
    public static int[] field663 = new int[field666];

    @ObfuscatedName("client.fz")
    public static int[] field750 = new int[field666];

    @ObfuscatedName("client.fs")
    public static int[] field583 = new int[field666];

    @ObfuscatedName("client.fo")
    public static int[] field584 = new int[field666];

    @ObfuscatedName("client.ft")
    public static int[] field727 = new int[field666];

    @ObfuscatedName("client.fa")
    public static int[] field586 = new int[field666];

    @ObfuscatedName("client.fx")
    public static int[] field587 = new int[field666];

    @ObfuscatedName("client.gb")
    public static String[] field588 = new String[field666];

    @ObfuscatedName("client.gt")
    public static int[][] field589 = new int[104][104];

    @ObfuscatedName("client.gm")
    public static int field590 = 0;

    @ObfuscatedName("client.gh")
    public static int field655 = -1;

    @ObfuscatedName("client.gn")
    public static int field592 = -1;

    @ObfuscatedName("client.gu")
    public static int field593 = 0;

    @ObfuscatedName("client.gk")
    public static int field506 = 0;

    @ObfuscatedName("client.gy")
    public static int field547 = 0;

    @ObfuscatedName("client.gv")
    public static int field596 = 0;

    @ObfuscatedName("client.gs")
    public static int field659 = 0;

    @ObfuscatedName("client.ga")
    public static int field644 = 0;

    @ObfuscatedName("client.gd")
    public static int field635 = 0;

    @ObfuscatedName("client.gc")
    public static int field600 = 0;

    @ObfuscatedName("client.gz")
    public static int field601 = 0;

    @ObfuscatedName("client.gi")
    public static int field602 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field603 = false;

    @ObfuscatedName("client.gw")
    public static int field646 = 0;

    @ObfuscatedName("client.gp")
    public static int field605 = 0;

    @ObfuscatedName("client.ge")
    public static class3[] field520 = new class3[2048];

    @ObfuscatedName("client.gx")
    public static int field607 = 0;

    @ObfuscatedName("client.gj")
    public static int[] field522 = new int[2048];

    @ObfuscatedName("client.hz")
    public static int field609 = 0;

    @ObfuscatedName("client.hc")
    public static int[] field668 = new int[2048];

    @ObfuscatedName("client.hi")
    public static class127[] field611 = new class127[2048];

    @ObfuscatedName("client.hu")
    public static int field612 = -1;

    @ObfuscatedName("client.hs")
    public static int field746 = 0;

    @ObfuscatedName("client.hv")
    public static int field614 = 0;

    @ObfuscatedName("client.hf")
    public static int[] field615 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field616 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hw")
    public static String[] field613 = new String[8];

    @ObfuscatedName("client.ho")
    public static boolean[] field618 = new boolean[8];

    @ObfuscatedName("client.hh")
    public static int[] field619 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hp")
    public static class177[][][] field620 = new class177[4][104][104];

    @ObfuscatedName("client.hl")
    public static class177 field621 = new class177();

    @ObfuscatedName("client.hn")
    public static class177 field641 = new class177();

    @ObfuscatedName("client.ha")
    public static class177 field623 = new class177();

    @ObfuscatedName("client.hr")
    public static int[] field573 = new int[25];

    @ObfuscatedName("client.hm")
    public static int[] field625 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field575 = new int[25];

    @ObfuscatedName("client.hd")
    public static int field627 = 0;

    @ObfuscatedName("client.hy")
    public static boolean field628 = false;

    @ObfuscatedName("client.iw")
    public static int field629 = 0;

    @ObfuscatedName("client.ig")
    public static int[] field630 = new int[500];

    @ObfuscatedName("client.iy")
    public static int[] field631 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field632 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field633 = new int[500];

    @ObfuscatedName("client.iv")
    public static String[] field610 = new String[500];

    @ObfuscatedName("client.ic")
    public static String[] field716 = new String[500];

    @ObfuscatedName("client.in")
    public static int field636 = -1;

    @ObfuscatedName("client.ia")
    public static int field581 = -1;

    @ObfuscatedName("client.ih")
    public static int field626 = 0;

    @ObfuscatedName("client.id")
    public static int field639 = 50;

    @ObfuscatedName("client.ij")
    public static int field640 = 0;

    @ObfuscatedName("client.it")
    public static String field508 = null;

    @ObfuscatedName("client.io")
    public static boolean field642 = false;

    @ObfuscatedName("client.ix")
    public static int field643 = -1;

    @ObfuscatedName("client.ir")
    public static String field598 = null;

    @ObfuscatedName("client.is")
    public static String field645 = null;

    @ObfuscatedName("client.js")
    public static int field721 = -1;

    @ObfuscatedName("client.jh")
    public static class175 field647 = new class175(8);

    @ObfuscatedName("client.jm")
    public static int field525 = 0;

    @ObfuscatedName("client.jc")
    public static int field649 = 0;

    @ObfuscatedName("client.jg")
    public static class158 field650 = null;

    @ObfuscatedName("client.jf")
    public static int field606 = 0;

    @ObfuscatedName("client.jp")
    public static int field512 = 0;

    @ObfuscatedName("client.jx")
    public static int field653 = 0;

    @ObfuscatedName("client.jj")
    public static boolean field648 = false;

    @ObfuscatedName("client.je")
    public static boolean field608 = false;

    @ObfuscatedName("client.ju")
    public static boolean field557 = false;

    @ObfuscatedName("client.jt")
    public static class158 field657 = null;

    @ObfuscatedName("client.jv")
    public static class158 field658 = null;

    @ObfuscatedName("client.jo")
    public static int field624 = 0;

    @ObfuscatedName("client.jw")
    public static int field660 = 0;

    @ObfuscatedName("client.ji")
    public static class158 field661 = null;

    @ObfuscatedName("client.jr")
    public static boolean field662 = false;

    @ObfuscatedName("client.ja")
    public static int field561 = -1;

    @ObfuscatedName("client.jb")
    public static int field664 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field703 = false;

    @ObfuscatedName("client.jk")
    public static int field719 = -1;

    @ObfuscatedName("client.jd")
    public static int field667 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field595 = false;

    @ObfuscatedName("client.kg")
    public static int field669 = 1;

    @ObfuscatedName("client.ku")
    public static int[] field670 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field671 = 0;

    @ObfuscatedName("client.kn")
    public static int[] field672 = new int[32];

    @ObfuscatedName("client.kt")
    public static int field673 = 0;

    @ObfuscatedName("client.kj")
    public static int[] field674 = new int[32];

    @ObfuscatedName("client.ka")
    public static int field675 = 0;

    @ObfuscatedName("client.ko")
    public static int field676 = 0;

    @ObfuscatedName("client.kr")
    public static int field677 = 0;

    @ObfuscatedName("client.kk")
    public static int field678 = 0;

    @ObfuscatedName("client.ks")
    public static int field679 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field680 = new int[2000];

    @ObfuscatedName("client.kd")
    public static String[] field681 = new String[1000];

    @ObfuscatedName("client.kf")
    public static int field687 = 0;

    @ObfuscatedName("client.kx")
    public static class177 field683 = new class177();

    @ObfuscatedName("client.kh")
    public static class177 field725 = new class177();

    @ObfuscatedName("client.kv")
    public static class177 field685 = new class177();

    @ObfuscatedName("client.ki")
    public static class175 field696 = new class175(512);

    @ObfuscatedName("client.kw")
    public static int field736 = 0;

    @ObfuscatedName("client.km")
    public static int field688 = -2;

    @ObfuscatedName("client.kc")
    public static boolean[] field689 = new boolean[100];

    @ObfuscatedName("client.lw")
    public static boolean[] field690 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static boolean[] field691 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static int[] field692 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field693 = new int[100];

    @ObfuscatedName("client.lz")
    public static int[] field694 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field695 = new int[100];

    @ObfuscatedName("client.lu")
    public static int field576 = 0;

    @ObfuscatedName("client.lv")
    public static int[] field697 = new int[100];

    @ObfuscatedName("client.li")
    public static String[] field577 = new String[100];

    @ObfuscatedName("client.ll")
    public static String[] field699 = new String[100];

    @ObfuscatedName("client.lf")
    public static String[] field700 = new String[100];

    @ObfuscatedName("client.lj")
    public static int field701 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field702 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lm")
    public static int field594 = 0;

    @ObfuscatedName("client.ls")
    public static int field637 = 0;

    @ObfuscatedName("client.lr")
    public static long[] field705 = new long[100];

    @ObfuscatedName("client.lp")
    public static int field706 = 0;

    @ObfuscatedName("client.lk")
    public static int field654 = 0;

    @ObfuscatedName("client.ly")
    public static int[] field707 = new int[128];

    @ObfuscatedName("client.le")
    public static int[] field709 = new int[128];

    @ObfuscatedName("client.lc")
    public static long field710 = -1L;

    @ObfuscatedName("client.lh")
    public static String field711 = null;

    @ObfuscatedName("client.mq")
    public static String field712 = null;

    @ObfuscatedName("client.ma")
    public static int field713 = -1;

    @ObfuscatedName("client.mo")
    public static int field478 = 0;

    @ObfuscatedName("client.mn")
    public static int[] field558 = new int[1000];

    @ObfuscatedName("client.mf")
    public static int[] field502 = new int[1000];

    @ObfuscatedName("client.mz")
    public static class86[] field717 = new class86[1000];

    @ObfuscatedName("client.mr")
    public static int field718 = 0;

    @ObfuscatedName("client.mp")
    public static int field582 = 0;

    @ObfuscatedName("client.mg")
    public static int field720 = 0;

    @ObfuscatedName("client.mt")
    public static int field652 = 255;

    @ObfuscatedName("client.mv")
    public static int field722 = -1;

    @ObfuscatedName("client.mc")
    public static boolean field537 = false;

    @ObfuscatedName("client.mi")
    public static int field724 = 127;

    @ObfuscatedName("client.mx")
    public static int field496 = 127;

    @ObfuscatedName("client.np")
    public static int field726 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field714 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field728 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field729 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field730 = new int[50];

    @ObfuscatedName("client.nw")
    public static class57[] field731 = new class57[50];

    @ObfuscatedName("client.nm")
    public static boolean field732 = false;

    @ObfuscatedName("client.nb")
    public static boolean[] field733 = new boolean[5];

    @ObfuscatedName("client.ng")
    public static int[] field734 = new int[5];

    @ObfuscatedName("client.nc")
    public static int[] field735 = new int[5];

    @ObfuscatedName("client.nu")
    public static int[] field585 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field737 = new int[5];

    @ObfuscatedName("client.os")
    public static int field738 = 0;

    @ObfuscatedName("client.ou")
    public static int field739 = 0;

    @ObfuscatedName("client.ov")
    public static class23[] field741 = new class23[400];

    @ObfuscatedName("client.oa")
    public static class173 field742 = new class173();

    @ObfuscatedName("client.og")
    public static int field523 = 0;

    @ObfuscatedName("client.oz")
    public static class11[] field744 = new class11[400];

    @ObfuscatedName("client.ox")
    public static class163 field745 = new class163();

    @ObfuscatedName("client.oh")
    public static int field580 = -1;

    @ObfuscatedName("client.oo")
    public static int field747 = -1;

    @ObfuscatedName("client.m(I)V")
    public final void method393() {
    }

    public final void init() {
        if (!this.method1448()) {
            return;
        }
        class167[] var1 = new class167[] { class167.field2787, class167.field2783, class167.field2785, class167.field2782, class167.field2786, class167.field2781, class167.field2779, class167.field2784, class167.field2780 };
        class167[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class167 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2788);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2788)) {
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field30)) {
                        }
                        break;
                    case 3:
                        field591 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field656 = var5;
                        break;
                    case 5:
                        Statics.field481 = class132.method736(Integer.parseInt(var5));
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class2.field30)) {
                            field524 = true;
                        } else {
                            field524 = false;
                        }
                        break;
                    case 7:
                        field482 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field487 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field483 = (class133) class113.method2077(class133.method2349(), Integer.parseInt(var5));
                        if (Statics.field483 == class133.field2074) {
                            Statics.field484 = class186.field2858;
                        } else {
                            Statics.field484 = class186.field2864;
                        }
                }
            }
        }
        class95.field1592 = false;
        field486 = false;
        Statics.field521 = this.getCodeBase().getHost();
        String var6 = Statics.field481.field2068;
        byte var7 = 0;
        try {
            class82.method128("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class80.method562((String) null, var9);
        }
        Statics.field1759 = this;
        this.method1446(765, 503, 22);
    }

    @ObfuscatedName("client.o(I)V")
    public final void method264() {
        Statics.field194 = field482 == 0 ? 43594 : field591 + 40000;
        Statics.field902 = field482 == 0 ? 443 : field591 + 50000;
        Statics.field1994 = Statics.field194;
        Statics.field271 = class161.field2710;
        Statics.field2730 = class161.field2711;
        Statics.field2010 = class161.field2712;
        Statics.field2727 = class161.field2713;
        if (Statics.field1338.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1349[44] = 71;
            class75.field1349[45] = 26;
            class75.field1349[46] = 72;
            class75.field1349[47] = 73;
            class75.field1349[59] = 57;
            class75.field1349[61] = 27;
            class75.field1349[91] = 42;
            class75.field1349[92] = 74;
            class75.field1349[93] = 43;
            class75.field1349[192] = 28;
            class75.field1349[222] = 58;
            class75.field1349[520] = 59;
        } else {
            class75.field1349[186] = 57;
            class75.field1349[187] = 27;
            class75.field1349[188] = 71;
            class75.field1349[189] = 26;
            class75.field1349[190] = 72;
            class75.field1349[191] = 73;
            class75.field1349[192] = 58;
            class75.field1349[219] = 42;
            class75.field1349[220] = 74;
            class75.field1349[221] = 43;
            class75.field1349[222] = 59;
            class75.field1349[223] = 28;
        }
        class75.method1444(Statics.field310);
        Canvas var1 = Statics.field310;
        var1.addMouseListener(class77.field1386);
        var1.addMouseMotionListener(class77.field1386);
        var1.addFocusListener(class77.field1386);
        class78 var2;
        try {
            var2 = new class78();
        } catch (Throwable var13) {
            var2 = null;
        }
        Statics.field128 = var2;
        if (Statics.field128 != null) {
            Statics.field128.method1389(Statics.field310);
        }
        Statics.field291 = new class71(255, class82.field1434, class82.field1435, 500000);
        class29 var4 = null;
        class12 var5 = new class12();
        try {
            var4 = class82.method1261("", Statics.field483.field2079, false);
            byte[] var6 = new byte[(int) var4.method573()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method571(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class12(new class127(var6));
        } catch (Exception var14) {
        }
        try {
            if (var4 != null) {
                var4.method572();
            }
        } catch (Exception var12) {
        }
        Statics.field193 = var5;
        if (field482 != 0) {
            field498 = true;
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method265() {
        field491++;
        this.method268();
        while (true) {
            class177 var1 = class157.field2567;
            class156 var2;
            synchronized (class157.field2567) {
                var2 = (class156) class157.field2568.method3398();
            }
            if (var2 == null) {
                try {
                    if (class138.field2332 == 1) {
                        int var4 = Statics.field2333.method2790();
                        if (var4 > 0 && Statics.field2333.method2863()) {
                            int var5 = var4 - Statics.field73;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2333.method2822(var5);
                        } else {
                            Statics.field2333.method2795();
                            Statics.field2333.method2793();
                            if (Statics.field1036 == null) {
                                class138.field2332 = 0;
                            } else {
                                class138.field2332 = 2;
                            }
                            Statics.field2330 = null;
                            Statics.field1521 = null;
                        }
                    }
                } catch (Exception var345) {
                    var345.printStackTrace();
                    Statics.field2333.method2795();
                    class138.field2332 = 0;
                    Statics.field2330 = null;
                    Statics.field1521 = null;
                    Statics.field1036 = null;
                }
                method2244();
                class75.method2392();
                class77 var7 = class77.field1386;
                synchronized (class77.field1386) {
                    class77.field1397 = class77.field1401;
                    class77.field1392 = class77.field1389;
                    class77.field1393 = class77.field1390;
                    class77.field1398 = class77.field1394;
                    class77.field1399 = class77.field1395;
                    class77.field1387 = class77.field1396;
                    class77.field1400 = class77.field1388;
                    class77.field1394 = 0;
                }
                if (Statics.field128 != null) {
                    int var9 = Statics.field128.method1385();
                    field687 = var9;
                }
                int var10002;
                if (field489 == 0) {
                    method140();
                    Statics.field1684.method1372();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field1317[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field1320[var11] = 0L;
                    }
                    Statics.field112 = 0;
                } else if (field489 == 5) {
                    class21.method563(this);
                    method140();
                    Statics.field1684.method1372();
                    for (int var12 = 0; var12 < 32; var12++) {
                        field1317[var12] = 0L;
                    }
                    for (int var13 = 0; var13 < 32; var13++) {
                        field1320[var13] = 0L;
                    }
                    Statics.field112 = 0;
                } else if (field489 == 10) {
                    class21.method563(this);
                } else if (field489 == 20) {
                    class21.method563(this);
                    method1344();
                } else if (field489 == 25) {
                    method2073(false);
                    field539 = 0;
                    boolean var14 = true;
                    for (int var15 = 0; var15 < Statics.field1267.length; var15++) {
                        if (Statics.field1659[var15] != -1 && Statics.field1267[var15] == null) {
                            Statics.field1267[var15] = Statics.field201.method3032(Statics.field1659[var15], 0);
                            if (Statics.field1267[var15] == null) {
                                var14 = false;
                                field539++;
                            }
                        }
                        if (Statics.field2052[var15] != -1 && Statics.field285[var15] == null) {
                            Statics.field285[var15] = Statics.field201.method3033(Statics.field2052[var15], 0, Statics.field143[var15]);
                            if (Statics.field285[var15] == null) {
                                var14 = false;
                                field539++;
                            }
                        }
                    }
                    if (var14) {
                        field541 = 0;
                        boolean var16 = true;
                        for (int var17 = 0; var17 < Statics.field1267.length; var17++) {
                            byte[] var18 = Statics.field285[var17];
                            if (var18 != null) {
                                int var19 = (Statics.field2021[var17] >> 8) * 64 - Statics.field1795;
                                int var20 = (Statics.field2021[var17] & 0xFF) * 64 - Statics.field884;
                                if (field545) {
                                    var19 = 10;
                                    var20 = 10;
                                }
                                var16 &= class9.method215(var18, var19, var20);
                            }
                        }
                        if (var16) {
                            if (field543 != 0) {
                                method911(class134.field2090 + class2.field27 + class2.field20 + 100 + "%" + class2.field23, true);
                            }
                            method2244();
                            method131();
                            method2244();
                            Statics.field1980.method1896();
                            method2244();
                            System.gc();
                            for (int var21 = 0; var21 < 4; var21++) {
                                field544[var21].method3259();
                            }
                            for (int var22 = 0; var22 < 4; var22++) {
                                for (int var23 = 0; var23 < 104; var23++) {
                                    for (int var24 = 0; var24 < 104; var24++) {
                                        class9.field140[var22][var23][var24] = 0;
                                    }
                                }
                            }
                            method2244();
                            class9.method2248();
                            int var25 = Statics.field1267.length;
                            for (class7 var26 = (class7) class7.field101.method3369(); var26 != null; var26 = (class7) class7.field101.method3371()) {
                                if (var26.field106 != null) {
                                    Statics.field55.method1133(var26.field106);
                                    var26.field106 = null;
                                }
                                if (var26.field107 != null) {
                                    Statics.field55.method1133(var26.field107);
                                    var26.field107 = null;
                                }
                            }
                            class7.field101.method3363();
                            method2073(true);
                            if (!field545) {
                                int var27 = 0;
                                label1960: while (true) {
                                    if (var27 >= var25) {
                                        for (int var41 = 0; var41 < var25; var41++) {
                                            int var42 = (Statics.field2021[var41] >> 8) * 64 - Statics.field1795;
                                            int var43 = (Statics.field2021[var41] & 0xFF) * 64 - Statics.field884;
                                            byte[] var44 = Statics.field1267[var41];
                                            if (var44 == null && Statics.field117 < 800) {
                                                method2244();
                                                class9.method2(var42, var43, 64, 64);
                                            }
                                        }
                                        method2073(true);
                                        int var45 = 0;
                                        while (true) {
                                            if (var45 >= var25) {
                                                break label1960;
                                            }
                                            byte[] var46 = Statics.field285[var45];
                                            if (var46 != null) {
                                                int var47 = (Statics.field2021[var45] >> 8) * 64 - Statics.field1795;
                                                int var48 = (Statics.field2021[var45] & 0xFF) * 64 - Statics.field884;
                                                method2244();
                                                class9.method801(var46, var47, var48, Statics.field1980, field544);
                                            }
                                            var45++;
                                        }
                                    }
                                    int var28 = (Statics.field2021[var27] >> 8) * 64 - Statics.field1795;
                                    int var29 = (Statics.field2021[var27] & 0xFF) * 64 - Statics.field884;
                                    byte[] var30 = Statics.field1267[var27];
                                    if (var30 != null) {
                                        method2244();
                                        int var31 = Statics.field275 * 8 - 48;
                                        int var32 = Statics.field117 * 8 - 48;
                                        class164[] var33 = field544;
                                        int var34 = 0;
                                        label1957: while (true) {
                                            if (var34 >= 4) {
                                                class127 var37 = new class127(var30);
                                                int var38 = 0;
                                                while (true) {
                                                    if (var38 >= 4) {
                                                        break label1957;
                                                    }
                                                    for (int var39 = 0; var39 < 64; var39++) {
                                                        for (int var40 = 0; var40 < 64; var40++) {
                                                            class9.method2745(var37, var38, var28 + var39, var29 + var40, var31, var32, 0);
                                                        }
                                                    }
                                                    var38++;
                                                }
                                            }
                                            for (int var35 = 0; var35 < 64; var35++) {
                                                for (int var36 = 0; var36 < 64; var36++) {
                                                    if (var28 + var35 > 0 && var28 + var35 < 103 && var29 + var36 > 0 && var29 + var36 < 103) {
                                                        var33[var34].field2736[var28 + var35][var29 + var36] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var34++;
                                        }
                                    }
                                    var27++;
                                }
                            }
                            if (field545) {
                                int var49 = 0;
                                label1906: while (true) {
                                    if (var49 >= 4) {
                                        for (int var80 = 0; var80 < 13; var80++) {
                                            for (int var81 = 0; var81 < 13; var81++) {
                                                int var82 = field546[0][var80][var81];
                                                if (var82 == -1) {
                                                    class9.method2(var80 * 8, var81 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2073(true);
                                        int var83 = 0;
                                        while (true) {
                                            if (var83 >= 4) {
                                                break label1906;
                                            }
                                            method2244();
                                            for (int var84 = 0; var84 < 13; var84++) {
                                                label1829: for (int var85 = 0; var85 < 13; var85++) {
                                                    int var86 = field546[var83][var84][var85];
                                                    if (var86 != -1) {
                                                        int var87 = var86 >> 24 & 0x3;
                                                        int var88 = var86 >> 1 & 0x3;
                                                        int var89 = var86 >> 14 & 0x3FF;
                                                        int var90 = var86 >> 3 & 0x7FF;
                                                        int var91 = (var89 / 8 << 8) + var90 / 8;
                                                        for (int var92 = 0; var92 < Statics.field2021.length; var92++) {
                                                            if (Statics.field2021[var92] == var91 && Statics.field285[var92] != null) {
                                                                byte[] var93 = Statics.field285[var92];
                                                                int var94 = var84 * 8;
                                                                int var95 = var85 * 8;
                                                                int var96 = (var89 & 0x7) * 8;
                                                                int var97 = (var90 & 0x7) * 8;
                                                                class95 var98 = Statics.field1980;
                                                                class164[] var99 = field544;
                                                                class127 var100 = new class127(var93);
                                                                int var101 = -1;
                                                                while (true) {
                                                                    int var102 = var100.method2570();
                                                                    if (var102 == 0) {
                                                                        continue label1829;
                                                                    }
                                                                    var101 += var102;
                                                                    int var103 = 0;
                                                                    while (true) {
                                                                        int var104 = var100.method2570();
                                                                        if (var104 == 0) {
                                                                            break;
                                                                        }
                                                                        var103 += var104 - 1;
                                                                        int var105 = var103 & 0x3F;
                                                                        int var106 = var103 >> 6 & 0x3F;
                                                                        int var107 = var103 >> 12;
                                                                        int var108 = var100.method2491();
                                                                        int var109 = var108 >> 2;
                                                                        int var110 = var108 & 0x3;
                                                                        if (var87 == var107 && var106 >= var96 && var106 < var96 + 8 && var105 >= var97 && var105 < var97 + 8) {
                                                                            class32 var111 = class32.method701(var101);
                                                                            int var112 = var94 + class160.method582(var106 & 0x7, var105 & 0x7, var88, var111.field842, var111.field840, var110);
                                                                            int var113 = var95 + class160.method1377(var106 & 0x7, var105 & 0x7, var88, var111.field842, var111.field840, var110);
                                                                            if (var112 > 0 && var113 > 0 && var112 < 103 && var113 < 103) {
                                                                                int var114 = var83;
                                                                                if ((class9.field140[1][var112][var113] & 0x2) == 2) {
                                                                                    var114 = var83 - 1;
                                                                                }
                                                                                class164 var115 = null;
                                                                                if (var114 >= 0) {
                                                                                    var115 = var99[var114];
                                                                                }
                                                                                class9.method34(var83, var112, var113, var101, var88 + var110 & 0x3, var109, var98, var115);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var83++;
                                        }
                                    }
                                    method2244();
                                    for (int var50 = 0; var50 < 13; var50++) {
                                        for (int var51 = 0; var51 < 13; var51++) {
                                            boolean var52 = false;
                                            int var53 = field546[var49][var50][var51];
                                            if (var53 != -1) {
                                                int var54 = var53 >> 24 & 0x3;
                                                int var55 = var53 >> 1 & 0x3;
                                                int var56 = var53 >> 14 & 0x3FF;
                                                int var57 = var53 >> 3 & 0x7FF;
                                                int var58 = (var56 / 8 << 8) + var57 / 8;
                                                for (int var59 = 0; var59 < Statics.field2021.length; var59++) {
                                                    if (Statics.field2021[var59] == var58 && Statics.field1267[var59] != null) {
                                                        byte[] var60 = Statics.field1267[var59];
                                                        int var61 = var50 * 8;
                                                        int var62 = var51 * 8;
                                                        int var63 = (var56 & 0x7) * 8;
                                                        int var64 = (var57 & 0x7) * 8;
                                                        class164[] var65 = field544;
                                                        for (int var66 = 0; var66 < 8; var66++) {
                                                            for (int var67 = 0; var67 < 8; var67++) {
                                                                if (var61 + var66 > 0 && var61 + var66 < 103 && var62 + var67 > 0 && var62 + var67 < 103) {
                                                                    var65[var49].field2736[var61 + var66][var62 + var67] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class127 var68 = new class127(var60);
                                                        for (int var69 = 0; var69 < 4; var69++) {
                                                            for (int var70 = 0; var70 < 64; var70++) {
                                                                for (int var71 = 0; var71 < 64; var71++) {
                                                                    if (var54 == var69 && var70 >= var63 && var70 < var63 + 8 && var71 >= var64 && var71 < var64 + 8) {
                                                                        int var75 = var70 & 0x7;
                                                                        int var76 = var71 & 0x7;
                                                                        int var78 = var55 & 0x3;
                                                                        int var79;
                                                                        if (var78 == 0) {
                                                                            var79 = var75;
                                                                        } else if (var78 == 1) {
                                                                            var79 = var76;
                                                                        } else if (var78 == 2) {
                                                                            var79 = 7 - var75;
                                                                        } else {
                                                                            var79 = 7 - var76;
                                                                        }
                                                                        class9.method2745(var68, var49, var61 + var79, var62 + class160.method3212(var70 & 0x7, var71 & 0x7, var55), 0, 0, var55);
                                                                    } else {
                                                                        class9.method2745(var68, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var52 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var52) {
                                                class9.method2738(var49, var50 * 8, var51 * 8);
                                            }
                                        }
                                    }
                                    var49++;
                                }
                            }
                            method2073(true);
                            method131();
                            method2244();
                            class95 var116 = Statics.field1980;
                            class164[] var117 = field544;
                            for (int var118 = 0; var118 < 4; var118++) {
                                for (int var119 = 0; var119 < 104; var119++) {
                                    for (int var120 = 0; var120 < 104; var120++) {
                                        if ((class9.field140[var118][var119][var120] & 0x1) == 1) {
                                            int var121 = var118;
                                            if ((class9.field140[1][var119][var120] & 0x2) == 2) {
                                                var121 = var118 - 1;
                                            }
                                            if (var121 >= 0) {
                                                var117[var121].method3262(var119, var120);
                                            }
                                        }
                                    }
                                }
                            }
                            class9.field157 += (int) (Math.random() * 5.0D) - 2;
                            if (class9.field157 < -8) {
                                class9.field157 = -8;
                            }
                            if (class9.field157 > 8) {
                                class9.field157 = 8;
                            }
                            class9.field137 += (int) (Math.random() * 5.0D) - 2;
                            if (class9.field137 < -16) {
                                class9.field137 = -16;
                            }
                            if (class9.field137 > 16) {
                                class9.field137 = 16;
                            }
                            for (int var122 = 0; var122 < 4; var122++) {
                                byte[][] var123 = Statics.field141[var122];
                                int var124 = (int) Math.sqrt(5100.0D);
                                int var125 = var124 * 768 >> 8;
                                for (int var126 = 1; var126 < 103; var126++) {
                                    for (int var127 = 1; var127 < 103; var127++) {
                                        int var128 = class9.field136[var122][var127 + 1][var126] - class9.field136[var122][var127 - 1][var126];
                                        int var129 = class9.field136[var122][var127][var126 + 1] - class9.field136[var122][var127][var126 - 1];
                                        int var130 = (int) Math.sqrt((double) (var129 * var129 + var128 * var128 + 65536));
                                        int var131 = (var128 << 8) / var130;
                                        int var132 = 65536 / var130;
                                        int var133 = (var129 << 8) / var130;
                                        int var134 = (var133 * -50 + var131 * -50 + var132 * -10) / var125 + 96;
                                        int var135 = (var123[var127][var126] >> 1) + (var123[var127][var126 + 1] >> 3) + (var123[var127][var126 - 1] >> 2) + (var123[var127 - 1][var126] >> 2) + (var123[var127 + 1][var126] >> 3);
                                        Statics.field294[var127][var126] = var134 - var135;
                                    }
                                }
                                for (int var136 = 0; var136 < 104; var136++) {
                                    Statics.field142[var136] = 0;
                                    Statics.field966[var136] = 0;
                                    Statics.field154[var136] = 0;
                                    Statics.field148[var136] = 0;
                                    Statics.field2707[var136] = 0;
                                }
                                for (int var137 = -5; var137 < 109; var137++) {
                                    for (int var138 = 0; var138 < 104; var138++) {
                                        int var139 = var137 + 5;
                                        if (var139 >= 0 && var139 < 104) {
                                            int var140 = Statics.field139[var122][var139][var138] & 0xFF;
                                            if (var140 > 0) {
                                                int var141 = var140 - 1;
                                                class33 var142 = (class33) class33.field878.method3308((long) var141);
                                                class33 var143;
                                                if (var142 == null) {
                                                    byte[] var144 = Statics.field877.method3032(1, var141);
                                                    class33 var145 = new class33();
                                                    if (var144 != null) {
                                                        var145.method696(new class127(var144), var141);
                                                    }
                                                    var145.method711();
                                                    class33.field878.method3307(var145, (long) var141);
                                                    var143 = var145;
                                                } else {
                                                    var143 = var142;
                                                }
                                                Statics.field142[var138] += var143.field880;
                                                Statics.field966[var138] += var143.field881;
                                                Statics.field154[var138] += var143.field882;
                                                Statics.field148[var138] += var143.field883;
                                                var10002 = Statics.field2707[var138]++;
                                            }
                                        }
                                        int var147 = var137 - 5;
                                        if (var147 >= 0 && var147 < 104) {
                                            int var148 = Statics.field139[var122][var147][var138] & 0xFF;
                                            if (var148 > 0) {
                                                int var149 = var148 - 1;
                                                class33 var150 = (class33) class33.field878.method3308((long) var149);
                                                class33 var151;
                                                if (var150 == null) {
                                                    byte[] var152 = Statics.field877.method3032(1, var149);
                                                    class33 var153 = new class33();
                                                    if (var152 != null) {
                                                        var153.method696(new class127(var152), var149);
                                                    }
                                                    var153.method711();
                                                    class33.field878.method3307(var153, (long) var149);
                                                    var151 = var153;
                                                } else {
                                                    var151 = var150;
                                                }
                                                Statics.field142[var138] -= var151.field880;
                                                Statics.field966[var138] -= var151.field881;
                                                Statics.field154[var138] -= var151.field882;
                                                Statics.field148[var138] -= var151.field883;
                                                var10002 = Statics.field2707[var138]--;
                                            }
                                        }
                                    }
                                    if (var137 >= 1 && var137 < 103) {
                                        int var155 = 0;
                                        int var156 = 0;
                                        int var157 = 0;
                                        int var158 = 0;
                                        int var159 = 0;
                                        for (int var160 = -5; var160 < 109; var160++) {
                                            int var161 = var160 + 5;
                                            if (var161 >= 0 && var161 < 104) {
                                                var155 += Statics.field142[var161];
                                                var156 += Statics.field966[var161];
                                                var157 += Statics.field154[var161];
                                                var158 += Statics.field148[var161];
                                                var159 += Statics.field2707[var161];
                                            }
                                            int var162 = var160 - 5;
                                            if (var162 >= 0 && var162 < 104) {
                                                var155 -= Statics.field142[var162];
                                                var156 -= Statics.field966[var162];
                                                var157 -= Statics.field154[var162];
                                                var158 -= Statics.field148[var162];
                                                var159 -= Statics.field2707[var162];
                                            }
                                            if (var160 >= 1 && var160 < 103 && (!field486 || (class9.field140[0][var137][var160] & 0x2) != 0 || (class9.field140[var122][var137][var160] & 0x10) == 0 && class9.method129(var122, var137, var160) == field538)) {
                                                if (var122 < class9.field138) {
                                                    class9.field138 = var122;
                                                }
                                                int var163 = Statics.field139[var122][var137][var160] & 0xFF;
                                                int var164 = Statics.field2558[var122][var137][var160] & 0xFF;
                                                if (var163 > 0 || var164 > 0) {
                                                    int var165 = class9.field136[var122][var137][var160];
                                                    int var166 = class9.field136[var122][var137 + 1][var160];
                                                    int var167 = class9.field136[var122][var137 + 1][var160 + 1];
                                                    int var168 = class9.field136[var122][var137][var160 + 1];
                                                    int var169 = Statics.field294[var137][var160];
                                                    int var170 = Statics.field294[var137 + 1][var160];
                                                    int var171 = Statics.field294[var137 + 1][var160 + 1];
                                                    int var172 = Statics.field294[var137][var160 + 1];
                                                    int var173 = -1;
                                                    int var174 = -1;
                                                    if (var163 > 0) {
                                                        int var175 = var155 * 256 / var158;
                                                        int var176 = var156 / var159;
                                                        int var177 = var157 / var159;
                                                        var173 = class9.method2074(var175, var176, var177);
                                                        int var178 = class9.field157 + var175 & 0xFF;
                                                        int var179 = class9.field137 + var177;
                                                        if (var179 < 0) {
                                                            var179 = 0;
                                                        } else if (var179 > 255) {
                                                            var179 = 255;
                                                        }
                                                        var174 = class9.method2074(var178, var176, var179);
                                                    }
                                                    if (var122 > 0) {
                                                        boolean var180 = true;
                                                        if (var163 == 0 && Statics.field144[var122][var137][var160] != 0) {
                                                            var180 = false;
                                                        }
                                                        if (var164 > 0 && !class37.method1371(var164 - 1).field947) {
                                                            var180 = false;
                                                        }
                                                        if (var180 && var165 == var166 && var165 == var167 && var165 == var168) {
                                                            Statics.field258[var122][var137][var160] |= 0x924;
                                                        }
                                                    }
                                                    int var181 = 0;
                                                    if (var174 != -1) {
                                                        var181 = class104.field1783[class9.method2750(var174, 96)];
                                                    }
                                                    if (var164 == 0) {
                                                        var116.method1901(var122, var137, var160, 0, 0, -1, var165, var166, var167, var168, class9.method2750(var173, var169), class9.method2750(var173, var170), class9.method2750(var173, var171), class9.method2750(var173, var172), 0, 0, 0, 0, var181, 0);
                                                    } else {
                                                        int var182 = Statics.field144[var122][var137][var160] + 1;
                                                        byte var183 = Statics.field1932[var122][var137][var160];
                                                        class37 var184 = class37.method1371(var164 - 1);
                                                        int var185 = var184.field946;
                                                        int var186;
                                                        int var187;
                                                        if (var185 >= 0) {
                                                            var186 = Statics.field1781.method2229(var185);
                                                            var187 = -1;
                                                        } else if (var184.field943 == 16711935) {
                                                            var187 = -2;
                                                            var185 = -1;
                                                            var186 = -2;
                                                        } else {
                                                            var187 = class9.method2074(var184.field955, var184.field950, var184.field951);
                                                            int var188 = class9.field157 + var184.field955 & 0xFF;
                                                            int var189 = class9.field137 + var184.field951;
                                                            if (var189 < 0) {
                                                                var189 = 0;
                                                            } else if (var189 > 255) {
                                                                var189 = 255;
                                                            }
                                                            var186 = class9.method2074(var188, var184.field950, var189);
                                                        }
                                                        int var190 = 0;
                                                        if (var186 != -2) {
                                                            var190 = class104.field1783[class9.method3152(var186, 96)];
                                                        }
                                                        if (var184.field949 != -1) {
                                                            int var191 = class9.field157 + var184.field948 & 0xFF;
                                                            int var192 = class9.field137 + var184.field954;
                                                            if (var192 < 0) {
                                                                var192 = 0;
                                                            } else if (var192 > 255) {
                                                                var192 = 255;
                                                            }
                                                            int var193 = class9.method2074(var191, var184.field953, var192);
                                                            var190 = class104.field1783[class9.method3152(var193, 96)];
                                                        }
                                                        var116.method1901(var122, var137, var160, var182, var183, var185, var165, var166, var167, var168, class9.method2750(var173, var169), class9.method2750(var173, var170), class9.method2750(var173, var171), class9.method2750(var173, var172), class9.method3152(var187, var169), class9.method3152(var187, var170), class9.method3152(var187, var171), class9.method3152(var187, var172), var181, var190);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var194 = 1; var194 < 103; var194++) {
                                    for (int var195 = 1; var195 < 103; var195++) {
                                        var116.method1930(var122, var195, var194, class9.method129(var122, var195, var194));
                                    }
                                }
                                Statics.field139[var122] = (byte[][]) null;
                                Statics.field2558[var122] = (byte[][]) null;
                                Statics.field144[var122] = (byte[][]) null;
                                Statics.field1932[var122] = (byte[][]) null;
                                Statics.field141[var122] = (byte[][]) null;
                            }
                            var116.method1999(-50, -10, -50);
                            for (int var196 = 0; var196 < 104; var196++) {
                                for (int var197 = 0; var197 < 104; var197++) {
                                    if ((class9.field140[1][var196][var197] & 0x2) == 2) {
                                        var116.method1898(var196, var197);
                                    }
                                }
                            }
                            int var198 = 1;
                            int var199 = 2;
                            int var200 = 4;
                            for (int var201 = 0; var201 < 4; var201++) {
                                if (var201 > 0) {
                                    var198 <<= 0x3;
                                    var199 <<= 0x3;
                                    var200 <<= 0x3;
                                }
                                for (int var202 = 0; var202 <= var201; var202++) {
                                    for (int var203 = 0; var203 <= 104; var203++) {
                                        for (int var204 = 0; var204 <= 104; var204++) {
                                            if ((Statics.field258[var202][var204][var203] & var198) != 0) {
                                                int var205 = var203;
                                                int var206 = var203;
                                                int var207 = var202;
                                                int var208 = var202;
                                                while (var205 > 0 && (Statics.field258[var202][var204][var205 - 1] & var198) != 0) {
                                                    var205--;
                                                }
                                                while (var206 < 104 && (Statics.field258[var202][var204][var206 + 1] & var198) != 0) {
                                                    var206++;
                                                }
                                                label1553: while (var207 > 0) {
                                                    for (int var209 = var205; var209 <= var206; var209++) {
                                                        if ((Statics.field258[var207 - 1][var204][var209] & var198) == 0) {
                                                            break label1553;
                                                        }
                                                    }
                                                    var207--;
                                                }
                                                label1542: while (var208 < var201) {
                                                    for (int var210 = var205; var210 <= var206; var210++) {
                                                        if ((Statics.field258[var208 + 1][var204][var210] & var198) == 0) {
                                                            break label1542;
                                                        }
                                                    }
                                                    var208++;
                                                }
                                                int var211 = (var208 + 1 - var207) * (var206 - var205 + 1);
                                                if (var211 >= 8) {
                                                    short var212 = 240;
                                                    int var213 = class9.field136[var208][var204][var205] - var212;
                                                    int var214 = class9.field136[var207][var204][var205];
                                                    class95.method1899(var201, 1, var204 * 128, var204 * 128, var205 * 128, var206 * 128 + 128, var213, var214);
                                                    for (int var215 = var207; var215 <= var208; var215++) {
                                                        for (int var216 = var205; var216 <= var206; var216++) {
                                                            Statics.field258[var215][var204][var216] &= ~var198;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field258[var202][var204][var203] & var199) != 0) {
                                                int var217 = var204;
                                                int var218 = var204;
                                                int var219 = var202;
                                                int var220 = var202;
                                                while (var217 > 0 && (Statics.field258[var202][var217 - 1][var203] & var199) != 0) {
                                                    var217--;
                                                }
                                                while (var218 < 104 && (Statics.field258[var202][var218 + 1][var203] & var199) != 0) {
                                                    var218++;
                                                }
                                                label1606: while (var219 > 0) {
                                                    for (int var221 = var217; var221 <= var218; var221++) {
                                                        if ((Statics.field258[var219 - 1][var221][var203] & var199) == 0) {
                                                            break label1606;
                                                        }
                                                    }
                                                    var219--;
                                                }
                                                label1595: while (var220 < var201) {
                                                    for (int var222 = var217; var222 <= var218; var222++) {
                                                        if ((Statics.field258[var220 + 1][var222][var203] & var199) == 0) {
                                                            break label1595;
                                                        }
                                                    }
                                                    var220++;
                                                }
                                                int var223 = (var220 + 1 - var219) * (var218 - var217 + 1);
                                                if (var223 >= 8) {
                                                    short var224 = 240;
                                                    int var225 = class9.field136[var220][var217][var203] - var224;
                                                    int var226 = class9.field136[var219][var217][var203];
                                                    class95.method1899(var201, 2, var217 * 128, var218 * 128 + 128, var203 * 128, var203 * 128, var225, var226);
                                                    for (int var227 = var219; var227 <= var220; var227++) {
                                                        for (int var228 = var217; var228 <= var218; var228++) {
                                                            Statics.field258[var227][var228][var203] &= ~var199;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field258[var202][var204][var203] & var200) != 0) {
                                                int var229 = var204;
                                                int var230 = var204;
                                                int var231 = var203;
                                                int var232 = var203;
                                                while (var231 > 0 && (Statics.field258[var202][var204][var231 - 1] & var200) != 0) {
                                                    var231--;
                                                }
                                                while (var232 < 104 && (Statics.field258[var202][var204][var232 + 1] & var200) != 0) {
                                                    var232++;
                                                }
                                                label1659: while (var229 > 0) {
                                                    for (int var233 = var231; var233 <= var232; var233++) {
                                                        if ((Statics.field258[var202][var229 - 1][var233] & var200) == 0) {
                                                            break label1659;
                                                        }
                                                    }
                                                    var229--;
                                                }
                                                label1648: while (var230 < 104) {
                                                    for (int var234 = var231; var234 <= var232; var234++) {
                                                        if ((Statics.field258[var202][var230 + 1][var234] & var200) == 0) {
                                                            break label1648;
                                                        }
                                                    }
                                                    var230++;
                                                }
                                                if ((var230 - var229 + 1) * (var232 - var231 + 1) >= 4) {
                                                    int var235 = class9.field136[var202][var229][var231];
                                                    class95.method1899(var201, 4, var229 * 128, var230 * 128 + 128, var231 * 128, var232 * 128 + 128, var235, var235);
                                                    for (int var236 = var229; var236 <= var230; var236++) {
                                                        for (int var237 = var231; var237 <= var232; var237++) {
                                                            Statics.field258[var202][var236][var237] &= ~var200;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method2073(true);
                            int var238 = class9.field138;
                            if (var238 > Statics.field2384) {
                                var238 = Statics.field2384;
                            }
                            if (var238 < Statics.field2384 - 1) {
                                int var239 = Statics.field2384 - 1;
                            }
                            if (field486) {
                                Statics.field1980.method1897(class9.field138);
                            } else {
                                Statics.field1980.method1897(0);
                            }
                            for (int var240 = 0; var240 < 104; var240++) {
                                for (int var241 = 0; var241 < 104; var241++) {
                                    method172(var240, var241);
                                }
                            }
                            method2244();
                            method47();
                            class32.field827.method3311();
                            if (Statics.field1339 != null) {
                                field540.method2352(0);
                                field540.method2480(1057001181);
                            }
                            if (!field545) {
                                int var242 = (Statics.field275 - 6) / 8;
                                int var243 = (Statics.field275 + 6) / 8;
                                int var244 = (Statics.field117 - 6) / 8;
                                int var245 = (Statics.field117 + 6) / 8;
                                for (int var246 = var242 - 1; var246 <= var243 + 1; var246++) {
                                    for (int var247 = var244 - 1; var247 <= var245 + 1; var247++) {
                                        if (var246 < var242 || var246 > var243 || var247 < var244 || var247 > var245) {
                                            Statics.field201.method3051("m" + var246 + "_" + var247);
                                            Statics.field201.method3051("l" + var246 + "_" + var247);
                                        }
                                    }
                                }
                            }
                            method828(30);
                            method2244();
                            class9.method14();
                            field540.method2352(148);
                            Statics.field1684.method1372();
                            for (int var248 = 0; var248 < 32; var248++) {
                                field1317[var248] = 0L;
                            }
                            for (int var249 = 0; var249 < 32; var249++) {
                                field1320[var249] = 0L;
                            }
                            Statics.field112 = 0;
                        } else {
                            field543 = 2;
                        }
                    } else {
                        field543 = 1;
                    }
                }
                if (field489 == 30) {
                    if (field715 > 1) {
                        field715--;
                    }
                    if (field533 > 0) {
                        field533--;
                    }
                    if (field665) {
                        field665 = false;
                        if (field533 > 0) {
                            method169();
                        } else {
                            method828(40);
                            Statics.field1439 = Statics.field199;
                            Statics.field199 = null;
                        }
                    } else {
                        for (int var250 = 0; var250 < 100 && method150(); var250++) {
                        }
                        if (field489 == 30) {
                            class182.method789(field540, 146);
                            Object var251 = Statics.field493.field251;
                            synchronized (Statics.field493.field251) {
                                if (!field622) {
                                    Statics.field493.field252 = 0;
                                } else if (class77.field1398 != 0 || Statics.field493.field252 >= 40) {
                                    field540.method2352(123);
                                    field540.method2477(0);
                                    int var252 = field540.field2039;
                                    int var253 = 0;
                                    for (int var254 = 0; var254 < Statics.field493.field252 && field540.field2039 - var252 < 240; var254++) {
                                        var253++;
                                        int var255 = Statics.field493.field254[var254];
                                        if (var255 < 0) {
                                            var255 = 0;
                                        } else if (var255 > 502) {
                                            var255 = 502;
                                        }
                                        int var256 = Statics.field493.field250[var254];
                                        if (var256 < 0) {
                                            var256 = 0;
                                        } else if (var256 > 764) {
                                            var256 = 764;
                                        }
                                        int var257 = var255 * 765 + var256;
                                        if (Statics.field493.field254[var254] == -1 && Statics.field493.field250[var254] == -1) {
                                            var256 = -1;
                                            var255 = -1;
                                            var257 = 524287;
                                        }
                                        if (field494 != var256 || field597 != var255) {
                                            int var258 = var256 - field494;
                                            field494 = var256;
                                            int var259 = var255 - field597;
                                            field597 = var255;
                                            if (field634 < 8 && var258 >= -32 && var258 <= 31 && var259 >= -32 && var259 <= 31) {
                                                var258 += 32;
                                                var259 += 32;
                                                field540.method2694((field634 << 12) + (var258 << 6) + var259);
                                                field634 = 0;
                                            } else if (field634 < 8) {
                                                field540.method2574((field634 << 19) + 8388608 + var257);
                                                field634 = 0;
                                            } else {
                                                field540.method2480((field634 << 19) + -1073741824 + var257);
                                                field634 = 0;
                                            }
                                        } else if (field634 < 2047) {
                                            field634++;
                                        }
                                    }
                                    field540.method2488(field540.field2039 - var252);
                                    if (var253 >= Statics.field493.field252) {
                                        Statics.field493.field252 = 0;
                                    } else {
                                        Statics.field493.field252 -= var253;
                                        for (int var260 = 0; var260 < Statics.field493.field252; var260++) {
                                            Statics.field493.field250[var260] = Statics.field493.field250[var253 + var260];
                                            Statics.field493.field254[var260] = Statics.field493.field254[var253 + var260];
                                        }
                                    }
                                }
                            }
                            if (class77.field1398 != 0) {
                                long var262 = (class77.field1400 - field492 * -1L) / 50L;
                                if (var262 > 4095L) {
                                    var262 = 4095L;
                                }
                                field492 = class77.field1400 * -1L;
                                int var264 = class77.field1387;
                                if (var264 < 0) {
                                    var264 = 0;
                                } else if (var264 > 502) {
                                    var264 = 502;
                                }
                                int var265 = class77.field1399;
                                if (var265 < 0) {
                                    var265 = 0;
                                } else if (var265 > 764) {
                                    var265 = 764;
                                }
                                int var266 = var264 * 765 + var265;
                                byte var267 = 0;
                                if (class77.field1398 == 2) {
                                    var267 = 1;
                                }
                                int var268 = (int) var262;
                                field540.method2352(238);
                                field540.method2480((var267 << 19) + (var268 << 20) + var266);
                            }
                            if (class75.field1369 > 0) {
                                field540.method2352(106);
                                field540.method2694(0);
                                int var269 = field540.field2039;
                                long var270 = class121.method142();
                                for (int var272 = 0; var272 < class75.field1369; var272++) {
                                    long var273 = var270 - field710;
                                    if (var273 > 16777215L) {
                                        var273 = 16777215L;
                                    }
                                    field710 = var270;
                                    field540.method2511(class75.field1368[var272]);
                                    field540.method2574((int) var273);
                                }
                                field540.method2681(field540.field2039 - var269);
                            }
                            if (field479 > 0) {
                                field479--;
                            }
                            if (class75.field1362[96] || class75.field1362[97] || class75.field1362[98] || class75.field1362[99]) {
                                field516 = true;
                            }
                            if (field516 && field479 <= 0) {
                                field479 = 20;
                                field516 = false;
                                field540.method2352(101);
                                field540.method2694(field572);
                                field540.method2537(field497);
                            }
                            if (Statics.field373 && !field563) {
                                field563 = true;
                                field540.method2352(45);
                                field540.method2477(1);
                            }
                            if (!Statics.field373 && field563) {
                                field563 = false;
                                field540.method2352(45);
                                field540.method2477(0);
                            }
                            method3213();
                            if (field489 == 30) {
                                method9();
                                for (int var275 = 0; var275 < field726; var275++) {
                                    var10002 = field729[var275]--;
                                    if (field729[var275] >= -10) {
                                        class57 var277 = field731[var275];
                                        if (var277 == null) {
                                            class57 var10000 = (class57) null;
                                            var277 = class57.method1278(Statics.field698, field714[var275], 0);
                                            if (var277 == null) {
                                                continue;
                                            }
                                            field729[var275] += var277.method1280();
                                            field731[var275] = var277;
                                        }
                                        if (field729[var275] < 0) {
                                            int var284;
                                            if (field730[var275] == 0) {
                                                var284 = field724;
                                            } else {
                                                int var278 = (field730[var275] & 0xFF) * 128;
                                                int var279 = field730[var275] >> 16 & 0xFF;
                                                int var280 = var279 * 128 + 64 - Statics.field885.field471;
                                                if (var280 < 0) {
                                                    var280 = -var280;
                                                }
                                                int var281 = field730[var275] >> 8 & 0xFF;
                                                int var282 = var281 * 128 + 64 - Statics.field885.field420;
                                                if (var282 < 0) {
                                                    var282 = -var282;
                                                }
                                                int var283 = var280 + var282 - 128;
                                                if (var283 > var278) {
                                                    field729[var275] = -100;
                                                    continue;
                                                }
                                                if (var283 < 0) {
                                                    var283 = 0;
                                                }
                                                var284 = field496 * (var278 - var283) / var278;
                                            }
                                            if (var284 > 0) {
                                                class63 var285 = var277.method1279().method1346(Statics.field1289);
                                                class45 var286 = class45.method1109(var285, 100, var284);
                                                var286.method982(field728[var275] - 1);
                                                Statics.field55.method1132(var286);
                                            }
                                            field729[var275] = -100;
                                        }
                                    } else {
                                        field726--;
                                        for (int var276 = var275; var276 < field726; var276++) {
                                            field714[var276] = field714[var276 + 1];
                                            field731[var276] = field731[var276 + 1];
                                            field728[var276] = field728[var276 + 1];
                                            field729[var276] = field729[var276 + 1];
                                            field730[var276] = field730[var276 + 1];
                                        }
                                        var275--;
                                    }
                                }
                                if (field537) {
                                    boolean var287;
                                    if (class138.field2332 == 0) {
                                        var287 = Statics.field2333.method2863();
                                    } else {
                                        var287 = true;
                                    }
                                    if (!var287) {
                                        if (field652 != 0 && field722 != -1) {
                                            class138.method2756(Statics.field1028, field722, 0, field652, false);
                                        }
                                        field537 = false;
                                    }
                                }
                                field531++;
                                if (field531 <= 750) {
                                    for (int var288 = -1; var288 < field607; var288++) {
                                        int var289;
                                        if (var288 == -1) {
                                            var289 = 2047;
                                        } else {
                                            var289 = field522[var288];
                                        }
                                        class3 var290 = field520[var289];
                                        if (var290 != null) {
                                            method232(var290, 1);
                                        }
                                    }
                                    for (int var291 = 0; var291 < field743; var291++) {
                                        int var292 = field617[var291];
                                        class25 var293 = field638[var292];
                                        if (var293 != null) {
                                            method232(var293, var293.field401.field789);
                                        }
                                    }
                                    for (int var294 = -1; var294 < field607; var294++) {
                                        int var295;
                                        if (var294 == -1) {
                                            var295 = 2047;
                                        } else {
                                            var295 = field522[var294];
                                        }
                                        class3 var296 = field520[var295];
                                        if (var296 != null && var296.field427 > 0) {
                                            var296.field427--;
                                            if (var296.field427 == 0) {
                                                var296.field432 = null;
                                            }
                                        }
                                    }
                                    for (int var297 = 0; var297 < field743; var297++) {
                                        int var298 = field617[var297];
                                        class25 var299 = field638[var298];
                                        if (var299 != null && var299.field427 > 0) {
                                            var299.field427--;
                                            if (var299.field427 == 0) {
                                                var299.field432 = null;
                                            }
                                        }
                                    }
                                    field510++;
                                    if (field596 != 0) {
                                        field547 += 20;
                                        if (field547 >= 400) {
                                            field596 = 0;
                                        }
                                    }
                                    if (Statics.field1831 != null) {
                                        field659++;
                                        if (field659 >= 15) {
                                            method394(Statics.field1831);
                                            Statics.field1831 = null;
                                        }
                                    }
                                    if (Statics.field1823 != null) {
                                        method394(Statics.field1823);
                                        field646++;
                                        if (class77.field1392 > field600 + 5 || class77.field1392 < field600 - 5 || class77.field1393 > field601 + 5 || class77.field1393 < field601 - 5) {
                                            field603 = true;
                                        }
                                        if (class77.field1397 == 0) {
                                            if (field603 && field646 >= 5) {
                                                if (Statics.field292 == Statics.field1823 && field635 != field602) {
                                                    class158 var300 = Statics.field1823;
                                                    byte var301 = 0;
                                                    if (field649 == 1 && var300.field2589 == 206) {
                                                        var301 = 1;
                                                    }
                                                    if (var300.field2687[field602] <= 0) {
                                                        var301 = 0;
                                                    }
                                                    if (class162.method2959(method2374(var300))) {
                                                        int var302 = field635;
                                                        int var303 = field602;
                                                        var300.field2687[var303] = var300.field2687[var302];
                                                        var300.field2688[var303] = var300.field2688[var302];
                                                        var300.field2687[var302] = -1;
                                                        var300.field2688[var302] = 0;
                                                    } else if (var301 == 1) {
                                                        int var304 = field635;
                                                        int var305 = field602;
                                                        while (var304 != var305) {
                                                            if (var304 > var305) {
                                                                var300.method3175(var304 - 1, var304);
                                                                var304--;
                                                            } else if (var304 < var305) {
                                                                var300.method3175(var304 + 1, var304);
                                                                var304++;
                                                            }
                                                        }
                                                    } else {
                                                        var300.method3175(field602, field635);
                                                    }
                                                    field540.method2352(20);
                                                    field540.method2537(field635);
                                                    field540.method2513(var301);
                                                    field540.method2520(field602);
                                                    field540.method2548(Statics.field1823.field2690);
                                                }
                                            } else if ((field627 == 1 || method133(field629 - 1)) && field629 > 2) {
                                                method241();
                                            } else if (field629 > 0) {
                                                method165(field629 - 1);
                                            }
                                            field659 = 10;
                                            class77.field1398 = 0;
                                            Statics.field1823 = null;
                                        }
                                    }
                                    class158 var306 = Statics.field366;
                                    class158 var307 = Statics.field1271;
                                    Statics.field366 = null;
                                    Statics.field1271 = null;
                                    field661 = null;
                                    field703 = false;
                                    field662 = false;
                                    for (field654 = 0; class75.method1438() && field654 < 128; field654++) {
                                        field709[field654] = Statics.field1555;
                                        field707[field654] = Statics.field1187;
                                    }
                                    method242(field721, 0, 0, 765, 503, 0, 0);
                                    field669++;
                                    while (true) {
                                        class1 var308;
                                        class158 var309;
                                        class158 var310;
                                        do {
                                            var308 = (class1) field725.method3398();
                                            if (var308 == null) {
                                                while (true) {
                                                    class1 var311;
                                                    class158 var312;
                                                    class158 var313;
                                                    do {
                                                        var311 = (class1) field685.method3398();
                                                        if (var311 == null) {
                                                            while (true) {
                                                                class1 var314;
                                                                class158 var315;
                                                                class158 var316;
                                                                do {
                                                                    var314 = (class1) field683.method3398();
                                                                    if (var314 == null) {
                                                                        if (field657 != null) {
                                                                            method223();
                                                                        }
                                                                        if (class95.field1593 != -1) {
                                                                            int var317 = class95.field1593;
                                                                            int var318 = class95.field1572;
                                                                            boolean var319 = method1886(Statics.field885.field453[0], Statics.field885.field459[0], var317, var318, true, 0, 0, 0, 0, 0, 0);
                                                                            class95.field1593 = -1;
                                                                            if (var319) {
                                                                                field593 = class77.field1399;
                                                                                field506 = class77.field1387;
                                                                                field596 = 1;
                                                                                field547 = 0;
                                                                            }
                                                                        }
                                                                        method143();
                                                                        if (Statics.field366 != var306) {
                                                                            if (var306 != null) {
                                                                                method394(var306);
                                                                            }
                                                                            if (Statics.field366 != null) {
                                                                                method394(Statics.field366);
                                                                            }
                                                                        }
                                                                        if (Statics.field1271 != var307 && field639 == field626) {
                                                                            if (var307 != null) {
                                                                                method394(var307);
                                                                            }
                                                                            if (Statics.field1271 != null) {
                                                                                method394(Statics.field1271);
                                                                            }
                                                                        }
                                                                        if (Statics.field1271 == null) {
                                                                            if (field626 > 0) {
                                                                                field626--;
                                                                            }
                                                                        } else if (field626 < field639) {
                                                                            field626++;
                                                                            if (field639 == field626) {
                                                                                method394(Statics.field1271);
                                                                            }
                                                                        }
                                                                        method138();
                                                                        if (field732) {
                                                                            int var320 = Statics.field1181 * 128 + 64;
                                                                            int var321 = Statics.field1350 * 128 + 64;
                                                                            int var322 = method2411(var320, var321, Statics.field2384) - Statics.field264;
                                                                            if (Statics.field266 < var320) {
                                                                                Statics.field266 += Statics.field749 * (var320 - Statics.field266) / 1000 + Statics.field1796;
                                                                                if (Statics.field266 > var320) {
                                                                                    Statics.field266 = var320;
                                                                                }
                                                                            }
                                                                            if (Statics.field266 > var320) {
                                                                                Statics.field266 -= Statics.field749 * (Statics.field266 - var320) / 1000 + Statics.field1796;
                                                                                if (Statics.field266 < var320) {
                                                                                    Statics.field266 = var320;
                                                                                }
                                                                            }
                                                                            if (Statics.field259 < var322) {
                                                                                Statics.field259 += Statics.field749 * (var322 - Statics.field259) / 1000 + Statics.field1796;
                                                                                if (Statics.field259 > var322) {
                                                                                    Statics.field259 = var322;
                                                                                }
                                                                            }
                                                                            if (Statics.field259 > var322) {
                                                                                Statics.field259 -= Statics.field749 * (Statics.field259 - var322) / 1000 + Statics.field1796;
                                                                                if (Statics.field259 < var322) {
                                                                                    Statics.field259 = var322;
                                                                                }
                                                                            }
                                                                            if (Statics.field930 < var321) {
                                                                                Statics.field930 += Statics.field749 * (var321 - Statics.field930) / 1000 + Statics.field1796;
                                                                                if (Statics.field930 > var321) {
                                                                                    Statics.field930 = var321;
                                                                                }
                                                                            }
                                                                            if (Statics.field930 > var321) {
                                                                                Statics.field930 -= Statics.field749 * (Statics.field930 - var321) / 1000 + Statics.field1796;
                                                                                if (Statics.field930 < var321) {
                                                                                    Statics.field930 = var321;
                                                                                }
                                                                            }
                                                                            int var323 = Statics.field86 * 128 + 64;
                                                                            int var324 = Statics.field1029 * 128 + 64;
                                                                            int var325 = method2411(var323, var324, Statics.field2384) - Statics.field277;
                                                                            int var326 = var323 - Statics.field266;
                                                                            int var327 = var325 - Statics.field259;
                                                                            int var328 = var324 - Statics.field930;
                                                                            int var329 = (int) Math.sqrt((double) (var326 * var326 + var328 * var328));
                                                                            int var330 = (int) (Math.atan2((double) var327, (double) var329) * 325.949D) & 0x7FF;
                                                                            int var331 = (int) (Math.atan2((double) var326, (double) var328) * -325.949D) & 0x7FF;
                                                                            if (var330 < 128) {
                                                                                var330 = 128;
                                                                            }
                                                                            if (var330 > 383) {
                                                                                var330 = 383;
                                                                            }
                                                                            if (Statics.field2067 < var330) {
                                                                                Statics.field2067 += Statics.field379 * (var330 - Statics.field2067) / 1000 + Statics.field13;
                                                                                if (Statics.field2067 > var330) {
                                                                                    Statics.field2067 = var330;
                                                                                }
                                                                            }
                                                                            if (Statics.field2067 > var330) {
                                                                                Statics.field2067 -= Statics.field379 * (Statics.field2067 - var330) / 1000 + Statics.field13;
                                                                                if (Statics.field2067 < var330) {
                                                                                    Statics.field2067 = var330;
                                                                                }
                                                                            }
                                                                            int var332 = var331 - Statics.field183;
                                                                            if (var332 > 1024) {
                                                                                var332 -= 2048;
                                                                            }
                                                                            if (var332 < -1024) {
                                                                                var332 += 2048;
                                                                            }
                                                                            if (var332 > 0) {
                                                                                Statics.field183 += Statics.field379 * var332 / 1000 + Statics.field13;
                                                                                Statics.field183 &= 0x7FF;
                                                                            }
                                                                            if (var332 < 0) {
                                                                                Statics.field183 -= Statics.field379 * -var332 / 1000 + Statics.field13;
                                                                                Statics.field183 &= 0x7FF;
                                                                            }
                                                                            int var333 = var331 - Statics.field183;
                                                                            if (var333 > 1024) {
                                                                                var333 -= 2048;
                                                                            }
                                                                            if (var333 < -1024) {
                                                                                var333 += 2048;
                                                                            }
                                                                            if (var333 < 0 && var332 > 0 || var333 > 0 && var332 < 0) {
                                                                                Statics.field183 = var331;
                                                                            }
                                                                        }
                                                                        for (int var334 = 0; var334 < 5; var334++) {
                                                                            var10002 = field737[var334]++;
                                                                        }
                                                                        int var335 = class77.method226();
                                                                        int var336 = class75.method1266();
                                                                        if (var335 > 15000 && var336 > 15000) {
                                                                            field533 = 250;
                                                                            class77.field1391 = 14500;
                                                                            field540.method2352(223);
                                                                        }
                                                                        field559++;
                                                                        if (field559 > 500) {
                                                                            field559 = 0;
                                                                            int var337 = (int) (Math.random() * 8.0D);
                                                                            if ((var337 & 0x1) == 1) {
                                                                                field684 += field554;
                                                                            }
                                                                            if ((var337 & 0x2) == 2) {
                                                                                field555 += field556;
                                                                            }
                                                                            if ((var337 & 0x4) == 4) {
                                                                                field604 += field599;
                                                                            }
                                                                        }
                                                                        if (field684 < -50) {
                                                                            field554 = 2;
                                                                        }
                                                                        if (field684 > 50) {
                                                                            field554 = -2;
                                                                        }
                                                                        if (field555 < -55) {
                                                                            field556 = 2;
                                                                        }
                                                                        if (field555 > 55) {
                                                                            field556 = -2;
                                                                        }
                                                                        if (field604 < -40) {
                                                                            field599 = 1;
                                                                        }
                                                                        if (field604 > 40) {
                                                                            field599 = -1;
                                                                        }
                                                                        field564++;
                                                                        if (field564 > 500) {
                                                                            field564 = 0;
                                                                            int var338 = (int) (Math.random() * 8.0D);
                                                                            if ((var338 & 0x1) == 1) {
                                                                                field560 += field552;
                                                                            }
                                                                            if ((var338 & 0x2) == 2) {
                                                                                field562 += field682;
                                                                            }
                                                                        }
                                                                        if (field560 < -60) {
                                                                            field552 = 2;
                                                                        }
                                                                        if (field560 > 60) {
                                                                            field552 = -2;
                                                                        }
                                                                        if (field562 < -20) {
                                                                            field682 = 1;
                                                                        }
                                                                        if (field562 > 10) {
                                                                            field682 = -1;
                                                                        }
                                                                        for (class28 var339 = (class28) field742.method3340(); var339 != null; var339 = (class28) field742.method3334()) {
                                                                            if ((long) var339.field754 < class121.method142() / 1000L - 5L) {
                                                                                if (var339.field759 > 0) {
                                                                                    method11(5, "", var339.field752 + class134.field2221);
                                                                                }
                                                                                if (var339.field759 == 0) {
                                                                                    method11(5, "", var339.field752 + class134.field2252);
                                                                                }
                                                                                var339.method3401();
                                                                            }
                                                                        }
                                                                        field532++;
                                                                        if (field532 > 50) {
                                                                            field540.method2352(158);
                                                                        }
                                                                        try {
                                                                            if (Statics.field199 != null && field540.field2039 > 0) {
                                                                                Statics.field199.method1411(field540.field2041, 0, field540.field2039);
                                                                                field540.field2039 = 0;
                                                                                field532 = 0;
                                                                                return;
                                                                            }
                                                                        } catch (IOException var343) {
                                                                            if (field533 > 0) {
                                                                                method169();
                                                                            } else {
                                                                                method828(40);
                                                                                Statics.field1439 = Statics.field199;
                                                                                Statics.field199 = null;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    var315 = var314.field2;
                                                                    if (var315.field2586 < 0) {
                                                                        break;
                                                                    }
                                                                    var316 = class158.method821(var315.field2661);
                                                                } while (var316 == null || var316.field2591 == null || var315.field2586 >= var316.field2591.length || var316.field2591[var315.field2586] != var315);
                                                                class26.method820(var314);
                                                            }
                                                        }
                                                        var312 = var311.field2;
                                                        if (var312.field2586 < 0) {
                                                            break;
                                                        }
                                                        var313 = class158.method821(var312.field2661);
                                                    } while (var313 == null || var313.field2591 == null || var312.field2586 >= var313.field2591.length || var313.field2591[var312.field2586] != var312);
                                                    class26.method820(var311);
                                                }
                                            }
                                            var309 = var308.field2;
                                            if (var309.field2586 < 0) {
                                                break;
                                            }
                                            var310 = class158.method821(var309.field2661);
                                        } while (var310 == null || var310.field2591 == null || var309.field2586 >= var310.field2591.length || var310.field2591[var309.field2586] != var309);
                                        class26.method820(var308);
                                    }
                                } else if (field533 > 0) {
                                    method169();
                                } else {
                                    method828(40);
                                    Statics.field1439 = Statics.field199;
                                    Statics.field199 = null;
                                }
                            }
                        }
                    }
                } else if (field489 == 40) {
                    method1344();
                }
                return;
            }
            var2.field2564.method3128(var2.field2563, (int) var2.field2818, var2.field2562, false);
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method440() {
        boolean var1;
        label297: {
            try {
                if (class138.field2332 == 2) {
                    if (Statics.field2330 == null) {
                        Statics.field2330 = class139.method2778(Statics.field1036, Statics.field2334, Statics.field282);
                        if (Statics.field2330 == null) {
                            var1 = false;
                            break label297;
                        }
                    }
                    if (Statics.field1521 == null) {
                        Statics.field1521 = new class58(Statics.field2017, Statics.field1385);
                    }
                    if (Statics.field2333.method2791(Statics.field2330, Statics.field2335, Statics.field1521, 22050)) {
                        Statics.field2333.method2792();
                        Statics.field2333.method2822(Statics.field2336);
                        Statics.field2333.method2794(Statics.field2330, Statics.field2337);
                        class138.field2332 = 0;
                        Statics.field2330 = null;
                        Statics.field1521 = null;
                        Statics.field1036 = null;
                        var1 = true;
                        break label297;
                    }
                }
            } catch (Exception var44) {
                var44.printStackTrace();
                Statics.field2333.method2795();
                class138.field2332 = 0;
                Statics.field2330 = null;
                Statics.field1521 = null;
                Statics.field1036 = null;
            }
            var1 = false;
        }
        if (var1 && field537 && Statics.field1790 != null) {
            Statics.field1790.method1185();
        }
        if (field1323) {
            class75.method931(Statics.field310);
            class77.method1400(Statics.field310);
            if (Statics.field128 != null) {
                Statics.field128.method1390(Statics.field310);
            }
            this.method1459();
            class75.method1444(Statics.field310);
            Canvas var4 = Statics.field310;
            var4.addMouseListener(class77.field1386);
            var4.addMouseMotionListener(class77.field1386);
            var4.addFocusListener(class77.field1386);
            if (Statics.field128 != null) {
                Statics.field128.method1389(Statics.field310);
            }
        }
        if (field489 == 0) {
            class73.method237(class21.field340, class21.field331, (Color) null);
        } else if (field489 == 5) {
            class21.method932(Statics.field1273, Statics.field122);
        } else if (field489 == 10) {
            class21.method932(Statics.field1273, Statics.field122);
        } else if (field489 == 20) {
            class21.method932(Statics.field1273, Statics.field122);
        } else if (field489 == 25) {
            if (field543 == 1) {
                if (field539 > field553) {
                    field553 = field539;
                }
                int var5 = (field553 * 50 - field539 * 50) / field553;
                method911(class134.field2090 + class2.field27 + class2.field20 + var5 + "%" + class2.field23, false);
            } else if (field543 == 2) {
                if (field541 > field542) {
                    field542 = field541;
                }
                int var6 = (field542 * 50 - field541 * 50) / field542 + 50;
                method911(class134.field2090 + class2.field27 + class2.field20 + var6 + "%" + class2.field23, false);
            } else {
                method911(class134.field2090, false);
            }
        } else if (field489 == 30) {
            if (!field628) {
                field610[0] = class134.field2297;
                field716[0] = "";
                field632[0] = 1006;
                field629 = 1;
            }
            if (field721 != -1) {
                method89(field721);
            }
            for (int var7 = 0; var7 < field736; var7++) {
                if (field689[var7]) {
                    field690[var7] = true;
                }
                field691[var7] = field689[var7];
                field689[var7] = false;
            }
            field688 = field491;
            field636 = -1;
            field581 = -1;
            Statics.field292 = null;
            if (field721 != -1) {
                field736 = 0;
                method855(field721, 0, 0, 765, 503, 0, 0, -1);
            }
            class89.method1819();
            method183();
            if (field628) {
                int var11 = Statics.field860;
                int var12 = Statics.field2071;
                int var13 = Statics.field957;
                int var14 = Statics.field1995;
                int var15 = 6116423;
                class89.method1826(var11, var12, var13, var14, var15);
                class89.method1826(var11 + 1, var12 + 1, var13 - 2, 16, 0);
                class89.method1828(var11 + 1, var12 + 18, var13 - 2, var14 - 19, 0);
                Statics.field1273.method3440(class134.field2227, var11 + 3, var12 + 14, var15, -1);
                int var16 = class77.field1392;
                int var17 = class77.field1393;
                for (int var18 = 0; var18 < field629; var18++) {
                    int var19 = (field629 - 1 - var18) * 15 + var12 + 31;
                    int var20 = 16777215;
                    if (var16 > var11 && var16 < var11 + var13 && var17 > var19 - 13 && var17 < var19 + 3) {
                        var20 = 16776960;
                    }
                    Statics.field1273.method3440(method122(var18), var11 + 3, var19, var20, 0);
                }
                method567(Statics.field860, Statics.field2071, Statics.field957, Statics.field1995);
            } else if (field636 != -1) {
                int var8 = field636;
                int var9 = field581;
                if (field629 >= 2 || field640 != 0 || field642) {
                    String var10;
                    if (field640 == 1 && field629 < 2) {
                        var10 = class134.field2308 + class134.field2234 + field508 + " " + class2.field24;
                    } else if (field642 && field629 < 2) {
                        var10 = field598 + class134.field2234 + field645 + " " + class2.field24;
                    } else {
                        var10 = method122(field629 - 1);
                    }
                    if (field629 > 2) {
                        var10 = var10 + class2.method149(16777215) + " " + '/' + " " + (field629 - 2) + class134.field2228;
                    }
                    Statics.field1273.method3447(var10, var8 + 4, var9 + 15, 16777215, 0, field491 / 1000);
                }
            }
            if (field576 == 3) {
                for (int var21 = 0; var21 < field736; var21++) {
                    if (field691[var21]) {
                        class89.method1854(field692[var21], field693[var21], field694[var21], field695[var21], 16711935, 128);
                    } else if (field690[var21]) {
                        class89.method1854(field692[var21], field693[var21], field694[var21], field695[var21], 16711680, 128);
                    }
                }
            }
            int var22 = Statics.field2384;
            int var23 = Statics.field885.field471;
            int var24 = Statics.field885.field420;
            int var25 = field510;
            for (class7 var26 = (class7) class7.field101.method3369(); var26 != null; var26 = (class7) class7.field101.method3371()) {
                if (var26.field105 != -1 || var26.field109 != null) {
                    int var27 = 0;
                    if (var23 > var26.field102) {
                        var27 += var23 - var26.field102;
                    } else if (var23 < var26.field119) {
                        var27 += var26.field119 - var23;
                    }
                    if (var24 > var26.field103) {
                        var27 += var24 - var26.field103;
                    } else if (var24 < var26.field100) {
                        var27 += var26.field100 - var24;
                    }
                    if (var27 - 64 > var26.field104 || field496 == 0 || var26.field99 != var22) {
                        if (var26.field106 != null) {
                            Statics.field55.method1133(var26.field106);
                            var26.field106 = null;
                        }
                        if (var26.field107 != null) {
                            Statics.field55.method1133(var26.field107);
                            var26.field107 = null;
                        }
                    } else {
                        var27 -= 64;
                        if (var27 < 0) {
                            var27 = 0;
                        }
                        int var28 = field496 * (var26.field104 - var27) / var26.field104;
                        class57 var10000;
                        if (var26.field106 != null) {
                            var26.field106.method1005(var28);
                        } else if (var26.field105 >= 0) {
                            var10000 = (class57) null;
                            class57 var29 = class57.method1278(Statics.field698, var26.field105, 0);
                            if (var29 != null) {
                                class63 var30 = var29.method1279().method1346(Statics.field1289);
                                class45 var31 = class45.method1109(var30, 100, var28);
                                var31.method982(-1);
                                Statics.field55.method1132(var31);
                                var26.field106 = var31;
                            }
                        }
                        if (var26.field107 != null) {
                            var26.field107.method1005(var28);
                            if (!var26.field107.method3407()) {
                                var26.field107 = null;
                            }
                        } else if (var26.field109 != null && (var26.field118 -= var25) <= 0) {
                            int var32 = (int) (Math.random() * (double) var26.field109.length);
                            var10000 = (class57) null;
                            class57 var33 = class57.method1278(Statics.field698, var26.field109[var32], 0);
                            if (var33 != null) {
                                class63 var34 = var33.method1279().method1346(Statics.field1289);
                                class45 var35 = class45.method1109(var34, 100, var28);
                                var35.method982(0);
                                Statics.field55.method1132(var35);
                                var26.field107 = var35;
                                var26.field118 = var26.field121 + (int) (Math.random() * (double) (var26.field108 - var26.field121));
                            }
                        }
                    }
                }
            }
            field510 = 0;
        } else if (field489 == 40) {
            method911(class134.field2091 + class2.field27 + class134.field2205, false);
        }
        if (field489 == 30 && field576 == 0 && !field1319) {
            try {
                Graphics var36 = Statics.field310.getGraphics();
                for (int var37 = 0; var37 < field736; var37++) {
                    if (field690[var37]) {
                        Statics.field819.method1636(var36, field692[var37], field693[var37], field694[var37], field695[var37]);
                        field690[var37] = false;
                    }
                }
            } catch (Exception var43) {
                Statics.field310.repaint();
            }
        } else if (field489 > 0) {
            try {
                Graphics var39 = Statics.field310.getGraphics();
                Statics.field819.method1621(var39, 0, 0);
                field1319 = false;
                for (int var40 = 0; var40 < field736; var40++) {
                    field690[var40] = false;
                }
            } catch (Exception var42) {
                Statics.field310.repaint();
            }
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method346() {
        if (Statics.field493 != null) {
            Statics.field493.field256 = false;
        }
        Statics.field493 = null;
        if (Statics.field199 != null) {
            Statics.field199.method1406();
            Statics.field199 = null;
        }
        class75.method1881();
        if (class77.field1386 != null) {
            class77 var1 = class77.field1386;
            synchronized (class77.field1386) {
                class77.field1386 = null;
            }
        }
        Statics.field128 = null;
        if (Statics.field1790 != null) {
            Statics.field1790.method1186();
        }
        if (Statics.field1337 != null) {
            Statics.field1337.method1186();
        }
        class153.method136();
        Object var3 = class157.field2569;
        synchronized (class157.field2569) {
            if (class157.field2571 != 0) {
                class157.field2571 = 1;
                try {
                    class157.field2569.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class82.method1882();
    }

    @ObfuscatedName("aw.c(II)V")
    public static void method828(int arg0) {
        if (field489 == arg0) {
            return;
        }
        if (field489 == 0) {
            Statics.field1405 = null;
            Statics.field945 = null;
            Statics.field391 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field517 = 0;
            field518 = 0;
            field519 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1439 != null) {
            Statics.field1439.method1406();
            Statics.field1439 = null;
        }
        if (field489 == 25) {
            field543 = 0;
            field539 = 0;
            field553 = 1;
            field541 = 0;
            field542 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method3009(Statics.field310, Statics.field2557, Statics.field1458);
        } else if (Statics.field327) {
            Statics.field2820 = null;
            Statics.field317 = null;
            Statics.field318 = null;
            Statics.field2709 = null;
            Statics.field1441 = null;
            Statics.field325 = null;
            Statics.field320 = null;
            Statics.field1839 = null;
            Statics.field83 = null;
            Statics.field1431 = null;
            Statics.field152 = null;
            Statics.field897 = null;
            Statics.field1452 = null;
            Statics.field247 = null;
            Statics.field76 = null;
            Statics.field261 = null;
            Statics.field2460 = null;
            Statics.field360 = null;
            Statics.field908 = null;
            Statics.field1375 = null;
            class138.method2426(2);
            class153.method2427(true);
            Statics.field327 = false;
        }
        field489 = arg0;
    }

    @ObfuscatedName("client.z(B)V")
    public void method268() {
        if (field489 != 1000) {
            boolean var1 = class153.method1534();
            if (!var1) {
                this.method269();
            }
        }
    }

    @ObfuscatedName("client.f(I)V")
    public void method269() {
        if (class153.field2534 >= 4) {
            this.method1458("js5crc");
            field489 = 1000;
            return;
        }
        if (class153.field2535 >= 4) {
            if (field489 <= 5) {
                this.method1458("js5io");
                field489 = 1000;
                return;
            }
            field708 = 3000;
            class153.field2535 = 3;
        }
        if (--field708 + 1 > 0) {
            return;
        }
        try {
            if (field511 == 0) {
                Statics.field1810 = Statics.field1325.method1508(Statics.field521, Statics.field1994);
                field511++;
            }
            if (field511 == 1) {
                if (Statics.field1810.field1415 == 2) {
                    this.method494(-1);
                    return;
                }
                if (Statics.field1810.field1415 == 1) {
                    field511++;
                }
            }
            if (field511 == 2) {
                Statics.field309 = new class70((Socket) Statics.field1810.field1410, Statics.field1325);
                class127 var1 = new class127(5);
                var1.method2477(15);
                var1.method2480(22);
                Statics.field309.method1411(var1.field2041, 0, 5);
                field511++;
                Statics.field365 = class121.method142();
            }
            if (field511 == 3) {
                if (field489 <= 5 || Statics.field309.method1409() > 0) {
                    int var2 = Statics.field309.method1424();
                    if (var2 != 0) {
                        this.method494(var2);
                        return;
                    }
                    field511++;
                } else if (class121.method142() - Statics.field365 > 30000L) {
                    this.method494(-2);
                    return;
                }
            }
            if (field511 == 4) {
                class70 var3 = Statics.field309;
                boolean var4 = field489 > 20;
                if (Statics.field2521 != null) {
                    try {
                        Statics.field2521.method1406();
                    } catch (Exception var14) {
                    }
                    Statics.field2521 = null;
                }
                Statics.field2521 = var3;
                class153.method2427(var4);
                class153.field2529.field2039 = 0;
                Statics.field2528 = null;
                Statics.field2326 = null;
                class153.field2539 = 0;
                while (true) {
                    class155 var6 = (class155) class153.field2520.method3351();
                    if (var6 == null) {
                        while (true) {
                            class155 var7 = (class155) class153.field2525.method3351();
                            if (var7 == null) {
                                if (class153.field2533 != 0) {
                                    try {
                                        class127 var8 = new class127(4);
                                        var8.method2477(4);
                                        var8.method2477(class153.field2533);
                                        var8.method2694(0);
                                        Statics.field2521.method1411(var8.field2041, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2521.method1406();
                                        } catch (Exception var12) {
                                        }
                                        class153.field2535++;
                                        Statics.field2521 = null;
                                    }
                                }
                                class153.field2516 = 0;
                                Statics.field2440 = class121.method142();
                                Statics.field1810 = null;
                                Statics.field309 = null;
                                field511 = 0;
                                field686 = 0;
                                return;
                            }
                            class153.field2522.method3325(var7);
                            class153.field2530.method3349(var7, var7.field2818);
                            class153.field2524++;
                            class153.field2526--;
                        }
                    }
                    class153.field2518.method3349(var6, var6.field2818);
                    class153.field2519++;
                    class153.field2532--;
                }
            }
        } catch (IOException var15) {
            this.method494(-3);
        }
    }

    @ObfuscatedName("client.a(II)V")
    public void method494(int arg0) {
        Statics.field1810 = null;
        Statics.field309 = null;
        field511 = 0;
        if (Statics.field1994 == Statics.field194) {
            Statics.field1994 = Statics.field902;
        } else {
            Statics.field1994 = Statics.field194;
        }
        field686++;
        if (field686 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field489 <= 5) {
                this.method1458("js5connect_full");
                field489 = 1000;
            } else {
                field708 = 3000;
            }
        } else if (field686 >= 2 && arg0 == 6) {
            this.method1458("js5connect_outofdate");
            field489 = 1000;
        } else if (field686 >= 4) {
            if (field489 <= 5) {
                this.method1458("js5connect");
                field489 = 1000;
            } else {
                field708 = 3000;
            }
        }
    }

    @ObfuscatedName("h.d(I)V")
    public static void method140() {
        if (field488 == 0) {
            Statics.field1980 = new class95(4, 104, 104, class9.field136);
            for (int var0 = 0; var0 < 4; var0++) {
                field544[var0] = new class164(104, 104);
            }
            Statics.field1263 = new class86(512, 512);
            class21.field331 = class134.field2093;
            class21.field340 = 5;
            field488 = 20;
        } else if (field488 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1769[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1931(var1, 500, 800, 512, 334);
            class21.field331 = class134.field2094;
            class21.field340 = 10;
            field488 = 30;
        } else if (field488 == 30) {
            Statics.field295 = Statics.method116(0, false, true, true);
            Statics.field270 = Statics.method116(1, false, true, true);
            Statics.field1382 = Statics.method116(2, true, false, true);
            Statics.field513 = Statics.method116(3, false, true, true);
            Statics.field698 = Statics.method116(4, false, true, true);
            Statics.field201 = Statics.method116(5, true, true, true);
            Statics.field1028 = Statics.method116(6, true, true, false);
            Statics.field1682 = Statics.method116(7, false, true, true);
            Statics.field1458 = Statics.method116(8, false, true, true);
            Statics.field515 = Statics.method116(9, false, true, true);
            Statics.field2557 = Statics.method116(10, false, true, true);
            Statics.field748 = Statics.method116(11, false, true, true);
            Statics.field413 = Statics.method116(12, false, true, true);
            Statics.field63 = Statics.method116(13, true, false, true);
            Statics.field1657 = Statics.method116(14, false, true, false);
            Statics.field133 = Statics.method116(15, false, true, true);
            class21.field331 = class134.field2095;
            class21.field340 = 20;
            field488 = 40;
        } else if (field488 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field295.method3125() * 4 / 100;
            int var8 = var7 + Statics.field270.method3125() * 4 / 100;
            int var9 = var8 + Statics.field1382.method3125() * 2 / 100;
            int var10 = var9 + Statics.field513.method3125() * 2 / 100;
            int var11 = var10 + Statics.field698.method3125() * 6 / 100;
            int var12 = var11 + Statics.field201.method3125() * 4 / 100;
            int var13 = var12 + Statics.field1028.method3125() * 2 / 100;
            int var14 = var13 + Statics.field1682.method3125() * 60 / 100;
            int var15 = var14 + Statics.field1458.method3125() * 2 / 100;
            int var16 = var15 + Statics.field515.method3125() * 2 / 100;
            int var17 = var16 + Statics.field2557.method3125() * 2 / 100;
            int var18 = var17 + Statics.field748.method3125() * 2 / 100;
            int var19 = var18 + Statics.field413.method3125() * 2 / 100;
            int var20 = var19 + Statics.field63.method3125() * 2 / 100;
            int var21 = var20 + Statics.field1657.method3125() * 2 / 100;
            int var22 = var21 + Statics.field133.method3125() * 2 / 100;
            if (var22 == 100) {
                class21.field331 = class134.field2232;
                class21.field340 = 30;
                field488 = 45;
            } else {
                if (var22 != 0) {
                    class21.field331 = class134.field2154 + var22 + "%";
                }
                class21.field340 = 30;
            }
        } else if (field488 == 45) {
            boolean var23 = !field486;
            Statics.field87 = 22050;
            Statics.field1112 = var23;
            Statics.field1120 = 2;
            class141 var24 = new class141();
            var24.method2788(9, 128);
            Statics.field1790 = class52.method2378(Statics.field1325, Statics.field310, 0, 22050);
            Statics.field1790.method1182(var24);
            class154 var25 = Statics.field133;
            class154 var26 = Statics.field1657;
            class154 var27 = Statics.field698;
            Statics.field2335 = var25;
            Statics.field1385 = var26;
            Statics.field2017 = var27;
            Statics.field2333 = var24;
            Statics.field1337 = class52.method2378(Statics.field1325, Statics.field310, 1, 2048);
            Statics.field55 = new class46();
            Statics.field1337.method1182(Statics.field55);
            Statics.field1289 = new class62(22050, Statics.field87);
            class21.field331 = class134.field2270;
            class21.field340 = 35;
            field488 = 50;
        } else if (field488 == 50) {
            int var28 = 0;
            if (Statics.field122 == null) {
                Statics.field122 = class84.method3(Statics.field1458, Statics.field63, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field1984 == null) {
                class154 var29 = Statics.field1458;
                class154 var30 = Statics.field63;
                int var31 = var29.method3047("p12_full");
                int var32 = var29.method3048(var31, "");
                class183 var33 = class84.method1264(var29, var30, var31, var32);
                Statics.field1984 = var33;
            } else {
                var28++;
            }
            if (Statics.field1273 == null) {
                Statics.field1273 = class84.method3(Statics.field1458, Statics.field63, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class21.field331 = class134.field2099 + var28 * 100 / 3 + "%";
                class21.field340 = 40;
            } else {
                Statics.field751 = new class151(true);
                class21.field331 = class134.field2260;
                class21.field340 = 40;
                field488 = 60;
            }
        } else if (field488 == 60) {
            int var34 = Statics.method837(Statics.field2557, Statics.field1458);
            int var35 = class21.method228();
            if (var34 < var35) {
                class21.field331 = class134.field2101 + var34 * 100 / var35 + "%";
                class21.field340 = 50;
            } else {
                class21.field331 = class134.field2102;
                class21.field340 = 50;
                method828(5);
                field488 = 70;
            }
        } else if (field488 == 70) {
            if (Statics.field1382.method3036()) {
                class37.method1398(Statics.field1382);
                Statics.method1379(Statics.field1382);
                class36.method35(Statics.field1382, Statics.field1682);
                class154 var36 = Statics.field1382;
                class154 var37 = Statics.field1682;
                boolean var38 = field486;
                Statics.field2458 = var36;
                Statics.field825 = var37;
                class32.field870 = var38;
                class31.method2164(Statics.field1382, Statics.field1682);
                class40.method896(Statics.field1382, Statics.field1682, field524, Statics.field122);
                class34.method3301(Statics.field1382, Statics.field295, Statics.field270);
                class154 var39 = Statics.field1382;
                class154 var40 = Statics.field1682;
                Statics.field917 = var39;
                Statics.field914 = var40;
                class154 var41 = Statics.field1382;
                Statics.field967 = var41;
                class42.method141(Statics.field1382);
                class158.method1391(Statics.field513, Statics.field1682, Statics.field1458, Statics.field63);
                class41.method1884(Statics.field1382);
                class154 var42 = Statics.field1382;
                Statics.field970 = var42;
                class21.field331 = class134.field2206;
                class21.field340 = 60;
                field488 = 80;
            } else {
                class21.field331 = class134.field2280 + Statics.field1382.method3130() + "%";
                class21.field340 = 60;
            }
        } else if (field488 == 80) {
            int var43 = 0;
            if (Statics.field2016 == null) {
                class154 var44 = Statics.field1458;
                int var45 = var44.method3047("compass");
                int var46 = var44.method3048(var45, "");
                class86 var47;
                if (class84.method2394(var44, var45, var46)) {
                    class86 var48 = new class86();
                    var48.field1482 = Statics.field1453;
                    var48.field1478 = Statics.field1454;
                    var48.field1481 = Statics.field1457[0];
                    var48.field1475 = Statics.field2014[0];
                    var48.field1473 = Statics.field1456[0];
                    var48.field1474 = Statics.field156[0];
                    int var49 = var48.field1474 * var48.field1473;
                    byte[] var50 = Statics.field1045[0];
                    var48.field1472 = new int[var49];
                    for (int var51 = 0; var51 < var49; var51++) {
                        var48.field1472[var51] = Statics.field1464[var50[var51] & 0xFF];
                    }
                    class84.method752();
                    var47 = var48;
                } else {
                    var47 = null;
                }
                Statics.field2016 = var47;
            } else {
                var43++;
            }
            if (Statics.field2032 == null) {
                class154 var54 = Statics.field1458;
                int var55 = var54.method3047("mapedge");
                int var56 = var54.method3048(var55, "");
                class86 var57;
                if (class84.method2394(var54, var55, var56)) {
                    class86 var58 = new class86();
                    var58.field1482 = Statics.field1453;
                    var58.field1478 = Statics.field1454;
                    var58.field1481 = Statics.field1457[0];
                    var58.field1475 = Statics.field2014[0];
                    var58.field1473 = Statics.field1456[0];
                    var58.field1474 = Statics.field156[0];
                    int var59 = var58.field1474 * var58.field1473;
                    byte[] var60 = Statics.field1045[0];
                    var58.field1472 = new int[var59];
                    for (int var61 = 0; var61 < var59; var61++) {
                        var58.field1472[var61] = Statics.field1464[var60[var61] & 0xFF];
                    }
                    class84.method752();
                    var57 = var58;
                } else {
                    var57 = null;
                }
                Statics.field2032 = var57;
            } else {
                var43++;
            }
            if (Statics.field130 == null) {
                Statics.field130 = class84.method4(Statics.field1458, "mapscene", "");
            } else {
                var43++;
            }
            if (Statics.field958 == null) {
                Statics.field958 = class84.method217(Statics.field1458, "mapfunction", "");
            } else {
                var43++;
            }
            if (Statics.field274 == null) {
                Statics.field274 = class84.method217(Statics.field1458, "hitmarks", "");
            } else {
                var43++;
            }
            if (Statics.field289 == null) {
                Statics.field289 = class84.method217(Statics.field1458, "headicons_pk", "");
            } else {
                var43++;
            }
            if (Statics.field2002 == null) {
                Statics.field2002 = class84.method217(Statics.field1458, "headicons_prayer", "");
            } else {
                var43++;
            }
            if (Statics.field127 == null) {
                Statics.field127 = class84.method217(Statics.field1458, "headicons_hint", "");
            } else {
                var43++;
            }
            if (Statics.field1827 == null) {
                Statics.field1827 = class84.method217(Statics.field1458, "mapmarker", "");
            } else {
                var43++;
            }
            if (Statics.field1035 == null) {
                Statics.field1035 = class84.method217(Statics.field1458, "cross", "");
            } else {
                var43++;
            }
            if (Statics.field476 == null) {
                Statics.field476 = class84.method217(Statics.field1458, "mapdots", "");
            } else {
                var43++;
            }
            if (Statics.field1208 == null) {
                Statics.field1208 = class84.method4(Statics.field1458, "scrollbar", "");
            } else {
                var43++;
            }
            if (Statics.field382 == null) {
                Statics.field382 = class84.method4(Statics.field1458, "mod_icons", "");
            } else {
                var43++;
            }
            if (Statics.field2452 == null) {
                Statics.field2452 = class84.method692(Statics.field1458, "mapback", "");
            } else {
                var43++;
            }
            if (var43 < 14) {
                class21.field331 = class134.field2105 + var43 * 100 / 14 + "%";
                class21.field340 = 70;
            } else {
                Statics.field2835 = Statics.field382;
                Statics.field2032.method1793();
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 41.0D) - 20;
                for (int var68 = 0; var68 < Statics.field958.length; var68++) {
                    Statics.field958[var68].method1762(var64 + var67, var65 + var67, var66 + var67);
                }
                Statics.field130[0].method1812(var64 + var67, var65 + var67, var66 + var67);
                method1601();
                class21.field331 = class134.field2106;
                class21.field340 = 70;
                field488 = 90;
            }
        } else if (field488 == 90) {
            if (Statics.field515.method3036()) {
                class110 var69 = new class110(Statics.field515, Statics.field1458, 20, 0.8D, field486 ? 64 : 128);
                class104.method2174(var69);
                class104.method2175(0.8D);
                class21.field331 = class134.field2108;
                class21.field340 = 90;
                field488 = 110;
            } else {
                class21.field331 = class134.field2212 + Statics.field515.method3130() + "%";
                class21.field340 = 90;
            }
        } else if (field488 == 110) {
            Statics.field493 = new class16();
            Statics.field1325.method1525(Statics.field493, 10);
            class21.field331 = class134.field2269;
            class21.field340 = 94;
            field488 = 120;
        } else if (field488 == 120) {
            if (Statics.field2557.method3074("huffman", "")) {
                class120 var70 = new class120(Statics.field2557.method3093("huffman", ""));
                Statics.field2833 = var70;
                class21.field331 = class134.field2170;
                class21.field340 = 96;
                field488 = 130;
            } else {
                class21.field331 = class134.field2110 + "%";
                class21.field340 = 96;
            }
        } else if (field488 == 130) {
            if (!Statics.field513.method3036()) {
                class21.field331 = class134.field2192 + Statics.field513.method3130() * 4 / 5 + "%";
                class21.field340 = 100;
            } else if (!Statics.field413.method3036()) {
                class21.field331 = class134.field2192 + (80 + Statics.field413.method3130() / 6) + "%";
                class21.field340 = 100;
            } else if (Statics.field63.method3036()) {
                class21.field331 = class134.field2113;
                class21.field340 = 100;
                field488 = 140;
            } else {
                class21.field331 = class134.field2192 + (96 + Statics.field63.method3130() / 20) + "%";
                class21.field340 = 100;
            }
        } else if (field488 == 140) {
            method828(10);
        }
    }

    @ObfuscatedName("cs.y(B)V")
    public static void method1601() {
        Statics.field14 = new int[33];
        Statics.field1807 = new int[33];
        Statics.field229 = new int[151];
        Statics.field361 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2452.field1490[Statics.field2452.field1486 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field14[var0] = var1;
            Statics.field1807[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2452.field1490[Statics.field2452.field1486 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field229[var4 - 5] = var5 - 25;
            Statics.field361[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("bm.k(B)V")
    public static final void method1344() {
        try {
            if (field517 == 0) {
                if (Statics.field199 != null) {
                    Statics.field199.method1406();
                    Statics.field199 = null;
                }
                Statics.field480 = null;
                field665 = false;
                field518 = 0;
                field517 = 1;
            }
            if (field517 == 1) {
                if (Statics.field480 == null) {
                    Statics.field480 = Statics.field1325.method1508(Statics.field521, Statics.field1994);
                }
                if (Statics.field480.field1415 == 2) {
                    throw new IOException();
                }
                if (Statics.field480.field1415 == 1) {
                    Statics.field199 = new class70((Socket) Statics.field480.field1410, Statics.field1325);
                    Statics.field480 = null;
                    field517 = 2;
                }
            }
            if (field517 == 2) {
                field540.field2039 = 0;
                field540.method2477(14);
                Statics.field199.method1411(field540.field2041, 0, 1);
                field528.field2039 = 0;
                field517 = 3;
            }
            if (field517 == 3) {
                if (Statics.field1790 != null) {
                    Statics.field1790.method1184();
                }
                if (Statics.field1337 != null) {
                    Statics.field1337.method1184();
                }
                int var0 = Statics.field199.method1424();
                if (Statics.field1790 != null) {
                    Statics.field1790.method1184();
                }
                if (Statics.field1337 != null) {
                    Statics.field1337.method1184();
                }
                if (var0 != 0) {
                    method21(var0);
                    return;
                }
                field528.field2039 = 0;
                field517 = 5;
            }
            if (field517 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field540.field2039 = 0;
                field540.method2477(10);
                field540.method2480(var1[0]);
                field540.method2480(var1[1]);
                field540.method2480(var1[2]);
                field540.method2480(var1[3]);
                field540.method2481(0L);
                field540.method2535(class21.field316);
                field540.method2508(class6.field88, class6.field97);
                field527.field2039 = 0;
                if (field489 == 40) {
                    field527.method2477(18);
                } else {
                    field527.method2477(16);
                }
                field527.method2694(0);
                int var2 = field527.field2039;
                field527.method2480(22);
                field527.method2485(field540.field2041, 0, field540.field2039);
                int var3 = field527.field2039;
                field527.method2535(class21.field336);
                field527.method2477(field486 ? 1 : 0);
                class82.method2341(field527);
                class127 var4 = new class127(Statics.field751.method3022());
                Statics.field751.method3021(var4);
                field527.method2485(var4.field2041, 0, var4.field2041.length);
                field527.method2480(Statics.field295.field2510);
                field527.method2480(Statics.field270.field2510);
                field527.method2480(Statics.field1382.field2510);
                field527.method2480(Statics.field513.field2510);
                field527.method2480(Statics.field698.field2510);
                field527.method2480(Statics.field201.field2510);
                field527.method2480(Statics.field1028.field2510);
                field527.method2480(Statics.field1682.field2510);
                field527.method2480(Statics.field1458.field2510);
                field527.method2480(Statics.field515.field2510);
                field527.method2480(Statics.field2557.field2510);
                field527.method2480(Statics.field748.field2510);
                field527.method2480(Statics.field413.field2510);
                field527.method2480(Statics.field63.field2510);
                field527.method2480(Statics.field1657.field2510);
                field527.method2480(Statics.field133.field2510);
                field527.method2506(var1, var3, field527.field2039);
                field527.method2681(field527.field2039 - var2);
                Statics.field199.method1411(field527.field2041, 0, field527.field2039);
                field540.method2361(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field528.method2361(var1);
                field517 = 6;
            }
            if (field517 == 6 && Statics.field199.method1409() > 0) {
                int var6 = Statics.field199.method1424();
                if (var6 == 21 && field489 == 20) {
                    field517 = 7;
                } else if (var6 == 2) {
                    field517 = 9;
                } else if (var6 == 15 && field489 == 40) {
                    method1265();
                    return;
                } else if (var6 == 23 && field519 < 1) {
                    field519++;
                    field517 = 0;
                } else {
                    method21(var6);
                    return;
                }
            }
            if (field517 == 7 && Statics.field199.method1409() > 0) {
                field651 = (Statics.field199.method1424() + 3) * 60;
                field517 = 8;
            }
            if (field517 == 8) {
                field518 = 0;
                class21.method2078(class134.field2098, class134.field2115, field651 / 60 + class134.field2288);
                if (--field651 <= 0) {
                    field517 = 0;
                }
            } else {
                if (field517 == 9 && Statics.field199.method1409() >= 8) {
                    field653 = Statics.field199.method1424();
                    field648 = Statics.field199.method1424() == 1;
                    field612 = Statics.field199.method1424();
                    field612 <<= 0x8;
                    field612 += Statics.field199.method1424();
                    field746 = Statics.field199.method1424();
                    Statics.field199.method1410(field528.field2041, 0, 1);
                    field528.field2039 = 0;
                    field514 = field528.method2353();
                    Statics.field199.method1410(field528.field2041, 0, 2);
                    field528.field2039 = 0;
                    field529 = field528.method2493();
                    if (field746 == 1) {
                        try {
                            client var7 = Statics.field1759;
                            JSObject.getWindow(var7).call("zap", (Object[]) null);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            client var9 = Statics.field1759;
                            JSObject.getWindow(var9).call("unzap", (Object[]) null);
                        } catch (Throwable var24) {
                        }
                    }
                    field517 = 10;
                }
                if (field517 != 10) {
                    field518++;
                    if (field518 > 2000) {
                        if (field519 < 1) {
                            if (Statics.field1994 == Statics.field194) {
                                Statics.field1994 = Statics.field902;
                            } else {
                                Statics.field1994 = Statics.field194;
                            }
                            field519++;
                            field517 = 0;
                        } else {
                            method21(-3);
                        }
                    }
                } else if (Statics.field199.method1409() >= field529) {
                    field528.field2039 = 0;
                    Statics.field199.method1410(field528.field2041, 0, field529);
                    field492 = 1L;
                    field634 = -1;
                    Statics.field493.field252 = 0;
                    Statics.field373 = true;
                    field563 = true;
                    field710 = -1L;
                    class182.field2831 = new class177();
                    field540.field2039 = 0;
                    field528.field2039 = 0;
                    field514 = -1;
                    field534 = -1;
                    field535 = -1;
                    field536 = -1;
                    field531 = 0;
                    field715 = 0;
                    field533 = 0;
                    field500 = 0;
                    field629 = 0;
                    field628 = false;
                    class77.field1391 = 0;
                    for (int var11 = 0; var11 < 100; var11++) {
                        field700[var11] = null;
                    }
                    field701 = 0;
                    field640 = 0;
                    field642 = false;
                    field726 = 0;
                    field684 = (int) (Math.random() * 100.0D) - 50;
                    field555 = (int) (Math.random() * 110.0D) - 55;
                    field604 = (int) (Math.random() * 80.0D) - 40;
                    field560 = (int) (Math.random() * 120.0D) - 60;
                    field562 = (int) (Math.random() * 30.0D) - 20;
                    field497 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field720 = 0;
                    field713 = -1;
                    field718 = 0;
                    field582 = 0;
                    field607 = 0;
                    field743 = 0;
                    for (int var12 = 0; var12 < 2048; var12++) {
                        field520[var12] = null;
                        field611[var12] = null;
                    }
                    for (int var13 = 0; var13 < 32768; var13++) {
                        field638[var13] = null;
                    }
                    Statics.field885 = field520[2047] = new class3();
                    field641.method3363();
                    field623.method3363();
                    for (int var14 = 0; var14 < 4; var14++) {
                        for (int var15 = 0; var15 < 104; var15++) {
                            for (int var16 = 0; var16 < 104; var16++) {
                                field620[var14][var15][var16] = null;
                            }
                        }
                    }
                    field621 = new class177();
                    field739 = 0;
                    field738 = 0;
                    field523 = 0;
                    for (int var17 = 0; var17 < Statics.field1042; var17++) {
                        class42 var18 = class42.method102(var17);
                        if (var18 != null && var18.field1044 == 0) {
                            class159.field2706[var17] = 0;
                            class159.field2705[var17] = 0;
                        }
                    }
                    for (int var19 = 0; var19 < field680.length; var19++) {
                        field680[var19] = -1;
                    }
                    if (field721 != -1) {
                        Statics.method912(field721);
                    }
                    for (class4 var20 = (class4) field647.method3351(); var20 != null; var20 = (class4) field647.method3352()) {
                        method236(var20, true);
                    }
                    field721 = -1;
                    field647 = new class175(8);
                    field650 = null;
                    field628 = false;
                    field629 = 0;
                    field745.method3230((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var21 = 0; var21 < 8; var21++) {
                        field613[var21] = null;
                        field618[var21] = false;
                    }
                    class19.method90();
                    field723 = true;
                    for (int var22 = 0; var22 < 100; var22++) {
                        field689[var22] = true;
                    }
                    field711 = null;
                    Statics.field80 = 0;
                    Statics.field367 = null;
                    Statics.field275 = -1;
                    method638(false);
                    field514 = -1;
                }
            }
        } catch (IOException var26) {
            if (field519 < 1) {
                if (Statics.field1994 == Statics.field194) {
                    Statics.field1994 = Statics.field902;
                } else {
                    Statics.field1994 = Statics.field194;
                }
                field519++;
                field517 = 0;
            } else {
                method21(-2);
            }
        }
    }

    @ObfuscatedName("br.h(B)V")
    public static void method1265() {
        field540.field2039 = 0;
        field528.field2039 = 0;
        field514 = -1;
        field534 = -1;
        field535 = -1;
        field536 = -1;
        field529 = 0;
        field531 = 0;
        field715 = 0;
        field629 = 0;
        field628 = false;
        field720 = 0;
        field718 = 0;
        for (int var0 = 0; var0 < field520.length; var0++) {
            if (field520[var0] != null) {
                field520[var0].field442 = -1;
            }
        }
        for (int var1 = 0; var1 < field638.length; var1++) {
            if (field638[var1] != null) {
                field638[var1].field442 = -1;
            }
        }
        class19.method90();
        method828(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field689[var2] = true;
        }
    }

    @ObfuscatedName("m.x(II)V")
    public static void method21(int arg0) {
        if (arg0 == -3) {
            class21.method2078(class134.field2293, class134.field2176, class134.field2119);
        } else if (arg0 == -2) {
            class21.method2078(class134.field2120, class134.field2121, class134.field2204);
        } else if (arg0 == -1) {
            class21.method2078(class134.field2191, class134.field2124, class134.field2125);
        } else if (arg0 == 3) {
            class21.method2078(class134.field2126, class134.field2127, class134.field2128);
        } else if (arg0 == 4) {
            class21.method2078(class134.field2129, class134.field2130, class134.field2131);
        } else if (arg0 == 5) {
            class21.method2078(class134.field2182, class134.field2133, class134.field2134);
        } else if (arg0 == 6) {
            class21.method2078(class134.field2086, class134.field2296, class134.field2137);
        } else if (arg0 == 7) {
            class21.method2078(class134.field2117, class134.field2139, class134.field2140);
        } else if (arg0 == 8) {
            class21.method2078(class134.field2141, class134.field2142, class134.field2143);
        } else if (arg0 == 9) {
            class21.method2078(class134.field2144, class134.field2145, class134.field2167);
        } else if (arg0 == 10) {
            class21.method2078(class134.field2122, class134.field2148, class134.field2149);
        } else if (arg0 == 11) {
            class21.method2078(class134.field2150, class134.field2151, class134.field2266);
        } else if (arg0 == 12) {
            class21.method2078(class134.field2104, class134.field2092, class134.field2222);
        } else if (arg0 == 13) {
            class21.method2078(class134.field2156, class134.field2157, class134.field2158);
        } else if (arg0 == 14) {
            class21.method2078(class134.field2159, class134.field2152, class134.field2188);
        } else if (arg0 == 16) {
            class21.method2078(class134.field2162, class134.field2163, class134.field2164);
        } else if (arg0 == 17) {
            class21.method2078(class134.field2116, class134.field2089, class134.field2097);
        } else if (arg0 == 18) {
            class21.method2078(class134.field2168, class134.field2153, class134.field2287);
        } else if (arg0 == 19) {
            class21.method2078(class134.field2171, class134.field2172, class134.field2173);
        } else if (arg0 == 20) {
            class21.method2078(class134.field2174, class134.field2185, class134.field2103);
        } else if (arg0 == 22) {
            class21.method2078(class134.field2177, class134.field2178, class134.field2179);
        } else if (arg0 == 23) {
            class21.method2078(class134.field2160, class134.field2181, class134.field2084);
        } else if (arg0 == 24) {
            class21.method2078(class134.field2183, class134.field2184, class134.field2238);
        } else if (arg0 == 25) {
            class21.method2078(class134.field2136, class134.field2195, class134.field2312);
        } else if (arg0 == 26) {
            class21.method2078(class134.field2189, class134.field2190, class134.field2083);
        } else if (arg0 == 27) {
            class21.method2078(class134.field2225, class134.field2193, class134.field2194);
        } else if (arg0 == 31) {
            class21.method2078(class134.field2201, class134.field2202, class134.field2203);
        } else if (arg0 == 32) {
            class21.method2078(class134.field2307, class134.field2132, class134.field2277);
        } else if (arg0 == 37) {
            class21.method2078(class134.field2207, class134.field2208, class134.field2209);
        } else if (arg0 == 38) {
            class21.method2078(class134.field2210, class134.field2211, class134.field2303);
        } else if (arg0 == 55) {
            class21.method2078(class134.field2213, class134.field2214, class134.field2215);
        } else {
            class21.method2078(class134.field2216, class134.field2262, class134.field2218);
        }
        method828(10);
    }

    @ObfuscatedName("b.b(I)V")
    public static final void method169() {
        if (Statics.field199 != null) {
            Statics.field199.method1406();
            Statics.field199 = null;
        }
        method131();
        Statics.field1980.method1896();
        for (int var0 = 0; var0 < 4; var0++) {
            field544[var0].method3259();
        }
        System.gc();
        class138.method2426(2);
        field722 = -1;
        field537 = false;
        for (class7 var1 = (class7) class7.field101.method3369(); var1 != null; var1 = (class7) class7.field101.method3371()) {
            if (var1.field106 != null) {
                Statics.field55.method1133(var1.field106);
                var1.field106 = null;
            }
            if (var1.field107 != null) {
                Statics.field55.method1133(var1.field107);
                var1.field107 = null;
            }
        }
        class7.field101.method3363();
        method828(10);
    }

    @ObfuscatedName("k.n(B)V")
    public static final void method131() {
        class37.field944.method3311();
        class33.method1403();
        class36.method168();
        class32.field826.method3311();
        class32.field827.method3311();
        class32.field828.method3311();
        class32.field829.method3311();
        class31.method231();
        class40.field985.method3311();
        class40.field1009.method3311();
        class40.field987.method3311();
        class34.method145();
        class35.method632();
        class38.method144();
        class42.method2348();
        class163.method2761();
        class158.method117();
        ((class110) Statics.field1781).method2263();
        class5.field75.method3311();
        Statics.field295.method3045();
        Statics.field270.method3045();
        Statics.field513.method3045();
        Statics.field698.method3045();
        Statics.field201.method3045();
        Statics.field1028.method3045();
        Statics.field1682.method3045();
        Statics.field1458.method3045();
        Statics.field515.method3045();
        Statics.field2557.method3045();
        Statics.field748.method3045();
        Statics.field413.method3045();
    }

    @ObfuscatedName("de.q(I)V")
    public static final void method2244() {
        if (Statics.field1337 != null) {
            Statics.field1337.method1193();
        }
        if (Statics.field1790 != null) {
            Statics.field1790.method1193();
        }
    }

    @ObfuscatedName("dt.r(Lap;IIIB)V")
    public static void method2382(class34 arg0, int arg1, int arg2, int arg3) {
        if (field726 >= 50 || field496 == 0 || arg0.field896 == null || arg1 >= arg0.field896.length) {
            return;
        }
        int var4 = arg0.field896[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field714[field726] = var5;
        field728[field726] = var6;
        field729[field726] = 0;
        field731[field726] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field730[field726] = (var8 << 16) + (var9 << 8) + var7;
        field726++;
    }

    @ObfuscatedName("f.u(IIIB)V")
    public static void method103(int arg0, int arg1, int arg2) {
        if (field724 == 0 || arg1 == 0 || field726 >= 50) {
            return;
        }
        field714[field726] = arg0;
        field728[field726] = arg1;
        field729[field726] = arg2;
        field731[field726] = null;
        field730[field726] = 0;
        field726++;
    }

    @ObfuscatedName("fy.t(I)V")
    public static final void method3213() {
        if (field486 && Statics.field2384 != field538) {
            method178(Statics.field275, Statics.field117, Statics.field2384, Statics.field885.field453[0], Statics.field885.field459[0]);
        } else if (Statics.field2384 != field713) {
            field713 = Statics.field2384;
            method897(Statics.field2384);
        }
    }

    @ObfuscatedName("n.s(III)V")
    public static final void method174(int arg0, int arg1) {
        if (field720 != 0 && field720 != 3 || class77.field1398 != 1) {
            return;
        }
        int var2 = class77.field1399 - 25 - arg0;
        int var3 = class77.field1387 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field560 + field497 & 0x7FF;
        int var5 = class104.field1769[var4];
        int var6 = class104.field1787[var4];
        int var7 = (field562 + 256) * var5 >> 8;
        int var8 = (field562 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field885.field471 + var9 >> 7;
        int var12 = Statics.field885.field420 - var10 >> 7;
        boolean var13 = method1886(Statics.field885.field453[0], Statics.field885.field459[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field540.method2477(var2);
        field540.method2477(var3);
        field540.method2694(field497);
        field540.method2477(57);
        field540.method2477(field560);
        field540.method2477(field562);
        field540.method2477(89);
        field540.method2694(Statics.field885.field471);
        field540.method2694(Statics.field885.field420);
        field540.method2477(field548);
        field540.method2477(63);
    }

    @ObfuscatedName("h.ah(S)V")
    public static final void method138() {
        int var0 = field684 + Statics.field885.field471;
        int var1 = field555 + Statics.field885.field420;
        if (Statics.field1402 - var0 < -500 || Statics.field1402 - var0 > 500 || Statics.field1420 - var1 < -500 || Statics.field1420 - var1 > 500) {
            Statics.field1402 = var0;
            Statics.field1420 = var1;
        }
        if (Statics.field1402 != var0) {
            Statics.field1402 += (var0 - Statics.field1402) / 16;
        }
        if (Statics.field1420 != var1) {
            Statics.field1420 += (var1 - Statics.field1420) / 16;
        }
        if (class75.field1362[96]) {
            field574 += (-24 - field574) / 2;
        } else if (class75.field1362[97]) {
            field574 += (24 - field574) / 2;
        } else {
            field574 /= 2;
        }
        if (class75.field1362[98]) {
            field567 += (12 - field567) / 2;
        } else if (class75.field1362[99]) {
            field567 += (-12 - field567) / 2;
        } else {
            field567 /= 2;
        }
        field497 = field574 / 2 + field497 & 0x7FF;
        field572 += field567 / 2;
        if (field572 < 128) {
            field572 = 128;
        }
        if (field572 > 383) {
            field572 = 383;
        }
        int var2 = Statics.field1402 >> 7;
        int var3 = Statics.field1420 >> 7;
        int var4 = method2411(Statics.field1402, Statics.field1420, Statics.field2384);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = Statics.field2384;
                    if (var8 < 3 && (class9.field140[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = var4 - class9.field136[var8][var6][var7];
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
        if (var10 > field578) {
            field578 += (var10 - field578) / 24;
        } else if (var10 < field578) {
            field578 += (var10 - field578) / 80;
        }
    }

    @ObfuscatedName("p.ar(Lah;IB)V")
    public static final void method232(class27 arg0, int arg1) {
        if (arg0.field462 > field491) {
            int var2 = arg0.field462 - field491;
            int var3 = arg0.field458 * 128 + arg0.field423 * 64;
            int var4 = arg0.field460 * 128 + arg0.field423 * 64;
            arg0.field471 += (var3 - arg0.field471) / var2;
            arg0.field420 += (var4 - arg0.field420) / var2;
            arg0.field474 = 0;
            if (arg0.field472 == 0) {
                arg0.field454 = 1024;
            }
            if (arg0.field472 == 1) {
                arg0.field454 = 1536;
            }
            if (arg0.field472 == 2) {
                arg0.field454 = 0;
            }
            if (arg0.field472 == 3) {
                arg0.field454 = 512;
            }
        } else if (arg0.field435 >= field491) {
            if (field491 == arg0.field435 || arg0.field448 == -1 || arg0.field451 != 0 || arg0.field469 + 1 > class34.method1443(arg0.field448).field895[arg0.field449]) {
                int var5 = arg0.field435 - arg0.field462;
                int var6 = field491 - arg0.field462;
                int var7 = arg0.field458 * 128 + arg0.field423 * 64;
                int var8 = arg0.field460 * 128 + arg0.field423 * 64;
                int var9 = arg0.field437 * 128 + arg0.field423 * 64;
                int var10 = arg0.field461 * 128 + arg0.field423 * 64;
                arg0.field471 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field420 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field474 = 0;
            if (arg0.field472 == 0) {
                arg0.field454 = 1024;
            }
            if (arg0.field472 == 1) {
                arg0.field454 = 1536;
            }
            if (arg0.field472 == 2) {
                arg0.field454 = 0;
            }
            if (arg0.field472 == 3) {
                arg0.field454 = 512;
            }
            arg0.field419 = arg0.field454;
        } else {
            method568(arg0);
        }
        if (arg0.field471 < 128 || arg0.field420 < 128 || arg0.field471 >= 13184 || arg0.field420 >= 13184) {
            arg0.field448 = -1;
            arg0.field455 = -1;
            arg0.field462 = 0;
            arg0.field435 = 0;
            arg0.field471 = arg0.field453[0] * 128 + arg0.field423 * 64;
            arg0.field420 = arg0.field459[0] * 128 + arg0.field423 * 64;
            arg0.method248();
        }
        if (Statics.field885 == arg0 && (arg0.field471 < 1536 || arg0.field420 < 1536 || arg0.field471 >= 11776 || arg0.field420 >= 11776)) {
            arg0.field448 = -1;
            arg0.field455 = -1;
            arg0.field462 = 0;
            arg0.field435 = 0;
            arg0.field471 = arg0.field453[0] * 128 + arg0.field423 * 64;
            arg0.field420 = arg0.field459[0] * 128 + arg0.field423 * 64;
            arg0.method248();
        }
        method295(arg0);
        method126(arg0);
    }

    @ObfuscatedName("ar.ac(Lah;B)V")
    public static final void method568(class27 arg0) {
        arg0.field445 = arg0.field443;
        if (arg0.field466 == 0) {
            arg0.field474 = 0;
            return;
        }
        if (arg0.field448 != -1 && arg0.field451 == 0) {
            class34 var1 = class34.method1443(arg0.field448);
            if (arg0.field475 > 0 && var1.field904 == 0) {
                arg0.field474++;
                return;
            }
            if (arg0.field475 <= 0 && var1.field905 == 0) {
                arg0.field474++;
                return;
            }
        }
        int var2 = arg0.field471;
        int var3 = arg0.field420;
        int var4 = arg0.field453[arg0.field466 - 1] * 128 + arg0.field423 * 64;
        int var5 = arg0.field459[arg0.field466 - 1] * 128 + arg0.field423 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field471 = var4;
            arg0.field420 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field454 = 1280;
            } else if (var3 > var5) {
                arg0.field454 = 1792;
            } else {
                arg0.field454 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field454 = 768;
            } else if (var3 > var5) {
                arg0.field454 = 256;
            } else {
                arg0.field454 = 512;
            }
        } else if (var3 < var5) {
            arg0.field454 = 1024;
        } else if (var3 > var5) {
            arg0.field454 = 0;
        }
        int var6 = arg0.field454 - arg0.field419 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field428;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field434;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field436;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field429;
        }
        if (var7 == -1) {
            var7 = arg0.field434;
        }
        arg0.field445 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field401.field817;
        }
        if (var9) {
            if (arg0.field454 != arg0.field419 && arg0.field442 == -1 && arg0.field464 != 0) {
                var8 = 2;
            }
            if (arg0.field466 > 2) {
                var8 = 6;
            }
            if (arg0.field466 > 3) {
                var8 = 8;
            }
            if (arg0.field474 > 0 && arg0.field466 > 1) {
                var8 = 8;
                arg0.field474--;
            }
        } else {
            if (arg0.field466 > 1) {
                var8 = 6;
            }
            if (arg0.field466 > 2) {
                var8 = 8;
            }
            if (arg0.field474 > 0 && arg0.field466 > 1) {
                var8 = 8;
                arg0.field474--;
            }
        }
        if (arg0.field473[arg0.field466 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field445 == arg0.field434 && arg0.field431 != -1) {
            arg0.field445 = arg0.field431;
        }
        if (var2 < var4) {
            arg0.field471 += var8;
            if (arg0.field471 > var4) {
                arg0.field471 = var4;
            }
        } else if (var2 > var4) {
            arg0.field471 -= var8;
            if (arg0.field471 < var4) {
                arg0.field471 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field420 += var8;
            if (arg0.field420 > var5) {
                arg0.field420 = var5;
            }
        } else if (var3 > var5) {
            arg0.field420 -= var8;
            if (arg0.field420 < var5) {
                arg0.field420 = var5;
            }
        }
        if (arg0.field471 == var4 && arg0.field420 == var5) {
            arg0.field466--;
            if (arg0.field475 > 0) {
                arg0.field475--;
            }
        }
    }

    @ObfuscatedName("client.as(Lah;I)V")
    public static final void method295(class27 arg0) {
        if (arg0.field464 == 0) {
            return;
        }
        if (arg0.field442 != -1 && arg0.field442 < 32768) {
            class25 var1 = field638[arg0.field442];
            if (var1 != null) {
                int var2 = arg0.field471 - var1.field471;
                int var3 = arg0.field420 - var1.field420;
                if (var2 != 0 || var3 != 0) {
                    arg0.field454 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field442 >= 32768) {
            int var4 = arg0.field442 - 32768;
            if (field612 == var4) {
                var4 = 2047;
            }
            class3 var5 = field520[var4];
            if (var5 != null) {
                int var6 = arg0.field471 - var5.field471;
                int var7 = arg0.field420 - var5.field420;
                if (var6 != 0 || var7 != 0) {
                    arg0.field454 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field439 != 0 || arg0.field444 != 0) && (arg0.field466 == 0 || arg0.field474 > 0)) {
            int var8 = arg0.field471 - (arg0.field439 * 64 - Statics.field1795 * 64 - Statics.field1795 * 64);
            int var9 = arg0.field420 - (arg0.field444 * 64 - Statics.field884 * 64 - Statics.field884 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field454 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field439 = 0;
            arg0.field444 = 0;
        }
        int var10 = arg0.field454 - arg0.field419 & 0x7FF;
        if (var10 == 0) {
            arg0.field447 = 0;
            return;
        }
        arg0.field447++;
        if (var10 > 1024) {
            arg0.field419 -= arg0.field464;
            boolean var11 = true;
            if (var10 < arg0.field464 || var10 > 2048 - arg0.field464) {
                arg0.field419 = arg0.field454;
                var11 = false;
            }
            if (arg0.field445 == arg0.field443 && (arg0.field447 > 25 || var11)) {
                if (arg0.field425 == -1) {
                    arg0.field445 = arg0.field434;
                } else {
                    arg0.field445 = arg0.field425;
                }
            }
        } else {
            arg0.field419 += arg0.field464;
            boolean var12 = true;
            if (var10 < arg0.field464 || var10 > 2048 - arg0.field464) {
                arg0.field419 = arg0.field454;
                var12 = false;
            }
            if (arg0.field445 == arg0.field443 && (arg0.field447 > 25 || var12)) {
                if (arg0.field426 == -1) {
                    arg0.field445 = arg0.field434;
                } else {
                    arg0.field445 = arg0.field426;
                }
            }
        }
        arg0.field419 &= 0x7FF;
    }

    @ObfuscatedName("y.ag(Lah;I)V")
    public static final void method126(class27 arg0) {
        arg0.field422 = false;
        if (arg0.field445 != -1) {
            class34 var1 = class34.method1443(arg0.field445);
            if (var1 == null || var1.field893 == null) {
                arg0.field445 = -1;
            } else {
                arg0.field470++;
                if (arg0.field446 < var1.field893.length && arg0.field470 > var1.field895[arg0.field446]) {
                    arg0.field470 = 1;
                    arg0.field446++;
                    method2382(var1, arg0.field446, arg0.field471, arg0.field420);
                }
                if (arg0.field446 >= var1.field893.length) {
                    arg0.field470 = 0;
                    arg0.field446 = 0;
                    method2382(var1, arg0.field446, arg0.field471, arg0.field420);
                }
            }
        }
        if (arg0.field455 != -1 && field491 >= arg0.field456) {
            if (arg0.field468 < 0) {
                arg0.field468 = 0;
            }
            int var2 = class35.method713(arg0.field455).field919;
            if (var2 == -1) {
                arg0.field455 = -1;
            } else {
                class34 var3 = class34.method1443(var2);
                if (var3 == null || var3.field893 == null) {
                    arg0.field455 = -1;
                } else {
                    arg0.field450++;
                    if (arg0.field468 < var3.field893.length && arg0.field450 > var3.field895[arg0.field468]) {
                        arg0.field450 = 1;
                        arg0.field468++;
                        method2382(var3, arg0.field468, arg0.field471, arg0.field420);
                    }
                    if (arg0.field468 >= var3.field893.length && (arg0.field468 < 0 || arg0.field468 >= var3.field893.length)) {
                        arg0.field455 = -1;
                    }
                }
            }
        }
        if (arg0.field448 != -1 && arg0.field451 <= 1) {
            class34 var4 = class34.method1443(arg0.field448);
            if (var4.field904 == 1 && arg0.field475 > 0 && arg0.field462 <= field491 && arg0.field435 < field491) {
                arg0.field451 = 1;
                return;
            }
        }
        if (arg0.field448 != -1 && arg0.field451 == 0) {
            class34 var5 = class34.method1443(arg0.field448);
            if (var5 == null || var5.field893 == null) {
                arg0.field448 = -1;
            } else {
                arg0.field469++;
                if (arg0.field449 < var5.field893.length && arg0.field469 > var5.field895[arg0.field449]) {
                    arg0.field469 = 1;
                    arg0.field449++;
                    method2382(var5, arg0.field449, arg0.field471, arg0.field420);
                }
                if (arg0.field449 >= var5.field893.length) {
                    arg0.field449 -= var5.field906;
                    arg0.field452++;
                    if (arg0.field452 >= var5.field903) {
                        arg0.field448 = -1;
                    } else if (arg0.field449 >= 0 && arg0.field449 < var5.field893.length) {
                        method2382(var5, arg0.field449, arg0.field471, arg0.field420);
                    } else {
                        arg0.field448 = -1;
                    }
                }
                arg0.field422 = var5.field899;
            }
        }
        if (arg0.field451 > 0) {
            arg0.field451--;
        }
    }

    @ObfuscatedName("ab.am(Ljava/lang/String;ZI)V")
    public static final void method911(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1984.method3437(arg0, 250);
        int var6 = Statics.field1984.method3438(arg0, 250) * 13;
        class89.method1826(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1828(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1984.method3456(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2755(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field310.getGraphics();
                Statics.field819.method1621(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field310.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field736; var13++) {
            if (field694[var13] + field692[var13] > var9 && field692[var13] < var9 + var11 && field695[var13] + field693[var13] > var10 && field693[var13] < var10 + var12) {
                field690[var13] = true;
            }
        }
    }

    @ObfuscatedName("dr.ap(ZB)V")
    public static final void method2340(boolean arg0) {
        if (Statics.field885.field471 >> 7 == field718 && Statics.field885.field420 >> 7 == field582) {
            field718 = 0;
        }
        int var1 = field607;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field885;
                var4 = 33538048;
            } else {
                var3 = field520[field522[var2]];
                var4 = field522[var2] << 14;
            }
            if (var3 != null && var3.method16()) {
                var3.field56 = false;
                if ((field486 && field607 > 50 || field607 > 200) && !arg0 && var3.field445 == var3.field443) {
                    var3.field56 = true;
                }
                int var5 = var3.field471 >> 7;
                int var6 = var3.field420 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field48 == null || field491 < var3.field43 || field491 >= var3.field44) {
                        if ((var3.field471 & 0x7F) == 64 && (var3.field420 & 0x7F) == 64) {
                            if (field590 == field589[var5][var6]) {
                                continue;
                            }
                            field589[var5][var6] = field590;
                        }
                        var3.field42 = method2411(var3.field471, var3.field420, Statics.field2384);
                        Statics.field1980.method1907(Statics.field2384, var3.field471, var3.field420, var3.field42, 60, var3, var3.field419, var4, var3.field422);
                    } else {
                        var3.field56 = false;
                        var3.field42 = method2411(var3.field471, var3.field420, Statics.field2384);
                        Statics.field1980.method2050(Statics.field2384, var3.field471, var3.field420, var3.field42, 60, var3, var3.field419, var4, var3.field53, var3.field47, var3.field51, var3.field52);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.au(ZI)V")
    public static final void method753(boolean arg0) {
        for (int var1 = 0; var1 < field743; var1++) {
            class25 var2 = field638[field617[var1]];
            int var3 = (field617[var1] << 14) + 536870912;
            if (var2 != null && var2.method16() && var2.field401.field808 == arg0 && var2.field401.method621()) {
                int var4 = var2.field471 >> 7;
                int var5 = var2.field420 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field423 == 1 && (var2.field471 & 0x7F) == 64 && (var2.field420 & 0x7F) == 64) {
                        if (field590 == field589[var4][var5]) {
                            continue;
                        }
                        field589[var4][var5] = field590;
                    }
                    if (!var2.field401.field822) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1980.method1907(Statics.field2384, var2.field471, var2.field420, method2411(var2.field471 + (var2.field423 * 64 - 64), var2.field420 + (var2.field423 * 64 - 64), Statics.field2384), var2.field423 * 64 - 64 + 60, var2, var2.field419, var3, var2.field422);
                }
            }
        }
    }

    @ObfuscatedName("x.aq(I)I")
    public static final int method151() {
        if (Statics.field193.field203) {
            return Statics.field2384;
        } else {
            int var0 = method2411(Statics.field266, Statics.field930, Statics.field2384);
            return var0 - Statics.field259 >= 800 || (class9.field140[Statics.field2384][Statics.field266 >> 7][Statics.field930 >> 7] & 0x4) == 0 ? 3 : Statics.field2384;
        }
    }

    @ObfuscatedName("q.at(III)V")
    public static final void method192(int arg0, int arg1) {
        if (field500 == 2) {
            method2347((field503 - Statics.field1795 << 7) + field499, (field504 - Statics.field884 << 7) + field507, field505 * 2);
            if (field655 > -1 && field491 % 20 < 10) {
                Statics.field127[0].method1721(field655 + arg0 - 12, field592 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("z.aw(B)V")
    public static final void method100() {
        field605 = 0;
        int var0 = (Statics.field885.field471 >> 7) + Statics.field1795;
        int var1 = (Statics.field885.field420 >> 7) + Statics.field884;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field605 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field605 = 1;
        }
        if (field605 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field605 = 0;
        }
    }

    @ObfuscatedName("bg.ai(IIIII)V")
    public static final void method1401(int arg0, int arg1, int arg2, int arg3) {
        if (field596 == 1) {
            Statics.field1035[field547 / 100].method1721(field593 - 8, field506 - 8);
        }
        if (field596 == 2) {
            Statics.field1035[field547 / 100 + 4].method1721(field593 - 8, field506 - 8);
        }
        method100();
        if (!field498) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field1984.method3441("Fps:" + field1309, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field486) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field486) {
            var8 = 16711680;
        }
        Statics.field1984.method3441("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("ei.ae(Lah;II)V")
    public static final void method2759(class27 arg0, int arg1) {
        method2347(arg0.field471, arg0.field420, arg1);
    }

    @ObfuscatedName("dz.ab(IIIB)V")
    public static final void method2347(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field655 = -1;
            field592 = -1;
            return;
        }
        int var3 = method2411(arg0, arg1, Statics.field2384) - arg2;
        int var4 = arg0 - Statics.field266;
        int var5 = var3 - Statics.field259;
        int var6 = arg1 - Statics.field930;
        int var7 = class104.field1769[Statics.field2067];
        int var8 = class104.field1787[Statics.field2067];
        int var9 = class104.field1769[Statics.field183];
        int var10 = class104.field1787[Statics.field183];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field655 = (var11 << 9) / var15 + 256;
            field592 = (var14 << 9) / var15 + 167;
        } else {
            field655 = -1;
            field592 = -1;
        }
    }

    @ObfuscatedName("do.ay(IIII)I")
    public static final int method2411(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field140[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field136[var5][var3][var4] + class9.field136[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field136[var5][var3][var4 + 1] + class9.field136[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ag.ax(ZI)V")
    public static final void method638(boolean arg0) {
        field545 = arg0;
        if (!field545) {
            int var1 = field528.method2522();
            int var2 = field528.method2493();
            int var3 = field528.method2515();
            int var4 = field528.method2493();
            int var5 = (field529 - field528.field2039) / 16;
            Statics.field143 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    Statics.field143[var6][var7] = field528.method2531();
                }
            }
            int var8 = field528.method2524();
            Statics.field2021 = new int[var5];
            Statics.field1659 = new int[var5];
            Statics.field2052 = new int[var5];
            Statics.field1267 = new byte[var5][];
            Statics.field285 = new byte[var5][];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var4 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field2021[var10] = var13;
                        Statics.field1659[var10] = Statics.field201.method3047("m" + var11 + "_" + var12);
                        Statics.field2052[var10] = Statics.field201.method3047("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method178(var4, var2, var3, var1, var8);
            return;
        }
        int var14 = field528.method2522();
        int var15 = field528.method2522();
        int var16 = field528.method2524();
        int var17 = field528.method2516();
        field528.method2354();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field528.method2355(1);
                    if (var21 == 1) {
                        field546[var18][var19][var20] = field528.method2355(26);
                    } else {
                        field546[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field528.method2356();
        int var22 = (field529 - field528.field2039) / 16;
        Statics.field143 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field143[var23][var24] = field528.method2656();
            }
        }
        int var25 = field528.method2644();
        Statics.field2021 = new int[var22];
        Statics.field1659 = new int[var22];
        Statics.field2052 = new int[var22];
        Statics.field1267 = new byte[var22][];
        Statics.field285 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field546[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2021[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2021[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1659[var26] = Statics.field201.method3047("m" + var35 + "_" + var36);
                            Statics.field2052[var26] = Statics.field201.method3047("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method178(var16, var14, var17, var15, var25);
    }

    @ObfuscatedName("q.ao(IIIIII)V")
    public static final void method178(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field275 == arg0 && Statics.field117 == arg1 && field538 == arg2 || !field486) {
            return;
        }
        Statics.field275 = arg0;
        Statics.field117 = arg1;
        field538 = arg2;
        if (!field486) {
            field538 = 0;
        }
        method828(25);
        method911(class134.field2090, true);
        int var5 = Statics.field1795;
        int var6 = Statics.field884;
        Statics.field1795 = (arg0 - 6) * 8;
        Statics.field884 = (arg1 - 6) * 8;
        int var7 = Statics.field1795 - var5;
        int var8 = Statics.field884 - var6;
        int var9 = Statics.field1795;
        int var10 = Statics.field884;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field638[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field453[var13] -= var7;
                    var12.field459[var13] -= var8;
                }
                var12.field471 -= var7 * 128;
                var12.field420 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field520[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field453[var16] -= var7;
                    var15.field459[var16] -= var8;
                }
                var15.field471 -= var7 * 128;
                var15.field420 -= var8 * 128;
            }
        }
        Statics.field2384 = arg2;
        Statics.field885.method251(arg3, arg4, false);
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
                        field620[var27][var23][var24] = field620[var27][var25][var26];
                    } else {
                        field620[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field621.method3369(); var28 != null; var28 = (class22) field621.method3371()) {
            var28.field368 -= var7;
            var28.field351 -= var8;
            if (var28.field368 < 0 || var28.field351 < 0 || var28.field368 >= 104 || var28.field351 >= 104) {
                var28.method3409();
            }
        }
        if (field718 != 0) {
            field718 -= var7;
            field582 -= var8;
        }
        field726 = 0;
        field732 = false;
        field713 = -1;
        field623.method3363();
        field641.method3363();
    }

    @ObfuscatedName("ch.al(ZB)V")
    public static final void method2073(boolean arg0) {
        method2244();
        field532++;
        if (field532 < 50 && !arg0) {
            return;
        }
        field532 = 0;
        if (field665 || Statics.field199 == null) {
            return;
        }
        field540.method2352(158);
        try {
            Statics.field199.method1411(field540.field2041, 0, field540.field2039);
            field540.field2039 = 0;
        } catch (IOException var2) {
            field665 = true;
        }
    }

    @ObfuscatedName("ae.az(II)V")
    public static final void method897(int arg0) {
        int[] var1 = Statics.field1263.field1472;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field140[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1980.method1922(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field140[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1980.method1922(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1263.method1711();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field140[arg0][var10][var9] & 0x18) == 0) {
                    method29(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field140[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method29(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field478 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1980.method1925(Statics.field2384, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class32.method701(var14).field852;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field544[Statics.field2384].field2736;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
                                    var16--;
                                }
                                if (var20 == 1 && var16 < 103 && var16 < var11 + 3 && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
                                    var16++;
                                }
                                if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
                                    var17--;
                                }
                                if (var20 == 3 && var17 < 103 && var17 < var12 + 3 && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        field717[field478] = Statics.field958[var15];
                        field558[field478] = var16;
                        field502[field478] = var17;
                        field478++;
                    }
                }
            }
        }
        Statics.field819.method1705();
    }

    @ObfuscatedName("o.aj(IIIIII)V")
    public static final void method29(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1980.method1950(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1980.method1926(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1263.field1472;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method701(var12);
            if (var13.field853 == -1) {
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
                class87 var14 = Statics.field130[var13.field853];
                if (var14 != null) {
                    int var15 = (var13.field842 * 4 - var14.field1486) / 2;
                    int var16 = (var13.field840 * 4 - var14.field1487) / 2;
                    var14.method1808(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field840) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1980.method1924(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1980.method1926(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method701(var21);
            if (var22.field853 != -1) {
                class87 var23 = Statics.field130[var22.field853];
                if (var23 != null) {
                    int var24 = (var22.field842 * 4 - var23.field1486) / 2;
                    int var25 = (var22.field840 * 4 - var23.field1487) / 2;
                    var23.method1808(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field840) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1263.field1472;
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
        int var29 = Statics.field1980.method1925(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method701(var30);
        if (var31.field853 == -1) {
            return;
        }
        class87 var32 = Statics.field130[var31.field853];
        if (var32 != null) {
            int var33 = (var31.field842 * 4 - var32.field1486) / 2;
            int var34 = (var31.field840 * 4 - var32.field1487) / 2;
            var32.method1808(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field840) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("fw.an(IIII)Z")
    public static final boolean method3228(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field1980.method1926(Statics.field2384, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method701(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field842;
                var9 = var7.field840;
            } else {
                var8 = var7.field840;
                var9 = var7.field842;
            }
            int var10 = var7.field862;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method1886(Statics.field885.field453[0], Statics.field885.field459[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method1886(Statics.field885.field453[0], Statics.field885.field459[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field593 = class77.field1399;
        field506 = class77.field1387;
        field596 = 2;
        field547 = 0;
        return true;
    }

    @ObfuscatedName("cn.ad(IIIIZIIIIIIB)Z")
    public static final boolean method1886(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field549[var11][var12] = 0;
                field550[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field549[arg0][arg1] = 99;
        field550[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field551[var15] = arg0;
        int var36 = var15 + 1;
        field704[var15] = arg1;
        boolean var17 = false;
        int var18 = field551.length;
        int[][] var19 = field544[Statics.field2384].field2736;
        while (var36 != var16) {
            var13 = field551[var16];
            var14 = field704[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field544[Statics.field2384].method3294(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field544[Statics.field2384].method3270(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field544[Statics.field2384].method3271(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field550[var13][var14] + 1;
            if (var13 > 0 && field549[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field551[var36] = var13 - 1;
                field704[var36] = var14;
                var36 = (var36 + 1) % var18;
                field549[var13 - 1][var14] = 2;
                field550[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field549[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field551[var36] = var13 + 1;
                field704[var36] = var14;
                var36 = (var36 + 1) % var18;
                field549[var13 + 1][var14] = 8;
                field550[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field549[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field551[var36] = var13;
                field704[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field549[var13][var14 - 1] = 1;
                field550[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field549[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field551[var36] = var13;
                field704[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field549[var13][var14 + 1] = 4;
                field550[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field549[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field551[var36] = var13 - 1;
                field704[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field549[var13 - 1][var14 - 1] = 3;
                field550[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field549[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field551[var36] = var13 + 1;
                field704[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field549[var13 + 1][var14 - 1] = 9;
                field550[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field549[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field551[var36] = var13 - 1;
                field704[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field549[var13 - 1][var14 + 1] = 6;
                field550[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field549[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field551[var36] = var13 + 1;
                field704[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field549[var13 + 1][var14 + 1] = 12;
                field550[var13 + 1][var14 + 1] = var20;
            }
        }
        field548 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field550[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field550[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field550[var24][var25];
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
            field548 = 1;
        }
        byte var29 = 0;
        field551[var29] = var13;
        int var37 = var29 + 1;
        field704[var29] = var14;
        int var30;
        int var31 = var30 = field549[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field551[var37] = var13;
                field704[var37++] = var14;
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
            var31 = field549[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field551[var37];
            int var34 = field704[var37];
            if (arg10 == 0) {
                field540.method2352(62);
                field540.method2477(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field540.method2352(56);
                field540.method2477(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field540.method2352(2);
                field540.method2477(var32 + var32 + 3);
            }
            field540.method2477(class75.field1362[82] ? 1 : 0);
            field540.method2537(Statics.field1795 + var33);
            field540.method2519(Statics.field884 + var34);
            field718 = field551[0];
            field582 = field704[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field540.method2513(field551[var37] - var33);
                field540.method2512(field704[var37] - var34);
            }
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("x.af(I)Z")
    public static final boolean method150() {
        if (Statics.field199 == null) {
            return false;
        }
        try {
            int var0 = Statics.field199.method1409();
            if (var0 == 0) {
                return false;
            }
            if (field514 == -1) {
                Statics.field199.method1410(field528.field2041, 0, 1);
                field528.field2039 = 0;
                field514 = field528.method2353();
                field529 = class165.field2776[field514];
                var0--;
            }
            if (field529 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field199.method1410(field528.field2041, 0, 1);
                field529 = field528.field2041[0] & 0xFF;
                var0--;
            }
            if (field529 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field199.method1410(field528.field2041, 0, 2);
                field528.field2039 = 0;
                field529 = field528.method2493();
                var0 -= 2;
            }
            if (var0 < field529) {
                return false;
            }
            field528.field2039 = 0;
            Statics.field199.method1410(field528.field2041, 0, field529);
            field531 = 0;
            field536 = field535;
            field535 = field534;
            field534 = field514;
            if (field514 == 159) {
                int var1 = field528.method2668();
                int var2 = field528.method2493();
                if (var1 < -70000) {
                    var2 += 32768;
                }
                class158 var3;
                if (var1 >= 0) {
                    var3 = class158.method821(var1);
                } else {
                    var3 = null;
                }
                while (field528.field2039 < field529) {
                    int var4 = field528.method2570();
                    int var5 = field528.method2493();
                    int var6 = 0;
                    if (var5 != 0) {
                        var6 = field528.method2491();
                        if (var6 == 255) {
                            var6 = field528.method2668();
                        }
                    }
                    if (var3 != null && var4 >= 0 && var4 < var3.field2687.length) {
                        var3.field2687[var4] = var5;
                        var3.field2688[var4] = var6;
                    }
                    class19.method2168(var2, var4, var5 - 1, var6);
                }
                if (var3 != null) {
                    method394(var3);
                }
                method118();
                field672[++field673 - 1 & 0x1F] = var2 & 0x7FFF;
                field514 = -1;
                return true;
            }
            if (field514 == 182) {
                field614 = 0;
                field609 = 0;
                field528.method2354();
                int var7 = field528.method2355(1);
                if (var7 != 0) {
                    int var8 = field528.method2355(2);
                    if (var8 == 0) {
                        field668[++field609 - 1] = 2047;
                    } else if (var8 == 1) {
                        int var9 = field528.method2355(3);
                        Statics.field885.method245(var9, false);
                        int var10 = field528.method2355(1);
                        if (var10 == 1) {
                            field668[++field609 - 1] = 2047;
                        }
                    } else if (var8 == 2) {
                        int var11 = field528.method2355(3);
                        Statics.field885.method245(var11, true);
                        int var12 = field528.method2355(3);
                        Statics.field885.method245(var12, true);
                        int var13 = field528.method2355(1);
                        if (var13 == 1) {
                            field668[++field609 - 1] = 2047;
                        }
                    } else if (var8 == 3) {
                        int var14 = field528.method2355(1);
                        int var15 = field528.method2355(7);
                        int var16 = field528.method2355(1);
                        if (var16 == 1) {
                            field668[++field609 - 1] = 2047;
                        }
                        int var17 = field528.method2355(7);
                        Statics.field2384 = field528.method2355(2);
                        Statics.field885.method251(var17, var15, var14 == 1);
                    }
                }
                method224();
                while (field528.method2357(field529) >= 11) {
                    int var18 = field528.method2355(11);
                    if (var18 == 2047) {
                        break;
                    }
                    boolean var19 = false;
                    if (field520[var18] == null) {
                        field520[var18] = new class3();
                        if (field611[var18] != null) {
                            field520[var18].method19(field611[var18]);
                        }
                        var19 = true;
                    }
                    field522[++field607 - 1] = var18;
                    class3 var20 = field520[var18];
                    var20.field465 = field491;
                    int var21 = field528.method2355(5);
                    if (var21 > 15) {
                        var21 -= 32;
                    }
                    int var22 = field528.method2355(1);
                    int var23 = field528.method2355(1);
                    if (var23 == 1) {
                        field668[++field609 - 1] = var18;
                    }
                    int var24 = field619[field528.method2355(3)];
                    if (var19) {
                        var20.field454 = var20.field419 = var24;
                    }
                    int var25 = field528.method2355(5);
                    if (var25 > 15) {
                        var25 -= 32;
                    }
                    var20.method251(Statics.field885.field453[0] + var25, Statics.field885.field459[0] + var21, var22 == 1);
                }
                field528.method2356();
                for (int var26 = 0; var26 < field609; var26++) {
                    int var27 = field668[var26];
                    class3 var28 = field520[var27];
                    int var29 = field528.method2491();
                    if ((var29 & 0x8) != 0) {
                        var29 += field528.method2491() << 8;
                    }
                    method121(var27, var28, var29);
                }
                for (int var30 = 0; var30 < field614; var30++) {
                    int var31 = field615[var30];
                    if (field491 != field520[var31].field465) {
                        field520[var31] = null;
                    }
                }
                if (field529 != field528.field2039) {
                    throw new RuntimeException(field528.field2039 + class2.field35 + field529);
                }
                for (int var32 = 0; var32 < field607; var32++) {
                    if (field520[field522[var32]] == null) {
                        throw new RuntimeException(var32 + class2.field35 + field607);
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 130) {
                while (field528.field2039 < field529) {
                    int var33 = field528.method2491();
                    boolean var34 = (var33 & 0x1) == 1;
                    String var35 = field528.method2500();
                    String var36 = field528.method2500();
                    field528.method2500();
                    for (int var37 = 0; var37 < field523; var37++) {
                        class11 var38 = field744[var37];
                        if (var34) {
                            if (var36.equals(var38.field192)) {
                                var38.field192 = var35;
                                var38.field188 = var36;
                                var35 = null;
                                break;
                            }
                        } else if (var35.equals(var38.field192)) {
                            var38.field192 = var35;
                            var38.field188 = var36;
                            var35 = null;
                            break;
                        }
                    }
                    if (var35 != null && field523 < 400) {
                        class11 var39 = new class11();
                        field744[field523] = var39;
                        var39.field192 = var35;
                        var39.field188 = var36;
                        field523++;
                    }
                }
                field677 = field669;
                field514 = -1;
                return true;
            }
            if (field514 == 161) {
                field715 = field528.method2524() * 30;
                field679 = field669;
                field514 = -1;
                return true;
            }
            if (field514 == 13) {
                int var40 = field528.method2515();
                int var41 = field528.method2648();
                int var42 = field528.method2516();
                Statics.field2384 = var41 >> 1;
                Statics.field885.method251(var40, var42, (var41 & 0x1) == 1);
                field514 = -1;
                return true;
            }
            if (field514 == 117) {
                String var43 = field528.method2500();
                int var44 = field528.method2493();
                byte var45 = field528.method2492();
                boolean var46 = false;
                if (var45 == -128) {
                    var46 = true;
                }
                if (var46) {
                    if (Statics.field80 == 0) {
                        field514 = -1;
                        return true;
                    }
                    boolean var47 = false;
                    int var48;
                    for (var48 = 0; var48 < Statics.field80 && (!Statics.field367[var48].field125.equals(var43) || Statics.field367[var48].field124 != var44); var48++) {
                    }
                    if (var48 < Statics.field80) {
                        while (var48 < Statics.field80 - 1) {
                            Statics.field367[var48] = Statics.field367[var48 + 1];
                            var48++;
                        }
                        Statics.field80--;
                        Statics.field367[Statics.field80] = null;
                    }
                } else {
                    field528.method2500();
                    class8 var49 = new class8();
                    var49.field125 = var43;
                    var49.field123 = class148.method1395(var49.field125, Statics.field484);
                    var49.field124 = var44;
                    var49.field129 = var45;
                    int var50;
                    for (var50 = Statics.field80 - 1; var50 >= 0; var50--) {
                        int var51 = Statics.field367[var50].field123.compareTo(var49.field125);
                        if (var51 == 0) {
                            Statics.field367[var50].field124 = var44;
                            Statics.field367[var50].field129 = var45;
                            if (var43.equals(Statics.field885.field58)) {
                                Statics.field977 = var45;
                            }
                            field678 = field669;
                            field514 = -1;
                            return true;
                        }
                        if (var51 < 0) {
                            break;
                        }
                    }
                    if (Statics.field80 >= Statics.field367.length) {
                        field514 = -1;
                        return true;
                    }
                    for (int var52 = Statics.field80 - 1; var52 > var50; var52--) {
                        Statics.field367[var52 + 1] = Statics.field367[var52];
                    }
                    if (Statics.field80 == 0) {
                        Statics.field367 = new class8[100];
                    }
                    Statics.field367[var50 + 1] = var49;
                    Statics.field80++;
                    if (var43.equals(Statics.field885.field58)) {
                        Statics.field977 = var45;
                    }
                }
                field678 = field669;
                field514 = -1;
                return true;
            }
            if (field514 == 20) {
                field718 = 0;
                field514 = -1;
                return true;
            }
            if (field514 == 255) {
                field528.field2039 += 28;
                if (field528.method2621()) {
                    Statics.method125(field528, field528.field2039 - 28);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 219) {
                int var53 = field528.method2491();
                int var54 = field528.method2648();
                String var55 = field528.method2500();
                if (var54 >= 1 && var54 <= 8) {
                    if (var55.equalsIgnoreCase("null")) {
                        var55 = null;
                    }
                    field613[var54 - 1] = var55;
                    field618[var54 - 1] = var53 == 0;
                }
                field514 = -1;
                return true;
            }
            if (field514 == 155) {
                String var56 = field528.method2500();
                String var57 = class185.method3511(class147.method2398(class184.method92(field528)));
                method11(6, var56, var57);
                field514 = -1;
                return true;
            }
            if (field514 == 33 || field514 == 35 || field514 == 202 || field514 == 172 || field514 == 246 || field514 == 163 || field514 == 47 || field514 == 221 || field514 == 247 || field514 == 53 || field514 == 92) {
                method234();
                field514 = -1;
                return true;
            }
            if (field514 == 14) {
                String var58 = field528.method2500();
                int var59 = field528.method2531();
                class158 var60 = class158.method821(var59);
                if (!var58.equals(var60.field2598)) {
                    var60.field2598 = var58;
                    method394(var60);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 209) {
                int var61 = field528.method2668();
                Statics.field253 = Statics.field1325.method1524(var61);
                field514 = -1;
                return true;
            }
            if (field514 == 86) {
                Statics.field1860 = field528.method2516();
                Statics.field495 = field528.method2491();
                while (field528.field2039 < field529) {
                    field514 = field528.method2491();
                    method234();
                }
                field514 = -1;
                return true;
            }
            if (field514 == 160) {
                String var62 = field528.method2500();
                if (var62.endsWith(":tradereq:")) {
                    String var63 = var62.substring(0, var62.indexOf(":"));
                    boolean var64 = false;
                    if (method24(var63)) {
                        var64 = true;
                    }
                    if (!var64 && field605 == 0) {
                        method11(4, var63, class134.field2219);
                    }
                } else if (var62.endsWith(":duelreq:")) {
                    String var65 = var62.substring(0, var62.indexOf(":"));
                    boolean var66 = false;
                    if (method24(var65)) {
                        var66 = true;
                    }
                    if (!var66 && field605 == 0) {
                        method11(8, var65, class134.field2220);
                    }
                } else if (var62.endsWith(":chalreq:")) {
                    String var67 = var62.substring(0, var62.indexOf(":"));
                    boolean var68 = false;
                    if (method24(var67)) {
                        var68 = true;
                    }
                    if (!var68 && field605 == 0) {
                        String var69 = var62.substring(var62.indexOf(":") + 1, var62.length() - 9);
                        method11(8, var67, var69);
                    }
                } else if (var62.endsWith(":assistreq:")) {
                    String var70 = var62.substring(0, var62.indexOf(":"));
                    boolean var71 = false;
                    if (method24(var70)) {
                        var71 = true;
                    }
                    if (!var71 && field605 == 0) {
                        method11(10, var70, "");
                    }
                } else if (var62.endsWith(":clan:")) {
                    String var72 = var62.substring(0, var62.indexOf(":clan:"));
                    method11(11, "", var72);
                } else if (var62.endsWith(":trade:")) {
                    String var73 = var62.substring(0, var62.indexOf(":trade:"));
                    if (field605 == 0) {
                        method11(12, "", var73);
                    }
                } else if (var62.endsWith(":assist:")) {
                    String var74 = var62.substring(0, var62.indexOf(":assist:"));
                    if (field605 == 0) {
                        method11(13, "", var74);
                    }
                } else {
                    method11(0, "", var62);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 190) {
                method2167();
                field514 = -1;
                return true;
            }
            if (field514 == 183) {
                method638(false);
                field514 = -1;
                return true;
            }
            if (field514 == 70) {
                while (field528.field2039 < field529) {
                    boolean var75 = field528.method2491() == 1;
                    String var76 = field528.method2500();
                    String var77 = field528.method2500();
                    int var78 = field528.method2493();
                    int var79 = field528.method2491();
                    int var80 = field528.method2491();
                    boolean var81 = (var80 & 0x2) != 0;
                    boolean var82 = (var80 & 0x1) != 0;
                    if (var78 > 0) {
                        field528.method2500();
                        field528.method2491();
                        field528.method2668();
                    }
                    field528.method2500();
                    for (int var83 = 0; var83 < field738; var83++) {
                        class23 var84 = field741[var83];
                        if (var75) {
                            if (var77.equals(var84.field381)) {
                                var84.field381 = var76;
                                var84.field371 = var77;
                                var76 = null;
                                break;
                            }
                        } else if (var76.equals(var84.field381)) {
                            if (var84.field372 != var78) {
                                boolean var85 = true;
                                for (class28 var86 = (class28) field742.method3340(); var86 != null; var86 = (class28) field742.method3334()) {
                                    if (var86.field752.equals(var76)) {
                                        if (var78 != 0 && var86.field759 == 0) {
                                            var86.method3401();
                                            var85 = false;
                                        } else if (var78 == 0 && var86.field759 != 0) {
                                            var86.method3401();
                                            var85 = false;
                                        }
                                    }
                                }
                                if (var85) {
                                    field742.method3331(new class28(var76, var78));
                                }
                                var84.field372 = var78;
                            }
                            var84.field371 = var77;
                            var84.field374 = var79;
                            var84.field370 = var81;
                            var84.field375 = var82;
                            var76 = null;
                            break;
                        }
                    }
                    if (var76 != null && field738 < 400) {
                        class23 var87 = new class23();
                        field741[field738] = var87;
                        var87.field381 = var76;
                        var87.field371 = var77;
                        var87.field372 = var78;
                        var87.field374 = var79;
                        var87.field370 = var81;
                        var87.field375 = var82;
                        field738++;
                    }
                }
                field739 = 2;
                field677 = field669;
                boolean var88 = false;
                int var89 = field738;
                while (var89 > 0) {
                    boolean var90 = true;
                    var89--;
                    for (int var91 = 0; var91 < var89; var91++) {
                        boolean var92 = false;
                        class23 var93 = field741[var91];
                        class23 var94 = field741[var91 + 1];
                        if (field591 != var93.field372 && field591 == var94.field372) {
                            var92 = true;
                        }
                        if (!var92 && var93.field372 == 0 && var94.field372 != 0) {
                            var92 = true;
                        }
                        if (!var92 && !var93.field370 && var94.field370) {
                            var92 = true;
                        }
                        if (!var92 && !var93.field375 && var94.field375) {
                            var92 = true;
                        }
                        if (var92) {
                            class23 var95 = field741[var91];
                            field741[var91] = field741[var91 + 1];
                            field741[var91 + 1] = var95;
                            var90 = false;
                        }
                    }
                    if (var90) {
                        break;
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 58) {
                int var96 = field529 + field528.field2039;
                int var97 = field528.method2493();
                int var98 = field528.method2493();
                if (field721 != var97) {
                    field721 = var97;
                    method38(field721);
                    class26.method115(field721);
                    for (int var99 = 0; var99 < 100; var99++) {
                        field689[var99] = true;
                    }
                }
                while (var98-- > 0) {
                    int var100 = field528.method2668();
                    int var101 = field528.method2493();
                    int var102 = field528.method2491();
                    class4 var103 = (class4) field647.method3348((long) var100);
                    if (var103 != null && var103.field59 != var101) {
                        method236(var103, true);
                        var103 = null;
                    }
                    if (var103 == null) {
                        class4 var104 = new class4();
                        var104.field59 = var101;
                        var104.field60 = var102;
                        field647.method3349(var104, (long) var100);
                        method38(var101);
                        class26.method115(var101);
                        class158 var105 = class158.method821(var100);
                        if (var105 != null) {
                            method394(var105);
                        }
                        if (field650 != null) {
                            method394(field650);
                            field650 = null;
                        }
                        method715();
                        if (field721 != -1) {
                            int var106 = field721;
                            if (class158.method2760(var106)) {
                                method2072(Statics.field2682[var106], 1);
                            }
                        }
                        var103 = var104;
                    }
                    var103.field61 = true;
                }
                for (class4 var108 = (class4) field647.method3351(); var108 != null; var108 = (class4) field647.method3352()) {
                    if (var108.field61) {
                        var108.field61 = false;
                    } else {
                        method236(var108, true);
                    }
                }
                field696 = new class175(512);
                while (field528.field2039 < var96) {
                    int var109 = field528.method2668();
                    int var110 = field528.method2493();
                    int var111 = field528.method2493();
                    int var112 = field528.method2668();
                    for (int var113 = var110; var113 <= var111; var113++) {
                        long var114 = ((long) var109 << 32) + (long) var113;
                        field696.method3349(new class171(var112), var114);
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 132) {
                Statics.method124(field528, field529);
                field514 = -1;
                return true;
            }
            if (field514 == 103) {
                Statics.field1860 = field528.method2516();
                Statics.field495 = field528.method2648();
                for (int var116 = Statics.field495; var116 < Statics.field495 + 8; var116++) {
                    for (int var117 = Statics.field1860; var117 < Statics.field1860 + 8; var117++) {
                        if (field620[Statics.field2384][var116][var117] != null) {
                            field620[Statics.field2384][var116][var117] = null;
                            method172(var116, var117);
                        }
                    }
                }
                for (class22 var118 = (class22) field621.method3369(); var118 != null; var118 = (class22) field621.method3371()) {
                    if (var118.field368 >= Statics.field495 && var118.field368 < Statics.field495 + 8 && var118.field351 >= Statics.field1860 && var118.field351 < Statics.field1860 + 8 && Statics.field2384 == var118.field358) {
                        var118.field359 = 0;
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 185) {
                field732 = true;
                Statics.field86 = field528.method2491();
                Statics.field1029 = field528.method2491();
                Statics.field277 = field528.method2493();
                Statics.field13 = field528.method2491();
                Statics.field379 = field528.method2491();
                if (Statics.field379 >= 100) {
                    int var119 = Statics.field86 * 128 + 64;
                    int var120 = Statics.field1029 * 128 + 64;
                    int var121 = method2411(var119, var120, Statics.field2384) - Statics.field277;
                    int var122 = var119 - Statics.field266;
                    int var123 = var121 - Statics.field259;
                    int var124 = var120 - Statics.field930;
                    int var125 = (int) Math.sqrt((double) (var122 * var122 + var124 * var124));
                    Statics.field2067 = (int) (Math.atan2((double) var123, (double) var125) * 325.949D) & 0x7FF;
                    Statics.field183 = (int) (Math.atan2((double) var122, (double) var124) * -325.949D) & 0x7FF;
                    if (Statics.field2067 < 128) {
                        Statics.field2067 = 128;
                    }
                    if (Statics.field2067 > 383) {
                        Statics.field2067 = 383;
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 120) {
                int var126 = field528.method2493();
                if (var126 == 65535) {
                    var126 = -1;
                }
                int var127 = field528.method2656();
                int var128 = field528.method2531();
                class158 var129 = class158.method821(var127);
                if (var129.field2626) {
                    var129.field2592 = var126;
                    var129.field2666 = var128;
                    class40 var131 = class40.method259(var126);
                    var129.field2625 = var131.field1007;
                    var129.field2584 = var131.field997;
                    var129.field2640 = var131.field1005;
                    var129.field2623 = var131.field992;
                    var129.field2624 = var131.field1000;
                    var129.field2628 = var131.field999;
                    if (var129.field2594 > 0) {
                        var129.field2628 = var129.field2628 * 32 / var129.field2594;
                    }
                    method394(var129);
                } else if (var126 == -1) {
                    var129.field2617 = 0;
                    field514 = -1;
                    return true;
                } else {
                    class40 var130 = class40.method259(var126);
                    var129.field2617 = 4;
                    var129.field2618 = var126;
                    var129.field2625 = var130.field1007;
                    var129.field2584 = var130.field997;
                    var129.field2628 = var130.field999 * 100 / var128;
                    method394(var129);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 214) {
                int var132 = field528.method2668();
                int var133 = field528.method2493();
                if (var132 < -70000) {
                    var133 += 32768;
                }
                class158 var134;
                if (var132 >= 0) {
                    var134 = class158.method821(var132);
                } else {
                    var134 = null;
                }
                if (var134 != null) {
                    for (int var135 = 0; var135 < var134.field2687.length; var135++) {
                        var134.field2687[var135] = 0;
                        var134.field2688[var135] = 0;
                    }
                }
                class19.method220(var133);
                int var136 = field528.method2493();
                for (int var137 = 0; var137 < var136; var137++) {
                    int var138 = field528.method2648();
                    if (var138 == 255) {
                        var138 = field528.method2533();
                    }
                    int var139 = field528.method2522();
                    if (var134 != null && var137 < var134.field2687.length) {
                        var134.field2687[var137] = var139;
                        var134.field2688[var137] = var138;
                    }
                    class19.method2168(var133, var137, var139 - 1, var138);
                }
                if (var134 != null) {
                    method394(var134);
                }
                method118();
                field672[++field673 - 1 & 0x1F] = var133 & 0x7FFF;
                field514 = -1;
                return true;
            }
            if (field514 == 102) {
                String var140 = field528.method2500();
                long var141 = field528.method2496();
                long var143 = (long) field528.method2493();
                long var145 = (long) field528.method2494();
                int var147 = field528.method2491();
                long var148 = (var143 << 32) + var145;
                boolean var150 = false;
                for (int var151 = 0; var151 < 100; var151++) {
                    if (field705[var151] == var148) {
                        var150 = true;
                        break;
                    }
                }
                if (var147 <= 1 && method24(var140)) {
                    var150 = true;
                }
                if (!var150 && field605 == 0) {
                    field705[field706] = var148;
                    field706 = (field706 + 1) % 100;
                    String var152 = class185.method3511(class147.method2398(class184.method92(field528)));
                    if (var147 == 2 || var147 == 3) {
                        method693(9, Statics.method139(1) + var140, var152, class146.method2266(var141));
                    } else if (var147 == 1) {
                        method693(9, Statics.method139(0) + var140, var152, class146.method2266(var141));
                    } else {
                        method693(9, var140, var152, class146.method2266(var141));
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 51) {
                for (int var153 = 0; var153 < Statics.field1042; var153++) {
                    class42 var154 = class42.method102(var153);
                    if (var154 != null && var154.field1044 == 0) {
                        class159.field2706[var153] = 0;
                        class159.field2705[var153] = 0;
                    }
                }
                method118();
                field671 += 32;
                field514 = -1;
                return true;
            }
            if (field514 == 90) {
                field739 = 1;
                field677 = field669;
                field514 = -1;
                return true;
            }
            if (field514 == 171) {
                int var155 = field528.method2524();
                if (var155 == 65535) {
                    var155 = -1;
                }
                if (var155 == -1 && !field537) {
                    class138.method2252();
                } else if (var155 != -1 && field722 != var155 && field652 != 0 && !field537) {
                    class154 var156 = Statics.field1028;
                    int var157 = field652;
                    class138.field2332 = 1;
                    Statics.field1036 = var156;
                    Statics.field2334 = var155;
                    Statics.field282 = 0;
                    Statics.field2336 = var157;
                    Statics.field2337 = false;
                    Statics.field73 = 2;
                }
                field722 = var155;
                field514 = -1;
                return true;
            }
            if (field514 == 30) {
                int var158 = field528.method2644();
                if (var158 == 65535) {
                    var158 = -1;
                }
                int var159 = field528.method2576();
                Statics.method120(var158, var159);
                field514 = -1;
                return true;
            }
            if (field514 == 129) {
                field678 = field669;
                if (field529 == 0) {
                    field711 = null;
                    field712 = null;
                    Statics.field80 = 0;
                    Statics.field367 = null;
                    field514 = -1;
                    return true;
                }
                field712 = field528.method2500();
                long var160 = field528.method2496();
                field711 = class146.method2431(var160);
                Statics.field1662 = field528.method2492();
                int var162 = field528.method2491();
                if (var162 == 255) {
                    field514 = -1;
                    return true;
                }
                Statics.field80 = var162;
                class8[] var163 = new class8[100];
                for (int var164 = 0; var164 < Statics.field80; var164++) {
                    var163[var164] = new class8();
                    var163[var164].field125 = field528.method2500();
                    var163[var164].field123 = class148.method1395(var163[var164].field125, Statics.field484);
                    var163[var164].field124 = field528.method2493();
                    var163[var164].field129 = field528.method2492();
                    field528.method2500();
                    if (var163[var164].field125.equals(Statics.field885.field58)) {
                        Statics.field977 = var163[var164].field129;
                    }
                }
                boolean var165 = false;
                int var166 = Statics.field80;
                while (var166 > 0) {
                    boolean var167 = true;
                    var166--;
                    for (int var168 = 0; var168 < var166; var168++) {
                        if (var163[var168].field123.compareTo(var163[var168 + 1].field123) > 0) {
                            class8 var169 = var163[var168];
                            var163[var168] = var163[var168 + 1];
                            var163[var168 + 1] = var169;
                            var167 = false;
                        }
                    }
                    if (var167) {
                        break;
                    }
                }
                Statics.field367 = var163;
                field514 = -1;
                return true;
            }
            if (field514 == 50) {
                field732 = true;
                Statics.field1181 = field528.method2491();
                Statics.field1350 = field528.method2491();
                Statics.field264 = field528.method2493();
                Statics.field1796 = field528.method2491();
                Statics.field749 = field528.method2491();
                if (Statics.field749 >= 100) {
                    Statics.field266 = Statics.field1181 * 128 + 64;
                    Statics.field930 = Statics.field1350 * 128 + 64;
                    Statics.field259 = method2411(Statics.field266, Statics.field930, Statics.field2384) - Statics.field264;
                }
                field514 = -1;
                return true;
            }
            if (field514 == 36) {
                field720 = field528.method2491();
                field514 = -1;
                return true;
            }
            if (field514 == 193) {
                int var170 = field528.method2668();
                class4 var171 = (class4) field647.method3348((long) var170);
                if (var171 != null) {
                    method236(var171, true);
                }
                if (field650 != null) {
                    method394(field650);
                    field650 = null;
                }
                field514 = -1;
                return true;
            }
            if (field514 == 188) {
                method118();
                int var172 = field528.method2491();
                int var173 = field528.method2533();
                int var174 = field528.method2516();
                field575[var174] = var173;
                field573[var174] = var172;
                field625[var174] = 1;
                for (int var175 = 0; var175 < 98; var175++) {
                    if (var173 >= class130.field2046[var175]) {
                        field625[var174] = var175 + 2;
                    }
                }
                field674[++field675 - 1 & 0x1F] = var174;
                field514 = -1;
                return true;
            }
            if (field514 == 212) {
                for (int var176 = 0; var176 < field520.length; var176++) {
                    if (field520[var176] != null) {
                        field520[var176].field448 = -1;
                    }
                }
                for (int var177 = 0; var177 < field638.length; var177++) {
                    if (field638[var177] != null) {
                        field638[var177].field448 = -1;
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 93) {
                int var178 = field528.method2493();
                int var179 = field528.method2516();
                int var180 = field528.method2668();
                class4 var181 = (class4) field647.method3348((long) var180);
                if (var181 != null) {
                    method236(var181, var181.field59 != var178);
                }
                class4 var182 = new class4();
                var182.field59 = var178;
                var182.field60 = var179;
                field647.method3349(var182, (long) var180);
                method38(var178);
                class26.method115(var178);
                class158 var183 = class158.method821(var180);
                if (var183 != null) {
                    method394(var183);
                }
                if (field650 != null) {
                    method394(field650);
                    field650 = null;
                }
                method715();
                if (field721 != -1) {
                    int var184 = field721;
                    if (class158.method2760(var184)) {
                        method2072(Statics.field2682[var184], 1);
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 140) {
                method118();
                field606 = field528.method2491();
                field679 = field669;
                field514 = -1;
                return true;
            }
            if (field514 == 252) {
                int var185 = field528.method2644();
                int var186 = field528.method2656();
                class159.field2706[var185] = var186;
                if (class159.field2705[var185] != var186) {
                    class159.field2705[var185] = var186;
                    method219(var185);
                }
                field670[++field671 - 1 & 0x1F] = var185;
                field514 = -1;
                return true;
            }
            if (field514 == 60) {
                int var187 = field528.method2668();
                int var188 = field528.method2526();
                class158 var189 = class158.method821(var187);
                if (var189.field2650 != var188 || var188 == -1) {
                    var189.field2650 = var188;
                    var189.field2691 = 0;
                    var189.field2692 = 0;
                    method394(var189);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 224) {
                Statics.field1372 = class137.method2474(field528.method2491());
                field514 = -1;
                return true;
            }
            if (field514 == 9) {
                Statics.field1860 = field528.method2516();
                Statics.field495 = field528.method2491();
                field514 = -1;
                return true;
            }
            if (field514 == 0) {
                int var190 = field528.method2644();
                field721 = var190;
                method38(var190);
                class26.method115(field721);
                for (int var191 = 0; var191 < 100; var191++) {
                    field689[var191] = true;
                }
                field514 = -1;
                return true;
            }
            if (field514 == 137) {
                method638(true);
                field514 = -1;
                return true;
            }
            if (field514 == 135) {
                for (int var192 = 0; var192 < class159.field2705.length; var192++) {
                    if (class159.field2706[var192] != class159.field2705[var192]) {
                        class159.field2705[var192] = class159.field2706[var192];
                        method219(var192);
                        field670[++field671 - 1 & 0x1F] = var192;
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 148) {
                int var193 = field528.method2491();
                int var194 = field528.method2491();
                int var195 = field528.method2491();
                int var196 = field528.method2491();
                field733[var193] = true;
                field734[var193] = var194;
                field735[var193] = var195;
                field585[var193] = var196;
                field737[var193] = 0;
                field514 = -1;
                return true;
            }
            if (field514 == 170) {
                int var197 = field528.method2533();
                int var198 = field528.method2493();
                int var199 = field528.method2493();
                int var200 = field528.method2493();
                class158 var201 = class158.method821(var197);
                if (var201.field2625 != var200 || var201.field2584 != var198 || var201.field2628 != var199) {
                    var201.field2625 = var200;
                    var201.field2584 = var198;
                    var201.field2628 = var199;
                    method394(var201);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 68) {
                int var202 = field528.method2533();
                class158 var203 = class158.method821(var202);
                var203.field2617 = 3;
                var203.field2618 = Statics.field885.field49.method3237();
                method394(var203);
                field514 = -1;
                return true;
            }
            if (field514 == 243) {
                String var204 = field528.method2500();
                Object[] var205 = new Object[var204.length() + 1];
                for (int var206 = var204.length() - 1; var206 >= 0; var206--) {
                    if (var204.charAt(var206) == 's') {
                        var205[var206 + 1] = field528.method2500();
                    } else {
                        var205[var206 + 1] = Integer.valueOf(field528.method2668());
                    }
                }
                var205[0] = Integer.valueOf(field528.method2668());
                class1 var207 = new class1();
                var207.field18 = var205;
                class26.method820(var207);
                field514 = -1;
                return true;
            }
            if (field514 == 49) {
                int var208 = field528.method2531();
                class158 var209 = class158.method821(var208);
                for (int var210 = 0; var210 < var209.field2687.length; var210++) {
                    var209.field2687[var210] = -1;
                    var209.field2687[var210] = 0;
                }
                method394(var209);
                field514 = -1;
                return true;
            }
            if (field514 == 71) {
                if (field721 != -1) {
                    int var211 = field721;
                    if (class158.method2760(var211)) {
                        method2072(Statics.field2682[var211], 0);
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 250) {
                int var212 = field528.method2668();
                int var213 = field528.method2524();
                class158 var214 = class158.method821(var212);
                if (var214.field2617 != 2 || var214.field2618 != var213) {
                    var214.field2617 = 2;
                    var214.field2618 = var213;
                    method394(var214);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 108) {
                int var215 = field528.method2656();
                int var216 = field528.method2522();
                class158 var217 = class158.method821(var215);
                if (var217.field2617 != 1 || var217.field2618 != var216) {
                    var217.field2617 = 1;
                    var217.field2618 = var216;
                    method394(var217);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 81) {
                int var218 = field528.method2522();
                class19 var219 = (class19) class19.field293.method3348((long) var218);
                if (var219 != null) {
                    var219.method3409();
                }
                field672[++field673 - 1 & 0x1F] = var218 & 0x7FFF;
                field514 = -1;
                return true;
            }
            if (field514 == 207) {
                int var220 = field528.method2493();
                if (var220 == 65535) {
                    var220 = -1;
                }
                int var221 = field528.method2656();
                int var222 = field528.method2533();
                int var223 = field528.method2644();
                if (var223 == 65535) {
                    var223 = -1;
                }
                for (int var224 = var220; var224 <= var223; var224++) {
                    long var225 = ((long) var221 << 32) + (long) var224;
                    class179 var227 = field696.method3348(var225);
                    if (var227 != null) {
                        var227.method3409();
                    }
                    field696.method3349(new class171(var222), var225);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 186) {
                byte var228 = field528.method2517();
                int var229 = field528.method2522();
                class159.field2706[var229] = var228;
                if (class159.field2705[var229] != var228) {
                    class159.field2705[var229] = var228;
                    method219(var229);
                }
                field670[++field671 - 1 & 0x1F] = var229;
                field514 = -1;
                return true;
            }
            if (field514 == 64) {
                field594 = field528.method2491();
                field637 = field528.method2491();
                field514 = -1;
                return true;
            }
            if (field514 == 128) {
                int var230 = field528.method2493();
                int var231 = field528.method2524();
                int var232 = field528.method2656();
                class158 var233 = class158.method821(var232);
                var233.field2629 = (var230 << 16) + var231;
                field514 = -1;
                return true;
            }
            if (field514 == 52) {
                field500 = field528.method2491();
                if (field500 == 1) {
                    field501 = field528.method2493();
                }
                if (field500 >= 2 && field500 <= 6) {
                    if (field500 == 2) {
                        field499 = 64;
                        field507 = 64;
                    }
                    if (field500 == 3) {
                        field499 = 0;
                        field507 = 64;
                    }
                    if (field500 == 4) {
                        field499 = 128;
                        field507 = 64;
                    }
                    if (field500 == 5) {
                        field499 = 64;
                        field507 = 0;
                    }
                    if (field500 == 6) {
                        field499 = 64;
                        field507 = 128;
                    }
                    field500 = 2;
                    field503 = field528.method2493();
                    field504 = field528.method2493();
                    field505 = field528.method2491();
                }
                if (field500 == 10) {
                    field565 = field528.method2493();
                }
                field514 = -1;
                return true;
            }
            if (field514 == 173) {
                field732 = false;
                for (int var234 = 0; var234 < 5; var234++) {
                    field733[var234] = false;
                }
                field514 = -1;
                return true;
            }
            if (field514 == 196) {
                int var235 = field528.method2522();
                int var236 = field528.method2531();
                int var237 = var235 >> 10 & 0x1F;
                int var238 = var235 >> 5 & 0x1F;
                int var239 = var235 & 0x1F;
                int var240 = (var239 << 3) + (var237 << 19) + (var238 << 11);
                class158 var241 = class158.method821(var236);
                if (var241.field2621 != var240) {
                    var241.field2621 = var240;
                    method394(var241);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 169) {
                int var242 = field528.method2660();
                int var243 = field528.method2668();
                int var244 = field528.method2660();
                class158 var245 = class158.method821(var243);
                int var246 = var245.field2582 + var242;
                int var247 = var245.field2588 + var244;
                if (var245.field2590 != var246 || var245.field2602 != var247) {
                    var245.field2590 = var246;
                    var245.field2602 = var247;
                    method394(var245);
                }
                field514 = -1;
                return true;
            }
            if (field514 == 28) {
                String var248 = field528.method2500();
                long var249 = (long) field528.method2493();
                long var251 = (long) field528.method2494();
                int var253 = field528.method2491();
                long var254 = (var249 << 32) + var251;
                boolean var256 = false;
                for (int var257 = 0; var257 < 100; var257++) {
                    if (field705[var257] == var254) {
                        var256 = true;
                        break;
                    }
                }
                if (method24(var248)) {
                    var256 = true;
                }
                if (!var256 && field605 == 0) {
                    field705[field706] = var254;
                    field706 = (field706 + 1) % 100;
                    String var258 = class185.method3511(class147.method2398(class184.method92(field528)));
                    if (var253 == 2 || var253 == 3) {
                        method11(7, Statics.method139(1) + var248, var258);
                    } else if (var253 == 1) {
                        method11(7, Statics.method139(0) + var248, var258);
                    } else {
                        method11(3, var248, var258);
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 31) {
                method169();
                field514 = -1;
                return false;
            }
            if (field514 == 198) {
                method118();
                field512 = field528.method2529();
                field679 = field669;
                field514 = -1;
                return true;
            }
            if (field514 == 242) {
                int var259 = field528.method2493();
                int var260 = field528.method2491();
                int var261 = field528.method2493();
                method103(var259, var260, var261);
                field514 = -1;
                return true;
            }
            if (field514 == 94) {
                int var262 = field528.method2533();
                int var263 = field528.method2524();
                class158 var264 = class158.method821(var262);
                if (var264 != null && var264.field2641 == 0) {
                    if (var263 > var264.field2601 - var264.field2595) {
                        var263 = var264.field2601 - var264.field2595;
                    }
                    if (var263 < 0) {
                        var263 = 0;
                    }
                    if (var264.field2599 != var263) {
                        var264.field2599 = var263;
                        method394(var264);
                    }
                }
                field514 = -1;
                return true;
            }
            if (field514 == 19) {
                boolean var265 = field528.method2491() == 1;
                int var266 = field528.method2533();
                class158 var267 = class158.method821(var266);
                if (var267.field2597 != var265) {
                    var267.field2597 = var265;
                    method394(var267);
                }
                field514 = -1;
                return true;
            }
            class80.method562("" + field514 + class2.field35 + field535 + class2.field35 + field536 + class2.field35 + field529, (Throwable) null);
            method169();
        } catch (IOException var272) {
            if (field533 > 0) {
                method169();
            } else {
                method828(40);
                Statics.field1439 = Statics.field199;
                Statics.field199 = null;
            }
        } catch (Exception var273) {
            String var270 = "" + field514 + class2.field35 + field535 + class2.field35 + field536 + class2.field35 + field529 + class2.field35 + (Statics.field1795 + Statics.field885.field453[0]) + class2.field35 + (Statics.field884 + Statics.field885.field459[0]) + class2.field35;
            for (int var271 = 0; var271 < field529 && var271 < 50; var271++) {
                var270 = var270 + field528.field2041[var271] + class2.field35;
            }
            class80.method562(var270, var273);
            method169();
        }
        return true;
    }

    @ObfuscatedName("t.av(I)V")
    public static final void method234() {
        if (field514 == 53) {
            int var0 = field528.method2648();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field526[var1];
            int var4 = field528.method2648();
            int var5 = (var4 >> 4 & 0x7) + Statics.field495;
            int var6 = (var4 & 0x7) + Statics.field1860;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                method2739(Statics.field2384, var5, var6, var3, -1, var1, var2, 0, -1);
            }
        } else if (field514 == 163) {
            int var7 = field528.method2491();
            int var8 = (var7 >> 4 & 0x7) + Statics.field495;
            int var9 = (var7 & 0x7) + Statics.field1860;
            int var10 = var8 + field528.method2492();
            int var11 = var9 + field528.method2492();
            int var12 = field528.method2529();
            int var13 = field528.method2493();
            int var14 = field528.method2491() * 4;
            int var15 = field528.method2491() * 4;
            int var16 = field528.method2493();
            int var17 = field528.method2493();
            int var18 = field528.method2491();
            int var19 = field528.method2491();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var13 != 65535) {
                int var20 = var8 * 128 + 64;
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                int var23 = var11 * 128 + 64;
                class10 var24 = new class10(var13, Statics.field2384, var20, var21, method2411(var20, var21, Statics.field2384) - var14, field491 + var16, field491 + var17, var18, var19, var12, var15);
                var24.method101(var22, var23, method2411(var22, var23, Statics.field2384) - var15, field491 + var16);
                field641.method3364(var24);
            }
        } else if (field514 == 247) {
            int var25 = field528.method2491();
            int var26 = var25 >> 2;
            int var27 = var25 & 0x3;
            int var28 = field526[var26];
            int var29 = field528.method2522();
            int var30 = field528.method2491();
            int var31 = (var30 >> 4 & 0x7) + Statics.field495;
            int var32 = (var30 & 0x7) + Statics.field1860;
            if (var31 >= 0 && var32 >= 0 && var31 < 103 && var32 < 103) {
                if (var28 == 0) {
                    class96 var33 = Statics.field1980.method1969(Statics.field2384, var31, var32);
                    if (var33 != null) {
                        int var34 = var33.field1627 >> 14 & 0x7FFF;
                        if (var26 == 2) {
                            var33.field1625 = new class14(var34, 2, var27 + 4, Statics.field2384, var31, var32, var29, false, var33.field1625);
                            var33.field1626 = new class14(var34, 2, var27 + 1 & 0x3, Statics.field2384, var31, var32, var29, false, var33.field1626);
                        } else {
                            var33.field1625 = new class14(var34, var26, var27, Statics.field2384, var31, var32, var29, false, var33.field1625);
                        }
                    }
                }
                if (var28 == 1) {
                    class108 var35 = Statics.field1980.method1919(Statics.field2384, var31, var32);
                    if (var35 != null) {
                        int var36 = var35.field1819 >> 14 & 0x7FFF;
                        if (var26 == 4 || var26 == 5) {
                            var35.field1817 = new class14(var36, 4, var27, Statics.field2384, var31, var32, var29, false, var35.field1817);
                        } else if (var26 == 6) {
                            var35.field1817 = new class14(var36, 4, var27 + 4, Statics.field2384, var31, var32, var29, false, var35.field1817);
                        } else if (var26 == 7) {
                            var35.field1817 = new class14(var36, 4, (var27 + 2 & 0x3) + 4, Statics.field2384, var31, var32, var29, false, var35.field1817);
                        } else if (var26 == 8) {
                            var35.field1817 = new class14(var36, 4, var27 + 4, Statics.field2384, var31, var32, var29, false, var35.field1817);
                            var35.field1818 = new class14(var36, 4, (var27 + 2 & 0x3) + 4, Statics.field2384, var31, var32, var29, false, var35.field1818);
                        }
                    }
                }
                if (var28 == 2) {
                    class98 var37 = Statics.field1980.method1992(Statics.field2384, var31, var32);
                    if (var26 == 11) {
                        var26 = 10;
                    }
                    if (var37 != null) {
                        var37.field1646 = new class14(var37.field1655 >> 14 & 0x7FFF, var26, var27, Statics.field2384, var31, var32, var29, false, var37.field1646);
                    }
                }
                if (var28 == 3) {
                    class107 var38 = Statics.field1980.method2010(Statics.field2384, var31, var32);
                    if (var38 != null) {
                        var38.field1803 = new class14(var38.field1809 >> 14 & 0x7FFF, 22, var27, Statics.field2384, var31, var32, var29, false, var38.field1803);
                    }
                }
            }
        } else if (field514 == 35) {
            int var39 = field528.method2491();
            int var40 = (var39 >> 4 & 0x7) + Statics.field495;
            int var41 = (var39 & 0x7) + Statics.field1860;
            int var42 = field528.method2493();
            int var43 = field528.method2493();
            int var44 = field528.method2493();
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                class177 var45 = field620[Statics.field2384][var40][var41];
                if (var45 != null) {
                    for (class17 var46 = (class17) var45.method3369(); var46 != null; var46 = (class17) var45.method3371()) {
                        if ((var42 & 0x7FFF) == var46.field267 && var46.field263 == var43) {
                            var46.field263 = var44;
                            break;
                        }
                    }
                    method172(var40, var41);
                }
            }
        } else if (field514 == 172) {
            int var47 = field528.method2644();
            int var48 = field528.method2516();
            int var49 = (var48 >> 4 & 0x7) + Statics.field495;
            int var50 = (var48 & 0x7) + Statics.field1860;
            int var51 = field528.method2522();
            int var52 = field528.method2644();
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104 && field612 != var51) {
                class17 var53 = new class17();
                var53.field267 = var47;
                var53.field263 = var52;
                if (field620[Statics.field2384][var49][var50] == null) {
                    field620[Statics.field2384][var49][var50] = new class177();
                }
                field620[Statics.field2384][var49][var50].method3364(var53);
                method172(var49, var50);
            }
        } else if (field514 == 92) {
            int var54 = field528.method2515();
            int var55 = var54 >> 2;
            int var56 = var54 & 0x3;
            int var57 = field526[var55];
            int var58 = field528.method2491();
            int var59 = (var58 >> 4 & 0x7) + Statics.field495;
            int var60 = (var58 & 0x7) + Statics.field1860;
            int var61 = field528.method2644();
            if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                method2739(Statics.field2384, var59, var60, var57, var61, var55, var56, 0, -1);
            }
        } else if (field514 == 47) {
            int var62 = field528.method2522();
            int var63 = field528.method2516();
            int var64 = (var63 >> 4 & 0x7) + Statics.field495;
            int var65 = (var63 & 0x7) + Statics.field1860;
            if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                class177 var66 = field620[Statics.field2384][var64][var65];
                if (var66 != null) {
                    for (class17 var67 = (class17) var66.method3369(); var67 != null; var67 = (class17) var66.method3371()) {
                        if ((var62 & 0x7FFF) == var67.field267) {
                            var67.method3409();
                            break;
                        }
                    }
                    if (var66.method3369() == null) {
                        field620[Statics.field2384][var64][var65] = null;
                    }
                    method172(var64, var65);
                }
            }
        } else {
            if (field514 == 202) {
                int var68 = field528.method2516();
                int var69 = (var68 >> 4 & 0x7) + Statics.field495;
                int var70 = (var68 & 0x7) + Statics.field1860;
                byte var71 = field528.method2517();
                int var72 = field528.method2493();
                byte var73 = field528.method2518();
                int var74 = field528.method2522();
                int var75 = field528.method2493();
                int var76 = field528.method2515();
                int var77 = var76 >> 2;
                int var78 = var76 & 0x3;
                int var79 = field526[var77];
                byte var80 = field528.method2492();
                int var81 = field528.method2493();
                byte var82 = field528.method2517();
                class3 var83;
                if (field612 == var75) {
                    var83 = Statics.field885;
                } else {
                    var83 = field520[var75];
                }
                if (var83 != null) {
                    class32 var84 = class32.method701(var81);
                    int var85;
                    int var86;
                    if (var78 == 1 || var78 == 3) {
                        var85 = var84.field840;
                        var86 = var84.field842;
                    } else {
                        var85 = var84.field842;
                        var86 = var84.field840;
                    }
                    int var87 = (var85 >> 1) + var69;
                    int var88 = (var85 + 1 >> 1) + var69;
                    int var89 = (var86 >> 1) + var70;
                    int var90 = (var86 + 1 >> 1) + var70;
                    int[][] var91 = class9.field136[Statics.field2384];
                    int var92 = var91[var87][var89] + var91[var88][var89] + var91[var87][var90] + var91[var88][var90] >> 2;
                    int var93 = (var69 << 7) + (var85 << 6);
                    int var94 = (var70 << 7) + (var86 << 6);
                    class112 var95 = var84.method665(var77, var78, var91, var93, var92, var94);
                    if (var95 != null) {
                        method2739(Statics.field2384, var69, var70, var79, -1, 0, 0, var74 + 1, var72 + 1);
                        var83.field43 = field491 + var74;
                        var83.field44 = field491 + var72;
                        var83.field48 = var95;
                        var83.field45 = var69 * 128 + var85 * 64;
                        var83.field37 = var70 * 128 + var86 * 64;
                        var83.field46 = var92;
                        if (var80 > var82) {
                            byte var96 = var80;
                            var80 = var82;
                            var82 = var96;
                        }
                        if (var73 > var71) {
                            byte var97 = var73;
                            var73 = var71;
                            var71 = var97;
                        }
                        var83.field53 = var69 + var80;
                        var83.field51 = var69 + var82;
                        var83.field47 = var70 + var73;
                        var83.field52 = var70 + var71;
                    }
                }
            }
            if (field514 == 221) {
                int var98 = field528.method2516();
                int var99 = (var98 >> 4 & 0x7) + Statics.field495;
                int var100 = (var98 & 0x7) + Statics.field1860;
                int var101 = field528.method2522();
                int var102 = field528.method2522();
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    class17 var103 = new class17();
                    var103.field267 = var101;
                    var103.field263 = var102;
                    if (field620[Statics.field2384][var99][var100] == null) {
                        field620[Statics.field2384][var99][var100] = new class177();
                    }
                    field620[Statics.field2384][var99][var100].method3364(var103);
                    method172(var99, var100);
                }
            } else if (field514 == 246) {
                int var104 = field528.method2491();
                int var105 = (var104 >> 4 & 0x7) + Statics.field495;
                int var106 = (var104 & 0x7) + Statics.field1860;
                int var107 = field528.method2493();
                int var108 = field528.method2491();
                int var109 = field528.method2493();
                if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                    int var110 = var105 * 128 + 64;
                    int var111 = var106 * 128 + 64;
                    class20 var112 = new class20(var107, Statics.field2384, var110, var111, method2411(var110, var111, Statics.field2384) - var108, var109, field491);
                    field623.method3364(var112);
                }
            } else if (field514 == 33) {
                int var113 = field528.method2491();
                int var114 = (var113 >> 4 & 0x7) + Statics.field495;
                int var115 = (var113 & 0x7) + Statics.field1860;
                int var116 = field528.method2493();
                int var117 = field528.method2491();
                int var118 = var117 >> 4 & 0xF;
                int var119 = var117 & 0x7;
                int var120 = field528.method2491();
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    int var121 = var118 + 1;
                    if (Statics.field885.field453[0] >= var114 - var121 && Statics.field885.field453[0] <= var114 + var121 && Statics.field885.field459[0] >= var115 - var121 && Statics.field885.field459[0] <= var115 + var121 && field496 != 0 && var119 > 0 && field726 < 50) {
                        field714[field726] = var116;
                        field728[field726] = var119;
                        field729[field726] = var120;
                        field731[field726] = null;
                        field730[field726] = (var114 << 16) + (var115 << 8) + var118;
                        field726++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dp.aa(IIIIIIIIII)V")
    public static final void method2739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field621.method3369(); var10 != null; var10 = (class22) field621.method3371()) {
            if (var10.field358 == arg0 && var10.field368 == arg1 && var10.field351 == arg2 && var10.field349 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field358 = arg0;
            var9.field349 = arg3;
            var9.field368 = arg1;
            var9.field351 = arg2;
            method148(var9);
            field621.method3364(var9);
        }
        var9.field355 = arg4;
        var9.field357 = arg5;
        var9.field364 = arg6;
        var9.field350 = arg7;
        var9.field359 = arg8;
    }

    @ObfuscatedName("g.be(I)V")
    public static final void method47() {
        for (class22 var0 = (class22) field621.method3369(); var0 != null; var0 = (class22) field621.method3371()) {
            if (var0.field359 == -1) {
                var0.field350 = 0;
                method148(var0);
            } else {
                var0.method3409();
            }
        }
    }

    @ObfuscatedName("x.bc(Lr;I)V")
    public static final void method148(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field349 == 0) {
            var1 = Statics.field1980.method1950(arg0.field358, arg0.field368, arg0.field351);
        }
        if (arg0.field349 == 1) {
            var1 = Statics.field1980.method2066(arg0.field358, arg0.field368, arg0.field351);
        }
        if (arg0.field349 == 2) {
            var1 = Statics.field1980.method1924(arg0.field358, arg0.field368, arg0.field351);
        }
        if (arg0.field349 == 3) {
            var1 = Statics.field1980.method1925(arg0.field358, arg0.field368, arg0.field351);
        }
        if (var1 != 0) {
            int var5 = Statics.field1980.method1926(arg0.field358, arg0.field368, arg0.field351, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field356 = var2;
        arg0.field354 = var3;
        arg0.field352 = var4;
    }

    @ObfuscatedName("v.br(B)V")
    public static final void method9() {
        for (class22 var0 = (class22) field621.method3369(); var0 != null; var0 = (class22) field621.method3371()) {
            if (var0.field359 > 0) {
                var0.field359--;
            }
            if (var0.field359 == 0) {
                if (var0.field356 >= 0) {
                    int var1 = var0.field356;
                    int var2 = var0.field354;
                    class32 var3 = class32.method701(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method662(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method2421(var0.field358, var0.field349, var0.field368, var0.field351, var0.field356, var0.field352, var0.field354);
                var0.method3409();
            } else {
                if (var0.field350 > 0) {
                    var0.field350--;
                }
                if (var0.field350 == 0 && var0.field368 >= 1 && var0.field351 >= 1 && var0.field368 <= 102 && var0.field351 <= 102) {
                    if (var0.field355 >= 0) {
                        int var5 = var0.field355;
                        int var6 = var0.field357;
                        class32 var7 = class32.method701(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method662(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method2421(var0.field358, var0.field349, var0.field368, var0.field351, var0.field355, var0.field364, var0.field357);
                    var0.field350 = -1;
                    if (var0.field356 == var0.field355 && var0.field356 == -1) {
                        var0.method3409();
                    } else if (var0.field356 == var0.field355 && var0.field364 == var0.field352 && var0.field357 == var0.field354) {
                        var0.method3409();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.bw(IIIIIIII)V")
    public static final void method2421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field486 && Statics.field2384 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1980.method1950(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1980.method2066(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1980.method1924(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1980.method1925(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1980.method1926(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1980.method2065(arg0, arg2, arg3);
                class32 var15 = class32.method701(var12);
                if (var15.field861 != 0) {
                    field544[arg0].method3269(arg2, arg3, var13, var14, var15.field859);
                }
            }
            if (arg1 == 1) {
                Statics.field1980.method1914(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1980.method1909(arg0, arg2, arg3);
                class32 var16 = class32.method701(var12);
                if (var16.field842 + arg2 > 103 || var16.field842 + arg3 > 103 || var16.field840 + arg2 > 103 || var16.field840 + arg3 > 103) {
                    return;
                }
                if (var16.field861 != 0) {
                    field544[arg0].method3266(arg2, arg3, var16.field842, var16.field840, var14, var16.field859);
                }
            }
            if (arg1 == 3) {
                Statics.field1980.method1963(arg0, arg2, arg3);
                class32 var17 = class32.method701(var12);
                if (var17.field861 == 1) {
                    field544[arg0].method3268(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field140[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class9.method146(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1980, field544[arg0]);
    }

    @ObfuscatedName("n.bj(IIB)V")
    public static final void method172(int arg0, int arg1) {
        class177 var2 = field620[Statics.field2384][arg0][arg1];
        if (var2 == null) {
            Statics.field1980.method1913(Statics.field2384, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3369(); var5 != null; var5 = (class17) var2.method3371()) {
            class40 var6 = class40.method259(var5.field267);
            int var7 = var6.field1002;
            if (var6.field1001 == 1) {
                var7 = (var5.field263 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field1980.method1913(Statics.field2384, arg0, arg1);
            return;
        }
        var2.method3365(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3369(); var10 != null; var10 = (class17) var2.method3371()) {
            if (var4.field267 != var10.field267) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field267 != var10.field267 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1980.method1983(Statics.field2384, arg0, arg1, method2411(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2384), var4, var11, var8, var9);
    }

    @ObfuscatedName("u.bs(B)V")
    public static final void method224() {
        int var0 = field528.method2355(8);
        if (var0 < field607) {
            for (int var1 = var0; var1 < field607; var1++) {
                field615[++field614 - 1] = field522[var1];
            }
        }
        if (var0 > field607) {
            throw new RuntimeException("");
        }
        field607 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field522[var2];
            class3 var4 = field520[var3];
            int var5 = field528.method2355(1);
            if (var5 == 0) {
                field522[++field607 - 1] = var3;
                var4.field465 = field491;
            } else {
                int var6 = field528.method2355(2);
                if (var6 == 0) {
                    field522[++field607 - 1] = var3;
                    var4.field465 = field491;
                    field668[++field609 - 1] = var3;
                } else if (var6 == 1) {
                    field522[++field607 - 1] = var3;
                    var4.field465 = field491;
                    int var7 = field528.method2355(3);
                    var4.method245(var7, false);
                    int var8 = field528.method2355(1);
                    if (var8 == 1) {
                        field668[++field609 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field522[++field607 - 1] = var3;
                    var4.field465 = field491;
                    int var9 = field528.method2355(3);
                    var4.method245(var9, true);
                    int var10 = field528.method2355(3);
                    var4.method245(var10, true);
                    int var11 = field528.method2355(1);
                    if (var11 == 1) {
                        field668[++field609 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field615[++field614 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("d.bi(ILm;II)V")
    public static final void method121(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x200) != 0) {
            int var3 = field528.method2515();
            int var4 = field528.method2648();
            arg1.method249(var3, var4, field491);
            arg1.field424 = field491 + 300;
            arg1.field440 = field528.method2648();
            arg1.field441 = field528.method2648();
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field455 = field528.method2522();
            int var5 = field528.method2668();
            arg1.field457 = var5 >> 16;
            arg1.field456 = (var5 & 0xFFFF) + field491;
            arg1.field468 = 0;
            arg1.field450 = 0;
            if (arg1.field456 > field491) {
                arg1.field468 = -1;
            }
            if (arg1.field455 == 65535) {
                arg1.field455 = -1;
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field442 = field528.method2644();
            if (arg1.field442 == 65535) {
                arg1.field442 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var6 = field528.method2493();
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = field528.method2648();
            Statics.method838(arg1, var6, var7);
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field432 = field528.method2500();
            if (arg1.field432.charAt(0) == '~') {
                arg1.field432 = arg1.field432.substring(1);
                method11(2, arg1.field58, arg1.field432);
            } else if (Statics.field885 == arg1) {
                method11(2, arg1.field58, arg1.field432);
            }
            arg1.field430 = 0;
            arg1.field467 = 0;
            arg1.field427 = 150;
        }
        if ((arg2 & 0x80) != 0) {
            int var8 = field528.method2515();
            byte[] var9 = new byte[var8];
            class127 var10 = new class127(var9);
            field528.method2575(var9, 0, var8);
            field611[arg0] = var10;
            arg1.method19(var10);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field439 = field528.method2522();
            arg1.field444 = field528.method2524();
        }
        if ((arg2 & 0x1) != 0) {
            int var11 = field528.method2516();
            int var12 = field528.method2648();
            arg1.method249(var11, var12, field491);
            arg1.field424 = field491 + 300;
            arg1.field440 = field528.method2491();
            arg1.field441 = field528.method2516();
        }
        if ((arg2 & 0x10) != 0) {
            int var13 = field528.method2524();
            int var14 = field528.method2515();
            int var15 = field528.method2515();
            int var16 = field528.field2039;
            if (arg1.field58 != null && arg1.field49 != null) {
                boolean var17 = false;
                if (var14 <= 1 && method24(arg1.field58)) {
                    var17 = true;
                }
                if (!var17 && field605 == 0) {
                    field490.field2039 = 0;
                    field528.method2561(field490.field2041, 0, var15);
                    field490.field2039 = 0;
                    String var18 = class185.method3511(class147.method2398(class184.method92(field490)));
                    arg1.field432 = var18.trim();
                    arg1.field430 = var13 >> 8;
                    arg1.field467 = var13 & 0xFF;
                    arg1.field427 = 150;
                    if (var14 == 2 || var14 == 3) {
                        method11(1, Statics.method139(1) + arg1.field58, var18);
                    } else if (var14 == 1) {
                        method11(1, Statics.method139(0) + arg1.field58, var18);
                    } else {
                        method11(2, arg1.field58, var18);
                    }
                }
            }
            field528.field2039 = var15 + var16;
        }
        if ((arg2 & 0x400) == 0) {
            return;
        }
        arg1.field458 = field528.method2516();
        arg1.field460 = field528.method2515();
        arg1.field437 = field528.method2515();
        arg1.field461 = field528.method2648();
        arg1.field462 = field528.method2644() + field491;
        arg1.field435 = field528.method2524() + field491;
        arg1.field472 = field528.method2648();
        arg1.field466 = 1;
        arg1.field475 = 0;
    }

    @ObfuscatedName("cc.bb(I)V")
    public static final void method2167() {
        field614 = 0;
        field609 = 0;
        method1619();
        while (field528.method2357(field529) >= 27) {
            int var0 = field528.method2355(15);
            if (var0 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field638[var0] == null) {
                field638[var0] = new class25();
                var16 = true;
            }
            class25 var17 = field638[var0];
            field617[++field743 - 1] = var0;
            var17.field465 = field491;
            var17.field401 = class31.method2076(field528.method2355(14));
            int var18 = field528.method2355(5);
            if (var18 > 15) {
                var18 -= 32;
            }
            int var19 = field528.method2355(5);
            if (var19 > 15) {
                var19 -= 32;
            }
            int var20 = field619[field528.method2355(3)];
            if (var16) {
                var17.field454 = var17.field419 = var20;
            }
            int var21 = field528.method2355(1);
            int var22 = field528.method2355(1);
            if (var22 == 1) {
                field668[++field609 - 1] = var0;
            }
            var17.field423 = var17.field401.field789;
            var17.field464 = var17.field401.field812;
            if (var17.field464 == 0) {
                var17.field419 = 0;
            }
            var17.field434 = var17.field401.field795;
            var17.field428 = var17.field401.field796;
            var17.field429 = var17.field401.field797;
            var17.field436 = var17.field401.field798;
            var17.field443 = var17.field401.field792;
            var17.field425 = var17.field401.field793;
            var17.field426 = var17.field401.field803;
            var17.method251(Statics.field885.field453[0] + var19, Statics.field885.field459[0] + var18, var21 == 1);
        }
        field528.method2356();
        for (int var1 = 0; var1 < field609; var1++) {
            int var2 = field668[var1];
            class25 var3 = field638[var2];
            int var4 = field528.method2491();
            if ((var4 & 0x1) != 0) {
                var3.field432 = field528.method2500();
                var3.field427 = 100;
            }
            if ((var4 & 0x80) != 0) {
                var3.field439 = field528.method2524();
                var3.field444 = field528.method2522();
            }
            if ((var4 & 0x2) != 0) {
                int var5 = field528.method2648();
                int var6 = field528.method2515();
                var3.method249(var5, var6, field491);
                var3.field424 = field491 + 300;
                var3.field440 = field528.method2515();
                var3.field441 = field528.method2516();
            }
            if ((var4 & 0x10) != 0) {
                int var7 = field528.method2644();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field528.method2515();
                if (var3.field448 == var7 && var7 != -1) {
                    int var9 = class34.method1443(var7).field911;
                    if (var9 == 1) {
                        var3.field449 = 0;
                        var3.field469 = 0;
                        var3.field451 = var8;
                        var3.field452 = 0;
                    }
                    if (var9 == 2) {
                        var3.field452 = 0;
                    }
                } else if (var7 == -1 || var3.field448 == -1 || class34.method1443(var7).field894 >= class34.method1443(var3.field448).field894) {
                    var3.field448 = var7;
                    var3.field449 = 0;
                    var3.field469 = 0;
                    var3.field451 = var8;
                    var3.field452 = 0;
                    var3.field475 = var3.field466;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var10 = field528.method2515();
                int var11 = field528.method2491();
                var3.method249(var10, var11, field491);
                var3.field424 = field491 + 300;
                var3.field440 = field528.method2491();
                var3.field441 = field528.method2516();
            }
            if ((var4 & 0x20) != 0) {
                var3.field401 = class31.method2076(field528.method2493());
                var3.field423 = var3.field401.field789;
                var3.field464 = var3.field401.field812;
                var3.field434 = var3.field401.field795;
                var3.field428 = var3.field401.field796;
                var3.field429 = var3.field401.field797;
                var3.field436 = var3.field401.field798;
                var3.field443 = var3.field401.field792;
                var3.field425 = var3.field401.field793;
                var3.field426 = var3.field401.field803;
            }
            if ((var4 & 0x4) != 0) {
                var3.field442 = field528.method2522();
                if (var3.field442 == 65535) {
                    var3.field442 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field455 = field528.method2522();
                int var12 = field528.method2656();
                var3.field457 = var12 >> 16;
                var3.field456 = (var12 & 0xFFFF) + field491;
                var3.field468 = 0;
                var3.field450 = 0;
                if (var3.field456 > field491) {
                    var3.field468 = -1;
                }
                if (var3.field455 == 65535) {
                    var3.field455 = -1;
                }
            }
        }
        for (int var13 = 0; var13 < field614; var13++) {
            int var14 = field615[var13];
            if (field491 != field638[var14].field465) {
                field638[var14].field401 = null;
                field638[var14] = null;
            }
        }
        if (field529 != field528.field2039) {
            throw new RuntimeException(field528.field2039 + class2.field35 + field529);
        }
        for (int var15 = 0; var15 < field743; var15++) {
            if (field638[field617[var15]] == null) {
                throw new RuntimeException(var15 + class2.field35 + field743);
            }
        }
    }

    @ObfuscatedName("cs.bk(I)V")
    public static final void method1619() {
        field528.method2354();
        int var0 = field528.method2355(8);
        if (var0 < field743) {
            for (int var1 = var0; var1 < field743; var1++) {
                field615[++field614 - 1] = field617[var1];
            }
        }
        if (var0 > field743) {
            throw new RuntimeException("");
        }
        field743 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field617[var2];
            class25 var4 = field638[var3];
            int var5 = field528.method2355(1);
            if (var5 == 0) {
                field617[++field743 - 1] = var3;
                var4.field465 = field491;
            } else {
                int var6 = field528.method2355(2);
                if (var6 == 0) {
                    field617[++field743 - 1] = var3;
                    var4.field465 = field491;
                    field668[++field609 - 1] = var3;
                } else if (var6 == 1) {
                    field617[++field743 - 1] = var3;
                    var4.field465 = field491;
                    int var7 = field528.method2355(3);
                    var4.method245(var7, false);
                    int var8 = field528.method2355(1);
                    if (var8 == 1) {
                        field668[++field609 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field617[++field743 - 1] = var3;
                    var4.field465 = field491;
                    int var9 = field528.method2355(3);
                    var4.method245(var9, true);
                    int var10 = field528.method2355(3);
                    var4.method245(var10, true);
                    int var11 = field528.method2355(1);
                    if (var11 == 1) {
                        field668[++field609 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field615[++field614 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ey.bm(IIIII)V")
    public static final void method2755(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field736; var4++) {
            if (field694[var4] + field692[var4] > arg0 && field692[var4] < arg0 + arg2 && field695[var4] + field693[var4] > arg1 && field693[var4] < arg1 + arg3) {
                field689[var4] = true;
            }
        }
    }

    @ObfuscatedName("ar.bd(IIIII)V")
    public static final void method567(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field736; var4++) {
            if (field694[var4] + field692[var4] > arg0 && field692[var4] < arg0 + arg2 && field695[var4] + field693[var4] > arg1 && field693[var4] < arg1 + arg3) {
                field690[var4] = true;
            }
        }
    }

    @ObfuscatedName("h.bx(I)V")
    public static final void method143() {
        if (Statics.field1823 != null || field657 != null) {
            return;
        }
        int var0 = class77.field1398;
        if (field628) {
            if (var0 != 1) {
                int var1 = class77.field1392;
                int var2 = class77.field1393;
                if (var1 < Statics.field860 - 10 || var1 > Statics.field957 + Statics.field860 + 10 || var2 < Statics.field2071 - 10 || var2 > Statics.field2071 + Statics.field1995 + 10) {
                    field628 = false;
                    method2755(Statics.field860, Statics.field2071, Statics.field957, Statics.field1995);
                }
            }
            if (var0 == 1) {
                int var3 = Statics.field860;
                int var4 = Statics.field2071;
                int var5 = Statics.field957;
                int var6 = class77.field1399;
                int var7 = class77.field1387;
                int var8 = -1;
                for (int var9 = 0; var9 < field629; var9++) {
                    int var10 = (field629 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method165(var8);
                }
                field628 = false;
                method2755(Statics.field860, Statics.field2071, Statics.field957, Statics.field1995);
            }
            return;
        }
        if (var0 == 1 && field629 > 0) {
            int var11 = field632[field629 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                label154: {
                    int var12 = field630[field629 - 1];
                    int var13 = field631[field629 - 1];
                    class158 var14 = class158.method821(var13);
                    int var15 = method2374(var14);
                    boolean var16 = (var15 >> 28 & 0x1) != 0;
                    if (!var16) {
                        class162 var10000 = (class162) null;
                        if (!class162.method2959(method2374(var14))) {
                            break label154;
                        }
                    }
                    field603 = false;
                    field646 = 0;
                    if (Statics.field1823 != null) {
                        method394(Statics.field1823);
                    }
                    Statics.field1823 = class158.method821(var13);
                    field635 = var12;
                    field600 = class77.field1399;
                    field601 = class77.field1387;
                    method394(Statics.field1823);
                    return;
                }
            }
        }
        if (var0 == 1 && (field627 == 1 && field629 > 2 || method133(field629 - 1))) {
            var0 = 2;
        }
        if (var0 == 1 && field629 > 0) {
            method165(field629 - 1);
        }
        if (var0 == 2 && field629 > 0) {
            method241();
        }
    }

    @ObfuscatedName("s.bl(I)V")
    public static final void method241() {
        int var0 = Statics.field1273.method3468(class134.field2227);
        for (int var1 = 0; var1 < field629; var1++) {
            int var2 = Statics.field1273.method3468(method122(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field629 * 15 + 21;
        int var4 = class77.field1399 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1387;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field628 = true;
        Statics.field860 = var4;
        Statics.field2071 = var5;
        Statics.field957 = var0;
        Statics.field1995 = field629 * 15 + 22;
    }

    @ObfuscatedName("k.bq(II)Z")
    public static final boolean method133(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field632[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("b.ba(IS)V")
    public static final void method165(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field630[arg0];
        int var2 = field631[arg0];
        int var3 = field632[arg0];
        int var4 = field633[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 49) {
            class3 var5 = field520[var4];
            if (var5 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var5.field453[0], var5.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(86);
                field540.method2694(var4);
            }
        }
        if (var3 == 11) {
            class25 var6 = field638[var4];
            if (var6 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var6.field453[0], var6.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(109);
                field540.method2694(var4);
            }
        }
        if (var3 == 47) {
            class3 var7 = field520[var4];
            if (var7 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var7.field453[0], var7.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(172);
                field540.method2520(var4);
            }
        }
        if (var3 == 1001) {
            method3228(var1, var2, var4);
            field540.method2352(227);
            field540.method2537(Statics.field1795 + var1);
            field540.method2537(var4 >> 14 & 0x7FFF);
            field540.method2694(Statics.field884 + var2);
        }
        if (var3 == 31) {
            field540.method2352(150);
            field540.method2520(Statics.field802);
            field540.method2694(Statics.field57);
            field540.method2528(Statics.field85);
            field540.method2548(var2);
            field540.method2537(var1);
            field540.method2537(var4);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 1004) {
            field593 = class77.field1399;
            field506 = class77.field1387;
            field596 = 2;
            field547 = 0;
            field540.method2352(102);
            field540.method2694(var4);
        }
        if (var3 == 45) {
            class3 var8 = field520[var4];
            if (var8 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var8.field453[0], var8.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(9);
                field540.method2537(var4);
            }
        }
        if (var3 == 35) {
            field540.method2352(34);
            field540.method2548(var2);
            field540.method2520(var1);
            field540.method2519(var4);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 4) {
            method3228(var1, var2, var4);
            field540.method2352(240);
            field540.method2537(Statics.field1795 + var1);
            field540.method2519(var4 >> 14 & 0x7FFF);
            field540.method2694(Statics.field884 + var2);
        }
        if (var3 == 3) {
            method3228(var1, var2, var4);
            field540.method2352(72);
            field540.method2520(var4 >> 14 & 0x7FFF);
            field540.method2520(Statics.field884 + var2);
            field540.method2519(Statics.field1795 + var1);
        }
        if (var3 == 12) {
            class25 var9 = field638[var4];
            if (var9 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var9.field453[0], var9.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(184);
                field540.method2519(var4);
            }
        }
        if (var3 == 14) {
            class3 var10 = field520[var4];
            if (var10 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var10.field453[0], var10.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(157);
                field540.method2537(Statics.field57);
                field540.method2519(var4);
                field540.method2548(Statics.field85);
                field540.method2519(Statics.field802);
            }
        }
        if (var3 == 16) {
            boolean var11 = method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var11) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field593 = class77.field1399;
            field506 = class77.field1387;
            field596 = 2;
            field547 = 0;
            field540.method2352(141);
            field540.method2520(Statics.field1795 + var1);
            field540.method2520(Statics.field884 + var2);
            field540.method2537(Statics.field57);
            field540.method2694(Statics.field802);
            field540.method2528(Statics.field85);
            field540.method2519(var4);
        }
        if (var3 == 18) {
            boolean var13 = method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var13) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field593 = class77.field1399;
            field506 = class77.field1387;
            field596 = 2;
            field547 = 0;
            field540.method2352(251);
            field540.method2520(Statics.field1795 + var1);
            field540.method2519(Statics.field884 + var2);
            field540.method2520(var4);
        }
        if (var3 == 20) {
            boolean var15 = method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var15) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field593 = class77.field1399;
            field506 = class77.field1387;
            field596 = 2;
            field547 = 0;
            field540.method2352(81);
            field540.method2520(Statics.field1795 + var1);
            field540.method2537(var4);
            field540.method2519(Statics.field884 + var2);
        }
        if (var3 == 8) {
            class25 var17 = field638[var4];
            if (var17 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var17.field453[0], var17.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(52);
                field540.method2520(field643);
                field540.method2520(var4);
                field540.method2670(Statics.field155);
            }
        }
        if (var3 == 1002) {
            field593 = class77.field1399;
            field506 = class77.field1387;
            field596 = 2;
            field547 = 0;
            field540.method2352(117);
            field540.method2520(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 24) {
            class158 var18 = class158.method821(var2);
            boolean var19 = true;
            if (var18.field2589 > 0) {
                var19 = method848(var18);
            }
            if (var19) {
                field540.method2352(127);
                field540.method2480(var2);
            }
        }
        if (var3 == 51) {
            class3 var20 = field520[var4];
            if (var20 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var20.field453[0], var20.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(35);
                field540.method2537(var4);
            }
        }
        if (var3 == 42) {
            field540.method2352(164);
            field540.method2670(var2);
            field540.method2694(var1);
            field540.method2520(var4);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 10) {
            class25 var21 = field638[var4];
            if (var21 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var21.field453[0], var21.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(1);
                field540.method2694(var4);
            }
        }
        if (var3 == 1 && method3228(var1, var2, var4)) {
            field540.method2352(242);
            field540.method2537(Statics.field884 + var2);
            field540.method2520(Statics.field1795 + var1);
            field540.method2694(Statics.field802);
            field540.method2520(Statics.field57);
            field540.method2528(Statics.field85);
            field540.method2519(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 19) {
            boolean var22 = method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var22) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field593 = class77.field1399;
            field506 = class77.field1387;
            field596 = 2;
            field547 = 0;
            field540.method2352(111);
            field540.method2694(Statics.field884 + var2);
            field540.method2537(Statics.field1795 + var1);
            field540.method2519(var4);
        }
        if (var3 == 44) {
            class3 var24 = field520[var4];
            if (var24 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var24.field453[0], var24.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(220);
                field540.method2537(var4);
            }
        }
        if (var3 == 7) {
            class25 var25 = field638[var4];
            if (var25 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var25.field453[0], var25.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(59);
                field540.method2480(Statics.field85);
                field540.method2537(var4);
                field540.method2519(Statics.field57);
                field540.method2537(Statics.field802);
            }
        }
        if (var3 == 25) {
            class158 var26 = class158.method2241(var2, var1);
            if (var26 != null) {
                method1445();
                int var27 = method2374(var26);
                int var28 = var27 >> 11 & 0x3F;
                class158 var30 = class158.method2241(var2, var1);
                if (var30 != null && var30.field2663 != null) {
                    class1 var31 = new class1();
                    var31.field2 = var30;
                    var31.field18 = var30.field2663;
                    class26.method820(var31);
                }
                field642 = true;
                Statics.field155 = var2;
                field643 = var1;
                Statics.field29 = var28;
                method394(var30);
                field640 = 0;
                int var32 = method2374(var26);
                int var33 = var32 >> 11 & 0x3F;
                String var34;
                if (var33 == 0) {
                    var34 = null;
                } else if (var26.field2651 == null || var26.field2651.trim().length() == 0) {
                    var34 = null;
                } else {
                    var34 = var26.field2651;
                }
                field598 = var34;
                if (field598 == null) {
                    field598 = "Null";
                }
                if (var26.field2626) {
                    field645 = var26.field2627 + class2.method149(16777215);
                } else {
                    field645 = class2.method149(65280) + var26.field2693 + class2.method149(16777215);
                }
            }
            return;
        }
        if (var3 == 43) {
            field540.method2352(193);
            field540.method2670(var2);
            field540.method2694(var1);
            field540.method2519(var4);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 1005) {
            class158 var35 = class158.method821(var2);
            if (var35 == null || var35.field2688[var1] < 100000) {
                field540.method2352(102);
                field540.method2694(var4);
            } else {
                method11(0, "", var35.field2688[var1] + " x " + class40.method259(var4).field990);
            }
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 6) {
            method3228(var1, var2, var4);
            field540.method2352(37);
            field540.method2520(Statics.field884 + var2);
            field540.method2520(Statics.field1795 + var1);
            field540.method2520(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 41) {
            field540.method2352(129);
            field540.method2528(var2);
            field540.method2694(var1);
            field540.method2520(var4);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 58) {
            field540.method2352(209);
            field540.method2670(var2);
            field540.method2670(Statics.field155);
            field540.method2519(var1);
            field540.method2520(field643);
        }
        if (var3 == 33) {
            field540.method2352(120);
            field540.method2537(var4);
            field540.method2480(var2);
            field540.method2519(var1);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 57 || var3 == 1007) {
            String var36 = field716[arg0];
            class158 var37 = class158.method2241(var2, var1);
            if (var37 != null) {
                if (var37.field2672 != null) {
                    class1 var38 = new class1();
                    var38.field2 = var37;
                    var38.field16 = var4;
                    var38.field9 = var36;
                    var38.field18 = var37.field2672;
                    class26.method820(var38);
                }
                boolean var39 = true;
                if (var37.field2589 > 0) {
                    var39 = method848(var37);
                }
                if (var39) {
                    int var40 = method2374(var37);
                    int var41 = var4 - 1;
                    boolean var42 = (var40 >> var41 + 1 & 0x1) != 0;
                    if (var42) {
                        if (var4 == 1) {
                            field540.method2352(213);
                            field540.method2480(var2);
                            field540.method2694(var1);
                        }
                        if (var4 == 2) {
                            field540.method2352(246);
                            field540.method2480(var2);
                            field540.method2694(var1);
                        }
                        if (var4 == 3) {
                            field540.method2352(6);
                            field540.method2480(var2);
                            field540.method2694(var1);
                        }
                        if (var4 == 4) {
                            field540.method2352(171);
                            field540.method2480(var2);
                            field540.method2694(var1);
                        }
                        if (var4 == 5) {
                            field540.method2352(201);
                            field540.method2480(var2);
                            field540.method2694(var1);
                        }
                        if (var4 == 6) {
                            field540.method2352(241);
                            field540.method2480(var2);
                            field540.method2694(var1);
                        }
                        if (var4 == 7) {
                            field540.method2352(113);
                            field540.method2480(var2);
                            field540.method2694(var1);
                        }
                        if (var4 == 8) {
                            field540.method2352(96);
                            field540.method2480(var2);
                            field540.method2694(var1);
                        }
                        if (var4 == 9) {
                            field540.method2352(118);
                            field540.method2480(var2);
                            field540.method2694(var1);
                        }
                        if (var4 == 10) {
                            field540.method2352(119);
                            field540.method2480(var2);
                            field540.method2694(var1);
                        }
                    }
                }
            }
        }
        if (var3 == 37) {
            field540.method2352(147);
            field540.method2520(var4);
            field540.method2528(var2);
            field540.method2537(var1);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 50) {
            class3 var43 = field520[var4];
            if (var43 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var43.field453[0], var43.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(144);
                field540.method2694(var4);
            }
        }
        if (var3 == 30 && field650 == null) {
            field540.method2352(130);
            field540.method2670(var2);
            field540.method2694(var1);
            field650 = class158.method2241(var2, var1);
            method394(field650);
        }
        if (var3 == 13) {
            class25 var44 = field638[var4];
            if (var44 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var44.field453[0], var44.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(243);
                field540.method2519(var4);
            }
        }
        if (var3 == 40) {
            field540.method2352(234);
            field540.method2537(var1);
            field540.method2480(var2);
            field540.method2694(var4);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 1003) {
            field593 = class77.field1399;
            field506 = class77.field1387;
            field596 = 2;
            field547 = 0;
            class25 var45 = field638[var4];
            if (var45 != null) {
                class31 var46 = var45.field401;
                if (var46.field813 != null) {
                    var46 = var46.method622();
                }
                if (var46 != null) {
                    field540.method2352(230);
                    field540.method2537(var46.field785);
                }
            }
        }
        if (var3 == 46) {
            class3 var47 = field520[var4];
            if (var47 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var47.field453[0], var47.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(107);
                field540.method2537(var4);
            }
        }
        if (var3 == 26) {
            method213();
        }
        if (var3 == 2 && method3228(var1, var2, var4)) {
            field540.method2352(181);
            field540.method2537(Statics.field1795 + var1);
            field540.method2537(Statics.field884 + var2);
            field540.method2537(field643);
            field540.method2548(Statics.field155);
            field540.method2519(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 32) {
            field540.method2352(50);
            field540.method2480(Statics.field155);
            field540.method2520(var1);
            field540.method2519(field643);
            field540.method2548(var2);
            field540.method2519(var4);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 9) {
            class25 var48 = field638[var4];
            if (var48 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var48.field453[0], var48.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(225);
                field540.method2694(var4);
            }
        }
        if (var3 == 21) {
            boolean var49 = method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var49) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field593 = class77.field1399;
            field506 = class77.field1387;
            field596 = 2;
            field547 = 0;
            field540.method2352(252);
            field540.method2519(Statics.field884 + var2);
            field540.method2694(Statics.field1795 + var1);
            field540.method2520(var4);
        }
        if (var3 == 22) {
            boolean var51 = method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var51) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field593 = class77.field1399;
            field506 = class77.field1387;
            field596 = 2;
            field547 = 0;
            field540.method2352(202);
            field540.method2537(Statics.field1795 + var1);
            field540.method2694(Statics.field884 + var2);
            field540.method2694(var4);
        }
        if (var3 == 23) {
            Statics.field1980.method1933(Statics.field2384, var1, var2);
        }
        if (var3 == 38) {
            method1445();
            class158 var53 = class158.method821(var2);
            field640 = 1;
            Statics.field802 = var1;
            Statics.field85 = var2;
            Statics.field57 = var4;
            method394(var53);
            field508 = class2.method149(16748608) + class40.method259(var4).field990 + class2.method149(16777215);
            if (field508 == null) {
                field508 = "null";
            }
            return;
        }
        if (var3 == 29) {
            field540.method2352(127);
            field540.method2480(var2);
            class158 var54 = class158.method821(var2);
            if (var54.field2697 != null && var54.field2697[0][0] == 5) {
                int var55 = var54.field2697[0][1];
                if (class159.field2705[var55] != var54.field2683[0]) {
                    class159.field2705[var55] = var54.field2683[0];
                    method219(var55);
                }
            }
        }
        if (var3 == 39) {
            field540.method2352(166);
            field540.method2670(var2);
            field540.method2694(var4);
            field540.method2519(var1);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 48) {
            class3 var56 = field520[var4];
            if (var56 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var56.field453[0], var56.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(87);
                field540.method2537(var4);
            }
        }
        if (var3 == 36) {
            field540.method2352(135);
            field540.method2537(var1);
            field540.method2537(var4);
            field540.method2480(var2);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 15) {
            class3 var57 = field520[var4];
            if (var57 != null) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var57.field453[0], var57.field459[0], false, 0, 0, 1, 1, 0, 2);
                field593 = class77.field1399;
                field506 = class77.field1387;
                field596 = 2;
                field547 = 0;
                field540.method2352(248);
                field540.method2537(field643);
                field540.method2528(Statics.field155);
                field540.method2519(var4);
            }
        }
        if (var3 == 17) {
            boolean var58 = method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var58) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field593 = class77.field1399;
            field506 = class77.field1387;
            field596 = 2;
            field547 = 0;
            field540.method2352(137);
            field540.method2537(var4);
            field540.method2537(Statics.field1795 + var1);
            field540.method2694(field643);
            field540.method2694(Statics.field884 + var2);
            field540.method2548(Statics.field155);
        }
        if (var3 == 34) {
            field540.method2352(100);
            field540.method2670(var2);
            field540.method2537(var1);
            field540.method2520(var4);
            field659 = 0;
            Statics.field1831 = class158.method821(var2);
            field644 = var1;
        }
        if (var3 == 28) {
            field540.method2352(127);
            field540.method2480(var2);
            class158 var60 = class158.method821(var2);
            if (var60.field2697 != null && var60.field2697[0][0] == 5) {
                int var61 = var60.field2697[0][1];
                class159.field2705[var61] = 1 - class159.field2705[var61];
                method219(var61);
            }
        }
        if (var3 == 5) {
            method3228(var1, var2, var4);
            field540.method2352(24);
            field540.method2519(Statics.field884 + var2);
            field540.method2519(Statics.field1795 + var1);
            field540.method2520(var4 >> 14 & 0x7FFF);
        }
        if (field640 != 0) {
            field640 = 0;
            method394(class158.method821(Statics.field85));
        }
        if (field642) {
            method1445();
        }
        if (Statics.field1831 != null && field659 == 0) {
            method394(Statics.field1831);
        }
    }

    @ObfuscatedName("client.bf(ILjava/lang/String;B)V")
    public static void method261(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field607; var3++) {
            class3 var4 = field520[field522[var3]];
            if (var4 != null && var4.field58 != null && var4.field58.equalsIgnoreCase(arg1)) {
                method1886(Statics.field885.field453[0], Statics.field885.field459[0], var4.field453[0], var4.field459[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field540.method2352(220);
                    field540.method2537(field522[var3]);
                } else if (arg0 == 4) {
                    field540.method2352(172);
                    field540.method2520(field522[var3]);
                } else if (arg0 == 6) {
                    field540.method2352(86);
                    field540.method2694(field522[var3]);
                } else if (arg0 == 7) {
                    field540.method2352(144);
                    field540.method2694(field522[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method11(0, "", class134.field2267 + arg1);
        }
    }

    @ObfuscatedName("bp.bg(B)V")
    public static void method1445() {
        if (!field642) {
            return;
        }
        class158 var0 = class158.method2241(Statics.field155, field643);
        if (var0 != null && var0.field2664 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field18 = var0.field2664;
            class26.method820(var1);
        }
        field642 = false;
        method394(var0);
    }

    @ObfuscatedName("q.bu(B)V")
    public static final void method183() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field629 - 1; var1++) {
                if (field632[var1] < 1000 && field632[var1 + 1] > 1000) {
                    String var2 = field716[var1];
                    field716[var1] = field716[var1 + 1];
                    field716[var1 + 1] = var2;
                    String var3 = field610[var1];
                    field610[var1] = field610[var1 + 1];
                    field610[var1 + 1] = var3;
                    int var4 = field632[var1];
                    field632[var1] = field632[var1 + 1];
                    field632[var1 + 1] = var4;
                    int var5 = field630[var1];
                    field630[var1] = field630[var1 + 1];
                    field630[var1 + 1] = var5;
                    int var6 = field631[var1];
                    field631[var1] = field631[var1 + 1];
                    field631[var1 + 1] = var6;
                    int var7 = field633[var1];
                    field633[var1] = field633[var1 + 1];
                    field633[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("v.bt(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method8(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field628 || field629 >= 500) {
            return;
        }
        field610[field629] = arg0;
        field716[field629] = arg1;
        field632[field629] = arg2;
        field633[field629] = arg3;
        field630[field629] = arg4;
        field631[field629] = arg5;
        field629++;
    }

    @ObfuscatedName("am.bp(I)V")
    public static void method715() {
        for (int var0 = 0; var0 < field629 - 1; var0++) {
            int var1 = field632[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                for (int var3 = var0; var3 < field629 - 1; var3++) {
                    field610[var3] = field610[var3 + 1];
                    field716[var3] = field716[var3 + 1];
                    field632[var3] = field632[var3 + 1];
                    field633[var3] = field633[var3 + 1];
                    field630[var3] = field630[var3 + 1];
                    field631[var3] = field631[var3 + 1];
                }
                field629--;
            }
        }
    }

    @ObfuscatedName("e.bz(IS)Ljava/lang/String;")
    public static String method122(int arg0) {
        return field716[arg0].length() > 0 ? field610[arg0] + class134.field2234 + field716[arg0] : field610[arg0];
    }

    @ObfuscatedName("bt.by(IIIII)V")
    public static final void method1436(int arg0, int arg1, int arg2, int arg3) {
        if (field640 == 0 && !field642) {
            method8(class134.field2229, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class112.field1921; var5++) {
            int var6 = class112.field1922[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field1980.method1926(Statics.field2384, var7, var8, var6) >= 0) {
                    class32 var11 = class32.method701(var10);
                    if (var11.field866 != null) {
                        var11 = var11.method668();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field640 == 1) {
                        method8(class134.field2308, field508 + " " + class2.field24 + " " + class2.method149(65535) + var11.field834, 1, var6, var7, var8);
                    } else if (!field642) {
                        String[] var12 = var11.field851;
                        if (field557) {
                            var12 = method2165(var12);
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
                                    method8(var12[var13], class2.method149(65535) + var11.field834, var14, var6, var7, var8);
                                }
                            }
                        }
                        method8(class134.field2197, class2.method149(65535) + var11.field834, 1002, var11.field831 << 14, var7, var8);
                    } else if ((Statics.field29 & 0x4) == 4) {
                        method8(field598, field645 + " " + class2.field24 + " " + class2.method149(65535) + var11.field834, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class25 var15 = field638[var10];
                    if (var15.field401.field789 == 1 && (var15.field471 & 0x7F) == 64 && (var15.field420 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field743; var16++) {
                            class25 var17 = field638[field617[var16]];
                            if (var17 != null && var15 != var17 && var17.field401.field789 == 1 && var15.field471 == var17.field471 && var15.field420 == var17.field420) {
                                method238(var17.field401, field617[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field607; var18++) {
                            class3 var19 = field520[field522[var18]];
                            if (var19 != null && var15.field471 == var19.field471 && var15.field420 == var19.field420) {
                                method135(var19, field522[var18], var7, var8);
                            }
                        }
                    }
                    method238(var15.field401, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field520[var10];
                    if ((var20.field471 & 0x7F) == 64 && (var20.field420 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field743; var21++) {
                            class25 var22 = field638[field617[var21]];
                            if (var22 != null && var22.field401.field789 == 1 && var20.field471 == var22.field471 && var20.field420 == var22.field420) {
                                method238(var22.field401, field617[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field607; var23++) {
                            class3 var24 = field520[field522[var23]];
                            if (var24 != null && var20 != var24 && var20.field471 == var24.field471 && var20.field420 == var24.field420) {
                                method135(var24, field522[var23], var7, var8);
                            }
                        }
                    }
                    method135(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field620[Statics.field2384][var7][var8];
                    if (var25 != null) {
                        for (class17 var26 = (class17) var25.method3370(); var26 != null; var26 = (class17) var25.method3372()) {
                            class40 var27 = class40.method259(var26.field267);
                            if (field640 == 1) {
                                method8(class134.field2308, field508 + " " + class2.field24 + " " + class2.method149(16748608) + var27.field990, 16, var26.field267, var7, var8);
                            } else if (!field642) {
                                String[] var28 = var27.field1004;
                                if (field557) {
                                    var28 = method2165(var28);
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
                                        method8(var28[var29], class2.method149(16748608) + var27.field990, var30, var26.field267, var7, var8);
                                    } else if (var29 == 2) {
                                        method8(class134.field2302, class2.method149(16748608) + var27.field990, 20, var26.field267, var7, var8);
                                    }
                                }
                                method8(class134.field2197, class2.method149(16748608) + var27.field990, 1004, var26.field267, var7, var8);
                            } else if ((Statics.field29 & 0x1) == 1) {
                                method8(field598, field645 + " " + class2.field24 + " " + class2.method149(16748608) + var27.field990, 17, var26.field267, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.bo(Lag;IIII)V")
    public static final void method238(class31 arg0, int arg1, int arg2, int arg3) {
        if (field629 >= 400) {
            return;
        }
        if (arg0.field813 != null) {
            arg0 = arg0.method622();
        }
        if (arg0 == null || !arg0.field822) {
            return;
        }
        String var4 = arg0.field788;
        if (arg0.field805 != 0) {
            int var6 = arg0.field805;
            int var7 = Statics.field885.field40;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method149(16711680);
            } else if (var8 < -6) {
                var9 = class2.method149(16723968);
            } else if (var8 < -3) {
                var9 = class2.method149(16740352);
            } else if (var8 < 0) {
                var9 = class2.method149(16756736);
            } else if (var8 > 9) {
                var9 = class2.method149(65280);
            } else if (var8 > 6) {
                var9 = class2.method149(4259584);
            } else if (var8 > 3) {
                var9 = class2.method149(8453888);
            } else if (var8 > 0) {
                var9 = class2.method149(12648192);
            } else {
                var9 = class2.method149(16776960);
            }
            var4 = var4 + var9 + " " + class2.field20 + class134.field2112 + arg0.field805 + class2.field23;
        }
        if (field640 == 1) {
            method8(class134.field2308, field508 + " " + class2.field24 + " " + class2.method149(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field642) {
            String[] var10 = arg0.field799;
            if (field557) {
                var10 = method2165(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class134.field2226)) {
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
                        method8(var10[var11], class2.method149(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class134.field2226)) {
                        short var14 = 0;
                        if (arg0.field805 > Statics.field885.field40) {
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
                        method8(var10[var13], class2.method149(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method8(class134.field2197, class2.method149(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field29 & 0x2) == 2) {
            method8(field598, field645 + " " + class2.field24 + " " + class2.method149(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("k.bv(Lm;IIII)V")
    public static final void method135(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field885 == arg0 || field629 >= 400) {
            return;
        }
        String var9;
        if (arg0.field41 == 0) {
            String var4 = arg0.field58;
            int var5 = arg0.field40;
            int var6 = Statics.field885.field40;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method149(16711680);
            } else if (var7 < -6) {
                var8 = class2.method149(16723968);
            } else if (var7 < -3) {
                var8 = class2.method149(16740352);
            } else if (var7 < 0) {
                var8 = class2.method149(16756736);
            } else if (var7 > 9) {
                var8 = class2.method149(65280);
            } else if (var7 > 6) {
                var8 = class2.method149(4259584);
            } else if (var7 > 3) {
                var8 = class2.method149(8453888);
            } else if (var7 > 0) {
                var8 = class2.method149(12648192);
            } else {
                var8 = class2.method149(16776960);
            }
            var9 = var4 + var8 + " " + class2.field20 + class134.field2112 + arg0.field40 + class2.field23;
        } else {
            var9 = arg0.field58 + " " + class2.field20 + class134.field2231 + arg0.field41 + class2.field23;
        }
        if (field640 == 1) {
            method8(class134.field2308, field508 + " " + class2.field24 + " " + class2.method149(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field642) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field613[var10] != null) {
                    short var11 = 0;
                    if (field613[var10].equalsIgnoreCase(class134.field2226)) {
                        if (arg0.field40 > Statics.field885.field40) {
                            var11 = 2000;
                        }
                        if (Statics.field885.field36 != 0 && arg0.field36 != 0) {
                            if (Statics.field885.field36 == arg0.field36) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field618[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field616[var10] + var11;
                    method8(field613[var10], class2.method149(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field29 & 0x8) == 8) {
            method8(field598, field645 + " " + class2.field24 + " " + class2.method149(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field629; var14++) {
            if (field632[var14] == 23) {
                field716[var14] = class2.method149(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ae.bh(IIIIIIIII)V")
    public static final void method855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class158.method2760(arg0)) {
            Statics.field1096 = null;
            method2757(Statics.field2682[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1096 != null) {
                method2757(Statics.field1096, -1412584499, arg1, arg2, arg3, arg4, Statics.field234, Statics.field1451, arg7);
                Statics.field1096 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field689[var8] = true;
            }
        } else {
            field689[arg7] = true;
        }
    }

    @ObfuscatedName("eg.bn([Lfk;IIIIIIIII)V")
    public static final void method2757(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1820(arg2, arg3, arg4, arg5);
        class104.method2170();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2661 == arg1 || arg1 == -1412584499 && field657 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field692[field736] = var10.field2590 + arg6;
                    field693[field736] = var10.field2602 + arg7;
                    field694[field736] = var10.field2594;
                    field695[field736] = var10.field2595;
                    var11 = ++field736 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2657 = var11;
                var10.field2701 = field491;
                if (!var10.field2626 || !method1396(var10)) {
                    if (var10.field2589 > 0) {
                        method798(var10);
                    }
                    int var12 = var10.field2590 + arg6;
                    int var13 = var10.field2602 + arg7;
                    int var14 = var10.field2607;
                    if (field657 == var10) {
                        if (arg1 != -1412584499 && !var10.field2637) {
                            Statics.field1096 = arg0;
                            Statics.field234 = arg6;
                            Statics.field1451 = arg7;
                            continue;
                        }
                        if (field595 && field662) {
                            int var15 = class77.field1392;
                            int var16 = class77.field1393;
                            int var17 = var15 - field624;
                            int var18 = var16 - field660;
                            if (var17 < field561) {
                                var17 = field561;
                            }
                            if (var10.field2594 + var17 > field561 + field658.field2594) {
                                var17 = field561 + field658.field2594 - var10.field2594;
                            }
                            if (var18 < field664) {
                                var18 = field664;
                            }
                            if (var10.field2595 + var18 > field664 + field658.field2595) {
                                var18 = field664 + field658.field2595 - var10.field2595;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2637) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2641 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2641 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2594 + var12;
                        int var26 = var10.field2595 + var13;
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
                        int var29 = var10.field2594 + var12;
                        int var30 = var10.field2595 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2626 || var19 < var21 && var20 < var22) {
                        if (var10.field2589 != 0) {
                            if (var10.field2589 == 1337) {
                                field636 = var12;
                                field581 = var13;
                                int var31 = var10.field2594;
                                int var32 = var10.field2595;
                                class89.method1820(var12, var13, var12 + var31, var13 + var32);
                                class104.method2170();
                                field590++;
                                method2340(true);
                                method753(true);
                                method2340(false);
                                method753(false);
                                for (class10 var33 = (class10) field641.method3369(); var33 != null; var33 = (class10) field641.method3371()) {
                                    if (Statics.field2384 != var33.field173 || field491 > var33.field161) {
                                        var33.method3409();
                                    } else if (field491 >= var33.field174) {
                                        if (var33.field164 > 0) {
                                            class25 var34 = field638[var33.field164 - 1];
                                            if (var34 != null && var34.field471 >= 0 && var34.field471 < 13312 && var34.field420 >= 0 && var34.field420 < 13312) {
                                                var33.method101(var34.field471, var34.field420, method2411(var34.field471, var34.field420, var33.field173) - var33.field163, field491);
                                            }
                                        }
                                        if (var33.field164 < 0) {
                                            int var35 = -var33.field164 - 1;
                                            class3 var36;
                                            if (field612 == var35) {
                                                var36 = Statics.field885;
                                            } else {
                                                var36 = field520[var35];
                                            }
                                            if (var36 != null && var36.field471 >= 0 && var36.field471 < 13312 && var36.field420 >= 0 && var36.field420 < 13312) {
                                                var33.method101(var36.field471, var36.field420, method2411(var36.field471, var36.field420, var33.field173) - var33.field163, field491);
                                            }
                                        }
                                        var33.method93(field510);
                                        Statics.field1980.method1907(Statics.field2384, (int) var33.field170, (int) var33.field171, (int) var33.field179, 60, var33, var33.field178, -1, false);
                                    }
                                }
                                for (class20 var37 = (class20) field623.method3369(); var37 != null; var37 = (class20) field623.method3371()) {
                                    if (Statics.field2384 != var37.field301 || var37.field308) {
                                        var37.method3409();
                                    } else if (field491 >= var37.field300) {
                                        var37.method170(field510);
                                        if (var37.field308) {
                                            var37.method3409();
                                        } else {
                                            Statics.field1980.method1907(var37.field301, var37.field302, var37.field312, var37.field299, 60, var37, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field732) {
                                    int var38 = field572;
                                    if (field578 / 256 > var38) {
                                        var38 = field578 / 256;
                                    }
                                    if (field733[4] && field735[4] + 128 > var38) {
                                        var38 = field735[4] + 128;
                                    }
                                    int var39 = field604 + field497 & 0x7FF;
                                    int var40 = Statics.field1402;
                                    int var41 = method2411(Statics.field885.field471, Statics.field885.field420, Statics.field2384) - 50;
                                    int var42 = Statics.field1420;
                                    int var43 = var38 * 3 + 600;
                                    int var44 = 2048 - var38 & 0x7FF;
                                    int var45 = 2048 - var39 & 0x7FF;
                                    int var46 = 0;
                                    int var47 = 0;
                                    int var48 = var43;
                                    if (var44 != 0) {
                                        int var49 = class104.field1769[var44];
                                        int var50 = class104.field1787[var44];
                                        int var51 = var47 * var50 - var43 * var49 >> 16;
                                        var48 = var47 * var49 + var43 * var50 >> 16;
                                        var47 = var51;
                                    }
                                    if (var45 != 0) {
                                        int var52 = class104.field1769[var45];
                                        int var53 = class104.field1787[var45];
                                        int var54 = var46 * var53 + var48 * var52 >> 16;
                                        var48 = var48 * var53 - var46 * var52 >> 16;
                                        var46 = var54;
                                    }
                                    Statics.field266 = var40 - var46;
                                    Statics.field259 = var41 - var47;
                                    Statics.field930 = var42 - var48;
                                    Statics.field2067 = var38;
                                    Statics.field183 = var39;
                                }
                                int var67;
                                if (field732) {
                                    var67 = method151();
                                } else {
                                    int var55;
                                    if (Statics.field193.field203) {
                                        var55 = Statics.field2384;
                                    } else {
                                        int var56 = 3;
                                        if (Statics.field2067 < 310) {
                                            int var57 = Statics.field266 >> 7;
                                            int var58 = Statics.field930 >> 7;
                                            int var59 = Statics.field885.field471 >> 7;
                                            int var60 = Statics.field885.field420 >> 7;
                                            if ((class9.field140[Statics.field2384][var57][var58] & 0x4) != 0) {
                                                var56 = Statics.field2384;
                                            }
                                            int var61;
                                            if (var59 > var57) {
                                                var61 = var59 - var57;
                                            } else {
                                                var61 = var57 - var59;
                                            }
                                            int var62;
                                            if (var60 > var58) {
                                                var62 = var60 - var58;
                                            } else {
                                                var62 = var58 - var60;
                                            }
                                            if (var61 > var62) {
                                                int var63 = var62 * 65536 / var61;
                                                int var64 = 32768;
                                                while (var57 != var59) {
                                                    if (var57 < var59) {
                                                        var57++;
                                                    } else if (var57 > var59) {
                                                        var57--;
                                                    }
                                                    if ((class9.field140[Statics.field2384][var57][var58] & 0x4) != 0) {
                                                        var56 = Statics.field2384;
                                                    }
                                                    var64 += var63;
                                                    if (var64 >= 65536) {
                                                        var64 -= 65536;
                                                        if (var58 < var60) {
                                                            var58++;
                                                        } else if (var58 > var60) {
                                                            var58--;
                                                        }
                                                        if ((class9.field140[Statics.field2384][var57][var58] & 0x4) != 0) {
                                                            var56 = Statics.field2384;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var65 = var61 * 65536 / var62;
                                                int var66 = 32768;
                                                while (var58 != var60) {
                                                    if (var58 < var60) {
                                                        var58++;
                                                    } else if (var58 > var60) {
                                                        var58--;
                                                    }
                                                    if ((class9.field140[Statics.field2384][var57][var58] & 0x4) != 0) {
                                                        var56 = Statics.field2384;
                                                    }
                                                    var66 += var65;
                                                    if (var66 >= 65536) {
                                                        var66 -= 65536;
                                                        if (var57 < var59) {
                                                            var57++;
                                                        } else if (var57 > var59) {
                                                            var57--;
                                                        }
                                                        if ((class9.field140[Statics.field2384][var57][var58] & 0x4) != 0) {
                                                            var56 = Statics.field2384;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class9.field140[Statics.field2384][Statics.field885.field471 >> 7][Statics.field885.field420 >> 7] & 0x4) != 0) {
                                            var56 = Statics.field2384;
                                        }
                                        var55 = var56;
                                    }
                                    var67 = var55;
                                }
                                int var68 = Statics.field266;
                                int var69 = Statics.field259;
                                int var70 = Statics.field930;
                                int var71 = Statics.field2067;
                                int var72 = Statics.field183;
                                for (int var73 = 0; var73 < 5; var73++) {
                                    if (field733[var73]) {
                                        int var74 = (int) (Math.random() * (double) (field734[var73] * 2 + 1) - (double) field734[var73] + Math.sin((double) field585[var73] / 100.0D * (double) field737[var73]) * (double) field735[var73]);
                                        if (var73 == 0) {
                                            Statics.field266 += var74;
                                        }
                                        if (var73 == 1) {
                                            Statics.field259 += var74;
                                        }
                                        if (var73 == 2) {
                                            Statics.field930 += var74;
                                        }
                                        if (var73 == 3) {
                                            Statics.field183 = Statics.field183 + var74 & 0x7FF;
                                        }
                                        if (var73 == 4) {
                                            Statics.field2067 += var74;
                                            if (Statics.field2067 < 128) {
                                                Statics.field2067 = 128;
                                            }
                                            if (Statics.field2067 > 383) {
                                                Statics.field2067 = 383;
                                            }
                                        }
                                    }
                                }
                                int var75 = class77.field1392;
                                int var76 = class77.field1393;
                                if (var75 >= var12 && var75 < var12 + var31 && var76 >= var13 && var76 < var13 + var32) {
                                    class112.field1918 = true;
                                    class112.field1921 = 0;
                                    class112.field1888 = class77.field1392 - var12;
                                    class112.field1892 = class77.field1393 - var13;
                                } else {
                                    class112.field1918 = false;
                                    class112.field1921 = 0;
                                }
                                method2244();
                                class89.method1826(var12, var13, var31, var32, 0);
                                method2244();
                                Statics.field1980.method1934(Statics.field266, Statics.field259, Statics.field930, Statics.field2067, Statics.field183, var67);
                                method2244();
                                Statics.field1980.method1910();
                                field579 = 0;
                                for (int var77 = -1; var77 < field743 + field607; var77++) {
                                    class27 var78;
                                    if (var77 == -1) {
                                        var78 = Statics.field885;
                                    } else if (var77 < field607) {
                                        var78 = field520[field522[var77]];
                                    } else {
                                        var78 = field638[field617[var77 - field607]];
                                    }
                                    if (var78 != null && var78.method16()) {
                                        if (var78 instanceof class25) {
                                            class31 var79 = ((class25) var78).field401;
                                            if (var79.field813 != null) {
                                                var79 = var79.method622();
                                            }
                                            if (var79 == null) {
                                                continue;
                                            }
                                        }
                                        if (var77 >= field607) {
                                            class31 var82 = ((class25) var78).field401;
                                            if (var82.field813 != null) {
                                                var82 = var82.method622();
                                            }
                                            if (var82.field811 >= 0 && var82.field811 < Statics.field2002.length) {
                                                method2759(var78, var78.field421 + 15);
                                                if (field655 > -1) {
                                                    Statics.field2002[var82.field811].method1721(field655 + var12 - 12, field592 + var13 - 30);
                                                }
                                            }
                                            if (field500 == 1 && field501 == field617[var77 - field607] && field491 % 20 < 10) {
                                                method2759(var78, var78.field421 + 15);
                                                if (field655 > -1) {
                                                    Statics.field127[0].method1721(field655 + var12 - 12, field592 + var13 - 28);
                                                }
                                            }
                                        } else {
                                            int var80 = 30;
                                            class3 var81 = (class3) var78;
                                            if (var81.field38 != -1 || var81.field39 != -1) {
                                                method2759(var78, var78.field421 + 15);
                                                if (field655 > -1) {
                                                    if (var81.field38 != -1) {
                                                        Statics.field289[var81.field38].method1721(field655 + var12 - 12, field592 + var13 - var80);
                                                        var80 += 25;
                                                    }
                                                    if (var81.field39 != -1) {
                                                        Statics.field2002[var81.field39].method1721(field655 + var12 - 12, field592 + var13 - var80);
                                                        var80 += 25;
                                                    }
                                                }
                                            }
                                            if (var77 >= 0 && field500 == 10 && field565 == field522[var77]) {
                                                method2759(var78, var78.field421 + 15);
                                                if (field655 > -1) {
                                                    Statics.field127[1].method1721(field655 + var12 - 12, field592 + var13 - var80);
                                                }
                                            }
                                        }
                                        if (var78.field432 != null && (var77 >= field607 || field594 == 0 || field594 == 3 || field594 == 1 && method147(((class3) var78).field58))) {
                                            method2759(var78, var78.field421);
                                            if (field655 > -1 && field579 < field666) {
                                                field584[field579] = Statics.field1273.method3468(var78.field432) / 2;
                                                field583[field579] = Statics.field1273.field2852;
                                                field663[field579] = field655;
                                                field750[field579] = field592;
                                                field727[field579] = var78.field430;
                                                field586[field579] = var78.field467;
                                                field587[field579] = var78.field427;
                                                field588[field579] = var78.field432;
                                                field579++;
                                            }
                                        }
                                        if (var78.field424 > field491) {
                                            method2759(var78, var78.field421 + 15);
                                            if (field655 > -1) {
                                                int var83 = var78.field440 * 30 / var78.field441;
                                                if (var83 > 30) {
                                                    var83 = 30;
                                                }
                                                class89.method1826(field655 + var12 - 15, field592 + var13 - 3, var83, 5, 65280);
                                                class89.method1826(field655 + var12 - 15 + var83, field592 + var13 - 3, 30 - var83, 5, 16711680);
                                            }
                                        }
                                        for (int var84 = 0; var84 < 4; var84++) {
                                            if (var78.field438[var84] > field491) {
                                                method2759(var78, var78.field421 / 2);
                                                if (field655 > -1) {
                                                    if (var84 == 1) {
                                                        field592 -= 20;
                                                    }
                                                    if (var84 == 2) {
                                                        field655 -= 15;
                                                        field592 -= 10;
                                                    }
                                                    if (var84 == 3) {
                                                        field655 += 15;
                                                        field592 -= 10;
                                                    }
                                                    Statics.field274[var78.field463[var84]].method1721(field655 + var12 - 12, field592 + var13 - 12);
                                                    Statics.field122.method3500(Integer.toString(var78.field433[var84]), field655 + var12 - 1, field592 + var13 + 3, 16777215, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var85 = 0; var85 < field579; var85++) {
                                    int var86 = field663[var85];
                                    int var87 = field750[var85];
                                    int var88 = field584[var85];
                                    int var89 = field583[var85];
                                    boolean var90 = true;
                                    while (var90) {
                                        var90 = false;
                                        for (int var91 = 0; var91 < var85; var91++) {
                                            if (var87 + 2 > field750[var91] - field583[var91] && var87 - var89 < field750[var91] + 2 && var86 - var88 < field663[var91] + field584[var91] && var86 + var88 > field663[var91] - field584[var91] && field750[var91] - field583[var91] < var87) {
                                                var87 = field750[var91] - field583[var91];
                                                var90 = true;
                                            }
                                        }
                                    }
                                    field655 = field663[var85];
                                    field592 = field750[var85] = var87;
                                    String var92 = field588[var85];
                                    if (field525 == 0) {
                                        int var93 = 16776960;
                                        if (field727[var85] < 6) {
                                            var93 = field702[field727[var85]];
                                        }
                                        if (field727[var85] == 6) {
                                            var93 = field590 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field727[var85] == 7) {
                                            var93 = field590 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field727[var85] == 8) {
                                            var93 = field590 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field727[var85] == 9) {
                                            int var94 = 150 - field587[var85];
                                            if (var94 < 50) {
                                                var93 = var94 * 1280 + 16711680;
                                            } else if (var94 < 100) {
                                                var93 = 16776960 - (var94 - 50) * 327680;
                                            } else if (var94 < 150) {
                                                var93 = (var94 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field727[var85] == 10) {
                                            int var95 = 150 - field587[var85];
                                            if (var95 < 50) {
                                                var93 = var95 * 5 + 16711680;
                                            } else if (var95 < 100) {
                                                var93 = 16711935 - (var95 - 50) * 327680;
                                            } else if (var95 < 150) {
                                                var93 = (var95 - 100) * 327680 + 255 - (var95 - 100) * 5;
                                            }
                                        }
                                        if (field727[var85] == 11) {
                                            int var96 = 150 - field587[var85];
                                            if (var96 < 50) {
                                                var93 = 16777215 - var96 * 327685;
                                            } else if (var96 < 100) {
                                                var93 = (var96 - 50) * 327685 + 65280;
                                            } else if (var96 < 150) {
                                                var93 = 16777215 - (var96 - 100) * 327680;
                                            }
                                        }
                                        if (field586[var85] == 0) {
                                            Statics.field1273.method3500(var92, field655 + var12, field592 + var13, var93, 0);
                                        }
                                        if (field586[var85] == 1) {
                                            Statics.field1273.method3444(var92, field655 + var12, field592 + var13, var93, 0, field590);
                                        }
                                        if (field586[var85] == 2) {
                                            Statics.field1273.method3445(var92, field655 + var12, field592 + var13, var93, 0, field590);
                                        }
                                        if (field586[var85] == 3) {
                                            Statics.field1273.method3442(var92, field655 + var12, field592 + var13, var93, 0, field590, 150 - field587[var85]);
                                        }
                                        if (field586[var85] == 4) {
                                            int var97 = (150 - field587[var85]) * (Statics.field1273.method3468(var92) + 100) / 150;
                                            class89.method1821(field655 + var12 - 50, var13, field655 + var12 + 50, var13 + var32);
                                            Statics.field1273.method3440(var92, field655 + var12 + 50 - var97, field592 + var13, var93, 0);
                                            class89.method1820(var12, var13, var12 + var31, var13 + var32);
                                        }
                                        if (field586[var85] == 5) {
                                            int var98 = 150 - field587[var85];
                                            int var99 = 0;
                                            if (var98 < 25) {
                                                var99 = var98 - 25;
                                            } else if (var98 > 125) {
                                                var99 = var98 - 125;
                                            }
                                            class89.method1821(var12, field592 + var13 - Statics.field1273.field2852 - 1, var12 + var31, field592 + var13 + 5);
                                            Statics.field1273.method3500(var92, field655 + var12, field592 + var13 + var99, var93, 0);
                                            class89.method1820(var12, var13, var12 + var31, var13 + var32);
                                        }
                                    } else {
                                        Statics.field1273.method3500(var92, field655 + var12, field592 + var13, 16776960, 0);
                                    }
                                }
                                method192(var12, var13);
                                ((class110) Statics.field1781).method2256(field510);
                                method1401(var12, var13, var31, var32);
                                Statics.field266 = var68;
                                Statics.field259 = var69;
                                Statics.field930 = var70;
                                Statics.field2067 = var71;
                                Statics.field183 = var72;
                                if (field723 && class153.method566(true, false) == 0) {
                                    field723 = false;
                                }
                                if (field723) {
                                    class89.method1826(var12, var13, var31, var32, 0);
                                    method911(class134.field2090, false);
                                }
                                if (!field723 && !field628 && var75 >= var12 && var75 < var12 + var31 && var76 >= var13 && var76 < var13 + var32) {
                                    method1436(var75, var76, var12, var13);
                                }
                                class89.method1820(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2589 == 1338) {
                                method2244();
                                class89.method1820(var12, var13, Statics.field2452.field1486 + var12, Statics.field2452.field1487 + var13);
                                if (field720 == 2 || field720 == 5) {
                                    class89.method1835(var12 + 25, var13 + 5, 0, Statics.field229, Statics.field361);
                                } else {
                                    int var100 = field560 + field497 & 0x7FF;
                                    int var101 = Statics.field885.field471 / 32 + 48;
                                    int var102 = 464 - Statics.field885.field420 / 32;
                                    Statics.field1263.method1731(var12 + 25, var13 + 5, 146, 151, var101, var102, var100, field562 + 256, Statics.field229, Statics.field361);
                                    for (int var103 = 0; var103 < field478; var103++) {
                                        int var104 = field558[var103] * 4 + 2 - Statics.field885.field471 / 32;
                                        int var105 = field502[var103] * 4 + 2 - Statics.field885.field420 / 32;
                                        method10(var12, var13, var104, var105, field717[var103]);
                                    }
                                    for (int var106 = 0; var106 < 104; var106++) {
                                        for (int var107 = 0; var107 < 104; var107++) {
                                            class177 var108 = field620[Statics.field2384][var106][var107];
                                            if (var108 != null) {
                                                int var109 = var106 * 4 + 2 - Statics.field885.field471 / 32;
                                                int var110 = var107 * 4 + 2 - Statics.field885.field420 / 32;
                                                method10(var12, var13, var109, var110, Statics.field476[0]);
                                            }
                                        }
                                    }
                                    for (int var111 = 0; var111 < field743; var111++) {
                                        class25 var112 = field638[field617[var111]];
                                        if (var112 != null && var112.method16()) {
                                            class31 var113 = var112.field401;
                                            if (var113 != null && var113.field813 != null) {
                                                var113 = var113.method622();
                                            }
                                            if (var113 != null && var113.field783 && var113.field822) {
                                                int var114 = var112.field471 / 32 - Statics.field885.field471 / 32;
                                                int var115 = var112.field420 / 32 - Statics.field885.field420 / 32;
                                                method10(var12, var13, var114, var115, Statics.field476[1]);
                                            }
                                        }
                                    }
                                    for (int var116 = 0; var116 < field607; var116++) {
                                        class3 var117 = field520[field522[var116]];
                                        if (var117 != null && var117.method16()) {
                                            int var118 = var117.field471 / 32 - Statics.field885.field471 / 32;
                                            int var119 = var117.field420 / 32 - Statics.field885.field420 / 32;
                                            boolean var120 = false;
                                            if (method147(var117.field58)) {
                                                var120 = true;
                                            }
                                            boolean var121 = false;
                                            for (int var122 = 0; var122 < Statics.field80; var122++) {
                                                if (var117.field58.equals(Statics.field367[var122].field125)) {
                                                    var121 = true;
                                                    break;
                                                }
                                            }
                                            boolean var123 = false;
                                            if (Statics.field885.field36 != 0 && var117.field36 != 0 && Statics.field885.field36 == var117.field36) {
                                                var123 = true;
                                            }
                                            if (var120) {
                                                method10(var12, var13, var118, var119, Statics.field476[3]);
                                            } else if (var123) {
                                                method10(var12, var13, var118, var119, Statics.field476[4]);
                                            } else if (var121) {
                                                method10(var12, var13, var118, var119, Statics.field476[2]);
                                            } else {
                                                method10(var12, var13, var118, var119, Statics.field476[2]);
                                            }
                                        }
                                    }
                                    if (field500 != 0 && field491 % 20 < 10) {
                                        if (field500 == 1 && field501 >= 0 && field501 < field638.length) {
                                            class25 var124 = field638[field501];
                                            if (var124 != null) {
                                                int var125 = var124.field471 / 32 - Statics.field885.field471 / 32;
                                                int var126 = var124.field420 / 32 - Statics.field885.field420 / 32;
                                                method113(var12, var13, var125, var126, Statics.field1827[1]);
                                            }
                                        }
                                        if (field500 == 2) {
                                            int var127 = field503 * 4 - Statics.field1795 * 4 + 2 - Statics.field885.field471 / 32;
                                            int var128 = field504 * 4 - Statics.field884 * 4 + 2 - Statics.field885.field420 / 32;
                                            method113(var12, var13, var127, var128, Statics.field1827[1]);
                                        }
                                        if (field500 == 10 && field565 >= 0 && field565 < field520.length) {
                                            class3 var129 = field520[field565];
                                            if (var129 != null) {
                                                int var130 = var129.field471 / 32 - Statics.field885.field471 / 32;
                                                int var131 = var129.field420 / 32 - Statics.field885.field420 / 32;
                                                method113(var12, var13, var130, var131, Statics.field1827[1]);
                                            }
                                        }
                                    }
                                    if (field718 != 0) {
                                        int var132 = field718 * 4 + 2 - Statics.field885.field471 / 32;
                                        int var133 = field582 * 4 + 2 - Statics.field885.field420 / 32;
                                        method10(var12, var13, var132, var133, Statics.field1827[0]);
                                    }
                                    class89.method1826(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field720 < 3) {
                                    Statics.field2016.method1731(var12, var13, 33, 33, 25, 25, field497, 256, Statics.field14, Statics.field1807);
                                } else {
                                    class89.method1835(var12, var13, 0, Statics.field14, Statics.field1807);
                                }
                                if (field691[var11]) {
                                    Statics.field2452.method1808(var12, var13);
                                }
                                field690[var11] = true;
                                class89.method1820(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var134 = class77.field1392;
                        int var135 = class77.field1393;
                        if (!field628 && var134 >= var19 && var135 >= var20 && var134 < var21 && var135 < var22) {
                            method3016(var10, var134 - var12, var135 - var13);
                        }
                        if (var10.field2641 == 0) {
                            if (!var10.field2626 && method1396(var10) && Statics.field366 != var10) {
                                continue;
                            }
                            if (!var10.field2626) {
                                if (var10.field2599 > var10.field2601 - var10.field2595) {
                                    var10.field2599 = var10.field2601 - var10.field2595;
                                }
                                if (var10.field2599 < 0) {
                                    var10.field2599 = 0;
                                }
                            }
                            method2757(arg0, var10.field2690, var19, var20, var21, var22, var12 - var10.field2680, var13 - var10.field2599, var11);
                            if (var10.field2591 != null) {
                                method2757(var10.field2591, var10.field2690, var19, var20, var21, var22, var12 - var10.field2680, var13 - var10.field2599, var11);
                            }
                            class4 var136 = (class4) field647.method3348((long) var10.field2690);
                            if (var136 != null) {
                                if (var136.field60 == 0 && class77.field1392 >= var19 && class77.field1393 >= var20 && class77.field1392 < var21 && class77.field1393 < var22 && !field628 && !field608) {
                                    field610[0] = class134.field2297;
                                    field716[0] = "";
                                    field632[0] = 1006;
                                    field629 = 1;
                                }
                                method855(var136.field59, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class89.method1820(arg2, arg3, arg4, arg5);
                            class104.method2170();
                        }
                        if (field691[var11] || field576 > 1) {
                            if (var10.field2641 == 0 && !var10.field2626 && var10.field2601 > var10.field2595) {
                                method137(var10.field2594 + var12, var13, var10.field2599, var10.field2595, var10.field2601);
                            }
                            if (var10.field2641 != 1) {
                                if (var10.field2641 == 2) {
                                    int var137 = 0;
                                    for (int var138 = 0; var138 < var10.field2595; var138++) {
                                        for (int var139 = 0; var139 < var10.field2594; var139++) {
                                            int var140 = (var10.field2638 + 32) * var139 + var12;
                                            int var141 = (var10.field2639 + 32) * var138 + var13;
                                            if (var137 < 20) {
                                                var140 += var10.field2581[var137];
                                                var141 += var10.field2579[var137];
                                            }
                                            if (var10.field2687[var137] > 0) {
                                                boolean var142 = false;
                                                boolean var143 = false;
                                                int var144 = var10.field2687[var137] - 1;
                                                if (var140 + 32 > arg2 && var140 < arg4 && var141 + 32 > arg3 && var141 < arg5 || Statics.field1823 == var10 && field635 == var137) {
                                                    class86 var145;
                                                    if (field640 == 1 && Statics.field802 == var137 && Statics.field85 == var10.field2690) {
                                                        var145 = Statics.method1522(var144, var10.field2688[var137], 2, 0, false);
                                                    } else {
                                                        var145 = Statics.method1522(var144, var10.field2688[var137], 1, 3153952, false);
                                                    }
                                                    if (var145 == null) {
                                                        method394(var10);
                                                    } else if (Statics.field1823 == var10 && field635 == var137) {
                                                        int var146 = class77.field1392 - field600;
                                                        int var147 = class77.field1393 - field601;
                                                        if (var146 < 5 && var146 > -5) {
                                                            var146 = 0;
                                                        }
                                                        if (var147 < 5 && var147 > -5) {
                                                            var147 = 0;
                                                        }
                                                        if (field646 < 5) {
                                                            var146 = 0;
                                                            var147 = 0;
                                                        }
                                                        var145.method1727(var140 + var146, var141 + var147, 128);
                                                        if (arg1 != -1) {
                                                            class158 var148 = arg0[arg1 & 0xFFFF];
                                                            if (var141 + var147 < class89.field1495 && var148.field2599 > 0) {
                                                                int var149 = field510 * (class89.field1495 - var141 - var147) / 3;
                                                                if (var149 > field510 * 10) {
                                                                    var149 = field510 * 10;
                                                                }
                                                                if (var149 > var148.field2599) {
                                                                    var149 = var148.field2599;
                                                                }
                                                                var148.field2599 -= var149;
                                                                field601 += var149;
                                                                method394(var148);
                                                            }
                                                            if (var141 + var147 + 32 > class89.field1497 && var148.field2599 < var148.field2601 - var148.field2595) {
                                                                int var150 = field510 * (var141 + var147 + 32 - class89.field1497) / 3;
                                                                if (var150 > field510 * 10) {
                                                                    var150 = field510 * 10;
                                                                }
                                                                if (var150 > var148.field2601 - var148.field2595 - var148.field2599) {
                                                                    var150 = var148.field2601 - var148.field2595 - var148.field2599;
                                                                }
                                                                var148.field2599 += var150;
                                                                field601 -= var150;
                                                                method394(var148);
                                                            }
                                                        }
                                                    } else if (Statics.field1831 == var10 && field644 == var137) {
                                                        var145.method1727(var140, var141, 128);
                                                    } else {
                                                        var145.method1721(var140, var141);
                                                    }
                                                }
                                            } else if (var10.field2642 != null && var137 < 20) {
                                                class86 var151 = var10.method3171(var137);
                                                if (var151 != null) {
                                                    var151.method1721(var140, var141);
                                                } else if (class158.field2662) {
                                                    method394(var10);
                                                }
                                            }
                                            var137++;
                                        }
                                    }
                                } else if (var10.field2641 == 3) {
                                    int var152;
                                    if (method30(var10)) {
                                        var152 = var10.field2604;
                                        if (Statics.field366 == var10 && var10.field2605 != 0) {
                                            var152 = var10.field2605;
                                        }
                                    } else {
                                        var152 = var10.field2621;
                                        if (Statics.field366 == var10 && var10.field2698 != 0) {
                                            var152 = var10.field2698;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2606) {
                                            class89.method1826(var12, var13, var10.field2594, var10.field2595, var152);
                                        } else {
                                            class89.method1828(var12, var13, var10.field2594, var10.field2595, var152);
                                        }
                                    } else if (var10.field2606) {
                                        class89.method1854(var12, var13, var10.field2594, var10.field2595, var152, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1840(var12, var13, var10.field2594, var10.field2595, var152, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2641 == 4) {
                                    class183 var153 = var10.method3170();
                                    if (var153 != null) {
                                        String var154 = var10.field2598;
                                        int var155;
                                        if (method30(var10)) {
                                            var155 = var10.field2604;
                                            if (Statics.field366 == var10 && var10.field2605 != 0) {
                                                var155 = var10.field2605;
                                            }
                                            if (var10.field2633.length() > 0) {
                                                var154 = var10.field2633;
                                            }
                                        } else {
                                            var155 = var10.field2621;
                                            if (Statics.field366 == var10 && var10.field2698 != 0) {
                                                var155 = var10.field2698;
                                            }
                                        }
                                        if (var10.field2626 && var10.field2592 != -1) {
                                            class40 var156 = class40.method259(var10.field2592);
                                            var154 = var156.field990;
                                            if (var154 == null) {
                                                var154 = "null";
                                            }
                                            if ((var156.field1001 == 1 || var10.field2666 != 1) && var10.field2666 != -1) {
                                                var154 = class2.method149(16748608) + var154 + class2.field26 + " " + 'x' + method2389(var10.field2666);
                                            }
                                        }
                                        if (field650 == var10) {
                                            class134 var10000 = (class134) null;
                                            var154 = class134.field2259;
                                            var155 = var10.field2621;
                                        }
                                        if (!var10.field2626) {
                                            var154 = method218(var154, var10);
                                        }
                                        var153.method3456(var154, var12, var13, var10.field2594, var10.field2595, var155, var10.field2596 ? 0 : -1, var10.field2635, var10.field2593, var10.field2634);
                                    } else if (class158.field2662) {
                                        method394(var10);
                                    }
                                } else if (var10.field2641 == 5) {
                                    if (var10.field2626) {
                                        class86 var158;
                                        if (var10.field2592 == -1) {
                                            var158 = var10.method3169(false);
                                        } else {
                                            var158 = Statics.method1522(var10.field2592, var10.field2666, var10.field2613, var10.field2614, false);
                                        }
                                        if (var158 != null) {
                                            int var159 = var158.field1482;
                                            int var160 = var158.field1478;
                                            if (var10.field2603) {
                                                class89.method1821(var12, var13, var10.field2594 + var12, var10.field2595 + var13);
                                                int var161 = (var10.field2594 + (var159 - 1)) / var159;
                                                int var162 = (var10.field2595 + (var160 - 1)) / var160;
                                                for (int var163 = 0; var163 < var161; var163++) {
                                                    for (int var164 = 0; var164 < var162; var164++) {
                                                        if (var10.field2611 != 0) {
                                                            var158.method1712(var159 / 2 + var159 * var163 + var12, var160 / 2 + var160 * var164 + var13, var10.field2611, 4096);
                                                        } else if (var14 == 0) {
                                                            var158.method1721(var159 * var163 + var12, var160 * var164 + var13);
                                                        } else {
                                                            var158.method1727(var159 * var163 + var12, var160 * var164 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1820(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var165 = var10.field2594 * 4096 / var159;
                                                if (var10.field2611 != 0) {
                                                    var158.method1712(var10.field2594 / 2 + var12, var10.field2595 / 2 + var13, var10.field2611, var165);
                                                } else if (var14 != 0) {
                                                    var158.method1769(var12, var13, var10.field2594, var10.field2595, 256 - (var14 & 0xFF));
                                                } else if (var10.field2594 == var159 && var10.field2595 == var160) {
                                                    var158.method1721(var12, var13);
                                                } else {
                                                    var158.method1723(var12, var13, var10.field2594, var10.field2595);
                                                }
                                            }
                                        } else if (class158.field2662) {
                                            method394(var10);
                                        }
                                    } else {
                                        class86 var157 = var10.method3169(method30(var10));
                                        if (var157 != null) {
                                            var157.method1721(var12, var13);
                                        } else if (class158.field2662) {
                                            method394(var10);
                                        }
                                    }
                                } else if (var10.field2641 == 6) {
                                    boolean var166 = method30(var10);
                                    int var167;
                                    if (var166) {
                                        var167 = var10.field2587;
                                    } else {
                                        var167 = var10.field2650;
                                    }
                                    class112 var168 = null;
                                    int var169 = 0;
                                    if (var10.field2592 != -1) {
                                        class40 var170 = class40.method259(var10.field2592);
                                        if (var170 != null) {
                                            class40 var171 = var170.method871(var10.field2666);
                                            var168 = var171.method887(1);
                                            if (var168 == null) {
                                                method394(var10);
                                            } else {
                                                var168.method2273();
                                                var169 = var168.field1556 / 2;
                                            }
                                        }
                                    } else if (var10.field2617 == 5) {
                                        if (var10.field2618 == 0) {
                                            var168 = field745.method3235((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var168 = Statics.field885.method15();
                                        }
                                    } else if (var167 == -1) {
                                        var168 = var10.method3172((class34) null, -1, var166, Statics.field885.field49);
                                        if (var168 == null && class158.field2662) {
                                            method394(var10);
                                        }
                                    } else {
                                        class34 var172 = class34.method1443(var167);
                                        var168 = var10.method3172(var172, var10.field2691, var166, Statics.field885.field49);
                                        if (var168 == null && class158.field2662) {
                                            method394(var10);
                                        }
                                    }
                                    class104.method2173(var10.field2594 / 2 + var12, var10.field2595 / 2 + var13);
                                    int var173 = var10.field2628 * class104.field1769[var10.field2625] >> 16;
                                    int var174 = var10.field2628 * class104.field1787[var10.field2625] >> 16;
                                    if (var168 != null) {
                                        if (var10.field2626) {
                                            var168.method2273();
                                            if (var10.field2575) {
                                                var168.method2291(0, var10.field2584, var10.field2640, var10.field2625, var10.field2623, var10.field2624 + var169 + var173, var10.field2624 + var174, var10.field2628);
                                            } else {
                                                var168.method2279(0, var10.field2584, var10.field2640, var10.field2625, var10.field2623, var10.field2624 + var169 + var173, var10.field2624 + var174);
                                            }
                                        } else {
                                            var168.method2279(0, var10.field2584, 0, var10.field2625, 0, var173, var174);
                                        }
                                    }
                                    class104.method2172();
                                } else {
                                    if (var10.field2641 == 7) {
                                        class183 var175 = var10.method3170();
                                        if (var175 == null) {
                                            if (class158.field2662) {
                                                method394(var10);
                                            }
                                            continue;
                                        }
                                        int var176 = 0;
                                        for (int var177 = 0; var177 < var10.field2595; var177++) {
                                            for (int var178 = 0; var178 < var10.field2594; var178++) {
                                                if (var10.field2687[var176] > 0) {
                                                    class40 var179 = class40.method259(var10.field2687[var176] - 1);
                                                    String var180;
                                                    if (var179.field1001 != 1 && var10.field2688[var176] == 1) {
                                                        var180 = class2.method149(16748608) + var179.field990 + class2.field26;
                                                    } else {
                                                        var180 = class2.method149(16748608) + var179.field990 + class2.field26 + " " + 'x' + method2389(var10.field2688[var176]);
                                                    }
                                                    int var181 = (var10.field2638 + 115) * var178 + var12;
                                                    int var182 = (var10.field2639 + 12) * var177 + var13;
                                                    if (var10.field2635 == 0) {
                                                        var175.method3440(var180, var181, var182, var10.field2621, var10.field2596 ? 0 : -1);
                                                    } else if (var10.field2635 == 1) {
                                                        var175.method3500(var180, var10.field2594 / 2 + var181, var182, var10.field2621, var10.field2596 ? 0 : -1);
                                                    } else {
                                                        var175.method3441(var180, var10.field2594 + var181 - 1, var182, var10.field2621, var10.field2596 ? 0 : -1);
                                                    }
                                                }
                                                var176++;
                                            }
                                        }
                                    }
                                    if (var10.field2641 == 8 && Statics.field1271 == var10 && field639 == field626) {
                                        int var183 = 0;
                                        int var184 = 0;
                                        class183 var185 = Statics.field1984;
                                        String var186 = var10.field2598;
                                        String var187 = method218(var186, var10);
                                        while (var187.length() > 0) {
                                            int var188 = var187.indexOf(class2.field27);
                                            String var189;
                                            if (var188 == -1) {
                                                var189 = var187;
                                                var187 = "";
                                            } else {
                                                var189 = var187.substring(0, var188);
                                                var187 = var187.substring(var188 + 4);
                                            }
                                            int var190 = var185.method3468(var189);
                                            if (var190 > var183) {
                                                var183 = var190;
                                            }
                                            var184 += var185.field2852 + 1;
                                        }
                                        var183 += 6;
                                        var184 += 7;
                                        int var191 = var10.field2594 + var12 - 5 - var183;
                                        int var192 = var10.field2595 + var13 + 5;
                                        if (var191 < var12 + 5) {
                                            var191 = var12 + 5;
                                        }
                                        if (var183 + var191 > arg4) {
                                            var191 = arg4 - var183;
                                        }
                                        if (var184 + var192 > arg5) {
                                            var192 = arg5 - var184;
                                        }
                                        class89.method1826(var191, var192, var183, var184, 16777120);
                                        class89.method1828(var191, var192, var183, var184, 0);
                                        String var193 = var10.field2598;
                                        int var194 = var185.field2852 + var192 + 2;
                                        String var195 = method218(var193, var10);
                                        while (var195.length() > 0) {
                                            int var196 = var195.indexOf(class2.field27);
                                            String var197;
                                            if (var196 == -1) {
                                                var197 = var195;
                                                var195 = "";
                                            } else {
                                                var197 = var195.substring(0, var196);
                                                var195 = var195.substring(var196 + 4);
                                            }
                                            var185.method3440(var197, var191 + 3, var194, 0, -1);
                                            var194 += var185.field2852 + 1;
                                        }
                                    }
                                    if (var10.field2641 == 9) {
                                        if (var10.field2608 == 1) {
                                            class89.method1834(var12, var13, var10.field2594 + var12, var10.field2595 + var13, var10.field2621);
                                        } else {
                                            int var198 = var10.field2594 >= 0 ? var10.field2594 : -var10.field2594;
                                            int var199 = var10.field2595 >= 0 ? var10.field2595 : -var10.field2595;
                                            int var200 = var198;
                                            if (var198 < var199) {
                                                var200 = var199;
                                            }
                                            if (var200 != 0) {
                                                int var201 = (var10.field2594 << 16) / var200;
                                                int var202 = (var10.field2595 << 16) / var200;
                                                if (var202 <= var201) {
                                                    var201 = -var201;
                                                } else {
                                                    var202 = -var202;
                                                }
                                                int var203 = var10.field2608 * var202 >> 17;
                                                int var204 = var10.field2608 * var202 + 1 >> 17;
                                                int var205 = var10.field2608 * var201 >> 17;
                                                int var206 = var10.field2608 * var201 + 1 >> 17;
                                                int var207 = var12 + var203;
                                                int var208 = var12 - var204;
                                                int var209 = var10.field2594 + var12 - var204;
                                                int var210 = var10.field2594 + var12 + var203;
                                                int var211 = var13 + var205;
                                                int var212 = var13 - var206;
                                                int var213 = var10.field2595 + var13 - var206;
                                                int var214 = var10.field2595 + var13 + var205;
                                                class104.method2199(var207, var208, var209);
                                                class104.method2181(var211, var212, var213, var207, var208, var209, var10.field2621);
                                                class104.method2199(var207, var209, var210);
                                                class104.method2181(var211, var213, var214, var207, var209, var210, var10.field2621);
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

    @ObfuscatedName("r.ca(Ljava/lang/String;Lfk;I)Ljava/lang/String;")
    public static String method218(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method167(method2242(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field253 != null) {
                    int var6 = Statics.field253.field1413;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field253.field1410 != null) {
                        var5 = (String) Statics.field253.field1410;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("dt.cq(II)Ljava/lang/String;")
    public static final String method2389(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field35 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method149(65408) + var1.substring(0, var1.length() - 8) + class134.field2235 + " " + class2.field20 + var1 + class2.field23 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method149(16777215) + var1.substring(0, var1.length() - 4) + class134.field2237 + " " + class2.field20 + var1 + class2.field23 + class2.field26;
        } else {
            return " " + class2.method149(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("k.cu(IIIIII)V")
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1208[0].method1808(arg0, arg1);
        Statics.field1208[1].method1808(arg0, arg1 + arg3 - 16);
        class89.method1826(arg0, arg1 + 16, 16, arg3 - 32, field566);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1826(arg0, arg1 + 16 + var6, 16, var5, field740);
        class89.method1848(arg0, arg1 + 16 + var6, var5, field569);
        class89.method1848(arg0 + 1, arg1 + 16 + var6, var5, field569);
        class89.method1830(arg0, arg1 + 16 + var6, 16, field569);
        class89.method1830(arg0, arg1 + 17 + var6, 16, field569);
        class89.method1848(arg0 + 15, arg1 + 16 + var6, var5, field568);
        class89.method1848(arg0 + 14, arg1 + 17 + var6, var5 - 1, field568);
        class89.method1830(arg0, arg1 + 15 + var6 + var5, 16, field568);
        class89.method1830(arg0 + 1, arg1 + 14 + var6 + var5, 15, field568);
    }

    @ObfuscatedName("b.cs(II)Ljava/lang/String;")
    public static final String method167(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("o.cf(Lfk;B)Z")
    public static final boolean method30(class158 arg0) {
        if (arg0.field2645 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2645.length; var1++) {
            int var2 = method2242(arg0, var1);
            int var3 = arg0.field2683[var1];
            if (arg0.field2645[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2645[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2645[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dy.cx(Lfk;II)I")
    public static final int method2242(class158 arg0, int arg1) {
        if (arg0.field2697 == null || arg1 >= arg0.field2697.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2697[arg1];
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
                    var7 = field573[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field625[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field575[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class158 var11 = class158.method821(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method259(var12).field1003 || field524)) {
                        for (int var13 = 0; var13 < var11.field2687.length; var13++) {
                            if (var12 + 1 == var11.field2687[var13]) {
                                var7 += var11.field2688[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2705[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2046[field625[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2705[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field885.field40;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2045[var14]) {
                            var7 += field625[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method821(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method259(var18).field1003 || field524)) {
                        for (int var19 = 0; var19 < var17.field2687.length; var19++) {
                            if (var18 + 1 == var17.field2687[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field606;
                }
                if (var6 == 12) {
                    var7 = field512;
                }
                if (var6 == 13) {
                    int var20 = class159.field2705[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method923(var22);
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
                    var7 = (Statics.field885.field471 >> 7) + Statics.field1795;
                }
                if (var6 == 19) {
                    var7 = (Statics.field885.field420 >> 7) + Statics.field884;
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

    @ObfuscatedName("ed.cl(Lfk;III)V")
    public static final void method3016(class158 arg0, int arg1, int arg2) {
        if (arg0.field2578 == 1) {
            method8(arg0.field2686, "", 24, 0, 0, arg0.field2690);
        }
        if (arg0.field2578 == 2 && !field642) {
            int var3 = method2374(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2651 == null || arg0.field2651.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2651;
            }
            if (var5 != null) {
                method8(var5, class2.method149(65280) + arg0.field2693, 25, 0, -1, arg0.field2690);
            }
        }
        if (arg0.field2578 == 3) {
            method8(class134.field2233, "", 26, 0, 0, arg0.field2690);
        }
        if (arg0.field2578 == 4) {
            method8(arg0.field2686, "", 28, 0, 0, arg0.field2690);
        }
        if (arg0.field2578 == 5) {
            method8(arg0.field2686, "", 29, 0, 0, arg0.field2690);
        }
        if (arg0.field2578 == 6 && field650 == null) {
            method8(arg0.field2686, "", 30, 0, -1, arg0.field2690);
        }
        if (arg0.field2641 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2595; var8++) {
                for (int var9 = 0; var9 < arg0.field2594; var9++) {
                    int var10 = (arg0.field2638 + 32) * var9;
                    int var11 = (arg0.field2639 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2581[var7];
                        var11 += arg0.field2579[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field602 = var7;
                        Statics.field292 = arg0;
                        if (arg0.field2687[var7] > 0) {
                            class40 var12 = class40.method259(arg0.field2687[var7] - 1);
                            if (field640 == 1 && class162.method2267(method2374(arg0))) {
                                if (Statics.field85 != arg0.field2690 || Statics.field802 != var7) {
                                    method8(class134.field2308, field508 + " " + class2.field24 + " " + class2.method149(16748608) + var12.field990, 31, var12.field988, var7, arg0.field2690);
                                }
                            } else if (!field642 || !class162.method2267(method2374(arg0))) {
                                String[] var13 = var12.field983;
                                if (field557) {
                                    var13 = method2165(var13);
                                }
                                if (class162.method2267(method2374(arg0))) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }
                                            method8(var13[var14], class2.method149(16748608) + var12.field990, var15, var12.field988, var7, arg0.field2690);
                                        } else if (var14 == 4) {
                                            method8(class134.field2085, class2.method149(16748608) + var12.field990, 37, var12.field988, var7, arg0.field2690);
                                        }
                                    }
                                }
                                int var16 = method2374(arg0);
                                boolean var17 = (var16 >> 31 & 0x1) != 0;
                                if (var17) {
                                    method8(class134.field2308, class2.method149(16748608) + var12.field990, 38, var12.field988, var7, arg0.field2690);
                                }
                                class162 var10000 = (class162) null;
                                if (class162.method2267(method2374(arg0)) && var13 != null) {
                                    for (int var18 = 2; var18 >= 0; var18--) {
                                        if (var13[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 33;
                                            }
                                            if (var18 == 1) {
                                                var19 = 34;
                                            }
                                            if (var18 == 2) {
                                                var19 = 35;
                                            }
                                            method8(var13[var18], class2.method149(16748608) + var12.field990, var19, var12.field988, var7, arg0.field2690);
                                        }
                                    }
                                }
                                String[] var20 = arg0.field2643;
                                if (field557) {
                                    var20 = method2165(var20);
                                }
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            if (var21 == 0) {
                                                var22 = 39;
                                            }
                                            if (var21 == 1) {
                                                var22 = 40;
                                            }
                                            if (var21 == 2) {
                                                var22 = 41;
                                            }
                                            if (var21 == 3) {
                                                var22 = 42;
                                            }
                                            if (var21 == 4) {
                                                var22 = 43;
                                            }
                                            method8(var20[var21], class2.method149(16748608) + var12.field990, var22, var12.field988, var7, arg0.field2690);
                                        }
                                    }
                                }
                                method8(class134.field2197, class2.method149(16748608) + var12.field990, 1005, var12.field988, var7, arg0.field2690);
                            } else if ((Statics.field29 & 0x10) == 16) {
                                method8(field598, field645 + " " + class2.field24 + " " + class2.method149(16748608) + var12.field990, 32, var12.field988, var7, arg0.field2690);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2626) {
            return;
        }
        if (field642) {
            int var23 = method2374(arg0);
            boolean var24 = (var23 >> 21 & 0x1) != 0;
            if (var24 && (Statics.field29 & 0x20) == 32) {
                method8(field598, field645 + " " + class2.field24 + " " + arg0.field2627, 58, 0, arg0.field2586, arg0.field2690);
            }
            return;
        }
        for (int var25 = 9; var25 >= 5; var25--) {
            String var26 = method119(arg0, var25);
            if (var26 != null) {
                method8(var26, arg0.field2627, 1007, var25 + 1, arg0.field2586, arg0.field2690);
            }
        }
        int var27 = method2374(arg0);
        int var28 = var27 >> 11 & 0x3F;
        String var29;
        if (var28 == 0) {
            var29 = null;
        } else if (arg0.field2651 == null || arg0.field2651.trim().length() == 0) {
            var29 = null;
        } else {
            var29 = arg0.field2651;
        }
        if (var29 != null) {
            method8(var29, arg0.field2627, 25, 0, arg0.field2586, arg0.field2690);
        }
        for (int var31 = 4; var31 >= 0; var31--) {
            int var32 = method2374(arg0);
            boolean var33 = (var32 >> var31 + 1 & 0x1) != 0;
            String var34;
            if (!var33 && arg0.field2672 == null) {
                var34 = null;
            } else if (arg0.field2646 == null || arg0.field2646.length <= var31 || arg0.field2646[var31] == null || arg0.field2646[var31].trim().length() == 0) {
                var34 = null;
            } else {
                var34 = arg0.field2646[var31];
            }
            if (var34 != null) {
                method8(var34, arg0.field2627, 57, var31 + 1, arg0.field2586, arg0.field2690);
            }
        }
        if (class162.method2754(method2374(arg0))) {
            method8(class134.field2309, "", 30, 0, arg0.field2586, arg0.field2690);
        }
    }

    @ObfuscatedName("s.co(IIIIIIII)V")
    public static final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class158.method2760(arg0)) {
            method127(Statics.field2682[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("y.cj([Lfk;IIIIIIII)V")
    public static final void method127(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2626 || var9.field2641 == 0 || var9.field2652 || method2374(var9) != 0 || field658 == var9) && var9.field2661 == arg1 && (!var9.field2626 || !method1396(var9))) {
                int var10 = var9.field2590 + arg6;
                int var11 = var9.field2602 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2641 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2641 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2594 + var10;
                    int var19 = var9.field2595 + var11;
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
                    int var22 = var9.field2594 + var10;
                    int var23 = var9.field2595 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field657 == var9) {
                    field703 = true;
                    field719 = var10;
                    field667 = var11;
                }
                if (!var9.field2626 || var12 < var14 && var13 < var15) {
                    if (var9.field2589 == 1337) {
                        method394(var9);
                    } else if (var9.field2589 == 1338) {
                        method174(var10, var11);
                    } else {
                        if (var9.field2641 == 0) {
                            if (!var9.field2626 && method1396(var9) && Statics.field366 != var9) {
                                continue;
                            }
                            method127(arg0, var9.field2690, var12, var13, var14, var15, var10 - var9.field2680, var11 - var9.field2599);
                            if (var9.field2591 != null) {
                                method127(var9.field2591, var9.field2690, var12, var13, var14, var15, var10 - var9.field2680, var11 - var9.field2599);
                            }
                            class4 var24 = (class4) field647.method3348((long) var9.field2690);
                            if (var24 != null) {
                                method242(var24.field59, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2626) {
                            boolean var25;
                            if (class77.field1392 >= var12 && class77.field1393 >= var13 && class77.field1392 < var14 && class77.field1393 < var15) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            boolean var26 = false;
                            if (class77.field1397 == 1 && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            if (class77.field1398 == 1 && class77.field1399 >= var12 && class77.field1387 >= var13 && class77.field1399 < var14 && class77.field1387 < var15) {
                                var27 = true;
                            }
                            if (var27) {
                                method1381(var9, class77.field1399 - var10, class77.field1387 - var11);
                            }
                            if (field657 != null && field657 != var9 && var25) {
                                int var28 = method2374(var9);
                                boolean var29 = (var28 >> 20 & 0x1) != 0;
                                if (var29) {
                                    field661 = var9;
                                }
                            }
                            if (field658 == var9) {
                                field662 = true;
                                field561 = var10;
                                field664 = var11;
                            }
                            if (var9.field2652) {
                                if (var25 && field687 != 0 && var9.field2673 != null) {
                                    class1 var30 = new class1();
                                    var30.field2 = var9;
                                    var30.field4 = field687;
                                    var30.field18 = var9.field2673;
                                    field683.method3364(var30);
                                }
                                if (field657 != null || Statics.field1823 != null || field628) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (!var9.field2695 && var27) {
                                    var9.field2695 = true;
                                    if (var9.field2654 != null) {
                                        class1 var31 = new class1();
                                        var31.field2 = var9;
                                        var31.field3 = class77.field1399 - var10;
                                        var31.field4 = class77.field1387 - var11;
                                        var31.field18 = var9.field2654;
                                        field683.method3364(var31);
                                    }
                                }
                                if (var9.field2695 && var26 && var9.field2655 != null) {
                                    class1 var32 = new class1();
                                    var32.field2 = var9;
                                    var32.field3 = class77.field1392 - var10;
                                    var32.field4 = class77.field1393 - var11;
                                    var32.field18 = var9.field2655;
                                    field683.method3364(var32);
                                }
                                if (var9.field2695 && !var26) {
                                    var9.field2695 = false;
                                    if (var9.field2636 != null) {
                                        class1 var33 = new class1();
                                        var33.field2 = var9;
                                        var33.field3 = class77.field1392 - var10;
                                        var33.field4 = class77.field1393 - var11;
                                        var33.field18 = var9.field2636;
                                        field685.method3364(var33);
                                    }
                                }
                                if (var26 && var9.field2580 != null) {
                                    class1 var34 = new class1();
                                    var34.field2 = var9;
                                    var34.field3 = class77.field1392 - var10;
                                    var34.field4 = class77.field1393 - var11;
                                    var34.field18 = var9.field2580;
                                    field683.method3364(var34);
                                }
                                if (!var9.field2694 && var25) {
                                    var9.field2694 = true;
                                    if (var9.field2658 != null) {
                                        class1 var35 = new class1();
                                        var35.field2 = var9;
                                        var35.field3 = class77.field1392 - var10;
                                        var35.field4 = class77.field1393 - var11;
                                        var35.field18 = var9.field2658;
                                        field683.method3364(var35);
                                    }
                                }
                                if (var9.field2694 && var25 && var9.field2659 != null) {
                                    class1 var36 = new class1();
                                    var36.field2 = var9;
                                    var36.field3 = class77.field1392 - var10;
                                    var36.field4 = class77.field1393 - var11;
                                    var36.field18 = var9.field2659;
                                    field683.method3364(var36);
                                }
                                if (var9.field2694 && !var25) {
                                    var9.field2694 = false;
                                    if (var9.field2660 != null) {
                                        class1 var37 = new class1();
                                        var37.field2 = var9;
                                        var37.field3 = class77.field1392 - var10;
                                        var37.field4 = class77.field1393 - var11;
                                        var37.field18 = var9.field2660;
                                        field685.method3364(var37);
                                    }
                                }
                                if (var9.field2671 != null) {
                                    class1 var38 = new class1();
                                    var38.field2 = var9;
                                    var38.field18 = var9.field2671;
                                    field725.method3364(var38);
                                }
                                if (var9.field2630 != null && field671 > var9.field2665) {
                                    if (var9.field2612 == null || field671 - var9.field2665 > 32) {
                                        class1 var43 = new class1();
                                        var43.field2 = var9;
                                        var43.field18 = var9.field2630;
                                        field683.method3364(var43);
                                    } else {
                                        label436: for (int var39 = var9.field2665; var39 < field671; var39++) {
                                            int var40 = field670[var39 & 0x1F];
                                            for (int var41 = 0; var41 < var9.field2612.length; var41++) {
                                                if (var9.field2612[var41] == var40) {
                                                    class1 var42 = new class1();
                                                    var42.field2 = var9;
                                                    var42.field18 = var9.field2630;
                                                    field683.method3364(var42);
                                                    break label436;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2665 = field671;
                                }
                                if (var9.field2667 != null && field673 > var9.field2600) {
                                    if (var9.field2677 == null || field673 - var9.field2600 > 32) {
                                        class1 var48 = new class1();
                                        var48.field2 = var9;
                                        var48.field18 = var9.field2667;
                                        field683.method3364(var48);
                                    } else {
                                        label416: for (int var44 = var9.field2600; var44 < field673; var44++) {
                                            int var45 = field672[var44 & 0x1F];
                                            for (int var46 = 0; var46 < var9.field2677.length; var46++) {
                                                if (var9.field2677[var46] == var45) {
                                                    class1 var47 = new class1();
                                                    var47.field2 = var9;
                                                    var47.field18 = var9.field2667;
                                                    field683.method3364(var47);
                                                    break label416;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2600 = field673;
                                }
                                if (var9.field2669 != null && field675 > var9.field2699) {
                                    if (var9.field2670 == null || field675 - var9.field2699 > 32) {
                                        class1 var53 = new class1();
                                        var53.field2 = var9;
                                        var53.field18 = var9.field2669;
                                        field683.method3364(var53);
                                    } else {
                                        label396: for (int var49 = var9.field2699; var49 < field675; var49++) {
                                            int var50 = field674[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2670.length; var51++) {
                                                if (var9.field2670[var51] == var50) {
                                                    class1 var52 = new class1();
                                                    var52.field2 = var9;
                                                    var52.field18 = var9.field2669;
                                                    field683.method3364(var52);
                                                    break label396;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2699 = field675;
                                }
                                if (field676 > var9.field2696 && var9.field2674 != null) {
                                    class1 var54 = new class1();
                                    var54.field2 = var9;
                                    var54.field18 = var9.field2674;
                                    field683.method3364(var54);
                                }
                                if (field677 > var9.field2696 && var9.field2676 != null) {
                                    class1 var55 = new class1();
                                    var55.field2 = var9;
                                    var55.field18 = var9.field2676;
                                    field683.method3364(var55);
                                }
                                if (field678 > var9.field2696 && var9.field2583 != null) {
                                    class1 var56 = new class1();
                                    var56.field2 = var9;
                                    var56.field18 = var9.field2583;
                                    field683.method3364(var56);
                                }
                                if (field679 > var9.field2696 && var9.field2678 != null) {
                                    class1 var57 = new class1();
                                    var57.field2 = var9;
                                    var57.field18 = var9.field2678;
                                    field683.method3364(var57);
                                }
                                var9.field2696 = field669;
                                if (var9.field2675 != null) {
                                    for (int var58 = 0; var58 < field654; var58++) {
                                        class1 var59 = new class1();
                                        var59.field2 = var9;
                                        var59.field1 = field709[var58];
                                        var59.field8 = field707[var58];
                                        var59.field18 = var9.field2675;
                                        field683.method3364(var59);
                                    }
                                }
                            }
                        }
                        if (!var9.field2626) {
                            if (field657 != null || Statics.field1823 != null || field628) {
                                return;
                            }
                            if ((var9.field2684 >= 0 || var9.field2698 != 0) && class77.field1392 >= var12 && class77.field1393 >= var13 && class77.field1392 < var14 && class77.field1393 < var15) {
                                if (var9.field2684 >= 0) {
                                    Statics.field366 = arg0[var9.field2684];
                                } else {
                                    Statics.field366 = var9;
                                }
                            }
                            if (var9.field2641 == 8 && class77.field1392 >= var12 && class77.field1393 >= var13 && class77.field1392 < var14 && class77.field1393 < var15) {
                                Statics.field1271 = var9;
                            }
                            if (var9.field2601 > var9.field2595) {
                                int var60 = var9.field2594 + var10;
                                int var61 = var9.field2595;
                                int var62 = var9.field2601;
                                int var63 = class77.field1392;
                                int var64 = class77.field1393;
                                if (field570) {
                                    field571 = 32;
                                } else {
                                    field571 = 0;
                                }
                                field570 = false;
                                if (class77.field1397 != 0) {
                                    if (var63 >= var60 && var63 < var60 + 16 && var64 >= var11 && var64 < var11 + 16) {
                                        var9.field2599 -= 4;
                                        method394(var9);
                                    } else if (var63 >= var60 && var63 < var60 + 16 && var64 >= var11 + var61 - 16 && var64 < var11 + var61) {
                                        var9.field2599 += 4;
                                        method394(var9);
                                    } else if (var63 >= var60 - field571 && var63 < field571 + var60 + 16 && var64 >= var11 + 16 && var64 < var11 + var61 - 16) {
                                        int var65 = (var61 - 32) * var61 / var62;
                                        if (var65 < 8) {
                                            var65 = 8;
                                        }
                                        int var66 = var64 - var11 - 16 - var65 / 2;
                                        int var67 = var61 - 32 - var65;
                                        var9.field2599 = (var62 - var61) * var66 / var67;
                                        method394(var9);
                                        field570 = true;
                                    }
                                }
                                if (field687 != 0) {
                                    int var68 = var9.field2594;
                                    if (var63 >= var60 - var68 && var64 >= var11 && var63 < var60 + 16 && var64 <= var11 + var61) {
                                        var9.field2599 += field687 * 45;
                                        method394(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ch.cz([Lfk;II)V")
    public static final void method2072(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2641 == 0) {
                    if (var3.field2591 != null) {
                        method2072(var3.field2591, arg1);
                    }
                    class4 var4 = (class4) field647.method3348((long) var3.field2690);
                    if (var4 != null) {
                        int var5 = var4.field59;
                        if (class158.method2760(var5)) {
                            method2072(Statics.field2682[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2585 != null) {
                    class1 var6 = new class1();
                    var6.field2 = var3;
                    var6.field18 = var3.field2585;
                    class26.method820(var6);
                }
                if (arg1 == 1 && var3.field2679 != null) {
                    if (var3.field2586 >= 0) {
                        class158 var7 = class158.method821(var3.field2690);
                        if (var7 == null || var7.field2591 == null || var3.field2586 >= var7.field2591.length || var7.field2591[var3.field2586] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field2 = var3;
                    var8.field18 = var3.field2679;
                    class26.method820(var8);
                }
            }
        }
    }

    @ObfuscatedName("bl.cd(Lfk;IIB)V")
    public static final void method1381(class158 arg0, int arg1, int arg2) {
        if (field657 != null || field628 || arg0 == null || method2227(arg0) == null) {
            return;
        }
        field657 = arg0;
        field658 = method2227(arg0);
        field624 = arg1;
        field660 = arg2;
        Statics.field782 = 0;
        field595 = false;
    }

    @ObfuscatedName("u.cp(S)V")
    public static final void method223() {
        method394(field657);
        Statics.field782++;
        if (field703 && field662) {
            int var0 = class77.field1392;
            int var1 = class77.field1393;
            int var2 = var0 - field624;
            int var3 = var1 - field660;
            if (var2 < field561) {
                var2 = field561;
            }
            if (field657.field2594 + var2 > field561 + field658.field2594) {
                var2 = field561 + field658.field2594 - field657.field2594;
            }
            if (var3 < field664) {
                var3 = field664;
            }
            if (field657.field2595 + var3 > field664 + field658.field2595) {
                var3 = field664 + field658.field2595 - field657.field2595;
            }
            int var4 = var2 - field719;
            int var5 = var3 - field667;
            int var6 = field657.field2648;
            if (Statics.field782 > field657.field2649 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field595 = true;
            }
            int var7 = field658.field2680 + (var2 - field561);
            int var8 = field658.field2599 + (var3 - field664);
            if (field657.field2681 != null && field595) {
                class1 var9 = new class1();
                var9.field2 = field657;
                var9.field3 = var7;
                var9.field4 = var8;
                var9.field18 = field657.field2681;
                class26.method820(var9);
            }
            if (class77.field1397 == 0) {
                if (field595) {
                    if (field657.field2668 != null) {
                        class1 var10 = new class1();
                        var10.field2 = field657;
                        var10.field3 = var7;
                        var10.field4 = var8;
                        var10.field6 = field661;
                        var10.field18 = field657.field2668;
                        class26.method820(var10);
                    }
                    if (field661 != null) {
                        class158 var11 = field657;
                        int var12 = class162.method1439(method2374(var11));
                        class158 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class158.method821(var11.field2661);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field540.method2352(95);
                            field540.method2694(field661.field2586);
                            field540.method2670(field657.field2690);
                            field540.method2670(field661.field2690);
                            field540.method2537(field657.field2586);
                        }
                    }
                } else if ((field627 == 1 || method133(field629 - 1)) && field629 > 2) {
                    method241();
                } else if (field629 > 0) {
                    method165(field629 - 1);
                }
                field657 = null;
            }
        } else if (Statics.field782 > 1) {
            field657 = null;
        }
    }

    @ObfuscatedName("client.ci(Lfk;I)V")
    public static void method394(class158 arg0) {
        if (field688 == arg0.field2701) {
            field689[arg0.field2657] = true;
        }
    }

    @ObfuscatedName("d.cn(I)V")
    public static void method118() {
        for (class4 var0 = (class4) field647.method3351(); var0 != null; var0 = (class4) field647.method3352()) {
            int var1 = var0.field59;
            if (class158.method2760(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2682[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2626;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2818;
                    class158 var6 = class158.method821(var5);
                    if (var6 != null) {
                        method394(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.cr(Lfk;I)Lfk;")
    public static class158 method2227(class158 arg0) {
        class158 var1 = arg0;
        int var2 = class162.method1439(method2374(arg0));
        class158 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class158.method821(var1.field2661);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class158 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2647;
        }
        return var5;
    }

    @ObfuscatedName("ce.cy([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2165(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("g.ct(IS)V")
    public static final void method38(int arg0) {
        if (!class158.method2760(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2682[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3 != null) {
                var3.field2691 = 0;
                var3.field2692 = 0;
            }
        }
    }

    @ObfuscatedName("c.ch(IB)V")
    public static final void method89(int arg0) {
        if (class158.method2760(arg0)) {
            method1894(Statics.field2682[arg0], -1);
        }
    }

    @ObfuscatedName("cy.ck([Lfk;IB)V")
    public static final void method1894(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2661 == arg1 && (!var3.field2626 || !method1396(var3))) {
                if (var3.field2641 == 0) {
                    if (!var3.field2626 && method1396(var3) && Statics.field366 != var3) {
                        continue;
                    }
                    method1894(arg0, var3.field2690);
                    if (var3.field2591 != null) {
                        method1894(var3.field2591, var3.field2690);
                    }
                    class4 var4 = (class4) field647.method3348((long) var3.field2690);
                    if (var4 != null) {
                        method89(var4.field59);
                    }
                }
                if (var3.field2641 == 6) {
                    if (var3.field2650 != -1 || var3.field2587 != -1) {
                        boolean var5 = method30(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2587;
                        } else {
                            var6 = var3.field2650;
                        }
                        if (var6 != -1) {
                            class34 var7 = class34.method1443(var6);
                            var3.field2692 += field510;
                            while (var3.field2692 > var7.field895[var3.field2691]) {
                                var3.field2692 -= var7.field895[var3.field2691];
                                var3.field2691++;
                                if (var3.field2691 >= var7.field893.length) {
                                    var3.field2691 -= var7.field906;
                                    if (var3.field2691 < 0 || var3.field2691 >= var7.field893.length) {
                                        var3.field2691 = 0;
                                    }
                                }
                                method394(var3);
                            }
                        }
                    }
                    if (var3.field2629 != 0 && !var3.field2626) {
                        int var8 = var3.field2629 >> 16;
                        int var9 = var3.field2629 << 16 >> 16;
                        int var10 = field510 * var8;
                        int var11 = field510 * var9;
                        var3.field2625 = var3.field2625 + var10 & 0x7FF;
                        var3.field2584 = var3.field2584 + var11 & 0x7FF;
                        method394(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.cb(IB)V")
    public static final void method219(int arg0) {
        method118();
        class7.method25();
        int var1 = class42.method102(arg0).field1044;
        if (var1 == 0) {
            return;
        }
        int var2 = class159.field2705[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class104.method2175(0.9D);
                ((class110) Statics.field1781).method2254(0.9D);
            }
            if (var2 == 2) {
                class104.method2175(0.8D);
                ((class110) Statics.field1781).method2254(0.8D);
            }
            if (var2 == 3) {
                class104.method2175(0.7D);
                ((class110) Statics.field1781).method2254(0.7D);
            }
            if (var2 == 4) {
                class104.method2175(0.6D);
                ((class110) Statics.field1781).method2254(0.6D);
            }
            class40.method655();
        }
        if (var1 == 3) {
            short var3 = 0;
            if (var2 == 0) {
                var3 = 255;
            }
            if (var2 == 1) {
                var3 = 192;
            }
            if (var2 == 2) {
                var3 = 128;
            }
            if (var2 == 3) {
                var3 = 64;
            }
            if (var2 == 4) {
                var3 = 0;
            }
            if (field652 != var3) {
                if (field652 == 0 && field722 != -1) {
                    class138.method2756(Statics.field1028, field722, 0, var3, false);
                    field537 = false;
                } else if (var3 == 0) {
                    class138.method2252();
                    field537 = false;
                } else if (class138.field2332 == 0) {
                    Statics.field2333.method2822(var3);
                } else {
                    Statics.field2336 = var3;
                }
                field652 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field724 = 127;
            }
            if (var2 == 1) {
                field724 = 96;
            }
            if (var2 == 2) {
                field724 = 64;
            }
            if (var2 == 3) {
                field724 = 32;
            }
            if (var2 == 4) {
                field724 = 0;
            }
        }
        if (var1 == 5) {
            field627 = var2;
        }
        if (var1 == 6) {
            field525 = var2;
        }
        if (var1 == 9) {
            field649 = var2;
        }
        if (var1 != 10) {
            return;
        }
        if (var2 == 0) {
            field496 = 127;
        }
        if (var2 == 1) {
            field496 = 96;
        }
        if (var2 == 2) {
            field496 = 64;
        }
        if (var2 == 3) {
            field496 = 32;
        }
        if (var2 == 4) {
            field496 = 0;
        }
    }

    @ObfuscatedName("aq.cg(Lfk;I)V")
    public static final void method798(class158 arg0) {
        int var1 = arg0.field2589;
        if (var1 == 324) {
            if (field580 == -1) {
                field580 = arg0.field2609;
                field747 = arg0.field2610;
            }
            if (field745.field2725) {
                arg0.field2609 = field580;
            } else {
                arg0.field2609 = field747;
            }
        } else if (var1 == 325) {
            if (field580 == -1) {
                field580 = arg0.field2609;
                field747 = arg0.field2610;
            }
            if (field745.field2725) {
                arg0.field2609 = field747;
            } else {
                arg0.field2609 = field580;
            }
        } else if (var1 == 327) {
            arg0.field2625 = 150;
            arg0.field2584 = (int) (Math.sin((double) field491 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2617 = 5;
            arg0.field2618 = 0;
        } else if (var1 == 328) {
            arg0.field2625 = 150;
            arg0.field2584 = (int) (Math.sin((double) field491 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2617 = 5;
            arg0.field2618 = 1;
        }
    }

    @ObfuscatedName("q.cm(B)V")
    public static final void method213() {
        field540.method2352(159);
        for (class4 var0 = (class4) field647.method3351(); var0 != null; var0 = (class4) field647.method3352()) {
            if (var0.field60 == 0 || var0.field60 == 3) {
                method236(var0, true);
            }
        }
        if (field650 != null) {
            method394(field650);
            field650 = null;
        }
    }

    @ObfuscatedName("t.cw(Lj;ZI)V")
    public static final void method236(class4 arg0, boolean arg1) {
        int var2 = arg0.field59;
        int var3 = (int) arg0.field2818;
        arg0.method3409();
        if (arg1) {
            Statics.method912(var2);
        }
        for (class171 var4 = (class171) field696.method3351(); var4 != null; var4 = (class171) field696.method3352()) {
            if ((long) var2 == (var4.field2818 >> 48 & 0xFFFFL)) {
                var4.method3409();
            }
        }
        class158 var5 = class158.method821(var3);
        if (var5 != null) {
            method394(var5);
        }
        method715();
        if (field721 != -1) {
            int var6 = field721;
            if (class158.method2760(var6)) {
                method2072(Statics.field2682[var6], 1);
            }
        }
    }

    @ObfuscatedName("ai.ce(Lfk;I)Z")
    public static final boolean method848(class158 arg0) {
        int var1 = arg0.field2589;
        if (var1 == 205) {
            field533 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field745.method3231(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field745.method3249(var4, var5 == 1);
        }
        if (var1 == 324) {
            field745.method3242(false);
        }
        if (var1 == 325) {
            field745.method3242(true);
        }
        if (var1 == 326) {
            field540.method2352(210);
            field745.method3256(field540);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("a.cc(IIIILco;S)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method10(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field560 + field497 & 0x7FF;
        int var7 = class104.field1769[var6];
        int var8 = class104.field1787[var6];
        int var9 = var7 * 256 / (field562 + 256);
        int var10 = var8 * 256 / (field562 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field2032.method1732(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("v.cv(IIIILco;I)V")
    public static final void method10(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field560 + field497 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1769[var5];
        int var8 = class104.field1787[var5];
        int var9 = var7 * 256 / (field562 + 256);
        int var10 = var8 * 256 / (field562 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1735(Statics.field2452, arg0 + 94 + var11 - arg4.field1482 / 2 + 4, arg1 + 83 - var12 - arg4.field1478 / 2 - 4);
        } else {
            arg4.method1721(arg0 + 94 + var11 - arg4.field1482 / 2 + 4, arg1 + 83 - var12 - arg4.field1478 / 2 - 4);
        }
    }

    @ObfuscatedName("v.dc(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method11(int arg0, String arg1, String arg2) {
        method693(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ak.dg(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method693(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field697[var4] = field697[var4 - 1];
            field577[var4] = field577[var4 - 1];
            field700[var4] = field700[var4 - 1];
            field699[var4] = field699[var4 - 1];
        }
        field697[0] = arg0;
        field577[0] = arg1;
        field700[0] = arg2;
        field699[0] = arg3;
        field701++;
        field676 = field669;
    }

    @ObfuscatedName("x.dy(Ljava/lang/String;I)Z")
    public static boolean method147(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method1395(arg0, Statics.field484);
        for (int var2 = 0; var2 < field738; var2++) {
            if (var1.equalsIgnoreCase(class148.method1395(field741[var2].field381, Statics.field484))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class148.method1395(Statics.field885.field58, Statics.field484))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("j.de(Ljava/lang/String;B)Z")
    public static boolean method24(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method1395(arg0, Statics.field484);
        for (int var2 = 0; var2 < field523; var2++) {
            class11 var3 = field744[var2];
            if (var1.equalsIgnoreCase(class148.method1395(var3.field192, Statics.field484))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method1395(var3.field188, Statics.field484))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("g.dk(Ljava/lang/String;I)V")
    public static final void method48(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class148.method1395(arg0, Statics.field484);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field738; var2++) {
            class23 var3 = field741[var2];
            String var4 = var3.field381;
            String var5 = class148.method1395(var4, Statics.field484);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field738--;
                for (int var7 = var2; var7 < field738; var7++) {
                    field741[var7] = field741[var7 + 1];
                }
                field677 = field669;
                field540.method2352(85);
                field540.method2477(class127.method12(arg0));
                field540.method2535(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("u.dj(Ljava/lang/String;II)V")
    public static final void method225(String arg0, int arg1) {
        field540.method2352(121);
        field540.method2477(class127.method12(arg0) + 1);
        field540.method2535(arg0);
        field540.method2513(arg1);
    }

    @ObfuscatedName("cs.db(Ljava/lang/String;I)V")
    public static final void method1620(String arg0) {
        if (!arg0.equals("")) {
            field540.method2352(160);
            field540.method2477(class127.method12(arg0));
            field540.method2535(arg0);
        }
    }

    @ObfuscatedName("u.dl(B)V")
    public static final void method227() {
        field540.method2352(160);
        field540.method2477(0);
    }

    @ObfuscatedName("dd.dr(Lfk;B)I")
    public static int method2374(class158 arg0) {
        class171 var1 = (class171) field696.method3348(((long) arg0.field2690 << 32) + (long) arg0.field2586);
        return var1 == null ? arg0.field2644 : var1.field2801;
    }

    @ObfuscatedName("bf.dz(Lfk;B)Z")
    public static boolean method1396(class158 arg0) {
        if (field608) {
            if (method2374(arg0) != 0) {
                return false;
            }
            if (arg0.field2641 == 0) {
                return false;
            }
        }
        return arg0.field2597;
    }

    @ObfuscatedName("d.dh(Lfk;II)Ljava/lang/String;")
    public static String method119(class158 arg0, int arg1) {
        int var2 = method2374(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2672 == null) {
            return null;
        } else if (arg0.field2646 == null || arg0.field2646.length <= arg1 || arg0.field2646[arg1] == null || arg0.field2646[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2646[arg1];
        }
    }
}

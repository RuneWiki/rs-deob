package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class72 {

    @ObfuscatedName("client.w")
    public static class163[] field536 = new class163[4];

    @ObfuscatedName("client.h")
    public static boolean field616 = true;

    @ObfuscatedName("client.v")
    public static int field475 = 1;

    @ObfuscatedName("client.g")
    public static int field612 = 0;

    @ObfuscatedName("client.o")
    public static boolean field478 = false;

    @ObfuscatedName("client.u")
    public static boolean field634 = false;

    @ObfuscatedName("client.z")
    public static int field559 = 0;

    @ObfuscatedName("client.e")
    public static int field481 = 1;

    @ObfuscatedName("client.m")
    public static int field483 = 0;

    @ObfuscatedName("client.s")
    public static boolean field484 = true;

    @ObfuscatedName("client.i")
    public static int field568 = 0;

    @ObfuscatedName("client.d")
    public static long field486 = 1L;

    @ObfuscatedName("client.a")
    public static int field487 = -1;

    @ObfuscatedName("client.r")
    public static int field488 = -1;

    @ObfuscatedName("client.t")
    public static int field489 = -1;

    @ObfuscatedName("client.b")
    public static boolean field490 = true;

    @ObfuscatedName("client.q")
    public static boolean field689 = false;

    @ObfuscatedName("client.ae")
    public static int field492 = 0;

    @ObfuscatedName("client.at")
    public static int field538 = 0;

    @ObfuscatedName("client.aj")
    public static int field494 = 0;

    @ObfuscatedName("client.aq")
    public static int field495 = 0;

    @ObfuscatedName("client.ac")
    public static int field608 = 0;

    @ObfuscatedName("client.az")
    public static int field621 = 0;

    @ObfuscatedName("client.ao")
    public static int field498 = 0;

    @ObfuscatedName("client.am")
    public static int field499 = 0;

    @ObfuscatedName("client.ad")
    public static int field500 = 0;

    @ObfuscatedName("client.an")
    public static class126 field501 = new class126(new byte[5000]);

    @ObfuscatedName("client.af")
    public static int field502 = 0;

    @ObfuscatedName("client.av")
    public static int field613 = 0;

    @ObfuscatedName("client.ay")
    public static int field505 = 0;

    @ObfuscatedName("client.bl")
    public static int field508 = 0;

    @ObfuscatedName("client.bu")
    public static int field685 = 0;

    @ObfuscatedName("client.bg")
    public static int field510 = 0;

    @ObfuscatedName("client.bb")
    public static int field511 = 0;

    @ObfuscatedName("client.bj")
    public static int field512 = 0;

    @ObfuscatedName("client.by")
    public static class24[] field515 = new class24[32768];

    @ObfuscatedName("client.bk")
    public static int field516 = 0;

    @ObfuscatedName("client.bi")
    public static int[] field628 = new int[32768];

    @ObfuscatedName("client.cs")
    public static class115 field518 = new class115(5000);

    @ObfuscatedName("client.cq")
    public static class115 field493 = new class115(5000);

    @ObfuscatedName("client.cx")
    public static class115 field520 = new class115(5000);

    @ObfuscatedName("client.ck")
    public static int field521 = 0;

    @ObfuscatedName("client.cd")
    public static int field522 = 0;

    @ObfuscatedName("client.ct")
    public static int field523 = 0;

    @ObfuscatedName("client.cb")
    public static int field480 = 0;

    @ObfuscatedName("client.cl")
    public static int field533 = 0;

    @ObfuscatedName("client.cc")
    public static int field526 = 0;

    @ObfuscatedName("client.cw")
    public static int field652 = 0;

    @ObfuscatedName("client.cy")
    public static int field528 = 0;

    @ObfuscatedName("client.co")
    public static boolean field529 = false;

    @ObfuscatedName("client.ch")
    public static int field530 = 0;

    @ObfuscatedName("client.cf")
    public static int field531 = 0;

    @ObfuscatedName("client.cv")
    public static int field532 = 1;

    @ObfuscatedName("client.cz")
    public static int field477 = 0;

    @ObfuscatedName("client.db")
    public static int field722 = 1;

    @ObfuscatedName("client.dy")
    public static int field535 = 0;

    @ObfuscatedName("client.dj")
    public static boolean field519 = false;

    @ObfuscatedName("client.dk")
    public static int[][][] field507 = new int[4][13][13];

    @ObfuscatedName("client.dl")
    public static final int[] field540 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dr")
    public static int field637 = 0;

    @ObfuscatedName("client.dz")
    public static int[][] field727 = new int[104][104];

    @ObfuscatedName("client.du")
    public static int[][] field543 = new int[104][104];

    @ObfuscatedName("client.dh")
    public static int[] field544 = new int[4000];

    @ObfuscatedName("client.dx")
    public static int[] field545 = new int[4000];

    @ObfuscatedName("client.dq")
    public static int field546 = 0;

    @ObfuscatedName("client.dc")
    public static int field633 = 2;

    @ObfuscatedName("client.dv")
    public static int field548 = 0;

    @ObfuscatedName("client.dd")
    public static int field551 = 2;

    @ObfuscatedName("client.dn")
    public static int field550 = 0;

    @ObfuscatedName("client.da")
    public static int field739 = 1;

    @ObfuscatedName("client.dg")
    public static int field552 = 0;

    @ObfuscatedName("client.ea")
    public static int field537 = 0;

    @ObfuscatedName("client.el")
    public static int field554 = 2;

    @ObfuscatedName("client.ez")
    public static int field555 = 0;

    @ObfuscatedName("client.eo")
    public static int field556 = 1;

    @ObfuscatedName("client.ej")
    public static int field557 = 0;

    @ObfuscatedName("client.eu")
    public static int field558 = 0;

    @ObfuscatedName("client.en")
    public static int field479 = 2301979;

    @ObfuscatedName("client.ef")
    public static int field560 = 5063219;

    @ObfuscatedName("client.fn")
    public static int field561 = 3353893;

    @ObfuscatedName("client.fx")
    public static int field692 = 7759444;

    @ObfuscatedName("client.fl")
    public static boolean field563 = false;

    @ObfuscatedName("client.fs")
    public static int field641 = 0;

    @ObfuscatedName("client.fy")
    public static int field565 = 128;

    @ObfuscatedName("client.fb")
    public static int field671 = 0;

    @ObfuscatedName("client.ff")
    public static int field567 = 0;

    @ObfuscatedName("client.ft")
    public static int field524 = 0;

    @ObfuscatedName("client.fu")
    public static int field569 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field604 = false;

    @ObfuscatedName("client.fh")
    public static int field571 = 0;

    @ObfuscatedName("client.fk")
    public static int field572 = 0;

    @ObfuscatedName("client.fv")
    public static int field573 = 50;

    @ObfuscatedName("client.fj")
    public static int[] field574 = new int[field573];

    @ObfuscatedName("client.fi")
    public static int[] field575 = new int[field573];

    @ObfuscatedName("client.fp")
    public static int[] field576 = new int[field573];

    @ObfuscatedName("client.fg")
    public static int[] field662 = new int[field573];

    @ObfuscatedName("client.fr")
    public static int[] field578 = new int[field573];

    @ObfuscatedName("client.fz")
    public static int[] field579 = new int[field573];

    @ObfuscatedName("client.gw")
    public static int[] field580 = new int[field573];

    @ObfuscatedName("client.gu")
    public static String[] field664 = new String[field573];

    @ObfuscatedName("client.gg")
    public static int[][] field582 = new int[104][104];

    @ObfuscatedName("client.gz")
    public static int field583 = 0;

    @ObfuscatedName("client.ge")
    public static int field584 = -1;

    @ObfuscatedName("client.gi")
    public static int field476 = -1;

    @ObfuscatedName("client.go")
    public static int field622 = 0;

    @ObfuscatedName("client.gt")
    public static int field587 = 0;

    @ObfuscatedName("client.gj")
    public static int field674 = 0;

    @ObfuscatedName("client.gd")
    public static int field589 = 0;

    @ObfuscatedName("client.gb")
    public static int field590 = 0;

    @ObfuscatedName("client.gr")
    public static int field593 = 0;

    @ObfuscatedName("client.gp")
    public static int field592 = 0;

    @ObfuscatedName("client.gl")
    public static int field614 = 0;

    @ObfuscatedName("client.gv")
    public static int field606 = 0;

    @ObfuscatedName("client.gx")
    public static int field595 = 0;

    @ObfuscatedName("client.gc")
    public static boolean field585 = false;

    @ObfuscatedName("client.gq")
    public static int field597 = 0;

    @ObfuscatedName("client.gf")
    public static int field598 = 0;

    @ObfuscatedName("client.gm")
    public static class3[] field599 = new class3[2048];

    @ObfuscatedName("client.gn")
    public static int field600 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field601 = new int[2048];

    @ObfuscatedName("client.hp")
    public static int field602 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field603 = new int[2048];

    @ObfuscatedName("client.ht")
    public static class126[] field504 = new class126[2048];

    @ObfuscatedName("client.hh")
    public static int field605 = -1;

    @ObfuscatedName("client.hg")
    public static int field491 = 0;

    @ObfuscatedName("client.hz")
    public static int field607 = 0;

    @ObfuscatedName("client.hj")
    public static int[] field695 = new int[1000];

    @ObfuscatedName("client.hf")
    public static final int[] field609 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hy")
    public static String[] field691 = new String[8];

    @ObfuscatedName("client.hd")
    public static boolean[] field611 = new boolean[8];

    @ObfuscatedName("client.hr")
    public static int[] field586 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hq")
    public static class176[][][] field733 = new class176[4][104][104];

    @ObfuscatedName("client.hl")
    public static class176 field681 = new class176();

    @ObfuscatedName("client.hk")
    public static class176 field615 = new class176();

    @ObfuscatedName("client.hm")
    public static class176 field636 = new class176();

    @ObfuscatedName("client.hs")
    public static int[] field709 = new int[25];

    @ObfuscatedName("client.hu")
    public static int[] field618 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field619 = new int[25];

    @ObfuscatedName("client.hc")
    public static int field620 = 0;

    @ObfuscatedName("client.hx")
    public static boolean field473 = false;

    @ObfuscatedName("client.is")
    public static int field547 = 0;

    @ObfuscatedName("client.ip")
    public static int[] field623 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field624 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field625 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field626 = new int[500];

    @ObfuscatedName("client.ir")
    public static String[] field627 = new String[500];

    @ObfuscatedName("client.ia")
    public static String[] field539 = new String[500];

    @ObfuscatedName("client.in")
    public static int field629 = -1;

    @ObfuscatedName("client.iv")
    public static int field527 = -1;

    @ObfuscatedName("client.im")
    public static int field631 = 0;

    @ObfuscatedName("client.io")
    public static int field632 = 50;

    @ObfuscatedName("client.ie")
    public static int field687 = 0;

    @ObfuscatedName("client.ix")
    public static String field672 = null;

    @ObfuscatedName("client.il")
    public static boolean field562 = false;

    @ObfuscatedName("client.it")
    public static int field513 = -1;

    @ObfuscatedName("client.ib")
    public static String field534 = null;

    @ObfuscatedName("client.ja")
    public static String field638 = null;

    @ObfuscatedName("client.jx")
    public static int field639 = -1;

    @ObfuscatedName("client.jk")
    public static class174 field640 = new class174(8);

    @ObfuscatedName("client.jp")
    public static int field566 = 0;

    @ObfuscatedName("client.ji")
    public static int field642 = 0;

    @ObfuscatedName("client.jl")
    public static class157 field643 = null;

    @ObfuscatedName("client.jv")
    public static int field644 = 0;

    @ObfuscatedName("client.jf")
    public static int field645 = 0;

    @ObfuscatedName("client.jq")
    public static int field474 = 0;

    @ObfuscatedName("client.jd")
    public static boolean field594 = false;

    @ObfuscatedName("client.jo")
    public static boolean field648 = false;

    @ObfuscatedName("client.jc")
    public static boolean field649 = false;

    @ObfuscatedName("client.jm")
    public static class157 field650 = null;

    @ObfuscatedName("client.jt")
    public static class157 field485 = null;

    @ObfuscatedName("client.jr")
    public static int field688 = 0;

    @ObfuscatedName("client.jz")
    public static int field653 = 0;

    @ObfuscatedName("client.ju")
    public static class157 field654 = null;

    @ObfuscatedName("client.jn")
    public static boolean field655 = false;

    @ObfuscatedName("client.je")
    public static int field656 = -1;

    @ObfuscatedName("client.jh")
    public static int field657 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field658 = false;

    @ObfuscatedName("client.jw")
    public static int field659 = -1;

    @ObfuscatedName("client.jb")
    public static int field472 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field661 = false;

    @ObfuscatedName("client.kj")
    public static int field729 = 1;

    @ObfuscatedName("client.ke")
    public static int[] field663 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field509 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field665 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field666 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field496 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field668 = 0;

    @ObfuscatedName("client.kv")
    public static int field669 = 0;

    @ObfuscatedName("client.km")
    public static int field588 = 0;

    @ObfuscatedName("client.ku")
    public static int field596 = 0;

    @ObfuscatedName("client.kk")
    public static int field725 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field673 = new int[2000];

    @ObfuscatedName("client.kd")
    public static String[] field682 = new String[1000];

    @ObfuscatedName("client.ki")
    public static int field675 = 0;

    @ObfuscatedName("client.kr")
    public static class176 field676 = new class176();

    @ObfuscatedName("client.kz")
    public static class176 field677 = new class176();

    @ObfuscatedName("client.ka")
    public static class176 field678 = new class176();

    @ObfuscatedName("client.kx")
    public static class174 field610 = new class174(512);

    @ObfuscatedName("client.kl")
    public static int field680 = 0;

    @ObfuscatedName("client.kg")
    public static int field651 = -2;

    @ObfuscatedName("client.lo")
    public static boolean[] field617 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field683 = new boolean[100];

    @ObfuscatedName("client.ly")
    public static boolean[] field541 = new boolean[100];

    @ObfuscatedName("client.ln")
    public static int[] field660 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field686 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field670 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field553 = new int[100];

    @ObfuscatedName("client.lb")
    public static int field581 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field690 = new int[100];

    @ObfuscatedName("client.lr")
    public static String[] field497 = new String[100];

    @ObfuscatedName("client.lp")
    public static String[] field719 = new String[100];

    @ObfuscatedName("client.la")
    public static String[] field693 = new String[100];

    @ObfuscatedName("client.lt")
    public static int field694 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field482 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lc")
    public static int field696 = 0;

    @ObfuscatedName("client.ld")
    public static int field697 = 0;

    @ObfuscatedName("client.lg")
    public static long[] field698 = new long[100];

    @ObfuscatedName("client.lk")
    public static int field699 = 0;

    @ObfuscatedName("client.lf")
    public static int field700 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field701 = new int[128];

    @ObfuscatedName("client.lu")
    public static int[] field702 = new int[128];

    @ObfuscatedName("client.ls")
    public static long field707 = -1L;

    @ObfuscatedName("client.mn")
    public static String field704 = null;

    @ObfuscatedName("client.mb")
    public static String field684 = null;

    @ObfuscatedName("client.mm")
    public static int field706 = -1;

    @ObfuscatedName("client.mo")
    public static int field647 = 0;

    @ObfuscatedName("client.mr")
    public static int[] field708 = new int[1000];

    @ObfuscatedName("client.mv")
    public static int[] field577 = new int[1000];

    @ObfuscatedName("client.mw")
    public static class85[] field710 = new class85[1000];

    @ObfuscatedName("client.mi")
    public static int field703 = 0;

    @ObfuscatedName("client.mx")
    public static int field712 = 0;

    @ObfuscatedName("client.mz")
    public static int field713 = 0;

    @ObfuscatedName("client.mt")
    public static int field714 = 255;

    @ObfuscatedName("client.mc")
    public static int field564 = -1;

    @ObfuscatedName("client.mk")
    public static boolean field716 = false;

    @ObfuscatedName("client.ms")
    public static int field717 = 127;

    @ObfuscatedName("client.mh")
    public static int field718 = 127;

    @ObfuscatedName("client.nk")
    public static int field549 = 0;

    @ObfuscatedName("client.nn")
    public static int[] field720 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field721 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field525 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field723 = new int[50];

    @ObfuscatedName("client.nv")
    public static class56[] field724 = new class56[50];

    @ObfuscatedName("client.no")
    public static boolean field591 = false;

    @ObfuscatedName("client.ng")
    public static boolean[] field726 = new boolean[5];

    @ObfuscatedName("client.ni")
    public static int[] field667 = new int[5];

    @ObfuscatedName("client.nb")
    public static int[] field728 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field715 = new int[5];

    @ObfuscatedName("client.oe")
    public static int[] field730 = new int[5];

    @ObfuscatedName("client.or")
    public static int field731 = 0;

    @ObfuscatedName("client.oy")
    public static int field732 = 0;

    @ObfuscatedName("client.oc")
    public static class22[] field542 = new class22[200];

    @ObfuscatedName("client.og")
    public static class172 field734 = new class172();

    @ObfuscatedName("client.oq")
    public static int field735 = 0;

    @ObfuscatedName("client.oo")
    public static class11[] field736 = new class11[100];

    @ObfuscatedName("client.oa")
    public static class162 field737 = new class162();

    @ObfuscatedName("client.os")
    public static int field738 = -1;

    @ObfuscatedName("client.ox")
    public static int field517 = -1;

    @ObfuscatedName("client.h(I)V")
    public final void method246() {
    }

    public final void init() {
        if (!this.method1389()) {
            return;
        }
        class166[] var1 = new class166[] { class166.field2772, class166.field2776, class166.field2768, class166.field2771, class166.field2767, class166.field2769, class166.field2775, class166.field2770, class166.field2774 };
        class166[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class166 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2773);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2773)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class2.field38)) {
                            field481 = 1;
                        } else {
                            field481 = 0;
                        }
                        break;
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field38)) {
                            field478 = true;
                        } else {
                            field478 = false;
                        }
                        break;
                    case 3:
                        field612 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field635 = var5;
                        break;
                    case 5:
                        field559 = Integer.parseInt(var5);
                        break;
                    case 6:
                        class132[] var12 = class132.method649();
                        int var13 = Integer.parseInt(var5);
                        class132[] var14 = var12;
                        int var15 = 0;
                        class132 var17;
                        while (true) {
                            if (var15 >= var14.length) {
                                var17 = null;
                                break;
                            }
                            class132 var16 = var14[var15];
                            if (var13 == var16.method2288()) {
                                var17 = var16;
                                break;
                            }
                            var15++;
                        }
                        Statics.field1804 = (class132) var17;
                        if (Statics.field1804 == class132.field2086) {
                            Statics.field1836 = class185.field2855;
                        } else {
                            Statics.field1836 = class185.field2857;
                        }
                        break;
                    case 7:
                        int var6 = Integer.parseInt(var5);
                        class131[] var7 = new class131[] { class131.field2076, class131.field2074, class131.field2073, class131.field2072 };
                        class131[] var8 = var7;
                        int var9 = 0;
                        class131 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class131 var10 = var8[var9];
                            if (var10.field2077 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field705 = var11;
                        break;
                    case 8:
                        field475 = Integer.parseInt(var5);
                }
            }
        }
        class94.field1603 = false;
        field634 = false;
        Statics.field347 = this.getCodeBase().getHost();
        String var18 = Statics.field705.field2080;
        byte var19 = 0;
        try {
            Statics.method785("oldschool", var18, var19, 16);
        } catch (Exception var21) {
            class79.method720((String) null, var21);
        }
        Statics.field570 = this;
        this.method1384(765, 503, 9);
    }

    @ObfuscatedName("client.k(B)V")
    public final void method248() {
        Statics.field351 = field612 == 0 ? 43594 : field475 + 40000;
        Statics.field1995 = field612 == 0 ? 443 : field475 + 50000;
        Statics.field630 = Statics.field351;
        Statics.field2721 = class160.field2708;
        Statics.field2720 = class160.field2707;
        Statics.field2713 = class160.field2706;
        Statics.field2722 = class160.field2709;
        if (Statics.field1331.toLowerCase().indexOf("microsoft") == -1) {
            class74.field1372[44] = 71;
            class74.field1372[45] = 26;
            class74.field1372[46] = 72;
            class74.field1372[47] = 73;
            class74.field1372[59] = 57;
            class74.field1372[61] = 27;
            class74.field1372[91] = 42;
            class74.field1372[92] = 74;
            class74.field1372[93] = 43;
            class74.field1372[192] = 28;
            class74.field1372[222] = 58;
            class74.field1372[520] = 59;
        } else {
            class74.field1372[186] = 57;
            class74.field1372[187] = 27;
            class74.field1372[188] = 71;
            class74.field1372[189] = 26;
            class74.field1372[190] = 72;
            class74.field1372[191] = 73;
            class74.field1372[192] = 58;
            class74.field1372[219] = 42;
            class74.field1372[220] = 74;
            class74.field1372[221] = 43;
            class74.field1372[222] = 59;
            class74.field1372[223] = 28;
        }
        Canvas var1 = Statics.field740;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class74.field1336);
        var1.addFocusListener(class74.field1336);
        Canvas var2 = Statics.field740;
        var2.addMouseListener(class76.field1396);
        var2.addMouseMotionListener(class76.field1396);
        var2.addFocusListener(class76.field1396);
        class77 var3;
        try {
            var3 = new class77();
        } catch (Throwable var5) {
            var3 = null;
        }
        Statics.field1332 = var3;
        if (Statics.field1332 != null) {
            Statics.field1332.method1314(Statics.field740);
        }
        Statics.field391 = new class70(255, class81.field1434, class81.field1435, 500000);
        if (field612 != 0) {
            field689 = true;
        }
    }

    @ObfuscatedName("client.g(B)V")
    public final void method249() {
        field568++;
        this.method252();
        class156.method2780();
        try {
            if (class137.field2349 == 1) {
                int var1 = Statics.field2021.method2758();
                if (var1 > 0 && Statics.field2021.method2681()) {
                    int var2 = var1 - Statics.field246;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2021.method2761(var2);
                } else {
                    Statics.field2021.method2752();
                    Statics.field2021.method2667();
                    if (Statics.field2354 == null) {
                        class137.field2349 = 0;
                    } else {
                        class137.field2349 = 2;
                    }
                    Statics.field2329 = null;
                    Statics.field125 = null;
                }
            }
        } catch (Exception var83) {
            var83.printStackTrace();
            Statics.field2021.method2752();
            class137.field2349 = 0;
            Statics.field2329 = null;
            Statics.field125 = null;
            Statics.field2354 = null;
        }
        method68();
        class74.method50();
        class76.method1201();
        if (Statics.field1332 != null) {
            int var4 = Statics.field1332.method1316();
            field675 = var4;
        }
        if (field483 == 0) {
            method135();
            class72.method606();
        } else if (field483 == 5) {
            class20.method1229(this);
            method135();
            class72.method606();
        } else if (field483 == 10) {
            class20.method1229(this);
        } else if (field483 == 20) {
            class20.method1229(this);
            method66();
        } else if (field483 == 25) {
            method2623(false);
            field531 = 0;
            boolean var5 = true;
            for (int var6 = 0; var6 < Statics.field756.length; var6++) {
                if (Statics.field2078[var6] != -1 && Statics.field756[var6] == null) {
                    Statics.field756[var6] = Statics.field897.method2973(Statics.field2078[var6], 0);
                    if (Statics.field756[var6] == null) {
                        var5 = false;
                        field531++;
                    }
                }
                if (Statics.field1661[var6] != -1 && Statics.field196[var6] == null) {
                    Statics.field196[var6] = Statics.field897.method2934(Statics.field1661[var6], 0, Statics.field711[var6]);
                    if (Statics.field196[var6] == null) {
                        var5 = false;
                        field531++;
                    }
                }
            }
            if (var5) {
                field477 = 0;
                boolean var7 = true;
                for (int var8 = 0; var8 < Statics.field756.length; var8++) {
                    byte[] var9 = Statics.field196[var8];
                    if (var9 != null) {
                        int var10 = (Statics.field404[var8] >> 8) * 64 - Statics.field1631;
                        int var11 = (Statics.field404[var8] & 0xFF) * 64 - Statics.field456;
                        if (field519) {
                            var10 = 10;
                            var11 = 10;
                        }
                        var7 &= class9.method1612(var9, var10, var11);
                    }
                }
                if (var7) {
                    if (field535 != 0) {
                        method151(class133.field2158 + class2.field32 + class2.field29 + 100 + "%" + class2.field30, true);
                    }
                    method68();
                    method61();
                    method68();
                    Statics.field335.method1975();
                    method68();
                    System.gc();
                    for (int var12 = 0; var12 < 4; var12++) {
                        field536[var12].method3208();
                    }
                    for (int var13 = 0; var13 < 4; var13++) {
                        for (int var14 = 0; var14 < 104; var14++) {
                            for (int var15 = 0; var15 < 104; var15++) {
                                class9.field136[var13][var14][var15] = 0;
                            }
                        }
                    }
                    method68();
                    class9.field137 = 99;
                    Statics.field138 = new byte[4][104][104];
                    Statics.field142 = new byte[4][104][104];
                    Statics.field140 = new byte[4][104][104];
                    Statics.field361 = new byte[4][104][104];
                    Statics.field34 = new int[4][105][105];
                    Statics.field364 = new byte[4][105][105];
                    Statics.field151 = new int[105][105];
                    Statics.field148 = new int[104];
                    Statics.field153 = new int[104];
                    Statics.field144 = new int[104];
                    Statics.field1383 = new int[104];
                    Statics.field1819 = new int[104];
                    int var16 = Statics.field756.length;
                    class7.method30();
                    method2623(true);
                    if (!field519) {
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = (Statics.field404[var17] >> 8) * 64 - Statics.field1631;
                            int var19 = (Statics.field404[var17] & 0xFF) * 64 - Statics.field456;
                            byte[] var20 = Statics.field756[var17];
                            if (var20 != null) {
                                method68();
                                class9.method651(var20, var18, var19, Statics.field115 * 8 - 48, Statics.field1531 * 8 - 48, field536);
                            }
                        }
                        for (int var21 = 0; var21 < var16; var21++) {
                            int var22 = (Statics.field404[var21] >> 8) * 64 - Statics.field1631;
                            int var23 = (Statics.field404[var21] & 0xFF) * 64 - Statics.field456;
                            byte[] var24 = Statics.field756[var21];
                            if (var24 == null && Statics.field1531 < 800) {
                                method68();
                                class9.method646(var22, var23, 64, 64);
                            }
                        }
                        method2623(true);
                        for (int var25 = 0; var25 < var16; var25++) {
                            byte[] var26 = Statics.field196[var25];
                            if (var26 != null) {
                                int var27 = (Statics.field404[var25] >> 8) * 64 - Statics.field1631;
                                int var28 = (Statics.field404[var25] & 0xFF) * 64 - Statics.field456;
                                method68();
                                class9.method130(var26, var27, var28, Statics.field335, field536);
                            }
                        }
                    }
                    if (field519) {
                        int var29 = 0;
                        label439: while (true) {
                            if (var29 >= 4) {
                                for (int var59 = 0; var59 < 13; var59++) {
                                    for (int var60 = 0; var60 < 13; var60++) {
                                        int var61 = field507[0][var59][var60];
                                        if (var61 == -1) {
                                            class9.method646(var59 * 8, var60 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2623(true);
                                int var62 = 0;
                                while (true) {
                                    if (var62 >= 4) {
                                        break label439;
                                    }
                                    method68();
                                    for (int var63 = 0; var63 < 13; var63++) {
                                        for (int var64 = 0; var64 < 13; var64++) {
                                            int var65 = field507[var62][var63][var64];
                                            if (var65 != -1) {
                                                int var66 = var65 >> 24 & 0x3;
                                                int var67 = var65 >> 1 & 0x3;
                                                int var68 = var65 >> 14 & 0x3FF;
                                                int var69 = var65 >> 3 & 0x7FF;
                                                int var70 = (var68 / 8 << 8) + var69 / 8;
                                                for (int var71 = 0; var71 < Statics.field404.length; var71++) {
                                                    if (Statics.field404[var71] == var70 && Statics.field196[var71] != null) {
                                                        class9.method210(Statics.field196[var71], var62, var63 * 8, var64 * 8, var66, (var68 & 0x7) * 8, (var69 & 0x7) * 8, var67, Statics.field335, field536);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var62++;
                                }
                            }
                            method68();
                            for (int var30 = 0; var30 < 13; var30++) {
                                for (int var31 = 0; var31 < 13; var31++) {
                                    boolean var32 = false;
                                    int var33 = field507[var29][var30][var31];
                                    if (var33 != -1) {
                                        int var34 = var33 >> 24 & 0x3;
                                        int var35 = var33 >> 1 & 0x3;
                                        int var36 = var33 >> 14 & 0x3FF;
                                        int var37 = var33 >> 3 & 0x7FF;
                                        int var38 = (var36 / 8 << 8) + var37 / 8;
                                        for (int var39 = 0; var39 < Statics.field404.length; var39++) {
                                            if (Statics.field404[var39] == var38 && Statics.field756[var39] != null) {
                                                byte[] var40 = Statics.field756[var39];
                                                int var41 = var30 * 8;
                                                int var42 = var31 * 8;
                                                int var43 = (var36 & 0x7) * 8;
                                                int var44 = (var37 & 0x7) * 8;
                                                class163[] var45 = field536;
                                                for (int var46 = 0; var46 < 8; var46++) {
                                                    for (int var47 = 0; var47 < 8; var47++) {
                                                        if (var41 + var46 > 0 && var41 + var46 < 103 && var42 + var47 > 0 && var42 + var47 < 103) {
                                                            var45[var29].field2742[var41 + var46][var42 + var47] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class126 var48 = new class126(var40);
                                                for (int var49 = 0; var49 < 4; var49++) {
                                                    for (int var50 = 0; var50 < 64; var50++) {
                                                        for (int var51 = 0; var51 < 64; var51++) {
                                                            if (var34 == var49 && var50 >= var43 && var50 < var43 + 8 && var51 >= var44 && var51 < var44 + 8) {
                                                                class9.method2(var48, var29, var41 + class159.method1825(var50 & 0x7, var51 & 0x7, var35), var42 + class159.method1647(var50 & 0x7, var51 & 0x7, var35), 0, 0, var35);
                                                            } else {
                                                                class9.method2(var48, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var32) {
                                        int var52 = var29;
                                        int var53 = var30 * 8;
                                        int var54 = var31 * 8;
                                        for (int var55 = 0; var55 < 8; var55++) {
                                            for (int var56 = 0; var56 < 8; var56++) {
                                                class9.field156[var52][var53 + var55][var54 + var56] = 0;
                                            }
                                        }
                                        if (var53 > 0) {
                                            for (int var57 = 1; var57 < 8; var57++) {
                                                class9.field156[var52][var53][var54 + var57] = class9.field156[var52][var53 - 1][var54 + var57];
                                            }
                                        }
                                        if (var54 > 0) {
                                            for (int var58 = 1; var58 < 8; var58++) {
                                                class9.field156[var52][var53 + var58][var54] = class9.field156[var52][var53 + var58][var54 - 1];
                                            }
                                        }
                                        if (var53 > 0 && class9.field156[var52][var53 - 1][var54] != 0) {
                                            class9.field156[var52][var53][var54] = class9.field156[var52][var53 - 1][var54];
                                        } else if (var54 > 0 && class9.field156[var52][var53][var54 - 1] != 0) {
                                            class9.field156[var52][var53][var54] = class9.field156[var52][var53][var54 - 1];
                                        } else if (var53 > 0 && var54 > 0 && class9.field156[var52][var53 - 1][var54 - 1] != 0) {
                                            class9.field156[var52][var53][var54] = class9.field156[var52][var53 - 1][var54 - 1];
                                        }
                                    }
                                }
                            }
                            var29++;
                        }
                    }
                    method2623(true);
                    method61();
                    method68();
                    class9.method2979(Statics.field335, field536);
                    method2623(true);
                    int var72 = class9.field137;
                    if (var72 > Statics.field189) {
                        var72 = Statics.field189;
                    }
                    if (var72 < Statics.field189 - 1) {
                        int var73 = Statics.field189 - 1;
                    }
                    if (field634) {
                        Statics.field335.method1849(class9.field137);
                    } else {
                        Statics.field335.method1849(0);
                    }
                    for (int var74 = 0; var74 < 104; var74++) {
                        for (int var75 = 0; var75 < 104; var75++) {
                            method652(var74, var75);
                        }
                    }
                    method68();
                    for (class21 var76 = (class21) field681.method3285(); var76 != null; var76 = (class21) field681.method3299()) {
                        if (var76.field346 == -1) {
                            var76.field348 = 0;
                            method1829(var76);
                        } else {
                            var76.method3327();
                        }
                    }
                    class31.field818.method3217();
                    if (Statics.field349 != null) {
                        field518.method2258(170);
                        field518.method2365(1057001181);
                    }
                    if (!field519) {
                        int var77 = (Statics.field115 - 6) / 8;
                        int var78 = (Statics.field115 + 6) / 8;
                        int var79 = (Statics.field1531 - 6) / 8;
                        int var80 = (Statics.field1531 + 6) / 8;
                        for (int var81 = var77 - 1; var81 <= var78 + 1; var81++) {
                            for (int var82 = var79 - 1; var82 <= var80 + 1; var82++) {
                                if (var81 < var77 || var81 > var78 || var82 < var79 || var82 > var80) {
                                    Statics.field897.method2932("m" + var81 + "_" + var82);
                                    Statics.field897.method2932("l" + var81 + "_" + var82);
                                }
                            }
                        }
                    }
                    method771(30);
                    method68();
                    Statics.field138 = (byte[][][]) null;
                    Statics.field142 = (byte[][][]) null;
                    Statics.field140 = (byte[][][]) null;
                    Statics.field361 = (byte[][][]) null;
                    Statics.field34 = (int[][][]) null;
                    Statics.field364 = (byte[][][]) null;
                    Statics.field151 = (int[][]) null;
                    Statics.field148 = null;
                    Statics.field153 = null;
                    Statics.field144 = null;
                    Statics.field1383 = null;
                    Statics.field1819 = null;
                    field518.method2258(236);
                    class72.method606();
                } else {
                    field535 = 2;
                }
            } else {
                field535 = 1;
            }
        }
        if (field483 == 30) {
            method89();
        } else if (field483 == 40) {
            method66();
        }
    }

    @ObfuscatedName("client.n(I)V")
    public final void method250() {
        boolean var1;
        label226: {
            try {
                if (class137.field2349 == 2) {
                    if (Statics.field2329 == null) {
                        Statics.field2329 = class138.method2647(Statics.field2354, Statics.field2351, Statics.field1201);
                        if (Statics.field2329 == null) {
                            var1 = false;
                            break label226;
                        }
                    }
                    if (Statics.field125 == null) {
                        Statics.field125 = new class57(Statics.field2348, Statics.field2347);
                    }
                    if (Statics.field2021.method2665(Statics.field2329, Statics.field2346, Statics.field125, 22050)) {
                        Statics.field2021.method2666();
                        Statics.field2021.method2761(Statics.field2452);
                        Statics.field2021.method2672(Statics.field2329, Statics.field2352);
                        class137.field2349 = 0;
                        Statics.field2329 = null;
                        Statics.field125 = null;
                        Statics.field2354 = null;
                        var1 = true;
                        break label226;
                    }
                }
            } catch (Exception var40) {
                var40.printStackTrace();
                Statics.field2021.method2752();
                class137.field2349 = 0;
                Statics.field2329 = null;
                Statics.field125 = null;
                Statics.field2354 = null;
            }
            var1 = false;
        }
        if (var1 && field716 && Statics.field84 != null) {
            Statics.field84.method1119();
        }
        if (field1305) {
            class74.method1381(Statics.field740);
            Canvas var4 = Statics.field740;
            var4.removeMouseListener(class76.field1396);
            var4.removeMouseMotionListener(class76.field1396);
            var4.removeFocusListener(class76.field1396);
            class76.field1390 = 0;
            if (Statics.field1332 != null) {
                Statics.field1332.method1320(Statics.field740);
            }
            this.method1385();
            Canvas var5 = Statics.field740;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class74.field1336);
            var5.addFocusListener(class74.field1336);
            Canvas var6 = Statics.field740;
            var6.addMouseListener(class76.field1396);
            var6.addMouseMotionListener(class76.field1396);
            var6.addFocusListener(class76.field1396);
            if (Statics.field1332 != null) {
                Statics.field1332.method1314(Statics.field740);
            }
        }
        if (field483 == 0) {
            class72.method1311(class20.field316, class20.field313, (Color) null);
        } else if (field483 == 5) {
            class20.method129(Statics.field24, Statics.field184);
        } else if (field483 == 10) {
            class20.method129(Statics.field24, Statics.field184);
        } else if (field483 == 20) {
            class20.method129(Statics.field24, Statics.field184);
        } else if (field483 == 25) {
            if (field535 == 1) {
                if (field531 > field532) {
                    field532 = field531;
                }
                int var7 = (field532 * 50 - field531 * 50) / field532;
                method151(class133.field2158 + class2.field32 + class2.field29 + var7 + "%" + class2.field30, false);
            } else if (field535 == 2) {
                if (field477 > field722) {
                    field722 = field477;
                }
                int var8 = (field722 * 50 - field477 * 50) / field722 + 50;
                method151(class133.field2158 + class2.field32 + class2.field29 + var8 + "%" + class2.field30, false);
            } else {
                method151(class133.field2158, false);
            }
        } else if (field483 == 30) {
            if (!field473) {
                field627[0] = class133.field2304;
                field539[0] = "";
                field625[0] = 1006;
                field547 = 1;
            }
            if (field639 != -1) {
                int var9 = field639;
                if (class157.method2314(var9)) {
                    method1537(Statics.field2687[var9], -1);
                }
            }
            for (int var10 = 0; var10 < field680; var10++) {
                if (field617[var10]) {
                    field683[var10] = true;
                }
                field541[var10] = field617[var10];
                field617[var10] = false;
            }
            field651 = field568;
            field629 = -1;
            field527 = -1;
            Statics.field62 = null;
            if (field639 != -1) {
                field680 = 0;
                method666(field639, 0, 0, 765, 503, 0, 0, -1);
            }
            class88.method1754();
            boolean var11 = false;
            while (!var11) {
                var11 = true;
                for (int var12 = 0; var12 < field547 - 1; var12++) {
                    if (field625[var12] < 1000 && field625[var12 + 1] > 1000) {
                        String var13 = field539[var12];
                        field539[var12] = field539[var12 + 1];
                        field539[var12 + 1] = var13;
                        String var14 = field627[var12];
                        field627[var12] = field627[var12 + 1];
                        field627[var12 + 1] = var14;
                        int var15 = field625[var12];
                        field625[var12] = field625[var12 + 1];
                        field625[var12 + 1] = var15;
                        int var16 = field623[var12];
                        field623[var12] = field623[var12 + 1];
                        field623[var12 + 1] = var16;
                        int var17 = field624[var12];
                        field624[var12] = field624[var12 + 1];
                        field624[var12 + 1] = var17;
                        int var18 = field626[var12];
                        field626[var12] = field626[var12 + 1];
                        field626[var12 + 1] = var18;
                        var11 = false;
                    }
                }
            }
            if (field473) {
                int var19 = Statics.field1022;
                int var20 = Statics.field2032;
                int var21 = Statics.field1449;
                int var22 = Statics.field2539;
                int var23 = 6116423;
                class88.method1761(var19, var20, var21, var22, var23);
                class88.method1761(var19 + 1, var20 + 1, var21 - 2, 16, 0);
                class88.method1763(var19 + 1, var20 + 18, var21 - 2, var22 - 19, 0);
                Statics.field24.method3411(class133.field2234, var19 + 3, var20 + 14, var23, -1);
                int var24 = class76.field1399;
                int var25 = class76.field1388;
                for (int var26 = 0; var26 < field547; var26++) {
                    int var27 = (field547 - 1 - var26) * 15 + var20 + 31;
                    int var28 = 16777215;
                    if (var24 > var19 && var24 < var19 + var21 && var25 > var27 - 13 && var25 < var27 + 3) {
                        var28 = 16776960;
                    }
                    class182 var29 = Statics.field24;
                    String var30;
                    if (field539[var26].length() > 0) {
                        var30 = field627[var26] + class133.field2279 + field539[var26];
                    } else {
                        var30 = field627[var26];
                    }
                    var29.method3411(var30, var19 + 3, var27, var28, 0);
                }
                method166(Statics.field1022, Statics.field2032, Statics.field1449, Statics.field2539);
            } else if (field629 != -1) {
                method15(field629, field527);
            }
            if (field581 == 3) {
                for (int var31 = 0; var31 < field680; var31++) {
                    if (field541[var31]) {
                        class88.method1760(field660[var31], field686[var31], field670[var31], field553[var31], 16711935, 128);
                    } else if (field683[var31]) {
                        class88.method1760(field660[var31], field686[var31], field670[var31], field553[var31], 16711680, 128);
                    }
                }
            }
            class7.method3335(Statics.field189, Statics.field2035.field427, Statics.field2035.field411, field558);
            field558 = 0;
        } else if (field483 == 40) {
            method151(class133.field2170 + class2.field32 + class133.field2168, false);
        }
        if (field483 == 30 && field581 == 0 && !field1315) {
            try {
                Graphics var32 = Statics.field740.getGraphics();
                for (int var33 = 0; var33 < field680; var33++) {
                    if (field683[var33]) {
                        Statics.field269.method1571(var32, field660[var33], field686[var33], field670[var33], field553[var33]);
                        field683[var33] = false;
                    }
                }
            } catch (Exception var39) {
                Statics.field740.repaint();
            }
        } else if (field483 > 0) {
            try {
                Graphics var35 = Statics.field740.getGraphics();
                Statics.field269.method1570(var35, 0, 0);
                field1315 = false;
                for (int var36 = 0; var36 < field680; var36++) {
                    field683[var36] = false;
                }
            } catch (Exception var38) {
                Statics.field740.repaint();
            }
        }
    }

    @ObfuscatedName("client.c(I)V")
    public final void method251() {
        if (Statics.field267 != null) {
            Statics.field267.field248 = false;
        }
        Statics.field267 = null;
        if (Statics.field1300 != null) {
            Statics.field1300.method1335();
            Statics.field1300 = null;
        }
        Statics.method780();
        class76.method70();
        Statics.field1332 = null;
        if (Statics.field84 != null) {
            Statics.field84.method1120();
        }
        if (Statics.field95 != null) {
            Statics.field95.method1120();
        }
        if (Statics.field2524 != null) {
            Statics.field2524.method1335();
        }
        Object var1 = class156.field2563;
        synchronized (class156.field2563) {
            if (class156.field2564 != 0) {
                class156.field2564 = 1;
                try {
                    class156.field2563.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        class81.method16();
    }

    @ObfuscatedName("an.o(II)V")
    public static void method771(int arg0) {
        if (field483 == arg0) {
            return;
        }
        if (field483 == 0) {
            Statics.method171();
        }
        if (arg0 == 20 || arg0 == 40) {
            field685 = 0;
            field510 = 0;
            field511 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1530 != null) {
            Statics.field1530.method1335();
            Statics.field1530 = null;
        }
        if (field483 == 25) {
            field535 = 0;
            field531 = 0;
            field532 = 1;
            field477 = 0;
            field722 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field740;
            class153 var2 = Statics.field1824;
            class153 var3 = Statics.field127;
            if (!Statics.field329) {
                class88.method1783();
                byte[] var4 = var2.method2930("title.jpg", "");
                Statics.field1378 = new class85(var4, var1);
                Statics.field312 = Statics.field1378.method1649();
                Statics.field304 = class83.method146(var3, "logo", "");
                Statics.field300 = class83.method146(var3, "titlebox", "");
                Statics.field306 = class83.method146(var3, "titlebutton", "");
                Statics.field302 = class83.method2082(var3, "runes", "");
                Statics.field2558 = class83.method2082(var3, "title_mute", "");
                Statics.field308 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field308[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field308[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field308[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field308[var8 + 192] = 16777215;
                }
                Statics.field309 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field309[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field309[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field309[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field309[var12 + 192] = 16777215;
                }
                Statics.field1827 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field1827[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field1827[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field1827[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field1827[var16 + 192] = 16777215;
                }
                Statics.field2823 = new int[256];
                Statics.field2814 = new int[32768];
                Statics.field23 = new int[32768];
                class20.method2155((class86) null);
                Statics.field1027 = new int[32768];
                Statics.field218 = new int[32768];
                class20.field318 = 0;
                class20.field322 = "";
                class20.field323 = "";
                class20.field326 = false;
                if (field714 == 0) {
                    class20.field305 = true;
                } else {
                    class20.field305 = false;
                }
                if (class20.field305) {
                    class137.field2349 = 1;
                    Statics.field2354 = null;
                    Statics.field2351 = -1;
                    Statics.field1201 = -1;
                    Statics.field2452 = 0;
                    Statics.field2352 = false;
                    Statics.field246 = 2;
                } else {
                    class153 var17 = Statics.field506;
                    int var18 = var17.method2936("scape main");
                    int var19 = var17.method2929(var18, "");
                    class137.field2349 = 1;
                    Statics.field2354 = var17;
                    Statics.field2351 = var18;
                    Statics.field1201 = var19;
                    Statics.field2452 = 255;
                    Statics.field2352 = false;
                    Statics.field246 = 2;
                }
                class152.method212(false);
                Statics.field329 = true;
                Statics.field1378.method1658(0, 0);
                Statics.field312.method1658(382, 0);
                Statics.field304.method1744(382 - Statics.field304.field1483 / 2, 18);
            }
        } else {
            class20.method107();
        }
        field483 = arg0;
    }

    @ObfuscatedName("client.u(I)V")
    public void method252() {
        if (field483 != 1000) {
            boolean var1 = class152.method743();
            if (!var1) {
                this.method253();
            }
        }
    }

    @ObfuscatedName("client.z(B)V")
    public void method253() {
        if (class152.field2533 >= 4) {
            this.method1403("js5crc");
            field483 = 1000;
            return;
        }
        if (class152.field2519 >= 4) {
            if (field483 <= 5) {
                this.method1403("js5io");
                field483 = 1000;
                return;
            }
            field505 = 3000;
            class152.field2519 = 3;
        }
        if (--field505 + 1 > 0) {
            return;
        }
        try {
            if (field613 == 0) {
                Statics.field253 = Statics.field1175.method1454(Statics.field347, Statics.field630);
                field613++;
            }
            if (field613 == 1) {
                if (Statics.field253.field1410 == 2) {
                    this.method342(-1);
                    return;
                }
                if (Statics.field253.field1410 == 1) {
                    field613++;
                }
            }
            if (field613 == 2) {
                Statics.field503 = new class69((Socket) Statics.field253.field1414, Statics.field1175);
                class126 var1 = new class126(5);
                var1.method2362(15);
                var1.method2365(9);
                Statics.field503.method1339(var1.field2047, 0, 5);
                field613++;
                Statics.field1030 = class120.method1322();
            }
            if (field613 == 3) {
                if (field483 <= 5 || Statics.field503.method1355() > 0) {
                    int var2 = Statics.field503.method1346();
                    if (var2 != 0) {
                        this.method342(var2);
                        return;
                    }
                    field613++;
                } else if (class120.method1322() - Statics.field1030 > 30000L) {
                    this.method342(-2);
                    return;
                }
            }
            if (field613 == 4) {
                class69 var3 = Statics.field503;
                boolean var4 = field483 > 20;
                if (Statics.field2524 != null) {
                    try {
                        Statics.field2524.method1335();
                    } catch (Exception var14) {
                    }
                    Statics.field2524 = null;
                }
                Statics.field2524 = var3;
                class152.method212(var4);
                class152.field2527.field2043 = 0;
                Statics.field1256 = null;
                Statics.field2005 = null;
                class152.field2528 = 0;
                while (true) {
                    class154 var6 = (class154) class152.field2520.method3277();
                    if (var6 == null) {
                        while (true) {
                            class154 var7 = (class154) class152.field2525.method3277();
                            if (var7 == null) {
                                if (class152.field2526 != 0) {
                                    try {
                                        class126 var8 = new class126(4);
                                        var8.method2362(4);
                                        var8.method2362(class152.field2526);
                                        var8.method2363(0);
                                        Statics.field2524.method1339(var8.field2047, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2524.method1335();
                                        } catch (Exception var12) {
                                        }
                                        class152.field2519++;
                                        Statics.field2524 = null;
                                    }
                                }
                                class152.field2516 = 0;
                                Statics.field2517 = class120.method1322();
                                Statics.field253 = null;
                                Statics.field503 = null;
                                field613 = 0;
                                field508 = 0;
                                return;
                            }
                            class152.field2532.method3233(var7);
                            class152.field2523.method3262(var7, var7.field2809);
                            class152.field2534++;
                            class152.field2530--;
                        }
                    }
                    class152.field2518.method3262(var6, var6.field2809);
                    class152.field2535++;
                    class152.field2522--;
                }
            }
        } catch (IOException var15) {
            this.method342(-3);
        }
    }

    @ObfuscatedName("client.e(II)V")
    public void method342(int arg0) {
        Statics.field253 = null;
        Statics.field503 = null;
        field613 = 0;
        if (Statics.field630 == Statics.field351) {
            Statics.field630 = Statics.field1995;
        } else {
            Statics.field630 = Statics.field351;
        }
        field508++;
        if (field508 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field483 <= 5) {
                this.method1403("js5connect_full");
                field483 = 1000;
            } else {
                field505 = 3000;
            }
        } else if (field508 >= 2 && arg0 == 6) {
            this.method1403("js5connect_outofdate");
            field483 = 1000;
        } else if (field508 >= 4) {
            if (field483 <= 5) {
                this.method1403("js5connect");
                field483 = 1000;
            } else {
                field505 = 3000;
            }
        }
    }

    @ObfuscatedName("l.l(I)V")
    public static void method135() {
        if (field502 == 0) {
            Statics.field335 = new class94(4, 104, 104, class9.field156);
            for (int var0 = 0; var0 < 4; var0++) {
                field536[var0] = new class163(104, 104);
            }
            Statics.field135 = new class85(512, 512);
            class20.field313 = class133.field2139;
            class20.field316 = 5;
            field502 = 20;
        } else if (field502 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class103.field1790[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class94.method1868(var1, 500, 800, 512, 334);
            class20.field313 = class133.field2101;
            class20.field316 = 10;
            field502 = 30;
        } else if (field502 == 30) {
            Statics.field2019 = method1990(0, false, true, true);
            Statics.field20 = method1990(1, false, true, true);
            Statics.field1450 = method1990(2, true, false, true);
            Statics.field380 = method1990(3, false, true, true);
            Statics.field1026 = method1990(4, false, true, true);
            Statics.field897 = method1990(5, true, true, true);
            Statics.field506 = method1990(6, true, true, false);
            Statics.field679 = method1990(7, false, true, true);
            Statics.field127 = method1990(8, false, true, true);
            Statics.field755 = method1990(9, false, true, true);
            Statics.field1824 = method1990(10, false, true, true);
            Statics.field235 = method1990(11, false, true, true);
            Statics.field166 = method1990(12, false, true, true);
            Statics.field314 = method1990(13, true, false, true);
            Statics.field362 = method1990(14, false, true, false);
            Statics.field1320 = method1990(15, false, true, true);
            class20.field313 = class133.field2258;
            class20.field316 = 20;
            field502 = 40;
        } else if (field502 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2019.method2997() * 4 / 100;
            int var8 = var7 + Statics.field20.method2997() * 4 / 100;
            int var9 = var8 + Statics.field1450.method2997() * 2 / 100;
            int var10 = var9 + Statics.field380.method2997() * 2 / 100;
            int var11 = var10 + Statics.field1026.method2997() * 6 / 100;
            int var12 = var11 + Statics.field897.method2997() * 4 / 100;
            int var13 = var12 + Statics.field506.method2997() * 2 / 100;
            int var14 = var13 + Statics.field679.method2997() * 60 / 100;
            int var15 = var14 + Statics.field127.method2997() * 2 / 100;
            int var16 = var15 + Statics.field755.method2997() * 2 / 100;
            int var17 = var16 + Statics.field1824.method2997() * 2 / 100;
            int var18 = var17 + Statics.field235.method2997() * 2 / 100;
            int var19 = var18 + Statics.field166.method2997() * 2 / 100;
            int var20 = var19 + Statics.field314.method2997() * 2 / 100;
            int var21 = var20 + Statics.field362.method2997() * 2 / 100;
            int var22 = var21 + Statics.field1320.method2997() * 2 / 100;
            if (var22 == 100) {
                class20.field313 = class133.field2104;
                class20.field316 = 30;
                field502 = 45;
            } else {
                if (var22 != 0) {
                    class20.field313 = class133.field2100 + var22 + "%";
                }
                class20.field316 = 30;
            }
        } else if (field502 == 45) {
            class51.method1504(22050, !field634, 2);
            class140 var23 = new class140();
            var23.method2671(9, 128);
            Statics.field84 = class51.method596(Statics.field1175, Statics.field740, 0, 22050);
            Statics.field84.method1135(var23);
            class137.method67(Statics.field1320, Statics.field362, Statics.field1026, var23);
            Statics.field95 = class51.method596(Statics.field1175, Statics.field740, 1, 2048);
            Statics.field1291 = new class45();
            Statics.field95.method1135(Statics.field1291);
            Statics.field1025 = new class61(22050, Statics.field1265);
            class20.field313 = class133.field2107;
            class20.field316 = 35;
            field502 = 50;
        } else if (field502 == 50) {
            int var24 = 0;
            if (Statics.field184 == null) {
                class153 var25 = Statics.field127;
                class153 var26 = Statics.field314;
                int var27 = var25.method2936("p11_full");
                int var28 = var25.method2929(var27, "");
                class182 var29 = class83.method3019(var25, var26, var27, var28);
                Statics.field184 = var29;
            } else {
                var24++;
            }
            if (Statics.field1797 == null) {
                class153 var30 = Statics.field127;
                class153 var31 = Statics.field314;
                int var32 = var30.method2936("p12_full");
                int var33 = var30.method2929(var32, "");
                class182 var34 = class83.method3019(var30, var31, var32, var33);
                Statics.field1797 = var34;
            } else {
                var24++;
            }
            if (Statics.field24 == null) {
                Statics.field24 = class83.method726(Statics.field127, Statics.field314, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class20.field313 = class133.field2106 + var24 * 100 / 3 + "%";
                class20.field316 = 40;
            } else {
                Statics.field230 = new class150(true);
                class20.field313 = class133.field2275;
                class20.field316 = 40;
                field502 = 60;
            }
        } else if (field502 == 60) {
            class153 var35 = Statics.field1824;
            class153 var36 = Statics.field127;
            int var37 = 0;
            if (var35.method2931("title.jpg", "")) {
                var37++;
            }
            if (var36.method2931("logo", "")) {
                var37++;
            }
            if (var36.method2931("titlebox", "")) {
                var37++;
            }
            if (var36.method2931("titlebutton", "")) {
                var37++;
            }
            if (var36.method2931("runes", "")) {
                var37++;
            }
            if (var36.method2931("title_mute", "")) {
                var37++;
            }
            var36.method2931("sl_back", "");
            var36.method2931("sl_flags", "");
            var36.method2931("sl_arrows", "");
            var36.method2931("sl_stars", "");
            var36.method2931("sl_button", "");
            int var40 = class20.method2252();
            if (var37 < var40) {
                class20.field313 = class133.field2108 + var37 * 100 / var40 + "%";
                class20.field316 = 50;
            } else {
                class20.field313 = class133.field2091;
                class20.field316 = 50;
                method771(5);
                field502 = 70;
            }
        } else if (field502 == 70) {
            if (Statics.field1450.method2917()) {
                class153 var41 = Statics.field1450;
                Statics.field941 = var41;
                class153 var42 = Statics.field1450;
                Statics.field869 = var42;
                class35.method49(Statics.field1450, Statics.field679);
                class31.method165(Statics.field1450, Statics.field679, field634);
                class30.method2175(Statics.field1450, Statics.field679);
                class153 var43 = Statics.field1450;
                class153 var44 = Statics.field679;
                boolean var45 = field478;
                class182 var46 = Statics.field184;
                Statics.field2462 = var43;
                Statics.field1016 = var44;
                Statics.field1015 = var45;
                Statics.field2462.method2923(10);
                Statics.field977 = var46;
                class153 var47 = Statics.field1450;
                class153 var48 = Statics.field2019;
                class153 var49 = Statics.field20;
                Statics.field877 = var47;
                Statics.field882 = var48;
                Statics.field878 = var49;
                class34.method227(Statics.field1450, Statics.field679);
                class153 var50 = Statics.field1450;
                Statics.field952 = var50;
                class153 var51 = Statics.field1450;
                Statics.field1032 = var51;
                Statics.field1035 = Statics.field1032.method2923(16);
                class157.method148(Statics.field380, Statics.field679, Statics.field127, Statics.field314);
                class153 var52 = Statics.field1450;
                Statics.field1024 = var52;
                class38.method507(Statics.field1450);
                class20.field313 = class133.field2252;
                class20.field316 = 60;
                field502 = 80;
            } else {
                class20.field313 = class133.field2110 + Statics.field1450.method3003() + "%";
                class20.field316 = 60;
            }
        } else if (field502 == 80) {
            int var53 = 0;
            if (Statics.field171 == null) {
                class153 var54 = Statics.field127;
                int var55 = var54.method2936("compass");
                int var56 = var54.method2929(var55, "");
                class85 var57;
                if (class83.method769(var54, var55, var56)) {
                    var57 = class83.method1550();
                } else {
                    var57 = null;
                }
                Statics.field171 = var57;
            } else {
                var53++;
            }
            if (Statics.field87 == null) {
                class153 var59 = Statics.field127;
                int var60 = var59.method2936("mapedge");
                int var61 = var59.method2929(var60, "");
                class85 var62;
                if (class83.method769(var59, var60, var61)) {
                    var62 = class83.method1550();
                } else {
                    var62 = null;
                }
                Statics.field87 = var62;
            } else {
                var53++;
            }
            if (Statics.field1172 == null) {
                Statics.field1172 = class83.method2082(Statics.field127, "mapscene", "");
            } else {
                var53++;
            }
            if (Statics.field2456 == null) {
                Statics.field2456 = class83.method1566(Statics.field127, "mapfunction", "");
            } else {
                var53++;
            }
            if (Statics.field1173 == null) {
                Statics.field1173 = class83.method1566(Statics.field127, "hitmarks", "");
            } else {
                var53++;
            }
            if (Statics.field956 == null) {
                Statics.field956 = class83.method1566(Statics.field127, "headicons_pk", "");
            } else {
                var53++;
            }
            if (Statics.field155 == null) {
                Statics.field155 = class83.method1566(Statics.field127, "headicons_prayer", "");
            } else {
                var53++;
            }
            if (Statics.field194 == null) {
                Statics.field194 = class83.method1566(Statics.field127, "headicons_hint", "");
            } else {
                var53++;
            }
            if (Statics.field865 == null) {
                Statics.field865 = class83.method1566(Statics.field127, "mapmarker", "");
            } else {
                var53++;
            }
            if (Statics.field132 == null) {
                Statics.field132 = class83.method1566(Statics.field127, "cross", "");
            } else {
                var53++;
            }
            if (Statics.field1529 == null) {
                Statics.field1529 = class83.method1566(Statics.field127, "mapdots", "");
            } else {
                var53++;
            }
            if (Statics.field252 == null) {
                Statics.field252 = class83.method2082(Statics.field127, "scrollbar", "");
            } else {
                var53++;
            }
            if (Statics.field292 == null) {
                Statics.field292 = class83.method2082(Statics.field127, "mod_icons", "");
            } else {
                var53++;
            }
            if (Statics.field2561 == null) {
                Statics.field2561 = class83.method146(Statics.field127, "mapback", "");
            } else {
                var53++;
            }
            if (var53 < 14) {
                class20.field313 = class133.field2112 + var53 * 100 / 14 + "%";
                class20.field316 = 70;
            } else {
                Statics.field2828 = Statics.field292;
                Statics.field87.method1736();
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 41.0D) - 20;
                for (int var68 = 0; var68 < Statics.field2456.length; var68++) {
                    Statics.field2456[var68].method1651(var64 + var67, var65 + var67, var66 + var67);
                }
                Statics.field1172[0].method1751(var64 + var67, var65 + var67, var66 + var67);
                method2178();
                class20.field313 = class133.field2301;
                class20.field316 = 70;
                field502 = 90;
            }
        } else if (field502 == 90) {
            if (Statics.field755.method2917()) {
                class109 var69 = new class109(Statics.field755, Statics.field127, 20, 0.8D, field634 ? 64 : 128);
                class103.method2087(var69);
                class103.method2088(0.8D);
                class20.field313 = class133.field2115;
                class20.field316 = 90;
                field502 = 110;
            } else {
                class20.field313 = class133.field2207 + Statics.field755.method3003() + "%";
                class20.field316 = 90;
            }
        } else if (field502 == 110) {
            Statics.field267 = new class15();
            Statics.field1175.method1458(Statics.field267, 10);
            class20.field313 = class133.field2150;
            class20.field316 = 94;
            field502 = 120;
        } else if (field502 == 120) {
            if (Statics.field1824.method2931("huffman", "")) {
                class119 var70 = new class119(Statics.field1824.method2930("huffman", ""));
                Statics.field2825 = var70;
                class20.field313 = class133.field2222;
                class20.field316 = 96;
                field502 = 130;
            } else {
                class20.field313 = class133.field2117 + "%";
                class20.field316 = 96;
            }
        } else if (field502 == 130) {
            if (!Statics.field380.method2917()) {
                class20.field313 = class133.field2119 + Statics.field380.method3003() * 4 / 5 + "%";
                class20.field316 = 100;
            } else if (!Statics.field166.method2917()) {
                class20.field313 = class133.field2119 + (80 + Statics.field166.method3003() / 6) + "%";
                class20.field316 = 100;
            } else if (Statics.field314.method2917()) {
                class20.field313 = class133.field2120;
                class20.field316 = 100;
                field502 = 140;
            } else {
                class20.field313 = class133.field2119 + (96 + Statics.field314.method3003() / 20) + "%";
                class20.field316 = 100;
            }
        } else if (field502 == 140) {
            method771(10);
        }
    }

    @ObfuscatedName("cn.m(IZZZI)Let;")
    public static class153 method1990(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class70 var4 = null;
        if (class81.field1434 != null) {
            var4 = new class70(arg0, class81.field1434, Statics.field1432[arg0], 1000000);
        }
        return new class153(var4, Statics.field391, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("di.s(I)V")
    public static void method2178() {
        Statics.field1833 = new int[33];
        Statics.field94 = new int[33];
        Statics.field1276 = new int[151];
        Statics.field386 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2561.field1486[Statics.field2561.field1483 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1833[var0] = var1;
            Statics.field94[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2561.field1486[Statics.field2561.field1483 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1276[var4 - 5] = var5 - 25;
            Statics.field386[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("g.i(I)V")
    public static final void method66() {
        try {
            if (field685 == 0) {
                if (Statics.field1300 != null) {
                    Statics.field1300.method1335();
                    Statics.field1300 = null;
                }
                Statics.field129 = null;
                field529 = false;
                field510 = 0;
                field685 = 1;
            }
            if (field685 == 1) {
                if (Statics.field129 == null) {
                    Statics.field129 = Statics.field1175.method1454(Statics.field347, Statics.field630);
                }
                if (Statics.field129.field1410 == 2) {
                    throw new IOException();
                }
                if (Statics.field129.field1410 == 1) {
                    Statics.field1300 = new class69((Socket) Statics.field129.field1414, Statics.field1175);
                    Statics.field129 = null;
                    field685 = 2;
                }
            }
            if (field685 == 2) {
                field518.field2043 = 0;
                field518.method2362(14);
                Statics.field1300.method1339(field518.field2047, 0, 1);
                field520.field2043 = 0;
                field685 = 3;
            }
            if (field685 == 3) {
                if (Statics.field84 != null) {
                    Statics.field84.method1118();
                }
                if (Statics.field95 != null) {
                    Statics.field95.method1118();
                }
                int var0 = Statics.field1300.method1346();
                if (Statics.field84 != null) {
                    Statics.field84.method1118();
                }
                if (Statics.field95 != null) {
                    Statics.field95.method1118();
                }
                if (var0 != 0) {
                    method1358(var0);
                    return;
                }
                field520.field2043 = 0;
                field685 = 5;
            }
            if (field685 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field518.field2043 = 0;
                field518.method2362(10);
                field518.method2365(var1[0]);
                field518.method2365(var1[1]);
                field518.method2365(var1[2]);
                field518.method2365(var1[3]);
                field518.method2459(0L);
                field518.method2366(class20.field323);
                field518.method2471(class6.field91, class6.field89);
                field493.field2043 = 0;
                if (field483 == 40) {
                    field493.method2362(18);
                } else {
                    field493.method2362(16);
                }
                field493.method2363(0);
                int var2 = field493.field2043;
                field493.method2365(9);
                field493.method2369(field518.field2047, 0, field518.field2043);
                int var3 = field493.field2043;
                field493.method2366(class20.field322);
                field493.method2362(field634 ? 1 : 0);
                class115 var4 = field493;
                byte[] var5 = new byte[24];
                try {
                    class81.field1433.method532(0L);
                    class81.field1433.method530(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var34) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2369(var5, 0, 24);
                class126 var9 = new class126(Statics.field230.method2903());
                Statics.field230.method2907(var9);
                field493.method2369(var9.field2047, 0, var9.field2047.length);
                field493.method2365(Statics.field2019.field2502);
                field493.method2365(Statics.field20.field2502);
                field493.method2365(Statics.field1450.field2502);
                field493.method2365(Statics.field380.field2502);
                field493.method2365(Statics.field1026.field2502);
                field493.method2365(Statics.field897.field2502);
                field493.method2365(Statics.field506.field2502);
                field493.method2365(Statics.field679.field2502);
                field493.method2365(Statics.field127.field2502);
                field493.method2365(Statics.field755.field2502);
                field493.method2365(Statics.field1824.field2502);
                field493.method2365(Statics.field235.field2502);
                field493.method2365(Statics.field166.field2502);
                field493.method2365(Statics.field314.field2502);
                field493.method2365(Statics.field362.field2502);
                field493.method2365(Statics.field1320.field2502);
                field493.method2391(var1, var3, field493.field2043);
                field493.method2371(field493.field2043 - var2);
                Statics.field1300.method1339(field493.field2047, 0, field493.field2043);
                field518.method2254(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field520.method2254(var1);
                field685 = 6;
            }
            if (field685 == 6 && Statics.field1300.method1355() > 0) {
                int var11 = Statics.field1300.method1346();
                if (var11 == 21 && field483 == 20) {
                    field685 = 7;
                } else if (var11 == 2) {
                    field685 = 9;
                } else if (var11 == 15 && field483 == 40) {
                    field518.field2043 = 0;
                    field520.field2043 = 0;
                    field522 = -1;
                    field526 = -1;
                    field652 = -1;
                    field528 = -1;
                    field521 = 0;
                    field523 = 0;
                    field492 = 0;
                    field547 = 0;
                    field473 = false;
                    field713 = 0;
                    field703 = 0;
                    for (int var12 = 0; var12 < field599.length; var12++) {
                        if (field599[var12] != null) {
                            field599[var12].field433 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field515.length; var13++) {
                        if (field515[var13] != null) {
                            field515[var13].field433 = -1;
                        }
                    }
                    class18.method117();
                    method771(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field617[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field511 < 1) {
                    field511++;
                    field685 = 0;
                } else {
                    method1358(var11);
                    return;
                }
            }
            if (field685 == 7 && Statics.field1300.method1355() > 0) {
                field512 = (Statics.field1300.method1346() + 3) * 60;
                field685 = 8;
            }
            if (field685 == 8) {
                field510 = 0;
                class20.method1326(class133.field2118, class133.field2122, field512 / 60 + class133.field2123);
                if (--field512 <= 0) {
                    field685 = 0;
                }
            } else {
                if (field685 == 9 && Statics.field1300.method1355() >= 8) {
                    field474 = Statics.field1300.method1346();
                    field594 = Statics.field1300.method1346() == 1;
                    field605 = Statics.field1300.method1346();
                    field605 <<= 0x8;
                    field605 += Statics.field1300.method1346();
                    field491 = Statics.field1300.method1346();
                    Statics.field1300.method1338(field520.field2047, 0, 1);
                    field520.field2043 = 0;
                    field522 = field520.method2260();
                    Statics.field1300.method1338(field520.field2047, 0, 2);
                    field520.field2043 = 0;
                    field521 = field520.method2489();
                    if (field491 == 1) {
                        try {
                            client var15 = Statics.field570;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var33) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field570;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var32) {
                        }
                    }
                    field685 = 10;
                }
                if (field685 != 10) {
                    field510++;
                    if (field510 > 2000) {
                        if (field511 < 1) {
                            if (Statics.field630 == Statics.field351) {
                                Statics.field630 = Statics.field1995;
                            } else {
                                Statics.field630 = Statics.field351;
                            }
                            field511++;
                            field685 = 0;
                        } else {
                            method1358(-3);
                        }
                    }
                } else if (Statics.field1300.method1355() >= field521) {
                    field520.field2043 = 0;
                    Statics.field1300.method1338(field520.field2047, 0, field521);
                    field486 = 1L;
                    field489 = -1;
                    Statics.field267.field247 = 0;
                    Statics.field93 = true;
                    field490 = true;
                    field707 = -1L;
                    class181.method650();
                    field518.field2043 = 0;
                    field520.field2043 = 0;
                    field522 = -1;
                    field526 = -1;
                    field652 = -1;
                    field528 = -1;
                    field523 = 0;
                    field492 = 0;
                    field533 = 0;
                    field538 = 0;
                    field547 = 0;
                    field473 = false;
                    class76.field1389 = 0;
                    for (int var19 = 0; var19 < 100; var19++) {
                        field693[var19] = null;
                    }
                    field694 = 0;
                    field687 = 0;
                    field562 = false;
                    field549 = 0;
                    field546 = (int) (Math.random() * 100.0D) - 50;
                    field548 = (int) (Math.random() * 110.0D) - 55;
                    field550 = (int) (Math.random() * 80.0D) - 40;
                    field537 = (int) (Math.random() * 120.0D) - 60;
                    field555 = (int) (Math.random() * 30.0D) - 20;
                    field671 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field713 = 0;
                    field706 = -1;
                    field703 = 0;
                    field712 = 0;
                    field600 = 0;
                    field516 = 0;
                    for (int var20 = 0; var20 < 2048; var20++) {
                        field599[var20] = null;
                        field504[var20] = null;
                    }
                    for (int var21 = 0; var21 < 32768; var21++) {
                        field515[var21] = null;
                    }
                    Statics.field2035 = field599[2047] = new class3();
                    field615.method3287();
                    field636.method3287();
                    for (int var22 = 0; var22 < 4; var22++) {
                        for (int var23 = 0; var23 < 104; var23++) {
                            for (int var24 = 0; var24 < 104; var24++) {
                                field733[var22][var23][var24] = null;
                            }
                        }
                    }
                    field681 = new class176();
                    field732 = 0;
                    field731 = 0;
                    for (int var25 = 0; var25 < Statics.field1035; var25++) {
                        class41 var26 = class41.method125(var25);
                        if (var26 != null && var26.field1034 == 0) {
                            class158.field2699[var25] = 0;
                            class158.field2700[var25] = 0;
                        }
                    }
                    for (int var27 = 0; var27 < field673.length; var27++) {
                        field673[var27] = -1;
                    }
                    if (field639 != -1) {
                        class157.method4(field639);
                    }
                    for (class4 var28 = (class4) field640.method3277(); var28 != null; var28 = (class4) field640.method3265()) {
                        method45(var28, true);
                    }
                    field639 = -1;
                    field640 = new class174(8);
                    field643 = null;
                    field473 = false;
                    field547 = 0;
                    field737.method3125((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var29 = 0; var29 < 8; var29++) {
                        field691[var29] = null;
                        field611[var29] = false;
                    }
                    class18.method117();
                    field484 = true;
                    for (int var30 = 0; var30 < 100; var30++) {
                        field617[var30] = true;
                    }
                    field704 = null;
                    Statics.field276 = 0;
                    Statics.field66 = null;
                    Statics.field115 = -1;
                    method1545(false);
                    field522 = -1;
                }
            }
        } catch (IOException var35) {
            if (field511 < 1) {
                if (Statics.field630 == Statics.field351) {
                    Statics.field630 = Statics.field1995;
                } else {
                    Statics.field630 = Statics.field351;
                }
                field511++;
                field685 = 0;
            } else {
                method1358(-2);
            }
        }
    }

    @ObfuscatedName("bv.y(IB)V")
    public static void method1358(int arg0) {
        if (arg0 == -3) {
            class20.method1326(class133.field2194, class133.field2125, class133.field2212);
        } else if (arg0 == -2) {
            class20.method1326(class133.field2127, class133.field2128, class133.field2129);
        } else if (arg0 == -1) {
            class20.method1326(class133.field2241, class133.field2131, class133.field2132);
        } else if (arg0 == 3) {
            class20.method1326(class133.field2133, class133.field2260, class133.field2225);
        } else if (arg0 == 4) {
            class20.method1326(class133.field2136, class133.field2137, class133.field2270);
        } else if (arg0 == 5) {
            class20.method1326(class133.field2189, class133.field2103, class133.field2141);
        } else if (arg0 == 6) {
            class20.method1326(class133.field2142, class133.field2143, class133.field2232);
        } else if (arg0 == 7) {
            class20.method1326(class133.field2145, class133.field2146, class133.field2147);
        } else if (arg0 == 8) {
            class20.method1326(class133.field2148, class133.field2149, class133.field2235);
        } else if (arg0 == 9) {
            class20.method1326(class133.field2102, class133.field2152, class133.field2153);
        } else if (arg0 == 10) {
            class20.method1326(class133.field2154, class133.field2155, class133.field2156);
        } else if (arg0 == 11) {
            class20.method1326(class133.field2157, class133.field2299, class133.field2159);
        } else if (arg0 == 12) {
            class20.method1326(class133.field2160, class133.field2247, class133.field2162);
        } else if (arg0 == 13) {
            class20.method1326(class133.field2163, class133.field2164, class133.field2165);
        } else if (arg0 == 14) {
            class20.method1326(class133.field2166, class133.field2167, class133.field2124);
        } else if (arg0 == 16) {
            class20.method1326(class133.field2169, class133.field2297, class133.field2171);
        } else if (arg0 == 17) {
            class20.method1326(class133.field2090, class133.field2173, class133.field2174);
        } else if (arg0 == 18) {
            class20.method1326(class133.field2291, class133.field2176, class133.field2211);
        } else if (arg0 == 19) {
            class20.method1326(class133.field2178, class133.field2179, class133.field2180);
        } else if (arg0 == 20) {
            class20.method1326(class133.field2181, class133.field2182, class133.field2161);
        } else if (arg0 == 22) {
            class20.method1326(class133.field2098, class133.field2196, class133.field2186);
        } else if (arg0 == 23) {
            class20.method1326(class133.field2187, class133.field2188, class133.field2281);
        } else if (arg0 == 24) {
            class20.method1326(class133.field2177, class133.field2191, class133.field2192);
        } else if (arg0 == 25) {
            class20.method1326(class133.field2151, class133.field2315, class133.field2195);
        } else if (arg0 == 26) {
            class20.method1326(class133.field2099, class133.field2197, class133.field2198);
        } else if (arg0 == 27) {
            class20.method1326(class133.field2199, class133.field2121, class133.field2201);
        } else if (arg0 == 31) {
            class20.method1326(class133.field2314, class133.field2209, class133.field2210);
        } else if (arg0 == 32) {
            class20.method1326(class133.field2298, class133.field2183, class133.field2213);
        } else if (arg0 == 37) {
            class20.method1326(class133.field2214, class133.field2203, class133.field2216);
        } else if (arg0 == 38) {
            class20.method1326(class133.field2204, class133.field2218, class133.field2224);
        } else if (arg0 == 55) {
            class20.method1326(class133.field2220, class133.field2221, class133.field2175);
        } else {
            class20.method1326(class133.field2223, class133.field2200, class133.field2269);
        }
        method771(10);
    }

    @ObfuscatedName("a.d(B)V")
    public static final void method209() {
        if (Statics.field1300 != null) {
            Statics.field1300.method1335();
            Statics.field1300 = null;
        }
        method61();
        Statics.field335.method1975();
        for (int var0 = 0; var0 < 4; var0++) {
            field536[var0].method3208();
        }
        System.gc();
        class137.field2349 = 1;
        Statics.field2354 = null;
        Statics.field2351 = -1;
        Statics.field1201 = -1;
        Statics.field2452 = 0;
        Statics.field2352 = false;
        Statics.field246 = 2;
        field564 = -1;
        field716 = false;
        class7.method30();
        method771(10);
    }

    @ObfuscatedName("g.f(I)V")
    public static final void method61() {
        class36.field934.method3217();
        class32.field866.method3217();
        Statics.method2840();
        class31.field854.method3217();
        class31.field818.method3217();
        class31.field839.method3217();
        class31.field820.method3217();
        class30.method2153();
        class39.field982.method3217();
        class39.field979.method3217();
        class39.field980.method3217();
        class33.field879.method3217();
        class33.field893.method3217();
        class34.field918.method3217();
        class34.field916.method3217();
        class37.method1645();
        class41.method2894();
        class162.field2719.method3217();
        class157.method211();
        ((class109) Statics.field1789).method2170();
        class5.field80.method3217();
        Statics.field2019.method2926();
        Statics.field20.method2926();
        Statics.field380.method2926();
        Statics.field1026.method2926();
        Statics.field897.method2926();
        Statics.field506.method2926();
        Statics.field679.method2926();
        Statics.field127.method2926();
        Statics.field755.method2926();
        Statics.field1824.method2926();
        Statics.field235.method2926();
        Statics.field166.method2926();
    }

    @ObfuscatedName("p.a(B)V")
    public static final void method1() {
        if (field533 > 0) {
            method209();
        } else {
            method771(40);
            Statics.field1530 = Statics.field1300;
            Statics.field1300 = null;
        }
    }

    @ObfuscatedName("c.x(B)V")
    public static final void method89() {
        if (field492 > 1) {
            field492--;
        }
        if (field533 > 0) {
            field533--;
        }
        if (field529) {
            field529 = false;
            method1();
            return;
        }
        for (int var0 = 0; var0 < 100 && method39(); var0++) {
        }
        if (field483 != 30) {
            return;
        }
        Statics.method1374(field518, 2);
        Object var1 = Statics.field267.field241;
        synchronized (Statics.field267.field241) {
            if (!field616) {
                Statics.field267.field247 = 0;
            } else if (class76.field1400 != 0 || Statics.field267.field247 >= 40) {
                field518.method2258(12);
                field518.method2362(0);
                int var2 = field518.field2043;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field267.field247 && field518.field2043 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field267.field244[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field267.field240[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field267.field244[var4] == -1 && Statics.field267.field240[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field487 != var6 || field488 != var5) {
                        int var8 = var6 - field487;
                        field487 = var6;
                        int var9 = var5 - field488;
                        field488 = var5;
                        if (field489 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field518.method2363((field489 << 12) + (var8 << 6) + var9);
                            field489 = 0;
                        } else if (field489 < 8) {
                            field518.method2364((field489 << 19) + 8388608 + var7);
                            field489 = 0;
                        } else {
                            field518.method2365((field489 << 19) + -1073741824 + var7);
                            field489 = 0;
                        }
                    } else if (field489 < 2047) {
                        field489++;
                    }
                }
                field518.method2470(field518.field2043 - var2);
                if (var3 >= Statics.field267.field247) {
                    Statics.field267.field247 = 0;
                } else {
                    Statics.field267.field247 -= var3;
                    for (int var10 = 0; var10 < Statics.field267.field247; var10++) {
                        Statics.field267.field240[var10] = Statics.field267.field240[var3 + var10];
                        Statics.field267.field244[var10] = Statics.field267.field244[var3 + var10];
                    }
                }
            }
        }
        if (class76.field1400 != 0) {
            long var12 = (class76.field1402 - field486 * -1L) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field486 = class76.field1402 * -1L;
            int var14 = class76.field1394;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class76.field1395;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class76.field1400 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field518.method2258(83);
            field518.method2365((var17 << 19) + (var18 << 20) + var16);
        }
        if (class74.field1367 > 0) {
            field518.method2258(175);
            field518.method2363(0);
            int var19 = field518.field2043;
            long var20 = class120.method1322();
            for (int var22 = 0; var22 < class74.field1367; var22++) {
                long var23 = var20 - field707;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field707 = var20;
                field518.method2397(class74.field1366[var22]);
                field518.method2532((int) var23);
            }
            field518.method2371(field518.field2043 - var19);
        }
        if (field569 > 0) {
            field569--;
        }
        if (class74.field1344[96] || class74.field1344[97] || class74.field1344[98] || class74.field1344[99]) {
            field604 = true;
        }
        if (field604 && field569 <= 0) {
            field569 = 20;
            field604 = false;
            field518.method2258(44);
            field518.method2550(field565);
            field518.method2403(field671);
        }
        if (Statics.field93 && !field490) {
            field490 = true;
            field518.method2258(188);
            field518.method2362(1);
        }
        if (!Statics.field93 && field490) {
            field490 = false;
            field518.method2258(188);
            field518.method2362(0);
        }
        if (field634 && Statics.field189 != field530) {
            method1502(Statics.field115, Statics.field1531, Statics.field189, Statics.field2035.field462[0], Statics.field2035.field447[0]);
        } else if (Statics.field189 != field706) {
            field706 = Statics.field189;
            method2312(Statics.field189);
        }
        if (field483 != 30) {
            return;
        }
        method147();
        method2245();
        field523++;
        if (field523 > 750) {
            method1();
            return;
        }
        for (int var25 = -1; var25 < field600; var25++) {
            int var26;
            if (var25 == -1) {
                var26 = 2047;
            } else {
                var26 = field601[var25];
            }
            class3 var27 = field599[var26];
            if (var27 != null) {
                method866(var27, 1);
            }
        }
        for (int var28 = 0; var28 < field516; var28++) {
            int var29 = field628[var28];
            class24 var30 = field515[var29];
            if (var30 != null) {
                method866(var30, var30.field388.field781);
            }
        }
        method6();
        field558++;
        if (field589 != 0) {
            field674 += 20;
            if (field674 >= 400) {
                field589 = 0;
            }
        }
        if (Statics.field293 != null) {
            field590++;
            if (field590 >= 15) {
                Statics.method1546(Statics.field293);
                Statics.field293 = null;
            }
        }
        if (Statics.field298 != null) {
            Statics.method1546(Statics.field298);
            field597++;
            if (class76.field1399 > field614 + 5 || class76.field1399 < field614 - 5 || class76.field1388 > field606 + 5 || class76.field1388 < field606 - 5) {
                field585 = true;
            }
            if (class76.field1393 == 0) {
                if (field585 && field597 >= 5) {
                    if (Statics.field62 == Statics.field298 && field595 != field592) {
                        class157 var31 = Statics.field298;
                        byte var32 = 0;
                        if (field642 == 1 && var31.field2583 == 206) {
                            var32 = 1;
                        }
                        if (var31.field2652[field595] <= 0) {
                            var32 = 0;
                        }
                        int var33 = method2167(var31);
                        boolean var34 = (var33 >> 29 & 0x1) != 0;
                        if (var34) {
                            int var35 = field592;
                            int var36 = field595;
                            var31.field2652[var36] = var31.field2652[var35];
                            var31.field2682[var36] = var31.field2682[var35];
                            var31.field2652[var35] = -1;
                            var31.field2682[var35] = 0;
                        } else if (var32 == 1) {
                            int var37 = field592;
                            int var38 = field595;
                            while (var37 != var38) {
                                if (var37 > var38) {
                                    var31.method3040(var37 - 1, var37);
                                    var37--;
                                } else if (var37 < var38) {
                                    var31.method3040(var37 + 1, var37);
                                    var37++;
                                }
                            }
                        } else {
                            var31.method3040(field595, field592);
                        }
                        field518.method2258(122);
                        field518.method2362(var32);
                        field518.method2414(Statics.field298.field2579);
                        field518.method2403(field592);
                        field518.method2405(field595);
                    }
                } else if ((field620 == 1 || method706(field547 - 1)) && field547 > 2) {
                    method1491();
                } else if (field547 > 0) {
                    method21(field547 - 1);
                }
                field590 = 10;
                class76.field1400 = 0;
                Statics.field298 = null;
            }
        }
        class157 var39 = Statics.field204;
        class157 var40 = Statics.field345;
        Statics.field204 = null;
        Statics.field345 = null;
        field654 = null;
        field658 = false;
        field655 = false;
        field700 = 0;
        while (true) {
            class74 var41 = class74.field1336;
            boolean var42;
            synchronized (class74.field1336) {
                if (class74.field1370 == class74.field1368) {
                    var42 = false;
                } else {
                    Statics.field811 = class74.field1365[class74.field1368];
                    Statics.field469 = class74.field1360[class74.field1368];
                    class74.field1368 = class74.field1368 + 1 & 0x7F;
                    var42 = true;
                }
            }
            if (!var42 || field700 >= 128) {
                method2249(field639, 0, 0, 765, 503, 0, 0);
                field729++;
                while (true) {
                    class1 var44;
                    class157 var45;
                    class157 var46;
                    do {
                        var44 = (class1) field677.method3283();
                        if (var44 == null) {
                            while (true) {
                                class1 var47;
                                class157 var48;
                                class157 var49;
                                do {
                                    var47 = (class1) field678.method3283();
                                    if (var47 == null) {
                                        while (true) {
                                            class1 var50;
                                            class157 var51;
                                            class157 var52;
                                            do {
                                                var50 = (class1) field676.method3283();
                                                if (var50 == null) {
                                                    if (field650 != null) {
                                                        Statics.method1546(field650);
                                                        Statics.field1684++;
                                                        if (field658 && field655) {
                                                            int var53 = class76.field1399;
                                                            int var54 = class76.field1388;
                                                            int var55 = var53 - field688;
                                                            int var56 = var54 - field653;
                                                            if (var55 < field656) {
                                                                var55 = field656;
                                                            }
                                                            if (field650.field2588 + var55 > field656 + field485.field2588) {
                                                                var55 = field656 + field485.field2588 - field650.field2588;
                                                            }
                                                            if (var56 < field657) {
                                                                var56 = field657;
                                                            }
                                                            if (field650.field2589 + var56 > field657 + field485.field2589) {
                                                                var56 = field657 + field485.field2589 - field650.field2589;
                                                            }
                                                            int var57 = var55 - field659;
                                                            int var58 = var56 - field472;
                                                            int var59 = field650.field2642;
                                                            if (Statics.field1684 > field650.field2635 && (var57 > var59 || var57 < -var59 || var58 > var59 || var58 < -var59)) {
                                                                field661 = true;
                                                            }
                                                            int var60 = field485.field2592 + (var55 - field656);
                                                            int var61 = field485.field2611 + (var56 - field657);
                                                            if (field650.field2578 != null && field661) {
                                                                class1 var62 = new class1();
                                                                var62.field2 = field650;
                                                                var62.field1 = var60;
                                                                var62.field18 = var61;
                                                                var62.field8 = field650.field2578;
                                                                class25.method754(var62);
                                                            }
                                                            if (class76.field1393 == 0) {
                                                                if (field661) {
                                                                    if (field650.field2656 != null) {
                                                                        class1 var63 = new class1();
                                                                        var63.field2 = field650;
                                                                        var63.field1 = var60;
                                                                        var63.field18 = var61;
                                                                        var63.field3 = field654;
                                                                        var63.field8 = field650.field2656;
                                                                        class25.method754(var63);
                                                                    }
                                                                    if (field654 != null && method1354(field650) != null) {
                                                                        field518.method2258(73);
                                                                        field518.method2405(field650.field2580);
                                                                        field518.method2365(field654.field2579);
                                                                        field518.method2414(field650.field2579);
                                                                        field518.method2403(field654.field2580);
                                                                    }
                                                                } else if ((field620 == 1 || method706(field547 - 1)) && field547 > 2) {
                                                                    method1491();
                                                                } else if (field547 > 0) {
                                                                    method21(field547 - 1);
                                                                }
                                                                field650 = null;
                                                            }
                                                        } else if (Statics.field1684 > 1) {
                                                            field650 = null;
                                                        }
                                                    }
                                                    if (class94.field1595 != -1) {
                                                        int var64 = class94.field1595;
                                                        int var65 = class94.field1575;
                                                        boolean var66 = method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var64, var65, true, 0, 0, 0, 0, 0, 0);
                                                        class94.field1595 = -1;
                                                        if (var66) {
                                                            field622 = class76.field1395;
                                                            field587 = class76.field1394;
                                                            field589 = 1;
                                                            field674 = 0;
                                                        }
                                                    }
                                                    if (Statics.field298 == null && field650 == null) {
                                                        int var67 = class76.field1400;
                                                        if (field473) {
                                                            if (var67 != 1) {
                                                                int var68 = class76.field1399;
                                                                int var69 = class76.field1388;
                                                                if (var68 < Statics.field1022 - 10 || var68 > Statics.field1449 + Statics.field1022 + 10 || var69 < Statics.field2032 - 10 || var69 > Statics.field2539 + Statics.field2032 + 10) {
                                                                    field473 = false;
                                                                    method2177(Statics.field1022, Statics.field2032, Statics.field1449, Statics.field2539);
                                                                }
                                                            }
                                                            if (var67 == 1) {
                                                                int var70 = Statics.field1022;
                                                                int var71 = Statics.field2032;
                                                                int var72 = Statics.field1449;
                                                                int var73 = class76.field1395;
                                                                int var74 = class76.field1394;
                                                                int var75 = -1;
                                                                for (int var76 = 0; var76 < field547; var76++) {
                                                                    int var77 = (field547 - 1 - var76) * 15 + var71 + 31;
                                                                    if (var73 > var70 && var73 < var70 + var72 && var74 > var77 - 13 && var74 < var77 + 3) {
                                                                        var75 = var76;
                                                                    }
                                                                }
                                                                if (var75 != -1) {
                                                                    method21(var75);
                                                                }
                                                                field473 = false;
                                                                method2177(Statics.field1022, Statics.field2032, Statics.field1449, Statics.field2539);
                                                            }
                                                        } else {
                                                            label1058: {
                                                                if (var67 == 1 && field547 > 0) {
                                                                    int var78 = field625[field547 - 1];
                                                                    if (var78 == 39 || var78 == 40 || var78 == 41 || var78 == 42 || var78 == 43 || var78 == 33 || var78 == 34 || var78 == 35 || var78 == 36 || var78 == 37 || var78 == 38 || var78 == 1005) {
                                                                        label1063: {
                                                                            int var79 = field623[field547 - 1];
                                                                            int var80 = field624[field547 - 1];
                                                                            class157 var81 = class157.method2079(var80);
                                                                            if (!class161.method3097(method2167(var81))) {
                                                                                int var82 = method2167(var81);
                                                                                boolean var83 = (var82 >> 29 & 0x1) != 0;
                                                                                if (!var83) {
                                                                                    break label1063;
                                                                                }
                                                                            }
                                                                            field585 = false;
                                                                            field597 = 0;
                                                                            if (Statics.field298 != null) {
                                                                                Statics.method1546(Statics.field298);
                                                                            }
                                                                            Statics.field298 = class157.method2079(var80);
                                                                            field592 = var79;
                                                                            field614 = class76.field1395;
                                                                            field606 = class76.field1394;
                                                                            Statics.method1546(Statics.field298);
                                                                            break label1058;
                                                                        }
                                                                    }
                                                                }
                                                                if (var67 == 1 && (field620 == 1 && field547 > 2 || method706(field547 - 1))) {
                                                                    var67 = 2;
                                                                }
                                                                if (var67 == 1 && field547 > 0) {
                                                                    method21(field547 - 1);
                                                                }
                                                                if (var67 == 2 && field547 > 0) {
                                                                    method1491();
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (Statics.field204 != var39) {
                                                        if (var39 != null) {
                                                            Statics.method1546(var39);
                                                        }
                                                        if (Statics.field204 != null) {
                                                            Statics.method1546(Statics.field204);
                                                        }
                                                    }
                                                    if (Statics.field345 != var40 && field632 == field631) {
                                                        if (var40 != null) {
                                                            Statics.method1546(var40);
                                                        }
                                                        if (Statics.field345 != null) {
                                                            Statics.method1546(Statics.field345);
                                                        }
                                                    }
                                                    if (Statics.field345 == null) {
                                                        if (field631 > 0) {
                                                            field631--;
                                                        }
                                                    } else if (field631 < field632) {
                                                        field631++;
                                                        if (field632 == field631) {
                                                            Statics.method1546(Statics.field345);
                                                        }
                                                    }
                                                    int var84 = field546 + Statics.field2035.field427;
                                                    int var85 = field548 + Statics.field2035.field411;
                                                    if (Statics.field26 - var84 < -500 || Statics.field26 - var84 > 500 || Statics.field1813 - var85 < -500 || Statics.field1813 - var85 > 500) {
                                                        Statics.field26 = var84;
                                                        Statics.field1813 = var85;
                                                    }
                                                    if (Statics.field26 != var84) {
                                                        Statics.field26 += (var84 - Statics.field26) / 16;
                                                    }
                                                    if (Statics.field1813 != var85) {
                                                        Statics.field1813 += (var85 - Statics.field1813) / 16;
                                                    }
                                                    if (class74.field1344[96]) {
                                                        field567 += (-24 - field567) / 2;
                                                    } else if (class74.field1344[97]) {
                                                        field567 += (24 - field567) / 2;
                                                    } else {
                                                        field567 /= 2;
                                                    }
                                                    if (class74.field1344[98]) {
                                                        field524 += (12 - field524) / 2;
                                                    } else if (class74.field1344[99]) {
                                                        field524 += (-12 - field524) / 2;
                                                    } else {
                                                        field524 /= 2;
                                                    }
                                                    field671 = field567 / 2 + field671 & 0x7FF;
                                                    field565 += field524 / 2;
                                                    if (field565 < 128) {
                                                        field565 = 128;
                                                    }
                                                    if (field565 > 383) {
                                                        field565 = 383;
                                                    }
                                                    int var86 = Statics.field26 >> 7;
                                                    int var87 = Statics.field1813 >> 7;
                                                    int var88 = method143(Statics.field26, Statics.field1813, Statics.field189);
                                                    int var89 = 0;
                                                    if (var86 > 3 && var87 > 3 && var86 < 100 && var87 < 100) {
                                                        for (int var90 = var86 - 4; var90 <= var86 + 4; var90++) {
                                                            for (int var91 = var87 - 4; var91 <= var87 + 4; var91++) {
                                                                int var92 = Statics.field189;
                                                                if (var92 < 3 && (class9.field136[1][var90][var91] & 0x2) == 2) {
                                                                    var92++;
                                                                }
                                                                int var93 = var88 - class9.field156[var92][var90][var91];
                                                                if (var93 > var89) {
                                                                    var89 = var93;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var94 = var89 * 192;
                                                    if (var94 > 98048) {
                                                        var94 = 98048;
                                                    }
                                                    if (var94 < 32768) {
                                                        var94 = 32768;
                                                    }
                                                    if (var94 > field571) {
                                                        field571 += (var94 - field571) / 24;
                                                    } else if (var94 < field571) {
                                                        field571 += (var94 - field571) / 80;
                                                    }
                                                    if (field591) {
                                                        int var95 = Statics.field898 * 128 + 64;
                                                        int var96 = Statics.field2083 * 128 + 64;
                                                        int var97 = method143(var95, var96, Statics.field189) - Statics.field2765;
                                                        if (Statics.field237 < var95) {
                                                            Statics.field237 += Statics.field199 * (var95 - Statics.field237) / 1000 + Statics.field1763;
                                                            if (Statics.field237 > var95) {
                                                                Statics.field237 = var95;
                                                            }
                                                        }
                                                        if (Statics.field237 > var95) {
                                                            Statics.field237 -= Statics.field199 * (Statics.field237 - var95) / 1000 + Statics.field1763;
                                                            if (Statics.field237 < var95) {
                                                                Statics.field237 = var95;
                                                            }
                                                        }
                                                        if (Statics.field2055 < var97) {
                                                            Statics.field2055 += Statics.field199 * (var97 - Statics.field2055) / 1000 + Statics.field1763;
                                                            if (Statics.field2055 > var97) {
                                                                Statics.field2055 = var97;
                                                            }
                                                        }
                                                        if (Statics.field2055 > var97) {
                                                            Statics.field2055 -= Statics.field199 * (Statics.field2055 - var97) / 1000 + Statics.field1763;
                                                            if (Statics.field2055 < var97) {
                                                                Statics.field2055 = var97;
                                                            }
                                                        }
                                                        if (Statics.field771 < var96) {
                                                            Statics.field771 += Statics.field199 * (var96 - Statics.field771) / 1000 + Statics.field1763;
                                                            if (Statics.field771 > var96) {
                                                                Statics.field771 = var96;
                                                            }
                                                        }
                                                        if (Statics.field771 > var96) {
                                                            Statics.field771 -= Statics.field199 * (Statics.field771 - var96) / 1000 + Statics.field1763;
                                                            if (Statics.field771 < var96) {
                                                                Statics.field771 = var96;
                                                            }
                                                        }
                                                        int var98 = Statics.field392 * 128 + 64;
                                                        int var99 = Statics.field1761 * 128 + 64;
                                                        int var100 = method143(var98, var99, Statics.field189) - Statics.field1036;
                                                        int var101 = var98 - Statics.field237;
                                                        int var102 = var100 - Statics.field2055;
                                                        int var103 = var99 - Statics.field771;
                                                        int var104 = (int) Math.sqrt((double) (var101 * var101 + var103 * var103));
                                                        int var105 = (int) (Math.atan2((double) var102, (double) var104) * 325.949D) & 0x7FF;
                                                        int var106 = (int) (Math.atan2((double) var101, (double) var103) * -325.949D) & 0x7FF;
                                                        if (var105 < 128) {
                                                            var105 = 128;
                                                        }
                                                        if (var105 > 383) {
                                                            var105 = 383;
                                                        }
                                                        if (Statics.field975 < var105) {
                                                            Statics.field975 += Statics.field1364 * (var105 - Statics.field975) / 1000 + Statics.field1423;
                                                            if (Statics.field975 > var105) {
                                                                Statics.field975 = var105;
                                                            }
                                                        }
                                                        if (Statics.field975 > var105) {
                                                            Statics.field975 -= Statics.field1364 * (Statics.field975 - var105) / 1000 + Statics.field1423;
                                                            if (Statics.field975 < var105) {
                                                                Statics.field975 = var105;
                                                            }
                                                        }
                                                        int var107 = var106 - Statics.field99;
                                                        if (var107 > 1024) {
                                                            var107 -= 2048;
                                                        }
                                                        if (var107 < -1024) {
                                                            var107 += 2048;
                                                        }
                                                        if (var107 > 0) {
                                                            Statics.field99 += Statics.field1364 * var107 / 1000 + Statics.field1423;
                                                            Statics.field99 &= 0x7FF;
                                                        }
                                                        if (var107 < 0) {
                                                            Statics.field99 -= Statics.field1364 * -var107 / 1000 + Statics.field1423;
                                                            Statics.field99 &= 0x7FF;
                                                        }
                                                        int var108 = var106 - Statics.field99;
                                                        if (var108 > 1024) {
                                                            var108 -= 2048;
                                                        }
                                                        if (var108 < -1024) {
                                                            var108 += 2048;
                                                        }
                                                        if (var108 < 0 && var107 > 0 || var108 > 0 && var107 < 0) {
                                                            Statics.field99 = var106;
                                                        }
                                                    }
                                                    for (int var109 = 0; var109 < 5; var109++) {
                                                        int var10002 = field730[var109]++;
                                                    }
                                                    int var110 = class76.method1194();
                                                    int var111 = class74.method793();
                                                    if (var110 > 15000 && var111 > 15000) {
                                                        field533 = 250;
                                                        Statics.method2297(14500);
                                                        field518.method2258(255);
                                                    }
                                                    field552++;
                                                    if (field552 > 500) {
                                                        field552 = 0;
                                                        int var112 = (int) (Math.random() * 8.0D);
                                                        if ((var112 & 0x1) == 1) {
                                                            field546 += field633;
                                                        }
                                                        if ((var112 & 0x2) == 2) {
                                                            field548 += field551;
                                                        }
                                                        if ((var112 & 0x4) == 4) {
                                                            field550 += field739;
                                                        }
                                                    }
                                                    if (field546 < -50) {
                                                        field633 = 2;
                                                    }
                                                    if (field546 > 50) {
                                                        field633 = -2;
                                                    }
                                                    if (field548 < -55) {
                                                        field551 = 2;
                                                    }
                                                    if (field548 > 55) {
                                                        field551 = -2;
                                                    }
                                                    if (field550 < -40) {
                                                        field739 = 1;
                                                    }
                                                    if (field550 > 40) {
                                                        field739 = -1;
                                                    }
                                                    field557++;
                                                    if (field557 > 500) {
                                                        field557 = 0;
                                                        int var113 = (int) (Math.random() * 8.0D);
                                                        if ((var113 & 0x1) == 1) {
                                                            field537 += field554;
                                                        }
                                                        if ((var113 & 0x2) == 2) {
                                                            field555 += field556;
                                                        }
                                                    }
                                                    if (field537 < -60) {
                                                        field554 = 2;
                                                    }
                                                    if (field537 > 60) {
                                                        field554 = -2;
                                                    }
                                                    if (field555 < -20) {
                                                        field556 = 1;
                                                    }
                                                    if (field555 > 10) {
                                                        field556 = -1;
                                                    }
                                                    for (class27 var114 = (class27) field734.method3248(); var114 != null; var114 = (class27) field734.method3257()) {
                                                        if ((long) var114.field744 < class120.method1322() / 1000L - 5L) {
                                                            if (var114.field743 > 0) {
                                                                method1826(5, "", var114.field742 + class133.field2228);
                                                            }
                                                            if (var114.field743 == 0) {
                                                                method1826(5, "", var114.field742 + class133.field2229);
                                                            }
                                                            var114.method3317();
                                                        }
                                                    }
                                                    field480++;
                                                    if (field480 > 50) {
                                                        field518.method2258(107);
                                                    }
                                                    try {
                                                        if (Statics.field1300 != null && field518.field2043 > 0) {
                                                            Statics.field1300.method1339(field518.field2047, 0, field518.field2043);
                                                            field518.field2043 = 0;
                                                            field480 = 0;
                                                        }
                                                    } catch (IOException var116) {
                                                        method1();
                                                    }
                                                    return;
                                                }
                                                var51 = var50.field2;
                                                if (var51.field2580 < 0) {
                                                    break;
                                                }
                                                var52 = class157.method2079(var51.field2600);
                                            } while (var52 == null || var52.field2664 == null || var51.field2580 >= var52.field2664.length || var52.field2664[var51.field2580] != var51);
                                            class25.method754(var50);
                                        }
                                    }
                                    var48 = var47.field2;
                                    if (var48.field2580 < 0) {
                                        break;
                                    }
                                    var49 = class157.method2079(var48.field2600);
                                } while (var49 == null || var49.field2664 == null || var48.field2580 >= var49.field2664.length || var49.field2664[var48.field2580] != var48);
                                class25.method754(var47);
                            }
                        }
                        var45 = var44.field2;
                        if (var45.field2580 < 0) {
                            break;
                        }
                        var46 = class157.method2079(var45.field2600);
                    } while (var46 == null || var46.field2664 == null || var45.field2580 >= var46.field2664.length || var46.field2664[var45.field2580] != var45);
                    class25.method754(var44);
                }
            }
            field702[field700] = Statics.field811;
            field701[field700] = Statics.field469;
            field700++;
        }
    }

    @ObfuscatedName("n.r(I)V")
    public static final void method68() {
        if (Statics.field95 != null) {
            Statics.field95.method1117();
        }
        if (Statics.field84 != null) {
            Statics.field84.method1117();
        }
    }

    @ObfuscatedName("dw.t(I)V")
    public static final void method2245() {
        for (int var0 = 0; var0 < field549; var0++) {
            int var10002 = field525[var0]--;
            if (field525[var0] >= -10) {
                class56 var2 = field724[var0];
                if (var2 == null) {
                    class56 var10000 = (class56) null;
                    var2 = class56.method1217(Statics.field1026, field720[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field525[var0] += var2.method1220();
                    field724[var0] = var2;
                }
                if (field525[var0] < 0) {
                    int var9;
                    if (field723[var0] == 0) {
                        var9 = field717;
                    } else {
                        int var3 = (field723[var0] & 0xFF) * 128;
                        int var4 = field723[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2035.field427;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field723[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2035.field411;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field525[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field718 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class62 var10 = var2.method1219().method1283(Statics.field1025);
                        class44 var11 = class44.method915(var10, 100, var9);
                        var11.method1009(field721[var0] - 1);
                        Statics.field1291.method1062(var11);
                    }
                    field525[var0] = -100;
                }
            } else {
                field549--;
                for (int var1 = var0; var1 < field549; var1++) {
                    field720[var1] = field720[var1 + 1];
                    field724[var1] = field724[var1 + 1];
                    field721[var1] = field721[var1 + 1];
                    field525[var1] = field525[var1 + 1];
                    field723[var1] = field723[var1 + 1];
                }
                var0--;
            }
        }
        if (field716 && !class137.method2843()) {
            if (field714 != 0 && field564 != -1) {
                class137.method1378(Statics.field506, field564, 0, field714, false);
            }
            field716 = false;
        }
    }

    @ObfuscatedName("al.b(Lao;IIII)V")
    public static void method787(class33 arg0, int arg1, int arg2, int arg3) {
        if (field549 >= 50 || field718 == 0 || arg0.field892 == null || arg1 >= arg0.field892.length) {
            return;
        }
        int var4 = arg0.field892[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field720[field549] = var5;
        field721[field549] = var6;
        field525[field549] = 0;
        field724[field549] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field723[field549] = (var8 << 16) + (var9 << 8) + var7;
        field549++;
    }

    @ObfuscatedName("am.ae(III)V")
    public static final void method727(int arg0, int arg1) {
        if (field713 != 0 && field713 != 3 || class76.field1400 != 1) {
            return;
        }
        int var2 = class76.field1395 - 25 - arg0;
        int var3 = class76.field1394 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field671 + field537 & 0x7FF;
        int var5 = class103.field1790[var4];
        int var6 = class103.field1787[var4];
        int var7 = (field555 + 256) * var5 >> 8;
        int var8 = (field555 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field2035.field427 + var9 >> 7;
        int var12 = Statics.field2035.field411 - var10 >> 7;
        boolean var13 = method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field518.method2362(var2);
        field518.method2362(var3);
        field518.method2363(field671);
        field518.method2362(57);
        field518.method2362(field537);
        field518.method2362(field555);
        field518.method2362(89);
        field518.method2363(Statics.field2035.field427);
        field518.method2363(Statics.field2035.field411);
        field518.method2362(field637);
        field518.method2362(63);
    }

    @ObfuscatedName("p.at(I)V")
    public static final void method6() {
        for (int var0 = -1; var0 < field600; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field601[var0];
            }
            class3 var2 = field599[var1];
            if (var2 != null && var2.field463 > 0) {
                var2.field463--;
                if (var2.field463 == 0) {
                    var2.field423 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field516; var3++) {
            int var4 = field628[var3];
            class24 var5 = field515[var4];
            if (var5 != null && var5.field463 > 0) {
                var5.field463--;
                if (var5.field463 == 0) {
                    var5.field423 = null;
                }
            }
        }
    }

    @ObfuscatedName("dt.aj(Ljava/lang/String;B)V")
    public static final void method2157(String arg0) {
        if (field474 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method1();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field689 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field689 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field536[var1].field2742[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field612 == 2) {
                throw new RuntimeException();
            }
        }
        field518.method2258(251);
        field518.method2362(arg0.length() - 1);
        field518.method2366(arg0.substring(2));
    }

    @ObfuscatedName("as.aq(Lq;II)V")
    public static final void method866(class26 arg0, int arg1) {
        if (arg0.field453 > field568) {
            method152(arg0);
        } else if (arg0.field454 >= field568) {
            if (field568 == arg0.field454 || arg0.field439 == -1 || arg0.field418 != 0 || arg0.field460 + 1 > class33.method751(arg0.field439).field883[arg0.field440]) {
                int var2 = arg0.field454 - arg0.field453;
                int var3 = field568 - arg0.field453;
                int var4 = arg0.field449 * 128 + arg0.field414 * 64;
                int var5 = arg0.field451 * 128 + arg0.field414 * 64;
                int var6 = arg0.field450 * 128 + arg0.field414 * 64;
                int var7 = arg0.field452 * 128 + arg0.field414 * 64;
                arg0.field427 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field411 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field415 = 0;
            if (arg0.field421 == 0) {
                arg0.field458 = 1024;
            }
            if (arg0.field421 == 1) {
                arg0.field458 = 1536;
            }
            if (arg0.field421 == 2) {
                arg0.field458 = 0;
            }
            if (arg0.field421 == 3) {
                arg0.field458 = 512;
            }
            arg0.field412 = arg0.field458;
        } else {
            method48(arg0);
        }
        if (arg0.field427 < 128 || arg0.field411 < 128 || arg0.field427 >= 13184 || arg0.field411 >= 13184) {
            arg0.field439 = -1;
            arg0.field444 = -1;
            arg0.field453 = 0;
            arg0.field454 = 0;
            arg0.field427 = arg0.field462[0] * 128 + arg0.field414 * 64;
            arg0.field411 = arg0.field447[0] * 128 + arg0.field414 * 64;
            arg0.method232();
        }
        if (Statics.field2035 == arg0 && (arg0.field427 < 1536 || arg0.field411 < 1536 || arg0.field427 >= 11776 || arg0.field411 >= 11776)) {
            arg0.field439 = -1;
            arg0.field444 = -1;
            arg0.field453 = 0;
            arg0.field454 = 0;
            arg0.field427 = arg0.field462[0] * 128 + arg0.field414 * 64;
            arg0.field411 = arg0.field447[0] * 128 + arg0.field414 * 64;
            arg0.method232();
        }
        if (arg0.field429 != 0) {
            if (arg0.field433 != -1 && arg0.field433 < 32768) {
                class24 var8 = field515[arg0.field433];
                if (var8 != null) {
                    int var9 = arg0.field427 - var8.field427;
                    int var10 = arg0.field411 - var8.field411;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field458 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field433 >= 32768) {
                int var11 = arg0.field433 - 32768;
                if (field605 == var11) {
                    var11 = 2047;
                }
                class3 var12 = field599[var11];
                if (var12 != null) {
                    int var13 = arg0.field427 - var12.field427;
                    int var14 = arg0.field411 - var12.field411;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field458 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field434 != 0 || arg0.field435 != 0) && (arg0.field441 == 0 || arg0.field415 > 0)) {
                int var15 = arg0.field427 - (arg0.field434 * 64 - Statics.field1631 * 64 - Statics.field1631 * 64);
                int var16 = arg0.field411 - (arg0.field435 * 64 - Statics.field456 * 64 - Statics.field456 * 64);
                if (var15 != 0 || var16 != 0) {
                    arg0.field458 = (int) (Math.atan2((double) var15, (double) var16) * 325.949D) & 0x7FF;
                }
                arg0.field434 = 0;
                arg0.field435 = 0;
            }
            int var17 = arg0.field458 - arg0.field412 & 0x7FF;
            if (var17 == 0) {
                arg0.field459 = 0;
            } else {
                arg0.field459++;
                if (var17 > 1024) {
                    arg0.field412 -= arg0.field429;
                    boolean var18 = true;
                    if (var17 < arg0.field429 || var17 > 2048 - arg0.field429) {
                        arg0.field412 = arg0.field458;
                        var18 = false;
                    }
                    if (arg0.field436 == arg0.field410 && (arg0.field459 > 25 || var18)) {
                        if (arg0.field442 == -1) {
                            arg0.field436 = arg0.field467;
                        } else {
                            arg0.field436 = arg0.field442;
                        }
                    }
                } else {
                    arg0.field412 += arg0.field429;
                    boolean var19 = true;
                    if (var17 < arg0.field429 || var17 > 2048 - arg0.field429) {
                        arg0.field412 = arg0.field458;
                        var19 = false;
                    }
                    if (arg0.field436 == arg0.field410 && (arg0.field459 > 25 || var19)) {
                        if (arg0.field417 == -1) {
                            arg0.field436 = arg0.field467;
                        } else {
                            arg0.field436 = arg0.field417;
                        }
                    }
                }
                arg0.field412 &= 0x7FF;
            }
        }
        method669(arg0);
    }

    @ObfuscatedName("i.ac(Lq;I)V")
    public static final void method152(class26 arg0) {
        int var1 = arg0.field453 - field568;
        int var2 = arg0.field449 * 128 + arg0.field414 * 64;
        int var3 = arg0.field451 * 128 + arg0.field414 * 64;
        arg0.field427 += (var2 - arg0.field427) / var1;
        arg0.field411 += (var3 - arg0.field411) / var1;
        arg0.field415 = 0;
        if (arg0.field421 == 0) {
            arg0.field458 = 1024;
        }
        if (arg0.field421 == 1) {
            arg0.field458 = 1536;
        }
        if (arg0.field421 == 2) {
            arg0.field458 = 0;
        }
        if (arg0.field421 == 3) {
            arg0.field458 = 512;
        }
    }

    @ObfuscatedName("k.az(Lq;I)V")
    public static final void method48(class26 arg0) {
        arg0.field436 = arg0.field410;
        if (arg0.field441 == 0) {
            arg0.field415 = 0;
            return;
        }
        if (arg0.field439 != -1 && arg0.field418 == 0) {
            class33 var1 = class33.method751(arg0.field439);
            if (arg0.field432 > 0 && var1.field888 == 0) {
                arg0.field415++;
                return;
            }
            if (arg0.field432 <= 0 && var1.field886 == 0) {
                arg0.field415++;
                return;
            }
        }
        int var2 = arg0.field427;
        int var3 = arg0.field411;
        int var4 = arg0.field462[arg0.field441 - 1] * 128 + arg0.field414 * 64;
        int var5 = arg0.field447[arg0.field441 - 1] * 128 + arg0.field414 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field427 = var4;
            arg0.field411 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field458 = 1280;
            } else if (var3 > var5) {
                arg0.field458 = 1792;
            } else {
                arg0.field458 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field458 = 768;
            } else if (var3 > var5) {
                arg0.field458 = 256;
            } else {
                arg0.field458 = 512;
            }
        } else if (var3 < var5) {
            arg0.field458 = 1024;
        } else if (var3 > var5) {
            arg0.field458 = 0;
        }
        int var6 = arg0.field458 - arg0.field412 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field419;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field467;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field446;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field420;
        }
        if (var7 == -1) {
            var7 = arg0.field467;
        }
        arg0.field436 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class24) {
            var9 = ((class24) arg0).field388.field802;
        }
        if (var9) {
            if (arg0.field458 != arg0.field412 && arg0.field433 == -1 && arg0.field429 != 0) {
                var8 = 2;
            }
            if (arg0.field441 > 2) {
                var8 = 6;
            }
            if (arg0.field441 > 3) {
                var8 = 8;
            }
            if (arg0.field415 > 0 && arg0.field441 > 1) {
                var8 = 8;
                arg0.field415--;
            }
        } else {
            if (arg0.field441 > 1) {
                var8 = 6;
            }
            if (arg0.field441 > 2) {
                var8 = 8;
            }
            if (arg0.field415 > 0 && arg0.field441 > 1) {
                var8 = 8;
                arg0.field415--;
            }
        }
        if (arg0.field464[arg0.field441 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field467 == arg0.field436 && arg0.field422 != -1) {
            arg0.field436 = arg0.field422;
        }
        if (var2 < var4) {
            arg0.field427 += var8;
            if (arg0.field427 > var4) {
                arg0.field427 = var4;
            }
        } else if (var2 > var4) {
            arg0.field427 -= var8;
            if (arg0.field427 < var4) {
                arg0.field427 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field411 += var8;
            if (arg0.field411 > var5) {
                arg0.field411 = var5;
            }
        } else if (var3 > var5) {
            arg0.field411 -= var8;
            if (arg0.field411 < var5) {
                arg0.field411 = var5;
            }
        }
        if (arg0.field427 == var4 && arg0.field411 == var5) {
            arg0.field441--;
            if (arg0.field432 > 0) {
                arg0.field432--;
            }
        }
    }

    @ObfuscatedName("az.ao(Lq;I)V")
    public static final void method669(class26 arg0) {
        arg0.field413 = false;
        if (arg0.field436 != -1) {
            class33 var1 = class33.method751(arg0.field436);
            if (var1 == null || var1.field876 == null) {
                arg0.field436 = -1;
            } else {
                arg0.field438++;
                if (arg0.field437 < var1.field876.length && arg0.field438 > var1.field883[arg0.field437]) {
                    arg0.field438 = 1;
                    arg0.field437++;
                    method787(var1, arg0.field437, arg0.field427, arg0.field411);
                }
                if (arg0.field437 >= var1.field876.length) {
                    arg0.field438 = 0;
                    arg0.field437 = 0;
                    method787(var1, arg0.field437, arg0.field427, arg0.field411);
                }
            }
        }
        if (arg0.field444 != -1 && field568 >= arg0.field465) {
            if (arg0.field445 < 0) {
                arg0.field445 = 0;
            }
            int var2 = class34.method7(arg0.field444).field904;
            if (var2 == -1) {
                arg0.field444 = -1;
            } else {
                class33 var3 = class33.method751(var2);
                if (var3 == null || var3.field876 == null) {
                    arg0.field444 = -1;
                } else {
                    arg0.field426++;
                    if (arg0.field445 < var3.field876.length && arg0.field426 > var3.field883[arg0.field445]) {
                        arg0.field426 = 1;
                        arg0.field445++;
                        method787(var3, arg0.field445, arg0.field427, arg0.field411);
                    }
                    if (arg0.field445 >= var3.field876.length && (arg0.field445 < 0 || arg0.field445 >= var3.field876.length)) {
                        arg0.field444 = -1;
                    }
                }
            }
        }
        if (arg0.field439 != -1 && arg0.field418 <= 1) {
            class33 var4 = class33.method751(arg0.field439);
            if (var4.field888 == 1 && arg0.field432 > 0 && arg0.field453 <= field568 && arg0.field454 < field568) {
                arg0.field418 = 1;
                return;
            }
        }
        if (arg0.field439 != -1 && arg0.field418 == 0) {
            class33 var5 = class33.method751(arg0.field439);
            if (var5 == null || var5.field876 == null) {
                arg0.field439 = -1;
            } else {
                arg0.field460++;
                if (arg0.field440 < var5.field876.length && arg0.field460 > var5.field883[arg0.field440]) {
                    arg0.field460 = 1;
                    arg0.field440++;
                    method787(var5, arg0.field440, arg0.field427, arg0.field411);
                }
                if (arg0.field440 >= var5.field876.length) {
                    arg0.field440 -= var5.field885;
                    arg0.field443++;
                    if (arg0.field443 >= var5.field896) {
                        arg0.field439 = -1;
                    } else if (arg0.field440 >= 0 && arg0.field440 < var5.field876.length) {
                        method787(var5, arg0.field440, arg0.field427, arg0.field411);
                    } else {
                        arg0.field439 = -1;
                    }
                }
                arg0.field413 = var5.field887;
            }
        }
        if (arg0.field418 > 0) {
            arg0.field418--;
        }
    }

    @ObfuscatedName("ec.am(Lw;III)V")
    public static void method2781(class3 arg0, int arg1, int arg2) {
        if (arg0.field439 == arg1 && arg1 != -1) {
            int var3 = class33.method751(arg1).field894;
            if (var3 == 1) {
                arg0.field440 = 0;
                arg0.field460 = 0;
                arg0.field418 = arg2;
                arg0.field443 = 0;
            }
            if (var3 == 2) {
                arg0.field443 = 0;
            }
        } else if (arg1 == -1 || arg0.field439 == -1 || class33.method751(arg1).field881 >= class33.method751(arg0.field439).field881) {
            arg0.field439 = arg1;
            arg0.field440 = 0;
            arg0.field460 = 0;
            arg0.field418 = arg2;
            arg0.field443 = 0;
            arg0.field432 = arg0.field441;
        }
    }

    @ObfuscatedName("i.ad(Ljava/lang/String;ZI)V")
    public static final void method151(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1797.method3372(arg0, 250);
        int var6 = Statics.field1797.method3360(arg0, 250) * 13;
        class88.method1761(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class88.method1763(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1797.method3365(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2177(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method166(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field740.getGraphics();
            Statics.field269.method1570(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field740.repaint();
        }
    }

    @ObfuscatedName("t.an(ZI)V")
    public static final void method219(boolean arg0) {
        if (Statics.field2035.field427 >> 7 == field703 && Statics.field2035.field411 >> 7 == field712) {
            field703 = 0;
        }
        int var1 = field600;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field2035;
                var4 = 33538048;
            } else {
                var3 = field599[field601[var2]];
                var4 = field601[var2] << 14;
            }
            if (var3 != null && var3.method18()) {
                var3.field59 = false;
                if ((field634 && field600 > 50 || field600 > 200) && !arg0 && var3.field436 == var3.field410) {
                    var3.field59 = true;
                }
                int var5 = var3.field427 >> 7;
                int var6 = var3.field411 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field54 == null || field568 < var3.field49 || field568 >= var3.field64) {
                        if ((var3.field427 & 0x7F) == 64 && (var3.field411 & 0x7F) == 64) {
                            if (field583 == field582[var5][var6]) {
                                continue;
                            }
                            field582[var5][var6] = field583;
                        }
                        var3.field48 = method143(var3.field427, var3.field411, Statics.field189);
                        Statics.field335.method1844(Statics.field189, var3.field427, var3.field411, var3.field48, 60, var3, var3.field412, var4, var3.field413);
                    } else {
                        var3.field59 = false;
                        var3.field48 = method143(var3.field427, var3.field411, Statics.field189);
                        Statics.field335.method1845(Statics.field189, var3.field427, var3.field411, var3.field48, 60, var3, var3.field412, var4, var3.field55, var3.field61, var3.field63, var3.field58);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ch.al(ZI)V")
    public static final void method1995(boolean arg0) {
        for (int var1 = 0; var1 < field516; var1++) {
            class24 var2 = field515[field628[var1]];
            int var3 = (field628[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field388.field792 == arg0 && var2.field388.method562()) {
                int var4 = var2.field427 >> 7;
                int var5 = var2.field411 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field414 == 1 && (var2.field427 & 0x7F) == 64 && (var2.field411 & 0x7F) == 64) {
                        if (field583 == field582[var4][var5]) {
                            continue;
                        }
                        field582[var4][var5] = field583;
                    }
                    if (!var2.field388.field776) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field335.method1844(Statics.field189, var2.field427, var2.field411, method143(var2.field427 + (var2.field414 * 64 - 64), var2.field411 + (var2.field414 * 64 - 64), Statics.field189), var2.field414 * 64 - 64 + 60, var2, var2.field412, var3, var2.field413);
                }
            }
        }
    }

    @ObfuscatedName("ec.ab(I)V")
    public static final void method2779() {
        for (class10 var0 = (class10) field615.method3285(); var0 != null; var0 = (class10) field615.method3299()) {
            if (Statics.field189 != var0.field160 || field568 > var0.field188) {
                var0.method3327();
            } else if (field568 >= var0.field173) {
                if (var0.field159 > 0) {
                    class24 var1 = field515[var0.field159 - 1];
                    if (var1 != null && var1.field427 >= 0 && var1.field427 < 13312 && var1.field411 >= 0 && var1.field411 < 13312) {
                        var0.method112(var1.field427, var1.field411, method143(var1.field427, var1.field411, var0.field160) - var0.field164, field568);
                    }
                }
                if (var0.field159 < 0) {
                    int var2 = -var0.field159 - 1;
                    class3 var3;
                    if (field605 == var2) {
                        var3 = Statics.field2035;
                    } else {
                        var3 = field599[var2];
                    }
                    if (var3 != null && var3.field427 >= 0 && var3.field427 < 13312 && var3.field411 >= 0 && var3.field411 < 13312) {
                        var0.method112(var3.field427, var3.field411, method143(var3.field427, var3.field411, var0.field160) - var0.field164, field568);
                    }
                }
                var0.method120(field558);
                Statics.field335.method1844(Statics.field189, (int) var0.field182, (int) var0.field172, (int) var0.field180, 60, var0, var0.field179, -1, false);
            }
        }
    }

    @ObfuscatedName("q.af(I)I")
    public static final int method233() {
        int var0 = method143(Statics.field237, Statics.field771, Statics.field189);
        return var0 - Statics.field2055 >= 800 || (class9.field136[Statics.field189][Statics.field237 >> 7][Statics.field771 >> 7] & 0x4) == 0 ? 3 : Statics.field189;
    }

    @ObfuscatedName("j.ap(IIIII)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3) {
        field572 = 0;
        for (int var4 = -1; var4 < field600 + field516; var4++) {
            class26 var5;
            if (var4 == -1) {
                var5 = Statics.field2035;
            } else if (var4 < field600) {
                var5 = field599[field601[var4]];
            } else {
                var5 = field515[field628[var4 - field600]];
            }
            if (var5 != null && var5.method18()) {
                if (var5 instanceof class24) {
                    class30 var6 = ((class24) var5).field388;
                    if (var6.field798 != null) {
                        var6 = var6.method561();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field600) {
                    class30 var9 = ((class24) var5).field388;
                    if (var9.field798 != null) {
                        var9 = var9.method561();
                    }
                    if (var9.field803 >= 0 && var9.field803 < Statics.field155.length) {
                        method2978(var5, var5.field430 + 15);
                        if (field584 > -1) {
                            Statics.field155[var9.field803].method1660(field584 + arg0 - 12, field476 + arg1 - 30);
                        }
                    }
                    if (field538 == 1 && field494 == field628[var4 - field600] && field568 % 20 < 10) {
                        method2978(var5, var5.field430 + 15);
                        if (field584 > -1) {
                            Statics.field194[0].method1660(field584 + arg0 - 12, field476 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field44 != -1 || var8.field65 != -1) {
                        method2978(var5, var5.field430 + 15);
                        if (field584 > -1) {
                            if (var8.field44 != -1) {
                                Statics.field956[var8.field44].method1660(field584 + arg0 - 12, field476 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field65 != -1) {
                                Statics.field155[var8.field65].method1660(field584 + arg0 - 12, field476 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field538 == 10 && field495 == field601[var4]) {
                        method2978(var5, var5.field430 + 15);
                        if (field584 > -1) {
                            Statics.field194[1].method1660(field584 + arg0 - 12, field476 + arg1 - var7);
                        }
                    }
                }
                if (var5.field423 != null && (var4 >= field600 || field696 == 0 || field696 == 3 || field696 == 1 && method2620(((class3) var5).field57))) {
                    method2978(var5, var5.field430);
                    if (field584 > -1 && field572 < field573) {
                        field662[field572] = Statics.field24.method3357(var5.field423) / 2;
                        field576[field572] = Statics.field24.field2835;
                        field574[field572] = field584;
                        field575[field572] = field476;
                        field578[field572] = var5.field425;
                        field579[field572] = var5.field416;
                        field580[field572] = var5.field463;
                        field664[field572] = var5.field423;
                        field572++;
                    }
                }
                if (var5.field448 > field568) {
                    method2978(var5, var5.field430 + 15);
                    if (field584 > -1) {
                        int var10 = var5.field431 * 30 / var5.field424;
                        if (var10 > 30) {
                            var10 = 30;
                        }
                        class88.method1761(field584 + arg0 - 15, field476 + arg1 - 3, var10, 5, 65280);
                        class88.method1761(field584 + arg0 - 15 + var10, field476 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field466[var11] > field568) {
                        method2978(var5, var5.field430 / 2);
                        if (field584 > -1) {
                            if (var11 == 1) {
                                field476 -= 20;
                            }
                            if (var11 == 2) {
                                field584 -= 15;
                                field476 -= 10;
                            }
                            if (var11 == 3) {
                                field584 += 15;
                                field476 -= 10;
                            }
                            Statics.field1173[var5.field428[var11]].method1660(field584 + arg0 - 12, field476 + arg1 - 12);
                            Statics.field184.method3436(Integer.toString(var5.field457[var11]), field584 + arg0 - 1, field476 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field572; var12++) {
            int var13 = field574[var12];
            int var14 = field575[var12];
            int var15 = field662[var12];
            int var16 = field576[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field575[var18] - field576[var18] && var14 - var16 < field575[var18] + 2 && var13 - var15 < field662[var18] + field574[var18] && var13 + var15 > field574[var18] - field662[var18] && field575[var18] - field576[var18] < var14) {
                        var14 = field575[var18] - field576[var18];
                        var17 = true;
                    }
                }
            }
            field584 = field574[var12];
            field476 = field575[var12] = var14;
            String var19 = field664[var12];
            if (field566 == 0) {
                int var20 = 16776960;
                if (field578[var12] < 6) {
                    var20 = field482[field578[var12]];
                }
                if (field578[var12] == 6) {
                    var20 = field583 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field578[var12] == 7) {
                    var20 = field583 % 20 < 10 ? 255 : 65535;
                }
                if (field578[var12] == 8) {
                    var20 = field583 % 20 < 10 ? 45056 : 8454016;
                }
                if (field578[var12] == 9) {
                    int var21 = 150 - field580[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field578[var12] == 10) {
                    int var22 = 150 - field580[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field578[var12] == 11) {
                    int var23 = 150 - field580[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field579[var12] == 0) {
                    Statics.field24.method3436(var19, field584 + arg0, field476 + arg1, var20, 0);
                }
                if (field579[var12] == 1) {
                    Statics.field24.method3366(var19, field584 + arg0, field476 + arg1, var20, 0, field583);
                }
                if (field579[var12] == 2) {
                    Statics.field24.method3367(var19, field584 + arg0, field476 + arg1, var20, 0, field583);
                }
                if (field579[var12] == 3) {
                    Statics.field24.method3368(var19, field584 + arg0, field476 + arg1, var20, 0, field583, 150 - field580[var12]);
                }
                if (field579[var12] == 4) {
                    int var24 = (150 - field580[var12]) * (Statics.field24.method3357(var19) + 100) / 150;
                    class88.method1756(field584 + arg0 - 50, arg1, field584 + arg0 + 50, arg1 + arg3);
                    Statics.field24.method3411(var19, field584 + arg0 + 50 - var24, field476 + arg1, var20, 0);
                    class88.method1759(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field579[var12] == 5) {
                    int var25 = 150 - field580[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class88.method1756(arg0, field476 + arg1 - Statics.field24.field2835 - 1, arg0 + arg2, field476 + arg1 + 5);
                    Statics.field24.method3436(var19, field584 + arg0, field476 + arg1 + var26, var20, 0);
                    class88.method1759(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field24.method3436(var19, field584 + arg0, field476 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("n.as(IIIIB)V")
    public static final void method69(int arg0, int arg1, int arg2, int arg3) {
        if (field589 == 1) {
            Statics.field132[field674 / 100].method1660(field622 - 8, field587 - 8);
        }
        if (field589 == 2) {
            Statics.field132[field674 / 100 + 4].method1660(field622 - 8, field587 - 8);
        }
        field598 = 0;
        int var4 = (Statics.field2035.field427 >> 7) + Statics.field1631;
        int var5 = (Statics.field2035.field411 >> 7) + Statics.field456;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field598 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field598 = 1;
        }
        if (field598 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field598 = 0;
        }
        if (!field689) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field1797.method3363("Fps:" + field1312, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field634) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field634) {
            var10 = 16711680;
        }
        Statics.field1797.method3363("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("er.av(Lq;IB)V")
    public static final void method2978(class26 arg0, int arg1) {
        method704(arg0.field427, arg0.field411, arg1);
    }

    @ObfuscatedName("ao.ay(IIIB)V")
    public static final void method704(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field584 = -1;
            field476 = -1;
            return;
        }
        int var3 = method143(arg0, arg1, Statics.field189) - arg2;
        int var4 = arg0 - Statics.field237;
        int var5 = var3 - Statics.field2055;
        int var6 = arg1 - Statics.field771;
        int var7 = class103.field1790[Statics.field975];
        int var8 = class103.field1787[Statics.field975];
        int var9 = class103.field1790[Statics.field99];
        int var10 = class103.field1787[Statics.field99];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field584 = (var11 << 9) / var15 + 256;
            field476 = (var14 << 9) / var15 + 167;
        } else {
            field584 = -1;
            field476 = -1;
        }
    }

    @ObfuscatedName("m.ah(IIII)I")
    public static final int method143(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field136[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field156[var5][var3][var4] + class9.field156[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field156[var5][var3][var4 + 1] + class9.field156[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bi.aa(ZI)V")
    public static final void method1545(boolean arg0) {
        field519 = arg0;
        if (!field519) {
            int var1 = field520.method2408();
            int var2 = field520.method2489();
            int var3 = (field521 - field520.field2043) / 16;
            Statics.field711 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field711[var4][var5] = field520.method2419();
                }
            }
            int var6 = field520.method2408();
            int var7 = field520.method2551();
            int var8 = field520.method2416();
            Statics.field404 = new int[var3];
            Statics.field2078 = new int[var3];
            Statics.field1661 = new int[var3];
            Statics.field756 = new byte[var3][];
            Statics.field196 = new byte[var3][];
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
                        Statics.field404[var10] = var13;
                        Statics.field2078[var10] = Statics.field897.method2936("m" + var11 + "_" + var12);
                        Statics.field1661[var10] = Statics.field897.method2936("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1502(var1, var7, var8, var2, var6);
            return;
        }
        int var14 = field520.method2416();
        int var15 = field520.method2489();
        int var16 = field520.method2489();
        int var17 = field520.method2486();
        field520.method2273();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field520.method2267(1);
                    if (var21 == 1) {
                        field507[var18][var19][var20] = field520.method2267(26);
                    } else {
                        field507[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field520.method2256();
        int var22 = (field521 - field520.field2043) / 16;
        Statics.field711 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field711[var23][var24] = field520.method2419();
            }
        }
        int var25 = field520.method2489();
        Statics.field404 = new int[var22];
        Statics.field2078 = new int[var22];
        Statics.field1661 = new int[var22];
        Statics.field756 = new byte[var22][];
        Statics.field196 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field507[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field404[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field404[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2078[var26] = Statics.field897.method2936("m" + var35 + "_" + var36);
                            Statics.field1661[var26] = Statics.field897.method2936("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1502(var17, var15, var14, var25, var16);
    }

    @ObfuscatedName("by.ag(IIIIII)V")
    public static final void method1502(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field115 == arg0 && Statics.field1531 == arg1 && field530 == arg2 || !field634) {
            return;
        }
        Statics.field115 = arg0;
        Statics.field1531 = arg1;
        field530 = arg2;
        if (!field634) {
            field530 = 0;
        }
        method771(25);
        method151(class133.field2158, true);
        int var5 = Statics.field1631;
        int var6 = Statics.field456;
        Statics.field1631 = (arg0 - 6) * 8;
        Statics.field456 = (arg1 - 6) * 8;
        int var7 = Statics.field1631 - var5;
        int var8 = Statics.field456 - var6;
        int var9 = Statics.field1631;
        int var10 = Statics.field456;
        for (int var11 = 0; var11 < 32768; var11++) {
            class24 var12 = field515[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field462[var13] -= var7;
                    var12.field447[var13] -= var8;
                }
                var12.field427 -= var7 * 128;
                var12.field411 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field599[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field462[var16] -= var7;
                    var15.field447[var16] -= var8;
                }
                var15.field427 -= var7 * 128;
                var15.field411 -= var8 * 128;
            }
        }
        Statics.field189 = arg2;
        Statics.field2035.method234(arg3, arg4, false);
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
                        field733[var27][var23][var24] = field733[var27][var25][var26];
                    } else {
                        field733[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class21 var28 = (class21) field681.method3285(); var28 != null; var28 = (class21) field681.method3299()) {
            var28.field336 -= var7;
            var28.field338 -= var8;
            if (var28.field336 < 0 || var28.field338 < 0 || var28.field336 >= 104 || var28.field338 >= 104) {
                var28.method3327();
            }
        }
        if (field703 != 0) {
            field703 -= var7;
            field712 -= var8;
        }
        field549 = 0;
        field591 = false;
        field706 = -1;
        field636.method3287();
        field615.method3287();
    }

    @ObfuscatedName("el.au(ZB)V")
    public static final void method2623(boolean arg0) {
        method68();
        field480++;
        if (field480 < 50 && !arg0) {
            return;
        }
        field480 = 0;
        if (field529 || Statics.field1300 == null) {
            return;
        }
        field518.method2258(107);
        try {
            Statics.field1300.method1339(field518.field2047, 0, field518.field2043);
            field518.field2043 = 0;
        } catch (IOException var2) {
            field529 = true;
        }
    }

    @ObfuscatedName("dr.aw(II)V")
    public static final void method2312(int arg0) {
        int[] var1 = Statics.field135.field1475;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field136[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field335.method1959(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field136[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field335.method1959(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field135.method1722();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field136[arg0][var10][var9] & 0x18) == 0) {
                    method172(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field136[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method172(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field647 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field335.method1862(Statics.field189, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class31.method187(var14).field843;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field536[Statics.field189].field2742;
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
                        field710[field647] = Statics.field2456[var15];
                        field708[field647] = var16;
                        field577[field647] = var17;
                        field647++;
                    }
                }
            }
        }
        Statics.field269.method1640();
    }

    @ObfuscatedName("d.ar(IIIIIB)V")
    public static final void method172(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field335.method1843(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field335.method1863(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field135.field1475;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class31 var13 = class31.method187(var12);
            if (var13.field833 == -1) {
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
                class86 var14 = Statics.field1172[var13.field833];
                if (var14 != null) {
                    int var15 = (var13.field830 * 4 - var14.field1483) / 2;
                    int var16 = (var13.field831 * 4 - var14.field1485) / 2;
                    var14.method1744(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field831) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field335.method1861(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field335.method1863(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class31 var22 = class31.method187(var21);
            if (var22.field833 != -1) {
                class86 var23 = Statics.field1172[var22.field833];
                if (var23 != null) {
                    int var24 = (var22.field830 * 4 - var23.field1483) / 2;
                    int var25 = (var22.field831 * 4 - var23.field1485) / 2;
                    var23.method1744(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field831) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field135.field1475;
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
        int var29 = Statics.field335.method1862(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class31 var31 = class31.method187(var30);
        if (var31.field833 == -1) {
            return;
        }
        class86 var32 = Statics.field1172[var31.field833];
        if (var32 != null) {
            int var33 = (var31.field830 * 4 - var32.field1483) / 2;
            int var34 = (var31.field831 * 4 - var32.field1485) / 2;
            var32.method1744(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field831) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("q.ai(IIII)Z")
    public static final boolean method243(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field335.method1863(Statics.field189, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class31 var7 = class31.method187(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field830;
                var9 = var7.field831;
            } else {
                var8 = var7.field831;
                var9 = var7.field830;
            }
            int var10 = var7.field819;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field622 = class76.field1395;
        field587 = class76.field1394;
        field589 = 2;
        field674 = 0;
        return true;
    }

    @ObfuscatedName("dr.ak(IIIIZIIIIIIB)Z")
    public static final boolean method2313(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field727[var11][var12] = 0;
                field543[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field727[arg0][arg1] = 99;
        field543[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field544[var15] = arg0;
        int var36 = var15 + 1;
        field545[var15] = arg1;
        boolean var17 = false;
        int var18 = field544.length;
        int[][] var19 = field536[Statics.field189].field2742;
        while (var36 != var16) {
            var13 = field544[var16];
            var14 = field545[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field536[Statics.field189].method3206(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field536[Statics.field189].method3168(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field536[Statics.field189].method3173(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field543[var13][var14] + 1;
            if (var13 > 0 && field727[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field544[var36] = var13 - 1;
                field545[var36] = var14;
                var36 = (var36 + 1) % var18;
                field727[var13 - 1][var14] = 2;
                field543[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field727[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field544[var36] = var13 + 1;
                field545[var36] = var14;
                var36 = (var36 + 1) % var18;
                field727[var13 + 1][var14] = 8;
                field543[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field727[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field544[var36] = var13;
                field545[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field727[var13][var14 - 1] = 1;
                field543[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field727[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field544[var36] = var13;
                field545[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field727[var13][var14 + 1] = 4;
                field543[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field727[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field544[var36] = var13 - 1;
                field545[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field727[var13 - 1][var14 - 1] = 3;
                field543[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field727[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field544[var36] = var13 + 1;
                field545[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field727[var13 + 1][var14 - 1] = 9;
                field543[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field727[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field544[var36] = var13 - 1;
                field545[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field727[var13 - 1][var14 + 1] = 6;
                field543[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field727[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field544[var36] = var13 + 1;
                field545[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field727[var13 + 1][var14 + 1] = 12;
                field543[var13 + 1][var14 + 1] = var20;
            }
        }
        field637 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field543[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field543[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field543[var24][var25];
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
            field637 = 1;
        }
        byte var29 = 0;
        field544[var29] = var13;
        int var37 = var29 + 1;
        field545[var29] = var14;
        int var30;
        int var31 = var30 = field727[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field544[var37] = var13;
                field545[var37++] = var14;
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
            var31 = field727[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field544[var37];
            int var34 = field545[var37];
            if (arg10 == 0) {
                field518.method2258(101);
                field518.method2362(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field518.method2258(218);
                field518.method2362(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field518.method2258(244);
                field518.method2362(var32 + var32 + 3);
            }
            field518.method2396(class74.field1344[82] ? 1 : 0);
            field518.method2405(Statics.field1631 + var33);
            field703 = field544[0];
            field712 = field545[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field518.method2396(field544[var37] - var33);
                field518.method2362(field545[var37] - var34);
            }
            field518.method2550(Statics.field456 + var34);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("v.ax(I)Z")
    public static final boolean method39() {
        if (Statics.field1300 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1300.method1355();
            if (var0 == 0) {
                return false;
            }
            if (field522 == -1) {
                Statics.field1300.method1338(field520.field2047, 0, 1);
                field520.field2043 = 0;
                field522 = field520.method2260();
                field521 = class164.field2764[field522];
                var0--;
            }
            if (field521 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1300.method1338(field520.field2047, 0, 1);
                field521 = field520.field2047[0] & 0xFF;
                var0--;
            }
            if (field521 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1300.method1338(field520.field2047, 0, 2);
                field520.field2043 = 0;
                field521 = field520.method2489();
                var0 -= 2;
            }
            if (var0 < field521) {
                return false;
            }
            field520.field2043 = 0;
            Statics.field1300.method1338(field520.field2047, 0, field521);
            field523 = 0;
            field528 = field652;
            field652 = field526;
            field526 = field522;
            if (field522 == 131) {
                int var1 = field520.method2400();
                int var2 = field520.method2573();
                int var3 = field520.method2573();
                Statics.field189 = var2 >> 1;
                Statics.field2035.method234(var3, var1, (var2 & 0x1) == 1);
                field522 = -1;
                return true;
            }
            if (field522 == 167) {
                int var4 = field520.method2419();
                Statics.field797 = Statics.field1175.method1468(var4);
                field522 = -1;
                return true;
            }
            if (field522 == 44) {
                field520.field2043 += 28;
                if (field520.method2395()) {
                    class81.method2617(field520, field520.field2043 - 28);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 5) {
                method206();
                field645 = field520.method2378();
                field725 = field729;
                field522 = -1;
                return true;
            }
            if (field522 == 92) {
                method209();
                field522 = -1;
                return false;
            }
            if (field522 == 89) {
                int var5 = field520.method2489();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field520.method2380();
                int var7 = field520.method2489();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field520.method2380();
                for (int var9 = var7; var9 <= var5; var9++) {
                    long var10 = ((long) var8 << 32) + (long) var9;
                    class178 var12 = field610.method3261(var10);
                    if (var12 != null) {
                        var12.method3327();
                    }
                    field610.method3262(new class170(var6), var10);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 186) {
                field732 = 1;
                field588 = field729;
                field522 = -1;
                return true;
            }
            if (field522 == 175 || field522 == 174 || field522 == 182 || field522 == 206 || field522 == 181 || field522 == 30 || field522 == 198 || field522 == 208 || field522 == 191 || field522 == 88 || field522 == 195) {
                method1831();
                field522 = -1;
                return true;
            }
            if (field522 == 53) {
                field591 = true;
                Statics.field898 = field520.method2544();
                Statics.field2083 = field520.method2544();
                Statics.field2765 = field520.method2489();
                Statics.field1763 = field520.method2544();
                Statics.field199 = field520.method2544();
                if (Statics.field199 >= 100) {
                    Statics.field237 = Statics.field898 * 128 + 64;
                    Statics.field771 = Statics.field2083 * 128 + 64;
                    Statics.field2055 = method143(Statics.field237, Statics.field771, Statics.field189) - Statics.field2765;
                }
                field522 = -1;
                return true;
            }
            if (field522 == 103) {
                int var13 = field520.method2489();
                class18 var14 = (class18) class18.field275.method3261((long) var13);
                if (var14 != null) {
                    var14.method3327();
                }
                field665[++field666 - 1 & 0x1F] = var13 & 0x7FFF;
                field522 = -1;
                return true;
            }
            if (field522 == 192) {
                int var15 = field520.method2489();
                int var16 = field520.method2408();
                int var17 = field520.method2380();
                class157 var18 = class157.method2079(var17);
                var18.field2636 = (var16 << 16) + var15;
                field522 = -1;
                return true;
            }
            if (field522 == 119) {
                int var19 = field520.method2417();
                class157 var20 = class157.method2079(var19);
                var20.field2663 = 3;
                var20.field2671 = Statics.field2035.field52.method3139();
                Statics.method1546(var20);
                field522 = -1;
                return true;
            }
            if (field522 == 125) {
                int var21 = field520.method2417();
                boolean var22 = field520.method2544() == 1;
                class157 var23 = class157.method2079(var21);
                if (var23.field2577 != var22) {
                    var23.field2577 = var22;
                    Statics.method1546(var23);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 15) {
                int var24 = field520.method2408();
                int var25 = field520.method2419();
                class157 var26 = class157.method2079(var25);
                if (var26 != null && var26.field2581 == 0) {
                    if (var24 > var26.field2595 - var26.field2589) {
                        var24 = var26.field2595 - var26.field2589;
                    }
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    if (var26.field2611 != var24) {
                        var26.field2611 = var24;
                        Statics.method1546(var26);
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 99) {
                int var27 = field520.method2551();
                if (var27 == 65535) {
                    var27 = -1;
                }
                Statics.method1333(var27);
                field522 = -1;
                return true;
            }
            if (field522 == 20) {
                int var28 = field520.method2413();
                int var29 = field520.method2408();
                if (var29 == 65535) {
                    var29 = -1;
                }
                if (field714 != 0 && var29 != -1) {
                    class137.method1378(Statics.field235, var29, 0, field714, false);
                    field716 = true;
                }
                field522 = -1;
                return true;
            }
            if (field522 == 148) {
                int var30 = field520.method2537();
                int var31 = field520.method2380();
                int var32 = field520.method2404();
                class157 var33 = class157.method2079(var31);
                int var34 = var33.field2586 + var32;
                int var35 = var33.field2660 + var30;
                if (var33.field2584 != var34 || var33.field2697 != var35) {
                    var33.field2584 = var34;
                    var33.field2697 = var35;
                    Statics.method1546(var33);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 229) {
                int var36 = field520.method2417();
                int var37 = field520.method2489();
                class158.field2699[var37] = var36;
                if (class158.field2700[var37] != var36) {
                    class158.field2700[var37] = var36;
                    method1554(var37);
                }
                field663[++field509 - 1 & 0x1F] = var37;
                field522 = -1;
                return true;
            }
            if (field522 == 120) {
                String var38 = field520.method2383();
                if (var38.endsWith(":tradereq:")) {
                    String var39 = var38.substring(0, var38.indexOf(":"));
                    boolean var40 = false;
                    if (method71(var39)) {
                        var40 = true;
                    }
                    if (!var40 && field598 == 0) {
                        method1826(4, var39, class133.field2226);
                    }
                } else if (var38.endsWith(":duelreq:")) {
                    String var41 = var38.substring(0, var38.indexOf(":"));
                    boolean var42 = false;
                    if (method71(var41)) {
                        var42 = true;
                    }
                    if (!var42 && field598 == 0) {
                        method1826(8, var41, class133.field2227);
                    }
                } else if (var38.endsWith(":chalreq:")) {
                    String var43 = var38.substring(0, var38.indexOf(":"));
                    boolean var44 = false;
                    if (method71(var43)) {
                        var44 = true;
                    }
                    if (!var44 && field598 == 0) {
                        String var45 = var38.substring(var38.indexOf(":") + 1, var38.length() - 9);
                        method1826(8, var43, var45);
                    }
                } else if (var38.endsWith(":assistreq:")) {
                    String var46 = var38.substring(0, var38.indexOf(":"));
                    boolean var47 = false;
                    if (method71(var46)) {
                        var47 = true;
                    }
                    if (!var47 && field598 == 0) {
                        method1826(10, var46, "");
                    }
                } else if (var38.endsWith(":clan:")) {
                    String var48 = var38.substring(0, var38.indexOf(":clan:"));
                    method1826(11, "", var48);
                } else if (var38.endsWith(":trade:")) {
                    String var49 = var38.substring(0, var38.indexOf(":trade:"));
                    if (field598 == 0) {
                        method1826(12, "", var49);
                    }
                } else if (var38.endsWith(":assist:")) {
                    String var50 = var38.substring(0, var38.indexOf(":assist:"));
                    if (field598 == 0) {
                        method1826(13, "", var50);
                    }
                } else {
                    method1826(0, "", var38);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 95) {
                Statics.field111 = field520.method2544();
                Statics.field1253 = field520.method2573();
                for (int var51 = Statics.field1253; var51 < Statics.field1253 + 8; var51++) {
                    for (int var52 = Statics.field111; var52 < Statics.field111 + 8; var52++) {
                        if (field733[Statics.field189][var51][var52] != null) {
                            field733[Statics.field189][var51][var52] = null;
                            method652(var51, var52);
                        }
                    }
                }
                for (class21 var53 = (class21) field681.method3285(); var53 != null; var53 = (class21) field681.method3299()) {
                    if (var53.field336 >= Statics.field1253 && var53.field336 < Statics.field1253 + 8 && var53.field338 >= Statics.field111 && var53.field338 < Statics.field111 + 8 && Statics.field189 == var53.field353) {
                        var53.field346 = 0;
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 47) {
                field596 = field729;
                if (field521 == 0) {
                    field704 = null;
                    field684 = null;
                    Statics.field276 = 0;
                    Statics.field66 = null;
                    field522 = -1;
                    return true;
                }
                field684 = field520.method2383();
                long var54 = field520.method2502();
                long var56 = var54;
                String var58;
                if (var54 <= 0L || var54 >= 6582952005840035281L) {
                    var58 = null;
                } else if (var54 % 37L == 0L) {
                    var58 = null;
                } else {
                    int var59 = 0;
                    for (long var60 = var54; var60 != 0L; var60 /= 37L) {
                        var59++;
                    }
                    StringBuilder var62 = new StringBuilder(var59);
                    while (var56 != 0L) {
                        long var63 = var56;
                        var56 /= 37L;
                        var62.append(class145.field2447[(int) (var63 - var56 * 37L)]);
                    }
                    var58 = var62.reverse().toString();
                }
                field704 = var58;
                Statics.field468 = field520.method2376();
                int var65 = field520.method2544();
                if (var65 == 255) {
                    field522 = -1;
                    return true;
                }
                Statics.field276 = var65;
                class8[] var66 = new class8[100];
                for (int var67 = 0; var67 < Statics.field276; var67++) {
                    var66[var67] = new class8();
                    var66[var67].field123 = field520.method2383();
                    var66[var67].field128 = class147.method2661(var66[var67].field123, Statics.field1836);
                    var66[var67].field124 = field520.method2489();
                    var66[var67].field122 = field520.method2376();
                    field520.method2383();
                    if (var66[var67].field123.equals(Statics.field2035.field57)) {
                        Statics.field369 = var66[var67].field122;
                    }
                }
                boolean var68 = false;
                int var69 = Statics.field276;
                while (var69 > 0) {
                    boolean var70 = true;
                    var69--;
                    for (int var71 = 0; var71 < var69; var71++) {
                        if (var66[var71].field128.compareTo(var66[var71 + 1].field128) > 0) {
                            class8 var72 = var66[var71];
                            var66[var71] = var66[var71 + 1];
                            var66[var71 + 1] = var72;
                            var70 = false;
                        }
                    }
                    if (var70) {
                        break;
                    }
                }
                Statics.field66 = var66;
                field522 = -1;
                return true;
            }
            if (field522 == 157) {
                method206();
                field644 = field520.method2544();
                field725 = field729;
                field522 = -1;
                return true;
            }
            if (field522 == 59) {
                class181.method220(field520, field521);
                field522 = -1;
                return true;
            }
            if (field522 == 152) {
                field591 = false;
                for (int var73 = 0; var73 < 5; var73++) {
                    field726[var73] = false;
                }
                field522 = -1;
                return true;
            }
            if (field522 == 219) {
                for (int var74 = 0; var74 < class158.field2700.length; var74++) {
                    if (class158.field2700[var74] != class158.field2699[var74]) {
                        class158.field2700[var74] = class158.field2699[var74];
                        method1554(var74);
                        field663[++field509 - 1 & 0x1F] = var74;
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 203) {
                int var75 = field520.method2380();
                int var76 = field520.method2489();
                if (var75 < -70000) {
                    var76 += 32768;
                }
                class157 var77;
                if (var75 >= 0) {
                    var77 = class157.method2079(var75);
                } else {
                    var77 = null;
                }
                if (var77 != null) {
                    for (int var78 = 0; var78 < var77.field2652.length; var78++) {
                        var77.field2652[var78] = 0;
                        var77.field2682[var78] = 0;
                    }
                }
                class18.method1356(var76);
                int var79 = field520.method2489();
                for (int var80 = 0; var80 < var79; var80++) {
                    int var81 = field520.method2489();
                    int var82 = field520.method2573();
                    if (var82 == 255) {
                        var82 = field520.method2418();
                    }
                    if (var77 != null && var80 < var77.field2652.length) {
                        var77.field2652[var80] = var81;
                        var77.field2682[var80] = var82;
                    }
                    class18.method38(var76, var80, var81 - 1, var82);
                }
                if (var77 != null) {
                    Statics.method1546(var77);
                }
                method206();
                field665[++field666 - 1 & 0x1F] = var76 & 0x7FFF;
                field522 = -1;
                return true;
            }
            if (field522 == 154) {
                method1545(true);
                field522 = -1;
                return true;
            }
            if (field522 == 74) {
                method128();
                field522 = -1;
                return true;
            }
            if (field522 == 98) {
                int var83 = field520.method2380();
                class4 var84 = (class4) field640.method3261((long) var83);
                if (var84 != null) {
                    method45(var84, true);
                }
                if (field643 != null) {
                    Statics.method1546(field643);
                    field643 = null;
                }
                field522 = -1;
                return true;
            }
            if (field522 == 215) {
                int var85 = field520.method2408();
                field639 = var85;
                method1200(var85);
                class25.method1332(field639);
                for (int var86 = 0; var86 < 100; var86++) {
                    field617[var86] = true;
                }
                field522 = -1;
                return true;
            }
            if (field522 == 204) {
                int var87 = field520.method2380();
                int var88 = field520.method2408();
                int var89 = var88 >> 10 & 0x1F;
                int var90 = var88 >> 5 & 0x1F;
                int var91 = var88 & 0x1F;
                int var92 = (var91 << 3) + (var89 << 19) + (var90 << 11);
                class157 var93 = class157.method2079(var87);
                if (var93.field2596 != var92) {
                    var93.field2596 = var92;
                    Statics.method1546(var93);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 147) {
                field591 = true;
                Statics.field392 = field520.method2544();
                Statics.field1761 = field520.method2544();
                Statics.field1036 = field520.method2489();
                Statics.field1423 = field520.method2544();
                Statics.field1364 = field520.method2544();
                if (Statics.field1364 >= 100) {
                    int var94 = Statics.field392 * 128 + 64;
                    int var95 = Statics.field1761 * 128 + 64;
                    int var96 = method143(var94, var95, Statics.field189) - Statics.field1036;
                    int var97 = var94 - Statics.field237;
                    int var98 = var96 - Statics.field2055;
                    int var99 = var95 - Statics.field771;
                    int var100 = (int) Math.sqrt((double) (var97 * var97 + var99 * var99));
                    Statics.field975 = (int) (Math.atan2((double) var98, (double) var100) * 325.949D) & 0x7FF;
                    Statics.field99 = (int) (Math.atan2((double) var97, (double) var99) * -325.949D) & 0x7FF;
                    if (Statics.field975 < 128) {
                        Statics.field975 = 128;
                    }
                    if (Statics.field975 > 383) {
                        Statics.field975 = 383;
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 76) {
                int var101 = field520.method2417();
                int var102 = field520.method2417();
                int var103 = field520.method2551();
                if (var103 == 65535) {
                    var103 = -1;
                }
                class157 var104 = class157.method2079(var101);
                if (var104.field2639) {
                    var104.field2683 = var103;
                    var104.field2590 = var102;
                    class39 var106 = class39.method1244(var103);
                    var104.field2620 = var106.field990;
                    var104.field2585 = var106.field991;
                    var104.field2621 = var106.field983;
                    var104.field2651 = var106.field993;
                    var104.field2618 = var106.field994;
                    var104.field2622 = var106.field1002;
                    if (var104.field2588 > 0) {
                        var104.field2622 = var104.field2622 * 32 / var104.field2588;
                    }
                    Statics.method1546(var104);
                } else if (var103 == -1) {
                    var104.field2663 = 0;
                    field522 = -1;
                    return true;
                } else {
                    class39 var105 = class39.method1244(var103);
                    var104.field2663 = 4;
                    var104.field2671 = var103;
                    var104.field2620 = var105.field990;
                    var104.field2585 = var105.field991;
                    var104.field2622 = var105.field1002 * 100 / var102;
                    Statics.method1546(var104);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 126) {
                String var107 = field520.method2383();
                int var108 = field520.method2489();
                byte var109 = field520.method2376();
                boolean var110 = false;
                if (var109 == -128) {
                    var110 = true;
                }
                if (var110) {
                    if (Statics.field276 == 0) {
                        field522 = -1;
                        return true;
                    }
                    boolean var111 = false;
                    int var112;
                    for (var112 = 0; var112 < Statics.field276 && (!Statics.field66[var112].field123.equals(var107) || Statics.field66[var112].field124 != var108); var112++) {
                    }
                    if (var112 < Statics.field276) {
                        while (var112 < Statics.field276 - 1) {
                            Statics.field66[var112] = Statics.field66[var112 + 1];
                            var112++;
                        }
                        Statics.field276--;
                        Statics.field66[Statics.field276] = null;
                    }
                } else {
                    field520.method2383();
                    class8 var113 = new class8();
                    var113.field123 = var107;
                    var113.field128 = class147.method2661(var113.field123, Statics.field1836);
                    var113.field124 = var108;
                    var113.field122 = var109;
                    int var114;
                    for (var114 = Statics.field276 - 1; var114 >= 0; var114--) {
                        int var115 = Statics.field66[var114].field128.compareTo(var113.field123);
                        if (var115 == 0) {
                            Statics.field66[var114].field124 = var108;
                            Statics.field66[var114].field122 = var109;
                            if (var107.equals(Statics.field2035.field57)) {
                                Statics.field369 = var109;
                            }
                            field596 = field729;
                            field522 = -1;
                            return true;
                        }
                        if (var115 < 0) {
                            break;
                        }
                    }
                    if (Statics.field276 >= Statics.field66.length) {
                        field522 = -1;
                        return true;
                    }
                    for (int var116 = Statics.field276 - 1; var116 > var114; var116--) {
                        Statics.field66[var116 + 1] = Statics.field66[var116];
                    }
                    if (Statics.field276 == 0) {
                        Statics.field66 = new class8[100];
                    }
                    Statics.field66[var114 + 1] = var113;
                    Statics.field276++;
                    if (var107.equals(Statics.field2035.field57)) {
                        Statics.field369 = var109;
                    }
                }
                field596 = field729;
                field522 = -1;
                return true;
            }
            if (field522 == 170) {
                String var117 = field520.method2383();
                long var118 = field520.method2502();
                long var120 = (long) field520.method2489();
                long var122 = (long) field520.method2530();
                int var124 = field520.method2544();
                long var125 = (var120 << 32) + var122;
                boolean var127 = false;
                for (int var128 = 0; var128 < 100; var128++) {
                    if (field698[var128] == var125) {
                        var127 = true;
                        break;
                    }
                }
                if (var124 <= 1 && method71(var117)) {
                    var127 = true;
                }
                if (!var127 && field598 == 0) {
                    field698[field699] = var125;
                    field699 = (field699 + 1) % 100;
                    class115 var129 = field520;
                    String var133;
                    try {
                        int var130 = var129.method2388();
                        if (var130 > 32767) {
                            var130 = 32767;
                        }
                        byte[] var131 = new byte[var130];
                        var129.field2043 += Statics.field2825.method2308(var129.field2047, var129.field2043, var131, 0, var130);
                        String var132 = class148.method2247(var131, 0, var130);
                        var133 = var132;
                    } catch (Exception var270) {
                        var133 = "Cabbage";
                    }
                    String var136 = class184.method3378(class146.method555(var133));
                    if (var124 == 2 || var124 == 3) {
                        Statics.method3(9, class2.method13(1) + var117, var136, class145.method2248(var118));
                    } else if (var124 == 1) {
                        Statics.method3(9, class2.method13(0) + var117, var136, class145.method2248(var118));
                    } else {
                        Statics.method3(9, var117, var136, class145.method2248(var118));
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 253) {
                int var137 = field520.method2410();
                int var138 = field520.method2418();
                class157 var139 = class157.method2079(var138);
                if (var139.field2615 != var137 || var137 == -1) {
                    var139.field2615 = var137;
                    var139.field2685 = 0;
                    var139.field2686 = 0;
                    Statics.method1546(var139);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 240) {
                int var140 = field520.method2489();
                int var141 = field520.method2544();
                int var142 = field520.method2489();
                if (field717 != 0 && var141 != 0 && field549 < 50) {
                    field720[field549] = var140;
                    field721[field549] = var141;
                    field525[field549] = var142;
                    field724[field549] = null;
                    field723[field549] = 0;
                    field549++;
                }
                field522 = -1;
                return true;
            }
            if (field522 == 104) {
                field492 = field520.method2486() * 30;
                field725 = field729;
                field522 = -1;
                return true;
            }
            if (field522 == 214) {
                int var146 = field520.method2408();
                int var147 = field520.method2419();
                class157 var148 = class157.method2079(var147);
                if (var148.field2663 != 2 || var148.field2671 != var146) {
                    var148.field2663 = 2;
                    var148.field2671 = var146;
                    Statics.method1546(var148);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 25) {
                String var149 = field520.method2383();
                int var150 = field520.method2416();
                int var151 = field520.method2544();
                if (var151 >= 1 && var151 <= 8) {
                    if (var149.equalsIgnoreCase("null")) {
                        var149 = null;
                    }
                    field691[var151 - 1] = var149;
                    field611[var151 - 1] = var150 == 0;
                }
                field522 = -1;
                return true;
            }
            if (field522 == 48) {
                int var152 = field520.method2417();
                String var153 = field520.method2383();
                class157 var154 = class157.method2079(var152);
                if (!var153.equals(var154.field2673)) {
                    var154.field2673 = var153;
                    Statics.method1546(var154);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 124) {
                field538 = field520.method2544();
                if (field538 == 1) {
                    field494 = field520.method2489();
                }
                if (field538 >= 2 && field538 <= 6) {
                    if (field538 == 2) {
                        field499 = 64;
                        field500 = 64;
                    }
                    if (field538 == 3) {
                        field499 = 0;
                        field500 = 64;
                    }
                    if (field538 == 4) {
                        field499 = 128;
                        field500 = 64;
                    }
                    if (field538 == 5) {
                        field499 = 64;
                        field500 = 0;
                    }
                    if (field538 == 6) {
                        field499 = 64;
                        field500 = 128;
                    }
                    field538 = 2;
                    field608 = field520.method2489();
                    field621 = field520.method2489();
                    field498 = field520.method2544();
                }
                if (field538 == 10) {
                    field495 = field520.method2489();
                }
                field522 = -1;
                return true;
            }
            if (field522 == 17) {
                int var155 = field521 + field520.field2043;
                int var156 = field520.method2489();
                int var157 = field520.method2489();
                if (field639 != var156) {
                    field639 = var156;
                    method1200(field639);
                    class25.method1332(field639);
                    for (int var158 = 0; var158 < 100; var158++) {
                        field617[var158] = true;
                    }
                }
                while (var157-- > 0) {
                    int var159 = field520.method2380();
                    int var160 = field520.method2489();
                    int var161 = field520.method2544();
                    class4 var162 = (class4) field640.method3261((long) var159);
                    if (var162 != null && var162.field69 != var160) {
                        method45(var162, true);
                        var162 = null;
                    }
                    if (var162 == null) {
                        var162 = method43(var159, var160, var161);
                    }
                    var162.field71 = true;
                }
                for (class4 var163 = (class4) field640.method3277(); var163 != null; var163 = (class4) field640.method3265()) {
                    if (var163.field71) {
                        var163.field71 = false;
                    } else {
                        method45(var163, true);
                    }
                }
                field610 = new class174(512);
                while (field520.field2043 < var155) {
                    int var164 = field520.method2380();
                    int var165 = field520.method2489();
                    int var166 = field520.method2489();
                    int var167 = field520.method2380();
                    for (int var168 = var165; var168 <= var166; var168++) {
                        long var169 = ((long) var164 << 32) + (long) var168;
                        field610.method3262(new class170(var167), var169);
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 60) {
                int var171 = field520.method2380();
                int var172 = field520.method2486();
                int var173 = field520.method2400();
                class4 var174 = (class4) field640.method3261((long) var171);
                if (var174 != null) {
                    method45(var174, var174.field69 != var172);
                }
                method43(var171, var172, var173);
                field522 = -1;
                return true;
            }
            if (field522 == 237) {
                while (field520.field2043 < field521) {
                    int var175 = field520.method2544();
                    boolean var176 = (var175 & 0x1) == 1;
                    String var177 = field520.method2383();
                    String var178 = field520.method2383();
                    field520.method2383();
                    for (int var179 = 0; var179 < field735; var179++) {
                        class11 var180 = field736[var179];
                        if (var176) {
                            if (var178.equals(var180.field195)) {
                                var180.field195 = var177;
                                var180.field190 = var178;
                                var177 = null;
                                break;
                            }
                        } else if (var177.equals(var180.field195)) {
                            var180.field195 = var177;
                            var180.field190 = var178;
                            var177 = null;
                            break;
                        }
                    }
                    if (var177 != null && field735 < 100) {
                        class11 var181 = new class11();
                        field736[field735] = var181;
                        var181.field195 = var177;
                        var181.field190 = var178;
                        field735++;
                    }
                }
                field588 = field729;
                field522 = -1;
                return true;
            }
            if (field522 == 38) {
                int var182 = field520.method2544();
                int var183 = field520.method2544();
                int var184 = field520.method2544();
                int var185 = field520.method2544();
                field726[var182] = true;
                field667[var182] = var183;
                field728[var182] = var184;
                field715[var182] = var185;
                field730[var182] = 0;
                field522 = -1;
                return true;
            }
            if (field522 == 166) {
                int var186 = field520.method2380();
                int var187 = field520.method2408();
                int var188 = field520.method2408();
                int var189 = field520.method2486();
                class157 var190 = class157.method2079(var186);
                if (var190.field2620 != var187 || var190.field2585 != var189 || var190.field2622 != var188) {
                    var190.field2620 = var187;
                    var190.field2585 = var189;
                    var190.field2622 = var188;
                    Statics.method1546(var190);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 251) {
                if (field639 != -1) {
                    int var191 = field639;
                    if (class157.method2314(var191)) {
                        method35(Statics.field2687[var191], 0);
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 86) {
                field703 = 0;
                field522 = -1;
                return true;
            }
            if (field522 == 51) {
                int var192 = field520.method2489();
                byte var193 = field520.method2401();
                class158.field2699[var192] = var193;
                if (class158.field2700[var192] != var193) {
                    class158.field2700[var192] = var193;
                    method1554(var192);
                }
                field663[++field509 - 1 & 0x1F] = var192;
                field522 = -1;
                return true;
            }
            if (field522 == 82) {
                String var194 = field520.method2383();
                String var195 = class184.method3378(class146.method555(class183.method3088(field520)));
                method1826(6, var194, var195);
                field522 = -1;
                return true;
            }
            if (field522 == 108) {
                field713 = field520.method2544();
                field522 = -1;
                return true;
            }
            if (field522 == 31) {
                String var196 = field520.method2383();
                long var197 = (long) field520.method2489();
                long var199 = (long) field520.method2530();
                int var201 = field520.method2544();
                long var202 = (var197 << 32) + var199;
                boolean var204 = false;
                for (int var205 = 0; var205 < 100; var205++) {
                    if (field698[var205] == var202) {
                        var204 = true;
                        break;
                    }
                }
                if (method71(var196)) {
                    var204 = true;
                }
                if (!var204 && field598 == 0) {
                    field698[field699] = var202;
                    field699 = (field699 + 1) % 100;
                    String var206 = class184.method3378(class146.method555(class183.method3088(field520)));
                    if (var201 == 2 || var201 == 3) {
                        method1826(7, class2.method13(1) + var196, var206);
                    } else if (var201 == 1) {
                        method1826(7, class2.method13(0) + var196, var206);
                    } else {
                        method1826(3, var196, var206);
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 190) {
                for (int var207 = 0; var207 < Statics.field1035; var207++) {
                    class41 var208 = class41.method125(var207);
                    if (var208 != null && var208.field1034 == 0) {
                        class158.field2699[var207] = 0;
                        class158.field2700[var207] = 0;
                    }
                }
                method206();
                field509 += 32;
                field522 = -1;
                return true;
            }
            if (field522 == 220) {
                Statics.field406 = class136.method173(field520.method2544());
                field522 = -1;
                return true;
            }
            if (field522 == 162) {
                Statics.field111 = field520.method2416();
                Statics.field1253 = field520.method2573();
                field522 = -1;
                return true;
            }
            if (field522 == 155) {
                int var209 = field520.method2408();
                int var210 = field520.method2417();
                class157 var211 = class157.method2079(var210);
                if (var211.field2663 != 1 || var211.field2671 != var209) {
                    var211.field2663 = 1;
                    var211.field2671 = var209;
                    Statics.method1546(var211);
                }
                field522 = -1;
                return true;
            }
            if (field522 == 67) {
                String var212 = field520.method2383();
                Object[] var213 = new Object[var212.length() + 1];
                for (int var214 = var212.length() - 1; var214 >= 0; var214--) {
                    if (var212.charAt(var214) == 's') {
                        var213[var214 + 1] = field520.method2383();
                    } else {
                        var213[var214 + 1] = Integer.valueOf(field520.method2380());
                    }
                }
                var213[0] = Integer.valueOf(field520.method2380());
                class1 var215 = new class1();
                var215.field8 = var213;
                class25.method754(var215);
                field522 = -1;
                return true;
            }
            if (field522 == 79) {
                field696 = field520.method2544();
                field697 = field520.method2544();
                field522 = -1;
                return true;
            }
            if (field522 == 114) {
                method1545(false);
                field522 = -1;
                return true;
            }
            if (field522 == 230) {
                int var216 = field520.method2417();
                class157 var217 = class157.method2079(var216);
                for (int var218 = 0; var218 < var217.field2652.length; var218++) {
                    var217.field2652[var218] = -1;
                    var217.field2652[var218] = 0;
                }
                Statics.method1546(var217);
                field522 = -1;
                return true;
            }
            if (field522 == 188) {
                Statics.field111 = field520.method2416();
                Statics.field1253 = field520.method2573();
                while (field520.field2043 < field521) {
                    field522 = field520.method2544();
                    method1831();
                }
                field522 = -1;
                return true;
            }
            if (field522 == 178) {
                field607 = 0;
                field602 = 0;
                field520.method2273();
                int var219 = field520.method2267(1);
                if (var219 != 0) {
                    int var220 = field520.method2267(2);
                    if (var220 == 0) {
                        field603[++field602 - 1] = 2047;
                    } else if (var220 == 1) {
                        int var221 = field520.method2267(3);
                        Statics.field2035.method240(var221, false);
                        int var222 = field520.method2267(1);
                        if (var222 == 1) {
                            field603[++field602 - 1] = 2047;
                        }
                    } else if (var220 == 2) {
                        int var223 = field520.method2267(3);
                        Statics.field2035.method240(var223, true);
                        int var224 = field520.method2267(3);
                        Statics.field2035.method240(var224, true);
                        int var225 = field520.method2267(1);
                        if (var225 == 1) {
                            field603[++field602 - 1] = 2047;
                        }
                    } else if (var220 == 3) {
                        int var226 = field520.method2267(7);
                        int var227 = field520.method2267(1);
                        if (var227 == 1) {
                            field603[++field602 - 1] = 2047;
                        }
                        int var228 = field520.method2267(1);
                        int var229 = field520.method2267(7);
                        Statics.field189 = field520.method2267(2);
                        Statics.field2035.method234(var229, var226, var228 == 1);
                    }
                }
                method1646();
                method728();
                method2278();
                for (int var230 = 0; var230 < field607; var230++) {
                    int var231 = field695[var230];
                    if (field568 != field599[var231].field471) {
                        field599[var231] = null;
                    }
                }
                if (field521 != field520.field2043) {
                    throw new RuntimeException(field520.field2043 + class2.field27 + field521);
                }
                for (int var232 = 0; var232 < field600; var232++) {
                    if (field599[field601[var232]] == null) {
                        throw new RuntimeException(var232 + class2.field27 + field600);
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 180) {
                while (field520.field2043 < field521) {
                    boolean var233 = field520.method2544() == 1;
                    String var234 = field520.method2383();
                    String var235 = field520.method2383();
                    int var236 = field520.method2489();
                    int var237 = field520.method2544();
                    int var238 = field520.method2544();
                    boolean var239 = (var238 & 0x2) != 0;
                    boolean var240 = (var238 & 0x1) != 0;
                    if (var236 > 0) {
                        field520.method2383();
                        field520.method2544();
                        field520.method2380();
                    }
                    field520.method2383();
                    for (int var241 = 0; var241 < field731; var241++) {
                        class22 var242 = field542[var241];
                        if (var233) {
                            if (var235.equals(var242.field357)) {
                                var242.field357 = var234;
                                var242.field356 = var235;
                                var234 = null;
                                break;
                            }
                        } else if (var234.equals(var242.field357)) {
                            if (var242.field365 != var236) {
                                boolean var243 = true;
                                for (class27 var244 = (class27) field734.method3248(); var244 != null; var244 = (class27) field734.method3257()) {
                                    if (var244.field742.equals(var234)) {
                                        if (var236 != 0 && var244.field743 == 0) {
                                            var244.method3317();
                                            var243 = false;
                                        } else if (var236 == 0 && var244.field743 != 0) {
                                            var244.method3317();
                                            var243 = false;
                                        }
                                    }
                                }
                                if (var243) {
                                    field734.method3247(new class27(var234, var236));
                                }
                                var242.field365 = var236;
                            }
                            var242.field356 = var235;
                            var242.field358 = var237;
                            var242.field359 = var239;
                            var242.field360 = var240;
                            var234 = null;
                            break;
                        }
                    }
                    if (var234 != null && field731 < 200) {
                        class22 var245 = new class22();
                        field542[field731] = var245;
                        var245.field357 = var234;
                        var245.field356 = var235;
                        var245.field365 = var236;
                        var245.field358 = var237;
                        var245.field359 = var239;
                        var245.field360 = var240;
                        field731++;
                    }
                }
                field732 = 2;
                field588 = field729;
                boolean var246 = false;
                int var247 = field731;
                while (var247 > 0) {
                    boolean var248 = true;
                    var247--;
                    for (int var249 = 0; var249 < var247; var249++) {
                        boolean var250 = false;
                        class22 var251 = field542[var249];
                        class22 var252 = field542[var249 + 1];
                        if (field475 != var251.field365 && field475 == var252.field365) {
                            var250 = true;
                        }
                        if (!var250 && var251.field365 == 0 && var252.field365 != 0) {
                            var250 = true;
                        }
                        if (!var250 && !var251.field359 && var252.field359) {
                            var250 = true;
                        }
                        if (!var250 && !var251.field360 && var252.field360) {
                            var250 = true;
                        }
                        if (var250) {
                            class22 var253 = field542[var249];
                            field542[var249] = field542[var249 + 1];
                            field542[var249 + 1] = var253;
                            var248 = false;
                        }
                    }
                    if (var248) {
                        break;
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 183) {
                int var254 = field520.method2380();
                int var255 = field520.method2489();
                if (var254 < -70000) {
                    var255 += 32768;
                }
                class157 var256;
                if (var254 >= 0) {
                    var256 = class157.method2079(var254);
                } else {
                    var256 = null;
                }
                while (field520.field2043 < field521) {
                    int var257 = field520.method2388();
                    int var258 = field520.method2489();
                    int var259 = 0;
                    if (var258 != 0) {
                        var259 = field520.method2544();
                        if (var259 == 255) {
                            var259 = field520.method2380();
                        }
                    }
                    if (var256 != null && var257 >= 0 && var257 < var256.field2652.length) {
                        var256.field2652[var257] = var258;
                        var256.field2682[var257] = var259;
                    }
                    class18.method38(var255, var257, var258 - 1, var259);
                }
                if (var256 != null) {
                    Statics.method1546(var256);
                }
                method206();
                field665[++field666 - 1 & 0x1F] = var255 & 0x7FFF;
                field522 = -1;
                return true;
            }
            if (field522 == 247) {
                for (int var260 = 0; var260 < field599.length; var260++) {
                    if (field599[var260] != null) {
                        field599[var260].field439 = -1;
                    }
                }
                for (int var261 = 0; var261 < field515.length; var261++) {
                    if (field515[var261] != null) {
                        field515[var261].field439 = -1;
                    }
                }
                field522 = -1;
                return true;
            }
            if (field522 == 129) {
                method206();
                int var262 = field520.method2418();
                int var263 = field520.method2573();
                int var264 = field520.method2400();
                field619[var263] = var262;
                field709[var263] = var264;
                field618[var263] = 1;
                for (int var265 = 0; var265 < 98; var265++) {
                    if (var262 >= class129.field2052[var265]) {
                        field618[var263] = var265 + 2;
                    }
                }
                field496[++field668 - 1 & 0x1F] = var263;
                field522 = -1;
                return true;
            }
            class79.method720("" + field522 + class2.field27 + field652 + class2.field27 + field528 + class2.field27 + field521, (Throwable) null);
            method209();
        } catch (IOException var271) {
            method1();
        } catch (Exception var272) {
            String var268 = "" + field522 + class2.field27 + field652 + class2.field27 + field528 + class2.field27 + field521 + class2.field27 + (Statics.field1631 + Statics.field2035.field462[0]) + class2.field27 + (Statics.field456 + Statics.field2035.field447[0]) + class2.field27;
            for (int var269 = 0; var269 < field521 && var269 < 50; var269++) {
                var268 = var268 + field520.field2047[var269] + class2.field27;
            }
            class79.method720(var268, var272);
            method209();
        }
        return true;
    }

    @ObfuscatedName("ca.bs(I)V")
    public static final void method1831() {
        if (field522 == 30) {
            int var0 = field520.method2544();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1253;
            int var2 = (var0 & 0x7) + Statics.field111;
            int var3 = var1 + field520.method2376();
            int var4 = var2 + field520.method2376();
            int var5 = field520.method2378();
            int var6 = field520.method2489();
            int var7 = field520.method2544() * 4;
            int var8 = field520.method2544() * 4;
            int var9 = field520.method2489();
            int var10 = field520.method2489();
            int var11 = field520.method2544();
            int var12 = field520.method2544();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class10 var17 = new class10(var6, Statics.field189, var13, var14, method143(var13, var14, Statics.field189) - var7, field568 + var9, field568 + var10, var11, var12, var5, var8);
                var17.method112(var15, var16, method143(var15, var16, Statics.field189) - var8, field568 + var9);
                field615.method3305(var17);
            }
        } else if (field522 == 198) {
            int var18 = field520.method2486();
            int var19 = field520.method2544();
            int var20 = (var19 >> 4 & 0x7) + Statics.field1253;
            int var21 = (var19 & 0x7) + Statics.field111;
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class176 var22 = field733[Statics.field189][var20][var21];
                if (var22 != null) {
                    for (class16 var23 = (class16) var22.method3285(); var23 != null; var23 = (class16) var22.method3299()) {
                        if ((var18 & 0x7FFF) == var23.field251) {
                            var23.method3327();
                            break;
                        }
                    }
                    if (var22.method3285() == null) {
                        field733[Statics.field189][var20][var21] = null;
                    }
                    method652(var20, var21);
                }
            }
        } else if (field522 == 88) {
            int var24 = field520.method2573();
            int var25 = var24 >> 2;
            int var26 = var24 & 0x3;
            int var27 = field540[var25];
            int var28 = field520.method2573();
            int var29 = (var28 >> 4 & 0x7) + Statics.field1253;
            int var30 = (var28 & 0x7) + Statics.field111;
            if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                method62(Statics.field189, var29, var30, var27, -1, var25, var26, 0, -1);
            }
        } else if (field522 == 206) {
            int var31 = field520.method2544();
            int var32 = (var31 >> 4 & 0x7) + Statics.field1253;
            int var33 = (var31 & 0x7) + Statics.field111;
            int var34 = field520.method2486();
            int var35 = field520.method2489();
            int var36 = field520.method2551();
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && field605 != var36) {
                class16 var37 = new class16();
                var37.field251 = var34;
                var37.field250 = var35;
                if (field733[Statics.field189][var32][var33] == null) {
                    field733[Statics.field189][var32][var33] = new class176();
                }
                field733[Statics.field189][var32][var33].method3305(var37);
                method652(var32, var33);
            }
        } else {
            if (field522 == 182) {
                int var38 = field520.method2573();
                int var39 = (var38 >> 4 & 0x7) + Statics.field1253;
                int var40 = (var38 & 0x7) + Statics.field111;
                int var41 = field520.method2400();
                int var42 = var41 >> 2;
                int var43 = var41 & 0x3;
                int var44 = field540[var42];
                byte var45 = field520.method2376();
                int var46 = field520.method2486();
                int var47 = field520.method2486();
                int var48 = field520.method2551();
                byte var49 = field520.method2402();
                byte var50 = field520.method2401();
                int var51 = field520.method2408();
                byte var52 = field520.method2402();
                class3 var53;
                if (field605 == var47) {
                    var53 = Statics.field2035;
                } else {
                    var53 = field599[var47];
                }
                if (var53 != null) {
                    class31 var54 = class31.method187(var46);
                    int var55;
                    int var56;
                    if (var43 == 1 || var43 == 3) {
                        var55 = var54.field831;
                        var56 = var54.field830;
                    } else {
                        var55 = var54.field830;
                        var56 = var54.field831;
                    }
                    int var57 = (var55 >> 1) + var39;
                    int var58 = (var55 + 1 >> 1) + var39;
                    int var59 = (var56 >> 1) + var40;
                    int var60 = (var56 + 1 >> 1) + var40;
                    int[][] var61 = class9.field156[Statics.field189];
                    int var62 = var61[var57][var59] + var61[var58][var59] + var61[var57][var60] + var61[var58][var60] >> 2;
                    int var63 = (var39 << 7) + (var55 << 6);
                    int var64 = (var40 << 7) + (var56 << 6);
                    class111 var65 = var54.method604(var42, var43, var61, var63, var62, var64);
                    if (var65 != null) {
                        method62(Statics.field189, var39, var40, var44, -1, 0, 0, var51 + 1, var48 + 1);
                        var53.field49 = field568 + var51;
                        var53.field64 = field568 + var48;
                        var53.field54 = var65;
                        var53.field51 = var39 * 128 + var55 * 64;
                        var53.field53 = var40 * 128 + var56 * 64;
                        var53.field56 = var62;
                        if (var45 > var49) {
                            byte var66 = var45;
                            var45 = var49;
                            var49 = var66;
                        }
                        if (var52 > var50) {
                            byte var67 = var52;
                            var52 = var50;
                            var50 = var67;
                        }
                        var53.field55 = var39 + var45;
                        var53.field63 = var39 + var49;
                        var53.field61 = var40 + var52;
                        var53.field58 = var40 + var50;
                    }
                }
            }
            if (field522 == 191) {
                int var68 = field520.method2551();
                int var69 = field520.method2544();
                int var70 = var69 >> 2;
                int var71 = var69 & 0x3;
                int var72 = field540[var70];
                int var73 = field520.method2573();
                int var74 = (var73 >> 4 & 0x7) + Statics.field1253;
                int var75 = (var73 & 0x7) + Statics.field111;
                if (var74 >= 0 && var75 >= 0 && var74 < 103 && var75 < 103) {
                    if (var72 == 0) {
                        class95 var76 = Statics.field335.method1855(Statics.field189, var74, var75);
                        if (var76 != null) {
                            int var77 = var76.field1622 >> 14 & 0x7FFF;
                            if (var70 == 2) {
                                var76.field1627 = new class13(var77, 2, var71 + 4, Statics.field189, var74, var75, var68, false, var76.field1627);
                                var76.field1633 = new class13(var77, 2, var71 + 1 & 0x3, Statics.field189, var74, var75, var68, false, var76.field1633);
                            } else {
                                var76.field1627 = new class13(var77, var70, var71, Statics.field189, var74, var75, var68, false, var76.field1627);
                            }
                        }
                    }
                    if (var72 == 1) {
                        class107 var78 = Statics.field335.method1856(Statics.field189, var74, var75);
                        if (var78 != null) {
                            int var79 = var78.field1817 >> 14 & 0x7FFF;
                            if (var70 == 4 || var70 == 5) {
                                var78.field1815 = new class13(var79, 4, var71, Statics.field189, var74, var75, var68, false, var78.field1815);
                            } else if (var70 == 6) {
                                var78.field1815 = new class13(var79, 4, var71 + 4, Statics.field189, var74, var75, var68, false, var78.field1815);
                            } else if (var70 == 7) {
                                var78.field1815 = new class13(var79, 4, (var71 + 2 & 0x3) + 4, Statics.field189, var74, var75, var68, false, var78.field1815);
                            } else if (var70 == 8) {
                                var78.field1815 = new class13(var79, 4, var71 + 4, Statics.field189, var74, var75, var68, false, var78.field1815);
                                var78.field1816 = new class13(var79, 4, (var71 + 2 & 0x3) + 4, Statics.field189, var74, var75, var68, false, var78.field1816);
                            }
                        }
                    }
                    if (var72 == 2) {
                        class97 var80 = Statics.field335.method1895(Statics.field189, var74, var75);
                        if (var70 == 11) {
                            var70 = 10;
                        }
                        if (var80 != null) {
                            var80.field1649 = new class13(var80.field1651 >> 14 & 0x7FFF, var70, var71, Statics.field189, var74, var75, var68, false, var80.field1649);
                        }
                    }
                    if (var72 == 3) {
                        class106 var81 = Statics.field335.method1858(Statics.field189, var74, var75);
                        if (var81 != null) {
                            var81.field1800 = new class13(var81.field1801 >> 14 & 0x7FFF, 22, var71, Statics.field189, var74, var75, var68, false, var81.field1800);
                        }
                    }
                }
            } else if (field522 == 195) {
                int var82 = field520.method2486();
                int var83 = field520.method2400();
                int var84 = (var83 >> 4 & 0x7) + Statics.field1253;
                int var85 = (var83 & 0x7) + Statics.field111;
                int var86 = field520.method2573();
                int var87 = var86 >> 2;
                int var88 = var86 & 0x3;
                int var89 = field540[var87];
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    method62(Statics.field189, var84, var85, var89, var82, var87, var88, 0, -1);
                }
            } else {
                if (field522 == 175) {
                    int var90 = field520.method2544();
                    int var91 = (var90 >> 4 & 0x7) + Statics.field1253;
                    int var92 = (var90 & 0x7) + Statics.field111;
                    int var93 = field520.method2489();
                    int var94 = field520.method2544();
                    int var95 = var94 >> 4 & 0xF;
                    int var96 = var94 & 0x7;
                    int var97 = field520.method2544();
                    if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                        int var98 = var95 + 1;
                        if (Statics.field2035.field462[0] >= var91 - var98 && Statics.field2035.field462[0] <= var91 + var98 && Statics.field2035.field447[0] >= var92 - var98 && Statics.field2035.field447[0] <= var92 + var98 && field718 != 0 && var96 > 0 && field549 < 50) {
                            field720[field549] = var93;
                            field721[field549] = var96;
                            field525[field549] = var97;
                            field724[field549] = null;
                            field723[field549] = (var91 << 16) + (var92 << 8) + var95;
                            field549++;
                        }
                    }
                }
                if (field522 == 174) {
                    int var99 = field520.method2544();
                    int var100 = (var99 >> 4 & 0x7) + Statics.field1253;
                    int var101 = (var99 & 0x7) + Statics.field111;
                    int var102 = field520.method2489();
                    int var103 = field520.method2489();
                    int var104 = field520.method2489();
                    if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                        class176 var105 = field733[Statics.field189][var100][var101];
                        if (var105 != null) {
                            for (class16 var106 = (class16) var105.method3285(); var106 != null; var106 = (class16) var105.method3299()) {
                                if ((var102 & 0x7FFF) == var106.field251 && var106.field250 == var103) {
                                    var106.field250 = var104;
                                    break;
                                }
                            }
                            method652(var100, var101);
                        }
                    }
                } else if (field522 == 181) {
                    int var107 = field520.method2544();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field1253;
                    int var109 = (var107 & 0x7) + Statics.field111;
                    int var110 = field520.method2489();
                    int var111 = field520.method2544();
                    int var112 = field520.method2489();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        int var113 = var108 * 128 + 64;
                        int var114 = var109 * 128 + 64;
                        class19 var115 = new class19(var110, Statics.field189, var113, var114, method143(var113, var114, Statics.field189) - var111, var112, field568);
                        field636.method3305(var115);
                    }
                } else if (field522 == 208) {
                    int var116 = field520.method2416();
                    int var117 = (var116 >> 4 & 0x7) + Statics.field1253;
                    int var118 = (var116 & 0x7) + Statics.field111;
                    int var119 = field520.method2551();
                    int var120 = field520.method2408();
                    if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                        class16 var121 = new class16();
                        var121.field251 = var119;
                        var121.field250 = var120;
                        if (field733[Statics.field189][var117][var118] == null) {
                            field733[Statics.field189][var117][var118] = new class176();
                        }
                        field733[Statics.field189][var117][var118].method3305(var121);
                        method652(var117, var118);
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.bf(IIIIIIIIII)V")
    public static final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class21 var9 = null;
        for (class21 var10 = (class21) field681.method3285(); var10 != null; var10 = (class21) field681.method3299()) {
            if (var10.field353 == arg0 && var10.field336 == arg1 && var10.field338 == arg2 && var10.field339 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class21();
            var9.field353 = arg0;
            var9.field339 = arg3;
            var9.field336 = arg1;
            var9.field338 = arg2;
            method1829(var9);
            field681.method3305(var9);
        }
        var9.field342 = arg4;
        var9.field337 = arg5;
        var9.field343 = arg6;
        var9.field348 = arg7;
        var9.field346 = arg8;
    }

    @ObfuscatedName("ca.bz(La;I)V")
    public static final void method1829(class21 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field339 == 0) {
            var1 = Statics.field335.method1843(arg0.field353, arg0.field336, arg0.field338);
        }
        if (arg0.field339 == 1) {
            var1 = Statics.field335.method1860(arg0.field353, arg0.field336, arg0.field338);
        }
        if (arg0.field339 == 2) {
            var1 = Statics.field335.method1861(arg0.field353, arg0.field336, arg0.field338);
        }
        if (arg0.field339 == 3) {
            var1 = Statics.field335.method1862(arg0.field353, arg0.field336, arg0.field338);
        }
        if (var1 != 0) {
            int var5 = Statics.field335.method1863(arg0.field353, arg0.field336, arg0.field338, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field344 = var2;
        arg0.field341 = var3;
        arg0.field340 = var4;
    }

    @ObfuscatedName("m.br(B)V")
    public static final void method147() {
        for (class21 var0 = (class21) field681.method3285(); var0 != null; var0 = (class21) field681.method3299()) {
            if (var0.field346 > 0) {
                var0.field346--;
            }
            if (var0.field346 == 0) {
                if (var0.field344 >= 0) {
                    int var1 = var0.field344;
                    int var2 = var0.field341;
                    class31 var3 = class31.method187(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method601(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method136(var0.field353, var0.field339, var0.field336, var0.field338, var0.field344, var0.field340, var0.field341);
                var0.method3327();
            } else {
                if (var0.field348 > 0) {
                    var0.field348--;
                }
                if (var0.field348 == 0 && var0.field336 >= 1 && var0.field338 >= 1 && var0.field336 <= 102 && var0.field338 <= 102) {
                    if (var0.field342 >= 0) {
                        int var5 = var0.field342;
                        int var6 = var0.field337;
                        class31 var7 = class31.method187(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method601(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method136(var0.field353, var0.field339, var0.field336, var0.field338, var0.field342, var0.field343, var0.field337);
                    var0.field348 = -1;
                    if (var0.field344 == var0.field342 && var0.field344 == -1) {
                        var0.method3327();
                    } else if (var0.field344 == var0.field342 && var0.field343 == var0.field340 && var0.field341 == var0.field337) {
                        var0.method3327();
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.ba(IIIIIIII)V")
    public static final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field634 && Statics.field189 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field335.method1843(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field335.method1860(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field335.method1861(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field335.method1862(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field335.method1863(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field335.method1850(arg0, arg2, arg3);
                class31 var15 = class31.method187(var12);
                if (var15.field849 != 0) {
                    field536[arg0].method3163(arg2, arg3, var13, var14, var15.field832);
                }
            }
            if (arg1 == 1) {
                Statics.field335.method1851(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field335.method1852(arg0, arg2, arg3);
                class31 var16 = class31.method187(var12);
                if (var16.field830 + arg2 > 103 || var16.field830 + arg3 > 103 || var16.field831 + arg2 > 103 || var16.field831 + arg3 > 103) {
                    return;
                }
                if (var16.field849 != 0) {
                    field536[arg0].method3164(arg2, arg3, var16.field830, var16.field831, var14, var16.field832);
                }
            }
            if (arg1 == 3) {
                Statics.field335.method1838(arg0, arg2, arg3);
                class31 var17 = class31.method187(var12);
                if (var17.field849 == 1) {
                    field536[arg0].method3187(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field136[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class9.method46(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field335, field536[arg0]);
    }

    @ObfuscatedName("az.bn(III)V")
    public static final void method652(int arg0, int arg1) {
        class176 var2 = field733[Statics.field189][arg0][arg1];
        if (var2 == null) {
            Statics.field335.method1854(Statics.field189, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class16 var4 = null;
        for (class16 var5 = (class16) var2.method3285(); var5 != null; var5 = (class16) var2.method3299()) {
            class39 var6 = class39.method1244(var5.field251);
            int var7 = var6.field999;
            if (var6.field995 == 1) {
                var7 = (var5.field250 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field335.method1854(Statics.field189, arg0, arg1);
            return;
        }
        var2.method3281(var4);
        class16 var8 = null;
        class16 var9 = null;
        for (class16 var10 = (class16) var2.method3285(); var10 != null; var10 = (class16) var2.method3299()) {
            if (var4.field251 != var10.field251) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field251 != var10.field251 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field335.method1909(Statics.field189, arg0, arg1, method143(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field189), var4, var11, var8, var9);
    }

    @ObfuscatedName("cd.bo(I)V")
    public static final void method1646() {
        int var0 = field520.method2267(8);
        if (var0 < field600) {
            for (int var1 = var0; var1 < field600; var1++) {
                field695[++field607 - 1] = field601[var1];
            }
        }
        if (var0 > field600) {
            throw new RuntimeException("");
        }
        field600 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field601[var2];
            class3 var4 = field599[var3];
            int var5 = field520.method2267(1);
            if (var5 == 0) {
                field601[++field600 - 1] = var3;
                var4.field471 = field568;
            } else {
                int var6 = field520.method2267(2);
                if (var6 == 0) {
                    field601[++field600 - 1] = var3;
                    var4.field471 = field568;
                    field603[++field602 - 1] = var3;
                } else if (var6 == 1) {
                    field601[++field600 - 1] = var3;
                    var4.field471 = field568;
                    int var7 = field520.method2267(3);
                    var4.method240(var7, false);
                    int var8 = field520.method2267(1);
                    if (var8 == 1) {
                        field603[++field602 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field601[++field600 - 1] = var3;
                    var4.field471 = field568;
                    int var9 = field520.method2267(3);
                    var4.method240(var9, true);
                    int var10 = field520.method2267(3);
                    var4.method240(var10, true);
                    int var11 = field520.method2267(1);
                    if (var11 == 1) {
                        field603[++field602 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field695[++field607 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ad.bq(I)V")
    public static final void method728() {
        while (true) {
            if (field520.method2253(field521) >= 11) {
                int var0 = field520.method2267(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field599[var0] == null) {
                        field599[var0] = new class3();
                        if (field504[var0] != null) {
                            field599[var0].method20(field504[var0]);
                        }
                        var1 = true;
                    }
                    field601[++field600 - 1] = var0;
                    class3 var2 = field599[var0];
                    var2.field471 = field568;
                    int var3 = field586[field520.method2267(3)];
                    if (var1) {
                        var2.field458 = var2.field412 = var3;
                    }
                    int var4 = field520.method2267(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field520.method2267(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field520.method2267(1);
                    if (var6 == 1) {
                        field603[++field602 - 1] = var0;
                    }
                    int var7 = field520.method2267(1);
                    var2.method234(Statics.field2035.field462[0] + var4, Statics.field2035.field447[0] + var5, var7 == 1);
                    continue;
                }
            }
            field520.method2256();
            return;
        }
    }

    @ObfuscatedName("dk.bd(I)V")
    public static final void method2278() {
        for (int var0 = 0; var0 < field602; var0++) {
            int var1 = field603[var0];
            class3 var2 = field599[var1];
            int var3 = field520.method2544();
            if ((var3 & 0x10) != 0) {
                var3 += field520.method2544() << 8;
            }
            method705(var1, var2, var3);
        }
    }

    @ObfuscatedName("ao.bl(ILw;II)V")
    public static final void method705(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x400) != 0) {
            int var3 = field520.method2400();
            int var4 = field520.method2400();
            arg1.method238(var3, var4, field568);
            arg1.field448 = field568 + 300;
            arg1.field431 = field520.method2573();
            arg1.field424 = field520.method2416();
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field423 = field520.method2383();
            if (arg1.field423.charAt(0) == '~') {
                arg1.field423 = arg1.field423.substring(1);
                method1826(2, arg1.field57, arg1.field423);
            } else if (Statics.field2035 == arg1) {
                method1826(2, arg1.field57, arg1.field423);
            }
            arg1.field425 = 0;
            arg1.field416 = 0;
            arg1.field463 = 150;
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field433 = field520.method2408();
            if (arg1.field433 == 65535) {
                arg1.field433 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var5 = field520.method2544();
            byte[] var6 = new byte[var5];
            class126 var7 = new class126(var6);
            field520.method2412(var6, 0, var5);
            field504[arg0] = var7;
            arg1.method20(var7);
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field449 = field520.method2573();
            arg1.field451 = field520.method2573();
            arg1.field450 = field520.method2544();
            arg1.field452 = field520.method2416();
            arg1.field453 = field520.method2489() + field568;
            arg1.field454 = field520.method2408() + field568;
            arg1.field421 = field520.method2544();
            arg1.field441 = 1;
            arg1.field432 = 0;
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field444 = field520.method2551();
            int var8 = field520.method2417();
            arg1.field455 = var8 >> 16;
            arg1.field465 = (var8 & 0xFFFF) + field568;
            arg1.field445 = 0;
            arg1.field426 = 0;
            if (arg1.field465 > field568) {
                arg1.field445 = -1;
            }
            if (arg1.field444 == 65535) {
                arg1.field444 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var9 = field520.method2400();
            int var10 = field520.method2544();
            arg1.method238(var9, var10, field568);
            arg1.field448 = field568 + 300;
            arg1.field431 = field520.method2544();
            arg1.field424 = field520.method2573();
        }
        if ((arg2 & 0x2) != 0) {
            int var11 = field520.method2551();
            int var12 = field520.method2416();
            int var13 = field520.method2573();
            int var14 = field520.field2043;
            if (arg1.field57 != null && arg1.field52 != null) {
                boolean var15 = false;
                if (var12 <= 1 && method71(arg1.field57)) {
                    var15 = true;
                }
                if (!var15 && field598 == 0) {
                    field501.field2043 = 0;
                    field520.method2568(field501.field2047, 0, var13);
                    field501.field2043 = 0;
                    class126 var16 = field501;
                    String var20;
                    try {
                        int var17 = var16.method2388();
                        if (var17 > 32767) {
                            var17 = 32767;
                        }
                        byte[] var18 = new byte[var17];
                        var16.field2043 += Statics.field2825.method2308(var16.field2047, var16.field2043, var18, 0, var17);
                        String var19 = class148.method2247(var18, 0, var17);
                        var20 = var19;
                    } catch (Exception var26) {
                        var20 = "Cabbage";
                    }
                    String var23 = class184.method3378(class146.method555(var20));
                    arg1.field423 = var23.trim();
                    arg1.field425 = var11 >> 8;
                    arg1.field416 = var11 & 0xFF;
                    arg1.field463 = 150;
                    if (var12 == 2 || var12 == 3) {
                        method1826(1, class2.method13(1) + arg1.field57, var23);
                    } else if (var12 == 1) {
                        method1826(1, class2.method13(0) + arg1.field57, var23);
                    } else {
                        method1826(2, arg1.field57, var23);
                    }
                }
            }
            field520.field2043 = var13 + var14;
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field434 = field520.method2551();
            arg1.field435 = field520.method2489();
        }
        if ((arg2 & 0x8) == 0) {
            return;
        }
        int var24 = field520.method2486();
        if (var24 == 65535) {
            var24 = -1;
        }
        int var25 = field520.method2416();
        method2781(arg1, var24, var25);
    }

    @ObfuscatedName("z.bu(S)V")
    public static final void method128() {
        field607 = 0;
        field602 = 0;
        field520.method2273();
        int var0 = field520.method2267(8);
        if (var0 < field516) {
            for (int var1 = var0; var1 < field516; var1++) {
                field695[++field607 - 1] = field628[var1];
            }
        }
        if (var0 > field516) {
            throw new RuntimeException("");
        }
        field516 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field628[var2];
            class24 var4 = field515[var3];
            int var5 = field520.method2267(1);
            if (var5 == 0) {
                field628[++field516 - 1] = var3;
                var4.field471 = field568;
            } else {
                int var6 = field520.method2267(2);
                if (var6 == 0) {
                    field628[++field516 - 1] = var3;
                    var4.field471 = field568;
                    field603[++field602 - 1] = var3;
                } else if (var6 == 1) {
                    field628[++field516 - 1] = var3;
                    var4.field471 = field568;
                    int var7 = field520.method2267(3);
                    var4.method240(var7, false);
                    int var8 = field520.method2267(1);
                    if (var8 == 1) {
                        field603[++field602 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field628[++field516 - 1] = var3;
                    var4.field471 = field568;
                    int var9 = field520.method2267(3);
                    var4.method240(var9, true);
                    int var10 = field520.method2267(3);
                    var4.method240(var10, true);
                    int var11 = field520.method2267(1);
                    if (var11 == 1) {
                        field603[++field602 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field695[++field607 - 1] = var3;
                }
            }
        }
        while (field520.method2253(field521) >= 27) {
            int var12 = field520.method2267(15);
            if (var12 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field515[var12] == null) {
                field515[var12] = new class24();
                var16 = true;
            }
            class24 var17 = field515[var12];
            field628[++field516 - 1] = var12;
            var17.field471 = field568;
            int var18 = field520.method2267(5);
            if (var18 > 15) {
                var18 -= 32;
            }
            int var19 = field520.method2267(1);
            int var20 = field520.method2267(5);
            if (var20 > 15) {
                var20 -= 32;
            }
            int var21 = field520.method2267(1);
            if (var21 == 1) {
                field603[++field602 - 1] = var12;
            }
            var17.field388 = class30.method175(field520.method2267(14));
            int var22 = field586[field520.method2267(3)];
            if (var16) {
                var17.field458 = var17.field412 = var22;
            }
            var17.field414 = var17.field388.field781;
            var17.field429 = var17.field388.field804;
            if (var17.field429 == 0) {
                var17.field412 = 0;
            }
            var17.field467 = var17.field388.field786;
            var17.field419 = var17.field388.field793;
            var17.field420 = var17.field388.field789;
            var17.field446 = var17.field388.field790;
            var17.field410 = var17.field388.field784;
            var17.field442 = var17.field388.field785;
            var17.field417 = var17.field388.field808;
            var17.method234(Statics.field2035.field462[0] + var20, Statics.field2035.field447[0] + var18, var19 == 1);
        }
        field520.method2256();
        method1329();
        for (int var13 = 0; var13 < field607; var13++) {
            int var14 = field695[var13];
            if (field568 != field515[var14].field471) {
                field515[var14].field388 = null;
                field515[var14] = null;
            }
        }
        if (field521 != field520.field2043) {
            throw new RuntimeException(field520.field2043 + class2.field27 + field521);
        }
        for (int var15 = 0; var15 < field516; var15++) {
            if (field515[field628[var15]] == null) {
                throw new RuntimeException(var15 + class2.field27 + field516);
            }
        }
    }

    @ObfuscatedName("bm.bg(I)V")
    public static final void method1329() {
        for (int var0 = 0; var0 < field602; var0++) {
            int var1 = field603[var0];
            class24 var2 = field515[var1];
            int var3 = field520.method2544();
            if ((var3 & 0x2) != 0) {
                var2.field433 = field520.method2408();
                if (var2.field433 == 65535) {
                    var2.field433 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field434 = field520.method2551();
                var2.field435 = field520.method2551();
            }
            if ((var3 & 0x4) != 0) {
                var2.field423 = field520.method2383();
                var2.field463 = 100;
            }
            if ((var3 & 0x80) != 0) {
                var2.field388 = class30.method175(field520.method2489());
                var2.field414 = var2.field388.field781;
                var2.field429 = var2.field388.field804;
                var2.field467 = var2.field388.field786;
                var2.field419 = var2.field388.field793;
                var2.field420 = var2.field388.field789;
                var2.field446 = var2.field388.field790;
                var2.field410 = var2.field388.field784;
                var2.field442 = var2.field388.field785;
                var2.field417 = var2.field388.field808;
            }
            if ((var3 & 0x1) != 0) {
                int var4 = field520.method2408();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field520.method2400();
                if (var2.field439 == var4 && var4 != -1) {
                    int var6 = class33.method751(var4).field894;
                    if (var6 == 1) {
                        var2.field440 = 0;
                        var2.field460 = 0;
                        var2.field418 = var5;
                        var2.field443 = 0;
                    }
                    if (var6 == 2) {
                        var2.field443 = 0;
                    }
                } else if (var4 == -1 || var2.field439 == -1 || class33.method751(var4).field881 >= class33.method751(var2.field439).field881) {
                    var2.field439 = var4;
                    var2.field440 = 0;
                    var2.field460 = 0;
                    var2.field418 = var5;
                    var2.field443 = 0;
                    var2.field432 = var2.field441;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field444 = field520.method2408();
                int var7 = field520.method2419();
                var2.field455 = var7 >> 16;
                var2.field465 = (var7 & 0xFFFF) + field568;
                var2.field445 = 0;
                var2.field426 = 0;
                if (var2.field465 > field568) {
                    var2.field445 = -1;
                }
                if (var2.field444 == 65535) {
                    var2.field444 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                int var8 = field520.method2573();
                int var9 = field520.method2416();
                var2.method238(var8, var9, field568);
                var2.field448 = field568 + 300;
                var2.field431 = field520.method2573();
                var2.field424 = field520.method2573();
            }
            if ((var3 & 0x20) != 0) {
                int var10 = field520.method2544();
                int var11 = field520.method2400();
                var2.method238(var10, var11, field568);
                var2.field448 = field568 + 300;
                var2.field431 = field520.method2544();
                var2.field424 = field520.method2573();
            }
        }
    }

    @ObfuscatedName("j.bb(III)V")
    public static final void method15(int arg0, int arg1) {
        if (field547 < 2 && field687 == 0 && !field562) {
            return;
        }
        String var2;
        if (field687 == 1 && field547 < 2) {
            var2 = class133.field2231 + class133.field2279 + field672 + " " + class2.field28;
        } else if (field562 && field547 < 2) {
            var2 = field534 + class133.field2279 + field638 + " " + class2.field28;
        } else {
            int var3 = field547 - 1;
            String var4;
            if (field539[var3].length() > 0) {
                var4 = field627[var3] + class133.field2279 + field539[var3];
            } else {
                var4 = field627[var3];
            }
            var2 = var4;
        }
        if (field547 > 2) {
            var2 = var2 + class2.method217(16777215) + " " + '/' + " " + (field547 - 2) + class133.field2172;
        }
        Statics.field24.method3369(var2, arg0 + 4, arg1 + 15, 16777215, 0, field568 / 1000);
    }

    @ObfuscatedName("di.bj(IIIIB)V")
    public static final void method2177(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field680; var4++) {
            if (field670[var4] + field660[var4] > arg0 && field660[var4] < arg0 + arg2 && field686[var4] + field553[var4] > arg1 && field686[var4] < arg1 + arg3) {
                field617[var4] = true;
            }
        }
    }

    @ObfuscatedName("y.bm(IIIII)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field680; var4++) {
            if (field670[var4] + field660[var4] > arg0 && field660[var4] < arg0 + arg2 && field686[var4] + field553[var4] > arg1 && field686[var4] < arg1 + arg3) {
                field683[var4] = true;
            }
        }
    }

    @ObfuscatedName("by.bp(B)V")
    public static final void method1491() {
        int var0 = Statics.field24.method3357(class133.field2234);
        for (int var1 = 0; var1 < field547; var1++) {
            class182 var2 = Statics.field24;
            String var3;
            if (field539[var1].length() > 0) {
                var3 = field627[var1] + class133.field2279 + field539[var1];
            } else {
                var3 = field627[var1];
            }
            int var4 = var2.method3357(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field547 * 15 + 21;
        int var6 = class76.field1395 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class76.field1394;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field473 = true;
        Statics.field1022 = var6;
        Statics.field2032 = var7;
        Statics.field1449 = var0;
        Statics.field2539 = field547 * 15 + 22;
    }

    @ObfuscatedName("ao.bv(IB)Z")
    public static final boolean method706(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field625[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("w.bx(II)V")
    public static final void method21(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field623[arg0];
        int var2 = field624[arg0];
        int var3 = field625[arg0];
        int var4 = field626[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 13) {
            class24 var5 = field515[var4];
            if (var5 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var5.field462[0], var5.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(43);
                field518.method2405(var4);
            }
        }
        if (var3 == 50) {
            class3 var6 = field599[var4];
            if (var6 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var6.field462[0], var6.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(90);
                field518.method2405(var4);
            }
        }
        if (var3 == 22) {
            boolean var7 = method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var7) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field622 = class76.field1395;
            field587 = class76.field1394;
            field589 = 2;
            field674 = 0;
            field518.method2258(211);
            field518.method2550(Statics.field456 + var2);
            field518.method2363(var4);
            field518.method2550(Statics.field1631 + var1);
        }
        if (var3 == 1004) {
            field622 = class76.field1395;
            field587 = class76.field1394;
            field589 = 2;
            field674 = 0;
            field518.method2258(8);
            field518.method2550(var4);
        }
        if (var3 == 36) {
            field518.method2258(36);
            field518.method2414(var2);
            field518.method2550(var1);
            field518.method2403(var4);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 42) {
            field518.method2258(41);
            field518.method2536(var2);
            field518.method2363(var1);
            field518.method2405(var4);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 21) {
            boolean var9 = method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var9) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field622 = class76.field1395;
            field587 = class76.field1394;
            field589 = 2;
            field674 = 0;
            field518.method2258(0);
            field518.method2550(Statics.field1631 + var1);
            field518.method2405(Statics.field456 + var2);
            field518.method2363(var4);
        }
        if (var3 == 3) {
            method243(var1, var2, var4);
            field518.method2258(13);
            field518.method2403(var4 >> 14 & 0x7FFF);
            field518.method2403(Statics.field456 + var2);
            field518.method2550(Statics.field1631 + var1);
        }
        if (var3 == 17) {
            boolean var11 = method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var11) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field622 = class76.field1395;
            field587 = class76.field1394;
            field589 = 2;
            field674 = 0;
            field518.method2258(216);
            field518.method2414(Statics.field299);
            field518.method2403(Statics.field456 + var2);
            field518.method2363(var4);
            field518.method2550(field513);
            field518.method2405(Statics.field1631 + var1);
        }
        if (var3 == 16) {
            boolean var13 = method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var13) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field622 = class76.field1395;
            field587 = class76.field1394;
            field589 = 2;
            field674 = 0;
            field518.method2258(176);
            field518.method2550(Statics.field1104);
            field518.method2405(Statics.field1448);
            field518.method2405(var4);
            field518.method2550(Statics.field456 + var2);
            field518.method2405(Statics.field1631 + var1);
            field518.method2536(Statics.field1676);
        }
        if (var3 == 1005) {
            class157 var15 = class157.method2079(var2);
            if (var15 == null || var15.field2682[var1] < 100000) {
                field518.method2258(8);
                field518.method2550(var4);
            } else {
                method1826(0, "", var15.field2682[var1] + " x " + class39.method1244(var4).field984);
            }
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 20) {
            boolean var16 = method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var16) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field622 = class76.field1395;
            field587 = class76.field1394;
            field589 = 2;
            field674 = 0;
            field518.method2258(207);
            field518.method2550(var4);
            field518.method2550(Statics.field1631 + var1);
            field518.method2403(Statics.field456 + var2);
        }
        if (var3 == 8) {
            class24 var18 = field515[var4];
            if (var18 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var18.field462[0], var18.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(34);
                field518.method2550(field513);
                field518.method2414(Statics.field299);
                field518.method2403(var4);
            }
        }
        if (var3 == 1001) {
            method243(var1, var2, var4);
            field518.method2258(39);
            field518.method2550(var4 >> 14 & 0x7FFF);
            field518.method2363(Statics.field456 + var2);
            field518.method2363(Statics.field1631 + var1);
        }
        if (var3 == 6) {
            method243(var1, var2, var4);
            field518.method2258(217);
            field518.method2405(Statics.field1631 + var1);
            field518.method2550(Statics.field456 + var2);
            field518.method2363(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 48) {
            class3 var19 = field599[var4];
            if (var19 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var19.field462[0], var19.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(47);
                field518.method2405(var4);
            }
        }
        if (var3 == 23) {
            Statics.field335.method1932(Statics.field189, var1, var2);
        }
        if (var3 == 28) {
            field518.method2258(146);
            field518.method2365(var2);
            class157 var20 = class157.method2079(var2);
            if (var20.field2675 != null && var20.field2675[0][0] == 5) {
                int var21 = var20.field2675[0][1];
                class158.field2700[var21] = 1 - class158.field2700[var21];
                method1554(var21);
            }
        }
        if (var3 == 49) {
            class3 var22 = field599[var4];
            if (var22 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var22.field462[0], var22.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(133);
                field518.method2550(var4);
            }
        }
        if (var3 == 5) {
            method243(var1, var2, var4);
            field518.method2258(243);
            field518.method2363(Statics.field456 + var2);
            field518.method2405(var4 >> 14 & 0x7FFF);
            field518.method2363(Statics.field1631 + var1);
        }
        if (var3 == 32) {
            field518.method2258(192);
            field518.method2405(field513);
            field518.method2550(var1);
            field518.method2365(Statics.field299);
            field518.method2414(var2);
            field518.method2363(var4);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 31) {
            field518.method2258(116);
            field518.method2365(var2);
            field518.method2550(var1);
            field518.method2405(var4);
            field518.method2533(Statics.field1676);
            field518.method2403(Statics.field1104);
            field518.method2550(Statics.field1448);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 14) {
            class3 var23 = field599[var4];
            if (var23 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var23.field462[0], var23.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(75);
                field518.method2403(Statics.field1448);
                field518.method2365(Statics.field1676);
                field518.method2403(var4);
                field518.method2405(Statics.field1104);
            }
        }
        if (var3 == 29) {
            field518.method2258(146);
            field518.method2365(var2);
            class157 var24 = class157.method2079(var2);
            if (var24.field2675 != null && var24.field2675[0][0] == 5) {
                int var25 = var24.field2675[0][1];
                if (class158.field2700[var25] != var24.field2677[0]) {
                    class158.field2700[var25] = var24.field2677[0];
                    method1554(var25);
                }
            }
        }
        if (var3 == 34) {
            field518.method2258(84);
            field518.method2533(var2);
            field518.method2405(var4);
            field518.method2403(var1);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 46) {
            class3 var26 = field599[var4];
            if (var26 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var26.field462[0], var26.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(132);
                field518.method2405(var4);
            }
        }
        if (var3 == 9) {
            class24 var27 = field515[var4];
            if (var27 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var27.field462[0], var27.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(165);
                field518.method2403(var4);
            }
        }
        if (var3 == 45) {
            class3 var28 = field599[var4];
            if (var28 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var28.field462[0], var28.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(194);
                field518.method2363(var4);
            }
        }
        if (var3 == 26) {
            field518.method2258(95);
            for (class4 var29 = (class4) field640.method3277(); var29 != null; var29 = (class4) field640.method3265()) {
                if (var29.field67 == 0 || var29.field67 == 3) {
                    method45(var29, true);
                }
            }
            if (field643 != null) {
                Statics.method1546(field643);
                field643 = null;
            }
        }
        if (var3 == 30 && field643 == null) {
            field518.method2258(208);
            field518.method2533(var2);
            field518.method2403(var1);
            field643 = class157.method169(var2, var1);
            Statics.method1546(field643);
        }
        if (var3 == 1003) {
            field622 = class76.field1395;
            field587 = class76.field1394;
            field589 = 2;
            field674 = 0;
            class24 var30 = field515[var4];
            if (var30 != null) {
                class30 var31 = var30.field388;
                if (var31.field798 != null) {
                    var31 = var31.method561();
                }
                if (var31 != null) {
                    field518.method2258(128);
                    field518.method2363(var31.field779);
                }
            }
        }
        if (var3 == 47) {
            class3 var32 = field599[var4];
            if (var32 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var32.field462[0], var32.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(5);
                field518.method2363(var4);
            }
        }
        if (var3 == 19) {
            boolean var33 = method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var33) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field622 = class76.field1395;
            field587 = class76.field1394;
            field589 = 2;
            field674 = 0;
            field518.method2258(76);
            field518.method2363(var4);
            field518.method2550(Statics.field1631 + var1);
            field518.method2403(Statics.field456 + var2);
        }
        if (var3 == 15) {
            class3 var35 = field599[var4];
            if (var35 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var35.field462[0], var35.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(31);
                field518.method2536(Statics.field299);
                field518.method2403(field513);
                field518.method2550(var4);
            }
        }
        if (var3 == 12) {
            class24 var36 = field515[var4];
            if (var36 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var36.field462[0], var36.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(11);
                field518.method2363(var4);
            }
        }
        if (var3 == 24) {
            class157 var37 = class157.method2079(var2);
            boolean var38 = true;
            if (var37.field2583 > 0) {
                var38 = method1503(var37);
            }
            if (var38) {
                field518.method2258(146);
                field518.method2365(var2);
            }
        }
        if (var3 == 58) {
            field518.method2258(124);
            field518.method2550(var1);
            field518.method2533(var2);
            field518.method2536(Statics.field299);
            field518.method2363(field513);
        }
        if (var3 == 39) {
            field518.method2258(166);
            field518.method2533(var2);
            field518.method2550(var1);
            field518.method2405(var4);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 43) {
            field518.method2258(130);
            field518.method2405(var4);
            field518.method2365(var2);
            field518.method2403(var1);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 18) {
            boolean var39 = method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var39) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field622 = class76.field1395;
            field587 = class76.field1394;
            field589 = 2;
            field674 = 0;
            field518.method2258(169);
            field518.method2550(var4);
            field518.method2550(Statics.field1631 + var1);
            field518.method2550(Statics.field456 + var2);
        }
        if (var3 == 51) {
            class3 var41 = field599[var4];
            if (var41 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var41.field462[0], var41.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(204);
                field518.method2405(var4);
            }
        }
        if (var3 == 41) {
            field518.method2258(93);
            field518.method2405(var1);
            field518.method2414(var2);
            field518.method2550(var4);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 33) {
            field518.method2258(1);
            field518.method2365(var2);
            field518.method2403(var4);
            field518.method2403(var1);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 37) {
            field518.method2258(27);
            field518.method2550(var4);
            field518.method2405(var1);
            field518.method2533(var2);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 2 && method243(var1, var2, var4)) {
            field518.method2258(127);
            field518.method2405(var4 >> 14 & 0x7FFF);
            field518.method2403(field513);
            field518.method2533(Statics.field299);
            field518.method2403(Statics.field1631 + var1);
            field518.method2405(Statics.field456 + var2);
        }
        if (var3 == 25) {
            class157 var42 = class157.method169(var2, var1);
            if (var42 != null) {
                method214();
                method852(var2, var1, class161.method1989(method2167(var42)));
                field687 = 0;
                String var43;
                if (class161.method1989(method2167(var42)) == 0) {
                    var43 = null;
                } else if (var42.field2645 == null || var42.field2645.trim().length() == 0) {
                    var43 = null;
                } else {
                    var43 = var42.field2645;
                }
                field534 = var43;
                if (field534 == null) {
                    field534 = "Null";
                }
                if (var42.field2639) {
                    field638 = var42.field2612 + class2.method217(16777215);
                } else {
                    field638 = class2.method217(65280) + var42.field2679 + class2.method217(16777215);
                }
            }
            return;
        }
        if (var3 == 4) {
            method243(var1, var2, var4);
            field518.method2258(149);
            field518.method2363(Statics.field1631 + var1);
            field518.method2363(var4 >> 14 & 0x7FFF);
            field518.method2550(Statics.field456 + var2);
        }
        if (var3 == 35) {
            field518.method2258(121);
            field518.method2533(var2);
            field518.method2363(var1);
            field518.method2403(var4);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 10) {
            class24 var44 = field515[var4];
            if (var44 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var44.field462[0], var44.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(148);
                field518.method2405(var4);
            }
        }
        if (var3 == 38) {
            method214();
            class157 var45 = class157.method2079(var2);
            field687 = 1;
            Statics.field1448 = var1;
            Statics.field1676 = var2;
            Statics.field1104 = var4;
            Statics.method1546(var45);
            field672 = class2.method217(16748608) + class39.method1244(var4).field984 + class2.method217(16777215);
            if (field672 == null) {
                field672 = "null";
            }
            return;
        }
        if (var3 == 7) {
            class24 var46 = field515[var4];
            if (var46 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var46.field462[0], var46.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(141);
                field518.method2363(Statics.field1448);
                field518.method2550(Statics.field1104);
                field518.method2533(Statics.field1676);
                field518.method2550(var4);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            method170(var4, var2, var1, field539[arg0]);
        }
        if (var3 == 1 && method243(var1, var2, var4)) {
            field518.method2258(193);
            field518.method2414(Statics.field1676);
            field518.method2550(Statics.field456 + var2);
            field518.method2405(Statics.field1448);
            field518.method2405(Statics.field1104);
            field518.method2363(var4 >> 14 & 0x7FFF);
            field518.method2405(Statics.field1631 + var1);
        }
        if (var3 == 1002) {
            field622 = class76.field1395;
            field587 = class76.field1394;
            field589 = 2;
            field674 = 0;
            field518.method2258(69);
            field518.method2363(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 11) {
            class24 var47 = field515[var4];
            if (var47 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var47.field462[0], var47.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(137);
                field518.method2363(var4);
            }
        }
        if (var3 == 40) {
            field518.method2258(119);
            field518.method2363(var4);
            field518.method2363(var1);
            field518.method2414(var2);
            field590 = 0;
            Statics.field293 = class157.method2079(var2);
            field593 = var1;
        }
        if (var3 == 44) {
            class3 var48 = field599[var4];
            if (var48 != null) {
                method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var48.field462[0], var48.field447[0], false, 0, 0, 1, 1, 0, 2);
                field622 = class76.field1395;
                field587 = class76.field1394;
                field589 = 2;
                field674 = 0;
                field518.method2258(221);
                field518.method2405(var4);
            }
        }
        if (field687 != 0) {
            field687 = 0;
            Statics.method1546(class157.method2079(Statics.field1676));
        }
        if (field562) {
            method214();
        }
        if (Statics.field293 != null && field590 == 0) {
            Statics.method1546(Statics.field293);
        }
    }

    @ObfuscatedName("ap.be(IIII)V")
    public static void method852(int arg0, int arg1, int arg2) {
        class157 var3 = class157.method169(arg0, arg1);
        if (var3 != null && var3.field2657 != null) {
            class1 var4 = new class1();
            var4.field2 = var3;
            var4.field8 = var3.field2657;
            class25.method754(var4);
        }
        field562 = true;
        Statics.field299 = arg0;
        field513 = arg1;
        Statics.field955 = arg2;
        Statics.method1546(var3);
    }

    @ObfuscatedName("x.bh(I)V")
    public static void method214() {
        if (!field562) {
            return;
        }
        class157 var0 = class157.method169(Statics.field299, field513);
        if (var0 != null && var0.field2658 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field8 = var0.field2658;
            class25.method754(var1);
        }
        field562 = false;
        Statics.method1546(var0);
    }

    @ObfuscatedName("d.bt(IIILjava/lang/String;I)V")
    public static void method170(int arg0, int arg1, int arg2, String arg3) {
        class157 var4 = class157.method169(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2666 != null) {
            class1 var5 = new class1();
            var5.field2 = var4;
            var5.field5 = arg0;
            var5.field9 = arg3;
            var5.field8 = var4.field2666;
            class25.method754(var5);
        }
        boolean var6 = true;
        if (var4.field2583 > 0) {
            var6 = method1503(var4);
        }
        if (!var6 || !class161.method3105(method2167(var4), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field518.method2258(150);
            field518.method2365(arg1);
            field518.method2363(arg2);
        }
        if (arg0 == 2) {
            field518.method2258(30);
            field518.method2365(arg1);
            field518.method2363(arg2);
        }
        if (arg0 == 3) {
            field518.method2258(178);
            field518.method2365(arg1);
            field518.method2363(arg2);
        }
        if (arg0 == 4) {
            field518.method2258(135);
            field518.method2365(arg1);
            field518.method2363(arg2);
        }
        if (arg0 == 5) {
            field518.method2258(61);
            field518.method2365(arg1);
            field518.method2363(arg2);
        }
        if (arg0 == 6) {
            field518.method2258(120);
            field518.method2365(arg1);
            field518.method2363(arg2);
        }
        if (arg0 == 7) {
            field518.method2258(85);
            field518.method2365(arg1);
            field518.method2363(arg2);
        }
        if (arg0 == 8) {
            field518.method2258(174);
            field518.method2365(arg1);
            field518.method2363(arg2);
        }
        if (arg0 == 9) {
            field518.method2258(167);
            field518.method2365(arg1);
            field518.method2363(arg2);
        }
        if (arg0 == 10) {
            field518.method2258(7);
            field518.method2365(arg1);
            field518.method2363(arg2);
        }
    }

    @ObfuscatedName("cj.by(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1548(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field473 || field547 >= 500) {
            return;
        }
        field627[field547] = arg0;
        field539[field547] = arg1;
        field625[field547] = arg2;
        field626[field547] = arg3;
        field623[field547] = arg4;
        field624[field547] = arg5;
        field547++;
    }

    @ObfuscatedName("az.bk(IIIII)V")
    public static final void method667(int arg0, int arg1, int arg2, int arg3) {
        if (field687 == 0 && !field562) {
            method1548(class133.field2236, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class111.field1923; var5++) {
            int var6 = class111.field1869[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field335.method1863(Statics.field189, var7, var8, var6) >= 0) {
                    class31 var11 = class31.method187(var10);
                    if (var11.field851 != null) {
                        var11 = var11.method607();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field687 == 1) {
                        method1548(class133.field2231, field672 + " " + class2.field28 + " " + class2.method217(65535) + var11.field825, 1, var6, var7, var8);
                    } else if (!field562) {
                        String[] var12 = var11.field837;
                        if (field649) {
                            var12 = method108(var12);
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
                                    method1548(var12[var13], class2.method217(65535) + var11.field825, var14, var6, var7, var8);
                                }
                            }
                        }
                        method1548(class133.field2184, class2.method217(65535) + var11.field825, 1002, var11.field822 << 14, var7, var8);
                    } else if ((Statics.field955 & 0x4) == 4) {
                        method1548(field534, field638 + " " + class2.field28 + " " + class2.method217(65535) + var11.field825, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class24 var15 = field515[var10];
                    if (var15.field388.field781 == 1 && (var15.field427 & 0x7F) == 64 && (var15.field411 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field516; var16++) {
                            class24 var17 = field515[field628[var16]];
                            if (var17 != null && var15 != var17 && var17.field388.field781 == 1 && var15.field427 == var17.field427 && var15.field411 == var17.field411) {
                                method3209(var17.field388, field628[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field600; var18++) {
                            class3 var19 = field599[field601[var18]];
                            if (var19 != null && var15.field427 == var19.field427 && var15.field411 == var19.field411) {
                                method153(var19, field601[var18], var7, var8);
                            }
                        }
                    }
                    method3209(var15.field388, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field599[var10];
                    if ((var20.field427 & 0x7F) == 64 && (var20.field411 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field516; var21++) {
                            class24 var22 = field515[field628[var21]];
                            if (var22 != null && var22.field388.field781 == 1 && var20.field427 == var22.field427 && var20.field411 == var22.field411) {
                                method3209(var22.field388, field628[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field600; var23++) {
                            class3 var24 = field599[field601[var23]];
                            if (var24 != null && var20 != var24 && var20.field427 == var24.field427 && var20.field411 == var24.field411) {
                                method153(var24, field601[var23], var7, var8);
                            }
                        }
                    }
                    method153(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class176 var25 = field733[Statics.field189][var7][var8];
                    if (var25 != null) {
                        for (class16 var26 = (class16) var25.method3286(); var26 != null; var26 = (class16) var25.method3309()) {
                            class39 var27 = class39.method1244(var26.field251);
                            if (field687 == 1) {
                                method1548(class133.field2231, field672 + " " + class2.field28 + " " + class2.method217(16748608) + var27.field984, 16, var26.field251, var7, var8);
                            } else if (!field562) {
                                String[] var28 = var27.field998;
                                if (field649) {
                                    var28 = method108(var28);
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
                                        method1548(var28[var29], class2.method217(16748608) + var27.field984, var30, var26.field251, var7, var8);
                                    } else if (var29 == 2) {
                                        method1548(class133.field2095, class2.method217(16748608) + var27.field984, 20, var26.field251, var7, var8);
                                    }
                                }
                                method1548(class133.field2184, class2.method217(16748608) + var27.field984, 1004, var26.field251, var7, var8);
                            } else if ((Statics.field955 & 0x1) == 1) {
                                method1548(field534, field638 + " " + class2.field28 + " " + class2.method217(16748608) + var27.field984, 17, var26.field251, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fw.bi(Laq;IIII)V")
    public static final void method3209(class30 arg0, int arg1, int arg2, int arg3) {
        if (field547 >= 400) {
            return;
        }
        if (arg0.field798 != null) {
            arg0 = arg0.method561();
        }
        if (arg0 == null || !arg0.field776) {
            return;
        }
        String var4 = arg0.field788;
        if (arg0.field787 != 0) {
            var4 = var4 + method60(arg0.field787, Statics.field2035.field46) + " " + class2.field29 + class133.field2237 + arg0.field787 + class2.field30;
        }
        if (field687 == 1) {
            method1548(class133.field2231, field672 + " " + class2.field28 + " " + class2.method217(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field562) {
            String[] var5 = arg0.field795;
            if (field649) {
                var5 = method108(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class133.field2233)) {
                        byte var7 = 0;
                        if (var6 == 0) {
                            var7 = 9;
                        }
                        if (var6 == 1) {
                            var7 = 10;
                        }
                        if (var6 == 2) {
                            var7 = 11;
                        }
                        if (var6 == 3) {
                            var7 = 12;
                        }
                        if (var6 == 4) {
                            var7 = 13;
                        }
                        method1548(var5[var6], class2.method217(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class133.field2233)) {
                        short var9 = 0;
                        if (arg0.field787 > Statics.field2035.field46) {
                            var9 = 2000;
                        }
                        int var10 = 0;
                        if (var8 == 0) {
                            var10 = var9 + 9;
                        }
                        if (var8 == 1) {
                            var10 = var9 + 10;
                        }
                        if (var8 == 2) {
                            var10 = var9 + 11;
                        }
                        if (var8 == 3) {
                            var10 = var9 + 12;
                        }
                        if (var8 == 4) {
                            var10 = var9 + 13;
                        }
                        method1548(var5[var8], class2.method217(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method1548(class133.field2184, class2.method217(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field955 & 0x2) == 2) {
            method1548(field534, field638 + " " + class2.field28 + " " + class2.method217(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("i.bc(Lw;IIII)V")
    public static final void method153(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2035 == arg0 || field547 >= 400) {
            return;
        }
        String var4;
        if (arg0.field47 == 0) {
            var4 = arg0.field57 + method60(arg0.field46, Statics.field2035.field46) + " " + class2.field29 + class133.field2237 + arg0.field46 + class2.field30;
        } else {
            var4 = arg0.field57 + " " + class2.field29 + class133.field2238 + arg0.field47 + class2.field30;
        }
        if (field687 == 1) {
            method1548(class133.field2231, field672 + " " + class2.field28 + " " + class2.method217(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field562) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field691[var5] != null) {
                    short var6 = 0;
                    if (field691[var5].equalsIgnoreCase(class133.field2233)) {
                        if (arg0.field46 > Statics.field2035.field46) {
                            var6 = 2000;
                        }
                        if (Statics.field2035.field60 != 0 && arg0.field60 != 0) {
                            if (Statics.field2035.field60 == arg0.field60) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field611[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field609[var5] + var6;
                    method1548(field691[var5], class2.method217(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field955 & 0x8) == 8) {
            method1548(field534, field638 + " " + class2.field28 + " " + class2.method217(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field547; var9++) {
            if (field625[var9] == 23) {
                field539[var9] = class2.method217(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("g.bw(III)Ljava/lang/String;")
    public static final String method60(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method217(16711680);
        } else if (var2 < -6) {
            return class2.method217(16723968);
        } else if (var2 < -3) {
            return class2.method217(16740352);
        } else if (var2 < 0) {
            return class2.method217(16756736);
        } else if (var2 > 9) {
            return class2.method217(65280);
        } else if (var2 > 6) {
            return class2.method217(4259584);
        } else if (var2 > 3) {
            return class2.method217(8453888);
        } else if (var2 > 0) {
            return class2.method217(12648192);
        } else {
            return class2.method217(16776960);
        }
    }

    @ObfuscatedName("az.cj(IIIIIIIII)V")
    public static final void method666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class157.method2314(arg0)) {
            Statics.field22 = null;
            Statics.method133(Statics.field2687[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field22 != null) {
                Statics.method133(Statics.field22, -1412584499, arg1, arg2, arg3, arg4, Statics.field50, Statics.field874, arg7);
                Statics.field22 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field617[var8] = true;
            }
        } else {
            field617[arg7] = true;
        }
    }

    @ObfuscatedName("fx.cq(Ljava/lang/String;Lfn;I)Ljava/lang/String;")
    public static String method3091(String arg0, class157 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2580(method1196(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field797 != null) {
                    var5 = class146.method150(Statics.field797.field1412);
                    if (Statics.field797.field1414 != null) {
                        var5 = (String) Statics.field797.field1414;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("h.cx(II)Ljava/lang/String;")
    public static final String method37(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field27 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method217(65408) + var1.substring(0, var1.length() - 8) + class133.field2111 + " " + class2.field29 + var1 + class2.field30 + class2.field35;
        } else if (var1.length() > 6) {
            return " " + class2.method217(16777215) + var1.substring(0, var1.length() - 4) + class133.field2244 + " " + class2.field29 + var1 + class2.field30 + class2.field35;
        } else {
            return " " + class2.method217(16776960) + var1 + class2.field35;
        }
    }

    @ObfuscatedName("dv.ck(II)Ljava/lang/String;")
    public static final String method2580(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("dg.cd(Lfn;I)Z")
    public static final boolean method2619(class157 arg0) {
        if (arg0.field2676 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2676.length; var1++) {
            int var2 = method1196(arg0, var1);
            int var3 = arg0.field2677[var1];
            if (arg0.field2676[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2676[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2676[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bf.ct(Lfn;II)I")
    public static final int method1196(class157 arg0, int arg1) {
        if (arg0.field2675 == null || arg1 >= arg0.field2675.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2675[arg1];
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
                    var7 = field709[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field618[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field619[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class157 var11 = class157.method2079(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class39.method1244(var12).field997 || field478)) {
                        for (int var13 = 0; var13 < var11.field2652.length; var13++) {
                            if (var12 + 1 == var11.field2652[var13]) {
                                var7 += var11.field2682[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class158.field2700[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class129.field2052[field618[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class158.field2700[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2035.field46;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class129.field2054[var14]) {
                            var7 += field618[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class157 var17 = class157.method2079(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class39.method1244(var18).field997 || field478)) {
                        for (int var19 = 0; var19 < var17.field2652.length; var19++) {
                            if (var18 + 1 == var17.field2652[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field644;
                }
                if (var6 == 12) {
                    var7 = field645;
                }
                if (var6 == 13) {
                    int var20 = class158.field2700[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class158.method1991(var22);
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
                    var7 = (Statics.field2035.field427 >> 7) + Statics.field1631;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2035.field411 >> 7) + Statics.field456;
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

    @ObfuscatedName("dj.cb(IIIIIIII)V")
    public static final void method2249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class157.method2314(arg0)) {
            method145(Statics.field2687[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("m.cl([Lfn;IIIIIIII)V")
    public static final void method145(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class157 var9 = arg0[var8];
            if (var9 != null && (!var9.field2639 || var9.field2581 == 0 || var9.field2646 || method2167(var9) != 0 || field485 == var9) && var9.field2600 == arg1 && (!var9.field2639 || !method42(var9))) {
                int var10 = var9.field2584 + arg6;
                int var11 = var9.field2697 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2581 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2581 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2588 + var10;
                    int var19 = var9.field2589 + var11;
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
                    int var22 = var9.field2588 + var10;
                    int var23 = var9.field2589 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field650 == var9) {
                    field658 = true;
                    field659 = var10;
                    field472 = var11;
                }
                if (!var9.field2639 || var12 < var14 && var13 < var15) {
                    if (var9.field2583 == 1337) {
                        Statics.method1546(var9);
                    } else if (var9.field2583 == 1338) {
                        method727(var10, var11);
                    } else {
                        if (var9.field2581 == 0) {
                            if (!var9.field2639 && method42(var9) && Statics.field204 != var9) {
                                continue;
                            }
                            method145(arg0, var9.field2579, var12, var13, var14, var15, var10 - var9.field2592, var11 - var9.field2611);
                            if (var9.field2664 != null) {
                                method145(var9.field2664, var9.field2579, var12, var13, var14, var15, var10 - var9.field2592, var11 - var9.field2611);
                            }
                            class4 var24 = (class4) field640.method3261((long) var9.field2579);
                            if (var24 != null) {
                                method2249(var24.field69, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2639) {
                            boolean var25;
                            if (class76.field1399 >= var12 && class76.field1388 >= var13 && class76.field1399 < var14 && class76.field1388 < var15) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            boolean var26 = false;
                            if (class76.field1393 == 1 && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            if (class76.field1400 == 1 && class76.field1395 >= var12 && class76.field1394 >= var13 && class76.field1395 < var14 && class76.field1394 < var15) {
                                var27 = true;
                            }
                            if (var27) {
                                int var28 = class76.field1395 - var10;
                                int var29 = class76.field1394 - var11;
                                if (field650 == null && !field473 && var9 != null) {
                                    class157 var30 = method1354(var9);
                                    if (var30 == null) {
                                        var30 = var9.field2649;
                                    }
                                    if (var30 != null) {
                                        field650 = var9;
                                        class157 var32 = method1354(var9);
                                        if (var32 == null) {
                                            var32 = var9.field2649;
                                        }
                                        field485 = var32;
                                        field688 = var28;
                                        field653 = var29;
                                        Statics.field1684 = 0;
                                        field661 = false;
                                    }
                                }
                            }
                            if (field650 != null && field650 != var9 && var25 && class161.method788(method2167(var9))) {
                                field654 = var9;
                            }
                            if (field485 == var9) {
                                field655 = true;
                                field656 = var10;
                                field657 = var11;
                            }
                            if (var9.field2646) {
                                if (var25 && field675 != 0 && var9.field2667 != null) {
                                    class1 var34 = new class1();
                                    var34.field2 = var9;
                                    var34.field18 = field675;
                                    var34.field8 = var9.field2667;
                                    field676.method3305(var34);
                                }
                                if (field650 != null || Statics.field298 != null || field473) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (!var9.field2689 && var27) {
                                    var9.field2689 = true;
                                    if (var9.field2648 != null) {
                                        class1 var35 = new class1();
                                        var35.field2 = var9;
                                        var35.field1 = class76.field1395 - var10;
                                        var35.field18 = class76.field1394 - var11;
                                        var35.field8 = var9.field2648;
                                        field676.method3305(var35);
                                    }
                                }
                                if (var9.field2689 && var26 && var9.field2605 != null) {
                                    class1 var36 = new class1();
                                    var36.field2 = var9;
                                    var36.field1 = class76.field1399 - var10;
                                    var36.field18 = class76.field1388 - var11;
                                    var36.field8 = var9.field2605;
                                    field676.method3305(var36);
                                }
                                if (var9.field2689 && !var26) {
                                    var9.field2689 = false;
                                    if (var9.field2582 != null) {
                                        class1 var37 = new class1();
                                        var37.field2 = var9;
                                        var37.field1 = class76.field1399 - var10;
                                        var37.field18 = class76.field1388 - var11;
                                        var37.field8 = var9.field2582;
                                        field678.method3305(var37);
                                    }
                                }
                                if (var26 && var9.field2661 != null) {
                                    class1 var38 = new class1();
                                    var38.field2 = var9;
                                    var38.field1 = class76.field1399 - var10;
                                    var38.field18 = class76.field1388 - var11;
                                    var38.field8 = var9.field2661;
                                    field676.method3305(var38);
                                }
                                if (!var9.field2688 && var25) {
                                    var9.field2688 = true;
                                    if (var9.field2633 != null) {
                                        class1 var39 = new class1();
                                        var39.field2 = var9;
                                        var39.field1 = class76.field1399 - var10;
                                        var39.field18 = class76.field1388 - var11;
                                        var39.field8 = var9.field2633;
                                        field676.method3305(var39);
                                    }
                                }
                                if (var9.field2688 && var25 && var9.field2653 != null) {
                                    class1 var40 = new class1();
                                    var40.field2 = var9;
                                    var40.field1 = class76.field1399 - var10;
                                    var40.field18 = class76.field1388 - var11;
                                    var40.field8 = var9.field2653;
                                    field676.method3305(var40);
                                }
                                if (var9.field2688 && !var25) {
                                    var9.field2688 = false;
                                    if (var9.field2569 != null) {
                                        class1 var41 = new class1();
                                        var41.field2 = var9;
                                        var41.field1 = class76.field1399 - var10;
                                        var41.field18 = class76.field1388 - var11;
                                        var41.field8 = var9.field2569;
                                        field678.method3305(var41);
                                    }
                                }
                                if (var9.field2650 != null) {
                                    class1 var42 = new class1();
                                    var42.field2 = var9;
                                    var42.field8 = var9.field2650;
                                    field677.method3305(var42);
                                }
                                if (var9.field2659 != null && field509 > var9.field2691) {
                                    if (var9.field2641 == null || field509 - var9.field2691 > 32) {
                                        class1 var47 = new class1();
                                        var47.field2 = var9;
                                        var47.field8 = var9.field2659;
                                        field676.method3305(var47);
                                    } else {
                                        label448: for (int var43 = var9.field2691; var43 < field509; var43++) {
                                            int var44 = field663[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var9.field2641.length; var45++) {
                                                if (var9.field2641[var45] == var44) {
                                                    class1 var46 = new class1();
                                                    var46.field2 = var9;
                                                    var46.field8 = var9.field2659;
                                                    field676.method3305(var46);
                                                    break label448;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2691 = field509;
                                }
                                if (var9.field2627 != null && field666 > var9.field2623) {
                                    if (var9.field2662 == null || field666 - var9.field2623 > 32) {
                                        class1 var52 = new class1();
                                        var52.field2 = var9;
                                        var52.field8 = var9.field2627;
                                        field676.method3305(var52);
                                    } else {
                                        label428: for (int var48 = var9.field2623; var48 < field666; var48++) {
                                            int var49 = field665[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2662.length; var50++) {
                                                if (var9.field2662[var50] == var49) {
                                                    class1 var51 = new class1();
                                                    var51.field2 = var9;
                                                    var51.field8 = var9.field2627;
                                                    field676.method3305(var51);
                                                    break label428;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2623 = field666;
                                }
                                if (var9.field2692 != null && field668 > var9.field2693) {
                                    if (var9.field2601 == null || field668 - var9.field2693 > 32) {
                                        class1 var57 = new class1();
                                        var57.field2 = var9;
                                        var57.field8 = var9.field2692;
                                        field676.method3305(var57);
                                    } else {
                                        label408: for (int var53 = var9.field2693; var53 < field668; var53++) {
                                            int var54 = field496[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2601.length; var55++) {
                                                if (var9.field2601[var55] == var54) {
                                                    class1 var56 = new class1();
                                                    var56.field2 = var9;
                                                    var56.field8 = var9.field2692;
                                                    field676.method3305(var56);
                                                    break label408;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2693 = field668;
                                }
                                if (field669 > var9.field2690 && var9.field2668 != null) {
                                    class1 var58 = new class1();
                                    var58.field2 = var9;
                                    var58.field8 = var9.field2668;
                                    field676.method3305(var58);
                                }
                                if (field588 > var9.field2690 && var9.field2670 != null) {
                                    class1 var59 = new class1();
                                    var59.field2 = var9;
                                    var59.field8 = var9.field2670;
                                    field676.method3305(var59);
                                }
                                if (field596 > var9.field2690 && var9.field2626 != null) {
                                    class1 var60 = new class1();
                                    var60.field2 = var9;
                                    var60.field8 = var9.field2626;
                                    field676.method3305(var60);
                                }
                                if (field725 > var9.field2690 && var9.field2672 != null) {
                                    class1 var61 = new class1();
                                    var61.field2 = var9;
                                    var61.field8 = var9.field2672;
                                    field676.method3305(var61);
                                }
                                var9.field2690 = field729;
                                if (var9.field2669 != null) {
                                    for (int var62 = 0; var62 < field700; var62++) {
                                        class1 var63 = new class1();
                                        var63.field2 = var9;
                                        var63.field19 = field702[var62];
                                        var63.field6 = field701[var62];
                                        var63.field8 = var9.field2669;
                                        field676.method3305(var63);
                                    }
                                }
                            }
                        }
                        if (!var9.field2639) {
                            if (field650 != null || Statics.field298 != null || field473) {
                                return;
                            }
                            if ((var9.field2591 >= 0 || var9.field2598 != 0) && class76.field1399 >= var12 && class76.field1388 >= var13 && class76.field1399 < var14 && class76.field1388 < var15) {
                                if (var9.field2591 >= 0) {
                                    Statics.field204 = arg0[var9.field2591];
                                } else {
                                    Statics.field204 = var9;
                                }
                            }
                            if (var9.field2581 == 8 && class76.field1399 >= var12 && class76.field1388 >= var13 && class76.field1399 < var14 && class76.field1388 < var15) {
                                Statics.field345 = var9;
                            }
                            if (var9.field2595 > var9.field2589) {
                                int var64 = var9.field2588 + var10;
                                int var65 = var9.field2589;
                                int var66 = var9.field2595;
                                int var67 = class76.field1399;
                                int var68 = class76.field1388;
                                if (field563) {
                                    field641 = 32;
                                } else {
                                    field641 = 0;
                                }
                                field563 = false;
                                if (class76.field1393 != 0) {
                                    if (var67 >= var64 && var67 < var64 + 16 && var68 >= var11 && var68 < var11 + 16) {
                                        var9.field2611 -= 4;
                                        Statics.method1546(var9);
                                    } else if (var67 >= var64 && var67 < var64 + 16 && var68 >= var11 + var65 - 16 && var68 < var11 + var65) {
                                        var9.field2611 += 4;
                                        Statics.method1546(var9);
                                    } else if (var67 >= var64 - field641 && var67 < field641 + var64 + 16 && var68 >= var11 + 16 && var68 < var11 + var65 - 16) {
                                        int var69 = (var65 - 32) * var65 / var66;
                                        if (var69 < 8) {
                                            var69 = 8;
                                        }
                                        int var70 = var68 - var11 - 16 - var69 / 2;
                                        int var71 = var65 - 32 - var69;
                                        var9.field2611 = (var66 - var65) * var70 / var71;
                                        Statics.method1546(var9);
                                        field563 = true;
                                    }
                                }
                                if (field675 != 0) {
                                    int var72 = var9.field2588;
                                    if (var67 >= var64 - var72 && var68 >= var11 && var67 < var64 + 16 && var68 <= var11 + var65) {
                                        var9.field2611 += field675 * 45;
                                        Statics.method1546(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.cc([Lfn;IB)V")
    public static final void method35(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2581 == 0) {
                    if (var3.field2664 != null) {
                        method35(var3.field2664, arg1);
                    }
                    class4 var4 = (class4) field640.method3261((long) var3.field2579);
                    if (var4 != null) {
                        int var5 = var4.field69;
                        if (class157.method2314(var5)) {
                            method35(Statics.field2687[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2617 != null) {
                    class1 var6 = new class1();
                    var6.field2 = var3;
                    var6.field8 = var3.field2617;
                    class25.method754(var6);
                }
                if (arg1 == 1 && var3.field2619 != null) {
                    if (var3.field2580 >= 0) {
                        class157 var7 = class157.method2079(var3.field2579);
                        if (var7 == null || var7.field2664 == null || var3.field2580 >= var7.field2664.length || var7.field2664[var3.field2580] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field2 = var3;
                    var8.field8 = var3.field2619;
                    class25.method754(var8);
                }
            }
        }
    }

    @ObfuscatedName("f.cy(S)V")
    public static void method206() {
        for (class4 var0 = (class4) field640.method3277(); var0 != null; var0 = (class4) field640.method3265()) {
            int var1 = var0.field69;
            if (class157.method2314(var1)) {
                boolean var2 = true;
                class157[] var3 = Statics.field2687[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2639;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2809;
                    class157 var6 = class157.method2079(var5);
                    if (var6 != null) {
                        Statics.method1546(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.co([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method108(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("bf.ci(II)V")
    public static final void method1200(int arg0) {
        if (!class157.method2314(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2687[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3 != null) {
                var3.field2685 = 0;
                var3.field2686 = 0;
            }
        }
    }

    @ObfuscatedName("bi.ca([Lfn;IB)V")
    public static final void method1537(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null && var3.field2600 == arg1 && (!var3.field2639 || !method42(var3))) {
                if (var3.field2581 == 0) {
                    if (!var3.field2639 && method42(var3) && Statics.field204 != var3) {
                        continue;
                    }
                    method1537(arg0, var3.field2579);
                    if (var3.field2664 != null) {
                        method1537(var3.field2664, var3.field2579);
                    }
                    class4 var4 = (class4) field640.method3261((long) var3.field2579);
                    if (var4 != null) {
                        int var5 = var4.field69;
                        if (class157.method2314(var5)) {
                            method1537(Statics.field2687[var5], -1);
                        }
                    }
                }
                if (var3.field2581 == 6) {
                    if (var3.field2615 != -1 || var3.field2616 != -1) {
                        boolean var6 = method2619(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2616;
                        } else {
                            var7 = var3.field2615;
                        }
                        if (var7 != -1) {
                            class33 var8 = class33.method751(var7);
                            var3.field2686 += field558;
                            while (var3.field2686 > var8.field883[var3.field2685]) {
                                var3.field2686 -= var8.field883[var3.field2685];
                                var3.field2685++;
                                if (var3.field2685 >= var8.field876.length) {
                                    var3.field2685 -= var8.field885;
                                    if (var3.field2685 < 0 || var3.field2685 >= var8.field876.length) {
                                        var3.field2685 = 0;
                                    }
                                }
                                Statics.method1546(var3);
                            }
                        }
                    }
                    if (var3.field2636 != 0 && !var3.field2639) {
                        int var9 = var3.field2636 >> 16;
                        int var10 = var3.field2636 << 16 >> 16;
                        int var11 = field558 * var9;
                        int var12 = field558 * var10;
                        var3.field2620 = var3.field2620 + var11 & 0x7FF;
                        var3.field2585 = var3.field2585 + var12 & 0x7FF;
                        Statics.method1546(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.cp(IB)V")
    public static final void method1554(int arg0) {
        method206();
        class7.method2169();
        int var1 = class41.method125(arg0).field1034;
        if (var1 == 0) {
            return;
        }
        int var2 = class158.field2700[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class103.method2088(0.9D);
                ((class109) Statics.field1789).method2168(0.9D);
            }
            if (var2 == 2) {
                class103.method2088(0.8D);
                ((class109) Statics.field1789).method2168(0.8D);
            }
            if (var2 == 3) {
                class103.method2088(0.7D);
                ((class109) Statics.field1789).method2168(0.7D);
            }
            if (var2 == 4) {
                class103.method2088(0.6D);
                ((class109) Statics.field1789).method2168(0.6D);
            }
            class39.method149();
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
            if (field714 != var3) {
                if (field714 == 0 && field564 != -1) {
                    class137.method1378(Statics.field506, field564, 0, var3, false);
                    field716 = false;
                } else if (var3 == 0) {
                    Statics.field2021.method2752();
                    class137.field2349 = 1;
                    Statics.field2354 = null;
                    field716 = false;
                } else if (class137.field2349 == 0) {
                    Statics.field2021.method2761(var3);
                } else {
                    Statics.field2452 = var3;
                }
                field714 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field717 = 127;
            }
            if (var2 == 1) {
                field717 = 96;
            }
            if (var2 == 2) {
                field717 = 64;
            }
            if (var2 == 3) {
                field717 = 32;
            }
            if (var2 == 4) {
                field717 = 0;
            }
        }
        if (var1 == 5) {
            field620 = var2;
        }
        if (var1 == 6) {
            field566 = var2;
        }
        if (var1 == 9) {
            field642 = var2;
        }
        if (var1 != 10) {
            return;
        }
        if (var2 == 0) {
            field718 = 127;
        }
        if (var2 == 1) {
            field718 = 96;
        }
        if (var2 == 2) {
            field718 = 64;
        }
        if (var2 == 3) {
            field718 = 32;
        }
        if (var2 == 4) {
            field718 = 0;
        }
    }

    @ObfuscatedName("v.cn(IIII)Lh;")
    public static final class4 method43(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field69 = arg1;
        var3.field67 = arg2;
        field640.method3262(var3, (long) arg0);
        method1200(arg1);
        class25.method1332(arg1);
        class157 var4 = class157.method2079(arg0);
        if (var4 != null) {
            Statics.method1546(var4);
        }
        if (field643 != null) {
            Statics.method1546(field643);
            field643 = null;
        }
        field473 = false;
        field547 = 0;
        method2177(Statics.field1022, Statics.field2032, Statics.field1449, Statics.field2539);
        if (field639 != -1) {
            int var5 = field639;
            if (class157.method2314(var5)) {
                method35(Statics.field2687[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("k.cr(Lh;ZB)V")
    public static final void method45(class4 arg0, boolean arg1) {
        int var2 = arg0.field69;
        int var3 = (int) arg0.field2809;
        arg0.method3327();
        if (arg1) {
            class157.method4(var2);
        }
        for (class170 var4 = (class170) field610.method3277(); var4 != null; var4 = (class170) field610.method3265()) {
            if ((long) var2 == (var4.field2809 >> 48 & 0xFFFFL)) {
                var4.method3327();
            }
        }
        class157 var5 = class157.method2079(var3);
        if (var5 != null) {
            Statics.method1546(var5);
        }
        field473 = false;
        field547 = 0;
        method2177(Statics.field1022, Statics.field2032, Statics.field1449, Statics.field2539);
        if (field639 != -1) {
            int var6 = field639;
            if (class157.method2314(var6)) {
                method35(Statics.field2687[var6], 1);
            }
        }
    }

    @ObfuscatedName("bk.cg(Lfn;I)Z")
    public static final boolean method1503(class157 arg0) {
        int var1 = arg0.field2583;
        if (var1 == 205) {
            field533 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field737.method3140(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field737.method3127(var4, var5 == 1);
        }
        if (var1 == 324) {
            field737.method3128(false);
        }
        if (var1 == 325) {
            field737.method3128(true);
        }
        if (var1 == 326) {
            field518.method2258(235);
            field737.method3129(field518);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bb.ce(IIII)V")
    public static final void method1313(int arg0, int arg1, int arg2) {
        method68();
        class88.method1759(arg0, arg1, Statics.field2561.field1483 + arg0, Statics.field2561.field1485 + arg1);
        if (field713 == 2 || field713 == 5) {
            class88.method1766(arg0 + 25, arg1 + 5, 0, Statics.field1276, Statics.field386);
        } else {
            int var3 = field671 + field537 & 0x7FF;
            int var4 = Statics.field2035.field427 / 32 + 48;
            int var5 = 464 - Statics.field2035.field411 / 32;
            Statics.field135.method1652(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field555 + 256, Statics.field1276, Statics.field386);
            for (int var6 = 0; var6 < field647; var6++) {
                int var7 = field708[var6] * 4 + 2 - Statics.field2035.field427 / 32;
                int var8 = field577[var6] * 4 + 2 - Statics.field2035.field411 / 32;
                method3104(arg0, arg1, var7, var8, field710[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class176 var11 = field733[Statics.field189][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field2035.field427 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field2035.field411 / 32;
                        method3104(arg0, arg1, var12, var13, Statics.field1529[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field516; var14++) {
                class24 var15 = field515[field628[var14]];
                if (var15 != null && var15.method18()) {
                    class30 var16 = var15.field388;
                    if (var16 != null && var16.field798 != null) {
                        var16 = var16.method561();
                    }
                    if (var16 != null && var16.field796 && var16.field776) {
                        int var17 = var15.field427 / 32 - Statics.field2035.field427 / 32;
                        int var18 = var15.field411 / 32 - Statics.field2035.field411 / 32;
                        method3104(arg0, arg1, var17, var18, Statics.field1529[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field600; var19++) {
                class3 var20 = field599[field601[var19]];
                if (var20 != null && var20.method18()) {
                    int var21 = var20.field427 / 32 - Statics.field2035.field427 / 32;
                    int var22 = var20.field411 / 32 - Statics.field2035.field411 / 32;
                    boolean var23 = false;
                    if (method2620(var20.field57)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    if (Statics.field2035.field60 != 0 && var20.field60 != 0 && Statics.field2035.field60 == var20.field60) {
                        var24 = true;
                    }
                    if (var23) {
                        method3104(arg0, arg1, var21, var22, Statics.field1529[3]);
                    } else if (var24) {
                        method3104(arg0, arg1, var21, var22, Statics.field1529[4]);
                    } else {
                        method3104(arg0, arg1, var21, var22, Statics.field1529[2]);
                    }
                }
            }
            if (field538 != 0 && field568 % 20 < 10) {
                if (field538 == 1 && field494 >= 0 && field494 < field515.length) {
                    class24 var25 = field515[field494];
                    if (var25 != null) {
                        int var26 = var25.field427 / 32 - Statics.field2035.field427 / 32;
                        int var27 = var25.field411 / 32 - Statics.field2035.field411 / 32;
                        method1552(arg0, arg1, var26, var27, Statics.field865[1]);
                    }
                }
                if (field538 == 2) {
                    int var28 = field608 * 4 - Statics.field1631 * 4 + 2 - Statics.field2035.field427 / 32;
                    int var29 = field621 * 4 - Statics.field456 * 4 + 2 - Statics.field2035.field411 / 32;
                    method1552(arg0, arg1, var28, var29, Statics.field865[1]);
                }
                if (field538 == 10 && field495 >= 0 && field495 < field599.length) {
                    class3 var30 = field599[field495];
                    if (var30 != null) {
                        int var31 = var30.field427 / 32 - Statics.field2035.field427 / 32;
                        int var32 = var30.field411 / 32 - Statics.field2035.field411 / 32;
                        method1552(arg0, arg1, var31, var32, Statics.field865[1]);
                    }
                }
            }
            if (field703 != 0) {
                int var33 = field703 * 4 + 2 - Statics.field2035.field427 / 32;
                int var34 = field712 * 4 + 2 - Statics.field2035.field411 / 32;
                method3104(arg0, arg1, var33, var34, Statics.field865[0]);
            }
            class88.method1761(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field713 < 3) {
            Statics.field171.method1652(arg0, arg1, 33, 33, 25, 25, field671, 256, Statics.field1833, Statics.field94);
        } else {
            class88.method1766(arg0, arg1, 0, Statics.field1833, Statics.field94);
        }
        if (field541[arg2]) {
            Statics.field2561.method1744(arg0, arg1);
        }
        field683[arg2] = true;
    }

    @ObfuscatedName("cj.ch(IIIILct;B)V")
    public static final void method1552(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method3104(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field671 + field537 & 0x7FF;
        int var7 = class103.field1790[var6];
        int var8 = class103.field1787[var6];
        int var9 = var7 * 256 / (field555 + 256);
        int var10 = var8 * 256 / (field555 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field87.method1671(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("fl.cu(IIIILct;B)V")
    public static final void method3104(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field671 + field537 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class103.field1790[var5];
        int var8 = class103.field1787[var5];
        int var9 = var7 * 256 / (field555 + 256);
        int var10 = var8 * 256 / (field555 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1674(Statics.field2561, arg0 + 94 + var11 - arg4.field1476 / 2 + 4, arg1 + 83 - var12 - arg4.field1477 / 2 - 4);
        } else {
            arg4.method1660(arg0 + 94 + var11 - arg4.field1476 / 2 + 4, arg1 + 83 - var12 - arg4.field1477 / 2 - 4);
        }
    }

    @ObfuscatedName("co.cm(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1826(int arg0, String arg1, String arg2) {
        Statics.method3(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ea.cv(Ljava/lang/String;B)Z")
    public static boolean method2620(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method2661(arg0, Statics.field1836);
        for (int var2 = 0; var2 < field731; var2++) {
            if (var1.equalsIgnoreCase(class147.method2661(field542[var2].field357, Statics.field1836))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class147.method2661(Statics.field2035.field57, Statics.field1836))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("n.cz(Ljava/lang/String;I)Z")
    public static boolean method71(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method2661(arg0, Statics.field1836);
        for (int var2 = 0; var2 < field735; var2++) {
            class11 var3 = field736[var2];
            if (var1.equalsIgnoreCase(class147.method2661(var3.field195, Statics.field1836))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class147.method2661(var3.field190, Statics.field1836))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ds.db(Ljava/lang/String;I)V")
    public static final void method2176(String arg0) {
        if (!arg0.equals("")) {
            field518.method2258(145);
            field518.method2362(class126.method5(arg0));
            field518.method2366(arg0);
        }
    }

    @ObfuscatedName("df.dy(Lfn;I)I")
    public static int method2167(class157 arg0) {
        class170 var1 = (class170) field610.method3261(((long) arg0.field2579 << 32) + (long) arg0.field2580);
        return var1 == null ? arg0.field2638 : var1.field2793;
    }

    @ObfuscatedName("bv.dt(Lfn;I)Lfn;")
    public static class157 method1354(class157 arg0) {
        int var1 = method2167(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class157.method2079(arg0.field2600);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("v.df(Lfn;I)Z")
    public static boolean method42(class157 arg0) {
        if (field648) {
            if (method2167(arg0) != 0) {
                return false;
            }
            if (arg0.field2581 == 0) {
                return false;
            }
        }
        return arg0.field2577;
    }

    @ObfuscatedName("ec.ds(Lfn;IB)Ljava/lang/String;")
    public static String method2782(class157 arg0, int arg1) {
        if (!class161.method3105(method2167(arg0), arg1) && arg0.field2666 == null) {
            return null;
        } else if (arg0.field2640 == null || arg0.field2640.length <= arg1 || arg0.field2640[arg1] == null || arg0.field2640[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2640[arg1];
        }
    }
}

package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.k")
    public static boolean field459 = true;

    @ObfuscatedName("client.n")
    public static int field665 = 1;

    @ObfuscatedName("client.b")
    public static int field461 = 0;

    @ObfuscatedName("client.l")
    public static boolean field564 = false;

    @ObfuscatedName("client.i")
    public static boolean field463 = false;

    @ObfuscatedName("client.r")
    public static int field464 = 0;

    @ObfuscatedName("client.c")
    public static int field664 = 0;

    @ObfuscatedName("client.f")
    public static boolean field522 = true;

    @ObfuscatedName("client.a")
    public static int field691 = 0;

    @ObfuscatedName("client.t")
    public static long field560 = 1L;

    @ObfuscatedName("client.z")
    public static int field644 = -1;

    @ObfuscatedName("client.v")
    public static int field471 = -1;

    @ObfuscatedName("client.w")
    public static class164[] field518 = new class164[4];

    @ObfuscatedName("client.h")
    public static int field577 = -1;

    @ObfuscatedName("client.q")
    public static boolean field642 = true;

    @ObfuscatedName("client.g")
    public static boolean field474 = false;

    @ObfuscatedName("client.e")
    public static int field475 = 0;

    @ObfuscatedName("client.as")
    public static int field672 = 0;

    @ObfuscatedName("client.an")
    public static int field624 = 0;

    @ObfuscatedName("client.aj")
    public static int field469 = 0;

    @ObfuscatedName("client.ax")
    public static int field602 = 0;

    @ObfuscatedName("client.av")
    public static int field480 = 0;

    @ObfuscatedName("client.ae")
    public static int field605 = 0;

    @ObfuscatedName("client.am")
    public static int field482 = 0;

    @ObfuscatedName("client.aq")
    public static int field483 = 0;

    @ObfuscatedName("client.at")
    public static class127 field479 = new class127(new byte[5000]);

    @ObfuscatedName("client.ab")
    public static int field486 = 0;

    @ObfuscatedName("client.ah")
    public static int field615 = 0;

    @ObfuscatedName("client.au")
    public static int field489 = 0;

    @ObfuscatedName("client.bj")
    public static int field541 = 0;

    @ObfuscatedName("client.bw")
    public static int field506 = 0;

    @ObfuscatedName("client.bg")
    public static int field547 = 0;

    @ObfuscatedName("client.bx")
    public static int field494 = 0;

    @ObfuscatedName("client.bt")
    public static int field495 = 0;

    @ObfuscatedName("client.bs")
    public static class25[] field496 = new class25[32768];

    @ObfuscatedName("client.ba")
    public static int field497 = 0;

    @ObfuscatedName("client.bn")
    public static int[] field648 = new int[32768];

    @ObfuscatedName("client.co")
    public static class116 field509 = new class116(5000);

    @ObfuscatedName("client.cp")
    public static class116 field711 = new class116(5000);

    @ObfuscatedName("client.cs")
    public static class116 field708 = new class116(5000);

    @ObfuscatedName("client.cd")
    public static int field502 = 0;

    @ObfuscatedName("client.cb")
    public static int field503 = 0;

    @ObfuscatedName("client.cx")
    public static int field504 = 0;

    @ObfuscatedName("client.ca")
    public static int field704 = 0;

    @ObfuscatedName("client.cz")
    public static int field607 = 0;

    @ObfuscatedName("client.cj")
    public static int field610 = 0;

    @ObfuscatedName("client.cv")
    public static int field508 = 0;

    @ObfuscatedName("client.cm")
    public static int field493 = 0;

    @ObfuscatedName("client.cu")
    public static boolean field510 = false;

    @ObfuscatedName("client.cc")
    public static int field512 = 0;

    @ObfuscatedName("client.cq")
    public static int field513 = 0;

    @ObfuscatedName("client.cn")
    public static int field514 = 1;

    @ObfuscatedName("client.ck")
    public static int field515 = 0;

    @ObfuscatedName("client.cr")
    public static int field516 = 1;

    @ObfuscatedName("client.dq")
    public static int field517 = 0;

    @ObfuscatedName("client.da")
    public static boolean field519 = false;

    @ObfuscatedName("client.db")
    public static int[][][] field655 = new int[4][13][13];

    @ObfuscatedName("client.dm")
    public static final int[] field521 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dv")
    public static int field462 = 0;

    @ObfuscatedName("client.dn")
    public static int[][] field523 = new int[104][104];

    @ObfuscatedName("client.dg")
    public static int[][] field524 = new int[104][104];

    @ObfuscatedName("client.dk")
    public static int[] field525 = new int[4000];

    @ObfuscatedName("client.dj")
    public static int[] field526 = new int[4000];

    @ObfuscatedName("client.dh")
    public static int field527 = 0;

    @ObfuscatedName("client.df")
    public static int field528 = 2;

    @ObfuscatedName("client.de")
    public static int field529 = 0;

    @ObfuscatedName("client.dl")
    public static int field530 = 2;

    @ObfuscatedName("client.dp")
    public static int field467 = 0;

    @ObfuscatedName("client.du")
    public static int field532 = 1;

    @ObfuscatedName("client.dz")
    public static int field554 = 0;

    @ObfuscatedName("client.di")
    public static int field674 = 0;

    @ObfuscatedName("client.em")
    public static int field535 = 2;

    @ObfuscatedName("client.ej")
    public static int field536 = 0;

    @ObfuscatedName("client.es")
    public static int field537 = 1;

    @ObfuscatedName("client.ei")
    public static int field538 = 0;

    @ObfuscatedName("client.ef")
    public static int field539 = 0;

    @ObfuscatedName("client.ee")
    public static int field540 = 2301979;

    @ObfuscatedName("client.ev")
    public static int field727 = 5063219;

    @ObfuscatedName("client.ew")
    public static int field542 = 3353893;

    @ObfuscatedName("client.fl")
    public static int field543 = 7759444;

    @ObfuscatedName("client.fi")
    public static boolean field544 = false;

    @ObfuscatedName("client.fq")
    public static int field545 = 0;

    @ObfuscatedName("client.fc")
    public static int field546 = 128;

    @ObfuscatedName("client.fv")
    public static int field609 = 0;

    @ObfuscatedName("client.fy")
    public static int field548 = 0;

    @ObfuscatedName("client.fe")
    public static int field675 = 0;

    @ObfuscatedName("client.fm")
    public static int field550 = 0;

    @ObfuscatedName("client.fz")
    public static boolean field551 = false;

    @ObfuscatedName("client.fa")
    public static int field601 = 0;

    @ObfuscatedName("client.fn")
    public static int field553 = 0;

    @ObfuscatedName("client.fs")
    public static int field534 = 50;

    @ObfuscatedName("client.fr")
    public static int[] field555 = new int[field534];

    @ObfuscatedName("client.fg")
    public static int[] field583 = new int[field534];

    @ObfuscatedName("client.fo")
    public static int[] field557 = new int[field534];

    @ObfuscatedName("client.fk")
    public static int[] field558 = new int[field534];

    @ObfuscatedName("client.fj")
    public static int[] field559 = new int[field534];

    @ObfuscatedName("client.fp")
    public static int[] field657 = new int[field534];

    @ObfuscatedName("client.fd")
    public static int[] field561 = new int[field534];

    @ObfuscatedName("client.ge")
    public static String[] field562 = new String[field534];

    @ObfuscatedName("client.gg")
    public static int[][] field563 = new int[104][104];

    @ObfuscatedName("client.gj")
    public static int field690 = 0;

    @ObfuscatedName("client.gw")
    public static int field565 = -1;

    @ObfuscatedName("client.gd")
    public static int field566 = -1;

    @ObfuscatedName("client.gx")
    public static int field716 = 0;

    @ObfuscatedName("client.gi")
    public static int field568 = 0;

    @ObfuscatedName("client.gb")
    public static int field569 = 0;

    @ObfuscatedName("client.gs")
    public static int field570 = 0;

    @ObfuscatedName("client.gf")
    public static int field571 = 0;

    @ObfuscatedName("client.gh")
    public static int field572 = 0;

    @ObfuscatedName("client.gm")
    public static int field617 = 0;

    @ObfuscatedName("client.gr")
    public static int field574 = 0;

    @ObfuscatedName("client.gy")
    public static int field575 = 0;

    @ObfuscatedName("client.gn")
    public static int field576 = 0;

    @ObfuscatedName("client.gl")
    public static boolean field487 = false;

    @ObfuscatedName("client.gc")
    public static int field578 = 0;

    @ObfuscatedName("client.gv")
    public static int field579 = 0;

    @ObfuscatedName("client.ga")
    public static class3[] field580 = new class3[2048];

    @ObfuscatedName("client.gu")
    public static int field581 = 0;

    @ObfuscatedName("client.go")
    public static int[] field582 = new int[2048];

    @ObfuscatedName("client.hk")
    public static int field634 = 0;

    @ObfuscatedName("client.hd")
    public static int[] field584 = new int[2048];

    @ObfuscatedName("client.hs")
    public static class127[] field585 = new class127[2048];

    @ObfuscatedName("client.hy")
    public static int field586 = -1;

    @ObfuscatedName("client.hf")
    public static int field636 = 0;

    @ObfuscatedName("client.hx")
    public static int field588 = 0;

    @ObfuscatedName("client.hr")
    public static int[] field589 = new int[1000];

    @ObfuscatedName("client.hh")
    public static final int[] field590 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hn")
    public static String[] field473 = new String[8];

    @ObfuscatedName("client.hm")
    public static boolean[] field592 = new boolean[8];

    @ObfuscatedName("client.ha")
    public static int[] field593 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hv")
    public static class177[][][] field594 = new class177[4][104][104];

    @ObfuscatedName("client.hl")
    public static class177 field668 = new class177();

    @ObfuscatedName("client.he")
    public static class177 field596 = new class177();

    @ObfuscatedName("client.hi")
    public static class177 field597 = new class177();

    @ObfuscatedName("client.ht")
    public static int[] field598 = new int[25];

    @ObfuscatedName("client.hb")
    public static int[] field599 = new int[25];

    @ObfuscatedName("client.hu")
    public static int[] field600 = new int[25];

    @ObfuscatedName("client.hz")
    public static int field549 = 0;

    @ObfuscatedName("client.hw")
    public static boolean field694 = false;

    @ObfuscatedName("client.iu")
    public static int field719 = 0;

    @ObfuscatedName("client.ip")
    public static int[] field604 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field520 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field498 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field567 = new int[500];

    @ObfuscatedName("client.il")
    public static String[] field587 = new String[500];

    @ObfuscatedName("client.ib")
    public static String[] field488 = new String[500];

    @ObfuscatedName("client.id")
    public static int field591 = -1;

    @ObfuscatedName("client.ia")
    public static int field611 = -1;

    @ObfuscatedName("client.io")
    public static int field501 = 0;

    @ObfuscatedName("client.ik")
    public static int field614 = 50;

    @ObfuscatedName("client.ig")
    public static int field476 = 0;

    @ObfuscatedName("client.it")
    public static String field626 = null;

    @ObfuscatedName("client.iq")
    public static boolean field651 = false;

    @ObfuscatedName("client.ix")
    public static int field618 = -1;

    @ObfuscatedName("client.ih")
    public static String field619 = null;

    @ObfuscatedName("client.iv")
    public static String field620 = null;

    @ObfuscatedName("client.jq")
    public static int field621 = -1;

    @ObfuscatedName("client.jg")
    public static class175 field622 = new class175(8);

    @ObfuscatedName("client.jc")
    public static int field623 = 0;

    @ObfuscatedName("client.jn")
    public static int field670 = 0;

    @ObfuscatedName("client.jd")
    public static class158 field460 = null;

    @ObfuscatedName("client.je")
    public static int field685 = 0;

    @ObfuscatedName("client.jw")
    public static int field481 = 0;

    @ObfuscatedName("client.jv")
    public static int field628 = 0;

    @ObfuscatedName("client.jk")
    public static boolean field629 = false;

    @ObfuscatedName("client.jy")
    public static boolean field608 = false;

    @ObfuscatedName("client.jz")
    public static boolean field631 = false;

    @ObfuscatedName("client.jj")
    public static class158 field632 = null;

    @ObfuscatedName("client.ju")
    public static class158 field633 = null;

    @ObfuscatedName("client.jl")
    public static int field505 = 0;

    @ObfuscatedName("client.js")
    public static int field635 = 0;

    @ObfuscatedName("client.jb")
    public static class158 field630 = null;

    @ObfuscatedName("client.jt")
    public static boolean field637 = false;

    @ObfuscatedName("client.jp")
    public static int field638 = -1;

    @ObfuscatedName("client.jf")
    public static int field639 = -1;

    @ObfuscatedName("client.ji")
    public static boolean field647 = false;

    @ObfuscatedName("client.jm")
    public static int field641 = -1;

    @ObfuscatedName("client.jr")
    public static int field658 = -1;

    @ObfuscatedName("client.jh")
    public static boolean field627 = false;

    @ObfuscatedName("client.kl")
    public static int field646 = 1;

    @ObfuscatedName("client.ks")
    public static int[] field645 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field692 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field478 = new int[32];

    @ObfuscatedName("client.kt")
    public static int field533 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field649 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field650 = 0;

    @ObfuscatedName("client.kw")
    public static int field490 = 0;

    @ObfuscatedName("client.kg")
    public static int field652 = 0;

    @ObfuscatedName("client.ke")
    public static int field653 = 0;

    @ObfuscatedName("client.kh")
    public static int field654 = 0;

    @ObfuscatedName("client.ka")
    public static int[] field606 = new int[2000];

    @ObfuscatedName("client.kz")
    public static String[] field656 = new String[1000];

    @ObfuscatedName("client.kx")
    public static int field698 = 0;

    @ObfuscatedName("client.kp")
    public static class177 field457 = new class177();

    @ObfuscatedName("client.kf")
    public static class177 field659 = new class177();

    @ObfuscatedName("client.kk")
    public static class177 field660 = new class177();

    @ObfuscatedName("client.kj")
    public static class175 field661 = new class175(512);

    @ObfuscatedName("client.ku")
    public static int field662 = 0;

    @ObfuscatedName("client.ko")
    public static int field663 = -2;

    @ObfuscatedName("client.kn")
    public static boolean[] field507 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static boolean[] field468 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static boolean[] field666 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static int[] field667 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field531 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field669 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field484 = new int[100];

    @ObfuscatedName("client.lg")
    public static int field671 = 0;

    @ObfuscatedName("client.lb")
    public static int[] field500 = new int[100];

    @ObfuscatedName("client.lo")
    public static String[] field673 = new String[100];

    @ObfuscatedName("client.li")
    public static String[] field695 = new String[100];

    @ObfuscatedName("client.lf")
    public static String[] field472 = new String[100];

    @ObfuscatedName("client.ly")
    public static int field676 = 0;

    @ObfuscatedName("client.ln")
    public static int[] field677 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ls")
    public static int field678 = 0;

    @ObfuscatedName("client.ld")
    public static int field679 = 0;

    @ObfuscatedName("client.lm")
    public static long[] field717 = new long[100];

    @ObfuscatedName("client.la")
    public static int field681 = 0;

    @ObfuscatedName("client.lw")
    public static int field682 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field683 = new int[128];

    @ObfuscatedName("client.lp")
    public static int[] field684 = new int[128];

    @ObfuscatedName("client.lu")
    public static long field466 = -1L;

    @ObfuscatedName("client.lr")
    public static String field686 = null;

    @ObfuscatedName("client.mw")
    public static String field687 = null;

    @ObfuscatedName("client.my")
    public static int field688 = -1;

    @ObfuscatedName("client.mu")
    public static int field689 = 0;

    @ObfuscatedName("client.mz")
    public static int[] field595 = new int[1000];

    @ObfuscatedName("client.mg")
    public static int[] field477 = new int[1000];

    @ObfuscatedName("client.mv")
    public static class86[] field499 = new class86[1000];

    @ObfuscatedName("client.ma")
    public static int field693 = 0;

    @ObfuscatedName("client.mq")
    public static int field491 = 0;

    @ObfuscatedName("client.mh")
    public static int field724 = 0;

    @ObfuscatedName("client.me")
    public static int field696 = 255;

    @ObfuscatedName("client.mo")
    public static int field697 = -1;

    @ObfuscatedName("client.md")
    public static boolean field680 = false;

    @ObfuscatedName("client.mj")
    public static int field699 = 127;

    @ObfuscatedName("client.ml")
    public static int field625 = 127;

    @ObfuscatedName("client.ny")
    public static int field701 = 0;

    @ObfuscatedName("client.nx")
    public static int[] field702 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field640 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field613 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field705 = new int[50];

    @ObfuscatedName("client.nr")
    public static class57[] field706 = new class57[50];

    @ObfuscatedName("client.nu")
    public static boolean field707 = false;

    @ObfuscatedName("client.nh")
    public static boolean[] field492 = new boolean[5];

    @ObfuscatedName("client.nb")
    public static int[] field709 = new int[5];

    @ObfuscatedName("client.ne")
    public static int[] field710 = new int[5];

    @ObfuscatedName("client.nf")
    public static int[] field643 = new int[5];

    @ObfuscatedName("client.os")
    public static int[] field712 = new int[5];

    @ObfuscatedName("client.ol")
    public static int field703 = 0;

    @ObfuscatedName("client.od")
    public static int field714 = 0;

    @ObfuscatedName("client.oo")
    public static class23[] field715 = new class23[200];

    @ObfuscatedName("client.oq")
    public static class173 field713 = new class173();

    @ObfuscatedName("client.ob")
    public static int field470 = 0;

    @ObfuscatedName("client.or")
    public static class11[] field718 = new class11[100];

    @ObfuscatedName("client.oe")
    public static class163 field616 = new class163();

    @ObfuscatedName("client.oj")
    public static int field720 = -1;

    @ObfuscatedName("client.ox")
    public static int field721 = -1;

    @ObfuscatedName("client.k(I)V")
    public final void method237() {
    }

    public final void init() {
        if (!this.method1428()) {
            return;
        }
        class167[] var1 = new class167[] { class167.field2781, class167.field2788, class167.field2790, class167.field2791, class167.field2786, class167.field2785, class167.field2789, class167.field2782, class167.field2783 };
        class167[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class167 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2787);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2787)) {
                    case 1:
                        field665 = Integer.parseInt(var5);
                        break;
                    case 2:
                        field461 = Integer.parseInt(var5);
                    case 3:
                    default:
                        break;
                    case 4:
                        class133[] var6 = new class133[] { class133.field2072, class133.field2068, class133.field2070, class133.field2071, class133.field2076, class133.field2069 };
                        int var8 = Integer.parseInt(var5);
                        class133[] var9 = var6;
                        int var10 = 0;
                        class133 var12;
                        while (true) {
                            if (var10 >= var9.length) {
                                var12 = null;
                                break;
                            }
                            class133 var11 = var9[var10];
                            if (var8 == var11.method2372()) {
                                var12 = var11;
                                break;
                            }
                            var10++;
                        }
                        Statics.field2396 = (class133) var12;
                        if (Statics.field2396 == class133.field2068) {
                            Statics.field1304 = class186.field2860;
                        } else {
                            Statics.field1304 = class186.field2858;
                        }
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class2.field18)) {
                        }
                        break;
                    case 6:
                        field464 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field465 = var5;
                        break;
                    case 8:
                        int var13 = Integer.parseInt(var5);
                        class132[] var14 = new class132[] { class132.field2062, class132.field2060, class132.field2067, class132.field2061 };
                        class132[] var15 = var14;
                        int var16 = 0;
                        class132 var18;
                        while (true) {
                            if (var16 >= var15.length) {
                                var18 = null;
                                break;
                            }
                            class132 var17 = var15[var16];
                            if (var17.field2065 == var13) {
                                var18 = var17;
                                break;
                            }
                            var16++;
                        }
                        Statics.field1998 = var18;
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class2.field18)) {
                            field564 = true;
                        } else {
                            field564 = false;
                        }
                }
            }
        }
        method1325();
        Statics.field20 = this.getCodeBase().getHost();
        String var19 = Statics.field1998.field2063;
        byte var20 = 0;
        try {
            class82.method122("oldschool", var19, var20, 16);
        } catch (Exception var22) {
            class80.method210((String) null, var22);
        }
        Statics.field458 = this;
        this.method1426(765, 503, 16);
    }

    @ObfuscatedName("bg.s(I)V")
    public static final void method1325() {
        class95.field1573 = false;
        field463 = false;
    }

    @ObfuscatedName("client.x(I)V")
    public final void method263() {
        Statics.field218 = field461 == 0 ? 43594 : field665 + 40000;
        Statics.field263 = field461 == 0 ? 443 : field665 + 50000;
        Statics.field2314 = Statics.field218;
        Statics.field2734 = class161.field2722;
        Statics.field2566 = class161.field2716;
        Statics.field2735 = class161.field2718;
        Statics.field2738 = class161.field2717;
        if (Statics.field1339.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1354[44] = 71;
            class75.field1354[45] = 26;
            class75.field1354[46] = 72;
            class75.field1354[47] = 73;
            class75.field1354[59] = 57;
            class75.field1354[61] = 27;
            class75.field1354[91] = 42;
            class75.field1354[92] = 74;
            class75.field1354[93] = 43;
            class75.field1354[192] = 28;
            class75.field1354[222] = 58;
            class75.field1354[520] = 59;
        } else {
            class75.field1354[186] = 57;
            class75.field1354[187] = 27;
            class75.field1354[188] = 71;
            class75.field1354[189] = 26;
            class75.field1354[190] = 72;
            class75.field1354[191] = 73;
            class75.field1354[192] = 58;
            class75.field1354[219] = 42;
            class75.field1354[220] = 74;
            class75.field1354[221] = 43;
            class75.field1354[222] = 59;
            class75.field1354[223] = 28;
        }
        class75.method766(Statics.field850);
        class77.method1680(Statics.field850);
        class78 var1;
        try {
            var1 = new class78();
        } catch (Throwable var3) {
            var1 = null;
        }
        Statics.field1449 = var1;
        if (Statics.field1449 != null) {
            Statics.field1449.method1353(Statics.field850);
        }
        Statics.field739 = new class71(255, class82.field1420, class82.field1429, 500000);
        Statics.field277 = class12.method161();
        if (field461 != 0) {
            field474 = true;
        }
    }

    @ObfuscatedName("client.b(B)V")
    public final void method245() {
        field691++;
        this.method385();
        while (true) {
            class177 var1 = class157.field2574;
            class156 var2;
            synchronized (class157.field2574) {
                var2 = (class156) class157.field2572.method3353();
            }
            if (var2 == null) {
                try {
                    if (class138.field2335 == 1) {
                        int var4 = Statics.field2330.method2840();
                        if (var4 > 0 && Statics.field2330.method2772()) {
                            int var5 = var4 - Statics.field2333;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2330.method2742(var5);
                        } else {
                            Statics.field2330.method2822();
                            Statics.field2330.method2746();
                            if (Statics.field1193 == null) {
                                class138.field2335 = 0;
                            } else {
                                class138.field2335 = 2;
                            }
                            Statics.field2078 = null;
                            Statics.field1741 = null;
                        }
                    }
                } catch (Exception var151) {
                    var151.printStackTrace();
                    Statics.field2330.method2822();
                    class138.field2335 = 0;
                    Statics.field2078 = null;
                    Statics.field1741 = null;
                    Statics.field1193 = null;
                }
                method2440();
                class75.method132();
                class77 var7 = class77.field1392;
                synchronized (class77.field1392) {
                    class77.field1391 = class77.field1388;
                    class77.field1401 = class77.field1397;
                    class77.field1393 = class77.field1390;
                    class77.field1402 = class77.field1394;
                    class77.field1399 = class77.field1395;
                    class77.field1400 = class77.field1396;
                    class77.field1386 = class77.field1403;
                    class77.field1394 = 0;
                }
                if (Statics.field1449 != null) {
                    int var9 = Statics.field1449.method1355();
                    field698 = var9;
                }
                if (field664 == 0) {
                    method1287();
                    Statics.field729.method1346();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field1322[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field1319[var11] = 0L;
                    }
                    Statics.field1294 = 0;
                } else if (field664 == 5) {
                    class21.method11(this);
                    method1287();
                    Statics.method2388();
                } else if (field664 == 10) {
                    class21.method11(this);
                } else if (field664 == 20) {
                    class21.method11(this);
                    method2358();
                } else if (field664 == 25) {
                    method181(false);
                    field513 = 0;
                    boolean var12 = true;
                    for (int var13 = 0; var13 < Statics.field959.length; var13++) {
                        if (Statics.field2014[var13] != -1 && Statics.field959[var13] == null) {
                            Statics.field959[var13] = Statics.field1454.method2991(Statics.field2014[var13], 0);
                            if (Statics.field959[var13] == null) {
                                var12 = false;
                                field513++;
                            }
                        }
                        if (Statics.field347[var13] != -1 && Statics.field1259[var13] == null) {
                            Statics.field1259[var13] = Statics.field1454.method3042(Statics.field347[var13], 0, Statics.field1194[var13]);
                            if (Statics.field1259[var13] == null) {
                                var12 = false;
                                field513++;
                            }
                        }
                    }
                    if (var12) {
                        field515 = 0;
                        boolean var14 = true;
                        for (int var15 = 0; var15 < Statics.field959.length; var15++) {
                            byte[] var16 = Statics.field1259[var15];
                            if (var16 != null) {
                                int var17 = (Statics.field198[var15] >> 8) * 64 - Statics.field47;
                                int var18 = (Statics.field198[var15] & 0xFF) * 64 - Statics.field196;
                                if (field519) {
                                    var17 = 10;
                                    var18 = 10;
                                }
                                boolean var20 = true;
                                class127 var21 = new class127(var16);
                                int var22 = -1;
                                label633: while (true) {
                                    int var23 = var21.method2637();
                                    if (var23 == 0) {
                                        var14 &= var20;
                                        break;
                                    }
                                    var22 += var23;
                                    int var24 = 0;
                                    boolean var25 = false;
                                    while (true) {
                                        while (!var25) {
                                            int var27 = var21.method2637();
                                            if (var27 == 0) {
                                                continue label633;
                                            }
                                            var24 += var27 - 1;
                                            int var28 = var24 & 0x3F;
                                            int var29 = var24 >> 6 & 0x3F;
                                            int var30 = var21.method2534() >> 2;
                                            int var31 = var17 + var29;
                                            int var32 = var18 + var28;
                                            if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                                                class32 var33 = class32.method211(var22);
                                                if (var30 != 22 || !field463 || var33.field815 != 0 || var33.field831 == 1 || var33.field835) {
                                                    if (!var33.method637()) {
                                                        field515++;
                                                        var20 = false;
                                                    }
                                                    var25 = true;
                                                }
                                            }
                                        }
                                        int var26 = var21.method2637();
                                        if (var26 == 0) {
                                            break;
                                        }
                                        var21.method2534();
                                    }
                                }
                            }
                        }
                        if (var14) {
                            if (field517 != 0) {
                                method1640(class134.field2133 + class2.field14 + class2.field17 + 100 + "%" + class2.field23, true);
                            }
                            method2440();
                            method124();
                            method2440();
                            Statics.field112.method1883();
                            method2440();
                            System.gc();
                            for (int var35 = 0; var35 < 4; var35++) {
                                field518[var35].method3238();
                            }
                            for (int var36 = 0; var36 < 4; var36++) {
                                for (int var37 = 0; var37 < 104; var37++) {
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        class9.field133[var36][var37][var38] = 0;
                                    }
                                }
                            }
                            method2440();
                            class9.method2702();
                            int var39 = Statics.field959.length;
                            class7.method38();
                            method181(true);
                            if (!field519) {
                                int var40 = 0;
                                label571: while (true) {
                                    if (var40 >= var39) {
                                        for (int var54 = 0; var54 < var39; var54++) {
                                            int var55 = (Statics.field198[var54] >> 8) * 64 - Statics.field47;
                                            int var56 = (Statics.field198[var54] & 0xFF) * 64 - Statics.field196;
                                            byte[] var57 = Statics.field959[var54];
                                            if (var57 == null && Statics.field2027 < 800) {
                                                method2440();
                                                class9.method119(var55, var56, 64, 64);
                                            }
                                        }
                                        method181(true);
                                        int var58 = 0;
                                        while (true) {
                                            if (var58 >= var39) {
                                                break label571;
                                            }
                                            byte[] var59 = Statics.field1259[var58];
                                            if (var59 != null) {
                                                int var60 = (Statics.field198[var58] >> 8) * 64 - Statics.field47;
                                                int var61 = (Statics.field198[var58] & 0xFF) * 64 - Statics.field196;
                                                method2440();
                                                class9.method17(var59, var60, var61, Statics.field112, field518);
                                            }
                                            var58++;
                                        }
                                    }
                                    int var41 = (Statics.field198[var40] >> 8) * 64 - Statics.field47;
                                    int var42 = (Statics.field198[var40] & 0xFF) * 64 - Statics.field196;
                                    byte[] var43 = Statics.field959[var40];
                                    if (var43 != null) {
                                        method2440();
                                        int var44 = Statics.field860 * 8 - 48;
                                        int var45 = Statics.field2027 * 8 - 48;
                                        class164[] var46 = field518;
                                        int var47 = 0;
                                        label568: while (true) {
                                            if (var47 >= 4) {
                                                class127 var50 = new class127(var43);
                                                int var51 = 0;
                                                while (true) {
                                                    if (var51 >= 4) {
                                                        break label568;
                                                    }
                                                    for (int var52 = 0; var52 < 64; var52++) {
                                                        for (int var53 = 0; var53 < 64; var53++) {
                                                            Statics.method201(var50, var51, var41 + var52, var42 + var53, var44, var45, 0);
                                                        }
                                                    }
                                                    var51++;
                                                }
                                            }
                                            for (int var48 = 0; var48 < 64; var48++) {
                                                for (int var49 = 0; var49 < 64; var49++) {
                                                    if (var41 + var48 > 0 && var41 + var48 < 103 && var42 + var49 > 0 && var42 + var49 < 103) {
                                                        var46[var47].field2751[var41 + var48][var42 + var49] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var47++;
                                        }
                                    }
                                    var40++;
                                }
                            }
                            if (field519) {
                                int var62 = 0;
                                label517: while (true) {
                                    if (var62 >= 4) {
                                        for (int var85 = 0; var85 < 13; var85++) {
                                            for (int var86 = 0; var86 < 13; var86++) {
                                                int var87 = field655[0][var85][var86];
                                                if (var87 == -1) {
                                                    class9.method119(var85 * 8, var86 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method181(true);
                                        int var88 = 0;
                                        while (true) {
                                            if (var88 >= 4) {
                                                break label517;
                                            }
                                            method2440();
                                            for (int var89 = 0; var89 < 13; var89++) {
                                                label440: for (int var90 = 0; var90 < 13; var90++) {
                                                    int var91 = field655[var88][var89][var90];
                                                    if (var91 != -1) {
                                                        int var92 = var91 >> 24 & 0x3;
                                                        int var93 = var91 >> 1 & 0x3;
                                                        int var94 = var91 >> 14 & 0x3FF;
                                                        int var95 = var91 >> 3 & 0x7FF;
                                                        int var96 = (var94 / 8 << 8) + var95 / 8;
                                                        for (int var97 = 0; var97 < Statics.field198.length; var97++) {
                                                            if (Statics.field198[var97] == var96 && Statics.field1259[var97] != null) {
                                                                byte[] var98 = Statics.field1259[var97];
                                                                int var99 = var89 * 8;
                                                                int var100 = var90 * 8;
                                                                int var101 = (var94 & 0x7) * 8;
                                                                int var102 = (var95 & 0x7) * 8;
                                                                class95 var103 = Statics.field112;
                                                                class164[] var104 = field518;
                                                                class127 var105 = new class127(var98);
                                                                int var106 = -1;
                                                                while (true) {
                                                                    int var107 = var105.method2637();
                                                                    if (var107 == 0) {
                                                                        continue label440;
                                                                    }
                                                                    var106 += var107;
                                                                    int var108 = 0;
                                                                    while (true) {
                                                                        int var109 = var105.method2637();
                                                                        if (var109 == 0) {
                                                                            break;
                                                                        }
                                                                        var108 += var109 - 1;
                                                                        int var110 = var108 & 0x3F;
                                                                        int var111 = var108 >> 6 & 0x3F;
                                                                        int var112 = var108 >> 12;
                                                                        int var113 = var105.method2534();
                                                                        int var114 = var113 >> 2;
                                                                        int var115 = var113 & 0x3;
                                                                        if (var92 == var112 && var111 >= var101 && var111 < var101 + 8 && var110 >= var102 && var110 < var102 + 8) {
                                                                            class32 var116 = class32.method211(var106);
                                                                            int var118 = var111 & 0x7;
                                                                            int var119 = var110 & 0x7;
                                                                            int var121 = var116.field811;
                                                                            int var122 = var116.field812;
                                                                            if ((var115 & 0x1) == 1) {
                                                                                int var123 = var121;
                                                                                var121 = var122;
                                                                                var122 = var123;
                                                                            }
                                                                            int var124 = var93 & 0x3;
                                                                            int var125;
                                                                            if (var124 == 0) {
                                                                                var125 = var118;
                                                                            } else if (var124 == 1) {
                                                                                var125 = var119;
                                                                            } else if (var124 == 2) {
                                                                                var125 = 7 - var118 - (var121 - 1);
                                                                            } else {
                                                                                var125 = 7 - var119 - (var122 - 1);
                                                                            }
                                                                            int var126 = var99 + var125;
                                                                            int var128 = var111 & 0x7;
                                                                            int var129 = var110 & 0x7;
                                                                            int var131 = var116.field811;
                                                                            int var132 = var116.field812;
                                                                            if ((var115 & 0x1) == 1) {
                                                                                int var133 = var131;
                                                                                var131 = var132;
                                                                                var132 = var133;
                                                                            }
                                                                            int var134 = var93 & 0x3;
                                                                            int var135;
                                                                            if (var134 == 0) {
                                                                                var135 = var129;
                                                                            } else if (var134 == 1) {
                                                                                var135 = 7 - var128 - (var131 - 1);
                                                                            } else if (var134 == 2) {
                                                                                var135 = 7 - var129 - (var132 - 1);
                                                                            } else {
                                                                                var135 = var128;
                                                                            }
                                                                            int var136 = var100 + var135;
                                                                            if (var126 > 0 && var136 > 0 && var126 < 103 && var136 < 103) {
                                                                                int var137 = var88;
                                                                                if ((class9.field133[1][var126][var136] & 0x2) == 2) {
                                                                                    var137 = var88 - 1;
                                                                                }
                                                                                class164 var138 = null;
                                                                                if (var137 >= 0) {
                                                                                    var138 = var104[var137];
                                                                                }
                                                                                class9.method512(var88, var126, var136, var106, var93 + var115 & 0x3, var114, var103, var138);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var88++;
                                        }
                                    }
                                    method2440();
                                    for (int var63 = 0; var63 < 13; var63++) {
                                        for (int var64 = 0; var64 < 13; var64++) {
                                            boolean var65 = false;
                                            int var66 = field655[var62][var63][var64];
                                            if (var66 != -1) {
                                                int var67 = var66 >> 24 & 0x3;
                                                int var68 = var66 >> 1 & 0x3;
                                                int var69 = var66 >> 14 & 0x3FF;
                                                int var70 = var66 >> 3 & 0x7FF;
                                                int var71 = (var69 / 8 << 8) + var70 / 8;
                                                for (int var72 = 0; var72 < Statics.field198.length; var72++) {
                                                    if (Statics.field198[var72] == var71 && Statics.field959[var72] != null) {
                                                        byte[] var73 = Statics.field959[var72];
                                                        int var74 = var63 * 8;
                                                        int var75 = var64 * 8;
                                                        int var76 = (var69 & 0x7) * 8;
                                                        int var77 = (var70 & 0x7) * 8;
                                                        class164[] var78 = field518;
                                                        for (int var79 = 0; var79 < 8; var79++) {
                                                            for (int var80 = 0; var80 < 8; var80++) {
                                                                if (var74 + var79 > 0 && var74 + var79 < 103 && var75 + var80 > 0 && var75 + var80 < 103) {
                                                                    var78[var62].field2751[var74 + var79][var75 + var80] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class127 var81 = new class127(var73);
                                                        for (int var82 = 0; var82 < 4; var82++) {
                                                            for (int var83 = 0; var83 < 64; var83++) {
                                                                for (int var84 = 0; var84 < 64; var84++) {
                                                                    if (var67 == var82 && var83 >= var76 && var83 < var76 + 8 && var84 >= var77 && var84 < var77 + 8) {
                                                                        Statics.method201(var81, var62, var74 + class160.method32(var83 & 0x7, var84 & 0x7, var68), var75 + class160.method1367(var83 & 0x7, var84 & 0x7, var68), 0, 0, var68);
                                                                    } else {
                                                                        Statics.method201(var81, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var65 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var65) {
                                                class9.method691(var62, var63 * 8, var64 * 8);
                                            }
                                        }
                                    }
                                    var62++;
                                }
                            }
                            method181(true);
                            method124();
                            method2440();
                            class9.method148(Statics.field112, field518);
                            method181(true);
                            int var139 = class9.field122;
                            if (var139 > Statics.field68) {
                                var139 = Statics.field68;
                            }
                            if (var139 < Statics.field68 - 1) {
                                int var140 = Statics.field68 - 1;
                            }
                            if (field463) {
                                Statics.field112.method1884(class9.field122);
                            } else {
                                Statics.field112.method1884(0);
                            }
                            for (int var141 = 0; var141 < 104; var141++) {
                                for (int var142 = 0; var142 < 104; var142++) {
                                    method7(var141, var142);
                                }
                            }
                            method2440();
                            method2057();
                            class32.field799.method3297();
                            if (Statics.field1809 != null) {
                                field509.method2337(133);
                                field509.method2563(1057001181);
                            }
                            if (!field519) {
                                int var143 = (Statics.field860 - 6) / 8;
                                int var144 = (Statics.field860 + 6) / 8;
                                int var145 = (Statics.field2027 - 6) / 8;
                                int var146 = (Statics.field2027 + 6) / 8;
                                for (int var147 = var143 - 1; var147 <= var144 + 1; var147++) {
                                    for (int var148 = var145 - 1; var148 <= var146 + 1; var148++) {
                                        if (var147 < var143 || var147 > var144 || var148 < var145 || var148 > var146) {
                                            Statics.field1454.method3010("m" + var147 + "_" + var148);
                                            Statics.field1454.method3010("l" + var147 + "_" + var148);
                                        }
                                    }
                                }
                            }
                            method125(30);
                            method2440();
                            Statics.field123 = (byte[][][]) null;
                            Statics.field124 = (byte[][][]) null;
                            Statics.field130 = (byte[][][]) null;
                            Statics.field139 = (byte[][][]) null;
                            Statics.field1822 = (int[][][]) null;
                            Statics.field127 = (byte[][][]) null;
                            Statics.field109 = (int[][]) null;
                            Statics.field128 = null;
                            Statics.field129 = null;
                            Statics.field2784 = null;
                            Statics.field259 = null;
                            Statics.field2029 = null;
                            field509.method2337(4);
                            Statics.method2388();
                        } else {
                            field517 = 2;
                        }
                    } else {
                        field517 = 1;
                    }
                }
                if (field664 == 30) {
                    method592();
                } else if (field664 == 40) {
                    method2358();
                }
                return;
            }
            var2.field2564.method3096(var2.field2563, (int) var2.field2819, var2.field2565, false);
        }
    }

    @ObfuscatedName("client.j(I)V")
    public final void method350() {
        boolean var1;
        label123: {
            try {
                if (class138.field2335 == 2) {
                    if (Statics.field2078 == null) {
                        Statics.field2078 = class139.method2724(Statics.field1193, Statics.field2332, Statics.field1507);
                        if (Statics.field2078 == null) {
                            var1 = false;
                            break label123;
                        }
                    }
                    if (Statics.field1741 == null) {
                        Statics.field1741 = new class58(Statics.field186, Statics.field2331);
                    }
                    if (Statics.field2330.method2761(Statics.field2078, Statics.field2329, Statics.field1741, 22050)) {
                        Statics.field2330.method2775();
                        Statics.field2330.method2742(Statics.field2047);
                        Statics.field2330.method2820(Statics.field2078, Statics.field273);
                        class138.field2335 = 0;
                        Statics.field2078 = null;
                        Statics.field1741 = null;
                        Statics.field1193 = null;
                        var1 = true;
                        break label123;
                    }
                }
            } catch (Exception var16) {
                var16.printStackTrace();
                Statics.field2330.method2822();
                class138.field2335 = 0;
                Statics.field2078 = null;
                Statics.field1741 = null;
                Statics.field1193 = null;
            }
            var1 = false;
        }
        if (var1 && field680 && Statics.field1512 != null) {
            Statics.field1512.method1190();
        }
        if (field1314) {
            Canvas var4 = Statics.field850;
            var4.removeKeyListener(class75.field1367);
            var4.removeFocusListener(class75.field1367);
            class75.field1366 = -1;
            Canvas var5 = Statics.field850;
            var5.removeMouseListener(class77.field1392);
            var5.removeMouseMotionListener(class77.field1392);
            var5.removeFocusListener(class77.field1392);
            class77.field1388 = 0;
            if (Statics.field1449 != null) {
                Statics.field1449.method1354(Statics.field850);
            }
            this.method1427();
            class75.method766(Statics.field850);
            class77.method1680(Statics.field850);
            if (Statics.field1449 != null) {
                Statics.field1449.method1353(Statics.field850);
            }
        }
        if (field664 == 0) {
            class73.method127(class21.field314, class21.field315, (Color) null);
        } else if (field664 == 5) {
            class21.method40(Statics.field272, Statics.field511);
        } else if (field664 == 10) {
            class21.method40(Statics.field272, Statics.field511);
        } else if (field664 == 20) {
            class21.method40(Statics.field272, Statics.field511);
        } else if (field664 == 25) {
            if (field517 == 1) {
                if (field513 > field514) {
                    field514 = field513;
                }
                int var6 = (field514 * 50 - field513 * 50) / field514;
                method1640(class134.field2133 + class2.field14 + class2.field17 + var6 + "%" + class2.field23, false);
            } else if (field517 == 2) {
                if (field515 > field516) {
                    field516 = field515;
                }
                int var7 = (field516 * 50 - field515 * 50) / field516 + 50;
                method1640(class134.field2133 + class2.field14 + class2.field17 + var7 + "%" + class2.field23, false);
            } else {
                method1640(class134.field2133, false);
            }
        } else if (field664 == 30) {
            method52();
        } else if (field664 == 40) {
            method1640(class134.field2088 + class2.field14 + class134.field2089, false);
        }
        if (field664 == 30 && field671 == 0 && !field1320) {
            try {
                Graphics var8 = Statics.field850.getGraphics();
                for (int var9 = 0; var9 < field662; var9++) {
                    if (field468[var9]) {
                        Statics.field1301.method1602(var8, field667[var9], field531[var9], field669[var9], field484[var9]);
                        field468[var9] = false;
                    }
                }
            } catch (Exception var15) {
                Statics.field850.repaint();
            }
        } else if (field664 > 0) {
            try {
                Graphics var11 = Statics.field850.getGraphics();
                Statics.field1301.method1601(var11, 0, 0);
                field1320 = false;
                for (int var12 = 0; var12 < field662; var12++) {
                    field468[var12] = false;
                }
            } catch (Exception var14) {
                Statics.field850.repaint();
            }
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method329() {
        if (Statics.field1781 != null) {
            Statics.field1781.field251 = false;
        }
        Statics.field1781 = null;
        if (Statics.field266 != null) {
            Statics.field266.method1391();
            Statics.field266 = null;
        }
        if (class75.field1367 != null) {
            class75 var1 = class75.field1367;
            synchronized (class75.field1367) {
                class75.field1367 = null;
            }
        }
        class77.method826();
        Statics.field1449 = null;
        if (Statics.field1512 != null) {
            Statics.field1512.method1171();
        }
        if (Statics.field2031 != null) {
            Statics.field2031.method1171();
        }
        class153.method2964();
        class157.method2965();
        class82.method894();
    }

    @ObfuscatedName("o.l(II)V")
    public static void method125(int arg0) {
        if (field664 == arg0) {
            return;
        }
        if (field664 == 0) {
            class73.method1366();
        }
        if (arg0 == 20 || arg0 == 40) {
            field506 = 0;
            field547 = 0;
            field494 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2318 != null) {
            Statics.field2318.method1391();
            Statics.field2318 = null;
        }
        if (field664 == 25) {
            field517 = 0;
            field513 = 0;
            field514 = 1;
            field515 = 0;
            field516 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field850;
            class154 var2 = Statics.field2325;
            class154 var3 = Statics.field297;
            if (!Statics.field324) {
                class89.method1799();
                byte[] var4 = var2.method3008("title.jpg", "");
                Statics.field328 = new class86(var4, var1);
                Statics.field2834 = Statics.field328.method1684();
                Statics.field2005 = class84.method194(var3, "logo", "");
                Statics.field301 = class84.method194(var3, "titlebox", "");
                Statics.field299 = class84.method194(var3, "titlebutton", "");
                Statics.field300 = Statics.method1516(var3, "runes", "");
                Statics.field86 = Statics.method1516(var3, "title_mute", "");
                Statics.field1417 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field1417[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field1417[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field1417[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field1417[var8 + 192] = 16777215;
                }
                Statics.field333 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field333[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field333[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field333[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field333[var12 + 192] = 16777215;
                }
                Statics.field306 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field306[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field306[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field306[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field306[var16 + 192] = 16777215;
                }
                Statics.field304 = new int[256];
                Statics.field2349 = new int[32768];
                Statics.field309 = new int[32768];
                class21.method1246((class87) null);
                Statics.field1509 = new int[32768];
                Statics.field1997 = new int[32768];
                class21.field316 = 0;
                class21.field326 = "";
                class21.field334 = "";
                class21.field321 = false;
                if (field696 == 0) {
                    class21.field302 = true;
                } else {
                    class21.field302 = false;
                }
                if (class21.field302) {
                    class138.method2704(2);
                } else {
                    class154 var17 = Statics.field205;
                    int var18 = var17.method3022("scape main");
                    int var19 = var17.method3007(var18, "");
                    class138.field2335 = 1;
                    Statics.field1193 = var17;
                    Statics.field2332 = var18;
                    Statics.field1507 = var19;
                    Statics.field2047 = 255;
                    Statics.field273 = false;
                    Statics.field2333 = 2;
                }
                class153.method2962(false);
                Statics.field324 = true;
                Statics.field328.method1693(0, 0);
                Statics.field2834.method1693(382, 0);
                Statics.field2005.method1783(382 - Statics.field2005.field1473 / 2, 18);
            }
        } else if (Statics.field324) {
            Statics.field301 = null;
            Statics.field299 = null;
            Statics.field300 = null;
            Statics.field328 = null;
            Statics.field2834 = null;
            Statics.field2005 = null;
            Statics.field86 = null;
            Statics.field325 = null;
            Statics.field1618 = null;
            Statics.field59 = null;
            Statics.field110 = null;
            Statics.field2380 = null;
            Statics.field1417 = null;
            Statics.field333 = null;
            Statics.field306 = null;
            Statics.field304 = null;
            Statics.field2349 = null;
            Statics.field309 = null;
            Statics.field1509 = null;
            Statics.field1997 = null;
            class138.method2704(2);
            class153.method2962(true);
            Statics.field324 = false;
        }
        field664 = arg0;
    }

    @ObfuscatedName("client.i(I)V")
    public void method385() {
        if (field664 == 1000) {
            return;
        }
        long var1 = class121.method1389();
        int var3 = (int) (var1 - Statics.field2524);
        Statics.field2524 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class153.field2529 += var3;
        boolean var4;
        if (class153.field2533 == 0 && class153.field2525 == 0 && class153.field2530 == 0 && class153.field2526 == 0) {
            var4 = true;
        } else if (Statics.field2528 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class153.field2529 > 30000) {
                        throw new IOException();
                    }
                    while (class153.field2525 < 20 && class153.field2526 > 0) {
                        class155 var5 = (class155) class153.field2536.method3335();
                        class127 var6 = new class127(4);
                        var6.method2444(1);
                        var6.method2446((int) var5.field2819);
                        Statics.field2528.method1383(var6.field2037, 0, 4);
                        class153.field2527.method3334(var5, var5.field2819);
                        class153.field2526--;
                        class153.field2525++;
                    }
                    while (class153.field2533 < 20 && class153.field2530 > 0) {
                        class155 var7 = (class155) class153.field2522.method3304();
                        class127 var8 = new class127(4);
                        var8.method2444(0);
                        var8.method2446((int) var7.field2819);
                        Statics.field2528.method1383(var8.field2037, 0, 4);
                        var7.method3327();
                        class153.field2531.method3334(var7, var7.field2819);
                        class153.field2530--;
                        class153.field2533++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2528.method1381();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class153.field2529 = 0;
                        byte var11 = 0;
                        if (Statics.field2535 == null) {
                            var11 = 8;
                        } else if (class153.field2538 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class153.field2540.field2036;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2528.method1385(class153.field2540.field2037, class153.field2540.field2036, var12);
                            if (class153.field2541 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class153.field2540.field2037[class153.field2540.field2036 + var13] ^= class153.field2541;
                                }
                            }
                            class153.field2540.field2036 += var12;
                            if (class153.field2540.field2036 < var11) {
                                break;
                            }
                            if (Statics.field2535 == null) {
                                class153.field2540.field2036 = 0;
                                int var14 = class153.field2540.method2534();
                                int var15 = class153.field2540.method2460();
                                int var16 = class153.field2540.method2534();
                                int var17 = class153.field2540.method2628();
                                long var18 = (long) ((var14 << 16) + var15);
                                class155 var20 = (class155) class153.field2527.method3337(var18);
                                Statics.field2534 = true;
                                if (var20 == null) {
                                    var20 = (class155) class153.field2531.method3337(var18);
                                    Statics.field2534 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2535 = var20;
                                Statics.field2523 = new class127(var17 + var21 + Statics.field2535.field2556);
                                Statics.field2523.method2444(var16);
                                Statics.field2523.method2563(var17);
                                class153.field2538 = 8;
                                class153.field2540.field2036 = 0;
                            } else if (class153.field2538 == 0) {
                                if (class153.field2540.field2037[0] == -1) {
                                    class153.field2538 = 1;
                                    class153.field2540.field2036 = 0;
                                } else {
                                    Statics.field2535 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2523.field2037.length - Statics.field2535.field2556;
                            int var23 = 512 - class153.field2538;
                            if (var23 > var22 - Statics.field2523.field2036) {
                                var23 = var22 - Statics.field2523.field2036;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2528.method1385(Statics.field2523.field2037, Statics.field2523.field2036, var23);
                            if (class153.field2541 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2523.field2037[Statics.field2523.field2036 + var24] ^= class153.field2541;
                                }
                            }
                            Statics.field2523.field2036 += var23;
                            class153.field2538 += var23;
                            if (Statics.field2523.field2036 == var22) {
                                if (Statics.field2535.field2819 == 16711935L) {
                                    Statics.field1845 = Statics.field2523;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class154 var26 = class153.field2532[var25];
                                        if (var26 != null) {
                                            Statics.field1845.field2036 = var25 * 8 + 5;
                                            int var27 = Statics.field1845.method2628();
                                            int var28 = Statics.field1845.method2628();
                                            var26.method3099(var27, var28);
                                        }
                                    }
                                } else {
                                    class153.field2539.reset();
                                    class153.field2539.update(Statics.field2523.field2037, 0, var22);
                                    int var29 = (int) class153.field2539.getValue();
                                    if (Statics.field2535.field2560 != var29) {
                                        try {
                                            Statics.field2528.method1391();
                                        } catch (Exception var35) {
                                        }
                                        class153.field2542++;
                                        Statics.field2528 = null;
                                        class153.field2541 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class153.field2542 = 0;
                                    class153.field2543 = 0;
                                    Statics.field2535.field2559.method3106((int) (Statics.field2535.field2819 & 0xFFFFL), Statics.field2523.field2037, (Statics.field2535.field2819 & 0xFF0000L) == 16711680L, Statics.field2534);
                                }
                                Statics.field2535.method3395();
                                if (Statics.field2534) {
                                    class153.field2525--;
                                } else {
                                    class153.field2533--;
                                }
                                class153.field2538 = 0;
                                Statics.field2535 = null;
                                Statics.field2523 = null;
                            } else {
                                if (class153.field2538 != 512) {
                                    break;
                                }
                                class153.field2538 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2528.method1391();
                } catch (Exception var34) {
                }
                class153.field2543++;
                Statics.field2528 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method244();
        }
    }

    @ObfuscatedName("client.r(B)V")
    public void method244() {
        if (class153.field2542 >= 4) {
            this.method1440("js5crc");
            field664 = 1000;
            return;
        }
        if (class153.field2543 >= 4) {
            if (field664 <= 5) {
                this.method1440("js5io");
                field664 = 1000;
                return;
            }
            field489 = 3000;
            class153.field2543 = 3;
        }
        if (--field489 + 1 > 0) {
            return;
        }
        try {
            if (field615 == 0) {
                Statics.field1780 = Statics.field1637.method1499(Statics.field20, Statics.field2314);
                field615++;
            }
            if (field615 == 1) {
                if (Statics.field1780.field1409 == 2) {
                    this.method373(-1);
                    return;
                }
                if (Statics.field1780.field1409 == 1) {
                    field615++;
                }
            }
            if (field615 == 2) {
                Statics.field573 = new class70((Socket) Statics.field1780.field1413, Statics.field1637);
                class127 var1 = new class127(5);
                var1.method2444(15);
                var1.method2563(16);
                Statics.field573.method1383(var1.field2037, 0, 5);
                field615++;
                Statics.field190 = class121.method1389();
            }
            if (field615 == 3) {
                if (field664 <= 5 || Statics.field573.method1381() > 0) {
                    int var2 = Statics.field573.method1380();
                    if (var2 != 0) {
                        this.method373(var2);
                        return;
                    }
                    field615++;
                } else if (class121.method1389() - Statics.field190 > 30000L) {
                    this.method373(-2);
                    return;
                }
            }
            if (field615 == 4) {
                class153.method2954(Statics.field573, field664 > 20);
                Statics.field1780 = null;
                Statics.field573 = null;
                field615 = 0;
                field541 = 0;
            }
        } catch (IOException var4) {
            this.method373(-3);
        }
    }

    @ObfuscatedName("client.o(II)V")
    public void method373(int arg0) {
        Statics.field1780 = null;
        Statics.field573 = null;
        field615 = 0;
        if (Statics.field2314 == Statics.field218) {
            Statics.field2314 = Statics.field263;
        } else {
            Statics.field2314 = Statics.field218;
        }
        field541++;
        if (field541 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field664 <= 5) {
                this.method1440("js5connect_full");
                field664 = 1000;
            } else {
                field489 = 3000;
            }
        } else if (field541 >= 2 && arg0 == 6) {
            this.method1440("js5connect_outofdate");
            field664 = 1000;
        } else if (field541 >= 4) {
            if (field664 <= 5) {
                this.method1440("js5connect");
                field664 = 1000;
            } else {
                field489 = 3000;
            }
        }
    }

    @ObfuscatedName("bh.c(I)V")
    public static void method1287() {
        if (field486 == 0) {
            Statics.field112 = new class95(4, 104, 104, class9.field120);
            for (int var0 = 0; var0 < 4; var0++) {
                field518[var0] = new class164(104, 104);
            }
            Statics.field1021 = new class86(512, 512);
            class21.field315 = class134.field2090;
            class21.field314 = 5;
            field486 = 20;
        } else if (field486 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1770[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1918(var1, 500, 800, 512, 334);
            class21.field315 = class134.field2091;
            class21.field314 = 10;
            field486 = 30;
        } else if (field486 == 30) {
            Statics.field1448 = method9(0, false, true, true);
            Statics.field1288 = method9(1, false, true, true);
            Statics.field1928 = method9(2, true, false, true);
            Statics.field2567 = method9(3, false, true, true);
            Statics.field176 = method9(4, false, true, true);
            Statics.field1454 = method9(5, true, true, true);
            Statics.field205 = method9(6, true, true, false);
            Statics.field2450 = method9(7, false, true, true);
            Statics.field297 = method9(8, false, true, true);
            Statics.field740 = method9(9, false, true, true);
            Statics.field2325 = method9(10, false, true, true);
            Statics.field166 = method9(11, false, true, true);
            Statics.field93 = method9(12, false, true, true);
            Statics.field1164 = method9(13, true, false, true);
            Statics.field700 = method9(14, false, true, false);
            Statics.field722 = method9(15, false, true, true);
            class21.field315 = class134.field2292;
            class21.field314 = 20;
            field486 = 40;
        } else if (field486 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1448.method3092() * 4 / 100;
            int var8 = var7 + Statics.field1288.method3092() * 4 / 100;
            int var9 = var8 + Statics.field1928.method3092() * 2 / 100;
            int var10 = var9 + Statics.field2567.method3092() * 2 / 100;
            int var11 = var10 + Statics.field176.method3092() * 6 / 100;
            int var12 = var11 + Statics.field1454.method3092() * 4 / 100;
            int var13 = var12 + Statics.field205.method3092() * 2 / 100;
            int var14 = var13 + Statics.field2450.method3092() * 60 / 100;
            int var15 = var14 + Statics.field297.method3092() * 2 / 100;
            int var16 = var15 + Statics.field740.method3092() * 2 / 100;
            int var17 = var16 + Statics.field2325.method3092() * 2 / 100;
            int var18 = var17 + Statics.field166.method3092() * 2 / 100;
            int var19 = var18 + Statics.field93.method3092() * 2 / 100;
            int var20 = var19 + Statics.field1164.method3092() * 2 / 100;
            int var21 = var20 + Statics.field700.method3092() * 2 / 100;
            int var22 = var21 + Statics.field722.method3092() * 2 / 100;
            if (var22 == 100) {
                class21.field315 = class134.field2094;
                class21.field314 = 30;
                field486 = 45;
            } else {
                if (var22 != 0) {
                    class21.field315 = class134.field2193 + var22 + "%";
                }
                class21.field314 = 30;
            }
        } else if (field486 == 45) {
            boolean var23 = !field463;
            Statics.field1094 = 22050;
            Statics.field1077 = var23;
            Statics.field1078 = 2;
            class141 var24 = new class141();
            var24.method2833(9, 128);
            Statics.field1512 = class52.method1284(Statics.field1637, Statics.field850, 0, 22050);
            Statics.field1512.method1168(var24);
            class138.method1401(Statics.field722, Statics.field700, Statics.field176, var24);
            Statics.field2031 = class52.method1284(Statics.field1637, Statics.field850, 1, 2048);
            Statics.field11 = new class46();
            Statics.field2031.method1168(Statics.field11);
            Statics.field2056 = new class62(22050, Statics.field1094);
            class21.field315 = class134.field2095;
            class21.field314 = 35;
            field486 = 50;
        } else if (field486 == 50) {
            int var25 = 0;
            if (Statics.field511 == null) {
                Statics.field511 = class84.method147(Statics.field297, Statics.field1164, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field295 == null) {
                Statics.field295 = class84.method147(Statics.field297, Statics.field1164, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field272 == null) {
                Statics.field272 = class84.method147(Statics.field297, Statics.field1164, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class21.field315 = class134.field2096 + var25 * 100 / 3 + "%";
                class21.field314 = 40;
            } else {
                Statics.field182 = new class151(true);
                class21.field315 = class134.field2097;
                class21.field314 = 40;
                field486 = 60;
            }
        } else if (field486 == 60) {
            class154 var26 = Statics.field2325;
            class154 var27 = Statics.field297;
            int var28 = 0;
            if (var26.method3009("title.jpg", "")) {
                var28++;
            }
            if (var27.method3009("logo", "")) {
                var28++;
            }
            if (var27.method3009("titlebox", "")) {
                var28++;
            }
            if (var27.method3009("titlebutton", "")) {
                var28++;
            }
            if (var27.method3009("runes", "")) {
                var28++;
            }
            if (var27.method3009("title_mute", "")) {
                var28++;
            }
            var27.method3009("sl_back", "");
            var27.method3009("sl_flags", "");
            var27.method3009("sl_arrows", "");
            var27.method3009("sl_stars", "");
            var27.method3009("sl_button", "");
            int var31 = class21.method706();
            if (var28 < var31) {
                class21.field315 = class134.field2166 + var28 * 100 / var31 + "%";
                class21.field314 = 50;
            } else {
                class21.field315 = class134.field2099;
                class21.field314 = 50;
                method125(5);
                field486 = 70;
            }
        } else if (field486 == 70) {
            if (Statics.field1928.method2995()) {
                class37.method1352(Statics.field1928);
                class33.method149(Statics.field1928);
                class154 var32 = Statics.field1928;
                class154 var33 = Statics.field2450;
                Statics.field922 = var32;
                Statics.field919 = var33;
                Statics.field907 = Statics.field922.method2994(3);
                class154 var34 = Statics.field1928;
                class154 var35 = Statics.field2450;
                boolean var36 = field463;
                Statics.field2441 = var34;
                Statics.field2455 = var35;
                class32.field846 = var36;
                class154 var37 = Statics.field1928;
                class154 var38 = Statics.field2450;
                Statics.field794 = var37;
                Statics.field761 = var38;
                class154 var39 = Statics.field1928;
                class154 var40 = Statics.field2450;
                boolean var41 = field564;
                class183 var42 = Statics.field511;
                Statics.field971 = var39;
                Statics.field964 = var40;
                Statics.field378 = var41;
                Statics.field971.method2994(10);
                Statics.field250 = var42;
                class34.method104(Statics.field1928, Statics.field1448, Statics.field1288);
                class154 var43 = Statics.field1928;
                class154 var44 = Statics.field2450;
                Statics.field894 = var43;
                Statics.field887 = var44;
                class154 var45 = Statics.field1928;
                Statics.field941 = var45;
                class42.method235(Statics.field1928);
                class158.method2139(Statics.field2567, Statics.field2450, Statics.field297, Statics.field1164);
                class41.method1674(Statics.field1928);
                class39.method750(Statics.field1928);
                class21.field315 = class134.field2101;
                class21.field314 = 60;
                field486 = 80;
            } else {
                class21.field315 = class134.field2100 + Statics.field1928.method3108() + "%";
                class21.field314 = 60;
            }
        } else if (field486 == 80) {
            int var46 = 0;
            if (Statics.field1198 == null) {
                class154 var47 = Statics.field297;
                int var48 = var47.method3022("compass");
                int var49 = var47.method3007(var48, "");
                class86 var50;
                if (class84.method140(var47, var48, var49)) {
                    var50 = class84.method1632();
                } else {
                    var50 = null;
                }
                Statics.field1198 = var50;
            } else {
                var46++;
            }
            if (Statics.field258 == null) {
                class154 var52 = Statics.field297;
                int var53 = var52.method3022("mapedge");
                int var54 = var52.method3007(var53, "");
                class86 var55;
                if (class84.method140(var52, var53, var54)) {
                    var55 = class84.method1632();
                } else {
                    var55 = null;
                }
                Statics.field258 = var55;
            } else {
                var46++;
            }
            if (Statics.field280 == null) {
                Statics.field280 = Statics.method1516(Statics.field297, "mapscene", "");
            } else {
                var46++;
            }
            if (Statics.field2009 == null) {
                Statics.field2009 = class84.method15(Statics.field297, "mapfunction", "");
            } else {
                var46++;
            }
            if (Statics.field1267 == null) {
                Statics.field1267 = class84.method15(Statics.field297, "hitmarks", "");
            } else {
                var46++;
            }
            if (Statics.field282 == null) {
                Statics.field282 = class84.method15(Statics.field297, "headicons_pk", "");
            } else {
                var46++;
            }
            if (Statics.field330 == null) {
                Statics.field330 = class84.method15(Statics.field297, "headicons_prayer", "");
            } else {
                var46++;
            }
            if (Statics.field1821 == null) {
                Statics.field1821 = class84.method15(Statics.field297, "headicons_hint", "");
            } else {
                var46++;
            }
            if (Statics.field1297 == null) {
                Statics.field1297 = class84.method15(Statics.field297, "mapmarker", "");
            } else {
                var46++;
            }
            if (Statics.field241 == null) {
                Statics.field241 = class84.method15(Statics.field297, "cross", "");
            } else {
                var46++;
            }
            if (Statics.field265 == null) {
                Statics.field265 = class84.method15(Statics.field297, "mapdots", "");
            } else {
                var46++;
            }
            if (Statics.field79 == null) {
                Statics.field79 = Statics.method1516(Statics.field297, "scrollbar", "");
            } else {
                var46++;
            }
            if (Statics.field456 == null) {
                Statics.field456 = Statics.method1516(Statics.field297, "mod_icons", "");
            } else {
                var46++;
            }
            if (Statics.field1255 == null) {
                Statics.field1255 = class84.method194(Statics.field297, "mapback", "");
            } else {
                var46++;
            }
            if (var46 < 14) {
                class21.field315 = class134.field2102 + var46 * 100 / 14 + "%";
                class21.field314 = 70;
            } else {
                Statics.field2844 = Statics.field456;
                Statics.field258.method1716();
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 41.0D) - 20;
                for (int var61 = 0; var61 < Statics.field2009.length; var61++) {
                    Statics.field2009[var61].method1780(var57 + var60, var58 + var60, var59 + var60);
                }
                Statics.field280[0].method1784(var57 + var60, var58 + var60, var59 + var60);
                Statics.field2064 = new int[33];
                Statics.field243 = new int[33];
                Statics.field2554 = new int[151];
                Statics.field1325 = new int[151];
                for (int var62 = 0; var62 < 33; var62++) {
                    int var63 = 999;
                    int var64 = 0;
                    for (int var65 = 0; var65 < 34; var65++) {
                        if (Statics.field1255.field1477[Statics.field1255.field1473 * var62 + var65] == 0) {
                            if (var63 == 999) {
                                var63 = var65;
                            }
                        } else if (var63 != 999) {
                            var64 = var65;
                            break;
                        }
                    }
                    Statics.field2064[var62] = var63;
                    Statics.field243[var62] = var64 - var63;
                }
                for (int var66 = 5; var66 < 156; var66++) {
                    int var67 = 999;
                    int var68 = 0;
                    for (int var69 = 25; var69 < 172; var69++) {
                        if (Statics.field1255.field1477[Statics.field1255.field1473 * var66 + var69] == 0 && var69 > 34 || var66 > 34) {
                            if (var67 == 999) {
                                var67 = var69;
                            }
                        } else if (var67 != 999) {
                            var68 = var69;
                            break;
                        }
                    }
                    Statics.field2554[var66 - 5] = var67 - 25;
                    Statics.field1325[var66 - 5] = var68 - var67;
                }
                class21.field315 = class134.field2309;
                class21.field314 = 70;
                field486 = 90;
            }
        } else if (field486 == 90) {
            if (Statics.field740.method2995()) {
                class110 var70 = new class110(Statics.field740, Statics.field297, 20, 0.8D, field463 ? 64 : 128);
                class104.method2148(var70);
                class104.method2203(0.8D);
                class21.field315 = class134.field2105;
                class21.field314 = 90;
                field486 = 110;
            } else {
                class21.field315 = class134.field2106 + Statics.field740.method3108() + "%";
                class21.field314 = 90;
            }
        } else if (field486 == 110) {
            Statics.field1781 = new class16();
            Statics.field1637.method1495(Statics.field1781, 10);
            class21.field315 = class134.field2157;
            class21.field314 = 94;
            field486 = 120;
        } else if (field486 == 120) {
            if (Statics.field2325.method3009("huffman", "")) {
                class120 var71 = new class120(Statics.field2325.method3008("huffman", ""));
                class184.method1418(var71);
                class21.field315 = class134.field2108;
                class21.field314 = 96;
                field486 = 130;
            } else {
                class21.field315 = class134.field2107 + "%";
                class21.field314 = 96;
            }
        } else if (field486 == 130) {
            if (!Statics.field2567.method2995()) {
                class21.field315 = class134.field2258 + Statics.field2567.method3108() * 4 / 5 + "%";
                class21.field314 = 100;
            } else if (!Statics.field93.method2995()) {
                class21.field315 = class134.field2258 + (80 + Statics.field93.method3108() / 6) + "%";
                class21.field314 = 100;
            } else if (Statics.field1164.method2995()) {
                class21.field315 = class134.field2110;
                class21.field314 = 100;
                field486 = 140;
            } else {
                class21.field315 = class134.field2258 + (96 + Statics.field1164.method3108() / 20) + "%";
                class21.field314 = 100;
            }
        } else if (field486 == 140) {
            method125(10);
        }
    }

    @ObfuscatedName("m.f(IZZZI)Lee;")
    public static class154 method9(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1420 != null) {
            var4 = new class71(arg0, class82.field1420, Statics.field1812[arg0], 1000000);
        }
        return new class154(var4, Statics.field739, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dx.a(I)V")
    public static final void method2358() {
        try {
            if (field506 == 0) {
                if (Statics.field266 != null) {
                    Statics.field266.method1391();
                    Statics.field266 = null;
                }
                Statics.field26 = null;
                field510 = false;
                field547 = 0;
                field506 = 1;
            }
            if (field506 == 1) {
                if (Statics.field26 == null) {
                    Statics.field26 = Statics.field1637.method1499(Statics.field20, Statics.field2314);
                }
                if (Statics.field26.field1409 == 2) {
                    throw new IOException();
                }
                if (Statics.field26.field1409 == 1) {
                    Statics.field266 = new class70((Socket) Statics.field26.field1413, Statics.field1637);
                    Statics.field26 = null;
                    field506 = 2;
                }
            }
            if (field506 == 2) {
                field509.field2036 = 0;
                field509.method2444(14);
                Statics.field266.method1383(field509.field2037, 0, 1);
                field708.field2036 = 0;
                field506 = 3;
            }
            if (field506 == 3) {
                if (Statics.field1512 != null) {
                    Statics.field1512.method1169();
                }
                if (Statics.field2031 != null) {
                    Statics.field2031.method1169();
                }
                int var0 = Statics.field266.method1380();
                if (Statics.field1512 != null) {
                    Statics.field1512.method1169();
                }
                if (Statics.field2031 != null) {
                    Statics.field2031.method1169();
                }
                if (var0 != 0) {
                    method1402(var0);
                    return;
                }
                field708.field2036 = 0;
                field506 = 5;
            }
            if (field506 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field509.field2036 = 0;
                field509.method2444(10);
                field509.method2563(var1[0]);
                field509.method2563(var1[1]);
                field509.method2563(var1[2]);
                field509.method2563(var1[3]);
                field509.method2599(0L);
                field509.method2484(class21.field334);
                field509.method2560(class6.field82, class6.field85);
                field711.field2036 = 0;
                if (field664 == 40) {
                    field711.method2444(18);
                } else {
                    field711.method2444(16);
                }
                field711.method2445(0);
                int var2 = field711.field2036;
                field711.method2563(16);
                field711.method2452(field509.field2037, 0, field509.field2036);
                int var3 = field711.field2036;
                field711.method2484(class21.field326);
                field711.method2444(field463 ? 1 : 0);
                class116 var4 = field711;
                byte[] var5 = new byte[24];
                try {
                    class82.field1427.method565(0L);
                    class82.field1427.method567(var5);
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
                var4.method2452(var5, 0, 24);
                class127 var9 = new class127(Statics.field182.method2977());
                Statics.field182.method2978(var9);
                field711.method2452(var9.field2037, 0, var9.field2037.length);
                field711.method2563(Statics.field1448.field2512);
                field711.method2563(Statics.field1288.field2512);
                field711.method2563(Statics.field1928.field2512);
                field711.method2563(Statics.field2567.field2512);
                field711.method2563(Statics.field176.field2512);
                field711.method2563(Statics.field1454.field2512);
                field711.method2563(Statics.field205.field2512);
                field711.method2563(Statics.field2450.field2512);
                field711.method2563(Statics.field297.field2512);
                field711.method2563(Statics.field740.field2512);
                field711.method2563(Statics.field2325.field2512);
                field711.method2563(Statics.field166.field2512);
                field711.method2563(Statics.field93.field2512);
                field711.method2563(Statics.field1164.field2512);
                field711.method2563(Statics.field700.field2512);
                field711.method2563(Statics.field722.field2512);
                field711.method2586(var1, var3, field711.field2036);
                field711.method2454(field711.field2036 - var2);
                Statics.field266.method1383(field711.field2037, 0, field711.field2036);
                field509.method2338(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field708.method2338(var1);
                field506 = 6;
            }
            if (field506 == 6 && Statics.field266.method1381() > 0) {
                int var11 = Statics.field266.method1380();
                if (var11 == 21 && field664 == 20) {
                    field506 = 7;
                } else if (var11 == 2) {
                    field506 = 9;
                } else if (var11 == 15 && field664 == 40) {
                    field509.field2036 = 0;
                    field708.field2036 = 0;
                    field503 = -1;
                    field610 = -1;
                    field508 = -1;
                    field493 = -1;
                    field502 = 0;
                    field504 = 0;
                    field475 = 0;
                    field719 = 0;
                    field694 = false;
                    field724 = 0;
                    field693 = 0;
                    for (int var12 = 0; var12 < field580.length; var12++) {
                        if (field580[var12] != null) {
                            field580[var12].field422 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field496.length; var13++) {
                        if (field496[var13] != null) {
                            field496[var13].field422 = -1;
                        }
                    }
                    class19.field281 = new class175(32);
                    method125(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field507[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field494 < 1) {
                    field494++;
                    field506 = 0;
                } else {
                    method1402(var11);
                    return;
                }
            }
            if (field506 == 7 && Statics.field266.method1381() > 0) {
                field495 = (Statics.field266.method1380() + 3) * 60;
                field506 = 8;
            }
            if (field506 == 8) {
                field547 = 0;
                class21.method908(class134.field2111, class134.field2112, field495 / 60 + class134.field2113);
                if (--field495 <= 0) {
                    field506 = 0;
                }
            } else {
                if (field506 == 9 && Statics.field266.method1381() >= 8) {
                    field628 = Statics.field266.method1380();
                    field629 = Statics.field266.method1380() == 1;
                    field586 = Statics.field266.method1380();
                    field586 <<= 0x8;
                    field586 += Statics.field266.method1380();
                    field636 = Statics.field266.method1380();
                    Statics.field266.method1385(field708.field2037, 0, 1);
                    field708.field2036 = 0;
                    field503 = field708.method2335();
                    Statics.field266.method1385(field708.field2037, 0, 2);
                    field708.field2036 = 0;
                    field502 = field708.method2460();
                    if (field636 == 1) {
                        try {
                            class67.method1369(Statics.field458, "zap");
                        } catch (Throwable var19) {
                        }
                    } else {
                        try {
                            class67.method1369(Statics.field458, "unzap");
                        } catch (Throwable var18) {
                        }
                    }
                    field506 = 10;
                }
                if (field506 != 10) {
                    field547++;
                    if (field547 > 2000) {
                        if (field494 < 1) {
                            if (Statics.field2314 == Statics.field218) {
                                Statics.field2314 = Statics.field263;
                            } else {
                                Statics.field2314 = Statics.field218;
                            }
                            field494++;
                            field506 = 0;
                        } else {
                            method1402(-3);
                        }
                    }
                } else if (Statics.field266.method1381() >= field502) {
                    field708.field2036 = 0;
                    Statics.field266.method1385(field708.field2037, 0, field502);
                    method2223();
                    Statics.field860 = -1;
                    method2703(false);
                    field503 = -1;
                }
            }
        } catch (IOException var21) {
            if (field494 < 1) {
                if (Statics.field2314 == Statics.field218) {
                    Statics.field2314 = Statics.field263;
                } else {
                    Statics.field2314 = Statics.field218;
                }
                field494++;
                field506 = 0;
            } else {
                method1402(-2);
            }
        }
    }

    @ObfuscatedName("dd.t(I)V")
    public static void method2223() {
        field560 = 1L;
        field577 = -1;
        Statics.field1781.field247 = 0;
        Statics.field1265 = true;
        field642 = true;
        field466 = -1L;
        class182.field2831 = new class177();
        field509.field2036 = 0;
        field708.field2036 = 0;
        field503 = -1;
        field610 = -1;
        field508 = -1;
        field493 = -1;
        field504 = 0;
        field475 = 0;
        field607 = 0;
        field672 = 0;
        field719 = 0;
        field694 = false;
        class77.field1387 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field472[var0] = null;
        }
        field676 = 0;
        field476 = 0;
        field651 = false;
        field701 = 0;
        field527 = (int) (Math.random() * 100.0D) - 50;
        field529 = (int) (Math.random() * 110.0D) - 55;
        field467 = (int) (Math.random() * 80.0D) - 40;
        field674 = (int) (Math.random() * 120.0D) - 60;
        field536 = (int) (Math.random() * 30.0D) - 20;
        field609 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field724 = 0;
        field688 = -1;
        field693 = 0;
        field491 = 0;
        field581 = 0;
        field497 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field580[var1] = null;
            field585[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field496[var2] = null;
        }
        Statics.field147 = field580[2047] = new class3();
        field596.method3349();
        field597.method3349();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field594[var3][var4][var5] = null;
                }
            }
        }
        field668 = new class177();
        field714 = 0;
        field703 = 0;
        for (int var6 = 0; var6 < Statics.field1022; var6++) {
            class42 var7 = (class42) class42.field1025.method3288((long) var6);
            class42 var8;
            if (var7 == null) {
                byte[] var9 = Statics.field1027.method2991(16, var6);
                class42 var10 = new class42();
                if (var9 != null) {
                    var10.method910(new class127(var9));
                }
                class42.field1025.method3291(var10, (long) var6);
                var8 = var10;
            } else {
                var8 = var7;
            }
            if (var8 != null && var8.field1019 == 0) {
                class159.field2704[var6] = 0;
                class159.field2705[var6] = 0;
            }
        }
        for (int var12 = 0; var12 < field606.length; var12++) {
            field606[var12] = -1;
        }
        if (field621 != -1) {
            int var13 = field621;
            if (var13 != -1 && Statics.field2777[var13]) {
                Statics.field2579.method3031(var13);
                if (Statics.field2648[var13] != null) {
                    boolean var14 = true;
                    for (int var15 = 0; var15 < Statics.field2648[var13].length; var15++) {
                        if (Statics.field2648[var13][var15] != null) {
                            if (Statics.field2648[var13][var15].field2588 == 2) {
                                var14 = false;
                            } else {
                                Statics.field2648[var13][var15] = null;
                            }
                        }
                    }
                    if (var14) {
                        Statics.field2648[var13] = null;
                    }
                    Statics.field2777[var13] = false;
                }
            }
        }
        for (class4 var16 = (class4) field622.method3335(); var16 != null; var16 = (class4) field622.method3342()) {
            method2205(var16, true);
        }
        field621 = -1;
        field622 = new class175(8);
        field460 = null;
        field694 = false;
        field719 = 0;
        field616.method3197((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var17 = 0; var17 < 8; var17++) {
            field473[var17] = null;
            field592[var17] = false;
        }
        class19.field281 = new class175(32);
        field522 = true;
        for (int var18 = 0; var18 < 100; var18++) {
            field507[var18] = true;
        }
        field686 = null;
        Statics.field2570 = 0;
        Statics.field1436 = null;
    }

    @ObfuscatedName("by.u(II)V")
    public static void method1402(int arg0) {
        if (arg0 == -3) {
            class21.method908(class134.field2114, class134.field2115, class134.field2162);
        } else if (arg0 == -2) {
            class21.method908(class134.field2251, class134.field2118, class134.field2119);
        } else if (arg0 == -1) {
            class21.method908(class134.field2120, class134.field2138, class134.field2137);
        } else if (arg0 == 3) {
            class21.method908(class134.field2213, class134.field2124, class134.field2125);
        } else if (arg0 == 4) {
            class21.method908(class134.field2126, class134.field2127, class134.field2128);
        } else if (arg0 == 5) {
            class21.method908(class134.field2080, class134.field2117, class134.field2131);
        } else if (arg0 == 6) {
            class21.method908(class134.field2132, class134.field2308, class134.field2134);
        } else if (arg0 == 7) {
            class21.method908(class134.field2135, class134.field2136, class134.field2185);
        } else if (arg0 == 8) {
            class21.method908(class134.field2109, class134.field2139, class134.field2093);
        } else if (arg0 == 9) {
            class21.method908(class134.field2242, class134.field2142, class134.field2143);
        } else if (arg0 == 10) {
            class21.method908(class134.field2144, class134.field2160, class134.field2146);
        } else if (arg0 == 11) {
            class21.method908(class134.field2147, class134.field2148, class134.field2149);
        } else if (arg0 == 12) {
            class21.method908(class134.field2155, class134.field2223, class134.field2215);
        } else if (arg0 == 13) {
            class21.method908(class134.field2153, class134.field2154, class134.field2087);
        } else if (arg0 == 14) {
            class21.method908(class134.field2156, class134.field2211, class134.field2158);
        } else if (arg0 == 16) {
            class21.method908(class134.field2204, class134.field2222, class134.field2161);
        } else if (arg0 == 17) {
            class21.method908(class134.field2150, class134.field2163, class134.field2179);
        } else if (arg0 == 18) {
            class21.method908(class134.field2141, class134.field2180, class134.field2167);
        } else if (arg0 == 19) {
            class21.method908(class134.field2168, class134.field2169, class134.field2205);
        } else if (arg0 == 20) {
            class21.method908(class134.field2267, class134.field2172, class134.field2218);
        } else if (arg0 == 22) {
            class21.method908(class134.field2277, class134.field2175, class134.field2176);
        } else if (arg0 == 23) {
            class21.method908(class134.field2221, class134.field2178, class134.field2116);
        } else if (arg0 == 24) {
            class21.method908(class134.field2159, class134.field2261, class134.field2182);
        } else if (arg0 == 25) {
            class21.method908(class134.field2183, class134.field2184, class134.field2174);
        } else if (arg0 == 26) {
            class21.method908(class134.field2186, class134.field2244, class134.field2188);
        } else if (arg0 == 27) {
            class21.method908(class134.field2189, class134.field2255, class134.field2191);
        } else if (arg0 == 31) {
            class21.method908(class134.field2198, class134.field2199, class134.field2177);
        } else if (arg0 == 32) {
            class21.method908(class134.field2201, class134.field2202, class134.field2260);
        } else if (arg0 == 37) {
            class21.method908(class134.field2301, class134.field2240, class134.field2206);
        } else if (arg0 == 38) {
            class21.method908(class134.field2207, class134.field2208, class134.field2173);
        } else if (arg0 == 55) {
            class21.method908(class134.field2210, class134.field2259, class134.field2212);
        } else {
            class21.method908(class134.field2290, class134.field2214, class134.field2130);
        }
        method125(10);
    }

    @ObfuscatedName("au.z(I)V")
    public static final void method918() {
        if (Statics.field266 != null) {
            Statics.field266.method1391();
            Statics.field266 = null;
        }
        method124();
        Statics.field112.method1883();
        for (int var0 = 0; var0 < 4; var0++) {
            field518[var0].method3238();
        }
        System.gc();
        class138.method2704(2);
        field697 = -1;
        field680 = false;
        class7.method38();
        method125(10);
    }

    @ObfuscatedName("r.v(S)V")
    public static final void method124() {
        class37.method907();
        class33.field855.method3297();
        class36.method2952();
        class32.method563();
        class31.method2912();
        class40.field990.method3297();
        class40.field982.method3297();
        class40.field987.method3297();
        class34.method589();
        class35.field888.method3297();
        class35.field899.method3297();
        class38.field940.method3297();
        class42.method2361();
        class163.method2908();
        class158.method90();
        ((class110) Statics.field1766).method2233();
        class5.field69.method3297();
        Statics.field1448.method3004();
        Statics.field1288.method3004();
        Statics.field2567.method3004();
        Statics.field176.method3004();
        Statics.field1454.method3004();
        Statics.field205.method3004();
        Statics.field2450.method3004();
        Statics.field297.method3004();
        Statics.field740.method3004();
        Statics.field2325.method3004();
        Statics.field166.method3004();
        Statics.field93.method3004();
    }

    @ObfuscatedName("a.w(I)V")
    public static final void method145() {
        if (field607 > 0) {
            method918();
        } else {
            method125(40);
            Statics.field2318 = Statics.field266;
            Statics.field266 = null;
        }
    }

    @ObfuscatedName("ax.h(I)V")
    public static final void method592() {
        if (field475 > 1) {
            field475--;
        }
        if (field607 > 0) {
            field607--;
        }
        if (field510) {
            field510 = false;
            method145();
            return;
        }
        for (int var0 = 0; var0 < 100 && method68(); var0++) {
        }
        if (field664 != 30) {
            return;
        }
        class182.method631(field509, 60);
        Object var1 = Statics.field1781.field246;
        synchronized (Statics.field1781.field246) {
            if (!field459) {
                Statics.field1781.field247 = 0;
            } else if (class77.field1402 != 0 || Statics.field1781.field247 >= 40) {
                field509.method2337(254);
                field509.method2444(0);
                int var2 = field509.field2036;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field1781.field247 && field509.field2036 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field1781.field249[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field1781.field245[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field1781.field249[var4] == -1 && Statics.field1781.field245[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field644 != var6 || field471 != var5) {
                        int var8 = var6 - field644;
                        field644 = var6;
                        int var9 = var5 - field471;
                        field471 = var5;
                        if (field577 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field509.method2445((field577 << 12) + (var8 << 6) + var9);
                            field577 = 0;
                        } else if (field577 < 8) {
                            field509.method2446((field577 << 19) + 8388608 + var7);
                            field577 = 0;
                        } else {
                            field509.method2563((field577 << 19) + -1073741824 + var7);
                            field577 = 0;
                        }
                    } else if (field577 < 2047) {
                        field577++;
                    }
                }
                field509.method2455(field509.field2036 - var2);
                if (var3 >= Statics.field1781.field247) {
                    Statics.field1781.field247 = 0;
                } else {
                    Statics.field1781.field247 -= var3;
                    for (int var10 = 0; var10 < Statics.field1781.field247; var10++) {
                        Statics.field1781.field245[var10] = Statics.field1781.field245[var3 + var10];
                        Statics.field1781.field249[var10] = Statics.field1781.field249[var3 + var10];
                    }
                }
            }
        }
        if (class77.field1402 != 0) {
            long var12 = (class77.field1386 - field560 * -1L) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field560 = class77.field1386 * -1L;
            int var14 = class77.field1400;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class77.field1399;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class77.field1402 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field509.method2337(113);
            field509.method2563((var17 << 19) + (var18 << 20) + var16);
        }
        if (class75.field1370 > 0) {
            field509.method2337(104);
            field509.method2445(0);
            int var19 = field509.field2036;
            long var20 = class121.method1389();
            for (int var22 = 0; var22 < class75.field1370; var22++) {
                long var23 = var20 - field466;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field466 = var20;
                field509.method2607(class75.field1360[var22]);
                field509.method2446((int) var23);
            }
            field509.method2454(field509.field2036 - var19);
        }
        if (field550 > 0) {
            field550--;
        }
        if (class75.field1344[96] || class75.field1344[97] || class75.field1344[98] || class75.field1344[99]) {
            field551 = true;
        }
        if (field551 && field550 <= 0) {
            field550 = 20;
            field551 = false;
            field509.method2337(242);
            field509.method2465(field609);
            field509.method2465(field546);
        }
        if (Statics.field1265 && !field642) {
            field642 = true;
            field509.method2337(134);
            field509.method2444(1);
        }
        if (!Statics.field1265 && field642) {
            field642 = false;
            field509.method2337(134);
            field509.method2444(0);
        }
        if (field463 && Statics.field68 != field512) {
            method173(Statics.field860, Statics.field2027, Statics.field68, Statics.field147.field451[0], Statics.field147.field452[0]);
        } else if (Statics.field68 != field688) {
            field688 = Statics.field68;
            method116(Statics.field68);
        }
        if (field664 != 30) {
            return;
        }
        for (class22 var25 = (class22) field668.method3355(); var25 != null; var25 = (class22) field668.method3357()) {
            if (var25.field348 > 0) {
                var25.field348--;
            }
            if (var25.field348 == 0) {
                if (var25.field339 >= 0) {
                    int var26 = var25.field339;
                    int var27 = var25.field346;
                    class32 var28 = class32.method211(var26);
                    if (var27 == 11) {
                        var27 = 10;
                    }
                    if (var27 >= 5 && var27 <= 8) {
                        var27 = 4;
                    }
                    boolean var29 = var28.method636(var27);
                    if (!var29) {
                        continue;
                    }
                }
                method1324(var25.field345, var25.field336, var25.field337, var25.field338, var25.field339, var25.field340, var25.field346);
                var25.method3395();
            } else {
                if (var25.field341 > 0) {
                    var25.field341--;
                }
                if (var25.field341 == 0 && var25.field337 >= 1 && var25.field338 >= 1 && var25.field337 <= 102 && var25.field338 <= 102) {
                    if (var25.field342 >= 0) {
                        int var30 = var25.field342;
                        int var31 = var25.field344;
                        class32 var32 = class32.method211(var30);
                        if (var31 == 11) {
                            var31 = 10;
                        }
                        if (var31 >= 5 && var31 <= 8) {
                            var31 = 4;
                        }
                        boolean var33 = var32.method636(var31);
                        if (!var33) {
                            continue;
                        }
                    }
                    method1324(var25.field345, var25.field336, var25.field337, var25.field338, var25.field342, var25.field343, var25.field344);
                    var25.field341 = -1;
                    if (var25.field342 == var25.field339 && var25.field339 == -1) {
                        var25.method3395();
                    } else if (var25.field342 == var25.field339 && var25.field343 == var25.field340 && var25.field346 == var25.field344) {
                        var25.method3395();
                    }
                }
            }
        }
        method169();
        field504++;
        if (field504 > 750) {
            method145();
            return;
        }
        for (int var34 = -1; var34 < field581; var34++) {
            int var35;
            if (var34 == -1) {
                var35 = 2047;
            } else {
                var35 = field582[var34];
            }
            class3 var36 = field580[var35];
            if (var36 != null) {
                method126(var36, 1);
            }
        }
        method159();
        method2695();
        field539++;
        if (field570 != 0) {
            field569 += 20;
            if (field569 >= 400) {
                field570 = 0;
            }
        }
        if (Statics.field937 != null) {
            field571++;
            if (field571 >= 15) {
                method41(Statics.field937);
                Statics.field937 = null;
            }
        }
        if (Statics.field1252 != null) {
            method41(Statics.field1252);
            field578++;
            if (class77.field1401 > field574 + 5 || class77.field1401 < field574 - 5 || class77.field1393 > field575 + 5 || class77.field1393 < field575 - 5) {
                field487 = true;
            }
            if (class77.field1391 == 0) {
                if (field487 && field578 >= 5) {
                    if (Statics.field552 == Statics.field1252 && field617 != field576) {
                        class158 var37 = Statics.field1252;
                        byte var38 = 0;
                        if (field670 == 1 && var37.field2590 == 206) {
                            var38 = 1;
                        }
                        if (var37.field2644[field576] <= 0) {
                            var38 = 0;
                        }
                        if (class162.method1583(method29(var37))) {
                            int var39 = field617;
                            int var40 = field576;
                            var37.field2644[var40] = var37.field2644[var39];
                            var37.field2689[var40] = var37.field2689[var39];
                            var37.field2644[var39] = -1;
                            var37.field2689[var39] = 0;
                        } else if (var38 == 1) {
                            int var41 = field617;
                            int var42 = field576;
                            while (var41 != var42) {
                                if (var41 > var42) {
                                    var37.method3164(var41 - 1, var41);
                                    var41--;
                                } else if (var41 < var42) {
                                    var37.method3164(var41 + 1, var41);
                                    var41++;
                                }
                            }
                        } else {
                            var37.method3164(field576, field617);
                        }
                        field509.method2337(59);
                        field509.method2647(var38);
                        field509.method2487(field576);
                        field509.method2445(field617);
                        field509.method2495(Statics.field1252.field2656);
                    }
                } else if ((field549 == 1 || method1285(field719 - 1)) && field719 > 2) {
                    method705();
                } else if (field719 > 0) {
                    Statics.method216(field719 - 1);
                }
                field571 = 10;
                class77.field1402 = 0;
                Statics.field1252 = null;
            }
        }
        class158 var43 = Statics.field945;
        class158 var44 = Statics.field612;
        Statics.field945 = null;
        Statics.field612 = null;
        field630 = null;
        field647 = false;
        field637 = false;
        for (field682 = 0; class75.method1365() && field682 < 128; field682++) {
            field684[field682] = Statics.field358;
            field683[field682] = Statics.field81;
        }
        method1351(field621, 0, 0, 765, 503, 0, 0);
        field646++;
        while (true) {
            class1 var45;
            class158 var46;
            class158 var47;
            do {
                var45 = (class1) field659.method3353();
                if (var45 == null) {
                    while (true) {
                        class1 var48;
                        class158 var49;
                        class158 var50;
                        do {
                            var48 = (class1) field660.method3353();
                            if (var48 == null) {
                                while (true) {
                                    class1 var51;
                                    class158 var52;
                                    class158 var53;
                                    do {
                                        var51 = (class1) field457.method3353();
                                        if (var51 == null) {
                                            if (field632 != null) {
                                                method41(field632);
                                                Statics.field1013++;
                                                if (field647 && field637) {
                                                    int var54 = class77.field1401;
                                                    int var55 = class77.field1393;
                                                    int var56 = var54 - field505;
                                                    int var57 = var55 - field635;
                                                    if (var56 < field638) {
                                                        var56 = field638;
                                                    }
                                                    if (field632.field2613 + var56 > field638 + field633.field2613) {
                                                        var56 = field638 + field633.field2613 - field632.field2613;
                                                    }
                                                    if (var57 < field639) {
                                                        var57 = field639;
                                                    }
                                                    if (field632.field2697 + var57 > field639 + field633.field2697) {
                                                        var57 = field639 + field633.field2697 - field632.field2697;
                                                    }
                                                    int var58 = var56 - field641;
                                                    int var59 = var57 - field658;
                                                    int var60 = field632.field2678;
                                                    if (Statics.field1013 > field632.field2650 && (var58 > var60 || var58 < -var60 || var59 > var60 || var59 < -var60)) {
                                                        field627 = true;
                                                    }
                                                    int var61 = field633.field2599 + (var56 - field638);
                                                    int var62 = field633.field2600 + (var57 - field639);
                                                    if (field632.field2662 != null && field627) {
                                                        class1 var63 = new class1();
                                                        var63.field2 = field632;
                                                        var63.field3 = var61;
                                                        var63.field6 = var62;
                                                        var63.field13 = field632.field2662;
                                                        class26.method2369(var63);
                                                    }
                                                    if (class77.field1391 == 0) {
                                                        if (field627) {
                                                            if (field632.field2663 != null) {
                                                                class1 var64 = new class1();
                                                                var64.field2 = field632;
                                                                var64.field3 = var61;
                                                                var64.field6 = var62;
                                                                var64.field4 = field630;
                                                                var64.field13 = field632.field2663;
                                                                class26.method2369(var64);
                                                            }
                                                            if (field630 != null && method2400(field632) != null) {
                                                                field509.method2337(112);
                                                                field509.method2488(field630.field2587);
                                                                field509.method2496(field630.field2656);
                                                                field509.method2496(field632.field2656);
                                                                field509.method2487(field632.field2587);
                                                            }
                                                        } else if ((field549 == 1 || method1285(field719 - 1)) && field719 > 2) {
                                                            method705();
                                                        } else if (field719 > 0) {
                                                            Statics.method216(field719 - 1);
                                                        }
                                                        field632 = null;
                                                    }
                                                } else if (Statics.field1013 > 1) {
                                                    field632 = null;
                                                }
                                            }
                                            if (class95.field1578 != -1) {
                                                int var65 = class95.field1578;
                                                int var66 = class95.field1579;
                                                boolean var67 = method94(Statics.field147.field451[0], Statics.field147.field452[0], var65, var66, true, 0, 0, 0, 0, 0, 0);
                                                class95.field1578 = -1;
                                                if (var67) {
                                                    field716 = class77.field1399;
                                                    field568 = class77.field1400;
                                                    field570 = 1;
                                                    field569 = 0;
                                                }
                                            }
                                            method144();
                                            if (Statics.field945 != var43) {
                                                if (var43 != null) {
                                                    method41(var43);
                                                }
                                                if (Statics.field945 != null) {
                                                    method41(Statics.field945);
                                                }
                                            }
                                            if (Statics.field612 != var44 && field614 == field501) {
                                                if (var44 != null) {
                                                    method41(var44);
                                                }
                                                if (Statics.field612 != null) {
                                                    method41(Statics.field612);
                                                }
                                            }
                                            if (Statics.field612 == null) {
                                                if (field501 > 0) {
                                                    field501--;
                                                }
                                            } else if (field501 < field614) {
                                                field501++;
                                                if (field614 == field501) {
                                                    method41(Statics.field612);
                                                }
                                            }
                                            Statics.method2907();
                                            if (field707) {
                                                method137();
                                            }
                                            for (int var68 = 0; var68 < 5; var68++) {
                                                int var10002 = field712[var68]++;
                                            }
                                            int var69 = class77.method2055();
                                            int var70 = class75.method2700();
                                            if (var69 > 15000 && var70 > 15000) {
                                                field607 = 250;
                                                class77.field1387 = 14500;
                                                field509.method2337(122);
                                            }
                                            field554++;
                                            if (field554 > 500) {
                                                field554 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x1) == 1) {
                                                    field527 += field528;
                                                }
                                                if ((var71 & 0x2) == 2) {
                                                    field529 += field530;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    field467 += field532;
                                                }
                                            }
                                            if (field527 < -50) {
                                                field528 = 2;
                                            }
                                            if (field527 > 50) {
                                                field528 = -2;
                                            }
                                            if (field529 < -55) {
                                                field530 = 2;
                                            }
                                            if (field529 > 55) {
                                                field530 = -2;
                                            }
                                            if (field467 < -40) {
                                                field532 = 1;
                                            }
                                            if (field467 > 40) {
                                                field532 = -1;
                                            }
                                            field538++;
                                            if (field538 > 500) {
                                                field538 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x1) == 1) {
                                                    field674 += field535;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    field536 += field537;
                                                }
                                            }
                                            if (field674 < -60) {
                                                field535 = 2;
                                            }
                                            if (field674 > 60) {
                                                field535 = -2;
                                            }
                                            if (field536 < -20) {
                                                field537 = 1;
                                            }
                                            if (field536 > 10) {
                                                field537 = -1;
                                            }
                                            for (class28 var73 = (class28) field713.method3321(); var73 != null; var73 = (class28) field713.method3316()) {
                                                if ((long) var73.field731 < class121.method1389() / 1000L - 5L) {
                                                    if (var73.field730 > 0) {
                                                        method2740(5, "", var73.field732 + class134.field2082);
                                                    }
                                                    if (var73.field730 == 0) {
                                                        method2740(5, "", var73.field732 + class134.field2265);
                                                    }
                                                    var73.method3388();
                                                }
                                            }
                                            field704++;
                                            if (field704 > 50) {
                                                field509.method2337(131);
                                            }
                                            try {
                                                if (Statics.field266 != null && field509.field2036 > 0) {
                                                    Statics.field266.method1383(field509.field2037, 0, field509.field2036);
                                                    field509.field2036 = 0;
                                                    field704 = 0;
                                                }
                                            } catch (IOException var75) {
                                                method145();
                                            }
                                            return;
                                        }
                                        var52 = var51.field2;
                                        if (var52.field2587 < 0) {
                                            break;
                                        }
                                        var53 = class158.method792(var52.field2686);
                                    } while (var53 == null || var53.field2694 == null || var52.field2587 >= var53.field2694.length || var53.field2694[var52.field2587] != var52);
                                    class26.method2369(var51);
                                }
                            }
                            var49 = var48.field2;
                            if (var49.field2587 < 0) {
                                break;
                            }
                            var50 = class158.method792(var49.field2686);
                        } while (var50 == null || var50.field2694 == null || var49.field2587 >= var50.field2694.length || var50.field2694[var49.field2587] != var49);
                        class26.method2369(var48);
                    }
                }
                var46 = var45.field2;
                if (var46.field2587 < 0) {
                    break;
                }
                var47 = class158.method792(var46.field2686);
            } while (var47 == null || var47.field2694 == null || var46.field2587 >= var47.field2694.length || var47.field2694[var46.field2587] != var46);
            class26.method2369(var45);
        }
    }

    @ObfuscatedName("dl.q(B)V")
    public static final void method2440() {
        if (Statics.field2031 != null) {
            Statics.field2031.method1185();
        }
        if (Statics.field1512 != null) {
            Statics.field1512.method1185();
        }
    }

    @ObfuscatedName("z.g(I)V")
    public static final void method169() {
        for (int var0 = 0; var0 < field701; var0++) {
            int var10002 = field613[var0]--;
            if (field613[var0] >= -10) {
                class57 var2 = field706[var0];
                if (var2 == null) {
                    class57 var10000 = (class57) null;
                    var2 = class57.method1259(Statics.field176, field702[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field613[var0] += var2.method1268();
                    field706[var0] = var2;
                }
                if (field613[var0] < 0) {
                    int var9;
                    if (field705[var0] == 0) {
                        var9 = field699;
                    } else {
                        int var3 = (field705[var0] & 0xFF) * 128;
                        int var4 = field705[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field147.field444;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field705[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field147.field399;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field613[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field625 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1263().method1327(Statics.field2056);
                        class45 var11 = class45.method1096(var10, 100, var9);
                        var11.method961(field640[var0] - 1);
                        Statics.field11.method1109(var11);
                    }
                    field613[var0] = -100;
                }
            } else {
                field701--;
                for (int var1 = var0; var1 < field701; var1++) {
                    field702[var1] = field702[var1 + 1];
                    field706[var1] = field706[var1 + 1];
                    field640[var1] = field640[var1 + 1];
                    field613[var1] = field613[var1 + 1];
                    field705[var1] = field705[var1 + 1];
                }
                var0--;
            }
        }
        if (!field680) {
            return;
        }
        boolean var12;
        if (class138.field2335 == 0) {
            var12 = Statics.field2330.method2772();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field696 != 0 && field697 != -1) {
                class138.method213(Statics.field205, field697, 0, field696, false);
            }
            field680 = false;
        }
    }

    @ObfuscatedName("q.e(Laq;IIII)V")
    public static void method209(class34 arg0, int arg1, int arg2, int arg3) {
        if (field701 >= 50 || field625 == 0 || arg0.field883 == null || arg1 >= arg0.field883.length) {
            return;
        }
        int var4 = arg0.field883[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field702[field701] = var5;
        field640[field701] = var6;
        field613[field701] = 0;
        field706[field701] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field705[field701] = (var8 << 16) + (var9 << 8) + var7;
        field701++;
    }

    @ObfuscatedName("ao.as(IIIB)V")
    public static void method895(int arg0, int arg1, int arg2) {
        if (field699 == 0 || arg1 == 0 || field701 >= 50) {
            return;
        }
        field702[field701] = arg0;
        field640[field701] = arg1;
        field613[field701] = arg2;
        field706[field701] = null;
        field705[field701] = 0;
        field701++;
    }

    @ObfuscatedName("m.an(II)V")
    public static void method16(int arg0) {
        if (arg0 == -1 && !field680) {
            class138.method1681();
        } else if (arg0 != -1 && field697 != arg0 && field696 != 0 && !field680) {
            class154 var1 = Statics.field205;
            int var2 = field696;
            class138.field2335 = 1;
            Statics.field1193 = var1;
            Statics.field2332 = arg0;
            Statics.field1507 = 0;
            Statics.field2047 = var2;
            Statics.field273 = false;
            Statics.field2333 = 2;
        }
        field697 = arg0;
    }

    @ObfuscatedName("u.aj(IIB)V")
    public static void method162(int arg0, int arg1) {
        if (field696 != 0 && arg0 != -1) {
            class138.method213(Statics.field166, arg0, 0, field696, false);
            field680 = true;
        }
    }

    @ObfuscatedName("au.ax(IIB)V")
    public static final void method919(int arg0, int arg1) {
        if (field724 != 0 && field724 != 3 || class77.field1402 != 1) {
            return;
        }
        int var2 = class77.field1399 - 25 - arg0;
        int var3 = class77.field1400 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field674 + field609 & 0x7FF;
        int var5 = class104.field1770[var4];
        int var6 = class104.field1771[var4];
        int var7 = (field536 + 256) * var5 >> 8;
        int var8 = (field536 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field147.field444 + var9 >> 7;
        int var12 = Statics.field147.field399 - var10 >> 7;
        boolean var13 = method94(Statics.field147.field451[0], Statics.field147.field452[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field509.method2444(var2);
        field509.method2444(var3);
        field509.method2445(field609);
        field509.method2444(57);
        field509.method2444(field674);
        field509.method2444(field536);
        field509.method2444(89);
        field509.method2445(Statics.field147.field444);
        field509.method2445(Statics.field147.field399);
        field509.method2444(field462);
        field509.method2444(63);
    }

    @ObfuscatedName("di.av(I)V")
    public static final void method2695() {
        for (int var0 = -1; var0 < field581; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field582[var0];
            }
            class3 var2 = field580[var1];
            if (var2 != null && var2.field412 > 0) {
                var2.field412--;
                if (var2.field412 == 0) {
                    var2.field402 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field497; var3++) {
            int var4 = field648[var3];
            class25 var5 = field496[var4];
            if (var5 != null && var5.field412 > 0) {
                var5.field412--;
                if (var5.field412 == 0) {
                    var5.field402 = null;
                }
            }
        }
    }

    @ObfuscatedName("cp.ae(Ljava/lang/String;I)V")
    public static final void method1589(String arg0) {
        if (arg0.equalsIgnoreCase("::toggleroof")) {
            Statics.field277.field183 = !Statics.field277.field183;
            class12.method1286();
            if (Statics.field277.field183) {
                method2740(0, "", "Roofs are now all hidden");
            } else {
                method2740(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field628 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method145();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field474 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field474 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field518[var1].field2751[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field461 == 2) {
                throw new RuntimeException();
            }
        }
        field509.method2337(45);
        field509.method2444(arg0.length() - 1);
        field509.method2484(arg0.substring(2));
    }

    @ObfuscatedName("f.am(I)V")
    public static final void method137() {
        int var0 = Statics.field379 * 128 + 64;
        int var1 = Statics.field1262 * 128 + 64;
        int var2 = method129(var0, var1, Statics.field68) - Statics.field67;
        if (Statics.field1457 < var0) {
            Statics.field1457 += Statics.field1789 * (var0 - Statics.field1457) / 1000 + Statics.field1282;
            if (Statics.field1457 > var0) {
                Statics.field1457 = var0;
            }
        }
        if (Statics.field1457 > var0) {
            Statics.field1457 -= Statics.field1789 * (Statics.field1457 - var0) / 1000 + Statics.field1282;
            if (Statics.field1457 < var0) {
                Statics.field1457 = var0;
            }
        }
        if (Statics.field2711 < var2) {
            Statics.field2711 += Statics.field1789 * (var2 - Statics.field2711) / 1000 + Statics.field1282;
            if (Statics.field2711 > var2) {
                Statics.field2711 = var2;
            }
        }
        if (Statics.field2711 > var2) {
            Statics.field2711 -= Statics.field1789 * (Statics.field2711 - var2) / 1000 + Statics.field1282;
            if (Statics.field2711 < var2) {
                Statics.field2711 = var2;
            }
        }
        if (Statics.field174 < var1) {
            Statics.field174 += Statics.field1789 * (var1 - Statics.field174) / 1000 + Statics.field1282;
            if (Statics.field174 > var1) {
                Statics.field174 = var1;
            }
        }
        if (Statics.field174 > var1) {
            Statics.field174 -= Statics.field1789 * (Statics.field174 - var1) / 1000 + Statics.field1282;
            if (Statics.field174 < var1) {
                Statics.field174 = var1;
            }
        }
        int var3 = Statics.field2379 * 128 + 64;
        int var4 = Statics.field725 * 128 + 64;
        int var5 = method129(var3, var4, Statics.field68) - Statics.field197;
        int var6 = var3 - Statics.field1457;
        int var7 = var5 - Statics.field2711;
        int var8 = var4 - Statics.field174;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1919 < var10) {
            Statics.field1919 += Statics.field918 * (var10 - Statics.field1919) / 1000 + Statics.field283;
            if (Statics.field1919 > var10) {
                Statics.field1919 = var10;
            }
        }
        if (Statics.field1919 > var10) {
            Statics.field1919 -= Statics.field918 * (Statics.field1919 - var10) / 1000 + Statics.field283;
            if (Statics.field1919 < var10) {
                Statics.field1919 = var10;
            }
        }
        int var12 = var11 - Statics.field1776;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1776 += Statics.field918 * var12 / 1000 + Statics.field283;
            Statics.field1776 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1776 -= Statics.field918 * -var12 / 1000 + Statics.field283;
            Statics.field1776 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1776;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1776 = var11;
        }
    }

    @ObfuscatedName("u.at(B)V")
    public static final void method159() {
        for (int var0 = 0; var0 < field497; var0++) {
            int var1 = field648[var0];
            class25 var2 = field496[var1];
            if (var2 != null) {
                method126(var2, var2.field376.field767);
            }
        }
    }

    @ObfuscatedName("o.ac(Las;II)V")
    public static final void method126(class27 arg0, int arg1) {
        if (arg0.field442 > field691) {
            method142(arg0);
        } else if (arg0.field443 >= field691) {
            if (field691 == arg0.field443 || arg0.field428 == -1 || arg0.field411 != 0 || arg0.field430 + 1 > class34.method540(arg0.field428).field868[arg0.field419]) {
                int var2 = arg0.field443 - arg0.field442;
                int var3 = field691 - arg0.field442;
                int var4 = arg0.field438 * 128 + arg0.field414 * 64;
                int var5 = arg0.field440 * 128 + arg0.field414 * 64;
                int var6 = arg0.field439 * 128 + arg0.field414 * 64;
                int var7 = arg0.field414 * 64 + arg0.field401 * 128;
                arg0.field444 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field399 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field454 = 0;
            if (arg0.field407 == 0) {
                arg0.field447 = 1024;
            }
            if (arg0.field407 == 1) {
                arg0.field447 = 1536;
            }
            if (arg0.field407 == 2) {
                arg0.field447 = 0;
            }
            if (arg0.field407 == 3) {
                arg0.field447 = 512;
            }
            arg0.field400 = arg0.field447;
        } else {
            method2442(arg0);
        }
        if (arg0.field444 < 128 || arg0.field399 < 128 || arg0.field444 >= 13184 || arg0.field399 >= 13184) {
            arg0.field428 = -1;
            arg0.field433 = -1;
            arg0.field442 = 0;
            arg0.field443 = 0;
            arg0.field444 = arg0.field451[0] * 128 + arg0.field414 * 64;
            arg0.field399 = arg0.field452[0] * 128 + arg0.field414 * 64;
            arg0.method220();
        }
        if (Statics.field147 == arg0 && (arg0.field444 < 1536 || arg0.field399 < 1536 || arg0.field444 >= 11776 || arg0.field399 >= 11776)) {
            arg0.field428 = -1;
            arg0.field433 = -1;
            arg0.field442 = 0;
            arg0.field443 = 0;
            arg0.field444 = arg0.field451[0] * 128 + arg0.field414 * 64;
            arg0.field399 = arg0.field452[0] * 128 + arg0.field414 * 64;
            arg0.method220();
        }
        method193(arg0);
        method1517(arg0);
    }

    @ObfuscatedName("a.al(Las;I)V")
    public static final void method142(class27 arg0) {
        int var1 = arg0.field442 - field691;
        int var2 = arg0.field438 * 128 + arg0.field414 * 64;
        int var3 = arg0.field440 * 128 + arg0.field414 * 64;
        arg0.field444 += (var2 - arg0.field444) / var1;
        arg0.field399 += (var3 - arg0.field399) / var1;
        arg0.field454 = 0;
        if (arg0.field407 == 0) {
            arg0.field447 = 1024;
        }
        if (arg0.field407 == 1) {
            arg0.field447 = 1536;
        }
        if (arg0.field407 == 2) {
            arg0.field447 = 0;
        }
        if (arg0.field407 == 3) {
            arg0.field447 = 512;
        }
    }

    @ObfuscatedName("dl.ab(Las;B)V")
    public static final void method2442(class27 arg0) {
        arg0.field446 = arg0.field441;
        if (arg0.field450 == 0) {
            arg0.field454 = 0;
            return;
        }
        if (arg0.field428 != -1 && arg0.field411 == 0) {
            class34 var1 = class34.method540(arg0.field428);
            if (arg0.field455 > 0 && var1.field877 == 0) {
                arg0.field454++;
                return;
            }
            if (arg0.field455 <= 0 && var1.field871 == 0) {
                arg0.field454++;
                return;
            }
        }
        int var2 = arg0.field444;
        int var3 = arg0.field399;
        int var4 = arg0.field451[arg0.field450 - 1] * 128 + arg0.field414 * 64;
        int var5 = arg0.field452[arg0.field450 - 1] * 128 + arg0.field414 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field444 = var4;
            arg0.field399 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field447 = 1280;
            } else if (var3 > var5) {
                arg0.field447 = 1792;
            } else {
                arg0.field447 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field447 = 768;
            } else if (var3 > var5) {
                arg0.field447 = 256;
            } else {
                arg0.field447 = 512;
            }
        } else if (var3 < var5) {
            arg0.field447 = 1024;
        } else if (var3 > var5) {
            arg0.field447 = 0;
        }
        int var6 = arg0.field447 - arg0.field400 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field449;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field406;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field434;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field408;
        }
        if (var7 == -1) {
            var7 = arg0.field406;
        }
        arg0.field446 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field376.field795;
        }
        if (var9) {
            if (arg0.field447 != arg0.field400 && arg0.field422 == -1 && arg0.field427 != 0) {
                var8 = 2;
            }
            if (arg0.field450 > 2) {
                var8 = 6;
            }
            if (arg0.field450 > 3) {
                var8 = 8;
            }
            if (arg0.field454 > 0 && arg0.field450 > 1) {
                var8 = 8;
                arg0.field454--;
            }
        } else {
            if (arg0.field450 > 1) {
                var8 = 6;
            }
            if (arg0.field450 > 2) {
                var8 = 8;
            }
            if (arg0.field454 > 0 && arg0.field450 > 1) {
                var8 = 8;
                arg0.field454--;
            }
        }
        if (arg0.field453[arg0.field450 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field446 == arg0.field406 && arg0.field410 != -1) {
            arg0.field446 = arg0.field410;
        }
        if (var2 < var4) {
            arg0.field444 += var8;
            if (arg0.field444 > var4) {
                arg0.field444 = var4;
            }
        } else if (var2 > var4) {
            arg0.field444 -= var8;
            if (arg0.field444 < var4) {
                arg0.field444 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field399 += var8;
            if (arg0.field399 > var5) {
                arg0.field399 = var5;
            }
        } else if (var3 > var5) {
            arg0.field399 -= var8;
            if (arg0.field399 < var5) {
                arg0.field399 = var5;
            }
        }
        if (arg0.field444 == var4 && arg0.field399 == var5) {
            arg0.field450--;
            if (arg0.field455 > 0) {
                arg0.field455--;
            }
        }
    }

    @ObfuscatedName("v.aa(Las;I)V")
    public static final void method193(class27 arg0) {
        if (arg0.field427 == 0) {
            return;
        }
        if (arg0.field422 != -1 && arg0.field422 < 32768) {
            class25 var1 = field496[arg0.field422];
            if (var1 != null) {
                int var2 = arg0.field444 - var1.field444;
                int var3 = arg0.field399 - var1.field399;
                if (var2 != 0 || var3 != 0) {
                    arg0.field447 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field422 >= 32768) {
            int var4 = arg0.field422 - 32768;
            if (field586 == var4) {
                var4 = 2047;
            }
            class3 var5 = field580[var4];
            if (var5 != null) {
                int var6 = arg0.field444 - var5.field444;
                int var7 = arg0.field399 - var5.field399;
                if (var6 != 0 || var7 != 0) {
                    arg0.field447 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field403 != 0 || arg0.field424 != 0) && (arg0.field450 == 0 || arg0.field454 > 0)) {
            int var8 = arg0.field444 - (arg0.field403 * 64 - Statics.field47 * 64 - Statics.field47 * 64);
            int var9 = arg0.field399 - (arg0.field424 * 64 - Statics.field196 * 64 - Statics.field196 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field447 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field403 = 0;
            arg0.field424 = 0;
        }
        int var10 = arg0.field447 - arg0.field400 & 0x7FF;
        if (var10 == 0) {
            arg0.field448 = 0;
            return;
        }
        arg0.field448++;
        if (var10 > 1024) {
            arg0.field400 -= arg0.field427;
            boolean var11 = true;
            if (var10 < arg0.field427 || var10 > 2048 - arg0.field427) {
                arg0.field400 = arg0.field447;
                var11 = false;
            }
            if (arg0.field446 == arg0.field441 && (arg0.field448 > 25 || var11)) {
                if (arg0.field404 == -1) {
                    arg0.field446 = arg0.field406;
                } else {
                    arg0.field446 = arg0.field404;
                }
            }
        } else {
            arg0.field400 += arg0.field427;
            boolean var12 = true;
            if (var10 < arg0.field427 || var10 > 2048 - arg0.field427) {
                arg0.field400 = arg0.field447;
                var12 = false;
            }
            if (arg0.field446 == arg0.field441 && (arg0.field448 > 25 || var12)) {
                if (arg0.field405 == -1) {
                    arg0.field446 = arg0.field406;
                } else {
                    arg0.field446 = arg0.field405;
                }
            }
        }
        arg0.field400 &= 0x7FF;
    }

    @ObfuscatedName("ba.ao(Las;I)V")
    public static final void method1517(class27 arg0) {
        arg0.field425 = false;
        if (arg0.field446 != -1) {
            class34 var1 = class34.method540(arg0.field446);
            if (var1 == null || var1.field863 == null) {
                arg0.field446 = -1;
            } else {
                arg0.field398++;
                if (arg0.field426 < var1.field863.length && arg0.field398 > var1.field868[arg0.field426]) {
                    arg0.field398 = 1;
                    arg0.field426++;
                    method209(var1, arg0.field426, arg0.field444, arg0.field399);
                }
                if (arg0.field426 >= var1.field863.length) {
                    arg0.field398 = 0;
                    arg0.field426 = 0;
                    method209(var1, arg0.field426, arg0.field444, arg0.field399);
                }
            }
        }
        if (arg0.field433 != -1 && field691 >= arg0.field436) {
            if (arg0.field416 < 0) {
                arg0.field416 = 0;
            }
            int var2 = class35.method1458(arg0.field433).field892;
            if (var2 == -1) {
                arg0.field433 = -1;
            } else {
                class34 var3 = class34.method540(var2);
                if (var3 == null || var3.field863 == null) {
                    arg0.field433 = -1;
                } else {
                    arg0.field435++;
                    if (arg0.field416 < var3.field863.length && arg0.field435 > var3.field868[arg0.field416]) {
                        arg0.field435 = 1;
                        arg0.field416++;
                        method209(var3, arg0.field416, arg0.field444, arg0.field399);
                    }
                    if (arg0.field416 >= var3.field863.length && (arg0.field416 < 0 || arg0.field416 >= var3.field863.length)) {
                        arg0.field433 = -1;
                    }
                }
            }
        }
        if (arg0.field428 != -1 && arg0.field411 <= 1) {
            class34 var4 = class34.method540(arg0.field428);
            if (var4.field877 == 1 && arg0.field455 > 0 && arg0.field442 <= field691 && arg0.field443 < field691) {
                arg0.field411 = 1;
                return;
            }
        }
        if (arg0.field428 != -1 && arg0.field411 == 0) {
            class34 var5 = class34.method540(arg0.field428);
            if (var5 == null || var5.field863 == null) {
                arg0.field428 = -1;
            } else {
                arg0.field430++;
                if (arg0.field419 < var5.field863.length && arg0.field430 > var5.field868[arg0.field419]) {
                    arg0.field430 = 1;
                    arg0.field419++;
                    method209(var5, arg0.field419, arg0.field444, arg0.field399);
                }
                if (arg0.field419 >= var5.field863.length) {
                    arg0.field419 -= var5.field870;
                    arg0.field432++;
                    if (arg0.field432 >= var5.field876) {
                        arg0.field428 = -1;
                    } else if (arg0.field419 >= 0 && arg0.field419 < var5.field863.length) {
                        method209(var5, arg0.field419, arg0.field444, arg0.field399);
                    } else {
                        arg0.field428 = -1;
                    }
                }
                arg0.field425 = var5.field872;
            }
        }
        if (arg0.field411 > 0) {
            arg0.field411--;
        }
    }

    @ObfuscatedName("ci.ah(Ld;III)V")
    public static void method2058(class3 arg0, int arg1, int arg2) {
        if (arg0.field428 == arg1 && arg1 != -1) {
            int var3 = class34.method540(arg1).field879;
            if (var3 == 1) {
                arg0.field419 = 0;
                arg0.field430 = 0;
                arg0.field411 = arg2;
                arg0.field432 = 0;
            }
            if (var3 == 2) {
                arg0.field432 = 0;
            }
        } else if (arg1 == -1 || arg0.field428 == -1 || class34.method540(arg1).field873 >= class34.method540(arg0.field428).field873) {
            arg0.field428 = arg1;
            arg0.field419 = 0;
            arg0.field430 = 0;
            arg0.field411 = arg2;
            arg0.field432 = 0;
            arg0.field455 = arg0.field450;
        }
    }

    @ObfuscatedName("b.au(I)V")
    public static final void method52() {
        if (!field694) {
            field587[0] = class134.field2294;
            field488[0] = "";
            field498[0] = 1006;
            field719 = 1;
        }
        if (field621 != -1) {
            int var0 = field621;
            if (class158.method3114(var0)) {
                method808(Statics.field2648[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field662; var1++) {
            if (field507[var1]) {
                field468[var1] = true;
            }
            field666[var1] = field507[var1];
            field507[var1] = false;
        }
        field663 = field691;
        field591 = -1;
        field611 = -1;
        Statics.field552 = null;
        if (field621 != -1) {
            field662 = 0;
            method811(field621, 0, 0, 765, 503, 0, 0, -1);
        }
        class89.method1845();
        boolean var2 = false;
        while (!var2) {
            var2 = true;
            for (int var3 = 0; var3 < field719 - 1; var3++) {
                if (field498[var3] < 1000 && field498[var3 + 1] > 1000) {
                    String var4 = field488[var3];
                    field488[var3] = field488[var3 + 1];
                    field488[var3 + 1] = var4;
                    String var5 = field587[var3];
                    field587[var3] = field587[var3 + 1];
                    field587[var3 + 1] = var5;
                    int var6 = field498[var3];
                    field498[var3] = field498[var3 + 1];
                    field498[var3 + 1] = var6;
                    int var7 = field604[var3];
                    field604[var3] = field604[var3 + 1];
                    field604[var3 + 1] = var7;
                    int var8 = field520[var3];
                    field520[var3] = field520[var3 + 1];
                    field520[var3 + 1] = var8;
                    int var9 = field567[var3];
                    field567[var3] = field567[var3 + 1];
                    field567[var3 + 1] = var9;
                    var2 = false;
                }
            }
        }
        if (field694) {
            int var13 = Statics.field1777;
            int var14 = Statics.field210;
            int var15 = Statics.field957;
            int var16 = Statics.field913;
            int var17 = 6116423;
            class89.method1804(var13, var14, var15, var16, var17);
            class89.method1804(var13 + 1, var14 + 1, var15 - 2, 16, 0);
            class89.method1826(var13 + 1, var14 + 18, var15 - 2, var16 - 19, 0);
            Statics.field272.method3484(class134.field2171, var13 + 3, var14 + 14, var17, -1);
            int var18 = class77.field1401;
            int var19 = class77.field1393;
            for (int var20 = 0; var20 < field719; var20++) {
                int var21 = (field719 - 1 - var20) * 15 + var14 + 31;
                int var22 = 16777215;
                if (var18 > var13 && var18 < var13 + var15 && var19 > var21 - 13 && var19 < var21 + 3) {
                    var22 = 16776960;
                }
                Statics.field272.method3484(method98(var20), var13 + 3, var21, var22, 0);
            }
            method840(Statics.field1777, Statics.field210, Statics.field957, Statics.field913);
        } else if (field591 != -1) {
            int var10 = field591;
            int var11 = field611;
            if (field719 >= 2 || field476 != 0 || field651) {
                String var12;
                if (field476 == 1 && field719 < 2) {
                    var12 = class134.field2232 + class134.field2231 + field626 + " " + class2.field21;
                } else if (field651 && field719 < 2) {
                    var12 = field619 + class134.field2231 + field620 + " " + class2.field21;
                } else {
                    var12 = method98(field719 - 1);
                }
                if (field719 > 2) {
                    var12 = var12 + class2.method177(16777215) + " " + '/' + " " + (field719 - 2) + class134.field2225;
                }
                Statics.field272.method3442(var12, var10 + 4, var11 + 15, 16777215, 0, field691 / 1000);
            }
        }
        if (field671 == 3) {
            for (int var23 = 0; var23 < field662; var23++) {
                if (field666[var23]) {
                    class89.method1832(field667[var23], field531[var23], field669[var23], field484[var23], 16711935, 128);
                } else if (field468[var23]) {
                    class89.method1832(field667[var23], field531[var23], field669[var23], field484[var23], 16711680, 128);
                }
            }
        }
        int var24 = Statics.field68;
        int var25 = Statics.field147.field444;
        int var26 = Statics.field147.field399;
        int var27 = field539;
        for (class7 var28 = (class7) class7.field103.method3355(); var28 != null; var28 = (class7) class7.field103.method3357()) {
            if (var28.field94 != -1 || var28.field98 != null) {
                int var29 = 0;
                if (var25 > var28.field97) {
                    var29 += var25 - var28.field97;
                } else if (var25 < var28.field89) {
                    var29 += var28.field89 - var25;
                }
                if (var26 > var28.field96) {
                    var29 += var26 - var28.field96;
                } else if (var26 < var28.field91) {
                    var29 += var28.field91 - var26;
                }
                if (var29 - 64 > var28.field92 || field625 == 0 || var28.field88 != var24) {
                    if (var28.field102 != null) {
                        Statics.field11.method1119(var28.field102);
                        var28.field102 = null;
                    }
                    if (var28.field87 != null) {
                        Statics.field11.method1119(var28.field87);
                        var28.field87 = null;
                    }
                } else {
                    var29 -= 64;
                    if (var29 < 0) {
                        var29 = 0;
                    }
                    int var30 = field625 * (var28.field92 - var29) / var28.field92;
                    class57 var10000;
                    if (var28.field102 != null) {
                        var28.field102.method962(var30);
                    } else if (var28.field94 >= 0) {
                        var10000 = (class57) null;
                        class57 var31 = class57.method1259(Statics.field176, var28.field94, 0);
                        if (var31 != null) {
                            class63 var32 = var31.method1263().method1327(Statics.field2056);
                            class45 var33 = class45.method1096(var32, 100, var30);
                            var33.method961(-1);
                            Statics.field11.method1109(var33);
                            var28.field102 = var33;
                        }
                    }
                    if (var28.field87 != null) {
                        var28.field87.method962(var30);
                        if (!var28.field87.method3392()) {
                            var28.field87 = null;
                        }
                    } else if (var28.field98 != null && (var28.field99 -= var27) <= 0) {
                        int var34 = (int) (Math.random() * (double) var28.field98.length);
                        var10000 = (class57) null;
                        class57 var35 = class57.method1259(Statics.field176, var28.field98[var34], 0);
                        if (var35 != null) {
                            class63 var36 = var35.method1263().method1327(Statics.field2056);
                            class45 var37 = class45.method1096(var36, 100, var30);
                            var37.method961(0);
                            Statics.field11.method1109(var37);
                            var28.field87 = var37;
                            var28.field99 = var28.field95 + (int) (Math.random() * (double) (var28.field100 - var28.field95));
                        }
                    }
                }
            }
        }
        field539 = 0;
    }

    @ObfuscatedName("cx.aw(Ljava/lang/String;ZI)V")
    public static final void method1640(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field295.method3433(arg0, 250);
        int var6 = Statics.field295.method3430(arg0, 250) * 13;
        class89.method1804(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1826(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field295.method3508(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        Statics.method1193(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method840(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field850.getGraphics();
            Statics.field1301.method1601(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field850.repaint();
        }
    }

    @ObfuscatedName("w.az(ZB)V")
    public static final void method199(boolean arg0) {
        if (Statics.field147.field444 >> 7 == field693 && Statics.field147.field399 >> 7 == field491) {
            field693 = 0;
        }
        int var1 = field581;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field147;
                var4 = 33538048;
            } else {
                var3 = field580[field582[var2]];
                var4 = field582[var2] << 14;
            }
            if (var3 != null && var3.method33()) {
                var3.field37 = false;
                if ((field463 && field581 > 50 || field581 > 200) && !arg0 && var3.field446 == var3.field441) {
                    var3.field37 = true;
                }
                int var5 = var3.field444 >> 7;
                int var6 = var3.field399 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field40 == null || field691 < var3.field35 || field691 >= var3.field36) {
                        if ((var3.field444 & 0x7F) == 64 && (var3.field399 & 0x7F) == 64) {
                            if (field690 == field563[var5][var6]) {
                                continue;
                            }
                            field563[var5][var6] = field690;
                        }
                        var3.field46 = method129(var3.field444, var3.field399, Statics.field68);
                        Statics.field112.method1956(Statics.field68, var3.field444, var3.field399, var3.field46, 60, var3, var3.field400, var4, var3.field425);
                    } else {
                        var3.field37 = false;
                        var3.field46 = method129(var3.field444, var3.field399, Statics.field68);
                        Statics.field112.method1895(Statics.field68, var3.field444, var3.field399, var3.field46, 60, var3, var3.field400, var4, var3.field33, var3.field42, var3.field43, var3.field44);
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.af(ZI)V")
    public static final void method198(boolean arg0) {
        for (int var1 = 0; var1 < field497; var1++) {
            class25 var2 = field496[field648[var1]];
            int var3 = (field648[var1] << 14) + 536870912;
            if (var2 != null && var2.method33() && var2.field376.field784 == arg0 && var2.field376.method606()) {
                int var4 = var2.field444 >> 7;
                int var5 = var2.field399 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field414 == 1 && (var2.field444 & 0x7F) == 64 && (var2.field399 & 0x7F) == 64) {
                        if (field690 == field563[var4][var5]) {
                            continue;
                        }
                        field563[var4][var5] = field690;
                    }
                    if (!var2.field376.field773) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field112.method1956(Statics.field68, var2.field444, var2.field399, method129(var2.field444 + (var2.field414 * 64 - 64), var2.field399 + (var2.field414 * 64 - 64), Statics.field68), var2.field414 * 64 - 64 + 60, var2, var2.field400, var3, var2.field425);
                }
            }
        }
    }

    @ObfuscatedName("z.ap(Las;IB)V")
    public static final void method171(class27 arg0, int arg1) {
        method686(arg0.field444, arg0.field399, arg1);
    }

    @ObfuscatedName("ae.ak(IIII)V")
    public static final void method686(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field565 = -1;
            field566 = -1;
            return;
        }
        int var3 = method129(arg0, arg1, Statics.field68) - arg2;
        int var4 = arg0 - Statics.field1457;
        int var5 = var3 - Statics.field2711;
        int var6 = arg1 - Statics.field174;
        int var7 = class104.field1770[Statics.field1919];
        int var8 = class104.field1771[Statics.field1919];
        int var9 = class104.field1770[Statics.field1776];
        int var10 = class104.field1771[Statics.field1776];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field565 = (var11 << 9) / var15 + 256;
            field566 = (var14 << 9) / var15 + 167;
        } else {
            field565 = -1;
            field566 = -1;
        }
    }

    @ObfuscatedName("c.ad(IIIB)I")
    public static final int method129(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class9.field120[var5][var3][var4] + class9.field120[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field120[var5][var3][var4 + 1] + class9.field120[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ef.ag(ZB)V")
    public static final void method2703(boolean arg0) {
        field519 = arg0;
        if (!field519) {
            int var1 = field708.method2460();
            int var2 = field708.method2600();
            int var3 = (field502 - field708.field2036) / 16;
            Statics.field1194 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1194[var4][var5] = field708.method2500();
                }
            }
            int var6 = field708.method2656();
            int var7 = field708.method2460();
            int var8 = field708.method2482();
            Statics.field198 = new int[var3];
            Statics.field2014 = new int[var3];
            Statics.field347 = new int[var3];
            Statics.field959 = new byte[var3][];
            Statics.field1259 = new byte[var3][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field198[var10] = var13;
                        Statics.field2014[var10] = Statics.field1454.method3022("m" + var11 + "_" + var12);
                        Statics.field347[var10] = Statics.field1454.method3022("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method173(var7, var2, var8, var1, var6);
            return;
        }
        int var14 = field708.method2600();
        int var15 = field708.method2460();
        int var16 = field708.method2600();
        int var17 = field708.method2489();
        int var18 = field708.method2483();
        field708.method2339();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field708.method2354(1);
                    if (var22 == 1) {
                        field655[var19][var20][var21] = field708.method2354(26);
                    } else {
                        field655[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field708.method2341();
        int var23 = (field502 - field708.field2036) / 16;
        Statics.field1194 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field1194[var24][var25] = field708.method2500();
            }
        }
        Statics.field198 = new int[var23];
        Statics.field2014 = new int[var23];
        Statics.field347 = new int[var23];
        Statics.field959 = new byte[var23][];
        Statics.field1259 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field655[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field198[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field198[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2014[var26] = Statics.field1454.method3022("m" + var35 + "_" + var36);
                            Statics.field347[var26] = Statics.field1454.method3022("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method173(var14, var17, var18, var15, var16);
    }

    @ObfuscatedName("v.ay(IIIIIS)V")
    public static final void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field860 == arg0 && Statics.field2027 == arg1 && field512 == arg2 || !field463) {
            return;
        }
        Statics.field860 = arg0;
        Statics.field2027 = arg1;
        field512 = arg2;
        if (!field463) {
            field512 = 0;
        }
        method125(25);
        method1640(class134.field2133, true);
        int var5 = Statics.field47;
        int var6 = Statics.field196;
        Statics.field47 = (arg0 - 6) * 8;
        Statics.field196 = (arg1 - 6) * 8;
        int var7 = Statics.field47 - var5;
        int var8 = Statics.field196 - var6;
        int var9 = Statics.field47;
        int var10 = Statics.field196;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field496[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field451[var13] -= var7;
                    var12.field452[var13] -= var8;
                }
                var12.field444 -= var7 * 128;
                var12.field399 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field580[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field451[var16] -= var7;
                    var15.field452[var16] -= var8;
                }
                var15.field444 -= var7 * 128;
                var15.field399 -= var8 * 128;
            }
        }
        Statics.field68 = arg2;
        Statics.field147.method234(arg3, arg4, false);
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
                        field594[var27][var23][var24] = field594[var27][var25][var26];
                    } else {
                        field594[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field668.method3355(); var28 != null; var28 = (class22) field668.method3357()) {
            var28.field337 -= var7;
            var28.field338 -= var8;
            if (var28.field337 < 0 || var28.field338 < 0 || var28.field337 >= 104 || var28.field338 >= 104) {
                var28.method3395();
            }
        }
        if (field693 != 0) {
            field693 -= var7;
            field491 -= var8;
        }
        field701 = 0;
        field707 = false;
        field688 = -1;
        field597.method3349();
        field596.method3349();
    }

    @ObfuscatedName("v.ai(ZI)V")
    public static final void method181(boolean arg0) {
        method2440();
        field704++;
        if (field704 < 50 && !arg0) {
            return;
        }
        field704 = 0;
        if (field510 || Statics.field266 == null) {
            return;
        }
        field509.method2337(131);
        try {
            Statics.field266.method1383(field509.field2037, 0, field509.field2036);
            field509.field2036 = 0;
        } catch (IOException var2) {
            field510 = true;
        }
    }

    @ObfuscatedName("i.ar(II)V")
    public static final void method116(int arg0) {
        int[] var1 = Statics.field1021.field1459;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field133[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field112.method1917(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field133[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field112.method1917(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1021.method1685();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field133[arg0][var10][var9] & 0x18) == 0) {
                    method2398(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field133[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2398(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field689 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field112.method1995(Statics.field68, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class32.method211(var14).field836;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field518[Statics.field68].field2751;
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
                        field499[field689] = Statics.field2009[var15];
                        field595[field689] = var16;
                        field477[field689] = var17;
                        field689++;
                    }
                }
            }
        }
        Statics.field1301.method1672();
    }

    @ObfuscatedName("dg.br(IIIIII)V")
    public static final void method2398(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field112.method1909(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field112.method1913(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1021.field1459;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method211(var12);
            if (var13.field825 == -1) {
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
                class87 var14 = Statics.field280[var13.field825];
                if (var14 != null) {
                    int var15 = (var13.field811 * 4 - var14.field1473) / 2;
                    int var16 = (var13.field812 * 4 - var14.field1471) / 2;
                    var14.method1783(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field812) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field112.method1911(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field112.method1913(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method211(var21);
            if (var22.field825 != -1) {
                class87 var23 = Statics.field280[var22.field825];
                if (var23 != null) {
                    int var24 = (var22.field811 * 4 - var23.field1473) / 2;
                    int var25 = (var22.field812 * 4 - var23.field1471) / 2;
                    var23.method1783(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field812) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1021.field1459;
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
        int var29 = Statics.field112.method1995(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method211(var30);
        if (var31.field825 == -1) {
            return;
        }
        class87 var32 = Statics.field280[var31.field825];
        if (var32 != null) {
            int var33 = (var31.field811 * 4 - var32.field1473) / 2;
            int var34 = (var31.field812 * 4 - var32.field1471) / 2;
            var32.method1783(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field812) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("aj.bd(IIII)Z")
    public static final boolean method562(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field112.method1913(Statics.field68, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method211(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field811;
                var9 = var7.field812;
            } else {
                var8 = var7.field812;
                var9 = var7.field811;
            }
            int var10 = var7.field813;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method94(Statics.field147.field451[0], Statics.field147.field452[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method94(Statics.field147.field451[0], Statics.field147.field452[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field716 = class77.field1399;
        field568 = class77.field1400;
        field570 = 2;
        field569 = 0;
        return true;
    }

    @ObfuscatedName("p.be(IIIIZIIIIIII)Z")
    public static final boolean method94(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field523[var11][var12] = 0;
                field524[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field523[arg0][arg1] = 99;
        field524[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field525[var15] = arg0;
        int var36 = var15 + 1;
        field526[var15] = arg1;
        boolean var17 = false;
        int var18 = field525.length;
        int[][] var19 = field518[Statics.field68].field2751;
        while (var36 != var16) {
            var13 = field525[var16];
            var14 = field526[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field518[Statics.field68].method3234(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field518[Statics.field68].method3244(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field518[Statics.field68].method3242(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field524[var13][var14] + 1;
            if (var13 > 0 && field523[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field525[var36] = var13 - 1;
                field526[var36] = var14;
                var36 = (var36 + 1) % var18;
                field523[var13 - 1][var14] = 2;
                field524[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field523[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field525[var36] = var13 + 1;
                field526[var36] = var14;
                var36 = (var36 + 1) % var18;
                field523[var13 + 1][var14] = 8;
                field524[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field523[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field525[var36] = var13;
                field526[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field523[var13][var14 - 1] = 1;
                field524[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field523[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field525[var36] = var13;
                field526[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field523[var13][var14 + 1] = 4;
                field524[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field523[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field525[var36] = var13 - 1;
                field526[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field523[var13 - 1][var14 - 1] = 3;
                field524[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field523[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field525[var36] = var13 + 1;
                field526[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field523[var13 + 1][var14 - 1] = 9;
                field524[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field523[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field525[var36] = var13 - 1;
                field526[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field523[var13 - 1][var14 + 1] = 6;
                field524[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field523[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field525[var36] = var13 + 1;
                field526[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field523[var13 + 1][var14 + 1] = 12;
                field524[var13 + 1][var14 + 1] = var20;
            }
        }
        field462 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field524[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field524[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field524[var24][var25];
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
            field462 = 1;
        }
        byte var29 = 0;
        field525[var29] = var13;
        int var37 = var29 + 1;
        field526[var29] = var14;
        int var30;
        int var31 = var30 = field523[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field525[var37] = var13;
                field526[var37++] = var14;
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
            var31 = field523[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field525[var37];
            int var34 = field526[var37];
            if (arg10 == 0) {
                field509.method2337(142);
                field509.method2444(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field509.method2337(246);
                field509.method2444(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field509.method2337(154);
                field509.method2444(var32 + var32 + 3);
            }
            field509.method2607(class75.field1344[82] ? 1 : 0);
            field509.method2487(Statics.field196 + var34);
            field509.method2487(Statics.field47 + var33);
            field693 = field525[0];
            field491 = field526[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field509.method2478(field525[var37] - var33);
                field509.method2478(field526[var37] - var34);
            }
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("j.bl(I)Z")
    public static final boolean method68() {
        if (Statics.field266 == null) {
            return false;
        }
        try {
            int var0 = Statics.field266.method1381();
            if (var0 == 0) {
                return false;
            }
            if (field503 == -1) {
                Statics.field266.method1385(field708.field2037, 0, 1);
                field708.field2036 = 0;
                field503 = field708.method2335();
                field502 = class165.field2774[field503];
                var0--;
            }
            if (field502 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field266.method1385(field708.field2037, 0, 1);
                field502 = field708.field2037[0] & 0xFF;
                var0--;
            }
            if (field502 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field266.method1385(field708.field2037, 0, 2);
                field708.field2036 = 0;
                field502 = field708.method2460();
                var0 -= 2;
            }
            if (var0 < field502) {
                return false;
            }
            field708.field2036 = 0;
            Statics.field266.method1385(field708.field2037, 0, field502);
            field504 = 0;
            field493 = field508;
            field508 = field610;
            field610 = field503;
            if (field503 == 182) {
                byte var1 = field708.method2485();
                int var2 = field708.method2656();
                class159.field2704[var2] = var1;
                if (class159.field2705[var2] != var1) {
                    class159.field2705[var2] = var1;
                    method648(var2);
                }
                field645[++field692 - 1 & 0x1F] = var2;
                field503 = -1;
                return true;
            }
            if (field503 == 198) {
                int var3 = field708.method2460();
                int var4 = field708.method2489();
                int var5 = field708.method2489();
                int var6 = field708.method2498();
                class158 var7 = class158.method792(var6);
                if (var7.field2626 != var5 || var7.field2627 != var3 || var7.field2629 != var4) {
                    var7.field2626 = var5;
                    var7.field2627 = var3;
                    var7.field2629 = var4;
                    method41(var7);
                }
                field503 = -1;
                return true;
            }
            if (field503 == 241) {
                method117();
                field685 = field708.method2534();
                field654 = field646;
                field503 = -1;
                return true;
            }
            if (field503 == 109) {
                field707 = true;
                Statics.field2379 = field708.method2534();
                Statics.field725 = field708.method2534();
                Statics.field197 = field708.method2460();
                Statics.field283 = field708.method2534();
                Statics.field918 = field708.method2534();
                if (Statics.field918 >= 100) {
                    int var8 = Statics.field2379 * 128 + 64;
                    int var9 = Statics.field725 * 128 + 64;
                    int var10 = method129(var8, var9, Statics.field68) - Statics.field197;
                    int var11 = var8 - Statics.field1457;
                    int var12 = var10 - Statics.field2711;
                    int var13 = var9 - Statics.field174;
                    int var14 = (int) Math.sqrt((double) (var11 * var11 + var13 * var13));
                    Statics.field1919 = (int) (Math.atan2((double) var12, (double) var14) * 325.949D) & 0x7FF;
                    Statics.field1776 = (int) (Math.atan2((double) var11, (double) var13) * -325.949D) & 0x7FF;
                    if (Statics.field1919 < 128) {
                        Statics.field1919 = 128;
                    }
                    if (Statics.field1919 > 383) {
                        Statics.field1919 = 383;
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 47) {
                method2703(false);
                field503 = -1;
                return true;
            }
            if (field503 == 114) {
                int var15 = field708.method2534();
                int var16 = field708.method2483();
                int var17 = field708.method2483();
                Statics.field68 = var15 >> 1;
                Statics.field147.method234(var17, var16, (var15 & 0x1) == 1);
                field503 = -1;
                return true;
            }
            if (field503 == 71) {
                int var18 = field708.method2628();
                int var19 = field708.method2460();
                if (var18 < -70000) {
                    var19 += 32768;
                }
                class158 var20;
                if (var18 >= 0) {
                    var20 = class158.method792(var18);
                } else {
                    var20 = null;
                }
                while (field708.field2036 < field502) {
                    int var21 = field708.method2637();
                    int var22 = field708.method2460();
                    int var23 = 0;
                    if (var22 != 0) {
                        var23 = field708.method2534();
                        if (var23 == 255) {
                            var23 = field708.method2628();
                        }
                    }
                    if (var20 != null && var21 >= 0 && var21 < var20.field2644.length) {
                        var20.field2644[var21] = var22;
                        var20.field2689[var21] = var23;
                    }
                    class19.method2230(var19, var21, var22 - 1, var23);
                }
                if (var20 != null) {
                    method41(var20);
                }
                method117();
                field478[++field533 - 1 & 0x1F] = var19 & 0x7FFF;
                field503 = -1;
                return true;
            }
            if (field503 == 103) {
                String var24 = field708.method2466();
                long var25 = (long) field708.method2460();
                long var27 = (long) field708.method2462();
                int var29 = field708.method2534();
                long var30 = (var25 << 32) + var27;
                boolean var32 = false;
                for (int var33 = 0; var33 < 100; var33++) {
                    if (field717[var33] == var30) {
                        var32 = true;
                        break;
                    }
                }
                if (method200(var24)) {
                    var32 = true;
                }
                if (!var32 && field579 == 0) {
                    field717[field681] = var30;
                    field681 = (field681 + 1) % 100;
                    String var34 = class185.method3435(class147.method809(class184.method138(field708)));
                    if (var29 == 2 || var29 == 3) {
                        method2740(7, class2.method1873(1) + var24, var34);
                    } else if (var29 == 1) {
                        method2740(7, class2.method1873(0) + var24, var34);
                    } else {
                        method2740(3, var24, var34);
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 202) {
                method117();
                field481 = field708.method2461();
                field654 = field646;
                field503 = -1;
                return true;
            }
            if (field503 == 203) {
                int var35 = field708.method2600();
                int var36 = field708.method2498();
                int var37 = var35 >> 10 & 0x1F;
                int var38 = var35 >> 5 & 0x1F;
                int var39 = var35 & 0x1F;
                int var40 = (var39 << 3) + (var37 << 19) + (var38 << 11);
                class158 var41 = class158.method792(var36);
                if (var41.field2657 != var40) {
                    var41.field2657 = var40;
                    method41(var41);
                }
                field503 = -1;
                return true;
            }
            if (field503 == 199) {
                int var42 = field708.method2534();
                class137[] var43 = class137.method1556();
                int var44 = 0;
                class137 var46;
                while (true) {
                    if (var44 >= var43.length) {
                        var46 = null;
                        break;
                    }
                    class137 var45 = var43[var44];
                    if (var45.field2324 == var42) {
                        var46 = var45;
                        break;
                    }
                    var44++;
                }
                Statics.field239 = var46;
                field503 = -1;
                return true;
            }
            if (field503 == 242) {
                method918();
                field503 = -1;
                return false;
            }
            if (field503 == 160) {
                String var47 = field708.method2466();
                Object[] var48 = new Object[var47.length() + 1];
                for (int var49 = var47.length() - 1; var49 >= 0; var49--) {
                    if (var47.charAt(var49) == 's') {
                        var48[var49 + 1] = field708.method2466();
                    } else {
                        var48[var49 + 1] = Integer.valueOf(field708.method2628());
                    }
                }
                var48[0] = Integer.valueOf(field708.method2628());
                class1 var50 = new class1();
                var50.field13 = var48;
                class26.method2369(var50);
                field503 = -1;
                return true;
            }
            if (field503 == 36) {
                int var51 = field708.method2656();
                if (var51 == 65535) {
                    var51 = -1;
                }
                int var52 = field708.method2498();
                int var53 = field708.method2460();
                if (var53 == 65535) {
                    var53 = -1;
                }
                int var54 = field708.method2498();
                for (int var55 = var53; var55 <= var51; var55++) {
                    long var56 = ((long) var54 << 32) + (long) var55;
                    class179 var58 = field661.method3337(var56);
                    if (var58 != null) {
                        var58.method3395();
                    }
                    field661.method3334(new class171(var52), var56);
                }
                field503 = -1;
                return true;
            }
            if (field503 == 156) {
                field693 = 0;
                field503 = -1;
                return true;
            }
            if (field503 == 166) {
                field708.field2036 += 28;
                if (field708.method2477()) {
                    class116 var59 = field708;
                    int var60 = field708.field2036 - 28;
                    if (class82.field1427 != null) {
                        try {
                            class82.field1427.method565(0L);
                            class82.field1427.method570(var59.field2037, var60, 24);
                        } catch (Exception var304) {
                        }
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 108) {
                int var62 = field708.method2628();
                int var63 = field708.method2460();
                if (var62 < -70000) {
                    var63 += 32768;
                }
                class158 var64;
                if (var62 >= 0) {
                    var64 = class158.method792(var62);
                } else {
                    var64 = null;
                }
                if (var64 != null) {
                    for (int var65 = 0; var65 < var64.field2644.length; var65++) {
                        var64.field2644[var65] = 0;
                        var64.field2689[var65] = 0;
                    }
                }
                class19 var66 = (class19) class19.field281.method3337((long) var63);
                if (var66 != null) {
                    for (int var67 = 0; var67 < var66.field284.length; var67++) {
                        var66.field284[var67] = -1;
                        var66.field276[var67] = 0;
                    }
                }
                int var68 = field708.method2460();
                for (int var69 = 0; var69 < var68; var69++) {
                    int var70 = field708.method2483();
                    if (var70 == 255) {
                        var70 = field708.method2648();
                    }
                    int var71 = field708.method2656();
                    if (var64 != null && var69 < var64.field2644.length) {
                        var64.field2644[var69] = var71;
                        var64.field2689[var69] = var70;
                    }
                    class19.method2230(var63, var69, var71 - 1, var70);
                }
                if (var64 != null) {
                    method41(var64);
                }
                method117();
                field478[++field533 - 1 & 0x1F] = var63 & 0x7FFF;
                field503 = -1;
                return true;
            }
            if (field503 == 157) {
                String var72 = field708.method2466();
                if (var72.endsWith(":tradereq:")) {
                    String var73 = var72.substring(0, var72.indexOf(":"));
                    boolean var74 = false;
                    if (method200(var73)) {
                        var74 = true;
                    }
                    if (!var74 && field579 == 0) {
                        method2740(4, var73, class134.field2216);
                    }
                } else if (var72.endsWith(":duelreq:")) {
                    String var75 = var72.substring(0, var72.indexOf(":"));
                    boolean var76 = false;
                    if (method200(var75)) {
                        var76 = true;
                    }
                    if (!var76 && field579 == 0) {
                        method2740(8, var75, class134.field2217);
                    }
                } else if (var72.endsWith(":chalreq:")) {
                    String var77 = var72.substring(0, var72.indexOf(":"));
                    boolean var78 = false;
                    if (method200(var77)) {
                        var78 = true;
                    }
                    if (!var78 && field579 == 0) {
                        String var79 = var72.substring(var72.indexOf(":") + 1, var72.length() - 9);
                        method2740(8, var77, var79);
                    }
                } else if (var72.endsWith(":assistreq:")) {
                    String var80 = var72.substring(0, var72.indexOf(":"));
                    boolean var81 = false;
                    if (method200(var80)) {
                        var81 = true;
                    }
                    if (!var81 && field579 == 0) {
                        method2740(10, var80, "");
                    }
                } else if (var72.endsWith(":clan:")) {
                    String var82 = var72.substring(0, var72.indexOf(":clan:"));
                    method2740(11, "", var82);
                } else if (var72.endsWith(":trade:")) {
                    String var83 = var72.substring(0, var72.indexOf(":trade:"));
                    if (field579 == 0) {
                        method2740(12, "", var83);
                    }
                } else if (var72.endsWith(":assist:")) {
                    String var84 = var72.substring(0, var72.indexOf(":assist:"));
                    if (field579 == 0) {
                        method2740(13, "", var84);
                    }
                } else {
                    method2740(0, "", var72);
                }
                field503 = -1;
                return true;
            }
            if (field503 == 120) {
                int var85 = field708.method2500();
                Statics.field485 = Statics.field1637.method1494(var85);
                field503 = -1;
                return true;
            }
            if (field503 == 188) {
                for (int var86 = 0; var86 < Statics.field1022; var86++) {
                    class42 var87 = (class42) class42.field1025.method3288((long) var86);
                    class42 var88;
                    if (var87 == null) {
                        byte[] var89 = Statics.field1027.method2991(16, var86);
                        class42 var90 = new class42();
                        if (var89 != null) {
                            var90.method910(new class127(var89));
                        }
                        class42.field1025.method3291(var90, (long) var86);
                        var88 = var90;
                    } else {
                        var88 = var87;
                    }
                    if (var88 != null && var88.field1019 == 0) {
                        class159.field2704[var86] = 0;
                        class159.field2705[var86] = 0;
                    }
                }
                method117();
                field692 += 32;
                field503 = -1;
                return true;
            }
            if (field503 == 170) {
                method141();
                field503 = -1;
                return true;
            }
            if (field503 == 135) {
                if (field621 != -1) {
                    int var92 = field621;
                    if (class158.method3114(var92)) {
                        method14(Statics.field2648[var92], 0);
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 164) {
                method2703(true);
                field503 = -1;
                return true;
            }
            if (field503 == 187) {
                field588 = 0;
                field634 = 0;
                method102();
                method682();
                method1581();
                for (int var93 = 0; var93 < field588; var93++) {
                    int var94 = field589[var93];
                    if (field691 != field496[var94].field445) {
                        field496[var94].field376 = null;
                        field496[var94] = null;
                    }
                }
                if (field502 != field708.field2036) {
                    throw new RuntimeException(field708.field2036 + class2.field15 + field502);
                }
                for (int var95 = 0; var95 < field497; var95++) {
                    if (field496[field648[var95]] == null) {
                        throw new RuntimeException(var95 + class2.field15 + field497);
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 214) {
                int var96 = field708.method2460();
                class19.method2330(var96);
                field478[++field533 - 1 & 0x1F] = var96 & 0x7FFF;
                field503 = -1;
                return true;
            }
            if (field503 == 48) {
                int var97 = field708.method2656();
                field621 = var97;
                if (class158.method3114(var97)) {
                    class158[] var98 = Statics.field2648[var97];
                    for (int var99 = 0; var99 < var98.length; var99++) {
                        class158 var100 = var98[var99];
                        if (var100 != null) {
                            var100.field2692 = 0;
                            var100.field2584 = 0;
                        }
                    }
                }
                int var101 = field621;
                if (var101 != -1 && class158.method3114(var101)) {
                    class158[] var102 = Statics.field2648[var101];
                    for (int var103 = 0; var103 < var102.length; var103++) {
                        class158 var104 = var102[var103];
                        if (var104.field2654 != null) {
                            class1 var105 = new class1();
                            var105.field2 = var104;
                            var105.field13 = var104.field2654;
                            class26.method2369(var105);
                        }
                    }
                }
                for (int var106 = 0; var106 < 100; var106++) {
                    field507[var106] = true;
                }
                field503 = -1;
                return true;
            }
            if (field503 == 151) {
                int var107 = field708.method2460();
                int var108 = field708.method2534();
                int var109 = field708.method2460();
                method895(var107, var108, var109);
                field503 = -1;
                return true;
            }
            if (field503 == 43) {
                int var110 = field708.method2600();
                if (var110 == 65535) {
                    var110 = -1;
                }
                int var111 = field708.method2498();
                int var112 = field708.method2628();
                class158 var113 = class158.method792(var112);
                if (var113.field2595) {
                    var113.field2667 = var110;
                    var113.field2691 = var111;
                    class40 var115 = class40.method30(var110);
                    var113.field2626 = var115.field976;
                    var113.field2627 = var115.field977;
                    var113.field2682 = var115.field978;
                    var113.field2624 = var115.field979;
                    var113.field2625 = var115.field970;
                    var113.field2629 = var115.field975;
                    if (var113.field2613 > 0) {
                        var113.field2629 = var113.field2629 * 32 / var113.field2613;
                    }
                    method41(var113);
                } else if (var110 == -1) {
                    var113.field2618 = 0;
                    field503 = -1;
                    return true;
                } else {
                    class40 var114 = class40.method30(var110);
                    var113.field2618 = 4;
                    var113.field2619 = var110;
                    var113.field2626 = var114.field976;
                    var113.field2627 = var114.field977;
                    var113.field2629 = var114.field975 * 100 / var111;
                    method41(var113);
                }
                field503 = -1;
                return true;
            }
            if (field503 == 123) {
                int var116 = field708.method2483();
                String var117 = field708.method2466();
                int var118 = field708.method2482();
                if (var116 >= 1 && var116 <= 8) {
                    if (var117.equalsIgnoreCase("null")) {
                        var117 = null;
                    }
                    field473[var116 - 1] = var117;
                    field592[var116 - 1] = var118 == 0;
                }
                field503 = -1;
                return true;
            }
            if (field503 == 129) {
                String var119 = field708.method2466();
                int var120 = field708.method2648();
                class158 var121 = class158.method792(var120);
                if (!var119.equals(var121.field2633)) {
                    var121.field2633 = var119;
                    method41(var121);
                }
                field503 = -1;
                return true;
            }
            if (field503 == 253) {
                int var122 = field708.method2656();
                int var123 = field708.method2482();
                int var124 = field708.method2648();
                class4 var125 = (class4) field622.method3337((long) var124);
                if (var125 != null) {
                    method2205(var125, var125.field54 != var122);
                }
                method2325(var124, var122, var123);
                field503 = -1;
                return true;
            }
            if (field503 == 93) {
                field707 = false;
                for (int var126 = 0; var126 < 5; var126++) {
                    field492[var126] = false;
                }
                field503 = -1;
                return true;
            }
            if (field503 == 177) {
                int var127 = field502 + field708.field2036;
                int var128 = field708.method2460();
                int var129 = field708.method2460();
                if (field621 != var128) {
                    field621 = var128;
                    int var130 = field621;
                    if (class158.method3114(var130)) {
                        class158[] var131 = Statics.field2648[var130];
                        for (int var132 = 0; var132 < var131.length; var132++) {
                            class158 var133 = var131[var132];
                            if (var133 != null) {
                                var133.field2692 = 0;
                                var133.field2584 = 0;
                            }
                        }
                    }
                    int var134 = field621;
                    if (var134 != -1 && class158.method3114(var134)) {
                        class158[] var135 = Statics.field2648[var134];
                        for (int var136 = 0; var136 < var135.length; var136++) {
                            class158 var137 = var135[var136];
                            if (var137.field2654 != null) {
                                class1 var138 = new class1();
                                var138.field2 = var137;
                                var138.field13 = var137.field2654;
                                class26.method2369(var138);
                            }
                        }
                    }
                    for (int var139 = 0; var139 < 100; var139++) {
                        field507[var139] = true;
                    }
                }
                while (var129-- > 0) {
                    int var140 = field708.method2628();
                    int var141 = field708.method2460();
                    int var142 = field708.method2534();
                    class4 var143 = (class4) field622.method3337((long) var140);
                    if (var143 != null && var143.field54 != var141) {
                        method2205(var143, true);
                        var143 = null;
                    }
                    if (var143 == null) {
                        var143 = method2325(var140, var141, var142);
                    }
                    var143.field51 = true;
                }
                for (class4 var144 = (class4) field622.method3335(); var144 != null; var144 = (class4) field622.method3342()) {
                    if (var144.field51) {
                        var144.field51 = false;
                    } else {
                        method2205(var144, true);
                    }
                }
                field661 = new class175(512);
                while (field708.field2036 < var127) {
                    int var145 = field708.method2628();
                    int var146 = field708.method2460();
                    int var147 = field708.method2460();
                    int var148 = field708.method2628();
                    for (int var149 = var146; var149 <= var147; var149++) {
                        long var150 = ((long) var145 << 32) + (long) var149;
                        field661.method3334(new class171(var148), var150);
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 222) {
                Statics.field1804 = field708.method2481();
                Statics.field2456 = field708.method2482();
                while (field708.field2036 < field502) {
                    field503 = field708.method2534();
                    method143();
                }
                field503 = -1;
                return true;
            }
            if (field503 == 171) {
                int var152 = field708.method2500();
                class158 var153 = class158.method792(var152);
                var153.field2618 = 3;
                var153.field2619 = Statics.field147.field29.method3205();
                method41(var153);
                field503 = -1;
                return true;
            }
            if (field503 == 234) {
                int var154 = field708.method2648();
                class158 var155 = class158.method792(var154);
                for (int var156 = 0; var156 < var155.field2644.length; var156++) {
                    var155.field2644[var156] = -1;
                    var155.field2644[var156] = 0;
                }
                method41(var155);
                field503 = -1;
                return true;
            }
            if (field503 == 254) {
                int var157 = field708.method2628();
                class4 var158 = (class4) field622.method3337((long) var157);
                if (var158 != null) {
                    method2205(var158, true);
                }
                if (field460 != null) {
                    method41(field460);
                    field460 = null;
                }
                field503 = -1;
                return true;
            }
            if (field503 == 72) {
                String var159 = field708.method2466();
                int var160 = field708.method2460();
                byte var161 = field708.method2459();
                boolean var162 = false;
                if (var161 == -128) {
                    var162 = true;
                }
                if (var162) {
                    if (Statics.field2570 == 0) {
                        field503 = -1;
                        return true;
                    }
                    boolean var163 = false;
                    int var164;
                    for (var164 = 0; var164 < Statics.field2570 && (!Statics.field1436[var164].field105.equals(var159) || Statics.field1436[var164].field113 != var160); var164++) {
                    }
                    if (var164 < Statics.field2570) {
                        while (var164 < Statics.field2570 - 1) {
                            Statics.field1436[var164] = Statics.field1436[var164 + 1];
                            var164++;
                        }
                        Statics.field2570--;
                        Statics.field1436[Statics.field2570] = null;
                    }
                } else {
                    field708.method2466();
                    class8 var165 = new class8();
                    var165.field105 = var159;
                    var165.field106 = class148.method2054(var165.field105, Statics.field1304);
                    var165.field113 = var160;
                    var165.field111 = var161;
                    int var166;
                    for (var166 = Statics.field2570 - 1; var166 >= 0; var166--) {
                        int var167 = Statics.field1436[var166].field106.compareTo(var165.field105);
                        if (var167 == 0) {
                            Statics.field1436[var166].field113 = var160;
                            Statics.field1436[var166].field111 = var161;
                            if (var159.equals(Statics.field147.field39)) {
                                Statics.field393 = var161;
                            }
                            field653 = field646;
                            field503 = -1;
                            return true;
                        }
                        if (var167 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2570 >= Statics.field1436.length) {
                        field503 = -1;
                        return true;
                    }
                    for (int var168 = Statics.field2570 - 1; var168 > var166; var168--) {
                        Statics.field1436[var168 + 1] = Statics.field1436[var168];
                    }
                    if (Statics.field2570 == 0) {
                        Statics.field1436 = new class8[100];
                    }
                    Statics.field1436[var166 + 1] = var165;
                    Statics.field2570++;
                    if (var159.equals(Statics.field147.field39)) {
                        Statics.field393 = var161;
                    }
                }
                field653 = field646;
                field503 = -1;
                return true;
            }
            if (field503 == 60) {
                int var169 = field708.method2460();
                int var170 = field708.method2648();
                class158 var171 = class158.method792(var170);
                if (var171 != null && var171.field2588 == 0) {
                    if (var169 > var171.field2602 - var171.field2697) {
                        var169 = var171.field2602 - var171.field2697;
                    }
                    if (var169 < 0) {
                        var169 = 0;
                    }
                    if (var171.field2600 != var169) {
                        var171.field2600 = var169;
                        method41(var171);
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 252) {
                String var172 = field708.method2466();
                String var173 = class185.method3435(class147.method809(class184.method138(field708)));
                method2740(6, var172, var173);
                field503 = -1;
                return true;
            }
            if (field503 == 57) {
                for (int var174 = 0; var174 < class159.field2705.length; var174++) {
                    if (class159.field2705[var174] != class159.field2704[var174]) {
                        class159.field2705[var174] = class159.field2704[var174];
                        method648(var174);
                        field645[++field692 - 1 & 0x1F] = var174;
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 38) {
                class116 var175 = field708;
                int var176 = field502;
                class181 var177 = new class181();
                var177.field2829 = var175.method2534();
                var177.field2825 = var175.method2628();
                var177.field2822 = new int[var177.field2829];
                var177.field2820 = new int[var177.field2829];
                var177.field2823 = new Field[var177.field2829];
                var177.field2821 = new int[var177.field2829];
                var177.field2826 = new Method[var177.field2829];
                var177.field2827 = new byte[var177.field2829][][];
                for (int var178 = 0; var178 < var177.field2829; var178++) {
                    try {
                        int var179 = var175.method2534();
                        if (var179 == 0 || var179 == 1 || var179 == 2) {
                            String var180 = new String(var175.method2466());
                            String var181 = new String(var175.method2466());
                            int var182 = 0;
                            if (var179 == 1) {
                                var182 = var175.method2628();
                            }
                            var177.field2822[var178] = var179;
                            var177.field2821[var178] = var182;
                            var177.field2823[var178] = class182.method2975(var180).getDeclaredField(var181);
                        } else if (var179 == 3 || var179 == 4) {
                            String var183 = new String(var175.method2466());
                            String var184 = new String(var175.method2466());
                            int var185 = var175.method2534();
                            String[] var186 = new String[var185];
                            for (int var187 = 0; var187 < var185; var187++) {
                                var186[var187] = new String(var175.method2466());
                            }
                            byte[][] var188 = new byte[var185][];
                            if (var179 == 3) {
                                for (int var189 = 0; var189 < var185; var189++) {
                                    int var190 = var175.method2628();
                                    var188[var189] = new byte[var190];
                                    var175.method2469(var188[var189], 0, var190);
                                }
                            }
                            var177.field2822[var178] = var179;
                            Class[] var191 = new Class[var185];
                            for (int var192 = 0; var192 < var185; var192++) {
                                var191[var192] = class182.method2975(var186[var192]);
                            }
                            var177.field2826[var178] = class182.method2975(var183).getDeclaredMethod(var184, var191);
                            var177.field2827[var178] = var188;
                        }
                    } catch (ClassNotFoundException var305) {
                        var177.field2820[var178] = -1;
                    } catch (SecurityException var306) {
                        var177.field2820[var178] = -2;
                    } catch (NullPointerException var307) {
                        var177.field2820[var178] = -3;
                    } catch (Exception var308) {
                        var177.field2820[var178] = -4;
                    } catch (Throwable var309) {
                        var177.field2820[var178] = -5;
                    }
                }
                class182.field2831.method3350(var177);
                field503 = -1;
                return true;
            }
            if (field503 == 246) {
                while (field708.field2036 < field502) {
                    boolean var198 = field708.method2534() == 1;
                    String var199 = field708.method2466();
                    String var200 = field708.method2466();
                    int var201 = field708.method2460();
                    int var202 = field708.method2534();
                    int var203 = field708.method2534();
                    boolean var204 = (var203 & 0x2) != 0;
                    boolean var205 = (var203 & 0x1) != 0;
                    if (var201 > 0) {
                        field708.method2466();
                        field708.method2534();
                        field708.method2628();
                    }
                    field708.method2466();
                    for (int var206 = 0; var206 < field703; var206++) {
                        class23 var207 = field715[var206];
                        if (var198) {
                            if (var200.equals(var207.field353)) {
                                var207.field353 = var199;
                                var207.field361 = var200;
                                var199 = null;
                                break;
                            }
                        } else if (var199.equals(var207.field353)) {
                            if (var207.field354 != var201) {
                                boolean var208 = true;
                                for (class28 var209 = (class28) field713.method3321(); var209 != null; var209 = (class28) field713.method3316()) {
                                    if (var209.field732.equals(var199)) {
                                        if (var201 != 0 && var209.field730 == 0) {
                                            var209.method3388();
                                            var208 = false;
                                        } else if (var201 == 0 && var209.field730 != 0) {
                                            var209.method3388();
                                            var208 = false;
                                        }
                                    }
                                }
                                if (var208) {
                                    field713.method3317(new class28(var199, var201));
                                }
                                var207.field354 = var201;
                            }
                            var207.field361 = var200;
                            var207.field355 = var202;
                            var207.field356 = var204;
                            var207.field357 = var205;
                            var199 = null;
                            break;
                        }
                    }
                    if (var199 != null && field703 < 200) {
                        class23 var210 = new class23();
                        field715[field703] = var210;
                        var210.field353 = var199;
                        var210.field361 = var200;
                        var210.field354 = var201;
                        var210.field355 = var202;
                        var210.field356 = var204;
                        var210.field357 = var205;
                        field703++;
                    }
                }
                field714 = 2;
                field652 = field646;
                boolean var211 = false;
                int var212 = field703;
                while (var212 > 0) {
                    boolean var213 = true;
                    var212--;
                    for (int var214 = 0; var214 < var212; var214++) {
                        boolean var215 = false;
                        class23 var216 = field715[var214];
                        class23 var217 = field715[var214 + 1];
                        if (field665 != var216.field354 && field665 == var217.field354) {
                            var215 = true;
                        }
                        if (!var215 && var216.field354 == 0 && var217.field354 != 0) {
                            var215 = true;
                        }
                        if (!var215 && !var216.field356 && var217.field356) {
                            var215 = true;
                        }
                        if (!var215 && !var216.field357 && var217.field357) {
                            var215 = true;
                        }
                        if (var215) {
                            class23 var218 = field715[var214];
                            field715[var214] = field715[var214 + 1];
                            field715[var214 + 1] = var218;
                            var213 = false;
                        }
                    }
                    if (var213) {
                        break;
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 112) {
                field714 = 1;
                field652 = field646;
                field503 = -1;
                return true;
            }
            if (field503 == 101) {
                field653 = field646;
                if (field502 == 0) {
                    field686 = null;
                    field687 = null;
                    Statics.field2570 = 0;
                    Statics.field1436 = null;
                    field503 = -1;
                    return true;
                }
                field687 = field708.method2466();
                long var219 = field708.method2464();
                long var221 = var219;
                String var223;
                if (var219 <= 0L || var219 >= 6582952005840035281L) {
                    var223 = null;
                } else if (var219 % 37L == 0L) {
                    var223 = null;
                } else {
                    int var224 = 0;
                    for (long var225 = var219; var225 != 0L; var225 /= 37L) {
                        var224++;
                    }
                    StringBuilder var227 = new StringBuilder(var224);
                    while (var221 != 0L) {
                        long var228 = var221;
                        var221 /= 37L;
                        var227.append(class146.field2439[(int) (var228 - var221 * 37L)]);
                    }
                    var223 = var227.reverse().toString();
                }
                field686 = var223;
                Statics.field1384 = field708.method2459();
                int var230 = field708.method2534();
                if (var230 == 255) {
                    field503 = -1;
                    return true;
                }
                Statics.field2570 = var230;
                class8[] var231 = new class8[100];
                for (int var232 = 0; var232 < Statics.field2570; var232++) {
                    var231[var232] = new class8();
                    var231[var232].field105 = field708.method2466();
                    var231[var232].field106 = class148.method2054(var231[var232].field105, Statics.field1304);
                    var231[var232].field113 = field708.method2460();
                    var231[var232].field111 = field708.method2459();
                    field708.method2466();
                    if (var231[var232].field105.equals(Statics.field147.field39)) {
                        Statics.field393 = var231[var232].field111;
                    }
                }
                boolean var233 = false;
                int var234 = Statics.field2570;
                while (var234 > 0) {
                    boolean var235 = true;
                    var234--;
                    for (int var236 = 0; var236 < var234; var236++) {
                        if (var231[var236].field106.compareTo(var231[var236 + 1].field106) > 0) {
                            class8 var237 = var231[var236];
                            var231[var236] = var231[var236 + 1];
                            var231[var236 + 1] = var237;
                            var235 = false;
                        }
                    }
                    if (var235) {
                        break;
                    }
                }
                Statics.field1436 = var231;
                field503 = -1;
                return true;
            }
            if (field503 == 23) {
                int var238 = field708.method2500();
                int var239 = field708.method2460();
                int var240 = field708.method2460();
                class158 var241 = class158.method792(var238);
                var241.field2630 = (var240 << 16) + var239;
                field503 = -1;
                return true;
            }
            if (field503 == 88) {
                field707 = true;
                Statics.field379 = field708.method2534();
                Statics.field1262 = field708.method2534();
                Statics.field67 = field708.method2460();
                Statics.field1282 = field708.method2534();
                Statics.field1789 = field708.method2534();
                if (Statics.field1789 >= 100) {
                    Statics.field1457 = Statics.field379 * 128 + 64;
                    Statics.field174 = Statics.field1262 * 128 + 64;
                    Statics.field2711 = method129(Statics.field1457, Statics.field174, Statics.field68) - Statics.field67;
                }
                field503 = -1;
                return true;
            }
            if (field503 == 66) {
                Statics.field1804 = field708.method2534();
                Statics.field2456 = field708.method2481();
                field503 = -1;
                return true;
            }
            if (field503 == 81 || field503 == 125 || field503 == 50 || field503 == 196 || field503 == 27 || field503 == 99 || field503 == 213 || field503 == 162 || field503 == 191 || field503 == 113 || field503 == 189) {
                method143();
                field503 = -1;
                return true;
            }
            if (field503 == 215) {
                while (field708.field2036 < field502) {
                    int var242 = field708.method2534();
                    boolean var243 = (var242 & 0x1) == 1;
                    String var244 = field708.method2466();
                    String var245 = field708.method2466();
                    field708.method2466();
                    for (int var246 = 0; var246 < field470; var246++) {
                        class11 var247 = field718[var246];
                        if (var243) {
                            if (var245.equals(var247.field172)) {
                                var247.field172 = var244;
                                var247.field171 = var245;
                                var244 = null;
                                break;
                            }
                        } else if (var244.equals(var247.field172)) {
                            var247.field172 = var244;
                            var247.field171 = var245;
                            var244 = null;
                            break;
                        }
                    }
                    if (var244 != null && field470 < 100) {
                        class11 var248 = new class11();
                        field718[field470] = var248;
                        var248.field172 = var244;
                        var248.field171 = var245;
                        field470++;
                    }
                }
                field652 = field646;
                field503 = -1;
                return true;
            }
            if (field503 == 168) {
                method117();
                int var249 = field708.method2648();
                int var250 = field708.method2483();
                int var251 = field708.method2483();
                field600[var251] = var249;
                field598[var251] = var250;
                field599[var251] = 1;
                for (int var252 = 0; var252 < 98; var252++) {
                    if (var249 >= class130.field2042[var252]) {
                        field599[var251] = var252 + 2;
                    }
                }
                field649[++field650 - 1 & 0x1F] = var251;
                field503 = -1;
                return true;
            }
            if (field503 == 216) {
                int var253 = field708.method2534();
                int var254 = field708.method2534();
                int var255 = field708.method2534();
                int var256 = field708.method2534();
                field492[var253] = true;
                field709[var253] = var254;
                field710[var253] = var255;
                field643[var253] = var256;
                field712[var253] = 0;
                field503 = -1;
                return true;
            }
            if (field503 == 230) {
                field672 = field708.method2534();
                if (field672 == 1) {
                    field624 = field708.method2460();
                }
                if (field672 >= 2 && field672 <= 6) {
                    if (field672 == 2) {
                        field482 = 64;
                        field483 = 64;
                    }
                    if (field672 == 3) {
                        field482 = 0;
                        field483 = 64;
                    }
                    if (field672 == 4) {
                        field482 = 128;
                        field483 = 64;
                    }
                    if (field672 == 5) {
                        field482 = 64;
                        field483 = 0;
                    }
                    if (field672 == 6) {
                        field482 = 64;
                        field483 = 128;
                    }
                    field672 = 2;
                    field602 = field708.method2460();
                    field480 = field708.method2460();
                    field605 = field708.method2534();
                }
                if (field672 == 10) {
                    field469 = field708.method2460();
                }
                field503 = -1;
                return true;
            }
            if (field503 == 64) {
                int var257 = field708.method2460();
                int var258 = field708.method2498();
                class159.field2704[var257] = var258;
                if (class159.field2705[var257] != var258) {
                    class159.field2705[var257] = var258;
                    method648(var257);
                }
                field645[++field692 - 1 & 0x1F] = var257;
                field503 = -1;
                return true;
            }
            if (field503 == 152) {
                Statics.field2456 = field708.method2534();
                Statics.field1804 = field708.method2534();
                for (int var259 = Statics.field1804; var259 < Statics.field1804 + 8; var259++) {
                    for (int var260 = Statics.field2456; var260 < Statics.field2456 + 8; var260++) {
                        if (field594[Statics.field68][var259][var260] != null) {
                            field594[Statics.field68][var259][var260] = null;
                            method7(var259, var260);
                        }
                    }
                }
                for (class22 var261 = (class22) field668.method3355(); var261 != null; var261 = (class22) field668.method3357()) {
                    if (var261.field337 >= Statics.field1804 && var261.field337 < Statics.field1804 + 8 && var261.field338 >= Statics.field2456 && var261.field338 < Statics.field2456 + 8 && Statics.field68 == var261.field345) {
                        var261.field348 = 0;
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 85) {
                int var262 = field708.method2500();
                int var263 = field708.method2656();
                class158 var264 = class158.method792(var262);
                if (var264.field2618 != 1 || var264.field2619 != var263) {
                    var264.field2618 = 1;
                    var264.field2619 = var263;
                    method41(var264);
                }
                field503 = -1;
                return true;
            }
            if (field503 == 31) {
                int var265 = field708.method2493();
                int var266 = field708.method2628();
                int var267 = field708.method2461();
                class158 var268 = class158.method792(var266);
                int var269 = var268.field2593 + var267;
                int var270 = var268.field2594 + var265;
                if (var268.field2672 != var269 || var268.field2592 != var270) {
                    var268.field2672 = var269;
                    var268.field2592 = var270;
                    method41(var268);
                }
                field503 = -1;
                return true;
            }
            if (field503 == 200) {
                field475 = field708.method2460() * 30;
                field654 = field646;
                field503 = -1;
                return true;
            }
            if (field503 == 6) {
                int var271 = field708.method2498();
                int var272 = field708.method2656();
                class158 var273 = class158.method792(var271);
                if (var273.field2618 != 2 || var273.field2619 != var272) {
                    var273.field2618 = 2;
                    var273.field2619 = var272;
                    method41(var273);
                }
                field503 = -1;
                return true;
            }
            if (field503 == 91) {
                field678 = field708.method2534();
                field679 = field708.method2534();
                field503 = -1;
                return true;
            }
            if (field503 == 26) {
                int var274 = field708.method2489();
                if (var274 == 65535) {
                    var274 = -1;
                }
                method16(var274);
                field503 = -1;
                return true;
            }
            if (field503 == 169) {
                int var275 = field708.method2600();
                if (var275 == 65535) {
                    var275 = -1;
                }
                int var276 = field708.method2494();
                method162(var275, var276);
                field503 = -1;
                return true;
            }
            if (field503 == 89) {
                for (int var277 = 0; var277 < field580.length; var277++) {
                    if (field580[var277] != null) {
                        field580[var277].field428 = -1;
                    }
                }
                for (int var278 = 0; var278 < field496.length; var278++) {
                    if (field496[var278] != null) {
                        field496[var278].field428 = -1;
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 49) {
                field724 = field708.method2534();
                field503 = -1;
                return true;
            }
            if (field503 == 3) {
                int var279 = field708.method2628();
                int var280 = field708.method2492();
                class158 var281 = class158.method792(var279);
                if (var281.field2622 != var280 || var280 == -1) {
                    var281.field2622 = var280;
                    var281.field2692 = 0;
                    var281.field2584 = 0;
                    method41(var281);
                }
                field503 = -1;
                return true;
            }
            if (field503 == 150) {
                String var282 = field708.method2466();
                long var283 = field708.method2464();
                long var285 = (long) field708.method2460();
                long var287 = (long) field708.method2462();
                int var289 = field708.method2534();
                long var290 = (var285 << 32) + var287;
                boolean var292 = false;
                for (int var293 = 0; var293 < 100; var293++) {
                    if (field717[var293] == var290) {
                        var292 = true;
                        break;
                    }
                }
                if (var289 <= 1 && method200(var282)) {
                    var292 = true;
                }
                if (!var292 && field579 == 0) {
                    field717[field681] = var290;
                    field681 = (field681 + 1) % 100;
                    class116 var294 = field708;
                    String var295 = class184.method841(var294, 32767);
                    String var296 = class185.method3435(class147.method809(var295));
                    if (var289 == 2 || var289 == 3) {
                        method539(9, class2.method1873(1) + var282, var296, class146.method2389(var283));
                    } else if (var289 == 1) {
                        method539(9, class2.method1873(0) + var282, var296, class146.method2389(var283));
                    } else {
                        method539(9, var282, var296, class146.method2389(var283));
                    }
                }
                field503 = -1;
                return true;
            }
            if (field503 == 68) {
                boolean var297 = field708.method2534() == 1;
                int var298 = field708.method2648();
                class158 var299 = class158.method792(var298);
                if (var299.field2598 != var297) {
                    var299.field2598 = var297;
                    method41(var299);
                }
                field503 = -1;
                return true;
            }
            class80.method210("" + field503 + class2.field15 + field508 + class2.field15 + field493 + class2.field15 + field502, (Throwable) null);
            method918();
        } catch (IOException var310) {
            method145();
        } catch (Exception var311) {
            String var302 = "" + field503 + class2.field15 + field508 + class2.field15 + field493 + class2.field15 + field502 + class2.field15 + (Statics.field47 + Statics.field147.field451[0]) + class2.field15 + (Statics.field196 + Statics.field147.field452[0]) + class2.field15;
            for (int var303 = 0; var303 < field502 && var303 < 50; var303++) {
                var302 = var302 + field708.field2037[var303] + class2.field15;
            }
            class80.method210(var302, var311);
            method918();
        }
        return true;
    }

    @ObfuscatedName("a.bi(I)V")
    public static final void method143() {
        if (field503 == 196) {
            int var0 = field708.method2600();
            int var1 = field708.method2483();
            int var2 = (var1 >> 4 & 0x7) + Statics.field1804;
            int var3 = (var1 & 0x7) + Statics.field2456;
            int var4 = field708.method2489();
            int var5 = field708.method2489();
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && field586 != var0) {
                class17 var6 = new class17();
                var6.field264 = var4;
                var6.field260 = var5;
                if (field594[Statics.field68][var2][var3] == null) {
                    field594[Statics.field68][var2][var3] = new class177();
                }
                field594[Statics.field68][var2][var3].method3350(var6);
                method7(var2, var3);
            }
        } else if (field503 == 191) {
            int var7 = field708.method2534();
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = field521[var8];
            int var11 = field708.method2482();
            int var12 = (var11 >> 4 & 0x7) + Statics.field1804;
            int var13 = (var11 & 0x7) + Statics.field2456;
            int var14 = field708.method2489();
            if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
                if (var10 == 0) {
                    class96 var15 = Statics.field112.method2026(Statics.field68, var12, var13);
                    if (var15 != null) {
                        int var16 = var15.field1609 >> 14 & 0x7FFF;
                        if (var8 == 2) {
                            var15.field1610 = new class14(var16, 2, var9 + 4, Statics.field68, var12, var13, var14, false, var15.field1610);
                            var15.field1605 = new class14(var16, 2, var9 + 1 & 0x3, Statics.field68, var12, var13, var14, false, var15.field1605);
                        } else {
                            var15.field1610 = new class14(var16, var8, var9, Statics.field68, var12, var13, var14, false, var15.field1610);
                        }
                    }
                }
                if (var10 == 1) {
                    class108 var17 = Statics.field112.method1906(Statics.field68, var12, var13);
                    if (var17 != null) {
                        int var18 = var17.field1803 >> 14 & 0x7FFF;
                        if (var8 == 4 || var8 == 5) {
                            var17.field1798 = new class14(var18, 4, var9, Statics.field68, var12, var13, var14, false, var17.field1798);
                        } else if (var8 == 6) {
                            var17.field1798 = new class14(var18, 4, var9 + 4, Statics.field68, var12, var13, var14, false, var17.field1798);
                        } else if (var8 == 7) {
                            var17.field1798 = new class14(var18, 4, (var9 + 2 & 0x3) + 4, Statics.field68, var12, var13, var14, false, var17.field1798);
                        } else if (var8 == 8) {
                            var17.field1798 = new class14(var18, 4, var9 + 4, Statics.field68, var12, var13, var14, false, var17.field1798);
                            var17.field1793 = new class14(var18, 4, (var9 + 2 & 0x3) + 4, Statics.field68, var12, var13, var14, false, var17.field1793);
                        }
                    }
                }
                if (var10 == 2) {
                    class98 var19 = Statics.field112.method1950(Statics.field68, var12, var13);
                    if (var8 == 11) {
                        var8 = 10;
                    }
                    if (var19 != null) {
                        var19.field1634 = new class14(var19.field1642 >> 14 & 0x7FFF, var8, var9, Statics.field68, var12, var13, var14, false, var19.field1634);
                    }
                }
                if (var10 == 3) {
                    class107 var20 = Statics.field112.method1908(Statics.field68, var12, var13);
                    if (var20 != null) {
                        var20.field1782 = new class14(var20.field1783 >> 14 & 0x7FFF, 22, var9, Statics.field68, var12, var13, var14, false, var20.field1782);
                    }
                }
            }
        } else if (field503 == 27) {
            int var21 = field708.method2534();
            int var22 = (var21 >> 4 & 0x7) + Statics.field1804;
            int var23 = (var21 & 0x7) + Statics.field2456;
            int var24 = field708.method2460();
            int var25 = field708.method2534();
            int var26 = field708.method2460();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                int var27 = var22 * 128 + 64;
                int var28 = var23 * 128 + 64;
                class20 var29 = new class20(var24, Statics.field68, var27, var28, method129(var27, var28, Statics.field68) - var25, var26, field691);
                field597.method3350(var29);
            }
        } else if (field503 == 213) {
            int var30 = field708.method2656();
            int var31 = field708.method2481();
            int var32 = (var31 >> 4 & 0x7) + Statics.field1804;
            int var33 = (var31 & 0x7) + Statics.field2456;
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                class177 var34 = field594[Statics.field68][var32][var33];
                if (var34 != null) {
                    for (class17 var35 = (class17) var34.method3355(); var35 != null; var35 = (class17) var34.method3357()) {
                        if ((var30 & 0x7FFF) == var35.field264) {
                            var35.method3395();
                            break;
                        }
                    }
                    if (var34.method3355() == null) {
                        field594[Statics.field68][var32][var33] = null;
                    }
                    method7(var32, var33);
                }
            }
        } else {
            if (field503 == 50) {
                byte var36 = field708.method2459();
                byte var37 = field708.method2518();
                int var38 = field708.method2534();
                int var39 = var38 >> 2;
                int var40 = var38 & 0x3;
                int var41 = field521[var39];
                int var42 = field708.method2481();
                int var43 = (var42 >> 4 & 0x7) + Statics.field1804;
                int var44 = (var42 & 0x7) + Statics.field2456;
                int var45 = field708.method2656();
                int var46 = field708.method2489();
                int var47 = field708.method2460();
                int var48 = field708.method2460();
                byte var49 = field708.method2459();
                byte var50 = field708.method2459();
                class3 var51;
                if (field586 == var47) {
                    var51 = Statics.field147;
                } else {
                    var51 = field580[var47];
                }
                if (var51 != null) {
                    class32 var52 = class32.method211(var48);
                    int var53;
                    int var54;
                    if (var40 == 1 || var40 == 3) {
                        var53 = var52.field812;
                        var54 = var52.field811;
                    } else {
                        var53 = var52.field811;
                        var54 = var52.field812;
                    }
                    int var55 = (var53 >> 1) + var43;
                    int var56 = (var53 + 1 >> 1) + var43;
                    int var57 = (var54 >> 1) + var44;
                    int var58 = (var54 + 1 >> 1) + var44;
                    int[][] var59 = class9.field120[Statics.field68];
                    int var60 = var59[var55][var57] + var59[var56][var57] + var59[var55][var58] + var59[var56][var58] >> 2;
                    int var61 = (var43 << 7) + (var53 << 6);
                    int var62 = (var44 << 7) + (var54 << 6);
                    class112 var63 = var52.method653(var39, var40, var59, var61, var60, var62);
                    if (var63 != null) {
                        method202(Statics.field68, var43, var44, var41, -1, 0, 0, var45 + 1, var46 + 1);
                        var51.field35 = field691 + var45;
                        var51.field36 = field691 + var46;
                        var51.field40 = var63;
                        var51.field32 = var43 * 128 + var53 * 64;
                        var51.field41 = var44 * 128 + var54 * 64;
                        var51.field38 = var60;
                        if (var37 > var36) {
                            byte var64 = var37;
                            var37 = var36;
                            var36 = var64;
                        }
                        if (var50 > var49) {
                            byte var65 = var50;
                            var50 = var49;
                            var49 = var65;
                        }
                        var51.field33 = var37 + var43;
                        var51.field43 = var36 + var43;
                        var51.field42 = var44 + var50;
                        var51.field44 = var44 + var49;
                    }
                }
            }
            if (field503 == 81) {
                int var66 = field708.method2534();
                int var67 = (var66 >> 4 & 0x7) + Statics.field1804;
                int var68 = (var66 & 0x7) + Statics.field2456;
                int var69 = field708.method2460();
                int var70 = field708.method2534();
                int var71 = var70 >> 4 & 0xF;
                int var72 = var70 & 0x7;
                int var73 = field708.method2534();
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    int var74 = var71 + 1;
                    if (Statics.field147.field451[0] >= var67 - var74 && Statics.field147.field451[0] <= var67 + var74 && Statics.field147.field452[0] >= var68 - var74 && Statics.field147.field452[0] <= var68 + var74 && field625 != 0 && var72 > 0 && field701 < 50) {
                        field702[field701] = var69;
                        field640[field701] = var72;
                        field613[field701] = var73;
                        field706[field701] = null;
                        field705[field701] = (var67 << 16) + (var68 << 8) + var71;
                        field701++;
                    }
                }
            }
            if (field503 == 125) {
                int var75 = field708.method2534();
                int var76 = (var75 >> 4 & 0x7) + Statics.field1804;
                int var77 = (var75 & 0x7) + Statics.field2456;
                int var78 = field708.method2460();
                int var79 = field708.method2460();
                int var80 = field708.method2460();
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    class177 var81 = field594[Statics.field68][var76][var77];
                    if (var81 != null) {
                        for (class17 var82 = (class17) var81.method3355(); var82 != null; var82 = (class17) var81.method3357()) {
                            if ((var78 & 0x7FFF) == var82.field264 && var82.field260 == var79) {
                                var82.field260 = var80;
                                break;
                            }
                        }
                        method7(var76, var77);
                    }
                }
            } else if (field503 == 189) {
                int var83 = field708.method2482();
                int var84 = (var83 >> 4 & 0x7) + Statics.field1804;
                int var85 = (var83 & 0x7) + Statics.field2456;
                int var86 = field708.method2600();
                int var87 = field708.method2483();
                int var88 = var87 >> 2;
                int var89 = var87 & 0x3;
                int var90 = field521[var88];
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    method202(Statics.field68, var84, var85, var90, var86, var88, var89, 0, -1);
                }
            } else if (field503 == 162) {
                int var91 = field708.method2481();
                int var92 = (var91 >> 4 & 0x7) + Statics.field1804;
                int var93 = (var91 & 0x7) + Statics.field2456;
                int var94 = field708.method2656();
                int var95 = field708.method2460();
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                    class17 var96 = new class17();
                    var96.field264 = var94;
                    var96.field260 = var95;
                    if (field594[Statics.field68][var92][var93] == null) {
                        field594[Statics.field68][var92][var93] = new class177();
                    }
                    field594[Statics.field68][var92][var93].method3350(var96);
                    method7(var92, var93);
                }
            } else if (field503 == 113) {
                int var97 = field708.method2534();
                int var98 = (var97 >> 4 & 0x7) + Statics.field1804;
                int var99 = (var97 & 0x7) + Statics.field2456;
                int var100 = field708.method2481();
                int var101 = var100 >> 2;
                int var102 = var100 & 0x3;
                int var103 = field521[var101];
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                    method202(Statics.field68, var98, var99, var103, -1, var101, var102, 0, -1);
                }
            } else if (field503 == 99) {
                int var104 = field708.method2534();
                int var105 = (var104 >> 4 & 0x7) + Statics.field1804;
                int var106 = (var104 & 0x7) + Statics.field2456;
                int var107 = var105 + field708.method2459();
                int var108 = var106 + field708.method2459();
                int var109 = field708.method2461();
                int var110 = field708.method2460();
                int var111 = field708.method2534() * 4;
                int var112 = field708.method2534() * 4;
                int var113 = field708.method2460();
                int var114 = field708.method2460();
                int var115 = field708.method2534();
                int var116 = field708.method2534();
                if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var110 != 65535) {
                    int var117 = var105 * 128 + 64;
                    int var118 = var106 * 128 + 64;
                    int var119 = var107 * 128 + 64;
                    int var120 = var108 * 128 + 64;
                    class10 var121 = new class10(var110, Statics.field68, var117, var118, method129(var117, var118, Statics.field68) - var111, field691 + var113, field691 + var114, var115, var116, var109, var112);
                    var121.method92(var119, var120, method129(var119, var120, Statics.field68) - var112, field691 + var113);
                    field596.method3350(var121);
                }
            }
        }
    }

    @ObfuscatedName("h.bh(IIIIIIIIIB)V")
    public static final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field668.method3355(); var10 != null; var10 = (class22) field668.method3357()) {
            if (var10.field345 == arg0 && var10.field337 == arg1 && var10.field338 == arg2 && var10.field336 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field345 = arg0;
            var9.field336 = arg3;
            var9.field337 = arg1;
            var9.field338 = arg2;
            method131(var9);
            field668.method3350(var9);
        }
        var9.field342 = arg4;
        var9.field344 = arg5;
        var9.field343 = arg6;
        var9.field341 = arg7;
        var9.field348 = arg8;
    }

    @ObfuscatedName("cf.bq(I)V")
    public static final void method2057() {
        for (class22 var0 = (class22) field668.method3355(); var0 != null; var0 = (class22) field668.method3357()) {
            if (var0.field348 == -1) {
                var0.field341 = 0;
                method131(var0);
            } else {
                var0.method3395();
            }
        }
    }

    @ObfuscatedName("c.bj(Lw;I)V")
    public static final void method131(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field336 == 0) {
            var1 = Statics.field112.method1909(arg0.field345, arg0.field337, arg0.field338);
        }
        if (arg0.field336 == 1) {
            var1 = Statics.field112.method1910(arg0.field345, arg0.field337, arg0.field338);
        }
        if (arg0.field336 == 2) {
            var1 = Statics.field112.method1911(arg0.field345, arg0.field337, arg0.field338);
        }
        if (arg0.field336 == 3) {
            var1 = Statics.field112.method1995(arg0.field345, arg0.field337, arg0.field338);
        }
        if (var1 != 0) {
            int var5 = Statics.field112.method1913(arg0.field345, arg0.field337, arg0.field338, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field339 = var2;
        arg0.field346 = var3;
        arg0.field340 = var4;
    }

    @ObfuscatedName("bg.bw(IIIIIIII)V")
    public static final void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field463 && Statics.field68 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field112.method1909(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field112.method1910(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field112.method1911(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field112.method1995(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field112.method1913(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field112.method1900(arg0, arg2, arg3);
                class32 var15 = class32.method211(var12);
                if (var15.field831 != 0) {
                    field518[arg0].method3237(arg2, arg3, var13, var14, var15.field802);
                }
            }
            if (arg1 == 1) {
                Statics.field112.method1901(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field112.method1902(arg0, arg2, arg3);
                class32 var16 = class32.method211(var12);
                if (var16.field811 + arg2 > 103 || var16.field811 + arg3 > 103 || var16.field812 + arg2 > 103 || var16.field812 + arg3 > 103) {
                    return;
                }
                if (var16.field831 != 0) {
                    field518[arg0].method3274(arg2, arg3, var16.field811, var16.field812, var14, var16.field802);
                }
            }
            if (arg1 == 3) {
                Statics.field112.method1968(arg0, arg2, arg3);
                class32 var17 = class32.method211(var12);
                if (var17.field831 == 1) {
                    field518[arg0].method3240(arg2, arg3);
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
        class95 var19 = Statics.field112;
        class164 var20 = field518[arg0];
        class32 var21 = class32.method211(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field812;
            var23 = var21.field811;
        } else {
            var22 = var21.field811;
            var23 = var21.field812;
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
        int[][] var28 = class9.field120[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field815 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field837 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class94 var34;
            if (var21.field816 == -1 && var21.field838 == null) {
                var34 = var21.method653(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class14(arg4, 22, arg5, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field831 == 1) {
                var20.method3235(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var57;
            if (var21.field816 == -1 && var21.field838 == null) {
                var57 = var21.method653(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class14(arg4, 10, arg5, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            if (var57 != null) {
                var19.method1954(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field831 != 0) {
                var20.method3231(arg2, arg3, var22, var23, var21.field802);
            }
        } else if (arg6 >= 12) {
            class94 var35;
            if (var21.field816 == -1 && var21.field838 == null) {
                var35 = var21.method653(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1954(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method3231(arg2, arg3, var22, var23, var21.field802);
            }
        } else if (arg6 == 0) {
            class94 var36;
            if (var21.field816 == -1 && var21.field838 == null) {
                var36 = var21.method653(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class14(arg4, 0, arg5, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1891(arg0, arg2, arg3, var29, var36, (class94) null, class9.field121[arg5], 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method3232(arg2, arg3, arg6, arg5, var21.field802);
            }
        } else if (arg6 == 1) {
            class94 var37;
            if (var21.field816 == -1 && var21.field838 == null) {
                var37 = var21.method653(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class14(arg4, 1, arg5, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1891(arg0, arg2, arg3, var29, var37, (class94) null, class9.field131[arg5], 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method3232(arg2, arg3, arg6, arg5, var21.field802);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class94 var39;
            class94 var40;
            if (var21.field816 == -1 && var21.field838 == null) {
                var39 = var21.method653(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method653(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class14(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field816, true, (class94) null);
                var40 = new class14(arg4, 2, var38, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1891(arg0, arg2, arg3, var29, var39, var40, class9.field121[arg5], class9.field121[var38], var32, var33);
            if (var21.field831 != 0) {
                var20.method3232(arg2, arg3, arg6, arg5, var21.field802);
            }
        } else if (arg6 == 3) {
            class94 var41;
            if (var21.field816 == -1 && var21.field838 == null) {
                var41 = var21.method653(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class14(arg4, 3, arg5, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1891(arg0, arg2, arg3, var29, var41, (class94) null, class9.field131[arg5], 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method3232(arg2, arg3, arg6, arg5, var21.field802);
            }
        } else if (arg6 == 9) {
            class94 var42;
            if (var21.field816 == -1 && var21.field838 == null) {
                var42 = var21.method653(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1954(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field831 != 0) {
                var20.method3231(arg2, arg3, var22, var23, var21.field802);
            }
        } else if (arg6 == 4) {
            class94 var43;
            if (var21.field816 == -1 && var21.field838 == null) {
                var43 = var21.method653(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1924(arg0, arg2, arg3, var29, var43, (class94) null, class9.field121[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1909(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class32.method211(var45 >> 14 & 0x7FFF).field814;
            }
            class94 var46;
            if (var21.field816 == -1 && var21.field838 == null) {
                var46 = var21.method653(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1924(arg0, arg2, arg3, var29, var46, (class94) null, class9.field121[arg5], 0, class9.field132[arg5] * var44, class9.field125[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1909(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class32.method211(var48 >> 14 & 0x7FFF).field814 / 2;
            }
            class94 var49;
            if (var21.field816 == -1 && var21.field838 == null) {
                var49 = var21.method653(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1924(arg0, arg2, arg3, var29, var49, (class94) null, 256, arg5, class9.field134[arg5] * var47, class9.field135[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class94 var51;
            if (var21.field816 == -1 && var21.field838 == null) {
                var51 = var21.method653(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class14(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1924(arg0, arg2, arg3, var29, var51, (class94) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1909(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class32.method211(var53 >> 14 & 0x7FFF).field814 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class94 var55;
            class94 var56;
            if (var21.field816 == -1 && var21.field838 == null) {
                var55 = var21.method653(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method653(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field816, true, (class94) null);
                var56 = new class14(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field816, true, (class94) null);
            }
            var19.method1924(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field134[arg5] * var52, class9.field135[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("m.bg(IIB)V")
    public static final void method7(int arg0, int arg1) {
        class177 var2 = field594[Statics.field68][arg0][arg1];
        if (var2 == null) {
            Statics.field112.method1905(Statics.field68, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3355(); var5 != null; var5 = (class17) var2.method3357()) {
            class40 var6 = class40.method30(var5.field264);
            int var7 = var6.field1009;
            if (var6.field981 == 1) {
                var7 = (var5.field260 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field112.method1905(Statics.field68, arg0, arg1);
            return;
        }
        var2.method3351(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3355(); var10 != null; var10 = (class17) var2.method3357()) {
            if (var4.field264 != var10.field264) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field264 != var10.field264 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field112.method1890(Statics.field68, arg0, arg1, method129(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field68), var4, var11, var8, var9);
    }

    @ObfuscatedName("a.bx(I)V")
    public static final void method141() {
        field588 = 0;
        field634 = 0;
        field708.method2339();
        int var0 = field708.method2354(1);
        if (var0 != 0) {
            int var1 = field708.method2354(2);
            if (var1 == 0) {
                field584[++field634 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field708.method2354(3);
                Statics.field147.method217(var2, false);
                int var3 = field708.method2354(1);
                if (var3 == 1) {
                    field584[++field634 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field708.method2354(3);
                Statics.field147.method217(var4, true);
                int var5 = field708.method2354(3);
                Statics.field147.method217(var5, true);
                int var6 = field708.method2354(1);
                if (var6 == 1) {
                    field584[++field634 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field708.method2354(7);
                int var8 = field708.method2354(1);
                if (var8 == 1) {
                    field584[++field634 - 1] = 2047;
                }
                int var9 = field708.method2354(1);
                Statics.field68 = field708.method2354(2);
                int var10 = field708.method2354(7);
                Statics.field147.method234(var7, var10, var9 == 1);
            }
        }
        method2370();
        method1420();
        for (int var11 = 0; var11 < field634; var11++) {
            int var12 = field584[var11];
            class3 var13 = field580[var12];
            int var14 = field708.method2534();
            if ((var14 & 0x40) != 0) {
                var14 += field708.method2534() << 8;
            }
            if ((var14 & 0x20) != 0) {
                int var15 = field708.method2482();
                byte[] var16 = new byte[var15];
                class127 var17 = new class127(var16);
                field708.method2502(var16, 0, var15);
                field585[var12] = var17;
                var13.method19(var17);
            }
            if ((var14 & 0x2) != 0) {
                int var18 = field708.method2460();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field708.method2483();
                method2058(var13, var18, var19);
            }
            if ((var14 & 0x10) != 0) {
                var13.field402 = field708.method2466();
                if (var13.field402.charAt(0) == '~') {
                    var13.field402 = var13.field402.substring(1);
                    method2740(2, var13.field39, var13.field402);
                } else if (Statics.field147 == var13) {
                    method2740(2, var13.field39, var13.field402);
                }
                var13.field413 = 0;
                var13.field409 = 0;
                var13.field412 = 150;
            }
            if ((var14 & 0x200) != 0) {
                var13.field433 = field708.method2489();
                int var20 = field708.method2628();
                var13.field437 = var20 >> 16;
                var13.field436 = (var20 & 0xFFFF) + field691;
                var13.field416 = 0;
                var13.field435 = 0;
                if (var13.field436 > field691) {
                    var13.field416 = -1;
                }
                if (var13.field433 == 65535) {
                    var13.field433 = -1;
                }
            }
            if ((var14 & 0x100) != 0) {
                var13.field438 = field708.method2482();
                var13.field440 = field708.method2481();
                var13.field439 = field708.method2483();
                var13.field401 = field708.method2483();
                var13.field442 = field708.method2460() + field691;
                var13.field443 = field708.method2460() + field691;
                var13.field407 = field708.method2482();
                var13.field450 = 1;
                var13.field455 = 0;
            }
            if ((var14 & 0x8) != 0) {
                var13.field403 = field708.method2460();
                var13.field424 = field708.method2489();
            }
            if ((var14 & 0x4) != 0) {
                var13.field422 = field708.method2600();
                if (var13.field422 == 65535) {
                    var13.field422 = -1;
                }
            }
            if ((var14 & 0x400) != 0) {
                int var21 = field708.method2534();
                int var22 = field708.method2482();
                var13.method222(var21, var22, field691);
                var13.field423 = field691 + 300;
                var13.field420 = field708.method2534();
                var13.field421 = field708.method2481();
            }
            if ((var14 & 0x1) != 0) {
                int var23 = field708.method2482();
                int var24 = field708.method2483();
                var13.method222(var23, var24, field691);
                var13.field423 = field691 + 300;
                var13.field420 = field708.method2534();
                var13.field421 = field708.method2482();
            }
            if ((var14 & 0x80) != 0) {
                int var25 = field708.method2600();
                int var26 = field708.method2482();
                int var27 = field708.method2482();
                int var28 = field708.field2036;
                if (var13.field39 != null && var13.field29 != null) {
                    boolean var29 = false;
                    if (var26 <= 1 && method200(var13.field39)) {
                        var29 = true;
                    }
                    if (!var29 && field579 == 0) {
                        field479.field2036 = 0;
                        field708.method2501(field479.field2037, 0, var27);
                        field479.field2036 = 0;
                        class127 var30 = field479;
                        String var31 = class184.method841(var30, 32767);
                        String var32 = class185.method3435(class147.method809(var31));
                        var13.field402 = var32.trim();
                        var13.field413 = var25 >> 8;
                        var13.field409 = var25 & 0xFF;
                        var13.field412 = 150;
                        if (var26 == 2 || var26 == 3) {
                            method2740(1, class2.method1873(1) + var13.field39, var32);
                        } else if (var26 == 1) {
                            method2740(1, class2.method1873(0) + var13.field39, var32);
                        } else {
                            method2740(2, var13.field39, var32);
                        }
                    }
                }
                field708.field2036 = var27 + var28;
            }
        }
        for (int var33 = 0; var33 < field588; var33++) {
            int var34 = field589[var33];
            if (field691 != field580[var34].field445) {
                field580[var34] = null;
            }
        }
        if (field502 != field708.field2036) {
            throw new RuntimeException(field708.field2036 + class2.field15 + field502);
        }
        for (int var35 = 0; var35 < field581; var35++) {
            if (field580[field582[var35]] == null) {
                throw new RuntimeException(var35 + class2.field15 + field581);
            }
        }
    }

    @ObfuscatedName("do.bt(I)V")
    public static final void method2370() {
        int var0 = field708.method2354(8);
        if (var0 < field581) {
            for (int var1 = var0; var1 < field581; var1++) {
                field589[++field588 - 1] = field582[var1];
            }
        }
        if (var0 > field581) {
            throw new RuntimeException("");
        }
        field581 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field582[var2];
            class3 var4 = field580[var3];
            int var5 = field708.method2354(1);
            if (var5 == 0) {
                field582[++field581 - 1] = var3;
                var4.field445 = field691;
            } else {
                int var6 = field708.method2354(2);
                if (var6 == 0) {
                    field582[++field581 - 1] = var3;
                    var4.field445 = field691;
                    field584[++field634 - 1] = var3;
                } else if (var6 == 1) {
                    field582[++field581 - 1] = var3;
                    var4.field445 = field691;
                    int var7 = field708.method2354(3);
                    var4.method217(var7, false);
                    int var8 = field708.method2354(1);
                    if (var8 == 1) {
                        field584[++field634 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field582[++field581 - 1] = var3;
                    var4.field445 = field691;
                    int var9 = field708.method2354(3);
                    var4.method217(var9, true);
                    int var10 = field708.method2354(3);
                    var4.method217(var10, true);
                    int var11 = field708.method2354(1);
                    if (var11 == 1) {
                        field584[++field634 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field589[++field588 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("bc.bo(I)V")
    public static final void method1420() {
        while (true) {
            if (field708.method2342(field502) >= 11) {
                int var0 = field708.method2354(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field580[var0] == null) {
                        field580[var0] = new class3();
                        if (field585[var0] != null) {
                            field580[var0].method19(field585[var0]);
                        }
                        var1 = true;
                    }
                    field582[++field581 - 1] = var0;
                    class3 var2 = field580[var0];
                    var2.field445 = field691;
                    int var3 = field593[field708.method2354(3)];
                    if (var1) {
                        var2.field447 = var2.field400 = var3;
                    }
                    int var4 = field708.method2354(1);
                    int var5 = field708.method2354(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field708.method2354(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field708.method2354(1);
                    if (var7 == 1) {
                        field584[++field634 - 1] = var0;
                    }
                    var2.method234(Statics.field147.field451[0] + var5, Statics.field147.field452[0] + var6, var4 == 1);
                    continue;
                }
            }
            field708.method2341();
            return;
        }
    }

    @ObfuscatedName("l.bz(I)V")
    public static final void method102() {
        field708.method2339();
        int var0 = field708.method2354(8);
        if (var0 < field497) {
            for (int var1 = var0; var1 < field497; var1++) {
                field589[++field588 - 1] = field648[var1];
            }
        }
        if (var0 > field497) {
            throw new RuntimeException("");
        }
        field497 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field648[var2];
            class25 var4 = field496[var3];
            int var5 = field708.method2354(1);
            if (var5 == 0) {
                field648[++field497 - 1] = var3;
                var4.field445 = field691;
            } else {
                int var6 = field708.method2354(2);
                if (var6 == 0) {
                    field648[++field497 - 1] = var3;
                    var4.field445 = field691;
                    field584[++field634 - 1] = var3;
                } else if (var6 == 1) {
                    field648[++field497 - 1] = var3;
                    var4.field445 = field691;
                    int var7 = field708.method2354(3);
                    var4.method217(var7, false);
                    int var8 = field708.method2354(1);
                    if (var8 == 1) {
                        field584[++field634 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field648[++field497 - 1] = var3;
                    var4.field445 = field691;
                    int var9 = field708.method2354(3);
                    var4.method217(var9, true);
                    int var10 = field708.method2354(3);
                    var4.method217(var10, true);
                    int var11 = field708.method2354(1);
                    if (var11 == 1) {
                        field584[++field634 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field589[++field588 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ae.bk(B)V")
    public static final void method682() {
        while (true) {
            if (field708.method2342(field502) >= 27) {
                int var0 = field708.method2354(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field496[var0] == null) {
                        field496[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field496[var0];
                    field648[++field497 - 1] = var0;
                    var2.field445 = field691;
                    int var3 = field593[field708.method2354(3)];
                    if (var1) {
                        var2.field447 = var2.field400 = var3;
                    }
                    int var4 = field708.method2354(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field708.method2354(1);
                    int var6 = field708.method2354(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    var2.field376 = class31.method208(field708.method2354(14));
                    int var7 = field708.method2354(1);
                    if (var7 == 1) {
                        field584[++field634 - 1] = var0;
                    }
                    var2.field414 = var2.field376.field767;
                    var2.field427 = var2.field376.field772;
                    if (var2.field427 == 0) {
                        var2.field400 = 0;
                    }
                    var2.field406 = var2.field376.field779;
                    var2.field449 = var2.field376.field774;
                    var2.field408 = var2.field376.field775;
                    var2.field434 = var2.field376.field776;
                    var2.field441 = var2.field376.field770;
                    var2.field404 = var2.field376.field771;
                    var2.field405 = var2.field376.field796;
                    var2.method234(Statics.field147.field451[0] + var4, Statics.field147.field452[0] + var6, var5 == 1);
                    continue;
                }
            }
            field708.method2341();
            return;
        }
    }

    @ObfuscatedName("bu.bb(I)V")
    public static final void method1581() {
        for (int var0 = 0; var0 < field634; var0++) {
            int var1 = field584[var0];
            class25 var2 = field496[var1];
            int var3 = field708.method2534();
            if ((var3 & 0x4) != 0) {
                int var4 = field708.method2481();
                int var5 = field708.method2483();
                var2.method222(var4, var5, field691);
                var2.field423 = field691 + 300;
                var2.field420 = field708.method2482();
                var2.field421 = field708.method2482();
            }
            if ((var3 & 0x40) != 0) {
                var2.field402 = field708.method2466();
                var2.field412 = 100;
            }
            if ((var3 & 0x1) != 0) {
                var2.field403 = field708.method2460();
                var2.field424 = field708.method2489();
            }
            if ((var3 & 0x20) != 0) {
                var2.field376 = class31.method208(field708.method2489());
                var2.field414 = var2.field376.field767;
                var2.field427 = var2.field376.field772;
                var2.field406 = var2.field376.field779;
                var2.field449 = var2.field376.field774;
                var2.field408 = var2.field376.field775;
                var2.field434 = var2.field376.field776;
                var2.field441 = var2.field376.field770;
                var2.field404 = var2.field376.field771;
                var2.field405 = var2.field376.field796;
            }
            if ((var3 & 0x8) != 0) {
                int var6 = field708.method2600();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field708.method2483();
                if (var2.field428 == var6 && var6 != -1) {
                    int var8 = class34.method540(var6).field879;
                    if (var8 == 1) {
                        var2.field419 = 0;
                        var2.field430 = 0;
                        var2.field411 = var7;
                        var2.field432 = 0;
                    }
                    if (var8 == 2) {
                        var2.field432 = 0;
                    }
                } else if (var6 == -1 || var2.field428 == -1 || class34.method540(var6).field873 >= class34.method540(var2.field428).field873) {
                    var2.field428 = var6;
                    var2.field419 = 0;
                    var2.field430 = 0;
                    var2.field411 = var7;
                    var2.field432 = 0;
                    var2.field455 = var2.field450;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var9 = field708.method2534();
                int var10 = field708.method2482();
                var2.method222(var9, var10, field691);
                var2.field423 = field691 + 300;
                var2.field420 = field708.method2481();
                var2.field421 = field708.method2482();
            }
            if ((var3 & 0x2) != 0) {
                var2.field433 = field708.method2489();
                int var11 = field708.method2648();
                var2.field437 = var11 >> 16;
                var2.field436 = (var11 & 0xFFFF) + field691;
                var2.field416 = 0;
                var2.field435 = 0;
                if (var2.field436 > field691) {
                    var2.field416 = -1;
                }
                if (var2.field433 == 65535) {
                    var2.field433 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field422 = field708.method2460();
                if (var2.field422 == 65535) {
                    var2.field422 = -1;
                }
            }
        }
    }

    @ObfuscatedName("aa.by(IIIII)V")
    public static final void method840(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field662; var4++) {
            if (field669[var4] + field667[var4] > arg0 && field667[var4] < arg0 + arg2 && field531[var4] + field484[var4] > arg1 && field531[var4] < arg1 + arg3) {
                field468[var4] = true;
            }
        }
    }

    @ObfuscatedName("a.bm(I)V")
    public static final void method144() {
        if (Statics.field1252 != null || field632 != null) {
            return;
        }
        int var0 = class77.field1402;
        if (field694) {
            if (var0 != 1) {
                int var1 = class77.field1401;
                int var2 = class77.field1393;
                if (var1 < Statics.field1777 - 10 || var1 > Statics.field957 + Statics.field1777 + 10 || var2 < Statics.field210 - 10 || var2 > Statics.field913 + Statics.field210 + 10) {
                    field694 = false;
                    Statics.method1193(Statics.field1777, Statics.field210, Statics.field957, Statics.field913);
                }
            }
            if (var0 == 1) {
                int var3 = Statics.field1777;
                int var4 = Statics.field210;
                int var5 = Statics.field957;
                int var6 = class77.field1399;
                int var7 = class77.field1400;
                int var8 = -1;
                for (int var9 = 0; var9 < field719; var9++) {
                    int var10 = (field719 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    Statics.method216(var8);
                }
                field694 = false;
                Statics.method1193(Statics.field1777, Statics.field210, Statics.field957, Statics.field913);
            }
            return;
        }
        if (var0 == 1 && field719 > 0) {
            int var11 = field498[field719 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                int var12 = field604[field719 - 1];
                int var13 = field520[field719 - 1];
                class158 var14 = class158.method792(var13);
                if (class162.method1288(method29(var14)) || class162.method1583(method29(var14))) {
                    field487 = false;
                    field578 = 0;
                    if (Statics.field1252 != null) {
                        method41(Statics.field1252);
                    }
                    Statics.field1252 = class158.method792(var13);
                    field617 = var12;
                    field574 = class77.field1399;
                    field575 = class77.field1400;
                    method41(Statics.field1252);
                    return;
                }
            }
        }
        if (var0 == 1 && (field549 == 1 && field719 > 2 || method1285(field719 - 1))) {
            var0 = 2;
        }
        if (var0 == 1 && field719 > 0) {
            Statics.method216(field719 - 1);
        }
        if (var0 == 2 && field719 > 0) {
            method705();
        }
    }

    @ObfuscatedName("am.bc(B)V")
    public static final void method705() {
        int var0 = Statics.field272.method3436(class134.field2171);
        for (int var1 = 0; var1 < field719; var1++) {
            int var2 = Statics.field272.method3436(method98(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field719 * 15 + 21;
        int var4 = class77.field1399 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1400;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field694 = true;
        Statics.field1777 = var4;
        Statics.field210 = var5;
        Statics.field957 = var0;
        Statics.field913 = field719 * 15 + 22;
    }

    @ObfuscatedName("bh.bs(IB)Z")
    public static final boolean method1285(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field498[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("a.bn(ILjava/lang/String;S)V")
    public static void method146(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field581; var3++) {
            class3 var4 = field580[field582[var3]];
            if (var4 != null && var4.field39 != null && var4.field39.equalsIgnoreCase(arg1)) {
                method94(Statics.field147.field451[0], Statics.field147.field452[0], var4.field451[0], var4.field452[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field509.method2337(215);
                    field509.method2465(field582[var3]);
                } else if (arg0 == 4) {
                    field509.method2337(102);
                    field509.method2445(field582[var3]);
                } else if (arg0 == 6) {
                    field509.method2337(0);
                    field509.method2488(field582[var3]);
                } else if (arg0 == 7) {
                    field509.method2337(94);
                    field509.method2445(field582[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method2740(0, "", class134.field2220 + arg1);
        }
    }

    @ObfuscatedName("cb.bp(IIII)V")
    public static void method1599(int arg0, int arg1, int arg2) {
        class158 var3 = class158.method810(arg0, arg1);
        if (var3 != null && var3.field2664 != null) {
            class1 var4 = new class1();
            var4.field2 = var3;
            var4.field13 = var3.field2664;
            class26.method2369(var4);
        }
        field651 = true;
        Statics.field1645 = arg0;
        field618 = arg1;
        Statics.field1305 = arg2;
        method41(var3);
    }

    @ObfuscatedName("c.bu(IIILjava/lang/String;B)V")
    public static void method130(int arg0, int arg1, int arg2, String arg3) {
        class158 var4 = class158.method810(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2673 != null) {
            class1 var5 = new class1();
            var5.field2 = var4;
            var5.field5 = arg0;
            var5.field9 = arg3;
            var5.field13 = var4.field2673;
            class26.method2369(var5);
        }
        boolean var6 = true;
        if (var4.field2590 > 0) {
            int var7 = var4.field2590;
            boolean var8;
            if (var7 == 205) {
                field607 = 250;
                var8 = true;
            } else {
                if (var7 >= 300 && var7 <= 313) {
                    int var9 = (var7 - 300) / 2;
                    int var10 = var7 & 0x1;
                    field616.method3198(var9, var10 == 1);
                }
                if (var7 >= 314 && var7 <= 323) {
                    int var11 = (var7 - 314) / 2;
                    int var12 = var7 & 0x1;
                    field616.method3208(var11, var12 == 1);
                }
                if (var7 == 324) {
                    field616.method3200(false);
                }
                if (var7 == 325) {
                    field616.method3200(true);
                }
                if (var7 == 326) {
                    field509.method2337(130);
                    field616.method3199(field509);
                    var8 = true;
                } else {
                    var8 = false;
                }
            }
            var6 = var8;
        }
        if (!var6 || !class162.method1245(method29(var4), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field509.method2337(175);
            field509.method2563(arg1);
            field509.method2445(arg2);
        }
        if (arg0 == 2) {
            field509.method2337(166);
            field509.method2563(arg1);
            field509.method2445(arg2);
        }
        if (arg0 == 3) {
            field509.method2337(119);
            field509.method2563(arg1);
            field509.method2445(arg2);
        }
        if (arg0 == 4) {
            field509.method2337(97);
            field509.method2563(arg1);
            field509.method2445(arg2);
        }
        if (arg0 == 5) {
            field509.method2337(19);
            field509.method2563(arg1);
            field509.method2445(arg2);
        }
        if (arg0 == 6) {
            field509.method2337(153);
            field509.method2563(arg1);
            field509.method2445(arg2);
        }
        if (arg0 == 7) {
            field509.method2337(170);
            field509.method2563(arg1);
            field509.method2445(arg2);
        }
        if (arg0 == 8) {
            field509.method2337(197);
            field509.method2563(arg1);
            field509.method2445(arg2);
        }
        if (arg0 == 9) {
            field509.method2337(151);
            field509.method2563(arg1);
            field509.method2445(arg2);
        }
        if (arg0 == 10) {
            field509.method2337(227);
            field509.method2563(arg1);
            field509.method2445(arg2);
        }
    }

    @ObfuscatedName("av.bv(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method627(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field694 || field719 >= 500) {
            return;
        }
        field587[field719] = arg0;
        field488[field719] = arg1;
        field498[field719] = arg2;
        field567[field719] = arg3;
        field604[field719] = arg4;
        field520[field719] = arg5;
        field719++;
    }

    @ObfuscatedName("p.co(II)Ljava/lang/String;")
    public static String method98(int arg0) {
        return field488[arg0].length() > 0 ? field587[arg0] + class134.field2231 + field488[arg0] : field587[arg0];
    }

    @ObfuscatedName("ab.cp(Lav;IIII)V")
    public static final void method825(class31 arg0, int arg1, int arg2, int arg3) {
        if (field719 >= 400) {
            return;
        }
        if (arg0.field791 != null) {
            arg0 = arg0.method612();
        }
        if (arg0 == null || !arg0.field773) {
            return;
        }
        String var4 = arg0.field766;
        if (arg0.field783 != 0) {
            var4 = var4 + method561(arg0.field783, Statics.field147.field34) + " " + class2.field17 + class134.field2129 + arg0.field783 + class2.field23;
        }
        if (field476 == 1) {
            method627(class134.field2232, field626 + " " + class2.field21 + " " + class2.method177(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field651) {
            String[] var5 = arg0.field781;
            if (field631) {
                var5 = method2(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class134.field2103)) {
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
                        method627(var5[var6], class2.method177(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class134.field2103)) {
                        short var9 = 0;
                        if (arg0.field783 > Statics.field147.field34) {
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
                        method627(var5[var8], class2.method177(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method627(class134.field2247, class2.method177(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1305 & 0x2) == 2) {
            method627(field619, field620 + " " + class2.field21 + " " + class2.method177(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("i.cs(Ld;IIII)V")
    public static final void method106(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field147 == arg0 || field719 >= 400) {
            return;
        }
        String var4;
        if (arg0.field45 == 0) {
            var4 = arg0.field39 + method561(arg0.field34, Statics.field147.field34) + " " + class2.field17 + class134.field2129 + arg0.field34 + class2.field23;
        } else {
            var4 = arg0.field39 + " " + class2.field17 + class134.field2228 + arg0.field45 + class2.field23;
        }
        if (field476 == 1) {
            method627(class134.field2232, field626 + " " + class2.field21 + " " + class2.method177(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field651) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field473[var5] != null) {
                    short var6 = 0;
                    if (field473[var5].equalsIgnoreCase(class134.field2103)) {
                        if (arg0.field34 > Statics.field147.field34) {
                            var6 = 2000;
                        }
                        if (Statics.field147.field28 != 0 && arg0.field28 != 0) {
                            if (Statics.field147.field28 == arg0.field28) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field592[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field590[var5] + var6;
                    method627(field473[var5], class2.method177(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1305 & 0x8) == 8) {
            method627(field619, field620 + " " + class2.field21 + " " + class2.method177(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field719; var9++) {
            if (field498[var9] == 23) {
                field488[var9] = class2.method177(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("aj.cd(IIS)Ljava/lang/String;")
    public static final String method561(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method177(16711680);
        } else if (var2 < -6) {
            return class2.method177(16723968);
        } else if (var2 < -3) {
            return class2.method177(16740352);
        } else if (var2 < 0) {
            return class2.method177(16756736);
        } else if (var2 > 9) {
            return class2.method177(65280);
        } else if (var2 > 6) {
            return class2.method177(4259584);
        } else if (var2 > 3) {
            return class2.method177(8453888);
        } else if (var2 > 0) {
            return class2.method177(12648192);
        } else {
            return class2.method177(16776960);
        }
    }

    @ObfuscatedName("al.cb(IIIIIIIIB)V")
    public static final void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class158.method3114(arg0)) {
            Statics.field1431 = null;
            method4(Statics.field2648[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1431 != null) {
                method4(Statics.field1431, -1412584499, arg1, arg2, arg3, arg4, Statics.field1513, Statics.field392, arg7);
                Statics.field1431 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field507[var8] = true;
            }
        } else {
            field507[arg7] = true;
        }
    }

    @ObfuscatedName("y.cx([Lfi;IIIIIIIIB)V")
    public static final void method4(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1795(arg2, arg3, arg4, arg5);
        class104.method2155();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2686 == arg1 || arg1 == -1412584499 && field632 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field667[field662] = var10.field2672 + arg6;
                    field531[field662] = var10.field2592 + arg7;
                    field669[field662] = var10.field2613;
                    field484[field662] = var10.field2697;
                    var11 = ++field662 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2695 = var11;
                var10.field2640 = field691;
                if (!var10.field2595 || !Statics.method154(var10)) {
                    if (var10.field2590 > 0) {
                        method35(var10);
                    }
                    int var12 = var10.field2672 + arg6;
                    int var13 = var10.field2592 + arg7;
                    int var14 = var10.field2608;
                    if (field632 == var10) {
                        if (arg1 != -1412584499 && !var10.field2651) {
                            Statics.field1431 = arg0;
                            Statics.field1513 = arg6;
                            Statics.field392 = arg7;
                            continue;
                        }
                        if (field627 && field637) {
                            int var15 = class77.field1401;
                            int var16 = class77.field1393;
                            int var17 = var15 - field505;
                            int var18 = var16 - field635;
                            if (var17 < field638) {
                                var17 = field638;
                            }
                            if (var10.field2613 + var17 > field638 + field633.field2613) {
                                var17 = field638 + field633.field2613 - var10.field2613;
                            }
                            if (var18 < field639) {
                                var18 = field639;
                            }
                            if (var10.field2697 + var18 > field639 + field633.field2697) {
                                var18 = field639 + field633.field2697 - var10.field2697;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2651) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2588 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2588 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2613 + var12;
                        int var26 = var10.field2697 + var13;
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
                        int var29 = var10.field2613 + var12;
                        int var30 = var10.field2697 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2595 || var19 < var21 && var20 < var22) {
                        if (var10.field2590 != 0) {
                            if (var10.field2590 == 1337) {
                                field591 = var12;
                                field611 = var13;
                                int var31 = var10.field2613;
                                int var32 = var10.field2697;
                                class89.method1795(var12, var13, var12 + var31, var13 + var32);
                                class104.method2155();
                                field690++;
                                method199(true);
                                method198(true);
                                method199(false);
                                method198(false);
                                for (class10 var33 = (class10) field596.method3355(); var33 != null; var33 = (class10) field596.method3357()) {
                                    if (Statics.field68 != var33.field163 || field691 > var33.field140) {
                                        var33.method3395();
                                    } else if (field691 >= var33.field146) {
                                        if (var33.field169 > 0) {
                                            class25 var34 = field496[var33.field169 - 1];
                                            if (var34 != null && var34.field444 >= 0 && var34.field444 < 13312 && var34.field399 >= 0 && var34.field399 < 13312) {
                                                var33.method92(var34.field444, var34.field399, method129(var34.field444, var34.field399, var33.field163) - var33.field145, field691);
                                            }
                                        }
                                        if (var33.field169 < 0) {
                                            int var35 = -var33.field169 - 1;
                                            class3 var36;
                                            if (field586 == var35) {
                                                var36 = Statics.field147;
                                            } else {
                                                var36 = field580[var35];
                                            }
                                            if (var36 != null && var36.field444 >= 0 && var36.field444 < 13312 && var36.field399 >= 0 && var36.field399 < 13312) {
                                                var33.method92(var36.field444, var36.field399, method129(var36.field444, var36.field399, var33.field163) - var33.field145, field691);
                                            }
                                        }
                                        var33.method93(field539);
                                        Statics.field112.method1956(Statics.field68, (int) var33.field153, (int) var33.field152, (int) var33.field154, 60, var33, var33.field143, -1, false);
                                    }
                                }
                                for (class20 var37 = (class20) field597.method3355(); var37 != null; var37 = (class20) field597.method3357()) {
                                    if (Statics.field68 != var37.field290 || var37.field294) {
                                        var37.method3395();
                                    } else if (field691 >= var37.field292) {
                                        var37.method165(field539);
                                        if (var37.field294) {
                                            var37.method3395();
                                        } else {
                                            Statics.field112.method1956(var37.field290, var37.field288, var37.field289, var37.field293, 60, var37, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field707) {
                                    int var38 = field546;
                                    if (field601 / 256 > var38) {
                                        var38 = field601 / 256;
                                    }
                                    if (field492[4] && field710[4] + 128 > var38) {
                                        var38 = field710[4] + 128;
                                    }
                                    int var39 = field609 + field467 & 0x7FF;
                                    int var40 = Statics.field1023;
                                    int var41 = method129(Statics.field147.field444, Statics.field147.field399, Statics.field68) - 50;
                                    int var42 = Statics.field2521;
                                    int var43 = var38 * 3 + 600;
                                    int var44 = 2048 - var38 & 0x7FF;
                                    int var45 = 2048 - var39 & 0x7FF;
                                    int var46 = 0;
                                    int var47 = 0;
                                    int var48 = var43;
                                    if (var44 != 0) {
                                        int var49 = class104.field1770[var44];
                                        int var50 = class104.field1771[var44];
                                        int var51 = var47 * var50 - var43 * var49 >> 16;
                                        var48 = var47 * var49 + var43 * var50 >> 16;
                                        var47 = var51;
                                    }
                                    if (var45 != 0) {
                                        int var52 = class104.field1770[var45];
                                        int var53 = class104.field1771[var45];
                                        int var54 = var46 * var53 + var48 * var52 >> 16;
                                        var48 = var48 * var53 - var46 * var52 >> 16;
                                        var46 = var54;
                                    }
                                    Statics.field1457 = var40 - var46;
                                    Statics.field2711 = var41 - var47;
                                    Statics.field174 = var42 - var48;
                                    Statics.field1919 = var38;
                                    Statics.field1776 = var39;
                                }
                                int var67;
                                if (field707) {
                                    int var68;
                                    if (Statics.field277.field183) {
                                        var68 = Statics.field68;
                                    } else {
                                        int var69 = method129(Statics.field1457, Statics.field174, Statics.field68);
                                        if (var69 - Statics.field2711 >= 800 || (class9.field133[Statics.field68][Statics.field1457 >> 7][Statics.field174 >> 7] & 0x4) == 0) {
                                            var68 = 3;
                                        } else {
                                            var68 = Statics.field68;
                                        }
                                    }
                                    var67 = var68;
                                } else {
                                    int var55;
                                    if (Statics.field277.field183) {
                                        var55 = Statics.field68;
                                    } else {
                                        int var56 = 3;
                                        if (Statics.field1919 < 310) {
                                            int var57 = Statics.field1457 >> 7;
                                            int var58 = Statics.field174 >> 7;
                                            int var59 = Statics.field147.field444 >> 7;
                                            int var60 = Statics.field147.field399 >> 7;
                                            if ((class9.field133[Statics.field68][var57][var58] & 0x4) != 0) {
                                                var56 = Statics.field68;
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
                                                    if ((class9.field133[Statics.field68][var57][var58] & 0x4) != 0) {
                                                        var56 = Statics.field68;
                                                    }
                                                    var64 += var63;
                                                    if (var64 >= 65536) {
                                                        var64 -= 65536;
                                                        if (var58 < var60) {
                                                            var58++;
                                                        } else if (var58 > var60) {
                                                            var58--;
                                                        }
                                                        if ((class9.field133[Statics.field68][var57][var58] & 0x4) != 0) {
                                                            var56 = Statics.field68;
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
                                                    if ((class9.field133[Statics.field68][var57][var58] & 0x4) != 0) {
                                                        var56 = Statics.field68;
                                                    }
                                                    var66 += var65;
                                                    if (var66 >= 65536) {
                                                        var66 -= 65536;
                                                        if (var57 < var59) {
                                                            var57++;
                                                        } else if (var57 > var59) {
                                                            var57--;
                                                        }
                                                        if ((class9.field133[Statics.field68][var57][var58] & 0x4) != 0) {
                                                            var56 = Statics.field68;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class9.field133[Statics.field68][Statics.field147.field444 >> 7][Statics.field147.field399 >> 7] & 0x4) != 0) {
                                            var56 = Statics.field68;
                                        }
                                        var55 = var56;
                                    }
                                    var67 = var55;
                                }
                                int var70 = Statics.field1457;
                                int var71 = Statics.field2711;
                                int var72 = Statics.field174;
                                int var73 = Statics.field1919;
                                int var74 = Statics.field1776;
                                for (int var75 = 0; var75 < 5; var75++) {
                                    if (field492[var75]) {
                                        int var76 = (int) (Math.random() * (double) (field709[var75] * 2 + 1) - (double) field709[var75] + Math.sin((double) field643[var75] / 100.0D * (double) field712[var75]) * (double) field710[var75]);
                                        if (var75 == 0) {
                                            Statics.field1457 += var76;
                                        }
                                        if (var75 == 1) {
                                            Statics.field2711 += var76;
                                        }
                                        if (var75 == 2) {
                                            Statics.field174 += var76;
                                        }
                                        if (var75 == 3) {
                                            Statics.field1776 = Statics.field1776 + var76 & 0x7FF;
                                        }
                                        if (var75 == 4) {
                                            Statics.field1919 += var76;
                                            if (Statics.field1919 < 128) {
                                                Statics.field1919 = 128;
                                            }
                                            if (Statics.field1919 > 383) {
                                                Statics.field1919 = 383;
                                            }
                                        }
                                    }
                                }
                                int var77 = class77.field1401;
                                int var78 = class77.field1393;
                                if (var77 >= var12 && var77 < var12 + var31 && var78 >= var13 && var78 < var13 + var32) {
                                    class112.field1904 = true;
                                    class112.field1907 = 0;
                                    class112.field1892 = class77.field1401 - var12;
                                    class112.field1906 = class77.field1393 - var13;
                                } else {
                                    class112.field1904 = false;
                                    class112.field1907 = 0;
                                }
                                method2440();
                                class89.method1804(var12, var13, var31, var32, 0);
                                method2440();
                                Statics.field112.method1921(Statics.field1457, Statics.field2711, Statics.field174, Statics.field1919, Statics.field1776, var67);
                                method2440();
                                Statics.field112.method1897();
                                field553 = 0;
                                for (int var79 = -1; var79 < field581 + field497; var79++) {
                                    class27 var80;
                                    if (var79 == -1) {
                                        var80 = Statics.field147;
                                    } else if (var79 < field581) {
                                        var80 = field580[field582[var79]];
                                    } else {
                                        var80 = field496[field648[var79 - field581]];
                                    }
                                    if (var80 != null && var80.method33()) {
                                        if (var80 instanceof class25) {
                                            class31 var81 = ((class25) var80).field376;
                                            if (var81.field791 != null) {
                                                var81 = var81.method612();
                                            }
                                            if (var81 == null) {
                                                continue;
                                            }
                                        }
                                        if (var79 >= field581) {
                                            class31 var84 = ((class25) var80).field376;
                                            if (var84.field791 != null) {
                                                var84 = var84.method612();
                                            }
                                            if (var84.field789 >= 0 && var84.field789 < Statics.field330.length) {
                                                method171(var80, var80.field429 + 15);
                                                if (field565 > -1) {
                                                    Statics.field330[var84.field789].method1704(field565 + var12 - 12, field566 + var13 - 30);
                                                }
                                            }
                                            if (field672 == 1 && field624 == field648[var79 - field581] && field691 % 20 < 10) {
                                                method171(var80, var80.field429 + 15);
                                                if (field565 > -1) {
                                                    Statics.field1821[0].method1704(field565 + var12 - 12, field566 + var13 - 28);
                                                }
                                            }
                                        } else {
                                            int var82 = 30;
                                            class3 var83 = (class3) var80;
                                            if (var83.field30 != -1 || var83.field31 != -1) {
                                                method171(var80, var80.field429 + 15);
                                                if (field565 > -1) {
                                                    if (var83.field30 != -1) {
                                                        Statics.field282[var83.field30].method1704(field565 + var12 - 12, field566 + var13 - var82);
                                                        var82 += 25;
                                                    }
                                                    if (var83.field31 != -1) {
                                                        Statics.field330[var83.field31].method1704(field565 + var12 - 12, field566 + var13 - var82);
                                                        var82 += 25;
                                                    }
                                                }
                                            }
                                            if (var79 >= 0 && field672 == 10 && field469 == field582[var79]) {
                                                method171(var80, var80.field429 + 15);
                                                if (field565 > -1) {
                                                    Statics.field1821[1].method1704(field565 + var12 - 12, field566 + var13 - var82);
                                                }
                                            }
                                        }
                                        if (var80.field402 != null) {
                                            label1994: {
                                                if (var79 < field581 && field678 != 0 && field678 != 3) {
                                                    if (field678 != 1) {
                                                        break label1994;
                                                    }
                                                    String var85 = ((class3) var80).field39;
                                                    boolean var86;
                                                    if (var85 == null) {
                                                        var86 = false;
                                                    } else {
                                                        String var87 = class148.method2054(var85, Statics.field1304);
                                                        int var88 = 0;
                                                        while (true) {
                                                            if (var88 >= field703) {
                                                                if (var85.equalsIgnoreCase(class148.method2054(Statics.field147.field39, Statics.field1304))) {
                                                                    var86 = true;
                                                                } else {
                                                                    var86 = false;
                                                                }
                                                                break;
                                                            }
                                                            if (var87.equalsIgnoreCase(class148.method2054(field715[var88].field353, Statics.field1304))) {
                                                                var86 = true;
                                                                break;
                                                            }
                                                            var88++;
                                                        }
                                                    }
                                                    if (!var86) {
                                                        break label1994;
                                                    }
                                                }
                                                method171(var80, var80.field429);
                                                if (field565 > -1 && field553 < field534) {
                                                    field558[field553] = Statics.field272.method3436(var80.field402) / 2;
                                                    field557[field553] = Statics.field272.field2841;
                                                    field555[field553] = field565;
                                                    field583[field553] = field566;
                                                    field559[field553] = var80.field413;
                                                    field657[field553] = var80.field409;
                                                    field561[field553] = var80.field412;
                                                    field562[field553] = var80.field402;
                                                    field553++;
                                                }
                                            }
                                        }
                                        if (var80.field423 > field691) {
                                            method171(var80, var80.field429 + 15);
                                            if (field565 > -1) {
                                                int var89 = var80.field420 * 30 / var80.field421;
                                                if (var89 > 30) {
                                                    var89 = 30;
                                                }
                                                class89.method1804(field565 + var12 - 15, field566 + var13 - 3, var89, 5, 65280);
                                                class89.method1804(field565 + var12 - 15 + var89, field566 + var13 - 3, 30 - var89, 5, 16711680);
                                            }
                                        }
                                        for (int var90 = 0; var90 < 4; var90++) {
                                            if (var80.field418[var90] > field691) {
                                                method171(var80, var80.field429 / 2);
                                                if (field565 > -1) {
                                                    if (var90 == 1) {
                                                        field566 -= 20;
                                                    }
                                                    if (var90 == 2) {
                                                        field565 -= 15;
                                                        field566 -= 10;
                                                    }
                                                    if (var90 == 3) {
                                                        field565 += 15;
                                                        field566 -= 10;
                                                    }
                                                    Statics.field1267[var80.field417[var90]].method1704(field565 + var12 - 12, field566 + var13 - 12);
                                                    Statics.field511.method3437(Integer.toString(var80.field431[var90]), field565 + var12 - 1, field566 + var13 + 3, 16777215, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var91 = 0; var91 < field553; var91++) {
                                    int var92 = field555[var91];
                                    int var93 = field583[var91];
                                    int var94 = field558[var91];
                                    int var95 = field557[var91];
                                    boolean var96 = true;
                                    while (var96) {
                                        var96 = false;
                                        for (int var97 = 0; var97 < var91; var97++) {
                                            if (var93 + 2 > field583[var97] - field557[var97] && var93 - var95 < field583[var97] + 2 && var92 - var94 < field558[var97] + field555[var97] && var92 + var94 > field555[var97] - field558[var97] && field583[var97] - field557[var97] < var93) {
                                                var93 = field583[var97] - field557[var97];
                                                var96 = true;
                                            }
                                        }
                                    }
                                    field565 = field555[var91];
                                    field566 = field583[var91] = var93;
                                    String var98 = field562[var91];
                                    if (field623 == 0) {
                                        int var99 = 16776960;
                                        if (field559[var91] < 6) {
                                            var99 = field677[field559[var91]];
                                        }
                                        if (field559[var91] == 6) {
                                            var99 = field690 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field559[var91] == 7) {
                                            var99 = field690 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field559[var91] == 8) {
                                            var99 = field690 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field559[var91] == 9) {
                                            int var100 = 150 - field561[var91];
                                            if (var100 < 50) {
                                                var99 = var100 * 1280 + 16711680;
                                            } else if (var100 < 100) {
                                                var99 = 16776960 - (var100 - 50) * 327680;
                                            } else if (var100 < 150) {
                                                var99 = (var100 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field559[var91] == 10) {
                                            int var101 = 150 - field561[var91];
                                            if (var101 < 50) {
                                                var99 = var101 * 5 + 16711680;
                                            } else if (var101 < 100) {
                                                var99 = 16711935 - (var101 - 50) * 327680;
                                            } else if (var101 < 150) {
                                                var99 = (var101 - 100) * 327680 + 255 - (var101 - 100) * 5;
                                            }
                                        }
                                        if (field559[var91] == 11) {
                                            int var102 = 150 - field561[var91];
                                            if (var102 < 50) {
                                                var99 = 16777215 - var102 * 327685;
                                            } else if (var102 < 100) {
                                                var99 = (var102 - 50) * 327685 + 65280;
                                            } else if (var102 < 150) {
                                                var99 = 16777215 - (var102 - 100) * 327680;
                                            }
                                        }
                                        if (field657[var91] == 0) {
                                            Statics.field272.method3437(var98, field565 + var12, field566 + var13, var99, 0);
                                        }
                                        if (field657[var91] == 1) {
                                            Statics.field272.method3439(var98, field565 + var12, field566 + var13, var99, 0, field690);
                                        }
                                        if (field657[var91] == 2) {
                                            Statics.field272.method3440(var98, field565 + var12, field566 + var13, var99, 0, field690);
                                        }
                                        if (field657[var91] == 3) {
                                            Statics.field272.method3441(var98, field565 + var12, field566 + var13, var99, 0, field690, 150 - field561[var91]);
                                        }
                                        if (field657[var91] == 4) {
                                            int var103 = (150 - field561[var91]) * (Statics.field272.method3436(var98) + 100) / 150;
                                            class89.method1796(field565 + var12 - 50, var13, field565 + var12 + 50, var13 + var32);
                                            Statics.field272.method3484(var98, field565 + var12 + 50 - var103, field566 + var13, var99, 0);
                                            class89.method1795(var12, var13, var12 + var31, var13 + var32);
                                        }
                                        if (field657[var91] == 5) {
                                            int var104 = 150 - field561[var91];
                                            int var105 = 0;
                                            if (var104 < 25) {
                                                var105 = var104 - 25;
                                            } else if (var104 > 125) {
                                                var105 = var104 - 125;
                                            }
                                            class89.method1796(var12, field566 + var13 - Statics.field272.field2841 - 1, var12 + var31, field566 + var13 + 5);
                                            Statics.field272.method3437(var98, field565 + var12, field566 + var13 + var105, var99, 0);
                                            class89.method1795(var12, var13, var12 + var31, var13 + var32);
                                        }
                                    } else {
                                        Statics.field272.method3437(var98, field565 + var12, field566 + var13, 16776960, 0);
                                    }
                                }
                                if (field672 == 2) {
                                    method686((field602 - Statics.field47 << 7) + field482, (field480 - Statics.field196 << 7) + field483, field605 * 2);
                                    if (field565 > -1 && field691 % 20 < 10) {
                                        Statics.field1821[0].method1704(field565 + var12 - 12, field566 + var13 - 28);
                                    }
                                }
                                ((class110) Statics.field1766).method2234(field539);
                                if (field570 == 1) {
                                    Statics.field241[field569 / 100].method1704(field716 - 8, field568 - 8);
                                }
                                if (field570 == 2) {
                                    Statics.field241[field569 / 100 + 4].method1704(field716 - 8, field568 - 8);
                                }
                                field579 = 0;
                                int var106 = (Statics.field147.field444 >> 7) + Statics.field47;
                                int var107 = (Statics.field147.field399 >> 7) + Statics.field196;
                                if (var106 >= 3053 && var106 <= 3156 && var107 >= 3056 && var107 <= 3136) {
                                    field579 = 1;
                                }
                                if (var106 >= 3072 && var106 <= 3118 && var107 >= 9492 && var107 <= 9535) {
                                    field579 = 1;
                                }
                                if (field579 == 1 && var106 >= 3139 && var106 <= 3199 && var107 >= 3008 && var107 <= 3062) {
                                    field579 = 0;
                                }
                                if (field474) {
                                    int var108 = var12 + 512 - 5;
                                    int var109 = var13 + 20;
                                    Statics.field295.method3438("Fps:" + field1317, var108, var109, 16776960, -1);
                                    int var270 = var109 + 15;
                                    Runtime var110 = Runtime.getRuntime();
                                    int var111 = (int) ((var110.totalMemory() - var110.freeMemory()) / 1024L);
                                    int var112 = 16776960;
                                    if (var111 > 32768 && field463) {
                                        var112 = 16711680;
                                    }
                                    if (var111 > 65536 && !field463) {
                                        var112 = 16711680;
                                    }
                                    Statics.field295.method3438("Mem:" + var111 + "k", var108, var270, var112, -1);
                                    var109 = var270 + 15;
                                }
                                Statics.field1457 = var70;
                                Statics.field2711 = var71;
                                Statics.field174 = var72;
                                Statics.field1919 = var73;
                                Statics.field1776 = var74;
                                if (field522) {
                                    byte var113 = 0;
                                    int var114 = class153.field2526 + class153.field2525 + var113;
                                    if (var114 == 0) {
                                        field522 = false;
                                    }
                                }
                                if (field522) {
                                    class89.method1804(var12, var13, var31, var32, 0);
                                    method1640(class134.field2133, false);
                                }
                                if (!field522 && !field694 && var77 >= var12 && var77 < var12 + var31 && var78 >= var13 && var78 < var13 + var32) {
                                    if (field476 == 0 && !field651) {
                                        method627(class134.field2098, "", 23, 0, var77 - var12, var78 - var13);
                                    }
                                    int var116 = -1;
                                    for (int var117 = 0; var117 < class112.field1907; var117++) {
                                        int var118 = class112.field1908[var117];
                                        int var119 = var118 & 0x7F;
                                        int var120 = var118 >> 7 & 0x7F;
                                        int var121 = var118 >> 29 & 0x3;
                                        int var122 = var118 >> 14 & 0x7FFF;
                                        if (var116 != var118) {
                                            var116 = var118;
                                            if (var121 == 2 && Statics.field112.method1913(Statics.field68, var119, var120, var118) >= 0) {
                                                class32 var123 = class32.method211(var122);
                                                if (var123.field838 != null) {
                                                    var123 = var123.method684();
                                                }
                                                if (var123 == null) {
                                                    continue;
                                                }
                                                if (field476 == 1) {
                                                    method627(class134.field2232, field626 + " " + class2.field21 + " " + class2.method177(65535) + var123.field806, 1, var118, var119, var120);
                                                } else if (!field651) {
                                                    String[] var124 = var123.field823;
                                                    if (field631) {
                                                        var124 = method2(var124);
                                                    }
                                                    if (var124 != null) {
                                                        for (int var125 = 4; var125 >= 0; var125--) {
                                                            if (var124[var125] != null) {
                                                                short var126 = 0;
                                                                if (var125 == 0) {
                                                                    var126 = 3;
                                                                }
                                                                if (var125 == 1) {
                                                                    var126 = 4;
                                                                }
                                                                if (var125 == 2) {
                                                                    var126 = 5;
                                                                }
                                                                if (var125 == 3) {
                                                                    var126 = 6;
                                                                }
                                                                if (var125 == 4) {
                                                                    var126 = 1001;
                                                                }
                                                                method627(var124[var125], class2.method177(65535) + var123.field806, var126, var118, var119, var120);
                                                            }
                                                        }
                                                    }
                                                    method627(class134.field2247, class2.method177(65535) + var123.field806, 1002, var123.field803 << 14, var119, var120);
                                                } else if ((Statics.field1305 & 0x4) == 4) {
                                                    method627(field619, field620 + " " + class2.field21 + " " + class2.method177(65535) + var123.field806, 2, var118, var119, var120);
                                                }
                                            }
                                            if (var121 == 1) {
                                                class25 var127 = field496[var122];
                                                if (var127.field376.field767 == 1 && (var127.field444 & 0x7F) == 64 && (var127.field399 & 0x7F) == 64) {
                                                    for (int var128 = 0; var128 < field497; var128++) {
                                                        class25 var129 = field496[field648[var128]];
                                                        if (var129 != null && var127 != var129 && var129.field376.field767 == 1 && var127.field444 == var129.field444 && var127.field399 == var129.field399) {
                                                            method825(var129.field376, field648[var128], var119, var120);
                                                        }
                                                    }
                                                    for (int var130 = 0; var130 < field581; var130++) {
                                                        class3 var131 = field580[field582[var130]];
                                                        if (var131 != null && var127.field444 == var131.field444 && var127.field399 == var131.field399) {
                                                            method106(var131, field582[var130], var119, var120);
                                                        }
                                                    }
                                                }
                                                method825(var127.field376, var122, var119, var120);
                                            }
                                            if (var121 == 0) {
                                                class3 var132 = field580[var122];
                                                if ((var132.field444 & 0x7F) == 64 && (var132.field399 & 0x7F) == 64) {
                                                    for (int var133 = 0; var133 < field497; var133++) {
                                                        class25 var134 = field496[field648[var133]];
                                                        if (var134 != null && var134.field376.field767 == 1 && var132.field444 == var134.field444 && var132.field399 == var134.field399) {
                                                            method825(var134.field376, field648[var133], var119, var120);
                                                        }
                                                    }
                                                    for (int var135 = 0; var135 < field581; var135++) {
                                                        class3 var136 = field580[field582[var135]];
                                                        if (var136 != null && var132 != var136 && var132.field444 == var136.field444 && var132.field399 == var136.field399) {
                                                            method106(var136, field582[var135], var119, var120);
                                                        }
                                                    }
                                                }
                                                method106(var132, var122, var119, var120);
                                            }
                                            if (var121 == 3) {
                                                class177 var137 = field594[Statics.field68][var119][var120];
                                                if (var137 != null) {
                                                    for (class17 var138 = (class17) var137.method3356(); var138 != null; var138 = (class17) var137.method3382()) {
                                                        class40 var139 = class40.method30(var138.field264);
                                                        if (field476 == 1) {
                                                            method627(class134.field2232, field626 + " " + class2.field21 + " " + class2.method177(16748608) + var139.field989, 16, var138.field264, var119, var120);
                                                        } else if (!field651) {
                                                            String[] var140 = var139.field984;
                                                            if (field631) {
                                                                var140 = method2(var140);
                                                            }
                                                            for (int var141 = 4; var141 >= 0; var141--) {
                                                                if (var140 != null && var140[var141] != null) {
                                                                    byte var142 = 0;
                                                                    if (var141 == 0) {
                                                                        var142 = 18;
                                                                    }
                                                                    if (var141 == 1) {
                                                                        var142 = 19;
                                                                    }
                                                                    if (var141 == 2) {
                                                                        var142 = 20;
                                                                    }
                                                                    if (var141 == 3) {
                                                                        var142 = 21;
                                                                    }
                                                                    if (var141 == 4) {
                                                                        var142 = 22;
                                                                    }
                                                                    method627(var140[var141], class2.method177(16748608) + var139.field989, var142, var138.field264, var119, var120);
                                                                } else if (var141 == 2) {
                                                                    method627(class134.field2081, class2.method177(16748608) + var139.field989, 20, var138.field264, var119, var120);
                                                                }
                                                            }
                                                            method627(class134.field2247, class2.method177(16748608) + var139.field989, 1004, var138.field264, var119, var120);
                                                        } else if ((Statics.field1305 & 0x1) == 1) {
                                                            method627(field619, field620 + " " + class2.field21 + " " + class2.method177(16748608) + var139.field989, 17, var138.field264, var119, var120);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                class89.method1795(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2590 == 1338) {
                                method28(var12, var13, var11);
                                class89.method1795(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var143 = class77.field1401;
                        int var144 = class77.field1393;
                        if (!field694 && var143 >= var19 && var144 >= var20 && var143 < var21 && var144 < var22) {
                            int var145 = var143 - var12;
                            int var146 = var144 - var13;
                            if (var10.field2591 == 1) {
                                method627(var10.field2687, "", 24, 0, 0, var10.field2656);
                            }
                            if (var10.field2591 == 2 && !field651) {
                                String var147 = method1419(var10);
                                if (var147 != null) {
                                    method627(var147, class2.method177(65280) + var10.field2649, 25, 0, -1, var10.field2656);
                                }
                            }
                            if (var10.field2591 == 3) {
                                method627(class134.field2230, "", 26, 0, 0, var10.field2656);
                            }
                            if (var10.field2591 == 4) {
                                method627(var10.field2687, "", 28, 0, 0, var10.field2656);
                            }
                            if (var10.field2591 == 5) {
                                method627(var10.field2687, "", 29, 0, 0, var10.field2656);
                            }
                            if (var10.field2591 == 6 && field460 == null) {
                                method627(var10.field2687, "", 30, 0, -1, var10.field2656);
                            }
                            if (var10.field2588 == 2) {
                                int var148 = 0;
                                for (int var149 = 0; var149 < var10.field2697; var149++) {
                                    for (int var150 = 0; var150 < var10.field2613; var150++) {
                                        int var151 = (var10.field2639 + 32) * var150;
                                        int var152 = (var10.field2701 + 32) * var149;
                                        if (var148 < 20) {
                                            var151 += var10.field2641[var148];
                                            var152 += var10.field2642[var148];
                                        }
                                        if (var145 >= var151 && var146 >= var152 && var145 < var151 + 32 && var146 < var152 + 32) {
                                            field576 = var148;
                                            Statics.field552 = var10;
                                            if (var10.field2644[var148] > 0) {
                                                label2018: {
                                                    class40 var153 = class40.method30(var10.field2644[var148] - 1);
                                                    if (field476 == 1) {
                                                        int var154 = method29(var10);
                                                        boolean var155 = (var154 >> 30 & 0x1) != 0;
                                                        if (var155) {
                                                            if (Statics.field388 != var10.field2656 || Statics.field2312 != var148) {
                                                                method627(class134.field2232, field626 + " " + class2.field21 + " " + class2.method177(16748608) + var153.field989, 31, var153.field968, var148, var10.field2656);
                                                            }
                                                            break label2018;
                                                        }
                                                    }
                                                    if (field651) {
                                                        int var156 = method29(var10);
                                                        boolean var157 = (var156 >> 30 & 0x1) != 0;
                                                        if (var157) {
                                                            if ((Statics.field1305 & 0x10) == 16) {
                                                                method627(field619, field620 + " " + class2.field21 + " " + class2.method177(16748608) + var153.field989, 32, var153.field968, var148, var10.field2656);
                                                            }
                                                            break label2018;
                                                        }
                                                    }
                                                    String[] var158 = var153.field980;
                                                    if (field631) {
                                                        var158 = method2(var158);
                                                    }
                                                    int var159 = method29(var10);
                                                    boolean var160 = (var159 >> 30 & 0x1) != 0;
                                                    if (var160) {
                                                        for (int var161 = 4; var161 >= 3; var161--) {
                                                            if (var158 != null && var158[var161] != null) {
                                                                byte var162;
                                                                if (var161 == 3) {
                                                                    var162 = 36;
                                                                } else {
                                                                    var162 = 37;
                                                                }
                                                                method627(var158[var161], class2.method177(16748608) + var153.field989, var162, var153.field968, var148, var10.field2656);
                                                            } else if (var161 == 4) {
                                                                method627(class134.field2200, class2.method177(16748608) + var153.field989, 37, var153.field968, var148, var10.field2656);
                                                            }
                                                        }
                                                    }
                                                    class162 var10000 = (class162) null;
                                                    if (class162.method37(method29(var10))) {
                                                        method627(class134.field2232, class2.method177(16748608) + var153.field989, 38, var153.field968, var148, var10.field2656);
                                                    }
                                                    int var163 = method29(var10);
                                                    boolean var164 = (var163 >> 30 & 0x1) != 0;
                                                    if (var164 && var158 != null) {
                                                        for (int var165 = 2; var165 >= 0; var165--) {
                                                            if (var158[var165] != null) {
                                                                byte var166 = 0;
                                                                if (var165 == 0) {
                                                                    var166 = 33;
                                                                }
                                                                if (var165 == 1) {
                                                                    var166 = 34;
                                                                }
                                                                if (var165 == 2) {
                                                                    var166 = 35;
                                                                }
                                                                method627(var158[var165], class2.method177(16748608) + var153.field989, var166, var153.field968, var148, var10.field2656);
                                                            }
                                                        }
                                                    }
                                                    String[] var167 = var10.field2606;
                                                    if (field631) {
                                                        var167 = method2(var167);
                                                    }
                                                    if (var167 != null) {
                                                        for (int var168 = 4; var168 >= 0; var168--) {
                                                            if (var167[var168] != null) {
                                                                byte var169 = 0;
                                                                if (var168 == 0) {
                                                                    var169 = 39;
                                                                }
                                                                if (var168 == 1) {
                                                                    var169 = 40;
                                                                }
                                                                if (var168 == 2) {
                                                                    var169 = 41;
                                                                }
                                                                if (var168 == 3) {
                                                                    var169 = 42;
                                                                }
                                                                if (var168 == 4) {
                                                                    var169 = 43;
                                                                }
                                                                method627(var167[var168], class2.method177(16748608) + var153.field989, var169, var153.field968, var148, var10.field2656);
                                                            }
                                                        }
                                                    }
                                                    method627(class134.field2247, class2.method177(16748608) + var153.field989, 1005, var153.field968, var148, var10.field2656);
                                                }
                                            }
                                        }
                                        var148++;
                                    }
                                }
                            }
                            if (var10.field2595) {
                                if (!field651) {
                                    for (int var170 = 9; var170 >= 5; var170--) {
                                        String var171 = method1374(var10, var170);
                                        if (var171 != null) {
                                            method627(var171, var10.field2693, 1007, var170 + 1, var10.field2587, var10.field2656);
                                        }
                                    }
                                    String var172 = method1419(var10);
                                    if (var172 != null) {
                                        method627(var172, var10.field2693, 25, 0, var10.field2587, var10.field2656);
                                    }
                                    for (int var173 = 4; var173 >= 0; var173--) {
                                        String var174 = method1374(var10, var173);
                                        if (var174 != null) {
                                            method627(var174, var10.field2693, 57, var173 + 1, var10.field2587, var10.field2656);
                                        }
                                    }
                                    if (class162.method1417(method29(var10))) {
                                        method627(class134.field2086, "", 30, 0, var10.field2587, var10.field2656);
                                    }
                                } else if (class162.method2701(method29(var10)) && (Statics.field1305 & 0x20) == 32) {
                                    method627(field619, field620 + " " + class2.field21 + " " + var10.field2693, 58, 0, var10.field2587, var10.field2656);
                                }
                            }
                        }
                        if (var10.field2588 == 0) {
                            if (!var10.field2595 && Statics.method154(var10) && Statics.field945 != var10) {
                                continue;
                            }
                            if (!var10.field2595) {
                                if (var10.field2600 > var10.field2602 - var10.field2697) {
                                    var10.field2600 = var10.field2602 - var10.field2697;
                                }
                                if (var10.field2600 < 0) {
                                    var10.field2600 = 0;
                                }
                            }
                            method4(arg0, var10.field2656, var19, var20, var21, var22, var12 - var10.field2599, var13 - var10.field2600, var11);
                            if (var10.field2694 != null) {
                                method4(var10.field2694, var10.field2656, var19, var20, var21, var22, var12 - var10.field2599, var13 - var10.field2600, var11);
                            }
                            class4 var175 = (class4) field622.method3337((long) var10.field2656);
                            if (var175 != null) {
                                if (var175.field50 == 0 && class77.field1401 >= var19 && class77.field1393 >= var20 && class77.field1401 < var21 && class77.field1393 < var22 && !field694 && !field608) {
                                    field587[0] = class134.field2294;
                                    field488[0] = "";
                                    field498[0] = 1006;
                                    field719 = 1;
                                }
                                method811(var175.field54, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class89.method1795(arg2, arg3, arg4, arg5);
                            class104.method2155();
                        }
                        if (field666[var11] || field671 > 1) {
                            if (var10.field2588 == 0 && !var10.field2595 && var10.field2602 > var10.field2697) {
                                int var176 = var10.field2613 + var12;
                                int var177 = var10.field2600;
                                int var178 = var10.field2697;
                                int var179 = var10.field2602;
                                Statics.field79[0].method1783(var176, var13);
                                Statics.field79[1].method1783(var176, var13 + var178 - 16);
                                class89.method1804(var176, var13 + 16, 16, var178 - 32, field540);
                                int var180 = (var178 - 32) * var178 / var179;
                                if (var180 < 8) {
                                    var180 = 8;
                                }
                                int var181 = (var178 - 32 - var180) * var177 / (var179 - var178);
                                class89.method1804(var176, var13 + 16 + var181, 16, var180, field727);
                                class89.method1844(var176, var13 + 16 + var181, var180, field543);
                                class89.method1844(var176 + 1, var13 + 16 + var181, var180, field543);
                                class89.method1805(var176, var13 + 16 + var181, 16, field543);
                                class89.method1805(var176, var13 + 17 + var181, 16, field543);
                                class89.method1844(var176 + 15, var13 + 16 + var181, var180, field542);
                                class89.method1844(var176 + 14, var13 + 17 + var181, var180 - 1, field542);
                                class89.method1805(var176, var13 + 15 + var181 + var180, 16, field542);
                                class89.method1805(var176 + 1, var13 + 14 + var181 + var180, 15, field542);
                            }
                            if (var10.field2588 != 1) {
                                if (var10.field2588 == 2) {
                                    int var182 = 0;
                                    for (int var183 = 0; var183 < var10.field2697; var183++) {
                                        for (int var184 = 0; var184 < var10.field2613; var184++) {
                                            int var185 = (var10.field2639 + 32) * var184 + var12;
                                            int var186 = (var10.field2701 + 32) * var183 + var13;
                                            if (var182 < 20) {
                                                var185 += var10.field2641[var182];
                                                var186 += var10.field2642[var182];
                                            }
                                            if (var10.field2644[var182] > 0) {
                                                boolean var187 = false;
                                                boolean var188 = false;
                                                int var189 = var10.field2644[var182] - 1;
                                                if (var185 + 32 > arg2 && var185 < arg4 && var186 + 32 > arg3 && var186 < arg5 || Statics.field1252 == var10 && field617 == var182) {
                                                    class86 var190;
                                                    if (field476 == 1 && Statics.field2312 == var182 && Statics.field388 == var10.field2656) {
                                                        var190 = class40.method128(var189, var10.field2689[var182], 2, 0, false);
                                                    } else {
                                                        var190 = class40.method128(var189, var10.field2689[var182], 1, 3153952, false);
                                                    }
                                                    if (var190 == null) {
                                                        method41(var10);
                                                    } else if (Statics.field1252 == var10 && field617 == var182) {
                                                        int var191 = class77.field1401 - field574;
                                                        int var192 = class77.field1393 - field575;
                                                        if (var191 < 5 && var191 > -5) {
                                                            var191 = 0;
                                                        }
                                                        if (var192 < 5 && var192 > -5) {
                                                            var192 = 0;
                                                        }
                                                        if (field578 < 5) {
                                                            var191 = 0;
                                                            var192 = 0;
                                                        }
                                                        var190.method1700(var185 + var191, var186 + var192, 128);
                                                        if (arg1 != -1) {
                                                            class158 var193 = arg0[arg1 & 0xFFFF];
                                                            if (var186 + var192 < class89.field1483 && var193.field2600 > 0) {
                                                                int var194 = field539 * (class89.field1483 - var186 - var192) / 3;
                                                                if (var194 > field539 * 10) {
                                                                    var194 = field539 * 10;
                                                                }
                                                                if (var194 > var193.field2600) {
                                                                    var194 = var193.field2600;
                                                                }
                                                                var193.field2600 -= var194;
                                                                field575 += var194;
                                                                method41(var193);
                                                            }
                                                            if (var186 + var192 + 32 > class89.field1482 && var193.field2600 < var193.field2602 - var193.field2697) {
                                                                int var195 = field539 * (var186 + var192 + 32 - class89.field1482) / 3;
                                                                if (var195 > field539 * 10) {
                                                                    var195 = field539 * 10;
                                                                }
                                                                if (var195 > var193.field2602 - var193.field2697 - var193.field2600) {
                                                                    var195 = var193.field2602 - var193.field2697 - var193.field2600;
                                                                }
                                                                var193.field2600 += var195;
                                                                field575 -= var195;
                                                                method41(var193);
                                                            }
                                                        }
                                                    } else if (Statics.field937 == var10 && field572 == var182) {
                                                        var190.method1700(var185, var186, 128);
                                                    } else {
                                                        var190.method1704(var185, var186);
                                                    }
                                                }
                                            } else if (var10.field2643 != null && var182 < 20) {
                                                class86 var196 = var10.method3135(var182);
                                                if (var196 != null) {
                                                    var196.method1704(var185, var186);
                                                } else if (class158.field2646) {
                                                    method41(var10);
                                                }
                                            }
                                            var182++;
                                        }
                                    }
                                } else if (var10.field2588 == 3) {
                                    int var197;
                                    if (method687(var10)) {
                                        var197 = var10.field2604;
                                        if (Statics.field945 == var10 && var10.field2674 != 0) {
                                            var197 = var10.field2674;
                                        }
                                    } else {
                                        var197 = var10.field2657;
                                        if (Statics.field945 == var10 && var10.field2605 != 0) {
                                            var197 = var10.field2605;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2589) {
                                            class89.method1804(var12, var13, var10.field2613, var10.field2697, var197);
                                        } else {
                                            class89.method1826(var12, var13, var10.field2613, var10.field2697, var197);
                                        }
                                    } else if (var10.field2589) {
                                        class89.method1832(var12, var13, var10.field2613, var10.field2697, var197, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1794(var12, var13, var10.field2613, var10.field2697, var197, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2588 == 4) {
                                    class183 var198 = var10.method3134();
                                    if (var198 != null) {
                                        String var199 = var10.field2633;
                                        int var200;
                                        if (method687(var10)) {
                                            var200 = var10.field2604;
                                            if (Statics.field945 == var10 && var10.field2674 != 0) {
                                                var200 = var10.field2674;
                                            }
                                            if (var10.field2634.length() > 0) {
                                                var199 = var10.field2634;
                                            }
                                        } else {
                                            var200 = var10.field2657;
                                            if (Statics.field945 == var10 && var10.field2605 != 0) {
                                                var200 = var10.field2605;
                                            }
                                        }
                                        if (var10.field2595 && var10.field2667 != -1) {
                                            class40 var201 = class40.method30(var10.field2667);
                                            var199 = var201.field989;
                                            if (var199 == null) {
                                                var199 = "null";
                                            }
                                            if ((var201.field981 == 1 || var10.field2691 != 1) && var10.field2691 != -1) {
                                                String var202 = class2.method177(16748608) + var199 + class2.field25 + " " + 'x';
                                                int var203 = var10.field2691;
                                                String var204 = Integer.toString(var203);
                                                for (int var205 = var204.length() - 3; var205 > 0; var205 -= 3) {
                                                    var204 = var204.substring(0, var205) + class2.field15 + var204.substring(var205);
                                                }
                                                String var206;
                                                StringBuilder var271;
                                                class134 var10001;
                                                if (var204.length() > 9) {
                                                    var271 = (new StringBuilder()).append(" ").append(class2.method177(65408)).append(var204.substring(0, var204.length() - 8));
                                                    var10001 = (class134) null;
                                                    var206 = var271.append(class134.field2181).append(" ").append(class2.field17).append(var204).append(class2.field23).append(class2.field25).toString();
                                                } else if (var204.length() > 6) {
                                                    var271 = (new StringBuilder()).append(" ").append(class2.method177(16777215)).append(var204.substring(0, var204.length() - 4));
                                                    var10001 = (class134) null;
                                                    var206 = var271.append(class134.field2256).append(" ").append(class2.field17).append(var204).append(class2.field23).append(class2.field25).toString();
                                                } else {
                                                    var206 = " " + class2.method177(16776960) + var204 + class2.field25;
                                                }
                                                var199 = var202 + var206;
                                            }
                                        }
                                        if (field460 == var10) {
                                            class134 var272 = (class134) null;
                                            var199 = class134.field2229;
                                            var200 = var10.field2657;
                                        }
                                        if (!var10.field2595) {
                                            var199 = method103(var199, var10);
                                        }
                                        var198.method3508(var199, var12, var13, var10.field2613, var10.field2697, var200, var10.field2638 ? 0 : -1, var10.field2636, var10.field2637, var10.field2635);
                                    } else if (class158.field2646) {
                                        method41(var10);
                                    }
                                } else if (var10.field2588 == 5) {
                                    if (var10.field2595) {
                                        class86 var208;
                                        if (var10.field2667 == -1) {
                                            var208 = var10.method3133(false);
                                        } else {
                                            var208 = class40.method128(var10.field2667, var10.field2691, var10.field2614, var10.field2665, false);
                                        }
                                        if (var208 != null) {
                                            int var209 = var208.field1464;
                                            int var210 = var208.field1465;
                                            if (var10.field2596) {
                                                class89.method1796(var12, var13, var10.field2613 + var12, var10.field2697 + var13);
                                                int var211 = (var10.field2613 + (var209 - 1)) / var209;
                                                int var212 = (var10.field2697 + (var210 - 1)) / var210;
                                                for (int var213 = 0; var213 < var211; var213++) {
                                                    for (int var214 = 0; var214 < var212; var214++) {
                                                        if (var10.field2612 != 0) {
                                                            var208.method1706(var209 / 2 + var209 * var213 + var12, var210 / 2 + var210 * var214 + var13, var10.field2612, 4096);
                                                        } else if (var14 == 0) {
                                                            var208.method1704(var209 * var213 + var12, var210 * var214 + var13);
                                                        } else {
                                                            var208.method1700(var209 * var213 + var12, var210 * var214 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1795(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var215 = var10.field2613 * 4096 / var209;
                                                if (var10.field2612 != 0) {
                                                    var208.method1706(var10.field2613 / 2 + var12, var10.field2697 / 2 + var13, var10.field2612, var215);
                                                } else if (var14 != 0) {
                                                    var208.method1702(var12, var13, var10.field2613, var10.field2697, 256 - (var14 & 0xFF));
                                                } else if (var10.field2613 == var209 && var10.field2697 == var210) {
                                                    var208.method1704(var12, var13);
                                                } else {
                                                    var208.method1721(var12, var13, var10.field2613, var10.field2697);
                                                }
                                            }
                                        } else if (class158.field2646) {
                                            method41(var10);
                                        }
                                    } else {
                                        class86 var207 = var10.method3133(method687(var10));
                                        if (var207 != null) {
                                            var207.method1704(var12, var13);
                                        } else if (class158.field2646) {
                                            method41(var10);
                                        }
                                    }
                                } else if (var10.field2588 == 6) {
                                    boolean var216 = method687(var10);
                                    int var217;
                                    if (var216) {
                                        var217 = var10.field2623;
                                    } else {
                                        var217 = var10.field2622;
                                    }
                                    class112 var218 = null;
                                    int var219 = 0;
                                    if (var10.field2667 != -1) {
                                        class40 var220 = class40.method30(var10.field2667);
                                        if (var220 != null) {
                                            class40 var221 = var220.method849(var10.field2691);
                                            var218 = var221.method863(1);
                                            if (var218 == null) {
                                                method41(var10);
                                            } else {
                                                var218.method2277();
                                                var219 = var218.field1541 / 2;
                                            }
                                        }
                                    } else if (var10.field2618 == 5) {
                                        if (var10.field2619 == 0) {
                                            var218 = field616.method3203((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var218 = Statics.field147.method20();
                                        }
                                    } else if (var217 == -1) {
                                        var218 = var10.method3139((class34) null, -1, var216, Statics.field147.field29);
                                        if (var218 == null && class158.field2646) {
                                            method41(var10);
                                        }
                                    } else {
                                        class34 var222 = class34.method540(var217);
                                        var218 = var10.method3139(var222, var10.field2692, var216, Statics.field147.field29);
                                        if (var218 == null && class158.field2646) {
                                            method41(var10);
                                        }
                                    }
                                    class104.method2147(var10.field2613 / 2 + var12, var10.field2697 / 2 + var13);
                                    int var223 = var10.field2629 * class104.field1770[var10.field2626] >> 16;
                                    int var224 = var10.field2629 * class104.field1771[var10.field2626] >> 16;
                                    if (var218 != null) {
                                        if (var10.field2595) {
                                            var218.method2277();
                                            if (var10.field2631) {
                                                var218.method2248(0, var10.field2627, var10.field2682, var10.field2626, var10.field2624, var10.field2625 + var219 + var223, var10.field2625 + var224, var10.field2629);
                                            } else {
                                                var218.method2260(0, var10.field2627, var10.field2682, var10.field2626, var10.field2624, var10.field2625 + var219 + var223, var10.field2625 + var224);
                                            }
                                        } else {
                                            var218.method2260(0, var10.field2627, 0, var10.field2626, 0, var223, var224);
                                        }
                                    }
                                    class104.method2146();
                                } else {
                                    if (var10.field2588 == 7) {
                                        class183 var225 = var10.method3134();
                                        if (var225 == null) {
                                            if (class158.field2646) {
                                                method41(var10);
                                            }
                                            continue;
                                        }
                                        int var226 = 0;
                                        for (int var227 = 0; var227 < var10.field2697; var227++) {
                                            for (int var228 = 0; var228 < var10.field2613; var228++) {
                                                if (var10.field2644[var226] > 0) {
                                                    class40 var229 = class40.method30(var10.field2644[var226] - 1);
                                                    String var230;
                                                    if (var229.field981 != 1 && var10.field2689[var226] == 1) {
                                                        var230 = class2.method177(16748608) + var229.field989 + class2.field25;
                                                    } else {
                                                        String var231 = class2.method177(16748608) + var229.field989 + class2.field25 + " " + 'x';
                                                        int var232 = var10.field2689[var226];
                                                        String var233 = Integer.toString(var232);
                                                        for (int var234 = var233.length() - 3; var234 > 0; var234 -= 3) {
                                                            var233 = var233.substring(0, var234) + class2.field15 + var233.substring(var234);
                                                        }
                                                        String var235;
                                                        if (var233.length() > 9) {
                                                            var235 = " " + class2.method177(65408) + var233.substring(0, var233.length() - 8) + class134.field2181 + " " + class2.field17 + var233 + class2.field23 + class2.field25;
                                                        } else if (var233.length() > 6) {
                                                            var235 = " " + class2.method177(16777215) + var233.substring(0, var233.length() - 4) + class134.field2256 + " " + class2.field17 + var233 + class2.field23 + class2.field25;
                                                        } else {
                                                            var235 = " " + class2.method177(16776960) + var233 + class2.field25;
                                                        }
                                                        var230 = var231 + var235;
                                                    }
                                                    int var236 = (var10.field2639 + 115) * var228 + var12;
                                                    int var237 = (var10.field2701 + 12) * var227 + var13;
                                                    if (var10.field2636 == 0) {
                                                        var225.method3484(var230, var236, var237, var10.field2657, var10.field2638 ? 0 : -1);
                                                    } else if (var10.field2636 == 1) {
                                                        var225.method3437(var230, var10.field2613 / 2 + var236, var237, var10.field2657, var10.field2638 ? 0 : -1);
                                                    } else {
                                                        var225.method3438(var230, var10.field2613 + var236 - 1, var237, var10.field2657, var10.field2638 ? 0 : -1);
                                                    }
                                                }
                                                var226++;
                                            }
                                        }
                                    }
                                    if (var10.field2588 == 8 && Statics.field612 == var10 && field614 == field501) {
                                        int var238 = 0;
                                        int var239 = 0;
                                        class183 var240 = Statics.field295;
                                        String var241 = var10.field2633;
                                        String var242 = method103(var241, var10);
                                        while (var242.length() > 0) {
                                            int var243 = var242.indexOf(class2.field14);
                                            String var244;
                                            if (var243 == -1) {
                                                var244 = var242;
                                                var242 = "";
                                            } else {
                                                var244 = var242.substring(0, var243);
                                                var242 = var242.substring(var243 + 4);
                                            }
                                            int var245 = var240.method3436(var244);
                                            if (var245 > var238) {
                                                var238 = var245;
                                            }
                                            var239 += var240.field2841 + 1;
                                        }
                                        var238 += 6;
                                        var239 += 7;
                                        int var246 = var10.field2613 + var12 - 5 - var238;
                                        int var247 = var10.field2697 + var13 + 5;
                                        if (var246 < var12 + 5) {
                                            var246 = var12 + 5;
                                        }
                                        if (var238 + var246 > arg4) {
                                            var246 = arg4 - var238;
                                        }
                                        if (var239 + var247 > arg5) {
                                            var247 = arg5 - var239;
                                        }
                                        class89.method1804(var246, var247, var238, var239, 16777120);
                                        class89.method1826(var246, var247, var238, var239, 0);
                                        String var248 = var10.field2633;
                                        int var249 = var240.field2841 + var247 + 2;
                                        String var250 = method103(var248, var10);
                                        while (var250.length() > 0) {
                                            int var251 = var250.indexOf(class2.field14);
                                            String var252;
                                            if (var251 == -1) {
                                                var252 = var250;
                                                var250 = "";
                                            } else {
                                                var252 = var250.substring(0, var251);
                                                var250 = var250.substring(var251 + 4);
                                            }
                                            var240.method3484(var252, var246 + 3, var249, 0, -1);
                                            var249 += var240.field2841 + 1;
                                        }
                                    }
                                    if (var10.field2588 == 9) {
                                        if (var10.field2609 == 1) {
                                            class89.method1852(var12, var13, var10.field2613 + var12, var10.field2697 + var13, var10.field2657);
                                        } else {
                                            int var253 = var10.field2613 >= 0 ? var10.field2613 : -var10.field2613;
                                            int var254 = var10.field2697 >= 0 ? var10.field2697 : -var10.field2697;
                                            int var255 = var253;
                                            if (var253 < var254) {
                                                var255 = var254;
                                            }
                                            if (var255 != 0) {
                                                int var256 = (var10.field2613 << 16) / var255;
                                                int var257 = (var10.field2697 << 16) / var255;
                                                if (var257 <= var256) {
                                                    var256 = -var256;
                                                } else {
                                                    var257 = -var257;
                                                }
                                                int var258 = var10.field2609 * var257 >> 17;
                                                int var259 = var10.field2609 * var257 + 1 >> 17;
                                                int var260 = var10.field2609 * var256 >> 17;
                                                int var261 = var10.field2609 * var256 + 1 >> 17;
                                                int var262 = var12 + var258;
                                                int var263 = var12 - var259;
                                                int var264 = var10.field2613 + var12 - var259;
                                                int var265 = var10.field2613 + var12 + var258;
                                                int var266 = var13 + var260;
                                                int var267 = var13 - var261;
                                                int var268 = var10.field2697 + var13 - var261;
                                                int var269 = var10.field2697 + var13 + var260;
                                                class104.method2143(var262, var263, var264);
                                                class104.method2174(var266, var267, var268, var262, var263, var264, var10.field2657);
                                                class104.method2143(var262, var264, var265);
                                                class104.method2174(var266, var268, var269, var262, var264, var265, var10.field2657);
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

    @ObfuscatedName("l.ca(Ljava/lang/String;Lfi;I)Ljava/lang/String;")
    public static String method103(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2357(method170(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field485 != null) {
                    int var6 = Statics.field485.field1411;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field485.field1413 != null) {
                        var5 = (String) Statics.field485.field1413;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("dx.cz(IB)Ljava/lang/String;")
    public static final String method2357(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ae.cj(Lfi;I)Z")
    public static final boolean method687(class158 arg0) {
        if (arg0.field2683 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2683.length; var1++) {
            int var2 = method170(arg0, var1);
            int var3 = arg0.field2684[var1];
            if (arg0.field2683[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2683[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2683[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("z.cv(Lfi;II)I")
    public static final int method170(class158 arg0, int arg1) {
        if (arg0.field2670 == null || arg1 >= arg0.field2670.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2670[arg1];
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
                    var7 = field598[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field599[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field600[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class158 var11 = class158.method792(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method30(var12).field983 || field564)) {
                        for (int var13 = 0; var13 < var11.field2644.length; var13++) {
                            if (var12 + 1 == var11.field2644[var13]) {
                                var7 += var11.field2689[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2705[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2042[field599[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2705[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field147.field34;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2043[var14]) {
                            var7 += field599[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method792(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method30(var18).field983 || field564)) {
                        for (int var19 = 0; var19 < var17.field2644.length; var19++) {
                            if (var18 + 1 == var17.field2644[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field685;
                }
                if (var6 == 12) {
                    var7 = field481;
                }
                if (var6 == 13) {
                    int var20 = class159.field2705[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method2974(var22);
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
                    var7 = (Statics.field147.field444 >> 7) + Statics.field47;
                }
                if (var6 == 19) {
                    var7 = (Statics.field147.field399 >> 7) + Statics.field196;
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

    @ObfuscatedName("bo.cm(IIIIIIII)V")
    public static final void method1351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class158.method3114(arg0)) {
            method2333(Statics.field2648[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("dm.cu([Lfi;IIIIIIII)V")
    public static final void method2333(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2595 || var9.field2588 == 0 || var9.field2653 || method29(var9) != 0 || field633 == var9) && var9.field2686 == arg1 && (!var9.field2595 || !Statics.method154(var9))) {
                int var10 = var9.field2672 + arg6;
                int var11 = var9.field2592 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2588 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2588 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2613 + var10;
                    int var19 = var9.field2697 + var11;
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
                    int var22 = var9.field2613 + var10;
                    int var23 = var9.field2697 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field632 == var9) {
                    field647 = true;
                    field641 = var10;
                    field658 = var11;
                }
                if (!var9.field2595 || var12 < var14 && var13 < var15) {
                    if (var9.field2590 == 1337) {
                        method41(var9);
                    } else if (var9.field2590 == 1338) {
                        method919(var10, var11);
                    } else {
                        if (var9.field2588 == 0) {
                            if (!var9.field2595 && Statics.method154(var9) && Statics.field945 != var9) {
                                continue;
                            }
                            method2333(arg0, var9.field2656, var12, var13, var14, var15, var10 - var9.field2599, var11 - var9.field2600);
                            if (var9.field2694 != null) {
                                method2333(var9.field2694, var9.field2656, var12, var13, var14, var15, var10 - var9.field2599, var11 - var9.field2600);
                            }
                            class4 var24 = (class4) field622.method3337((long) var9.field2656);
                            if (var24 != null) {
                                method1351(var24.field54, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2595) {
                            boolean var25;
                            if (class77.field1401 >= var12 && class77.field1393 >= var13 && class77.field1401 < var14 && class77.field1393 < var15) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            boolean var26 = false;
                            if (class77.field1391 == 1 && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            if (class77.field1402 == 1 && class77.field1399 >= var12 && class77.field1400 >= var13 && class77.field1399 < var14 && class77.field1400 < var15) {
                                var27 = true;
                            }
                            if (var27) {
                                int var28 = class77.field1399 - var10;
                                int var29 = class77.field1400 - var11;
                                if (field632 == null && !field694 && var9 != null && method212(var9) != null) {
                                    field632 = var9;
                                    field633 = method212(var9);
                                    field505 = var28;
                                    field635 = var29;
                                    Statics.field1013 = 0;
                                    field627 = false;
                                }
                            }
                            if (field632 != null && field632 != var9 && var25) {
                                int var30 = method29(var9);
                                boolean var31 = (var30 >> 20 & 0x1) != 0;
                                if (var31) {
                                    field630 = var9;
                                }
                            }
                            if (field633 == var9) {
                                field637 = true;
                                field638 = var10;
                                field639 = var11;
                            }
                            if (var9.field2653) {
                                if (var25 && field698 != 0 && var9.field2603 != null) {
                                    class1 var32 = new class1();
                                    var32.field2 = var9;
                                    var32.field6 = field698;
                                    var32.field13 = var9.field2603;
                                    field457.method3350(var32);
                                }
                                if (field632 != null || Statics.field1252 != null || field694) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (!var9.field2676 && var27) {
                                    var9.field2676 = true;
                                    if (var9.field2655 != null) {
                                        class1 var33 = new class1();
                                        var33.field2 = var9;
                                        var33.field3 = class77.field1399 - var10;
                                        var33.field6 = class77.field1400 - var11;
                                        var33.field13 = var9.field2655;
                                        field457.method3350(var33);
                                    }
                                }
                                if (var9.field2676 && var26 && var9.field2597 != null) {
                                    class1 var34 = new class1();
                                    var34.field2 = var9;
                                    var34.field3 = class77.field1401 - var10;
                                    var34.field6 = class77.field1393 - var11;
                                    var34.field13 = var9.field2597;
                                    field457.method3350(var34);
                                }
                                if (var9.field2676 && !var26) {
                                    var9.field2676 = false;
                                    if (var9.field2585 != null) {
                                        class1 var35 = new class1();
                                        var35.field2 = var9;
                                        var35.field3 = class77.field1401 - var10;
                                        var35.field6 = class77.field1393 - var11;
                                        var35.field13 = var9.field2585;
                                        field660.method3350(var35);
                                    }
                                }
                                if (var26 && var9.field2658 != null) {
                                    class1 var36 = new class1();
                                    var36.field2 = var9;
                                    var36.field3 = class77.field1401 - var10;
                                    var36.field6 = class77.field1393 - var11;
                                    var36.field13 = var9.field2658;
                                    field457.method3350(var36);
                                }
                                if (!var9.field2607 && var25) {
                                    var9.field2607 = true;
                                    if (var9.field2659 != null) {
                                        class1 var37 = new class1();
                                        var37.field2 = var9;
                                        var37.field3 = class77.field1401 - var10;
                                        var37.field6 = class77.field1393 - var11;
                                        var37.field13 = var9.field2659;
                                        field457.method3350(var37);
                                    }
                                }
                                if (var9.field2607 && var25 && var9.field2660 != null) {
                                    class1 var38 = new class1();
                                    var38.field2 = var9;
                                    var38.field3 = class77.field1401 - var10;
                                    var38.field6 = class77.field1393 - var11;
                                    var38.field13 = var9.field2660;
                                    field457.method3350(var38);
                                }
                                if (var9.field2607 && !var25) {
                                    var9.field2607 = false;
                                    if (var9.field2661 != null) {
                                        class1 var39 = new class1();
                                        var39.field2 = var9;
                                        var39.field3 = class77.field1401 - var10;
                                        var39.field6 = class77.field1393 - var11;
                                        var39.field13 = var9.field2661;
                                        field660.method3350(var39);
                                    }
                                }
                                if (var9.field2690 != null) {
                                    class1 var40 = new class1();
                                    var40.field2 = var9;
                                    var40.field13 = var9.field2690;
                                    field659.method3350(var40);
                                }
                                if (var9.field2666 != null && field692 > var9.field2671) {
                                    if (var9.field2698 == null || field692 - var9.field2671 > 32) {
                                        class1 var45 = new class1();
                                        var45.field2 = var9;
                                        var45.field13 = var9.field2666;
                                        field457.method3350(var45);
                                    } else {
                                        label446: for (int var41 = var9.field2671; var41 < field692; var41++) {
                                            int var42 = field645[var41 & 0x1F];
                                            for (int var43 = 0; var43 < var9.field2698.length; var43++) {
                                                if (var9.field2698[var43] == var42) {
                                                    class1 var44 = new class1();
                                                    var44.field2 = var9;
                                                    var44.field13 = var9.field2666;
                                                    field457.method3350(var44);
                                                    break label446;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2671 = field692;
                                }
                                if (var9.field2620 != null && field533 > var9.field2699) {
                                    if (var9.field2628 == null || field533 - var9.field2699 > 32) {
                                        class1 var50 = new class1();
                                        var50.field2 = var9;
                                        var50.field13 = var9.field2620;
                                        field457.method3350(var50);
                                    } else {
                                        label426: for (int var46 = var9.field2699; var46 < field533; var46++) {
                                            int var47 = field478[var46 & 0x1F];
                                            for (int var48 = 0; var48 < var9.field2628.length; var48++) {
                                                if (var9.field2628[var48] == var47) {
                                                    class1 var49 = new class1();
                                                    var49.field2 = var9;
                                                    var49.field13 = var9.field2620;
                                                    field457.method3350(var49);
                                                    break label426;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2699 = field533;
                                }
                                if (var9.field2616 != null && field650 > var9.field2700) {
                                    if (var9.field2696 == null || field650 - var9.field2700 > 32) {
                                        class1 var55 = new class1();
                                        var55.field2 = var9;
                                        var55.field13 = var9.field2616;
                                        field457.method3350(var55);
                                    } else {
                                        label406: for (int var51 = var9.field2700; var51 < field650; var51++) {
                                            int var52 = field649[var51 & 0x1F];
                                            for (int var53 = 0; var53 < var9.field2696.length; var53++) {
                                                if (var9.field2696[var53] == var52) {
                                                    class1 var54 = new class1();
                                                    var54.field2 = var9;
                                                    var54.field13 = var9.field2616;
                                                    field457.method3350(var54);
                                                    break label406;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2700 = field650;
                                }
                                if (field490 > var9.field2610 && var9.field2675 != null) {
                                    class1 var56 = new class1();
                                    var56.field2 = var9;
                                    var56.field13 = var9.field2675;
                                    field457.method3350(var56);
                                }
                                if (field652 > var9.field2610 && var9.field2677 != null) {
                                    class1 var57 = new class1();
                                    var57.field2 = var9;
                                    var57.field13 = var9.field2677;
                                    field457.method3350(var57);
                                }
                                if (field653 > var9.field2610 && var9.field2578 != null) {
                                    class1 var58 = new class1();
                                    var58.field2 = var9;
                                    var58.field13 = var9.field2578;
                                    field457.method3350(var58);
                                }
                                if (field654 > var9.field2610 && var9.field2679 != null) {
                                    class1 var59 = new class1();
                                    var59.field2 = var9;
                                    var59.field13 = var9.field2679;
                                    field457.method3350(var59);
                                }
                                var9.field2610 = field646;
                                if (var9.field2586 != null) {
                                    for (int var60 = 0; var60 < field682; var60++) {
                                        class1 var61 = new class1();
                                        var61.field2 = var9;
                                        var61.field1 = field684[var60];
                                        var61.field8 = field683[var60];
                                        var61.field13 = var9.field2586;
                                        field457.method3350(var61);
                                    }
                                }
                            }
                        }
                        if (!var9.field2595) {
                            if (field632 != null || Statics.field1252 != null || field694) {
                                return;
                            }
                            if ((var9.field2685 >= 0 || var9.field2605 != 0) && class77.field1401 >= var12 && class77.field1393 >= var13 && class77.field1401 < var14 && class77.field1393 < var15) {
                                if (var9.field2685 >= 0) {
                                    Statics.field945 = arg0[var9.field2685];
                                } else {
                                    Statics.field945 = var9;
                                }
                            }
                            if (var9.field2588 == 8 && class77.field1401 >= var12 && class77.field1393 >= var13 && class77.field1401 < var14 && class77.field1393 < var15) {
                                Statics.field612 = var9;
                            }
                            if (var9.field2602 > var9.field2697) {
                                int var62 = var9.field2613 + var10;
                                int var63 = var9.field2697;
                                int var64 = var9.field2602;
                                int var65 = class77.field1401;
                                int var66 = class77.field1393;
                                if (field544) {
                                    field545 = 32;
                                } else {
                                    field545 = 0;
                                }
                                field544 = false;
                                if (class77.field1391 != 0) {
                                    if (var65 >= var62 && var65 < var62 + 16 && var66 >= var11 && var66 < var11 + 16) {
                                        var9.field2600 -= 4;
                                        method41(var9);
                                    } else if (var65 >= var62 && var65 < var62 + 16 && var66 >= var11 + var63 - 16 && var66 < var11 + var63) {
                                        var9.field2600 += 4;
                                        method41(var9);
                                    } else if (var65 >= var62 - field545 && var65 < field545 + var62 + 16 && var66 >= var11 + 16 && var66 < var11 + var63 - 16) {
                                        int var67 = (var63 - 32) * var63 / var64;
                                        if (var67 < 8) {
                                            var67 = 8;
                                        }
                                        int var68 = var66 - var11 - 16 - var67 / 2;
                                        int var69 = var63 - 32 - var67;
                                        var9.field2600 = (var64 - var63) * var68 / var69;
                                        method41(var9);
                                        field544 = true;
                                    }
                                }
                                if (field698 != 0) {
                                    int var70 = var9.field2613;
                                    if (var65 >= var62 - var70 && var66 >= var11 && var65 < var62 + 16 && var66 <= var11 + var63) {
                                        var9.field2600 += field698 * 45;
                                        method41(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.ct([Lfi;II)V")
    public static final void method14(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2588 == 0) {
                    if (var3.field2694 != null) {
                        method14(var3.field2694, arg1);
                    }
                    class4 var4 = (class4) field622.method3337((long) var3.field2656);
                    if (var4 != null) {
                        int var5 = var4.field54;
                        if (class158.method3114(var5)) {
                            method14(Statics.field2648[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2680 != null) {
                    class1 var6 = new class1();
                    var6.field2 = var3;
                    var6.field13 = var3.field2680;
                    class26.method2369(var6);
                }
                if (arg1 == 1 && var3.field2681 != null) {
                    if (var3.field2587 >= 0) {
                        class158 var7 = class158.method792(var3.field2656);
                        if (var7 == null || var7.field2694 == null || var3.field2587 >= var7.field2694.length || var7.field2694[var3.field2587] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field2 = var3;
                    var8.field13 = var3.field2681;
                    class26.method2369(var8);
                }
            }
        }
    }

    @ObfuscatedName("s.cw(Lfi;B)V")
    public static void method41(class158 arg0) {
        if (field663 == arg0.field2640) {
            field507[arg0.field2695] = true;
        }
    }

    @ObfuscatedName("i.ch(I)V")
    public static void method117() {
        for (class4 var0 = (class4) field622.method3335(); var0 != null; var0 = (class4) field622.method3342()) {
            int var1 = var0.field54;
            if (class158.method3114(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2648[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2595;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2819;
                    class158 var6 = class158.method792(var5);
                    if (var6 != null) {
                        method41(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.cg(Lfi;B)Lfi;")
    public static class158 method212(class158 arg0) {
        class158 var1 = method2400(arg0);
        if (var1 == null) {
            var1 = arg0.field2669;
        }
        return var1;
    }

    @ObfuscatedName("y.ce([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("al.cy([Lfi;IB)V")
    public static final void method808(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2686 == arg1 && (!var3.field2595 || !Statics.method154(var3))) {
                if (var3.field2588 == 0) {
                    if (!var3.field2595 && Statics.method154(var3) && Statics.field945 != var3) {
                        continue;
                    }
                    method808(arg0, var3.field2656);
                    if (var3.field2694 != null) {
                        method808(var3.field2694, var3.field2656);
                    }
                    class4 var4 = (class4) field622.method3337((long) var3.field2656);
                    if (var4 != null) {
                        int var5 = var4.field54;
                        if (class158.method3114(var5)) {
                            method808(Statics.field2648[var5], -1);
                        }
                    }
                }
                if (var3.field2588 == 6) {
                    if (var3.field2622 != -1 || var3.field2623 != -1) {
                        boolean var6 = method687(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2623;
                        } else {
                            var7 = var3.field2622;
                        }
                        if (var7 != -1) {
                            class34 var8 = class34.method540(var7);
                            var3.field2584 += field539;
                            while (var3.field2584 > var8.field868[var3.field2692]) {
                                var3.field2584 -= var8.field868[var3.field2692];
                                var3.field2692++;
                                if (var3.field2692 >= var8.field863.length) {
                                    var3.field2692 -= var8.field870;
                                    if (var3.field2692 < 0 || var3.field2692 >= var8.field863.length) {
                                        var3.field2692 = 0;
                                    }
                                }
                                method41(var3);
                            }
                        }
                    }
                    if (var3.field2630 != 0 && !var3.field2595) {
                        int var9 = var3.field2630 >> 16;
                        int var10 = var3.field2630 << 16 >> 16;
                        int var11 = field539 * var9;
                        int var12 = field539 * var10;
                        var3.field2626 = var3.field2626 + var11 & 0x7FF;
                        var3.field2627 = var3.field2627 + var12 & 0x7FF;
                        method41(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.cl(II)V")
    public static final void method648(int arg0) {
        method117();
        for (class7 var1 = (class7) class7.field103.method3355(); var1 != null; var1 = (class7) class7.field103.method3357()) {
            if (var1.field101 != null) {
                var1.method43();
            }
        }
        class42 var2 = (class42) class42.field1025.method3288((long) arg0);
        class42 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1027.method2991(16, arg0);
            class42 var5 = new class42();
            if (var4 != null) {
                var5.method910(new class127(var4));
            }
            class42.field1025.method3291(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var6 = var3.field1019;
        if (var6 == 0) {
            return;
        }
        int var7 = class159.field2705[arg0];
        if (var6 == 1) {
            if (var7 == 1) {
                class104.method2203(0.9D);
                ((class110) Statics.field1766).method2231(0.9D);
            }
            if (var7 == 2) {
                class104.method2203(0.8D);
                ((class110) Statics.field1766).method2231(0.8D);
            }
            if (var7 == 3) {
                class104.method2203(0.7D);
                ((class110) Statics.field1766).method2231(0.7D);
            }
            if (var7 == 4) {
                class104.method2203(0.6D);
                ((class110) Statics.field1766).method2231(0.6D);
            }
            class40.field987.method3297();
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
            if (field696 != var8) {
                if (field696 == 0 && field697 != -1) {
                    class138.method213(Statics.field205, field697, 0, var8, false);
                    field680 = false;
                } else if (var8 == 0) {
                    class138.method1681();
                    field680 = false;
                } else if (class138.field2335 == 0) {
                    Statics.field2330.method2742(var8);
                } else {
                    Statics.field2047 = var8;
                }
                field696 = var8;
            }
        }
        if (var6 == 4) {
            if (var7 == 0) {
                field699 = 127;
            }
            if (var7 == 1) {
                field699 = 96;
            }
            if (var7 == 2) {
                field699 = 64;
            }
            if (var7 == 3) {
                field699 = 32;
            }
            if (var7 == 4) {
                field699 = 0;
            }
        }
        if (var6 == 5) {
            field549 = var7;
        }
        if (var6 == 6) {
            field623 = var7;
        }
        if (var6 == 9) {
            field670 = var7;
        }
        if (var6 != 10) {
            return;
        }
        if (var7 == 0) {
            field625 = 127;
        }
        if (var7 == 1) {
            field625 = 96;
        }
        if (var7 == 2) {
            field625 = 64;
        }
        if (var7 == 3) {
            field625 = 32;
        }
        if (var7 == 4) {
            field625 = 0;
        }
    }

    @ObfuscatedName("k.cc(Lfi;I)V")
    public static final void method35(class158 arg0) {
        int var1 = arg0.field2590;
        if (var1 == 324) {
            if (field720 == -1) {
                field720 = arg0.field2615;
                field721 = arg0.field2611;
            }
            if (field616.field2737) {
                arg0.field2615 = field720;
            } else {
                arg0.field2615 = field721;
            }
        } else if (var1 == 325) {
            if (field720 == -1) {
                field720 = arg0.field2615;
                field721 = arg0.field2611;
            }
            if (field616.field2737) {
                arg0.field2615 = field721;
            } else {
                arg0.field2615 = field720;
            }
        } else if (var1 == 327) {
            arg0.field2626 = 150;
            arg0.field2627 = (int) (Math.sin((double) field691 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2618 = 5;
            arg0.field2619 = 0;
        } else if (var1 == 328) {
            arg0.field2626 = 150;
            arg0.field2627 = (int) (Math.sin((double) field691 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2618 = 5;
            arg0.field2619 = 1;
        }
    }

    @ObfuscatedName("t.cf(I)V")
    public static final void method150() {
        field509.method2337(183);
        for (class4 var0 = (class4) field622.method3335(); var0 != null; var0 = (class4) field622.method3342()) {
            if (var0.field50 == 0 || var0.field50 == 3) {
                method2205(var0, true);
            }
        }
        if (field460 != null) {
            method41(field460);
            field460 = null;
        }
    }

    @ObfuscatedName("da.ci(IIIB)Lk;")
    public static final class4 method2325(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field54 = arg1;
        var3.field50 = arg2;
        field622.method3334(var3, (long) arg0);
        if (class158.method3114(arg1)) {
            class158[] var4 = Statics.field2648[arg1];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class158 var6 = var4[var5];
                if (var6 != null) {
                    var6.field2692 = 0;
                    var6.field2584 = 0;
                }
            }
        }
        if (arg1 != -1 && class158.method3114(arg1)) {
            class158[] var7 = Statics.field2648[arg1];
            for (int var8 = 0; var8 < var7.length; var8++) {
                class158 var9 = var7[var8];
                if (var9.field2654 != null) {
                    class1 var10 = new class1();
                    var10.field2 = var9;
                    var10.field13 = var9.field2654;
                    class26.method2369(var10);
                }
            }
        }
        class158 var11 = class158.method792(arg0);
        if (var11 != null) {
            method41(var11);
        }
        if (field460 != null) {
            method41(field460);
            field460 = null;
        }
        field694 = false;
        field719 = 0;
        Statics.method1193(Statics.field1777, Statics.field210, Statics.field957, Statics.field913);
        if (field621 != -1) {
            int var12 = field621;
            if (class158.method3114(var12)) {
                method14(Statics.field2648[var12], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("dq.cq(Lk;ZI)V")
    public static final void method2205(class4 arg0, boolean arg1) {
        int var2 = arg0.field54;
        int var3 = (int) arg0.field2819;
        arg0.method3395();
        if (arg1 && var2 != -1 && Statics.field2777[var2]) {
            Statics.field2579.method3031(var2);
            if (Statics.field2648[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2648[var2].length; var5++) {
                    if (Statics.field2648[var2][var5] != null) {
                        if (Statics.field2648[var2][var5].field2588 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2648[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2648[var2] = null;
                }
                Statics.field2777[var2] = false;
            }
        }
        method599(var2);
        class158 var6 = class158.method792(var3);
        if (var6 != null) {
            method41(var6);
        }
        field694 = false;
        field719 = 0;
        Statics.method1193(Statics.field1777, Statics.field210, Statics.field957, Statics.field913);
        if (field621 != -1) {
            int var7 = field621;
            if (class158.method3114(var7)) {
                method14(Statics.field2648[var7], 1);
            }
        }
    }

    @ObfuscatedName("d.cn(IIII)V")
    public static final void method28(int arg0, int arg1, int arg2) {
        method2440();
        class89.method1795(arg0, arg1, Statics.field1255.field1473 + arg0, Statics.field1255.field1471 + arg1);
        if (field724 == 2 || field724 == 5) {
            class89.method1848(arg0 + 25, arg1 + 5, 0, Statics.field2554, Statics.field1325);
        } else {
            int var3 = field674 + field609 & 0x7FF;
            int var4 = Statics.field147.field444 / 32 + 48;
            int var5 = 464 - Statics.field147.field399 / 32;
            Statics.field1021.method1740(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field536 + 256, Statics.field2554, Statics.field1325);
            for (int var6 = 0; var6 < field689; var6++) {
                int var7 = field595[var6] * 4 + 2 - Statics.field147.field444 / 32;
                int var8 = field477[var6] * 4 + 2 - Statics.field147.field399 / 32;
                method1631(arg0, arg1, var7, var8, field499[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field594[Statics.field68][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field147.field444 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field147.field399 / 32;
                        method1631(arg0, arg1, var12, var13, Statics.field265[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field497; var14++) {
                class25 var15 = field496[field648[var14]];
                if (var15 != null && var15.method33()) {
                    class31 var16 = var15.field376;
                    if (var16 != null && var16.field791 != null) {
                        var16 = var16.method612();
                    }
                    if (var16 != null && var16.field782 && var16.field773) {
                        int var17 = var15.field444 / 32 - Statics.field147.field444 / 32;
                        int var18 = var15.field399 / 32 - Statics.field147.field399 / 32;
                        method1631(arg0, arg1, var17, var18, Statics.field265[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field581; var19++) {
                class3 var20 = field580[field582[var19]];
                if (var20 != null && var20.method33()) {
                    int var21 = var20.field444 / 32 - Statics.field147.field444 / 32;
                    int var22 = var20.field399 / 32 - Statics.field147.field399 / 32;
                    boolean var23 = false;
                    String var24 = var20.field39;
                    boolean var25;
                    if (var24 == null) {
                        var25 = false;
                    } else {
                        String var26 = class148.method2054(var24, Statics.field1304);
                        int var27 = 0;
                        while (true) {
                            if (var27 >= field703) {
                                if (var24.equalsIgnoreCase(class148.method2054(Statics.field147.field39, Statics.field1304))) {
                                    var25 = true;
                                } else {
                                    var25 = false;
                                }
                                break;
                            }
                            if (var26.equalsIgnoreCase(class148.method2054(field715[var27].field353, Statics.field1304))) {
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
                    if (Statics.field147.field28 != 0 && var20.field28 != 0 && Statics.field147.field28 == var20.field28) {
                        var28 = true;
                    }
                    if (var23) {
                        method1631(arg0, arg1, var21, var22, Statics.field265[3]);
                    } else if (var28) {
                        method1631(arg0, arg1, var21, var22, Statics.field265[4]);
                    } else {
                        method1631(arg0, arg1, var21, var22, Statics.field265[2]);
                    }
                }
            }
            if (field672 != 0 && field691 % 20 < 10) {
                if (field672 == 1 && field624 >= 0 && field624 < field496.length) {
                    class25 var29 = field496[field624];
                    if (var29 != null) {
                        int var30 = var29.field444 / 32 - Statics.field147.field444 / 32;
                        int var31 = var29.field399 / 32 - Statics.field147.field399 / 32;
                        method31(arg0, arg1, var30, var31, Statics.field1297[1]);
                    }
                }
                if (field672 == 2) {
                    int var32 = field602 * 4 - Statics.field47 * 4 + 2 - Statics.field147.field444 / 32;
                    int var33 = field480 * 4 - Statics.field196 * 4 + 2 - Statics.field147.field399 / 32;
                    method31(arg0, arg1, var32, var33, Statics.field1297[1]);
                }
                if (field672 == 10 && field469 >= 0 && field469 < field580.length) {
                    class3 var34 = field580[field469];
                    if (var34 != null) {
                        int var35 = var34.field444 / 32 - Statics.field147.field444 / 32;
                        int var36 = var34.field399 / 32 - Statics.field147.field399 / 32;
                        method31(arg0, arg1, var35, var36, Statics.field1297[1]);
                    }
                }
            }
            if (field693 != 0) {
                int var37 = field693 * 4 + 2 - Statics.field147.field444 / 32;
                int var38 = field491 * 4 + 2 - Statics.field147.field399 / 32;
                method1631(arg0, arg1, var37, var38, Statics.field1297[0]);
            }
            class89.method1804(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field724 < 3) {
            Statics.field1198.method1740(arg0, arg1, 33, 33, 25, 25, field609, 256, Statics.field2064, Statics.field243);
        } else {
            class89.method1848(arg0, arg1, 0, Statics.field2064, Statics.field243);
        }
        if (field666[arg2]) {
            Statics.field1255.method1783(arg0, arg1);
        }
        field468[arg2] = true;
    }

    @ObfuscatedName("d.ck(IIIILcz;B)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1631(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field674 + field609 & 0x7FF;
        int var7 = class104.field1770[var6];
        int var8 = class104.field1771[var6];
        int var9 = var7 * 256 / (field536 + 256);
        int var10 = var8 * 256 / (field536 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field258.method1705(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("cb.cr(IIIILcz;I)V")
    public static final void method1631(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field674 + field609 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1770[var5];
        int var8 = class104.field1771[var5];
        int var9 = var7 * 256 / (field536 + 256);
        int var10 = var8 * 256 / (field536 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1743(Statics.field1255, arg0 + 94 + var11 - arg4.field1464 / 2 + 4, arg1 + 83 - var12 - arg4.field1465 / 2 - 4);
        } else {
            arg4.method1704(arg0 + 94 + var11 - arg4.field1464 / 2 + 4, arg1 + 83 - var12 - arg4.field1465 / 2 - 4);
        }
    }

    @ObfuscatedName("ed.dq(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method2740(int arg0, String arg1, String arg2) {
        method539(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("an.dc(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method539(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field500[var4] = field500[var4 - 1];
            field673[var4] = field673[var4 - 1];
            field472[var4] = field472[var4 - 1];
            field695[var4] = field695[var4 - 1];
        }
        field500[0] = arg0;
        field673[0] = arg1;
        field472[0] = arg2;
        field695[0] = arg3;
        field676++;
        field490 = field646;
    }

    @ObfuscatedName("w.dd(Ljava/lang/String;B)Z")
    public static boolean method200(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method2054(arg0, Statics.field1304);
        for (int var2 = 0; var2 < field470; var2++) {
            class11 var3 = field718[var2];
            if (var1.equalsIgnoreCase(class148.method2054(var3.field172, Statics.field1304))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method2054(var3.field171, Statics.field1304))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cn.dt(Ljava/lang/String;I)V")
    public static final void method2140(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field703 < 200 || field636 == 1) || field703 >= 200) {
            method2740(0, "", class134.field2237);
            return;
        }
        String var1 = class148.method2054(arg0, Statics.field1304);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field703; var2++) {
            class23 var3 = field715[var2];
            String var4 = class148.method2054(var3.field353, Statics.field1304);
            if (var4 != null && var4.equals(var1)) {
                method2740(0, "", arg0 + class134.field2238);
                return;
            }
            if (var3.field361 != null) {
                String var5 = class148.method2054(var3.field361, Statics.field1304);
                if (var5 != null && var5.equals(var1)) {
                    method2740(0, "", arg0 + class134.field2238);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field470; var6++) {
            class11 var7 = field718[var6];
            String var8 = class148.method2054(var7.field172, Statics.field1304);
            if (var8 != null && var8.equals(var1)) {
                method2740(0, "", class134.field2243 + arg0 + class134.field2152);
                return;
            }
            if (var7.field171 != null) {
                String var9 = class148.method2054(var7.field171, Statics.field1304);
                if (var9 != null && var9.equals(var1)) {
                    method2740(0, "", class134.field2243 + arg0 + class134.field2152);
                    return;
                }
            }
        }
        if (class148.method2054(Statics.field147.field39, Statics.field1304).equals(var1)) {
            method2740(0, "", class134.field2241);
        } else {
            field509.method2337(224);
            field509.method2444(class127.method2052(arg0));
            field509.method2484(arg0);
        }
    }

    @ObfuscatedName("bu.dy(Ljava/lang/String;ZS)V")
    public static final void method1570(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (field470 >= 100) {
            method2740(0, "", class134.field2239);
            return;
        }
        String var2 = class148.method2054(arg0, Statics.field1304);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field470; var3++) {
            class11 var4 = field718[var3];
            String var5 = class148.method2054(var4.field172, Statics.field1304);
            if (var5 != null && var5.equals(var2)) {
                method2740(0, "", arg0 + class134.field2300);
                return;
            }
            if (var4.field171 != null) {
                String var6 = class148.method2054(var4.field171, Statics.field1304);
                if (var6 != null && var6.equals(var2)) {
                    method2740(0, "", arg0 + class134.field2300);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field703; var7++) {
            class23 var8 = field715[var7];
            String var9 = class148.method2054(var8.field353, Statics.field1304);
            if (var9 != null && var9.equals(var2)) {
                method2740(0, "", class134.field2245 + arg0 + class134.field2246);
                return;
            }
            if (var8.field361 != null) {
                String var10 = class148.method2054(var8.field361, Statics.field1304);
                if (var10 != null && var10.equals(var2)) {
                    method2740(0, "", class134.field2245 + arg0 + class134.field2246);
                    return;
                }
            }
        }
        if (class148.method2054(Statics.field147.field39, Statics.field1304).equals(var2)) {
            method2740(0, "", class134.field2145);
        } else {
            field509.method2337(253);
            field509.method2444(class127.method2052(arg0));
            field509.method2484(arg0);
        }
    }

    @ObfuscatedName("ax.ds(Ljava/lang/String;I)V")
    public static final void method596(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class148.method2054(arg0, Statics.field1304);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field470; var2++) {
            class11 var3 = field718[var2];
            String var4 = var3.field172;
            String var5 = class148.method2054(var4, Statics.field1304);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field470--;
                for (int var7 = var2; var7 < field470; var7++) {
                    field718[var7] = field718[var7 + 1];
                }
                field652 = field646;
                field509.method2337(225);
                field509.method2444(class127.method2052(arg0));
                field509.method2484(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("y.dr(Ljava/lang/String;I)V")
    public static final void method6(String arg0) {
        if (!arg0.equals("")) {
            field509.method2337(177);
            field509.method2444(class127.method2052(arg0));
            field509.method2484(arg0);
        }
    }

    @ObfuscatedName("cx.dw(S)V")
    public static final void method1659() {
        field509.method2337(177);
        field509.method2444(0);
    }

    @ObfuscatedName("ax.da(II)V")
    public static void method599(int arg0) {
        for (class171 var1 = (class171) field661.method3335(); var1 != null; var1 = (class171) field661.method3342()) {
            if ((long) arg0 == (var1.field2819 >> 48 & 0xFFFFL)) {
                var1.method3395();
            }
        }
    }

    @ObfuscatedName("d.db(Lfi;I)I")
    public static int method29(class158 arg0) {
        class171 var1 = (class171) field661.method3337(((long) arg0.field2656 << 32) + (long) arg0.field2587);
        return var1 == null ? arg0.field2645 : var1.field2801;
    }

    @ObfuscatedName("dk.dm(Lfi;B)Lfi;")
    public static class158 method2400(class158 arg0) {
        int var1 = class162.method2436(method29(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class158.method792(arg0.field2686);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bb.do(Lfi;II)Ljava/lang/String;")
    public static String method1374(class158 arg0, int arg1) {
        if (!class162.method1245(method29(arg0), arg1) && arg0.field2673 == null) {
            return null;
        } else if (arg0.field2647 == null || arg0.field2647.length <= arg1 || arg0.field2647[arg1] == null || arg0.field2647[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2647[arg1];
        }
    }

    @ObfuscatedName("bc.dv(Lfi;B)Ljava/lang/String;")
    public static String method1419(class158 arg0) {
        int var1 = method29(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2652 == null || arg0.field2652.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2652;
        }
    }
}

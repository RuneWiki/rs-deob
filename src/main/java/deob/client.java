package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class73 {

    @ObfuscatedName("client.w")
    public static class164[] field572 = new class164[4];

    @ObfuscatedName("client.e")
    public static boolean field482 = true;

    @ObfuscatedName("client.t")
    public static int field702 = 1;

    @ObfuscatedName("client.p")
    public static int field484 = 0;

    @ObfuscatedName("client.l")
    public static boolean field654 = false;

    @ObfuscatedName("client.a")
    public static boolean field733 = false;

    @ObfuscatedName("client.z")
    public static int field488 = 0;

    @ObfuscatedName("client.m")
    public static int field641 = 0;

    @ObfuscatedName("client.u")
    public static boolean field490 = true;

    @ObfuscatedName("client.g")
    public static int field491 = 0;

    @ObfuscatedName("client.o")
    public static long field546 = 1L;

    @ObfuscatedName("client.j")
    public static int field493 = -1;

    @ObfuscatedName("client.n")
    public static int field494 = -1;

    @ObfuscatedName("client.q")
    public static int field495 = -1;

    @ObfuscatedName("client.c")
    public static boolean field614 = true;

    @ObfuscatedName("client.h")
    public static boolean field497 = false;

    @ObfuscatedName("client.b")
    public static int field586 = 0;

    @ObfuscatedName("client.ao")
    public static int field499 = 0;

    @ObfuscatedName("client.ae")
    public static int field500 = 0;

    @ObfuscatedName("client.aa")
    public static int field501 = 0;

    @ObfuscatedName("client.ah")
    public static int field560 = 0;

    @ObfuscatedName("client.aw")
    public static int field602 = 0;

    @ObfuscatedName("client.an")
    public static int field480 = 0;

    @ObfuscatedName("client.av")
    public static int field505 = 0;

    @ObfuscatedName("client.ak")
    public static int field506 = 0;

    @ObfuscatedName("client.ax")
    public static class127 field536 = new class127(new byte[5000]);

    @ObfuscatedName("client.ai")
    public static int field508 = 0;

    @ObfuscatedName("client.ac")
    public static int field509 = 0;

    @ObfuscatedName("client.al")
    public static int field545 = 0;

    @ObfuscatedName("client.bg")
    public static int field617 = 0;

    @ObfuscatedName("client.bp")
    public static int field575 = 0;

    @ObfuscatedName("client.bb")
    public static int field513 = 0;

    @ObfuscatedName("client.bc")
    public static int field514 = 0;

    @ObfuscatedName("client.by")
    public static int field515 = 0;

    @ObfuscatedName("client.bs")
    public static class25[] field632 = new class25[32768];

    @ObfuscatedName("client.bx")
    public static int field726 = 0;

    @ObfuscatedName("client.bl")
    public static int[] field487 = new int[32768];

    @ObfuscatedName("client.cd")
    public static class116 field520 = new class116(5000);

    @ObfuscatedName("client.ca")
    public static class116 field521 = new class116(5000);

    @ObfuscatedName("client.ck")
    public static class116 field522 = new class116(5000);

    @ObfuscatedName("client.cq")
    public static int field612 = 0;

    @ObfuscatedName("client.cg")
    public static int field524 = 0;

    @ObfuscatedName("client.ct")
    public static int field566 = 0;

    @ObfuscatedName("client.cc")
    public static int field670 = 0;

    @ObfuscatedName("client.cx")
    public static int field527 = 0;

    @ObfuscatedName("client.cu")
    public static int field528 = 0;

    @ObfuscatedName("client.cj")
    public static int field729 = 0;

    @ObfuscatedName("client.cp")
    public static int field489 = 0;

    @ObfuscatedName("client.cm")
    public static boolean field531 = false;

    @ObfuscatedName("client.ci")
    public static int field532 = 0;

    @ObfuscatedName("client.co")
    public static int field510 = 0;

    @ObfuscatedName("client.cn")
    public static int field561 = 1;

    @ObfuscatedName("client.ce")
    public static int field511 = 0;

    @ObfuscatedName("client.cv")
    public static int field492 = 1;

    @ObfuscatedName("client.df")
    public static int field538 = 0;

    @ObfuscatedName("client.dx")
    public static boolean field540 = false;

    @ObfuscatedName("client.dc")
    public static int[][][] field541 = new int[4][13][13];

    @ObfuscatedName("client.dv")
    public static final int[] field542 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ds")
    public static int field739 = 0;

    @ObfuscatedName("client.da")
    public static int[][] field544 = new int[104][104];

    @ObfuscatedName("client.dq")
    public static int[][] field502 = new int[104][104];

    @ObfuscatedName("client.dh")
    public static int[] field667 = new int[4000];

    @ObfuscatedName("client.dp")
    public static int[] field547 = new int[4000];

    @ObfuscatedName("client.du")
    public static int field735 = 0;

    @ObfuscatedName("client.dm")
    public static int field549 = 2;

    @ObfuscatedName("client.di")
    public static int field550 = 0;

    @ObfuscatedName("client.dr")
    public static int field551 = 2;

    @ObfuscatedName("client.dz")
    public static int field552 = 0;

    @ObfuscatedName("client.dn")
    public static int field553 = 1;

    @ObfuscatedName("client.dw")
    public static int field554 = 0;

    @ObfuscatedName("client.dg")
    public static int field555 = 0;

    @ObfuscatedName("client.ec")
    public static int field674 = 2;

    @ObfuscatedName("client.eb")
    public static int field557 = 0;

    @ObfuscatedName("client.ei")
    public static int field558 = 1;

    @ObfuscatedName("client.ex")
    public static int field543 = 0;

    @ObfuscatedName("client.eo")
    public static int field526 = 0;

    @ObfuscatedName("client.ez")
    public static int field663 = 2301979;

    @ObfuscatedName("client.eu")
    public static int field699 = 5063219;

    @ObfuscatedName("client.ee")
    public static int field565 = 3353893;

    @ObfuscatedName("client.fc")
    public static int field606 = 7759444;

    @ObfuscatedName("client.fr")
    public static boolean field692 = false;

    @ObfuscatedName("client.fv")
    public static int field568 = 0;

    @ObfuscatedName("client.fj")
    public static int field517 = 128;

    @ObfuscatedName("client.fo")
    public static int field570 = 0;

    @ObfuscatedName("client.fn")
    public static int field571 = 0;

    @ObfuscatedName("client.fb")
    public static int field652 = 0;

    @ObfuscatedName("client.fp")
    public static int field574 = 0;

    @ObfuscatedName("client.fg")
    public static boolean field600 = false;

    @ObfuscatedName("client.fu")
    public static int field569 = 0;

    @ObfuscatedName("client.fw")
    public static int field577 = 0;

    @ObfuscatedName("client.fh")
    public static int field578 = 50;

    @ObfuscatedName("client.fs")
    public static int[] field626 = new int[field578];

    @ObfuscatedName("client.fy")
    public static int[] field723 = new int[field578];

    @ObfuscatedName("client.fl")
    public static int[] field529 = new int[field578];

    @ObfuscatedName("client.ft")
    public static int[] field582 = new int[field578];

    @ObfuscatedName("client.fx")
    public static int[] field583 = new int[field578];

    @ObfuscatedName("client.fi")
    public static int[] field584 = new int[field578];

    @ObfuscatedName("client.fd")
    public static int[] field585 = new int[field578];

    @ObfuscatedName("client.gj")
    public static String[] field523 = new String[field578];

    @ObfuscatedName("client.gt")
    public static int[][] field587 = new int[104][104];

    @ObfuscatedName("client.ge")
    public static int field725 = 0;

    @ObfuscatedName("client.gq")
    public static int field589 = -1;

    @ObfuscatedName("client.gh")
    public static int field707 = -1;

    @ObfuscatedName("client.gp")
    public static int field507 = 0;

    @ObfuscatedName("client.gs")
    public static int field592 = 0;

    @ObfuscatedName("client.gz")
    public static int field593 = 0;

    @ObfuscatedName("client.gu")
    public static int field594 = 0;

    @ObfuscatedName("client.gg")
    public static int field534 = 0;

    @ObfuscatedName("client.gv")
    public static int field596 = 0;

    @ObfuscatedName("client.gn")
    public static int field597 = 0;

    @ObfuscatedName("client.gb")
    public static int field598 = 0;

    @ObfuscatedName("client.go")
    public static int field599 = 0;

    @ObfuscatedName("client.gy")
    public static int field656 = 0;

    @ObfuscatedName("client.gl")
    public static boolean field601 = false;

    @ObfuscatedName("client.gi")
    public static int field640 = 0;

    @ObfuscatedName("client.ga")
    public static int field603 = 0;

    @ObfuscatedName("client.gd")
    public static class3[] field604 = new class3[2048];

    @ObfuscatedName("client.gc")
    public static int field605 = 0;

    @ObfuscatedName("client.gf")
    public static int[] field525 = new int[2048];

    @ObfuscatedName("client.hr")
    public static int field607 = 0;

    @ObfuscatedName("client.hj")
    public static int[] field608 = new int[2048];

    @ObfuscatedName("client.hn")
    public static class127[] field609 = new class127[2048];

    @ObfuscatedName("client.hp")
    public static int field618 = -1;

    @ObfuscatedName("client.hg")
    public static int field611 = 0;

    @ObfuscatedName("client.hk")
    public static int field624 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field486 = new int[1000];

    @ObfuscatedName("client.hs")
    public static final int[] field504 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hb")
    public static String[] field615 = new String[8];

    @ObfuscatedName("client.hu")
    public static boolean[] field616 = new boolean[8];

    @ObfuscatedName("client.hf")
    public static int[] field643 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hd")
    public static class177[][][] field519 = new class177[4][104][104];

    @ObfuscatedName("client.ha")
    public static class177 field619 = new class177();

    @ObfuscatedName("client.hi")
    public static class177 field620 = new class177();

    @ObfuscatedName("client.hy")
    public static class177 field621 = new class177();

    @ObfuscatedName("client.hx")
    public static int[] field622 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field623 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field530 = new int[25];

    @ObfuscatedName("client.ht")
    public static int field556 = 0;

    @ObfuscatedName("client.hl")
    public static boolean field580 = false;

    @ObfuscatedName("client.ib")
    public static int field627 = 0;

    @ObfuscatedName("client.ih")
    public static int[] field628 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field629 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field630 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field631 = new int[500];

    @ObfuscatedName("client.ie")
    public static String[] field680 = new String[500];

    @ObfuscatedName("client.ik")
    public static String[] field633 = new String[500];

    @ObfuscatedName("client.iw")
    public static int field634 = -1;

    @ObfuscatedName("client.iy")
    public static int field635 = -1;

    @ObfuscatedName("client.iv")
    public static int field636 = 0;

    @ObfuscatedName("client.iu")
    public static int field637 = 50;

    @ObfuscatedName("client.ip")
    public static int field638 = 0;

    @ObfuscatedName("client.it")
    public static String field639 = null;

    @ObfuscatedName("client.io")
    public static boolean field610 = false;

    @ObfuscatedName("client.ia")
    public static int field591 = -1;

    @ObfuscatedName("client.iq")
    public static String field642 = null;

    @ObfuscatedName("client.is")
    public static String field595 = null;

    @ObfuscatedName("client.jl")
    public static int field644 = -1;

    @ObfuscatedName("client.jv")
    public static class175 field645 = new class175(8);

    @ObfuscatedName("client.jg")
    public static int field646 = 0;

    @ObfuscatedName("client.jf")
    public static int field647 = 0;

    @ObfuscatedName("client.ju")
    public static class158 field648 = null;

    @ObfuscatedName("client.jj")
    public static int field649 = 0;

    @ObfuscatedName("client.jk")
    public static int field559 = 0;

    @ObfuscatedName("client.jn")
    public static int field564 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field567 = false;

    @ObfuscatedName("client.jq")
    public static boolean field653 = false;

    @ObfuscatedName("client.jp")
    public static boolean field512 = false;

    @ObfuscatedName("client.jm")
    public static class158 field503 = null;

    @ObfuscatedName("client.jh")
    public static class158 field741 = null;

    @ObfuscatedName("client.jy")
    public static int field657 = 0;

    @ObfuscatedName("client.jo")
    public static int field658 = 0;

    @ObfuscatedName("client.ji")
    public static class158 field659 = null;

    @ObfuscatedName("client.js")
    public static boolean field660 = false;

    @ObfuscatedName("client.jw")
    public static int field625 = -1;

    @ObfuscatedName("client.jc")
    public static int field662 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field704 = false;

    @ObfuscatedName("client.jt")
    public static int field709 = -1;

    @ObfuscatedName("client.jb")
    public static int field665 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field666 = false;

    @ObfuscatedName("client.kf")
    public static int field682 = 1;

    @ObfuscatedName("client.kq")
    public static int[] field668 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field669 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field579 = new int[32];

    @ObfuscatedName("client.kt")
    public static int field671 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field672 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field673 = 0;

    @ObfuscatedName("client.km")
    public static int field483 = 0;

    @ObfuscatedName("client.ko")
    public static int field675 = 0;

    @ObfuscatedName("client.ka")
    public static int field676 = 0;

    @ObfuscatedName("client.ki")
    public static int field677 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field678 = new int[2000];

    @ObfuscatedName("client.ks")
    public static String[] field679 = new String[1000];

    @ObfuscatedName("client.kn")
    public static int field655 = 0;

    @ObfuscatedName("client.kk")
    public static class177 field537 = new class177();

    @ObfuscatedName("client.ke")
    public static class177 field746 = new class177();

    @ObfuscatedName("client.kr")
    public static class177 field683 = new class177();

    @ObfuscatedName("client.kw")
    public static class175 field684 = new class175(512);

    @ObfuscatedName("client.kh")
    public static int field498 = 0;

    @ObfuscatedName("client.kg")
    public static int field686 = -2;

    @ObfuscatedName("client.ku")
    public static boolean[] field687 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field688 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field689 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static int[] field690 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field691 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field650 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field693 = new int[100];

    @ObfuscatedName("client.lz")
    public static int field694 = 0;

    @ObfuscatedName("client.lo")
    public static int[] field695 = new int[100];

    @ObfuscatedName("client.lr")
    public static String[] field696 = new String[100];

    @ObfuscatedName("client.lj")
    public static String[] field697 = new String[100];

    @ObfuscatedName("client.lv")
    public static String[] field698 = new String[100];

    @ObfuscatedName("client.lp")
    public static int field581 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field700 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lu")
    public static int field701 = 0;

    @ObfuscatedName("client.lx")
    public static int field749 = 0;

    @ObfuscatedName("client.lm")
    public static long[] field703 = new long[100];

    @ObfuscatedName("client.li")
    public static int field685 = 0;

    @ObfuscatedName("client.ly")
    public static int field705 = 0;

    @ObfuscatedName("client.le")
    public static int[] field706 = new int[128];

    @ObfuscatedName("client.lw")
    public static int[] field613 = new int[128];

    @ObfuscatedName("client.ls")
    public static long field708 = -1L;

    @ObfuscatedName("client.lf")
    public static String field661 = null;

    @ObfuscatedName("client.mc")
    public static String field721 = null;

    @ObfuscatedName("client.mj")
    public static int field711 = -1;

    @ObfuscatedName("client.mi")
    public static int field712 = 0;

    @ObfuscatedName("client.mr")
    public static int[] field713 = new int[1000];

    @ObfuscatedName("client.mu")
    public static int[] field714 = new int[1000];

    @ObfuscatedName("client.me")
    public static class86[] field715 = new class86[1000];

    @ObfuscatedName("client.my")
    public static int field716 = 0;

    @ObfuscatedName("client.mn")
    public static int field717 = 0;

    @ObfuscatedName("client.mz")
    public static int field718 = 0;

    @ObfuscatedName("client.mo")
    public static int field719 = 255;

    @ObfuscatedName("client.mv")
    public static int field720 = -1;

    @ObfuscatedName("client.md")
    public static boolean field563 = false;

    @ObfuscatedName("client.mm")
    public static int field722 = 127;

    @ObfuscatedName("client.mq")
    public static int field539 = 127;

    @ObfuscatedName("client.nb")
    public static int field548 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field743 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field727 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field728 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field590 = new int[50];

    @ObfuscatedName("client.np")
    public static class57[] field730 = new class57[50];

    @ObfuscatedName("client.nv")
    public static boolean field731 = false;

    @ObfuscatedName("client.nl")
    public static boolean[] field732 = new boolean[5];

    @ObfuscatedName("client.nt")
    public static int[] field576 = new int[5];

    @ObfuscatedName("client.nk")
    public static int[] field734 = new int[5];

    @ObfuscatedName("client.nj")
    public static int[] field588 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field736 = new int[5];

    @ObfuscatedName("client.ov")
    public static int field737 = 0;

    @ObfuscatedName("client.oi")
    public static int field738 = 0;

    @ObfuscatedName("client.oy")
    public static class23[] field533 = new class23[400];

    @ObfuscatedName("client.oj")
    public static class173 field681 = new class173();

    @ObfuscatedName("client.or")
    public static int field535 = 0;

    @ObfuscatedName("client.oc")
    public static class11[] field742 = new class11[400];

    @ObfuscatedName("client.ot")
    public static class163 field664 = new class163();

    @ObfuscatedName("client.oh")
    public static int field744 = -1;

    @ObfuscatedName("client.os")
    public static int field745 = -1;

    @ObfuscatedName("client.e(B)V")
    public final void method276() {
    }

    public final void init() {
        if (!this.method1422()) {
            return;
        }
        class167[] var1 = new class167[] { class167.field2779, class167.field2776, class167.field2784, class167.field2780, class167.field2778, class167.field2777, class167.field2782, class167.field2781, class167.field2783 };
        class167[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class167 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2785);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2785)) {
                    case 1:
                        int var6 = Integer.parseInt(var5);
                        class132[] var7 = new class132[] { class132.field2071, class132.field2076, class132.field2074, class132.field2070 };
                        class132[] var8 = var7;
                        int var9 = 0;
                        class132 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class132 var10 = var8[var9];
                            if (var10.field2077 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field401 = var11;
                        break;
                    case 2:
                        class133[] var12 = Statics.method649();
                        int var13 = Integer.parseInt(var5);
                        class133[] var14 = var12;
                        int var15 = 0;
                        class133 var17;
                        while (true) {
                            if (var15 >= var14.length) {
                                var17 = null;
                                break;
                            }
                            class133 var16 = var14[var15];
                            if (var13 == var16.method2367()) {
                                var17 = var16;
                                break;
                            }
                            var15++;
                        }
                        Statics.field485 = (class133) var17;
                        if (Statics.field485 == class133.field2085) {
                            Statics.field76 = class186.field2867;
                        } else {
                            Statics.field76 = class186.field2863;
                        }
                        break;
                    case 3:
                        field484 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field1523 = var5;
                    case 5:
                    default:
                        break;
                    case 6:
                        field702 = Integer.parseInt(var5);
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field20)) {
                        }
                        break;
                    case 8:
                        field488 = Integer.parseInt(var5);
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class2.field20)) {
                            field654 = true;
                        } else {
                            field654 = false;
                        }
                }
            }
        }
        method56();
        Statics.field1186 = this.getCodeBase().getHost();
        String var18 = Statics.field401.field2073;
        byte var19 = 0;
        try {
            class82.method226("oldschool", var18, var19, 16);
        } catch (Exception var21) {
            class80.method4((String) null, var21);
        }
        Statics.field481 = this;
        this.method1411(765, 503, 31);
    }

    @ObfuscatedName("k.d(I)V")
    public static final void method56() {
        class95.field1557 = false;
        field733 = false;
    }

    @ObfuscatedName("client.p(I)V")
    public final void method279() {
        Statics.field260 = field484 == 0 ? 43594 : field702 + 40000;
        Statics.field516 = field484 == 0 ? 443 : field702 + 50000;
        Statics.field1440 = Statics.field260;
        Statics.field2719 = class161.field2704;
        Statics.field1793 = class161.field2705;
        Statics.field2717 = class161.field2709;
        Statics.field61 = class161.field2707;
        if (Statics.field1335.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1360[44] = 71;
            class75.field1360[45] = 26;
            class75.field1360[46] = 72;
            class75.field1360[47] = 73;
            class75.field1360[59] = 57;
            class75.field1360[61] = 27;
            class75.field1360[91] = 42;
            class75.field1360[92] = 74;
            class75.field1360[93] = 43;
            class75.field1360[192] = 28;
            class75.field1360[222] = 58;
            class75.field1360[520] = 59;
        } else {
            class75.field1360[186] = 57;
            class75.field1360[187] = 27;
            class75.field1360[188] = 71;
            class75.field1360[189] = 26;
            class75.field1360[190] = 72;
            class75.field1360[191] = 73;
            class75.field1360[192] = 58;
            class75.field1360[219] = 42;
            class75.field1360[220] = 74;
            class75.field1360[221] = 43;
            class75.field1360[222] = 59;
            class75.field1360[223] = 28;
        }
        class75.method536(Statics.field132);
        Statics.method2711(Statics.field132);
        class78 var1;
        try {
            var1 = new class78();
        } catch (Throwable var3) {
            var1 = null;
        }
        Statics.field285 = var1;
        if (Statics.field285 != null) {
            Statics.field285.method1342(Statics.field132);
        }
        Statics.field90 = new class71(255, class82.field1428, class82.field1429, 500000);
        Statics.field156 = class12.method2659();
        if (field484 != 0) {
            field497 = true;
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method393() {
        field491++;
        this.method498();
        while (true) {
            class177 var1 = class157.field2567;
            class156 var2;
            synchronized (class157.field2567) {
                var2 = (class156) class157.field2565.method3310();
            }
            if (var2 == null) {
                class138.method39();
                method736();
                class75.method3054();
                class77 var4 = class77.field1401;
                synchronized (class77.field1401) {
                    class77.field1389 = class77.field1387;
                    class77.field1391 = class77.field1388;
                    class77.field1396 = class77.field1397;
                    class77.field1390 = class77.field1399;
                    class77.field1398 = class77.field1394;
                    class77.field1385 = class77.field1395;
                    class77.field1400 = class77.field1392;
                    class77.field1399 = 0;
                }
                if (Statics.field285 != null) {
                    int var6 = Statics.field285.method1344();
                    field655 = var6;
                }
                if (field641 == 0) {
                    method2197();
                    Statics.field377.method1333();
                    for (int var7 = 0; var7 < 32; var7++) {
                        field1321[var7] = 0L;
                    }
                    for (int var8 = 0; var8 < 32; var8++) {
                        field1318[var8] = 0L;
                    }
                    Statics.field2330 = 0;
                } else if (field641 == 5) {
                    class21.method177(this);
                    method2197();
                    Statics.field377.method1333();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field1321[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field1318[var10] = 0L;
                    }
                    Statics.field2330 = 0;
                } else if (field641 == 10) {
                    class21.method177(this);
                } else if (field641 == 20) {
                    class21.method177(this);
                    method167();
                } else if (field641 == 25) {
                    method1353(false);
                    field510 = 0;
                    boolean var11 = true;
                    for (int var12 = 0; var12 < Statics.field2046.length; var12++) {
                        if (Statics.field94[var12] != -1 && Statics.field2046[var12] == null) {
                            Statics.field2046[var12] = Statics.field2450.method2970(Statics.field94[var12], 0);
                            if (Statics.field2046[var12] == null) {
                                var11 = false;
                                field510++;
                            }
                        }
                        if (Statics.field1[var12] != -1 && Statics.field366[var12] == null) {
                            Statics.field366[var12] = Statics.field2450.method2971(Statics.field1[var12], 0, Statics.field2710[var12]);
                            if (Statics.field366[var12] == null) {
                                var11 = false;
                                field510++;
                            }
                        }
                    }
                    if (var11) {
                        field511 = 0;
                        boolean var13 = true;
                        for (int var14 = 0; var14 < Statics.field2046.length; var14++) {
                            byte[] var15 = Statics.field366[var14];
                            if (var15 != null) {
                                int var16 = (Statics.field2464[var14] >> 8) * 64 - Statics.field1518;
                                int var17 = (Statics.field2464[var14] & 0xFF) * 64 - Statics.field1830;
                                if (field540) {
                                    var16 = 10;
                                    var17 = 10;
                                }
                                var13 &= class9.method157(var15, var16, var17);
                            }
                        }
                        if (var13) {
                            if (field538 != 0) {
                                method547(class134.field2098 + class2.field22 + class2.field16 + 100 + "%" + class2.field25, true);
                            }
                            method736();
                            method253();
                            method736();
                            Statics.field419.method1968();
                            method736();
                            System.gc();
                            for (int var18 = 0; var18 < 4; var18++) {
                                field572[var18].method3196();
                            }
                            for (int var19 = 0; var19 < 4; var19++) {
                                for (int var20 = 0; var20 < 104; var20++) {
                                    for (int var21 = 0; var21 < 104; var21++) {
                                        class9.field122[var19][var20][var21] = 0;
                                    }
                                }
                            }
                            method736();
                            class9.method1858();
                            int var22 = Statics.field2046.length;
                            for (class7 var23 = (class7) class7.field91.method3294(); var23 != null; var23 = (class7) class7.field91.method3296()) {
                                if (var23.field87 != null) {
                                    Statics.field292.method1103(var23.field87);
                                    var23.field87 = null;
                                }
                                if (var23.field92 != null) {
                                    Statics.field292.method1103(var23.field92);
                                    var23.field92 = null;
                                }
                            }
                            class7.field91.method3288();
                            method1353(true);
                            if (!field540) {
                                for (int var24 = 0; var24 < var22; var24++) {
                                    int var25 = (Statics.field2464[var24] >> 8) * 64 - Statics.field1518;
                                    int var26 = (Statics.field2464[var24] & 0xFF) * 64 - Statics.field1830;
                                    byte[] var27 = Statics.field2046[var24];
                                    if (var27 != null) {
                                        method736();
                                        class9.method1869(var27, var25, var26, Statics.field747 * 8 - 48, Statics.field740 * 8 - 48, field572);
                                    }
                                }
                                for (int var28 = 0; var28 < var22; var28++) {
                                    int var29 = (Statics.field2464[var28] >> 8) * 64 - Statics.field1518;
                                    int var30 = (Statics.field2464[var28] & 0xFF) * 64 - Statics.field1830;
                                    byte[] var31 = Statics.field2046[var28];
                                    if (var31 == null && Statics.field740 < 800) {
                                        method736();
                                        class9.method1377(var29, var30, 64, 64);
                                    }
                                }
                                method1353(true);
                                for (int var32 = 0; var32 < var22; var32++) {
                                    byte[] var33 = Statics.field366[var32];
                                    if (var33 != null) {
                                        int var34 = (Statics.field2464[var32] >> 8) * 64 - Statics.field1518;
                                        int var35 = (Statics.field2464[var32] & 0xFF) * 64 - Statics.field1830;
                                        method736();
                                        class95 var36 = Statics.field419;
                                        class164[] var37 = field572;
                                        class127 var38 = new class127(var33);
                                        int var39 = -1;
                                        while (true) {
                                            int var40 = var38.method2465();
                                            if (var40 == 0) {
                                                break;
                                            }
                                            var39 += var40;
                                            int var41 = 0;
                                            while (true) {
                                                int var42 = var38.method2465();
                                                if (var42 == 0) {
                                                    break;
                                                }
                                                var41 += var42 - 1;
                                                int var43 = var41 & 0x3F;
                                                int var44 = var41 >> 6 & 0x3F;
                                                int var45 = var41 >> 12;
                                                int var46 = var38.method2472();
                                                int var47 = var46 >> 2;
                                                int var48 = var46 & 0x3;
                                                int var49 = var34 + var44;
                                                int var50 = var35 + var43;
                                                if (var49 > 0 && var50 > 0 && var49 < 103 && var50 < 103) {
                                                    int var51 = var45;
                                                    if ((class9.field122[1][var49][var50] & 0x2) == 2) {
                                                        var51 = var45 - 1;
                                                    }
                                                    class164 var52 = null;
                                                    if (var51 >= 0) {
                                                        var52 = var37[var51];
                                                    }
                                                    class9.method272(var45, var49, var50, var39, var48, var47, var36, var52);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field540) {
                                int var53 = 0;
                                label365: while (true) {
                                    if (var53 >= 4) {
                                        for (int var64 = 0; var64 < 13; var64++) {
                                            for (int var65 = 0; var65 < 13; var65++) {
                                                int var66 = field541[0][var64][var65];
                                                if (var66 == -1) {
                                                    class9.method1377(var64 * 8, var65 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method1353(true);
                                        int var67 = 0;
                                        while (true) {
                                            if (var67 >= 4) {
                                                break label365;
                                            }
                                            method736();
                                            for (int var68 = 0; var68 < 13; var68++) {
                                                for (int var69 = 0; var69 < 13; var69++) {
                                                    int var70 = field541[var67][var68][var69];
                                                    if (var70 != -1) {
                                                        int var71 = var70 >> 24 & 0x3;
                                                        int var72 = var70 >> 1 & 0x3;
                                                        int var73 = var70 >> 14 & 0x3FF;
                                                        int var74 = var70 >> 3 & 0x7FF;
                                                        int var75 = (var73 / 8 << 8) + var74 / 8;
                                                        for (int var76 = 0; var76 < Statics.field2464.length; var76++) {
                                                            if (Statics.field2464[var76] == var75 && Statics.field366[var76] != null) {
                                                                class9.method128(Statics.field366[var76], var67, var68 * 8, var69 * 8, var71, (var73 & 0x7) * 8, (var74 & 0x7) * 8, var72, Statics.field419, field572);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var67++;
                                        }
                                    }
                                    method736();
                                    for (int var54 = 0; var54 < 13; var54++) {
                                        for (int var55 = 0; var55 < 13; var55++) {
                                            boolean var56 = false;
                                            int var57 = field541[var53][var54][var55];
                                            if (var57 != -1) {
                                                int var58 = var57 >> 24 & 0x3;
                                                int var59 = var57 >> 1 & 0x3;
                                                int var60 = var57 >> 14 & 0x3FF;
                                                int var61 = var57 >> 3 & 0x7FF;
                                                int var62 = (var60 / 8 << 8) + var61 / 8;
                                                for (int var63 = 0; var63 < Statics.field2464.length; var63++) {
                                                    if (Statics.field2464[var63] == var62 && Statics.field2046[var63] != null) {
                                                        class9.method247(Statics.field2046[var63], var53, var54 * 8, var55 * 8, var58, (var60 & 0x7) * 8, (var61 & 0x7) * 8, var59, field572);
                                                        var56 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var56) {
                                                class9.method2211(var53, var54 * 8, var55 * 8);
                                            }
                                        }
                                    }
                                    var53++;
                                }
                            }
                            method1353(true);
                            method253();
                            method736();
                            class9.method171(Statics.field419, field572);
                            method1353(true);
                            int var77 = class9.field117;
                            if (var77 > Statics.field379) {
                                var77 = Statics.field379;
                            }
                            if (var77 < Statics.field379 - 1) {
                                int var78 = Statics.field379 - 1;
                            }
                            if (field733) {
                                Statics.field419.method1956(class9.field117);
                            } else {
                                Statics.field419.method1956(0);
                            }
                            for (int var79 = 0; var79 < 104; var79++) {
                                for (int var80 = 0; var80 < 104; var80++) {
                                    method2035(var79, var80);
                                }
                            }
                            method736();
                            method55();
                            class32.field824.method3243();
                            if (Statics.field88 != null) {
                                field520.method2325(93);
                                field520.method2441(1057001181);
                            }
                            if (!field540) {
                                int var81 = (Statics.field747 - 6) / 8;
                                int var82 = (Statics.field747 + 6) / 8;
                                int var83 = (Statics.field740 - 6) / 8;
                                int var84 = (Statics.field740 + 6) / 8;
                                for (int var85 = var81 - 1; var85 <= var82 + 1; var85++) {
                                    for (int var86 = var83 - 1; var86 <= var84 + 1; var86++) {
                                        if (var85 < var81 || var85 > var82 || var86 < var83 || var86 > var84) {
                                            Statics.field2450.method2997("m" + var85 + "_" + var86);
                                            Statics.field2450.method2997("l" + var85 + "_" + var86);
                                        }
                                    }
                                }
                            }
                            method241(30);
                            method736();
                            Statics.field118 = (byte[][][]) null;
                            Statics.field1046 = (byte[][][]) null;
                            Statics.field119 = (byte[][][]) null;
                            Statics.field2032 = (byte[][][]) null;
                            Statics.field1511 = (int[][][]) null;
                            Statics.field133 = (byte[][][]) null;
                            Statics.field121 = (int[][]) null;
                            Statics.field127 = null;
                            Statics.field1513 = null;
                            Statics.field972 = null;
                            Statics.field24 = null;
                            Statics.field2054 = null;
                            field520.method2325(157);
                            Statics.field377.method1333();
                            for (int var87 = 0; var87 < 32; var87++) {
                                field1321[var87] = 0L;
                            }
                            for (int var88 = 0; var88 < 32; var88++) {
                                field1318[var88] = 0L;
                            }
                            Statics.field2330 = 0;
                        } else {
                            field538 = 2;
                        }
                    } else {
                        field538 = 1;
                    }
                }
                if (field641 == 30) {
                    method3230();
                } else if (field641 == 40) {
                    method167();
                }
                return;
            }
            var2.field2560.method3078(var2.field2559, (int) var2.field2817, var2.field2562, false);
        }
    }

    @ObfuscatedName("client.r(I)V")
    public final void method281() {
        boolean var1 = class138.method2315();
        if (var1 && field563 && Statics.field724 != null) {
            Statics.field724.method1174();
        }
        if (field1314) {
            Canvas var2 = Statics.field132;
            var2.removeKeyListener(class75.field1356);
            var2.removeFocusListener(class75.field1356);
            class75.field1361 = -1;
            class77.method1578(Statics.field132);
            if (Statics.field285 != null) {
                Statics.field285.method1345(Statics.field132);
            }
            this.method1452();
            class75.method536(Statics.field132);
            Statics.method2711(Statics.field132);
            if (Statics.field285 != null) {
                Statics.field285.method1342(Statics.field132);
            }
        }
        if (field641 == 0) {
            int var3 = class21.field338;
            String var4 = class21.field334;
            Color var5 = null;
            try {
                Graphics var6 = Statics.field132.getGraphics();
                if (Statics.field207 == null) {
                    Statics.field207 = new Font("Helvetica", 1, 13);
                    Statics.field1660 = Statics.field132.getFontMetrics(Statics.field207);
                }
                if (field1319) {
                    field1319 = false;
                    var6.setColor(Color.black);
                    var6.fillRect(0, 0, Statics.field1188, Statics.field1670);
                }
                if (var5 == null) {
                    var5 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field802 == null) {
                        Statics.field802 = Statics.field132.createImage(304, 34);
                    }
                    Graphics var7 = Statics.field802.getGraphics();
                    var7.setColor(var5);
                    var7.drawRect(0, 0, 303, 33);
                    var7.fillRect(2, 2, var3 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(1, 1, 301, 31);
                    var7.fillRect(var3 * 3 + 2, 2, 300 - var3 * 3, 30);
                    var7.setFont(Statics.field207);
                    var7.setColor(Color.white);
                    var7.drawString(var4, (304 - Statics.field1660.stringWidth(var4)) / 2, 22);
                    var6.drawImage(Statics.field802, Statics.field1188 / 2 - 152, Statics.field1670 / 2 - 18, (ImageObserver) null);
                } catch (Exception var20) {
                    int var9 = Statics.field1188 / 2 - 152;
                    int var10 = Statics.field1670 / 2 - 18;
                    var6.setColor(var5);
                    var6.drawRect(var9, var10, 303, 33);
                    var6.fillRect(var9 + 2, var10 + 2, var3 * 3, 30);
                    var6.setColor(Color.black);
                    var6.drawRect(var9 + 1, var10 + 1, 301, 31);
                    var6.fillRect(var3 * 3 + var9 + 2, var10 + 2, 300 - var3 * 3, 30);
                    var6.setFont(Statics.field207);
                    var6.setColor(Color.white);
                    var6.drawString(var4, var9 + (304 - Statics.field1660.stringWidth(var4)) / 2, var10 + 22);
                }
            } catch (Exception var21) {
                Statics.field132.repaint();
            }
        } else if (field641 == 5) {
            class21.method33(Statics.field1037, Statics.field763);
        } else if (field641 == 10) {
            class21.method33(Statics.field1037, Statics.field763);
        } else if (field641 == 20) {
            class21.method33(Statics.field1037, Statics.field763);
        } else if (field641 == 25) {
            if (field538 == 1) {
                if (field510 > field561) {
                    field561 = field510;
                }
                int var12 = (field561 * 50 - field510 * 50) / field561;
                method547(class134.field2098 + class2.field22 + class2.field16 + var12 + "%" + class2.field25, false);
            } else if (field538 == 2) {
                if (field511 > field492) {
                    field492 = field511;
                }
                int var13 = (field492 * 50 - field511 * 50) / field492 + 50;
                method547(class134.field2098 + class2.field22 + class2.field16 + var13 + "%" + class2.field25, false);
            } else {
                method547(class134.field2098, false);
            }
        } else if (field641 == 30) {
            method37();
        } else if (field641 == 40) {
            method547(class134.field2099 + class2.field22 + class134.field2149, false);
        }
        if (field641 == 30 && field694 == 0 && !field1319) {
            try {
                Graphics var14 = Statics.field132.getGraphics();
                for (int var15 = 0; var15 < field498; var15++) {
                    if (field688[var15]) {
                        Statics.field263.method1583(var14, field690[var15], field691[var15], field650[var15], field693[var15]);
                        field688[var15] = false;
                    }
                }
            } catch (Exception var23) {
                Statics.field132.repaint();
            }
        } else if (field641 > 0) {
            try {
                Graphics var17 = Statics.field132.getGraphics();
                Statics.field263.method1587(var17, 0, 0);
                field1319 = false;
                for (int var18 = 0; var18 < field498; var18++) {
                    field688[var18] = false;
                }
            } catch (Exception var22) {
                Statics.field132.repaint();
            }
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method282() {
        if (Statics.field1626 != null) {
            Statics.field1626.field262 = false;
        }
        Statics.field1626 = null;
        if (Statics.field307 != null) {
            Statics.field307.method1363();
            Statics.field307 = null;
        }
        class75.method173();
        class77.method3();
        Statics.field285 = null;
        if (Statics.field724 != null) {
            Statics.field724.method1172();
        }
        if (Statics.field755 != null) {
            Statics.field755.method1172();
        }
        if (Statics.field2526 != null) {
            Statics.field2526.method1363();
        }
        class157.method2039();
        class82.method2888();
    }

    @ObfuscatedName("y.a(II)V")
    public static void method241(int arg0) {
        if (field641 == arg0) {
            return;
        }
        if (field641 == 0) {
            Statics.field802 = null;
            Statics.field207 = null;
            Statics.field1660 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field575 = 0;
            field513 = 0;
            field514 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field979 != null) {
            Statics.field979.method1363();
            Statics.field979 = null;
        }
        if (field641 == 25) {
            field538 = 0;
            field510 = 0;
            field561 = 1;
            field511 = 0;
            field492 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field132;
            class154 var2 = Statics.field223;
            class154 var3 = Statics.field254;
            if (!Statics.field319) {
                class89.method1791();
                byte[] var4 = var2.method3029("title.jpg", "");
                Statics.field318 = new class86(var4, var1);
                Statics.field333 = Statics.field318.method1671();
                Statics.field320 = class84.method1474(var3, "logo", "");
                Statics.field315 = class84.method1474(var3, "titlebox", "");
                Statics.field316 = class84.method1474(var3, "titlebutton", "");
                Statics.field342 = class84.method53(var3, "runes", "");
                Statics.field1274 = class84.method53(var3, "title_mute", "");
                Statics.field130 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field130[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field130[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field130[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field130[var8 + 192] = 16777215;
                }
                Statics.field325 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field325[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field325[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field325[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field325[var12 + 192] = 16777215;
                }
                Statics.field23 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field23[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field23[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field23[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field23[var16 + 192] = 16777215;
                }
                Statics.field2041 = new int[256];
                Statics.field59 = new int[32768];
                Statics.field2035 = new int[32768];
                class21.method170((class87) null);
                Statics.field2006 = new int[32768];
                Statics.field328 = new int[32768];
                class21.field352 = 0;
                class21.field339 = "";
                class21.field340 = "";
                class21.field345 = false;
                if (Statics.field156.field190) {
                    class138.method249(2);
                } else {
                    class138.method35(2, Statics.field1034, "scape main", "", 255, false);
                }
                class153.method2942(false);
                Statics.field319 = true;
                Statics.field318.method1680(0, 0);
                Statics.field333.method1680(382, 0);
                Statics.field320.method1781(382 - Statics.field320.field1476 / 2, 18);
            }
        } else if (Statics.field319) {
            Statics.field315 = null;
            Statics.field316 = null;
            Statics.field342 = null;
            Statics.field318 = null;
            Statics.field333 = null;
            Statics.field320 = null;
            Statics.field1274 = null;
            Statics.field31 = null;
            Statics.field344 = null;
            Statics.field1305 = null;
            Statics.field2702 = null;
            Statics.field2016 = null;
            Statics.field130 = null;
            Statics.field325 = null;
            Statics.field23 = null;
            Statics.field2041 = null;
            Statics.field59 = null;
            Statics.field2035 = null;
            Statics.field2006 = null;
            Statics.field328 = null;
            class138.method249(2);
            class153.method2942(true);
            Statics.field319 = false;
        }
        field641 = arg0;
    }

    @ObfuscatedName("client.z(B)V")
    public void method498() {
        if (field641 == 1000) {
            return;
        }
        long var1 = class121.method145();
        int var3 = (int) (var1 - Statics.field2522);
        Statics.field2522 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class153.field2521 += var3;
        boolean var4;
        if (class153.field2527 == 0 && class153.field2539 == 0 && class153.field2529 == 0 && class153.field2524 == 0) {
            var4 = true;
        } else if (Statics.field2526 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class153.field2521 > 30000) {
                        throw new IOException();
                    }
                    while (class153.field2539 < 20 && class153.field2524 > 0) {
                        class155 var5 = (class155) class153.field2523.method3276();
                        class127 var6 = new class127(4);
                        var6.method2438(1);
                        var6.method2527((int) var5.field2817);
                        Statics.field2526.method1366(var6.field2049, 0, 4);
                        class153.field2525.method3278(var5, var5.field2817);
                        class153.field2524--;
                        class153.field2539++;
                    }
                    while (class153.field2527 < 20 && class153.field2529 > 0) {
                        class155 var7 = (class155) class153.field2530.method3249();
                        class127 var8 = new class127(4);
                        var8.method2438(0);
                        var8.method2527((int) var7.field2817);
                        Statics.field2526.method1366(var8.field2049, 0, 4);
                        var7.method3270();
                        class153.field2533.method3278(var7, var7.field2817);
                        class153.field2529--;
                        class153.field2527++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2526.method1365();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class153.field2521 = 0;
                        byte var11 = 0;
                        if (Statics.field2407 == null) {
                            var11 = 8;
                        } else if (class153.field2534 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class153.field2532.field2045;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2526.method1388(class153.field2532.field2049, class153.field2532.field2045, var12);
                            if (class153.field2537 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class153.field2532.field2049[class153.field2532.field2045 + var13] ^= class153.field2537;
                                }
                            }
                            class153.field2532.field2045 += var12;
                            if (class153.field2532.field2045 < var11) {
                                break;
                            }
                            if (Statics.field2407 == null) {
                                class153.field2532.field2045 = 0;
                                int var14 = class153.field2532.method2472();
                                int var15 = class153.field2532.method2615();
                                int var16 = class153.field2532.method2472();
                                int var17 = class153.field2532.method2457();
                                long var18 = (long) ((var14 << 16) + var15);
                                class155 var20 = (class155) class153.field2525.method3273(var18);
                                Statics.field2520 = true;
                                if (var20 == null) {
                                    var20 = (class155) class153.field2533.method3273(var18);
                                    Statics.field2520 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2407 = var20;
                                Statics.field1276 = new class127(var17 + var21 + Statics.field2407.field2554);
                                Statics.field1276.method2438(var16);
                                Statics.field1276.method2441(var17);
                                class153.field2534 = 8;
                                class153.field2532.field2045 = 0;
                            } else if (class153.field2534 == 0) {
                                if (class153.field2532.field2049[0] == -1) {
                                    class153.field2534 = 1;
                                    class153.field2532.field2045 = 0;
                                } else {
                                    Statics.field2407 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1276.field2049.length - Statics.field2407.field2554;
                            int var23 = 512 - class153.field2534;
                            if (var23 > var22 - Statics.field1276.field2045) {
                                var23 = var22 - Statics.field1276.field2045;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2526.method1388(Statics.field1276.field2049, Statics.field1276.field2045, var23);
                            if (class153.field2537 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1276.field2049[Statics.field1276.field2045 + var24] ^= class153.field2537;
                                }
                            }
                            Statics.field1276.field2045 += var23;
                            class153.field2534 += var23;
                            if (Statics.field1276.field2045 == var22) {
                                if (Statics.field2407.field2817 == 16711935L) {
                                    Statics.field1821 = Statics.field1276;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class154 var26 = class153.field2536[var25];
                                        if (var26 != null) {
                                            Statics.field1821.field2045 = var25 * 8 + 5;
                                            int var27 = Statics.field1821.method2457();
                                            int var28 = Statics.field1821.method2457();
                                            var26.method3063(var27, var28);
                                        }
                                    }
                                } else {
                                    class153.field2535.reset();
                                    class153.field2535.update(Statics.field1276.field2049, 0, var22);
                                    int var29 = (int) class153.field2535.getValue();
                                    if (Statics.field2407.field2553 != var29) {
                                        try {
                                            Statics.field2526.method1363();
                                        } catch (Exception var35) {
                                        }
                                        class153.field2538++;
                                        Statics.field2526 = null;
                                        class153.field2537 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class153.field2538 = 0;
                                    class153.field2531 = 0;
                                    Statics.field2407.field2556.method3064((int) (Statics.field2407.field2817 & 0xFFFFL), Statics.field1276.field2049, (Statics.field2407.field2817 & 0xFF0000L) == 16711680L, Statics.field2520);
                                }
                                Statics.field2407.method3328();
                                if (Statics.field2520) {
                                    class153.field2539--;
                                } else {
                                    class153.field2527--;
                                }
                                class153.field2534 = 0;
                                Statics.field2407 = null;
                                Statics.field1276 = null;
                            } else {
                                if (class153.field2534 != 512) {
                                    break;
                                }
                                class153.field2534 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2526.method1363();
                } catch (Exception var34) {
                }
                class153.field2531++;
                Statics.field2526 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method284();
        }
    }

    @ObfuscatedName("client.s(B)V")
    public void method284() {
        if (class153.field2538 >= 4) {
            this.method1419("js5crc");
            field641 = 1000;
            return;
        }
        if (class153.field2531 >= 4) {
            if (field641 <= 5) {
                this.method1419("js5io");
                field641 = 1000;
                return;
            }
            field545 = 3000;
            class153.field2531 = 3;
        }
        if (--field545 + 1 > 0) {
            return;
        }
        try {
            if (field509 == 0) {
                Statics.field1374 = Statics.field293.method1488(Statics.field1186, Statics.field1440);
                field509++;
            }
            if (field509 == 1) {
                if (Statics.field1374.field1409 == 2) {
                    this.method285(-1);
                    return;
                }
                if (Statics.field1374.field1409 == 1) {
                    field509++;
                }
            }
            if (field509 == 2) {
                Statics.field1234 = new class70((Socket) Statics.field1374.field1411, Statics.field293);
                class127 var1 = new class127(5);
                var1.method2438(15);
                var1.method2441(31);
                Statics.field1234.method1366(var1.field2049, 0, 5);
                field509++;
                Statics.field290 = class121.method145();
            }
            if (field509 == 3) {
                if (field641 <= 5 || Statics.field1234.method1365() > 0) {
                    int var2 = Statics.field1234.method1364();
                    if (var2 != 0) {
                        this.method285(var2);
                        return;
                    }
                    field509++;
                } else if (class121.method145() - Statics.field290 > 30000L) {
                    this.method285(-2);
                    return;
                }
            }
            if (field509 == 4) {
                class153.method814(Statics.field1234, field641 > 20);
                Statics.field1374 = null;
                Statics.field1234 = null;
                field509 = 0;
                field617 = 0;
            }
        } catch (IOException var4) {
            this.method285(-3);
        }
    }

    @ObfuscatedName("client.m(IB)V")
    public void method285(int arg0) {
        Statics.field1374 = null;
        Statics.field1234 = null;
        field509 = 0;
        if (Statics.field260 == Statics.field1440) {
            Statics.field1440 = Statics.field516;
        } else {
            Statics.field1440 = Statics.field260;
        }
        field617++;
        if (field617 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field641 <= 5) {
                this.method1419("js5connect_full");
                field641 = 1000;
            } else {
                field545 = 3000;
            }
        } else if (field617 >= 2 && arg0 == 6) {
            this.method1419("js5connect_outofdate");
            field641 = 1000;
        } else if (field617 >= 4) {
            if (field641 <= 5) {
                this.method1419("js5connect");
                field641 = 1000;
            } else {
                field545 = 3000;
            }
        }
    }

    @ObfuscatedName("df.u(I)V")
    public static void method2197() {
        if (field508 == 0) {
            Statics.field419 = new class95(4, 104, 104, class9.field115);
            for (int var0 = 0; var0 < 4; var0++) {
                field572[var0] = new class164(104, 104);
            }
            Statics.field259 = new class86(512, 512);
            class21.field334 = class134.field2101;
            class21.field338 = 5;
            field508 = 20;
        } else if (field508 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1787[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1906(var1, 500, 800, 512, 334);
            class21.field334 = class134.field2162;
            class21.field338 = 10;
            field508 = 30;
        } else if (field508 == 30) {
            Statics.field2432 = method1265(0, false, true, true);
            Statics.field108 = method1265(1, false, true, true);
            Statics.field194 = method1265(2, true, false, true);
            Statics.field1443 = method1265(3, false, true, true);
            Statics.field103 = method1265(4, false, true, true);
            Statics.field2450 = method1265(5, true, true, true);
            Statics.field1034 = method1265(6, true, true, false);
            Statics.field58 = method1265(7, false, true, true);
            Statics.field254 = method1265(8, false, true, true);
            Statics.field181 = method1265(9, false, true, true);
            Statics.field223 = method1265(10, false, true, true);
            Statics.field195 = method1265(11, false, true, true);
            Statics.field2005 = method1265(12, false, true, true);
            Statics.field279 = method1265(13, true, false, true);
            Statics.field1352 = method1265(14, false, true, false);
            Statics.field140 = method1265(15, false, true, true);
            class21.field334 = class134.field2103;
            class21.field338 = 20;
            field508 = 40;
        } else if (field508 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2432.method3062() * 4 / 100;
            int var8 = var7 + Statics.field108.method3062() * 4 / 100;
            int var9 = var8 + Statics.field194.method3062() * 2 / 100;
            int var10 = var9 + Statics.field1443.method3062() * 2 / 100;
            int var11 = var10 + Statics.field103.method3062() * 6 / 100;
            int var12 = var11 + Statics.field2450.method3062() * 4 / 100;
            int var13 = var12 + Statics.field1034.method3062() * 2 / 100;
            int var14 = var13 + Statics.field58.method3062() * 60 / 100;
            int var15 = var14 + Statics.field254.method3062() * 2 / 100;
            int var16 = var15 + Statics.field181.method3062() * 2 / 100;
            int var17 = var16 + Statics.field223.method3062() * 2 / 100;
            int var18 = var17 + Statics.field195.method3062() * 2 / 100;
            int var19 = var18 + Statics.field2005.method3062() * 2 / 100;
            int var20 = var19 + Statics.field279.method3062() * 2 / 100;
            int var21 = var20 + Statics.field1352.method3062() * 2 / 100;
            int var22 = var21 + Statics.field140.method3062() * 2 / 100;
            if (var22 == 100) {
                class21.field334 = class134.field2226;
                class21.field338 = 30;
                field508 = 45;
            } else {
                if (var22 != 0) {
                    class21.field334 = class134.field2104 + var22 + "%";
                }
                class21.field338 = 30;
            }
        } else if (field508 == 45) {
            boolean var23 = !field733;
            Statics.field1100 = 22050;
            Statics.field1099 = var23;
            Statics.field1826 = 2;
            class141 var24 = new class141();
            var24.method2740(9, 128);
            Statics.field724 = class52.method554(Statics.field293, Statics.field132, 0, 22050);
            Statics.field724.method1145(var24);
            class154 var25 = Statics.field140;
            class154 var26 = Statics.field1352;
            class154 var27 = Statics.field103;
            Statics.field2341 = var25;
            Statics.field2339 = var26;
            Statics.field2340 = var27;
            Statics.field2342 = var24;
            Statics.field755 = class52.method554(Statics.field293, Statics.field132, 1, 2048);
            Statics.field292 = new class46();
            Statics.field755.method1145(Statics.field292);
            Statics.field1393 = new class62(22050, Statics.field1100);
            class21.field334 = class134.field2106;
            class21.field338 = 35;
            field508 = 50;
        } else if (field508 == 50) {
            int var28 = 0;
            if (Statics.field763 == null) {
                Statics.field763 = class84.method124(Statics.field254, Statics.field279, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field1512 == null) {
                Statics.field1512 = class84.method124(Statics.field254, Statics.field279, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field1037 == null) {
                Statics.field1037 = class84.method124(Statics.field254, Statics.field279, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class21.field334 = class134.field2302 + var28 * 100 / 3 + "%";
                class21.field338 = 40;
            } else {
                Statics.field1275 = new class151(true);
                class21.field334 = class134.field2117;
                class21.field338 = 40;
                field508 = 60;
            }
        } else if (field508 == 60) {
            class154 var29 = Statics.field223;
            class154 var30 = Statics.field254;
            int var31 = 0;
            if (var29.method2988("title.jpg", "")) {
                var31++;
            }
            if (var30.method2988("logo", "")) {
                var31++;
            }
            if (var30.method2988("titlebox", "")) {
                var31++;
            }
            if (var30.method2988("titlebutton", "")) {
                var31++;
            }
            if (var30.method2988("runes", "")) {
                var31++;
            }
            if (var30.method2988("title_mute", "")) {
                var31++;
            }
            var30.method2988("sl_back", "");
            var30.method2988("sl_flags", "");
            var30.method2988("sl_arrows", "");
            var30.method2988("sl_stars", "");
            var30.method2988("sl_button", "");
            byte var34 = 6;
            if (var31 < var34) {
                class21.field334 = class134.field2231 + var31 * 100 / var34 + "%";
                class21.field338 = 50;
            } else {
                class21.field334 = class134.field2248;
                class21.field338 = 50;
                method241(5);
                field508 = 70;
            }
        } else if (field508 == 70) {
            if (Statics.field194.method2974()) {
                class37.method42(Statics.field194);
                class33.method878(Statics.field194);
                class36.method231(Statics.field194, Statics.field58);
                class32.method2213(Statics.field194, Statics.field58, field733);
                class31.method1655(Statics.field194, Statics.field58);
                class154 var36 = Statics.field194;
                class154 var37 = Statics.field58;
                boolean var38 = field654;
                class183 var39 = Statics.field763;
                Statics.field1013 = var36;
                Statics.field982 = var37;
                Statics.field1011 = var38;
                Statics.field1013.method2980(10);
                Statics.field189 = var39;
                class34.method107(Statics.field194, Statics.field2432, Statics.field108);
                class35.method553(Statics.field194, Statics.field58);
                class38.method1860(Statics.field194);
                class42.method225(Statics.field194);
                class154 var40 = Statics.field1443;
                class154 var41 = Statics.field58;
                class154 var42 = Statics.field254;
                class154 var43 = Statics.field279;
                Statics.field2664 = var40;
                Statics.field2819 = var41;
                Statics.field2571 = var42;
                Statics.field1432 = var43;
                Statics.field2570 = new class158[Statics.field2664.method3030()][];
                Statics.field2569 = new boolean[Statics.field2664.method3030()];
                class41.method169(Statics.field194);
                class39.method2662(Statics.field194);
                class21.field334 = class134.field2112;
                class21.field338 = 60;
                field508 = 80;
            } else {
                class21.field334 = class134.field2111 + Statics.field194.method3065() + "%";
                class21.field338 = 60;
            }
        } else if (field508 == 80) {
            int var44 = 0;
            if (Statics.field1329 == null) {
                Statics.field1329 = class84.method14(Statics.field254, "compass", "");
            } else {
                var44++;
            }
            if (Statics.field376 == null) {
                Statics.field376 = class84.method14(Statics.field254, "mapedge", "");
            } else {
                var44++;
            }
            if (Statics.field1230 == null) {
                Statics.field1230 = class84.method53(Statics.field254, "mapscene", "");
            } else {
                var44++;
            }
            if (Statics.field2324 == null) {
                Statics.field2324 = class84.method1359(Statics.field254, "mapfunction", "");
            } else {
                var44++;
            }
            if (Statics.field261 == null) {
                Statics.field261 = class84.method1359(Statics.field254, "hitmarks", "");
            } else {
                var44++;
            }
            if (Statics.field2712 == null) {
                Statics.field2712 = class84.method1359(Statics.field254, "headicons_pk", "");
            } else {
                var44++;
            }
            if (Statics.field252 == null) {
                Statics.field252 = class84.method1359(Statics.field254, "headicons_prayer", "");
            } else {
                var44++;
            }
            if (Statics.field95 == null) {
                Statics.field95 = class84.method1359(Statics.field254, "headicons_hint", "");
            } else {
                var44++;
            }
            if (Statics.field1666 == null) {
                Statics.field1666 = class84.method1359(Statics.field254, "mapmarker", "");
            } else {
                var44++;
            }
            if (Statics.field496 == null) {
                Statics.field496 = class84.method1359(Statics.field254, "cross", "");
            } else {
                var44++;
            }
            if (Statics.field400 == null) {
                Statics.field400 = class84.method1359(Statics.field254, "mapdots", "");
            } else {
                var44++;
            }
            if (Statics.field247 == null) {
                Statics.field247 = class84.method53(Statics.field254, "scrollbar", "");
            } else {
                var44++;
            }
            if (Statics.field1339 == null) {
                Statics.field1339 = class84.method53(Statics.field254, "mod_icons", "");
            } else {
                var44++;
            }
            if (Statics.field1835 == null) {
                Statics.field1835 = class84.method1474(Statics.field254, "mapback", "");
            } else {
                var44++;
            }
            if (var44 < 14) {
                class21.field334 = class134.field2113 + var44 * 100 / 14 + "%";
                class21.field338 = 70;
            } else {
                Statics.field2843 = Statics.field1339;
                Statics.field376.method1674();
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 41.0D) - 20;
                for (int var49 = 0; var49 < Statics.field2324.length; var49++) {
                    Statics.field2324[var49].method1673(var45 + var48, var46 + var48, var47 + var48);
                }
                Statics.field1230[0].method1771(var45 + var48, var46 + var48, var47 + var48);
                method125();
                class21.field334 = class134.field2114;
                class21.field338 = 70;
                field508 = 90;
            }
        } else if (field508 == 90) {
            if (Statics.field181.method2974()) {
                class110 var50 = new class110(Statics.field181, Statics.field254, 20, 0.8D, field733 ? 64 : 128);
                class104.method2161(var50);
                class104.method2137(0.8D);
                class21.field334 = class134.field2094;
                class21.field338 = 90;
                field508 = 110;
            } else {
                class21.field334 = class134.field2115 + Statics.field181.method3065() + "%";
                class21.field338 = 90;
            }
        } else if (field508 == 110) {
            Statics.field1626 = new class16();
            Statics.field293.method1475(Statics.field1626, 10);
            class21.field334 = class134.field2158;
            class21.field338 = 94;
            field508 = 120;
        } else if (field508 == 120) {
            if (Statics.field223.method2988("huffman", "")) {
                class120 var51 = new class120(Statics.field223.method3029("huffman", ""));
                class184.method152(var51);
                class21.field334 = class134.field2171;
                class21.field338 = 96;
                field508 = 130;
            } else {
                class21.field334 = class134.field2118 + "%";
                class21.field338 = 96;
            }
        } else if (field508 == 130) {
            if (!Statics.field1443.method2974()) {
                class21.field334 = class134.field2120 + Statics.field1443.method3065() * 4 / 5 + "%";
                class21.field338 = 100;
            } else if (!Statics.field2005.method2974()) {
                class21.field334 = class134.field2120 + (80 + Statics.field2005.method3065() / 6) + "%";
                class21.field338 = 100;
            } else if (Statics.field279.method2974()) {
                class21.field334 = class134.field2121;
                class21.field338 = 100;
                field508 = 140;
            } else {
                class21.field334 = class134.field2120 + (96 + Statics.field279.method3065() / 20) + "%";
                class21.field338 = 100;
            }
        } else if (field508 == 140) {
            method241(10);
        }
    }

    @ObfuscatedName("br.g(IZZZI)Lez;")
    public static class154 method1265(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1428 != null) {
            var4 = new class71(arg0, class82.field1428, Statics.field184[arg0], 1000000);
        }
        return new class154(var4, Statics.field90, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("l.o(I)V")
    public static void method125() {
        Statics.field2461 = new int[33];
        Statics.field562 = new int[33];
        Statics.field1932 = new int[151];
        Statics.field1045 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field1835.field1479[Statics.field1835.field1476 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field2461[var0] = var1;
            Statics.field562[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field1835.field1479[Statics.field1835.field1476 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1932[var4 - 5] = var5 - 25;
            Statics.field1045[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("o.v(I)V")
    public static final void method167() {
        try {
            if (field575 == 0) {
                if (Statics.field307 != null) {
                    Statics.field307.method1363();
                    Statics.field307 = null;
                }
                Statics.field2088 = null;
                field531 = false;
                field513 = 0;
                field575 = 1;
            }
            if (field575 == 1) {
                if (Statics.field2088 == null) {
                    Statics.field2088 = Statics.field293.method1488(Statics.field1186, Statics.field1440);
                }
                if (Statics.field2088.field1409 == 2) {
                    throw new IOException();
                }
                if (Statics.field2088.field1409 == 1) {
                    Statics.field307 = new class70((Socket) Statics.field2088.field1411, Statics.field293);
                    Statics.field2088 = null;
                    field575 = 2;
                }
            }
            if (field575 == 2) {
                field520.field2045 = 0;
                field520.method2438(14);
                Statics.field307.method1366(field520.field2049, 0, 1);
                field522.field2045 = 0;
                field575 = 3;
            }
            if (field575 == 3) {
                if (Statics.field724 != null) {
                    Statics.field724.method1147();
                }
                if (Statics.field755 != null) {
                    Statics.field755.method1147();
                }
                int var0 = Statics.field307.method1364();
                if (Statics.field724 != null) {
                    Statics.field724.method1147();
                }
                if (Statics.field755 != null) {
                    Statics.field755.method1147();
                }
                if (var0 != 0) {
                    method172(var0);
                    return;
                }
                field522.field2045 = 0;
                field575 = 5;
            }
            if (field575 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field520.field2045 = 0;
                field520.method2438(10);
                field520.method2441(var1[0]);
                field520.method2441(var1[1]);
                field520.method2441(var1[2]);
                field520.method2441(var1[3]);
                field520.method2442(0L);
                field520.method2443(class21.field340);
                field520.method2519(class6.field77, class6.field73);
                field521.field2045 = 0;
                if (field641 == 40) {
                    field521.method2438(18);
                } else {
                    field521.method2438(16);
                }
                field521.method2585(0);
                int var2 = field521.field2045;
                field521.method2441(31);
                field521.method2609(field520.field2049, 0, field520.field2045);
                int var3 = field521.field2045;
                field521.method2443(class21.field339);
                field521.method2438(field733 ? 1 : 0);
                class116 var4 = field521;
                byte[] var5 = new byte[24];
                try {
                    class82.field1422.method578(0L);
                    class82.field1422.method584(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var37) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2609(var5, 0, 24);
                class127 var9 = new class127(Statics.field1275.method2948());
                Statics.field1275.method2947(var9);
                field521.method2609(var9.field2049, 0, var9.field2049.length);
                field521.method2441(Statics.field2432.field2505);
                field521.method2441(Statics.field108.field2505);
                field521.method2441(Statics.field194.field2505);
                field521.method2441(Statics.field1443.field2505);
                field521.method2441(Statics.field103.field2505);
                field521.method2441(Statics.field2450.field2505);
                field521.method2441(Statics.field1034.field2505);
                field521.method2441(Statics.field58.field2505);
                field521.method2441(Statics.field254.field2505);
                field521.method2441(Statics.field181.field2505);
                field521.method2441(Statics.field223.field2505);
                field521.method2441(Statics.field195.field2505);
                field521.method2441(Statics.field2005.field2505);
                field521.method2441(Statics.field279.field2505);
                field521.method2441(Statics.field1352.field2505);
                field521.method2441(Statics.field140.field2505);
                field521.method2584(var1, var3, field521.field2045);
                field521.method2448(field521.field2045 - var2);
                Statics.field307.method1366(field521.field2049, 0, field521.field2045);
                field520.method2324(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field522.method2324(var1);
                field575 = 6;
            }
            if (field575 == 6 && Statics.field307.method1365() > 0) {
                int var11 = Statics.field307.method1364();
                if (var11 == 21 && field641 == 20) {
                    field575 = 7;
                } else if (var11 == 2) {
                    field575 = 9;
                } else if (var11 == 15 && field641 == 40) {
                    field520.field2045 = 0;
                    field522.field2045 = 0;
                    field524 = -1;
                    field528 = -1;
                    field729 = -1;
                    field489 = -1;
                    field612 = 0;
                    field566 = 0;
                    field586 = 0;
                    field627 = 0;
                    field580 = false;
                    field718 = 0;
                    field716 = 0;
                    for (int var12 = 0; var12 < field604.length; var12++) {
                        if (field604[var12] != null) {
                            field604[var12].field445 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field632.length; var13++) {
                        if (field632[var13] != null) {
                            field632[var13].field445 = -1;
                        }
                    }
                    class19.field291 = new class175(32);
                    method241(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field687[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field514 < 1) {
                    field514++;
                    field575 = 0;
                } else {
                    method172(var11);
                    return;
                }
            }
            if (field575 == 7 && Statics.field307.method1365() > 0) {
                field515 = (Statics.field307.method1364() + 3) * 60;
                field575 = 8;
            }
            if (field575 == 8) {
                field513 = 0;
                class21.method601(class134.field2122, class134.field2119, field515 / 60 + class134.field2124);
                if (--field515 <= 0) {
                    field575 = 0;
                }
            } else {
                if (field575 == 9 && Statics.field307.method1365() >= 8) {
                    field564 = Statics.field307.method1364();
                    field567 = Statics.field307.method1364() == 1;
                    field618 = Statics.field307.method1364();
                    field618 <<= 0x8;
                    field618 += Statics.field307.method1364();
                    field611 = Statics.field307.method1364();
                    Statics.field307.method1388(field522.field2049, 0, 1);
                    field522.field2045 = 0;
                    field524 = field522.method2326();
                    Statics.field307.method1388(field522.field2049, 0, 2);
                    field522.field2045 = 0;
                    field612 = field522.method2615();
                    if (field611 == 1) {
                        try {
                            client var15 = Statics.field481;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var36) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field481;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var35) {
                        }
                    }
                    field575 = 10;
                }
                if (field575 != 10) {
                    field513++;
                    if (field513 > 2000) {
                        if (field514 < 1) {
                            if (Statics.field260 == Statics.field1440) {
                                Statics.field1440 = Statics.field516;
                            } else {
                                Statics.field1440 = Statics.field260;
                            }
                            field514++;
                            field575 = 0;
                        } else {
                            method172(-3);
                        }
                    }
                } else if (Statics.field307.method1365() >= field612) {
                    field522.field2045 = 0;
                    Statics.field307.method1388(field522.field2049, 0, field612);
                    field546 = 1L;
                    field495 = -1;
                    Statics.field1626.field256 = 0;
                    Statics.field390 = true;
                    field614 = true;
                    field708 = -1L;
                    class182.method132();
                    field520.field2045 = 0;
                    field522.field2045 = 0;
                    field524 = -1;
                    field528 = -1;
                    field729 = -1;
                    field489 = -1;
                    field566 = 0;
                    field586 = 0;
                    field527 = 0;
                    field499 = 0;
                    field627 = 0;
                    field580 = false;
                    class77.field1386 = 0;
                    for (int var19 = 0; var19 < 100; var19++) {
                        field698[var19] = null;
                    }
                    field581 = 0;
                    field638 = 0;
                    field610 = false;
                    field548 = 0;
                    field735 = (int) (Math.random() * 100.0D) - 50;
                    field550 = (int) (Math.random() * 110.0D) - 55;
                    field552 = (int) (Math.random() * 80.0D) - 40;
                    field555 = (int) (Math.random() * 120.0D) - 60;
                    field557 = (int) (Math.random() * 30.0D) - 20;
                    field570 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field718 = 0;
                    field711 = -1;
                    field716 = 0;
                    field717 = 0;
                    field605 = 0;
                    field726 = 0;
                    for (int var20 = 0; var20 < 2048; var20++) {
                        field604[var20] = null;
                        field609[var20] = null;
                    }
                    for (int var21 = 0; var21 < 32768; var21++) {
                        field632[var21] = null;
                    }
                    Statics.field139 = field604[2047] = new class3();
                    field620.method3288();
                    field621.method3288();
                    for (int var22 = 0; var22 < 4; var22++) {
                        for (int var23 = 0; var23 < 104; var23++) {
                            for (int var24 = 0; var24 < 104; var24++) {
                                field519[var22][var23][var24] = null;
                            }
                        }
                    }
                    field619 = new class177();
                    field738 = 0;
                    field737 = 0;
                    field535 = 0;
                    for (int var25 = 0; var25 < Statics.field1040; var25++) {
                        class42 var26 = class42.method2661(var25);
                        if (var26 != null && var26.field1042 == 0) {
                            class159.field2695[var25] = 0;
                            class159.field2697[var25] = 0;
                        }
                    }
                    for (int var27 = 0; var27 < field678.length; var27++) {
                        field678[var27] = -1;
                    }
                    if (field644 != -1) {
                        int var28 = field644;
                        if (var28 != -1 && Statics.field2569[var28]) {
                            Statics.field2664.method2982(var28);
                            if (Statics.field2570[var28] != null) {
                                boolean var29 = true;
                                for (int var30 = 0; var30 < Statics.field2570[var28].length; var30++) {
                                    if (Statics.field2570[var28][var30] != null) {
                                        if (Statics.field2570[var28][var30].field2665 == 2) {
                                            var29 = false;
                                        } else {
                                            Statics.field2570[var28][var30] = null;
                                        }
                                    }
                                }
                                if (var29) {
                                    Statics.field2570[var28] = null;
                                }
                                Statics.field2569[var28] = false;
                            }
                        }
                    }
                    for (class4 var31 = (class4) field645.method3276(); var31 != null; var31 = (class4) field645.method3277()) {
                        method61(var31, true);
                    }
                    field644 = -1;
                    field645 = new class175(8);
                    field648 = null;
                    field580 = false;
                    field627 = 0;
                    field664.method3185((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var32 = 0; var32 < 8; var32++) {
                        field615[var32] = null;
                        field616[var32] = false;
                    }
                    class19.field291 = new class175(32);
                    field490 = true;
                    for (int var33 = 0; var33 < 100; var33++) {
                        field687[var33] = true;
                    }
                    field661 = null;
                    Statics.field1189 = 0;
                    Statics.field1027 = null;
                    Statics.field747 = -1;
                    method227(false);
                    field524 = -1;
                }
            }
        } catch (IOException var38) {
            if (field514 < 1) {
                if (Statics.field260 == Statics.field1440) {
                    Statics.field1440 = Statics.field516;
                } else {
                    Statics.field1440 = Statics.field260;
                }
                field514++;
                field575 = 0;
            } else {
                method172(-2);
            }
        }
    }

    @ObfuscatedName("o.j(II)V")
    public static void method172(int arg0) {
        if (arg0 == -3) {
            class21.method601(class134.field2125, class134.field2126, class134.field2314);
        } else if (arg0 == -2) {
            class21.method601(class134.field2128, class134.field2129, class134.field2281);
        } else if (arg0 == -1) {
            class21.method601(class134.field2131, class134.field2228, class134.field2133);
        } else if (arg0 == 3) {
            class21.method601(class134.field2134, class134.field2163, class134.field2136);
        } else if (arg0 == 4) {
            class21.method601(class134.field2235, class134.field2138, class134.field2139);
        } else if (arg0 == 5) {
            class21.method601(class134.field2105, class134.field2185, class134.field2142);
        } else if (arg0 == 6) {
            class21.method601(class134.field2143, class134.field2144, class134.field2252);
        } else if (arg0 == 7) {
            class21.method601(class134.field2146, class134.field2147, class134.field2148);
        } else if (arg0 == 8) {
            class21.method601(class134.field2187, class134.field2150, class134.field2151);
        } else if (arg0 == 9) {
            class21.method601(class134.field2152, class134.field2286, class134.field2154);
        } else if (arg0 == 10) {
            class21.method601(class134.field2212, class134.field2278, class134.field2157);
        } else if (arg0 == 11) {
            class21.method601(class134.field2282, class134.field2159, class134.field2289);
        } else if (arg0 == 12) {
            class21.method601(class134.field2244, class134.field2284, class134.field2263);
        } else if (arg0 == 13) {
            class21.method601(class134.field2164, class134.field2165, class134.field2166);
        } else if (arg0 == 14) {
            class21.method601(class134.field2167, class134.field2168, class134.field2169);
        } else if (arg0 == 16) {
            class21.method601(class134.field2140, class134.field2272, class134.field2172);
        } else if (arg0 == 17) {
            class21.method601(class134.field2173, class134.field2100, class134.field2175);
        } else if (arg0 == 18) {
            class21.method601(class134.field2176, class134.field2177, class134.field2178);
        } else if (arg0 == 19) {
            class21.method601(class134.field2179, class134.field2298, class134.field2181);
        } else if (arg0 == 20) {
            class21.method601(class134.field2182, class134.field2183, class134.field2184);
        } else if (arg0 == 22) {
            class21.method601(class134.field2153, class134.field2270, class134.field2091);
        } else if (arg0 == 23) {
            class21.method601(class134.field2188, class134.field2189, class134.field2110);
        } else if (arg0 == 24) {
            class21.method601(class134.field2191, class134.field2285, class134.field2193);
        } else if (arg0 == 25) {
            class21.method601(class134.field2194, class134.field2180, class134.field2222);
        } else if (arg0 == 26) {
            class21.method601(class134.field2197, class134.field2198, class134.field2288);
        } else if (arg0 == 27) {
            class21.method601(class134.field2200, class134.field2161, class134.field2196);
        } else if (arg0 == 31) {
            class21.method601(class134.field2209, class134.field2210, class134.field2211);
        } else if (arg0 == 32) {
            class21.method601(class134.field2256, class134.field2213, class134.field2214);
        } else if (arg0 == 37) {
            class21.method601(class134.field2095, class134.field2293, class134.field2243);
        } else if (arg0 == 38) {
            class21.method601(class134.field2274, class134.field2219, class134.field2215);
        } else if (arg0 == 55) {
            class21.method601(class134.field2221, class134.field2186, class134.field2223);
        } else {
            class21.method601(class134.field2141, class134.field2225, class134.field2132);
        }
        method241(10);
    }

    @ObfuscatedName("be.n(I)V")
    public static final void method1531() {
        if (Statics.field307 != null) {
            Statics.field307.method1363();
            Statics.field307 = null;
        }
        method253();
        Statics.field419.method1968();
        for (int var0 = 0; var0 < 4; var0++) {
            field572[var0].method3196();
        }
        System.gc();
        class138.method249(2);
        field720 = -1;
        field563 = false;
        for (class7 var1 = (class7) class7.field91.method3294(); var1 != null; var1 = (class7) class7.field91.method3296()) {
            if (var1.field87 != null) {
                Statics.field292.method1103(var1.field87);
                var1.field87 = null;
            }
            if (var1.field92 != null) {
                Statics.field292.method1103(var1.field92);
                var1.field92 = null;
            }
        }
        class7.field91.method3288();
        method241(10);
    }

    @ObfuscatedName("x.q(I)V")
    public static final void method253() {
        class37.method3141();
        class33.method2236();
        class36.method3084();
        class32.field823.method3243();
        class32.field824.method3243();
        class32.field825.method3243();
        class32.field843.method3243();
        class31.field786.method3243();
        class31.field807.method3243();
        class40.field984.method3243();
        class40.field1025.method3243();
        class40.field1022.method3243();
        class34.method1499();
        class35.field924.method3243();
        class35.field909.method3243();
        class38.field959.method3243();
        class42.method695();
        class163.field2716.method3243();
        class158.field2691.method3243();
        class158.field2573.method3243();
        class158.field2584.method3243();
        ((class110) Statics.field1780).method2228();
        class5.field69.method3243();
        Statics.field2432.method2983();
        Statics.field108.method2983();
        Statics.field1443.method2983();
        Statics.field103.method2983();
        Statics.field2450.method2983();
        Statics.field1034.method2983();
        Statics.field58.method2983();
        Statics.field254.method2983();
        Statics.field181.method2983();
        Statics.field223.method2983();
        Statics.field195.method2983();
        Statics.field2005.method2983();
    }

    @ObfuscatedName("bz.c(I)V")
    public static final void method1357() {
        if (field527 > 0) {
            method1531();
        } else {
            method241(40);
            Statics.field979 = Statics.field307;
            Statics.field307 = null;
        }
    }

    @ObfuscatedName("fn.h(I)V")
    public static final void method3230() {
        if (field586 > 1) {
            field586--;
        }
        if (field527 > 0) {
            field527--;
        }
        if (field531) {
            field531 = false;
            method1357();
            return;
        }
        for (int var0 = 0; var0 < 100 && method1579(); var0++) {
        }
        if (field641 != 30) {
            return;
        }
        class182.method1332(field520, 87);
        Object var1 = Statics.field1626.field255;
        synchronized (Statics.field1626.field255) {
            if (!field482) {
                Statics.field1626.field256 = 0;
            } else if (class77.field1390 != 0 || Statics.field1626.field256 >= 40) {
                field520.method2325(220);
                field520.method2438(0);
                int var2 = field520.field2045;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field1626.field256 && field520.field2045 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field1626.field258[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field1626.field257[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field1626.field258[var4] == -1 && Statics.field1626.field257[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field493 != var6 || field494 != var5) {
                        int var8 = var6 - field493;
                        field493 = var6;
                        int var9 = var5 - field494;
                        field494 = var5;
                        if (field495 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field520.method2585((field495 << 12) + (var8 << 6) + var9);
                            field495 = 0;
                        } else if (field495 < 8) {
                            field520.method2527((field495 << 19) + 8388608 + var7);
                            field495 = 0;
                        } else {
                            field520.method2441((field495 << 19) + -1073741824 + var7);
                            field495 = 0;
                        }
                    } else if (field495 < 2047) {
                        field495++;
                    }
                }
                field520.method2449(field520.field2045 - var2);
                if (var3 >= Statics.field1626.field256) {
                    Statics.field1626.field256 = 0;
                } else {
                    Statics.field1626.field256 -= var3;
                    for (int var10 = 0; var10 < Statics.field1626.field256; var10++) {
                        Statics.field1626.field257[var10] = Statics.field1626.field257[var3 + var10];
                        Statics.field1626.field258[var10] = Statics.field1626.field258[var3 + var10];
                    }
                }
            }
        }
        if (class77.field1390 != 0) {
            long var12 = (class77.field1400 - field546 * -1L) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field546 = class77.field1400 * -1L;
            int var14 = class77.field1385;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class77.field1398;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class77.field1390 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field520.method2325(205);
            field520.method2441((var17 << 19) + (var18 << 20) + var16);
        }
        if (class75.field1365 > 0) {
            field520.method2325(111);
            field520.method2585(0);
            int var19 = field520.field2045;
            long var20 = class121.method145();
            for (int var22 = 0; var22 < class75.field1365; var22++) {
                long var23 = var20 - field708;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field708 = var20;
                field520.method2482((int) var23);
                field520.method2474(class75.field1349[var22]);
            }
            field520.method2448(field520.field2045 - var19);
        }
        if (field574 > 0) {
            field574--;
        }
        if (class75.field1358[96] || class75.field1358[97] || class75.field1358[98] || class75.field1358[99]) {
            field600 = true;
        }
        if (field600 && field574 <= 0) {
            field574 = 20;
            field600 = false;
            field520.method2325(97);
            field520.method2585(field517);
            field520.method2480(field570);
        }
        if (Statics.field390 && !field614) {
            field614 = true;
            field520.method2325(116);
            field520.method2438(1);
        }
        if (!Statics.field390 && field614) {
            field614 = false;
            field520.method2325(116);
            field520.method2438(0);
        }
        if (field733 && Statics.field379 != field532) {
            method43(Statics.field747, Statics.field740, Statics.field379, Statics.field139.field443[0], Statics.field139.field449[0]);
        } else if (Statics.field379 != field711) {
            field711 = Statics.field379;
            int var25 = Statics.field379;
            int[] var26 = Statics.field259.field1471;
            int var27 = var26.length;
            for (int var28 = 0; var28 < var27; var28++) {
                var26[var28] = 0;
            }
            for (int var29 = 1; var29 < 103; var29++) {
                int var30 = (103 - var29) * 2048 + 24628;
                for (int var31 = 1; var31 < 103; var31++) {
                    if ((class9.field122[var25][var31][var29] & 0x18) == 0) {
                        Statics.field419.method1905(var26, var30, 512, var25, var31, var29);
                    }
                    if (var25 < 3 && (class9.field122[var25 + 1][var31][var29] & 0x8) != 0) {
                        Statics.field419.method1905(var26, var30, 512, var25 + 1, var31, var29);
                    }
                    var30 += 4;
                }
            }
            int var32 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var33 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field259.method1707();
            for (int var34 = 1; var34 < 103; var34++) {
                for (int var35 = 1; var35 < 103; var35++) {
                    if ((class9.field122[var25][var35][var34] & 0x18) == 0) {
                        method60(var25, var35, var34, var32, var33);
                    }
                    if (var25 < 3 && (class9.field122[var25 + 1][var35][var34] & 0x8) != 0) {
                        method60(var25 + 1, var35, var34, var32, var33);
                    }
                }
            }
            field712 = 0;
            for (int var36 = 0; var36 < 104; var36++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    int var38 = Statics.field419.method1900(Statics.field379, var36, var37);
                    if (var38 != 0) {
                        int var39 = var38 >> 14 & 0x7FFF;
                        int var40 = class32.method2660(var39).field849;
                        if (var40 >= 0) {
                            int var41 = var36;
                            int var42 = var37;
                            if (var40 != 22 && var40 != 29 && var40 != 34 && var40 != 36 && var40 != 46 && var40 != 47 && var40 != 48) {
                                int[][] var43 = field572[Statics.field379].field2731;
                                for (int var44 = 0; var44 < 10; var44++) {
                                    int var45 = (int) (Math.random() * 4.0D);
                                    if (var45 == 0 && var41 > 0 && var41 > var36 - 3 && (var43[var41 - 1][var42] & 0x12C0108) == 0) {
                                        var41--;
                                    }
                                    if (var45 == 1 && var41 < 103 && var41 < var36 + 3 && (var43[var41 + 1][var42] & 0x12C0180) == 0) {
                                        var41++;
                                    }
                                    if (var45 == 2 && var42 > 0 && var42 > var37 - 3 && (var43[var41][var42 - 1] & 0x12C0102) == 0) {
                                        var42--;
                                    }
                                    if (var45 == 3 && var42 < 103 && var42 < var37 + 3 && (var43[var41][var42 + 1] & 0x12C0120) == 0) {
                                        var42++;
                                    }
                                }
                            }
                            field715[field712] = Statics.field2324[var40];
                            field713[field712] = var41;
                            field714[field712] = var42;
                            field712++;
                        }
                    }
                }
            }
            Statics.field263.method1667();
        }
        if (field641 != 30) {
            return;
        }
        method1228();
        int var10002;
        for (int var46 = 0; var46 < field548; var46++) {
            var10002 = field728[var46]--;
            if (field728[var46] >= -10) {
                class57 var48 = field730[var46];
                if (var48 == null) {
                    class57 var10000 = (class57) null;
                    var48 = class57.method1251(Statics.field103, field743[var46], 0);
                    if (var48 == null) {
                        continue;
                    }
                    field728[var46] += var48.method1243();
                    field730[var46] = var48;
                }
                if (field728[var46] < 0) {
                    int var55;
                    if (field590[var46] == 0) {
                        var55 = field722;
                    } else {
                        int var49 = (field590[var46] & 0xFF) * 128;
                        int var50 = field590[var46] >> 16 & 0xFF;
                        int var51 = var50 * 128 + 64 - Statics.field139.field429;
                        if (var51 < 0) {
                            var51 = -var51;
                        }
                        int var52 = field590[var46] >> 8 & 0xFF;
                        int var53 = var52 * 128 + 64 - Statics.field139.field423;
                        if (var53 < 0) {
                            var53 = -var53;
                        }
                        int var54 = var51 + var53 - 128;
                        if (var54 > var49) {
                            field728[var46] = -100;
                            continue;
                        }
                        if (var54 < 0) {
                            var54 = 0;
                        }
                        var55 = field539 * (var49 - var54) / var49;
                    }
                    if (var55 > 0) {
                        class63 var56 = var48.method1242().method1312(Statics.field1393);
                        class45 var57 = class45.method1068(var56, 100, var55);
                        var57.method1032(field727[var46] - 1);
                        Statics.field292.method1102(var57);
                    }
                    field728[var46] = -100;
                }
            } else {
                field548--;
                for (int var47 = var46; var47 < field548; var47++) {
                    field743[var47] = field743[var47 + 1];
                    field730[var47] = field730[var47 + 1];
                    field727[var47] = field727[var47 + 1];
                    field728[var47] = field728[var47 + 1];
                    field590[var47] = field590[var47 + 1];
                }
                var46--;
            }
        }
        if (field563) {
            boolean var58;
            if (class138.field2338 == 0) {
                var58 = Statics.field2342.method2722();
            } else {
                var58 = true;
            }
            if (!var58) {
                if (field719 != 0 && field720 != -1) {
                    class138.method3160(Statics.field1034, field720, 0, field719, false);
                }
                field563 = false;
            }
        }
        field566++;
        if (field566 > 750) {
            method1357();
            return;
        }
        for (int var59 = -1; var59 < field605; var59++) {
            int var60;
            if (var59 == -1) {
                var60 = 2047;
            } else {
                var60 = field525[var59];
            }
            class3 var61 = field604[var60];
            if (var61 != null) {
                method2382(var61, 1);
            }
        }
        for (int var62 = 0; var62 < field726; var62++) {
            int var63 = field487[var62];
            class25 var64 = field632[var63];
            if (var64 != null) {
                method2382(var64, var64.field396.field785);
            }
        }
        for (int var65 = -1; var65 < field605; var65++) {
            int var66;
            if (var65 == -1) {
                var66 = 2047;
            } else {
                var66 = field525[var65];
            }
            class3 var67 = field604[var66];
            if (var67 != null && var67.field436 > 0) {
                var67.field436--;
                if (var67.field436 == 0) {
                    var67.field435 = null;
                }
            }
        }
        for (int var68 = 0; var68 < field726; var68++) {
            int var69 = field487[var68];
            class25 var70 = field632[var69];
            if (var70 != null && var70.field436 > 0) {
                var70.field436--;
                if (var70.field436 == 0) {
                    var70.field435 = null;
                }
            }
        }
        field526++;
        if (field594 != 0) {
            field593 += 20;
            if (field593 >= 400) {
                field594 = 0;
            }
        }
        if (Statics.field162 != null) {
            field534++;
            if (field534 >= 15) {
                method1610(Statics.field162);
                Statics.field162 = null;
            }
        }
        if (Statics.field888 != null) {
            method1610(Statics.field888);
            field640++;
            if (class77.field1391 > field598 + 5 || class77.field1391 < field598 - 5 || class77.field1396 > field599 + 5 || class77.field1396 < field599 - 5) {
                field601 = true;
            }
            if (class77.field1389 == 0) {
                if (field601 && field640 >= 5) {
                    if (Statics.field888 == Statics.field114 && field656 != field597) {
                        class158 var71 = Statics.field888;
                        byte var72 = 0;
                        if (field647 == 1 && var71.field2581 == 206) {
                            var72 = 1;
                        }
                        if (var71.field2638[field656] <= 0) {
                            var72 = 0;
                        }
                        int var73 = method1225(var71);
                        boolean var74 = (var73 >> 29 & 0x1) != 0;
                        if (var74) {
                            int var75 = field597;
                            int var76 = field656;
                            var71.field2638[var76] = var71.field2638[var75];
                            var71.field2592[var76] = var71.field2592[var75];
                            var71.field2638[var75] = -1;
                            var71.field2592[var75] = 0;
                        } else if (var72 == 1) {
                            int var77 = field597;
                            int var78 = field656;
                            while (var77 != var78) {
                                if (var77 > var78) {
                                    var71.method3101(var77 - 1, var77);
                                    var77--;
                                } else if (var77 < var78) {
                                    var71.method3101(var77 + 1, var77);
                                    var77++;
                                }
                            }
                        } else {
                            var71.method3101(field656, field597);
                        }
                        field520.method2325(42);
                        field520.method2489(Statics.field888.field2640);
                        field520.method2481(field597);
                        field520.method2438(var72);
                        field520.method2575(field656);
                    }
                } else if ((field556 == 1 || method2956(field627 - 1)) && field627 > 2) {
                    Statics.method10();
                } else if (field627 > 0) {
                    method2222(field627 - 1);
                }
                field534 = 10;
                class77.field1390 = 0;
                Statics.field888 = null;
            }
        }
        class158 var79 = Statics.field137;
        class158 var80 = Statics.field399;
        Statics.field137 = null;
        Statics.field399 = null;
        field659 = null;
        field704 = false;
        field660 = false;
        for (field705 = 0; class75.method507() && field705 < 128; field705++) {
            field613[field705] = Statics.field967;
            field706[field705] = Statics.field2001;
        }
        Statics.method904(field644, 0, 0, 765, 503, 0, 0);
        field682++;
        while (true) {
            class1 var81;
            class158 var82;
            class158 var83;
            do {
                var81 = (class1) field746.method3310();
                if (var81 == null) {
                    while (true) {
                        class1 var84;
                        class158 var85;
                        class158 var86;
                        do {
                            var84 = (class1) field683.method3310();
                            if (var84 == null) {
                                while (true) {
                                    class1 var87;
                                    class158 var88;
                                    class158 var89;
                                    do {
                                        var87 = (class1) field537.method3310();
                                        if (var87 == null) {
                                            if (field503 != null) {
                                                method120();
                                            }
                                            if (class95.field1586 != -1) {
                                                int var90 = class95.field1586;
                                                int var91 = class95.field1582;
                                                boolean var92 = method1409(Statics.field139.field443[0], Statics.field139.field449[0], var90, var91, true, 0, 0, 0, 0, 0, 0);
                                                class95.field1586 = -1;
                                                if (var92) {
                                                    field507 = class77.field1398;
                                                    field592 = class77.field1385;
                                                    field594 = 1;
                                                    field593 = 0;
                                                }
                                            }
                                            if (Statics.field888 == null && field503 == null) {
                                                int var93 = class77.field1390;
                                                if (field580) {
                                                    if (var93 != 1) {
                                                        int var94 = class77.field1391;
                                                        int var95 = class77.field1396;
                                                        if (var94 < Statics.field294 - 10 || var94 > Statics.field294 + Statics.field1291 + 10 || var95 < Statics.field780 - 10 || var95 > Statics.field780 + Statics.field1235 + 10) {
                                                            field580 = false;
                                                            Statics.method245(Statics.field294, Statics.field780, Statics.field1291, Statics.field1235);
                                                        }
                                                    }
                                                    if (var93 == 1) {
                                                        int var96 = Statics.field294;
                                                        int var97 = Statics.field780;
                                                        int var98 = Statics.field1291;
                                                        int var99 = class77.field1398;
                                                        int var100 = class77.field1385;
                                                        int var101 = -1;
                                                        for (int var102 = 0; var102 < field627; var102++) {
                                                            int var103 = (field627 - 1 - var102) * 15 + var97 + 31;
                                                            if (var99 > var96 && var99 < var96 + var98 && var100 > var103 - 13 && var100 < var103 + 3) {
                                                                var101 = var102;
                                                            }
                                                        }
                                                        if (var101 != -1) {
                                                            method2222(var101);
                                                        }
                                                        field580 = false;
                                                        Statics.method245(Statics.field294, Statics.field780, Statics.field1291, Statics.field1235);
                                                    }
                                                } else {
                                                    label1056: {
                                                        if (var93 == 1 && field627 > 0) {
                                                            int var104 = field630[field627 - 1];
                                                            if (var104 == 39 || var104 == 40 || var104 == 41 || var104 == 42 || var104 == 43 || var104 == 33 || var104 == 34 || var104 == 35 || var104 == 36 || var104 == 37 || var104 == 38 || var104 == 1005) {
                                                                label1061: {
                                                                    int var105 = field628[field627 - 1];
                                                                    int var106 = field629[field627 - 1];
                                                                    class158 var107 = class158.method2658(var106);
                                                                    if (!class162.method2618(method1225(var107))) {
                                                                        int var108 = method1225(var107);
                                                                        boolean var109 = (var108 >> 29 & 0x1) != 0;
                                                                        if (!var109) {
                                                                            break label1061;
                                                                        }
                                                                    }
                                                                    field601 = false;
                                                                    field640 = 0;
                                                                    if (Statics.field888 != null) {
                                                                        method1610(Statics.field888);
                                                                    }
                                                                    Statics.field888 = class158.method2658(var106);
                                                                    field597 = var105;
                                                                    field598 = class77.field1398;
                                                                    field599 = class77.field1385;
                                                                    method1610(Statics.field888);
                                                                    break label1056;
                                                                }
                                                            }
                                                        }
                                                        if (var93 == 1 && (field556 == 1 && field627 > 2 || method2956(field627 - 1))) {
                                                            var93 = 2;
                                                        }
                                                        if (var93 == 1 && field627 > 0) {
                                                            method2222(field627 - 1);
                                                        }
                                                        if (var93 == 2 && field627 > 0) {
                                                            Statics.method10();
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field137 != var79) {
                                                if (var79 != null) {
                                                    method1610(var79);
                                                }
                                                if (Statics.field137 != null) {
                                                    method1610(Statics.field137);
                                                }
                                            }
                                            if (Statics.field399 != var80 && field637 == field636) {
                                                if (var80 != null) {
                                                    method1610(var80);
                                                }
                                                if (Statics.field399 != null) {
                                                    method1610(Statics.field399);
                                                }
                                            }
                                            if (Statics.field399 == null) {
                                                if (field636 > 0) {
                                                    field636--;
                                                }
                                            } else if (field636 < field637) {
                                                field636++;
                                                if (field637 == field636) {
                                                    method1610(Statics.field399);
                                                }
                                            }
                                            method2196();
                                            if (field731) {
                                                method1525();
                                            }
                                            for (int var110 = 0; var110 < 5; var110++) {
                                                var10002 = field736[var110]++;
                                            }
                                            int var111 = class77.method29();
                                            int var112 = class75.field1368;
                                            if (var111 > 15000 && var112 > 15000) {
                                                field527 = 250;
                                                class77.field1386 = 14500;
                                                field520.method2325(224);
                                            }
                                            field554++;
                                            if (field554 > 500) {
                                                field554 = 0;
                                                int var114 = (int) (Math.random() * 8.0D);
                                                if ((var114 & 0x1) == 1) {
                                                    field735 += field549;
                                                }
                                                if ((var114 & 0x2) == 2) {
                                                    field550 += field551;
                                                }
                                                if ((var114 & 0x4) == 4) {
                                                    field552 += field553;
                                                }
                                            }
                                            if (field735 < -50) {
                                                field549 = 2;
                                            }
                                            if (field735 > 50) {
                                                field549 = -2;
                                            }
                                            if (field550 < -55) {
                                                field551 = 2;
                                            }
                                            if (field550 > 55) {
                                                field551 = -2;
                                            }
                                            if (field552 < -40) {
                                                field553 = 1;
                                            }
                                            if (field552 > 40) {
                                                field553 = -1;
                                            }
                                            field543++;
                                            if (field543 > 500) {
                                                field543 = 0;
                                                int var115 = (int) (Math.random() * 8.0D);
                                                if ((var115 & 0x1) == 1) {
                                                    field555 += field674;
                                                }
                                                if ((var115 & 0x2) == 2) {
                                                    field557 += field558;
                                                }
                                            }
                                            if (field555 < -60) {
                                                field674 = 2;
                                            }
                                            if (field555 > 60) {
                                                field674 = -2;
                                            }
                                            if (field557 < -20) {
                                                field558 = 1;
                                            }
                                            if (field557 > 10) {
                                                field558 = -1;
                                            }
                                            for (class28 var116 = (class28) field681.method3267(); var116 != null; var116 = (class28) field681.method3262()) {
                                                if ((long) var116.field757 < class121.method145() / 1000L - 5L) {
                                                    if (var116.field752 > 0) {
                                                        method224(5, "", var116.field750 + class134.field2229);
                                                    }
                                                    if (var116.field752 == 0) {
                                                        method224(5, "", var116.field750 + class134.field2230);
                                                    }
                                                    var116.method3324();
                                                }
                                            }
                                            field670++;
                                            if (field670 > 50) {
                                                field520.method2325(217);
                                            }
                                            try {
                                                if (Statics.field307 != null && field520.field2045 > 0) {
                                                    Statics.field307.method1366(field520.field2049, 0, field520.field2045);
                                                    field520.field2045 = 0;
                                                    field670 = 0;
                                                }
                                            } catch (IOException var118) {
                                                method1357();
                                            }
                                            return;
                                        }
                                        var88 = var87.field2;
                                        if (var88.field2620 < 0) {
                                            break;
                                        }
                                        var89 = class158.method2658(var88.field2588);
                                    } while (var89 == null || var89.field2685 == null || var88.field2620 >= var89.field2685.length || var89.field2685[var88.field2620] != var88);
                                    class26.method1870(var87);
                                }
                            }
                            var85 = var84.field2;
                            if (var85.field2620 < 0) {
                                break;
                            }
                            var86 = class158.method2658(var85.field2588);
                        } while (var86 == null || var86.field2685 == null || var85.field2620 >= var86.field2685.length || var86.field2685[var85.field2620] != var85);
                        class26.method1870(var84);
                    }
                }
                var82 = var81.field2;
                if (var82.field2620 < 0) {
                    break;
                }
                var83 = class158.method2658(var82.field2588);
            } while (var83 == null || var83.field2685 == null || var82.field2620 >= var83.field2685.length || var83.field2685[var82.field2620] != var82);
            class26.method1870(var81);
        }
    }

    @ObfuscatedName("ak.b(B)V")
    public static final void method736() {
        if (Statics.field755 != null) {
            Statics.field755.method1146();
        }
        if (Statics.field724 != null) {
            Statics.field724.method1146();
        }
    }

    @ObfuscatedName("u.y(Lak;IIII)V")
    public static void method158(class34 arg0, int arg1, int arg2, int arg3) {
        if (field548 >= 50 || field539 == 0 || arg0.field895 == null || arg1 >= arg0.field895.length) {
            return;
        }
        int var4 = arg0.field895[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field743[field548] = var5;
        field727[field548] = var6;
        field728[field548] = 0;
        field730[field548] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field590[field548] = (var8 << 16) + (var9 << 8) + var7;
        field548++;
    }

    @ObfuscatedName("z.x(IIII)V")
    public static void method148(int arg0, int arg1, int arg2) {
        if (field722 == 0 || arg1 == 0 || field548 >= 50) {
            return;
        }
        field743[field548] = arg0;
        field727[field548] = arg1;
        field728[field548] = arg2;
        field730[field548] = null;
        field590[field548] = 0;
        field548++;
    }

    @ObfuscatedName("l.ao(IB)V")
    public static void method123(int arg0) {
        if (arg0 == -1 && !field563) {
            Statics.field2342.method2747();
            class138.field2338 = 1;
            Statics.field2343 = null;
        } else if (arg0 != -1 && field720 != arg0 && field719 != 0 && !field563) {
            class138.method44(2, Statics.field1034, arg0, 0, field719, false);
        }
        field720 = arg0;
    }

    @ObfuscatedName("g.ae(IIB)V")
    public static void method164(int arg0, int arg1) {
        if (field719 != 0 && arg0 != -1) {
            class138.method3160(Statics.field195, arg0, 0, field719, false);
            field563 = true;
        }
    }

    @ObfuscatedName("m.aa(IIB)V")
    public static final void method154(int arg0, int arg1) {
        if (field718 != 0 && field718 != 3 || class77.field1390 != 1) {
            return;
        }
        int var2 = class77.field1398 - 25 - arg0;
        int var3 = class77.field1385 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field570 + field555 & 0x7FF;
        int var5 = class104.field1787[var4];
        int var6 = class104.field1788[var4];
        int var7 = (field557 + 256) * var5 >> 8;
        int var8 = (field557 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field139.field429 + var9 >> 7;
        int var12 = Statics.field139.field423 - var10 >> 7;
        boolean var13 = method1409(Statics.field139.field443[0], Statics.field139.field449[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field520.method2438(var2);
        field520.method2438(var3);
        field520.method2585(field570);
        field520.method2438(57);
        field520.method2438(field555);
        field520.method2438(field557);
        field520.method2438(89);
        field520.method2585(Statics.field139.field429);
        field520.method2585(Statics.field139.field423);
        field520.method2438(field739);
        field520.method2438(63);
    }

    @ObfuscatedName("bl.ah(I)V")
    public static final void method1525() {
        int var0 = Statics.field210 * 128 + 64;
        int var1 = Statics.field417 * 128 + 64;
        int var2 = method580(var0, var1, Statics.field379) - Statics.field74;
        if (Statics.field350 < var0) {
            Statics.field350 += Statics.field1207 * (var0 - Statics.field350) / 1000 + Statics.field79;
            if (Statics.field350 > var0) {
                Statics.field350 = var0;
            }
        }
        if (Statics.field350 > var0) {
            Statics.field350 -= Statics.field1207 * (Statics.field350 - var0) / 1000 + Statics.field79;
            if (Statics.field350 < var0) {
                Statics.field350 = var0;
            }
        }
        if (Statics.field375 < var2) {
            Statics.field375 += Statics.field1207 * (var2 - Statics.field375) / 1000 + Statics.field79;
            if (Statics.field375 > var2) {
                Statics.field375 = var2;
            }
        }
        if (Statics.field375 > var2) {
            Statics.field375 -= Statics.field1207 * (Statics.field375 - var2) / 1000 + Statics.field79;
            if (Statics.field375 < var2) {
                Statics.field375 = var2;
            }
        }
        if (Statics.field284 < var1) {
            Statics.field284 += Statics.field1207 * (var1 - Statics.field284) / 1000 + Statics.field79;
            if (Statics.field284 > var1) {
                Statics.field284 = var1;
            }
        }
        if (Statics.field284 > var1) {
            Statics.field284 -= Statics.field1207 * (Statics.field284 - var1) / 1000 + Statics.field79;
            if (Statics.field284 < var1) {
                Statics.field284 = var1;
            }
        }
        int var3 = Statics.field758 * 128 + 64;
        int var4 = Statics.field2037 * 128 + 64;
        int var5 = method580(var3, var4, Statics.field379) - Statics.field1682;
        int var6 = var3 - Statics.field350;
        int var7 = var5 - Statics.field375;
        int var8 = var4 - Statics.field284;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field398 < var10) {
            Statics.field398 += Statics.field1269 * (var10 - Statics.field398) / 1000 + Statics.field1520;
            if (Statics.field398 > var10) {
                Statics.field398 = var10;
            }
        }
        if (Statics.field398 > var10) {
            Statics.field398 -= Statics.field1269 * (Statics.field398 - var10) / 1000 + Statics.field1520;
            if (Statics.field398 < var10) {
                Statics.field398 = var10;
            }
        }
        int var12 = var11 - Statics.field264;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field264 += Statics.field1269 * var12 / 1000 + Statics.field1520;
            Statics.field264 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field264 -= Statics.field1269 * -var12 / 1000 + Statics.field1520;
            Statics.field264 &= 0x7FF;
        }
        int var13 = var11 - Statics.field264;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field264 = var11;
        }
    }

    @ObfuscatedName("df.aw(I)V")
    public static final void method2196() {
        int var0 = field735 + Statics.field139.field429;
        int var1 = field550 + Statics.field139.field423;
        if (Statics.field573 - var0 < -500 || Statics.field573 - var0 > 500 || Statics.field1403 - var1 < -500 || Statics.field1403 - var1 > 500) {
            Statics.field573 = var0;
            Statics.field1403 = var1;
        }
        if (Statics.field573 != var0) {
            Statics.field573 += (var0 - Statics.field573) / 16;
        }
        if (Statics.field1403 != var1) {
            Statics.field1403 += (var1 - Statics.field1403) / 16;
        }
        if (class75.field1358[96]) {
            field571 += (-24 - field571) / 2;
        } else if (class75.field1358[97]) {
            field571 += (24 - field571) / 2;
        } else {
            field571 /= 2;
        }
        if (class75.field1358[98]) {
            field652 += (12 - field652) / 2;
        } else if (class75.field1358[99]) {
            field652 += (-12 - field652) / 2;
        } else {
            field652 /= 2;
        }
        field570 = field571 / 2 + field570 & 0x7FF;
        field517 += field652 / 2;
        if (field517 < 128) {
            field517 = 128;
        }
        if (field517 > 383) {
            field517 = 383;
        }
        int var2 = Statics.field573 >> 7;
        int var3 = Statics.field1403 >> 7;
        int var4 = method580(Statics.field573, Statics.field1403, Statics.field379);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = Statics.field379;
                    if (var8 < 3 && (class9.field122[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = var4 - class9.field115[var8][var6][var7];
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
        if (var10 > field569) {
            field569 += (var10 - field569) / 24;
        } else if (var10 < field569) {
            field569 += (var10 - field569) / 80;
        }
    }

    @ObfuscatedName("da.an(Lao;IB)V")
    public static final void method2382(class27 arg0, int arg1) {
        if (arg0.field457 > field491) {
            int var2 = arg0.field457 - field491;
            int var3 = arg0.field462 * 64 + arg0.field461 * 128;
            int var4 = arg0.field463 * 128 + arg0.field462 * 64;
            arg0.field429 += (var3 - arg0.field429) / var2;
            arg0.field423 += (var4 - arg0.field423) / var2;
            arg0.field477 = 0;
            if (arg0.field467 == 0) {
                arg0.field470 = 1024;
            }
            if (arg0.field467 == 1) {
                arg0.field470 = 1536;
            }
            if (arg0.field467 == 2) {
                arg0.field470 = 0;
            }
            if (arg0.field467 == 3) {
                arg0.field470 = 512;
            }
        } else if (arg0.field466 >= field491) {
            method131(arg0);
        } else {
            method780(arg0);
        }
        if (arg0.field429 < 128 || arg0.field423 < 128 || arg0.field429 >= 13184 || arg0.field423 >= 13184) {
            arg0.field451 = -1;
            arg0.field456 = -1;
            arg0.field457 = 0;
            arg0.field466 = 0;
            arg0.field429 = arg0.field443[0] * 128 + arg0.field462 * 64;
            arg0.field423 = arg0.field449[0] * 128 + arg0.field462 * 64;
            arg0.method259();
        }
        if (Statics.field139 == arg0 && (arg0.field429 < 1536 || arg0.field423 < 1536 || arg0.field429 >= 11776 || arg0.field423 >= 11776)) {
            arg0.field451 = -1;
            arg0.field456 = -1;
            arg0.field457 = 0;
            arg0.field466 = 0;
            arg0.field429 = arg0.field443[0] * 128 + arg0.field462 * 64;
            arg0.field423 = arg0.field449[0] * 128 + arg0.field462 * 64;
            arg0.method259();
        }
        if (arg0.field472 != 0) {
            if (arg0.field445 != -1 && arg0.field445 < 32768) {
                class25 var5 = field632[arg0.field445];
                if (var5 != null) {
                    int var6 = arg0.field429 - var5.field429;
                    int var7 = arg0.field423 - var5.field423;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field470 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field445 >= 32768) {
                int var8 = arg0.field445 - 32768;
                if (field618 == var8) {
                    var8 = 2047;
                }
                class3 var9 = field604[var8];
                if (var9 != null) {
                    int var10 = arg0.field429 - var9.field429;
                    int var11 = arg0.field423 - var9.field423;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field470 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field476 != 0 || arg0.field447 != 0) && (arg0.field448 == 0 || arg0.field477 > 0)) {
                int var12 = arg0.field429 - (arg0.field476 * 64 - Statics.field1518 * 64 - Statics.field1518 * 64);
                int var13 = arg0.field423 - (arg0.field447 * 64 - Statics.field1830 * 64 - Statics.field1830 * 64);
                if (var12 != 0 || var13 != 0) {
                    arg0.field470 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
                arg0.field476 = 0;
                arg0.field447 = 0;
            }
            int var14 = arg0.field470 - arg0.field433 & 0x7FF;
            if (var14 == 0) {
                arg0.field471 = 0;
            } else {
                arg0.field471++;
                if (var14 > 1024) {
                    arg0.field433 -= arg0.field472;
                    boolean var15 = true;
                    if (var14 < arg0.field472 || var14 > 2048 - arg0.field472) {
                        arg0.field433 = arg0.field470;
                        var15 = false;
                    }
                    if (arg0.field474 == arg0.field427 && (arg0.field471 > 25 || var15)) {
                        if (arg0.field428 == -1) {
                            arg0.field474 = arg0.field430;
                        } else {
                            arg0.field474 = arg0.field428;
                        }
                    }
                } else {
                    arg0.field433 += arg0.field472;
                    boolean var16 = true;
                    if (var14 < arg0.field472 || var14 > 2048 - arg0.field472) {
                        arg0.field433 = arg0.field470;
                        var16 = false;
                    }
                    if (arg0.field474 == arg0.field427 && (arg0.field471 > 25 || var16)) {
                        if (arg0.field438 == -1) {
                            arg0.field474 = arg0.field430;
                        } else {
                            arg0.field474 = arg0.field438;
                        }
                    }
                }
                arg0.field433 &= 0x7FF;
            }
        }
        method194(arg0);
    }

    @ObfuscatedName("a.av(Lao;I)V")
    public static final void method131(class27 arg0) {
        if (field491 == arg0.field466 || arg0.field451 == -1 || arg0.field454 != 0 || arg0.field453 + 1 > class34.method235(arg0.field451).field891[arg0.field452]) {
            int var1 = arg0.field466 - arg0.field457;
            int var2 = field491 - arg0.field457;
            int var3 = arg0.field462 * 64 + arg0.field461 * 128;
            int var4 = arg0.field463 * 128 + arg0.field462 * 64;
            int var5 = arg0.field462 * 64 + arg0.field440 * 128;
            int var6 = arg0.field464 * 128 + arg0.field462 * 64;
            arg0.field429 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field423 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field477 = 0;
        if (arg0.field467 == 0) {
            arg0.field470 = 1024;
        }
        if (arg0.field467 == 1) {
            arg0.field470 = 1536;
        }
        if (arg0.field467 == 2) {
            arg0.field470 = 0;
        }
        if (arg0.field467 == 3) {
            arg0.field470 = 512;
        }
        arg0.field433 = arg0.field470;
    }

    @ObfuscatedName("ab.ak(Lao;I)V")
    public static final void method780(class27 arg0) {
        arg0.field474 = arg0.field427;
        if (arg0.field448 == 0) {
            arg0.field477 = 0;
            return;
        }
        if (arg0.field451 != -1 && arg0.field454 == 0) {
            class34 var1 = class34.method235(arg0.field451);
            if (arg0.field473 > 0 && var1.field900 == 0) {
                arg0.field477++;
                return;
            }
            if (arg0.field473 <= 0 && var1.field901 == 0) {
                arg0.field477++;
                return;
            }
        }
        int var2 = arg0.field429;
        int var3 = arg0.field423;
        int var4 = arg0.field443[arg0.field448 - 1] * 128 + arg0.field462 * 64;
        int var5 = arg0.field449[arg0.field448 - 1] * 128 + arg0.field462 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field429 = var4;
            arg0.field423 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field470 = 1280;
            } else if (var3 > var5) {
                arg0.field470 = 1792;
            } else {
                arg0.field470 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field470 = 768;
            } else if (var3 > var5) {
                arg0.field470 = 256;
            } else {
                arg0.field470 = 512;
            }
        } else if (var3 < var5) {
            arg0.field470 = 1024;
        } else if (var3 > var5) {
            arg0.field470 = 0;
        }
        int var6 = arg0.field470 - arg0.field433 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field478;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field430;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field434;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field424;
        }
        if (var7 == -1) {
            var7 = arg0.field430;
        }
        arg0.field474 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field396.field804;
        }
        if (var9) {
            if (arg0.field470 != arg0.field433 && arg0.field445 == -1 && arg0.field472 != 0) {
                var8 = 2;
            }
            if (arg0.field448 > 2) {
                var8 = 6;
            }
            if (arg0.field448 > 3) {
                var8 = 8;
            }
            if (arg0.field477 > 0 && arg0.field448 > 1) {
                var8 = 8;
                arg0.field477--;
            }
        } else {
            if (arg0.field448 > 1) {
                var8 = 6;
            }
            if (arg0.field448 > 2) {
                var8 = 8;
            }
            if (arg0.field477 > 0 && arg0.field448 > 1) {
                var8 = 8;
                arg0.field477--;
            }
        }
        if (arg0.field460[arg0.field448 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field474 == arg0.field430 && arg0.field455 != -1) {
            arg0.field474 = arg0.field455;
        }
        if (var2 < var4) {
            arg0.field429 += var8;
            if (arg0.field429 > var4) {
                arg0.field429 = var4;
            }
        } else if (var2 > var4) {
            arg0.field429 -= var8;
            if (arg0.field429 < var4) {
                arg0.field429 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field423 += var8;
            if (arg0.field423 > var5) {
                arg0.field423 = var5;
            }
        } else if (var3 > var5) {
            arg0.field423 -= var8;
            if (arg0.field423 < var5) {
                arg0.field423 = var5;
            }
        }
        if (arg0.field429 == var4 && arg0.field423 == var5) {
            arg0.field448--;
            if (arg0.field473 > 0) {
                arg0.field473--;
            }
        }
    }

    @ObfuscatedName("j.ax(Lao;I)V")
    public static final void method194(class27 arg0) {
        arg0.field425 = false;
        if (arg0.field474 != -1) {
            class34 var1 = class34.method235(arg0.field474);
            if (var1 == null || var1.field889 == null) {
                arg0.field474 = -1;
            } else {
                arg0.field450++;
                if (arg0.field465 < var1.field889.length && arg0.field450 > var1.field891[arg0.field465]) {
                    arg0.field450 = 1;
                    arg0.field465++;
                    method158(var1, arg0.field465, arg0.field429, arg0.field423);
                }
                if (arg0.field465 >= var1.field889.length) {
                    arg0.field450 = 0;
                    arg0.field465 = 0;
                    method158(var1, arg0.field465, arg0.field429, arg0.field423);
                }
            }
        }
        if (arg0.field456 != -1 && field491 >= arg0.field459) {
            if (arg0.field475 < 0) {
                arg0.field475 = 0;
            }
            int var2 = class35.method633(arg0.field456).field912;
            if (var2 == -1) {
                arg0.field456 = -1;
            } else {
                class34 var3 = class34.method235(var2);
                if (var3 == null || var3.field889 == null) {
                    arg0.field456 = -1;
                } else {
                    arg0.field458++;
                    if (arg0.field475 < var3.field889.length && arg0.field458 > var3.field891[arg0.field475]) {
                        arg0.field458 = 1;
                        arg0.field475++;
                        method158(var3, arg0.field475, arg0.field429, arg0.field423);
                    }
                    if (arg0.field475 >= var3.field889.length && (arg0.field475 < 0 || arg0.field475 >= var3.field889.length)) {
                        arg0.field456 = -1;
                    }
                }
            }
        }
        if (arg0.field451 != -1 && arg0.field454 <= 1) {
            class34 var4 = class34.method235(arg0.field451);
            if (var4.field900 == 1 && arg0.field473 > 0 && arg0.field457 <= field491 && arg0.field466 < field491) {
                arg0.field454 = 1;
                return;
            }
        }
        if (arg0.field451 != -1 && arg0.field454 == 0) {
            class34 var5 = class34.method235(arg0.field451);
            if (var5 == null || var5.field889 == null) {
                arg0.field451 = -1;
            } else {
                arg0.field453++;
                if (arg0.field452 < var5.field889.length && arg0.field453 > var5.field891[arg0.field452]) {
                    arg0.field453 = 1;
                    arg0.field452++;
                    method158(var5, arg0.field452, arg0.field429, arg0.field423);
                }
                if (arg0.field452 >= var5.field889.length) {
                    arg0.field452 -= var5.field898;
                    arg0.field422++;
                    if (arg0.field422 >= var5.field899) {
                        arg0.field451 = -1;
                    } else if (arg0.field452 >= 0 && arg0.field452 < var5.field889.length) {
                        method158(var5, arg0.field452, arg0.field429, arg0.field423);
                    } else {
                        arg0.field451 = -1;
                    }
                }
                arg0.field425 = var5.field903;
            }
        }
        if (arg0.field454 > 0) {
            arg0.field454--;
        }
    }

    @ObfuscatedName("ax.ab(Lf;III)V")
    public static void method747(class3 arg0, int arg1, int arg2) {
        if (arg0.field451 == arg1 && arg1 != -1) {
            int var3 = class34.method235(arg1).field902;
            if (var3 == 1) {
                arg0.field452 = 0;
                arg0.field453 = 0;
                arg0.field454 = arg2;
                arg0.field422 = 0;
            }
            if (var3 == 2) {
                arg0.field422 = 0;
            }
        } else if (arg1 == -1 || arg0.field451 == -1 || class34.method235(arg1).field896 >= class34.method235(arg0.field451).field896) {
            arg0.field451 = arg1;
            arg0.field452 = 0;
            arg0.field453 = 0;
            arg0.field454 = arg2;
            arg0.field422 = 0;
            arg0.field473 = arg0.field448;
        }
    }

    @ObfuscatedName("t.af(B)V")
    public static final void method37() {
        if (!field580) {
            field680[0] = class134.field2195;
            field633[0] = "";
            field630[0] = 1006;
            field627 = 1;
        }
        if (field644 != -1) {
            int var0 = field644;
            if (class158.method829(var0)) {
                method675(Statics.field2570[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field498; var1++) {
            if (field687[var1]) {
                field688[var1] = true;
            }
            field689[var1] = field687[var1];
            field687[var1] = false;
        }
        field686 = field491;
        field634 = -1;
        field635 = -1;
        Statics.field114 = null;
        if (field644 != -1) {
            field498 = 0;
            int var2 = field644;
            if (class158.method829(var2)) {
                Statics.field2050 = null;
                method1662(Statics.field2570[var2], -1, 0, 0, 765, 503, 0, 0, -1);
                if (Statics.field2050 != null) {
                    method1662(Statics.field2050, -1412584499, 0, 0, 765, 503, Statics.field2009, Statics.field1547, -1);
                    Statics.field2050 = null;
                }
            } else {
                for (int var3 = 0; var3 < 100; var3++) {
                    field687[var3] = true;
                }
            }
        }
        class89.method1786();
        boolean var4 = false;
        while (!var4) {
            var4 = true;
            for (int var5 = 0; var5 < field627 - 1; var5++) {
                if (field630[var5] < 1000 && field630[var5 + 1] > 1000) {
                    String var6 = field633[var5];
                    field633[var5] = field633[var5 + 1];
                    field633[var5 + 1] = var6;
                    String var7 = field680[var5];
                    field680[var5] = field680[var5 + 1];
                    field680[var5 + 1] = var7;
                    int var8 = field630[var5];
                    field630[var5] = field630[var5 + 1];
                    field630[var5 + 1] = var8;
                    int var9 = field628[var5];
                    field628[var5] = field628[var5 + 1];
                    field628[var5 + 1] = var9;
                    int var10 = field629[var5];
                    field629[var5] = field629[var5 + 1];
                    field629[var5 + 1] = var10;
                    int var11 = field631[var5];
                    field631[var5] = field631[var5 + 1];
                    field631[var5 + 1] = var11;
                    var4 = false;
                }
            }
        }
        if (field580) {
            Statics.method1300();
        } else if (field634 != -1) {
            int var12 = field634;
            int var13 = field635;
            if (field627 >= 2 || field638 != 0 || field610) {
                String var14;
                if (field638 == 1 && field627 < 2) {
                    var14 = class134.field2232 + class134.field2242 + field639 + " " + class2.field21;
                } else if (field610 && field627 < 2) {
                    var14 = field642 + class134.field2242 + field595 + " " + class2.field21;
                } else {
                    int var15 = field627 - 1;
                    String var16;
                    if (field633[var15].length() > 0) {
                        var16 = field680[var15] + class134.field2242 + field633[var15];
                    } else {
                        var16 = field680[var15];
                    }
                    var14 = var16;
                }
                if (field627 > 2) {
                    var14 = var14 + class2.method1(16777215) + " " + '/' + " " + (field627 - 2) + class134.field2236;
                }
                Statics.field1037.method3373(var14, var12 + 4, var13 + 15, 16777215, 0, field491 / 1000);
            }
        }
        if (field694 == 3) {
            for (int var17 = 0; var17 < field498; var17++) {
                if (field689[var17]) {
                    class89.method1792(field690[var17], field691[var17], field650[var17], field693[var17], 16711935, 128);
                } else if (field688[var17]) {
                    class89.method1792(field690[var17], field691[var17], field650[var17], field693[var17], 16711680, 128);
                }
            }
        }
        class7.method2036(Statics.field379, Statics.field139.field429, Statics.field139.field423, field526);
        field526 = 0;
    }

    @ObfuscatedName("ae.ai(Ljava/lang/String;ZI)V")
    public static final void method547(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1512.method3364(arg0, 250);
        int var6 = Statics.field1512.method3429(arg0, 250) * 13;
        class89.method1796(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1829(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1512.method3369(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        Statics.method245(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field132.getGraphics();
                Statics.field263.method1587(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field132.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field498; var13++) {
            if (field690[var13] + field650[var13] > var9 && field690[var13] < var9 + var11 && field693[var13] + field691[var13] > var10 && field691[var13] < var10 + var12) {
                field688[var13] = true;
            }
        }
    }

    @ObfuscatedName("x.at(IIIII)V")
    public static final void method254(int arg0, int arg1, int arg2, int arg3) {
        class89.method1787(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2182();
        field725++;
        method246(true);
        method825(true);
        method246(false);
        method825(false);
        for (class10 var4 = (class10) field620.method3294(); var4 != null; var4 = (class10) field620.method3296()) {
            if (Statics.field379 != var4.field176 || field491 > var4.field148) {
                var4.method3328();
            } else if (field491 >= var4.field147) {
                if (var4.field151 > 0) {
                    class25 var5 = field632[var4.field151 - 1];
                    if (var5 != null && var5.field429 >= 0 && var5.field429 < 13312 && var5.field423 >= 0 && var5.field423 < 13312) {
                        var4.method114(var5.field429, var5.field423, method580(var5.field429, var5.field423, var4.field176) - var4.field146, field491);
                    }
                }
                if (var4.field151 < 0) {
                    int var6 = -var4.field151 - 1;
                    class3 var7;
                    if (field618 == var6) {
                        var7 = Statics.field139;
                    } else {
                        var7 = field604[var6];
                    }
                    if (var7 != null && var7.field429 >= 0 && var7.field429 < 13312 && var7.field423 >= 0 && var7.field423 < 13312) {
                        var4.method114(var7.field429, var7.field423, method580(var7.field429, var7.field423, var4.field176) - var4.field146, field491);
                    }
                }
                var4.method115(field526);
                Statics.field419.method1924(Statics.field379, (int) var4.field171, (int) var4.field154, (int) var4.field155, 60, var4, var4.field161, -1, false);
            }
        }
        for (class20 var8 = (class20) field621.method3294(); var8 != null; var8 = (class20) field621.method3296()) {
            if (Statics.field379 != var8.field298 || var8.field302) {
                var8.method3328();
            } else if (field491 >= var8.field297) {
                var8.method195(field526);
                if (var8.field302) {
                    var8.method3328();
                } else {
                    Statics.field419.method1924(var8.field298, var8.field299, var8.field300, var8.field305, 60, var8, 0, -1, false);
                }
            }
        }
        if (!field731) {
            int var9 = field517;
            if (field569 / 256 > var9) {
                var9 = field569 / 256;
            }
            if (field732[4] && field734[4] + 128 > var9) {
                var9 = field734[4] + 128;
            }
            int var10 = field570 + field552 & 0x7FF;
            method2040(Statics.field573, method580(Statics.field139.field429, Statics.field139.field423, Statics.field379) - 50, Statics.field1403, var9, var10, var9 * 3 + 600);
        }
        int var11;
        if (field731) {
            var11 = method1868();
        } else {
            var11 = method913();
        }
        int var12 = Statics.field350;
        int var13 = Statics.field375;
        int var14 = Statics.field284;
        int var15 = Statics.field398;
        int var16 = Statics.field264;
        for (int var17 = 0; var17 < 5; var17++) {
            if (field732[var17]) {
                int var18 = (int) (Math.random() * (double) (field576[var17] * 2 + 1) - (double) field576[var17] + Math.sin((double) field588[var17] / 100.0D * (double) field736[var17]) * (double) field734[var17]);
                if (var17 == 0) {
                    Statics.field350 += var18;
                }
                if (var17 == 1) {
                    Statics.field375 += var18;
                }
                if (var17 == 2) {
                    Statics.field284 += var18;
                }
                if (var17 == 3) {
                    Statics.field264 = Statics.field264 + var18 & 0x7FF;
                }
                if (var17 == 4) {
                    Statics.field398 += var18;
                    if (Statics.field398 < 128) {
                        Statics.field398 = 128;
                    }
                    if (Statics.field398 > 383) {
                        Statics.field398 = 383;
                    }
                }
            }
        }
        int var19 = class77.field1391;
        int var20 = class77.field1396;
        if (var19 >= arg0 && var19 < arg0 + arg2 && var20 >= arg1 && var20 < arg1 + arg3) {
            class112.field1918 = true;
            class112.field1921 = 0;
            class112.field1878 = class77.field1391 - arg0;
            class112.field1920 = class77.field1396 - arg1;
        } else {
            class112.field1918 = false;
            class112.field1921 = 0;
        }
        method736();
        class89.method1796(arg0, arg1, arg2, arg3, 0);
        method736();
        Statics.field419.method2001(Statics.field350, Statics.field375, Statics.field284, Statics.field398, Statics.field264, var11);
        method736();
        Statics.field419.method1885();
        field577 = 0;
        for (int var21 = -1; var21 < field726 + field605; var21++) {
            class27 var22;
            if (var21 == -1) {
                var22 = Statics.field139;
            } else if (var21 < field605) {
                var22 = field604[field525[var21]];
            } else {
                var22 = field632[field487[var21 - field605]];
            }
            if (var22 != null && var22.method26()) {
                if (var22 instanceof class25) {
                    class31 var23 = ((class25) var22).field396;
                    if (var23.field814 != null) {
                        var23 = var23.method634();
                    }
                    if (var23 == null) {
                        continue;
                    }
                }
                if (var21 >= field605) {
                    class31 var26 = ((class25) var22).field396;
                    if (var26.field814 != null) {
                        var26 = var26.method634();
                    }
                    if (var26.field812 >= 0 && var26.field812 < Statics.field252.length) {
                        method34(var22, var22.field469 + 15);
                        if (field589 > -1) {
                            Statics.field252[var26.field812].method1700(field589 + arg0 - 12, field707 + arg1 - 30);
                        }
                    }
                    if (field499 == 1 && field500 == field487[var21 - field605] && field491 % 20 < 10) {
                        method34(var22, var22.field469 + 15);
                        if (field589 > -1) {
                            Statics.field95[0].method1700(field589 + arg0 - 12, field707 + arg1 - 28);
                        }
                    }
                } else {
                    int var24 = 30;
                    class3 var25 = (class3) var22;
                    if (var25.field41 != -1 || var25.field32 != -1) {
                        method34(var22, var22.field469 + 15);
                        if (field589 > -1) {
                            if (var25.field41 != -1) {
                                Statics.field2712[var25.field41].method1700(field589 + arg0 - 12, field707 + arg1 - var24);
                                var24 += 25;
                            }
                            if (var25.field32 != -1) {
                                Statics.field252[var25.field32].method1700(field589 + arg0 - 12, field707 + arg1 - var24);
                                var24 += 25;
                            }
                        }
                    }
                    if (var21 >= 0 && field499 == 10 && field501 == field525[var21]) {
                        method34(var22, var22.field469 + 15);
                        if (field589 > -1) {
                            Statics.field95[1].method1700(field589 + arg0 - 12, field707 + arg1 - var24);
                        }
                    }
                }
                if (var22.field435 != null && (var21 >= field605 || field701 == 0 || field701 == 3 || field701 == 1 && method192(((class3) var22).field36))) {
                    method34(var22, var22.field469);
                    if (field589 > -1 && field577 < field578) {
                        field582[field577] = Statics.field1037.method3361(var22.field435) / 2;
                        field529[field577] = Statics.field1037.field2855;
                        field626[field577] = field589;
                        field723[field577] = field707;
                        field583[field577] = var22.field437;
                        field584[field577] = var22.field446;
                        field585[field577] = var22.field436;
                        field523[field577] = var22.field435;
                        field577++;
                    }
                }
                if (var22.field442 > field491) {
                    method34(var22, var22.field469 + 15);
                    if (field589 > -1) {
                        int var27 = var22.field432 * 30 / var22.field426;
                        if (var27 > 30) {
                            var27 = 30;
                        }
                        class89.method1796(field589 + arg0 - 15, field707 + arg1 - 3, var27, 5, 65280);
                        class89.method1796(field589 + arg0 - 15 + var27, field707 + arg1 - 3, 30 - var27, 5, 16711680);
                    }
                }
                for (int var28 = 0; var28 < 4; var28++) {
                    if (var22.field441[var28] > field491) {
                        method34(var22, var22.field469 / 2);
                        if (field589 > -1) {
                            if (var28 == 1) {
                                field707 -= 20;
                            }
                            if (var28 == 2) {
                                field589 -= 15;
                                field707 -= 10;
                            }
                            if (var28 == 3) {
                                field589 += 15;
                                field707 -= 10;
                            }
                            Statics.field261[var22.field444[var28]].method1700(field589 + arg0 - 12, field707 + arg1 - 12);
                            Statics.field763.method3433(Integer.toString(var22.field439[var28]), field589 + arg0 - 1, field707 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var29 = 0; var29 < field577; var29++) {
            int var30 = field626[var29];
            int var31 = field723[var29];
            int var32 = field582[var29];
            int var33 = field529[var29];
            boolean var34 = true;
            while (var34) {
                var34 = false;
                for (int var35 = 0; var35 < var29; var35++) {
                    if (var31 + 2 > field723[var35] - field529[var35] && var31 - var33 < field723[var35] + 2 && var30 - var32 < field626[var35] + field582[var35] && var30 + var32 > field626[var35] - field582[var35] && field723[var35] - field529[var35] < var31) {
                        var31 = field723[var35] - field529[var35];
                        var34 = true;
                    }
                }
            }
            field589 = field626[var29];
            field707 = field723[var29] = var31;
            String var36 = field523[var29];
            if (field646 == 0) {
                int var37 = 16776960;
                if (field583[var29] < 6) {
                    var37 = field700[field583[var29]];
                }
                if (field583[var29] == 6) {
                    var37 = field725 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field583[var29] == 7) {
                    var37 = field725 % 20 < 10 ? 255 : 65535;
                }
                if (field583[var29] == 8) {
                    var37 = field725 % 20 < 10 ? 45056 : 8454016;
                }
                if (field583[var29] == 9) {
                    int var38 = 150 - field585[var29];
                    if (var38 < 50) {
                        var37 = var38 * 1280 + 16711680;
                    } else if (var38 < 100) {
                        var37 = 16776960 - (var38 - 50) * 327680;
                    } else if (var38 < 150) {
                        var37 = (var38 - 100) * 5 + 65280;
                    }
                }
                if (field583[var29] == 10) {
                    int var39 = 150 - field585[var29];
                    if (var39 < 50) {
                        var37 = var39 * 5 + 16711680;
                    } else if (var39 < 100) {
                        var37 = 16711935 - (var39 - 50) * 327680;
                    } else if (var39 < 150) {
                        var37 = (var39 - 100) * 327680 + 255 - (var39 - 100) * 5;
                    }
                }
                if (field583[var29] == 11) {
                    int var40 = 150 - field585[var29];
                    if (var40 < 50) {
                        var37 = 16777215 - var40 * 327685;
                    } else if (var40 < 100) {
                        var37 = (var40 - 50) * 327685 + 65280;
                    } else if (var40 < 150) {
                        var37 = 16777215 - (var40 - 100) * 327680;
                    }
                }
                if (field584[var29] == 0) {
                    Statics.field1037.method3433(var36, field589 + arg0, field707 + arg1, var37, 0);
                }
                if (field584[var29] == 1) {
                    Statics.field1037.method3404(var36, field589 + arg0, field707 + arg1, var37, 0, field725);
                }
                if (field584[var29] == 2) {
                    Statics.field1037.method3371(var36, field589 + arg0, field707 + arg1, var37, 0, field725);
                }
                if (field584[var29] == 3) {
                    Statics.field1037.method3372(var36, field589 + arg0, field707 + arg1, var37, 0, field725, 150 - field585[var29]);
                }
                if (field584[var29] == 4) {
                    int var41 = (150 - field585[var29]) * (Statics.field1037.method3361(var36) + 100) / 150;
                    class89.method1788(field589 + arg0 - 50, arg1, field589 + arg0 + 50, arg1 + arg3);
                    Statics.field1037.method3385(var36, field589 + arg0 + 50 - var41, field707 + arg1, var37, 0);
                    class89.method1787(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field584[var29] == 5) {
                    int var42 = 150 - field585[var29];
                    int var43 = 0;
                    if (var42 < 25) {
                        var43 = var42 - 25;
                    } else if (var42 > 125) {
                        var43 = var42 - 125;
                    }
                    class89.method1788(arg0, field707 + arg1 - Statics.field1037.field2855 - 1, arg0 + arg2, field707 + arg1 + 5);
                    Statics.field1037.method3433(var36, field589 + arg0, field707 + arg1 + var43, var37, 0);
                    class89.method1787(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1037.method3433(var36, field589 + arg0, field707 + arg1, 16776960, 0);
            }
        }
        method242(arg0, arg1);
        ((class110) Statics.field1780).method2226(field526);
        if (field594 == 1) {
            Statics.field496[field593 / 100].method1700(field507 - 8, field592 - 8);
        }
        if (field594 == 2) {
            Statics.field496[field593 / 100 + 4].method1700(field507 - 8, field592 - 8);
        }
        method251();
        if (field497) {
            int var44 = arg0 + 512 - 5;
            int var45 = arg1 + 20;
            Statics.field1512.method3367("Fps:" + field1309, var44, var45, 16776960, -1);
            int var76 = var45 + 15;
            Runtime var46 = Runtime.getRuntime();
            int var47 = (int) ((var46.totalMemory() - var46.freeMemory()) / 1024L);
            int var48 = 16776960;
            if (var47 > 32768 && field733) {
                var48 = 16711680;
            }
            if (var47 > 65536 && !field733) {
                var48 = 16711680;
            }
            Statics.field1512.method3367("Mem:" + var47 + "k", var44, var76, var48, -1);
            var45 = var76 + 15;
        }
        Statics.field350 = var12;
        Statics.field375 = var13;
        Statics.field284 = var14;
        Statics.field398 = var15;
        Statics.field264 = var16;
        if (field490 && class153.method2669(true, false) == 0) {
            field490 = false;
        }
        if (field490) {
            class89.method1796(arg0, arg1, arg2, arg3, 0);
            method547(class134.field2098, false);
        }
        if (field490 || field580 || var19 < arg0 || var19 >= arg0 + arg2 || var20 < arg1 || var20 >= arg1 + arg3) {
            return;
        }
        if (field638 == 0 && !field610) {
            method1395(class134.field2237, "", 23, 0, var19 - arg0, var20 - arg1);
        }
        int var49 = -1;
        for (int var50 = 0; var50 < class112.field1921; var50++) {
            int var51 = class112.field1922[var50];
            int var52 = var51 & 0x7F;
            int var53 = var51 >> 7 & 0x7F;
            int var54 = var51 >> 29 & 0x3;
            int var55 = var51 >> 14 & 0x7FFF;
            if (var49 != var51) {
                var49 = var51;
                if (var54 == 2 && Statics.field419.method1901(Statics.field379, var52, var53, var51) >= 0) {
                    class32 var56 = class32.method2660(var55);
                    if (var56.field829 != null) {
                        var56 = var56.method650();
                    }
                    if (var56 == null) {
                        continue;
                    }
                    if (field638 == 1) {
                        method1395(class134.field2232, field639 + " " + class2.field21 + " " + class2.method1(65535) + var56.field856, 1, var51, var52, var53);
                    } else if (!field610) {
                        String[] var57 = var56.field848;
                        if (field512) {
                            var57 = method2129(var57);
                        }
                        if (var57 != null) {
                            for (int var58 = 4; var58 >= 0; var58--) {
                                if (var57[var58] != null) {
                                    short var59 = 0;
                                    if (var58 == 0) {
                                        var59 = 3;
                                    }
                                    if (var58 == 1) {
                                        var59 = 4;
                                    }
                                    if (var58 == 2) {
                                        var59 = 5;
                                    }
                                    if (var58 == 3) {
                                        var59 = 6;
                                    }
                                    if (var58 == 4) {
                                        var59 = 1001;
                                    }
                                    method1395(var57[var58], class2.method1(65535) + var56.field856, var59, var51, var52, var53);
                                }
                            }
                        }
                        method1395(class134.field2233, class2.method1(65535) + var56.field856, 1002, var56.field828 << 14, var52, var53);
                    } else if ((Statics.field1524 & 0x4) == 4) {
                        method1395(field642, field595 + " " + class2.field21 + " " + class2.method1(65535) + var56.field856, 2, var51, var52, var53);
                    }
                }
                if (var54 == 1) {
                    class25 var60 = field632[var55];
                    if (var60.field396.field785 == 1 && (var60.field429 & 0x7F) == 64 && (var60.field423 & 0x7F) == 64) {
                        for (int var61 = 0; var61 < field726; var61++) {
                            class25 var62 = field632[field487[var61]];
                            if (var62 != null && var60 != var62 && var62.field396.field785 == 1 && var60.field429 == var62.field429 && var60.field423 == var62.field423) {
                                method2130(var62.field396, field487[var61], var52, var53);
                            }
                        }
                        for (int var63 = 0; var63 < field605; var63++) {
                            class3 var64 = field604[field525[var63]];
                            if (var64 != null && var60.field429 == var64.field429 && var60.field423 == var64.field423) {
                                method274(var64, field525[var63], var52, var53);
                            }
                        }
                    }
                    method2130(var60.field396, var55, var52, var53);
                }
                if (var54 == 0) {
                    class3 var65 = field604[var55];
                    if ((var65.field429 & 0x7F) == 64 && (var65.field423 & 0x7F) == 64) {
                        for (int var66 = 0; var66 < field726; var66++) {
                            class25 var67 = field632[field487[var66]];
                            if (var67 != null && var67.field396.field785 == 1 && var65.field429 == var67.field429 && var65.field423 == var67.field423) {
                                method2130(var67.field396, field487[var66], var52, var53);
                            }
                        }
                        for (int var68 = 0; var68 < field605; var68++) {
                            class3 var69 = field604[field525[var68]];
                            if (var69 != null && var65 != var69 && var65.field429 == var69.field429 && var65.field423 == var69.field423) {
                                method274(var69, field525[var68], var52, var53);
                            }
                        }
                    }
                    method274(var65, var55, var52, var53);
                }
                if (var54 == 3) {
                    class177 var70 = field519[Statics.field379][var52][var53];
                    if (var70 != null) {
                        for (class17 var71 = (class17) var70.method3315(); var71 != null; var71 = (class17) var70.method3322()) {
                            class40 var72 = class40.method548(var71.field273);
                            if (field638 == 1) {
                                method1395(class134.field2232, field639 + " " + class2.field21 + " " + class2.method1(16748608) + var72.field989, 16, var71.field273, var52, var53);
                            } else if (!field610) {
                                String[] var73 = var72.field1001;
                                if (field512) {
                                    var73 = method2129(var73);
                                }
                                for (int var74 = 4; var74 >= 0; var74--) {
                                    if (var73 != null && var73[var74] != null) {
                                        byte var75 = 0;
                                        if (var74 == 0) {
                                            var75 = 18;
                                        }
                                        if (var74 == 1) {
                                            var75 = 19;
                                        }
                                        if (var74 == 2) {
                                            var75 = 20;
                                        }
                                        if (var74 == 3) {
                                            var75 = 21;
                                        }
                                        if (var74 == 4) {
                                            var75 = 22;
                                        }
                                        method1395(var73[var74], class2.method1(16748608) + var72.field989, var75, var71.field273, var52, var53);
                                    } else if (var74 == 2) {
                                        method1395(class134.field2102, class2.method1(16748608) + var72.field989, 20, var71.field273, var52, var53);
                                    }
                                }
                                method1395(class134.field2233, class2.method1(16748608) + var72.field989, 1004, var71.field273, var52, var53);
                            } else if ((Statics.field1524 & 0x1) == 1) {
                                method1395(field642, field595 + " " + class2.field21 + " " + class2.method1(16748608) + var72.field989, 17, var71.field273, var52, var53);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.aq(ZI)V")
    public static final void method246(boolean arg0) {
        if (Statics.field139.field429 >> 7 == field716 && Statics.field139.field423 >> 7 == field717) {
            field716 = 0;
        }
        int var1 = field605;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field139;
                var4 = 33538048;
            } else {
                var3 = field604[field525[var2]];
                var4 = field525[var2] << 14;
            }
            if (var3 != null && var3.method26()) {
                var3.field49 = false;
                if ((field733 && field605 > 50 || field605 > 200) && !arg0 && var3.field474 == var3.field427) {
                    var3.field49 = true;
                }
                int var5 = var3.field429 >> 7;
                int var6 = var3.field423 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field44 == null || field491 < var3.field34 || field491 >= var3.field40) {
                        if ((var3.field429 & 0x7F) == 64 && (var3.field423 & 0x7F) == 64) {
                            if (field725 == field587[var5][var6]) {
                                continue;
                            }
                            field587[var5][var6] = field725;
                        }
                        var3.field46 = method580(var3.field429, var3.field423, Statics.field379);
                        Statics.field419.method1924(Statics.field379, var3.field429, var3.field423, var3.field46, 60, var3, var3.field433, var4, var3.field425);
                    } else {
                        var3.field49 = false;
                        var3.field46 = method580(var3.field429, var3.field423, Statics.field379);
                        Statics.field419.method1883(Statics.field379, var3.field429, var3.field423, var3.field46, 60, var3, var3.field433, var4, var3.field45, var3.field39, var3.field47, var3.field48);
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.ac(ZI)V")
    public static final void method825(boolean arg0) {
        for (int var1 = 0; var1 < field726; var1++) {
            class25 var2 = field632[field487[var1]];
            int var3 = (field487[var1] << 14) + 536870912;
            if (var2 != null && var2.method26() && var2.field396.field809 == arg0 && var2.field396.method611()) {
                int var4 = var2.field429 >> 7;
                int var5 = var2.field423 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field462 == 1 && (var2.field429 & 0x7F) == 64 && (var2.field423 & 0x7F) == 64) {
                        if (field725 == field587[var4][var5]) {
                            continue;
                        }
                        field587[var4][var5] = field725;
                    }
                    if (!var2.field396.field817) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field419.method1924(Statics.field379, var2.field429, var2.field423, method580(var2.field429 + (var2.field462 * 64 - 64), var2.field423 + (var2.field462 * 64 - 64), Statics.field379), var2.field462 * 64 - 64 + 60, var2, var2.field433, var3, var2.field425);
                }
            }
        }
    }

    @ObfuscatedName("al.al(I)I")
    public static final int method913() {
        if (Statics.field156.field187) {
            return Statics.field379;
        }
        int var0 = 3;
        if (Statics.field398 < 310) {
            int var1 = Statics.field350 >> 7;
            int var2 = Statics.field284 >> 7;
            int var3 = Statics.field139.field429 >> 7;
            int var4 = Statics.field139.field423 >> 7;
            if ((class9.field122[Statics.field379][var1][var2] & 0x4) != 0) {
                var0 = Statics.field379;
            }
            int var5;
            if (var3 > var1) {
                var5 = var3 - var1;
            } else {
                var5 = var1 - var3;
            }
            int var6;
            if (var4 > var2) {
                var6 = var4 - var2;
            } else {
                var6 = var2 - var4;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var1 < var3) {
                        var1++;
                    } else if (var1 > var3) {
                        var1--;
                    }
                    if ((class9.field122[Statics.field379][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field379;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class9.field122[Statics.field379][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field379;
                        }
                    }
                }
            } else {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var2 < var4) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class9.field122[Statics.field379][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field379;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class9.field122[Statics.field379][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field379;
                        }
                    }
                }
            }
        }
        if ((class9.field122[Statics.field379][Statics.field139.field429 >> 7][Statics.field139.field423 >> 7] & 0x4) != 0) {
            var0 = Statics.field379;
        }
        return var0;
    }

    @ObfuscatedName("cr.ag(I)I")
    public static final int method1868() {
        if (Statics.field156.field187) {
            return Statics.field379;
        } else {
            int var0 = method580(Statics.field350, Statics.field284, Statics.field379);
            return var0 - Statics.field375 >= 800 || (class9.field122[Statics.field379][Statics.field350 >> 7][Statics.field284 >> 7] & 0x4) == 0 ? 3 : Statics.field379;
        }
    }

    @ObfuscatedName("y.ap(III)V")
    public static final void method242(int arg0, int arg1) {
        if (field499 == 2) {
            method9((field560 - Statics.field1518 << 7) + field505, (field602 - Statics.field1830 << 7) + field506, field480 * 2);
            if (field589 > -1 && field491 % 20 < 10) {
                Statics.field95[0].method1700(field589 + arg0 - 12, field707 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("x.am(I)V")
    public static final void method251() {
        field603 = 0;
        int var0 = (Statics.field139.field429 >> 7) + Statics.field1518;
        int var1 = (Statics.field139.field423 >> 7) + Statics.field1830;
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

    @ObfuscatedName("t.as(Lao;IS)V")
    public static final void method34(class27 arg0, int arg1) {
        method9(arg0.field429, arg0.field423, arg1);
    }

    @ObfuscatedName("w.aj(IIII)V")
    public static final void method9(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field589 = -1;
            field707 = -1;
            return;
        }
        int var3 = method580(arg0, arg1, Statics.field379) - arg2;
        int var4 = arg0 - Statics.field350;
        int var5 = var3 - Statics.field375;
        int var6 = arg1 - Statics.field284;
        int var7 = class104.field1787[Statics.field398];
        int var8 = class104.field1788[Statics.field398];
        int var9 = class104.field1787[Statics.field264];
        int var10 = class104.field1788[Statics.field264];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field589 = (var11 << 9) / var15 + 256;
            field707 = (var14 << 9) / var15 + 167;
        } else {
            field589 = -1;
            field707 = -1;
        }
    }

    @ObfuscatedName("ah.ar(IIII)I")
    public static final int method580(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field122[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field115[var5][var3][var4] + class9.field115[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field115[var5][var3][var4 + 1] + class9.field115[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cl.au(IIIIIIB)V")
    public static final void method2040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class104.field1787[var6];
            int var12 = class104.field1788[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class104.field1787[var7];
            int var15 = class104.field1788[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field350 = arg0 - var8;
        Statics.field375 = arg1 - var9;
        Statics.field284 = arg2 - var10;
        Statics.field398 = arg3;
        Statics.field264 = arg4;
    }

    @ObfuscatedName("q.ad(ZI)V")
    public static final void method227(boolean arg0) {
        field540 = arg0;
        if (!field540) {
            int var1 = field522.method2477();
            int var2 = field522.method2483();
            int var3 = (field612 - field522.field2045) / 16;
            Statics.field2710 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2710[var4][var5] = field522.method2494();
                }
            }
            int var6 = field522.method2483();
            int var7 = field522.method2615();
            int var8 = field522.method2484();
            Statics.field2464 = new int[var3];
            Statics.field94 = new int[var3];
            Statics.field1 = new int[var3];
            Statics.field2046 = new byte[var3][];
            Statics.field366 = new byte[var3][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field2464[var10] = var13;
                        Statics.field94[var10] = Statics.field2450.method2985("m" + var11 + "_" + var12);
                        Statics.field1[var10] = Statics.field2450.method2985("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method43(var8, var2, var1, var6, var7);
            return;
        }
        int var14 = field522.method2483();
        int var15 = field522.method2477();
        field522.method2344();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field522.method2328(1);
                    if (var19 == 1) {
                        field541[var16][var17][var18] = field522.method2328(26);
                    } else {
                        field541[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field522.method2329();
        int var20 = (field612 - field522.field2045) / 16;
        Statics.field2710 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field2710[var21][var22] = field522.method2494();
            }
        }
        int var23 = field522.method2483();
        int var24 = field522.method2484();
        int var25 = field522.method2484();
        Statics.field2464 = new int[var20];
        Statics.field94 = new int[var20];
        Statics.field1 = new int[var20];
        Statics.field2046 = new byte[var20][];
        Statics.field366 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field541[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2464[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2464[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field94[var26] = Statics.field2450.method2985("m" + var35 + "_" + var36);
                            Statics.field1[var26] = Statics.field2450.method2985("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method43(var25, var24, var15, var14, var23);
    }

    @ObfuscatedName("d.az(IIIIII)V")
    public static final void method43(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field747 == arg0 && Statics.field740 == arg1 && field532 == arg2 || !field733) {
            return;
        }
        Statics.field747 = arg0;
        Statics.field740 = arg1;
        field532 = arg2;
        if (!field733) {
            field532 = 0;
        }
        method241(25);
        method547(class134.field2098, true);
        int var5 = Statics.field1518;
        int var6 = Statics.field1830;
        Statics.field1518 = (arg0 - 6) * 8;
        Statics.field1830 = (arg1 - 6) * 8;
        int var7 = Statics.field1518 - var5;
        int var8 = Statics.field1830 - var6;
        int var9 = Statics.field1518;
        int var10 = Statics.field1830;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field632[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field443[var13] -= var7;
                    var12.field449[var13] -= var8;
                }
                var12.field429 -= var7 * 128;
                var12.field423 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field604[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field443[var16] -= var7;
                    var15.field449[var16] -= var8;
                }
                var15.field429 -= var7 * 128;
                var15.field423 -= var8 * 128;
            }
        }
        Statics.field379 = arg2;
        Statics.field139.method267(arg3, arg4, false);
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
                        field519[var27][var23][var24] = field519[var27][var25][var26];
                    } else {
                        field519[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field619.method3294(); var28 != null; var28 = (class22) field619.method3296()) {
            var28.field356 -= var7;
            var28.field357 -= var8;
            if (var28.field356 < 0 || var28.field357 < 0 || var28.field356 >= 104 || var28.field357 >= 104) {
                var28.method3328();
            }
        }
        if (field716 != 0) {
            field716 -= var7;
            field717 -= var8;
        }
        field548 = 0;
        field731 = false;
        field711 = -1;
        field621.method3288();
        field620.method3288();
    }

    @ObfuscatedName("bw.ay(ZB)V")
    public static final void method1353(boolean arg0) {
        method736();
        field670++;
        if (field670 < 50 && !arg0) {
            return;
        }
        field670 = 0;
        if (field531 || Statics.field307 == null) {
            return;
        }
        field520.method2325(217);
        try {
            Statics.field307.method1366(field520.field2049, 0, field520.field2045);
            field520.field2045 = 0;
        } catch (IOException var2) {
            field531 = true;
        }
    }

    @ObfuscatedName("r.bh(IIIIIB)V")
    public static final void method60(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field419.method1887(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field419.method1901(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field259.field1471;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method2660(var12);
            if (var13.field850 == -1) {
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
                class87 var14 = Statics.field1230[var13.field850];
                if (var14 != null) {
                    int var15 = (var13.field836 * 4 - var14.field1476) / 2;
                    int var16 = (var13.field837 * 4 - var14.field1478) / 2;
                    var14.method1781(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field837) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field419.method1899(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field419.method1901(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method2660(var21);
            if (var22.field850 != -1) {
                class87 var23 = Statics.field1230[var22.field850];
                if (var23 != null) {
                    int var24 = (var22.field836 * 4 - var23.field1476) / 2;
                    int var25 = (var22.field837 * 4 - var23.field1478) / 2;
                    var23.method1781(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field837) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field259.field1471;
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
        int var29 = Statics.field419.method1900(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method2660(var30);
        if (var31.field850 == -1) {
            return;
        }
        class87 var32 = Statics.field1230[var31.field850];
        if (var32 != null) {
            int var33 = (var31.field836 * 4 - var32.field1476) / 2;
            int var34 = (var31.field837 * 4 - var32.field1478) / 2;
            var32.method1781(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field837) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("cn.ba(IIII)Z")
    public static final boolean method2128(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field419.method1901(Statics.field379, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method2660(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field836;
                var9 = var7.field837;
            } else {
                var8 = var7.field837;
                var9 = var7.field836;
            }
            int var10 = var7.field859;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method1409(Statics.field139.field443[0], Statics.field139.field449[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method1409(Statics.field139.field443[0], Statics.field139.field449[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field507 = class77.field1398;
        field592 = class77.field1385;
        field594 = 2;
        field593 = 0;
        return true;
    }

    @ObfuscatedName("bo.bn(IIIIZIIIIIII)Z")
    public static final boolean method1409(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field544[var11][var12] = 0;
                field502[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field544[arg0][arg1] = 99;
        field502[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field667[var15] = arg0;
        int var36 = var15 + 1;
        field547[var15] = arg1;
        boolean var17 = false;
        int var18 = field667.length;
        int[][] var19 = field572[Statics.field379].field2731;
        while (var36 != var16) {
            var13 = field667[var16];
            var14 = field547[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field572[Statics.field379].method3199(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field572[Statics.field379].method3205(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field572[Statics.field379].method3228(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field502[var13][var14] + 1;
            if (var13 > 0 && field544[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field667[var36] = var13 - 1;
                field547[var36] = var14;
                var36 = (var36 + 1) % var18;
                field544[var13 - 1][var14] = 2;
                field502[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field544[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field667[var36] = var13 + 1;
                field547[var36] = var14;
                var36 = (var36 + 1) % var18;
                field544[var13 + 1][var14] = 8;
                field502[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field544[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field667[var36] = var13;
                field547[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field544[var13][var14 - 1] = 1;
                field502[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field544[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field667[var36] = var13;
                field547[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field544[var13][var14 + 1] = 4;
                field502[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field544[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field667[var36] = var13 - 1;
                field547[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field544[var13 - 1][var14 - 1] = 3;
                field502[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field544[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field667[var36] = var13 + 1;
                field547[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field544[var13 + 1][var14 - 1] = 9;
                field502[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field544[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field667[var36] = var13 - 1;
                field547[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field544[var13 - 1][var14 + 1] = 6;
                field502[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field544[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field667[var36] = var13 + 1;
                field547[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field544[var13 + 1][var14 + 1] = 12;
                field502[var13 + 1][var14 + 1] = var20;
            }
        }
        field739 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field502[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field502[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field502[var24][var25];
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
            field739 = 1;
        }
        byte var29 = 0;
        field667[var29] = var13;
        int var37 = var29 + 1;
        field547[var29] = var14;
        int var30;
        int var31 = var30 = field544[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field667[var37] = var13;
                field547[var37++] = var14;
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
            var31 = field544[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field667[var37];
            int var34 = field547[var37];
            if (arg10 == 0) {
                field520.method2325(166);
                field520.method2438(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field520.method2325(76);
                field520.method2438(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field520.method2325(117);
                field520.method2438(var32 + var32 + 3);
            }
            field716 = field667[0];
            field717 = field547[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field520.method2452(field667[var37] - var33);
                field520.method2474(field547[var37] - var34);
            }
            field520.method2481(Statics.field1830 + var34);
            field520.method2474(class75.field1358[82] ? 1 : 0);
            field520.method2585(Statics.field1518 + var33);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("cq.bj(I)Z")
    public static final boolean method1579() {
        if (Statics.field307 == null) {
            return false;
        }
        try {
            int var0 = Statics.field307.method1365();
            if (var0 == 0) {
                return false;
            }
            if (field524 == -1) {
                Statics.field307.method1388(field522.field2049, 0, 1);
                field522.field2045 = 0;
                field524 = field522.method2326();
                field612 = class165.field2772[field524];
                var0--;
            }
            if (field612 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field307.method1388(field522.field2049, 0, 1);
                field612 = field522.field2049[0] & 0xFF;
                var0--;
            }
            if (field612 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field307.method1388(field522.field2049, 0, 2);
                field522.field2045 = 0;
                field612 = field522.method2615();
                var0 -= 2;
            }
            if (var0 < field612) {
                return false;
            }
            field522.field2045 = 0;
            Statics.field307.method1388(field522.field2049, 0, field612);
            field566 = 0;
            field489 = field729;
            field729 = field528;
            field528 = field524;
            if (field524 == 197) {
                field624 = 0;
                field607 = 0;
                field522.method2344();
                int var1 = field522.method2328(8);
                if (var1 < field726) {
                    for (int var2 = var1; var2 < field726; var2++) {
                        field486[++field624 - 1] = field487[var2];
                    }
                }
                if (var1 > field726) {
                    throw new RuntimeException("");
                }
                field726 = 0;
                for (int var3 = 0; var3 < var1; var3++) {
                    int var4 = field487[var3];
                    class25 var5 = field632[var4];
                    int var6 = field522.method2328(1);
                    if (var6 == 0) {
                        field487[++field726 - 1] = var4;
                        var5.field468 = field491;
                    } else {
                        int var7 = field522.method2328(2);
                        if (var7 == 0) {
                            field487[++field726 - 1] = var4;
                            var5.field468 = field491;
                            field608[++field607 - 1] = var4;
                        } else if (var7 == 1) {
                            field487[++field726 - 1] = var4;
                            var5.field468 = field491;
                            int var8 = field522.method2328(3);
                            var5.method258(var8, false);
                            int var9 = field522.method2328(1);
                            if (var9 == 1) {
                                field608[++field607 - 1] = var4;
                            }
                        } else if (var7 == 2) {
                            field487[++field726 - 1] = var4;
                            var5.field468 = field491;
                            int var10 = field522.method2328(3);
                            var5.method258(var10, true);
                            int var11 = field522.method2328(3);
                            var5.method258(var11, true);
                            int var12 = field522.method2328(1);
                            if (var12 == 1) {
                                field608[++field607 - 1] = var4;
                            }
                        } else if (var7 == 3) {
                            field486[++field624 - 1] = var4;
                        }
                    }
                }
                while (field522.method2327(field612) >= 27) {
                    int var13 = field522.method2328(15);
                    if (var13 == 32767) {
                        break;
                    }
                    boolean var14 = false;
                    if (field632[var13] == null) {
                        field632[var13] = new class25();
                        var14 = true;
                    }
                    class25 var15 = field632[var13];
                    field487[++field726 - 1] = var13;
                    var15.field468 = field491;
                    int var16 = field522.method2328(5);
                    if (var16 > 15) {
                        var16 -= 32;
                    }
                    int var17 = field522.method2328(5);
                    if (var17 > 15) {
                        var17 -= 32;
                    }
                    var15.field396 = class31.method232(field522.method2328(14));
                    int var18 = field643[field522.method2328(3)];
                    if (var14) {
                        var15.field470 = var15.field433 = var18;
                    }
                    int var19 = field522.method2328(1);
                    int var20 = field522.method2328(1);
                    if (var20 == 1) {
                        field608[++field607 - 1] = var13;
                    }
                    var15.field462 = var15.field396.field785;
                    var15.field472 = var15.field396.field801;
                    if (var15.field472 == 0) {
                        var15.field433 = 0;
                    }
                    var15.field430 = var15.field396.field796;
                    var15.field478 = var15.field396.field797;
                    var15.field424 = var15.field396.field798;
                    var15.field434 = var15.field396.field799;
                    var15.field427 = var15.field396.field790;
                    var15.field428 = var15.field396.field808;
                    var15.field438 = var15.field396.field795;
                    var15.method267(Statics.field139.field443[0] + var17, Statics.field139.field449[0] + var16, var19 == 1);
                }
                field522.method2329();
                for (int var21 = 0; var21 < field607; var21++) {
                    int var22 = field608[var21];
                    class25 var23 = field632[var22];
                    int var24 = field522.method2472();
                    if ((var24 & 0x2) != 0) {
                        var23.field476 = field522.method2483();
                        var23.field447 = field522.method2484();
                    }
                    if ((var24 & 0x10) != 0) {
                        int var25 = field522.method2472();
                        int var26 = field522.method2475();
                        var23.method256(var25, var26, field491);
                        var23.field442 = field491 + 300;
                        var23.field432 = field522.method2559();
                        var23.field426 = field522.method2472();
                    }
                    if ((var24 & 0x80) != 0) {
                        var23.field396 = class31.method232(field522.method2593());
                        var23.field462 = var23.field396.field785;
                        var23.field472 = var23.field396.field801;
                        var23.field430 = var23.field396.field796;
                        var23.field478 = var23.field396.field797;
                        var23.field424 = var23.field396.field798;
                        var23.field434 = var23.field396.field799;
                        var23.field427 = var23.field396.field790;
                        var23.field428 = var23.field396.field808;
                        var23.field438 = var23.field396.field795;
                    }
                    if ((var24 & 0x40) != 0) {
                        var23.field435 = field522.method2460();
                        var23.field436 = 100;
                    }
                    if ((var24 & 0x1) != 0) {
                        int var27 = field522.method2559();
                        int var28 = field522.method2472();
                        var23.method256(var27, var28, field491);
                        var23.field442 = field491 + 300;
                        var23.field432 = field522.method2475();
                        var23.field426 = field522.method2472();
                    }
                    if ((var24 & 0x8) != 0) {
                        var23.field456 = field522.method2483();
                        int var29 = field522.method2457();
                        var23.field431 = var29 >> 16;
                        var23.field459 = (var29 & 0xFFFF) + field491;
                        var23.field475 = 0;
                        var23.field458 = 0;
                        if (var23.field459 > field491) {
                            var23.field475 = -1;
                        }
                        if (var23.field456 == 65535) {
                            var23.field456 = -1;
                        }
                    }
                    if ((var24 & 0x4) != 0) {
                        int var30 = field522.method2593();
                        if (var30 == 65535) {
                            var30 = -1;
                        }
                        int var31 = field522.method2477();
                        if (var23.field451 == var30 && var30 != -1) {
                            int var32 = class34.method235(var30).field902;
                            if (var32 == 1) {
                                var23.field452 = 0;
                                var23.field453 = 0;
                                var23.field454 = var31;
                                var23.field422 = 0;
                            }
                            if (var32 == 2) {
                                var23.field422 = 0;
                            }
                        } else if (var30 == -1 || var23.field451 == -1 || class34.method235(var30).field896 >= class34.method235(var23.field451).field896) {
                            var23.field451 = var30;
                            var23.field452 = 0;
                            var23.field453 = 0;
                            var23.field454 = var31;
                            var23.field422 = 0;
                            var23.field473 = var23.field448;
                        }
                    }
                    if ((var24 & 0x20) != 0) {
                        var23.field445 = field522.method2484();
                        if (var23.field445 == 65535) {
                            var23.field445 = -1;
                        }
                    }
                }
                for (int var33 = 0; var33 < field624; var33++) {
                    int var34 = field486[var33];
                    if (field491 != field632[var34].field468) {
                        field632[var34].field396 = null;
                        field632[var34] = null;
                    }
                }
                if (field612 != field522.field2045) {
                    throw new RuntimeException(field522.field2045 + class2.field17 + field612);
                }
                for (int var35 = 0; var35 < field726; var35++) {
                    if (field632[field487[var35]] == null) {
                        throw new RuntimeException(var35 + class2.field17 + field726);
                    }
                }
                field524 = -1;
                return true;
            }
            if (field524 == 212) {
                method545();
                field559 = field522.method2455();
                field677 = field682;
                field524 = -1;
                return true;
            }
            if (field524 == 233) {
                field716 = 0;
                field524 = -1;
                return true;
            }
            if (field524 == 214) {
                int var36 = field522.method2563();
                int var37 = field522.method2593();
                if (var37 == 65535) {
                    var37 = -1;
                }
                int var38 = field522.method2494();
                int var39 = field522.method2483();
                if (var39 == 65535) {
                    var39 = -1;
                }
                for (int var40 = var37; var40 <= var39; var40++) {
                    long var41 = ((long) var36 << 32) + (long) var40;
                    class179 var43 = field684.method3273(var41);
                    if (var43 != null) {
                        var43.method3328();
                    }
                    field684.method3278(new class171(var38), var41);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 207) {
                int var44 = field522.method2615();
                int var45 = field522.method2457();
                int var46 = field522.method2593();
                int var47 = field522.method2484();
                class158 var48 = class158.method2658(var45);
                if (var48.field2647 != var44 || var48.field2618 != var46 || var48.field2680 != var47) {
                    var48.field2647 = var44;
                    var48.field2618 = var46;
                    var48.field2680 = var47;
                    method1610(var48);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 37) {
                field731 = true;
                Statics.field210 = field522.method2472();
                Statics.field417 = field522.method2472();
                Statics.field74 = field522.method2615();
                Statics.field79 = field522.method2472();
                Statics.field1207 = field522.method2472();
                if (Statics.field1207 >= 100) {
                    Statics.field350 = Statics.field210 * 128 + 64;
                    Statics.field284 = Statics.field417 * 128 + 64;
                    Statics.field375 = method580(Statics.field350, Statics.field284, Statics.field379) - Statics.field74;
                }
                field524 = -1;
                return true;
            }
            if (field524 == 126) {
                while (field522.field2045 < field612) {
                    boolean var49 = field522.method2472() == 1;
                    String var50 = field522.method2460();
                    String var51 = field522.method2460();
                    int var52 = field522.method2615();
                    int var53 = field522.method2472();
                    int var54 = field522.method2472();
                    boolean var55 = (var54 & 0x2) != 0;
                    boolean var56 = (var54 & 0x1) != 0;
                    if (var52 > 0) {
                        field522.method2460();
                        field522.method2472();
                        field522.method2457();
                    }
                    field522.method2460();
                    for (int var57 = 0; var57 < field737; var57++) {
                        class23 var58 = field533[var57];
                        if (var49) {
                            if (var51.equals(var58.field382)) {
                                var58.field382 = var50;
                                var58.field370 = var51;
                                var50 = null;
                                break;
                            }
                        } else if (var50.equals(var58.field382)) {
                            if (var58.field371 != var52) {
                                boolean var59 = true;
                                for (class28 var60 = (class28) field681.method3267(); var60 != null; var60 = (class28) field681.method3262()) {
                                    if (var60.field750.equals(var50)) {
                                        if (var52 != 0 && var60.field752 == 0) {
                                            var60.method3324();
                                            var59 = false;
                                        } else if (var52 == 0 && var60.field752 != 0) {
                                            var60.method3324();
                                            var59 = false;
                                        }
                                    }
                                }
                                if (var59) {
                                    field681.method3261(new class28(var50, var52));
                                }
                                var58.field371 = var52;
                            }
                            var58.field370 = var51;
                            var58.field372 = var53;
                            var58.field373 = var55;
                            var58.field369 = var56;
                            var50 = null;
                            break;
                        }
                    }
                    if (var50 != null && field737 < 400) {
                        class23 var61 = new class23();
                        field533[field737] = var61;
                        var61.field382 = var50;
                        var61.field370 = var51;
                        var61.field371 = var52;
                        var61.field372 = var53;
                        var61.field373 = var55;
                        var61.field369 = var56;
                        field737++;
                    }
                }
                field738 = 2;
                field675 = field682;
                boolean var62 = false;
                int var63 = field737;
                while (var63 > 0) {
                    boolean var64 = true;
                    var63--;
                    for (int var65 = 0; var65 < var63; var65++) {
                        boolean var66 = false;
                        class23 var67 = field533[var65];
                        class23 var68 = field533[var65 + 1];
                        if (field702 != var67.field371 && field702 == var68.field371) {
                            var66 = true;
                        }
                        if (!var66 && var67.field371 == 0 && var68.field371 != 0) {
                            var66 = true;
                        }
                        if (!var66 && !var67.field373 && var68.field373) {
                            var66 = true;
                        }
                        if (!var66 && !var67.field369 && var68.field369) {
                            var66 = true;
                        }
                        if (var66) {
                            class23 var69 = field533[var65];
                            field533[var65] = field533[var65 + 1];
                            field533[var65 + 1] = var69;
                            var64 = false;
                        }
                    }
                    if (var64) {
                        break;
                    }
                }
                field524 = -1;
                return true;
            }
            if (field524 == 102) {
                int var70 = field522.method2457();
                int var71 = field522.method2615();
                if (var70 < -70000) {
                    var71 += 32768;
                }
                class158 var72;
                if (var70 >= 0) {
                    var72 = class158.method2658(var70);
                } else {
                    var72 = null;
                }
                if (var72 != null) {
                    for (int var73 = 0; var73 < var72.field2638.length; var73++) {
                        var72.field2638[var73] = 0;
                        var72.field2592[var73] = 0;
                    }
                }
                class19 var74 = (class19) class19.field291.method3273((long) var71);
                if (var74 != null) {
                    for (int var75 = 0; var75 < var74.field288.length; var75++) {
                        var74.field288[var75] = -1;
                        var74.field289[var75] = 0;
                    }
                }
                int var76 = field522.method2615();
                for (int var77 = 0; var77 < var76; var77++) {
                    int var78 = field522.method2615();
                    int var79 = field522.method2472();
                    if (var79 == 255) {
                        var79 = field522.method2457();
                    }
                    if (var72 != null && var77 < var72.field2638.length) {
                        var72.field2638[var77] = var78;
                        var72.field2592[var77] = var79;
                    }
                    class19.method783(var71, var77, var78 - 1, var79);
                }
                if (var72 != null) {
                    method1610(var72);
                }
                method545();
                field579[++field671 - 1 & 0x1F] = var71 & 0x7FFF;
                field524 = -1;
                return true;
            }
            if (field524 == 68) {
                int var80 = field522.method2436();
                Statics.field306 = Statics.field293.method1481(var80);
                field524 = -1;
                return true;
            }
            if (field524 == 53) {
                int var81 = field522.method2615();
                int var82 = field522.method2436();
                class158 var83 = class158.method2658(var82);
                if (var83.field2609 != 1 || var83.field2610 != var81) {
                    var83.field2609 = 1;
                    var83.field2610 = var81;
                    method1610(var83);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 44) {
                field738 = 1;
                field675 = field682;
                field524 = -1;
                return true;
            }
            if (field524 == 216) {
                int var84 = field522.method2457();
                class4 var85 = (class4) field645.method3273((long) var84);
                if (var85 != null) {
                    method61(var85, true);
                }
                if (field648 != null) {
                    method1610(field648);
                    field648 = null;
                }
                field524 = -1;
                return true;
            }
            if (field524 == 78) {
                int var86 = field522.method2615();
                int var87 = field522.method2436();
                int var88 = field522.method2483();
                class158 var89 = class158.method2658(var87);
                var89.field2602 = (var88 << 16) + var86;
                field524 = -1;
                return true;
            }
            if (field524 == 131) {
                field586 = field522.method2615() * 30;
                field677 = field682;
                field524 = -1;
                return true;
            }
            if (field524 == 86) {
                String var90 = field522.method2460();
                int var91 = field522.method2615();
                byte var92 = field522.method2453();
                boolean var93 = false;
                if (var92 == -128) {
                    var93 = true;
                }
                if (var93) {
                    if (Statics.field1189 == 0) {
                        field524 = -1;
                        return true;
                    }
                    boolean var94 = false;
                    int var95;
                    for (var95 = 0; var95 < Statics.field1189 && (!Statics.field1027[var95].field113.equals(var90) || Statics.field1027[var95].field110 != var91); var95++) {
                    }
                    if (var95 < Statics.field1189) {
                        while (var95 < Statics.field1189 - 1) {
                            Statics.field1027[var95] = Statics.field1027[var95 + 1];
                            var95++;
                        }
                        Statics.field1189--;
                        Statics.field1027[Statics.field1189] = null;
                    }
                } else {
                    field522.method2460();
                    class8 var96 = new class8();
                    var96.field113 = var90;
                    var96.field104 = class148.method122(var96.field113, Statics.field76);
                    var96.field110 = var91;
                    var96.field106 = var92;
                    int var97;
                    for (var97 = Statics.field1189 - 1; var97 >= 0; var97--) {
                        int var98 = Statics.field1027[var97].field104.compareTo(var96.field113);
                        if (var98 == 0) {
                            Statics.field1027[var97].field110 = var91;
                            Statics.field1027[var97].field106 = var92;
                            if (var90.equals(Statics.field139.field36)) {
                                Statics.field2355 = var92;
                            }
                            field676 = field682;
                            field524 = -1;
                            return true;
                        }
                        if (var98 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1189 >= Statics.field1027.length) {
                        field524 = -1;
                        return true;
                    }
                    for (int var99 = Statics.field1189 - 1; var99 > var97; var99--) {
                        Statics.field1027[var99 + 1] = Statics.field1027[var99];
                    }
                    if (Statics.field1189 == 0) {
                        Statics.field1027 = new class8[100];
                    }
                    Statics.field1027[var97 + 1] = var96;
                    Statics.field1189++;
                    if (var90.equals(Statics.field139.field36)) {
                        Statics.field2355 = var92;
                    }
                }
                field676 = field682;
                field524 = -1;
                return true;
            }
            if (field524 == 40) {
                int var100 = field522.method2457();
                int var101 = field522.method2615();
                if (var100 < -70000) {
                    var101 += 32768;
                }
                class158 var102;
                if (var100 >= 0) {
                    var102 = class158.method2658(var100);
                } else {
                    var102 = null;
                }
                while (field522.field2045 < field612) {
                    int var103 = field522.method2465();
                    int var104 = field522.method2615();
                    int var105 = 0;
                    if (var104 != 0) {
                        var105 = field522.method2472();
                        if (var105 == 255) {
                            var105 = field522.method2457();
                        }
                    }
                    if (var102 != null && var103 >= 0 && var103 < var102.field2638.length) {
                        var102.field2638[var103] = var104;
                        var102.field2592[var103] = var105;
                    }
                    class19.method783(var101, var103, var104 - 1, var105);
                }
                if (var102 != null) {
                    method1610(var102);
                }
                method545();
                field579[++field671 - 1 & 0x1F] = var101 & 0x7FFF;
                field524 = -1;
                return true;
            }
            if (field524 == 188) {
                int var106 = field522.method2475();
                int var107 = field522.method2477();
                int var108 = field522.method2472();
                Statics.field379 = var106 >> 1;
                Statics.field139.method267(var108, var107, (var106 & 0x1) == 1);
                field524 = -1;
                return true;
            }
            if (field524 == 232) {
                int var109 = field522.method2615();
                class19.method2214(var109);
                field579[++field671 - 1 & 0x1F] = var109 & 0x7FFF;
                field524 = -1;
                return true;
            }
            if (field524 == 38) {
                method545();
                field649 = field522.method2472();
                field677 = field682;
                field524 = -1;
                return true;
            }
            if (field524 == 23) {
                method227(true);
                field524 = -1;
                return true;
            }
            if (field524 == 244) {
                while (field522.field2045 < field612) {
                    int var110 = field522.method2472();
                    boolean var111 = (var110 & 0x1) == 1;
                    String var112 = field522.method2460();
                    String var113 = field522.method2460();
                    field522.method2460();
                    for (int var114 = 0; var114 < field535; var114++) {
                        class11 var115 = field742[var114];
                        if (var111) {
                            if (var113.equals(var115.field178)) {
                                var115.field178 = var112;
                                var115.field179 = var113;
                                var112 = null;
                                break;
                            }
                        } else if (var112.equals(var115.field178)) {
                            var115.field178 = var112;
                            var115.field179 = var113;
                            var112 = null;
                            break;
                        }
                    }
                    if (var112 != null && field535 < 400) {
                        class11 var116 = new class11();
                        field742[field535] = var116;
                        var116.field178 = var112;
                        var116.field179 = var113;
                        field535++;
                    }
                }
                field675 = field682;
                field524 = -1;
                return true;
            }
            if (field524 == 210) {
                int var117 = field522.method2483();
                int var118 = field522.method2563();
                class158 var119 = class158.method2658(var118);
                if (var119.field2609 != 2 || var119.field2610 != var117) {
                    var119.field2609 = 2;
                    var119.field2610 = var117;
                    method1610(var119);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 90) {
                for (int var120 = 0; var120 < class159.field2697.length; var120++) {
                    if (class159.field2697[var120] != class159.field2695[var120]) {
                        class159.field2697[var120] = class159.field2695[var120];
                        method228(var120);
                        field668[++field669 - 1 & 0x1F] = var120;
                    }
                }
                field524 = -1;
                return true;
            }
            if (field524 == 1) {
                Statics.field479 = field522.method2475();
                Statics.field308 = field522.method2559();
                for (int var121 = Statics.field479; var121 < Statics.field479 + 8; var121++) {
                    for (int var122 = Statics.field308; var122 < Statics.field308 + 8; var122++) {
                        if (field519[Statics.field379][var121][var122] != null) {
                            field519[Statics.field379][var121][var122] = null;
                            method2035(var121, var122);
                        }
                    }
                }
                for (class22 var123 = (class22) field619.method3294(); var123 != null; var123 = (class22) field619.method3296()) {
                    if (var123.field356 >= Statics.field479 && var123.field356 < Statics.field479 + 8 && var123.field357 >= Statics.field308 && var123.field357 < Statics.field308 + 8 && Statics.field379 == var123.field368) {
                        var123.field365 = 0;
                    }
                }
                field524 = -1;
                return true;
            }
            if (field524 == 69) {
                int var124 = field522.method2484();
                field644 = var124;
                method100(var124);
                class26.method161(field644);
                for (int var125 = 0; var125 < 100; var125++) {
                    field687[var125] = true;
                }
                field524 = -1;
                return true;
            }
            if (field524 == 56) {
                int var126 = field522.method2593();
                int var127 = field522.method2563();
                class158 var128 = class158.method2658(var127);
                if (var128 != null && var128.field2665 == 0) {
                    if (var126 > var128.field2593 - var128.field2587) {
                        var126 = var128.field2593 - var128.field2587;
                    }
                    if (var126 < 0) {
                        var126 = 0;
                    }
                    if (var128.field2656 != var126) {
                        var128.field2656 = var126;
                        method1610(var128);
                    }
                }
                field524 = -1;
                return true;
            }
            if (field524 == 63) {
                String var129 = field522.method2460();
                long var130 = field522.method2564();
                long var132 = (long) field522.method2615();
                long var134 = (long) field522.method2608();
                int var136 = field522.method2472();
                long var137 = (var132 << 32) + var134;
                boolean var139 = false;
                for (int var140 = 0; var140 < 100; var140++) {
                    if (field703[var140] == var137) {
                        var139 = true;
                        break;
                    }
                }
                if (var136 <= 1 && method46(var129)) {
                    var139 = true;
                }
                if (!var139 && field603 == 0) {
                    field703[field685] = var137;
                    field685 = (field685 + 1) % 100;
                    class116 var141 = field522;
                    String var145;
                    try {
                        int var142 = var141.method2465();
                        if (var142 > 32767) {
                            var142 = 32767;
                        }
                        byte[] var143 = new byte[var142];
                        var141.field2045 += Statics.field2831.method2385(var141.field2049, var141.field2045, var143, 0, var142);
                        String var144 = class149.method28(var143, 0, var142);
                        var145 = var144;
                    } catch (Exception var319) {
                        var145 = "Cabbage";
                    }
                    String var148 = class185.method3365(class147.method1471(var145));
                    if (var136 == 2 || var136 == 3) {
                        method240(9, class2.method806(1) + var129, var148, class146.method255(var130));
                    } else if (var136 == 1) {
                        method240(9, class2.method806(0) + var129, var148, class146.method255(var130));
                    } else {
                        method240(9, var129, var148, class146.method255(var130));
                    }
                }
                field524 = -1;
                return true;
            }
            if (field524 == 88) {
                String var149 = field522.method2460();
                int var150 = field522.method2477();
                int var151 = field522.method2559();
                if (var150 >= 1 && var150 <= 8) {
                    if (var149.equalsIgnoreCase("null")) {
                        var149 = null;
                    }
                    field615[var150 - 1] = var149;
                    field616[var150 - 1] = var151 == 0;
                }
                field524 = -1;
                return true;
            }
            if (field524 == 237) {
                int var152 = field522.method2472();
                class137[] var153 = new class137[] { class137.field2337, class137.field2333, class137.field2336 };
                class137[] var154 = var153;
                int var155 = 0;
                class137 var157;
                while (true) {
                    if (var155 >= var154.length) {
                        var157 = null;
                        break;
                    }
                    class137 var156 = var154[var155];
                    if (var156.field2335 == var152) {
                        var157 = var156;
                        break;
                    }
                    var155++;
                }
                Statics.field1946 = var157;
                field524 = -1;
                return true;
            }
            if (field524 == 153) {
                String var158 = field522.method2460();
                long var159 = (long) field522.method2615();
                long var161 = (long) field522.method2608();
                int var163 = field522.method2472();
                long var164 = (var159 << 32) + var161;
                boolean var166 = false;
                for (int var167 = 0; var167 < 100; var167++) {
                    if (field703[var167] == var164) {
                        var166 = true;
                        break;
                    }
                }
                if (method46(var158)) {
                    var166 = true;
                }
                if (!var166 && field603 == 0) {
                    field703[field685] = var164;
                    field685 = (field685 + 1) % 100;
                    class116 var168 = field522;
                    String var172;
                    try {
                        int var169 = var168.method2465();
                        if (var169 > 32767) {
                            var169 = 32767;
                        }
                        byte[] var170 = new byte[var169];
                        var168.field2045 += Statics.field2831.method2385(var168.field2049, var168.field2045, var170, 0, var169);
                        String var171 = class149.method28(var170, 0, var169);
                        var172 = var171;
                    } catch (Exception var318) {
                        var172 = "Cabbage";
                    }
                    String var175 = class185.method3365(class147.method1471(var172));
                    if (var163 == 2 || var163 == 3) {
                        method224(7, class2.method806(1) + var158, var175);
                    } else if (var163 == 1) {
                        method224(7, class2.method806(0) + var158, var175);
                    } else {
                        method224(3, var158, var175);
                    }
                }
                field524 = -1;
                return true;
            }
            if (field524 == 51) {
                field499 = field522.method2472();
                if (field499 == 1) {
                    field500 = field522.method2615();
                }
                if (field499 >= 2 && field499 <= 6) {
                    if (field499 == 2) {
                        field505 = 64;
                        field506 = 64;
                    }
                    if (field499 == 3) {
                        field505 = 0;
                        field506 = 64;
                    }
                    if (field499 == 4) {
                        field505 = 128;
                        field506 = 64;
                    }
                    if (field499 == 5) {
                        field505 = 64;
                        field506 = 0;
                    }
                    if (field499 == 6) {
                        field505 = 64;
                        field506 = 128;
                    }
                    field499 = 2;
                    field560 = field522.method2615();
                    field602 = field522.method2615();
                    field480 = field522.method2472();
                }
                if (field499 == 10) {
                    field501 = field522.method2615();
                }
                field524 = -1;
                return true;
            }
            if (field524 == 177) {
                String var176 = field522.method2460();
                Object[] var177 = new Object[var176.length() + 1];
                for (int var178 = var176.length() - 1; var178 >= 0; var178--) {
                    if (var176.charAt(var178) == 's') {
                        var177[var178 + 1] = field522.method2460();
                    } else {
                        var177[var178 + 1] = Integer.valueOf(field522.method2457());
                    }
                }
                var177[0] = Integer.valueOf(field522.method2457());
                class1 var179 = new class1();
                var179.field12 = var177;
                class26.method1870(var179);
                field524 = -1;
                return true;
            }
            if (field524 == 111 || field524 == 103 || field524 == 220 || field524 == 64 || field524 == 41 || field524 == 238 || field524 == 89 || field524 == 70 || field524 == 182 || field524 == 13 || field524 == 65) {
                method1390();
                field524 = -1;
                return true;
            }
            if (field524 == 107) {
                Statics.field308 = field522.method2472();
                Statics.field479 = field522.method2472();
                field524 = -1;
                return true;
            }
            if (field524 == 138) {
                field718 = field522.method2472();
                field524 = -1;
                return true;
            }
            if (field524 == 141) {
                method127();
                field524 = -1;
                return true;
            }
            if (field524 == 208) {
                String var180 = field522.method2460();
                class116 var181 = field522;
                String var185;
                try {
                    int var182 = var181.method2465();
                    if (var182 > 32767) {
                        var182 = 32767;
                    }
                    byte[] var183 = new byte[var182];
                    var181.field2045 += Statics.field2831.method2385(var181.field2049, var181.field2045, var183, 0, var182);
                    String var184 = class149.method28(var183, 0, var182);
                    var185 = var184;
                } catch (Exception var317) {
                    var185 = "Cabbage";
                }
                String var188 = class185.method3365(class147.method1471(var185));
                method224(6, var180, var188);
                field524 = -1;
                return true;
            }
            if (field524 == 173) {
                class182.method739(field522, field612);
                field524 = -1;
                return true;
            }
            if (field524 == 149) {
                byte var189 = field522.method2479();
                int var190 = field522.method2483();
                class159.field2695[var190] = var189;
                if (class159.field2697[var190] != var189) {
                    class159.field2697[var190] = var189;
                    method228(var190);
                }
                field668[++field669 - 1 & 0x1F] = var190;
                field524 = -1;
                return true;
            }
            if (field524 == 66) {
                int var191 = field522.method2494();
                int var192 = field522.method2615();
                int var193 = field522.method2472();
                class4 var194 = (class4) field645.method3273((long) var191);
                if (var194 != null) {
                    method61(var194, var194.field54 != var192);
                }
                class4 var195 = new class4();
                var195.field54 = var192;
                var195.field57 = var193;
                field645.method3278(var195, (long) var191);
                method100(var192);
                class26.method161(var192);
                class158 var196 = class158.method2658(var191);
                if (var196 != null) {
                    method1610(var196);
                }
                if (field648 != null) {
                    method1610(field648);
                    field648 = null;
                }
                for (int var197 = 0; var197 < field627; var197++) {
                    if (method94(field630[var197])) {
                        if (var197 < field627 - 1) {
                            for (int var198 = var197; var198 < field627 - 1; var198++) {
                                field680[var198] = field680[var198 + 1];
                                field633[var198] = field633[var198 + 1];
                                field630[var198] = field630[var198 + 1];
                                field631[var198] = field631[var198 + 1];
                                field628[var198] = field628[var198 + 1];
                                field629[var198] = field629[var198 + 1];
                            }
                        }
                        field627--;
                    }
                }
                if (field644 != -1) {
                    method2038(field644, 1);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 135) {
                field731 = true;
                Statics.field758 = field522.method2472();
                Statics.field2037 = field522.method2472();
                Statics.field1682 = field522.method2615();
                Statics.field1520 = field522.method2472();
                Statics.field1269 = field522.method2472();
                if (Statics.field1269 >= 100) {
                    int var199 = Statics.field758 * 128 + 64;
                    int var200 = Statics.field2037 * 128 + 64;
                    int var201 = method580(var199, var200, Statics.field379) - Statics.field1682;
                    int var202 = var199 - Statics.field350;
                    int var203 = var201 - Statics.field375;
                    int var204 = var200 - Statics.field284;
                    int var205 = (int) Math.sqrt((double) (var202 * var202 + var204 * var204));
                    Statics.field398 = (int) (Math.atan2((double) var203, (double) var205) * 325.949D) & 0x7FF;
                    Statics.field264 = (int) (Math.atan2((double) var202, (double) var204) * -325.949D) & 0x7FF;
                    if (Statics.field398 < 128) {
                        Statics.field398 = 128;
                    }
                    if (Statics.field398 > 383) {
                        Statics.field398 = 383;
                    }
                }
                field524 = -1;
                return true;
            }
            if (field524 == 42) {
                method545();
                int var206 = field522.method2559();
                int var207 = field522.method2475();
                int var208 = field522.method2436();
                field530[var207] = var208;
                field622[var207] = var206;
                field623[var207] = 1;
                for (int var209 = 0; var209 < 98; var209++) {
                    if (var208 >= class130.field2051[var209]) {
                        field623[var207] = var209 + 2;
                    }
                }
                field672[++field673 - 1 & 0x1F] = var207;
                field524 = -1;
                return true;
            }
            if (field524 == 8) {
                int var210 = field522.method2563();
                class158 var211 = class158.method2658(var210);
                for (int var212 = 0; var212 < var211.field2638.length; var212++) {
                    var211.field2638[var212] = -1;
                    var211.field2638[var212] = 0;
                }
                method1610(var211);
                field524 = -1;
                return true;
            }
            if (field524 == 163) {
                Statics.field479 = field522.method2475();
                Statics.field308 = field522.method2475();
                while (field522.field2045 < field612) {
                    field524 = field522.method2472();
                    method1390();
                }
                field524 = -1;
                return true;
            }
            if (field524 == 31) {
                int var213 = field522.method2436();
                int var214 = field522.method2572();
                class158 var215 = class158.method2658(var213);
                if (var215.field2613 != var214 || var214 == -1) {
                    var215.field2613 = var214;
                    var215.field2683 = 0;
                    var215.field2684 = 0;
                    method1610(var215);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 217) {
                int var216 = field522.method2563();
                class158 var217 = class158.method2658(var216);
                var217.field2609 = 3;
                var217.field2610 = Statics.field139.field33.method3162();
                method1610(var217);
                field524 = -1;
                return true;
            }
            if (field524 == 87) {
                method227(false);
                field524 = -1;
                return true;
            }
            if (field524 == 191) {
                String var218 = field522.method2460();
                if (var218.endsWith(":tradereq:")) {
                    String var219 = var218.substring(0, var218.indexOf(":"));
                    boolean var220 = false;
                    if (method46(var219)) {
                        var220 = true;
                    }
                    if (!var220 && field603 == 0) {
                        method224(4, var219, class134.field2227);
                    }
                } else if (var218.endsWith(":duelreq:")) {
                    String var221 = var218.substring(0, var218.indexOf(":"));
                    boolean var222 = false;
                    if (method46(var221)) {
                        var222 = true;
                    }
                    if (!var222 && field603 == 0) {
                        method224(8, var221, class134.field2207);
                    }
                } else if (var218.endsWith(":chalreq:")) {
                    String var223 = var218.substring(0, var218.indexOf(":"));
                    boolean var224 = false;
                    if (method46(var223)) {
                        var224 = true;
                    }
                    if (!var224 && field603 == 0) {
                        String var225 = var218.substring(var218.indexOf(":") + 1, var218.length() - 9);
                        method224(8, var223, var225);
                    }
                } else if (var218.endsWith(":assistreq:")) {
                    String var226 = var218.substring(0, var218.indexOf(":"));
                    boolean var227 = false;
                    if (method46(var226)) {
                        var227 = true;
                    }
                    if (!var227 && field603 == 0) {
                        method224(10, var226, "");
                    }
                } else if (var218.endsWith(":clan:")) {
                    String var228 = var218.substring(0, var218.indexOf(":clan:"));
                    method224(11, "", var228);
                } else if (var218.endsWith(":trade:")) {
                    String var229 = var218.substring(0, var218.indexOf(":trade:"));
                    if (field603 == 0) {
                        method224(12, "", var229);
                    }
                } else if (var218.endsWith(":assist:")) {
                    String var230 = var218.substring(0, var218.indexOf(":assist:"));
                    if (field603 == 0) {
                        method224(13, "", var230);
                    }
                } else {
                    method224(0, "", var218);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 94) {
                for (int var231 = 0; var231 < field604.length; var231++) {
                    if (field604[var231] != null) {
                        field604[var231].field451 = -1;
                    }
                }
                for (int var232 = 0; var232 < field632.length; var232++) {
                    if (field632[var232] != null) {
                        field632[var232].field451 = -1;
                    }
                }
                field524 = -1;
                return true;
            }
            if (field524 == 73) {
                field522.field2045 += 28;
                if (field522.method2486()) {
                    Statics.method544(field522, field522.field2045 - 28);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 137) {
                int var233 = field522.method2494();
                int var234 = field522.method2615();
                class159.field2695[var234] = var233;
                if (class159.field2697[var234] != var233) {
                    class159.field2697[var234] = var233;
                    method228(var234);
                }
                field668[++field669 - 1 & 0x1F] = var234;
                field524 = -1;
                return true;
            }
            if (field524 == 99) {
                int var235 = field612 + field522.field2045;
                int var236 = field522.method2615();
                int var237 = field522.method2615();
                if (field644 != var236) {
                    field644 = var236;
                    method100(field644);
                    class26.method161(field644);
                    for (int var238 = 0; var238 < 100; var238++) {
                        field687[var238] = true;
                    }
                }
                while (var237-- > 0) {
                    int var239 = field522.method2457();
                    int var240 = field522.method2615();
                    int var241 = field522.method2472();
                    class4 var242 = (class4) field645.method3273((long) var239);
                    if (var242 != null && var242.field54 != var240) {
                        method61(var242, true);
                        var242 = null;
                    }
                    if (var242 == null) {
                        class4 var243 = new class4();
                        var243.field54 = var240;
                        var243.field57 = var241;
                        field645.method3278(var243, (long) var239);
                        method100(var240);
                        class26.method161(var240);
                        class158 var244 = class158.method2658(var239);
                        if (var244 != null) {
                            method1610(var244);
                        }
                        if (field648 != null) {
                            method1610(field648);
                            field648 = null;
                        }
                        for (int var245 = 0; var245 < field627; var245++) {
                            if (method94(field630[var245])) {
                                if (var245 < field627 - 1) {
                                    for (int var246 = var245; var246 < field627 - 1; var246++) {
                                        field680[var246] = field680[var246 + 1];
                                        field633[var246] = field633[var246 + 1];
                                        field630[var246] = field630[var246 + 1];
                                        field631[var246] = field631[var246 + 1];
                                        field628[var246] = field628[var246 + 1];
                                        field629[var246] = field629[var246 + 1];
                                    }
                                }
                                field627--;
                            }
                        }
                        if (field644 != -1) {
                            method2038(field644, 1);
                        }
                        var242 = var243;
                    }
                    var242.field55 = true;
                }
                for (class4 var248 = (class4) field645.method3276(); var248 != null; var248 = (class4) field645.method3277()) {
                    if (var248.field55) {
                        var248.field55 = false;
                    } else {
                        method61(var248, true);
                    }
                }
                field684 = new class175(512);
                while (field522.field2045 < var235) {
                    int var249 = field522.method2457();
                    int var250 = field522.method2615();
                    int var251 = field522.method2615();
                    int var252 = field522.method2457();
                    for (int var253 = var250; var253 <= var251; var253++) {
                        long var254 = ((long) var249 << 32) + (long) var253;
                        field684.method3278(new class171(var252), var254);
                    }
                }
                field524 = -1;
                return true;
            }
            if (field524 == 123) {
                field731 = false;
                for (int var256 = 0; var256 < 5; var256++) {
                    field732[var256] = false;
                }
                field524 = -1;
                return true;
            }
            if (field524 == 198) {
                int var257 = field522.method2503();
                int var258 = field522.method2572();
                int var259 = field522.method2457();
                class158 var260 = class158.method2658(var259);
                int var261 = var260.field2624 + var257;
                int var262 = var260.field2585 + var258;
                if (var260.field2582 != var261 || var260.field2580 != var262) {
                    var260.field2582 = var261;
                    var260.field2580 = var262;
                    method1610(var260);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 35) {
                int var263 = field522.method2494();
                String var264 = field522.method2460();
                class158 var265 = class158.method2658(var263);
                if (!var264.equals(var265.field2634)) {
                    var265.field2634 = var264;
                    method1610(var265);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 61) {
                for (int var266 = 0; var266 < Statics.field1040; var266++) {
                    class42 var267 = class42.method2661(var266);
                    if (var267 != null && var267.field1042 == 0) {
                        class159.field2695[var266] = 0;
                        class159.field2697[var266] = 0;
                    }
                }
                method545();
                field669 += 32;
                field524 = -1;
                return true;
            }
            if (field524 == 52) {
                if (field644 != -1) {
                    method2038(field644, 0);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 190) {
                int var268 = field522.method2472();
                int var269 = field522.method2472();
                int var270 = field522.method2472();
                int var271 = field522.method2472();
                field732[var268] = true;
                field576[var268] = var269;
                field734[var268] = var270;
                field588[var268] = var271;
                field736[var268] = 0;
                field524 = -1;
                return true;
            }
            if (field524 == 71) {
                int var272 = field522.method2484();
                int var273 = field522.method2436();
                int var274 = var272 >> 10 & 0x1F;
                int var275 = var272 >> 5 & 0x1F;
                int var276 = var272 & 0x1F;
                int var277 = (var276 << 3) + (var274 << 19) + (var275 << 11);
                class158 var278 = class158.method2658(var273);
                if (var278.field2594 != var277) {
                    var278.field2594 = var277;
                    method1610(var278);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 24) {
                field701 = field522.method2472();
                field749 = field522.method2472();
                field524 = -1;
                return true;
            }
            if (field524 == 22) {
                int var279 = field522.method2615();
                int var280 = field522.method2472();
                int var281 = field522.method2615();
                method148(var279, var280, var281);
                field524 = -1;
                return true;
            }
            if (field524 == 101) {
                method1531();
                field524 = -1;
                return false;
            }
            if (field524 == 253) {
                boolean var282 = field522.method2559() == 1;
                int var283 = field522.method2494();
                class158 var284 = class158.method2658(var283);
                if (var284.field2589 != var282) {
                    var284.field2589 = var282;
                    method1610(var284);
                }
                field524 = -1;
                return true;
            }
            if (field524 == 30) {
                int var285 = field522.method2484();
                if (var285 == 65535) {
                    var285 = -1;
                }
                method123(var285);
                field524 = -1;
                return true;
            }
            if (field524 == 136) {
                int var286 = field522.method2608();
                int var287 = field522.method2593();
                if (var287 == 65535) {
                    var287 = -1;
                }
                method164(var287, var286);
                field524 = -1;
                return true;
            }
            if (field524 == 127) {
                field676 = field682;
                if (field612 == 0) {
                    field661 = null;
                    field721 = null;
                    Statics.field1189 = 0;
                    Statics.field1027 = null;
                    field524 = -1;
                    return true;
                }
                field721 = field522.method2460();
                long var288 = field522.method2564();
                long var290 = var288;
                String var292;
                if (var288 <= 0L || var288 >= 6582952005840035281L) {
                    var292 = null;
                } else if (var288 % 37L == 0L) {
                    var292 = null;
                } else {
                    int var293 = 0;
                    for (long var294 = var288; var294 != 0L; var294 /= 37L) {
                        var293++;
                    }
                    StringBuilder var296 = new StringBuilder(var293);
                    while (var290 != 0L) {
                        long var297 = var290;
                        var290 /= 37L;
                        var296.append(class146.field2449[(int) (var297 - var290 * 37L)]);
                    }
                    var292 = var296.reverse().toString();
                }
                field661 = var292;
                Statics.field883 = field522.method2453();
                int var299 = field522.method2472();
                if (var299 == 255) {
                    field524 = -1;
                    return true;
                }
                Statics.field1189 = var299;
                class8[] var300 = new class8[100];
                for (int var301 = 0; var301 < Statics.field1189; var301++) {
                    var300[var301] = new class8();
                    var300[var301].field113 = field522.method2460();
                    var300[var301].field104 = class148.method122(var300[var301].field113, Statics.field76);
                    var300[var301].field110 = field522.method2615();
                    var300[var301].field106 = field522.method2453();
                    field522.method2460();
                    if (var300[var301].field113.equals(Statics.field139.field36)) {
                        Statics.field2355 = var300[var301].field106;
                    }
                }
                boolean var302 = false;
                int var303 = Statics.field1189;
                while (var303 > 0) {
                    boolean var304 = true;
                    var303--;
                    for (int var305 = 0; var305 < var303; var305++) {
                        if (var300[var305].field104.compareTo(var300[var305 + 1].field104) > 0) {
                            class8 var306 = var300[var305];
                            var300[var305] = var300[var305 + 1];
                            var300[var305 + 1] = var306;
                            var304 = false;
                        }
                    }
                    if (var304) {
                        break;
                    }
                }
                Statics.field1027 = var300;
                field524 = -1;
                return true;
            }
            if (field524 == 150) {
                int var307 = field522.method2563();
                int var308 = field522.method2593();
                if (var308 == 65535) {
                    var308 = -1;
                }
                int var309 = field522.method2494();
                class158 var310 = class158.method2658(var309);
                if (var310.field2576) {
                    var310.field2681 = var308;
                    var310.field2682 = var307;
                    class40 var312 = class40.method548(var308);
                    var310.field2647 = var312.field995;
                    var310.field2618 = var312.field986;
                    var310.field2615 = var312.field997;
                    var310.field2578 = var312.field998;
                    var310.field2669 = var312.field999;
                    var310.field2680 = var312.field994;
                    if (var310.field2586 > 0) {
                        var310.field2680 = var310.field2680 * 32 / var310.field2586;
                    }
                    method1610(var310);
                } else if (var308 == -1) {
                    var310.field2609 = 0;
                    field524 = -1;
                    return true;
                } else {
                    class40 var311 = class40.method548(var308);
                    var310.field2609 = 4;
                    var310.field2610 = var308;
                    var310.field2647 = var311.field995;
                    var310.field2618 = var311.field986;
                    var310.field2680 = var311.field994 * 100 / var307;
                    method1610(var310);
                }
                field524 = -1;
                return true;
            }
            class80.method4("" + field524 + class2.field17 + field729 + class2.field17 + field489 + class2.field17 + field612, (Throwable) null);
            method1531();
        } catch (IOException var320) {
            method1357();
        } catch (Exception var321) {
            String var315 = "" + field524 + class2.field17 + field729 + class2.field17 + field489 + class2.field17 + field612 + class2.field17 + (Statics.field1518 + Statics.field139.field443[0]) + class2.field17 + (Statics.field1830 + Statics.field139.field449[0]) + class2.field17;
            for (int var316 = 0; var316 < field612 && var316 < 50; var316++) {
                var315 = var315 + field522.field2049[var316] + class2.field17;
            }
            class80.method4(var315, var321);
            method1531();
        }
        return true;
    }

    @ObfuscatedName("bq.bu(I)V")
    public static final void method1390() {
        if (field524 == 220) {
            int var0 = field522.method2593();
            byte var1 = field522.method2453();
            int var2 = field522.method2472();
            int var3 = (var2 >> 4 & 0x7) + Statics.field479;
            int var4 = (var2 & 0x7) + Statics.field308;
            byte var5 = field522.method2478();
            byte var6 = field522.method2453();
            int var7 = field522.method2483();
            int var8 = field522.method2475();
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = field542[var9];
            byte var12 = field522.method2478();
            int var13 = field522.method2615();
            int var14 = field522.method2484();
            class3 var15;
            if (field618 == var7) {
                var15 = Statics.field139;
            } else {
                var15 = field604[var7];
            }
            if (var15 != null) {
                class32 var16 = class32.method2660(var13);
                int var17;
                int var18;
                if (var10 == 1 || var10 == 3) {
                    var17 = var16.field837;
                    var18 = var16.field836;
                } else {
                    var17 = var16.field836;
                    var18 = var16.field837;
                }
                int var19 = (var17 >> 1) + var3;
                int var20 = (var17 + 1 >> 1) + var3;
                int var21 = (var18 >> 1) + var4;
                int var22 = (var18 + 1 >> 1) + var4;
                int[][] var23 = class9.field115[Statics.field379];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var3 << 7) + (var17 << 6);
                int var26 = (var4 << 7) + (var18 << 6);
                class112 var27 = var16.method641(var9, var10, var23, var25, var24, var26);
                if (var27 != null) {
                    method15(Statics.field379, var3, var4, var11, -1, 0, 0, var14 + 1, var0 + 1);
                    var15.field34 = field491 + var14;
                    var15.field40 = field491 + var0;
                    var15.field44 = var27;
                    var15.field35 = var3 * 128 + var17 * 64;
                    var15.field43 = var4 * 128 + var18 * 64;
                    var15.field42 = var24;
                    if (var5 > var1) {
                        byte var28 = var5;
                        var5 = var1;
                        var1 = var28;
                    }
                    if (var6 > var12) {
                        byte var29 = var6;
                        var6 = var12;
                        var12 = var29;
                    }
                    var15.field45 = var3 + var5;
                    var15.field47 = var1 + var3;
                    var15.field39 = var4 + var6;
                    var15.field48 = var4 + var12;
                }
            }
        }
        if (field524 == 182) {
            int var30 = field522.method2484();
            int var31 = field522.method2477();
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = field542[var32];
            int var35 = field522.method2475();
            int var36 = (var35 >> 4 & 0x7) + Statics.field479;
            int var37 = (var35 & 0x7) + Statics.field308;
            if (var36 >= 0 && var37 >= 0 && var36 < 103 && var37 < 103) {
                if (var34 == 0) {
                    class96 var38 = Statics.field419.method2000(Statics.field379, var36, var37);
                    if (var38 != null) {
                        int var39 = var38.field1613 >> 14 & 0x7FFF;
                        if (var32 == 2) {
                            var38.field1618 = new class14(var39, 2, var33 + 4, Statics.field379, var36, var37, var30, false, var38.field1618);
                            var38.field1619 = new class14(var39, 2, var33 + 1 & 0x3, Statics.field379, var36, var37, var30, false, var38.field1619);
                        } else {
                            var38.field1618 = new class14(var39, var32, var33, Statics.field379, var36, var37, var30, false, var38.field1618);
                        }
                    }
                }
                if (var34 == 1) {
                    class108 var40 = Statics.field419.method1894(Statics.field379, var36, var37);
                    if (var40 != null) {
                        int var41 = var40.field1818 >> 14 & 0x7FFF;
                        if (var32 == 4 || var32 == 5) {
                            var40.field1816 = new class14(var41, 4, var33, Statics.field379, var36, var37, var30, false, var40.field1816);
                        } else if (var32 == 6) {
                            var40.field1816 = new class14(var41, 4, var33 + 4, Statics.field379, var36, var37, var30, false, var40.field1816);
                        } else if (var32 == 7) {
                            var40.field1816 = new class14(var41, 4, (var33 + 2 & 0x3) + 4, Statics.field379, var36, var37, var30, false, var40.field1816);
                        } else if (var32 == 8) {
                            var40.field1816 = new class14(var41, 4, var33 + 4, Statics.field379, var36, var37, var30, false, var40.field1816);
                            var40.field1809 = new class14(var41, 4, (var33 + 2 & 0x3) + 4, Statics.field379, var36, var37, var30, false, var40.field1809);
                        }
                    }
                }
                if (var34 == 2) {
                    class98 var42 = Statics.field419.method2026(Statics.field379, var36, var37);
                    if (var32 == 11) {
                        var32 = 10;
                    }
                    if (var42 != null) {
                        var42.field1645 = new class14(var42.field1657 >> 14 & 0x7FFF, var32, var33, Statics.field379, var36, var37, var30, false, var42.field1645);
                    }
                }
                if (var34 == 3) {
                    class107 var43 = Statics.field419.method1896(Statics.field379, var36, var37);
                    if (var43 != null) {
                        var43.field1798 = new class14(var43.field1808 >> 14 & 0x7FFF, 22, var33, Statics.field379, var36, var37, var30, false, var43.field1798);
                    }
                }
            }
        } else if (field524 == 64) {
            int var44 = field522.method2475();
            int var45 = (var44 >> 4 & 0x7) + Statics.field479;
            int var46 = (var44 & 0x7) + Statics.field308;
            int var47 = field522.method2593();
            int var48 = field522.method2483();
            int var49 = field522.method2593();
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && field618 != var47) {
                class17 var50 = new class17();
                var50.field273 = var49;
                var50.field269 = var48;
                if (field519[Statics.field379][var45][var46] == null) {
                    field519[Statics.field379][var45][var46] = new class177();
                }
                field519[Statics.field379][var45][var46].method3289(var50);
                method2035(var45, var46);
            }
        } else if (field524 == 89) {
            int var51 = field522.method2593();
            int var52 = field522.method2472();
            int var53 = (var52 >> 4 & 0x7) + Statics.field479;
            int var54 = (var52 & 0x7) + Statics.field308;
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                class177 var55 = field519[Statics.field379][var53][var54];
                if (var55 != null) {
                    for (class17 var56 = (class17) var55.method3294(); var56 != null; var56 = (class17) var55.method3296()) {
                        if ((var51 & 0x7FFF) == var56.field273) {
                            var56.method3328();
                            break;
                        }
                    }
                    if (var55.method3294() == null) {
                        field519[Statics.field379][var53][var54] = null;
                    }
                    method2035(var53, var54);
                }
            }
        } else {
            if (field524 == 111) {
                int var57 = field522.method2472();
                int var58 = (var57 >> 4 & 0x7) + Statics.field479;
                int var59 = (var57 & 0x7) + Statics.field308;
                int var60 = field522.method2615();
                int var61 = field522.method2472();
                int var62 = var61 >> 4 & 0xF;
                int var63 = var61 & 0x7;
                int var64 = field522.method2472();
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    int var65 = var62 + 1;
                    if (Statics.field139.field443[0] >= var58 - var65 && Statics.field139.field443[0] <= var58 + var65 && Statics.field139.field449[0] >= var59 - var65 && Statics.field139.field449[0] <= var59 + var65 && field539 != 0 && var63 > 0 && field548 < 50) {
                        field743[field548] = var60;
                        field727[field548] = var63;
                        field728[field548] = var64;
                        field730[field548] = null;
                        field590[field548] = (var58 << 16) + (var59 << 8) + var62;
                        field548++;
                    }
                }
            }
            if (field524 == 70) {
                int var66 = field522.method2484();
                int var67 = field522.method2475();
                int var68 = (var67 >> 4 & 0x7) + Statics.field479;
                int var69 = (var67 & 0x7) + Statics.field308;
                int var70 = field522.method2615();
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    class17 var71 = new class17();
                    var71.field273 = var70;
                    var71.field269 = var66;
                    if (field519[Statics.field379][var68][var69] == null) {
                        field519[Statics.field379][var68][var69] = new class177();
                    }
                    field519[Statics.field379][var68][var69].method3289(var71);
                    method2035(var68, var69);
                }
            } else if (field524 == 103) {
                int var72 = field522.method2472();
                int var73 = (var72 >> 4 & 0x7) + Statics.field479;
                int var74 = (var72 & 0x7) + Statics.field308;
                int var75 = field522.method2615();
                int var76 = field522.method2615();
                int var77 = field522.method2615();
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    class177 var78 = field519[Statics.field379][var73][var74];
                    if (var78 != null) {
                        for (class17 var79 = (class17) var78.method3294(); var79 != null; var79 = (class17) var78.method3296()) {
                            if ((var75 & 0x7FFF) == var79.field273 && var79.field269 == var76) {
                                var79.field269 = var77;
                                break;
                            }
                        }
                        method2035(var73, var74);
                    }
                }
            } else if (field524 == 65) {
                int var80 = field522.method2475();
                int var81 = var80 >> 2;
                int var82 = var80 & 0x3;
                int var83 = field542[var81];
                int var84 = field522.method2472();
                int var85 = (var84 >> 4 & 0x7) + Statics.field479;
                int var86 = (var84 & 0x7) + Statics.field308;
                int var87 = field522.method2483();
                if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                    method15(Statics.field379, var85, var86, var83, var87, var81, var82, 0, -1);
                }
            } else if (field524 == 13) {
                int var88 = field522.method2475();
                int var89 = (var88 >> 4 & 0x7) + Statics.field479;
                int var90 = (var88 & 0x7) + Statics.field308;
                int var91 = field522.method2475();
                int var92 = var91 >> 2;
                int var93 = var91 & 0x3;
                int var94 = field542[var92];
                if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                    method15(Statics.field379, var89, var90, var94, -1, var92, var93, 0, -1);
                }
            } else if (field524 == 238) {
                int var95 = field522.method2472();
                int var96 = (var95 >> 4 & 0x7) + Statics.field479;
                int var97 = (var95 & 0x7) + Statics.field308;
                int var98 = var96 + field522.method2453();
                int var99 = var97 + field522.method2453();
                int var100 = field522.method2455();
                int var101 = field522.method2615();
                int var102 = field522.method2472() * 4;
                int var103 = field522.method2472() * 4;
                int var104 = field522.method2615();
                int var105 = field522.method2615();
                int var106 = field522.method2472();
                int var107 = field522.method2472();
                if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104 && var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var101 != 65535) {
                    int var108 = var96 * 128 + 64;
                    int var109 = var97 * 128 + 64;
                    int var110 = var98 * 128 + 64;
                    int var111 = var99 * 128 + 64;
                    class10 var112 = new class10(var101, Statics.field379, var108, var109, method580(var108, var109, Statics.field379) - var102, field491 + var104, field491 + var105, var106, var107, var100, var103);
                    var112.method114(var110, var111, method580(var110, var111, Statics.field379) - var103, field491 + var104);
                    field620.method3289(var112);
                }
            } else if (field524 == 41) {
                int var113 = field522.method2472();
                int var114 = (var113 >> 4 & 0x7) + Statics.field479;
                int var115 = (var113 & 0x7) + Statics.field308;
                int var116 = field522.method2615();
                int var117 = field522.method2472();
                int var118 = field522.method2615();
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    int var119 = var114 * 128 + 64;
                    int var120 = var115 * 128 + 64;
                    class20 var121 = new class20(var116, Statics.field379, var119, var120, method580(var119, var120, Statics.field379) - var117, var118, field491);
                    field621.method3289(var121);
                }
            }
        }
    }

    @ObfuscatedName("w.br(IIIIIIIIII)V")
    public static final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field619.method3294(); var10 != null; var10 = (class22) field619.method3296()) {
            if (var10.field368 == arg0 && var10.field356 == arg1 && var10.field357 == arg2 && var10.field355 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field368 = arg0;
            var9.field355 = arg3;
            var9.field356 = arg1;
            var9.field357 = arg2;
            method331(var9);
            field619.method3289(var9);
        }
        var9.field361 = arg4;
        var9.field363 = arg5;
        var9.field354 = arg6;
        var9.field364 = arg7;
        var9.field365 = arg8;
    }

    @ObfuscatedName("k.bd(I)V")
    public static final void method55() {
        for (class22 var0 = (class22) field619.method3294(); var0 != null; var0 = (class22) field619.method3296()) {
            if (var0.field365 == -1) {
                var0.field364 = 0;
                method331(var0);
            } else {
                var0.method3328();
            }
        }
    }

    @ObfuscatedName("client.bf(Lc;I)V")
    public static final void method331(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field355 == 0) {
            var1 = Statics.field419.method1887(arg0.field368, arg0.field356, arg0.field357);
        }
        if (arg0.field355 == 1) {
            var1 = Statics.field419.method1891(arg0.field368, arg0.field356, arg0.field357);
        }
        if (arg0.field355 == 2) {
            var1 = Statics.field419.method1899(arg0.field368, arg0.field356, arg0.field357);
        }
        if (arg0.field355 == 3) {
            var1 = Statics.field419.method1900(arg0.field368, arg0.field356, arg0.field357);
        }
        if (var1 != 0) {
            int var5 = Statics.field419.method1901(arg0.field368, arg0.field356, arg0.field357, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field358 = var2;
        arg0.field360 = var3;
        arg0.field362 = var4;
    }

    @ObfuscatedName("bn.bg(I)V")
    public static final void method1228() {
        for (class22 var0 = (class22) field619.method3294(); var0 != null; var0 = (class22) field619.method3296()) {
            if (var0.field365 > 0) {
                var0.field365--;
            }
            if (var0.field365 == 0) {
                if (var0.field358 >= 0) {
                    int var1 = var0.field358;
                    int var2 = var0.field360;
                    class32 var3 = class32.method2660(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method638(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method1524(var0.field368, var0.field355, var0.field356, var0.field357, var0.field358, var0.field362, var0.field360);
                var0.method3328();
            } else {
                if (var0.field364 > 0) {
                    var0.field364--;
                }
                if (var0.field364 == 0 && var0.field356 >= 1 && var0.field357 >= 1 && var0.field356 <= 102 && var0.field357 <= 102) {
                    if (var0.field361 >= 0) {
                        int var5 = var0.field361;
                        int var6 = var0.field363;
                        class32 var7 = class32.method2660(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method638(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method1524(var0.field368, var0.field355, var0.field356, var0.field357, var0.field361, var0.field354, var0.field363);
                    var0.field364 = -1;
                    if (var0.field361 == var0.field358 && var0.field358 == -1) {
                        var0.method3328();
                    } else if (var0.field361 == var0.field358 && var0.field362 == var0.field354 && var0.field363 == var0.field360) {
                        var0.method3328();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bl.bp(IIIIIIII)V")
    public static final void method1524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field733 && Statics.field379 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field419.method1887(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field419.method1891(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field419.method1899(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field419.method1900(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field419.method1901(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field419.method1888(arg0, arg2, arg3);
                class32 var15 = class32.method2660(var12);
                if (var15.field838 != 0) {
                    field572[arg0].method3193(arg2, arg3, var13, var14, var15.field839);
                }
            }
            if (arg1 == 1) {
                Statics.field419.method1889(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field419.method1873(arg0, arg2, arg3);
                class32 var16 = class32.method2660(var12);
                if (var16.field836 + arg2 > 103 || var16.field836 + arg3 > 103 || var16.field837 + arg2 > 103 || var16.field837 + arg3 > 103) {
                    return;
                }
                if (var16.field838 != 0) {
                    field572[arg0].method3207(arg2, arg3, var16.field836, var16.field837, var14, var16.field839);
                }
            }
            if (arg1 == 3) {
                Statics.field419.method2014(arg0, arg2, arg3);
                class32 var17 = class32.method2660(var12);
                if (var17.field838 == 1) {
                    field572[arg0].method3186(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field122[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class9.method1665(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field419, field572[arg0]);
    }

    @ObfuscatedName("ci.bb(IIB)V")
    public static final void method2035(int arg0, int arg1) {
        class177 var2 = field519[Statics.field379][arg0][arg1];
        if (var2 == null) {
            Statics.field419.method1892(Statics.field379, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3294(); var6 != null; var6 = (class17) var2.method3296()) {
            class40 var7 = class40.method548(var6.field273);
            long var8 = (long) var7.field996;
            if (var7.field1000 == 1) {
                var8 = (long) (var6.field269 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field419.method1892(Statics.field379, arg0, arg1);
            return;
        }
        var2.method3290(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3294(); var12 != null; var12 = (class17) var2.method3296()) {
            if (var5.field273 != var12.field273) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field273 != var12.field273 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field419.method1999(Statics.field379, arg0, arg1, method580(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field379), var5, var13, var10, var11);
    }

    @ObfuscatedName("a.bc(I)V")
    public static final void method127() {
        field624 = 0;
        field607 = 0;
        field522.method2344();
        int var0 = field522.method2328(1);
        if (var0 != 0) {
            int var1 = field522.method2328(2);
            if (var1 == 0) {
                field608[++field607 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field522.method2328(3);
                Statics.field139.method258(var2, false);
                int var3 = field522.method2328(1);
                if (var3 == 1) {
                    field608[++field607 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field522.method2328(3);
                Statics.field139.method258(var4, true);
                int var5 = field522.method2328(3);
                Statics.field139.method258(var5, true);
                int var6 = field522.method2328(1);
                if (var6 == 1) {
                    field608[++field607 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field522.method2328(1);
                Statics.field379 = field522.method2328(2);
                int var8 = field522.method2328(1);
                if (var8 == 1) {
                    field608[++field607 - 1] = 2047;
                }
                int var9 = field522.method2328(7);
                int var10 = field522.method2328(7);
                Statics.field139.method267(var10, var9, var7 == 1);
            }
        }
        int var11 = field522.method2328(8);
        if (var11 < field605) {
            for (int var12 = var11; var12 < field605; var12++) {
                field486[++field624 - 1] = field525[var12];
            }
        }
        if (var11 > field605) {
            throw new RuntimeException("");
        }
        field605 = 0;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = field525[var13];
            class3 var15 = field604[var14];
            int var16 = field522.method2328(1);
            if (var16 == 0) {
                field525[++field605 - 1] = var14;
                var15.field468 = field491;
            } else {
                int var17 = field522.method2328(2);
                if (var17 == 0) {
                    field525[++field605 - 1] = var14;
                    var15.field468 = field491;
                    field608[++field607 - 1] = var14;
                } else if (var17 == 1) {
                    field525[++field605 - 1] = var14;
                    var15.field468 = field491;
                    int var18 = field522.method2328(3);
                    var15.method258(var18, false);
                    int var19 = field522.method2328(1);
                    if (var19 == 1) {
                        field608[++field607 - 1] = var14;
                    }
                } else if (var17 == 2) {
                    field525[++field605 - 1] = var14;
                    var15.field468 = field491;
                    int var20 = field522.method2328(3);
                    var15.method258(var20, true);
                    int var21 = field522.method2328(3);
                    var15.method258(var21, true);
                    int var22 = field522.method2328(1);
                    if (var22 == 1) {
                        field608[++field607 - 1] = var14;
                    }
                } else if (var17 == 3) {
                    field486[++field624 - 1] = var14;
                }
            }
        }
        while (field522.method2327(field612) >= 11) {
            int var23 = field522.method2328(11);
            if (var23 == 2047) {
                break;
            }
            boolean var27 = false;
            if (field604[var23] == null) {
                field604[var23] = new class3();
                if (field609[var23] != null) {
                    field604[var23].method18(field609[var23]);
                }
                var27 = true;
            }
            field525[++field605 - 1] = var23;
            class3 var28 = field604[var23];
            var28.field468 = field491;
            int var29 = field643[field522.method2328(3)];
            if (var27) {
                var28.field470 = var28.field433 = var29;
            }
            int var30 = field522.method2328(1);
            int var31 = field522.method2328(1);
            if (var31 == 1) {
                field608[++field607 - 1] = var23;
            }
            int var32 = field522.method2328(5);
            if (var32 > 15) {
                var32 -= 32;
            }
            int var33 = field522.method2328(5);
            if (var33 > 15) {
                var33 -= 32;
            }
            var28.method267(Statics.field139.field443[0] + var33, Statics.field139.field449[0] + var32, var30 == 1);
        }
        field522.method2329();
        method1624();
        for (int var24 = 0; var24 < field624; var24++) {
            int var25 = field486[var24];
            if (field491 != field604[var25].field468) {
                field604[var25] = null;
            }
        }
        if (field612 != field522.field2045) {
            throw new RuntimeException(field522.field2045 + class2.field17 + field612);
        }
        for (int var26 = 0; var26 < field605; var26++) {
            if (field604[field525[var26]] == null) {
                throw new RuntimeException(var26 + class2.field17 + field605);
            }
        }
    }

    @ObfuscatedName("ct.by(B)V")
    public static final void method1624() {
        for (int var0 = 0; var0 < field607; var0++) {
            int var1 = field608[var0];
            class3 var2 = field604[var1];
            int var3 = field522.method2472();
            if ((var3 & 0x20) != 0) {
                var3 += field522.method2472() << 8;
            }
            method11(var1, var2, var3);
        }
    }

    @ObfuscatedName("w.bw(ILf;II)V")
    public static final void method11(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x4) != 0) {
            arg1.field476 = field522.method2483();
            arg1.field447 = field522.method2483();
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field461 = field522.method2472();
            arg1.field463 = field522.method2472();
            arg1.field440 = field522.method2477();
            arg1.field464 = field522.method2477();
            arg1.field457 = field522.method2615() + field491;
            arg1.field466 = field522.method2593() + field491;
            arg1.field467 = field522.method2475();
            arg1.field448 = 1;
            arg1.field473 = 0;
        }
        if ((arg2 & 0x1) != 0) {
            int var3 = field522.method2477();
            byte[] var4 = new byte[var3];
            class127 var5 = new class127(var4);
            field522.method2463(var4, 0, var3);
            field609[arg0] = var5;
            arg1.method18(var5);
        }
        if ((arg2 & 0x2) != 0) {
            int var6 = field522.method2615();
            int var7 = field522.method2472();
            int var8 = field522.method2477();
            int var9 = field522.field2045;
            if (arg1.field36 != null && arg1.field33 != null) {
                boolean var10 = false;
                if (var7 <= 1 && method46(arg1.field36)) {
                    var10 = true;
                }
                if (!var10 && field603 == 0) {
                    field536.field2045 = 0;
                    field522.method2463(field536.field2049, 0, var8);
                    field536.field2045 = 0;
                    class127 var11 = field536;
                    String var15;
                    try {
                        int var12 = var11.method2465();
                        if (var12 > 32767) {
                            var12 = 32767;
                        }
                        byte[] var13 = new byte[var12];
                        var11.field2045 += Statics.field2831.method2385(var11.field2049, var11.field2045, var13, 0, var12);
                        String var14 = class149.method28(var13, 0, var12);
                        var15 = var14;
                    } catch (Exception var26) {
                        var15 = "Cabbage";
                    }
                    String var18 = class185.method3365(class147.method1471(var15));
                    arg1.field435 = var18.trim();
                    arg1.field437 = var6 >> 8;
                    arg1.field446 = var6 & 0xFF;
                    arg1.field436 = 150;
                    if (var7 == 2 || var7 == 3) {
                        method224(1, class2.method806(1) + arg1.field36, var18);
                    } else if (var7 == 1) {
                        method224(1, class2.method806(0) + arg1.field36, var18);
                    } else {
                        method224(2, arg1.field36, var18);
                    }
                }
            }
            field522.field2045 = var8 + var9;
        }
        if ((arg2 & 0x10) != 0) {
            int var19 = field522.method2615();
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = field522.method2472();
            method747(arg1, var19, var20);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field435 = field522.method2460();
            if (arg1.field435.charAt(0) == '~') {
                arg1.field435 = arg1.field435.substring(1);
                method224(2, arg1.field36, arg1.field435);
            } else if (Statics.field139 == arg1) {
                method224(2, arg1.field36, arg1.field435);
            }
            arg1.field437 = 0;
            arg1.field446 = 0;
            arg1.field436 = 150;
        }
        if ((arg2 & 0x8) != 0) {
            int var21 = field522.method2472();
            int var22 = field522.method2472();
            arg1.method256(var21, var22, field491);
            arg1.field442 = field491 + 300;
            arg1.field432 = field522.method2559();
            arg1.field426 = field522.method2477();
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field456 = field522.method2483();
            int var23 = field522.method2457();
            arg1.field431 = var23 >> 16;
            arg1.field459 = (var23 & 0xFFFF) + field491;
            arg1.field475 = 0;
            arg1.field458 = 0;
            if (arg1.field459 > field491) {
                arg1.field475 = -1;
            }
            if (arg1.field456 == 65535) {
                arg1.field456 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            int var24 = field522.method2559();
            int var25 = field522.method2475();
            arg1.method256(var24, var25, field491);
            arg1.field442 = field491 + 300;
            arg1.field432 = field522.method2559();
            arg1.field426 = field522.method2472();
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field445 = field522.method2484();
            if (arg1.field445 == 65535) {
                arg1.field445 = -1;
            }
        }
    }

    @ObfuscatedName("en.bq(IB)Z")
    public static final boolean method2956(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field630[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dk.bk(II)V")
    public static final void method2222(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field628[arg0];
        int var2 = field629[arg0];
        int var3 = field630[arg0];
        int var4 = field631[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 33) {
            field520.method2325(74);
            field520.method2585(var1);
            field520.method2491(var2);
            field520.method2575(var4);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 2 && method2128(var1, var2, var4)) {
            field520.method2325(164);
            field520.method2585(Statics.field1830 + var2);
            field520.method2480(Statics.field1518 + var1);
            field520.method2575(field591);
            field520.method2441(Statics.field309);
            field520.method2575(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 45) {
            class3 var5 = field604[var4];
            if (var5 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var5.field443[0], var5.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(177);
                field520.method2481(var4);
            }
        }
        if (var3 == 7) {
            class25 var6 = field632[var4];
            if (var6 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var6.field443[0], var6.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(130);
                field520.method2575(var4);
                field520.method2575(Statics.field230);
                field520.method2585(Statics.field1439);
                field520.method2491(Statics.field1118);
            }
        }
        if (var3 == 49) {
            class3 var7 = field604[var4];
            if (var7 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var7.field443[0], var7.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(198);
                field520.method2481(var4);
            }
        }
        if (var3 == 41) {
            field520.method2325(94);
            field520.method2491(var2);
            field520.method2481(var1);
            field520.method2585(var4);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 8) {
            class25 var8 = field632[var4];
            if (var8 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var8.field443[0], var8.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(101);
                field520.method2441(Statics.field309);
                field520.method2575(var4);
                field520.method2480(field591);
            }
        }
        if (var3 == 16) {
            boolean var9 = method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var9) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field507 = class77.field1398;
            field592 = class77.field1385;
            field594 = 2;
            field593 = 0;
            field520.method2325(78);
            field520.method2575(Statics.field230);
            field520.method2575(Statics.field1439);
            field520.method2575(Statics.field1830 + var2);
            field520.method2489(Statics.field1118);
            field520.method2575(var4);
            field520.method2585(Statics.field1518 + var1);
        }
        if (var3 == 1003) {
            field507 = class77.field1398;
            field592 = class77.field1385;
            field594 = 2;
            field593 = 0;
            class25 var11 = field632[var4];
            if (var11 != null) {
                class31 var12 = var11.field396;
                if (var12.field814 != null) {
                    var12 = var12.method634();
                }
                if (var12 != null) {
                    field520.method2325(75);
                    field520.method2481(var12.field788);
                }
            }
        }
        if (var3 == 42) {
            field520.method2325(131);
            field520.method2480(var4);
            field520.method2480(var1);
            field520.method2489(var2);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 5) {
            method2128(var1, var2, var4);
            field520.method2325(53);
            field520.method2480(Statics.field1518 + var1);
            field520.method2480(var4 >> 14 & 0x7FFF);
            field520.method2585(Statics.field1830 + var2);
        }
        if (var3 == 43) {
            field520.method2325(44);
            field520.method2491(var2);
            field520.method2480(var4);
            field520.method2585(var1);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 36) {
            field520.method2325(213);
            field520.method2585(var4);
            field520.method2575(var1);
            field520.method2491(var2);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 11) {
            class25 var13 = field632[var4];
            if (var13 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var13.field443[0], var13.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(169);
                field520.method2480(var4);
            }
        }
        if (var3 == 9) {
            class25 var14 = field632[var4];
            if (var14 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var14.field443[0], var14.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(24);
                field520.method2585(var4);
            }
        }
        if (var3 == 50) {
            class3 var15 = field604[var4];
            if (var15 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var15.field443[0], var15.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(254);
                field520.method2585(var4);
            }
        }
        if (var3 == 58) {
            field520.method2325(150);
            field520.method2480(var1);
            field520.method2481(field591);
            field520.method2489(Statics.field309);
            field520.method2489(var2);
        }
        if (var3 == 31) {
            field520.method2325(43);
            field520.method2489(Statics.field1118);
            field520.method2585(Statics.field230);
            field520.method2575(Statics.field1439);
            field520.method2480(var1);
            field520.method2489(var2);
            field520.method2481(var4);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 29) {
            field520.method2325(172);
            field520.method2441(var2);
            class158 var16 = class158.method2658(var2);
            if (var16.field2673 != null && var16.field2673[0][0] == 5) {
                int var17 = var16.field2673[0][1];
                if (class159.field2697[var17] != var16.field2675[0]) {
                    class159.field2697[var17] = var16.field2675[0];
                    method228(var17);
                }
            }
        }
        if (var3 == 37) {
            field520.method2325(184);
            field520.method2575(var4);
            field520.method2480(var1);
            field520.method2441(var2);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 35) {
            field520.method2325(175);
            field520.method2575(var1);
            field520.method2585(var4);
            field520.method2491(var2);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 6) {
            method2128(var1, var2, var4);
            field520.method2325(47);
            field520.method2481(Statics.field1518 + var1);
            field520.method2575(Statics.field1830 + var2);
            field520.method2585(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1002) {
            field507 = class77.field1398;
            field592 = class77.field1385;
            field594 = 2;
            field593 = 0;
            field520.method2325(84);
            field520.method2575(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1005) {
            class158 var18 = class158.method2658(var2);
            if (var18 == null || var18.field2592[var1] < 100000) {
                field520.method2325(128);
                field520.method2585(var4);
            } else {
                method224(0, "", var18.field2592[var1] + " x " + class40.method548(var4).field989);
            }
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 24) {
            class158 var19 = class158.method2658(var2);
            boolean var20 = true;
            if (var19.field2581 > 0) {
                var20 = method515(var19);
            }
            if (var20) {
                field520.method2325(172);
                field520.method2441(var2);
            }
        }
        if (var3 == 23) {
            Statics.field419.method1908(Statics.field379, var1, var2);
        }
        if (var3 == 17) {
            boolean var21 = method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var21) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field507 = class77.field1398;
            field592 = class77.field1385;
            field594 = 2;
            field593 = 0;
            field520.method2325(189);
            field520.method2441(Statics.field309);
            field520.method2585(Statics.field1830 + var2);
            field520.method2480(Statics.field1518 + var1);
            field520.method2481(var4);
            field520.method2575(field591);
        }
        if (var3 == 38) {
            method2();
            class158 var23 = class158.method2658(var2);
            field638 = 1;
            Statics.field1439 = var1;
            Statics.field1118 = var2;
            Statics.field230 = var4;
            method1610(var23);
            field639 = class2.method1(16748608) + class40.method548(var4).field989 + class2.method1(16777215);
            if (field639 == null) {
                field639 = "null";
            }
            return;
        }
        if (var3 == 12) {
            class25 var24 = field632[var4];
            if (var24 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var24.field443[0], var24.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(106);
                field520.method2480(var4);
            }
        }
        if (var3 == 40) {
            field520.method2325(45);
            field520.method2481(var1);
            field520.method2491(var2);
            field520.method2481(var4);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 14) {
            class3 var25 = field604[var4];
            if (var25 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var25.field443[0], var25.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(251);
                field520.method2480(Statics.field230);
                field520.method2480(var4);
                field520.method2441(Statics.field1118);
                field520.method2481(Statics.field1439);
            }
        }
        if (var3 == 4) {
            method2128(var1, var2, var4);
            field520.method2325(35);
            field520.method2575(Statics.field1830 + var2);
            field520.method2575(Statics.field1518 + var1);
            field520.method2480(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 48) {
            class3 var26 = field604[var4];
            if (var26 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var26.field443[0], var26.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(0);
                field520.method2481(var4);
            }
        }
        if (var3 == 26) {
            field520.method2325(255);
            for (class4 var27 = (class4) field645.method3276(); var27 != null; var27 = (class4) field645.method3277()) {
                if (var27.field57 == 0 || var27.field57 == 3) {
                    method61(var27, true);
                }
            }
            if (field648 != null) {
                method1610(field648);
                field648 = null;
            }
        }
        if (var3 == 32) {
            field520.method2325(112);
            field520.method2585(var1);
            field520.method2575(field591);
            field520.method2481(var4);
            field520.method2491(Statics.field309);
            field520.method2491(var2);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 20) {
            boolean var28 = method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var28) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field507 = class77.field1398;
            field592 = class77.field1385;
            field594 = 2;
            field593 = 0;
            field520.method2325(69);
            field520.method2585(var4);
            field520.method2481(Statics.field1518 + var1);
            field520.method2480(Statics.field1830 + var2);
        }
        if (var3 == 28) {
            field520.method2325(172);
            field520.method2441(var2);
            class158 var30 = class158.method2658(var2);
            if (var30.field2673 != null && var30.field2673[0][0] == 5) {
                int var31 = var30.field2673[0][1];
                class159.field2697[var31] = 1 - class159.field2697[var31];
                method228(var31);
            }
        }
        if (var3 == 22) {
            boolean var32 = method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var32) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field507 = class77.field1398;
            field592 = class77.field1385;
            field594 = 2;
            field593 = 0;
            field520.method2325(223);
            field520.method2480(Statics.field1518 + var1);
            field520.method2481(Statics.field1830 + var2);
            field520.method2575(var4);
        }
        if (var3 == 39) {
            field520.method2325(105);
            field520.method2481(var1);
            field520.method2490(var2);
            field520.method2585(var4);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 46) {
            class3 var34 = field604[var4];
            if (var34 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var34.field443[0], var34.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(152);
                field520.method2575(var4);
            }
        }
        if (var3 == 19) {
            boolean var35 = method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var35) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field507 = class77.field1398;
            field592 = class77.field1385;
            field594 = 2;
            field593 = 0;
            field520.method2325(162);
            field520.method2480(Statics.field1518 + var1);
            field520.method2575(var4);
            field520.method2481(Statics.field1830 + var2);
        }
        if (var3 == 15) {
            class3 var37 = field604[var4];
            if (var37 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var37.field443[0], var37.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(252);
                field520.method2441(Statics.field309);
                field520.method2575(field591);
                field520.method2480(var4);
            }
        }
        if (var3 == 30 && field648 == null) {
            field520.method2325(50);
            field520.method2441(var2);
            field520.method2585(var1);
            field648 = class158.method2996(var2, var1);
            method1610(field648);
        }
        if (var3 == 1 && method2128(var1, var2, var4)) {
            field520.method2325(29);
            field520.method2480(Statics.field1518 + var1);
            field520.method2480(Statics.field1830 + var2);
            field520.method2585(Statics.field1439);
            field520.method2490(Statics.field1118);
            field520.method2481(Statics.field230);
            field520.method2575(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 21) {
            boolean var38 = method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var38) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field507 = class77.field1398;
            field592 = class77.field1385;
            field594 = 2;
            field593 = 0;
            field520.method2325(120);
            field520.method2480(Statics.field1518 + var1);
            field520.method2585(var4);
            field520.method2575(Statics.field1830 + var2);
        }
        if (var3 == 1004) {
            field507 = class77.field1398;
            field592 = class77.field1385;
            field594 = 2;
            field593 = 0;
            field520.method2325(128);
            field520.method2585(var4);
        }
        if (var3 == 57 || var3 == 1007) {
            String var40 = field633[arg0];
            class158 var41 = class158.method2996(var2, var1);
            if (var41 != null) {
                if (var41.field2636 != null) {
                    class1 var42 = new class1();
                    var42.field2 = var41;
                    var42.field4 = var4;
                    var42.field9 = var40;
                    var42.field12 = var41.field2636;
                    class26.method1870(var42);
                }
                boolean var43 = true;
                if (var41.field2581 > 0) {
                    var43 = method515(var41);
                }
                if (var43) {
                    int var44 = method1225(var41);
                    int var45 = var4 - 1;
                    boolean var46 = (var44 >> var45 + 1 & 0x1) != 0;
                    if (var46) {
                        if (var4 == 1) {
                            field520.method2325(147);
                            field520.method2441(var2);
                            field520.method2585(var1);
                        }
                        if (var4 == 2) {
                            field520.method2325(231);
                            field520.method2441(var2);
                            field520.method2585(var1);
                        }
                        if (var4 == 3) {
                            field520.method2325(187);
                            field520.method2441(var2);
                            field520.method2585(var1);
                        }
                        if (var4 == 4) {
                            field520.method2325(20);
                            field520.method2441(var2);
                            field520.method2585(var1);
                        }
                        if (var4 == 5) {
                            field520.method2325(236);
                            field520.method2441(var2);
                            field520.method2585(var1);
                        }
                        if (var4 == 6) {
                            field520.method2325(242);
                            field520.method2441(var2);
                            field520.method2585(var1);
                        }
                        if (var4 == 7) {
                            field520.method2325(6);
                            field520.method2441(var2);
                            field520.method2585(var1);
                        }
                        if (var4 == 8) {
                            field520.method2325(192);
                            field520.method2441(var2);
                            field520.method2585(var1);
                        }
                        if (var4 == 9) {
                            field520.method2325(171);
                            field520.method2441(var2);
                            field520.method2585(var1);
                        }
                        if (var4 == 10) {
                            field520.method2325(188);
                            field520.method2441(var2);
                            field520.method2585(var1);
                        }
                    }
                }
            }
        }
        if (var3 == 47) {
            class3 var47 = field604[var4];
            if (var47 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var47.field443[0], var47.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(142);
                field520.method2575(var4);
            }
        }
        if (var3 == 44) {
            class3 var48 = field604[var4];
            if (var48 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var48.field443[0], var48.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(2);
                field520.method2575(var4);
            }
        }
        if (var3 == 3) {
            method2128(var1, var2, var4);
            field520.method2325(119);
            field520.method2481(var4 >> 14 & 0x7FFF);
            field520.method2480(Statics.field1830 + var2);
            field520.method2585(Statics.field1518 + var1);
        }
        if (var3 == 51) {
            class3 var49 = field604[var4];
            if (var49 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var49.field443[0], var49.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(98);
                field520.method2480(var4);
            }
        }
        if (var3 == 1001) {
            method2128(var1, var2, var4);
            field520.method2325(38);
            field520.method2481(Statics.field1518 + var1);
            field520.method2481(var4 >> 14 & 0x7FFF);
            field520.method2481(Statics.field1830 + var2);
        }
        if (var3 == 18) {
            boolean var50 = method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var50) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field507 = class77.field1398;
            field592 = class77.field1385;
            field594 = 2;
            field593 = 0;
            field520.method2325(174);
            field520.method2480(Statics.field1830 + var2);
            field520.method2481(Statics.field1518 + var1);
            field520.method2585(var4);
        }
        if (var3 == 13) {
            class25 var52 = field632[var4];
            if (var52 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var52.field443[0], var52.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(235);
                field520.method2585(var4);
            }
        }
        if (var3 == 25) {
            class158 var53 = class158.method2996(var2, var1);
            if (var53 != null) {
                method2();
                int var54 = class162.method882(method1225(var53));
                class158 var55 = class158.method2996(var2, var1);
                if (var55 != null && var55.field2661 != null) {
                    class1 var56 = new class1();
                    var56.field2 = var55;
                    var56.field12 = var55.field2661;
                    class26.method1870(var56);
                }
                field610 = true;
                Statics.field309 = var2;
                field591 = var1;
                Statics.field1524 = var54;
                method1610(var55);
                field638 = 0;
                field642 = method2356(var53);
                if (field642 == null) {
                    field642 = "Null";
                }
                if (var53.field2576) {
                    field595 = var53.field2637 + class2.method1(16777215);
                } else {
                    field595 = class2.method1(65280) + var53.field2677 + class2.method1(16777215);
                }
            }
            return;
        }
        if (var3 == 34) {
            field520.method2325(226);
            field520.method2585(var1);
            field520.method2491(var2);
            field520.method2575(var4);
            field534 = 0;
            Statics.field162 = class158.method2658(var2);
            field596 = var1;
        }
        if (var3 == 10) {
            class25 var57 = field632[var4];
            if (var57 != null) {
                method1409(Statics.field139.field443[0], Statics.field139.field449[0], var57.field443[0], var57.field449[0], false, 0, 0, 1, 1, 0, 2);
                field507 = class77.field1398;
                field592 = class77.field1385;
                field594 = 2;
                field593 = 0;
                field520.method2325(31);
                field520.method2585(var4);
            }
        }
        if (field638 != 0) {
            field638 = 0;
            method1610(class158.method2658(Statics.field1118));
        }
        if (field610) {
            method2();
        }
        if (Statics.field162 != null && field534 == 0) {
            method1610(Statics.field162);
        }
    }

    @ObfuscatedName("i.bo(I)V")
    public static void method2() {
        if (!field610) {
            return;
        }
        class158 var0 = class158.method2996(Statics.field309, field591);
        if (var0 != null && var0.field2598 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field12 = var0.field2598;
            class26.method1870(var1);
        }
        field610 = false;
        method1610(var0);
    }

    @ObfuscatedName("bk.bs(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1395(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field580 || field627 >= 500) {
            return;
        }
        field680[field627] = arg0;
        field633[field627] = arg1;
        field630[field627] = arg2;
        field631[field627] = arg3;
        field628[field627] = arg4;
        field629[field627] = arg5;
        field627++;
    }

    @ObfuscatedName("r.bx(II)Z")
    public static boolean method94(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("cn.bl(Law;IIII)V")
    public static final void method2130(class31 arg0, int arg1, int arg2, int arg3) {
        if (field627 >= 400) {
            return;
        }
        if (arg0.field814 != null) {
            arg0 = arg0.method634();
        }
        if (arg0 == null || !arg0.field817) {
            return;
        }
        String var4 = arg0.field789;
        if (arg0.field806 != 0) {
            int var6 = arg0.field806;
            int var7 = Statics.field139.field38;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method1(16711680);
            } else if (var8 < -6) {
                var9 = class2.method1(16723968);
            } else if (var8 < -3) {
                var9 = class2.method1(16740352);
            } else if (var8 < 0) {
                var9 = class2.method1(16756736);
            } else if (var8 > 9) {
                var9 = class2.method1(65280);
            } else if (var8 > 6) {
                var9 = class2.method1(4259584);
            } else if (var8 > 3) {
                var9 = class2.method1(8453888);
            } else if (var8 > 0) {
                var9 = class2.method1(12648192);
            } else {
                var9 = class2.method1(16776960);
            }
            var4 = var4 + var9 + " " + class2.field16 + class134.field2238 + arg0.field806 + class2.field25;
        }
        if (field638 == 1) {
            method1395(class134.field2232, field639 + " " + class2.field21 + " " + class2.method1(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field610) {
            String[] var10 = arg0.field816;
            if (field512) {
                var10 = method2129(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class134.field2234)) {
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
                        method1395(var10[var11], class2.method1(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class134.field2234)) {
                        short var14 = 0;
                        if (arg0.field806 > Statics.field139.field38) {
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
                        method1395(var10[var13], class2.method1(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method1395(class134.field2233, class2.method1(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1524 & 0x2) == 2) {
            method1395(field642, field595 + " " + class2.field21 + " " + class2.method1(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ao.be(Lf;IIII)V")
    public static final void method274(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field139 == arg0 || field627 >= 400) {
            return;
        }
        String var9;
        if (arg0.field37 == 0) {
            String var4 = arg0.field36;
            int var5 = arg0.field38;
            int var6 = Statics.field139.field38;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method1(16711680);
            } else if (var7 < -6) {
                var8 = class2.method1(16723968);
            } else if (var7 < -3) {
                var8 = class2.method1(16740352);
            } else if (var7 < 0) {
                var8 = class2.method1(16756736);
            } else if (var7 > 9) {
                var8 = class2.method1(65280);
            } else if (var7 > 6) {
                var8 = class2.method1(4259584);
            } else if (var7 > 3) {
                var8 = class2.method1(8453888);
            } else if (var7 > 0) {
                var8 = class2.method1(12648192);
            } else {
                var8 = class2.method1(16776960);
            }
            var9 = var4 + var8 + " " + class2.field16 + class134.field2238 + arg0.field38 + class2.field25;
        } else {
            var9 = arg0.field36 + " " + class2.field16 + class134.field2239 + arg0.field37 + class2.field25;
        }
        if (field638 == 1) {
            method1395(class134.field2232, field639 + " " + class2.field21 + " " + class2.method1(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field610) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field615[var10] != null) {
                    short var11 = 0;
                    if (field615[var10].equalsIgnoreCase(class134.field2234)) {
                        if (arg0.field38 > Statics.field139.field38) {
                            var11 = 2000;
                        }
                        if (Statics.field139.field50 != 0 && arg0.field50 != 0) {
                            if (Statics.field139.field50 == arg0.field50) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field616[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field504[var10] + var11;
                    method1395(field615[var10], class2.method1(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1524 & 0x8) == 8) {
            method1395(field642, field595 + " " + class2.field21 + " " + class2.method1(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field627; var14++) {
            if (field630[var14] == 23) {
                field633[var14] = class2.method1(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("cc.bi([Lfr;IIIIIIIII)V")
    public static final void method1662(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1787(arg2, arg3, arg4, arg5);
        class104.method2182();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2588 == arg1 || arg1 == -1412584499 && field503 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field690[field498] = var10.field2582 + arg6;
                    field691[field498] = var10.field2580 + arg7;
                    field650[field498] = var10.field2586;
                    field693[field498] = var10.field2587;
                    var11 = ++field498 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2692 = var11;
                var10.field2693 = field491;
                if (!var10.field2576 || !method3083(var10)) {
                    if (var10.field2581 > 0) {
                        int var12 = var10.field2581;
                        if (var12 == 324) {
                            if (field744 == -1) {
                                field744 = var10.field2601;
                                field745 = var10.field2642;
                            }
                            if (field664.field2715) {
                                var10.field2601 = field744;
                            } else {
                                var10.field2601 = field745;
                            }
                        } else if (var12 == 325) {
                            if (field744 == -1) {
                                field744 = var10.field2601;
                                field745 = var10.field2642;
                            }
                            if (field664.field2715) {
                                var10.field2601 = field745;
                            } else {
                                var10.field2601 = field744;
                            }
                        } else if (var12 == 327) {
                            var10.field2647 = 150;
                            var10.field2618 = (int) (Math.sin((double) field491 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2609 = 5;
                            var10.field2610 = 0;
                        } else if (var12 == 328) {
                            var10.field2647 = 150;
                            var10.field2618 = (int) (Math.sin((double) field491 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2609 = 5;
                            var10.field2610 = 1;
                        }
                    }
                    int var13 = var10.field2582 + arg6;
                    int var14 = var10.field2580 + arg7;
                    int var15 = var10.field2583;
                    if (field503 == var10) {
                        if (arg1 != -1412584499 && !var10.field2574) {
                            Statics.field2050 = arg0;
                            Statics.field2009 = arg6;
                            Statics.field1547 = arg7;
                            continue;
                        }
                        if (field666 && field660) {
                            int var16 = class77.field1391;
                            int var17 = class77.field1396;
                            int var18 = var16 - field657;
                            int var19 = var17 - field658;
                            if (var18 < field625) {
                                var18 = field625;
                            }
                            if (var10.field2586 + var18 > field625 + field741.field2586) {
                                var18 = field625 + field741.field2586 - var10.field2586;
                            }
                            if (var19 < field662) {
                                var19 = field662;
                            }
                            if (var10.field2587 + var19 > field662 + field741.field2587) {
                                var19 = field662 + field741.field2587 - var10.field2587;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2574) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2665 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2665 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2586 + var13;
                        int var27 = var10.field2587 + var14;
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        if (var27 < var14) {
                            var25 = var27;
                            var27 = var14;
                        }
                        var26++;
                        var27++;
                        var20 = var24 > arg2 ? var24 : arg2;
                        var21 = var25 > arg3 ? var25 : arg3;
                        var22 = var26 < arg4 ? var26 : arg4;
                        var23 = var27 < arg5 ? var27 : arg5;
                    } else {
                        int var30 = var10.field2586 + var13;
                        int var31 = var10.field2587 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2576 || var20 < var22 && var21 < var23) {
                        if (var10.field2581 != 0) {
                            if (var10.field2581 == 1337) {
                                field634 = var13;
                                field635 = var14;
                                method254(var13, var14, var10.field2586, var10.field2587);
                                class89.method1787(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2581 == 1338) {
                                method1586(var13, var14, var11);
                                class89.method1787(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var32 = class77.field1391;
                        int var33 = class77.field1396;
                        if (!field580 && var32 >= var20 && var33 >= var21 && var32 < var22 && var33 < var23) {
                            int var34 = var32 - var13;
                            int var35 = var33 - var14;
                            if (var10.field2616 == 1) {
                                method1395(var10.field2678, "", 24, 0, 0, var10.field2640);
                            }
                            if (var10.field2616 == 2 && !field610) {
                                String var36 = method2356(var10);
                                if (var36 != null) {
                                    method1395(var36, class2.method1(65280) + var10.field2677, 25, 0, -1, var10.field2640);
                                }
                            }
                            if (var10.field2616 == 3) {
                                method1395(class134.field2241, "", 26, 0, 0, var10.field2640);
                            }
                            if (var10.field2616 == 4) {
                                method1395(var10.field2678, "", 28, 0, 0, var10.field2640);
                            }
                            if (var10.field2616 == 5) {
                                method1395(var10.field2678, "", 29, 0, 0, var10.field2640);
                            }
                            if (var10.field2616 == 6 && field648 == null) {
                                method1395(var10.field2678, "", 30, 0, -1, var10.field2640);
                            }
                            if (var10.field2665 == 2) {
                                int var37 = 0;
                                for (int var38 = 0; var38 < var10.field2587; var38++) {
                                    for (int var39 = 0; var39 < var10.field2586; var39++) {
                                        int var40 = (var10.field2612 + 32) * var39;
                                        int var41 = (var10.field2653 + 32) * var38;
                                        if (var37 < 20) {
                                            var40 += var10.field2632[var37];
                                            var41 += var10.field2633[var37];
                                        }
                                        if (var34 >= var40 && var35 >= var41 && var34 < var40 + 32 && var35 < var41 + 32) {
                                            field656 = var37;
                                            Statics.field114 = var10;
                                            if (var10.field2638[var37] > 0) {
                                                label1065: {
                                                    class40 var42 = class40.method548(var10.field2638[var37] - 1);
                                                    if (field638 == 1) {
                                                        int var43 = method1225(var10);
                                                        boolean var44 = (var43 >> 30 & 0x1) != 0;
                                                        if (var44) {
                                                            if (Statics.field1118 != var10.field2640 || Statics.field1439 != var37) {
                                                                method1395(class134.field2232, field639 + " " + class2.field21 + " " + class2.method1(16748608) + var42.field989, 31, var42.field987, var37, var10.field2640);
                                                            }
                                                            break label1065;
                                                        }
                                                    }
                                                    if (field610) {
                                                        int var45 = method1225(var10);
                                                        boolean var46 = (var45 >> 30 & 0x1) != 0;
                                                        if (var46) {
                                                            if ((Statics.field1524 & 0x10) == 16) {
                                                                method1395(field642, field595 + " " + class2.field21 + " " + class2.method1(16748608) + var42.field989, 32, var42.field987, var37, var10.field2640);
                                                            }
                                                            break label1065;
                                                        }
                                                    }
                                                    String[] var47 = var42.field1004;
                                                    if (field512) {
                                                        var47 = method2129(var47);
                                                    }
                                                    int var48 = method1225(var10);
                                                    boolean var49 = (var48 >> 30 & 0x1) != 0;
                                                    if (var49) {
                                                        for (int var50 = 4; var50 >= 3; var50--) {
                                                            if (var47 != null && var47[var50] != null) {
                                                                byte var51;
                                                                if (var50 == 3) {
                                                                    var51 = 36;
                                                                } else {
                                                                    var51 = 37;
                                                                }
                                                                method1395(var47[var50], class2.method1(16748608) + var42.field989, var51, var42.field987, var37, var10.field2640);
                                                            } else if (var50 == 4) {
                                                                method1395(class134.field2216, class2.method1(16748608) + var42.field989, 37, var42.field987, var37, var10.field2640);
                                                            }
                                                        }
                                                    }
                                                    class162 var10000 = (class162) null;
                                                    if (class162.method1255(method1225(var10))) {
                                                        method1395(class134.field2232, class2.method1(16748608) + var42.field989, 38, var42.field987, var37, var10.field2640);
                                                    }
                                                    int var52 = method1225(var10);
                                                    boolean var53 = (var52 >> 30 & 0x1) != 0;
                                                    if (var53 && var47 != null) {
                                                        for (int var54 = 2; var54 >= 0; var54--) {
                                                            if (var47[var54] != null) {
                                                                byte var55 = 0;
                                                                if (var54 == 0) {
                                                                    var55 = 33;
                                                                }
                                                                if (var54 == 1) {
                                                                    var55 = 34;
                                                                }
                                                                if (var54 == 2) {
                                                                    var55 = 35;
                                                                }
                                                                method1395(var47[var54], class2.method1(16748608) + var42.field989, var55, var42.field987, var37, var10.field2640);
                                                            }
                                                        }
                                                    }
                                                    String[] var56 = var10.field2603;
                                                    if (field512) {
                                                        var56 = method2129(var56);
                                                    }
                                                    if (var56 != null) {
                                                        for (int var57 = 4; var57 >= 0; var57--) {
                                                            if (var56[var57] != null) {
                                                                byte var58 = 0;
                                                                if (var57 == 0) {
                                                                    var58 = 39;
                                                                }
                                                                if (var57 == 1) {
                                                                    var58 = 40;
                                                                }
                                                                if (var57 == 2) {
                                                                    var58 = 41;
                                                                }
                                                                if (var57 == 3) {
                                                                    var58 = 42;
                                                                }
                                                                if (var57 == 4) {
                                                                    var58 = 43;
                                                                }
                                                                method1395(var56[var57], class2.method1(16748608) + var42.field989, var58, var42.field987, var37, var10.field2640);
                                                            }
                                                        }
                                                    }
                                                    method1395(class134.field2233, class2.method1(16748608) + var42.field989, 1005, var42.field987, var37, var10.field2640);
                                                }
                                            }
                                        }
                                        var37++;
                                    }
                                }
                            }
                            if (var10.field2576) {
                                if (!field610) {
                                    for (int var59 = 9; var59 >= 5; var59--) {
                                        String var60 = method59(var10, var59);
                                        if (var60 != null) {
                                            method1395(var60, var10.field2637, 1007, var59 + 1, var10.field2620, var10.field2640);
                                        }
                                    }
                                    String var61 = method2356(var10);
                                    if (var61 != null) {
                                        method1395(var61, var10.field2637, 25, 0, var10.field2620, var10.field2640);
                                    }
                                    for (int var62 = 4; var62 >= 0; var62--) {
                                        String var63 = method59(var10, var62);
                                        if (var63 != null) {
                                            method1395(var63, var10.field2637, 57, var62 + 1, var10.field2620, var10.field2640);
                                        }
                                    }
                                    if (class162.method1863(method1225(var10))) {
                                        method1395(class134.field2097, "", 30, 0, var10.field2620, var10.field2640);
                                    }
                                } else if (class162.method2237(method1225(var10)) && (Statics.field1524 & 0x20) == 32) {
                                    method1395(field642, field595 + " " + class2.field21 + " " + var10.field2637, 58, 0, var10.field2620, var10.field2640);
                                }
                            }
                        }
                        if (var10.field2665 == 0) {
                            if (!var10.field2576 && method3083(var10) && Statics.field137 != var10) {
                                continue;
                            }
                            if (!var10.field2576) {
                                if (var10.field2656 > var10.field2593 - var10.field2587) {
                                    var10.field2656 = var10.field2593 - var10.field2587;
                                }
                                if (var10.field2656 < 0) {
                                    var10.field2656 = 0;
                                }
                            }
                            method1662(arg0, var10.field2640, var20, var21, var22, var23, var13 - var10.field2590, var14 - var10.field2656, var11);
                            if (var10.field2685 != null) {
                                method1662(var10.field2685, var10.field2640, var20, var21, var22, var23, var13 - var10.field2590, var14 - var10.field2656, var11);
                            }
                            class4 var64 = (class4) field645.method3273((long) var10.field2640);
                            if (var64 != null) {
                                if (var64.field57 == 0 && class77.field1391 >= var20 && class77.field1396 >= var21 && class77.field1391 < var22 && class77.field1396 < var23 && !field580 && !field653) {
                                    field680[0] = class134.field2195;
                                    field633[0] = "";
                                    field630[0] = 1006;
                                    field627 = 1;
                                }
                                int var65 = var64.field54;
                                if (class158.method829(var65)) {
                                    Statics.field2050 = null;
                                    method1662(Statics.field2570[var65], -1, var20, var21, var22, var23, var13, var14, var11);
                                    if (Statics.field2050 != null) {
                                        method1662(Statics.field2050, -1412584499, var20, var21, var22, var23, Statics.field2009, Statics.field1547, var11);
                                        Statics.field2050 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var66 = 0; var66 < 100; var66++) {
                                        field687[var66] = true;
                                    }
                                } else {
                                    field687[var11] = true;
                                }
                            }
                            class89.method1787(arg2, arg3, arg4, arg5);
                            class104.method2182();
                        }
                        if (field689[var11] || field694 > 1) {
                            if (var10.field2665 == 0 && !var10.field2576 && var10.field2593 > var10.field2587) {
                                int var67 = var10.field2586 + var13;
                                int var68 = var10.field2656;
                                int var69 = var10.field2587;
                                int var70 = var10.field2593;
                                Statics.field247[0].method1781(var67, var14);
                                Statics.field247[1].method1781(var67, var14 + var69 - 16);
                                class89.method1796(var67, var14 + 16, 16, var69 - 32, field663);
                                int var71 = (var69 - 32) * var69 / var70;
                                if (var71 < 8) {
                                    var71 = 8;
                                }
                                int var72 = (var69 - 32 - var71) * var68 / (var70 - var69);
                                class89.method1796(var67, var14 + 16 + var72, 16, var71, field699);
                                class89.method1830(var67, var14 + 16 + var72, var71, field606);
                                class89.method1830(var67 + 1, var14 + 16 + var72, var71, field606);
                                class89.method1797(var67, var14 + 16 + var72, 16, field606);
                                class89.method1797(var67, var14 + 17 + var72, 16, field606);
                                class89.method1830(var67 + 15, var14 + 16 + var72, var71, field565);
                                class89.method1830(var67 + 14, var14 + 17 + var72, var71 - 1, field565);
                                class89.method1797(var67, var14 + 15 + var72 + var71, 16, field565);
                                class89.method1797(var67 + 1, var14 + 14 + var72 + var71, 15, field565);
                            }
                            if (var10.field2665 != 1) {
                                if (var10.field2665 == 2) {
                                    int var73 = 0;
                                    for (int var74 = 0; var74 < var10.field2587; var74++) {
                                        for (int var75 = 0; var75 < var10.field2586; var75++) {
                                            int var76 = (var10.field2612 + 32) * var75 + var13;
                                            int var77 = (var10.field2653 + 32) * var74 + var14;
                                            if (var73 < 20) {
                                                var76 += var10.field2632[var73];
                                                var77 += var10.field2633[var73];
                                            }
                                            if (var10.field2638[var73] > 0) {
                                                boolean var78 = false;
                                                boolean var79 = false;
                                                int var80 = var10.field2638[var73] - 1;
                                                if (var76 + 32 > arg2 && var76 < arg4 && var77 + 32 > arg3 && var77 < arg5 || Statics.field888 == var10 && field597 == var73) {
                                                    class86 var81;
                                                    if (field638 == 1 && Statics.field1439 == var73 && Statics.field1118 == var10.field2640) {
                                                        var81 = class40.method1523(var80, var10.field2592[var73], 2, 0, false);
                                                    } else {
                                                        var81 = class40.method1523(var80, var10.field2592[var73], 1, 3153952, false);
                                                    }
                                                    if (var81 == null) {
                                                        method1610(var10);
                                                    } else if (Statics.field888 == var10 && field597 == var73) {
                                                        int var82 = class77.field1391 - field598;
                                                        int var83 = class77.field1396 - field599;
                                                        if (var82 < 5 && var82 > -5) {
                                                            var82 = 0;
                                                        }
                                                        if (var83 < 5 && var83 > -5) {
                                                            var83 = 0;
                                                        }
                                                        if (field640 < 5) {
                                                            var82 = 0;
                                                            var83 = 0;
                                                        }
                                                        var81.method1688(var76 + var82, var77 + var83, 128);
                                                        if (arg1 != -1) {
                                                            class158 var84 = arg0[arg1 & 0xFFFF];
                                                            if (var77 + var83 < class89.field1487 && var84.field2656 > 0) {
                                                                int var85 = field526 * (class89.field1487 - var77 - var83) / 3;
                                                                if (var85 > field526 * 10) {
                                                                    var85 = field526 * 10;
                                                                }
                                                                if (var85 > var84.field2656) {
                                                                    var85 = var84.field2656;
                                                                }
                                                                var84.field2656 -= var85;
                                                                field599 += var85;
                                                                method1610(var84);
                                                            }
                                                            if (var77 + var83 + 32 > class89.field1483 && var84.field2656 < var84.field2593 - var84.field2587) {
                                                                int var86 = field526 * (var77 + var83 + 32 - class89.field1483) / 3;
                                                                if (var86 > field526 * 10) {
                                                                    var86 = field526 * 10;
                                                                }
                                                                if (var86 > var84.field2593 - var84.field2587 - var84.field2656) {
                                                                    var86 = var84.field2593 - var84.field2587 - var84.field2656;
                                                                }
                                                                var84.field2656 += var86;
                                                                field599 -= var86;
                                                                method1610(var84);
                                                            }
                                                        }
                                                    } else if (Statics.field162 == var10 && field596 == var73) {
                                                        var81.method1688(var76, var77, 128);
                                                    } else {
                                                        var81.method1700(var76, var77);
                                                    }
                                                }
                                            } else if (var10.field2579 != null && var73 < 20) {
                                                class86 var87 = var10.method3135(var73);
                                                if (var87 != null) {
                                                    var87.method1700(var76, var77);
                                                } else if (class158.field2575) {
                                                    method1610(var10);
                                                }
                                            }
                                            var73++;
                                        }
                                    }
                                } else if (var10.field2665 == 3) {
                                    int var88;
                                    if (method893(var10)) {
                                        var88 = var10.field2679;
                                        if (Statics.field137 == var10 && var10.field2597 != 0) {
                                            var88 = var10.field2597;
                                        }
                                    } else {
                                        var88 = var10.field2594;
                                        if (Statics.field137 == var10 && var10.field2596 != 0) {
                                            var88 = var10.field2596;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2648) {
                                            class89.method1796(var13, var14, var10.field2586, var10.field2587, var88);
                                        } else {
                                            class89.method1829(var13, var14, var10.field2586, var10.field2587, var88);
                                        }
                                    } else if (var10.field2648) {
                                        class89.method1792(var13, var14, var10.field2586, var10.field2587, var88, 256 - (var15 & 0xFF));
                                    } else {
                                        class89.method1802(var13, var14, var10.field2586, var10.field2587, var88, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2665 == 4) {
                                    class183 var89 = var10.method3103();
                                    if (var89 != null) {
                                        String var90 = var10.field2634;
                                        int var91;
                                        if (method893(var10)) {
                                            var91 = var10.field2679;
                                            if (Statics.field137 == var10 && var10.field2597 != 0) {
                                                var91 = var10.field2597;
                                            }
                                            if (var10.field2625.length() > 0) {
                                                var90 = var10.field2625;
                                            }
                                        } else {
                                            var91 = var10.field2594;
                                            if (Statics.field137 == var10 && var10.field2596 != 0) {
                                                var91 = var10.field2596;
                                            }
                                        }
                                        if (var10.field2576 && var10.field2681 != -1) {
                                            class40 var92 = class40.method548(var10.field2681);
                                            var90 = var92.field989;
                                            if (var90 == null) {
                                                var90 = "null";
                                            }
                                            if ((var92.field1000 == 1 || var10.field2682 != 1) && var10.field2682 != -1) {
                                                var90 = class2.method1(16748608) + var90 + class2.field26 + " " + 'x' + method630(var10.field2682);
                                            }
                                        }
                                        if (field648 == var10) {
                                            class134 var151 = (class134) null;
                                            var90 = class134.field2240;
                                            var91 = var10.field2594;
                                        }
                                        if (!var10.field2576) {
                                            var90 = method229(var90, var10);
                                        }
                                        var89.method3369(var90, var13, var14, var10.field2586, var10.field2587, var91, var10.field2629 ? 0 : -1, var10.field2627, var10.field2628, var10.field2626);
                                    } else if (class158.field2575) {
                                        method1610(var10);
                                    }
                                } else if (var10.field2665 == 5) {
                                    if (var10.field2576) {
                                        class86 var94;
                                        if (var10.field2681 == -1) {
                                            var94 = var10.method3102(false);
                                        } else {
                                            var94 = class40.method1523(var10.field2681, var10.field2682, var10.field2605, var10.field2668, false);
                                        }
                                        if (var94 != null) {
                                            int var95 = var94.field1467;
                                            int var96 = var94.field1468;
                                            if (var10.field2604) {
                                                class89.method1788(var13, var14, var10.field2586 + var13, var10.field2587 + var14);
                                                int var97 = (var10.field2586 + (var95 - 1)) / var95;
                                                int var98 = (var10.field2587 + (var96 - 1)) / var96;
                                                for (int var99 = 0; var99 < var97; var99++) {
                                                    for (int var100 = 0; var100 < var98; var100++) {
                                                        if (var10.field2689 != 0) {
                                                            var94.method1694(var95 / 2 + var95 * var99 + var13, var96 / 2 + var96 * var100 + var14, var10.field2689, 4096);
                                                        } else if (var15 == 0) {
                                                            var94.method1700(var95 * var99 + var13, var96 * var100 + var14);
                                                        } else {
                                                            var94.method1688(var95 * var99 + var13, var96 * var100 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1787(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var101 = var10.field2586 * 4096 / var95;
                                                if (var10.field2689 != 0) {
                                                    var94.method1694(var10.field2586 / 2 + var13, var10.field2587 / 2 + var14, var10.field2689, var101);
                                                } else if (var15 != 0) {
                                                    var94.method1690(var13, var14, var10.field2586, var10.field2587, 256 - (var15 & 0xFF));
                                                } else if (var10.field2586 == var95 && var10.field2587 == var96) {
                                                    var94.method1700(var13, var14);
                                                } else {
                                                    var94.method1684(var13, var14, var10.field2586, var10.field2587);
                                                }
                                            }
                                        } else if (class158.field2575) {
                                            method1610(var10);
                                        }
                                    } else {
                                        class86 var93 = var10.method3102(method893(var10));
                                        if (var93 != null) {
                                            var93.method1700(var13, var14);
                                        } else if (class158.field2575) {
                                            method1610(var10);
                                        }
                                    }
                                } else if (var10.field2665 == 6) {
                                    boolean var102 = method893(var10);
                                    int var103;
                                    if (var102) {
                                        var103 = var10.field2614;
                                    } else {
                                        var103 = var10.field2613;
                                    }
                                    class112 var104 = null;
                                    int var105 = 0;
                                    if (var10.field2681 != -1) {
                                        class40 var106 = class40.method548(var10.field2681);
                                        if (var106 != null) {
                                            class40 var107 = var106.method838(var10.field2682);
                                            var104 = var107.method863(1);
                                            if (var104 == null) {
                                                method1610(var10);
                                            } else {
                                                var104.method2244();
                                                var105 = var104.field1548 / 2;
                                            }
                                        }
                                    } else if (var10.field2609 == 5) {
                                        if (var10.field2610 == 0) {
                                            var104 = field664.method3168((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var104 = Statics.field139.method17();
                                        }
                                    } else if (var103 == -1) {
                                        var104 = var10.method3112((class34) null, -1, var102, Statics.field139.field33);
                                        if (var104 == null && class158.field2575) {
                                            method1610(var10);
                                        }
                                    } else {
                                        class34 var108 = class34.method235(var103);
                                        var104 = var10.method3112(var108, var10.field2683, var102, Statics.field139.field33);
                                        if (var104 == null && class158.field2575) {
                                            method1610(var10);
                                        }
                                    }
                                    class104.method2133(var10.field2586 / 2 + var13, var10.field2587 / 2 + var14);
                                    int var109 = var10.field2680 * class104.field1787[var10.field2647] >> 16;
                                    int var110 = var10.field2680 * class104.field1788[var10.field2647] >> 16;
                                    if (var104 != null) {
                                        if (var10.field2576) {
                                            var104.method2244();
                                            if (var10.field2622) {
                                                var104.method2257(0, var10.field2618, var10.field2615, var10.field2647, var10.field2578, var10.field2669 + var105 + var109, var10.field2669 + var110, var10.field2680);
                                            } else {
                                                var104.method2256(0, var10.field2618, var10.field2615, var10.field2647, var10.field2578, var10.field2669 + var105 + var109, var10.field2669 + var110);
                                            }
                                        } else {
                                            var104.method2256(0, var10.field2618, 0, var10.field2647, 0, var109, var110);
                                        }
                                    }
                                    class104.method2149();
                                } else {
                                    if (var10.field2665 == 7) {
                                        class183 var111 = var10.method3103();
                                        if (var111 == null) {
                                            if (class158.field2575) {
                                                method1610(var10);
                                            }
                                            continue;
                                        }
                                        int var112 = 0;
                                        for (int var113 = 0; var113 < var10.field2587; var113++) {
                                            for (int var114 = 0; var114 < var10.field2586; var114++) {
                                                if (var10.field2638[var112] > 0) {
                                                    class40 var115 = class40.method548(var10.field2638[var112] - 1);
                                                    String var116;
                                                    if (var115.field1000 != 1 && var10.field2592[var112] == 1) {
                                                        var116 = class2.method1(16748608) + var115.field989 + class2.field26;
                                                    } else {
                                                        var116 = class2.method1(16748608) + var115.field989 + class2.field26 + " " + 'x' + method630(var10.field2592[var112]);
                                                    }
                                                    int var117 = (var10.field2612 + 115) * var114 + var13;
                                                    int var118 = (var10.field2653 + 12) * var113 + var14;
                                                    if (var10.field2627 == 0) {
                                                        var111.method3385(var116, var117, var118, var10.field2594, var10.field2629 ? 0 : -1);
                                                    } else if (var10.field2627 == 1) {
                                                        var111.method3433(var116, var10.field2586 / 2 + var117, var118, var10.field2594, var10.field2629 ? 0 : -1);
                                                    } else {
                                                        var111.method3367(var116, var10.field2586 + var117 - 1, var118, var10.field2594, var10.field2629 ? 0 : -1);
                                                    }
                                                }
                                                var112++;
                                            }
                                        }
                                    }
                                    if (var10.field2665 == 8 && Statics.field399 == var10 && field637 == field636) {
                                        int var119 = 0;
                                        int var120 = 0;
                                        class183 var121 = Statics.field1512;
                                        String var122 = var10.field2634;
                                        String var123 = method229(var122, var10);
                                        while (var123.length() > 0) {
                                            int var124 = var123.indexOf(class2.field22);
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var123;
                                                var123 = "";
                                            } else {
                                                var125 = var123.substring(0, var124);
                                                var123 = var123.substring(var124 + 4);
                                            }
                                            int var126 = var121.method3361(var125);
                                            if (var126 > var119) {
                                                var119 = var126;
                                            }
                                            var120 += var121.field2855 + 1;
                                        }
                                        var119 += 6;
                                        var120 += 7;
                                        int var127 = var10.field2586 + var13 - 5 - var119;
                                        int var128 = var10.field2587 + var14 + 5;
                                        if (var127 < var13 + 5) {
                                            var127 = var13 + 5;
                                        }
                                        if (var119 + var127 > arg4) {
                                            var127 = arg4 - var119;
                                        }
                                        if (var120 + var128 > arg5) {
                                            var128 = arg5 - var120;
                                        }
                                        class89.method1796(var127, var128, var119, var120, 16777120);
                                        class89.method1829(var127, var128, var119, var120, 0);
                                        String var129 = var10.field2634;
                                        int var130 = var121.field2855 + var128 + 2;
                                        String var131 = method229(var129, var10);
                                        while (var131.length() > 0) {
                                            int var132 = var131.indexOf(class2.field22);
                                            String var133;
                                            if (var132 == -1) {
                                                var133 = var131;
                                                var131 = "";
                                            } else {
                                                var133 = var131.substring(0, var132);
                                                var131 = var131.substring(var132 + 4);
                                            }
                                            var121.method3385(var133, var127 + 3, var130, 0, -1);
                                            var130 += var121.field2855 + 1;
                                        }
                                    }
                                    if (var10.field2665 == 9) {
                                        if (var10.field2600 == 1) {
                                            class89.method1821(var13, var14, var10.field2586 + var13, var10.field2587 + var14, var10.field2594);
                                        } else {
                                            int var134 = var10.field2586 >= 0 ? var10.field2586 : -var10.field2586;
                                            int var135 = var10.field2587 >= 0 ? var10.field2587 : -var10.field2587;
                                            int var136 = var134;
                                            if (var134 < var135) {
                                                var136 = var135;
                                            }
                                            if (var136 != 0) {
                                                int var137 = (var10.field2586 << 16) / var136;
                                                int var138 = (var10.field2587 << 16) / var136;
                                                if (var138 <= var137) {
                                                    var137 = -var137;
                                                } else {
                                                    var138 = -var138;
                                                }
                                                int var139 = var10.field2600 * var138 >> 17;
                                                int var140 = var10.field2600 * var138 + 1 >> 17;
                                                int var141 = var10.field2600 * var137 >> 17;
                                                int var142 = var10.field2600 * var137 + 1 >> 17;
                                                int var143 = var13 + var139;
                                                int var144 = var13 - var140;
                                                int var145 = var10.field2586 + var13 - var140;
                                                int var146 = var10.field2586 + var13 + var139;
                                                int var147 = var14 + var141;
                                                int var148 = var14 - var142;
                                                int var149 = var10.field2587 + var14 - var142;
                                                int var150 = var10.field2587 + var14 + var141;
                                                class104.method2168(var143, var144, var145);
                                                class104.method2143(var147, var148, var149, var143, var144, var145, var10.field2594);
                                                class104.method2168(var143, var145, var146);
                                                class104.method2143(var147, var149, var150, var143, var145, var146, var10.field2594);
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

    @ObfuscatedName("c.bt(Ljava/lang/String;Lfr;I)Ljava/lang/String;")
    public static String method229(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + Statics.method166(method189(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field306 != null) {
                    int var6 = Statics.field306.field1413;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field306.field1411 != null) {
                        var5 = (String) Statics.field306.field1411;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("aw.cd(IS)Ljava/lang/String;")
    public static final String method630(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1(65408) + var1.substring(0, var1.length() - 8) + class134.field2092 + " " + class2.field16 + var1 + class2.field25 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method1(16777215) + var1.substring(0, var1.length() - 4) + class134.field2245 + " " + class2.field16 + var1 + class2.field25 + class2.field26;
        } else {
            return " " + class2.method1(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("z.ca(Lfr;IIIIIII)V")
    public static final void method151(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field692) {
            field568 = 32;
        } else {
            field568 = 0;
        }
        field692 = false;
        if (class77.field1389 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2656 -= 4;
                method1610(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2656 += 4;
                method1610(arg0);
            } else if (arg5 >= arg1 - field568 && arg5 < field568 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2656 = (arg4 - arg3) * var8 / var9;
                method1610(arg0);
                field692 = true;
            }
        }
        if (field655 == 0) {
            return;
        }
        int var10 = arg0.field2586;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2656 += field655 * 45;
            method1610(arg0);
        }
    }

    @ObfuscatedName("ac.cq(Lfr;I)Z")
    public static final boolean method893(class158 arg0) {
        if (arg0.field2674 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2674.length; var1++) {
            int var2 = method189(arg0, var1);
            int var3 = arg0.field2675[var1];
            if (arg0.field2674[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2674[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2674[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("j.cg(Lfr;II)I")
    public static final int method189(class158 arg0, int arg1) {
        if (arg0.field2673 == null || arg1 >= arg0.field2673.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2673[arg1];
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
                    var7 = field622[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field623[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field530[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class158 var11 = class158.method2658(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method548(var12).field1020 || field654)) {
                        for (int var13 = 0; var13 < var11.field2638.length; var13++) {
                            if (var12 + 1 == var11.field2638[var13]) {
                                var7 += var11.field2592[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2697[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2051[field623[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2697[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field139.field38;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2052[var14]) {
                            var7 += field623[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method2658(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method548(var18).field1020 || field654)) {
                        for (int var19 = 0; var19 < var17.field2638.length; var19++) {
                            if (var18 + 1 == var17.field2638[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field649;
                }
                if (var6 == 12) {
                    var7 = field559;
                }
                if (var6 == 13) {
                    int var20 = class159.field2697[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method2663(var22);
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
                    var7 = (Statics.field139.field429 >> 7) + Statics.field1518;
                }
                if (var6 == 19) {
                    var7 = (Statics.field139.field423 >> 7) + Statics.field1830;
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

    @ObfuscatedName("ac.cc([Lfr;IIIIIIIB)V")
    public static final void method881(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2576 || var9.field2665 == 0 || var9.field2644 || method1225(var9) != 0 || field741 == var9) && var9.field2588 == arg1 && (!var9.field2576 || !method3083(var9))) {
                int var10 = var9.field2582 + arg6;
                int var11 = var9.field2580 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2665 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2665 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2586 + var10;
                    int var19 = var9.field2587 + var11;
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
                    int var22 = var9.field2586 + var10;
                    int var23 = var9.field2587 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field503 == var9) {
                    field704 = true;
                    field709 = var10;
                    field665 = var11;
                }
                if (!var9.field2576 || var12 < var14 && var13 < var15) {
                    if (var9.field2581 == 1337) {
                        method1610(var9);
                    } else if (var9.field2581 == 1338) {
                        method154(var10, var11);
                    } else {
                        if (var9.field2665 == 0) {
                            if (!var9.field2576 && method3083(var9) && Statics.field137 != var9) {
                                continue;
                            }
                            method881(arg0, var9.field2640, var12, var13, var14, var15, var10 - var9.field2590, var11 - var9.field2656);
                            if (var9.field2685 != null) {
                                method881(var9.field2685, var9.field2640, var12, var13, var14, var15, var10 - var9.field2590, var11 - var9.field2656);
                            }
                            class4 var24 = (class4) field645.method3273((long) var9.field2640);
                            if (var24 != null) {
                                Statics.method904(var24.field54, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2576) {
                            boolean var25;
                            if (class77.field1391 >= var12 && class77.field1396 >= var13 && class77.field1391 < var14 && class77.field1396 < var15) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            boolean var26 = false;
                            if (class77.field1389 == 1 && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            if (class77.field1390 == 1 && class77.field1398 >= var12 && class77.field1385 >= var13 && class77.field1398 < var14 && class77.field1385 < var15) {
                                var27 = true;
                            }
                            if (var27) {
                                method2316(var9, class77.field1398 - var10, class77.field1385 - var11);
                            }
                            if (field503 != null && field503 != var9 && var25 && class162.method820(method1225(var9))) {
                                field659 = var9;
                            }
                            if (field741 == var9) {
                                field660 = true;
                                field625 = var10;
                                field662 = var11;
                            }
                            if (var9.field2644) {
                                if (var25 && field655 != 0 && var9.field2662 != null) {
                                    class1 var28 = new class1();
                                    var28.field2 = var9;
                                    var28.field8 = field655;
                                    var28.field12 = var9.field2662;
                                    field537.method3289(var28);
                                }
                                if (field503 != null || Statics.field888 != null || field580) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (!var9.field2687 && var27) {
                                    var9.field2687 = true;
                                    if (var9.field2646 != null) {
                                        class1 var29 = new class1();
                                        var29.field2 = var9;
                                        var29.field3 = class77.field1398 - var10;
                                        var29.field8 = class77.field1385 - var11;
                                        var29.field12 = var9.field2646;
                                        field537.method3289(var29);
                                    }
                                }
                                if (var9.field2687 && var26 && var9.field2630 != null) {
                                    class1 var30 = new class1();
                                    var30.field2 = var9;
                                    var30.field3 = class77.field1391 - var10;
                                    var30.field8 = class77.field1396 - var11;
                                    var30.field12 = var9.field2630;
                                    field537.method3289(var30);
                                }
                                if (var9.field2687 && !var26) {
                                    var9.field2687 = false;
                                    if (var9.field2660 != null) {
                                        class1 var31 = new class1();
                                        var31.field2 = var9;
                                        var31.field3 = class77.field1391 - var10;
                                        var31.field8 = class77.field1396 - var11;
                                        var31.field12 = var9.field2660;
                                        field683.method3289(var31);
                                    }
                                }
                                if (var26 && var9.field2649 != null) {
                                    class1 var32 = new class1();
                                    var32.field2 = var9;
                                    var32.field3 = class77.field1391 - var10;
                                    var32.field8 = class77.field1396 - var11;
                                    var32.field12 = var9.field2649;
                                    field537.method3289(var32);
                                }
                                if (!var9.field2686 && var25) {
                                    var9.field2686 = true;
                                    if (var9.field2650 != null) {
                                        class1 var33 = new class1();
                                        var33.field2 = var9;
                                        var33.field3 = class77.field1391 - var10;
                                        var33.field8 = class77.field1396 - var11;
                                        var33.field12 = var9.field2650;
                                        field537.method3289(var33);
                                    }
                                }
                                if (var9.field2686 && var25 && var9.field2651 != null) {
                                    class1 var34 = new class1();
                                    var34.field2 = var9;
                                    var34.field3 = class77.field1391 - var10;
                                    var34.field8 = class77.field1396 - var11;
                                    var34.field12 = var9.field2651;
                                    field537.method3289(var34);
                                }
                                if (var9.field2686 && !var25) {
                                    var9.field2686 = false;
                                    if (var9.field2652 != null) {
                                        class1 var35 = new class1();
                                        var35.field2 = var9;
                                        var35.field3 = class77.field1391 - var10;
                                        var35.field8 = class77.field1396 - var11;
                                        var35.field12 = var9.field2652;
                                        field683.method3289(var35);
                                    }
                                }
                                if (var9.field2659 != null) {
                                    class1 var36 = new class1();
                                    var36.field2 = var9;
                                    var36.field12 = var9.field2659;
                                    field746.method3289(var36);
                                }
                                if (var9.field2657 != null && field669 > var9.field2595) {
                                    if (var9.field2655 == null || field669 - var9.field2595 > 32) {
                                        class1 var41 = new class1();
                                        var41.field2 = var9;
                                        var41.field12 = var9.field2657;
                                        field537.method3289(var41);
                                    } else {
                                        label378: for (int var37 = var9.field2595; var37 < field669; var37++) {
                                            int var38 = field668[var37 & 0x1F];
                                            for (int var39 = 0; var39 < var9.field2655.length; var39++) {
                                                if (var9.field2655[var39] == var38) {
                                                    class1 var40 = new class1();
                                                    var40.field2 = var9;
                                                    var40.field12 = var9.field2657;
                                                    field537.method3289(var40);
                                                    break label378;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2595 = field669;
                                }
                                if (var9.field2631 != null && field671 > var9.field2690) {
                                    if (var9.field2606 == null || field671 - var9.field2690 > 32) {
                                        class1 var46 = new class1();
                                        var46.field2 = var9;
                                        var46.field12 = var9.field2631;
                                        field537.method3289(var46);
                                    } else {
                                        label358: for (int var42 = var9.field2690; var42 < field671; var42++) {
                                            int var43 = field579[var42 & 0x1F];
                                            for (int var44 = 0; var44 < var9.field2606.length; var44++) {
                                                if (var9.field2606[var44] == var43) {
                                                    class1 var45 = new class1();
                                                    var45.field2 = var9;
                                                    var45.field12 = var9.field2631;
                                                    field537.method3289(var45);
                                                    break label358;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2690 = field671;
                                }
                                if (var9.field2621 != null && field673 > var9.field2591) {
                                    if (var9.field2688 == null || field673 - var9.field2591 > 32) {
                                        class1 var51 = new class1();
                                        var51.field2 = var9;
                                        var51.field12 = var9.field2621;
                                        field537.method3289(var51);
                                    } else {
                                        label338: for (int var47 = var9.field2591; var47 < field673; var47++) {
                                            int var48 = field672[var47 & 0x1F];
                                            for (int var49 = 0; var49 < var9.field2688.length; var49++) {
                                                if (var9.field2688[var49] == var48) {
                                                    class1 var50 = new class1();
                                                    var50.field2 = var9;
                                                    var50.field12 = var9.field2621;
                                                    field537.method3289(var50);
                                                    break label338;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2591 = field673;
                                }
                                if (field483 > var9.field2663 && var9.field2666 != null) {
                                    class1 var52 = new class1();
                                    var52.field2 = var9;
                                    var52.field12 = var9.field2666;
                                    field537.method3289(var52);
                                }
                                if (field675 > var9.field2663 && var9.field2572 != null) {
                                    class1 var53 = new class1();
                                    var53.field2 = var9;
                                    var53.field12 = var9.field2572;
                                    field537.method3289(var53);
                                }
                                if (field676 > var9.field2663 && var9.field2619 != null) {
                                    class1 var54 = new class1();
                                    var54.field2 = var9;
                                    var54.field12 = var9.field2619;
                                    field537.method3289(var54);
                                }
                                if (field677 > var9.field2663 && var9.field2670 != null) {
                                    class1 var55 = new class1();
                                    var55.field2 = var9;
                                    var55.field12 = var9.field2670;
                                    field537.method3289(var55);
                                }
                                var9.field2663 = field682;
                                if (var9.field2667 != null) {
                                    for (int var56 = 0; var56 < field705; var56++) {
                                        class1 var57 = new class1();
                                        var57.field2 = var9;
                                        var57.field5 = field613[var56];
                                        var57.field10 = field706[var56];
                                        var57.field12 = var9.field2667;
                                        field537.method3289(var57);
                                    }
                                }
                            }
                        }
                        if (!var9.field2576) {
                            if (field503 != null || Statics.field888 != null || field580) {
                                return;
                            }
                            if ((var9.field2676 >= 0 || var9.field2596 != 0) && class77.field1391 >= var12 && class77.field1396 >= var13 && class77.field1391 < var14 && class77.field1396 < var15) {
                                if (var9.field2676 >= 0) {
                                    Statics.field137 = arg0[var9.field2676];
                                } else {
                                    Statics.field137 = var9;
                                }
                            }
                            if (var9.field2665 == 8 && class77.field1391 >= var12 && class77.field1396 >= var13 && class77.field1391 < var14 && class77.field1396 < var15) {
                                Statics.field399 = var9;
                            }
                            if (var9.field2593 > var9.field2587) {
                                method151(var9, var9.field2586 + var10, var11, var9.field2587, var9.field2593, class77.field1391, class77.field1396);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.cx(III)V")
    public static final void method2038(int arg0, int arg1) {
        if (class158.method829(arg0)) {
            method239(Statics.field2570[arg0], arg1);
        }
    }

    @ObfuscatedName("y.cu([Lfr;II)V")
    public static final void method239(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2665 == 0) {
                    if (var3.field2685 != null) {
                        method239(var3.field2685, arg1);
                    }
                    class4 var4 = (class4) field645.method3273((long) var3.field2640);
                    if (var4 != null) {
                        method2038(var4.field54, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2671 != null) {
                    class1 var5 = new class1();
                    var5.field2 = var3;
                    var5.field12 = var3.field2671;
                    class26.method1870(var5);
                }
                if (arg1 == 1 && var3.field2672 != null) {
                    if (var3.field2620 >= 0) {
                        class158 var6 = class158.method2658(var3.field2640);
                        if (var6 == null || var6.field2685 == null || var3.field2620 >= var6.field2685.length || var6.field2685[var3.field2620] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field2 = var3;
                    var7.field12 = var3.field2672;
                    class26.method1870(var7);
                }
            }
        }
    }

    @ObfuscatedName("dc.cj(Lfr;III)V")
    public static final void method2316(class158 arg0, int arg1, int arg2) {
        if (field503 != null || field580 || arg0 == null) {
            return;
        }
        class158 var3 = arg0;
        int var4 = class162.method2692(method1225(arg0));
        class158 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class158.method2658(var3.field2588);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class158 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2639;
        }
        if (var7 == null) {
            return;
        }
        field503 = arg0;
        class158 var9 = arg0;
        int var10 = class162.method2692(method1225(arg0));
        class158 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class158.method2658(var9.field2588);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class158 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2639;
        }
        field741 = var13;
        field657 = arg1;
        field658 = arg2;
        Statics.field192 = 0;
        field666 = false;
        return;
    }

    @ObfuscatedName("l.cp(I)V")
    public static final void method120() {
        method1610(field503);
        Statics.field192++;
        if (field704 && field660) {
            int var0 = class77.field1391;
            int var1 = class77.field1396;
            int var2 = var0 - field657;
            int var3 = var1 - field658;
            if (var2 < field625) {
                var2 = field625;
            }
            if (field503.field2586 + var2 > field625 + field741.field2586) {
                var2 = field625 + field741.field2586 - field503.field2586;
            }
            if (var3 < field662) {
                var3 = field662;
            }
            if (field503.field2587 + var3 > field662 + field741.field2587) {
                var3 = field662 + field741.field2587 - field503.field2587;
            }
            int var4 = var2 - field709;
            int var5 = var3 - field665;
            int var6 = field503.field2568;
            if (Statics.field192 > field503.field2641 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field666 = true;
            }
            int var7 = field741.field2590 + (var2 - field625);
            int var8 = field741.field2656 + (var3 - field662);
            if (field503.field2658 != null && field666) {
                class1 var9 = new class1();
                var9.field2 = field503;
                var9.field3 = var7;
                var9.field8 = var8;
                var9.field12 = field503.field2658;
                class26.method1870(var9);
            }
            if (class77.field1389 == 0) {
                if (field666) {
                    if (field503.field2654 != null) {
                        class1 var10 = new class1();
                        var10.field2 = field503;
                        var10.field3 = var7;
                        var10.field8 = var8;
                        var10.field6 = field659;
                        var10.field12 = field503.field2654;
                        class26.method1870(var10);
                    }
                    if (field659 != null) {
                        class158 var11 = field503;
                        int var12 = class162.method2692(method1225(var11));
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
                                var11 = class158.method2658(var11.field2588);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field520.method2325(79);
                            field520.method2481(field659.field2620);
                            field520.method2480(field503.field2620);
                            field520.method2490(field503.field2640);
                            field520.method2489(field659.field2640);
                        }
                    }
                } else if ((field556 == 1 || method2956(field627 - 1)) && field627 > 2) {
                    Statics.method10();
                } else if (field627 > 0) {
                    method2222(field627 - 1);
                }
                field503 = null;
            }
        } else if (Statics.field192 > 1) {
            field503 = null;
        }
    }

    @ObfuscatedName("cg.cm(Lfr;I)V")
    public static void method1610(class158 arg0) {
        if (field686 == arg0.field2693) {
            field687[arg0.field2692] = true;
        }
    }

    @ObfuscatedName("client.ch(I)V")
    public static void method545() {
        for (class4 var0 = (class4) field645.method3276(); var0 != null; var0 = (class4) field645.method3277()) {
            int var1 = var0.field54;
            if (class158.method829(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2570[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2576;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2817;
                    class158 var6 = class158.method2658(var5);
                    if (var6 != null) {
                        method1610(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cn.cz([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2129(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("r.cw(II)V")
    public static final void method100(int arg0) {
        if (!class158.method829(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2570[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3 != null) {
                var3.field2683 = 0;
                var3.field2684 = 0;
            }
        }
    }

    @ObfuscatedName("an.cr([Lfr;IB)V")
    public static final void method675(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2588 == arg1 && (!var3.field2576 || !method3083(var3))) {
                if (var3.field2665 == 0) {
                    if (!var3.field2576 && method3083(var3) && Statics.field137 != var3) {
                        continue;
                    }
                    method675(arg0, var3.field2640);
                    if (var3.field2685 != null) {
                        method675(var3.field2685, var3.field2640);
                    }
                    class4 var4 = (class4) field645.method3273((long) var3.field2640);
                    if (var4 != null) {
                        int var5 = var4.field54;
                        if (class158.method829(var5)) {
                            method675(Statics.field2570[var5], -1);
                        }
                    }
                }
                if (var3.field2665 == 6) {
                    if (var3.field2613 != -1 || var3.field2614 != -1) {
                        boolean var6 = method893(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2614;
                        } else {
                            var7 = var3.field2613;
                        }
                        if (var7 != -1) {
                            class34 var8 = class34.method235(var7);
                            var3.field2684 += field526;
                            while (var3.field2684 > var8.field891[var3.field2683]) {
                                var3.field2684 -= var8.field891[var3.field2683];
                                var3.field2683++;
                                if (var3.field2683 >= var8.field889.length) {
                                    var3.field2683 -= var8.field898;
                                    if (var3.field2683 < 0 || var3.field2683 >= var8.field889.length) {
                                        var3.field2683 = 0;
                                    }
                                }
                                method1610(var3);
                            }
                        }
                    }
                    if (var3.field2602 != 0 && !var3.field2576) {
                        int var9 = var3.field2602 >> 16;
                        int var10 = var3.field2602 << 16 >> 16;
                        int var11 = field526 * var9;
                        int var12 = field526 * var10;
                        var3.field2647 = var3.field2647 + var11 & 0x7FF;
                        var3.field2618 = var3.field2618 + var12 & 0x7FF;
                        method1610(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.cy(IB)V")
    public static final void method228(int arg0) {
        method545();
        for (class7 var1 = (class7) class7.field91.method3294(); var1 != null; var1 = (class7) class7.field91.method3296()) {
            if (var1.field101 != null) {
                var1.method45();
            }
        }
        int var2 = class42.method2661(arg0).field1042;
        if (var2 == 0) {
            return;
        }
        int var3 = class159.field2697[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class104.method2137(0.9D);
                ((class110) Statics.field1780).method2225(0.9D);
            }
            if (var3 == 2) {
                class104.method2137(0.8D);
                ((class110) Statics.field1780).method2225(0.8D);
            }
            if (var3 == 3) {
                class104.method2137(0.7D);
                ((class110) Statics.field1780).method2225(0.7D);
            }
            if (var3 == 4) {
                class104.method2137(0.6D);
                ((class110) Statics.field1780).method2225(0.6D);
            }
            class40.field1022.method3243();
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
            if (field719 != var4) {
                if (field719 == 0 && field720 != -1) {
                    class138.method3160(Statics.field1034, field720, 0, var4, false);
                    field563 = false;
                } else if (var4 == 0) {
                    Statics.field2342.method2747();
                    class138.field2338 = 1;
                    Statics.field2343 = null;
                    field563 = false;
                } else {
                    class138.method2037(var4);
                }
                field719 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field722 = 127;
            }
            if (var3 == 1) {
                field722 = 96;
            }
            if (var3 == 2) {
                field722 = 64;
            }
            if (var3 == 3) {
                field722 = 32;
            }
            if (var3 == 4) {
                field722 = 0;
            }
        }
        if (var2 == 5) {
            field556 = var3;
        }
        if (var2 == 6) {
            field646 = var3;
        }
        if (var2 == 9) {
            field647 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field539 = 127;
        }
        if (var3 == 1) {
            field539 = 96;
        }
        if (var3 == 2) {
            field539 = 64;
        }
        if (var3 == 3) {
            field539 = 32;
        }
        if (var3 == 4) {
            field539 = 0;
        }
    }

    @ObfuscatedName("r.cs(Le;ZI)V")
    public static final void method61(class4 arg0, boolean arg1) {
        int var2 = arg0.field54;
        int var3 = (int) arg0.field2817;
        arg0.method3328();
        if (arg1 && var2 != -1 && Statics.field2569[var2]) {
            Statics.field2664.method2982(var2);
            if (Statics.field2570[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2570[var2].length; var5++) {
                    if (Statics.field2570[var2][var5] != null) {
                        if (Statics.field2570[var2][var5].field2665 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2570[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2570[var2] = null;
                }
                Statics.field2569[var2] = false;
            }
        }
        for (class171 var6 = (class171) field684.method3276(); var6 != null; var6 = (class171) field684.method3277()) {
            if ((long) var2 == (var6.field2817 >> 48 & 0xFFFFL)) {
                var6.method3328();
            }
        }
        class158 var7 = class158.method2658(var3);
        if (var7 != null) {
            method1610(var7);
        }
        for (int var8 = 0; var8 < field627; var8++) {
            if (method94(field630[var8])) {
                if (var8 < field627 - 1) {
                    for (int var9 = var8; var9 < field627 - 1; var9++) {
                        field680[var9] = field680[var9 + 1];
                        field633[var9] = field633[var9 + 1];
                        field630[var9] = field630[var9 + 1];
                        field631[var9] = field631[var9 + 1];
                        field628[var9] = field628[var9 + 1];
                        field629[var9] = field629[var9 + 1];
                    }
                }
                field627--;
            }
        }
        if (field644 != -1) {
            method2038(field644, 1);
        }
    }

    @ObfuscatedName("client.cf(Lfr;I)Z")
    public static final boolean method515(class158 arg0) {
        int var1 = arg0.field2581;
        if (var1 == 205) {
            field527 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field664.method3182(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field664.method3164(var4, var5 == 1);
        }
        if (var1 == 324) {
            field664.method3165(false);
        }
        if (var1 == 325) {
            field664.method3165(true);
        }
        if (var1 == 326) {
            field520.method2325(115);
            field664.method3166(field520);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cg.ci(IIII)V")
    public static final void method1586(int arg0, int arg1, int arg2) {
        method736();
        class89.method1787(arg0, arg1, Statics.field1835.field1476 + arg0, Statics.field1835.field1478 + arg1);
        if (field718 == 2 || field718 == 5) {
            class89.method1837(arg0 + 25, arg1 + 5, 0, Statics.field1932, Statics.field1045);
        } else {
            int var3 = field570 + field555 & 0x7FF;
            int var4 = Statics.field139.field429 / 32 + 48;
            int var5 = 464 - Statics.field139.field423 / 32;
            Statics.field259.method1692(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field557 + 256, Statics.field1932, Statics.field1045);
            for (int var6 = 0; var6 < field712; var6++) {
                int var7 = field713[var6] * 4 + 2 - Statics.field139.field429 / 32;
                int var8 = field714[var6] * 4 + 2 - Statics.field139.field423 / 32;
                Statics.method36(arg0, arg1, var7, var8, field715[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field519[Statics.field379][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field139.field429 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field139.field423 / 32;
                        Statics.method36(arg0, arg1, var12, var13, Statics.field400[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field726; var14++) {
                class25 var15 = field632[field487[var14]];
                if (var15 != null && var15.method26()) {
                    class31 var16 = var15.field396;
                    if (var16 != null && var16.field814 != null) {
                        var16 = var16.method634();
                    }
                    if (var16 != null && var16.field805 && var16.field817) {
                        int var17 = var15.field429 / 32 - Statics.field139.field429 / 32;
                        int var18 = var15.field423 / 32 - Statics.field139.field423 / 32;
                        Statics.method36(arg0, arg1, var17, var18, Statics.field400[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field605; var19++) {
                class3 var20 = field604[field525[var19]];
                if (var20 != null && var20.method26()) {
                    int var21 = var20.field429 / 32 - Statics.field139.field429 / 32;
                    int var22 = var20.field423 / 32 - Statics.field139.field423 / 32;
                    boolean var23 = false;
                    if (method192(var20.field36)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field1189; var25++) {
                        if (var20.field36.equals(Statics.field1027[var25].field113)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field139.field50 != 0 && var20.field50 != 0 && Statics.field139.field50 == var20.field50) {
                        var26 = true;
                    }
                    if (var23) {
                        Statics.method36(arg0, arg1, var21, var22, Statics.field400[3]);
                    } else if (var26) {
                        Statics.method36(arg0, arg1, var21, var22, Statics.field400[4]);
                    } else if (var24) {
                        Statics.method36(arg0, arg1, var21, var22, Statics.field400[5]);
                    } else {
                        Statics.method36(arg0, arg1, var21, var22, Statics.field400[2]);
                    }
                }
            }
            if (field499 != 0 && field491 % 20 < 10) {
                if (field499 == 1 && field500 >= 0 && field500 < field632.length) {
                    class25 var27 = field632[field500];
                    if (var27 != null) {
                        int var28 = var27.field429 / 32 - Statics.field139.field429 / 32;
                        int var29 = var27.field423 / 32 - Statics.field139.field423 / 32;
                        method121(arg0, arg1, var28, var29, Statics.field1666[1]);
                    }
                }
                if (field499 == 2) {
                    int var30 = field560 * 4 - Statics.field1518 * 4 + 2 - Statics.field139.field429 / 32;
                    int var31 = field602 * 4 - Statics.field1830 * 4 + 2 - Statics.field139.field423 / 32;
                    method121(arg0, arg1, var30, var31, Statics.field1666[1]);
                }
                if (field499 == 10 && field501 >= 0 && field501 < field604.length) {
                    class3 var32 = field604[field501];
                    if (var32 != null) {
                        int var33 = var32.field429 / 32 - Statics.field139.field429 / 32;
                        int var34 = var32.field423 / 32 - Statics.field139.field423 / 32;
                        method121(arg0, arg1, var33, var34, Statics.field1666[1]);
                    }
                }
            }
            if (field716 != 0) {
                int var35 = field716 * 4 + 2 - Statics.field139.field429 / 32;
                int var36 = field717 * 4 + 2 - Statics.field139.field423 / 32;
                Statics.method36(arg0, arg1, var35, var36, Statics.field1666[0]);
            }
            class89.method1796(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field718 < 3) {
            Statics.field1329.method1692(arg0, arg1, 33, 33, 25, 25, field570, 256, Statics.field2461, Statics.field562);
        } else {
            class89.method1837(arg0, arg1, 0, Statics.field2461, Statics.field562);
        }
        if (field689[arg2]) {
            Statics.field1835.method1781(arg0, arg1);
        }
        field688[arg2] = true;
    }

    @ObfuscatedName("l.cb(IIIILcx;B)V")
    public static final void method121(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            Statics.method36(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field570 + field555 & 0x7FF;
        int var7 = class104.field1787[var6];
        int var8 = class104.field1788[var6];
        int var9 = var7 * 256 / (field557 + 256);
        int var10 = var8 * 256 / (field557 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field376.method1693(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("q.co(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method224(int arg0, String arg1, String arg2) {
        method240(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("y.cn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method240(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field695[var4] = field695[var4 - 1];
            field696[var4] = field696[var4 - 1];
            field698[var4] = field698[var4 - 1];
            field697[var4] = field697[var4 - 1];
        }
        field695[0] = arg0;
        field696[0] = arg1;
        field698[0] = arg2;
        field697[0] = arg3;
        field581++;
        field483 = field682;
    }

    @ObfuscatedName("j.ce(Ljava/lang/String;I)Z")
    public static boolean method192(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method122(arg0, Statics.field76);
        for (int var2 = 0; var2 < field737; var2++) {
            if (var1.equalsIgnoreCase(class148.method122(field533[var2].field382, Statics.field76))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class148.method122(Statics.field139.field36, Statics.field76))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("p.cv(Ljava/lang/String;I)Z")
    public static boolean method46(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method122(arg0, Statics.field76);
        for (int var2 = 0; var2 < field535; var2++) {
            class11 var3 = field742[var2];
            if (var1.equalsIgnoreCase(class148.method122(var3.field178, Statics.field76))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method122(var3.field179, Statics.field76))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("y.df(Ljava/lang/String;I)V")
    public static final void method243(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field737 < 200 || field611 == 1) || field737 >= 400) {
            method224(0, "", class134.field2107);
            return;
        }
        String var1 = class148.method122(arg0, Statics.field76);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field737; var2++) {
            class23 var3 = field533[var2];
            String var4 = class148.method122(var3.field382, Statics.field76);
            if (var4 != null && var4.equals(var1)) {
                method224(0, "", arg0 + class134.field2294);
                return;
            }
            if (var3.field370 != null) {
                String var5 = class148.method122(var3.field370, Statics.field76);
                if (var5 != null && var5.equals(var1)) {
                    method224(0, "", arg0 + class134.field2294);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field535; var6++) {
            class11 var7 = field742[var6];
            String var8 = class148.method122(var7.field178, Statics.field76);
            if (var8 != null && var8.equals(var1)) {
                method224(0, "", class134.field2137 + arg0 + class134.field2255);
                return;
            }
            if (var7.field179 != null) {
                String var9 = class148.method122(var7.field179, Statics.field76);
                if (var9 != null && var9.equals(var1)) {
                    method224(0, "", class134.field2137 + arg0 + class134.field2255);
                    return;
                }
            }
        }
        if (class148.method122(Statics.field139.field36, Statics.field76).equals(var1)) {
            method224(0, "", class134.field2295);
            return;
        }
        field520.method2325(10);
        class116 var10 = field520;
        int var11 = arg0.length() + 1;
        var10.method2438(var11);
        field520.method2443(arg0);
    }

    @ObfuscatedName("y.dt(Ljava/lang/String;I)V")
    public static final void method244(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class148.method122(arg0, Statics.field76);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field737; var2++) {
            class23 var3 = field533[var2];
            String var4 = var3.field382;
            String var5 = class148.method122(var4, Statics.field76);
            if (class136.method576(arg0, var1, var4, var5)) {
                field737--;
                for (int var6 = var2; var6 < field737; var6++) {
                    field533[var6] = field533[var6 + 1];
                }
                field675 = field682;
                field520.method2325(197);
                class116 var7 = field520;
                int var8 = arg0.length() + 1;
                var7.method2438(var8);
                field520.method2443(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("d.dy(Ljava/lang/String;I)V")
    public static final void method41(String arg0) {
        if (Statics.field1027 == null) {
            return;
        }
        field520.method2325(209);
        class116 var1 = field520;
        int var2 = arg0.length() + 1;
        var1.method2438(var2);
        field520.method2443(arg0);
    }

    @ObfuscatedName("b.dk(I)V")
    public static final void method236() {
        field520.method2325(8);
        field520.method2438(0);
    }

    @ObfuscatedName("bn.de(Lfr;I)I")
    public static int method1225(class158 arg0) {
        class171 var1 = (class171) field684.method3273(((long) arg0.field2640 << 32) + (long) arg0.field2620);
        return var1 == null ? arg0.field2645 : var1.field2800;
    }

    @ObfuscatedName("ez.do(Lfr;B)Z")
    public static boolean method3083(class158 arg0) {
        if (field653) {
            if (method1225(arg0) != 0) {
                return false;
            }
            if (arg0.field2665 == 0) {
                return false;
            }
        }
        return arg0.field2589;
    }

    @ObfuscatedName("k.db(Lfr;IB)Ljava/lang/String;")
    public static String method59(class158 arg0, int arg1) {
        int var2 = method1225(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2636 == null) {
            return null;
        } else if (arg0.field2599 == null || arg0.field2599.length <= arg1 || arg0.field2599[arg1] == null || arg0.field2599[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2599[arg1];
        }
    }

    @ObfuscatedName("dl.dx(Lfr;B)Ljava/lang/String;")
    public static String method2356(class158 arg0) {
        if (class162.method882(method1225(arg0)) == 0) {
            return null;
        } else if (arg0.field2643 == null || arg0.field2643.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2643;
        }
    }
}
